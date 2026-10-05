package org.jsoup.parser;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = "te";
    Object v1 = true;
    Object v2 = true;
    Object v3 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0),((org.jsoup.parser.ParseSettings)v3));
    Object v5 = ((org.jsoup.parser.Tag)v4).isSelfClosing();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = "te";
    Object v1 = true;
    Object v2 = true;
    Object v3 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0),((org.jsoup.parser.ParseSettings)v3));
    Object v5 = ((org.jsoup.parser.Tag)v4).isInline();
    org.junit.Assert.assertEquals((Object)(true), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = "te";
    Object v1 = true;
    Object v2 = true;
    Object v3 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0),((org.jsoup.parser.ParseSettings)v3));
    Object v5 = ((org.jsoup.parser.Tag)v4).isData();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = true;
    Object v2 = true;
    Object v3 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0),((org.jsoup.parser.ParseSettings)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = "te";
    Object v1 = true;
    Object v2 = true;
    Object v3 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0),((org.jsoup.parser.ParseSettings)v3));
    Object v5 = true;
    Object v6 = true;
    Object v7 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = ((org.jsoup.parser.Tag)v4).equals(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = "thead";
    Object v1 = true;
    Object v2 = true;
    Object v3 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "thead";
    Object v5 = ((org.jsoup.parser.ParseSettings)v3).normalizeTag(((java.lang.String)v4));
    Object v6 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0),((org.jsoup.parser.ParseSettings)v3));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = "thead";
    Object v1 = true;
    Object v2 = true;
    Object v3 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "thead";
    Object v5 = ((org.jsoup.parser.ParseSettings)v3).normalizeTag(((java.lang.String)v4));
    Object v6 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0),((org.jsoup.parser.ParseSettings)v3));
    Object v7 = ((org.jsoup.parser.Tag)v6).hashCode();
    org.junit.Assert.assertEquals((Object)(181412115), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = "thead";
    Object v1 = true;
    Object v2 = true;
    Object v3 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "thead";
    Object v5 = ((org.jsoup.parser.ParseSettings)v3).normalizeTag(((java.lang.String)v4));
    Object v6 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0),((org.jsoup.parser.ParseSettings)v3));
    Object v7 = ((org.jsoup.parser.Tag)v6).isKnownTag();
    Object v8 = ((org.jsoup.parser.Tag)v6).isBlock();
    org.junit.Assert.assertEquals((Object)(true), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = "th1";
    Object v1 = true;
    Object v2 = true;
    Object v3 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0),((org.jsoup.parser.ParseSettings)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = "th1";
    Object v1 = true;
    Object v2 = true;
    Object v3 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0),((org.jsoup.parser.ParseSettings)v3));
    Object v5 = ((org.jsoup.parser.Tag)v4).toString();
    org.junit.Assert.assertEquals((Object)("th1"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = "th1";
    Object v1 = true;
    Object v2 = true;
    Object v3 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0),((org.jsoup.parser.ParseSettings)v3));
    Object v5 = ((org.jsoup.parser.Tag)v4).isInline();
    org.junit.Assert.assertEquals((Object)(true), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = "k]>";
    Object v1 = true;
    Object v2 = true;
    Object v3 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "EndT";
    Object v5 = ((org.jsoup.parser.ParseSettings)v3).normalizeTag(((java.lang.String)v4));
    Object v6 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0),((org.jsoup.parser.ParseSettings)v3));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = "html";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = "thead";
    Object v1 = true;
    Object v2 = true;
    Object v3 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "thead";
    Object v5 = ((org.jsoup.parser.ParseSettings)v3).normalizeTag(((java.lang.String)v4));
    Object v6 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0),((org.jsoup.parser.ParseSettings)v3));
    Object v7 = ((org.jsoup.parser.Tag)v6).canContainBlock();
    org.junit.Assert.assertEquals((Object)(true), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = "thead";
    Object v1 = true;
    Object v2 = true;
    Object v3 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "thead";
    Object v5 = ((org.jsoup.parser.ParseSettings)v3).normalizeTag(((java.lang.String)v4));
    Object v6 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0),((org.jsoup.parser.ParseSettings)v3));
    Object v7 = "te";
    Object v8 = true;
    Object v9 = true;
    Object v10 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v8).booleanValue()),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v7),((org.jsoup.parser.ParseSettings)v10));
    Object v12 = ((org.jsoup.parser.Tag)v11).isData();
    Object v13 = ((org.jsoup.parser.Tag)v6).equals(((java.lang.Object)v12));
    Object v14 = ((org.jsoup.parser.Tag)v6).isData();
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = "html";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Tag)v1).isInline();
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = "th1";
    Object v1 = true;
    Object v2 = true;
    Object v3 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0),((org.jsoup.parser.ParseSettings)v3));
    Object v5 = ((org.jsoup.parser.Tag)v4).isKnownTag();
    Object v6 = "thead";
    Object v7 = true;
    Object v8 = true;
    Object v9 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v7).booleanValue()),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = "thead";
    Object v11 = ((org.jsoup.parser.ParseSettings)v9).normalizeTag(((java.lang.String)v10));
    Object v12 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v6),((org.jsoup.parser.ParseSettings)v9));
    Object v13 = ((org.jsoup.parser.Tag)v4).equals(((java.lang.Object)v12));
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = "th1";
    Object v1 = true;
    Object v2 = true;
    Object v3 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0),((org.jsoup.parser.ParseSettings)v3));
    Object v5 = ((org.jsoup.parser.Tag)v4).preserveWhitespace();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = "k]>";
    Object v1 = true;
    Object v2 = true;
    Object v3 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "EndT";
    Object v5 = ((org.jsoup.parser.ParseSettings)v3).normalizeTag(((java.lang.String)v4));
    Object v6 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0),((org.jsoup.parser.ParseSettings)v3));
    Object v7 = ((org.jsoup.parser.Tag)v6).hashCode();
    Object v8 = ((org.jsoup.parser.Tag)v6).isBlock();
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = "k]>";
    Object v1 = true;
    Object v2 = true;
    Object v3 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "EndT";
    Object v5 = ((org.jsoup.parser.ParseSettings)v3).normalizeTag(((java.lang.String)v4));
    Object v6 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0),((org.jsoup.parser.ParseSettings)v3));
    Object v7 = ((org.jsoup.parser.Tag)v6).isKnownTag();
    Object v8 = ((org.jsoup.parser.Tag)v6).isData();
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = "thead";
    Object v1 = true;
    Object v2 = true;
    Object v3 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "thead";
    Object v5 = ((org.jsoup.parser.ParseSettings)v3).normalizeTag(((java.lang.String)v4));
    Object v6 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0),((org.jsoup.parser.ParseSettings)v3));
    Object v7 = ((org.jsoup.parser.Tag)v6).isInline();
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = "html";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Tag)v1).setSelfClosing();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = "k]>";
    Object v1 = true;
    Object v2 = true;
    Object v3 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "EndT";
    Object v5 = ((org.jsoup.parser.ParseSettings)v3).normalizeTag(((java.lang.String)v4));
    Object v6 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0),((org.jsoup.parser.ParseSettings)v3));
    Object v7 = "thead";
    Object v8 = true;
    Object v9 = true;
    Object v10 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v8).booleanValue()),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = "thead";
    Object v12 = ((org.jsoup.parser.ParseSettings)v10).normalizeTag(((java.lang.String)v11));
    Object v13 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v7),((org.jsoup.parser.ParseSettings)v10));
    Object v14 = ((org.jsoup.parser.Tag)v6).equals(((java.lang.Object)v13));
    Object v15 = ((org.jsoup.parser.Tag)v6).hashCode();
    org.junit.Assert.assertEquals((Object)(426951948), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = "html";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "html";
    Object v3 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v2));
    Object v4 = ((org.jsoup.parser.Tag)v3).isInline();
    Object v5 = ((org.jsoup.parser.Tag)v1).equals(((java.lang.Object)v4));
    Object v6 = ((org.jsoup.parser.Tag)v1).isData();
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = "th1";
    Object v1 = true;
    Object v2 = true;
    Object v3 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0),((org.jsoup.parser.ParseSettings)v3));
    Object v5 = ((org.jsoup.parser.Tag)v4).isEmpty();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = "html";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Tag)v1).isBlock();
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = "thead";
    Object v1 = true;
    Object v2 = true;
    Object v3 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "thead";
    Object v5 = ((org.jsoup.parser.ParseSettings)v3).normalizeTag(((java.lang.String)v4));
    Object v6 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0),((org.jsoup.parser.ParseSettings)v3));
    Object v7 = ((org.jsoup.parser.Tag)v6).isData();
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = "k]>";
    Object v1 = true;
    Object v2 = true;
    Object v3 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "EndT";
    Object v5 = ((org.jsoup.parser.ParseSettings)v3).normalizeTag(((java.lang.String)v4));
    Object v6 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0),((org.jsoup.parser.ParseSettings)v3));
    Object v7 = "html";
    Object v8 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v7));
    Object v9 = ((org.jsoup.parser.Tag)v8).isInline();
    Object v10 = ((org.jsoup.parser.Tag)v6).equals(((java.lang.Object)v9));
    Object v11 = ((org.jsoup.parser.Tag)v6).formatAsBlock();
    org.junit.Assert.assertEquals((Object)(true), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = "html";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Tag)v1).hashCode();
    Object v3 = ((org.jsoup.parser.Tag)v1).isSelfClosing();
    org.junit.Assert.assertEquals((Object)(true), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = "k]>";
    Object v1 = true;
    Object v2 = true;
    Object v3 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "EndT";
    Object v5 = ((org.jsoup.parser.ParseSettings)v3).normalizeTag(((java.lang.String)v4));
    Object v6 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0),((org.jsoup.parser.ParseSettings)v3));
    Object v7 = ((org.jsoup.parser.Tag)v6).hashCode();
    Object v8 = "k]>";
    Object v9 = true;
    Object v10 = true;
    Object v11 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v9).booleanValue()),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = "EndT";
    Object v13 = ((org.jsoup.parser.ParseSettings)v11).normalizeTag(((java.lang.String)v12));
    Object v14 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v8),((org.jsoup.parser.ParseSettings)v11));
    Object v15 = ((org.jsoup.parser.Tag)v14).isKnownTag();
    Object v16 = ((org.jsoup.parser.Tag)v14).isData();
    Object v17 = ((org.jsoup.parser.Tag)v6).equals(((java.lang.Object)v16));
    org.junit.Assert.assertEquals((Object)(false), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = "thead";
    Object v1 = true;
    Object v2 = true;
    Object v3 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "thead";
    Object v5 = ((org.jsoup.parser.ParseSettings)v3).normalizeTag(((java.lang.String)v4));
    Object v6 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0),((org.jsoup.parser.ParseSettings)v3));
    Object v7 = ((org.jsoup.parser.Tag)v6).getName();
    org.junit.Assert.assertEquals((Object)("thead"), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = "html";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "th1";
    Object v3 = true;
    Object v4 = true;
    Object v5 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v2),((org.jsoup.parser.ParseSettings)v5));
    Object v7 = ((org.jsoup.parser.Tag)v6).isKnownTag();
    Object v8 = "thead";
    Object v9 = true;
    Object v10 = true;
    Object v11 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v9).booleanValue()),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = "thead";
    Object v13 = ((org.jsoup.parser.ParseSettings)v11).normalizeTag(((java.lang.String)v12));
    Object v14 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v8),((org.jsoup.parser.ParseSettings)v11));
    Object v15 = ((org.jsoup.parser.Tag)v6).equals(((java.lang.Object)v14));
    Object v16 = ((org.jsoup.parser.Tag)v1).equals(((java.lang.Object)v15));
    org.junit.Assert.assertEquals((Object)(false), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = "thead";
    Object v1 = true;
    Object v2 = true;
    Object v3 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "thead";
    Object v5 = ((org.jsoup.parser.ParseSettings)v3).normalizeTag(((java.lang.String)v4));
    Object v6 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0),((org.jsoup.parser.ParseSettings)v3));
    Object v7 = ((org.jsoup.parser.Tag)v6).hashCode();
    Object v8 = ((org.jsoup.parser.Tag)v6).toString();
    org.junit.Assert.assertEquals((Object)("thead"), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = "k]>";
    Object v1 = true;
    Object v2 = true;
    Object v3 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "EndT";
    Object v5 = ((org.jsoup.parser.ParseSettings)v3).normalizeTag(((java.lang.String)v4));
    Object v6 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0),((org.jsoup.parser.ParseSettings)v3));
    Object v7 = ((org.jsoup.parser.Tag)v6).isEmpty();
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = "thead";
    Object v1 = true;
    Object v2 = true;
    Object v3 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "thead";
    Object v5 = ((org.jsoup.parser.ParseSettings)v3).normalizeTag(((java.lang.String)v4));
    Object v6 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0),((org.jsoup.parser.ParseSettings)v3));
    Object v7 = "html";
    Object v8 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v7));
    Object v9 = ((org.jsoup.parser.Tag)v6).equals(((java.lang.Object)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = "(";
    Object v1 = true;
    Object v2 = true;
    Object v3 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0),((org.jsoup.parser.ParseSettings)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = "k]>";
    Object v1 = true;
    Object v2 = true;
    Object v3 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "EndT";
    Object v5 = ((org.jsoup.parser.ParseSettings)v3).normalizeTag(((java.lang.String)v4));
    Object v6 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0),((org.jsoup.parser.ParseSettings)v3));
    Object v7 = ((org.jsoup.parser.Tag)v6).hashCode();
    org.junit.Assert.assertEquals((Object)(426951948), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = "html";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Tag)v1).hashCode();
    Object v3 = "thead";
    Object v4 = true;
    Object v5 = true;
    Object v6 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "thead";
    Object v8 = ((org.jsoup.parser.ParseSettings)v6).normalizeTag(((java.lang.String)v7));
    Object v9 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v3),((org.jsoup.parser.ParseSettings)v6));
    Object v10 = ((org.jsoup.parser.Tag)v9).isKnownTag();
    Object v11 = ((org.jsoup.parser.Tag)v9).isBlock();
    Object v12 = ((org.jsoup.parser.Tag)v1).equals(((java.lang.Object)v11));
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = "k]>";
    Object v1 = true;
    Object v2 = true;
    Object v3 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "EndT";
    Object v5 = ((org.jsoup.parser.ParseSettings)v3).normalizeTag(((java.lang.String)v4));
    Object v6 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0),((org.jsoup.parser.ParseSettings)v3));
    Object v7 = ((org.jsoup.parser.Tag)v6).isInline();
    org.junit.Assert.assertEquals((Object)(true), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = "(";
    Object v1 = true;
    Object v2 = true;
    Object v3 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0),((org.jsoup.parser.ParseSettings)v3));
    Object v5 = ((org.jsoup.parser.Tag)v4).isData();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = "html";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Tag)v1).isKnownTag();
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = "html";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "html";
    Object v3 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v2));
    Object v4 = ((org.jsoup.parser.Tag)v3).hashCode();
    Object v5 = ((org.jsoup.parser.Tag)v3).isSelfClosing();
    Object v6 = ((org.jsoup.parser.Tag)v1).equals(((java.lang.Object)v5));
    Object v7 = ((org.jsoup.parser.Tag)v1).isSelfClosing();
    org.junit.Assert.assertEquals((Object)(true), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = "html";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Tag)v1).hashCode();
    Object v3 = ((org.jsoup.parser.Tag)v1).isData();
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = "\"";
    Object v1 = org.jsoup.parser.Tag.isKnownTag(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = "th1";
    Object v1 = true;
    Object v2 = true;
    Object v3 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0),((org.jsoup.parser.ParseSettings)v3));
    Object v5 = ((org.jsoup.parser.Tag)v4).hashCode();
    org.junit.Assert.assertEquals((Object)(1294681885), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = true;
    Object v2 = true;
    Object v3 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "label";
    Object v5 = ((org.jsoup.parser.ParseSettings)v3).normalizeAttribute(((java.lang.String)v4));
    Object v6 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0),((org.jsoup.parser.ParseSettings)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = "(";
    Object v1 = true;
    Object v2 = true;
    Object v3 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0),((org.jsoup.parser.ParseSettings)v3));
    Object v5 = ((org.jsoup.parser.Tag)v4).isKnownTag();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = "Vction";
    Object v1 = true;
    Object v2 = true;
    Object v3 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0),((org.jsoup.parser.ParseSettings)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = "html";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Tag)v1).setSelfClosing();
    Object v3 = "k]>";
    Object v4 = true;
    Object v5 = true;
    Object v6 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "EndT";
    Object v8 = ((org.jsoup.parser.ParseSettings)v6).normalizeTag(((java.lang.String)v7));
    Object v9 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v3),((org.jsoup.parser.ParseSettings)v6));
    Object v10 = ((org.jsoup.parser.Tag)v9).hashCode();
    Object v11 = ((org.jsoup.parser.Tag)v2).equals(((java.lang.Object)v10));
    Object v12 = ((org.jsoup.parser.Tag)v2).isInline();
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = "html";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "\"";
    Object v3 = org.jsoup.parser.Tag.isKnownTag(((java.lang.String)v2));
    Object v4 = ((org.jsoup.parser.Tag)v1).equals(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = "html";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Tag)v1).setSelfClosing();
    Object v3 = ((org.jsoup.parser.Tag)v2).isInline();
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = "k]>";
    Object v1 = true;
    Object v2 = true;
    Object v3 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "EndT";
    Object v5 = ((org.jsoup.parser.ParseSettings)v3).normalizeTag(((java.lang.String)v4));
    Object v6 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0),((org.jsoup.parser.ParseSettings)v3));
    Object v7 = ((org.jsoup.parser.Tag)v6).isSelfClosing();
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = "(";
    Object v1 = true;
    Object v2 = true;
    Object v3 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0),((org.jsoup.parser.ParseSettings)v3));
    Object v5 = ((org.jsoup.parser.Tag)v4).isKnownTag();
    Object v6 = ((org.jsoup.parser.Tag)v4).isSelfClosing();
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = "k]>";
    Object v1 = true;
    Object v2 = true;
    Object v3 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "EndT";
    Object v5 = ((org.jsoup.parser.ParseSettings)v3).normalizeTag(((java.lang.String)v4));
    Object v6 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0),((org.jsoup.parser.ParseSettings)v3));
    Object v7 = "(";
    Object v8 = true;
    Object v9 = true;
    Object v10 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v8).booleanValue()),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v7),((org.jsoup.parser.ParseSettings)v10));
    Object v12 = ((org.jsoup.parser.Tag)v6).equals(((java.lang.Object)v11));
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = "(";
    Object v1 = true;
    Object v2 = true;
    Object v3 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0),((org.jsoup.parser.ParseSettings)v3));
    Object v5 = ((org.jsoup.parser.Tag)v4).isInline();
    org.junit.Assert.assertEquals((Object)(true), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = "html";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "th1";
    Object v3 = true;
    Object v4 = true;
    Object v5 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v2),((org.jsoup.parser.ParseSettings)v5));
    Object v7 = ((org.jsoup.parser.Tag)v6).isInline();
    Object v8 = ((org.jsoup.parser.Tag)v1).equals(((java.lang.Object)v7));
    Object v9 = ((org.jsoup.parser.Tag)v1).isData();
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = "html";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Tag)v1).setSelfClosing();
    Object v3 = ((org.jsoup.parser.Tag)v2).isKnownTag();
    Object v4 = "thead";
    Object v5 = true;
    Object v6 = true;
    Object v7 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = "thead";
    Object v9 = ((org.jsoup.parser.ParseSettings)v7).normalizeTag(((java.lang.String)v8));
    Object v10 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v4),((org.jsoup.parser.ParseSettings)v7));
    Object v11 = ((org.jsoup.parser.Tag)v10).isInline();
    Object v12 = ((org.jsoup.parser.Tag)v2).equals(((java.lang.Object)v11));
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = "th1";
    Object v1 = true;
    Object v2 = true;
    Object v3 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0),((org.jsoup.parser.ParseSettings)v3));
    Object v5 = "(";
    Object v6 = true;
    Object v7 = true;
    Object v8 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v6).booleanValue()),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v5),((org.jsoup.parser.ParseSettings)v8));
    Object v10 = ((org.jsoup.parser.Tag)v9).isInline();
    Object v11 = ((org.jsoup.parser.Tag)v4).equals(((java.lang.Object)v10));
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = "html";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Tag)v1).isData();
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = "html";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Tag)v1).setSelfClosing();
    Object v3 = "th1";
    Object v4 = true;
    Object v5 = true;
    Object v6 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v3),((org.jsoup.parser.ParseSettings)v6));
    Object v8 = "(";
    Object v9 = true;
    Object v10 = true;
    Object v11 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v9).booleanValue()),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v8),((org.jsoup.parser.ParseSettings)v11));
    Object v13 = ((org.jsoup.parser.Tag)v12).isInline();
    Object v14 = ((org.jsoup.parser.Tag)v7).equals(((java.lang.Object)v13));
    Object v15 = ((org.jsoup.parser.Tag)v2).equals(((java.lang.Object)v14));
    Object v16 = ((org.jsoup.parser.Tag)v2).isSelfClosing();
    org.junit.Assert.assertEquals((Object)(true), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = "html";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Tag)v1).setSelfClosing();
    Object v3 = ((org.jsoup.parser.Tag)v2).hashCode();
    Object v4 = ((org.jsoup.parser.Tag)v2).isData();
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = "(";
    Object v1 = true;
    Object v2 = true;
    Object v3 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0),((org.jsoup.parser.ParseSettings)v3));
    Object v5 = "html";
    Object v6 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v5));
    Object v7 = ((org.jsoup.parser.Tag)v6).hashCode();
    Object v8 = ((org.jsoup.parser.Tag)v6).isData();
    Object v9 = ((org.jsoup.parser.Tag)v4).equals(((java.lang.Object)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = "tfogot";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = "(";
    Object v1 = true;
    Object v2 = true;
    Object v3 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0),((org.jsoup.parser.ParseSettings)v3));
    Object v5 = ((org.jsoup.parser.Tag)v4).isFormListed();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = "thead";
    Object v1 = true;
    Object v2 = true;
    Object v3 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "thead";
    Object v5 = ((org.jsoup.parser.ParseSettings)v3).normalizeTag(((java.lang.String)v4));
    Object v6 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0),((org.jsoup.parser.ParseSettings)v3));
    Object v7 = "thead";
    Object v8 = true;
    Object v9 = true;
    Object v10 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v8).booleanValue()),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = "thead";
    Object v12 = ((org.jsoup.parser.ParseSettings)v10).normalizeTag(((java.lang.String)v11));
    Object v13 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v7),((org.jsoup.parser.ParseSettings)v10));
    Object v14 = "html";
    Object v15 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v14));
    Object v16 = ((org.jsoup.parser.Tag)v13).equals(((java.lang.Object)v15));
    Object v17 = ((org.jsoup.parser.Tag)v6).equals(((java.lang.Object)v16));
    org.junit.Assert.assertEquals((Object)(false), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = "thead";
    Object v1 = true;
    Object v2 = true;
    Object v3 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "thead";
    Object v5 = ((org.jsoup.parser.ParseSettings)v3).normalizeTag(((java.lang.String)v4));
    Object v6 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0),((org.jsoup.parser.ParseSettings)v3));
    Object v7 = ((org.jsoup.parser.Tag)v6).isBlock();
    org.junit.Assert.assertEquals((Object)(true), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = "tfogot";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Tag)v1).isInline();
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = "tfogot";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Tag)v1).hashCode();
    org.junit.Assert.assertEquals((Object)(-265027569), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = "html";
    Object v1 = true;
    Object v2 = true;
    Object v3 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0),((org.jsoup.parser.ParseSettings)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = "html";
    Object v1 = true;
    Object v2 = true;
    Object v3 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0),((org.jsoup.parser.ParseSettings)v3));
    Object v5 = ((org.jsoup.parser.Tag)v4).isSelfClosing();
    org.junit.Assert.assertEquals((Object)(true), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = "Could not parse nth-inde '%s': unexpected format";
    Object v1 = true;
    Object v2 = true;
    Object v3 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0),((org.jsoup.parser.ParseSettings)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = "tfogot";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Tag)v1).preserveWhitespace();
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = "th1";
    Object v1 = true;
    Object v2 = true;
    Object v3 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0),((org.jsoup.parser.ParseSettings)v3));
    Object v5 = ((org.jsoup.parser.Tag)v4).isData();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = "html";
    Object v1 = true;
    Object v2 = true;
    Object v3 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0),((org.jsoup.parser.ParseSettings)v3));
    Object v5 = ((org.jsoup.parser.Tag)v4).setSelfClosing();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = "html";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Tag)v1).setSelfClosing();
    Object v3 = ((org.jsoup.parser.Tag)v2).isData();
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = "tfogot";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Tag)v1).hashCode();
    Object v3 = ((org.jsoup.parser.Tag)v1).isSelfClosing();
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = "html";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Tag)v1).setSelfClosing();
    Object v3 = ((org.jsoup.parser.Tag)v2).preserveWhitespace();
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = "html";
    Object v1 = true;
    Object v2 = true;
    Object v3 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0),((org.jsoup.parser.ParseSettings)v3));
    Object v5 = ((org.jsoup.parser.Tag)v4).setSelfClosing();
    Object v6 = "th1";
    Object v7 = true;
    Object v8 = true;
    Object v9 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v7).booleanValue()),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v6),((org.jsoup.parser.ParseSettings)v9));
    Object v11 = ((org.jsoup.parser.Tag)v10).preserveWhitespace();
    Object v12 = ((org.jsoup.parser.Tag)v5).equals(((java.lang.Object)v11));
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = "thead";
    Object v1 = true;
    Object v2 = true;
    Object v3 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "thead";
    Object v5 = ((org.jsoup.parser.ParseSettings)v3).normalizeTag(((java.lang.String)v4));
    Object v6 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0),((org.jsoup.parser.ParseSettings)v3));
    Object v7 = ((org.jsoup.parser.Tag)v6).isEmpty();
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = "h4";
    Object v1 = true;
    Object v2 = true;
    Object v3 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0),((org.jsoup.parser.ParseSettings)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = "sourc+e";
    Object v1 = true;
    Object v2 = true;
    Object v3 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0),((org.jsoup.parser.ParseSettings)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = "tr";
    Object v1 = org.jsoup.parser.Tag.isKnownTag(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(true), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = "html";
    Object v1 = true;
    Object v2 = true;
    Object v3 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0),((org.jsoup.parser.ParseSettings)v3));
    Object v5 = ((org.jsoup.parser.Tag)v4).hashCode();
    Object v6 = ((org.jsoup.parser.Tag)v4).isFormSubmittable();
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = "Could not parse nth-inde '%s': unexpected format";
    Object v1 = true;
    Object v2 = true;
    Object v3 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0),((org.jsoup.parser.ParseSettings)v3));
    Object v5 = ((org.jsoup.parser.Tag)v4).isSelfClosing();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = "html";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Tag)v1).isKnownTag();
    Object v3 = ((org.jsoup.parser.Tag)v1).isFormListed();
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = "sourc+e";
    Object v1 = true;
    Object v2 = true;
    Object v3 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0),((org.jsoup.parser.ParseSettings)v3));
    Object v5 = "tfogot";
    Object v6 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v5));
    Object v7 = ((org.jsoup.parser.Tag)v6).isInline();
    Object v8 = ((org.jsoup.parser.Tag)v4).equals(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = "T";
    Object v1 = true;
    Object v2 = true;
    Object v3 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0),((org.jsoup.parser.ParseSettings)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = "tfogot";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Tag)v1).canContainBlock();
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = "option";
    Object v1 = true;
    Object v2 = true;
    Object v3 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0),((org.jsoup.parser.ParseSettings)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = "html";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Tag)v1).setSelfClosing();
    Object v3 = ((org.jsoup.parser.Tag)v2).isSelfClosing();
    org.junit.Assert.assertEquals((Object)(true), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = "html";
    Object v1 = true;
    Object v2 = true;
    Object v3 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0),((org.jsoup.parser.ParseSettings)v3));
    Object v5 = ((org.jsoup.parser.Tag)v4).isData();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = "html";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "html";
    Object v3 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v2));
    Object v4 = "html";
    Object v5 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v4));
    Object v6 = ((org.jsoup.parser.Tag)v5).hashCode();
    Object v7 = ((org.jsoup.parser.Tag)v5).isSelfClosing();
    Object v8 = ((org.jsoup.parser.Tag)v3).equals(((java.lang.Object)v7));
    Object v9 = ((org.jsoup.parser.Tag)v3).isSelfClosing();
    Object v10 = ((org.jsoup.parser.Tag)v1).equals(((java.lang.Object)v9));
    Object v11 = ((org.jsoup.parser.Tag)v1).normalName();
    org.junit.Assert.assertEquals((Object)("html"), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = "thead";
    Object v1 = true;
    Object v2 = true;
    Object v3 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "thead";
    Object v5 = ((org.jsoup.parser.ParseSettings)v3).normalizeTag(((java.lang.String)v4));
    Object v6 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0),((org.jsoup.parser.ParseSettings)v3));
    Object v7 = ((org.jsoup.parser.Tag)v6).isKnownTag();
    Object v8 = "te";
    Object v9 = true;
    Object v10 = true;
    Object v11 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v9).booleanValue()),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v8),((org.jsoup.parser.ParseSettings)v11));
    Object v13 = ((org.jsoup.parser.Tag)v12).isInline();
    Object v14 = ((org.jsoup.parser.Tag)v6).equals(((java.lang.Object)v13));
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = "html";
    Object v1 = true;
    Object v2 = true;
    Object v3 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0),((org.jsoup.parser.ParseSettings)v3));
    Object v5 = ((org.jsoup.parser.Tag)v4).hashCode();
    Object v6 = ((org.jsoup.parser.Tag)v4).isData();
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = "command";
    Object v1 = true;
    Object v2 = true;
    Object v3 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0),((org.jsoup.parser.ParseSettings)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = "Vction";
    Object v1 = true;
    Object v2 = true;
    Object v3 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0),((org.jsoup.parser.ParseSettings)v3));
    Object v5 = "html";
    Object v6 = true;
    Object v7 = true;
    Object v8 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v6).booleanValue()),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v5),((org.jsoup.parser.ParseSettings)v8));
    Object v10 = ((org.jsoup.parser.Tag)v9).isSelfClosing();
    Object v11 = ((org.jsoup.parser.Tag)v4).equals(((java.lang.Object)v10));
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = "tfogot";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Tag)v1).isEmpty();
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = "thead";
    Object v1 = true;
    Object v2 = true;
    Object v3 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "thead";
    Object v5 = ((org.jsoup.parser.ParseSettings)v3).normalizeTag(((java.lang.String)v4));
    Object v6 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0),((org.jsoup.parser.ParseSettings)v3));
    Object v7 = ((org.jsoup.parser.Tag)v6).preserveWhitespace();
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = "tfogot";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Tag)v1).isData();
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = "html";
    Object v1 = true;
    Object v2 = true;
    Object v3 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0),((org.jsoup.parser.ParseSettings)v3));
    Object v5 = ((org.jsoup.parser.Tag)v4).isKnownTag();
    Object v6 = "tfogot";
    Object v7 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v6));
    Object v8 = ((org.jsoup.parser.Tag)v4).equals(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }
}
