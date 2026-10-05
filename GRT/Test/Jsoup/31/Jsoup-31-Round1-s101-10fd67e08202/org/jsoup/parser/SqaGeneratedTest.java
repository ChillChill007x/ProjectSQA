package org.jsoup.parser;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "_";
    Object v2 = new org.jsoup.nodes.Attributes();
    Object v3 = new org.jsoup.parser.Token.StartTag(((java.lang.String)v1),((org.jsoup.nodes.Attributes)v2));
    Object v4 = ((org.jsoup.parser.XmlTreeBuilder)v0).process(((org.jsoup.parser.Token)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = new org.jsoup.parser.Token.Comment();
    Object v2 = ((org.jsoup.parser.Token.Comment)v1).toString();
    ((org.jsoup.parser.XmlTreeBuilder)v0).insert(((org.jsoup.parser.Token.Comment)v1));
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = new org.jsoup.parser.Token.Doctype();
    Object v2 = ((org.jsoup.parser.Token.Doctype)v1).getSystemIdentifier();
    ((org.jsoup.parser.XmlTreeBuilder)v0).insert(((org.jsoup.parser.Token.Doctype)v1));
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "_";
    Object v2 = new org.jsoup.nodes.Attributes();
    Object v3 = new org.jsoup.parser.Token.StartTag(((java.lang.String)v1),((org.jsoup.nodes.Attributes)v2));
    Object v4 = ((org.jsoup.parser.XmlTreeBuilder)v0).insert(((org.jsoup.parser.Token.StartTag)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = new org.jsoup.parser.Token.Doctype();
    ((org.jsoup.parser.XmlTreeBuilder)v0).insert(((org.jsoup.parser.Token.Doctype)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = new org.jsoup.parser.Token.Comment();
    ((org.jsoup.parser.XmlTreeBuilder)v0).insert(((org.jsoup.parser.Token.Comment)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "_";
    Object v2 = new org.jsoup.nodes.Attributes();
    Object v3 = new org.jsoup.parser.Token.StartTag(((java.lang.String)v1),((org.jsoup.nodes.Attributes)v2));
    Object v4 = ((org.jsoup.parser.Token.StartTag)v3).toString();
    Object v5 = ((org.jsoup.parser.XmlTreeBuilder)v0).insert(((org.jsoup.parser.Token.StartTag)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = new org.jsoup.parser.Token.Doctype();
    Object v2 = ((org.jsoup.parser.XmlTreeBuilder)v0).process(((org.jsoup.parser.Token)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "";
    Object v2 = "Ch";
    Object v3 = 3;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = new org.jsoup.parser.Token.Comment();
    Object v2 = ((org.jsoup.parser.XmlTreeBuilder)v0).process(((org.jsoup.parser.Token)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "tbody";
    Object v2 = "dd";
    Object v3 = 3;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "nofram";
    Object v2 = "a/";
    Object v3 = 3;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    Object v5 = "_";
    Object v6 = new org.jsoup.nodes.Attributes();
    Object v7 = new org.jsoup.parser.Token.StartTag(((java.lang.String)v5),((org.jsoup.nodes.Attributes)v6));
    Object v8 = ((java.util.ArrayList)v4).equals(((java.lang.Object)v7));
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "hidden";
    Object v2 = new org.jsoup.parser.Token.Character(((java.lang.String)v1));
    ((org.jsoup.parser.XmlTreeBuilder)v0).insert(((org.jsoup.parser.Token.Character)v2));
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "hidden";
    Object v2 = new org.jsoup.parser.Token.Character(((java.lang.String)v1));
    Object v3 = ((org.jsoup.parser.XmlTreeBuilder)v0).process(((org.jsoup.parser.Token)v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "Vth";
    Object v2 = "td";
    Object v3 = 3;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "tfoot";
    Object v2 = "tr";
    Object v3 = 3;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "br";
    Object v2 = "t";
    Object v3 = 3;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "htm!";
    Object v2 = "tol";
    Object v3 = 3;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "tbody";
    Object v2 = "ul";
    Object v3 = 3;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "caption";
    Object v2 = " ";
    Object v3 = 3;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "hNml";
    Object v2 = "summary";
    Object v3 = 3;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    Object v5 = 3;
    Object v6 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v5).intValue()));
    Object v7 = ((java.util.ArrayList)v4).retainAll(((java.util.Collection)v6));
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "html";
    Object v2 = "html";
    Object v3 = 3;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "section";
    Object v2 = "script";
    Object v3 = 3;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    Object v5 = java.util.Comparator.reverseOrder();
    ((java.util.ArrayList)v4).sort(((java.util.Comparator)v5));
    Object v6 = null;
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "menu";
    Object v2 = " tml";
    Object v3 = 3;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "Xtml";
    Object v2 = "caption";
    Object v3 = 3;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "td";
    Object v2 = "inp4t";
    Object v3 = 3;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "dta-";
    Object v2 = "cel";
    Object v3 = 3;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "select";
    Object v2 = "";
    Object v3 = 3;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "noframeL";
    Object v2 = "tboy";
    Object v3 = 3;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    Object v5 = ((java.util.ArrayList)v4).iterator();
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "";
    Object v2 = "";
    Object v3 = 3;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "tfoot";
    Object v2 = "tab8e";
    Object v3 = 3;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "hy";
    Object v2 = "li";
    Object v3 = 3;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    Object v5 = ((java.util.ArrayList)v4).toArray();
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "thead";
    Object v2 = "body";
    Object v3 = 3;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "jth";
    Object v2 = "htmX";
    Object v3 = 3;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "td";
    Object v2 = "tml";
    Object v3 = 3;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "script";
    Object v2 = "script";
    Object v3 = 3;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = ",6";
    Object v2 = "Character";
    Object v3 = 3;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "had";
    Object v2 = "Lp";
    Object v3 = 3;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    Object v5 = ((java.util.ArrayList)v4).toArray();
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "noframesP";
    Object v2 = "caption";
    Object v3 = 3;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "hea";
    Object v2 = "cot";
    Object v3 = 3;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    Object v5 = ((java.util.ArrayList)v4).listIterator();
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "head";
    Object v2 = "<";
    Object v3 = 3;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    Object v5 = new java.lang.Object[]{null,null};
    Object v6 = ((java.util.ArrayList)v4).toArray(((java.lang.Object[])v5));
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "dSt";
    Object v2 = "table";
    Object v3 = 3;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    Object v5 = 3;
    Object v6 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v5).intValue()));
    Object v7 = ((java.util.ArrayList)v4).equals(((java.lang.Object)v6));
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "application/xml";
    Object v2 = "td";
    Object v3 = 3;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "tfoot";
    Object v2 = "optgroup";
    Object v3 = 3;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "h ml";
    Object v2 = "h";
    Object v3 = 3;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "th";
    Object v2 = " ";
    Object v3 = 3;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "F";
    Object v2 = "tfoo";
    Object v3 = 3;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    Object v5 = new org.jsoup.parser.Token.Doctype();
    Object v6 = java.util.function.Predicate.isEqual(((java.lang.Object)v5));
    Object v7 = ((java.util.ArrayList)v4).removeIf(((java.util.function.Predicate)v6));
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "td";
    Object v2 = "<";
    Object v3 = 3;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = " ";
    Object v2 = "basefont";
    Object v3 = 3;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "l6";
    Object v2 = "name";
    Object v3 = 3;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "thepad";
    Object v2 = "t$head";
    Object v3 = 3;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "meta";
    Object v2 = "UTF98";
    Object v3 = 3;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "body";
    Object v2 = "tbody";
    Object v3 = 3;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    Object v5 = 3;
    Object v6 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v5).intValue()));
    Object v7 = ((java.util.ArrayList)v4).addAll(((java.util.Collection)v6));
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "Pp";
    Object v2 = "h94";
    Object v3 = 3;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "thead";
    Object v2 = "b";
    Object v3 = 3;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "col";
    Object v2 = "";
    Object v3 = 3;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "html";
    Object v2 = "aarticle";
    Object v3 = 3;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    Object v5 = 3;
    ((java.util.ArrayList)v4).ensureCapacity((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "html";
    Object v2 = "</";
    Object v3 = 3;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    Object v5 = ((java.util.ArrayList)v4).iterator();
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "t<d";
    Object v2 = "img";
    Object v3 = 3;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "optioP";
    Object v2 = "tbod";
    Object v3 = 3;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "r";
    Object v2 = "htm";
    Object v3 = 3;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "command";
    Object v2 = "td";
    Object v3 = 3;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "thead";
    Object v2 = "col";
    Object v3 = 3;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "br";
    Object v2 = "html";
    Object v3 = 3;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "strong";
    Object v2 = ">td";
    Object v3 = 3;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "l";
    Object v2 = "li";
    Object v3 = 3;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "brF";
    Object v2 = "select";
    Object v3 = 3;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "tr";
    Object v2 = "UTF-8";
    Object v3 = 3;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "h2";
    Object v2 = "foot";
    Object v3 = 3;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "r";
    Object v2 = "https";
    Object v3 = 3;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "hiden";
    Object v2 = "td";
    Object v3 = 3;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "tml";
    Object v2 = "thead";
    Object v3 = 3;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "rh3";
    Object v2 = "tbody";
    Object v3 = 3;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "input";
    Object v2 = "body";
    Object v3 = 3;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "Set-Cookie";
    Object v2 = "html";
    Object v3 = 3;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "selet";
    Object v2 = "dd";
    Object v3 = 3;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "meta";
    Object v2 = "body";
    Object v3 = 3;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "b|ody";
    Object v2 = "</";
    Object v3 = 3;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    Object v5 = 3;
    Object v6 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v5).intValue()));
    Object v7 = ((java.util.AbstractCollection)v4).containsAll(((java.util.Collection)v6));
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "tfYot";
    Object v2 = "noscriptm";
    Object v3 = 3;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "html";
    Object v2 = "'td";
    Object v3 = 3;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "textarea";
    Object v2 = "rp";
    Object v3 = 3;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "td";
    Object v2 = "tab?e";
    Object v3 = 3;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    Object v5 = new org.jsoup.parser.Token.Doctype();
    Object v6 = java.util.function.Predicate.isEqual(((java.lang.Object)v5));
    Object v7 = ((java.util.ArrayList)v4).removeIf(((java.util.function.Predicate)v6));
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "frameset";
    Object v2 = "tbody";
    Object v3 = 3;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "html";
    Object v2 = "h2";
    Object v3 = 3;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "tr";
    Object v2 = "bodyl";
    Object v3 = 3;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "h5&";
    Object v2 = "tbod";
    Object v3 = 3;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    Object v5 = 3;
    Object v6 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v5).intValue()));
    Object v7 = ((java.util.ArrayList)v4).removeAll(((java.util.Collection)v6));
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "embed";
    Object v2 = "table";
    Object v3 = 3;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "menu";
    Object v2 = "html";
    Object v3 = 3;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "htm";
    Object v2 = "tfoot";
    Object v3 = 3;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    Object v5 = new org.jsoup.parser.Token.Comment();
    Object v6 = ((java.util.ArrayList)v4).equals(((java.lang.Object)v5));
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "framesMt";
    Object v2 = "option";
    Object v3 = 3;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    Object v5 = 3;
    Object v6 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v5).intValue()));
    Object v7 = ((java.util.ArrayList)v4).add(((java.lang.Object)v6));
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "scrKipt";
    Object v2 = "htm*";
    Object v3 = 3;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    Object v5 = ((java.util.ArrayList)v4).listIterator();
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "html";
    Object v2 = "c_l";
    Object v3 = 3;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "&tml";
    Object v2 = "htm";
    Object v3 = 3;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    ((java.util.ArrayList)v4).clear();
    Object v5 = null;
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "p";
    Object v2 = "noframes";
    Object v3 = 3;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "thead";
    Object v2 = "caption";
    Object v3 = 3;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "{";
    Object v2 = "ody";
    Object v3 = 3;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    Object v5 = "_";
    Object v6 = new org.jsoup.nodes.Attributes();
    Object v7 = new org.jsoup.parser.Token.StartTag(((java.lang.String)v5),((org.jsoup.nodes.Attributes)v6));
    Object v8 = ((java.util.ArrayList)v4).equals(((java.lang.Object)v7));
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "hQml";
    Object v2 = "thead";
    Object v3 = 3;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    Object v5 = 3;
    Object v6 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v5).intValue()));
    Object v7 = ((java.util.ArrayList)v4).removeAll(((java.util.Collection)v6));
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "CommentStartDash";
    Object v2 = "td8";
    Object v3 = 3;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "tbody";
    Object v2 = "%able";
    Object v3 = 3;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }
}
