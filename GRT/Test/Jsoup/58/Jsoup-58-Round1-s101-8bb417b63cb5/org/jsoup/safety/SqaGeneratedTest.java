package org.jsoup.safety;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v2 = "F3";
    Object v3 = ((org.jsoup.safety.Cleaner)v1).isValidBodyHtml(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(true), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v2 = "t]";
    Object v3 = ((org.jsoup.safety.Cleaner)v1).isValidBodyHtml(((java.lang.String)v2));
    Object v4 = "";
    Object v5 = new org.jsoup.nodes.Document(((java.lang.String)v4));
    Object v6 = ((org.jsoup.safety.Cleaner)v1).isValid(((org.jsoup.nodes.Document)v5));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v2 = "tablec";
    Object v3 = ((org.jsoup.safety.Cleaner)v1).isValidBodyHtml(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(true), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v2 = "";
    Object v3 = new org.jsoup.nodes.Document(((java.lang.String)v2));
    Object v4 = ((org.jsoup.safety.Cleaner)v1).isValid(((org.jsoup.nodes.Document)v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v2 = "[";
    Object v3 = ((org.jsoup.safety.Cleaner)v1).isValidBodyHtml(((java.lang.String)v2));
    Object v4 = "";
    Object v5 = new org.jsoup.nodes.Document(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Element)v5).textNodes();
    Object v7 = ((org.jsoup.safety.Cleaner)v1).isValid(((org.jsoup.nodes.Document)v5));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v2 = "";
    Object v3 = new org.jsoup.nodes.Document(((java.lang.String)v2));
    Object v4 = ((org.jsoup.safety.Cleaner)v1).clean(((org.jsoup.nodes.Document)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v2 = "";
    Object v3 = new org.jsoup.nodes.Document(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Node)v3).siblingNodes();
    Object v5 = ((org.jsoup.safety.Cleaner)v1).isValid(((org.jsoup.nodes.Document)v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v2 = "";
    Object v3 = new org.jsoup.nodes.Document(((java.lang.String)v2));
    Object v4 = ((org.jsoup.safety.Cleaner)v1).clean(((org.jsoup.nodes.Document)v3));
    Object v5 = "";
    Object v6 = new org.jsoup.nodes.Document(((java.lang.String)v5));
    Object v7 = ((org.jsoup.safety.Cleaner)v1).clean(((org.jsoup.nodes.Document)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v2 = "html";
    Object v3 = ((org.jsoup.safety.Cleaner)v1).isValidBodyHtml(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(true), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v2 = "tabl";
    Object v3 = ((org.jsoup.safety.Cleaner)v1).isValidBodyHtml(((java.lang.String)v2));
    Object v4 = "";
    Object v5 = new org.jsoup.nodes.Document(((java.lang.String)v4));
    Object v6 = ((org.jsoup.safety.Cleaner)v1).isValid(((org.jsoup.nodes.Document)v5));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v2 = "ca";
    Object v3 = ((org.jsoup.safety.Cleaner)v1).isValidBodyHtml(((java.lang.String)v2));
    Object v4 = "";
    Object v5 = new org.jsoup.nodes.Document(((java.lang.String)v4));
    Object v6 = org.jsoup.nodes.Document.QuirksMode.limitedQuirks;
    Object v7 = ((org.jsoup.nodes.Document)v5).quirksMode(((org.jsoup.nodes.Document.QuirksMode)v6));
    Object v8 = ((org.jsoup.safety.Cleaner)v1).isValid(((org.jsoup.nodes.Document)v5));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v2 = org.jsoup.safety.Whitelist.none();
    Object v3 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v2));
    Object v4 = "";
    Object v5 = new org.jsoup.nodes.Document(((java.lang.String)v4));
    Object v6 = ((org.jsoup.safety.Cleaner)v3).clean(((org.jsoup.nodes.Document)v5));
    Object v7 = "";
    Object v8 = new org.jsoup.nodes.Document(((java.lang.String)v7));
    Object v9 = ((org.jsoup.safety.Cleaner)v3).clean(((org.jsoup.nodes.Document)v8));
    Object v10 = ((org.jsoup.safety.Cleaner)v1).clean(((org.jsoup.nodes.Document)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v2 = "";
    Object v3 = new org.jsoup.nodes.Document(((java.lang.String)v2));
    Object v4 = "small";
    Object v5 = "html";
    Object v6 = ((org.jsoup.nodes.Element)v3).getElementsByAttributeValueStarting(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((org.jsoup.safety.Cleaner)v1).isValid(((org.jsoup.nodes.Document)v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v2 = "colgroXp";
    Object v3 = ((org.jsoup.safety.Cleaner)v1).isValidBodyHtml(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(true), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v2 = "tdQ";
    Object v3 = ((org.jsoup.safety.Cleaner)v1).isValidBodyHtml(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(true), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v2 = "";
    Object v3 = new org.jsoup.nodes.Document(((java.lang.String)v2));
    Object v4 = "oject";
    Object v5 = ((org.jsoup.nodes.Element)v3).getElementsContainingText(((java.lang.String)v4));
    Object v6 = ((org.jsoup.safety.Cleaner)v1).isValid(((org.jsoup.nodes.Document)v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v2 = "nof";
    Object v3 = ((org.jsoup.safety.Cleaner)v1).isValidBodyHtml(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(true), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v2 = "c\"te";
    Object v3 = ((org.jsoup.safety.Cleaner)v1).isValidBodyHtml(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(true), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v2 = "";
    Object v3 = new org.jsoup.nodes.Document(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v3).data();
    Object v5 = ((org.jsoup.safety.Cleaner)v1).clean(((org.jsoup.nodes.Document)v3));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v2 = "caption";
    Object v3 = ((org.jsoup.safety.Cleaner)v1).isValidBodyHtml(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(true), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v2 = "tra]k";
    Object v3 = ((org.jsoup.safety.Cleaner)v1).isValidBodyHtml(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(true), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v2 = org.jsoup.safety.Whitelist.none();
    Object v3 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v2));
    Object v4 = "";
    Object v5 = new org.jsoup.nodes.Document(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Element)v5).data();
    Object v7 = ((org.jsoup.safety.Cleaner)v3).clean(((org.jsoup.nodes.Document)v5));
    Object v8 = ((org.jsoup.safety.Cleaner)v1).clean(((org.jsoup.nodes.Document)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v2 = "styNe";
    Object v3 = ((org.jsoup.safety.Cleaner)v1).isValidBodyHtml(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(true), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v2 = "basefon";
    Object v3 = ((org.jsoup.safety.Cleaner)v1).isValidBodyHtml(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(true), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v2 = "thead";
    Object v3 = ((org.jsoup.safety.Cleaner)v1).isValidBodyHtml(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(true), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v2 = "Lside";
    Object v3 = ((org.jsoup.safety.Cleaner)v1).isValidBodyHtml(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(true), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v2 = "";
    Object v3 = new org.jsoup.nodes.Document(((java.lang.String)v2));
    Object v4 = "tbody";
    Object v5 = ((org.jsoup.nodes.Element)v3).addClass(((java.lang.String)v4));
    Object v6 = ((org.jsoup.safety.Cleaner)v1).clean(((org.jsoup.nodes.Document)v3));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v2 = org.jsoup.safety.Whitelist.none();
    Object v3 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v2));
    Object v4 = "";
    Object v5 = new org.jsoup.nodes.Document(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Element)v5).data();
    Object v7 = ((org.jsoup.safety.Cleaner)v3).clean(((org.jsoup.nodes.Document)v5));
    Object v8 = ((org.jsoup.safety.Cleaner)v1).isValid(((org.jsoup.nodes.Document)v7));
    Object v9 = "";
    Object v10 = new org.jsoup.nodes.Document(((java.lang.String)v9));
    Object v11 = ((org.jsoup.safety.Cleaner)v1).isValid(((org.jsoup.nodes.Document)v10));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v2 = "optgroup";
    Object v3 = ((org.jsoup.safety.Cleaner)v1).isValidBodyHtml(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(true), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v2 = "";
    Object v3 = new org.jsoup.nodes.Document(((java.lang.String)v2));
    Object v4 = "blockquote";
    Object v5 = ((org.jsoup.nodes.Element)v3).getElementsByAttribute(((java.lang.String)v4));
    Object v6 = ((org.jsoup.safety.Cleaner)v1).clean(((org.jsoup.nodes.Document)v3));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v2 = "t";
    Object v3 = ((org.jsoup.safety.Cleaner)v1).isValidBodyHtml(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(true), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v2 = "li";
    Object v3 = ((org.jsoup.safety.Cleaner)v1).isValidBodyHtml(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(true), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v2 = "tit_e";
    Object v3 = ((org.jsoup.safety.Cleaner)v1).isValidBodyHtml(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(true), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v2 = org.jsoup.safety.Whitelist.none();
    Object v3 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v2));
    Object v4 = "";
    Object v5 = new org.jsoup.nodes.Document(((java.lang.String)v4));
    Object v6 = "blockquote";
    Object v7 = ((org.jsoup.nodes.Element)v5).getElementsByAttribute(((java.lang.String)v6));
    Object v8 = ((org.jsoup.safety.Cleaner)v3).clean(((org.jsoup.nodes.Document)v5));
    Object v9 = ((org.jsoup.safety.Cleaner)v1).isValid(((org.jsoup.nodes.Document)v8));
    Object v10 = org.jsoup.safety.Whitelist.none();
    Object v11 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v10));
    Object v12 = "";
    Object v13 = new org.jsoup.nodes.Document(((java.lang.String)v12));
    Object v14 = ((org.jsoup.nodes.Element)v13).data();
    Object v15 = ((org.jsoup.safety.Cleaner)v11).clean(((org.jsoup.nodes.Document)v13));
    Object v16 = ((org.jsoup.safety.Cleaner)v1).clean(((org.jsoup.nodes.Document)v15));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v2 = "hea";
    Object v3 = ((org.jsoup.safety.Cleaner)v1).isValidBodyHtml(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(true), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v2 = "X";
    Object v3 = ((org.jsoup.safety.Cleaner)v1).isValidBodyHtml(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(true), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = "tr";
    Object v2 = "html";
    Object v3 = new java.lang.String[]{"c#olgroup"};
    Object v4 = ((org.jsoup.safety.Whitelist)v0).addProtocols(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String[])v3));
    Object v5 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = "tr";
    Object v2 = "html";
    Object v3 = new java.lang.String[]{"c#olgroup"};
    Object v4 = ((org.jsoup.safety.Whitelist)v0).addProtocols(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String[])v3));
    Object v5 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v6 = "tfoot";
    Object v7 = ((org.jsoup.safety.Cleaner)v5).isValidBodyHtml(((java.lang.String)v6));
    org.junit.Assert.assertEquals((Object)(true), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = "tr";
    Object v2 = "html";
    Object v3 = new java.lang.String[]{"c#olgroup"};
    Object v4 = ((org.jsoup.safety.Whitelist)v0).addProtocols(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String[])v3));
    Object v5 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v6 = org.jsoup.safety.Whitelist.none();
    Object v7 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v6));
    Object v8 = "";
    Object v9 = new org.jsoup.nodes.Document(((java.lang.String)v8));
    Object v10 = ((org.jsoup.nodes.Element)v9).data();
    Object v11 = ((org.jsoup.safety.Cleaner)v7).clean(((org.jsoup.nodes.Document)v9));
    Object v12 = ((org.jsoup.nodes.Element)v11).children();
    Object v13 = ((org.jsoup.safety.Cleaner)v5).isValid(((org.jsoup.nodes.Document)v11));
    org.junit.Assert.assertEquals((Object)(true), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = "tr";
    Object v2 = "html";
    Object v3 = new java.lang.String[]{"c#olgroup"};
    Object v4 = ((org.jsoup.safety.Whitelist)v0).addProtocols(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String[])v3));
    Object v5 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v6 = "";
    Object v7 = new org.jsoup.nodes.Document(((java.lang.String)v6));
    Object v8 = "htm";
    Object v9 = ((org.jsoup.nodes.Element)v7).is(((java.lang.String)v8));
    Object v10 = ((org.jsoup.safety.Cleaner)v5).clean(((org.jsoup.nodes.Document)v7));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = "tr";
    Object v2 = "html";
    Object v3 = new java.lang.String[]{"c#olgroup"};
    Object v4 = ((org.jsoup.safety.Whitelist)v0).addProtocols(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String[])v3));
    Object v5 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v6 = "";
    Object v7 = new org.jsoup.nodes.Document(((java.lang.String)v6));
    Object v8 = ((org.jsoup.safety.Cleaner)v5).clean(((org.jsoup.nodes.Document)v7));
    Object v9 = "";
    Object v10 = new org.jsoup.nodes.Document(((java.lang.String)v9));
    Object v11 = ((org.jsoup.safety.Cleaner)v5).clean(((org.jsoup.nodes.Document)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = "tr";
    Object v2 = "html";
    Object v3 = new java.lang.String[]{"c#olgroup"};
    Object v4 = ((org.jsoup.safety.Whitelist)v0).addProtocols(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String[])v3));
    Object v5 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v6 = "td";
    Object v7 = ((org.jsoup.safety.Cleaner)v5).isValidBodyHtml(((java.lang.String)v6));
    org.junit.Assert.assertEquals((Object)(true), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = "tr";
    Object v2 = "html";
    Object v3 = new java.lang.String[]{"c#olgroup"};
    Object v4 = ((org.jsoup.safety.Whitelist)v0).addProtocols(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String[])v3));
    Object v5 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v6 = org.jsoup.safety.Whitelist.none();
    Object v7 = "tr";
    Object v8 = "html";
    Object v9 = new java.lang.String[]{"c#olgroup"};
    Object v10 = ((org.jsoup.safety.Whitelist)v6).addProtocols(((java.lang.String)v7),((java.lang.String)v8),((java.lang.String[])v9));
    Object v11 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v6));
    Object v12 = "";
    Object v13 = new org.jsoup.nodes.Document(((java.lang.String)v12));
    Object v14 = ((org.jsoup.safety.Cleaner)v11).clean(((org.jsoup.nodes.Document)v13));
    Object v15 = "";
    Object v16 = new org.jsoup.nodes.Document(((java.lang.String)v15));
    Object v17 = ((org.jsoup.safety.Cleaner)v11).clean(((org.jsoup.nodes.Document)v16));
    Object v18 = ((org.jsoup.safety.Cleaner)v5).clean(((org.jsoup.nodes.Document)v17));
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = "tr";
    Object v2 = "html";
    Object v3 = new java.lang.String[]{"c#olgroup"};
    Object v4 = ((org.jsoup.safety.Whitelist)v0).addProtocols(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String[])v3));
    Object v5 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v6 = org.jsoup.safety.Whitelist.none();
    Object v7 = "tr";
    Object v8 = "html";
    Object v9 = new java.lang.String[]{"c#olgroup"};
    Object v10 = ((org.jsoup.safety.Whitelist)v6).addProtocols(((java.lang.String)v7),((java.lang.String)v8),((java.lang.String[])v9));
    Object v11 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v6));
    Object v12 = "";
    Object v13 = new org.jsoup.nodes.Document(((java.lang.String)v12));
    Object v14 = "htm";
    Object v15 = ((org.jsoup.nodes.Element)v13).is(((java.lang.String)v14));
    Object v16 = ((org.jsoup.safety.Cleaner)v11).clean(((org.jsoup.nodes.Document)v13));
    Object v17 = ((org.jsoup.safety.Cleaner)v5).isValid(((org.jsoup.nodes.Document)v16));
    Object v18 = org.jsoup.safety.Whitelist.none();
    Object v19 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v18));
    Object v20 = org.jsoup.safety.Whitelist.none();
    Object v21 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v20));
    Object v22 = "";
    Object v23 = new org.jsoup.nodes.Document(((java.lang.String)v22));
    Object v24 = ((org.jsoup.nodes.Element)v23).data();
    Object v25 = ((org.jsoup.safety.Cleaner)v21).clean(((org.jsoup.nodes.Document)v23));
    Object v26 = ((org.jsoup.safety.Cleaner)v19).clean(((org.jsoup.nodes.Document)v25));
    Object v27 = ((org.jsoup.safety.Cleaner)v5).isValid(((org.jsoup.nodes.Document)v26));
    org.junit.Assert.assertEquals((Object)(true), v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = "tr";
    Object v2 = "html";
    Object v3 = new java.lang.String[]{"c#olgroup"};
    Object v4 = ((org.jsoup.safety.Whitelist)v0).addProtocols(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String[])v3));
    Object v5 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v6 = "";
    Object v7 = new org.jsoup.nodes.Document(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Element)v7).previousElementSibling();
    Object v9 = ((org.jsoup.safety.Cleaner)v5).isValid(((org.jsoup.nodes.Document)v7));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = "tr";
    Object v2 = "html";
    Object v3 = new java.lang.String[]{"c#olgroup"};
    Object v4 = ((org.jsoup.safety.Whitelist)v0).addProtocols(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String[])v3));
    Object v5 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v6 = "basefont";
    Object v7 = ((org.jsoup.safety.Cleaner)v5).isValidBodyHtml(((java.lang.String)v6));
    org.junit.Assert.assertEquals((Object)(true), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = "tr";
    Object v2 = "html";
    Object v3 = new java.lang.String[]{"c#olgroup"};
    Object v4 = ((org.jsoup.safety.Whitelist)v0).addProtocols(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String[])v3));
    Object v5 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v6 = org.jsoup.safety.Whitelist.none();
    Object v7 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v6));
    Object v8 = "";
    Object v9 = new org.jsoup.nodes.Document(((java.lang.String)v8));
    Object v10 = ((org.jsoup.safety.Cleaner)v7).clean(((org.jsoup.nodes.Document)v9));
    Object v11 = "";
    Object v12 = new org.jsoup.nodes.Document(((java.lang.String)v11));
    Object v13 = ((org.jsoup.safety.Cleaner)v7).clean(((org.jsoup.nodes.Document)v12));
    Object v14 = ((org.jsoup.safety.Cleaner)v5).clean(((org.jsoup.nodes.Document)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = "tr";
    Object v2 = "html";
    Object v3 = new java.lang.String[]{"c#olgroup"};
    Object v4 = ((org.jsoup.safety.Whitelist)v0).addProtocols(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String[])v3));
    Object v5 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v6 = "";
    Object v7 = ((org.jsoup.safety.Cleaner)v5).isValidBodyHtml(((java.lang.String)v6));
    org.junit.Assert.assertEquals((Object)(true), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = "tr";
    Object v2 = "html";
    Object v3 = new java.lang.String[]{"c#olgroup"};
    Object v4 = ((org.jsoup.safety.Whitelist)v0).addProtocols(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String[])v3));
    Object v5 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v6 = "";
    Object v7 = new org.jsoup.nodes.Document(((java.lang.String)v6));
    Object v8 = ((org.jsoup.safety.Cleaner)v5).clean(((org.jsoup.nodes.Document)v7));
    Object v9 = "";
    Object v10 = new org.jsoup.nodes.Document(((java.lang.String)v9));
    Object v11 = ((org.jsoup.safety.Cleaner)v5).isValid(((org.jsoup.nodes.Document)v10));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = "tr";
    Object v2 = "html";
    Object v3 = new java.lang.String[]{"c#olgroup"};
    Object v4 = ((org.jsoup.safety.Whitelist)v0).addProtocols(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String[])v3));
    Object v5 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v6 = " ";
    Object v7 = ((org.jsoup.safety.Cleaner)v5).isValidBodyHtml(((java.lang.String)v6));
    org.junit.Assert.assertEquals((Object)(true), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = "tr";
    Object v2 = "html";
    Object v3 = new java.lang.String[]{"c#olgroup"};
    Object v4 = ((org.jsoup.safety.Whitelist)v0).addProtocols(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String[])v3));
    Object v5 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v6 = "";
    Object v7 = ((org.jsoup.safety.Cleaner)v5).isValidBodyHtml(((java.lang.String)v6));
    Object v8 = "J";
    Object v9 = ((org.jsoup.safety.Cleaner)v5).isValidBodyHtml(((java.lang.String)v8));
    org.junit.Assert.assertEquals((Object)(true), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = "tr";
    Object v2 = "html";
    Object v3 = new java.lang.String[]{"c#olgroup"};
    Object v4 = ((org.jsoup.safety.Whitelist)v0).addProtocols(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String[])v3));
    Object v5 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v6 = "htm";
    Object v7 = ((org.jsoup.safety.Cleaner)v5).isValidBodyHtml(((java.lang.String)v6));
    Object v8 = "option[seected]";
    Object v9 = ((org.jsoup.safety.Cleaner)v5).isValidBodyHtml(((java.lang.String)v8));
    org.junit.Assert.assertEquals((Object)(true), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = "tr";
    Object v2 = "html";
    Object v3 = new java.lang.String[]{"c#olgroup"};
    Object v4 = ((org.jsoup.safety.Whitelist)v0).addProtocols(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String[])v3));
    Object v5 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v6 = org.jsoup.safety.Whitelist.none();
    Object v7 = "tr";
    Object v8 = "html";
    Object v9 = new java.lang.String[]{"c#olgroup"};
    Object v10 = ((org.jsoup.safety.Whitelist)v6).addProtocols(((java.lang.String)v7),((java.lang.String)v8),((java.lang.String[])v9));
    Object v11 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v6));
    Object v12 = "";
    Object v13 = new org.jsoup.nodes.Document(((java.lang.String)v12));
    Object v14 = "htm";
    Object v15 = ((org.jsoup.nodes.Element)v13).is(((java.lang.String)v14));
    Object v16 = ((org.jsoup.safety.Cleaner)v11).clean(((org.jsoup.nodes.Document)v13));
    Object v17 = ((org.jsoup.safety.Cleaner)v5).isValid(((org.jsoup.nodes.Document)v16));
    org.junit.Assert.assertEquals((Object)(true), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = "tr";
    Object v2 = "html";
    Object v3 = new java.lang.String[]{"c#olgroup"};
    Object v4 = ((org.jsoup.safety.Whitelist)v0).addProtocols(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String[])v3));
    Object v5 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v6 = "";
    Object v7 = new org.jsoup.nodes.Document(((java.lang.String)v6));
    Object v8 = ((org.jsoup.safety.Cleaner)v5).isValid(((org.jsoup.nodes.Document)v7));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = "tr";
    Object v2 = "html";
    Object v3 = new java.lang.String[]{"c#olgroup"};
    Object v4 = ((org.jsoup.safety.Whitelist)v0).addProtocols(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String[])v3));
    Object v5 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v6 = org.jsoup.safety.Whitelist.none();
    Object v7 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v6));
    Object v8 = "";
    Object v9 = new org.jsoup.nodes.Document(((java.lang.String)v8));
    Object v10 = "blockquote";
    Object v11 = ((org.jsoup.nodes.Element)v9).getElementsByAttribute(((java.lang.String)v10));
    Object v12 = ((org.jsoup.safety.Cleaner)v7).clean(((org.jsoup.nodes.Document)v9));
    Object v13 = ((org.jsoup.safety.Cleaner)v5).clean(((org.jsoup.nodes.Document)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = "tr";
    Object v2 = "html";
    Object v3 = new java.lang.String[]{"c#olgroup"};
    Object v4 = ((org.jsoup.safety.Whitelist)v0).addProtocols(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String[])v3));
    Object v5 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v6 = org.jsoup.safety.Whitelist.none();
    Object v7 = "tr";
    Object v8 = "html";
    Object v9 = new java.lang.String[]{"c#olgroup"};
    Object v10 = ((org.jsoup.safety.Whitelist)v6).addProtocols(((java.lang.String)v7),((java.lang.String)v8),((java.lang.String[])v9));
    Object v11 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v6));
    Object v12 = org.jsoup.safety.Whitelist.none();
    Object v13 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v12));
    Object v14 = "";
    Object v15 = new org.jsoup.nodes.Document(((java.lang.String)v14));
    Object v16 = ((org.jsoup.safety.Cleaner)v13).clean(((org.jsoup.nodes.Document)v15));
    Object v17 = "";
    Object v18 = new org.jsoup.nodes.Document(((java.lang.String)v17));
    Object v19 = ((org.jsoup.safety.Cleaner)v13).clean(((org.jsoup.nodes.Document)v18));
    Object v20 = ((org.jsoup.safety.Cleaner)v11).clean(((org.jsoup.nodes.Document)v19));
    Object v21 = ((org.jsoup.safety.Cleaner)v5).isValid(((org.jsoup.nodes.Document)v20));
    org.junit.Assert.assertEquals((Object)(true), v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = "tr";
    Object v2 = "html";
    Object v3 = new java.lang.String[]{"c#olgroup"};
    Object v4 = ((org.jsoup.safety.Whitelist)v0).addProtocols(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String[])v3));
    Object v5 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v6 = "";
    Object v7 = new org.jsoup.nodes.Document(((java.lang.String)v6));
    Object v8 = ((org.jsoup.safety.Cleaner)v5).clean(((org.jsoup.nodes.Document)v7));
    Object v9 = org.jsoup.safety.Whitelist.none();
    Object v10 = "tr";
    Object v11 = "html";
    Object v12 = new java.lang.String[]{"c#olgroup"};
    Object v13 = ((org.jsoup.safety.Whitelist)v9).addProtocols(((java.lang.String)v10),((java.lang.String)v11),((java.lang.String[])v12));
    Object v14 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v9));
    Object v15 = "";
    Object v16 = new org.jsoup.nodes.Document(((java.lang.String)v15));
    Object v17 = ((org.jsoup.safety.Cleaner)v14).clean(((org.jsoup.nodes.Document)v16));
    Object v18 = "";
    Object v19 = new org.jsoup.nodes.Document(((java.lang.String)v18));
    Object v20 = ((org.jsoup.safety.Cleaner)v14).clean(((org.jsoup.nodes.Document)v19));
    Object v21 = ((org.jsoup.safety.Cleaner)v5).clean(((org.jsoup.nodes.Document)v20));
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = "tr";
    Object v2 = "html";
    Object v3 = new java.lang.String[]{"c#olgroup"};
    Object v4 = ((org.jsoup.safety.Whitelist)v0).addProtocols(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String[])v3));
    Object v5 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v6 = "";
    Object v7 = new org.jsoup.nodes.Document(((java.lang.String)v6));
    Object v8 = ((org.jsoup.safety.Cleaner)v5).clean(((org.jsoup.nodes.Document)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = "tr";
    Object v2 = "html";
    Object v3 = new java.lang.String[]{"c#olgroup"};
    Object v4 = ((org.jsoup.safety.Whitelist)v0).addProtocols(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String[])v3));
    Object v5 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v6 = "html";
    Object v7 = ((org.jsoup.safety.Cleaner)v5).isValidBodyHtml(((java.lang.String)v6));
    org.junit.Assert.assertEquals((Object)(true), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = "tr";
    Object v2 = "html";
    Object v3 = new java.lang.String[]{"c#olgroup"};
    Object v4 = ((org.jsoup.safety.Whitelist)v0).addProtocols(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String[])v3));
    Object v5 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v6 = org.jsoup.safety.Whitelist.none();
    Object v7 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v6));
    Object v8 = org.jsoup.safety.Whitelist.none();
    Object v9 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v8));
    Object v10 = "";
    Object v11 = new org.jsoup.nodes.Document(((java.lang.String)v10));
    Object v12 = ((org.jsoup.nodes.Element)v11).data();
    Object v13 = ((org.jsoup.safety.Cleaner)v9).clean(((org.jsoup.nodes.Document)v11));
    Object v14 = ((org.jsoup.safety.Cleaner)v7).clean(((org.jsoup.nodes.Document)v13));
    Object v15 = ((org.jsoup.nodes.Element)v14).toString();
    Object v16 = ((org.jsoup.safety.Cleaner)v5).isValid(((org.jsoup.nodes.Document)v14));
    org.junit.Assert.assertEquals((Object)(true), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = "tr";
    Object v2 = "html";
    Object v3 = new java.lang.String[]{"c#olgroup"};
    Object v4 = ((org.jsoup.safety.Whitelist)v0).addProtocols(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String[])v3));
    Object v5 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v6 = org.jsoup.safety.Whitelist.none();
    Object v7 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v6));
    Object v8 = "";
    Object v9 = new org.jsoup.nodes.Document(((java.lang.String)v8));
    Object v10 = ((org.jsoup.nodes.Element)v9).data();
    Object v11 = ((org.jsoup.safety.Cleaner)v7).clean(((org.jsoup.nodes.Document)v9));
    Object v12 = ((org.jsoup.safety.Cleaner)v5).isValid(((org.jsoup.nodes.Document)v11));
    Object v13 = org.jsoup.safety.Whitelist.none();
    Object v14 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v13));
    Object v15 = "";
    Object v16 = new org.jsoup.nodes.Document(((java.lang.String)v15));
    Object v17 = ((org.jsoup.nodes.Element)v16).data();
    Object v18 = ((org.jsoup.safety.Cleaner)v14).clean(((org.jsoup.nodes.Document)v16));
    Object v19 = ((org.jsoup.safety.Cleaner)v5).isValid(((org.jsoup.nodes.Document)v18));
    org.junit.Assert.assertEquals((Object)(true), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = "tr";
    Object v2 = "html";
    Object v3 = new java.lang.String[]{"c#olgroup"};
    Object v4 = ((org.jsoup.safety.Whitelist)v0).addProtocols(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String[])v3));
    Object v5 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v6 = org.jsoup.safety.Whitelist.none();
    Object v7 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v6));
    Object v8 = "";
    Object v9 = new org.jsoup.nodes.Document(((java.lang.String)v8));
    Object v10 = "tbody";
    Object v11 = ((org.jsoup.nodes.Element)v9).addClass(((java.lang.String)v10));
    Object v12 = ((org.jsoup.safety.Cleaner)v7).clean(((org.jsoup.nodes.Document)v9));
    Object v13 = ((org.jsoup.safety.Cleaner)v5).isValid(((org.jsoup.nodes.Document)v12));
    Object v14 = "";
    Object v15 = new org.jsoup.nodes.Document(((java.lang.String)v14));
    Object v16 = "fram";
    Object v17 = ((org.jsoup.nodes.Element)v15).getElementsByAttributeStarting(((java.lang.String)v16));
    Object v18 = ((org.jsoup.safety.Cleaner)v5).clean(((org.jsoup.nodes.Document)v15));
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = "tr";
    Object v2 = "html";
    Object v3 = new java.lang.String[]{"c#olgroup"};
    Object v4 = ((org.jsoup.safety.Whitelist)v0).addProtocols(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String[])v3));
    Object v5 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v6 = "<";
    Object v7 = ((org.jsoup.safety.Cleaner)v5).isValidBodyHtml(((java.lang.String)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = "tr";
    Object v2 = "html";
    Object v3 = new java.lang.String[]{"c#olgroup"};
    Object v4 = ((org.jsoup.safety.Whitelist)v0).addProtocols(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String[])v3));
    Object v5 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v6 = "E";
    Object v7 = ((org.jsoup.safety.Cleaner)v5).isValidBodyHtml(((java.lang.String)v6));
    Object v8 = org.jsoup.safety.Whitelist.none();
    Object v9 = "tr";
    Object v10 = "html";
    Object v11 = new java.lang.String[]{"c#olgroup"};
    Object v12 = ((org.jsoup.safety.Whitelist)v8).addProtocols(((java.lang.String)v9),((java.lang.String)v10),((java.lang.String[])v11));
    Object v13 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v8));
    Object v14 = "";
    Object v15 = new org.jsoup.nodes.Document(((java.lang.String)v14));
    Object v16 = ((org.jsoup.safety.Cleaner)v13).clean(((org.jsoup.nodes.Document)v15));
    Object v17 = org.jsoup.safety.Whitelist.none();
    Object v18 = "tr";
    Object v19 = "html";
    Object v20 = new java.lang.String[]{"c#olgroup"};
    Object v21 = ((org.jsoup.safety.Whitelist)v17).addProtocols(((java.lang.String)v18),((java.lang.String)v19),((java.lang.String[])v20));
    Object v22 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v17));
    Object v23 = "";
    Object v24 = new org.jsoup.nodes.Document(((java.lang.String)v23));
    Object v25 = ((org.jsoup.safety.Cleaner)v22).clean(((org.jsoup.nodes.Document)v24));
    Object v26 = "";
    Object v27 = new org.jsoup.nodes.Document(((java.lang.String)v26));
    Object v28 = ((org.jsoup.safety.Cleaner)v22).clean(((org.jsoup.nodes.Document)v27));
    Object v29 = ((org.jsoup.safety.Cleaner)v13).clean(((org.jsoup.nodes.Document)v28));
    Object v30 = ((org.jsoup.safety.Cleaner)v5).clean(((org.jsoup.nodes.Document)v29));
    org.junit.Assert.assertNotNull(v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = "tr";
    Object v2 = "html";
    Object v3 = new java.lang.String[]{"c#olgroup"};
    Object v4 = ((org.jsoup.safety.Whitelist)v0).addProtocols(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String[])v3));
    Object v5 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v6 = org.jsoup.safety.Whitelist.none();
    Object v7 = "tr";
    Object v8 = "html";
    Object v9 = new java.lang.String[]{"c#olgroup"};
    Object v10 = ((org.jsoup.safety.Whitelist)v6).addProtocols(((java.lang.String)v7),((java.lang.String)v8),((java.lang.String[])v9));
    Object v11 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v6));
    Object v12 = "";
    Object v13 = new org.jsoup.nodes.Document(((java.lang.String)v12));
    Object v14 = ((org.jsoup.safety.Cleaner)v11).clean(((org.jsoup.nodes.Document)v13));
    Object v15 = ((org.jsoup.safety.Cleaner)v5).isValid(((org.jsoup.nodes.Document)v14));
    org.junit.Assert.assertEquals((Object)(true), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = "tr";
    Object v2 = "html";
    Object v3 = new java.lang.String[]{"c#olgroup"};
    Object v4 = ((org.jsoup.safety.Whitelist)v0).addProtocols(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String[])v3));
    Object v5 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v6 = "checkbox";
    Object v7 = ((org.jsoup.safety.Cleaner)v5).isValidBodyHtml(((java.lang.String)v6));
    org.junit.Assert.assertEquals((Object)(true), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = "tr";
    Object v2 = "html";
    Object v3 = new java.lang.String[]{"c#olgroup"};
    Object v4 = ((org.jsoup.safety.Whitelist)v0).addProtocols(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String[])v3));
    Object v5 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v6 = org.jsoup.safety.Whitelist.none();
    Object v7 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v6));
    Object v8 = "";
    Object v9 = new org.jsoup.nodes.Document(((java.lang.String)v8));
    Object v10 = ((org.jsoup.nodes.Element)v9).data();
    Object v11 = ((org.jsoup.safety.Cleaner)v7).clean(((org.jsoup.nodes.Document)v9));
    Object v12 = ((org.jsoup.safety.Cleaner)v5).clean(((org.jsoup.nodes.Document)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = "tr";
    Object v2 = "html";
    Object v3 = new java.lang.String[]{"c#olgroup"};
    Object v4 = ((org.jsoup.safety.Whitelist)v0).addProtocols(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String[])v3));
    Object v5 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v6 = org.jsoup.safety.Whitelist.none();
    Object v7 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v6));
    Object v8 = "";
    Object v9 = new org.jsoup.nodes.Document(((java.lang.String)v8));
    Object v10 = "tbody";
    Object v11 = ((org.jsoup.nodes.Element)v9).addClass(((java.lang.String)v10));
    Object v12 = ((org.jsoup.safety.Cleaner)v7).clean(((org.jsoup.nodes.Document)v9));
    Object v13 = ((org.jsoup.safety.Cleaner)v5).isValid(((org.jsoup.nodes.Document)v12));
    Object v14 = org.jsoup.safety.Whitelist.none();
    Object v15 = "tr";
    Object v16 = "html";
    Object v17 = new java.lang.String[]{"c#olgroup"};
    Object v18 = ((org.jsoup.safety.Whitelist)v14).addProtocols(((java.lang.String)v15),((java.lang.String)v16),((java.lang.String[])v17));
    Object v19 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v14));
    Object v20 = org.jsoup.safety.Whitelist.none();
    Object v21 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v20));
    Object v22 = "";
    Object v23 = new org.jsoup.nodes.Document(((java.lang.String)v22));
    Object v24 = ((org.jsoup.safety.Cleaner)v21).clean(((org.jsoup.nodes.Document)v23));
    Object v25 = "";
    Object v26 = new org.jsoup.nodes.Document(((java.lang.String)v25));
    Object v27 = ((org.jsoup.safety.Cleaner)v21).clean(((org.jsoup.nodes.Document)v26));
    Object v28 = ((org.jsoup.safety.Cleaner)v19).clean(((org.jsoup.nodes.Document)v27));
    Object v29 = ((org.jsoup.safety.Cleaner)v5).isValid(((org.jsoup.nodes.Document)v28));
    org.junit.Assert.assertEquals((Object)(true), v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = "tr";
    Object v2 = "html";
    Object v3 = new java.lang.String[]{"c#olgroup"};
    Object v4 = ((org.jsoup.safety.Whitelist)v0).addProtocols(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String[])v3));
    Object v5 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v6 = "ISO-8859-1";
    Object v7 = ((org.jsoup.safety.Cleaner)v5).isValidBodyHtml(((java.lang.String)v6));
    org.junit.Assert.assertEquals((Object)(true), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = "tr";
    Object v2 = "html";
    Object v3 = new java.lang.String[]{"c#olgroup"};
    Object v4 = ((org.jsoup.safety.Whitelist)v0).addProtocols(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String[])v3));
    Object v5 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v6 = "h4";
    Object v7 = ((org.jsoup.safety.Cleaner)v5).isValidBodyHtml(((java.lang.String)v6));
    org.junit.Assert.assertEquals((Object)(true), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = "tr";
    Object v2 = "html";
    Object v3 = new java.lang.String[]{"c#olgroup"};
    Object v4 = ((org.jsoup.safety.Whitelist)v0).addProtocols(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String[])v3));
    Object v5 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v6 = "ul";
    Object v7 = ((org.jsoup.safety.Cleaner)v5).isValidBodyHtml(((java.lang.String)v6));
    org.junit.Assert.assertEquals((Object)(true), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = "tr";
    Object v2 = "html";
    Object v3 = new java.lang.String[]{"c#olgroup"};
    Object v4 = ((org.jsoup.safety.Whitelist)v0).addProtocols(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String[])v3));
    Object v5 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v6 = "";
    Object v7 = new org.jsoup.nodes.Document(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Element)v7).empty();
    Object v9 = ((org.jsoup.safety.Cleaner)v5).clean(((org.jsoup.nodes.Document)v7));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = "tr";
    Object v2 = "html";
    Object v3 = new java.lang.String[]{"c#olgroup"};
    Object v4 = ((org.jsoup.safety.Whitelist)v0).addProtocols(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String[])v3));
    Object v5 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v6 = org.jsoup.safety.Whitelist.none();
    Object v7 = "tr";
    Object v8 = "html";
    Object v9 = new java.lang.String[]{"c#olgroup"};
    Object v10 = ((org.jsoup.safety.Whitelist)v6).addProtocols(((java.lang.String)v7),((java.lang.String)v8),((java.lang.String[])v9));
    Object v11 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v6));
    Object v12 = "";
    Object v13 = new org.jsoup.nodes.Document(((java.lang.String)v12));
    Object v14 = ((org.jsoup.nodes.Element)v13).empty();
    Object v15 = ((org.jsoup.safety.Cleaner)v11).clean(((org.jsoup.nodes.Document)v13));
    Object v16 = ((org.jsoup.safety.Cleaner)v5).isValid(((org.jsoup.nodes.Document)v15));
    org.junit.Assert.assertEquals((Object)(true), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = "tr";
    Object v2 = "html";
    Object v3 = new java.lang.String[]{"c#olgroup"};
    Object v4 = ((org.jsoup.safety.Whitelist)v0).addProtocols(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String[])v3));
    Object v5 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v6 = "br";
    Object v7 = ((org.jsoup.safety.Cleaner)v5).isValidBodyHtml(((java.lang.String)v6));
    org.junit.Assert.assertEquals((Object)(true), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = "tr";
    Object v2 = "html";
    Object v3 = new java.lang.String[]{"c#olgroup"};
    Object v4 = ((org.jsoup.safety.Whitelist)v0).addProtocols(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String[])v3));
    Object v5 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v6 = org.jsoup.safety.Whitelist.none();
    Object v7 = "tr";
    Object v8 = "html";
    Object v9 = new java.lang.String[]{"c#olgroup"};
    Object v10 = ((org.jsoup.safety.Whitelist)v6).addProtocols(((java.lang.String)v7),((java.lang.String)v8),((java.lang.String[])v9));
    Object v11 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v6));
    Object v12 = org.jsoup.safety.Whitelist.none();
    Object v13 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v12));
    Object v14 = "";
    Object v15 = new org.jsoup.nodes.Document(((java.lang.String)v14));
    Object v16 = ((org.jsoup.nodes.Element)v15).data();
    Object v17 = ((org.jsoup.safety.Cleaner)v13).clean(((org.jsoup.nodes.Document)v15));
    Object v18 = ((org.jsoup.safety.Cleaner)v11).clean(((org.jsoup.nodes.Document)v17));
    Object v19 = ((org.jsoup.safety.Cleaner)v5).clean(((org.jsoup.nodes.Document)v18));
    Object v20 = "";
    Object v21 = ((org.jsoup.safety.Cleaner)v5).isValidBodyHtml(((java.lang.String)v20));
    org.junit.Assert.assertEquals((Object)(true), v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = "tr";
    Object v2 = "html";
    Object v3 = new java.lang.String[]{"c#olgroup"};
    Object v4 = ((org.jsoup.safety.Whitelist)v0).addProtocols(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String[])v3));
    Object v5 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v6 = org.jsoup.safety.Whitelist.none();
    Object v7 = "tr";
    Object v8 = "html";
    Object v9 = new java.lang.String[]{"c#olgroup"};
    Object v10 = ((org.jsoup.safety.Whitelist)v6).addProtocols(((java.lang.String)v7),((java.lang.String)v8),((java.lang.String[])v9));
    Object v11 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v6));
    Object v12 = org.jsoup.safety.Whitelist.none();
    Object v13 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v12));
    Object v14 = "";
    Object v15 = new org.jsoup.nodes.Document(((java.lang.String)v14));
    Object v16 = ((org.jsoup.nodes.Element)v15).data();
    Object v17 = ((org.jsoup.safety.Cleaner)v13).clean(((org.jsoup.nodes.Document)v15));
    Object v18 = ((org.jsoup.safety.Cleaner)v11).clean(((org.jsoup.nodes.Document)v17));
    Object v19 = ((org.jsoup.safety.Cleaner)v5).clean(((org.jsoup.nodes.Document)v18));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = "tr";
    Object v2 = "html";
    Object v3 = new java.lang.String[]{"c#olgroup"};
    Object v4 = ((org.jsoup.safety.Whitelist)v0).addProtocols(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String[])v3));
    Object v5 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v6 = "";
    Object v7 = new org.jsoup.nodes.Document(((java.lang.String)v6));
    Object v8 = ((org.jsoup.safety.Cleaner)v5).clean(((org.jsoup.nodes.Document)v7));
    Object v9 = "table";
    Object v10 = ((org.jsoup.safety.Cleaner)v5).isValidBodyHtml(((java.lang.String)v9));
    org.junit.Assert.assertEquals((Object)(true), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v2 = org.jsoup.safety.Whitelist.none();
    Object v3 = "tr";
    Object v4 = "html";
    Object v5 = new java.lang.String[]{"c#olgroup"};
    Object v6 = ((org.jsoup.safety.Whitelist)v2).addProtocols(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String[])v5));
    Object v7 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v2));
    Object v8 = org.jsoup.safety.Whitelist.none();
    Object v9 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v8));
    Object v10 = "";
    Object v11 = new org.jsoup.nodes.Document(((java.lang.String)v10));
    Object v12 = ((org.jsoup.safety.Cleaner)v9).clean(((org.jsoup.nodes.Document)v11));
    Object v13 = "";
    Object v14 = new org.jsoup.nodes.Document(((java.lang.String)v13));
    Object v15 = ((org.jsoup.safety.Cleaner)v9).clean(((org.jsoup.nodes.Document)v14));
    Object v16 = ((org.jsoup.safety.Cleaner)v7).clean(((org.jsoup.nodes.Document)v15));
    Object v17 = ((org.jsoup.safety.Cleaner)v1).clean(((org.jsoup.nodes.Document)v16));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = "tr";
    Object v2 = "html";
    Object v3 = new java.lang.String[]{"c#olgroup"};
    Object v4 = ((org.jsoup.safety.Whitelist)v0).addProtocols(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String[])v3));
    Object v5 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v6 = org.jsoup.safety.Whitelist.none();
    Object v7 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v6));
    Object v8 = org.jsoup.safety.Whitelist.none();
    Object v9 = "tr";
    Object v10 = "html";
    Object v11 = new java.lang.String[]{"c#olgroup"};
    Object v12 = ((org.jsoup.safety.Whitelist)v8).addProtocols(((java.lang.String)v9),((java.lang.String)v10),((java.lang.String[])v11));
    Object v13 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v8));
    Object v14 = org.jsoup.safety.Whitelist.none();
    Object v15 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v14));
    Object v16 = "";
    Object v17 = new org.jsoup.nodes.Document(((java.lang.String)v16));
    Object v18 = ((org.jsoup.safety.Cleaner)v15).clean(((org.jsoup.nodes.Document)v17));
    Object v19 = "";
    Object v20 = new org.jsoup.nodes.Document(((java.lang.String)v19));
    Object v21 = ((org.jsoup.safety.Cleaner)v15).clean(((org.jsoup.nodes.Document)v20));
    Object v22 = ((org.jsoup.safety.Cleaner)v13).clean(((org.jsoup.nodes.Document)v21));
    Object v23 = ((org.jsoup.safety.Cleaner)v7).clean(((org.jsoup.nodes.Document)v22));
    Object v24 = ((org.jsoup.safety.Cleaner)v5).isValid(((org.jsoup.nodes.Document)v23));
    org.junit.Assert.assertEquals((Object)(true), v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = "tr";
    Object v2 = "html";
    Object v3 = new java.lang.String[]{"c#olgroup"};
    Object v4 = ((org.jsoup.safety.Whitelist)v0).addProtocols(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String[])v3));
    Object v5 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v6 = "tbodZy";
    Object v7 = ((org.jsoup.safety.Cleaner)v5).isValidBodyHtml(((java.lang.String)v6));
    org.junit.Assert.assertEquals((Object)(true), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = "tr";
    Object v2 = "html";
    Object v3 = new java.lang.String[]{"c#olgroup"};
    Object v4 = ((org.jsoup.safety.Whitelist)v0).addProtocols(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String[])v3));
    Object v5 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v6 = "noframes";
    Object v7 = ((org.jsoup.safety.Cleaner)v5).isValidBodyHtml(((java.lang.String)v6));
    org.junit.Assert.assertEquals((Object)(true), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = "tr";
    Object v2 = "html";
    Object v3 = new java.lang.String[]{"c#olgroup"};
    Object v4 = ((org.jsoup.safety.Whitelist)v0).addProtocols(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String[])v3));
    Object v5 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v6 = org.jsoup.safety.Whitelist.none();
    Object v7 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v6));
    Object v8 = "";
    Object v9 = new org.jsoup.nodes.Document(((java.lang.String)v8));
    Object v10 = ((org.jsoup.nodes.Element)v9).data();
    Object v11 = ((org.jsoup.safety.Cleaner)v7).clean(((org.jsoup.nodes.Document)v9));
    Object v12 = ((org.jsoup.safety.Cleaner)v5).isValid(((org.jsoup.nodes.Document)v11));
    org.junit.Assert.assertEquals((Object)(true), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = "tr";
    Object v2 = "html";
    Object v3 = new java.lang.String[]{"c#olgroup"};
    Object v4 = ((org.jsoup.safety.Whitelist)v0).addProtocols(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String[])v3));
    Object v5 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v6 = org.jsoup.safety.Whitelist.none();
    Object v7 = "tr";
    Object v8 = "html";
    Object v9 = new java.lang.String[]{"c#olgroup"};
    Object v10 = ((org.jsoup.safety.Whitelist)v6).addProtocols(((java.lang.String)v7),((java.lang.String)v8),((java.lang.String[])v9));
    Object v11 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v6));
    Object v12 = org.jsoup.safety.Whitelist.none();
    Object v13 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v12));
    Object v14 = "";
    Object v15 = new org.jsoup.nodes.Document(((java.lang.String)v14));
    Object v16 = ((org.jsoup.safety.Cleaner)v13).clean(((org.jsoup.nodes.Document)v15));
    Object v17 = "";
    Object v18 = new org.jsoup.nodes.Document(((java.lang.String)v17));
    Object v19 = ((org.jsoup.safety.Cleaner)v13).clean(((org.jsoup.nodes.Document)v18));
    Object v20 = ((org.jsoup.safety.Cleaner)v11).clean(((org.jsoup.nodes.Document)v19));
    Object v21 = ((org.jsoup.safety.Cleaner)v5).clean(((org.jsoup.nodes.Document)v20));
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = "tr";
    Object v2 = "html";
    Object v3 = new java.lang.String[]{"c#olgroup"};
    Object v4 = ((org.jsoup.safety.Whitelist)v0).addProtocols(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String[])v3));
    Object v5 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v6 = "t";
    Object v7 = ((org.jsoup.safety.Cleaner)v5).isValidBodyHtml(((java.lang.String)v6));
    org.junit.Assert.assertEquals((Object)(true), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = "tr";
    Object v2 = "html";
    Object v3 = new java.lang.String[]{"c#olgroup"};
    Object v4 = ((org.jsoup.safety.Whitelist)v0).addProtocols(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String[])v3));
    Object v5 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v6 = org.jsoup.safety.Whitelist.none();
    Object v7 = "tr";
    Object v8 = "html";
    Object v9 = new java.lang.String[]{"c#olgroup"};
    Object v10 = ((org.jsoup.safety.Whitelist)v6).addProtocols(((java.lang.String)v7),((java.lang.String)v8),((java.lang.String[])v9));
    Object v11 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v6));
    Object v12 = "";
    Object v13 = new org.jsoup.nodes.Document(((java.lang.String)v12));
    Object v14 = ((org.jsoup.safety.Cleaner)v11).clean(((org.jsoup.nodes.Document)v13));
    Object v15 = org.jsoup.safety.Whitelist.none();
    Object v16 = "tr";
    Object v17 = "html";
    Object v18 = new java.lang.String[]{"c#olgroup"};
    Object v19 = ((org.jsoup.safety.Whitelist)v15).addProtocols(((java.lang.String)v16),((java.lang.String)v17),((java.lang.String[])v18));
    Object v20 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v15));
    Object v21 = "";
    Object v22 = new org.jsoup.nodes.Document(((java.lang.String)v21));
    Object v23 = ((org.jsoup.safety.Cleaner)v20).clean(((org.jsoup.nodes.Document)v22));
    Object v24 = "";
    Object v25 = new org.jsoup.nodes.Document(((java.lang.String)v24));
    Object v26 = ((org.jsoup.safety.Cleaner)v20).clean(((org.jsoup.nodes.Document)v25));
    Object v27 = ((org.jsoup.safety.Cleaner)v11).clean(((org.jsoup.nodes.Document)v26));
    Object v28 = ((org.jsoup.safety.Cleaner)v5).clean(((org.jsoup.nodes.Document)v27));
    org.junit.Assert.assertNotNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = "tr";
    Object v2 = "html";
    Object v3 = new java.lang.String[]{"c#olgroup"};
    Object v4 = ((org.jsoup.safety.Whitelist)v0).addProtocols(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String[])v3));
    Object v5 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v6 = "naXe";
    Object v7 = ((org.jsoup.safety.Cleaner)v5).isValidBodyHtml(((java.lang.String)v6));
    org.junit.Assert.assertEquals((Object)(true), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = "tr";
    Object v2 = "html";
    Object v3 = new java.lang.String[]{"c#olgroup"};
    Object v4 = ((org.jsoup.safety.Whitelist)v0).addProtocols(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String[])v3));
    Object v5 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v6 = "";
    Object v7 = new org.jsoup.nodes.Document(((java.lang.String)v6));
    Object v8 = ((org.jsoup.safety.Cleaner)v5).clean(((org.jsoup.nodes.Document)v7));
    Object v9 = "tr";
    Object v10 = ((org.jsoup.safety.Cleaner)v5).isValidBodyHtml(((java.lang.String)v9));
    org.junit.Assert.assertEquals((Object)(true), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = "tr";
    Object v2 = "html";
    Object v3 = new java.lang.String[]{"c#olgroup"};
    Object v4 = ((org.jsoup.safety.Whitelist)v0).addProtocols(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String[])v3));
    Object v5 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v6 = org.jsoup.safety.Whitelist.none();
    Object v7 = "tr";
    Object v8 = "html";
    Object v9 = new java.lang.String[]{"c#olgroup"};
    Object v10 = ((org.jsoup.safety.Whitelist)v6).addProtocols(((java.lang.String)v7),((java.lang.String)v8),((java.lang.String[])v9));
    Object v11 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v6));
    Object v12 = "";
    Object v13 = new org.jsoup.nodes.Document(((java.lang.String)v12));
    Object v14 = "htm";
    Object v15 = ((org.jsoup.nodes.Element)v13).is(((java.lang.String)v14));
    Object v16 = ((org.jsoup.safety.Cleaner)v11).clean(((org.jsoup.nodes.Document)v13));
    Object v17 = ((org.jsoup.safety.Cleaner)v5).clean(((org.jsoup.nodes.Document)v16));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = "tr";
    Object v2 = "html";
    Object v3 = new java.lang.String[]{"c#olgroup"};
    Object v4 = ((org.jsoup.safety.Whitelist)v0).addProtocols(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String[])v3));
    Object v5 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v6 = org.jsoup.safety.Whitelist.none();
    Object v7 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v6));
    Object v8 = "";
    Object v9 = new org.jsoup.nodes.Document(((java.lang.String)v8));
    Object v10 = ((org.jsoup.safety.Cleaner)v7).clean(((org.jsoup.nodes.Document)v9));
    Object v11 = "";
    Object v12 = new org.jsoup.nodes.Document(((java.lang.String)v11));
    Object v13 = ((org.jsoup.safety.Cleaner)v7).clean(((org.jsoup.nodes.Document)v12));
    Object v14 = ((org.jsoup.safety.Cleaner)v5).clean(((org.jsoup.nodes.Document)v13));
    Object v15 = org.jsoup.safety.Whitelist.none();
    Object v16 = "tr";
    Object v17 = "html";
    Object v18 = new java.lang.String[]{"c#olgroup"};
    Object v19 = ((org.jsoup.safety.Whitelist)v15).addProtocols(((java.lang.String)v16),((java.lang.String)v17),((java.lang.String[])v18));
    Object v20 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v15));
    Object v21 = org.jsoup.safety.Whitelist.none();
    Object v22 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v21));
    Object v23 = "";
    Object v24 = new org.jsoup.nodes.Document(((java.lang.String)v23));
    Object v25 = ((org.jsoup.nodes.Element)v24).data();
    Object v26 = ((org.jsoup.safety.Cleaner)v22).clean(((org.jsoup.nodes.Document)v24));
    Object v27 = ((org.jsoup.safety.Cleaner)v20).clean(((org.jsoup.nodes.Document)v26));
    Object v28 = ((org.jsoup.safety.Cleaner)v5).clean(((org.jsoup.nodes.Document)v27));
    org.junit.Assert.assertNotNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = "tr";
    Object v2 = "html";
    Object v3 = new java.lang.String[]{"c#olgroup"};
    Object v4 = ((org.jsoup.safety.Whitelist)v0).addProtocols(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String[])v3));
    Object v5 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v6 = "";
    Object v7 = ((org.jsoup.safety.Cleaner)v5).isValidBodyHtml(((java.lang.String)v6));
    Object v8 = "base";
    Object v9 = ((org.jsoup.safety.Cleaner)v5).isValidBodyHtml(((java.lang.String)v8));
    org.junit.Assert.assertEquals((Object)(true), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = "tr";
    Object v2 = "html";
    Object v3 = new java.lang.String[]{"c#olgroup"};
    Object v4 = ((org.jsoup.safety.Whitelist)v0).addProtocols(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String[])v3));
    Object v5 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v6 = "br?";
    Object v7 = ((org.jsoup.safety.Cleaner)v5).isValidBodyHtml(((java.lang.String)v6));
    org.junit.Assert.assertEquals((Object)(true), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = "tr";
    Object v2 = "html";
    Object v3 = new java.lang.String[]{"c#olgroup"};
    Object v4 = ((org.jsoup.safety.Whitelist)v0).addProtocols(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String[])v3));
    Object v5 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v6 = org.jsoup.safety.Whitelist.none();
    Object v7 = "tr";
    Object v8 = "html";
    Object v9 = new java.lang.String[]{"c#olgroup"};
    Object v10 = ((org.jsoup.safety.Whitelist)v6).addProtocols(((java.lang.String)v7),((java.lang.String)v8),((java.lang.String[])v9));
    Object v11 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v6));
    Object v12 = org.jsoup.safety.Whitelist.none();
    Object v13 = "tr";
    Object v14 = "html";
    Object v15 = new java.lang.String[]{"c#olgroup"};
    Object v16 = ((org.jsoup.safety.Whitelist)v12).addProtocols(((java.lang.String)v13),((java.lang.String)v14),((java.lang.String[])v15));
    Object v17 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v12));
    Object v18 = org.jsoup.safety.Whitelist.none();
    Object v19 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v18));
    Object v20 = "";
    Object v21 = new org.jsoup.nodes.Document(((java.lang.String)v20));
    Object v22 = ((org.jsoup.safety.Cleaner)v19).clean(((org.jsoup.nodes.Document)v21));
    Object v23 = "";
    Object v24 = new org.jsoup.nodes.Document(((java.lang.String)v23));
    Object v25 = ((org.jsoup.safety.Cleaner)v19).clean(((org.jsoup.nodes.Document)v24));
    Object v26 = ((org.jsoup.safety.Cleaner)v17).clean(((org.jsoup.nodes.Document)v25));
    Object v27 = ((org.jsoup.safety.Cleaner)v11).clean(((org.jsoup.nodes.Document)v26));
    Object v28 = ((org.jsoup.safety.Cleaner)v5).isValid(((org.jsoup.nodes.Document)v27));
    Object v29 = "Y";
    Object v30 = ((org.jsoup.safety.Cleaner)v5).isValidBodyHtml(((java.lang.String)v29));
    org.junit.Assert.assertEquals((Object)(true), v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = "tr";
    Object v2 = "html";
    Object v3 = new java.lang.String[]{"c#olgroup"};
    Object v4 = ((org.jsoup.safety.Whitelist)v0).addProtocols(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String[])v3));
    Object v5 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v6 = "d";
    Object v7 = ((org.jsoup.safety.Cleaner)v5).isValidBodyHtml(((java.lang.String)v6));
    Object v8 = org.jsoup.safety.Whitelist.none();
    Object v9 = "tr";
    Object v10 = "html";
    Object v11 = new java.lang.String[]{"c#olgroup"};
    Object v12 = ((org.jsoup.safety.Whitelist)v8).addProtocols(((java.lang.String)v9),((java.lang.String)v10),((java.lang.String[])v11));
    Object v13 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v8));
    Object v14 = org.jsoup.safety.Whitelist.none();
    Object v15 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v14));
    Object v16 = "";
    Object v17 = new org.jsoup.nodes.Document(((java.lang.String)v16));
    Object v18 = ((org.jsoup.safety.Cleaner)v15).clean(((org.jsoup.nodes.Document)v17));
    Object v19 = "";
    Object v20 = new org.jsoup.nodes.Document(((java.lang.String)v19));
    Object v21 = ((org.jsoup.safety.Cleaner)v15).clean(((org.jsoup.nodes.Document)v20));
    Object v22 = ((org.jsoup.safety.Cleaner)v13).clean(((org.jsoup.nodes.Document)v21));
    Object v23 = ((org.jsoup.safety.Cleaner)v5).isValid(((org.jsoup.nodes.Document)v22));
    org.junit.Assert.assertEquals((Object)(true), v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = "tr";
    Object v2 = "html";
    Object v3 = new java.lang.String[]{"c#olgroup"};
    Object v4 = ((org.jsoup.safety.Whitelist)v0).addProtocols(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String[])v3));
    Object v5 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v6 = "systemId";
    Object v7 = ((org.jsoup.safety.Cleaner)v5).isValidBodyHtml(((java.lang.String)v6));
    Object v8 = "";
    Object v9 = new org.jsoup.nodes.Document(((java.lang.String)v8));
    Object v10 = "Method must not be null";
    Object v11 = ((org.jsoup.nodes.Element)v9).prepend(((java.lang.String)v10));
    Object v12 = ((org.jsoup.safety.Cleaner)v5).isValid(((org.jsoup.nodes.Document)v9));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = "tr";
    Object v2 = "html";
    Object v3 = new java.lang.String[]{"c#olgroup"};
    Object v4 = ((org.jsoup.safety.Whitelist)v0).addProtocols(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String[])v3));
    Object v5 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v6 = "tf$ot";
    Object v7 = ((org.jsoup.safety.Cleaner)v5).isValidBodyHtml(((java.lang.String)v6));
    org.junit.Assert.assertEquals((Object)(true), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = "tr";
    Object v2 = "html";
    Object v3 = new java.lang.String[]{"c#olgroup"};
    Object v4 = ((org.jsoup.safety.Whitelist)v0).addProtocols(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String[])v3));
    Object v5 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v6 = ">";
    Object v7 = ((org.jsoup.safety.Cleaner)v5).isValidBodyHtml(((java.lang.String)v6));
    org.junit.Assert.assertEquals((Object)(true), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = "tr";
    Object v2 = "html";
    Object v3 = new java.lang.String[]{"c#olgroup"};
    Object v4 = ((org.jsoup.safety.Whitelist)v0).addProtocols(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String[])v3));
    Object v5 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v6 = "h1";
    Object v7 = ((org.jsoup.safety.Cleaner)v5).isValidBodyHtml(((java.lang.String)v6));
    Object v8 = "";
    Object v9 = ((org.jsoup.safety.Cleaner)v5).isValidBodyHtml(((java.lang.String)v8));
    org.junit.Assert.assertEquals((Object)(true), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v2 = "htm";
    Object v3 = ((org.jsoup.safety.Cleaner)v1).isValidBodyHtml(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(true), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = "tr";
    Object v2 = "html";
    Object v3 = new java.lang.String[]{"c#olgroup"};
    Object v4 = ((org.jsoup.safety.Whitelist)v0).addProtocols(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String[])v3));
    Object v5 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v6 = "b";
    Object v7 = ((org.jsoup.safety.Cleaner)v5).isValidBodyHtml(((java.lang.String)v6));
    Object v8 = org.jsoup.safety.Whitelist.none();
    Object v9 = "tr";
    Object v10 = "html";
    Object v11 = new java.lang.String[]{"c#olgroup"};
    Object v12 = ((org.jsoup.safety.Whitelist)v8).addProtocols(((java.lang.String)v9),((java.lang.String)v10),((java.lang.String[])v11));
    Object v13 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v8));
    Object v14 = "";
    Object v15 = new org.jsoup.nodes.Document(((java.lang.String)v14));
    Object v16 = ((org.jsoup.nodes.Element)v15).empty();
    Object v17 = ((org.jsoup.safety.Cleaner)v13).clean(((org.jsoup.nodes.Document)v15));
    Object v18 = ((org.jsoup.safety.Cleaner)v5).clean(((org.jsoup.nodes.Document)v17));
    org.junit.Assert.assertNotNull(v18);
  }
}
