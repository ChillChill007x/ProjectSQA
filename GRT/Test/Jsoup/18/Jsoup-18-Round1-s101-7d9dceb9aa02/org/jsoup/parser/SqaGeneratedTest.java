package org.jsoup.parser;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = "nam";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = "_Rightarrow";
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).matchConsumeIgnoreCase(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = "nam";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).toString();
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).isEmpty();
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = "nam";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = new char[]{};
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).matchesAny(((char[])v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = "nam";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    ((org.jsoup.parser.CharacterReader)v1).rewindToMark();
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = "nam";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).consumeDigitSequence();
    org.junit.Assert.assertEquals((Object)(""), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = "nam";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).current();
    org.junit.Assert.assertEquals((Object)(Character.valueOf((char)110)), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = "nam";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).matchesLetter();
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = "nam";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).toString();
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).consume();
    org.junit.Assert.assertEquals((Object)(Character.valueOf((char)110)), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = "nam";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = "srarr";
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).matchConsume(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = "nam";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = "htm";
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).containsIgnoreCase(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = "nam";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = "td";
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).consumeTo(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)("nam"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = "nam";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).consumeLetterSequence();
    org.junit.Assert.assertEquals((Object)("nam"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = "nam";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).consumeHexSequence();
    org.junit.Assert.assertEquals((Object)(""), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = "nam";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = "html";
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).matchesIgnoreCase(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = "nam";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = "t-h";
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).matchConsume(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = "nam";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).consumeTo((((java.lang.Character)v2).charValue()));
    org.junit.Assert.assertEquals((Object)("nam"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = "nam";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).matchesDigit();
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = "nam";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = "mdash";
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).consumeTo(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)("nam"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = "nam";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).pos();
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = "nam";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = new char[]{Character.valueOf((char)0)};
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).matchesAny(((char[])v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = "nam";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    ((org.jsoup.parser.CharacterReader)v1).mark();
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = "nam";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).isEmpty();
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = "nam";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = "h5";
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).containsIgnoreCase(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = "nam";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = "angmsdaa";
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).matchConsumeIgnoreCase(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = "nam";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = new char[]{};
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).consumeToAny(((char[])v2));
    org.junit.Assert.assertEquals((Object)("nam"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = "nam";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).consume();
    org.junit.Assert.assertEquals((Object)(Character.valueOf((char)110)), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = "nam";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).toString();
    Object v3 = Character.valueOf((char)2);
    Object v4 = ((org.jsoup.parser.CharacterReader)v1).matches((((java.lang.Character)v3).charValue()));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = "nam";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = new char[]{Character.valueOf((char)0),Character.valueOf((char)1),Character.valueOf((char)2)};
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).consumeToAny(((char[])v2));
    org.junit.Assert.assertEquals((Object)("nam"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = "nam";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).toString();
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).consumeHexSequence();
    org.junit.Assert.assertEquals((Object)(""), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = "nam";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).toString();
    Object v3 = "h2D";
    Object v4 = ((org.jsoup.parser.CharacterReader)v1).matches(((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = "nam";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = "frame";
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).containsIgnoreCase(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = "nam";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).toString();
    org.junit.Assert.assertEquals((Object)("nam"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = "nam";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = "b";
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).consumeTo(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)("nam"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = "nam";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = "htm";
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).matchConsume(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = "nam";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).toString();
    Object v3 = "p";
    Object v4 = ((org.jsoup.parser.CharacterReader)v1).containsIgnoreCase(((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = "nam";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = Character.valueOf((char)1);
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).matches((((java.lang.Character)v2).charValue()));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = "nam";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = new char[]{Character.valueOf((char)0),Character.valueOf((char)0)};
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).matchesAny(((char[])v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = "nam";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = Character.valueOf((char)1);
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).consumeTo((((java.lang.Character)v2).charValue()));
    org.junit.Assert.assertEquals((Object)("nam"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = "nam";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = "h3";
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).matchConsume(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = "nam";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).toString();
    Object v3 = new char[]{};
    Object v4 = ((org.jsoup.parser.CharacterReader)v1).matchesAny(((char[])v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = "nam";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = "colgrou^";
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).matchConsumeIgnoreCase(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = "nam";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = "SupersetEqual";
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).matchConsume(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = "nam";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = Character.valueOf((char)2);
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).consumeTo((((java.lang.Character)v2).charValue()));
    org.junit.Assert.assertEquals((Object)("nam"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = "nam";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).consumeToEnd();
    org.junit.Assert.assertEquals((Object)("nam"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = "nam";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = "data-";
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).matchConsumeIgnoreCase(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = "nam";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).toString();
    Object v3 = new char[]{Character.valueOf((char)2)};
    Object v4 = ((org.jsoup.parser.CharacterReader)v1).matchesAny(((char[])v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = "nam";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).toString();
    Object v3 = "html";
    Object v4 = ((org.jsoup.parser.CharacterReader)v1).matchConsumeIgnoreCase(((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = "nam";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).toString();
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).consumeLetterSequence();
    org.junit.Assert.assertEquals((Object)("nam"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = "nam";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = new char[]{Character.valueOf((char)1),Character.valueOf((char)1),Character.valueOf((char)0)};
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).consumeToAny(((char[])v2));
    org.junit.Assert.assertEquals((Object)("nam"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = "nam";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = new char[]{Character.valueOf((char)1)};
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).matchesAny(((char[])v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = "nam";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).matches((((java.lang.Character)v2).charValue()));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = "nam";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = Character.valueOf((char)2);
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).matches((((java.lang.Character)v2).charValue()));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = "nam";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    ((org.jsoup.parser.CharacterReader)v1).advance();
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = "nam";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = "ll";
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).matchConsumeIgnoreCase(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = "nam";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = "ET";
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).consumeTo(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)("nam"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = "nam";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    ((org.jsoup.parser.CharacterReader)v1).unconsume();
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = "nam";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = "noframe";
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).matchConsume(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = "nam";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).consumeAsString();
    org.junit.Assert.assertEquals((Object)(""), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = "nam";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).toString();
    ((org.jsoup.parser.CharacterReader)v1).mark();
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = "nam";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = new char[]{Character.valueOf((char)0),Character.valueOf((char)1),Character.valueOf((char)1)};
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).consumeToAny(((char[])v2));
    org.junit.Assert.assertEquals((Object)("nam"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = "nam";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).toString();
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).matchesDigit();
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = "nam";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = new char[]{Character.valueOf((char)1),Character.valueOf((char)3),Character.valueOf((char)1)};
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).matchesAny(((char[])v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = "nam";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).toString();
    Object v3 = new char[]{Character.valueOf((char)0)};
    Object v4 = ((org.jsoup.parser.CharacterReader)v1).matchesAny(((char[])v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = "nam";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = new char[]{Character.valueOf((char)6)};
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).consumeToAny(((char[])v2));
    org.junit.Assert.assertEquals((Object)("nam"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = "nam";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).toString();
    Object v3 = new char[]{Character.valueOf((char)0),Character.valueOf((char)0),Character.valueOf((char)0)};
    Object v4 = ((org.jsoup.parser.CharacterReader)v1).matchesAny(((char[])v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = "a";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = "a";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).matchesLetter();
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = "a";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).current();
    org.junit.Assert.assertEquals((Object)(Character.valueOf((char)97)), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = "a";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = "boxdR";
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).containsIgnoreCase(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = "bsolb";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = "bsolb";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = new char[]{Character.valueOf((char)0),Character.valueOf((char)0)};
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).consumeToAny(((char[])v2));
    org.junit.Assert.assertEquals((Object)("bsolb"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = "bsolb";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).consume();
    org.junit.Assert.assertEquals((Object)(Character.valueOf((char)98)), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = "a";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).toString();
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).isEmpty();
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = "bsolb";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).current();
    org.junit.Assert.assertEquals((Object)(Character.valueOf((char)98)), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = "bsolb";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).toString();
    Object v3 = "tfoot";
    Object v4 = ((org.jsoup.parser.CharacterReader)v1).matchConsume(((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = "a";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = "html";
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).containsIgnoreCase(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = "bsolb";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = new char[]{Character.valueOf((char)2),Character.valueOf((char)1)};
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).consumeToAny(((char[])v2));
    org.junit.Assert.assertEquals((Object)("bsolb"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = "bsolb";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).toString();
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).current();
    org.junit.Assert.assertEquals((Object)(Character.valueOf((char)98)), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = "bsolb";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).toString();
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).matchesLetter();
    org.junit.Assert.assertEquals((Object)(true), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = "bsolb";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).toString();
    Object v3 = Character.valueOf((char)1);
    Object v4 = ((org.jsoup.parser.CharacterReader)v1).consumeTo((((java.lang.Character)v3).charValue()));
    org.junit.Assert.assertEquals((Object)("bsolb"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = "bsolb";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).toString();
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).matchesDigit();
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = "bsolb";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = "";
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).matchConsumeIgnoreCase(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(true), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = "bsolb";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).pos();
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = "bsolb";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = "tbody";
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).matchConsumeIgnoreCase(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = "bsolb";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).matchesLetter();
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = "bsolb";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = new char[]{};
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).matchesAny(((char[])v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = "bsolb";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).toString();
    Object v3 = "</";
    Object v4 = ((org.jsoup.parser.CharacterReader)v1).containsIgnoreCase(((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = "bsolb";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).toString();
    Object v3 = Character.valueOf((char)0);
    Object v4 = ((org.jsoup.parser.CharacterReader)v1).matches((((java.lang.Character)v3).charValue()));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = "bsolb";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = new char[]{Character.valueOf((char)0),Character.valueOf((char)0),Character.valueOf((char)0)};
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).consumeToAny(((char[])v2));
    org.junit.Assert.assertEquals((Object)("bsolb"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = "bsolb";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).consumeHexSequence();
    org.junit.Assert.assertEquals((Object)("b"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = "bsolb";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).consumeDigitSequence();
    org.junit.Assert.assertEquals((Object)(""), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = "bsolb";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).toString();
    Object v3 = "kobject";
    Object v4 = ((org.jsoup.parser.CharacterReader)v1).containsIgnoreCase(((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = "bsolb";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = new char[]{Character.valueOf((char)0),Character.valueOf((char)2)};
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).matchesAny(((char[])v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = "bsolb";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = "atilde";
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).matchConsumeIgnoreCase(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = "bsolb";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = new char[]{Character.valueOf((char)2)};
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).matchesAny(((char[])v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = "bsolb";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).consumeTo((((java.lang.Character)v2).charValue()));
    org.junit.Assert.assertEquals((Object)("bsolb"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = "bsolb";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = "i";
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).containsIgnoreCase(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = "bsolb";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = "captio";
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).consumeTo(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)("bsolb"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = "bsolb";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).consumeLetterSequence();
    org.junit.Assert.assertEquals((Object)("bsolb"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = "bsolb";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = "no";
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).matchConsumeIgnoreCase(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }
}
