package org.jsoup.parser;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = "tit";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1));
    Object v3 = org.jsoup.parser.TokeniserState.DoctypeName;
    ((org.jsoup.parser.Tokeniser)v2).error(((org.jsoup.parser.TokeniserState)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = "tit";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1));
    Object v3 = org.jsoup.parser.TokeniserState.BeforeAttributeValue;
    ((org.jsoup.parser.Tokeniser)v2).eofError(((org.jsoup.parser.TokeniserState)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = "tit";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1));
    Object v3 = org.jsoup.parser.TokeniserState.CommentEndDash;
    ((org.jsoup.parser.Tokeniser)v2).advanceTransition(((org.jsoup.parser.TokeniserState)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = "tit";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1));
    Object v3 = true;
    ((org.jsoup.parser.Tokeniser)v2).setTrackErrors((((java.lang.Boolean)v3).booleanValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = "tit";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1));
    ((org.jsoup.parser.Tokeniser)v2).emitTagPending();
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = "tit";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1));
    Object v3 = "object";
    ((org.jsoup.parser.Tokeniser)v2).emit(((java.lang.String)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = "tit";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1));
    Object v3 = Character.valueOf((char)0);
    Object v4 = false;
    Object v5 = ((org.jsoup.parser.Tokeniser)v2).consumeCharacterReference(((java.lang.Character)v3),(((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = "tit";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1));
    Object v3 = false;
    Object v4 = ((org.jsoup.parser.Tokeniser)v2).createTagPending((((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = "tit";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1));
    Object v3 = "tit";
    Object v4 = new org.jsoup.parser.CharacterReader(((java.lang.String)v3));
    Object v5 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v4));
    Object v6 = false;
    Object v7 = ((org.jsoup.parser.Tokeniser)v5).createTagPending((((java.lang.Boolean)v6).booleanValue()));
    ((org.jsoup.parser.Tokeniser)v2).emit(((org.jsoup.parser.Token)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = "tit";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1));
    Object v3 = ((org.jsoup.parser.Tokeniser)v2).read();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = "tit";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1));
    Object v3 = ((org.jsoup.parser.Tokeniser)v2).currentNodeInHtmlNS();
    org.junit.Assert.assertEquals((Object)(true), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = "tit";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1));
    ((org.jsoup.parser.Tokeniser)v2).createCommentPending();
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = "tit";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1));
    Object v3 = Character.valueOf((char)2);
    ((org.jsoup.parser.Tokeniser)v2).emit((((java.lang.Character)v3).charValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = "tit";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1));
    Object v3 = "tit";
    Object v4 = new org.jsoup.parser.CharacterReader(((java.lang.String)v3));
    Object v5 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v4));
    Object v6 = ((org.jsoup.parser.Tokeniser)v5).read();
    ((org.jsoup.parser.Tokeniser)v2).emit(((org.jsoup.parser.Token)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = "tit";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1));
    Object v3 = ((org.jsoup.parser.Tokeniser)v2).isAppropriateEndTagToken();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = "tit";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1));
    Object v3 = ((org.jsoup.parser.Tokeniser)v2).isTrackErrors();
    org.junit.Assert.assertEquals((Object)(true), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = "tit";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1));
    ((org.jsoup.parser.Tokeniser)v2).createTempBuffer();
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = "tit";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1));
    ((org.jsoup.parser.Tokeniser)v2).acknowledgeSelfClosingFlag();
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = "tit";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1));
    Object v3 = true;
    Object v4 = ((org.jsoup.parser.Tokeniser)v2).createTagPending((((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = "tit";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1));
    Object v3 = Character.valueOf((char)2);
    Object v4 = false;
    Object v5 = ((org.jsoup.parser.Tokeniser)v2).consumeCharacterReference(((java.lang.Character)v3),(((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = "tit";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1));
    Object v3 = org.jsoup.parser.TokeniserState.CommentEnd;
    ((org.jsoup.parser.Tokeniser)v2).error(((org.jsoup.parser.TokeniserState)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = "tit";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1));
    Object v3 = org.jsoup.parser.TokeniserState.AfterAttributeValue_quoted;
    ((org.jsoup.parser.Tokeniser)v2).error(((org.jsoup.parser.TokeniserState)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = "tit";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1));
    Object v3 = Character.valueOf((char)0);
    Object v4 = true;
    Object v5 = ((org.jsoup.parser.Tokeniser)v2).consumeCharacterReference(((java.lang.Character)v3),(((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = "tit";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1));
    ((org.jsoup.parser.Tokeniser)v2).emitCommentPending();
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = "tit";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1));
    Object v3 = Character.valueOf((char)1);
    Object v4 = false;
    Object v5 = ((org.jsoup.parser.Tokeniser)v2).consumeCharacterReference(((java.lang.Character)v3),(((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = "tit";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1));
    Object v3 = org.jsoup.parser.TokeniserState.DoctypePublicIdentifier_doubleQuoted;
    ((org.jsoup.parser.Tokeniser)v2).error(((org.jsoup.parser.TokeniserState)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = "tit";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1));
    Object v3 = org.jsoup.parser.TokeniserState.AfterDoctypeSystemIdentifier;
    Object v4 = ((java.lang.Enum)v3).hashCode();
    ((org.jsoup.parser.Tokeniser)v2).eofError(((org.jsoup.parser.TokeniserState)v3));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = "tit";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1));
    Object v3 = org.jsoup.parser.TokeniserState.AttributeValue_singleQuoted;
    ((org.jsoup.parser.Tokeniser)v2).advanceTransition(((org.jsoup.parser.TokeniserState)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = "tit";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1));
    Object v3 = org.jsoup.parser.TokeniserState.ScriptDataDoubleEscaped;
    Object v4 = ((java.lang.Enum)v3).hashCode();
    ((org.jsoup.parser.Tokeniser)v2).error(((org.jsoup.parser.TokeniserState)v3));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = "tit";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1));
    Object v3 = ((org.jsoup.parser.Tokeniser)v2).getState();
    org.junit.Assert.assertEquals((Object)(org.jsoup.parser.TokeniserState.Data), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = "tit";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1));
    Object v3 = "tit";
    Object v4 = new org.jsoup.parser.CharacterReader(((java.lang.String)v3));
    Object v5 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v4));
    Object v6 = ((org.jsoup.parser.Tokeniser)v5).getState();
    ((org.jsoup.parser.Tokeniser)v2).error(((org.jsoup.parser.TokeniserState)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = "tit";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1));
    Object v3 = "tit";
    Object v4 = new org.jsoup.parser.CharacterReader(((java.lang.String)v3));
    Object v5 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v4));
    Object v6 = ((org.jsoup.parser.Tokeniser)v5).getState();
    Object v7 = ((java.lang.Enum)v6).hashCode();
    ((org.jsoup.parser.Tokeniser)v2).error(((org.jsoup.parser.TokeniserState)v6));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = "tit";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1));
    Object v3 = "tit";
    Object v4 = new org.jsoup.parser.CharacterReader(((java.lang.String)v3));
    Object v5 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v4));
    Object v6 = ((org.jsoup.parser.Tokeniser)v5).getState();
    ((org.jsoup.parser.Tokeniser)v2).advanceTransition(((org.jsoup.parser.TokeniserState)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = "tit";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1));
    Object v3 = "tit";
    Object v4 = new org.jsoup.parser.CharacterReader(((java.lang.String)v3));
    Object v5 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v4));
    Object v6 = ((org.jsoup.parser.Tokeniser)v5).getState();
    ((org.jsoup.parser.Tokeniser)v2).eofError(((org.jsoup.parser.TokeniserState)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = "tit";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1));
    Object v3 = "tit";
    Object v4 = new org.jsoup.parser.CharacterReader(((java.lang.String)v3));
    Object v5 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v4));
    Object v6 = true;
    Object v7 = ((org.jsoup.parser.Tokeniser)v5).createTagPending((((java.lang.Boolean)v6).booleanValue()));
    ((org.jsoup.parser.Tokeniser)v2).emit(((org.jsoup.parser.Token)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = "tit";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = "tit";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1));
    Object v3 = false;
    ((org.jsoup.parser.Tokeniser)v2).setTrackErrors((((java.lang.Boolean)v3).booleanValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = "tit";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1));
    Object v3 = "tit";
    Object v4 = new org.jsoup.parser.CharacterReader(((java.lang.String)v3));
    Object v5 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v4));
    Object v6 = ((org.jsoup.parser.Tokeniser)v5).getState();
    ((org.jsoup.parser.Tokeniser)v2).transition(((org.jsoup.parser.TokeniserState)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = "tit";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1));
    Object v3 = "tit";
    Object v4 = new org.jsoup.parser.CharacterReader(((java.lang.String)v3));
    Object v5 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v4));
    Object v6 = ((org.jsoup.parser.Tokeniser)v5).getState();
    Object v7 = "tit";
    Object v8 = new org.jsoup.parser.CharacterReader(((java.lang.String)v7));
    Object v9 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v8));
    Object v10 = ((org.jsoup.parser.Tokeniser)v9).getState();
    Object v11 = ((java.lang.Enum)v6).compareTo(((java.lang.Enum)v10));
    ((org.jsoup.parser.Tokeniser)v2).error(((org.jsoup.parser.TokeniserState)v6));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = "tit";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1));
    ((org.jsoup.parser.Tokeniser)v2).emitDoctypePending();
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = "tit";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1));
    Object v3 = Character.valueOf((char)2);
    Object v4 = true;
    Object v5 = ((org.jsoup.parser.Tokeniser)v2).consumeCharacterReference(((java.lang.Character)v3),(((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = "tit";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1));
    Object v3 = "tit";
    Object v4 = new org.jsoup.parser.CharacterReader(((java.lang.String)v3));
    Object v5 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v4));
    Object v6 = ((org.jsoup.parser.Tokeniser)v5).getState();
    Object v7 = ((java.lang.Enum)v6).getDeclaringClass();
    ((org.jsoup.parser.Tokeniser)v2).error(((org.jsoup.parser.TokeniserState)v6));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = "tit";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1));
    Object v3 = "tit";
    Object v4 = new org.jsoup.parser.CharacterReader(((java.lang.String)v3));
    Object v5 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v4));
    Object v6 = ((org.jsoup.parser.Tokeniser)v5).getState();
    Object v7 = ((java.lang.Enum)v6).getDeclaringClass();
    ((org.jsoup.parser.Tokeniser)v2).eofError(((org.jsoup.parser.TokeniserState)v6));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = "tit";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1));
    ((org.jsoup.parser.Tokeniser)v2).createDoctypePending();
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = "tit";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1));
    Object v3 = "GET";
    ((org.jsoup.parser.Tokeniser)v2).emit(((java.lang.String)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = "tit";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1));
    Object v3 = "html";
    ((org.jsoup.parser.Tokeniser)v2).emit(((java.lang.String)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = "tit";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1));
    Object v3 = "";
    ((org.jsoup.parser.Tokeniser)v2).emit(((java.lang.String)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = "tit";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1));
    Object v3 = ((org.jsoup.parser.Tokeniser)v2).appropriateEndTagName();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = "tit";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1));
    Object v3 = Character.valueOf((char)0);
    ((org.jsoup.parser.Tokeniser)v2).emit((((java.lang.Character)v3).charValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = "tit";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1));
    Object v3 = Character.valueOf((char)1);
    Object v4 = true;
    Object v5 = ((org.jsoup.parser.Tokeniser)v2).consumeCharacterReference(((java.lang.Character)v3),(((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = "tit";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1));
    Object v3 = "tit";
    Object v4 = new org.jsoup.parser.CharacterReader(((java.lang.String)v3));
    Object v5 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v4));
    Object v6 = ((org.jsoup.parser.Tokeniser)v5).getState();
    Object v7 = "tit";
    Object v8 = new org.jsoup.parser.CharacterReader(((java.lang.String)v7));
    Object v9 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v8));
    Object v10 = ((org.jsoup.parser.Tokeniser)v9).getState();
    Object v11 = ((java.lang.Enum)v6).compareTo(((java.lang.Enum)v10));
    ((org.jsoup.parser.Tokeniser)v2).eofError(((org.jsoup.parser.TokeniserState)v6));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = "tit";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1));
    Object v3 = "ap";
    ((org.jsoup.parser.Tokeniser)v2).emit(((java.lang.String)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = "tit";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1));
    Object v3 = "+=";
    ((org.jsoup.parser.Tokeniser)v2).emit(((java.lang.String)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = "tit";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1));
    Object v3 = "hrr";
    ((org.jsoup.parser.Tokeniser)v2).emit(((java.lang.String)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = "tit";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1));
    Object v3 = Character.valueOf((char)1);
    ((org.jsoup.parser.Tokeniser)v2).emit((((java.lang.Character)v3).charValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = "tit";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1));
    Object v3 = Character.valueOf((char)20);
    Object v4 = false;
    Object v5 = ((org.jsoup.parser.Tokeniser)v2).consumeCharacterReference(((java.lang.Character)v3),(((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = "tit";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1));
    Object v3 = "tit";
    Object v4 = new org.jsoup.parser.CharacterReader(((java.lang.String)v3));
    Object v5 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v4));
    Object v6 = ((org.jsoup.parser.Tokeniser)v5).getState();
    Object v7 = ((java.lang.Enum)v6).hashCode();
    ((org.jsoup.parser.Tokeniser)v2).eofError(((org.jsoup.parser.TokeniserState)v6));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = "tit";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1));
    Object v3 = Character.valueOf((char)1083);
    Object v4 = false;
    Object v5 = ((org.jsoup.parser.Tokeniser)v2).consumeCharacterReference(((java.lang.Character)v3),(((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = "tit";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1));
    Object v3 = "tit";
    Object v4 = new org.jsoup.parser.CharacterReader(((java.lang.String)v3));
    Object v5 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v4));
    Object v6 = ((org.jsoup.parser.Tokeniser)v5).getState();
    Object v7 = ((java.lang.Enum)v6).hashCode();
    ((org.jsoup.parser.Tokeniser)v2).advanceTransition(((org.jsoup.parser.TokeniserState)v6));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = "tit";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1));
    Object v3 = "tit";
    Object v4 = new org.jsoup.parser.CharacterReader(((java.lang.String)v3));
    Object v5 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v4));
    Object v6 = ((org.jsoup.parser.Tokeniser)v5).getState();
    Object v7 = ((java.lang.Enum)v6).getDeclaringClass();
    ((org.jsoup.parser.Tokeniser)v2).advanceTransition(((org.jsoup.parser.TokeniserState)v6));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = "tit";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).toString();
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = "tit";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).toString();
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1));
    Object v4 = "tbo-dy";
    ((org.jsoup.parser.Tokeniser)v3).emit(((java.lang.String)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = "tit";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).toString();
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1));
    Object v4 = "tit";
    Object v5 = new org.jsoup.parser.CharacterReader(((java.lang.String)v4));
    Object v6 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v5));
    Object v7 = ((org.jsoup.parser.Tokeniser)v6).getState();
    Object v8 = ((java.lang.Enum)v7).getDeclaringClass();
    ((org.jsoup.parser.Tokeniser)v3).transition(((org.jsoup.parser.TokeniserState)v7));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = "tit";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).toString();
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1));
    Object v4 = false;
    Object v5 = ((org.jsoup.parser.Tokeniser)v3).createTagPending((((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = "tit";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).toString();
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1));
    Object v4 = true;
    Object v5 = ((org.jsoup.parser.Tokeniser)v3).createTagPending((((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = "tit";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).toString();
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1));
    Object v4 = "tit";
    Object v5 = new org.jsoup.parser.CharacterReader(((java.lang.String)v4));
    Object v6 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v5));
    Object v7 = true;
    Object v8 = ((org.jsoup.parser.Tokeniser)v6).createTagPending((((java.lang.Boolean)v7).booleanValue()));
    ((org.jsoup.parser.Tokeniser)v3).emit(((org.jsoup.parser.Token)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = "tit";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).toString();
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1));
    ((org.jsoup.parser.Tokeniser)v3).createCommentPending();
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = "tit";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).toString();
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1));
    Object v4 = Character.valueOf((char)2);
    Object v5 = true;
    Object v6 = ((org.jsoup.parser.Tokeniser)v3).consumeCharacterReference(((java.lang.Character)v4),(((java.lang.Boolean)v5).booleanValue()));
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = "tit";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).toString();
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1));
    Object v4 = "tit";
    Object v5 = new org.jsoup.parser.CharacterReader(((java.lang.String)v4));
    Object v6 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v5));
    Object v7 = ((org.jsoup.parser.Tokeniser)v6).getState();
    ((org.jsoup.parser.Tokeniser)v3).error(((org.jsoup.parser.TokeniserState)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = "tit";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).toString();
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1));
    Object v4 = "tit";
    Object v5 = new org.jsoup.parser.CharacterReader(((java.lang.String)v4));
    Object v6 = ((org.jsoup.parser.CharacterReader)v5).toString();
    Object v7 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v5));
    Object v8 = true;
    Object v9 = ((org.jsoup.parser.Tokeniser)v7).createTagPending((((java.lang.Boolean)v8).booleanValue()));
    ((org.jsoup.parser.Tokeniser)v3).emit(((org.jsoup.parser.Token)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = "tit";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).toString();
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1));
    Object v4 = "tit";
    Object v5 = new org.jsoup.parser.CharacterReader(((java.lang.String)v4));
    Object v6 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v5));
    Object v7 = ((org.jsoup.parser.Tokeniser)v6).getState();
    Object v8 = "tit";
    Object v9 = new org.jsoup.parser.CharacterReader(((java.lang.String)v8));
    Object v10 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v9));
    Object v11 = ((org.jsoup.parser.Tokeniser)v10).getState();
    Object v12 = ((java.lang.Enum)v7).compareTo(((java.lang.Enum)v11));
    ((org.jsoup.parser.Tokeniser)v3).error(((org.jsoup.parser.TokeniserState)v7));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = "tit";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).toString();
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1));
    Object v4 = "body";
    ((org.jsoup.parser.Tokeniser)v3).emit(((java.lang.String)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = "tit";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).toString();
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1));
    Object v4 = ((org.jsoup.parser.Tokeniser)v3).read();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = "tit";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).toString();
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1));
    Object v4 = "tit";
    Object v5 = new org.jsoup.parser.CharacterReader(((java.lang.String)v4));
    Object v6 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v5));
    Object v7 = ((org.jsoup.parser.Tokeniser)v6).getState();
    ((org.jsoup.parser.Tokeniser)v3).transition(((org.jsoup.parser.TokeniserState)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = "tit";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).toString();
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1));
    Object v4 = "els";
    ((org.jsoup.parser.Tokeniser)v3).emit(((java.lang.String)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = "tit";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).toString();
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1));
    Object v4 = "tit";
    Object v5 = new org.jsoup.parser.CharacterReader(((java.lang.String)v4));
    Object v6 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v5));
    Object v7 = ((org.jsoup.parser.Tokeniser)v6).getState();
    ((org.jsoup.parser.Tokeniser)v3).eofError(((org.jsoup.parser.TokeniserState)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = "tit";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).toString();
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1));
    Object v4 = ((org.jsoup.parser.Tokeniser)v3).appropriateEndTagName();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = "tit";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).toString();
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1));
    Object v4 = "ti";
    ((org.jsoup.parser.Tokeniser)v3).emit(((java.lang.String)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = "tit";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).toString();
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1));
    Object v4 = "tit";
    Object v5 = new org.jsoup.parser.CharacterReader(((java.lang.String)v4));
    Object v6 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v5));
    Object v7 = ((org.jsoup.parser.Tokeniser)v6).read();
    ((org.jsoup.parser.Tokeniser)v3).emit(((org.jsoup.parser.Token)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = "tit";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).toString();
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1));
    Object v4 = "tit";
    Object v5 = new org.jsoup.parser.CharacterReader(((java.lang.String)v4));
    Object v6 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v5));
    Object v7 = ((org.jsoup.parser.Tokeniser)v6).getState();
    Object v8 = "tit";
    Object v9 = new org.jsoup.parser.CharacterReader(((java.lang.String)v8));
    Object v10 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v9));
    Object v11 = ((org.jsoup.parser.Tokeniser)v10).getState();
    Object v12 = ((java.lang.Enum)v7).compareTo(((java.lang.Enum)v11));
    ((org.jsoup.parser.Tokeniser)v3).transition(((org.jsoup.parser.TokeniserState)v7));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = "tit";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).toString();
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1));
    Object v4 = "tit";
    Object v5 = new org.jsoup.parser.CharacterReader(((java.lang.String)v4));
    Object v6 = ((org.jsoup.parser.CharacterReader)v5).toString();
    Object v7 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v5));
    Object v8 = ((org.jsoup.parser.Tokeniser)v7).read();
    ((org.jsoup.parser.Tokeniser)v3).emit(((org.jsoup.parser.Token)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = "tit";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).toString();
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1));
    Object v4 = "thead";
    ((org.jsoup.parser.Tokeniser)v3).emit(((java.lang.String)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = "tit";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).toString();
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1));
    ((org.jsoup.parser.Tokeniser)v3).createDoctypePending();
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = "tit";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).toString();
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1));
    Object v4 = "tit";
    Object v5 = new org.jsoup.parser.CharacterReader(((java.lang.String)v4));
    Object v6 = ((org.jsoup.parser.CharacterReader)v5).toString();
    Object v7 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v5));
    Object v8 = false;
    Object v9 = ((org.jsoup.parser.Tokeniser)v7).createTagPending((((java.lang.Boolean)v8).booleanValue()));
    ((org.jsoup.parser.Tokeniser)v3).emit(((org.jsoup.parser.Token)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = "tit";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).toString();
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1));
    Object v4 = Character.valueOf((char)0);
    Object v5 = false;
    Object v6 = ((org.jsoup.parser.Tokeniser)v3).consumeCharacterReference(((java.lang.Character)v4),(((java.lang.Boolean)v5).booleanValue()));
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = "tit";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).toString();
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1));
    ((org.jsoup.parser.Tokeniser)v3).acknowledgeSelfClosingFlag();
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = "tit";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).toString();
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1));
    ((org.jsoup.parser.Tokeniser)v3).emitDoctypePending();
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = "tit";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1));
    Object v3 = "tit";
    Object v4 = new org.jsoup.parser.CharacterReader(((java.lang.String)v3));
    Object v5 = ((org.jsoup.parser.CharacterReader)v4).toString();
    Object v6 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v4));
    Object v7 = false;
    Object v8 = ((org.jsoup.parser.Tokeniser)v6).createTagPending((((java.lang.Boolean)v7).booleanValue()));
    ((org.jsoup.parser.Tokeniser)v2).emit(((org.jsoup.parser.Token)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = "tit";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).toString();
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1));
    ((org.jsoup.parser.Tokeniser)v3).createTempBuffer();
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = "tit";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).toString();
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1));
    Object v4 = ((org.jsoup.parser.Tokeniser)v3).isAppropriateEndTagToken();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = "tit";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).toString();
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1));
    Object v4 = "tit";
    Object v5 = new org.jsoup.parser.CharacterReader(((java.lang.String)v4));
    Object v6 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v5));
    Object v7 = ((org.jsoup.parser.Tokeniser)v6).getState();
    Object v8 = "tit";
    Object v9 = new org.jsoup.parser.CharacterReader(((java.lang.String)v8));
    Object v10 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v9));
    Object v11 = ((org.jsoup.parser.Tokeniser)v10).getState();
    Object v12 = ((java.lang.Enum)v7).compareTo(((java.lang.Enum)v11));
    ((org.jsoup.parser.Tokeniser)v3).advanceTransition(((org.jsoup.parser.TokeniserState)v7));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = "tit";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).toString();
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1));
    Object v4 = "h";
    ((org.jsoup.parser.Tokeniser)v3).emit(((java.lang.String)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = "tit";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).toString();
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1));
    Object v4 = Character.valueOf((char)1);
    Object v5 = false;
    Object v6 = ((org.jsoup.parser.Tokeniser)v3).consumeCharacterReference(((java.lang.Character)v4),(((java.lang.Boolean)v5).booleanValue()));
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = "tit";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).toString();
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1));
    Object v4 = ((org.jsoup.parser.Tokeniser)v3).isTrackErrors();
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = "tit";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).toString();
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1));
    Object v4 = "tit";
    Object v5 = new org.jsoup.parser.CharacterReader(((java.lang.String)v4));
    Object v6 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v5));
    Object v7 = ((org.jsoup.parser.Tokeniser)v6).getState();
    Object v8 = ((java.lang.Enum)v7).getDeclaringClass();
    ((org.jsoup.parser.Tokeniser)v3).error(((org.jsoup.parser.TokeniserState)v7));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = "tit";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).toString();
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1));
    Object v4 = "tit";
    Object v5 = new org.jsoup.parser.CharacterReader(((java.lang.String)v4));
    Object v6 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v5));
    Object v7 = ((org.jsoup.parser.Tokeniser)v6).getState();
    Object v8 = ((java.lang.Enum)v7).hashCode();
    ((org.jsoup.parser.Tokeniser)v3).error(((org.jsoup.parser.TokeniserState)v7));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = "tit";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).toString();
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1));
    Object v4 = ((org.jsoup.parser.Tokeniser)v3).getState();
    org.junit.Assert.assertEquals((Object)(org.jsoup.parser.TokeniserState.Data), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = "tit";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).toString();
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1));
    Object v4 = Character.valueOf((char)1);
    Object v5 = true;
    Object v6 = ((org.jsoup.parser.Tokeniser)v3).consumeCharacterReference(((java.lang.Character)v4),(((java.lang.Boolean)v5).booleanValue()));
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = "tit";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).toString();
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1));
    Object v4 = "tit";
    Object v5 = new org.jsoup.parser.CharacterReader(((java.lang.String)v4));
    Object v6 = ((org.jsoup.parser.CharacterReader)v5).toString();
    Object v7 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v5));
    Object v8 = ((org.jsoup.parser.Tokeniser)v7).getState();
    ((org.jsoup.parser.Tokeniser)v3).error(((org.jsoup.parser.TokeniserState)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = "tit";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).toString();
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1));
    Object v4 = ((org.jsoup.parser.Tokeniser)v3).currentNodeInHtmlNS();
    org.junit.Assert.assertEquals((Object)(true), v4);
  }
}
