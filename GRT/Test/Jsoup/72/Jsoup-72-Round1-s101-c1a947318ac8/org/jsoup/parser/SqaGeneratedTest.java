package org.jsoup.parser;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = "script";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = new char[]{};
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).matchesAny(((char[])v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = "script";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = new char[]{Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).matchesAnySorted(((char[])v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = "script";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).consumeData();
    org.junit.Assert.assertEquals((Object)("script"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = "script";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).isEmpty();
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new char[]{};
    Object v1 = 1;
    Object v2 = 16;
    Object v3 = "?tr";
    Object v4 = org.jsoup.parser.CharacterReader.rangeEquals(((char[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = "script";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).consumeLetterSequence();
    org.junit.Assert.assertEquals((Object)("script"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = "script";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = "img";
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).matchesIgnoreCase(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = "script";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = new char[]{Character.valueOf((char)1)};
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).matchesAny(((char[])v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = "script";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).matchesLetter();
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = "script";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = Character.valueOf((char)1);
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).consumeTo((((java.lang.Character)v2).charValue()));
    org.junit.Assert.assertEquals((Object)("script"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new char[]{Character.valueOf((char)1)};
    Object v1 = 1;
    Object v2 = 29;
    Object v3 = "tyle";
    Object v4 = org.jsoup.parser.CharacterReader.rangeEquals(((char[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = "script";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = "colgrouOp";
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).consumeTo(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)("script"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = "script";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = new char[]{Character.valueOf((char)0),Character.valueOf((char)0)};
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).consumeToAny(((char[])v2));
    org.junit.Assert.assertEquals((Object)("script"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = "script";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = "tbody";
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).containsIgnoreCase(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = "script";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).current();
    Object v3 = ">";
    Object v4 = ((org.jsoup.parser.CharacterReader)v1).matches(((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = "script";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).consumeTagName();
    org.junit.Assert.assertEquals((Object)("script"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = "script";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).consume();
    org.junit.Assert.assertEquals((Object)(Character.valueOf((char)115)), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = "script";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = "img";
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).matchConsumeIgnoreCase(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = -21;
    Object v2 = new org.jsoup.parser.CharacterReader(((java.io.Reader)v0),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = "script";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = "";
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).matchConsume(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(true), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = "script";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).matchesDigit();
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = "script";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    ((org.jsoup.parser.CharacterReader)v1).advance();
    Object v2 = null;
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).consumeHexSequence();
    org.junit.Assert.assertEquals((Object)("c"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = "script";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = Character.valueOf((char)1);
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).matches((((java.lang.Character)v2).charValue()));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = "script";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).matches((((java.lang.Character)v2).charValue()));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = "script";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).current();
    Object v3 = "s";
    Object v4 = ((org.jsoup.parser.CharacterReader)v1).consumeTo(((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)(""), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = "script";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    ((org.jsoup.parser.CharacterReader)v1).advance();
    Object v2 = null;
    Object v3 = "tjhead";
    Object v4 = ((org.jsoup.parser.CharacterReader)v1).matchConsume(((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = new char[]{Character.valueOf((char)0),Character.valueOf((char)0)};
    Object v2 = java.nio.CharBuffer.wrap(((char[])v1));
    Object v3 = ((java.io.Reader)v0).read(((java.nio.CharBuffer)v2));
    Object v4 = -2;
    Object v5 = new org.jsoup.parser.CharacterReader(((java.io.Reader)v0),(((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = "script";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).consumeDigitSequence();
    org.junit.Assert.assertEquals((Object)(""), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = "script";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = "cite";
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).matchConsumeIgnoreCase(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = "script";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = "script";
    Object v3 = new org.jsoup.parser.CharacterReader(((java.lang.String)v2));
    Object v4 = ((org.jsoup.parser.CharacterReader)v3).consumeLetterSequence();
    Object v5 = ((org.jsoup.parser.CharacterReader)v1).nextIndexOf(((java.lang.CharSequence)v4));
    org.junit.Assert.assertEquals((Object)(0), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = "script";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = "PATCH7";
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).containsIgnoreCase(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = "script";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = new char[]{Character.valueOf((char)1)};
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).matchesAnySorted(((char[])v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = "script";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = "script";
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).matchConsume(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(true), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = "script";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).current();
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).matchesDigit();
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = "script";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = new char[]{Character.valueOf((char)0),Character.valueOf((char)1),Character.valueOf((char)0)};
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).consumeToAny(((char[])v2));
    ((org.jsoup.parser.CharacterReader)v1).mark();
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = "script";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = "table";
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).matchesIgnoreCase(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = "script";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).consumeLetterThenDigitSequence();
    org.junit.Assert.assertEquals((Object)("script"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new char[]{Character.valueOf((char)0),Character.valueOf((char)0),Character.valueOf((char)0)};
    Object v1 = -19;
    Object v2 = -29;
    Object v3 = "t5oot";
    Object v4 = org.jsoup.parser.CharacterReader.rangeEquals(((char[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = "script";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).current();
    org.junit.Assert.assertEquals((Object)(Character.valueOf((char)115)), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = "script";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = Character.valueOf((char)1);
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).consumeTo((((java.lang.Character)v2).charValue()));
    Object v4 = ((org.jsoup.parser.CharacterReader)v1).isEmpty();
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = "script";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).current();
    Object v3 = Character.valueOf((char)1);
    Object v4 = ((org.jsoup.parser.CharacterReader)v1).nextIndexOf((((java.lang.Character)v3).charValue()));
    org.junit.Assert.assertEquals((Object)(-1), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = "script";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = new char[]{Character.valueOf((char)0),Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).consumeToAny(((char[])v2));
    org.junit.Assert.assertEquals((Object)("script"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = 1;
    Object v2 = new org.jsoup.parser.CharacterReader(((java.io.Reader)v0),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = "script";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = new char[]{};
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).consumeToAnySorted(((char[])v2));
    org.junit.Assert.assertEquals((Object)("script"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = "script";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = Character.valueOf((char)1);
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).consumeTo((((java.lang.Character)v2).charValue()));
    Object v4 = new char[]{Character.valueOf((char)0),Character.valueOf((char)0),Character.valueOf((char)3)};
    Object v5 = ((org.jsoup.parser.CharacterReader)v1).consumeToAnySorted(((char[])v4));
    org.junit.Assert.assertEquals((Object)(""), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = "script";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = new char[]{Character.valueOf((char)0)};
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).matchesAny(((char[])v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = "script";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = new char[]{};
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).matchesAnySorted(((char[])v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = "script";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = "script";
    Object v3 = new org.jsoup.parser.CharacterReader(((java.lang.String)v2));
    Object v4 = "colgrouOp";
    Object v5 = ((org.jsoup.parser.CharacterReader)v3).consumeTo(((java.lang.String)v4));
    Object v6 = ((org.jsoup.parser.CharacterReader)v1).nextIndexOf(((java.lang.CharSequence)v5));
    org.junit.Assert.assertEquals((Object)(0), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = "script";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = 1;
    Object v3 = 1;
    Object v4 = "";
    Object v5 = ((org.jsoup.parser.CharacterReader)v1).rangeEquals((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = "script";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = new char[]{Character.valueOf((char)0)};
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).matchesAnySorted(((char[])v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = "script";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).pos();
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = "script";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = "script";
    Object v3 = new org.jsoup.parser.CharacterReader(((java.lang.String)v2));
    Object v4 = new char[]{};
    Object v5 = ((org.jsoup.parser.CharacterReader)v3).consumeToAnySorted(((char[])v4));
    Object v6 = ((org.jsoup.parser.CharacterReader)v1).nextIndexOf(((java.lang.CharSequence)v5));
    org.junit.Assert.assertEquals((Object)(0), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = "script";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    ((org.jsoup.parser.CharacterReader)v1).unconsume();
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = "script";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).toString();
    org.junit.Assert.assertEquals((Object)("script"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = 31;
    Object v2 = new org.jsoup.parser.CharacterReader(((java.io.Reader)v0),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new char[]{Character.valueOf((char)1),Character.valueOf((char)38),Character.valueOf((char)0)};
    Object v1 = 5;
    Object v2 = 1;
    Object v3 = "dt";
    Object v4 = org.jsoup.parser.CharacterReader.rangeEquals(((char[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = "script";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = Character.valueOf((char)1);
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).consumeTo((((java.lang.Character)v2).charValue()));
    Object v4 = ((org.jsoup.parser.CharacterReader)v1).consumeTagName();
    org.junit.Assert.assertEquals((Object)(""), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = "script";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = new char[]{Character.valueOf((char)1),Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).consumeToAnySorted(((char[])v2));
    org.junit.Assert.assertEquals((Object)("script"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = "script";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).nextIndexOf((((java.lang.Character)v2).charValue()));
    org.junit.Assert.assertEquals((Object)(-1), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = "script";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = new char[]{Character.valueOf((char)4)};
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).consumeToAny(((char[])v2));
    org.junit.Assert.assertEquals((Object)("script"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = "script";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = "!";
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).containsIgnoreCase(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = "script";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).toString();
    Object v3 = Character.valueOf((char)1);
    Object v4 = ((org.jsoup.parser.CharacterReader)v1).nextIndexOf((((java.lang.Character)v3).charValue()));
    org.junit.Assert.assertEquals((Object)(-1), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = "script";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = "Iyndex must be numeric";
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).matchConsumeIgnoreCase(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = "script";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).consumeHexSequence();
    org.junit.Assert.assertEquals((Object)(""), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new char[]{Character.valueOf((char)1)};
    Object v1 = -27;
    Object v2 = 0;
    Object v3 = ":first-chilK";
    Object v4 = org.jsoup.parser.CharacterReader.rangeEquals(((char[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = "script";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = new char[]{Character.valueOf((char)0),Character.valueOf((char)1),Character.valueOf((char)0)};
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).consumeToAny(((char[])v2));
    org.junit.Assert.assertEquals((Object)("script"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = "script";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).consumeTo((((java.lang.Character)v2).charValue()));
    Object v4 = "iframe";
    Object v5 = ((org.jsoup.parser.CharacterReader)v1).matchesIgnoreCase(((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = "script";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).current();
    Object v3 = new char[]{Character.valueOf((char)1)};
    Object v4 = ((org.jsoup.parser.CharacterReader)v1).consumeToAnySorted(((char[])v3));
    org.junit.Assert.assertEquals((Object)("script"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = "script";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = Character.valueOf((char)2);
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).matches((((java.lang.Character)v2).charValue()));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = "script";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).toString();
    Object v3 = "script";
    Object v4 = new org.jsoup.parser.CharacterReader(((java.lang.String)v3));
    Object v5 = new char[]{Character.valueOf((char)1),Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v6 = ((org.jsoup.parser.CharacterReader)v4).consumeToAnySorted(((char[])v5));
    Object v7 = ((java.lang.CharSequence)v6).length();
    Object v8 = ((org.jsoup.parser.CharacterReader)v1).nextIndexOf(((java.lang.CharSequence)v6));
    org.junit.Assert.assertEquals((Object)(0), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = "script";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = new char[]{Character.valueOf((char)1),Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).consumeToAny(((char[])v2));
    Object v4 = ((org.jsoup.parser.CharacterReader)v1).isEmpty();
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = "script";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = new char[]{};
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).consumeToAny(((char[])v2));
    Object v4 = ((org.jsoup.parser.CharacterReader)v1).consumeToEnd();
    org.junit.Assert.assertEquals((Object)(""), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = "script";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = "&a";
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).matches(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = "script";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    ((org.jsoup.parser.CharacterReader)v1).mark();
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = "script";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = new char[]{Character.valueOf((char)0),Character.valueOf((char)1),Character.valueOf((char)0)};
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).matchesAnySorted(((char[])v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = "script";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    ((org.jsoup.parser.CharacterReader)v1).advance();
    Object v2 = null;
    Object v3 = new char[]{Character.valueOf((char)1)};
    Object v4 = ((org.jsoup.parser.CharacterReader)v1).matchesAnySorted(((char[])v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = "script";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).consumeTo((((java.lang.Character)v2).charValue()));
    org.junit.Assert.assertEquals((Object)("script"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = "script";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = Character.valueOf((char)1);
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).consumeTo((((java.lang.Character)v2).charValue()));
    Object v4 = "kptgroup";
    Object v5 = ((org.jsoup.parser.CharacterReader)v1).matchConsumeIgnoreCase(((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = "script";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).current();
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).current();
    org.junit.Assert.assertEquals((Object)(Character.valueOf((char)115)), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = 0;
    Object v2 = new org.jsoup.parser.CharacterReader(((java.io.Reader)v0),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = "script";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = "a4side";
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).matchesIgnoreCase(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = "script";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).current();
    Object v3 = new char[]{Character.valueOf((char)0),Character.valueOf((char)1),Character.valueOf((char)0)};
    Object v4 = ((org.jsoup.parser.CharacterReader)v1).matchesAnySorted(((char[])v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = "script";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = "button";
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).matchesIgnoreCase(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = "script";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = "u";
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).matches(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = "script";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = "PUBLIC";
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).matchConsumeIgnoreCase(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = "script";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = "UTF-18";
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).containsIgnoreCase(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = "script";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = "i";
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).matches(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = "script";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = new char[]{Character.valueOf((char)1)};
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).consumeToAny(((char[])v2));
    Object v4 = ((org.jsoup.parser.CharacterReader)v1).consumeLetterSequence();
    org.junit.Assert.assertEquals((Object)(""), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = "script";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = new char[]{Character.valueOf((char)0),Character.valueOf((char)0)};
    Object v3 = java.nio.CharBuffer.wrap(((char[])v2));
    Object v4 = ((org.jsoup.parser.CharacterReader)v1).nextIndexOf(((java.lang.CharSequence)v3));
    org.junit.Assert.assertEquals((Object)(-1), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = "script";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    ((org.jsoup.parser.CharacterReader)v1).advance();
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = "script";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = new char[]{Character.valueOf((char)0),Character.valueOf((char)47),Character.valueOf((char)1)};
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).consumeToAnySorted(((char[])v2));
    org.junit.Assert.assertEquals((Object)("script"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = "script";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).consumeToEnd();
    org.junit.Assert.assertEquals((Object)("script"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = "script";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = new char[]{Character.valueOf((char)0),Character.valueOf((char)1),Character.valueOf((char)1)};
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).matchesAnySorted(((char[])v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = "script";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = new char[]{Character.valueOf((char)0)};
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).consumeToAny(((char[])v2));
    Object v4 = ((org.jsoup.parser.CharacterReader)v1).current();
    org.junit.Assert.assertEquals((Object)(Character.valueOf((char)65535)), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = "script";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = new char[]{Character.valueOf((char)0),Character.valueOf((char)1),Character.valueOf((char)6)};
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).matchesAny(((char[])v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = "script";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    ((org.jsoup.parser.CharacterReader)v1).advance();
    Object v2 = null;
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).consumeDigitSequence();
    org.junit.Assert.assertEquals((Object)(""), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = new org.jsoup.parser.CharacterReader(((java.io.Reader)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new char[]{Character.valueOf((char)2),Character.valueOf((char)1)};
    Object v1 = 1;
    Object v2 = -19;
    Object v3 = "html";
    Object v4 = org.jsoup.parser.CharacterReader.rangeEquals(((char[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = "script";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).toString();
    Object v3 = Character.valueOf((char)1);
    Object v4 = ((org.jsoup.parser.CharacterReader)v1).consumeTo((((java.lang.Character)v3).charValue()));
    org.junit.Assert.assertEquals((Object)("script"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = "script";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = "";
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).containsIgnoreCase(((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }
}
