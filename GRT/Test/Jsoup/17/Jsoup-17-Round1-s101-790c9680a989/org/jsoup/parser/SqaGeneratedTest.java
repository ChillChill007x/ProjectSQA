package org.jsoup.parser;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = org.jsoup.parser.TreeBuilderState.AfterHead;
    Object v1 = "captXon";
    Object v2 = new org.jsoup.parser.Token.EndTag(((java.lang.String)v1));
    Object v3 = new org.jsoup.parser.TreeBuilder();
    Object v4 = ((org.jsoup.parser.TreeBuilderState)v0).process(((org.jsoup.parser.Token)v2),((org.jsoup.parser.TreeBuilder)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = "noscrip";
    Object v1 = org.jsoup.parser.TreeBuilderState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = "td";
    Object v1 = org.jsoup.parser.TreeBuilderState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ((java.lang.Enum)v0).name();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = org.jsoup.parser.TreeBuilderState.values();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = org.jsoup.parser.TreeBuilderState.AfterFrameset;
    Object v1 = "captXon";
    Object v2 = new org.jsoup.parser.Token.EndTag(((java.lang.String)v1));
    Object v3 = new org.jsoup.parser.TreeBuilder();
    Object v4 = ((org.jsoup.parser.TreeBuilderState)v0).process(((org.jsoup.parser.Token)v2),((org.jsoup.parser.TreeBuilder)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = org.jsoup.parser.TreeBuilderState.Text;
    Object v1 = "captXon";
    Object v2 = new org.jsoup.parser.Token.EndTag(((java.lang.String)v1));
    Object v3 = new org.jsoup.parser.TreeBuilder();
    Object v4 = ((org.jsoup.parser.TreeBuilderState)v0).process(((org.jsoup.parser.Token)v2),((org.jsoup.parser.TreeBuilder)v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = "htmT";
    Object v1 = org.jsoup.parser.TreeBuilderState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = "style";
    Object v1 = org.jsoup.parser.TreeBuilderState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = org.jsoup.parser.TreeBuilderState.InHeadNoscript;
    Object v1 = "captXon";
    Object v2 = new org.jsoup.parser.Token.EndTag(((java.lang.String)v1));
    Object v3 = new org.jsoup.parser.TreeBuilder();
    Object v4 = ((org.jsoup.parser.TreeBuilderState)v0).process(((org.jsoup.parser.Token)v2),((org.jsoup.parser.TreeBuilder)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = "approx";
    Object v1 = org.jsoup.parser.TreeBuilderState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = org.jsoup.parser.TreeBuilderState.InTableBody;
    Object v1 = "InHead";
    Object v2 = org.jsoup.parser.TreeBuilderState.valueOf(((java.lang.String)v1));
    Object v3 = ((java.lang.Enum)v0).compareTo(((java.lang.Enum)v2));
    Object v4 = "captXon";
    Object v5 = new org.jsoup.parser.Token.EndTag(((java.lang.String)v4));
    Object v6 = new org.jsoup.parser.TreeBuilder();
    Object v7 = ((org.jsoup.parser.TreeBuilderState)v0).process(((org.jsoup.parser.Token)v5),((org.jsoup.parser.TreeBuilder)v6));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = "InHead";
    Object v1 = org.jsoup.parser.TreeBuilderState.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).hashCode();
    org.junit.Assert.assertEquals((Object)(562211400), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = "InHead";
    Object v1 = org.jsoup.parser.TreeBuilderState.valueOf(((java.lang.String)v0));
    Object v2 = "captXon";
    Object v3 = new org.jsoup.parser.Token.EndTag(((java.lang.String)v2));
    Object v4 = new org.jsoup.parser.TreeBuilder();
    Object v5 = ((org.jsoup.parser.TreeBuilderState)v1).process(((org.jsoup.parser.Token)v3),((org.jsoup.parser.TreeBuilder)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = "html";
    Object v1 = org.jsoup.parser.TreeBuilderState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = "InHead";
    Object v1 = org.jsoup.parser.TreeBuilderState.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = "qopf";
    Object v1 = org.jsoup.parser.TreeBuilderState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = "InHead";
    Object v1 = org.jsoup.parser.TreeBuilderState.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).hashCode();
    Object v3 = "InHead";
    Object v4 = org.jsoup.parser.TreeBuilderState.valueOf(((java.lang.String)v3));
    Object v5 = ((java.lang.Enum)v1).compareTo(((java.lang.Enum)v4));
    org.junit.Assert.assertEquals((Object)(0), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = "InHead";
    Object v1 = org.jsoup.parser.TreeBuilderState.valueOf(((java.lang.String)v0));
    Object v2 = "InHead";
    Object v3 = org.jsoup.parser.TreeBuilderState.valueOf(((java.lang.String)v2));
    Object v4 = ((java.lang.Enum)v1).compareTo(((java.lang.Enum)v3));
    org.junit.Assert.assertEquals((Object)(0), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = "InHead";
    Object v1 = org.jsoup.parser.TreeBuilderState.valueOf(((java.lang.String)v0));
    Object v2 = "InHead";
    Object v3 = org.jsoup.parser.TreeBuilderState.valueOf(((java.lang.String)v2));
    Object v4 = ((java.lang.Enum)v1).compareTo(((java.lang.Enum)v3));
    Object v5 = "InHead";
    Object v6 = org.jsoup.parser.TreeBuilderState.valueOf(((java.lang.String)v5));
    Object v7 = ((java.lang.Enum)v6).hashCode();
    Object v8 = ((java.lang.Enum)v1).compareTo(((java.lang.Enum)v6));
    org.junit.Assert.assertEquals((Object)(0), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = "InHead";
    Object v1 = org.jsoup.parser.TreeBuilderState.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = "keygen";
    Object v4 = java.lang.Enum.valueOf(((java.lang.Class)v2),((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = "InHead";
    Object v1 = org.jsoup.parser.TreeBuilderState.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = ((java.lang.Enum)v1).getDeclaringClass();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = "InHead";
    Object v1 = org.jsoup.parser.TreeBuilderState.valueOf(((java.lang.String)v0));
    Object v2 = "InHead";
    Object v3 = org.jsoup.parser.TreeBuilderState.valueOf(((java.lang.String)v2));
    Object v4 = ((java.lang.Enum)v1).equals(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = "InHead";
    Object v1 = org.jsoup.parser.TreeBuilderState.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).ordinal();
    org.junit.Assert.assertEquals((Object)(3), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = "InHead";
    Object v1 = org.jsoup.parser.TreeBuilderState.valueOf(((java.lang.String)v0));
    Object v2 = "captXon";
    Object v3 = new org.jsoup.parser.Token.EndTag(((java.lang.String)v2));
    Object v4 = ((java.lang.Enum)v1).equals(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = "fterBody";
    Object v1 = org.jsoup.parser.TreeBuilderState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = "InHead";
    Object v1 = org.jsoup.parser.TreeBuilderState.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v4 = "thed";
    Object v5 = java.lang.Enum.valueOf(((java.lang.Class)v3),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = "InHead";
    Object v1 = org.jsoup.parser.TreeBuilderState.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v4 = "R";
    Object v5 = java.lang.Enum.valueOf(((java.lang.Class)v3),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = "frame";
    Object v1 = org.jsoup.parser.TreeBuilderState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = "InHead";
    Object v1 = org.jsoup.parser.TreeBuilderState.valueOf(((java.lang.String)v0));
    Object v2 = "InHead";
    Object v3 = org.jsoup.parser.TreeBuilderState.valueOf(((java.lang.String)v2));
    Object v4 = ((java.lang.Enum)v3).hashCode();
    Object v5 = "InHead";
    Object v6 = org.jsoup.parser.TreeBuilderState.valueOf(((java.lang.String)v5));
    Object v7 = ((java.lang.Enum)v3).compareTo(((java.lang.Enum)v6));
    Object v8 = ((java.lang.Enum)v1).equals(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = "InHead";
    Object v1 = org.jsoup.parser.TreeBuilderState.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).hashCode();
    Object v3 = ((java.lang.Enum)v1).getDeclaringClass();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = "InHead";
    Object v1 = org.jsoup.parser.TreeBuilderState.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).hashCode();
    Object v3 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v4 = "bAody";
    Object v5 = java.lang.Enum.valueOf(((java.lang.Class)v3),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = "InHead";
    Object v1 = org.jsoup.parser.TreeBuilderState.valueOf(((java.lang.String)v0));
    Object v2 = "InHead";
    Object v3 = org.jsoup.parser.TreeBuilderState.valueOf(((java.lang.String)v2));
    Object v4 = ((java.lang.Enum)v3).getDeclaringClass();
    Object v5 = ((java.lang.Enum)v1).compareTo(((java.lang.Enum)v3));
    org.junit.Assert.assertEquals((Object)(0), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = "'h";
    Object v1 = org.jsoup.parser.TreeBuilderState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = "h5";
    Object v1 = org.jsoup.parser.TreeBuilderState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = "InHead";
    Object v1 = org.jsoup.parser.TreeBuilderState.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = "td";
    Object v4 = java.lang.Enum.valueOf(((java.lang.Class)v2),((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = "InHead";
    Object v1 = org.jsoup.parser.TreeBuilderState.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v4 = ((java.lang.Class)v3).getAnnotatedSuperclass();
    Object v5 = "bigvee";
    Object v6 = java.lang.Enum.valueOf(((java.lang.Class)v3),((java.lang.String)v5));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = "InHead";
    Object v1 = org.jsoup.parser.TreeBuilderState.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).hashCode();
    Object v3 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v4 = "bf";
    Object v5 = java.lang.Enum.valueOf(((java.lang.Class)v3),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = "InHead";
    Object v1 = org.jsoup.parser.TreeBuilderState.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).name();
    org.junit.Assert.assertEquals((Object)("InHead"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = "Cceil";
    Object v1 = org.jsoup.parser.TreeBuilderState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = "InHead";
    Object v1 = org.jsoup.parser.TreeBuilderState.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).hashCode();
    Object v3 = "captXon";
    Object v4 = new org.jsoup.parser.Token.EndTag(((java.lang.String)v3));
    Object v5 = new org.jsoup.parser.TreeBuilder();
    Object v6 = ((org.jsoup.parser.TreeBuilderState)v1).process(((org.jsoup.parser.Token)v4),((org.jsoup.parser.TreeBuilder)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = "InHead";
    Object v1 = org.jsoup.parser.TreeBuilderState.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v4 = ((java.lang.Class)v3).getGenericInterfaces();
    Object v5 = "caption";
    Object v6 = java.lang.Enum.valueOf(((java.lang.Class)v3),((java.lang.String)v5));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = "bod";
    Object v1 = org.jsoup.parser.TreeBuilderState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = "InHead";
    Object v1 = org.jsoup.parser.TreeBuilderState.valueOf(((java.lang.String)v0));
    Object v2 = "InHead";
    Object v3 = org.jsoup.parser.TreeBuilderState.valueOf(((java.lang.String)v2));
    Object v4 = ((java.lang.Enum)v1).compareTo(((java.lang.Enum)v3));
    Object v5 = "InHead";
    Object v6 = org.jsoup.parser.TreeBuilderState.valueOf(((java.lang.String)v5));
    Object v7 = "InHead";
    Object v8 = org.jsoup.parser.TreeBuilderState.valueOf(((java.lang.String)v7));
    Object v9 = ((java.lang.Enum)v6).compareTo(((java.lang.Enum)v8));
    Object v10 = ((java.lang.Enum)v1).compareTo(((java.lang.Enum)v6));
    org.junit.Assert.assertEquals((Object)(0), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = "InHead";
    Object v1 = org.jsoup.parser.TreeBuilderState.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).hashCode();
    Object v3 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v4 = "h4";
    Object v5 = java.lang.Enum.valueOf(((java.lang.Class)v3),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = "InHead";
    Object v1 = org.jsoup.parser.TreeBuilderState.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v4 = "ty";
    Object v5 = java.lang.Enum.valueOf(((java.lang.Class)v3),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = "optgroup";
    Object v1 = org.jsoup.parser.TreeBuilderState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = "InHead";
    Object v1 = org.jsoup.parser.TreeBuilderState.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).hashCode();
    Object v3 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v4 = "ol";
    Object v5 = java.lang.Enum.valueOf(((java.lang.Class)v3),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = "InHead";
    Object v1 = org.jsoup.parser.TreeBuilderState.valueOf(((java.lang.String)v0));
    Object v2 = org.jsoup.parser.TreeBuilderState.values();
    Object v3 = ((java.lang.Enum)v1).equals(((java.lang.Object)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = "InHead";
    Object v1 = org.jsoup.parser.TreeBuilderState.valueOf(((java.lang.String)v0));
    Object v2 = "InHead";
    Object v3 = org.jsoup.parser.TreeBuilderState.valueOf(((java.lang.String)v2));
    Object v4 = ((java.lang.Enum)v1).compareTo(((java.lang.Enum)v3));
    Object v5 = ((java.lang.Enum)v1).getDeclaringClass();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = "InHead";
    Object v1 = org.jsoup.parser.TreeBuilderState.valueOf(((java.lang.String)v0));
    Object v2 = "InHead";
    Object v3 = org.jsoup.parser.TreeBuilderState.valueOf(((java.lang.String)v2));
    Object v4 = ((java.lang.Enum)v3).hashCode();
    Object v5 = ((java.lang.Enum)v3).getDeclaringClass();
    Object v6 = ((java.lang.Enum)v1).equals(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = "InHead";
    Object v1 = org.jsoup.parser.TreeBuilderState.valueOf(((java.lang.String)v0));
    Object v2 = "InHead";
    Object v3 = org.jsoup.parser.TreeBuilderState.valueOf(((java.lang.String)v2));
    Object v4 = "InHead";
    Object v5 = org.jsoup.parser.TreeBuilderState.valueOf(((java.lang.String)v4));
    Object v6 = ((java.lang.Enum)v3).compareTo(((java.lang.Enum)v5));
    Object v7 = ((java.lang.Enum)v1).equals(((java.lang.Object)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = "InHead";
    Object v1 = org.jsoup.parser.TreeBuilderState.valueOf(((java.lang.String)v0));
    Object v2 = "InHead";
    Object v3 = org.jsoup.parser.TreeBuilderState.valueOf(((java.lang.String)v2));
    Object v4 = ((java.lang.Enum)v1).compareTo(((java.lang.Enum)v3));
    Object v5 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v6 = "caption";
    Object v7 = java.lang.Enum.valueOf(((java.lang.Class)v5),((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = "InHead";
    Object v1 = org.jsoup.parser.TreeBuilderState.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).hashCode();
    Object v3 = ((java.lang.Enum)v1).ordinal();
    org.junit.Assert.assertEquals((Object)(3), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = "InHead";
    Object v1 = org.jsoup.parser.TreeBuilderState.valueOf(((java.lang.String)v0));
    Object v2 = "InHead";
    Object v3 = org.jsoup.parser.TreeBuilderState.valueOf(((java.lang.String)v2));
    Object v4 = ((java.lang.Enum)v3).ordinal();
    Object v5 = ((java.lang.Enum)v1).equals(((java.lang.Object)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = "InHead";
    Object v1 = org.jsoup.parser.TreeBuilderState.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).toString();
    org.junit.Assert.assertEquals((Object)("InHead"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = "InHead";
    Object v1 = org.jsoup.parser.TreeBuilderState.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = "InHead";
    Object v4 = org.jsoup.parser.TreeBuilderState.valueOf(((java.lang.String)v3));
    Object v5 = ((java.lang.Enum)v1).compareTo(((java.lang.Enum)v4));
    org.junit.Assert.assertEquals((Object)(0), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = "ForeignContent";
    Object v1 = org.jsoup.parser.TreeBuilderState.valueOf(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(org.jsoup.parser.TreeBuilderState.ForeignContent), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = "InHead";
    Object v1 = org.jsoup.parser.TreeBuilderState.valueOf(((java.lang.String)v0));
    Object v2 = "InHead";
    Object v3 = org.jsoup.parser.TreeBuilderState.valueOf(((java.lang.String)v2));
    Object v4 = ((java.lang.Enum)v1).compareTo(((java.lang.Enum)v3));
    Object v5 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v6 = "tml";
    Object v7 = java.lang.Enum.valueOf(((java.lang.Class)v5),((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = "Scaron";
    Object v1 = org.jsoup.parser.TreeBuilderState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = "ForeignContent";
    Object v1 = org.jsoup.parser.TreeBuilderState.valueOf(((java.lang.String)v0));
    Object v2 = "ForeignContent";
    Object v3 = org.jsoup.parser.TreeBuilderState.valueOf(((java.lang.String)v2));
    Object v4 = ((java.lang.Enum)v1).equals(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = "InHead";
    Object v1 = org.jsoup.parser.TreeBuilderState.valueOf(((java.lang.String)v0));
    Object v2 = "ForeignContent";
    Object v3 = org.jsoup.parser.TreeBuilderState.valueOf(((java.lang.String)v2));
    Object v4 = ((java.lang.Enum)v1).compareTo(((java.lang.Enum)v3));
    Object v5 = ((java.lang.Enum)v1).getDeclaringClass();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = "InHead";
    Object v1 = org.jsoup.parser.TreeBuilderState.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).hashCode();
    Object v3 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v4 = "uztri";
    Object v5 = java.lang.Enum.valueOf(((java.lang.Class)v3),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = "ForeignContent";
    Object v1 = org.jsoup.parser.TreeBuilderState.valueOf(((java.lang.String)v0));
    Object v2 = "ForeignContent";
    Object v3 = org.jsoup.parser.TreeBuilderState.valueOf(((java.lang.String)v2));
    Object v4 = ((java.lang.Enum)v1).compareTo(((java.lang.Enum)v3));
    org.junit.Assert.assertEquals((Object)(0), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = "htmr";
    Object v1 = org.jsoup.parser.TreeBuilderState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = "ForeignContent";
    Object v1 = org.jsoup.parser.TreeBuilderState.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = "F";
    Object v1 = org.jsoup.parser.TreeBuilderState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = "ForeignContent";
    Object v1 = org.jsoup.parser.TreeBuilderState.valueOf(((java.lang.String)v0));
    Object v2 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v3 = ((java.lang.Enum)v1).equals(((java.lang.Object)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = "ForeignContent";
    Object v1 = org.jsoup.parser.TreeBuilderState.valueOf(((java.lang.String)v0));
    Object v2 = "ForeignContent";
    Object v3 = org.jsoup.parser.TreeBuilderState.valueOf(((java.lang.String)v2));
    Object v4 = ((java.lang.Enum)v1).compareTo(((java.lang.Enum)v3));
    Object v5 = "captXon";
    Object v6 = new org.jsoup.parser.Token.EndTag(((java.lang.String)v5));
    Object v7 = new org.jsoup.parser.TreeBuilder();
    Object v8 = ((org.jsoup.parser.TreeBuilderState)v1).process(((org.jsoup.parser.Token)v6),((org.jsoup.parser.TreeBuilder)v7));
    org.junit.Assert.assertEquals((Object)(true), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = "ForeignContent";
    Object v1 = org.jsoup.parser.TreeBuilderState.valueOf(((java.lang.String)v0));
    Object v2 = "captXon";
    Object v3 = new org.jsoup.parser.Token.EndTag(((java.lang.String)v2));
    Object v4 = new org.jsoup.parser.TreeBuilder();
    Object v5 = ((org.jsoup.parser.TreeBuilderState)v1).process(((org.jsoup.parser.Token)v3),((org.jsoup.parser.TreeBuilder)v4));
    org.junit.Assert.assertEquals((Object)(true), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = "title";
    Object v1 = org.jsoup.parser.TreeBuilderState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = "ForeignContent";
    Object v1 = org.jsoup.parser.TreeBuilderState.valueOf(((java.lang.String)v0));
    Object v2 = org.jsoup.parser.TreeBuilderState.values();
    Object v3 = ((java.lang.Enum)v1).equals(((java.lang.Object)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = "ForeignContent";
    Object v1 = org.jsoup.parser.TreeBuilderState.valueOf(((java.lang.String)v0));
    Object v2 = "InHead";
    Object v3 = org.jsoup.parser.TreeBuilderState.valueOf(((java.lang.String)v2));
    Object v4 = ((java.lang.Enum)v1).compareTo(((java.lang.Enum)v3));
    org.junit.Assert.assertEquals((Object)(19), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = "ForeignContent";
    Object v1 = org.jsoup.parser.TreeBuilderState.valueOf(((java.lang.String)v0));
    Object v2 = "ForeignContent";
    Object v3 = org.jsoup.parser.TreeBuilderState.valueOf(((java.lang.String)v2));
    Object v4 = "ForeignContent";
    Object v5 = org.jsoup.parser.TreeBuilderState.valueOf(((java.lang.String)v4));
    Object v6 = ((java.lang.Enum)v3).compareTo(((java.lang.Enum)v5));
    Object v7 = ((java.lang.Enum)v1).equals(((java.lang.Object)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = "InHead";
    Object v1 = org.jsoup.parser.TreeBuilderState.valueOf(((java.lang.String)v0));
    Object v2 = "ForeignContent";
    Object v3 = org.jsoup.parser.TreeBuilderState.valueOf(((java.lang.String)v2));
    Object v4 = ((java.lang.Enum)v3).getDeclaringClass();
    Object v5 = ((java.lang.Enum)v1).compareTo(((java.lang.Enum)v3));
    org.junit.Assert.assertEquals((Object)(-19), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = "ForeignContent";
    Object v1 = org.jsoup.parser.TreeBuilderState.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = org.jsoup.parser.TreeBuilderState.AfterFrameset;
    Object v4 = "captXon";
    Object v5 = new org.jsoup.parser.Token.EndTag(((java.lang.String)v4));
    Object v6 = new org.jsoup.parser.TreeBuilder();
    Object v7 = ((org.jsoup.parser.TreeBuilderState)v3).process(((org.jsoup.parser.Token)v5),((org.jsoup.parser.TreeBuilder)v6));
    Object v8 = ((java.lang.Enum)v1).equals(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = "InHead";
    Object v1 = org.jsoup.parser.TreeBuilderState.valueOf(((java.lang.String)v0));
    Object v2 = "InHead";
    Object v3 = org.jsoup.parser.TreeBuilderState.valueOf(((java.lang.String)v2));
    Object v4 = ((java.lang.Enum)v1).compareTo(((java.lang.Enum)v3));
    Object v5 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v6 = "";
    Object v7 = java.lang.Enum.valueOf(((java.lang.Class)v5),((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = "ForeignContent";
    Object v1 = org.jsoup.parser.TreeBuilderState.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = ((java.lang.Enum)v1).name();
    org.junit.Assert.assertEquals((Object)("ForeignContent"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = "InHead";
    Object v1 = org.jsoup.parser.TreeBuilderState.valueOf(((java.lang.String)v0));
    Object v2 = "ForeignContent";
    Object v3 = org.jsoup.parser.TreeBuilderState.valueOf(((java.lang.String)v2));
    Object v4 = ((java.lang.Enum)v1).compareTo(((java.lang.Enum)v3));
    org.junit.Assert.assertEquals((Object)(-19), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = "InHead";
    Object v1 = org.jsoup.parser.TreeBuilderState.valueOf(((java.lang.String)v0));
    Object v2 = "InHead";
    Object v3 = org.jsoup.parser.TreeBuilderState.valueOf(((java.lang.String)v2));
    Object v4 = ((java.lang.Enum)v1).compareTo(((java.lang.Enum)v3));
    Object v5 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v6 = "a";
    Object v7 = java.lang.Enum.valueOf(((java.lang.Class)v5),((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = "ForeignContent";
    Object v1 = org.jsoup.parser.TreeBuilderState.valueOf(((java.lang.String)v0));
    Object v2 = "ForeignContent";
    Object v3 = org.jsoup.parser.TreeBuilderState.valueOf(((java.lang.String)v2));
    Object v4 = ((java.lang.Enum)v3).getDeclaringClass();
    Object v5 = ((java.lang.Enum)v1).compareTo(((java.lang.Enum)v3));
    org.junit.Assert.assertEquals((Object)(0), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = "tfot";
    Object v1 = org.jsoup.parser.TreeBuilderState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = "Yaption";
    Object v1 = org.jsoup.parser.TreeBuilderState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = "ForeignContent";
    Object v1 = org.jsoup.parser.TreeBuilderState.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = "isindex";
    Object v4 = java.lang.Enum.valueOf(((java.lang.Class)v2),((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = "ForeignContent";
    Object v1 = org.jsoup.parser.TreeBuilderState.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = "htmRl";
    Object v4 = java.lang.Enum.valueOf(((java.lang.Class)v2),((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = "InHead";
    Object v1 = org.jsoup.parser.TreeBuilderState.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).hashCode();
    Object v3 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v4 = "track";
    Object v5 = java.lang.Enum.valueOf(((java.lang.Class)v3),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = "Llefarrow";
    Object v1 = org.jsoup.parser.TreeBuilderState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = "ForeignContent";
    Object v1 = org.jsoup.parser.TreeBuilderState.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = "tfo>t";
    Object v4 = java.lang.Enum.valueOf(((java.lang.Class)v2),((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = "htm/";
    Object v1 = org.jsoup.parser.TreeBuilderState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = "ForeignContent";
    Object v1 = org.jsoup.parser.TreeBuilderState.valueOf(((java.lang.String)v0));
    Object v2 = "InHead";
    Object v3 = org.jsoup.parser.TreeBuilderState.valueOf(((java.lang.String)v2));
    Object v4 = ((java.lang.Enum)v3).hashCode();
    Object v5 = ((java.lang.Enum)v3).ordinal();
    Object v6 = ((java.lang.Enum)v1).equals(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = "tH";
    Object v1 = org.jsoup.parser.TreeBuilderState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = "htm";
    Object v1 = org.jsoup.parser.TreeBuilderState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = "InHead";
    Object v1 = org.jsoup.parser.TreeBuilderState.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).hashCode();
    Object v3 = "ForeignContent";
    Object v4 = org.jsoup.parser.TreeBuilderState.valueOf(((java.lang.String)v3));
    Object v5 = ((java.lang.Enum)v1).compareTo(((java.lang.Enum)v4));
    org.junit.Assert.assertEquals((Object)(-19), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = "tt";
    Object v1 = org.jsoup.parser.TreeBuilderState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = "tr";
    Object v1 = org.jsoup.parser.TreeBuilderState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = "Ouml";
    Object v1 = org.jsoup.parser.TreeBuilderState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = "ForeignContent";
    Object v1 = org.jsoup.parser.TreeBuilderState.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).toString();
    org.junit.Assert.assertEquals((Object)("ForeignContent"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = "ForeignContent";
    Object v1 = org.jsoup.parser.TreeBuilderState.valueOf(((java.lang.String)v0));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = "!";
    Object v4 = java.lang.Enum.valueOf(((java.lang.Class)v2),((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = "InHead";
    Object v1 = org.jsoup.parser.TreeBuilderState.valueOf(((java.lang.String)v0));
    Object v2 = "ForeignContent";
    Object v3 = org.jsoup.parser.TreeBuilderState.valueOf(((java.lang.String)v2));
    Object v4 = ((java.lang.Enum)v1).compareTo(((java.lang.Enum)v3));
    Object v5 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v6 = "tr";
    Object v7 = java.lang.Enum.valueOf(((java.lang.Class)v5),((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = "emsp";
    Object v1 = org.jsoup.parser.TreeBuilderState.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }
}
