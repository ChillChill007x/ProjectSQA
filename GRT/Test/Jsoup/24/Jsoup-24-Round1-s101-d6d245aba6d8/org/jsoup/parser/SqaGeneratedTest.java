package org.jsoup.parser;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = org.jsoup.parser.TokeniserState.ScriptDataEscapedLessthanSign;
    Object v1 = "objecQt";
    Object v2 = new org.jsoup.parser.CharacterReader(((java.lang.String)v1));
    Object v3 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v4 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v2),((org.jsoup.parser.ParseErrorList)v3));
    Object v5 = "objecQt";
    Object v6 = new org.jsoup.parser.CharacterReader(((java.lang.String)v5));
    ((org.jsoup.parser.TokeniserState)v0).read(((org.jsoup.parser.Tokeniser)v4),((org.jsoup.parser.CharacterReader)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = org.jsoup.parser.TokeniserState.values();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = org.jsoup.parser.TokeniserState.ScriptDataEscapedLessthanSign;
    Object v1 = ((java.lang.Enum)v0).getDeclaringClass();
    Object v2 = "objecQt";
    Object v3 = new org.jsoup.parser.CharacterReader(((java.lang.String)v2));
    Object v4 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v5 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v3),((org.jsoup.parser.ParseErrorList)v4));
    Object v6 = "objecQt";
    Object v7 = new org.jsoup.parser.CharacterReader(((java.lang.String)v6));
    ((org.jsoup.parser.TokeniserState)v0).read(((org.jsoup.parser.Tokeniser)v5),((org.jsoup.parser.CharacterReader)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = org.jsoup.parser.TokeniserState.Rcdata;
    Object v1 = "objecQt";
    Object v2 = new org.jsoup.parser.CharacterReader(((java.lang.String)v1));
    Object v3 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v4 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v2),((org.jsoup.parser.ParseErrorList)v3));
    Object v5 = "objecQt";
    Object v6 = new org.jsoup.parser.CharacterReader(((java.lang.String)v5));
    Object v7 = ((org.jsoup.parser.CharacterReader)v6).toString();
    ((org.jsoup.parser.TokeniserState)v0).read(((org.jsoup.parser.Tokeniser)v4),((org.jsoup.parser.CharacterReader)v6));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = org.jsoup.parser.TokeniserState.ScriptDataEscapedDash;
    Object v1 = "objecQt";
    Object v2 = new org.jsoup.parser.CharacterReader(((java.lang.String)v1));
    Object v3 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v4 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v2),((org.jsoup.parser.ParseErrorList)v3));
    Object v5 = "objecQt";
    Object v6 = new org.jsoup.parser.CharacterReader(((java.lang.String)v5));
    ((org.jsoup.parser.TokeniserState)v0).read(((org.jsoup.parser.Tokeniser)v4),((org.jsoup.parser.CharacterReader)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = org.jsoup.parser.TokeniserState.BeforeDoctypePublicIdentifier;
    Object v1 = "objecQt";
    Object v2 = new org.jsoup.parser.CharacterReader(((java.lang.String)v1));
    Object v3 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v4 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v2),((org.jsoup.parser.ParseErrorList)v3));
    Object v5 = "objecQt";
    Object v6 = new org.jsoup.parser.CharacterReader(((java.lang.String)v5));
    ((org.jsoup.parser.TokeniserState)v0).read(((org.jsoup.parser.Tokeniser)v4),((org.jsoup.parser.CharacterReader)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = "htmT";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = org.jsoup.parser.TokeniserState.BeforeDoctypeSystemIdentifier;
    Object v1 = "objecQt";
    Object v2 = new org.jsoup.parser.CharacterReader(((java.lang.String)v1));
    Object v3 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v4 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v2),((org.jsoup.parser.ParseErrorList)v3));
    Object v5 = "objecQt";
    Object v6 = new org.jsoup.parser.CharacterReader(((java.lang.String)v5));
    ((org.jsoup.parser.TokeniserState)v0).read(((org.jsoup.parser.Tokeniser)v4),((org.jsoup.parser.CharacterReader)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = org.jsoup.parser.TokeniserState.ScriptDataDoubleEscapedDash;
    Object v1 = ((java.lang.Enum)v0).hashCode();
    Object v2 = "objecQt";
    Object v3 = new org.jsoup.parser.CharacterReader(((java.lang.String)v2));
    Object v4 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v5 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v3),((org.jsoup.parser.ParseErrorList)v4));
    Object v6 = "objecQt";
    Object v7 = new org.jsoup.parser.CharacterReader(((java.lang.String)v6));
    ((org.jsoup.parser.TokeniserState)v0).read(((org.jsoup.parser.Tokeniser)v5),((org.jsoup.parser.CharacterReader)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = "h";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = "embed";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = org.jsoup.parser.TokeniserState.ScriptDataDoubleEscapedDash;
    Object v1 = "objecQt";
    Object v2 = new org.jsoup.parser.CharacterReader(((java.lang.String)v1));
    Object v3 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v4 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v2),((org.jsoup.parser.ParseErrorList)v3));
    Object v5 = "objecQt";
    Object v6 = new org.jsoup.parser.CharacterReader(((java.lang.String)v5));
    ((org.jsoup.parser.TokeniserState)v0).read(((org.jsoup.parser.Tokeniser)v4),((org.jsoup.parser.CharacterReader)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = org.jsoup.parser.TokeniserState.AttributeValue_singleQuoted;
    Object v1 = "objecQt";
    Object v2 = new org.jsoup.parser.CharacterReader(((java.lang.String)v1));
    Object v3 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v4 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v2),((org.jsoup.parser.ParseErrorList)v3));
    Object v5 = "objecQt";
    Object v6 = new org.jsoup.parser.CharacterReader(((java.lang.String)v5));
    ((org.jsoup.parser.TokeniserState)v0).read(((org.jsoup.parser.Tokeniser)v4),((org.jsoup.parser.CharacterReader)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = org.jsoup.parser.TokeniserState.AfterAttributeValue_quoted;
    Object v1 = "objecQt";
    Object v2 = new org.jsoup.parser.CharacterReader(((java.lang.String)v1));
    Object v3 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v4 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v2),((org.jsoup.parser.ParseErrorList)v3));
    Object v5 = "objecQt";
    Object v6 = new org.jsoup.parser.CharacterReader(((java.lang.String)v5));
    Object v7 = ((org.jsoup.parser.CharacterReader)v6).toString();
    ((org.jsoup.parser.TokeniserState)v0).read(((org.jsoup.parser.Tokeniser)v4),((org.jsoup.parser.CharacterReader)v6));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = org.jsoup.parser.TokeniserState.Doctype;
    Object v1 = ((java.lang.Enum)v0).getDeclaringClass();
    Object v2 = "objecQt";
    Object v3 = new org.jsoup.parser.CharacterReader(((java.lang.String)v2));
    Object v4 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v5 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v3),((org.jsoup.parser.ParseErrorList)v4));
    Object v6 = "objecQt";
    Object v7 = new org.jsoup.parser.CharacterReader(((java.lang.String)v6));
    ((org.jsoup.parser.TokeniserState)v0).read(((org.jsoup.parser.Tokeniser)v5),((org.jsoup.parser.CharacterReader)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = org.jsoup.parser.TokeniserState.MarkupDeclarationOpen;
    Object v1 = "objecQt";
    Object v2 = new org.jsoup.parser.CharacterReader(((java.lang.String)v1));
    Object v3 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v4 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v2),((org.jsoup.parser.ParseErrorList)v3));
    Object v5 = "objecQt";
    Object v6 = new org.jsoup.parser.CharacterReader(((java.lang.String)v5));
    ((org.jsoup.parser.TokeniserState)v0).read(((org.jsoup.parser.Tokeniser)v4),((org.jsoup.parser.CharacterReader)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = org.jsoup.parser.TokeniserState.DoctypeSystemIdentifier_doubleQuoted;
    Object v1 = "objecQt";
    Object v2 = new org.jsoup.parser.CharacterReader(((java.lang.String)v1));
    Object v3 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v4 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v2),((org.jsoup.parser.ParseErrorList)v3));
    Object v5 = "objecQt";
    Object v6 = new org.jsoup.parser.CharacterReader(((java.lang.String)v5));
    ((org.jsoup.parser.TokeniserState)v0).read(((org.jsoup.parser.Tokeniser)v4),((org.jsoup.parser.CharacterReader)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = "flat";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = org.jsoup.parser.TokeniserState.DoctypePublicIdentifier_singleQuoted;
    Object v1 = "objecQt";
    Object v2 = new org.jsoup.parser.CharacterReader(((java.lang.String)v1));
    Object v3 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v4 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v2),((org.jsoup.parser.ParseErrorList)v3));
    Object v5 = "objecQt";
    Object v6 = new org.jsoup.parser.CharacterReader(((java.lang.String)v5));
    ((org.jsoup.parser.TokeniserState)v0).read(((org.jsoup.parser.Tokeniser)v4),((org.jsoup.parser.CharacterReader)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = "td";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = "caption";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = org.jsoup.parser.TokeniserState.TagName;
    Object v1 = ((java.lang.Enum)v0).getDeclaringClass();
    Object v2 = "objecQt";
    Object v3 = new org.jsoup.parser.CharacterReader(((java.lang.String)v2));
    Object v4 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v5 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v3),((org.jsoup.parser.ParseErrorList)v4));
    Object v6 = "objecQt";
    Object v7 = new org.jsoup.parser.CharacterReader(((java.lang.String)v6));
    ((org.jsoup.parser.TokeniserState)v0).read(((org.jsoup.parser.Tokeniser)v5),((org.jsoup.parser.CharacterReader)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = "tit^e";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v2 = ((java.lang.Enum)v0).equals(((java.lang.Object)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = "htmy";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = "html";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = "extended";
    Object v1 = org.jsoup.nodes.Entities.EscapeMode.valueOf(((java.lang.String)v0));
    Object v2 = "extended";
    Object v3 = org.jsoup.nodes.Entities.EscapeMode.valueOf(((java.lang.String)v2));
    Object v4 = ((java.lang.Enum)v1).compareTo(((java.lang.Enum)v3));
    org.junit.Assert.assertEquals((Object)(0), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = org.jsoup.parser.TokeniserState.RCDATAEndTagName;
    Object v1 = ((java.lang.Enum)v0).hashCode();
    Object v2 = "objecQt";
    Object v3 = new org.jsoup.parser.CharacterReader(((java.lang.String)v2));
    Object v4 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v5 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v3),((org.jsoup.parser.ParseErrorList)v4));
    Object v6 = "objecQt";
    Object v7 = new org.jsoup.parser.CharacterReader(((java.lang.String)v6));
    ((org.jsoup.parser.TokeniserState)v0).read(((org.jsoup.parser.Tokeniser)v5),((org.jsoup.parser.CharacterReader)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = "body";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = "extended";
    Object v1 = org.jsoup.nodes.Entities.EscapeMode.valueOf(((java.lang.String)v0));
    Object v2 = "extended";
    Object v3 = org.jsoup.nodes.Entities.EscapeMode.valueOf(((java.lang.String)v2));
    Object v4 = ((java.lang.Enum)v1).equals(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = "extended";
    Object v1 = org.jsoup.nodes.Entities.EscapeMode.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = "extended";
    Object v1 = org.jsoup.nodes.Entities.EscapeMode.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = "doulebarwedge";
    Object v4 = java.lang.Enum.valueOf(((java.lang.Class)v2),((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = "extended";
    Object v1 = org.jsoup.nodes.Entities.EscapeMode.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = "href";
    Object v4 = java.lang.Enum.valueOf(((java.lang.Class)v2),((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = "extended";
    Object v1 = org.jsoup.nodes.Entities.EscapeMode.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).hashCode();
    Object v3 = ((java.lang.Enum)v1).getDeclaringClass();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = "extended";
    Object v1 = org.jsoup.nodes.Entities.EscapeMode.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = "th";
    Object v4 = java.lang.Enum.valueOf(((java.lang.Class)v2),((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = "extended";
    Object v1 = org.jsoup.nodes.Entities.EscapeMode.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = ((java.lang.Enum)v1).getDeclaringClass();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = "extended";
    Object v1 = org.jsoup.nodes.Entities.EscapeMode.valueOf(((java.lang.String)v0));
    Object v2 = "extended";
    Object v3 = org.jsoup.nodes.Entities.EscapeMode.valueOf(((java.lang.String)v2));
    Object v4 = ((java.lang.Enum)v3).getDeclaringClass();
    Object v5 = ((java.lang.Enum)v1).equals(((java.lang.Object)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = "extended";
    Object v1 = org.jsoup.nodes.Entities.EscapeMode.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).toString();
    org.junit.Assert.assertEquals((Object)("extended"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = "extended";
    Object v1 = org.jsoup.nodes.Entities.EscapeMode.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v4 = "olcir";
    Object v5 = java.lang.Enum.valueOf(((java.lang.Class)v3),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = "extended";
    Object v1 = org.jsoup.nodes.Entities.EscapeMode.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v4 = "extended";
    Object v5 = org.jsoup.nodes.Entities.EscapeMode.valueOf(((java.lang.String)v4));
    Object v6 = ((java.lang.Enum)v5).getDeclaringClass();
    Object v7 = ((java.lang.Enum)v5).getDeclaringClass();
    Object v8 = ((java.lang.Class)v3).isAssignableFrom(((java.lang.Class)v7));
    Object v9 = "c";
    Object v10 = java.lang.Enum.valueOf(((java.lang.Class)v3),((java.lang.String)v9));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = "extended";
    Object v1 = org.jsoup.nodes.Entities.EscapeMode.valueOf(((java.lang.String)v0));
    Object v2 = "extended";
    Object v3 = org.jsoup.nodes.Entities.EscapeMode.valueOf(((java.lang.String)v2));
    Object v4 = ((java.lang.Enum)v3).hashCode();
    Object v5 = ((java.lang.Enum)v1).compareTo(((java.lang.Enum)v3));
    org.junit.Assert.assertEquals((Object)(0), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = "extended";
    Object v1 = org.jsoup.nodes.Entities.EscapeMode.valueOf(((java.lang.String)v0));
    Object v2 = "extended";
    Object v3 = org.jsoup.nodes.Entities.EscapeMode.valueOf(((java.lang.String)v2));
    Object v4 = "extended";
    Object v5 = org.jsoup.nodes.Entities.EscapeMode.valueOf(((java.lang.String)v4));
    Object v6 = ((java.lang.Enum)v5).hashCode();
    Object v7 = ((java.lang.Enum)v3).compareTo(((java.lang.Enum)v5));
    Object v8 = ((java.lang.Enum)v1).equals(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = "extended";
    Object v1 = org.jsoup.nodes.Entities.EscapeMode.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v4 = "[Ms]";
    Object v5 = java.lang.Enum.valueOf(((java.lang.Class)v3),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = "Doctype";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(org.jsoup.parser.TokeniserState.Doctype), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = "Doctype";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = "extended";
    Object v1 = org.jsoup.nodes.Entities.EscapeMode.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = "tml";
    Object v4 = java.lang.Enum.valueOf(((java.lang.Class)v2),((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = "X";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = "extended";
    Object v1 = org.jsoup.nodes.Entities.EscapeMode.valueOf(((java.lang.String)v0));
    Object v2 = "extended";
    Object v3 = org.jsoup.nodes.Entities.EscapeMode.valueOf(((java.lang.String)v2));
    Object v4 = ((java.lang.Enum)v1).compareTo(((java.lang.Enum)v3));
    Object v5 = ((java.lang.Enum)v1).getDeclaringClass();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = "extended";
    Object v1 = org.jsoup.nodes.Entities.EscapeMode.valueOf(((java.lang.String)v0));
    Object v2 = "extended";
    Object v3 = org.jsoup.nodes.Entities.EscapeMode.valueOf(((java.lang.String)v2));
    Object v4 = ((java.lang.Enum)v1).compareTo(((java.lang.Enum)v3));
    Object v5 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v6 = ((java.lang.Class)v5).getEnumConstants();
    Object v7 = "p";
    Object v8 = java.lang.Enum.valueOf(((java.lang.Class)v5),((java.lang.String)v7));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = "Doctype";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v4 = ((java.lang.Enum)v1).equals(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = "gtrless";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = "Doctype";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = "table";
    Object v4 = java.lang.Enum.valueOf(((java.lang.Class)v2),((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = "Doctype";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
    Object v2 = "objecQt";
    Object v3 = new org.jsoup.parser.CharacterReader(((java.lang.String)v2));
    Object v4 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v5 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v3),((org.jsoup.parser.ParseErrorList)v4));
    Object v6 = "objecQt";
    Object v7 = new org.jsoup.parser.CharacterReader(((java.lang.String)v6));
    ((org.jsoup.parser.TokeniserState)v1).read(((org.jsoup.parser.Tokeniser)v5),((org.jsoup.parser.CharacterReader)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = "Doctype";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = "tab";
    Object v4 = java.lang.Enum.valueOf(((java.lang.Class)v2),((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = "Doctype";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
    Object v2 = "Doctype";
    Object v3 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v2));
    Object v4 = ((java.lang.Enum)v3).getDeclaringClass();
    Object v5 = ((java.lang.Enum)v1).compareTo(((java.lang.Enum)v3));
    org.junit.Assert.assertEquals((Object)(0), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = "extended";
    Object v1 = org.jsoup.nodes.Entities.EscapeMode.valueOf(((java.lang.String)v0));
    Object v2 = "Doctype";
    Object v3 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v2));
    Object v4 = ((java.lang.Enum)v1).compareTo(((java.lang.Enum)v3));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = "Doctype";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).hashCode();
    Object v3 = "objecQt";
    Object v4 = new org.jsoup.parser.CharacterReader(((java.lang.String)v3));
    Object v5 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v6 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v4),((org.jsoup.parser.ParseErrorList)v5));
    Object v7 = "objecQt";
    Object v8 = new org.jsoup.parser.CharacterReader(((java.lang.String)v7));
    ((org.jsoup.parser.TokeniserState)v1).read(((org.jsoup.parser.Tokeniser)v6),((org.jsoup.parser.CharacterReader)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = "extended";
    Object v1 = org.jsoup.nodes.Entities.EscapeMode.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).hashCode();
    Object v3 = "extended";
    Object v4 = org.jsoup.nodes.Entities.EscapeMode.valueOf(((java.lang.String)v3));
    Object v5 = "extended";
    Object v6 = org.jsoup.nodes.Entities.EscapeMode.valueOf(((java.lang.String)v5));
    Object v7 = "extended";
    Object v8 = org.jsoup.nodes.Entities.EscapeMode.valueOf(((java.lang.String)v7));
    Object v9 = ((java.lang.Enum)v8).hashCode();
    Object v10 = ((java.lang.Enum)v6).compareTo(((java.lang.Enum)v8));
    Object v11 = ((java.lang.Enum)v4).equals(((java.lang.Object)v10));
    Object v12 = ((java.lang.Enum)v1).equals(((java.lang.Object)v11));
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = "Doctype";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = "noframes";
    Object v4 = java.lang.Enum.valueOf(((java.lang.Class)v2),((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = "extended";
    Object v1 = org.jsoup.nodes.Entities.EscapeMode.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).hashCode();
    Object v3 = "extended";
    Object v4 = org.jsoup.nodes.Entities.EscapeMode.valueOf(((java.lang.String)v3));
    Object v5 = ((java.lang.Enum)v1).equals(((java.lang.Object)v4));
    org.junit.Assert.assertEquals((Object)(true), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = "optgroup";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = "Doctype";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
    Object v2 = "extended";
    Object v3 = org.jsoup.nodes.Entities.EscapeMode.valueOf(((java.lang.String)v2));
    Object v4 = ((java.lang.Enum)v1).compareTo(((java.lang.Enum)v3));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = "Doctype";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = "th";
    Object v4 = java.lang.Enum.valueOf(((java.lang.Class)v2),((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = "extended";
    Object v1 = org.jsoup.nodes.Entities.EscapeMode.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).ordinal();
    org.junit.Assert.assertEquals((Object)(2), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = "barwed";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = "t";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = "extended";
    Object v1 = org.jsoup.nodes.Entities.EscapeMode.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = ((java.lang.Enum)v1).ordinal();
    org.junit.Assert.assertEquals((Object)(2), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = "extended";
    Object v1 = org.jsoup.nodes.Entities.EscapeMode.valueOf(((java.lang.String)v0));
    Object v2 = org.jsoup.parser.TokeniserState.values();
    Object v3 = ((java.lang.Enum)v1).equals(((java.lang.Object)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = "Doctype";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
    Object v2 = "objecQt";
    Object v3 = new org.jsoup.parser.CharacterReader(((java.lang.String)v2));
    Object v4 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v5 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v3),((org.jsoup.parser.ParseErrorList)v4));
    Object v6 = "objecQt";
    Object v7 = new org.jsoup.parser.CharacterReader(((java.lang.String)v6));
    Object v8 = ((org.jsoup.parser.CharacterReader)v7).toString();
    ((org.jsoup.parser.TokeniserState)v1).read(((org.jsoup.parser.Tokeniser)v5),((org.jsoup.parser.CharacterReader)v7));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = "Ysummary";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = "Doctype";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = "extended";
    Object v4 = org.jsoup.nodes.Entities.EscapeMode.valueOf(((java.lang.String)v3));
    Object v5 = ((java.lang.Enum)v1).compareTo(((java.lang.Enum)v4));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = "Doctype";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = "";
    Object v4 = java.lang.Enum.valueOf(((java.lang.Class)v2),((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = "extended";
    Object v1 = org.jsoup.nodes.Entities.EscapeMode.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v4 = "ffllig";
    Object v5 = java.lang.Enum.valueOf(((java.lang.Class)v3),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = "Doctype";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
    Object v2 = "extended";
    Object v3 = org.jsoup.nodes.Entities.EscapeMode.valueOf(((java.lang.String)v2));
    Object v4 = ((java.lang.Enum)v1).equals(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = "head";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = "extended";
    Object v1 = org.jsoup.nodes.Entities.EscapeMode.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v4 = ";";
    Object v5 = java.lang.Enum.valueOf(((java.lang.Class)v3),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = "extended";
    Object v1 = org.jsoup.nodes.Entities.EscapeMode.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = "extended";
    Object v4 = org.jsoup.nodes.Entities.EscapeMode.valueOf(((java.lang.String)v3));
    Object v5 = ((java.lang.Enum)v4).getDeclaringClass();
    Object v6 = ((java.lang.Enum)v4).ordinal();
    Object v7 = ((java.lang.Enum)v1).equals(((java.lang.Object)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = "extended";
    Object v1 = org.jsoup.nodes.Entities.EscapeMode.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = "thead";
    Object v4 = java.lang.Enum.valueOf(((java.lang.Class)v2),((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = "extended";
    Object v1 = org.jsoup.nodes.Entities.EscapeMode.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v4 = "Gcirc";
    Object v5 = java.lang.Enum.valueOf(((java.lang.Class)v3),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = "tbodl";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = "Doctype";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = ((java.lang.Class)v2).getInterfaces();
    Object v4 = "style";
    Object v5 = java.lang.Enum.valueOf(((java.lang.Class)v2),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = "Doctype";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
    Object v2 = "Doctype";
    Object v3 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v2));
    Object v4 = ((java.lang.Enum)v1).compareTo(((java.lang.Enum)v3));
    Object v5 = "extended";
    Object v6 = org.jsoup.nodes.Entities.EscapeMode.valueOf(((java.lang.String)v5));
    Object v7 = ((java.lang.Enum)v1).equals(((java.lang.Object)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = "extended";
    Object v1 = org.jsoup.nodes.Entities.EscapeMode.valueOf(((java.lang.String)v0));
    Object v2 = "extended";
    Object v3 = org.jsoup.nodes.Entities.EscapeMode.valueOf(((java.lang.String)v2));
    Object v4 = ((java.lang.Enum)v1).compareTo(((java.lang.Enum)v3));
    Object v5 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v6 = "htmld";
    Object v7 = java.lang.Enum.valueOf(((java.lang.Class)v5),((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = "ulcorner";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = "bo7y";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = "extended";
    Object v1 = org.jsoup.nodes.Entities.EscapeMode.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = "Doctype";
    Object v4 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v3));
    Object v5 = ((java.lang.Enum)v1).compareTo(((java.lang.Enum)v4));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = "extended";
    Object v1 = org.jsoup.nodes.Entities.EscapeMode.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = "Doctype";
    Object v4 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v3));
    Object v5 = ((java.lang.Enum)v1).equals(((java.lang.Object)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = "extended";
    Object v1 = org.jsoup.nodes.Entities.EscapeMode.valueOf(((java.lang.String)v0));
    Object v2 = "Doctype";
    Object v3 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v2));
    Object v4 = "Doctype";
    Object v5 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v4));
    Object v6 = ((java.lang.Enum)v5).getDeclaringClass();
    Object v7 = ((java.lang.Enum)v3).compareTo(((java.lang.Enum)v5));
    Object v8 = ((java.lang.Enum)v1).equals(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = "extended";
    Object v1 = org.jsoup.nodes.Entities.EscapeMode.valueOf(((java.lang.String)v0));
    Object v2 = "Doctype";
    Object v3 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v2));
    Object v4 = ((java.lang.Enum)v3).getDeclaringClass();
    Object v5 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v6 = ((java.lang.Enum)v3).equals(((java.lang.Object)v5));
    Object v7 = ((java.lang.Enum)v1).equals(((java.lang.Object)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = ",";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = "Doctype";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
    Object v2 = "Doctype";
    Object v3 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v2));
    Object v4 = ((java.lang.Enum)v1).compareTo(((java.lang.Enum)v3));
    Object v5 = "objecQt";
    Object v6 = new org.jsoup.parser.CharacterReader(((java.lang.String)v5));
    Object v7 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v8 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v6),((org.jsoup.parser.ParseErrorList)v7));
    Object v9 = "objecQt";
    Object v10 = new org.jsoup.parser.CharacterReader(((java.lang.String)v9));
    ((org.jsoup.parser.TokeniserState)v1).read(((org.jsoup.parser.Tokeniser)v8),((org.jsoup.parser.CharacterReader)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = "colgroup";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = "able";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = "Doctype";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = "objecQt";
    Object v4 = new org.jsoup.parser.CharacterReader(((java.lang.String)v3));
    Object v5 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v6 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v4),((org.jsoup.parser.ParseErrorList)v5));
    Object v7 = "objecQt";
    Object v8 = new org.jsoup.parser.CharacterReader(((java.lang.String)v7));
    ((org.jsoup.parser.TokeniserState)v1).read(((org.jsoup.parser.Tokeniser)v6),((org.jsoup.parser.CharacterReader)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = "Doctype";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = "captio";
    Object v4 = java.lang.Enum.valueOf(((java.lang.Class)v2),((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = "extended";
    Object v1 = org.jsoup.nodes.Entities.EscapeMode.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = "dd";
    Object v4 = java.lang.Enum.valueOf(((java.lang.Class)v2),((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = "extended";
    Object v1 = org.jsoup.nodes.Entities.EscapeMode.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).hashCode();
    org.junit.Assert.assertEquals((Object)(1579780558), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = "poGintint";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = "Dsdtrok";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }
}
