package org.jsoup.parser;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = org.jsoup.parser.TokeniserState.ScriptDataEscapedLessthanSign;
    Object v1 = "Qth";
    Object v2 = new org.jsoup.parser.CharacterReader(((java.lang.String)v1));
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v2));
    Object v4 = "Qth";
    Object v5 = new org.jsoup.parser.CharacterReader(((java.lang.String)v4));
    ((org.jsoup.parser.TokeniserState)v0).read(((org.jsoup.parser.Tokeniser)v3),((org.jsoup.parser.CharacterReader)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = org.jsoup.parser.TokeniserState.RawtextEndTagOpen;
    Object v1 = "Qth";
    Object v2 = new org.jsoup.parser.CharacterReader(((java.lang.String)v1));
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v2));
    Object v4 = "Qth";
    Object v5 = new org.jsoup.parser.CharacterReader(((java.lang.String)v4));
    ((org.jsoup.parser.TokeniserState)v0).read(((org.jsoup.parser.Tokeniser)v3),((org.jsoup.parser.CharacterReader)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = org.jsoup.parser.TokeniserState.values();
    org.junit.Assert.assertNotNull(v0);
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
    try {
    Object v0 = "tr";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = org.jsoup.parser.TokeniserState.CommentEnd;
    Object v1 = ((java.lang.Enum)v0).getDeclaringClass();
    Object v2 = "Qth";
    Object v3 = new org.jsoup.parser.CharacterReader(((java.lang.String)v2));
    Object v4 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v3));
    Object v5 = "Qth";
    Object v6 = new org.jsoup.parser.CharacterReader(((java.lang.String)v5));
    ((org.jsoup.parser.TokeniserState)v0).read(((org.jsoup.parser.Tokeniser)v4),((org.jsoup.parser.CharacterReader)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = "tfoot";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = "tb";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = org.jsoup.parser.TokeniserState.AfterDoctypeName;
    Object v1 = ((java.lang.Enum)v0).hashCode();
    Object v2 = "Qth";
    Object v3 = new org.jsoup.parser.CharacterReader(((java.lang.String)v2));
    Object v4 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v3));
    Object v5 = "Qth";
    Object v6 = new org.jsoup.parser.CharacterReader(((java.lang.String)v5));
    ((org.jsoup.parser.TokeniserState)v0).read(((org.jsoup.parser.Tokeniser)v4),((org.jsoup.parser.CharacterReader)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = "class";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = "colgroup";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = "htm";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = "code";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = org.jsoup.parser.TokeniserState.ScriptDataDoubleEscapedDash;
    Object v1 = "Qth";
    Object v2 = new org.jsoup.parser.CharacterReader(((java.lang.String)v1));
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v2));
    Object v4 = "Qth";
    Object v5 = new org.jsoup.parser.CharacterReader(((java.lang.String)v4));
    ((org.jsoup.parser.TokeniserState)v0).read(((org.jsoup.parser.Tokeniser)v3),((org.jsoup.parser.CharacterReader)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = org.jsoup.parser.TokeniserState.AttributeValue_singleQuoted;
    Object v1 = "Qth";
    Object v2 = new org.jsoup.parser.CharacterReader(((java.lang.String)v1));
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v2));
    Object v4 = "Qth";
    Object v5 = new org.jsoup.parser.CharacterReader(((java.lang.String)v4));
    ((org.jsoup.parser.TokeniserState)v0).read(((org.jsoup.parser.Tokeniser)v3),((org.jsoup.parser.CharacterReader)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = org.jsoup.parser.TokeniserState.AfterAttributeValue_quoted;
    Object v1 = "Qth";
    Object v2 = new org.jsoup.parser.CharacterReader(((java.lang.String)v1));
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v2));
    Object v4 = "Qth";
    Object v5 = new org.jsoup.parser.CharacterReader(((java.lang.String)v4));
    Object v6 = ((org.jsoup.parser.CharacterReader)v5).toString();
    ((org.jsoup.parser.TokeniserState)v0).read(((org.jsoup.parser.Tokeniser)v3),((org.jsoup.parser.CharacterReader)v5));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = org.jsoup.parser.TokeniserState.Doctype;
    Object v1 = ((java.lang.Enum)v0).getDeclaringClass();
    Object v2 = "Qth";
    Object v3 = new org.jsoup.parser.CharacterReader(((java.lang.String)v2));
    Object v4 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v3));
    Object v5 = "Qth";
    Object v6 = new org.jsoup.parser.CharacterReader(((java.lang.String)v5));
    ((org.jsoup.parser.TokeniserState)v0).read(((org.jsoup.parser.Tokeniser)v4),((org.jsoup.parser.CharacterReader)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = org.jsoup.parser.TokeniserState.MarkupDeclarationOpen;
    Object v1 = "Qth";
    Object v2 = new org.jsoup.parser.CharacterReader(((java.lang.String)v1));
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v2));
    Object v4 = "Qth";
    Object v5 = new org.jsoup.parser.CharacterReader(((java.lang.String)v4));
    ((org.jsoup.parser.TokeniserState)v0).read(((org.jsoup.parser.Tokeniser)v3),((org.jsoup.parser.CharacterReader)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = org.jsoup.parser.TokeniserState.DoctypeSystemIdentifier_doubleQuoted;
    Object v1 = "Qth";
    Object v2 = new org.jsoup.parser.CharacterReader(((java.lang.String)v1));
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v2));
    Object v4 = "Qth";
    Object v5 = new org.jsoup.parser.CharacterReader(((java.lang.String)v4));
    ((org.jsoup.parser.TokeniserState)v0).read(((org.jsoup.parser.Tokeniser)v3),((org.jsoup.parser.CharacterReader)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = "parsim";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = org.jsoup.parser.TokeniserState.DoctypePublicIdentifier_singleQuoted;
    Object v1 = "Qth";
    Object v2 = new org.jsoup.parser.CharacterReader(((java.lang.String)v1));
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v2));
    Object v4 = "Qth";
    Object v5 = new org.jsoup.parser.CharacterReader(((java.lang.String)v4));
    ((org.jsoup.parser.TokeniserState)v0).read(((org.jsoup.parser.Tokeniser)v3),((org.jsoup.parser.CharacterReader)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = "figcaption";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = org.jsoup.parser.TokeniserState.TagName;
    Object v1 = ((java.lang.Enum)v0).getDeclaringClass();
    Object v2 = "Qth";
    Object v3 = new org.jsoup.parser.CharacterReader(((java.lang.String)v2));
    Object v4 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v3));
    Object v5 = "Qth";
    Object v6 = new org.jsoup.parser.CharacterReader(((java.lang.String)v5));
    ((org.jsoup.parser.TokeniserState)v0).read(((org.jsoup.parser.Tokeniser)v4),((org.jsoup.parser.CharacterReader)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = org.jsoup.parser.TokeniserState.ScriptDataEscapedEndTagOpen;
    Object v1 = "Qth";
    Object v2 = new org.jsoup.parser.CharacterReader(((java.lang.String)v1));
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v2));
    Object v4 = "Qth";
    Object v5 = new org.jsoup.parser.CharacterReader(((java.lang.String)v4));
    ((org.jsoup.parser.TokeniserState)v0).read(((org.jsoup.parser.Tokeniser)v3),((org.jsoup.parser.CharacterReader)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = org.jsoup.parser.TokeniserState.AttributeValue_unquoted;
    Object v1 = "Qth";
    Object v2 = new org.jsoup.parser.CharacterReader(((java.lang.String)v1));
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v2));
    Object v4 = "Qth";
    Object v5 = new org.jsoup.parser.CharacterReader(((java.lang.String)v4));
    ((org.jsoup.parser.TokeniserState)v0).read(((org.jsoup.parser.Tokeniser)v3),((org.jsoup.parser.CharacterReader)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = org.jsoup.parser.TokeniserState.RcdataLessthanSign;
    Object v1 = "Qth";
    Object v2 = new org.jsoup.parser.CharacterReader(((java.lang.String)v1));
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v2));
    Object v4 = "Qth";
    Object v5 = new org.jsoup.parser.CharacterReader(((java.lang.String)v4));
    ((org.jsoup.parser.TokeniserState)v0).read(((org.jsoup.parser.Tokeniser)v3),((org.jsoup.parser.CharacterReader)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = "colgProup";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = "button";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = org.jsoup.parser.TokeniserState.AfterAttributeName;
    Object v1 = ((java.lang.Enum)v0).hashCode();
    Object v2 = "Qth";
    Object v3 = new org.jsoup.parser.CharacterReader(((java.lang.String)v2));
    Object v4 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v3));
    Object v5 = "Qth";
    Object v6 = new org.jsoup.parser.CharacterReader(((java.lang.String)v5));
    ((org.jsoup.parser.TokeniserState)v0).read(((org.jsoup.parser.Tokeniser)v4),((org.jsoup.parser.CharacterReader)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = "base";
    Object v1 = org.jsoup.nodes.Entities.EscapeMode.valueOf(((java.lang.String)v0));
    Object v2 = "base";
    Object v3 = org.jsoup.nodes.Entities.EscapeMode.valueOf(((java.lang.String)v2));
    Object v4 = ((java.lang.Enum)v1).compareTo(((java.lang.Enum)v3));
    org.junit.Assert.assertEquals((Object)(0), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = "td";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = "base";
    Object v1 = org.jsoup.nodes.Entities.EscapeMode.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = "ul";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = org.jsoup.parser.TokeniserState.AfterDoctypePublicIdentifier;
    Object v1 = "Qth";
    Object v2 = new org.jsoup.parser.CharacterReader(((java.lang.String)v1));
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v2));
    Object v4 = "Qth";
    Object v5 = new org.jsoup.parser.CharacterReader(((java.lang.String)v4));
    ((org.jsoup.parser.TokeniserState)v0).read(((org.jsoup.parser.Tokeniser)v3),((org.jsoup.parser.CharacterReader)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = org.jsoup.parser.TokeniserState.AfterDoctypePublicIdentifier;
    Object v1 = "Qth";
    Object v2 = new org.jsoup.parser.CharacterReader(((java.lang.String)v1));
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v2));
    Object v4 = "Qth";
    Object v5 = new org.jsoup.parser.CharacterReader(((java.lang.String)v4));
    Object v6 = ((org.jsoup.parser.CharacterReader)v5).toString();
    ((org.jsoup.parser.TokeniserState)v0).read(((org.jsoup.parser.Tokeniser)v3),((org.jsoup.parser.CharacterReader)v5));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = "base";
    Object v1 = org.jsoup.nodes.Entities.EscapeMode.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = "h2";
    Object v4 = java.lang.Enum.valueOf(((java.lang.Class)v2),((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = "base";
    Object v1 = org.jsoup.nodes.Entities.EscapeMode.valueOf(((java.lang.String)v0));
    Object v2 = "base";
    Object v3 = org.jsoup.nodes.Entities.EscapeMode.valueOf(((java.lang.String)v2));
    Object v4 = ((java.lang.Enum)v1).compareTo(((java.lang.Enum)v3));
    Object v5 = "base";
    Object v6 = org.jsoup.nodes.Entities.EscapeMode.valueOf(((java.lang.String)v5));
    Object v7 = ((java.lang.Enum)v1).equals(((java.lang.Object)v6));
    org.junit.Assert.assertEquals((Object)(true), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = "base";
    Object v1 = org.jsoup.nodes.Entities.EscapeMode.valueOf(((java.lang.String)v0));
    Object v2 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v3 = ((java.lang.Enum)v1).equals(((java.lang.Object)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = "base";
    Object v1 = org.jsoup.nodes.Entities.EscapeMode.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = "htmld";
    Object v4 = java.lang.Enum.valueOf(((java.lang.Class)v2),((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = org.jsoup.parser.TokeniserState.Comment;
    Object v1 = ((java.lang.Enum)v0).hashCode();
    Object v2 = "Qth";
    Object v3 = new org.jsoup.parser.CharacterReader(((java.lang.String)v2));
    Object v4 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v3));
    Object v5 = "Qth";
    Object v6 = new org.jsoup.parser.CharacterReader(((java.lang.String)v5));
    ((org.jsoup.parser.TokeniserState)v0).read(((org.jsoup.parser.Tokeniser)v4),((org.jsoup.parser.CharacterReader)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = "base";
    Object v1 = org.jsoup.nodes.Entities.EscapeMode.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).name();
    org.junit.Assert.assertEquals((Object)("base"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = "base";
    Object v1 = org.jsoup.nodes.Entities.EscapeMode.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).hashCode();
    Object v3 = "base";
    Object v4 = org.jsoup.nodes.Entities.EscapeMode.valueOf(((java.lang.String)v3));
    Object v5 = ((java.lang.Enum)v1).compareTo(((java.lang.Enum)v4));
    org.junit.Assert.assertEquals((Object)(0), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = "base";
    Object v1 = org.jsoup.nodes.Entities.EscapeMode.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = "captioNn";
    Object v4 = java.lang.Enum.valueOf(((java.lang.Class)v2),((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = "base";
    Object v1 = org.jsoup.nodes.Entities.EscapeMode.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = "base";
    Object v4 = org.jsoup.nodes.Entities.EscapeMode.valueOf(((java.lang.String)v3));
    Object v5 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v6 = ((java.lang.Enum)v4).equals(((java.lang.Object)v5));
    Object v7 = ((java.lang.Enum)v1).equals(((java.lang.Object)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = "base";
    Object v1 = org.jsoup.nodes.Entities.EscapeMode.valueOf(((java.lang.String)v0));
    Object v2 = "base";
    Object v3 = org.jsoup.nodes.Entities.EscapeMode.valueOf(((java.lang.String)v2));
    Object v4 = ((java.lang.Enum)v3).name();
    Object v5 = ((java.lang.Enum)v1).equals(((java.lang.Object)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = org.jsoup.parser.TokeniserState.ScriptDataDoubleEscaped;
    Object v1 = "Qth";
    Object v2 = new org.jsoup.parser.CharacterReader(((java.lang.String)v1));
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v2));
    Object v4 = "Qth";
    Object v5 = new org.jsoup.parser.CharacterReader(((java.lang.String)v4));
    Object v6 = ((org.jsoup.parser.CharacterReader)v5).toString();
    ((org.jsoup.parser.TokeniserState)v0).read(((org.jsoup.parser.Tokeniser)v3),((org.jsoup.parser.CharacterReader)v5));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = "base";
    Object v1 = org.jsoup.nodes.Entities.EscapeMode.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).hashCode();
    Object v3 = ((java.lang.Enum)v1).getDeclaringClass();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = "base";
    Object v1 = org.jsoup.nodes.Entities.EscapeMode.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).hashCode();
    Object v3 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v4 = "meta";
    Object v5 = java.lang.Enum.valueOf(((java.lang.Class)v3),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = org.jsoup.parser.TokeniserState.Data;
    Object v1 = "Qth";
    Object v2 = new org.jsoup.parser.CharacterReader(((java.lang.String)v1));
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v2));
    Object v4 = "Qth";
    Object v5 = new org.jsoup.parser.CharacterReader(((java.lang.String)v4));
    ((org.jsoup.parser.TokeniserState)v0).read(((org.jsoup.parser.Tokeniser)v3),((org.jsoup.parser.CharacterReader)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = "base";
    Object v1 = org.jsoup.nodes.Entities.EscapeMode.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).hashCode();
    Object v3 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v4 = "table";
    Object v5 = java.lang.Enum.valueOf(((java.lang.Class)v3),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = "base";
    Object v1 = org.jsoup.nodes.Entities.EscapeMode.valueOf(((java.lang.String)v0));
    Object v2 = "base";
    Object v3 = org.jsoup.nodes.Entities.EscapeMode.valueOf(((java.lang.String)v2));
    Object v4 = ((java.lang.Enum)v1).equals(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = "br";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = "base";
    Object v1 = org.jsoup.nodes.Entities.EscapeMode.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).toString();
    org.junit.Assert.assertEquals((Object)("base"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = "i";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = org.jsoup.parser.TokeniserState.ScriptDataEscapeStart;
    Object v1 = "Qth";
    Object v2 = new org.jsoup.parser.CharacterReader(((java.lang.String)v1));
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v2));
    Object v4 = "Qth";
    Object v5 = new org.jsoup.parser.CharacterReader(((java.lang.String)v4));
    ((org.jsoup.parser.TokeniserState)v0).read(((org.jsoup.parser.Tokeniser)v3),((org.jsoup.parser.CharacterReader)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = "base";
    Object v1 = org.jsoup.nodes.Entities.EscapeMode.valueOf(((java.lang.String)v0));
    Object v2 = "base";
    Object v3 = org.jsoup.nodes.Entities.EscapeMode.valueOf(((java.lang.String)v2));
    Object v4 = "base";
    Object v5 = org.jsoup.nodes.Entities.EscapeMode.valueOf(((java.lang.String)v4));
    Object v6 = ((java.lang.Enum)v3).compareTo(((java.lang.Enum)v5));
    Object v7 = ((java.lang.Enum)v1).compareTo(((java.lang.Enum)v3));
    org.junit.Assert.assertEquals((Object)(0), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = org.jsoup.parser.TokeniserState.DoctypeName;
    Object v1 = "Qth";
    Object v2 = new org.jsoup.parser.CharacterReader(((java.lang.String)v1));
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v2));
    Object v4 = "Qth";
    Object v5 = new org.jsoup.parser.CharacterReader(((java.lang.String)v4));
    ((org.jsoup.parser.TokeniserState)v0).read(((org.jsoup.parser.Tokeniser)v3),((org.jsoup.parser.CharacterReader)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = "h1";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = "base";
    Object v1 = org.jsoup.nodes.Entities.EscapeMode.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).hashCode();
    Object v3 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v4 = "tabl";
    Object v5 = java.lang.Enum.valueOf(((java.lang.Class)v3),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = "base";
    Object v1 = org.jsoup.nodes.Entities.EscapeMode.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).hashCode();
    Object v3 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v4 = ((java.lang.Class)v3).getGenericSuperclass();
    Object v5 = "t\"ead";
    Object v6 = java.lang.Enum.valueOf(((java.lang.Class)v3),((java.lang.String)v5));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = org.jsoup.parser.TokeniserState.SelfClosingStartTag;
    Object v1 = "Qth";
    Object v2 = new org.jsoup.parser.CharacterReader(((java.lang.String)v1));
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v2));
    Object v4 = "Qth";
    Object v5 = new org.jsoup.parser.CharacterReader(((java.lang.String)v4));
    ((org.jsoup.parser.TokeniserState)v0).read(((org.jsoup.parser.Tokeniser)v3),((org.jsoup.parser.CharacterReader)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = "caption";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = "base";
    Object v1 = org.jsoup.nodes.Entities.EscapeMode.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).hashCode();
    org.junit.Assert.assertEquals((Object)(1528176988), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = "This is a searchable index. Enter search keywords: ";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = "base";
    Object v1 = org.jsoup.nodes.Entities.EscapeMode.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).hashCode();
    Object v3 = org.jsoup.parser.TokeniserState.values();
    Object v4 = ((java.lang.Enum)v1).equals(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = "base";
    Object v1 = org.jsoup.nodes.Entities.EscapeMode.valueOf(((java.lang.String)v0));
    Object v2 = "base";
    Object v3 = org.jsoup.nodes.Entities.EscapeMode.valueOf(((java.lang.String)v2));
    Object v4 = "base";
    Object v5 = org.jsoup.nodes.Entities.EscapeMode.valueOf(((java.lang.String)v4));
    Object v6 = ((java.lang.Enum)v3).equals(((java.lang.Object)v5));
    Object v7 = ((java.lang.Enum)v1).equals(((java.lang.Object)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = "base";
    Object v1 = org.jsoup.nodes.Entities.EscapeMode.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = "base";
    Object v4 = org.jsoup.nodes.Entities.EscapeMode.valueOf(((java.lang.String)v3));
    Object v5 = ((java.lang.Enum)v1).compareTo(((java.lang.Enum)v4));
    org.junit.Assert.assertEquals((Object)(0), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = "base";
    Object v1 = org.jsoup.nodes.Entities.EscapeMode.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).hashCode();
    Object v3 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v4 = "body";
    Object v5 = java.lang.Enum.valueOf(((java.lang.Class)v3),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = org.jsoup.parser.TokeniserState.ScriptDataEscapedDash;
    Object v1 = "Qth";
    Object v2 = new org.jsoup.parser.CharacterReader(((java.lang.String)v1));
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v2));
    Object v4 = "Qth";
    Object v5 = new org.jsoup.parser.CharacterReader(((java.lang.String)v4));
    ((org.jsoup.parser.TokeniserState)v0).read(((org.jsoup.parser.Tokeniser)v3),((org.jsoup.parser.CharacterReader)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = "base";
    Object v1 = org.jsoup.nodes.Entities.EscapeMode.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).hashCode();
    Object v3 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v4 = "html";
    Object v5 = java.lang.Enum.valueOf(((java.lang.Class)v3),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = org.jsoup.parser.TokeniserState.CommentEndBang;
    Object v1 = ((java.lang.Enum)v0).getDeclaringClass();
    Object v2 = "Qth";
    Object v3 = new org.jsoup.parser.CharacterReader(((java.lang.String)v2));
    Object v4 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v3));
    Object v5 = "Qth";
    Object v6 = new org.jsoup.parser.CharacterReader(((java.lang.String)v5));
    ((org.jsoup.parser.TokeniserState)v0).read(((org.jsoup.parser.Tokeniser)v4),((org.jsoup.parser.CharacterReader)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = "base";
    Object v1 = org.jsoup.nodes.Entities.EscapeMode.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).ordinal();
    org.junit.Assert.assertEquals((Object)(1), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = "base";
    Object v1 = org.jsoup.nodes.Entities.EscapeMode.valueOf(((java.lang.String)v0));
    Object v2 = "base";
    Object v3 = org.jsoup.nodes.Entities.EscapeMode.valueOf(((java.lang.String)v2));
    Object v4 = ((java.lang.Enum)v1).compareTo(((java.lang.Enum)v3));
    Object v5 = ((java.lang.Enum)v1).toString();
    org.junit.Assert.assertEquals((Object)("base"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = "html";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = org.jsoup.parser.TokeniserState.ScriptDataEscapeStartDash;
    Object v1 = "Qth";
    Object v2 = new org.jsoup.parser.CharacterReader(((java.lang.String)v1));
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v2));
    Object v4 = "Qth";
    Object v5 = new org.jsoup.parser.CharacterReader(((java.lang.String)v4));
    ((org.jsoup.parser.TokeniserState)v0).read(((org.jsoup.parser.Tokeniser)v3),((org.jsoup.parser.CharacterReader)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = org.jsoup.parser.TokeniserState.CommentEnd;
    Object v1 = "Qth";
    Object v2 = new org.jsoup.parser.CharacterReader(((java.lang.String)v1));
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v2));
    Object v4 = "Qth";
    Object v5 = new org.jsoup.parser.CharacterReader(((java.lang.String)v4));
    ((org.jsoup.parser.TokeniserState)v0).read(((org.jsoup.parser.Tokeniser)v3),((org.jsoup.parser.CharacterReader)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = org.jsoup.parser.TokeniserState.BeforeDoctypePublicIdentifier;
    Object v1 = "Qth";
    Object v2 = new org.jsoup.parser.CharacterReader(((java.lang.String)v1));
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v2));
    Object v4 = "Qth";
    Object v5 = new org.jsoup.parser.CharacterReader(((java.lang.String)v4));
    Object v6 = ((org.jsoup.parser.CharacterReader)v5).toString();
    ((org.jsoup.parser.TokeniserState)v0).read(((org.jsoup.parser.Tokeniser)v3),((org.jsoup.parser.CharacterReader)v5));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = org.jsoup.parser.TokeniserState.BeforeAttributeName;
    Object v1 = "Qth";
    Object v2 = new org.jsoup.parser.CharacterReader(((java.lang.String)v1));
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v2));
    Object v4 = "Qth";
    Object v5 = new org.jsoup.parser.CharacterReader(((java.lang.String)v4));
    Object v6 = ((org.jsoup.parser.CharacterReader)v5).toString();
    ((org.jsoup.parser.TokeniserState)v0).read(((org.jsoup.parser.Tokeniser)v3),((org.jsoup.parser.CharacterReader)v5));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = "base";
    Object v1 = org.jsoup.nodes.Entities.EscapeMode.valueOf(((java.lang.String)v0));
    Object v2 = "base";
    Object v3 = org.jsoup.nodes.Entities.EscapeMode.valueOf(((java.lang.String)v2));
    Object v4 = ((java.lang.Enum)v1).compareTo(((java.lang.Enum)v3));
    Object v5 = ((java.lang.Enum)v1).getDeclaringClass();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = "base";
    Object v1 = org.jsoup.nodes.Entities.EscapeMode.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = "table";
    Object v4 = java.lang.Enum.valueOf(((java.lang.Class)v2),((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = "base";
    Object v1 = org.jsoup.nodes.Entities.EscapeMode.valueOf(((java.lang.String)v0));
    Object v2 = "base";
    Object v3 = org.jsoup.nodes.Entities.EscapeMode.valueOf(((java.lang.String)v2));
    Object v4 = ((java.lang.Enum)v1).compareTo(((java.lang.Enum)v3));
    Object v5 = "base";
    Object v6 = org.jsoup.nodes.Entities.EscapeMode.valueOf(((java.lang.String)v5));
    Object v7 = ((java.lang.Enum)v1).compareTo(((java.lang.Enum)v6));
    org.junit.Assert.assertEquals((Object)(0), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = org.jsoup.parser.TokeniserState.AfterDoctypeSystemIdentifier;
    Object v1 = "Qth";
    Object v2 = new org.jsoup.parser.CharacterReader(((java.lang.String)v1));
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v2));
    Object v4 = "Qth";
    Object v5 = new org.jsoup.parser.CharacterReader(((java.lang.String)v4));
    ((org.jsoup.parser.TokeniserState)v0).read(((org.jsoup.parser.Tokeniser)v3),((org.jsoup.parser.CharacterReader)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = "base";
    Object v1 = org.jsoup.nodes.Entities.EscapeMode.valueOf(((java.lang.String)v0));
    Object v2 = "base";
    Object v3 = org.jsoup.nodes.Entities.EscapeMode.valueOf(((java.lang.String)v2));
    Object v4 = ((java.lang.Enum)v3).getDeclaringClass();
    Object v5 = ((java.lang.Enum)v1).compareTo(((java.lang.Enum)v3));
    org.junit.Assert.assertEquals((Object)(0), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = "base";
    Object v1 = org.jsoup.nodes.Entities.EscapeMode.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).hashCode();
    Object v3 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v4 = "Rwtext";
    Object v5 = java.lang.Enum.valueOf(((java.lang.Class)v3),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = org.jsoup.parser.TokeniserState.BeforeDoctypePublicIdentifier;
    Object v1 = "Qth";
    Object v2 = new org.jsoup.parser.CharacterReader(((java.lang.String)v1));
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v2));
    Object v4 = "Qth";
    Object v5 = new org.jsoup.parser.CharacterReader(((java.lang.String)v4));
    ((org.jsoup.parser.TokeniserState)v0).read(((org.jsoup.parser.Tokeniser)v3),((org.jsoup.parser.CharacterReader)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = "P.";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = "base";
    Object v1 = org.jsoup.nodes.Entities.EscapeMode.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).hashCode();
    Object v3 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v4 = "";
    Object v5 = java.lang.Enum.valueOf(((java.lang.Class)v3),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = "prompt";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = "base";
    Object v1 = org.jsoup.nodes.Entities.EscapeMode.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).hashCode();
    Object v3 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v4 = "thead";
    Object v5 = java.lang.Enum.valueOf(((java.lang.Class)v3),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = "h-";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = "a";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = "base";
    Object v1 = org.jsoup.nodes.Entities.EscapeMode.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).hashCode();
    Object v3 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v4 = "img";
    Object v5 = java.lang.Enum.valueOf(((java.lang.Class)v3),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = "base";
    Object v1 = org.jsoup.nodes.Entities.EscapeMode.valueOf(((java.lang.String)v0));
    Object v2 = "base";
    Object v3 = org.jsoup.nodes.Entities.EscapeMode.valueOf(((java.lang.String)v2));
    Object v4 = ((java.lang.Enum)v1).compareTo(((java.lang.Enum)v3));
    Object v5 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v6 = "tfoot";
    Object v7 = java.lang.Enum.valueOf(((java.lang.Class)v5),((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = "base";
    Object v1 = org.jsoup.nodes.Entities.EscapeMode.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).hashCode();
    Object v3 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v4 = "esim";
    Object v5 = java.lang.Enum.valueOf(((java.lang.Class)v3),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = "base";
    Object v1 = org.jsoup.nodes.Entities.EscapeMode.valueOf(((java.lang.String)v0));
    Object v2 = org.jsoup.parser.TokeniserState.values();
    Object v3 = ((java.lang.Enum)v1).equals(((java.lang.Object)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = org.jsoup.parser.TokeniserState.CommentStart;
    Object v1 = "Qth";
    Object v2 = new org.jsoup.parser.CharacterReader(((java.lang.String)v1));
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v2));
    Object v4 = "Qth";
    Object v5 = new org.jsoup.parser.CharacterReader(((java.lang.String)v4));
    ((org.jsoup.parser.TokeniserState)v0).read(((org.jsoup.parser.Tokeniser)v3),((org.jsoup.parser.CharacterReader)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = "thead";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = "tbody";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = org.jsoup.parser.TokeniserState.CdataSection;
    Object v1 = "Qth";
    Object v2 = new org.jsoup.parser.CharacterReader(((java.lang.String)v1));
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v2));
    Object v4 = "Qth";
    Object v5 = new org.jsoup.parser.CharacterReader(((java.lang.String)v4));
    ((org.jsoup.parser.TokeniserState)v0).read(((org.jsoup.parser.Tokeniser)v3),((org.jsoup.parser.CharacterReader)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = "base";
    Object v1 = org.jsoup.nodes.Entities.EscapeMode.valueOf(((java.lang.String)v0));
    Object v2 = "base";
    Object v3 = org.jsoup.nodes.Entities.EscapeMode.valueOf(((java.lang.String)v2));
    Object v4 = "base";
    Object v5 = org.jsoup.nodes.Entities.EscapeMode.valueOf(((java.lang.String)v4));
    Object v6 = ((java.lang.Enum)v5).name();
    Object v7 = ((java.lang.Enum)v3).equals(((java.lang.Object)v6));
    Object v8 = ((java.lang.Enum)v1).equals(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }
}
