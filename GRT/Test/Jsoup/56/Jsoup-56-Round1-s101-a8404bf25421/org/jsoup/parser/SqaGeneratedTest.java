package org.jsoup.parser;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = org.jsoup.parser.TokeniserState.ScriptDataEscapedLessthanSign;
    Object v1 = "Qbasefont";
    Object v2 = new org.jsoup.parser.CharacterReader(((java.lang.String)v1));
    Object v3 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v4 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v2),((org.jsoup.parser.ParseErrorList)v3));
    Object v5 = "Qbasefont";
    Object v6 = new org.jsoup.parser.CharacterReader(((java.lang.String)v5));
    ((org.jsoup.parser.TokeniserState)v0).read(((org.jsoup.parser.Tokeniser)v4),((org.jsoup.parser.CharacterReader)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = "t";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = org.jsoup.parser.TokeniserState.AttributeValue_unquoted;
    Object v1 = "Qbasefont";
    Object v2 = new org.jsoup.parser.CharacterReader(((java.lang.String)v1));
    Object v3 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v4 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v2),((org.jsoup.parser.ParseErrorList)v3));
    Object v5 = "Qbasefont";
    Object v6 = new org.jsoup.parser.CharacterReader(((java.lang.String)v5));
    Object v7 = new char[]{Character.valueOf((char)0)};
    Object v8 = ((org.jsoup.parser.CharacterReader)v6).consumeToAny(((char[])v7));
    ((org.jsoup.parser.TokeniserState)v0).read(((org.jsoup.parser.Tokeniser)v4),((org.jsoup.parser.CharacterReader)v6));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = org.jsoup.parser.TokeniserState.values();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = " ";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = "html";
    Object v1 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v0));
    Object v2 = "html";
    Object v3 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v2));
    Object v4 = ((java.lang.Enum)v3).hashCode();
    Object v5 = ((java.lang.Enum)v1).compareTo(((java.lang.Enum)v3));
    org.junit.Assert.assertEquals((Object)(0), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = "html";
    Object v1 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v0));
    Object v2 = "html";
    Object v3 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v2));
    Object v4 = ((java.lang.Enum)v1).equals(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = "html";
    Object v1 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v0));
    Object v2 = "html";
    Object v3 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v2));
    Object v4 = ((java.lang.Enum)v1).compareTo(((java.lang.Enum)v3));
    org.junit.Assert.assertEquals((Object)(0), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = "title";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = "html";
    Object v1 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = org.jsoup.parser.TokeniserState.Rcdata;
    Object v1 = ((java.lang.Enum)v0).hashCode();
    Object v2 = "Qbasefont";
    Object v3 = new org.jsoup.parser.CharacterReader(((java.lang.String)v2));
    Object v4 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v5 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v3),((org.jsoup.parser.ParseErrorList)v4));
    Object v6 = "Qbasefont";
    Object v7 = new org.jsoup.parser.CharacterReader(((java.lang.String)v6));
    ((org.jsoup.parser.CharacterReader)v7).advance();
    Object v8 = null;
    ((org.jsoup.parser.TokeniserState)v0).read(((org.jsoup.parser.Tokeniser)v5),((org.jsoup.parser.CharacterReader)v7));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = "html";
    Object v1 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = ((java.lang.Enum)v1).name();
    org.junit.Assert.assertEquals((Object)("html"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = org.jsoup.parser.TokeniserState.RawtextEndTagName;
    Object v1 = ((java.lang.Enum)v0).hashCode();
    Object v2 = "Qbasefont";
    Object v3 = new org.jsoup.parser.CharacterReader(((java.lang.String)v2));
    Object v4 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v5 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v3),((org.jsoup.parser.ParseErrorList)v4));
    Object v6 = "Qbasefont";
    Object v7 = new org.jsoup.parser.CharacterReader(((java.lang.String)v6));
    Object v8 = ((org.jsoup.parser.CharacterReader)v7).toString();
    ((org.jsoup.parser.TokeniserState)v0).read(((org.jsoup.parser.Tokeniser)v5),((org.jsoup.parser.CharacterReader)v7));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = "html";
    Object v1 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).hashCode();
    Object v3 = ((java.lang.Enum)v1).getDeclaringClass();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = "html";
    Object v1 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).hashCode();
    Object v3 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v4 = "tr";
    Object v5 = java.lang.Enum.valueOf(((java.lang.Class)v3),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = "!";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = "v";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = "html";
    Object v1 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).hashCode();
    Object v3 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v4 = "tad";
    Object v5 = java.lang.Enum.valueOf(((java.lang.Class)v3),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = "h2";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
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
  public void test21() throws Throwable {
    Object v0 = "html";
    Object v1 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).hashCode();
    Object v3 = "html";
    Object v4 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v3));
    Object v5 = ((java.lang.Enum)v1).equals(((java.lang.Object)v4));
    org.junit.Assert.assertEquals((Object)(true), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = org.jsoup.parser.TokeniserState.CommentEndBang;
    Object v1 = "Qbasefont";
    Object v2 = new org.jsoup.parser.CharacterReader(((java.lang.String)v1));
    Object v3 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v4 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v2),((org.jsoup.parser.ParseErrorList)v3));
    Object v5 = "Qbasefont";
    Object v6 = new org.jsoup.parser.CharacterReader(((java.lang.String)v5));
    ((org.jsoup.parser.TokeniserState)v0).read(((org.jsoup.parser.Tokeniser)v4),((org.jsoup.parser.CharacterReader)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = "html";
    Object v1 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).hashCode();
    Object v3 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v4 = "lnk";
    Object v5 = java.lang.Enum.valueOf(((java.lang.Class)v3),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = "html";
    Object v1 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).ordinal();
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = "html";
    Object v1 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v0));
    Object v2 = "html";
    Object v3 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v2));
    Object v4 = ((java.lang.Enum)v1).compareTo(((java.lang.Enum)v3));
    Object v5 = ((java.lang.Enum)v1).getDeclaringClass();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = org.jsoup.parser.TokeniserState.CommentEndDash;
    Object v1 = "Qbasefont";
    Object v2 = new org.jsoup.parser.CharacterReader(((java.lang.String)v1));
    Object v3 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v4 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v2),((org.jsoup.parser.ParseErrorList)v3));
    Object v5 = "Qbasefont";
    Object v6 = new org.jsoup.parser.CharacterReader(((java.lang.String)v5));
    ((org.jsoup.parser.TokeniserState)v0).read(((org.jsoup.parser.Tokeniser)v4),((org.jsoup.parser.CharacterReader)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = "html";
    Object v1 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = "Hd";
    Object v4 = java.lang.Enum.valueOf(((java.lang.Class)v2),((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = "tr";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = "html";
    Object v1 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v0));
    Object v2 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v3 = ((java.lang.Enum)v1).equals(((java.lang.Object)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = "html";
    Object v1 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v0));
    Object v2 = "html";
    Object v3 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v2));
    Object v4 = ((java.lang.Enum)v1).compareTo(((java.lang.Enum)v3));
    Object v5 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v6 = "ScriptDataEscapedLessthanSign";
    Object v7 = java.lang.Enum.valueOf(((java.lang.Class)v5),((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = "html";
    Object v1 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v0));
    Object v2 = "html";
    Object v3 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v2));
    Object v4 = ((java.lang.Enum)v1).compareTo(((java.lang.Enum)v3));
    Object v5 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v6 = "tfoot";
    Object v7 = java.lang.Enum.valueOf(((java.lang.Class)v5),((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = "html";
    Object v1 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).toString();
    org.junit.Assert.assertEquals((Object)("html"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = "html";
    Object v1 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v0));
    Object v2 = "html";
    Object v3 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v2));
    Object v4 = ((java.lang.Enum)v1).compareTo(((java.lang.Enum)v3));
    Object v5 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v6 = "htm";
    Object v7 = java.lang.Enum.valueOf(((java.lang.Class)v5),((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = "html";
    Object v1 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v0));
    Object v2 = "html";
    Object v3 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v2));
    Object v4 = ((java.lang.Enum)v1).compareTo(((java.lang.Enum)v3));
    Object v5 = org.jsoup.parser.TokeniserState.values();
    Object v6 = ((java.lang.Enum)v1).equals(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = "caption";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = org.jsoup.parser.TokeniserState.RawtextLessthanSign;
    Object v1 = ((java.lang.Enum)v0).hashCode();
    Object v2 = "Qbasefont";
    Object v3 = new org.jsoup.parser.CharacterReader(((java.lang.String)v2));
    Object v4 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v5 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v3),((org.jsoup.parser.ParseErrorList)v4));
    Object v6 = "Qbasefont";
    Object v7 = new org.jsoup.parser.CharacterReader(((java.lang.String)v6));
    ((org.jsoup.parser.TokeniserState)v0).read(((org.jsoup.parser.Tokeniser)v5),((org.jsoup.parser.CharacterReader)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = "html";
    Object v1 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).hashCode();
    Object v3 = "html";
    Object v4 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v3));
    Object v5 = ((java.lang.Enum)v1).compareTo(((java.lang.Enum)v4));
    org.junit.Assert.assertEquals((Object)(0), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = org.jsoup.parser.TokeniserState.DoctypeSystemIdentifier_doubleQuoted;
    Object v1 = ((java.lang.Enum)v0).hashCode();
    Object v2 = "Qbasefont";
    Object v3 = new org.jsoup.parser.CharacterReader(((java.lang.String)v2));
    Object v4 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v5 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v3),((org.jsoup.parser.ParseErrorList)v4));
    Object v6 = "Qbasefont";
    Object v7 = new org.jsoup.parser.CharacterReader(((java.lang.String)v6));
    ((org.jsoup.parser.TokeniserState)v0).read(((org.jsoup.parser.Tokeniser)v5),((org.jsoup.parser.CharacterReader)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = "html";
    Object v1 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).hashCode();
    Object v3 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v4 = "p";
    Object v5 = java.lang.Enum.valueOf(((java.lang.Class)v3),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = org.jsoup.parser.TokeniserState.AfterDoctypeName;
    Object v1 = "Qbasefont";
    Object v2 = new org.jsoup.parser.CharacterReader(((java.lang.String)v1));
    Object v3 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v4 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v2),((org.jsoup.parser.ParseErrorList)v3));
    Object v5 = "Qbasefont";
    Object v6 = new org.jsoup.parser.CharacterReader(((java.lang.String)v5));
    ((org.jsoup.parser.TokeniserState)v0).read(((org.jsoup.parser.Tokeniser)v4),((org.jsoup.parser.CharacterReader)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = "td";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = org.jsoup.parser.TokeniserState.ScriptDataEscapeStartDash;
    Object v1 = ((java.lang.Enum)v0).hashCode();
    Object v2 = "Qbasefont";
    Object v3 = new org.jsoup.parser.CharacterReader(((java.lang.String)v2));
    Object v4 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v5 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v3),((org.jsoup.parser.ParseErrorList)v4));
    Object v6 = "Qbasefont";
    Object v7 = new org.jsoup.parser.CharacterReader(((java.lang.String)v6));
    ((org.jsoup.parser.TokeniserState)v0).read(((org.jsoup.parser.Tokeniser)v5),((org.jsoup.parser.CharacterReader)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = "html";
    Object v1 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v0));
    Object v2 = "html";
    Object v3 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v2));
    Object v4 = ((java.lang.Enum)v1).compareTo(((java.lang.Enum)v3));
    Object v5 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v6 = ((java.lang.Class)v5).getTypeName();
    Object v7 = "h2";
    Object v8 = java.lang.Enum.valueOf(((java.lang.Class)v5),((java.lang.String)v7));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
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
  public void test45() throws Throwable {
    try {
    Object v0 = "style";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = org.jsoup.parser.TokeniserState.Comment;
    Object v1 = ((java.lang.Enum)v0).getDeclaringClass();
    Object v2 = "Qbasefont";
    Object v3 = new org.jsoup.parser.CharacterReader(((java.lang.String)v2));
    Object v4 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v5 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v3),((org.jsoup.parser.ParseErrorList)v4));
    Object v6 = "Qbasefont";
    Object v7 = new org.jsoup.parser.CharacterReader(((java.lang.String)v6));
    ((org.jsoup.parser.TokeniserState)v0).read(((org.jsoup.parser.Tokeniser)v5),((org.jsoup.parser.CharacterReader)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = "html";
    Object v1 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).hashCode();
    Object v3 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v4 = "frameset";
    Object v5 = java.lang.Enum.valueOf(((java.lang.Class)v3),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = "html";
    Object v1 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v0));
    Object v2 = "html";
    Object v3 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v2));
    Object v4 = ((java.lang.Enum)v1).compareTo(((java.lang.Enum)v3));
    Object v5 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v6 = "html";
    Object v7 = java.lang.Enum.valueOf(((java.lang.Class)v5),((java.lang.String)v6));
    org.junit.Assert.assertEquals((Object)(org.jsoup.nodes.Document.OutputSettings.Syntax.html), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = "html";
    Object v1 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).name();
    org.junit.Assert.assertEquals((Object)("html"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = "html";
    Object v1 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v0));
    Object v2 = "html";
    Object v3 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v2));
    Object v4 = ((java.lang.Enum)v1).compareTo(((java.lang.Enum)v3));
    Object v5 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v6 = ":root";
    Object v7 = java.lang.Enum.valueOf(((java.lang.Class)v5),((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = "html";
    Object v1 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = ((java.lang.Class)v2).getAnnotatedSuperclass();
    Object v4 = "ckaption";
    Object v5 = java.lang.Enum.valueOf(((java.lang.Class)v2),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = "html";
    Object v1 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v0));
    Object v2 = "html";
    Object v3 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v2));
    Object v4 = ((java.lang.Enum)v1).compareTo(((java.lang.Enum)v3));
    Object v5 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v6 = "na";
    Object v7 = java.lang.Enum.valueOf(((java.lang.Class)v5),((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = org.jsoup.parser.TokeniserState.Comment;
    Object v1 = "Qbasefont";
    Object v2 = new org.jsoup.parser.CharacterReader(((java.lang.String)v1));
    Object v3 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v4 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v2),((org.jsoup.parser.ParseErrorList)v3));
    Object v5 = "Qbasefont";
    Object v6 = new org.jsoup.parser.CharacterReader(((java.lang.String)v5));
    ((org.jsoup.parser.TokeniserState)v0).read(((org.jsoup.parser.Tokeniser)v4),((org.jsoup.parser.CharacterReader)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = "html";
    Object v1 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v0));
    Object v2 = "html";
    Object v3 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v2));
    Object v4 = ((java.lang.Enum)v1).compareTo(((java.lang.Enum)v3));
    Object v5 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v6 = "h";
    Object v7 = java.lang.Enum.valueOf(((java.lang.Class)v5),((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = org.jsoup.parser.TokeniserState.Doctype;
    Object v1 = ((java.lang.Enum)v0).hashCode();
    Object v2 = "Qbasefont";
    Object v3 = new org.jsoup.parser.CharacterReader(((java.lang.String)v2));
    Object v4 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v5 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v3),((org.jsoup.parser.ParseErrorList)v4));
    Object v6 = "Qbasefont";
    Object v7 = new org.jsoup.parser.CharacterReader(((java.lang.String)v6));
    ((org.jsoup.parser.TokeniserState)v0).read(((org.jsoup.parser.Tokeniser)v5),((org.jsoup.parser.CharacterReader)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = "html";
    Object v1 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = ((java.lang.Enum)v1).getDeclaringClass();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = "html";
    Object v1 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).hashCode();
    Object v3 = ((java.lang.Enum)v1).hashCode();
    org.junit.Assert.assertEquals((Object)(968219996), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = "html";
    Object v1 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v4 = "ul";
    Object v5 = java.lang.Enum.valueOf(((java.lang.Class)v3),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
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
  public void test60() throws Throwable {
    Object v0 = "html";
    Object v1 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v0));
    Object v2 = "html";
    Object v3 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v2));
    Object v4 = "html";
    Object v5 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v4));
    Object v6 = ((java.lang.Enum)v3).compareTo(((java.lang.Enum)v5));
    Object v7 = ((java.lang.Enum)v3).getDeclaringClass();
    Object v8 = ((java.lang.Enum)v1).equals(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = "html";
    Object v1 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = "html";
    Object v4 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v3));
    Object v5 = "html";
    Object v6 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v5));
    Object v7 = ((java.lang.Enum)v4).compareTo(((java.lang.Enum)v6));
    Object v8 = "html";
    Object v9 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v8));
    Object v10 = ((java.lang.Enum)v4).equals(((java.lang.Object)v9));
    Object v11 = ((java.lang.Enum)v1).equals(((java.lang.Object)v10));
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = "#xa0;";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
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
  public void test64() throws Throwable {
    try {
    Object v0 = "option[selected]";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = "width";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = "html";
    Object v1 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).hashCode();
    org.junit.Assert.assertEquals((Object)(968219996), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = org.jsoup.parser.TokeniserState.BeforeDoctypeSystemIdentifier;
    Object v1 = "Qbasefont";
    Object v2 = new org.jsoup.parser.CharacterReader(((java.lang.String)v1));
    Object v3 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v4 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v2),((org.jsoup.parser.ParseErrorList)v3));
    Object v5 = "Qbasefont";
    Object v6 = new org.jsoup.parser.CharacterReader(((java.lang.String)v5));
    ((org.jsoup.parser.TokeniserState)v0).read(((org.jsoup.parser.Tokeniser)v4),((org.jsoup.parser.CharacterReader)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
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
  public void test69() throws Throwable {
    try {
    Object v0 = org.jsoup.parser.TokeniserState.RawtextEndTagName;
    Object v1 = "Qbasefont";
    Object v2 = new org.jsoup.parser.CharacterReader(((java.lang.String)v1));
    Object v3 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v4 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v2),((org.jsoup.parser.ParseErrorList)v3));
    Object v5 = "Qbasefont";
    Object v6 = new org.jsoup.parser.CharacterReader(((java.lang.String)v5));
    ((org.jsoup.parser.TokeniserState)v0).read(((org.jsoup.parser.Tokeniser)v4),((org.jsoup.parser.CharacterReader)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = org.jsoup.parser.TokeniserState.CommentEnd;
    Object v1 = ((java.lang.Enum)v0).hashCode();
    Object v2 = "Qbasefont";
    Object v3 = new org.jsoup.parser.CharacterReader(((java.lang.String)v2));
    Object v4 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v5 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v3),((org.jsoup.parser.ParseErrorList)v4));
    Object v6 = "Qbasefont";
    Object v7 = new org.jsoup.parser.CharacterReader(((java.lang.String)v6));
    Object v8 = Character.valueOf((char)0);
    Object v9 = ((org.jsoup.parser.CharacterReader)v7).consumeTo((((java.lang.Character)v8).charValue()));
    ((org.jsoup.parser.TokeniserState)v0).read(((org.jsoup.parser.Tokeniser)v5),((org.jsoup.parser.CharacterReader)v7));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = "html";
    Object v1 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).hashCode();
    Object v3 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v4 = "h6";
    Object v5 = java.lang.Enum.valueOf(((java.lang.Class)v3),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = "html";
    Object v1 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).hashCode();
    Object v3 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v4 = "htmp";
    Object v5 = java.lang.Enum.valueOf(((java.lang.Class)v3),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = "html";
    Object v1 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v0));
    Object v2 = "html";
    Object v3 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v2));
    Object v4 = ((java.lang.Enum)v1).compareTo(((java.lang.Enum)v3));
    Object v5 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v6 = "html";
    Object v7 = java.lang.Enum.valueOf(((java.lang.Class)v5),((java.lang.String)v6));
    Object v8 = ((java.lang.Enum)v7).getDeclaringClass();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = "html";
    Object v1 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v4 = "base";
    Object v5 = java.lang.Enum.valueOf(((java.lang.Class)v3),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = org.jsoup.parser.TokeniserState.AttributeValue_doubleQuoted;
    Object v1 = "Qbasefont";
    Object v2 = new org.jsoup.parser.CharacterReader(((java.lang.String)v1));
    Object v3 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v4 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v2),((org.jsoup.parser.ParseErrorList)v3));
    Object v5 = "Qbasefont";
    Object v6 = new org.jsoup.parser.CharacterReader(((java.lang.String)v5));
    ((org.jsoup.parser.TokeniserState)v0).read(((org.jsoup.parser.Tokeniser)v4),((org.jsoup.parser.CharacterReader)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = "html";
    Object v1 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v4 = "oframes";
    Object v5 = java.lang.Enum.valueOf(((java.lang.Class)v3),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = "html";
    Object v1 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v0));
    Object v2 = "html";
    Object v3 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v2));
    Object v4 = ((java.lang.Enum)v1).compareTo(((java.lang.Enum)v3));
    Object v5 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v6 = "3html";
    Object v7 = java.lang.Enum.valueOf(((java.lang.Class)v5),((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = "html";
    Object v1 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v4 = "caption";
    Object v5 = java.lang.Enum.valueOf(((java.lang.Class)v3),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = "html";
    Object v1 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v0));
    Object v2 = "html";
    Object v3 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v2));
    Object v4 = ((java.lang.Enum)v3).getDeclaringClass();
    Object v5 = ((java.lang.Enum)v1).compareTo(((java.lang.Enum)v3));
    org.junit.Assert.assertEquals((Object)(0), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = "a";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = "html";
    Object v1 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v0));
    Object v2 = "html";
    Object v3 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v2));
    Object v4 = ((java.lang.Enum)v1).compareTo(((java.lang.Enum)v3));
    Object v5 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v6 = "html";
    Object v7 = java.lang.Enum.valueOf(((java.lang.Class)v5),((java.lang.String)v6));
    Object v8 = ((java.lang.Enum)v7).getDeclaringClass();
    Object v9 = "";
    Object v10 = java.lang.Enum.valueOf(((java.lang.Class)v8),((java.lang.String)v9));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = ". imetype=";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = "img";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = "html";
    Object v1 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v0));
    Object v2 = "html";
    Object v3 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v2));
    Object v4 = ((java.lang.Enum)v3).name();
    Object v5 = ((java.lang.Enum)v1).equals(((java.lang.Object)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = "]tr";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = org.jsoup.parser.TokeniserState.ScriptDataDoubleEscapedDash;
    Object v1 = "Qbasefont";
    Object v2 = new org.jsoup.parser.CharacterReader(((java.lang.String)v1));
    Object v3 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v4 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v2),((org.jsoup.parser.ParseErrorList)v3));
    Object v5 = "Qbasefont";
    Object v6 = new org.jsoup.parser.CharacterReader(((java.lang.String)v5));
    ((org.jsoup.parser.TokeniserState)v0).read(((org.jsoup.parser.Tokeniser)v4),((org.jsoup.parser.CharacterReader)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = "type";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = "html";
    Object v1 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v0));
    Object v2 = "html";
    Object v3 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v2));
    Object v4 = ((java.lang.Enum)v1).compareTo(((java.lang.Enum)v3));
    Object v5 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v6 = ((java.lang.Class)v5).getDeclaredClasses();
    Object v7 = "p";
    Object v8 = java.lang.Enum.valueOf(((java.lang.Class)v5),((java.lang.String)v7));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = "html";
    Object v1 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = "html";
    Object v4 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v3));
    Object v5 = ((java.lang.Enum)v1).compareTo(((java.lang.Enum)v4));
    org.junit.Assert.assertEquals((Object)(0), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = org.jsoup.parser.TokeniserState.CharacterReferenceInData;
    Object v1 = "Qbasefont";
    Object v2 = new org.jsoup.parser.CharacterReader(((java.lang.String)v1));
    Object v3 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v4 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v2),((org.jsoup.parser.ParseErrorList)v3));
    Object v5 = "Qbasefont";
    Object v6 = new org.jsoup.parser.CharacterReader(((java.lang.String)v5));
    ((org.jsoup.parser.TokeniserState)v0).read(((org.jsoup.parser.Tokeniser)v4),((org.jsoup.parser.CharacterReader)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = "span";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = "tfoot";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = "html";
    Object v1 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v0));
    Object v2 = "html";
    Object v3 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v2));
    Object v4 = ((java.lang.Enum)v1).compareTo(((java.lang.Enum)v3));
    Object v5 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v6 = ((java.lang.Class)v5).getNestHost();
    Object v7 = "title";
    Object v8 = java.lang.Enum.valueOf(((java.lang.Class)v5),((java.lang.String)v7));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = "html";
    Object v1 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v0));
    Object v2 = "html";
    Object v3 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v2));
    Object v4 = ((java.lang.Enum)v3).getDeclaringClass();
    Object v5 = ((java.lang.Enum)v3).getDeclaringClass();
    Object v6 = ((java.lang.Enum)v1).equals(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = "blockquote";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = "html";
    Object v1 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v0));
    Object v2 = "html";
    Object v3 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v2));
    Object v4 = ((java.lang.Enum)v1).compareTo(((java.lang.Enum)v3));
    Object v5 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v6 = "html";
    Object v7 = java.lang.Enum.valueOf(((java.lang.Class)v5),((java.lang.String)v6));
    Object v8 = "html";
    Object v9 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v8));
    Object v10 = "html";
    Object v11 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v10));
    Object v12 = ((java.lang.Enum)v9).compareTo(((java.lang.Enum)v11));
    Object v13 = "html";
    Object v14 = org.jsoup.nodes.Document.OutputSettings.Syntax.valueOf(((java.lang.String)v13));
    Object v15 = ((java.lang.Enum)v9).equals(((java.lang.Object)v14));
    Object v16 = ((java.lang.Enum)v7).equals(((java.lang.Object)v15));
    org.junit.Assert.assertEquals((Object)(false), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = org.jsoup.parser.TokeniserState.ScriptDataEndTagName;
    Object v1 = ((java.lang.Enum)v0).getDeclaringClass();
    Object v2 = "Qbasefont";
    Object v3 = new org.jsoup.parser.CharacterReader(((java.lang.String)v2));
    Object v4 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v5 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v3),((org.jsoup.parser.ParseErrorList)v4));
    Object v6 = "Qbasefont";
    Object v7 = new org.jsoup.parser.CharacterReader(((java.lang.String)v6));
    ((org.jsoup.parser.TokeniserState)v0).read(((org.jsoup.parser.Tokeniser)v5),((org.jsoup.parser.CharacterReader)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = "html";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = org.jsoup.parser.TokeniserState.TagOpen;
    Object v1 = "Qbasefont";
    Object v2 = new org.jsoup.parser.CharacterReader(((java.lang.String)v1));
    Object v3 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v4 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v2),((org.jsoup.parser.ParseErrorList)v3));
    Object v5 = "Qbasefont";
    Object v6 = new org.jsoup.parser.CharacterReader(((java.lang.String)v5));
    ((org.jsoup.parser.TokeniserState)v0).read(((org.jsoup.parser.Tokeniser)v4),((org.jsoup.parser.CharacterReader)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }
}
