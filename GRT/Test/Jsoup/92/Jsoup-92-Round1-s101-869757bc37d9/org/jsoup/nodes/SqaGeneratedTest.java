package org.jsoup.nodes;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    ((org.jsoup.nodes.Attributes)v0).normalize();
    Object v1 = null;
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((org.jsoup.nodes.Attributes)v0).deduplicate(((org.jsoup.parser.ParseSettings)v3));
    org.junit.Assert.assertEquals((Object)(0), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "button";
    Object v2 = ((org.jsoup.nodes.Attributes)v0).hasKeyIgnoreCase(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = new java.io.StringWriter();
    Object v2 = "tablec";
    Object v3 = "H";
    Object v4 = org.jsoup.parser.Parser.parse(((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = org.jsoup.nodes.NodeUtils.outputSettings(((org.jsoup.nodes.Node)v4));
    ((org.jsoup.nodes.Attributes)v0).html(((java.lang.Appendable)v1),((org.jsoup.nodes.Document.OutputSettings)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "br";
    Object v2 = ((org.jsoup.nodes.Attributes)v0).get(((java.lang.String)v1));
    ((org.jsoup.nodes.Attributes)v0).normalize();
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "marqee";
    Object v2 = true;
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "marqee";
    Object v2 = true;
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new org.jsoup.nodes.Attributes();
    Object v5 = "marqee";
    Object v6 = true;
    Object v7 = ((org.jsoup.nodes.Attributes)v4).put(((java.lang.String)v5),(((java.lang.Boolean)v6).booleanValue()));
    ((org.jsoup.nodes.Attributes)v3).addAll(((org.jsoup.nodes.Attributes)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "marqee";
    Object v2 = true;
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "";
    ((org.jsoup.nodes.Attributes)v3).removeIgnoreCase(((java.lang.String)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = ((org.jsoup.nodes.Attributes)v0).asList();
    Object v2 = new java.io.StringWriter();
    Object v3 = Character.valueOf((char)1);
    Object v4 = ((java.lang.Appendable)v2).append((((java.lang.Character)v3).charValue()));
    Object v5 = "tablec";
    Object v6 = "H";
    Object v7 = org.jsoup.parser.Parser.parse(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = org.jsoup.nodes.NodeUtils.outputSettings(((org.jsoup.nodes.Node)v7));
    ((org.jsoup.nodes.Attributes)v0).html(((java.lang.Appendable)v2),((org.jsoup.nodes.Document.OutputSettings)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "marqee";
    Object v2 = true;
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "body";
    Object v5 = false;
    Object v6 = ((org.jsoup.nodes.Attributes)v3).put(((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "marqee";
    Object v2 = true;
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "body";
    Object v5 = false;
    Object v6 = ((org.jsoup.nodes.Attributes)v3).put(((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((org.jsoup.nodes.Attributes)v6).iterator();
    Object v8 = new org.jsoup.nodes.Attributes();
    Object v9 = "marqee";
    Object v10 = true;
    Object v11 = ((org.jsoup.nodes.Attributes)v8).put(((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = "body";
    Object v13 = false;
    Object v14 = ((org.jsoup.nodes.Attributes)v11).put(((java.lang.String)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = ((org.jsoup.nodes.Attributes)v6).equals(((java.lang.Object)v14));
    org.junit.Assert.assertEquals((Object)(true), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "marqee";
    Object v2 = true;
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "body";
    Object v5 = false;
    Object v6 = ((org.jsoup.nodes.Attributes)v3).put(((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "a";
    Object v8 = ((org.jsoup.nodes.Attributes)v6).hasKey(((java.lang.String)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "marqee";
    Object v2 = true;
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "body";
    Object v5 = false;
    Object v6 = ((org.jsoup.nodes.Attributes)v3).put(((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "codE";
    Object v8 = "d";
    Object v9 = ((org.jsoup.nodes.Attributes)v6).put(((java.lang.String)v7),((java.lang.String)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "marqee";
    Object v2 = true;
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "body";
    Object v5 = false;
    Object v6 = ((org.jsoup.nodes.Attributes)v3).put(((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "codE";
    Object v8 = "d";
    Object v9 = ((org.jsoup.nodes.Attributes)v6).put(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = "/";
    Object v11 = ((org.jsoup.nodes.Attributes)v9).getIgnoreCase(((java.lang.String)v10));
    org.junit.Assert.assertEquals((Object)(""), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "marqee";
    Object v2 = true;
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "p";
    Object v5 = ((org.jsoup.nodes.Attributes)v3).get(((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)(""), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "marqee";
    Object v2 = true;
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "body";
    Object v5 = false;
    Object v6 = ((org.jsoup.nodes.Attributes)v3).put(((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "}d";
    ((org.jsoup.nodes.Attributes)v6).removeIgnoreCase(((java.lang.String)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "marqee";
    Object v2 = true;
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "body";
    Object v5 = false;
    Object v6 = ((org.jsoup.nodes.Attributes)v3).put(((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "colgroup";
    Object v8 = "y";
    Object v9 = ((org.jsoup.nodes.Attributes)v6).put(((java.lang.String)v7),((java.lang.String)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "marqee";
    Object v2 = true;
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "body";
    Object v5 = false;
    Object v6 = ((org.jsoup.nodes.Attributes)v3).put(((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "codE";
    Object v8 = "d";
    Object v9 = ((org.jsoup.nodes.Attributes)v6).put(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = "R";
    Object v11 = ((org.jsoup.nodes.Attributes)v9).indexOfKey(((java.lang.String)v10));
    org.junit.Assert.assertEquals((Object)(-1), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "marqee";
    Object v2 = true;
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "body";
    Object v5 = false;
    Object v6 = ((org.jsoup.nodes.Attributes)v3).put(((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "Head=er name must not be empty";
    Object v8 = "";
    Object v9 = ((org.jsoup.nodes.Attributes)v6).put(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = "";
    Object v11 = ((org.jsoup.nodes.Attributes)v6).getIgnoreCase(((java.lang.String)v10));
    org.junit.Assert.assertEquals((Object)(""), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "marqee";
    Object v2 = true;
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "body";
    Object v5 = false;
    Object v6 = ((org.jsoup.nodes.Attributes)v3).put(((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((org.jsoup.nodes.Attributes)v6).html();
    org.junit.Assert.assertEquals((Object)(" marqee"), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "marqee";
    Object v2 = true;
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "body";
    Object v5 = false;
    Object v6 = ((org.jsoup.nodes.Attributes)v3).put(((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "colgroup";
    Object v8 = "y";
    Object v9 = ((org.jsoup.nodes.Attributes)v6).put(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = new org.jsoup.nodes.Attributes();
    Object v11 = "marqee";
    Object v12 = true;
    Object v13 = ((org.jsoup.nodes.Attributes)v10).put(((java.lang.String)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = "p";
    Object v15 = ((org.jsoup.nodes.Attributes)v13).get(((java.lang.String)v14));
    Object v16 = ((org.jsoup.nodes.Attributes)v9).equals(((java.lang.Object)v15));
    org.junit.Assert.assertEquals((Object)(false), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "marqee";
    Object v2 = true;
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "body";
    Object v5 = false;
    Object v6 = ((org.jsoup.nodes.Attributes)v3).put(((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "colgroup";
    Object v8 = "y";
    Object v9 = ((org.jsoup.nodes.Attributes)v6).put(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = "tra";
    Object v11 = true;
    Object v12 = ((org.jsoup.nodes.Attributes)v9).put(((java.lang.String)v10),(((java.lang.Boolean)v11).booleanValue()));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "marqee";
    Object v2 = true;
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "body";
    Object v5 = false;
    Object v6 = ((org.jsoup.nodes.Attributes)v3).put(((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "a";
    ((org.jsoup.nodes.Attributes)v6).removeIgnoreCase(((java.lang.String)v7));
    Object v8 = null;
    Object v9 = "bo";
    Object v10 = ((org.jsoup.nodes.Attributes)v6).indexOfKey(((java.lang.String)v9));
    org.junit.Assert.assertEquals((Object)(-1), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "marqee";
    Object v2 = true;
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "body";
    Object v5 = false;
    Object v6 = ((org.jsoup.nodes.Attributes)v3).put(((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new org.jsoup.nodes.Attributes();
    Object v8 = true;
    Object v9 = true;
    Object v10 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v8).booleanValue()),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = ((org.jsoup.nodes.Attributes)v7).deduplicate(((org.jsoup.parser.ParseSettings)v10));
    Object v12 = ((org.jsoup.nodes.Attributes)v6).equals(((java.lang.Object)v11));
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "marqee";
    Object v2 = true;
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "body";
    Object v5 = false;
    Object v6 = ((org.jsoup.nodes.Attributes)v3).put(((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "colgroup";
    Object v8 = "y";
    Object v9 = ((org.jsoup.nodes.Attributes)v6).put(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = "-";
    ((org.jsoup.nodes.Attributes)v9).remove(((java.lang.String)v10));
    Object v11 = null;
    Object v12 = "d";
    ((org.jsoup.nodes.Attributes)v9).remove(((java.lang.String)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "marqee";
    Object v2 = true;
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "body";
    Object v5 = false;
    Object v6 = ((org.jsoup.nodes.Attributes)v3).put(((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "colgroup";
    Object v8 = "y";
    Object v9 = ((org.jsoup.nodes.Attributes)v6).put(((java.lang.String)v7),((java.lang.String)v8));
    ((org.jsoup.nodes.Attributes)v9).normalize();
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "marqee";
    Object v2 = true;
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "body";
    Object v5 = false;
    Object v6 = ((org.jsoup.nodes.Attributes)v3).put(((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "colgroup";
    Object v8 = "y";
    Object v9 = ((org.jsoup.nodes.Attributes)v6).put(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = "p";
    ((org.jsoup.nodes.Attributes)v9).remove(((java.lang.String)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "marqee";
    Object v2 = true;
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "body";
    Object v5 = false;
    Object v6 = ((org.jsoup.nodes.Attributes)v3).put(((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = true;
    Object v9 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v7).booleanValue()),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = ((org.jsoup.nodes.Attributes)v6).equals(((java.lang.Object)v9));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = "form";
    Object v1 = org.jsoup.nodes.Attributes.checkNotNull(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("form"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "marqee";
    Object v2 = true;
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "H";
    Object v5 = ((org.jsoup.nodes.Attributes)v3).getIgnoreCase(((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)(""), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "marqee";
    Object v2 = true;
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "body";
    Object v5 = false;
    Object v6 = ((org.jsoup.nodes.Attributes)v3).put(((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "td";
    ((org.jsoup.nodes.Attributes)v6).remove(((java.lang.String)v7));
    Object v8 = null;
    Object v9 = "Yfoot";
    ((org.jsoup.nodes.Attributes)v6).removeIgnoreCase(((java.lang.String)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "marqee";
    Object v2 = true;
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "table";
    Object v5 = ((org.jsoup.nodes.Attributes)v3).getIgnoreCase(((java.lang.String)v4));
    Object v6 = "td";
    Object v7 = "h";
    ((org.jsoup.nodes.Attributes)v3).putIgnoreCase(((java.lang.String)v6),((java.lang.String)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "marqee";
    Object v2 = true;
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "body";
    Object v5 = false;
    Object v6 = ((org.jsoup.nodes.Attributes)v3).put(((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((org.jsoup.nodes.Attributes)v6).dataset();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "marqee";
    Object v2 = true;
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "html";
    Object v5 = ((org.jsoup.nodes.Attributes)v3).hasKeyIgnoreCase(((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "marqee";
    Object v2 = true;
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "body";
    Object v5 = false;
    Object v6 = ((org.jsoup.nodes.Attributes)v3).put(((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "colgroup";
    Object v8 = "y";
    Object v9 = ((org.jsoup.nodes.Attributes)v6).put(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = ((org.jsoup.nodes.Attributes)v9).isEmpty();
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "marqee";
    Object v2 = true;
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "body";
    Object v5 = false;
    Object v6 = ((org.jsoup.nodes.Attributes)v3).put(((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "=";
    ((org.jsoup.nodes.Attributes)v6).remove(((java.lang.String)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "marqee";
    Object v2 = true;
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "body";
    Object v5 = false;
    Object v6 = ((org.jsoup.nodes.Attributes)v3).put(((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "colgroup";
    Object v8 = "y";
    Object v9 = ((org.jsoup.nodes.Attributes)v6).put(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = "/";
    Object v11 = ((org.jsoup.nodes.Attributes)v9).hasKeyIgnoreCase(((java.lang.String)v10));
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "marqee";
    Object v2 = true;
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "body";
    Object v5 = false;
    Object v6 = ((org.jsoup.nodes.Attributes)v3).put(((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "colgroup";
    Object v8 = "y";
    Object v9 = ((org.jsoup.nodes.Attributes)v6).put(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = new java.io.StringWriter();
    Object v11 = "tablec";
    Object v12 = "H";
    Object v13 = org.jsoup.parser.Parser.parse(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = org.jsoup.nodes.NodeUtils.outputSettings(((org.jsoup.nodes.Node)v13));
    ((org.jsoup.nodes.Attributes)v9).html(((java.lang.Appendable)v10),((org.jsoup.nodes.Document.OutputSettings)v14));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "marqee";
    Object v2 = true;
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((org.jsoup.nodes.Attributes)v3).isEmpty();
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "marqee";
    Object v2 = true;
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "basefont";
    Object v5 = ((org.jsoup.nodes.Attributes)v3).hasKey(((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "marqee";
    Object v2 = true;
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "body";
    Object v5 = false;
    Object v6 = ((org.jsoup.nodes.Attributes)v3).put(((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "colgroup";
    Object v8 = "y";
    Object v9 = ((org.jsoup.nodes.Attributes)v6).put(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = "Data key must not beKempty";
    Object v11 = "hed";
    ((org.jsoup.nodes.Attributes)v9).putIgnoreCase(((java.lang.String)v10),((java.lang.String)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "marqee";
    Object v2 = true;
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "body";
    Object v5 = false;
    Object v6 = ((org.jsoup.nodes.Attributes)v3).put(((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "colgroup";
    Object v8 = "y";
    Object v9 = ((org.jsoup.nodes.Attributes)v6).put(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = new org.jsoup.nodes.Attributes();
    Object v11 = "marqee";
    Object v12 = true;
    Object v13 = ((org.jsoup.nodes.Attributes)v10).put(((java.lang.String)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = "body";
    Object v15 = false;
    Object v16 = ((org.jsoup.nodes.Attributes)v13).put(((java.lang.String)v14),(((java.lang.Boolean)v15).booleanValue()));
    ((org.jsoup.nodes.Attributes)v9).addAll(((org.jsoup.nodes.Attributes)v16));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "marqee";
    Object v2 = true;
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "body";
    Object v5 = false;
    Object v6 = ((org.jsoup.nodes.Attributes)v3).put(((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "colgroup";
    Object v8 = "y";
    Object v9 = ((org.jsoup.nodes.Attributes)v6).put(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = "tra";
    Object v11 = true;
    Object v12 = ((org.jsoup.nodes.Attributes)v9).put(((java.lang.String)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new org.jsoup.nodes.Attributes();
    Object v14 = "marqee";
    Object v15 = true;
    Object v16 = ((org.jsoup.nodes.Attributes)v13).put(((java.lang.String)v14),(((java.lang.Boolean)v15).booleanValue()));
    ((org.jsoup.nodes.Attributes)v12).addAll(((org.jsoup.nodes.Attributes)v16));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "marqee";
    Object v2 = true;
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "";
    Object v5 = ((org.jsoup.nodes.Attributes)v3).get(((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)(""), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "marqee";
    Object v2 = true;
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new org.jsoup.nodes.Attributes();
    Object v5 = "marqee";
    Object v6 = true;
    Object v7 = ((org.jsoup.nodes.Attributes)v4).put(((java.lang.String)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = "body";
    Object v9 = false;
    Object v10 = ((org.jsoup.nodes.Attributes)v7).put(((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()));
    ((org.jsoup.nodes.Attributes)v3).addAll(((org.jsoup.nodes.Attributes)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "marqee";
    Object v2 = true;
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "body";
    Object v5 = false;
    Object v6 = ((org.jsoup.nodes.Attributes)v3).put(((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "codE";
    Object v8 = "d";
    Object v9 = ((org.jsoup.nodes.Attributes)v6).put(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = ((org.jsoup.nodes.Attributes)v9).asList();
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "marqee";
    Object v2 = true;
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "body";
    Object v5 = false;
    Object v6 = ((org.jsoup.nodes.Attributes)v3).put(((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "colgroup";
    Object v8 = "y";
    Object v9 = ((org.jsoup.nodes.Attributes)v6).put(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = ((org.jsoup.nodes.Attributes)v9).asList();
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "marqee";
    Object v2 = true;
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new org.jsoup.nodes.Attributes();
    Object v5 = "marqee";
    Object v6 = true;
    Object v7 = ((org.jsoup.nodes.Attributes)v4).put(((java.lang.String)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = "basefont";
    Object v9 = ((org.jsoup.nodes.Attributes)v7).hasKey(((java.lang.String)v8));
    Object v10 = ((org.jsoup.nodes.Attributes)v3).equals(((java.lang.Object)v9));
    Object v11 = "Iyndex must be numeric";
    Object v12 = ((org.jsoup.nodes.Attributes)v3).indexOfKey(((java.lang.String)v11));
    org.junit.Assert.assertEquals((Object)(-1), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = "charset=";
    Object v1 = org.jsoup.nodes.Attributes.checkNotNull(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("charset="), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "marqee";
    Object v2 = true;
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "body";
    Object v5 = false;
    Object v6 = ((org.jsoup.nodes.Attributes)v3).put(((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "colgroup";
    Object v8 = "y";
    Object v9 = ((org.jsoup.nodes.Attributes)v6).put(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = "op8tgroup";
    Object v11 = ((org.jsoup.nodes.Attributes)v9).hasKey(((java.lang.String)v10));
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "marqee";
    Object v2 = true;
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "body";
    Object v5 = false;
    Object v6 = ((org.jsoup.nodes.Attributes)v3).put(((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "colgroup";
    Object v8 = "y";
    Object v9 = ((org.jsoup.nodes.Attributes)v6).put(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = "option";
    Object v11 = ((org.jsoup.nodes.Attributes)v9).get(((java.lang.String)v10));
    org.junit.Assert.assertEquals((Object)(""), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "marqee";
    Object v2 = true;
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "body";
    Object v5 = false;
    Object v6 = ((org.jsoup.nodes.Attributes)v3).put(((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "colgroup";
    Object v8 = "y";
    Object v9 = ((org.jsoup.nodes.Attributes)v6).put(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = true;
    Object v11 = true;
    Object v12 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v10).booleanValue()),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = ((org.jsoup.nodes.Attributes)v9).deduplicate(((org.jsoup.parser.ParseSettings)v12));
    org.junit.Assert.assertEquals((Object)(0), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "marqee";
    Object v2 = true;
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "body";
    Object v5 = false;
    Object v6 = ((org.jsoup.nodes.Attributes)v3).put(((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "codE";
    Object v8 = "d";
    Object v9 = ((org.jsoup.nodes.Attributes)v6).put(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = "(";
    Object v11 = ((org.jsoup.nodes.Attributes)v9).get(((java.lang.String)v10));
    org.junit.Assert.assertEquals((Object)(""), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = "caption";
    Object v1 = org.jsoup.nodes.Attributes.checkNotNull(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("caption"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "marqee";
    Object v2 = true;
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "body";
    Object v5 = false;
    Object v6 = ((org.jsoup.nodes.Attributes)v3).put(((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "codE";
    Object v8 = "d";
    Object v9 = ((org.jsoup.nodes.Attributes)v6).put(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = "tCble";
    Object v11 = "c";
    Object v12 = ((org.jsoup.nodes.Attributes)v9).add(((java.lang.String)v10),((java.lang.String)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "marqee";
    Object v2 = true;
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "body";
    Object v5 = false;
    Object v6 = ((org.jsoup.nodes.Attributes)v3).put(((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "codE";
    Object v8 = "d";
    Object v9 = ((org.jsoup.nodes.Attributes)v6).put(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = "pa+ram";
    ((org.jsoup.nodes.Attributes)v9).remove(((java.lang.String)v10));
    Object v11 = null;
    Object v12 = "html";
    Object v13 = ((org.jsoup.nodes.Attributes)v9).hasKeyIgnoreCase(((java.lang.String)v12));
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "marqee";
    Object v2 = true;
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "body";
    Object v5 = false;
    Object v6 = ((org.jsoup.nodes.Attributes)v3).put(((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "colgroup";
    Object v8 = "y";
    Object v9 = ((org.jsoup.nodes.Attributes)v6).put(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = "tra";
    Object v11 = true;
    Object v12 = ((org.jsoup.nodes.Attributes)v9).put(((java.lang.String)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = "checkd";
    Object v14 = ((org.jsoup.nodes.Attributes)v12).getIgnoreCase(((java.lang.String)v13));
    org.junit.Assert.assertEquals((Object)(""), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "marqee";
    Object v2 = true;
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "body";
    Object v5 = false;
    Object v6 = ((org.jsoup.nodes.Attributes)v3).put(((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "codE";
    Object v8 = "d";
    Object v9 = ((org.jsoup.nodes.Attributes)v6).put(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = new org.jsoup.nodes.Attributes();
    Object v11 = "marqee";
    Object v12 = true;
    Object v13 = ((org.jsoup.nodes.Attributes)v10).put(((java.lang.String)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = "body";
    Object v15 = false;
    Object v16 = ((org.jsoup.nodes.Attributes)v13).put(((java.lang.String)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = "codE";
    Object v18 = "d";
    Object v19 = ((org.jsoup.nodes.Attributes)v16).put(((java.lang.String)v17),((java.lang.String)v18));
    ((org.jsoup.nodes.Attributes)v9).addAll(((org.jsoup.nodes.Attributes)v19));
    Object v20 = null;
    Object v21 = ((org.jsoup.nodes.Attributes)v9).iterator();
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "marqee";
    Object v2 = true;
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "p";
    Object v5 = ((org.jsoup.nodes.Attributes)v3).hasKeyIgnoreCase(((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "marqee";
    Object v2 = true;
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "body";
    Object v5 = false;
    Object v6 = ((org.jsoup.nodes.Attributes)v3).put(((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "codE";
    Object v8 = "d";
    Object v9 = ((org.jsoup.nodes.Attributes)v6).put(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = "S}YSTEM";
    Object v11 = ((org.jsoup.nodes.Attributes)v9).get(((java.lang.String)v10));
    org.junit.Assert.assertEquals((Object)(""), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "marqee";
    Object v2 = true;
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "body";
    Object v5 = false;
    Object v6 = ((org.jsoup.nodes.Attributes)v3).put(((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "codE";
    Object v8 = "d";
    Object v9 = ((org.jsoup.nodes.Attributes)v6).put(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = "charset=";
    Object v11 = org.jsoup.nodes.Attributes.checkNotNull(((java.lang.String)v10));
    Object v12 = ((org.jsoup.nodes.Attributes)v9).equals(((java.lang.Object)v11));
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "marqee";
    Object v2 = true;
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "body";
    Object v5 = false;
    Object v6 = ((org.jsoup.nodes.Attributes)v3).put(((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "colgroup";
    Object v8 = "y";
    Object v9 = ((org.jsoup.nodes.Attributes)v6).put(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = "basefon";
    Object v11 = "noframes";
    ((org.jsoup.nodes.Attributes)v9).putIgnoreCase(((java.lang.String)v10),((java.lang.String)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "marqee";
    Object v2 = true;
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "body";
    Object v5 = false;
    Object v6 = ((org.jsoup.nodes.Attributes)v3).put(((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "codE";
    Object v8 = "d";
    Object v9 = ((org.jsoup.nodes.Attributes)v6).put(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = new org.jsoup.nodes.Attributes();
    Object v11 = "marqee";
    Object v12 = true;
    Object v13 = ((org.jsoup.nodes.Attributes)v10).put(((java.lang.String)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = "body";
    Object v15 = false;
    Object v16 = ((org.jsoup.nodes.Attributes)v13).put(((java.lang.String)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = "colgroup";
    Object v18 = "y";
    Object v19 = ((org.jsoup.nodes.Attributes)v16).put(((java.lang.String)v17),((java.lang.String)v18));
    Object v20 = "/";
    Object v21 = ((org.jsoup.nodes.Attributes)v19).hasKeyIgnoreCase(((java.lang.String)v20));
    Object v22 = ((org.jsoup.nodes.Attributes)v9).equals(((java.lang.Object)v21));
    Object v23 = "comZmand";
    ((org.jsoup.nodes.Attributes)v9).remove(((java.lang.String)v23));
    Object v24 = null;
    org.junit.Assert.assertNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "marqee";
    Object v2 = true;
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "body";
    Object v5 = false;
    Object v6 = ((org.jsoup.nodes.Attributes)v3).put(((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "colgroup";
    Object v8 = "y";
    Object v9 = ((org.jsoup.nodes.Attributes)v6).put(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = "";
    Object v11 = false;
    Object v12 = ((org.jsoup.nodes.Attributes)v9).put(((java.lang.String)v10),(((java.lang.Boolean)v11).booleanValue()));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "marqee";
    Object v2 = true;
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new org.jsoup.nodes.Attributes();
    Object v5 = "marqee";
    Object v6 = true;
    Object v7 = ((org.jsoup.nodes.Attributes)v4).put(((java.lang.String)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = "body";
    Object v9 = false;
    Object v10 = ((org.jsoup.nodes.Attributes)v7).put(((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = "colgroup";
    Object v12 = "y";
    Object v13 = ((org.jsoup.nodes.Attributes)v10).put(((java.lang.String)v11),((java.lang.String)v12));
    ((org.jsoup.nodes.Attributes)v3).addAll(((org.jsoup.nodes.Attributes)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "marqee";
    Object v2 = true;
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "body";
    Object v5 = false;
    Object v6 = ((org.jsoup.nodes.Attributes)v3).put(((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((org.jsoup.nodes.Attributes)v6).iterator();
    Object v8 = ((org.jsoup.nodes.Attributes)v6).asList();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "marqee";
    Object v2 = true;
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "body";
    Object v5 = false;
    Object v6 = ((org.jsoup.nodes.Attributes)v3).put(((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((java.lang.Iterable)v6).spliterator();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "marqee";
    Object v2 = true;
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "body";
    Object v5 = false;
    Object v6 = ((org.jsoup.nodes.Attributes)v3).put(((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "colgroup";
    Object v8 = "y";
    Object v9 = ((org.jsoup.nodes.Attributes)v6).put(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = "o";
    Object v11 = ((org.jsoup.nodes.Attributes)v9).getIgnoreCase(((java.lang.String)v10));
    org.junit.Assert.assertEquals((Object)(""), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "marqee";
    Object v2 = true;
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "ruby";
    ((org.jsoup.nodes.Attributes)v3).remove(((java.lang.String)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "marqee";
    Object v2 = true;
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "body";
    Object v5 = false;
    Object v6 = ((org.jsoup.nodes.Attributes)v3).put(((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "codE";
    Object v8 = "d";
    Object v9 = ((org.jsoup.nodes.Attributes)v6).put(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = "ao";
    Object v11 = ((org.jsoup.nodes.Attributes)v9).getIgnoreCase(((java.lang.String)v10));
    org.junit.Assert.assertEquals((Object)(""), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "marqee";
    Object v2 = true;
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "body";
    Object v5 = false;
    Object v6 = ((org.jsoup.nodes.Attributes)v3).put(((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((org.jsoup.nodes.Attributes)v6).isEmpty();
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "marqee";
    Object v2 = true;
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "body";
    Object v5 = false;
    Object v6 = ((org.jsoup.nodes.Attributes)v3).put(((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((org.jsoup.nodes.Attributes)v6).asList();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "marqee";
    Object v2 = true;
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "body";
    Object v5 = false;
    Object v6 = ((org.jsoup.nodes.Attributes)v3).put(((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "colgroup";
    Object v8 = "y";
    Object v9 = ((org.jsoup.nodes.Attributes)v6).put(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = "table";
    Object v11 = ((org.jsoup.nodes.Attributes)v9).indexOfKey(((java.lang.String)v10));
    org.junit.Assert.assertEquals((Object)(-1), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "marqee";
    Object v2 = true;
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "body";
    Object v5 = false;
    Object v6 = ((org.jsoup.nodes.Attributes)v3).put(((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "codE";
    Object v8 = "d";
    Object v9 = ((org.jsoup.nodes.Attributes)v6).put(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = "tCble";
    Object v11 = "c";
    Object v12 = ((org.jsoup.nodes.Attributes)v9).add(((java.lang.String)v10),((java.lang.String)v11));
    ((org.jsoup.nodes.Attributes)v12).normalize();
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "marqee";
    Object v2 = true;
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "body";
    Object v5 = false;
    Object v6 = ((org.jsoup.nodes.Attributes)v3).put(((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "colgroup";
    Object v8 = "y";
    Object v9 = ((org.jsoup.nodes.Attributes)v6).put(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = "html";
    Object v11 = ((org.jsoup.nodes.Attributes)v9).hasKey(((java.lang.String)v10));
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "marqee";
    Object v2 = true;
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "body";
    Object v5 = false;
    Object v6 = ((org.jsoup.nodes.Attributes)v3).put(((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "html";
    Object v8 = "colgroup";
    ((org.jsoup.nodes.Attributes)v6).putIgnoreCase(((java.lang.String)v7),((java.lang.String)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "marqee";
    Object v2 = true;
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "body";
    Object v5 = false;
    Object v6 = ((org.jsoup.nodes.Attributes)v3).put(((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "colgroup";
    Object v8 = "y";
    Object v9 = ((org.jsoup.nodes.Attributes)v6).put(((java.lang.String)v7),((java.lang.String)v8));
    ((org.jsoup.nodes.Attributes)v9).normalize();
    Object v10 = null;
    Object v11 = "";
    Object v12 = "hp";
    ((org.jsoup.nodes.Attributes)v9).putIgnoreCase(((java.lang.String)v11),((java.lang.String)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "marqee";
    Object v2 = true;
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "body";
    Object v5 = false;
    Object v6 = ((org.jsoup.nodes.Attributes)v3).put(((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "td";
    Object v8 = ((org.jsoup.nodes.Attributes)v6).hasKeyIgnoreCase(((java.lang.String)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "marqee";
    Object v2 = true;
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "body";
    Object v5 = false;
    Object v6 = ((org.jsoup.nodes.Attributes)v3).put(((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "codE";
    Object v8 = "d";
    Object v9 = ((org.jsoup.nodes.Attributes)v6).put(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = "th";
    Object v11 = ((org.jsoup.nodes.Attributes)v9).hasKeyIgnoreCase(((java.lang.String)v10));
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "marqee";
    Object v2 = true;
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new java.io.StringWriter();
    Object v5 = "tablec";
    Object v6 = "H";
    Object v7 = org.jsoup.parser.Parser.parse(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = org.jsoup.nodes.NodeUtils.outputSettings(((org.jsoup.nodes.Node)v7));
    ((org.jsoup.nodes.Attributes)v3).html(((java.lang.Appendable)v4),((org.jsoup.nodes.Document.OutputSettings)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "marqee";
    Object v2 = true;
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "body";
    Object v5 = false;
    Object v6 = ((org.jsoup.nodes.Attributes)v3).put(((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "          l  ";
    Object v8 = ((org.jsoup.nodes.Attributes)v6).hasKey(((java.lang.String)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "marqee";
    Object v2 = true;
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "body";
    Object v5 = false;
    Object v6 = ((org.jsoup.nodes.Attributes)v3).put(((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((org.jsoup.nodes.Attributes)v6).clone();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "marqee";
    Object v2 = true;
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "body";
    Object v5 = false;
    Object v6 = ((org.jsoup.nodes.Attributes)v3).put(((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((org.jsoup.nodes.Attributes)v6).clone();
    Object v8 = "source";
    Object v9 = ((org.jsoup.nodes.Attributes)v7).getIgnoreCase(((java.lang.String)v8));
    org.junit.Assert.assertEquals((Object)(""), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "marqee";
    Object v2 = true;
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "body";
    Object v5 = false;
    Object v6 = ((org.jsoup.nodes.Attributes)v3).put(((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "codE";
    Object v8 = "d";
    Object v9 = ((org.jsoup.nodes.Attributes)v6).put(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = ((org.jsoup.nodes.Attributes)v9).asList();
    Object v11 = "tt";
    Object v12 = ((org.jsoup.nodes.Attributes)v9).get(((java.lang.String)v11));
    org.junit.Assert.assertEquals((Object)(""), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "marqee";
    Object v2 = true;
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "body";
    Object v5 = false;
    Object v6 = ((org.jsoup.nodes.Attributes)v3).put(((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "";
    ((org.jsoup.nodes.Attributes)v6).removeIgnoreCase(((java.lang.String)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "marqee";
    Object v2 = true;
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "body";
    Object v5 = false;
    Object v6 = ((org.jsoup.nodes.Attributes)v3).put(((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "codE";
    Object v8 = "d";
    Object v9 = ((org.jsoup.nodes.Attributes)v6).put(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = "h_ad";
    ((org.jsoup.nodes.Attributes)v9).remove(((java.lang.String)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "marqee";
    Object v2 = true;
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "body";
    Object v5 = false;
    Object v6 = ((org.jsoup.nodes.Attributes)v3).put(((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "colgroup";
    Object v8 = "y";
    Object v9 = ((org.jsoup.nodes.Attributes)v6).put(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = ((java.lang.Iterable)v9).spliterator();
    Object v11 = new org.jsoup.nodes.Attributes();
    Object v12 = "marqee";
    Object v13 = true;
    Object v14 = ((org.jsoup.nodes.Attributes)v11).put(((java.lang.String)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = "body";
    Object v16 = false;
    Object v17 = ((org.jsoup.nodes.Attributes)v14).put(((java.lang.String)v15),(((java.lang.Boolean)v16).booleanValue()));
    ((org.jsoup.nodes.Attributes)v9).addAll(((org.jsoup.nodes.Attributes)v17));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "marqee";
    Object v2 = true;
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "body";
    Object v5 = false;
    Object v6 = ((org.jsoup.nodes.Attributes)v3).put(((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((org.jsoup.nodes.Attributes)v6).clone();
    Object v8 = "html";
    Object v9 = ((org.jsoup.nodes.Attributes)v7).hasKey(((java.lang.String)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "marqee";
    Object v2 = true;
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "body";
    Object v5 = false;
    Object v6 = ((org.jsoup.nodes.Attributes)v3).put(((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new org.jsoup.nodes.Attributes();
    Object v8 = "marqee";
    Object v9 = true;
    Object v10 = ((org.jsoup.nodes.Attributes)v7).put(((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = "body";
    Object v12 = false;
    Object v13 = ((org.jsoup.nodes.Attributes)v10).put(((java.lang.String)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((org.jsoup.nodes.Attributes)v13).clone();
    ((org.jsoup.nodes.Attributes)v6).addAll(((org.jsoup.nodes.Attributes)v14));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "marqee";
    Object v2 = true;
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "body";
    Object v5 = false;
    Object v6 = ((org.jsoup.nodes.Attributes)v3).put(((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "bgsund";
    Object v8 = false;
    Object v9 = ((org.jsoup.nodes.Attributes)v6).put(((java.lang.String)v7),(((java.lang.Boolean)v8).booleanValue()));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "marqee";
    Object v2 = true;
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "body";
    Object v5 = false;
    Object v6 = ((org.jsoup.nodes.Attributes)v3).put(((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "bgsund";
    Object v8 = false;
    Object v9 = ((org.jsoup.nodes.Attributes)v6).put(((java.lang.String)v7),(((java.lang.Boolean)v8).booleanValue()));
    ((org.jsoup.nodes.Attributes)v9).normalize();
    Object v10 = null;
    Object v11 = ((org.jsoup.nodes.Attributes)v9).asList();
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = "body";
    Object v1 = org.jsoup.nodes.Attributes.checkNotNull(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("body"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "marqee";
    Object v2 = true;
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "body";
    Object v5 = false;
    Object v6 = ((org.jsoup.nodes.Attributes)v3).put(((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((org.jsoup.nodes.Attributes)v6).clone();
    ((org.jsoup.nodes.Attributes)v7).normalize();
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "marqee";
    Object v2 = true;
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "body";
    Object v5 = false;
    Object v6 = ((org.jsoup.nodes.Attributes)v3).put(((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "bgsund";
    Object v8 = false;
    Object v9 = ((org.jsoup.nodes.Attributes)v6).put(((java.lang.String)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = true;
    Object v11 = true;
    Object v12 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v10).booleanValue()),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = ((org.jsoup.nodes.Attributes)v9).deduplicate(((org.jsoup.parser.ParseSettings)v12));
    Object v14 = new org.jsoup.nodes.Attributes();
    Object v15 = "marqee";
    Object v16 = true;
    Object v17 = ((org.jsoup.nodes.Attributes)v14).put(((java.lang.String)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = "body";
    Object v19 = false;
    Object v20 = ((org.jsoup.nodes.Attributes)v17).put(((java.lang.String)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = "bgsund";
    Object v22 = false;
    Object v23 = ((org.jsoup.nodes.Attributes)v20).put(((java.lang.String)v21),(((java.lang.Boolean)v22).booleanValue()));
    ((org.jsoup.nodes.Attributes)v9).addAll(((org.jsoup.nodes.Attributes)v23));
    Object v24 = null;
    org.junit.Assert.assertNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "marqee";
    Object v2 = true;
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "body";
    Object v5 = false;
    Object v6 = ((org.jsoup.nodes.Attributes)v3).put(((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "v";
    Object v8 = ((org.jsoup.nodes.Attributes)v6).hasKey(((java.lang.String)v7));
    Object v9 = new org.jsoup.nodes.Attributes();
    Object v10 = "marqee";
    Object v11 = true;
    Object v12 = ((org.jsoup.nodes.Attributes)v9).put(((java.lang.String)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = "body";
    Object v14 = false;
    Object v15 = ((org.jsoup.nodes.Attributes)v12).put(((java.lang.String)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = "bgsund";
    Object v17 = false;
    Object v18 = ((org.jsoup.nodes.Attributes)v15).put(((java.lang.String)v16),(((java.lang.Boolean)v17).booleanValue()));
    ((org.jsoup.nodes.Attributes)v6).addAll(((org.jsoup.nodes.Attributes)v18));
    Object v19 = null;
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "marqee";
    Object v2 = true;
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "body";
    Object v5 = false;
    Object v6 = ((org.jsoup.nodes.Attributes)v3).put(((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((org.jsoup.nodes.Attributes)v6).clone();
    Object v8 = "n";
    Object v9 = ((org.jsoup.nodes.Attributes)v7).indexOfKey(((java.lang.String)v8));
    org.junit.Assert.assertEquals((Object)(-1), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "marqee";
    Object v2 = true;
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((org.jsoup.nodes.Attributes)v3).asList();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "marqee";
    Object v2 = true;
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "body";
    Object v5 = false;
    Object v6 = ((org.jsoup.nodes.Attributes)v3).put(((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "bgsund";
    Object v8 = false;
    Object v9 = ((org.jsoup.nodes.Attributes)v6).put(((java.lang.String)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = "jtable";
    ((org.jsoup.nodes.Attributes)v9).remove(((java.lang.String)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "marqee";
    Object v2 = true;
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "body";
    Object v5 = false;
    Object v6 = ((org.jsoup.nodes.Attributes)v3).put(((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "codE";
    Object v8 = "d";
    Object v9 = ((org.jsoup.nodes.Attributes)v6).put(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = ((org.jsoup.nodes.Attributes)v9).isEmpty();
    org.junit.Assert.assertEquals((Object)(false), v10);
  }
}
