package com.google.javascript.jscomp;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = ((com.google.javascript.jscomp.NodeTraversal)v5).getEnclosingFunction();
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v1).enterScope(((com.google.javascript.jscomp.NodeTraversal)v5));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = "7";
    Object v7 = com.google.javascript.rhino.IR.name(((java.lang.String)v6));
    Object v8 = "";
    Object v9 = "";
    Object v10 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = new java.lang.String[]{"",""};
    Object v12 = ((com.google.javascript.jscomp.NodeTraversal)v5).makeError(((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.DiagnosticType)v10),((java.lang.String[])v11));
    Object v13 = "7";
    Object v14 = com.google.javascript.rhino.IR.name(((java.lang.String)v13));
    Object v15 = "7";
    Object v16 = com.google.javascript.rhino.IR.name(((java.lang.String)v15));
    Object v17 = ((com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback)v1).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v5),((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.Node)v16));
    org.junit.Assert.assertEquals((Object)(true), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v1).enterScope(((com.google.javascript.jscomp.NodeTraversal)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v1).exitScope(((com.google.javascript.jscomp.NodeTraversal)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = "7";
    Object v7 = com.google.javascript.rhino.IR.name(((java.lang.String)v6));
    Object v8 = "";
    Object v9 = "";
    Object v10 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = new java.lang.String[]{"","nul-"};
    ((com.google.javascript.jscomp.NodeTraversal)v5).report(((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.DiagnosticType)v10),((java.lang.String[])v11));
    Object v12 = null;
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v1).enterScope(((com.google.javascript.jscomp.NodeTraversal)v5));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v1).enterScope(((com.google.javascript.jscomp.NodeTraversal)v5));
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = new com.google.javascript.jscomp.Compiler();
    Object v9 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v8));
    Object v10 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v7),((com.google.javascript.jscomp.NodeTraversal.Callback)v9));
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v1).enterScope(((com.google.javascript.jscomp.NodeTraversal)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = ((com.google.javascript.jscomp.NodeTraversal)v5).getScope();
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v1).enterScope(((com.google.javascript.jscomp.NodeTraversal)v5));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = "7";
    Object v7 = com.google.javascript.rhino.IR.name(((java.lang.String)v6));
    Object v8 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v9 = "";
    Object v10 = "";
    Object v11 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = new java.lang.String[]{};
    Object v13 = ((com.google.javascript.jscomp.NodeTraversal)v5).makeError(((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.CheckLevel)v8),((com.google.javascript.jscomp.DiagnosticType)v11),((java.lang.String[])v12));
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v1).enterScope(((com.google.javascript.jscomp.NodeTraversal)v5));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v1).enterScope(((com.google.javascript.jscomp.NodeTraversal)v5));
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = new com.google.javascript.jscomp.Compiler();
    Object v9 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v8));
    Object v10 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v7),((com.google.javascript.jscomp.NodeTraversal.Callback)v9));
    Object v11 = "7";
    Object v12 = com.google.javascript.rhino.IR.name(((java.lang.String)v11));
    Object v13 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v14 = "";
    Object v15 = "";
    Object v16 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v14),((java.lang.String)v15));
    Object v17 = new java.lang.String[]{"","\\."};
    Object v18 = ((com.google.javascript.jscomp.NodeTraversal)v10).makeError(((com.google.javascript.rhino.Node)v12),((com.google.javascript.jscomp.CheckLevel)v13),((com.google.javascript.jscomp.DiagnosticType)v16),((java.lang.String[])v17));
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v1).enterScope(((com.google.javascript.jscomp.NodeTraversal)v10));
    Object v19 = null;
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = "7";
    Object v7 = com.google.javascript.rhino.IR.name(((java.lang.String)v6));
    Object v8 = "7";
    Object v9 = com.google.javascript.rhino.IR.name(((java.lang.String)v8));
    Object v10 = "7";
    Object v11 = com.google.javascript.rhino.IR.name(((java.lang.String)v10));
    Object v12 = ((com.google.javascript.rhino.Node)v9).clonePropsFrom(((com.google.javascript.rhino.Node)v11));
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v1).visit(((com.google.javascript.jscomp.NodeTraversal)v5),((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = "7";
    Object v7 = com.google.javascript.rhino.IR.name(((java.lang.String)v6));
    Object v8 = "7";
    Object v9 = com.google.javascript.rhino.IR.name(((java.lang.String)v8));
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v1).visit(((com.google.javascript.jscomp.NodeTraversal)v5),((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v1).enterScope(((com.google.javascript.jscomp.NodeTraversal)v5));
    Object v6 = null;
    Object v7 = "7";
    Object v8 = com.google.javascript.rhino.IR.name(((java.lang.String)v7));
    Object v9 = "7";
    Object v10 = com.google.javascript.rhino.IR.name(((java.lang.String)v9));
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v1).process(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = "7";
    Object v7 = com.google.javascript.rhino.IR.name(((java.lang.String)v6));
    Object v8 = "7";
    Object v9 = com.google.javascript.rhino.IR.name(((java.lang.String)v8));
    ((com.google.javascript.jscomp.NodeTraversal.Callback)v1).visit(((com.google.javascript.jscomp.NodeTraversal)v5),((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Compiler();
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v11),((com.google.javascript.jscomp.NodeTraversal.Callback)v13));
    Object v15 = "7";
    Object v16 = com.google.javascript.rhino.IR.name(((java.lang.String)v15));
    Object v17 = "7";
    Object v18 = com.google.javascript.rhino.IR.name(((java.lang.String)v17));
    Object v19 = ((com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback)v1).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v14),((com.google.javascript.rhino.Node)v16),((com.google.javascript.rhino.Node)v18));
    org.junit.Assert.assertEquals((Object)(true), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = "7";
    Object v3 = com.google.javascript.rhino.IR.name(((java.lang.String)v2));
    Object v4 = "7";
    Object v5 = com.google.javascript.rhino.IR.name(((java.lang.String)v4));
    Object v6 = ((com.google.javascript.rhino.Node)v5).isOnlyModifiesThisCall();
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v1).process(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.Node)v5));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = "7";
    Object v3 = com.google.javascript.rhino.IR.name(((java.lang.String)v2));
    Object v4 = "7";
    Object v5 = com.google.javascript.rhino.IR.name(((java.lang.String)v4));
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v1).process(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.Node)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = ((com.google.javascript.jscomp.NodeTraversal)v5).hasScope();
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v1).enterScope(((com.google.javascript.jscomp.NodeTraversal)v5));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = "7";
    Object v7 = com.google.javascript.rhino.IR.name(((java.lang.String)v6));
    Object v8 = "";
    Object v9 = "";
    Object v10 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = new java.lang.String[]{};
    Object v12 = ((com.google.javascript.jscomp.NodeTraversal)v5).makeError(((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.DiagnosticType)v10),((java.lang.String[])v11));
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v1).enterScope(((com.google.javascript.jscomp.NodeTraversal)v5));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v1).enterScope(((com.google.javascript.jscomp.NodeTraversal)v5));
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = new com.google.javascript.jscomp.Compiler();
    Object v9 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v8));
    Object v10 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v7),((com.google.javascript.jscomp.NodeTraversal.Callback)v9));
    Object v11 = "7";
    Object v12 = com.google.javascript.rhino.IR.name(((java.lang.String)v11));
    Object v13 = "7";
    Object v14 = com.google.javascript.rhino.IR.name(((java.lang.String)v13));
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v1).visit(((com.google.javascript.jscomp.NodeTraversal)v10),((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v14));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = "7";
    Object v7 = com.google.javascript.rhino.IR.name(((java.lang.String)v6));
    Object v8 = "7";
    Object v9 = com.google.javascript.rhino.IR.name(((java.lang.String)v8));
    Object v10 = ((com.google.javascript.rhino.Node)v9).getInputId();
    Object v11 = ((com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback)v1).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v5),((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9));
    org.junit.Assert.assertEquals((Object)(true), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v1).enterScope(((com.google.javascript.jscomp.NodeTraversal)v5));
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = new com.google.javascript.jscomp.Compiler();
    Object v9 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v8));
    Object v10 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v7),((com.google.javascript.jscomp.NodeTraversal.Callback)v9));
    Object v11 = "7";
    Object v12 = com.google.javascript.rhino.IR.name(((java.lang.String)v11));
    Object v13 = "";
    Object v14 = "";
    Object v15 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = new java.lang.String[]{};
    Object v17 = ((com.google.javascript.jscomp.NodeTraversal)v10).makeError(((com.google.javascript.rhino.Node)v12),((com.google.javascript.jscomp.DiagnosticType)v15),((java.lang.String[])v16));
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v1).enterScope(((com.google.javascript.jscomp.NodeTraversal)v10));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = "7";
    Object v7 = com.google.javascript.rhino.IR.name(((java.lang.String)v6));
    Object v8 = "7";
    Object v9 = com.google.javascript.rhino.IR.name(((java.lang.String)v8));
    Object v10 = ((com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback)v1).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v5),((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9));
    org.junit.Assert.assertEquals((Object)(true), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = "7";
    Object v7 = com.google.javascript.rhino.IR.name(((java.lang.String)v6));
    Object v8 = "7";
    Object v9 = com.google.javascript.rhino.IR.name(((java.lang.String)v8));
    Object v10 = 0;
    Object v11 = true;
    ((com.google.javascript.rhino.Node)v9).putBooleanProp((((java.lang.Integer)v10).intValue()),(((java.lang.Boolean)v11).booleanValue()));
    Object v12 = null;
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v1).visit(((com.google.javascript.jscomp.NodeTraversal)v5),((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v1).enterScope(((com.google.javascript.jscomp.NodeTraversal)v5));
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = new com.google.javascript.jscomp.Compiler();
    Object v9 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v8));
    Object v10 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v7),((com.google.javascript.jscomp.NodeTraversal.Callback)v9));
    Object v11 = "7";
    Object v12 = com.google.javascript.rhino.IR.name(((java.lang.String)v11));
    ((com.google.javascript.jscomp.NodeTraversal)v10).traverse(((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v1).enterScope(((com.google.javascript.jscomp.NodeTraversal)v10));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = "7";
    Object v3 = com.google.javascript.rhino.IR.name(((java.lang.String)v2));
    Object v4 = "7";
    Object v5 = com.google.javascript.rhino.IR.name(((java.lang.String)v4));
    ((com.google.javascript.rhino.Node)v3).addChildToFront(((com.google.javascript.rhino.Node)v5));
    Object v6 = null;
    Object v7 = "7";
    Object v8 = com.google.javascript.rhino.IR.name(((java.lang.String)v7));
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v1).process(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = "7";
    Object v7 = com.google.javascript.rhino.IR.name(((java.lang.String)v6));
    Object v8 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v9 = "";
    Object v10 = "";
    Object v11 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = new java.lang.String[]{""};
    Object v13 = ((com.google.javascript.jscomp.NodeTraversal)v5).makeError(((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.CheckLevel)v8),((com.google.javascript.jscomp.DiagnosticType)v11),((java.lang.String[])v12));
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v1).enterScope(((com.google.javascript.jscomp.NodeTraversal)v5));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v1).enterScope(((com.google.javascript.jscomp.NodeTraversal)v5));
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = new com.google.javascript.jscomp.Compiler();
    Object v9 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v8));
    Object v10 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v7),((com.google.javascript.jscomp.NodeTraversal.Callback)v9));
    Object v11 = ((com.google.javascript.jscomp.NodeTraversal)v10).getScope();
    Object v12 = "7";
    Object v13 = com.google.javascript.rhino.IR.name(((java.lang.String)v12));
    Object v14 = "7";
    Object v15 = com.google.javascript.rhino.IR.name(((java.lang.String)v14));
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v1).visit(((com.google.javascript.jscomp.NodeTraversal)v10),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = "7";
    Object v7 = com.google.javascript.rhino.IR.name(((java.lang.String)v6));
    Object v8 = "";
    Object v9 = "";
    Object v10 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = new java.lang.String[]{};
    ((com.google.javascript.jscomp.NodeTraversal)v5).report(((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.DiagnosticType)v10),((java.lang.String[])v11));
    Object v12 = null;
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v1).enterScope(((com.google.javascript.jscomp.NodeTraversal)v5));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = "7";
    Object v7 = com.google.javascript.rhino.IR.name(((java.lang.String)v6));
    Object v8 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v9 = "";
    Object v10 = "";
    Object v11 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = new java.lang.String[]{};
    Object v13 = ((com.google.javascript.jscomp.NodeTraversal)v5).makeError(((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.CheckLevel)v8),((com.google.javascript.jscomp.DiagnosticType)v11),((java.lang.String[])v12));
    Object v14 = "7";
    Object v15 = com.google.javascript.rhino.IR.name(((java.lang.String)v14));
    Object v16 = "7";
    Object v17 = com.google.javascript.rhino.IR.name(((java.lang.String)v16));
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v1).visit(((com.google.javascript.jscomp.NodeTraversal)v5),((com.google.javascript.rhino.Node)v15),((com.google.javascript.rhino.Node)v17));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "=";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "=";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = "7";
    Object v10 = com.google.javascript.rhino.IR.name(((java.lang.String)v9));
    Object v11 = "7";
    Object v12 = com.google.javascript.rhino.IR.name(((java.lang.String)v11));
    Object v13 = ((com.google.javascript.rhino.Node)v12).getSourceOffset();
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v4).visit(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v12));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "=";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v4).enterScope(((com.google.javascript.jscomp.NodeTraversal)v8));
    Object v9 = null;
    Object v10 = new com.google.javascript.jscomp.Compiler();
    Object v11 = new com.google.javascript.jscomp.Compiler();
    Object v12 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v11));
    Object v13 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.NodeTraversal.Callback)v12));
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v4).exitScope(((com.google.javascript.jscomp.NodeTraversal)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "=";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v4).exitScope(((com.google.javascript.jscomp.NodeTraversal)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "=";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v4).enterScope(((com.google.javascript.jscomp.NodeTraversal)v8));
    Object v9 = null;
    Object v10 = new com.google.javascript.jscomp.Compiler();
    Object v11 = new com.google.javascript.jscomp.Compiler();
    Object v12 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v11));
    Object v13 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.NodeTraversal.Callback)v12));
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v4).enterScope(((com.google.javascript.jscomp.NodeTraversal)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = -33;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "=";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = ((com.google.javascript.jscomp.NodeTraversal)v8).hasScope();
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v4).enterScope(((com.google.javascript.jscomp.NodeTraversal)v8));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = -33;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = "7";
    Object v10 = com.google.javascript.rhino.IR.name(((java.lang.String)v9));
    Object v11 = "7";
    Object v12 = com.google.javascript.rhino.IR.name(((java.lang.String)v11));
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v4).visit(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = -33;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v4).enterScope(((com.google.javascript.jscomp.NodeTraversal)v8));
    Object v9 = null;
    Object v10 = new com.google.javascript.jscomp.Compiler();
    Object v11 = new com.google.javascript.jscomp.Compiler();
    Object v12 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v11));
    Object v13 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.NodeTraversal.Callback)v12));
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v4).exitScope(((com.google.javascript.jscomp.NodeTraversal)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = -33;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = ((com.google.javascript.jscomp.NodeTraversal)v8).getEnclosingFunction();
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v4).enterScope(((com.google.javascript.jscomp.NodeTraversal)v8));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = -33;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = "7";
    Object v10 = com.google.javascript.rhino.IR.name(((java.lang.String)v9));
    Object v11 = "7";
    Object v12 = com.google.javascript.rhino.IR.name(((java.lang.String)v11));
    Object v13 = ((com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback)v4).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v12));
    org.junit.Assert.assertEquals((Object)(true), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "=";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v4).enterScope(((com.google.javascript.jscomp.NodeTraversal)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "=";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = "7";
    Object v10 = com.google.javascript.rhino.IR.name(((java.lang.String)v9));
    ((com.google.javascript.jscomp.NodeTraversal)v8).traverse(((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v4).enterScope(((com.google.javascript.jscomp.NodeTraversal)v8));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = -33;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v4).enterScope(((com.google.javascript.jscomp.NodeTraversal)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "=";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = "7";
    Object v10 = com.google.javascript.rhino.IR.name(((java.lang.String)v9));
    Object v11 = ((com.google.javascript.rhino.Node)v10).isVarArgs();
    Object v12 = "7";
    Object v13 = com.google.javascript.rhino.IR.name(((java.lang.String)v12));
    Object v14 = "_";
    Object v15 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v14));
    ((com.google.javascript.rhino.Node)v13).setStaticSourceFile(((com.google.javascript.rhino.jstype.StaticSourceFile)v15));
    Object v16 = null;
    Object v17 = ((com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback)v4).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v13));
    org.junit.Assert.assertEquals((Object)(true), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = -33;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v5 = "7";
    Object v6 = com.google.javascript.rhino.IR.name(((java.lang.String)v5));
    Object v7 = "7";
    Object v8 = com.google.javascript.rhino.IR.name(((java.lang.String)v7));
    Object v9 = ((com.google.javascript.rhino.Node)v6).isEquivalentTo(((com.google.javascript.rhino.Node)v8));
    Object v10 = "7";
    Object v11 = com.google.javascript.rhino.IR.name(((java.lang.String)v10));
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v1).enterScope(((com.google.javascript.jscomp.NodeTraversal)v5));
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = new com.google.javascript.jscomp.Compiler();
    Object v9 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v8));
    Object v10 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v7),((com.google.javascript.jscomp.NodeTraversal.Callback)v9));
    Object v11 = "7";
    Object v12 = com.google.javascript.rhino.IR.name(((java.lang.String)v11));
    Object v13 = "";
    Object v14 = "";
    Object v15 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = new java.lang.String[]{""};
    Object v17 = ((com.google.javascript.jscomp.NodeTraversal)v10).makeError(((com.google.javascript.rhino.Node)v12),((com.google.javascript.jscomp.DiagnosticType)v15),((java.lang.String[])v16));
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v1).enterScope(((com.google.javascript.jscomp.NodeTraversal)v10));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "=";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v5 = "7";
    Object v6 = com.google.javascript.rhino.IR.name(((java.lang.String)v5));
    Object v7 = "7";
    Object v8 = com.google.javascript.rhino.IR.name(((java.lang.String)v7));
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "=";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = "7";
    Object v10 = com.google.javascript.rhino.IR.name(((java.lang.String)v9));
    Object v11 = new com.google.javascript.rhino.JSDocInfo();
    Object v12 = ((com.google.javascript.rhino.Node)v10).setJSDocInfo(((com.google.javascript.rhino.JSDocInfo)v11));
    Object v13 = "7";
    Object v14 = com.google.javascript.rhino.IR.name(((java.lang.String)v13));
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v4).visit(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v14));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = -33;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = "7";
    Object v10 = com.google.javascript.rhino.IR.name(((java.lang.String)v9));
    Object v11 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v12 = "";
    Object v13 = "";
    Object v14 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = new java.lang.String[]{"",""};
    Object v16 = ((com.google.javascript.jscomp.NodeTraversal)v8).makeError(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.CheckLevel)v11),((com.google.javascript.jscomp.DiagnosticType)v14),((java.lang.String[])v15));
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v4).exitScope(((com.google.javascript.jscomp.NodeTraversal)v8));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = -33;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v4).enterScope(((com.google.javascript.jscomp.NodeTraversal)v8));
    Object v9 = null;
    Object v10 = new com.google.javascript.jscomp.Compiler();
    Object v11 = new com.google.javascript.jscomp.Compiler();
    Object v12 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v11));
    Object v13 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.NodeTraversal.Callback)v12));
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v4).enterScope(((com.google.javascript.jscomp.NodeTraversal)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "=";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = "7";
    Object v10 = com.google.javascript.rhino.IR.name(((java.lang.String)v9));
    Object v11 = "7";
    Object v12 = com.google.javascript.rhino.IR.name(((java.lang.String)v11));
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v4).visit(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = -33;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = "7";
    Object v10 = com.google.javascript.rhino.IR.name(((java.lang.String)v9));
    Object v11 = "7";
    Object v12 = com.google.javascript.rhino.IR.name(((java.lang.String)v11));
    Object v13 = ((com.google.javascript.rhino.Node)v10).srcrefTree(((com.google.javascript.rhino.Node)v12));
    Object v14 = "7";
    Object v15 = com.google.javascript.rhino.IR.name(((java.lang.String)v14));
    Object v16 = ((com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback)v4).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v15));
    org.junit.Assert.assertEquals((Object)(true), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = "7";
    Object v7 = com.google.javascript.rhino.IR.name(((java.lang.String)v6));
    Object v8 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v9 = "";
    Object v10 = "";
    Object v11 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = new java.lang.String[]{"",""};
    Object v13 = ((com.google.javascript.jscomp.NodeTraversal)v5).makeError(((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.CheckLevel)v8),((com.google.javascript.jscomp.DiagnosticType)v11),((java.lang.String[])v12));
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v1).enterScope(((com.google.javascript.jscomp.NodeTraversal)v5));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = -33;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = ((com.google.javascript.jscomp.NodeTraversal)v8).hasScope();
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v4).enterScope(((com.google.javascript.jscomp.NodeTraversal)v8));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "=";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = "7";
    Object v10 = com.google.javascript.rhino.IR.name(((java.lang.String)v9));
    Object v11 = "7";
    Object v12 = com.google.javascript.rhino.IR.name(((java.lang.String)v11));
    Object v13 = ((com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback)v4).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v12));
    org.junit.Assert.assertEquals((Object)(true), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = -33;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v5 = "7";
    Object v6 = com.google.javascript.rhino.IR.name(((java.lang.String)v5));
    Object v7 = "7";
    Object v8 = com.google.javascript.rhino.IR.name(((java.lang.String)v7));
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = -33;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = "7";
    Object v10 = com.google.javascript.rhino.IR.name(((java.lang.String)v9));
    Object v11 = ((com.google.javascript.rhino.Node)v10).getDirectives();
    Object v12 = "7";
    Object v13 = com.google.javascript.rhino.IR.name(((java.lang.String)v12));
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v4).visit(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "=";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = "7";
    Object v10 = com.google.javascript.rhino.IR.name(((java.lang.String)v9));
    Object v11 = "7";
    Object v12 = com.google.javascript.rhino.IR.name(((java.lang.String)v11));
    ((com.google.javascript.jscomp.NodeTraversal.Callback)v4).visit(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
    Object v14 = new com.google.javascript.jscomp.Compiler();
    Object v15 = new com.google.javascript.jscomp.Compiler();
    Object v16 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v15));
    Object v17 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.NodeTraversal.Callback)v16));
    Object v18 = "7";
    Object v19 = com.google.javascript.rhino.IR.name(((java.lang.String)v18));
    Object v20 = "7";
    Object v21 = com.google.javascript.rhino.IR.name(((java.lang.String)v20));
    ((com.google.javascript.rhino.Node)v19).addChildToFront(((com.google.javascript.rhino.Node)v21));
    Object v22 = null;
    Object v23 = "7";
    Object v24 = com.google.javascript.rhino.IR.name(((java.lang.String)v23));
    Object v25 = ((com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback)v4).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v17),((com.google.javascript.rhino.Node)v19),((com.google.javascript.rhino.Node)v24));
    org.junit.Assert.assertEquals((Object)(true), v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = -33;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v4).exitScope(((com.google.javascript.jscomp.NodeTraversal)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = -33;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = "7";
    Object v10 = com.google.javascript.rhino.IR.name(((java.lang.String)v9));
    Object v11 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v12 = "";
    Object v13 = "";
    Object v14 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = new java.lang.String[]{};
    Object v16 = ((com.google.javascript.jscomp.NodeTraversal)v8).makeError(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.CheckLevel)v11),((com.google.javascript.jscomp.DiagnosticType)v14),((java.lang.String[])v15));
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v4).exitScope(((com.google.javascript.jscomp.NodeTraversal)v8));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = -33;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = "7";
    Object v10 = com.google.javascript.rhino.IR.name(((java.lang.String)v9));
    Object v11 = "7";
    Object v12 = com.google.javascript.rhino.IR.name(((java.lang.String)v11));
    Object v13 = 1;
    Object v14 = 0;
    ((com.google.javascript.rhino.Node)v12).putIntProp((((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v15 = null;
    Object v16 = ((com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback)v4).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v12));
    org.junit.Assert.assertEquals((Object)(true), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = -33;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = "7";
    Object v10 = com.google.javascript.rhino.IR.name(((java.lang.String)v9));
    Object v11 = "";
    Object v12 = "";
    Object v13 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = new java.lang.String[]{"",""};
    ((com.google.javascript.jscomp.NodeTraversal)v8).report(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.DiagnosticType)v13),((java.lang.String[])v14));
    Object v15 = null;
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v4).enterScope(((com.google.javascript.jscomp.NodeTraversal)v8));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = -33;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = "7";
    Object v10 = com.google.javascript.rhino.IR.name(((java.lang.String)v9));
    Object v11 = "";
    Object v12 = "";
    Object v13 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = new java.lang.String[]{"A",""};
    Object v15 = ((com.google.javascript.jscomp.NodeTraversal)v8).makeError(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.DiagnosticType)v13),((java.lang.String[])v14));
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v4).enterScope(((com.google.javascript.jscomp.NodeTraversal)v8));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "=";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = "7";
    Object v10 = com.google.javascript.rhino.IR.name(((java.lang.String)v9));
    Object v11 = 4;
    Object v12 = ((com.google.javascript.rhino.Node)v10).getAncestor((((java.lang.Integer)v11).intValue()));
    Object v13 = "7";
    Object v14 = com.google.javascript.rhino.IR.name(((java.lang.String)v13));
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v4).visit(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v14));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "=";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v4).enterScope(((com.google.javascript.jscomp.NodeTraversal)v8));
    Object v9 = null;
    Object v10 = new com.google.javascript.jscomp.Compiler();
    Object v11 = new com.google.javascript.jscomp.Compiler();
    Object v12 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v11));
    Object v13 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.NodeTraversal.Callback)v12));
    Object v14 = "7";
    Object v15 = com.google.javascript.rhino.IR.name(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = "";
    Object v18 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v16),((java.lang.String)v17));
    Object v19 = new java.lang.String[]{""};
    ((com.google.javascript.jscomp.NodeTraversal)v13).report(((com.google.javascript.rhino.Node)v15),((com.google.javascript.jscomp.DiagnosticType)v18),((java.lang.String[])v19));
    Object v20 = null;
    Object v21 = "7";
    Object v22 = com.google.javascript.rhino.IR.name(((java.lang.String)v21));
    Object v23 = "7";
    Object v24 = com.google.javascript.rhino.IR.name(((java.lang.String)v23));
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v4).visit(((com.google.javascript.jscomp.NodeTraversal)v13),((com.google.javascript.rhino.Node)v22),((com.google.javascript.rhino.Node)v24));
    Object v25 = null;
    org.junit.Assert.assertNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "=";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = "7";
    Object v10 = com.google.javascript.rhino.IR.name(((java.lang.String)v9));
    Object v11 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v12 = "";
    Object v13 = "";
    Object v14 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = new java.lang.String[]{};
    Object v16 = ((com.google.javascript.jscomp.NodeTraversal)v8).makeError(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.CheckLevel)v11),((com.google.javascript.jscomp.DiagnosticType)v14),((java.lang.String[])v15));
    Object v17 = "7";
    Object v18 = com.google.javascript.rhino.IR.name(((java.lang.String)v17));
    Object v19 = "7";
    Object v20 = com.google.javascript.rhino.IR.name(((java.lang.String)v19));
    Object v21 = ((com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback)v4).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v18),((com.google.javascript.rhino.Node)v20));
    org.junit.Assert.assertEquals((Object)(true), v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = -33;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v4).enterScope(((com.google.javascript.jscomp.NodeTraversal)v8));
    Object v9 = null;
    Object v10 = "7";
    Object v11 = com.google.javascript.rhino.IR.name(((java.lang.String)v10));
    Object v12 = "7";
    Object v13 = com.google.javascript.rhino.IR.name(((java.lang.String)v12));
    Object v14 = ((com.google.javascript.rhino.Node)v11).srcrefTree(((com.google.javascript.rhino.Node)v13));
    Object v15 = "7";
    Object v16 = com.google.javascript.rhino.IR.name(((java.lang.String)v15));
    Object v17 = "7";
    Object v18 = com.google.javascript.rhino.IR.name(((java.lang.String)v17));
    ((com.google.javascript.rhino.Node)v16).addChildrenToFront(((com.google.javascript.rhino.Node)v18));
    Object v19 = null;
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v4).process(((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v16));
    Object v20 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = -33;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = "7";
    Object v10 = com.google.javascript.rhino.IR.name(((java.lang.String)v9));
    Object v11 = "";
    Object v12 = "";
    Object v13 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = new java.lang.String[]{};
    Object v15 = ((com.google.javascript.jscomp.NodeTraversal)v8).makeError(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.DiagnosticType)v13),((java.lang.String[])v14));
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v4).exitScope(((com.google.javascript.jscomp.NodeTraversal)v8));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "=";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = "7";
    Object v10 = com.google.javascript.rhino.IR.name(((java.lang.String)v9));
    Object v11 = "";
    Object v12 = "";
    Object v13 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = new java.lang.String[]{};
    ((com.google.javascript.jscomp.NodeTraversal)v8).report(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.DiagnosticType)v13),((java.lang.String[])v14));
    Object v15 = null;
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v4).enterScope(((com.google.javascript.jscomp.NodeTraversal)v8));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTopScope();
    Object v2 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = -33;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v5 = "7";
    Object v6 = com.google.javascript.rhino.IR.name(((java.lang.String)v5));
    Object v7 = true;
    ((com.google.javascript.rhino.Node)v6).setVarArgs((((java.lang.Boolean)v7).booleanValue()));
    Object v8 = null;
    Object v9 = "7";
    Object v10 = com.google.javascript.rhino.IR.name(((java.lang.String)v9));
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "=";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = "7";
    Object v10 = com.google.javascript.rhino.IR.name(((java.lang.String)v9));
    Object v11 = "";
    Object v12 = "";
    Object v13 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = new java.lang.String[]{"(?:",""};
    Object v15 = ((com.google.javascript.jscomp.NodeTraversal)v8).makeError(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.DiagnosticType)v13),((java.lang.String[])v14));
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v4).enterScope(((com.google.javascript.jscomp.NodeTraversal)v8));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTopScope();
    Object v2 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = "7";
    Object v4 = com.google.javascript.rhino.IR.name(((java.lang.String)v3));
    Object v5 = "7";
    Object v6 = com.google.javascript.rhino.IR.name(((java.lang.String)v5));
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v2).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "=";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = "7";
    Object v10 = com.google.javascript.rhino.IR.name(((java.lang.String)v9));
    Object v11 = "7";
    Object v12 = com.google.javascript.rhino.IR.name(((java.lang.String)v11));
    Object v13 = ((com.google.javascript.rhino.Node)v12).cloneNode();
    Object v14 = ((com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback)v4).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v12));
    org.junit.Assert.assertEquals((Object)(true), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = -33;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = "7";
    Object v10 = com.google.javascript.rhino.IR.name(((java.lang.String)v9));
    Object v11 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v12 = "";
    Object v13 = "";
    Object v14 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = new java.lang.String[]{"","It is illegal to call PureFunctionIdentifier.process twice the same instance.  Please use a new PureFunctionIdentifier instance each time."};
    Object v16 = ((com.google.javascript.jscomp.NodeTraversal)v8).makeError(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.CheckLevel)v11),((com.google.javascript.jscomp.DiagnosticType)v14),((java.lang.String[])v15));
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v4).enterScope(((com.google.javascript.jscomp.NodeTraversal)v8));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = -33;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = "7";
    Object v10 = com.google.javascript.rhino.IR.name(((java.lang.String)v9));
    Object v11 = "";
    Object v12 = "";
    Object v13 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = new java.lang.String[]{"x"," ",""};
    ((com.google.javascript.jscomp.NodeTraversal)v8).report(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.DiagnosticType)v13),((java.lang.String[])v14));
    Object v15 = null;
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v4).enterScope(((com.google.javascript.jscomp.NodeTraversal)v8));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = -33;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = ((com.google.javascript.jscomp.NodeTraversal)v8).getScope();
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v4).enterScope(((com.google.javascript.jscomp.NodeTraversal)v8));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "=";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v4).enterScope(((com.google.javascript.jscomp.NodeTraversal)v8));
    Object v9 = null;
    Object v10 = new com.google.javascript.jscomp.Compiler();
    Object v11 = new com.google.javascript.jscomp.Compiler();
    Object v12 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v11));
    Object v13 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.NodeTraversal.Callback)v12));
    Object v14 = "7";
    Object v15 = com.google.javascript.rhino.IR.name(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = "";
    Object v18 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v16),((java.lang.String)v17));
    Object v19 = new java.lang.String[]{" ","","Z"};
    ((com.google.javascript.jscomp.NodeTraversal)v13).report(((com.google.javascript.rhino.Node)v15),((com.google.javascript.jscomp.DiagnosticType)v18),((java.lang.String[])v19));
    Object v20 = null;
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v4).enterScope(((com.google.javascript.jscomp.NodeTraversal)v13));
    Object v21 = null;
    org.junit.Assert.assertNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "=";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v4).enterScope(((com.google.javascript.jscomp.NodeTraversal)v8));
    Object v9 = null;
    Object v10 = "7";
    Object v11 = com.google.javascript.rhino.IR.name(((java.lang.String)v10));
    Object v12 = "7";
    Object v13 = com.google.javascript.rhino.IR.name(((java.lang.String)v12));
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v4).process(((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = -33;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v5 = "7";
    Object v6 = com.google.javascript.rhino.IR.name(((java.lang.String)v5));
    Object v7 = "7";
    Object v8 = com.google.javascript.rhino.IR.name(((java.lang.String)v7));
    Object v9 = ((com.google.javascript.rhino.Node)v8).getAncestors();
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTopScope();
    Object v2 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5));
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v2).enterScope(((com.google.javascript.jscomp.NodeTraversal)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = -33;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = "7";
    Object v10 = com.google.javascript.rhino.IR.name(((java.lang.String)v9));
    Object v11 = "7";
    Object v12 = com.google.javascript.rhino.IR.name(((java.lang.String)v11));
    ((com.google.javascript.jscomp.NodeTraversal.Callback)v4).visit(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
    Object v14 = new com.google.javascript.jscomp.Compiler();
    Object v15 = new com.google.javascript.jscomp.Compiler();
    Object v16 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v15));
    Object v17 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.NodeTraversal.Callback)v16));
    Object v18 = "7";
    Object v19 = com.google.javascript.rhino.IR.name(((java.lang.String)v18));
    Object v20 = "7";
    Object v21 = com.google.javascript.rhino.IR.name(((java.lang.String)v20));
    Object v22 = ((com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback)v4).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v17),((com.google.javascript.rhino.Node)v19),((com.google.javascript.rhino.Node)v21));
    org.junit.Assert.assertEquals((Object)(true), v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTopScope();
    Object v2 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5));
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v2).enterScope(((com.google.javascript.jscomp.NodeTraversal)v6));
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.Compiler();
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v9));
    Object v11 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v8),((com.google.javascript.jscomp.NodeTraversal.Callback)v10));
    Object v12 = ((com.google.javascript.jscomp.NodeTraversal)v11).getEnclosingFunction();
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v2).enterScope(((com.google.javascript.jscomp.NodeTraversal)v11));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTopScope();
    Object v2 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5));
    Object v7 = "7";
    Object v8 = com.google.javascript.rhino.IR.name(((java.lang.String)v7));
    Object v9 = "";
    Object v10 = "";
    Object v11 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = new java.lang.String[]{"",""};
    Object v13 = ((com.google.javascript.jscomp.NodeTraversal)v6).makeError(((com.google.javascript.rhino.Node)v8),((com.google.javascript.jscomp.DiagnosticType)v11),((java.lang.String[])v12));
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v2).enterScope(((com.google.javascript.jscomp.NodeTraversal)v6));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTopScope();
    Object v2 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5));
    Object v7 = "7";
    Object v8 = com.google.javascript.rhino.IR.name(((java.lang.String)v7));
    Object v9 = "7";
    Object v10 = com.google.javascript.rhino.IR.name(((java.lang.String)v9));
    Object v11 = ((com.google.javascript.rhino.Node)v10).isOnlyModifiesThisCall();
    Object v12 = ((com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback)v2).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v6),((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v10));
    org.junit.Assert.assertEquals((Object)(true), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = -33;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = "7";
    Object v10 = com.google.javascript.rhino.IR.name(((java.lang.String)v9));
    Object v11 = "";
    Object v12 = "";
    Object v13 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = new java.lang.String[]{"","prototype","y"};
    Object v15 = ((com.google.javascript.jscomp.NodeTraversal)v8).makeError(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.DiagnosticType)v13),((java.lang.String[])v14));
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v4).enterScope(((com.google.javascript.jscomp.NodeTraversal)v8));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5));
    Object v7 = "7";
    Object v8 = com.google.javascript.rhino.IR.name(((java.lang.String)v7));
    Object v9 = "";
    Object v10 = "";
    Object v11 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = new java.lang.String[]{"JSC_INVALID_MISSING_DEFINE_ANNOTATION","O",""};
    Object v13 = ((com.google.javascript.jscomp.NodeTraversal)v6).makeError(((com.google.javascript.rhino.Node)v8),((com.google.javascript.jscomp.DiagnosticType)v11),((java.lang.String[])v12));
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v2).enterScope(((com.google.javascript.jscomp.NodeTraversal)v6));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5));
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v2).enterScope(((com.google.javascript.jscomp.NodeTraversal)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5));
    Object v7 = ((com.google.javascript.jscomp.NodeTraversal)v6).getEnclosingFunction();
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v2).enterScope(((com.google.javascript.jscomp.NodeTraversal)v6));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "=";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = ((com.google.javascript.jscomp.NodeTraversal)v8).getEnclosingFunction();
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v4).enterScope(((com.google.javascript.jscomp.NodeTraversal)v8));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5));
    Object v7 = "7";
    Object v8 = com.google.javascript.rhino.IR.name(((java.lang.String)v7));
    Object v9 = "7";
    Object v10 = com.google.javascript.rhino.IR.name(((java.lang.String)v9));
    Object v11 = false;
    Object v12 = false;
    Object v13 = false;
    Object v14 = ((com.google.javascript.rhino.Node)v10).toString((((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = ((com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback)v2).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v6),((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v10));
    org.junit.Assert.assertEquals((Object)(true), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5));
    Object v7 = ((com.google.javascript.jscomp.NodeTraversal)v6).hasScope();
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v2).enterScope(((com.google.javascript.jscomp.NodeTraversal)v6));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = -33;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v4).enterScope(((com.google.javascript.jscomp.NodeTraversal)v8));
    Object v9 = null;
    Object v10 = new com.google.javascript.jscomp.Compiler();
    Object v11 = new com.google.javascript.jscomp.Compiler();
    Object v12 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v11));
    Object v13 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.NodeTraversal.Callback)v12));
    Object v14 = "7";
    Object v15 = com.google.javascript.rhino.IR.name(((java.lang.String)v14));
    Object v16 = "7";
    Object v17 = com.google.javascript.rhino.IR.name(((java.lang.String)v16));
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v4).visit(((com.google.javascript.jscomp.NodeTraversal)v13),((com.google.javascript.rhino.Node)v15),((com.google.javascript.rhino.Node)v17));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "=";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = "7";
    Object v10 = com.google.javascript.rhino.IR.name(((java.lang.String)v9));
    Object v11 = ((com.google.javascript.rhino.Node)v10).isLocalResultCall();
    Object v12 = "7";
    Object v13 = com.google.javascript.rhino.IR.name(((java.lang.String)v12));
    Object v14 = 0;
    Object v15 = ((com.google.javascript.rhino.Node)v13).getIntProp((((java.lang.Integer)v14).intValue()));
    Object v16 = ((com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback)v4).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v13));
    org.junit.Assert.assertEquals((Object)(true), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTopScope();
    Object v2 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5));
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v2).enterScope(((com.google.javascript.jscomp.NodeTraversal)v6));
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.Compiler();
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v9));
    Object v11 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v8),((com.google.javascript.jscomp.NodeTraversal.Callback)v10));
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v2).enterScope(((com.google.javascript.jscomp.NodeTraversal)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5));
    Object v7 = "7";
    Object v8 = com.google.javascript.rhino.IR.name(((java.lang.String)v7));
    Object v9 = "7";
    Object v10 = com.google.javascript.rhino.IR.name(((java.lang.String)v9));
    ((com.google.javascript.jscomp.NodeTraversal.Callback)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v6),((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.Compiler();
    Object v14 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v13));
    Object v15 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v12),((com.google.javascript.jscomp.NodeTraversal.Callback)v14));
    Object v16 = "7";
    Object v17 = com.google.javascript.rhino.IR.name(((java.lang.String)v16));
    Object v18 = "7";
    Object v19 = com.google.javascript.rhino.IR.name(((java.lang.String)v18));
    Object v20 = ((com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback)v2).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v15),((com.google.javascript.rhino.Node)v17),((com.google.javascript.rhino.Node)v19));
    org.junit.Assert.assertEquals((Object)(true), v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5));
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v2).enterScope(((com.google.javascript.jscomp.NodeTraversal)v6));
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.Compiler();
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v9));
    Object v11 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v8),((com.google.javascript.jscomp.NodeTraversal.Callback)v10));
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v2).enterScope(((com.google.javascript.jscomp.NodeTraversal)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5));
    Object v7 = "7";
    Object v8 = com.google.javascript.rhino.IR.name(((java.lang.String)v7));
    Object v9 = "";
    Object v10 = "";
    Object v11 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = new java.lang.String[]{"X",""};
    Object v13 = ((com.google.javascript.jscomp.NodeTraversal)v6).makeError(((com.google.javascript.rhino.Node)v8),((com.google.javascript.jscomp.DiagnosticType)v11),((java.lang.String[])v12));
    Object v14 = "7";
    Object v15 = com.google.javascript.rhino.IR.name(((java.lang.String)v14));
    Object v16 = -5;
    Object v17 = ((com.google.javascript.rhino.Node)v15).getBooleanProp((((java.lang.Integer)v16).intValue()));
    Object v18 = "7";
    Object v19 = com.google.javascript.rhino.IR.name(((java.lang.String)v18));
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v6),((com.google.javascript.rhino.Node)v15),((com.google.javascript.rhino.Node)v19));
    Object v20 = null;
    org.junit.Assert.assertNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "=";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = "7";
    Object v10 = com.google.javascript.rhino.IR.name(((java.lang.String)v9));
    Object v11 = "";
    Object v12 = "";
    Object v13 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = new java.lang.String[]{"s",":rAeturn","4"};
    ((com.google.javascript.jscomp.NodeTraversal)v8).report(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.DiagnosticType)v13),((java.lang.String[])v14));
    Object v15 = null;
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v4).enterScope(((com.google.javascript.jscomp.NodeTraversal)v8));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }
}
