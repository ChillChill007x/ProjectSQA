package com.google.javascript.jscomp;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v2 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v2));
    Object v4 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v1),((com.google.javascript.rhino.jstype.JSTypeRegistry)v3));
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v8 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6),((com.google.javascript.jscomp.CheckLevel)v7));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v2 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v2));
    Object v4 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v1),((com.google.javascript.rhino.jstype.JSTypeRegistry)v3));
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.google.javascript.jscomp.Compiler();
    Object v2 = new com.google.javascript.jscomp.PrepareAst.PrepareAnnotations();
    Object v3 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v1),((com.google.javascript.jscomp.NodeTraversal.Callback)v2));
    Object v4 = null;
    Object v5 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v4));
    Object v6 = ")";
    Object v7 = "";
    Object v8 = com.google.javascript.jscomp.DiagnosticType.warning(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = new java.lang.String[]{"u","L"};
    Object v10 = ((com.google.javascript.jscomp.NodeTraversal)v3).makeError(((com.google.javascript.rhino.Node)v5),((com.google.javascript.jscomp.DiagnosticType)v8),((java.lang.String[])v9));
    Object v11 = null;
    Object v12 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v11));
    Object v13 = 9;
    ((com.google.javascript.rhino.Node)v12).removeProp((((java.lang.Integer)v13).intValue()));
    Object v14 = null;
    Object v15 = null;
    Object v16 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v15));
    Object v17 = ((com.google.javascript.jscomp.TypeCheck)v0).visitName(((com.google.javascript.jscomp.NodeTraversal)v3),((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v16));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v2 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v2));
    Object v4 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v1),((com.google.javascript.rhino.jstype.JSTypeRegistry)v3));
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = "";
    Object v8 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v6).getTypesWithProperty(((java.lang.String)v7));
    Object v9 = null;
    Object v10 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v9));
    Object v11 = com.google.javascript.jscomp.Scope.createLatticeBottom(((com.google.javascript.rhino.Node)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = new com.google.javascript.jscomp.MemoizedScopeCreator(((com.google.javascript.jscomp.ScopeCreator)v13));
    Object v15 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v16 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6),((com.google.javascript.jscomp.Scope)v11),((com.google.javascript.jscomp.MemoizedScopeCreator)v14),((com.google.javascript.jscomp.CheckLevel)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = new com.google.javascript.jscomp.PrepareAst.PrepareAnnotations();
    Object v11 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.NodeTraversal.Callback)v10));
    Object v12 = null;
    Object v13 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v12));
    Object v14 = null;
    Object v15 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v14));
    Object v16 = ((com.google.javascript.jscomp.TypeCheck)v8).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v11),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v15));
    org.junit.Assert.assertEquals((Object)(true), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = new com.google.javascript.jscomp.PrepareAst.PrepareAnnotations();
    Object v11 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.NodeTraversal.Callback)v10));
    Object v12 = null;
    Object v13 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v12));
    Object v14 = null;
    Object v15 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v14));
    Object v16 = null;
    Object v17 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v16));
    Object v18 = ((com.google.javascript.rhino.Node)v15).srcref(((com.google.javascript.rhino.Node)v17));
    Object v19 = ((com.google.javascript.jscomp.TypeCheck)v8).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v11),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v15));
    org.junit.Assert.assertEquals((Object)(true), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = new com.google.javascript.jscomp.PrepareAst.PrepareAnnotations();
    Object v11 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.NodeTraversal.Callback)v10));
    Object v12 = null;
    Object v13 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v12));
    Object v14 = null;
    Object v15 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v14));
    Object v16 = ((com.google.javascript.jscomp.TypeCheck)v8).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v11),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler();
    Object v18 = new com.google.javascript.jscomp.PrepareAst.PrepareAnnotations();
    Object v19 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v17),((com.google.javascript.jscomp.NodeTraversal.Callback)v18));
    Object v20 = null;
    Object v21 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v20));
    Object v22 = null;
    Object v23 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v22));
    Object v24 = ((com.google.javascript.jscomp.TypeCheck)v8).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v19),((com.google.javascript.rhino.Node)v21),((com.google.javascript.rhino.Node)v23));
    org.junit.Assert.assertEquals((Object)(true), v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = new com.google.javascript.jscomp.PrepareAst.PrepareAnnotations();
    Object v11 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.NodeTraversal.Callback)v10));
    Object v12 = ((com.google.javascript.jscomp.NodeTraversal)v11).getEnclosingFunction();
    Object v13 = null;
    Object v14 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v13));
    Object v15 = null;
    Object v16 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v15));
    Object v17 = ((com.google.javascript.rhino.Node)v16).getDirectives();
    ((com.google.javascript.jscomp.TypeCheck)v8).visit(((com.google.javascript.jscomp.NodeTraversal)v11),((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.Node)v16));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = new com.google.javascript.jscomp.PrepareAst.PrepareAnnotations();
    Object v11 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.NodeTraversal.Callback)v10));
    Object v12 = ((com.google.javascript.jscomp.NodeTraversal)v11).hasScope();
    Object v13 = null;
    Object v14 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v13));
    Object v15 = null;
    Object v16 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v15));
    Object v17 = ((com.google.javascript.jscomp.TypeCheck)v8).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v11),((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.Node)v16));
    org.junit.Assert.assertEquals((Object)(true), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = ((com.google.javascript.jscomp.TypeCheck)v8).getTypedPercent();
    org.junit.Assert.assertEquals((Object)(0.0D), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = null;
    Object v10 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v9));
    Object v11 = null;
    Object v12 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v11));
    ((com.google.javascript.jscomp.TypeCheck)v8).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v2 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v2));
    Object v4 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v1),((com.google.javascript.rhino.jstype.JSTypeRegistry)v3));
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v8 = ((java.lang.Enum)v7).hashCode();
    Object v9 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6),((com.google.javascript.jscomp.CheckLevel)v7));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = null;
    Object v10 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v9));
    Object v11 = true;
    ((com.google.javascript.jscomp.TypeCheck)v8).check(((com.google.javascript.rhino.Node)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = new com.google.javascript.jscomp.PrepareAst.PrepareAnnotations();
    Object v11 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.NodeTraversal.Callback)v10));
    Object v12 = null;
    Object v13 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v12));
    Object v14 = null;
    Object v15 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v14));
    Object v16 = ((com.google.javascript.jscomp.TypeCheck)v8).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v11),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v15));
    Object v17 = null;
    Object v18 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v17));
    Object v19 = ((com.google.javascript.rhino.Node)v18).getAncestors();
    Object v20 = true;
    ((com.google.javascript.jscomp.TypeCheck)v8).check(((com.google.javascript.rhino.Node)v18),(((java.lang.Boolean)v20).booleanValue()));
    Object v21 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = new com.google.javascript.jscomp.PrepareAst.PrepareAnnotations();
    Object v11 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.NodeTraversal.Callback)v10));
    Object v12 = null;
    Object v13 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v12));
    Object v14 = null;
    Object v15 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v14));
    Object v16 = ((com.google.javascript.jscomp.TypeCheck)v8).visitName(((com.google.javascript.jscomp.NodeTraversal)v11),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v15));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v2 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v2));
    Object v4 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v1),((com.google.javascript.rhino.jstype.JSTypeRegistry)v3));
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = null;
    Object v8 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v7));
    Object v9 = com.google.javascript.jscomp.Scope.createLatticeBottom(((com.google.javascript.rhino.Node)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler();
    Object v11 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v12 = new com.google.javascript.jscomp.MemoizedScopeCreator(((com.google.javascript.jscomp.ScopeCreator)v11));
    Object v13 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v14 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6),((com.google.javascript.jscomp.Scope)v9),((com.google.javascript.jscomp.MemoizedScopeCreator)v12),((com.google.javascript.jscomp.CheckLevel)v13));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = new com.google.javascript.jscomp.PrepareAst.PrepareAnnotations();
    Object v11 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.NodeTraversal.Callback)v10));
    Object v12 = null;
    Object v13 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v12));
    Object v14 = null;
    Object v15 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v14));
    Object v16 = 1;
    Object v17 = ((com.google.javascript.rhino.Node)v15).getProp((((java.lang.Integer)v16).intValue()));
    Object v18 = ((com.google.javascript.jscomp.TypeCheck)v8).visitName(((com.google.javascript.jscomp.NodeTraversal)v11),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v15));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = null;
    Object v10 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v9));
    Object v11 = null;
    Object v12 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v11));
    Object v13 = ((com.google.javascript.jscomp.TypeCheck)v8).processForTesting(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v12));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = new com.google.javascript.jscomp.PrepareAst.PrepareAnnotations();
    Object v11 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.NodeTraversal.Callback)v10));
    Object v12 = null;
    Object v13 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v12));
    Object v14 = null;
    Object v15 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v14));
    ((com.google.javascript.jscomp.TypeCheck)v8).visit(((com.google.javascript.jscomp.NodeTraversal)v11),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
    Object v17 = new com.google.javascript.jscomp.Compiler();
    Object v18 = new com.google.javascript.jscomp.PrepareAst.PrepareAnnotations();
    Object v19 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v17),((com.google.javascript.jscomp.NodeTraversal.Callback)v18));
    Object v20 = ((com.google.javascript.jscomp.NodeTraversal)v19).getEnclosingFunction();
    Object v21 = null;
    Object v22 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v21));
    Object v23 = null;
    Object v24 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v23));
    Object v25 = ((com.google.javascript.jscomp.TypeCheck)v8).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v19),((com.google.javascript.rhino.Node)v22),((com.google.javascript.rhino.Node)v24));
    org.junit.Assert.assertEquals((Object)(true), v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = null;
    Object v10 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v9));
    Object v11 = false;
    ((com.google.javascript.jscomp.TypeCheck)v8).check(((com.google.javascript.rhino.Node)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = new com.google.javascript.jscomp.PrepareAst.PrepareAnnotations();
    Object v11 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.NodeTraversal.Callback)v10));
    Object v12 = null;
    Object v13 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v12));
    Object v14 = null;
    Object v15 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v14));
    ((com.google.javascript.jscomp.TypeCheck)v8).visit(((com.google.javascript.jscomp.NodeTraversal)v11),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = new com.google.javascript.jscomp.PrepareAst.PrepareAnnotations();
    Object v11 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.NodeTraversal.Callback)v10));
    Object v12 = null;
    Object v13 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v12));
    Object v14 = null;
    Object v15 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v14));
    ((com.google.javascript.jscomp.TypeCheck)v8).visit(((com.google.javascript.jscomp.NodeTraversal)v11),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
    Object v17 = null;
    Object v18 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v17));
    Object v19 = null;
    Object v20 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v19));
    Object v21 = ((com.google.javascript.jscomp.TypeCheck)v8).processForTesting(((com.google.javascript.rhino.Node)v18),((com.google.javascript.rhino.Node)v20));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = new com.google.javascript.jscomp.PrepareAst.PrepareAnnotations();
    Object v11 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.NodeTraversal.Callback)v10));
    Object v12 = null;
    Object v13 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v12));
    Object v14 = null;
    Object v15 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v14));
    Object v16 = ((com.google.javascript.jscomp.TypeCheck)v8).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v11),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v15));
    Object v17 = ((com.google.javascript.jscomp.TypeCheck)v8).getTypedPercent();
    org.junit.Assert.assertEquals((Object)(0.0D), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = new com.google.javascript.jscomp.PrepareAst.PrepareAnnotations();
    Object v11 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.NodeTraversal.Callback)v10));
    Object v12 = null;
    Object v13 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v12));
    Object v14 = null;
    Object v15 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v14));
    Object v16 = ((com.google.javascript.jscomp.TypeCheck)v8).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v11),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler();
    Object v18 = new com.google.javascript.jscomp.PrepareAst.PrepareAnnotations();
    Object v19 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v17),((com.google.javascript.jscomp.NodeTraversal.Callback)v18));
    Object v20 = null;
    Object v21 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v20));
    Object v22 = null;
    Object v23 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v22));
    Object v24 = ((com.google.javascript.jscomp.TypeCheck)v8).visitName(((com.google.javascript.jscomp.NodeTraversal)v19),((com.google.javascript.rhino.Node)v21),((com.google.javascript.rhino.Node)v23));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = new com.google.javascript.jscomp.PrepareAst.PrepareAnnotations();
    Object v11 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.NodeTraversal.Callback)v10));
    Object v12 = null;
    Object v13 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v12));
    Object v14 = null;
    Object v15 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v14));
    ((com.google.javascript.rhino.Node)v13).addChildToFront(((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
    Object v17 = null;
    Object v18 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v17));
    Object v19 = ((com.google.javascript.jscomp.TypeCheck)v8).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v11),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v18));
    org.junit.Assert.assertEquals((Object)(true), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = new com.google.javascript.jscomp.PrepareAst.PrepareAnnotations();
    Object v11 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.NodeTraversal.Callback)v10));
    Object v12 = null;
    Object v13 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v12));
    Object v14 = null;
    Object v15 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v14));
    ((com.google.javascript.jscomp.TypeCheck)v8).visit(((com.google.javascript.jscomp.NodeTraversal)v11),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
    Object v17 = new com.google.javascript.jscomp.Compiler();
    Object v18 = new com.google.javascript.jscomp.PrepareAst.PrepareAnnotations();
    Object v19 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v17),((com.google.javascript.jscomp.NodeTraversal.Callback)v18));
    Object v20 = null;
    Object v21 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v20));
    Object v22 = "";
    ((com.google.javascript.rhino.Node)v21).setSourceFileForTesting(((java.lang.String)v22));
    Object v23 = null;
    Object v24 = null;
    Object v25 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v24));
    Object v26 = ((com.google.javascript.jscomp.TypeCheck)v8).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v19),((com.google.javascript.rhino.Node)v21),((com.google.javascript.rhino.Node)v25));
    org.junit.Assert.assertEquals((Object)(true), v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = new com.google.javascript.jscomp.PrepareAst.PrepareAnnotations();
    Object v11 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.NodeTraversal.Callback)v10));
    Object v12 = null;
    Object v13 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v12));
    Object v14 = null;
    Object v15 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v14));
    Object v16 = ((com.google.javascript.jscomp.TypeCheck)v8).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v11),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v15));
    Object v17 = null;
    Object v18 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v17));
    Object v19 = 43;
    ((com.google.javascript.rhino.Node)v18).setLength((((java.lang.Integer)v19).intValue()));
    Object v20 = null;
    Object v21 = false;
    ((com.google.javascript.jscomp.TypeCheck)v8).check(((com.google.javascript.rhino.Node)v18),(((java.lang.Boolean)v21).booleanValue()));
    Object v22 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = null;
    Object v10 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v9));
    Object v11 = 21;
    ((com.google.javascript.rhino.Node)v10).setLineno((((java.lang.Integer)v11).intValue()));
    Object v12 = null;
    Object v13 = true;
    ((com.google.javascript.jscomp.TypeCheck)v8).check(((com.google.javascript.rhino.Node)v10),(((java.lang.Boolean)v13).booleanValue()));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = new com.google.javascript.jscomp.PrepareAst.PrepareAnnotations();
    Object v11 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.NodeTraversal.Callback)v10));
    Object v12 = null;
    Object v13 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v12));
    Object v14 = null;
    Object v15 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v14));
    Object v16 = ((com.google.javascript.jscomp.TypeCheck)v8).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v11),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v15));
    Object v17 = null;
    Object v18 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v17));
    Object v19 = null;
    Object v20 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v19));
    ((com.google.javascript.jscomp.TypeCheck)v8).process(((com.google.javascript.rhino.Node)v18),((com.google.javascript.rhino.Node)v20));
    Object v21 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = null;
    Object v10 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v9));
    Object v11 = ((com.google.javascript.rhino.Node)v10).getJsDocBuilderForNode();
    Object v12 = false;
    ((com.google.javascript.jscomp.TypeCheck)v8).check(((com.google.javascript.rhino.Node)v10),(((java.lang.Boolean)v12).booleanValue()));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = new com.google.javascript.jscomp.PrepareAst.PrepareAnnotations();
    Object v11 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.NodeTraversal.Callback)v10));
    Object v12 = null;
    Object v13 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v12));
    Object v14 = 24;
    ((com.google.javascript.rhino.Node)v13).setCharno((((java.lang.Integer)v14).intValue()));
    Object v15 = null;
    Object v16 = null;
    Object v17 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v16));
    Object v18 = ((com.google.javascript.jscomp.TypeCheck)v8).visitName(((com.google.javascript.jscomp.NodeTraversal)v11),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v17));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = null;
    Object v10 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v9));
    Object v11 = null;
    Object v12 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v11));
    Object v13 = -5;
    Object v14 = true;
    ((com.google.javascript.rhino.Node)v12).putBooleanProp((((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v15 = null;
    Object v16 = ((com.google.javascript.jscomp.TypeCheck)v8).processForTesting(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v12));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v2 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v2));
    Object v4 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v1),((com.google.javascript.rhino.jstype.JSTypeRegistry)v3));
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = null;
    Object v8 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v7));
    Object v9 = com.google.javascript.jscomp.Scope.createLatticeBottom(((com.google.javascript.rhino.Node)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler();
    Object v11 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v12 = new com.google.javascript.jscomp.MemoizedScopeCreator(((com.google.javascript.jscomp.ScopeCreator)v11));
    Object v13 = null;
    Object v14 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v13));
    Object v15 = com.google.javascript.jscomp.Scope.createLatticeBottom(((com.google.javascript.rhino.Node)v14));
    Object v16 = new com.google.javascript.jscomp.Scope.Arguments(((com.google.javascript.jscomp.Scope)v15));
    Object v17 = ((com.google.javascript.jscomp.MemoizedScopeCreator)v12).getReferences(((com.google.javascript.jscomp.Scope.Var)v16));
    Object v18 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v19 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6),((com.google.javascript.jscomp.Scope)v9),((com.google.javascript.jscomp.MemoizedScopeCreator)v12),((com.google.javascript.jscomp.CheckLevel)v18));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = null;
    Object v10 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v9));
    Object v11 = null;
    Object v12 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v11));
    Object v13 = null;
    Object v14 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v13));
    Object v15 = ((com.google.javascript.rhino.Node)v12).useSourceInfoIfMissingFrom(((com.google.javascript.rhino.Node)v14));
    ((com.google.javascript.jscomp.TypeCheck)v8).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v12));
    Object v16 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = new com.google.javascript.jscomp.PrepareAst.PrepareAnnotations();
    Object v11 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.NodeTraversal.Callback)v10));
    Object v12 = null;
    Object v13 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v12));
    Object v14 = null;
    Object v15 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v14));
    ((com.google.javascript.jscomp.TypeCheck)v8).visit(((com.google.javascript.jscomp.NodeTraversal)v11),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
    Object v17 = null;
    Object v18 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v17));
    Object v19 = null;
    Object v20 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v19));
    Object v21 = 60;
    ((com.google.javascript.rhino.Node)v20).setLineno((((java.lang.Integer)v21).intValue()));
    Object v22 = null;
    Object v23 = ((com.google.javascript.jscomp.TypeCheck)v8).processForTesting(((com.google.javascript.rhino.Node)v18),((com.google.javascript.rhino.Node)v20));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = new com.google.javascript.jscomp.PrepareAst.PrepareAnnotations();
    Object v11 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.NodeTraversal.Callback)v10));
    Object v12 = null;
    Object v13 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v12));
    Object v14 = null;
    Object v15 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v14));
    ((com.google.javascript.jscomp.TypeCheck)v8).visit(((com.google.javascript.jscomp.NodeTraversal)v11),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
    Object v17 = new com.google.javascript.jscomp.Compiler();
    Object v18 = new com.google.javascript.jscomp.PrepareAst.PrepareAnnotations();
    Object v19 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v17),((com.google.javascript.jscomp.NodeTraversal.Callback)v18));
    Object v20 = null;
    Object v21 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v20));
    Object v22 = null;
    Object v23 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v22));
    ((com.google.javascript.jscomp.TypeCheck)v8).visit(((com.google.javascript.jscomp.NodeTraversal)v19),((com.google.javascript.rhino.Node)v21),((com.google.javascript.rhino.Node)v23));
    Object v24 = null;
    org.junit.Assert.assertNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = new com.google.javascript.jscomp.PrepareAst.PrepareAnnotations();
    Object v11 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.NodeTraversal.Callback)v10));
    Object v12 = null;
    Object v13 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v12));
    Object v14 = null;
    Object v15 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v14));
    Object v16 = ((com.google.javascript.jscomp.TypeCheck)v8).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v11),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v15));
    Object v17 = null;
    Object v18 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v17));
    Object v19 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v20 = java.util.Set.of(((java.lang.Object)v19));
    ((com.google.javascript.rhino.Node)v18).setDirectives(((java.util.Set)v20));
    Object v21 = null;
    Object v22 = false;
    ((com.google.javascript.jscomp.TypeCheck)v8).check(((com.google.javascript.rhino.Node)v18),(((java.lang.Boolean)v22).booleanValue()));
    Object v23 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = new com.google.javascript.jscomp.PrepareAst.PrepareAnnotations();
    Object v11 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.NodeTraversal.Callback)v10));
    Object v12 = null;
    Object v13 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v12));
    Object v14 = null;
    Object v15 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v14));
    Object v16 = ((com.google.javascript.rhino.Node)v13).useSourceInfoIfMissingFrom(((com.google.javascript.rhino.Node)v15));
    Object v17 = null;
    Object v18 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v17));
    ((com.google.javascript.jscomp.TypeCheck)v8).visit(((com.google.javascript.jscomp.NodeTraversal)v11),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v18));
    Object v19 = null;
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = new com.google.javascript.jscomp.PrepareAst.PrepareAnnotations();
    Object v11 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.NodeTraversal.Callback)v10));
    Object v12 = null;
    Object v13 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v12));
    Object v14 = false;
    ((com.google.javascript.rhino.Node)v13).setOptionalArg((((java.lang.Boolean)v14).booleanValue()));
    Object v15 = null;
    Object v16 = null;
    Object v17 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v16));
    ((com.google.javascript.jscomp.TypeCheck)v8).visit(((com.google.javascript.jscomp.NodeTraversal)v11),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v17));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = new com.google.javascript.jscomp.PrepareAst.PrepareAnnotations();
    Object v11 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.NodeTraversal.Callback)v10));
    Object v12 = null;
    Object v13 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v12));
    Object v14 = null;
    Object v15 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v14));
    ((com.google.javascript.jscomp.TypeCheck)v8).visit(((com.google.javascript.jscomp.NodeTraversal)v11),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
    Object v17 = null;
    Object v18 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v17));
    Object v19 = ((com.google.javascript.rhino.Node)v18).getSourceOffset();
    Object v20 = null;
    Object v21 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v20));
    Object v22 = null;
    Object v23 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v22));
    Object v24 = ((com.google.javascript.rhino.Node)v21).clonePropsFrom(((com.google.javascript.rhino.Node)v23));
    ((com.google.javascript.jscomp.TypeCheck)v8).process(((com.google.javascript.rhino.Node)v18),((com.google.javascript.rhino.Node)v21));
    Object v25 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = new com.google.javascript.jscomp.PrepareAst.PrepareAnnotations();
    Object v11 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.NodeTraversal.Callback)v10));
    Object v12 = null;
    Object v13 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v12));
    Object v14 = null;
    Object v15 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v14));
    ((com.google.javascript.jscomp.TypeCheck)v8).visit(((com.google.javascript.jscomp.NodeTraversal)v11),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
    Object v17 = null;
    Object v18 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v17));
    Object v19 = false;
    ((com.google.javascript.jscomp.TypeCheck)v8).check(((com.google.javascript.rhino.Node)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v20 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = null;
    Object v10 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v9));
    Object v11 = ((com.google.javascript.rhino.Node)v10).getStaticSourceFile();
    Object v12 = null;
    Object v13 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v12));
    ((com.google.javascript.jscomp.TypeCheck)v8).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = new com.google.javascript.jscomp.PrepareAst.PrepareAnnotations();
    Object v11 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.NodeTraversal.Callback)v10));
    Object v12 = ((com.google.javascript.jscomp.NodeTraversal)v11).hasScope();
    Object v13 = null;
    Object v14 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v13));
    Object v15 = null;
    Object v16 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v15));
    ((com.google.javascript.jscomp.TypeCheck)v8).visit(((com.google.javascript.jscomp.NodeTraversal)v11),((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.Node)v16));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = new com.google.javascript.jscomp.PrepareAst.PrepareAnnotations();
    Object v11 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.NodeTraversal.Callback)v10));
    Object v12 = null;
    Object v13 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v12));
    Object v14 = null;
    Object v15 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v14));
    Object v16 = ((com.google.javascript.jscomp.TypeCheck)v8).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v11),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler();
    Object v18 = new com.google.javascript.jscomp.PrepareAst.PrepareAnnotations();
    Object v19 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v17),((com.google.javascript.jscomp.NodeTraversal.Callback)v18));
    Object v20 = null;
    Object v21 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v20));
    Object v22 = null;
    Object v23 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v22));
    Object v24 = java.io.Writer.nullWriter();
    ((com.google.javascript.rhino.Node)v23).appendStringTree(((java.lang.Appendable)v24));
    Object v25 = null;
    Object v26 = ((com.google.javascript.jscomp.TypeCheck)v8).visitName(((com.google.javascript.jscomp.NodeTraversal)v19),((com.google.javascript.rhino.Node)v21),((com.google.javascript.rhino.Node)v23));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = new com.google.javascript.jscomp.PrepareAst.PrepareAnnotations();
    Object v11 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.NodeTraversal.Callback)v10));
    Object v12 = new com.google.javascript.rhino.Node[]{};
    ((com.google.javascript.jscomp.NodeTraversal)v11).traverseRoots(((com.google.javascript.rhino.Node[])v12));
    Object v13 = null;
    Object v14 = null;
    Object v15 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v14));
    Object v16 = null;
    Object v17 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v16));
    Object v18 = ((com.google.javascript.jscomp.TypeCheck)v8).visitName(((com.google.javascript.jscomp.NodeTraversal)v11),((com.google.javascript.rhino.Node)v15),((com.google.javascript.rhino.Node)v17));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = new com.google.javascript.jscomp.PrepareAst.PrepareAnnotations();
    Object v11 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.NodeTraversal.Callback)v10));
    Object v12 = null;
    Object v13 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v12));
    Object v14 = ")";
    Object v15 = "";
    Object v16 = com.google.javascript.jscomp.DiagnosticType.warning(((java.lang.String)v14),((java.lang.String)v15));
    Object v17 = new java.lang.String[]{")",""};
    Object v18 = ((com.google.javascript.jscomp.NodeTraversal)v11).makeError(((com.google.javascript.rhino.Node)v13),((com.google.javascript.jscomp.DiagnosticType)v16),((java.lang.String[])v17));
    Object v19 = null;
    Object v20 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v19));
    Object v21 = null;
    Object v22 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v21));
    Object v23 = 1;
    Object v24 = ((com.google.javascript.rhino.Node)v22).getBooleanProp((((java.lang.Integer)v23).intValue()));
    Object v25 = ((com.google.javascript.jscomp.TypeCheck)v8).visitName(((com.google.javascript.jscomp.NodeTraversal)v11),((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.Node)v22));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = new com.google.javascript.jscomp.PrepareAst.PrepareAnnotations();
    Object v11 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.NodeTraversal.Callback)v10));
    Object v12 = null;
    Object v13 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v12));
    Object v14 = null;
    Object v15 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v14));
    ((com.google.javascript.jscomp.TypeCheck)v8).visit(((com.google.javascript.jscomp.NodeTraversal)v11),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
    Object v17 = ((com.google.javascript.jscomp.TypeCheck)v8).getTypedPercent();
    org.junit.Assert.assertEquals((Object)(100.0D), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = new com.google.javascript.jscomp.PrepareAst.PrepareAnnotations();
    Object v11 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.NodeTraversal.Callback)v10));
    Object v12 = null;
    Object v13 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v12));
    Object v14 = null;
    Object v15 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v14));
    ((com.google.javascript.jscomp.TypeCheck)v8).visit(((com.google.javascript.jscomp.NodeTraversal)v11),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
    Object v17 = null;
    Object v18 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v17));
    Object v19 = null;
    Object v20 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v19));
    ((com.google.javascript.jscomp.TypeCheck)v8).process(((com.google.javascript.rhino.Node)v18),((com.google.javascript.rhino.Node)v20));
    Object v21 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = new com.google.javascript.jscomp.PrepareAst.PrepareAnnotations();
    Object v11 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.NodeTraversal.Callback)v10));
    Object v12 = new com.google.javascript.rhino.Node[]{};
    ((com.google.javascript.jscomp.NodeTraversal)v11).traverseRoots(((com.google.javascript.rhino.Node[])v12));
    Object v13 = null;
    Object v14 = null;
    Object v15 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v14));
    Object v16 = null;
    Object v17 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v16));
    Object v18 = ((com.google.javascript.rhino.Node)v17).getSideEffectFlags();
    Object v19 = ((com.google.javascript.jscomp.TypeCheck)v8).visitName(((com.google.javascript.jscomp.NodeTraversal)v11),((com.google.javascript.rhino.Node)v15),((com.google.javascript.rhino.Node)v17));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = new com.google.javascript.jscomp.PrepareAst.PrepareAnnotations();
    Object v11 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.NodeTraversal.Callback)v10));
    Object v12 = null;
    Object v13 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v12));
    Object v14 = null;
    Object v15 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v14));
    ((com.google.javascript.jscomp.TypeCheck)v8).visit(((com.google.javascript.jscomp.NodeTraversal)v11),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
    Object v17 = new com.google.javascript.jscomp.Compiler();
    Object v18 = new com.google.javascript.jscomp.PrepareAst.PrepareAnnotations();
    Object v19 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v17),((com.google.javascript.jscomp.NodeTraversal.Callback)v18));
    Object v20 = ((com.google.javascript.jscomp.NodeTraversal)v19).getScope();
    Object v21 = null;
    Object v22 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v21));
    Object v23 = null;
    Object v24 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v23));
    Object v25 = ((com.google.javascript.jscomp.TypeCheck)v8).visitName(((com.google.javascript.jscomp.NodeTraversal)v19),((com.google.javascript.rhino.Node)v22),((com.google.javascript.rhino.Node)v24));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = new com.google.javascript.jscomp.PrepareAst.PrepareAnnotations();
    Object v11 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.NodeTraversal.Callback)v10));
    Object v12 = null;
    Object v13 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v12));
    Object v14 = ")";
    Object v15 = "";
    Object v16 = com.google.javascript.jscomp.DiagnosticType.warning(((java.lang.String)v14),((java.lang.String)v15));
    Object v17 = new java.lang.String[]{};
    Object v18 = ((com.google.javascript.jscomp.NodeTraversal)v11).makeError(((com.google.javascript.rhino.Node)v13),((com.google.javascript.jscomp.DiagnosticType)v16),((java.lang.String[])v17));
    Object v19 = null;
    Object v20 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v19));
    Object v21 = null;
    Object v22 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v21));
    Object v23 = ((com.google.javascript.jscomp.TypeCheck)v8).visitName(((com.google.javascript.jscomp.NodeTraversal)v11),((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.Node)v22));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = new com.google.javascript.jscomp.PrepareAst.PrepareAnnotations();
    Object v11 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.NodeTraversal.Callback)v10));
    Object v12 = new com.google.javascript.rhino.Node[]{};
    ((com.google.javascript.jscomp.NodeTraversal)v11).traverseRoots(((com.google.javascript.rhino.Node[])v12));
    Object v13 = null;
    Object v14 = null;
    Object v15 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v14));
    Object v16 = null;
    Object v17 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v16));
    ((com.google.javascript.jscomp.TypeCheck)v8).visit(((com.google.javascript.jscomp.NodeTraversal)v11),((com.google.javascript.rhino.Node)v15),((com.google.javascript.rhino.Node)v17));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = null;
    Object v10 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v9));
    Object v11 = "e";
    ((com.google.javascript.rhino.Node)v10).setSourceFileForTesting(((java.lang.String)v11));
    Object v12 = null;
    Object v13 = null;
    Object v14 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v13));
    ((com.google.javascript.jscomp.TypeCheck)v8).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v14));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = new com.google.javascript.jscomp.PrepareAst.PrepareAnnotations();
    Object v11 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.NodeTraversal.Callback)v10));
    Object v12 = null;
    Object v13 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v12));
    Object v14 = null;
    Object v15 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v14));
    Object v16 = -69;
    Object v17 = true;
    ((com.google.javascript.rhino.Node)v15).putBooleanProp((((java.lang.Integer)v16).intValue()),(((java.lang.Boolean)v17).booleanValue()));
    Object v18 = null;
    Object v19 = ((com.google.javascript.jscomp.TypeCheck)v8).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v11),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v15));
    org.junit.Assert.assertEquals((Object)(true), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = new com.google.javascript.jscomp.PrepareAst.PrepareAnnotations();
    Object v11 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.NodeTraversal.Callback)v10));
    Object v12 = null;
    Object v13 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v12));
    Object v14 = null;
    Object v15 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v14));
    Object v16 = ((com.google.javascript.rhino.Node)v15).getSideEffectFlags();
    Object v17 = ((com.google.javascript.jscomp.TypeCheck)v8).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v11),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v15));
    org.junit.Assert.assertEquals((Object)(true), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = null;
    Object v10 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v9));
    Object v11 = null;
    Object v12 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v11));
    Object v13 = java.io.Writer.nullWriter();
    ((com.google.javascript.rhino.Node)v12).appendStringTree(((java.lang.Appendable)v13));
    Object v14 = null;
    Object v15 = ((com.google.javascript.jscomp.TypeCheck)v8).processForTesting(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v12));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = new com.google.javascript.jscomp.PrepareAst.PrepareAnnotations();
    Object v11 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.NodeTraversal.Callback)v10));
    Object v12 = null;
    Object v13 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v12));
    Object v14 = ((com.google.javascript.rhino.Node)v13).isNoSideEffectsCall();
    Object v15 = null;
    Object v16 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v15));
    Object v17 = ((com.google.javascript.jscomp.TypeCheck)v8).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v11),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v16));
    org.junit.Assert.assertEquals((Object)(true), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = null;
    Object v10 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v9));
    Object v11 = ((com.google.javascript.rhino.Node)v10).getStaticSourceFile();
    Object v12 = null;
    Object v13 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v12));
    Object v14 = null;
    Object v15 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v14));
    Object v16 = ((com.google.javascript.rhino.Node)v13).useSourceInfoFromForTree(((com.google.javascript.rhino.Node)v15));
    ((com.google.javascript.jscomp.TypeCheck)v8).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v13));
    Object v17 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = null;
    Object v10 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v9));
    Object v11 = ((com.google.javascript.rhino.Node)v10).isQualifiedName();
    Object v12 = true;
    ((com.google.javascript.jscomp.TypeCheck)v8).check(((com.google.javascript.rhino.Node)v10),(((java.lang.Boolean)v12).booleanValue()));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = null;
    Object v10 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v9));
    Object v11 = ((com.google.javascript.rhino.Node)v10).isSyntheticBlock();
    Object v12 = null;
    Object v13 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v12));
    Object v14 = ((com.google.javascript.jscomp.TypeCheck)v8).processForTesting(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v13));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = null;
    Object v10 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v9));
    Object v11 = null;
    Object v12 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v11));
    Object v13 = ((com.google.javascript.rhino.Node)v10).copyInformationFromForTree(((com.google.javascript.rhino.Node)v12));
    Object v14 = null;
    Object v15 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v14));
    Object v16 = ((com.google.javascript.jscomp.TypeCheck)v8).processForTesting(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v15));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = null;
    Object v10 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v9));
    Object v11 = null;
    Object v12 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v11));
    Object v13 = null;
    Object v14 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v13));
    Object v15 = ((com.google.javascript.rhino.Node)v12).isEquivalentToTyped(((com.google.javascript.rhino.Node)v14));
    Object v16 = ((com.google.javascript.jscomp.TypeCheck)v8).processForTesting(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v12));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = new com.google.javascript.jscomp.PrepareAst.PrepareAnnotations();
    Object v11 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.NodeTraversal.Callback)v10));
    Object v12 = null;
    Object v13 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v12));
    Object v14 = null;
    Object v15 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v14));
    Object v16 = null;
    Object v17 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v16));
    Object v18 = ((com.google.javascript.rhino.Node)v15).isEquivalentTo(((com.google.javascript.rhino.Node)v17));
    ((com.google.javascript.jscomp.TypeCheck)v8).visit(((com.google.javascript.jscomp.NodeTraversal)v11),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v15));
    Object v19 = null;
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = new com.google.javascript.jscomp.PrepareAst.PrepareAnnotations();
    Object v11 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.NodeTraversal.Callback)v10));
    Object v12 = null;
    Object v13 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v12));
    Object v14 = ((com.google.javascript.rhino.Node)v13).getSourceOffset();
    Object v15 = null;
    Object v16 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v15));
    Object v17 = ((com.google.javascript.jscomp.TypeCheck)v8).visitName(((com.google.javascript.jscomp.NodeTraversal)v11),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v16));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = new com.google.javascript.jscomp.PrepareAst.PrepareAnnotations();
    Object v11 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.NodeTraversal.Callback)v10));
    Object v12 = null;
    Object v13 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v12));
    Object v14 = null;
    Object v15 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v14));
    ((com.google.javascript.jscomp.TypeCheck)v8).visit(((com.google.javascript.jscomp.NodeTraversal)v11),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
    Object v17 = new com.google.javascript.jscomp.Compiler();
    Object v18 = new com.google.javascript.jscomp.PrepareAst.PrepareAnnotations();
    Object v19 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v17),((com.google.javascript.jscomp.NodeTraversal.Callback)v18));
    Object v20 = null;
    Object v21 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v20));
    Object v22 = "";
    ((com.google.javascript.rhino.Node)v21).setSourceFileForTesting(((java.lang.String)v22));
    Object v23 = null;
    Object v24 = null;
    Object v25 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v24));
    Object v26 = ((com.google.javascript.jscomp.TypeCheck)v8).visitName(((com.google.javascript.jscomp.NodeTraversal)v19),((com.google.javascript.rhino.Node)v21),((com.google.javascript.rhino.Node)v25));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = new com.google.javascript.jscomp.PrepareAst.PrepareAnnotations();
    Object v11 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.NodeTraversal.Callback)v10));
    Object v12 = null;
    Object v13 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v12));
    Object v14 = null;
    Object v15 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v14));
    Object v16 = ((com.google.javascript.rhino.Node)v15).isFromExterns();
    Object v17 = ((com.google.javascript.jscomp.TypeCheck)v8).visitName(((com.google.javascript.jscomp.NodeTraversal)v11),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v15));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = null;
    Object v10 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v9));
    Object v11 = 1;
    Object v12 = false;
    ((com.google.javascript.rhino.Node)v10).putBooleanProp((((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v13 = null;
    Object v14 = false;
    ((com.google.javascript.jscomp.TypeCheck)v8).check(((com.google.javascript.rhino.Node)v10),(((java.lang.Boolean)v14).booleanValue()));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = new com.google.javascript.jscomp.PrepareAst.PrepareAnnotations();
    Object v11 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.NodeTraversal.Callback)v10));
    Object v12 = null;
    Object v13 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v12));
    Object v14 = null;
    Object v15 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v14));
    Object v16 = ((com.google.javascript.jscomp.TypeCheck)v8).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v11),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler();
    Object v18 = new com.google.javascript.jscomp.PrepareAst.PrepareAnnotations();
    Object v19 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v17),((com.google.javascript.jscomp.NodeTraversal.Callback)v18));
    Object v20 = null;
    Object v21 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v20));
    Object v22 = ")";
    Object v23 = "";
    Object v24 = com.google.javascript.jscomp.DiagnosticType.warning(((java.lang.String)v22),((java.lang.String)v23));
    Object v25 = new java.lang.String[]{"digrap",""};
    Object v26 = ((com.google.javascript.jscomp.NodeTraversal)v19).makeError(((com.google.javascript.rhino.Node)v21),((com.google.javascript.jscomp.DiagnosticType)v24),((java.lang.String[])v25));
    Object v27 = null;
    Object v28 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v27));
    Object v29 = null;
    Object v30 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v29));
    ((com.google.javascript.jscomp.TypeCheck)v8).visit(((com.google.javascript.jscomp.NodeTraversal)v19),((com.google.javascript.rhino.Node)v28),((com.google.javascript.rhino.Node)v30));
    Object v31 = null;
    org.junit.Assert.assertNull(v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = new com.google.javascript.jscomp.PrepareAst.PrepareAnnotations();
    Object v11 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.NodeTraversal.Callback)v10));
    Object v12 = null;
    Object v13 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v12));
    Object v14 = 10;
    Object v15 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v16 = ")";
    Object v17 = "";
    Object v18 = com.google.javascript.jscomp.DiagnosticType.warning(((java.lang.String)v16),((java.lang.String)v17));
    Object v19 = new com.google.javascript.jscomp.PrepareAst.PrepareAnnotations();
    Object v20 = new com.google.javascript.jscomp.PrepareAst.PrepareAnnotations();
    Object v21 = new com.google.javascript.jscomp.PrepareAst.PrepareAnnotations();
    Object v22 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v23 = new com.google.javascript.jscomp.PrepareAst.PrepareAnnotations();
    Object v24 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v25 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v26 = java.util.List.of(((java.lang.Object)v15),((java.lang.Object)v18),((java.lang.Object)v19),((java.lang.Object)v20),((java.lang.Object)v21),((java.lang.Object)v22),((java.lang.Object)v23),((java.lang.Object)v24),((java.lang.Object)v25));
    ((com.google.javascript.rhino.Node)v13).putProp((((java.lang.Integer)v14).intValue()),((java.lang.Object)v26));
    Object v27 = null;
    Object v28 = null;
    Object v29 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v28));
    ((com.google.javascript.jscomp.TypeCheck)v8).visit(((com.google.javascript.jscomp.NodeTraversal)v11),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v29));
    Object v30 = null;
    org.junit.Assert.assertNull(v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = new com.google.javascript.jscomp.PrepareAst.PrepareAnnotations();
    Object v11 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.NodeTraversal.Callback)v10));
    Object v12 = null;
    Object v13 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v12));
    Object v14 = null;
    Object v15 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v14));
    Object v16 = ((com.google.javascript.jscomp.TypeCheck)v8).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v11),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v15));
    Object v17 = null;
    Object v18 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v17));
    Object v19 = 1;
    Object v20 = ((com.google.javascript.rhino.Node)v18).getProp((((java.lang.Integer)v19).intValue()));
    Object v21 = null;
    Object v22 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v21));
    Object v23 = ((com.google.javascript.jscomp.TypeCheck)v8).processForTesting(((com.google.javascript.rhino.Node)v18),((com.google.javascript.rhino.Node)v22));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = new com.google.javascript.jscomp.PrepareAst.PrepareAnnotations();
    Object v11 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.NodeTraversal.Callback)v10));
    Object v12 = null;
    Object v13 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v12));
    Object v14 = null;
    Object v15 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v14));
    ((com.google.javascript.jscomp.TypeCheck)v8).visit(((com.google.javascript.jscomp.NodeTraversal)v11),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
    Object v17 = new com.google.javascript.jscomp.Compiler();
    Object v18 = new com.google.javascript.jscomp.PrepareAst.PrepareAnnotations();
    Object v19 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v17),((com.google.javascript.jscomp.NodeTraversal.Callback)v18));
    Object v20 = null;
    Object v21 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v20));
    Object v22 = null;
    Object v23 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v22));
    Object v24 = ((com.google.javascript.jscomp.TypeCheck)v8).visitName(((com.google.javascript.jscomp.NodeTraversal)v19),((com.google.javascript.rhino.Node)v21),((com.google.javascript.rhino.Node)v23));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = null;
    Object v10 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v9));
    Object v11 = ((com.google.javascript.rhino.Node)v10).getLength();
    Object v12 = true;
    ((com.google.javascript.jscomp.TypeCheck)v8).check(((com.google.javascript.rhino.Node)v10),(((java.lang.Boolean)v12).booleanValue()));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = new com.google.javascript.jscomp.PrepareAst.PrepareAnnotations();
    Object v11 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.NodeTraversal.Callback)v10));
    Object v12 = null;
    Object v13 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v12));
    Object v14 = null;
    Object v15 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v14));
    Object v16 = ((com.google.javascript.rhino.Node)v13).srcrefTree(((com.google.javascript.rhino.Node)v15));
    Object v17 = null;
    Object v18 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v17));
    ((com.google.javascript.jscomp.TypeCheck)v8).visit(((com.google.javascript.jscomp.NodeTraversal)v11),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v18));
    Object v19 = null;
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = new com.google.javascript.jscomp.PrepareAst.PrepareAnnotations();
    Object v11 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.NodeTraversal.Callback)v10));
    Object v12 = null;
    Object v13 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v12));
    Object v14 = null;
    Object v15 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v14));
    Object v16 = ((com.google.javascript.jscomp.TypeCheck)v8).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v11),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler();
    Object v18 = new com.google.javascript.jscomp.PrepareAst.PrepareAnnotations();
    Object v19 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v17),((com.google.javascript.jscomp.NodeTraversal.Callback)v18));
    Object v20 = null;
    Object v21 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v20));
    Object v22 = null;
    Object v23 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v22));
    ((com.google.javascript.jscomp.TypeCheck)v8).visit(((com.google.javascript.jscomp.NodeTraversal)v19),((com.google.javascript.rhino.Node)v21),((com.google.javascript.rhino.Node)v23));
    Object v24 = null;
    org.junit.Assert.assertNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = null;
    Object v10 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v9));
    Object v11 = null;
    Object v12 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v11));
    Object v13 = 0;
    ((com.google.javascript.rhino.Node)v12).setLength((((java.lang.Integer)v13).intValue()));
    Object v14 = null;
    ((com.google.javascript.jscomp.TypeCheck)v8).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v12));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = new com.google.javascript.jscomp.PrepareAst.PrepareAnnotations();
    Object v11 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.NodeTraversal.Callback)v10));
    Object v12 = null;
    Object v13 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v12));
    Object v14 = 1;
    ((com.google.javascript.rhino.Node)v13).removeProp((((java.lang.Integer)v14).intValue()));
    Object v15 = null;
    Object v16 = null;
    Object v17 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v16));
    Object v18 = ((com.google.javascript.jscomp.TypeCheck)v8).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v11),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v17));
    org.junit.Assert.assertEquals((Object)(true), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = null;
    Object v10 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v9));
    Object v11 = -73;
    ((com.google.javascript.rhino.Node)v10).setSourceEncodedPositionForTree((((java.lang.Integer)v11).intValue()));
    Object v12 = null;
    Object v13 = null;
    Object v14 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v13));
    Object v15 = ((com.google.javascript.rhino.Node)v14).isFromExterns();
    ((com.google.javascript.jscomp.TypeCheck)v8).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v14));
    Object v16 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = null;
    Object v10 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v9));
    Object v11 = ((com.google.javascript.rhino.Node)v10).getAncestors();
    Object v12 = null;
    Object v13 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v12));
    ((com.google.javascript.jscomp.TypeCheck)v8).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = new com.google.javascript.jscomp.PrepareAst.PrepareAnnotations();
    Object v11 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.NodeTraversal.Callback)v10));
    Object v12 = ((com.google.javascript.jscomp.NodeTraversal)v11).getEnclosingFunction();
    Object v13 = null;
    Object v14 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v13));
    Object v15 = null;
    Object v16 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v15));
    ((com.google.javascript.rhino.Node)v14).addChildrenToBack(((com.google.javascript.rhino.Node)v16));
    Object v17 = null;
    Object v18 = null;
    Object v19 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v18));
    Object v20 = null;
    Object v21 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v20));
    ((com.google.javascript.rhino.Node)v19).addChildToBack(((com.google.javascript.rhino.Node)v21));
    Object v22 = null;
    Object v23 = ((com.google.javascript.jscomp.TypeCheck)v8).visitName(((com.google.javascript.jscomp.NodeTraversal)v11),((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.Node)v19));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = new com.google.javascript.jscomp.PrepareAst.PrepareAnnotations();
    Object v11 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.NodeTraversal.Callback)v10));
    Object v12 = null;
    Object v13 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v12));
    Object v14 = null;
    Object v15 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v14));
    Object v16 = ((com.google.javascript.jscomp.TypeCheck)v8).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v11),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v15));
    Object v17 = null;
    Object v18 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v17));
    Object v19 = null;
    Object v20 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v19));
    Object v21 = ((com.google.javascript.rhino.Node)v20).isQualifiedName();
    Object v22 = ((com.google.javascript.jscomp.TypeCheck)v8).processForTesting(((com.google.javascript.rhino.Node)v18),((com.google.javascript.rhino.Node)v20));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = new com.google.javascript.jscomp.PrepareAst.PrepareAnnotations();
    Object v11 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.NodeTraversal.Callback)v10));
    Object v12 = ((com.google.javascript.jscomp.NodeTraversal)v11).getEnclosingFunction();
    Object v13 = null;
    Object v14 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v13));
    Object v15 = null;
    Object v16 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v15));
    Object v17 = false;
    Object v18 = true;
    Object v19 = false;
    Object v20 = ((com.google.javascript.rhino.Node)v16).toString((((java.lang.Boolean)v17).booleanValue()),(((java.lang.Boolean)v18).booleanValue()),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = ((com.google.javascript.jscomp.TypeCheck)v8).visitName(((com.google.javascript.jscomp.NodeTraversal)v11),((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.Node)v16));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "L";
    Object v2 = -9;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v8));
    Object v10 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v11 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v7),((com.google.javascript.rhino.jstype.JSTypeRegistry)v9),((com.google.javascript.jscomp.CheckLevel)v10));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = new com.google.javascript.jscomp.PrepareAst.PrepareAnnotations();
    Object v11 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.NodeTraversal.Callback)v10));
    Object v12 = null;
    Object v13 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v12));
    Object v14 = null;
    Object v15 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v14));
    Object v16 = ((com.google.javascript.jscomp.TypeCheck)v8).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v11),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v15));
    Object v17 = false;
    Object v18 = ((com.google.javascript.jscomp.TypeCheck)v8).reportMissingProperties((((java.lang.Boolean)v17).booleanValue()));
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = new com.google.javascript.jscomp.PrepareAst.PrepareAnnotations();
    Object v11 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.NodeTraversal.Callback)v10));
    Object v12 = null;
    Object v13 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v12));
    Object v14 = null;
    Object v15 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v14));
    Object v16 = ((com.google.javascript.jscomp.TypeCheck)v8).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v11),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v15));
    Object v17 = false;
    Object v18 = ((com.google.javascript.jscomp.TypeCheck)v8).reportMissingProperties((((java.lang.Boolean)v17).booleanValue()));
    Object v19 = null;
    Object v20 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v19));
    Object v21 = false;
    ((com.google.javascript.jscomp.TypeCheck)v18).check(((com.google.javascript.rhino.Node)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v22 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getProgress();
    Object v2 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = new com.google.javascript.jscomp.PrepareAst.PrepareAnnotations();
    Object v11 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.NodeTraversal.Callback)v10));
    Object v12 = null;
    Object v13 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v12));
    Object v14 = null;
    Object v15 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v14));
    Object v16 = ((com.google.javascript.jscomp.TypeCheck)v8).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v11),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v15));
    Object v17 = false;
    Object v18 = ((com.google.javascript.jscomp.TypeCheck)v8).reportMissingProperties((((java.lang.Boolean)v17).booleanValue()));
    Object v19 = new com.google.javascript.jscomp.Compiler();
    Object v20 = new com.google.javascript.jscomp.PrepareAst.PrepareAnnotations();
    Object v21 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v19),((com.google.javascript.jscomp.NodeTraversal.Callback)v20));
    Object v22 = null;
    Object v23 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v22));
    Object v24 = null;
    Object v25 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v24));
    Object v26 = ((com.google.javascript.jscomp.TypeCheck)v18).visitName(((com.google.javascript.jscomp.NodeTraversal)v21),((com.google.javascript.rhino.Node)v23),((com.google.javascript.rhino.Node)v25));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = new com.google.javascript.jscomp.PrepareAst.PrepareAnnotations();
    Object v11 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.NodeTraversal.Callback)v10));
    Object v12 = null;
    Object v13 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v12));
    Object v14 = null;
    Object v15 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v14));
    Object v16 = ((com.google.javascript.jscomp.TypeCheck)v8).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v11),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v15));
    Object v17 = false;
    Object v18 = ((com.google.javascript.jscomp.TypeCheck)v8).reportMissingProperties((((java.lang.Boolean)v17).booleanValue()));
    Object v19 = null;
    Object v20 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v19));
    Object v21 = ((com.google.javascript.rhino.Node)v20).toString();
    Object v22 = true;
    ((com.google.javascript.jscomp.TypeCheck)v18).check(((com.google.javascript.rhino.Node)v20),(((java.lang.Boolean)v22).booleanValue()));
    Object v23 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = new com.google.javascript.jscomp.PrepareAst.PrepareAnnotations();
    Object v11 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.NodeTraversal.Callback)v10));
    Object v12 = null;
    Object v13 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v12));
    Object v14 = null;
    Object v15 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v14));
    Object v16 = ((com.google.javascript.jscomp.TypeCheck)v8).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v11),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v15));
    Object v17 = false;
    Object v18 = ((com.google.javascript.jscomp.TypeCheck)v8).reportMissingProperties((((java.lang.Boolean)v17).booleanValue()));
    Object v19 = new com.google.javascript.jscomp.Compiler();
    Object v20 = new com.google.javascript.jscomp.PrepareAst.PrepareAnnotations();
    Object v21 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v19),((com.google.javascript.jscomp.NodeTraversal.Callback)v20));
    Object v22 = null;
    Object v23 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v22));
    ((com.google.javascript.jscomp.NodeTraversal)v21).traverse(((com.google.javascript.rhino.Node)v23));
    Object v24 = null;
    Object v25 = null;
    Object v26 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v25));
    Object v27 = ((com.google.javascript.rhino.Node)v26).removeChildren();
    Object v28 = null;
    Object v29 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v28));
    ((com.google.javascript.jscomp.TypeCheck)v18).visit(((com.google.javascript.jscomp.NodeTraversal)v21),((com.google.javascript.rhino.Node)v26),((com.google.javascript.rhino.Node)v29));
    Object v30 = null;
    org.junit.Assert.assertNull(v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = new com.google.javascript.jscomp.PrepareAst.PrepareAnnotations();
    Object v11 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.NodeTraversal.Callback)v10));
    Object v12 = null;
    Object v13 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v12));
    Object v14 = null;
    Object v15 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v14));
    Object v16 = ((com.google.javascript.jscomp.TypeCheck)v8).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v11),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v15));
    Object v17 = false;
    Object v18 = ((com.google.javascript.jscomp.TypeCheck)v8).reportMissingProperties((((java.lang.Boolean)v17).booleanValue()));
    Object v19 = new com.google.javascript.jscomp.Compiler();
    Object v20 = new com.google.javascript.jscomp.PrepareAst.PrepareAnnotations();
    Object v21 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v19),((com.google.javascript.jscomp.NodeTraversal.Callback)v20));
    Object v22 = null;
    Object v23 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v22));
    Object v24 = null;
    Object v25 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v24));
    Object v26 = ((com.google.javascript.jscomp.TypeCheck)v18).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v21),((com.google.javascript.rhino.Node)v23),((com.google.javascript.rhino.Node)v25));
    Object v27 = null;
    Object v28 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v27));
    Object v29 = true;
    ((com.google.javascript.jscomp.TypeCheck)v18).check(((com.google.javascript.rhino.Node)v28),(((java.lang.Boolean)v29).booleanValue()));
    Object v30 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getProgress();
    Object v2 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v9 = ((java.lang.Enum)v8).getDeclaringClass();
    Object v10 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((com.google.javascript.jscomp.CheckLevel)v8));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = new com.google.javascript.jscomp.PrepareAst.PrepareAnnotations();
    Object v11 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.NodeTraversal.Callback)v10));
    Object v12 = null;
    Object v13 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v12));
    Object v14 = null;
    Object v15 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v14));
    Object v16 = ((com.google.javascript.jscomp.TypeCheck)v8).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v11),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v15));
    Object v17 = false;
    Object v18 = ((com.google.javascript.jscomp.TypeCheck)v8).reportMissingProperties((((java.lang.Boolean)v17).booleanValue()));
    Object v19 = ((com.google.javascript.jscomp.TypeCheck)v18).getTypedPercent();
    org.junit.Assert.assertEquals((Object)(0.0D), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = new com.google.javascript.jscomp.PrepareAst.PrepareAnnotations();
    Object v11 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.NodeTraversal.Callback)v10));
    Object v12 = null;
    Object v13 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v12));
    Object v14 = null;
    Object v15 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v14));
    Object v16 = ((com.google.javascript.jscomp.TypeCheck)v8).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v11),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler();
    Object v18 = new com.google.javascript.jscomp.PrepareAst.PrepareAnnotations();
    Object v19 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v17),((com.google.javascript.jscomp.NodeTraversal.Callback)v18));
    Object v20 = null;
    Object v21 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v20));
    ((com.google.javascript.jscomp.NodeTraversal)v19).traverse(((com.google.javascript.rhino.Node)v21));
    Object v22 = null;
    Object v23 = null;
    Object v24 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v23));
    Object v25 = ((com.google.javascript.rhino.Node)v24).isOnlyModifiesThisCall();
    Object v26 = null;
    Object v27 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v26));
    Object v28 = ((com.google.javascript.jscomp.TypeCheck)v8).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v19),((com.google.javascript.rhino.Node)v24),((com.google.javascript.rhino.Node)v27));
    org.junit.Assert.assertEquals((Object)(true), v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v2 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v2));
    Object v4 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v1),((com.google.javascript.rhino.jstype.JSTypeRegistry)v3));
    Object v5 = null;
    Object v6 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v5));
    Object v7 = null;
    Object v8 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v7));
    Object v9 = com.google.javascript.jscomp.Scope.createLatticeBottom(((com.google.javascript.rhino.Node)v8));
    Object v10 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v9));
    Object v11 = false;
    Object v12 = ((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v4).getPreciserScopeKnowingConditionOutcome(((com.google.javascript.rhino.Node)v6),((com.google.javascript.jscomp.type.FlowScope)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v13));
    Object v15 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v14));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = new com.google.javascript.jscomp.PrepareAst.PrepareAnnotations();
    Object v11 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.NodeTraversal.Callback)v10));
    Object v12 = null;
    Object v13 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v12));
    Object v14 = null;
    Object v15 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v14));
    Object v16 = ((com.google.javascript.jscomp.TypeCheck)v8).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v11),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v15));
    Object v17 = false;
    Object v18 = ((com.google.javascript.jscomp.TypeCheck)v8).reportMissingProperties((((java.lang.Boolean)v17).booleanValue()));
    Object v19 = new com.google.javascript.jscomp.Compiler();
    Object v20 = new com.google.javascript.jscomp.PrepareAst.PrepareAnnotations();
    Object v21 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v19),((com.google.javascript.jscomp.NodeTraversal.Callback)v20));
    Object v22 = null;
    Object v23 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v22));
    Object v24 = null;
    Object v25 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v24));
    Object v26 = ((com.google.javascript.rhino.Node)v25).cloneNode();
    ((com.google.javascript.jscomp.TypeCheck)v18).visit(((com.google.javascript.jscomp.NodeTraversal)v21),((com.google.javascript.rhino.Node)v23),((com.google.javascript.rhino.Node)v25));
    Object v27 = null;
    org.junit.Assert.assertNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = new com.google.javascript.jscomp.PrepareAst.PrepareAnnotations();
    Object v11 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.NodeTraversal.Callback)v10));
    Object v12 = null;
    Object v13 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v12));
    Object v14 = null;
    Object v15 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v14));
    Object v16 = ((com.google.javascript.jscomp.TypeCheck)v8).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v11),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v15));
    Object v17 = false;
    Object v18 = ((com.google.javascript.jscomp.TypeCheck)v8).reportMissingProperties((((java.lang.Boolean)v17).booleanValue()));
    Object v19 = new com.google.javascript.jscomp.Compiler();
    Object v20 = new com.google.javascript.jscomp.PrepareAst.PrepareAnnotations();
    Object v21 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v19),((com.google.javascript.jscomp.NodeTraversal.Callback)v20));
    Object v22 = null;
    Object v23 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v22));
    Object v24 = null;
    Object v25 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v24));
    Object v26 = ((com.google.javascript.jscomp.TypeCheck)v18).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v21),((com.google.javascript.rhino.Node)v23),((com.google.javascript.rhino.Node)v25));
    Object v27 = null;
    Object v28 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v27));
    Object v29 = null;
    Object v30 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v29));
    Object v31 = ((com.google.javascript.jscomp.TypeCheck)v18).processForTesting(((com.google.javascript.rhino.Node)v28),((com.google.javascript.rhino.Node)v30));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = new com.google.javascript.jscomp.PrepareAst.PrepareAnnotations();
    Object v11 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.NodeTraversal.Callback)v10));
    Object v12 = null;
    Object v13 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v12));
    Object v14 = null;
    Object v15 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v14));
    Object v16 = ((com.google.javascript.jscomp.TypeCheck)v8).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v11),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v15));
    Object v17 = false;
    Object v18 = ((com.google.javascript.jscomp.TypeCheck)v8).reportMissingProperties((((java.lang.Boolean)v17).booleanValue()));
    Object v19 = new com.google.javascript.jscomp.Compiler();
    Object v20 = new com.google.javascript.jscomp.PrepareAst.PrepareAnnotations();
    Object v21 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v19),((com.google.javascript.jscomp.NodeTraversal.Callback)v20));
    Object v22 = null;
    Object v23 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v22));
    Object v24 = null;
    Object v25 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v24));
    Object v26 = ((com.google.javascript.jscomp.TypeCheck)v18).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v21),((com.google.javascript.rhino.Node)v23),((com.google.javascript.rhino.Node)v25));
    Object v27 = ((com.google.javascript.jscomp.TypeCheck)v18).getTypedPercent();
    org.junit.Assert.assertEquals((Object)(0.0D), v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = new com.google.javascript.jscomp.PrepareAst.PrepareAnnotations();
    Object v11 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.NodeTraversal.Callback)v10));
    Object v12 = null;
    Object v13 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v12));
    Object v14 = null;
    Object v15 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v14));
    Object v16 = ((com.google.javascript.jscomp.TypeCheck)v8).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v11),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v15));
    Object v17 = false;
    Object v18 = ((com.google.javascript.jscomp.TypeCheck)v8).reportMissingProperties((((java.lang.Boolean)v17).booleanValue()));
    Object v19 = null;
    Object v20 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v19));
    Object v21 = null;
    Object v22 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v21));
    ((com.google.javascript.jscomp.TypeCheck)v18).process(((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.Node)v22));
    Object v23 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = new com.google.javascript.jscomp.PrepareAst.PrepareAnnotations();
    Object v11 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.NodeTraversal.Callback)v10));
    Object v12 = null;
    Object v13 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v12));
    Object v14 = null;
    Object v15 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v14));
    Object v16 = ((com.google.javascript.jscomp.TypeCheck)v8).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v11),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v15));
    Object v17 = false;
    Object v18 = ((com.google.javascript.jscomp.TypeCheck)v8).reportMissingProperties((((java.lang.Boolean)v17).booleanValue()));
    Object v19 = new com.google.javascript.jscomp.Compiler();
    Object v20 = new com.google.javascript.jscomp.PrepareAst.PrepareAnnotations();
    Object v21 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v19),((com.google.javascript.jscomp.NodeTraversal.Callback)v20));
    Object v22 = null;
    Object v23 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v22));
    Object v24 = null;
    Object v25 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v24));
    Object v26 = ((com.google.javascript.rhino.Node)v25).getDirectives();
    ((com.google.javascript.jscomp.TypeCheck)v18).visit(((com.google.javascript.jscomp.NodeTraversal)v21),((com.google.javascript.rhino.Node)v23),((com.google.javascript.rhino.Node)v25));
    Object v27 = null;
    org.junit.Assert.assertNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v3 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = new com.google.javascript.jscomp.PrepareAst.PrepareAnnotations();
    Object v11 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.NodeTraversal.Callback)v10));
    Object v12 = null;
    Object v13 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v12));
    Object v14 = null;
    Object v15 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v14));
    ((com.google.javascript.jscomp.TypeCheck)v8).visit(((com.google.javascript.jscomp.NodeTraversal)v11),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
    Object v17 = null;
    Object v18 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v17));
    Object v19 = null;
    Object v20 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v19));
    Object v21 = -1;
    ((com.google.javascript.rhino.Node)v20).setCharno((((java.lang.Integer)v21).intValue()));
    Object v22 = null;
    ((com.google.javascript.jscomp.TypeCheck)v8).process(((com.google.javascript.rhino.Node)v18),((com.google.javascript.rhino.Node)v20));
    Object v23 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }
}
