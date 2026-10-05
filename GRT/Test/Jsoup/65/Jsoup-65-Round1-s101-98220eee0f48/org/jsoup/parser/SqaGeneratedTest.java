package org.jsoup.parser;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "";
    ((org.jsoup.parser.HtmlTreeBuilder)v0).popStackToClose(((java.lang.String)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    ((org.jsoup.parser.HtmlTreeBuilder)v0).reconstructFormattingElements();
    Object v1 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "htmS";
    Object v2 = "bri";
    Object v3 = org.jsoup.parser.Parser.parseBodyFragmentRelaxed(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "htmS";
    Object v5 = "bri";
    Object v6 = org.jsoup.parser.Parser.parseBodyFragmentRelaxed(((java.lang.String)v4),((java.lang.String)v5));
    ((org.jsoup.parser.HtmlTreeBuilder)v0).insertOnStackAfter(((org.jsoup.nodes.Element)v3),((org.jsoup.nodes.Element)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "";
    Object v2 = ((org.jsoup.parser.HtmlTreeBuilder)v0).getActiveFormattingElement(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "htmS";
    Object v2 = "bri";
    Object v3 = org.jsoup.parser.Parser.parseBodyFragmentRelaxed(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "td";
    Object v5 = ((org.jsoup.nodes.Node)v3).hasAttr(((java.lang.String)v4));
    ((org.jsoup.parser.HtmlTreeBuilder)v0).insertInFosterParent(((org.jsoup.nodes.Node)v3));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "htmS";
    Object v2 = "bri";
    Object v3 = org.jsoup.parser.Parser.parseBodyFragmentRelaxed(((java.lang.String)v1),((java.lang.String)v2));
    ((org.jsoup.parser.HtmlTreeBuilder)v0).push(((org.jsoup.nodes.Element)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "xp";
    Object v2 = ((org.jsoup.parser.HtmlTreeBuilder)v0).getActiveFormattingElement(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = org.jsoup.parser.HtmlTreeBuilderState.AfterHead;
    ((org.jsoup.parser.HtmlTreeBuilder)v0).error(((org.jsoup.parser.HtmlTreeBuilderState)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = ((org.jsoup.parser.HtmlTreeBuilder)v0).pop();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    ((org.jsoup.parser.HtmlTreeBuilder)v0).clearStackToTableRowContext();
    Object v1 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "htmS";
    Object v2 = "bri";
    Object v3 = org.jsoup.parser.Parser.parseBodyFragmentRelaxed(((java.lang.String)v1),((java.lang.String)v2));
    ((org.jsoup.parser.HtmlTreeBuilder)v0).maybeSetBaseUri(((org.jsoup.nodes.Element)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "optio!";
    Object v2 = ((org.jsoup.parser.HtmlTreeBuilder)v0).getFromStack(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = new org.jsoup.parser.Token.StartTag();
    Object v2 = ((org.jsoup.parser.HtmlTreeBuilder)v0).insert(((org.jsoup.parser.Token.StartTag)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = new org.jsoup.parser.Token.StartTag();
    Object v2 = false;
    Object v3 = ((org.jsoup.parser.HtmlTreeBuilder)v0).insertForm(((org.jsoup.parser.Token.StartTag)v1),(((java.lang.Boolean)v2).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "html";
    ((org.jsoup.parser.HtmlTreeBuilder)v0).popStackToBefore(((java.lang.String)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = new org.jsoup.parser.Token.Character();
    ((org.jsoup.parser.HtmlTreeBuilder)v0).insert(((org.jsoup.parser.Token.Character)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = ((org.jsoup.parser.HtmlTreeBuilder)v0).lastFormattingElement();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "htmS";
    Object v2 = "bri";
    Object v3 = org.jsoup.parser.Parser.parseBodyFragmentRelaxed(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((org.jsoup.parser.HtmlTreeBuilder)v0).onStack(((org.jsoup.nodes.Element)v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "htmS";
    Object v2 = "bri";
    Object v3 = org.jsoup.parser.Parser.parseBodyFragmentRelaxed(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((org.jsoup.parser.HtmlTreeBuilder)v0).removeFromStack(((org.jsoup.nodes.Element)v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "";
    ((org.jsoup.parser.HtmlTreeBuilder)v0).generateImpliedEndTags(((java.lang.String)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "dat-";
    ((org.jsoup.parser.HtmlTreeBuilder)v0).popStackToBefore(((java.lang.String)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "htmS";
    Object v2 = "bri";
    Object v3 = org.jsoup.parser.Parser.parseBodyFragmentRelaxed(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "colgroup";
    Object v5 = "hezd";
    Object v6 = ((org.jsoup.nodes.Element)v3).getElementsByAttributeValueNot(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((org.jsoup.parser.HtmlTreeBuilder)v0).onStack(((org.jsoup.nodes.Element)v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "htmS";
    Object v2 = "bri";
    Object v3 = org.jsoup.parser.Parser.parseBodyFragmentRelaxed(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "--";
    Object v5 = ((org.jsoup.nodes.Element)v3).getElementById(((java.lang.String)v4));
    ((org.jsoup.parser.HtmlTreeBuilder)v0).pushActiveFormattingElements(((org.jsoup.nodes.Element)v3));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = new java.lang.String[]{"",""};
    ((org.jsoup.parser.HtmlTreeBuilder)v0).popStackToClose(((java.lang.String[])v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = ((org.jsoup.parser.HtmlTreeBuilder)v0).getFormElement();
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "htmS";
    Object v2 = "bri";
    Object v3 = org.jsoup.parser.Parser.parseBodyFragmentRelaxed(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((org.jsoup.parser.HtmlTreeBuilder)v0).aboveOnStack(((org.jsoup.nodes.Element)v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "htmS";
    Object v2 = "bri";
    Object v3 = org.jsoup.parser.Parser.parseBodyFragmentRelaxed(((java.lang.String)v1),((java.lang.String)v2));
    ((org.jsoup.parser.HtmlTreeBuilder)v0).removeFromActiveFormattingElements(((org.jsoup.nodes.Element)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = ((org.jsoup.parser.HtmlTreeBuilder)v0).isFosterInserts();
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "h*";
    Object v2 = new java.io.StringReader(((java.lang.String)v1));
    Object v3 = "tr";
    Object v4 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v5 = true;
    Object v6 = false;
    Object v7 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()));
    ((org.jsoup.parser.HtmlTreeBuilder)v0).initialiseParse(((java.io.Reader)v2),((java.lang.String)v3),((org.jsoup.parser.ParseErrorList)v4),((org.jsoup.parser.ParseSettings)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    ((org.jsoup.parser.HtmlTreeBuilder)v0).clearFormattingElementsToLastMarker();
    Object v1 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "htmS";
    Object v2 = "bri";
    Object v3 = org.jsoup.parser.Parser.parseBodyFragmentRelaxed(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((org.jsoup.parser.HtmlTreeBuilder)v0).isInActiveFormattingElements(((org.jsoup.nodes.Element)v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "nput";
    Object v2 = ((org.jsoup.parser.HtmlTreeBuilder)v0).inSelectScope(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = new java.lang.String[]{"small","html","t$oot"};
    ((org.jsoup.parser.HtmlTreeBuilder)v0).popStackToClose(((java.lang.String[])v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "textrea";
    Object v2 = "htmS";
    Object v3 = "bri";
    Object v4 = org.jsoup.parser.Parser.parseBodyFragmentRelaxed(((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Node)v4).outerHtml();
    Object v6 = "caption";
    Object v7 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v8 = ((java.util.Collection)v7).parallelStream();
    Object v9 = true;
    Object v10 = false;
    Object v11 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v9).booleanValue()),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = ((org.jsoup.parser.HtmlTreeBuilder)v0).parseFragment(((java.lang.String)v1),((org.jsoup.nodes.Element)v4),((java.lang.String)v6),((org.jsoup.parser.ParseErrorList)v7),((org.jsoup.parser.ParseSettings)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    ((org.jsoup.parser.HtmlTreeBuilder)v0).clearStackToTableContext();
    Object v1 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    ((org.jsoup.parser.HtmlTreeBuilder)v0).resetInsertionMode();
    Object v1 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "htmS";
    Object v2 = "bri";
    Object v3 = org.jsoup.parser.Parser.parseBodyFragmentRelaxed(((java.lang.String)v1),((java.lang.String)v2));
    ((org.jsoup.parser.HtmlTreeBuilder)v0).insertInFosterParent(((org.jsoup.nodes.Node)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = ((org.jsoup.parser.HtmlTreeBuilder)v0).removeLastFormattingElement();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "small";
    ((org.jsoup.parser.HtmlTreeBuilder)v0).popStackToClose(((java.lang.String)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "htmS";
    Object v2 = "bri";
    Object v3 = org.jsoup.parser.Parser.parseBodyFragmentRelaxed(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v3).hasText();
    Object v5 = ((org.jsoup.parser.HtmlTreeBuilder)v0).aboveOnStack(((org.jsoup.nodes.Element)v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "thead";
    Object v2 = ((org.jsoup.parser.HtmlTreeBuilder)v0).inListItemScope(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "pre";
    ((org.jsoup.parser.HtmlTreeBuilder)v0).popStackToClose(((java.lang.String)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "";
    Object v2 = ((org.jsoup.parser.HtmlTreeBuilder)v0).getFromStack(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "tbZody";
    Object v2 = ((org.jsoup.parser.HtmlTreeBuilder)v0).inSelectScope(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    ((org.jsoup.parser.HtmlTreeBuilder)v0).newPendingTableCharacters();
    Object v1 = null;
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = new org.jsoup.parser.Token.StartTag();
    Object v2 = ((org.jsoup.parser.HtmlTreeBuilder)v0).insertEmpty(((org.jsoup.parser.Token.StartTag)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "th";
    ((org.jsoup.parser.HtmlTreeBuilder)v0).popStackToBefore(((java.lang.String)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "htmS";
    Object v2 = "bri";
    Object v3 = org.jsoup.parser.Parser.parseBodyFragmentRelaxed(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "htmS";
    Object v5 = "bri";
    Object v6 = org.jsoup.parser.Parser.parseBodyFragmentRelaxed(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = "table";
    Object v8 = ((org.jsoup.nodes.Element)v6).getElementsMatchingText(((java.lang.String)v7));
    ((org.jsoup.parser.HtmlTreeBuilder)v0).replaceActiveFormattingElement(((org.jsoup.nodes.Element)v3),((org.jsoup.nodes.Element)v6));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "<";
    ((org.jsoup.parser.HtmlTreeBuilder)v0).generateImpliedEndTags(((java.lang.String)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "=\"";
    Object v2 = ((org.jsoup.parser.HtmlTreeBuilder)v0).inButtonScope(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "Data ke";
    Object v2 = new java.lang.String[]{"colgroup","optgrou6p","tabl\""};
    Object v3 = ((org.jsoup.parser.HtmlTreeBuilder)v0).inScope(((java.lang.String)v1),((java.lang.String[])v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = ((org.jsoup.parser.HtmlTreeBuilder)v0).getDocument();
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = new java.lang.String[]{};
    ((org.jsoup.parser.HtmlTreeBuilder)v0).popStackToClose(((java.lang.String[])v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = new java.lang.String[]{""};
    ((org.jsoup.parser.HtmlTreeBuilder)v0).popStackToClose(((java.lang.String[])v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "i";
    ((org.jsoup.parser.HtmlTreeBuilder)v0).popStackToBefore(((java.lang.String)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "html";
    Object v2 = ((org.jsoup.parser.HtmlTreeBuilder)v0).getFromStack(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "a";
    ((org.jsoup.parser.HtmlTreeBuilder)v0).popStackToBefore(((java.lang.String)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "thad";
    Object v2 = ((org.jsoup.parser.HtmlTreeBuilder)v0).getFromStack(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = new org.jsoup.parser.Token.Comment();
    ((org.jsoup.parser.HtmlTreeBuilder)v0).insert(((org.jsoup.parser.Token.Comment)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = ((org.jsoup.parser.HtmlTreeBuilder)v0).state();
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "L";
    Object v2 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v1));
    Object v3 = ":empty";
    Object v4 = new org.jsoup.nodes.Attributes();
    Object v5 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v2),((java.lang.String)v3),((org.jsoup.nodes.Attributes)v4));
    ((org.jsoup.parser.HtmlTreeBuilder)v0).setFormElement(((org.jsoup.nodes.FormElement)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "html";
    ((org.jsoup.parser.HtmlTreeBuilder)v0).generateImpliedEndTags(((java.lang.String)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "L";
    Object v2 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v1));
    Object v3 = ":empty";
    Object v4 = new org.jsoup.nodes.Attributes();
    Object v5 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v2),((java.lang.String)v3),((org.jsoup.nodes.Attributes)v4));
    ((org.jsoup.parser.HtmlTreeBuilder)v0).maybeSetBaseUri(((org.jsoup.nodes.Element)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "L";
    Object v2 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v1));
    Object v3 = ":empty";
    Object v4 = new org.jsoup.nodes.Attributes();
    Object v5 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v2),((java.lang.String)v3),((org.jsoup.nodes.Attributes)v4));
    ((org.jsoup.parser.HtmlTreeBuilder)v0).removeFromActiveFormattingElements(((org.jsoup.nodes.Element)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = " ";
    Object v2 = ((org.jsoup.parser.HtmlTreeBuilder)v0).inButtonScope(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = true;
    ((org.jsoup.parser.HtmlTreeBuilder)v0).setFosterInserts((((java.lang.Boolean)v1).booleanValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = ((org.jsoup.parser.HtmlTreeBuilder)v0).getBaseUri();
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "L";
    Object v2 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v1));
    Object v3 = ":empty";
    Object v4 = new org.jsoup.nodes.Attributes();
    Object v5 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v2),((java.lang.String)v3),((org.jsoup.nodes.Attributes)v4));
    ((org.jsoup.parser.HtmlTreeBuilder)v0).insertInFosterParent(((org.jsoup.nodes.Node)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "L";
    Object v2 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v1));
    Object v3 = ":empty";
    Object v4 = new org.jsoup.nodes.Attributes();
    Object v5 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v2),((java.lang.String)v3),((org.jsoup.nodes.Attributes)v4));
    Object v6 = "noframes";
    Object v7 = "pre";
    Object v8 = ((org.jsoup.nodes.Element)v5).getElementsByAttributeValueStarting(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = ((org.jsoup.parser.HtmlTreeBuilder)v0).aboveOnStack(((org.jsoup.nodes.Element)v5));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = new java.lang.String[]{"h","title"};
    ((org.jsoup.parser.HtmlTreeBuilder)v0).popStackToClose(((java.lang.String[])v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "pT";
    Object v2 = "L";
    Object v3 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v2));
    Object v4 = ":empty";
    Object v5 = new org.jsoup.nodes.Attributes();
    Object v6 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v3),((java.lang.String)v4),((org.jsoup.nodes.Attributes)v5));
    Object v7 = "cQlgroup";
    Object v8 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v9 = true;
    Object v10 = false;
    Object v11 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v9).booleanValue()),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = ((org.jsoup.parser.HtmlTreeBuilder)v0).parseFragment(((java.lang.String)v1),((org.jsoup.nodes.Element)v6),((java.lang.String)v7),((org.jsoup.parser.ParseErrorList)v8),((org.jsoup.parser.ParseSettings)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = org.jsoup.parser.HtmlTreeBuilderState.BeforeHead;
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    ((org.jsoup.parser.HtmlTreeBuilder)v0).error(((org.jsoup.parser.HtmlTreeBuilderState)v1));
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "L";
    Object v2 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v1));
    Object v3 = ":empty";
    Object v4 = new org.jsoup.nodes.Attributes();
    Object v5 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v2),((java.lang.String)v3),((org.jsoup.nodes.Attributes)v4));
    ((org.jsoup.parser.HtmlTreeBuilder)v0).pushActiveFormattingElements(((org.jsoup.nodes.Element)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = new org.jsoup.parser.Token.StartTag();
    Object v2 = ((org.jsoup.parser.HtmlTreeBuilder)v0).process(((org.jsoup.parser.Token)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = org.jsoup.parser.HtmlTreeBuilderState.Text;
    ((org.jsoup.parser.HtmlTreeBuilder)v0).transition(((org.jsoup.parser.HtmlTreeBuilderState)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    ((org.jsoup.parser.HtmlTreeBuilder)v0).generateImpliedEndTags();
    Object v1 = null;
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "title";
    Object v2 = ((org.jsoup.parser.HtmlTreeBuilder)v0).inTableScope(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "title";
    Object v2 = ((org.jsoup.parser.HtmlTreeBuilder)v0).insertStartTag(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = ((org.jsoup.parser.HtmlTreeBuilder)v0).framesetOk();
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "L";
    Object v2 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v1));
    Object v3 = ":empty";
    Object v4 = new org.jsoup.nodes.Attributes();
    Object v5 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v2),((java.lang.String)v3),((org.jsoup.nodes.Attributes)v4));
    Object v6 = "L";
    Object v7 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v6));
    Object v8 = ":empty";
    Object v9 = new org.jsoup.nodes.Attributes();
    Object v10 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v7),((java.lang.String)v8),((org.jsoup.nodes.Attributes)v9));
    ((org.jsoup.parser.HtmlTreeBuilder)v0).insertOnStackAfter(((org.jsoup.nodes.Element)v5),((org.jsoup.nodes.Element)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = org.jsoup.parser.HtmlTreeBuilderState.BeforeHead;
    ((org.jsoup.parser.HtmlTreeBuilder)v0).error(((org.jsoup.parser.HtmlTreeBuilderState)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = new java.lang.String[]{"tkead"};
    ((org.jsoup.parser.HtmlTreeBuilder)v0).popStackToClose(((java.lang.String[])v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "^\\+";
    Object v2 = ((org.jsoup.parser.HtmlTreeBuilder)v0).getActiveFormattingElement(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "<!doctype";
    Object v2 = ((org.jsoup.parser.HtmlTreeBuilder)v0).inSelectScope(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "L";
    Object v2 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v1));
    Object v3 = ":empty";
    Object v4 = new org.jsoup.nodes.Attributes();
    Object v5 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v2),((java.lang.String)v3),((org.jsoup.nodes.Attributes)v4));
    ((org.jsoup.parser.HtmlTreeBuilder)v0).setHeadElement(((org.jsoup.nodes.Element)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "title";
    Object v2 = ((org.jsoup.parser.HtmlTreeBuilder)v0).inSelectScope(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "L";
    Object v2 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v1));
    Object v3 = ":empty";
    Object v4 = new org.jsoup.nodes.Attributes();
    Object v5 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v2),((java.lang.String)v3),((org.jsoup.nodes.Attributes)v4));
    Object v6 = ((org.jsoup.parser.HtmlTreeBuilder)v0).removeFromStack(((org.jsoup.nodes.Element)v5));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "Dp";
    Object v2 = ((org.jsoup.parser.HtmlTreeBuilder)v0).getActiveFormattingElement(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "html";
    Object v2 = ((org.jsoup.parser.HtmlTreeBuilder)v0).insertStartTag(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = ((org.jsoup.parser.HtmlTreeBuilder)v0).defaultSettings();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "t";
    Object v2 = "L";
    Object v3 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v2));
    Object v4 = ":empty";
    Object v5 = new org.jsoup.nodes.Attributes();
    Object v6 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v3),((java.lang.String)v4),((org.jsoup.nodes.Attributes)v5));
    Object v7 = "html";
    Object v8 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v9 = true;
    Object v10 = false;
    Object v11 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v9).booleanValue()),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = ((org.jsoup.parser.HtmlTreeBuilder)v0).parseFragment(((java.lang.String)v1),((org.jsoup.nodes.Element)v6),((java.lang.String)v7),((org.jsoup.parser.ParseErrorList)v8),((org.jsoup.parser.ParseSettings)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "L";
    Object v2 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v1));
    Object v3 = ":empty";
    Object v4 = new org.jsoup.nodes.Attributes();
    Object v5 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v2),((java.lang.String)v3),((org.jsoup.nodes.Attributes)v4));
    Object v6 = "html";
    Object v7 = false;
    Object v8 = ((org.jsoup.nodes.Element)v5).attr(((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    ((org.jsoup.parser.HtmlTreeBuilder)v0).removeFromActiveFormattingElements(((org.jsoup.nodes.Element)v5));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = ((org.jsoup.parser.HtmlTreeBuilder)v0).getStack();
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "thead";
    Object v2 = ((org.jsoup.parser.HtmlTreeBuilder)v0).inSelectScope(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "tr";
    Object v2 = ((org.jsoup.parser.HtmlTreeBuilder)v0).inSelectScope(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = new java.lang.String[]{"html","meta","wbr"};
    Object v2 = ((org.jsoup.parser.HtmlTreeBuilder)v0).inScope(((java.lang.String[])v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "L";
    Object v2 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v1));
    Object v3 = ":empty";
    Object v4 = new org.jsoup.nodes.Attributes();
    Object v5 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v2),((java.lang.String)v3),((org.jsoup.nodes.Attributes)v4));
    Object v6 = ((org.jsoup.parser.HtmlTreeBuilder)v0).isSpecial(((org.jsoup.nodes.Element)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "L";
    Object v2 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v1));
    Object v3 = ":empty";
    Object v4 = new org.jsoup.nodes.Attributes();
    Object v5 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v2),((java.lang.String)v3),((org.jsoup.nodes.Attributes)v4));
    Object v6 = "L";
    Object v7 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v6));
    Object v8 = ":empty";
    Object v9 = new org.jsoup.nodes.Attributes();
    Object v10 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v7),((java.lang.String)v8),((org.jsoup.nodes.Attributes)v9));
    Object v11 = ((org.jsoup.nodes.Element)v10).cssSelector();
    ((org.jsoup.parser.HtmlTreeBuilder)v0).insertOnStackAfter(((org.jsoup.nodes.Element)v5),((org.jsoup.nodes.Element)v10));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "body";
    ((org.jsoup.parser.HtmlTreeBuilder)v0).popStackToBefore(((java.lang.String)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }
}
