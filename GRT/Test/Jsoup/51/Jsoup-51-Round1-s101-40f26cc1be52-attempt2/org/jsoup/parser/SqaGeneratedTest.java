package org.jsoup.parser;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = ".";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = new char[]{Character.valueOf((char)1),Character.valueOf((char)1),Character.valueOf((char)0)};
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).matchesAny(((char[])v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = ".";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = new char[]{Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).matchesAnySorted(((char[])v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = ".";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).consumeDigitSequence();
    org.junit.Assert.assertEquals((Object)(""), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = ".";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).isEmpty();
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = ".";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = 0;
    Object v3 = 1;
    Object v4 = "tr";
    Object v5 = ((org.jsoup.parser.CharacterReader)v1).rangeEquals((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = ".";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).consumeLetterThenDigitSequence();
    org.junit.Assert.assertEquals((Object)(""), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = ".";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = "application/x-www-form-urlencoded; charset=";
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).matchesIgnoreCase(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = ".";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = new char[]{Character.valueOf((char)1)};
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).matchesAny(((char[])v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = ".";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).matchesLetter();
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = ".";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = "colgrou";
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).consumeTo(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)("."), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = ".";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = new char[]{Character.valueOf((char)0),Character.valueOf((char)2),Character.valueOf((char)1)};
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).matchesAnySorted(((char[])v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = ".";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).consumeTo((((java.lang.Character)v2).charValue()));
    org.junit.Assert.assertEquals((Object)("."), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = ".";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).consumeData();
    org.junit.Assert.assertEquals((Object)("."), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = ".";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = "colgrouOp";
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).consumeTo(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)("."), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = ".";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = new char[]{Character.valueOf((char)0),Character.valueOf((char)0)};
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).consumeToAnySorted(((char[])v2));
    org.junit.Assert.assertEquals((Object)("."), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = ".";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).current();
    org.junit.Assert.assertEquals((Object)(Character.valueOf((char)46)), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = ".";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ".";
    Object v3 = new org.jsoup.parser.CharacterReader(((java.lang.String)v2));
    Object v4 = ((org.jsoup.parser.CharacterReader)v3).consumeDigitSequence();
    Object v5 = ((org.jsoup.parser.CharacterReader)v1).nextIndexOf(((java.lang.CharSequence)v4));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = ".";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).toString();
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).consume();
    org.junit.Assert.assertEquals((Object)(Character.valueOf((char)46)), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = ".";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = "UTF-";
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).containsIgnoreCase(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = ".";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).toString();
    Object v3 = new char[]{Character.valueOf((char)1),Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v4 = ((org.jsoup.parser.CharacterReader)v1).consumeToAny(((char[])v3));
    org.junit.Assert.assertEquals((Object)("."), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = ".";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).matches((((java.lang.Character)v2).charValue()));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = ".";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = Character.valueOf((char)1);
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).consumeTo((((java.lang.Character)v2).charValue()));
    org.junit.Assert.assertEquals((Object)("."), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = ".";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).toString();
    Object v3 = "caation";
    Object v4 = ((org.jsoup.parser.CharacterReader)v1).matchesIgnoreCase(((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = ".";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).consumeHexSequence();
    org.junit.Assert.assertEquals((Object)(""), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = ".";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).consume();
    org.junit.Assert.assertEquals((Object)(Character.valueOf((char)46)), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = ".";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = "td";
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).containsIgnoreCase(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = ".";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).consumeLetterSequence();
    org.junit.Assert.assertEquals((Object)(""), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = ".";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = Character.valueOf((char)6);
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).nextIndexOf((((java.lang.Character)v2).charValue()));
    org.junit.Assert.assertEquals((Object)(-1), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = ".";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = "br";
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).matchConsumeIgnoreCase(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = ".";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).matchesDigit();
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = ".";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).toString();
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).consumeHexSequence();
    org.junit.Assert.assertEquals((Object)(""), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = ".";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    ((org.jsoup.parser.CharacterReader)v1).rewindToMark();
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = ".";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = new char[]{Character.valueOf((char)1),Character.valueOf((char)1)};
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).consumeToAny(((char[])v2));
    org.junit.Assert.assertEquals((Object)("."), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = ".";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).toString();
    Object v3 = Character.valueOf((char)0);
    Object v4 = ((org.jsoup.parser.CharacterReader)v1).nextIndexOf((((java.lang.Character)v3).charValue()));
    org.junit.Assert.assertEquals((Object)(-1), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = ".";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).toString();
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).current();
    org.junit.Assert.assertEquals((Object)(Character.valueOf((char)46)), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = ".";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = Character.valueOf((char)5);
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).matches((((java.lang.Character)v2).charValue()));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = ".";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).consumeTagName();
    org.junit.Assert.assertEquals((Object)("."), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = ".";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = "htl";
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).containsIgnoreCase(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = ".";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = "a";
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).matchConsumeIgnoreCase(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = ".";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).toString();
    Object v3 = "table";
    Object v4 = ((org.jsoup.parser.CharacterReader)v1).matchesIgnoreCase(((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = ".";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = "title";
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).matchConsume(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = ".";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).toString();
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).matchesDigit();
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = ".";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = "img";
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).matchConsume(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = ".";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = "tody";
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).matches(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = ".";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).toString();
    Object v3 = new char[]{Character.valueOf((char)3),Character.valueOf((char)1),Character.valueOf((char)1)};
    Object v4 = ((org.jsoup.parser.CharacterReader)v1).consumeToAnySorted(((char[])v3));
    org.junit.Assert.assertEquals((Object)("."), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = ".";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).pos();
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = ".";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).toString();
    Object v3 = "tt";
    Object v4 = ((org.jsoup.parser.CharacterReader)v1).matches(((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = ".";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).consumeAsString();
    org.junit.Assert.assertEquals((Object)("."), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = ".";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ".";
    Object v3 = new org.jsoup.parser.CharacterReader(((java.lang.String)v2));
    Object v4 = new char[]{Character.valueOf((char)1),Character.valueOf((char)1)};
    Object v5 = ((org.jsoup.parser.CharacterReader)v3).consumeToAny(((char[])v4));
    Object v6 = ((org.jsoup.parser.CharacterReader)v1).nextIndexOf(((java.lang.CharSequence)v5));
    org.junit.Assert.assertEquals((Object)(0), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = ".";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = new char[]{};
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).consumeToAny(((char[])v2));
    org.junit.Assert.assertEquals((Object)("."), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = ".";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ".";
    Object v3 = new org.jsoup.parser.CharacterReader(((java.lang.String)v2));
    Object v4 = "colgrou";
    Object v5 = ((org.jsoup.parser.CharacterReader)v3).consumeTo(((java.lang.String)v4));
    Object v6 = ((org.jsoup.parser.CharacterReader)v1).nextIndexOf(((java.lang.CharSequence)v5));
    org.junit.Assert.assertEquals((Object)(0), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = ".";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).toString();
    Object v3 = Character.valueOf((char)3);
    Object v4 = ((org.jsoup.parser.CharacterReader)v1).consumeTo((((java.lang.Character)v3).charValue()));
    org.junit.Assert.assertEquals((Object)("."), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = ".";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = new char[]{Character.valueOf((char)0)};
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).matchesAnySorted(((char[])v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = ".";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).toString();
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).consumeLetterSequence();
    org.junit.Assert.assertEquals((Object)(""), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = ".";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = "col";
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).matches(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = ".";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).toString();
    Object v3 = Character.valueOf((char)1);
    Object v4 = ((org.jsoup.parser.CharacterReader)v1).nextIndexOf((((java.lang.Character)v3).charValue()));
    org.junit.Assert.assertEquals((Object)(-1), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = ".";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    ((org.jsoup.parser.CharacterReader)v1).mark();
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = ".";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = 12;
    Object v3 = -2;
    Object v4 = "fieldset";
    Object v5 = ((org.jsoup.parser.CharacterReader)v1).rangeEquals((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = ".";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = new char[]{Character.valueOf((char)9)};
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).matchesAny(((char[])v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = ".";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    ((org.jsoup.parser.CharacterReader)v1).unconsume();
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = ".";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).toString();
    org.junit.Assert.assertEquals((Object)("."), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = ".";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = Character.valueOf((char)1);
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).matches((((java.lang.Character)v2).charValue()));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = ".";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = "td";
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).consumeTo(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)("."), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = ".";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = "_form";
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).matchConsume(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = ".";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = Character.valueOf((char)1);
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).nextIndexOf((((java.lang.Character)v2).charValue()));
    org.junit.Assert.assertEquals((Object)(-1), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = ".";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = "boy";
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).matchesIgnoreCase(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = ".";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).toString();
    Object v3 = "0";
    Object v4 = ((org.jsoup.parser.CharacterReader)v1).consumeTo(((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)("."), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = ".";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = "td";
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).matchConsume(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = "he'der";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = "he'der";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = "bas";
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).matchConsume(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = "he'der";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).consumeLetterThenDigitSequence();
    org.junit.Assert.assertEquals((Object)("he"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = "he'der";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).consumeHexSequence();
    org.junit.Assert.assertEquals((Object)(""), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = "he'der";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).toString();
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).matchesLetter();
    org.junit.Assert.assertEquals((Object)(true), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = "he'der";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = 3;
    Object v3 = -22;
    Object v4 = "style";
    Object v5 = ((org.jsoup.parser.CharacterReader)v1).rangeEquals((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = "he'der";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ".";
    Object v3 = new org.jsoup.parser.CharacterReader(((java.lang.String)v2));
    Object v4 = Character.valueOf((char)1);
    Object v5 = ((org.jsoup.parser.CharacterReader)v3).consumeTo((((java.lang.Character)v4).charValue()));
    Object v6 = ((org.jsoup.parser.CharacterReader)v1).nextIndexOf(((java.lang.CharSequence)v5));
    org.junit.Assert.assertEquals((Object)(-1), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = "he'der";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = Character.valueOf((char)2);
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).matches((((java.lang.Character)v2).charValue()));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = "he'der";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).toString();
    Object v3 = "he'der";
    Object v4 = new org.jsoup.parser.CharacterReader(((java.lang.String)v3));
    Object v5 = ((org.jsoup.parser.CharacterReader)v4).consumeHexSequence();
    Object v6 = ((org.jsoup.parser.CharacterReader)v1).nextIndexOf(((java.lang.CharSequence)v5));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = "he'der";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = Character.valueOf((char)3);
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).matches((((java.lang.Character)v2).charValue()));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = "he'der";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    ((org.jsoup.parser.CharacterReader)v1).mark();
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = "he'der";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = 0;
    Object v3 = 0;
    Object v4 = "htm";
    Object v5 = ((org.jsoup.parser.CharacterReader)v1).rangeEquals((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = "he'der";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = "meta";
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).matchConsumeIgnoreCase(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = "he'der";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = Character.valueOf((char)1);
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).consumeTo((((java.lang.Character)v2).charValue()));
    org.junit.Assert.assertEquals((Object)("he'der"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = "he'der";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = new char[]{Character.valueOf((char)2),Character.valueOf((char)1)};
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).consumeToAny(((char[])v2));
    org.junit.Assert.assertEquals((Object)("he'der"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = "he'der";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).toString();
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).current();
    org.junit.Assert.assertEquals((Object)(Character.valueOf((char)104)), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = "he'der";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).toString();
    Object v3 = ".";
    Object v4 = new org.jsoup.parser.CharacterReader(((java.lang.String)v3));
    Object v5 = ((org.jsoup.parser.CharacterReader)v4).consumeHexSequence();
    Object v6 = ((org.jsoup.parser.CharacterReader)v1).nextIndexOf(((java.lang.CharSequence)v5));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = "he'der";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    ((org.jsoup.parser.CharacterReader)v1).advance();
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = "he'der";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).consume();
    org.junit.Assert.assertEquals((Object)(Character.valueOf((char)104)), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = "he'der";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).toString();
    Object v3 = Character.valueOf((char)1);
    Object v4 = ((org.jsoup.parser.CharacterReader)v1).nextIndexOf((((java.lang.Character)v3).charValue()));
    org.junit.Assert.assertEquals((Object)(-1), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = "he'der";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).toString();
    Object v3 = "th";
    Object v4 = ((org.jsoup.parser.CharacterReader)v1).matchConsume(((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = "he'der";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = "mailtoS";
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).consumeTo(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)("he'der"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = "he'der";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).consumeToEnd();
    org.junit.Assert.assertEquals((Object)("he'der"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = "he'der";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = "header";
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).consumeTo(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)("he'der"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = "he'der";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).consumeDigitSequence();
    org.junit.Assert.assertEquals((Object)(""), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = "he'der";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).toString();
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).matchesDigit();
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = "he'der";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).consumeTo((((java.lang.Character)v2).charValue()));
    org.junit.Assert.assertEquals((Object)("he'der"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = "he'der";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).nextIndexOf((((java.lang.Character)v2).charValue()));
    org.junit.Assert.assertEquals((Object)(-1), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = "he'der";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).pos();
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = "he'der";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.CharacterReader)v1).consumeAsString();
    org.junit.Assert.assertEquals((Object)("h"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = "he'der";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = new char[]{};
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).consumeToAnySorted(((char[])v2));
    org.junit.Assert.assertEquals((Object)("he'der"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = "he'der";
    Object v1 = new org.jsoup.parser.CharacterReader(((java.lang.String)v0));
    Object v2 = new char[]{};
    Object v3 = ((org.jsoup.parser.CharacterReader)v1).matchesAny(((char[])v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }
}
