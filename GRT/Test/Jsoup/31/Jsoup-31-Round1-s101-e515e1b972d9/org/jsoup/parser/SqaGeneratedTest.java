package org.jsoup.parser;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = "dd";
    Object v1 = new org.jsoup.parser.Token.Character(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Token)v1).isEndTag();
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = "dd";
    Object v1 = new org.jsoup.parser.Token.Character(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Token)v1).isEOF();
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = "dd";
    Object v1 = new org.jsoup.parser.Token.Character(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Token)v1).isComment();
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = "dd";
    Object v1 = new org.jsoup.parser.Token.Character(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Token)v1).isDoctype();
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = "dd";
    Object v1 = new org.jsoup.parser.Token.Character(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Token)v1).asComment();
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = "dd";
    Object v1 = new org.jsoup.parser.Token.Character(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Token)v1).asStartTag();
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = "dd";
    Object v1 = new org.jsoup.parser.Token.Character(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Token)v1).isStartTag();
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = "dd";
    Object v1 = new org.jsoup.parser.Token.Character(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Token)v1).isCharacter();
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = "dd";
    Object v1 = new org.jsoup.parser.Token.Character(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Token)v1).asDoctype();
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = "dd";
    Object v1 = new org.jsoup.parser.Token.Character(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Token)v1).asEndTag();
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = "dd";
    Object v1 = new org.jsoup.parser.Token.Character(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Token)v1).asCharacter();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = "dd";
    Object v1 = new org.jsoup.parser.Token.Character(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Token)v1).asCharacter();
    Object v3 = ((org.jsoup.parser.Token)v2).isDoctype();
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = "dd";
    Object v1 = new org.jsoup.parser.Token.Character(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Token)v1).asCharacter();
    Object v3 = ((org.jsoup.parser.Token)v2).isStartTag();
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = "dd";
    Object v1 = new org.jsoup.parser.Token.Character(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Token)v1).asCharacter();
    Object v3 = ((org.jsoup.parser.Token)v2).asCharacter();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = "dd";
    Object v1 = new org.jsoup.parser.Token.Character(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Token)v1).asCharacter();
    Object v3 = ((org.jsoup.parser.Token)v2).isCharacter();
    org.junit.Assert.assertEquals((Object)(true), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = "dd";
    Object v1 = new org.jsoup.parser.Token.Character(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Token)v1).asCharacter();
    Object v3 = ((org.jsoup.parser.Token)v2).isComment();
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = "dd";
    Object v1 = new org.jsoup.parser.Token.Character(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Token)v1).asCharacter();
    Object v3 = ((org.jsoup.parser.Token)v2).tokenType();
    org.junit.Assert.assertEquals((Object)("Character"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = "dd";
    Object v1 = new org.jsoup.parser.Token.Character(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Token)v1).asCharacter();
    Object v3 = ((org.jsoup.parser.Token)v2).isEOF();
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = "dd";
    Object v1 = new org.jsoup.parser.Token.Character(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Token)v1).asCharacter();
    Object v3 = ((org.jsoup.parser.Token)v2).asCharacter();
    Object v4 = ((org.jsoup.parser.Token)v3).isEndTag();
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = "dd";
    Object v1 = new org.jsoup.parser.Token.Character(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Token)v1).asCharacter();
    Object v3 = ((org.jsoup.parser.Token)v2).asCharacter();
    Object v4 = ((org.jsoup.parser.Token)v3).asEndTag();
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = "dd";
    Object v1 = new org.jsoup.parser.Token.Character(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Token)v1).asCharacter();
    Object v3 = ((org.jsoup.parser.Token)v2).asCharacter();
    Object v4 = ((org.jsoup.parser.Token)v3).isComment();
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = "dd";
    Object v1 = new org.jsoup.parser.Token.Character(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Token)v1).asCharacter();
    Object v3 = ((org.jsoup.parser.Token)v2).isEndTag();
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = "dd";
    Object v1 = new org.jsoup.parser.Token.Character(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Token)v1).asCharacter();
    Object v3 = ((org.jsoup.parser.Token)v2).asStartTag();
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = "dd";
    Object v1 = new org.jsoup.parser.Token.Character(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Token)v1).asCharacter();
    Object v3 = ((org.jsoup.parser.Token)v2).asCharacter();
    Object v4 = ((org.jsoup.parser.Token)v3).isDoctype();
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = "dd";
    Object v1 = new org.jsoup.parser.Token.Character(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Token)v1).asCharacter();
    Object v3 = ((org.jsoup.parser.Token)v2).asComment();
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = "dd";
    Object v1 = new org.jsoup.parser.Token.Character(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Token)v1).asCharacter();
    Object v3 = ((org.jsoup.parser.Token)v2).asCharacter();
    Object v4 = ((org.jsoup.parser.Token)v3).asStartTag();
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = "dd";
    Object v1 = new org.jsoup.parser.Token.Character(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Token)v1).asCharacter();
    Object v3 = ((org.jsoup.parser.Token)v2).asEndTag();
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = "dd";
    Object v1 = new org.jsoup.parser.Token.Character(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Token)v1).asCharacter();
    Object v3 = ((org.jsoup.parser.Token)v2).asCharacter();
    Object v4 = ((org.jsoup.parser.Token)v3).isCharacter();
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = "dd";
    Object v1 = new org.jsoup.parser.Token.Character(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Token)v1).asCharacter();
    Object v3 = ((org.jsoup.parser.Token)v2).asCharacter();
    Object v4 = ((org.jsoup.parser.Token)v3).asDoctype();
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = "dd";
    Object v1 = new org.jsoup.parser.Token.Character(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Token)v1).asCharacter();
    Object v3 = ((org.jsoup.parser.Token)v2).asCharacter();
    Object v4 = ((org.jsoup.parser.Token)v3).isEOF();
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = "dd";
    Object v1 = new org.jsoup.parser.Token.Character(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Token)v1).asCharacter();
    Object v3 = ((org.jsoup.parser.Token)v2).asCharacter();
    Object v4 = ((org.jsoup.parser.Token)v3).isStartTag();
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = "dd";
    Object v1 = new org.jsoup.parser.Token.Character(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Token)v1).asCharacter();
    Object v3 = ((org.jsoup.parser.Token)v2).asCharacter();
    Object v4 = ((org.jsoup.parser.Token)v3).asCharacter();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = "dd";
    Object v1 = new org.jsoup.parser.Token.Character(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Token)v1).asCharacter();
    Object v3 = ((org.jsoup.parser.Token)v2).asCharacter();
    Object v4 = ((org.jsoup.parser.Token)v3).asCharacter();
    Object v5 = ((org.jsoup.parser.Token)v4).isEOF();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = "dd";
    Object v1 = new org.jsoup.parser.Token.Character(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Token)v1).asCharacter();
    Object v3 = ((org.jsoup.parser.Token)v2).asCharacter();
    Object v4 = ((org.jsoup.parser.Token)v3).asCharacter();
    Object v5 = ((org.jsoup.parser.Token)v4).isCharacter();
    org.junit.Assert.assertEquals((Object)(true), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = "dd";
    Object v1 = new org.jsoup.parser.Token.Character(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Token)v1).asCharacter();
    Object v3 = ((org.jsoup.parser.Token)v2).asCharacter();
    Object v4 = ((org.jsoup.parser.Token)v3).asCharacter();
    Object v5 = ((org.jsoup.parser.Token)v4).isStartTag();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = "dd";
    Object v1 = new org.jsoup.parser.Token.Character(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Token)v1).asCharacter();
    Object v3 = ((org.jsoup.parser.Token)v2).asCharacter();
    Object v4 = ((org.jsoup.parser.Token)v3).asCharacter();
    Object v5 = ((org.jsoup.parser.Token)v4).isEndTag();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = "dd";
    Object v1 = new org.jsoup.parser.Token.Character(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Token)v1).asCharacter();
    Object v3 = ((org.jsoup.parser.Token)v2).asCharacter();
    Object v4 = ((org.jsoup.parser.Token)v3).asCharacter();
    Object v5 = ((org.jsoup.parser.Token)v4).isDoctype();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = "dd";
    Object v1 = new org.jsoup.parser.Token.Character(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Token)v1).asCharacter();
    Object v3 = ((org.jsoup.parser.Token)v2).asCharacter();
    Object v4 = ((org.jsoup.parser.Token)v3).asCharacter();
    Object v5 = ((org.jsoup.parser.Token)v4).isComment();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = "dd";
    Object v1 = new org.jsoup.parser.Token.Character(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Token)v1).asCharacter();
    Object v3 = ((org.jsoup.parser.Token)v2).asCharacter();
    Object v4 = ((org.jsoup.parser.Token)v3).asCharacter();
    Object v5 = ((org.jsoup.parser.Token)v4).asDoctype();
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = "dd";
    Object v1 = new org.jsoup.parser.Token.Character(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Token)v1).asCharacter();
    Object v3 = ((org.jsoup.parser.Token)v2).asCharacter();
    Object v4 = ((org.jsoup.parser.Token)v3).asCharacter();
    Object v5 = ((org.jsoup.parser.Token)v4).asComment();
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = "dd";
    Object v1 = new org.jsoup.parser.Token.Character(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Token)v1).asCharacter();
    Object v3 = ((org.jsoup.parser.Token)v2).asCharacter();
    Object v4 = ((org.jsoup.parser.Token)v3).asCharacter();
    Object v5 = ((org.jsoup.parser.Token)v4).asStartTag();
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = "dd";
    Object v1 = new org.jsoup.parser.Token.Character(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Token)v1).asCharacter();
    Object v3 = ((org.jsoup.parser.Token)v2).asCharacter();
    Object v4 = ((org.jsoup.parser.Token)v3).asCharacter();
    Object v5 = ((org.jsoup.parser.Token)v4).asCharacter();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = "dd";
    Object v1 = new org.jsoup.parser.Token.Character(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Token)v1).asCharacter();
    Object v3 = ((org.jsoup.parser.Token)v2).asCharacter();
    Object v4 = ((org.jsoup.parser.Token)v3).asCharacter();
    Object v5 = ((org.jsoup.parser.Token)v4).asCharacter();
    Object v6 = ((org.jsoup.parser.Token)v5).asDoctype();
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = "dd";
    Object v1 = new org.jsoup.parser.Token.Character(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Token)v1).asCharacter();
    Object v3 = ((org.jsoup.parser.Token)v2).asCharacter();
    Object v4 = ((org.jsoup.parser.Token)v3).asCharacter();
    Object v5 = ((org.jsoup.parser.Token)v4).asCharacter();
    Object v6 = ((org.jsoup.parser.Token)v5).isEOF();
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = "dd";
    Object v1 = new org.jsoup.parser.Token.Character(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Token)v1).asCharacter();
    Object v3 = ((org.jsoup.parser.Token)v2).asCharacter();
    Object v4 = ((org.jsoup.parser.Token)v3).asCharacter();
    Object v5 = ((org.jsoup.parser.Token)v4).asCharacter();
    Object v6 = ((org.jsoup.parser.Token)v5).isCharacter();
    org.junit.Assert.assertEquals((Object)(true), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = "dd";
    Object v1 = new org.jsoup.parser.Token.Character(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Token)v1).asCharacter();
    Object v3 = ((org.jsoup.parser.Token)v2).asCharacter();
    Object v4 = ((org.jsoup.parser.Token)v3).asCharacter();
    Object v5 = ((org.jsoup.parser.Token)v4).asCharacter();
    Object v6 = ((org.jsoup.parser.Token)v5).isComment();
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = "dd";
    Object v1 = new org.jsoup.parser.Token.Character(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Token)v1).asCharacter();
    Object v3 = ((org.jsoup.parser.Token)v2).asCharacter();
    Object v4 = ((org.jsoup.parser.Token)v3).asCharacter();
    Object v5 = ((org.jsoup.parser.Token)v4).asCharacter();
    Object v6 = ((org.jsoup.parser.Token)v5).isStartTag();
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = "dd";
    Object v1 = new org.jsoup.parser.Token.Character(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Token)v1).asCharacter();
    Object v3 = ((org.jsoup.parser.Token)v2).asCharacter();
    Object v4 = ((org.jsoup.parser.Token)v3).asCharacter();
    Object v5 = ((org.jsoup.parser.Token)v4).asEndTag();
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = "dd";
    Object v1 = new org.jsoup.parser.Token.Character(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Token)v1).asCharacter();
    Object v3 = ((org.jsoup.parser.Token)v2).asCharacter();
    Object v4 = ((org.jsoup.parser.Token)v3).asCharacter();
    Object v5 = ((org.jsoup.parser.Token)v4).asCharacter();
    Object v6 = ((org.jsoup.parser.Token)v5).isDoctype();
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = "dd";
    Object v1 = new org.jsoup.parser.Token.Character(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Token)v1).asCharacter();
    Object v3 = ((org.jsoup.parser.Token)v2).asCharacter();
    Object v4 = ((org.jsoup.parser.Token)v3).asCharacter();
    Object v5 = ((org.jsoup.parser.Token)v4).asCharacter();
    Object v6 = ((org.jsoup.parser.Token)v5).isEndTag();
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = "dd";
    Object v1 = new org.jsoup.parser.Token.Character(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Token)v1).asCharacter();
    Object v3 = ((org.jsoup.parser.Token)v2).asCharacter();
    Object v4 = ((org.jsoup.parser.Token)v3).asCharacter();
    Object v5 = ((org.jsoup.parser.Token)v4).asCharacter();
    Object v6 = ((org.jsoup.parser.Token)v5).asStartTag();
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = "dd";
    Object v1 = new org.jsoup.parser.Token.Character(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Token)v1).asCharacter();
    Object v3 = ((org.jsoup.parser.Token)v2).asCharacter();
    Object v4 = ((org.jsoup.parser.Token)v3).asCharacter();
    Object v5 = ((org.jsoup.parser.Token)v4).asCharacter();
    Object v6 = ((org.jsoup.parser.Token)v5).asCharacter();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = "dd";
    Object v1 = new org.jsoup.parser.Token.Character(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Token)v1).asCharacter();
    Object v3 = ((org.jsoup.parser.Token)v2).asCharacter();
    Object v4 = ((org.jsoup.parser.Token)v3).asCharacter();
    Object v5 = ((org.jsoup.parser.Token)v4).asCharacter();
    Object v6 = ((org.jsoup.parser.Token)v5).asCharacter();
    Object v7 = ((org.jsoup.parser.Token)v6).isDoctype();
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = "dd";
    Object v1 = new org.jsoup.parser.Token.Character(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Token)v1).asCharacter();
    Object v3 = ((org.jsoup.parser.Token)v2).asCharacter();
    Object v4 = ((org.jsoup.parser.Token)v3).asCharacter();
    Object v5 = ((org.jsoup.parser.Token)v4).asCharacter();
    Object v6 = ((org.jsoup.parser.Token)v5).asCharacter();
    Object v7 = ((org.jsoup.parser.Token)v6).isEndTag();
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = "dd";
    Object v1 = new org.jsoup.parser.Token.Character(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Token)v1).asCharacter();
    Object v3 = ((org.jsoup.parser.Token)v2).asCharacter();
    Object v4 = ((org.jsoup.parser.Token)v3).asCharacter();
    Object v5 = ((org.jsoup.parser.Token)v4).asCharacter();
    Object v6 = ((org.jsoup.parser.Token)v5).asCharacter();
    Object v7 = ((org.jsoup.parser.Token)v6).asDoctype();
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = "dd";
    Object v1 = new org.jsoup.parser.Token.Character(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Token)v1).asCharacter();
    Object v3 = ((org.jsoup.parser.Token)v2).asCharacter();
    Object v4 = ((org.jsoup.parser.Token)v3).asCharacter();
    Object v5 = ((org.jsoup.parser.Token)v4).asCharacter();
    Object v6 = ((org.jsoup.parser.Token)v5).asCharacter();
    Object v7 = ((org.jsoup.parser.Token)v6).isEOF();
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = "dd";
    Object v1 = new org.jsoup.parser.Token.Character(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Token)v1).asCharacter();
    Object v3 = ((org.jsoup.parser.Token)v2).asCharacter();
    Object v4 = ((org.jsoup.parser.Token)v3).asCharacter();
    Object v5 = ((org.jsoup.parser.Token)v4).asCharacter();
    Object v6 = ((org.jsoup.parser.Token)v5).asCharacter();
    Object v7 = ((org.jsoup.parser.Token)v6).isCharacter();
    org.junit.Assert.assertEquals((Object)(true), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = "dd";
    Object v1 = new org.jsoup.parser.Token.Character(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Token)v1).asCharacter();
    Object v3 = ((org.jsoup.parser.Token)v2).asCharacter();
    Object v4 = ((org.jsoup.parser.Token)v3).asCharacter();
    Object v5 = ((org.jsoup.parser.Token)v4).asCharacter();
    Object v6 = ((org.jsoup.parser.Token)v5).asCharacter();
    Object v7 = ((org.jsoup.parser.Token)v6).isComment();
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = "dd";
    Object v1 = new org.jsoup.parser.Token.Character(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Token)v1).asCharacter();
    Object v3 = ((org.jsoup.parser.Token)v2).asCharacter();
    Object v4 = ((org.jsoup.parser.Token)v3).tokenType();
    org.junit.Assert.assertEquals((Object)("Character"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = "dd";
    Object v1 = new org.jsoup.parser.Token.Character(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Token)v1).asCharacter();
    Object v3 = ((org.jsoup.parser.Token)v2).asCharacter();
    Object v4 = ((org.jsoup.parser.Token)v3).asCharacter();
    Object v5 = ((org.jsoup.parser.Token)v4).tokenType();
    org.junit.Assert.assertEquals((Object)("Character"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = "dd";
    Object v1 = new org.jsoup.parser.Token.Character(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Token)v1).asCharacter();
    Object v3 = ((org.jsoup.parser.Token)v2).asCharacter();
    Object v4 = ((org.jsoup.parser.Token)v3).asCharacter();
    Object v5 = ((org.jsoup.parser.Token)v4).asCharacter();
    Object v6 = ((org.jsoup.parser.Token)v5).asCharacter();
    Object v7 = ((org.jsoup.parser.Token)v6).isStartTag();
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = "dd";
    Object v1 = new org.jsoup.parser.Token.Character(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Token)v1).asCharacter();
    Object v3 = ((org.jsoup.parser.Token)v2).asCharacter();
    Object v4 = ((org.jsoup.parser.Token)v3).asCharacter();
    Object v5 = ((org.jsoup.parser.Token)v4).asCharacter();
    Object v6 = ((org.jsoup.parser.Token)v5).asCharacter();
    Object v7 = ((org.jsoup.parser.Token)v6).asComment();
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = "dd";
    Object v1 = new org.jsoup.parser.Token.Character(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Token)v1).asCharacter();
    Object v3 = ((org.jsoup.parser.Token)v2).asCharacter();
    Object v4 = ((org.jsoup.parser.Token)v3).asCharacter();
    Object v5 = ((org.jsoup.parser.Token)v4).asCharacter();
    Object v6 = ((org.jsoup.parser.Token)v5).tokenType();
    org.junit.Assert.assertEquals((Object)("Character"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = "dd";
    Object v1 = new org.jsoup.parser.Token.Character(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Token)v1).asCharacter();
    Object v3 = ((org.jsoup.parser.Token)v2).asCharacter();
    Object v4 = ((org.jsoup.parser.Token)v3).asCharacter();
    Object v5 = ((org.jsoup.parser.Token)v4).asCharacter();
    Object v6 = ((org.jsoup.parser.Token)v5).asComment();
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = "dd";
    Object v1 = new org.jsoup.parser.Token.Character(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Token)v1).asCharacter();
    Object v3 = ((org.jsoup.parser.Token)v2).asCharacter();
    Object v4 = ((org.jsoup.parser.Token)v3).asCharacter();
    Object v5 = ((org.jsoup.parser.Token)v4).asCharacter();
    Object v6 = ((org.jsoup.parser.Token)v5).asCharacter();
    Object v7 = ((org.jsoup.parser.Token)v6).asStartTag();
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = "dd";
    Object v1 = new org.jsoup.parser.Token.Character(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Token)v1).asCharacter();
    Object v3 = ((org.jsoup.parser.Token)v2).asCharacter();
    Object v4 = ((org.jsoup.parser.Token)v3).asCharacter();
    Object v5 = ((org.jsoup.parser.Token)v4).asCharacter();
    Object v6 = ((org.jsoup.parser.Token)v5).asCharacter();
    Object v7 = ((org.jsoup.parser.Token)v6).asCharacter();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = "dd";
    Object v1 = new org.jsoup.parser.Token.Character(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Token)v1).asCharacter();
    Object v3 = ((org.jsoup.parser.Token)v2).asCharacter();
    Object v4 = ((org.jsoup.parser.Token)v3).asCharacter();
    Object v5 = ((org.jsoup.parser.Token)v4).asCharacter();
    Object v6 = ((org.jsoup.parser.Token)v5).asCharacter();
    Object v7 = ((org.jsoup.parser.Token)v6).asCharacter();
    Object v8 = ((org.jsoup.parser.Token)v7).tokenType();
    org.junit.Assert.assertEquals((Object)("Character"), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = "dd";
    Object v1 = new org.jsoup.parser.Token.Character(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Token)v1).asCharacter();
    Object v3 = ((org.jsoup.parser.Token)v2).asCharacter();
    Object v4 = ((org.jsoup.parser.Token)v3).asCharacter();
    Object v5 = ((org.jsoup.parser.Token)v4).asCharacter();
    Object v6 = ((org.jsoup.parser.Token)v5).asCharacter();
    Object v7 = ((org.jsoup.parser.Token)v6).asCharacter();
    Object v8 = ((org.jsoup.parser.Token)v7).asDoctype();
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = "dd";
    Object v1 = new org.jsoup.parser.Token.Character(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Token)v1).asCharacter();
    Object v3 = ((org.jsoup.parser.Token)v2).asCharacter();
    Object v4 = ((org.jsoup.parser.Token)v3).asCharacter();
    Object v5 = ((org.jsoup.parser.Token)v4).asCharacter();
    Object v6 = ((org.jsoup.parser.Token)v5).asCharacter();
    Object v7 = ((org.jsoup.parser.Token)v6).asCharacter();
    Object v8 = ((org.jsoup.parser.Token)v7).isCharacter();
    org.junit.Assert.assertEquals((Object)(true), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = "dd";
    Object v1 = new org.jsoup.parser.Token.Character(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Token)v1).asCharacter();
    Object v3 = ((org.jsoup.parser.Token)v2).asCharacter();
    Object v4 = ((org.jsoup.parser.Token)v3).asCharacter();
    Object v5 = ((org.jsoup.parser.Token)v4).asCharacter();
    Object v6 = ((org.jsoup.parser.Token)v5).asCharacter();
    Object v7 = ((org.jsoup.parser.Token)v6).tokenType();
    org.junit.Assert.assertEquals((Object)("Character"), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = "dd";
    Object v1 = new org.jsoup.parser.Token.Character(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Token)v1).asCharacter();
    Object v3 = ((org.jsoup.parser.Token)v2).asCharacter();
    Object v4 = ((org.jsoup.parser.Token)v3).asCharacter();
    Object v5 = ((org.jsoup.parser.Token)v4).asCharacter();
    Object v6 = ((org.jsoup.parser.Token)v5).asCharacter();
    Object v7 = ((org.jsoup.parser.Token)v6).asCharacter();
    Object v8 = ((org.jsoup.parser.Token)v7).isDoctype();
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = "dd";
    Object v1 = new org.jsoup.parser.Token.Character(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Token)v1).asCharacter();
    Object v3 = ((org.jsoup.parser.Token)v2).asCharacter();
    Object v4 = ((org.jsoup.parser.Token)v3).asCharacter();
    Object v5 = ((org.jsoup.parser.Token)v4).asCharacter();
    Object v6 = ((org.jsoup.parser.Token)v5).asCharacter();
    Object v7 = ((org.jsoup.parser.Token)v6).asCharacter();
    Object v8 = ((org.jsoup.parser.Token)v7).isComment();
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = "dd";
    Object v1 = new org.jsoup.parser.Token.Character(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Token)v1).asCharacter();
    Object v3 = ((org.jsoup.parser.Token)v2).asCharacter();
    Object v4 = ((org.jsoup.parser.Token)v3).asCharacter();
    Object v5 = ((org.jsoup.parser.Token)v4).asCharacter();
    Object v6 = ((org.jsoup.parser.Token)v5).asCharacter();
    Object v7 = ((org.jsoup.parser.Token)v6).asCharacter();
    Object v8 = ((org.jsoup.parser.Token)v7).isEOF();
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = "dd";
    Object v1 = new org.jsoup.parser.Token.Character(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Token)v1).asCharacter();
    Object v3 = ((org.jsoup.parser.Token)v2).asCharacter();
    Object v4 = ((org.jsoup.parser.Token)v3).asCharacter();
    Object v5 = ((org.jsoup.parser.Token)v4).asCharacter();
    Object v6 = ((org.jsoup.parser.Token)v5).asCharacter();
    Object v7 = ((org.jsoup.parser.Token)v6).asCharacter();
    Object v8 = ((org.jsoup.parser.Token)v7).isEndTag();
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = "dd";
    Object v1 = new org.jsoup.parser.Token.Character(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Token)v1).asCharacter();
    Object v3 = ((org.jsoup.parser.Token)v2).asCharacter();
    Object v4 = ((org.jsoup.parser.Token)v3).asCharacter();
    Object v5 = ((org.jsoup.parser.Token)v4).asCharacter();
    Object v6 = ((org.jsoup.parser.Token)v5).asEndTag();
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = "dd";
    Object v1 = new org.jsoup.parser.Token.Character(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Token)v1).asCharacter();
    Object v3 = ((org.jsoup.parser.Token)v2).asCharacter();
    Object v4 = ((org.jsoup.parser.Token)v3).asCharacter();
    Object v5 = ((org.jsoup.parser.Token)v4).asCharacter();
    Object v6 = ((org.jsoup.parser.Token)v5).asCharacter();
    Object v7 = ((org.jsoup.parser.Token)v6).asCharacter();
    Object v8 = ((org.jsoup.parser.Token)v7).isStartTag();
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = "dd";
    Object v1 = new org.jsoup.parser.Token.Character(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Token)v1).asCharacter();
    Object v3 = ((org.jsoup.parser.Token)v2).asCharacter();
    Object v4 = ((org.jsoup.parser.Token)v3).asCharacter();
    Object v5 = ((org.jsoup.parser.Token)v4).asCharacter();
    Object v6 = ((org.jsoup.parser.Token)v5).asCharacter();
    Object v7 = ((org.jsoup.parser.Token)v6).asEndTag();
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = "dd";
    Object v1 = new org.jsoup.parser.Token.Character(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Token)v1).asCharacter();
    Object v3 = ((org.jsoup.parser.Token)v2).asCharacter();
    Object v4 = ((org.jsoup.parser.Token)v3).asCharacter();
    Object v5 = ((org.jsoup.parser.Token)v4).asCharacter();
    Object v6 = ((org.jsoup.parser.Token)v5).asCharacter();
    Object v7 = ((org.jsoup.parser.Token)v6).asCharacter();
    Object v8 = ((org.jsoup.parser.Token)v7).asCharacter();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = "dd";
    Object v1 = new org.jsoup.parser.Token.Character(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Token)v1).asCharacter();
    Object v3 = ((org.jsoup.parser.Token)v2).asCharacter();
    Object v4 = ((org.jsoup.parser.Token)v3).asCharacter();
    Object v5 = ((org.jsoup.parser.Token)v4).asCharacter();
    Object v6 = ((org.jsoup.parser.Token)v5).asCharacter();
    Object v7 = ((org.jsoup.parser.Token)v6).asCharacter();
    Object v8 = ((org.jsoup.parser.Token)v7).asCharacter();
    Object v9 = ((org.jsoup.parser.Token)v8).isStartTag();
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = "dd";
    Object v1 = new org.jsoup.parser.Token.Character(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Token)v1).asCharacter();
    Object v3 = ((org.jsoup.parser.Token)v2).asCharacter();
    Object v4 = ((org.jsoup.parser.Token)v3).asCharacter();
    Object v5 = ((org.jsoup.parser.Token)v4).asCharacter();
    Object v6 = ((org.jsoup.parser.Token)v5).asCharacter();
    Object v7 = ((org.jsoup.parser.Token)v6).asCharacter();
    Object v8 = ((org.jsoup.parser.Token)v7).asCharacter();
    Object v9 = ((org.jsoup.parser.Token)v8).isComment();
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = "dd";
    Object v1 = new org.jsoup.parser.Token.Character(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Token)v1).asCharacter();
    Object v3 = ((org.jsoup.parser.Token)v2).asCharacter();
    Object v4 = ((org.jsoup.parser.Token)v3).asCharacter();
    Object v5 = ((org.jsoup.parser.Token)v4).asCharacter();
    Object v6 = ((org.jsoup.parser.Token)v5).asCharacter();
    Object v7 = ((org.jsoup.parser.Token)v6).asCharacter();
    Object v8 = ((org.jsoup.parser.Token)v7).asCharacter();
    Object v9 = ((org.jsoup.parser.Token)v8).isCharacter();
    org.junit.Assert.assertEquals((Object)(true), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = "dd";
    Object v1 = new org.jsoup.parser.Token.Character(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Token)v1).asCharacter();
    Object v3 = ((org.jsoup.parser.Token)v2).asCharacter();
    Object v4 = ((org.jsoup.parser.Token)v3).asCharacter();
    Object v5 = ((org.jsoup.parser.Token)v4).asCharacter();
    Object v6 = ((org.jsoup.parser.Token)v5).asCharacter();
    Object v7 = ((org.jsoup.parser.Token)v6).asCharacter();
    Object v8 = ((org.jsoup.parser.Token)v7).asCharacter();
    Object v9 = ((org.jsoup.parser.Token)v8).isEOF();
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = "dd";
    Object v1 = new org.jsoup.parser.Token.Character(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Token)v1).asCharacter();
    Object v3 = ((org.jsoup.parser.Token)v2).asCharacter();
    Object v4 = ((org.jsoup.parser.Token)v3).asCharacter();
    Object v5 = ((org.jsoup.parser.Token)v4).asCharacter();
    Object v6 = ((org.jsoup.parser.Token)v5).asCharacter();
    Object v7 = ((org.jsoup.parser.Token)v6).asCharacter();
    Object v8 = ((org.jsoup.parser.Token)v7).asCharacter();
    Object v9 = ((org.jsoup.parser.Token)v8).tokenType();
    org.junit.Assert.assertEquals((Object)("Character"), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = "dd";
    Object v1 = new org.jsoup.parser.Token.Character(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Token)v1).asCharacter();
    Object v3 = ((org.jsoup.parser.Token)v2).asCharacter();
    Object v4 = ((org.jsoup.parser.Token)v3).asCharacter();
    Object v5 = ((org.jsoup.parser.Token)v4).asCharacter();
    Object v6 = ((org.jsoup.parser.Token)v5).asCharacter();
    Object v7 = ((org.jsoup.parser.Token)v6).asCharacter();
    Object v8 = ((org.jsoup.parser.Token)v7).asCharacter();
    Object v9 = ((org.jsoup.parser.Token)v8).isDoctype();
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = "dd";
    Object v1 = new org.jsoup.parser.Token.Character(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Token)v1).asCharacter();
    Object v3 = ((org.jsoup.parser.Token)v2).asCharacter();
    Object v4 = ((org.jsoup.parser.Token)v3).asCharacter();
    Object v5 = ((org.jsoup.parser.Token)v4).asCharacter();
    Object v6 = ((org.jsoup.parser.Token)v5).asCharacter();
    Object v7 = ((org.jsoup.parser.Token)v6).asCharacter();
    Object v8 = ((org.jsoup.parser.Token)v7).asCharacter();
    Object v9 = ((org.jsoup.parser.Token)v8).isEndTag();
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = "dd";
    Object v1 = new org.jsoup.parser.Token.Character(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Token)v1).asCharacter();
    Object v3 = ((org.jsoup.parser.Token)v2).asCharacter();
    Object v4 = ((org.jsoup.parser.Token)v3).asCharacter();
    Object v5 = ((org.jsoup.parser.Token)v4).asCharacter();
    Object v6 = ((org.jsoup.parser.Token)v5).asCharacter();
    Object v7 = ((org.jsoup.parser.Token)v6).asCharacter();
    Object v8 = ((org.jsoup.parser.Token)v7).asCharacter();
    Object v9 = ((org.jsoup.parser.Token)v8).asCharacter();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = "dd";
    Object v1 = new org.jsoup.parser.Token.Character(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Token)v1).asCharacter();
    Object v3 = ((org.jsoup.parser.Token)v2).asCharacter();
    Object v4 = ((org.jsoup.parser.Token)v3).asCharacter();
    Object v5 = ((org.jsoup.parser.Token)v4).asCharacter();
    Object v6 = ((org.jsoup.parser.Token)v5).asCharacter();
    Object v7 = ((org.jsoup.parser.Token)v6).asCharacter();
    Object v8 = ((org.jsoup.parser.Token)v7).asCharacter();
    Object v9 = ((org.jsoup.parser.Token)v8).asCharacter();
    Object v10 = ((org.jsoup.parser.Token)v9).isComment();
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = "dd";
    Object v1 = new org.jsoup.parser.Token.Character(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Token)v1).asCharacter();
    Object v3 = ((org.jsoup.parser.Token)v2).asCharacter();
    Object v4 = ((org.jsoup.parser.Token)v3).asCharacter();
    Object v5 = ((org.jsoup.parser.Token)v4).asCharacter();
    Object v6 = ((org.jsoup.parser.Token)v5).asCharacter();
    Object v7 = ((org.jsoup.parser.Token)v6).asCharacter();
    Object v8 = ((org.jsoup.parser.Token)v7).asCharacter();
    Object v9 = ((org.jsoup.parser.Token)v8).asCharacter();
    Object v10 = ((org.jsoup.parser.Token)v9).isDoctype();
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = "dd";
    Object v1 = new org.jsoup.parser.Token.Character(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Token)v1).asCharacter();
    Object v3 = ((org.jsoup.parser.Token)v2).asCharacter();
    Object v4 = ((org.jsoup.parser.Token)v3).asCharacter();
    Object v5 = ((org.jsoup.parser.Token)v4).asCharacter();
    Object v6 = ((org.jsoup.parser.Token)v5).asCharacter();
    Object v7 = ((org.jsoup.parser.Token)v6).asCharacter();
    Object v8 = ((org.jsoup.parser.Token)v7).asCharacter();
    Object v9 = ((org.jsoup.parser.Token)v8).asCharacter();
    Object v10 = ((org.jsoup.parser.Token)v9).isEOF();
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = "dd";
    Object v1 = new org.jsoup.parser.Token.Character(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Token)v1).asCharacter();
    Object v3 = ((org.jsoup.parser.Token)v2).asCharacter();
    Object v4 = ((org.jsoup.parser.Token)v3).asCharacter();
    Object v5 = ((org.jsoup.parser.Token)v4).asCharacter();
    Object v6 = ((org.jsoup.parser.Token)v5).asCharacter();
    Object v7 = ((org.jsoup.parser.Token)v6).asCharacter();
    Object v8 = ((org.jsoup.parser.Token)v7).asCharacter();
    Object v9 = ((org.jsoup.parser.Token)v8).asCharacter();
    Object v10 = ((org.jsoup.parser.Token)v9).isEndTag();
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = "dd";
    Object v1 = new org.jsoup.parser.Token.Character(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Token)v1).asCharacter();
    Object v3 = ((org.jsoup.parser.Token)v2).asCharacter();
    Object v4 = ((org.jsoup.parser.Token)v3).asCharacter();
    Object v5 = ((org.jsoup.parser.Token)v4).asCharacter();
    Object v6 = ((org.jsoup.parser.Token)v5).asCharacter();
    Object v7 = ((org.jsoup.parser.Token)v6).asCharacter();
    Object v8 = ((org.jsoup.parser.Token)v7).asEndTag();
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = "dd";
    Object v1 = new org.jsoup.parser.Token.Character(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Token)v1).asCharacter();
    Object v3 = ((org.jsoup.parser.Token)v2).asCharacter();
    Object v4 = ((org.jsoup.parser.Token)v3).asCharacter();
    Object v5 = ((org.jsoup.parser.Token)v4).asCharacter();
    Object v6 = ((org.jsoup.parser.Token)v5).asCharacter();
    Object v7 = ((org.jsoup.parser.Token)v6).asCharacter();
    Object v8 = ((org.jsoup.parser.Token)v7).asCharacter();
    Object v9 = ((org.jsoup.parser.Token)v8).asCharacter();
    Object v10 = ((org.jsoup.parser.Token)v9).tokenType();
    org.junit.Assert.assertEquals((Object)("Character"), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = "dd";
    Object v1 = new org.jsoup.parser.Token.Character(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Token)v1).asCharacter();
    Object v3 = ((org.jsoup.parser.Token)v2).asCharacter();
    Object v4 = ((org.jsoup.parser.Token)v3).asCharacter();
    Object v5 = ((org.jsoup.parser.Token)v4).asCharacter();
    Object v6 = ((org.jsoup.parser.Token)v5).asCharacter();
    Object v7 = ((org.jsoup.parser.Token)v6).asCharacter();
    Object v8 = ((org.jsoup.parser.Token)v7).asCharacter();
    Object v9 = ((org.jsoup.parser.Token)v8).asDoctype();
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = "dd";
    Object v1 = new org.jsoup.parser.Token.Character(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Token)v1).asCharacter();
    Object v3 = ((org.jsoup.parser.Token)v2).asCharacter();
    Object v4 = ((org.jsoup.parser.Token)v3).asCharacter();
    Object v5 = ((org.jsoup.parser.Token)v4).asCharacter();
    Object v6 = ((org.jsoup.parser.Token)v5).asCharacter();
    Object v7 = ((org.jsoup.parser.Token)v6).asCharacter();
    Object v8 = ((org.jsoup.parser.Token)v7).asCharacter();
    Object v9 = ((org.jsoup.parser.Token)v8).asComment();
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = "dd";
    Object v1 = new org.jsoup.parser.Token.Character(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Token)v1).asCharacter();
    Object v3 = ((org.jsoup.parser.Token)v2).asCharacter();
    Object v4 = ((org.jsoup.parser.Token)v3).asCharacter();
    Object v5 = ((org.jsoup.parser.Token)v4).asCharacter();
    Object v6 = ((org.jsoup.parser.Token)v5).asCharacter();
    Object v7 = ((org.jsoup.parser.Token)v6).asCharacter();
    Object v8 = ((org.jsoup.parser.Token)v7).asCharacter();
    Object v9 = ((org.jsoup.parser.Token)v8).asStartTag();
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = "dd";
    Object v1 = new org.jsoup.parser.Token.Character(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Token)v1).asCharacter();
    Object v3 = ((org.jsoup.parser.Token)v2).asCharacter();
    Object v4 = ((org.jsoup.parser.Token)v3).asCharacter();
    Object v5 = ((org.jsoup.parser.Token)v4).asCharacter();
    Object v6 = ((org.jsoup.parser.Token)v5).asCharacter();
    Object v7 = ((org.jsoup.parser.Token)v6).asCharacter();
    Object v8 = ((org.jsoup.parser.Token)v7).asCharacter();
    Object v9 = ((org.jsoup.parser.Token)v8).asCharacter();
    Object v10 = ((org.jsoup.parser.Token)v9).isStartTag();
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = "dd";
    Object v1 = new org.jsoup.parser.Token.Character(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Token)v1).asCharacter();
    Object v3 = ((org.jsoup.parser.Token)v2).asCharacter();
    Object v4 = ((org.jsoup.parser.Token)v3).asCharacter();
    Object v5 = ((org.jsoup.parser.Token)v4).asCharacter();
    Object v6 = ((org.jsoup.parser.Token)v5).asCharacter();
    Object v7 = ((org.jsoup.parser.Token)v6).asCharacter();
    Object v8 = ((org.jsoup.parser.Token)v7).asCharacter();
    Object v9 = ((org.jsoup.parser.Token)v8).asEndTag();
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = "dd";
    Object v1 = new org.jsoup.parser.Token.Character(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Token)v1).asCharacter();
    Object v3 = ((org.jsoup.parser.Token)v2).asCharacter();
    Object v4 = ((org.jsoup.parser.Token)v3).asCharacter();
    Object v5 = ((org.jsoup.parser.Token)v4).asCharacter();
    Object v6 = ((org.jsoup.parser.Token)v5).asCharacter();
    Object v7 = ((org.jsoup.parser.Token)v6).asCharacter();
    Object v8 = ((org.jsoup.parser.Token)v7).asCharacter();
    Object v9 = ((org.jsoup.parser.Token)v8).asCharacter();
    Object v10 = ((org.jsoup.parser.Token)v9).asEndTag();
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = "dd";
    Object v1 = new org.jsoup.parser.Token.Character(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Token)v1).asCharacter();
    Object v3 = ((org.jsoup.parser.Token)v2).asCharacter();
    Object v4 = ((org.jsoup.parser.Token)v3).asCharacter();
    Object v5 = ((org.jsoup.parser.Token)v4).asCharacter();
    Object v6 = ((org.jsoup.parser.Token)v5).asCharacter();
    Object v7 = ((org.jsoup.parser.Token)v6).asCharacter();
    Object v8 = ((org.jsoup.parser.Token)v7).asCharacter();
    Object v9 = ((org.jsoup.parser.Token)v8).asCharacter();
    Object v10 = ((org.jsoup.parser.Token)v9).isCharacter();
    org.junit.Assert.assertEquals((Object)(true), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = "dd";
    Object v1 = new org.jsoup.parser.Token.Character(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Token)v1).asCharacter();
    Object v3 = ((org.jsoup.parser.Token)v2).asDoctype();
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }
}
