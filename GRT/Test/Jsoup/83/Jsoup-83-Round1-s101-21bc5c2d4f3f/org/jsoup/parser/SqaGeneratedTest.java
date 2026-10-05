package org.jsoup.parser;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = "xmp";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = new char[]{};
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).matchesAny(((char[])v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = "xmp";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = new char[]{Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).matchesAnySorted(((char[])v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = "xmp";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).consumeData();
    org.junit.Assert.assertEquals((Object)("xmp"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = "xmp";
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
    Object v0 = "xmp";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).consumeLetterSequence();
    org.junit.Assert.assertEquals((Object)("xmp"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = "xmp";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = " ";
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).matchesIgnoreCase(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = "xmp";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = new char[]{Character.valueOf((char)1)};
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).matchesAny(((char[])v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = "xmp";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).matchesLetter();
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = "xmp";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = Character.valueOf((char)1);
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).consumeTo((((java.lang.Character)v2).charValue()));
    org.junit.Assert.assertEquals((Object)("xmp"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new char[]{Character.valueOf((char)1)};
    Object v1 = 1;
    Object v2 = 29;
    Object v3 = "oframes";
    Object v4 = org.jsoup.parser.CharacterReader.rangeEquals(((char[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = "xmp";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = "colgrouOp";
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).consumeTo(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)("xmp"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = "xmp";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = new char[]{Character.valueOf((char)0),Character.valueOf((char)0)};
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).consumeToAny(((char[])v2));
    org.junit.Assert.assertEquals((Object)("xmp"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = "xmp";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = "tbody";
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).containsIgnoreCase(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = "xmp";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).toString();
    Object v3 = "br";
    Object v4 = ((org.jsoup.parser.CharacterReader)v1).matches(((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = "xmp";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).pos();
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = "xmp";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = "";
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).matchesIgnoreCase(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(true), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = "xmp";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = " ";
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).matchConsume(((java.lang.String)v2));
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
    Object v0 = "xmp";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).consumeDigitSequence();
    org.junit.Assert.assertEquals((Object)(""), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = "xmp";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).matchesDigit();
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = "xmp";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = new char[]{};
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).consumeToAny(((char[])v2));
    org.junit.Assert.assertEquals((Object)("xmp"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = "caation";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = "xmp";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).consumeHexSequence();
    org.junit.Assert.assertEquals((Object)(""), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = -7;
    Object v2 = new org.jsoup.parser.CharacterReader(((java.io.Reader)v0),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = "xmp";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).consume();
    org.junit.Assert.assertEquals((Object)(Character.valueOf((char)120)), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = "xmp";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).toString();
    Object v3 = "figca6tion";
    Object v4 = ((org.jsoup.parser.CharacterReader)v1).consumeTo(((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)("xmp"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = "xmp";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).current();
    org.junit.Assert.assertEquals((Object)(Character.valueOf((char)120)), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = "xmp";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = new char[]{Character.valueOf((char)1),Character.valueOf((char)1)};
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).matchesAnySorted(((char[])v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = -64;
    Object v2 = new org.jsoup.parser.CharacterReader(((java.io.Reader)v0),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = 0;
    Object v2 = new org.jsoup.parser.CharacterReader(((java.io.Reader)v0),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = "xmp";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = "";
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).matchConsumeIgnoreCase(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(true), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = "xmp";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = new char[]{};
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).consumeToAnySorted(((char[])v2));
    org.junit.Assert.assertEquals((Object)("xmp"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = "xmp";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = Character.valueOf((char)1);
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).consumeTo((((java.lang.Character)v2).charValue()));
    Object v4 = "xmp";
    Object v5 = new org.jsoup.parser.CharacterReader(((java.lang.String)v4));
    Object v6 = ((org.jsoup.parser.CharacterReader)v5).consumeLetterSequence();
    Object v7 = ((org.jsoup.parser.CharacterReader)v1).nextIndexOf(((java.lang.CharSequence)v6));
    org.junit.Assert.assertEquals((Object)(-1), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = "xmp";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = "PATCH7";
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).containsIgnoreCase(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = "xmp";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = new char[]{Character.valueOf((char)1)};
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).matchesAnySorted(((char[])v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = "xmp";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = "script";
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).matchConsumeIgnoreCase(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = "xmp";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).toString();
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).matchesDigit();
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = "caation";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = Character.valueOf((char)1);
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).consumeTo((((java.lang.Character)v2).charValue()));
    Object v4 = "J";
    Object v5 = ((org.jsoup.parser.CharacterReader)v1).consumeTo(((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)(""), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = "xmp";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).consumeLetterThenDigitSequence();
    org.junit.Assert.assertEquals((Object)("xmp"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = "caation";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).consumeData();
    org.junit.Assert.assertEquals((Object)("caation"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = "xmp";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = "o";
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).matchesIgnoreCase(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = "xmp";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).consumeTagName();
    org.junit.Assert.assertEquals((Object)("xmp"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = "xmp";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).consumeTo((((java.lang.Character)v2).charValue()));
    org.junit.Assert.assertEquals((Object)("xmp"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new char[]{};
    Object v1 = 29;
    Object v2 = 0;
    Object v3 = "blockqu@ote";
    Object v4 = org.jsoup.parser.CharacterReader.rangeEquals(((char[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = "xmp";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = "htql";
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).matchConsumeIgnoreCase(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = "xmp";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).current();
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).matchesLetter();
    org.junit.Assert.assertEquals((Object)(true), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = "xmp";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).nextIndexOf((((java.lang.Character)v2).charValue()));
    org.junit.Assert.assertEquals((Object)(-1), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = "caation";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = "xmp";
    Object v3 = new org.jsoup.parser.CharacterReader(((java.lang.String)v2));
    Object v4 = ((org.jsoup.parser.CharacterReader)v3).consumeDigitSequence();
    Object v5 = ((org.jsoup.parser.CharacterReader)v1).nextIndexOf(((java.lang.CharSequence)v4));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = "xmp";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = Character.valueOf((char)1);
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).consumeTo((((java.lang.Character)v2).charValue()));
    Object v4 = new char[]{Character.valueOf((char)1),Character.valueOf((char)1),Character.valueOf((char)0)};
    Object v5 = ((org.jsoup.parser.CharacterReader)v1).consumeToAnySorted(((char[])v4));
    org.junit.Assert.assertEquals((Object)(""), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = "xmp";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = Character.valueOf((char)1);
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).consumeTo((((java.lang.Character)v2).charValue()));
    Object v4 = ((org.jsoup.parser.CharacterReader)v1).consume();
    org.junit.Assert.assertEquals((Object)(Character.valueOf((char)65535)), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = "xmp";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = 2;
    Object v3 = 0;
    Object v4 = "fon";
    Object v5 = ((org.jsoup.parser.CharacterReader)v1).rangeEquals((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = "xmp";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    ((org.jsoup.parser.CharacterReader)v1).advance();
    Object v2 = null;
    Object v3 = "-";
    Object v4 = ((org.jsoup.parser.CharacterReader)v1).matches(((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = "xmp";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = "select";
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).containsIgnoreCase(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = "xmp";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    ((org.jsoup.parser.CharacterReader)v1).mark();
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = "xmp";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = 2;
    Object v3 = 27;
    Object v4 = "re";
    Object v5 = ((org.jsoup.parser.CharacterReader)v1).rangeEquals((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = "xmp";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    ((org.jsoup.parser.CharacterReader)v1).unconsume();
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = "xmp";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).toString();
    org.junit.Assert.assertEquals((Object)("xmp"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = 23;
    Object v2 = new org.jsoup.parser.CharacterReader(((java.io.Reader)v0),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new char[]{Character.valueOf((char)1),Character.valueOf((char)10),Character.valueOf((char)0)};
    Object v1 = -5;
    Object v2 = 0;
    Object v3 = "optgroup";
    Object v4 = org.jsoup.parser.CharacterReader.rangeEquals(((char[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = "xmp";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = Character.valueOf((char)1);
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).consumeTo((((java.lang.Character)v2).charValue()));
    Object v4 = 40;
    Object v5 = -15;
    Object v6 = "hJ";
    Object v7 = ((org.jsoup.parser.CharacterReader)v1).rangeEquals((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),((java.lang.String)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = 1;
    Object v2 = new org.jsoup.parser.CharacterReader(((java.io.Reader)v0),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = "caation";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).matchesLetter();
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = "xmp";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = "'";
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).matchesIgnoreCase(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = "xmp";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    ((org.jsoup.parser.CharacterReader)v1).rewindToMark();
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = "xmp";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = "xmp";
    Object v3 = new org.jsoup.parser.CharacterReader(((java.lang.String)v2));
    Object v4 = Character.valueOf((char)0);
    Object v5 = ((org.jsoup.parser.CharacterReader)v3).consumeTo((((java.lang.Character)v4).charValue()));
    Object v6 = ((org.jsoup.parser.CharacterReader)v1).nextIndexOf(((java.lang.CharSequence)v5));
    org.junit.Assert.assertEquals((Object)(0), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = new org.jsoup.parser.CharacterReader(((java.io.Reader)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = "xmp";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = "xmp";
    Object v3 = new org.jsoup.parser.CharacterReader(((java.lang.String)v2));
    Object v4 = ((org.jsoup.parser.CharacterReader)v3).consumeData();
    Object v5 = ((org.jsoup.parser.CharacterReader)v1).nextIndexOf(((java.lang.CharSequence)v4));
    org.junit.Assert.assertEquals((Object)(0), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = "caation";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).toString();
    org.junit.Assert.assertEquals((Object)("caation"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = "xmp";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = "p";
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).containsIgnoreCase(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(true), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = "xmp";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = "caption";
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).matchConsume(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = "xmp";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ":last-of-type";
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).matches(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = "caation";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = "head";
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).consumeTo(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)("caation"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = "xmp";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = Character.valueOf((char)3);
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).matches((((java.lang.Character)v2).charValue()));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = "caation";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = "[^Za-zA-Z0-9_:.]";
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).matchConsume(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = "caation";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = "xmp";
    Object v3 = new org.jsoup.parser.CharacterReader(((java.lang.String)v2));
    Object v4 = new char[]{};
    Object v5 = ((org.jsoup.parser.CharacterReader)v3).consumeToAny(((char[])v4));
    Object v6 = ((org.jsoup.parser.CharacterReader)v1).nextIndexOf(((java.lang.CharSequence)v5));
    org.junit.Assert.assertEquals((Object)(-1), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = "caation";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).current();
    org.junit.Assert.assertEquals((Object)(Character.valueOf((char)99)), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = "xmp";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = new char[]{Character.valueOf((char)1),Character.valueOf((char)2)};
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).consumeToAny(((char[])v2));
    Object v4 = ((org.jsoup.parser.CharacterReader)v1).consumeHexSequence();
    org.junit.Assert.assertEquals((Object)(""), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = "xmp";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = new char[]{Character.valueOf((char)1)};
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).consumeToAny(((char[])v2));
    org.junit.Assert.assertEquals((Object)("xmp"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = "xmp";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = Character.valueOf((char)1);
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).matches((((java.lang.Character)v2).charValue()));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = "xmp";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = Character.valueOf((char)1);
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).nextIndexOf((((java.lang.Character)v2).charValue()));
    org.junit.Assert.assertEquals((Object)(-1), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = "xmp";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).consumeToEnd();
    org.junit.Assert.assertEquals((Object)("xmp"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new char[]{Character.valueOf((char)0),Character.valueOf((char)1),Character.valueOf((char)0)};
    Object v1 = -96;
    Object v2 = 1;
    Object v3 = "link0";
    Object v4 = org.jsoup.parser.CharacterReader.rangeEquals(((char[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = "xmp";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).isEmpty();
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).consumeData();
    org.junit.Assert.assertEquals((Object)("xmp"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = "xmp";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    ((org.jsoup.parser.CharacterReader)v1).advance();
    Object v2 = null;
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).consumeTagName();
    org.junit.Assert.assertEquals((Object)("mp"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = "xmp";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).consumeTo((((java.lang.Character)v2).charValue()));
    Object v4 = ((org.jsoup.parser.CharacterReader)v1).current();
    org.junit.Assert.assertEquals((Object)(Character.valueOf((char)65535)), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = "xmp";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = "-";
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).containsIgnoreCase(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = "xmp";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = "Commet";
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).matches(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = "xmp";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = new char[]{Character.valueOf((char)1)};
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).consumeToAnySorted(((char[])v2));
    org.junit.Assert.assertEquals((Object)("xmp"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = "xmp";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = "b`dy";
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).matches(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = "xmp";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).matches((((java.lang.Character)v2).charValue()));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = "xmp";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    ((org.jsoup.parser.CharacterReader)v1).advance();
    Object v2 = null;
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).current();
    org.junit.Assert.assertEquals((Object)(Character.valueOf((char)109)), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = "caation";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).isEmpty();
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = "tfoox";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = "xmp";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = "titl1e";
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).containsIgnoreCase(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = "xmp";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = "*i";
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).matches(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = "xmp";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).current();
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).consumeLetterThenDigitSequence();
    org.junit.Assert.assertEquals((Object)("xmp"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = "xmp";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).consumeTo((((java.lang.Character)v2).charValue()));
    Object v4 = "";
    Object v5 = ((org.jsoup.parser.CharacterReader)v1).matches(((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)(true), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = "xmp";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = "cation";
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).matchesIgnoreCase(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = "xmp";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = Character.valueOf((char)4);
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).consumeTo((((java.lang.Character)v2).charValue()));
    org.junit.Assert.assertEquals((Object)("xmp"), v3);
  }
}
