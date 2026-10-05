package org.jsoup.nodes;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = ":last-child";
    Object v1 = "Aolgroup";
    Object v2 = new org.jsoup.nodes.Attribute(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "title{";
    ((org.jsoup.nodes.Attribute)v2).setKey(((java.lang.String)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = "scope";
    Object v1 = org.jsoup.nodes.Attribute.isBooleanAttribute(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = ":last-child";
    Object v1 = "Aolgroup";
    Object v2 = new org.jsoup.nodes.Attribute(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Attribute)v2).toString();
    Object v4 = "scope";
    Object v5 = org.jsoup.nodes.Attribute.isBooleanAttribute(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Attribute)v2).equals(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = ":last-child";
    Object v1 = "Aolgroup";
    Object v2 = new org.jsoup.nodes.Attribute(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "tbody";
    Object v4 = "optgro";
    Object v5 = org.jsoup.parser.Parser.xmlParser();
    Object v6 = org.jsoup.Jsoup.parse(((java.lang.String)v3),((java.lang.String)v4),((org.jsoup.parser.Parser)v5));
    Object v7 = org.jsoup.nodes.NodeUtils.outputSettings(((org.jsoup.nodes.Node)v6));
    Object v8 = ((org.jsoup.nodes.Attribute)v2).shouldCollapseAttribute(((org.jsoup.nodes.Document.OutputSettings)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = ":last-child";
    Object v1 = "Aolgroup";
    Object v2 = new org.jsoup.nodes.Attribute(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Attribute)v2).clone();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = "style";
    Object v1 = "tr";
    Object v2 = org.jsoup.internal.StringUtil.borrowBuilder();
    Object v3 = "tbody";
    Object v4 = "optgro";
    Object v5 = org.jsoup.parser.Parser.xmlParser();
    Object v6 = org.jsoup.Jsoup.parse(((java.lang.String)v3),((java.lang.String)v4),((org.jsoup.parser.Parser)v5));
    Object v7 = org.jsoup.nodes.NodeUtils.outputSettings(((org.jsoup.nodes.Node)v6));
    org.jsoup.nodes.Attribute.html(((java.lang.String)v0),((java.lang.String)v1),((java.lang.Appendable)v2),((org.jsoup.nodes.Document.OutputSettings)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = "select";
    Object v1 = org.jsoup.nodes.Attribute.isDataAttribute(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = ":last-child";
    Object v1 = "Aolgroup";
    Object v2 = new org.jsoup.nodes.Attribute(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Attribute)v2).clone();
    Object v4 = org.jsoup.internal.StringUtil.borrowBuilder();
    Object v5 = "tbody";
    Object v6 = "optgro";
    Object v7 = org.jsoup.parser.Parser.xmlParser();
    Object v8 = org.jsoup.Jsoup.parse(((java.lang.String)v5),((java.lang.String)v6),((org.jsoup.parser.Parser)v7));
    Object v9 = org.jsoup.nodes.NodeUtils.outputSettings(((org.jsoup.nodes.Node)v8));
    Object v10 = org.jsoup.nodes.Document.OutputSettings.Syntax.html;
    Object v11 = ((org.jsoup.nodes.Document.OutputSettings)v9).syntax(((org.jsoup.nodes.Document.OutputSettings.Syntax)v10));
    ((org.jsoup.nodes.Attribute)v3).html(((java.lang.Appendable)v4),((org.jsoup.nodes.Document.OutputSettings)v9));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = " ";
    Object v1 = "colx";
    Object v2 = "tbody";
    Object v3 = "optgro";
    Object v4 = org.jsoup.parser.Parser.xmlParser();
    Object v5 = org.jsoup.Jsoup.parse(((java.lang.String)v2),((java.lang.String)v3),((org.jsoup.parser.Parser)v4));
    Object v6 = org.jsoup.nodes.NodeUtils.outputSettings(((org.jsoup.nodes.Node)v5));
    Object v7 = org.jsoup.nodes.Attribute.shouldCollapseAttribute(((java.lang.String)v0),((java.lang.String)v1),((org.jsoup.nodes.Document.OutputSettings)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = "tgd";
    Object v1 = org.jsoup.nodes.Attribute.isDataAttribute(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = ":last-child";
    Object v1 = "Aolgroup";
    Object v2 = new org.jsoup.nodes.Attribute(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Attribute)v2).clone();
    Object v4 = org.jsoup.internal.StringUtil.borrowBuilder();
    Object v5 = "tbody";
    Object v6 = "optgro";
    Object v7 = org.jsoup.parser.Parser.xmlParser();
    Object v8 = org.jsoup.Jsoup.parse(((java.lang.String)v5),((java.lang.String)v6),((org.jsoup.parser.Parser)v7));
    Object v9 = org.jsoup.nodes.NodeUtils.outputSettings(((org.jsoup.nodes.Node)v8));
    ((org.jsoup.nodes.Attribute)v3).html(((java.lang.Appendable)v4),((org.jsoup.nodes.Document.OutputSettings)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = "ta";
    Object v1 = "t8h";
    Object v2 = org.jsoup.nodes.Attribute.createFromEncoded(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = ":last-child";
    Object v1 = "Aolgroup";
    Object v2 = new org.jsoup.nodes.Attribute(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Attribute)v2).clone();
    Object v4 = "asid-";
    ((org.jsoup.nodes.Attribute)v3).setKey(((java.lang.String)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = "ta";
    Object v1 = "t8h";
    Object v2 = org.jsoup.nodes.Attribute.createFromEncoded(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "select";
    Object v4 = org.jsoup.nodes.Attribute.isDataAttribute(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Attribute)v2).equals(((java.lang.Object)v4));
    Object v6 = ":last-child";
    Object v7 = "Aolgroup";
    Object v8 = new org.jsoup.nodes.Attribute(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = "tbody";
    Object v10 = "optgro";
    Object v11 = org.jsoup.parser.Parser.xmlParser();
    Object v12 = org.jsoup.Jsoup.parse(((java.lang.String)v9),((java.lang.String)v10),((org.jsoup.parser.Parser)v11));
    Object v13 = org.jsoup.nodes.NodeUtils.outputSettings(((org.jsoup.nodes.Node)v12));
    Object v14 = ((org.jsoup.nodes.Attribute)v8).shouldCollapseAttribute(((org.jsoup.nodes.Document.OutputSettings)v13));
    Object v15 = ((org.jsoup.nodes.Attribute)v2).equals(((java.lang.Object)v14));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = "base";
    Object v1 = "";
    Object v2 = "tbody";
    Object v3 = "optgro";
    Object v4 = org.jsoup.parser.Parser.xmlParser();
    Object v5 = org.jsoup.Jsoup.parse(((java.lang.String)v2),((java.lang.String)v3),((org.jsoup.parser.Parser)v4));
    Object v6 = org.jsoup.nodes.NodeUtils.outputSettings(((org.jsoup.nodes.Node)v5));
    Object v7 = org.jsoup.nodes.Attribute.shouldCollapseAttribute(((java.lang.String)v0),((java.lang.String)v1),((org.jsoup.nodes.Document.OutputSettings)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = ":last-child";
    Object v1 = "Aolgroup";
    Object v2 = new org.jsoup.nodes.Attribute(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Attribute)v2).clone();
    Object v4 = ((org.jsoup.nodes.Attribute)v3).hashCode();
    org.junit.Assert.assertEquals((Object)(-724273054), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = "y";
    Object v1 = org.jsoup.nodes.Attribute.isBooleanAttribute(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = "7";
    Object v1 = "textaIrea";
    Object v2 = new org.jsoup.nodes.Attribute(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = "7";
    Object v1 = "textaIrea";
    Object v2 = new org.jsoup.nodes.Attribute(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "tgd";
    Object v4 = org.jsoup.nodes.Attribute.isDataAttribute(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Attribute)v2).equals(((java.lang.Object)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = ":last-child";
    Object v1 = "Aolgroup";
    Object v2 = new org.jsoup.nodes.Attribute(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Attribute)v2).clone();
    Object v4 = "tgd";
    Object v5 = org.jsoup.nodes.Attribute.isDataAttribute(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Attribute)v3).equals(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = "(";
    Object v1 = "u";
    Object v2 = "tbody";
    Object v3 = "optgro";
    Object v4 = org.jsoup.parser.Parser.xmlParser();
    Object v5 = org.jsoup.Jsoup.parse(((java.lang.String)v2),((java.lang.String)v3),((org.jsoup.parser.Parser)v4));
    Object v6 = org.jsoup.nodes.NodeUtils.outputSettings(((org.jsoup.nodes.Node)v5));
    Object v7 = org.jsoup.nodes.Attribute.shouldCollapseAttribute(((java.lang.String)v0),((java.lang.String)v1),((org.jsoup.nodes.Document.OutputSettings)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = "7";
    Object v1 = "textaIrea";
    Object v2 = new org.jsoup.nodes.Attribute(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Attribute)v2).isBooleanAttribute();
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = ":last-child";
    Object v1 = "Aolgroup";
    Object v2 = new org.jsoup.nodes.Attribute(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = org.jsoup.parser.Parser.xmlParser();
    Object v4 = ((org.jsoup.nodes.Attribute)v2).equals(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = "7";
    Object v1 = "textaIrea";
    Object v2 = new org.jsoup.nodes.Attribute(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "footeR";
    Object v4 = ((org.jsoup.nodes.Attribute)v2).setValue(((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)("textaIrea"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = "S";
    Object v1 = "p";
    Object v2 = org.jsoup.internal.StringUtil.borrowBuilder();
    Object v3 = "tbody";
    Object v4 = "optgro";
    Object v5 = org.jsoup.parser.Parser.xmlParser();
    Object v6 = org.jsoup.Jsoup.parse(((java.lang.String)v3),((java.lang.String)v4),((org.jsoup.parser.Parser)v5));
    Object v7 = org.jsoup.nodes.NodeUtils.outputSettings(((org.jsoup.nodes.Node)v6));
    Object v8 = false;
    Object v9 = ((org.jsoup.nodes.Document.OutputSettings)v7).outline((((java.lang.Boolean)v8).booleanValue()));
    org.jsoup.nodes.Attribute.html(((java.lang.String)v0),((java.lang.String)v1),((java.lang.Appendable)v2),((org.jsoup.nodes.Document.OutputSettings)v7));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = "7";
    Object v1 = "textaIrea";
    Object v2 = new org.jsoup.nodes.Attribute(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ":last-child";
    Object v4 = "Aolgroup";
    Object v5 = new org.jsoup.nodes.Attribute(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = "tbody";
    Object v7 = "optgro";
    Object v8 = org.jsoup.parser.Parser.xmlParser();
    Object v9 = org.jsoup.Jsoup.parse(((java.lang.String)v6),((java.lang.String)v7),((org.jsoup.parser.Parser)v8));
    Object v10 = org.jsoup.nodes.NodeUtils.outputSettings(((org.jsoup.nodes.Node)v9));
    Object v11 = ((org.jsoup.nodes.Attribute)v5).shouldCollapseAttribute(((org.jsoup.nodes.Document.OutputSettings)v10));
    Object v12 = ((org.jsoup.nodes.Attribute)v2).equals(((java.lang.Object)v11));
    Object v13 = "Gtml";
    Object v14 = ((org.jsoup.nodes.Attribute)v2).setValue(((java.lang.String)v13));
    org.junit.Assert.assertEquals((Object)("textaIrea"), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = "readonly";
    Object v1 = org.jsoup.nodes.Attribute.isBooleanAttribute(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(true), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = "7";
    Object v1 = "textaIrea";
    Object v2 = new org.jsoup.nodes.Attribute(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Attribute)v2).hashCode();
    org.junit.Assert.assertEquals((Object)(-1036991198), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = "r";
    Object v1 = org.jsoup.nodes.Attribute.isDataAttribute(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = "7";
    Object v1 = "textaIrea";
    Object v2 = new org.jsoup.nodes.Attribute(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Attribute)v2).html();
    org.junit.Assert.assertEquals((Object)("7=\"textaIrea\""), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = "7";
    Object v1 = "textaIrea";
    Object v2 = new org.jsoup.nodes.Attribute(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Attribute)v2).getKey();
    org.junit.Assert.assertEquals((Object)("7"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = "7";
    Object v1 = "textaIrea";
    Object v2 = new org.jsoup.nodes.Attribute(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Attribute)v2).clone();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = "7";
    Object v1 = "textaIrea";
    Object v2 = new org.jsoup.nodes.Attribute(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "html";
    ((org.jsoup.nodes.Attribute)v2).setKey(((java.lang.String)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = "7";
    Object v1 = "textaIrea";
    Object v2 = new org.jsoup.nodes.Attribute(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Attribute)v2).clone();
    Object v4 = "htql";
    Object v5 = ((org.jsoup.nodes.Attribute)v3).setValue(((java.lang.String)v4));
    Object v6 = "";
    Object v7 = ((org.jsoup.nodes.Attribute)v3).setValue(((java.lang.String)v6));
    org.junit.Assert.assertEquals((Object)("htql"), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = "trU";
    Object v1 = org.jsoup.nodes.Attribute.isBooleanAttribute(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = "titl";
    Object v1 = "htm";
    Object v2 = org.jsoup.internal.StringUtil.borrowBuilder();
    Object v3 = org.jsoup.internal.StringUtil.borrowBuilder();
    Object v4 = ((java.lang.Appendable)v2).append(((java.lang.CharSequence)v3));
    Object v5 = "tbody";
    Object v6 = "optgro";
    Object v7 = org.jsoup.parser.Parser.xmlParser();
    Object v8 = org.jsoup.Jsoup.parse(((java.lang.String)v5),((java.lang.String)v6),((org.jsoup.parser.Parser)v7));
    Object v9 = org.jsoup.nodes.NodeUtils.outputSettings(((org.jsoup.nodes.Node)v8));
    org.jsoup.nodes.Attribute.html(((java.lang.String)v0),((java.lang.String)v1),((java.lang.Appendable)v2),((org.jsoup.nodes.Document.OutputSettings)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = "t";
    Object v2 = new org.jsoup.nodes.Attributes();
    Object v3 = new org.jsoup.nodes.Attribute(((java.lang.String)v0),((java.lang.String)v1),((org.jsoup.nodes.Attributes)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = "7";
    Object v1 = "textaIrea";
    Object v2 = new org.jsoup.nodes.Attribute(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Attribute)v2).clone();
    Object v4 = "col";
    Object v5 = ((org.jsoup.nodes.Attribute)v3).setValue(((java.lang.String)v4));
    Object v6 = "readonly";
    Object v7 = org.jsoup.nodes.Attribute.isBooleanAttribute(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Attribute)v3).equals(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = "7";
    Object v1 = "textaIrea";
    Object v2 = new org.jsoup.nodes.Attribute(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Attribute)v2).clone();
    Object v4 = ((org.jsoup.nodes.Attribute)v3).isBooleanAttribute();
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = "7";
    Object v1 = "textaIrea";
    Object v2 = new org.jsoup.nodes.Attribute(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Attribute)v2).toString();
    Object v4 = ((org.jsoup.nodes.Attribute)v2).getValue();
    org.junit.Assert.assertEquals((Object)("textaIrea"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = "7";
    Object v1 = "textaIrea";
    Object v2 = new org.jsoup.nodes.Attribute(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "htm&";
    ((org.jsoup.nodes.Attribute)v2).setKey(((java.lang.String)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = "7";
    Object v1 = "textaIrea";
    Object v2 = new org.jsoup.nodes.Attribute(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Attribute)v2).getValue();
    org.junit.Assert.assertEquals((Object)("textaIrea"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = "7";
    Object v1 = "textaIrea";
    Object v2 = new org.jsoup.nodes.Attribute(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Attribute)v2).hashCode();
    Object v4 = ((org.jsoup.nodes.Attribute)v2).isBooleanAttribute();
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = "x|l";
    Object v1 = "wbS";
    Object v2 = "tbody";
    Object v3 = "optgro";
    Object v4 = org.jsoup.parser.Parser.xmlParser();
    Object v5 = org.jsoup.Jsoup.parse(((java.lang.String)v2),((java.lang.String)v3),((org.jsoup.parser.Parser)v4));
    Object v6 = org.jsoup.nodes.NodeUtils.outputSettings(((org.jsoup.nodes.Node)v5));
    Object v7 = org.jsoup.nodes.Attribute.shouldCollapseAttribute(((java.lang.String)v0),((java.lang.String)v1),((org.jsoup.nodes.Document.OutputSettings)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = "capXion";
    Object v1 = org.jsoup.nodes.Attribute.isDataAttribute(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = "7";
    Object v1 = "textaIrea";
    Object v2 = new org.jsoup.nodes.Attribute(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "thQead";
    ((org.jsoup.nodes.Attribute)v2).setKey(((java.lang.String)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = "7";
    Object v1 = "textaIrea";
    Object v2 = new org.jsoup.nodes.Attribute(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Attribute)v2).clone();
    Object v4 = ((org.jsoup.nodes.Attribute)v3).isDataAttribute();
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = "co+";
    Object v1 = "col";
    Object v2 = "tbody";
    Object v3 = "optgro";
    Object v4 = org.jsoup.parser.Parser.xmlParser();
    Object v5 = org.jsoup.Jsoup.parse(((java.lang.String)v2),((java.lang.String)v3),((org.jsoup.parser.Parser)v4));
    Object v6 = org.jsoup.nodes.NodeUtils.outputSettings(((org.jsoup.nodes.Node)v5));
    Object v7 = true;
    Object v8 = ((org.jsoup.nodes.Document.OutputSettings)v6).prettyPrint((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = org.jsoup.nodes.Attribute.shouldCollapseAttribute(((java.lang.String)v0),((java.lang.String)v1),((org.jsoup.nodes.Document.OutputSettings)v6));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = ":last-child";
    Object v1 = "Aolgroup";
    Object v2 = new org.jsoup.nodes.Attribute(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Attribute)v2).clone();
    Object v4 = ((org.jsoup.nodes.Attribute)v3).isBooleanAttribute();
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = "7";
    Object v1 = "textaIrea";
    Object v2 = new org.jsoup.nodes.Attribute(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "";
    Object v4 = ((org.jsoup.nodes.Attribute)v2).setValue(((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)("textaIrea"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = "iol";
    Object v1 = "htl";
    Object v2 = "tbody";
    Object v3 = "optgro";
    Object v4 = org.jsoup.parser.Parser.xmlParser();
    Object v5 = org.jsoup.Jsoup.parse(((java.lang.String)v2),((java.lang.String)v3),((org.jsoup.parser.Parser)v4));
    Object v6 = org.jsoup.nodes.NodeUtils.outputSettings(((org.jsoup.nodes.Node)v5));
    Object v7 = true;
    Object v8 = ((org.jsoup.nodes.Document.OutputSettings)v6).outline((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = org.jsoup.nodes.Attribute.shouldCollapseAttribute(((java.lang.String)v0),((java.lang.String)v1),((org.jsoup.nodes.Document.OutputSettings)v6));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = "ar";
    Object v1 = "#mp-itn";
    Object v2 = new org.jsoup.nodes.Attributes();
    Object v3 = new org.jsoup.nodes.Attribute(((java.lang.String)v0),((java.lang.String)v1),((org.jsoup.nodes.Attributes)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = "ta";
    Object v1 = "t8h";
    Object v2 = org.jsoup.nodes.Attribute.createFromEncoded(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Attribute)v2).hashCode();
    org.junit.Assert.assertEquals((Object)(227799), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = "=4";
    Object v1 = "img";
    Object v2 = org.jsoup.nodes.Attribute.createFromEncoded(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = "basef";
    Object v1 = "c\"te";
    Object v2 = org.jsoup.internal.StringUtil.borrowBuilder();
    Object v3 = "7";
    Object v4 = "textaIrea";
    Object v5 = new org.jsoup.nodes.Attribute(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Attribute)v5).getValue();
    Object v7 = ((java.lang.Appendable)v2).append(((java.lang.CharSequence)v6));
    Object v8 = "tbody";
    Object v9 = "optgro";
    Object v10 = org.jsoup.parser.Parser.xmlParser();
    Object v11 = org.jsoup.Jsoup.parse(((java.lang.String)v8),((java.lang.String)v9),((org.jsoup.parser.Parser)v10));
    Object v12 = org.jsoup.nodes.NodeUtils.outputSettings(((org.jsoup.nodes.Node)v11));
    org.jsoup.nodes.Attribute.html(((java.lang.String)v0),((java.lang.String)v1),((java.lang.Appendable)v2),((org.jsoup.nodes.Document.OutputSettings)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = "7";
    Object v1 = "textaIrea";
    Object v2 = new org.jsoup.nodes.Attribute(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Attribute)v2).clone();
    Object v4 = ((org.jsoup.nodes.Attribute)v3).clone();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = "";
    Object v1 = "tCble";
    Object v2 = org.jsoup.internal.StringUtil.borrowBuilder();
    Object v3 = "tbody";
    Object v4 = "optgro";
    Object v5 = org.jsoup.parser.Parser.xmlParser();
    Object v6 = org.jsoup.Jsoup.parse(((java.lang.String)v3),((java.lang.String)v4),((org.jsoup.parser.Parser)v5));
    Object v7 = org.jsoup.nodes.NodeUtils.outputSettings(((org.jsoup.nodes.Node)v6));
    org.jsoup.nodes.Attribute.html(((java.lang.String)v0),((java.lang.String)v1),((java.lang.Appendable)v2),((org.jsoup.nodes.Document.OutputSettings)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = "ar";
    Object v1 = "#mp-itn";
    Object v2 = new org.jsoup.nodes.Attributes();
    Object v3 = new org.jsoup.nodes.Attribute(((java.lang.String)v0),((java.lang.String)v1),((org.jsoup.nodes.Attributes)v2));
    Object v4 = ((org.jsoup.nodes.Attribute)v3).hashCode();
    Object v5 = ((org.jsoup.nodes.Attribute)v3).isBooleanAttribute();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = "";
    Object v1 = "html";
    Object v2 = org.jsoup.internal.StringUtil.borrowBuilder();
    Object v3 = Character.valueOf((char)1);
    Object v4 = ((java.lang.Appendable)v2).append((((java.lang.Character)v3).charValue()));
    Object v5 = "tbody";
    Object v6 = "optgro";
    Object v7 = org.jsoup.parser.Parser.xmlParser();
    Object v8 = org.jsoup.Jsoup.parse(((java.lang.String)v5),((java.lang.String)v6),((org.jsoup.parser.Parser)v7));
    Object v9 = org.jsoup.nodes.NodeUtils.outputSettings(((org.jsoup.nodes.Node)v8));
    org.jsoup.nodes.Attribute.html(((java.lang.String)v0),((java.lang.String)v1),((java.lang.Appendable)v2),((org.jsoup.nodes.Document.OutputSettings)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = "7";
    Object v1 = "textaIrea";
    Object v2 = new org.jsoup.nodes.Attribute(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Attribute)v2).clone();
    Object v4 = ((org.jsoup.nodes.Attribute)v3).clone();
    Object v5 = ((org.jsoup.nodes.Attribute)v4).isBooleanAttribute();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = "7";
    Object v1 = "textaIrea";
    Object v2 = new org.jsoup.nodes.Attribute(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Attribute)v2).isDataAttribute();
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = "noframes";
    Object v1 = "select";
    Object v2 = org.jsoup.internal.StringUtil.borrowBuilder();
    Object v3 = Character.valueOf((char)1);
    Object v4 = ((java.lang.Appendable)v2).append((((java.lang.Character)v3).charValue()));
    Object v5 = "tbody";
    Object v6 = "optgro";
    Object v7 = org.jsoup.parser.Parser.xmlParser();
    Object v8 = org.jsoup.Jsoup.parse(((java.lang.String)v5),((java.lang.String)v6),((org.jsoup.parser.Parser)v7));
    Object v9 = org.jsoup.nodes.NodeUtils.outputSettings(((org.jsoup.nodes.Node)v8));
    org.jsoup.nodes.Attribute.html(((java.lang.String)v0),((java.lang.String)v1),((java.lang.Appendable)v2),((org.jsoup.nodes.Document.OutputSettings)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = "7";
    Object v1 = "textaIrea";
    Object v2 = new org.jsoup.nodes.Attribute(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Attribute)v2).clone();
    Object v4 = "li&";
    Object v5 = ((org.jsoup.nodes.Attribute)v3).setValue(((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)("textaIrea"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = "7";
    Object v1 = "textaIrea";
    Object v2 = new org.jsoup.nodes.Attribute(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Attribute)v2).clone();
    Object v4 = ((org.jsoup.nodes.Attribute)v3).toString();
    org.junit.Assert.assertEquals((Object)("7=\"textaIrea\""), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = "optroup";
    Object v1 = "lNink";
    Object v2 = "tbody";
    Object v3 = "optgro";
    Object v4 = org.jsoup.parser.Parser.xmlParser();
    Object v5 = org.jsoup.Jsoup.parse(((java.lang.String)v2),((java.lang.String)v3),((org.jsoup.parser.Parser)v4));
    Object v6 = org.jsoup.nodes.NodeUtils.outputSettings(((org.jsoup.nodes.Node)v5));
    Object v7 = org.jsoup.nodes.Attribute.shouldCollapseAttribute(((java.lang.String)v0),((java.lang.String)v1),((org.jsoup.nodes.Document.OutputSettings)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = "base";
    Object v1 = "noframes";
    Object v2 = new org.jsoup.nodes.Attribute(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = "c";
    Object v1 = "";
    Object v2 = "tbody";
    Object v3 = "optgro";
    Object v4 = org.jsoup.parser.Parser.xmlParser();
    Object v5 = org.jsoup.Jsoup.parse(((java.lang.String)v2),((java.lang.String)v3),((org.jsoup.parser.Parser)v4));
    Object v6 = org.jsoup.nodes.NodeUtils.outputSettings(((org.jsoup.nodes.Node)v5));
    Object v7 = org.jsoup.nodes.Attribute.shouldCollapseAttribute(((java.lang.String)v0),((java.lang.String)v1),((org.jsoup.nodes.Document.OutputSettings)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = "7";
    Object v1 = "textaIrea";
    Object v2 = new org.jsoup.nodes.Attribute(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Attribute)v2).clone();
    Object v4 = "r";
    ((org.jsoup.nodes.Attribute)v3).setKey(((java.lang.String)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = "ar";
    Object v1 = "#mp-itn";
    Object v2 = new org.jsoup.nodes.Attributes();
    Object v3 = new org.jsoup.nodes.Attribute(((java.lang.String)v0),((java.lang.String)v1),((org.jsoup.nodes.Attributes)v2));
    Object v4 = "7";
    Object v5 = "textaIrea";
    Object v6 = new org.jsoup.nodes.Attribute(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Attribute)v6).clone();
    Object v8 = ((org.jsoup.nodes.Attribute)v3).equals(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = "ar";
    Object v1 = "#mp-itn";
    Object v2 = new org.jsoup.nodes.Attributes();
    Object v3 = new org.jsoup.nodes.Attribute(((java.lang.String)v0),((java.lang.String)v1),((org.jsoup.nodes.Attributes)v2));
    Object v4 = ((org.jsoup.nodes.Attribute)v3).getKey();
    org.junit.Assert.assertEquals((Object)("ar"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = " ";
    Object v1 = "thB";
    Object v2 = "tbody";
    Object v3 = "optgro";
    Object v4 = org.jsoup.parser.Parser.xmlParser();
    Object v5 = org.jsoup.Jsoup.parse(((java.lang.String)v2),((java.lang.String)v3),((org.jsoup.parser.Parser)v4));
    Object v6 = org.jsoup.nodes.NodeUtils.outputSettings(((org.jsoup.nodes.Node)v5));
    Object v7 = ((org.jsoup.nodes.Document.OutputSettings)v6).clone();
    Object v8 = org.jsoup.nodes.Attribute.shouldCollapseAttribute(((java.lang.String)v0),((java.lang.String)v1),((org.jsoup.nodes.Document.OutputSettings)v6));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = "7";
    Object v1 = "textaIrea";
    Object v2 = new org.jsoup.nodes.Attribute(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Attribute)v2).html();
    Object v4 = "small";
    Object v5 = ((org.jsoup.nodes.Attribute)v2).setValue(((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)("textaIrea"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = ":last-child";
    Object v1 = "Aolgroup";
    Object v2 = new org.jsoup.nodes.Attribute(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Attribute)v2).clone();
    Object v4 = ((org.jsoup.nodes.Attribute)v3).isDataAttribute();
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = "figcaption";
    Object v1 = "#";
    Object v2 = "tbody";
    Object v3 = "optgro";
    Object v4 = org.jsoup.parser.Parser.xmlParser();
    Object v5 = org.jsoup.Jsoup.parse(((java.lang.String)v2),((java.lang.String)v3),((org.jsoup.parser.Parser)v4));
    Object v6 = org.jsoup.nodes.NodeUtils.outputSettings(((org.jsoup.nodes.Node)v5));
    Object v7 = org.jsoup.nodes.Attribute.shouldCollapseAttribute(((java.lang.String)v0),((java.lang.String)v1),((org.jsoup.nodes.Document.OutputSettings)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = "data-";
    Object v1 = "thead";
    Object v2 = org.jsoup.internal.StringUtil.borrowBuilder();
    Object v3 = "tbody";
    Object v4 = "optgro";
    Object v5 = org.jsoup.parser.Parser.xmlParser();
    Object v6 = org.jsoup.Jsoup.parse(((java.lang.String)v3),((java.lang.String)v4),((org.jsoup.parser.Parser)v5));
    Object v7 = org.jsoup.nodes.NodeUtils.outputSettings(((org.jsoup.nodes.Node)v6));
    org.jsoup.nodes.Attribute.html(((java.lang.String)v0),((java.lang.String)v1),((java.lang.Appendable)v2),((org.jsoup.nodes.Document.OutputSettings)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = "co\\l";
    Object v1 = "bb";
    Object v2 = org.jsoup.internal.StringUtil.borrowBuilder();
    Object v3 = "tbody";
    Object v4 = "optgro";
    Object v5 = org.jsoup.parser.Parser.xmlParser();
    Object v6 = org.jsoup.Jsoup.parse(((java.lang.String)v3),((java.lang.String)v4),((org.jsoup.parser.Parser)v5));
    Object v7 = org.jsoup.nodes.NodeUtils.outputSettings(((org.jsoup.nodes.Node)v6));
    org.jsoup.nodes.Attribute.html(((java.lang.String)v0),((java.lang.String)v1),((java.lang.Appendable)v2),((org.jsoup.nodes.Document.OutputSettings)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = "P";
    Object v1 = "Request has already been read (with parse())";
    Object v2 = org.jsoup.internal.StringUtil.borrowBuilder();
    Object v3 = "tbody";
    Object v4 = "optgro";
    Object v5 = org.jsoup.parser.Parser.xmlParser();
    Object v6 = org.jsoup.Jsoup.parse(((java.lang.String)v3),((java.lang.String)v4),((org.jsoup.parser.Parser)v5));
    Object v7 = org.jsoup.nodes.NodeUtils.outputSettings(((org.jsoup.nodes.Node)v6));
    org.jsoup.nodes.Attribute.html(((java.lang.String)v0),((java.lang.String)v1),((java.lang.Appendable)v2),((org.jsoup.nodes.Document.OutputSettings)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = "7";
    Object v1 = "textaIrea";
    Object v2 = new org.jsoup.nodes.Attribute(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Attribute)v2).clone();
    Object v4 = ((org.jsoup.nodes.Attribute)v3).clone();
    Object v5 = ((org.jsoup.nodes.Attribute)v4).hashCode();
    org.junit.Assert.assertEquals((Object)(-1036991198), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = "7";
    Object v1 = "textaIrea";
    Object v2 = new org.jsoup.nodes.Attribute(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Attribute)v2).clone();
    Object v4 = "te";
    ((org.jsoup.nodes.Attribute)v3).setKey(((java.lang.String)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = "7";
    Object v1 = "textaIrea";
    Object v2 = new org.jsoup.nodes.Attribute(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Attribute)v2).clone();
    Object v4 = ":last-child";
    Object v5 = "Aolgroup";
    Object v6 = new org.jsoup.nodes.Attribute(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Attribute)v6).clone();
    Object v8 = ((org.jsoup.nodes.Attribute)v3).equals(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = "base";
    Object v1 = "noframes";
    Object v2 = new org.jsoup.nodes.Attribute(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "table";
    ((org.jsoup.nodes.Attribute)v2).setKey(((java.lang.String)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = "areS";
    Object v1 = org.jsoup.nodes.Attribute.isBooleanAttribute(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = "base";
    Object v1 = "noframes";
    Object v2 = new org.jsoup.nodes.Attribute(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Attribute)v2).hashCode();
    Object v4 = "capXion";
    Object v5 = org.jsoup.nodes.Attribute.isDataAttribute(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Attribute)v2).equals(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = "ar";
    Object v1 = "#mp-itn";
    Object v2 = new org.jsoup.nodes.Attributes();
    Object v3 = new org.jsoup.nodes.Attribute(((java.lang.String)v0),((java.lang.String)v1),((org.jsoup.nodes.Attributes)v2));
    Object v4 = ((org.jsoup.nodes.Attribute)v3).isBooleanAttribute();
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = "";
    Object v1 = "style";
    Object v2 = org.jsoup.internal.StringUtil.borrowBuilder();
    Object v3 = "tbody";
    Object v4 = "optgro";
    Object v5 = org.jsoup.parser.Parser.xmlParser();
    Object v6 = org.jsoup.Jsoup.parse(((java.lang.String)v3),((java.lang.String)v4),((org.jsoup.parser.Parser)v5));
    Object v7 = org.jsoup.nodes.NodeUtils.outputSettings(((org.jsoup.nodes.Node)v6));
    Object v8 = org.jsoup.nodes.Entities.EscapeMode.extended;
    Object v9 = ((org.jsoup.nodes.Document.OutputSettings)v7).escapeMode(((org.jsoup.nodes.Entities.EscapeMode)v8));
    org.jsoup.nodes.Attribute.html(((java.lang.String)v0),((java.lang.String)v1),((java.lang.Appendable)v2),((org.jsoup.nodes.Document.OutputSettings)v7));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = "base";
    Object v1 = "noframes";
    Object v2 = new org.jsoup.nodes.Attribute(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Attribute)v2).isBooleanAttribute();
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = "img";
    Object v1 = "UTF-8";
    Object v2 = org.jsoup.internal.StringUtil.borrowBuilder();
    Object v3 = "tbody";
    Object v4 = "optgro";
    Object v5 = org.jsoup.parser.Parser.xmlParser();
    Object v6 = org.jsoup.Jsoup.parse(((java.lang.String)v3),((java.lang.String)v4),((org.jsoup.parser.Parser)v5));
    Object v7 = org.jsoup.nodes.NodeUtils.outputSettings(((org.jsoup.nodes.Node)v6));
    org.jsoup.nodes.Attribute.html(((java.lang.String)v0),((java.lang.String)v1),((java.lang.Appendable)v2),((org.jsoup.nodes.Document.OutputSettings)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = "ol";
    Object v1 = "h";
    Object v2 = "tbody";
    Object v3 = "optgro";
    Object v4 = org.jsoup.parser.Parser.xmlParser();
    Object v5 = org.jsoup.Jsoup.parse(((java.lang.String)v2),((java.lang.String)v3),((org.jsoup.parser.Parser)v4));
    Object v6 = org.jsoup.nodes.NodeUtils.outputSettings(((org.jsoup.nodes.Node)v5));
    Object v7 = org.jsoup.nodes.Attribute.shouldCollapseAttribute(((java.lang.String)v0),((java.lang.String)v1),((org.jsoup.nodes.Document.OutputSettings)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = "h~";
    Object v1 = "HeaGer name must not be empty";
    Object v2 = org.jsoup.internal.StringUtil.borrowBuilder();
    Object v3 = Character.valueOf((char)1);
    Object v4 = ((java.lang.Appendable)v2).append((((java.lang.Character)v3).charValue()));
    Object v5 = "tbody";
    Object v6 = "optgro";
    Object v7 = org.jsoup.parser.Parser.xmlParser();
    Object v8 = org.jsoup.Jsoup.parse(((java.lang.String)v5),((java.lang.String)v6),((org.jsoup.parser.Parser)v7));
    Object v9 = org.jsoup.nodes.NodeUtils.outputSettings(((org.jsoup.nodes.Node)v8));
    org.jsoup.nodes.Attribute.html(((java.lang.String)v0),((java.lang.String)v1),((java.lang.Appendable)v2),((org.jsoup.nodes.Document.OutputSettings)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = "7";
    Object v1 = "textaIrea";
    Object v2 = new org.jsoup.nodes.Attribute(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "e#bed";
    Object v4 = ((org.jsoup.nodes.Attribute)v2).setValue(((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)("textaIrea"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = "                  ";
    Object v1 = org.jsoup.nodes.Attribute.isDataAttribute(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = "htm";
    Object v1 = org.jsoup.nodes.Attribute.isBooleanAttribute(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = "bL";
    Object v1 = "-";
    Object v2 = org.jsoup.internal.StringUtil.borrowBuilder();
    Object v3 = "tbody";
    Object v4 = "optgro";
    Object v5 = org.jsoup.parser.Parser.xmlParser();
    Object v6 = org.jsoup.Jsoup.parse(((java.lang.String)v3),((java.lang.String)v4),((org.jsoup.parser.Parser)v5));
    Object v7 = org.jsoup.nodes.NodeUtils.outputSettings(((org.jsoup.nodes.Node)v6));
    org.jsoup.nodes.Attribute.html(((java.lang.String)v0),((java.lang.String)v1),((java.lang.Appendable)v2),((org.jsoup.nodes.Document.OutputSettings)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = "scHript";
    Object v1 = "";
    Object v2 = new org.jsoup.nodes.Attributes();
    Object v3 = new org.jsoup.nodes.Attribute(((java.lang.String)v0),((java.lang.String)v1),((org.jsoup.nodes.Attributes)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = "Biv";
    Object v1 = org.jsoup.nodes.Attribute.isDataAttribute(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = "7";
    Object v1 = "textaIrea";
    Object v2 = new org.jsoup.nodes.Attribute(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Attribute)v2).clone();
    Object v4 = ((org.jsoup.nodes.Attribute)v3).clone();
    Object v5 = "@";
    ((org.jsoup.nodes.Attribute)v4).setKey(((java.lang.String)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = "body";
    Object v1 = org.jsoup.nodes.Attribute.isBooleanAttribute(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = ":last-child";
    Object v1 = "Aolgroup";
    Object v2 = new org.jsoup.nodes.Attribute(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Attribute)v2).clone();
    Object v4 = "stitle";
    Object v5 = ((org.jsoup.nodes.Attribute)v3).setValue(((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)("Aolgroup"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = "=4";
    Object v1 = "img";
    Object v2 = org.jsoup.nodes.Attribute.createFromEncoded(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Attribute)v2).hashCode();
    org.junit.Assert.assertEquals((Object)(164620), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = "h1";
    Object v1 = "p";
    Object v2 = org.jsoup.internal.StringUtil.borrowBuilder();
    Object v3 = "tbody";
    Object v4 = "optgro";
    Object v5 = org.jsoup.parser.Parser.xmlParser();
    Object v6 = org.jsoup.Jsoup.parse(((java.lang.String)v3),((java.lang.String)v4),((org.jsoup.parser.Parser)v5));
    Object v7 = org.jsoup.nodes.NodeUtils.outputSettings(((org.jsoup.nodes.Node)v6));
    org.jsoup.nodes.Attribute.html(((java.lang.String)v0),((java.lang.String)v1),((java.lang.Appendable)v2),((org.jsoup.nodes.Document.OutputSettings)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }
}
