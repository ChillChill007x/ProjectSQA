package org.jsoup.parser;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "stle";
    ((org.jsoup.parser.HtmlTreeBuilder)v0).popStackToClose(((java.lang.String)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    ((org.jsoup.parser.HtmlTreeBuilder)v0).reconstructFormattingElements();
    Object v1 = null;
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "Content-TypeK";
    Object v2 = org.jsoup.nodes.Document.createShell(((java.lang.String)v1));
    Object v3 = "Content-TypeK";
    Object v4 = org.jsoup.nodes.Document.createShell(((java.lang.String)v3));
    ((org.jsoup.parser.HtmlTreeBuilder)v0).insertOnStackAfter(((org.jsoup.nodes.Element)v2),((org.jsoup.nodes.Element)v4));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "Content-TypeK";
    Object v2 = org.jsoup.nodes.Document.createShell(((java.lang.String)v1));
    ((org.jsoup.parser.HtmlTreeBuilder)v0).maybeSetBaseUri(((org.jsoup.nodes.Element)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = new org.jsoup.parser.Token.Character();
    ((org.jsoup.parser.HtmlTreeBuilder)v0).insert(((org.jsoup.parser.Token.Character)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "Could not parse nth-index '%s': unexpected format";
    Object v2 = ((org.jsoup.parser.HtmlTreeBuilder)v0).getActiveFormattingElement(((java.lang.String)v1));
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = ((org.jsoup.parser.HtmlTreeBuilder)v0).removeLastFormattingElement();
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = new org.jsoup.parser.Token.StartTag();
    Object v2 = true;
    Object v3 = ((org.jsoup.parser.HtmlTreeBuilder)v0).insertForm(((org.jsoup.parser.Token.StartTag)v1),(((java.lang.Boolean)v2).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "";
    Object v2 = ((org.jsoup.parser.HtmlTreeBuilder)v0).getActiveFormattingElement(((java.lang.String)v1));
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "Content-TypeK";
    Object v2 = org.jsoup.nodes.Document.createShell(((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Element)v2).html();
    Object v4 = ((org.jsoup.parser.HtmlTreeBuilder)v0).aboveOnStack(((org.jsoup.nodes.Element)v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "Content-TypeK";
    Object v2 = org.jsoup.nodes.Document.createShell(((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    ((org.jsoup.parser.HtmlTreeBuilder)v0).insert(((org.jsoup.nodes.Element)v2));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = new org.jsoup.parser.Token.StartTag();
    Object v2 = ((org.jsoup.parser.HtmlTreeBuilder)v0).insert(((org.jsoup.parser.Token.StartTag)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    ((org.jsoup.parser.HtmlTreeBuilder)v0).resetInsertionMode();
    Object v1 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "Content-TypeK";
    Object v2 = org.jsoup.nodes.Document.createShell(((java.lang.String)v1));
    Object v3 = "Content-TypeK";
    Object v4 = org.jsoup.nodes.Document.createShell(((java.lang.String)v3));
    ((org.jsoup.parser.HtmlTreeBuilder)v0).replaceActiveFormattingElement(((org.jsoup.nodes.Element)v2),((org.jsoup.nodes.Element)v4));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = ((org.jsoup.parser.HtmlTreeBuilder)v0).lastFormattingElement();
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "Content-TypeK";
    Object v2 = org.jsoup.nodes.Document.createShell(((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Element)v2).children();
    ((org.jsoup.parser.HtmlTreeBuilder)v0).pushActiveFormattingElements(((org.jsoup.nodes.Element)v2));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "-";
    ((org.jsoup.parser.HtmlTreeBuilder)v0).popStackToBefore(((java.lang.String)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "Content-TypeK";
    Object v2 = org.jsoup.nodes.Document.createShell(((java.lang.String)v1));
    ((org.jsoup.parser.HtmlTreeBuilder)v0).removeFromActiveFormattingElements(((org.jsoup.nodes.Element)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "frameset";
    ((org.jsoup.parser.HtmlTreeBuilder)v0).popStackToClose(((java.lang.String)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = org.jsoup.parser.HtmlTreeBuilderState.AfterAfterBody;
    ((org.jsoup.parser.HtmlTreeBuilder)v0).error(((org.jsoup.parser.HtmlTreeBuilderState)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "br";
    Object v2 = ((org.jsoup.parser.HtmlTreeBuilder)v0).inSelectScope(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "Content-TypeK";
    Object v2 = org.jsoup.nodes.Document.createShell(((java.lang.String)v1));
    Object v3 = ((org.jsoup.parser.HtmlTreeBuilder)v0).removeFromStack(((org.jsoup.nodes.Element)v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "Content-TypeK";
    Object v2 = org.jsoup.nodes.Document.createShell(((java.lang.String)v1));
    ((org.jsoup.parser.HtmlTreeBuilder)v0).push(((org.jsoup.nodes.Element)v2));
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    ((org.jsoup.parser.HtmlTreeBuilder)v0).clearStackToTableContext();
    Object v1 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = ((org.jsoup.parser.HtmlTreeBuilder)v0).toString();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "article";
    ((org.jsoup.parser.HtmlTreeBuilder)v0).generateImpliedEndTags(((java.lang.String)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = ((org.jsoup.parser.HtmlTreeBuilder)v0).getStack();
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "Content-TypeK";
    Object v2 = org.jsoup.nodes.Document.createShell(((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Element)v2).dataset();
    ((org.jsoup.parser.HtmlTreeBuilder)v0).removeFromActiveFormattingElements(((org.jsoup.nodes.Element)v2));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = ((org.jsoup.parser.HtmlTreeBuilder)v0).state();
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = ((org.jsoup.parser.HtmlTreeBuilder)v0).isFragmentParsing();
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "Content-TypeK";
    Object v2 = org.jsoup.nodes.Document.createShell(((java.lang.String)v1));
    ((org.jsoup.parser.HtmlTreeBuilder)v0).setHeadElement(((org.jsoup.nodes.Element)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "tr";
    ((org.jsoup.parser.HtmlTreeBuilder)v0).popStackToBefore(((java.lang.String)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = new java.lang.String[]{"html","body","col"};
    Object v2 = ((org.jsoup.parser.HtmlTreeBuilder)v0).inScope(((java.lang.String[])v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "Content-TypeK";
    Object v2 = org.jsoup.nodes.Document.createShell(((java.lang.String)v1));
    Object v3 = "Kempty";
    Object v4 = ((org.jsoup.nodes.Element)v2).prependText(((java.lang.String)v3));
    Object v5 = ((org.jsoup.parser.HtmlTreeBuilder)v0).removeFromStack(((org.jsoup.nodes.Element)v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = new org.jsoup.parser.Token.StartTag();
    Object v2 = ((org.jsoup.parser.HtmlTreeBuilder)v0).insertEmpty(((org.jsoup.parser.Token.StartTag)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    ((org.jsoup.parser.HtmlTreeBuilder)v0).clearFormattingElementsToLastMarker();
    Object v1 = null;
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "Content-TypeK";
    Object v2 = org.jsoup.nodes.Document.createShell(((java.lang.String)v1));
    ((org.jsoup.parser.HtmlTreeBuilder)v0).insertInFosterParent(((org.jsoup.nodes.Node)v2));
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "thead";
    Object v2 = ((org.jsoup.parser.HtmlTreeBuilder)v0).getFromStack(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = ((org.jsoup.parser.HtmlTreeBuilder)v0).originalState();
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = " ";
    Object v2 = ((org.jsoup.parser.HtmlTreeBuilder)v0).getFromStack(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "pre+";
    Object v2 = "Content-TypeK";
    Object v3 = org.jsoup.nodes.Document.createShell(((java.lang.String)v2));
    Object v4 = "frameset";
    Object v5 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v6 = ((org.jsoup.parser.HtmlTreeBuilder)v0).parseFragment(((java.lang.String)v1),((org.jsoup.nodes.Element)v3),((java.lang.String)v4),((org.jsoup.parser.ParseErrorList)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = org.jsoup.parser.HtmlTreeBuilderState.InTableText;
    ((org.jsoup.parser.HtmlTreeBuilder)v0).error(((org.jsoup.parser.HtmlTreeBuilderState)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "th";
    Object v2 = "Content-TypeK";
    Object v3 = org.jsoup.nodes.Document.createShell(((java.lang.String)v2));
    Object v4 = "body";
    Object v5 = java.util.regex.Pattern.compile(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Element)v3).getElementsMatchingOwnText(((java.util.regex.Pattern)v5));
    Object v7 = "Cookie map must not be null";
    Object v8 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v9 = ((org.jsoup.parser.HtmlTreeBuilder)v0).parseFragment(((java.lang.String)v1),((org.jsoup.nodes.Element)v3),((java.lang.String)v7),((org.jsoup.parser.ParseErrorList)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "cFlgroup";
    ((org.jsoup.parser.HtmlTreeBuilder)v0).generateImpliedEndTags(((java.lang.String)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = new java.lang.String[]{};
    ((org.jsoup.parser.HtmlTreeBuilder)v0).popStackToClose(((java.lang.String[])v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "artiHcle";
    Object v2 = ((org.jsoup.parser.HtmlTreeBuilder)v0).inSelectScope(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "script";
    Object v2 = ((org.jsoup.parser.HtmlTreeBuilder)v0).inListItemScope(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "arek";
    ((org.jsoup.parser.HtmlTreeBuilder)v0).popStackToClose(((java.lang.String)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = ((org.jsoup.parser.HtmlTreeBuilder)v0).framesetOk();
    org.junit.Assert.assertEquals((Object)(true), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = new org.jsoup.parser.Token.Comment();
    ((org.jsoup.parser.HtmlTreeBuilder)v0).insert(((org.jsoup.parser.Token.Comment)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    ((org.jsoup.parser.HtmlTreeBuilder)v0).clearStackToTableBodyContext();
    Object v1 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "html";
    Object v2 = ((org.jsoup.parser.HtmlTreeBuilder)v0).inSelectScope(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "Content-TypeK";
    Object v2 = org.jsoup.nodes.Document.createShell(((java.lang.String)v1));
    ((org.jsoup.parser.HtmlTreeBuilder)v0).pushActiveFormattingElements(((org.jsoup.nodes.Element)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "imo";
    Object v2 = "Content-TypeK";
    Object v3 = org.jsoup.nodes.Document.createShell(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v3).toString();
    Object v5 = "emeta";
    Object v6 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v7 = ((org.jsoup.parser.HtmlTreeBuilder)v0).parseFragment(((java.lang.String)v1),((org.jsoup.nodes.Element)v3),((java.lang.String)v5),((org.jsoup.parser.ParseErrorList)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = org.jsoup.parser.HtmlTreeBuilderState.AfterBody;
    ((org.jsoup.parser.HtmlTreeBuilder)v0).error(((org.jsoup.parser.HtmlTreeBuilderState)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = new java.lang.String[]{"thead",":not","table"};
    ((org.jsoup.parser.HtmlTreeBuilder)v0).popStackToClose(((java.lang.String[])v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "table";
    Object v2 = ((org.jsoup.parser.HtmlTreeBuilder)v0).insertStartTag(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "charset";
    Object v2 = ((org.jsoup.parser.HtmlTreeBuilder)v0).inScope(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = true;
    ((org.jsoup.parser.HtmlTreeBuilder)v0).setFosterInserts((((java.lang.Boolean)v1).booleanValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "{body";
    Object v2 = ((org.jsoup.parser.HtmlTreeBuilder)v0).getFromStack(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "Content-TypeK";
    Object v2 = org.jsoup.nodes.Document.createShell(((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Element)v2).siblingElements();
    ((org.jsoup.parser.HtmlTreeBuilder)v0).maybeSetBaseUri(((org.jsoup.nodes.Element)v2));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    ((org.jsoup.parser.HtmlTreeBuilder)v0).generateImpliedEndTags();
    Object v1 = null;
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = new org.jsoup.parser.Token.Comment();
    Object v2 = ((org.jsoup.parser.HtmlTreeBuilder)v0).process(((org.jsoup.parser.Token)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "Content-TypeK";
    Object v2 = org.jsoup.nodes.Document.createShell(((java.lang.String)v1));
    Object v3 = ((org.jsoup.parser.HtmlTreeBuilder)v0).isSpecial(((org.jsoup.nodes.Element)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = org.jsoup.parser.ParseErrorList.noTracking();
    ((org.jsoup.parser.HtmlTreeBuilder)v0).setPendingTableCharacters(((java.util.List)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "Content-TypeK";
    Object v2 = org.jsoup.nodes.Document.createShell(((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Element)v2).nextElementSibling();
    ((org.jsoup.parser.HtmlTreeBuilder)v0).removeFromActiveFormattingElements(((org.jsoup.nodes.Element)v2));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = new org.jsoup.parser.Token.Character();
    Object v2 = ((org.jsoup.parser.HtmlTreeBuilder)v0).process(((org.jsoup.parser.Token)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "q";
    Object v2 = ((org.jsoup.parser.HtmlTreeBuilder)v0).inTableScope(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "^=";
    ((org.jsoup.parser.HtmlTreeBuilder)v0).popStackToBefore(((java.lang.String)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    ((org.jsoup.parser.HtmlTreeBuilder)v0).insertMarkerToFormattingElements();
    Object v1 = null;
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "tbody";
    Object v2 = ((org.jsoup.parser.HtmlTreeBuilder)v0).getActiveFormattingElement(((java.lang.String)v1));
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "Content-TypeK";
    Object v2 = org.jsoup.nodes.Document.createShell(((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Element)v2).parents();
    Object v4 = ((org.jsoup.parser.HtmlTreeBuilder)v0).aboveOnStack(((org.jsoup.nodes.Element)v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "Content-TypeK";
    Object v2 = org.jsoup.nodes.Document.createShell(((java.lang.String)v1));
    ((org.jsoup.parser.HtmlTreeBuilder)v0).insert(((org.jsoup.nodes.Element)v2));
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = ((org.jsoup.parser.HtmlTreeBuilder)v0).getDocument();
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = new org.jsoup.parser.Token.StartTag();
    Object v2 = false;
    Object v3 = ((org.jsoup.parser.HtmlTreeBuilder)v0).insertForm(((org.jsoup.parser.Token.StartTag)v1),(((java.lang.Boolean)v2).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = ":first-child";
    Object v2 = ((org.jsoup.parser.HtmlTreeBuilder)v0).getFromStack(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "Content-TypeK";
    Object v2 = org.jsoup.nodes.Document.createShell(((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Element)v2).dataset();
    Object v4 = ((org.jsoup.parser.HtmlTreeBuilder)v0).onStack(((org.jsoup.nodes.Element)v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "";
    Object v2 = ((org.jsoup.parser.HtmlTreeBuilder)v0).inButtonScope(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = org.jsoup.parser.HtmlTreeBuilderState.AfterAfterBody;
    Object v2 = ((java.lang.Enum)v1).hashCode();
    ((org.jsoup.parser.HtmlTreeBuilder)v0).transition(((org.jsoup.parser.HtmlTreeBuilderState)v1));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "head";
    Object v2 = "Content-TypeK";
    Object v3 = org.jsoup.nodes.Document.createShell(((java.lang.String)v2));
    Object v4 = "param";
    Object v5 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v6 = ((org.jsoup.parser.HtmlTreeBuilder)v0).parseFragment(((java.lang.String)v1),((org.jsoup.nodes.Element)v3),((java.lang.String)v4),((org.jsoup.parser.ParseErrorList)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "tbody";
    Object v2 = ((org.jsoup.parser.HtmlTreeBuilder)v0).getFromStack(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    ((org.jsoup.parser.HtmlTreeBuilder)v0).markInsertionMode();
    Object v1 = null;
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "";
    ((org.jsoup.parser.HtmlTreeBuilder)v0).popStackToClose(((java.lang.String)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = new java.lang.String[]{};
    Object v2 = ((org.jsoup.parser.HtmlTreeBuilder)v0).inScope(((java.lang.String[])v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = ((org.jsoup.parser.HtmlTreeBuilder)v0).getPendingTableCharacters();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = new java.lang.String[]{"thead","body"};
    ((org.jsoup.parser.HtmlTreeBuilder)v0).popStackToClose(((java.lang.String[])v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "cation";
    Object v2 = ((org.jsoup.parser.HtmlTreeBuilder)v0).inSelectScope(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "html";
    ((org.jsoup.parser.HtmlTreeBuilder)v0).generateImpliedEndTags(((java.lang.String)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "html";
    Object v2 = ((org.jsoup.parser.HtmlTreeBuilder)v0).getActiveFormattingElement(((java.lang.String)v1));
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "Content-TypeK";
    Object v2 = org.jsoup.nodes.Document.createShell(((java.lang.String)v1));
    Object v3 = ((org.jsoup.parser.HtmlTreeBuilder)v0).isInActiveFormattingElements(((org.jsoup.nodes.Element)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = ((org.jsoup.parser.HtmlTreeBuilder)v0).getBaseUri();
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "Content-TypeK";
    Object v2 = org.jsoup.nodes.Document.createShell(((java.lang.String)v1));
    Object v3 = "Content-TypeK";
    Object v4 = org.jsoup.nodes.Document.createShell(((java.lang.String)v3));
    ((org.jsoup.parser.HtmlTreeBuilder)v0).replaceOnStack(((org.jsoup.nodes.Element)v2),((org.jsoup.nodes.Element)v4));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = org.jsoup.parser.HtmlTreeBuilderState.AfterAfterBody;
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    ((org.jsoup.parser.HtmlTreeBuilder)v0).transition(((org.jsoup.parser.HtmlTreeBuilderState)v1));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = ((org.jsoup.parser.HtmlTreeBuilder)v0).getFormElement();
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "caption";
    Object v2 = new java.lang.String[]{};
    Object v3 = ((org.jsoup.parser.HtmlTreeBuilder)v0).inScope(((java.lang.String)v1),((java.lang.String[])v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = new java.lang.String[]{"butto]","co","p"};
    ((org.jsoup.parser.HtmlTreeBuilder)v0).popStackToClose(((java.lang.String[])v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    ((org.jsoup.parser.HtmlTreeBuilder)v0).newPendingTableCharacters();
    Object v1 = null;
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "body2";
    Object v2 = ((org.jsoup.parser.HtmlTreeBuilder)v0).inScope(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "option";
    ((org.jsoup.parser.HtmlTreeBuilder)v0).popStackToClose(((java.lang.String)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = new org.jsoup.parser.Token.Character();
    Object v2 = org.jsoup.parser.HtmlTreeBuilderState.AfterAfterFrameset;
    Object v3 = ((org.jsoup.parser.HtmlTreeBuilder)v0).process(((org.jsoup.parser.Token)v1),((org.jsoup.parser.HtmlTreeBuilderState)v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }
}
