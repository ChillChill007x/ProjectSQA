package com.google.javascript.jscomp;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.Compiler();
    Object v2 = true;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = true;
    Object v10 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = null;
    Object v12 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.ObjectType)v11));
    Object v13 = true;
    Object v14 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v13).booleanValue()));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.jstype.ObjectType)v15));
    Object v17 = true;
    Object v18 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v17).booleanValue()));
    Object v19 = null;
    Object v20 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v18),((com.google.javascript.rhino.jstype.ObjectType)v19));
    Object v21 = java.util.Map.of(((java.lang.Object)v16),((java.lang.Object)v20));
    Object v22 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v8),((com.google.javascript.jscomp.Scope)v12),((java.util.Map)v21));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v2 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v3 = ((com.google.javascript.rhino.jstype.BooleanLiteralSet)v1).intersection(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v2));
    Object v4 = false;
    Object v5 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v0),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v1),(((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.Compiler();
    Object v2 = true;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = true;
    Object v10 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = true;
    Object v12 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v11).booleanValue()));
    Object v13 = null;
    Object v14 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.jstype.ObjectType)v13));
    Object v15 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v14));
    Object v16 = false;
    Object v17 = ((com.google.javascript.jscomp.ReverseAbstractInterpreter)v8).getPreciserScopeKnowingConditionOutcome(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.FlowScope)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = true;
    Object v19 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v18).booleanValue()));
    Object v20 = null;
    Object v21 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v19),((com.google.javascript.rhino.jstype.ObjectType)v20));
    Object v22 = true;
    Object v23 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v22).booleanValue()));
    Object v24 = null;
    Object v25 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v23),((com.google.javascript.rhino.jstype.ObjectType)v24));
    Object v26 = true;
    Object v27 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v26).booleanValue()));
    Object v28 = null;
    Object v29 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v27),((com.google.javascript.rhino.jstype.ObjectType)v28));
    Object v30 = java.util.Map.of(((java.lang.Object)v25),((java.lang.Object)v29));
    Object v31 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v8),((com.google.javascript.jscomp.Scope)v21),((java.util.Map)v30));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.Compiler();
    Object v2 = true;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = true;
    Object v10 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = null;
    Object v12 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.ObjectType)v11));
    Object v13 = "O";
    Object v14 = ((com.google.javascript.jscomp.Scope)v12).getVar(((java.lang.String)v13));
    Object v15 = true;
    Object v16 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v15).booleanValue()));
    Object v17 = null;
    Object v18 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v16),((com.google.javascript.rhino.jstype.ObjectType)v17));
    Object v19 = true;
    Object v20 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v19).booleanValue()));
    Object v21 = null;
    Object v22 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.jstype.ObjectType)v21));
    Object v23 = java.util.Map.of(((java.lang.Object)v18),((java.lang.Object)v22));
    Object v24 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v8),((com.google.javascript.jscomp.Scope)v12),((java.util.Map)v23));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v2 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v3 = ((com.google.javascript.rhino.jstype.BooleanLiteralSet)v1).intersection(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v2));
    Object v4 = false;
    Object v5 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v0),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v1),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v7 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v8 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v9 = ((com.google.javascript.rhino.jstype.BooleanLiteralSet)v7).intersection(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v8));
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v6),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v7),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = true;
    Object v13 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v5),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v11),(((java.lang.Boolean)v12).booleanValue()));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v2 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v3 = ((com.google.javascript.rhino.jstype.BooleanLiteralSet)v1).intersection(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v2));
    Object v4 = false;
    Object v5 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v0),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v1),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v7 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v8 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v9 = ((com.google.javascript.rhino.jstype.BooleanLiteralSet)v7).intersection(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v8));
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v6),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v7),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v13 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v14 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v15 = ((com.google.javascript.rhino.jstype.BooleanLiteralSet)v13).intersection(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v14));
    Object v16 = false;
    Object v17 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v12),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v13),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = true;
    Object v19 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v11),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = true;
    Object v21 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v5),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v19),(((java.lang.Boolean)v20).booleanValue()));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE), v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = null;
    Object v6 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.jstype.ObjectType)v5));
    Object v7 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v6));
    Object v8 = ((com.google.javascript.rhino.jstype.StaticScope)v7).getRootNode();
    Object v9 = ((com.google.javascript.jscomp.TypeInference)v0).branchedFlowThrough(((com.google.javascript.rhino.Node)v2),((com.google.javascript.jscomp.FlowScope)v7));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "4";
    Object v2 = true;
    Object v3 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v5 = "";
    Object v6 = "*";
    Object v7 = com.google.javascript.jscomp.DiagnosticType.error(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = new java.lang.String[]{"",")"};
    Object v9 = com.google.javascript.jscomp.JSError.make(((java.lang.String)v1),((com.google.javascript.rhino.Node)v3),((com.google.javascript.jscomp.CheckLevel)v4),((com.google.javascript.jscomp.DiagnosticType)v7),((java.lang.String[])v8));
    ((com.google.javascript.jscomp.AbstractCompiler)v0).report(((com.google.javascript.jscomp.JSError)v9));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Compiler();
    Object v12 = true;
    Object v13 = false;
    Object v14 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v11),(((java.lang.Boolean)v12).booleanValue()),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = ((com.google.javascript.jscomp.graph.LinkedDirectedGraph)v14).newSubGraph();
    Object v16 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v17 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v17));
    Object v19 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v16),((com.google.javascript.rhino.jstype.JSTypeRegistry)v18));
    Object v20 = true;
    Object v21 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v20).booleanValue()));
    Object v22 = null;
    Object v23 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v21),((com.google.javascript.rhino.jstype.ObjectType)v22));
    Object v24 = true;
    Object v25 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v24).booleanValue()));
    Object v26 = null;
    Object v27 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v25),((com.google.javascript.rhino.jstype.ObjectType)v26));
    Object v28 = true;
    Object v29 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v28).booleanValue()));
    Object v30 = null;
    Object v31 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v29),((com.google.javascript.rhino.jstype.ObjectType)v30));
    Object v32 = java.util.Map.of(((java.lang.Object)v27),((java.lang.Object)v31));
    Object v33 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ControlFlowGraph)v14),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v19),((com.google.javascript.jscomp.Scope)v23),((java.util.Map)v32));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v2 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v3 = ((com.google.javascript.rhino.jstype.BooleanLiteralSet)v1).intersection(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v2));
    Object v4 = false;
    Object v5 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v0),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v1),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v7 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v8 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v9 = ((com.google.javascript.rhino.jstype.BooleanLiteralSet)v7).intersection(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v8));
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v6),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v7),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v13 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v14 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v15 = ((com.google.javascript.rhino.jstype.BooleanLiteralSet)v13).intersection(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v14));
    Object v16 = false;
    Object v17 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v12),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v13),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = true;
    Object v19 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v11),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = false;
    Object v21 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v5),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v19),(((java.lang.Boolean)v20).booleanValue()));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE), v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.Compiler();
    Object v2 = true;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = "";
    Object v6 = "*";
    Object v7 = com.google.javascript.jscomp.DiagnosticType.error(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = ((com.google.javascript.jscomp.graph.LinkedDirectedGraph)v4).getNode(((java.lang.Object)v7));
    Object v9 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v10 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10));
    Object v12 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v9),((com.google.javascript.rhino.jstype.JSTypeRegistry)v11));
    Object v13 = true;
    Object v14 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v13).booleanValue()));
    Object v15 = true;
    Object v16 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v15).booleanValue()));
    Object v17 = null;
    Object v18 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v16),((com.google.javascript.rhino.jstype.ObjectType)v17));
    Object v19 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v18));
    Object v20 = true;
    Object v21 = ((com.google.javascript.jscomp.ReverseAbstractInterpreter)v12).getPreciserScopeKnowingConditionOutcome(((com.google.javascript.rhino.Node)v14),((com.google.javascript.jscomp.FlowScope)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = true;
    Object v23 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v22).booleanValue()));
    Object v24 = null;
    Object v25 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v23),((com.google.javascript.rhino.jstype.ObjectType)v24));
    Object v26 = true;
    Object v27 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v26).booleanValue()));
    Object v28 = null;
    Object v29 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v27),((com.google.javascript.rhino.jstype.ObjectType)v28));
    Object v30 = true;
    Object v31 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v30).booleanValue()));
    Object v32 = null;
    Object v33 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v31),((com.google.javascript.rhino.jstype.ObjectType)v32));
    Object v34 = java.util.Map.of(((java.lang.Object)v29),((java.lang.Object)v33));
    Object v35 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v12),((com.google.javascript.jscomp.Scope)v25),((java.util.Map)v34));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v2 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v3 = ((com.google.javascript.rhino.jstype.BooleanLiteralSet)v1).intersection(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v2));
    Object v4 = false;
    Object v5 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v0),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v1),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v7 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v8 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v9 = ((com.google.javascript.rhino.jstype.BooleanLiteralSet)v7).intersection(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v8));
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v6),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v7),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = true;
    Object v13 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v5),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v15 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v16 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v17 = ((com.google.javascript.rhino.jstype.BooleanLiteralSet)v15).intersection(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v16));
    Object v18 = false;
    Object v19 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v14),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v15),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = true;
    Object v21 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v13),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v19),(((java.lang.Boolean)v20).booleanValue()));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE), v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.Compiler();
    Object v2 = true;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = true;
    Object v10 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = true;
    Object v12 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v11).booleanValue()));
    Object v13 = null;
    Object v14 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.jstype.ObjectType)v13));
    Object v15 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v14));
    Object v16 = true;
    Object v17 = ((com.google.javascript.jscomp.ReverseAbstractInterpreter)v8).getPreciserScopeKnowingConditionOutcome(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.FlowScope)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = true;
    Object v19 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v18).booleanValue()));
    Object v20 = null;
    Object v21 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v19),((com.google.javascript.rhino.jstype.ObjectType)v20));
    Object v22 = true;
    Object v23 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v22).booleanValue()));
    Object v24 = null;
    Object v25 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v23),((com.google.javascript.rhino.jstype.ObjectType)v24));
    Object v26 = true;
    Object v27 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v26).booleanValue()));
    Object v28 = null;
    Object v29 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v27),((com.google.javascript.rhino.jstype.ObjectType)v28));
    Object v30 = java.util.Map.of(((java.lang.Object)v25),((java.lang.Object)v29));
    Object v31 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v8),((com.google.javascript.jscomp.Scope)v21),((java.util.Map)v30));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v2 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v3 = ((com.google.javascript.rhino.jstype.BooleanLiteralSet)v1).intersection(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v2));
    Object v4 = false;
    Object v5 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v0),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v1),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v7 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v8 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v9 = ((com.google.javascript.rhino.jstype.BooleanLiteralSet)v7).intersection(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v8));
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v6),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v7),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = false;
    Object v13 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v5),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v11),(((java.lang.Boolean)v12).booleanValue()));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v2 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v3 = ((com.google.javascript.rhino.jstype.BooleanLiteralSet)v1).intersection(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v2));
    Object v4 = false;
    Object v5 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v0),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v1),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v7 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v8 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v9 = ((com.google.javascript.rhino.jstype.BooleanLiteralSet)v7).intersection(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v8));
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v6),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v7),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = false;
    Object v13 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v5),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v15 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v16 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v17 = ((com.google.javascript.rhino.jstype.BooleanLiteralSet)v15).intersection(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v16));
    Object v18 = false;
    Object v19 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v14),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v15),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = false;
    Object v21 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v13),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v19),(((java.lang.Boolean)v20).booleanValue()));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE), v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v2 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v3 = ((com.google.javascript.rhino.jstype.BooleanLiteralSet)v1).intersection(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v2));
    Object v4 = false;
    Object v5 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v0),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v1),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v7 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v8 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v9 = ((com.google.javascript.rhino.jstype.BooleanLiteralSet)v7).intersection(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v8));
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v6),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v7),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = true;
    Object v13 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v5),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v15 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v16 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v17 = ((com.google.javascript.rhino.jstype.BooleanLiteralSet)v15).intersection(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v16));
    Object v18 = false;
    Object v19 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v14),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v15),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = true;
    Object v21 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v13),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v23 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v24 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v25 = ((com.google.javascript.rhino.jstype.BooleanLiteralSet)v23).intersection(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v24));
    Object v26 = false;
    Object v27 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v22),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v23),(((java.lang.Boolean)v26).booleanValue()));
    Object v28 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v29 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v30 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v31 = ((com.google.javascript.rhino.jstype.BooleanLiteralSet)v29).intersection(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v30));
    Object v32 = false;
    Object v33 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v28),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v29),(((java.lang.Boolean)v32).booleanValue()));
    Object v34 = false;
    Object v35 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v27),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v33),(((java.lang.Boolean)v34).booleanValue()));
    Object v36 = true;
    Object v37 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v21),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v35),(((java.lang.Boolean)v36).booleanValue()));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE), v37);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getProgress();
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = true;
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v7 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7));
    Object v9 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v6),((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = true;
    Object v11 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v10).booleanValue()));
    Object v12 = true;
    Object v13 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v12).booleanValue()));
    Object v14 = null;
    Object v15 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.jstype.ObjectType)v14));
    Object v16 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v15));
    Object v17 = true;
    Object v18 = ((com.google.javascript.jscomp.ReverseAbstractInterpreter)v9).getPreciserScopeKnowingConditionOutcome(((com.google.javascript.rhino.Node)v11),((com.google.javascript.jscomp.FlowScope)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = true;
    Object v20 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v19).booleanValue()));
    Object v21 = null;
    Object v22 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.jstype.ObjectType)v21));
    Object v23 = true;
    Object v24 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v23).booleanValue()));
    Object v25 = null;
    Object v26 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v24),((com.google.javascript.rhino.jstype.ObjectType)v25));
    Object v27 = true;
    Object v28 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v27).booleanValue()));
    Object v29 = null;
    Object v30 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v28),((com.google.javascript.rhino.jstype.ObjectType)v29));
    Object v31 = java.util.Map.of(((java.lang.Object)v26),((java.lang.Object)v30));
    Object v32 = ((java.util.Map)v31).isEmpty();
    Object v33 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ControlFlowGraph)v5),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v9),((com.google.javascript.jscomp.Scope)v22),((java.util.Map)v31));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v2 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v3 = ((com.google.javascript.rhino.jstype.BooleanLiteralSet)v1).intersection(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v2));
    Object v4 = false;
    Object v5 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v0),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v1),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v7 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v8 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v9 = ((com.google.javascript.rhino.jstype.BooleanLiteralSet)v7).intersection(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v8));
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v6),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v7),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = false;
    Object v13 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v5),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v15 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v16 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v17 = ((com.google.javascript.rhino.jstype.BooleanLiteralSet)v15).intersection(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v16));
    Object v18 = false;
    Object v19 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v14),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v15),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v21 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v22 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v23 = ((com.google.javascript.rhino.jstype.BooleanLiteralSet)v21).intersection(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v22));
    Object v24 = false;
    Object v25 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v20),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v21),(((java.lang.Boolean)v24).booleanValue()));
    Object v26 = true;
    Object v27 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v19),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v25),(((java.lang.Boolean)v26).booleanValue()));
    Object v28 = false;
    Object v29 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v13),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v27),(((java.lang.Boolean)v28).booleanValue()));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE), v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.Compiler();
    Object v2 = true;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = true;
    Object v6 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.jstype.ObjectType)v7));
    Object v9 = ((com.google.javascript.jscomp.graph.LinkedDirectedGraph)v4).getNode(((java.lang.Object)v8));
    Object v10 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v11 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v11));
    Object v13 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v10),((com.google.javascript.rhino.jstype.JSTypeRegistry)v12));
    Object v14 = true;
    Object v15 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v14).booleanValue()));
    Object v16 = null;
    Object v17 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v15),((com.google.javascript.rhino.jstype.ObjectType)v16));
    Object v18 = true;
    Object v19 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v18).booleanValue()));
    Object v20 = null;
    Object v21 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v19),((com.google.javascript.rhino.jstype.ObjectType)v20));
    Object v22 = true;
    Object v23 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v22).booleanValue()));
    Object v24 = null;
    Object v25 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v23),((com.google.javascript.rhino.jstype.ObjectType)v24));
    Object v26 = java.util.Map.of(((java.lang.Object)v21),((java.lang.Object)v25));
    Object v27 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v13),((com.google.javascript.jscomp.Scope)v17),((java.util.Map)v26));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v2 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v3 = ((com.google.javascript.rhino.jstype.BooleanLiteralSet)v1).intersection(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v2));
    Object v4 = false;
    Object v5 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v0),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v1),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v7 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v8 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v9 = ((com.google.javascript.rhino.jstype.BooleanLiteralSet)v7).intersection(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v8));
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v6),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v7),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = false;
    Object v13 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v5),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v15 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v16 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v17 = ((com.google.javascript.rhino.jstype.BooleanLiteralSet)v15).intersection(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v16));
    Object v18 = false;
    Object v19 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v14),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v15),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = false;
    Object v21 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v13),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v23 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v24 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v25 = ((com.google.javascript.rhino.jstype.BooleanLiteralSet)v23).intersection(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v24));
    Object v26 = false;
    Object v27 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v22),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v23),(((java.lang.Boolean)v26).booleanValue()));
    Object v28 = false;
    Object v29 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v21),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v27),(((java.lang.Boolean)v28).booleanValue()));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE), v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.Compiler();
    Object v2 = true;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = true;
    Object v10 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = true;
    Object v12 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v11).booleanValue()));
    Object v13 = null;
    Object v14 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.jstype.ObjectType)v13));
    Object v15 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v14));
    Object v16 = false;
    Object v17 = ((com.google.javascript.jscomp.ReverseAbstractInterpreter)v8).getPreciserScopeKnowingConditionOutcome(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.FlowScope)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = true;
    Object v19 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v18).booleanValue()));
    Object v20 = null;
    Object v21 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v19),((com.google.javascript.rhino.jstype.ObjectType)v20));
    Object v22 = true;
    Object v23 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v22).booleanValue()));
    Object v24 = null;
    Object v25 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v23),((com.google.javascript.rhino.jstype.ObjectType)v24));
    Object v26 = true;
    Object v27 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v26).booleanValue()));
    Object v28 = null;
    Object v29 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v27),((com.google.javascript.rhino.jstype.ObjectType)v28));
    Object v30 = java.util.Map.of(((java.lang.Object)v25),((java.lang.Object)v29));
    Object v31 = ((java.util.Map)v30).values();
    Object v32 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v8),((com.google.javascript.jscomp.Scope)v21),((java.util.Map)v30));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v3).booleanValue()));
    ((com.google.javascript.rhino.Node)v2).addChildToBack(((com.google.javascript.rhino.Node)v4));
    Object v5 = null;
    Object v6 = true;
    Object v7 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = null;
    Object v9 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.jstype.ObjectType)v8));
    Object v10 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v9));
    Object v11 = ((com.google.javascript.jscomp.TypeInference)v0).branchedFlowThrough(((com.google.javascript.rhino.Node)v2),((com.google.javascript.jscomp.FlowScope)v10));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getProgress();
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = true;
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = ((com.google.javascript.jscomp.graph.LinkedDirectedGraph)v5).getNodes();
    Object v7 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v8 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v8));
    Object v10 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v7),((com.google.javascript.rhino.jstype.JSTypeRegistry)v9));
    Object v11 = true;
    Object v12 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v11).booleanValue()));
    Object v13 = null;
    Object v14 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.jstype.ObjectType)v13));
    Object v15 = true;
    Object v16 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v15).booleanValue()));
    Object v17 = null;
    Object v18 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v16),((com.google.javascript.rhino.jstype.ObjectType)v17));
    Object v19 = true;
    Object v20 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v19).booleanValue()));
    Object v21 = null;
    Object v22 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.jstype.ObjectType)v21));
    Object v23 = java.util.Map.of(((java.lang.Object)v18),((java.lang.Object)v22));
    Object v24 = ((java.util.Map)v23).isEmpty();
    Object v25 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ControlFlowGraph)v5),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v10),((com.google.javascript.jscomp.Scope)v14),((java.util.Map)v23));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "4";
    Object v2 = true;
    Object v3 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v5 = "";
    Object v6 = "*";
    Object v7 = com.google.javascript.jscomp.DiagnosticType.error(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = new java.lang.String[]{"",")"};
    Object v9 = com.google.javascript.jscomp.JSError.make(((java.lang.String)v1),((com.google.javascript.rhino.Node)v3),((com.google.javascript.jscomp.CheckLevel)v4),((com.google.javascript.jscomp.DiagnosticType)v7),((java.lang.String[])v8));
    ((com.google.javascript.jscomp.AbstractCompiler)v0).report(((com.google.javascript.jscomp.JSError)v9));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Compiler();
    Object v12 = true;
    Object v13 = false;
    Object v14 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v11),(((java.lang.Boolean)v12).booleanValue()),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v16 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v16));
    Object v18 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v15),((com.google.javascript.rhino.jstype.JSTypeRegistry)v17));
    Object v19 = true;
    Object v20 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v19).booleanValue()));
    Object v21 = null;
    Object v22 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.jstype.ObjectType)v21));
    Object v23 = true;
    Object v24 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v23).booleanValue()));
    Object v25 = null;
    Object v26 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v24),((com.google.javascript.rhino.jstype.ObjectType)v25));
    Object v27 = true;
    Object v28 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v27).booleanValue()));
    Object v29 = null;
    Object v30 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v28),((com.google.javascript.rhino.jstype.ObjectType)v29));
    Object v31 = java.util.Map.of(((java.lang.Object)v26),((java.lang.Object)v30));
    Object v32 = "";
    Object v33 = new com.google.javascript.rhino.InputId(((java.lang.String)v32));
    Object v34 = ((java.util.Map)v31).containsValue(((java.lang.Object)v33));
    Object v35 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ControlFlowGraph)v14),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v18),((com.google.javascript.jscomp.Scope)v22),((java.util.Map)v31));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v2 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v3 = ((com.google.javascript.rhino.jstype.BooleanLiteralSet)v1).intersection(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v2));
    Object v4 = false;
    Object v5 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v0),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v1),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v7 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v8 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v9 = ((com.google.javascript.rhino.jstype.BooleanLiteralSet)v7).intersection(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v8));
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v6),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v7),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = false;
    Object v13 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v5),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v15 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v16 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v17 = ((com.google.javascript.rhino.jstype.BooleanLiteralSet)v15).intersection(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v16));
    Object v18 = false;
    Object v19 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v14),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v15),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v21 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v22 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v23 = ((com.google.javascript.rhino.jstype.BooleanLiteralSet)v21).intersection(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v22));
    Object v24 = false;
    Object v25 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v20),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v21),(((java.lang.Boolean)v24).booleanValue()));
    Object v26 = true;
    Object v27 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v19),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v25),(((java.lang.Boolean)v26).booleanValue()));
    Object v28 = false;
    Object v29 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v13),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v27),(((java.lang.Boolean)v28).booleanValue()));
    Object v30 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v31 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v32 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v33 = ((com.google.javascript.rhino.jstype.BooleanLiteralSet)v31).intersection(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v32));
    Object v34 = false;
    Object v35 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v30),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v31),(((java.lang.Boolean)v34).booleanValue()));
    Object v36 = false;
    Object v37 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v29),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v35),(((java.lang.Boolean)v36).booleanValue()));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE), v37);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v2 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v3 = ((com.google.javascript.rhino.jstype.BooleanLiteralSet)v1).intersection(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v2));
    Object v4 = false;
    Object v5 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v0),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v1),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v7 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v8 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v9 = ((com.google.javascript.rhino.jstype.BooleanLiteralSet)v7).intersection(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v8));
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v6),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v7),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v13 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v14 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v15 = ((com.google.javascript.rhino.jstype.BooleanLiteralSet)v13).intersection(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v14));
    Object v16 = false;
    Object v17 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v12),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v13),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = true;
    Object v19 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v11),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v21 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v22 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v23 = ((com.google.javascript.rhino.jstype.BooleanLiteralSet)v21).intersection(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v22));
    Object v24 = false;
    Object v25 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v20),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v21),(((java.lang.Boolean)v24).booleanValue()));
    Object v26 = true;
    Object v27 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v19),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v25),(((java.lang.Boolean)v26).booleanValue()));
    Object v28 = true;
    Object v29 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v5),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v27),(((java.lang.Boolean)v28).booleanValue()));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE), v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.Compiler();
    Object v2 = true;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = true;
    Object v10 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = true;
    Object v12 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v11).booleanValue()));
    Object v13 = null;
    Object v14 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.jstype.ObjectType)v13));
    Object v15 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v14));
    Object v16 = false;
    Object v17 = ((com.google.javascript.jscomp.ReverseAbstractInterpreter)v8).getPreciserScopeKnowingConditionOutcome(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.FlowScope)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = true;
    Object v19 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v18).booleanValue()));
    Object v20 = null;
    Object v21 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v19),((com.google.javascript.rhino.jstype.ObjectType)v20));
    Object v22 = ((com.google.javascript.jscomp.Scope)v21).getVars();
    Object v23 = true;
    Object v24 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v23).booleanValue()));
    Object v25 = null;
    Object v26 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v24),((com.google.javascript.rhino.jstype.ObjectType)v25));
    Object v27 = true;
    Object v28 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v27).booleanValue()));
    Object v29 = null;
    Object v30 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v28),((com.google.javascript.rhino.jstype.ObjectType)v29));
    Object v31 = java.util.Map.of(((java.lang.Object)v26),((java.lang.Object)v30));
    Object v32 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v8),((com.google.javascript.jscomp.Scope)v21),((java.util.Map)v31));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v2 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v3 = ((com.google.javascript.rhino.jstype.BooleanLiteralSet)v1).intersection(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v2));
    Object v4 = false;
    Object v5 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v0),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v1),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v7 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v8 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v9 = ((com.google.javascript.rhino.jstype.BooleanLiteralSet)v7).intersection(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v8));
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v6),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v7),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = false;
    Object v13 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v5),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v15 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v16 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v17 = ((com.google.javascript.rhino.jstype.BooleanLiteralSet)v15).intersection(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v16));
    Object v18 = false;
    Object v19 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v14),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v15),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v21 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v22 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v23 = ((com.google.javascript.rhino.jstype.BooleanLiteralSet)v21).intersection(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v22));
    Object v24 = false;
    Object v25 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v20),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v21),(((java.lang.Boolean)v24).booleanValue()));
    Object v26 = false;
    Object v27 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v19),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v25),(((java.lang.Boolean)v26).booleanValue()));
    Object v28 = false;
    Object v29 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v13),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v27),(((java.lang.Boolean)v28).booleanValue()));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE), v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v2 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v3 = ((com.google.javascript.rhino.jstype.BooleanLiteralSet)v1).intersection(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v2));
    Object v4 = false;
    Object v5 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v0),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v1),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v7 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v8 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v9 = ((com.google.javascript.rhino.jstype.BooleanLiteralSet)v7).intersection(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v8));
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v6),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v7),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = true;
    Object v13 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v5),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v15 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v16 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v17 = ((com.google.javascript.rhino.jstype.BooleanLiteralSet)v15).intersection(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v16));
    Object v18 = false;
    Object v19 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v14),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v15),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = true;
    Object v21 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v13),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v23 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v24 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v25 = ((com.google.javascript.rhino.jstype.BooleanLiteralSet)v23).intersection(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v24));
    Object v26 = false;
    Object v27 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v22),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v23),(((java.lang.Boolean)v26).booleanValue()));
    Object v28 = false;
    Object v29 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v21),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v27),(((java.lang.Boolean)v28).booleanValue()));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE), v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v2 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v3 = ((com.google.javascript.rhino.jstype.BooleanLiteralSet)v1).intersection(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v2));
    Object v4 = false;
    Object v5 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v0),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v1),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v7 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v8 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v9 = ((com.google.javascript.rhino.jstype.BooleanLiteralSet)v7).intersection(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v8));
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v6),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v7),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = ((com.google.javascript.rhino.jstype.BooleanLiteralSet)v5).union(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v11));
    Object v13 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v14 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v15 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v16 = ((com.google.javascript.rhino.jstype.BooleanLiteralSet)v14).intersection(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v15));
    Object v17 = false;
    Object v18 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v13),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v14),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v20 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v21 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v22 = ((com.google.javascript.rhino.jstype.BooleanLiteralSet)v20).intersection(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v21));
    Object v23 = false;
    Object v24 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v19),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v20),(((java.lang.Boolean)v23).booleanValue()));
    Object v25 = true;
    Object v26 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v18),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v24),(((java.lang.Boolean)v25).booleanValue()));
    Object v27 = false;
    Object v28 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v5),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v26),(((java.lang.Boolean)v27).booleanValue()));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE), v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = -57;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = false;
    Object v7 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v9 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v9));
    Object v11 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v8),((com.google.javascript.rhino.jstype.JSTypeRegistry)v10));
    Object v12 = true;
    Object v13 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v12).booleanValue()));
    Object v14 = null;
    Object v15 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.jstype.ObjectType)v14));
    Object v16 = true;
    Object v17 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v16).booleanValue()));
    Object v18 = null;
    Object v19 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v17),((com.google.javascript.rhino.jstype.ObjectType)v18));
    Object v20 = true;
    Object v21 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v20).booleanValue()));
    Object v22 = null;
    Object v23 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v21),((com.google.javascript.rhino.jstype.ObjectType)v22));
    Object v24 = java.util.Map.of(((java.lang.Object)v19),((java.lang.Object)v23));
    Object v25 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ControlFlowGraph)v7),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v11),((com.google.javascript.jscomp.Scope)v15),((java.util.Map)v24));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v2 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v3 = ((com.google.javascript.rhino.jstype.BooleanLiteralSet)v1).intersection(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v2));
    Object v4 = false;
    Object v5 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v0),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v1),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v7 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v8 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v9 = ((com.google.javascript.rhino.jstype.BooleanLiteralSet)v7).intersection(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v8));
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v6),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v7),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v13 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v14 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v15 = ((com.google.javascript.rhino.jstype.BooleanLiteralSet)v13).intersection(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v14));
    Object v16 = false;
    Object v17 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v12),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v13),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = false;
    Object v19 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v11),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v21 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v22 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v23 = ((com.google.javascript.rhino.jstype.BooleanLiteralSet)v21).intersection(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v22));
    Object v24 = false;
    Object v25 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v20),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v21),(((java.lang.Boolean)v24).booleanValue()));
    Object v26 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v27 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v28 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v29 = ((com.google.javascript.rhino.jstype.BooleanLiteralSet)v27).intersection(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v28));
    Object v30 = false;
    Object v31 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v26),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v27),(((java.lang.Boolean)v30).booleanValue()));
    Object v32 = false;
    Object v33 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v25),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v31),(((java.lang.Boolean)v32).booleanValue()));
    Object v34 = false;
    Object v35 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v19),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v33),(((java.lang.Boolean)v34).booleanValue()));
    Object v36 = false;
    Object v37 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v5),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v35),(((java.lang.Boolean)v36).booleanValue()));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE), v37);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.Compiler();
    Object v2 = true;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = true;
    Object v10 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = null;
    Object v12 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.ObjectType)v11));
    Object v13 = true;
    Object v14 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v13).booleanValue()));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.jstype.ObjectType)v15));
    Object v17 = true;
    Object v18 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v17).booleanValue()));
    Object v19 = null;
    Object v20 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v18),((com.google.javascript.rhino.jstype.ObjectType)v19));
    Object v21 = java.util.Map.of(((java.lang.Object)v16),((java.lang.Object)v20));
    Object v22 = "";
    Object v23 = "*";
    Object v24 = com.google.javascript.jscomp.DiagnosticType.error(((java.lang.String)v22),((java.lang.String)v23));
    Object v25 = ((java.util.Map)v21).containsValue(((java.lang.Object)v24));
    Object v26 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v8),((com.google.javascript.jscomp.Scope)v12),((java.util.Map)v21));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.Compiler();
    Object v2 = true;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = true;
    Object v10 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = null;
    Object v12 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.ObjectType)v11));
    Object v13 = true;
    Object v14 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v13).booleanValue()));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.jstype.ObjectType)v15));
    Object v17 = true;
    Object v18 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v17).booleanValue()));
    Object v19 = null;
    Object v20 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v18),((com.google.javascript.rhino.jstype.ObjectType)v19));
    Object v21 = java.util.Map.of(((java.lang.Object)v16),((java.lang.Object)v20));
    Object v22 = ((java.util.Map)v21).isEmpty();
    Object v23 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v8),((com.google.javascript.jscomp.Scope)v12),((java.util.Map)v21));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.Compiler();
    Object v2 = true;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    ((com.google.javascript.jscomp.graph.Graph)v4).pushNodeAnnotations();
    Object v5 = null;
    Object v6 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v7 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7));
    Object v9 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v6),((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = true;
    Object v11 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v10).booleanValue()));
    Object v12 = null;
    Object v13 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.jstype.ObjectType)v12));
    Object v14 = true;
    Object v15 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v14).booleanValue()));
    Object v16 = null;
    Object v17 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v15),((com.google.javascript.rhino.jstype.ObjectType)v16));
    Object v18 = true;
    Object v19 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v18).booleanValue()));
    Object v20 = null;
    Object v21 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v19),((com.google.javascript.rhino.jstype.ObjectType)v20));
    Object v22 = java.util.Map.of(((java.lang.Object)v17),((java.lang.Object)v21));
    Object v23 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v9),((com.google.javascript.jscomp.Scope)v13),((java.util.Map)v22));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = null;
    Object v6 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.jstype.ObjectType)v5));
    Object v7 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v6));
    Object v8 = ((com.google.javascript.jscomp.TypeInference)v0).flowThrough(((com.google.javascript.rhino.Node)v2),((com.google.javascript.jscomp.FlowScope)v7));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.Compiler();
    Object v2 = true;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = true;
    Object v10 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = null;
    Object v12 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.ObjectType)v11));
    Object v13 = true;
    Object v14 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v13).booleanValue()));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.jstype.ObjectType)v15));
    Object v17 = true;
    Object v18 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v17).booleanValue()));
    Object v19 = null;
    Object v20 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v18),((com.google.javascript.rhino.jstype.ObjectType)v19));
    Object v21 = java.util.Map.of(((java.lang.Object)v16),((java.lang.Object)v20));
    Object v22 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v23 = ((java.util.Map)v21).containsValue(((java.lang.Object)v22));
    Object v24 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v8),((com.google.javascript.jscomp.Scope)v12),((java.util.Map)v21));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = true;
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v7 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7));
    Object v9 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v6),((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = true;
    Object v11 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v10).booleanValue()));
    Object v12 = null;
    Object v13 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.jstype.ObjectType)v12));
    Object v14 = true;
    Object v15 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v14).booleanValue()));
    Object v16 = null;
    Object v17 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v15),((com.google.javascript.rhino.jstype.ObjectType)v16));
    Object v18 = true;
    Object v19 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v18).booleanValue()));
    Object v20 = null;
    Object v21 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v19),((com.google.javascript.rhino.jstype.ObjectType)v20));
    Object v22 = java.util.Map.of(((java.lang.Object)v17),((java.lang.Object)v21));
    Object v23 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ControlFlowGraph)v5),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v9),((com.google.javascript.jscomp.Scope)v13),((java.util.Map)v22));
    org.junit.Assert.assertNotNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = true;
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v7 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7));
    Object v9 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v6),((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = true;
    Object v11 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v10).booleanValue()));
    Object v12 = null;
    Object v13 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.jstype.ObjectType)v12));
    Object v14 = true;
    Object v15 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v14).booleanValue()));
    Object v16 = null;
    Object v17 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v15),((com.google.javascript.rhino.jstype.ObjectType)v16));
    Object v18 = true;
    Object v19 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v18).booleanValue()));
    Object v20 = null;
    Object v21 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v19),((com.google.javascript.rhino.jstype.ObjectType)v20));
    Object v22 = java.util.Map.of(((java.lang.Object)v17),((java.lang.Object)v21));
    Object v23 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ControlFlowGraph)v5),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v9),((com.google.javascript.jscomp.Scope)v13),((java.util.Map)v22));
    Object v24 = true;
    Object v25 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v24).booleanValue()));
    Object v26 = true;
    Object v27 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v26).booleanValue()));
    Object v28 = null;
    Object v29 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v27),((com.google.javascript.rhino.jstype.ObjectType)v28));
    Object v30 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v29));
    Object v31 = ((com.google.javascript.jscomp.TypeInference)v23).branchedFlowThrough(((com.google.javascript.rhino.Node)v25),((com.google.javascript.jscomp.FlowScope)v30));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = true;
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v7 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7));
    Object v9 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v6),((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = true;
    Object v11 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v10).booleanValue()));
    Object v12 = null;
    Object v13 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.jstype.ObjectType)v12));
    Object v14 = true;
    Object v15 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v14).booleanValue()));
    Object v16 = null;
    Object v17 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v15),((com.google.javascript.rhino.jstype.ObjectType)v16));
    Object v18 = true;
    Object v19 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v18).booleanValue()));
    Object v20 = null;
    Object v21 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v19),((com.google.javascript.rhino.jstype.ObjectType)v20));
    Object v22 = java.util.Map.of(((java.lang.Object)v17),((java.lang.Object)v21));
    Object v23 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ControlFlowGraph)v5),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v9),((com.google.javascript.jscomp.Scope)v13),((java.util.Map)v22));
    Object v24 = true;
    Object v25 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v24).booleanValue()));
    Object v26 = true;
    Object v27 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v26).booleanValue()));
    Object v28 = ((com.google.javascript.rhino.Node)v25).useSourceInfoFromForTree(((com.google.javascript.rhino.Node)v27));
    Object v29 = true;
    Object v30 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v29).booleanValue()));
    Object v31 = null;
    Object v32 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v30),((com.google.javascript.rhino.jstype.ObjectType)v31));
    Object v33 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v32));
    Object v34 = ((com.google.javascript.jscomp.TypeInference)v23).branchedFlowThrough(((com.google.javascript.rhino.Node)v25),((com.google.javascript.jscomp.FlowScope)v33));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = true;
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v7 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7));
    Object v9 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v6),((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = true;
    Object v11 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v10).booleanValue()));
    Object v12 = null;
    Object v13 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.jstype.ObjectType)v12));
    Object v14 = true;
    Object v15 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v14).booleanValue()));
    Object v16 = null;
    Object v17 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v15),((com.google.javascript.rhino.jstype.ObjectType)v16));
    Object v18 = true;
    Object v19 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v18).booleanValue()));
    Object v20 = null;
    Object v21 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v19),((com.google.javascript.rhino.jstype.ObjectType)v20));
    Object v22 = java.util.Map.of(((java.lang.Object)v17),((java.lang.Object)v21));
    Object v23 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ControlFlowGraph)v5),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v9),((com.google.javascript.jscomp.Scope)v13),((java.util.Map)v22));
    Object v24 = true;
    Object v25 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v24).booleanValue()));
    Object v26 = true;
    Object v27 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v26).booleanValue()));
    Object v28 = null;
    Object v29 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v27),((com.google.javascript.rhino.jstype.ObjectType)v28));
    Object v30 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v29));
    Object v31 = ((com.google.javascript.jscomp.TypeInference)v23).flowThrough(((com.google.javascript.rhino.Node)v25),((com.google.javascript.jscomp.FlowScope)v30));
    org.junit.Assert.assertNotNull(v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v2 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v3 = ((com.google.javascript.rhino.jstype.BooleanLiteralSet)v1).intersection(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v2));
    Object v4 = false;
    Object v5 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v0),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v1),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v7 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v8 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v9 = ((com.google.javascript.rhino.jstype.BooleanLiteralSet)v7).intersection(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v8));
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v6),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v7),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v13 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v14 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v15 = ((com.google.javascript.rhino.jstype.BooleanLiteralSet)v13).intersection(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v14));
    Object v16 = false;
    Object v17 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v12),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v13),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v19 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v20 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v21 = ((com.google.javascript.rhino.jstype.BooleanLiteralSet)v19).intersection(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v20));
    Object v22 = false;
    Object v23 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v18),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v19),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = true;
    Object v25 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v17),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v23),(((java.lang.Boolean)v24).booleanValue()));
    Object v26 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v27 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v28 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v29 = ((com.google.javascript.rhino.jstype.BooleanLiteralSet)v27).intersection(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v28));
    Object v30 = false;
    Object v31 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v26),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v27),(((java.lang.Boolean)v30).booleanValue()));
    Object v32 = true;
    Object v33 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v25),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v31),(((java.lang.Boolean)v32).booleanValue()));
    Object v34 = true;
    Object v35 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v11),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v33),(((java.lang.Boolean)v34).booleanValue()));
    Object v36 = ((java.lang.Enum)v35).hashCode();
    Object v37 = false;
    Object v38 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v5),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v35),(((java.lang.Boolean)v37).booleanValue()));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE), v38);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.Compiler();
    Object v2 = true;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = true;
    Object v10 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = true;
    Object v12 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v11).booleanValue()));
    Object v13 = null;
    Object v14 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.jstype.ObjectType)v13));
    Object v15 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v14));
    Object v16 = true;
    Object v17 = ((com.google.javascript.jscomp.ReverseAbstractInterpreter)v8).getPreciserScopeKnowingConditionOutcome(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.FlowScope)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = true;
    Object v19 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v18).booleanValue()));
    Object v20 = null;
    Object v21 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v19),((com.google.javascript.rhino.jstype.ObjectType)v20));
    Object v22 = true;
    Object v23 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v22).booleanValue()));
    Object v24 = null;
    Object v25 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v23),((com.google.javascript.rhino.jstype.ObjectType)v24));
    Object v26 = true;
    Object v27 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v26).booleanValue()));
    Object v28 = null;
    Object v29 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v27),((com.google.javascript.rhino.jstype.ObjectType)v28));
    Object v30 = java.util.Map.of(((java.lang.Object)v25),((java.lang.Object)v29));
    Object v31 = ((java.util.Map)v30).entrySet();
    Object v32 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v8),((com.google.javascript.jscomp.Scope)v21),((java.util.Map)v30));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getProgress();
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = true;
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v7 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7));
    Object v9 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v6),((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = true;
    Object v11 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v10).booleanValue()));
    Object v12 = null;
    Object v13 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.jstype.ObjectType)v12));
    Object v14 = true;
    Object v15 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v14).booleanValue()));
    Object v16 = null;
    Object v17 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v15),((com.google.javascript.rhino.jstype.ObjectType)v16));
    Object v18 = true;
    Object v19 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v18).booleanValue()));
    Object v20 = null;
    Object v21 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v19),((com.google.javascript.rhino.jstype.ObjectType)v20));
    Object v22 = java.util.Map.of(((java.lang.Object)v17),((java.lang.Object)v21));
    Object v23 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ControlFlowGraph)v5),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v9),((com.google.javascript.jscomp.Scope)v13),((java.util.Map)v22));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v2 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v3 = ((com.google.javascript.rhino.jstype.BooleanLiteralSet)v1).intersection(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v2));
    Object v4 = false;
    Object v5 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v0),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v1),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v7 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v8 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v9 = ((com.google.javascript.rhino.jstype.BooleanLiteralSet)v7).intersection(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v8));
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v6),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v7),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = true;
    Object v13 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v5),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v15 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v16 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v17 = ((com.google.javascript.rhino.jstype.BooleanLiteralSet)v15).intersection(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v16));
    Object v18 = false;
    Object v19 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v14),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v15),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v21 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v22 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v23 = ((com.google.javascript.rhino.jstype.BooleanLiteralSet)v21).intersection(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v22));
    Object v24 = false;
    Object v25 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v20),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v21),(((java.lang.Boolean)v24).booleanValue()));
    Object v26 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v27 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v28 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v29 = ((com.google.javascript.rhino.jstype.BooleanLiteralSet)v27).intersection(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v28));
    Object v30 = false;
    Object v31 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v26),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v27),(((java.lang.Boolean)v30).booleanValue()));
    Object v32 = true;
    Object v33 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v25),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v31),(((java.lang.Boolean)v32).booleanValue()));
    Object v34 = true;
    Object v35 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v19),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v33),(((java.lang.Boolean)v34).booleanValue()));
    Object v36 = false;
    Object v37 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v13),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v35),(((java.lang.Boolean)v36).booleanValue()));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE), v37);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.Compiler();
    Object v2 = true;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = true;
    Object v10 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = null;
    Object v12 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.ObjectType)v11));
    Object v13 = true;
    Object v14 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v13).booleanValue()));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.jstype.ObjectType)v15));
    Object v17 = new com.google.javascript.jscomp.Scope.Arguments(((com.google.javascript.jscomp.Scope)v16));
    Object v18 = ((com.google.javascript.jscomp.Scope)v12).getReferences(((com.google.javascript.jscomp.Scope.Var)v17));
    Object v19 = true;
    Object v20 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v19).booleanValue()));
    Object v21 = null;
    Object v22 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.jstype.ObjectType)v21));
    Object v23 = true;
    Object v24 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v23).booleanValue()));
    Object v25 = null;
    Object v26 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v24),((com.google.javascript.rhino.jstype.ObjectType)v25));
    Object v27 = java.util.Map.of(((java.lang.Object)v22),((java.lang.Object)v26));
    Object v28 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v8),((com.google.javascript.jscomp.Scope)v12),((java.util.Map)v27));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = true;
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v7 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7));
    Object v9 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v6),((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = true;
    Object v11 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v10).booleanValue()));
    Object v12 = null;
    Object v13 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.jstype.ObjectType)v12));
    Object v14 = true;
    Object v15 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v14).booleanValue()));
    Object v16 = null;
    Object v17 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v15),((com.google.javascript.rhino.jstype.ObjectType)v16));
    Object v18 = true;
    Object v19 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v18).booleanValue()));
    Object v20 = null;
    Object v21 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v19),((com.google.javascript.rhino.jstype.ObjectType)v20));
    Object v22 = java.util.Map.of(((java.lang.Object)v17),((java.lang.Object)v21));
    Object v23 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ControlFlowGraph)v5),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v9),((com.google.javascript.jscomp.Scope)v13),((java.util.Map)v22));
    Object v24 = true;
    Object v25 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v24).booleanValue()));
    Object v26 = ((com.google.javascript.rhino.Node)v25).isOnlyModifiesThisCall();
    Object v27 = true;
    Object v28 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v27).booleanValue()));
    Object v29 = null;
    Object v30 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v28),((com.google.javascript.rhino.jstype.ObjectType)v29));
    Object v31 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v30));
    Object v32 = ((com.google.javascript.jscomp.TypeInference)v23).flowThrough(((com.google.javascript.rhino.Node)v25),((com.google.javascript.jscomp.FlowScope)v31));
    org.junit.Assert.assertNotNull(v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = true;
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v7 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7));
    Object v9 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v6),((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = true;
    Object v11 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v10).booleanValue()));
    Object v12 = null;
    Object v13 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.jstype.ObjectType)v12));
    Object v14 = true;
    Object v15 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v14).booleanValue()));
    Object v16 = null;
    Object v17 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v15),((com.google.javascript.rhino.jstype.ObjectType)v16));
    Object v18 = true;
    Object v19 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v18).booleanValue()));
    Object v20 = null;
    Object v21 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v19),((com.google.javascript.rhino.jstype.ObjectType)v20));
    Object v22 = java.util.Map.of(((java.lang.Object)v17),((java.lang.Object)v21));
    Object v23 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ControlFlowGraph)v5),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v9),((com.google.javascript.jscomp.Scope)v13),((java.util.Map)v22));
    Object v24 = true;
    Object v25 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v24).booleanValue()));
    Object v26 = true;
    Object v27 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v26).booleanValue()));
    Object v28 = null;
    Object v29 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v27),((com.google.javascript.rhino.jstype.ObjectType)v28));
    Object v30 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v29));
    Object v31 = ((com.google.javascript.jscomp.FlowScope)v30).createChildFlowScope();
    Object v32 = ((com.google.javascript.jscomp.TypeInference)v23).branchedFlowThrough(((com.google.javascript.rhino.Node)v25),((com.google.javascript.jscomp.FlowScope)v30));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.Compiler();
    Object v2 = true;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((com.google.javascript.jscomp.graph.LinkedDirectedGraph)v4).getGraphvizNodes();
    Object v6 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v7 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7));
    Object v9 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v6),((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = true;
    Object v11 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v10).booleanValue()));
    Object v12 = null;
    Object v13 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.jstype.ObjectType)v12));
    Object v14 = true;
    Object v15 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v14).booleanValue()));
    Object v16 = null;
    Object v17 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v15),((com.google.javascript.rhino.jstype.ObjectType)v16));
    Object v18 = true;
    Object v19 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v18).booleanValue()));
    Object v20 = null;
    Object v21 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v19),((com.google.javascript.rhino.jstype.ObjectType)v20));
    Object v22 = java.util.Map.of(((java.lang.Object)v17),((java.lang.Object)v21));
    Object v23 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v9),((com.google.javascript.jscomp.Scope)v13),((java.util.Map)v22));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = true;
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v7 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7));
    Object v9 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v6),((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = true;
    Object v11 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v10).booleanValue()));
    Object v12 = null;
    Object v13 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.jstype.ObjectType)v12));
    Object v14 = true;
    Object v15 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v14).booleanValue()));
    Object v16 = null;
    Object v17 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v15),((com.google.javascript.rhino.jstype.ObjectType)v16));
    Object v18 = true;
    Object v19 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v18).booleanValue()));
    Object v20 = null;
    Object v21 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v19),((com.google.javascript.rhino.jstype.ObjectType)v20));
    Object v22 = java.util.Map.of(((java.lang.Object)v17),((java.lang.Object)v21));
    Object v23 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ControlFlowGraph)v5),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v9),((com.google.javascript.jscomp.Scope)v13),((java.util.Map)v22));
    Object v24 = ((com.google.javascript.jscomp.TypeInference)v23).createInitialEstimateLattice();
    org.junit.Assert.assertNotNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.Compiler();
    Object v2 = true;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = true;
    Object v10 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = null;
    Object v12 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.ObjectType)v11));
    Object v13 = ((com.google.javascript.jscomp.Scope)v12).getVarCount();
    Object v14 = true;
    Object v15 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v14).booleanValue()));
    Object v16 = null;
    Object v17 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v15),((com.google.javascript.rhino.jstype.ObjectType)v16));
    Object v18 = true;
    Object v19 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v18).booleanValue()));
    Object v20 = null;
    Object v21 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v19),((com.google.javascript.rhino.jstype.ObjectType)v20));
    Object v22 = java.util.Map.of(((java.lang.Object)v17),((java.lang.Object)v21));
    Object v23 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v8),((com.google.javascript.jscomp.Scope)v12),((java.util.Map)v22));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = true;
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v7 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7));
    Object v9 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v6),((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = true;
    Object v11 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v10).booleanValue()));
    Object v12 = null;
    Object v13 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.jstype.ObjectType)v12));
    Object v14 = true;
    Object v15 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v14).booleanValue()));
    Object v16 = null;
    Object v17 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v15),((com.google.javascript.rhino.jstype.ObjectType)v16));
    Object v18 = true;
    Object v19 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v18).booleanValue()));
    Object v20 = null;
    Object v21 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v19),((com.google.javascript.rhino.jstype.ObjectType)v20));
    Object v22 = java.util.Map.of(((java.lang.Object)v17),((java.lang.Object)v21));
    Object v23 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ControlFlowGraph)v5),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v9),((com.google.javascript.jscomp.Scope)v13),((java.util.Map)v22));
    Object v24 = true;
    Object v25 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v24).booleanValue()));
    Object v26 = true;
    Object v27 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v26).booleanValue()));
    Object v28 = null;
    Object v29 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v27),((com.google.javascript.rhino.jstype.ObjectType)v28));
    Object v30 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v29));
    Object v31 = ((com.google.javascript.jscomp.FlowScope)v30).optimize();
    Object v32 = ((com.google.javascript.jscomp.TypeInference)v23).branchedFlowThrough(((com.google.javascript.rhino.Node)v25),((com.google.javascript.jscomp.FlowScope)v30));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.Compiler();
    Object v2 = true;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = true;
    Object v10 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = null;
    Object v12 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.ObjectType)v11));
    Object v13 = ((com.google.javascript.jscomp.Scope)v12).getVars();
    Object v14 = true;
    Object v15 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v14).booleanValue()));
    Object v16 = null;
    Object v17 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v15),((com.google.javascript.rhino.jstype.ObjectType)v16));
    Object v18 = true;
    Object v19 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v18).booleanValue()));
    Object v20 = null;
    Object v21 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v19),((com.google.javascript.rhino.jstype.ObjectType)v20));
    Object v22 = java.util.Map.of(((java.lang.Object)v17),((java.lang.Object)v21));
    Object v23 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v8),((com.google.javascript.jscomp.Scope)v12),((java.util.Map)v22));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = true;
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v7 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7));
    Object v9 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v6),((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = true;
    Object v11 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v10).booleanValue()));
    Object v12 = null;
    Object v13 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.jstype.ObjectType)v12));
    Object v14 = true;
    Object v15 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v14).booleanValue()));
    Object v16 = null;
    Object v17 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v15),((com.google.javascript.rhino.jstype.ObjectType)v16));
    Object v18 = true;
    Object v19 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v18).booleanValue()));
    Object v20 = null;
    Object v21 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v19),((com.google.javascript.rhino.jstype.ObjectType)v20));
    Object v22 = java.util.Map.of(((java.lang.Object)v17),((java.lang.Object)v21));
    Object v23 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ControlFlowGraph)v5),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v9),((com.google.javascript.jscomp.Scope)v13),((java.util.Map)v22));
    Object v24 = true;
    Object v25 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v24).booleanValue()));
    Object v26 = ((com.google.javascript.rhino.Node)v25).getJsDocBuilderForNode();
    Object v27 = true;
    Object v28 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v27).booleanValue()));
    Object v29 = null;
    Object v30 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v28),((com.google.javascript.rhino.jstype.ObjectType)v29));
    Object v31 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v30));
    Object v32 = ((com.google.javascript.jscomp.TypeInference)v23).flowThrough(((com.google.javascript.rhino.Node)v25),((com.google.javascript.jscomp.FlowScope)v31));
    org.junit.Assert.assertNotNull(v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v2 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v3 = ((com.google.javascript.rhino.jstype.BooleanLiteralSet)v1).intersection(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v2));
    Object v4 = false;
    Object v5 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v0),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v1),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v7 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v8 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v9 = ((com.google.javascript.rhino.jstype.BooleanLiteralSet)v7).intersection(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v8));
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v6),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v7),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v13 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v14 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v15 = ((com.google.javascript.rhino.jstype.BooleanLiteralSet)v13).intersection(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v14));
    Object v16 = false;
    Object v17 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v12),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v13),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v19 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v20 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v21 = ((com.google.javascript.rhino.jstype.BooleanLiteralSet)v19).intersection(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v20));
    Object v22 = false;
    Object v23 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v18),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v19),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = true;
    Object v25 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v17),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v23),(((java.lang.Boolean)v24).booleanValue()));
    Object v26 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v27 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v28 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v29 = ((com.google.javascript.rhino.jstype.BooleanLiteralSet)v27).intersection(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v28));
    Object v30 = false;
    Object v31 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v26),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v27),(((java.lang.Boolean)v30).booleanValue()));
    Object v32 = true;
    Object v33 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v25),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v31),(((java.lang.Boolean)v32).booleanValue()));
    Object v34 = true;
    Object v35 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v11),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v33),(((java.lang.Boolean)v34).booleanValue()));
    Object v36 = true;
    Object v37 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v5),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v35),(((java.lang.Boolean)v36).booleanValue()));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE), v37);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.Compiler();
    Object v2 = true;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    ((com.google.javascript.jscomp.graph.Graph)v4).clearEdgeAnnotations();
    Object v5 = null;
    Object v6 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v7 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7));
    Object v9 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v6),((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = true;
    Object v11 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v10).booleanValue()));
    Object v12 = null;
    Object v13 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.jstype.ObjectType)v12));
    Object v14 = true;
    Object v15 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v14).booleanValue()));
    Object v16 = null;
    Object v17 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v15),((com.google.javascript.rhino.jstype.ObjectType)v16));
    Object v18 = true;
    Object v19 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v18).booleanValue()));
    Object v20 = null;
    Object v21 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v19),((com.google.javascript.rhino.jstype.ObjectType)v20));
    Object v22 = java.util.Map.of(((java.lang.Object)v17),((java.lang.Object)v21));
    Object v23 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v9),((com.google.javascript.jscomp.Scope)v13),((java.util.Map)v22));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.Compiler();
    Object v2 = true;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = true;
    Object v10 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = null;
    Object v12 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.ObjectType)v11));
    Object v13 = true;
    Object v14 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v13).booleanValue()));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.jstype.ObjectType)v15));
    Object v17 = true;
    Object v18 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v17).booleanValue()));
    Object v19 = null;
    Object v20 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v18),((com.google.javascript.rhino.jstype.ObjectType)v19));
    Object v21 = java.util.Map.of(((java.lang.Object)v16),((java.lang.Object)v20));
    Object v22 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v23 = ((java.util.Map)v21).equals(((java.lang.Object)v22));
    Object v24 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v8),((com.google.javascript.jscomp.Scope)v12),((java.util.Map)v21));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = true;
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v7 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7));
    Object v9 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v6),((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = true;
    Object v11 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v10).booleanValue()));
    Object v12 = null;
    Object v13 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.jstype.ObjectType)v12));
    Object v14 = true;
    Object v15 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v14).booleanValue()));
    Object v16 = null;
    Object v17 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v15),((com.google.javascript.rhino.jstype.ObjectType)v16));
    Object v18 = true;
    Object v19 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v18).booleanValue()));
    Object v20 = null;
    Object v21 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v19),((com.google.javascript.rhino.jstype.ObjectType)v20));
    Object v22 = java.util.Map.of(((java.lang.Object)v17),((java.lang.Object)v21));
    Object v23 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ControlFlowGraph)v5),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v9),((com.google.javascript.jscomp.Scope)v13),((java.util.Map)v22));
    Object v24 = true;
    Object v25 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v24).booleanValue()));
    Object v26 = ((com.google.javascript.rhino.Node)v25).getInputId();
    Object v27 = true;
    Object v28 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v27).booleanValue()));
    Object v29 = null;
    Object v30 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v28),((com.google.javascript.rhino.jstype.ObjectType)v29));
    Object v31 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v30));
    Object v32 = ((com.google.javascript.jscomp.TypeInference)v23).flowThrough(((com.google.javascript.rhino.Node)v25),((com.google.javascript.jscomp.FlowScope)v31));
    org.junit.Assert.assertNotNull(v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.Compiler();
    Object v2 = true;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = true;
    Object v10 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = true;
    Object v12 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v11).booleanValue()));
    Object v13 = null;
    Object v14 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.jstype.ObjectType)v13));
    Object v15 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v14));
    Object v16 = true;
    Object v17 = ((com.google.javascript.jscomp.ReverseAbstractInterpreter)v8).getPreciserScopeKnowingConditionOutcome(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.FlowScope)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = true;
    Object v19 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v18).booleanValue()));
    Object v20 = null;
    Object v21 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v19),((com.google.javascript.rhino.jstype.ObjectType)v20));
    Object v22 = ((com.google.javascript.jscomp.Scope)v21).getArgumentsVar();
    Object v23 = true;
    Object v24 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v23).booleanValue()));
    Object v25 = null;
    Object v26 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v24),((com.google.javascript.rhino.jstype.ObjectType)v25));
    Object v27 = true;
    Object v28 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v27).booleanValue()));
    Object v29 = null;
    Object v30 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v28),((com.google.javascript.rhino.jstype.ObjectType)v29));
    Object v31 = java.util.Map.of(((java.lang.Object)v26),((java.lang.Object)v30));
    Object v32 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v8),((com.google.javascript.jscomp.Scope)v21),((java.util.Map)v31));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = true;
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v7 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7));
    Object v9 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v6),((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = true;
    Object v11 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v10).booleanValue()));
    Object v12 = null;
    Object v13 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.jstype.ObjectType)v12));
    Object v14 = true;
    Object v15 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v14).booleanValue()));
    Object v16 = null;
    Object v17 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v15),((com.google.javascript.rhino.jstype.ObjectType)v16));
    Object v18 = true;
    Object v19 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v18).booleanValue()));
    Object v20 = null;
    Object v21 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v19),((com.google.javascript.rhino.jstype.ObjectType)v20));
    Object v22 = java.util.Map.of(((java.lang.Object)v17),((java.lang.Object)v21));
    Object v23 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ControlFlowGraph)v5),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v9),((com.google.javascript.jscomp.Scope)v13),((java.util.Map)v22));
    Object v24 = true;
    Object v25 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v24).booleanValue()));
    Object v26 = 30;
    Object v27 = ((com.google.javascript.rhino.Node)v25).getIntProp((((java.lang.Integer)v26).intValue()));
    Object v28 = true;
    Object v29 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v28).booleanValue()));
    Object v30 = null;
    Object v31 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v29),((com.google.javascript.rhino.jstype.ObjectType)v30));
    Object v32 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v31));
    Object v33 = "T";
    Object v34 = ((com.google.javascript.rhino.jstype.StaticScope)v32).getSlot(((java.lang.String)v33));
    Object v35 = ((com.google.javascript.jscomp.TypeInference)v23).branchedFlowThrough(((com.google.javascript.rhino.Node)v25),((com.google.javascript.jscomp.FlowScope)v32));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = true;
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v7 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7));
    Object v9 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v6),((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = true;
    Object v11 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v10).booleanValue()));
    Object v12 = null;
    Object v13 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.jstype.ObjectType)v12));
    Object v14 = true;
    Object v15 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v14).booleanValue()));
    Object v16 = null;
    Object v17 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v15),((com.google.javascript.rhino.jstype.ObjectType)v16));
    Object v18 = true;
    Object v19 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v18).booleanValue()));
    Object v20 = null;
    Object v21 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v19),((com.google.javascript.rhino.jstype.ObjectType)v20));
    Object v22 = java.util.Map.of(((java.lang.Object)v17),((java.lang.Object)v21));
    Object v23 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ControlFlowGraph)v5),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v9),((com.google.javascript.jscomp.Scope)v13),((java.util.Map)v22));
    Object v24 = true;
    Object v25 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v24).booleanValue()));
    Object v26 = true;
    Object v27 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v26).booleanValue()));
    Object v28 = ((com.google.javascript.rhino.Node)v25).checkTreeEquals(((com.google.javascript.rhino.Node)v27));
    Object v29 = true;
    Object v30 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v29).booleanValue()));
    Object v31 = null;
    Object v32 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v30),((com.google.javascript.rhino.jstype.ObjectType)v31));
    Object v33 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v32));
    Object v34 = ((com.google.javascript.jscomp.TypeInference)v23).branchedFlowThrough(((com.google.javascript.rhino.Node)v25),((com.google.javascript.jscomp.FlowScope)v33));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = true;
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v7 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7));
    Object v9 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v6),((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = true;
    Object v11 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v10).booleanValue()));
    Object v12 = null;
    Object v13 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.jstype.ObjectType)v12));
    Object v14 = true;
    Object v15 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v14).booleanValue()));
    Object v16 = null;
    Object v17 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v15),((com.google.javascript.rhino.jstype.ObjectType)v16));
    Object v18 = true;
    Object v19 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v18).booleanValue()));
    Object v20 = null;
    Object v21 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v19),((com.google.javascript.rhino.jstype.ObjectType)v20));
    Object v22 = java.util.Map.of(((java.lang.Object)v17),((java.lang.Object)v21));
    Object v23 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ControlFlowGraph)v5),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v9),((com.google.javascript.jscomp.Scope)v13),((java.util.Map)v22));
    Object v24 = true;
    Object v25 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v24).booleanValue()));
    Object v26 = ((com.google.javascript.rhino.Node)v25).getSideEffectFlags();
    Object v27 = true;
    Object v28 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v27).booleanValue()));
    Object v29 = null;
    Object v30 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v28),((com.google.javascript.rhino.jstype.ObjectType)v29));
    Object v31 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v30));
    Object v32 = "";
    Object v33 = ((com.google.javascript.rhino.jstype.StaticScope)v31).getSlot(((java.lang.String)v32));
    Object v34 = ((com.google.javascript.jscomp.TypeInference)v23).flowThrough(((com.google.javascript.rhino.Node)v25),((com.google.javascript.jscomp.FlowScope)v31));
    org.junit.Assert.assertNotNull(v34);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.Compiler();
    Object v2 = true;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = true;
    Object v10 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = null;
    Object v12 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.ObjectType)v11));
    Object v13 = true;
    Object v14 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v13).booleanValue()));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.jstype.ObjectType)v15));
    Object v17 = true;
    Object v18 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v17).booleanValue()));
    Object v19 = null;
    Object v20 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v18),((com.google.javascript.rhino.jstype.ObjectType)v19));
    Object v21 = java.util.Map.of(((java.lang.Object)v16),((java.lang.Object)v20));
    Object v22 = ((java.util.Map)v21).keySet();
    Object v23 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v8),((com.google.javascript.jscomp.Scope)v12),((java.util.Map)v21));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = true;
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v7 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7));
    Object v9 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v6),((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = true;
    Object v11 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v10).booleanValue()));
    Object v12 = null;
    Object v13 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.jstype.ObjectType)v12));
    Object v14 = true;
    Object v15 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v14).booleanValue()));
    Object v16 = null;
    Object v17 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v15),((com.google.javascript.rhino.jstype.ObjectType)v16));
    Object v18 = true;
    Object v19 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v18).booleanValue()));
    Object v20 = null;
    Object v21 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v19),((com.google.javascript.rhino.jstype.ObjectType)v20));
    Object v22 = java.util.Map.of(((java.lang.Object)v17),((java.lang.Object)v21));
    Object v23 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ControlFlowGraph)v5),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v9),((com.google.javascript.jscomp.Scope)v13),((java.util.Map)v22));
    Object v24 = true;
    Object v25 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v24).booleanValue()));
    Object v26 = true;
    Object v27 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v26).booleanValue()));
    Object v28 = null;
    Object v29 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v27),((com.google.javascript.rhino.jstype.ObjectType)v28));
    Object v30 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v29));
    Object v31 = ((com.google.javascript.rhino.jstype.StaticScope)v30).getParentScope();
    Object v32 = ((com.google.javascript.jscomp.TypeInference)v23).flowThrough(((com.google.javascript.rhino.Node)v25),((com.google.javascript.jscomp.FlowScope)v30));
    org.junit.Assert.assertNotNull(v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "?";
    Object v2 = -15;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = false;
    Object v7 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v9 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v9));
    Object v11 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v8),((com.google.javascript.rhino.jstype.JSTypeRegistry)v10));
    Object v12 = true;
    Object v13 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v12).booleanValue()));
    Object v14 = null;
    Object v15 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.jstype.ObjectType)v14));
    Object v16 = true;
    Object v17 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v16).booleanValue()));
    Object v18 = null;
    Object v19 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v17),((com.google.javascript.rhino.jstype.ObjectType)v18));
    Object v20 = true;
    Object v21 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v20).booleanValue()));
    Object v22 = null;
    Object v23 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v21),((com.google.javascript.rhino.jstype.ObjectType)v22));
    Object v24 = java.util.Map.of(((java.lang.Object)v19),((java.lang.Object)v23));
    Object v25 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ControlFlowGraph)v7),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v11),((com.google.javascript.jscomp.Scope)v15),((java.util.Map)v24));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.Compiler();
    Object v2 = true;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = true;
    Object v10 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = null;
    Object v12 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.ObjectType)v11));
    Object v13 = true;
    Object v14 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v13).booleanValue()));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.jstype.ObjectType)v15));
    Object v17 = true;
    Object v18 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v17).booleanValue()));
    Object v19 = null;
    Object v20 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v18),((com.google.javascript.rhino.jstype.ObjectType)v19));
    Object v21 = java.util.Map.of(((java.lang.Object)v16),((java.lang.Object)v20));
    Object v22 = ((java.util.Map)v21).hashCode();
    Object v23 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v8),((com.google.javascript.jscomp.Scope)v12),((java.util.Map)v21));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = true;
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v7 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7));
    Object v9 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v6),((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = true;
    Object v11 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v10).booleanValue()));
    Object v12 = null;
    Object v13 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.jstype.ObjectType)v12));
    Object v14 = true;
    Object v15 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v14).booleanValue()));
    Object v16 = null;
    Object v17 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v15),((com.google.javascript.rhino.jstype.ObjectType)v16));
    Object v18 = true;
    Object v19 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v18).booleanValue()));
    Object v20 = null;
    Object v21 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v19),((com.google.javascript.rhino.jstype.ObjectType)v20));
    Object v22 = java.util.Map.of(((java.lang.Object)v17),((java.lang.Object)v21));
    Object v23 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ControlFlowGraph)v5),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v9),((com.google.javascript.jscomp.Scope)v13),((java.util.Map)v22));
    Object v24 = true;
    Object v25 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v24).booleanValue()));
    Object v26 = ((com.google.javascript.rhino.Node)v25).isLocalResultCall();
    Object v27 = true;
    Object v28 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v27).booleanValue()));
    Object v29 = null;
    Object v30 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v28),((com.google.javascript.rhino.jstype.ObjectType)v29));
    Object v31 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v30));
    Object v32 = ((com.google.javascript.jscomp.TypeInference)v23).branchedFlowThrough(((com.google.javascript.rhino.Node)v25),((com.google.javascript.jscomp.FlowScope)v31));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = true;
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v7 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7));
    Object v9 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v6),((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = true;
    Object v11 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v10).booleanValue()));
    Object v12 = null;
    Object v13 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.jstype.ObjectType)v12));
    Object v14 = true;
    Object v15 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v14).booleanValue()));
    Object v16 = null;
    Object v17 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v15),((com.google.javascript.rhino.jstype.ObjectType)v16));
    Object v18 = true;
    Object v19 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v18).booleanValue()));
    Object v20 = null;
    Object v21 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v19),((com.google.javascript.rhino.jstype.ObjectType)v20));
    Object v22 = java.util.Map.of(((java.lang.Object)v17),((java.lang.Object)v21));
    Object v23 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ControlFlowGraph)v5),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v9),((com.google.javascript.jscomp.Scope)v13),((java.util.Map)v22));
    Object v24 = true;
    Object v25 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v24).booleanValue()));
    Object v26 = true;
    Object v27 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v26).booleanValue()));
    Object v28 = null;
    Object v29 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v27),((com.google.javascript.rhino.jstype.ObjectType)v28));
    Object v30 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v29));
    Object v31 = ((com.google.javascript.rhino.jstype.StaticScope)v30).getRootNode();
    Object v32 = ((com.google.javascript.jscomp.TypeInference)v23).branchedFlowThrough(((com.google.javascript.rhino.Node)v25),((com.google.javascript.jscomp.FlowScope)v30));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = true;
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v7 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7));
    Object v9 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v6),((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = true;
    Object v11 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v10).booleanValue()));
    Object v12 = null;
    Object v13 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.jstype.ObjectType)v12));
    Object v14 = true;
    Object v15 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v14).booleanValue()));
    Object v16 = null;
    Object v17 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v15),((com.google.javascript.rhino.jstype.ObjectType)v16));
    Object v18 = true;
    Object v19 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v18).booleanValue()));
    Object v20 = null;
    Object v21 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v19),((com.google.javascript.rhino.jstype.ObjectType)v20));
    Object v22 = java.util.Map.of(((java.lang.Object)v17),((java.lang.Object)v21));
    Object v23 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ControlFlowGraph)v5),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v9),((com.google.javascript.jscomp.Scope)v13),((java.util.Map)v22));
    Object v24 = true;
    Object v25 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v24).booleanValue()));
    Object v26 = true;
    Object v27 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v26).booleanValue()));
    Object v28 = null;
    Object v29 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v27),((com.google.javascript.rhino.jstype.ObjectType)v28));
    Object v30 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v29));
    Object v31 = true;
    Object v32 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v31).booleanValue()));
    Object v33 = null;
    Object v34 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v32),((com.google.javascript.rhino.jstype.ObjectType)v33));
    ((com.google.javascript.jscomp.FlowScope)v30).completeScope(((com.google.javascript.jscomp.Scope)v34));
    Object v35 = null;
    Object v36 = ((com.google.javascript.jscomp.TypeInference)v23).flowThrough(((com.google.javascript.rhino.Node)v25),((com.google.javascript.jscomp.FlowScope)v30));
    org.junit.Assert.assertNotNull(v36);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = true;
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v7 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7));
    Object v9 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v6),((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = true;
    Object v11 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v10).booleanValue()));
    Object v12 = null;
    Object v13 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.jstype.ObjectType)v12));
    Object v14 = true;
    Object v15 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v14).booleanValue()));
    Object v16 = null;
    Object v17 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v15),((com.google.javascript.rhino.jstype.ObjectType)v16));
    Object v18 = true;
    Object v19 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v18).booleanValue()));
    Object v20 = null;
    Object v21 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v19),((com.google.javascript.rhino.jstype.ObjectType)v20));
    Object v22 = java.util.Map.of(((java.lang.Object)v17),((java.lang.Object)v21));
    Object v23 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ControlFlowGraph)v5),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v9),((com.google.javascript.jscomp.Scope)v13),((java.util.Map)v22));
    Object v24 = ((com.google.javascript.jscomp.TypeInference)v23).createEntryLattice();
    org.junit.Assert.assertNotNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v2 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v3 = ((com.google.javascript.rhino.jstype.BooleanLiteralSet)v1).intersection(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v2));
    Object v4 = false;
    Object v5 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v0),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v1),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v7 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v8 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v9 = ((com.google.javascript.rhino.jstype.BooleanLiteralSet)v7).intersection(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v8));
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v6),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v7),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = ((java.lang.Enum)v11).hashCode();
    Object v13 = true;
    Object v14 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v5),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v11),(((java.lang.Boolean)v13).booleanValue()));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.Compiler();
    Object v2 = true;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = true;
    Object v10 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = null;
    Object v12 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.ObjectType)v11));
    Object v13 = "";
    Object v14 = ((com.google.javascript.jscomp.Scope)v12).getVar(((java.lang.String)v13));
    Object v15 = true;
    Object v16 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v15).booleanValue()));
    Object v17 = null;
    Object v18 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v16),((com.google.javascript.rhino.jstype.ObjectType)v17));
    Object v19 = true;
    Object v20 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v19).booleanValue()));
    Object v21 = null;
    Object v22 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.jstype.ObjectType)v21));
    Object v23 = java.util.Map.of(((java.lang.Object)v18),((java.lang.Object)v22));
    Object v24 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v8),((com.google.javascript.jscomp.Scope)v12),((java.util.Map)v23));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v2 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v3 = ((com.google.javascript.rhino.jstype.BooleanLiteralSet)v1).intersection(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v2));
    Object v4 = false;
    Object v5 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v0),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v1),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v7 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v8 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v9 = ((com.google.javascript.rhino.jstype.BooleanLiteralSet)v7).intersection(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v8));
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v6),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v7),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = false;
    Object v13 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v5),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v15 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v16 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v17 = ((com.google.javascript.rhino.jstype.BooleanLiteralSet)v15).intersection(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v16));
    Object v18 = false;
    Object v19 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v14),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v15),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = false;
    Object v21 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v13),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v23 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v24 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v25 = ((com.google.javascript.rhino.jstype.BooleanLiteralSet)v23).intersection(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v24));
    Object v26 = false;
    Object v27 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v22),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v23),(((java.lang.Boolean)v26).booleanValue()));
    Object v28 = false;
    Object v29 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v21),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v27),(((java.lang.Boolean)v28).booleanValue()));
    Object v30 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v31 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v32 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v33 = ((com.google.javascript.rhino.jstype.BooleanLiteralSet)v31).intersection(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v32));
    Object v34 = false;
    Object v35 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v30),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v31),(((java.lang.Boolean)v34).booleanValue()));
    Object v36 = true;
    Object v37 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v29),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v35),(((java.lang.Boolean)v36).booleanValue()));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE), v37);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v2 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v3 = ((com.google.javascript.rhino.jstype.BooleanLiteralSet)v1).intersection(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v2));
    Object v4 = false;
    Object v5 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v0),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v1),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v7 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v8 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v9 = ((com.google.javascript.rhino.jstype.BooleanLiteralSet)v7).intersection(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v8));
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v6),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v7),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = ((java.lang.Enum)v11).hashCode();
    Object v13 = true;
    Object v14 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v5),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v11),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v16 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v17 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v18 = ((com.google.javascript.rhino.jstype.BooleanLiteralSet)v16).intersection(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v17));
    Object v19 = false;
    Object v20 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v15),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v16),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v22 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v23 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v24 = ((com.google.javascript.rhino.jstype.BooleanLiteralSet)v22).intersection(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v23));
    Object v25 = false;
    Object v26 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v21),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v22),(((java.lang.Boolean)v25).booleanValue()));
    Object v27 = ((java.lang.Enum)v26).hashCode();
    Object v28 = true;
    Object v29 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v20),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v26),(((java.lang.Boolean)v28).booleanValue()));
    Object v30 = true;
    Object v31 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v14),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v29),(((java.lang.Boolean)v30).booleanValue()));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE), v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.Compiler();
    Object v2 = true;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = true;
    Object v6 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.jstype.ObjectType)v7));
    Object v9 = new com.google.javascript.jscomp.Scope.Arguments(((com.google.javascript.jscomp.Scope)v8));
    Object v10 = ((com.google.javascript.jscomp.graph.LinkedDirectedGraph)v4).createNode(((java.lang.Object)v9));
    Object v11 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v12 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v12));
    Object v14 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v11),((com.google.javascript.rhino.jstype.JSTypeRegistry)v13));
    Object v15 = true;
    Object v16 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v15).booleanValue()));
    Object v17 = null;
    Object v18 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v16),((com.google.javascript.rhino.jstype.ObjectType)v17));
    Object v19 = true;
    Object v20 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v19).booleanValue()));
    Object v21 = null;
    Object v22 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.jstype.ObjectType)v21));
    Object v23 = true;
    Object v24 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v23).booleanValue()));
    Object v25 = null;
    Object v26 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v24),((com.google.javascript.rhino.jstype.ObjectType)v25));
    Object v27 = java.util.Map.of(((java.lang.Object)v22),((java.lang.Object)v26));
    Object v28 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v14),((com.google.javascript.jscomp.Scope)v18),((java.util.Map)v27));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v2 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v3 = ((com.google.javascript.rhino.jstype.BooleanLiteralSet)v1).intersection(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v2));
    Object v4 = false;
    Object v5 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v0),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v1),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v7 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v8 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v9 = ((com.google.javascript.rhino.jstype.BooleanLiteralSet)v7).intersection(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v8));
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v6),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v7),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v13 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v14 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v15 = ((com.google.javascript.rhino.jstype.BooleanLiteralSet)v13).intersection(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v14));
    Object v16 = false;
    Object v17 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v12),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v13),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = ((java.lang.Enum)v17).hashCode();
    Object v19 = true;
    Object v20 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v11),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v17),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = false;
    Object v22 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v5),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v20),(((java.lang.Boolean)v21).booleanValue()));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE), v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = true;
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v7 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7));
    Object v9 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v6),((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = true;
    Object v11 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v10).booleanValue()));
    Object v12 = null;
    Object v13 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.jstype.ObjectType)v12));
    Object v14 = true;
    Object v15 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v14).booleanValue()));
    Object v16 = null;
    Object v17 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v15),((com.google.javascript.rhino.jstype.ObjectType)v16));
    Object v18 = true;
    Object v19 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v18).booleanValue()));
    Object v20 = null;
    Object v21 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v19),((com.google.javascript.rhino.jstype.ObjectType)v20));
    Object v22 = java.util.Map.of(((java.lang.Object)v17),((java.lang.Object)v21));
    Object v23 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ControlFlowGraph)v5),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v9),((com.google.javascript.jscomp.Scope)v13),((java.util.Map)v22));
    Object v24 = true;
    Object v25 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v24).booleanValue()));
    Object v26 = true;
    Object v27 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v26).booleanValue()));
    Object v28 = null;
    Object v29 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v27),((com.google.javascript.rhino.jstype.ObjectType)v28));
    Object v30 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v29));
    Object v31 = "+";
    Object v32 = ((com.google.javascript.rhino.jstype.StaticScope)v30).getSlot(((java.lang.String)v31));
    Object v33 = ((com.google.javascript.jscomp.TypeInference)v23).branchedFlowThrough(((com.google.javascript.rhino.Node)v25),((com.google.javascript.jscomp.FlowScope)v30));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = true;
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v7 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7));
    Object v9 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v6),((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = true;
    Object v11 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v10).booleanValue()));
    Object v12 = null;
    Object v13 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.jstype.ObjectType)v12));
    Object v14 = true;
    Object v15 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v14).booleanValue()));
    Object v16 = null;
    Object v17 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v15),((com.google.javascript.rhino.jstype.ObjectType)v16));
    Object v18 = true;
    Object v19 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v18).booleanValue()));
    Object v20 = null;
    Object v21 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v19),((com.google.javascript.rhino.jstype.ObjectType)v20));
    Object v22 = java.util.Map.of(((java.lang.Object)v17),((java.lang.Object)v21));
    Object v23 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ControlFlowGraph)v5),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v9),((com.google.javascript.jscomp.Scope)v13),((java.util.Map)v22));
    Object v24 = true;
    Object v25 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v24).booleanValue()));
    Object v26 = ".";
    Object v27 = com.google.javascript.jscomp.JSSourceFile.fromFile(((java.lang.String)v26));
    ((com.google.javascript.rhino.Node)v25).setStaticSourceFile(((com.google.javascript.rhino.jstype.StaticSourceFile)v27));
    Object v28 = null;
    Object v29 = true;
    Object v30 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v29).booleanValue()));
    Object v31 = null;
    Object v32 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v30),((com.google.javascript.rhino.jstype.ObjectType)v31));
    Object v33 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v32));
    Object v34 = true;
    Object v35 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v34).booleanValue()));
    Object v36 = null;
    Object v37 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v35),((com.google.javascript.rhino.jstype.ObjectType)v36));
    ((com.google.javascript.jscomp.FlowScope)v33).completeScope(((com.google.javascript.jscomp.Scope)v37));
    Object v38 = null;
    Object v39 = ((com.google.javascript.jscomp.TypeInference)v23).branchedFlowThrough(((com.google.javascript.rhino.Node)v25),((com.google.javascript.jscomp.FlowScope)v33));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTopScope();
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = true;
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v7 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7));
    Object v9 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v6),((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = true;
    Object v11 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v10).booleanValue()));
    Object v12 = null;
    Object v13 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.jstype.ObjectType)v12));
    Object v14 = true;
    Object v15 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v14).booleanValue()));
    Object v16 = null;
    Object v17 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v15),((com.google.javascript.rhino.jstype.ObjectType)v16));
    Object v18 = true;
    Object v19 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v18).booleanValue()));
    Object v20 = null;
    Object v21 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v19),((com.google.javascript.rhino.jstype.ObjectType)v20));
    Object v22 = java.util.Map.of(((java.lang.Object)v17),((java.lang.Object)v21));
    Object v23 = ((java.util.Map)v22).size();
    Object v24 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ControlFlowGraph)v5),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v9),((com.google.javascript.jscomp.Scope)v13),((java.util.Map)v22));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.Compiler();
    Object v2 = true;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((com.google.javascript.jscomp.graph.LinkedDirectedGraph)v4).getGraphvizEdges();
    Object v6 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v7 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7));
    Object v9 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v6),((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = true;
    Object v11 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v10).booleanValue()));
    Object v12 = null;
    Object v13 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.jstype.ObjectType)v12));
    Object v14 = true;
    Object v15 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v14).booleanValue()));
    Object v16 = null;
    Object v17 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v15),((com.google.javascript.rhino.jstype.ObjectType)v16));
    Object v18 = true;
    Object v19 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v18).booleanValue()));
    Object v20 = null;
    Object v21 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v19),((com.google.javascript.rhino.jstype.ObjectType)v20));
    Object v22 = java.util.Map.of(((java.lang.Object)v17),((java.lang.Object)v21));
    Object v23 = ((java.util.Map)v22).keySet();
    Object v24 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v9),((com.google.javascript.jscomp.Scope)v13),((java.util.Map)v22));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.Compiler();
    Object v2 = true;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = true;
    Object v10 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = null;
    Object v12 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.ObjectType)v11));
    Object v13 = ((com.google.javascript.jscomp.Scope)v12).getDeclarativelyUnboundVarsWithoutTypes();
    Object v14 = true;
    Object v15 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v14).booleanValue()));
    Object v16 = null;
    Object v17 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v15),((com.google.javascript.rhino.jstype.ObjectType)v16));
    Object v18 = true;
    Object v19 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v18).booleanValue()));
    Object v20 = null;
    Object v21 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v19),((com.google.javascript.rhino.jstype.ObjectType)v20));
    Object v22 = java.util.Map.of(((java.lang.Object)v17),((java.lang.Object)v21));
    Object v23 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v8),((com.google.javascript.jscomp.Scope)v12),((java.util.Map)v22));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v2 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v3 = ((com.google.javascript.rhino.jstype.BooleanLiteralSet)v1).intersection(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v2));
    Object v4 = false;
    Object v5 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v0),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v1),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v7 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v8 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v9 = ((com.google.javascript.rhino.jstype.BooleanLiteralSet)v7).intersection(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v8));
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v6),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v7),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v13 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v14 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v15 = ((com.google.javascript.rhino.jstype.BooleanLiteralSet)v13).intersection(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v14));
    Object v16 = false;
    Object v17 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v12),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v13),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = ((java.lang.Enum)v17).hashCode();
    Object v19 = true;
    Object v20 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v11),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v17),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = false;
    Object v22 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v5),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v24 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v25 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v26 = ((com.google.javascript.rhino.jstype.BooleanLiteralSet)v24).intersection(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v25));
    Object v27 = false;
    Object v28 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v23),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v24),(((java.lang.Boolean)v27).booleanValue()));
    Object v29 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v30 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v31 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v32 = ((com.google.javascript.rhino.jstype.BooleanLiteralSet)v30).intersection(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v31));
    Object v33 = false;
    Object v34 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v29),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v30),(((java.lang.Boolean)v33).booleanValue()));
    Object v35 = ((java.lang.Enum)v34).hashCode();
    Object v36 = true;
    Object v37 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v28),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v34),(((java.lang.Boolean)v36).booleanValue()));
    Object v38 = false;
    Object v39 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v22),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v37),(((java.lang.Boolean)v38).booleanValue()));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE), v39);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = true;
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = "4";
    Object v7 = true;
    Object v8 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v10 = "";
    Object v11 = "*";
    Object v12 = com.google.javascript.jscomp.DiagnosticType.error(((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = new java.lang.String[]{"",")"};
    Object v14 = com.google.javascript.jscomp.JSError.make(((java.lang.String)v6),((com.google.javascript.rhino.Node)v8),((com.google.javascript.jscomp.CheckLevel)v9),((com.google.javascript.jscomp.DiagnosticType)v12),((java.lang.String[])v13));
    Object v15 = ((com.google.javascript.jscomp.graph.LinkedDirectedGraph)v5).createNode(((java.lang.Object)v14));
    Object v16 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v17 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v17));
    Object v19 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v16),((com.google.javascript.rhino.jstype.JSTypeRegistry)v18));
    Object v20 = true;
    Object v21 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v20).booleanValue()));
    Object v22 = null;
    Object v23 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v21),((com.google.javascript.rhino.jstype.ObjectType)v22));
    Object v24 = "";
    Object v25 = ((com.google.javascript.jscomp.Scope)v23).getSlot(((java.lang.String)v24));
    Object v26 = true;
    Object v27 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v26).booleanValue()));
    Object v28 = null;
    Object v29 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v27),((com.google.javascript.rhino.jstype.ObjectType)v28));
    Object v30 = true;
    Object v31 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v30).booleanValue()));
    Object v32 = null;
    Object v33 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v31),((com.google.javascript.rhino.jstype.ObjectType)v32));
    Object v34 = java.util.Map.of(((java.lang.Object)v29),((java.lang.Object)v33));
    Object v35 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ControlFlowGraph)v5),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v19),((com.google.javascript.jscomp.Scope)v23),((java.util.Map)v34));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v2 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v3 = ((com.google.javascript.rhino.jstype.BooleanLiteralSet)v1).intersection(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v2));
    Object v4 = false;
    Object v5 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v0),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v1),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v7 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v8 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v9 = ((com.google.javascript.rhino.jstype.BooleanLiteralSet)v7).intersection(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v8));
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v6),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v7),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = ((java.lang.Enum)v11).hashCode();
    Object v13 = true;
    Object v14 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v5),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v11),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v16 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v17 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v18 = ((com.google.javascript.rhino.jstype.BooleanLiteralSet)v16).intersection(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v17));
    Object v19 = false;
    Object v20 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v15),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v16),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v22 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v23 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v24 = ((com.google.javascript.rhino.jstype.BooleanLiteralSet)v22).intersection(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v23));
    Object v25 = false;
    Object v26 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v21),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v22),(((java.lang.Boolean)v25).booleanValue()));
    Object v27 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v28 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v29 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v30 = ((com.google.javascript.rhino.jstype.BooleanLiteralSet)v28).intersection(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v29));
    Object v31 = false;
    Object v32 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v27),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v28),(((java.lang.Boolean)v31).booleanValue()));
    Object v33 = ((java.lang.Enum)v32).hashCode();
    Object v34 = true;
    Object v35 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v26),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v32),(((java.lang.Boolean)v34).booleanValue()));
    Object v36 = false;
    Object v37 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v20),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v35),(((java.lang.Boolean)v36).booleanValue()));
    Object v38 = false;
    Object v39 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v14),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v37),(((java.lang.Boolean)v38).booleanValue()));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE), v39);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.Compiler();
    Object v2 = true;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = true;
    Object v6 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.jstype.ObjectType)v7));
    Object v9 = ((com.google.javascript.jscomp.graph.LinkedDirectedGraph)v4).createDirectedGraphNode(((java.lang.Object)v8));
    Object v10 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v11 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v11));
    Object v13 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v10),((com.google.javascript.rhino.jstype.JSTypeRegistry)v12));
    Object v14 = true;
    Object v15 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v14).booleanValue()));
    Object v16 = null;
    Object v17 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v15),((com.google.javascript.rhino.jstype.ObjectType)v16));
    Object v18 = true;
    Object v19 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v18).booleanValue()));
    Object v20 = null;
    Object v21 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v19),((com.google.javascript.rhino.jstype.ObjectType)v20));
    Object v22 = true;
    Object v23 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v22).booleanValue()));
    Object v24 = null;
    Object v25 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v23),((com.google.javascript.rhino.jstype.ObjectType)v24));
    Object v26 = java.util.Map.of(((java.lang.Object)v21),((java.lang.Object)v25));
    Object v27 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v13),((com.google.javascript.jscomp.Scope)v17),((java.util.Map)v26));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.Compiler();
    Object v2 = true;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = true;
    Object v10 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = null;
    Object v12 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.ObjectType)v11));
    Object v13 = true;
    Object v14 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v13).booleanValue()));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.jstype.ObjectType)v15));
    Object v17 = true;
    Object v18 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v17).booleanValue()));
    Object v19 = null;
    Object v20 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v18),((com.google.javascript.rhino.jstype.ObjectType)v19));
    Object v21 = java.util.Map.of(((java.lang.Object)v16),((java.lang.Object)v20));
    Object v22 = ((java.util.Map)v21).size();
    Object v23 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v8),((com.google.javascript.jscomp.Scope)v12),((java.util.Map)v21));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.Compiler();
    Object v2 = true;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = true;
    Object v10 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = null;
    Object v12 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.ObjectType)v11));
    Object v13 = ((com.google.javascript.jscomp.Scope)v12).getAllSymbols();
    Object v14 = true;
    Object v15 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v14).booleanValue()));
    Object v16 = null;
    Object v17 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v15),((com.google.javascript.rhino.jstype.ObjectType)v16));
    Object v18 = true;
    Object v19 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v18).booleanValue()));
    Object v20 = null;
    Object v21 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v19),((com.google.javascript.rhino.jstype.ObjectType)v20));
    Object v22 = java.util.Map.of(((java.lang.Object)v17),((java.lang.Object)v21));
    Object v23 = ((java.util.Map)v22).hashCode();
    Object v24 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v8),((com.google.javascript.jscomp.Scope)v12),((java.util.Map)v22));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = true;
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v7 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7));
    Object v9 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v6),((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = true;
    Object v11 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v10).booleanValue()));
    Object v12 = null;
    Object v13 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.jstype.ObjectType)v12));
    Object v14 = true;
    Object v15 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v14).booleanValue()));
    Object v16 = null;
    Object v17 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v15),((com.google.javascript.rhino.jstype.ObjectType)v16));
    Object v18 = true;
    Object v19 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v18).booleanValue()));
    Object v20 = null;
    Object v21 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v19),((com.google.javascript.rhino.jstype.ObjectType)v20));
    Object v22 = java.util.Map.of(((java.lang.Object)v17),((java.lang.Object)v21));
    Object v23 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ControlFlowGraph)v5),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v9),((com.google.javascript.jscomp.Scope)v13),((java.util.Map)v22));
    Object v24 = true;
    Object v25 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v24).booleanValue()));
    Object v26 = ((com.google.javascript.rhino.Node)v25).getLength();
    Object v27 = true;
    Object v28 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v27).booleanValue()));
    Object v29 = null;
    Object v30 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v28),((com.google.javascript.rhino.jstype.ObjectType)v29));
    Object v31 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v30));
    Object v32 = ((com.google.javascript.jscomp.TypeInference)v23).flowThrough(((com.google.javascript.rhino.Node)v25),((com.google.javascript.jscomp.FlowScope)v31));
    org.junit.Assert.assertNotNull(v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = true;
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v7 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7));
    Object v9 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v6),((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = true;
    Object v11 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v10).booleanValue()));
    Object v12 = null;
    Object v13 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.jstype.ObjectType)v12));
    Object v14 = true;
    Object v15 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v14).booleanValue()));
    Object v16 = null;
    Object v17 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v15),((com.google.javascript.rhino.jstype.ObjectType)v16));
    Object v18 = true;
    Object v19 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v18).booleanValue()));
    Object v20 = null;
    Object v21 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v19),((com.google.javascript.rhino.jstype.ObjectType)v20));
    Object v22 = java.util.Map.of(((java.lang.Object)v17),((java.lang.Object)v21));
    Object v23 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ControlFlowGraph)v5),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v9),((com.google.javascript.jscomp.Scope)v13),((java.util.Map)v22));
    Object v24 = true;
    Object v25 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v24).booleanValue()));
    Object v26 = true;
    Object v27 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v26).booleanValue()));
    Object v28 = null;
    Object v29 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v27),((com.google.javascript.rhino.jstype.ObjectType)v28));
    Object v30 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v29));
    Object v31 = ((com.google.javascript.rhino.jstype.StaticScope)v30).getParentScope();
    Object v32 = ((com.google.javascript.jscomp.TypeInference)v23).branchedFlowThrough(((com.google.javascript.rhino.Node)v25),((com.google.javascript.jscomp.FlowScope)v30));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = true;
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v7 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7));
    Object v9 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v6),((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = true;
    Object v11 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v10).booleanValue()));
    Object v12 = null;
    Object v13 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.jstype.ObjectType)v12));
    Object v14 = true;
    Object v15 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v14).booleanValue()));
    Object v16 = null;
    Object v17 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v15),((com.google.javascript.rhino.jstype.ObjectType)v16));
    Object v18 = true;
    Object v19 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v18).booleanValue()));
    Object v20 = null;
    Object v21 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v19),((com.google.javascript.rhino.jstype.ObjectType)v20));
    Object v22 = java.util.Map.of(((java.lang.Object)v17),((java.lang.Object)v21));
    Object v23 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ControlFlowGraph)v5),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v9),((com.google.javascript.jscomp.Scope)v13),((java.util.Map)v22));
    Object v24 = true;
    Object v25 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v24).booleanValue()));
    Object v26 = new java.io.StringWriter();
    ((com.google.javascript.rhino.Node)v25).appendStringTree(((java.lang.Appendable)v26));
    Object v27 = null;
    Object v28 = true;
    Object v29 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v28).booleanValue()));
    Object v30 = null;
    Object v31 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v29),((com.google.javascript.rhino.jstype.ObjectType)v30));
    Object v32 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v31));
    Object v33 = ((com.google.javascript.jscomp.TypeInference)v23).branchedFlowThrough(((com.google.javascript.rhino.Node)v25),((com.google.javascript.jscomp.FlowScope)v32));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "p";
    Object v2 = -1;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = false;
    Object v7 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v9 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v9));
    Object v11 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v8),((com.google.javascript.rhino.jstype.JSTypeRegistry)v10));
    Object v12 = true;
    Object v13 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v12).booleanValue()));
    Object v14 = null;
    Object v15 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.jstype.ObjectType)v14));
    Object v16 = true;
    Object v17 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v16).booleanValue()));
    Object v18 = null;
    Object v19 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v17),((com.google.javascript.rhino.jstype.ObjectType)v18));
    Object v20 = true;
    Object v21 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v20).booleanValue()));
    Object v22 = null;
    Object v23 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v21),((com.google.javascript.rhino.jstype.ObjectType)v22));
    Object v24 = java.util.Map.of(((java.lang.Object)v19),((java.lang.Object)v23));
    Object v25 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ControlFlowGraph)v7),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v11),((com.google.javascript.jscomp.Scope)v15),((java.util.Map)v24));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = true;
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v7 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7));
    Object v9 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v6),((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = true;
    Object v11 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v10).booleanValue()));
    Object v12 = null;
    Object v13 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.jstype.ObjectType)v12));
    Object v14 = true;
    Object v15 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v14).booleanValue()));
    Object v16 = null;
    Object v17 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v15),((com.google.javascript.rhino.jstype.ObjectType)v16));
    Object v18 = true;
    Object v19 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v18).booleanValue()));
    Object v20 = null;
    Object v21 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v19),((com.google.javascript.rhino.jstype.ObjectType)v20));
    Object v22 = java.util.Map.of(((java.lang.Object)v17),((java.lang.Object)v21));
    Object v23 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ControlFlowGraph)v5),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v9),((com.google.javascript.jscomp.Scope)v13),((java.util.Map)v22));
    Object v24 = true;
    Object v25 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v24).booleanValue()));
    Object v26 = true;
    Object v27 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v26).booleanValue()));
    Object v28 = null;
    Object v29 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v27),((com.google.javascript.rhino.jstype.ObjectType)v28));
    Object v30 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v29));
    Object v31 = true;
    Object v32 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v31).booleanValue()));
    Object v33 = null;
    Object v34 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v32),((com.google.javascript.rhino.jstype.ObjectType)v33));
    ((com.google.javascript.jscomp.FlowScope)v30).completeScope(((com.google.javascript.jscomp.Scope)v34));
    Object v35 = null;
    Object v36 = ((com.google.javascript.jscomp.TypeInference)v23).branchedFlowThrough(((com.google.javascript.rhino.Node)v25),((com.google.javascript.jscomp.FlowScope)v30));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = true;
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v7 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7));
    Object v9 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v6),((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = true;
    Object v11 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v10).booleanValue()));
    Object v12 = null;
    Object v13 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.jstype.ObjectType)v12));
    Object v14 = true;
    Object v15 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v14).booleanValue()));
    Object v16 = null;
    Object v17 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v15),((com.google.javascript.rhino.jstype.ObjectType)v16));
    Object v18 = true;
    Object v19 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v18).booleanValue()));
    Object v20 = null;
    Object v21 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v19),((com.google.javascript.rhino.jstype.ObjectType)v20));
    Object v22 = java.util.Map.of(((java.lang.Object)v17),((java.lang.Object)v21));
    Object v23 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ControlFlowGraph)v5),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v9),((com.google.javascript.jscomp.Scope)v13),((java.util.Map)v22));
    Object v24 = true;
    Object v25 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v24).booleanValue()));
    Object v26 = ((com.google.javascript.rhino.Node)v25).getAncestors();
    Object v27 = true;
    Object v28 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v27).booleanValue()));
    Object v29 = null;
    Object v30 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v28),((com.google.javascript.rhino.jstype.ObjectType)v29));
    Object v31 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v30));
    Object v32 = ((com.google.javascript.jscomp.TypeInference)v23).flowThrough(((com.google.javascript.rhino.Node)v25),((com.google.javascript.jscomp.FlowScope)v31));
    org.junit.Assert.assertNotNull(v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v2 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v3 = ((com.google.javascript.rhino.jstype.BooleanLiteralSet)v1).intersection(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v2));
    Object v4 = false;
    Object v5 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v0),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v1),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v7 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v8 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v9 = ((com.google.javascript.rhino.jstype.BooleanLiteralSet)v7).intersection(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v8));
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v6),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v7),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = ((java.lang.Enum)v11).hashCode();
    Object v13 = true;
    Object v14 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v5),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v11),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v16 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v17 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v18 = ((com.google.javascript.rhino.jstype.BooleanLiteralSet)v16).intersection(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v17));
    Object v19 = false;
    Object v20 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v15),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v16),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v22 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v23 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v24 = ((com.google.javascript.rhino.jstype.BooleanLiteralSet)v22).intersection(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v23));
    Object v25 = false;
    Object v26 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v21),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v22),(((java.lang.Boolean)v25).booleanValue()));
    Object v27 = false;
    Object v28 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v20),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v26),(((java.lang.Boolean)v27).booleanValue()));
    Object v29 = ((com.google.javascript.rhino.jstype.BooleanLiteralSet)v14).intersection(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v28));
    Object v30 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v31 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v32 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v33 = ((com.google.javascript.rhino.jstype.BooleanLiteralSet)v31).intersection(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v32));
    Object v34 = false;
    Object v35 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v30),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v31),(((java.lang.Boolean)v34).booleanValue()));
    Object v36 = false;
    Object v37 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v14),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v35),(((java.lang.Boolean)v36).booleanValue()));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE), v37);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.Compiler();
    Object v2 = true;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = true;
    Object v10 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = null;
    Object v12 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.ObjectType)v11));
    Object v13 = true;
    Object v14 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v13).booleanValue()));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.jstype.ObjectType)v15));
    Object v17 = true;
    Object v18 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v17).booleanValue()));
    Object v19 = null;
    Object v20 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v18),((com.google.javascript.rhino.jstype.ObjectType)v19));
    Object v21 = java.util.Map.of(((java.lang.Object)v16),((java.lang.Object)v20));
    Object v22 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v23 = ((java.util.Map)v21).get(((java.lang.Object)v22));
    Object v24 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v8),((com.google.javascript.jscomp.Scope)v12),((java.util.Map)v21));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v2 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v3 = ((com.google.javascript.rhino.jstype.BooleanLiteralSet)v1).intersection(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v2));
    Object v4 = false;
    Object v5 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v0),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v1),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v7 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v8 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v9 = ((com.google.javascript.rhino.jstype.BooleanLiteralSet)v7).intersection(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v8));
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v6),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v7),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = ((java.lang.Enum)v11).hashCode();
    Object v13 = true;
    Object v14 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v5),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v11),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = ((java.lang.Enum)v14).getDeclaringClass();
    Object v16 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v17 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v18 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v19 = ((com.google.javascript.rhino.jstype.BooleanLiteralSet)v17).intersection(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v18));
    Object v20 = false;
    Object v21 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v16),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v17),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v23 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v24 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v25 = ((com.google.javascript.rhino.jstype.BooleanLiteralSet)v23).intersection(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v24));
    Object v26 = false;
    Object v27 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v22),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v23),(((java.lang.Boolean)v26).booleanValue()));
    Object v28 = ((java.lang.Enum)v27).hashCode();
    Object v29 = true;
    Object v30 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v21),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v27),(((java.lang.Boolean)v29).booleanValue()));
    Object v31 = false;
    Object v32 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v14),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v30),(((java.lang.Boolean)v31).booleanValue()));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE), v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "4";
    Object v2 = true;
    Object v3 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v5 = "";
    Object v6 = "*";
    Object v7 = com.google.javascript.jscomp.DiagnosticType.error(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = new java.lang.String[]{"",")"};
    Object v9 = com.google.javascript.jscomp.JSError.make(((java.lang.String)v1),((com.google.javascript.rhino.Node)v3),((com.google.javascript.jscomp.CheckLevel)v4),((com.google.javascript.jscomp.DiagnosticType)v7),((java.lang.String[])v8));
    ((com.google.javascript.jscomp.AbstractCompiler)v0).report(((com.google.javascript.jscomp.JSError)v9));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Compiler();
    Object v12 = true;
    Object v13 = false;
    Object v14 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v11),(((java.lang.Boolean)v12).booleanValue()),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v16 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v16));
    Object v18 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v15),((com.google.javascript.rhino.jstype.JSTypeRegistry)v17));
    Object v19 = true;
    Object v20 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v19).booleanValue()));
    Object v21 = null;
    Object v22 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.jstype.ObjectType)v21));
    Object v23 = true;
    Object v24 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v23).booleanValue()));
    Object v25 = null;
    Object v26 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v24),((com.google.javascript.rhino.jstype.ObjectType)v25));
    Object v27 = true;
    Object v28 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v27).booleanValue()));
    Object v29 = null;
    Object v30 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v28),((com.google.javascript.rhino.jstype.ObjectType)v29));
    Object v31 = java.util.Map.of(((java.lang.Object)v26),((java.lang.Object)v30));
    Object v32 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ControlFlowGraph)v14),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v18),((com.google.javascript.jscomp.Scope)v22),((java.util.Map)v31));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.Compiler();
    Object v2 = true;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((com.google.javascript.jscomp.graph.LinkedDirectedGraph)v4).getGraphvizNodes();
    Object v6 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v7 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7));
    Object v9 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v6),((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = true;
    Object v11 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v10).booleanValue()));
    Object v12 = true;
    Object v13 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v12).booleanValue()));
    Object v14 = null;
    Object v15 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.jstype.ObjectType)v14));
    Object v16 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v15));
    Object v17 = true;
    Object v18 = ((com.google.javascript.jscomp.ReverseAbstractInterpreter)v9).getPreciserScopeKnowingConditionOutcome(((com.google.javascript.rhino.Node)v11),((com.google.javascript.jscomp.FlowScope)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = true;
    Object v20 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v19).booleanValue()));
    Object v21 = null;
    Object v22 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.jstype.ObjectType)v21));
    Object v23 = true;
    Object v24 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v23).booleanValue()));
    Object v25 = null;
    Object v26 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v24),((com.google.javascript.rhino.jstype.ObjectType)v25));
    Object v27 = new com.google.javascript.jscomp.Scope.Arguments(((com.google.javascript.jscomp.Scope)v26));
    Object v28 = ((com.google.javascript.jscomp.Scope)v22).getReferences(((com.google.javascript.jscomp.Scope.Var)v27));
    Object v29 = true;
    Object v30 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v29).booleanValue()));
    Object v31 = null;
    Object v32 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v30),((com.google.javascript.rhino.jstype.ObjectType)v31));
    Object v33 = true;
    Object v34 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v33).booleanValue()));
    Object v35 = null;
    Object v36 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v34),((com.google.javascript.rhino.jstype.ObjectType)v35));
    Object v37 = java.util.Map.of(((java.lang.Object)v32),((java.lang.Object)v36));
    Object v38 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v9),((com.google.javascript.jscomp.Scope)v22),((java.util.Map)v37));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = -18;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = false;
    Object v7 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v9 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v9));
    Object v11 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v8),((com.google.javascript.rhino.jstype.JSTypeRegistry)v10));
    Object v12 = true;
    Object v13 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v12).booleanValue()));
    Object v14 = null;
    Object v15 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.jstype.ObjectType)v14));
    Object v16 = "";
    Object v17 = ((com.google.javascript.jscomp.Scope)v15).getSlot(((java.lang.String)v16));
    Object v18 = true;
    Object v19 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v18).booleanValue()));
    Object v20 = null;
    Object v21 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v19),((com.google.javascript.rhino.jstype.ObjectType)v20));
    Object v22 = true;
    Object v23 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v22).booleanValue()));
    Object v24 = null;
    Object v25 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v23),((com.google.javascript.rhino.jstype.ObjectType)v24));
    Object v26 = java.util.Map.of(((java.lang.Object)v21),((java.lang.Object)v25));
    Object v27 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ControlFlowGraph)v7),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v11),((com.google.javascript.jscomp.Scope)v15),((java.util.Map)v26));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = true;
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = ((com.google.javascript.jscomp.graph.LinkedDirectedGraph)v5).createNode(((java.lang.Object)v6));
    Object v8 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v9 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v9));
    Object v11 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v8),((com.google.javascript.rhino.jstype.JSTypeRegistry)v10));
    Object v12 = true;
    Object v13 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v12).booleanValue()));
    Object v14 = null;
    Object v15 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.jstype.ObjectType)v14));
    Object v16 = true;
    Object v17 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v16).booleanValue()));
    Object v18 = null;
    Object v19 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v17),((com.google.javascript.rhino.jstype.ObjectType)v18));
    Object v20 = true;
    Object v21 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v20).booleanValue()));
    Object v22 = null;
    Object v23 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v21),((com.google.javascript.rhino.jstype.ObjectType)v22));
    Object v24 = java.util.Map.of(((java.lang.Object)v19),((java.lang.Object)v23));
    Object v25 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ControlFlowGraph)v5),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v11),((com.google.javascript.jscomp.Scope)v15),((java.util.Map)v24));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.Compiler();
    Object v2 = true;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = "";
    Object v6 = new com.google.javascript.rhino.InputId(((java.lang.String)v5));
    Object v7 = ((com.google.javascript.jscomp.graph.LinkedDirectedGraph)v4).getDirectedGraphNode(((java.lang.Object)v6));
    Object v8 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v9 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v9));
    Object v11 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v8),((com.google.javascript.rhino.jstype.JSTypeRegistry)v10));
    Object v12 = true;
    Object v13 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v12).booleanValue()));
    Object v14 = null;
    Object v15 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.jstype.ObjectType)v14));
    Object v16 = true;
    Object v17 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v16).booleanValue()));
    Object v18 = null;
    Object v19 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v17),((com.google.javascript.rhino.jstype.ObjectType)v18));
    Object v20 = true;
    Object v21 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v20).booleanValue()));
    Object v22 = null;
    Object v23 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v21),((com.google.javascript.rhino.jstype.ObjectType)v22));
    Object v24 = java.util.Map.of(((java.lang.Object)v19),((java.lang.Object)v23));
    Object v25 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v11),((com.google.javascript.jscomp.Scope)v15),((java.util.Map)v24));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }
}
