package org.jsoup.safety;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = "htmF";
    Object v2 = ((org.jsoup.safety.Whitelist)v0).getEnforcedAttributes(((java.lang.String)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = new java.lang.String[]{};
    Object v2 = ((org.jsoup.safety.Whitelist)v0).addTags(((java.lang.String[])v1));
    Object v3 = "ccaps";
    Object v4 = ((org.jsoup.safety.Whitelist)v0).getEnforcedAttributes(((java.lang.String)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.simpleText();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.simpleText();
    Object v1 = "apaciS";
    Object v2 = new java.lang.String[]{};
    Object v3 = ((org.jsoup.safety.Whitelist)v0).addAttributes(((java.lang.String)v1),((java.lang.String[])v2));
    Object v4 = "plaintext";
    Object v5 = "\n";
    Object v6 = "opt/ion";
    Object v7 = ((org.jsoup.safety.Whitelist)v0).addEnforcedAttribute(((java.lang.String)v4),((java.lang.String)v5),((java.lang.String)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.simpleText();
    Object v1 = "apaciS";
    Object v2 = new java.lang.String[]{};
    Object v3 = ((org.jsoup.safety.Whitelist)v0).addAttributes(((java.lang.String)v1),((java.lang.String[])v2));
    Object v4 = "plaintext";
    Object v5 = "\n";
    Object v6 = "opt/ion";
    Object v7 = ((org.jsoup.safety.Whitelist)v0).addEnforcedAttribute(((java.lang.String)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = "2lm";
    Object v9 = ">data-";
    Object v10 = "Oacut}";
    Object v11 = ((org.jsoup.safety.Whitelist)v7).addEnforcedAttribute(((java.lang.String)v8),((java.lang.String)v9),((java.lang.String)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.simpleText();
    Object v1 = new java.lang.String[]{"td"};
    Object v2 = ((org.jsoup.safety.Whitelist)v0).addTags(((java.lang.String[])v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.simpleText();
    Object v1 = new java.lang.String[]{"td"};
    Object v2 = ((org.jsoup.safety.Whitelist)v0).addTags(((java.lang.String[])v1));
    Object v3 = new java.lang.String[]{};
    Object v4 = ((org.jsoup.safety.Whitelist)v2).addTags(((java.lang.String[])v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.simpleText();
    Object v1 = new java.lang.String[]{"td"};
    Object v2 = ((org.jsoup.safety.Whitelist)v0).addTags(((java.lang.String[])v1));
    Object v3 = new java.lang.String[]{};
    Object v4 = ((org.jsoup.safety.Whitelist)v2).addTags(((java.lang.String[])v3));
    Object v5 = "b";
    Object v6 = "table";
    Object v7 = org.jsoup.Jsoup.parse(((java.lang.String)v6));
    Object v8 = "t-h";
    Object v9 = "ol\\";
    Object v10 = new org.jsoup.nodes.Attribute(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = ((org.jsoup.nodes.Attribute)v10).clone();
    Object v12 = ((org.jsoup.safety.Whitelist)v4).isSafeAttribute(((java.lang.String)v5),((org.jsoup.nodes.Element)v7),((org.jsoup.nodes.Attribute)v10));
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.simpleText();
    Object v1 = new java.lang.String[]{"td"};
    Object v2 = ((org.jsoup.safety.Whitelist)v0).addTags(((java.lang.String[])v1));
    Object v3 = "optgrou";
    Object v4 = new java.lang.String[]{};
    Object v5 = ((org.jsoup.safety.Whitelist)v2).addAttributes(((java.lang.String)v3),((java.lang.String[])v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.simpleText();
    Object v1 = "sript";
    Object v2 = "co";
    Object v3 = new java.lang.String[]{"html","html","bgsund"};
    Object v4 = ((org.jsoup.safety.Whitelist)v0).addProtocols(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String[])v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.simpleText();
    Object v1 = new java.lang.String[]{"td"};
    Object v2 = ((org.jsoup.safety.Whitelist)v0).addTags(((java.lang.String[])v1));
    Object v3 = true;
    Object v4 = ((org.jsoup.safety.Whitelist)v2).preserveRelativeLinks((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = "d";
    Object v6 = "DownLeftTeeVector";
    Object v7 = new java.lang.String[]{"ge","w","figure"};
    Object v8 = ((org.jsoup.safety.Whitelist)v2).addProtocols(((java.lang.String)v5),((java.lang.String)v6),((java.lang.String[])v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.simpleText();
    Object v1 = new java.lang.String[]{"td"};
    Object v2 = ((org.jsoup.safety.Whitelist)v0).addTags(((java.lang.String[])v1));
    Object v3 = "optgrou";
    Object v4 = new java.lang.String[]{};
    Object v5 = ((org.jsoup.safety.Whitelist)v2).addAttributes(((java.lang.String)v3),((java.lang.String[])v4));
    Object v6 = "body";
    Object v7 = new java.lang.String[]{"tbody"};
    Object v8 = ((org.jsoup.safety.Whitelist)v5).addAttributes(((java.lang.String)v6),((java.lang.String[])v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.simpleText();
    Object v1 = new java.lang.String[]{"td"};
    Object v2 = ((org.jsoup.safety.Whitelist)v0).addTags(((java.lang.String[])v1));
    Object v3 = new java.lang.String[]{};
    Object v4 = ((org.jsoup.safety.Whitelist)v2).addTags(((java.lang.String[])v3));
    Object v5 = "html";
    Object v6 = "htm1";
    Object v7 = "tbody";
    Object v8 = ((org.jsoup.safety.Whitelist)v4).addEnforcedAttribute(((java.lang.String)v5),((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = "";
    Object v10 = ((org.jsoup.safety.Whitelist)v4).isSafeTag(((java.lang.String)v9));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.simpleText();
    Object v1 = new java.lang.String[]{"td"};
    Object v2 = ((org.jsoup.safety.Whitelist)v0).addTags(((java.lang.String[])v1));
    Object v3 = "optgrou";
    Object v4 = new java.lang.String[]{};
    Object v5 = ((org.jsoup.safety.Whitelist)v2).addAttributes(((java.lang.String)v3),((java.lang.String[])v4));
    Object v6 = "ghtml";
    Object v7 = "table";
    Object v8 = org.jsoup.Jsoup.parse(((java.lang.String)v7));
    Object v9 = ((org.jsoup.nodes.Element)v8).getAllElements();
    Object v10 = "t-h";
    Object v11 = "ol\\";
    Object v12 = new org.jsoup.nodes.Attribute(((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = ((org.jsoup.safety.Whitelist)v5).isSafeAttribute(((java.lang.String)v6),((org.jsoup.nodes.Element)v8),((org.jsoup.nodes.Attribute)v12));
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.basicWithImages();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.simpleText();
    Object v1 = new java.lang.String[]{"td"};
    Object v2 = ((org.jsoup.safety.Whitelist)v0).addTags(((java.lang.String[])v1));
    Object v3 = new java.lang.String[]{};
    Object v4 = ((org.jsoup.safety.Whitelist)v2).addTags(((java.lang.String[])v3));
    Object v5 = "boady";
    Object v6 = "table";
    Object v7 = org.jsoup.Jsoup.parse(((java.lang.String)v6));
    Object v8 = "t-h";
    Object v9 = "ol\\";
    Object v10 = new org.jsoup.nodes.Attribute(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = ((org.jsoup.safety.Whitelist)v4).isSafeAttribute(((java.lang.String)v5),((org.jsoup.nodes.Element)v7),((org.jsoup.nodes.Attribute)v10));
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.simpleText();
    Object v1 = "apaciS";
    Object v2 = new java.lang.String[]{};
    Object v3 = ((org.jsoup.safety.Whitelist)v0).addAttributes(((java.lang.String)v1),((java.lang.String[])v2));
    Object v4 = "plaintext";
    Object v5 = "\n";
    Object v6 = "opt/ion";
    Object v7 = ((org.jsoup.safety.Whitelist)v0).addEnforcedAttribute(((java.lang.String)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = "Be";
    Object v9 = "htm";
    Object v10 = "tml";
    Object v11 = ((org.jsoup.safety.Whitelist)v7).addEnforcedAttribute(((java.lang.String)v8),((java.lang.String)v9),((java.lang.String)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.simpleText();
    Object v1 = new java.lang.String[]{"td"};
    Object v2 = ((org.jsoup.safety.Whitelist)v0).addTags(((java.lang.String[])v1));
    Object v3 = new java.lang.String[]{};
    Object v4 = ((org.jsoup.safety.Whitelist)v2).addTags(((java.lang.String[])v3));
    Object v5 = "SupersetEqual";
    Object v6 = ((org.jsoup.safety.Whitelist)v4).getEnforcedAttributes(((java.lang.String)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = org.jsoup.safety.Whitelist.simpleText();
    Object v1 = new java.lang.String[]{"td"};
    Object v2 = ((org.jsoup.safety.Whitelist)v0).addTags(((java.lang.String[])v1));
    Object v3 = new java.lang.String[]{};
    Object v4 = ((org.jsoup.safety.Whitelist)v2).addTags(((java.lang.String[])v3));
    Object v5 = "button";
    Object v6 = "";
    Object v7 = "noVrames";
    Object v8 = ((org.jsoup.safety.Whitelist)v4).addEnforcedAttribute(((java.lang.String)v5),((java.lang.String)v6),((java.lang.String)v7));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.simpleText();
    Object v1 = new java.lang.String[]{"td"};
    Object v2 = ((org.jsoup.safety.Whitelist)v0).addTags(((java.lang.String[])v1));
    Object v3 = new java.lang.String[]{};
    Object v4 = ((org.jsoup.safety.Whitelist)v2).addTags(((java.lang.String[])v3));
    Object v5 = "titlz";
    Object v6 = ((org.jsoup.safety.Whitelist)v4).getEnforcedAttributes(((java.lang.String)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.simpleText();
    Object v1 = "bas";
    Object v2 = new java.lang.String[]{};
    Object v3 = ((org.jsoup.safety.Whitelist)v0).addAttributes(((java.lang.String)v1),((java.lang.String[])v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.simpleText();
    Object v1 = new java.lang.String[]{"td"};
    Object v2 = ((org.jsoup.safety.Whitelist)v0).addTags(((java.lang.String[])v1));
    Object v3 = new java.lang.String[]{};
    Object v4 = ((org.jsoup.safety.Whitelist)v2).addTags(((java.lang.String[])v3));
    Object v5 = false;
    Object v6 = ((org.jsoup.safety.Whitelist)v4).preserveRelativeLinks((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "https";
    Object v8 = "table";
    Object v9 = org.jsoup.Jsoup.parse(((java.lang.String)v8));
    Object v10 = "t-h";
    Object v11 = "ol\\";
    Object v12 = new org.jsoup.nodes.Attribute(((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = ((org.jsoup.safety.Whitelist)v4).isSafeAttribute(((java.lang.String)v7),((org.jsoup.nodes.Element)v9),((org.jsoup.nodes.Attribute)v12));
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new org.jsoup.safety.Whitelist();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.simpleText();
    Object v1 = new java.lang.String[]{"td"};
    Object v2 = ((org.jsoup.safety.Whitelist)v0).addTags(((java.lang.String[])v1));
    Object v3 = "sime";
    Object v4 = "p";
    Object v5 = new java.lang.String[]{"tbody"};
    Object v6 = ((org.jsoup.safety.Whitelist)v2).addProtocols(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String[])v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new org.jsoup.safety.Whitelist();
    Object v1 = new java.lang.String[]{"tr","]laintext","html"};
    Object v2 = ((org.jsoup.safety.Whitelist)v0).addTags(((java.lang.String[])v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new org.jsoup.safety.Whitelist();
    Object v1 = new java.lang.String[]{"ht*l","tr"};
    Object v2 = ((org.jsoup.safety.Whitelist)v0).addTags(((java.lang.String[])v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.simpleText();
    Object v1 = true;
    Object v2 = ((org.jsoup.safety.Whitelist)v0).preserveRelativeLinks((((java.lang.Boolean)v1).booleanValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new org.jsoup.safety.Whitelist();
    Object v1 = "html";
    Object v2 = "table";
    Object v3 = org.jsoup.Jsoup.parse(((java.lang.String)v2));
    Object v4 = "t-h";
    Object v5 = "ol\\";
    Object v6 = new org.jsoup.nodes.Attribute(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((org.jsoup.safety.Whitelist)v0).isSafeAttribute(((java.lang.String)v1),((org.jsoup.nodes.Element)v3),((org.jsoup.nodes.Attribute)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.simpleText();
    Object v1 = "script";
    Object v2 = new java.lang.String[]{"bod","bgs"};
    Object v3 = ((org.jsoup.safety.Whitelist)v0).addAttributes(((java.lang.String)v1),((java.lang.String[])v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.simpleText();
    Object v1 = new java.lang.String[]{"td"};
    Object v2 = ((org.jsoup.safety.Whitelist)v0).addTags(((java.lang.String[])v1));
    Object v3 = "optgrou";
    Object v4 = new java.lang.String[]{};
    Object v5 = ((org.jsoup.safety.Whitelist)v2).addAttributes(((java.lang.String)v3),((java.lang.String[])v4));
    Object v6 = new java.lang.String[]{"String must not be empt","De|ta","inSut"};
    Object v7 = ((org.jsoup.safety.Whitelist)v5).addTags(((java.lang.String[])v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new org.jsoup.safety.Whitelist();
    Object v1 = "cXl";
    Object v2 = "table";
    Object v3 = org.jsoup.Jsoup.parse(((java.lang.String)v2));
    Object v4 = "t-h";
    Object v5 = "ol\\";
    Object v6 = new org.jsoup.nodes.Attribute(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Attribute)v6).html();
    Object v8 = ((org.jsoup.safety.Whitelist)v0).isSafeAttribute(((java.lang.String)v1),((org.jsoup.nodes.Element)v3),((org.jsoup.nodes.Attribute)v6));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.basic();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.relaxed();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.simpleText();
    Object v1 = new java.lang.String[]{"td"};
    Object v2 = ((org.jsoup.safety.Whitelist)v0).addTags(((java.lang.String[])v1));
    Object v3 = new java.lang.String[]{};
    Object v4 = ((org.jsoup.safety.Whitelist)v2).addTags(((java.lang.String[])v3));
    Object v5 = true;
    Object v6 = ((org.jsoup.safety.Whitelist)v4).preserveRelativeLinks((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "capion";
    Object v8 = "table";
    Object v9 = org.jsoup.Jsoup.parse(((java.lang.String)v8));
    Object v10 = "t-h";
    Object v11 = "ol\\";
    Object v12 = new org.jsoup.nodes.Attribute(((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = ((org.jsoup.safety.Whitelist)v4).isSafeAttribute(((java.lang.String)v7),((org.jsoup.nodes.Element)v9),((org.jsoup.nodes.Attribute)v12));
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new org.jsoup.safety.Whitelist();
    Object v1 = "basefontZ";
    Object v2 = "table";
    Object v3 = org.jsoup.Jsoup.parse(((java.lang.String)v2));
    Object v4 = "t-h";
    Object v5 = "ol\\";
    Object v6 = new org.jsoup.nodes.Attribute(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((org.jsoup.safety.Whitelist)v0).isSafeAttribute(((java.lang.String)v1),((org.jsoup.nodes.Element)v3),((org.jsoup.nodes.Attribute)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.simpleText();
    Object v1 = new java.lang.String[]{"td"};
    Object v2 = ((org.jsoup.safety.Whitelist)v0).addTags(((java.lang.String[])v1));
    Object v3 = new java.lang.String[]{};
    Object v4 = ((org.jsoup.safety.Whitelist)v2).addTags(((java.lang.String[])v3));
    Object v5 = "html";
    Object v6 = "table";
    Object v7 = org.jsoup.Jsoup.parse(((java.lang.String)v6));
    Object v8 = "t-h";
    Object v9 = "ol\\";
    Object v10 = new org.jsoup.nodes.Attribute(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = ((org.jsoup.safety.Whitelist)v4).isSafeAttribute(((java.lang.String)v5),((org.jsoup.nodes.Element)v7),((org.jsoup.nodes.Attribute)v10));
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.simpleText();
    Object v1 = new java.lang.String[]{"td"};
    Object v2 = ((org.jsoup.safety.Whitelist)v0).addTags(((java.lang.String[])v1));
    Object v3 = new java.lang.String[]{};
    Object v4 = ((org.jsoup.safety.Whitelist)v2).addTags(((java.lang.String[])v3));
    Object v5 = "Upsi";
    Object v6 = "Do+ctype";
    Object v7 = "sst(rf";
    Object v8 = ((org.jsoup.safety.Whitelist)v4).addEnforcedAttribute(((java.lang.String)v5),((java.lang.String)v6),((java.lang.String)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.simpleText();
    Object v1 = new java.lang.String[]{"td"};
    Object v2 = ((org.jsoup.safety.Whitelist)v0).addTags(((java.lang.String[])v1));
    Object v3 = "b";
    Object v4 = "r";
    Object v5 = "htm'l";
    Object v6 = ((org.jsoup.safety.Whitelist)v2).addEnforcedAttribute(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new org.jsoup.safety.Whitelist();
    Object v1 = new java.lang.String[]{"ht*l","tr"};
    Object v2 = ((org.jsoup.safety.Whitelist)v0).addTags(((java.lang.String[])v1));
    Object v3 = "</";
    Object v4 = "text$rea";
    Object v5 = new java.lang.String[]{"tr8","'","U"};
    Object v6 = ((org.jsoup.safety.Whitelist)v2).addProtocols(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String[])v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new org.jsoup.safety.Whitelist();
    Object v1 = new java.lang.String[]{"tr","]laintext","html"};
    Object v2 = ((org.jsoup.safety.Whitelist)v0).addTags(((java.lang.String[])v1));
    Object v3 = new java.lang.String[]{};
    Object v4 = ((org.jsoup.safety.Whitelist)v2).addTags(((java.lang.String[])v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new org.jsoup.safety.Whitelist();
    Object v1 = new java.lang.String[]{"ht*l","tr"};
    Object v2 = ((org.jsoup.safety.Whitelist)v0).addTags(((java.lang.String[])v1));
    Object v3 = false;
    Object v4 = ((org.jsoup.safety.Whitelist)v2).preserveRelativeLinks((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = "area";
    Object v6 = "img";
    Object v7 = "fielCset";
    Object v8 = ((org.jsoup.safety.Whitelist)v2).addEnforcedAttribute(((java.lang.String)v5),((java.lang.String)v6),((java.lang.String)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.simpleText();
    Object v1 = new java.lang.String[]{"td"};
    Object v2 = ((org.jsoup.safety.Whitelist)v0).addTags(((java.lang.String[])v1));
    Object v3 = "b";
    Object v4 = "r";
    Object v5 = "htm'l";
    Object v6 = ((org.jsoup.safety.Whitelist)v2).addEnforcedAttribute(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = "Dpre";
    Object v8 = new java.lang.String[]{"td"};
    Object v9 = ((org.jsoup.safety.Whitelist)v6).addAttributes(((java.lang.String)v7),((java.lang.String[])v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new org.jsoup.safety.Whitelist();
    Object v1 = new java.lang.String[]{"tr","]laintext","html"};
    Object v2 = ((org.jsoup.safety.Whitelist)v0).addTags(((java.lang.String[])v1));
    Object v3 = false;
    Object v4 = ((org.jsoup.safety.Whitelist)v2).preserveRelativeLinks((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = "ouml";
    Object v6 = "tr";
    Object v7 = new java.lang.String[]{"bsolb","pro-ress"};
    Object v8 = ((org.jsoup.safety.Whitelist)v2).addProtocols(((java.lang.String)v5),((java.lang.String)v6),((java.lang.String[])v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new org.jsoup.safety.Whitelist();
    Object v1 = new java.lang.String[]{"ht*l","tr"};
    Object v2 = ((org.jsoup.safety.Whitelist)v0).addTags(((java.lang.String[])v1));
    Object v3 = false;
    Object v4 = ((org.jsoup.safety.Whitelist)v2).preserveRelativeLinks((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = "area";
    Object v6 = "img";
    Object v7 = "fielCset";
    Object v8 = ((org.jsoup.safety.Whitelist)v2).addEnforcedAttribute(((java.lang.String)v5),((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = "h1";
    Object v10 = "section";
    Object v11 = new java.lang.String[]{};
    Object v12 = ((org.jsoup.safety.Whitelist)v8).addProtocols(((java.lang.String)v9),((java.lang.String)v10),((java.lang.String[])v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new org.jsoup.safety.Whitelist();
    Object v1 = new java.lang.String[]{"ht*l","tr"};
    Object v2 = ((org.jsoup.safety.Whitelist)v0).addTags(((java.lang.String[])v1));
    Object v3 = "vli";
    Object v4 = new java.lang.String[]{"pre","htnl"};
    Object v5 = ((org.jsoup.safety.Whitelist)v2).addAttributes(((java.lang.String)v3),((java.lang.String[])v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.simpleText();
    Object v1 = new java.lang.String[]{"td"};
    Object v2 = ((org.jsoup.safety.Whitelist)v0).addTags(((java.lang.String[])v1));
    Object v3 = "sime";
    Object v4 = "p";
    Object v5 = new java.lang.String[]{"tbody"};
    Object v6 = ((org.jsoup.safety.Whitelist)v2).addProtocols(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String[])v5));
    Object v7 = "frameset";
    Object v8 = ((org.jsoup.safety.Whitelist)v6).getEnforcedAttributes(((java.lang.String)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new org.jsoup.safety.Whitelist();
    Object v1 = "p";
    Object v2 = "<!DOCTYPE";
    Object v3 = "Lfr";
    Object v4 = ((org.jsoup.safety.Whitelist)v0).addEnforcedAttribute(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.basic();
    Object v1 = "cata-";
    Object v2 = "table";
    Object v3 = org.jsoup.Jsoup.parse(((java.lang.String)v2));
    Object v4 = "aside";
    Object v5 = java.util.regex.Pattern.compile(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Element)v3).getElementsMatchingOwnText(((java.util.regex.Pattern)v5));
    Object v7 = "t-h";
    Object v8 = "ol\\";
    Object v9 = new org.jsoup.nodes.Attribute(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = ((org.jsoup.safety.Whitelist)v0).isSafeAttribute(((java.lang.String)v1),((org.jsoup.nodes.Element)v3),((org.jsoup.nodes.Attribute)v9));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.simpleText();
    Object v1 = new java.lang.String[]{"td"};
    Object v2 = ((org.jsoup.safety.Whitelist)v0).addTags(((java.lang.String[])v1));
    Object v3 = new java.lang.String[]{};
    Object v4 = ((org.jsoup.safety.Whitelist)v2).addTags(((java.lang.String[])v3));
    Object v5 = "script";
    Object v6 = "table";
    Object v7 = org.jsoup.Jsoup.parse(((java.lang.String)v6));
    Object v8 = "t-h";
    Object v9 = "ol\\";
    Object v10 = new org.jsoup.nodes.Attribute(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = ((org.jsoup.safety.Whitelist)v4).isSafeAttribute(((java.lang.String)v5),((org.jsoup.nodes.Element)v7),((org.jsoup.nodes.Attribute)v10));
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.simpleText();
    Object v1 = "bas";
    Object v2 = new java.lang.String[]{};
    Object v3 = ((org.jsoup.safety.Whitelist)v0).addAttributes(((java.lang.String)v1),((java.lang.String[])v2));
    Object v4 = new java.lang.String[]{"td"};
    Object v5 = ((org.jsoup.safety.Whitelist)v3).addTags(((java.lang.String[])v4));
    Object v6 = "odi";
    Object v7 = "html";
    Object v8 = new java.lang.String[]{"thed","table"};
    Object v9 = ((org.jsoup.safety.Whitelist)v3).addProtocols(((java.lang.String)v6),((java.lang.String)v7),((java.lang.String[])v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.simpleText();
    Object v1 = new java.lang.String[]{"td"};
    Object v2 = ((org.jsoup.safety.Whitelist)v0).addTags(((java.lang.String[])v1));
    Object v3 = new java.lang.String[]{};
    Object v4 = ((org.jsoup.safety.Whitelist)v2).addTags(((java.lang.String[])v3));
    Object v5 = "nle";
    Object v6 = new java.lang.String[]{"mopf","col"};
    Object v7 = ((org.jsoup.safety.Whitelist)v4).addAttributes(((java.lang.String)v5),((java.lang.String[])v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.basic();
    Object v1 = false;
    Object v2 = ((org.jsoup.safety.Whitelist)v0).preserveRelativeLinks((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "thead";
    Object v4 = "table";
    Object v5 = org.jsoup.Jsoup.parse(((java.lang.String)v4));
    Object v6 = "t-h";
    Object v7 = "ol\\";
    Object v8 = new org.jsoup.nodes.Attribute(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = ((org.jsoup.safety.Whitelist)v0).isSafeAttribute(((java.lang.String)v3),((org.jsoup.nodes.Element)v5),((org.jsoup.nodes.Attribute)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.simpleText();
    Object v1 = "script";
    Object v2 = new java.lang.String[]{"bod","bgs"};
    Object v3 = ((org.jsoup.safety.Whitelist)v0).addAttributes(((java.lang.String)v1),((java.lang.String[])v2));
    Object v4 = "htm\"";
    Object v5 = "table";
    Object v6 = org.jsoup.Jsoup.parse(((java.lang.String)v5));
    Object v7 = "t-h";
    Object v8 = "ol\\";
    Object v9 = new org.jsoup.nodes.Attribute(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = ((org.jsoup.safety.Whitelist)v3).isSafeAttribute(((java.lang.String)v4),((org.jsoup.nodes.Element)v6),((org.jsoup.nodes.Attribute)v9));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new org.jsoup.safety.Whitelist();
    Object v1 = new java.lang.String[]{"Eacute","h"};
    Object v2 = ((org.jsoup.safety.Whitelist)v0).addTags(((java.lang.String[])v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.basic();
    Object v1 = "textarea";
    Object v2 = "ta/ble";
    Object v3 = "htm";
    Object v4 = ((org.jsoup.safety.Whitelist)v0).addEnforcedAttribute(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = "table";
    Object v6 = "</";
    Object v7 = new java.lang.String[]{};
    Object v8 = ((org.jsoup.safety.Whitelist)v0).addProtocols(((java.lang.String)v5),((java.lang.String)v6),((java.lang.String[])v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new org.jsoup.safety.Whitelist();
    Object v1 = new java.lang.String[]{"ht*l","tr"};
    Object v2 = ((org.jsoup.safety.Whitelist)v0).addTags(((java.lang.String[])v1));
    Object v3 = false;
    Object v4 = ((org.jsoup.safety.Whitelist)v2).preserveRelativeLinks((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = "area";
    Object v6 = "img";
    Object v7 = "fielCset";
    Object v8 = ((org.jsoup.safety.Whitelist)v2).addEnforcedAttribute(((java.lang.String)v5),((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = "triplus";
    Object v10 = "'";
    Object v11 = "betHh";
    Object v12 = ((org.jsoup.safety.Whitelist)v8).addEnforcedAttribute(((java.lang.String)v9),((java.lang.String)v10),((java.lang.String)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new org.jsoup.safety.Whitelist();
    Object v1 = "p";
    Object v2 = "<!DOCTYPE";
    Object v3 = "Lfr";
    Object v4 = ((org.jsoup.safety.Whitelist)v0).addEnforcedAttribute(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = "listin&";
    Object v6 = "LeftAngleBracket";
    Object v7 = new java.lang.String[]{"plusdeu"};
    Object v8 = ((org.jsoup.safety.Whitelist)v4).addProtocols(((java.lang.String)v5),((java.lang.String)v6),((java.lang.String[])v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.simpleText();
    Object v1 = new java.lang.String[]{"td"};
    Object v2 = ((org.jsoup.safety.Whitelist)v0).addTags(((java.lang.String[])v1));
    Object v3 = "b";
    Object v4 = "r";
    Object v5 = "htm'l";
    Object v6 = ((org.jsoup.safety.Whitelist)v2).addEnforcedAttribute(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = "supE";
    Object v8 = "htrml";
    Object v9 = new java.lang.String[]{"table","leftleftarr"};
    Object v10 = ((org.jsoup.safety.Whitelist)v6).addProtocols(((java.lang.String)v7),((java.lang.String)v8),((java.lang.String[])v9));
    Object v11 = "t";
    Object v12 = ((org.jsoup.safety.Whitelist)v6).getEnforcedAttributes(((java.lang.String)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new org.jsoup.safety.Whitelist();
    Object v1 = new java.lang.String[]{"ht*l","tr"};
    Object v2 = ((org.jsoup.safety.Whitelist)v0).addTags(((java.lang.String[])v1));
    Object v3 = false;
    Object v4 = ((org.jsoup.safety.Whitelist)v2).preserveRelativeLinks((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = "area";
    Object v6 = "img";
    Object v7 = "fielCset";
    Object v8 = ((org.jsoup.safety.Whitelist)v2).addEnforcedAttribute(((java.lang.String)v5),((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = "RightDoubleBracket";
    Object v10 = "table";
    Object v11 = org.jsoup.Jsoup.parse(((java.lang.String)v10));
    Object v12 = "t-h";
    Object v13 = "ol\\";
    Object v14 = new org.jsoup.nodes.Attribute(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = ((org.jsoup.safety.Whitelist)v8).isSafeAttribute(((java.lang.String)v9),((org.jsoup.nodes.Element)v11),((org.jsoup.nodes.Attribute)v14));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.simpleText();
    Object v1 = true;
    Object v2 = ((org.jsoup.safety.Whitelist)v0).preserveRelativeLinks((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "RightTeeVector";
    Object v4 = "colgroup";
    Object v5 = new java.lang.String[]{"capt","body"};
    Object v6 = ((org.jsoup.safety.Whitelist)v2).addProtocols(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String[])v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.simpleText();
    Object v1 = true;
    Object v2 = ((org.jsoup.safety.Whitelist)v0).preserveRelativeLinks((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "RightTeeVector";
    Object v4 = "colgroup";
    Object v5 = new java.lang.String[]{"capt","body"};
    Object v6 = ((org.jsoup.safety.Whitelist)v2).addProtocols(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String[])v5));
    Object v7 = true;
    Object v8 = ((org.jsoup.safety.Whitelist)v6).preserveRelativeLinks((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = "caption";
    Object v10 = "supdsu*";
    Object v11 = "dl";
    Object v12 = ((org.jsoup.safety.Whitelist)v6).addEnforcedAttribute(((java.lang.String)v9),((java.lang.String)v10),((java.lang.String)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new org.jsoup.safety.Whitelist();
    Object v1 = new java.lang.String[]{"tr","]laintext","html"};
    Object v2 = ((org.jsoup.safety.Whitelist)v0).addTags(((java.lang.String[])v1));
    Object v3 = "ti";
    Object v4 = new java.lang.String[]{"html"};
    Object v5 = ((org.jsoup.safety.Whitelist)v2).addAttributes(((java.lang.String)v3),((java.lang.String[])v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = new org.jsoup.safety.Whitelist();
    Object v1 = "pr+";
    Object v2 = "";
    Object v3 = "butFon";
    Object v4 = ((org.jsoup.safety.Whitelist)v0).addEnforcedAttribute(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new org.jsoup.safety.Whitelist();
    Object v1 = new java.lang.String[]{"ht*l","tr"};
    Object v2 = ((org.jsoup.safety.Whitelist)v0).addTags(((java.lang.String[])v1));
    Object v3 = "vli";
    Object v4 = new java.lang.String[]{"pre","htnl"};
    Object v5 = ((org.jsoup.safety.Whitelist)v2).addAttributes(((java.lang.String)v3),((java.lang.String[])v4));
    Object v6 = "gtques";
    Object v7 = new java.lang.String[]{"e","colgroup"};
    Object v8 = ((org.jsoup.safety.Whitelist)v5).addAttributes(((java.lang.String)v6),((java.lang.String[])v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new org.jsoup.safety.Whitelist();
    Object v1 = new java.lang.String[]{"Eacute","h"};
    Object v2 = ((org.jsoup.safety.Whitelist)v0).addTags(((java.lang.String[])v1));
    Object v3 = "fjorm";
    Object v4 = ((org.jsoup.safety.Whitelist)v2).isSafeTag(((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new org.jsoup.safety.Whitelist();
    Object v1 = "Inj";
    Object v2 = ((org.jsoup.safety.Whitelist)v0).getEnforcedAttributes(((java.lang.String)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new org.jsoup.safety.Whitelist();
    Object v1 = new java.lang.String[]{"tr","]laintext","html"};
    Object v2 = ((org.jsoup.safety.Whitelist)v0).addTags(((java.lang.String[])v1));
    Object v3 = "html";
    Object v4 = ((org.jsoup.safety.Whitelist)v2).getEnforcedAttributes(((java.lang.String)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.simpleText();
    Object v1 = new java.lang.String[]{"td"};
    Object v2 = ((org.jsoup.safety.Whitelist)v0).addTags(((java.lang.String[])v1));
    Object v3 = new java.lang.String[]{};
    Object v4 = ((org.jsoup.safety.Whitelist)v2).addTags(((java.lang.String[])v3));
    Object v5 = "hopf";
    Object v6 = ((org.jsoup.safety.Whitelist)v4).getEnforcedAttributes(((java.lang.String)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.relaxed();
    Object v1 = new java.lang.String[]{" ","scriptI","ta;ble"};
    Object v2 = ((org.jsoup.safety.Whitelist)v0).addTags(((java.lang.String[])v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = org.jsoup.safety.Whitelist.simpleText();
    Object v1 = true;
    Object v2 = ((org.jsoup.safety.Whitelist)v0).preserveRelativeLinks((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "RightTeeVector";
    Object v4 = "colgroup";
    Object v5 = new java.lang.String[]{"capt","body"};
    Object v6 = ((org.jsoup.safety.Whitelist)v2).addProtocols(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String[])v5));
    Object v7 = true;
    Object v8 = ((org.jsoup.safety.Whitelist)v6).preserveRelativeLinks((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = "caption";
    Object v10 = "supdsu*";
    Object v11 = "dl";
    Object v12 = ((org.jsoup.safety.Whitelist)v6).addEnforcedAttribute(((java.lang.String)v9),((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = false;
    Object v14 = ((org.jsoup.safety.Whitelist)v12).preserveRelativeLinks((((java.lang.Boolean)v13).booleanValue()));
    Object v15 = "script";
    Object v16 = "Sqrt";
    Object v17 = "";
    Object v18 = ((org.jsoup.safety.Whitelist)v12).addEnforcedAttribute(((java.lang.String)v15),((java.lang.String)v16),((java.lang.String)v17));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new org.jsoup.safety.Whitelist();
    Object v1 = " ";
    Object v2 = "agmsdah";
    Object v3 = "cite";
    Object v4 = ((org.jsoup.safety.Whitelist)v0).addEnforcedAttribute(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = "tbody";
    Object v6 = "table";
    Object v7 = org.jsoup.Jsoup.parse(((java.lang.String)v6));
    Object v8 = "t-h";
    Object v9 = "ol\\";
    Object v10 = new org.jsoup.nodes.Attribute(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = ((org.jsoup.safety.Whitelist)v0).isSafeAttribute(((java.lang.String)v5),((org.jsoup.nodes.Element)v7),((org.jsoup.nodes.Attribute)v10));
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new org.jsoup.safety.Whitelist();
    Object v1 = new java.lang.String[]{"ht*l","tr"};
    Object v2 = ((org.jsoup.safety.Whitelist)v0).addTags(((java.lang.String[])v1));
    Object v3 = "vli";
    Object v4 = new java.lang.String[]{"pre","htnl"};
    Object v5 = ((org.jsoup.safety.Whitelist)v2).addAttributes(((java.lang.String)v3),((java.lang.String[])v4));
    Object v6 = new java.lang.String[]{":eq("};
    Object v7 = ((org.jsoup.safety.Whitelist)v5).addTags(((java.lang.String[])v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.simpleText();
    Object v1 = new java.lang.String[]{"td"};
    Object v2 = ((org.jsoup.safety.Whitelist)v0).addTags(((java.lang.String[])v1));
    Object v3 = "optgrou";
    Object v4 = new java.lang.String[]{};
    Object v5 = ((org.jsoup.safety.Whitelist)v2).addAttributes(((java.lang.String)v3),((java.lang.String[])v4));
    Object v6 = false;
    Object v7 = ((org.jsoup.safety.Whitelist)v5).preserveRelativeLinks((((java.lang.Boolean)v6).booleanValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.simpleText();
    Object v1 = new java.lang.String[]{"td"};
    Object v2 = ((org.jsoup.safety.Whitelist)v0).addTags(((java.lang.String[])v1));
    Object v3 = "b";
    Object v4 = "r";
    Object v5 = "htm'l";
    Object v6 = ((org.jsoup.safety.Whitelist)v2).addEnforcedAttribute(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = "link";
    Object v8 = ((org.jsoup.safety.Whitelist)v6).isSafeTag(((java.lang.String)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = new org.jsoup.safety.Whitelist();
    Object v1 = new java.lang.String[]{"ht*l","tr"};
    Object v2 = ((org.jsoup.safety.Whitelist)v0).addTags(((java.lang.String[])v1));
    Object v3 = "vli";
    Object v4 = new java.lang.String[]{"pre","htnl"};
    Object v5 = ((org.jsoup.safety.Whitelist)v2).addAttributes(((java.lang.String)v3),((java.lang.String[])v4));
    Object v6 = true;
    Object v7 = ((org.jsoup.safety.Whitelist)v5).preserveRelativeLinks((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = "htm";
    Object v9 = "tbody";
    Object v10 = "";
    Object v11 = ((org.jsoup.safety.Whitelist)v5).addEnforcedAttribute(((java.lang.String)v8),((java.lang.String)v9),((java.lang.String)v10));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.simpleText();
    Object v1 = true;
    Object v2 = ((org.jsoup.safety.Whitelist)v0).preserveRelativeLinks((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "RightTeeVector";
    Object v4 = "colgroup";
    Object v5 = new java.lang.String[]{"capt","body"};
    Object v6 = ((org.jsoup.safety.Whitelist)v2).addProtocols(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String[])v5));
    Object v7 = true;
    Object v8 = ((org.jsoup.safety.Whitelist)v6).preserveRelativeLinks((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = "caption";
    Object v10 = "supdsu*";
    Object v11 = "dl";
    Object v12 = ((org.jsoup.safety.Whitelist)v6).addEnforcedAttribute(((java.lang.String)v9),((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = false;
    Object v14 = ((org.jsoup.safety.Whitelist)v12).preserveRelativeLinks((((java.lang.Boolean)v13).booleanValue()));
    Object v15 = "p";
    Object v16 = "ShortUpArow";
    Object v17 = new java.lang.String[]{};
    Object v18 = ((org.jsoup.safety.Whitelist)v12).addProtocols(((java.lang.String)v15),((java.lang.String)v16),((java.lang.String[])v17));
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.simpleText();
    Object v1 = "apaciS";
    Object v2 = new java.lang.String[]{};
    Object v3 = ((org.jsoup.safety.Whitelist)v0).addAttributes(((java.lang.String)v1),((java.lang.String[])v2));
    Object v4 = "plaintext";
    Object v5 = "\n";
    Object v6 = "opt/ion";
    Object v7 = ((org.jsoup.safety.Whitelist)v0).addEnforcedAttribute(((java.lang.String)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = false;
    Object v9 = ((org.jsoup.safety.Whitelist)v7).preserveRelativeLinks((((java.lang.Boolean)v8).booleanValue()));
    Object v10 = "scpript";
    Object v11 = new java.lang.String[]{"frameset"};
    Object v12 = ((org.jsoup.safety.Whitelist)v7).addAttributes(((java.lang.String)v10),((java.lang.String[])v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new org.jsoup.safety.Whitelist();
    Object v1 = new java.lang.String[]{"ht*l","tr"};
    Object v2 = ((org.jsoup.safety.Whitelist)v0).addTags(((java.lang.String[])v1));
    Object v3 = "vli";
    Object v4 = new java.lang.String[]{"pre","htnl"};
    Object v5 = ((org.jsoup.safety.Whitelist)v2).addAttributes(((java.lang.String)v3),((java.lang.String[])v4));
    Object v6 = "gtques";
    Object v7 = new java.lang.String[]{"e","colgroup"};
    Object v8 = ((org.jsoup.safety.Whitelist)v5).addAttributes(((java.lang.String)v6),((java.lang.String[])v7));
    Object v9 = "nshortmid";
    Object v10 = "hml";
    Object v11 = "expectation";
    Object v12 = ((org.jsoup.safety.Whitelist)v8).addEnforcedAttribute(((java.lang.String)v9),((java.lang.String)v10),((java.lang.String)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new org.jsoup.safety.Whitelist();
    Object v1 = new java.lang.String[]{"tr","]laintext","html"};
    Object v2 = ((org.jsoup.safety.Whitelist)v0).addTags(((java.lang.String[])v1));
    Object v3 = "body";
    Object v4 = "href";
    Object v5 = ":eq(%dp)";
    Object v6 = ((org.jsoup.safety.Whitelist)v2).addEnforcedAttribute(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new org.jsoup.safety.Whitelist();
    Object v1 = new java.lang.String[]{"ht*l","tr"};
    Object v2 = ((org.jsoup.safety.Whitelist)v0).addTags(((java.lang.String[])v1));
    Object v3 = "h";
    Object v4 = ((org.jsoup.safety.Whitelist)v2).getEnforcedAttributes(((java.lang.String)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new org.jsoup.safety.Whitelist();
    Object v1 = new java.lang.String[]{"ht*l","tr"};
    Object v2 = ((org.jsoup.safety.Whitelist)v0).addTags(((java.lang.String[])v1));
    Object v3 = "</";
    Object v4 = "text$rea";
    Object v5 = new java.lang.String[]{"tr8","'","U"};
    Object v6 = ((org.jsoup.safety.Whitelist)v2).addProtocols(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String[])v5));
    Object v7 = "boxd";
    Object v8 = "tabl?e";
    Object v9 = new java.lang.String[]{"dd","tr","_rbbrk"};
    Object v10 = ((org.jsoup.safety.Whitelist)v6).addProtocols(((java.lang.String)v7),((java.lang.String)v8),((java.lang.String[])v9));
    Object v11 = "br";
    Object v12 = "captio";
    Object v13 = new java.lang.String[]{"br","subsetneqq","Data value must notebe null"};
    Object v14 = ((org.jsoup.safety.Whitelist)v6).addProtocols(((java.lang.String)v11),((java.lang.String)v12),((java.lang.String[])v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new org.jsoup.safety.Whitelist();
    Object v1 = new java.lang.String[]{"ht*l","tr"};
    Object v2 = ((org.jsoup.safety.Whitelist)v0).addTags(((java.lang.String[])v1));
    Object v3 = false;
    Object v4 = ((org.jsoup.safety.Whitelist)v2).preserveRelativeLinks((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = "area";
    Object v6 = "img";
    Object v7 = "fielCset";
    Object v8 = ((org.jsoup.safety.Whitelist)v2).addEnforcedAttribute(((java.lang.String)v5),((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = "h1";
    Object v10 = "section";
    Object v11 = new java.lang.String[]{};
    Object v12 = ((org.jsoup.safety.Whitelist)v8).addProtocols(((java.lang.String)v9),((java.lang.String)v10),((java.lang.String[])v11));
    Object v13 = "ecyT";
    Object v14 = ((org.jsoup.safety.Whitelist)v12).getEnforcedAttributes(((java.lang.String)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new org.jsoup.safety.Whitelist();
    Object v1 = new java.lang.String[]{"ht*l","tr"};
    Object v2 = ((org.jsoup.safety.Whitelist)v0).addTags(((java.lang.String[])v1));
    Object v3 = "vli";
    Object v4 = new java.lang.String[]{"pre","htnl"};
    Object v5 = ((org.jsoup.safety.Whitelist)v2).addAttributes(((java.lang.String)v3),((java.lang.String[])v4));
    Object v6 = new java.lang.String[]{};
    Object v7 = ((org.jsoup.safety.Whitelist)v5).addTags(((java.lang.String[])v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new org.jsoup.safety.Whitelist();
    Object v1 = new java.lang.String[]{"ht*l","tr"};
    Object v2 = ((org.jsoup.safety.Whitelist)v0).addTags(((java.lang.String[])v1));
    Object v3 = "vli";
    Object v4 = new java.lang.String[]{"pre","htnl"};
    Object v5 = ((org.jsoup.safety.Whitelist)v2).addAttributes(((java.lang.String)v3),((java.lang.String[])v4));
    Object v6 = new java.lang.String[]{};
    Object v7 = ((org.jsoup.safety.Whitelist)v5).addTags(((java.lang.String[])v6));
    Object v8 = "met";
    Object v9 = "noemNed";
    Object v10 = new java.lang.String[]{"tfoo>","tfoo"};
    Object v11 = ((org.jsoup.safety.Whitelist)v7).addProtocols(((java.lang.String)v8),((java.lang.String)v9),((java.lang.String[])v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = new org.jsoup.safety.Whitelist();
    Object v1 = new java.lang.String[]{"ht*l","tr"};
    Object v2 = ((org.jsoup.safety.Whitelist)v0).addTags(((java.lang.String[])v1));
    Object v3 = "</";
    Object v4 = "text$rea";
    Object v5 = new java.lang.String[]{"tr8","'","U"};
    Object v6 = ((org.jsoup.safety.Whitelist)v2).addProtocols(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String[])v5));
    Object v7 = "utri";
    Object v8 = "";
    Object v9 = "V";
    Object v10 = ((org.jsoup.safety.Whitelist)v6).addEnforcedAttribute(((java.lang.String)v7),((java.lang.String)v8),((java.lang.String)v9));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = org.jsoup.safety.Whitelist.simpleText();
    Object v1 = new java.lang.String[]{"td"};
    Object v2 = ((org.jsoup.safety.Whitelist)v0).addTags(((java.lang.String[])v1));
    Object v3 = "optgrou";
    Object v4 = new java.lang.String[]{};
    Object v5 = ((org.jsoup.safety.Whitelist)v2).addAttributes(((java.lang.String)v3),((java.lang.String[])v4));
    Object v6 = new java.lang.String[]{"htDml","na5ute","hyml"};
    Object v7 = ((org.jsoup.safety.Whitelist)v5).addTags(((java.lang.String[])v6));
    Object v8 = "table";
    Object v9 = "";
    Object v10 = "\n";
    Object v11 = ((org.jsoup.safety.Whitelist)v5).addEnforcedAttribute(((java.lang.String)v8),((java.lang.String)v9),((java.lang.String)v10));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.basic();
    Object v1 = "textarea";
    Object v2 = "ta/ble";
    Object v3 = "htm";
    Object v4 = ((org.jsoup.safety.Whitelist)v0).addEnforcedAttribute(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = "table";
    Object v6 = "</";
    Object v7 = new java.lang.String[]{};
    Object v8 = ((org.jsoup.safety.Whitelist)v0).addProtocols(((java.lang.String)v5),((java.lang.String)v6),((java.lang.String[])v7));
    Object v9 = "Cayleys";
    Object v10 = "htps";
    Object v11 = "rightharpondown";
    Object v12 = ((org.jsoup.safety.Whitelist)v8).addEnforcedAttribute(((java.lang.String)v9),((java.lang.String)v10),((java.lang.String)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new org.jsoup.safety.Whitelist();
    Object v1 = new java.lang.String[]{"ht*l","tr"};
    Object v2 = ((org.jsoup.safety.Whitelist)v0).addTags(((java.lang.String[])v1));
    Object v3 = "</";
    Object v4 = "text$rea";
    Object v5 = new java.lang.String[]{"tr8","'","U"};
    Object v6 = ((org.jsoup.safety.Whitelist)v2).addProtocols(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String[])v5));
    Object v7 = "boxd";
    Object v8 = "tabl?e";
    Object v9 = new java.lang.String[]{"dd","tr","_rbbrk"};
    Object v10 = ((org.jsoup.safety.Whitelist)v6).addProtocols(((java.lang.String)v7),((java.lang.String)v8),((java.lang.String[])v9));
    Object v11 = "br";
    Object v12 = "captio";
    Object v13 = new java.lang.String[]{"br","subsetneqq","Data value must notebe null"};
    Object v14 = ((org.jsoup.safety.Whitelist)v6).addProtocols(((java.lang.String)v11),((java.lang.String)v12),((java.lang.String[])v13));
    Object v15 = "iWmg";
    Object v16 = "g&";
    Object v17 = new java.lang.String[]{"rp","su"};
    Object v18 = ((org.jsoup.safety.Whitelist)v14).addProtocols(((java.lang.String)v15),((java.lang.String)v16),((java.lang.String[])v17));
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new org.jsoup.safety.Whitelist();
    Object v1 = new java.lang.String[]{"tr","]laintext","html"};
    Object v2 = ((org.jsoup.safety.Whitelist)v0).addTags(((java.lang.String[])v1));
    Object v3 = "frameset";
    Object v4 = ((org.jsoup.safety.Whitelist)v2).getEnforcedAttributes(((java.lang.String)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new org.jsoup.safety.Whitelist();
    Object v1 = new java.lang.String[]{"Eacute","h"};
    Object v2 = ((org.jsoup.safety.Whitelist)v0).addTags(((java.lang.String[])v1));
    Object v3 = new java.lang.String[]{"ldrushar"};
    Object v4 = ((org.jsoup.safety.Whitelist)v2).addTags(((java.lang.String[])v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.simpleText();
    Object v1 = "script";
    Object v2 = new java.lang.String[]{"bod","bgs"};
    Object v3 = ((org.jsoup.safety.Whitelist)v0).addAttributes(((java.lang.String)v1),((java.lang.String[])v2));
    Object v4 = "cption";
    Object v5 = "table";
    Object v6 = org.jsoup.Jsoup.parse(((java.lang.String)v5));
    Object v7 = "t-h";
    Object v8 = "ol\\";
    Object v9 = new org.jsoup.nodes.Attribute(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = ((org.jsoup.safety.Whitelist)v3).isSafeAttribute(((java.lang.String)v4),((org.jsoup.nodes.Element)v6),((org.jsoup.nodes.Attribute)v9));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.simpleText();
    Object v1 = "apaciS";
    Object v2 = new java.lang.String[]{};
    Object v3 = ((org.jsoup.safety.Whitelist)v0).addAttributes(((java.lang.String)v1),((java.lang.String[])v2));
    Object v4 = "plaintext";
    Object v5 = "\n";
    Object v6 = "opt/ion";
    Object v7 = ((org.jsoup.safety.Whitelist)v0).addEnforcedAttribute(((java.lang.String)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = "Be";
    Object v9 = "htm";
    Object v10 = "tml";
    Object v11 = ((org.jsoup.safety.Whitelist)v7).addEnforcedAttribute(((java.lang.String)v8),((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = "ht\"ml";
    Object v13 = new java.lang.String[]{};
    Object v14 = ((org.jsoup.safety.Whitelist)v11).addAttributes(((java.lang.String)v12),((java.lang.String[])v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new org.jsoup.safety.Whitelist();
    Object v1 = new java.lang.String[]{"tr","]laintext","html"};
    Object v2 = ((org.jsoup.safety.Whitelist)v0).addTags(((java.lang.String[])v1));
    Object v3 = "body";
    Object v4 = "href";
    Object v5 = ":eq(%dp)";
    Object v6 = ((org.jsoup.safety.Whitelist)v2).addEnforcedAttribute(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = "ge";
    Object v8 = ((org.jsoup.safety.Whitelist)v6).isSafeTag(((java.lang.String)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new org.jsoup.safety.Whitelist();
    Object v1 = new java.lang.String[]{"ht*l","tr"};
    Object v2 = ((org.jsoup.safety.Whitelist)v0).addTags(((java.lang.String[])v1));
    Object v3 = "vli";
    Object v4 = new java.lang.String[]{"pre","htnl"};
    Object v5 = ((org.jsoup.safety.Whitelist)v2).addAttributes(((java.lang.String)v3),((java.lang.String[])v4));
    Object v6 = "gtques";
    Object v7 = new java.lang.String[]{"e","colgroup"};
    Object v8 = ((org.jsoup.safety.Whitelist)v5).addAttributes(((java.lang.String)v6),((java.lang.String[])v7));
    Object v9 = "swarr";
    Object v10 = new java.lang.String[]{};
    Object v11 = ((org.jsoup.safety.Whitelist)v8).addAttributes(((java.lang.String)v9),((java.lang.String[])v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.simpleText();
    Object v1 = true;
    Object v2 = ((org.jsoup.safety.Whitelist)v0).preserveRelativeLinks((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "RightTeeVector";
    Object v4 = "colgroup";
    Object v5 = new java.lang.String[]{"capt","body"};
    Object v6 = ((org.jsoup.safety.Whitelist)v2).addProtocols(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String[])v5));
    Object v7 = ":as(%s)";
    Object v8 = ((org.jsoup.safety.Whitelist)v6).getEnforcedAttributes(((java.lang.String)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new org.jsoup.safety.Whitelist();
    Object v1 = new java.lang.String[]{"ht*l","tr"};
    Object v2 = ((org.jsoup.safety.Whitelist)v0).addTags(((java.lang.String[])v1));
    Object v3 = "scipt";
    Object v4 = new java.lang.String[]{"D","dt"};
    Object v5 = ((org.jsoup.safety.Whitelist)v2).addAttributes(((java.lang.String)v3),((java.lang.String[])v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new org.jsoup.safety.Whitelist();
    Object v1 = new java.lang.String[]{"tr","]laintext","html"};
    Object v2 = ((org.jsoup.safety.Whitelist)v0).addTags(((java.lang.String[])v1));
    Object v3 = "image";
    Object v4 = "table";
    Object v5 = org.jsoup.Jsoup.parse(((java.lang.String)v4));
    Object v6 = "t-h";
    Object v7 = "ol\\";
    Object v8 = new org.jsoup.nodes.Attribute(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = ((org.jsoup.safety.Whitelist)v2).isSafeAttribute(((java.lang.String)v3),((org.jsoup.nodes.Element)v5),((org.jsoup.nodes.Attribute)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.simpleText();
    Object v1 = true;
    Object v2 = ((org.jsoup.safety.Whitelist)v0).preserveRelativeLinks((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "RightTeeVector";
    Object v4 = "colgroup";
    Object v5 = new java.lang.String[]{"capt","body"};
    Object v6 = ((org.jsoup.safety.Whitelist)v2).addProtocols(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String[])v5));
    Object v7 = "vr";
    Object v8 = "</";
    Object v9 = new java.lang.String[]{};
    Object v10 = ((org.jsoup.safety.Whitelist)v6).addProtocols(((java.lang.String)v7),((java.lang.String)v8),((java.lang.String[])v9));
    Object v11 = "tr";
    Object v12 = "selec";
    Object v13 = "mcomma";
    Object v14 = ((org.jsoup.safety.Whitelist)v6).addEnforcedAttribute(((java.lang.String)v11),((java.lang.String)v12),((java.lang.String)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new org.jsoup.safety.Whitelist();
    Object v1 = new java.lang.String[]{"ht*l","tr"};
    Object v2 = ((org.jsoup.safety.Whitelist)v0).addTags(((java.lang.String[])v1));
    Object v3 = "vli";
    Object v4 = new java.lang.String[]{"pre","htnl"};
    Object v5 = ((org.jsoup.safety.Whitelist)v2).addAttributes(((java.lang.String)v3),((java.lang.String[])v4));
    Object v6 = "gtques";
    Object v7 = new java.lang.String[]{"e","colgroup"};
    Object v8 = ((org.jsoup.safety.Whitelist)v5).addAttributes(((java.lang.String)v6),((java.lang.String[])v7));
    Object v9 = "swarr";
    Object v10 = new java.lang.String[]{};
    Object v11 = ((org.jsoup.safety.Whitelist)v8).addAttributes(((java.lang.String)v9),((java.lang.String[])v10));
    Object v12 = "lotimes";
    Object v13 = "table";
    Object v14 = org.jsoup.Jsoup.parse(((java.lang.String)v13));
    Object v15 = ((org.jsoup.nodes.Element)v14).id();
    Object v16 = "t-h";
    Object v17 = "ol\\";
    Object v18 = new org.jsoup.nodes.Attribute(((java.lang.String)v16),((java.lang.String)v17));
    Object v19 = ((org.jsoup.safety.Whitelist)v11).isSafeAttribute(((java.lang.String)v12),((org.jsoup.nodes.Element)v14),((org.jsoup.nodes.Attribute)v18));
    org.junit.Assert.assertEquals((Object)(false), v19);
  }
}
