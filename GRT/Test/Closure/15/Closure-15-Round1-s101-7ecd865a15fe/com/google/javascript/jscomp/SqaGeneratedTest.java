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
    Object v6 = ",";
    Object v7 = com.google.javascript.rhino.IR.name(((java.lang.String)v6));
    Object v8 = "";
    Object v9 = "R";
    Object v10 = com.google.javascript.jscomp.DiagnosticType.error(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = new java.lang.String[]{"]","",""};
    Object v12 = ((com.google.javascript.jscomp.NodeTraversal)v5).makeError(((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.DiagnosticType)v10),((java.lang.String[])v11));
    Object v13 = ",";
    Object v14 = com.google.javascript.rhino.IR.name(((java.lang.String)v13));
    Object v15 = ",";
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
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = new com.google.javascript.jscomp.Compiler();
    Object v9 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v8));
    Object v10 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v7),((com.google.javascript.jscomp.NodeTraversal.Callback)v9));
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v1).enterScope(((com.google.javascript.jscomp.NodeTraversal)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
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
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v1).enterScope(((com.google.javascript.jscomp.NodeTraversal)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v1).enterScope(((com.google.javascript.jscomp.NodeTraversal)v5));
    Object v6 = null;
    Object v7 = ",";
    Object v8 = com.google.javascript.rhino.IR.name(((java.lang.String)v7));
    Object v9 = ",";
    Object v10 = com.google.javascript.rhino.IR.name(((java.lang.String)v9));
    Object v11 = false;
    ((com.google.javascript.rhino.Node)v10).setVarArgs((((java.lang.Boolean)v11).booleanValue()));
    Object v12 = null;
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v1).process(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v10));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = ",";
    Object v7 = com.google.javascript.rhino.IR.name(((java.lang.String)v6));
    Object v8 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v9 = "";
    Object v10 = "R";
    Object v11 = com.google.javascript.jscomp.DiagnosticType.error(((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = new java.lang.String[]{"REGISTER_STRING",".prototype",""};
    Object v13 = ((com.google.javascript.jscomp.NodeTraversal)v5).makeError(((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.CheckLevel)v8),((com.google.javascript.jscomp.DiagnosticType)v11),((java.lang.String[])v12));
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v1).enterScope(((com.google.javascript.jscomp.NodeTraversal)v5));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = ",";
    Object v7 = com.google.javascript.rhino.IR.name(((java.lang.String)v6));
    Object v8 = ",";
    Object v9 = com.google.javascript.rhino.IR.name(((java.lang.String)v8));
    Object v10 = ((com.google.javascript.rhino.Node)v9).isVarArgs();
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v1).visit(((com.google.javascript.jscomp.NodeTraversal)v5),((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
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
  public void test10() throws Throwable {
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
  public void test11() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = ",";
    Object v7 = com.google.javascript.rhino.IR.name(((java.lang.String)v6));
    ((com.google.javascript.jscomp.NodeTraversal)v5).traverse(((com.google.javascript.rhino.Node)v7));
    Object v8 = null;
    Object v9 = ",";
    Object v10 = com.google.javascript.rhino.IR.name(((java.lang.String)v9));
    Object v11 = ",";
    Object v12 = com.google.javascript.rhino.IR.name(((java.lang.String)v11));
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v1).visit(((com.google.javascript.jscomp.NodeTraversal)v5),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = ",";
    Object v7 = com.google.javascript.rhino.IR.name(((java.lang.String)v6));
    Object v8 = ",";
    Object v9 = com.google.javascript.rhino.IR.name(((java.lang.String)v8));
    Object v10 = ((com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback)v1).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v5),((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9));
    org.junit.Assert.assertEquals((Object)(true), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = ",";
    Object v7 = com.google.javascript.rhino.IR.name(((java.lang.String)v6));
    Object v8 = "";
    ((com.google.javascript.rhino.Node)v7).setSourceFileForTesting(((java.lang.String)v8));
    Object v9 = null;
    Object v10 = ",";
    Object v11 = com.google.javascript.rhino.IR.name(((java.lang.String)v10));
    Object v12 = ((com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback)v1).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v5),((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v11));
    org.junit.Assert.assertEquals((Object)(true), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = ",";
    Object v3 = com.google.javascript.rhino.IR.name(((java.lang.String)v2));
    Object v4 = ",";
    Object v5 = com.google.javascript.rhino.IR.name(((java.lang.String)v4));
    Object v6 = ((com.google.javascript.rhino.Node)v3).isEquivalentTo(((com.google.javascript.rhino.Node)v5));
    Object v7 = ",";
    Object v8 = com.google.javascript.rhino.IR.name(((java.lang.String)v7));
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v1).process(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
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
  public void test17() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = ",";
    Object v7 = com.google.javascript.rhino.IR.name(((java.lang.String)v6));
    Object v8 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v9 = "";
    Object v10 = "R";
    Object v11 = com.google.javascript.jscomp.DiagnosticType.error(((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = new java.lang.String[]{"","",""};
    Object v13 = ((com.google.javascript.jscomp.NodeTraversal)v5).makeError(((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.CheckLevel)v8),((com.google.javascript.jscomp.DiagnosticType)v11),((java.lang.String[])v12));
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v1).enterScope(((com.google.javascript.jscomp.NodeTraversal)v5));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
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
    Object v7 = ((com.google.javascript.jscomp.NodeTraversal)v6).getScope();
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v2).enterScope(((com.google.javascript.jscomp.NodeTraversal)v6));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
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
  public void test20() throws Throwable {
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
  public void test21() throws Throwable {
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
    Object v12 = ",";
    Object v13 = com.google.javascript.rhino.IR.name(((java.lang.String)v12));
    Object v14 = ",";
    Object v15 = com.google.javascript.rhino.IR.name(((java.lang.String)v14));
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v11),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = ",";
    Object v7 = com.google.javascript.rhino.IR.name(((java.lang.String)v6));
    Object v8 = "";
    Object v9 = "R";
    Object v10 = com.google.javascript.jscomp.DiagnosticType.error(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = new java.lang.String[]{};
    Object v12 = ((com.google.javascript.jscomp.NodeTraversal)v5).makeError(((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.DiagnosticType)v10),((java.lang.String[])v11));
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v1).enterScope(((com.google.javascript.jscomp.NodeTraversal)v5));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5));
    Object v7 = ",";
    Object v8 = com.google.javascript.rhino.IR.name(((java.lang.String)v7));
    Object v9 = ",";
    Object v10 = com.google.javascript.rhino.IR.name(((java.lang.String)v9));
    Object v11 = ((com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback)v2).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v6),((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v10));
    org.junit.Assert.assertEquals((Object)(true), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5));
    Object v7 = ",";
    Object v8 = com.google.javascript.rhino.IR.name(((java.lang.String)v7));
    Object v9 = ",";
    Object v10 = com.google.javascript.rhino.IR.name(((java.lang.String)v9));
    Object v11 = ((com.google.javascript.rhino.Node)v10).removeFirstChild();
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v6),((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v10));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = ",";
    Object v3 = com.google.javascript.rhino.IR.name(((java.lang.String)v2));
    Object v4 = ",";
    Object v5 = com.google.javascript.rhino.IR.name(((java.lang.String)v4));
    Object v6 = ((com.google.javascript.rhino.Node)v3).copyInformationFromForTree(((com.google.javascript.rhino.Node)v5));
    Object v7 = ",";
    Object v8 = com.google.javascript.rhino.IR.name(((java.lang.String)v7));
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v1).process(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getProgress();
    Object v2 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    org.junit.Assert.assertNotNull(v2);
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
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v2).enterScope(((com.google.javascript.jscomp.NodeTraversal)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
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
    Object v8 = ",";
    Object v9 = com.google.javascript.rhino.IR.name(((java.lang.String)v8));
    Object v10 = ",";
    Object v11 = com.google.javascript.rhino.IR.name(((java.lang.String)v10));
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v2).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
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
  public void test30() throws Throwable {
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
  public void test31() throws Throwable {
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
  public void test32() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getProgress();
    Object v2 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = ",";
    Object v4 = com.google.javascript.rhino.IR.name(((java.lang.String)v3));
    Object v5 = ",";
    Object v6 = com.google.javascript.rhino.IR.name(((java.lang.String)v5));
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v2).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
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
    Object v7 = ",";
    Object v8 = com.google.javascript.rhino.IR.name(((java.lang.String)v7));
    Object v9 = "";
    Object v10 = "R";
    Object v11 = com.google.javascript.jscomp.DiagnosticType.error(((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = new java.lang.String[]{};
    Object v13 = ((com.google.javascript.jscomp.NodeTraversal)v6).makeError(((com.google.javascript.rhino.Node)v8),((com.google.javascript.jscomp.DiagnosticType)v11),((java.lang.String[])v12));
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v2).enterScope(((com.google.javascript.jscomp.NodeTraversal)v6));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = ",";
    Object v7 = com.google.javascript.rhino.IR.name(((java.lang.String)v6));
    Object v8 = "";
    Object v9 = "R";
    Object v10 = com.google.javascript.jscomp.DiagnosticType.error(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = new java.lang.String[]{"","",""};
    Object v12 = ((com.google.javascript.jscomp.NodeTraversal)v5).makeError(((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.DiagnosticType)v10),((java.lang.String[])v11));
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v1).enterScope(((com.google.javascript.jscomp.NodeTraversal)v5));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
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
  public void test36() throws Throwable {
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
  public void test37() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getProgress();
    Object v2 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5));
    Object v7 = ",";
    Object v8 = com.google.javascript.rhino.IR.name(((java.lang.String)v7));
    Object v9 = ",";
    Object v10 = com.google.javascript.rhino.IR.name(((java.lang.String)v9));
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v6),((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = ",";
    Object v7 = com.google.javascript.rhino.IR.name(((java.lang.String)v6));
    Object v8 = ",";
    Object v9 = com.google.javascript.rhino.IR.name(((java.lang.String)v8));
    Object v10 = -1;
    ((com.google.javascript.rhino.Node)v9).removeProp((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v1).visit(((com.google.javascript.jscomp.NodeTraversal)v5),((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5));
    Object v7 = ",";
    Object v8 = com.google.javascript.rhino.IR.name(((java.lang.String)v7));
    ((com.google.javascript.jscomp.NodeTraversal)v6).traverse(((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v2).enterScope(((com.google.javascript.jscomp.NodeTraversal)v6));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = ",";
    Object v3 = com.google.javascript.rhino.IR.name(((java.lang.String)v2));
    Object v4 = ",";
    Object v5 = com.google.javascript.rhino.IR.name(((java.lang.String)v4));
    Object v6 = ((com.google.javascript.rhino.Node)v3).useSourceInfoIfMissingFromForTree(((com.google.javascript.rhino.Node)v5));
    Object v7 = ",";
    Object v8 = com.google.javascript.rhino.IR.name(((java.lang.String)v7));
    Object v9 = ",";
    Object v10 = com.google.javascript.rhino.IR.name(((java.lang.String)v9));
    Object v11 = ((com.google.javascript.rhino.Node)v8).useSourceInfoFrom(((com.google.javascript.rhino.Node)v10));
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v1).process(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.Node)v8));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5));
    Object v7 = ",";
    Object v8 = com.google.javascript.rhino.IR.name(((java.lang.String)v7));
    Object v9 = ",";
    Object v10 = com.google.javascript.rhino.IR.name(((java.lang.String)v9));
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v6),((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = ",";
    Object v7 = com.google.javascript.rhino.IR.name(((java.lang.String)v6));
    Object v8 = ",";
    Object v9 = com.google.javascript.rhino.IR.name(((java.lang.String)v8));
    ((com.google.javascript.rhino.Node)v7).addChildToBack(((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
    Object v11 = ",";
    Object v12 = com.google.javascript.rhino.IR.name(((java.lang.String)v11));
    Object v13 = ((com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback)v1).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v5),((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v12));
    org.junit.Assert.assertEquals((Object)(true), v13);
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
    Object v7 = ",";
    Object v8 = com.google.javascript.rhino.IR.name(((java.lang.String)v7));
    Object v9 = ",";
    Object v10 = com.google.javascript.rhino.IR.name(((java.lang.String)v9));
    Object v11 = ((com.google.javascript.rhino.Node)v8).isEquivalentToTyped(((com.google.javascript.rhino.Node)v10));
    Object v12 = ",";
    Object v13 = com.google.javascript.rhino.IR.name(((java.lang.String)v12));
    Object v14 = 67;
    Object v15 = 1;
    ((com.google.javascript.rhino.Node)v13).putIntProp((((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v16 = null;
    Object v17 = ((com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback)v2).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v6),((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v13));
    org.junit.Assert.assertEquals((Object)(true), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5));
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v2).enterScope(((com.google.javascript.jscomp.NodeTraversal)v6));
    Object v7 = null;
    Object v8 = ",";
    Object v9 = com.google.javascript.rhino.IR.name(((java.lang.String)v8));
    Object v10 = ",";
    Object v11 = com.google.javascript.rhino.IR.name(((java.lang.String)v10));
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v2).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getProgress();
    Object v2 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5));
    Object v7 = ",";
    Object v8 = com.google.javascript.rhino.IR.name(((java.lang.String)v7));
    Object v9 = "";
    Object v10 = "R";
    Object v11 = com.google.javascript.jscomp.DiagnosticType.error(((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = new java.lang.String[]{"","",""};
    Object v13 = ((com.google.javascript.jscomp.NodeTraversal)v6).makeError(((com.google.javascript.rhino.Node)v8),((com.google.javascript.jscomp.DiagnosticType)v11),((java.lang.String[])v12));
    Object v14 = ",";
    Object v15 = com.google.javascript.rhino.IR.name(((java.lang.String)v14));
    Object v16 = ",";
    Object v17 = com.google.javascript.rhino.IR.name(((java.lang.String)v16));
    Object v18 = ((com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback)v2).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v6),((com.google.javascript.rhino.Node)v15),((com.google.javascript.rhino.Node)v17));
    org.junit.Assert.assertEquals((Object)(true), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
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
  public void test47() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getProgress();
    Object v2 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5));
    Object v7 = ",";
    Object v8 = com.google.javascript.rhino.IR.name(((java.lang.String)v7));
    Object v9 = ",";
    Object v10 = com.google.javascript.rhino.IR.name(((java.lang.String)v9));
    Object v11 = ((com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback)v2).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v6),((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v10));
    org.junit.Assert.assertEquals((Object)(true), v11);
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
    Object v12 = ",";
    Object v13 = com.google.javascript.rhino.IR.name(((java.lang.String)v12));
    Object v14 = ",";
    Object v15 = com.google.javascript.rhino.IR.name(((java.lang.String)v14));
    ((com.google.javascript.rhino.Node)v13).addChildToBack(((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
    Object v17 = ",";
    Object v18 = com.google.javascript.rhino.IR.name(((java.lang.String)v17));
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v11),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v18));
    Object v19 = null;
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
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
  public void test50() throws Throwable {
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
  public void test51() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = ",";
    Object v4 = com.google.javascript.rhino.IR.name(((java.lang.String)v3));
    Object v5 = ((com.google.javascript.rhino.Node)v4).wasEmptyNode();
    Object v6 = ",";
    Object v7 = com.google.javascript.rhino.IR.name(((java.lang.String)v6));
    Object v8 = 1;
    ((com.google.javascript.rhino.Node)v7).setLineno((((java.lang.Integer)v8).intValue()));
    Object v9 = null;
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v2).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v7));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = ",";
    Object v7 = com.google.javascript.rhino.IR.name(((java.lang.String)v6));
    Object v8 = ",";
    Object v9 = com.google.javascript.rhino.IR.name(((java.lang.String)v8));
    ((com.google.javascript.jscomp.NodeTraversal.Callback)v1).visit(((com.google.javascript.jscomp.NodeTraversal)v5),((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Compiler();
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v11),((com.google.javascript.jscomp.NodeTraversal.Callback)v13));
    Object v15 = ",";
    Object v16 = com.google.javascript.rhino.IR.name(((java.lang.String)v15));
    Object v17 = java.io.Writer.nullWriter();
    ((com.google.javascript.rhino.Node)v16).appendStringTree(((java.lang.Appendable)v17));
    Object v18 = null;
    Object v19 = ",";
    Object v20 = com.google.javascript.rhino.IR.name(((java.lang.String)v19));
    Object v21 = ((com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback)v1).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v14),((com.google.javascript.rhino.Node)v16),((com.google.javascript.rhino.Node)v20));
    org.junit.Assert.assertEquals((Object)(true), v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = ",";
    Object v7 = com.google.javascript.rhino.IR.name(((java.lang.String)v6));
    Object v8 = ",";
    Object v9 = com.google.javascript.rhino.IR.name(((java.lang.String)v8));
    ((com.google.javascript.jscomp.NodeTraversal.Callback)v1).visit(((com.google.javascript.jscomp.NodeTraversal)v5),((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Compiler();
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v11),((com.google.javascript.jscomp.NodeTraversal.Callback)v13));
    Object v15 = ",";
    Object v16 = com.google.javascript.rhino.IR.name(((java.lang.String)v15));
    Object v17 = ",";
    Object v18 = com.google.javascript.rhino.IR.name(((java.lang.String)v17));
    Object v19 = ((com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback)v1).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v14),((com.google.javascript.rhino.Node)v16),((com.google.javascript.rhino.Node)v18));
    org.junit.Assert.assertEquals((Object)(true), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
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
  public void test55() throws Throwable {
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
    Object v12 = ",";
    Object v13 = com.google.javascript.rhino.IR.name(((java.lang.String)v12));
    Object v14 = ",";
    Object v15 = com.google.javascript.rhino.IR.name(((java.lang.String)v14));
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v11),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getProgress();
    Object v2 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5));
    Object v7 = ",";
    Object v8 = com.google.javascript.rhino.IR.name(((java.lang.String)v7));
    Object v9 = ",";
    Object v10 = com.google.javascript.rhino.IR.name(((java.lang.String)v9));
    ((com.google.javascript.jscomp.NodeTraversal.Callback)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v6),((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.Compiler();
    Object v14 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v13));
    Object v15 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v12),((com.google.javascript.jscomp.NodeTraversal.Callback)v14));
    Object v16 = ",";
    Object v17 = com.google.javascript.rhino.IR.name(((java.lang.String)v16));
    Object v18 = ",";
    Object v19 = com.google.javascript.rhino.IR.name(((java.lang.String)v18));
    Object v20 = ((com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback)v2).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v15),((com.google.javascript.rhino.Node)v17),((com.google.javascript.rhino.Node)v19));
    org.junit.Assert.assertEquals((Object)(true), v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = ",";
    Object v7 = com.google.javascript.rhino.IR.name(((java.lang.String)v6));
    Object v8 = ",";
    Object v9 = com.google.javascript.rhino.IR.name(((java.lang.String)v8));
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v1).visit(((com.google.javascript.jscomp.NodeTraversal)v5),((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getProgress();
    Object v2 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5));
    Object v7 = ((com.google.javascript.jscomp.NodeTraversal)v6).getScope();
    Object v8 = ",";
    Object v9 = com.google.javascript.rhino.IR.name(((java.lang.String)v8));
    Object v10 = ",";
    Object v11 = com.google.javascript.rhino.IR.name(((java.lang.String)v10));
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v6),((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
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
  public void test60() throws Throwable {
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
  public void test61() throws Throwable {
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
  public void test62() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = ",";
    Object v7 = com.google.javascript.rhino.IR.name(((java.lang.String)v6));
    Object v8 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v9 = "";
    Object v10 = "R";
    Object v11 = com.google.javascript.jscomp.DiagnosticType.error(((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = new java.lang.String[]{};
    Object v13 = ((com.google.javascript.jscomp.NodeTraversal)v5).makeError(((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.CheckLevel)v8),((com.google.javascript.jscomp.DiagnosticType)v11),((java.lang.String[])v12));
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v1).exitScope(((com.google.javascript.jscomp.NodeTraversal)v5));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getProgress();
    Object v2 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5));
    Object v7 = ",";
    Object v8 = com.google.javascript.rhino.IR.name(((java.lang.String)v7));
    Object v9 = ",";
    Object v10 = com.google.javascript.rhino.IR.name(((java.lang.String)v9));
    Object v11 = new com.google.javascript.rhino.JSDocInfo();
    ((com.google.javascript.rhino.Node)v10).setJSDocInfo(((com.google.javascript.rhino.JSDocInfo)v11));
    Object v12 = null;
    Object v13 = ((com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback)v2).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v6),((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v10));
    org.junit.Assert.assertEquals((Object)(true), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5));
    Object v7 = ",";
    Object v8 = com.google.javascript.rhino.IR.name(((java.lang.String)v7));
    Object v9 = ",";
    Object v10 = com.google.javascript.rhino.IR.name(((java.lang.String)v9));
    ((com.google.javascript.jscomp.NodeTraversal.Callback)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v6),((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.Compiler();
    Object v14 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v13));
    Object v15 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v12),((com.google.javascript.jscomp.NodeTraversal.Callback)v14));
    Object v16 = ",";
    Object v17 = com.google.javascript.rhino.IR.name(((java.lang.String)v16));
    Object v18 = -61;
    ((com.google.javascript.rhino.Node)v17).removeProp((((java.lang.Integer)v18).intValue()));
    Object v19 = null;
    Object v20 = ",";
    Object v21 = com.google.javascript.rhino.IR.name(((java.lang.String)v20));
    Object v22 = ((com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback)v2).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v15),((com.google.javascript.rhino.Node)v17),((com.google.javascript.rhino.Node)v21));
    org.junit.Assert.assertEquals((Object)(true), v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = ",";
    Object v4 = com.google.javascript.rhino.IR.name(((java.lang.String)v3));
    Object v5 = ",";
    Object v6 = com.google.javascript.rhino.IR.name(((java.lang.String)v5));
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v2).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5));
    Object v7 = ",";
    Object v8 = com.google.javascript.rhino.IR.name(((java.lang.String)v7));
    Object v9 = ",";
    Object v10 = com.google.javascript.rhino.IR.name(((java.lang.String)v9));
    Object v11 = ((com.google.javascript.rhino.Node)v8).srcref(((com.google.javascript.rhino.Node)v10));
    Object v12 = ",";
    Object v13 = com.google.javascript.rhino.IR.name(((java.lang.String)v12));
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v6),((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5));
    Object v7 = ",";
    Object v8 = com.google.javascript.rhino.IR.name(((java.lang.String)v7));
    Object v9 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v10 = "";
    Object v11 = "R";
    Object v12 = com.google.javascript.jscomp.DiagnosticType.error(((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = new java.lang.String[]{};
    Object v14 = ((com.google.javascript.jscomp.NodeTraversal)v6).makeError(((com.google.javascript.rhino.Node)v8),((com.google.javascript.jscomp.CheckLevel)v9),((com.google.javascript.jscomp.DiagnosticType)v12),((java.lang.String[])v13));
    Object v15 = ",";
    Object v16 = com.google.javascript.rhino.IR.name(((java.lang.String)v15));
    Object v17 = ",";
    Object v18 = com.google.javascript.rhino.IR.name(((java.lang.String)v17));
    Object v19 = ((com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback)v2).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v6),((com.google.javascript.rhino.Node)v16),((com.google.javascript.rhino.Node)v18));
    org.junit.Assert.assertEquals((Object)(true), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
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
    Object v8 = ",";
    Object v9 = com.google.javascript.rhino.IR.name(((java.lang.String)v8));
    Object v10 = ",";
    Object v11 = com.google.javascript.rhino.IR.name(((java.lang.String)v10));
    Object v12 = ((com.google.javascript.rhino.Node)v9).useSourceInfoIfMissingFromForTree(((com.google.javascript.rhino.Node)v11));
    Object v13 = ",";
    Object v14 = com.google.javascript.rhino.IR.name(((java.lang.String)v13));
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v2).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v14));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
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
  public void test70() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getProgress();
    Object v2 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5));
    Object v7 = ((com.google.javascript.jscomp.NodeTraversal)v6).getScope();
    Object v8 = ",";
    Object v9 = com.google.javascript.rhino.IR.name(((java.lang.String)v8));
    Object v10 = ",";
    Object v11 = com.google.javascript.rhino.IR.name(((java.lang.String)v10));
    Object v12 = ((com.google.javascript.rhino.Node)v9).checkTreeEquals(((com.google.javascript.rhino.Node)v11));
    Object v13 = ",";
    Object v14 = com.google.javascript.rhino.IR.name(((java.lang.String)v13));
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v6),((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v14));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
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
  public void test72() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = ",";
    Object v3 = com.google.javascript.rhino.IR.name(((java.lang.String)v2));
    Object v4 = ",";
    Object v5 = com.google.javascript.rhino.IR.name(((java.lang.String)v4));
    Object v6 = ((com.google.javascript.rhino.Node)v5).getSideEffectFlags();
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v1).process(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.Node)v5));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getProgress();
    Object v2 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5));
    Object v7 = ",";
    Object v8 = com.google.javascript.rhino.IR.name(((java.lang.String)v7));
    Object v9 = 18;
    ((com.google.javascript.rhino.Node)v8).setSourceEncodedPositionForTree((((java.lang.Integer)v9).intValue()));
    Object v10 = null;
    Object v11 = ",";
    Object v12 = com.google.javascript.rhino.IR.name(((java.lang.String)v11));
    Object v13 = 1;
    ((com.google.javascript.rhino.Node)v12).setSourceEncodedPosition((((java.lang.Integer)v13).intValue()));
    Object v14 = null;
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v6),((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v12));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = ",";
    Object v7 = com.google.javascript.rhino.IR.name(((java.lang.String)v6));
    Object v8 = ",";
    Object v9 = com.google.javascript.rhino.IR.name(((java.lang.String)v8));
    Object v10 = ",";
    Object v11 = com.google.javascript.rhino.IR.name(((java.lang.String)v10));
    Object v12 = ((com.google.javascript.rhino.Node)v9).srcrefTree(((com.google.javascript.rhino.Node)v11));
    Object v13 = ((com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback)v1).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v5),((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9));
    org.junit.Assert.assertEquals((Object)(true), v13);
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
    Object v7 = ",";
    Object v8 = com.google.javascript.rhino.IR.name(((java.lang.String)v7));
    Object v9 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v10 = "";
    Object v11 = "R";
    Object v12 = com.google.javascript.jscomp.DiagnosticType.error(((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = new java.lang.String[]{"4","prototIype"};
    Object v14 = ((com.google.javascript.jscomp.NodeTraversal)v6).makeError(((com.google.javascript.rhino.Node)v8),((com.google.javascript.jscomp.CheckLevel)v9),((com.google.javascript.jscomp.DiagnosticType)v12),((java.lang.String[])v13));
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v2).enterScope(((com.google.javascript.jscomp.NodeTraversal)v6));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getProgress();
    Object v2 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = ",";
    Object v4 = com.google.javascript.rhino.IR.name(((java.lang.String)v3));
    Object v5 = ((com.google.javascript.rhino.Node)v4).cloneNode();
    Object v6 = ",";
    Object v7 = com.google.javascript.rhino.IR.name(((java.lang.String)v6));
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v2).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = ",";
    Object v7 = com.google.javascript.rhino.IR.name(((java.lang.String)v6));
    Object v8 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v9 = "";
    Object v10 = "R";
    Object v11 = com.google.javascript.jscomp.DiagnosticType.error(((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = new java.lang.String[]{"7"};
    Object v13 = ((com.google.javascript.jscomp.NodeTraversal)v5).makeError(((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.CheckLevel)v8),((com.google.javascript.jscomp.DiagnosticType)v11),((java.lang.String[])v12));
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v1).enterScope(((com.google.javascript.jscomp.NodeTraversal)v5));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getProgress();
    Object v2 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = ",";
    Object v4 = com.google.javascript.rhino.IR.name(((java.lang.String)v3));
    Object v5 = ",";
    Object v6 = com.google.javascript.rhino.IR.name(((java.lang.String)v5));
    Object v7 = ",";
    Object v8 = com.google.javascript.rhino.IR.name(((java.lang.String)v7));
    Object v9 = ((com.google.javascript.rhino.Node)v6).checkTreeEquals(((com.google.javascript.rhino.Node)v8));
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v2).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v6));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5));
    Object v7 = ",";
    Object v8 = com.google.javascript.rhino.IR.name(((java.lang.String)v7));
    Object v9 = "";
    Object v10 = "R";
    Object v11 = com.google.javascript.jscomp.DiagnosticType.error(((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = new java.lang.String[]{":","prototy{e"};
    Object v13 = ((com.google.javascript.jscomp.NodeTraversal)v6).makeError(((com.google.javascript.rhino.Node)v8),((com.google.javascript.jscomp.DiagnosticType)v11),((java.lang.String[])v12));
    Object v14 = ",";
    Object v15 = com.google.javascript.rhino.IR.name(((java.lang.String)v14));
    Object v16 = ",";
    Object v17 = com.google.javascript.rhino.IR.name(((java.lang.String)v16));
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v6),((com.google.javascript.rhino.Node)v15),((com.google.javascript.rhino.Node)v17));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getProgress();
    Object v2 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5));
    Object v7 = ",";
    Object v8 = com.google.javascript.rhino.IR.name(((java.lang.String)v7));
    Object v9 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v10 = "";
    Object v11 = "R";
    Object v12 = com.google.javascript.jscomp.DiagnosticType.error(((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = new java.lang.String[]{"arguments","D"};
    Object v14 = ((com.google.javascript.jscomp.NodeTraversal)v6).makeError(((com.google.javascript.rhino.Node)v8),((com.google.javascript.jscomp.CheckLevel)v9),((com.google.javascript.jscomp.DiagnosticType)v12),((java.lang.String[])v13));
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v2).enterScope(((com.google.javascript.jscomp.NodeTraversal)v6));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getProgress();
    Object v2 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5));
    Object v7 = ",";
    Object v8 = com.google.javascript.rhino.IR.name(((java.lang.String)v7));
    Object v9 = "";
    Object v10 = "R";
    Object v11 = com.google.javascript.jscomp.DiagnosticType.error(((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = new java.lang.String[]{"",""};
    Object v13 = ((com.google.javascript.jscomp.NodeTraversal)v6).makeError(((com.google.javascript.rhino.Node)v8),((com.google.javascript.jscomp.DiagnosticType)v11),((java.lang.String[])v12));
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v2).enterScope(((com.google.javascript.jscomp.NodeTraversal)v6));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getProgress();
    Object v2 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5));
    Object v7 = ",";
    Object v8 = com.google.javascript.rhino.IR.name(((java.lang.String)v7));
    Object v9 = ",";
    Object v10 = com.google.javascript.rhino.IR.name(((java.lang.String)v9));
    Object v11 = false;
    ((com.google.javascript.rhino.Node)v10).setIsSyntheticBlock((((java.lang.Boolean)v11).booleanValue()));
    Object v12 = null;
    Object v13 = ((com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback)v2).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v6),((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v10));
    org.junit.Assert.assertEquals((Object)(true), v13);
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
    Object v7 = ",";
    Object v8 = com.google.javascript.rhino.IR.name(((java.lang.String)v7));
    Object v9 = "";
    Object v10 = "R";
    Object v11 = com.google.javascript.jscomp.DiagnosticType.error(((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = new java.lang.String[]{"","prototype","y"};
    Object v13 = ((com.google.javascript.jscomp.NodeTraversal)v6).makeError(((com.google.javascript.rhino.Node)v8),((com.google.javascript.jscomp.DiagnosticType)v11),((java.lang.String[])v12));
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v2).enterScope(((com.google.javascript.jscomp.NodeTraversal)v6));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "tvhis";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "tvhis";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = ",";
    Object v10 = com.google.javascript.rhino.IR.name(((java.lang.String)v9));
    Object v11 = ",";
    Object v12 = com.google.javascript.rhino.IR.name(((java.lang.String)v11));
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v4).visit(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "tvhis";
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
  public void test87() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "tvhis";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = ",";
    Object v10 = com.google.javascript.rhino.IR.name(((java.lang.String)v9));
    Object v11 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v12 = "";
    Object v13 = "R";
    Object v14 = com.google.javascript.jscomp.DiagnosticType.error(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = new java.lang.String[]{""};
    Object v16 = ((com.google.javascript.jscomp.NodeTraversal)v8).makeError(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.CheckLevel)v11),((com.google.javascript.jscomp.DiagnosticType)v14),((java.lang.String[])v15));
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v4).enterScope(((com.google.javascript.jscomp.NodeTraversal)v8));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "tvhis";
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
  public void test89() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "tvhis";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v5 = ",";
    Object v6 = com.google.javascript.rhino.IR.name(((java.lang.String)v5));
    Object v7 = ",";
    Object v8 = com.google.javascript.rhino.IR.name(((java.lang.String)v7));
    Object v9 = ((com.google.javascript.rhino.Node)v8).cloneTree();
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "tvhis";
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
    Object v14 = ((com.google.javascript.jscomp.NodeTraversal)v13).hasScope();
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v4).enterScope(((com.google.javascript.jscomp.NodeTraversal)v13));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5));
    Object v7 = ",";
    Object v8 = com.google.javascript.rhino.IR.name(((java.lang.String)v7));
    Object v9 = "Expected a string; found: null";
    ((com.google.javascript.rhino.Node)v8).addSuppression(((java.lang.String)v9));
    Object v10 = null;
    Object v11 = ",";
    Object v12 = com.google.javascript.rhino.IR.name(((java.lang.String)v11));
    Object v13 = ((com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback)v2).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v6),((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v12));
    org.junit.Assert.assertEquals((Object)(true), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getProgress();
    Object v2 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5));
    Object v7 = ",";
    Object v8 = com.google.javascript.rhino.IR.name(((java.lang.String)v7));
    Object v9 = "";
    Object v10 = "R";
    Object v11 = com.google.javascript.jscomp.DiagnosticType.error(((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = new java.lang.String[]{"INTERNAL COMPILER ERROR.\nPlease report this problem.\n","  "};
    Object v13 = ((com.google.javascript.jscomp.NodeTraversal)v6).makeError(((com.google.javascript.rhino.Node)v8),((com.google.javascript.jscomp.DiagnosticType)v11),((java.lang.String[])v12));
    Object v14 = ",";
    Object v15 = com.google.javascript.rhino.IR.name(((java.lang.String)v14));
    Object v16 = ",";
    Object v17 = com.google.javascript.rhino.IR.name(((java.lang.String)v16));
    Object v18 = ((com.google.javascript.rhino.Node)v15).useSourceInfoFromForTree(((com.google.javascript.rhino.Node)v17));
    Object v19 = ",";
    Object v20 = com.google.javascript.rhino.IR.name(((java.lang.String)v19));
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v6),((com.google.javascript.rhino.Node)v15),((com.google.javascript.rhino.Node)v20));
    Object v21 = null;
    org.junit.Assert.assertNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "tvhis";
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
  public void test94() throws Throwable {
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
    Object v11 = ",";
    Object v12 = com.google.javascript.rhino.IR.name(((java.lang.String)v11));
    Object v13 = ((com.google.javascript.rhino.Node)v12).cloneNode();
    Object v14 = ",";
    Object v15 = com.google.javascript.rhino.IR.name(((java.lang.String)v14));
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v1).visit(((com.google.javascript.jscomp.NodeTraversal)v10),((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "tvhis";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = ",";
    Object v10 = com.google.javascript.rhino.IR.name(((java.lang.String)v9));
    Object v11 = ",";
    Object v12 = com.google.javascript.rhino.IR.name(((java.lang.String)v11));
    Object v13 = ((com.google.javascript.rhino.Node)v10).srcrefTree(((com.google.javascript.rhino.Node)v12));
    Object v14 = ",";
    Object v15 = com.google.javascript.rhino.IR.name(((java.lang.String)v14));
    Object v16 = ((com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback)v4).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v15));
    org.junit.Assert.assertEquals((Object)(true), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "tvhis";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = ",";
    Object v10 = com.google.javascript.rhino.IR.name(((java.lang.String)v9));
    Object v11 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v12 = "";
    Object v13 = "R";
    Object v14 = com.google.javascript.jscomp.DiagnosticType.error(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = new java.lang.String[]{","};
    Object v16 = ((com.google.javascript.jscomp.NodeTraversal)v8).makeError(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.CheckLevel)v11),((com.google.javascript.jscomp.DiagnosticType)v14),((java.lang.String[])v15));
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v4).enterScope(((com.google.javascript.jscomp.NodeTraversal)v8));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = ",";
    Object v3 = com.google.javascript.rhino.IR.name(((java.lang.String)v2));
    Object v4 = ",";
    Object v5 = com.google.javascript.rhino.IR.name(((java.lang.String)v4));
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v1).process(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.Node)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "tvhis";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = ",";
    Object v10 = com.google.javascript.rhino.IR.name(((java.lang.String)v9));
    Object v11 = ",";
    Object v12 = com.google.javascript.rhino.IR.name(((java.lang.String)v11));
    Object v13 = ((com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback)v4).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v12));
    org.junit.Assert.assertEquals((Object)(true), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "tvhis";
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
    Object v14 = ",";
    Object v15 = com.google.javascript.rhino.IR.name(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = "R";
    Object v18 = com.google.javascript.jscomp.DiagnosticType.error(((java.lang.String)v16),((java.lang.String)v17));
    Object v19 = new java.lang.String[]{"prototype"};
    Object v20 = ((com.google.javascript.jscomp.NodeTraversal)v13).makeError(((com.google.javascript.rhino.Node)v15),((com.google.javascript.jscomp.DiagnosticType)v18),((java.lang.String[])v19));
    ((com.google.javascript.jscomp.FlowSensitiveInlineVariables)v4).enterScope(((com.google.javascript.jscomp.NodeTraversal)v13));
    Object v21 = null;
    org.junit.Assert.assertNull(v21);
  }
}
