package org.jsoup.nodes;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = "value";
    Object v1 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0));
    Object v2 = ">";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = "value";
    Object v1 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0));
    Object v2 = ">";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v3).previousElementSibling();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = "value";
    Object v1 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0));
    Object v2 = ">";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = 23;
    Object v5 = ((org.jsoup.nodes.Element)v3).getElementsByIndexLessThan((((java.lang.Integer)v4).intValue()));
    Object v6 = "";
    Object v7 = ((org.jsoup.nodes.Element)v3).toggleClass(((java.lang.String)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = "value";
    Object v1 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).data();
    org.junit.Assert.assertEquals((Object)(""), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = "value";
    Object v1 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).hashCode();
    org.junit.Assert.assertEquals((Object)(753707963), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = "value";
    Object v1 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0));
    Object v2 = ">";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "Unknown combina}or: ";
    Object v5 = ((org.jsoup.nodes.Element)v3).prepend(((java.lang.String)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = "value";
    Object v1 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0));
    Object v2 = ">";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "Unknown combina}or: ";
    Object v5 = ((org.jsoup.nodes.Element)v3).prepend(((java.lang.String)v4));
    Object v6 = "";
    Object v7 = ((org.jsoup.nodes.Node)v5).absUrl(((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = "value";
    Object v1 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0));
    Object v2 = ">";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "width";
    Object v5 = ((org.jsoup.nodes.Element)v3).prepend(((java.lang.String)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = "value";
    Object v1 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0));
    Object v2 = ">";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "width";
    Object v5 = ((org.jsoup.nodes.Element)v3).prepend(((java.lang.String)v4));
    Object v6 = "i";
    Object v7 = ((org.jsoup.nodes.Element)v5).append(((java.lang.String)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = "value";
    Object v1 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0));
    Object v2 = ">";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "width";
    Object v5 = ((org.jsoup.nodes.Element)v3).prepend(((java.lang.String)v4));
    Object v6 = "i";
    Object v7 = ((org.jsoup.nodes.Element)v5).append(((java.lang.String)v6));
    Object v8 = "value";
    Object v9 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v8));
    Object v10 = ((org.jsoup.nodes.Element)v9).data();
    Object v11 = new java.lang.StringBuilder(((java.lang.CharSequence)v10));
    ((org.jsoup.nodes.Element)v7).outerHtml(((java.lang.StringBuilder)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = "value";
    Object v1 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0));
    Object v2 = ">";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "width";
    Object v5 = ((org.jsoup.nodes.Element)v3).prepend(((java.lang.String)v4));
    Object v6 = "";
    Object v7 = ((org.jsoup.nodes.Element)v5).hasClass(((java.lang.String)v6));
    Object v8 = "value";
    Object v9 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v8));
    Object v10 = ((org.jsoup.nodes.Element)v9).data();
    Object v11 = new java.lang.StringBuilder(((java.lang.CharSequence)v10));
    Object v12 = ((org.jsoup.nodes.Element)v5).equals(((java.lang.Object)v11));
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = "value";
    Object v1 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0));
    Object v2 = ">";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "width";
    Object v5 = ((org.jsoup.nodes.Element)v3).prepend(((java.lang.String)v4));
    Object v6 = "i";
    Object v7 = ((org.jsoup.nodes.Element)v5).append(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Element)v7).hasText();
    Object v9 = ((org.jsoup.nodes.Element)v7).classNames();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = "value";
    Object v1 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0));
    Object v2 = ">";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "width";
    Object v5 = ((org.jsoup.nodes.Element)v3).prepend(((java.lang.String)v4));
    Object v6 = "i";
    Object v7 = ((org.jsoup.nodes.Element)v5).append(((java.lang.String)v6));
    Object v8 = "width";
    Object v9 = ((org.jsoup.nodes.Element)v7).addClass(((java.lang.String)v8));
    Object v10 = ((org.jsoup.nodes.Element)v7).toString();
    org.junit.Assert.assertEquals((Object)("width\n<html>\n<head>\n</head>\n<body>\n value\n</body>\n</html>i"), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = "value";
    Object v1 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0));
    Object v2 = ">";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "width";
    Object v5 = ((org.jsoup.nodes.Element)v3).prepend(((java.lang.String)v4));
    Object v6 = "i";
    Object v7 = ((org.jsoup.nodes.Element)v5).append(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Element)v7).hasText();
    org.junit.Assert.assertEquals((Object)(true), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = "value";
    Object v1 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0));
    Object v2 = ">";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "width";
    Object v5 = ((org.jsoup.nodes.Element)v3).prepend(((java.lang.String)v4));
    Object v6 = "i";
    Object v7 = ((org.jsoup.nodes.Element)v5).append(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Element)v7).preserveWhitespace();
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = "value";
    Object v1 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0));
    Object v2 = ">";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "width";
    Object v5 = ((org.jsoup.nodes.Element)v3).prepend(((java.lang.String)v4));
    Object v6 = "i";
    Object v7 = ((org.jsoup.nodes.Element)v5).append(((java.lang.String)v6));
    Object v8 = "";
    Object v9 = ((org.jsoup.nodes.Element)v7).html(((java.lang.String)v8));
    Object v10 = " ";
    Object v11 = ((org.jsoup.nodes.Element)v7).getElementsByTag(((java.lang.String)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = "value";
    Object v1 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0));
    Object v2 = ">";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "width";
    Object v5 = ((org.jsoup.nodes.Element)v3).prepend(((java.lang.String)v4));
    Object v6 = "i";
    Object v7 = ((org.jsoup.nodes.Element)v5).append(((java.lang.String)v6));
    Object v8 = "s";
    ((org.jsoup.nodes.Node)v7).setBaseUri(((java.lang.String)v8));
    Object v9 = null;
    Object v10 = "axi";
    Object v11 = "-";
    Object v12 = ((org.jsoup.nodes.Element)v7).getElementsByAttributeValue(((java.lang.String)v10),((java.lang.String)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = "value";
    Object v1 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0));
    Object v2 = ">";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "width";
    Object v5 = ((org.jsoup.nodes.Element)v3).prepend(((java.lang.String)v4));
    Object v6 = "i";
    Object v7 = ((org.jsoup.nodes.Element)v5).append(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v7).childNodes();
    Object v9 = " ";
    Object v10 = ((org.jsoup.nodes.Node)v7).removeAttr(((java.lang.String)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = "value";
    Object v1 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0));
    Object v2 = ">";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "Unknown combina}or: ";
    Object v5 = ((org.jsoup.nodes.Element)v3).prepend(((java.lang.String)v4));
    Object v6 = "value";
    Object v7 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Element)v7).data();
    Object v9 = new java.lang.StringBuilder(((java.lang.CharSequence)v8));
    ((org.jsoup.nodes.Element)v5).outerHtml(((java.lang.StringBuilder)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = "value";
    Object v1 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0));
    Object v2 = ">";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "Unknown combina}or: ";
    Object v5 = ((org.jsoup.nodes.Element)v3).prepend(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Element)v5).isBlock();
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = "value";
    Object v1 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0));
    Object v2 = ">";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "width";
    Object v5 = ((org.jsoup.nodes.Element)v3).prepend(((java.lang.String)v4));
    Object v6 = "i";
    Object v7 = ((org.jsoup.nodes.Element)v5).append(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v7).childNodes();
    Object v9 = " ";
    Object v10 = ((org.jsoup.nodes.Node)v7).removeAttr(((java.lang.String)v9));
    Object v11 = ((org.jsoup.nodes.Element)v10).children();
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = "value";
    Object v1 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0));
    Object v2 = ">";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "width";
    Object v5 = ((org.jsoup.nodes.Element)v3).prepend(((java.lang.String)v4));
    Object v6 = "HT$L";
    Object v7 = ((org.jsoup.nodes.Element)v5).getElementById(((java.lang.String)v6));
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = "value";
    Object v1 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0));
    Object v2 = ">";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "width";
    Object v5 = ((org.jsoup.nodes.Element)v3).prepend(((java.lang.String)v4));
    Object v6 = "i";
    Object v7 = ((org.jsoup.nodes.Element)v5).append(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v7).childNodes();
    Object v9 = " ";
    Object v10 = ((org.jsoup.nodes.Node)v7).removeAttr(((java.lang.String)v9));
    Object v11 = ((org.jsoup.nodes.Element)v10).nextElementSibling();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = "value";
    Object v1 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0));
    Object v2 = ">";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "width";
    Object v5 = ((org.jsoup.nodes.Element)v3).prepend(((java.lang.String)v4));
    Object v6 = "i";
    Object v7 = ((org.jsoup.nodes.Element)v5).append(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v7).childNodes();
    Object v9 = " ";
    Object v10 = ((org.jsoup.nodes.Node)v7).removeAttr(((java.lang.String)v9));
    Object v11 = "";
    Object v12 = ((org.jsoup.nodes.Element)v10).removeClass(((java.lang.String)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = "value";
    Object v1 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0));
    Object v2 = ">";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "width";
    Object v5 = ((org.jsoup.nodes.Element)v3).prepend(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Element)v5).val();
    org.junit.Assert.assertEquals((Object)(""), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = "value";
    Object v1 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0));
    Object v2 = ">";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = 23;
    Object v5 = ((org.jsoup.nodes.Element)v3).getElementsByIndexLessThan((((java.lang.Integer)v4).intValue()));
    Object v6 = "";
    Object v7 = ((org.jsoup.nodes.Element)v3).toggleClass(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Element)v7).nextElementSibling();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = "value";
    Object v1 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0));
    Object v2 = ">";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "width";
    Object v5 = ((org.jsoup.nodes.Element)v3).prepend(((java.lang.String)v4));
    Object v6 = "i";
    Object v7 = ((org.jsoup.nodes.Element)v5).append(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v7).childNodes();
    Object v9 = " ";
    Object v10 = ((org.jsoup.nodes.Node)v7).removeAttr(((java.lang.String)v9));
    Object v11 = "";
    Object v12 = ((org.jsoup.nodes.Element)v10).removeClass(((java.lang.String)v11));
    Object v13 = ((org.jsoup.nodes.Node)v12).nodeName();
    Object v14 = ((org.jsoup.nodes.Node)v12).previousSibling();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = "value";
    Object v1 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0));
    Object v2 = ">";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "width";
    Object v5 = ((org.jsoup.nodes.Element)v3).prepend(((java.lang.String)v4));
    Object v6 = "i";
    Object v7 = ((org.jsoup.nodes.Element)v5).append(((java.lang.String)v6));
    Object v8 = "dd";
    Object v9 = ((org.jsoup.nodes.Element)v7).prepend(((java.lang.String)v8));
    Object v10 = "<-";
    Object v11 = ((org.jsoup.nodes.Element)v7).toggleClass(((java.lang.String)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = "value";
    Object v1 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0));
    Object v2 = ">";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "width";
    Object v5 = ((org.jsoup.nodes.Element)v3).prepend(((java.lang.String)v4));
    Object v6 = "i";
    Object v7 = ((org.jsoup.nodes.Element)v5).append(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v7).childNodes();
    Object v9 = " ";
    Object v10 = ((org.jsoup.nodes.Node)v7).removeAttr(((java.lang.String)v9));
    Object v11 = "";
    Object v12 = ((org.jsoup.nodes.Element)v10).removeClass(((java.lang.String)v11));
    Object v13 = ((org.jsoup.nodes.Element)v12).firstElementSibling();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = "value";
    Object v1 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0));
    Object v2 = ">";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "width";
    Object v5 = ((org.jsoup.nodes.Element)v3).prepend(((java.lang.String)v4));
    Object v6 = "i";
    Object v7 = ((org.jsoup.nodes.Element)v5).append(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v7).childNodes();
    Object v9 = " ";
    Object v10 = ((org.jsoup.nodes.Node)v7).removeAttr(((java.lang.String)v9));
    Object v11 = ((org.jsoup.nodes.Element)v10).tag();
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = "value";
    Object v1 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0));
    Object v2 = ">";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "width";
    Object v5 = ((org.jsoup.nodes.Element)v3).prepend(((java.lang.String)v4));
    Object v6 = "i";
    Object v7 = ((org.jsoup.nodes.Element)v5).append(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v7).childNodes();
    Object v9 = " ";
    Object v10 = ((org.jsoup.nodes.Node)v7).removeAttr(((java.lang.String)v9));
    Object v11 = "value";
    Object v12 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v11));
    Object v13 = ">";
    Object v14 = ((org.jsoup.nodes.Element)v12).toggleClass(((java.lang.String)v13));
    Object v15 = "width";
    Object v16 = ((org.jsoup.nodes.Element)v14).prepend(((java.lang.String)v15));
    Object v17 = "i";
    Object v18 = ((org.jsoup.nodes.Element)v16).append(((java.lang.String)v17));
    Object v19 = ((org.jsoup.nodes.Element)v18).hasText();
    Object v20 = ((org.jsoup.nodes.Element)v18).classNames();
    Object v21 = ((org.jsoup.nodes.Element)v10).classNames(((java.util.Set)v20));
    Object v22 = ((org.jsoup.nodes.Element)v10).className();
    org.junit.Assert.assertEquals((Object)(" >"), v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = "value";
    Object v1 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0));
    Object v2 = ">";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "width";
    Object v5 = ((org.jsoup.nodes.Element)v3).prepend(((java.lang.String)v4));
    Object v6 = "i";
    Object v7 = ((org.jsoup.nodes.Element)v5).append(((java.lang.String)v6));
    Object v8 = "dd";
    Object v9 = ((org.jsoup.nodes.Element)v7).prepend(((java.lang.String)v8));
    Object v10 = "<-";
    Object v11 = ((org.jsoup.nodes.Element)v7).toggleClass(((java.lang.String)v10));
    Object v12 = "value";
    Object v13 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v12));
    Object v14 = ">";
    Object v15 = ((org.jsoup.nodes.Element)v13).toggleClass(((java.lang.String)v14));
    Object v16 = "width";
    Object v17 = ((org.jsoup.nodes.Element)v15).prepend(((java.lang.String)v16));
    Object v18 = "i";
    Object v19 = ((org.jsoup.nodes.Element)v17).append(((java.lang.String)v18));
    Object v20 = ((org.jsoup.nodes.Element)v19).hasText();
    Object v21 = ((org.jsoup.nodes.Element)v19).classNames();
    Object v22 = ((org.jsoup.nodes.Element)v11).classNames(((java.util.Set)v21));
    Object v23 = ((org.jsoup.nodes.Element)v11).className();
    org.junit.Assert.assertEquals((Object)(" >"), v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = "value";
    Object v1 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0));
    Object v2 = ">";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "https";
    Object v5 = ((org.jsoup.nodes.Element)v3).prependText(((java.lang.String)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = "value";
    Object v1 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0));
    Object v2 = ">";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "width";
    Object v5 = ((org.jsoup.nodes.Element)v3).prepend(((java.lang.String)v4));
    Object v6 = "i";
    Object v7 = ((org.jsoup.nodes.Element)v5).append(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v7).childNodes();
    Object v9 = " ";
    Object v10 = ((org.jsoup.nodes.Node)v7).removeAttr(((java.lang.String)v9));
    Object v11 = "";
    Object v12 = ((org.jsoup.nodes.Element)v10).removeClass(((java.lang.String)v11));
    Object v13 = "";
    Object v14 = "T";
    Object v15 = ((org.jsoup.nodes.Element)v12).attr(((java.lang.String)v13),((java.lang.String)v14));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = "value";
    Object v1 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0));
    Object v2 = ">";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "https";
    Object v5 = ((org.jsoup.nodes.Element)v3).prependText(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Element)v5).data();
    org.junit.Assert.assertEquals((Object)(""), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = "value";
    Object v1 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0));
    Object v2 = ">";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "width";
    Object v5 = ((org.jsoup.nodes.Element)v3).prepend(((java.lang.String)v4));
    Object v6 = "i";
    Object v7 = ((org.jsoup.nodes.Element)v5).append(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v7).childNodes();
    Object v9 = " ";
    Object v10 = ((org.jsoup.nodes.Node)v7).removeAttr(((java.lang.String)v9));
    Object v11 = "";
    Object v12 = ((org.jsoup.nodes.Element)v10).removeClass(((java.lang.String)v11));
    Object v13 = "HEAD";
    Object v14 = ((org.jsoup.nodes.Element)v12).toggleClass(((java.lang.String)v13));
    Object v15 = "TT";
    Object v16 = ((org.jsoup.nodes.Element)v12).append(((java.lang.String)v15));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = "value";
    Object v1 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0));
    Object v2 = ">";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "width";
    Object v5 = ((org.jsoup.nodes.Element)v3).prepend(((java.lang.String)v4));
    Object v6 = "i";
    Object v7 = ((org.jsoup.nodes.Element)v5).append(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v7).childNodes();
    Object v9 = " ";
    Object v10 = ((org.jsoup.nodes.Node)v7).removeAttr(((java.lang.String)v9));
    Object v11 = "";
    Object v12 = ((org.jsoup.nodes.Element)v10).removeClass(((java.lang.String)v11));
    Object v13 = "HEAD";
    Object v14 = ((org.jsoup.nodes.Element)v12).toggleClass(((java.lang.String)v13));
    Object v15 = "TT";
    Object v16 = ((org.jsoup.nodes.Element)v12).append(((java.lang.String)v15));
    Object v17 = ((org.jsoup.nodes.Node)v16).outerHtml();
    org.junit.Assert.assertEquals((Object)("width\n<html>\n<head>\n</head>\n<body>\n value\n</body>\n</html>iTT"), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = "value";
    Object v1 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0));
    Object v2 = ">";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "https";
    Object v5 = ((org.jsoup.nodes.Element)v3).prependText(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Element)v5).className();
    org.junit.Assert.assertEquals((Object)(" >"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = "value";
    Object v1 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0));
    Object v2 = ">";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "width";
    Object v5 = ((org.jsoup.nodes.Element)v3).prepend(((java.lang.String)v4));
    Object v6 = "i";
    Object v7 = ((org.jsoup.nodes.Element)v5).append(((java.lang.String)v6));
    Object v8 = "dd";
    Object v9 = ((org.jsoup.nodes.Element)v7).prepend(((java.lang.String)v8));
    Object v10 = "<-";
    Object v11 = ((org.jsoup.nodes.Element)v7).toggleClass(((java.lang.String)v10));
    Object v12 = ((org.jsoup.nodes.Element)v11).html();
    Object v13 = ((org.jsoup.nodes.Element)v11).lastElementSibling();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = "value";
    Object v1 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0));
    Object v2 = ">";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "https";
    Object v5 = ((org.jsoup.nodes.Element)v3).prependText(((java.lang.String)v4));
    Object v6 = "_";
    Object v7 = ((org.jsoup.nodes.Node)v5).attr(((java.lang.String)v6));
    org.junit.Assert.assertEquals((Object)(""), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = "value";
    Object v1 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0));
    Object v2 = ">";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "https";
    Object v5 = ((org.jsoup.nodes.Element)v3).prependText(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Element)v5).hasText();
    org.junit.Assert.assertEquals((Object)(true), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = "value";
    Object v1 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0));
    Object v2 = ">";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "width";
    Object v5 = ((org.jsoup.nodes.Element)v3).prepend(((java.lang.String)v4));
    Object v6 = "i";
    Object v7 = ((org.jsoup.nodes.Element)v5).append(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v7).childNodes();
    Object v9 = " ";
    Object v10 = ((org.jsoup.nodes.Node)v7).removeAttr(((java.lang.String)v9));
    Object v11 = ((org.jsoup.nodes.Element)v10).empty();
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = "value";
    Object v1 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0));
    Object v2 = ">";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "https";
    Object v5 = ((org.jsoup.nodes.Element)v3).prependText(((java.lang.String)v4));
    Object v6 = "rel";
    Object v7 = ((org.jsoup.nodes.Element)v5).val(((java.lang.String)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = "value";
    Object v1 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0));
    Object v2 = ">";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "https";
    Object v5 = ((org.jsoup.nodes.Element)v3).prependText(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Element)v5).lastElementSibling();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = "value";
    Object v1 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0));
    Object v2 = ">";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "https";
    Object v5 = ((org.jsoup.nodes.Element)v3).prependText(((java.lang.String)v4));
    Object v6 = "rel";
    Object v7 = ((org.jsoup.nodes.Element)v5).val(((java.lang.String)v6));
    Object v8 = "blockquo4te";
    Object v9 = ((org.jsoup.nodes.Node)v7).absUrl(((java.lang.String)v8));
    org.junit.Assert.assertEquals((Object)(""), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = "value";
    Object v1 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0));
    Object v2 = ">";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "https";
    Object v5 = ((org.jsoup.nodes.Element)v3).prependText(((java.lang.String)v4));
    Object v6 = 0;
    Object v7 = ((org.jsoup.nodes.Element)v5).getElementsByIndexGreaterThan((((java.lang.Integer)v6).intValue()));
    Object v8 = "#ro";
    Object v9 = ((org.jsoup.nodes.Element)v5).val(((java.lang.String)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = "value";
    Object v1 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0));
    Object v2 = ">";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "https";
    Object v5 = ((org.jsoup.nodes.Element)v3).prependText(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Element)v5).firstElementSibling();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = "value";
    Object v1 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0));
    Object v2 = ">";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "https";
    Object v5 = ((org.jsoup.nodes.Element)v3).prependText(((java.lang.String)v4));
    Object v6 = "cite";
    Object v7 = ((org.jsoup.nodes.Element)v5).val(((java.lang.String)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = "value";
    Object v1 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0));
    Object v2 = ">";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "https";
    Object v5 = ((org.jsoup.nodes.Element)v3).prependText(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Element)v5).id();
    org.junit.Assert.assertEquals((Object)(""), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = "value";
    Object v1 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0));
    Object v2 = ">";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "https";
    Object v5 = ((org.jsoup.nodes.Element)v3).prependText(((java.lang.String)v4));
    Object v6 = "value";
    Object v7 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v6));
    Object v8 = ">";
    Object v9 = ((org.jsoup.nodes.Element)v7).toggleClass(((java.lang.String)v8));
    Object v10 = "width";
    Object v11 = ((org.jsoup.nodes.Element)v9).prepend(((java.lang.String)v10));
    Object v12 = "i";
    Object v13 = ((org.jsoup.nodes.Element)v11).append(((java.lang.String)v12));
    Object v14 = ((org.jsoup.nodes.Node)v13).childNodes();
    Object v15 = " ";
    Object v16 = ((org.jsoup.nodes.Node)v13).removeAttr(((java.lang.String)v15));
    Object v17 = ((org.jsoup.nodes.Element)v5).equals(((java.lang.Object)v16));
    org.junit.Assert.assertEquals((Object)(false), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = "value";
    Object v1 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0));
    Object v2 = ">";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "https";
    Object v5 = ((org.jsoup.nodes.Element)v3).prependText(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Element)v5).classNames();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = "value";
    Object v1 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0));
    Object v2 = ">";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "https";
    Object v5 = ((org.jsoup.nodes.Element)v3).prependText(((java.lang.String)v4));
    Object v6 = "}";
    Object v7 = ((org.jsoup.nodes.Element)v5).toggleClass(((java.lang.String)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = "value";
    Object v1 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0));
    Object v2 = ">";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "https";
    Object v5 = ((org.jsoup.nodes.Element)v3).prependText(((java.lang.String)v4));
    Object v6 = "rel";
    Object v7 = ((org.jsoup.nodes.Element)v5).val(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v7).nextSibling();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = "value";
    Object v1 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0));
    Object v2 = ">";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "https";
    Object v5 = ((org.jsoup.nodes.Element)v3).prependText(((java.lang.String)v4));
    Object v6 = "TABE";
    Object v7 = ((org.jsoup.nodes.Node)v5).removeAttr(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v5).previousSibling();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = "value";
    Object v1 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0));
    Object v2 = ">";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "https";
    Object v5 = ((org.jsoup.nodes.Element)v3).prependText(((java.lang.String)v4));
    Object v6 = "scope";
    Object v7 = "~";
    Object v8 = ((org.jsoup.nodes.Element)v5).getElementsByAttributeValueStarting(((java.lang.String)v6),((java.lang.String)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = "value";
    Object v1 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0));
    Object v2 = ">";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "https";
    Object v5 = ((org.jsoup.nodes.Element)v3).prependText(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Node)v5).childNodes();
    Object v7 = "align";
    Object v8 = ((org.jsoup.nodes.Element)v5).val(((java.lang.String)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = "value";
    Object v1 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0));
    Object v2 = ">";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "https";
    Object v5 = ((org.jsoup.nodes.Element)v3).prependText(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Node)v5).childNodes();
    Object v7 = "align";
    Object v8 = ((org.jsoup.nodes.Element)v5).val(((java.lang.String)v7));
    Object v9 = ((org.jsoup.nodes.Element)v8).hashCode();
    Object v10 = ((org.jsoup.nodes.Element)v8).hashCode();
    org.junit.Assert.assertEquals((Object)(1563909240), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = "value";
    Object v1 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0));
    Object v2 = ">";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "https";
    Object v5 = ((org.jsoup.nodes.Element)v3).prependText(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Node)v5).outerHtml();
    Object v7 = "theaF";
    ((org.jsoup.nodes.Node)v5).setBaseUri(((java.lang.String)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = "value";
    Object v1 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0));
    Object v2 = ">";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "https";
    Object v5 = ((org.jsoup.nodes.Element)v3).prependText(((java.lang.String)v4));
    Object v6 = "cite";
    Object v7 = ((org.jsoup.nodes.Element)v5).val(((java.lang.String)v6));
    Object v8 = "hea";
    Object v9 = ((org.jsoup.nodes.Element)v7).addClass(((java.lang.String)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = "value";
    Object v1 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0));
    Object v2 = ">";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "https";
    Object v5 = ((org.jsoup.nodes.Element)v3).prependText(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Node)v5).childNodes();
    Object v7 = "align";
    Object v8 = ((org.jsoup.nodes.Element)v5).val(((java.lang.String)v7));
    Object v9 = "dt";
    Object v10 = ((org.jsoup.nodes.Element)v8).getElementsByTag(((java.lang.String)v9));
    Object v11 = ((org.jsoup.nodes.Element)v8).val();
    org.junit.Assert.assertEquals((Object)("align"), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = "value";
    Object v1 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0));
    Object v2 = ">";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "https";
    Object v5 = ((org.jsoup.nodes.Element)v3).prependText(((java.lang.String)v4));
    Object v6 = "value";
    Object v7 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v6));
    Object v8 = ">";
    Object v9 = ((org.jsoup.nodes.Element)v7).toggleClass(((java.lang.String)v8));
    Object v10 = "https";
    Object v11 = ((org.jsoup.nodes.Element)v9).prependText(((java.lang.String)v10));
    Object v12 = ((org.jsoup.nodes.Element)v11).hasText();
    Object v13 = ((org.jsoup.nodes.Element)v5).equals(((java.lang.Object)v12));
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = "value";
    Object v1 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0));
    Object v2 = ">";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "https";
    Object v5 = ((org.jsoup.nodes.Element)v3).prependText(((java.lang.String)v4));
    Object v6 = "value";
    Object v7 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v6));
    Object v8 = ">";
    Object v9 = ((org.jsoup.nodes.Element)v7).toggleClass(((java.lang.String)v8));
    Object v10 = "https";
    Object v11 = ((org.jsoup.nodes.Element)v9).prependText(((java.lang.String)v10));
    Object v12 = ((org.jsoup.nodes.Element)v5).prependChild(((org.jsoup.nodes.Node)v11));
    Object v13 = "value";
    Object v14 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v13));
    Object v15 = ((org.jsoup.nodes.Element)v14).data();
    Object v16 = new java.lang.StringBuilder(((java.lang.CharSequence)v15));
    ((org.jsoup.nodes.Element)v5).outerHtml(((java.lang.StringBuilder)v16));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = "value";
    Object v1 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0));
    Object v2 = ">";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "width";
    Object v5 = ((org.jsoup.nodes.Element)v3).prepend(((java.lang.String)v4));
    Object v6 = "i";
    Object v7 = ((org.jsoup.nodes.Element)v5).append(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v7).childNodes();
    Object v9 = " ";
    Object v10 = ((org.jsoup.nodes.Node)v7).removeAttr(((java.lang.String)v9));
    Object v11 = ((org.jsoup.nodes.Element)v10).empty();
    Object v12 = ((org.jsoup.nodes.Element)v11).children();
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = "value";
    Object v1 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0));
    Object v2 = ">";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "https";
    Object v5 = ((org.jsoup.nodes.Element)v3).prependText(((java.lang.String)v4));
    Object v6 = "rel";
    Object v7 = ((org.jsoup.nodes.Element)v5).val(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Element)v7).hashCode();
    org.junit.Assert.assertEquals((Object)(414411140), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = "value";
    Object v1 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0));
    Object v2 = ">";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "https";
    Object v5 = ((org.jsoup.nodes.Element)v3).prependText(((java.lang.String)v4));
    Object v6 = "Qetching %s...";
    Object v7 = ((org.jsoup.nodes.Element)v5).append(((java.lang.String)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = "value";
    Object v1 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0));
    Object v2 = ">";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "https";
    Object v5 = ((org.jsoup.nodes.Element)v3).prependText(((java.lang.String)v4));
    Object v6 = "}";
    Object v7 = ((org.jsoup.nodes.Element)v5).toggleClass(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Element)v7).preserveWhitespace();
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = "value";
    Object v1 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0));
    Object v2 = ">";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "https";
    Object v5 = ((org.jsoup.nodes.Element)v3).prependText(((java.lang.String)v4));
    Object v6 = "}";
    Object v7 = ((org.jsoup.nodes.Element)v5).toggleClass(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Element)v7).lastElementSibling();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = "value";
    Object v1 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0));
    Object v2 = ">";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "width";
    Object v5 = ((org.jsoup.nodes.Element)v3).prepend(((java.lang.String)v4));
    Object v6 = "i";
    Object v7 = ((org.jsoup.nodes.Element)v5).append(((java.lang.String)v6));
    Object v8 = "dd";
    Object v9 = ((org.jsoup.nodes.Element)v7).prepend(((java.lang.String)v8));
    Object v10 = "<-";
    Object v11 = ((org.jsoup.nodes.Element)v7).toggleClass(((java.lang.String)v10));
    Object v12 = "aBt";
    Object v13 = ((org.jsoup.nodes.Node)v11).removeAttr(((java.lang.String)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = "value";
    Object v1 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0));
    Object v2 = ">";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "https";
    Object v5 = ((org.jsoup.nodes.Element)v3).prependText(((java.lang.String)v4));
    Object v6 = 0;
    Object v7 = ((org.jsoup.nodes.Element)v5).getElementsByIndexGreaterThan((((java.lang.Integer)v6).intValue()));
    Object v8 = "#ro";
    Object v9 = ((org.jsoup.nodes.Element)v5).val(((java.lang.String)v8));
    Object v10 = "value";
    Object v11 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v10));
    Object v12 = ">";
    Object v13 = ((org.jsoup.nodes.Element)v11).toggleClass(((java.lang.String)v12));
    Object v14 = "https";
    Object v15 = ((org.jsoup.nodes.Element)v13).prependText(((java.lang.String)v14));
    Object v16 = ((org.jsoup.nodes.Element)v9).appendChild(((org.jsoup.nodes.Node)v15));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = "value";
    Object v1 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0));
    Object v2 = ">";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "width";
    Object v5 = ((org.jsoup.nodes.Element)v3).prepend(((java.lang.String)v4));
    Object v6 = "i";
    Object v7 = ((org.jsoup.nodes.Element)v5).append(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v7).childNodes();
    Object v9 = " ";
    Object v10 = ((org.jsoup.nodes.Node)v7).removeAttr(((java.lang.String)v9));
    Object v11 = ((org.jsoup.nodes.Element)v10).tag();
    Object v12 = "K";
    Object v13 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v11),((java.lang.String)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = "value";
    Object v1 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0));
    Object v2 = ">";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "https";
    Object v5 = ((org.jsoup.nodes.Element)v3).prependText(((java.lang.String)v4));
    Object v6 = 0;
    Object v7 = ((org.jsoup.nodes.Element)v5).getElementsByIndexGreaterThan((((java.lang.Integer)v6).intValue()));
    Object v8 = "#ro";
    Object v9 = ((org.jsoup.nodes.Element)v5).val(((java.lang.String)v8));
    Object v10 = ((org.jsoup.nodes.Element)v9).elementSiblingIndex();
    org.junit.Assert.assertEquals((Object)(0), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = "value";
    Object v1 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0));
    Object v2 = ">";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "https";
    Object v5 = ((org.jsoup.nodes.Element)v3).prependText(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Node)v5).childNodes();
    Object v7 = "align";
    Object v8 = ((org.jsoup.nodes.Element)v5).val(((java.lang.String)v7));
    Object v9 = 1;
    Object v10 = ((org.jsoup.nodes.Node)v8).childNode((((java.lang.Integer)v9).intValue()));
    Object v11 = "citef";
    Object v12 = ((org.jsoup.nodes.Element)v8).hasClass(((java.lang.String)v11));
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = "value";
    Object v1 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0));
    Object v2 = ">";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "https";
    Object v5 = ((org.jsoup.nodes.Element)v3).prependText(((java.lang.String)v4));
    Object v6 = ":all";
    Object v7 = ((org.jsoup.nodes.Node)v5).attr(((java.lang.String)v6));
    org.junit.Assert.assertEquals((Object)(""), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = "value";
    Object v1 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0));
    Object v2 = ">";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = ">";
    Object v5 = ((org.jsoup.nodes.Element)v3).append(((java.lang.String)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = "value";
    Object v1 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0));
    Object v2 = ">";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "https";
    Object v5 = ((org.jsoup.nodes.Element)v3).prependText(((java.lang.String)v4));
    Object v6 = "Kb";
    Object v7 = ((org.jsoup.nodes.Node)v5).absUrl(((java.lang.String)v6));
    org.junit.Assert.assertEquals((Object)(""), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = "value";
    Object v1 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0));
    Object v2 = ">";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "https";
    Object v5 = ((org.jsoup.nodes.Element)v3).prependText(((java.lang.String)v4));
    Object v6 = 0;
    Object v7 = ((org.jsoup.nodes.Element)v5).getElementsByIndexGreaterThan((((java.lang.Integer)v6).intValue()));
    Object v8 = "#ro";
    Object v9 = ((org.jsoup.nodes.Element)v5).val(((java.lang.String)v8));
    Object v10 = "value";
    Object v11 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v10));
    Object v12 = ">";
    Object v13 = ((org.jsoup.nodes.Element)v11).toggleClass(((java.lang.String)v12));
    Object v14 = "https";
    Object v15 = ((org.jsoup.nodes.Element)v13).prependText(((java.lang.String)v14));
    Object v16 = ((org.jsoup.nodes.Element)v9).appendChild(((org.jsoup.nodes.Node)v15));
    Object v17 = "";
    Object v18 = ((org.jsoup.nodes.Element)v16).prepend(((java.lang.String)v17));
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = "value";
    Object v1 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0));
    Object v2 = ">";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "https";
    Object v5 = ((org.jsoup.nodes.Element)v3).prependText(((java.lang.String)v4));
    Object v6 = "bod";
    Object v7 = ((org.jsoup.nodes.Node)v5).attr(((java.lang.String)v6));
    org.junit.Assert.assertEquals((Object)(""), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = "value";
    Object v1 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0));
    Object v2 = ">";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "width";
    Object v5 = ((org.jsoup.nodes.Element)v3).prepend(((java.lang.String)v4));
    Object v6 = "i";
    Object v7 = ((org.jsoup.nodes.Element)v5).append(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v7).childNodes();
    Object v9 = " ";
    Object v10 = ((org.jsoup.nodes.Node)v7).removeAttr(((java.lang.String)v9));
    Object v11 = ((org.jsoup.nodes.Element)v10).empty();
    Object v12 = ((org.jsoup.nodes.Element)v11).hashCode();
    org.junit.Assert.assertEquals((Object)(-679041379), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = "value";
    Object v1 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0));
    Object v2 = ">";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "https";
    Object v5 = ((org.jsoup.nodes.Element)v3).prependText(((java.lang.String)v4));
    Object v6 = "Qetching %s...";
    Object v7 = ((org.jsoup.nodes.Element)v5).append(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Element)v7).isBlock();
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = "value";
    Object v1 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0));
    Object v2 = ">";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "width";
    Object v5 = ((org.jsoup.nodes.Element)v3).prepend(((java.lang.String)v4));
    Object v6 = "i";
    Object v7 = ((org.jsoup.nodes.Element)v5).append(((java.lang.String)v6));
    Object v8 = "dd";
    Object v9 = ((org.jsoup.nodes.Element)v7).prepend(((java.lang.String)v8));
    Object v10 = "<-";
    Object v11 = ((org.jsoup.nodes.Element)v7).toggleClass(((java.lang.String)v10));
    Object v12 = "aBt";
    Object v13 = ((org.jsoup.nodes.Node)v11).removeAttr(((java.lang.String)v12));
    Object v14 = "#root";
    Object v15 = "u";
    Object v16 = ((org.jsoup.nodes.Element)v13).getElementsByAttributeValue(((java.lang.String)v14),((java.lang.String)v15));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = "value";
    Object v1 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0));
    Object v2 = ">";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "https";
    Object v5 = ((org.jsoup.nodes.Element)v3).prependText(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Node)v5).childNodes();
    Object v7 = "align";
    Object v8 = ((org.jsoup.nodes.Element)v5).val(((java.lang.String)v7));
    Object v9 = ((org.jsoup.nodes.Node)v8).nextSibling();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = "value";
    Object v1 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0));
    Object v2 = ">";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "https";
    Object v5 = ((org.jsoup.nodes.Element)v3).prependText(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Node)v5).childNodes();
    Object v7 = "align";
    Object v8 = ((org.jsoup.nodes.Element)v5).val(((java.lang.String)v7));
    Object v9 = ((org.jsoup.nodes.Element)v8).data();
    org.junit.Assert.assertEquals((Object)(""), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = "value";
    Object v1 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0));
    Object v2 = ">";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "https";
    Object v5 = ((org.jsoup.nodes.Element)v3).prependText(((java.lang.String)v4));
    Object v6 = 0;
    Object v7 = ((org.jsoup.nodes.Element)v5).getElementsByIndexGreaterThan((((java.lang.Integer)v6).intValue()));
    Object v8 = "#ro";
    Object v9 = ((org.jsoup.nodes.Element)v5).val(((java.lang.String)v8));
    Object v10 = "7>";
    Object v11 = ((org.jsoup.nodes.Element)v9).append(((java.lang.String)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = "value";
    Object v1 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0));
    Object v2 = ">";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "width";
    Object v5 = ((org.jsoup.nodes.Element)v3).prepend(((java.lang.String)v4));
    Object v6 = "i";
    Object v7 = ((org.jsoup.nodes.Element)v5).append(((java.lang.String)v6));
    Object v8 = "dd";
    Object v9 = ((org.jsoup.nodes.Element)v7).prepend(((java.lang.String)v8));
    Object v10 = "<-";
    Object v11 = ((org.jsoup.nodes.Element)v7).toggleClass(((java.lang.String)v10));
    Object v12 = "";
    Object v13 = ((org.jsoup.nodes.Element)v11).toggleClass(((java.lang.String)v12));
    Object v14 = "head";
    Object v15 = ((org.jsoup.nodes.Element)v11).appendElement(((java.lang.String)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = "value";
    Object v1 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0));
    Object v2 = ">";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "https";
    Object v5 = ((org.jsoup.nodes.Element)v3).prependText(((java.lang.String)v4));
    Object v6 = "rel";
    Object v7 = ((org.jsoup.nodes.Element)v5).val(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Element)v7).nextElementSibling();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = "value";
    Object v1 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0));
    Object v2 = ">";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "https";
    Object v5 = ((org.jsoup.nodes.Element)v3).prependText(((java.lang.String)v4));
    Object v6 = "!=";
    Object v7 = ((org.jsoup.nodes.Element)v5).append(((java.lang.String)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = "value";
    Object v1 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0));
    Object v2 = ">";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "width";
    Object v5 = ((org.jsoup.nodes.Element)v3).prepend(((java.lang.String)v4));
    Object v6 = "i";
    Object v7 = ((org.jsoup.nodes.Element)v5).append(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v7).childNodes();
    Object v9 = " ";
    Object v10 = ((org.jsoup.nodes.Node)v7).removeAttr(((java.lang.String)v9));
    Object v11 = "";
    Object v12 = ((org.jsoup.nodes.Element)v10).removeClass(((java.lang.String)v11));
    Object v13 = "HEAD";
    Object v14 = ((org.jsoup.nodes.Element)v12).toggleClass(((java.lang.String)v13));
    Object v15 = "TT";
    Object v16 = ((org.jsoup.nodes.Element)v12).append(((java.lang.String)v15));
    Object v17 = ((org.jsoup.nodes.Element)v16).hashCode();
    Object v18 = ((org.jsoup.nodes.Element)v16).firstElementSibling();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = "value";
    Object v1 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0));
    Object v2 = ">";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "https";
    Object v5 = ((org.jsoup.nodes.Element)v3).prependText(((java.lang.String)v4));
    Object v6 = 0;
    Object v7 = ((org.jsoup.nodes.Element)v5).getElementsByIndexGreaterThan((((java.lang.Integer)v6).intValue()));
    Object v8 = "#ro";
    Object v9 = ((org.jsoup.nodes.Element)v5).val(((java.lang.String)v8));
    Object v10 = ((org.jsoup.nodes.Element)v9).hashCode();
    org.junit.Assert.assertEquals((Object)(412339999), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = "value";
    Object v1 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0));
    Object v2 = ">";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "width";
    Object v5 = ((org.jsoup.nodes.Element)v3).prepend(((java.lang.String)v4));
    Object v6 = "i";
    Object v7 = ((org.jsoup.nodes.Element)v5).append(((java.lang.String)v6));
    Object v8 = "dd";
    Object v9 = ((org.jsoup.nodes.Element)v7).prepend(((java.lang.String)v8));
    Object v10 = "<-";
    Object v11 = ((org.jsoup.nodes.Element)v7).toggleClass(((java.lang.String)v10));
    Object v12 = "value";
    Object v13 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v12));
    Object v14 = ">";
    Object v15 = ((org.jsoup.nodes.Element)v13).toggleClass(((java.lang.String)v14));
    Object v16 = "https";
    Object v17 = ((org.jsoup.nodes.Element)v15).prependText(((java.lang.String)v16));
    Object v18 = ((org.jsoup.nodes.Node)v17).childNodes();
    Object v19 = "align";
    Object v20 = ((org.jsoup.nodes.Element)v17).val(((java.lang.String)v19));
    Object v21 = ((org.jsoup.nodes.Element)v11).appendChild(((org.jsoup.nodes.Node)v20));
    Object v22 = "value";
    Object v23 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v22));
    Object v24 = ((org.jsoup.nodes.Element)v23).data();
    Object v25 = new java.lang.StringBuilder(((java.lang.CharSequence)v24));
    Object v26 = 1.0D;
    Object v27 = ((java.lang.StringBuilder)v25).append((((java.lang.Double)v26).doubleValue()));
    ((org.jsoup.nodes.Element)v11).outerHtml(((java.lang.StringBuilder)v25));
    Object v28 = null;
    org.junit.Assert.assertNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = "value";
    Object v1 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0));
    Object v2 = ">";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = ">";
    Object v5 = ((org.jsoup.nodes.Element)v3).append(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Node)v5).nextSibling();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = "value";
    Object v1 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0));
    Object v2 = ">";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "https";
    Object v5 = ((org.jsoup.nodes.Element)v3).prependText(((java.lang.String)v4));
    Object v6 = "}";
    Object v7 = ((org.jsoup.nodes.Element)v5).toggleClass(((java.lang.String)v6));
    Object v8 = "value";
    Object v9 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v8));
    Object v10 = ">";
    Object v11 = ((org.jsoup.nodes.Element)v9).toggleClass(((java.lang.String)v10));
    Object v12 = "https";
    Object v13 = ((org.jsoup.nodes.Element)v11).prependText(((java.lang.String)v12));
    Object v14 = ((org.jsoup.nodes.Element)v13).classNames();
    Object v15 = ((org.jsoup.nodes.Element)v7).classNames(((java.util.Set)v14));
    Object v16 = ((org.jsoup.nodes.Element)v7).parents();
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = "value";
    Object v1 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0));
    Object v2 = ">";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "https";
    Object v5 = ((org.jsoup.nodes.Element)v3).prependText(((java.lang.String)v4));
    Object v6 = "cite";
    Object v7 = ((org.jsoup.nodes.Element)v5).val(((java.lang.String)v6));
    Object v8 = "hea";
    Object v9 = ((org.jsoup.nodes.Element)v7).addClass(((java.lang.String)v8));
    Object v10 = ((org.jsoup.nodes.Element)v9).hashCode();
    org.junit.Assert.assertEquals((Object)(1040142450), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = "value";
    Object v1 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0));
    Object v2 = ">";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "width";
    Object v5 = ((org.jsoup.nodes.Element)v3).prepend(((java.lang.String)v4));
    Object v6 = "i";
    Object v7 = ((org.jsoup.nodes.Element)v5).append(((java.lang.String)v6));
    Object v8 = "dd";
    Object v9 = ((org.jsoup.nodes.Element)v7).prepend(((java.lang.String)v8));
    Object v10 = "<-";
    Object v11 = ((org.jsoup.nodes.Element)v7).toggleClass(((java.lang.String)v10));
    Object v12 = "value";
    Object v13 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v12));
    Object v14 = ">";
    Object v15 = ((org.jsoup.nodes.Element)v13).toggleClass(((java.lang.String)v14));
    Object v16 = "https";
    Object v17 = ((org.jsoup.nodes.Element)v15).prependText(((java.lang.String)v16));
    Object v18 = "cite";
    Object v19 = ((org.jsoup.nodes.Element)v17).val(((java.lang.String)v18));
    Object v20 = ((org.jsoup.nodes.Element)v11).prependChild(((org.jsoup.nodes.Node)v19));
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = "value";
    Object v1 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0));
    Object v2 = ">";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "width";
    Object v5 = ((org.jsoup.nodes.Element)v3).prepend(((java.lang.String)v4));
    Object v6 = "i";
    Object v7 = ((org.jsoup.nodes.Element)v5).append(((java.lang.String)v6));
    Object v8 = "dd";
    Object v9 = ((org.jsoup.nodes.Element)v7).prepend(((java.lang.String)v8));
    Object v10 = "<-";
    Object v11 = ((org.jsoup.nodes.Element)v7).toggleClass(((java.lang.String)v10));
    Object v12 = "value";
    Object v13 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v12));
    Object v14 = ">";
    Object v15 = ((org.jsoup.nodes.Element)v13).toggleClass(((java.lang.String)v14));
    Object v16 = "https";
    Object v17 = ((org.jsoup.nodes.Element)v15).prependText(((java.lang.String)v16));
    Object v18 = "cite";
    Object v19 = ((org.jsoup.nodes.Element)v17).val(((java.lang.String)v18));
    Object v20 = ((org.jsoup.nodes.Element)v11).prependChild(((org.jsoup.nodes.Node)v19));
    Object v21 = "height";
    Object v22 = ((org.jsoup.nodes.Element)v20).wrap(((java.lang.String)v21));
    org.junit.Assert.assertNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = "value";
    Object v1 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).className();
    org.junit.Assert.assertEquals((Object)(""), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = "value";
    Object v1 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0));
    Object v2 = ">";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "width";
    Object v5 = ((org.jsoup.nodes.Element)v3).prepend(((java.lang.String)v4));
    Object v6 = "i";
    Object v7 = ((org.jsoup.nodes.Element)v5).append(((java.lang.String)v6));
    Object v8 = "dd";
    Object v9 = ((org.jsoup.nodes.Element)v7).prepend(((java.lang.String)v8));
    Object v10 = "<-";
    Object v11 = ((org.jsoup.nodes.Element)v7).toggleClass(((java.lang.String)v10));
    Object v12 = "";
    Object v13 = ((org.jsoup.nodes.Element)v11).toggleClass(((java.lang.String)v12));
    Object v14 = "head";
    Object v15 = ((org.jsoup.nodes.Element)v11).appendElement(((java.lang.String)v14));
    Object v16 = "value";
    Object v17 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v16));
    Object v18 = ">";
    Object v19 = ((org.jsoup.nodes.Element)v17).toggleClass(((java.lang.String)v18));
    Object v20 = ">";
    Object v21 = ((org.jsoup.nodes.Element)v19).append(((java.lang.String)v20));
    Object v22 = ((org.jsoup.nodes.Element)v15).prependChild(((org.jsoup.nodes.Node)v21));
    org.junit.Assert.assertNotNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = "value";
    Object v1 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0));
    Object v2 = ">";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "https";
    Object v5 = ((org.jsoup.nodes.Element)v3).prependText(((java.lang.String)v4));
    Object v6 = "cite";
    Object v7 = ((org.jsoup.nodes.Element)v5).val(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Element)v7).elementSiblingIndex();
    org.junit.Assert.assertEquals((Object)(0), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = "value";
    Object v1 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0));
    Object v2 = ">";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "width";
    Object v5 = ((org.jsoup.nodes.Element)v3).prepend(((java.lang.String)v4));
    Object v6 = "i";
    Object v7 = ((org.jsoup.nodes.Element)v5).append(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v7).childNodes();
    Object v9 = " ";
    Object v10 = ((org.jsoup.nodes.Node)v7).removeAttr(((java.lang.String)v9));
    Object v11 = ((org.jsoup.nodes.Element)v10).tag();
    Object v12 = "K";
    Object v13 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v11),((java.lang.String)v12));
    Object v14 = "cite";
    Object v15 = ((org.jsoup.nodes.Node)v13).removeAttr(((java.lang.String)v14));
    Object v16 = "ead";
    Object v17 = ((org.jsoup.nodes.Element)v13).getElementById(((java.lang.String)v16));
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = "value";
    Object v1 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0));
    Object v2 = ">";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "https";
    Object v5 = ((org.jsoup.nodes.Element)v3).prependText(((java.lang.String)v4));
    Object v6 = 0;
    Object v7 = ((org.jsoup.nodes.Element)v5).getElementsByIndexGreaterThan((((java.lang.Integer)v6).intValue()));
    Object v8 = "#ro";
    Object v9 = ((org.jsoup.nodes.Element)v5).val(((java.lang.String)v8));
    Object v10 = "sm";
    ((org.jsoup.nodes.Node)v9).setBaseUri(((java.lang.String)v10));
    Object v11 = null;
    Object v12 = ((org.jsoup.nodes.Node)v9).baseUri();
    org.junit.Assert.assertEquals((Object)("sm"), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = "value";
    Object v1 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0));
    Object v2 = ">";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "https";
    Object v5 = ((org.jsoup.nodes.Element)v3).prependText(((java.lang.String)v4));
    Object v6 = "";
    Object v7 = ((org.jsoup.nodes.Node)v5).absUrl(((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }
}
