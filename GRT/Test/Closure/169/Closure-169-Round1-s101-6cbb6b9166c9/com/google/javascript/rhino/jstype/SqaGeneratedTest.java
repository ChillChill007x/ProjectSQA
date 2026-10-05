package com.google.javascript.rhino.jstype;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = false;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = false;
    Object v3 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((java.lang.Enum)v1).compareTo(((java.lang.Enum)v3));
    Object v5 = ((java.lang.Enum)v1).getDeclaringClass();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = false;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = com.google.javascript.rhino.jstype.EquivalenceMethod.values();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = false;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = false;
    Object v4 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((java.lang.Enum)v1).equals(((java.lang.Object)v4));
    org.junit.Assert.assertEquals((Object)(true), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = false;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = false;
    Object v3 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((java.lang.Enum)v1).compareTo(((java.lang.Enum)v3));
    org.junit.Assert.assertEquals((Object)(0), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = false;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = ((java.lang.Enum)v1).hashCode();
    Object v3 = false;
    Object v4 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((java.lang.Enum)v1).compareTo(((java.lang.Enum)v4));
    org.junit.Assert.assertEquals((Object)(0), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = false;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = ((java.lang.Enum)v1).toString();
    org.junit.Assert.assertEquals((Object)("FALSE"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = false;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = false;
    Object v3 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((java.lang.Enum)v1).compareTo(((java.lang.Enum)v3));
    Object v5 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v6 = "FunWtion";
    Object v7 = java.lang.Enum.valueOf(((java.lang.Class)v5),((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = false;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = ((java.lang.Enum)v1).ordinal();
    org.junit.Assert.assertEquals((Object)(2), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = "\n}\n";
    Object v1 = com.google.javascript.rhino.jstype.EquivalenceMethod.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = "sou\\rces";
    Object v1 = com.google.javascript.rhino.jstype.EquivalenceMethod.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = com.google.javascript.rhino.jstype.EquivalenceMethod.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = false;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = false;
    Object v3 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((java.lang.Enum)v1).compareTo(((java.lang.Enum)v3));
    Object v5 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v6 = false;
    Object v7 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = ((java.lang.Enum)v7).getDeclaringClass();
    Object v9 = ((java.lang.Class)v5).asSubclass(((java.lang.Class)v8));
    Object v10 = "/";
    Object v11 = java.lang.Enum.valueOf(((java.lang.Class)v5),((java.lang.String)v10));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = "OaF";
    Object v1 = com.google.javascript.rhino.jstype.EquivalenceMethod.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = false;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = ((java.lang.Enum)v1).hashCode();
    org.junit.Assert.assertEquals((Object)(1607383444), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = false;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = false;
    Object v3 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((java.lang.Enum)v1).equals(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = false;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = false;
    Object v3 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((java.lang.Enum)v1).compareTo(((java.lang.Enum)v3));
    Object v5 = ((java.lang.Enum)v1).hashCode();
    org.junit.Assert.assertEquals((Object)(1607383444), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = false;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = false;
    Object v3 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((java.lang.Enum)v1).compareTo(((java.lang.Enum)v3));
    Object v5 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v6 = " ";
    Object v7 = java.lang.Enum.valueOf(((java.lang.Class)v5),((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = "prototype";
    Object v1 = com.google.javascript.rhino.jstype.EquivalenceMethod.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = "[";
    Object v1 = com.google.javascript.rhino.jstype.EquivalenceMethod.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = false;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = ((java.lang.Class)v2).getEnumConstants();
    Object v4 = "";
    Object v5 = java.lang.Enum.valueOf(((java.lang.Class)v2),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = "JSC_ILLEGAL_PRO(PERTY_ACCESS";
    Object v1 = com.google.javascript.rhino.jstype.EquivalenceMethod.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = false;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = false;
    Object v3 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((java.lang.Enum)v1).compareTo(((java.lang.Enum)v3));
    Object v5 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v6 = "E";
    Object v7 = java.lang.Enum.valueOf(((java.lang.Class)v5),((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = false;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = false;
    Object v3 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((java.lang.Enum)v1).compareTo(((java.lang.Enum)v3));
    Object v5 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v6 = "pr\\totype";
    Object v7 = java.lang.Enum.valueOf(((java.lang.Class)v5),((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = false;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = false;
    Object v3 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((java.lang.Enum)v3).getDeclaringClass();
    Object v5 = ((java.lang.Enum)v1).compareTo(((java.lang.Enum)v3));
    org.junit.Assert.assertEquals((Object)(0), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = false;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = ((java.lang.Enum)v1).name();
    org.junit.Assert.assertEquals((Object)("FALSE"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = false;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = "";
    Object v4 = java.lang.Enum.valueOf(((java.lang.Class)v2),((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = false;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = false;
    Object v3 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = false;
    Object v5 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = ((java.lang.Enum)v3).compareTo(((java.lang.Enum)v5));
    Object v7 = ((java.lang.Enum)v1).compareTo(((java.lang.Enum)v3));
    org.junit.Assert.assertEquals((Object)(0), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = false;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = false;
    Object v4 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((java.lang.Enum)v1).compareTo(((java.lang.Enum)v4));
    org.junit.Assert.assertEquals((Object)(0), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = false;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = false;
    Object v3 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((java.lang.Enum)v1).compareTo(((java.lang.Enum)v3));
    Object v5 = false;
    Object v6 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((java.lang.Enum)v6).ordinal();
    Object v8 = ((java.lang.Enum)v1).equals(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = false;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = false;
    Object v4 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((java.lang.Enum)v4).getDeclaringClass();
    Object v6 = ((java.lang.Enum)v1).compareTo(((java.lang.Enum)v4));
    org.junit.Assert.assertEquals((Object)(0), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = false;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = false;
    Object v3 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((java.lang.Enum)v3).getDeclaringClass();
    Object v5 = false;
    Object v6 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((java.lang.Enum)v3).equals(((java.lang.Object)v6));
    Object v8 = ((java.lang.Enum)v1).equals(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = false;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = "goog.tweakgetString";
    Object v4 = java.lang.Enum.valueOf(((java.lang.Class)v2),((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = false;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = ((java.lang.Enum)v1).getDeclaringClass();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = false;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v4 = ((java.lang.Class)v3).getClasses();
    Object v5 = ";";
    Object v6 = java.lang.Enum.valueOf(((java.lang.Class)v3),((java.lang.String)v5));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = "(";
    Object v1 = com.google.javascript.rhino.jstype.EquivalenceMethod.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = "d";
    Object v1 = com.google.javascript.rhino.jstype.EquivalenceMethod.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = false;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = ((java.lang.Enum)v1).name();
    org.junit.Assert.assertEquals((Object)("FALSE"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = false;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = false;
    Object v3 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((java.lang.Enum)v1).compareTo(((java.lang.Enum)v3));
    Object v5 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v6 = "";
    Object v7 = java.lang.Enum.valueOf(((java.lang.Class)v5),((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = false;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = ((java.lang.Enum)v1).hashCode();
    org.junit.Assert.assertEquals((Object)(1607383444), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = false;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v4 = "`";
    Object v5 = java.lang.Enum.valueOf(((java.lang.Class)v3),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = false;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = false;
    Object v3 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((java.lang.Enum)v3).hashCode();
    Object v5 = false;
    Object v6 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((java.lang.Enum)v3).compareTo(((java.lang.Enum)v6));
    Object v8 = ((java.lang.Enum)v1).equals(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = false;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = false;
    Object v3 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((java.lang.Enum)v1).compareTo(((java.lang.Enum)v3));
    Object v5 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v6 = ((java.lang.Class)v5).getAnnotatedSuperclass();
    Object v7 = ",";
    Object v8 = java.lang.Enum.valueOf(((java.lang.Class)v5),((java.lang.String)v7));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = false;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = false;
    Object v3 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((java.lang.Enum)v3).getDeclaringClass();
    Object v5 = ((java.lang.Enum)v1).equals(((java.lang.Object)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = false;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = false;
    Object v3 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((java.lang.Enum)v3).hashCode();
    Object v5 = ((java.lang.Enum)v1).compareTo(((java.lang.Enum)v3));
    org.junit.Assert.assertEquals((Object)(0), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = false;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v4 = "?";
    Object v5 = java.lang.Enum.valueOf(((java.lang.Class)v3),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = "n";
    Object v1 = com.google.javascript.rhino.jstype.EquivalenceMethod.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = false;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = false;
    Object v3 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = false;
    Object v5 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = ((java.lang.Enum)v5).getDeclaringClass();
    Object v7 = ((java.lang.Enum)v3).equals(((java.lang.Object)v6));
    Object v8 = ((java.lang.Enum)v1).equals(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = false;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v4 = "Unexpected Nod subclass.";
    Object v5 = java.lang.Enum.valueOf(((java.lang.Class)v3),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = false;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = false;
    Object v3 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = false;
    Object v5 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = ((java.lang.Enum)v5).getDeclaringClass();
    Object v7 = ((java.lang.Enum)v3).compareTo(((java.lang.Enum)v5));
    Object v8 = ((java.lang.Enum)v1).equals(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = false;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v4 = "0";
    Object v5 = java.lang.Enum.valueOf(((java.lang.Class)v3),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = false;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = ((java.lang.Enum)v1).hashCode();
    Object v3 = false;
    Object v4 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = false;
    Object v6 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((java.lang.Enum)v4).compareTo(((java.lang.Enum)v6));
    Object v8 = ((java.lang.Enum)v1).compareTo(((java.lang.Enum)v4));
    org.junit.Assert.assertEquals((Object)(0), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = false;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v4 = "proto\"type";
    Object v5 = java.lang.Enum.valueOf(((java.lang.Class)v3),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = false;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = false;
    Object v3 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = false;
    Object v5 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = ((java.lang.Enum)v3).equals(((java.lang.Object)v5));
    Object v7 = ((java.lang.Enum)v1).equals(((java.lang.Object)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = false;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = ((java.lang.Class)v2).getTypeParameters();
    Object v4 = "!";
    Object v5 = java.lang.Enum.valueOf(((java.lang.Class)v2),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = false;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v4 = "i";
    Object v5 = java.lang.Enum.valueOf(((java.lang.Class)v3),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = "RegEx";
    Object v1 = com.google.javascript.rhino.jstype.EquivalenceMethod.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = false;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = false;
    Object v3 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((java.lang.Enum)v3).getDeclaringClass();
    Object v5 = false;
    Object v6 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((java.lang.Enum)v3).compareTo(((java.lang.Enum)v6));
    Object v8 = ((java.lang.Enum)v1).equals(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = false;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = "d";
    Object v4 = java.lang.Enum.valueOf(((java.lang.Class)v2),((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = "'";
    Object v1 = com.google.javascript.rhino.jstype.EquivalenceMethod.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = false;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v4 = ((java.lang.Class)v3).getPackage();
    Object v5 = "prototype";
    Object v6 = java.lang.Enum.valueOf(((java.lang.Class)v3),((java.lang.String)v5));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = false;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = "s";
    Object v4 = java.lang.Enum.valueOf(((java.lang.Class)v2),((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = false;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = false;
    Object v4 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((java.lang.Enum)v4).getDeclaringClass();
    Object v6 = ((java.lang.Enum)v4).hashCode();
    Object v7 = ((java.lang.Enum)v1).equals(((java.lang.Object)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = false;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v4 = "";
    Object v5 = java.lang.Enum.valueOf(((java.lang.Class)v3),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = "modifies";
    Object v1 = com.google.javascript.rhino.jstype.EquivalenceMethod.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = "rivate";
    Object v1 = com.google.javascript.rhino.jstype.EquivalenceMethod.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = false;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = false;
    Object v3 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((java.lang.Enum)v3).getDeclaringClass();
    Object v5 = ((java.lang.Enum)v3).getDeclaringClass();
    Object v6 = ((java.lang.Enum)v1).equals(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = false;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = ((java.lang.Enum)v1).hashCode();
    Object v3 = ((java.lang.Enum)v1).getDeclaringClass();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = false;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = "8";
    Object v4 = java.lang.Enum.valueOf(((java.lang.Class)v2),((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = false;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = false;
    Object v4 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((java.lang.Enum)v4).getDeclaringClass();
    Object v6 = ((java.lang.Enum)v4).getDeclaringClass();
    Object v7 = ((java.lang.Class)v2).getAnnotation(((java.lang.Class)v6));
    Object v8 = "";
    Object v9 = java.lang.Enum.valueOf(((java.lang.Class)v2),((java.lang.String)v8));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = false;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = false;
    Object v3 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = false;
    Object v5 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = false;
    Object v7 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = ((java.lang.Enum)v5).equals(((java.lang.Object)v7));
    Object v9 = ((java.lang.Enum)v3).equals(((java.lang.Object)v8));
    Object v10 = ((java.lang.Enum)v1).equals(((java.lang.Object)v9));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = false;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = false;
    Object v3 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((java.lang.Enum)v1).compareTo(((java.lang.Enum)v3));
    Object v5 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v6 = "truCe";
    Object v7 = java.lang.Enum.valueOf(((java.lang.Class)v5),((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = false;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = ((java.lang.Enum)v1).hashCode();
    Object v3 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v4 = "";
    Object v5 = java.lang.Enum.valueOf(((java.lang.Class)v3),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = false;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = false;
    Object v3 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((java.lang.Enum)v1).compareTo(((java.lang.Enum)v3));
    Object v5 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v6 = "x";
    Object v7 = java.lang.Enum.valueOf(((java.lang.Class)v5),((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = false;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v4 = "n";
    Object v5 = java.lang.Enum.valueOf(((java.lang.Class)v3),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = "{";
    Object v1 = com.google.javascript.rhino.jstype.EquivalenceMethod.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = false;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = false;
    Object v3 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((java.lang.Enum)v3).name();
    Object v5 = ((java.lang.Enum)v1).equals(((java.lang.Object)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = false;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v4 = "z";
    Object v5 = java.lang.Enum.valueOf(((java.lang.Class)v3),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = false;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = false;
    Object v3 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((java.lang.Enum)v1).compareTo(((java.lang.Enum)v3));
    Object v5 = false;
    Object v6 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((java.lang.Enum)v1).compareTo(((java.lang.Enum)v6));
    org.junit.Assert.assertEquals((Object)(0), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = false;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v4 = ((java.lang.Class)v3).getGenericInterfaces();
    Object v5 = "H";
    Object v6 = java.lang.Enum.valueOf(((java.lang.Class)v3),((java.lang.String)v5));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = "IMPLEMENTS";
    Object v1 = com.google.javascript.rhino.jstype.EquivalenceMethod.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = false;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = false;
    Object v3 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((java.lang.Enum)v3).getDeclaringClass();
    Object v5 = ((java.lang.Enum)v3).name();
    Object v6 = ((java.lang.Enum)v1).equals(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = false;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = false;
    Object v3 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((java.lang.Enum)v3).hashCode();
    Object v5 = ((java.lang.Enum)v1).equals(((java.lang.Object)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = "Removed unu";
    Object v1 = com.google.javascript.rhino.jstype.EquivalenceMethod.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = "?";
    Object v1 = com.google.javascript.rhino.jstype.EquivalenceMethod.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = false;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = false;
    Object v3 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((java.lang.Enum)v3).getDeclaringClass();
    Object v5 = false;
    Object v6 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((java.lang.Enum)v6).getDeclaringClass();
    Object v8 = ((java.lang.Enum)v6).hashCode();
    Object v9 = ((java.lang.Enum)v3).equals(((java.lang.Object)v8));
    Object v10 = ((java.lang.Enum)v1).equals(((java.lang.Object)v9));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = false;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = ((java.lang.Enum)v1).hashCode();
    Object v3 = false;
    Object v4 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((java.lang.Enum)v4).hashCode();
    Object v6 = ((java.lang.Enum)v4).getDeclaringClass();
    Object v7 = ((java.lang.Enum)v1).equals(((java.lang.Object)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = false;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v4 = "$";
    Object v5 = java.lang.Enum.valueOf(((java.lang.Class)v3),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = "h";
    Object v1 = com.google.javascript.rhino.jstype.EquivalenceMethod.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = false;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = ((java.lang.Enum)v1).hashCode();
    Object v3 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v4 = "Y";
    Object v5 = java.lang.Enum.valueOf(((java.lang.Class)v3),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = false;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = ((java.lang.Enum)v1).hashCode();
    Object v3 = false;
    Object v4 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = false;
    Object v6 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((java.lang.Enum)v4).compareTo(((java.lang.Enum)v6));
    Object v8 = ((java.lang.Enum)v4).getDeclaringClass();
    Object v9 = ((java.lang.Enum)v1).equals(((java.lang.Object)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = "P";
    Object v1 = com.google.javascript.rhino.jstype.EquivalenceMethod.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = false;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = false;
    Object v3 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((java.lang.Enum)v3).hashCode();
    Object v5 = ((java.lang.Enum)v3).getDeclaringClass();
    Object v6 = ((java.lang.Enum)v1).equals(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = false;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = ((java.lang.Enum)v1).hashCode();
    Object v3 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v4 = "static";
    Object v5 = java.lang.Enum.valueOf(((java.lang.Class)v3),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = false;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = ((java.lang.Enum)v1).hashCode();
    Object v3 = false;
    Object v4 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = false;
    Object v6 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = false;
    Object v8 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ((java.lang.Enum)v8).getDeclaringClass();
    Object v10 = ((java.lang.Enum)v6).compareTo(((java.lang.Enum)v8));
    Object v11 = ((java.lang.Enum)v4).equals(((java.lang.Object)v10));
    Object v12 = ((java.lang.Enum)v1).equals(((java.lang.Object)v11));
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = false;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = false;
    Object v3 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = false;
    Object v5 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = ((java.lang.Enum)v5).hashCode();
    Object v7 = ((java.lang.Enum)v5).getDeclaringClass();
    Object v8 = ((java.lang.Enum)v3).equals(((java.lang.Object)v7));
    Object v9 = ((java.lang.Enum)v1).equals(((java.lang.Object)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = false;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = false;
    Object v3 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = false;
    Object v5 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = ((java.lang.Enum)v5).hashCode();
    Object v7 = ((java.lang.Enum)v3).equals(((java.lang.Object)v6));
    Object v8 = ((java.lang.Enum)v1).equals(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = false;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = false;
    Object v3 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = false;
    Object v5 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = ((java.lang.Enum)v5).getDeclaringClass();
    Object v7 = false;
    Object v8 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ((java.lang.Enum)v5).compareTo(((java.lang.Enum)v8));
    Object v10 = ((java.lang.Enum)v3).equals(((java.lang.Object)v9));
    Object v11 = ((java.lang.Enum)v1).equals(((java.lang.Object)v10));
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = false;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v4 = "[.";
    Object v5 = java.lang.Enum.valueOf(((java.lang.Class)v3),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = "inherits";
    Object v1 = com.google.javascript.rhino.jstype.EquivalenceMethod.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }
}
