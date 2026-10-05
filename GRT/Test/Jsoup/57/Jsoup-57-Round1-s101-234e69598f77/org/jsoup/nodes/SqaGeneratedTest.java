package org.jsoup.nodes;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "ifram";
    Object v2 = false;
    ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = ((org.jsoup.nodes.Attributes)v0).iterator();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = ((org.jsoup.nodes.Attributes)v0).hashCode();
    org.junit.Assert.assertEquals((Object)(0), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "G";
    ((org.jsoup.nodes.Attributes)v0).remove(((java.lang.String)v1));
    Object v2 = null;
    Object v3 = "li";
    Object v4 = ((org.jsoup.nodes.Attributes)v0).get(((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)(""), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "name";
    Object v2 = ((org.jsoup.nodes.Attributes)v0).hasKeyIgnoreCase(((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Attributes)v0).size();
    org.junit.Assert.assertEquals((Object)(0), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "htKl";
    ((org.jsoup.nodes.Attributes)v0).remove(((java.lang.String)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = ((org.jsoup.nodes.Attributes)v0).clone();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = ((org.jsoup.nodes.Attributes)v0).clone();
    Object v2 = "";
    ((org.jsoup.nodes.Attributes)v1).remove(((java.lang.String)v2));
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = ((org.jsoup.nodes.Attributes)v0).clone();
    Object v2 = "tbody";
    Object v3 = ((org.jsoup.nodes.Attributes)v1).get(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(""), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = ((org.jsoup.nodes.Attributes)v0).clone();
    Object v2 = "colgrouOp";
    Object v3 = ((org.jsoup.nodes.Attributes)v1).get(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(""), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = ((org.jsoup.nodes.Attributes)v0).clone();
    Object v2 = "table";
    Object v3 = ((org.jsoup.nodes.Attributes)v1).getIgnoreCase(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(""), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = ((org.jsoup.nodes.Attributes)v0).clone();
    Object v2 = ((org.jsoup.nodes.Attributes)v1).asList();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = ((org.jsoup.nodes.Attributes)v0).clone();
    Object v2 = ((org.jsoup.nodes.Attributes)v1).clone();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = ((org.jsoup.nodes.Attributes)v0).clone();
    Object v2 = ((org.jsoup.nodes.Attributes)v1).size();
    Object v3 = new java.io.StringWriter();
    Object v4 = new org.jsoup.nodes.Document.OutputSettings();
    Object v5 = org.jsoup.nodes.Document.OutputSettings.Syntax.html;
    Object v6 = ((org.jsoup.nodes.Document.OutputSettings)v4).syntax(((org.jsoup.nodes.Document.OutputSettings.Syntax)v5));
    ((org.jsoup.nodes.Attributes)v1).html(((java.lang.Appendable)v3),((org.jsoup.nodes.Document.OutputSettings)v4));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = ((org.jsoup.nodes.Attributes)v0).clone();
    Object v2 = ((org.jsoup.nodes.Attributes)v1).size();
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = ((org.jsoup.nodes.Attributes)v0).clone();
    Object v2 = "img";
    Object v3 = true;
    ((org.jsoup.nodes.Attributes)v1).put(((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v4 = null;
    Object v5 = "tt";
    Object v6 = ((org.jsoup.nodes.Attributes)v1).getIgnoreCase(((java.lang.String)v5));
    org.junit.Assert.assertEquals((Object)(""), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = ((org.jsoup.nodes.Attributes)v0).clone();
    Object v2 = new java.io.StringWriter();
    Object v3 = new org.jsoup.nodes.Document.OutputSettings();
    ((org.jsoup.nodes.Attributes)v1).html(((java.lang.Appendable)v2),((org.jsoup.nodes.Document.OutputSettings)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = ((org.jsoup.nodes.Attributes)v0).clone();
    Object v2 = "p";
    Object v3 = "h5";
    Object v4 = org.jsoup.nodes.Attribute.createFromEncoded(((java.lang.String)v2),((java.lang.String)v3));
    ((org.jsoup.nodes.Attributes)v1).put(((org.jsoup.nodes.Attribute)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = ((org.jsoup.nodes.Attributes)v0).clone();
    Object v2 = new org.jsoup.nodes.Attributes();
    ((org.jsoup.nodes.Attributes)v1).addAll(((org.jsoup.nodes.Attributes)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = ((org.jsoup.nodes.Attributes)v0).clone();
    Object v2 = "tmoot";
    Object v3 = ((org.jsoup.nodes.Attributes)v1).hasKey(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = ((org.jsoup.nodes.Attributes)v0).clone();
    Object v2 = "BetweenDoctypePublicAndSystemIdentifiers";
    Object v3 = ((org.jsoup.nodes.Attributes)v1).hasKeyIgnoreCase(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = ((org.jsoup.nodes.Attributes)v0).clone();
    Object v2 = ((org.jsoup.nodes.Attributes)v1).html();
    Object v3 = ((org.jsoup.nodes.Attributes)v1).hashCode();
    org.junit.Assert.assertEquals((Object)(0), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = ((org.jsoup.nodes.Attributes)v0).clone();
    Object v2 = "l";
    Object v3 = ((org.jsoup.nodes.Attributes)v1).hasKey(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = ((org.jsoup.nodes.Attributes)v0).clone();
    Object v2 = ((org.jsoup.nodes.Attributes)v1).iterator();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = ((org.jsoup.nodes.Attributes)v0).clone();
    Object v2 = ((org.jsoup.nodes.Attributes)v1).clone();
    Object v3 = ((org.jsoup.nodes.Attributes)v2).hashCode();
    Object v4 = new org.jsoup.nodes.Attributes();
    Object v5 = ((org.jsoup.nodes.Attributes)v4).clone();
    ((org.jsoup.nodes.Attributes)v2).addAll(((org.jsoup.nodes.Attributes)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = ((org.jsoup.nodes.Attributes)v0).clone();
    Object v2 = new org.jsoup.nodes.Attributes();
    Object v3 = ((org.jsoup.nodes.Attributes)v2).clone();
    Object v4 = "l";
    Object v5 = ((org.jsoup.nodes.Attributes)v3).hasKey(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Attributes)v1).equals(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = ((org.jsoup.nodes.Attributes)v0).clone();
    Object v2 = ((org.jsoup.nodes.Attributes)v1).html();
    Object v3 = "p";
    Object v4 = "h5";
    Object v5 = org.jsoup.nodes.Attribute.createFromEncoded(((java.lang.String)v3),((java.lang.String)v4));
    ((org.jsoup.nodes.Attributes)v1).put(((org.jsoup.nodes.Attribute)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = ((org.jsoup.nodes.Attributes)v0).clone();
    Object v2 = "colgrou^";
    Object v3 = "tbody";
    ((org.jsoup.nodes.Attributes)v1).put(((java.lang.String)v2),((java.lang.String)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = ((org.jsoup.nodes.Attributes)v0).clone();
    Object v2 = new org.jsoup.nodes.Attributes();
    Object v3 = ((org.jsoup.nodes.Attributes)v2).clone();
    Object v4 = "colgrouOp";
    Object v5 = ((org.jsoup.nodes.Attributes)v3).get(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Attributes)v1).equals(((java.lang.Object)v5));
    Object v7 = ((org.jsoup.nodes.Attributes)v1).size();
    org.junit.Assert.assertEquals((Object)(0), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = ((org.jsoup.nodes.Attributes)v0).clone();
    Object v2 = "disablWed";
    Object v3 = ((org.jsoup.nodes.Attributes)v1).get(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(""), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = ((org.jsoup.nodes.Attributes)v0).clone();
    Object v2 = "tfoot";
    ((org.jsoup.nodes.Attributes)v1).removeIgnoreCase(((java.lang.String)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = ((org.jsoup.nodes.Attributes)v0).clone();
    Object v2 = "tf'oot";
    Object v3 = false;
    ((org.jsoup.nodes.Attributes)v1).put(((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = ((org.jsoup.nodes.Attributes)v0).clone();
    Object v2 = "html";
    Object v3 = ((org.jsoup.nodes.Attributes)v1).getIgnoreCase(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(""), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = ((org.jsoup.nodes.Attributes)v0).clone();
    Object v2 = "pE";
    ((org.jsoup.nodes.Attributes)v1).remove(((java.lang.String)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = ((org.jsoup.nodes.Attributes)v0).clone();
    Object v2 = ((org.jsoup.nodes.Attributes)v1).asList();
    Object v3 = ((java.lang.Iterable)v2).spliterator();
    Object v4 = ((java.lang.Iterable)v2).spliterator();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = ((org.jsoup.nodes.Attributes)v0).clone();
    Object v2 = "?";
    Object v3 = ((org.jsoup.nodes.Attributes)v1).getIgnoreCase(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(""), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = ((org.jsoup.nodes.Attributes)v0).clone();
    Object v2 = "";
    ((org.jsoup.nodes.Attributes)v1).removeIgnoreCase(((java.lang.String)v2));
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = ((org.jsoup.nodes.Attributes)v0).clone();
    Object v2 = "O";
    Object v3 = ((org.jsoup.nodes.Attributes)v1).hasKey(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = ((org.jsoup.nodes.Attributes)v0).clone();
    Object v2 = ((org.jsoup.nodes.Attributes)v1).size();
    Object v3 = "b";
    Object v4 = ((org.jsoup.nodes.Attributes)v1).get(((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)(""), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = ((org.jsoup.nodes.Attributes)v0).clone();
    Object v2 = new org.jsoup.nodes.Attributes();
    Object v3 = ((org.jsoup.nodes.Attributes)v2).clone();
    ((org.jsoup.nodes.Attributes)v1).addAll(((org.jsoup.nodes.Attributes)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = ((org.jsoup.nodes.Attributes)v0).clone();
    Object v2 = ((org.jsoup.nodes.Attributes)v1).html();
    Object v3 = "b";
    Object v4 = ((org.jsoup.nodes.Attributes)v1).getIgnoreCase(((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)(""), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = ((org.jsoup.nodes.Attributes)v0).clone();
    Object v2 = "t";
    Object v3 = ((org.jsoup.nodes.Attributes)v1).hasKeyIgnoreCase(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = ((org.jsoup.nodes.Attributes)v0).clone();
    Object v2 = "noscrip ";
    Object v3 = ((org.jsoup.nodes.Attributes)v1).hasKey(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = ((org.jsoup.nodes.Attributes)v0).clone();
    Object v2 = "co+";
    ((org.jsoup.nodes.Attributes)v1).removeIgnoreCase(((java.lang.String)v2));
    Object v3 = null;
    Object v4 = "col";
    Object v5 = ((org.jsoup.nodes.Attributes)v1).getIgnoreCase(((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)(""), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = ((org.jsoup.nodes.Attributes)v0).clone();
    Object v2 = "typemusitmatch";
    Object v3 = ((org.jsoup.nodes.Attributes)v1).hasKey(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = ((org.jsoup.nodes.Attributes)v0).clone();
    Object v2 = "p";
    Object v3 = "h5";
    Object v4 = org.jsoup.nodes.Attribute.createFromEncoded(((java.lang.String)v2),((java.lang.String)v3));
    ((org.jsoup.nodes.Attributes)v1).put(((org.jsoup.nodes.Attribute)v4));
    Object v5 = null;
    Object v6 = ((org.jsoup.nodes.Attributes)v1).size();
    org.junit.Assert.assertEquals((Object)(1), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = ((org.jsoup.nodes.Attributes)v0).clone();
    Object v2 = "p";
    Object v3 = "h5";
    Object v4 = org.jsoup.nodes.Attribute.createFromEncoded(((java.lang.String)v2),((java.lang.String)v3));
    ((org.jsoup.nodes.Attributes)v1).put(((org.jsoup.nodes.Attribute)v4));
    Object v5 = null;
    Object v6 = "tbody";
    Object v7 = ((org.jsoup.nodes.Attributes)v1).hasKey(((java.lang.String)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = ((org.jsoup.nodes.Attributes)v0).clone();
    Object v2 = new org.jsoup.nodes.Attributes();
    Object v3 = ((org.jsoup.nodes.Attributes)v2).clone();
    Object v4 = "co+";
    ((org.jsoup.nodes.Attributes)v3).removeIgnoreCase(((java.lang.String)v4));
    Object v5 = null;
    Object v6 = "col";
    Object v7 = ((org.jsoup.nodes.Attributes)v3).getIgnoreCase(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Attributes)v1).equals(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = ((org.jsoup.nodes.Attributes)v0).clone();
    Object v2 = "1";
    Object v3 = "xmp";
    ((org.jsoup.nodes.Attributes)v1).put(((java.lang.String)v2),((java.lang.String)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = ((org.jsoup.nodes.Attributes)v0).clone();
    Object v2 = new org.jsoup.nodes.Attributes();
    Object v3 = ((org.jsoup.nodes.Attributes)v2).clone();
    Object v4 = "table";
    Object v5 = ((org.jsoup.nodes.Attributes)v3).getIgnoreCase(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Attributes)v1).equals(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = ((org.jsoup.nodes.Attributes)v0).clone();
    Object v2 = "(";
    Object v3 = ((org.jsoup.nodes.Attributes)v1).get(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(""), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = ((org.jsoup.nodes.Attributes)v0).clone();
    Object v2 = new org.jsoup.nodes.Attributes();
    Object v3 = ((org.jsoup.nodes.Attributes)v2).clone();
    ((org.jsoup.nodes.Attributes)v1).addAll(((org.jsoup.nodes.Attributes)v3));
    Object v4 = null;
    Object v5 = "O";
    Object v6 = ((org.jsoup.nodes.Attributes)v1).get(((java.lang.String)v5));
    org.junit.Assert.assertEquals((Object)(""), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = ((org.jsoup.nodes.Attributes)v0).clone();
    Object v2 = ((java.lang.Iterable)v1).spliterator();
    Object v3 = ((org.jsoup.nodes.Attributes)v1).size();
    org.junit.Assert.assertEquals((Object)(0), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = ((org.jsoup.nodes.Attributes)v0).clone();
    Object v2 = ((org.jsoup.nodes.Attributes)v1).html();
    org.junit.Assert.assertEquals((Object)(""), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = ((org.jsoup.nodes.Attributes)v0).clone();
    Object v2 = ((org.jsoup.nodes.Attributes)v1).asList();
    Object v3 = new java.io.StringWriter();
    Object v4 = new org.jsoup.nodes.Attributes();
    Object v5 = ((org.jsoup.nodes.Attributes)v4).clone();
    Object v6 = "?";
    Object v7 = ((org.jsoup.nodes.Attributes)v5).getIgnoreCase(((java.lang.String)v6));
    Object v8 = ((java.lang.Appendable)v3).append(((java.lang.CharSequence)v7));
    Object v9 = new org.jsoup.nodes.Document.OutputSettings();
    Object v10 = 70;
    Object v11 = ((org.jsoup.nodes.Document.OutputSettings)v9).indentAmount((((java.lang.Integer)v10).intValue()));
    ((org.jsoup.nodes.Attributes)v1).html(((java.lang.Appendable)v3),((org.jsoup.nodes.Document.OutputSettings)v9));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = ((org.jsoup.nodes.Attributes)v0).clone();
    Object v2 = ((org.jsoup.nodes.Attributes)v1).size();
    Object v3 = "th";
    Object v4 = ((org.jsoup.nodes.Attributes)v1).hasKeyIgnoreCase(((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = ((org.jsoup.nodes.Attributes)v0).clone();
    Object v2 = "ftpS";
    Object v3 = ((org.jsoup.nodes.Attributes)v1).get(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(""), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = ((org.jsoup.nodes.Attributes)v0).clone();
    Object v2 = "h5";
    Object v3 = ((org.jsoup.nodes.Attributes)v1).hasKey(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = ((org.jsoup.nodes.Attributes)v0).clone();
    Object v2 = new org.jsoup.nodes.Attributes();
    Object v3 = ((org.jsoup.nodes.Attributes)v2).clone();
    Object v4 = "ht<tps";
    Object v5 = ((org.jsoup.nodes.Attributes)v3).get(((java.lang.String)v4));
    ((org.jsoup.nodes.Attributes)v1).addAll(((org.jsoup.nodes.Attributes)v3));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = ((org.jsoup.nodes.Attributes)v0).clone();
    Object v2 = ((org.jsoup.nodes.Attributes)v1).dataset();
    Object v3 = ((org.jsoup.nodes.Attributes)v1).iterator();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = ((org.jsoup.nodes.Attributes)v0).clone();
    Object v2 = ((org.jsoup.nodes.Attributes)v1).clone();
    Object v3 = ((org.jsoup.nodes.Attributes)v2).asList();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = ((org.jsoup.nodes.Attributes)v0).clone();
    Object v2 = "bod";
    Object v3 = ((org.jsoup.nodes.Attributes)v1).getIgnoreCase(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(""), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = ((org.jsoup.nodes.Attributes)v0).clone();
    Object v2 = new org.jsoup.nodes.Attributes();
    Object v3 = ((org.jsoup.nodes.Attributes)v2).clone();
    Object v4 = ((org.jsoup.nodes.Attributes)v3).size();
    Object v5 = ((org.jsoup.nodes.Attributes)v1).equals(((java.lang.Object)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = ((org.jsoup.nodes.Attributes)v0).clone();
    Object v2 = "tboy";
    Object v3 = ((org.jsoup.nodes.Attributes)v1).hasKey(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = ((org.jsoup.nodes.Attributes)v0).clone();
    Object v2 = "tfoo";
    Object v3 = ((org.jsoup.nodes.Attributes)v1).get(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(""), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = ((org.jsoup.nodes.Attributes)v0).clone();
    Object v2 = "";
    Object v3 = true;
    ((org.jsoup.nodes.Attributes)v1).put(((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = new java.io.StringWriter();
    Object v2 = new org.jsoup.nodes.Attributes();
    Object v3 = ((org.jsoup.nodes.Attributes)v2).clone();
    Object v4 = "html";
    Object v5 = ((org.jsoup.nodes.Attributes)v3).getIgnoreCase(((java.lang.String)v4));
    Object v6 = ((java.lang.Appendable)v1).append(((java.lang.CharSequence)v5));
    Object v7 = new org.jsoup.nodes.Document.OutputSettings();
    ((org.jsoup.nodes.Attributes)v0).html(((java.lang.Appendable)v1),((org.jsoup.nodes.Document.OutputSettings)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = ((org.jsoup.nodes.Attributes)v0).clone();
    Object v2 = ((org.jsoup.nodes.Attributes)v1).clone();
    Object v3 = ((org.jsoup.nodes.Attributes)v2).toString();
    org.junit.Assert.assertEquals((Object)(""), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = ((org.jsoup.nodes.Attributes)v0).clone();
    Object v2 = "p";
    Object v3 = "h5";
    Object v4 = org.jsoup.nodes.Attribute.createFromEncoded(((java.lang.String)v2),((java.lang.String)v3));
    ((org.jsoup.nodes.Attributes)v1).put(((org.jsoup.nodes.Attribute)v4));
    Object v5 = null;
    Object v6 = "";
    Object v7 = true;
    ((org.jsoup.nodes.Attributes)v1).put(((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = ((org.jsoup.nodes.Attributes)v0).clone();
    Object v2 = ((org.jsoup.nodes.Attributes)v1).clone();
    Object v3 = ((org.jsoup.nodes.Attributes)v2).asList();
    Object v4 = ((java.lang.Iterable)v3).spliterator();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = ((org.jsoup.nodes.Attributes)v0).clone();
    Object v2 = "track";
    Object v3 = ((org.jsoup.nodes.Attributes)v1).hasKey(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "body";
    ((org.jsoup.nodes.Attributes)v0).remove(((java.lang.String)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = ((org.jsoup.nodes.Attributes)v0).clone();
    Object v2 = "pr";
    Object v3 = ((org.jsoup.nodes.Attributes)v1).getIgnoreCase(((java.lang.String)v2));
    Object v4 = "prmpt";
    ((org.jsoup.nodes.Attributes)v1).removeIgnoreCase(((java.lang.String)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "col";
    Object v2 = ((org.jsoup.nodes.Attributes)v0).hasKey(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = ((org.jsoup.nodes.Attributes)v0).clone();
    Object v2 = new org.jsoup.nodes.Attributes();
    Object v3 = ((org.jsoup.nodes.Attributes)v2).clone();
    Object v4 = "colgrouOp";
    Object v5 = ((org.jsoup.nodes.Attributes)v3).get(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Attributes)v1).equals(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = ((org.jsoup.nodes.Attributes)v0).clone();
    Object v2 = ":";
    ((org.jsoup.nodes.Attributes)v1).removeIgnoreCase(((java.lang.String)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = ((org.jsoup.nodes.Attributes)v0).clone();
    Object v2 = "input";
    Object v3 = ((org.jsoup.nodes.Attributes)v1).get(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(""), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = ((org.jsoup.nodes.Attributes)v0).clone();
    Object v2 = ((org.jsoup.nodes.Attributes)v1).clone();
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = ((org.jsoup.nodes.Attributes)v3).clone();
    Object v5 = "BetweenDoctypePublicAndSystemIdentifiers";
    Object v6 = ((org.jsoup.nodes.Attributes)v4).hasKeyIgnoreCase(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Attributes)v2).equals(((java.lang.Object)v6));
    Object v8 = "";
    Object v9 = ((org.jsoup.nodes.Attributes)v2).getIgnoreCase(((java.lang.String)v8));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = ((org.jsoup.nodes.Attributes)v0).clone();
    Object v2 = "body7";
    Object v3 = false;
    ((org.jsoup.nodes.Attributes)v1).put(((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = ((org.jsoup.nodes.Attributes)v0).clone();
    Object v2 = "colgroup";
    Object v3 = false;
    ((org.jsoup.nodes.Attributes)v1).put(((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = "<A";
    Object v2 = "h";
    ((org.jsoup.nodes.Attributes)v0).put(((java.lang.String)v1),((java.lang.String)v2));
    Object v3 = null;
    Object v4 = new org.jsoup.nodes.Attributes();
    Object v5 = ((org.jsoup.nodes.Attributes)v4).clone();
    Object v6 = "colgrouOp";
    Object v7 = ((org.jsoup.nodes.Attributes)v5).get(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Attributes)v0).equals(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = ((org.jsoup.nodes.Attributes)v0).clone();
    Object v2 = "";
    Object v3 = ((org.jsoup.nodes.Attributes)v1).getIgnoreCase(((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = ((org.jsoup.nodes.Attributes)v0).clone();
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Attributes)v1).get(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Attributes)v1).clone();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = ((org.jsoup.nodes.Attributes)v0).clone();
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Attributes)v1).get(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Attributes)v1).clone();
    Object v5 = ((org.jsoup.nodes.Attributes)v4).hashCode();
    org.junit.Assert.assertEquals((Object)(0), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = ((org.jsoup.nodes.Attributes)v0).clone();
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Attributes)v1).get(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Attributes)v1).clone();
    Object v5 = "b$dy";
    Object v6 = ((org.jsoup.nodes.Attributes)v4).hasKeyIgnoreCase(((java.lang.String)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = ((org.jsoup.nodes.Attributes)v0).clone();
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Attributes)v1).get(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Attributes)v1).clone();
    Object v5 = ((org.jsoup.nodes.Attributes)v4).clone();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = ((org.jsoup.nodes.Attributes)v0).clone();
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Attributes)v1).get(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Attributes)v1).clone();
    Object v5 = "br";
    Object v6 = false;
    ((org.jsoup.nodes.Attributes)v4).put(((java.lang.String)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = ((org.jsoup.nodes.Attributes)v0).clone();
    Object v2 = "p";
    Object v3 = true;
    ((org.jsoup.nodes.Attributes)v1).put(((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v4 = null;
    Object v5 = new org.jsoup.nodes.Attributes();
    Object v6 = ((org.jsoup.nodes.Attributes)v5).clone();
    Object v7 = "?";
    Object v8 = ((org.jsoup.nodes.Attributes)v6).getIgnoreCase(((java.lang.String)v7));
    Object v9 = ((org.jsoup.nodes.Attributes)v1).equals(((java.lang.Object)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = ((org.jsoup.nodes.Attributes)v0).clone();
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Attributes)v1).get(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Attributes)v1).clone();
    Object v5 = "bgsound";
    Object v6 = true;
    ((org.jsoup.nodes.Attributes)v4).put(((java.lang.String)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = ((org.jsoup.nodes.Attributes)v0).clone();
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Attributes)v1).get(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Attributes)v1).clone();
    Object v5 = ((org.jsoup.nodes.Attributes)v4).clone();
    Object v6 = new org.jsoup.nodes.Attributes();
    Object v7 = ((org.jsoup.nodes.Attributes)v6).clone();
    Object v8 = "colgrouOp";
    Object v9 = ((org.jsoup.nodes.Attributes)v7).get(((java.lang.String)v8));
    Object v10 = ((org.jsoup.nodes.Attributes)v5).equals(((java.lang.Object)v9));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = ((org.jsoup.nodes.Attributes)v0).clone();
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Attributes)v1).get(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Attributes)v1).clone();
    Object v5 = ((org.jsoup.nodes.Attributes)v4).iterator();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = ((org.jsoup.nodes.Attributes)v0).clone();
    Object v2 = "--";
    ((org.jsoup.nodes.Attributes)v1).removeIgnoreCase(((java.lang.String)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = ((org.jsoup.nodes.Attributes)v0).clone();
    Object v2 = "hbml";
    Object v3 = ((org.jsoup.nodes.Attributes)v1).hasKeyIgnoreCase(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = ((org.jsoup.nodes.Attributes)v0).clone();
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Attributes)v1).get(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Attributes)v1).clone();
    Object v5 = ((org.jsoup.nodes.Attributes)v4).clone();
    Object v6 = "t|";
    Object v7 = ((org.jsoup.nodes.Attributes)v5).hasKey(((java.lang.String)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = ((org.jsoup.nodes.Attributes)v0).clone();
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Attributes)v1).get(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Attributes)v1).clone();
    Object v5 = ((org.jsoup.nodes.Attributes)v4).clone();
    Object v6 = "a";
    Object v7 = ((org.jsoup.nodes.Attributes)v5).get(((java.lang.String)v6));
    org.junit.Assert.assertEquals((Object)(""), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = ((org.jsoup.nodes.Attributes)v0).clone();
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Attributes)v1).get(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Attributes)v1).clone();
    Object v5 = "br";
    Object v6 = ((org.jsoup.nodes.Attributes)v4).getIgnoreCase(((java.lang.String)v5));
    org.junit.Assert.assertEquals((Object)(""), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = ((org.jsoup.nodes.Attributes)v0).clone();
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Attributes)v1).get(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Attributes)v1).clone();
    Object v5 = ((org.jsoup.nodes.Attributes)v4).clone();
    Object v6 = ">";
    Object v7 = ((org.jsoup.nodes.Attributes)v5).get(((java.lang.String)v6));
    org.junit.Assert.assertEquals((Object)(""), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = ((org.jsoup.nodes.Attributes)v0).clone();
    Object v2 = "body";
    ((org.jsoup.nodes.Attributes)v1).remove(((java.lang.String)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new org.jsoup.nodes.Attributes();
    Object v1 = ((org.jsoup.nodes.Attributes)v0).clone();
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Attributes)v1).get(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Attributes)v1).clone();
    Object v5 = "p";
    Object v6 = "h5";
    Object v7 = org.jsoup.nodes.Attribute.createFromEncoded(((java.lang.String)v5),((java.lang.String)v6));
    ((org.jsoup.nodes.Attributes)v4).put(((org.jsoup.nodes.Attribute)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }
}
