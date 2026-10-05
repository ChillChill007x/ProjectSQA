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
    Object v0 = "h";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = org.jsoup.parser.TokeniserState.AttributeValue_unquoted;
    Object v1 = "Qbasefont";
    Object v2 = new org.jsoup.parser.CharacterReader(((java.lang.String)v1));
    Object v3 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v4 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v2),((org.jsoup.parser.ParseErrorList)v3));
    Object v5 = "Qbasefont";
    Object v6 = new org.jsoup.parser.CharacterReader(((java.lang.String)v5));
    Object v7 = ((org.jsoup.parser.CharacterReader)v6).toString();
    ((org.jsoup.parser.TokeniserState)v0).read(((org.jsoup.parser.Tokeniser)v4),((org.jsoup.parser.CharacterReader)v6));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = org.jsoup.parser.TokeniserState.values();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "";
    Object v2 = java.lang.Enum.valueOf(((java.lang.Class)v0),((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = "InSelectInTable";
    Object v1 = org.jsoup.parser.HtmlTreeBuilderState.valueOf(((java.lang.String)v0));
    Object v2 = "InSelectInTable";
    Object v3 = org.jsoup.parser.HtmlTreeBuilderState.valueOf(((java.lang.String)v2));
    Object v4 = ((java.lang.Enum)v1).compareTo(((java.lang.Enum)v3));
    org.junit.Assert.assertEquals((Object)(0), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = "InSelectInTable";
    Object v1 = org.jsoup.parser.HtmlTreeBuilderState.valueOf(((java.lang.String)v0));
    Object v2 = "Qbasefont";
    Object v3 = new org.jsoup.parser.CharacterReader(((java.lang.String)v2));
    Object v4 = ((java.lang.Enum)v1).equals(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = org.jsoup.parser.TokeniserState.BeforeAttributeName;
    Object v1 = "Qbasefont";
    Object v2 = new org.jsoup.parser.CharacterReader(((java.lang.String)v1));
    Object v3 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v4 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v2),((org.jsoup.parser.ParseErrorList)v3));
    Object v5 = "Qbasefont";
    Object v6 = new org.jsoup.parser.CharacterReader(((java.lang.String)v5));
    Object v7 = ((org.jsoup.parser.CharacterReader)v6).toString();
    ((org.jsoup.parser.TokeniserState)v0).read(((org.jsoup.parser.Tokeniser)v4),((org.jsoup.parser.CharacterReader)v6));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = "InSelectInTable";
    Object v1 = org.jsoup.parser.HtmlTreeBuilderState.valueOf(((java.lang.String)v0));
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = ((java.lang.Enum)v1).equals(((java.lang.Object)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = "InSelectInTable";
    Object v1 = org.jsoup.parser.HtmlTreeBuilderState.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = "InSelectInTable";
    Object v1 = org.jsoup.parser.HtmlTreeBuilderState.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).ordinal();
    org.junit.Assert.assertEquals((Object)(16), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = "InSelectInTable";
    Object v1 = org.jsoup.parser.HtmlTreeBuilderState.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).name();
    org.junit.Assert.assertEquals((Object)("InSelectInTable"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = "InSelectInTable";
    Object v1 = org.jsoup.parser.HtmlTreeBuilderState.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).hashCode();
    org.junit.Assert.assertEquals((Object)(1492222321), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = "InSelectInTable";
    Object v1 = org.jsoup.parser.HtmlTreeBuilderState.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = "data-";
    Object v4 = java.lang.Enum.valueOf(((java.lang.Class)v2),((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = "InSelectInTable";
    Object v1 = org.jsoup.parser.HtmlTreeBuilderState.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = ((java.lang.Class)v2).getSigners();
    Object v4 = "p";
    Object v5 = java.lang.Enum.valueOf(((java.lang.Class)v2),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = "meta";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = org.jsoup.parser.TokeniserState.Rcdata;
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
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = "InSelectInTable";
    Object v1 = org.jsoup.parser.HtmlTreeBuilderState.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).hashCode();
    Object v3 = ((java.lang.Enum)v1).toString();
    org.junit.Assert.assertEquals((Object)("InSelectInTable"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = "InSelectInTable";
    Object v1 = org.jsoup.parser.HtmlTreeBuilderState.valueOf(((java.lang.String)v0));
    Object v2 = "InSelectInTable";
    Object v3 = org.jsoup.parser.HtmlTreeBuilderState.valueOf(((java.lang.String)v2));
    Object v4 = ((java.lang.Enum)v3).hashCode();
    Object v5 = ((java.lang.Enum)v1).compareTo(((java.lang.Enum)v3));
    org.junit.Assert.assertEquals((Object)(0), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = "InSelectInTable";
    Object v1 = org.jsoup.parser.HtmlTreeBuilderState.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = ((java.lang.Class)v2).getName();
    Object v4 = "noframes";
    Object v5 = java.lang.Enum.valueOf(((java.lang.Class)v2),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = org.jsoup.parser.TokeniserState.TagOpen;
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
  public void test22() throws Throwable {
    try {
    Object v0 = "</";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = "InSelectInTable";
    Object v1 = org.jsoup.parser.HtmlTreeBuilderState.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = "tb1dy";
    Object v4 = java.lang.Enum.valueOf(((java.lang.Class)v2),((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = "InSelectInTable";
    Object v1 = org.jsoup.parser.HtmlTreeBuilderState.valueOf(((java.lang.String)v0));
    Object v2 = "InSelectInTable";
    Object v3 = org.jsoup.parser.HtmlTreeBuilderState.valueOf(((java.lang.String)v2));
    Object v4 = "InSelectInTable";
    Object v5 = org.jsoup.parser.HtmlTreeBuilderState.valueOf(((java.lang.String)v4));
    Object v6 = ((java.lang.Enum)v5).hashCode();
    Object v7 = ((java.lang.Enum)v3).compareTo(((java.lang.Enum)v5));
    Object v8 = ((java.lang.Enum)v1).equals(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = org.jsoup.parser.TokeniserState.CommentStart;
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
  public void test26() throws Throwable {
    try {
    Object v0 = "InSelectInTable";
    Object v1 = org.jsoup.parser.HtmlTreeBuilderState.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = ((java.lang.Class)v2).getGenericSuperclass();
    Object v4 = "width";
    Object v5 = java.lang.Enum.valueOf(((java.lang.Class)v2),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = "htm";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = "InSelectInTable";
    Object v1 = org.jsoup.parser.HtmlTreeBuilderState.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).hashCode();
    Object v3 = ((java.lang.Enum)v1).hashCode();
    org.junit.Assert.assertEquals((Object)(1492222321), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = "Qref";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = "InSelectInTable";
    Object v1 = org.jsoup.parser.HtmlTreeBuilderState.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = "t";
    Object v4 = java.lang.Enum.valueOf(((java.lang.Class)v2),((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = org.jsoup.parser.TokeniserState.PLAINTEXT;
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
  public void test32() throws Throwable {
    Object v0 = "InSelectInTable";
    Object v1 = org.jsoup.parser.HtmlTreeBuilderState.valueOf(((java.lang.String)v0));
    Object v2 = "InSelectInTable";
    Object v3 = org.jsoup.parser.HtmlTreeBuilderState.valueOf(((java.lang.String)v2));
    Object v4 = ((java.lang.Enum)v1).compareTo(((java.lang.Enum)v3));
    Object v5 = "Qbasefont";
    Object v6 = new org.jsoup.parser.CharacterReader(((java.lang.String)v5));
    Object v7 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v8 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v6),((org.jsoup.parser.ParseErrorList)v7));
    Object v9 = ((java.lang.Enum)v1).equals(((java.lang.Object)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = "caption";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
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
  public void test35() throws Throwable {
    Object v0 = "InSelectInTable";
    Object v1 = org.jsoup.parser.HtmlTreeBuilderState.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).hashCode();
    Object v3 = "InSelectInTable";
    Object v4 = org.jsoup.parser.HtmlTreeBuilderState.valueOf(((java.lang.String)v3));
    Object v5 = ((java.lang.Enum)v1).compareTo(((java.lang.Enum)v4));
    org.junit.Assert.assertEquals((Object)(0), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = "InSelectInTable";
    Object v1 = org.jsoup.parser.HtmlTreeBuilderState.valueOf(((java.lang.String)v0));
    Object v2 = "InSelectInTable";
    Object v3 = org.jsoup.parser.HtmlTreeBuilderState.valueOf(((java.lang.String)v2));
    Object v4 = ((java.lang.Enum)v1).equals(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
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
  public void test38() throws Throwable {
    try {
    Object v0 = "InSelectInTable";
    Object v1 = org.jsoup.parser.HtmlTreeBuilderState.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = "p";
    Object v4 = java.lang.Enum.valueOf(((java.lang.Class)v2),((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
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
  public void test40() throws Throwable {
    try {
    Object v0 = "td";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
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
  public void test42() throws Throwable {
    try {
    Object v0 = "InSelectInTable";
    Object v1 = org.jsoup.parser.HtmlTreeBuilderState.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = ((java.lang.Class)v2).getTypeName();
    Object v4 = "h1";
    Object v5 = java.lang.Enum.valueOf(((java.lang.Class)v2),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = "InSelectInTable";
    Object v1 = org.jsoup.parser.HtmlTreeBuilderState.valueOf(((java.lang.String)v0));
    Object v2 = "InSelectInTable";
    Object v3 = org.jsoup.parser.HtmlTreeBuilderState.valueOf(((java.lang.String)v2));
    Object v4 = ((java.lang.Enum)v1).compareTo(((java.lang.Enum)v3));
    Object v5 = "InSelectInTable";
    Object v6 = org.jsoup.parser.HtmlTreeBuilderState.valueOf(((java.lang.String)v5));
    Object v7 = ((java.lang.Enum)v1).compareTo(((java.lang.Enum)v6));
    org.junit.Assert.assertEquals((Object)(0), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = "style";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
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
  public void test46() throws Throwable {
    try {
    Object v0 = "InSelectInTable";
    Object v1 = org.jsoup.parser.HtmlTreeBuilderState.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = "frameset";
    Object v4 = java.lang.Enum.valueOf(((java.lang.Class)v2),((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = "InSelectInTable";
    Object v1 = org.jsoup.parser.HtmlTreeBuilderState.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = "html";
    Object v4 = java.lang.Enum.valueOf(((java.lang.Class)v2),((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = "tr";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = "InSelectInTable";
    Object v1 = org.jsoup.parser.HtmlTreeBuilderState.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = ":root";
    Object v4 = java.lang.Enum.valueOf(((java.lang.Class)v2),((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = "InSelectInTable";
    Object v1 = org.jsoup.parser.HtmlTreeBuilderState.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = ((java.lang.Class)v2).getAnnotatedSuperclass();
    Object v4 = "ckaption";
    Object v5 = java.lang.Enum.valueOf(((java.lang.Class)v2),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = "InSelectInTable";
    Object v1 = org.jsoup.parser.HtmlTreeBuilderState.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = "para";
    Object v4 = java.lang.Enum.valueOf(((java.lang.Class)v2),((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
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
  public void test53() throws Throwable {
    try {
    Object v0 = "InSelectInTable";
    Object v1 = org.jsoup.parser.HtmlTreeBuilderState.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = "h";
    Object v4 = java.lang.Enum.valueOf(((java.lang.Class)v2),((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
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
  public void test55() throws Throwable {
    Object v0 = "InSelectInTable";
    Object v1 = org.jsoup.parser.HtmlTreeBuilderState.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = ((java.lang.Enum)v1).getDeclaringClass();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = "InSelectInTable";
    Object v1 = org.jsoup.parser.HtmlTreeBuilderState.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).hashCode();
    Object v3 = ((java.lang.Enum)v1).name();
    org.junit.Assert.assertEquals((Object)("InSelectInTable"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = "InSelectInTable";
    Object v1 = org.jsoup.parser.HtmlTreeBuilderState.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v4 = "ul";
    Object v5 = java.lang.Enum.valueOf(((java.lang.Class)v3),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = "InSelectInTable";
    Object v1 = org.jsoup.parser.HtmlTreeBuilderState.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v4 = ((java.lang.Class)v3).isInterface();
    Object v5 = "fr$meset";
    Object v6 = java.lang.Enum.valueOf(((java.lang.Class)v3),((java.lang.String)v5));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = "InSelectInTable";
    Object v1 = org.jsoup.parser.HtmlTreeBuilderState.valueOf(((java.lang.String)v0));
    Object v2 = "InSelectInTable";
    Object v3 = org.jsoup.parser.HtmlTreeBuilderState.valueOf(((java.lang.String)v2));
    Object v4 = ((java.lang.Enum)v3).ordinal();
    Object v5 = ((java.lang.Enum)v1).equals(((java.lang.Object)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = "InSelectInTable";
    Object v1 = org.jsoup.parser.HtmlTreeBuilderState.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = "InSelectInTable";
    Object v4 = org.jsoup.parser.HtmlTreeBuilderState.valueOf(((java.lang.String)v3));
    Object v5 = java.lang.ClassLoader.getSystemClassLoader();
    Object v6 = ((java.lang.Enum)v4).equals(((java.lang.Object)v5));
    Object v7 = ((java.lang.Enum)v1).equals(((java.lang.Object)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = "asci";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = "InSelectInTable";
    Object v1 = org.jsoup.parser.HtmlTreeBuilderState.valueOf(((java.lang.String)v0));
    Object v2 = "InSelectInTable";
    Object v3 = org.jsoup.parser.HtmlTreeBuilderState.valueOf(((java.lang.String)v2));
    Object v4 = ((java.lang.Enum)v1).compareTo(((java.lang.Enum)v3));
    Object v5 = ((java.lang.Enum)v1).getDeclaringClass();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = "InSelectInTable";
    Object v1 = org.jsoup.parser.HtmlTreeBuilderState.valueOf(((java.lang.String)v0));
    Object v2 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v3 = ((java.lang.Enum)v1).equals(((java.lang.Object)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = "InSelectInTable";
    Object v1 = org.jsoup.parser.HtmlTreeBuilderState.valueOf(((java.lang.String)v0));
    Object v2 = "InSelectInTable";
    Object v3 = org.jsoup.parser.HtmlTreeBuilderState.valueOf(((java.lang.String)v2));
    Object v4 = ((java.lang.Enum)v1).compareTo(((java.lang.Enum)v3));
    Object v5 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v6 = "";
    Object v7 = java.lang.Enum.valueOf(((java.lang.Class)v5),((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = "option";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = "InSelectInTable";
    Object v1 = org.jsoup.parser.HtmlTreeBuilderState.valueOf(((java.lang.String)v0));
    Object v2 = "InSelectInTable";
    Object v3 = org.jsoup.parser.HtmlTreeBuilderState.valueOf(((java.lang.String)v2));
    Object v4 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v5 = ((java.lang.Enum)v3).equals(((java.lang.Object)v4));
    Object v6 = ((java.lang.Enum)v1).equals(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = " * %s: <%s> %sx%s (%s)";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = "InSelectInTable";
    Object v1 = org.jsoup.parser.HtmlTreeBuilderState.valueOf(((java.lang.String)v0));
    Object v2 = org.jsoup.parser.TokeniserState.values();
    Object v3 = ((java.lang.Enum)v1).equals(((java.lang.Object)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
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
  public void test70() throws Throwable {
    Object v0 = "InSelectInTable";
    Object v1 = org.jsoup.parser.HtmlTreeBuilderState.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).hashCode();
    Object v3 = ((java.lang.Enum)v1).getDeclaringClass();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = "InSelectInTable";
    Object v1 = org.jsoup.parser.HtmlTreeBuilderState.valueOf(((java.lang.String)v0));
    Object v2 = "InSelectInTable";
    Object v3 = org.jsoup.parser.HtmlTreeBuilderState.valueOf(((java.lang.String)v2));
    Object v4 = "InSelectInTable";
    Object v5 = org.jsoup.parser.HtmlTreeBuilderState.valueOf(((java.lang.String)v4));
    Object v6 = ((java.lang.Enum)v3).compareTo(((java.lang.Enum)v5));
    Object v7 = ((java.lang.Enum)v1).compareTo(((java.lang.Enum)v3));
    org.junit.Assert.assertEquals((Object)(0), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
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
  public void test73() throws Throwable {
    Object v0 = org.jsoup.parser.TokeniserState.CommentEnd;
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
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
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

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = "InSelectInTable";
    Object v1 = org.jsoup.parser.HtmlTreeBuilderState.valueOf(((java.lang.String)v0));
    Object v2 = "InSelectInTable";
    Object v3 = org.jsoup.parser.HtmlTreeBuilderState.valueOf(((java.lang.String)v2));
    Object v4 = ((java.lang.Enum)v1).compareTo(((java.lang.Enum)v3));
    Object v5 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v6 = "caption";
    Object v7 = java.lang.Enum.valueOf(((java.lang.Class)v5),((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = "head";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = org.jsoup.parser.TokeniserState.AfterAttributeName;
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
  public void test78() throws Throwable {
    try {
    Object v0 = org.jsoup.parser.TokeniserState.BogusComment;
    Object v1 = "Qbasefont";
    Object v2 = new org.jsoup.parser.CharacterReader(((java.lang.String)v1));
    Object v3 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v4 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v2),((org.jsoup.parser.ParseErrorList)v3));
    Object v5 = "Qbasefont";
    Object v6 = new org.jsoup.parser.CharacterReader(((java.lang.String)v5));
    Object v7 = ((org.jsoup.parser.CharacterReader)v6).toString();
    ((org.jsoup.parser.TokeniserState)v0).read(((org.jsoup.parser.Tokeniser)v4),((org.jsoup.parser.CharacterReader)v6));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = "tf5oot";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = "InSelectInTable";
    Object v1 = org.jsoup.parser.HtmlTreeBuilderState.valueOf(((java.lang.String)v0));
    Object v2 = "InSelectInTable";
    Object v3 = org.jsoup.parser.HtmlTreeBuilderState.valueOf(((java.lang.String)v2));
    Object v4 = ((java.lang.Enum)v1).compareTo(((java.lang.Enum)v3));
    Object v5 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v6 = ((java.lang.Class)v5).getEnclosingMethod();
    Object v7 = "title";
    Object v8 = java.lang.Enum.valueOf(((java.lang.Class)v5),((java.lang.String)v7));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = "InSelectInTable";
    Object v1 = org.jsoup.parser.HtmlTreeBuilderState.valueOf(((java.lang.String)v0));
    Object v2 = "InSelectInTable";
    Object v3 = org.jsoup.parser.HtmlTreeBuilderState.valueOf(((java.lang.String)v2));
    Object v4 = "InSelectInTable";
    Object v5 = org.jsoup.parser.HtmlTreeBuilderState.valueOf(((java.lang.String)v4));
    Object v6 = ((java.lang.Enum)v5).ordinal();
    Object v7 = ((java.lang.Enum)v3).equals(((java.lang.Object)v6));
    Object v8 = ((java.lang.Enum)v1).equals(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = "InSelectInTable";
    Object v1 = org.jsoup.parser.HtmlTreeBuilderState.valueOf(((java.lang.String)v0));
    Object v2 = "InSelectInTable";
    Object v3 = org.jsoup.parser.HtmlTreeBuilderState.valueOf(((java.lang.String)v2));
    Object v4 = ((java.lang.Enum)v1).compareTo(((java.lang.Enum)v3));
    Object v5 = ((java.lang.Enum)v1).hashCode();
    org.junit.Assert.assertEquals((Object)(1492222321), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = "InSelectInTable";
    Object v1 = org.jsoup.parser.HtmlTreeBuilderState.valueOf(((java.lang.String)v0));
    Object v2 = "InSelectInTable";
    Object v3 = org.jsoup.parser.HtmlTreeBuilderState.valueOf(((java.lang.String)v2));
    Object v4 = ((java.lang.Enum)v1).compareTo(((java.lang.Enum)v3));
    Object v5 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v6 = ((java.lang.Class)v5).isEnum();
    Object v7 = "link";
    Object v8 = java.lang.Enum.valueOf(((java.lang.Class)v5),((java.lang.String)v7));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = "InSelectInTable";
    Object v1 = org.jsoup.parser.HtmlTreeBuilderState.valueOf(((java.lang.String)v0));
    Object v2 = "InSelectInTable";
    Object v3 = org.jsoup.parser.HtmlTreeBuilderState.valueOf(((java.lang.String)v2));
    Object v4 = ((java.lang.Enum)v1).compareTo(((java.lang.Enum)v3));
    Object v5 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v6 = "frame";
    Object v7 = java.lang.Enum.valueOf(((java.lang.Class)v5),((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = "InSelectInTable";
    Object v1 = org.jsoup.parser.HtmlTreeBuilderState.valueOf(((java.lang.String)v0));
    Object v2 = "InSelectInTable";
    Object v3 = org.jsoup.parser.HtmlTreeBuilderState.valueOf(((java.lang.String)v2));
    Object v4 = ((java.lang.Enum)v1).compareTo(((java.lang.Enum)v3));
    Object v5 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v6 = "!=";
    Object v7 = java.lang.Enum.valueOf(((java.lang.Class)v5),((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = "html";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = "span";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = "tfoot";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = "InSelectInTable";
    Object v1 = org.jsoup.parser.HtmlTreeBuilderState.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).toString();
    org.junit.Assert.assertEquals((Object)("InSelectInTable"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = "InSelectInTable";
    Object v1 = org.jsoup.parser.HtmlTreeBuilderState.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v4 = ((java.lang.Class)v3).getNestHost();
    Object v5 = "title";
    Object v6 = java.lang.Enum.valueOf(((java.lang.Class)v3),((java.lang.String)v5));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = "blockquote";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
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
  public void test93() throws Throwable {
    try {
    Object v0 = "ht(l";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = "colgroup";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = "InSelectInTable";
    Object v1 = org.jsoup.parser.HtmlTreeBuilderState.valueOf(((java.lang.String)v0));
    Object v2 = "InSelectInTable";
    Object v3 = org.jsoup.parser.HtmlTreeBuilderState.valueOf(((java.lang.String)v2));
    Object v4 = ((java.lang.Enum)v1).compareTo(((java.lang.Enum)v3));
    Object v5 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v6 = "tbo";
    Object v7 = java.lang.Enum.valueOf(((java.lang.Class)v5),((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = "Comme,tEndDash";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = "InSelectInTable";
    Object v1 = org.jsoup.parser.HtmlTreeBuilderState.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).hashCode();
    Object v3 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v4 = "html";
    Object v5 = java.lang.Enum.valueOf(((java.lang.Class)v3),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = "InSelectInTable";
    Object v1 = org.jsoup.parser.HtmlTreeBuilderState.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).hashCode();
    Object v3 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v4 = "tab1le";
    Object v5 = java.lang.Enum.valueOf(((java.lang.Class)v3),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = org.jsoup.parser.TokeniserState.ScriptDataEscapedDash;
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
