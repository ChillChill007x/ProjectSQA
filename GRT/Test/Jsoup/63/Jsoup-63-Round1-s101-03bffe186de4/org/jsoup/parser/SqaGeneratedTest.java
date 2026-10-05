package org.jsoup.parser;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = "noscript";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1),((org.jsoup.parser.ParseErrorList)v2));
    Object v4 = org.jsoup.parser.TokeniserState.ScriptDataEscapedDash;
    Object v5 = ((java.lang.Enum)v4).getDeclaringClass();
    ((org.jsoup.parser.Tokeniser)v3).error(((org.jsoup.parser.TokeniserState)v4));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = "noscript";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1),((org.jsoup.parser.ParseErrorList)v2));
    Object v4 = "h[";
    ((org.jsoup.parser.Tokeniser)v3).error(((java.lang.String)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = "noscript";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1),((org.jsoup.parser.ParseErrorList)v2));
    Object v4 = false;
    Object v5 = ((org.jsoup.parser.Tokeniser)v3).unescapeEntities((((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertEquals((Object)("noscript"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = "noscript";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1),((org.jsoup.parser.ParseErrorList)v2));
    Object v4 = ((org.jsoup.parser.Tokeniser)v3).appropriateEndTagName();
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = "noscript";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1),((org.jsoup.parser.ParseErrorList)v2));
    Object v4 = Character.valueOf((char)1);
    Object v5 = false;
    Object v6 = ((org.jsoup.parser.Tokeniser)v3).consumeCharacterReference(((java.lang.Character)v4),(((java.lang.Boolean)v5).booleanValue()));
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = "noscript";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1),((org.jsoup.parser.ParseErrorList)v2));
    Object v4 = false;
    Object v5 = ((org.jsoup.parser.Tokeniser)v3).createTagPending((((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = "noscript";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1),((org.jsoup.parser.ParseErrorList)v2));
    Object v4 = true;
    Object v5 = ((org.jsoup.parser.Tokeniser)v3).unescapeEntities((((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertEquals((Object)("noscript"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = "noscript";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1),((org.jsoup.parser.ParseErrorList)v2));
    Object v4 = ((org.jsoup.parser.Tokeniser)v3).isAppropriateEndTagToken();
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = "noscript";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1),((org.jsoup.parser.ParseErrorList)v2));
    Object v4 = "option";
    ((org.jsoup.parser.Tokeniser)v3).emit(((java.lang.String)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = "noscript";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1),((org.jsoup.parser.ParseErrorList)v2));
    ((org.jsoup.parser.Tokeniser)v3).emitDoctypePending();
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = "noscript";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1),((org.jsoup.parser.ParseErrorList)v2));
    Object v4 = org.jsoup.parser.TokeniserState.ScriptDataDoubleEscapedLessthanSign;
    ((org.jsoup.parser.Tokeniser)v3).eofError(((org.jsoup.parser.TokeniserState)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = "noscript";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1),((org.jsoup.parser.ParseErrorList)v2));
    Object v4 = org.jsoup.parser.TokeniserState.DoctypePublicIdentifier_singleQuoted;
    ((org.jsoup.parser.Tokeniser)v3).error(((org.jsoup.parser.TokeniserState)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = "noscript";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1),((org.jsoup.parser.ParseErrorList)v2));
    Object v4 = Character.valueOf((char)0);
    Object v5 = true;
    Object v6 = ((org.jsoup.parser.Tokeniser)v3).consumeCharacterReference(((java.lang.Character)v4),(((java.lang.Boolean)v5).booleanValue()));
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = "noscript";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1),((org.jsoup.parser.ParseErrorList)v2));
    Object v4 = "tbody";
    ((org.jsoup.parser.Tokeniser)v3).emit(((java.lang.String)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = "noscript";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1),((org.jsoup.parser.ParseErrorList)v2));
    Object v4 = "colgrouOp";
    ((org.jsoup.parser.Tokeniser)v3).emit(((java.lang.String)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = "noscript";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1),((org.jsoup.parser.ParseErrorList)v2));
    Object v4 = "noscript";
    Object v5 = new org.jsoup.parser.CharacterReader(((java.lang.String)v4));
    Object v6 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v7 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v5),((org.jsoup.parser.ParseErrorList)v6));
    Object v8 = false;
    Object v9 = ((org.jsoup.parser.Tokeniser)v7).createTagPending((((java.lang.Boolean)v8).booleanValue()));
    ((org.jsoup.parser.Tokeniser)v3).emit(((org.jsoup.parser.Token)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = "noscript";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1),((org.jsoup.parser.ParseErrorList)v2));
    Object v4 = "b_r";
    ((org.jsoup.parser.Tokeniser)v3).emit(((java.lang.String)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = "noscript";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1),((org.jsoup.parser.ParseErrorList)v2));
    Object v4 = org.jsoup.parser.TokeniserState.ScriptDataDoubleEscapedDash;
    ((org.jsoup.parser.Tokeniser)v3).eofError(((org.jsoup.parser.TokeniserState)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = "noscript";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1),((org.jsoup.parser.ParseErrorList)v2));
    Object v4 = ((org.jsoup.parser.Tokeniser)v3).read();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = "noscript";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1),((org.jsoup.parser.ParseErrorList)v2));
    Object v4 = org.jsoup.parser.TokeniserState.ScriptDataEscaped;
    Object v5 = ((java.lang.Enum)v4).hashCode();
    ((org.jsoup.parser.Tokeniser)v3).error(((org.jsoup.parser.TokeniserState)v4));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = "noscript";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1),((org.jsoup.parser.ParseErrorList)v2));
    ((org.jsoup.parser.Tokeniser)v3).createTempBuffer();
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = "noscript";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1),((org.jsoup.parser.ParseErrorList)v2));
    Object v4 = org.jsoup.parser.TokeniserState.BeforeDoctypePublicIdentifier;
    ((org.jsoup.parser.Tokeniser)v3).transition(((org.jsoup.parser.TokeniserState)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = "noscript";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1),((org.jsoup.parser.ParseErrorList)v2));
    Object v4 = org.jsoup.parser.TokeniserState.ScriptDataDoubleEscapeStart;
    ((org.jsoup.parser.Tokeniser)v3).error(((org.jsoup.parser.TokeniserState)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = "noscript";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1),((org.jsoup.parser.ParseErrorList)v2));
    Object v4 = "disbled";
    ((org.jsoup.parser.Tokeniser)v3).error(((java.lang.String)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = "noscript";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1),((org.jsoup.parser.ParseErrorList)v2));
    Object v4 = "ht~ml";
    ((org.jsoup.parser.Tokeniser)v3).emit(((java.lang.String)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = "noscript";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1),((org.jsoup.parser.ParseErrorList)v2));
    Object v4 = ((org.jsoup.parser.Tokeniser)v3).currentNodeInHtmlNS();
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = "noscript";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1),((org.jsoup.parser.ParseErrorList)v2));
    Object v4 = new char[]{};
    ((org.jsoup.parser.Tokeniser)v3).emit(((char[])v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = "noscript";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1),((org.jsoup.parser.ParseErrorList)v2));
    Object v4 = org.jsoup.parser.TokeniserState.CdataSection;
    ((org.jsoup.parser.Tokeniser)v3).eofError(((org.jsoup.parser.TokeniserState)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = "noscript";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1),((org.jsoup.parser.ParseErrorList)v2));
    Object v4 = ":last-child";
    ((org.jsoup.parser.Tokeniser)v3).emit(((java.lang.String)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = "noscript";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1),((org.jsoup.parser.ParseErrorList)v2));
    Object v4 = "(";
    ((org.jsoup.parser.Tokeniser)v3).emit(((java.lang.String)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = "noscript";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1),((org.jsoup.parser.ParseErrorList)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = "noscript";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1),((org.jsoup.parser.ParseErrorList)v2));
    Object v4 = org.jsoup.parser.TokeniserState.CharacterReferenceInRcdata;
    ((org.jsoup.parser.Tokeniser)v3).error(((org.jsoup.parser.TokeniserState)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = "noscript";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1),((org.jsoup.parser.ParseErrorList)v2));
    Object v4 = org.jsoup.parser.TokeniserState.ScriptDataEndTagOpen;
    Object v5 = ((java.lang.Enum)v4).getDeclaringClass();
    ((org.jsoup.parser.Tokeniser)v3).eofError(((org.jsoup.parser.TokeniserState)v4));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = "noscript";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1),((org.jsoup.parser.ParseErrorList)v2));
    ((org.jsoup.parser.Tokeniser)v3).createDoctypePending();
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = "noscript";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1),((org.jsoup.parser.ParseErrorList)v2));
    Object v4 = "tfoot";
    ((org.jsoup.parser.Tokeniser)v3).error(((java.lang.String)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = "noscript";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1),((org.jsoup.parser.ParseErrorList)v2));
    Object v4 = org.jsoup.parser.TokeniserState.AttributeValue_singleQuoted;
    ((org.jsoup.parser.Tokeniser)v3).eofError(((org.jsoup.parser.TokeniserState)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = "noscript";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1),((org.jsoup.parser.ParseErrorList)v2));
    Object v4 = "W?";
    ((org.jsoup.parser.Tokeniser)v3).emit(((java.lang.String)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = "noscript";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1),((org.jsoup.parser.ParseErrorList)v2));
    Object v4 = "bgsound";
    ((org.jsoup.parser.Tokeniser)v3).error(((java.lang.String)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = "noscript";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1),((org.jsoup.parser.ParseErrorList)v2));
    Object v4 = org.jsoup.parser.TokeniserState.ScriptDataEscapeStartDash;
    ((org.jsoup.parser.Tokeniser)v3).eofError(((org.jsoup.parser.TokeniserState)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = "noscript";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1),((org.jsoup.parser.ParseErrorList)v2));
    Object v4 = "h6";
    ((org.jsoup.parser.Tokeniser)v3).emit(((java.lang.String)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = "noscript";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1),((org.jsoup.parser.ParseErrorList)v2));
    Object v4 = "head";
    ((org.jsoup.parser.Tokeniser)v3).error(((java.lang.String)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = "noscript";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1),((org.jsoup.parser.ParseErrorList)v2));
    Object v4 = Character.valueOf((char)1);
    Object v5 = true;
    Object v6 = ((org.jsoup.parser.Tokeniser)v3).consumeCharacterReference(((java.lang.Character)v4),(((java.lang.Boolean)v5).booleanValue()));
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = "noscript";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1),((org.jsoup.parser.ParseErrorList)v2));
    Object v4 = "b";
    ((org.jsoup.parser.Tokeniser)v3).emit(((java.lang.String)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = "noscript";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1),((org.jsoup.parser.ParseErrorList)v2));
    Object v4 = new char[]{Character.valueOf((char)9),Character.valueOf((char)2)};
    ((org.jsoup.parser.Tokeniser)v3).emit(((char[])v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = "noscript";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1),((org.jsoup.parser.ParseErrorList)v2));
    ((org.jsoup.parser.Tokeniser)v3).emitTagPending();
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = "noscript";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1),((org.jsoup.parser.ParseErrorList)v2));
    Object v4 = ((org.jsoup.parser.Tokeniser)v3).getState();
    org.junit.Assert.assertEquals((Object)(org.jsoup.parser.TokeniserState.Data), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = "noscript";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1),((org.jsoup.parser.ParseErrorList)v2));
    Object v4 = "noscript";
    Object v5 = new org.jsoup.parser.CharacterReader(((java.lang.String)v4));
    Object v6 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v7 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v5),((org.jsoup.parser.ParseErrorList)v6));
    Object v8 = ((org.jsoup.parser.Tokeniser)v7).getState();
    ((org.jsoup.parser.Tokeniser)v3).eofError(((org.jsoup.parser.TokeniserState)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = "noscript";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1),((org.jsoup.parser.ParseErrorList)v2));
    Object v4 = "noscript";
    Object v5 = new org.jsoup.parser.CharacterReader(((java.lang.String)v4));
    Object v6 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v7 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v5),((org.jsoup.parser.ParseErrorList)v6));
    Object v8 = ((org.jsoup.parser.Tokeniser)v7).read();
    ((org.jsoup.parser.Tokeniser)v3).emit(((org.jsoup.parser.Token)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = "noscript";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1),((org.jsoup.parser.ParseErrorList)v2));
    Object v4 = "noscript";
    Object v5 = new org.jsoup.parser.CharacterReader(((java.lang.String)v4));
    Object v6 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v7 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v5),((org.jsoup.parser.ParseErrorList)v6));
    Object v8 = ((org.jsoup.parser.Tokeniser)v7).getState();
    Object v9 = "noscript";
    Object v10 = new org.jsoup.parser.CharacterReader(((java.lang.String)v9));
    Object v11 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v12 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v10),((org.jsoup.parser.ParseErrorList)v11));
    Object v13 = ((org.jsoup.parser.Tokeniser)v12).getState();
    Object v14 = ((java.lang.Enum)v8).compareTo(((java.lang.Enum)v13));
    ((org.jsoup.parser.Tokeniser)v3).error(((org.jsoup.parser.TokeniserState)v8));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = "noscript";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1),((org.jsoup.parser.ParseErrorList)v2));
    ((org.jsoup.parser.Tokeniser)v3).createCommentPending();
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = "noscript";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1),((org.jsoup.parser.ParseErrorList)v2));
    Object v4 = new int[]{};
    ((org.jsoup.parser.Tokeniser)v3).emit(((int[])v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = "noscript";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1),((org.jsoup.parser.ParseErrorList)v2));
    Object v4 = "bgound";
    ((org.jsoup.parser.Tokeniser)v3).error(((java.lang.String)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = "noscript";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1),((org.jsoup.parser.ParseErrorList)v2));
    Object v4 = "T";
    ((org.jsoup.parser.Tokeniser)v3).error(((java.lang.String)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = "noscript";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1),((org.jsoup.parser.ParseErrorList)v2));
    Object v4 = "noscript";
    Object v5 = new org.jsoup.parser.CharacterReader(((java.lang.String)v4));
    Object v6 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v7 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v5),((org.jsoup.parser.ParseErrorList)v6));
    Object v8 = ((org.jsoup.parser.Tokeniser)v7).getState();
    ((org.jsoup.parser.Tokeniser)v3).transition(((org.jsoup.parser.TokeniserState)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = "noscript";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1),((org.jsoup.parser.ParseErrorList)v2));
    Object v4 = "noscript";
    Object v5 = new org.jsoup.parser.CharacterReader(((java.lang.String)v4));
    Object v6 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v7 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v5),((org.jsoup.parser.ParseErrorList)v6));
    Object v8 = ((org.jsoup.parser.Tokeniser)v7).getState();
    ((org.jsoup.parser.Tokeniser)v3).error(((org.jsoup.parser.TokeniserState)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = "noscript";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1),((org.jsoup.parser.ParseErrorList)v2));
    Object v4 = "O";
    ((org.jsoup.parser.Tokeniser)v3).error(((java.lang.String)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = "noscript";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1),((org.jsoup.parser.ParseErrorList)v2));
    Object v4 = "#declaration";
    ((org.jsoup.parser.Tokeniser)v3).error(((java.lang.String)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = "noscript";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1),((org.jsoup.parser.ParseErrorList)v2));
    Object v4 = "noscript";
    Object v5 = new org.jsoup.parser.CharacterReader(((java.lang.String)v4));
    Object v6 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v7 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v5),((org.jsoup.parser.ParseErrorList)v6));
    Object v8 = ((org.jsoup.parser.Tokeniser)v7).getState();
    Object v9 = ((java.lang.Enum)v8).getDeclaringClass();
    ((org.jsoup.parser.Tokeniser)v3).advanceTransition(((org.jsoup.parser.TokeniserState)v8));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = "noscript";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1),((org.jsoup.parser.ParseErrorList)v2));
    Object v4 = "td";
    ((org.jsoup.parser.Tokeniser)v3).error(((java.lang.String)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = "noscript";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1),((org.jsoup.parser.ParseErrorList)v2));
    Object v4 = true;
    Object v5 = ((org.jsoup.parser.Tokeniser)v3).createTagPending((((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = "noscript";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1),((org.jsoup.parser.ParseErrorList)v2));
    Object v4 = "tbZody";
    ((org.jsoup.parser.Tokeniser)v3).emit(((java.lang.String)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = "noscript";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1),((org.jsoup.parser.ParseErrorList)v2));
    Object v4 = "st-ike";
    ((org.jsoup.parser.Tokeniser)v3).error(((java.lang.String)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = "noscript";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1),((org.jsoup.parser.ParseErrorList)v2));
    Object v4 = "nofollSow";
    ((org.jsoup.parser.Tokeniser)v3).emit(((java.lang.String)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = "noscript";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1),((org.jsoup.parser.ParseErrorList)v2));
    Object v4 = "noscript";
    Object v5 = new org.jsoup.parser.CharacterReader(((java.lang.String)v4));
    Object v6 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v7 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v5),((org.jsoup.parser.ParseErrorList)v6));
    Object v8 = true;
    Object v9 = ((org.jsoup.parser.Tokeniser)v7).createTagPending((((java.lang.Boolean)v8).booleanValue()));
    ((org.jsoup.parser.Tokeniser)v3).emit(((org.jsoup.parser.Token)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = "noscript";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1),((org.jsoup.parser.ParseErrorList)v2));
    Object v4 = "";
    ((org.jsoup.parser.Tokeniser)v3).emit(((java.lang.String)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = "noscript";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1),((org.jsoup.parser.ParseErrorList)v2));
    ((org.jsoup.parser.Tokeniser)v3).emitCommentPending();
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = "noscript";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1),((org.jsoup.parser.ParseErrorList)v2));
    Object v4 = new int[]{0,16};
    ((org.jsoup.parser.Tokeniser)v3).emit(((int[])v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = "noscript";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1),((org.jsoup.parser.ParseErrorList)v2));
    Object v4 = new char[]{Character.valueOf((char)1),Character.valueOf((char)0),Character.valueOf((char)0)};
    ((org.jsoup.parser.Tokeniser)v3).emit(((char[])v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = "noscript";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1),((org.jsoup.parser.ParseErrorList)v2));
    Object v4 = Character.valueOf((char)0);
    ((org.jsoup.parser.Tokeniser)v3).emit((((java.lang.Character)v4).charValue()));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = "noscript";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1),((org.jsoup.parser.ParseErrorList)v2));
    Object v4 = "bodyN";
    ((org.jsoup.parser.Tokeniser)v3).error(((java.lang.String)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = "noscript";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1),((org.jsoup.parser.ParseErrorList)v2));
    Object v4 = "thtml";
    ((org.jsoup.parser.Tokeniser)v3).error(((java.lang.String)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = "noscript";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1),((org.jsoup.parser.ParseErrorList)v2));
    Object v4 = "tfoo:";
    ((org.jsoup.parser.Tokeniser)v3).emit(((java.lang.String)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = "noscript";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1),((org.jsoup.parser.ParseErrorList)v2));
    Object v4 = "";
    ((org.jsoup.parser.Tokeniser)v3).error(((java.lang.String)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = "noscript";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1),((org.jsoup.parser.ParseErrorList)v2));
    Object v4 = "noscript";
    Object v5 = new org.jsoup.parser.CharacterReader(((java.lang.String)v4));
    Object v6 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v7 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v5),((org.jsoup.parser.ParseErrorList)v6));
    Object v8 = ((org.jsoup.parser.Tokeniser)v7).getState();
    Object v9 = ((java.lang.Enum)v8).hashCode();
    ((org.jsoup.parser.Tokeniser)v3).eofError(((org.jsoup.parser.TokeniserState)v8));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = "noscript";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1),((org.jsoup.parser.ParseErrorList)v2));
    Object v4 = new char[]{Character.valueOf((char)2)};
    ((org.jsoup.parser.Tokeniser)v3).emit(((char[])v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = "noscript";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1),((org.jsoup.parser.ParseErrorList)v2));
    Object v4 = Character.valueOf((char)7);
    Object v5 = true;
    Object v6 = ((org.jsoup.parser.Tokeniser)v3).consumeCharacterReference(((java.lang.Character)v4),(((java.lang.Boolean)v5).booleanValue()));
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = "noscript";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1),((org.jsoup.parser.ParseErrorList)v2));
    Object v4 = "thead";
    ((org.jsoup.parser.Tokeniser)v3).error(((java.lang.String)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = "noscript";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1),((org.jsoup.parser.ParseErrorList)v2));
    Object v4 = "h2";
    ((org.jsoup.parser.Tokeniser)v3).error(((java.lang.String)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = "noscript";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1),((org.jsoup.parser.ParseErrorList)v2));
    Object v4 = "h*tml";
    ((org.jsoup.parser.Tokeniser)v3).error(((java.lang.String)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = "noscript";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1),((org.jsoup.parser.ParseErrorList)v2));
    Object v4 = "noscript";
    Object v5 = new org.jsoup.parser.CharacterReader(((java.lang.String)v4));
    Object v6 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v7 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v5),((org.jsoup.parser.ParseErrorList)v6));
    Object v8 = ((org.jsoup.parser.Tokeniser)v7).getState();
    Object v9 = ((java.lang.Enum)v8).hashCode();
    ((org.jsoup.parser.Tokeniser)v3).error(((org.jsoup.parser.TokeniserState)v8));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = "noscript";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1),((org.jsoup.parser.ParseErrorList)v2));
    Object v4 = "p";
    ((org.jsoup.parser.Tokeniser)v3).emit(((java.lang.String)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = "noscript";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1),((org.jsoup.parser.ParseErrorList)v2));
    Object v4 = new char[]{Character.valueOf((char)0)};
    ((org.jsoup.parser.Tokeniser)v3).emit(((char[])v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = "noscript";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1),((org.jsoup.parser.ParseErrorList)v2));
    Object v4 = "tr";
    ((org.jsoup.parser.Tokeniser)v3).error(((java.lang.String)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = "noscript";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1),((org.jsoup.parser.ParseErrorList)v2));
    Object v4 = "bdy";
    ((org.jsoup.parser.Tokeniser)v3).emit(((java.lang.String)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = "noscript";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1),((org.jsoup.parser.ParseErrorList)v2));
    Object v4 = Character.valueOf((char)3);
    Object v5 = true;
    Object v6 = ((org.jsoup.parser.Tokeniser)v3).consumeCharacterReference(((java.lang.Character)v4),(((java.lang.Boolean)v5).booleanValue()));
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = "noscript";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1),((org.jsoup.parser.ParseErrorList)v2));
    Object v4 = Character.valueOf((char)1);
    ((org.jsoup.parser.Tokeniser)v3).emit((((java.lang.Character)v4).charValue()));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = "noscript";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1),((org.jsoup.parser.ParseErrorList)v2));
    Object v4 = Character.valueOf((char)0);
    Object v5 = false;
    Object v6 = ((org.jsoup.parser.Tokeniser)v3).consumeCharacterReference(((java.lang.Character)v4),(((java.lang.Boolean)v5).booleanValue()));
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = "noscript";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1),((org.jsoup.parser.ParseErrorList)v2));
    Object v4 = "head";
    ((org.jsoup.parser.Tokeniser)v3).emit(((java.lang.String)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = "noscript";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1),((org.jsoup.parser.ParseErrorList)v2));
    Object v4 = "utitle";
    ((org.jsoup.parser.Tokeniser)v3).error(((java.lang.String)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = "noscript";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1),((org.jsoup.parser.ParseErrorList)v2));
    Object v4 = "noscript";
    Object v5 = new org.jsoup.parser.CharacterReader(((java.lang.String)v4));
    Object v6 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v7 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v5),((org.jsoup.parser.ParseErrorList)v6));
    Object v8 = ((org.jsoup.parser.Tokeniser)v7).getState();
    Object v9 = ((java.lang.Enum)v8).getDeclaringClass();
    ((org.jsoup.parser.Tokeniser)v3).error(((org.jsoup.parser.TokeniserState)v8));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = "noscript";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1),((org.jsoup.parser.ParseErrorList)v2));
    Object v4 = new char[]{Character.valueOf((char)1)};
    ((org.jsoup.parser.Tokeniser)v3).emit(((char[])v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = "noscript";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1),((org.jsoup.parser.ParseErrorList)v2));
    Object v4 = new char[]{Character.valueOf((char)1),Character.valueOf((char)1),Character.valueOf((char)0)};
    ((org.jsoup.parser.Tokeniser)v3).emit(((char[])v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = "noscript";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1),((org.jsoup.parser.ParseErrorList)v2));
    Object v4 = "textarea";
    ((org.jsoup.parser.Tokeniser)v3).emit(((java.lang.String)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = "noscript";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1),((org.jsoup.parser.ParseErrorList)v2));
    Object v4 = "t";
    ((org.jsoup.parser.Tokeniser)v3).emit(((java.lang.String)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = "noscript";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1),((org.jsoup.parser.ParseErrorList)v2));
    Object v4 = "h";
    ((org.jsoup.parser.Tokeniser)v3).emit(((java.lang.String)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = "noscript";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1),((org.jsoup.parser.ParseErrorList)v2));
    Object v4 = "noscript";
    Object v5 = new org.jsoup.parser.CharacterReader(((java.lang.String)v4));
    Object v6 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v7 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v5),((org.jsoup.parser.ParseErrorList)v6));
    Object v8 = ((org.jsoup.parser.Tokeniser)v7).getState();
    ((org.jsoup.parser.Tokeniser)v3).advanceTransition(((org.jsoup.parser.TokeniserState)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = "noscript";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1),((org.jsoup.parser.ParseErrorList)v2));
    Object v4 = ":contain+";
    ((org.jsoup.parser.Tokeniser)v3).emit(((java.lang.String)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = "noscript";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1),((org.jsoup.parser.ParseErrorList)v2));
    Object v4 = "E";
    ((org.jsoup.parser.Tokeniser)v3).error(((java.lang.String)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = "noscript";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1),((org.jsoup.parser.ParseErrorList)v2));
    Object v4 = "html";
    ((org.jsoup.parser.Tokeniser)v3).error(((java.lang.String)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = "noscript";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v3 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v1),((org.jsoup.parser.ParseErrorList)v2));
    Object v4 = "blockquote";
    ((org.jsoup.parser.Tokeniser)v3).emit(((java.lang.String)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }
}
