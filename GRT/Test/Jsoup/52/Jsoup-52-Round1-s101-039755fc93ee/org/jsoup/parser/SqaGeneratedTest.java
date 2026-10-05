package org.jsoup.parser;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = new org.jsoup.parser.Token.EOF();
    Object v2 = ((org.jsoup.parser.XmlTreeBuilder)v0).process(((org.jsoup.parser.Token)v1));
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = new org.jsoup.parser.Token.Comment();
    ((org.jsoup.parser.XmlTreeBuilder)v0).insert(((org.jsoup.parser.Token.Comment)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = new org.jsoup.parser.Token.StartTag();
    Object v2 = ((org.jsoup.parser.XmlTreeBuilder)v0).insert(((org.jsoup.parser.Token.StartTag)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = new org.jsoup.parser.Token.Comment();
    Object v2 = ((org.jsoup.parser.XmlTreeBuilder)v0).process(((org.jsoup.parser.Token)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
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
  public void test5() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = new org.jsoup.parser.Token.StartTag();
    Object v2 = ((org.jsoup.parser.XmlTreeBuilder)v0).process(((org.jsoup.parser.Token)v1));
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
    Object v1 = new org.jsoup.parser.Token.Doctype();
    Object v2 = ((org.jsoup.parser.Token.Doctype)v1).getSystemIdentifier();
    ((org.jsoup.parser.XmlTreeBuilder)v0).insert(((org.jsoup.parser.Token.Doctype)v1));
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = " ";
    Object v2 = "b";
    Object v3 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v4 = java.util.function.UnaryOperator.identity();
    ((java.util.ArrayList)v3).replaceAll(((java.util.function.UnaryOperator)v4));
    Object v5 = null;
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v3));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = new org.jsoup.parser.Token.Character();
    ((org.jsoup.parser.XmlTreeBuilder)v0).insert(((org.jsoup.parser.Token.Character)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "l";
    Object v2 = "a";
    Object v3 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v4 = ((org.jsoup.parser.XmlTreeBuilder)v0).parseFragment(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = new org.jsoup.parser.Token.Doctype();
    Object v2 = ((org.jsoup.parser.XmlTreeBuilder)v0).process(((org.jsoup.parser.Token)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = new org.jsoup.parser.Token.Character();
    Object v2 = ((org.jsoup.parser.XmlTreeBuilder)v0).process(((org.jsoup.parser.Token)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = new org.jsoup.parser.Token.Doctype();
    ((org.jsoup.parser.XmlTreeBuilder)v0).insert(((org.jsoup.parser.Token.Doctype)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "table";
    Object v2 = "tr";
    Object v3 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v4 = ((org.jsoup.parser.XmlTreeBuilder)v0).parseFragment(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "<!";
    Object v2 = "html(";
    Object v3 = org.jsoup.parser.ParseErrorList.noTracking();
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "tr";
    Object v2 = "tbodT";
    Object v3 = org.jsoup.parser.ParseErrorList.noTracking();
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "caption";
    Object v2 = "";
    Object v3 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v4 = ((org.jsoup.parser.XmlTreeBuilder)v0).parseFragment(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "thead";
    Object v2 = "Content-Encooding";
    Object v3 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v4 = ((org.jsoup.parser.XmlTreeBuilder)v0).parseFragment(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "tex`area";
    Object v2 = "tgh";
    Object v3 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v4 = ((org.jsoup.parser.XmlTreeBuilder)v0).parseFragment(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "htl";
    Object v2 = "cl";
    Object v3 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v4 = ((org.jsoup.parser.XmlTreeBuilder)v0).parseFragment(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "tfo";
    Object v2 = " ";
    Object v3 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v4 = ((org.jsoup.parser.XmlTreeBuilder)v0).parseFragment(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "actio";
    Object v2 = "h7ml";
    Object v3 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v4 = ((org.jsoup.parser.XmlTreeBuilder)v0).parseFragment(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "style";
    Object v2 = "htbl";
    Object v3 = org.jsoup.parser.ParseErrorList.noTracking();
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "";
    Object v2 = "";
    Object v3 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v4 = 1;
    ((java.util.ArrayList)v3).ensureCapacity((((java.lang.Integer)v4).intValue()));
    Object v5 = null;
    Object v6 = ((org.jsoup.parser.XmlTreeBuilder)v0).parseFragment(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v3));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "tabl";
    Object v2 = "!=";
    Object v3 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v4 = ((org.jsoup.parser.XmlTreeBuilder)v0).parseFragment(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "";
    Object v2 = "h";
    Object v3 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v4 = new java.lang.Object[]{};
    Object v5 = ((java.util.ArrayList)v3).toArray(((java.lang.Object[])v4));
    Object v6 = ((org.jsoup.parser.XmlTreeBuilder)v0).parseFragment(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v3));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "titlew";
    Object v2 = "";
    Object v3 = org.jsoup.parser.ParseErrorList.noTracking();
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "html";
    Object v2 = "h3";
    Object v3 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v4 = ((java.util.ArrayList)v3).hashCode();
    Object v5 = ((org.jsoup.parser.XmlTreeBuilder)v0).parseFragment(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v3));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "bae";
    Object v2 = "html";
    Object v3 = org.jsoup.parser.ParseErrorList.noTracking();
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "";
    Object v2 = "table";
    Object v3 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v4 = ((org.jsoup.parser.XmlTreeBuilder)v0).parseFragment(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "summary";
    Object v2 = "meta";
    Object v3 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v4 = java.util.Comparator.reverseOrder();
    ((java.util.ArrayList)v3).sort(((java.util.Comparator)v4));
    Object v5 = null;
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v3));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "tale";
    Object v2 = "";
    Object v3 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v4 = ((org.jsoup.parser.XmlTreeBuilder)v0).parseFragment(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "br";
    Object v2 = "caption";
    Object v3 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v4 = ((org.jsoup.parser.XmlTreeBuilder)v0).parseFragment(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "RcdataLessthanSijn";
    Object v2 = "link";
    Object v3 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v4 = ((java.util.AbstractCollection)v3).toString();
    Object v5 = ((org.jsoup.parser.XmlTreeBuilder)v0).parseFragment(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v3));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "rp";
    Object v2 = "tr";
    Object v3 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v4 = ((org.jsoup.parser.XmlTreeBuilder)v0).parseFragment(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = " ";
    Object v2 = "kdeygen";
    Object v3 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v4 = ((org.jsoup.parser.XmlTreeBuilder)v0).parseFragment(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "rp";
    Object v2 = "a";
    Object v3 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v4 = new org.jsoup.parser.XmlTreeBuilder();
    Object v5 = "tale";
    Object v6 = "";
    Object v7 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v8 = ((org.jsoup.parser.XmlTreeBuilder)v4).parseFragment(((java.lang.String)v5),((java.lang.String)v6),((org.jsoup.parser.ParseErrorList)v7));
    Object v9 = ((java.util.ArrayList)v3).addAll(((java.util.Collection)v8));
    Object v10 = ((org.jsoup.parser.XmlTreeBuilder)v0).parseFragment(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v3));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "htmQ";
    Object v2 = "Chtml";
    Object v3 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v4 = ((java.util.ArrayList)v3).iterator();
    Object v5 = ((org.jsoup.parser.XmlTreeBuilder)v0).parseFragment(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v3));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "";
    Object v2 = "thead";
    Object v3 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v4 = ((org.jsoup.parser.XmlTreeBuilder)v0).parseFragment(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "tabl{";
    Object v2 = "rp";
    Object v3 = org.jsoup.parser.ParseErrorList.noTracking();
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "o";
    Object v2 = "xml";
    Object v3 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v4 = ((org.jsoup.parser.XmlTreeBuilder)v0).parseFragment(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "addre&ss";
    Object v2 = "ins";
    Object v3 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v4 = ((org.jsoup.parser.XmlTreeBuilder)v0).parseFragment(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "d";
    Object v2 = "blockquete";
    Object v3 = org.jsoup.parser.ParseErrorList.noTracking();
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "thead";
    Object v2 = "";
    Object v3 = org.jsoup.parser.ParseErrorList.noTracking();
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "boLy";
    Object v2 = "nosript";
    Object v3 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v4 = ((java.util.ArrayList)v3).iterator();
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v3));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "b";
    Object v2 = "s";
    Object v3 = org.jsoup.parser.ParseErrorList.noTracking();
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "details";
    Object v2 = "usae: supply url to fetch";
    Object v3 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v4 = ((org.jsoup.parser.XmlTreeBuilder)v0).parseFragment(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "href";
    Object v2 = "";
    Object v3 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v4 = ((org.jsoup.parser.XmlTreeBuilder)v0).parseFragment(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "html";
    Object v2 = "tab";
    Object v3 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v4 = ((org.jsoup.parser.XmlTreeBuilder)v0).parseFragment(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "Location";
    Object v2 = "framV";
    Object v3 = org.jsoup.parser.ParseErrorList.noTracking();
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "asidO";
    Object v2 = "sma";
    Object v3 = org.jsoup.parser.ParseErrorList.noTracking();
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "Do}ctype";
    Object v2 = "colgroup";
    Object v3 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v4 = ((org.jsoup.parser.XmlTreeBuilder)v0).parseFragment(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "p";
    Object v2 = "{";
    Object v3 = org.jsoup.parser.ParseErrorList.noTracking();
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "?";
    Object v2 = ";";
    Object v3 = org.jsoup.parser.ParseErrorList.noTracking();
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "html";
    Object v2 = "8";
    Object v3 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v4 = ((org.jsoup.parser.XmlTreeBuilder)v0).parseFragment(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "thead";
    Object v2 = "|";
    Object v3 = org.jsoup.parser.ParseErrorList.noTracking();
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "br";
    Object v2 = "U";
    Object v3 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v4 = ((org.jsoup.parser.XmlTreeBuilder)v0).parseFragment(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "hml";
    Object v2 = "F";
    Object v3 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v4 = ((org.jsoup.parser.XmlTreeBuilder)v0).parseFragment(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "frames";
    Object v2 = "xlns";
    Object v3 = org.jsoup.parser.ParseErrorList.noTracking();
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "";
    Object v2 = "textarea";
    Object v3 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v4 = ((org.jsoup.parser.XmlTreeBuilder)v0).parseFragment(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "html";
    Object v2 = "tf";
    Object v3 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v4 = ((org.jsoup.parser.XmlTreeBuilder)v0).parseFragment(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "tf";
    Object v2 = "?";
    Object v3 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v4 = ((java.util.ArrayList)v3).hashCode();
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v3));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "tfoot";
    Object v2 = "";
    Object v3 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v4 = ((org.jsoup.parser.XmlTreeBuilder)v0).parseFragment(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "-'!";
    Object v2 = "b";
    Object v3 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v4 = ((org.jsoup.parser.XmlTreeBuilder)v0).parseFragment(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "theal";
    Object v2 = ";li";
    Object v3 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v4 = ((org.jsoup.parser.XmlTreeBuilder)v0).parseFragment(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "xmlns,";
    Object v2 = ":all_";
    Object v3 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v4 = ((org.jsoup.parser.XmlTreeBuilder)v0).parseFragment(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "thead";
    Object v2 = "t";
    Object v3 = org.jsoup.parser.ParseErrorList.noTracking();
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "c";
    Object v2 = "br";
    Object v3 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v4 = ((org.jsoup.parser.XmlTreeBuilder)v0).parseFragment(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "type";
    Object v2 = "tablr";
    Object v3 = org.jsoup.parser.ParseErrorList.noTracking();
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "t^d";
    Object v2 = "opti.n";
    Object v3 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v4 = ((org.jsoup.parser.XmlTreeBuilder)v0).parseFragment(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = ">";
    Object v2 = "noframe";
    Object v3 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v4 = ((org.jsoup.parser.XmlTreeBuilder)v0).parseFragment(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "centr";
    Object v2 = "tCead";
    Object v3 = org.jsoup.parser.ParseErrorList.noTracking();
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "<";
    Object v2 = "C#";
    Object v3 = org.jsoup.parser.ParseErrorList.noTracking();
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "p";
    Object v2 = "head";
    Object v3 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v4 = ((org.jsoup.parser.XmlTreeBuilder)v0).parseFragment(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "figure";
    Object v2 = "pram";
    Object v3 = org.jsoup.parser.ParseErrorList.noTracking();
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "h4";
    Object v2 = "tbody";
    Object v3 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v4 = ((org.jsoup.parser.XmlTreeBuilder)v0).parseFragment(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "colgr";
    Object v2 = "thead";
    Object v3 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v4 = ((org.jsoup.parser.XmlTreeBuilder)v0).parseFragment(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "frames";
    Object v2 = "*";
    Object v3 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v4 = ((org.jsoup.parser.XmlTreeBuilder)v0).parseFragment(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "co}group";
    Object v2 = "Data coJllection must not be null";
    Object v3 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v4 = ((java.util.ArrayList)v3).toArray();
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v3));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "optgrou|";
    Object v2 = "'tbody";
    Object v3 = org.jsoup.parser.ParseErrorList.noTracking();
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "";
    Object v2 = "";
    Object v3 = org.jsoup.parser.ParseErrorList.noTracking();
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "html";
    Object v2 = "tablle";
    Object v3 = org.jsoup.parser.ParseErrorList.noTracking();
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "tr";
    Object v2 = "bgsound";
    Object v3 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v4 = ((java.util.ArrayList)v3).spliterator();
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v3));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "hgroup";
    Object v2 = "htm";
    Object v3 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v4 = ((java.util.ArrayList)v3).listIterator();
    Object v5 = ((org.jsoup.parser.XmlTreeBuilder)v0).parseFragment(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v3));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "textarea";
    Object v2 = "~br";
    Object v3 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v4 = ((org.jsoup.parser.XmlTreeBuilder)v0).parseFragment(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "select";
    Object v2 = "/";
    Object v3 = org.jsoup.parser.ParseErrorList.noTracking();
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = ".";
    Object v2 = "body";
    Object v3 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v4 = ((java.util.ArrayList)v3).iterator();
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v3));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "t";
    Object v2 = "html";
    Object v3 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v4 = ((org.jsoup.parser.XmlTreeBuilder)v0).parseFragment(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "b!ody";
    Object v2 = "data-";
    Object v3 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v4 = ((org.jsoup.parser.XmlTreeBuilder)v0).parseFragment(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "body";
    Object v2 = "title";
    Object v3 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v4 = ((org.jsoup.parser.XmlTreeBuilder)v0).parseFragment(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "h2";
    Object v2 = "a";
    Object v3 = org.jsoup.parser.ParseErrorList.noTracking();
    ((java.util.ArrayList)v3).trimToSize();
    Object v4 = null;
    Object v5 = ((org.jsoup.parser.XmlTreeBuilder)v0).parseFragment(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v3));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "<</";
    Object v2 = "tr";
    Object v3 = org.jsoup.parser.ParseErrorList.noTracking();
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = ".";
    Object v2 = "htlml";
    Object v3 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v4 = ((org.jsoup.parser.XmlTreeBuilder)v0).parseFragment(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "li";
    Object v2 = "thead";
    Object v3 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v4 = ((org.jsoup.parser.XmlTreeBuilder)v0).parseFragment(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "<";
    Object v2 = "wbr";
    Object v3 = org.jsoup.parser.ParseErrorList.noTracking();
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "html";
    Object v2 = "col";
    Object v3 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v4 = ((org.jsoup.parser.XmlTreeBuilder)v0).parseFragment(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "col";
    Object v2 = "textarea";
    Object v3 = org.jsoup.parser.ParseErrorList.noTracking();
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "tbody";
    Object v2 = "blockquote";
    Object v3 = org.jsoup.parser.ParseErrorList.noTracking();
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "";
    Object v2 = "dd";
    Object v3 = org.jsoup.parser.ParseErrorList.noTracking();
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }
}
