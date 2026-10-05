package org.jsoup.parser;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = org.jsoup.parser.TokeniserState.ScriptDataEscapedLessthanSign;
    Object v1 = "cQol";
    Object v2 = new org.jsoup.parser.CharacterReader(((java.lang.String)v1));
    Object v3 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v4 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v2),((org.jsoup.parser.ParseErrorList)v3));
    Object v5 = "cQol";
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
    Object v2 = "cQol";
    Object v3 = new org.jsoup.parser.CharacterReader(((java.lang.String)v2));
    Object v4 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v5 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v3),((org.jsoup.parser.ParseErrorList)v4));
    Object v6 = "cQol";
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
    Object v1 = "cQol";
    Object v2 = new org.jsoup.parser.CharacterReader(((java.lang.String)v1));
    Object v3 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v4 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v2),((org.jsoup.parser.ParseErrorList)v3));
    Object v5 = "cQol";
    Object v6 = new org.jsoup.parser.CharacterReader(((java.lang.String)v5));
    Object v7 = ((org.jsoup.parser.CharacterReader)v6).toString();
    ((org.jsoup.parser.TokeniserState)v0).read(((org.jsoup.parser.Tokeniser)v4),((org.jsoup.parser.CharacterReader)v6));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = org.jsoup.parser.TokeniserState.ScriptDataEscapedDash;
    Object v1 = "cQol";
    Object v2 = new org.jsoup.parser.CharacterReader(((java.lang.String)v1));
    Object v3 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v4 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v2),((org.jsoup.parser.ParseErrorList)v3));
    Object v5 = "cQol";
    Object v6 = new org.jsoup.parser.CharacterReader(((java.lang.String)v5));
    ((org.jsoup.parser.TokeniserState)v0).read(((org.jsoup.parser.Tokeniser)v4),((org.jsoup.parser.CharacterReader)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = org.jsoup.parser.TokeniserState.BeforeDoctypePublicIdentifier;
    Object v1 = "cQol";
    Object v2 = new org.jsoup.parser.CharacterReader(((java.lang.String)v1));
    Object v3 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v4 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v2),((org.jsoup.parser.ParseErrorList)v3));
    Object v5 = "cQol";
    Object v6 = new org.jsoup.parser.CharacterReader(((java.lang.String)v5));
    ((org.jsoup.parser.TokeniserState)v0).read(((org.jsoup.parser.Tokeniser)v4),((org.jsoup.parser.CharacterReader)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = "heighT";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = org.jsoup.parser.TokeniserState.BeforeDoctypeSystemIdentifier;
    Object v1 = "cQol";
    Object v2 = new org.jsoup.parser.CharacterReader(((java.lang.String)v1));
    Object v3 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v4 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v2),((org.jsoup.parser.ParseErrorList)v3));
    Object v5 = "cQol";
    Object v6 = new org.jsoup.parser.CharacterReader(((java.lang.String)v5));
    ((org.jsoup.parser.TokeniserState)v0).read(((org.jsoup.parser.Tokeniser)v4),((org.jsoup.parser.CharacterReader)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = org.jsoup.parser.TokeniserState.ScriptDataDoubleEscapedDash;
    Object v1 = "ScriptDataDoubleEscapedDash";
    Object v2 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v1));
    Object v3 = ((java.lang.Enum)v0).compareTo(((java.lang.Enum)v2));
    Object v4 = "cQol";
    Object v5 = new org.jsoup.parser.CharacterReader(((java.lang.String)v4));
    Object v6 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v7 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v5),((org.jsoup.parser.ParseErrorList)v6));
    Object v8 = "cQol";
    Object v9 = new org.jsoup.parser.CharacterReader(((java.lang.String)v8));
    ((org.jsoup.parser.TokeniserState)v0).read(((org.jsoup.parser.Tokeniser)v7),((org.jsoup.parser.CharacterReader)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = "ScriptDataDoubleEscapedDash";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
    Object v2 = "cQol";
    Object v3 = new org.jsoup.parser.CharacterReader(((java.lang.String)v2));
    Object v4 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v5 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v3),((org.jsoup.parser.ParseErrorList)v4));
    Object v6 = "cQol";
    Object v7 = new org.jsoup.parser.CharacterReader(((java.lang.String)v6));
    ((org.jsoup.parser.TokeniserState)v1).read(((org.jsoup.parser.Tokeniser)v5),((org.jsoup.parser.CharacterReader)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = "ScriptDataDoubleEscapedDash";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = "ScriptDataDoubleEscapedDash";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
    Object v2 = "ScriptDataDoubleEscapedDash";
    Object v3 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v2));
    Object v4 = "ScriptDataDoubleEscapedDash";
    Object v5 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v4));
    Object v6 = ((java.lang.Enum)v3).compareTo(((java.lang.Enum)v5));
    Object v7 = ((java.lang.Enum)v1).compareTo(((java.lang.Enum)v3));
    org.junit.Assert.assertEquals((Object)(0), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = "ScriptDataDoubleEscapedDash";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).name();
    org.junit.Assert.assertEquals((Object)("ScriptDataDoubleEscapedDash"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = "ScriptDataDoubleEscapedDash";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
    Object v2 = org.jsoup.parser.TokeniserState.values();
    Object v3 = ((java.lang.Enum)v1).equals(((java.lang.Object)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = "ScriptDataDoubleEscapedDash";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
    Object v2 = "ScriptDataDoubleEscapedDash";
    Object v3 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v2));
    Object v4 = ((java.lang.Enum)v1).equals(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = "html";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = "span";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = "r";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = "ScriptDataDoubleEscapedDash";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
    Object v2 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v3 = ((java.lang.Enum)v1).equals(((java.lang.Object)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = "ScriptDataDoubleEscapedDash";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = "[";
    Object v4 = java.lang.Enum.valueOf(((java.lang.Class)v2),((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = "ScriptDataDoubleEscapedDash";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).ordinal();
    org.junit.Assert.assertEquals((Object)(29), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = "ScriptDataDoubleEscapedDash";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = "";
    Object v4 = java.lang.Enum.valueOf(((java.lang.Class)v2),((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = "ScriptDataDoubleEscapedDash";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
    Object v2 = "ScriptDataDoubleEscapedDash";
    Object v3 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v2));
    Object v4 = ((java.lang.Enum)v1).compareTo(((java.lang.Enum)v3));
    org.junit.Assert.assertEquals((Object)(0), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = "col";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = "ScriptDataDoubleEscapedDash";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
    Object v2 = "ScriptDataDoubleEscapedDash";
    Object v3 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v2));
    Object v4 = ((java.lang.Enum)v1).compareTo(((java.lang.Enum)v3));
    Object v5 = "cQol";
    Object v6 = new org.jsoup.parser.CharacterReader(((java.lang.String)v5));
    Object v7 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v8 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v6),((org.jsoup.parser.ParseErrorList)v7));
    Object v9 = "cQol";
    Object v10 = new org.jsoup.parser.CharacterReader(((java.lang.String)v9));
    ((org.jsoup.parser.TokeniserState)v1).read(((org.jsoup.parser.Tokeniser)v8),((org.jsoup.parser.CharacterReader)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = "ScriptDataDoubleEscapedDash";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = "Request must be executed (with .execute(), .get(), or .post() before parsing response";
    Object v4 = java.lang.Enum.valueOf(((java.lang.Class)v2),((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = "h";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = "ScriptDataDoubleEscapedDash";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = "bodyq";
    Object v4 = java.lang.Enum.valueOf(((java.lang.Class)v2),((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = "ScriptDataDoubleEscapedDash";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = "cQol";
    Object v4 = new org.jsoup.parser.CharacterReader(((java.lang.String)v3));
    Object v5 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v6 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v4),((org.jsoup.parser.ParseErrorList)v5));
    Object v7 = "cQol";
    Object v8 = new org.jsoup.parser.CharacterReader(((java.lang.String)v7));
    Object v9 = ((org.jsoup.parser.CharacterReader)v8).toString();
    ((org.jsoup.parser.TokeniserState)v1).read(((org.jsoup.parser.Tokeniser)v6),((org.jsoup.parser.CharacterReader)v8));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = "ScriptDataDoubleEscapedDash";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
    Object v2 = "ScriptDataDoubleEscapedDash";
    Object v3 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v2));
    Object v4 = "ScriptDataDoubleEscapedDash";
    Object v5 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v4));
    Object v6 = ((java.lang.Enum)v3).compareTo(((java.lang.Enum)v5));
    Object v7 = ((java.lang.Enum)v1).equals(((java.lang.Object)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = "ScriptDataDoubleEscapedDash";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = "body";
    Object v4 = ((java.lang.Class)v2).getResource(((java.lang.String)v3));
    Object v5 = "noframes";
    Object v6 = java.lang.Enum.valueOf(((java.lang.Class)v2),((java.lang.String)v5));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = "Self closing flag not Qacknowledged";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = "ScriptDataDoubleEscapedDash";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
    Object v2 = "ScriptDataDoubleEscapedDash";
    Object v3 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v2));
    Object v4 = ((java.lang.Enum)v1).compareTo(((java.lang.Enum)v3));
    Object v5 = "ScriptDataDoubleEscapedDash";
    Object v6 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v5));
    Object v7 = ((java.lang.Enum)v1).compareTo(((java.lang.Enum)v6));
    org.junit.Assert.assertEquals((Object)(0), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = "ScriptDataDoubleEscapedDash";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).toString();
    org.junit.Assert.assertEquals((Object)("ScriptDataDoubleEscapedDash"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = "t";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = "ScriptDataDoubleEscapedDash";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).hashCode();
    Object v3 = "ScriptDataDoubleEscapedDash";
    Object v4 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v3));
    Object v5 = ((java.lang.Enum)v1).compareTo(((java.lang.Enum)v4));
    org.junit.Assert.assertEquals((Object)(0), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = "ScriptDataDoubleEscapedDash";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = "thead";
    Object v4 = java.lang.Enum.valueOf(((java.lang.Class)v2),((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = "ScriptDataDoubleEscapedDash";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
    Object v2 = "ScriptDataDoubleEscapedDash";
    Object v3 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v2));
    Object v4 = ((java.lang.Enum)v3).hashCode();
    Object v5 = ((java.lang.Enum)v1).compareTo(((java.lang.Enum)v3));
    org.junit.Assert.assertEquals((Object)(0), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = "ScriptDataDoubleEscapedDash";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
    Object v2 = "ScriptDataDoubleEscapedDash";
    Object v3 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v2));
    Object v4 = ((java.lang.Enum)v1).compareTo(((java.lang.Enum)v3));
    Object v5 = ((java.lang.Enum)v1).getDeclaringClass();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = " ";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = "ScriptDataDoubleEscapedDash";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = "ScriptDataDoubleEscapedDash";
    Object v4 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v3));
    Object v5 = ((java.lang.Enum)v1).compareTo(((java.lang.Enum)v4));
    org.junit.Assert.assertEquals((Object)(0), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = "ScriptDataDoubleEscapedDash";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).hashCode();
    org.junit.Assert.assertEquals((Object)(1537103415), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = "tr";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = "ScriptDataDoubleEscapedDash";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
    Object v2 = "ScriptDataDoubleEscapedDash";
    Object v3 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v2));
    Object v4 = ((java.lang.Enum)v1).compareTo(((java.lang.Enum)v3));
    Object v5 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v6 = "tbod]";
    Object v7 = java.lang.Enum.valueOf(((java.lang.Class)v5),((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = "ScriptDataDoubleEscapedDash";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = ((java.lang.Enum)v1).name();
    org.junit.Assert.assertEquals((Object)("ScriptDataDoubleEscapedDash"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = "bgsond";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = "textarea";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = "ScriptDataDoubleEscapedDash";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).hashCode();
    Object v3 = "ScriptDataDoubleEscapedDash";
    Object v4 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v3));
    Object v5 = "ScriptDataDoubleEscapedDash";
    Object v6 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v5));
    Object v7 = "ScriptDataDoubleEscapedDash";
    Object v8 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v7));
    Object v9 = ((java.lang.Enum)v6).compareTo(((java.lang.Enum)v8));
    Object v10 = ((java.lang.Enum)v4).compareTo(((java.lang.Enum)v6));
    Object v11 = ((java.lang.Enum)v1).equals(((java.lang.Object)v10));
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = "ScriptDataDoubleEscapedDash";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
    Object v2 = "ScriptDataDoubleEscapedDash";
    Object v3 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v2));
    Object v4 = ((java.lang.Enum)v1).compareTo(((java.lang.Enum)v3));
    Object v5 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v6 = "script";
    Object v7 = java.lang.Enum.valueOf(((java.lang.Class)v5),((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = "ScriptDataDoubleEscapedDash";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
    Object v2 = "ScriptDataDoubleEscapedDash";
    Object v3 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v2));
    Object v4 = org.jsoup.parser.TokeniserState.values();
    Object v5 = ((java.lang.Enum)v3).equals(((java.lang.Object)v4));
    Object v6 = ((java.lang.Enum)v1).equals(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = "ScriptDataDoubleEscapedDash";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).hashCode();
    Object v3 = ((java.lang.Enum)v1).toString();
    org.junit.Assert.assertEquals((Object)("ScriptDataDoubleEscapedDash"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = "ScriptDataDoubleEscapedDash";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
    Object v2 = "ScriptDataDoubleEscapedDash";
    Object v3 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v2));
    Object v4 = "ScriptDataDoubleEscapedDash";
    Object v5 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v4));
    Object v6 = ((java.lang.Enum)v5).hashCode();
    Object v7 = ((java.lang.Enum)v3).compareTo(((java.lang.Enum)v5));
    Object v8 = ((java.lang.Enum)v1).equals(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = "ScriptDataDoubleEscapedDash";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
    Object v2 = "ScriptDataDoubleEscapedDash";
    Object v3 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v2));
    Object v4 = ((java.lang.Enum)v3).getDeclaringClass();
    Object v5 = ((java.lang.Enum)v1).compareTo(((java.lang.Enum)v3));
    org.junit.Assert.assertEquals((Object)(0), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = "ScriptDataDoubleEscapedDash";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = "type";
    Object v4 = java.lang.Enum.valueOf(((java.lang.Class)v2),((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = "h4C";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = "ScriptDataDoubleEscapedDash";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).hashCode();
    Object v3 = ((java.lang.Enum)v1).getDeclaringClass();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = "ScriptDataDoubleEscapedDash";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
    Object v2 = "ScriptDataDoubleEscapedDash";
    Object v3 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v2));
    Object v4 = "ScriptDataDoubleEscapedDash";
    Object v5 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v4));
    Object v6 = "ScriptDataDoubleEscapedDash";
    Object v7 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v6));
    Object v8 = ((java.lang.Enum)v7).hashCode();
    Object v9 = ((java.lang.Enum)v5).compareTo(((java.lang.Enum)v7));
    Object v10 = ((java.lang.Enum)v3).equals(((java.lang.Object)v9));
    Object v11 = ((java.lang.Enum)v1).equals(((java.lang.Object)v10));
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = "ScriptDataDoubleEscapedDash";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
    Object v2 = "ScriptDataDoubleEscapedDash";
    Object v3 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v2));
    Object v4 = ((java.lang.Enum)v1).compareTo(((java.lang.Enum)v3));
    Object v5 = ((java.lang.Enum)v1).name();
    org.junit.Assert.assertEquals((Object)("ScriptDataDoubleEscapedDash"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = "ScriptDataDoubleEscapedDash";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).hashCode();
    Object v3 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v4 = "tr";
    Object v5 = java.lang.Enum.valueOf(((java.lang.Class)v3),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = "ScriptDataDoubleEscapedDash";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
    Object v2 = "cQol";
    Object v3 = new org.jsoup.parser.CharacterReader(((java.lang.String)v2));
    Object v4 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v5 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v3),((org.jsoup.parser.ParseErrorList)v4));
    Object v6 = "cQol";
    Object v7 = new org.jsoup.parser.CharacterReader(((java.lang.String)v6));
    Object v8 = ((org.jsoup.parser.CharacterReader)v7).toString();
    ((org.jsoup.parser.TokeniserState)v1).read(((org.jsoup.parser.Tokeniser)v5),((org.jsoup.parser.CharacterReader)v7));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = "hml";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = "ScriptDataDoubleEscapedDash";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
    Object v2 = "ScriptDataDoubleEscapedDash";
    Object v3 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v2));
    Object v4 = ((java.lang.Enum)v1).compareTo(((java.lang.Enum)v3));
    Object v5 = "ScriptDataDoubleEscapedDash";
    Object v6 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v5));
    Object v7 = "ScriptDataDoubleEscapedDash";
    Object v8 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v7));
    Object v9 = ((java.lang.Enum)v6).compareTo(((java.lang.Enum)v8));
    Object v10 = "ScriptDataDoubleEscapedDash";
    Object v11 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v10));
    Object v12 = ((java.lang.Enum)v6).compareTo(((java.lang.Enum)v11));
    Object v13 = ((java.lang.Enum)v1).equals(((java.lang.Object)v12));
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = "ScriptDataDoubleEscapedDash";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).hashCode();
    Object v3 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v4 = "em";
    Object v5 = java.lang.Enum.valueOf(((java.lang.Class)v3),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = "ScriptDataDoubleEscapedDash";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
    Object v2 = "ScriptDataDoubleEscapedDash";
    Object v3 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v2));
    Object v4 = ((java.lang.Enum)v3).getDeclaringClass();
    Object v5 = ((java.lang.Enum)v3).name();
    Object v6 = ((java.lang.Enum)v1).equals(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = "ScriptDataDoubleEscapedDash";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).hashCode();
    Object v3 = ((java.lang.Enum)v1).ordinal();
    org.junit.Assert.assertEquals((Object)(29), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = "ScriptDataDoubleEscapedDash";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
    Object v2 = "ScriptDataDoubleEscapedDash";
    Object v3 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v2));
    Object v4 = ((java.lang.Enum)v1).compareTo(((java.lang.Enum)v3));
    Object v5 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v6 = "html";
    Object v7 = java.lang.Enum.valueOf(((java.lang.Class)v5),((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = "ScriptDataDoubleEscapedDash";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = "script";
    Object v4 = java.lang.Enum.valueOf(((java.lang.Class)v2),((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = "co";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = "ca";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = "ScriptDataDoubleEscapedDash";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
    Object v2 = "ScriptDataDoubleEscapedDash";
    Object v3 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v2));
    Object v4 = ((java.lang.Enum)v1).compareTo(((java.lang.Enum)v3));
    Object v5 = "ScriptDataDoubleEscapedDash";
    Object v6 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v5));
    Object v7 = ((java.lang.Enum)v6).hashCode();
    Object v8 = ((java.lang.Enum)v1).compareTo(((java.lang.Enum)v6));
    org.junit.Assert.assertEquals((Object)(0), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = "ScriptDataDoubleEscapedDash";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
    Object v2 = "ScriptDataDoubleEscapedDash";
    Object v3 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v2));
    Object v4 = ((java.lang.Enum)v1).compareTo(((java.lang.Enum)v3));
    Object v5 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v6 = "strike";
    Object v7 = java.lang.Enum.valueOf(((java.lang.Class)v5),((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = "ScriptDataDoubleEscapedDash";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = ((java.lang.Enum)v1).getDeclaringClass();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = "ScriptDataDoubleEscapedDash";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
    Object v2 = "cQol";
    Object v3 = new org.jsoup.parser.CharacterReader(((java.lang.String)v2));
    Object v4 = ((java.lang.Enum)v1).equals(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = "ScriptDataDoubleEscapedDash";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
    Object v2 = "cQol";
    Object v3 = new org.jsoup.parser.CharacterReader(((java.lang.String)v2));
    Object v4 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v5 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v3),((org.jsoup.parser.ParseErrorList)v4));
    Object v6 = ((java.lang.Enum)v1).equals(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = "BefoeDoctypeName";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = "ScriptDataDoubleEscapedDash";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).hashCode();
    Object v3 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v4 = "aption";
    Object v5 = java.lang.Enum.valueOf(((java.lang.Class)v3),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = "ScriptDataDoubleEscapedDash";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v4 = "b";
    Object v5 = java.lang.Enum.valueOf(((java.lang.Class)v3),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = "tbody";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = "ScriptDataDoubleEscapedDash";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).hashCode();
    Object v3 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v4 = "hAtml";
    Object v5 = java.lang.Enum.valueOf(((java.lang.Class)v3),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = "'ol";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = "tfoot";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = "ScriptDataDoubleEscapedDash";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = "form";
    Object v4 = java.lang.Enum.valueOf(((java.lang.Class)v2),((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = "ScriptDataDoubleEscapedDash";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).hashCode();
    Object v3 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v4 = ((java.lang.Class)v3).getAnnotatedSuperclass();
    Object v5 = "body";
    Object v6 = java.lang.Enum.valueOf(((java.lang.Class)v3),((java.lang.String)v5));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = "ScriptDataDoubleEscapedDash";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v4 = "htfl";
    Object v5 = java.lang.Enum.valueOf(((java.lang.Class)v3),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = "tml";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = "ScriptDataDoubleEscapedDash";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).hashCode();
    Object v3 = "cQol";
    Object v4 = new org.jsoup.parser.CharacterReader(((java.lang.String)v3));
    Object v5 = org.jsoup.parser.ParseErrorList.noTracking();
    Object v6 = new org.jsoup.parser.Tokeniser(((org.jsoup.parser.CharacterReader)v4),((org.jsoup.parser.ParseErrorList)v5));
    Object v7 = "cQol";
    Object v8 = new org.jsoup.parser.CharacterReader(((java.lang.String)v7));
    ((org.jsoup.parser.TokeniserState)v1).read(((org.jsoup.parser.Tokeniser)v6),((org.jsoup.parser.CharacterReader)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = "ScriptDataDoubleEscapedDash";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
    Object v2 = "ScriptDataDoubleEscapedDash";
    Object v3 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v2));
    Object v4 = ((java.lang.Enum)v1).compareTo(((java.lang.Enum)v3));
    Object v5 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v6 = ((java.lang.Class)v5).getGenericInterfaces();
    Object v7 = "tr";
    Object v8 = java.lang.Enum.valueOf(((java.lang.Class)v5),((java.lang.String)v7));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = "htm";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = "ScriptDataDoubleEscapedDash";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
    Object v2 = "ScriptDataDoubleEscapedDash";
    Object v3 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v2));
    Object v4 = "ScriptDataDoubleEscapedDash";
    Object v5 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v4));
    Object v6 = ((java.lang.Enum)v3).compareTo(((java.lang.Enum)v5));
    Object v7 = "ScriptDataDoubleEscapedDash";
    Object v8 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v7));
    Object v9 = ((java.lang.Enum)v3).compareTo(((java.lang.Enum)v8));
    Object v10 = ((java.lang.Enum)v1).equals(((java.lang.Object)v9));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = "ScriptDataDoubleEscapedDash";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
    Object v2 = "ScriptDataDoubleEscapedDash";
    Object v3 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v2));
    Object v4 = ((java.lang.Enum)v1).compareTo(((java.lang.Enum)v3));
    Object v5 = "ScriptDataDoubleEscapedDash";
    Object v6 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v5));
    Object v7 = "ScriptDataDoubleEscapedDash";
    Object v8 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v7));
    Object v9 = ((java.lang.Enum)v6).compareTo(((java.lang.Enum)v8));
    Object v10 = ((java.lang.Enum)v1).compareTo(((java.lang.Enum)v6));
    org.junit.Assert.assertEquals((Object)(0), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = "ScriptDataDoubleEscapedDash";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v4 = "tfoot";
    Object v5 = java.lang.Enum.valueOf(((java.lang.Class)v3),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = "ScriptDataDoubleEscapedDash";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).hashCode();
    Object v3 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v4 = "ftp";
    Object v5 = java.lang.Enum.valueOf(((java.lang.Class)v3),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = "em";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = "ScriptDataDoubleEscapedDash";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
    Object v2 = "ScriptDataDoubleEscapedDash";
    Object v3 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v2));
    Object v4 = ((java.lang.Enum)v3).hashCode();
    Object v5 = ((java.lang.Enum)v3).ordinal();
    Object v6 = ((java.lang.Enum)v1).equals(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = "ScriptDataDoubleEscapedDash";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
    Object v2 = "ScriptDataDoubleEscapedDash";
    Object v3 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v2));
    Object v4 = "ScriptDataDoubleEscapedDash";
    Object v5 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v4));
    Object v6 = ((java.lang.Enum)v3).compareTo(((java.lang.Enum)v5));
    Object v7 = ((java.lang.Enum)v3).getDeclaringClass();
    Object v8 = ((java.lang.Enum)v1).equals(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = "ScriptDataDoubleEscapedDash";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v4 = "tr";
    Object v5 = java.lang.Enum.valueOf(((java.lang.Class)v3),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = "ScriptDataDoubleEscapedDash";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
    Object v2 = "ScriptDataDoubleEscapedDash";
    Object v3 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v2));
    Object v4 = "ScriptDataDoubleEscapedDash";
    Object v5 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v4));
    Object v6 = ((java.lang.Enum)v5).getDeclaringClass();
    Object v7 = ((java.lang.Enum)v3).compareTo(((java.lang.Enum)v5));
    Object v8 = ((java.lang.Enum)v1).equals(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = "ScriptDataDoubleEscapedDash";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
    Object v2 = "ScriptDataDoubleEscapedDash";
    Object v3 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v2));
    Object v4 = ((java.lang.Enum)v3).getDeclaringClass();
    Object v5 = ((java.lang.Enum)v1).equals(((java.lang.Object)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = "CdataSection";
    Object v1 = org.jsoup.parser.TokeniserState.valueOf(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(org.jsoup.parser.TokeniserState.CdataSection), v1);
  }
}
