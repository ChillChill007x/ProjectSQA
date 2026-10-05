package org.jsoup.nodes;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = "UTF";
    Object v1 = org.jsoup.nodes.Entities.getCharacterByName(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = 16;
    Object v1 = new java.lang.StringBuilder((((java.lang.Integer)v0).intValue()));
    Object v2 = "G";
    Object v3 = ((java.lang.StringBuilder)v1).indexOf(((java.lang.String)v2));
    Object v4 = "h1";
    Object v5 = new org.jsoup.nodes.Document.OutputSettings();
    Object v6 = false;
    Object v7 = false;
    Object v8 = true;
    org.jsoup.nodes.Entities.escape(((java.lang.StringBuilder)v1),((java.lang.String)v4),((org.jsoup.nodes.Document.OutputSettings)v5),(((java.lang.Boolean)v6).booleanValue()),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Boolean)v8).booleanValue()));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = "/";
    Object v1 = org.jsoup.nodes.Entities.getCharacterByName(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = "colgrou_p";
    Object v1 = new org.jsoup.nodes.Document.OutputSettings();
    Object v2 = org.jsoup.nodes.Entities.escape(((java.lang.String)v0),((org.jsoup.nodes.Document.OutputSettings)v1));
    org.junit.Assert.assertEquals((Object)("colgrou_p"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = 16;
    Object v1 = new java.lang.StringBuilder((((java.lang.Integer)v0).intValue()));
    Object v2 = ((java.lang.StringBuilder)v1).reverse();
    Object v3 = "p";
    Object v4 = new org.jsoup.nodes.Document.OutputSettings();
    Object v5 = false;
    Object v6 = true;
    Object v7 = false;
    org.jsoup.nodes.Entities.escape(((java.lang.StringBuilder)v1),((java.lang.String)v3),((org.jsoup.nodes.Document.OutputSettings)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()),(((java.lang.Boolean)v7).booleanValue()));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = 16;
    Object v1 = new java.lang.StringBuilder((((java.lang.Integer)v0).intValue()));
    Object v2 = "noframe!";
    Object v3 = new org.jsoup.nodes.Document.OutputSettings();
    Object v4 = org.jsoup.nodes.Entities.EscapeMode.base;
    Object v5 = ((org.jsoup.nodes.Document.OutputSettings)v3).escapeMode(((org.jsoup.nodes.Entities.EscapeMode)v4));
    Object v6 = false;
    Object v7 = true;
    Object v8 = false;
    org.jsoup.nodes.Entities.escape(((java.lang.StringBuilder)v1),((java.lang.String)v2),((org.jsoup.nodes.Document.OutputSettings)v3),(((java.lang.Boolean)v6).booleanValue()),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Boolean)v8).booleanValue()));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = "aplet";
    Object v1 = org.jsoup.nodes.Entities.isBaseNamedEntity(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = 16;
    Object v1 = new java.lang.StringBuilder((((java.lang.Integer)v0).intValue()));
    Object v2 = "html";
    Object v3 = new org.jsoup.nodes.Document.OutputSettings();
    Object v4 = false;
    Object v5 = false;
    Object v6 = true;
    org.jsoup.nodes.Entities.escape(((java.lang.StringBuilder)v1),((java.lang.String)v2),((org.jsoup.nodes.Document.OutputSettings)v3),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = "tabde";
    Object v1 = org.jsoup.nodes.Entities.isBaseNamedEntity(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = 16;
    Object v1 = new java.lang.StringBuilder((((java.lang.Integer)v0).intValue()));
    Object v2 = 1;
    Object v3 = ((java.lang.StringBuilder)v1).appendCodePoint((((java.lang.Integer)v2).intValue()));
    Object v4 = "t/r";
    Object v5 = new org.jsoup.nodes.Document.OutputSettings();
    Object v6 = org.jsoup.nodes.Document.OutputSettings.Syntax.xml;
    Object v7 = ((org.jsoup.nodes.Document.OutputSettings)v5).syntax(((org.jsoup.nodes.Document.OutputSettings.Syntax)v6));
    Object v8 = true;
    Object v9 = false;
    Object v10 = false;
    org.jsoup.nodes.Entities.escape(((java.lang.StringBuilder)v1),((java.lang.String)v4),((org.jsoup.nodes.Document.OutputSettings)v5),(((java.lang.Boolean)v8).booleanValue()),(((java.lang.Boolean)v9).booleanValue()),(((java.lang.Boolean)v10).booleanValue()));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = 16;
    Object v1 = new java.lang.StringBuilder((((java.lang.Integer)v0).intValue()));
    Object v2 = "body";
    Object v3 = new org.jsoup.nodes.Document.OutputSettings();
    Object v4 = 0;
    Object v5 = ((org.jsoup.nodes.Document.OutputSettings)v3).indentAmount((((java.lang.Integer)v4).intValue()));
    Object v6 = true;
    Object v7 = true;
    Object v8 = false;
    org.jsoup.nodes.Entities.escape(((java.lang.StringBuilder)v1),((java.lang.String)v2),((org.jsoup.nodes.Document.OutputSettings)v3),(((java.lang.Boolean)v6).booleanValue()),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Boolean)v8).booleanValue()));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = "col";
    Object v1 = org.jsoup.nodes.Entities.getCharacterByName(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = 16;
    Object v1 = new java.lang.StringBuilder((((java.lang.Integer)v0).intValue()));
    Object v2 = ":last-child";
    Object v3 = new org.jsoup.nodes.Document.OutputSettings();
    Object v4 = true;
    Object v5 = ((org.jsoup.nodes.Document.OutputSettings)v3).prettyPrint((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = false;
    Object v7 = true;
    Object v8 = false;
    org.jsoup.nodes.Entities.escape(((java.lang.StringBuilder)v1),((java.lang.String)v2),((org.jsoup.nodes.Document.OutputSettings)v3),(((java.lang.Boolean)v6).booleanValue()),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Boolean)v8).booleanValue()));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = "dt";
    Object v1 = org.jsoup.nodes.Entities.isNamedEntity(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = 16;
    Object v1 = new java.lang.StringBuilder((((java.lang.Integer)v0).intValue()));
    Object v2 = "tfoot";
    Object v3 = new org.jsoup.nodes.Document.OutputSettings();
    Object v4 = true;
    Object v5 = true;
    Object v6 = false;
    org.jsoup.nodes.Entities.escape(((java.lang.StringBuilder)v1),((java.lang.String)v2),((org.jsoup.nodes.Document.OutputSettings)v3),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = "a ";
    Object v1 = org.jsoup.nodes.Entities.getCharacterByName(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = "headZ";
    Object v1 = new org.jsoup.nodes.Document.OutputSettings();
    Object v2 = org.jsoup.nodes.Entities.escape(((java.lang.String)v0),((org.jsoup.nodes.Document.OutputSettings)v1));
    org.junit.Assert.assertEquals((Object)("headZ"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = 16;
    Object v1 = new java.lang.StringBuilder((((java.lang.Integer)v0).intValue()));
    Object v2 = "html";
    Object v3 = new org.jsoup.nodes.Document.OutputSettings();
    Object v4 = false;
    Object v5 = true;
    Object v6 = false;
    org.jsoup.nodes.Entities.escape(((java.lang.StringBuilder)v1),((java.lang.String)v2),((org.jsoup.nodes.Document.OutputSettings)v3),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = "tody";
    Object v1 = org.jsoup.nodes.Entities.getCharacterByName(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = 16;
    Object v1 = new java.lang.StringBuilder((((java.lang.Integer)v0).intValue()));
    Object v2 = "tr";
    Object v3 = ((java.lang.StringBuilder)v1).indexOf(((java.lang.String)v2));
    Object v4 = "imUg";
    Object v5 = new org.jsoup.nodes.Document.OutputSettings();
    Object v6 = true;
    Object v7 = false;
    Object v8 = false;
    org.jsoup.nodes.Entities.escape(((java.lang.StringBuilder)v1),((java.lang.String)v4),((org.jsoup.nodes.Document.OutputSettings)v5),(((java.lang.Boolean)v6).booleanValue()),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Boolean)v8).booleanValue()));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = "H";
    Object v1 = org.jsoup.nodes.Entities.getCharacterByName(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = " ";
    Object v1 = false;
    Object v2 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()));
    org.junit.Assert.assertEquals((Object)(" "), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = "select";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("select"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = "body";
    Object v1 = org.jsoup.nodes.Entities.isBaseNamedEntity(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = "p";
    Object v1 = true;
    Object v2 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()));
    org.junit.Assert.assertEquals((Object)("p"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = "article";
    Object v1 = org.jsoup.nodes.Entities.isBaseNamedEntity(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = "input";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("input"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = 16;
    Object v1 = new java.lang.StringBuilder((((java.lang.Integer)v0).intValue()));
    Object v2 = "tfoot";
    Object v3 = new org.jsoup.nodes.Document.OutputSettings();
    Object v4 = true;
    Object v5 = ((org.jsoup.nodes.Document.OutputSettings)v3).outline((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = false;
    Object v7 = true;
    Object v8 = false;
    org.jsoup.nodes.Entities.escape(((java.lang.StringBuilder)v1),((java.lang.String)v2),((org.jsoup.nodes.Document.OutputSettings)v3),(((java.lang.Boolean)v6).booleanValue()),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Boolean)v8).booleanValue()));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = 16;
    Object v1 = new java.lang.StringBuilder((((java.lang.Integer)v0).intValue()));
    Object v2 = "style";
    Object v3 = new org.jsoup.nodes.Document.OutputSettings();
    Object v4 = false;
    Object v5 = false;
    Object v6 = true;
    org.jsoup.nodes.Entities.escape(((java.lang.StringBuilder)v1),((java.lang.String)v2),((org.jsoup.nodes.Document.OutputSettings)v3),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = 16;
    Object v1 = new java.lang.StringBuilder((((java.lang.Integer)v0).intValue()));
    Object v2 = "|tml";
    Object v3 = new org.jsoup.nodes.Document.OutputSettings();
    Object v4 = true;
    Object v5 = false;
    Object v6 = true;
    org.jsoup.nodes.Entities.escape(((java.lang.StringBuilder)v1),((java.lang.String)v2),((org.jsoup.nodes.Document.OutputSettings)v3),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = "cite";
    Object v1 = true;
    Object v2 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()));
    org.junit.Assert.assertEquals((Object)("cite"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = 16;
    Object v1 = new java.lang.StringBuilder((((java.lang.Integer)v0).intValue()));
    Object v2 = "tr";
    Object v3 = new org.jsoup.nodes.Document.OutputSettings();
    Object v4 = true;
    Object v5 = true;
    Object v6 = false;
    org.jsoup.nodes.Entities.escape(((java.lang.StringBuilder)v1),((java.lang.String)v2),((org.jsoup.nodes.Document.OutputSettings)v3),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = "p";
    Object v1 = org.jsoup.nodes.Entities.isNamedEntity(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = "htmil";
    Object v1 = org.jsoup.nodes.Entities.getCharacterByName(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = "";
    Object v1 = true;
    Object v2 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()));
    org.junit.Assert.assertEquals((Object)(""), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = "t`able";
    Object v1 = org.jsoup.nodes.Entities.isNamedEntity(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = 16;
    Object v1 = new java.lang.StringBuilder((((java.lang.Integer)v0).intValue()));
    Object v2 = ":has";
    Object v3 = new org.jsoup.nodes.Document.OutputSettings();
    Object v4 = true;
    Object v5 = false;
    Object v6 = true;
    org.jsoup.nodes.Entities.escape(((java.lang.StringBuilder)v1),((java.lang.String)v2),((org.jsoup.nodes.Document.OutputSettings)v3),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = 16;
    Object v1 = new java.lang.StringBuilder((((java.lang.Integer)v0).intValue()));
    Object v2 = "entities-base.properties";
    Object v3 = new org.jsoup.nodes.Document.OutputSettings();
    Object v4 = org.jsoup.nodes.Document.OutputSettings.Syntax.html;
    Object v5 = ((org.jsoup.nodes.Document.OutputSettings)v3).syntax(((org.jsoup.nodes.Document.OutputSettings.Syntax)v4));
    Object v6 = false;
    Object v7 = true;
    Object v8 = false;
    org.jsoup.nodes.Entities.escape(((java.lang.StringBuilder)v1),((java.lang.String)v2),((org.jsoup.nodes.Document.OutputSettings)v3),(((java.lang.Boolean)v6).booleanValue()),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Boolean)v8).booleanValue()));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = 16;
    Object v1 = new java.lang.StringBuilder((((java.lang.Integer)v0).intValue()));
    Object v2 = "mailto";
    Object v3 = new org.jsoup.nodes.Document.OutputSettings();
    Object v4 = false;
    Object v5 = false;
    Object v6 = false;
    org.jsoup.nodes.Entities.escape(((java.lang.StringBuilder)v1),((java.lang.String)v2),((org.jsoup.nodes.Document.OutputSettings)v3),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = 16;
    Object v1 = new java.lang.StringBuilder((((java.lang.Integer)v0).intValue()));
    Object v2 = "article8";
    Object v3 = new org.jsoup.nodes.Document.OutputSettings();
    Object v4 = true;
    Object v5 = false;
    Object v6 = true;
    org.jsoup.nodes.Entities.escape(((java.lang.StringBuilder)v1),((java.lang.String)v2),((org.jsoup.nodes.Document.OutputSettings)v3),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = "content";
    Object v1 = org.jsoup.nodes.Entities.isNamedEntity(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = 16;
    Object v1 = new java.lang.StringBuilder((((java.lang.Integer)v0).intValue()));
    Object v2 = "tr";
    Object v3 = new org.jsoup.nodes.Document.OutputSettings();
    Object v4 = false;
    Object v5 = true;
    Object v6 = false;
    org.jsoup.nodes.Entities.escape(((java.lang.StringBuilder)v1),((java.lang.String)v2),((org.jsoup.nodes.Document.OutputSettings)v3),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = 16;
    Object v1 = new java.lang.StringBuilder((((java.lang.Integer)v0).intValue()));
    Object v2 = "head";
    Object v3 = ((java.lang.StringBuilder)v1).indexOf(((java.lang.String)v2));
    Object v4 = "htl";
    Object v5 = new org.jsoup.nodes.Document.OutputSettings();
    Object v6 = false;
    Object v7 = false;
    Object v8 = false;
    org.jsoup.nodes.Entities.escape(((java.lang.StringBuilder)v1),((java.lang.String)v4),((org.jsoup.nodes.Document.OutputSettings)v5),(((java.lang.Boolean)v6).booleanValue()),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Boolean)v8).booleanValue()));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = 16;
    Object v1 = new java.lang.StringBuilder((((java.lang.Integer)v0).intValue()));
    Object v2 = "xmp";
    Object v3 = new org.jsoup.nodes.Document.OutputSettings();
    Object v4 = false;
    Object v5 = false;
    Object v6 = false;
    org.jsoup.nodes.Entities.escape(((java.lang.StringBuilder)v1),((java.lang.String)v2),((org.jsoup.nodes.Document.OutputSettings)v3),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = 16;
    Object v1 = new java.lang.StringBuilder((((java.lang.Integer)v0).intValue()));
    Object v2 = "7ase";
    Object v3 = new org.jsoup.nodes.Document.OutputSettings();
    Object v4 = true;
    Object v5 = false;
    Object v6 = true;
    org.jsoup.nodes.Entities.escape(((java.lang.StringBuilder)v1),((java.lang.String)v2),((org.jsoup.nodes.Document.OutputSettings)v3),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = "m--";
    Object v1 = org.jsoup.nodes.Entities.isBaseNamedEntity(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = 16;
    Object v1 = new java.lang.StringBuilder((((java.lang.Integer)v0).intValue()));
    Object v2 = 0;
    Object v3 = ((java.lang.StringBuilder)v1).appendCodePoint((((java.lang.Integer)v2).intValue()));
    Object v4 = "input";
    Object v5 = new org.jsoup.nodes.Document.OutputSettings();
    Object v6 = true;
    Object v7 = false;
    Object v8 = false;
    org.jsoup.nodes.Entities.escape(((java.lang.StringBuilder)v1),((java.lang.String)v4),((org.jsoup.nodes.Document.OutputSettings)v5),(((java.lang.Boolean)v6).booleanValue()),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Boolean)v8).booleanValue()));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = "tbody";
    Object v1 = org.jsoup.nodes.Entities.isBaseNamedEntity(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = "~";
    Object v1 = org.jsoup.nodes.Entities.isBaseNamedEntity(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = 16;
    Object v1 = new java.lang.StringBuilder((((java.lang.Integer)v0).intValue()));
    Object v2 = "htl";
    Object v3 = new org.jsoup.nodes.Document.OutputSettings();
    Object v4 = java.nio.charset.Charset.defaultCharset();
    Object v5 = ((org.jsoup.nodes.Document.OutputSettings)v3).charset(((java.nio.charset.Charset)v4));
    Object v6 = false;
    Object v7 = true;
    Object v8 = false;
    org.jsoup.nodes.Entities.escape(((java.lang.StringBuilder)v1),((java.lang.String)v2),((org.jsoup.nodes.Document.OutputSettings)v3),(((java.lang.Boolean)v6).booleanValue()),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Boolean)v8).booleanValue()));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = 16;
    Object v1 = new java.lang.StringBuilder((((java.lang.Integer)v0).intValue()));
    Object v2 = "html";
    Object v3 = new org.jsoup.nodes.Document.OutputSettings();
    Object v4 = false;
    Object v5 = ((org.jsoup.nodes.Document.OutputSettings)v3).outline((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = true;
    Object v7 = true;
    Object v8 = true;
    org.jsoup.nodes.Entities.escape(((java.lang.StringBuilder)v1),((java.lang.String)v2),((org.jsoup.nodes.Document.OutputSettings)v3),(((java.lang.Boolean)v6).booleanValue()),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Boolean)v8).booleanValue()));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = 16;
    Object v1 = new java.lang.StringBuilder((((java.lang.Integer)v0).intValue()));
    Object v2 = "";
    Object v3 = new org.jsoup.nodes.Document.OutputSettings();
    Object v4 = false;
    Object v5 = true;
    Object v6 = false;
    org.jsoup.nodes.Entities.escape(((java.lang.StringBuilder)v1),((java.lang.String)v2),((org.jsoup.nodes.Document.OutputSettings)v3),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = 16;
    Object v1 = new java.lang.StringBuilder((((java.lang.Integer)v0).intValue()));
    Object v2 = "tfoo";
    Object v3 = new org.jsoup.nodes.Document.OutputSettings();
    Object v4 = true;
    Object v5 = false;
    Object v6 = true;
    org.jsoup.nodes.Entities.escape(((java.lang.StringBuilder)v1),((java.lang.String)v2),((org.jsoup.nodes.Document.OutputSettings)v3),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = "9";
    Object v1 = org.jsoup.nodes.Entities.isBaseNamedEntity(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = "\"";
    Object v1 = org.jsoup.nodes.Entities.isNamedEntity(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = 16;
    Object v1 = new java.lang.StringBuilder((((java.lang.Integer)v0).intValue()));
    Object v2 = "Pattern syntax error: ";
    Object v3 = new org.jsoup.nodes.Document.OutputSettings();
    Object v4 = false;
    Object v5 = true;
    Object v6 = true;
    org.jsoup.nodes.Entities.escape(((java.lang.StringBuilder)v1),((java.lang.String)v2),((org.jsoup.nodes.Document.OutputSettings)v3),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = 16;
    Object v1 = new java.lang.StringBuilder((((java.lang.Integer)v0).intValue()));
    Object v2 = "";
    Object v3 = new org.jsoup.nodes.Document.OutputSettings();
    Object v4 = ((org.jsoup.nodes.Document.OutputSettings)v3).clone();
    Object v5 = false;
    Object v6 = false;
    Object v7 = false;
    org.jsoup.nodes.Entities.escape(((java.lang.StringBuilder)v1),((java.lang.String)v2),((org.jsoup.nodes.Document.OutputSettings)v3),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()),(((java.lang.Boolean)v7).booleanValue()));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = "href";
    Object v1 = org.jsoup.nodes.Entities.getCharacterByName(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = 16;
    Object v1 = new java.lang.StringBuilder((((java.lang.Integer)v0).intValue()));
    Object v2 = "";
    Object v3 = true;
    Object v4 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((java.lang.StringBuilder)v1).append(((java.lang.CharSequence)v4));
    Object v6 = "b";
    Object v7 = new org.jsoup.nodes.Document.OutputSettings();
    Object v8 = true;
    Object v9 = true;
    Object v10 = true;
    org.jsoup.nodes.Entities.escape(((java.lang.StringBuilder)v1),((java.lang.String)v6),((org.jsoup.nodes.Document.OutputSettings)v7),(((java.lang.Boolean)v8).booleanValue()),(((java.lang.Boolean)v9).booleanValue()),(((java.lang.Boolean)v10).booleanValue()));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = 16;
    Object v1 = new java.lang.StringBuilder((((java.lang.Integer)v0).intValue()));
    Object v2 = "itle";
    Object v3 = new org.jsoup.nodes.Document.OutputSettings();
    Object v4 = true;
    Object v5 = false;
    Object v6 = true;
    org.jsoup.nodes.Entities.escape(((java.lang.StringBuilder)v1),((java.lang.String)v2),((org.jsoup.nodes.Document.OutputSettings)v3),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = "atml";
    Object v1 = true;
    Object v2 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()));
    org.junit.Assert.assertEquals((Object)("atml"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = "html";
    Object v1 = org.jsoup.nodes.Entities.getCharacterByName(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = 16;
    Object v1 = new java.lang.StringBuilder((((java.lang.Integer)v0).intValue()));
    Object v2 = "h2";
    Object v3 = new org.jsoup.nodes.Document.OutputSettings();
    Object v4 = true;
    Object v5 = true;
    Object v6 = false;
    org.jsoup.nodes.Entities.escape(((java.lang.StringBuilder)v1),((java.lang.String)v2),((org.jsoup.nodes.Document.OutputSettings)v3),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = "";
    Object v1 = org.jsoup.nodes.Entities.isBaseNamedEntity(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = " ";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(" "), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = 16;
    Object v1 = new java.lang.StringBuilder((((java.lang.Integer)v0).intValue()));
    Object v2 = true;
    Object v3 = ((java.lang.StringBuilder)v1).append((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "meta";
    Object v5 = new org.jsoup.nodes.Document.OutputSettings();
    Object v6 = true;
    Object v7 = true;
    Object v8 = true;
    org.jsoup.nodes.Entities.escape(((java.lang.StringBuilder)v1),((java.lang.String)v4),((org.jsoup.nodes.Document.OutputSettings)v5),(((java.lang.Boolean)v6).booleanValue()),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Boolean)v8).booleanValue()));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = 16;
    Object v1 = new java.lang.StringBuilder((((java.lang.Integer)v0).intValue()));
    Object v2 = "pre";
    Object v3 = new org.jsoup.nodes.Document.OutputSettings();
    Object v4 = true;
    Object v5 = true;
    Object v6 = false;
    org.jsoup.nodes.Entities.escape(((java.lang.StringBuilder)v1),((java.lang.String)v2),((org.jsoup.nodes.Document.OutputSettings)v3),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = 16;
    Object v1 = new java.lang.StringBuilder((((java.lang.Integer)v0).intValue()));
    Object v2 = "script";
    Object v3 = new org.jsoup.nodes.Document.OutputSettings();
    Object v4 = true;
    Object v5 = false;
    Object v6 = true;
    org.jsoup.nodes.Entities.escape(((java.lang.StringBuilder)v1),((java.lang.String)v2),((org.jsoup.nodes.Document.OutputSettings)v3),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = 16;
    Object v1 = new java.lang.StringBuilder((((java.lang.Integer)v0).intValue()));
    Object v2 = "6th";
    Object v3 = new org.jsoup.nodes.Document.OutputSettings();
    Object v4 = false;
    Object v5 = false;
    Object v6 = false;
    org.jsoup.nodes.Entities.escape(((java.lang.StringBuilder)v1),((java.lang.String)v2),((org.jsoup.nodes.Document.OutputSettings)v3),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = 16;
    Object v1 = new java.lang.StringBuilder((((java.lang.Integer)v0).intValue()));
    Object v2 = "lnk";
    Object v3 = new org.jsoup.nodes.Document.OutputSettings();
    Object v4 = false;
    Object v5 = true;
    Object v6 = true;
    org.jsoup.nodes.Entities.escape(((java.lang.StringBuilder)v1),((java.lang.String)v2),((org.jsoup.nodes.Document.OutputSettings)v3),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = 16;
    Object v1 = new java.lang.StringBuilder((((java.lang.Integer)v0).intValue()));
    Object v2 = "/";
    Object v3 = new org.jsoup.nodes.Document.OutputSettings();
    Object v4 = ((org.jsoup.nodes.Document.OutputSettings)v3).clone();
    Object v5 = true;
    Object v6 = false;
    Object v7 = true;
    org.jsoup.nodes.Entities.escape(((java.lang.StringBuilder)v1),((java.lang.String)v2),((org.jsoup.nodes.Document.OutputSettings)v3),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()),(((java.lang.Boolean)v7).booleanValue()));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = 16;
    Object v1 = new java.lang.StringBuilder((((java.lang.Integer)v0).intValue()));
    Object v2 = "fig6re";
    Object v3 = new org.jsoup.nodes.Document.OutputSettings();
    Object v4 = true;
    Object v5 = false;
    Object v6 = true;
    org.jsoup.nodes.Entities.escape(((java.lang.StringBuilder)v1),((java.lang.String)v2),((org.jsoup.nodes.Document.OutputSettings)v3),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = "";
    Object v1 = org.jsoup.nodes.Entities.isNamedEntity(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = 16;
    Object v1 = new java.lang.StringBuilder((((java.lang.Integer)v0).intValue()));
    Object v2 = "input";
    Object v3 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v2));
    Object v4 = new java.lang.StringBuffer(((java.lang.CharSequence)v3));
    Object v5 = ((java.lang.StringBuilder)v1).append(((java.lang.StringBuffer)v4));
    Object v6 = "ais";
    Object v7 = new org.jsoup.nodes.Document.OutputSettings();
    Object v8 = false;
    Object v9 = true;
    Object v10 = false;
    org.jsoup.nodes.Entities.escape(((java.lang.StringBuilder)v1),((java.lang.String)v6),((org.jsoup.nodes.Document.OutputSettings)v7),(((java.lang.Boolean)v8).booleanValue()),(((java.lang.Boolean)v9).booleanValue()),(((java.lang.Boolean)v10).booleanValue()));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = 16;
    Object v1 = new java.lang.StringBuilder((((java.lang.Integer)v0).intValue()));
    Object v2 = "tchead";
    Object v3 = new org.jsoup.nodes.Document.OutputSettings();
    Object v4 = true;
    Object v5 = false;
    Object v6 = false;
    org.jsoup.nodes.Entities.escape(((java.lang.StringBuilder)v1),((java.lang.String)v2),((org.jsoup.nodes.Document.OutputSettings)v3),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = 16;
    Object v1 = new java.lang.StringBuilder((((java.lang.Integer)v0).intValue()));
    Object v2 = "input";
    Object v3 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v2));
    Object v4 = ((java.lang.StringBuilder)v1).append(((java.lang.Object)v3));
    Object v5 = "7";
    Object v6 = new org.jsoup.nodes.Document.OutputSettings();
    Object v7 = 0;
    Object v8 = ((org.jsoup.nodes.Document.OutputSettings)v6).indentAmount((((java.lang.Integer)v7).intValue()));
    Object v9 = true;
    Object v10 = true;
    Object v11 = false;
    org.jsoup.nodes.Entities.escape(((java.lang.StringBuilder)v1),((java.lang.String)v5),((org.jsoup.nodes.Document.OutputSettings)v6),(((java.lang.Boolean)v9).booleanValue()),(((java.lang.Boolean)v10).booleanValue()),(((java.lang.Boolean)v11).booleanValue()));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = "html";
    Object v1 = org.jsoup.nodes.Entities.isNamedEntity(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = 16;
    Object v1 = new java.lang.StringBuilder((((java.lang.Integer)v0).intValue()));
    Object v2 = Character.valueOf((char)1);
    Object v3 = ((java.lang.StringBuilder)v1).append((((java.lang.Character)v2).charValue()));
    Object v4 = "&gt;";
    Object v5 = new org.jsoup.nodes.Document.OutputSettings();
    Object v6 = false;
    Object v7 = true;
    Object v8 = false;
    org.jsoup.nodes.Entities.escape(((java.lang.StringBuilder)v1),((java.lang.String)v4),((org.jsoup.nodes.Document.OutputSettings)v5),(((java.lang.Boolean)v6).booleanValue()),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Boolean)v8).booleanValue()));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = 16;
    Object v1 = new java.lang.StringBuilder((((java.lang.Integer)v0).intValue()));
    Object v2 = "tfoo?t";
    Object v3 = new org.jsoup.nodes.Document.OutputSettings();
    Object v4 = true;
    Object v5 = true;
    Object v6 = true;
    org.jsoup.nodes.Entities.escape(((java.lang.StringBuilder)v1),((java.lang.String)v2),((org.jsoup.nodes.Document.OutputSettings)v3),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = "</";
    Object v1 = new org.jsoup.nodes.Document.OutputSettings();
    Object v2 = org.jsoup.nodes.Entities.escape(((java.lang.String)v0),((org.jsoup.nodes.Document.OutputSettings)v1));
    org.junit.Assert.assertEquals((Object)("&lt;/"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = 16;
    Object v1 = new java.lang.StringBuilder((((java.lang.Integer)v0).intValue()));
    Object v2 = "th";
    Object v3 = new org.jsoup.nodes.Document.OutputSettings();
    Object v4 = ((org.jsoup.nodes.Document.OutputSettings)v3).clone();
    Object v5 = false;
    Object v6 = true;
    Object v7 = false;
    org.jsoup.nodes.Entities.escape(((java.lang.StringBuilder)v1),((java.lang.String)v2),((org.jsoup.nodes.Document.OutputSettings)v3),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()),(((java.lang.Boolean)v7).booleanValue()));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = 16;
    Object v1 = new java.lang.StringBuilder((((java.lang.Integer)v0).intValue()));
    Object v2 = "t.";
    Object v3 = new org.jsoup.nodes.Document.OutputSettings();
    Object v4 = false;
    Object v5 = true;
    Object v6 = false;
    org.jsoup.nodes.Entities.escape(((java.lang.StringBuilder)v1),((java.lang.String)v2),((org.jsoup.nodes.Document.OutputSettings)v3),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = 16;
    Object v1 = new java.lang.StringBuilder((((java.lang.Integer)v0).intValue()));
    Object v2 = "iSrame";
    Object v3 = new org.jsoup.nodes.Document.OutputSettings();
    Object v4 = true;
    Object v5 = true;
    Object v6 = true;
    org.jsoup.nodes.Entities.escape(((java.lang.StringBuilder)v1),((java.lang.String)v2),((org.jsoup.nodes.Document.OutputSettings)v3),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = "mta";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("mta"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = 16;
    Object v1 = new java.lang.StringBuilder((((java.lang.Integer)v0).intValue()));
    Object v2 = "p";
    Object v3 = new org.jsoup.nodes.Document.OutputSettings();
    Object v4 = ((org.jsoup.nodes.Document.OutputSettings)v3).clone();
    Object v5 = false;
    Object v6 = true;
    Object v7 = false;
    org.jsoup.nodes.Entities.escape(((java.lang.StringBuilder)v1),((java.lang.String)v2),((org.jsoup.nodes.Document.OutputSettings)v3),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()),(((java.lang.Boolean)v7).booleanValue()));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = 16;
    Object v1 = new java.lang.StringBuilder((((java.lang.Integer)v0).intValue()));
    Object v2 = "EndTagOpen";
    Object v3 = new org.jsoup.nodes.Document.OutputSettings();
    Object v4 = false;
    Object v5 = false;
    Object v6 = false;
    org.jsoup.nodes.Entities.escape(((java.lang.StringBuilder)v1),((java.lang.String)v2),((org.jsoup.nodes.Document.OutputSettings)v3),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = 16;
    Object v1 = new java.lang.StringBuilder((((java.lang.Integer)v0).intValue()));
    Object v2 = 38L;
    Object v3 = ((java.lang.StringBuilder)v1).append((((java.lang.Long)v2).longValue()));
    Object v4 = "&amp;";
    Object v5 = new org.jsoup.nodes.Document.OutputSettings();
    Object v6 = false;
    Object v7 = true;
    Object v8 = false;
    org.jsoup.nodes.Entities.escape(((java.lang.StringBuilder)v1),((java.lang.String)v4),((org.jsoup.nodes.Document.OutputSettings)v5),(((java.lang.Boolean)v6).booleanValue()),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Boolean)v8).booleanValue()));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = 16;
    Object v1 = new java.lang.StringBuilder((((java.lang.Integer)v0).intValue()));
    Object v2 = "noframs";
    Object v3 = new org.jsoup.nodes.Document.OutputSettings();
    Object v4 = false;
    Object v5 = false;
    Object v6 = true;
    org.jsoup.nodes.Entities.escape(((java.lang.StringBuilder)v1),((java.lang.String)v2),((org.jsoup.nodes.Document.OutputSettings)v3),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = "tfoot";
    Object v1 = org.jsoup.nodes.Entities.isNamedEntity(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = "t";
    Object v1 = org.jsoup.nodes.Entities.isBaseNamedEntity(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = 16;
    Object v1 = new java.lang.StringBuilder((((java.lang.Integer)v0).intValue()));
    Object v2 = "htm";
    Object v3 = new org.jsoup.nodes.Document.OutputSettings();
    Object v4 = true;
    Object v5 = false;
    Object v6 = false;
    org.jsoup.nodes.Entities.escape(((java.lang.StringBuilder)v1),((java.lang.String)v2),((org.jsoup.nodes.Document.OutputSettings)v3),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = "type";
    Object v1 = new org.jsoup.nodes.Document.OutputSettings();
    Object v2 = org.jsoup.nodes.Entities.escape(((java.lang.String)v0),((org.jsoup.nodes.Document.OutputSettings)v1));
    org.junit.Assert.assertEquals((Object)("type"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = 16;
    Object v1 = new java.lang.StringBuilder((((java.lang.Integer)v0).intValue()));
    Object v2 = "h4";
    Object v3 = new org.jsoup.nodes.Document.OutputSettings();
    Object v4 = false;
    Object v5 = false;
    Object v6 = false;
    org.jsoup.nodes.Entities.escape(((java.lang.StringBuilder)v1),((java.lang.String)v2),((org.jsoup.nodes.Document.OutputSettings)v3),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = 16;
    Object v1 = new java.lang.StringBuilder((((java.lang.Integer)v0).intValue()));
    Object v2 = "t";
    Object v3 = new org.jsoup.nodes.Document.OutputSettings();
    Object v4 = false;
    Object v5 = false;
    Object v6 = false;
    org.jsoup.nodes.Entities.escape(((java.lang.StringBuilder)v1),((java.lang.String)v2),((org.jsoup.nodes.Document.OutputSettings)v3),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = 16;
    Object v1 = new java.lang.StringBuilder((((java.lang.Integer)v0).intValue()));
    Object v2 = "E";
    Object v3 = ((java.lang.StringBuilder)v1).lastIndexOf(((java.lang.String)v2));
    Object v4 = "table";
    Object v5 = new org.jsoup.nodes.Document.OutputSettings();
    Object v6 = false;
    Object v7 = false;
    Object v8 = true;
    org.jsoup.nodes.Entities.escape(((java.lang.StringBuilder)v1),((java.lang.String)v4),((org.jsoup.nodes.Document.OutputSettings)v5),(((java.lang.Boolean)v6).booleanValue()),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Boolean)v8).booleanValue()));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = 16;
    Object v1 = new java.lang.StringBuilder((((java.lang.Integer)v0).intValue()));
    Object v2 = "section";
    Object v3 = new org.jsoup.nodes.Document.OutputSettings();
    Object v4 = org.jsoup.nodes.Entities.EscapeMode.xhtml;
    Object v5 = ((org.jsoup.nodes.Document.OutputSettings)v3).escapeMode(((org.jsoup.nodes.Entities.EscapeMode)v4));
    Object v6 = false;
    Object v7 = false;
    Object v8 = true;
    org.jsoup.nodes.Entities.escape(((java.lang.StringBuilder)v1),((java.lang.String)v2),((org.jsoup.nodes.Document.OutputSettings)v3),(((java.lang.Boolean)v6).booleanValue()),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Boolean)v8).booleanValue()));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = 16;
    Object v1 = new java.lang.StringBuilder((((java.lang.Integer)v0).intValue()));
    Object v2 = "ead";
    Object v3 = ((java.lang.StringBuilder)v1).indexOf(((java.lang.String)v2));
    Object v4 = "htbl";
    Object v5 = new org.jsoup.nodes.Document.OutputSettings();
    Object v6 = false;
    Object v7 = true;
    Object v8 = true;
    org.jsoup.nodes.Entities.escape(((java.lang.StringBuilder)v1),((java.lang.String)v4),((org.jsoup.nodes.Document.OutputSettings)v5),(((java.lang.Boolean)v6).booleanValue()),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Boolean)v8).booleanValue()));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = "l\\ink";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("l\\ink"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = "p";
    Object v1 = false;
    Object v2 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()));
    org.junit.Assert.assertEquals((Object)("p"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = "p";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("p"), v1);
  }
}
