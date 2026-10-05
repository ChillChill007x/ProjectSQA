package org.jsoup.parser;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = org.jsoup.parser.HtmlTreeBuilderState.AfterHead;
    Object v1 = new org.jsoup.parser.Token.Character();
    Object v2 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v3 = ((org.jsoup.parser.HtmlTreeBuilderState)v0).process(((org.jsoup.parser.Token)v1),((org.jsoup.parser.HtmlTreeBuilder)v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = org.jsoup.parser.HtmlTreeBuilderState.AfterFrameset;
    Object v1 = new org.jsoup.parser.Token.Character();
    Object v2 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v3 = ((org.jsoup.parser.HtmlTreeBuilderState)v0).process(((org.jsoup.parser.Token)v1),((org.jsoup.parser.HtmlTreeBuilder)v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = "html";
    Object v1 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v0));
    Object v2 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v3 = ((java.lang.Enum)v1).equals(((java.lang.Object)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = "1";
    Object v1 = org.jsoup.parser.HtmlTreeBuilderState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = org.jsoup.parser.HtmlTreeBuilderState.values();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = "html";
    Object v1 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).hashCode();
    Object v3 = ((java.lang.Enum)v1).ordinal();
    org.junit.Assert.assertEquals((Object)(0), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = " m";
    Object v1 = org.jsoup.parser.HtmlTreeBuilderState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = "html";
    Object v1 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v0));
    Object v2 = "html";
    Object v3 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v2));
    Object v4 = ((java.lang.Enum)v1).compareTo(((java.lang.Enum)v3));
    Object v5 = ((java.lang.Enum)v1).getDeclaringClass();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = "html";
    Object v1 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).toString();
    org.junit.Assert.assertEquals((Object)("html"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = "html";
    Object v1 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v0));
    Object v2 = "html";
    Object v3 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v2));
    Object v4 = ((java.lang.Enum)v1).compareTo(((java.lang.Enum)v3));
    Object v5 = ((java.lang.Enum)v1).toString();
    org.junit.Assert.assertEquals((Object)("html"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = org.jsoup.parser.HtmlTreeBuilderState.BeforeHtml;
    Object v1 = new org.jsoup.parser.Token.Character();
    Object v2 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v3 = ((org.jsoup.parser.HtmlTreeBuilderState)v0).process(((org.jsoup.parser.Token)v1),((org.jsoup.parser.HtmlTreeBuilder)v2));
    org.junit.Assert.assertEquals((Object)(true), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = org.jsoup.parser.HtmlTreeBuilderState.InRow;
    Object v1 = new org.jsoup.parser.Token.Character();
    Object v2 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v3 = ((org.jsoup.parser.HtmlTreeBuilderState)v0).process(((org.jsoup.parser.Token)v1),((org.jsoup.parser.HtmlTreeBuilder)v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = "html";
    Object v1 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).hashCode();
    Object v3 = ((java.lang.Enum)v1).name();
    org.junit.Assert.assertEquals((Object)("html"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = "html";
    Object v1 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v0));
    Object v2 = "html";
    Object v3 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v2));
    Object v4 = ((java.lang.Enum)v1).compareTo(((java.lang.Enum)v3));
    org.junit.Assert.assertEquals((Object)(0), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = "html";
    Object v1 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v0));
    Object v2 = "html";
    Object v3 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v2));
    Object v4 = ((java.lang.Enum)v1).compareTo(((java.lang.Enum)v3));
    Object v5 = org.jsoup.parser.HtmlTreeBuilderState.values();
    Object v6 = ((java.lang.Enum)v1).equals(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = "table";
    Object v1 = org.jsoup.parser.HtmlTreeBuilderState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = "~";
    Object v1 = org.jsoup.parser.HtmlTreeBuilderState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = "html";
    Object v1 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v0));
    Object v2 = "html";
    Object v3 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v2));
    Object v4 = ((java.lang.Enum)v1).equals(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = org.jsoup.parser.HtmlTreeBuilderState.InHeadNoscript;
    Object v1 = new org.jsoup.parser.Token.Character();
    Object v2 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v3 = ((org.jsoup.parser.HtmlTreeBuilderState)v0).process(((org.jsoup.parser.Token)v1),((org.jsoup.parser.HtmlTreeBuilder)v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = "html";
    Object v1 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = ((java.lang.Enum)v1).getDeclaringClass();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = "html";
    Object v1 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v4 = "co";
    Object v5 = java.lang.Enum.valueOf(((java.lang.Class)v3),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = "S";
    Object v1 = org.jsoup.parser.HtmlTreeBuilderState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = "html";
    Object v1 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = "html";
    Object v1 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).name();
    org.junit.Assert.assertEquals((Object)("html"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = org.jsoup.parser.HtmlTreeBuilderState.InSelect;
    Object v1 = new org.jsoup.parser.Token.Character();
    Object v2 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v3 = ((org.jsoup.parser.HtmlTreeBuilderState)v0).process(((org.jsoup.parser.Token)v1),((org.jsoup.parser.HtmlTreeBuilder)v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = "u6l";
    Object v1 = org.jsoup.parser.HtmlTreeBuilderState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = org.jsoup.parser.HtmlTreeBuilderState.InBody;
    Object v1 = new org.jsoup.parser.Token.Character();
    Object v2 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v3 = ((org.jsoup.parser.HtmlTreeBuilderState)v0).process(((org.jsoup.parser.Token)v1),((org.jsoup.parser.HtmlTreeBuilder)v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = org.jsoup.parser.HtmlTreeBuilderState.InCaption;
    Object v1 = new org.jsoup.parser.Token.Character();
    Object v2 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v3 = ((org.jsoup.parser.HtmlTreeBuilderState)v0).process(((org.jsoup.parser.Token)v1),((org.jsoup.parser.HtmlTreeBuilder)v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = "html";
    Object v1 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v0));
    Object v2 = "html";
    Object v3 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v2));
    Object v4 = "html";
    Object v5 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v4));
    Object v6 = ((java.lang.Enum)v3).compareTo(((java.lang.Enum)v5));
    Object v7 = ((java.lang.Enum)v1).equals(((java.lang.Object)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = org.jsoup.parser.HtmlTreeBuilderState.InTable;
    Object v1 = new org.jsoup.parser.Token.Character();
    Object v2 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v3 = ((org.jsoup.parser.HtmlTreeBuilderState)v0).process(((org.jsoup.parser.Token)v1),((org.jsoup.parser.HtmlTreeBuilder)v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = "html";
    Object v1 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = ((java.lang.Class)v2).getPackageName();
    Object v4 = ":matches(regex) query must not be empty";
    Object v5 = java.lang.Enum.valueOf(((java.lang.Class)v2),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = org.jsoup.parser.HtmlTreeBuilderState.InCell;
    Object v1 = new org.jsoup.parser.Token.Character();
    Object v2 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v3 = ((org.jsoup.parser.HtmlTreeBuilderState)v0).process(((org.jsoup.parser.Token)v1),((org.jsoup.parser.HtmlTreeBuilder)v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = "html";
    Object v1 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v0));
    Object v2 = "html";
    Object v3 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v2));
    Object v4 = ((java.lang.Enum)v1).compareTo(((java.lang.Enum)v3));
    Object v5 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v6 = "thtml";
    Object v7 = java.lang.Enum.valueOf(((java.lang.Class)v5),((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = org.jsoup.parser.HtmlTreeBuilderState.InTableBody;
    Object v1 = new org.jsoup.parser.Token.Character();
    Object v2 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v3 = ((org.jsoup.parser.HtmlTreeBuilderState)v0).process(((org.jsoup.parser.Token)v1),((org.jsoup.parser.HtmlTreeBuilder)v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = "html";
    Object v1 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v4 = "i";
    Object v5 = java.lang.Enum.valueOf(((java.lang.Class)v3),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = "td6";
    Object v1 = org.jsoup.parser.HtmlTreeBuilderState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = org.jsoup.parser.HtmlTreeBuilderState.InFrameset;
    Object v1 = new org.jsoup.parser.Token.Character();
    Object v2 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v3 = ((org.jsoup.parser.HtmlTreeBuilderState)v0).process(((org.jsoup.parser.Token)v1),((org.jsoup.parser.HtmlTreeBuilder)v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = "}";
    Object v1 = org.jsoup.parser.HtmlTreeBuilderState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = "html";
    Object v1 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = "h1";
    Object v4 = java.lang.Enum.valueOf(((java.lang.Class)v2),((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = "html";
    Object v1 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v0));
    Object v2 = org.jsoup.parser.HtmlTreeBuilderState.values();
    Object v3 = ((java.lang.Enum)v1).equals(((java.lang.Object)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = "!";
    Object v1 = org.jsoup.parser.HtmlTreeBuilderState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = "v";
    Object v1 = org.jsoup.parser.HtmlTreeBuilderState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = "html";
    Object v1 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v4 = "tad";
    Object v5 = java.lang.Enum.valueOf(((java.lang.Class)v3),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = org.jsoup.parser.HtmlTreeBuilderState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = "html";
    Object v1 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).hashCode();
    Object v3 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v4 = ((java.lang.Enum)v1).equals(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = "html";
    Object v1 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = "lnk";
    Object v4 = java.lang.Enum.valueOf(((java.lang.Class)v2),((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = "html";
    Object v1 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v0));
    Object v2 = "html";
    Object v3 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v2));
    Object v4 = ((java.lang.Enum)v3).name();
    Object v5 = ((java.lang.Enum)v1).equals(((java.lang.Object)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = "html";
    Object v1 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v0));
    Object v2 = "html";
    Object v3 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v2));
    Object v4 = ((java.lang.Enum)v1).compareTo(((java.lang.Enum)v3));
    Object v5 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v6 = "Hhead";
    Object v7 = java.lang.Enum.valueOf(((java.lang.Class)v5),((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = "h3";
    Object v1 = org.jsoup.parser.HtmlTreeBuilderState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = "html";
    Object v1 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v4 = "ScriptDataEscapedEndTagName";
    Object v5 = java.lang.Enum.valueOf(((java.lang.Class)v3),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = "html";
    Object v1 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = "tfoot";
    Object v4 = java.lang.Enum.valueOf(((java.lang.Class)v2),((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = "html";
    Object v1 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = "Co";
    Object v4 = java.lang.Enum.valueOf(((java.lang.Class)v2),((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = "html";
    Object v1 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v0));
    Object v2 = "html";
    Object v3 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v2));
    Object v4 = ((java.lang.Enum)v1).compareTo(((java.lang.Enum)v3));
    Object v5 = "html";
    Object v6 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v5));
    Object v7 = ((java.lang.Enum)v1).equals(((java.lang.Object)v6));
    org.junit.Assert.assertEquals((Object)(true), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = "th";
    Object v1 = org.jsoup.parser.HtmlTreeBuilderState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = org.jsoup.parser.HtmlTreeBuilderState.AfterFrameset;
    Object v1 = ((java.lang.Enum)v0).hashCode();
    Object v2 = new org.jsoup.parser.Token.Character();
    Object v3 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v4 = ((org.jsoup.parser.HtmlTreeBuilderState)v0).process(((org.jsoup.parser.Token)v2),((org.jsoup.parser.HtmlTreeBuilder)v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = "html";
    Object v1 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).hashCode();
    Object v3 = "html";
    Object v4 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v3));
    Object v5 = ((java.lang.Enum)v1).compareTo(((java.lang.Enum)v4));
    org.junit.Assert.assertEquals((Object)(0), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = "html";
    Object v1 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v0));
    Object v2 = "html";
    Object v3 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v2));
    Object v4 = ((java.lang.Enum)v1).compareTo(((java.lang.Enum)v3));
    Object v5 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v6 = "pa";
    Object v7 = java.lang.Enum.valueOf(((java.lang.Class)v5),((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = "thead";
    Object v1 = org.jsoup.parser.HtmlTreeBuilderState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = org.jsoup.parser.HtmlTreeBuilderState.InHeadNoscript;
    Object v1 = ((java.lang.Enum)v0).hashCode();
    Object v2 = new org.jsoup.parser.Token.Character();
    Object v3 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v4 = ((org.jsoup.parser.HtmlTreeBuilderState)v0).process(((org.jsoup.parser.Token)v2),((org.jsoup.parser.HtmlTreeBuilder)v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = "html";
    Object v1 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v4 = ((java.lang.Class)v3).getTypeName();
    Object v5 = "";
    Object v6 = java.lang.Enum.valueOf(((java.lang.Class)v3),((java.lang.String)v5));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = "html";
    Object v1 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v0));
    Object v2 = "html";
    Object v3 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v2));
    Object v4 = ((java.lang.Enum)v1).compareTo(((java.lang.Enum)v3));
    Object v5 = "html";
    Object v6 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v5));
    Object v7 = ((java.lang.Enum)v1).compareTo(((java.lang.Enum)v6));
    org.junit.Assert.assertEquals((Object)(0), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = "option";
    Object v1 = org.jsoup.parser.HtmlTreeBuilderState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = org.jsoup.parser.HtmlTreeBuilderState.AfterHead;
    Object v1 = ((java.lang.Enum)v0).getDeclaringClass();
    Object v2 = new org.jsoup.parser.Token.Character();
    Object v3 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v4 = ((org.jsoup.parser.HtmlTreeBuilderState)v0).process(((org.jsoup.parser.Token)v2),((org.jsoup.parser.HtmlTreeBuilder)v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = "html";
    Object v1 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v0));
    Object v2 = "html";
    Object v3 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v2));
    Object v4 = ((java.lang.Enum)v1).compareTo(((java.lang.Enum)v3));
    Object v5 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v6 = "colgroup";
    Object v7 = java.lang.Enum.valueOf(((java.lang.Class)v5),((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = "html";
    Object v1 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = "http-equiv";
    Object v4 = java.lang.Enum.valueOf(((java.lang.Class)v2),((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = "h2";
    Object v1 = org.jsoup.parser.HtmlTreeBuilderState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = "html";
    Object v1 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).ordinal();
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = "html";
    Object v1 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = ":matchesOwn(%s)";
    Object v4 = java.lang.Enum.valueOf(((java.lang.Class)v2),((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = "html";
    Object v1 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v0));
    Object v2 = "html";
    Object v3 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v2));
    Object v4 = ((java.lang.Enum)v1).compareTo(((java.lang.Enum)v3));
    Object v5 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v6 = ((java.lang.Class)v5).getAnnotatedSuperclass();
    Object v7 = "thk";
    Object v8 = java.lang.Enum.valueOf(((java.lang.Class)v5),((java.lang.String)v7));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = "html";
    Object v1 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v4 = "mnu";
    Object v5 = java.lang.Enum.valueOf(((java.lang.Class)v3),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = "html";
    Object v1 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v4 = "d";
    Object v5 = java.lang.Enum.valueOf(((java.lang.Class)v3),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = org.jsoup.parser.HtmlTreeBuilderState.AfterHead;
    Object v1 = ((java.lang.Enum)v0).hashCode();
    Object v2 = new org.jsoup.parser.Token.Character();
    Object v3 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v4 = ((org.jsoup.parser.HtmlTreeBuilderState)v0).process(((org.jsoup.parser.Token)v2),((org.jsoup.parser.HtmlTreeBuilder)v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = "html";
    Object v1 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).hashCode();
    Object v3 = ((java.lang.Enum)v1).hashCode();
    org.junit.Assert.assertEquals((Object)(721366426), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = "html";
    Object v1 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v4 = "object";
    Object v5 = java.lang.Enum.valueOf(((java.lang.Class)v3),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = "html";
    Object v1 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v0));
    Object v2 = "html";
    Object v3 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v2));
    Object v4 = ((java.lang.Enum)v1).compareTo(((java.lang.Enum)v3));
    Object v5 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v6 = ((java.lang.Class)v5).isInterface();
    Object v7 = "co$group";
    Object v8 = java.lang.Enum.valueOf(((java.lang.Class)v5),((java.lang.String)v7));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = "html";
    Object v1 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v0));
    Object v2 = "html";
    Object v3 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v2));
    Object v4 = "html";
    Object v5 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v4));
    Object v6 = ((java.lang.Enum)v3).equals(((java.lang.Object)v5));
    Object v7 = ((java.lang.Enum)v1).equals(((java.lang.Object)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = "html";
    Object v1 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = "html";
    Object v4 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v3));
    Object v5 = "html";
    Object v6 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v5));
    Object v7 = ((java.lang.Enum)v4).compareTo(((java.lang.Enum)v6));
    Object v8 = org.jsoup.parser.HtmlTreeBuilderState.values();
    Object v9 = ((java.lang.Enum)v4).equals(((java.lang.Object)v8));
    Object v10 = ((java.lang.Enum)v1).equals(((java.lang.Object)v9));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = "mta";
    Object v1 = org.jsoup.parser.HtmlTreeBuilderState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = "html";
    Object v1 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v0));
    Object v2 = "html";
    Object v3 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v2));
    Object v4 = ((java.lang.Enum)v3).getDeclaringClass();
    Object v5 = "html";
    Object v6 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v5));
    Object v7 = "html";
    Object v8 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v7));
    Object v9 = ((java.lang.Enum)v6).compareTo(((java.lang.Enum)v8));
    Object v10 = org.jsoup.parser.HtmlTreeBuilderState.values();
    Object v11 = ((java.lang.Enum)v6).equals(((java.lang.Object)v10));
    Object v12 = ((java.lang.Enum)v3).equals(((java.lang.Object)v11));
    Object v13 = ((java.lang.Enum)v1).equals(((java.lang.Object)v12));
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = "html";
    Object v1 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v4 = "";
    Object v5 = java.lang.Enum.valueOf(((java.lang.Class)v3),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = "</";
    Object v1 = org.jsoup.parser.HtmlTreeBuilderState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = "html";
    Object v1 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v0));
    Object v2 = "html";
    Object v3 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v2));
    Object v4 = ((java.lang.Enum)v3).ordinal();
    Object v5 = ((java.lang.Enum)v1).equals(((java.lang.Object)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = "a";
    Object v1 = org.jsoup.parser.HtmlTreeBuilderState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = "html";
    Object v1 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).hashCode();
    Object v3 = ((java.lang.Enum)v1).getDeclaringClass();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = "html";
    Object v1 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v0));
    Object v2 = "html";
    Object v3 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v2));
    Object v4 = "html";
    Object v5 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v4));
    Object v6 = ((java.lang.Enum)v3).compareTo(((java.lang.Enum)v5));
    Object v7 = ((java.lang.Enum)v1).compareTo(((java.lang.Enum)v3));
    org.junit.Assert.assertEquals((Object)(0), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = org.jsoup.parser.HtmlTreeBuilderState.AfterAfterFrameset;
    Object v1 = new org.jsoup.parser.Token.Character();
    Object v2 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v3 = ((org.jsoup.parser.HtmlTreeBuilderState)v0).process(((org.jsoup.parser.Token)v1),((org.jsoup.parser.HtmlTreeBuilder)v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = "html";
    Object v1 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).hashCode();
    Object v3 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v4 = "th";
    Object v5 = java.lang.Enum.valueOf(((java.lang.Class)v3),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = "html";
    Object v1 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).hashCode();
    Object v3 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v4 = "";
    Object v5 = java.lang.Enum.valueOf(((java.lang.Class)v3),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = "html";
    Object v1 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).hashCode();
    org.junit.Assert.assertEquals((Object)(721366426), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = org.jsoup.parser.HtmlTreeBuilderState.AfterBody;
    Object v1 = new org.jsoup.parser.Token.Character();
    Object v2 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v3 = ((org.jsoup.parser.HtmlTreeBuilderState)v0).process(((org.jsoup.parser.Token)v1),((org.jsoup.parser.HtmlTreeBuilder)v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = "html";
    Object v1 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).hashCode();
    Object v3 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v4 = "base";
    Object v5 = java.lang.Enum.valueOf(((java.lang.Class)v3),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = "html";
    Object v1 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v0));
    Object v2 = "html";
    Object v3 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v2));
    Object v4 = ((java.lang.Enum)v3).hashCode();
    Object v5 = "html";
    Object v6 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v5));
    Object v7 = ((java.lang.Enum)v3).compareTo(((java.lang.Enum)v6));
    Object v8 = ((java.lang.Enum)v1).equals(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = "p]";
    Object v1 = org.jsoup.parser.HtmlTreeBuilderState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = org.jsoup.parser.HtmlTreeBuilderState.InSelectInTable;
    Object v1 = new org.jsoup.parser.Token.Character();
    Object v2 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v3 = ((org.jsoup.parser.HtmlTreeBuilderState)v0).process(((org.jsoup.parser.Token)v1),((org.jsoup.parser.HtmlTreeBuilder)v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = "systemId";
    Object v1 = org.jsoup.parser.HtmlTreeBuilderState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = "html";
    Object v1 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = ((java.lang.Class)v2).getDeclaredClasses();
    Object v4 = "";
    Object v5 = java.lang.Enum.valueOf(((java.lang.Class)v2),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = "html";
    Object v1 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = "html";
    Object v4 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v3));
    Object v5 = ((java.lang.Enum)v1).compareTo(((java.lang.Enum)v4));
    org.junit.Assert.assertEquals((Object)(0), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = org.jsoup.parser.HtmlTreeBuilderState.Initial;
    Object v1 = new org.jsoup.parser.Token.Character();
    Object v2 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v3 = ((org.jsoup.parser.HtmlTreeBuilderState)v0).process(((org.jsoup.parser.Token)v1),((org.jsoup.parser.HtmlTreeBuilder)v2));
    org.junit.Assert.assertEquals((Object)(true), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = "keygen";
    Object v1 = org.jsoup.parser.HtmlTreeBuilderState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = "html";
    Object v1 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v0));
    Object v2 = "html";
    Object v3 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v2));
    Object v4 = ((java.lang.Enum)v3).hashCode();
    Object v5 = ((java.lang.Enum)v1).compareTo(((java.lang.Enum)v3));
    org.junit.Assert.assertEquals((Object)(0), v5);
  }
}
