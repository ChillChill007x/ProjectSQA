package org.jsoup.nodes;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = "htm{l";
    Object v1 = "head";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "the";
    Object v4 = ((org.jsoup.nodes.Element)v2).val(((java.lang.String)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = "htm{l";
    Object v1 = "head";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "the";
    Object v4 = ((org.jsoup.nodes.Element)v2).val(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).hashCode();
    org.junit.Assert.assertEquals((Object)(-442574039), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = "htm{l";
    Object v1 = "head";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "the";
    Object v4 = ((org.jsoup.nodes.Element)v2).val(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).children();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = "htm{l";
    Object v1 = "head";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "the";
    Object v4 = ((org.jsoup.nodes.Element)v2).val(((java.lang.String)v3));
    Object v5 = "hea";
    Object v6 = ((org.jsoup.nodes.Element)v4).removeClass(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Element)v4).clone();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = "htm{l";
    Object v1 = "head";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "the";
    Object v4 = ((org.jsoup.nodes.Element)v2).val(((java.lang.String)v3));
    Object v5 = "hea";
    Object v6 = ((org.jsoup.nodes.Element)v4).removeClass(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Element)v4).clone();
    Object v8 = ((org.jsoup.nodes.Node)v7).previousSibling();
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = "htm{l";
    Object v1 = "head";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "the";
    Object v4 = ((org.jsoup.nodes.Element)v2).val(((java.lang.String)v3));
    Object v5 = "hea";
    Object v6 = ((org.jsoup.nodes.Element)v4).removeClass(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Element)v4).clone();
    Object v8 = "selct";
    Object v9 = ((org.jsoup.nodes.Element)v7).before(((java.lang.String)v8));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = "htm{l";
    Object v1 = "head";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "the";
    Object v4 = ((org.jsoup.nodes.Element)v2).val(((java.lang.String)v3));
    Object v5 = "hea";
    Object v6 = ((org.jsoup.nodes.Element)v4).removeClass(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Element)v4).clone();
    Object v8 = "footer";
    Object v9 = ((org.jsoup.nodes.Node)v7).absUrl(((java.lang.String)v8));
    org.junit.Assert.assertEquals((Object)(""), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = "htm{l";
    Object v1 = "head";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "the";
    Object v4 = ((org.jsoup.nodes.Element)v2).val(((java.lang.String)v3));
    Object v5 = "hea";
    Object v6 = ((org.jsoup.nodes.Element)v4).removeClass(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Element)v4).clone();
    Object v8 = "htm{l";
    Object v9 = "head";
    Object v10 = org.jsoup.Jsoup.parse(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = "the";
    Object v12 = ((org.jsoup.nodes.Element)v10).val(((java.lang.String)v11));
    Object v13 = "hea";
    Object v14 = ((org.jsoup.nodes.Element)v12).removeClass(((java.lang.String)v13));
    Object v15 = ((org.jsoup.nodes.Element)v12).clone();
    Object v16 = ((org.jsoup.nodes.Element)v7).prependChild(((org.jsoup.nodes.Node)v15));
    Object v17 = ((org.jsoup.nodes.Element)v7).text();
    org.junit.Assert.assertEquals((Object)("htm{l htm{l"), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = "htm{l";
    Object v1 = "head";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "the";
    Object v4 = ((org.jsoup.nodes.Element)v2).val(((java.lang.String)v3));
    Object v5 = "<";
    Object v6 = ((org.jsoup.nodes.Node)v4).hasAttr(((java.lang.String)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = "htm{l";
    Object v1 = "head";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "the";
    Object v4 = ((org.jsoup.nodes.Element)v2).val(((java.lang.String)v3));
    Object v5 = "hea";
    Object v6 = ((org.jsoup.nodes.Element)v4).removeClass(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Element)v4).clone();
    Object v8 = "htl";
    Object v9 = ((org.jsoup.nodes.Node)v7).absUrl(((java.lang.String)v8));
    org.junit.Assert.assertEquals((Object)(""), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = "htm{l";
    Object v1 = "head";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "the";
    Object v4 = ((org.jsoup.nodes.Element)v2).val(((java.lang.String)v3));
    Object v5 = "F";
    Object v6 = ((org.jsoup.nodes.Node)v4).hasAttr(((java.lang.String)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = "htm{l";
    Object v1 = "head";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "the";
    Object v4 = ((org.jsoup.nodes.Element)v2).val(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).siblingElements();
    Object v6 = ", URL7=";
    Object v7 = ((org.jsoup.nodes.Element)v4).val(((java.lang.String)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = "htm{l";
    Object v1 = "head";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "the";
    Object v4 = ((org.jsoup.nodes.Element)v2).val(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).siblingElements();
    Object v6 = ", URL7=";
    Object v7 = ((org.jsoup.nodes.Element)v4).val(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Element)v7).val();
    org.junit.Assert.assertEquals((Object)(", URL7="), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = "htm{l";
    Object v1 = "head";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "the";
    Object v4 = ((org.jsoup.nodes.Element)v2).val(((java.lang.String)v3));
    Object v5 = "hea";
    Object v6 = ((org.jsoup.nodes.Element)v4).removeClass(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Element)v4).clone();
    Object v8 = "thead";
    Object v9 = ((org.jsoup.nodes.Element)v7).getElementsContainingText(((java.lang.String)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = "htm{l";
    Object v1 = "head";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "the";
    Object v4 = ((org.jsoup.nodes.Element)v2).val(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).siblingElements();
    Object v6 = ", URL7=";
    Object v7 = ((org.jsoup.nodes.Element)v4).val(((java.lang.String)v6));
    Object v8 = "bim";
    Object v9 = ((org.jsoup.nodes.Element)v7).getElementById(((java.lang.String)v8));
    Object v10 = "tr";
    Object v11 = ((org.jsoup.nodes.Element)v7).toggleClass(((java.lang.String)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = "htm{l";
    Object v1 = "head";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "the";
    Object v4 = ((org.jsoup.nodes.Element)v2).val(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).siblingElements();
    Object v6 = ", URL7=";
    Object v7 = ((org.jsoup.nodes.Element)v4).val(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Element)v7).classNames();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = "htm{l";
    Object v1 = "head";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "the";
    Object v4 = ((org.jsoup.nodes.Element)v2).val(((java.lang.String)v3));
    Object v5 = "hea";
    Object v6 = ((org.jsoup.nodes.Element)v4).removeClass(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Element)v4).clone();
    Object v8 = "framest";
    Object v9 = ((org.jsoup.nodes.Node)v7).hasAttr(((java.lang.String)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = "htm{l";
    Object v1 = "head";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "the";
    Object v4 = ((org.jsoup.nodes.Element)v2).val(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).siblingElements();
    Object v6 = ", URL7=";
    Object v7 = ((org.jsoup.nodes.Element)v4).val(((java.lang.String)v6));
    Object v8 = "bim";
    Object v9 = ((org.jsoup.nodes.Element)v7).getElementById(((java.lang.String)v8));
    Object v10 = "tr";
    Object v11 = ((org.jsoup.nodes.Element)v7).toggleClass(((java.lang.String)v10));
    Object v12 = "img";
    ((org.jsoup.nodes.Node)v11).setBaseUri(((java.lang.String)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = "htm{l";
    Object v1 = "head";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "the";
    Object v4 = ((org.jsoup.nodes.Element)v2).val(((java.lang.String)v3));
    Object v5 = "hea";
    Object v6 = ((org.jsoup.nodes.Element)v4).removeClass(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Element)v4).clone();
    Object v8 = ((org.jsoup.nodes.Element)v7).hashCode();
    org.junit.Assert.assertEquals((Object)(-1875227591), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = "htm{l";
    Object v1 = "head";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "the";
    Object v4 = ((org.jsoup.nodes.Element)v2).val(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).siblingElements();
    Object v6 = ", URL7=";
    Object v7 = ((org.jsoup.nodes.Element)v4).val(((java.lang.String)v6));
    Object v8 = "hgroup";
    Object v9 = ((org.jsoup.nodes.Element)v7).append(((java.lang.String)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = "htm{l";
    Object v1 = "head";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "the";
    Object v4 = ((org.jsoup.nodes.Element)v2).val(((java.lang.String)v3));
    Object v5 = "hea";
    Object v6 = ((org.jsoup.nodes.Element)v4).removeClass(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Element)v4).clone();
    Object v8 = -13;
    Object v9 = "htm{l";
    Object v10 = "head";
    Object v11 = org.jsoup.Jsoup.parse(((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = "the";
    Object v13 = ((org.jsoup.nodes.Element)v11).val(((java.lang.String)v12));
    Object v14 = ((org.jsoup.nodes.Element)v13).children();
    Object v15 = ((org.jsoup.nodes.Element)v7).insertChildren((((java.lang.Integer)v8).intValue()),((java.util.Collection)v14));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = "htm{l";
    Object v1 = "head";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "the";
    Object v4 = ((org.jsoup.nodes.Element)v2).val(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).siblingElements();
    Object v6 = ", URL7=";
    Object v7 = ((org.jsoup.nodes.Element)v4).val(((java.lang.String)v6));
    Object v8 = "bim";
    Object v9 = ((org.jsoup.nodes.Element)v7).getElementById(((java.lang.String)v8));
    Object v10 = "tr";
    Object v11 = ((org.jsoup.nodes.Element)v7).toggleClass(((java.lang.String)v10));
    Object v12 = ((org.jsoup.nodes.Node)v11).outerHtml();
    Object v13 = " ";
    Object v14 = ((org.jsoup.nodes.Node)v11).attr(((java.lang.String)v13));
    org.junit.Assert.assertEquals((Object)(""), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = "htm{l";
    Object v1 = "head";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "the";
    Object v4 = ((org.jsoup.nodes.Element)v2).val(((java.lang.String)v3));
    Object v5 = "hea";
    Object v6 = ((org.jsoup.nodes.Element)v4).removeClass(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Element)v4).clone();
    Object v8 = ((org.jsoup.nodes.Node)v7).ownerDocument();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = "htm{l";
    Object v1 = "head";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "the";
    Object v4 = ((org.jsoup.nodes.Element)v2).val(((java.lang.String)v3));
    Object v5 = "hea";
    Object v6 = ((org.jsoup.nodes.Element)v4).removeClass(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Element)v4).clone();
    Object v8 = ((org.jsoup.nodes.Node)v7).ownerDocument();
    Object v9 = ((org.jsoup.nodes.Node)v8).siblingNodes();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = "htm{l";
    Object v1 = "head";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "the";
    Object v4 = ((org.jsoup.nodes.Element)v2).val(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).siblingElements();
    Object v6 = ", URL7=";
    Object v7 = ((org.jsoup.nodes.Element)v4).val(((java.lang.String)v6));
    Object v8 = "bim";
    Object v9 = ((org.jsoup.nodes.Element)v7).getElementById(((java.lang.String)v8));
    Object v10 = "tr";
    Object v11 = ((org.jsoup.nodes.Element)v7).toggleClass(((java.lang.String)v10));
    Object v12 = "htm{l";
    Object v13 = "head";
    Object v14 = org.jsoup.Jsoup.parse(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = "the";
    Object v16 = ((org.jsoup.nodes.Element)v14).val(((java.lang.String)v15));
    Object v17 = ((org.jsoup.nodes.Element)v16).siblingElements();
    Object v18 = ", URL7=";
    Object v19 = ((org.jsoup.nodes.Element)v16).val(((java.lang.String)v18));
    Object v20 = ((org.jsoup.nodes.Element)v19).classNames();
    Object v21 = ((org.jsoup.nodes.Element)v11).classNames(((java.util.Set)v20));
    Object v22 = ((org.jsoup.nodes.Element)v11).tagName();
    org.junit.Assert.assertEquals((Object)("#root"), v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = "htm{l";
    Object v1 = "head";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "the";
    Object v4 = ((org.jsoup.nodes.Element)v2).val(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).siblingElements();
    Object v6 = ", URL7=";
    Object v7 = ((org.jsoup.nodes.Element)v4).val(((java.lang.String)v6));
    Object v8 = "bim";
    Object v9 = ((org.jsoup.nodes.Element)v7).getElementById(((java.lang.String)v8));
    Object v10 = "tr";
    Object v11 = ((org.jsoup.nodes.Element)v7).toggleClass(((java.lang.String)v10));
    Object v12 = ((org.jsoup.nodes.Element)v11).clone();
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = "htm{l";
    Object v1 = "head";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "the";
    Object v4 = ((org.jsoup.nodes.Element)v2).val(((java.lang.String)v3));
    Object v5 = "hea";
    Object v6 = ((org.jsoup.nodes.Element)v4).removeClass(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Element)v4).clone();
    Object v8 = ((org.jsoup.nodes.Node)v7).outerHtml();
    Object v9 = ((org.jsoup.nodes.Node)v7).childNodesCopy();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = "htm{l";
    Object v1 = "head";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "the";
    Object v4 = ((org.jsoup.nodes.Element)v2).val(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).siblingElements();
    Object v6 = ", URL7=";
    Object v7 = ((org.jsoup.nodes.Element)v4).val(((java.lang.String)v6));
    Object v8 = "bim";
    Object v9 = ((org.jsoup.nodes.Element)v7).getElementById(((java.lang.String)v8));
    Object v10 = "tr";
    Object v11 = ((org.jsoup.nodes.Element)v7).toggleClass(((java.lang.String)v10));
    Object v12 = ((org.jsoup.nodes.Element)v11).clone();
    Object v13 = "htm{l";
    Object v14 = "head";
    Object v15 = org.jsoup.Jsoup.parse(((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = "the";
    Object v17 = ((org.jsoup.nodes.Element)v15).val(((java.lang.String)v16));
    Object v18 = ((org.jsoup.nodes.Element)v17).hashCode();
    Object v19 = ((org.jsoup.nodes.Element)v12).equals(((java.lang.Object)v18));
    org.junit.Assert.assertEquals((Object)(false), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = "htm{l";
    Object v1 = "head";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "the";
    Object v4 = ((org.jsoup.nodes.Element)v2).val(((java.lang.String)v3));
    Object v5 = "hea";
    Object v6 = ((org.jsoup.nodes.Element)v4).removeClass(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Element)v4).clone();
    Object v8 = ((org.jsoup.nodes.Node)v7).childNodesCopy();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = "htm{l";
    Object v1 = "head";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "the";
    Object v4 = ((org.jsoup.nodes.Element)v2).val(((java.lang.String)v3));
    Object v5 = "hea";
    Object v6 = ((org.jsoup.nodes.Element)v4).removeClass(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Element)v4).clone();
    Object v8 = ((org.jsoup.nodes.Node)v7).childNodes();
    Object v9 = ((org.jsoup.nodes.Node)v7).siblingIndex();
    org.junit.Assert.assertEquals((Object)(0), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = "0";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "br";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = "htm{l";
    Object v1 = "head";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "the";
    Object v4 = ((org.jsoup.nodes.Element)v2).val(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).siblingElements();
    Object v6 = ", URL7=";
    Object v7 = ((org.jsoup.nodes.Element)v4).val(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Element)v7).lastElementSibling();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = "htm{l";
    Object v1 = "head";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "the";
    Object v4 = ((org.jsoup.nodes.Element)v2).val(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).siblingElements();
    Object v6 = ", URL7=";
    Object v7 = ((org.jsoup.nodes.Element)v4).val(((java.lang.String)v6));
    Object v8 = "bim";
    Object v9 = ((org.jsoup.nodes.Element)v7).getElementById(((java.lang.String)v8));
    Object v10 = "tr";
    Object v11 = ((org.jsoup.nodes.Element)v7).toggleClass(((java.lang.String)v10));
    Object v12 = ((org.jsoup.nodes.Element)v11).siblingElements();
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = "0";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "br";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = "Could not parse attribute query '%s': unexpected token aty '%s'";
    Object v5 = ((org.jsoup.nodes.Element)v3).prependText(((java.lang.String)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = "0";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "br";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = "Could not parse attribute query '%s': unexpected token aty '%s'";
    Object v5 = ((org.jsoup.nodes.Element)v3).prependText(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Element)v5).firstElementSibling();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = "0";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "br";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = "Could not parse attribute query '%s': unexpected token aty '%s'";
    Object v5 = ((org.jsoup.nodes.Element)v3).prependText(((java.lang.String)v4));
    Object v6 = ">";
    Object v7 = ((org.jsoup.nodes.Element)v5).getElementById(((java.lang.String)v6));
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = "0";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "br";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = "Could not parse attribute query '%s': unexpected token aty '%s'";
    Object v5 = ((org.jsoup.nodes.Element)v3).prependText(((java.lang.String)v4));
    Object v6 = "article";
    Object v7 = ((org.jsoup.nodes.Element)v5).append(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Element)v5).siblingElements();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = "htm{l";
    Object v1 = "head";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "the";
    Object v4 = ((org.jsoup.nodes.Element)v2).val(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).siblingElements();
    Object v6 = ", URL7=";
    Object v7 = ((org.jsoup.nodes.Element)v4).val(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Element)v7).previousElementSibling();
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = "0";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "br";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = "Could not parse attribute query '%s': unexpected token aty '%s'";
    Object v5 = ((org.jsoup.nodes.Element)v3).prependText(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Element)v5).hashCode();
    org.junit.Assert.assertEquals((Object)(2080099919), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = "0";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "br";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = "htm{l";
    Object v5 = "head";
    Object v6 = org.jsoup.Jsoup.parse(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = "the";
    Object v8 = ((org.jsoup.nodes.Element)v6).val(((java.lang.String)v7));
    Object v9 = "hea";
    Object v10 = ((org.jsoup.nodes.Element)v8).removeClass(((java.lang.String)v9));
    Object v11 = ((org.jsoup.nodes.Element)v8).clone();
    Object v12 = "footer";
    Object v13 = ((org.jsoup.nodes.Node)v11).absUrl(((java.lang.String)v12));
    Object v14 = new java.lang.StringBuilder(((java.lang.CharSequence)v13));
    Object v15 = 1;
    Object v16 = new org.jsoup.nodes.Document.OutputSettings();
    Object v17 = true;
    Object v18 = ((org.jsoup.nodes.Document.OutputSettings)v16).prettyPrint((((java.lang.Boolean)v17).booleanValue()));
    ((org.jsoup.nodes.Element)v3).outerHtmlTail(((java.lang.StringBuilder)v14),(((java.lang.Integer)v15).intValue()),((org.jsoup.nodes.Document.OutputSettings)v16));
    Object v19 = null;
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = "0";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "br";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = "style";
    Object v5 = ((org.jsoup.nodes.Element)v3).prependElement(((java.lang.String)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = "htm{l";
    Object v1 = "head";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "the";
    Object v4 = ((org.jsoup.nodes.Element)v2).val(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).siblingElements();
    Object v6 = ", URL7=";
    Object v7 = ((org.jsoup.nodes.Element)v4).val(((java.lang.String)v6));
    Object v8 = "bim";
    Object v9 = ((org.jsoup.nodes.Element)v7).getElementById(((java.lang.String)v8));
    Object v10 = "tr";
    Object v11 = ((org.jsoup.nodes.Element)v7).toggleClass(((java.lang.String)v10));
    Object v12 = "select";
    Object v13 = "sr";
    Object v14 = ((org.jsoup.nodes.Element)v11).getElementsByAttributeValueMatching(((java.lang.String)v12),((java.lang.String)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = "0";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "br";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Node)v3).previousSibling();
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = "0";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "br";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = "Could not parse attribute query '%s': unexpected token aty '%s'";
    Object v5 = ((org.jsoup.nodes.Element)v3).prependText(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Element)v5).nextElementSibling();
    Object v7 = ((org.jsoup.nodes.Element)v5).nextElementSibling();
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = "0";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "br";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = "Could not parse attribute query '%s': unexpected token aty '%s'";
    Object v5 = ((org.jsoup.nodes.Element)v3).prependText(((java.lang.String)v4));
    Object v6 = "html";
    Object v7 = ((org.jsoup.nodes.Node)v5).hasAttr(((java.lang.String)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = "0";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "br";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = "Could not parse attribute query '%s': unexpected token aty '%s'";
    Object v5 = ((org.jsoup.nodes.Element)v3).prependText(((java.lang.String)v4));
    Object v6 = "html";
    Object v7 = java.util.regex.Pattern.compile(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Element)v5).getElementsMatchingText(((java.util.regex.Pattern)v7));
    Object v9 = "h4";
    Object v10 = "hed";
    Object v11 = ((org.jsoup.nodes.Element)v5).getElementsByAttributeValue(((java.lang.String)v9),((java.lang.String)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = "0";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "br";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = "Could not parse attribute query '%s': unexpected token aty '%s'";
    Object v5 = ((org.jsoup.nodes.Element)v3).prependText(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Node)v5).siblingNodes();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = "htm{l";
    Object v1 = "head";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "the";
    Object v4 = ((org.jsoup.nodes.Element)v2).val(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).siblingElements();
    Object v6 = ", URL7=";
    Object v7 = ((org.jsoup.nodes.Element)v4).val(((java.lang.String)v6));
    Object v8 = "bim";
    Object v9 = ((org.jsoup.nodes.Element)v7).getElementById(((java.lang.String)v8));
    Object v10 = "tr";
    Object v11 = ((org.jsoup.nodes.Element)v7).toggleClass(((java.lang.String)v10));
    Object v12 = ((org.jsoup.nodes.Element)v11).clone();
    Object v13 = "select";
    Object v14 = ((org.jsoup.nodes.Element)v12).getElementsByClass(((java.lang.String)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = "0";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "br";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = "Could not parse attribute query '%s': unexpected token aty '%s'";
    Object v5 = ((org.jsoup.nodes.Element)v3).prependText(((java.lang.String)v4));
    Object v6 = "9";
    Object v7 = ((org.jsoup.nodes.Element)v5).getElementsByAttributeStarting(((java.lang.String)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = "0";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "br";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = "Could not parse attribute query '%s': unexpected token aty '%s'";
    Object v5 = ((org.jsoup.nodes.Element)v3).prependText(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Node)v5).toString();
    Object v7 = ((org.jsoup.nodes.Node)v5).attributes();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = "htm{l";
    Object v1 = "head";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "the";
    Object v4 = ((org.jsoup.nodes.Element)v2).val(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).siblingElements();
    Object v6 = ", URL7=";
    Object v7 = ((org.jsoup.nodes.Element)v4).val(((java.lang.String)v6));
    Object v8 = "bim";
    Object v9 = ((org.jsoup.nodes.Element)v7).getElementById(((java.lang.String)v8));
    Object v10 = "tr";
    Object v11 = ((org.jsoup.nodes.Element)v7).toggleClass(((java.lang.String)v10));
    Object v12 = ((org.jsoup.nodes.Element)v11).clone();
    Object v13 = "";
    Object v14 = ((org.jsoup.nodes.Node)v12).hasAttr(((java.lang.String)v13));
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = "0";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "br";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = "Could not parse attribute query '%s': unexpected token aty '%s'";
    Object v5 = ((org.jsoup.nodes.Element)v3).prependText(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Element)v5).previousElementSibling();
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = "htm{l";
    Object v1 = "head";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "the";
    Object v4 = ((org.jsoup.nodes.Element)v2).val(((java.lang.String)v3));
    Object v5 = "hea";
    Object v6 = ((org.jsoup.nodes.Element)v4).removeClass(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Element)v4).clone();
    Object v8 = ((org.jsoup.nodes.Node)v7).ownerDocument();
    Object v9 = ((org.jsoup.nodes.Element)v8).data();
    org.junit.Assert.assertEquals((Object)(""), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = "0";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "br";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v3).hasText();
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = "0";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "br";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = "Could not parse attribute query '%s': unexpected token aty '%s'";
    Object v5 = ((org.jsoup.nodes.Element)v3).prependText(((java.lang.String)v4));
    Object v6 = "htm{l";
    Object v7 = "head";
    Object v8 = org.jsoup.Jsoup.parse(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = "the";
    Object v10 = ((org.jsoup.nodes.Element)v8).val(((java.lang.String)v9));
    Object v11 = "hea";
    Object v12 = ((org.jsoup.nodes.Element)v10).removeClass(((java.lang.String)v11));
    Object v13 = ((org.jsoup.nodes.Element)v10).clone();
    Object v14 = ((org.jsoup.nodes.Node)v13).childNodesCopy();
    Object v15 = ((org.jsoup.nodes.Element)v5).equals(((java.lang.Object)v14));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = "htm{l";
    Object v1 = "head";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "the";
    Object v4 = ((org.jsoup.nodes.Element)v2).val(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).siblingElements();
    Object v6 = ", URL7=";
    Object v7 = ((org.jsoup.nodes.Element)v4).val(((java.lang.String)v6));
    Object v8 = "bim";
    Object v9 = ((org.jsoup.nodes.Element)v7).getElementById(((java.lang.String)v8));
    Object v10 = "tr";
    Object v11 = ((org.jsoup.nodes.Element)v7).toggleClass(((java.lang.String)v10));
    Object v12 = ((org.jsoup.nodes.Element)v11).clone();
    Object v13 = "col";
    Object v14 = ((org.jsoup.nodes.Element)v12).hasClass(((java.lang.String)v13));
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = "htm{l";
    Object v1 = "head";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "the";
    Object v4 = ((org.jsoup.nodes.Element)v2).val(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).siblingElements();
    Object v6 = ", URL7=";
    Object v7 = ((org.jsoup.nodes.Element)v4).val(((java.lang.String)v6));
    Object v8 = "/";
    Object v9 = "label";
    Object v10 = ((org.jsoup.nodes.Element)v7).getElementsByAttributeValueEnding(((java.lang.String)v8),((java.lang.String)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = "0";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "br";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = "style";
    Object v5 = ((org.jsoup.nodes.Element)v3).prependElement(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Node)v5).childNodeSize();
    org.junit.Assert.assertEquals((Object)(0), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = "0";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "br";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = "Could not parse attribute query '%s': unexpected token aty '%s'";
    Object v5 = ((org.jsoup.nodes.Element)v3).prependText(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Element)v5).siblingElements();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = "htm{l";
    Object v1 = "head";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "the";
    Object v4 = ((org.jsoup.nodes.Element)v2).val(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).siblingElements();
    Object v6 = ", URL7=";
    Object v7 = ((org.jsoup.nodes.Element)v4).val(((java.lang.String)v6));
    Object v8 = "bim";
    Object v9 = ((org.jsoup.nodes.Element)v7).getElementById(((java.lang.String)v8));
    Object v10 = "tr";
    Object v11 = ((org.jsoup.nodes.Element)v7).toggleClass(((java.lang.String)v10));
    Object v12 = ((org.jsoup.nodes.Element)v11).clone();
    Object v13 = "usage: supply url to fexch";
    Object v14 = ((org.jsoup.nodes.Element)v12).getElementById(((java.lang.String)v13));
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = "htm{l";
    Object v1 = "head";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "the";
    Object v4 = ((org.jsoup.nodes.Element)v2).val(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).siblingElements();
    Object v6 = ", URL7=";
    Object v7 = ((org.jsoup.nodes.Element)v4).val(((java.lang.String)v6));
    Object v8 = "bim";
    Object v9 = ((org.jsoup.nodes.Element)v7).getElementById(((java.lang.String)v8));
    Object v10 = "tr";
    Object v11 = ((org.jsoup.nodes.Element)v7).toggleClass(((java.lang.String)v10));
    Object v12 = ((org.jsoup.nodes.Element)v11).siblingElements();
    Object v13 = ((org.jsoup.nodes.Element)v11).data();
    org.junit.Assert.assertEquals((Object)(""), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = "0";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "br";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = "Could not parse attribute query '%s': unexpected token aty '%s'";
    Object v5 = ((org.jsoup.nodes.Element)v3).prependText(((java.lang.String)v4));
    Object v6 = "i";
    Object v7 = ((org.jsoup.nodes.Node)v5).attr(((java.lang.String)v6));
    org.junit.Assert.assertEquals((Object)(""), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = "0";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "br";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = "Could not parse attribute query '%s': unexpected token aty '%s'";
    Object v5 = ((org.jsoup.nodes.Element)v3).prependText(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Node)v5).childNodesCopy();
    Object v7 = 6;
    Object v8 = "0";
    Object v9 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v8));
    Object v10 = "br";
    Object v11 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v9),((java.lang.String)v10));
    Object v12 = "Could not parse attribute query '%s': unexpected token aty '%s'";
    Object v13 = ((org.jsoup.nodes.Element)v11).prependText(((java.lang.String)v12));
    Object v14 = ((org.jsoup.nodes.Element)v13).siblingElements();
    Object v15 = ((org.jsoup.nodes.Element)v5).insertChildren((((java.lang.Integer)v7).intValue()),((java.util.Collection)v14));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = "0";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "br";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = "Could not parse attribute query '%s': unexpected token aty '%s'";
    Object v5 = ((org.jsoup.nodes.Element)v3).prependText(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Element)v5).dataset();
    Object v7 = ((org.jsoup.nodes.Element)v5).children();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = "0";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "br";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = "Could not parse attribute query '%s': unexpected token aty '%s'";
    Object v5 = ((org.jsoup.nodes.Element)v3).prependText(((java.lang.String)v4));
    Object v6 = "htm{l";
    Object v7 = "head";
    Object v8 = org.jsoup.Jsoup.parse(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = "the";
    Object v10 = ((org.jsoup.nodes.Element)v8).val(((java.lang.String)v9));
    Object v11 = "hea";
    Object v12 = ((org.jsoup.nodes.Element)v10).removeClass(((java.lang.String)v11));
    Object v13 = ((org.jsoup.nodes.Element)v10).clone();
    Object v14 = "footer";
    Object v15 = ((org.jsoup.nodes.Node)v13).absUrl(((java.lang.String)v14));
    Object v16 = new java.lang.StringBuilder(((java.lang.CharSequence)v15));
    Object v17 = "0";
    Object v18 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v17));
    Object v19 = "br";
    Object v20 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v18),((java.lang.String)v19));
    Object v21 = "Could not parse attribute query '%s': unexpected token aty '%s'";
    Object v22 = ((org.jsoup.nodes.Element)v20).prependText(((java.lang.String)v21));
    Object v23 = ((org.jsoup.nodes.Node)v22).siblingNodes();
    Object v24 = ((java.lang.StringBuilder)v16).append(((java.lang.Object)v23));
    Object v25 = 46;
    Object v26 = new org.jsoup.nodes.Document.OutputSettings();
    ((org.jsoup.nodes.Element)v5).outerHtmlHead(((java.lang.StringBuilder)v16),(((java.lang.Integer)v25).intValue()),((org.jsoup.nodes.Document.OutputSettings)v26));
    Object v27 = null;
    org.junit.Assert.assertNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = "0";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "br";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = "style";
    Object v5 = ((org.jsoup.nodes.Element)v3).prependElement(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Element)v5).lastElementSibling();
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = "0";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "br";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = "Could not parse attribute query '%s': unexpected token aty '%s'";
    Object v5 = ((org.jsoup.nodes.Element)v3).prependText(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Element)v5).nodeName();
    org.junit.Assert.assertEquals((Object)("0"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = "0";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "br";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v3).parent();
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = "0";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "br";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Node)v3).nextSibling();
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = "0";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "br";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v3).dataNodes();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = "0";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "br";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = "Could not parse attribute query '%s': unexpected token aty '%s'";
    Object v5 = ((org.jsoup.nodes.Element)v3).prependText(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Element)v5).data();
    org.junit.Assert.assertEquals((Object)(""), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = "0";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "br";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = "Could not parse attribute query '%s': unexpected token aty '%s'";
    Object v5 = ((org.jsoup.nodes.Element)v3).prependText(((java.lang.String)v4));
    Object v6 = ">";
    Object v7 = ((org.jsoup.nodes.Element)v5).hasClass(((java.lang.String)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = "htm{l";
    Object v1 = "head";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "the";
    Object v4 = ((org.jsoup.nodes.Element)v2).val(((java.lang.String)v3));
    Object v5 = "hea";
    Object v6 = ((org.jsoup.nodes.Element)v4).removeClass(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Element)v4).clone();
    Object v8 = ((org.jsoup.nodes.Node)v7).nextSibling();
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = "0";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "br";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = "Could not parse attribute query '%s': unexpected token aty '%s'";
    Object v5 = ((org.jsoup.nodes.Element)v3).prependText(((java.lang.String)v4));
    Object v6 = "linlk";
    Object v7 = "tr";
    Object v8 = ((org.jsoup.nodes.Element)v5).getElementsByAttributeValueEnding(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = "td";
    Object v10 = ((org.jsoup.nodes.Element)v5).appendElement(((java.lang.String)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = "0";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "br";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = "Could not parse attribute query '%s': unexpected token aty '%s'";
    Object v5 = ((org.jsoup.nodes.Element)v3).prependText(((java.lang.String)v4));
    Object v6 = "linlk";
    Object v7 = "tr";
    Object v8 = ((org.jsoup.nodes.Element)v5).getElementsByAttributeValueEnding(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = "td";
    Object v10 = ((org.jsoup.nodes.Element)v5).appendElement(((java.lang.String)v9));
    Object v11 = ((org.jsoup.nodes.Element)v10).hasText();
    Object v12 = ((org.jsoup.nodes.Element)v10).hasText();
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = "0";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "br";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = "Could not parse attribute query '%s': unexpected token aty '%s'";
    Object v5 = ((org.jsoup.nodes.Element)v3).prependText(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Element)v5).ownText();
    org.junit.Assert.assertEquals((Object)("Could not parse attribute query '%s': unexpected token aty '%s'"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = "0";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "br";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = "Could not parse attribute query '%s': unexpected token aty '%s'";
    Object v5 = ((org.jsoup.nodes.Element)v3).prependText(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Element)v5).previousElementSibling();
    Object v7 = ((org.jsoup.nodes.Element)v5).id();
    org.junit.Assert.assertEquals((Object)(""), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = "0";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "br";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = "Could not parse attribute query '%s': unexpected token aty '%s'";
    Object v5 = ((org.jsoup.nodes.Element)v3).prependText(((java.lang.String)v4));
    Object v6 = "htm{l";
    Object v7 = "head";
    Object v8 = org.jsoup.Jsoup.parse(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = "the";
    Object v10 = ((org.jsoup.nodes.Element)v8).val(((java.lang.String)v9));
    Object v11 = "hea";
    Object v12 = ((org.jsoup.nodes.Element)v10).removeClass(((java.lang.String)v11));
    Object v13 = ((org.jsoup.nodes.Element)v10).clone();
    Object v14 = "footer";
    Object v15 = ((org.jsoup.nodes.Node)v13).absUrl(((java.lang.String)v14));
    Object v16 = new java.lang.StringBuilder(((java.lang.CharSequence)v15));
    Object v17 = 0;
    Object v18 = new org.jsoup.nodes.Document.OutputSettings();
    ((org.jsoup.nodes.Element)v5).outerHtmlHead(((java.lang.StringBuilder)v16),(((java.lang.Integer)v17).intValue()),((org.jsoup.nodes.Document.OutputSettings)v18));
    Object v19 = null;
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = "0";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "br";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = "Could not parse attribute query '%s': unexpected token aty '%s'";
    Object v5 = ((org.jsoup.nodes.Element)v3).prependText(((java.lang.String)v4));
    Object v6 = "linlk";
    Object v7 = "tr";
    Object v8 = ((org.jsoup.nodes.Element)v5).getElementsByAttributeValueEnding(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = "td";
    Object v10 = ((org.jsoup.nodes.Element)v5).appendElement(((java.lang.String)v9));
    Object v11 = ((org.jsoup.nodes.Element)v10).lastElementSibling();
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = "htm{l";
    Object v1 = "head";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "the";
    Object v4 = ((org.jsoup.nodes.Element)v2).val(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).siblingElements();
    Object v6 = ", URL7=";
    Object v7 = ((org.jsoup.nodes.Element)v4).val(((java.lang.String)v6));
    Object v8 = "bim";
    Object v9 = ((org.jsoup.nodes.Element)v7).getElementById(((java.lang.String)v8));
    Object v10 = "tr";
    Object v11 = ((org.jsoup.nodes.Element)v7).toggleClass(((java.lang.String)v10));
    Object v12 = ((org.jsoup.nodes.Element)v11).clone();
    Object v13 = "Should not b reachable";
    Object v14 = ((org.jsoup.nodes.Element)v12).html(((java.lang.String)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = "0";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "br";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = "Could not parse attribute query '%s': unexpected token aty '%s'";
    Object v5 = ((org.jsoup.nodes.Element)v3).prependText(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Element)v5).preserveWhitespace();
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = "0";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "br";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = "Could not parse attribute query '%s': unexpected token aty '%s'";
    Object v5 = ((org.jsoup.nodes.Element)v3).prependText(((java.lang.String)v4));
    Object v6 = -21;
    Object v7 = ((org.jsoup.nodes.Element)v5).getElementsByIndexGreaterThan((((java.lang.Integer)v6).intValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = "htm{l";
    Object v1 = "head";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "the";
    Object v4 = ((org.jsoup.nodes.Element)v2).val(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).siblingElements();
    Object v6 = ", URL7=";
    Object v7 = ((org.jsoup.nodes.Element)v4).val(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v7).childNodes();
    Object v9 = "htm{l";
    Object v10 = "head";
    Object v11 = org.jsoup.Jsoup.parse(((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = "the";
    Object v13 = ((org.jsoup.nodes.Element)v11).val(((java.lang.String)v12));
    Object v14 = "hea";
    Object v15 = ((org.jsoup.nodes.Element)v13).removeClass(((java.lang.String)v14));
    Object v16 = ((org.jsoup.nodes.Element)v13).clone();
    Object v17 = "footer";
    Object v18 = ((org.jsoup.nodes.Node)v16).absUrl(((java.lang.String)v17));
    Object v19 = new java.lang.StringBuilder(((java.lang.CharSequence)v18));
    Object v20 = 1;
    Object v21 = new org.jsoup.nodes.Document.OutputSettings();
    ((org.jsoup.nodes.Element)v7).outerHtmlTail(((java.lang.StringBuilder)v19),(((java.lang.Integer)v20).intValue()),((org.jsoup.nodes.Document.OutputSettings)v21));
    Object v22 = null;
    org.junit.Assert.assertNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = "0";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "br";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = "Could not parse attribute query '%s': unexpected token aty '%s'";
    Object v5 = ((org.jsoup.nodes.Element)v3).prependText(((java.lang.String)v4));
    Object v6 = "linlk";
    Object v7 = "tr";
    Object v8 = ((org.jsoup.nodes.Element)v5).getElementsByAttributeValueEnding(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = "td";
    Object v10 = ((org.jsoup.nodes.Element)v5).appendElement(((java.lang.String)v9));
    Object v11 = "hroup";
    Object v12 = ((org.jsoup.nodes.Element)v10).getElementsContainingText(((java.lang.String)v11));
    Object v13 = ((org.jsoup.nodes.Element)v10).dataset();
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = "htm{l";
    Object v1 = "head";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "the";
    Object v4 = ((org.jsoup.nodes.Element)v2).val(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).siblingElements();
    Object v6 = ", URL7=";
    Object v7 = ((org.jsoup.nodes.Element)v4).val(((java.lang.String)v6));
    Object v8 = "bim";
    Object v9 = ((org.jsoup.nodes.Element)v7).getElementById(((java.lang.String)v8));
    Object v10 = "tr";
    Object v11 = ((org.jsoup.nodes.Element)v7).toggleClass(((java.lang.String)v10));
    Object v12 = ((org.jsoup.nodes.Element)v11).clone();
    Object v13 = "Should not b reachable";
    Object v14 = ((org.jsoup.nodes.Element)v12).html(((java.lang.String)v13));
    Object v15 = ((org.jsoup.nodes.Node)v14).unwrap();
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = "0";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "br";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = "Could not parse attribute query '%s': unexpected token aty '%s'";
    Object v5 = ((org.jsoup.nodes.Element)v3).prependText(((java.lang.String)v4));
    Object v6 = "tbody";
    Object v7 = "mReta";
    Object v8 = ((org.jsoup.nodes.Element)v5).getElementsByAttributeValueNot(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = ((org.jsoup.nodes.Element)v5).siblingElements();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = "htm{l";
    Object v1 = "head";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "the";
    Object v4 = ((org.jsoup.nodes.Element)v2).val(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).siblingElements();
    Object v6 = ", URL7=";
    Object v7 = ((org.jsoup.nodes.Element)v4).val(((java.lang.String)v6));
    Object v8 = "bim";
    Object v9 = ((org.jsoup.nodes.Element)v7).getElementById(((java.lang.String)v8));
    Object v10 = "tr";
    Object v11 = ((org.jsoup.nodes.Element)v7).toggleClass(((java.lang.String)v10));
    Object v12 = "htm";
    Object v13 = ((org.jsoup.nodes.Element)v11).getElementsByAttribute(((java.lang.String)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = "0";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "br";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = "Could not parse attribute query '%s': unexpected token aty '%s'";
    Object v5 = ((org.jsoup.nodes.Element)v3).prependText(((java.lang.String)v4));
    ((org.jsoup.nodes.Node)v5).remove();
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = "htm{l";
    Object v1 = "head";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "the";
    Object v4 = ((org.jsoup.nodes.Element)v2).val(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).siblingElements();
    Object v6 = ", URL7=";
    Object v7 = ((org.jsoup.nodes.Element)v4).val(((java.lang.String)v6));
    Object v8 = "bim";
    Object v9 = ((org.jsoup.nodes.Element)v7).getElementById(((java.lang.String)v8));
    Object v10 = "tr";
    Object v11 = ((org.jsoup.nodes.Element)v7).toggleClass(((java.lang.String)v10));
    Object v12 = ((org.jsoup.nodes.Element)v11).clone();
    Object v13 = "tr";
    Object v14 = "c";
    Object v15 = ((org.jsoup.nodes.Element)v12).getElementsByAttributeValue(((java.lang.String)v13),((java.lang.String)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = "0";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "br";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = "style";
    Object v5 = ((org.jsoup.nodes.Element)v3).prependElement(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Element)v5).parents();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = "0";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "br";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = "Could not parse attribute query '%s': unexpected token aty '%s'";
    Object v5 = ((org.jsoup.nodes.Element)v3).prependText(((java.lang.String)v4));
    Object v6 = "linlk";
    Object v7 = "tr";
    Object v8 = ((org.jsoup.nodes.Element)v5).getElementsByAttributeValueEnding(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = "td";
    Object v10 = ((org.jsoup.nodes.Element)v5).appendElement(((java.lang.String)v9));
    Object v11 = ((org.jsoup.nodes.Node)v10).siblingNodes();
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = "htm{l";
    Object v1 = "head";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "the";
    Object v4 = ((org.jsoup.nodes.Element)v2).val(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).siblingElements();
    Object v6 = ", URL7=";
    Object v7 = ((org.jsoup.nodes.Element)v4).val(((java.lang.String)v6));
    Object v8 = "bim";
    Object v9 = ((org.jsoup.nodes.Element)v7).getElementById(((java.lang.String)v8));
    Object v10 = "tr";
    Object v11 = ((org.jsoup.nodes.Element)v7).toggleClass(((java.lang.String)v10));
    Object v12 = ((org.jsoup.nodes.Element)v11).clone();
    Object v13 = "Should not b reachable";
    Object v14 = ((org.jsoup.nodes.Element)v12).html(((java.lang.String)v13));
    Object v15 = ((org.jsoup.nodes.Element)v14).classNames();
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = "htm{l";
    Object v1 = "head";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "the";
    Object v4 = ((org.jsoup.nodes.Element)v2).val(((java.lang.String)v3));
    Object v5 = "hea";
    Object v6 = ((org.jsoup.nodes.Element)v4).removeClass(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Element)v4).clone();
    Object v8 = ((org.jsoup.nodes.Element)v7).classNames();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = "htm{l";
    Object v1 = "head";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "the";
    Object v4 = ((org.jsoup.nodes.Element)v2).val(((java.lang.String)v3));
    Object v5 = "hea";
    Object v6 = ((org.jsoup.nodes.Element)v4).removeClass(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Element)v4).clone();
    Object v8 = ((org.jsoup.nodes.Node)v7).ownerDocument();
    Object v9 = ((org.jsoup.nodes.Node)v8).childNodeSize();
    Object v10 = ((org.jsoup.nodes.Node)v8).ownerDocument();
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = "0";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "br";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = "Could not parse attribute query '%s': unexpected token aty '%s'";
    Object v5 = ((org.jsoup.nodes.Element)v3).prependText(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Element)v5).elementSiblingIndex();
    org.junit.Assert.assertEquals((Object)(0), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = "0";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "br";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = "Could not parse attribute query '%s': unexpected token aty '%s'";
    Object v5 = ((org.jsoup.nodes.Element)v3).prependText(((java.lang.String)v4));
    Object v6 = "th[";
    Object v7 = ((org.jsoup.nodes.Node)v5).attr(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v5).childNodesCopy();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = "0";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "br";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = "Could not parse attribute query '%s': unexpected token aty '%s'";
    Object v5 = ((org.jsoup.nodes.Element)v3).prependText(((java.lang.String)v4));
    Object v6 = "linlk";
    Object v7 = "tr";
    Object v8 = ((org.jsoup.nodes.Element)v5).getElementsByAttributeValueEnding(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = "td";
    Object v10 = ((org.jsoup.nodes.Element)v5).appendElement(((java.lang.String)v9));
    Object v11 = ((org.jsoup.nodes.Element)v10).preserveWhitespace();
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = "0";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "br";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v3).previousElementSibling();
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = "0";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "br";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = "Could not parse attribute query '%s': unexpected token aty '%s'";
    Object v5 = ((org.jsoup.nodes.Element)v3).prependText(((java.lang.String)v4));
    Object v6 = "td";
    Object v7 = ((org.jsoup.nodes.Element)v5).toggleClass(((java.lang.String)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = "0";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "br";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v3).nextElementSibling();
    org.junit.Assert.assertNull(v4);
  }
}
