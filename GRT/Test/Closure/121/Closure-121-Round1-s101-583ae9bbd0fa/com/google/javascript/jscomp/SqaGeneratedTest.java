package com.google.javascript.jscomp;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -38;
    Object v5 = -37;
    Object v6 = 12;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = -38;
    Object v9 = -37;
    Object v10 = 12;
    Object v11 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    ((com.google.javascript.jscomp.InlineVariables)v3).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
    Object v2 = ((java.lang.Enum)v1).hashCode();
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v1),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "prototypge";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v4),(((java.lang.Boolean)v5).booleanValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v1),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v1),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
    Object v2 = ((java.lang.Enum)v1).hashCode();
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v1),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = -38;
    Object v6 = -37;
    Object v7 = 12;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = -38;
    Object v10 = -37;
    Object v11 = 12;
    Object v12 = new com.google.javascript.rhino.Node((((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    ((com.google.javascript.jscomp.InlineVariables)v4).process(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -38;
    Object v5 = -37;
    Object v6 = 12;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = ((com.google.javascript.rhino.Node)v7).isOptionalArg();
    Object v9 = -38;
    Object v10 = -37;
    Object v11 = 12;
    Object v12 = new com.google.javascript.rhino.Node((((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    ((com.google.javascript.jscomp.InlineVariables)v3).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "prototypge";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = -38;
    Object v8 = -37;
    Object v9 = 12;
    Object v10 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = -38;
    Object v12 = -37;
    Object v13 = 12;
    Object v14 = new com.google.javascript.rhino.Node((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    ((com.google.javascript.jscomp.InlineVariables)v6).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v14));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v1),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v1),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v1),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = -38;
    Object v6 = -37;
    Object v7 = 12;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = -38;
    Object v10 = -37;
    Object v11 = 12;
    Object v12 = new com.google.javascript.rhino.Node((((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    ((com.google.javascript.jscomp.InlineVariables)v4).process(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -38;
    Object v5 = -37;
    Object v6 = 12;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = -38;
    Object v9 = -37;
    Object v10 = 12;
    Object v11 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = -27;
    Object v13 = ((com.google.javascript.rhino.Node)v11).getProp((((java.lang.Integer)v12).intValue()));
    ((com.google.javascript.jscomp.InlineVariables)v3).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v11));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -38;
    Object v5 = -37;
    Object v6 = 12;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = -38;
    Object v9 = -37;
    Object v10 = 12;
    Object v11 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = ((com.google.javascript.rhino.Node)v7).checkTreeEquals(((com.google.javascript.rhino.Node)v11));
    Object v13 = -38;
    Object v14 = -37;
    Object v15 = 12;
    Object v16 = new com.google.javascript.rhino.Node((((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = ((com.google.javascript.rhino.Node)v16).cloneNode();
    ((com.google.javascript.jscomp.InlineVariables)v3).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v16));
    Object v18 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -38;
    Object v5 = -37;
    Object v6 = 12;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = -38;
    Object v9 = -37;
    Object v10 = 12;
    Object v11 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    ((com.google.javascript.jscomp.InlineVariables)v3).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTopScope();
    Object v2 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v2),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v1),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = -38;
    Object v6 = -37;
    Object v7 = 12;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = ((com.google.javascript.rhino.Node)v8).isQualifiedName();
    Object v10 = -38;
    Object v11 = -37;
    Object v12 = 12;
    Object v13 = new com.google.javascript.rhino.Node((((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    ((com.google.javascript.jscomp.InlineVariables)v4).process(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v2),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v2),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v1),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = -38;
    Object v6 = -37;
    Object v7 = 12;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = -38;
    Object v10 = -37;
    Object v11 = 12;
    Object v12 = new com.google.javascript.rhino.Node((((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    ((com.google.javascript.jscomp.InlineVariables)v4).process(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -38;
    Object v5 = -37;
    Object v6 = 12;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = -22;
    Object v9 = false;
    ((com.google.javascript.rhino.Node)v7).putBooleanProp((((java.lang.Integer)v8).intValue()),(((java.lang.Boolean)v9).booleanValue()));
    Object v10 = null;
    Object v11 = -38;
    Object v12 = -37;
    Object v13 = 12;
    Object v14 = new com.google.javascript.rhino.Node((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = ((com.google.javascript.rhino.Node)v14).getLength();
    ((com.google.javascript.jscomp.InlineVariables)v3).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v14));
    Object v16 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTopScope();
    Object v2 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = -38;
    Object v6 = -37;
    Object v7 = 12;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = -38;
    Object v10 = -37;
    Object v11 = 12;
    Object v12 = new com.google.javascript.rhino.Node((((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    ((com.google.javascript.jscomp.InlineVariables)v4).process(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = -38;
    Object v6 = -37;
    Object v7 = 12;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = -38;
    Object v10 = -37;
    Object v11 = 12;
    Object v12 = new com.google.javascript.rhino.Node((((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = "null";
    ((com.google.javascript.rhino.Node)v12).addSuppression(((java.lang.String)v13));
    Object v14 = null;
    ((com.google.javascript.jscomp.InlineVariables)v4).process(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v12));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getProgress();
    Object v2 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v2),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v1),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v1),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "RESET";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
    Object v5 = ((java.lang.Enum)v4).getDeclaringClass();
    Object v6 = false;
    Object v7 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v4),(((java.lang.Boolean)v6).booleanValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getProgress();
    Object v2 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = -38;
    Object v6 = -37;
    Object v7 = 12;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = -38;
    Object v10 = -37;
    Object v11 = 12;
    Object v12 = new com.google.javascript.rhino.Node((((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = ((com.google.javascript.rhino.Node)v12).getSideEffectFlags();
    ((com.google.javascript.jscomp.InlineVariables)v4).process(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v12));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
    Object v2 = ((java.lang.Enum)v1).hashCode();
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v1),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getProgress();
    Object v2 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = -38;
    Object v6 = -37;
    Object v7 = 12;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = ((com.google.javascript.rhino.Node)v8).getDirectives();
    Object v10 = -38;
    Object v11 = -37;
    Object v12 = 12;
    Object v13 = new com.google.javascript.rhino.Node((((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    ((com.google.javascript.jscomp.InlineVariables)v4).process(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v1),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -38;
    Object v5 = -37;
    Object v6 = 12;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = -38;
    Object v9 = -37;
    Object v10 = 12;
    Object v11 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    ((com.google.javascript.rhino.Node)v11).detachChildren();
    Object v12 = null;
    ((com.google.javascript.jscomp.InlineVariables)v3).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v11));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getProgress();
    Object v2 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = -38;
    Object v6 = -37;
    Object v7 = 12;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = -38;
    Object v10 = -37;
    Object v11 = 12;
    Object v12 = new com.google.javascript.rhino.Node((((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    ((com.google.javascript.jscomp.InlineVariables)v4).process(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v2),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
    Object v3 = ((java.lang.Enum)v2).hashCode();
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v2),(((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v1),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = -38;
    Object v6 = -37;
    Object v7 = 12;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = -38;
    Object v10 = -37;
    Object v11 = 12;
    Object v12 = new com.google.javascript.rhino.Node((((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    ((com.google.javascript.jscomp.InlineVariables)v4).process(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -38;
    Object v5 = -37;
    Object v6 = 12;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    ((com.google.javascript.rhino.Node)v7).detachChildren();
    Object v8 = null;
    Object v9 = -38;
    Object v10 = -37;
    Object v11 = 12;
    Object v12 = new com.google.javascript.rhino.Node((((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    ((com.google.javascript.jscomp.InlineVariables)v3).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
    Object v3 = ((java.lang.Enum)v2).hashCode();
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v2),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = -38;
    Object v7 = -37;
    Object v8 = 12;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = -38;
    Object v11 = -37;
    Object v12 = 12;
    Object v13 = new com.google.javascript.rhino.Node((((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    ((com.google.javascript.jscomp.InlineVariables)v5).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
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
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "I";
    Object v2 = -8;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
    Object v5 = false;
    Object v6 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v4),(((java.lang.Boolean)v5).booleanValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "RESET";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
    Object v5 = ((java.lang.Enum)v4).getDeclaringClass();
    Object v6 = false;
    Object v7 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v4),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = -38;
    Object v9 = -37;
    Object v10 = 12;
    Object v11 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = -38;
    Object v13 = -37;
    Object v14 = 12;
    Object v15 = new com.google.javascript.rhino.Node((((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    ((com.google.javascript.jscomp.InlineVariables)v7).process(((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v1),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
    Object v3 = ((java.lang.Enum)v2).hashCode();
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v2),(((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v1),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
    Object v2 = ((java.lang.Enum)v1).hashCode();
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v1),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v1),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = -38;
    Object v6 = -37;
    Object v7 = 12;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = -38;
    Object v10 = -37;
    Object v11 = 12;
    Object v12 = new com.google.javascript.rhino.Node((((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    ((com.google.javascript.jscomp.InlineVariables)v4).process(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = -38;
    Object v6 = -37;
    Object v7 = 12;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = -38;
    Object v10 = -37;
    Object v11 = 12;
    Object v12 = new com.google.javascript.rhino.Node((((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = ((com.google.javascript.rhino.Node)v8).useSourceInfoIfMissingFrom(((com.google.javascript.rhino.Node)v12));
    Object v14 = -38;
    Object v15 = -37;
    Object v16 = 12;
    Object v17 = new com.google.javascript.rhino.Node((((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    ((com.google.javascript.jscomp.InlineVariables)v4).process(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v17));
    Object v18 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v1),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = -38;
    Object v6 = -37;
    Object v7 = 12;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = -38;
    Object v10 = -37;
    Object v11 = 12;
    Object v12 = new com.google.javascript.rhino.Node((((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = new java.util.TreeSet();
    Object v14 = new java.util.TreeSet(((java.util.SortedSet)v13));
    ((com.google.javascript.rhino.Node)v12).setDirectives(((java.util.Set)v14));
    Object v15 = null;
    ((com.google.javascript.jscomp.InlineVariables)v4).process(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v12));
    Object v16 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
    Object v3 = ((java.lang.Enum)v2).hashCode();
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v2),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = -38;
    Object v7 = -37;
    Object v8 = 12;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = ((com.google.javascript.rhino.Node)v9).getJsDocBuilderForNode();
    Object v11 = -38;
    Object v12 = -37;
    Object v13 = 12;
    Object v14 = new com.google.javascript.rhino.Node((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    ((com.google.javascript.jscomp.InlineVariables)v5).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v14));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -38;
    Object v5 = -37;
    Object v6 = 12;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = -29;
    Object v9 = false;
    ((com.google.javascript.rhino.Node)v7).putBooleanProp((((java.lang.Integer)v8).intValue()),(((java.lang.Boolean)v9).booleanValue()));
    Object v10 = null;
    Object v11 = -38;
    Object v12 = -37;
    Object v13 = 12;
    Object v14 = new com.google.javascript.rhino.Node((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    ((com.google.javascript.jscomp.InlineVariables)v3).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v14));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v1),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = -38;
    Object v6 = -37;
    Object v7 = 12;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = -38;
    Object v10 = -37;
    Object v11 = 12;
    Object v12 = new com.google.javascript.rhino.Node((((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = 1;
    ((com.google.javascript.rhino.Node)v12).setType((((java.lang.Integer)v13).intValue()));
    Object v14 = null;
    ((com.google.javascript.jscomp.InlineVariables)v4).process(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v12));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v1),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v1),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = -38;
    Object v6 = -37;
    Object v7 = 12;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = -38;
    Object v10 = -37;
    Object v11 = 12;
    Object v12 = new com.google.javascript.rhino.Node((((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    ((com.google.javascript.jscomp.InlineVariables)v4).process(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v1),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = -38;
    Object v6 = -37;
    Object v7 = 12;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = -38;
    Object v10 = -37;
    Object v11 = 12;
    Object v12 = new com.google.javascript.rhino.Node((((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    ((com.google.javascript.jscomp.InlineVariables)v4).process(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v12));
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
    Object v4 = -38;
    Object v5 = -37;
    Object v6 = 12;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = ((com.google.javascript.rhino.Node)v7).getAncestors();
    Object v9 = -38;
    Object v10 = -37;
    Object v11 = 12;
    Object v12 = new com.google.javascript.rhino.Node((((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = -38;
    Object v14 = -37;
    Object v15 = 12;
    Object v16 = new com.google.javascript.rhino.Node((((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = ((com.google.javascript.rhino.Node)v12).isEquivalentTo(((com.google.javascript.rhino.Node)v16));
    ((com.google.javascript.jscomp.InlineVariables)v3).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v12));
    Object v18 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
    Object v2 = ((java.lang.Enum)v1).hashCode();
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v1),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getProgress();
    Object v2 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v2),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -38;
    Object v5 = -37;
    Object v6 = 12;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = -38;
    Object v9 = -37;
    Object v10 = 12;
    Object v11 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    ((com.google.javascript.jscomp.InlineVariables)v3).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
    Object v2 = ((java.lang.Enum)v1).hashCode();
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v1),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = -38;
    Object v6 = -37;
    Object v7 = 12;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = -38;
    Object v10 = -37;
    Object v11 = 12;
    Object v12 = new com.google.javascript.rhino.Node((((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = 1;
    ((com.google.javascript.rhino.Node)v12).setLength((((java.lang.Integer)v13).intValue()));
    Object v14 = null;
    ((com.google.javascript.jscomp.InlineVariables)v4).process(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v12));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
    Object v3 = ((java.lang.Enum)v2).hashCode();
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v2),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = -38;
    Object v7 = -37;
    Object v8 = 12;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = -38;
    Object v11 = -37;
    Object v12 = 12;
    Object v13 = new com.google.javascript.rhino.Node((((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = ((com.google.javascript.rhino.Node)v9).copyInformationFrom(((com.google.javascript.rhino.Node)v13));
    Object v15 = -38;
    Object v16 = -37;
    Object v17 = 12;
    Object v18 = new com.google.javascript.rhino.Node((((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()));
    ((com.google.javascript.jscomp.InlineVariables)v5).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v18));
    Object v19 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
    Object v3 = ((java.lang.Enum)v2).hashCode();
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v2),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = -38;
    Object v7 = -37;
    Object v8 = 12;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = -38;
    Object v11 = -37;
    Object v12 = 12;
    Object v13 = new com.google.javascript.rhino.Node((((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    ((com.google.javascript.jscomp.InlineVariables)v5).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
    Object v2 = ((java.lang.Enum)v1).hashCode();
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v1),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = -38;
    Object v6 = -37;
    Object v7 = 12;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = -38;
    Object v10 = -37;
    Object v11 = 12;
    Object v12 = new com.google.javascript.rhino.Node((((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    ((com.google.javascript.jscomp.InlineVariables)v4).process(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
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
    Object v5 = -38;
    Object v6 = -37;
    Object v7 = 12;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = -38;
    Object v10 = -37;
    Object v11 = 12;
    Object v12 = new com.google.javascript.rhino.Node((((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = ((com.google.javascript.rhino.Node)v12).mayMutateArguments();
    ((com.google.javascript.jscomp.InlineVariables)v4).process(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v12));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "\n";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v4),(((java.lang.Boolean)v5).booleanValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getProgress();
    Object v2 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = -38;
    Object v6 = -37;
    Object v7 = 12;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = ((com.google.javascript.rhino.Node)v8).getChangeTime();
    Object v10 = -38;
    Object v11 = -37;
    Object v12 = 12;
    Object v13 = new com.google.javascript.rhino.Node((((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    ((com.google.javascript.jscomp.InlineVariables)v4).process(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v2),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v1),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = -38;
    Object v6 = -37;
    Object v7 = 12;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = -38;
    Object v10 = -37;
    Object v11 = 12;
    Object v12 = new com.google.javascript.rhino.Node((((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = ((com.google.javascript.rhino.Node)v12).wasEmptyNode();
    ((com.google.javascript.jscomp.InlineVariables)v4).process(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v12));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
    Object v2 = ((java.lang.Enum)v1).hashCode();
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v1),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = -38;
    Object v6 = -37;
    Object v7 = 12;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = -38;
    Object v10 = -37;
    Object v11 = 12;
    Object v12 = new com.google.javascript.rhino.Node((((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    ((com.google.javascript.jscomp.InlineVariables)v4).process(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -38;
    Object v5 = -37;
    Object v6 = 12;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = -38;
    Object v9 = -37;
    Object v10 = 12;
    Object v11 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = ((com.google.javascript.rhino.Node)v11).getQualifiedName();
    ((com.google.javascript.jscomp.InlineVariables)v3).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v11));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "RESET";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
    Object v5 = ((java.lang.Enum)v4).getDeclaringClass();
    Object v6 = false;
    Object v7 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v4),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = -38;
    Object v9 = -37;
    Object v10 = 12;
    Object v11 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = ((com.google.javascript.rhino.Node)v11).isOptionalArg();
    Object v13 = -38;
    Object v14 = -37;
    Object v15 = 12;
    Object v16 = new com.google.javascript.rhino.Node((((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = new com.google.javascript.rhino.JSDocInfo();
    Object v18 = ((com.google.javascript.rhino.Node)v16).setJSDocInfo(((com.google.javascript.rhino.JSDocInfo)v17));
    ((com.google.javascript.jscomp.InlineVariables)v7).process(((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v16));
    Object v19 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "RESET";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
    Object v5 = ((java.lang.Enum)v4).getDeclaringClass();
    Object v6 = false;
    Object v7 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v4),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = -38;
    Object v9 = -37;
    Object v10 = 12;
    Object v11 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = 0;
    Object v13 = ((com.google.javascript.rhino.Node)v11).getProp((((java.lang.Integer)v12).intValue()));
    Object v14 = -38;
    Object v15 = -37;
    Object v16 = 12;
    Object v17 = new com.google.javascript.rhino.Node((((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    ((com.google.javascript.jscomp.InlineVariables)v7).process(((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v17));
    Object v18 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getProgress();
    Object v2 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = -38;
    Object v6 = -37;
    Object v7 = 12;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = -38;
    Object v10 = -37;
    Object v11 = 12;
    Object v12 = new com.google.javascript.rhino.Node((((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = ((com.google.javascript.rhino.Node)v12).isNoSideEffectsCall();
    ((com.google.javascript.jscomp.InlineVariables)v4).process(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v12));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getProgress();
    Object v2 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = -38;
    Object v6 = -37;
    Object v7 = 12;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = -38;
    Object v10 = -37;
    Object v11 = 12;
    Object v12 = new com.google.javascript.rhino.Node((((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = -38;
    Object v14 = -37;
    Object v15 = 12;
    Object v16 = new com.google.javascript.rhino.Node((((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    ((com.google.javascript.rhino.Node)v12).addChildToBack(((com.google.javascript.rhino.Node)v16));
    Object v17 = null;
    ((com.google.javascript.jscomp.InlineVariables)v4).process(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v12));
    Object v18 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = -38;
    Object v6 = -37;
    Object v7 = 12;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = ((com.google.javascript.rhino.Node)v8).isOnlyModifiesArgumentsCall();
    Object v10 = -38;
    Object v11 = -37;
    Object v12 = 12;
    Object v13 = new com.google.javascript.rhino.Node((((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    ((com.google.javascript.jscomp.InlineVariables)v4).process(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v1),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -38;
    Object v5 = -37;
    Object v6 = 12;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = -38;
    Object v9 = -37;
    Object v10 = 12;
    Object v11 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = 1;
    Object v13 = true;
    ((com.google.javascript.rhino.Node)v11).putBooleanProp((((java.lang.Integer)v12).intValue()),(((java.lang.Boolean)v13).booleanValue()));
    Object v14 = null;
    ((com.google.javascript.jscomp.InlineVariables)v3).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v11));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
    Object v2 = ((java.lang.Enum)v1).hashCode();
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v1),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = -38;
    Object v6 = -37;
    Object v7 = 12;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = -38;
    Object v10 = -37;
    Object v11 = 12;
    Object v12 = new com.google.javascript.rhino.Node((((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = -38;
    Object v14 = -37;
    Object v15 = 12;
    Object v16 = new com.google.javascript.rhino.Node((((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    ((com.google.javascript.rhino.Node)v12).addChildrenToFront(((com.google.javascript.rhino.Node)v16));
    Object v17 = null;
    ((com.google.javascript.jscomp.InlineVariables)v4).process(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v12));
    Object v18 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
    Object v3 = ((java.lang.Enum)v2).getDeclaringClass();
    Object v4 = true;
    Object v5 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v2),(((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "\n";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = -38;
    Object v8 = -37;
    Object v9 = 12;
    Object v10 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = -38;
    Object v12 = -37;
    Object v13 = 12;
    Object v14 = new com.google.javascript.rhino.Node((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    ((com.google.javascript.jscomp.InlineVariables)v6).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v14));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
    Object v2 = ((java.lang.Enum)v1).hashCode();
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v1),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = -38;
    Object v6 = -37;
    Object v7 = 12;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = -38;
    Object v10 = -37;
    Object v11 = 12;
    Object v12 = new com.google.javascript.rhino.Node((((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    ((com.google.javascript.jscomp.InlineVariables)v4).process(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v1),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = -38;
    Object v6 = -37;
    Object v7 = 12;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = ((com.google.javascript.rhino.Node)v8).isFromExterns();
    Object v10 = -38;
    Object v11 = -37;
    Object v12 = 12;
    Object v13 = new com.google.javascript.rhino.Node((((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    ((com.google.javascript.jscomp.InlineVariables)v4).process(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -38;
    Object v5 = -37;
    Object v6 = 12;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = -38;
    Object v9 = -37;
    Object v10 = 12;
    Object v11 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    ((com.google.javascript.jscomp.InlineVariables)v3).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "I";
    Object v2 = -8;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
    Object v5 = false;
    Object v6 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = -38;
    Object v8 = -37;
    Object v9 = 12;
    Object v10 = new com.google.javascript.rhino.Node((((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = -38;
    Object v12 = -37;
    Object v13 = 12;
    Object v14 = new com.google.javascript.rhino.Node((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    ((com.google.javascript.jscomp.InlineVariables)v6).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v14));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = -38;
    Object v6 = -37;
    Object v7 = 12;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = -38;
    Object v10 = -37;
    Object v11 = 12;
    Object v12 = new com.google.javascript.rhino.Node((((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    ((com.google.javascript.jscomp.InlineVariables)v4).process(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = -38;
    Object v6 = -37;
    Object v7 = 12;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = -38;
    Object v10 = -37;
    Object v11 = 12;
    Object v12 = new com.google.javascript.rhino.Node((((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = -38;
    Object v14 = -37;
    Object v15 = 12;
    Object v16 = new com.google.javascript.rhino.Node((((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = ((com.google.javascript.rhino.Node)v12).useSourceInfoFromForTree(((com.google.javascript.rhino.Node)v16));
    ((com.google.javascript.jscomp.InlineVariables)v4).process(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v12));
    Object v18 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getProgress();
    Object v2 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = -38;
    Object v6 = -37;
    Object v7 = 12;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = ((com.google.javascript.rhino.Node)v8).siblings();
    Object v10 = -38;
    Object v11 = -37;
    Object v12 = 12;
    Object v13 = new com.google.javascript.rhino.Node((((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = ((com.google.javascript.rhino.Node)v13).isOnlyModifiesArgumentsCall();
    ((com.google.javascript.jscomp.InlineVariables)v4).process(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v13));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -38;
    Object v5 = -37;
    Object v6 = 12;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = -38;
    Object v9 = -37;
    Object v10 = 12;
    Object v11 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = 3;
    ((com.google.javascript.rhino.Node)v11).setCharno((((java.lang.Integer)v12).intValue()));
    Object v13 = null;
    ((com.google.javascript.jscomp.InlineVariables)v3).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v11));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
    Object v3 = ((java.lang.Enum)v2).getDeclaringClass();
    Object v4 = true;
    Object v5 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v2),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = -38;
    Object v7 = -37;
    Object v8 = 12;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = -38;
    Object v11 = -37;
    Object v12 = 12;
    Object v13 = new com.google.javascript.rhino.Node((((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    ((com.google.javascript.jscomp.InlineVariables)v5).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
    Object v3 = ((java.lang.Enum)v2).getDeclaringClass();
    Object v4 = true;
    Object v5 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v2),(((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
    Object v2 = ((java.lang.Enum)v1).hashCode();
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v1),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = -38;
    Object v6 = -37;
    Object v7 = 12;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = -38;
    Object v10 = -37;
    Object v11 = 12;
    Object v12 = new com.google.javascript.rhino.Node((((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    ((com.google.javascript.jscomp.InlineVariables)v4).process(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -38;
    Object v5 = -37;
    Object v6 = 12;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = -38;
    Object v9 = -37;
    Object v10 = 12;
    Object v11 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = -38;
    Object v13 = -37;
    Object v14 = 12;
    Object v15 = new com.google.javascript.rhino.Node((((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = ((com.google.javascript.rhino.Node)v11).copyInformationFrom(((com.google.javascript.rhino.Node)v15));
    ((com.google.javascript.jscomp.InlineVariables)v3).process(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v11));
    Object v17 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
    Object v3 = ((java.lang.Enum)v2).getDeclaringClass();
    Object v4 = true;
    Object v5 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v2),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = -38;
    Object v7 = -37;
    Object v8 = 12;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = -38;
    Object v11 = -37;
    Object v12 = 12;
    Object v13 = new com.google.javascript.rhino.Node((((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = true;
    ((com.google.javascript.rhino.Node)v13).setVarArgs((((java.lang.Boolean)v14).booleanValue()));
    Object v15 = null;
    ((com.google.javascript.jscomp.InlineVariables)v5).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v13));
    Object v16 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
    Object v3 = ((java.lang.Enum)v2).hashCode();
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v2),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = -38;
    Object v7 = -37;
    Object v8 = 12;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = ((com.google.javascript.rhino.Node)v9).removeFirstChild();
    Object v11 = -38;
    Object v12 = -37;
    Object v13 = 12;
    Object v14 = new com.google.javascript.rhino.Node((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    ((com.google.javascript.jscomp.InlineVariables)v5).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v14));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
    Object v3 = ((java.lang.Enum)v2).getDeclaringClass();
    Object v4 = true;
    Object v5 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v2),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = -38;
    Object v7 = -37;
    Object v8 = 12;
    Object v9 = new com.google.javascript.rhino.Node((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = -38;
    Object v11 = -37;
    Object v12 = 12;
    Object v13 = new com.google.javascript.rhino.Node((((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    ((com.google.javascript.jscomp.InlineVariables)v5).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = -38;
    Object v6 = -37;
    Object v7 = 12;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = -38;
    Object v10 = -37;
    Object v11 = 12;
    Object v12 = new com.google.javascript.rhino.Node((((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    ((com.google.javascript.jscomp.InlineVariables)v4).process(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getProgress();
    Object v2 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = -38;
    Object v6 = -37;
    Object v7 = 12;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = -38;
    Object v10 = -37;
    Object v11 = 12;
    Object v12 = new com.google.javascript.rhino.Node((((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = new com.google.javascript.rhino.JSDocInfo();
    Object v14 = ((com.google.javascript.rhino.Node)v12).setJSDocInfo(((com.google.javascript.rhino.JSDocInfo)v13));
    ((com.google.javascript.jscomp.InlineVariables)v4).process(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v12));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = -38;
    Object v6 = -37;
    Object v7 = 12;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = -38;
    Object v10 = -37;
    Object v11 = 12;
    Object v12 = new com.google.javascript.rhino.Node((((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    ((com.google.javascript.jscomp.InlineVariables)v4).process(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v1),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = -38;
    Object v6 = -37;
    Object v7 = 12;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = -38;
    Object v10 = -37;
    Object v11 = 12;
    Object v12 = new com.google.javascript.rhino.Node((((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    ((com.google.javascript.jscomp.InlineVariables)v4).process(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ".prototy";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
    Object v5 = ((java.lang.Enum)v4).getDeclaringClass();
    Object v6 = false;
    Object v7 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v4),(((java.lang.Boolean)v6).booleanValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTopScope();
    Object v2 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.InlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.InlineVariables.Mode)v2),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }
}
