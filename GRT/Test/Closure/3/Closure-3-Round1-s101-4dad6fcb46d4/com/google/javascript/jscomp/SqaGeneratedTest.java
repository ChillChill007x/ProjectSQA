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
    Object v6 = com.google.javascript.rhino.IR.thisNode();
    Object v7 = "\n}\n";
    Object v8 = "";
    Object v9 = com.google.javascript.jscomp.DiagnosticType.warning(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = new java.lang.String[]{};
    Object v11 = ((com.google.javascript.jscomp.NodeTraversal)v5).makeError(((com.google.javascript.rhino.Node)v6),((com.google.javascript.jscomp.DiagnosticType)v9),((java.lang.String[])v10));
    Object v12 = com.google.javascript.rhino.IR.thisNode();
    Object v13 = com.google.javascript.rhino.IR.thisNode();
    Object v14 = ((com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback)v1).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v5),((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v13));
    org.junit.Assert.assertEquals((Object)(true), v14);
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
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = com.google.javascript.rhino.IR.thisNode();
    Object v3 = ((com.google.javascript.rhino.Node)v2).getJSDocInfo();
    Object v4 = com.google.javascript.rhino.IR.thisNode();
    Object v5 = com.google.javascript.rhino.IR.thisNode();
    Object v6 = ((com.google.javascript.rhino.Node)v4).useSourceInfoIfMissingFrom(((com.google.javascript.rhino.Node)v5));
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v1).process(((com.google.javascript.rhino.Node)v2),((com.google.javascript.rhino.Node)v4));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = com.google.javascript.rhino.IR.thisNode();
    Object v7 = com.google.javascript.rhino.IR.thisNode();
    Object v8 = ((com.google.javascript.rhino.Node)v7).isVarArgs();
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v1).visit(((com.google.javascript.jscomp.NodeTraversal)v5),((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v7));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
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
    Object v11 = ((com.google.javascript.jscomp.NodeTraversal)v10).getEnclosingFunction();
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v1).enterScope(((com.google.javascript.jscomp.NodeTraversal)v10));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = new com.google.javascript.rhino.Node[]{};
    ((com.google.javascript.jscomp.NodeTraversal)v5).traverseRoots(((com.google.javascript.rhino.Node[])v6));
    Object v7 = null;
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v1).enterScope(((com.google.javascript.jscomp.NodeTraversal)v5));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = com.google.javascript.rhino.IR.thisNode();
    ((com.google.javascript.jscomp.NodeTraversal)v5).traverse(((com.google.javascript.rhino.Node)v6));
    Object v7 = null;
    Object v8 = com.google.javascript.rhino.IR.thisNode();
    Object v9 = com.google.javascript.rhino.IR.thisNode();
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v1).visit(((com.google.javascript.jscomp.NodeTraversal)v5),((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = com.google.javascript.rhino.IR.thisNode();
    Object v7 = com.google.javascript.rhino.IR.thisNode();
    Object v8 = ((com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback)v1).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v5),((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v7));
    org.junit.Assert.assertEquals((Object)(true), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
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
  public void test11() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = com.google.javascript.rhino.IR.thisNode();
    Object v7 = "";
    ((com.google.javascript.rhino.Node)v6).setSourceFileForTesting(((java.lang.String)v7));
    Object v8 = null;
    Object v9 = com.google.javascript.rhino.IR.thisNode();
    Object v10 = ((com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback)v1).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v5),((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v9));
    org.junit.Assert.assertEquals((Object)(true), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
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
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v1).exitScope(((com.google.javascript.jscomp.NodeTraversal)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = com.google.javascript.rhino.IR.thisNode();
    Object v3 = com.google.javascript.rhino.IR.thisNode();
    Object v4 = ((com.google.javascript.rhino.Node)v2).isEquivalentTo(((com.google.javascript.rhino.Node)v3));
    Object v5 = com.google.javascript.rhino.IR.thisNode();
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v1).process(((com.google.javascript.rhino.Node)v2),((com.google.javascript.rhino.Node)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
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
  public void test16() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = com.google.javascript.rhino.IR.thisNode();
    Object v7 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v8 = "\n}\n";
    Object v9 = "";
    Object v10 = com.google.javascript.jscomp.DiagnosticType.warning(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = new java.lang.String[]{"","",""};
    Object v12 = ((com.google.javascript.jscomp.NodeTraversal)v5).makeError(((com.google.javascript.rhino.Node)v6),((com.google.javascript.jscomp.CheckLevel)v7),((com.google.javascript.jscomp.DiagnosticType)v10),((java.lang.String[])v11));
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v1).enterScope(((com.google.javascript.jscomp.NodeTraversal)v5));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5));
    Object v7 = ((com.google.javascript.jscomp.NodeTraversal)v6).getScope();
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v2).enterScope(((com.google.javascript.jscomp.NodeTraversal)v6));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
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
  public void test19() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = ((com.google.javascript.jscomp.NodeTraversal)v5).hasScope();
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v1).exitScope(((com.google.javascript.jscomp.NodeTraversal)v5));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
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
    Object v12 = com.google.javascript.rhino.IR.thisNode();
    Object v13 = com.google.javascript.rhino.IR.thisNode();
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v11),((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = com.google.javascript.rhino.IR.thisNode();
    Object v7 = "\n}\n";
    Object v8 = "";
    Object v9 = com.google.javascript.jscomp.DiagnosticType.warning(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = new java.lang.String[]{};
    Object v11 = ((com.google.javascript.jscomp.NodeTraversal)v5).makeError(((com.google.javascript.rhino.Node)v6),((com.google.javascript.jscomp.DiagnosticType)v9),((java.lang.String[])v10));
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v1).enterScope(((com.google.javascript.jscomp.NodeTraversal)v5));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = com.google.javascript.rhino.IR.thisNode();
    Object v7 = com.google.javascript.rhino.IR.thisNode();
    Object v8 = ((com.google.javascript.rhino.Node)v7).removeFirstChild();
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v1).visit(((com.google.javascript.jscomp.NodeTraversal)v5),((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v7));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = com.google.javascript.rhino.IR.thisNode();
    Object v3 = com.google.javascript.rhino.IR.thisNode();
    Object v4 = ((com.google.javascript.rhino.Node)v2).copyInformationFromForTree(((com.google.javascript.rhino.Node)v3));
    Object v5 = com.google.javascript.rhino.IR.thisNode();
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v1).process(((com.google.javascript.rhino.Node)v2),((com.google.javascript.rhino.Node)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getProgress();
    Object v2 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getProgress();
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
  public void test26() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getProgress();
    Object v2 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5));
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v2).enterScope(((com.google.javascript.jscomp.NodeTraversal)v6));
    Object v7 = null;
    Object v8 = com.google.javascript.rhino.IR.thisNode();
    Object v9 = com.google.javascript.rhino.IR.thisNode();
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v2).process(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getProgress();
    Object v2 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5));
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v2).exitScope(((com.google.javascript.jscomp.NodeTraversal)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getProgress();
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
  public void test29() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getProgress();
    Object v2 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = com.google.javascript.rhino.IR.thisNode();
    Object v4 = com.google.javascript.rhino.IR.thisNode();
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v2).process(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.Node)v4));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getProgress();
    Object v2 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5));
    Object v7 = com.google.javascript.rhino.IR.thisNode();
    Object v8 = "\n}\n";
    Object v9 = "";
    Object v10 = com.google.javascript.jscomp.DiagnosticType.warning(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = new java.lang.String[]{};
    Object v12 = ((com.google.javascript.jscomp.NodeTraversal)v6).makeError(((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.DiagnosticType)v10),((java.lang.String[])v11));
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v2).enterScope(((com.google.javascript.jscomp.NodeTraversal)v6));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = com.google.javascript.rhino.IR.thisNode();
    Object v7 = "\n}\n";
    Object v8 = "";
    Object v9 = com.google.javascript.jscomp.DiagnosticType.warning(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = new java.lang.String[]{"","",""};
    Object v11 = ((com.google.javascript.jscomp.NodeTraversal)v5).makeError(((com.google.javascript.rhino.Node)v6),((com.google.javascript.jscomp.DiagnosticType)v9),((java.lang.String[])v10));
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v1).enterScope(((com.google.javascript.jscomp.NodeTraversal)v5));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getProgress();
    Object v2 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5));
    Object v7 = ((com.google.javascript.jscomp.NodeTraversal)v6).getScope();
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v2).enterScope(((com.google.javascript.jscomp.NodeTraversal)v6));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getProgress();
    Object v2 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5));
    Object v7 = com.google.javascript.rhino.IR.thisNode();
    Object v8 = com.google.javascript.rhino.IR.thisNode();
    Object v9 = ((com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback)v2).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v6),((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v8));
    org.junit.Assert.assertEquals((Object)(true), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getProgress();
    Object v2 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5));
    Object v7 = com.google.javascript.rhino.IR.thisNode();
    Object v8 = com.google.javascript.rhino.IR.thisNode();
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v6),((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = com.google.javascript.rhino.IR.thisNode();
    Object v7 = com.google.javascript.rhino.IR.thisNode();
    Object v8 = -1;
    ((com.google.javascript.rhino.Node)v7).removeProp((((java.lang.Integer)v8).intValue()));
    Object v9 = null;
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v1).visit(((com.google.javascript.jscomp.NodeTraversal)v5),((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v7));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5));
    Object v7 = com.google.javascript.rhino.IR.thisNode();
    ((com.google.javascript.jscomp.NodeTraversal)v6).traverse(((com.google.javascript.rhino.Node)v7));
    Object v8 = null;
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v2).enterScope(((com.google.javascript.jscomp.NodeTraversal)v6));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = com.google.javascript.rhino.IR.thisNode();
    Object v3 = com.google.javascript.rhino.IR.thisNode();
    Object v4 = ((com.google.javascript.rhino.Node)v2).useSourceInfoIfMissingFromForTree(((com.google.javascript.rhino.Node)v3));
    Object v5 = com.google.javascript.rhino.IR.thisNode();
    Object v6 = com.google.javascript.rhino.IR.thisNode();
    Object v7 = ((com.google.javascript.rhino.Node)v5).useSourceInfoFrom(((com.google.javascript.rhino.Node)v6));
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v1).process(((com.google.javascript.rhino.Node)v2),((com.google.javascript.rhino.Node)v5));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = com.google.javascript.rhino.IR.thisNode();
    Object v7 = com.google.javascript.rhino.IR.thisNode();
    ((com.google.javascript.rhino.Node)v6).addChildToBack(((com.google.javascript.rhino.Node)v7));
    Object v8 = null;
    Object v9 = com.google.javascript.rhino.IR.thisNode();
    Object v10 = ((com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback)v1).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v5),((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v9));
    org.junit.Assert.assertEquals((Object)(true), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getProgress();
    Object v2 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5));
    Object v7 = com.google.javascript.rhino.IR.thisNode();
    Object v8 = com.google.javascript.rhino.IR.thisNode();
    Object v9 = ((com.google.javascript.rhino.Node)v7).isEquivalentToTyped(((com.google.javascript.rhino.Node)v8));
    Object v10 = com.google.javascript.rhino.IR.thisNode();
    Object v11 = 330;
    Object v12 = 0;
    ((com.google.javascript.rhino.Node)v10).putIntProp((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v13 = null;
    Object v14 = ((com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback)v2).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v6),((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v10));
    org.junit.Assert.assertEquals((Object)(true), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getProgress();
    Object v2 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5));
    Object v7 = com.google.javascript.rhino.IR.thisNode();
    Object v8 = "\n}\n";
    Object v9 = "";
    Object v10 = com.google.javascript.jscomp.DiagnosticType.warning(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = new java.lang.String[]{"","",""};
    Object v12 = ((com.google.javascript.jscomp.NodeTraversal)v6).makeError(((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.DiagnosticType)v10),((java.lang.String[])v11));
    Object v13 = com.google.javascript.rhino.IR.thisNode();
    Object v14 = com.google.javascript.rhino.IR.thisNode();
    Object v15 = ((com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback)v2).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v6),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v14));
    org.junit.Assert.assertEquals((Object)(true), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
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
  public void test42() throws Throwable {
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
    Object v11 = com.google.javascript.rhino.IR.thisNode();
    Object v12 = com.google.javascript.rhino.IR.thisNode();
    ((com.google.javascript.rhino.Node)v11).addChildToBack(((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
    Object v14 = com.google.javascript.rhino.IR.thisNode();
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v1).visit(((com.google.javascript.jscomp.NodeTraversal)v10),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v14));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getProgress();
    Object v2 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5));
    Object v7 = ((com.google.javascript.jscomp.NodeTraversal)v6).getScope();
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v2).exitScope(((com.google.javascript.jscomp.NodeTraversal)v6));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
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
    Object v12 = ((com.google.javascript.jscomp.NodeTraversal)v11).hasScope();
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v2).enterScope(((com.google.javascript.jscomp.NodeTraversal)v11));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = com.google.javascript.rhino.IR.thisNode();
    Object v4 = ((com.google.javascript.rhino.Node)v3).wasEmptyNode();
    Object v5 = com.google.javascript.rhino.IR.thisNode();
    Object v6 = 0;
    ((com.google.javascript.rhino.Node)v5).setLineno((((java.lang.Integer)v6).intValue()));
    Object v7 = null;
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v2).process(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.Node)v5));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = com.google.javascript.rhino.IR.thisNode();
    Object v7 = com.google.javascript.rhino.IR.thisNode();
    ((com.google.javascript.jscomp.NodeTraversal.Callback)v1).visit(((com.google.javascript.jscomp.NodeTraversal)v5),((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v7));
    Object v8 = null;
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = new com.google.javascript.jscomp.Compiler();
    Object v11 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v12 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.NodeTraversal.Callback)v11));
    Object v13 = com.google.javascript.rhino.IR.thisNode();
    Object v14 = java.io.Writer.nullWriter();
    ((com.google.javascript.rhino.Node)v13).appendStringTree(((java.lang.Appendable)v14));
    Object v15 = null;
    Object v16 = com.google.javascript.rhino.IR.thisNode();
    Object v17 = ((com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback)v1).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v12),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v16));
    org.junit.Assert.assertEquals((Object)(true), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = com.google.javascript.rhino.IR.thisNode();
    Object v7 = com.google.javascript.rhino.IR.thisNode();
    ((com.google.javascript.jscomp.NodeTraversal.Callback)v1).visit(((com.google.javascript.jscomp.NodeTraversal)v5),((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v7));
    Object v8 = null;
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = new com.google.javascript.jscomp.Compiler();
    Object v11 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v12 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.NodeTraversal.Callback)v11));
    Object v13 = com.google.javascript.rhino.IR.thisNode();
    Object v14 = com.google.javascript.rhino.IR.thisNode();
    Object v15 = ((com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback)v1).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v12),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v14));
    org.junit.Assert.assertEquals((Object)(true), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getProgress();
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
    Object v12 = ((com.google.javascript.jscomp.NodeTraversal)v11).hasScope();
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v2).enterScope(((com.google.javascript.jscomp.NodeTraversal)v11));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getProgress();
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
    Object v12 = com.google.javascript.rhino.IR.thisNode();
    Object v13 = com.google.javascript.rhino.IR.thisNode();
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v11),((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getProgress();
    Object v2 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5));
    Object v7 = com.google.javascript.rhino.IR.thisNode();
    Object v8 = com.google.javascript.rhino.IR.thisNode();
    ((com.google.javascript.jscomp.NodeTraversal.Callback)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v6),((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
    Object v10 = new com.google.javascript.jscomp.Compiler();
    Object v11 = new com.google.javascript.jscomp.Compiler();
    Object v12 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v11));
    Object v13 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.NodeTraversal.Callback)v12));
    Object v14 = com.google.javascript.rhino.IR.thisNode();
    Object v15 = com.google.javascript.rhino.IR.thisNode();
    Object v16 = ((com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback)v2).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v13),((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.Node)v15));
    org.junit.Assert.assertEquals((Object)(true), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = com.google.javascript.rhino.IR.thisNode();
    Object v7 = com.google.javascript.rhino.IR.thisNode();
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v1).visit(((com.google.javascript.jscomp.NodeTraversal)v5),((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getProgress();
    Object v2 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5));
    Object v7 = ((com.google.javascript.jscomp.NodeTraversal)v6).getScope();
    Object v8 = com.google.javascript.rhino.IR.thisNode();
    Object v9 = com.google.javascript.rhino.IR.thisNode();
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v6),((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getProgress();
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
  public void test54() throws Throwable {
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
  public void test55() throws Throwable {
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
  public void test56() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = com.google.javascript.rhino.IR.thisNode();
    Object v7 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v8 = "\n}\n";
    Object v9 = "";
    Object v10 = com.google.javascript.jscomp.DiagnosticType.warning(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = new java.lang.String[]{};
    Object v12 = ((com.google.javascript.jscomp.NodeTraversal)v5).makeError(((com.google.javascript.rhino.Node)v6),((com.google.javascript.jscomp.CheckLevel)v7),((com.google.javascript.jscomp.DiagnosticType)v10),((java.lang.String[])v11));
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v1).exitScope(((com.google.javascript.jscomp.NodeTraversal)v5));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getProgress();
    Object v2 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5));
    Object v7 = com.google.javascript.rhino.IR.thisNode();
    Object v8 = com.google.javascript.rhino.IR.thisNode();
    Object v9 = new com.google.javascript.rhino.JSDocInfo();
    Object v10 = ((com.google.javascript.rhino.Node)v8).setJSDocInfo(((com.google.javascript.rhino.JSDocInfo)v9));
    Object v11 = ((com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback)v2).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v6),((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v8));
    org.junit.Assert.assertEquals((Object)(true), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5));
    Object v7 = com.google.javascript.rhino.IR.thisNode();
    Object v8 = com.google.javascript.rhino.IR.thisNode();
    ((com.google.javascript.jscomp.NodeTraversal.Callback)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v6),((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
    Object v10 = new com.google.javascript.jscomp.Compiler();
    Object v11 = new com.google.javascript.jscomp.Compiler();
    Object v12 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v11));
    Object v13 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.NodeTraversal.Callback)v12));
    Object v14 = com.google.javascript.rhino.IR.thisNode();
    Object v15 = -60;
    ((com.google.javascript.rhino.Node)v14).removeProp((((java.lang.Integer)v15).intValue()));
    Object v16 = null;
    Object v17 = com.google.javascript.rhino.IR.thisNode();
    Object v18 = ((com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback)v2).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v13),((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.Node)v17));
    org.junit.Assert.assertEquals((Object)(true), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5));
    Object v7 = com.google.javascript.rhino.IR.thisNode();
    Object v8 = com.google.javascript.rhino.IR.thisNode();
    Object v9 = ((com.google.javascript.rhino.Node)v7).srcref(((com.google.javascript.rhino.Node)v8));
    Object v10 = com.google.javascript.rhino.IR.thisNode();
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v6),((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5));
    Object v7 = com.google.javascript.rhino.IR.thisNode();
    Object v8 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v9 = "\n}\n";
    Object v10 = "";
    Object v11 = com.google.javascript.jscomp.DiagnosticType.warning(((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = new java.lang.String[]{};
    Object v13 = ((com.google.javascript.jscomp.NodeTraversal)v6).makeError(((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.CheckLevel)v8),((com.google.javascript.jscomp.DiagnosticType)v11),((java.lang.String[])v12));
    Object v14 = com.google.javascript.rhino.IR.thisNode();
    Object v15 = com.google.javascript.rhino.IR.thisNode();
    Object v16 = ((com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback)v2).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v6),((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.Node)v15));
    org.junit.Assert.assertEquals((Object)(true), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5));
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v2).exitScope(((com.google.javascript.jscomp.NodeTraversal)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5));
    Object v7 = com.google.javascript.rhino.IR.thisNode();
    Object v8 = com.google.javascript.rhino.IR.thisNode();
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v6),((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getProgress();
    Object v2 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5));
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v2).enterScope(((com.google.javascript.jscomp.NodeTraversal)v6));
    Object v7 = null;
    Object v8 = com.google.javascript.rhino.IR.thisNode();
    Object v9 = com.google.javascript.rhino.IR.thisNode();
    Object v10 = ((com.google.javascript.rhino.Node)v8).useSourceInfoIfMissingFromForTree(((com.google.javascript.rhino.Node)v9));
    Object v11 = com.google.javascript.rhino.IR.thisNode();
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v2).process(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getProgress();
    Object v2 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5));
    Object v7 = ((com.google.javascript.jscomp.NodeTraversal)v6).getEnclosingFunction();
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v2).exitScope(((com.google.javascript.jscomp.NodeTraversal)v6));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getProgress();
    Object v2 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5));
    Object v7 = ((com.google.javascript.jscomp.NodeTraversal)v6).getScope();
    Object v8 = com.google.javascript.rhino.IR.thisNode();
    Object v9 = com.google.javascript.rhino.IR.thisNode();
    Object v10 = ((com.google.javascript.rhino.Node)v8).checkTreeEquals(((com.google.javascript.rhino.Node)v9));
    Object v11 = com.google.javascript.rhino.IR.thisNode();
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v6),((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getProgress();
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
  public void test67() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = com.google.javascript.rhino.IR.thisNode();
    Object v3 = com.google.javascript.rhino.IR.thisNode();
    Object v4 = ((com.google.javascript.rhino.Node)v3).getSideEffectFlags();
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v1).process(((com.google.javascript.rhino.Node)v2),((com.google.javascript.rhino.Node)v3));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getProgress();
    Object v2 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5));
    Object v7 = com.google.javascript.rhino.IR.thisNode();
    Object v8 = 17;
    ((com.google.javascript.rhino.Node)v7).setSourceEncodedPositionForTree((((java.lang.Integer)v8).intValue()));
    Object v9 = null;
    Object v10 = com.google.javascript.rhino.IR.thisNode();
    Object v11 = 2;
    ((com.google.javascript.rhino.Node)v10).setSourceEncodedPosition((((java.lang.Integer)v11).intValue()));
    Object v12 = null;
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v6),((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v10));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = com.google.javascript.rhino.IR.thisNode();
    Object v7 = com.google.javascript.rhino.IR.thisNode();
    Object v8 = com.google.javascript.rhino.IR.thisNode();
    Object v9 = ((com.google.javascript.rhino.Node)v7).srcrefTree(((com.google.javascript.rhino.Node)v8));
    Object v10 = ((com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback)v1).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v5),((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v7));
    org.junit.Assert.assertEquals((Object)(true), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getProgress();
    Object v2 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5));
    Object v7 = com.google.javascript.rhino.IR.thisNode();
    Object v8 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v9 = "\n}\n";
    Object v10 = "";
    Object v11 = com.google.javascript.jscomp.DiagnosticType.warning(((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = new java.lang.String[]{"4","prototIype"};
    Object v13 = ((com.google.javascript.jscomp.NodeTraversal)v6).makeError(((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.CheckLevel)v8),((com.google.javascript.jscomp.DiagnosticType)v11),((java.lang.String[])v12));
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v2).enterScope(((com.google.javascript.jscomp.NodeTraversal)v6));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getProgress();
    Object v2 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = com.google.javascript.rhino.IR.thisNode();
    Object v4 = ((com.google.javascript.rhino.Node)v3).cloneNode();
    Object v5 = com.google.javascript.rhino.IR.thisNode();
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v2).process(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.Node)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = com.google.javascript.rhino.IR.thisNode();
    Object v7 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v8 = "\n}\n";
    Object v9 = "";
    Object v10 = com.google.javascript.jscomp.DiagnosticType.warning(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = new java.lang.String[]{"7"};
    Object v12 = ((com.google.javascript.jscomp.NodeTraversal)v5).makeError(((com.google.javascript.rhino.Node)v6),((com.google.javascript.jscomp.CheckLevel)v7),((com.google.javascript.jscomp.DiagnosticType)v10),((java.lang.String[])v11));
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v1).enterScope(((com.google.javascript.jscomp.NodeTraversal)v5));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getProgress();
    Object v2 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = com.google.javascript.rhino.IR.thisNode();
    Object v4 = com.google.javascript.rhino.IR.thisNode();
    Object v5 = com.google.javascript.rhino.IR.thisNode();
    Object v6 = ((com.google.javascript.rhino.Node)v4).checkTreeEquals(((com.google.javascript.rhino.Node)v5));
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v2).process(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.Node)v4));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5));
    Object v7 = com.google.javascript.rhino.IR.thisNode();
    Object v8 = "\n}\n";
    Object v9 = "";
    Object v10 = com.google.javascript.jscomp.DiagnosticType.warning(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = new java.lang.String[]{"\\\"","prototy{e"};
    Object v12 = ((com.google.javascript.jscomp.NodeTraversal)v6).makeError(((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.DiagnosticType)v10),((java.lang.String[])v11));
    Object v13 = com.google.javascript.rhino.IR.thisNode();
    Object v14 = com.google.javascript.rhino.IR.thisNode();
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v6),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v14));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getProgress();
    Object v2 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5));
    Object v7 = com.google.javascript.rhino.IR.thisNode();
    Object v8 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v9 = "\n}\n";
    Object v10 = "";
    Object v11 = com.google.javascript.jscomp.DiagnosticType.warning(((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = new java.lang.String[]{"arguments","D"};
    Object v13 = ((com.google.javascript.jscomp.NodeTraversal)v6).makeError(((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.CheckLevel)v8),((com.google.javascript.jscomp.DiagnosticType)v11),((java.lang.String[])v12));
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v2).enterScope(((com.google.javascript.jscomp.NodeTraversal)v6));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getProgress();
    Object v2 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5));
    Object v7 = com.google.javascript.rhino.IR.thisNode();
    Object v8 = "\n}\n";
    Object v9 = "";
    Object v10 = com.google.javascript.jscomp.DiagnosticType.warning(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = new java.lang.String[]{"",""};
    Object v12 = ((com.google.javascript.jscomp.NodeTraversal)v6).makeError(((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.DiagnosticType)v10),((java.lang.String[])v11));
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v2).enterScope(((com.google.javascript.jscomp.NodeTraversal)v6));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getProgress();
    Object v2 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5));
    Object v7 = com.google.javascript.rhino.IR.thisNode();
    Object v8 = com.google.javascript.rhino.IR.thisNode();
    Object v9 = false;
    ((com.google.javascript.rhino.Node)v8).setIsSyntheticBlock((((java.lang.Boolean)v9).booleanValue()));
    Object v10 = null;
    Object v11 = ((com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback)v2).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v6),((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v8));
    org.junit.Assert.assertEquals((Object)(true), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getProgress();
    Object v2 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5));
    Object v7 = com.google.javascript.rhino.IR.thisNode();
    Object v8 = "\n}\n";
    Object v9 = "";
    Object v10 = com.google.javascript.jscomp.DiagnosticType.warning(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = new java.lang.String[]{"","prototype","y"};
    Object v12 = ((com.google.javascript.jscomp.NodeTraversal)v6).makeError(((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.DiagnosticType)v10),((java.lang.String[])v11));
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v2).enterScope(((com.google.javascript.jscomp.NodeTraversal)v6));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
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
  public void test81() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5));
    Object v7 = com.google.javascript.rhino.IR.thisNode();
    Object v8 = "\n}\n";
    Object v9 = "";
    Object v10 = com.google.javascript.jscomp.DiagnosticType.warning(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = new java.lang.String[]{"\"{0}\" is not a valid JS property name","O","RegEx"};
    Object v12 = ((com.google.javascript.jscomp.NodeTraversal)v6).makeError(((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.DiagnosticType)v10),((java.lang.String[])v11));
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v2).enterScope(((com.google.javascript.jscomp.NodeTraversal)v6));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
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
  public void test83() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getProgress();
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
  public void test84() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5));
    Object v7 = com.google.javascript.rhino.IR.thisNode();
    Object v8 = com.google.javascript.rhino.IR.thisNode();
    Object v9 = ((com.google.javascript.rhino.Node)v8).cloneTree();
    Object v10 = ((com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback)v2).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v6),((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v8));
    org.junit.Assert.assertEquals((Object)(true), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5));
    Object v7 = com.google.javascript.rhino.IR.thisNode();
    Object v8 = com.google.javascript.rhino.IR.thisNode();
    Object v9 = ((com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback)v2).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v6),((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v8));
    org.junit.Assert.assertEquals((Object)(true), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
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
  public void test87() throws Throwable {
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
    Object v12 = ((com.google.javascript.jscomp.NodeTraversal)v11).hasScope();
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v2).enterScope(((com.google.javascript.jscomp.NodeTraversal)v11));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
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
    Object v7 = ((com.google.javascript.jscomp.NodeTraversal)v6).hasScope();
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v2).enterScope(((com.google.javascript.jscomp.NodeTraversal)v6));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
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
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v2).enterScope(((com.google.javascript.jscomp.NodeTraversal)v6));
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.Compiler();
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v9));
    Object v11 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v8),((com.google.javascript.jscomp.NodeTraversal.Callback)v10));
    Object v12 = com.google.javascript.rhino.IR.thisNode();
    Object v13 = com.google.javascript.rhino.IR.thisNode();
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v11),((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getProgress();
    Object v2 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5));
    Object v7 = com.google.javascript.rhino.IR.thisNode();
    Object v8 = "checkType";
    ((com.google.javascript.rhino.Node)v7).addSuppression(((java.lang.String)v8));
    Object v9 = null;
    Object v10 = com.google.javascript.rhino.IR.thisNode();
    Object v11 = ((com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback)v2).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v6),((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v10));
    org.junit.Assert.assertEquals((Object)(true), v11);
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
    Object v7 = com.google.javascript.rhino.IR.thisNode();
    Object v8 = com.google.javascript.rhino.IR.thisNode();
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v6),((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
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
    Object v7 = com.google.javascript.rhino.IR.thisNode();
    Object v8 = "\n}\n";
    Object v9 = "";
    Object v10 = com.google.javascript.jscomp.DiagnosticType.warning(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = new java.lang.String[]{"*","  "};
    Object v12 = ((com.google.javascript.jscomp.NodeTraversal)v6).makeError(((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.DiagnosticType)v10),((java.lang.String[])v11));
    Object v13 = com.google.javascript.rhino.IR.thisNode();
    Object v14 = com.google.javascript.rhino.IR.thisNode();
    Object v15 = ((com.google.javascript.rhino.Node)v13).useSourceInfoFromForTree(((com.google.javascript.rhino.Node)v14));
    Object v16 = com.google.javascript.rhino.IR.thisNode();
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v6),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v16));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
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
    Object v11 = com.google.javascript.rhino.IR.thisNode();
    Object v12 = ((com.google.javascript.rhino.Node)v11).cloneNode();
    Object v13 = com.google.javascript.rhino.IR.thisNode();
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v1).visit(((com.google.javascript.jscomp.NodeTraversal)v10),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5));
    Object v7 = com.google.javascript.rhino.IR.thisNode();
    Object v8 = com.google.javascript.rhino.IR.thisNode();
    Object v9 = ((com.google.javascript.rhino.Node)v7).srcrefTree(((com.google.javascript.rhino.Node)v8));
    Object v10 = com.google.javascript.rhino.IR.thisNode();
    Object v11 = ((com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback)v2).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v6),((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v10));
    org.junit.Assert.assertEquals((Object)(true), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5));
    Object v7 = com.google.javascript.rhino.IR.thisNode();
    Object v8 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v9 = "\n}\n";
    Object v10 = "";
    Object v11 = com.google.javascript.jscomp.DiagnosticType.warning(((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = new java.lang.String[]{","};
    Object v13 = ((com.google.javascript.jscomp.NodeTraversal)v6).makeError(((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.CheckLevel)v8),((com.google.javascript.jscomp.DiagnosticType)v11),((java.lang.String[])v12));
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v2).enterScope(((com.google.javascript.jscomp.NodeTraversal)v6));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = com.google.javascript.rhino.IR.thisNode();
    Object v3 = com.google.javascript.rhino.IR.thisNode();
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v1).process(((com.google.javascript.rhino.Node)v2),((com.google.javascript.rhino.Node)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
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
    Object v12 = com.google.javascript.rhino.IR.thisNode();
    Object v13 = "\n}\n";
    Object v14 = "";
    Object v15 = com.google.javascript.jscomp.DiagnosticType.warning(((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = new java.lang.String[]{"prototype"};
    Object v17 = ((com.google.javascript.jscomp.NodeTraversal)v11).makeError(((com.google.javascript.rhino.Node)v12),((com.google.javascript.jscomp.DiagnosticType)v15),((java.lang.String[])v16));
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v2).enterScope(((com.google.javascript.jscomp.NodeTraversal)v11));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = com.google.javascript.rhino.IR.thisNode();
    Object v7 = "\n}\n";
    Object v8 = "";
    Object v9 = com.google.javascript.jscomp.DiagnosticType.warning(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = new java.lang.String[]{"stripg",""};
    Object v11 = ((com.google.javascript.jscomp.NodeTraversal)v5).makeError(((com.google.javascript.rhino.Node)v6),((com.google.javascript.jscomp.DiagnosticType)v9),((java.lang.String[])v10));
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v1).enterScope(((com.google.javascript.jscomp.NodeTraversal)v5));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getProgress();
    Object v2 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5));
    Object v7 = com.google.javascript.rhino.IR.thisNode();
    Object v8 = "\n}\n";
    Object v9 = "";
    Object v10 = com.google.javascript.jscomp.DiagnosticType.warning(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = new java.lang.String[]{"N2ONE",", ","D"};
    Object v12 = ((com.google.javascript.jscomp.NodeTraversal)v6).makeError(((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.DiagnosticType)v10),((java.lang.String[])v11));
    Object v13 = com.google.javascript.rhino.IR.thisNode();
    Object v14 = ((com.google.javascript.rhino.Node)v13).getSourceOffset();
    Object v15 = com.google.javascript.rhino.IR.thisNode();
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v6),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }
}
