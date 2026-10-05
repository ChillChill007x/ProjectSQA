package com.google.javascript.jscomp;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.StrictWarningsGuard();
    Object v1 = false;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -26;
    Object v5 = 81;
    Object v6 = -11;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = null;
    Object v9 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.jstype.ObjectType)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler();
    Object v11 = new com.google.javascript.jscomp.LiveVariablesAnalysis(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v9),((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v12 = "";
    Object v13 = ((com.google.javascript.jscomp.LiveVariablesAnalysis)v11).getVarIndex(((java.lang.String)v12));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.StrictWarningsGuard();
    Object v1 = false;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -26;
    Object v5 = 81;
    Object v6 = -11;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = null;
    Object v9 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.jstype.ObjectType)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler();
    Object v11 = new com.google.javascript.jscomp.LiveVariablesAnalysis(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v9),((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v12 = ((com.google.javascript.jscomp.LiveVariablesAnalysis)v11).getEscapedLocals();
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.StrictWarningsGuard();
    Object v1 = false;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -26;
    Object v5 = 81;
    Object v6 = -11;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = null;
    Object v9 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.jstype.ObjectType)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler();
    Object v11 = new com.google.javascript.jscomp.LiveVariablesAnalysis(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v9),((com.google.javascript.jscomp.AbstractCompiler)v10));
    ((com.google.javascript.jscomp.LiveVariablesAnalysis)v11).markAllParametersEscaped();
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.StrictWarningsGuard();
    Object v1 = false;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -26;
    Object v5 = 81;
    Object v6 = -11;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = null;
    Object v9 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.jstype.ObjectType)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler();
    Object v11 = new com.google.javascript.jscomp.LiveVariablesAnalysis(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v9),((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v12 = ((com.google.javascript.jscomp.LiveVariablesAnalysis)v11).createInitialEstimateLattice();
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.StrictWarningsGuard();
    Object v1 = false;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -26;
    Object v5 = 81;
    Object v6 = -11;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = null;
    Object v9 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.jstype.ObjectType)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler();
    Object v11 = new com.google.javascript.jscomp.LiveVariablesAnalysis(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v9),((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v12 = -26;
    Object v13 = 81;
    Object v14 = -11;
    Object v15 = new com.google.javascript.rhino.Node((((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = ((com.google.javascript.rhino.Node)v15).isNoSideEffectsCall();
    Object v17 = new com.google.javascript.jscomp.StrictWarningsGuard();
    Object v18 = false;
    Object v19 = false;
    Object v20 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v17),(((java.lang.Boolean)v18).booleanValue()),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = -26;
    Object v22 = 81;
    Object v23 = -11;
    Object v24 = new com.google.javascript.rhino.Node((((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()));
    Object v25 = null;
    Object v26 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v24),((com.google.javascript.rhino.jstype.ObjectType)v25));
    Object v27 = new com.google.javascript.jscomp.Compiler();
    Object v28 = new com.google.javascript.jscomp.LiveVariablesAnalysis(((com.google.javascript.jscomp.ControlFlowGraph)v20),((com.google.javascript.jscomp.Scope)v26),((com.google.javascript.jscomp.AbstractCompiler)v27));
    Object v29 = ((com.google.javascript.jscomp.LiveVariablesAnalysis)v28).createInitialEstimateLattice();
    Object v30 = ((com.google.javascript.jscomp.LiveVariablesAnalysis)v11).flowThrough(((com.google.javascript.rhino.Node)v15),((com.google.javascript.jscomp.LiveVariablesAnalysis.LiveVariableLattice)v29));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.StrictWarningsGuard();
    Object v1 = false;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -26;
    Object v5 = 81;
    Object v6 = -11;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = null;
    Object v9 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.jstype.ObjectType)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler();
    Object v11 = new com.google.javascript.jscomp.LiveVariablesAnalysis(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v9),((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v12 = -26;
    Object v13 = 81;
    Object v14 = -11;
    Object v15 = new com.google.javascript.rhino.Node((((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = new com.google.javascript.jscomp.StrictWarningsGuard();
    Object v17 = false;
    Object v18 = false;
    Object v19 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v16),(((java.lang.Boolean)v17).booleanValue()),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = -26;
    Object v21 = 81;
    Object v22 = -11;
    Object v23 = new com.google.javascript.rhino.Node((((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()));
    Object v24 = null;
    Object v25 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v23),((com.google.javascript.rhino.jstype.ObjectType)v24));
    Object v26 = new com.google.javascript.jscomp.Compiler();
    Object v27 = new com.google.javascript.jscomp.LiveVariablesAnalysis(((com.google.javascript.jscomp.ControlFlowGraph)v19),((com.google.javascript.jscomp.Scope)v25),((com.google.javascript.jscomp.AbstractCompiler)v26));
    Object v28 = ((com.google.javascript.jscomp.LiveVariablesAnalysis)v27).createInitialEstimateLattice();
    Object v29 = ((com.google.javascript.jscomp.LiveVariablesAnalysis)v11).flowThrough(((com.google.javascript.rhino.Node)v15),((com.google.javascript.jscomp.LiveVariablesAnalysis.LiveVariableLattice)v28));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.StrictWarningsGuard();
    Object v1 = false;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -26;
    Object v5 = 81;
    Object v6 = -11;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = null;
    Object v9 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.jstype.ObjectType)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler();
    Object v11 = new com.google.javascript.jscomp.LiveVariablesAnalysis(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v9),((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v12 = ((com.google.javascript.jscomp.LiveVariablesAnalysis)v11).createEntryLattice();
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.StrictWarningsGuard();
    Object v1 = false;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -26;
    Object v5 = 81;
    Object v6 = -11;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = null;
    Object v9 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.jstype.ObjectType)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler();
    Object v11 = new com.google.javascript.jscomp.LiveVariablesAnalysis(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v9),((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v12 = -26;
    Object v13 = 81;
    Object v14 = -11;
    Object v15 = new com.google.javascript.rhino.Node((((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = ((com.google.javascript.rhino.Node)v15).getSourceFileName();
    Object v17 = new com.google.javascript.jscomp.StrictWarningsGuard();
    Object v18 = false;
    Object v19 = false;
    Object v20 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v17),(((java.lang.Boolean)v18).booleanValue()),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = -26;
    Object v22 = 81;
    Object v23 = -11;
    Object v24 = new com.google.javascript.rhino.Node((((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()));
    Object v25 = null;
    Object v26 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v24),((com.google.javascript.rhino.jstype.ObjectType)v25));
    Object v27 = new com.google.javascript.jscomp.Compiler();
    Object v28 = new com.google.javascript.jscomp.LiveVariablesAnalysis(((com.google.javascript.jscomp.ControlFlowGraph)v20),((com.google.javascript.jscomp.Scope)v26),((com.google.javascript.jscomp.AbstractCompiler)v27));
    Object v29 = ((com.google.javascript.jscomp.LiveVariablesAnalysis)v28).createInitialEstimateLattice();
    Object v30 = ((com.google.javascript.jscomp.LiveVariablesAnalysis)v11).flowThrough(((com.google.javascript.rhino.Node)v15),((com.google.javascript.jscomp.LiveVariablesAnalysis.LiveVariableLattice)v29));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.StrictWarningsGuard();
    Object v1 = false;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -26;
    Object v5 = 81;
    Object v6 = -11;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = null;
    Object v9 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.jstype.ObjectType)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler();
    Object v11 = new com.google.javascript.jscomp.LiveVariablesAnalysis(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v9),((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v12 = -26;
    Object v13 = 81;
    Object v14 = -11;
    Object v15 = new com.google.javascript.rhino.Node((((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = new com.google.javascript.jscomp.StrictWarningsGuard();
    Object v17 = false;
    Object v18 = false;
    Object v19 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v16),(((java.lang.Boolean)v17).booleanValue()),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = -26;
    Object v21 = 81;
    Object v22 = -11;
    Object v23 = new com.google.javascript.rhino.Node((((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()));
    Object v24 = null;
    Object v25 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v23),((com.google.javascript.rhino.jstype.ObjectType)v24));
    Object v26 = new com.google.javascript.jscomp.Compiler();
    Object v27 = new com.google.javascript.jscomp.LiveVariablesAnalysis(((com.google.javascript.jscomp.ControlFlowGraph)v19),((com.google.javascript.jscomp.Scope)v25),((com.google.javascript.jscomp.AbstractCompiler)v26));
    Object v28 = ((com.google.javascript.jscomp.LiveVariablesAnalysis)v27).createEntryLattice();
    Object v29 = ((com.google.javascript.jscomp.LiveVariablesAnalysis)v11).flowThrough(((com.google.javascript.rhino.Node)v15),((com.google.javascript.jscomp.LiveVariablesAnalysis.LiveVariableLattice)v28));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.StrictWarningsGuard();
    Object v1 = false;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -26;
    Object v5 = 81;
    Object v6 = -11;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = null;
    Object v9 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.jstype.ObjectType)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler();
    Object v11 = new com.google.javascript.jscomp.LiveVariablesAnalysis(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v9),((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v12 = "^";
    Object v13 = ((com.google.javascript.jscomp.LiveVariablesAnalysis)v11).getVarIndex(((java.lang.String)v12));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.StrictWarningsGuard();
    Object v1 = false;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -26;
    Object v5 = 81;
    Object v6 = -11;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = null;
    Object v9 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.jstype.ObjectType)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler();
    Object v11 = new com.google.javascript.jscomp.LiveVariablesAnalysis(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v9),((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v12 = ((com.google.javascript.jscomp.LiveVariablesAnalysis)v11).isForward();
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.StrictWarningsGuard();
    Object v1 = false;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -26;
    Object v5 = 81;
    Object v6 = -11;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = null;
    Object v9 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.jstype.ObjectType)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler();
    Object v11 = new com.google.javascript.jscomp.LiveVariablesAnalysis(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v9),((com.google.javascript.jscomp.AbstractCompiler)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.StrictWarningsGuard();
    Object v1 = false;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -26;
    Object v5 = 81;
    Object v6 = -11;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = null;
    Object v9 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.jstype.ObjectType)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler();
    Object v11 = new com.google.javascript.jscomp.LiveVariablesAnalysis(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v9),((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v12 = ":";
    Object v13 = ((com.google.javascript.jscomp.LiveVariablesAnalysis)v11).getVarIndex(((java.lang.String)v12));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.StrictWarningsGuard();
    Object v1 = false;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -26;
    Object v5 = 81;
    Object v6 = -11;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = null;
    Object v9 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.jstype.ObjectType)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler();
    Object v11 = new com.google.javascript.jscomp.LiveVariablesAnalysis(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v9),((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v12 = -26;
    Object v13 = 81;
    Object v14 = -11;
    Object v15 = new com.google.javascript.rhino.Node((((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = new com.google.javascript.jscomp.StrictWarningsGuard();
    Object v17 = false;
    Object v18 = false;
    Object v19 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v16),(((java.lang.Boolean)v17).booleanValue()),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = -26;
    Object v21 = 81;
    Object v22 = -11;
    Object v23 = new com.google.javascript.rhino.Node((((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()));
    Object v24 = null;
    Object v25 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v23),((com.google.javascript.rhino.jstype.ObjectType)v24));
    Object v26 = new com.google.javascript.jscomp.Compiler();
    Object v27 = new com.google.javascript.jscomp.LiveVariablesAnalysis(((com.google.javascript.jscomp.ControlFlowGraph)v19),((com.google.javascript.jscomp.Scope)v25),((com.google.javascript.jscomp.AbstractCompiler)v26));
    Object v28 = ((com.google.javascript.jscomp.LiveVariablesAnalysis)v27).createEntryLattice();
    Object v29 = "RegExp";
    Object v30 = com.google.protobuf.ByteString.copyFromUtf8(((java.lang.String)v29));
    Object v31 = ((com.google.javascript.jscomp.LiveVariablesAnalysis.LiveVariableLattice)v28).equals(((java.lang.Object)v30));
    Object v32 = ((com.google.javascript.jscomp.LiveVariablesAnalysis)v11).flowThrough(((com.google.javascript.rhino.Node)v15),((com.google.javascript.jscomp.LiveVariablesAnalysis.LiveVariableLattice)v28));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.StrictWarningsGuard();
    Object v1 = false;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -26;
    Object v5 = 81;
    Object v6 = -11;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = null;
    Object v9 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.jstype.ObjectType)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler();
    Object v11 = new com.google.javascript.jscomp.LiveVariablesAnalysis(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v9),((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v12 = -26;
    Object v13 = 81;
    Object v14 = -11;
    Object v15 = new com.google.javascript.rhino.Node((((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = 5;
    Object v17 = ((com.google.javascript.rhino.Node)v15).getBooleanProp((((java.lang.Integer)v16).intValue()));
    Object v18 = new com.google.javascript.jscomp.StrictWarningsGuard();
    Object v19 = false;
    Object v20 = false;
    Object v21 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v18),(((java.lang.Boolean)v19).booleanValue()),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = -26;
    Object v23 = 81;
    Object v24 = -11;
    Object v25 = new com.google.javascript.rhino.Node((((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()),(((java.lang.Integer)v24).intValue()));
    Object v26 = null;
    Object v27 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v25),((com.google.javascript.rhino.jstype.ObjectType)v26));
    Object v28 = new com.google.javascript.jscomp.Compiler();
    Object v29 = new com.google.javascript.jscomp.LiveVariablesAnalysis(((com.google.javascript.jscomp.ControlFlowGraph)v21),((com.google.javascript.jscomp.Scope)v27),((com.google.javascript.jscomp.AbstractCompiler)v28));
    Object v30 = ((com.google.javascript.jscomp.LiveVariablesAnalysis)v29).createEntryLattice();
    Object v31 = ((com.google.javascript.jscomp.LiveVariablesAnalysis)v11).flowThrough(((com.google.javascript.rhino.Node)v15),((com.google.javascript.jscomp.LiveVariablesAnalysis.LiveVariableLattice)v30));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.StrictWarningsGuard();
    Object v1 = false;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -26;
    Object v5 = 81;
    Object v6 = -11;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = null;
    Object v9 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.jstype.ObjectType)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler();
    Object v11 = new com.google.javascript.jscomp.LiveVariablesAnalysis(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v9),((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v12 = -26;
    Object v13 = 81;
    Object v14 = -11;
    Object v15 = new com.google.javascript.rhino.Node((((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = false;
    ((com.google.javascript.rhino.Node)v15).setOptionalArg((((java.lang.Boolean)v16).booleanValue()));
    Object v17 = null;
    Object v18 = new com.google.javascript.jscomp.StrictWarningsGuard();
    Object v19 = false;
    Object v20 = false;
    Object v21 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v18),(((java.lang.Boolean)v19).booleanValue()),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = -26;
    Object v23 = 81;
    Object v24 = -11;
    Object v25 = new com.google.javascript.rhino.Node((((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()),(((java.lang.Integer)v24).intValue()));
    Object v26 = null;
    Object v27 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v25),((com.google.javascript.rhino.jstype.ObjectType)v26));
    Object v28 = new com.google.javascript.jscomp.Compiler();
    Object v29 = new com.google.javascript.jscomp.LiveVariablesAnalysis(((com.google.javascript.jscomp.ControlFlowGraph)v21),((com.google.javascript.jscomp.Scope)v27),((com.google.javascript.jscomp.AbstractCompiler)v28));
    Object v30 = ((com.google.javascript.jscomp.LiveVariablesAnalysis)v29).createInitialEstimateLattice();
    Object v31 = -26;
    Object v32 = 81;
    Object v33 = -11;
    Object v34 = new com.google.javascript.rhino.Node((((java.lang.Integer)v31).intValue()),(((java.lang.Integer)v32).intValue()),(((java.lang.Integer)v33).intValue()));
    Object v35 = null;
    Object v36 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v34),((com.google.javascript.rhino.jstype.ObjectType)v35));
    Object v37 = ((com.google.javascript.jscomp.LiveVariablesAnalysis.LiveVariableLattice)v30).equals(((java.lang.Object)v36));
    Object v38 = ((com.google.javascript.jscomp.LiveVariablesAnalysis)v11).flowThrough(((com.google.javascript.rhino.Node)v15),((com.google.javascript.jscomp.LiveVariablesAnalysis.LiveVariableLattice)v30));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.StrictWarningsGuard();
    Object v1 = false;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -26;
    Object v5 = 81;
    Object v6 = -11;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = null;
    Object v9 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.jstype.ObjectType)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler();
    Object v11 = new com.google.javascript.jscomp.LiveVariablesAnalysis(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v9),((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v12 = -26;
    Object v13 = 81;
    Object v14 = -11;
    Object v15 = new com.google.javascript.rhino.Node((((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = new com.google.javascript.jscomp.StrictWarningsGuard();
    Object v17 = false;
    Object v18 = false;
    Object v19 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v16),(((java.lang.Boolean)v17).booleanValue()),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = -26;
    Object v21 = 81;
    Object v22 = -11;
    Object v23 = new com.google.javascript.rhino.Node((((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()));
    Object v24 = null;
    Object v25 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v23),((com.google.javascript.rhino.jstype.ObjectType)v24));
    Object v26 = new com.google.javascript.jscomp.Compiler();
    Object v27 = new com.google.javascript.jscomp.LiveVariablesAnalysis(((com.google.javascript.jscomp.ControlFlowGraph)v19),((com.google.javascript.jscomp.Scope)v25),((com.google.javascript.jscomp.AbstractCompiler)v26));
    Object v28 = ((com.google.javascript.jscomp.LiveVariablesAnalysis)v27).createInitialEstimateLattice();
    Object v29 = -26;
    Object v30 = 81;
    Object v31 = -11;
    Object v32 = new com.google.javascript.rhino.Node((((java.lang.Integer)v29).intValue()),(((java.lang.Integer)v30).intValue()),(((java.lang.Integer)v31).intValue()));
    Object v33 = ((com.google.javascript.jscomp.LiveVariablesAnalysis.LiveVariableLattice)v28).equals(((java.lang.Object)v32));
    Object v34 = ((com.google.javascript.jscomp.LiveVariablesAnalysis)v11).flowThrough(((com.google.javascript.rhino.Node)v15),((com.google.javascript.jscomp.LiveVariablesAnalysis.LiveVariableLattice)v28));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.StrictWarningsGuard();
    Object v1 = false;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -26;
    Object v5 = 81;
    Object v6 = -11;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = null;
    Object v9 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.jstype.ObjectType)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler();
    Object v11 = new com.google.javascript.jscomp.LiveVariablesAnalysis(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v9),((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v12 = -26;
    Object v13 = 81;
    Object v14 = -11;
    Object v15 = new com.google.javascript.rhino.Node((((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = new com.google.javascript.jscomp.StrictWarningsGuard();
    Object v17 = false;
    Object v18 = false;
    Object v19 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v16),(((java.lang.Boolean)v17).booleanValue()),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = -26;
    Object v21 = 81;
    Object v22 = -11;
    Object v23 = new com.google.javascript.rhino.Node((((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()));
    Object v24 = null;
    Object v25 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v23),((com.google.javascript.rhino.jstype.ObjectType)v24));
    Object v26 = new com.google.javascript.jscomp.Compiler();
    Object v27 = new com.google.javascript.jscomp.LiveVariablesAnalysis(((com.google.javascript.jscomp.ControlFlowGraph)v19),((com.google.javascript.jscomp.Scope)v25),((com.google.javascript.jscomp.AbstractCompiler)v26));
    Object v28 = ((com.google.javascript.jscomp.LiveVariablesAnalysis)v27).createInitialEstimateLattice();
    Object v29 = "RegExp";
    Object v30 = com.google.protobuf.ByteString.copyFromUtf8(((java.lang.String)v29));
    Object v31 = ((com.google.javascript.jscomp.LiveVariablesAnalysis.LiveVariableLattice)v28).equals(((java.lang.Object)v30));
    Object v32 = ((com.google.javascript.jscomp.LiveVariablesAnalysis)v11).flowThrough(((com.google.javascript.rhino.Node)v15),((com.google.javascript.jscomp.LiveVariablesAnalysis.LiveVariableLattice)v28));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.StrictWarningsGuard();
    Object v1 = false;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -26;
    Object v5 = 81;
    Object v6 = -11;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = null;
    Object v9 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.jstype.ObjectType)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler();
    Object v11 = new com.google.javascript.jscomp.LiveVariablesAnalysis(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v9),((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v12 = -26;
    Object v13 = 81;
    Object v14 = -11;
    Object v15 = new com.google.javascript.rhino.Node((((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = 0;
    Object v17 = ((com.google.javascript.rhino.Node)v15).getProp((((java.lang.Integer)v16).intValue()));
    Object v18 = new com.google.javascript.jscomp.StrictWarningsGuard();
    Object v19 = false;
    Object v20 = false;
    Object v21 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v18),(((java.lang.Boolean)v19).booleanValue()),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = -26;
    Object v23 = 81;
    Object v24 = -11;
    Object v25 = new com.google.javascript.rhino.Node((((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()),(((java.lang.Integer)v24).intValue()));
    Object v26 = null;
    Object v27 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v25),((com.google.javascript.rhino.jstype.ObjectType)v26));
    Object v28 = new com.google.javascript.jscomp.Compiler();
    Object v29 = new com.google.javascript.jscomp.LiveVariablesAnalysis(((com.google.javascript.jscomp.ControlFlowGraph)v21),((com.google.javascript.jscomp.Scope)v27),((com.google.javascript.jscomp.AbstractCompiler)v28));
    Object v30 = ((com.google.javascript.jscomp.LiveVariablesAnalysis)v29).createEntryLattice();
    Object v31 = ((com.google.javascript.jscomp.LiveVariablesAnalysis)v11).flowThrough(((com.google.javascript.rhino.Node)v15),((com.google.javascript.jscomp.LiveVariablesAnalysis.LiveVariableLattice)v30));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.StrictWarningsGuard();
    Object v1 = false;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -26;
    Object v5 = 81;
    Object v6 = -11;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = null;
    Object v9 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.jstype.ObjectType)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler();
    Object v11 = new com.google.javascript.jscomp.LiveVariablesAnalysis(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v9),((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v12 = -26;
    Object v13 = 81;
    Object v14 = -11;
    Object v15 = new com.google.javascript.rhino.Node((((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = new com.google.javascript.jscomp.StrictWarningsGuard();
    Object v17 = false;
    Object v18 = false;
    Object v19 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v16),(((java.lang.Boolean)v17).booleanValue()),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = -26;
    Object v21 = 81;
    Object v22 = -11;
    Object v23 = new com.google.javascript.rhino.Node((((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()));
    Object v24 = null;
    Object v25 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v23),((com.google.javascript.rhino.jstype.ObjectType)v24));
    Object v26 = new com.google.javascript.jscomp.Compiler();
    Object v27 = new com.google.javascript.jscomp.LiveVariablesAnalysis(((com.google.javascript.jscomp.ControlFlowGraph)v19),((com.google.javascript.jscomp.Scope)v25),((com.google.javascript.jscomp.AbstractCompiler)v26));
    Object v28 = ((com.google.javascript.jscomp.LiveVariablesAnalysis)v27).createEntryLattice();
    Object v29 = com.google.protobuf.ExtensionRegistryLite.getEmptyRegistry();
    Object v30 = ((com.google.javascript.jscomp.LiveVariablesAnalysis.LiveVariableLattice)v28).equals(((java.lang.Object)v29));
    Object v31 = ((com.google.javascript.jscomp.LiveVariablesAnalysis)v11).flowThrough(((com.google.javascript.rhino.Node)v15),((com.google.javascript.jscomp.LiveVariablesAnalysis.LiveVariableLattice)v28));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.StrictWarningsGuard();
    Object v1 = false;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -26;
    Object v5 = 81;
    Object v6 = -11;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = null;
    Object v9 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.jstype.ObjectType)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler();
    Object v11 = new com.google.javascript.jscomp.LiveVariablesAnalysis(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v9),((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v12 = -26;
    Object v13 = 81;
    Object v14 = -11;
    Object v15 = new com.google.javascript.rhino.Node((((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = "\\";
    Object v17 = new com.google.javascript.rhino.InputId(((java.lang.String)v16));
    ((com.google.javascript.rhino.Node)v15).setInputId(((com.google.javascript.rhino.InputId)v17));
    Object v18 = null;
    Object v19 = new com.google.javascript.jscomp.StrictWarningsGuard();
    Object v20 = false;
    Object v21 = false;
    Object v22 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v19),(((java.lang.Boolean)v20).booleanValue()),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = -26;
    Object v24 = 81;
    Object v25 = -11;
    Object v26 = new com.google.javascript.rhino.Node((((java.lang.Integer)v23).intValue()),(((java.lang.Integer)v24).intValue()),(((java.lang.Integer)v25).intValue()));
    Object v27 = null;
    Object v28 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v26),((com.google.javascript.rhino.jstype.ObjectType)v27));
    Object v29 = new com.google.javascript.jscomp.Compiler();
    Object v30 = new com.google.javascript.jscomp.LiveVariablesAnalysis(((com.google.javascript.jscomp.ControlFlowGraph)v22),((com.google.javascript.jscomp.Scope)v28),((com.google.javascript.jscomp.AbstractCompiler)v29));
    Object v31 = ((com.google.javascript.jscomp.LiveVariablesAnalysis)v30).createInitialEstimateLattice();
    Object v32 = ((com.google.javascript.jscomp.LiveVariablesAnalysis)v11).flowThrough(((com.google.javascript.rhino.Node)v15),((com.google.javascript.jscomp.LiveVariablesAnalysis.LiveVariableLattice)v31));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.StrictWarningsGuard();
    Object v1 = false;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -26;
    Object v5 = 81;
    Object v6 = -11;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = null;
    Object v9 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.jstype.ObjectType)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler();
    Object v11 = new com.google.javascript.jscomp.LiveVariablesAnalysis(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v9),((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v12 = -26;
    Object v13 = 81;
    Object v14 = -11;
    Object v15 = new com.google.javascript.rhino.Node((((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = new com.google.javascript.jscomp.StrictWarningsGuard();
    Object v17 = false;
    Object v18 = false;
    Object v19 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v16),(((java.lang.Boolean)v17).booleanValue()),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = -26;
    Object v21 = 81;
    Object v22 = -11;
    Object v23 = new com.google.javascript.rhino.Node((((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()));
    Object v24 = null;
    Object v25 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v23),((com.google.javascript.rhino.jstype.ObjectType)v24));
    Object v26 = new com.google.javascript.jscomp.Compiler();
    Object v27 = new com.google.javascript.jscomp.LiveVariablesAnalysis(((com.google.javascript.jscomp.ControlFlowGraph)v19),((com.google.javascript.jscomp.Scope)v25),((com.google.javascript.jscomp.AbstractCompiler)v26));
    Object v28 = ((com.google.javascript.jscomp.LiveVariablesAnalysis)v27).createEntryLattice();
    Object v29 = -26;
    Object v30 = 81;
    Object v31 = -11;
    Object v32 = new com.google.javascript.rhino.Node((((java.lang.Integer)v29).intValue()),(((java.lang.Integer)v30).intValue()),(((java.lang.Integer)v31).intValue()));
    Object v33 = null;
    Object v34 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v32),((com.google.javascript.rhino.jstype.ObjectType)v33));
    Object v35 = ((com.google.javascript.jscomp.LiveVariablesAnalysis.LiveVariableLattice)v28).equals(((java.lang.Object)v34));
    Object v36 = ((com.google.javascript.jscomp.LiveVariablesAnalysis)v11).flowThrough(((com.google.javascript.rhino.Node)v15),((com.google.javascript.jscomp.LiveVariablesAnalysis.LiveVariableLattice)v28));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.StrictWarningsGuard();
    Object v1 = false;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -26;
    Object v5 = 81;
    Object v6 = -11;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = null;
    Object v9 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.jstype.ObjectType)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler();
    Object v11 = new com.google.javascript.jscomp.LiveVariablesAnalysis(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v9),((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v12 = -26;
    Object v13 = 81;
    Object v14 = -11;
    Object v15 = new com.google.javascript.rhino.Node((((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = new com.google.javascript.jscomp.StrictWarningsGuard();
    Object v17 = false;
    Object v18 = false;
    Object v19 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v16),(((java.lang.Boolean)v17).booleanValue()),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = -26;
    Object v21 = 81;
    Object v22 = -11;
    Object v23 = new com.google.javascript.rhino.Node((((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()));
    Object v24 = null;
    Object v25 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v23),((com.google.javascript.rhino.jstype.ObjectType)v24));
    Object v26 = new com.google.javascript.jscomp.Compiler();
    Object v27 = new com.google.javascript.jscomp.LiveVariablesAnalysis(((com.google.javascript.jscomp.ControlFlowGraph)v19),((com.google.javascript.jscomp.Scope)v25),((com.google.javascript.jscomp.AbstractCompiler)v26));
    Object v28 = ((com.google.javascript.jscomp.LiveVariablesAnalysis)v27).createEntryLattice();
    Object v29 = 11;
    Object v30 = ((com.google.javascript.jscomp.LiveVariablesAnalysis.LiveVariableLattice)v28).isLive((((java.lang.Integer)v29).intValue()));
    Object v31 = ((com.google.javascript.jscomp.LiveVariablesAnalysis)v11).flowThrough(((com.google.javascript.rhino.Node)v15),((com.google.javascript.jscomp.LiveVariablesAnalysis.LiveVariableLattice)v28));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.StrictWarningsGuard();
    Object v1 = false;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.google.javascript.jscomp.graph.LinkedDirectedGraph)v3).newSubGraph();
    Object v5 = -26;
    Object v6 = 81;
    Object v7 = -11;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.jstype.ObjectType)v9));
    Object v11 = new com.google.javascript.jscomp.Compiler();
    Object v12 = new com.google.javascript.jscomp.LiveVariablesAnalysis(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v10),((com.google.javascript.jscomp.AbstractCompiler)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.StrictWarningsGuard();
    Object v1 = false;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.google.javascript.jscomp.graph.LinkedDirectedGraph)v3).newSubGraph();
    Object v5 = -26;
    Object v6 = 81;
    Object v7 = -11;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.jstype.ObjectType)v9));
    Object v11 = new com.google.javascript.jscomp.Compiler();
    Object v12 = new com.google.javascript.jscomp.LiveVariablesAnalysis(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v10),((com.google.javascript.jscomp.AbstractCompiler)v11));
    Object v13 = "";
    Object v14 = ((com.google.javascript.jscomp.LiveVariablesAnalysis)v12).getVarIndex(((java.lang.String)v13));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.StrictWarningsGuard();
    Object v1 = false;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.google.javascript.jscomp.graph.LinkedDirectedGraph)v3).newSubGraph();
    Object v5 = -26;
    Object v6 = 81;
    Object v7 = -11;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.jstype.ObjectType)v9));
    Object v11 = new com.google.javascript.jscomp.Compiler();
    Object v12 = new com.google.javascript.jscomp.LiveVariablesAnalysis(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v10),((com.google.javascript.jscomp.AbstractCompiler)v11));
    Object v13 = -26;
    Object v14 = 81;
    Object v15 = -11;
    Object v16 = new com.google.javascript.rhino.Node((((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = new com.google.javascript.jscomp.StrictWarningsGuard();
    Object v18 = false;
    Object v19 = false;
    Object v20 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v17),(((java.lang.Boolean)v18).booleanValue()),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = -26;
    Object v22 = 81;
    Object v23 = -11;
    Object v24 = new com.google.javascript.rhino.Node((((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()));
    Object v25 = null;
    Object v26 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v24),((com.google.javascript.rhino.jstype.ObjectType)v25));
    Object v27 = new com.google.javascript.jscomp.Compiler();
    Object v28 = new com.google.javascript.jscomp.LiveVariablesAnalysis(((com.google.javascript.jscomp.ControlFlowGraph)v20),((com.google.javascript.jscomp.Scope)v26),((com.google.javascript.jscomp.AbstractCompiler)v27));
    Object v29 = ((com.google.javascript.jscomp.LiveVariablesAnalysis)v28).createInitialEstimateLattice();
    Object v30 = ((com.google.javascript.jscomp.LiveVariablesAnalysis)v12).flowThrough(((com.google.javascript.rhino.Node)v16),((com.google.javascript.jscomp.LiveVariablesAnalysis.LiveVariableLattice)v29));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.StrictWarningsGuard();
    Object v1 = false;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.google.javascript.jscomp.graph.LinkedDirectedGraph)v3).newSubGraph();
    Object v5 = -26;
    Object v6 = 81;
    Object v7 = -11;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.jstype.ObjectType)v9));
    Object v11 = new com.google.javascript.jscomp.Compiler();
    Object v12 = new com.google.javascript.jscomp.LiveVariablesAnalysis(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v10),((com.google.javascript.jscomp.AbstractCompiler)v11));
    Object v13 = -26;
    Object v14 = 81;
    Object v15 = -11;
    Object v16 = new com.google.javascript.rhino.Node((((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = new com.google.javascript.jscomp.StrictWarningsGuard();
    Object v18 = false;
    Object v19 = false;
    Object v20 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v17),(((java.lang.Boolean)v18).booleanValue()),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = -26;
    Object v22 = 81;
    Object v23 = -11;
    Object v24 = new com.google.javascript.rhino.Node((((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()));
    Object v25 = null;
    Object v26 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v24),((com.google.javascript.rhino.jstype.ObjectType)v25));
    Object v27 = new com.google.javascript.jscomp.Compiler();
    Object v28 = new com.google.javascript.jscomp.LiveVariablesAnalysis(((com.google.javascript.jscomp.ControlFlowGraph)v20),((com.google.javascript.jscomp.Scope)v26),((com.google.javascript.jscomp.AbstractCompiler)v27));
    Object v29 = ((com.google.javascript.jscomp.LiveVariablesAnalysis)v28).createEntryLattice();
    Object v30 = ((com.google.javascript.jscomp.LiveVariablesAnalysis)v12).flowThrough(((com.google.javascript.rhino.Node)v16),((com.google.javascript.jscomp.LiveVariablesAnalysis.LiveVariableLattice)v29));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.StrictWarningsGuard();
    Object v1 = false;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.google.javascript.jscomp.graph.LinkedDirectedGraph)v3).newSubGraph();
    Object v5 = -26;
    Object v6 = 81;
    Object v7 = -11;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.jstype.ObjectType)v9));
    Object v11 = new com.google.javascript.jscomp.Compiler();
    Object v12 = new com.google.javascript.jscomp.LiveVariablesAnalysis(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v10),((com.google.javascript.jscomp.AbstractCompiler)v11));
    ((com.google.javascript.jscomp.LiveVariablesAnalysis)v12).markAllParametersEscaped();
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.StrictWarningsGuard();
    Object v1 = false;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -26;
    Object v5 = 81;
    Object v6 = -11;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = null;
    Object v9 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.jstype.ObjectType)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v10).reportCodeChange();
    Object v11 = null;
    Object v12 = new com.google.javascript.jscomp.LiveVariablesAnalysis(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v9),((com.google.javascript.jscomp.AbstractCompiler)v10));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.StrictWarningsGuard();
    Object v1 = false;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -26;
    Object v5 = 81;
    Object v6 = -11;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = null;
    Object v9 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.jstype.ObjectType)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v10).reportCodeChange();
    Object v11 = null;
    Object v12 = new com.google.javascript.jscomp.LiveVariablesAnalysis(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v9),((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v13 = "";
    Object v14 = ((com.google.javascript.jscomp.LiveVariablesAnalysis)v12).getVarIndex(((java.lang.String)v13));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.StrictWarningsGuard();
    Object v1 = false;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -26;
    Object v5 = 81;
    Object v6 = -11;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = null;
    Object v9 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.jstype.ObjectType)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v10).reportCodeChange();
    Object v11 = null;
    Object v12 = new com.google.javascript.jscomp.LiveVariablesAnalysis(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v9),((com.google.javascript.jscomp.AbstractCompiler)v10));
    ((com.google.javascript.jscomp.LiveVariablesAnalysis)v12).markAllParametersEscaped();
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.StrictWarningsGuard();
    Object v1 = false;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -26;
    Object v5 = 81;
    Object v6 = -11;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = null;
    Object v9 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.jstype.ObjectType)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v10).reportCodeChange();
    Object v11 = null;
    Object v12 = new com.google.javascript.jscomp.LiveVariablesAnalysis(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v9),((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v13 = -26;
    Object v14 = 81;
    Object v15 = -11;
    Object v16 = new com.google.javascript.rhino.Node((((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = new com.google.javascript.jscomp.StrictWarningsGuard();
    Object v18 = false;
    Object v19 = false;
    Object v20 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v17),(((java.lang.Boolean)v18).booleanValue()),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = -26;
    Object v22 = 81;
    Object v23 = -11;
    Object v24 = new com.google.javascript.rhino.Node((((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()));
    Object v25 = null;
    Object v26 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v24),((com.google.javascript.rhino.jstype.ObjectType)v25));
    Object v27 = new com.google.javascript.jscomp.Compiler();
    Object v28 = new com.google.javascript.jscomp.LiveVariablesAnalysis(((com.google.javascript.jscomp.ControlFlowGraph)v20),((com.google.javascript.jscomp.Scope)v26),((com.google.javascript.jscomp.AbstractCompiler)v27));
    Object v29 = ((com.google.javascript.jscomp.LiveVariablesAnalysis)v28).createEntryLattice();
    Object v30 = ((com.google.javascript.jscomp.LiveVariablesAnalysis)v12).flowThrough(((com.google.javascript.rhino.Node)v16),((com.google.javascript.jscomp.LiveVariablesAnalysis.LiveVariableLattice)v29));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.StrictWarningsGuard();
    Object v1 = false;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -26;
    Object v5 = 81;
    Object v6 = -11;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = null;
    Object v9 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.jstype.ObjectType)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v10).reportCodeChange();
    Object v11 = null;
    Object v12 = new com.google.javascript.jscomp.LiveVariablesAnalysis(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v9),((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v13 = ((com.google.javascript.jscomp.LiveVariablesAnalysis)v12).createEntryLattice();
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.StrictWarningsGuard();
    Object v1 = false;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -26;
    Object v5 = 81;
    Object v6 = -11;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = null;
    Object v9 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.jstype.ObjectType)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler();
    Object v11 = ((com.google.javascript.jscomp.AbstractCompiler)v10).getErrorManager();
    Object v12 = new com.google.javascript.jscomp.LiveVariablesAnalysis(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v9),((com.google.javascript.jscomp.AbstractCompiler)v10));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.StrictWarningsGuard();
    Object v1 = false;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -26;
    Object v5 = 81;
    Object v6 = -11;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = null;
    Object v9 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.jstype.ObjectType)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler();
    Object v11 = ((com.google.javascript.jscomp.AbstractCompiler)v10).getErrorManager();
    Object v12 = new com.google.javascript.jscomp.LiveVariablesAnalysis(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v9),((com.google.javascript.jscomp.AbstractCompiler)v10));
    ((com.google.javascript.jscomp.LiveVariablesAnalysis)v12).markAllParametersEscaped();
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.StrictWarningsGuard();
    Object v1 = false;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -26;
    Object v5 = 81;
    Object v6 = -11;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = null;
    Object v9 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.jstype.ObjectType)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v10).reportCodeChange();
    Object v11 = null;
    Object v12 = new com.google.javascript.jscomp.LiveVariablesAnalysis(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v9),((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v13 = -26;
    Object v14 = 81;
    Object v15 = -11;
    Object v16 = new com.google.javascript.rhino.Node((((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = ((com.google.javascript.rhino.Node)v16).hasSideEffects();
    Object v18 = new com.google.javascript.jscomp.StrictWarningsGuard();
    Object v19 = false;
    Object v20 = false;
    Object v21 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v18),(((java.lang.Boolean)v19).booleanValue()),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = -26;
    Object v23 = 81;
    Object v24 = -11;
    Object v25 = new com.google.javascript.rhino.Node((((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()),(((java.lang.Integer)v24).intValue()));
    Object v26 = null;
    Object v27 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v25),((com.google.javascript.rhino.jstype.ObjectType)v26));
    Object v28 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v28).reportCodeChange();
    Object v29 = null;
    Object v30 = new com.google.javascript.jscomp.LiveVariablesAnalysis(((com.google.javascript.jscomp.ControlFlowGraph)v21),((com.google.javascript.jscomp.Scope)v27),((com.google.javascript.jscomp.AbstractCompiler)v28));
    Object v31 = ((com.google.javascript.jscomp.LiveVariablesAnalysis)v30).createEntryLattice();
    Object v32 = ((com.google.javascript.jscomp.LiveVariablesAnalysis)v12).flowThrough(((com.google.javascript.rhino.Node)v16),((com.google.javascript.jscomp.LiveVariablesAnalysis.LiveVariableLattice)v31));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.StrictWarningsGuard();
    Object v1 = false;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -26;
    Object v5 = 81;
    Object v6 = -11;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = null;
    Object v9 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.jstype.ObjectType)v8));
    Object v10 = "";
    Object v11 = ((com.google.javascript.jscomp.Scope)v9).getVar(((java.lang.String)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.LiveVariablesAnalysis(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v9),((com.google.javascript.jscomp.AbstractCompiler)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.StrictWarningsGuard();
    Object v1 = false;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -26;
    Object v5 = 81;
    Object v6 = -11;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = null;
    Object v9 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.jstype.ObjectType)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler();
    Object v11 = ((com.google.javascript.jscomp.AbstractCompiler)v10).getErrorManager();
    Object v12 = new com.google.javascript.jscomp.LiveVariablesAnalysis(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v9),((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v13 = -26;
    Object v14 = 81;
    Object v15 = -11;
    Object v16 = new com.google.javascript.rhino.Node((((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = new com.google.javascript.jscomp.StrictWarningsGuard();
    Object v18 = false;
    Object v19 = false;
    Object v20 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v17),(((java.lang.Boolean)v18).booleanValue()),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = -26;
    Object v22 = 81;
    Object v23 = -11;
    Object v24 = new com.google.javascript.rhino.Node((((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()));
    Object v25 = null;
    Object v26 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v24),((com.google.javascript.rhino.jstype.ObjectType)v25));
    Object v27 = new com.google.javascript.jscomp.Compiler();
    Object v28 = new com.google.javascript.jscomp.LiveVariablesAnalysis(((com.google.javascript.jscomp.ControlFlowGraph)v20),((com.google.javascript.jscomp.Scope)v26),((com.google.javascript.jscomp.AbstractCompiler)v27));
    Object v29 = ((com.google.javascript.jscomp.LiveVariablesAnalysis)v28).createEntryLattice();
    Object v30 = ((com.google.javascript.jscomp.LiveVariablesAnalysis)v12).flowThrough(((com.google.javascript.rhino.Node)v16),((com.google.javascript.jscomp.LiveVariablesAnalysis.LiveVariableLattice)v29));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.StrictWarningsGuard();
    Object v1 = false;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -26;
    Object v5 = 81;
    Object v6 = -11;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = null;
    Object v9 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.jstype.ObjectType)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler();
    Object v11 = ((com.google.javascript.jscomp.AbstractCompiler)v10).getTopScope();
    Object v12 = new com.google.javascript.jscomp.LiveVariablesAnalysis(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v9),((com.google.javascript.jscomp.AbstractCompiler)v10));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.StrictWarningsGuard();
    Object v1 = false;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -26;
    Object v5 = 81;
    Object v6 = -11;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = null;
    Object v9 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.jstype.ObjectType)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler();
    Object v11 = ((com.google.javascript.jscomp.AbstractCompiler)v10).getTopScope();
    Object v12 = new com.google.javascript.jscomp.LiveVariablesAnalysis(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v9),((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v13 = -26;
    Object v14 = 81;
    Object v15 = -11;
    Object v16 = new com.google.javascript.rhino.Node((((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = new com.google.javascript.jscomp.StrictWarningsGuard();
    Object v18 = false;
    Object v19 = false;
    Object v20 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v17),(((java.lang.Boolean)v18).booleanValue()),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = -26;
    Object v22 = 81;
    Object v23 = -11;
    Object v24 = new com.google.javascript.rhino.Node((((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()));
    Object v25 = null;
    Object v26 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v24),((com.google.javascript.rhino.jstype.ObjectType)v25));
    Object v27 = new com.google.javascript.jscomp.Compiler();
    Object v28 = new com.google.javascript.jscomp.LiveVariablesAnalysis(((com.google.javascript.jscomp.ControlFlowGraph)v20),((com.google.javascript.jscomp.Scope)v26),((com.google.javascript.jscomp.AbstractCompiler)v27));
    Object v29 = ((com.google.javascript.jscomp.LiveVariablesAnalysis)v28).createEntryLattice();
    Object v30 = ((com.google.javascript.jscomp.LiveVariablesAnalysis)v12).flowThrough(((com.google.javascript.rhino.Node)v16),((com.google.javascript.jscomp.LiveVariablesAnalysis.LiveVariableLattice)v29));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.StrictWarningsGuard();
    Object v1 = false;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -26;
    Object v5 = 81;
    Object v6 = -11;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = null;
    Object v9 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.jstype.ObjectType)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler();
    Object v11 = ((com.google.javascript.jscomp.AbstractCompiler)v10).getTopScope();
    Object v12 = new com.google.javascript.jscomp.LiveVariablesAnalysis(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v9),((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v13 = -26;
    Object v14 = 81;
    Object v15 = -11;
    Object v16 = new com.google.javascript.rhino.Node((((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = "\\";
    Object v18 = new com.google.javascript.rhino.InputId(((java.lang.String)v17));
    ((com.google.javascript.rhino.Node)v16).setInputId(((com.google.javascript.rhino.InputId)v18));
    Object v19 = null;
    Object v20 = new com.google.javascript.jscomp.StrictWarningsGuard();
    Object v21 = false;
    Object v22 = false;
    Object v23 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v20),(((java.lang.Boolean)v21).booleanValue()),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = -26;
    Object v25 = 81;
    Object v26 = -11;
    Object v27 = new com.google.javascript.rhino.Node((((java.lang.Integer)v24).intValue()),(((java.lang.Integer)v25).intValue()),(((java.lang.Integer)v26).intValue()));
    Object v28 = null;
    Object v29 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v27),((com.google.javascript.rhino.jstype.ObjectType)v28));
    Object v30 = new com.google.javascript.jscomp.Compiler();
    Object v31 = new com.google.javascript.jscomp.LiveVariablesAnalysis(((com.google.javascript.jscomp.ControlFlowGraph)v23),((com.google.javascript.jscomp.Scope)v29),((com.google.javascript.jscomp.AbstractCompiler)v30));
    Object v32 = ((com.google.javascript.jscomp.LiveVariablesAnalysis)v31).createInitialEstimateLattice();
    Object v33 = ((com.google.javascript.jscomp.LiveVariablesAnalysis.LiveVariableLattice)v32).toString();
    Object v34 = ((com.google.javascript.jscomp.LiveVariablesAnalysis)v12).flowThrough(((com.google.javascript.rhino.Node)v16),((com.google.javascript.jscomp.LiveVariablesAnalysis.LiveVariableLattice)v32));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.StrictWarningsGuard();
    Object v1 = false;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -26;
    Object v5 = 81;
    Object v6 = -11;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = null;
    Object v9 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.jstype.ObjectType)v8));
    Object v10 = "";
    Object v11 = ((com.google.javascript.jscomp.Scope)v9).getVar(((java.lang.String)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.LiveVariablesAnalysis(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v9),((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = -26;
    Object v15 = 81;
    Object v16 = -11;
    Object v17 = new com.google.javascript.rhino.Node((((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = new com.google.javascript.jscomp.StrictWarningsGuard();
    Object v19 = false;
    Object v20 = false;
    Object v21 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v18),(((java.lang.Boolean)v19).booleanValue()),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = -26;
    Object v23 = 81;
    Object v24 = -11;
    Object v25 = new com.google.javascript.rhino.Node((((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()),(((java.lang.Integer)v24).intValue()));
    Object v26 = null;
    Object v27 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v25),((com.google.javascript.rhino.jstype.ObjectType)v26));
    Object v28 = new com.google.javascript.jscomp.Compiler();
    Object v29 = new com.google.javascript.jscomp.LiveVariablesAnalysis(((com.google.javascript.jscomp.ControlFlowGraph)v21),((com.google.javascript.jscomp.Scope)v27),((com.google.javascript.jscomp.AbstractCompiler)v28));
    Object v30 = ((com.google.javascript.jscomp.LiveVariablesAnalysis)v29).createInitialEstimateLattice();
    Object v31 = ((com.google.javascript.jscomp.LiveVariablesAnalysis)v13).flowThrough(((com.google.javascript.rhino.Node)v17),((com.google.javascript.jscomp.LiveVariablesAnalysis.LiveVariableLattice)v30));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.StrictWarningsGuard();
    Object v1 = false;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -26;
    Object v5 = 81;
    Object v6 = -11;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = null;
    Object v9 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.jstype.ObjectType)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler();
    Object v11 = ((com.google.javascript.jscomp.AbstractCompiler)v10).getTopScope();
    Object v12 = new com.google.javascript.jscomp.LiveVariablesAnalysis(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v9),((com.google.javascript.jscomp.AbstractCompiler)v10));
    ((com.google.javascript.jscomp.LiveVariablesAnalysis)v12).markAllParametersEscaped();
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.StrictWarningsGuard();
    Object v1 = false;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -26;
    Object v5 = 81;
    Object v6 = -11;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = null;
    Object v9 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.jstype.ObjectType)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler();
    Object v11 = ((com.google.javascript.jscomp.AbstractCompiler)v10).getTopScope();
    Object v12 = new com.google.javascript.jscomp.LiveVariablesAnalysis(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v9),((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v13 = ((com.google.javascript.jscomp.LiveVariablesAnalysis)v12).isForward();
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.StrictWarningsGuard();
    Object v1 = false;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.google.javascript.jscomp.graph.LinkedDirectedGraph)v3).newSubGraph();
    Object v5 = -26;
    Object v6 = 81;
    Object v7 = -11;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.jstype.ObjectType)v9));
    Object v11 = new com.google.javascript.jscomp.Compiler();
    Object v12 = new com.google.javascript.jscomp.LiveVariablesAnalysis(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v10),((com.google.javascript.jscomp.AbstractCompiler)v11));
    Object v13 = -26;
    Object v14 = 81;
    Object v15 = -11;
    Object v16 = new com.google.javascript.rhino.Node((((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = new com.google.javascript.jscomp.StrictWarningsGuard();
    Object v18 = false;
    Object v19 = false;
    Object v20 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v17),(((java.lang.Boolean)v18).booleanValue()),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = -26;
    Object v22 = 81;
    Object v23 = -11;
    Object v24 = new com.google.javascript.rhino.Node((((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()));
    Object v25 = null;
    Object v26 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v24),((com.google.javascript.rhino.jstype.ObjectType)v25));
    Object v27 = new com.google.javascript.jscomp.Compiler();
    Object v28 = new com.google.javascript.jscomp.LiveVariablesAnalysis(((com.google.javascript.jscomp.ControlFlowGraph)v20),((com.google.javascript.jscomp.Scope)v26),((com.google.javascript.jscomp.AbstractCompiler)v27));
    Object v29 = ((com.google.javascript.jscomp.LiveVariablesAnalysis)v28).createEntryLattice();
    Object v30 = ((com.google.javascript.jscomp.LiveVariablesAnalysis.LiveVariableLattice)v29).toString();
    Object v31 = ((com.google.javascript.jscomp.LiveVariablesAnalysis)v12).flowThrough(((com.google.javascript.rhino.Node)v16),((com.google.javascript.jscomp.LiveVariablesAnalysis.LiveVariableLattice)v29));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.StrictWarningsGuard();
    Object v1 = false;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -26;
    Object v5 = 81;
    Object v6 = -11;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = null;
    Object v9 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.jstype.ObjectType)v8));
    Object v10 = "";
    Object v11 = ((com.google.javascript.jscomp.Scope)v9).getVar(((java.lang.String)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.LiveVariablesAnalysis(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v9),((com.google.javascript.jscomp.AbstractCompiler)v12));
    ((com.google.javascript.jscomp.LiveVariablesAnalysis)v13).markAllParametersEscaped();
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.StrictWarningsGuard();
    Object v1 = false;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -26;
    Object v5 = 81;
    Object v6 = -11;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = null;
    Object v9 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.jstype.ObjectType)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler();
    Object v11 = new com.google.javascript.jscomp.LiveVariablesAnalysis(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v9),((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v12 = -26;
    Object v13 = 81;
    Object v14 = -11;
    Object v15 = new com.google.javascript.rhino.Node((((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = ((com.google.javascript.rhino.Node)v15).hasSideEffects();
    Object v17 = new com.google.javascript.jscomp.StrictWarningsGuard();
    Object v18 = false;
    Object v19 = false;
    Object v20 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v17),(((java.lang.Boolean)v18).booleanValue()),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = -26;
    Object v22 = 81;
    Object v23 = -11;
    Object v24 = new com.google.javascript.rhino.Node((((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()));
    Object v25 = null;
    Object v26 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v24),((com.google.javascript.rhino.jstype.ObjectType)v25));
    Object v27 = new com.google.javascript.jscomp.Compiler();
    Object v28 = new com.google.javascript.jscomp.LiveVariablesAnalysis(((com.google.javascript.jscomp.ControlFlowGraph)v20),((com.google.javascript.jscomp.Scope)v26),((com.google.javascript.jscomp.AbstractCompiler)v27));
    Object v29 = ((com.google.javascript.jscomp.LiveVariablesAnalysis)v28).createEntryLattice();
    Object v30 = ((com.google.javascript.jscomp.LiveVariablesAnalysis)v11).flowThrough(((com.google.javascript.rhino.Node)v15),((com.google.javascript.jscomp.LiveVariablesAnalysis.LiveVariableLattice)v29));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.StrictWarningsGuard();
    Object v1 = false;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -26;
    Object v5 = 81;
    Object v6 = -11;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = null;
    Object v9 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.jstype.ObjectType)v8));
    Object v10 = "";
    Object v11 = ((com.google.javascript.jscomp.Scope)v9).getVar(((java.lang.String)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.LiveVariablesAnalysis(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v9),((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = "";
    Object v15 = ((com.google.javascript.jscomp.LiveVariablesAnalysis)v13).getVarIndex(((java.lang.String)v14));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.StrictWarningsGuard();
    Object v1 = false;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -26;
    Object v5 = 81;
    Object v6 = -11;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = null;
    Object v9 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.jstype.ObjectType)v8));
    Object v10 = "";
    Object v11 = ((com.google.javascript.jscomp.Scope)v9).getVar(((java.lang.String)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.LiveVariablesAnalysis(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v9),((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = -26;
    Object v15 = 81;
    Object v16 = -11;
    Object v17 = new com.google.javascript.rhino.Node((((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = new com.google.javascript.jscomp.StrictWarningsGuard();
    Object v19 = false;
    Object v20 = false;
    Object v21 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v18),(((java.lang.Boolean)v19).booleanValue()),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = -26;
    Object v23 = 81;
    Object v24 = -11;
    Object v25 = new com.google.javascript.rhino.Node((((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()),(((java.lang.Integer)v24).intValue()));
    Object v26 = null;
    Object v27 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v25),((com.google.javascript.rhino.jstype.ObjectType)v26));
    Object v28 = new com.google.javascript.jscomp.Compiler();
    Object v29 = new com.google.javascript.jscomp.LiveVariablesAnalysis(((com.google.javascript.jscomp.ControlFlowGraph)v21),((com.google.javascript.jscomp.Scope)v27),((com.google.javascript.jscomp.AbstractCompiler)v28));
    Object v30 = ((com.google.javascript.jscomp.LiveVariablesAnalysis)v29).createEntryLattice();
    Object v31 = ((com.google.javascript.jscomp.LiveVariablesAnalysis.LiveVariableLattice)v30).toString();
    Object v32 = ((com.google.javascript.jscomp.LiveVariablesAnalysis)v13).flowThrough(((com.google.javascript.rhino.Node)v17),((com.google.javascript.jscomp.LiveVariablesAnalysis.LiveVariableLattice)v30));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.StrictWarningsGuard();
    Object v1 = false;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -26;
    Object v5 = 81;
    Object v6 = -11;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = null;
    Object v9 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.jstype.ObjectType)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v10).reportCodeChange();
    Object v11 = null;
    Object v12 = new com.google.javascript.jscomp.LiveVariablesAnalysis(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v9),((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v13 = ((com.google.javascript.jscomp.LiveVariablesAnalysis)v12).createInitialEstimateLattice();
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.StrictWarningsGuard();
    Object v1 = false;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -26;
    Object v5 = 81;
    Object v6 = -11;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = null;
    Object v9 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.jstype.ObjectType)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler();
    Object v11 = ((com.google.javascript.jscomp.AbstractCompiler)v10).getTopScope();
    Object v12 = new com.google.javascript.jscomp.LiveVariablesAnalysis(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v9),((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v13 = ((com.google.javascript.jscomp.LiveVariablesAnalysis)v12).getEscapedLocals();
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.StrictWarningsGuard();
    Object v1 = false;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.google.javascript.jscomp.graph.LinkedDirectedGraph)v3).newSubGraph();
    Object v5 = -26;
    Object v6 = 81;
    Object v7 = -11;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.jstype.ObjectType)v9));
    Object v11 = new com.google.javascript.jscomp.Compiler();
    Object v12 = new com.google.javascript.jscomp.LiveVariablesAnalysis(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v10),((com.google.javascript.jscomp.AbstractCompiler)v11));
    Object v13 = -26;
    Object v14 = 81;
    Object v15 = -11;
    Object v16 = new com.google.javascript.rhino.Node((((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = new com.google.javascript.jscomp.StrictWarningsGuard();
    Object v18 = false;
    Object v19 = false;
    Object v20 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v17),(((java.lang.Boolean)v18).booleanValue()),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = -26;
    Object v22 = 81;
    Object v23 = -11;
    Object v24 = new com.google.javascript.rhino.Node((((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()));
    Object v25 = null;
    Object v26 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v24),((com.google.javascript.rhino.jstype.ObjectType)v25));
    Object v27 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v27).reportCodeChange();
    Object v28 = null;
    Object v29 = new com.google.javascript.jscomp.LiveVariablesAnalysis(((com.google.javascript.jscomp.ControlFlowGraph)v20),((com.google.javascript.jscomp.Scope)v26),((com.google.javascript.jscomp.AbstractCompiler)v27));
    Object v30 = ((com.google.javascript.jscomp.LiveVariablesAnalysis)v29).createInitialEstimateLattice();
    Object v31 = ((com.google.javascript.jscomp.LiveVariablesAnalysis)v12).flowThrough(((com.google.javascript.rhino.Node)v16),((com.google.javascript.jscomp.LiveVariablesAnalysis.LiveVariableLattice)v30));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.StrictWarningsGuard();
    Object v1 = false;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -26;
    Object v5 = 81;
    Object v6 = -11;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = null;
    Object v9 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.jstype.ObjectType)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v10).reportCodeChange();
    Object v11 = null;
    Object v12 = new com.google.javascript.jscomp.LiveVariablesAnalysis(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v9),((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v13 = -26;
    Object v14 = 81;
    Object v15 = -11;
    Object v16 = new com.google.javascript.rhino.Node((((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = new com.google.javascript.jscomp.StrictWarningsGuard();
    Object v18 = false;
    Object v19 = false;
    Object v20 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v17),(((java.lang.Boolean)v18).booleanValue()),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = -26;
    Object v22 = 81;
    Object v23 = -11;
    Object v24 = new com.google.javascript.rhino.Node((((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()));
    Object v25 = null;
    Object v26 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v24),((com.google.javascript.rhino.jstype.ObjectType)v25));
    Object v27 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v27).reportCodeChange();
    Object v28 = null;
    Object v29 = new com.google.javascript.jscomp.LiveVariablesAnalysis(((com.google.javascript.jscomp.ControlFlowGraph)v20),((com.google.javascript.jscomp.Scope)v26),((com.google.javascript.jscomp.AbstractCompiler)v27));
    Object v30 = ((com.google.javascript.jscomp.LiveVariablesAnalysis)v29).createInitialEstimateLattice();
    Object v31 = ((com.google.javascript.jscomp.LiveVariablesAnalysis)v12).flowThrough(((com.google.javascript.rhino.Node)v16),((com.google.javascript.jscomp.LiveVariablesAnalysis.LiveVariableLattice)v30));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.StrictWarningsGuard();
    Object v1 = false;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -26;
    Object v5 = 81;
    Object v6 = -11;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = null;
    Object v9 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.jstype.ObjectType)v8));
    Object v10 = "";
    Object v11 = ((com.google.javascript.jscomp.Scope)v9).getVar(((java.lang.String)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.LiveVariablesAnalysis(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v9),((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = -26;
    Object v15 = 81;
    Object v16 = -11;
    Object v17 = new com.google.javascript.rhino.Node((((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = new com.google.javascript.jscomp.StrictWarningsGuard();
    Object v19 = false;
    Object v20 = false;
    Object v21 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v18),(((java.lang.Boolean)v19).booleanValue()),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = -26;
    Object v23 = 81;
    Object v24 = -11;
    Object v25 = new com.google.javascript.rhino.Node((((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()),(((java.lang.Integer)v24).intValue()));
    Object v26 = null;
    Object v27 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v25),((com.google.javascript.rhino.jstype.ObjectType)v26));
    Object v28 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v28).reportCodeChange();
    Object v29 = null;
    Object v30 = new com.google.javascript.jscomp.LiveVariablesAnalysis(((com.google.javascript.jscomp.ControlFlowGraph)v21),((com.google.javascript.jscomp.Scope)v27),((com.google.javascript.jscomp.AbstractCompiler)v28));
    Object v31 = ((com.google.javascript.jscomp.LiveVariablesAnalysis)v30).createInitialEstimateLattice();
    Object v32 = ((com.google.javascript.jscomp.LiveVariablesAnalysis)v13).flowThrough(((com.google.javascript.rhino.Node)v17),((com.google.javascript.jscomp.LiveVariablesAnalysis.LiveVariableLattice)v31));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.StrictWarningsGuard();
    Object v1 = false;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -26;
    Object v5 = 81;
    Object v6 = -11;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = null;
    Object v9 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.jstype.ObjectType)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler();
    Object v11 = ((com.google.javascript.jscomp.AbstractCompiler)v10).getErrorManager();
    Object v12 = new com.google.javascript.jscomp.LiveVariablesAnalysis(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v9),((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v13 = -26;
    Object v14 = 81;
    Object v15 = -11;
    Object v16 = new com.google.javascript.rhino.Node((((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = new com.google.javascript.jscomp.StrictWarningsGuard();
    Object v18 = false;
    Object v19 = false;
    Object v20 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v17),(((java.lang.Boolean)v18).booleanValue()),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = -26;
    Object v22 = 81;
    Object v23 = -11;
    Object v24 = new com.google.javascript.rhino.Node((((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()));
    Object v25 = null;
    Object v26 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v24),((com.google.javascript.rhino.jstype.ObjectType)v25));
    Object v27 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v27).reportCodeChange();
    Object v28 = null;
    Object v29 = new com.google.javascript.jscomp.LiveVariablesAnalysis(((com.google.javascript.jscomp.ControlFlowGraph)v20),((com.google.javascript.jscomp.Scope)v26),((com.google.javascript.jscomp.AbstractCompiler)v27));
    Object v30 = ((com.google.javascript.jscomp.LiveVariablesAnalysis)v29).createInitialEstimateLattice();
    Object v31 = ((com.google.javascript.jscomp.LiveVariablesAnalysis)v12).flowThrough(((com.google.javascript.rhino.Node)v16),((com.google.javascript.jscomp.LiveVariablesAnalysis.LiveVariableLattice)v30));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.StrictWarningsGuard();
    Object v1 = false;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -26;
    Object v5 = 81;
    Object v6 = -11;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = null;
    Object v9 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.jstype.ObjectType)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler();
    Object v11 = ((com.google.javascript.jscomp.AbstractCompiler)v10).getTopScope();
    Object v12 = new com.google.javascript.jscomp.LiveVariablesAnalysis(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v9),((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v13 = -26;
    Object v14 = 81;
    Object v15 = -11;
    Object v16 = new com.google.javascript.rhino.Node((((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = ((com.google.javascript.rhino.Node)v16).isQualifiedName();
    Object v18 = new com.google.javascript.jscomp.StrictWarningsGuard();
    Object v19 = false;
    Object v20 = false;
    Object v21 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v18),(((java.lang.Boolean)v19).booleanValue()),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = -26;
    Object v23 = 81;
    Object v24 = -11;
    Object v25 = new com.google.javascript.rhino.Node((((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()),(((java.lang.Integer)v24).intValue()));
    Object v26 = null;
    Object v27 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v25),((com.google.javascript.rhino.jstype.ObjectType)v26));
    Object v28 = new com.google.javascript.jscomp.Compiler();
    Object v29 = new com.google.javascript.jscomp.LiveVariablesAnalysis(((com.google.javascript.jscomp.ControlFlowGraph)v21),((com.google.javascript.jscomp.Scope)v27),((com.google.javascript.jscomp.AbstractCompiler)v28));
    Object v30 = ((com.google.javascript.jscomp.LiveVariablesAnalysis)v29).createEntryLattice();
    Object v31 = ((com.google.javascript.jscomp.LiveVariablesAnalysis)v12).flowThrough(((com.google.javascript.rhino.Node)v16),((com.google.javascript.jscomp.LiveVariablesAnalysis.LiveVariableLattice)v30));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.StrictWarningsGuard();
    Object v1 = false;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -26;
    Object v5 = 81;
    Object v6 = -11;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = null;
    Object v9 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.jstype.ObjectType)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler();
    Object v11 = ((com.google.javascript.jscomp.AbstractCompiler)v10).getTopScope();
    Object v12 = new com.google.javascript.jscomp.LiveVariablesAnalysis(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v9),((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v13 = -26;
    Object v14 = 81;
    Object v15 = -11;
    Object v16 = new com.google.javascript.rhino.Node((((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    ((com.google.javascript.rhino.Node)v16).detachChildren();
    Object v17 = null;
    Object v18 = new com.google.javascript.jscomp.StrictWarningsGuard();
    Object v19 = false;
    Object v20 = false;
    Object v21 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v18),(((java.lang.Boolean)v19).booleanValue()),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = -26;
    Object v23 = 81;
    Object v24 = -11;
    Object v25 = new com.google.javascript.rhino.Node((((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()),(((java.lang.Integer)v24).intValue()));
    Object v26 = null;
    Object v27 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v25),((com.google.javascript.rhino.jstype.ObjectType)v26));
    Object v28 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v28).reportCodeChange();
    Object v29 = null;
    Object v30 = new com.google.javascript.jscomp.LiveVariablesAnalysis(((com.google.javascript.jscomp.ControlFlowGraph)v21),((com.google.javascript.jscomp.Scope)v27),((com.google.javascript.jscomp.AbstractCompiler)v28));
    Object v31 = ((com.google.javascript.jscomp.LiveVariablesAnalysis)v30).createEntryLattice();
    Object v32 = ((com.google.javascript.jscomp.LiveVariablesAnalysis)v12).flowThrough(((com.google.javascript.rhino.Node)v16),((com.google.javascript.jscomp.LiveVariablesAnalysis.LiveVariableLattice)v31));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.StrictWarningsGuard();
    Object v1 = false;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -26;
    Object v5 = 81;
    Object v6 = -11;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = null;
    Object v9 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.jstype.ObjectType)v8));
    Object v10 = "";
    Object v11 = ((com.google.javascript.jscomp.Scope)v9).getVar(((java.lang.String)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.LiveVariablesAnalysis(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v9),((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = ((com.google.javascript.jscomp.LiveVariablesAnalysis)v13).getEscapedLocals();
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.StrictWarningsGuard();
    Object v1 = false;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.google.javascript.jscomp.graph.LinkedDirectedGraph)v3).newSubGraph();
    Object v5 = -26;
    Object v6 = 81;
    Object v7 = -11;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.jstype.ObjectType)v9));
    Object v11 = new com.google.javascript.jscomp.Compiler();
    Object v12 = new com.google.javascript.jscomp.LiveVariablesAnalysis(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v10),((com.google.javascript.jscomp.AbstractCompiler)v11));
    Object v13 = ((com.google.javascript.jscomp.LiveVariablesAnalysis)v12).isForward();
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.StrictWarningsGuard();
    Object v1 = false;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -26;
    Object v5 = 81;
    Object v6 = -11;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = null;
    Object v9 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.jstype.ObjectType)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler();
    Object v11 = ((com.google.javascript.jscomp.AbstractCompiler)v10).getTopScope();
    Object v12 = new com.google.javascript.jscomp.LiveVariablesAnalysis(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v9),((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v13 = -26;
    Object v14 = 81;
    Object v15 = -11;
    Object v16 = new com.google.javascript.rhino.Node((((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = new com.google.javascript.jscomp.StrictWarningsGuard();
    Object v18 = false;
    Object v19 = false;
    Object v20 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v17),(((java.lang.Boolean)v18).booleanValue()),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = -26;
    Object v22 = 81;
    Object v23 = -11;
    Object v24 = new com.google.javascript.rhino.Node((((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()));
    Object v25 = null;
    Object v26 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v24),((com.google.javascript.rhino.jstype.ObjectType)v25));
    Object v27 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v27).reportCodeChange();
    Object v28 = null;
    Object v29 = new com.google.javascript.jscomp.LiveVariablesAnalysis(((com.google.javascript.jscomp.ControlFlowGraph)v20),((com.google.javascript.jscomp.Scope)v26),((com.google.javascript.jscomp.AbstractCompiler)v27));
    Object v30 = ((com.google.javascript.jscomp.LiveVariablesAnalysis)v29).createEntryLattice();
    Object v31 = ((com.google.javascript.jscomp.LiveVariablesAnalysis)v12).flowThrough(((com.google.javascript.rhino.Node)v16),((com.google.javascript.jscomp.LiveVariablesAnalysis.LiveVariableLattice)v30));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.StrictWarningsGuard();
    Object v1 = false;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -26;
    Object v5 = 81;
    Object v6 = -11;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = null;
    Object v9 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.jstype.ObjectType)v8));
    Object v10 = "";
    Object v11 = ((com.google.javascript.jscomp.Scope)v9).getVar(((java.lang.String)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.LiveVariablesAnalysis(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v9),((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = -26;
    Object v15 = 81;
    Object v16 = -11;
    Object v17 = new com.google.javascript.rhino.Node((((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = ((com.google.javascript.rhino.Node)v17).isSyntheticBlock();
    Object v19 = new com.google.javascript.jscomp.StrictWarningsGuard();
    Object v20 = false;
    Object v21 = false;
    Object v22 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v19),(((java.lang.Boolean)v20).booleanValue()),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = -26;
    Object v24 = 81;
    Object v25 = -11;
    Object v26 = new com.google.javascript.rhino.Node((((java.lang.Integer)v23).intValue()),(((java.lang.Integer)v24).intValue()),(((java.lang.Integer)v25).intValue()));
    Object v27 = null;
    Object v28 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v26),((com.google.javascript.rhino.jstype.ObjectType)v27));
    Object v29 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v29).reportCodeChange();
    Object v30 = null;
    Object v31 = new com.google.javascript.jscomp.LiveVariablesAnalysis(((com.google.javascript.jscomp.ControlFlowGraph)v22),((com.google.javascript.jscomp.Scope)v28),((com.google.javascript.jscomp.AbstractCompiler)v29));
    Object v32 = ((com.google.javascript.jscomp.LiveVariablesAnalysis)v31).createInitialEstimateLattice();
    Object v33 = ((com.google.javascript.jscomp.LiveVariablesAnalysis)v13).flowThrough(((com.google.javascript.rhino.Node)v17),((com.google.javascript.jscomp.LiveVariablesAnalysis.LiveVariableLattice)v32));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.StrictWarningsGuard();
    Object v1 = false;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    ((com.google.javascript.jscomp.graph.Graph)v3).clearEdgeAnnotations();
    Object v4 = null;
    Object v5 = -26;
    Object v6 = 81;
    Object v7 = -11;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.jstype.ObjectType)v9));
    Object v11 = new com.google.javascript.jscomp.Compiler();
    Object v12 = new com.google.javascript.jscomp.LiveVariablesAnalysis(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v10),((com.google.javascript.jscomp.AbstractCompiler)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.StrictWarningsGuard();
    Object v1 = false;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    ((com.google.javascript.jscomp.graph.Graph)v3).clearEdgeAnnotations();
    Object v4 = null;
    Object v5 = -26;
    Object v6 = 81;
    Object v7 = -11;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.jstype.ObjectType)v9));
    Object v11 = new com.google.javascript.jscomp.Compiler();
    Object v12 = new com.google.javascript.jscomp.LiveVariablesAnalysis(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v10),((com.google.javascript.jscomp.AbstractCompiler)v11));
    ((com.google.javascript.jscomp.LiveVariablesAnalysis)v12).markAllParametersEscaped();
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.StrictWarningsGuard();
    Object v1 = false;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    ((com.google.javascript.jscomp.graph.Graph)v3).clearEdgeAnnotations();
    Object v4 = null;
    Object v5 = -26;
    Object v6 = 81;
    Object v7 = -11;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.jstype.ObjectType)v9));
    Object v11 = new com.google.javascript.jscomp.Compiler();
    Object v12 = new com.google.javascript.jscomp.LiveVariablesAnalysis(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v10),((com.google.javascript.jscomp.AbstractCompiler)v11));
    Object v13 = -26;
    Object v14 = 81;
    Object v15 = -11;
    Object v16 = new com.google.javascript.rhino.Node((((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = -26;
    Object v18 = 81;
    Object v19 = -11;
    Object v20 = new com.google.javascript.rhino.Node((((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()));
    Object v21 = ((com.google.javascript.rhino.Node)v16).useSourceInfoFrom(((com.google.javascript.rhino.Node)v20));
    Object v22 = new com.google.javascript.jscomp.StrictWarningsGuard();
    Object v23 = false;
    Object v24 = false;
    Object v25 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v22),(((java.lang.Boolean)v23).booleanValue()),(((java.lang.Boolean)v24).booleanValue()));
    Object v26 = -26;
    Object v27 = 81;
    Object v28 = -11;
    Object v29 = new com.google.javascript.rhino.Node((((java.lang.Integer)v26).intValue()),(((java.lang.Integer)v27).intValue()),(((java.lang.Integer)v28).intValue()));
    Object v30 = null;
    Object v31 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v29),((com.google.javascript.rhino.jstype.ObjectType)v30));
    Object v32 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v32).reportCodeChange();
    Object v33 = null;
    Object v34 = new com.google.javascript.jscomp.LiveVariablesAnalysis(((com.google.javascript.jscomp.ControlFlowGraph)v25),((com.google.javascript.jscomp.Scope)v31),((com.google.javascript.jscomp.AbstractCompiler)v32));
    Object v35 = ((com.google.javascript.jscomp.LiveVariablesAnalysis)v34).createInitialEstimateLattice();
    Object v36 = ((com.google.javascript.jscomp.LiveVariablesAnalysis)v12).flowThrough(((com.google.javascript.rhino.Node)v16),((com.google.javascript.jscomp.LiveVariablesAnalysis.LiveVariableLattice)v35));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.StrictWarningsGuard();
    Object v1 = false;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    ((com.google.javascript.jscomp.graph.Graph)v3).clearEdgeAnnotations();
    Object v4 = null;
    Object v5 = -26;
    Object v6 = 81;
    Object v7 = -11;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.jstype.ObjectType)v9));
    Object v11 = new com.google.javascript.jscomp.Compiler();
    Object v12 = new com.google.javascript.jscomp.LiveVariablesAnalysis(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v10),((com.google.javascript.jscomp.AbstractCompiler)v11));
    Object v13 = -26;
    Object v14 = 81;
    Object v15 = -11;
    Object v16 = new com.google.javascript.rhino.Node((((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = new com.google.javascript.jscomp.StrictWarningsGuard();
    Object v18 = false;
    Object v19 = false;
    Object v20 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v17),(((java.lang.Boolean)v18).booleanValue()),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = -26;
    Object v22 = 81;
    Object v23 = -11;
    Object v24 = new com.google.javascript.rhino.Node((((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()));
    Object v25 = null;
    Object v26 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v24),((com.google.javascript.rhino.jstype.ObjectType)v25));
    Object v27 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v27).reportCodeChange();
    Object v28 = null;
    Object v29 = new com.google.javascript.jscomp.LiveVariablesAnalysis(((com.google.javascript.jscomp.ControlFlowGraph)v20),((com.google.javascript.jscomp.Scope)v26),((com.google.javascript.jscomp.AbstractCompiler)v27));
    Object v30 = ((com.google.javascript.jscomp.LiveVariablesAnalysis)v29).createEntryLattice();
    Object v31 = ((com.google.javascript.jscomp.LiveVariablesAnalysis)v12).flowThrough(((com.google.javascript.rhino.Node)v16),((com.google.javascript.jscomp.LiveVariablesAnalysis.LiveVariableLattice)v30));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.StrictWarningsGuard();
    Object v1 = false;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -26;
    Object v5 = 81;
    Object v6 = -11;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = null;
    Object v9 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.jstype.ObjectType)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler();
    Object v11 = ((com.google.javascript.jscomp.AbstractCompiler)v10).getTopScope();
    Object v12 = new com.google.javascript.jscomp.LiveVariablesAnalysis(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v9),((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v13 = "&";
    Object v14 = ((com.google.javascript.jscomp.LiveVariablesAnalysis)v12).getVarIndex(((java.lang.String)v13));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.StrictWarningsGuard();
    Object v1 = false;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    ((com.google.javascript.jscomp.graph.Graph)v3).clearEdgeAnnotations();
    Object v4 = null;
    Object v5 = -26;
    Object v6 = 81;
    Object v7 = -11;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.jstype.ObjectType)v9));
    Object v11 = new com.google.javascript.jscomp.Compiler();
    Object v12 = new com.google.javascript.jscomp.LiveVariablesAnalysis(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v10),((com.google.javascript.jscomp.AbstractCompiler)v11));
    Object v13 = -26;
    Object v14 = 81;
    Object v15 = -11;
    Object v16 = new com.google.javascript.rhino.Node((((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = new com.google.javascript.jscomp.StrictWarningsGuard();
    Object v18 = false;
    Object v19 = false;
    Object v20 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v17),(((java.lang.Boolean)v18).booleanValue()),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = -26;
    Object v22 = 81;
    Object v23 = -11;
    Object v24 = new com.google.javascript.rhino.Node((((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()));
    Object v25 = null;
    Object v26 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v24),((com.google.javascript.rhino.jstype.ObjectType)v25));
    Object v27 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v27).reportCodeChange();
    Object v28 = null;
    Object v29 = new com.google.javascript.jscomp.LiveVariablesAnalysis(((com.google.javascript.jscomp.ControlFlowGraph)v20),((com.google.javascript.jscomp.Scope)v26),((com.google.javascript.jscomp.AbstractCompiler)v27));
    Object v30 = ((com.google.javascript.jscomp.LiveVariablesAnalysis)v29).createInitialEstimateLattice();
    Object v31 = ((com.google.javascript.jscomp.LiveVariablesAnalysis.LiveVariableLattice)v30).toString();
    Object v32 = ((com.google.javascript.jscomp.LiveVariablesAnalysis)v12).flowThrough(((com.google.javascript.rhino.Node)v16),((com.google.javascript.jscomp.LiveVariablesAnalysis.LiveVariableLattice)v30));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.StrictWarningsGuard();
    Object v1 = false;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -26;
    Object v5 = 81;
    Object v6 = -11;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = null;
    Object v9 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.jstype.ObjectType)v8));
    Object v10 = "";
    Object v11 = ((com.google.javascript.jscomp.Scope)v9).getVar(((java.lang.String)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.LiveVariablesAnalysis(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v9),((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = ((com.google.javascript.jscomp.LiveVariablesAnalysis)v13).createEntryLattice();
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.StrictWarningsGuard();
    Object v1 = false;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -26;
    Object v5 = 81;
    Object v6 = -11;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = null;
    Object v9 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.jstype.ObjectType)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler();
    Object v11 = new com.google.javascript.jscomp.LiveVariablesAnalysis(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v9),((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v12 = -26;
    Object v13 = 81;
    Object v14 = -11;
    Object v15 = new com.google.javascript.rhino.Node((((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = new com.google.javascript.jscomp.StrictWarningsGuard();
    Object v17 = false;
    Object v18 = false;
    Object v19 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v16),(((java.lang.Boolean)v17).booleanValue()),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = -26;
    Object v21 = 81;
    Object v22 = -11;
    Object v23 = new com.google.javascript.rhino.Node((((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()));
    Object v24 = null;
    Object v25 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v23),((com.google.javascript.rhino.jstype.ObjectType)v24));
    Object v26 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v26).reportCodeChange();
    Object v27 = null;
    Object v28 = new com.google.javascript.jscomp.LiveVariablesAnalysis(((com.google.javascript.jscomp.ControlFlowGraph)v19),((com.google.javascript.jscomp.Scope)v25),((com.google.javascript.jscomp.AbstractCompiler)v26));
    Object v29 = ((com.google.javascript.jscomp.LiveVariablesAnalysis)v28).createEntryLattice();
    Object v30 = ((com.google.javascript.jscomp.LiveVariablesAnalysis)v11).flowThrough(((com.google.javascript.rhino.Node)v15),((com.google.javascript.jscomp.LiveVariablesAnalysis.LiveVariableLattice)v29));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.StrictWarningsGuard();
    Object v1 = false;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -26;
    Object v5 = 81;
    Object v6 = -11;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = null;
    Object v9 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.jstype.ObjectType)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler();
    Object v11 = ((com.google.javascript.jscomp.AbstractCompiler)v10).getTopScope();
    Object v12 = new com.google.javascript.jscomp.LiveVariablesAnalysis(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v9),((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v13 = -26;
    Object v14 = 81;
    Object v15 = -11;
    Object v16 = new com.google.javascript.rhino.Node((((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = new com.google.javascript.jscomp.StrictWarningsGuard();
    Object v18 = false;
    Object v19 = false;
    Object v20 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v17),(((java.lang.Boolean)v18).booleanValue()),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = -26;
    Object v22 = 81;
    Object v23 = -11;
    Object v24 = new com.google.javascript.rhino.Node((((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()));
    Object v25 = null;
    Object v26 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v24),((com.google.javascript.rhino.jstype.ObjectType)v25));
    Object v27 = "";
    Object v28 = ((com.google.javascript.jscomp.Scope)v26).getVar(((java.lang.String)v27));
    Object v29 = new com.google.javascript.jscomp.Compiler();
    Object v30 = new com.google.javascript.jscomp.LiveVariablesAnalysis(((com.google.javascript.jscomp.ControlFlowGraph)v20),((com.google.javascript.jscomp.Scope)v26),((com.google.javascript.jscomp.AbstractCompiler)v29));
    Object v31 = ((com.google.javascript.jscomp.LiveVariablesAnalysis)v30).createEntryLattice();
    Object v32 = ((com.google.javascript.jscomp.LiveVariablesAnalysis)v12).flowThrough(((com.google.javascript.rhino.Node)v16),((com.google.javascript.jscomp.LiveVariablesAnalysis.LiveVariableLattice)v31));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.StrictWarningsGuard();
    Object v1 = false;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    ((com.google.javascript.jscomp.graph.Graph)v3).clearEdgeAnnotations();
    Object v4 = null;
    Object v5 = -26;
    Object v6 = 81;
    Object v7 = -11;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.jstype.ObjectType)v9));
    Object v11 = new com.google.javascript.jscomp.Compiler();
    Object v12 = new com.google.javascript.jscomp.LiveVariablesAnalysis(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v10),((com.google.javascript.jscomp.AbstractCompiler)v11));
    Object v13 = -26;
    Object v14 = 81;
    Object v15 = -11;
    Object v16 = new com.google.javascript.rhino.Node((((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = 7;
    Object v18 = ((com.google.javascript.rhino.Node)v16).getIntProp((((java.lang.Integer)v17).intValue()));
    Object v19 = new com.google.javascript.jscomp.StrictWarningsGuard();
    Object v20 = false;
    Object v21 = false;
    Object v22 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v19),(((java.lang.Boolean)v20).booleanValue()),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = -26;
    Object v24 = 81;
    Object v25 = -11;
    Object v26 = new com.google.javascript.rhino.Node((((java.lang.Integer)v23).intValue()),(((java.lang.Integer)v24).intValue()),(((java.lang.Integer)v25).intValue()));
    Object v27 = null;
    Object v28 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v26),((com.google.javascript.rhino.jstype.ObjectType)v27));
    Object v29 = "";
    Object v30 = ((com.google.javascript.jscomp.Scope)v28).getVar(((java.lang.String)v29));
    Object v31 = new com.google.javascript.jscomp.Compiler();
    Object v32 = new com.google.javascript.jscomp.LiveVariablesAnalysis(((com.google.javascript.jscomp.ControlFlowGraph)v22),((com.google.javascript.jscomp.Scope)v28),((com.google.javascript.jscomp.AbstractCompiler)v31));
    Object v33 = ((com.google.javascript.jscomp.LiveVariablesAnalysis)v32).createEntryLattice();
    Object v34 = ((com.google.javascript.jscomp.LiveVariablesAnalysis.LiveVariableLattice)v33).toString();
    Object v35 = ((com.google.javascript.jscomp.LiveVariablesAnalysis)v12).flowThrough(((com.google.javascript.rhino.Node)v16),((com.google.javascript.jscomp.LiveVariablesAnalysis.LiveVariableLattice)v33));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.StrictWarningsGuard();
    Object v1 = false;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -26;
    Object v5 = 81;
    Object v6 = -11;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = null;
    Object v9 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.jstype.ObjectType)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler();
    Object v11 = ((com.google.javascript.jscomp.AbstractCompiler)v10).getTopScope();
    Object v12 = new com.google.javascript.jscomp.LiveVariablesAnalysis(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v9),((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v13 = -26;
    Object v14 = 81;
    Object v15 = -11;
    Object v16 = new com.google.javascript.rhino.Node((((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = new com.google.javascript.jscomp.StrictWarningsGuard();
    Object v18 = false;
    Object v19 = false;
    Object v20 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v17),(((java.lang.Boolean)v18).booleanValue()),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = -26;
    Object v22 = 81;
    Object v23 = -11;
    Object v24 = new com.google.javascript.rhino.Node((((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()));
    Object v25 = null;
    Object v26 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v24),((com.google.javascript.rhino.jstype.ObjectType)v25));
    Object v27 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v27).reportCodeChange();
    Object v28 = null;
    Object v29 = new com.google.javascript.jscomp.LiveVariablesAnalysis(((com.google.javascript.jscomp.ControlFlowGraph)v20),((com.google.javascript.jscomp.Scope)v26),((com.google.javascript.jscomp.AbstractCompiler)v27));
    Object v30 = ((com.google.javascript.jscomp.LiveVariablesAnalysis)v29).createInitialEstimateLattice();
    Object v31 = ((com.google.javascript.jscomp.LiveVariablesAnalysis)v12).flowThrough(((com.google.javascript.rhino.Node)v16),((com.google.javascript.jscomp.LiveVariablesAnalysis.LiveVariableLattice)v30));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.StrictWarningsGuard();
    Object v1 = false;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    ((com.google.javascript.jscomp.graph.Graph)v3).clearEdgeAnnotations();
    Object v4 = null;
    Object v5 = -26;
    Object v6 = 81;
    Object v7 = -11;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.jstype.ObjectType)v9));
    Object v11 = new com.google.javascript.jscomp.Compiler();
    Object v12 = new com.google.javascript.jscomp.LiveVariablesAnalysis(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v10),((com.google.javascript.jscomp.AbstractCompiler)v11));
    Object v13 = -26;
    Object v14 = 81;
    Object v15 = -11;
    Object v16 = new com.google.javascript.rhino.Node((((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = 10;
    ((com.google.javascript.rhino.Node)v16).removeProp((((java.lang.Integer)v17).intValue()));
    Object v18 = null;
    Object v19 = new com.google.javascript.jscomp.StrictWarningsGuard();
    Object v20 = false;
    Object v21 = false;
    Object v22 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v19),(((java.lang.Boolean)v20).booleanValue()),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = -26;
    Object v24 = 81;
    Object v25 = -11;
    Object v26 = new com.google.javascript.rhino.Node((((java.lang.Integer)v23).intValue()),(((java.lang.Integer)v24).intValue()),(((java.lang.Integer)v25).intValue()));
    Object v27 = null;
    Object v28 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v26),((com.google.javascript.rhino.jstype.ObjectType)v27));
    Object v29 = new com.google.javascript.jscomp.Compiler();
    Object v30 = new com.google.javascript.jscomp.LiveVariablesAnalysis(((com.google.javascript.jscomp.ControlFlowGraph)v22),((com.google.javascript.jscomp.Scope)v28),((com.google.javascript.jscomp.AbstractCompiler)v29));
    Object v31 = ((com.google.javascript.jscomp.LiveVariablesAnalysis)v30).createInitialEstimateLattice();
    Object v32 = ((com.google.javascript.jscomp.LiveVariablesAnalysis)v12).flowThrough(((com.google.javascript.rhino.Node)v16),((com.google.javascript.jscomp.LiveVariablesAnalysis.LiveVariableLattice)v31));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.StrictWarningsGuard();
    Object v1 = false;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.google.javascript.jscomp.graph.LinkedDirectedGraph)v3).newSubGraph();
    Object v5 = -26;
    Object v6 = 81;
    Object v7 = -11;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.jstype.ObjectType)v9));
    Object v11 = new com.google.javascript.jscomp.Compiler();
    Object v12 = new com.google.javascript.jscomp.LiveVariablesAnalysis(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v10),((com.google.javascript.jscomp.AbstractCompiler)v11));
    Object v13 = -26;
    Object v14 = 81;
    Object v15 = -11;
    Object v16 = new com.google.javascript.rhino.Node((((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = new com.google.javascript.jscomp.StrictWarningsGuard();
    Object v18 = false;
    Object v19 = false;
    Object v20 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v17),(((java.lang.Boolean)v18).booleanValue()),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = -26;
    Object v22 = 81;
    Object v23 = -11;
    Object v24 = new com.google.javascript.rhino.Node((((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()));
    Object v25 = null;
    Object v26 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v24),((com.google.javascript.rhino.jstype.ObjectType)v25));
    Object v27 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v27).reportCodeChange();
    Object v28 = null;
    Object v29 = new com.google.javascript.jscomp.LiveVariablesAnalysis(((com.google.javascript.jscomp.ControlFlowGraph)v20),((com.google.javascript.jscomp.Scope)v26),((com.google.javascript.jscomp.AbstractCompiler)v27));
    Object v30 = ((com.google.javascript.jscomp.LiveVariablesAnalysis)v29).createEntryLattice();
    Object v31 = ((com.google.javascript.jscomp.LiveVariablesAnalysis.LiveVariableLattice)v30).toString();
    Object v32 = ((com.google.javascript.jscomp.LiveVariablesAnalysis)v12).flowThrough(((com.google.javascript.rhino.Node)v16),((com.google.javascript.jscomp.LiveVariablesAnalysis.LiveVariableLattice)v30));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.StrictWarningsGuard();
    Object v1 = false;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -26;
    Object v5 = 81;
    Object v6 = -11;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = null;
    Object v9 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.jstype.ObjectType)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v10).reportCodeChange();
    Object v11 = null;
    Object v12 = new com.google.javascript.jscomp.LiveVariablesAnalysis(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v9),((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v13 = -26;
    Object v14 = 81;
    Object v15 = -11;
    Object v16 = new com.google.javascript.rhino.Node((((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = new com.google.javascript.jscomp.StrictWarningsGuard();
    Object v18 = false;
    Object v19 = false;
    Object v20 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v17),(((java.lang.Boolean)v18).booleanValue()),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = -26;
    Object v22 = 81;
    Object v23 = -11;
    Object v24 = new com.google.javascript.rhino.Node((((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()));
    Object v25 = null;
    Object v26 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v24),((com.google.javascript.rhino.jstype.ObjectType)v25));
    Object v27 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v27).reportCodeChange();
    Object v28 = null;
    Object v29 = new com.google.javascript.jscomp.LiveVariablesAnalysis(((com.google.javascript.jscomp.ControlFlowGraph)v20),((com.google.javascript.jscomp.Scope)v26),((com.google.javascript.jscomp.AbstractCompiler)v27));
    Object v30 = ((com.google.javascript.jscomp.LiveVariablesAnalysis)v29).createEntryLattice();
    Object v31 = 0;
    Object v32 = ((com.google.javascript.jscomp.LiveVariablesAnalysis.LiveVariableLattice)v30).isLive((((java.lang.Integer)v31).intValue()));
    Object v33 = ((com.google.javascript.jscomp.LiveVariablesAnalysis)v12).flowThrough(((com.google.javascript.rhino.Node)v16),((com.google.javascript.jscomp.LiveVariablesAnalysis.LiveVariableLattice)v30));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.StrictWarningsGuard();
    Object v1 = false;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.google.javascript.jscomp.graph.LinkedDirectedGraph)v3).newSubGraph();
    Object v5 = -26;
    Object v6 = 81;
    Object v7 = -11;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.jstype.ObjectType)v9));
    Object v11 = new com.google.javascript.jscomp.Compiler();
    Object v12 = new com.google.javascript.jscomp.LiveVariablesAnalysis(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v10),((com.google.javascript.jscomp.AbstractCompiler)v11));
    Object v13 = -26;
    Object v14 = 81;
    Object v15 = -11;
    Object v16 = new com.google.javascript.rhino.Node((((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = new com.google.javascript.jscomp.StrictWarningsGuard();
    Object v18 = false;
    Object v19 = false;
    Object v20 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v17),(((java.lang.Boolean)v18).booleanValue()),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = -26;
    Object v22 = 81;
    Object v23 = -11;
    Object v24 = new com.google.javascript.rhino.Node((((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()));
    Object v25 = null;
    Object v26 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v24),((com.google.javascript.rhino.jstype.ObjectType)v25));
    Object v27 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v27).reportCodeChange();
    Object v28 = null;
    Object v29 = new com.google.javascript.jscomp.LiveVariablesAnalysis(((com.google.javascript.jscomp.ControlFlowGraph)v20),((com.google.javascript.jscomp.Scope)v26),((com.google.javascript.jscomp.AbstractCompiler)v27));
    Object v30 = ((com.google.javascript.jscomp.LiveVariablesAnalysis)v29).createEntryLattice();
    Object v31 = ((com.google.javascript.jscomp.LiveVariablesAnalysis)v12).flowThrough(((com.google.javascript.rhino.Node)v16),((com.google.javascript.jscomp.LiveVariablesAnalysis.LiveVariableLattice)v30));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.StrictWarningsGuard();
    Object v1 = false;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -26;
    Object v5 = 81;
    Object v6 = -11;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = null;
    Object v9 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.jstype.ObjectType)v8));
    Object v10 = "";
    Object v11 = ((com.google.javascript.jscomp.Scope)v9).getVar(((java.lang.String)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.LiveVariablesAnalysis(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v9),((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = -26;
    Object v15 = 81;
    Object v16 = -11;
    Object v17 = new com.google.javascript.rhino.Node((((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = ((com.google.javascript.rhino.Node)v17).removeChildren();
    Object v19 = new com.google.javascript.jscomp.StrictWarningsGuard();
    Object v20 = false;
    Object v21 = false;
    Object v22 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v19),(((java.lang.Boolean)v20).booleanValue()),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = -26;
    Object v24 = 81;
    Object v25 = -11;
    Object v26 = new com.google.javascript.rhino.Node((((java.lang.Integer)v23).intValue()),(((java.lang.Integer)v24).intValue()),(((java.lang.Integer)v25).intValue()));
    Object v27 = null;
    Object v28 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v26),((com.google.javascript.rhino.jstype.ObjectType)v27));
    Object v29 = new com.google.javascript.jscomp.Compiler();
    Object v30 = new com.google.javascript.jscomp.LiveVariablesAnalysis(((com.google.javascript.jscomp.ControlFlowGraph)v22),((com.google.javascript.jscomp.Scope)v28),((com.google.javascript.jscomp.AbstractCompiler)v29));
    Object v31 = ((com.google.javascript.jscomp.LiveVariablesAnalysis)v30).createInitialEstimateLattice();
    Object v32 = ((com.google.javascript.jscomp.LiveVariablesAnalysis)v13).flowThrough(((com.google.javascript.rhino.Node)v17),((com.google.javascript.jscomp.LiveVariablesAnalysis.LiveVariableLattice)v31));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.StrictWarningsGuard();
    Object v1 = false;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    ((com.google.javascript.jscomp.graph.Graph)v3).clearEdgeAnnotations();
    Object v4 = null;
    Object v5 = -26;
    Object v6 = 81;
    Object v7 = -11;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.jstype.ObjectType)v9));
    Object v11 = new com.google.javascript.jscomp.Compiler();
    Object v12 = new com.google.javascript.jscomp.LiveVariablesAnalysis(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v10),((com.google.javascript.jscomp.AbstractCompiler)v11));
    Object v13 = -26;
    Object v14 = 81;
    Object v15 = -11;
    Object v16 = new com.google.javascript.rhino.Node((((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = new com.google.javascript.jscomp.StrictWarningsGuard();
    Object v18 = false;
    Object v19 = false;
    Object v20 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v17),(((java.lang.Boolean)v18).booleanValue()),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = -26;
    Object v22 = 81;
    Object v23 = -11;
    Object v24 = new com.google.javascript.rhino.Node((((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()));
    Object v25 = null;
    Object v26 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v24),((com.google.javascript.rhino.jstype.ObjectType)v25));
    Object v27 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v27).reportCodeChange();
    Object v28 = null;
    Object v29 = new com.google.javascript.jscomp.LiveVariablesAnalysis(((com.google.javascript.jscomp.ControlFlowGraph)v20),((com.google.javascript.jscomp.Scope)v26),((com.google.javascript.jscomp.AbstractCompiler)v27));
    Object v30 = ((com.google.javascript.jscomp.LiveVariablesAnalysis)v29).createInitialEstimateLattice();
    Object v31 = -26;
    Object v32 = 81;
    Object v33 = -11;
    Object v34 = new com.google.javascript.rhino.Node((((java.lang.Integer)v31).intValue()),(((java.lang.Integer)v32).intValue()),(((java.lang.Integer)v33).intValue()));
    Object v35 = ((com.google.javascript.jscomp.LiveVariablesAnalysis.LiveVariableLattice)v30).equals(((java.lang.Object)v34));
    Object v36 = ((com.google.javascript.jscomp.LiveVariablesAnalysis)v12).flowThrough(((com.google.javascript.rhino.Node)v16),((com.google.javascript.jscomp.LiveVariablesAnalysis.LiveVariableLattice)v30));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.StrictWarningsGuard();
    Object v1 = false;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    ((com.google.javascript.jscomp.graph.Graph)v3).clearEdgeAnnotations();
    Object v4 = null;
    Object v5 = -26;
    Object v6 = 81;
    Object v7 = -11;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.jstype.ObjectType)v9));
    Object v11 = new com.google.javascript.jscomp.Compiler();
    Object v12 = new com.google.javascript.jscomp.LiveVariablesAnalysis(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v10),((com.google.javascript.jscomp.AbstractCompiler)v11));
    Object v13 = -26;
    Object v14 = 81;
    Object v15 = -11;
    Object v16 = new com.google.javascript.rhino.Node((((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = new com.google.javascript.jscomp.StrictWarningsGuard();
    Object v18 = false;
    Object v19 = false;
    Object v20 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v17),(((java.lang.Boolean)v18).booleanValue()),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = -26;
    Object v22 = 81;
    Object v23 = -11;
    Object v24 = new com.google.javascript.rhino.Node((((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()));
    Object v25 = null;
    Object v26 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v24),((com.google.javascript.rhino.jstype.ObjectType)v25));
    Object v27 = "";
    Object v28 = ((com.google.javascript.jscomp.Scope)v26).getVar(((java.lang.String)v27));
    Object v29 = new com.google.javascript.jscomp.Compiler();
    Object v30 = new com.google.javascript.jscomp.LiveVariablesAnalysis(((com.google.javascript.jscomp.ControlFlowGraph)v20),((com.google.javascript.jscomp.Scope)v26),((com.google.javascript.jscomp.AbstractCompiler)v29));
    Object v31 = ((com.google.javascript.jscomp.LiveVariablesAnalysis)v30).createEntryLattice();
    Object v32 = ((com.google.javascript.jscomp.LiveVariablesAnalysis.LiveVariableLattice)v31).toString();
    Object v33 = ((com.google.javascript.jscomp.LiveVariablesAnalysis)v12).flowThrough(((com.google.javascript.rhino.Node)v16),((com.google.javascript.jscomp.LiveVariablesAnalysis.LiveVariableLattice)v31));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.StrictWarningsGuard();
    Object v1 = false;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -26;
    Object v5 = 81;
    Object v6 = -11;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = null;
    Object v9 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.jstype.ObjectType)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v10).reportCodeChange();
    Object v11 = null;
    Object v12 = new com.google.javascript.jscomp.LiveVariablesAnalysis(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v9),((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v13 = -26;
    Object v14 = 81;
    Object v15 = -11;
    Object v16 = new com.google.javascript.rhino.Node((((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = ((com.google.javascript.rhino.Node)v16).isOnlyModifiesThisCall();
    Object v18 = new com.google.javascript.jscomp.StrictWarningsGuard();
    Object v19 = false;
    Object v20 = false;
    Object v21 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v18),(((java.lang.Boolean)v19).booleanValue()),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = -26;
    Object v23 = 81;
    Object v24 = -11;
    Object v25 = new com.google.javascript.rhino.Node((((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()),(((java.lang.Integer)v24).intValue()));
    Object v26 = null;
    Object v27 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v25),((com.google.javascript.rhino.jstype.ObjectType)v26));
    Object v28 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v28).reportCodeChange();
    Object v29 = null;
    Object v30 = new com.google.javascript.jscomp.LiveVariablesAnalysis(((com.google.javascript.jscomp.ControlFlowGraph)v21),((com.google.javascript.jscomp.Scope)v27),((com.google.javascript.jscomp.AbstractCompiler)v28));
    Object v31 = ((com.google.javascript.jscomp.LiveVariablesAnalysis)v30).createEntryLattice();
    Object v32 = ((com.google.javascript.jscomp.LiveVariablesAnalysis)v12).flowThrough(((com.google.javascript.rhino.Node)v16),((com.google.javascript.jscomp.LiveVariablesAnalysis.LiveVariableLattice)v31));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.StrictWarningsGuard();
    Object v1 = false;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -26;
    Object v5 = 81;
    Object v6 = -11;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = null;
    Object v9 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.jstype.ObjectType)v8));
    Object v10 = "";
    Object v11 = ((com.google.javascript.jscomp.Scope)v9).getVar(((java.lang.String)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.LiveVariablesAnalysis(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v9),((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = -26;
    Object v15 = 81;
    Object v16 = -11;
    Object v17 = new com.google.javascript.rhino.Node((((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = new com.google.javascript.jscomp.StrictWarningsGuard();
    Object v19 = false;
    Object v20 = false;
    Object v21 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v18),(((java.lang.Boolean)v19).booleanValue()),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = -26;
    Object v23 = 81;
    Object v24 = -11;
    Object v25 = new com.google.javascript.rhino.Node((((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()),(((java.lang.Integer)v24).intValue()));
    Object v26 = null;
    Object v27 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v25),((com.google.javascript.rhino.jstype.ObjectType)v26));
    Object v28 = "";
    Object v29 = ((com.google.javascript.jscomp.Scope)v27).getVar(((java.lang.String)v28));
    Object v30 = new com.google.javascript.jscomp.Compiler();
    Object v31 = new com.google.javascript.jscomp.LiveVariablesAnalysis(((com.google.javascript.jscomp.ControlFlowGraph)v21),((com.google.javascript.jscomp.Scope)v27),((com.google.javascript.jscomp.AbstractCompiler)v30));
    Object v32 = ((com.google.javascript.jscomp.LiveVariablesAnalysis)v31).createEntryLattice();
    Object v33 = ((com.google.javascript.jscomp.LiveVariablesAnalysis)v13).flowThrough(((com.google.javascript.rhino.Node)v17),((com.google.javascript.jscomp.LiveVariablesAnalysis.LiveVariableLattice)v32));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.StrictWarningsGuard();
    Object v1 = false;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.google.javascript.jscomp.graph.LinkedDirectedGraph)v3).newSubGraph();
    Object v5 = -26;
    Object v6 = 81;
    Object v7 = -11;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.jstype.ObjectType)v9));
    Object v11 = new com.google.javascript.jscomp.Compiler();
    Object v12 = new com.google.javascript.jscomp.LiveVariablesAnalysis(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v10),((com.google.javascript.jscomp.AbstractCompiler)v11));
    Object v13 = -26;
    Object v14 = 81;
    Object v15 = -11;
    Object v16 = new com.google.javascript.rhino.Node((((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = new com.google.javascript.jscomp.StrictWarningsGuard();
    Object v18 = false;
    Object v19 = false;
    Object v20 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v17),(((java.lang.Boolean)v18).booleanValue()),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = -26;
    Object v22 = 81;
    Object v23 = -11;
    Object v24 = new com.google.javascript.rhino.Node((((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()));
    Object v25 = null;
    Object v26 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v24),((com.google.javascript.rhino.jstype.ObjectType)v25));
    Object v27 = "";
    Object v28 = ((com.google.javascript.jscomp.Scope)v26).getVar(((java.lang.String)v27));
    Object v29 = new com.google.javascript.jscomp.Compiler();
    Object v30 = new com.google.javascript.jscomp.LiveVariablesAnalysis(((com.google.javascript.jscomp.ControlFlowGraph)v20),((com.google.javascript.jscomp.Scope)v26),((com.google.javascript.jscomp.AbstractCompiler)v29));
    Object v31 = ((com.google.javascript.jscomp.LiveVariablesAnalysis)v30).createEntryLattice();
    Object v32 = ((com.google.javascript.jscomp.LiveVariablesAnalysis)v12).flowThrough(((com.google.javascript.rhino.Node)v16),((com.google.javascript.jscomp.LiveVariablesAnalysis.LiveVariableLattice)v31));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.StrictWarningsGuard();
    Object v1 = false;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -26;
    Object v5 = 81;
    Object v6 = -11;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = null;
    Object v9 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.jstype.ObjectType)v8));
    Object v10 = "";
    Object v11 = ((com.google.javascript.jscomp.Scope)v9).getVar(((java.lang.String)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.LiveVariablesAnalysis(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v9),((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = -26;
    Object v15 = 81;
    Object v16 = -11;
    Object v17 = new com.google.javascript.rhino.Node((((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = new com.google.javascript.jscomp.StrictWarningsGuard();
    Object v19 = false;
    Object v20 = false;
    Object v21 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v18),(((java.lang.Boolean)v19).booleanValue()),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = -26;
    Object v23 = 81;
    Object v24 = -11;
    Object v25 = new com.google.javascript.rhino.Node((((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()),(((java.lang.Integer)v24).intValue()));
    Object v26 = null;
    Object v27 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v25),((com.google.javascript.rhino.jstype.ObjectType)v26));
    Object v28 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v28).reportCodeChange();
    Object v29 = null;
    Object v30 = new com.google.javascript.jscomp.LiveVariablesAnalysis(((com.google.javascript.jscomp.ControlFlowGraph)v21),((com.google.javascript.jscomp.Scope)v27),((com.google.javascript.jscomp.AbstractCompiler)v28));
    Object v31 = ((com.google.javascript.jscomp.LiveVariablesAnalysis)v30).createEntryLattice();
    Object v32 = ((com.google.javascript.jscomp.LiveVariablesAnalysis)v13).flowThrough(((com.google.javascript.rhino.Node)v17),((com.google.javascript.jscomp.LiveVariablesAnalysis.LiveVariableLattice)v31));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.StrictWarningsGuard();
    Object v1 = false;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    ((com.google.javascript.jscomp.graph.Graph)v3).clearEdgeAnnotations();
    Object v4 = null;
    Object v5 = -26;
    Object v6 = 81;
    Object v7 = -11;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.jstype.ObjectType)v9));
    Object v11 = new com.google.javascript.jscomp.Compiler();
    Object v12 = new com.google.javascript.jscomp.LiveVariablesAnalysis(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v10),((com.google.javascript.jscomp.AbstractCompiler)v11));
    Object v13 = -26;
    Object v14 = 81;
    Object v15 = -11;
    Object v16 = new com.google.javascript.rhino.Node((((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = new com.google.javascript.jscomp.StrictWarningsGuard();
    Object v18 = false;
    Object v19 = false;
    Object v20 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v17),(((java.lang.Boolean)v18).booleanValue()),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = -26;
    Object v22 = 81;
    Object v23 = -11;
    Object v24 = new com.google.javascript.rhino.Node((((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()));
    Object v25 = null;
    Object v26 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v24),((com.google.javascript.rhino.jstype.ObjectType)v25));
    Object v27 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v27).reportCodeChange();
    Object v28 = null;
    Object v29 = new com.google.javascript.jscomp.LiveVariablesAnalysis(((com.google.javascript.jscomp.ControlFlowGraph)v20),((com.google.javascript.jscomp.Scope)v26),((com.google.javascript.jscomp.AbstractCompiler)v27));
    Object v30 = ((com.google.javascript.jscomp.LiveVariablesAnalysis)v29).createInitialEstimateLattice();
    Object v31 = ((com.google.javascript.jscomp.LiveVariablesAnalysis)v12).flowThrough(((com.google.javascript.rhino.Node)v16),((com.google.javascript.jscomp.LiveVariablesAnalysis.LiveVariableLattice)v30));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.StrictWarningsGuard();
    Object v1 = false;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -26;
    Object v5 = 81;
    Object v6 = -11;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = null;
    Object v9 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.jstype.ObjectType)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler();
    Object v11 = ((com.google.javascript.jscomp.AbstractCompiler)v10).getErrorManager();
    Object v12 = new com.google.javascript.jscomp.LiveVariablesAnalysis(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v9),((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v13 = -26;
    Object v14 = 81;
    Object v15 = -11;
    Object v16 = new com.google.javascript.rhino.Node((((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = -26;
    Object v18 = 81;
    Object v19 = -11;
    Object v20 = new com.google.javascript.rhino.Node((((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()));
    Object v21 = ((com.google.javascript.rhino.Node)v16).isEquivalentTo(((com.google.javascript.rhino.Node)v20));
    Object v22 = new com.google.javascript.jscomp.StrictWarningsGuard();
    Object v23 = false;
    Object v24 = false;
    Object v25 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v22),(((java.lang.Boolean)v23).booleanValue()),(((java.lang.Boolean)v24).booleanValue()));
    Object v26 = -26;
    Object v27 = 81;
    Object v28 = -11;
    Object v29 = new com.google.javascript.rhino.Node((((java.lang.Integer)v26).intValue()),(((java.lang.Integer)v27).intValue()),(((java.lang.Integer)v28).intValue()));
    Object v30 = null;
    Object v31 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v29),((com.google.javascript.rhino.jstype.ObjectType)v30));
    Object v32 = "";
    Object v33 = ((com.google.javascript.jscomp.Scope)v31).getVar(((java.lang.String)v32));
    Object v34 = new com.google.javascript.jscomp.Compiler();
    Object v35 = new com.google.javascript.jscomp.LiveVariablesAnalysis(((com.google.javascript.jscomp.ControlFlowGraph)v25),((com.google.javascript.jscomp.Scope)v31),((com.google.javascript.jscomp.AbstractCompiler)v34));
    Object v36 = ((com.google.javascript.jscomp.LiveVariablesAnalysis)v35).createEntryLattice();
    Object v37 = ((com.google.javascript.jscomp.LiveVariablesAnalysis)v12).flowThrough(((com.google.javascript.rhino.Node)v16),((com.google.javascript.jscomp.LiveVariablesAnalysis.LiveVariableLattice)v36));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.StrictWarningsGuard();
    Object v1 = false;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -26;
    Object v5 = 81;
    Object v6 = -11;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = null;
    Object v9 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.jstype.ObjectType)v8));
    Object v10 = "";
    Object v11 = ((com.google.javascript.jscomp.Scope)v9).getVar(((java.lang.String)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.LiveVariablesAnalysis(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v9),((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = ((com.google.javascript.jscomp.LiveVariablesAnalysis)v13).createInitialEstimateLattice();
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.StrictWarningsGuard();
    Object v1 = false;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    ((com.google.javascript.jscomp.graph.Graph)v3).clearEdgeAnnotations();
    Object v4 = null;
    Object v5 = -26;
    Object v6 = 81;
    Object v7 = -11;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.jstype.ObjectType)v9));
    Object v11 = new com.google.javascript.jscomp.Compiler();
    Object v12 = new com.google.javascript.jscomp.LiveVariablesAnalysis(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v10),((com.google.javascript.jscomp.AbstractCompiler)v11));
    Object v13 = "Q";
    Object v14 = ((com.google.javascript.jscomp.LiveVariablesAnalysis)v12).getVarIndex(((java.lang.String)v13));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.StrictWarningsGuard();
    Object v1 = false;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -26;
    Object v5 = 81;
    Object v6 = -11;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = null;
    Object v9 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.jstype.ObjectType)v8));
    Object v10 = "";
    Object v11 = ((com.google.javascript.jscomp.Scope)v9).getVar(((java.lang.String)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.LiveVariablesAnalysis(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v9),((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = ((com.google.javascript.jscomp.LiveVariablesAnalysis)v13).isForward();
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.StrictWarningsGuard();
    Object v1 = false;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -26;
    Object v5 = 81;
    Object v6 = -11;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = null;
    Object v9 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.jstype.ObjectType)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v10).reportCodeChange();
    Object v11 = null;
    Object v12 = new com.google.javascript.jscomp.LiveVariablesAnalysis(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v9),((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v13 = "eva";
    Object v14 = ((com.google.javascript.jscomp.LiveVariablesAnalysis)v12).getVarIndex(((java.lang.String)v13));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.StrictWarningsGuard();
    Object v1 = false;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    ((com.google.javascript.jscomp.graph.Graph)v3).clearEdgeAnnotations();
    Object v4 = null;
    Object v5 = -26;
    Object v6 = 81;
    Object v7 = -11;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.jstype.ObjectType)v9));
    Object v11 = new com.google.javascript.jscomp.Compiler();
    Object v12 = new com.google.javascript.jscomp.LiveVariablesAnalysis(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v10),((com.google.javascript.jscomp.AbstractCompiler)v11));
    Object v13 = -26;
    Object v14 = 81;
    Object v15 = -11;
    Object v16 = new com.google.javascript.rhino.Node((((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = new com.google.javascript.jscomp.StrictWarningsGuard();
    Object v18 = false;
    Object v19 = false;
    Object v20 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v17),(((java.lang.Boolean)v18).booleanValue()),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = -26;
    Object v22 = 81;
    Object v23 = -11;
    Object v24 = new com.google.javascript.rhino.Node((((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()));
    Object v25 = null;
    Object v26 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v24),((com.google.javascript.rhino.jstype.ObjectType)v25));
    Object v27 = "";
    Object v28 = ((com.google.javascript.jscomp.Scope)v26).getVar(((java.lang.String)v27));
    Object v29 = new com.google.javascript.jscomp.Compiler();
    Object v30 = new com.google.javascript.jscomp.LiveVariablesAnalysis(((com.google.javascript.jscomp.ControlFlowGraph)v20),((com.google.javascript.jscomp.Scope)v26),((com.google.javascript.jscomp.AbstractCompiler)v29));
    Object v31 = ((com.google.javascript.jscomp.LiveVariablesAnalysis)v30).createEntryLattice();
    Object v32 = ((com.google.javascript.jscomp.LiveVariablesAnalysis)v12).flowThrough(((com.google.javascript.rhino.Node)v16),((com.google.javascript.jscomp.LiveVariablesAnalysis.LiveVariableLattice)v31));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.StrictWarningsGuard();
    Object v1 = false;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    ((com.google.javascript.jscomp.graph.Graph)v3).clearEdgeAnnotations();
    Object v4 = null;
    Object v5 = -26;
    Object v6 = 81;
    Object v7 = -11;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.jstype.ObjectType)v9));
    Object v11 = new com.google.javascript.jscomp.Compiler();
    Object v12 = new com.google.javascript.jscomp.LiveVariablesAnalysis(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v10),((com.google.javascript.jscomp.AbstractCompiler)v11));
    Object v13 = -26;
    Object v14 = 81;
    Object v15 = -11;
    Object v16 = new com.google.javascript.rhino.Node((((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = new com.google.javascript.jscomp.StrictWarningsGuard();
    Object v18 = false;
    Object v19 = false;
    Object v20 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v17),(((java.lang.Boolean)v18).booleanValue()),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = -26;
    Object v22 = 81;
    Object v23 = -11;
    Object v24 = new com.google.javascript.rhino.Node((((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()));
    Object v25 = null;
    Object v26 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v24),((com.google.javascript.rhino.jstype.ObjectType)v25));
    Object v27 = new com.google.javascript.jscomp.Compiler();
    Object v28 = new com.google.javascript.jscomp.LiveVariablesAnalysis(((com.google.javascript.jscomp.ControlFlowGraph)v20),((com.google.javascript.jscomp.Scope)v26),((com.google.javascript.jscomp.AbstractCompiler)v27));
    Object v29 = ((com.google.javascript.jscomp.LiveVariablesAnalysis)v28).createInitialEstimateLattice();
    Object v30 = ((com.google.javascript.jscomp.LiveVariablesAnalysis)v12).flowThrough(((com.google.javascript.rhino.Node)v16),((com.google.javascript.jscomp.LiveVariablesAnalysis.LiveVariableLattice)v29));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.StrictWarningsGuard();
    Object v1 = false;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -26;
    Object v5 = 81;
    Object v6 = -11;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = null;
    Object v9 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.jstype.ObjectType)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v10).reportCodeChange();
    Object v11 = null;
    Object v12 = new com.google.javascript.jscomp.LiveVariablesAnalysis(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v9),((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v13 = -26;
    Object v14 = 81;
    Object v15 = -11;
    Object v16 = new com.google.javascript.rhino.Node((((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = new com.google.javascript.jscomp.StrictWarningsGuard();
    Object v18 = false;
    Object v19 = false;
    Object v20 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v17),(((java.lang.Boolean)v18).booleanValue()),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = -26;
    Object v22 = 81;
    Object v23 = -11;
    Object v24 = new com.google.javascript.rhino.Node((((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()));
    Object v25 = null;
    Object v26 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v24),((com.google.javascript.rhino.jstype.ObjectType)v25));
    Object v27 = "";
    Object v28 = ((com.google.javascript.jscomp.Scope)v26).getVar(((java.lang.String)v27));
    Object v29 = new com.google.javascript.jscomp.Compiler();
    Object v30 = new com.google.javascript.jscomp.LiveVariablesAnalysis(((com.google.javascript.jscomp.ControlFlowGraph)v20),((com.google.javascript.jscomp.Scope)v26),((com.google.javascript.jscomp.AbstractCompiler)v29));
    Object v31 = ((com.google.javascript.jscomp.LiveVariablesAnalysis)v30).createEntryLattice();
    Object v32 = ((com.google.javascript.jscomp.LiveVariablesAnalysis)v12).flowThrough(((com.google.javascript.rhino.Node)v16),((com.google.javascript.jscomp.LiveVariablesAnalysis.LiveVariableLattice)v31));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.StrictWarningsGuard();
    Object v1 = false;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -26;
    Object v5 = 81;
    Object v6 = -11;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = null;
    Object v9 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.jstype.ObjectType)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler();
    Object v11 = ((com.google.javascript.jscomp.AbstractCompiler)v10).getErrorManager();
    Object v12 = new com.google.javascript.jscomp.LiveVariablesAnalysis(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v9),((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v13 = -26;
    Object v14 = 81;
    Object v15 = -11;
    Object v16 = new com.google.javascript.rhino.Node((((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = ((com.google.javascript.rhino.Node)v16).hasSideEffects();
    Object v18 = new com.google.javascript.jscomp.StrictWarningsGuard();
    Object v19 = false;
    Object v20 = false;
    Object v21 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v18),(((java.lang.Boolean)v19).booleanValue()),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = -26;
    Object v23 = 81;
    Object v24 = -11;
    Object v25 = new com.google.javascript.rhino.Node((((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()),(((java.lang.Integer)v24).intValue()));
    Object v26 = null;
    Object v27 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v25),((com.google.javascript.rhino.jstype.ObjectType)v26));
    Object v28 = "";
    Object v29 = ((com.google.javascript.jscomp.Scope)v27).getVar(((java.lang.String)v28));
    Object v30 = new com.google.javascript.jscomp.Compiler();
    Object v31 = new com.google.javascript.jscomp.LiveVariablesAnalysis(((com.google.javascript.jscomp.ControlFlowGraph)v21),((com.google.javascript.jscomp.Scope)v27),((com.google.javascript.jscomp.AbstractCompiler)v30));
    Object v32 = ((com.google.javascript.jscomp.LiveVariablesAnalysis)v31).createInitialEstimateLattice();
    Object v33 = ((com.google.javascript.jscomp.LiveVariablesAnalysis)v12).flowThrough(((com.google.javascript.rhino.Node)v16),((com.google.javascript.jscomp.LiveVariablesAnalysis.LiveVariableLattice)v32));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.StrictWarningsGuard();
    Object v1 = false;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -26;
    Object v5 = 81;
    Object v6 = -11;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = null;
    Object v9 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.jstype.ObjectType)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v10).reportCodeChange();
    Object v11 = null;
    Object v12 = new com.google.javascript.jscomp.LiveVariablesAnalysis(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v9),((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v13 = ((com.google.javascript.jscomp.LiveVariablesAnalysis)v12).getEscapedLocals();
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.StrictWarningsGuard();
    Object v1 = false;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.google.javascript.jscomp.graph.LinkedDirectedGraph)v3).newSubGraph();
    Object v5 = -26;
    Object v6 = 81;
    Object v7 = -11;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.jstype.ObjectType)v9));
    Object v11 = new com.google.javascript.jscomp.Compiler();
    Object v12 = new com.google.javascript.jscomp.LiveVariablesAnalysis(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v10),((com.google.javascript.jscomp.AbstractCompiler)v11));
    Object v13 = -26;
    Object v14 = 81;
    Object v15 = -11;
    Object v16 = new com.google.javascript.rhino.Node((((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = new com.google.javascript.jscomp.StrictWarningsGuard();
    Object v18 = false;
    Object v19 = false;
    Object v20 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v17),(((java.lang.Boolean)v18).booleanValue()),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = -26;
    Object v22 = 81;
    Object v23 = -11;
    Object v24 = new com.google.javascript.rhino.Node((((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()));
    Object v25 = null;
    Object v26 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v24),((com.google.javascript.rhino.jstype.ObjectType)v25));
    Object v27 = "";
    Object v28 = ((com.google.javascript.jscomp.Scope)v26).getVar(((java.lang.String)v27));
    Object v29 = new com.google.javascript.jscomp.Compiler();
    Object v30 = new com.google.javascript.jscomp.LiveVariablesAnalysis(((com.google.javascript.jscomp.ControlFlowGraph)v20),((com.google.javascript.jscomp.Scope)v26),((com.google.javascript.jscomp.AbstractCompiler)v29));
    Object v31 = ((com.google.javascript.jscomp.LiveVariablesAnalysis)v30).createInitialEstimateLattice();
    Object v32 = ((com.google.javascript.jscomp.LiveVariablesAnalysis)v12).flowThrough(((com.google.javascript.rhino.Node)v16),((com.google.javascript.jscomp.LiveVariablesAnalysis.LiveVariableLattice)v31));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.StrictWarningsGuard();
    Object v1 = false;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -26;
    Object v5 = 81;
    Object v6 = -11;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = null;
    Object v9 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.jstype.ObjectType)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler();
    Object v11 = ((com.google.javascript.jscomp.AbstractCompiler)v10).getErrorManager();
    Object v12 = new com.google.javascript.jscomp.LiveVariablesAnalysis(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v9),((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v13 = -26;
    Object v14 = 81;
    Object v15 = -11;
    Object v16 = new com.google.javascript.rhino.Node((((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = 41;
    Object v18 = 1;
    ((com.google.javascript.rhino.Node)v16).putIntProp((((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()));
    Object v19 = null;
    Object v20 = new com.google.javascript.jscomp.StrictWarningsGuard();
    Object v21 = false;
    Object v22 = false;
    Object v23 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v20),(((java.lang.Boolean)v21).booleanValue()),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = -26;
    Object v25 = 81;
    Object v26 = -11;
    Object v27 = new com.google.javascript.rhino.Node((((java.lang.Integer)v24).intValue()),(((java.lang.Integer)v25).intValue()),(((java.lang.Integer)v26).intValue()));
    Object v28 = null;
    Object v29 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v27),((com.google.javascript.rhino.jstype.ObjectType)v28));
    Object v30 = new com.google.javascript.jscomp.Compiler();
    Object v31 = new com.google.javascript.jscomp.LiveVariablesAnalysis(((com.google.javascript.jscomp.ControlFlowGraph)v23),((com.google.javascript.jscomp.Scope)v29),((com.google.javascript.jscomp.AbstractCompiler)v30));
    Object v32 = ((com.google.javascript.jscomp.LiveVariablesAnalysis)v31).createEntryLattice();
    Object v33 = ((com.google.javascript.jscomp.LiveVariablesAnalysis)v12).flowThrough(((com.google.javascript.rhino.Node)v16),((com.google.javascript.jscomp.LiveVariablesAnalysis.LiveVariableLattice)v32));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.StrictWarningsGuard();
    Object v1 = false;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -26;
    Object v5 = 81;
    Object v6 = -11;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = null;
    Object v9 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.jstype.ObjectType)v8));
    Object v10 = "";
    Object v11 = ((com.google.javascript.jscomp.Scope)v9).getVar(((java.lang.String)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.LiveVariablesAnalysis(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v9),((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = -26;
    Object v15 = 81;
    Object v16 = -11;
    Object v17 = new com.google.javascript.rhino.Node((((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = 20;
    Object v19 = ((com.google.javascript.rhino.Node)v17).getIntProp((((java.lang.Integer)v18).intValue()));
    Object v20 = new com.google.javascript.jscomp.StrictWarningsGuard();
    Object v21 = false;
    Object v22 = false;
    Object v23 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v20),(((java.lang.Boolean)v21).booleanValue()),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = -26;
    Object v25 = 81;
    Object v26 = -11;
    Object v27 = new com.google.javascript.rhino.Node((((java.lang.Integer)v24).intValue()),(((java.lang.Integer)v25).intValue()),(((java.lang.Integer)v26).intValue()));
    Object v28 = null;
    Object v29 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v27),((com.google.javascript.rhino.jstype.ObjectType)v28));
    Object v30 = "";
    Object v31 = ((com.google.javascript.jscomp.Scope)v29).getVar(((java.lang.String)v30));
    Object v32 = new com.google.javascript.jscomp.Compiler();
    Object v33 = new com.google.javascript.jscomp.LiveVariablesAnalysis(((com.google.javascript.jscomp.ControlFlowGraph)v23),((com.google.javascript.jscomp.Scope)v29),((com.google.javascript.jscomp.AbstractCompiler)v32));
    Object v34 = ((com.google.javascript.jscomp.LiveVariablesAnalysis)v33).createEntryLattice();
    Object v35 = ((com.google.javascript.jscomp.LiveVariablesAnalysis)v13).flowThrough(((com.google.javascript.rhino.Node)v17),((com.google.javascript.jscomp.LiveVariablesAnalysis.LiveVariableLattice)v34));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.StrictWarningsGuard();
    Object v1 = false;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -26;
    Object v5 = 81;
    Object v6 = -11;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = null;
    Object v9 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.jstype.ObjectType)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler();
    Object v11 = new com.google.javascript.jscomp.LiveVariablesAnalysis(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v9),((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v12 = -26;
    Object v13 = 81;
    Object v14 = -11;
    Object v15 = new com.google.javascript.rhino.Node((((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = ((com.google.javascript.rhino.Node)v15).getSideEffectFlags();
    Object v17 = new com.google.javascript.jscomp.StrictWarningsGuard();
    Object v18 = false;
    Object v19 = false;
    Object v20 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v17),(((java.lang.Boolean)v18).booleanValue()),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = -26;
    Object v22 = 81;
    Object v23 = -11;
    Object v24 = new com.google.javascript.rhino.Node((((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()));
    Object v25 = null;
    Object v26 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v24),((com.google.javascript.rhino.jstype.ObjectType)v25));
    Object v27 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v27).reportCodeChange();
    Object v28 = null;
    Object v29 = new com.google.javascript.jscomp.LiveVariablesAnalysis(((com.google.javascript.jscomp.ControlFlowGraph)v20),((com.google.javascript.jscomp.Scope)v26),((com.google.javascript.jscomp.AbstractCompiler)v27));
    Object v30 = ((com.google.javascript.jscomp.LiveVariablesAnalysis)v29).createEntryLattice();
    Object v31 = ((com.google.javascript.jscomp.LiveVariablesAnalysis)v11).flowThrough(((com.google.javascript.rhino.Node)v15),((com.google.javascript.jscomp.LiveVariablesAnalysis.LiveVariableLattice)v30));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.StrictWarningsGuard();
    Object v1 = false;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -26;
    Object v5 = 81;
    Object v6 = -11;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = null;
    Object v9 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.jstype.ObjectType)v8));
    Object v10 = "";
    Object v11 = ((com.google.javascript.jscomp.Scope)v9).getVar(((java.lang.String)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.LiveVariablesAnalysis(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v9),((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = -26;
    Object v15 = 81;
    Object v16 = -11;
    Object v17 = new com.google.javascript.rhino.Node((((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = new com.google.javascript.jscomp.StrictWarningsGuard();
    Object v19 = false;
    Object v20 = false;
    Object v21 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v18),(((java.lang.Boolean)v19).booleanValue()),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = -26;
    Object v23 = 81;
    Object v24 = -11;
    Object v25 = new com.google.javascript.rhino.Node((((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()),(((java.lang.Integer)v24).intValue()));
    Object v26 = null;
    Object v27 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v25),((com.google.javascript.rhino.jstype.ObjectType)v26));
    Object v28 = "";
    Object v29 = ((com.google.javascript.jscomp.Scope)v27).getVar(((java.lang.String)v28));
    Object v30 = new com.google.javascript.jscomp.Compiler();
    Object v31 = new com.google.javascript.jscomp.LiveVariablesAnalysis(((com.google.javascript.jscomp.ControlFlowGraph)v21),((com.google.javascript.jscomp.Scope)v27),((com.google.javascript.jscomp.AbstractCompiler)v30));
    Object v32 = ((com.google.javascript.jscomp.LiveVariablesAnalysis)v31).createInitialEstimateLattice();
    Object v33 = -26;
    Object v34 = 81;
    Object v35 = -11;
    Object v36 = new com.google.javascript.rhino.Node((((java.lang.Integer)v33).intValue()),(((java.lang.Integer)v34).intValue()),(((java.lang.Integer)v35).intValue()));
    Object v37 = ((com.google.javascript.jscomp.LiveVariablesAnalysis.LiveVariableLattice)v32).equals(((java.lang.Object)v36));
    Object v38 = ((com.google.javascript.jscomp.LiveVariablesAnalysis)v13).flowThrough(((com.google.javascript.rhino.Node)v17),((com.google.javascript.jscomp.LiveVariablesAnalysis.LiveVariableLattice)v32));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.StrictWarningsGuard();
    Object v1 = false;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -26;
    Object v5 = 81;
    Object v6 = -11;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = null;
    Object v9 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.jstype.ObjectType)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler();
    Object v11 = ((com.google.javascript.jscomp.AbstractCompiler)v10).getTopScope();
    Object v12 = new com.google.javascript.jscomp.LiveVariablesAnalysis(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v9),((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v13 = -26;
    Object v14 = 81;
    Object v15 = -11;
    Object v16 = new com.google.javascript.rhino.Node((((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = new com.google.javascript.jscomp.StrictWarningsGuard();
    Object v18 = false;
    Object v19 = false;
    Object v20 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v17),(((java.lang.Boolean)v18).booleanValue()),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = -26;
    Object v22 = 81;
    Object v23 = -11;
    Object v24 = new com.google.javascript.rhino.Node((((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()));
    Object v25 = null;
    Object v26 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v24),((com.google.javascript.rhino.jstype.ObjectType)v25));
    Object v27 = "";
    Object v28 = ((com.google.javascript.jscomp.Scope)v26).getVar(((java.lang.String)v27));
    Object v29 = new com.google.javascript.jscomp.Compiler();
    Object v30 = new com.google.javascript.jscomp.LiveVariablesAnalysis(((com.google.javascript.jscomp.ControlFlowGraph)v20),((com.google.javascript.jscomp.Scope)v26),((com.google.javascript.jscomp.AbstractCompiler)v29));
    Object v31 = ((com.google.javascript.jscomp.LiveVariablesAnalysis)v30).createInitialEstimateLattice();
    Object v32 = ((com.google.javascript.jscomp.LiveVariablesAnalysis)v12).flowThrough(((com.google.javascript.rhino.Node)v16),((com.google.javascript.jscomp.LiveVariablesAnalysis.LiveVariableLattice)v31));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }
}
