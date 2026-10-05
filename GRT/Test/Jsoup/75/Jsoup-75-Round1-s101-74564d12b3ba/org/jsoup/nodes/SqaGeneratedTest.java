package org.jsoup.nodes;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "optio";
    Object v2 = "h_ml";
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "optio";
    Object v2 = "h_ml";
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "Cannot remove a protocol that is not set.";
    Object v5 = "optgroup";
    Object v6 = new org.jsoup.nodes.Attribute(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Attributes)v3).put(((org.jsoup.nodes.Attribute)v6));
    Object v8 = "html";
    Object v9 = ((org.jsoup.nodes.Attributes)v3).indexOfKey(((java.lang.String)v8));
    org.junit.Assert.assertEquals((Object)(-1), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "optio";
    Object v2 = "h_ml";
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),((java.lang.String)v2));
    ((org.jsoup.nodes.Attributes)v3).normalize();
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "body";
    Object v2 = ((org.jsoup.nodes.Attributes)v0).hasKeyIgnoreCase(((java.lang.String)v1));
    Object v3 = "html";
    ((org.jsoup.nodes.Attributes)v0).removeIgnoreCase(((java.lang.String)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "optio";
    Object v2 = "h_ml";
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "noscript";
    Object v5 = ((org.jsoup.nodes.Attributes)v3).hasKeyIgnoreCase(((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "optio";
    Object v2 = "h_ml";
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "tr";
    Object v5 = true;
    Object v6 = ((org.jsoup.nodes.Attributes)v3).put(((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "optio";
    Object v2 = "h_ml";
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "tbody";
    Object v5 = true;
    Object v6 = ((org.jsoup.nodes.Attributes)v3).put(((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = "check";
    Object v1 = org.jsoup.nodes.Attributes.checkNotNull(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("check"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "optio";
    Object v2 = "h_ml";
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "tr";
    Object v5 = true;
    Object v6 = ((org.jsoup.nodes.Attributes)v3).put(((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "html";
    ((org.jsoup.nodes.Attributes)v6).remove(((java.lang.String)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = "head";
    Object v1 = org.jsoup.nodes.Attributes.checkNotNull(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("head"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = "h3";
    Object v1 = org.jsoup.nodes.Attributes.checkNotNull(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("h3"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "html";
    Object v2 = ((org.jsoup.nodes.Attributes)v0).get(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)(""), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "optio";
    Object v2 = "h_ml";
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "capt";
    Object v5 = ((org.jsoup.nodes.Attributes)v3).hasKeyIgnoreCase(((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "optio";
    Object v2 = "h_ml";
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "tr";
    Object v5 = true;
    Object v6 = ((org.jsoup.nodes.Attributes)v3).put(((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "Cannot remove a protocol that is not set.";
    Object v8 = "optgroup";
    Object v9 = new org.jsoup.nodes.Attribute(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = "B";
    ((org.jsoup.nodes.Attribute)v9).setKey(((java.lang.String)v10));
    Object v11 = null;
    Object v12 = ((org.jsoup.nodes.Attributes)v6).put(((org.jsoup.nodes.Attribute)v9));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "optio";
    Object v2 = "h_ml";
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "tr";
    Object v5 = true;
    Object v6 = ((org.jsoup.nodes.Attributes)v3).put(((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "p";
    Object v8 = "=";
    Object v9 = ((org.jsoup.nodes.Attributes)v6).put(((java.lang.String)v7),((java.lang.String)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "optio";
    Object v2 = "h_ml";
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "span";
    Object v5 = "codE";
    Object v6 = ((org.jsoup.nodes.Attributes)v3).put(((java.lang.String)v4),((java.lang.String)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "optio";
    Object v2 = "h_ml";
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = java.io.Writer.nullWriter();
    Object v5 = new org.jsoup.nodes.Document.OutputSettings();
    ((org.jsoup.nodes.Attributes)v3).html(((java.lang.Appendable)v4),((org.jsoup.nodes.Document.OutputSettings)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "optio";
    Object v2 = "h_ml";
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "tr";
    Object v5 = true;
    Object v6 = ((org.jsoup.nodes.Attributes)v3).put(((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "html";
    Object v8 = ((org.jsoup.nodes.Attributes)v6).getIgnoreCase(((java.lang.String)v7));
    org.junit.Assert.assertEquals((Object)(""), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = ((org.jsoup.nodes.Attributes)v0).html();
    Object v2 = new org.jsoup.nodes.Attributes();
    Object v3 = "optio";
    Object v4 = "h_ml";
    Object v5 = ((org.jsoup.nodes.Attributes)v2).put(((java.lang.String)v3),((java.lang.String)v4));
    ((org.jsoup.nodes.Attributes)v0).addAll(((org.jsoup.nodes.Attributes)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "optio";
    Object v2 = "h_ml";
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "tr";
    Object v5 = true;
    Object v6 = ((org.jsoup.nodes.Attributes)v3).put(((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "Cannot remove a protocol that is not set.";
    Object v8 = "optgroup";
    Object v9 = new org.jsoup.nodes.Attribute(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = "B";
    ((org.jsoup.nodes.Attribute)v9).setKey(((java.lang.String)v10));
    Object v11 = null;
    Object v12 = ((org.jsoup.nodes.Attributes)v6).put(((org.jsoup.nodes.Attribute)v9));
    Object v13 = "value";
    Object v14 = "option";
    Object v15 = ((org.jsoup.nodes.Attributes)v12).put(((java.lang.String)v13),((java.lang.String)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "optio";
    Object v2 = "h_ml";
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "o)tion";
    ((org.jsoup.nodes.Attributes)v3).removeIgnoreCase(((java.lang.String)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "optio";
    Object v2 = "h_ml";
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "html";
    Object v5 = "table";
    ((org.jsoup.nodes.Attributes)v3).putIgnoreCase(((java.lang.String)v4),((java.lang.String)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "h3";
    Object v2 = org.jsoup.nodes.Attributes.checkNotNull(((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Attributes)v0).equals(((java.lang.Object)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "optio";
    Object v2 = "h_ml";
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "tr";
    Object v5 = true;
    Object v6 = ((org.jsoup.nodes.Attributes)v3).put(((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "p";
    Object v8 = "=";
    Object v9 = ((org.jsoup.nodes.Attributes)v6).put(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = ((org.jsoup.nodes.Attributes)v9).asList();
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "optio";
    Object v2 = "h_ml";
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new org.jsoup.nodes.Attributes();
    Object v5 = "html";
    Object v6 = ((org.jsoup.nodes.Attributes)v4).get(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Attributes)v3).equals(((java.lang.Object)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "optio";
    Object v2 = "h_ml";
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "tr";
    Object v5 = true;
    Object v6 = ((org.jsoup.nodes.Attributes)v3).put(((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "p";
    Object v8 = "=";
    Object v9 = ((org.jsoup.nodes.Attributes)v6).put(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = ((org.jsoup.nodes.Attributes)v9).iterator();
    Object v11 = "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36";
    ((org.jsoup.nodes.Attributes)v9).removeIgnoreCase(((java.lang.String)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "optio";
    Object v2 = "h_ml";
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "tr";
    Object v5 = true;
    Object v6 = ((org.jsoup.nodes.Attributes)v3).put(((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "Cannot remove a protocol that is not set.";
    Object v8 = "optgroup";
    Object v9 = new org.jsoup.nodes.Attribute(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = "B";
    ((org.jsoup.nodes.Attribute)v9).setKey(((java.lang.String)v10));
    Object v11 = null;
    Object v12 = ((org.jsoup.nodes.Attributes)v6).put(((org.jsoup.nodes.Attribute)v9));
    Object v13 = "te5mplate";
    Object v14 = ((org.jsoup.nodes.Attributes)v12).hasKey(((java.lang.String)v13));
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = "option";
    Object v1 = org.jsoup.nodes.Attributes.checkNotNull(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("option"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "optio";
    Object v2 = "h_ml";
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "span";
    Object v5 = "codE";
    Object v6 = ((org.jsoup.nodes.Attributes)v3).put(((java.lang.String)v4),((java.lang.String)v5));
    ((org.jsoup.nodes.Attributes)v6).normalize();
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "optio";
    Object v2 = "h_ml";
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "tr";
    Object v5 = true;
    Object v6 = ((org.jsoup.nodes.Attributes)v3).put(((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "Cannot remove a protocol that is not set.";
    Object v8 = "optgroup";
    Object v9 = new org.jsoup.nodes.Attribute(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = "B";
    ((org.jsoup.nodes.Attribute)v9).setKey(((java.lang.String)v10));
    Object v11 = null;
    Object v12 = ((org.jsoup.nodes.Attributes)v6).put(((org.jsoup.nodes.Attribute)v9));
    Object v13 = ((java.lang.Iterable)v12).spliterator();
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "optio";
    Object v2 = "h_ml";
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "span";
    Object v5 = "codE";
    Object v6 = ((org.jsoup.nodes.Attributes)v3).put(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Attributes)v6).clone();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "optio";
    Object v2 = "h_ml";
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "tr";
    Object v5 = true;
    Object v6 = ((org.jsoup.nodes.Attributes)v3).put(((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "";
    Object v8 = ((org.jsoup.nodes.Attributes)v6).get(((java.lang.String)v7));
    org.junit.Assert.assertEquals((Object)(""), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "optio";
    Object v2 = "h_ml";
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "tr";
    Object v5 = true;
    Object v6 = ((org.jsoup.nodes.Attributes)v3).put(((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((org.jsoup.nodes.Attributes)v6).asList();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "optio";
    Object v2 = "h_ml";
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "span";
    Object v5 = "codE";
    Object v6 = ((org.jsoup.nodes.Attributes)v3).put(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = java.io.Writer.nullWriter();
    Object v8 = new org.jsoup.nodes.Document.OutputSettings();
    ((org.jsoup.nodes.Attributes)v6).html(((java.lang.Appendable)v7),((org.jsoup.nodes.Document.OutputSettings)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "optio";
    Object v2 = "h_ml";
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "tr";
    Object v5 = true;
    Object v6 = ((org.jsoup.nodes.Attributes)v3).put(((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "Cannot remove a protocol that is not set.";
    Object v8 = "optgroup";
    Object v9 = new org.jsoup.nodes.Attribute(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = "B";
    ((org.jsoup.nodes.Attribute)v9).setKey(((java.lang.String)v10));
    Object v11 = null;
    Object v12 = ((org.jsoup.nodes.Attributes)v6).put(((org.jsoup.nodes.Attribute)v9));
    Object v13 = "body";
    ((org.jsoup.nodes.Attributes)v12).remove(((java.lang.String)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "optio";
    Object v2 = "h_ml";
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "span";
    Object v5 = "codE";
    Object v6 = ((org.jsoup.nodes.Attributes)v3).put(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Attributes)v6).dataset();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = "-";
    Object v1 = org.jsoup.nodes.Attributes.checkNotNull(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("-"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "optio";
    Object v2 = "h_ml";
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "h";
    Object v5 = "tf'oot";
    ((org.jsoup.nodes.Attributes)v3).putIgnoreCase(((java.lang.String)v4),((java.lang.String)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "optio";
    Object v2 = "h_ml";
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Attributes)v3).asList();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "optio";
    Object v2 = "h_ml";
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "span";
    Object v5 = "codE";
    Object v6 = ((org.jsoup.nodes.Attributes)v3).put(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new org.jsoup.nodes.Attributes();
    Object v8 = "optio";
    Object v9 = "h_ml";
    Object v10 = ((org.jsoup.nodes.Attributes)v7).put(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = "noscript";
    Object v12 = ((org.jsoup.nodes.Attributes)v10).hasKeyIgnoreCase(((java.lang.String)v11));
    Object v13 = ((org.jsoup.nodes.Attributes)v6).equals(((java.lang.Object)v12));
    Object v14 = "html";
    Object v15 = ((org.jsoup.nodes.Attributes)v6).getIgnoreCase(((java.lang.String)v14));
    org.junit.Assert.assertEquals((Object)(""), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "optio";
    Object v2 = "h_ml";
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "span";
    Object v5 = "codE";
    Object v6 = ((org.jsoup.nodes.Attributes)v3).put(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Attributes)v6).clone();
    Object v8 = "h*";
    Object v9 = ((org.jsoup.nodes.Attributes)v7).get(((java.lang.String)v8));
    Object v10 = "optgroup";
    Object v11 = "s";
    Object v12 = ((org.jsoup.nodes.Attributes)v7).put(((java.lang.String)v10),((java.lang.String)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "optio";
    Object v2 = "h_ml";
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "span";
    Object v5 = "codE";
    Object v6 = ((org.jsoup.nodes.Attributes)v3).put(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Attributes)v6).clone();
    Object v8 = "h*";
    Object v9 = ((org.jsoup.nodes.Attributes)v7).get(((java.lang.String)v8));
    Object v10 = "optgroup";
    Object v11 = "s";
    Object v12 = ((org.jsoup.nodes.Attributes)v7).put(((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = "thegad";
    Object v14 = ((org.jsoup.nodes.Attributes)v12).indexOfKey(((java.lang.String)v13));
    org.junit.Assert.assertEquals((Object)(-1), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "optio";
    Object v2 = "h_ml";
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "span";
    Object v5 = "codE";
    Object v6 = ((org.jsoup.nodes.Attributes)v3).put(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Attributes)v6).clone();
    Object v8 = "O";
    Object v9 = ((org.jsoup.nodes.Attributes)v7).hasKey(((java.lang.String)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "optio";
    Object v2 = "h_ml";
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "tr";
    Object v5 = true;
    Object v6 = ((org.jsoup.nodes.Attributes)v3).put(((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "p";
    Object v8 = "=";
    Object v9 = ((org.jsoup.nodes.Attributes)v6).put(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = ((org.jsoup.nodes.Attributes)v9).hashCode();
    org.junit.Assert.assertEquals((Object)(-1677961733), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "optio";
    Object v2 = "h_ml";
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "span";
    Object v5 = "codE";
    Object v6 = ((org.jsoup.nodes.Attributes)v3).put(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Attributes)v6).clone();
    Object v8 = "h*";
    Object v9 = ((org.jsoup.nodes.Attributes)v7).get(((java.lang.String)v8));
    Object v10 = "optgroup";
    Object v11 = "s";
    Object v12 = ((org.jsoup.nodes.Attributes)v7).put(((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = ((org.jsoup.nodes.Attributes)v12).asList();
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "optio";
    Object v2 = "h_ml";
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "tr";
    Object v5 = true;
    Object v6 = ((org.jsoup.nodes.Attributes)v3).put(((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "Cannot remove a protocol that is not set.";
    Object v8 = "optgroup";
    Object v9 = new org.jsoup.nodes.Attribute(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = "B";
    ((org.jsoup.nodes.Attribute)v9).setKey(((java.lang.String)v10));
    Object v11 = null;
    Object v12 = ((org.jsoup.nodes.Attributes)v6).put(((org.jsoup.nodes.Attribute)v9));
    Object v13 = "";
    Object v14 = ((org.jsoup.nodes.Attributes)v12).hasKeyIgnoreCase(((java.lang.String)v13));
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "optio";
    Object v2 = "h_ml";
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "span";
    Object v5 = "codE";
    Object v6 = ((org.jsoup.nodes.Attributes)v3).put(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Attributes)v6).clone();
    Object v8 = "h*";
    Object v9 = ((org.jsoup.nodes.Attributes)v7).get(((java.lang.String)v8));
    Object v10 = "optgroup";
    Object v11 = "s";
    Object v12 = ((org.jsoup.nodes.Attributes)v7).put(((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = "t";
    ((org.jsoup.nodes.Attributes)v12).removeIgnoreCase(((java.lang.String)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "optio";
    Object v2 = "h_ml";
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "span";
    Object v5 = "codE";
    Object v6 = ((org.jsoup.nodes.Attributes)v3).put(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Attributes)v6).clone();
    Object v8 = "h*";
    Object v9 = ((org.jsoup.nodes.Attributes)v7).get(((java.lang.String)v8));
    Object v10 = "optgroup";
    Object v11 = "s";
    Object v12 = ((org.jsoup.nodes.Attributes)v7).put(((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = "p";
    Object v14 = ((org.jsoup.nodes.Attributes)v12).getIgnoreCase(((java.lang.String)v13));
    org.junit.Assert.assertEquals((Object)(""), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = ((org.jsoup.nodes.Attributes)v0).iterator();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "optio";
    Object v2 = "h_ml";
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "span";
    Object v5 = "codE";
    Object v6 = ((org.jsoup.nodes.Attributes)v3).put(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Attributes)v6).clone();
    Object v8 = new org.jsoup.nodes.Attributes();
    Object v9 = "optio";
    Object v10 = "h_ml";
    Object v11 = ((org.jsoup.nodes.Attributes)v8).put(((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = "span";
    Object v13 = "codE";
    Object v14 = ((org.jsoup.nodes.Attributes)v11).put(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = ((org.jsoup.nodes.Attributes)v14).clone();
    Object v16 = "h*";
    Object v17 = ((org.jsoup.nodes.Attributes)v15).get(((java.lang.String)v16));
    Object v18 = "optgroup";
    Object v19 = "s";
    Object v20 = ((org.jsoup.nodes.Attributes)v15).put(((java.lang.String)v18),((java.lang.String)v19));
    ((org.jsoup.nodes.Attributes)v7).addAll(((org.jsoup.nodes.Attributes)v20));
    Object v21 = null;
    org.junit.Assert.assertNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "optio";
    Object v2 = "h_ml";
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "tr";
    Object v5 = true;
    Object v6 = ((org.jsoup.nodes.Attributes)v3).put(((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "Cannot remove a protocol that is not set.";
    Object v8 = "optgroup";
    Object v9 = new org.jsoup.nodes.Attribute(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = "B";
    ((org.jsoup.nodes.Attribute)v9).setKey(((java.lang.String)v10));
    Object v11 = null;
    Object v12 = ((org.jsoup.nodes.Attributes)v6).put(((org.jsoup.nodes.Attribute)v9));
    Object v13 = "thead";
    Object v14 = ((org.jsoup.nodes.Attributes)v12).getIgnoreCase(((java.lang.String)v13));
    org.junit.Assert.assertEquals((Object)(""), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "optio";
    Object v2 = "h_ml";
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "tr";
    Object v5 = true;
    Object v6 = ((org.jsoup.nodes.Attributes)v3).put(((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((java.lang.Iterable)v6).spliterator();
    Object v8 = "o";
    ((org.jsoup.nodes.Attributes)v6).remove(((java.lang.String)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "optio";
    Object v2 = "h_ml";
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "span";
    Object v5 = "codE";
    Object v6 = ((org.jsoup.nodes.Attributes)v3).put(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Attributes)v6).clone();
    Object v8 = "h*";
    Object v9 = ((org.jsoup.nodes.Attributes)v7).get(((java.lang.String)v8));
    Object v10 = "optgroup";
    Object v11 = "s";
    Object v12 = ((org.jsoup.nodes.Attributes)v7).put(((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = "h3";
    Object v14 = org.jsoup.nodes.Attributes.checkNotNull(((java.lang.String)v13));
    Object v15 = ((org.jsoup.nodes.Attributes)v12).equals(((java.lang.Object)v14));
    Object v16 = "select";
    Object v17 = ((org.jsoup.nodes.Attributes)v12).indexOfKey(((java.lang.String)v16));
    org.junit.Assert.assertEquals((Object)(-1), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "optio";
    Object v2 = "h_ml";
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "tr";
    Object v5 = true;
    Object v6 = ((org.jsoup.nodes.Attributes)v3).put(((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new org.jsoup.nodes.Attributes();
    Object v8 = "optio";
    Object v9 = "h_ml";
    Object v10 = ((org.jsoup.nodes.Attributes)v7).put(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = "span";
    Object v12 = "codE";
    Object v13 = ((org.jsoup.nodes.Attributes)v10).put(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = ((org.jsoup.nodes.Attributes)v13).clone();
    Object v15 = "h*";
    Object v16 = ((org.jsoup.nodes.Attributes)v14).get(((java.lang.String)v15));
    Object v17 = "optgroup";
    Object v18 = "s";
    Object v19 = ((org.jsoup.nodes.Attributes)v14).put(((java.lang.String)v17),((java.lang.String)v18));
    ((org.jsoup.nodes.Attributes)v6).addAll(((org.jsoup.nodes.Attributes)v19));
    Object v20 = null;
    ((org.jsoup.nodes.Attributes)v6).normalize();
    Object v21 = null;
    org.junit.Assert.assertNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "optio";
    Object v2 = "h_ml";
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "span";
    Object v5 = "codE";
    Object v6 = ((org.jsoup.nodes.Attributes)v3).put(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Attributes)v6).clone();
    Object v8 = "";
    Object v9 = false;
    Object v10 = ((org.jsoup.nodes.Attributes)v7).put(((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "optio";
    Object v2 = "h_ml";
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "tr";
    Object v5 = true;
    Object v6 = ((org.jsoup.nodes.Attributes)v3).put(((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "Cannot remove a protocol that is not set.";
    Object v8 = "optgroup";
    Object v9 = new org.jsoup.nodes.Attribute(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = "B";
    ((org.jsoup.nodes.Attribute)v9).setKey(((java.lang.String)v10));
    Object v11 = null;
    Object v12 = ((org.jsoup.nodes.Attributes)v6).put(((org.jsoup.nodes.Attribute)v9));
    Object v13 = "CharacterReferenceInData";
    Object v14 = ((org.jsoup.nodes.Attributes)v12).get(((java.lang.String)v13));
    org.junit.Assert.assertEquals((Object)(""), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "optio";
    Object v2 = "h_ml";
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "span";
    Object v5 = "codE";
    Object v6 = ((org.jsoup.nodes.Attributes)v3).put(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Attributes)v6).clone();
    Object v8 = "h*";
    Object v9 = ((org.jsoup.nodes.Attributes)v7).get(((java.lang.String)v8));
    Object v10 = "optgroup";
    Object v11 = "s";
    Object v12 = ((org.jsoup.nodes.Attributes)v7).put(((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = "";
    Object v14 = ((org.jsoup.nodes.Attributes)v12).getIgnoreCase(((java.lang.String)v13));
    Object v15 = "7";
    Object v16 = "@";
    ((org.jsoup.nodes.Attributes)v12).putIgnoreCase(((java.lang.String)v15),((java.lang.String)v16));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "optio";
    Object v2 = "h_ml";
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "tr";
    Object v5 = true;
    Object v6 = ((org.jsoup.nodes.Attributes)v3).put(((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "Cannot remove a protocol that is not set.";
    Object v8 = "optgroup";
    Object v9 = new org.jsoup.nodes.Attribute(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = "B";
    ((org.jsoup.nodes.Attribute)v9).setKey(((java.lang.String)v10));
    Object v11 = null;
    Object v12 = ((org.jsoup.nodes.Attributes)v6).put(((org.jsoup.nodes.Attribute)v9));
    Object v13 = ((org.jsoup.nodes.Attributes)v12).html();
    Object v14 = java.io.Writer.nullWriter();
    Object v15 = new org.jsoup.nodes.Document.OutputSettings();
    ((org.jsoup.nodes.Attributes)v12).html(((java.lang.Appendable)v14),((org.jsoup.nodes.Document.OutputSettings)v15));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "optio";
    Object v2 = "h_ml";
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "tbody";
    Object v5 = ((org.jsoup.nodes.Attributes)v3).hasKeyIgnoreCase(((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "optio";
    Object v2 = "h_ml";
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "tr";
    Object v5 = true;
    Object v6 = ((org.jsoup.nodes.Attributes)v3).put(((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "p";
    Object v8 = "=";
    Object v9 = ((org.jsoup.nodes.Attributes)v6).put(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = ((java.lang.Iterable)v9).spliterator();
    Object v11 = "Zisabled";
    ((org.jsoup.nodes.Attributes)v9).removeIgnoreCase(((java.lang.String)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "optio";
    Object v2 = "h_ml";
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "span";
    Object v5 = "codE";
    Object v6 = ((org.jsoup.nodes.Attributes)v3).put(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((java.lang.Iterable)v6).spliterator();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "optio";
    Object v2 = "h_ml";
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "tr";
    Object v5 = true;
    Object v6 = ((org.jsoup.nodes.Attributes)v3).put(((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new org.jsoup.nodes.Attributes();
    Object v8 = "optio";
    Object v9 = "h_ml";
    Object v10 = ((org.jsoup.nodes.Attributes)v7).put(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = "span";
    Object v12 = "codE";
    Object v13 = ((org.jsoup.nodes.Attributes)v10).put(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = ((org.jsoup.nodes.Attributes)v13).clone();
    Object v15 = "";
    Object v16 = false;
    Object v17 = ((org.jsoup.nodes.Attributes)v14).put(((java.lang.String)v15),(((java.lang.Boolean)v16).booleanValue()));
    ((org.jsoup.nodes.Attributes)v6).addAll(((org.jsoup.nodes.Attributes)v17));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "optio";
    Object v2 = "h_ml";
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "tr";
    Object v5 = true;
    Object v6 = ((org.jsoup.nodes.Attributes)v3).put(((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "p";
    Object v8 = "=";
    Object v9 = ((org.jsoup.nodes.Attributes)v6).put(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = "head";
    Object v11 = ((org.jsoup.nodes.Attributes)v9).indexOfKey(((java.lang.String)v10));
    org.junit.Assert.assertEquals((Object)(-1), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "optio";
    Object v2 = "h_ml";
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "option";
    Object v5 = org.jsoup.nodes.Attributes.checkNotNull(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Attributes)v3).equals(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "optio";
    Object v2 = "h_ml";
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "span";
    Object v5 = "codE";
    Object v6 = ((org.jsoup.nodes.Attributes)v3).put(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Attributes)v6).clone();
    Object v8 = "h*";
    Object v9 = ((org.jsoup.nodes.Attributes)v7).get(((java.lang.String)v8));
    Object v10 = "optgroup";
    Object v11 = "s";
    Object v12 = ((org.jsoup.nodes.Attributes)v7).put(((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = "}</";
    Object v14 = ((org.jsoup.nodes.Attributes)v12).getIgnoreCase(((java.lang.String)v13));
    org.junit.Assert.assertEquals((Object)(""), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "optio";
    Object v2 = "h_ml";
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "span";
    Object v5 = "codE";
    Object v6 = ((org.jsoup.nodes.Attributes)v3).put(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Attributes)v6).clone();
    Object v8 = "h*";
    Object v9 = ((org.jsoup.nodes.Attributes)v7).get(((java.lang.String)v8));
    Object v10 = "optgroup";
    Object v11 = "s";
    Object v12 = ((org.jsoup.nodes.Attributes)v7).put(((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = "tabl";
    Object v14 = ((org.jsoup.nodes.Attributes)v12).get(((java.lang.String)v13));
    org.junit.Assert.assertEquals((Object)(""), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "optio";
    Object v2 = "h_ml";
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "span";
    Object v5 = "codE";
    Object v6 = ((org.jsoup.nodes.Attributes)v3).put(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Attributes)v6).clone();
    Object v8 = "h*";
    Object v9 = ((org.jsoup.nodes.Attributes)v7).get(((java.lang.String)v8));
    Object v10 = "optgroup";
    Object v11 = "s";
    Object v12 = ((org.jsoup.nodes.Attributes)v7).put(((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = ((org.jsoup.nodes.Attributes)v12).dataset();
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "optio";
    Object v2 = "h_ml";
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "tr";
    Object v5 = true;
    Object v6 = ((org.jsoup.nodes.Attributes)v3).put(((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "p";
    Object v8 = "=";
    Object v9 = ((org.jsoup.nodes.Attributes)v6).put(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = "";
    ((org.jsoup.nodes.Attributes)v9).remove(((java.lang.String)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = "ead";
    Object v1 = org.jsoup.nodes.Attributes.checkNotNull(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("ead"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "optio";
    Object v2 = "h_ml";
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "span";
    Object v5 = "codE";
    Object v6 = ((org.jsoup.nodes.Attributes)v3).put(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Attributes)v6).clone();
    Object v8 = "";
    Object v9 = false;
    Object v10 = ((org.jsoup.nodes.Attributes)v7).put(((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = "tfoot";
    ((org.jsoup.nodes.Attributes)v10).removeIgnoreCase(((java.lang.String)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "optio";
    Object v2 = "h_ml";
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "tr";
    Object v5 = true;
    Object v6 = ((org.jsoup.nodes.Attributes)v3).put(((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "Cannot remove a protocol that is not set.";
    Object v8 = "optgroup";
    Object v9 = new org.jsoup.nodes.Attribute(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = "B";
    ((org.jsoup.nodes.Attribute)v9).setKey(((java.lang.String)v10));
    Object v11 = null;
    Object v12 = ((org.jsoup.nodes.Attributes)v6).put(((org.jsoup.nodes.Attribute)v9));
    Object v13 = "link0";
    ((org.jsoup.nodes.Attributes)v12).removeIgnoreCase(((java.lang.String)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "optio";
    Object v2 = "h_ml";
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "tr";
    Object v5 = true;
    Object v6 = ((org.jsoup.nodes.Attributes)v3).put(((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "Cannot remove a protocol that is not set.";
    Object v8 = "optgroup";
    Object v9 = new org.jsoup.nodes.Attribute(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = "B";
    ((org.jsoup.nodes.Attribute)v9).setKey(((java.lang.String)v10));
    Object v11 = null;
    Object v12 = ((org.jsoup.nodes.Attributes)v6).put(((org.jsoup.nodes.Attribute)v9));
    Object v13 = ((org.jsoup.nodes.Attributes)v12).clone();
    Object v14 = new org.jsoup.nodes.Attributes();
    Object v15 = "optio";
    Object v16 = "h_ml";
    Object v17 = ((org.jsoup.nodes.Attributes)v14).put(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = "span";
    Object v19 = "codE";
    Object v20 = ((org.jsoup.nodes.Attributes)v17).put(((java.lang.String)v18),((java.lang.String)v19));
    Object v21 = ((org.jsoup.nodes.Attributes)v20).clone();
    Object v22 = "";
    Object v23 = false;
    Object v24 = ((org.jsoup.nodes.Attributes)v21).put(((java.lang.String)v22),(((java.lang.Boolean)v23).booleanValue()));
    ((org.jsoup.nodes.Attributes)v12).addAll(((org.jsoup.nodes.Attributes)v24));
    Object v25 = null;
    org.junit.Assert.assertNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "optio";
    Object v2 = "h_ml";
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "span";
    Object v5 = "codE";
    Object v6 = ((org.jsoup.nodes.Attributes)v3).put(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Attributes)v6).clone();
    Object v8 = "h*";
    Object v9 = ((org.jsoup.nodes.Attributes)v7).get(((java.lang.String)v8));
    Object v10 = "optgroup";
    Object v11 = "s";
    Object v12 = ((org.jsoup.nodes.Attributes)v7).put(((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = ((org.jsoup.nodes.Attributes)v12).iterator();
    Object v14 = "-";
    Object v15 = org.jsoup.nodes.Attributes.checkNotNull(((java.lang.String)v14));
    Object v16 = ((org.jsoup.nodes.Attributes)v12).equals(((java.lang.Object)v15));
    org.junit.Assert.assertEquals((Object)(false), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "optio";
    Object v2 = "h_ml";
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "span";
    Object v5 = "codE";
    Object v6 = ((org.jsoup.nodes.Attributes)v3).put(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Attributes)v6).clone();
    Object v8 = "";
    Object v9 = false;
    Object v10 = ((org.jsoup.nodes.Attributes)v7).put(((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = new org.jsoup.nodes.Attributes();
    Object v12 = "optio";
    Object v13 = "h_ml";
    Object v14 = ((org.jsoup.nodes.Attributes)v11).put(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = "span";
    Object v16 = "codE";
    Object v17 = ((org.jsoup.nodes.Attributes)v14).put(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = ((org.jsoup.nodes.Attributes)v17).clone();
    Object v19 = "h*";
    Object v20 = ((org.jsoup.nodes.Attributes)v18).get(((java.lang.String)v19));
    Object v21 = "optgroup";
    Object v22 = "s";
    Object v23 = ((org.jsoup.nodes.Attributes)v18).put(((java.lang.String)v21),((java.lang.String)v22));
    Object v24 = "tabl";
    Object v25 = ((org.jsoup.nodes.Attributes)v23).get(((java.lang.String)v24));
    Object v26 = ((org.jsoup.nodes.Attributes)v10).equals(((java.lang.Object)v25));
    Object v27 = java.io.Writer.nullWriter();
    Object v28 = new org.jsoup.nodes.Document.OutputSettings();
    ((org.jsoup.nodes.Attributes)v10).html(((java.lang.Appendable)v27),((org.jsoup.nodes.Document.OutputSettings)v28));
    Object v29 = null;
    org.junit.Assert.assertNull(v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "optio";
    Object v2 = "h_ml";
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "span";
    Object v5 = "codE";
    Object v6 = ((org.jsoup.nodes.Attributes)v3).put(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Attributes)v6).clone();
    Object v8 = "";
    Object v9 = false;
    Object v10 = ((org.jsoup.nodes.Attributes)v7).put(((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = "";
    Object v12 = ((org.jsoup.nodes.Attributes)v10).hasKeyIgnoreCase(((java.lang.String)v11));
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "optio";
    Object v2 = "h_ml";
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "span";
    Object v5 = "codE";
    Object v6 = ((org.jsoup.nodes.Attributes)v3).put(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Attributes)v6).clone();
    Object v8 = ((org.jsoup.nodes.Attributes)v7).iterator();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "optio";
    Object v2 = "h_ml";
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "tr";
    Object v5 = true;
    Object v6 = ((org.jsoup.nodes.Attributes)v3).put(((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()));
    ((org.jsoup.nodes.Attributes)v6).normalize();
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "optio";
    Object v2 = "h_ml";
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Attributes)v3).html();
    Object v5 = java.io.Writer.nullWriter();
    Object v6 = "h3";
    Object v7 = org.jsoup.nodes.Attributes.checkNotNull(((java.lang.String)v6));
    Object v8 = ((java.lang.Appendable)v5).append(((java.lang.CharSequence)v7));
    Object v9 = new org.jsoup.nodes.Document.OutputSettings();
    ((org.jsoup.nodes.Attributes)v3).html(((java.lang.Appendable)v5),((org.jsoup.nodes.Document.OutputSettings)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "optio";
    Object v2 = "h_ml";
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "t~h";
    Object v5 = true;
    Object v6 = ((org.jsoup.nodes.Attributes)v3).put(((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "optio";
    Object v2 = "h_ml";
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "span";
    Object v5 = "codE";
    Object v6 = ((org.jsoup.nodes.Attributes)v3).put(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Attributes)v6).clone();
    Object v8 = ((org.jsoup.nodes.Attributes)v7).clone();
    Object v9 = "title";
    Object v10 = ((org.jsoup.nodes.Attributes)v7).getIgnoreCase(((java.lang.String)v9));
    org.junit.Assert.assertEquals((Object)(""), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "optio";
    Object v2 = "h_ml";
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "tr";
    Object v5 = true;
    Object v6 = ((org.jsoup.nodes.Attributes)v3).put(((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "\r\nw";
    ((org.jsoup.nodes.Attributes)v6).removeIgnoreCase(((java.lang.String)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "optio";
    Object v2 = "h_ml";
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "span";
    Object v5 = "codE";
    Object v6 = ((org.jsoup.nodes.Attributes)v3).put(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Attributes)v6).clone();
    Object v8 = "br";
    Object v9 = ((org.jsoup.nodes.Attributes)v7).hasKeyIgnoreCase(((java.lang.String)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "optio";
    Object v2 = "h_ml";
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "span";
    Object v5 = "codE";
    Object v6 = ((org.jsoup.nodes.Attributes)v3).put(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Attributes)v6).clone();
    Object v8 = "";
    Object v9 = false;
    Object v10 = ((org.jsoup.nodes.Attributes)v7).put(((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()));
    ((org.jsoup.nodes.Attributes)v10).normalize();
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "optio";
    Object v2 = "h_ml";
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "tr";
    Object v5 = true;
    Object v6 = ((org.jsoup.nodes.Attributes)v3).put(((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new org.jsoup.nodes.Attributes();
    Object v8 = "optio";
    Object v9 = "h_ml";
    Object v10 = ((org.jsoup.nodes.Attributes)v7).put(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = "tr";
    Object v12 = true;
    Object v13 = ((org.jsoup.nodes.Attributes)v10).put(((java.lang.String)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = "Cannot remove a protocol that is not set.";
    Object v15 = "optgroup";
    Object v16 = new org.jsoup.nodes.Attribute(((java.lang.String)v14),((java.lang.String)v15));
    Object v17 = "B";
    ((org.jsoup.nodes.Attribute)v16).setKey(((java.lang.String)v17));
    Object v18 = null;
    Object v19 = ((org.jsoup.nodes.Attributes)v13).put(((org.jsoup.nodes.Attribute)v16));
    Object v20 = "value";
    Object v21 = "option";
    Object v22 = ((org.jsoup.nodes.Attributes)v19).put(((java.lang.String)v20),((java.lang.String)v21));
    ((org.jsoup.nodes.Attributes)v6).addAll(((org.jsoup.nodes.Attributes)v22));
    Object v23 = null;
    org.junit.Assert.assertNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "optio";
    Object v2 = "h_ml";
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "tr";
    Object v5 = true;
    Object v6 = ((org.jsoup.nodes.Attributes)v3).put(((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "Cannot remove a protocol that is not set.";
    Object v8 = "optgroup";
    Object v9 = new org.jsoup.nodes.Attribute(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = "B";
    ((org.jsoup.nodes.Attribute)v9).setKey(((java.lang.String)v10));
    Object v11 = null;
    Object v12 = ((org.jsoup.nodes.Attributes)v6).put(((org.jsoup.nodes.Attribute)v9));
    ((org.jsoup.nodes.Attributes)v12).normalize();
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "optio";
    Object v2 = "h_ml";
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "tr";
    Object v5 = "track";
    Object v6 = ((org.jsoup.nodes.Attributes)v3).put(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = "ft&";
    Object v8 = ((org.jsoup.nodes.Attributes)v3).indexOfKey(((java.lang.String)v7));
    org.junit.Assert.assertEquals((Object)(-1), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "optio";
    Object v2 = "h_ml";
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "span";
    Object v5 = "codE";
    Object v6 = ((org.jsoup.nodes.Attributes)v3).put(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = "ehead";
    Object v8 = ((org.jsoup.nodes.Attributes)v6).hasKeyIgnoreCase(((java.lang.String)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "optio";
    Object v2 = "h_ml";
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "span";
    Object v5 = "codE";
    Object v6 = ((org.jsoup.nodes.Attributes)v3).put(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Attributes)v6).clone();
    Object v8 = "h*";
    Object v9 = ((org.jsoup.nodes.Attributes)v7).get(((java.lang.String)v8));
    Object v10 = "optgroup";
    Object v11 = "s";
    Object v12 = ((org.jsoup.nodes.Attributes)v7).put(((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = ((org.jsoup.nodes.Attributes)v12).hashCode();
    Object v14 = "h5";
    Object v15 = "DoctypPublicIdentifier_doubleQuoted";
    Object v16 = ((org.jsoup.nodes.Attributes)v12).put(((java.lang.String)v14),((java.lang.String)v15));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "optio";
    Object v2 = "h_ml";
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "span";
    Object v5 = "codE";
    Object v6 = ((org.jsoup.nodes.Attributes)v3).put(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Attributes)v6).clone();
    Object v8 = "h*";
    Object v9 = ((org.jsoup.nodes.Attributes)v7).get(((java.lang.String)v8));
    Object v10 = "optgroup";
    Object v11 = "s";
    Object v12 = ((org.jsoup.nodes.Attributes)v7).put(((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = "tfEoot";
    ((org.jsoup.nodes.Attributes)v12).remove(((java.lang.String)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "optio";
    Object v2 = "h_ml";
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "span";
    Object v5 = "codE";
    Object v6 = ((org.jsoup.nodes.Attributes)v3).put(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = "";
    Object v8 = ((org.jsoup.nodes.Attributes)v6).get(((java.lang.String)v7));
    org.junit.Assert.assertEquals((Object)(""), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "optio";
    Object v2 = "h_ml";
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "span";
    Object v5 = "codE";
    Object v6 = ((org.jsoup.nodes.Attributes)v3).put(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Attributes)v6).clone();
    Object v8 = "html";
    Object v9 = ((org.jsoup.nodes.Attributes)v7).hasKey(((java.lang.String)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "optio";
    Object v2 = "h_ml";
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "span";
    Object v5 = "codE";
    Object v6 = ((org.jsoup.nodes.Attributes)v3).put(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Attributes)v6).clone();
    Object v8 = "";
    Object v9 = false;
    Object v10 = ((org.jsoup.nodes.Attributes)v7).put(((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = "tfo";
    Object v12 = "tr";
    Object v13 = ((org.jsoup.nodes.Attributes)v10).put(((java.lang.String)v11),((java.lang.String)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "optio";
    Object v2 = "h_ml";
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "span";
    Object v5 = "codE";
    Object v6 = ((org.jsoup.nodes.Attributes)v3).put(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Attributes)v6).clone();
    Object v8 = "";
    Object v9 = false;
    Object v10 = ((org.jsoup.nodes.Attributes)v7).put(((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = "tfo";
    Object v12 = "tr";
    Object v13 = ((org.jsoup.nodes.Attributes)v10).put(((java.lang.String)v11),((java.lang.String)v12));
    ((org.jsoup.nodes.Attributes)v13).normalize();
    Object v14 = null;
    Object v15 = ((org.jsoup.nodes.Attributes)v13).asList();
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "optio";
    Object v2 = "h_ml";
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "span";
    Object v5 = "codE";
    Object v6 = ((org.jsoup.nodes.Attributes)v3).put(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Attributes)v6).clone();
    Object v8 = "";
    Object v9 = false;
    Object v10 = ((org.jsoup.nodes.Attributes)v7).put(((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = ((org.jsoup.nodes.Attributes)v10).asList();
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "optio";
    Object v2 = "h_ml";
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "span";
    Object v5 = "codE";
    Object v6 = ((org.jsoup.nodes.Attributes)v3).put(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Attributes)v6).clone();
    Object v8 = "h*";
    Object v9 = ((org.jsoup.nodes.Attributes)v7).get(((java.lang.String)v8));
    Object v10 = "optgroup";
    Object v11 = "s";
    Object v12 = ((org.jsoup.nodes.Attributes)v7).put(((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = ((org.jsoup.nodes.Attributes)v12).hashCode();
    Object v14 = "h5";
    Object v15 = "DoctypPublicIdentifier_doubleQuoted";
    Object v16 = ((org.jsoup.nodes.Attributes)v12).put(((java.lang.String)v14),((java.lang.String)v15));
    Object v17 = "Cannot remove a protocol that is not set.";
    Object v18 = "optgroup";
    Object v19 = new org.jsoup.nodes.Attribute(((java.lang.String)v17),((java.lang.String)v18));
    Object v20 = ((org.jsoup.nodes.Attributes)v16).put(((org.jsoup.nodes.Attribute)v19));
    Object v21 = java.io.Writer.nullWriter();
    Object v22 = new org.jsoup.nodes.Document.OutputSettings();
    ((org.jsoup.nodes.Attributes)v16).html(((java.lang.Appendable)v21),((org.jsoup.nodes.Document.OutputSettings)v22));
    Object v23 = null;
    org.junit.Assert.assertNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "optio";
    Object v2 = "h_ml";
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "tr";
    Object v5 = true;
    Object v6 = ((org.jsoup.nodes.Attributes)v3).put(((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "p";
    Object v8 = "=";
    Object v9 = ((org.jsoup.nodes.Attributes)v6).put(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = ((org.jsoup.nodes.Attributes)v9).html();
    Object v11 = ((org.jsoup.nodes.Attributes)v9).size();
    org.junit.Assert.assertEquals((Object)(3), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "optio";
    Object v2 = "h_ml";
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "span";
    Object v5 = "codE";
    Object v6 = ((org.jsoup.nodes.Attributes)v3).put(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Attributes)v6).clone();
    Object v8 = "";
    Object v9 = false;
    Object v10 = ((org.jsoup.nodes.Attributes)v7).put(((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = ((org.jsoup.nodes.Attributes)v10).html();
    org.junit.Assert.assertEquals((Object)(" optio=\"h_ml\" span=\"codE\""), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "optio";
    Object v2 = "h_ml";
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "tr";
    Object v5 = true;
    Object v6 = ((org.jsoup.nodes.Attributes)v3).put(((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "Cannot remove a protocol that is not set.";
    Object v8 = "optgroup";
    Object v9 = new org.jsoup.nodes.Attribute(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = "B";
    ((org.jsoup.nodes.Attribute)v9).setKey(((java.lang.String)v10));
    Object v11 = null;
    Object v12 = ((org.jsoup.nodes.Attributes)v6).put(((org.jsoup.nodes.Attribute)v9));
    Object v13 = java.io.Writer.nullWriter();
    Object v14 = Character.valueOf((char)1);
    Object v15 = ((java.lang.Appendable)v13).append((((java.lang.Character)v14).charValue()));
    Object v16 = new org.jsoup.nodes.Document.OutputSettings();
    ((org.jsoup.nodes.Attributes)v12).html(((java.lang.Appendable)v13),((org.jsoup.nodes.Document.OutputSettings)v16));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "optio";
    Object v2 = "h_ml";
    Object v3 = ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "span";
    Object v5 = "codE";
    Object v6 = ((org.jsoup.nodes.Attributes)v3).put(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Attributes)v6).clone();
    Object v8 = "";
    Object v9 = false;
    Object v10 = ((org.jsoup.nodes.Attributes)v7).put(((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = "tfo";
    Object v12 = "tr";
    Object v13 = ((org.jsoup.nodes.Attributes)v10).put(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = ((org.jsoup.nodes.Attributes)v13).asList();
    org.junit.Assert.assertNotNull(v14);
  }
}
