package com.google.javascript.jscomp;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1.0D;
    Object v5 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v4).doubleValue()));
    Object v6 = 1.0D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    ((com.google.javascript.jscomp.InlineVariables)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v1),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1.0D;
    Object v5 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v4).doubleValue()));
    Object v6 = ((com.google.javascript.rhino.Node)v5).getAncestors();
    Object v7 = 1.0D;
    Object v8 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()));
    Object v9 = ((com.google.javascript.rhino.Node)v8).getAncestors();
    ((com.google.javascript.jscomp.InlineVariables)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v8));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v1),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
    Object v3 = ((java.lang.Enum)v2).getDeclaringClass();
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v2),(((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v1),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v1),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
    Object v2 = ((java.lang.Enum)v1).hashCode();
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v1),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v1),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
    Object v2 = ((java.lang.Enum)v1).hashCode();
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v1),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 1.0D;
    Object v6 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v5).doubleValue()));
    Object v7 = false;
    ((com.google.javascript.rhino.Node)v6).setVarArgs((((java.lang.Boolean)v7).booleanValue()));
    Object v8 = null;
    Object v9 = 1.0D;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()));
    ((com.google.javascript.jscomp.InlineVariables)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "1";
    Object v2 = -14;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v4),(((java.lang.Boolean)v5).booleanValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1.0D;
    Object v5 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v4).doubleValue()));
    Object v6 = 1.0D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    ((com.google.javascript.jscomp.InlineVariables)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v2),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v2),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "1";
    Object v2 = -14;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = 1.0D;
    Object v8 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()));
    Object v9 = 1.0D;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()));
    ((com.google.javascript.jscomp.InlineVariables)v6).process(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v1),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1.0D;
    Object v5 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v4).doubleValue()));
    Object v6 = 1.0D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    Object v8 = new com.google.javascript.rhino.JSDocInfo();
    ((com.google.javascript.rhino.Node)v7).setJSDocInfo(((com.google.javascript.rhino.JSDocInfo)v8));
    Object v9 = null;
    ((com.google.javascript.jscomp.InlineVariables)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
    Object v2 = ((java.lang.Enum)v1).hashCode();
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v1),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
    Object v3 = ((java.lang.Enum)v2).getDeclaringClass();
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v2),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = 1.0D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    Object v8 = 1.0D;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()));
    Object v10 = 87;
    Object v11 = true;
    ((com.google.javascript.rhino.Node)v9).putBooleanProp((((java.lang.Integer)v10).intValue()),(((java.lang.Boolean)v11).booleanValue()));
    Object v12 = null;
    ((com.google.javascript.jscomp.InlineVariables)v5).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v1),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
    Object v2 = ((java.lang.Enum)v1).hashCode();
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v1),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1.0D;
    Object v5 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v4).doubleValue()));
    Object v6 = 1.0D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    Object v8 = ((com.google.javascript.rhino.Node)v7).siblings();
    ((com.google.javascript.jscomp.InlineVariables)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
    Object v2 = ((java.lang.Enum)v1).hashCode();
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v1),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 1.0D;
    Object v6 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v5).doubleValue()));
    Object v7 = 1.0D;
    Object v8 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()));
    ((com.google.javascript.jscomp.InlineVariables)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1.0D;
    Object v5 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v4).doubleValue()));
    Object v6 = 1.0D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    ((com.google.javascript.jscomp.InlineVariables)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 1.0D;
    Object v6 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v5).doubleValue()));
    Object v7 = 1.0D;
    Object v8 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()));
    ((com.google.javascript.jscomp.InlineVariables)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
    Object v2 = ((java.lang.Enum)v1).hashCode();
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v1),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 1.0D;
    Object v6 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v5).doubleValue()));
    Object v7 = 1.0D;
    Object v8 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()));
    Object v9 = ((com.google.javascript.rhino.Node)v8).isUnscopedQualifiedName();
    ((com.google.javascript.jscomp.InlineVariables)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
    Object v2 = ((java.lang.Enum)v1).hashCode();
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v1),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 1.0D;
    Object v6 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v5).doubleValue()));
    Object v7 = 1.0D;
    Object v8 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()));
    Object v9 = 1.0D;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()));
    ((com.google.javascript.rhino.Node)v8).addChildrenToBack(((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
    ((com.google.javascript.jscomp.InlineVariables)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
    Object v2 = ((java.lang.Enum)v1).hashCode();
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v1),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 1.0D;
    Object v6 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v5).doubleValue()));
    Object v7 = 1.0D;
    Object v8 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()));
    ((com.google.javascript.jscomp.InlineVariables)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1.0D;
    Object v5 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v4).doubleValue()));
    Object v6 = 1.0D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    ((com.google.javascript.jscomp.InlineVariables)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v2),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
    Object v2 = ((java.lang.Enum)v1).hashCode();
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v1),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 1.0D;
    Object v6 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v5).doubleValue()));
    Object v7 = 1.0D;
    Object v8 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()));
    Object v9 = "TR6E";
    Object v10 = ";";
    Object v11 = com.google.javascript.jscomp.DiagnosticType.warning(((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = new com.google.javascript.rhino.JSDocInfo();
    Object v13 = new com.google.javascript.rhino.JSDocInfo();
    Object v14 = 1.0D;
    Object v15 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v14).doubleValue()));
    Object v16 = java.util.Set.of(((java.lang.Object)v11),((java.lang.Object)v12),((java.lang.Object)v13),((java.lang.Object)v15));
    ((com.google.javascript.rhino.Node)v8).setDirectives(((java.util.Set)v16));
    Object v17 = null;
    ((com.google.javascript.jscomp.InlineVariables)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8));
    Object v18 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 1.0D;
    Object v6 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v5).doubleValue()));
    Object v7 = -13;
    ((com.google.javascript.rhino.Node)v6).setCharno((((java.lang.Integer)v7).intValue()));
    Object v8 = null;
    Object v9 = 1.0D;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()));
    ((com.google.javascript.jscomp.InlineVariables)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
    Object v2 = ((java.lang.Enum)v1).hashCode();
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v1),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 1.0D;
    Object v6 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v5).doubleValue()));
    Object v7 = 1.0D;
    Object v8 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()));
    Object v9 = 0;
    Object v10 = 26;
    ((com.google.javascript.rhino.Node)v8).putIntProp((((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    ((com.google.javascript.jscomp.InlineVariables)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 1.0D;
    Object v6 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v5).doubleValue()));
    Object v7 = 1.0D;
    Object v8 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()));
    ((com.google.javascript.jscomp.InlineVariables)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v2),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v4),(((java.lang.Boolean)v5).booleanValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v2),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 1.0D;
    Object v6 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v5).doubleValue()));
    Object v7 = 1.0D;
    Object v8 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()));
    ((com.google.javascript.jscomp.InlineVariables)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
    Object v2 = ((java.lang.Enum)v1).hashCode();
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v1),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1.0D;
    Object v5 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v4).doubleValue()));
    Object v6 = 1.0D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    ((com.google.javascript.jscomp.InlineVariables)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v1),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 1.0D;
    Object v6 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v5).doubleValue()));
    Object v7 = 1.0D;
    Object v8 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()));
    ((com.google.javascript.jscomp.InlineVariables)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = 1.0D;
    Object v8 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()));
    Object v9 = ((com.google.javascript.rhino.Node)v8).removeFirstChild();
    Object v10 = 1.0D;
    Object v11 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()));
    Object v12 = ((com.google.javascript.rhino.Node)v11).cloneNode();
    ((com.google.javascript.jscomp.InlineVariables)v6).process(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v11));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
    Object v3 = ((java.lang.Enum)v2).getDeclaringClass();
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v2),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = 1.0D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    Object v8 = 1.0D;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()));
    ((com.google.javascript.jscomp.InlineVariables)v5).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
    Object v2 = ((java.lang.Enum)v1).hashCode();
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v1),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 1.0D;
    Object v6 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v5).doubleValue()));
    Object v7 = 1.0D;
    Object v8 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()));
    Object v9 = 1.0D;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()));
    Object v11 = ((com.google.javascript.rhino.Node)v8).copyInformationFrom(((com.google.javascript.rhino.Node)v10));
    ((com.google.javascript.jscomp.InlineVariables)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 1.0D;
    Object v6 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v5).doubleValue()));
    Object v7 = ((com.google.javascript.rhino.Node)v6).cloneNode();
    Object v8 = 1.0D;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()));
    ((com.google.javascript.jscomp.InlineVariables)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
    Object v2 = ((java.lang.Enum)v1).hashCode();
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v1),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 1.0D;
    Object v6 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v5).doubleValue()));
    Object v7 = 1.0D;
    Object v8 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()));
    Object v9 = 1.0D;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()));
    Object v11 = ((com.google.javascript.rhino.Node)v8).copyInformationFrom(((com.google.javascript.rhino.Node)v10));
    ((com.google.javascript.jscomp.InlineVariables)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
    Object v2 = ((java.lang.Enum)v1).hashCode();
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v1),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 1.0D;
    Object v6 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v5).doubleValue()));
    Object v7 = 1.0D;
    Object v8 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()));
    Object v9 = ((com.google.javascript.rhino.Node)v6).clonePropsFrom(((com.google.javascript.rhino.Node)v8));
    Object v10 = 1.0D;
    Object v11 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()));
    ((com.google.javascript.jscomp.InlineVariables)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 1.0D;
    Object v6 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v5).doubleValue()));
    Object v7 = 1.0D;
    Object v8 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()));
    ((com.google.javascript.jscomp.InlineVariables)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
    Object v10 = 1.0D;
    Object v11 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()));
    Object v12 = 1.0D;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v12).doubleValue()));
    ((com.google.javascript.jscomp.InlineVariables)v4).process(((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 1.0D;
    Object v6 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v5).doubleValue()));
    Object v7 = 1.0D;
    Object v8 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()));
    ((com.google.javascript.jscomp.InlineVariables)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
    Object v10 = 1.0D;
    Object v11 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()));
    Object v12 = 1.0D;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v12).doubleValue()));
    Object v14 = 1.0D;
    Object v15 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v14).doubleValue()));
    Object v16 = ((com.google.javascript.rhino.Node)v13).copyInformationFrom(((com.google.javascript.rhino.Node)v15));
    ((com.google.javascript.jscomp.InlineVariables)v4).process(((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v13));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "1";
    Object v2 = -14;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = 1.0D;
    Object v8 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()));
    Object v9 = 1.0D;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()));
    Object v11 = false;
    ((com.google.javascript.rhino.Node)v10).setWasEmptyNode((((java.lang.Boolean)v11).booleanValue()));
    Object v12 = null;
    ((com.google.javascript.jscomp.InlineVariables)v6).process(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v10));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v1),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = 1.0D;
    Object v8 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()));
    Object v9 = 1.0D;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()));
    ((com.google.javascript.jscomp.InlineVariables)v6).process(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 1.0D;
    Object v6 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v5).doubleValue()));
    Object v7 = 1.0D;
    Object v8 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()));
    Object v9 = ((com.google.javascript.rhino.Node)v6).checkTreeEquals(((com.google.javascript.rhino.Node)v8));
    Object v10 = 1.0D;
    Object v11 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()));
    ((com.google.javascript.jscomp.InlineVariables)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = 1.0D;
    Object v8 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()));
    Object v9 = 19.513660297010077D;
    ((com.google.javascript.rhino.Node)v8).setDouble((((java.lang.Double)v9).doubleValue()));
    Object v10 = null;
    Object v11 = 1.0D;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()));
    ((com.google.javascript.jscomp.InlineVariables)v6).process(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1.0D;
    Object v5 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v4).doubleValue()));
    Object v6 = ((com.google.javascript.rhino.Node)v5).toStringTree();
    Object v7 = 1.0D;
    Object v8 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()));
    ((com.google.javascript.jscomp.InlineVariables)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
    Object v2 = ((java.lang.Enum)v1).hashCode();
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v1),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v1),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 1.0D;
    Object v6 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v5).doubleValue()));
    Object v7 = 1.0D;
    Object v8 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()));
    ((com.google.javascript.jscomp.InlineVariables)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
    Object v2 = ((java.lang.Enum)v1).hashCode();
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v1),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 1.0D;
    Object v6 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v5).doubleValue()));
    Object v7 = ((com.google.javascript.rhino.Node)v6).hasSideEffects();
    Object v8 = 1.0D;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()));
    Object v10 = 0;
    ((com.google.javascript.rhino.Node)v9).setType((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    ((com.google.javascript.jscomp.InlineVariables)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v9));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = 1.0D;
    Object v8 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()));
    Object v9 = 1.0D;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()));
    ((com.google.javascript.rhino.Node)v8).addChildrenToBack(((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
    Object v12 = 1.0D;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v12).doubleValue()));
    ((com.google.javascript.jscomp.InlineVariables)v6).process(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
    Object v2 = ((java.lang.Enum)v1).hashCode();
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v1),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 1.0D;
    Object v6 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v5).doubleValue()));
    Object v7 = 1.0D;
    Object v8 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()));
    ((com.google.javascript.jscomp.InlineVariables)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
    Object v2 = ((java.lang.Enum)v1).hashCode();
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v1),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 1.0D;
    Object v6 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v5).doubleValue()));
    Object v7 = 1;
    Object v8 = "TR6E";
    Object v9 = ";";
    Object v10 = com.google.javascript.jscomp.DiagnosticType.warning(((java.lang.String)v8),((java.lang.String)v9));
    ((com.google.javascript.rhino.Node)v6).putProp((((java.lang.Integer)v7).intValue()),((java.lang.Object)v10));
    Object v11 = null;
    Object v12 = 1.0D;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v12).doubleValue()));
    ((com.google.javascript.jscomp.InlineVariables)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
    Object v2 = ((java.lang.Enum)v1).hashCode();
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v1),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 1.0D;
    Object v6 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v5).doubleValue()));
    Object v7 = 1.0D;
    Object v8 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()));
    Object v9 = 1;
    ((com.google.javascript.rhino.Node)v8).removeProp((((java.lang.Integer)v9).intValue()));
    Object v10 = null;
    ((com.google.javascript.jscomp.InlineVariables)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
    Object v2 = ((java.lang.Enum)v1).hashCode();
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v1),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 1.0D;
    Object v6 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v5).doubleValue()));
    Object v7 = 1.0D;
    Object v8 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()));
    ((com.google.javascript.jscomp.InlineVariables)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 1.0D;
    Object v6 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v5).doubleValue()));
    Object v7 = ((com.google.javascript.rhino.Node)v6).getAncestors();
    Object v8 = 1.0D;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()));
    ((com.google.javascript.jscomp.InlineVariables)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
    Object v2 = ((java.lang.Enum)v1).hashCode();
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v1),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 1.0D;
    Object v6 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v5).doubleValue()));
    Object v7 = 0.0D;
    ((com.google.javascript.rhino.Node)v6).setDouble((((java.lang.Double)v7).doubleValue()));
    Object v8 = null;
    Object v9 = 1.0D;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()));
    ((com.google.javascript.jscomp.InlineVariables)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "1";
    Object v2 = -14;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = 1.0D;
    Object v8 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()));
    Object v9 = 1.0D;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()));
    Object v11 = ((com.google.javascript.rhino.Node)v10).children();
    ((com.google.javascript.jscomp.InlineVariables)v6).process(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v10));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v2),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 1.0D;
    Object v6 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v5).doubleValue()));
    Object v7 = 1.0D;
    Object v8 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()));
    Object v9 = 1;
    ((com.google.javascript.rhino.Node)v8).setLineno((((java.lang.Integer)v9).intValue()));
    Object v10 = null;
    ((com.google.javascript.jscomp.InlineVariables)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 1.0D;
    Object v6 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v5).doubleValue()));
    Object v7 = 1.0D;
    Object v8 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()));
    ((com.google.javascript.jscomp.InlineVariables)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
    Object v2 = ((java.lang.Enum)v1).hashCode();
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v1),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 1.0D;
    Object v6 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v5).doubleValue()));
    Object v7 = 1.0D;
    Object v8 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()));
    Object v9 = ((com.google.javascript.rhino.Node)v8).getJsDocBuilderForNode();
    ((com.google.javascript.jscomp.InlineVariables)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 1.0D;
    Object v6 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v5).doubleValue()));
    Object v7 = 1.0D;
    Object v8 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()));
    Object v9 = ((com.google.javascript.rhino.Node)v8).toString();
    ((com.google.javascript.jscomp.InlineVariables)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
    Object v2 = ((java.lang.Enum)v1).hashCode();
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v1),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 1.0D;
    Object v6 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v5).doubleValue()));
    Object v7 = 1.0D;
    Object v8 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()));
    ((com.google.javascript.jscomp.InlineVariables)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 1.0D;
    Object v6 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v5).doubleValue()));
    Object v7 = 1.0D;
    Object v8 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()));
    ((com.google.javascript.jscomp.InlineVariables)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1.0D;
    Object v5 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v4).doubleValue()));
    Object v6 = ((com.google.javascript.rhino.Node)v5).getAncestors();
    Object v7 = 1.0D;
    Object v8 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()));
    ((com.google.javascript.jscomp.InlineVariables)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1.0D;
    Object v5 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v4).doubleValue()));
    Object v6 = false;
    ((com.google.javascript.rhino.Node)v5).setOptionalArg((((java.lang.Boolean)v6).booleanValue()));
    Object v7 = null;
    Object v8 = 1.0D;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()));
    ((com.google.javascript.jscomp.InlineVariables)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
    Object v2 = ((java.lang.Enum)v1).hashCode();
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v1),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 1.0D;
    Object v6 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v5).doubleValue()));
    Object v7 = 1.0D;
    Object v8 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()));
    Object v9 = ((com.google.javascript.rhino.Node)v6).copyInformationFromForTree(((com.google.javascript.rhino.Node)v8));
    Object v10 = 1.0D;
    Object v11 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()));
    ((com.google.javascript.jscomp.InlineVariables)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 1.0D;
    Object v6 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v5).doubleValue()));
    Object v7 = 1.0D;
    Object v8 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()));
    ((com.google.javascript.jscomp.InlineVariables)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v1),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
    Object v2 = ((java.lang.Enum)v1).hashCode();
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v1),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 1.0D;
    Object v6 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v5).doubleValue()));
    Object v7 = 1.0D;
    Object v8 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()));
    Object v9 = 0;
    ((com.google.javascript.rhino.Node)v8).setLineno((((java.lang.Integer)v9).intValue()));
    Object v10 = null;
    ((com.google.javascript.jscomp.InlineVariables)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v1),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
    Object v2 = ((java.lang.Enum)v1).hashCode();
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v1),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 1.0D;
    Object v6 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v5).doubleValue()));
    Object v7 = 1.0D;
    Object v8 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()));
    Object v9 = 1.0D;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()));
    Object v11 = 1.0D;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()));
    ((com.google.javascript.rhino.Node)v8).addChildAfter(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
    ((com.google.javascript.jscomp.InlineVariables)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v1),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 1.0D;
    Object v6 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v5).doubleValue()));
    Object v7 = 1.0D;
    Object v8 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()));
    ((com.google.javascript.jscomp.InlineVariables)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "O";
    Object v2 = -37;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v4),(((java.lang.Boolean)v5).booleanValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 1.0D;
    Object v6 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v5).doubleValue()));
    Object v7 = 1.0D;
    Object v8 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()));
    Object v9 = 1.0D;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()));
    Object v11 = 1.0D;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()));
    ((com.google.javascript.rhino.Node)v8).addChildAfter(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
    ((com.google.javascript.jscomp.InlineVariables)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "O";
    Object v2 = -37;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = 1.0D;
    Object v8 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()));
    Object v9 = 1.0D;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()));
    Object v11 = ((com.google.javascript.rhino.Node)v10).cloneTree();
    ((com.google.javascript.jscomp.InlineVariables)v6).process(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v10));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v1),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 1.0D;
    Object v6 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v5).doubleValue()));
    Object v7 = 1.0D;
    Object v8 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()));
    ((com.google.javascript.jscomp.InlineVariables)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "O";
    Object v2 = -37;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = 1.0D;
    Object v8 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()));
    Object v9 = 1.0D;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()));
    ((com.google.javascript.jscomp.InlineVariables)v6).process(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTopScope();
    Object v2 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v2),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 1.0D;
    Object v6 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v5).doubleValue()));
    Object v7 = 1.0D;
    Object v8 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()));
    ((com.google.javascript.jscomp.InlineVariables)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
    Object v10 = 1.0D;
    Object v11 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()));
    Object v12 = 1.0D;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v12).doubleValue()));
    ((com.google.javascript.jscomp.InlineVariables)v4).process(((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v1),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 1.0D;
    Object v6 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v5).doubleValue()));
    Object v7 = 1.0D;
    Object v8 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()));
    Object v9 = -24;
    Object v10 = false;
    Object v11 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean((((java.lang.Boolean)v10).booleanValue()));
    ((com.google.javascript.rhino.Node)v8).putProp((((java.lang.Integer)v9).intValue()),((java.lang.Object)v11));
    Object v12 = null;
    ((com.google.javascript.jscomp.InlineVariables)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTopScope();
    Object v2 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 1.0D;
    Object v6 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v5).doubleValue()));
    Object v7 = 1.0D;
    Object v8 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()));
    Object v9 = ((com.google.javascript.rhino.Node)v8).getDouble();
    ((com.google.javascript.jscomp.InlineVariables)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 1.0D;
    Object v6 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v5).doubleValue()));
    Object v7 = 1.0D;
    Object v8 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()));
    Object v9 = ((com.google.javascript.rhino.Node)v8).cloneTree();
    ((com.google.javascript.jscomp.InlineVariables)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
    Object v3 = ((java.lang.Enum)v2).hashCode();
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v2),(((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTopScope();
    Object v2 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 1.0D;
    Object v6 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v5).doubleValue()));
    Object v7 = 1.0D;
    Object v8 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()));
    ((com.google.javascript.jscomp.InlineVariables)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
    Object v3 = ((java.lang.Enum)v2).hashCode();
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v2),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = 1.0D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    Object v8 = 1.0D;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()));
    ((com.google.javascript.rhino.Node)v7).addChildToBack(((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
    Object v11 = 1.0D;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()));
    ((com.google.javascript.jscomp.InlineVariables)v5).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTopScope();
    Object v2 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 1.0D;
    Object v6 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v5).doubleValue()));
    Object v7 = 1.0D;
    Object v8 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()));
    Object v9 = -9;
    ((com.google.javascript.rhino.Node)v8).setType((((java.lang.Integer)v9).intValue()));
    Object v10 = null;
    ((com.google.javascript.jscomp.InlineVariables)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 1.0D;
    Object v6 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v5).doubleValue()));
    Object v7 = 1.0D;
    Object v8 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()));
    ((com.google.javascript.rhino.Node)v6).addChildToBack(((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
    Object v10 = 1.0D;
    Object v11 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()));
    Object v12 = 1;
    ((com.google.javascript.rhino.Node)v11).setCharno((((java.lang.Integer)v12).intValue()));
    Object v13 = null;
    ((com.google.javascript.jscomp.InlineVariables)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v11));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "O";
    Object v2 = -37;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = 1.0D;
    Object v8 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()));
    Object v9 = ((com.google.javascript.rhino.Node)v8).cloneTree();
    Object v10 = 1.0D;
    Object v11 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()));
    ((com.google.javascript.jscomp.InlineVariables)v6).process(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 1.0D;
    Object v6 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v5).doubleValue()));
    Object v7 = 1.0D;
    Object v8 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()));
    ((com.google.javascript.jscomp.InlineVariables)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
    Object v10 = 1.0D;
    Object v11 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()));
    Object v12 = 1.0D;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v12).doubleValue()));
    ((com.google.javascript.jscomp.InlineVariables)v4).process(((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v2),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }
}
