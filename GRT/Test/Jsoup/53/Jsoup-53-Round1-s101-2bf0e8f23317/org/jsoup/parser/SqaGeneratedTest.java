package org.jsoup.parser;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = "hei";
    Object v1 = new org.jsoup.parser.TokenQueue(((java.lang.String)v0));
    Object v2 = new java.lang.String[]{"Xhead","htm{l","body"};
    Object v3 = ((org.jsoup.parser.TokenQueue)v1).matchesAny(((java.lang.String[])v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = "hei";
    Object v1 = new org.jsoup.parser.TokenQueue(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.TokenQueue)v1).consumeWhitespace();
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = "hei";
    Object v1 = new org.jsoup.parser.TokenQueue(((java.lang.String)v0));
    Object v2 = new java.lang.String[]{":all","area","head"};
    Object v3 = ((org.jsoup.parser.TokenQueue)v1).matchesAny(((java.lang.String[])v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = "hei";
    Object v1 = new org.jsoup.parser.TokenQueue(((java.lang.String)v0));
    Object v2 = new char[]{Character.valueOf((char)1),Character.valueOf((char)1),Character.valueOf((char)1)};
    Object v3 = ((org.jsoup.parser.TokenQueue)v1).matchesAny(((char[])v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = "hei";
    Object v1 = new org.jsoup.parser.TokenQueue(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.TokenQueue)v1).consumeCssIdentifier();
    org.junit.Assert.assertEquals((Object)("hei"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = "hei";
    Object v1 = new org.jsoup.parser.TokenQueue(((java.lang.String)v0));
    Object v2 = new char[]{Character.valueOf((char)1),Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v3 = ((org.jsoup.parser.TokenQueue)v1).matchesAny(((char[])v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = "hei";
    Object v1 = new org.jsoup.parser.TokenQueue(((java.lang.String)v0));
    Object v2 = Character.valueOf((char)0);
    Object v3 = Character.valueOf((char)1);
    Object v4 = ((org.jsoup.parser.TokenQueue)v1).chompBalanced((((java.lang.Character)v2).charValue()),(((java.lang.Character)v3).charValue()));
    org.junit.Assert.assertEquals((Object)(""), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = "hei";
    Object v1 = new org.jsoup.parser.TokenQueue(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.TokenQueue)v1).matchesStartTag();
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = "hei";
    Object v1 = new org.jsoup.parser.TokenQueue(((java.lang.String)v0));
    ((org.jsoup.parser.TokenQueue)v1).advance();
    Object v2 = null;
    Object v3 = "m";
    ((org.jsoup.parser.TokenQueue)v1).consume(((java.lang.String)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = "hei";
    Object v1 = new org.jsoup.parser.TokenQueue(((java.lang.String)v0));
    ((org.jsoup.parser.TokenQueue)v1).advance();
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = "hei";
    Object v1 = new org.jsoup.parser.TokenQueue(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.TokenQueue)v1).toString();
    Object v3 = new java.lang.String[]{"UTF-","p","tr"};
    Object v4 = ((org.jsoup.parser.TokenQueue)v1).consumeToAny(((java.lang.String[])v3));
    org.junit.Assert.assertEquals((Object)("hei"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = "hei";
    Object v1 = new org.jsoup.parser.TokenQueue(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.TokenQueue)v1).consumeAttributeKey();
    org.junit.Assert.assertEquals((Object)("hei"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = "hei";
    Object v1 = new org.jsoup.parser.TokenQueue(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.TokenQueue)v1).consumeElementSelector();
    org.junit.Assert.assertEquals((Object)("hei"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = "hei";
    Object v1 = new org.jsoup.parser.TokenQueue(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.TokenQueue)v1).matchesWhitespace();
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = "hei";
    Object v1 = new org.jsoup.parser.TokenQueue(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.TokenQueue)v1).isEmpty();
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = "hei";
    Object v1 = new org.jsoup.parser.TokenQueue(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.TokenQueue)v1).matchesWord();
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = "hei";
    Object v1 = new org.jsoup.parser.TokenQueue(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.TokenQueue)v1).consumeElementSelector();
    Object v3 = ((org.jsoup.parser.TokenQueue)v1).consumeElementSelector();
    org.junit.Assert.assertEquals((Object)(""), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = "hei";
    Object v1 = new org.jsoup.parser.TokenQueue(((java.lang.String)v0));
    Object v2 = "h/5";
    Object v3 = ((org.jsoup.parser.TokenQueue)v1).consumeToIgnoreCase(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)("hei"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = "hei";
    Object v1 = new org.jsoup.parser.TokenQueue(((java.lang.String)v0));
    Object v2 = "t";
    Object v3 = ((org.jsoup.parser.TokenQueue)v1).consumeTo(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)("hei"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = "title";
    Object v1 = org.jsoup.parser.TokenQueue.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("title"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = "hei";
    Object v1 = new org.jsoup.parser.TokenQueue(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.TokenQueue)v1).consumeTagName();
    org.junit.Assert.assertEquals((Object)("hei"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = "hei";
    Object v1 = new org.jsoup.parser.TokenQueue(((java.lang.String)v0));
    Object v2 = new java.lang.String[]{"","head"};
    Object v3 = ((org.jsoup.parser.TokenQueue)v1).consumeToAny(((java.lang.String[])v2));
    Object v4 = Character.valueOf((char)1);
    Object v5 = Character.valueOf((char)0);
    Object v6 = ((org.jsoup.parser.TokenQueue)v1).chompBalanced((((java.lang.Character)v4).charValue()),(((java.lang.Character)v5).charValue()));
    org.junit.Assert.assertEquals((Object)(""), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = "hei";
    Object v1 = new org.jsoup.parser.TokenQueue(((java.lang.String)v0));
    Object v2 = "cl";
    Object v3 = ((org.jsoup.parser.TokenQueue)v1).consumeTo(((java.lang.String)v2));
    Object v4 = ((org.jsoup.parser.TokenQueue)v1).peek();
    org.junit.Assert.assertEquals((Object)(Character.valueOf((char)0)), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = "hei";
    Object v1 = new org.jsoup.parser.TokenQueue(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.TokenQueue)v1).consume();
    Object v3 = "Data collection must not be null";
    Object v4 = ((org.jsoup.parser.TokenQueue)v1).matchChomp(((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = "hei";
    Object v1 = new org.jsoup.parser.TokenQueue(((java.lang.String)v0));
    Object v2 = Character.valueOf((char)1);
    ((org.jsoup.parser.TokenQueue)v1).addFirst(((java.lang.Character)v2));
    Object v3 = null;
    Object v4 = ((org.jsoup.parser.TokenQueue)v1).peek();
    org.junit.Assert.assertEquals((Object)(Character.valueOf((char)1)), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = "hei";
    Object v1 = new org.jsoup.parser.TokenQueue(((java.lang.String)v0));
    Object v2 = "table";
    Object v3 = ((org.jsoup.parser.TokenQueue)v1).consumeToIgnoreCase(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)("hei"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = "hei";
    Object v1 = new org.jsoup.parser.TokenQueue(((java.lang.String)v0));
    Object v2 = "widtz";
    Object v3 = ((org.jsoup.parser.TokenQueue)v1).matchChomp(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = "hei";
    Object v1 = new org.jsoup.parser.TokenQueue(((java.lang.String)v0));
    Object v2 = Character.valueOf((char)1);
    Object v3 = Character.valueOf((char)1);
    Object v4 = ((org.jsoup.parser.TokenQueue)v1).chompBalanced((((java.lang.Character)v2).charValue()),(((java.lang.Character)v3).charValue()));
    org.junit.Assert.assertEquals((Object)(""), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = "hei";
    Object v1 = new org.jsoup.parser.TokenQueue(((java.lang.String)v0));
    Object v2 = "td";
    ((org.jsoup.parser.TokenQueue)v1).consume(((java.lang.String)v2));
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = "hei";
    Object v1 = new org.jsoup.parser.TokenQueue(((java.lang.String)v0));
    Object v2 = "html";
    Object v3 = ((org.jsoup.parser.TokenQueue)v1).consumeTo(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)("hei"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = "hei";
    Object v1 = new org.jsoup.parser.TokenQueue(((java.lang.String)v0));
    Object v2 = new java.lang.String[]{};
    Object v3 = ((org.jsoup.parser.TokenQueue)v1).consumeToAny(((java.lang.String[])v2));
    org.junit.Assert.assertEquals((Object)("hei"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = "hei";
    Object v1 = new org.jsoup.parser.TokenQueue(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.TokenQueue)v1).matchesWhitespace();
    Object v3 = ((org.jsoup.parser.TokenQueue)v1).consumeWhitespace();
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = "hei";
    Object v1 = new org.jsoup.parser.TokenQueue(((java.lang.String)v0));
    Object v2 = Character.valueOf((char)1);
    ((org.jsoup.parser.TokenQueue)v1).addFirst(((java.lang.Character)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = "hei";
    Object v1 = new org.jsoup.parser.TokenQueue(((java.lang.String)v0));
    ((org.jsoup.parser.TokenQueue)v1).advance();
    Object v2 = null;
    Object v3 = "tbo";
    ((org.jsoup.parser.TokenQueue)v1).consume(((java.lang.String)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = "hei";
    Object v1 = new org.jsoup.parser.TokenQueue(((java.lang.String)v0));
    Object v2 = "noscript/";
    Object v3 = ((org.jsoup.parser.TokenQueue)v1).matchesCS(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = "hei";
    Object v1 = new org.jsoup.parser.TokenQueue(((java.lang.String)v0));
    Object v2 = new java.lang.String[]{""};
    Object v3 = ((org.jsoup.parser.TokenQueue)v1).consumeToAny(((java.lang.String[])v2));
    org.junit.Assert.assertEquals((Object)(""), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = "hei";
    Object v1 = new org.jsoup.parser.TokenQueue(((java.lang.String)v0));
    Object v2 = "html";
    Object v3 = ((org.jsoup.parser.TokenQueue)v1).consumeToIgnoreCase(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)("hei"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = "h";
    Object v1 = org.jsoup.parser.TokenQueue.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("h"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = "hei";
    Object v1 = new org.jsoup.parser.TokenQueue(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.TokenQueue)v1).consumeWord();
    org.junit.Assert.assertEquals((Object)("hei"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = "hei";
    Object v1 = new org.jsoup.parser.TokenQueue(((java.lang.String)v0));
    Object v2 = "obect";
    Object v3 = ((org.jsoup.parser.TokenQueue)v1).consumeTo(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)("hei"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = "hei";
    Object v1 = new org.jsoup.parser.TokenQueue(((java.lang.String)v0));
    Object v2 = new java.lang.String[]{"tr"};
    Object v3 = ((org.jsoup.parser.TokenQueue)v1).matchesAny(((java.lang.String[])v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = "hei";
    Object v1 = new org.jsoup.parser.TokenQueue(((java.lang.String)v0));
    Object v2 = Character.valueOf((char)1);
    Object v3 = Character.valueOf((char)0);
    Object v4 = ((org.jsoup.parser.TokenQueue)v1).chompBalanced((((java.lang.Character)v2).charValue()),(((java.lang.Character)v3).charValue()));
    org.junit.Assert.assertEquals((Object)(""), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = "hei";
    Object v1 = new org.jsoup.parser.TokenQueue(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.TokenQueue)v1).peek();
    Object v3 = ((org.jsoup.parser.TokenQueue)v1).matchesStartTag();
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = "hei";
    Object v1 = new org.jsoup.parser.TokenQueue(((java.lang.String)v0));
    Object v2 = "scop\"";
    Object v3 = ((org.jsoup.parser.TokenQueue)v1).consumeToIgnoreCase(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)("hei"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = "hei";
    Object v1 = new org.jsoup.parser.TokenQueue(((java.lang.String)v0));
    Object v2 = new char[]{Character.valueOf((char)1)};
    Object v3 = ((org.jsoup.parser.TokenQueue)v1).matchesAny(((char[])v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = "hei";
    Object v1 = new org.jsoup.parser.TokenQueue(((java.lang.String)v0));
    Object v2 = "$";
    Object v3 = ((org.jsoup.parser.TokenQueue)v1).chompTo(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)("hei"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = "c\"te";
    Object v1 = org.jsoup.parser.TokenQueue.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("c\"te"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = "head";
    Object v1 = org.jsoup.parser.TokenQueue.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("head"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = "option";
    Object v1 = org.jsoup.parser.TokenQueue.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("option"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = "hei";
    Object v1 = new org.jsoup.parser.TokenQueue(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.TokenQueue)v1).matchesWhitespace();
    Object v3 = ((org.jsoup.parser.TokenQueue)v1).matchesStartTag();
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = "hei";
    Object v1 = new org.jsoup.parser.TokenQueue(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.TokenQueue)v1).peek();
    org.junit.Assert.assertEquals((Object)(Character.valueOf((char)104)), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = "hei";
    Object v1 = new org.jsoup.parser.TokenQueue(((java.lang.String)v0));
    Object v2 = "tfoot";
    Object v3 = ((org.jsoup.parser.TokenQueue)v1).consumeToIgnoreCase(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)("hei"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = "hei";
    Object v1 = new org.jsoup.parser.TokenQueue(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.TokenQueue)v1).matchesWhitespace();
    Object v3 = ((org.jsoup.parser.TokenQueue)v1).peek();
    org.junit.Assert.assertEquals((Object)(Character.valueOf((char)104)), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = "hei";
    Object v1 = new org.jsoup.parser.TokenQueue(((java.lang.String)v0));
    Object v2 = "+";
    Object v3 = ((org.jsoup.parser.TokenQueue)v1).consumeTo(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)("hei"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = "hei";
    Object v1 = new org.jsoup.parser.TokenQueue(((java.lang.String)v0));
    Object v2 = "seamless";
    ((org.jsoup.parser.TokenQueue)v1).consume(((java.lang.String)v2));
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = "hei";
    Object v1 = new org.jsoup.parser.TokenQueue(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.TokenQueue)v1).consumeWord();
    Object v3 = ((org.jsoup.parser.TokenQueue)v1).consumeWord();
    org.junit.Assert.assertEquals((Object)(""), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = "hei";
    Object v1 = new org.jsoup.parser.TokenQueue(((java.lang.String)v0));
    Object v2 = "tite";
    Object v3 = ((org.jsoup.parser.TokenQueue)v1).matchChomp(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = "hei";
    Object v1 = new org.jsoup.parser.TokenQueue(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.TokenQueue)v1).toString();
    org.junit.Assert.assertEquals((Object)("hei"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = "hei";
    Object v1 = new org.jsoup.parser.TokenQueue(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.TokenQueue)v1).remainder();
    org.junit.Assert.assertEquals((Object)("hei"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = "hei";
    Object v1 = new org.jsoup.parser.TokenQueue(((java.lang.String)v0));
    Object v2 = ")";
    Object v3 = ((org.jsoup.parser.TokenQueue)v1).consumeToIgnoreCase(((java.lang.String)v2));
    Object v4 = "";
    Object v5 = ((org.jsoup.parser.TokenQueue)v1).consumeTo(((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)(""), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = "hei";
    Object v1 = new org.jsoup.parser.TokenQueue(((java.lang.String)v0));
    Object v2 = "htl";
    ((org.jsoup.parser.TokenQueue)v1).consume(((java.lang.String)v2));
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = "hei";
    Object v1 = new org.jsoup.parser.TokenQueue(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.TokenQueue)v1).consumeElementSelector();
    Object v3 = ((org.jsoup.parser.TokenQueue)v1).matchesWord();
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = "hei";
    Object v1 = new org.jsoup.parser.TokenQueue(((java.lang.String)v0));
    Object v2 = "h1";
    Object v3 = ((org.jsoup.parser.TokenQueue)v1).chompToIgnoreCase(((java.lang.String)v2));
    Object v4 = ((org.jsoup.parser.TokenQueue)v1).matchesWhitespace();
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = "hei";
    Object v1 = new org.jsoup.parser.TokenQueue(((java.lang.String)v0));
    Object v2 = new java.lang.String[]{"thea"};
    Object v3 = ((org.jsoup.parser.TokenQueue)v1).matchesAny(((java.lang.String[])v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = "<";
    Object v1 = new org.jsoup.parser.TokenQueue(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = "<";
    Object v1 = new org.jsoup.parser.TokenQueue(((java.lang.String)v0));
    Object v2 = "th";
    Object v3 = ((org.jsoup.parser.TokenQueue)v1).consumeToIgnoreCase(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)("<"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = "<";
    Object v1 = new org.jsoup.parser.TokenQueue(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.TokenQueue)v1).consumeWhitespace();
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = "<";
    Object v1 = new org.jsoup.parser.TokenQueue(((java.lang.String)v0));
    Object v2 = "! ";
    Object v3 = ((org.jsoup.parser.TokenQueue)v1).consumeToIgnoreCase(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)("<"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = "<";
    Object v1 = new org.jsoup.parser.TokenQueue(((java.lang.String)v0));
    Object v2 = "r";
    Object v3 = ((org.jsoup.parser.TokenQueue)v1).matchChomp(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = "<";
    Object v1 = new org.jsoup.parser.TokenQueue(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.TokenQueue)v1).consumeElementSelector();
    org.junit.Assert.assertEquals((Object)(""), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = "<";
    Object v1 = new org.jsoup.parser.TokenQueue(((java.lang.String)v0));
    Object v2 = new java.lang.String[]{"dat","tfoot","link"};
    Object v3 = ((org.jsoup.parser.TokenQueue)v1).matchesAny(((java.lang.String[])v2));
    Object v4 = ((org.jsoup.parser.TokenQueue)v1).matchesWord();
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = "<";
    Object v1 = new org.jsoup.parser.TokenQueue(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.TokenQueue)v1).consumeAttributeKey();
    org.junit.Assert.assertEquals((Object)(""), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = "<";
    Object v1 = new org.jsoup.parser.TokenQueue(((java.lang.String)v0));
    ((org.jsoup.parser.TokenQueue)v1).advance();
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = "hei";
    Object v1 = new org.jsoup.parser.TokenQueue(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.TokenQueue)v1).consumeWord();
    Object v3 = Character.valueOf((char)1);
    Object v4 = Character.valueOf((char)1);
    Object v5 = ((org.jsoup.parser.TokenQueue)v1).chompBalanced((((java.lang.Character)v3).charValue()),(((java.lang.Character)v4).charValue()));
    org.junit.Assert.assertEquals((Object)(""), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = "<";
    Object v1 = new org.jsoup.parser.TokenQueue(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.TokenQueue)v1).matchesStartTag();
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = "<";
    Object v1 = new org.jsoup.parser.TokenQueue(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.TokenQueue)v1).matchesWord();
    Object v3 = "sub";
    Object v4 = ((org.jsoup.parser.TokenQueue)v1).consumeTo(((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)("<"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = "<";
    Object v1 = new org.jsoup.parser.TokenQueue(((java.lang.String)v0));
    Object v2 = new char[]{Character.valueOf((char)1),Character.valueOf((char)1),Character.valueOf((char)1)};
    Object v3 = ((org.jsoup.parser.TokenQueue)v1).matchesAny(((char[])v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = "<";
    Object v1 = new org.jsoup.parser.TokenQueue(((java.lang.String)v0));
    Object v2 = new java.lang.String[]{};
    Object v3 = ((org.jsoup.parser.TokenQueue)v1).matchesAny(((java.lang.String[])v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = "<";
    Object v1 = new org.jsoup.parser.TokenQueue(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.TokenQueue)v1).matchesWord();
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = "<";
    Object v1 = new org.jsoup.parser.TokenQueue(((java.lang.String)v0));
    Object v2 = "d@t";
    Object v3 = ((org.jsoup.parser.TokenQueue)v1).matches(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = "hei";
    Object v1 = new org.jsoup.parser.TokenQueue(((java.lang.String)v0));
    Object v2 = "tbody";
    Object v3 = ((org.jsoup.parser.TokenQueue)v1).consumeToIgnoreCase(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)("hei"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = "hstml";
    Object v1 = org.jsoup.parser.TokenQueue.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("hstml"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = "<";
    Object v1 = new org.jsoup.parser.TokenQueue(((java.lang.String)v0));
    Object v2 = Character.valueOf((char)0);
    ((org.jsoup.parser.TokenQueue)v1).addFirst(((java.lang.Character)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = "<";
    Object v1 = new org.jsoup.parser.TokenQueue(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.TokenQueue)v1).isEmpty();
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = "hei";
    Object v1 = new org.jsoup.parser.TokenQueue(((java.lang.String)v0));
    ((org.jsoup.parser.TokenQueue)v1).advance();
    Object v2 = null;
    Object v3 = "tf1ot";
    ((org.jsoup.parser.TokenQueue)v1).consume(((java.lang.String)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = "<";
    Object v1 = new org.jsoup.parser.TokenQueue(((java.lang.String)v0));
    Object v2 = "Gli";
    ((org.jsoup.parser.TokenQueue)v1).consume(((java.lang.String)v2));
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = "<";
    Object v1 = new org.jsoup.parser.TokenQueue(((java.lang.String)v0));
    Object v2 = "dd";
    Object v3 = ((org.jsoup.parser.TokenQueue)v1).chompToIgnoreCase(((java.lang.String)v2));
    Object v4 = new java.lang.String[]{"text/","option","html"};
    Object v5 = ((org.jsoup.parser.TokenQueue)v1).consumeToAny(((java.lang.String[])v4));
    org.junit.Assert.assertEquals((Object)(""), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = "<";
    Object v1 = new org.jsoup.parser.TokenQueue(((java.lang.String)v0));
    Object v2 = "header";
    Object v3 = ((org.jsoup.parser.TokenQueue)v1).consumeTo(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)("<"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = "hei";
    Object v1 = new org.jsoup.parser.TokenQueue(((java.lang.String)v0));
    Object v2 = "";
    Object v3 = ((org.jsoup.parser.TokenQueue)v1).consumeTo(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(""), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = "<";
    Object v1 = new org.jsoup.parser.TokenQueue(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.TokenQueue)v1).consume();
    org.junit.Assert.assertEquals((Object)(Character.valueOf((char)60)), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = "<";
    Object v1 = new org.jsoup.parser.TokenQueue(((java.lang.String)v0));
    Object v2 = "tabl";
    ((org.jsoup.parser.TokenQueue)v1).addFirst(((java.lang.String)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = "<";
    Object v1 = new org.jsoup.parser.TokenQueue(((java.lang.String)v0));
    Object v2 = "select";
    ((org.jsoup.parser.TokenQueue)v1).addFirst(((java.lang.String)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = "<";
    Object v1 = new org.jsoup.parser.TokenQueue(((java.lang.String)v0));
    Object v2 = "h1";
    Object v3 = ((org.jsoup.parser.TokenQueue)v1).consumeToIgnoreCase(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)("<"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = "hei";
    Object v1 = new org.jsoup.parser.TokenQueue(((java.lang.String)v0));
    Object v2 = "t|";
    Object v3 = ((org.jsoup.parser.TokenQueue)v1).consumeToIgnoreCase(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)("hei"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = "<";
    Object v1 = new org.jsoup.parser.TokenQueue(((java.lang.String)v0));
    Object v2 = "body";
    Object v3 = ((org.jsoup.parser.TokenQueue)v1).matchChomp(((java.lang.String)v2));
    Object v4 = ((org.jsoup.parser.TokenQueue)v1).consumeCssIdentifier();
    org.junit.Assert.assertEquals((Object)(""), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = "hei";
    Object v1 = new org.jsoup.parser.TokenQueue(((java.lang.String)v0));
    Object v2 = new java.lang.String[]{"BeforeAttributeName","html",""};
    Object v3 = ((org.jsoup.parser.TokenQueue)v1).consumeToAny(((java.lang.String[])v2));
    org.junit.Assert.assertEquals((Object)(""), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = "<";
    Object v1 = new org.jsoup.parser.TokenQueue(((java.lang.String)v0));
    Object v2 = new java.lang.String[]{"html","","select"};
    Object v3 = ((org.jsoup.parser.TokenQueue)v1).consumeToAny(((java.lang.String[])v2));
    org.junit.Assert.assertEquals((Object)(""), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = "<";
    Object v1 = new org.jsoup.parser.TokenQueue(((java.lang.String)v0));
    Object v2 = "q";
    Object v3 = ((org.jsoup.parser.TokenQueue)v1).consumeToIgnoreCase(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)("<"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = "<";
    Object v1 = new org.jsoup.parser.TokenQueue(((java.lang.String)v0));
    Object v2 = "";
    Object v3 = ((org.jsoup.parser.TokenQueue)v1).matchChomp(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(true), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = "<";
    Object v1 = new org.jsoup.parser.TokenQueue(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.TokenQueue)v1).consumeCssIdentifier();
    Object v3 = ((org.jsoup.parser.TokenQueue)v1).matchesWhitespace();
    org.junit.Assert.assertEquals((Object)(false), v3);
  }
}
