package org.jsoup.parser;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = org.jsoup.parser.TokeniserState.ScriptDataEscapedLessthanSign;
    Object v1 = "F";
    Object v2 = new java.io.StringReader(((java.lang.String)v1));
    Object v3 = new org.jsoup.parser.CharacterReader(((java.io.Reader)v2));
    Object v4 = 0;
    Object v5 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v4).intValue()));
    Object v6 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v3),((org.jsoup.parser.ParseErrorList)v5));
    Object v7 = "F";
    Object v8 = new java.io.StringReader(((java.lang.String)v7));
    Object v9 = new org.jsoup.parser.CharacterReader(((java.io.Reader)v8));
    Object v10 = Character.valueOf((char)1);
    Object v11 = ((org.jsoup.parser.CharacterReader)v9).consumeTo((((java.lang.Character)v10).charValue()));
    ((org.jsoup.parser.TokeniserState)v0).read(((org.jsoup.parser.Tokeniser)v6),((org.jsoup.parser.CharacterReader)v9));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = "tgd";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = org.jsoup.parser.TokeniserState.DoctypePublicIdentifier_singleQuoted;
    Object v1 = ((java.lang.Enum)v0).hashCode();
    Object v2 = "F";
    Object v3 = new java.io.StringReader(((java.lang.String)v2));
    Object v4 = new org.jsoup.parser.CharacterReader(((java.io.Reader)v3));
    Object v5 = 0;
    Object v6 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v5).intValue()));
    Object v7 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v4),((org.jsoup.parser.ParseErrorList)v6));
    Object v8 = "F";
    Object v9 = new java.io.StringReader(((java.lang.String)v8));
    Object v10 = new org.jsoup.parser.CharacterReader(((java.io.Reader)v9));
    ((org.jsoup.parser.TokeniserState)v0).read(((org.jsoup.parser.Tokeniser)v7),((org.jsoup.parser.CharacterReader)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = "able";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = org.jsoup.parser.TokeniserState.DoctypeSystemIdentifier_doubleQuoted;
    Object v1 = "F";
    Object v2 = new java.io.StringReader(((java.lang.String)v1));
    Object v3 = new org.jsoup.parser.CharacterReader(((java.io.Reader)v2));
    Object v4 = 0;
    Object v5 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v4).intValue()));
    Object v6 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v3),((org.jsoup.parser.ParseErrorList)v5));
    Object v7 = "F";
    Object v8 = new java.io.StringReader(((java.lang.String)v7));
    Object v9 = new org.jsoup.parser.CharacterReader(((java.io.Reader)v8));
    ((org.jsoup.parser.TokeniserState)v0).read(((org.jsoup.parser.Tokeniser)v6),((org.jsoup.parser.CharacterReader)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = org.jsoup.parser.TokeniserState.values();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = org.jsoup.parser.TokeniserState.TagOpen;
    Object v1 = "F";
    Object v2 = new java.io.StringReader(((java.lang.String)v1));
    Object v3 = new org.jsoup.parser.CharacterReader(((java.io.Reader)v2));
    Object v4 = 0;
    Object v5 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v4).intValue()));
    Object v6 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v3),((org.jsoup.parser.ParseErrorList)v5));
    Object v7 = "F";
    Object v8 = new java.io.StringReader(((java.lang.String)v7));
    Object v9 = new org.jsoup.parser.CharacterReader(((java.io.Reader)v8));
    ((org.jsoup.parser.TokeniserState)v0).read(((org.jsoup.parser.Tokeniser)v6),((org.jsoup.parser.CharacterReader)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = ":containsData(%s)";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = org.jsoup.parser.TokeniserState.TagName;
    Object v1 = ((java.lang.Enum)v0).getDeclaringClass();
    Object v2 = "F";
    Object v3 = new java.io.StringReader(((java.lang.String)v2));
    Object v4 = new org.jsoup.parser.CharacterReader(((java.io.Reader)v3));
    Object v5 = 0;
    Object v6 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v5).intValue()));
    Object v7 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v4),((org.jsoup.parser.ParseErrorList)v6));
    Object v8 = "F";
    Object v9 = new java.io.StringReader(((java.lang.String)v8));
    Object v10 = new org.jsoup.parser.CharacterReader(((java.io.Reader)v9));
    ((org.jsoup.parser.TokeniserState)v0).read(((org.jsoup.parser.Tokeniser)v7),((org.jsoup.parser.CharacterReader)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = "PUT";
    Object v1 = org.jsoup.Connection.Method.valueOf(((java.lang.String)v0));
    Object v2 = "PUT";
    Object v3 = org.jsoup.Connection.Method.valueOf(((java.lang.String)v2));
    Object v4 = ((java.lang.Enum)v1).compareTo(((java.lang.Enum)v3));
    org.junit.Assert.assertEquals((Object)(0), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = org.jsoup.parser.TokeniserState.BogusComment;
    Object v1 = "F";
    Object v2 = new java.io.StringReader(((java.lang.String)v1));
    Object v3 = new org.jsoup.parser.CharacterReader(((java.io.Reader)v2));
    Object v4 = 0;
    Object v5 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v4).intValue()));
    Object v6 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v3),((org.jsoup.parser.ParseErrorList)v5));
    Object v7 = "F";
    Object v8 = new java.io.StringReader(((java.lang.String)v7));
    Object v9 = new org.jsoup.parser.CharacterReader(((java.io.Reader)v8));
    Object v10 = new char[]{};
    Object v11 = ((org.jsoup.parser.CharacterReader)v9).consumeToAny(((char[])v10));
    ((org.jsoup.parser.TokeniserState)v0).read(((org.jsoup.parser.Tokeniser)v6),((org.jsoup.parser.CharacterReader)v9));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = "PUT";
    Object v1 = org.jsoup.Connection.Method.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).toString();
    org.junit.Assert.assertEquals((Object)("PUT"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = "bod%";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = "PUT";
    Object v1 = org.jsoup.Connection.Method.valueOf(((java.lang.String)v0));
    Object v2 = "PUT";
    Object v3 = org.jsoup.Connection.Method.valueOf(((java.lang.String)v2));
    Object v4 = "PUT";
    Object v5 = org.jsoup.Connection.Method.valueOf(((java.lang.String)v4));
    Object v6 = ((java.lang.Enum)v3).compareTo(((java.lang.Enum)v5));
    Object v7 = ((java.lang.Enum)v1).equals(((java.lang.Object)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = "p]";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = "PUT";
    Object v1 = org.jsoup.Connection.Method.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = "PUT";
    Object v1 = org.jsoup.Connection.Method.valueOf(((java.lang.String)v0));
    Object v2 = "PUT";
    Object v3 = org.jsoup.Connection.Method.valueOf(((java.lang.String)v2));
    Object v4 = "PUT";
    Object v5 = org.jsoup.Connection.Method.valueOf(((java.lang.String)v4));
    Object v6 = "PUT";
    Object v7 = org.jsoup.Connection.Method.valueOf(((java.lang.String)v6));
    Object v8 = ((java.lang.Enum)v5).compareTo(((java.lang.Enum)v7));
    Object v9 = ((java.lang.Enum)v3).equals(((java.lang.Object)v8));
    Object v10 = ((java.lang.Enum)v1).equals(((java.lang.Object)v9));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = "PUT";
    Object v1 = org.jsoup.Connection.Method.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).hashCode();
    Object v3 = ((java.lang.Enum)v1).hashCode();
    org.junit.Assert.assertEquals((Object)(17982516), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = "PUT";
    Object v1 = org.jsoup.Connection.Method.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = "html";
    Object v4 = java.lang.Enum.valueOf(((java.lang.Class)v2),((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = "PUT";
    Object v1 = org.jsoup.Connection.Method.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = ((java.lang.Enum)v1).hashCode();
    org.junit.Assert.assertEquals((Object)(17982516), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = org.jsoup.parser.TokeniserState.AttributeValue_unquoted;
    Object v1 = ((java.lang.Enum)v0).getDeclaringClass();
    Object v2 = "F";
    Object v3 = new java.io.StringReader(((java.lang.String)v2));
    Object v4 = new org.jsoup.parser.CharacterReader(((java.io.Reader)v3));
    Object v5 = 0;
    Object v6 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v5).intValue()));
    Object v7 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v4),((org.jsoup.parser.ParseErrorList)v6));
    Object v8 = "F";
    Object v9 = new java.io.StringReader(((java.lang.String)v8));
    Object v10 = new org.jsoup.parser.CharacterReader(((java.io.Reader)v9));
    Object v11 = ((org.jsoup.parser.CharacterReader)v10).toString();
    ((org.jsoup.parser.TokeniserState)v0).read(((org.jsoup.parser.Tokeniser)v7),((org.jsoup.parser.CharacterReader)v10));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = "PUT";
    Object v1 = org.jsoup.Connection.Method.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).hashCode();
    Object v3 = "PUT";
    Object v4 = org.jsoup.Connection.Method.valueOf(((java.lang.String)v3));
    Object v5 = ((java.lang.Enum)v1).compareTo(((java.lang.Enum)v4));
    org.junit.Assert.assertEquals((Object)(0), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = "ta";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = org.jsoup.parser.TokeniserState.PLAINTEXT;
    Object v1 = "F";
    Object v2 = new java.io.StringReader(((java.lang.String)v1));
    Object v3 = new org.jsoup.parser.CharacterReader(((java.io.Reader)v2));
    Object v4 = 0;
    Object v5 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v4).intValue()));
    Object v6 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v3),((org.jsoup.parser.ParseErrorList)v5));
    Object v7 = "F";
    Object v8 = new java.io.StringReader(((java.lang.String)v7));
    Object v9 = new org.jsoup.parser.CharacterReader(((java.io.Reader)v8));
    Object v10 = ((org.jsoup.parser.CharacterReader)v9).toString();
    ((org.jsoup.parser.TokeniserState)v0).read(((org.jsoup.parser.Tokeniser)v6),((org.jsoup.parser.CharacterReader)v9));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = "PUT";
    Object v1 = org.jsoup.Connection.Method.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).ordinal();
    org.junit.Assert.assertEquals((Object)(2), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = org.jsoup.parser.TokeniserState.BeforeAttributeName;
    Object v1 = "F";
    Object v2 = new java.io.StringReader(((java.lang.String)v1));
    Object v3 = new org.jsoup.parser.CharacterReader(((java.io.Reader)v2));
    Object v4 = 0;
    Object v5 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v4).intValue()));
    Object v6 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v3),((org.jsoup.parser.ParseErrorList)v5));
    Object v7 = "F";
    Object v8 = new java.io.StringReader(((java.lang.String)v7));
    Object v9 = new org.jsoup.parser.CharacterReader(((java.io.Reader)v8));
    ((org.jsoup.parser.TokeniserState)v0).read(((org.jsoup.parser.Tokeniser)v6),((org.jsoup.parser.CharacterReader)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = "PUT";
    Object v1 = org.jsoup.Connection.Method.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).name();
    org.junit.Assert.assertEquals((Object)("PUT"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = org.jsoup.parser.TokeniserState.CharacterReferenceInData;
    Object v1 = "F";
    Object v2 = new java.io.StringReader(((java.lang.String)v1));
    Object v3 = new org.jsoup.parser.CharacterReader(((java.io.Reader)v2));
    Object v4 = 0;
    Object v5 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v4).intValue()));
    Object v6 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v3),((org.jsoup.parser.ParseErrorList)v5));
    Object v7 = "F";
    Object v8 = new java.io.StringReader(((java.lang.String)v7));
    Object v9 = new org.jsoup.parser.CharacterReader(((java.io.Reader)v8));
    ((org.jsoup.parser.TokeniserState)v0).read(((org.jsoup.parser.Tokeniser)v6),((org.jsoup.parser.CharacterReader)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = org.jsoup.parser.TokeniserState.ScriptDataDoubleEscapedDashDash;
    Object v1 = "F";
    Object v2 = new java.io.StringReader(((java.lang.String)v1));
    Object v3 = new org.jsoup.parser.CharacterReader(((java.io.Reader)v2));
    Object v4 = 0;
    Object v5 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v4).intValue()));
    Object v6 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v3),((org.jsoup.parser.ParseErrorList)v5));
    Object v7 = "F";
    Object v8 = new java.io.StringReader(((java.lang.String)v7));
    Object v9 = new org.jsoup.parser.CharacterReader(((java.io.Reader)v8));
    ((org.jsoup.parser.TokeniserState)v0).read(((org.jsoup.parser.Tokeniser)v6),((org.jsoup.parser.CharacterReader)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = "PUT";
    Object v1 = org.jsoup.Connection.Method.valueOf(((java.lang.String)v0));
    Object v2 = "PUT";
    Object v3 = org.jsoup.Connection.Method.valueOf(((java.lang.String)v2));
    Object v4 = ((java.lang.Enum)v1).compareTo(((java.lang.Enum)v3));
    Object v5 = ((java.lang.Enum)v1).getDeclaringClass();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = "PUT";
    Object v1 = org.jsoup.Connection.Method.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = "col";
    Object v4 = java.lang.Enum.valueOf(((java.lang.Class)v2),((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = org.jsoup.parser.TokeniserState.AfterAttributeName;
    Object v1 = ((java.lang.Enum)v0).getDeclaringClass();
    Object v2 = "F";
    Object v3 = new java.io.StringReader(((java.lang.String)v2));
    Object v4 = new org.jsoup.parser.CharacterReader(((java.io.Reader)v3));
    Object v5 = 0;
    Object v6 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v5).intValue()));
    Object v7 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v4),((org.jsoup.parser.ParseErrorList)v6));
    Object v8 = "F";
    Object v9 = new java.io.StringReader(((java.lang.String)v8));
    Object v10 = new org.jsoup.parser.CharacterReader(((java.io.Reader)v9));
    ((org.jsoup.parser.TokeniserState)v0).read(((org.jsoup.parser.Tokeniser)v7),((org.jsoup.parser.CharacterReader)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = org.jsoup.parser.TokeniserState.ScriptDataDoubleEscapeEnd;
    Object v1 = "F";
    Object v2 = new java.io.StringReader(((java.lang.String)v1));
    Object v3 = new org.jsoup.parser.CharacterReader(((java.io.Reader)v2));
    Object v4 = 0;
    Object v5 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v4).intValue()));
    Object v6 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v3),((org.jsoup.parser.ParseErrorList)v5));
    Object v7 = "F";
    Object v8 = new java.io.StringReader(((java.lang.String)v7));
    Object v9 = new org.jsoup.parser.CharacterReader(((java.io.Reader)v8));
    ((org.jsoup.parser.TokeniserState)v0).read(((org.jsoup.parser.Tokeniser)v6),((org.jsoup.parser.CharacterReader)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = "font";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = "Unexpected token type: ";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = "PUT";
    Object v1 = org.jsoup.Connection.Method.valueOf(((java.lang.String)v0));
    Object v2 = "PUT";
    Object v3 = org.jsoup.Connection.Method.valueOf(((java.lang.String)v2));
    Object v4 = ((java.lang.Enum)v1).compareTo(((java.lang.Enum)v3));
    Object v5 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v6 = "th2ead";
    Object v7 = java.lang.Enum.valueOf(((java.lang.Class)v5),((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = "PUT";
    Object v1 = org.jsoup.Connection.Method.valueOf(((java.lang.String)v0));
    Object v2 = "PUT";
    Object v3 = org.jsoup.Connection.Method.valueOf(((java.lang.String)v2));
    Object v4 = ((java.lang.Enum)v1).equals(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = "PUT";
    Object v1 = org.jsoup.Connection.Method.valueOf(((java.lang.String)v0));
    Object v2 = "PUT";
    Object v3 = org.jsoup.Connection.Method.valueOf(((java.lang.String)v2));
    Object v4 = ((java.lang.Enum)v3).getDeclaringClass();
    Object v5 = ((java.lang.Enum)v1).compareTo(((java.lang.Enum)v3));
    org.junit.Assert.assertEquals((Object)(0), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = "tbody";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = "(";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = "caption";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = "PUT";
    Object v1 = org.jsoup.Connection.Method.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = "tab";
    Object v4 = java.lang.Enum.valueOf(((java.lang.Class)v2),((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = "Comme,tEndDash";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = "PUT";
    Object v1 = org.jsoup.Connection.Method.valueOf(((java.lang.String)v0));
    Object v2 = "PUT";
    Object v3 = org.jsoup.Connection.Method.valueOf(((java.lang.String)v2));
    Object v4 = ((java.lang.Enum)v1).compareTo(((java.lang.Enum)v3));
    Object v5 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v6 = "html";
    Object v7 = java.lang.Enum.valueOf(((java.lang.Class)v5),((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = "PUT";
    Object v1 = org.jsoup.Connection.Method.valueOf(((java.lang.String)v0));
    Object v2 = "PUT";
    Object v3 = org.jsoup.Connection.Method.valueOf(((java.lang.String)v2));
    Object v4 = ((java.lang.Enum)v1).compareTo(((java.lang.Enum)v3));
    Object v5 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v6 = "1noscript";
    Object v7 = java.lang.Enum.valueOf(((java.lang.Class)v5),((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = org.jsoup.parser.TokeniserState.ScriptDataEscapedDash;
    Object v1 = "F";
    Object v2 = new java.io.StringReader(((java.lang.String)v1));
    Object v3 = new org.jsoup.parser.CharacterReader(((java.io.Reader)v2));
    Object v4 = 0;
    Object v5 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v4).intValue()));
    Object v6 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v3),((org.jsoup.parser.ParseErrorList)v5));
    Object v7 = "F";
    Object v8 = new java.io.StringReader(((java.lang.String)v7));
    Object v9 = new org.jsoup.parser.CharacterReader(((java.io.Reader)v8));
    ((org.jsoup.parser.TokeniserState)v0).read(((org.jsoup.parser.Tokeniser)v6),((org.jsoup.parser.CharacterReader)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = "u";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = "PUT";
    Object v1 = org.jsoup.Connection.Method.valueOf(((java.lang.String)v0));
    Object v2 = 0;
    Object v3 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v2).intValue()));
    Object v4 = ((java.lang.Enum)v1).equals(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = "PUT";
    Object v1 = org.jsoup.Connection.Method.valueOf(((java.lang.String)v0));
    Object v2 = "PUT";
    Object v3 = org.jsoup.Connection.Method.valueOf(((java.lang.String)v2));
    Object v4 = ((java.lang.Enum)v1).compareTo(((java.lang.Enum)v3));
    Object v5 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v6 = "?etails";
    Object v7 = java.lang.Enum.valueOf(((java.lang.Class)v5),((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = "PUT";
    Object v1 = org.jsoup.Connection.Method.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = "PUT";
    Object v4 = org.jsoup.Connection.Method.valueOf(((java.lang.String)v3));
    Object v5 = ((java.lang.Enum)v4).hashCode();
    Object v6 = ((java.lang.Enum)v1).compareTo(((java.lang.Enum)v4));
    org.junit.Assert.assertEquals((Object)(0), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = "PUT";
    Object v1 = org.jsoup.Connection.Method.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).hashCode();
    org.junit.Assert.assertEquals((Object)(17982516), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = "PUT";
    Object v1 = org.jsoup.Connection.Method.valueOf(((java.lang.String)v0));
    Object v2 = "PUT";
    Object v3 = org.jsoup.Connection.Method.valueOf(((java.lang.String)v2));
    Object v4 = ((java.lang.Enum)v1).compareTo(((java.lang.Enum)v3));
    Object v5 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v6 = "BeforeDoctypePublicIdentifier";
    Object v7 = java.lang.Enum.valueOf(((java.lang.Class)v5),((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = org.jsoup.parser.TokeniserState.CommentEndBang;
    Object v1 = "F";
    Object v2 = new java.io.StringReader(((java.lang.String)v1));
    Object v3 = new org.jsoup.parser.CharacterReader(((java.io.Reader)v2));
    Object v4 = 0;
    Object v5 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v4).intValue()));
    Object v6 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v3),((org.jsoup.parser.ParseErrorList)v5));
    Object v7 = "F";
    Object v8 = new java.io.StringReader(((java.lang.String)v7));
    Object v9 = new org.jsoup.parser.CharacterReader(((java.io.Reader)v8));
    Object v10 = ((org.jsoup.parser.CharacterReader)v9).toString();
    ((org.jsoup.parser.TokeniserState)v0).read(((org.jsoup.parser.Tokeniser)v6),((org.jsoup.parser.CharacterReader)v9));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = "PUT";
    Object v1 = org.jsoup.Connection.Method.valueOf(((java.lang.String)v0));
    Object v2 = "PUT";
    Object v3 = org.jsoup.Connection.Method.valueOf(((java.lang.String)v2));
    Object v4 = "PUT";
    Object v5 = org.jsoup.Connection.Method.valueOf(((java.lang.String)v4));
    Object v6 = ((java.lang.Enum)v3).compareTo(((java.lang.Enum)v5));
    Object v7 = ((java.lang.Enum)v1).compareTo(((java.lang.Enum)v3));
    org.junit.Assert.assertEquals((Object)(0), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = "PUT";
    Object v1 = org.jsoup.Connection.Method.valueOf(((java.lang.String)v0));
    Object v2 = "PUT";
    Object v3 = org.jsoup.Connection.Method.valueOf(((java.lang.String)v2));
    Object v4 = "PUT";
    Object v5 = org.jsoup.Connection.Method.valueOf(((java.lang.String)v4));
    Object v6 = ((java.lang.Enum)v3).equals(((java.lang.Object)v5));
    Object v7 = ((java.lang.Enum)v1).equals(((java.lang.Object)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = " ";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = "'";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = org.jsoup.parser.TokeniserState.ScriptDataLessthanSign;
    Object v1 = "F";
    Object v2 = new java.io.StringReader(((java.lang.String)v1));
    Object v3 = new org.jsoup.parser.CharacterReader(((java.io.Reader)v2));
    Object v4 = 0;
    Object v5 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v4).intValue()));
    Object v6 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v3),((org.jsoup.parser.ParseErrorList)v5));
    Object v7 = "F";
    Object v8 = new java.io.StringReader(((java.lang.String)v7));
    Object v9 = new org.jsoup.parser.CharacterReader(((java.io.Reader)v8));
    Object v10 = ((org.jsoup.parser.CharacterReader)v9).toString();
    ((org.jsoup.parser.TokeniserState)v0).read(((org.jsoup.parser.Tokeniser)v6),((org.jsoup.parser.CharacterReader)v9));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = "PUT";
    Object v1 = org.jsoup.Connection.Method.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = ((java.lang.Class)v2).getDeclaredAnnotations();
    Object v4 = "fiePdset";
    Object v5 = java.lang.Enum.valueOf(((java.lang.Class)v2),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = "address";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = org.jsoup.parser.TokeniserState.DoctypeSystemIdentifier_singleQuoted;
    Object v1 = ((java.lang.Enum)v0).hashCode();
    Object v2 = "F";
    Object v3 = new java.io.StringReader(((java.lang.String)v2));
    Object v4 = new org.jsoup.parser.CharacterReader(((java.io.Reader)v3));
    Object v5 = 0;
    Object v6 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v5).intValue()));
    Object v7 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v4),((org.jsoup.parser.ParseErrorList)v6));
    Object v8 = "F";
    Object v9 = new java.io.StringReader(((java.lang.String)v8));
    Object v10 = new org.jsoup.parser.CharacterReader(((java.io.Reader)v9));
    ((org.jsoup.parser.TokeniserState)v0).read(((org.jsoup.parser.Tokeniser)v7),((org.jsoup.parser.CharacterReader)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = "PUT";
    Object v1 = org.jsoup.Connection.Method.valueOf(((java.lang.String)v0));
    Object v2 = "PUT";
    Object v3 = org.jsoup.Connection.Method.valueOf(((java.lang.String)v2));
    Object v4 = ((java.lang.Enum)v1).compareTo(((java.lang.Enum)v3));
    Object v5 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v6 = "!q";
    Object v7 = java.lang.Enum.valueOf(((java.lang.Class)v5),((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = "W";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = "PUT";
    Object v1 = org.jsoup.Connection.Method.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = ((java.lang.Enum)v1).toString();
    org.junit.Assert.assertEquals((Object)("PUT"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = "html";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = org.jsoup.parser.TokeniserState.RCDATAEndTagName;
    Object v1 = "F";
    Object v2 = new java.io.StringReader(((java.lang.String)v1));
    Object v3 = new org.jsoup.parser.CharacterReader(((java.io.Reader)v2));
    Object v4 = 0;
    Object v5 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v4).intValue()));
    Object v6 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v3),((org.jsoup.parser.ParseErrorList)v5));
    Object v7 = "F";
    Object v8 = new java.io.StringReader(((java.lang.String)v7));
    Object v9 = new org.jsoup.parser.CharacterReader(((java.io.Reader)v8));
    ((org.jsoup.parser.TokeniserState)v0).read(((org.jsoup.parser.Tokeniser)v6),((org.jsoup.parser.CharacterReader)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = "colg";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = org.jsoup.parser.TokeniserState.ScriptDataEscapeStartDash;
    Object v1 = "F";
    Object v2 = new java.io.StringReader(((java.lang.String)v1));
    Object v3 = new org.jsoup.parser.CharacterReader(((java.io.Reader)v2));
    Object v4 = 0;
    Object v5 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v4).intValue()));
    Object v6 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v3),((org.jsoup.parser.ParseErrorList)v5));
    Object v7 = "F";
    Object v8 = new java.io.StringReader(((java.lang.String)v7));
    Object v9 = new org.jsoup.parser.CharacterReader(((java.io.Reader)v8));
    ((org.jsoup.parser.TokeniserState)v0).read(((org.jsoup.parser.Tokeniser)v6),((org.jsoup.parser.CharacterReader)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = "r";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = "PUT";
    Object v1 = org.jsoup.Connection.Method.valueOf(((java.lang.String)v0));
    Object v2 = "PUT";
    Object v3 = org.jsoup.Connection.Method.valueOf(((java.lang.String)v2));
    Object v4 = ((java.lang.Enum)v1).compareTo(((java.lang.Enum)v3));
    Object v5 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v6 = "tt";
    Object v7 = java.lang.Enum.valueOf(((java.lang.Class)v5),((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = "PUT";
    Object v1 = org.jsoup.Connection.Method.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = "hea,";
    Object v4 = java.lang.Enum.valueOf(((java.lang.Class)v2),((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = "PUT";
    Object v1 = org.jsoup.Connection.Method.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = "g";
    Object v4 = java.lang.Enum.valueOf(((java.lang.Class)v2),((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = "PUT";
    Object v1 = org.jsoup.Connection.Method.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = ((java.lang.Class)v2).getProtectionDomain();
    Object v4 = "col";
    Object v5 = java.lang.Enum.valueOf(((java.lang.Class)v2),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = "sc";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = "li";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = "PUT";
    Object v1 = org.jsoup.Connection.Method.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = "PUT";
    Object v4 = org.jsoup.Connection.Method.valueOf(((java.lang.String)v3));
    Object v5 = ((java.lang.Enum)v1).compareTo(((java.lang.Enum)v4));
    org.junit.Assert.assertEquals((Object)(0), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = "tfoot";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = "PUT";
    Object v1 = org.jsoup.Connection.Method.valueOf(((java.lang.String)v0));
    Object v2 = "PUT";
    Object v3 = org.jsoup.Connection.Method.valueOf(((java.lang.String)v2));
    Object v4 = ((java.lang.Enum)v1).compareTo(((java.lang.Enum)v3));
    Object v5 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v6 = "body";
    Object v7 = java.lang.Enum.valueOf(((java.lang.Class)v5),((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = "PUT";
    Object v1 = org.jsoup.Connection.Method.valueOf(((java.lang.String)v0));
    Object v2 = "PUT";
    Object v3 = org.jsoup.Connection.Method.valueOf(((java.lang.String)v2));
    Object v4 = ((java.lang.Enum)v1).compareTo(((java.lang.Enum)v3));
    Object v5 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v6 = "^\\+";
    Object v7 = java.lang.Enum.valueOf(((java.lang.Class)v5),((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = org.jsoup.parser.TokeniserState.DoctypeSystemIdentifier_singleQuoted;
    Object v1 = "F";
    Object v2 = new java.io.StringReader(((java.lang.String)v1));
    Object v3 = new org.jsoup.parser.CharacterReader(((java.io.Reader)v2));
    Object v4 = 0;
    Object v5 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v4).intValue()));
    Object v6 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v3),((org.jsoup.parser.ParseErrorList)v5));
    Object v7 = "F";
    Object v8 = new java.io.StringReader(((java.lang.String)v7));
    Object v9 = new org.jsoup.parser.CharacterReader(((java.io.Reader)v8));
    ((org.jsoup.parser.TokeniserState)v0).read(((org.jsoup.parser.Tokeniser)v6),((org.jsoup.parser.CharacterReader)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = "PUT";
    Object v1 = org.jsoup.Connection.Method.valueOf(((java.lang.String)v0));
    Object v2 = "PUT";
    Object v3 = org.jsoup.Connection.Method.valueOf(((java.lang.String)v2));
    Object v4 = ((java.lang.Enum)v1).compareTo(((java.lang.Enum)v3));
    Object v5 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v6 = "col";
    Object v7 = java.lang.Enum.valueOf(((java.lang.Class)v5),((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = org.jsoup.parser.TokeniserState.RCDATAEndTagOpen;
    Object v1 = "F";
    Object v2 = new java.io.StringReader(((java.lang.String)v1));
    Object v3 = new org.jsoup.parser.CharacterReader(((java.io.Reader)v2));
    Object v4 = 0;
    Object v5 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v4).intValue()));
    Object v6 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v3),((org.jsoup.parser.ParseErrorList)v5));
    Object v7 = "F";
    Object v8 = new java.io.StringReader(((java.lang.String)v7));
    Object v9 = new org.jsoup.parser.CharacterReader(((java.io.Reader)v8));
    ((org.jsoup.parser.TokeniserState)v0).read(((org.jsoup.parser.Tokeniser)v6),((org.jsoup.parser.CharacterReader)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = "PUT";
    Object v1 = org.jsoup.Connection.Method.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = "tr";
    Object v4 = java.lang.Enum.valueOf(((java.lang.Class)v2),((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = "PUT";
    Object v1 = org.jsoup.Connection.Method.valueOf(((java.lang.String)v0));
    Object v2 = "PUT";
    Object v3 = org.jsoup.Connection.Method.valueOf(((java.lang.String)v2));
    Object v4 = ((java.lang.Enum)v1).compareTo(((java.lang.Enum)v3));
    Object v5 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v6 = "";
    Object v7 = java.lang.Enum.valueOf(((java.lang.Class)v5),((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = "buttn";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = "PUT";
    Object v1 = org.jsoup.Connection.Method.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).hashCode();
    Object v3 = "PUT";
    Object v4 = org.jsoup.Connection.Method.valueOf(((java.lang.String)v3));
    Object v5 = ((java.lang.Enum)v4).hashCode();
    Object v6 = ((java.lang.Enum)v4).hashCode();
    Object v7 = ((java.lang.Enum)v1).equals(((java.lang.Object)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = "PUT";
    Object v1 = org.jsoup.Connection.Method.valueOf(((java.lang.String)v0));
    Object v2 = "PUT";
    Object v3 = org.jsoup.Connection.Method.valueOf(((java.lang.String)v2));
    Object v4 = ((java.lang.Enum)v1).compareTo(((java.lang.Enum)v3));
    Object v5 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v6 = "head";
    Object v7 = java.lang.Enum.valueOf(((java.lang.Class)v5),((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = "PUT";
    Object v1 = org.jsoup.Connection.Method.valueOf(((java.lang.String)v0));
    Object v2 = "PUT";
    Object v3 = org.jsoup.Connection.Method.valueOf(((java.lang.String)v2));
    Object v4 = ((java.lang.Enum)v3).toString();
    Object v5 = ((java.lang.Enum)v1).equals(((java.lang.Object)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = "PUT";
    Object v1 = org.jsoup.Connection.Method.valueOf(((java.lang.String)v0));
    Object v2 = "PUT";
    Object v3 = org.jsoup.Connection.Method.valueOf(((java.lang.String)v2));
    Object v4 = ((java.lang.Enum)v3).getDeclaringClass();
    Object v5 = ((java.lang.Enum)v3).hashCode();
    Object v6 = ((java.lang.Enum)v1).equals(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = "PUT";
    Object v1 = org.jsoup.Connection.Method.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).hashCode();
    Object v3 = ((java.lang.Enum)v1).toString();
    org.junit.Assert.assertEquals((Object)("PUT"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = "PUT";
    Object v1 = org.jsoup.Connection.Method.valueOf(((java.lang.String)v0));
    Object v2 = "PUT";
    Object v3 = org.jsoup.Connection.Method.valueOf(((java.lang.String)v2));
    Object v4 = ((java.lang.Enum)v3).getDeclaringClass();
    Object v5 = ((java.lang.Enum)v3).toString();
    Object v6 = ((java.lang.Enum)v1).equals(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = "PUT";
    Object v1 = org.jsoup.Connection.Method.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = "u";
    Object v4 = java.lang.Enum.valueOf(((java.lang.Class)v2),((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = "C";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = "PUT";
    Object v1 = org.jsoup.Connection.Method.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).hashCode();
    Object v3 = ((java.lang.Enum)v1).getDeclaringClass();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = org.jsoup.parser.TokeniserState.ScriptDataEndTagOpen;
    Object v1 = "F";
    Object v2 = new java.io.StringReader(((java.lang.String)v1));
    Object v3 = new org.jsoup.parser.CharacterReader(((java.io.Reader)v2));
    Object v4 = 0;
    Object v5 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v4).intValue()));
    Object v6 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v3),((org.jsoup.parser.ParseErrorList)v5));
    Object v7 = "F";
    Object v8 = new java.io.StringReader(((java.lang.String)v7));
    Object v9 = new org.jsoup.parser.CharacterReader(((java.io.Reader)v8));
    ((org.jsoup.parser.TokeniserState)v0).read(((org.jsoup.parser.Tokeniser)v6),((org.jsoup.parser.CharacterReader)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = "PUT";
    Object v1 = org.jsoup.Connection.Method.valueOf(((java.lang.String)v0));
    Object v2 = "PUT";
    Object v3 = org.jsoup.Connection.Method.valueOf(((java.lang.String)v2));
    Object v4 = ((java.lang.Enum)v3).hashCode();
    Object v5 = ((java.lang.Enum)v3).toString();
    Object v6 = ((java.lang.Enum)v1).equals(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = "PUT";
    Object v1 = org.jsoup.Connection.Method.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = "htp";
    Object v4 = java.lang.Enum.valueOf(((java.lang.Class)v2),((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = "PUT";
    Object v1 = org.jsoup.Connection.Method.valueOf(((java.lang.String)v0));
    Object v2 = "PUT";
    Object v3 = org.jsoup.Connection.Method.valueOf(((java.lang.String)v2));
    Object v4 = ((java.lang.Enum)v1).compareTo(((java.lang.Enum)v3));
    Object v5 = ((java.lang.Enum)v1).hashCode();
    org.junit.Assert.assertEquals((Object)(17982516), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = "PUT";
    Object v1 = org.jsoup.Connection.Method.valueOf(((java.lang.String)v0));
    Object v2 = "PUT";
    Object v3 = org.jsoup.Connection.Method.valueOf(((java.lang.String)v2));
    Object v4 = ((java.lang.Enum)v3).hashCode();
    Object v5 = ((java.lang.Enum)v1).compareTo(((java.lang.Enum)v3));
    org.junit.Assert.assertEquals((Object)(0), v5);
  }
}
