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
    Object v1 = "tr";
    Object v2 = "EndT";
    Object v3 = org.jsoup.parser.Parser.parseBodyFragmentRelaxed(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "tr";
    Object v5 = "EndT";
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
    Object v1 = new org.jsoup.parser.Token.StartTag();
    Object v2 = ((org.jsoup.parser.HtmlTreeBuilder)v0).insertEmpty(((org.jsoup.parser.Token.StartTag)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
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
    Object v1 = ((org.jsoup.parser.HtmlTreeBuilder)v0).getBaseUri();
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    ((org.jsoup.parser.HtmlTreeBuilder)v0).clearFormattingElementsToLastMarker();
    Object v1 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "tr";
    Object v2 = "EndT";
    Object v3 = org.jsoup.parser.Parser.parseBodyFragmentRelaxed(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((org.jsoup.parser.HtmlTreeBuilder)v0).aboveOnStack(((org.jsoup.nodes.Element)v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = new org.jsoup.parser.Token.StartTag();
    Object v2 = ((org.jsoup.parser.HtmlTreeBuilder)v0).insert(((org.jsoup.parser.Token.StartTag)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = org.jsoup.parser.HtmlTreeBuilderState.InTableText;
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
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    ((org.jsoup.parser.HtmlTreeBuilder)v0).markInsertionMode();
    Object v1 = null;
    org.junit.Assert.assertNull(v1);
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
    Object v1 = new java.lang.String[]{"tbody","table","th"};
    ((org.jsoup.parser.HtmlTreeBuilder)v0).popStackToClose(((java.lang.String[])v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "tr";
    Object v2 = "EndT";
    Object v3 = org.jsoup.parser.Parser.parseBodyFragmentRelaxed(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "html=";
    Object v5 = ((org.jsoup.nodes.Element)v3).getElementsMatchingOwnText(((java.lang.String)v4));
    Object v6 = ((org.jsoup.parser.HtmlTreeBuilder)v0).removeFromStack(((org.jsoup.nodes.Element)v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "#dcument";
    Object v2 = ((org.jsoup.parser.HtmlTreeBuilder)v0).insertStartTag(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "t";
    ((org.jsoup.parser.HtmlTreeBuilder)v0).popStackToBefore(((java.lang.String)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = new java.lang.String[]{};
    ((org.jsoup.parser.HtmlTreeBuilder)v0).popStackToClose(((java.lang.String[])v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = ((org.jsoup.parser.HtmlTreeBuilder)v0).defaultSettings();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = " ";
    Object v2 = ((org.jsoup.parser.HtmlTreeBuilder)v0).getFromStack(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "html";
    Object v2 = "tr";
    Object v3 = "EndT";
    Object v4 = org.jsoup.parser.Parser.parseBodyFragmentRelaxed(((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = "tfoo";
    Object v6 = 44;
    Object v7 = 73;
    Object v8 = new org.jsoup.parser.ParseErrorList((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = ((java.util.ArrayList)v8).toArray();
    Object v10 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v11 = ((org.jsoup.parser.HtmlTreeBuilder)v10).defaultSettings();
    Object v12 = ((org.jsoup.parser.HtmlTreeBuilder)v0).parseFragment(((java.lang.String)v1),((org.jsoup.nodes.Element)v4),((java.lang.String)v5),((org.jsoup.parser.ParseErrorList)v8),((org.jsoup.parser.ParseSettings)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = new org.jsoup.parser.Token.StartTag();
    Object v2 = false;
    Object v3 = ((org.jsoup.parser.HtmlTreeBuilder)v0).insertForm(((org.jsoup.parser.Token.StartTag)v1),(((java.lang.Boolean)v2).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "html";
    Object v2 = ((org.jsoup.parser.HtmlTreeBuilder)v0).getFromStack(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "tr";
    Object v2 = "EndT";
    Object v3 = org.jsoup.parser.Parser.parseBodyFragmentRelaxed(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "body";
    Object v5 = ((org.jsoup.nodes.Element)v3).prepend(((java.lang.String)v4));
    Object v6 = ((org.jsoup.parser.HtmlTreeBuilder)v0).onStack(((org.jsoup.nodes.Element)v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = new java.lang.String[]{"small","html","t$oot"};
    ((org.jsoup.parser.HtmlTreeBuilder)v0).popStackToClose(((java.lang.String[])v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "tr";
    Object v2 = "EndT";
    Object v3 = org.jsoup.parser.Parser.parseBodyFragmentRelaxed(((java.lang.String)v1),((java.lang.String)v2));
    ((org.jsoup.parser.HtmlTreeBuilder)v0).maybeSetBaseUri(((org.jsoup.nodes.Element)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "tr";
    Object v2 = "EndT";
    Object v3 = org.jsoup.parser.Parser.parseBodyFragmentRelaxed(((java.lang.String)v1),((java.lang.String)v2));
    ((org.jsoup.parser.HtmlTreeBuilder)v0).removeFromActiveFormattingElements(((org.jsoup.nodes.Element)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = new org.jsoup.parser.Token.StartTag();
    Object v2 = org.jsoup.parser.HtmlTreeBuilderState.BeforeHtml;
    Object v3 = ((org.jsoup.parser.HtmlTreeBuilder)v0).process(((org.jsoup.parser.Token)v1),((org.jsoup.parser.HtmlTreeBuilderState)v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = ((org.jsoup.parser.HtmlTreeBuilder)v0).framesetOk();
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "body";
    ((org.jsoup.parser.HtmlTreeBuilder)v0).popStackToClose(((java.lang.String)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "ht";
    ((org.jsoup.parser.HtmlTreeBuilder)v0).generateImpliedEndTags(((java.lang.String)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = ((org.jsoup.parser.HtmlTreeBuilder)v0).removeLastFormattingElement();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "tr";
    Object v2 = "EndT";
    Object v3 = org.jsoup.parser.Parser.parseBodyFragmentRelaxed(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "tr";
    Object v5 = "EndT";
    Object v6 = org.jsoup.parser.Parser.parseBodyFragmentRelaxed(((java.lang.String)v4),((java.lang.String)v5));
    ((org.jsoup.parser.HtmlTreeBuilder)v0).replaceActiveFormattingElement(((org.jsoup.nodes.Element)v3),((org.jsoup.nodes.Element)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    ((org.jsoup.parser.HtmlTreeBuilder)v0).resetInsertionMode();
    Object v1 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "tr";
    Object v2 = "EndT";
    Object v3 = org.jsoup.parser.Parser.parseBodyFragmentRelaxed(((java.lang.String)v1),((java.lang.String)v2));
    ((org.jsoup.parser.HtmlTreeBuilder)v0).insertInFosterParent(((org.jsoup.nodes.Node)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "dd";
    ((org.jsoup.parser.HtmlTreeBuilder)v0).popStackToClose(((java.lang.String)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "tr";
    Object v2 = "EndT";
    Object v3 = org.jsoup.parser.Parser.parseBodyFragmentRelaxed(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "tr";
    Object v5 = "EndT";
    Object v6 = org.jsoup.parser.Parser.parseBodyFragmentRelaxed(((java.lang.String)v4),((java.lang.String)v5));
    ((org.jsoup.parser.HtmlTreeBuilder)v0).replaceOnStack(((org.jsoup.nodes.Element)v3),((org.jsoup.nodes.Element)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "lab~l";
    Object v2 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v1));
    Object v3 = "actiFn";
    Object v4 = new org.jsoup.nodes.Attributes();
    Object v5 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v2),((java.lang.String)v3),((org.jsoup.nodes.Attributes)v4));
    ((org.jsoup.parser.HtmlTreeBuilder)v0).setFormElement(((org.jsoup.nodes.FormElement)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    ((org.jsoup.parser.HtmlTreeBuilder)v0).clearStackToTableRowContext();
    Object v1 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "lab~l";
    Object v2 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v1));
    Object v3 = "actiFn";
    Object v4 = new org.jsoup.nodes.Attributes();
    Object v5 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v2),((java.lang.String)v3),((org.jsoup.nodes.Attributes)v4));
    ((org.jsoup.parser.HtmlTreeBuilder)v0).insertInFosterParent(((org.jsoup.nodes.Node)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "lab~l";
    Object v2 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v1));
    Object v3 = "actiFn";
    Object v4 = new org.jsoup.nodes.Attributes();
    Object v5 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v2),((java.lang.String)v3),((org.jsoup.nodes.Attributes)v4));
    Object v6 = "lab~l";
    Object v7 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v6));
    Object v8 = "actiFn";
    Object v9 = new org.jsoup.nodes.Attributes();
    Object v10 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v7),((java.lang.String)v8),((org.jsoup.nodes.Attributes)v9));
    ((org.jsoup.parser.HtmlTreeBuilder)v0).insertOnStackAfter(((org.jsoup.nodes.Element)v5),((org.jsoup.nodes.Element)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "lab~l";
    Object v2 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v1));
    Object v3 = "actiFn";
    Object v4 = new org.jsoup.nodes.Attributes();
    Object v5 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v2),((java.lang.String)v3),((org.jsoup.nodes.Attributes)v4));
    Object v6 = ((org.jsoup.nodes.Element)v5).val();
    Object v7 = "lab~l";
    Object v8 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v7));
    Object v9 = "actiFn";
    Object v10 = new org.jsoup.nodes.Attributes();
    Object v11 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v8),((java.lang.String)v9),((org.jsoup.nodes.Attributes)v10));
    ((org.jsoup.parser.HtmlTreeBuilder)v0).replaceActiveFormattingElement(((org.jsoup.nodes.Element)v5),((org.jsoup.nodes.Element)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "lab~l";
    Object v2 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v1));
    Object v3 = "actiFn";
    Object v4 = new org.jsoup.nodes.Attributes();
    Object v5 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v2),((java.lang.String)v3),((org.jsoup.nodes.Attributes)v4));
    Object v6 = ((org.jsoup.parser.HtmlTreeBuilder)v0).aboveOnStack(((org.jsoup.nodes.Element)v5));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "lab~l";
    Object v2 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v1));
    Object v3 = "actiFn";
    Object v4 = new org.jsoup.nodes.Attributes();
    Object v5 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v2),((java.lang.String)v3),((org.jsoup.nodes.Attributes)v4));
    Object v6 = ((org.jsoup.parser.HtmlTreeBuilder)v0).isInActiveFormattingElements(((org.jsoup.nodes.Element)v5));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "lab~l";
    Object v2 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v1));
    Object v3 = "actiFn";
    Object v4 = new org.jsoup.nodes.Attributes();
    Object v5 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v2),((java.lang.String)v3),((org.jsoup.nodes.Attributes)v4));
    Object v6 = ((org.jsoup.parser.HtmlTreeBuilder)v0).isSpecial(((org.jsoup.nodes.Element)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = false;
    ((org.jsoup.parser.HtmlTreeBuilder)v0).framesetOk((((java.lang.Boolean)v1).booleanValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "nofollSow";
    Object v2 = ((org.jsoup.parser.HtmlTreeBuilder)v0).inSelectScope(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = ((org.jsoup.parser.HtmlTreeBuilder)v0).getHeadElement();
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "lab~l";
    Object v2 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v1));
    Object v3 = "actiFn";
    Object v4 = new org.jsoup.nodes.Attributes();
    Object v5 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v2),((java.lang.String)v3),((org.jsoup.nodes.Attributes)v4));
    ((org.jsoup.parser.HtmlTreeBuilder)v0).removeFromActiveFormattingElements(((org.jsoup.nodes.Element)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "#root";
    Object v2 = ((org.jsoup.parser.HtmlTreeBuilder)v0).getActiveFormattingElement(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "lab~l";
    Object v2 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v1));
    Object v3 = "actiFn";
    Object v4 = new org.jsoup.nodes.Attributes();
    Object v5 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v2),((java.lang.String)v3),((org.jsoup.nodes.Attributes)v4));
    Object v6 = ((org.jsoup.nodes.Element)v5).nextElementSibling();
    Object v7 = "lab~l";
    Object v8 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v7));
    Object v9 = "actiFn";
    Object v10 = new org.jsoup.nodes.Attributes();
    Object v11 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v8),((java.lang.String)v9),((org.jsoup.nodes.Attributes)v10));
    ((org.jsoup.parser.HtmlTreeBuilder)v0).insertOnStackAfter(((org.jsoup.nodes.Element)v5),((org.jsoup.nodes.Element)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = true;
    ((org.jsoup.parser.HtmlTreeBuilder)v0).framesetOk((((java.lang.Boolean)v1).booleanValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = false;
    ((org.jsoup.parser.HtmlTreeBuilder)v0).setFosterInserts((((java.lang.Boolean)v1).booleanValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "";
    Object v2 = "lab~l";
    Object v3 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v2));
    Object v4 = "actiFn";
    Object v5 = new org.jsoup.nodes.Attributes();
    Object v6 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v3),((java.lang.String)v4),((org.jsoup.nodes.Attributes)v5));
    Object v7 = "lab~l";
    Object v8 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v7));
    Object v9 = "actiFn";
    Object v10 = new org.jsoup.nodes.Attributes();
    Object v11 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v8),((java.lang.String)v9),((org.jsoup.nodes.Attributes)v10));
    Object v12 = ((org.jsoup.nodes.Element)v6).appendTo(((org.jsoup.nodes.Element)v11));
    Object v13 = "tr";
    Object v14 = 44;
    Object v15 = 73;
    Object v16 = new org.jsoup.parser.ParseErrorList((((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v18 = ((org.jsoup.parser.HtmlTreeBuilder)v17).defaultSettings();
    Object v19 = ((org.jsoup.parser.HtmlTreeBuilder)v0).parseFragment(((java.lang.String)v1),((org.jsoup.nodes.Element)v6),((java.lang.String)v13),((org.jsoup.parser.ParseErrorList)v16),((org.jsoup.parser.ParseSettings)v18));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "lab~l";
    Object v2 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v1));
    Object v3 = "actiFn";
    Object v4 = new org.jsoup.nodes.Attributes();
    Object v5 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v2),((java.lang.String)v3),((org.jsoup.nodes.Attributes)v4));
    Object v6 = ((org.jsoup.parser.HtmlTreeBuilder)v0).removeFromStack(((org.jsoup.nodes.Element)v5));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "lab~l";
    Object v2 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v1));
    Object v3 = "actiFn";
    Object v4 = new org.jsoup.nodes.Attributes();
    Object v5 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v2),((java.lang.String)v3),((org.jsoup.nodes.Attributes)v4));
    ((org.jsoup.parser.HtmlTreeBuilder)v0).maybeSetBaseUri(((org.jsoup.nodes.Element)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = ((org.jsoup.parser.HtmlTreeBuilder)v0).pop();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "tfo";
    ((org.jsoup.parser.HtmlTreeBuilder)v0).popStackToBefore(((java.lang.String)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = ((org.jsoup.parser.HtmlTreeBuilder)v0).getStack();
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "td6";
    ((org.jsoup.parser.HtmlTreeBuilder)v0).popStackToBefore(((java.lang.String)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = new org.jsoup.parser.Token.Comment();
    ((org.jsoup.parser.HtmlTreeBuilder)v0).insert(((org.jsoup.parser.Token.Comment)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "body7";
    ((org.jsoup.parser.HtmlTreeBuilder)v0).popStackToClose(((java.lang.String)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "lab~l";
    Object v2 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v1));
    Object v3 = "actiFn";
    Object v4 = new org.jsoup.nodes.Attributes();
    Object v5 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v2),((java.lang.String)v3),((org.jsoup.nodes.Attributes)v4));
    Object v6 = "lab~l";
    Object v7 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v6));
    Object v8 = "actiFn";
    Object v9 = new org.jsoup.nodes.Attributes();
    Object v10 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v7),((java.lang.String)v8),((org.jsoup.nodes.Attributes)v9));
    ((org.jsoup.parser.HtmlTreeBuilder)v0).replaceActiveFormattingElement(((org.jsoup.nodes.Element)v5),((org.jsoup.nodes.Element)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = org.jsoup.parser.HtmlTreeBuilderState.InHeadNoscript;
    ((org.jsoup.parser.HtmlTreeBuilder)v0).error(((org.jsoup.parser.HtmlTreeBuilderState)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "     r";
    Object v2 = ((org.jsoup.parser.HtmlTreeBuilder)v0).getActiveFormattingElement(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "bo+y";
    ((org.jsoup.parser.HtmlTreeBuilder)v0).generateImpliedEndTags(((java.lang.String)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = ((org.jsoup.parser.HtmlTreeBuilder)v0).originalState();
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "lab~l";
    Object v2 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v1));
    Object v3 = "actiFn";
    Object v4 = new org.jsoup.nodes.Attributes();
    Object v5 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v2),((java.lang.String)v3),((org.jsoup.nodes.Attributes)v4));
    Object v6 = ((org.jsoup.nodes.Element)v5).val();
    Object v7 = "lab~l";
    Object v8 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v7));
    Object v9 = "actiFn";
    Object v10 = new org.jsoup.nodes.Attributes();
    Object v11 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v8),((java.lang.String)v9),((org.jsoup.nodes.Attributes)v10));
    Object v12 = "title";
    Object v13 = ((org.jsoup.nodes.Element)v11).appendText(((java.lang.String)v12));
    ((org.jsoup.parser.HtmlTreeBuilder)v0).replaceOnStack(((org.jsoup.nodes.Element)v5),((org.jsoup.nodes.Element)v11));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "htmZ";
    Object v2 = ((org.jsoup.parser.HtmlTreeBuilder)v0).inSelectScope(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "lab~l";
    Object v2 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v1));
    Object v3 = "actiFn";
    Object v4 = new org.jsoup.nodes.Attributes();
    Object v5 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v2),((java.lang.String)v3),((org.jsoup.nodes.Attributes)v4));
    Object v6 = ((org.jsoup.nodes.Node)v5).outerHtml();
    ((org.jsoup.parser.HtmlTreeBuilder)v0).pushActiveFormattingElements(((org.jsoup.nodes.Element)v5));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = ((org.jsoup.parser.HtmlTreeBuilder)v0).toString();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    ((org.jsoup.parser.HtmlTreeBuilder)v0).clearStackToTableBodyContext();
    Object v1 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = ";-";
    Object v2 = ((org.jsoup.parser.HtmlTreeBuilder)v0).getActiveFormattingElement(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
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
    ((org.jsoup.parser.HtmlTreeBuilder)v0).clearStackToTableContext();
    Object v1 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = new org.jsoup.parser.Token.Character();
    Object v2 = org.jsoup.parser.HtmlTreeBuilderState.InCaption;
    Object v3 = ((org.jsoup.parser.HtmlTreeBuilder)v0).process(((org.jsoup.parser.Token)v1),((org.jsoup.parser.HtmlTreeBuilderState)v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = new java.lang.String[]{"UTF-8","stdle"};
    ((org.jsoup.parser.HtmlTreeBuilder)v0).popStackToClose(((java.lang.String[])v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "title";
    Object v2 = ((org.jsoup.parser.HtmlTreeBuilder)v0).inSelectScope(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "d";
    Object v2 = ((org.jsoup.parser.HtmlTreeBuilder)v0).inSelectScope(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = ((org.jsoup.parser.HtmlTreeBuilder)v0).getPendingTableCharacters();
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = java.io.Reader.nullReader();
    Object v2 = "script";
    Object v3 = 44;
    Object v4 = 73;
    Object v5 = new org.jsoup.parser.ParseErrorList((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v7 = ((org.jsoup.parser.HtmlTreeBuilder)v6).defaultSettings();
    ((org.jsoup.parser.HtmlTreeBuilder)v0).initialiseParse(((java.io.Reader)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v5),((org.jsoup.parser.ParseSettings)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    ((org.jsoup.parser.HtmlTreeBuilder)v0).insertMarkerToFormattingElements();
    Object v1 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = java.io.Reader.nullReader();
    Object v2 = "textarea";
    Object v3 = 44;
    Object v4 = 73;
    Object v5 = new org.jsoup.parser.ParseErrorList((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v7 = ((org.jsoup.parser.HtmlTreeBuilder)v6).defaultSettings();
    ((org.jsoup.parser.HtmlTreeBuilder)v0).initialiseParse(((java.io.Reader)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v5),((org.jsoup.parser.ParseSettings)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "html";
    Object v2 = ((org.jsoup.parser.HtmlTreeBuilder)v0).inTableScope(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "";
    Object v2 = ((org.jsoup.parser.HtmlTreeBuilder)v0).inSelectScope(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "source";
    ((org.jsoup.parser.HtmlTreeBuilder)v0).generateImpliedEndTags(((java.lang.String)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "lab~l";
    Object v2 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v1));
    Object v3 = "actiFn";
    Object v4 = new org.jsoup.nodes.Attributes();
    Object v5 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v2),((java.lang.String)v3),((org.jsoup.nodes.Attributes)v4));
    ((org.jsoup.parser.HtmlTreeBuilder)v0).pushActiveFormattingElements(((org.jsoup.nodes.Element)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "";
    Object v2 = ((org.jsoup.parser.HtmlTreeBuilder)v0).getActiveFormattingElement(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "lab~l";
    Object v2 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v1));
    Object v3 = "actiFn";
    Object v4 = new org.jsoup.nodes.Attributes();
    Object v5 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v2),((java.lang.String)v3),((org.jsoup.nodes.Attributes)v4));
    Object v6 = ((org.jsoup.parser.HtmlTreeBuilder)v0).onStack(((org.jsoup.nodes.Element)v5));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "f";
    Object v2 = ((org.jsoup.parser.HtmlTreeBuilder)v0).inTableScope(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "lab~l";
    Object v2 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v1));
    Object v3 = "actiFn";
    Object v4 = new org.jsoup.nodes.Attributes();
    Object v5 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v2),((java.lang.String)v3),((org.jsoup.nodes.Attributes)v4));
    Object v6 = "hrPef";
    Object v7 = ((org.jsoup.nodes.Element)v5).getElementsContainingText(((java.lang.String)v6));
    ((org.jsoup.parser.HtmlTreeBuilder)v0).pushActiveFormattingElements(((org.jsoup.nodes.Element)v5));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "?^";
    ((org.jsoup.parser.HtmlTreeBuilder)v0).popStackToBefore(((java.lang.String)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = new java.lang.String[]{"col","thead","tfoot"};
    Object v2 = ((org.jsoup.parser.HtmlTreeBuilder)v0).inScope(((java.lang.String[])v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "ul";
    ((org.jsoup.parser.HtmlTreeBuilder)v0).popStackToClose(((java.lang.String)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "h5";
    Object v2 = ((org.jsoup.parser.HtmlTreeBuilder)v0).getFromStack(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = org.jsoup.parser.HtmlTreeBuilderState.InTableBody;
    ((org.jsoup.parser.HtmlTreeBuilder)v0).error(((org.jsoup.parser.HtmlTreeBuilderState)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "lab~l";
    Object v2 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v1));
    Object v3 = "actiFn";
    Object v4 = new org.jsoup.nodes.Attributes();
    Object v5 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v2),((java.lang.String)v3),((org.jsoup.nodes.Attributes)v4));
    Object v6 = ((org.jsoup.nodes.Node)v5).childNodesCopy();
    ((org.jsoup.parser.HtmlTreeBuilder)v0).insertInFosterParent(((org.jsoup.nodes.Node)v5));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = ((org.jsoup.parser.HtmlTreeBuilder)v0).getDocument();
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "lab~l";
    Object v2 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v1));
    Object v3 = "actiFn";
    Object v4 = new org.jsoup.nodes.Attributes();
    Object v5 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v2),((java.lang.String)v3),((org.jsoup.nodes.Attributes)v4));
    ((org.jsoup.parser.HtmlTreeBuilder)v0).insert(((org.jsoup.nodes.Element)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.HtmlTreeBuilder();
    Object v1 = "head";
    Object v2 = ((org.jsoup.parser.HtmlTreeBuilder)v0).inTableScope(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }
}
