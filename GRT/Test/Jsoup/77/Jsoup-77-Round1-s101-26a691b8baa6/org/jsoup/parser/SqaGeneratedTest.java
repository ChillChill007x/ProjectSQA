package org.jsoup.parser;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = new org.jsoup.parser.Token.StartTag();
    Object v2 = ((org.jsoup.parser.XmlTreeBuilder)v0).insert(((org.jsoup.parser.Token.StartTag)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "b";
    Object v2 = "tr";
    Object v3 = 7;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    Object v5 = false;
    Object v6 = false;
    Object v7 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = ((org.jsoup.parser.XmlTreeBuilder)v0).parseFragment(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4),((org.jsoup.parser.ParseSettings)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = new org.jsoup.parser.Token.StartTag();
    Object v2 = ((org.jsoup.parser.XmlTreeBuilder)v0).process(((org.jsoup.parser.Token)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = new org.jsoup.parser.Token.Character();
    ((org.jsoup.parser.XmlTreeBuilder)v0).insert(((org.jsoup.parser.Token.Character)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = new org.jsoup.parser.Token.Comment();
    ((org.jsoup.parser.XmlTreeBuilder)v0).insert(((org.jsoup.parser.Token.Comment)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = java.io.Reader.nullReader();
    Object v2 = "Ka";
    Object v3 = 7;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    Object v5 = false;
    Object v6 = false;
    Object v7 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()));
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.io.Reader)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4),((org.jsoup.parser.ParseSettings)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "wid";
    Object v2 = "";
    Object v3 = ((org.jsoup.parser.XmlTreeBuilder)v0).parse(((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = new org.jsoup.parser.Token.Character();
    Object v2 = ((org.jsoup.parser.XmlTreeBuilder)v0).process(((org.jsoup.parser.Token)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = ((org.jsoup.parser.XmlTreeBuilder)v0).defaultSettings();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = java.io.Reader.nullReader();
    Object v2 = "address";
    Object v3 = 7;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    Object v5 = ((java.util.AbstractCollection)v4).toString();
    Object v6 = false;
    Object v7 = false;
    Object v8 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v6).booleanValue()),(((java.lang.Boolean)v7).booleanValue()));
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.io.Reader)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4),((org.jsoup.parser.ParseSettings)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "t8h";
    Object v2 = "plaintext";
    Object v3 = ((org.jsoup.parser.XmlTreeBuilder)v0).parse(((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = new org.jsoup.parser.Token.Comment();
    Object v2 = ((org.jsoup.parser.Token.Comment)v1).toString();
    ((org.jsoup.parser.XmlTreeBuilder)v0).insert(((org.jsoup.parser.Token.Comment)v1));
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "styleD";
    Object v2 = "h2";
    Object v3 = ((org.jsoup.parser.XmlTreeBuilder)v0).parse(((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "tfooKt";
    Object v2 = "td";
    Object v3 = ((org.jsoup.parser.XmlTreeBuilder)v0).parse(((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = java.io.Reader.nullReader();
    Object v2 = "html";
    Object v3 = 7;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    Object v5 = false;
    Object v6 = false;
    Object v7 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()));
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.io.Reader)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4),((org.jsoup.parser.ParseSettings)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = java.io.Reader.nullReader();
    Object v2 = "";
    Object v3 = ((org.jsoup.parser.XmlTreeBuilder)v0).parse(((java.io.Reader)v1),((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "tra";
    Object v2 = "td";
    Object v3 = 7;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    Object v5 = new org.jsoup.parser.XmlTreeBuilder();
    Object v6 = ((org.jsoup.parser.XmlTreeBuilder)v5).defaultSettings();
    Object v7 = ((java.util.ArrayList)v4).remove(((java.lang.Object)v6));
    Object v8 = new org.jsoup.parser.XmlTreeBuilder();
    Object v9 = ((org.jsoup.parser.XmlTreeBuilder)v8).defaultSettings();
    Object v10 = ((org.jsoup.parser.XmlTreeBuilder)v0).parseFragment(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4),((org.jsoup.parser.ParseSettings)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = ">";
    Object v2 = "svm";
    Object v3 = 7;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    Object v5 = new org.jsoup.parser.XmlTreeBuilder();
    Object v6 = ((org.jsoup.parser.XmlTreeBuilder)v5).defaultSettings();
    Object v7 = ((org.jsoup.parser.XmlTreeBuilder)v0).parseFragment(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4),((org.jsoup.parser.ParseSettings)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = new org.jsoup.parser.Token.Doctype();
    ((org.jsoup.parser.XmlTreeBuilder)v0).insert(((org.jsoup.parser.Token.Doctype)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "html";
    Object v2 = "html";
    Object v3 = ((org.jsoup.parser.XmlTreeBuilder)v0).parse(((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = new org.jsoup.parser.Token.Doctype();
    Object v2 = ((org.jsoup.parser.XmlTreeBuilder)v0).process(((org.jsoup.parser.Token)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = new org.jsoup.parser.Token.Comment();
    Object v2 = ((org.jsoup.parser.XmlTreeBuilder)v0).process(((org.jsoup.parser.Token)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = java.io.Reader.nullReader();
    Object v2 = new java.io.StringWriter();
    Object v3 = ((java.io.Reader)v1).transferTo(((java.io.Writer)v2));
    Object v4 = "td";
    Object v5 = 7;
    Object v6 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v5).intValue()));
    Object v7 = 7;
    Object v8 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v7).intValue()));
    Object v9 = ((java.util.ArrayList)v6).addAll(((java.util.Collection)v8));
    Object v10 = false;
    Object v11 = false;
    Object v12 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v10).booleanValue()),(((java.lang.Boolean)v11).booleanValue()));
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.io.Reader)v1),((java.lang.String)v4),((org.jsoup.parser.ParseErrorList)v6),((org.jsoup.parser.ParseSettings)v12));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = java.io.Reader.nullReader();
    Object v2 = "";
    Object v3 = 7;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    Object v5 = false;
    Object v6 = false;
    Object v7 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()));
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.io.Reader)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4),((org.jsoup.parser.ParseSettings)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = java.io.Reader.nullReader();
    Object v2 = "table";
    Object v3 = 7;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    Object v5 = false;
    Object v6 = false;
    Object v7 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()));
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.io.Reader)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4),((org.jsoup.parser.ParseSettings)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = java.io.Reader.nullReader();
    Object v2 = "--w";
    Object v3 = ((org.jsoup.parser.XmlTreeBuilder)v0).parse(((java.io.Reader)v1),((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = ":matches(regex) query must not be empty";
    Object v2 = "table";
    Object v3 = ((org.jsoup.parser.XmlTreeBuilder)v0).parse(((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = java.io.Reader.nullReader();
    Object v2 = new java.io.StringWriter();
    Object v3 = ((java.io.Reader)v1).transferTo(((java.io.Writer)v2));
    Object v4 = "abide";
    Object v5 = ((org.jsoup.parser.XmlTreeBuilder)v0).parse(((java.io.Reader)v1),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = java.io.Reader.nullReader();
    Object v2 = "htmT";
    Object v3 = 7;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    Object v5 = false;
    Object v6 = false;
    Object v7 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()));
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.io.Reader)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4),((org.jsoup.parser.ParseSettings)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "col";
    Object v2 = "PU";
    Object v3 = 7;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    Object v5 = new org.jsoup.parser.Token.Character();
    Object v6 = ((java.util.ArrayList)v4).equals(((java.lang.Object)v5));
    Object v7 = new org.jsoup.parser.XmlTreeBuilder();
    Object v8 = ((org.jsoup.parser.XmlTreeBuilder)v7).defaultSettings();
    Object v9 = ((org.jsoup.parser.XmlTreeBuilder)v0).parseFragment(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4),((org.jsoup.parser.ParseSettings)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = java.io.Reader.nullReader();
    Object v2 = "tr";
    Object v3 = 7;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    Object v5 = false;
    Object v6 = false;
    Object v7 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()));
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.io.Reader)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4),((org.jsoup.parser.ParseSettings)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = java.io.Reader.nullReader();
    Object v2 = "#_";
    Object v3 = ((org.jsoup.parser.XmlTreeBuilder)v0).parse(((java.io.Reader)v1),((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "tfoot";
    Object v2 = "";
    Object v3 = ((org.jsoup.parser.XmlTreeBuilder)v0).parse(((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = java.io.Reader.nullReader();
    Object v2 = "tml";
    Object v3 = 7;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    Object v5 = new org.jsoup.parser.XmlTreeBuilder();
    Object v6 = ((org.jsoup.parser.XmlTreeBuilder)v5).defaultSettings();
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.io.Reader)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4),((org.jsoup.parser.ParseSettings)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "Unexpected token type: ";
    Object v2 = "br";
    Object v3 = 7;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    Object v5 = new org.jsoup.parser.XmlTreeBuilder();
    Object v6 = ((org.jsoup.parser.XmlTreeBuilder)v5).defaultSettings();
    Object v7 = ((org.jsoup.parser.XmlTreeBuilder)v0).parseFragment(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4),((org.jsoup.parser.ParseSettings)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "7";
    Object v2 = "#d";
    Object v3 = 7;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    Object v5 = new org.jsoup.parser.XmlTreeBuilder();
    Object v6 = ((org.jsoup.parser.XmlTreeBuilder)v5).defaultSettings();
    Object v7 = ((org.jsoup.parser.XmlTreeBuilder)v0).parseFragment(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4),((org.jsoup.parser.ParseSettings)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "";
    Object v2 = "bod";
    Object v3 = 7;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    ((java.util.ArrayList)v4).trimToSize();
    Object v5 = null;
    Object v6 = false;
    Object v7 = false;
    Object v8 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v6).booleanValue()),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ((org.jsoup.parser.XmlTreeBuilder)v0).parseFragment(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4),((org.jsoup.parser.ParseSettings)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = java.io.Reader.nullReader();
    Object v2 = "script";
    Object v3 = 7;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    Object v5 = new org.jsoup.parser.XmlTreeBuilder();
    Object v6 = ((org.jsoup.parser.XmlTreeBuilder)v5).defaultSettings();
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.io.Reader)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4),((org.jsoup.parser.ParseSettings)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = java.io.Reader.nullReader();
    Object v2 = "head";
    Object v3 = ((org.jsoup.parser.XmlTreeBuilder)v0).parse(((java.io.Reader)v1),((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = java.io.Reader.nullReader();
    Object v2 = ((java.io.Reader)v1).read();
    Object v3 = "dir";
    Object v4 = ((org.jsoup.parser.XmlTreeBuilder)v0).parse(((java.io.Reader)v1),((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "colgroup";
    Object v2 = "col";
    Object v3 = ((org.jsoup.parser.XmlTreeBuilder)v0).parse(((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = java.io.Reader.nullReader();
    Object v2 = "~";
    Object v3 = 7;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    Object v5 = new org.jsoup.parser.XmlTreeBuilder();
    Object v6 = ">";
    Object v7 = "svm";
    Object v8 = 7;
    Object v9 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v8).intValue()));
    Object v10 = new org.jsoup.parser.XmlTreeBuilder();
    Object v11 = ((org.jsoup.parser.XmlTreeBuilder)v10).defaultSettings();
    Object v12 = ((org.jsoup.parser.XmlTreeBuilder)v5).parseFragment(((java.lang.String)v6),((java.lang.String)v7),((org.jsoup.parser.ParseErrorList)v9),((org.jsoup.parser.ParseSettings)v11));
    Object v13 = ((java.util.AbstractCollection)v4).containsAll(((java.util.Collection)v12));
    Object v14 = false;
    Object v15 = false;
    Object v16 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v14).booleanValue()),(((java.lang.Boolean)v15).booleanValue()));
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.io.Reader)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4),((org.jsoup.parser.ParseSettings)v16));
    Object v17 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "title";
    Object v2 = "tfoot";
    Object v3 = 7;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    Object v5 = false;
    Object v6 = false;
    Object v7 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = ((org.jsoup.parser.XmlTreeBuilder)v0).parseFragment(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4),((org.jsoup.parser.ParseSettings)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "noframes";
    Object v2 = "ol";
    Object v3 = ((org.jsoup.parser.XmlTreeBuilder)v0).parse(((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "thead";
    Object v2 = "name";
    Object v3 = 7;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    Object v5 = false;
    Object v6 = false;
    Object v7 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = ((org.jsoup.parser.XmlTreeBuilder)v0).parseFragment(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4),((org.jsoup.parser.ParseSettings)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "";
    Object v2 = "body";
    Object v3 = 7;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    Object v5 = false;
    Object v6 = false;
    Object v7 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = ((org.jsoup.parser.XmlTreeBuilder)v0).parseFragment(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4),((org.jsoup.parser.ParseSettings)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = new org.jsoup.parser.Token.Doctype();
    Object v2 = ((org.jsoup.parser.Token.Doctype)v1).getSystemIdentifier();
    ((org.jsoup.parser.XmlTreeBuilder)v0).insert(((org.jsoup.parser.Token.Doctype)v1));
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "Unexpected character '%s' in input state [%s]";
    Object v2 = "";
    Object v3 = 7;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    Object v5 = false;
    Object v6 = false;
    Object v7 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = ((org.jsoup.parser.XmlTreeBuilder)v0).parseFragment(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4),((org.jsoup.parser.ParseSettings)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = java.io.Reader.nullReader();
    Object v2 = "hdml";
    Object v3 = ((org.jsoup.parser.XmlTreeBuilder)v0).parse(((java.io.Reader)v1),((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = java.io.Reader.nullReader();
    Object v2 = "able";
    Object v3 = 7;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    Object v5 = ((java.util.ArrayList)v4).hashCode();
    Object v6 = new org.jsoup.parser.XmlTreeBuilder();
    Object v7 = ((org.jsoup.parser.XmlTreeBuilder)v6).defaultSettings();
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.io.Reader)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4),((org.jsoup.parser.ParseSettings)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = java.io.Reader.nullReader();
    Object v2 = "td";
    Object v3 = 7;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    Object v5 = new org.jsoup.parser.XmlTreeBuilder();
    Object v6 = ((org.jsoup.parser.XmlTreeBuilder)v5).defaultSettings();
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.io.Reader)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4),((org.jsoup.parser.ParseSettings)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = java.io.Reader.nullReader();
    Object v2 = "ol";
    Object v3 = ((org.jsoup.parser.XmlTreeBuilder)v0).parse(((java.io.Reader)v1),((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "vody";
    Object v2 = "bod";
    Object v3 = 7;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    Object v5 = new org.jsoup.parser.XmlTreeBuilder();
    Object v6 = ((org.jsoup.parser.XmlTreeBuilder)v5).defaultSettings();
    Object v7 = ((org.jsoup.parser.XmlTreeBuilder)v0).parseFragment(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4),((org.jsoup.parser.ParseSettings)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = java.io.Reader.nullReader();
    Object v2 = "styl";
    Object v3 = ((org.jsoup.parser.XmlTreeBuilder)v0).parse(((java.io.Reader)v1),((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "a";
    Object v2 = "X";
    Object v3 = ((org.jsoup.parser.XmlTreeBuilder)v0).parse(((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = java.io.Reader.nullReader();
    Object v2 = "bod";
    Object v3 = 7;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    Object v5 = new org.jsoup.parser.XmlTreeBuilder();
    Object v6 = "tra";
    Object v7 = "td";
    Object v8 = 7;
    Object v9 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v8).intValue()));
    Object v10 = new org.jsoup.parser.XmlTreeBuilder();
    Object v11 = ((org.jsoup.parser.XmlTreeBuilder)v10).defaultSettings();
    Object v12 = ((java.util.ArrayList)v9).remove(((java.lang.Object)v11));
    Object v13 = new org.jsoup.parser.XmlTreeBuilder();
    Object v14 = ((org.jsoup.parser.XmlTreeBuilder)v13).defaultSettings();
    Object v15 = ((org.jsoup.parser.XmlTreeBuilder)v5).parseFragment(((java.lang.String)v6),((java.lang.String)v7),((org.jsoup.parser.ParseErrorList)v9),((org.jsoup.parser.ParseSettings)v14));
    Object v16 = ((java.util.AbstractCollection)v4).containsAll(((java.util.Collection)v15));
    Object v17 = false;
    Object v18 = false;
    Object v19 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v17).booleanValue()),(((java.lang.Boolean)v18).booleanValue()));
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.io.Reader)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4),((org.jsoup.parser.ParseSettings)v19));
    Object v20 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "html";
    Object v2 = "frame";
    Object v3 = 7;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    ((java.util.ArrayList)v4).clear();
    Object v5 = null;
    Object v6 = new org.jsoup.parser.XmlTreeBuilder();
    Object v7 = ((org.jsoup.parser.XmlTreeBuilder)v6).defaultSettings();
    Object v8 = ((org.jsoup.parser.XmlTreeBuilder)v0).parseFragment(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4),((org.jsoup.parser.ParseSettings)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "html";
    Object v2 = "input";
    Object v3 = 7;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    Object v5 = new org.jsoup.parser.XmlTreeBuilder();
    Object v6 = ((org.jsoup.parser.XmlTreeBuilder)v5).defaultSettings();
    Object v7 = ((org.jsoup.parser.XmlTreeBuilder)v0).parseFragment(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4),((org.jsoup.parser.ParseSettings)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = java.io.Reader.nullReader();
    ((java.io.Reader)v1).close();
    Object v2 = null;
    Object v3 = "hml";
    Object v4 = 7;
    Object v5 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v4).intValue()));
    Object v6 = new org.jsoup.parser.XmlTreeBuilder();
    Object v7 = ((org.jsoup.parser.XmlTreeBuilder)v6).defaultSettings();
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.io.Reader)v1),((java.lang.String)v3),((org.jsoup.parser.ParseErrorList)v5),((org.jsoup.parser.ParseSettings)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "shtml";
    Object v2 = "r";
    Object v3 = 7;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    Object v5 = false;
    Object v6 = false;
    Object v7 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = ((org.jsoup.parser.XmlTreeBuilder)v0).parseFragment(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4),((org.jsoup.parser.ParseSettings)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "br";
    Object v2 = "abs:";
    Object v3 = ((org.jsoup.parser.XmlTreeBuilder)v0).parse(((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = java.io.Reader.nullReader();
    Object v2 = "ht;l";
    Object v3 = 7;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    Object v5 = new org.jsoup.parser.XmlTreeBuilder();
    Object v6 = ((org.jsoup.parser.XmlTreeBuilder)v5).defaultSettings();
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.io.Reader)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4),((org.jsoup.parser.ParseSettings)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "c\\de";
    Object v2 = "b";
    Object v3 = 7;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    Object v5 = false;
    Object v6 = false;
    Object v7 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = ((org.jsoup.parser.XmlTreeBuilder)v0).parseFragment(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4),((org.jsoup.parser.ParseSettings)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = java.io.Reader.nullReader();
    Object v2 = "";
    Object v3 = 7;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    Object v5 = new org.jsoup.parser.XmlTreeBuilder();
    Object v6 = ((org.jsoup.parser.XmlTreeBuilder)v5).defaultSettings();
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.io.Reader)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4),((org.jsoup.parser.ParseSettings)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = java.io.Reader.nullReader();
    Object v2 = "namee";
    Object v3 = ((org.jsoup.parser.XmlTreeBuilder)v0).parse(((java.io.Reader)v1),((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = java.io.Reader.nullReader();
    Object v2 = "Content-Type";
    Object v3 = 7;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    Object v5 = new org.jsoup.parser.XmlTreeBuilder();
    Object v6 = ((org.jsoup.parser.XmlTreeBuilder)v5).defaultSettings();
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.io.Reader)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4),((org.jsoup.parser.ParseSettings)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "tKhead";
    Object v2 = "meta";
    Object v3 = ((org.jsoup.parser.XmlTreeBuilder)v0).parse(((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "meta";
    Object v2 = "teplate";
    Object v3 = 7;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    Object v5 = false;
    Object v6 = false;
    Object v7 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = ((org.jsoup.parser.XmlTreeBuilder)v0).parseFragment(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4),((org.jsoup.parser.ParseSettings)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = java.io.Reader.nullReader();
    Object v2 = "tbody";
    Object v3 = 7;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    Object v5 = new org.jsoup.parser.XmlTreeBuilder();
    Object v6 = ((org.jsoup.parser.XmlTreeBuilder)v5).defaultSettings();
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.io.Reader)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4),((org.jsoup.parser.ParseSettings)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = java.io.Reader.nullReader();
    Object v2 = "tt";
    Object v3 = 7;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    Object v5 = new org.jsoup.parser.XmlTreeBuilder();
    Object v6 = ((org.jsoup.parser.XmlTreeBuilder)v5).defaultSettings();
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.io.Reader)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4),((org.jsoup.parser.ParseSettings)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "thead";
    Object v2 = "b";
    Object v3 = ((org.jsoup.parser.XmlTreeBuilder)v0).parse(((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "br";
    Object v2 = "b";
    Object v3 = 7;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    Object v5 = false;
    Object v6 = false;
    Object v7 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = ((org.jsoup.parser.XmlTreeBuilder)v0).parseFragment(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4),((org.jsoup.parser.ParseSettings)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = java.io.Reader.nullReader();
    Object v2 = "script";
    Object v3 = ((org.jsoup.parser.XmlTreeBuilder)v0).parse(((java.io.Reader)v1),((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "caption";
    Object v2 = "html";
    Object v3 = ((org.jsoup.parser.XmlTreeBuilder)v0).parse(((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "name";
    Object v2 = "#";
    Object v3 = 7;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    Object v5 = false;
    Object v6 = false;
    Object v7 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = ((org.jsoup.parser.XmlTreeBuilder)v0).parseFragment(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4),((org.jsoup.parser.ParseSettings)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "!";
    Object v2 = "textarea";
    Object v3 = ((org.jsoup.parser.XmlTreeBuilder)v0).parse(((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = java.io.Reader.nullReader();
    Object v2 = new char[]{Character.valueOf((char)1)};
    Object v3 = ((java.io.Reader)v1).read(((char[])v2));
    Object v4 = "h`";
    Object v5 = 7;
    Object v6 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v5).intValue()));
    Object v7 = new org.jsoup.parser.XmlTreeBuilder();
    Object v8 = ((org.jsoup.parser.XmlTreeBuilder)v7).defaultSettings();
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.io.Reader)v1),((java.lang.String)v4),((org.jsoup.parser.ParseErrorList)v6),((org.jsoup.parser.ParseSettings)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = java.io.Reader.nullReader();
    Object v2 = "img";
    Object v3 = ((org.jsoup.parser.XmlTreeBuilder)v0).parse(((java.io.Reader)v1),((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = java.io.Reader.nullReader();
    Object v2 = "thead";
    Object v3 = ((org.jsoup.parser.XmlTreeBuilder)v0).parse(((java.io.Reader)v1),((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "arec";
    Object v2 = "link";
    Object v3 = 7;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    Object v5 = false;
    Object v6 = false;
    Object v7 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = ((org.jsoup.parser.XmlTreeBuilder)v0).parseFragment(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4),((org.jsoup.parser.ParseSettings)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "img";
    Object v2 = "html";
    Object v3 = 7;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    Object v5 = new org.jsoup.parser.XmlTreeBuilder();
    Object v6 = ((org.jsoup.parser.XmlTreeBuilder)v5).defaultSettings();
    Object v7 = ((org.jsoup.parser.XmlTreeBuilder)v0).parseFragment(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4),((org.jsoup.parser.ParseSettings)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "ISO-8859-1";
    Object v2 = "th";
    Object v3 = 7;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    Object v5 = false;
    Object v6 = false;
    Object v7 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = ((org.jsoup.parser.XmlTreeBuilder)v0).parseFragment(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4),((org.jsoup.parser.ParseSettings)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = java.io.Reader.nullReader();
    Object v2 = "html";
    Object v3 = ((org.jsoup.parser.XmlTreeBuilder)v0).parse(((java.io.Reader)v1),((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "hml";
    Object v2 = "hr";
    Object v3 = 7;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    Object v5 = false;
    Object v6 = false;
    Object v7 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = ((org.jsoup.parser.XmlTreeBuilder)v0).parseFragment(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4),((org.jsoup.parser.ParseSettings)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = java.io.Reader.nullReader();
    Object v2 = "bgsounM";
    Object v3 = ((org.jsoup.parser.XmlTreeBuilder)v0).parse(((java.io.Reader)v1),((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "";
    Object v2 = "td&";
    Object v3 = 7;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    Object v5 = new org.jsoup.parser.XmlTreeBuilder();
    Object v6 = ((org.jsoup.parser.XmlTreeBuilder)v5).defaultSettings();
    Object v7 = ((org.jsoup.parser.XmlTreeBuilder)v0).parseFragment(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4),((org.jsoup.parser.ParseSettings)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = java.io.Reader.nullReader();
    Object v2 = "cjaption";
    Object v3 = ((org.jsoup.parser.XmlTreeBuilder)v0).parse(((java.io.Reader)v1),((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = java.io.Reader.nullReader();
    Object v2 = "p";
    Object v3 = 7;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    Object v5 = new org.jsoup.parser.XmlTreeBuilder();
    Object v6 = ((org.jsoup.parser.XmlTreeBuilder)v5).defaultSettings();
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.io.Reader)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4),((org.jsoup.parser.ParseSettings)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = java.io.Reader.nullReader();
    Object v2 = "bod";
    Object v3 = ((org.jsoup.parser.XmlTreeBuilder)v0).parse(((java.io.Reader)v1),((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "p";
    Object v2 = "Conte";
    Object v3 = 7;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    Object v5 = false;
    Object v6 = false;
    Object v7 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = ((org.jsoup.parser.XmlTreeBuilder)v0).parseFragment(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4),((org.jsoup.parser.ParseSettings)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "!";
    Object v2 = "?";
    Object v3 = ((org.jsoup.parser.XmlTreeBuilder)v0).parse(((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = java.io.Reader.nullReader();
    Object v2 = "fr";
    Object v3 = 7;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    Object v5 = new org.jsoup.parser.XmlTreeBuilder();
    Object v6 = ((org.jsoup.parser.XmlTreeBuilder)v5).defaultSettings();
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.io.Reader)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4),((org.jsoup.parser.ParseSettings)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = java.io.Reader.nullReader();
    Object v2 = "body";
    Object v3 = ((org.jsoup.parser.XmlTreeBuilder)v0).parse(((java.io.Reader)v1),((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = java.io.Reader.nullReader();
    Object v2 = new char[]{Character.valueOf((char)0),Character.valueOf((char)1),Character.valueOf((char)1)};
    Object v3 = ((java.io.Reader)v1).read(((char[])v2));
    Object v4 = "colgroup";
    Object v5 = ((org.jsoup.parser.XmlTreeBuilder)v0).parse(((java.io.Reader)v1),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = java.io.Reader.nullReader();
    Object v2 = "daa-";
    Object v3 = ((org.jsoup.parser.XmlTreeBuilder)v0).parse(((java.io.Reader)v1),((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "unav";
    Object v2 = "colgoup";
    Object v3 = ((org.jsoup.parser.XmlTreeBuilder)v0).parse(((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = java.io.Reader.nullReader();
    Object v2 = "tr";
    Object v3 = 7;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    Object v5 = new org.jsoup.parser.XmlTreeBuilder();
    Object v6 = "tKhead";
    Object v7 = "meta";
    Object v8 = ((org.jsoup.parser.XmlTreeBuilder)v5).parse(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = ((java.util.ArrayList)v4).equals(((java.lang.Object)v8));
    Object v10 = new org.jsoup.parser.XmlTreeBuilder();
    Object v11 = ((org.jsoup.parser.XmlTreeBuilder)v10).defaultSettings();
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.io.Reader)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4),((org.jsoup.parser.ParseSettings)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "";
    Object v2 = "basefont";
    Object v3 = ((org.jsoup.parser.XmlTreeBuilder)v0).parse(((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = java.io.Reader.nullReader();
    Object v2 = new java.io.StringWriter();
    Object v3 = ((java.io.Reader)v1).transferTo(((java.io.Writer)v2));
    Object v4 = "body";
    Object v5 = ((org.jsoup.parser.XmlTreeBuilder)v0).parse(((java.io.Reader)v1),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }
}
