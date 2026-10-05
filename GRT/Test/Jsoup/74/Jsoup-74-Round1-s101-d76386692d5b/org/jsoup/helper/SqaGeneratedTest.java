package org.jsoup.helper;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = ":last-child";
    Object v1 = new java.lang.String[]{};
    Object v2 = org.jsoup.helper.StringUtil.inSorted(((java.lang.String)v0),((java.lang.String[])v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = 2;
    Object v1 = org.jsoup.helper.StringUtil.padding((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertEquals((Object)("  "), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = -6;
    Object v1 = org.jsoup.helper.StringUtil.isActuallyWhitespace((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = "https";
    Object v1 = org.jsoup.helper.StringUtil.isBlank(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = "tbo";
    Object v1 = org.jsoup.helper.StringUtil.isNumeric(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = "option";
    Object v1 = org.jsoup.helper.StringUtil.isBlank(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = 13;
    Object v1 = new java.lang.StringBuilder((((java.lang.Integer)v0).intValue()));
    Object v2 = "tr";
    Object v3 = false;
    org.jsoup.helper.StringUtil.appendNormalisedWhitespace(((java.lang.StringBuilder)v1),((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "pre";
    Object v2 = org.jsoup.helper.StringUtil.resolve(((java.net.URL)v0),((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.net.MalformedURLException");
    } catch (java.net.MalformedURLException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = "2dl";
    Object v1 = org.jsoup.helper.StringUtil.isBlank(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = 24;
    Object v1 = org.jsoup.helper.StringUtil.isWhitespace((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = 0;
    Object v1 = org.jsoup.helper.StringUtil.isInvisibleChar((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = org.jsoup.helper.StringUtil.stringBuilder();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = "";
    Object v1 = new java.lang.String[]{"p"};
    Object v2 = org.jsoup.helper.StringUtil.in(((java.lang.String)v0),((java.lang.String[])v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = "a";
    Object v1 = org.jsoup.helper.StringUtil.isNumeric(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = -3;
    Object v1 = org.jsoup.helper.StringUtil.isWhitespace((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = "y";
    Object v1 = org.jsoup.helper.StringUtil.isNumeric(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new org.jsoup.helper.StringUtil();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = 56;
    Object v1 = org.jsoup.helper.StringUtil.padding((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertEquals((Object)("                                                        "), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = 13;
    Object v1 = new java.lang.StringBuilder((((java.lang.Integer)v0).intValue()));
    Object v2 = "html";
    Object v3 = false;
    org.jsoup.helper.StringUtil.appendNormalisedWhitespace(((java.lang.StringBuilder)v1),((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = -26;
    Object v1 = org.jsoup.helper.StringUtil.isActuallyWhitespace((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = "Initial";
    Object v1 = org.jsoup.helper.StringUtil.isBlank(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = "colgr";
    Object v1 = new java.lang.String[]{"application/x-www-form-urlencoded;= charset=",""};
    Object v2 = org.jsoup.helper.StringUtil.inSorted(((java.lang.String)v0),((java.lang.String[])v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new org.jsoup.select.Evaluator.IsRoot();
    Object v1 = "j";
    Object v2 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v1));
    Object v3 = "tfoot";
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v2),((java.lang.String)v3));
    Object v5 = org.jsoup.select.Selector.select(((org.jsoup.select.Evaluator)v0),((org.jsoup.nodes.Element)v4));
    Object v6 = "s";
    Object v7 = org.jsoup.helper.StringUtil.join(((java.util.Collection)v5),((java.lang.String)v6));
    org.junit.Assert.assertEquals((Object)("<j></j>"), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = 13;
    Object v1 = new java.lang.StringBuilder((((java.lang.Integer)v0).intValue()));
    Object v2 = "colgroup";
    Object v3 = 0;
    Object v4 = ((java.lang.StringBuilder)v1).lastIndexOf(((java.lang.String)v2),(((java.lang.Integer)v3).intValue()));
    Object v5 = "</";
    Object v6 = false;
    org.jsoup.helper.StringUtil.appendNormalisedWhitespace(((java.lang.StringBuilder)v1),((java.lang.String)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = "SKIP_ENTIRELY";
    Object v1 = org.jsoup.helper.StringUtil.isBlank(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "s";
    Object v2 = org.jsoup.helper.StringUtil.join(((java.util.Iterator)v0),((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = 13;
    Object v1 = new java.lang.StringBuilder((((java.lang.Integer)v0).intValue()));
    Object v2 = "";
    Object v3 = true;
    org.jsoup.helper.StringUtil.appendNormalisedWhitespace(((java.lang.StringBuilder)v1),((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = 1;
    Object v1 = org.jsoup.helper.StringUtil.isInvisibleChar((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = "O";
    Object v1 = "html";
    Object v2 = org.jsoup.helper.StringUtil.resolve(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)(""), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = 3;
    Object v1 = org.jsoup.helper.StringUtil.isInvisibleChar((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = "th";
    Object v1 = org.jsoup.helper.StringUtil.isNumeric(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = 2;
    Object v1 = org.jsoup.helper.StringUtil.isInvisibleChar((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = "t$oot";
    Object v1 = org.jsoup.helper.StringUtil.isNumeric(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = "bo";
    Object v1 = org.jsoup.helper.StringUtil.isNumeric(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = 27;
    Object v1 = org.jsoup.helper.StringUtil.padding((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertEquals((Object)("                           "), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = "capt;on";
    Object v1 = org.jsoup.helper.StringUtil.isNumeric(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = "";
    Object v1 = org.jsoup.helper.StringUtil.isBlank(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(true), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = "col,roup";
    Object v1 = org.jsoup.helper.StringUtil.isBlank(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = "tr";
    Object v1 = new java.lang.String[]{"scrip","foot_er"};
    Object v2 = org.jsoup.helper.StringUtil.in(((java.lang.String)v0),((java.lang.String[])v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = org.jsoup.helper.StringUtil.stringBuilder();
    Object v1 = "action";
    Object v2 = true;
    org.jsoup.helper.StringUtil.appendNormalisedWhitespace(((java.lang.StringBuilder)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new java.lang.String[]{"(","\"",""};
    Object v1 = "tCble";
    Object v2 = org.jsoup.helper.StringUtil.join(((java.lang.String[])v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("(tCble\"tCble"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = "capton";
    Object v1 = new java.lang.String[]{"menu","body"};
    Object v2 = org.jsoup.helper.StringUtil.in(((java.lang.String)v0),((java.lang.String[])v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = "html";
    Object v1 = org.jsoup.helper.StringUtil.isNumeric(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = -31;
    Object v1 = org.jsoup.helper.StringUtil.isActuallyWhitespace((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = -44;
    Object v1 = org.jsoup.helper.StringUtil.padding((((java.lang.Integer)v0).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = "Zefault";
    Object v1 = org.jsoup.helper.StringUtil.isBlank(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = 13;
    Object v1 = new java.lang.StringBuilder((((java.lang.Integer)v0).intValue()));
    Object v2 = "h1";
    Object v3 = true;
    org.jsoup.helper.StringUtil.appendNormalisedWhitespace(((java.lang.StringBuilder)v1),((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = "reverse";
    Object v1 = org.jsoup.helper.StringUtil.isNumeric(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = 16;
    Object v1 = org.jsoup.helper.StringUtil.isInvisibleChar((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new org.jsoup.select.Evaluator.IsRoot();
    Object v1 = "j";
    Object v2 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v1));
    Object v3 = "tfoot";
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v2),((java.lang.String)v3));
    Object v5 = org.jsoup.select.Selector.select(((org.jsoup.select.Evaluator)v0),((org.jsoup.nodes.Element)v4));
    Object v6 = "figure";
    Object v7 = org.jsoup.helper.StringUtil.join(((java.util.Collection)v5),((java.lang.String)v6));
    org.junit.Assert.assertEquals((Object)("<j></j>"), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = "body";
    Object v1 = "tabl";
    Object v2 = org.jsoup.helper.StringUtil.resolve(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)(""), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = "basefon";
    Object v1 = new java.lang.String[]{"Bbody"};
    Object v2 = org.jsoup.helper.StringUtil.inSorted(((java.lang.String)v0),((java.lang.String[])v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = "]";
    Object v1 = org.jsoup.helper.StringUtil.normaliseWhitespace(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("]"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = "comZmand";
    Object v1 = org.jsoup.helper.StringUtil.isBlank(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = 4;
    Object v1 = org.jsoup.helper.StringUtil.padding((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertEquals((Object)("    "), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = "nofra";
    Object v1 = new java.lang.String[]{};
    Object v2 = org.jsoup.helper.StringUtil.in(((java.lang.String)v0),((java.lang.String[])v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = -9;
    Object v1 = org.jsoup.helper.StringUtil.padding((((java.lang.Integer)v0).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = 1;
    Object v1 = org.jsoup.helper.StringUtil.padding((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertEquals((Object)(" "), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = 19;
    Object v1 = org.jsoup.helper.StringUtil.padding((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertEquals((Object)("                   "), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = 13;
    Object v1 = new java.lang.StringBuilder((((java.lang.Integer)v0).intValue()));
    Object v2 = "tSbody";
    Object v3 = true;
    org.jsoup.helper.StringUtil.appendNormalisedWhitespace(((java.lang.StringBuilder)v1),((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = "";
    Object v1 = org.jsoup.helper.StringUtil.isNumeric(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = 1;
    Object v1 = org.jsoup.helper.StringUtil.isActuallyWhitespace((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = "track";
    Object v1 = org.jsoup.helper.StringUtil.isBlank(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = -19;
    Object v1 = org.jsoup.helper.StringUtil.padding((((java.lang.Integer)v0).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = 2;
    Object v1 = org.jsoup.helper.StringUtil.isActuallyWhitespace((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = "tt";
    Object v1 = new java.lang.String[]{"style","","body"};
    Object v2 = org.jsoup.helper.StringUtil.inSorted(((java.lang.String)v0),((java.lang.String[])v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = "th";
    Object v1 = org.jsoup.helper.StringUtil.isBlank(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = "headN";
    Object v1 = org.jsoup.helper.StringUtil.isBlank(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = "mname";
    Object v1 = new java.lang.String[]{"html"};
    Object v2 = org.jsoup.helper.StringUtil.inSorted(((java.lang.String)v0),((java.lang.String[])v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = -13;
    Object v1 = org.jsoup.helper.StringUtil.padding((((java.lang.Integer)v0).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = "device";
    Object v1 = org.jsoup.helper.StringUtil.isNumeric(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = 13;
    Object v1 = new java.lang.StringBuilder((((java.lang.Integer)v0).intValue()));
    Object v2 = "table";
    Object v3 = 0;
    Object v4 = ((java.lang.StringBuilder)v1).lastIndexOf(((java.lang.String)v2),(((java.lang.Integer)v3).intValue()));
    Object v5 = "html";
    Object v6 = true;
    org.jsoup.helper.StringUtil.appendNormalisedWhitespace(((java.lang.StringBuilder)v1),((java.lang.String)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = "t";
    Object v1 = new java.lang.String[]{"c#olgroup"};
    Object v2 = org.jsoup.helper.StringUtil.inSorted(((java.lang.String)v0),((java.lang.String[])v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = "tr";
    Object v1 = org.jsoup.helper.StringUtil.isNumeric(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = 0;
    Object v1 = org.jsoup.helper.StringUtil.isActuallyWhitespace((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = "l]ink";
    Object v1 = org.jsoup.helper.StringUtil.isNumeric(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = "imYg";
    Object v1 = new java.lang.String[]{"html","Rhtml"};
    Object v2 = org.jsoup.helper.StringUtil.inSorted(((java.lang.String)v0),((java.lang.String[])v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = -4;
    Object v1 = org.jsoup.helper.StringUtil.isInvisibleChar((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = "UTF-16";
    Object v1 = org.jsoup.helper.StringUtil.isBlank(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = "t%";
    Object v1 = new java.lang.String[]{"detBils","titlen"};
    Object v2 = org.jsoup.helper.StringUtil.in(((java.lang.String)v0),((java.lang.String[])v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = 20;
    Object v1 = org.jsoup.helper.StringUtil.isActuallyWhitespace((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = 1;
    Object v1 = org.jsoup.helper.StringUtil.isWhitespace((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = "tbody";
    Object v1 = org.jsoup.helper.StringUtil.normaliseWhitespace(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("tbody"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = "hml";
    Object v1 = new java.lang.String[]{"aoea","table","optio"};
    Object v2 = org.jsoup.helper.StringUtil.inSorted(((java.lang.String)v0),((java.lang.String[])v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = "html";
    Object v1 = new java.lang.String[]{};
    Object v2 = org.jsoup.helper.StringUtil.inSorted(((java.lang.String)v0),((java.lang.String[])v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = 0;
    Object v1 = org.jsoup.helper.StringUtil.padding((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertEquals((Object)(""), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = "!u";
    Object v1 = new java.lang.String[]{"ummary","xmp"};
    Object v2 = org.jsoup.helper.StringUtil.in(((java.lang.String)v0),((java.lang.String[])v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = "bgsound";
    Object v1 = new java.lang.String[]{"dd"};
    Object v2 = org.jsoup.helper.StringUtil.inSorted(((java.lang.String)v0),((java.lang.String[])v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = -40;
    Object v1 = org.jsoup.helper.StringUtil.isInvisibleChar((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = 7;
    Object v1 = org.jsoup.helper.StringUtil.padding((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertEquals((Object)("       "), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = "body";
    Object v1 = new java.lang.String[]{};
    Object v2 = org.jsoup.helper.StringUtil.inSorted(((java.lang.String)v0),((java.lang.String[])v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = "base";
    Object v1 = org.jsoup.helper.StringUtil.isNumeric(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new java.lang.String[]{"norames","nobr"};
    Object v1 = "html";
    Object v2 = org.jsoup.helper.StringUtil.join(((java.lang.String[])v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("norameshtmlnobr"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = "t";
    Object v1 = org.jsoup.helper.StringUtil.isBlank(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = org.jsoup.helper.StringUtil.stringBuilder();
    Object v1 = "br";
    Object v2 = false;
    org.jsoup.helper.StringUtil.appendNormalisedWhitespace(((java.lang.StringBuilder)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = 13;
    Object v1 = new java.lang.StringBuilder((((java.lang.Integer)v0).intValue()));
    Object v2 = ((java.lang.StringBuilder)v1).reverse();
    Object v3 = "table";
    Object v4 = false;
    org.jsoup.helper.StringUtil.appendNormalisedWhitespace(((java.lang.StringBuilder)v1),((java.lang.String)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = "col";
    Object v1 = new java.lang.String[]{"blsound"};
    Object v2 = org.jsoup.helper.StringUtil.inSorted(((java.lang.String)v0),((java.lang.String[])v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = "Lp";
    Object v1 = org.jsoup.helper.StringUtil.isBlank(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = 3;
    Object v1 = org.jsoup.helper.StringUtil.isActuallyWhitespace((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = "caption";
    Object v1 = org.jsoup.helper.StringUtil.isBlank(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }
}
