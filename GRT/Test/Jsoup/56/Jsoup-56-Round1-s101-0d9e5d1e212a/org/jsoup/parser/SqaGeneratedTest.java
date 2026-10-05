package org.jsoup.parser;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "ifram";
    Object v2 = "b_dy";
    Object v3 = -38;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    Object v5 = false;
    Object v6 = false;
    Object v7 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = ((org.jsoup.parser.XmlTreeBuilder)v0).parseFragment(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4),((org.jsoup.parser.ParseSettings)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = new org.jsoup.parser.Token.StartTag();
    Object v2 = ((org.jsoup.parser.XmlTreeBuilder)v0).insert(((org.jsoup.parser.Token.StartTag)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
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
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "?br";
    Object v2 = "";
    Object v3 = -38;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    Object v5 = false;
    Object v6 = false;
    Object v7 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()));
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4),((org.jsoup.parser.ParseSettings)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = ((org.jsoup.parser.XmlTreeBuilder)v0).defaultSettings();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "c}lgroup";
    Object v2 = "Key val mu";
    Object v3 = -38;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    Object v5 = ((java.util.ArrayList)v4).iterator();
    Object v6 = false;
    Object v7 = false;
    Object v8 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v6).booleanValue()),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ((org.jsoup.parser.XmlTreeBuilder)v0).parseFragment(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4),((org.jsoup.parser.ParseSettings)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "tfoot";
    Object v2 = "htmlb";
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
    Object v1 = new org.jsoup.parser.Token.Doctype();
    ((org.jsoup.parser.XmlTreeBuilder)v0).insert(((org.jsoup.parser.Token.Doctype)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = new org.jsoup.parser.Token.Comment();
    ((org.jsoup.parser.XmlTreeBuilder)v0).insert(((org.jsoup.parser.Token.Comment)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "b";
    Object v2 = "h5";
    Object v3 = ((org.jsoup.parser.XmlTreeBuilder)v0).parse(((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = new org.jsoup.parser.Token.Doctype();
    Object v2 = ((org.jsoup.parser.XmlTreeBuilder)v0).process(((org.jsoup.parser.Token)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = new org.jsoup.parser.Token.Comment();
    Object v2 = ((org.jsoup.parser.XmlTreeBuilder)v0).process(((org.jsoup.parser.Token)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "na";
    Object v2 = "html";
    Object v3 = -38;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    Object v5 = new org.jsoup.parser.Token.Doctype();
    Object v6 = ((java.util.ArrayList)v4).add(((java.lang.Object)v5));
    Object v7 = new org.jsoup.parser.XmlTreeBuilder();
    Object v8 = ((org.jsoup.parser.XmlTreeBuilder)v7).defaultSettings();
    Object v9 = ((org.jsoup.parser.XmlTreeBuilder)v0).parseFragment(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4),((org.jsoup.parser.ParseSettings)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
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
  public void test15() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "html";
    Object v2 = "t5oot";
    Object v3 = ((org.jsoup.parser.XmlTreeBuilder)v0).parse(((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "";
    Object v2 = "n";
    Object v3 = -38;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    Object v5 = false;
    Object v6 = false;
    Object v7 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()));
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4),((org.jsoup.parser.ParseSettings)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "s";
    Object v2 = "address";
    Object v3 = -38;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    Object v5 = new org.jsoup.parser.Token.Comment();
    Object v6 = ((java.util.ArrayList)v4).remove(((java.lang.Object)v5));
    Object v7 = new org.jsoup.parser.XmlTreeBuilder();
    Object v8 = ((org.jsoup.parser.XmlTreeBuilder)v7).defaultSettings();
    Object v9 = ((org.jsoup.parser.XmlTreeBuilder)v0).parseFragment(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4),((org.jsoup.parser.ParseSettings)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "tdQ";
    Object v2 = "trac~k";
    Object v3 = ((org.jsoup.parser.XmlTreeBuilder)v0).parse(((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = new org.jsoup.parser.Token.Character();
    ((org.jsoup.parser.XmlTreeBuilder)v0).insert(((org.jsoup.parser.Token.Character)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = new org.jsoup.parser.Token.Character();
    Object v2 = ((org.jsoup.parser.XmlTreeBuilder)v0).process(((org.jsoup.parser.Token)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = " ";
    Object v2 = "t\"";
    Object v3 = -38;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    Object v5 = false;
    Object v6 = false;
    Object v7 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = ((org.jsoup.parser.XmlTreeBuilder)v0).parseFragment(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4),((org.jsoup.parser.ParseSettings)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "1";
    Object v2 = "seect";
    Object v3 = -38;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    Object v5 = new org.jsoup.parser.XmlTreeBuilder();
    Object v6 = ((org.jsoup.parser.XmlTreeBuilder)v5).defaultSettings();
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4),((org.jsoup.parser.ParseSettings)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "tr";
    Object v2 = "tablT";
    Object v3 = -38;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    Object v5 = new org.jsoup.parser.XmlTreeBuilder();
    Object v6 = ((org.jsoup.parser.XmlTreeBuilder)v5).defaultSettings();
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4),((org.jsoup.parser.ParseSettings)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "tableh";
    Object v2 = "thead";
    Object v3 = -38;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    Object v5 = false;
    Object v6 = false;
    Object v7 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()));
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4),((org.jsoup.parser.ParseSettings)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "     ";
    Object v2 = "table";
    Object v3 = ((org.jsoup.parser.XmlTreeBuilder)v0).parse(((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = " ";
    Object v2 = "html";
    Object v3 = ((org.jsoup.parser.XmlTreeBuilder)v0).parse(((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "base";
    Object v2 = "optgroup";
    Object v3 = -38;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    Object v5 = false;
    Object v6 = false;
    Object v7 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()));
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4),((org.jsoup.parser.ParseSettings)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "tfo";
    Object v2 = "a";
    Object v3 = ((org.jsoup.parser.XmlTreeBuilder)v0).parse(((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "body";
    Object v2 = "g/";
    Object v3 = -38;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    Object v5 = new org.jsoup.parser.XmlTreeBuilder();
    Object v6 = ((org.jsoup.parser.XmlTreeBuilder)v5).defaultSettings();
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4),((org.jsoup.parser.ParseSettings)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "t";
    Object v2 = "p";
    Object v3 = ((org.jsoup.parser.XmlTreeBuilder)v0).parse(((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "command";
    Object v2 = "tZh";
    Object v3 = ((org.jsoup.parser.XmlTreeBuilder)v0).parse(((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "ttle";
    Object v2 = "html";
    Object v3 = -38;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    Object v5 = ((java.util.AbstractCollection)v4).toString();
    Object v6 = new org.jsoup.parser.XmlTreeBuilder();
    Object v7 = ((org.jsoup.parser.XmlTreeBuilder)v6).defaultSettings();
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4),((org.jsoup.parser.ParseSettings)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "htGl";
    Object v2 = ":has(el) subselect must not be e+pty";
    Object v3 = -38;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    Object v5 = false;
    Object v6 = false;
    Object v7 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()));
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4),((org.jsoup.parser.ParseSettings)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "Dat";
    Object v2 = "eN";
    Object v3 = -38;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    Object v5 = new org.jsoup.parser.XmlTreeBuilder();
    Object v6 = "c}lgroup";
    Object v7 = "Key val mu";
    Object v8 = -38;
    Object v9 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v8).intValue()));
    Object v10 = ((java.util.ArrayList)v9).iterator();
    Object v11 = false;
    Object v12 = false;
    Object v13 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((org.jsoup.parser.XmlTreeBuilder)v5).parseFragment(((java.lang.String)v6),((java.lang.String)v7),((org.jsoup.parser.ParseErrorList)v9),((org.jsoup.parser.ParseSettings)v13));
    Object v15 = ((java.util.ArrayList)v4).removeAll(((java.util.Collection)v14));
    Object v16 = false;
    Object v17 = false;
    Object v18 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v16).booleanValue()),(((java.lang.Boolean)v17).booleanValue()));
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4),((org.jsoup.parser.ParseSettings)v18));
    Object v19 = null;
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "title";
    Object v2 = "tr";
    Object v3 = ((org.jsoup.parser.XmlTreeBuilder)v0).parse(((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "bas<font";
    Object v2 = "st^yle";
    Object v3 = -38;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    Object v5 = new org.jsoup.parser.XmlTreeBuilder();
    Object v6 = ((org.jsoup.parser.XmlTreeBuilder)v5).defaultSettings();
    Object v7 = ((org.jsoup.parser.XmlTreeBuilder)v0).parseFragment(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4),((org.jsoup.parser.ParseSettings)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "br";
    Object v2 = "html";
    Object v3 = ((org.jsoup.parser.XmlTreeBuilder)v0).parse(((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
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
  public void test39() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "w";
    Object v2 = "h3";
    Object v3 = -38;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    Object v5 = new org.jsoup.parser.XmlTreeBuilder();
    Object v6 = ((org.jsoup.parser.XmlTreeBuilder)v5).defaultSettings();
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4),((org.jsoup.parser.ParseSettings)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "Request must be executed (with .execute(), .g]t(), or .post() before parsing response";
    Object v2 = "h1";
    Object v3 = ((org.jsoup.parser.XmlTreeBuilder)v0).parse(((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "html";
    Object v2 = "p";
    Object v3 = ((org.jsoup.parser.XmlTreeBuilder)v0).parse(((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "th";
    Object v2 = "r";
    Object v3 = -38;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    Object v5 = new org.jsoup.parser.XmlTreeBuilder();
    Object v6 = ((org.jsoup.parser.XmlTreeBuilder)v5).defaultSettings();
    Object v7 = ((org.jsoup.parser.XmlTreeBuilder)v0).parseFragment(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4),((org.jsoup.parser.ParseSettings)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "co";
    Object v2 = "";
    Object v3 = -38;
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
    Object v1 = "disabled";
    Object v2 = "c";
    Object v3 = -38;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    Object v5 = new org.jsoup.parser.XmlTreeBuilder();
    Object v6 = ((org.jsoup.parser.XmlTreeBuilder)v5).defaultSettings();
    Object v7 = ((org.jsoup.parser.XmlTreeBuilder)v0).parseFragment(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4),((org.jsoup.parser.ParseSettings)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "t";
    Object v2 = "oBption";
    Object v3 = -38;
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
    Object v1 = "body";
    Object v2 = "textaXea";
    Object v3 = ((org.jsoup.parser.XmlTreeBuilder)v0).parse(((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "X";
    Object v2 = "td";
    Object v3 = -38;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    Object v5 = new org.jsoup.parser.XmlTreeBuilder();
    Object v6 = ((org.jsoup.parser.XmlTreeBuilder)v5).defaultSettings();
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4),((org.jsoup.parser.ParseSettings)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "p";
    Object v2 = "caption";
    Object v3 = ((org.jsoup.parser.XmlTreeBuilder)v0).parse(((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "foot";
    Object v2 = "V";
    Object v3 = -38;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    Object v5 = false;
    Object v6 = false;
    Object v7 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()));
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4),((org.jsoup.parser.ParseSettings)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "i";
    Object v2 = "tfoot";
    Object v3 = -38;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    Object v5 = false;
    Object v6 = false;
    Object v7 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()));
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4),((org.jsoup.parser.ParseSettings)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "tfoot";
    Object v2 = "opKion";
    Object v3 = ((org.jsoup.parser.XmlTreeBuilder)v0).parse(((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "l";
    Object v2 = "h5";
    Object v3 = -38;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    Object v5 = new org.jsoup.parser.XmlTreeBuilder();
    Object v6 = ((org.jsoup.parser.XmlTreeBuilder)v5).defaultSettings();
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4),((org.jsoup.parser.ParseSettings)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "ol";
    Object v2 = "co";
    Object v3 = -38;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    Object v5 = new org.jsoup.parser.XmlTreeBuilder();
    Object v6 = ((org.jsoup.parser.XmlTreeBuilder)v5).defaultSettings();
    Object v7 = ((org.jsoup.parser.XmlTreeBuilder)v0).parseFragment(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4),((org.jsoup.parser.ParseSettings)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "ht)l";
    Object v2 = "thead";
    Object v3 = ((org.jsoup.parser.XmlTreeBuilder)v0).parse(((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "nae";
    Object v2 = "style";
    Object v3 = ((org.jsoup.parser.XmlTreeBuilder)v0).parse(((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "t=";
    Object v2 = "";
    Object v3 = -38;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    Object v5 = new org.jsoup.parser.XmlTreeBuilder();
    Object v6 = ((org.jsoup.parser.XmlTreeBuilder)v5).defaultSettings();
    Object v7 = ((org.jsoup.parser.XmlTreeBuilder)v0).parseFragment(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4),((org.jsoup.parser.ParseSettings)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "--";
    Object v2 = "";
    Object v3 = -38;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    Object v5 = new org.jsoup.parser.XmlTreeBuilder();
    Object v6 = ((org.jsoup.parser.XmlTreeBuilder)v5).defaultSettings();
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4),((org.jsoup.parser.ParseSettings)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "noframes";
    Object v2 = "tbod";
    Object v3 = -38;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    Object v5 = new org.jsoup.parser.XmlTreeBuilder();
    Object v6 = ((org.jsoup.parser.XmlTreeBuilder)v5).defaultSettings();
    Object v7 = ((org.jsoup.parser.XmlTreeBuilder)v0).parseFragment(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4),((org.jsoup.parser.ParseSettings)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "l";
    Object v2 = "seleco";
    Object v3 = -38;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    Object v5 = new org.jsoup.parser.XmlTreeBuilder();
    Object v6 = ((org.jsoup.parser.XmlTreeBuilder)v5).defaultSettings();
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4),((org.jsoup.parser.ParseSettings)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "";
    Object v2 = "img";
    Object v3 = -38;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    Object v5 = new org.jsoup.parser.XmlTreeBuilder();
    Object v6 = ((org.jsoup.parser.XmlTreeBuilder)v5).defaultSettings();
    Object v7 = ((org.jsoup.parser.XmlTreeBuilder)v0).parseFragment(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4),((org.jsoup.parser.ParseSettings)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "html";
    Object v2 = "taZle";
    Object v3 = -38;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    Object v5 = false;
    Object v6 = false;
    Object v7 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = ((org.jsoup.parser.XmlTreeBuilder)v0).parseFragment(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4),((org.jsoup.parser.ParseSettings)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "br";
    Object v2 = "tbo+dy";
    Object v3 = ((org.jsoup.parser.XmlTreeBuilder)v0).parse(((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "trac7";
    Object v2 = "tab\"le";
    Object v3 = ((org.jsoup.parser.XmlTreeBuilder)v0).parse(((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "st";
    Object v2 = "o";
    Object v3 = -38;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    Object v5 = new org.jsoup.parser.XmlTreeBuilder();
    Object v6 = ((org.jsoup.parser.XmlTreeBuilder)v5).defaultSettings();
    Object v7 = ((org.jsoup.parser.XmlTreeBuilder)v0).parseFragment(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4),((org.jsoup.parser.ParseSettings)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "q</";
    Object v2 = "da8ta-";
    Object v3 = -38;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    Object v5 = new org.jsoup.parser.XmlTreeBuilder();
    Object v6 = ((org.jsoup.parser.XmlTreeBuilder)v5).defaultSettings();
    Object v7 = ((org.jsoup.parser.XmlTreeBuilder)v0).parseFragment(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4),((org.jsoup.parser.ParseSettings)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "th";
    Object v2 = "htmX";
    Object v3 = -38;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    Object v5 = false;
    Object v6 = false;
    Object v7 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()));
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4),((org.jsoup.parser.ParseSettings)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "Data key must not be Ympty";
    Object v2 = "t";
    Object v3 = -38;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    Object v5 = new org.jsoup.parser.XmlTreeBuilder();
    Object v6 = ((org.jsoup.parser.XmlTreeBuilder)v5).defaultSettings();
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4),((org.jsoup.parser.ParseSettings)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "";
    Object v2 = "col";
    Object v3 = -38;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    Object v5 = new org.jsoup.parser.XmlTreeBuilder();
    Object v6 = ((org.jsoup.parser.XmlTreeBuilder)v5).defaultSettings();
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4),((org.jsoup.parser.ParseSettings)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "tv";
    Object v2 = "script";
    Object v3 = -38;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    Object v5 = new org.jsoup.parser.XmlTreeBuilder();
    Object v6 = ((org.jsoup.parser.XmlTreeBuilder)v5).defaultSettings();
    Object v7 = ((org.jsoup.parser.XmlTreeBuilder)v0).parseFragment(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4),((org.jsoup.parser.ParseSettings)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "title";
    Object v2 = "+";
    Object v3 = ((org.jsoup.parser.XmlTreeBuilder)v0).parse(((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "table";
    Object v2 = "table";
    Object v3 = -38;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    ((java.util.ArrayList)v4).trimToSize();
    Object v5 = null;
    Object v6 = new org.jsoup.parser.XmlTreeBuilder();
    Object v7 = ((org.jsoup.parser.XmlTreeBuilder)v6).defaultSettings();
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4),((org.jsoup.parser.ParseSettings)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "tfoot";
    Object v2 = "ta";
    Object v3 = -38;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    Object v5 = false;
    Object v6 = false;
    Object v7 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()));
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4),((org.jsoup.parser.ParseSettings)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "html";
    Object v2 = "hr";
    Object v3 = ((org.jsoup.parser.XmlTreeBuilder)v0).parse(((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "abs:";
    Object v2 = "\nMrdia: (%d)";
    Object v3 = ((org.jsoup.parser.XmlTreeBuilder)v0).parse(((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "thead";
    Object v2 = "hml";
    Object v3 = -38;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    Object v5 = 0;
    Object v6 = new org.jsoup.parser.Token.Comment();
    ((java.util.ArrayList)v4).add((((java.lang.Integer)v5).intValue()),((java.lang.Object)v6));
    Object v7 = null;
    Object v8 = false;
    Object v9 = false;
    Object v10 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v8).booleanValue()),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = ((org.jsoup.parser.XmlTreeBuilder)v0).parseFragment(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4),((org.jsoup.parser.ParseSettings)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "#";
    Object v2 = "head";
    Object v3 = -38;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    Object v5 = new org.jsoup.parser.XmlTreeBuilder();
    Object v6 = ((org.jsoup.parser.XmlTreeBuilder)v5).defaultSettings();
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4),((org.jsoup.parser.ParseSettings)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "&";
    Object v2 = "compac{";
    Object v3 = ((org.jsoup.parser.XmlTreeBuilder)v0).parse(((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "thead";
    Object v2 = "html";
    Object v3 = -38;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    Object v5 = -38;
    Object v6 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v5).intValue()));
    Object v7 = ((java.util.ArrayList)v4).removeAll(((java.util.Collection)v6));
    Object v8 = false;
    Object v9 = false;
    Object v10 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v8).booleanValue()),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = ((org.jsoup.parser.XmlTreeBuilder)v0).parseFragment(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4),((org.jsoup.parser.ParseSettings)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "noscript";
    Object v2 = "tboy";
    Object v3 = -38;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    Object v5 = new org.jsoup.parser.Token.Doctype();
    Object v6 = ((java.util.ArrayList)v4).equals(((java.lang.Object)v5));
    Object v7 = new org.jsoup.parser.XmlTreeBuilder();
    Object v8 = ((org.jsoup.parser.XmlTreeBuilder)v7).defaultSettings();
    Object v9 = ((org.jsoup.parser.XmlTreeBuilder)v0).parseFragment(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4),((org.jsoup.parser.ParseSettings)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "td";
    Object v2 = "";
    Object v3 = ((org.jsoup.parser.XmlTreeBuilder)v0).parse(((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "a";
    Object v2 = "elect";
    Object v3 = -38;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    Object v5 = new org.jsoup.parser.XmlTreeBuilder();
    Object v6 = ((org.jsoup.parser.XmlTreeBuilder)v5).defaultSettings();
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4),((org.jsoup.parser.ParseSettings)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "head";
    Object v2 = "t";
    Object v3 = -38;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    Object v5 = false;
    Object v6 = false;
    Object v7 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()));
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4),((org.jsoup.parser.ParseSettings)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "^=";
    Object v2 = "dd";
    Object v3 = -38;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    Object v5 = new org.jsoup.parser.Token.StartTag();
    Object v6 = ((java.util.ArrayList)v4).remove(((java.lang.Object)v5));
    Object v7 = false;
    Object v8 = false;
    Object v9 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v7).booleanValue()),(((java.lang.Boolean)v8).booleanValue()));
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4),((org.jsoup.parser.ParseSettings)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "table";
    Object v2 = "c";
    Object v3 = ((org.jsoup.parser.XmlTreeBuilder)v0).parse(((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "action";
    Object v2 = "tr";
    Object v3 = -38;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    Object v5 = false;
    Object v6 = false;
    Object v7 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()));
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4),((org.jsoup.parser.ParseSettings)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "tr";
    Object v2 = "otion";
    Object v3 = ((org.jsoup.parser.XmlTreeBuilder)v0).parse(((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "tixtarea";
    Object v2 = "";
    Object v3 = -38;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    Object v5 = new org.jsoup.parser.XmlTreeBuilder();
    Object v6 = ((org.jsoup.parser.XmlTreeBuilder)v5).defaultSettings();
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4),((org.jsoup.parser.ParseSettings)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "htl";
    Object v2 = "t~able";
    Object v3 = -38;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    Object v5 = false;
    Object v6 = false;
    Object v7 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()));
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4),((org.jsoup.parser.ParseSettings)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "Co}mment";
    Object v2 = "colgroup";
    Object v3 = ((org.jsoup.parser.XmlTreeBuilder)v0).parse(((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "colgroup";
    Object v2 = "capEion";
    Object v3 = ((org.jsoup.parser.XmlTreeBuilder)v0).parse(((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "br|";
    Object v2 = "li";
    Object v3 = ((org.jsoup.parser.XmlTreeBuilder)v0).parse(((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "Referer";
    Object v2 = "Data";
    Object v3 = -38;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    Object v5 = new org.jsoup.parser.XmlTreeBuilder();
    Object v6 = ((org.jsoup.parser.XmlTreeBuilder)v5).defaultSettings();
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4),((org.jsoup.parser.ParseSettings)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "hml";
    Object v2 = "optin";
    Object v3 = -38;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    Object v5 = false;
    Object v6 = false;
    Object v7 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()));
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4),((org.jsoup.parser.ParseSettings)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "<";
    Object v2 = "html";
    Object v3 = ((org.jsoup.parser.XmlTreeBuilder)v0).parse(((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "xml";
    Object v2 = "UTF-8";
    Object v3 = -38;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    Object v5 = false;
    Object v6 = false;
    Object v7 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()));
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4),((org.jsoup.parser.ParseSettings)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "ta";
    Object v2 = "th";
    Object v3 = ((org.jsoup.parser.XmlTreeBuilder)v0).parse(((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "h2";
    Object v2 = "Xth";
    Object v3 = -38;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    Object v5 = new org.jsoup.parser.XmlTreeBuilder();
    Object v6 = ((org.jsoup.parser.XmlTreeBuilder)v5).defaultSettings();
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4),((org.jsoup.parser.ParseSettings)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "@";
    Object v2 = "";
    Object v3 = -38;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    Object v5 = false;
    Object v6 = false;
    Object v7 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()));
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4),((org.jsoup.parser.ParseSettings)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "4";
    Object v2 = "boPdy";
    Object v3 = -38;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    Object v5 = false;
    Object v6 = false;
    Object v7 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()));
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4),((org.jsoup.parser.ParseSettings)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }
}
