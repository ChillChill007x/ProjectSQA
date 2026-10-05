package org.jsoup.nodes;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "html";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "html";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "body";
    Object v5 = new java.lang.StringBuilder(((java.lang.String)v4));
    Object v6 = -7;
    Object v7 = new org.jsoup.nodes.Document.OutputSettings();
    ((org.jsoup.nodes.Element)v3).outerHtmlTail(((java.lang.StringBuilder)v5),(((java.lang.Integer)v6).intValue()),((org.jsoup.nodes.Document.OutputSettings)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).previousElementSibling();
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "html";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v3).dataNodes();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).siblingNodes();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "html";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Node)v3).unwrap();
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "html";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Node)v3).ownerDocument();
    Object v5 = ((org.jsoup.nodes.Element)v3).cssSelector();
    org.junit.Assert.assertEquals((Object)("#root"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "html";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v3).lastElementSibling();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "html";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Node)v3).previousSibling();
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "html";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "table";
    Object v5 = ((org.jsoup.nodes.Element)v3).select(((java.lang.String)v4));
    Object v6 = "colgroup";
    Object v7 = ((org.jsoup.nodes.Element)v3).appendElement(((java.lang.String)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "html";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "table";
    Object v5 = ((org.jsoup.nodes.Element)v3).select(((java.lang.String)v4));
    Object v6 = "colgroup";
    Object v7 = ((org.jsoup.nodes.Element)v3).appendElement(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v7).toString();
    Object v9 = "tmoot";
    Object v10 = ((org.jsoup.nodes.Node)v7).hasAttr(((java.lang.String)v9));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "html";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "table";
    Object v5 = ((org.jsoup.nodes.Element)v3).select(((java.lang.String)v4));
    Object v6 = "colgroup";
    Object v7 = ((org.jsoup.nodes.Element)v3).appendElement(((java.lang.String)v6));
    Object v8 = "body";
    Object v9 = new java.lang.StringBuilder(((java.lang.String)v8));
    Object v10 = 1;
    Object v11 = new org.jsoup.nodes.Document.OutputSettings();
    ((org.jsoup.nodes.Element)v7).outerHtmlHead(((java.lang.StringBuilder)v9),(((java.lang.Integer)v10).intValue()),((org.jsoup.nodes.Document.OutputSettings)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "html";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "table";
    Object v5 = ((org.jsoup.nodes.Element)v3).select(((java.lang.String)v4));
    Object v6 = "colgroup";
    Object v7 = ((org.jsoup.nodes.Element)v3).appendElement(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Element)v7).cssSelector();
    org.junit.Assert.assertEquals((Object)("colgroup"), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "html";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "table";
    Object v5 = ((org.jsoup.nodes.Element)v3).select(((java.lang.String)v4));
    Object v6 = "colgroup";
    Object v7 = ((org.jsoup.nodes.Element)v3).appendElement(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Element)v7).previousElementSibling();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "html";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "table";
    Object v5 = ((org.jsoup.nodes.Element)v3).select(((java.lang.String)v4));
    Object v6 = "colgroup";
    Object v7 = ((org.jsoup.nodes.Element)v3).appendElement(((java.lang.String)v6));
    Object v8 = "title";
    Object v9 = ((org.jsoup.nodes.Element)v7).append(((java.lang.String)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "html";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "table";
    Object v5 = ((org.jsoup.nodes.Element)v3).select(((java.lang.String)v4));
    Object v6 = "colgroup";
    Object v7 = ((org.jsoup.nodes.Element)v3).appendElement(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Element)v7).previousElementSibling();
    Object v9 = ((org.jsoup.nodes.Element)v8).hasText();
    org.junit.Assert.assertEquals((Object)(true), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "html";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "table";
    Object v5 = ((org.jsoup.nodes.Element)v3).select(((java.lang.String)v4));
    Object v6 = "colgroup";
    Object v7 = ((org.jsoup.nodes.Element)v3).appendElement(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Element)v7).previousElementSibling();
    Object v9 = new org.jsoup.nodes.Document.OutputSettings();
    Object v10 = ((org.jsoup.nodes.Element)v8).equals(((java.lang.Object)v9));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "html";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "table";
    Object v5 = ((org.jsoup.nodes.Element)v3).select(((java.lang.String)v4));
    Object v6 = "colgroup";
    Object v7 = ((org.jsoup.nodes.Element)v3).appendElement(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Element)v7).previousElementSibling();
    Object v9 = ((org.jsoup.nodes.Element)v8).textNodes();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "html";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "table";
    Object v5 = ((org.jsoup.nodes.Element)v3).select(((java.lang.String)v4));
    Object v6 = "colgroup";
    Object v7 = ((org.jsoup.nodes.Element)v3).appendElement(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Element)v7).previousElementSibling();
    Object v9 = "tbody";
    ((org.jsoup.nodes.Node)v8).setBaseUri(((java.lang.String)v9));
    Object v10 = null;
    Object v11 = ((org.jsoup.nodes.Node)v8).siblingNodes();
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "html";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "table";
    Object v5 = ((org.jsoup.nodes.Element)v3).select(((java.lang.String)v4));
    Object v6 = "colgroup";
    Object v7 = ((org.jsoup.nodes.Element)v3).appendElement(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Element)v7).previousElementSibling();
    Object v9 = ((org.jsoup.nodes.Element)v8).className();
    Object v10 = ((org.jsoup.nodes.Element)v8).val();
    org.junit.Assert.assertEquals((Object)(""), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "html";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "table";
    Object v5 = ((org.jsoup.nodes.Element)v3).select(((java.lang.String)v4));
    Object v6 = "colgroup";
    Object v7 = ((org.jsoup.nodes.Element)v3).appendElement(((java.lang.String)v6));
    Object v8 = "title";
    Object v9 = ((org.jsoup.nodes.Element)v7).append(((java.lang.String)v8));
    Object v10 = ((org.jsoup.nodes.Node)v9).previousSibling();
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "html";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "table";
    Object v5 = ((org.jsoup.nodes.Element)v3).select(((java.lang.String)v4));
    Object v6 = "colgroup";
    Object v7 = ((org.jsoup.nodes.Element)v3).appendElement(((java.lang.String)v6));
    Object v8 = "title";
    Object v9 = ((org.jsoup.nodes.Element)v7).append(((java.lang.String)v8));
    Object v10 = ((org.jsoup.nodes.Element)v9).val();
    org.junit.Assert.assertEquals((Object)(""), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "html";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "table";
    Object v5 = ((org.jsoup.nodes.Element)v3).select(((java.lang.String)v4));
    Object v6 = "colgroup";
    Object v7 = ((org.jsoup.nodes.Element)v3).appendElement(((java.lang.String)v6));
    Object v8 = "htmlJ";
    Object v9 = "s";
    Object v10 = ((org.jsoup.nodes.Element)v7).getElementsByAttributeValueEnding(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = -22;
    Object v12 = "b";
    Object v13 = org.jsoup.Jsoup.parse(((java.lang.String)v12));
    Object v14 = "html";
    Object v15 = ((org.jsoup.nodes.Element)v13).val(((java.lang.String)v14));
    Object v16 = "table";
    Object v17 = ((org.jsoup.nodes.Element)v15).select(((java.lang.String)v16));
    Object v18 = "colgroup";
    Object v19 = ((org.jsoup.nodes.Element)v15).appendElement(((java.lang.String)v18));
    Object v20 = ((org.jsoup.nodes.Element)v19).previousElementSibling();
    Object v21 = "tbody";
    ((org.jsoup.nodes.Node)v20).setBaseUri(((java.lang.String)v21));
    Object v22 = null;
    Object v23 = ((org.jsoup.nodes.Node)v20).siblingNodes();
    Object v24 = ((org.jsoup.nodes.Element)v7).insertChildren((((java.lang.Integer)v11).intValue()),((java.util.Collection)v23));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "html";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "table";
    Object v5 = ((org.jsoup.nodes.Element)v3).select(((java.lang.String)v4));
    Object v6 = "colgroup";
    Object v7 = ((org.jsoup.nodes.Element)v3).appendElement(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Element)v7).previousElementSibling();
    Object v9 = ((org.jsoup.nodes.Element)v8).data();
    org.junit.Assert.assertEquals((Object)(""), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "html";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "table";
    Object v5 = ((org.jsoup.nodes.Element)v3).select(((java.lang.String)v4));
    Object v6 = "colgroup";
    Object v7 = ((org.jsoup.nodes.Element)v3).appendElement(((java.lang.String)v6));
    Object v8 = "op#ion";
    Object v9 = ((org.jsoup.nodes.Node)v7).hasAttr(((java.lang.String)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "html";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "table";
    Object v5 = ((org.jsoup.nodes.Element)v3).select(((java.lang.String)v4));
    Object v6 = "colgroup";
    Object v7 = ((org.jsoup.nodes.Element)v3).appendElement(((java.lang.String)v6));
    Object v8 = "title";
    Object v9 = ((org.jsoup.nodes.Element)v7).append(((java.lang.String)v8));
    Object v10 = "enco&ing";
    Object v11 = ((org.jsoup.nodes.Element)v9).wrap(((java.lang.String)v10));
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "html";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "table";
    Object v5 = ((org.jsoup.nodes.Element)v3).select(((java.lang.String)v4));
    Object v6 = "colgroup";
    Object v7 = ((org.jsoup.nodes.Element)v3).appendElement(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Element)v7).previousElementSibling();
    Object v9 = "b";
    Object v10 = org.jsoup.Jsoup.parse(((java.lang.String)v9));
    Object v11 = ((org.jsoup.nodes.Node)v10).siblingNodes();
    Object v12 = ((org.jsoup.nodes.Element)v8).equals(((java.lang.Object)v11));
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "html";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "table";
    Object v5 = ((org.jsoup.nodes.Element)v3).select(((java.lang.String)v4));
    Object v6 = "colgroup";
    Object v7 = ((org.jsoup.nodes.Element)v3).appendElement(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Element)v7).previousElementSibling();
    Object v9 = "";
    Object v10 = ((org.jsoup.nodes.Element)v8).hasClass(((java.lang.String)v9));
    Object v11 = ((org.jsoup.nodes.Element)v8).empty();
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "html";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "table";
    Object v5 = ((org.jsoup.nodes.Element)v3).select(((java.lang.String)v4));
    Object v6 = "colgroup";
    Object v7 = ((org.jsoup.nodes.Element)v3).appendElement(((java.lang.String)v6));
    Object v8 = "title";
    Object v9 = ((org.jsoup.nodes.Element)v7).append(((java.lang.String)v8));
    Object v10 = ((org.jsoup.nodes.Node)v9).previousSibling();
    Object v11 = ((org.jsoup.nodes.Element)v10).children();
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "html";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "table";
    Object v5 = ((org.jsoup.nodes.Element)v3).select(((java.lang.String)v4));
    Object v6 = "colgroup";
    Object v7 = ((org.jsoup.nodes.Element)v3).appendElement(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Element)v7).previousElementSibling();
    Object v9 = "";
    Object v10 = ((org.jsoup.nodes.Element)v8).hasClass(((java.lang.String)v9));
    Object v11 = ((org.jsoup.nodes.Element)v8).empty();
    Object v12 = ((org.jsoup.nodes.Element)v11).firstElementSibling();
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "html";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v3).data();
    org.junit.Assert.assertEquals((Object)(""), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "html";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "table";
    Object v5 = ((org.jsoup.nodes.Element)v3).select(((java.lang.String)v4));
    Object v6 = "colgroup";
    Object v7 = ((org.jsoup.nodes.Element)v3).appendElement(((java.lang.String)v6));
    Object v8 = "title";
    Object v9 = ((org.jsoup.nodes.Element)v7).append(((java.lang.String)v8));
    Object v10 = ((org.jsoup.nodes.Node)v9).previousSibling();
    Object v11 = ((org.jsoup.nodes.Element)v10).ownText();
    Object v12 = ((org.jsoup.nodes.Element)v10).nextElementSibling();
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "html";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "table";
    Object v5 = ((org.jsoup.nodes.Element)v3).select(((java.lang.String)v4));
    Object v6 = "colgroup";
    Object v7 = ((org.jsoup.nodes.Element)v3).appendElement(((java.lang.String)v6));
    Object v8 = org.jsoup.nodes.Element.preserveWhitespace(((org.jsoup.nodes.Node)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "html";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "table";
    Object v5 = ((org.jsoup.nodes.Element)v3).select(((java.lang.String)v4));
    Object v6 = "colgroup";
    Object v7 = ((org.jsoup.nodes.Element)v3).appendElement(((java.lang.String)v6));
    Object v8 = "title";
    Object v9 = ((org.jsoup.nodes.Element)v7).append(((java.lang.String)v8));
    Object v10 = ((org.jsoup.nodes.Node)v9).unwrap();
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "html";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "table";
    Object v5 = ((org.jsoup.nodes.Element)v3).select(((java.lang.String)v4));
    Object v6 = "colgroup";
    Object v7 = ((org.jsoup.nodes.Element)v3).appendElement(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Element)v7).html();
    org.junit.Assert.assertEquals((Object)(""), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "html";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "table";
    Object v5 = ((org.jsoup.nodes.Element)v3).select(((java.lang.String)v4));
    Object v6 = "colgroup";
    Object v7 = ((org.jsoup.nodes.Element)v3).appendElement(((java.lang.String)v6));
    Object v8 = ":last-child";
    Object v9 = ((org.jsoup.nodes.Node)v7).hasAttr(((java.lang.String)v8));
    Object v10 = ((org.jsoup.nodes.Node)v7).nextSibling();
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = "nav";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "htm^l";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = "nav";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "htm^l";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).nextElementSibling();
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "html";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "table";
    Object v5 = ((org.jsoup.nodes.Element)v3).select(((java.lang.String)v4));
    Object v6 = "colgroup";
    Object v7 = ((org.jsoup.nodes.Element)v3).appendElement(((java.lang.String)v6));
    Object v8 = "title";
    Object v9 = ((org.jsoup.nodes.Element)v7).append(((java.lang.String)v8));
    Object v10 = ((org.jsoup.nodes.Node)v9).previousSibling();
    Object v11 = ((org.jsoup.nodes.Element)v10).lastElementSibling();
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "html";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Node)v3).childNodeSize();
    org.junit.Assert.assertEquals((Object)(1), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "html";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "table";
    Object v5 = ((org.jsoup.nodes.Element)v3).select(((java.lang.String)v4));
    Object v6 = "colgroup";
    Object v7 = ((org.jsoup.nodes.Element)v3).appendElement(((java.lang.String)v6));
    Object v8 = "title";
    Object v9 = ((org.jsoup.nodes.Element)v7).append(((java.lang.String)v8));
    Object v10 = ((org.jsoup.nodes.Element)v9).hashCode();
    org.junit.Assert.assertEquals((Object)(1954839906), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "html";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "table";
    Object v5 = ((org.jsoup.nodes.Element)v3).select(((java.lang.String)v4));
    Object v6 = "colgroup";
    Object v7 = ((org.jsoup.nodes.Element)v3).appendElement(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Element)v7).previousElementSibling();
    Object v9 = ((org.jsoup.nodes.Element)v8).html();
    org.junit.Assert.assertEquals((Object)("<head></head>\n<body>\n b\n</body>"), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = "nav";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "htm^l";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "style";
    Object v6 = "st-ong";
    Object v7 = ((org.jsoup.nodes.Element)v4).getElementsByAttributeValueStarting(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Element)v4).children();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = "nav";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "htm^l";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "srcS";
    Object v6 = ((org.jsoup.nodes.Element)v4).hasClass(((java.lang.String)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "html";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "table";
    Object v5 = ((org.jsoup.nodes.Element)v3).select(((java.lang.String)v4));
    Object v6 = "colgroup";
    Object v7 = ((org.jsoup.nodes.Element)v3).appendElement(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Element)v7).previousElementSibling();
    Object v9 = "";
    Object v10 = ((org.jsoup.nodes.Element)v8).hasClass(((java.lang.String)v9));
    Object v11 = ((org.jsoup.nodes.Element)v8).empty();
    Object v12 = ((org.jsoup.nodes.Element)v11).isBlock();
    org.junit.Assert.assertEquals((Object)(true), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "html";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "table";
    Object v5 = ((org.jsoup.nodes.Element)v3).select(((java.lang.String)v4));
    Object v6 = "colgroup";
    Object v7 = ((org.jsoup.nodes.Element)v3).appendElement(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Element)v7).hasText();
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = "nav";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "htm^l";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "co\\l";
    Object v6 = ((org.jsoup.nodes.Element)v4).getElementsByTag(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Element)v4).nextElementSibling();
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "html";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "table";
    Object v5 = ((org.jsoup.nodes.Element)v3).select(((java.lang.String)v4));
    Object v6 = "colgroup";
    Object v7 = ((org.jsoup.nodes.Element)v3).appendElement(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Element)v7).previousElementSibling();
    Object v9 = ((org.jsoup.nodes.Element)v8).dataNodes();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = "nav";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "htm^l";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "tfoot";
    Object v6 = ((org.jsoup.nodes.Element)v4).val(((java.lang.String)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "html";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "table";
    Object v5 = ((org.jsoup.nodes.Element)v3).select(((java.lang.String)v4));
    Object v6 = "colgroup";
    Object v7 = ((org.jsoup.nodes.Element)v3).appendElement(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Element)v7).clone();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "html";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "table";
    Object v5 = ((org.jsoup.nodes.Element)v3).select(((java.lang.String)v4));
    Object v6 = "colgroup";
    Object v7 = ((org.jsoup.nodes.Element)v3).appendElement(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Element)v7).previousElementSibling();
    Object v9 = "";
    Object v10 = ((org.jsoup.nodes.Element)v8).hasClass(((java.lang.String)v9));
    Object v11 = ((org.jsoup.nodes.Element)v8).empty();
    Object v12 = ((org.jsoup.nodes.Element)v11).firstElementSibling();
    Object v13 = "body";
    Object v14 = ((org.jsoup.nodes.Node)v12).hasAttr(((java.lang.String)v13));
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = "nav";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "htm^l";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "tfoo";
    Object v6 = ((org.jsoup.nodes.Element)v4).hasClass(((java.lang.String)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = "nav";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "htm^l";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "h/ml";
    Object v6 = ((org.jsoup.nodes.Element)v4).getElementById(((java.lang.String)v5));
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "html";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "table";
    Object v5 = ((org.jsoup.nodes.Element)v3).select(((java.lang.String)v4));
    Object v6 = "colgroup";
    Object v7 = ((org.jsoup.nodes.Element)v3).appendElement(((java.lang.String)v6));
    Object v8 = "title";
    Object v9 = ((org.jsoup.nodes.Element)v7).append(((java.lang.String)v8));
    Object v10 = ((org.jsoup.nodes.Node)v9).previousSibling();
    Object v11 = ((org.jsoup.nodes.Element)v10).ownText();
    Object v12 = ((org.jsoup.nodes.Element)v10).nextElementSibling();
    Object v13 = ((org.jsoup.nodes.Element)v12).previousElementSibling();
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "html";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "table";
    Object v5 = ((org.jsoup.nodes.Element)v3).select(((java.lang.String)v4));
    Object v6 = "colgroup";
    Object v7 = ((org.jsoup.nodes.Element)v3).appendElement(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Element)v7).previousElementSibling();
    Object v9 = "";
    Object v10 = ((org.jsoup.nodes.Element)v8).hasClass(((java.lang.String)v9));
    Object v11 = ((org.jsoup.nodes.Element)v8).empty();
    Object v12 = ((org.jsoup.nodes.Element)v11).className();
    org.junit.Assert.assertEquals((Object)(""), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = "nav";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "htm^l";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = 32;
    Object v6 = ((org.jsoup.nodes.Element)v4).child((((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "html";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "table";
    Object v5 = ((org.jsoup.nodes.Element)v3).select(((java.lang.String)v4));
    Object v6 = "colgroup";
    Object v7 = ((org.jsoup.nodes.Element)v3).appendElement(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Element)v7).previousElementSibling();
    Object v9 = "body";
    Object v10 = new java.lang.StringBuilder(((java.lang.String)v9));
    Object v11 = 2;
    Object v12 = new org.jsoup.nodes.Document.OutputSettings();
    ((org.jsoup.nodes.Element)v8).outerHtmlTail(((java.lang.StringBuilder)v10),(((java.lang.Integer)v11).intValue()),((org.jsoup.nodes.Document.OutputSettings)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "html";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "table";
    Object v5 = ((org.jsoup.nodes.Element)v3).select(((java.lang.String)v4));
    Object v6 = "colgroup";
    Object v7 = ((org.jsoup.nodes.Element)v3).appendElement(((java.lang.String)v6));
    Object v8 = "title";
    Object v9 = ((org.jsoup.nodes.Element)v7).append(((java.lang.String)v8));
    Object v10 = "thead";
    Object v11 = ((org.jsoup.nodes.Node)v9).attr(((java.lang.String)v10));
    org.junit.Assert.assertEquals((Object)(""), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "html";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "table";
    Object v5 = ((org.jsoup.nodes.Element)v3).select(((java.lang.String)v4));
    Object v6 = "colgroup";
    Object v7 = ((org.jsoup.nodes.Element)v3).appendElement(((java.lang.String)v6));
    Object v8 = "title";
    Object v9 = ((org.jsoup.nodes.Element)v7).append(((java.lang.String)v8));
    Object v10 = "htmlX";
    Object v11 = ((org.jsoup.nodes.Element)v9).getElementById(((java.lang.String)v10));
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = "nav";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "htm^l";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = ((org.jsoup.nodes.Node)v4).previousSibling();
    Object v6 = ((org.jsoup.nodes.Element)v4).hashCode();
    org.junit.Assert.assertEquals((Object)(-2053660226), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = "nav";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "htm^l";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "%20";
    Object v6 = java.util.regex.Pattern.compile(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Element)v4).getElementsMatchingText(((java.util.regex.Pattern)v6));
    Object v8 = ((org.jsoup.nodes.Element)v4).data();
    org.junit.Assert.assertEquals((Object)(""), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = "nav";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "htm^l";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "@p";
    Object v6 = ((org.jsoup.nodes.Element)v4).toggleClass(((java.lang.String)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = "nav";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "htm^l";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "@p";
    Object v6 = ((org.jsoup.nodes.Element)v4).toggleClass(((java.lang.String)v5));
    Object v7 = "nav";
    Object v8 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v7));
    Object v9 = "htm^l";
    Object v10 = new org.jsoup.nodes.Attributes();
    Object v11 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v8),((java.lang.String)v9),((org.jsoup.nodes.Attributes)v10));
    Object v12 = ((org.jsoup.nodes.Element)v6).prependChild(((org.jsoup.nodes.Node)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "html";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "table";
    Object v5 = ((org.jsoup.nodes.Element)v3).select(((java.lang.String)v4));
    Object v6 = "colgroup";
    Object v7 = ((org.jsoup.nodes.Element)v3).appendElement(((java.lang.String)v6));
    Object v8 = "title";
    Object v9 = ((org.jsoup.nodes.Element)v7).append(((java.lang.String)v8));
    Object v10 = ((org.jsoup.nodes.Node)v9).previousSibling();
    Object v11 = ((org.jsoup.nodes.Element)v10).cssSelector();
    org.junit.Assert.assertEquals((Object)("html"), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "html";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "table";
    Object v5 = ((org.jsoup.nodes.Element)v3).select(((java.lang.String)v4));
    Object v6 = "colgroup";
    Object v7 = ((org.jsoup.nodes.Element)v3).appendElement(((java.lang.String)v6));
    Object v8 = "title";
    Object v9 = ((org.jsoup.nodes.Element)v7).append(((java.lang.String)v8));
    Object v10 = ((org.jsoup.nodes.Node)v9).previousSibling();
    Object v11 = ((org.jsoup.nodes.Element)v10).ownText();
    Object v12 = ((org.jsoup.nodes.Element)v10).nextElementSibling();
    Object v13 = ((org.jsoup.nodes.Element)v12).html();
    org.junit.Assert.assertEquals((Object)(""), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = "nav";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "htm^l";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "body";
    Object v6 = new java.lang.StringBuilder(((java.lang.String)v5));
    Object v7 = 0;
    Object v8 = Character.valueOf((char)1);
    Object v9 = ((java.lang.StringBuilder)v6).insert((((java.lang.Integer)v7).intValue()),(((java.lang.Character)v8).charValue()));
    Object v10 = 25;
    Object v11 = new org.jsoup.nodes.Document.OutputSettings();
    ((org.jsoup.nodes.Element)v4).outerHtmlHead(((java.lang.StringBuilder)v6),(((java.lang.Integer)v10).intValue()),((org.jsoup.nodes.Document.OutputSettings)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = "nav";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "htm^l";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "tfoot";
    Object v6 = ((org.jsoup.nodes.Element)v4).val(((java.lang.String)v5));
    Object v7 = "th";
    Object v8 = ((org.jsoup.nodes.Element)v6).tagName(((java.lang.String)v7));
    Object v9 = ((org.jsoup.nodes.Element)v6).getAllElements();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "html";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "table";
    Object v5 = ((org.jsoup.nodes.Element)v3).select(((java.lang.String)v4));
    Object v6 = "colgroup";
    Object v7 = ((org.jsoup.nodes.Element)v3).appendElement(((java.lang.String)v6));
    Object v8 = "title";
    Object v9 = ((org.jsoup.nodes.Element)v7).append(((java.lang.String)v8));
    Object v10 = ((org.jsoup.nodes.Node)v9).previousSibling();
    Object v11 = "body";
    Object v12 = new java.lang.StringBuilder(((java.lang.String)v11));
    Object v13 = ((org.jsoup.nodes.Element)v10).equals(((java.lang.Object)v12));
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = "nav";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "htm^l";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "@p";
    Object v6 = ((org.jsoup.nodes.Element)v4).toggleClass(((java.lang.String)v5));
    Object v7 = "nav";
    Object v8 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v7));
    Object v9 = "htm^l";
    Object v10 = new org.jsoup.nodes.Attributes();
    Object v11 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v8),((java.lang.String)v9),((org.jsoup.nodes.Attributes)v10));
    Object v12 = ((org.jsoup.nodes.Element)v6).prependChild(((org.jsoup.nodes.Node)v11));
    Object v13 = 0;
    Object v14 = "nav";
    Object v15 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v14));
    Object v16 = "htm^l";
    Object v17 = new org.jsoup.nodes.Attributes();
    Object v18 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v15),((java.lang.String)v16),((org.jsoup.nodes.Attributes)v17));
    Object v19 = "style";
    Object v20 = "st-ong";
    Object v21 = ((org.jsoup.nodes.Element)v18).getElementsByAttributeValueStarting(((java.lang.String)v19),((java.lang.String)v20));
    Object v22 = ((org.jsoup.nodes.Element)v18).children();
    Object v23 = ((org.jsoup.nodes.Element)v12).insertChildren((((java.lang.Integer)v13).intValue()),((java.util.Collection)v22));
    org.junit.Assert.assertNotNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "html";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "table";
    Object v5 = ((org.jsoup.nodes.Element)v3).select(((java.lang.String)v4));
    Object v6 = "colgroup";
    Object v7 = ((org.jsoup.nodes.Element)v3).appendElement(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Element)v7).previousElementSibling();
    Object v9 = "";
    Object v10 = ((org.jsoup.nodes.Element)v8).hasClass(((java.lang.String)v9));
    Object v11 = ((org.jsoup.nodes.Element)v8).empty();
    Object v12 = ((org.jsoup.nodes.Element)v11).firstElementSibling();
    Object v13 = ((org.jsoup.nodes.Element)v12).textNodes();
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "html";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "table";
    Object v5 = ((org.jsoup.nodes.Element)v3).select(((java.lang.String)v4));
    Object v6 = "colgroup";
    Object v7 = ((org.jsoup.nodes.Element)v3).appendElement(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Element)v7).previousElementSibling();
    ((org.jsoup.nodes.Node)v8).remove();
    Object v9 = null;
    Object v10 = ((org.jsoup.nodes.Node)v8).nextSibling();
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = "nav";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "htm^l";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "@p";
    Object v6 = ((org.jsoup.nodes.Element)v4).toggleClass(((java.lang.String)v5));
    Object v7 = "select";
    Object v8 = ((org.jsoup.nodes.Element)v6).after(((java.lang.String)v7));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "html";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "table";
    Object v5 = ((org.jsoup.nodes.Element)v3).select(((java.lang.String)v4));
    Object v6 = "colgroup";
    Object v7 = ((org.jsoup.nodes.Element)v3).appendElement(((java.lang.String)v6));
    Object v8 = "title";
    Object v9 = ((org.jsoup.nodes.Element)v7).append(((java.lang.String)v8));
    Object v10 = ((org.jsoup.nodes.Node)v9).previousSibling();
    Object v11 = ((org.jsoup.nodes.Element)v10).ownText();
    Object v12 = ((org.jsoup.nodes.Element)v10).nextElementSibling();
    Object v13 = ((org.jsoup.nodes.Element)v12).previousElementSibling();
    Object v14 = ((org.jsoup.nodes.Element)v13).parents();
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "html";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "table";
    Object v5 = ((org.jsoup.nodes.Element)v3).select(((java.lang.String)v4));
    Object v6 = "colgroup";
    Object v7 = ((org.jsoup.nodes.Element)v3).appendElement(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Element)v7).previousElementSibling();
    Object v9 = ((org.jsoup.nodes.Node)v8).siblingNodes();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "html";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "table";
    Object v5 = ((org.jsoup.nodes.Element)v3).select(((java.lang.String)v4));
    Object v6 = "colgroup";
    Object v7 = ((org.jsoup.nodes.Element)v3).appendElement(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Element)v7).previousElementSibling();
    Object v9 = "";
    Object v10 = ((org.jsoup.nodes.Element)v8).hasClass(((java.lang.String)v9));
    Object v11 = ((org.jsoup.nodes.Element)v8).empty();
    Object v12 = ((org.jsoup.nodes.Element)v11).firstElementSibling();
    Object v13 = "";
    Object v14 = ((org.jsoup.nodes.Element)v12).toggleClass(((java.lang.String)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "html";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "table";
    Object v5 = ((org.jsoup.nodes.Element)v3).select(((java.lang.String)v4));
    Object v6 = "colgroup";
    Object v7 = ((org.jsoup.nodes.Element)v3).appendElement(((java.lang.String)v6));
    Object v8 = "title";
    Object v9 = ((org.jsoup.nodes.Element)v7).append(((java.lang.String)v8));
    Object v10 = ((org.jsoup.nodes.Node)v9).previousSibling();
    Object v11 = ((org.jsoup.nodes.Element)v10).ownText();
    Object v12 = ((org.jsoup.nodes.Element)v10).nextElementSibling();
    Object v13 = "Content-Encoding";
    Object v14 = ((org.jsoup.nodes.Element)v12).select(((java.lang.String)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = "nav";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "htm^l";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "body";
    Object v6 = new java.lang.StringBuilder(((java.lang.String)v5));
    Object v7 = 1;
    Object v8 = new org.jsoup.nodes.Document.OutputSettings();
    ((org.jsoup.nodes.Element)v4).outerHtmlHead(((java.lang.StringBuilder)v6),(((java.lang.Integer)v7).intValue()),((org.jsoup.nodes.Document.OutputSettings)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "html";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "table";
    Object v5 = ((org.jsoup.nodes.Element)v3).select(((java.lang.String)v4));
    Object v6 = "colgroup";
    Object v7 = ((org.jsoup.nodes.Element)v3).appendElement(((java.lang.String)v6));
    Object v8 = "col";
    Object v9 = ((org.jsoup.nodes.Node)v7).absUrl(((java.lang.String)v8));
    org.junit.Assert.assertEquals((Object)(""), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = "nav";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "htm^l";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = -21;
    Object v6 = "b";
    Object v7 = org.jsoup.Jsoup.parse(((java.lang.String)v6));
    Object v8 = "html";
    Object v9 = ((org.jsoup.nodes.Element)v7).val(((java.lang.String)v8));
    Object v10 = "table";
    Object v11 = ((org.jsoup.nodes.Element)v9).select(((java.lang.String)v10));
    Object v12 = "colgroup";
    Object v13 = ((org.jsoup.nodes.Element)v9).appendElement(((java.lang.String)v12));
    Object v14 = ((org.jsoup.nodes.Element)v13).previousElementSibling();
    Object v15 = ((org.jsoup.nodes.Node)v14).siblingNodes();
    Object v16 = ((org.jsoup.nodes.Element)v4).insertChildren((((java.lang.Integer)v5).intValue()),((java.util.Collection)v15));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = "nav";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "htm^l";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "@p";
    Object v6 = ((org.jsoup.nodes.Element)v4).toggleClass(((java.lang.String)v5));
    Object v7 = "cogroup";
    Object v8 = ((org.jsoup.nodes.Element)v6).hasClass(((java.lang.String)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = "nav";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "htm^l";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "@p";
    Object v6 = ((org.jsoup.nodes.Element)v4).toggleClass(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Element)v6).val();
    org.junit.Assert.assertEquals((Object)(""), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = "nav";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "htm^l";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "tfoot";
    Object v6 = ((org.jsoup.nodes.Element)v4).val(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Node)v6).ownerDocument();
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "html";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "table";
    Object v5 = ((org.jsoup.nodes.Element)v3).select(((java.lang.String)v4));
    Object v6 = "colgroup";
    Object v7 = ((org.jsoup.nodes.Element)v3).appendElement(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Element)v7).previousElementSibling();
    Object v9 = "";
    Object v10 = ((org.jsoup.nodes.Element)v8).hasClass(((java.lang.String)v9));
    Object v11 = ((org.jsoup.nodes.Element)v8).empty();
    Object v12 = ((org.jsoup.nodes.Element)v11).firstElementSibling();
    Object v13 = "";
    Object v14 = ((org.jsoup.nodes.Element)v12).append(((java.lang.String)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = "nav";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "htm^l";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).siblingElements();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "html";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "table";
    Object v5 = ((org.jsoup.nodes.Element)v3).select(((java.lang.String)v4));
    Object v6 = "colgroup";
    Object v7 = ((org.jsoup.nodes.Element)v3).appendElement(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Element)v7).previousElementSibling();
    Object v9 = "";
    Object v10 = ((org.jsoup.nodes.Element)v8).hasClass(((java.lang.String)v9));
    Object v11 = ((org.jsoup.nodes.Element)v8).empty();
    Object v12 = ((org.jsoup.nodes.Element)v11).lastElementSibling();
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "html";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "table";
    Object v5 = ((org.jsoup.nodes.Element)v3).select(((java.lang.String)v4));
    Object v6 = "colgroup";
    Object v7 = ((org.jsoup.nodes.Element)v3).appendElement(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Element)v7).siblingElements();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "html";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "table";
    Object v5 = ((org.jsoup.nodes.Element)v3).select(((java.lang.String)v4));
    Object v6 = "colgroup";
    Object v7 = ((org.jsoup.nodes.Element)v3).appendElement(((java.lang.String)v6));
    Object v8 = "title";
    Object v9 = ((org.jsoup.nodes.Element)v7).append(((java.lang.String)v8));
    Object v10 = ((org.jsoup.nodes.Node)v9).previousSibling();
    Object v11 = ((org.jsoup.nodes.Element)v10).ownText();
    Object v12 = ((org.jsoup.nodes.Element)v10).nextElementSibling();
    Object v13 = ((org.jsoup.nodes.Element)v12).elementSiblingIndex();
    org.junit.Assert.assertEquals((Object)(1), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "html";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "table";
    Object v5 = ((org.jsoup.nodes.Element)v3).select(((java.lang.String)v4));
    Object v6 = "colgroup";
    Object v7 = ((org.jsoup.nodes.Element)v3).appendElement(((java.lang.String)v6));
    Object v8 = "title";
    Object v9 = ((org.jsoup.nodes.Element)v7).append(((java.lang.String)v8));
    Object v10 = ((org.jsoup.nodes.Node)v9).previousSibling();
    Object v11 = "tbody";
    ((org.jsoup.nodes.Node)v10).setBaseUri(((java.lang.String)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "html";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "table";
    Object v5 = ((org.jsoup.nodes.Element)v3).select(((java.lang.String)v4));
    Object v6 = "colgroup";
    Object v7 = ((org.jsoup.nodes.Element)v3).appendElement(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Element)v7).previousElementSibling();
    Object v9 = org.jsoup.nodes.Element.preserveWhitespace(((org.jsoup.nodes.Node)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = "nav";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "htm^l";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "@p";
    Object v6 = ((org.jsoup.nodes.Element)v4).toggleClass(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Node)v6).unwrap();
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "html";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "table";
    Object v5 = ((org.jsoup.nodes.Element)v3).select(((java.lang.String)v4));
    Object v6 = "colgroup";
    Object v7 = ((org.jsoup.nodes.Element)v3).appendElement(((java.lang.String)v6));
    Object v8 = "title";
    Object v9 = ((org.jsoup.nodes.Element)v7).append(((java.lang.String)v8));
    Object v10 = "V";
    Object v11 = ((org.jsoup.nodes.Element)v9).tagName(((java.lang.String)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = "nav";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "htm^l";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "@p";
    Object v6 = ((org.jsoup.nodes.Element)v4).toggleClass(((java.lang.String)v5));
    Object v7 = "nav";
    Object v8 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v7));
    Object v9 = "htm^l";
    Object v10 = new org.jsoup.nodes.Attributes();
    Object v11 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v8),((java.lang.String)v9),((org.jsoup.nodes.Attributes)v10));
    Object v12 = ((org.jsoup.nodes.Element)v6).prependChild(((org.jsoup.nodes.Node)v11));
    Object v13 = "?";
    Object v14 = ((org.jsoup.nodes.Element)v12).getElementsContainingOwnText(((java.lang.String)v13));
    Object v15 = "colgr+oup";
    Object v16 = ((org.jsoup.nodes.Element)v12).getElementsMatchingText(((java.lang.String)v15));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = "nav";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "htm^l";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "@p";
    Object v6 = ((org.jsoup.nodes.Element)v4).toggleClass(((java.lang.String)v5));
    Object v7 = "h7ml";
    Object v8 = ((org.jsoup.nodes.Element)v6).prepend(((java.lang.String)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = "nav";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "htm^l";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "noframeS";
    Object v6 = ((org.jsoup.nodes.Element)v4).toggleClass(((java.lang.String)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = "nav";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "htm^l";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "@p";
    Object v6 = ((org.jsoup.nodes.Element)v4).toggleClass(((java.lang.String)v5));
    Object v7 = "nav";
    Object v8 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v7));
    Object v9 = "htm^l";
    Object v10 = new org.jsoup.nodes.Attributes();
    Object v11 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v8),((java.lang.String)v9),((org.jsoup.nodes.Attributes)v10));
    Object v12 = ((org.jsoup.nodes.Element)v6).prependChild(((org.jsoup.nodes.Node)v11));
    Object v13 = "body";
    Object v14 = new java.lang.StringBuilder(((java.lang.String)v13));
    Object v15 = 1;
    Object v16 = new org.jsoup.nodes.Document.OutputSettings();
    ((org.jsoup.nodes.Element)v12).outerHtmlTail(((java.lang.StringBuilder)v14),(((java.lang.Integer)v15).intValue()),((org.jsoup.nodes.Document.OutputSettings)v16));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "html";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "table";
    Object v5 = ((org.jsoup.nodes.Element)v3).select(((java.lang.String)v4));
    Object v6 = "colgroup";
    Object v7 = ((org.jsoup.nodes.Element)v3).appendElement(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Element)v7).previousElementSibling();
    Object v9 = "";
    Object v10 = ((org.jsoup.nodes.Element)v8).hasClass(((java.lang.String)v9));
    Object v11 = ((org.jsoup.nodes.Element)v8).empty();
    Object v12 = ((org.jsoup.nodes.Element)v11).firstElementSibling();
    Object v13 = "head";
    Object v14 = ((org.jsoup.nodes.Node)v12).hasAttr(((java.lang.String)v13));
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = "nav";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "htm^l";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "@p";
    Object v6 = ((org.jsoup.nodes.Element)v4).toggleClass(((java.lang.String)v5));
    Object v7 = "nav";
    Object v8 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v7));
    Object v9 = "htm^l";
    Object v10 = new org.jsoup.nodes.Attributes();
    Object v11 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v8),((java.lang.String)v9),((org.jsoup.nodes.Attributes)v10));
    Object v12 = ((org.jsoup.nodes.Element)v6).prependChild(((org.jsoup.nodes.Node)v11));
    Object v13 = ((org.jsoup.nodes.Element)v12).siblingElements();
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = "nav";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "htm^l";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "@p";
    Object v6 = ((org.jsoup.nodes.Element)v4).toggleClass(((java.lang.String)v5));
    Object v7 = "h7ml";
    Object v8 = ((org.jsoup.nodes.Element)v6).prepend(((java.lang.String)v7));
    Object v9 = "h1";
    Object v10 = ((org.jsoup.nodes.Element)v8).append(((java.lang.String)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = "nav";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "htm^l";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "@p";
    Object v6 = ((org.jsoup.nodes.Element)v4).toggleClass(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Element)v6).dataNodes();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "html";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "table";
    Object v5 = ((org.jsoup.nodes.Element)v3).select(((java.lang.String)v4));
    Object v6 = "colgroup";
    Object v7 = ((org.jsoup.nodes.Element)v3).appendElement(((java.lang.String)v6));
    Object v8 = "title";
    Object v9 = ((org.jsoup.nodes.Element)v7).append(((java.lang.String)v8));
    Object v10 = ((org.jsoup.nodes.Node)v9).previousSibling();
    Object v11 = ((org.jsoup.nodes.Element)v10).ownText();
    Object v12 = ((org.jsoup.nodes.Element)v10).nextElementSibling();
    Object v13 = ((org.jsoup.nodes.Element)v12).previousElementSibling();
    Object v14 = "br";
    Object v15 = ((org.jsoup.nodes.Element)v13).getElementById(((java.lang.String)v14));
    org.junit.Assert.assertNull(v15);
  }
}
