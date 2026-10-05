package com.google.javascript.jscomp;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v0));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v0));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6),((com.google.javascript.jscomp.ScopeCreator)v8));
    Object v10 = 1;
    Object v11 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v10).intValue()));
    Object v12 = 1;
    Object v13 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v12).intValue()));
    ((com.google.javascript.jscomp.CheckAccessControls)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v9),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6),((com.google.javascript.jscomp.ScopeCreator)v8));
    ((com.google.javascript.jscomp.CheckAccessControls)v2).exitScope(((com.google.javascript.jscomp.NodeTraversal)v9));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Compiler();
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = ((com.google.javascript.jscomp.AbstractCompiler)v12).getErrorManager();
    Object v14 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v15 = new com.google.javascript.jscomp.Compiler();
    Object v16 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v15));
    Object v17 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v11),((com.google.javascript.jscomp.NodeTraversal.Callback)v14),((com.google.javascript.jscomp.ScopeCreator)v16));
    Object v18 = 1;
    Object v19 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v18).intValue()));
    Object v20 = 1;
    Object v21 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v20).intValue()));
    ((com.google.javascript.jscomp.CheckAccessControls)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v17),((com.google.javascript.rhino.Node)v19),((com.google.javascript.rhino.Node)v21));
    Object v22 = null;
    org.junit.Assert.assertNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6),((com.google.javascript.jscomp.ScopeCreator)v8));
    Object v10 = 1;
    Object v11 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v10).intValue()));
    Object v12 = 50;
    ((com.google.javascript.rhino.Node)v11).setType((((java.lang.Integer)v12).intValue()));
    Object v13 = null;
    Object v14 = 1;
    Object v15 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v14).intValue()));
    ((com.google.javascript.jscomp.CheckAccessControls)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v9),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6),((com.google.javascript.jscomp.ScopeCreator)v8));
    ((com.google.javascript.jscomp.CheckAccessControls)v2).exitScope(((com.google.javascript.jscomp.NodeTraversal)v9));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Compiler();
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = ((com.google.javascript.jscomp.AbstractCompiler)v12).getErrorManager();
    Object v14 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v15 = new com.google.javascript.jscomp.Compiler();
    Object v16 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v15));
    Object v17 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v11),((com.google.javascript.jscomp.NodeTraversal.Callback)v14),((com.google.javascript.jscomp.ScopeCreator)v16));
    Object v18 = 1;
    Object v19 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v18).intValue()));
    Object v20 = new com.google.javascript.rhino.JSDocInfo();
    ((com.google.javascript.rhino.Node)v19).setJSDocInfo(((com.google.javascript.rhino.JSDocInfo)v20));
    Object v21 = null;
    Object v22 = 1;
    Object v23 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v22).intValue()));
    ((com.google.javascript.jscomp.CheckAccessControls)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v17),((com.google.javascript.rhino.Node)v19),((com.google.javascript.rhino.Node)v23));
    Object v24 = null;
    org.junit.Assert.assertNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6),((com.google.javascript.jscomp.ScopeCreator)v8));
    Object v10 = 0;
    Object v11 = new java.util.ArrayList((((java.lang.Integer)v10).intValue()));
    ((com.google.javascript.jscomp.NodeTraversal)v9).traverseRoots(((java.util.List)v11));
    Object v12 = null;
    ((com.google.javascript.jscomp.CheckAccessControls)v2).enterScope(((com.google.javascript.jscomp.NodeTraversal)v9));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6),((com.google.javascript.jscomp.ScopeCreator)v8));
    ((com.google.javascript.jscomp.CheckAccessControls)v2).exitScope(((com.google.javascript.jscomp.NodeTraversal)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = 1;
    Object v4 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v3).intValue()));
    Object v5 = 1;
    Object v6 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v5).intValue()));
    ((com.google.javascript.jscomp.CheckAccessControls)v2).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v6));
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.Compiler();
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = ((com.google.javascript.jscomp.AbstractCompiler)v9).getErrorManager();
    Object v11 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v9));
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v8),((com.google.javascript.jscomp.NodeTraversal.Callback)v11),((com.google.javascript.jscomp.ScopeCreator)v13));
    ((com.google.javascript.jscomp.CheckAccessControls)v2).exitScope(((com.google.javascript.jscomp.NodeTraversal)v14));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6),((com.google.javascript.jscomp.ScopeCreator)v8));
    ((com.google.javascript.jscomp.CheckAccessControls)v2).enterScope(((com.google.javascript.jscomp.NodeTraversal)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = 1;
    Object v4 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v3).intValue()));
    Object v5 = 1;
    Object v6 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v5).intValue()));
    ((com.google.javascript.jscomp.CheckAccessControls)v2).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6),((com.google.javascript.jscomp.ScopeCreator)v8));
    Object v10 = 1;
    Object v11 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v10).intValue()));
    Object v12 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v13 = "prefix must start with o\\e of: ";
    Object v14 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v15 = "q";
    Object v16 = com.google.javascript.jscomp.DiagnosticType.make(((java.lang.String)v13),((com.google.javascript.jscomp.CheckLevel)v14),((java.lang.String)v15));
    Object v17 = new java.lang.String[]{"V","runCustomPasses",""};
    Object v18 = ((com.google.javascript.jscomp.NodeTraversal)v9).makeError(((com.google.javascript.rhino.Node)v11),((com.google.javascript.jscomp.CheckLevel)v12),((com.google.javascript.jscomp.DiagnosticType)v16),((java.lang.String[])v17));
    ((com.google.javascript.jscomp.CheckAccessControls)v2).exitScope(((com.google.javascript.jscomp.NodeTraversal)v9));
    Object v19 = null;
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6),((com.google.javascript.jscomp.ScopeCreator)v8));
    ((com.google.javascript.jscomp.CheckAccessControls)v2).exitScope(((com.google.javascript.jscomp.NodeTraversal)v9));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Compiler();
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = ((com.google.javascript.jscomp.AbstractCompiler)v12).getErrorManager();
    Object v14 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v15 = new com.google.javascript.jscomp.Compiler();
    Object v16 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v15));
    Object v17 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v11),((com.google.javascript.jscomp.NodeTraversal.Callback)v14),((com.google.javascript.jscomp.ScopeCreator)v16));
    Object v18 = ((com.google.javascript.jscomp.NodeTraversal)v17).getEnclosingFunction();
    ((com.google.javascript.jscomp.CheckAccessControls)v2).exitScope(((com.google.javascript.jscomp.NodeTraversal)v17));
    Object v19 = null;
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v0));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6),((com.google.javascript.jscomp.ScopeCreator)v8));
    ((com.google.javascript.jscomp.CheckAccessControls)v2).exitScope(((com.google.javascript.jscomp.NodeTraversal)v9));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Compiler();
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = ((com.google.javascript.jscomp.AbstractCompiler)v12).getErrorManager();
    Object v14 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v15 = new com.google.javascript.jscomp.Compiler();
    Object v16 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v15));
    Object v17 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v11),((com.google.javascript.jscomp.NodeTraversal.Callback)v14),((com.google.javascript.jscomp.ScopeCreator)v16));
    ((com.google.javascript.jscomp.CheckAccessControls)v2).exitScope(((com.google.javascript.jscomp.NodeTraversal)v17));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6),((com.google.javascript.jscomp.ScopeCreator)v8));
    ((com.google.javascript.jscomp.CheckAccessControls)v2).enterScope(((com.google.javascript.jscomp.NodeTraversal)v9));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Compiler();
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = ((com.google.javascript.jscomp.AbstractCompiler)v12).getErrorManager();
    Object v14 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v15 = new com.google.javascript.jscomp.Compiler();
    Object v16 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v15));
    Object v17 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v11),((com.google.javascript.jscomp.NodeTraversal.Callback)v14),((com.google.javascript.jscomp.ScopeCreator)v16));
    ((com.google.javascript.jscomp.CheckAccessControls)v2).exitScope(((com.google.javascript.jscomp.NodeTraversal)v17));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6),((com.google.javascript.jscomp.ScopeCreator)v8));
    Object v10 = 1;
    Object v11 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v10).intValue()));
    Object v12 = 1;
    Object v13 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v12).intValue()));
    Object v14 = 0;
    ((com.google.javascript.rhino.Node)v13).setLineno((((java.lang.Integer)v14).intValue()));
    Object v15 = null;
    ((com.google.javascript.jscomp.CheckAccessControls)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v9),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v13));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6),((com.google.javascript.jscomp.ScopeCreator)v8));
    Object v10 = 1;
    Object v11 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v10).intValue()));
    Object v12 = "prefix must start with o\\e of: ";
    Object v13 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v14 = "q";
    Object v15 = com.google.javascript.jscomp.DiagnosticType.make(((java.lang.String)v12),((com.google.javascript.jscomp.CheckLevel)v13),((java.lang.String)v14));
    Object v16 = new java.lang.String[]{"[","/** BegKin line maps. **/","*"};
    Object v17 = ((com.google.javascript.jscomp.NodeTraversal)v9).makeError(((com.google.javascript.rhino.Node)v11),((com.google.javascript.jscomp.DiagnosticType)v15),((java.lang.String[])v16));
    ((com.google.javascript.jscomp.CheckAccessControls)v2).enterScope(((com.google.javascript.jscomp.NodeTraversal)v9));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6),((com.google.javascript.jscomp.ScopeCreator)v8));
    Object v10 = 1;
    Object v11 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v10).intValue()));
    Object v12 = 1;
    Object v13 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v12).intValue()));
    Object v14 = -42;
    ((com.google.javascript.rhino.Node)v13).setType((((java.lang.Integer)v14).intValue()));
    Object v15 = null;
    ((com.google.javascript.jscomp.CheckAccessControls)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v9),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v13));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6),((com.google.javascript.jscomp.ScopeCreator)v8));
    ((com.google.javascript.jscomp.CheckAccessControls)v2).exitScope(((com.google.javascript.jscomp.NodeTraversal)v9));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Compiler();
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = ((com.google.javascript.jscomp.AbstractCompiler)v12).getErrorManager();
    Object v14 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v15 = new com.google.javascript.jscomp.Compiler();
    Object v16 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v15));
    Object v17 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v11),((com.google.javascript.jscomp.NodeTraversal.Callback)v14),((com.google.javascript.jscomp.ScopeCreator)v16));
    Object v18 = 1;
    Object v19 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v18).intValue()));
    ((com.google.javascript.jscomp.NodeTraversal)v17).traverse(((com.google.javascript.rhino.Node)v19));
    Object v20 = null;
    ((com.google.javascript.jscomp.CheckAccessControls)v2).enterScope(((com.google.javascript.jscomp.NodeTraversal)v17));
    Object v21 = null;
    org.junit.Assert.assertNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = 1;
    Object v4 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v3).intValue()));
    ((com.google.javascript.jscomp.CheckAccessControls)v2).hotSwapScript(((com.google.javascript.rhino.Node)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = 1;
    Object v4 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v3).intValue()));
    Object v5 = 1;
    Object v6 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v5).intValue()));
    ((com.google.javascript.jscomp.CheckAccessControls)v2).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v6));
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.Compiler();
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = ((com.google.javascript.jscomp.AbstractCompiler)v9).getErrorManager();
    Object v11 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v9));
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v8),((com.google.javascript.jscomp.NodeTraversal.Callback)v11),((com.google.javascript.jscomp.ScopeCreator)v13));
    ((com.google.javascript.jscomp.CheckAccessControls)v2).enterScope(((com.google.javascript.jscomp.NodeTraversal)v14));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6),((com.google.javascript.jscomp.ScopeCreator)v8));
    Object v10 = 1;
    Object v11 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v10).intValue()));
    Object v12 = 1;
    Object v13 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v12).intValue()));
    Object v14 = ((com.google.javascript.jscomp.CheckAccessControls)v2).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v9),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v13));
    org.junit.Assert.assertEquals((Object)(true), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6),((com.google.javascript.jscomp.ScopeCreator)v8));
    Object v10 = 1;
    Object v11 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v10).intValue()));
    ((com.google.javascript.jscomp.NodeTraversal)v9).traverse(((com.google.javascript.rhino.Node)v11));
    Object v12 = null;
    ((com.google.javascript.jscomp.CheckAccessControls)v2).enterScope(((com.google.javascript.jscomp.NodeTraversal)v9));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6),((com.google.javascript.jscomp.ScopeCreator)v8));
    Object v10 = 1;
    Object v11 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v10).intValue()));
    Object v12 = 1;
    Object v13 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v12).intValue()));
    ((com.google.javascript.jscomp.CheckAccessControls)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v9),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
    Object v15 = 1;
    Object v16 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v15).intValue()));
    Object v17 = 1;
    Object v18 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v17).intValue()));
    ((com.google.javascript.jscomp.CheckAccessControls)v2).process(((com.google.javascript.rhino.Node)v16),((com.google.javascript.rhino.Node)v18));
    Object v19 = null;
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6),((com.google.javascript.jscomp.ScopeCreator)v8));
    Object v10 = 1;
    Object v11 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v10).intValue()));
    Object v12 = 1;
    Object v13 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v12).intValue()));
    Object v14 = 1;
    Object v15 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v14).intValue()));
    ((com.google.javascript.rhino.Node)v13).addChildToFront(((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
    ((com.google.javascript.jscomp.CheckAccessControls)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v9),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v13));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6),((com.google.javascript.jscomp.ScopeCreator)v8));
    Object v10 = 1;
    Object v11 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v10).intValue()));
    Object v12 = "prefix must start with o\\e of: ";
    Object v13 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v14 = "q";
    Object v15 = com.google.javascript.jscomp.DiagnosticType.make(((java.lang.String)v12),((com.google.javascript.jscomp.CheckLevel)v13),((java.lang.String)v14));
    Object v16 = new java.lang.String[]{"prtotype","",";"};
    Object v17 = ((com.google.javascript.jscomp.NodeTraversal)v9).makeError(((com.google.javascript.rhino.Node)v11),((com.google.javascript.jscomp.DiagnosticType)v15),((java.lang.String[])v16));
    ((com.google.javascript.jscomp.CheckAccessControls)v2).enterScope(((com.google.javascript.jscomp.NodeTraversal)v9));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6),((com.google.javascript.jscomp.ScopeCreator)v8));
    Object v10 = 1;
    Object v11 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v10).intValue()));
    Object v12 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v13 = "prefix must start with o\\e of: ";
    Object v14 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v15 = "q";
    Object v16 = com.google.javascript.jscomp.DiagnosticType.make(((java.lang.String)v13),((com.google.javascript.jscomp.CheckLevel)v14),((java.lang.String)v15));
    Object v17 = new java.lang.String[]{};
    Object v18 = ((com.google.javascript.jscomp.NodeTraversal)v9).makeError(((com.google.javascript.rhino.Node)v11),((com.google.javascript.jscomp.CheckLevel)v12),((com.google.javascript.jscomp.DiagnosticType)v16),((java.lang.String[])v17));
    Object v19 = 1;
    Object v20 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v19).intValue()));
    Object v21 = 1;
    Object v22 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v21).intValue()));
    ((com.google.javascript.jscomp.CheckAccessControls)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v9),((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.Node)v22));
    Object v23 = null;
    org.junit.Assert.assertNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6),((com.google.javascript.jscomp.ScopeCreator)v8));
    Object v10 = 1;
    Object v11 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v10).intValue()));
    Object v12 = "prefix must start with o\\e of: ";
    Object v13 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v14 = "q";
    Object v15 = com.google.javascript.jscomp.DiagnosticType.make(((java.lang.String)v12),((com.google.javascript.jscomp.CheckLevel)v13),((java.lang.String)v14));
    Object v16 = new java.lang.String[]{};
    Object v17 = ((com.google.javascript.jscomp.NodeTraversal)v9).makeError(((com.google.javascript.rhino.Node)v11),((com.google.javascript.jscomp.DiagnosticType)v15),((java.lang.String[])v16));
    Object v18 = 1;
    Object v19 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v18).intValue()));
    Object v20 = 1;
    Object v21 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v20).intValue()));
    ((com.google.javascript.jscomp.CheckAccessControls)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v9),((com.google.javascript.rhino.Node)v19),((com.google.javascript.rhino.Node)v21));
    Object v22 = null;
    org.junit.Assert.assertNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6),((com.google.javascript.jscomp.ScopeCreator)v8));
    Object v10 = 1;
    Object v11 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v10).intValue()));
    Object v12 = 1;
    Object v13 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v12).intValue()));
    Object v14 = false;
    ((com.google.javascript.rhino.Node)v13).setWasEmptyNode((((java.lang.Boolean)v14).booleanValue()));
    Object v15 = null;
    ((com.google.javascript.jscomp.CheckAccessControls)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v9),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v13));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6),((com.google.javascript.jscomp.ScopeCreator)v8));
    Object v10 = 1;
    Object v11 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v10).intValue()));
    Object v12 = 1;
    Object v13 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v12).intValue()));
    Object v14 = true;
    ((com.google.javascript.rhino.Node)v13).setIsSyntheticBlock((((java.lang.Boolean)v14).booleanValue()));
    Object v15 = null;
    ((com.google.javascript.jscomp.CheckAccessControls)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v9),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v13));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6),((com.google.javascript.jscomp.ScopeCreator)v8));
    ((com.google.javascript.jscomp.CheckAccessControls)v2).enterScope(((com.google.javascript.jscomp.NodeTraversal)v9));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Compiler();
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = ((com.google.javascript.jscomp.AbstractCompiler)v12).getErrorManager();
    Object v14 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v15 = new com.google.javascript.jscomp.Compiler();
    Object v16 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v15));
    Object v17 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v11),((com.google.javascript.jscomp.NodeTraversal.Callback)v14),((com.google.javascript.jscomp.ScopeCreator)v16));
    ((com.google.javascript.jscomp.CheckAccessControls)v2).enterScope(((com.google.javascript.jscomp.NodeTraversal)v17));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6),((com.google.javascript.jscomp.ScopeCreator)v8));
    Object v10 = 1;
    Object v11 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v10).intValue()));
    Object v12 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v13 = "prefix must start with o\\e of: ";
    Object v14 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v15 = "q";
    Object v16 = com.google.javascript.jscomp.DiagnosticType.make(((java.lang.String)v13),((com.google.javascript.jscomp.CheckLevel)v14),((java.lang.String)v15));
    Object v17 = new java.lang.String[]{""};
    Object v18 = ((com.google.javascript.jscomp.NodeTraversal)v9).makeError(((com.google.javascript.rhino.Node)v11),((com.google.javascript.jscomp.CheckLevel)v12),((com.google.javascript.jscomp.DiagnosticType)v16),((java.lang.String[])v17));
    ((com.google.javascript.jscomp.CheckAccessControls)v2).enterScope(((com.google.javascript.jscomp.NodeTraversal)v9));
    Object v19 = null;
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6),((com.google.javascript.jscomp.ScopeCreator)v8));
    Object v10 = 1;
    Object v11 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v10).intValue()));
    Object v12 = 1;
    Object v13 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v12).intValue()));
    Object v14 = 1;
    Object v15 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v14).intValue()));
    Object v16 = ((com.google.javascript.rhino.Node)v13).copyInformationFrom(((com.google.javascript.rhino.Node)v15));
    Object v17 = ((com.google.javascript.jscomp.CheckAccessControls)v2).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v9),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v13));
    org.junit.Assert.assertEquals((Object)(true), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = 1;
    Object v4 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v3).intValue()));
    Object v5 = 1;
    Object v6 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v5).intValue()));
    Object v7 = 1;
    ((com.google.javascript.rhino.Node)v6).setSourcePositionForTree((((java.lang.Integer)v7).intValue()));
    Object v8 = null;
    ((com.google.javascript.jscomp.CheckAccessControls)v2).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v6));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6),((com.google.javascript.jscomp.ScopeCreator)v8));
    Object v10 = 1;
    Object v11 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v10).intValue()));
    Object v12 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v13 = "prefix must start with o\\e of: ";
    Object v14 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v15 = "q";
    Object v16 = com.google.javascript.jscomp.DiagnosticType.make(((java.lang.String)v13),((com.google.javascript.jscomp.CheckLevel)v14),((java.lang.String)v15));
    Object v17 = new java.lang.String[]{"","",""};
    Object v18 = ((com.google.javascript.jscomp.NodeTraversal)v9).makeError(((com.google.javascript.rhino.Node)v11),((com.google.javascript.jscomp.CheckLevel)v12),((com.google.javascript.jscomp.DiagnosticType)v16),((java.lang.String[])v17));
    ((com.google.javascript.jscomp.CheckAccessControls)v2).exitScope(((com.google.javascript.jscomp.NodeTraversal)v9));
    Object v19 = null;
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6),((com.google.javascript.jscomp.ScopeCreator)v8));
    Object v10 = 1;
    Object v11 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v10).intValue()));
    Object v12 = 1;
    Object v13 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v12).intValue()));
    Object v14 = ((com.google.javascript.rhino.Node)v11).isEquivalentTo(((com.google.javascript.rhino.Node)v13));
    Object v15 = 1;
    Object v16 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v15).intValue()));
    ((com.google.javascript.jscomp.CheckAccessControls)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v9),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v16));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = 1;
    Object v4 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v3).intValue()));
    ((com.google.javascript.jscomp.CheckAccessControls)v2).hotSwapScript(((com.google.javascript.rhino.Node)v4));
    Object v5 = null;
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = ((com.google.javascript.jscomp.AbstractCompiler)v7).getErrorManager();
    Object v9 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v10 = new com.google.javascript.jscomp.Compiler();
    Object v11 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v12 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.NodeTraversal.Callback)v9),((com.google.javascript.jscomp.ScopeCreator)v11));
    Object v13 = ((com.google.javascript.jscomp.NodeTraversal)v12).getScope();
    Object v14 = 1;
    Object v15 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v14).intValue()));
    Object v16 = 1;
    Object v17 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v16).intValue()));
    ((com.google.javascript.jscomp.CheckAccessControls)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v12),((com.google.javascript.rhino.Node)v15),((com.google.javascript.rhino.Node)v17));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6),((com.google.javascript.jscomp.ScopeCreator)v8));
    Object v10 = 1;
    Object v11 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v10).intValue()));
    Object v12 = 1;
    Object v13 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v12).intValue()));
    ((com.google.javascript.rhino.Node)v11).addChildToBack(((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
    Object v15 = 1;
    Object v16 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v15).intValue()));
    ((com.google.javascript.jscomp.CheckAccessControls)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v9),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v16));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6),((com.google.javascript.jscomp.ScopeCreator)v8));
    ((com.google.javascript.jscomp.CheckAccessControls)v2).exitScope(((com.google.javascript.jscomp.NodeTraversal)v9));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Compiler();
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = ((com.google.javascript.jscomp.AbstractCompiler)v12).getErrorManager();
    Object v14 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v15 = new com.google.javascript.jscomp.Compiler();
    Object v16 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v15));
    Object v17 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v11),((com.google.javascript.jscomp.NodeTraversal.Callback)v14),((com.google.javascript.jscomp.ScopeCreator)v16));
    Object v18 = ((com.google.javascript.jscomp.NodeTraversal)v17).getScope();
    ((com.google.javascript.jscomp.CheckAccessControls)v2).exitScope(((com.google.javascript.jscomp.NodeTraversal)v17));
    Object v19 = null;
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = 1;
    Object v4 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v3).intValue()));
    Object v5 = 1;
    Object v6 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v5).intValue()));
    ((com.google.javascript.jscomp.CheckAccessControls)v2).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v6));
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.Compiler();
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = ((com.google.javascript.jscomp.AbstractCompiler)v9).getErrorManager();
    Object v11 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v9));
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v8),((com.google.javascript.jscomp.NodeTraversal.Callback)v11),((com.google.javascript.jscomp.ScopeCreator)v13));
    Object v15 = ((com.google.javascript.jscomp.NodeTraversal)v14).getScope();
    ((com.google.javascript.jscomp.CheckAccessControls)v2).exitScope(((com.google.javascript.jscomp.NodeTraversal)v14));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = 1;
    Object v4 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v3).intValue()));
    ((com.google.javascript.jscomp.CheckAccessControls)v2).hotSwapScript(((com.google.javascript.rhino.Node)v4));
    Object v5 = null;
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = ((com.google.javascript.jscomp.AbstractCompiler)v7).getErrorManager();
    Object v9 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v10 = new com.google.javascript.jscomp.Compiler();
    Object v11 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v12 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.NodeTraversal.Callback)v9),((com.google.javascript.jscomp.ScopeCreator)v11));
    ((com.google.javascript.jscomp.CheckAccessControls)v2).enterScope(((com.google.javascript.jscomp.NodeTraversal)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6),((com.google.javascript.jscomp.ScopeCreator)v8));
    ((com.google.javascript.jscomp.CheckAccessControls)v2).enterScope(((com.google.javascript.jscomp.NodeTraversal)v9));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Compiler();
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = ((com.google.javascript.jscomp.AbstractCompiler)v12).getErrorManager();
    Object v14 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v15 = new com.google.javascript.jscomp.Compiler();
    Object v16 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v15));
    Object v17 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v11),((com.google.javascript.jscomp.NodeTraversal.Callback)v14),((com.google.javascript.jscomp.ScopeCreator)v16));
    Object v18 = ((com.google.javascript.jscomp.NodeTraversal)v17).getEnclosingFunction();
    Object v19 = 1;
    Object v20 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v19).intValue()));
    Object v21 = 1;
    Object v22 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v21).intValue()));
    ((com.google.javascript.jscomp.CheckAccessControls)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v17),((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.Node)v22));
    Object v23 = null;
    org.junit.Assert.assertNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6),((com.google.javascript.jscomp.ScopeCreator)v8));
    Object v10 = 1;
    Object v11 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v10).intValue()));
    Object v12 = "prefix must start with o\\e of: ";
    Object v13 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v14 = "q";
    Object v15 = com.google.javascript.jscomp.DiagnosticType.make(((java.lang.String)v12),((com.google.javascript.jscomp.CheckLevel)v13),((java.lang.String)v14));
    Object v16 = new java.lang.String[]{};
    Object v17 = ((com.google.javascript.jscomp.NodeTraversal)v9).makeError(((com.google.javascript.rhino.Node)v11),((com.google.javascript.jscomp.DiagnosticType)v15),((java.lang.String[])v16));
    ((com.google.javascript.jscomp.CheckAccessControls)v2).enterScope(((com.google.javascript.jscomp.NodeTraversal)v9));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6),((com.google.javascript.jscomp.ScopeCreator)v8));
    Object v10 = new com.google.javascript.rhino.Node[]{};
    ((com.google.javascript.jscomp.NodeTraversal)v9).traverseRoots(((com.google.javascript.rhino.Node[])v10));
    Object v11 = null;
    Object v12 = 1;
    Object v13 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v12).intValue()));
    Object v14 = 1;
    Object v15 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v14).intValue()));
    ((com.google.javascript.jscomp.CheckAccessControls)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v9),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = 1;
    Object v4 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v3).intValue()));
    ((com.google.javascript.jscomp.CheckAccessControls)v2).hotSwapScript(((com.google.javascript.rhino.Node)v4));
    Object v5 = null;
    Object v6 = 1;
    Object v7 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v6).intValue()));
    ((com.google.javascript.jscomp.CheckAccessControls)v2).hotSwapScript(((com.google.javascript.rhino.Node)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6),((com.google.javascript.jscomp.ScopeCreator)v8));
    Object v10 = ((com.google.javascript.jscomp.NodeTraversal)v9).hasScope();
    Object v11 = 1;
    Object v12 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v11).intValue()));
    Object v13 = 1;
    Object v14 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v13).intValue()));
    Object v15 = 1;
    Object v16 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v15).intValue()));
    ((com.google.javascript.rhino.Node)v14).addChildrenToFront(((com.google.javascript.rhino.Node)v16));
    Object v17 = null;
    ((com.google.javascript.jscomp.CheckAccessControls)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v9),((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v14));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6),((com.google.javascript.jscomp.ScopeCreator)v8));
    Object v10 = 1;
    Object v11 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v10).intValue()));
    Object v12 = 1;
    Object v13 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v12).intValue()));
    Object v14 = ((com.google.javascript.rhino.Node)v13).toString();
    ((com.google.javascript.jscomp.CheckAccessControls)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v9),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v13));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6),((com.google.javascript.jscomp.ScopeCreator)v8));
    Object v10 = 0;
    Object v11 = new java.util.ArrayList((((java.lang.Integer)v10).intValue()));
    ((com.google.javascript.jscomp.NodeTraversal)v9).traverseRoots(((java.util.List)v11));
    Object v12 = null;
    Object v13 = 1;
    Object v14 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v13).intValue()));
    Object v15 = 0;
    ((com.google.javascript.rhino.Node)v14).setType((((java.lang.Integer)v15).intValue()));
    Object v16 = null;
    Object v17 = 1;
    Object v18 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v17).intValue()));
    ((com.google.javascript.jscomp.CheckAccessControls)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v9),((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.Node)v18));
    Object v19 = null;
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6),((com.google.javascript.jscomp.ScopeCreator)v8));
    ((com.google.javascript.jscomp.CheckAccessControls)v2).exitScope(((com.google.javascript.jscomp.NodeTraversal)v9));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Compiler();
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = ((com.google.javascript.jscomp.AbstractCompiler)v12).getErrorManager();
    Object v14 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v15 = new com.google.javascript.jscomp.Compiler();
    Object v16 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v15));
    Object v17 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v11),((com.google.javascript.jscomp.NodeTraversal.Callback)v14),((com.google.javascript.jscomp.ScopeCreator)v16));
    Object v18 = 1;
    Object v19 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v18).intValue()));
    Object v20 = 1;
    Object v21 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v20).intValue()));
    Object v22 = ((com.google.javascript.rhino.Node)v19).isEquivalentTo(((com.google.javascript.rhino.Node)v21));
    Object v23 = 1;
    Object v24 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v23).intValue()));
    ((com.google.javascript.jscomp.CheckAccessControls)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v17),((com.google.javascript.rhino.Node)v19),((com.google.javascript.rhino.Node)v24));
    Object v25 = null;
    org.junit.Assert.assertNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = 1;
    Object v4 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v3).intValue()));
    ((com.google.javascript.jscomp.CheckAccessControls)v2).hotSwapScript(((com.google.javascript.rhino.Node)v4));
    Object v5 = null;
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = ((com.google.javascript.jscomp.AbstractCompiler)v7).getErrorManager();
    Object v9 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v10 = new com.google.javascript.jscomp.Compiler();
    Object v11 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v12 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.NodeTraversal.Callback)v9),((com.google.javascript.jscomp.ScopeCreator)v11));
    Object v13 = 1;
    Object v14 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v13).intValue()));
    Object v15 = 1;
    Object v16 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v15).intValue()));
    ((com.google.javascript.jscomp.CheckAccessControls)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v12),((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.Node)v16));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6),((com.google.javascript.jscomp.ScopeCreator)v8));
    Object v10 = 1;
    Object v11 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v10).intValue()));
    Object v12 = ((com.google.javascript.rhino.Node)v11).toString();
    Object v13 = 1;
    Object v14 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v13).intValue()));
    Object v15 = ((com.google.javascript.rhino.Node)v14).toString();
    ((com.google.javascript.jscomp.CheckAccessControls)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v9),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v14));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6),((com.google.javascript.jscomp.ScopeCreator)v8));
    Object v10 = 1;
    Object v11 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v10).intValue()));
    Object v12 = 1;
    Object v13 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v12).intValue()));
    ((com.google.javascript.jscomp.CheckAccessControls)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v9),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
    Object v15 = new com.google.javascript.jscomp.Compiler();
    Object v16 = new com.google.javascript.jscomp.Compiler();
    Object v17 = ((com.google.javascript.jscomp.AbstractCompiler)v16).getErrorManager();
    Object v18 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v16));
    Object v19 = new com.google.javascript.jscomp.Compiler();
    Object v20 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v19));
    Object v21 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v15),((com.google.javascript.jscomp.NodeTraversal.Callback)v18),((com.google.javascript.jscomp.ScopeCreator)v20));
    ((com.google.javascript.jscomp.CheckAccessControls)v2).enterScope(((com.google.javascript.jscomp.NodeTraversal)v21));
    Object v22 = null;
    org.junit.Assert.assertNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = 1;
    Object v4 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v3).intValue()));
    ((com.google.javascript.jscomp.CheckAccessControls)v2).hotSwapScript(((com.google.javascript.rhino.Node)v4));
    Object v5 = null;
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = ((com.google.javascript.jscomp.AbstractCompiler)v7).getErrorManager();
    Object v9 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v10 = new com.google.javascript.jscomp.Compiler();
    Object v11 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v12 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.NodeTraversal.Callback)v9),((com.google.javascript.jscomp.ScopeCreator)v11));
    ((com.google.javascript.jscomp.CheckAccessControls)v2).exitScope(((com.google.javascript.jscomp.NodeTraversal)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6),((com.google.javascript.jscomp.ScopeCreator)v8));
    Object v10 = 1;
    Object v11 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v10).intValue()));
    ((com.google.javascript.jscomp.NodeTraversal)v9).traverse(((com.google.javascript.rhino.Node)v11));
    Object v12 = null;
    ((com.google.javascript.jscomp.CheckAccessControls)v2).exitScope(((com.google.javascript.jscomp.NodeTraversal)v9));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6),((com.google.javascript.jscomp.ScopeCreator)v8));
    Object v10 = 1;
    Object v11 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v10).intValue()));
    Object v12 = false;
    ((com.google.javascript.rhino.Node)v11).setIsSyntheticBlock((((java.lang.Boolean)v12).booleanValue()));
    Object v13 = null;
    Object v14 = 1;
    Object v15 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v14).intValue()));
    ((com.google.javascript.jscomp.CheckAccessControls)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v9),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6),((com.google.javascript.jscomp.ScopeCreator)v8));
    Object v10 = 1;
    Object v11 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v10).intValue()));
    Object v12 = "prefix must start with o\\e of: ";
    Object v13 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v14 = "q";
    Object v15 = com.google.javascript.jscomp.DiagnosticType.make(((java.lang.String)v12),((com.google.javascript.jscomp.CheckLevel)v13),((java.lang.String)v14));
    Object v16 = new java.lang.String[]{};
    Object v17 = ((com.google.javascript.jscomp.NodeTraversal)v9).makeError(((com.google.javascript.rhino.Node)v11),((com.google.javascript.jscomp.DiagnosticType)v15),((java.lang.String[])v16));
    ((com.google.javascript.jscomp.CheckAccessControls)v2).exitScope(((com.google.javascript.jscomp.NodeTraversal)v9));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6),((com.google.javascript.jscomp.ScopeCreator)v8));
    Object v10 = ((com.google.javascript.jscomp.NodeTraversal)v9).getEnclosingFunction();
    ((com.google.javascript.jscomp.CheckAccessControls)v2).exitScope(((com.google.javascript.jscomp.NodeTraversal)v9));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6),((com.google.javascript.jscomp.ScopeCreator)v8));
    Object v10 = 1;
    Object v11 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v10).intValue()));
    Object v12 = 1;
    Object v13 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v12).intValue()));
    ((com.google.javascript.jscomp.CheckAccessControls)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v9),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
    Object v15 = new com.google.javascript.jscomp.Compiler();
    Object v16 = new com.google.javascript.jscomp.Compiler();
    Object v17 = ((com.google.javascript.jscomp.AbstractCompiler)v16).getErrorManager();
    Object v18 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v16));
    Object v19 = new com.google.javascript.jscomp.Compiler();
    Object v20 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v19));
    Object v21 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v15),((com.google.javascript.jscomp.NodeTraversal.Callback)v18),((com.google.javascript.jscomp.ScopeCreator)v20));
    Object v22 = 1;
    Object v23 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v22).intValue()));
    Object v24 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v25 = "prefix must start with o\\e of: ";
    Object v26 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v27 = "q";
    Object v28 = com.google.javascript.jscomp.DiagnosticType.make(((java.lang.String)v25),((com.google.javascript.jscomp.CheckLevel)v26),((java.lang.String)v27));
    Object v29 = new java.lang.String[]{"","eval"};
    Object v30 = ((com.google.javascript.jscomp.NodeTraversal)v21).makeError(((com.google.javascript.rhino.Node)v23),((com.google.javascript.jscomp.CheckLevel)v24),((com.google.javascript.jscomp.DiagnosticType)v28),((java.lang.String[])v29));
    Object v31 = 1;
    Object v32 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v31).intValue()));
    Object v33 = 1;
    Object v34 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v33).intValue()));
    ((com.google.javascript.jscomp.CheckAccessControls)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v21),((com.google.javascript.rhino.Node)v32),((com.google.javascript.rhino.Node)v34));
    Object v35 = null;
    org.junit.Assert.assertNull(v35);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6),((com.google.javascript.jscomp.ScopeCreator)v8));
    Object v10 = 1;
    Object v11 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v10).intValue()));
    Object v12 = 1;
    Object v13 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v12).intValue()));
    Object v14 = ((com.google.javascript.rhino.Node)v11).isEquivalentToTyped(((com.google.javascript.rhino.Node)v13));
    Object v15 = 1;
    Object v16 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v15).intValue()));
    ((com.google.javascript.jscomp.CheckAccessControls)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v9),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v16));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6),((com.google.javascript.jscomp.ScopeCreator)v8));
    ((com.google.javascript.jscomp.CheckAccessControls)v2).exitScope(((com.google.javascript.jscomp.NodeTraversal)v9));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Compiler();
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = ((com.google.javascript.jscomp.AbstractCompiler)v12).getErrorManager();
    Object v14 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v15 = new com.google.javascript.jscomp.Compiler();
    Object v16 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v15));
    Object v17 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v11),((com.google.javascript.jscomp.NodeTraversal.Callback)v14),((com.google.javascript.jscomp.ScopeCreator)v16));
    ((com.google.javascript.jscomp.CheckAccessControls)v2).enterScope(((com.google.javascript.jscomp.NodeTraversal)v17));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6),((com.google.javascript.jscomp.ScopeCreator)v8));
    Object v10 = ((com.google.javascript.jscomp.NodeTraversal)v9).hasScope();
    Object v11 = 1;
    Object v12 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v11).intValue()));
    Object v13 = 1;
    Object v14 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v13).intValue()));
    ((com.google.javascript.jscomp.CheckAccessControls)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v9),((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v14));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6),((com.google.javascript.jscomp.ScopeCreator)v8));
    Object v10 = 1;
    Object v11 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v10).intValue()));
    Object v12 = 0;
    Object v13 = "prefix must start with o\\e of: ";
    Object v14 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v15 = "q";
    Object v16 = com.google.javascript.jscomp.DiagnosticType.make(((java.lang.String)v13),((com.google.javascript.jscomp.CheckLevel)v14),((java.lang.String)v15));
    ((com.google.javascript.rhino.Node)v11).putProp((((java.lang.Integer)v12).intValue()),((java.lang.Object)v16));
    Object v17 = null;
    Object v18 = 1;
    Object v19 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v18).intValue()));
    ((com.google.javascript.jscomp.CheckAccessControls)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v9),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v19));
    Object v20 = null;
    org.junit.Assert.assertNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6),((com.google.javascript.jscomp.ScopeCreator)v8));
    Object v10 = ((com.google.javascript.jscomp.NodeTraversal)v9).getScope();
    ((com.google.javascript.jscomp.CheckAccessControls)v2).enterScope(((com.google.javascript.jscomp.NodeTraversal)v9));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6),((com.google.javascript.jscomp.ScopeCreator)v8));
    Object v10 = 1;
    Object v11 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v10).intValue()));
    Object v12 = true;
    ((com.google.javascript.rhino.Node)v11).setWasEmptyNode((((java.lang.Boolean)v12).booleanValue()));
    Object v13 = null;
    Object v14 = 1;
    Object v15 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v14).intValue()));
    ((com.google.javascript.jscomp.CheckAccessControls)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v9),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6),((com.google.javascript.jscomp.ScopeCreator)v8));
    ((com.google.javascript.jscomp.CheckAccessControls)v2).exitScope(((com.google.javascript.jscomp.NodeTraversal)v9));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Compiler();
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = ((com.google.javascript.jscomp.AbstractCompiler)v12).getErrorManager();
    Object v14 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v15 = new com.google.javascript.jscomp.Compiler();
    Object v16 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v15));
    Object v17 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v11),((com.google.javascript.jscomp.NodeTraversal.Callback)v14),((com.google.javascript.jscomp.ScopeCreator)v16));
    Object v18 = 1;
    Object v19 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v18).intValue()));
    Object v20 = 1;
    Object v21 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v20).intValue()));
    Object v22 = ((com.google.javascript.rhino.Node)v21).getQualifiedName();
    ((com.google.javascript.jscomp.CheckAccessControls)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v17),((com.google.javascript.rhino.Node)v19),((com.google.javascript.rhino.Node)v21));
    Object v23 = null;
    org.junit.Assert.assertNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6),((com.google.javascript.jscomp.ScopeCreator)v8));
    Object v10 = 1;
    Object v11 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v10).intValue()));
    ((com.google.javascript.jscomp.NodeTraversal)v9).traverse(((com.google.javascript.rhino.Node)v11));
    Object v12 = null;
    Object v13 = 1;
    Object v14 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v13).intValue()));
    Object v15 = 1;
    Object v16 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v15).intValue()));
    ((com.google.javascript.jscomp.CheckAccessControls)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v9),((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.Node)v16));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6),((com.google.javascript.jscomp.ScopeCreator)v8));
    Object v10 = 1;
    Object v11 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v10).intValue()));
    Object v12 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v13 = "prefix must start with o\\e of: ";
    Object v14 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v15 = "q";
    Object v16 = com.google.javascript.jscomp.DiagnosticType.make(((java.lang.String)v13),((com.google.javascript.jscomp.CheckLevel)v14),((java.lang.String)v15));
    Object v17 = new java.lang.String[]{};
    Object v18 = ((com.google.javascript.jscomp.NodeTraversal)v9).makeError(((com.google.javascript.rhino.Node)v11),((com.google.javascript.jscomp.CheckLevel)v12),((com.google.javascript.jscomp.DiagnosticType)v16),((java.lang.String[])v17));
    Object v19 = 1;
    Object v20 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v19).intValue()));
    Object v21 = 1;
    Object v22 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v21).intValue()));
    Object v23 = ((com.google.javascript.jscomp.CheckAccessControls)v2).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v9),((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.Node)v22));
    org.junit.Assert.assertEquals((Object)(true), v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6),((com.google.javascript.jscomp.ScopeCreator)v8));
    Object v10 = 1;
    Object v11 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v10).intValue()));
    Object v12 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v13 = "prefix must start with o\\e of: ";
    Object v14 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v15 = "q";
    Object v16 = com.google.javascript.jscomp.DiagnosticType.make(((java.lang.String)v13),((com.google.javascript.jscomp.CheckLevel)v14),((java.lang.String)v15));
    Object v17 = new java.lang.String[]{"a"," -> ","the \"argume"};
    Object v18 = ((com.google.javascript.jscomp.NodeTraversal)v9).makeError(((com.google.javascript.rhino.Node)v11),((com.google.javascript.jscomp.CheckLevel)v12),((com.google.javascript.jscomp.DiagnosticType)v16),((java.lang.String[])v17));
    Object v19 = 1;
    Object v20 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v19).intValue()));
    Object v21 = 1;
    Object v22 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v21).intValue()));
    ((com.google.javascript.jscomp.CheckAccessControls)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v9),((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.Node)v22));
    Object v23 = null;
    org.junit.Assert.assertNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = 1;
    Object v4 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v3).intValue()));
    ((com.google.javascript.jscomp.CheckAccessControls)v2).hotSwapScript(((com.google.javascript.rhino.Node)v4));
    Object v5 = null;
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = ((com.google.javascript.jscomp.AbstractCompiler)v7).getErrorManager();
    Object v9 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v10 = new com.google.javascript.jscomp.Compiler();
    Object v11 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v12 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.NodeTraversal.Callback)v9),((com.google.javascript.jscomp.ScopeCreator)v11));
    Object v13 = 1;
    Object v14 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v13).intValue()));
    Object v15 = 1;
    Object v16 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v15).intValue()));
    Object v17 = true;
    ((com.google.javascript.rhino.Node)v16).setOptionalArg((((java.lang.Boolean)v17).booleanValue()));
    Object v18 = null;
    ((com.google.javascript.jscomp.CheckAccessControls)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v12),((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.Node)v16));
    Object v19 = null;
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6),((com.google.javascript.jscomp.ScopeCreator)v8));
    Object v10 = 1;
    Object v11 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v10).intValue()));
    Object v12 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v13 = "prefix must start with o\\e of: ";
    Object v14 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v15 = "q";
    Object v16 = com.google.javascript.jscomp.DiagnosticType.make(((java.lang.String)v13),((com.google.javascript.jscomp.CheckLevel)v14),((java.lang.String)v15));
    Object v17 = new java.lang.String[]{};
    Object v18 = ((com.google.javascript.jscomp.NodeTraversal)v9).makeError(((com.google.javascript.rhino.Node)v11),((com.google.javascript.jscomp.CheckLevel)v12),((com.google.javascript.jscomp.DiagnosticType)v16),((java.lang.String[])v17));
    ((com.google.javascript.jscomp.CheckAccessControls)v2).exitScope(((com.google.javascript.jscomp.NodeTraversal)v9));
    Object v19 = null;
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6),((com.google.javascript.jscomp.ScopeCreator)v8));
    Object v10 = 1;
    Object v11 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v10).intValue()));
    Object v12 = ((com.google.javascript.rhino.Node)v11).getAncestors();
    Object v13 = 1;
    Object v14 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v13).intValue()));
    ((com.google.javascript.jscomp.CheckAccessControls)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v9),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v14));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6),((com.google.javascript.jscomp.ScopeCreator)v8));
    Object v10 = 1;
    Object v11 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v10).intValue()));
    Object v12 = 1;
    Object v13 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v12).intValue()));
    ((com.google.javascript.jscomp.CheckAccessControls)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v9),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
    Object v15 = new com.google.javascript.jscomp.Compiler();
    Object v16 = new com.google.javascript.jscomp.Compiler();
    Object v17 = ((com.google.javascript.jscomp.AbstractCompiler)v16).getErrorManager();
    Object v18 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v16));
    Object v19 = new com.google.javascript.jscomp.Compiler();
    Object v20 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v19));
    Object v21 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v15),((com.google.javascript.jscomp.NodeTraversal.Callback)v18),((com.google.javascript.jscomp.ScopeCreator)v20));
    Object v22 = 1;
    Object v23 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v22).intValue()));
    Object v24 = 1;
    Object v25 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v24).intValue()));
    ((com.google.javascript.jscomp.CheckAccessControls)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v21),((com.google.javascript.rhino.Node)v23),((com.google.javascript.rhino.Node)v25));
    Object v26 = null;
    org.junit.Assert.assertNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = 1;
    Object v4 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v3).intValue()));
    Object v5 = 1;
    Object v6 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v5).intValue()));
    ((com.google.javascript.jscomp.CheckAccessControls)v2).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v6));
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.Compiler();
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = ((com.google.javascript.jscomp.AbstractCompiler)v9).getErrorManager();
    Object v11 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v9));
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v8),((com.google.javascript.jscomp.NodeTraversal.Callback)v11),((com.google.javascript.jscomp.ScopeCreator)v13));
    Object v15 = 1;
    Object v16 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v15).intValue()));
    Object v17 = 1;
    Object v18 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v17).intValue()));
    ((com.google.javascript.jscomp.CheckAccessControls)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v14),((com.google.javascript.rhino.Node)v16),((com.google.javascript.rhino.Node)v18));
    Object v19 = null;
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6),((com.google.javascript.jscomp.ScopeCreator)v8));
    Object v10 = 1;
    Object v11 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v10).intValue()));
    Object v12 = 1;
    Object v13 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v12).intValue()));
    Object v14 = true;
    ((com.google.javascript.rhino.Node)v13).setVarArgs((((java.lang.Boolean)v14).booleanValue()));
    Object v15 = null;
    ((com.google.javascript.jscomp.CheckAccessControls)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v9),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v13));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = 1;
    Object v4 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v3).intValue()));
    ((com.google.javascript.jscomp.CheckAccessControls)v2).hotSwapScript(((com.google.javascript.rhino.Node)v4));
    Object v5 = null;
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = ((com.google.javascript.jscomp.AbstractCompiler)v7).getErrorManager();
    Object v9 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v10 = new com.google.javascript.jscomp.Compiler();
    Object v11 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v12 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.NodeTraversal.Callback)v9),((com.google.javascript.jscomp.ScopeCreator)v11));
    Object v13 = 0;
    Object v14 = new java.util.ArrayList((((java.lang.Integer)v13).intValue()));
    ((com.google.javascript.jscomp.NodeTraversal)v12).traverseRoots(((java.util.List)v14));
    Object v15 = null;
    Object v16 = 1;
    Object v17 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v16).intValue()));
    Object v18 = 1;
    Object v19 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v18).intValue()));
    ((com.google.javascript.jscomp.CheckAccessControls)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v12),((com.google.javascript.rhino.Node)v17),((com.google.javascript.rhino.Node)v19));
    Object v20 = null;
    org.junit.Assert.assertNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6),((com.google.javascript.jscomp.ScopeCreator)v8));
    ((com.google.javascript.jscomp.CheckAccessControls)v2).exitScope(((com.google.javascript.jscomp.NodeTraversal)v9));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Compiler();
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = ((com.google.javascript.jscomp.AbstractCompiler)v12).getErrorManager();
    Object v14 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v15 = new com.google.javascript.jscomp.Compiler();
    Object v16 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v15));
    Object v17 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v11),((com.google.javascript.jscomp.NodeTraversal.Callback)v14),((com.google.javascript.jscomp.ScopeCreator)v16));
    Object v18 = 1;
    Object v19 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v18).intValue()));
    Object v20 = "prefix must start with o\\e of: ";
    Object v21 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v22 = "q";
    Object v23 = com.google.javascript.jscomp.DiagnosticType.make(((java.lang.String)v20),((com.google.javascript.jscomp.CheckLevel)v21),((java.lang.String)v22));
    Object v24 = new java.lang.String[]{"v"};
    Object v25 = ((com.google.javascript.jscomp.NodeTraversal)v17).makeError(((com.google.javascript.rhino.Node)v19),((com.google.javascript.jscomp.DiagnosticType)v23),((java.lang.String[])v24));
    ((com.google.javascript.jscomp.CheckAccessControls)v2).exitScope(((com.google.javascript.jscomp.NodeTraversal)v17));
    Object v26 = null;
    org.junit.Assert.assertNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6),((com.google.javascript.jscomp.ScopeCreator)v8));
    Object v10 = 1;
    Object v11 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v10).intValue()));
    Object v12 = "prefix must start with o\\e of: ";
    Object v13 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v14 = "q";
    Object v15 = com.google.javascript.jscomp.DiagnosticType.make(((java.lang.String)v12),((com.google.javascript.jscomp.CheckLevel)v13),((java.lang.String)v14));
    Object v16 = new java.lang.String[]{"ENUM_INIT_KEYS",""};
    Object v17 = ((com.google.javascript.jscomp.NodeTraversal)v9).makeError(((com.google.javascript.rhino.Node)v11),((com.google.javascript.jscomp.DiagnosticType)v15),((java.lang.String[])v16));
    ((com.google.javascript.jscomp.CheckAccessControls)v2).enterScope(((com.google.javascript.jscomp.NodeTraversal)v9));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6),((com.google.javascript.jscomp.ScopeCreator)v8));
    Object v10 = 1;
    Object v11 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v10).intValue()));
    Object v12 = 1;
    Object v13 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v12).intValue()));
    Object v14 = 1;
    Object v15 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v14).intValue()));
    Object v16 = new com.google.javascript.rhino.Node.SideEffectFlags();
    Object v17 = java.util.Set.of(((java.lang.Object)v15),((java.lang.Object)v16));
    ((com.google.javascript.rhino.Node)v13).setDirectives(((java.util.Set)v17));
    Object v18 = null;
    ((com.google.javascript.jscomp.CheckAccessControls)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v9),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v13));
    Object v19 = null;
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6),((com.google.javascript.jscomp.ScopeCreator)v8));
    Object v10 = 1;
    Object v11 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v10).intValue()));
    Object v12 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v13 = "prefix must start with o\\e of: ";
    Object v14 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v15 = "q";
    Object v16 = com.google.javascript.jscomp.DiagnosticType.make(((java.lang.String)v13),((com.google.javascript.jscomp.CheckLevel)v14),((java.lang.String)v15));
    Object v17 = new java.lang.String[]{"funct","INHERIT_DOC"};
    Object v18 = ((com.google.javascript.jscomp.NodeTraversal)v9).makeError(((com.google.javascript.rhino.Node)v11),((com.google.javascript.jscomp.CheckLevel)v12),((com.google.javascript.jscomp.DiagnosticType)v16),((java.lang.String[])v17));
    ((com.google.javascript.jscomp.CheckAccessControls)v2).exitScope(((com.google.javascript.jscomp.NodeTraversal)v9));
    Object v19 = null;
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6),((com.google.javascript.jscomp.ScopeCreator)v8));
    Object v10 = ((com.google.javascript.jscomp.NodeTraversal)v9).getEnclosingFunction();
    Object v11 = 1;
    Object v12 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v11).intValue()));
    Object v13 = 1;
    Object v14 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v13).intValue()));
    Object v15 = ((com.google.javascript.jscomp.CheckAccessControls)v2).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v9),((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v14));
    org.junit.Assert.assertEquals((Object)(true), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6),((com.google.javascript.jscomp.ScopeCreator)v8));
    Object v10 = 1;
    Object v11 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v10).intValue()));
    Object v12 = 0;
    Object v13 = new com.google.javascript.jscomp.DefaultCodingConvention();
    ((com.google.javascript.rhino.Node)v11).putProp((((java.lang.Integer)v12).intValue()),((java.lang.Object)v13));
    Object v14 = null;
    Object v15 = 1;
    Object v16 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v15).intValue()));
    ((com.google.javascript.jscomp.CheckAccessControls)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v9),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v16));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6),((com.google.javascript.jscomp.ScopeCreator)v8));
    Object v10 = ((com.google.javascript.jscomp.NodeTraversal)v9).getScope();
    Object v11 = 1;
    Object v12 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v11).intValue()));
    Object v13 = 1;
    Object v14 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v13).intValue()));
    Object v15 = new com.google.javascript.rhino.JSDocInfo();
    ((com.google.javascript.rhino.Node)v14).setJSDocInfo(((com.google.javascript.rhino.JSDocInfo)v15));
    Object v16 = null;
    ((com.google.javascript.jscomp.CheckAccessControls)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v9),((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v14));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6),((com.google.javascript.jscomp.ScopeCreator)v8));
    Object v10 = 0;
    Object v11 = new java.util.ArrayList((((java.lang.Integer)v10).intValue()));
    ((com.google.javascript.jscomp.NodeTraversal)v9).traverseRoots(((java.util.List)v11));
    Object v12 = null;
    ((com.google.javascript.jscomp.CheckAccessControls)v2).exitScope(((com.google.javascript.jscomp.NodeTraversal)v9));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6),((com.google.javascript.jscomp.ScopeCreator)v8));
    Object v10 = 1;
    Object v11 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v10).intValue()));
    Object v12 = 1;
    Object v13 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v12).intValue()));
    Object v14 = 0;
    Object v15 = ((com.google.javascript.rhino.Node)v13).getAncestor((((java.lang.Integer)v14).intValue()));
    ((com.google.javascript.jscomp.CheckAccessControls)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v9),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v13));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6),((com.google.javascript.jscomp.ScopeCreator)v8));
    Object v10 = ((com.google.javascript.jscomp.NodeTraversal)v9).getScope();
    Object v11 = 1;
    Object v12 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v11).intValue()));
    Object v13 = 1;
    Object v14 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v13).intValue()));
    ((com.google.javascript.jscomp.CheckAccessControls)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v9),((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v14));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6),((com.google.javascript.jscomp.ScopeCreator)v8));
    Object v10 = ((com.google.javascript.jscomp.NodeTraversal)v9).hasScope();
    ((com.google.javascript.jscomp.CheckAccessControls)v2).exitScope(((com.google.javascript.jscomp.NodeTraversal)v9));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6),((com.google.javascript.jscomp.ScopeCreator)v8));
    Object v10 = 1;
    Object v11 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v10).intValue()));
    Object v12 = ((com.google.javascript.rhino.Node)v11).isUnscopedQualifiedName();
    Object v13 = 1;
    Object v14 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v13).intValue()));
    Object v15 = 1;
    Object v16 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v15).intValue()));
    Object v17 = ((com.google.javascript.rhino.Node)v14).copyInformationFrom(((com.google.javascript.rhino.Node)v16));
    ((com.google.javascript.jscomp.CheckAccessControls)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v9),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v14));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6),((com.google.javascript.jscomp.ScopeCreator)v8));
    Object v10 = 1;
    Object v11 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v10).intValue()));
    Object v12 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v13 = "prefix must start with o\\e of: ";
    Object v14 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v15 = "q";
    Object v16 = com.google.javascript.jscomp.DiagnosticType.make(((java.lang.String)v13),((com.google.javascript.jscomp.CheckLevel)v14),((java.lang.String)v15));
    Object v17 = new java.lang.String[]{"#"};
    Object v18 = ((com.google.javascript.jscomp.NodeTraversal)v9).makeError(((com.google.javascript.rhino.Node)v11),((com.google.javascript.jscomp.CheckLevel)v12),((com.google.javascript.jscomp.DiagnosticType)v16),((java.lang.String[])v17));
    Object v19 = 1;
    Object v20 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v19).intValue()));
    Object v21 = 1;
    Object v22 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v21).intValue()));
    Object v23 = ((com.google.javascript.jscomp.CheckAccessControls)v2).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v9),((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.Node)v22));
    org.junit.Assert.assertEquals((Object)(true), v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6),((com.google.javascript.jscomp.ScopeCreator)v8));
    Object v10 = 1;
    Object v11 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v10).intValue()));
    Object v12 = new java.io.StringWriter();
    ((com.google.javascript.rhino.Node)v11).appendStringTree(((java.lang.Appendable)v12));
    Object v13 = null;
    Object v14 = 1;
    Object v15 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v14).intValue()));
    Object v16 = 1;
    Object v17 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v16).intValue()));
    Object v18 = ((com.google.javascript.rhino.Node)v15).copyInformationFromForTree(((com.google.javascript.rhino.Node)v17));
    ((com.google.javascript.jscomp.CheckAccessControls)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v9),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v15));
    Object v19 = null;
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6),((com.google.javascript.jscomp.ScopeCreator)v8));
    Object v10 = 1;
    Object v11 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v10).intValue()));
    Object v12 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v13 = "prefix must start with o\\e of: ";
    Object v14 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v15 = "q";
    Object v16 = com.google.javascript.jscomp.DiagnosticType.make(((java.lang.String)v13),((com.google.javascript.jscomp.CheckLevel)v14),((java.lang.String)v15));
    Object v17 = new java.lang.String[]{" * @ret"};
    Object v18 = ((com.google.javascript.jscomp.NodeTraversal)v9).makeError(((com.google.javascript.rhino.Node)v11),((com.google.javascript.jscomp.CheckLevel)v12),((com.google.javascript.jscomp.DiagnosticType)v16),((java.lang.String[])v17));
    Object v19 = 1;
    Object v20 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v19).intValue()));
    Object v21 = 1;
    Object v22 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v21).intValue()));
    Object v23 = ((com.google.javascript.rhino.Node)v20).isEquivalentToTyped(((com.google.javascript.rhino.Node)v22));
    Object v24 = 1;
    Object v25 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v24).intValue()));
    Object v26 = ((com.google.javascript.rhino.Node)v25).getJsDocBuilderForNode();
    ((com.google.javascript.jscomp.CheckAccessControls)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v9),((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.Node)v25));
    Object v27 = null;
    org.junit.Assert.assertNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6),((com.google.javascript.jscomp.ScopeCreator)v8));
    ((com.google.javascript.jscomp.CheckAccessControls)v2).enterScope(((com.google.javascript.jscomp.NodeTraversal)v9));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Compiler();
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = ((com.google.javascript.jscomp.AbstractCompiler)v12).getErrorManager();
    Object v14 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v15 = new com.google.javascript.jscomp.Compiler();
    Object v16 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v15));
    Object v17 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v11),((com.google.javascript.jscomp.NodeTraversal.Callback)v14),((com.google.javascript.jscomp.ScopeCreator)v16));
    Object v18 = 1;
    Object v19 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v18).intValue()));
    Object v20 = 1;
    Object v21 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v20).intValue()));
    ((com.google.javascript.jscomp.CheckAccessControls)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v17),((com.google.javascript.rhino.Node)v19),((com.google.javascript.rhino.Node)v21));
    Object v22 = null;
    org.junit.Assert.assertNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6),((com.google.javascript.jscomp.ScopeCreator)v8));
    Object v10 = ((com.google.javascript.jscomp.NodeTraversal)v9).hasScope();
    ((com.google.javascript.jscomp.CheckAccessControls)v2).enterScope(((com.google.javascript.jscomp.NodeTraversal)v9));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6),((com.google.javascript.jscomp.ScopeCreator)v8));
    ((com.google.javascript.jscomp.CheckAccessControls)v2).exitScope(((com.google.javascript.jscomp.NodeTraversal)v9));
    Object v10 = null;
    Object v11 = 1;
    Object v12 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v11).intValue()));
    Object v13 = 1;
    Object v14 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v13).intValue()));
    Object v15 = ((com.google.javascript.rhino.Node)v12).isEquivalentTo(((com.google.javascript.rhino.Node)v14));
    Object v16 = 1;
    Object v17 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v16).intValue()));
    ((com.google.javascript.jscomp.CheckAccessControls)v2).process(((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v17));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6),((com.google.javascript.jscomp.ScopeCreator)v8));
    Object v10 = 1;
    Object v11 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v10).intValue()));
    Object v12 = 1;
    Object v13 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v12).intValue()));
    Object v14 = null;
    ((com.google.javascript.rhino.Node)v13).setJSType(((com.google.javascript.rhino.jstype.JSType)v14));
    Object v15 = null;
    Object v16 = ((com.google.javascript.jscomp.CheckAccessControls)v2).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v9),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v13));
    org.junit.Assert.assertEquals((Object)(true), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = 1;
    Object v4 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v3).intValue()));
    Object v5 = 1;
    Object v6 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v5).intValue()));
    ((com.google.javascript.jscomp.CheckAccessControls)v2).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v6));
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.Compiler();
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = ((com.google.javascript.jscomp.AbstractCompiler)v9).getErrorManager();
    Object v11 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v9));
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v8),((com.google.javascript.jscomp.NodeTraversal.Callback)v11),((com.google.javascript.jscomp.ScopeCreator)v13));
    Object v15 = 1;
    Object v16 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v15).intValue()));
    Object v17 = ((com.google.javascript.rhino.Node)v16).getQualifiedName();
    Object v18 = 1;
    Object v19 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v18).intValue()));
    Object v20 = 1;
    Object v21 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v20).intValue()));
    Object v22 = ((com.google.javascript.rhino.Node)v19).isEquivalentTo(((com.google.javascript.rhino.Node)v21));
    ((com.google.javascript.jscomp.CheckAccessControls)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v14),((com.google.javascript.rhino.Node)v16),((com.google.javascript.rhino.Node)v19));
    Object v23 = null;
    org.junit.Assert.assertNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6),((com.google.javascript.jscomp.ScopeCreator)v8));
    Object v10 = 1;
    Object v11 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v10).intValue()));
    Object v12 = 1;
    Object v13 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v12).intValue()));
    Object v14 = ((com.google.javascript.rhino.Node)v13).cloneNode();
    ((com.google.javascript.jscomp.CheckAccessControls)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v9),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v13));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6),((com.google.javascript.jscomp.ScopeCreator)v8));
    Object v10 = 1;
    Object v11 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v10).intValue()));
    Object v12 = 1;
    Object v13 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v12).intValue()));
    Object v14 = 9;
    Object v15 = 1;
    ((com.google.javascript.rhino.Node)v13).putIntProp((((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v16 = null;
    ((com.google.javascript.jscomp.CheckAccessControls)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v9),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v13));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6),((com.google.javascript.jscomp.ScopeCreator)v8));
    Object v10 = 0;
    Object v11 = new java.util.ArrayList((((java.lang.Integer)v10).intValue()));
    ((com.google.javascript.jscomp.NodeTraversal)v9).traverseRoots(((java.util.List)v11));
    Object v12 = null;
    Object v13 = 1;
    Object v14 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v13).intValue()));
    Object v15 = 1;
    Object v16 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v15).intValue()));
    Object v17 = ((com.google.javascript.rhino.Node)v14).isEquivalentTo(((com.google.javascript.rhino.Node)v16));
    Object v18 = 1;
    Object v19 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v18).intValue()));
    ((com.google.javascript.jscomp.CheckAccessControls)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v9),((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.Node)v19));
    Object v20 = null;
    org.junit.Assert.assertNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = ((com.google.javascript.jscomp.AbstractCompiler)v4).getErrorManager();
    Object v6 = new com.google.javascript.jscomp.CheckAccessControls(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6),((com.google.javascript.jscomp.ScopeCreator)v8));
    Object v10 = 1;
    Object v11 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v10).intValue()));
    Object v12 = ((com.google.javascript.rhino.Node)v11).children();
    Object v13 = 1;
    Object v14 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v13).intValue()));
    ((com.google.javascript.jscomp.CheckAccessControls)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v9),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v14));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }
}
