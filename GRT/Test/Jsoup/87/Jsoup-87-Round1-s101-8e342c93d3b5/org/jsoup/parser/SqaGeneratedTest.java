package org.jsoup.parser;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "bse";
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
    Object v1 = "tr";
    Object v2 = false;
    Object v3 = true;
    Object v4 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v1),((org.jsoup.parser.ParseSettings)v4));
    Object v6 = "D";
    Object v7 = new org.jsoup.nodes.Attributes();
    Object v8 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v5),((java.lang.String)v6),((org.jsoup.nodes.Attributes)v7));
    Object v9 = ((org.jsoup.nodes.Element)v8).dataset();
    Object v10 = "tr";
    Object v11 = false;
    Object v12 = true;
    Object v13 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v10),((org.jsoup.parser.ParseSettings)v13));
    Object v15 = "D";
    Object v16 = new org.jsoup.nodes.Attributes();
    Object v17 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v14),((java.lang.String)v15),((org.jsoup.nodes.Attributes)v16));
    Object v18 = ((org.jsoup.nodes.Node)v17).childNodes();
    ((org.jsoup.parser.HtmlTreeBuilder)v0).insertOnStackAfter(((org.jsoup.nodes.Element)v8),((org.jsoup.nodes.Element)v17));
    Object v19 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = new java.lang.String[]{"body"};
    ((org.jsoup.parser.HtmlTreeBuilder)v0).popStackToClose(((java.lang.String[])v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    ((org.jsoup.parser.HtmlTreeBuilder)v0).clearStackToTableBodyContext();
    Object v1 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    ((org.jsoup.parser.HtmlTreeBuilder)v0).clearFormattingElementsToLastMarker();
    Object v1 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "tr";
    Object v2 = false;
    Object v3 = true;
    Object v4 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v1),((org.jsoup.parser.ParseSettings)v4));
    Object v6 = "D";
    Object v7 = new org.jsoup.nodes.Attributes();
    Object v8 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v5),((java.lang.String)v6),((org.jsoup.nodes.Attributes)v7));
    Object v9 = "-";
    Object v10 = ((org.jsoup.nodes.Element)v8).addClass(((java.lang.String)v9));
    Object v11 = ((org.jsoup.parser.HtmlTreeBuilder)v0).removeFromStack(((org.jsoup.nodes.Element)v8));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "tr";
    Object v2 = false;
    Object v3 = true;
    Object v4 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v1),((org.jsoup.parser.ParseSettings)v4));
    Object v6 = "D";
    Object v7 = new org.jsoup.nodes.Attributes();
    Object v8 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v5),((java.lang.String)v6),((org.jsoup.nodes.Attributes)v7));
    ((org.jsoup.parser.HtmlTreeBuilder)v0).removeFromActiveFormattingElements(((org.jsoup.nodes.Element)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "colgroup";
    ((org.jsoup.parser.HtmlTreeBuilder)v0).popStackToBefore(((java.lang.String)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = org.jsoup.parser.HtmlTreeBuilderState.AfterAfterBody;
    ((org.jsoup.parser.HtmlTreeBuilder)v0).error(((org.jsoup.parser.HtmlTreeBuilderState)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = ((org.jsoup.parser.HtmlTreeBuilder)v0).lastFormattingElement();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "tr";
    Object v2 = false;
    Object v3 = true;
    Object v4 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v1),((org.jsoup.parser.ParseSettings)v4));
    Object v6 = "D";
    Object v7 = new org.jsoup.nodes.Attributes();
    Object v8 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v5),((java.lang.String)v6),((org.jsoup.nodes.Attributes)v7));
    Object v9 = "h2";
    Object v10 = "PUBLIC";
    Object v11 = ((org.jsoup.nodes.Element)v8).getElementsByAttributeValueMatching(((java.lang.String)v9),((java.lang.String)v10));
    ((org.jsoup.parser.HtmlTreeBuilder)v0).removeFromActiveFormattingElements(((org.jsoup.nodes.Element)v8));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = new org.jsoup.parser.Token.StartTag();
    Object v2 = true;
    Object v3 = ((org.jsoup.parser.HtmlTreeBuilder)v0).insertForm(((org.jsoup.parser.Token.StartTag)v1),(((java.lang.Boolean)v2).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    ((org.jsoup.parser.HtmlTreeBuilder)v0).resetInsertionMode();
    Object v1 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "noembed";
    Object v2 = ((org.jsoup.parser.HtmlTreeBuilder)v0).inSelectScope(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = new java.lang.String[]{"var","thead","p"};
    ((org.jsoup.parser.HtmlTreeBuilder)v0).popStackToClose(((java.lang.String[])v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "tr";
    Object v2 = false;
    Object v3 = true;
    Object v4 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v1),((org.jsoup.parser.ParseSettings)v4));
    Object v6 = "D";
    Object v7 = new org.jsoup.nodes.Attributes();
    Object v8 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v5),((java.lang.String)v6),((org.jsoup.nodes.Attributes)v7));
    ((org.jsoup.parser.HtmlTreeBuilder)v0).maybeSetBaseUri(((org.jsoup.nodes.Element)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "Nhtml";
    Object v2 = new org.jsoup.parser.Token.CData(((java.lang.String)v1));
    ((org.jsoup.parser.HtmlTreeBuilder)v0).insert(((org.jsoup.parser.Token.Character)v2));
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = ":";
    ((org.jsoup.parser.HtmlTreeBuilder)v0).generateImpliedEndTags(((java.lang.String)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = new org.jsoup.parser.Token.StartTag();
    Object v2 = ((org.jsoup.parser.HtmlTreeBuilder)v0).insert(((org.jsoup.parser.Token.StartTag)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "tr";
    Object v2 = false;
    Object v3 = true;
    Object v4 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v1),((org.jsoup.parser.ParseSettings)v4));
    Object v6 = "D";
    Object v7 = new org.jsoup.nodes.Attributes();
    Object v8 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v5),((java.lang.String)v6),((org.jsoup.nodes.Attributes)v7));
    Object v9 = "UTFF8";
    Object v10 = ((org.jsoup.nodes.Element)v8).appendText(((java.lang.String)v9));
    ((org.jsoup.parser.HtmlTreeBuilder)v0).removeFromActiveFormattingElements(((org.jsoup.nodes.Element)v8));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "trp";
    Object v2 = ((org.jsoup.parser.HtmlTreeBuilder)v0).getFromStack(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "tr";
    Object v2 = false;
    Object v3 = true;
    Object v4 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v1),((org.jsoup.parser.ParseSettings)v4));
    Object v6 = "D";
    Object v7 = new org.jsoup.nodes.Attributes();
    Object v8 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v5),((java.lang.String)v6),((org.jsoup.nodes.Attributes)v7));
    Object v9 = "tr";
    Object v10 = false;
    Object v11 = true;
    Object v12 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v10).booleanValue()),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v9),((org.jsoup.parser.ParseSettings)v12));
    Object v14 = "D";
    Object v15 = new org.jsoup.nodes.Attributes();
    Object v16 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v13),((java.lang.String)v14),((org.jsoup.nodes.Attributes)v15));
    Object v17 = ((org.jsoup.nodes.Element)v16).elementSiblingIndex();
    ((org.jsoup.parser.HtmlTreeBuilder)v0).insertOnStackAfter(((org.jsoup.nodes.Element)v8),((org.jsoup.nodes.Element)v16));
    Object v18 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "tr";
    Object v2 = false;
    Object v3 = true;
    Object v4 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v1),((org.jsoup.parser.ParseSettings)v4));
    Object v6 = "D";
    Object v7 = new org.jsoup.nodes.Attributes();
    Object v8 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v5),((java.lang.String)v6),((org.jsoup.nodes.Attributes)v7));
    Object v9 = ((org.jsoup.parser.HtmlTreeBuilder)v0).aboveOnStack(((org.jsoup.nodes.Element)v8));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = ((org.jsoup.parser.HtmlTreeBuilder)v0).pop();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "tr";
    Object v2 = false;
    Object v3 = true;
    Object v4 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v1),((org.jsoup.parser.ParseSettings)v4));
    Object v6 = "D";
    Object v7 = new org.jsoup.nodes.Attributes();
    Object v8 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v5),((java.lang.String)v6),((org.jsoup.nodes.Attributes)v7));
    ((org.jsoup.parser.HtmlTreeBuilder)v0).insertInFosterParent(((org.jsoup.nodes.Node)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "tabl";
    Object v2 = ((org.jsoup.parser.HtmlTreeBuilder)v0).inTableScope(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "https";
    Object v2 = ((org.jsoup.parser.HtmlTreeBuilder)v0).getFromStack(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "tr";
    Object v2 = false;
    Object v3 = true;
    Object v4 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v1),((org.jsoup.parser.ParseSettings)v4));
    Object v6 = "D";
    Object v7 = new org.jsoup.nodes.Attributes();
    Object v8 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v5),((java.lang.String)v6),((org.jsoup.nodes.Attributes)v7));
    Object v9 = ((org.jsoup.nodes.Node)v8).siblingNodes();
    ((org.jsoup.parser.HtmlTreeBuilder)v0).pushActiveFormattingElements(((org.jsoup.nodes.Element)v8));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "L";
    ((org.jsoup.parser.HtmlTreeBuilder)v0).generateImpliedEndTags(((java.lang.String)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "tr";
    Object v2 = false;
    Object v3 = true;
    Object v4 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v1),((org.jsoup.parser.ParseSettings)v4));
    Object v6 = "D";
    Object v7 = new org.jsoup.nodes.Attributes();
    Object v8 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v5),((java.lang.String)v6),((org.jsoup.nodes.Attributes)v7));
    Object v9 = "caption";
    Object v10 = ((org.jsoup.nodes.Element)v8).is(((java.lang.String)v9));
    Object v11 = ((org.jsoup.parser.HtmlTreeBuilder)v0).aboveOnStack(((org.jsoup.nodes.Element)v8));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    ((org.jsoup.parser.HtmlTreeBuilder)v0).clearStackToTableContext();
    Object v1 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "";
    Object v2 = "tr";
    Object v3 = false;
    Object v4 = true;
    Object v5 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v2),((org.jsoup.parser.ParseSettings)v5));
    Object v7 = "D";
    Object v8 = new org.jsoup.nodes.Attributes();
    Object v9 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v6),((java.lang.String)v7),((org.jsoup.nodes.Attributes)v8));
    Object v10 = "th";
    Object v11 = "s";
    Object v12 = ((org.jsoup.nodes.Element)v9).getElementsByAttributeValueEnding(((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = "script";
    Object v14 = org.jsoup.parser.Parser.xmlParser();
    Object v15 = ((org.jsoup.parser.HtmlTreeBuilder)v0).parseFragment(((java.lang.String)v1),((org.jsoup.nodes.Element)v9),((java.lang.String)v13),((org.jsoup.parser.Parser)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = ((org.jsoup.parser.HtmlTreeBuilder)v0).removeLastFormattingElement();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "tr";
    Object v2 = false;
    Object v3 = true;
    Object v4 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v1),((org.jsoup.parser.ParseSettings)v4));
    Object v6 = "D";
    Object v7 = new org.jsoup.nodes.Attributes();
    Object v8 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v5),((java.lang.String)v6),((org.jsoup.nodes.Attributes)v7));
    ((org.jsoup.parser.HtmlTreeBuilder)v0).pushActiveFormattingElements(((org.jsoup.nodes.Element)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "h}tml";
    Object v2 = ((org.jsoup.parser.HtmlTreeBuilder)v0).inSelectScope(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "caption";
    Object v2 = ((org.jsoup.parser.HtmlTreeBuilder)v0).getActiveFormattingElement(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = new org.jsoup.parser.Token.StartTag();
    Object v2 = ((org.jsoup.parser.HtmlTreeBuilder)v0).insertEmpty(((org.jsoup.parser.Token.StartTag)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = ((org.jsoup.parser.HtmlTreeBuilder)v0).defaultSettings();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = ((org.jsoup.parser.HtmlTreeBuilder)v0).getBaseUri();
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = ((org.jsoup.parser.HtmlTreeBuilder)v0).getFormElement();
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "tfoot";
    ((org.jsoup.parser.HtmlTreeBuilder)v0).generateImpliedEndTags(((java.lang.String)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "r";
    Object v2 = ((org.jsoup.parser.HtmlTreeBuilder)v0).insertStartTag(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    ((org.jsoup.parser.HtmlTreeBuilder)v0).clearStackToTableRowContext();
    Object v1 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "basY";
    Object v2 = ((org.jsoup.parser.HtmlTreeBuilder)v0).getActiveFormattingElement(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "n";
    Object v2 = "tr";
    Object v3 = false;
    Object v4 = true;
    Object v5 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v2),((org.jsoup.parser.ParseSettings)v5));
    Object v7 = "D";
    Object v8 = new org.jsoup.nodes.Attributes();
    Object v9 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v6),((java.lang.String)v7),((org.jsoup.nodes.Attributes)v8));
    Object v10 = ((org.jsoup.nodes.Element)v9).cssSelector();
    Object v11 = "";
    Object v12 = org.jsoup.parser.Parser.xmlParser();
    Object v13 = ((org.jsoup.parser.HtmlTreeBuilder)v0).parseFragment(((java.lang.String)v1),((org.jsoup.nodes.Element)v9),((java.lang.String)v11),((org.jsoup.parser.Parser)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = ((org.jsoup.parser.HtmlTreeBuilder)v0).toString();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    ((org.jsoup.parser.HtmlTreeBuilder)v0).generateImpliedEndTags();
    Object v1 = null;
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "tr";
    Object v2 = false;
    Object v3 = true;
    Object v4 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v1),((org.jsoup.parser.ParseSettings)v4));
    Object v6 = "D";
    Object v7 = new org.jsoup.nodes.Attributes();
    Object v8 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v5),((java.lang.String)v6),((org.jsoup.nodes.Attributes)v7));
    ((org.jsoup.parser.HtmlTreeBuilder)v0).insert(((org.jsoup.nodes.Element)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "";
    Object v2 = ((org.jsoup.parser.HtmlTreeBuilder)v0).getActiveFormattingElement(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = org.jsoup.parser.HtmlTreeBuilderState.InHeadNoscript;
    ((org.jsoup.parser.HtmlTreeBuilder)v0).error(((org.jsoup.parser.HtmlTreeBuilderState)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "tr";
    Object v2 = false;
    Object v3 = true;
    Object v4 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v1),((org.jsoup.parser.ParseSettings)v4));
    Object v6 = "D";
    Object v7 = new org.jsoup.nodes.Attributes();
    Object v8 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v5),((java.lang.String)v6),((org.jsoup.nodes.Attributes)v7));
    ((org.jsoup.parser.HtmlTreeBuilder)v0).setHeadElement(((org.jsoup.nodes.Element)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "tr";
    Object v2 = false;
    Object v3 = true;
    Object v4 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v1),((org.jsoup.parser.ParseSettings)v4));
    Object v6 = "D";
    Object v7 = new org.jsoup.nodes.Attributes();
    Object v8 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v5),((java.lang.String)v6),((org.jsoup.nodes.Attributes)v7));
    Object v9 = ((org.jsoup.parser.HtmlTreeBuilder)v0).isInActiveFormattingElements(((org.jsoup.nodes.Element)v8));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "menu";
    ((org.jsoup.parser.HtmlTreeBuilder)v0).popStackToClose(((java.lang.String)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "au";
    Object v2 = "tr";
    Object v3 = false;
    Object v4 = true;
    Object v5 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v2),((org.jsoup.parser.ParseSettings)v5));
    Object v7 = "D";
    Object v8 = new org.jsoup.nodes.Attributes();
    Object v9 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v6),((java.lang.String)v7),((org.jsoup.nodes.Attributes)v8));
    Object v10 = "Kody";
    Object v11 = org.jsoup.parser.Parser.xmlParser();
    Object v12 = ((org.jsoup.parser.HtmlTreeBuilder)v0).parseFragment(((java.lang.String)v1),((org.jsoup.nodes.Element)v9),((java.lang.String)v10),((org.jsoup.parser.Parser)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "html";
    Object v2 = ((org.jsoup.parser.HtmlTreeBuilder)v0).inScope(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = org.jsoup.parser.HtmlTreeBuilderState.InRow;
    ((org.jsoup.parser.HtmlTreeBuilder)v0).error(((org.jsoup.parser.HtmlTreeBuilderState)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "tr";
    Object v2 = false;
    Object v3 = true;
    Object v4 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v1),((org.jsoup.parser.ParseSettings)v4));
    Object v6 = "D";
    Object v7 = new org.jsoup.nodes.Attributes();
    Object v8 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v5),((java.lang.String)v6),((org.jsoup.nodes.Attributes)v7));
    Object v9 = "tr";
    Object v10 = false;
    Object v11 = true;
    Object v12 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v10).booleanValue()),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v9),((org.jsoup.parser.ParseSettings)v12));
    Object v14 = "D";
    Object v15 = new org.jsoup.nodes.Attributes();
    Object v16 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v13),((java.lang.String)v14),((org.jsoup.nodes.Attributes)v15));
    Object v17 = ((org.jsoup.nodes.Element)v16).hasText();
    ((org.jsoup.parser.HtmlTreeBuilder)v0).insertOnStackAfter(((org.jsoup.nodes.Element)v8),((org.jsoup.nodes.Element)v16));
    Object v18 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = ((org.jsoup.parser.HtmlTreeBuilder)v0).getDocument();
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    ((org.jsoup.parser.HtmlTreeBuilder)v0).insertMarkerToFormattingElements();
    Object v1 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "J";
    ((org.jsoup.parser.HtmlTreeBuilder)v0).generateImpliedEndTags(((java.lang.String)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = ((org.jsoup.parser.HtmlTreeBuilder)v0).getPendingTableCharacters();
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "th+";
    ((org.jsoup.parser.HtmlTreeBuilder)v0).generateImpliedEndTags(((java.lang.String)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = org.jsoup.parser.HtmlTreeBuilderState.InTable;
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    ((org.jsoup.parser.HtmlTreeBuilder)v0).transition(((org.jsoup.parser.HtmlTreeBuilderState)v1));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = ((org.jsoup.parser.HtmlTreeBuilder)v0).isFragmentParsing();
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    ((org.jsoup.parser.HtmlTreeBuilder)v0).newPendingTableCharacters();
    Object v1 = null;
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "Nhtml";
    Object v2 = new org.jsoup.parser.Token.CData(((java.lang.String)v1));
    Object v3 = org.jsoup.parser.HtmlTreeBuilderState.InSelect;
    Object v4 = ((org.jsoup.parser.HtmlTreeBuilder)v0).process(((org.jsoup.parser.Token)v2),((org.jsoup.parser.HtmlTreeBuilderState)v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "colgr.oup";
    Object v2 = ((org.jsoup.parser.HtmlTreeBuilder)v0).inTableScope(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = org.jsoup.parser.HtmlTreeBuilderState.AfterFrameset;
    ((org.jsoup.parser.HtmlTreeBuilder)v0).error(((org.jsoup.parser.HtmlTreeBuilderState)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "p";
    Object v2 = ((org.jsoup.parser.HtmlTreeBuilder)v0).inListItemScope(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = new org.jsoup.parser.Token.StartTag();
    Object v2 = false;
    Object v3 = ((org.jsoup.parser.HtmlTreeBuilder)v0).insertForm(((org.jsoup.parser.Token.StartTag)v1),(((java.lang.Boolean)v2).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "h\\ml";
    ((org.jsoup.parser.HtmlTreeBuilder)v0).popStackToBefore(((java.lang.String)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = ((org.jsoup.parser.HtmlTreeBuilder)v0).originalState();
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = true;
    ((org.jsoup.parser.HtmlTreeBuilder)v0).setFosterInserts((((java.lang.Boolean)v1).booleanValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "style";
    Object v2 = ((org.jsoup.parser.HtmlTreeBuilder)v0).getActiveFormattingElement(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "noframe";
    Object v2 = ((org.jsoup.parser.HtmlTreeBuilder)v0).getFromStack(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "version";
    ((org.jsoup.parser.HtmlTreeBuilder)v0).popStackToBefore(((java.lang.String)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "tead";
    Object v2 = ((org.jsoup.parser.HtmlTreeBuilder)v0).getActiveFormattingElement(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "ma";
    Object v2 = "tr";
    Object v3 = false;
    Object v4 = true;
    Object v5 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v2),((org.jsoup.parser.ParseSettings)v5));
    Object v7 = "D";
    Object v8 = new org.jsoup.nodes.Attributes();
    Object v9 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v6),((java.lang.String)v7),((org.jsoup.nodes.Attributes)v8));
    Object v10 = "html";
    Object v11 = org.jsoup.parser.Parser.xmlParser();
    Object v12 = ((org.jsoup.parser.HtmlTreeBuilder)v0).parseFragment(((java.lang.String)v1),((org.jsoup.nodes.Element)v9),((java.lang.String)v10),((org.jsoup.parser.Parser)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "meta";
    Object v2 = "tr";
    Object v3 = false;
    Object v4 = true;
    Object v5 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v2),((org.jsoup.parser.ParseSettings)v5));
    Object v7 = "D";
    Object v8 = new org.jsoup.nodes.Attributes();
    Object v9 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v6),((java.lang.String)v7),((org.jsoup.nodes.Attributes)v8));
    Object v10 = ((org.jsoup.nodes.Element)v9).wholeText();
    Object v11 = "</";
    Object v12 = org.jsoup.parser.Parser.xmlParser();
    Object v13 = ((org.jsoup.parser.HtmlTreeBuilder)v0).parseFragment(((java.lang.String)v1),((org.jsoup.nodes.Element)v9),((java.lang.String)v11),((org.jsoup.parser.Parser)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "tr";
    Object v2 = false;
    Object v3 = true;
    Object v4 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v1),((org.jsoup.parser.ParseSettings)v4));
    Object v6 = "D";
    Object v7 = new org.jsoup.nodes.Attributes();
    Object v8 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v5),((java.lang.String)v6),((org.jsoup.nodes.Attributes)v7));
    Object v9 = ((org.jsoup.parser.HtmlTreeBuilder)v0).onStack(((org.jsoup.nodes.Element)v8));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "tr";
    Object v2 = false;
    Object v3 = true;
    Object v4 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v1),((org.jsoup.parser.ParseSettings)v4));
    Object v6 = "D";
    Object v7 = new org.jsoup.nodes.Attributes();
    Object v8 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v5),((java.lang.String)v6),((org.jsoup.nodes.Attributes)v7));
    Object v9 = "t";
    ((org.jsoup.nodes.Node)v8).setBaseUri(((java.lang.String)v9));
    Object v10 = null;
    ((org.jsoup.parser.HtmlTreeBuilder)v0).pushActiveFormattingElements(((org.jsoup.nodes.Element)v8));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "tr";
    Object v2 = false;
    Object v3 = true;
    Object v4 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v1),((org.jsoup.parser.ParseSettings)v4));
    Object v6 = "D";
    Object v7 = new org.jsoup.nodes.Attributes();
    Object v8 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v5),((java.lang.String)v6),((org.jsoup.nodes.Attributes)v7));
    Object v9 = ((org.jsoup.nodes.Node)v8).childNodesCopy();
    ((org.jsoup.parser.HtmlTreeBuilder)v0).insertInFosterParent(((org.jsoup.nodes.Node)v8));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = ((org.jsoup.parser.HtmlTreeBuilder)v0).state();
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "tr";
    Object v2 = false;
    Object v3 = true;
    Object v4 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v1),((org.jsoup.parser.ParseSettings)v4));
    Object v6 = "D";
    Object v7 = new org.jsoup.nodes.Attributes();
    Object v8 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v5),((java.lang.String)v6),((org.jsoup.nodes.Attributes)v7));
    Object v9 = "tr";
    Object v10 = false;
    Object v11 = true;
    Object v12 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v10).booleanValue()),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v9),((org.jsoup.parser.ParseSettings)v12));
    Object v14 = "D";
    Object v15 = new org.jsoup.nodes.Attributes();
    Object v16 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v13),((java.lang.String)v14),((org.jsoup.nodes.Attributes)v15));
    Object v17 = "]l";
    Object v18 = ((org.jsoup.nodes.Element)v16).prependText(((java.lang.String)v17));
    ((org.jsoup.parser.HtmlTreeBuilder)v0).replaceActiveFormattingElement(((org.jsoup.nodes.Element)v8),((org.jsoup.nodes.Element)v16));
    Object v19 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "tr";
    Object v2 = false;
    Object v3 = true;
    Object v4 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v1),((org.jsoup.parser.ParseSettings)v4));
    Object v6 = "D";
    Object v7 = new org.jsoup.nodes.Attributes();
    Object v8 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v5),((java.lang.String)v6),((org.jsoup.nodes.Attributes)v7));
    Object v9 = ((org.jsoup.parser.HtmlTreeBuilder)v0).removeFromStack(((org.jsoup.nodes.Element)v8));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = org.jsoup.parser.HtmlTreeBuilderState.ForeignContent;
    ((org.jsoup.parser.HtmlTreeBuilder)v0).error(((org.jsoup.parser.HtmlTreeBuilderState)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    ((org.jsoup.parser.HtmlTreeBuilder)v0).markInsertionMode();
    Object v1 = null;
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "p";
    Object v2 = ((org.jsoup.parser.HtmlTreeBuilder)v0).inButtonScope(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "Pattern syntax error: ";
    ((org.jsoup.parser.HtmlTreeBuilder)v0).popStackToClose(((java.lang.String)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "tr";
    Object v2 = false;
    Object v3 = true;
    Object v4 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v1),((org.jsoup.parser.ParseSettings)v4));
    Object v6 = "D";
    Object v7 = new org.jsoup.nodes.Attributes();
    Object v8 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v5),((java.lang.String)v6),((org.jsoup.nodes.Attributes)v7));
    Object v9 = "tr";
    Object v10 = false;
    Object v11 = true;
    Object v12 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v10).booleanValue()),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v9),((org.jsoup.parser.ParseSettings)v12));
    Object v14 = "D";
    Object v15 = new org.jsoup.nodes.Attributes();
    Object v16 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v13),((java.lang.String)v14),((org.jsoup.nodes.Attributes)v15));
    ((org.jsoup.parser.HtmlTreeBuilder)v0).replaceOnStack(((org.jsoup.nodes.Element)v8),((org.jsoup.nodes.Element)v16));
    Object v17 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = new org.jsoup.parser.Token.StartTag();
    Object v2 = ((org.jsoup.parser.HtmlTreeBuilder)v0).process(((org.jsoup.parser.Token)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "";
    Object v2 = "tr";
    Object v3 = false;
    Object v4 = true;
    Object v5 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v2),((org.jsoup.parser.ParseSettings)v5));
    Object v7 = "D";
    Object v8 = new org.jsoup.nodes.Attributes();
    Object v9 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v6),((java.lang.String)v7),((org.jsoup.nodes.Attributes)v8));
    Object v10 = "colgroup";
    Object v11 = ((org.jsoup.nodes.Node)v9).removeAttr(((java.lang.String)v10));
    Object v12 = "html";
    Object v13 = org.jsoup.parser.Parser.xmlParser();
    Object v14 = ((org.jsoup.parser.HtmlTreeBuilder)v0).parseFragment(((java.lang.String)v1),((org.jsoup.nodes.Element)v9),((java.lang.String)v12),((org.jsoup.parser.Parser)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = ((org.jsoup.parser.HtmlTreeBuilder)v0).isFosterInserts();
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = new java.lang.String[]{"","li",""};
    ((org.jsoup.parser.HtmlTreeBuilder)v0).popStackToClose(((java.lang.String[])v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "tr";
    Object v2 = false;
    Object v3 = true;
    Object v4 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v1),((org.jsoup.parser.ParseSettings)v4));
    Object v6 = "p";
    Object v7 = new org.jsoup.nodes.Attributes();
    Object v8 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v5),((java.lang.String)v6),((org.jsoup.nodes.Attributes)v7));
    Object v9 = "are1";
    Object v10 = ((org.jsoup.nodes.Element)v8).getElementsMatchingText(((java.lang.String)v9));
    ((org.jsoup.parser.HtmlTreeBuilder)v0).setFormElement(((org.jsoup.nodes.FormElement)v8));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "tr";
    Object v2 = false;
    Object v3 = true;
    Object v4 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v1),((org.jsoup.parser.ParseSettings)v4));
    Object v6 = "p";
    Object v7 = new org.jsoup.nodes.Attributes();
    Object v8 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v5),((java.lang.String)v6),((org.jsoup.nodes.Attributes)v7));
    Object v9 = ((org.jsoup.parser.HtmlTreeBuilder)v0).removeFromStack(((org.jsoup.nodes.Element)v8));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "tr";
    Object v2 = false;
    Object v3 = true;
    Object v4 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v1),((org.jsoup.parser.ParseSettings)v4));
    Object v6 = "p";
    Object v7 = new org.jsoup.nodes.Attributes();
    Object v8 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v5),((java.lang.String)v6),((org.jsoup.nodes.Attributes)v7));
    ((org.jsoup.parser.HtmlTreeBuilder)v0).maybeSetBaseUri(((org.jsoup.nodes.Element)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "tr";
    Object v2 = false;
    Object v3 = true;
    Object v4 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v1),((org.jsoup.parser.ParseSettings)v4));
    Object v6 = "D";
    Object v7 = new org.jsoup.nodes.Attributes();
    Object v8 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v5),((java.lang.String)v6),((org.jsoup.nodes.Attributes)v7));
    Object v9 = "";
    Object v10 = ((org.jsoup.nodes.Node)v8).hasAttr(((java.lang.String)v9));
    Object v11 = ((org.jsoup.parser.HtmlTreeBuilder)v0).isSpecial(((org.jsoup.nodes.Element)v8));
    org.junit.Assert.assertEquals((Object)(true), v11);
  }
}
