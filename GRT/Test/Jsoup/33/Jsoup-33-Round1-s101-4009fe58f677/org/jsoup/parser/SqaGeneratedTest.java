package org.jsoup.parser;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "tale";
    ((org.jsoup.parser.HtmlTreeBuilder)v0).popStackToClose(((java.lang.String)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "h4";
    Object v2 = "<";
    Object v3 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v1),((java.lang.String)v2));
    ((org.jsoup.parser.HtmlTreeBuilder)v0).pushActiveFormattingElements(((org.jsoup.nodes.Element)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "h4";
    Object v2 = "<";
    Object v3 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((org.jsoup.parser.HtmlTreeBuilder)v0).aboveOnStack(((org.jsoup.nodes.Element)v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "h4";
    Object v2 = "<";
    Object v3 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "h4";
    Object v5 = "<";
    Object v6 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Element)v3).appendChild(((org.jsoup.nodes.Node)v6));
    Object v8 = ((org.jsoup.parser.HtmlTreeBuilder)v0).aboveOnStack(((org.jsoup.nodes.Element)v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "t~";
    Object v2 = new org.jsoup.parser.Token.Character(((java.lang.String)v1));
    ((org.jsoup.parser.HtmlTreeBuilder)v0).insert(((org.jsoup.parser.Token.Character)v2));
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "h4";
    Object v2 = "<";
    Object v3 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v1),((java.lang.String)v2));
    ((org.jsoup.parser.HtmlTreeBuilder)v0).removeFromActiveFormattingElements(((org.jsoup.nodes.Element)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    ((org.jsoup.parser.HtmlTreeBuilder)v0).clearFormattingElementsToLastMarker();
    Object v1 = null;
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "h4";
    Object v2 = "<";
    Object v3 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "h4";
    Object v5 = "<";
    Object v6 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v4),((java.lang.String)v5));
    ((org.jsoup.parser.HtmlTreeBuilder)v0).insertOnStackAfter(((org.jsoup.nodes.Element)v3),((org.jsoup.nodes.Element)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "h4";
    Object v2 = "<";
    Object v3 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "1";
    Object v5 = "th";
    Object v6 = ((org.jsoup.nodes.Element)v3).getElementsByAttributeValueContaining(((java.lang.String)v4),((java.lang.String)v5));
    ((org.jsoup.parser.HtmlTreeBuilder)v0).pushActiveFormattingElements(((org.jsoup.nodes.Element)v3));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "oA";
    Object v2 = new org.jsoup.nodes.Attributes();
    Object v3 = new org.jsoup.parser.Token.StartTag(((java.lang.String)v1),((org.jsoup.nodes.Attributes)v2));
    Object v4 = ((org.jsoup.parser.Token.StartTag)v3).toString();
    Object v5 = false;
    Object v6 = ((org.jsoup.parser.HtmlTreeBuilder)v0).insertForm(((org.jsoup.parser.Token.StartTag)v3),(((java.lang.Boolean)v5).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "Vr";
    Object v2 = ((org.jsoup.parser.HtmlTreeBuilder)v0).getActiveFormattingElement(((java.lang.String)v1));
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "h4";
    Object v2 = "<";
    Object v3 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v1),((java.lang.String)v2));
    ((org.jsoup.parser.HtmlTreeBuilder)v0).maybeSetBaseUri(((org.jsoup.nodes.Element)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "oA";
    Object v2 = new org.jsoup.nodes.Attributes();
    Object v3 = new org.jsoup.parser.Token.StartTag(((java.lang.String)v1),((org.jsoup.nodes.Attributes)v2));
    Object v4 = ((org.jsoup.parser.Token.StartTag)v3).toString();
    Object v5 = ((org.jsoup.parser.HtmlTreeBuilder)v0).insertEmpty(((org.jsoup.parser.Token.StartTag)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "body";
    Object v2 = "optgr";
    Object v3 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v4 = java.util.function.Function.identity();
    Object v5 = java.util.Comparator.comparing(((java.util.function.Function)v4));
    ((java.util.ArrayList)v3).sort(((java.util.Comparator)v5));
    Object v6 = null;
    Object v7 = ((org.jsoup.parser.HtmlTreeBuilder)v0).parse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v3));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = new java.lang.String[]{};
    ((org.jsoup.parser.HtmlTreeBuilder)v0).popStackToClose(((java.lang.String[])v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v2 = "body";
    Object v3 = "optgr";
    Object v4 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v5 = java.util.function.Function.identity();
    Object v6 = java.util.Comparator.comparing(((java.util.function.Function)v5));
    ((java.util.ArrayList)v4).sort(((java.util.Comparator)v6));
    Object v7 = null;
    Object v8 = ((org.jsoup.parser.HtmlTreeBuilder)v1).parse(((java.lang.String)v2),((java.lang.String)v3),((org.jsoup.parser.ParseErrorList)v4));
    ((org.jsoup.parser.HtmlTreeBuilder)v0).removeFromActiveFormattingElements(((org.jsoup.nodes.Element)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "4html";
    Object v2 = ((org.jsoup.parser.HtmlTreeBuilder)v0).inSelectScope(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "s";
    Object v2 = new java.lang.String[]{};
    Object v3 = ((org.jsoup.parser.HtmlTreeBuilder)v0).inScope(((java.lang.String)v1),((java.lang.String[])v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "oA";
    Object v2 = new org.jsoup.nodes.Attributes();
    Object v3 = new org.jsoup.parser.Token.StartTag(((java.lang.String)v1),((org.jsoup.nodes.Attributes)v2));
    Object v4 = ((org.jsoup.parser.Token.StartTag)v3).toString();
    Object v5 = ((org.jsoup.parser.HtmlTreeBuilder)v0).insert(((org.jsoup.parser.Token.StartTag)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "b";
    Object v2 = ((org.jsoup.parser.HtmlTreeBuilder)v0).inScope(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "J";
    Object v2 = ((org.jsoup.parser.HtmlTreeBuilder)v0).inSelectScope(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "br";
    ((org.jsoup.parser.HtmlTreeBuilder)v0).popStackToBefore(((java.lang.String)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "tfot";
    ((org.jsoup.parser.HtmlTreeBuilder)v0).popStackToClose(((java.lang.String)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    ((org.jsoup.parser.HtmlTreeBuilder)v0).clearStackToTableBodyContext();
    Object v1 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "oA";
    Object v2 = new org.jsoup.nodes.Attributes();
    Object v3 = new org.jsoup.parser.Token.StartTag(((java.lang.String)v1),((org.jsoup.nodes.Attributes)v2));
    Object v4 = ((org.jsoup.parser.HtmlTreeBuilder)v0).insert(((org.jsoup.parser.Token.StartTag)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "body";
    Object v2 = ((org.jsoup.parser.HtmlTreeBuilder)v0).getFromStack(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "";
    Object v2 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v3 = "body";
    Object v4 = "optgr";
    Object v5 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v6 = java.util.function.Function.identity();
    Object v7 = java.util.Comparator.comparing(((java.util.function.Function)v6));
    ((java.util.ArrayList)v5).sort(((java.util.Comparator)v7));
    Object v8 = null;
    Object v9 = ((org.jsoup.parser.HtmlTreeBuilder)v2).parse(((java.lang.String)v3),((java.lang.String)v4),((org.jsoup.parser.ParseErrorList)v5));
    Object v10 = "html";
    Object v11 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v12 = ((org.jsoup.parser.HtmlTreeBuilder)v0).parseFragment(((java.lang.String)v1),((org.jsoup.nodes.Element)v9),((java.lang.String)v10),((org.jsoup.parser.ParseErrorList)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v2 = "body";
    Object v3 = "optgr";
    Object v4 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v5 = java.util.function.Function.identity();
    Object v6 = java.util.Comparator.comparing(((java.util.function.Function)v5));
    ((java.util.ArrayList)v4).sort(((java.util.Comparator)v6));
    Object v7 = null;
    Object v8 = ((org.jsoup.parser.HtmlTreeBuilder)v1).parse(((java.lang.String)v2),((java.lang.String)v3),((org.jsoup.parser.ParseErrorList)v4));
    Object v9 = "html";
    Object v10 = ((org.jsoup.nodes.Element)v8).appendElement(((java.lang.String)v9));
    Object v11 = ((org.jsoup.parser.HtmlTreeBuilder)v0).isSpecial(((org.jsoup.nodes.Element)v8));
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v2 = "body";
    Object v3 = "optgr";
    Object v4 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v5 = java.util.function.Function.identity();
    Object v6 = java.util.Comparator.comparing(((java.util.function.Function)v5));
    ((java.util.ArrayList)v4).sort(((java.util.Comparator)v6));
    Object v7 = null;
    Object v8 = ((org.jsoup.parser.HtmlTreeBuilder)v1).parse(((java.lang.String)v2),((java.lang.String)v3),((org.jsoup.parser.ParseErrorList)v4));
    ((org.jsoup.parser.HtmlTreeBuilder)v0).maybeSetBaseUri(((org.jsoup.nodes.Element)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v2 = "body";
    Object v3 = "optgr";
    Object v4 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v5 = java.util.function.Function.identity();
    Object v6 = java.util.Comparator.comparing(((java.util.function.Function)v5));
    ((java.util.ArrayList)v4).sort(((java.util.Comparator)v6));
    Object v7 = null;
    Object v8 = ((org.jsoup.parser.HtmlTreeBuilder)v1).parse(((java.lang.String)v2),((java.lang.String)v3),((org.jsoup.parser.ParseErrorList)v4));
    ((org.jsoup.parser.HtmlTreeBuilder)v0).pushActiveFormattingElements(((org.jsoup.nodes.Element)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "caption";
    Object v2 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v3 = "body";
    Object v4 = "optgr";
    Object v5 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v6 = java.util.function.Function.identity();
    Object v7 = java.util.Comparator.comparing(((java.util.function.Function)v6));
    ((java.util.ArrayList)v5).sort(((java.util.Comparator)v7));
    Object v8 = null;
    Object v9 = ((org.jsoup.parser.HtmlTreeBuilder)v2).parse(((java.lang.String)v3),((java.lang.String)v4),((org.jsoup.parser.ParseErrorList)v5));
    Object v10 = ":root";
    Object v11 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v12 = ((org.jsoup.parser.HtmlTreeBuilder)v0).parseFragment(((java.lang.String)v1),((org.jsoup.nodes.Element)v9),((java.lang.String)v10),((org.jsoup.parser.ParseErrorList)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "";
    Object v2 = ((org.jsoup.parser.HtmlTreeBuilder)v0).getActiveFormattingElement(((java.lang.String)v1));
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "p";
    ((org.jsoup.parser.HtmlTreeBuilder)v0).popStackToBefore(((java.lang.String)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "t~";
    Object v2 = new org.jsoup.parser.Token.Character(((java.lang.String)v1));
    Object v3 = ((org.jsoup.parser.HtmlTreeBuilder)v0).process(((org.jsoup.parser.Token)v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v2 = "body";
    Object v3 = "optgr";
    Object v4 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v5 = java.util.function.Function.identity();
    Object v6 = java.util.Comparator.comparing(((java.util.function.Function)v5));
    ((java.util.ArrayList)v4).sort(((java.util.Comparator)v6));
    Object v7 = null;
    Object v8 = ((org.jsoup.parser.HtmlTreeBuilder)v1).parse(((java.lang.String)v2),((java.lang.String)v3),((org.jsoup.parser.ParseErrorList)v4));
    ((org.jsoup.parser.HtmlTreeBuilder)v0).setHeadElement(((org.jsoup.nodes.Element)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = org.jsoup.parser.HtmlTreeBuilderState.InSelectInTable;
    ((org.jsoup.parser.HtmlTreeBuilder)v0).error(((org.jsoup.parser.HtmlTreeBuilderState)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v2 = "body";
    Object v3 = "optgr";
    Object v4 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v5 = java.util.function.Function.identity();
    Object v6 = java.util.Comparator.comparing(((java.util.function.Function)v5));
    ((java.util.ArrayList)v4).sort(((java.util.Comparator)v6));
    Object v7 = null;
    Object v8 = ((org.jsoup.parser.HtmlTreeBuilder)v1).parse(((java.lang.String)v2),((java.lang.String)v3),((org.jsoup.parser.ParseErrorList)v4));
    Object v9 = ((org.jsoup.parser.HtmlTreeBuilder)v0).removeFromStack(((org.jsoup.nodes.Element)v8));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    ((org.jsoup.parser.HtmlTreeBuilder)v0).reconstructFormattingElements();
    Object v1 = null;
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "html";
    Object v2 = ((org.jsoup.parser.HtmlTreeBuilder)v0).getActiveFormattingElement(((java.lang.String)v1));
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    ((org.jsoup.parser.HtmlTreeBuilder)v0).resetInsertionMode();
    Object v1 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = new java.lang.String[]{"col","htm"};
    ((org.jsoup.parser.HtmlTreeBuilder)v0).popStackToClose(((java.lang.String[])v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = ((org.jsoup.parser.HtmlTreeBuilder)v0).pop();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "ht4ml";
    ((org.jsoup.parser.HtmlTreeBuilder)v0).generateImpliedEndTags(((java.lang.String)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v2 = "body";
    Object v3 = "optgr";
    Object v4 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v5 = java.util.function.Function.identity();
    Object v6 = java.util.Comparator.comparing(((java.util.function.Function)v5));
    ((java.util.ArrayList)v4).sort(((java.util.Comparator)v6));
    Object v7 = null;
    Object v8 = ((org.jsoup.parser.HtmlTreeBuilder)v1).parse(((java.lang.String)v2),((java.lang.String)v3),((org.jsoup.parser.ParseErrorList)v4));
    ((org.jsoup.parser.HtmlTreeBuilder)v0).insertInFosterParent(((org.jsoup.nodes.Node)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "tr";
    Object v2 = ((org.jsoup.parser.HtmlTreeBuilder)v0).getFromStack(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = org.jsoup.parser.HtmlTreeBuilderState.InTable;
    ((org.jsoup.parser.HtmlTreeBuilder)v0).error(((org.jsoup.parser.HtmlTreeBuilderState)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = ((org.jsoup.parser.HtmlTreeBuilder)v0).isFosterInserts();
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v2 = "body";
    Object v3 = "optgr";
    Object v4 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v5 = java.util.function.Function.identity();
    Object v6 = java.util.Comparator.comparing(((java.util.function.Function)v5));
    ((java.util.ArrayList)v4).sort(((java.util.Comparator)v6));
    Object v7 = null;
    Object v8 = ((org.jsoup.parser.HtmlTreeBuilder)v1).parse(((java.lang.String)v2),((java.lang.String)v3),((org.jsoup.parser.ParseErrorList)v4));
    ((org.jsoup.parser.HtmlTreeBuilder)v0).insert(((org.jsoup.nodes.Element)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = ((org.jsoup.parser.HtmlTreeBuilder)v0).getStack();
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v2 = "body";
    Object v3 = "optgr";
    Object v4 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v5 = java.util.function.Function.identity();
    Object v6 = java.util.Comparator.comparing(((java.util.function.Function)v5));
    ((java.util.ArrayList)v4).sort(((java.util.Comparator)v6));
    Object v7 = null;
    Object v8 = ((org.jsoup.parser.HtmlTreeBuilder)v1).parse(((java.lang.String)v2),((java.lang.String)v3),((org.jsoup.parser.ParseErrorList)v4));
    Object v9 = ((org.jsoup.parser.HtmlTreeBuilder)v0).onStack(((org.jsoup.nodes.Element)v8));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v2 = "body";
    Object v3 = "optgr";
    Object v4 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v5 = java.util.function.Function.identity();
    Object v6 = java.util.Comparator.comparing(((java.util.function.Function)v5));
    ((java.util.ArrayList)v4).sort(((java.util.Comparator)v6));
    Object v7 = null;
    Object v8 = ((org.jsoup.parser.HtmlTreeBuilder)v1).parse(((java.lang.String)v2),((java.lang.String)v3),((org.jsoup.parser.ParseErrorList)v4));
    Object v9 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v10 = "body";
    Object v11 = "optgr";
    Object v12 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v13 = java.util.function.Function.identity();
    Object v14 = java.util.Comparator.comparing(((java.util.function.Function)v13));
    ((java.util.ArrayList)v12).sort(((java.util.Comparator)v14));
    Object v15 = null;
    Object v16 = ((org.jsoup.parser.HtmlTreeBuilder)v9).parse(((java.lang.String)v10),((java.lang.String)v11),((org.jsoup.parser.ParseErrorList)v12));
    ((org.jsoup.parser.HtmlTreeBuilder)v0).insertOnStackAfter(((org.jsoup.nodes.Element)v8),((org.jsoup.nodes.Element)v16));
    Object v17 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = ((org.jsoup.parser.HtmlTreeBuilder)v0).isFragmentParsing();
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "cit]";
    ((org.jsoup.parser.HtmlTreeBuilder)v0).popStackToBefore(((java.lang.String)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v2 = "body";
    Object v3 = "optgr";
    Object v4 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v5 = java.util.function.Function.identity();
    Object v6 = java.util.Comparator.comparing(((java.util.function.Function)v5));
    ((java.util.ArrayList)v4).sort(((java.util.Comparator)v6));
    Object v7 = null;
    Object v8 = ((org.jsoup.parser.HtmlTreeBuilder)v1).parse(((java.lang.String)v2),((java.lang.String)v3),((org.jsoup.parser.ParseErrorList)v4));
    Object v9 = ((org.jsoup.parser.HtmlTreeBuilder)v0).isSpecial(((org.jsoup.nodes.Element)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "bod";
    Object v2 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v3 = "body";
    Object v4 = "optgr";
    Object v5 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v6 = java.util.function.Function.identity();
    Object v7 = java.util.Comparator.comparing(((java.util.function.Function)v6));
    ((java.util.ArrayList)v5).sort(((java.util.Comparator)v7));
    Object v8 = null;
    Object v9 = ((org.jsoup.parser.HtmlTreeBuilder)v2).parse(((java.lang.String)v3),((java.lang.String)v4),((org.jsoup.parser.ParseErrorList)v5));
    Object v10 = "tfoot";
    Object v11 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v12 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v13 = ((java.util.ArrayList)v11).removeAll(((java.util.Collection)v12));
    Object v14 = ((org.jsoup.parser.HtmlTreeBuilder)v0).parseFragment(((java.lang.String)v1),((org.jsoup.nodes.Element)v9),((java.lang.String)v10),((org.jsoup.parser.ParseErrorList)v11));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "oA";
    Object v2 = new org.jsoup.nodes.Attributes();
    Object v3 = new org.jsoup.parser.Token.StartTag(((java.lang.String)v1),((org.jsoup.nodes.Attributes)v2));
    Object v4 = ((org.jsoup.parser.HtmlTreeBuilder)v0).insertEmpty(((org.jsoup.parser.Token.StartTag)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "oFtgroup";
    ((org.jsoup.parser.HtmlTreeBuilder)v0).generateImpliedEndTags(((java.lang.String)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "td";
    ((org.jsoup.parser.HtmlTreeBuilder)v0).popStackToBefore(((java.lang.String)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v2 = "body";
    Object v3 = "optgr";
    Object v4 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v5 = java.util.function.Function.identity();
    Object v6 = java.util.Comparator.comparing(((java.util.function.Function)v5));
    ((java.util.ArrayList)v4).sort(((java.util.Comparator)v6));
    Object v7 = null;
    Object v8 = ((org.jsoup.parser.HtmlTreeBuilder)v1).parse(((java.lang.String)v2),((java.lang.String)v3),((org.jsoup.parser.ParseErrorList)v4));
    Object v9 = ((org.jsoup.nodes.Node)v8).nextSibling();
    Object v10 = ((org.jsoup.parser.HtmlTreeBuilder)v0).aboveOnStack(((org.jsoup.nodes.Element)v8));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = false;
    ((org.jsoup.parser.HtmlTreeBuilder)v0).framesetOk((((java.lang.Boolean)v1).booleanValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "html";
    Object v2 = ((org.jsoup.parser.HtmlTreeBuilder)v0).inListItemScope(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = new java.lang.String[]{};
    Object v2 = ((org.jsoup.parser.HtmlTreeBuilder)v0).inScope(((java.lang.String[])v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "oA";
    Object v2 = new org.jsoup.nodes.Attributes();
    Object v3 = new org.jsoup.parser.Token.StartTag(((java.lang.String)v1),((org.jsoup.nodes.Attributes)v2));
    Object v4 = org.jsoup.parser.HtmlTreeBuilderState.Initial;
    Object v5 = ((org.jsoup.parser.HtmlTreeBuilder)v0).process(((org.jsoup.parser.Token)v3),((org.jsoup.parser.HtmlTreeBuilderState)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "td";
    Object v2 = "tit";
    Object v3 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v4 = ((org.jsoup.parser.HtmlTreeBuilder)v0).parse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "oA";
    Object v2 = new org.jsoup.nodes.Attributes();
    Object v3 = new org.jsoup.parser.Token.StartTag(((java.lang.String)v1),((org.jsoup.nodes.Attributes)v2));
    Object v4 = false;
    Object v5 = ((org.jsoup.parser.HtmlTreeBuilder)v0).insertForm(((org.jsoup.parser.Token.StartTag)v3),(((java.lang.Boolean)v4).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "tfoot";
    ((org.jsoup.parser.HtmlTreeBuilder)v0).popStackToClose(((java.lang.String)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = ((org.jsoup.parser.HtmlTreeBuilder)v0).framesetOk();
    org.junit.Assert.assertEquals((Object)(true), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = ((org.jsoup.parser.HtmlTreeBuilder)v0).getDocument();
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v2 = "td";
    Object v3 = "tit";
    Object v4 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v5 = ((org.jsoup.parser.HtmlTreeBuilder)v1).parse(((java.lang.String)v2),((java.lang.String)v3),((org.jsoup.parser.ParseErrorList)v4));
    ((org.jsoup.parser.HtmlTreeBuilder)v0).setHeadElement(((org.jsoup.nodes.Element)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v2 = "td";
    Object v3 = "tit";
    Object v4 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v5 = ((org.jsoup.parser.HtmlTreeBuilder)v1).parse(((java.lang.String)v2),((java.lang.String)v3),((org.jsoup.parser.ParseErrorList)v4));
    Object v6 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v7 = "body";
    Object v8 = "optgr";
    Object v9 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v10 = java.util.function.Function.identity();
    Object v11 = java.util.Comparator.comparing(((java.util.function.Function)v10));
    ((java.util.ArrayList)v9).sort(((java.util.Comparator)v11));
    Object v12 = null;
    Object v13 = ((org.jsoup.parser.HtmlTreeBuilder)v6).parse(((java.lang.String)v7),((java.lang.String)v8),((org.jsoup.parser.ParseErrorList)v9));
    ((org.jsoup.parser.HtmlTreeBuilder)v0).insertOnStackAfter(((org.jsoup.nodes.Element)v5),((org.jsoup.nodes.Element)v13));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "htmG";
    Object v2 = ((org.jsoup.parser.HtmlTreeBuilder)v0).getActiveFormattingElement(((java.lang.String)v1));
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "SSTEM";
    Object v2 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v1));
    Object v3 = "";
    Object v4 = new org.jsoup.nodes.Attributes();
    Object v5 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v2),((java.lang.String)v3),((org.jsoup.nodes.Attributes)v4));
    ((org.jsoup.parser.HtmlTreeBuilder)v0).setFormElement(((org.jsoup.nodes.FormElement)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    ((org.jsoup.parser.HtmlTreeBuilder)v0).clearStackToTableRowContext();
    Object v1 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    ((org.jsoup.parser.HtmlTreeBuilder)v0).generateImpliedEndTags();
    Object v1 = null;
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "SSTEM";
    Object v2 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v1));
    Object v3 = "";
    Object v4 = new org.jsoup.nodes.Attributes();
    Object v5 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v2),((java.lang.String)v3),((org.jsoup.nodes.Attributes)v4));
    ((org.jsoup.parser.HtmlTreeBuilder)v0).setHeadElement(((org.jsoup.nodes.Element)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "<";
    Object v2 = new java.lang.String[]{"","colspan"};
    Object v3 = ((org.jsoup.parser.HtmlTreeBuilder)v0).inScope(((java.lang.String)v1),((java.lang.String[])v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "SSTEM";
    Object v2 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v1));
    Object v3 = "";
    Object v4 = new org.jsoup.nodes.Attributes();
    Object v5 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v2),((java.lang.String)v3),((org.jsoup.nodes.Attributes)v4));
    Object v6 = ((org.jsoup.parser.HtmlTreeBuilder)v0).removeFromStack(((org.jsoup.nodes.Element)v5));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "SSTEM";
    Object v2 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v1));
    Object v3 = "";
    Object v4 = new org.jsoup.nodes.Attributes();
    Object v5 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v2),((java.lang.String)v3),((org.jsoup.nodes.Attributes)v4));
    ((org.jsoup.parser.HtmlTreeBuilder)v0).insertInFosterParent(((org.jsoup.nodes.Node)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = org.jsoup.parser.HtmlTreeBuilderState.InHeadNoscript;
    ((org.jsoup.parser.HtmlTreeBuilder)v0).error(((org.jsoup.parser.HtmlTreeBuilderState)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "htrml";
    Object v2 = ((org.jsoup.parser.HtmlTreeBuilder)v0).getActiveFormattingElement(((java.lang.String)v1));
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "noframe+";
    Object v2 = ((org.jsoup.parser.HtmlTreeBuilder)v0).getActiveFormattingElement(((java.lang.String)v1));
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "oA";
    Object v2 = new org.jsoup.nodes.Attributes();
    Object v3 = new org.jsoup.parser.Token.StartTag(((java.lang.String)v1),((org.jsoup.nodes.Attributes)v2));
    Object v4 = true;
    Object v5 = ((org.jsoup.parser.HtmlTreeBuilder)v0).insertForm(((org.jsoup.parser.Token.StartTag)v3),(((java.lang.Boolean)v4).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "SSTEM";
    Object v2 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v1));
    Object v3 = "";
    Object v4 = new org.jsoup.nodes.Attributes();
    Object v5 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v2),((java.lang.String)v3),((org.jsoup.nodes.Attributes)v4));
    Object v6 = ((org.jsoup.parser.HtmlTreeBuilder)v0).aboveOnStack(((org.jsoup.nodes.Element)v5));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "SSTEM";
    Object v2 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v1));
    Object v3 = "";
    Object v4 = new org.jsoup.nodes.Attributes();
    Object v5 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v2),((java.lang.String)v3),((org.jsoup.nodes.Attributes)v4));
    Object v6 = "https";
    Object v7 = java.util.regex.Pattern.compile(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Element)v5).getElementsMatchingOwnText(((java.util.regex.Pattern)v7));
    Object v9 = ((org.jsoup.parser.HtmlTreeBuilder)v0).onStack(((org.jsoup.nodes.Element)v5));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v2 = "td";
    Object v3 = "tit";
    Object v4 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v5 = ((org.jsoup.parser.HtmlTreeBuilder)v1).parse(((java.lang.String)v2),((java.lang.String)v3),((org.jsoup.parser.ParseErrorList)v4));
    Object v6 = "SSTEM";
    Object v7 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v6));
    Object v8 = "";
    Object v9 = new org.jsoup.nodes.Attributes();
    Object v10 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v7),((java.lang.String)v8),((org.jsoup.nodes.Attributes)v9));
    ((org.jsoup.parser.HtmlTreeBuilder)v0).replaceActiveFormattingElement(((org.jsoup.nodes.Element)v5),((org.jsoup.nodes.Element)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "\"";
    Object v2 = ((org.jsoup.parser.HtmlTreeBuilder)v0).insert(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = org.jsoup.parser.HtmlTreeBuilderState.Text;
    ((org.jsoup.parser.HtmlTreeBuilder)v0).transition(((org.jsoup.parser.HtmlTreeBuilderState)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = true;
    ((org.jsoup.parser.HtmlTreeBuilder)v0).setFosterInserts((((java.lang.Boolean)v1).booleanValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "details";
    Object v2 = ((org.jsoup.parser.HtmlTreeBuilder)v0).inScope(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "thead";
    ((org.jsoup.parser.HtmlTreeBuilder)v0).popStackToBefore(((java.lang.String)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "*=";
    ((org.jsoup.parser.HtmlTreeBuilder)v0).popStackToBefore(((java.lang.String)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = org.jsoup.parser.ParseErrorList.noTracking();
    ((org.jsoup.parser.HtmlTreeBuilder)v0).setPendingTableCharacters(((java.util.List)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "noframes";
    Object v2 = ((org.jsoup.parser.HtmlTreeBuilder)v0).getFromStack(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "option";
    Object v2 = ((org.jsoup.parser.HtmlTreeBuilder)v0).inButtonScope(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v2 = "body";
    Object v3 = "optgr";
    Object v4 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v5 = java.util.function.Function.identity();
    Object v6 = java.util.Comparator.comparing(((java.util.function.Function)v5));
    ((java.util.ArrayList)v4).sort(((java.util.Comparator)v6));
    Object v7 = null;
    Object v8 = ((org.jsoup.parser.HtmlTreeBuilder)v1).parse(((java.lang.String)v2),((java.lang.String)v3),((org.jsoup.parser.ParseErrorList)v4));
    Object v9 = ((org.jsoup.nodes.Element)v8).classNames();
    ((org.jsoup.parser.HtmlTreeBuilder)v0).insert(((org.jsoup.nodes.Element)v8));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = new java.lang.String[]{""};
    Object v2 = ((org.jsoup.parser.HtmlTreeBuilder)v0).inScope(((java.lang.String[])v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "able";
    ((org.jsoup.parser.HtmlTreeBuilder)v0).generateImpliedEndTags(((java.lang.String)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = ":last-child";
    Object v2 = ((org.jsoup.parser.HtmlTreeBuilder)v0).getFromStack(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = new org.jsoup.parser.Token.Comment();
    ((org.jsoup.parser.HtmlTreeBuilder)v0).insert(((org.jsoup.parser.Token.Comment)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }
}
