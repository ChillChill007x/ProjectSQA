package com.google.javascript.jscomp;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = java.nio.charset.Charset.defaultCharset();
    Object v5 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v4));
    Object v6 = new com.google.javascript.jscomp.DefaultCodingConvention();
    Object v7 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7));
    Object v9 = new com.google.javascript.jscomp.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v6),((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = 54.84792226060818D;
    Object v11 = 0;
    Object v12 = 1;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v15 = java.nio.charset.Charset.defaultCharset();
    Object v16 = new java.io.PrintStream(((java.lang.String)v14),((java.nio.charset.Charset)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v16));
    Object v18 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v13),((com.google.javascript.jscomp.AbstractCompiler)v17));
    Object v19 = com.google.javascript.jscomp.PhaseOptimizer.getLoopsRun();
    Object v20 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ControlFlowGraph)v5),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v9),((com.google.javascript.jscomp.Scope)v18),((java.util.Collection)v19));
    Object v21 = 54.84792226060818D;
    Object v22 = 0;
    Object v23 = 1;
    Object v24 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v21).doubleValue()),(((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()));
    Object v25 = 54.84792226060818D;
    Object v26 = 0;
    Object v27 = 1;
    Object v28 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v25).doubleValue()),(((java.lang.Integer)v26).intValue()),(((java.lang.Integer)v27).intValue()));
    Object v29 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v30 = java.nio.charset.Charset.defaultCharset();
    Object v31 = new java.io.PrintStream(((java.lang.String)v29),((java.nio.charset.Charset)v30));
    Object v32 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v31));
    Object v33 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v28),((com.google.javascript.jscomp.AbstractCompiler)v32));
    Object v34 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v33));
    Object v35 = new com.google.javascript.jscomp.LinkedFlowScope(((com.google.javascript.jscomp.LinkedFlowScope)v34));
    Object v36 = ((com.google.javascript.jscomp.TypeInference)v20).flowThrough(((com.google.javascript.rhino.Node)v24),((com.google.javascript.jscomp.FlowScope)v35));
    org.junit.Assert.assertNotNull(v36);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
    Object v2 = true;
    Object v3 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v0),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v1),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = java.nio.charset.Charset.defaultCharset();
    Object v5 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v4));
    Object v6 = new com.google.javascript.jscomp.DefaultCodingConvention();
    Object v7 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7));
    Object v9 = new com.google.javascript.jscomp.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v6),((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = 54.84792226060818D;
    Object v11 = 0;
    Object v12 = 1;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v15 = java.nio.charset.Charset.defaultCharset();
    Object v16 = new java.io.PrintStream(((java.lang.String)v14),((java.nio.charset.Charset)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v16));
    Object v18 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v13),((com.google.javascript.jscomp.AbstractCompiler)v17));
    Object v19 = "null";
    Object v20 = true;
    Object v21 = ((com.google.javascript.jscomp.Scope)v18).isDeclared(((java.lang.String)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = com.google.javascript.jscomp.PhaseOptimizer.getLoopsRun();
    Object v23 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ControlFlowGraph)v5),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v9),((com.google.javascript.jscomp.Scope)v18),((java.util.Collection)v22));
    org.junit.Assert.assertNotNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = java.nio.charset.Charset.defaultCharset();
    Object v5 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v4));
    Object v6 = new com.google.javascript.jscomp.DefaultCodingConvention();
    Object v7 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7));
    Object v9 = new com.google.javascript.jscomp.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v6),((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = 54.84792226060818D;
    Object v11 = 0;
    Object v12 = 1;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v15 = java.nio.charset.Charset.defaultCharset();
    Object v16 = new java.io.PrintStream(((java.lang.String)v14),((java.nio.charset.Charset)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v16));
    Object v18 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v13),((com.google.javascript.jscomp.AbstractCompiler)v17));
    Object v19 = com.google.javascript.jscomp.PhaseOptimizer.getLoopsRun();
    Object v20 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ControlFlowGraph)v5),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v9),((com.google.javascript.jscomp.Scope)v18),((java.util.Collection)v19));
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = java.nio.charset.Charset.defaultCharset();
    Object v5 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v4));
    Object v6 = new com.google.javascript.jscomp.DefaultCodingConvention();
    Object v7 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7));
    Object v9 = new com.google.javascript.jscomp.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v6),((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = 54.84792226060818D;
    Object v11 = 0;
    Object v12 = 1;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v15 = java.nio.charset.Charset.defaultCharset();
    Object v16 = new java.io.PrintStream(((java.lang.String)v14),((java.nio.charset.Charset)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v16));
    Object v18 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v13),((com.google.javascript.jscomp.AbstractCompiler)v17));
    Object v19 = com.google.javascript.jscomp.PhaseOptimizer.getLoopsRun();
    Object v20 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ControlFlowGraph)v5),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v9),((com.google.javascript.jscomp.Scope)v18),((java.util.Collection)v19));
    Object v21 = 54.84792226060818D;
    Object v22 = 0;
    Object v23 = 1;
    Object v24 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v21).doubleValue()),(((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()));
    Object v25 = 54.84792226060818D;
    Object v26 = 0;
    Object v27 = 1;
    Object v28 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v25).doubleValue()),(((java.lang.Integer)v26).intValue()),(((java.lang.Integer)v27).intValue()));
    Object v29 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v30 = java.nio.charset.Charset.defaultCharset();
    Object v31 = new java.io.PrintStream(((java.lang.String)v29),((java.nio.charset.Charset)v30));
    Object v32 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v31));
    Object v33 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v28),((com.google.javascript.jscomp.AbstractCompiler)v32));
    Object v34 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v33));
    Object v35 = new com.google.javascript.jscomp.LinkedFlowScope(((com.google.javascript.jscomp.LinkedFlowScope)v34));
    Object v36 = ((com.google.javascript.jscomp.TypeInference)v20).branchedFlowThrough(((com.google.javascript.rhino.Node)v24),((com.google.javascript.jscomp.FlowScope)v35));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = java.nio.charset.Charset.defaultCharset();
    Object v5 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v4));
    Object v6 = 54.84792226060818D;
    Object v7 = 0;
    Object v8 = 1;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = ((com.google.javascript.jscomp.graph.Graph)v5).hasNode(((java.lang.Object)v9));
    Object v11 = new com.google.javascript.jscomp.DefaultCodingConvention();
    Object v12 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v12));
    Object v14 = new com.google.javascript.jscomp.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v11),((com.google.javascript.rhino.jstype.JSTypeRegistry)v13));
    Object v15 = 54.84792226060818D;
    Object v16 = 0;
    Object v17 = 1;
    Object v18 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v15).doubleValue()),(((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()));
    Object v19 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v20 = java.nio.charset.Charset.defaultCharset();
    Object v21 = new java.io.PrintStream(((java.lang.String)v19),((java.nio.charset.Charset)v20));
    Object v22 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v21));
    Object v23 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v18),((com.google.javascript.jscomp.AbstractCompiler)v22));
    Object v24 = com.google.javascript.jscomp.PhaseOptimizer.getLoopsRun();
    Object v25 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ControlFlowGraph)v5),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v14),((com.google.javascript.jscomp.Scope)v23),((java.util.Collection)v24));
    org.junit.Assert.assertNotNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = java.nio.charset.Charset.defaultCharset();
    Object v5 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v4));
    Object v6 = new com.google.javascript.jscomp.DefaultCodingConvention();
    Object v7 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7));
    Object v9 = new com.google.javascript.jscomp.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v6),((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = 54.84792226060818D;
    Object v11 = 0;
    Object v12 = 1;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v15 = java.nio.charset.Charset.defaultCharset();
    Object v16 = new java.io.PrintStream(((java.lang.String)v14),((java.nio.charset.Charset)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v16));
    Object v18 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v13),((com.google.javascript.jscomp.AbstractCompiler)v17));
    Object v19 = "null";
    Object v20 = true;
    Object v21 = ((com.google.javascript.jscomp.Scope)v18).isDeclared(((java.lang.String)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = com.google.javascript.jscomp.PhaseOptimizer.getLoopsRun();
    Object v23 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ControlFlowGraph)v5),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v9),((com.google.javascript.jscomp.Scope)v18),((java.util.Collection)v22));
    Object v24 = ((com.google.javascript.jscomp.TypeInference)v23).createEntryLattice();
    org.junit.Assert.assertNotNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = java.nio.charset.Charset.defaultCharset();
    Object v5 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v4));
    Object v6 = new com.google.javascript.jscomp.DefaultCodingConvention();
    Object v7 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7));
    Object v9 = new com.google.javascript.jscomp.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v6),((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = 54.84792226060818D;
    Object v11 = 0;
    Object v12 = 1;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v15 = java.nio.charset.Charset.defaultCharset();
    Object v16 = new java.io.PrintStream(((java.lang.String)v14),((java.nio.charset.Charset)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v16));
    Object v18 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v13),((com.google.javascript.jscomp.AbstractCompiler)v17));
    Object v19 = "null";
    Object v20 = true;
    Object v21 = ((com.google.javascript.jscomp.Scope)v18).isDeclared(((java.lang.String)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = com.google.javascript.jscomp.PhaseOptimizer.getLoopsRun();
    Object v23 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ControlFlowGraph)v5),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v9),((com.google.javascript.jscomp.Scope)v18),((java.util.Collection)v22));
    Object v24 = 54.84792226060818D;
    Object v25 = 0;
    Object v26 = 1;
    Object v27 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v24).doubleValue()),(((java.lang.Integer)v25).intValue()),(((java.lang.Integer)v26).intValue()));
    Object v28 = 54.84792226060818D;
    Object v29 = 0;
    Object v30 = 1;
    Object v31 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v28).doubleValue()),(((java.lang.Integer)v29).intValue()),(((java.lang.Integer)v30).intValue()));
    Object v32 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v33 = java.nio.charset.Charset.defaultCharset();
    Object v34 = new java.io.PrintStream(((java.lang.String)v32),((java.nio.charset.Charset)v33));
    Object v35 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v34));
    Object v36 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v31),((com.google.javascript.jscomp.AbstractCompiler)v35));
    Object v37 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v36));
    Object v38 = new com.google.javascript.jscomp.LinkedFlowScope(((com.google.javascript.jscomp.LinkedFlowScope)v37));
    Object v39 = ((com.google.javascript.jscomp.TypeInference)v23).flowThrough(((com.google.javascript.rhino.Node)v27),((com.google.javascript.jscomp.FlowScope)v38));
    org.junit.Assert.assertNotNull(v39);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getCodingConvention();
    Object v5 = java.nio.charset.Charset.defaultCharset();
    Object v6 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v5));
    Object v7 = java.nio.charset.Charset.defaultCharset();
    Object v8 = ((com.google.javascript.jscomp.graph.LinkedDirectedGraph)v6).getInEdges(((java.lang.Object)v7));
    Object v9 = new com.google.javascript.jscomp.DefaultCodingConvention();
    Object v10 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10));
    Object v12 = new com.google.javascript.jscomp.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v9),((com.google.javascript.rhino.jstype.JSTypeRegistry)v11));
    Object v13 = 54.84792226060818D;
    Object v14 = 0;
    Object v15 = 1;
    Object v16 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v13).doubleValue()),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v18 = java.nio.charset.Charset.defaultCharset();
    Object v19 = new java.io.PrintStream(((java.lang.String)v17),((java.nio.charset.Charset)v18));
    Object v20 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v19));
    Object v21 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v16),((com.google.javascript.jscomp.AbstractCompiler)v20));
    Object v22 = "w";
    Object v23 = true;
    Object v24 = ((com.google.javascript.jscomp.Scope)v21).isDeclared(((java.lang.String)v22),(((java.lang.Boolean)v23).booleanValue()));
    Object v25 = com.google.javascript.jscomp.PhaseOptimizer.getLoopsRun();
    Object v26 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ControlFlowGraph)v6),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v12),((com.google.javascript.jscomp.Scope)v21),((java.util.Collection)v25));
    org.junit.Assert.assertNotNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = java.nio.charset.Charset.defaultCharset();
    Object v5 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v4));
    Object v6 = new com.google.javascript.jscomp.DefaultCodingConvention();
    Object v7 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7));
    Object v9 = new com.google.javascript.jscomp.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v6),((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = 54.84792226060818D;
    Object v11 = 0;
    Object v12 = 1;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v15 = java.nio.charset.Charset.defaultCharset();
    Object v16 = new java.io.PrintStream(((java.lang.String)v14),((java.nio.charset.Charset)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v16));
    Object v18 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v13),((com.google.javascript.jscomp.AbstractCompiler)v17));
    Object v19 = com.google.javascript.jscomp.PhaseOptimizer.getLoopsRun();
    Object v20 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ControlFlowGraph)v5),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v9),((com.google.javascript.jscomp.Scope)v18),((java.util.Collection)v19));
    Object v21 = 54.84792226060818D;
    Object v22 = 0;
    Object v23 = 1;
    Object v24 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v21).doubleValue()),(((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()));
    Object v25 = -2;
    ((com.google.javascript.rhino.Node)v24).setLineno((((java.lang.Integer)v25).intValue()));
    Object v26 = null;
    Object v27 = 54.84792226060818D;
    Object v28 = 0;
    Object v29 = 1;
    Object v30 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v27).doubleValue()),(((java.lang.Integer)v28).intValue()),(((java.lang.Integer)v29).intValue()));
    Object v31 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v32 = java.nio.charset.Charset.defaultCharset();
    Object v33 = new java.io.PrintStream(((java.lang.String)v31),((java.nio.charset.Charset)v32));
    Object v34 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v33));
    Object v35 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v30),((com.google.javascript.jscomp.AbstractCompiler)v34));
    Object v36 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v35));
    Object v37 = new com.google.javascript.jscomp.LinkedFlowScope(((com.google.javascript.jscomp.LinkedFlowScope)v36));
    Object v38 = ((com.google.javascript.jscomp.TypeInference)v20).branchedFlowThrough(((com.google.javascript.rhino.Node)v24),((com.google.javascript.jscomp.FlowScope)v37));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = java.nio.charset.Charset.defaultCharset();
    Object v5 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v4));
    Object v6 = new com.google.javascript.jscomp.DefaultCodingConvention();
    Object v7 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7));
    Object v9 = new com.google.javascript.jscomp.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v6),((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = 54.84792226060818D;
    Object v11 = 0;
    Object v12 = 1;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v15 = java.nio.charset.Charset.defaultCharset();
    Object v16 = new java.io.PrintStream(((java.lang.String)v14),((java.nio.charset.Charset)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v16));
    Object v18 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v13),((com.google.javascript.jscomp.AbstractCompiler)v17));
    Object v19 = com.google.javascript.jscomp.PhaseOptimizer.getLoopsRun();
    Object v20 = com.google.javascript.jscomp.PhaseOptimizer.getLoopsRun();
    Object v21 = ((java.util.Collection)v19).retainAll(((java.util.Collection)v20));
    Object v22 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ControlFlowGraph)v5),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v9),((com.google.javascript.jscomp.Scope)v18),((java.util.Collection)v19));
    org.junit.Assert.assertNotNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = java.nio.charset.Charset.defaultCharset();
    Object v5 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v4));
    Object v6 = new com.google.javascript.jscomp.DefaultCodingConvention();
    Object v7 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7));
    Object v9 = new com.google.javascript.jscomp.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v6),((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = 54.84792226060818D;
    Object v11 = 0;
    Object v12 = 1;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v15 = java.nio.charset.Charset.defaultCharset();
    Object v16 = new java.io.PrintStream(((java.lang.String)v14),((java.nio.charset.Charset)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v16));
    Object v18 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v13),((com.google.javascript.jscomp.AbstractCompiler)v17));
    Object v19 = com.google.javascript.jscomp.PhaseOptimizer.getLoopsRun();
    Object v20 = com.google.javascript.jscomp.PhaseOptimizer.getLoopsRun();
    Object v21 = ((java.util.Collection)v19).retainAll(((java.util.Collection)v20));
    Object v22 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ControlFlowGraph)v5),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v9),((com.google.javascript.jscomp.Scope)v18),((java.util.Collection)v19));
    Object v23 = 54.84792226060818D;
    Object v24 = 0;
    Object v25 = 1;
    Object v26 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v23).doubleValue()),(((java.lang.Integer)v24).intValue()),(((java.lang.Integer)v25).intValue()));
    Object v27 = 54.84792226060818D;
    Object v28 = 0;
    Object v29 = 1;
    Object v30 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v27).doubleValue()),(((java.lang.Integer)v28).intValue()),(((java.lang.Integer)v29).intValue()));
    Object v31 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v32 = java.nio.charset.Charset.defaultCharset();
    Object v33 = new java.io.PrintStream(((java.lang.String)v31),((java.nio.charset.Charset)v32));
    Object v34 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v33));
    Object v35 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v30),((com.google.javascript.jscomp.AbstractCompiler)v34));
    Object v36 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v35));
    Object v37 = ((com.google.javascript.jscomp.TypeInference)v22).flowThrough(((com.google.javascript.rhino.Node)v26),((com.google.javascript.jscomp.FlowScope)v36));
    org.junit.Assert.assertNotNull(v37);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
    Object v2 = true;
    Object v3 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v0),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v5 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
    Object v6 = true;
    Object v7 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v4),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v3),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v7),(((java.lang.Boolean)v8).booleanValue()));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
    Object v2 = true;
    Object v3 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v0),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v5 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
    Object v6 = true;
    Object v7 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v4),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = true;
    Object v9 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v3),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v7),(((java.lang.Boolean)v8).booleanValue()));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = java.nio.charset.Charset.defaultCharset();
    Object v5 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v4));
    Object v6 = new com.google.javascript.jscomp.DefaultCodingConvention();
    Object v7 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7));
    Object v9 = new com.google.javascript.jscomp.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v6),((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = 54.84792226060818D;
    Object v11 = 0;
    Object v12 = 1;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v15 = java.nio.charset.Charset.defaultCharset();
    Object v16 = new java.io.PrintStream(((java.lang.String)v14),((java.nio.charset.Charset)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v16));
    Object v18 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v13),((com.google.javascript.jscomp.AbstractCompiler)v17));
    Object v19 = com.google.javascript.jscomp.PhaseOptimizer.getLoopsRun();
    Object v20 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ControlFlowGraph)v5),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v9),((com.google.javascript.jscomp.Scope)v18),((java.util.Collection)v19));
    Object v21 = ((com.google.javascript.jscomp.TypeInference)v20).createInitialEstimateLattice();
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
    Object v2 = true;
    Object v3 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v0),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v5 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
    Object v6 = true;
    Object v7 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v4),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = true;
    Object v9 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v3),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = false;
    Object v11 = ((com.google.javascript.rhino.jstype.BooleanLiteralSet)v9).contains((((java.lang.Boolean)v10).booleanValue()));
    Object v12 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v13 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
    Object v14 = true;
    Object v15 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v12),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v17 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
    Object v18 = true;
    Object v19 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v16),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = true;
    Object v21 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v15),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = false;
    Object v23 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v9),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v21),(((java.lang.Boolean)v22).booleanValue()));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE), v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = java.nio.charset.Charset.defaultCharset();
    Object v5 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v4));
    Object v6 = new com.google.javascript.jscomp.DefaultCodingConvention();
    Object v7 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7));
    Object v9 = new com.google.javascript.jscomp.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v6),((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = 54.84792226060818D;
    Object v11 = 0;
    Object v12 = 1;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v15 = java.nio.charset.Charset.defaultCharset();
    Object v16 = new java.io.PrintStream(((java.lang.String)v14),((java.nio.charset.Charset)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v16));
    Object v18 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v13),((com.google.javascript.jscomp.AbstractCompiler)v17));
    Object v19 = com.google.javascript.jscomp.PhaseOptimizer.getLoopsRun();
    Object v20 = com.google.javascript.jscomp.PhaseOptimizer.getLoopsRun();
    Object v21 = ((java.util.Collection)v19).retainAll(((java.util.Collection)v20));
    Object v22 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ControlFlowGraph)v5),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v9),((com.google.javascript.jscomp.Scope)v18),((java.util.Collection)v19));
    Object v23 = ((com.google.javascript.jscomp.TypeInference)v22).createEntryLattice();
    org.junit.Assert.assertNotNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = java.nio.charset.Charset.defaultCharset();
    Object v5 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v4));
    Object v6 = new com.google.javascript.jscomp.DefaultCodingConvention();
    Object v7 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7));
    Object v9 = new com.google.javascript.jscomp.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v6),((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = 54.84792226060818D;
    Object v11 = 0;
    Object v12 = 1;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v15 = java.nio.charset.Charset.defaultCharset();
    Object v16 = new java.io.PrintStream(((java.lang.String)v14),((java.nio.charset.Charset)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v16));
    Object v18 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v13),((com.google.javascript.jscomp.AbstractCompiler)v17));
    Object v19 = "(unknown line)";
    Object v20 = true;
    Object v21 = ((com.google.javascript.jscomp.Scope)v18).isDeclared(((java.lang.String)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = com.google.javascript.jscomp.PhaseOptimizer.getLoopsRun();
    Object v23 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v24 = ((java.util.Collection)v22).equals(((java.lang.Object)v23));
    Object v25 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ControlFlowGraph)v5),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v9),((com.google.javascript.jscomp.Scope)v18),((java.util.Collection)v22));
    org.junit.Assert.assertNotNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = java.nio.charset.Charset.defaultCharset();
    Object v5 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v4));
    Object v6 = java.nio.charset.Charset.defaultCharset();
    Object v7 = com.google.javascript.jscomp.ControlFlowGraph.Branch.ON_FALSE;
    ((com.google.javascript.jscomp.ControlFlowGraph)v5).connectToImplicitReturn(((java.lang.Object)v6),((com.google.javascript.jscomp.ControlFlowGraph.Branch)v7));
    Object v8 = null;
    Object v9 = new com.google.javascript.jscomp.DefaultCodingConvention();
    Object v10 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10));
    Object v12 = new com.google.javascript.jscomp.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v9),((com.google.javascript.rhino.jstype.JSTypeRegistry)v11));
    Object v13 = 54.84792226060818D;
    Object v14 = 0;
    Object v15 = 1;
    Object v16 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v13).doubleValue()),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v18 = java.nio.charset.Charset.defaultCharset();
    Object v19 = new java.io.PrintStream(((java.lang.String)v17),((java.nio.charset.Charset)v18));
    Object v20 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v19));
    Object v21 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v16),((com.google.javascript.jscomp.AbstractCompiler)v20));
    Object v22 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ControlFlowGraph)v5),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v12),((com.google.javascript.jscomp.Scope)v21));
    org.junit.Assert.assertNotNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = java.nio.charset.Charset.defaultCharset();
    Object v5 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v4));
    Object v6 = java.nio.charset.Charset.defaultCharset();
    Object v7 = com.google.javascript.jscomp.ControlFlowGraph.Branch.ON_FALSE;
    ((com.google.javascript.jscomp.ControlFlowGraph)v5).connectToImplicitReturn(((java.lang.Object)v6),((com.google.javascript.jscomp.ControlFlowGraph.Branch)v7));
    Object v8 = null;
    Object v9 = new com.google.javascript.jscomp.DefaultCodingConvention();
    Object v10 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10));
    Object v12 = new com.google.javascript.jscomp.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v9),((com.google.javascript.rhino.jstype.JSTypeRegistry)v11));
    Object v13 = 54.84792226060818D;
    Object v14 = 0;
    Object v15 = 1;
    Object v16 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v13).doubleValue()),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v18 = java.nio.charset.Charset.defaultCharset();
    Object v19 = new java.io.PrintStream(((java.lang.String)v17),((java.nio.charset.Charset)v18));
    Object v20 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v19));
    Object v21 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v16),((com.google.javascript.jscomp.AbstractCompiler)v20));
    Object v22 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ControlFlowGraph)v5),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v12),((com.google.javascript.jscomp.Scope)v21));
    Object v23 = 54.84792226060818D;
    Object v24 = 0;
    Object v25 = 1;
    Object v26 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v23).doubleValue()),(((java.lang.Integer)v24).intValue()),(((java.lang.Integer)v25).intValue()));
    Object v27 = 54.84792226060818D;
    Object v28 = 0;
    Object v29 = 1;
    Object v30 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v27).doubleValue()),(((java.lang.Integer)v28).intValue()),(((java.lang.Integer)v29).intValue()));
    Object v31 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v32 = java.nio.charset.Charset.defaultCharset();
    Object v33 = new java.io.PrintStream(((java.lang.String)v31),((java.nio.charset.Charset)v32));
    Object v34 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v33));
    Object v35 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v30),((com.google.javascript.jscomp.AbstractCompiler)v34));
    Object v36 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v35));
    Object v37 = new com.google.javascript.jscomp.LinkedFlowScope(((com.google.javascript.jscomp.LinkedFlowScope)v36));
    Object v38 = ((com.google.javascript.jscomp.TypeInference)v22).branchedFlowThrough(((com.google.javascript.rhino.Node)v26),((com.google.javascript.jscomp.FlowScope)v37));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = java.nio.charset.Charset.defaultCharset();
    Object v5 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v4));
    Object v6 = new com.google.javascript.jscomp.DefaultCodingConvention();
    Object v7 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7));
    Object v9 = new com.google.javascript.jscomp.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v6),((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = 54.84792226060818D;
    Object v11 = 0;
    Object v12 = 1;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v15 = java.nio.charset.Charset.defaultCharset();
    Object v16 = new java.io.PrintStream(((java.lang.String)v14),((java.nio.charset.Charset)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v16));
    Object v18 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v13),((com.google.javascript.jscomp.AbstractCompiler)v17));
    Object v19 = com.google.javascript.jscomp.PhaseOptimizer.getLoopsRun();
    Object v20 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ControlFlowGraph)v5),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v9),((com.google.javascript.jscomp.Scope)v18),((java.util.Collection)v19));
    Object v21 = 54.84792226060818D;
    Object v22 = 0;
    Object v23 = 1;
    Object v24 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v21).doubleValue()),(((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()));
    Object v25 = 11;
    ((com.google.javascript.rhino.Node)v24).setType((((java.lang.Integer)v25).intValue()));
    Object v26 = null;
    Object v27 = 54.84792226060818D;
    Object v28 = 0;
    Object v29 = 1;
    Object v30 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v27).doubleValue()),(((java.lang.Integer)v28).intValue()),(((java.lang.Integer)v29).intValue()));
    Object v31 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v32 = java.nio.charset.Charset.defaultCharset();
    Object v33 = new java.io.PrintStream(((java.lang.String)v31),((java.nio.charset.Charset)v32));
    Object v34 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v33));
    Object v35 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v30),((com.google.javascript.jscomp.AbstractCompiler)v34));
    Object v36 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v35));
    Object v37 = ((com.google.javascript.jscomp.TypeInference)v20).flowThrough(((com.google.javascript.rhino.Node)v24),((com.google.javascript.jscomp.FlowScope)v36));
    org.junit.Assert.assertNotNull(v37);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = java.nio.charset.Charset.defaultCharset();
    Object v5 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v4));
    Object v6 = 54.84792226060818D;
    Object v7 = 0;
    Object v8 = 1;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = ((com.google.javascript.jscomp.graph.Graph)v5).hasNode(((java.lang.Object)v9));
    Object v11 = new com.google.javascript.jscomp.DefaultCodingConvention();
    Object v12 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v12));
    Object v14 = new com.google.javascript.jscomp.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v11),((com.google.javascript.rhino.jstype.JSTypeRegistry)v13));
    Object v15 = 54.84792226060818D;
    Object v16 = 0;
    Object v17 = 1;
    Object v18 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v15).doubleValue()),(((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()));
    Object v19 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v20 = java.nio.charset.Charset.defaultCharset();
    Object v21 = new java.io.PrintStream(((java.lang.String)v19),((java.nio.charset.Charset)v20));
    Object v22 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v21));
    Object v23 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v18),((com.google.javascript.jscomp.AbstractCompiler)v22));
    Object v24 = com.google.javascript.jscomp.PhaseOptimizer.getLoopsRun();
    Object v25 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ControlFlowGraph)v5),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v14),((com.google.javascript.jscomp.Scope)v23),((java.util.Collection)v24));
    Object v26 = ((com.google.javascript.jscomp.TypeInference)v25).createInitialEstimateLattice();
    org.junit.Assert.assertNotNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
    Object v2 = true;
    Object v3 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v0),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v5 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
    Object v6 = true;
    Object v7 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v4),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = true;
    Object v9 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v3),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = false;
    Object v11 = ((com.google.javascript.rhino.jstype.BooleanLiteralSet)v9).contains((((java.lang.Boolean)v10).booleanValue()));
    Object v12 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v13 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
    Object v14 = true;
    Object v15 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v12),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v17 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
    Object v18 = true;
    Object v19 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v16),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = true;
    Object v21 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v15),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = false;
    Object v23 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v9),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v21),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v25 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
    Object v26 = true;
    Object v27 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v24),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v25),(((java.lang.Boolean)v26).booleanValue()));
    Object v28 = true;
    Object v29 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v23),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v27),(((java.lang.Boolean)v28).booleanValue()));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE), v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    ((com.google.javascript.jscomp.AbstractCompiler)v3).reportCodeChange();
    Object v4 = null;
    Object v5 = java.nio.charset.Charset.defaultCharset();
    Object v6 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v5));
    Object v7 = ((com.google.javascript.jscomp.graph.LinkedDirectedGraph)v6).getDirectedGraphNodes();
    Object v8 = new com.google.javascript.jscomp.DefaultCodingConvention();
    Object v9 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v9));
    Object v11 = new com.google.javascript.jscomp.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v8),((com.google.javascript.rhino.jstype.JSTypeRegistry)v10));
    Object v12 = 54.84792226060818D;
    Object v13 = 0;
    Object v14 = 1;
    Object v15 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v12).doubleValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v17 = java.nio.charset.Charset.defaultCharset();
    Object v18 = new java.io.PrintStream(((java.lang.String)v16),((java.nio.charset.Charset)v17));
    Object v19 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v18));
    Object v20 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v15),((com.google.javascript.jscomp.AbstractCompiler)v19));
    Object v21 = com.google.javascript.jscomp.PhaseOptimizer.getLoopsRun();
    Object v22 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ControlFlowGraph)v6),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v11),((com.google.javascript.jscomp.Scope)v20),((java.util.Collection)v21));
    org.junit.Assert.assertNotNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
    Object v2 = true;
    Object v3 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v0),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v5 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
    Object v6 = true;
    Object v7 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v4),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v9 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
    Object v10 = true;
    Object v11 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v8),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = true;
    Object v13 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v7),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = true;
    Object v15 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v3),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v13),(((java.lang.Boolean)v14).booleanValue()));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = java.nio.charset.Charset.defaultCharset();
    Object v5 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = ((com.google.javascript.jscomp.graph.LinkedDirectedGraph)v5).createNode(((java.lang.Object)v6));
    Object v8 = new com.google.javascript.jscomp.DefaultCodingConvention();
    Object v9 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v9));
    Object v11 = new com.google.javascript.jscomp.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v8),((com.google.javascript.rhino.jstype.JSTypeRegistry)v10));
    Object v12 = 54.84792226060818D;
    Object v13 = 0;
    Object v14 = 1;
    Object v15 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v12).doubleValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v17 = java.nio.charset.Charset.defaultCharset();
    Object v18 = new java.io.PrintStream(((java.lang.String)v16),((java.nio.charset.Charset)v17));
    Object v19 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v18));
    Object v20 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v15),((com.google.javascript.jscomp.AbstractCompiler)v19));
    Object v21 = com.google.javascript.jscomp.PhaseOptimizer.getLoopsRun();
    Object v22 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ControlFlowGraph)v5),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v11),((com.google.javascript.jscomp.Scope)v20),((java.util.Collection)v21));
    org.junit.Assert.assertNotNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = java.nio.charset.Charset.defaultCharset();
    Object v5 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v4));
    Object v6 = new com.google.javascript.jscomp.DefaultCodingConvention();
    Object v7 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7));
    Object v9 = new com.google.javascript.jscomp.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v6),((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = 54.84792226060818D;
    Object v11 = 0;
    Object v12 = 1;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v15 = java.nio.charset.Charset.defaultCharset();
    Object v16 = new java.io.PrintStream(((java.lang.String)v14),((java.nio.charset.Charset)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v16));
    Object v18 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v13),((com.google.javascript.jscomp.AbstractCompiler)v17));
    Object v19 = com.google.javascript.jscomp.PhaseOptimizer.getLoopsRun();
    Object v20 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v21 = java.nio.charset.Charset.defaultCharset();
    Object v22 = new java.io.PrintStream(((java.lang.String)v20),((java.nio.charset.Charset)v21));
    Object v23 = ((java.util.Collection)v19).equals(((java.lang.Object)v22));
    Object v24 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ControlFlowGraph)v5),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v9),((com.google.javascript.jscomp.Scope)v18),((java.util.Collection)v19));
    org.junit.Assert.assertNotNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = java.nio.charset.Charset.defaultCharset();
    Object v5 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v4));
    Object v6 = new com.google.javascript.jscomp.DefaultCodingConvention();
    Object v7 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7));
    Object v9 = new com.google.javascript.jscomp.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v6),((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = 54.84792226060818D;
    Object v11 = 0;
    Object v12 = 1;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v15 = java.nio.charset.Charset.defaultCharset();
    Object v16 = new java.io.PrintStream(((java.lang.String)v14),((java.nio.charset.Charset)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v16));
    Object v18 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v13),((com.google.javascript.jscomp.AbstractCompiler)v17));
    Object v19 = com.google.javascript.jscomp.PhaseOptimizer.getLoopsRun();
    Object v20 = ((java.util.Collection)v19).size();
    Object v21 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ControlFlowGraph)v5),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v9),((com.google.javascript.jscomp.Scope)v18),((java.util.Collection)v19));
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = java.nio.charset.Charset.defaultCharset();
    Object v5 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v4));
    Object v6 = new com.google.javascript.jscomp.DefaultCodingConvention();
    Object v7 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7));
    Object v9 = new com.google.javascript.jscomp.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v6),((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = 54.84792226060818D;
    Object v11 = 0;
    Object v12 = 1;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v15 = java.nio.charset.Charset.defaultCharset();
    Object v16 = new java.io.PrintStream(((java.lang.String)v14),((java.nio.charset.Charset)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v16));
    Object v18 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v13),((com.google.javascript.jscomp.AbstractCompiler)v17));
    Object v19 = com.google.javascript.jscomp.PhaseOptimizer.getLoopsRun();
    Object v20 = ((java.util.Collection)v19).size();
    Object v21 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ControlFlowGraph)v5),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v9),((com.google.javascript.jscomp.Scope)v18),((java.util.Collection)v19));
    Object v22 = 54.84792226060818D;
    Object v23 = 0;
    Object v24 = 1;
    Object v25 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v22).doubleValue()),(((java.lang.Integer)v23).intValue()),(((java.lang.Integer)v24).intValue()));
    Object v26 = 54.84792226060818D;
    Object v27 = 0;
    Object v28 = 1;
    Object v29 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v26).doubleValue()),(((java.lang.Integer)v27).intValue()),(((java.lang.Integer)v28).intValue()));
    Object v30 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v31 = java.nio.charset.Charset.defaultCharset();
    Object v32 = new java.io.PrintStream(((java.lang.String)v30),((java.nio.charset.Charset)v31));
    Object v33 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v32));
    Object v34 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v29),((com.google.javascript.jscomp.AbstractCompiler)v33));
    Object v35 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v34));
    Object v36 = ((com.google.javascript.rhino.jstype.StaticScope)v35).getTypeOfThis();
    Object v37 = ((com.google.javascript.jscomp.TypeInference)v21).branchedFlowThrough(((com.google.javascript.rhino.Node)v25),((com.google.javascript.jscomp.FlowScope)v35));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
    Object v2 = true;
    Object v3 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v0),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v5 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
    Object v6 = true;
    Object v7 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v4),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = true;
    Object v9 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v3),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v11 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
    Object v12 = true;
    Object v13 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v10),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = true;
    Object v15 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v9),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v13),(((java.lang.Boolean)v14).booleanValue()));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = java.nio.charset.Charset.defaultCharset();
    Object v5 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v4));
    Object v6 = new com.google.javascript.jscomp.DefaultCodingConvention();
    Object v7 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7));
    Object v9 = new com.google.javascript.jscomp.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v6),((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = 54.84792226060818D;
    Object v11 = 0;
    Object v12 = 1;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v15 = java.nio.charset.Charset.defaultCharset();
    Object v16 = new java.io.PrintStream(((java.lang.String)v14),((java.nio.charset.Charset)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v16));
    Object v18 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v13),((com.google.javascript.jscomp.AbstractCompiler)v17));
    Object v19 = com.google.javascript.jscomp.PhaseOptimizer.getLoopsRun();
    Object v20 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v21 = java.nio.charset.Charset.defaultCharset();
    Object v22 = new java.io.PrintStream(((java.lang.String)v20),((java.nio.charset.Charset)v21));
    Object v23 = ((java.util.Collection)v19).equals(((java.lang.Object)v22));
    Object v24 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ControlFlowGraph)v5),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v9),((com.google.javascript.jscomp.Scope)v18),((java.util.Collection)v19));
    Object v25 = ((com.google.javascript.jscomp.TypeInference)v24).createEntryLattice();
    org.junit.Assert.assertNotNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = java.nio.charset.Charset.defaultCharset();
    Object v5 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v4));
    Object v6 = new com.google.javascript.jscomp.DefaultCodingConvention();
    Object v7 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7));
    Object v9 = new com.google.javascript.jscomp.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v6),((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = 54.84792226060818D;
    Object v11 = 0;
    Object v12 = 1;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v15 = java.nio.charset.Charset.defaultCharset();
    Object v16 = new java.io.PrintStream(((java.lang.String)v14),((java.nio.charset.Charset)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v16));
    Object v18 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v13),((com.google.javascript.jscomp.AbstractCompiler)v17));
    Object v19 = com.google.javascript.jscomp.PhaseOptimizer.getLoopsRun();
    Object v20 = com.google.javascript.jscomp.PhaseOptimizer.getLoopsRun();
    Object v21 = ((java.util.Collection)v19).retainAll(((java.util.Collection)v20));
    Object v22 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ControlFlowGraph)v5),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v9),((com.google.javascript.jscomp.Scope)v18),((java.util.Collection)v19));
    Object v23 = 54.84792226060818D;
    Object v24 = 0;
    Object v25 = 1;
    Object v26 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v23).doubleValue()),(((java.lang.Integer)v24).intValue()),(((java.lang.Integer)v25).intValue()));
    Object v27 = 54.84792226060818D;
    Object v28 = 0;
    Object v29 = 1;
    Object v30 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v27).doubleValue()),(((java.lang.Integer)v28).intValue()),(((java.lang.Integer)v29).intValue()));
    Object v31 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v32 = java.nio.charset.Charset.defaultCharset();
    Object v33 = new java.io.PrintStream(((java.lang.String)v31),((java.nio.charset.Charset)v32));
    Object v34 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v33));
    Object v35 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v30),((com.google.javascript.jscomp.AbstractCompiler)v34));
    Object v36 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v35));
    Object v37 = ((com.google.javascript.jscomp.FlowScope)v36).createChildFlowScope();
    Object v38 = ((com.google.javascript.jscomp.TypeInference)v22).branchedFlowThrough(((com.google.javascript.rhino.Node)v26),((com.google.javascript.jscomp.FlowScope)v36));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
    Object v2 = true;
    Object v3 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v0),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v5 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
    Object v6 = true;
    Object v7 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v4),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v9 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
    Object v10 = true;
    Object v11 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v8),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v13 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
    Object v14 = true;
    Object v15 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v12),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = true;
    Object v17 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v11),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = true;
    Object v19 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v7),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = true;
    Object v21 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v3),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v19),(((java.lang.Boolean)v20).booleanValue()));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE), v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
    Object v2 = true;
    Object v3 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v0),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v5 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
    Object v6 = true;
    Object v7 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v4),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v3),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = ((java.lang.Enum)v9).getDeclaringClass();
    Object v11 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v12 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
    Object v13 = true;
    Object v14 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v11),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v16 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
    Object v17 = true;
    Object v18 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v15),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = true;
    Object v20 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v14),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = true;
    Object v22 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v9),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v20),(((java.lang.Boolean)v21).booleanValue()));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE), v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = java.nio.charset.Charset.defaultCharset();
    Object v5 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v4));
    Object v6 = new com.google.javascript.jscomp.DefaultCodingConvention();
    Object v7 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7));
    Object v9 = new com.google.javascript.jscomp.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v6),((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = 54.84792226060818D;
    Object v11 = 0;
    Object v12 = 1;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v15 = java.nio.charset.Charset.defaultCharset();
    Object v16 = new java.io.PrintStream(((java.lang.String)v14),((java.nio.charset.Charset)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v16));
    Object v18 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v13),((com.google.javascript.jscomp.AbstractCompiler)v17));
    Object v19 = ((com.google.javascript.jscomp.Scope)v18).getVars();
    Object v20 = com.google.javascript.jscomp.PhaseOptimizer.getLoopsRun();
    Object v21 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ControlFlowGraph)v5),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v9),((com.google.javascript.jscomp.Scope)v18),((java.util.Collection)v20));
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = java.nio.charset.Charset.defaultCharset();
    Object v5 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v4));
    Object v6 = new com.google.javascript.jscomp.DefaultCodingConvention();
    Object v7 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7));
    Object v9 = new com.google.javascript.jscomp.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v6),((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = 54.84792226060818D;
    Object v11 = 0;
    Object v12 = 1;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v15 = java.nio.charset.Charset.defaultCharset();
    Object v16 = new java.io.PrintStream(((java.lang.String)v14),((java.nio.charset.Charset)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v16));
    Object v18 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v13),((com.google.javascript.jscomp.AbstractCompiler)v17));
    Object v19 = com.google.javascript.jscomp.PhaseOptimizer.getLoopsRun();
    Object v20 = 54.84792226060818D;
    Object v21 = 0;
    Object v22 = 1;
    Object v23 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v20).doubleValue()),(((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()));
    Object v24 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v25 = java.nio.charset.Charset.defaultCharset();
    Object v26 = new java.io.PrintStream(((java.lang.String)v24),((java.nio.charset.Charset)v25));
    Object v27 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v26));
    Object v28 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v23),((com.google.javascript.jscomp.AbstractCompiler)v27));
    Object v29 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v28));
    Object v30 = new com.google.javascript.jscomp.LinkedFlowScope(((com.google.javascript.jscomp.LinkedFlowScope)v29));
    Object v31 = ((java.util.Collection)v19).remove(((java.lang.Object)v30));
    Object v32 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ControlFlowGraph)v5),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v9),((com.google.javascript.jscomp.Scope)v18),((java.util.Collection)v19));
    org.junit.Assert.assertNotNull(v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "";
    Object v5 = -8;
    Object v6 = ((com.google.javascript.jscomp.SourceExcerptProvider)v3).getSourceRegion(((java.lang.String)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = java.nio.charset.Charset.defaultCharset();
    Object v8 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v7));
    ((com.google.javascript.jscomp.graph.Graph)v8).pushNodeAnnotations();
    Object v9 = null;
    Object v10 = new com.google.javascript.jscomp.DefaultCodingConvention();
    Object v11 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v11));
    Object v13 = new com.google.javascript.jscomp.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v10),((com.google.javascript.rhino.jstype.JSTypeRegistry)v12));
    Object v14 = 54.84792226060818D;
    Object v15 = 0;
    Object v16 = 1;
    Object v17 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v14).doubleValue()),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v19 = java.nio.charset.Charset.defaultCharset();
    Object v20 = new java.io.PrintStream(((java.lang.String)v18),((java.nio.charset.Charset)v19));
    Object v21 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v20));
    Object v22 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v17),((com.google.javascript.jscomp.AbstractCompiler)v21));
    Object v23 = com.google.javascript.jscomp.PhaseOptimizer.getLoopsRun();
    Object v24 = com.google.javascript.jscomp.PhaseOptimizer.getLoopsRun();
    Object v25 = ((java.util.Collection)v23).retainAll(((java.util.Collection)v24));
    Object v26 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ControlFlowGraph)v8),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v13),((com.google.javascript.jscomp.Scope)v22),((java.util.Collection)v23));
    org.junit.Assert.assertNotNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
    Object v2 = true;
    Object v3 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v0),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v5 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
    Object v6 = true;
    Object v7 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v4),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = true;
    Object v9 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v3),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v11 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
    Object v12 = true;
    Object v13 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v10),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v15 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
    Object v16 = true;
    Object v17 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v14),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v19 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
    Object v20 = true;
    Object v21 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v18),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = true;
    Object v23 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v17),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v21),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = true;
    Object v25 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v13),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v23),(((java.lang.Boolean)v24).booleanValue()));
    Object v26 = false;
    Object v27 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v9),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v25),(((java.lang.Boolean)v26).booleanValue()));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE), v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
    Object v2 = true;
    Object v3 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v0),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v5 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
    Object v6 = true;
    Object v7 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v4),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v3),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v11 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
    Object v12 = true;
    Object v13 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v10),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v15 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
    Object v16 = true;
    Object v17 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v14),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = true;
    Object v19 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v13),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = false;
    Object v21 = ((com.google.javascript.rhino.jstype.BooleanLiteralSet)v19).contains((((java.lang.Boolean)v20).booleanValue()));
    Object v22 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v23 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
    Object v24 = true;
    Object v25 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v22),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v23),(((java.lang.Boolean)v24).booleanValue()));
    Object v26 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v27 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
    Object v28 = true;
    Object v29 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v26),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v27),(((java.lang.Boolean)v28).booleanValue()));
    Object v30 = true;
    Object v31 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v25),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v29),(((java.lang.Boolean)v30).booleanValue()));
    Object v32 = false;
    Object v33 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v19),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v31),(((java.lang.Boolean)v32).booleanValue()));
    Object v34 = true;
    Object v35 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v9),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v33),(((java.lang.Boolean)v34).booleanValue()));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE), v35);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
    Object v2 = true;
    Object v3 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v0),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v5 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
    Object v6 = true;
    Object v7 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v4),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v3),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v11 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
    Object v12 = true;
    Object v13 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v10),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = false;
    Object v15 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v9),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v13),(((java.lang.Boolean)v14).booleanValue()));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = java.nio.charset.Charset.defaultCharset();
    Object v5 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v4));
    Object v6 = new com.google.javascript.jscomp.DefaultCodingConvention();
    Object v7 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7));
    Object v9 = new com.google.javascript.jscomp.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v6),((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = 54.84792226060818D;
    Object v11 = 0;
    Object v12 = 1;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v15 = java.nio.charset.Charset.defaultCharset();
    Object v16 = new java.io.PrintStream(((java.lang.String)v14),((java.nio.charset.Charset)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v16));
    Object v18 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v13),((com.google.javascript.jscomp.AbstractCompiler)v17));
    Object v19 = com.google.javascript.jscomp.PhaseOptimizer.getLoopsRun();
    Object v20 = ((java.util.Collection)v19).size();
    Object v21 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ControlFlowGraph)v5),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v9),((com.google.javascript.jscomp.Scope)v18),((java.util.Collection)v19));
    Object v22 = 54.84792226060818D;
    Object v23 = 0;
    Object v24 = 1;
    Object v25 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v22).doubleValue()),(((java.lang.Integer)v23).intValue()),(((java.lang.Integer)v24).intValue()));
    Object v26 = 54.84792226060818D;
    Object v27 = 0;
    Object v28 = 1;
    Object v29 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v26).doubleValue()),(((java.lang.Integer)v27).intValue()),(((java.lang.Integer)v28).intValue()));
    Object v30 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v31 = java.nio.charset.Charset.defaultCharset();
    Object v32 = new java.io.PrintStream(((java.lang.String)v30),((java.nio.charset.Charset)v31));
    Object v33 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v32));
    Object v34 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v29),((com.google.javascript.jscomp.AbstractCompiler)v33));
    Object v35 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v34));
    Object v36 = new com.google.javascript.jscomp.LinkedFlowScope(((com.google.javascript.jscomp.LinkedFlowScope)v35));
    Object v37 = ((com.google.javascript.jscomp.TypeInference)v21).branchedFlowThrough(((com.google.javascript.rhino.Node)v25),((com.google.javascript.jscomp.FlowScope)v36));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
    Object v2 = true;
    Object v3 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v0),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v5 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
    Object v6 = true;
    Object v7 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v4),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v9 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
    Object v10 = true;
    Object v11 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v8),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = true;
    Object v13 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v7),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = true;
    Object v15 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v3),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v17 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
    Object v18 = true;
    Object v19 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v16),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = false;
    Object v21 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v15),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v19),(((java.lang.Boolean)v20).booleanValue()));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE), v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = java.nio.charset.Charset.defaultCharset();
    Object v5 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v4));
    Object v6 = new com.google.javascript.jscomp.DefaultCodingConvention();
    Object v7 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7));
    Object v9 = new com.google.javascript.jscomp.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v6),((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = 54.84792226060818D;
    Object v11 = 0;
    Object v12 = 1;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v15 = java.nio.charset.Charset.defaultCharset();
    Object v16 = new java.io.PrintStream(((java.lang.String)v14),((java.nio.charset.Charset)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v16));
    Object v18 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v13),((com.google.javascript.jscomp.AbstractCompiler)v17));
    Object v19 = com.google.javascript.jscomp.PhaseOptimizer.getLoopsRun();
    Object v20 = ((java.util.Collection)v19).hashCode();
    Object v21 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ControlFlowGraph)v5),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v9),((com.google.javascript.jscomp.Scope)v18),((java.util.Collection)v19));
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = java.nio.charset.Charset.defaultCharset();
    Object v5 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v4));
    Object v6 = new com.google.javascript.jscomp.DefaultCodingConvention();
    Object v7 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7));
    Object v9 = new com.google.javascript.jscomp.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v6),((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = 54.84792226060818D;
    Object v11 = 0;
    Object v12 = 1;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v15 = java.nio.charset.Charset.defaultCharset();
    Object v16 = new java.io.PrintStream(((java.lang.String)v14),((java.nio.charset.Charset)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v16));
    Object v18 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v13),((com.google.javascript.jscomp.AbstractCompiler)v17));
    Object v19 = com.google.javascript.jscomp.PhaseOptimizer.getLoopsRun();
    Object v20 = ((java.util.Collection)v19).hashCode();
    Object v21 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ControlFlowGraph)v5),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v9),((com.google.javascript.jscomp.Scope)v18),((java.util.Collection)v19));
    Object v22 = ((com.google.javascript.jscomp.TypeInference)v21).getAssignedOuterLocalVars();
    org.junit.Assert.assertNotNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    ((com.google.javascript.jscomp.AbstractCompiler)v3).reportCodeChange();
    Object v4 = null;
    Object v5 = java.nio.charset.Charset.defaultCharset();
    Object v6 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v5));
    Object v7 = ((com.google.javascript.jscomp.graph.LinkedDirectedGraph)v6).getDirectedGraphNodes();
    Object v8 = new com.google.javascript.jscomp.DefaultCodingConvention();
    Object v9 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v9));
    Object v11 = new com.google.javascript.jscomp.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v8),((com.google.javascript.rhino.jstype.JSTypeRegistry)v10));
    Object v12 = 54.84792226060818D;
    Object v13 = 0;
    Object v14 = 1;
    Object v15 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v12).doubleValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v17 = java.nio.charset.Charset.defaultCharset();
    Object v18 = new java.io.PrintStream(((java.lang.String)v16),((java.nio.charset.Charset)v17));
    Object v19 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v18));
    Object v20 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v15),((com.google.javascript.jscomp.AbstractCompiler)v19));
    Object v21 = com.google.javascript.jscomp.PhaseOptimizer.getLoopsRun();
    Object v22 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ControlFlowGraph)v6),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v11),((com.google.javascript.jscomp.Scope)v20),((java.util.Collection)v21));
    Object v23 = 54.84792226060818D;
    Object v24 = 0;
    Object v25 = 1;
    Object v26 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v23).doubleValue()),(((java.lang.Integer)v24).intValue()),(((java.lang.Integer)v25).intValue()));
    Object v27 = ((com.google.javascript.rhino.Node)v26).cloneTree();
    Object v28 = 54.84792226060818D;
    Object v29 = 0;
    Object v30 = 1;
    Object v31 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v28).doubleValue()),(((java.lang.Integer)v29).intValue()),(((java.lang.Integer)v30).intValue()));
    Object v32 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v33 = java.nio.charset.Charset.defaultCharset();
    Object v34 = new java.io.PrintStream(((java.lang.String)v32),((java.nio.charset.Charset)v33));
    Object v35 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v34));
    Object v36 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v31),((com.google.javascript.jscomp.AbstractCompiler)v35));
    Object v37 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v36));
    Object v38 = new com.google.javascript.jscomp.LinkedFlowScope(((com.google.javascript.jscomp.LinkedFlowScope)v37));
    Object v39 = ((com.google.javascript.jscomp.TypeInference)v22).branchedFlowThrough(((com.google.javascript.rhino.Node)v26),((com.google.javascript.jscomp.FlowScope)v38));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = java.nio.charset.Charset.defaultCharset();
    Object v5 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v4));
    Object v6 = new com.google.javascript.jscomp.DefaultCodingConvention();
    Object v7 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7));
    Object v9 = new com.google.javascript.jscomp.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v6),((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = 54.84792226060818D;
    Object v11 = 0;
    Object v12 = 1;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v15 = java.nio.charset.Charset.defaultCharset();
    Object v16 = new java.io.PrintStream(((java.lang.String)v14),((java.nio.charset.Charset)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v16));
    Object v18 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v13),((com.google.javascript.jscomp.AbstractCompiler)v17));
    Object v19 = ((com.google.javascript.jscomp.Scope)v18).getVars();
    Object v20 = com.google.javascript.jscomp.PhaseOptimizer.getLoopsRun();
    Object v21 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ControlFlowGraph)v5),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v9),((com.google.javascript.jscomp.Scope)v18),((java.util.Collection)v20));
    Object v22 = 54.84792226060818D;
    Object v23 = 0;
    Object v24 = 1;
    Object v25 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v22).doubleValue()),(((java.lang.Integer)v23).intValue()),(((java.lang.Integer)v24).intValue()));
    Object v26 = 54.84792226060818D;
    Object v27 = 0;
    Object v28 = 1;
    Object v29 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v26).doubleValue()),(((java.lang.Integer)v27).intValue()),(((java.lang.Integer)v28).intValue()));
    Object v30 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v31 = java.nio.charset.Charset.defaultCharset();
    Object v32 = new java.io.PrintStream(((java.lang.String)v30),((java.nio.charset.Charset)v31));
    Object v33 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v32));
    Object v34 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v29),((com.google.javascript.jscomp.AbstractCompiler)v33));
    Object v35 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v34));
    Object v36 = ((com.google.javascript.jscomp.TypeInference)v21).branchedFlowThrough(((com.google.javascript.rhino.Node)v25),((com.google.javascript.jscomp.FlowScope)v35));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = java.nio.charset.Charset.defaultCharset();
    Object v5 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v4));
    Object v6 = new com.google.javascript.jscomp.DefaultCodingConvention();
    Object v7 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7));
    Object v9 = new com.google.javascript.jscomp.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v6),((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = 54.84792226060818D;
    Object v11 = 0;
    Object v12 = 1;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = 54.84792226060818D;
    Object v15 = 0;
    Object v16 = 1;
    Object v17 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v14).doubleValue()),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v19 = java.nio.charset.Charset.defaultCharset();
    Object v20 = new java.io.PrintStream(((java.lang.String)v18),((java.nio.charset.Charset)v19));
    Object v21 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v20));
    Object v22 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v17),((com.google.javascript.jscomp.AbstractCompiler)v21));
    Object v23 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v22));
    Object v24 = new com.google.javascript.jscomp.LinkedFlowScope(((com.google.javascript.jscomp.LinkedFlowScope)v23));
    Object v25 = false;
    Object v26 = ((com.google.javascript.jscomp.ReverseAbstractInterpreter)v9).getPreciserScopeKnowingConditionOutcome(((com.google.javascript.rhino.Node)v13),((com.google.javascript.jscomp.FlowScope)v24),(((java.lang.Boolean)v25).booleanValue()));
    Object v27 = 54.84792226060818D;
    Object v28 = 0;
    Object v29 = 1;
    Object v30 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v27).doubleValue()),(((java.lang.Integer)v28).intValue()),(((java.lang.Integer)v29).intValue()));
    Object v31 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v32 = java.nio.charset.Charset.defaultCharset();
    Object v33 = new java.io.PrintStream(((java.lang.String)v31),((java.nio.charset.Charset)v32));
    Object v34 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v33));
    Object v35 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v30),((com.google.javascript.jscomp.AbstractCompiler)v34));
    Object v36 = "";
    Object v37 = ((com.google.javascript.jscomp.Scope)v35).getSlot(((java.lang.String)v36));
    Object v38 = com.google.javascript.jscomp.PhaseOptimizer.getLoopsRun();
    Object v39 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ControlFlowGraph)v5),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v9),((com.google.javascript.jscomp.Scope)v35),((java.util.Collection)v38));
    org.junit.Assert.assertNotNull(v39);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = java.nio.charset.Charset.defaultCharset();
    Object v5 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v4));
    Object v6 = new com.google.javascript.jscomp.DefaultCodingConvention();
    Object v7 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7));
    Object v9 = new com.google.javascript.jscomp.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v6),((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = 54.84792226060818D;
    Object v11 = 0;
    Object v12 = 1;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v15 = java.nio.charset.Charset.defaultCharset();
    Object v16 = new java.io.PrintStream(((java.lang.String)v14),((java.nio.charset.Charset)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v16));
    Object v18 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v13),((com.google.javascript.jscomp.AbstractCompiler)v17));
    Object v19 = ((com.google.javascript.jscomp.Scope)v18).getVars();
    Object v20 = com.google.javascript.jscomp.PhaseOptimizer.getLoopsRun();
    Object v21 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ControlFlowGraph)v5),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v9),((com.google.javascript.jscomp.Scope)v18),((java.util.Collection)v20));
    Object v22 = 54.84792226060818D;
    Object v23 = 0;
    Object v24 = 1;
    Object v25 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v22).doubleValue()),(((java.lang.Integer)v23).intValue()),(((java.lang.Integer)v24).intValue()));
    Object v26 = false;
    ((com.google.javascript.rhino.Node)v25).setVarArgs((((java.lang.Boolean)v26).booleanValue()));
    Object v27 = null;
    Object v28 = 54.84792226060818D;
    Object v29 = 0;
    Object v30 = 1;
    Object v31 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v28).doubleValue()),(((java.lang.Integer)v29).intValue()),(((java.lang.Integer)v30).intValue()));
    Object v32 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v33 = java.nio.charset.Charset.defaultCharset();
    Object v34 = new java.io.PrintStream(((java.lang.String)v32),((java.nio.charset.Charset)v33));
    Object v35 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v34));
    Object v36 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v31),((com.google.javascript.jscomp.AbstractCompiler)v35));
    Object v37 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v36));
    Object v38 = ((com.google.javascript.jscomp.TypeInference)v21).branchedFlowThrough(((com.google.javascript.rhino.Node)v25),((com.google.javascript.jscomp.FlowScope)v37));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = java.nio.charset.Charset.defaultCharset();
    Object v5 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v4));
    Object v6 = new com.google.javascript.jscomp.DefaultCodingConvention();
    Object v7 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7));
    Object v9 = new com.google.javascript.jscomp.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v6),((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = 54.84792226060818D;
    Object v11 = 0;
    Object v12 = 1;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v15 = java.nio.charset.Charset.defaultCharset();
    Object v16 = new java.io.PrintStream(((java.lang.String)v14),((java.nio.charset.Charset)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v16));
    Object v18 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v13),((com.google.javascript.jscomp.AbstractCompiler)v17));
    Object v19 = com.google.javascript.jscomp.PhaseOptimizer.getLoopsRun();
    Object v20 = ((java.util.Collection)v19).hashCode();
    Object v21 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ControlFlowGraph)v5),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v9),((com.google.javascript.jscomp.Scope)v18),((java.util.Collection)v19));
    Object v22 = 54.84792226060818D;
    Object v23 = 0;
    Object v24 = 1;
    Object v25 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v22).doubleValue()),(((java.lang.Integer)v23).intValue()),(((java.lang.Integer)v24).intValue()));
    Object v26 = 54.84792226060818D;
    Object v27 = 0;
    Object v28 = 1;
    Object v29 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v26).doubleValue()),(((java.lang.Integer)v27).intValue()),(((java.lang.Integer)v28).intValue()));
    Object v30 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v31 = java.nio.charset.Charset.defaultCharset();
    Object v32 = new java.io.PrintStream(((java.lang.String)v30),((java.nio.charset.Charset)v31));
    Object v33 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v32));
    Object v34 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v29),((com.google.javascript.jscomp.AbstractCompiler)v33));
    Object v35 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v34));
    Object v36 = ((com.google.javascript.jscomp.TypeInference)v21).flowThrough(((com.google.javascript.rhino.Node)v25),((com.google.javascript.jscomp.FlowScope)v35));
    org.junit.Assert.assertNotNull(v36);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = java.nio.charset.Charset.defaultCharset();
    Object v5 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v4));
    Object v6 = new com.google.javascript.jscomp.DefaultCodingConvention();
    Object v7 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7));
    Object v9 = new com.google.javascript.jscomp.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v6),((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = 54.84792226060818D;
    Object v11 = 0;
    Object v12 = 1;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v15 = java.nio.charset.Charset.defaultCharset();
    Object v16 = new java.io.PrintStream(((java.lang.String)v14),((java.nio.charset.Charset)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v16));
    Object v18 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v13),((com.google.javascript.jscomp.AbstractCompiler)v17));
    Object v19 = com.google.javascript.jscomp.PhaseOptimizer.getLoopsRun();
    Object v20 = ((java.util.Collection)v19).size();
    Object v21 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ControlFlowGraph)v5),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v9),((com.google.javascript.jscomp.Scope)v18),((java.util.Collection)v19));
    Object v22 = 54.84792226060818D;
    Object v23 = 0;
    Object v24 = 1;
    Object v25 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v22).doubleValue()),(((java.lang.Integer)v23).intValue()),(((java.lang.Integer)v24).intValue()));
    Object v26 = 54.84792226060818D;
    Object v27 = 0;
    Object v28 = 1;
    Object v29 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v26).doubleValue()),(((java.lang.Integer)v27).intValue()),(((java.lang.Integer)v28).intValue()));
    Object v30 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v31 = java.nio.charset.Charset.defaultCharset();
    Object v32 = new java.io.PrintStream(((java.lang.String)v30),((java.nio.charset.Charset)v31));
    Object v33 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v32));
    Object v34 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v29),((com.google.javascript.jscomp.AbstractCompiler)v33));
    Object v35 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v34));
    Object v36 = ((com.google.javascript.jscomp.TypeInference)v21).flowThrough(((com.google.javascript.rhino.Node)v25),((com.google.javascript.jscomp.FlowScope)v35));
    org.junit.Assert.assertNotNull(v36);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getCodingConvention();
    Object v5 = java.nio.charset.Charset.defaultCharset();
    Object v6 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v5));
    Object v7 = new com.google.javascript.jscomp.DefaultCodingConvention();
    Object v8 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v8));
    Object v10 = new com.google.javascript.jscomp.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v7),((com.google.javascript.rhino.jstype.JSTypeRegistry)v9));
    Object v11 = 54.84792226060818D;
    Object v12 = 0;
    Object v13 = 1;
    Object v14 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v16 = java.nio.charset.Charset.defaultCharset();
    Object v17 = new java.io.PrintStream(((java.lang.String)v15),((java.nio.charset.Charset)v16));
    Object v18 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v17));
    Object v19 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v14),((com.google.javascript.jscomp.AbstractCompiler)v18));
    Object v20 = com.google.javascript.jscomp.PhaseOptimizer.getLoopsRun();
    Object v21 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ControlFlowGraph)v6),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v10),((com.google.javascript.jscomp.Scope)v19),((java.util.Collection)v20));
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = java.nio.charset.Charset.defaultCharset();
    Object v5 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v4));
    Object v6 = new com.google.javascript.jscomp.DefaultCodingConvention();
    Object v7 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7));
    Object v9 = new com.google.javascript.jscomp.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v6),((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = 54.84792226060818D;
    Object v11 = 0;
    Object v12 = 1;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v15 = java.nio.charset.Charset.defaultCharset();
    Object v16 = new java.io.PrintStream(((java.lang.String)v14),((java.nio.charset.Charset)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v16));
    Object v18 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v13),((com.google.javascript.jscomp.AbstractCompiler)v17));
    Object v19 = com.google.javascript.jscomp.PhaseOptimizer.getLoopsRun();
    Object v20 = ((java.util.Collection)v19).hashCode();
    Object v21 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ControlFlowGraph)v5),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v9),((com.google.javascript.jscomp.Scope)v18),((java.util.Collection)v19));
    Object v22 = ((com.google.javascript.jscomp.TypeInference)v21).createEntryLattice();
    org.junit.Assert.assertNotNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
    Object v2 = true;
    Object v3 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v0),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v5 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
    Object v6 = true;
    Object v7 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v4),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = true;
    Object v9 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v3),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v11 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
    Object v12 = true;
    Object v13 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v10),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = true;
    Object v15 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v9),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v17 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
    Object v18 = true;
    Object v19 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v16),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v21 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
    Object v22 = true;
    Object v23 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v20),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v21),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = false;
    Object v25 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v19),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v23),(((java.lang.Boolean)v24).booleanValue()));
    Object v26 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v27 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
    Object v28 = true;
    Object v29 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v26),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v27),(((java.lang.Boolean)v28).booleanValue()));
    Object v30 = false;
    Object v31 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v25),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v29),(((java.lang.Boolean)v30).booleanValue()));
    Object v32 = false;
    Object v33 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v15),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v31),(((java.lang.Boolean)v32).booleanValue()));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE), v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = java.nio.charset.Charset.defaultCharset();
    Object v5 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v4));
    Object v6 = new com.google.javascript.jscomp.DefaultCodingConvention();
    Object v7 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7));
    Object v9 = new com.google.javascript.jscomp.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v6),((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = 54.84792226060818D;
    Object v11 = 0;
    Object v12 = 1;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v15 = java.nio.charset.Charset.defaultCharset();
    Object v16 = new java.io.PrintStream(((java.lang.String)v14),((java.nio.charset.Charset)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v16));
    Object v18 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v13),((com.google.javascript.jscomp.AbstractCompiler)v17));
    Object v19 = "";
    Object v20 = ((com.google.javascript.jscomp.Scope)v18).getSlot(((java.lang.String)v19));
    Object v21 = com.google.javascript.jscomp.PhaseOptimizer.getLoopsRun();
    Object v22 = ((java.util.Collection)v21).toArray();
    Object v23 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ControlFlowGraph)v5),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v9),((com.google.javascript.jscomp.Scope)v18),((java.util.Collection)v21));
    org.junit.Assert.assertNotNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
    Object v2 = true;
    Object v3 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v0),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v5 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
    Object v6 = true;
    Object v7 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v4),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v3),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v11 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
    Object v12 = true;
    Object v13 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v10),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = false;
    Object v15 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v9),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v17 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
    Object v18 = true;
    Object v19 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v16),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = ((java.lang.Enum)v15).compareTo(((java.lang.Enum)v19));
    Object v21 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v22 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
    Object v23 = true;
    Object v24 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v21),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v22),(((java.lang.Boolean)v23).booleanValue()));
    Object v25 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v26 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
    Object v27 = true;
    Object v28 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v25),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v26),(((java.lang.Boolean)v27).booleanValue()));
    Object v29 = false;
    Object v30 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v24),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v28),(((java.lang.Boolean)v29).booleanValue()));
    Object v31 = false;
    Object v32 = ((com.google.javascript.rhino.jstype.BooleanLiteralSet)v30).contains((((java.lang.Boolean)v31).booleanValue()));
    Object v33 = false;
    Object v34 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v15),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v30),(((java.lang.Boolean)v33).booleanValue()));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE), v34);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = java.nio.charset.Charset.defaultCharset();
    Object v5 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v4));
    Object v6 = new com.google.javascript.jscomp.DefaultCodingConvention();
    Object v7 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7));
    Object v9 = new com.google.javascript.jscomp.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v6),((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = 54.84792226060818D;
    Object v11 = 0;
    Object v12 = 1;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v15 = java.nio.charset.Charset.defaultCharset();
    Object v16 = new java.io.PrintStream(((java.lang.String)v14),((java.nio.charset.Charset)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v16));
    Object v18 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v13),((com.google.javascript.jscomp.AbstractCompiler)v17));
    Object v19 = com.google.javascript.jscomp.PhaseOptimizer.getLoopsRun();
    Object v20 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v21 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
    Object v22 = true;
    Object v23 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v20),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v21),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = java.util.function.Predicate.isEqual(((java.lang.Object)v23));
    Object v25 = ((java.util.Collection)v19).removeIf(((java.util.function.Predicate)v24));
    Object v26 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ControlFlowGraph)v5),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v9),((com.google.javascript.jscomp.Scope)v18),((java.util.Collection)v19));
    org.junit.Assert.assertNotNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = java.nio.charset.Charset.defaultCharset();
    Object v5 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v4));
    Object v6 = new com.google.javascript.jscomp.DefaultCodingConvention();
    Object v7 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7));
    Object v9 = new com.google.javascript.jscomp.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v6),((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = 54.84792226060818D;
    Object v11 = 0;
    Object v12 = 1;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v15 = java.nio.charset.Charset.defaultCharset();
    Object v16 = new java.io.PrintStream(((java.lang.String)v14),((java.nio.charset.Charset)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v16));
    Object v18 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v13),((com.google.javascript.jscomp.AbstractCompiler)v17));
    Object v19 = ((com.google.javascript.jscomp.Scope)v18).getVarCount();
    Object v20 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ControlFlowGraph)v5),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v9),((com.google.javascript.jscomp.Scope)v18));
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
    Object v2 = true;
    Object v3 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v0),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v5 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
    Object v6 = true;
    Object v7 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v4),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v3),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v11 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
    Object v12 = true;
    Object v13 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v10),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = false;
    Object v15 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v9),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v17 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
    Object v18 = true;
    Object v19 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v16),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v21 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
    Object v22 = true;
    Object v23 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v20),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v21),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v25 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
    Object v26 = true;
    Object v27 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v24),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v25),(((java.lang.Boolean)v26).booleanValue()));
    Object v28 = true;
    Object v29 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v23),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v27),(((java.lang.Boolean)v28).booleanValue()));
    Object v30 = true;
    Object v31 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v19),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v29),(((java.lang.Boolean)v30).booleanValue()));
    Object v32 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v33 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
    Object v34 = true;
    Object v35 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v32),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v33),(((java.lang.Boolean)v34).booleanValue()));
    Object v36 = false;
    Object v37 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v31),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v35),(((java.lang.Boolean)v36).booleanValue()));
    Object v38 = true;
    Object v39 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v15),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v37),(((java.lang.Boolean)v38).booleanValue()));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE), v39);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = java.nio.charset.Charset.defaultCharset();
    Object v5 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v4));
    Object v6 = new com.google.javascript.jscomp.DefaultCodingConvention();
    Object v7 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7));
    Object v9 = new com.google.javascript.jscomp.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v6),((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = 54.84792226060818D;
    Object v11 = 0;
    Object v12 = 1;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v15 = java.nio.charset.Charset.defaultCharset();
    Object v16 = new java.io.PrintStream(((java.lang.String)v14),((java.nio.charset.Charset)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v16));
    Object v18 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v13),((com.google.javascript.jscomp.AbstractCompiler)v17));
    Object v19 = "";
    Object v20 = ((com.google.javascript.jscomp.Scope)v18).getSlot(((java.lang.String)v19));
    Object v21 = com.google.javascript.jscomp.PhaseOptimizer.getLoopsRun();
    Object v22 = ((java.util.Collection)v21).toArray();
    Object v23 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ControlFlowGraph)v5),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v9),((com.google.javascript.jscomp.Scope)v18),((java.util.Collection)v21));
    Object v24 = ((com.google.javascript.jscomp.TypeInference)v23).createEntryLattice();
    org.junit.Assert.assertNotNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = java.nio.charset.Charset.defaultCharset();
    Object v5 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v4));
    Object v6 = new com.google.javascript.jscomp.DefaultCodingConvention();
    Object v7 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7));
    Object v9 = new com.google.javascript.jscomp.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v6),((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = 54.84792226060818D;
    Object v11 = 0;
    Object v12 = 1;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = 54.84792226060818D;
    Object v15 = 0;
    Object v16 = 1;
    Object v17 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v14).doubleValue()),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v19 = java.nio.charset.Charset.defaultCharset();
    Object v20 = new java.io.PrintStream(((java.lang.String)v18),((java.nio.charset.Charset)v19));
    Object v21 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v20));
    Object v22 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v17),((com.google.javascript.jscomp.AbstractCompiler)v21));
    Object v23 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v22));
    Object v24 = new com.google.javascript.jscomp.LinkedFlowScope(((com.google.javascript.jscomp.LinkedFlowScope)v23));
    Object v25 = true;
    Object v26 = ((com.google.javascript.jscomp.ReverseAbstractInterpreter)v9).getPreciserScopeKnowingConditionOutcome(((com.google.javascript.rhino.Node)v13),((com.google.javascript.jscomp.FlowScope)v24),(((java.lang.Boolean)v25).booleanValue()));
    Object v27 = 54.84792226060818D;
    Object v28 = 0;
    Object v29 = 1;
    Object v30 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v27).doubleValue()),(((java.lang.Integer)v28).intValue()),(((java.lang.Integer)v29).intValue()));
    Object v31 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v32 = java.nio.charset.Charset.defaultCharset();
    Object v33 = new java.io.PrintStream(((java.lang.String)v31),((java.nio.charset.Charset)v32));
    Object v34 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v33));
    Object v35 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v30),((com.google.javascript.jscomp.AbstractCompiler)v34));
    Object v36 = "null";
    Object v37 = ((com.google.javascript.jscomp.Scope)v35).getVar(((java.lang.String)v36));
    Object v38 = com.google.javascript.jscomp.PhaseOptimizer.getLoopsRun();
    Object v39 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ControlFlowGraph)v5),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v9),((com.google.javascript.jscomp.Scope)v35),((java.util.Collection)v38));
    org.junit.Assert.assertNotNull(v39);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = java.nio.charset.Charset.defaultCharset();
    Object v5 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v4));
    Object v6 = new com.google.javascript.jscomp.DefaultCodingConvention();
    Object v7 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7));
    Object v9 = new com.google.javascript.jscomp.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v6),((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = 54.84792226060818D;
    Object v11 = 0;
    Object v12 = 1;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v15 = java.nio.charset.Charset.defaultCharset();
    Object v16 = new java.io.PrintStream(((java.lang.String)v14),((java.nio.charset.Charset)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v16));
    Object v18 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v13),((com.google.javascript.jscomp.AbstractCompiler)v17));
    Object v19 = "";
    Object v20 = ((com.google.javascript.jscomp.Scope)v18).getSlot(((java.lang.String)v19));
    Object v21 = com.google.javascript.jscomp.PhaseOptimizer.getLoopsRun();
    Object v22 = ((java.util.Collection)v21).toArray();
    Object v23 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ControlFlowGraph)v5),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v9),((com.google.javascript.jscomp.Scope)v18),((java.util.Collection)v21));
    Object v24 = 54.84792226060818D;
    Object v25 = 0;
    Object v26 = 1;
    Object v27 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v24).doubleValue()),(((java.lang.Integer)v25).intValue()),(((java.lang.Integer)v26).intValue()));
    Object v28 = 54.84792226060818D;
    Object v29 = 0;
    Object v30 = 1;
    Object v31 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v28).doubleValue()),(((java.lang.Integer)v29).intValue()),(((java.lang.Integer)v30).intValue()));
    Object v32 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v33 = java.nio.charset.Charset.defaultCharset();
    Object v34 = new java.io.PrintStream(((java.lang.String)v32),((java.nio.charset.Charset)v33));
    Object v35 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v34));
    Object v36 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v31),((com.google.javascript.jscomp.AbstractCompiler)v35));
    Object v37 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v36));
    Object v38 = ((com.google.javascript.jscomp.TypeInference)v23).flowThrough(((com.google.javascript.rhino.Node)v27),((com.google.javascript.jscomp.FlowScope)v37));
    org.junit.Assert.assertNotNull(v38);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = java.nio.charset.Charset.defaultCharset();
    Object v5 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v4));
    Object v6 = new com.google.javascript.jscomp.DefaultCodingConvention();
    Object v7 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7));
    Object v9 = new com.google.javascript.jscomp.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v6),((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = 54.84792226060818D;
    Object v11 = 0;
    Object v12 = 1;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v15 = java.nio.charset.Charset.defaultCharset();
    Object v16 = new java.io.PrintStream(((java.lang.String)v14),((java.nio.charset.Charset)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v16));
    Object v18 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v13),((com.google.javascript.jscomp.AbstractCompiler)v17));
    Object v19 = com.google.javascript.jscomp.PhaseOptimizer.getLoopsRun();
    Object v20 = ((java.util.Collection)v19).hashCode();
    Object v21 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ControlFlowGraph)v5),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v9),((com.google.javascript.jscomp.Scope)v18),((java.util.Collection)v19));
    Object v22 = 54.84792226060818D;
    Object v23 = 0;
    Object v24 = 1;
    Object v25 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v22).doubleValue()),(((java.lang.Integer)v23).intValue()),(((java.lang.Integer)v24).intValue()));
    Object v26 = 54.84792226060818D;
    Object v27 = 0;
    Object v28 = 1;
    Object v29 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v26).doubleValue()),(((java.lang.Integer)v27).intValue()),(((java.lang.Integer)v28).intValue()));
    Object v30 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v31 = java.nio.charset.Charset.defaultCharset();
    Object v32 = new java.io.PrintStream(((java.lang.String)v30),((java.nio.charset.Charset)v31));
    Object v33 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v32));
    Object v34 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v29),((com.google.javascript.jscomp.AbstractCompiler)v33));
    Object v35 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v34));
    Object v36 = new com.google.javascript.jscomp.LinkedFlowScope(((com.google.javascript.jscomp.LinkedFlowScope)v35));
    Object v37 = ((com.google.javascript.jscomp.TypeInference)v21).branchedFlowThrough(((com.google.javascript.rhino.Node)v25),((com.google.javascript.jscomp.FlowScope)v36));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
    Object v2 = true;
    Object v3 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v0),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v5 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
    Object v6 = true;
    Object v7 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v4),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v3),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v11 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
    Object v12 = true;
    Object v13 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v10),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = false;
    Object v15 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v9),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v17 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
    Object v18 = true;
    Object v19 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v16),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v21 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
    Object v22 = true;
    Object v23 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v20),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v21),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v25 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
    Object v26 = true;
    Object v27 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v24),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v25),(((java.lang.Boolean)v26).booleanValue()));
    Object v28 = true;
    Object v29 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v23),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v27),(((java.lang.Boolean)v28).booleanValue()));
    Object v30 = true;
    Object v31 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v19),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v29),(((java.lang.Boolean)v30).booleanValue()));
    Object v32 = false;
    Object v33 = ((com.google.javascript.rhino.jstype.BooleanLiteralSet)v31).contains((((java.lang.Boolean)v32).booleanValue()));
    Object v34 = false;
    Object v35 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v15),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v31),(((java.lang.Boolean)v34).booleanValue()));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE), v35);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = java.nio.charset.Charset.defaultCharset();
    Object v5 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v4));
    Object v6 = new com.google.javascript.jscomp.DefaultCodingConvention();
    Object v7 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7));
    Object v9 = new com.google.javascript.jscomp.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v6),((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = 54.84792226060818D;
    Object v11 = 0;
    Object v12 = 1;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = 54.84792226060818D;
    Object v15 = 0;
    Object v16 = 1;
    Object v17 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v14).doubleValue()),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v19 = java.nio.charset.Charset.defaultCharset();
    Object v20 = new java.io.PrintStream(((java.lang.String)v18),((java.nio.charset.Charset)v19));
    Object v21 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v20));
    Object v22 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v17),((com.google.javascript.jscomp.AbstractCompiler)v21));
    Object v23 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v22));
    Object v24 = true;
    Object v25 = ((com.google.javascript.jscomp.ReverseAbstractInterpreter)v9).getPreciserScopeKnowingConditionOutcome(((com.google.javascript.rhino.Node)v13),((com.google.javascript.jscomp.FlowScope)v23),(((java.lang.Boolean)v24).booleanValue()));
    Object v26 = 54.84792226060818D;
    Object v27 = 0;
    Object v28 = 1;
    Object v29 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v26).doubleValue()),(((java.lang.Integer)v27).intValue()),(((java.lang.Integer)v28).intValue()));
    Object v30 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v31 = java.nio.charset.Charset.defaultCharset();
    Object v32 = new java.io.PrintStream(((java.lang.String)v30),((java.nio.charset.Charset)v31));
    Object v33 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v32));
    Object v34 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v29),((com.google.javascript.jscomp.AbstractCompiler)v33));
    Object v35 = com.google.javascript.jscomp.PhaseOptimizer.getLoopsRun();
    Object v36 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ControlFlowGraph)v5),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v9),((com.google.javascript.jscomp.Scope)v34),((java.util.Collection)v35));
    org.junit.Assert.assertNotNull(v36);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = java.nio.charset.Charset.defaultCharset();
    Object v5 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v4));
    Object v6 = new com.google.javascript.jscomp.DefaultCodingConvention();
    Object v7 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7));
    Object v9 = new com.google.javascript.jscomp.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v6),((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = 54.84792226060818D;
    Object v11 = 0;
    Object v12 = 1;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v15 = java.nio.charset.Charset.defaultCharset();
    Object v16 = new java.io.PrintStream(((java.lang.String)v14),((java.nio.charset.Charset)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v16));
    Object v18 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v13),((com.google.javascript.jscomp.AbstractCompiler)v17));
    Object v19 = "";
    Object v20 = ((com.google.javascript.jscomp.Scope)v18).getSlot(((java.lang.String)v19));
    Object v21 = com.google.javascript.jscomp.PhaseOptimizer.getLoopsRun();
    Object v22 = ((java.util.Collection)v21).toArray();
    Object v23 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ControlFlowGraph)v5),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v9),((com.google.javascript.jscomp.Scope)v18),((java.util.Collection)v21));
    Object v24 = 54.84792226060818D;
    Object v25 = 0;
    Object v26 = 1;
    Object v27 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v24).doubleValue()),(((java.lang.Integer)v25).intValue()),(((java.lang.Integer)v26).intValue()));
    Object v28 = 54.84792226060818D;
    Object v29 = 0;
    Object v30 = 1;
    Object v31 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v28).doubleValue()),(((java.lang.Integer)v29).intValue()),(((java.lang.Integer)v30).intValue()));
    Object v32 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v33 = java.nio.charset.Charset.defaultCharset();
    Object v34 = new java.io.PrintStream(((java.lang.String)v32),((java.nio.charset.Charset)v33));
    Object v35 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v34));
    Object v36 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v31),((com.google.javascript.jscomp.AbstractCompiler)v35));
    Object v37 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v36));
    Object v38 = ((com.google.javascript.jscomp.TypeInference)v23).branchedFlowThrough(((com.google.javascript.rhino.Node)v27),((com.google.javascript.jscomp.FlowScope)v37));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = java.nio.charset.Charset.defaultCharset();
    Object v5 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v4));
    Object v6 = new com.google.javascript.jscomp.DefaultCodingConvention();
    Object v7 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7));
    Object v9 = new com.google.javascript.jscomp.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v6),((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = 54.84792226060818D;
    Object v11 = 0;
    Object v12 = 1;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v15 = java.nio.charset.Charset.defaultCharset();
    Object v16 = new java.io.PrintStream(((java.lang.String)v14),((java.nio.charset.Charset)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v16));
    Object v18 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v13),((com.google.javascript.jscomp.AbstractCompiler)v17));
    Object v19 = com.google.javascript.jscomp.PhaseOptimizer.getLoopsRun();
    Object v20 = 54.84792226060818D;
    Object v21 = 0;
    Object v22 = 1;
    Object v23 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v20).doubleValue()),(((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()));
    Object v24 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v25 = java.nio.charset.Charset.defaultCharset();
    Object v26 = new java.io.PrintStream(((java.lang.String)v24),((java.nio.charset.Charset)v25));
    Object v27 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v26));
    Object v28 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v23),((com.google.javascript.jscomp.AbstractCompiler)v27));
    Object v29 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v28));
    Object v30 = new com.google.javascript.jscomp.LinkedFlowScope(((com.google.javascript.jscomp.LinkedFlowScope)v29));
    Object v31 = ((java.util.Collection)v19).remove(((java.lang.Object)v30));
    Object v32 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ControlFlowGraph)v5),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v9),((com.google.javascript.jscomp.Scope)v18),((java.util.Collection)v19));
    Object v33 = ((com.google.javascript.jscomp.TypeInference)v32).createInitialEstimateLattice();
    org.junit.Assert.assertNotNull(v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = java.nio.charset.Charset.defaultCharset();
    Object v5 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v4));
    Object v6 = new com.google.javascript.jscomp.DefaultCodingConvention();
    Object v7 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7));
    Object v9 = new com.google.javascript.jscomp.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v6),((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = 54.84792226060818D;
    Object v11 = 0;
    Object v12 = 1;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v15 = java.nio.charset.Charset.defaultCharset();
    Object v16 = new java.io.PrintStream(((java.lang.String)v14),((java.nio.charset.Charset)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v16));
    Object v18 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v13),((com.google.javascript.jscomp.AbstractCompiler)v17));
    Object v19 = com.google.javascript.jscomp.PhaseOptimizer.getLoopsRun();
    Object v20 = com.google.javascript.jscomp.PhaseOptimizer.getLoopsRun();
    Object v21 = ((java.util.Collection)v19).retainAll(((java.util.Collection)v20));
    Object v22 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ControlFlowGraph)v5),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v9),((com.google.javascript.jscomp.Scope)v18),((java.util.Collection)v19));
    Object v23 = 54.84792226060818D;
    Object v24 = 0;
    Object v25 = 1;
    Object v26 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v23).doubleValue()),(((java.lang.Integer)v24).intValue()),(((java.lang.Integer)v25).intValue()));
    Object v27 = 54.84792226060818D;
    Object v28 = 0;
    Object v29 = 1;
    Object v30 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v27).doubleValue()),(((java.lang.Integer)v28).intValue()),(((java.lang.Integer)v29).intValue()));
    Object v31 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v32 = java.nio.charset.Charset.defaultCharset();
    Object v33 = new java.io.PrintStream(((java.lang.String)v31),((java.nio.charset.Charset)v32));
    Object v34 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v33));
    Object v35 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v30),((com.google.javascript.jscomp.AbstractCompiler)v34));
    Object v36 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v35));
    Object v37 = new com.google.javascript.jscomp.LinkedFlowScope(((com.google.javascript.jscomp.LinkedFlowScope)v36));
    Object v38 = ((com.google.javascript.jscomp.TypeInference)v22).branchedFlowThrough(((com.google.javascript.rhino.Node)v26),((com.google.javascript.jscomp.FlowScope)v37));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
    Object v2 = true;
    Object v3 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v0),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v5 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
    Object v6 = true;
    Object v7 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v4),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = true;
    Object v9 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v3),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v11 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
    Object v12 = true;
    Object v13 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v10),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = false;
    Object v15 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v9),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v13),(((java.lang.Boolean)v14).booleanValue()));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
    Object v2 = true;
    Object v3 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v0),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v5 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
    Object v6 = true;
    Object v7 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v4),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v9 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
    Object v10 = true;
    Object v11 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v8),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = true;
    Object v13 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v7),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = true;
    Object v15 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v3),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v17 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
    Object v18 = true;
    Object v19 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v16),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = false;
    Object v21 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v15),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v23 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
    Object v24 = true;
    Object v25 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v22),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v23),(((java.lang.Boolean)v24).booleanValue()));
    Object v26 = true;
    Object v27 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v21),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v25),(((java.lang.Boolean)v26).booleanValue()));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE), v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = java.nio.charset.Charset.defaultCharset();
    Object v5 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v4));
    Object v6 = new com.google.javascript.jscomp.DefaultCodingConvention();
    Object v7 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7));
    Object v9 = new com.google.javascript.jscomp.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v6),((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = 54.84792226060818D;
    Object v11 = 0;
    Object v12 = 1;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v15 = java.nio.charset.Charset.defaultCharset();
    Object v16 = new java.io.PrintStream(((java.lang.String)v14),((java.nio.charset.Charset)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v16));
    Object v18 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v13),((com.google.javascript.jscomp.AbstractCompiler)v17));
    Object v19 = com.google.javascript.jscomp.PhaseOptimizer.getLoopsRun();
    Object v20 = ((java.util.Collection)v19).size();
    Object v21 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ControlFlowGraph)v5),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v9),((com.google.javascript.jscomp.Scope)v18),((java.util.Collection)v19));
    Object v22 = 54.84792226060818D;
    Object v23 = 0;
    Object v24 = 1;
    Object v25 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v22).doubleValue()),(((java.lang.Integer)v23).intValue()),(((java.lang.Integer)v24).intValue()));
    Object v26 = 54.84792226060818D;
    Object v27 = 0;
    Object v28 = 1;
    Object v29 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v26).doubleValue()),(((java.lang.Integer)v27).intValue()),(((java.lang.Integer)v28).intValue()));
    Object v30 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v31 = java.nio.charset.Charset.defaultCharset();
    Object v32 = new java.io.PrintStream(((java.lang.String)v30),((java.nio.charset.Charset)v31));
    Object v33 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v32));
    Object v34 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v29),((com.google.javascript.jscomp.AbstractCompiler)v33));
    Object v35 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v34));
    Object v36 = new com.google.javascript.jscomp.LinkedFlowScope(((com.google.javascript.jscomp.LinkedFlowScope)v35));
    Object v37 = ((com.google.javascript.jscomp.TypeInference)v21).flowThrough(((com.google.javascript.rhino.Node)v25),((com.google.javascript.jscomp.FlowScope)v36));
    org.junit.Assert.assertNotNull(v37);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
    Object v2 = true;
    Object v3 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v0),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v5 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
    Object v6 = true;
    Object v7 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v4),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v3),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v11 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
    Object v12 = true;
    Object v13 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v10),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = false;
    Object v15 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v9),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v17 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
    Object v18 = true;
    Object v19 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v16),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v21 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
    Object v22 = true;
    Object v23 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v20),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v21),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v25 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
    Object v26 = true;
    Object v27 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v24),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v25),(((java.lang.Boolean)v26).booleanValue()));
    Object v28 = true;
    Object v29 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v23),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v27),(((java.lang.Boolean)v28).booleanValue()));
    Object v30 = true;
    Object v31 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v19),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v29),(((java.lang.Boolean)v30).booleanValue()));
    Object v32 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v33 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
    Object v34 = true;
    Object v35 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v32),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v33),(((java.lang.Boolean)v34).booleanValue()));
    Object v36 = false;
    Object v37 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v31),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v35),(((java.lang.Boolean)v36).booleanValue()));
    Object v38 = false;
    Object v39 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v15),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v37),(((java.lang.Boolean)v38).booleanValue()));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE), v39);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = java.nio.charset.Charset.defaultCharset();
    Object v5 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v4));
    Object v6 = new com.google.javascript.jscomp.DefaultCodingConvention();
    Object v7 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7));
    Object v9 = new com.google.javascript.jscomp.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v6),((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = 54.84792226060818D;
    Object v11 = 0;
    Object v12 = 1;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = 54.84792226060818D;
    Object v15 = 0;
    Object v16 = 1;
    Object v17 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v14).doubleValue()),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v19 = java.nio.charset.Charset.defaultCharset();
    Object v20 = new java.io.PrintStream(((java.lang.String)v18),((java.nio.charset.Charset)v19));
    Object v21 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v20));
    Object v22 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v17),((com.google.javascript.jscomp.AbstractCompiler)v21));
    Object v23 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v22));
    Object v24 = true;
    Object v25 = ((com.google.javascript.jscomp.ReverseAbstractInterpreter)v9).getPreciserScopeKnowingConditionOutcome(((com.google.javascript.rhino.Node)v13),((com.google.javascript.jscomp.FlowScope)v23),(((java.lang.Boolean)v24).booleanValue()));
    Object v26 = 54.84792226060818D;
    Object v27 = 0;
    Object v28 = 1;
    Object v29 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v26).doubleValue()),(((java.lang.Integer)v27).intValue()),(((java.lang.Integer)v28).intValue()));
    Object v30 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v31 = java.nio.charset.Charset.defaultCharset();
    Object v32 = new java.io.PrintStream(((java.lang.String)v30),((java.nio.charset.Charset)v31));
    Object v33 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v32));
    Object v34 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v29),((com.google.javascript.jscomp.AbstractCompiler)v33));
    Object v35 = com.google.javascript.jscomp.PhaseOptimizer.getLoopsRun();
    Object v36 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ControlFlowGraph)v5),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v9),((com.google.javascript.jscomp.Scope)v34),((java.util.Collection)v35));
    Object v37 = ((com.google.javascript.jscomp.TypeInference)v36).createInitialEstimateLattice();
    org.junit.Assert.assertNotNull(v37);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
    Object v2 = true;
    Object v3 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v0),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v5 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
    Object v6 = true;
    Object v7 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v4),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v3),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v11 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
    Object v12 = true;
    Object v13 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v10),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = false;
    Object v15 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v9),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v17 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
    Object v18 = true;
    Object v19 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v16),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = false;
    Object v21 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v15),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v19),(((java.lang.Boolean)v20).booleanValue()));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE), v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
    Object v2 = true;
    Object v3 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v0),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v5 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
    Object v6 = true;
    Object v7 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v4),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = true;
    Object v9 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v3),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v11 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
    Object v12 = true;
    Object v13 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v10),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = false;
    Object v15 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v9),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v17 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
    Object v18 = true;
    Object v19 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v16),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v21 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
    Object v22 = true;
    Object v23 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v20),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v21),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = false;
    Object v25 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v19),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v23),(((java.lang.Boolean)v24).booleanValue()));
    Object v26 = false;
    Object v27 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v15),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v25),(((java.lang.Boolean)v26).booleanValue()));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE), v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = java.nio.charset.Charset.defaultCharset();
    Object v5 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v4));
    Object v6 = new com.google.javascript.jscomp.DefaultCodingConvention();
    Object v7 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7));
    Object v9 = new com.google.javascript.jscomp.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v6),((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = 54.84792226060818D;
    Object v11 = 0;
    Object v12 = 1;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v15 = java.nio.charset.Charset.defaultCharset();
    Object v16 = new java.io.PrintStream(((java.lang.String)v14),((java.nio.charset.Charset)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v16));
    Object v18 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v13),((com.google.javascript.jscomp.AbstractCompiler)v17));
    Object v19 = ((com.google.javascript.jscomp.Scope)v18).getVarCount();
    Object v20 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ControlFlowGraph)v5),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v9),((com.google.javascript.jscomp.Scope)v18));
    Object v21 = 54.84792226060818D;
    Object v22 = 0;
    Object v23 = 1;
    Object v24 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v21).doubleValue()),(((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()));
    Object v25 = 54.84792226060818D;
    Object v26 = 0;
    Object v27 = 1;
    Object v28 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v25).doubleValue()),(((java.lang.Integer)v26).intValue()),(((java.lang.Integer)v27).intValue()));
    Object v29 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v30 = java.nio.charset.Charset.defaultCharset();
    Object v31 = new java.io.PrintStream(((java.lang.String)v29),((java.nio.charset.Charset)v30));
    Object v32 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v31));
    Object v33 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v28),((com.google.javascript.jscomp.AbstractCompiler)v32));
    Object v34 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v33));
    Object v35 = ((com.google.javascript.jscomp.TypeInference)v20).branchedFlowThrough(((com.google.javascript.rhino.Node)v24),((com.google.javascript.jscomp.FlowScope)v34));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = java.nio.charset.Charset.defaultCharset();
    Object v5 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v4));
    ((com.google.javascript.jscomp.graph.Graph)v5).clearNodeAnnotations();
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.DefaultCodingConvention();
    Object v8 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v8));
    Object v10 = new com.google.javascript.jscomp.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v7),((com.google.javascript.rhino.jstype.JSTypeRegistry)v9));
    Object v11 = 54.84792226060818D;
    Object v12 = 0;
    Object v13 = 1;
    Object v14 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v16 = java.nio.charset.Charset.defaultCharset();
    Object v17 = new java.io.PrintStream(((java.lang.String)v15),((java.nio.charset.Charset)v16));
    Object v18 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v17));
    Object v19 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v14),((com.google.javascript.jscomp.AbstractCompiler)v18));
    Object v20 = ((com.google.javascript.jscomp.Scope)v19).getVarCount();
    Object v21 = com.google.javascript.jscomp.PhaseOptimizer.getLoopsRun();
    Object v22 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ControlFlowGraph)v5),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v10),((com.google.javascript.jscomp.Scope)v19),((java.util.Collection)v21));
    org.junit.Assert.assertNotNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getCodingConvention();
    Object v5 = java.nio.charset.Charset.defaultCharset();
    Object v6 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v5));
    Object v7 = new com.google.javascript.jscomp.DefaultCodingConvention();
    Object v8 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v8));
    Object v10 = new com.google.javascript.jscomp.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v7),((com.google.javascript.rhino.jstype.JSTypeRegistry)v9));
    Object v11 = 54.84792226060818D;
    Object v12 = 0;
    Object v13 = 1;
    Object v14 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v16 = java.nio.charset.Charset.defaultCharset();
    Object v17 = new java.io.PrintStream(((java.lang.String)v15),((java.nio.charset.Charset)v16));
    Object v18 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v17));
    Object v19 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v14),((com.google.javascript.jscomp.AbstractCompiler)v18));
    Object v20 = com.google.javascript.jscomp.PhaseOptimizer.getLoopsRun();
    Object v21 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ControlFlowGraph)v6),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v10),((com.google.javascript.jscomp.Scope)v19),((java.util.Collection)v20));
    Object v22 = 54.84792226060818D;
    Object v23 = 0;
    Object v24 = 1;
    Object v25 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v22).doubleValue()),(((java.lang.Integer)v23).intValue()),(((java.lang.Integer)v24).intValue()));
    Object v26 = 54.84792226060818D;
    Object v27 = 0;
    Object v28 = 1;
    Object v29 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v26).doubleValue()),(((java.lang.Integer)v27).intValue()),(((java.lang.Integer)v28).intValue()));
    Object v30 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v31 = java.nio.charset.Charset.defaultCharset();
    Object v32 = new java.io.PrintStream(((java.lang.String)v30),((java.nio.charset.Charset)v31));
    Object v33 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v32));
    Object v34 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v29),((com.google.javascript.jscomp.AbstractCompiler)v33));
    Object v35 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v34));
    Object v36 = ((com.google.javascript.jscomp.TypeInference)v21).flowThrough(((com.google.javascript.rhino.Node)v25),((com.google.javascript.jscomp.FlowScope)v35));
    org.junit.Assert.assertNotNull(v36);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = java.nio.charset.Charset.defaultCharset();
    Object v5 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v4));
    Object v6 = new com.google.javascript.jscomp.DefaultCodingConvention();
    Object v7 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7));
    Object v9 = new com.google.javascript.jscomp.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v6),((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = 54.84792226060818D;
    Object v11 = 0;
    Object v12 = 1;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v15 = java.nio.charset.Charset.defaultCharset();
    Object v16 = new java.io.PrintStream(((java.lang.String)v14),((java.nio.charset.Charset)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v16));
    Object v18 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v13),((com.google.javascript.jscomp.AbstractCompiler)v17));
    Object v19 = ((com.google.javascript.jscomp.Scope)v18).getVarCount();
    Object v20 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ControlFlowGraph)v5),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v9),((com.google.javascript.jscomp.Scope)v18));
    Object v21 = 54.84792226060818D;
    Object v22 = 0;
    Object v23 = 1;
    Object v24 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v21).doubleValue()),(((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()));
    Object v25 = 54.84792226060818D;
    Object v26 = 0;
    Object v27 = 1;
    Object v28 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v25).doubleValue()),(((java.lang.Integer)v26).intValue()),(((java.lang.Integer)v27).intValue()));
    Object v29 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v30 = java.nio.charset.Charset.defaultCharset();
    Object v31 = new java.io.PrintStream(((java.lang.String)v29),((java.nio.charset.Charset)v30));
    Object v32 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v31));
    Object v33 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v28),((com.google.javascript.jscomp.AbstractCompiler)v32));
    Object v34 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v33));
    Object v35 = new com.google.javascript.jscomp.LinkedFlowScope(((com.google.javascript.jscomp.LinkedFlowScope)v34));
    Object v36 = ((com.google.javascript.jscomp.TypeInference)v20).branchedFlowThrough(((com.google.javascript.rhino.Node)v24),((com.google.javascript.jscomp.FlowScope)v35));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = java.nio.charset.Charset.defaultCharset();
    Object v5 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v4));
    Object v6 = new com.google.javascript.jscomp.DefaultCodingConvention();
    Object v7 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7));
    Object v9 = new com.google.javascript.jscomp.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v6),((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = 54.84792226060818D;
    Object v11 = 0;
    Object v12 = 1;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v15 = java.nio.charset.Charset.defaultCharset();
    Object v16 = new java.io.PrintStream(((java.lang.String)v14),((java.nio.charset.Charset)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v16));
    Object v18 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v13),((com.google.javascript.jscomp.AbstractCompiler)v17));
    Object v19 = "";
    Object v20 = ((com.google.javascript.jscomp.Scope)v18).getSlot(((java.lang.String)v19));
    Object v21 = com.google.javascript.jscomp.PhaseOptimizer.getLoopsRun();
    Object v22 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ControlFlowGraph)v5),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v9),((com.google.javascript.jscomp.Scope)v18),((java.util.Collection)v21));
    org.junit.Assert.assertNotNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = java.nio.charset.Charset.defaultCharset();
    Object v5 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v4));
    Object v6 = new com.google.javascript.jscomp.DefaultCodingConvention();
    Object v7 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7));
    Object v9 = new com.google.javascript.jscomp.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v6),((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = 54.84792226060818D;
    Object v11 = 0;
    Object v12 = 1;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v15 = java.nio.charset.Charset.defaultCharset();
    Object v16 = new java.io.PrintStream(((java.lang.String)v14),((java.nio.charset.Charset)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v16));
    Object v18 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v13),((com.google.javascript.jscomp.AbstractCompiler)v17));
    Object v19 = ((com.google.javascript.jscomp.Scope)v18).getVarCount();
    Object v20 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ControlFlowGraph)v5),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v9),((com.google.javascript.jscomp.Scope)v18));
    Object v21 = ((com.google.javascript.jscomp.TypeInference)v20).createEntryLattice();
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "property access";
    Object v5 = 0;
    Object v6 = ((com.google.javascript.jscomp.SourceExcerptProvider)v3).getSourceRegion(((java.lang.String)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = java.nio.charset.Charset.defaultCharset();
    Object v8 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v7));
    Object v9 = new com.google.javascript.jscomp.DefaultCodingConvention();
    Object v10 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10));
    Object v12 = new com.google.javascript.jscomp.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v9),((com.google.javascript.rhino.jstype.JSTypeRegistry)v11));
    Object v13 = 54.84792226060818D;
    Object v14 = 0;
    Object v15 = 1;
    Object v16 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v13).doubleValue()),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v18 = java.nio.charset.Charset.defaultCharset();
    Object v19 = new java.io.PrintStream(((java.lang.String)v17),((java.nio.charset.Charset)v18));
    Object v20 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v19));
    Object v21 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v16),((com.google.javascript.jscomp.AbstractCompiler)v20));
    Object v22 = com.google.javascript.jscomp.PhaseOptimizer.getLoopsRun();
    Object v23 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ControlFlowGraph)v8),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v12),((com.google.javascript.jscomp.Scope)v21),((java.util.Collection)v22));
    org.junit.Assert.assertNotNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = java.nio.charset.Charset.defaultCharset();
    Object v5 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v4));
    Object v6 = new com.google.javascript.jscomp.DefaultCodingConvention();
    Object v7 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7));
    Object v9 = new com.google.javascript.jscomp.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v6),((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = 54.84792226060818D;
    Object v11 = 0;
    Object v12 = 1;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v15 = java.nio.charset.Charset.defaultCharset();
    Object v16 = new java.io.PrintStream(((java.lang.String)v14),((java.nio.charset.Charset)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v16));
    Object v18 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v13),((com.google.javascript.jscomp.AbstractCompiler)v17));
    Object v19 = ((com.google.javascript.jscomp.Scope)v18).getVarCount();
    Object v20 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ControlFlowGraph)v5),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v9),((com.google.javascript.jscomp.Scope)v18));
    Object v21 = ((com.google.javascript.jscomp.TypeInference)v20).createInitialEstimateLattice();
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "property access";
    Object v5 = 0;
    Object v6 = ((com.google.javascript.jscomp.SourceExcerptProvider)v3).getSourceRegion(((java.lang.String)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = java.nio.charset.Charset.defaultCharset();
    Object v8 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v7));
    Object v9 = new com.google.javascript.jscomp.DefaultCodingConvention();
    Object v10 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10));
    Object v12 = new com.google.javascript.jscomp.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v9),((com.google.javascript.rhino.jstype.JSTypeRegistry)v11));
    Object v13 = 54.84792226060818D;
    Object v14 = 0;
    Object v15 = 1;
    Object v16 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v13).doubleValue()),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v18 = java.nio.charset.Charset.defaultCharset();
    Object v19 = new java.io.PrintStream(((java.lang.String)v17),((java.nio.charset.Charset)v18));
    Object v20 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v19));
    Object v21 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v16),((com.google.javascript.jscomp.AbstractCompiler)v20));
    Object v22 = com.google.javascript.jscomp.PhaseOptimizer.getLoopsRun();
    Object v23 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ControlFlowGraph)v8),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v12),((com.google.javascript.jscomp.Scope)v21),((java.util.Collection)v22));
    Object v24 = ((com.google.javascript.jscomp.TypeInference)v23).createInitialEstimateLattice();
    org.junit.Assert.assertNotNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
    Object v2 = true;
    Object v3 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v0),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((java.lang.Enum)v3).getDeclaringClass();
    Object v5 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v6 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
    Object v7 = true;
    Object v8 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v5),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v10 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
    Object v11 = true;
    Object v12 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v9),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = false;
    Object v14 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v8),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = true;
    Object v16 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v3),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v14),(((java.lang.Boolean)v15).booleanValue()));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = java.nio.charset.Charset.defaultCharset();
    Object v5 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v4));
    Object v6 = new com.google.javascript.jscomp.DefaultCodingConvention();
    Object v7 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7));
    Object v9 = new com.google.javascript.jscomp.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v6),((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = 54.84792226060818D;
    Object v11 = 0;
    Object v12 = 1;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v15 = java.nio.charset.Charset.defaultCharset();
    Object v16 = new java.io.PrintStream(((java.lang.String)v14),((java.nio.charset.Charset)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v16));
    Object v18 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v13),((com.google.javascript.jscomp.AbstractCompiler)v17));
    Object v19 = com.google.javascript.jscomp.PhaseOptimizer.getLoopsRun();
    Object v20 = ((java.util.Collection)v19).isEmpty();
    Object v21 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ControlFlowGraph)v5),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v9),((com.google.javascript.jscomp.Scope)v18),((java.util.Collection)v19));
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = java.nio.charset.Charset.defaultCharset();
    Object v5 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v4));
    Object v6 = new com.google.javascript.jscomp.DefaultCodingConvention();
    Object v7 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7));
    Object v9 = new com.google.javascript.jscomp.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v6),((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = 54.84792226060818D;
    Object v11 = 0;
    Object v12 = 1;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v15 = java.nio.charset.Charset.defaultCharset();
    Object v16 = new java.io.PrintStream(((java.lang.String)v14),((java.nio.charset.Charset)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v16));
    Object v18 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v13),((com.google.javascript.jscomp.AbstractCompiler)v17));
    Object v19 = com.google.javascript.jscomp.PhaseOptimizer.getLoopsRun();
    Object v20 = ((java.util.Collection)v19).isEmpty();
    Object v21 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ControlFlowGraph)v5),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v9),((com.google.javascript.jscomp.Scope)v18),((java.util.Collection)v19));
    Object v22 = 54.84792226060818D;
    Object v23 = 0;
    Object v24 = 1;
    Object v25 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v22).doubleValue()),(((java.lang.Integer)v23).intValue()),(((java.lang.Integer)v24).intValue()));
    Object v26 = 54.84792226060818D;
    Object v27 = 0;
    Object v28 = 1;
    Object v29 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v26).doubleValue()),(((java.lang.Integer)v27).intValue()),(((java.lang.Integer)v28).intValue()));
    Object v30 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v31 = java.nio.charset.Charset.defaultCharset();
    Object v32 = new java.io.PrintStream(((java.lang.String)v30),((java.nio.charset.Charset)v31));
    Object v33 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v32));
    Object v34 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v29),((com.google.javascript.jscomp.AbstractCompiler)v33));
    Object v35 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v34));
    Object v36 = new com.google.javascript.jscomp.LinkedFlowScope(((com.google.javascript.jscomp.LinkedFlowScope)v35));
    Object v37 = ((com.google.javascript.jscomp.TypeInference)v21).flowThrough(((com.google.javascript.rhino.Node)v25),((com.google.javascript.jscomp.FlowScope)v36));
    org.junit.Assert.assertNotNull(v37);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = java.nio.charset.Charset.defaultCharset();
    Object v5 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v4));
    Object v6 = new com.google.javascript.jscomp.DefaultCodingConvention();
    Object v7 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7));
    Object v9 = new com.google.javascript.jscomp.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v6),((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = 54.84792226060818D;
    Object v11 = 0;
    Object v12 = 1;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v15 = java.nio.charset.Charset.defaultCharset();
    Object v16 = new java.io.PrintStream(((java.lang.String)v14),((java.nio.charset.Charset)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v16));
    Object v18 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v13),((com.google.javascript.jscomp.AbstractCompiler)v17));
    Object v19 = com.google.javascript.jscomp.PhaseOptimizer.getLoopsRun();
    Object v20 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ControlFlowGraph)v5),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v9),((com.google.javascript.jscomp.Scope)v18),((java.util.Collection)v19));
    Object v21 = 54.84792226060818D;
    Object v22 = 0;
    Object v23 = 1;
    Object v24 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v21).doubleValue()),(((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()));
    Object v25 = 54.84792226060818D;
    Object v26 = 0;
    Object v27 = 1;
    Object v28 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v25).doubleValue()),(((java.lang.Integer)v26).intValue()),(((java.lang.Integer)v27).intValue()));
    Object v29 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v30 = java.nio.charset.Charset.defaultCharset();
    Object v31 = new java.io.PrintStream(((java.lang.String)v29),((java.nio.charset.Charset)v30));
    Object v32 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v31));
    Object v33 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v28),((com.google.javascript.jscomp.AbstractCompiler)v32));
    Object v34 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v33));
    Object v35 = ((com.google.javascript.jscomp.TypeInference)v20).flowThrough(((com.google.javascript.rhino.Node)v24),((com.google.javascript.jscomp.FlowScope)v34));
    org.junit.Assert.assertNotNull(v35);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = java.nio.charset.Charset.defaultCharset();
    Object v5 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v4));
    Object v6 = new com.google.javascript.jscomp.DefaultCodingConvention();
    Object v7 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7));
    Object v9 = new com.google.javascript.jscomp.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v6),((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = 54.84792226060818D;
    Object v11 = 0;
    Object v12 = 1;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v15 = java.nio.charset.Charset.defaultCharset();
    Object v16 = new java.io.PrintStream(((java.lang.String)v14),((java.nio.charset.Charset)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v16));
    Object v18 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v13),((com.google.javascript.jscomp.AbstractCompiler)v17));
    Object v19 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ControlFlowGraph)v5),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v9),((com.google.javascript.jscomp.Scope)v18));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "property access";
    Object v5 = 0;
    Object v6 = ((com.google.javascript.jscomp.SourceExcerptProvider)v3).getSourceRegion(((java.lang.String)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = java.nio.charset.Charset.defaultCharset();
    Object v8 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v7));
    Object v9 = new com.google.javascript.jscomp.DefaultCodingConvention();
    Object v10 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10));
    Object v12 = new com.google.javascript.jscomp.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v9),((com.google.javascript.rhino.jstype.JSTypeRegistry)v11));
    Object v13 = 54.84792226060818D;
    Object v14 = 0;
    Object v15 = 1;
    Object v16 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v13).doubleValue()),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v18 = java.nio.charset.Charset.defaultCharset();
    Object v19 = new java.io.PrintStream(((java.lang.String)v17),((java.nio.charset.Charset)v18));
    Object v20 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v19));
    Object v21 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v16),((com.google.javascript.jscomp.AbstractCompiler)v20));
    Object v22 = com.google.javascript.jscomp.PhaseOptimizer.getLoopsRun();
    Object v23 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ControlFlowGraph)v8),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v12),((com.google.javascript.jscomp.Scope)v21),((java.util.Collection)v22));
    Object v24 = 54.84792226060818D;
    Object v25 = 0;
    Object v26 = 1;
    Object v27 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v24).doubleValue()),(((java.lang.Integer)v25).intValue()),(((java.lang.Integer)v26).intValue()));
    Object v28 = 54.84792226060818D;
    Object v29 = 0;
    Object v30 = 1;
    Object v31 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v28).doubleValue()),(((java.lang.Integer)v29).intValue()),(((java.lang.Integer)v30).intValue()));
    Object v32 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v33 = java.nio.charset.Charset.defaultCharset();
    Object v34 = new java.io.PrintStream(((java.lang.String)v32),((java.nio.charset.Charset)v33));
    Object v35 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v34));
    Object v36 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v31),((com.google.javascript.jscomp.AbstractCompiler)v35));
    Object v37 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v36));
    Object v38 = ((com.google.javascript.jscomp.TypeInference)v23).branchedFlowThrough(((com.google.javascript.rhino.Node)v27),((com.google.javascript.jscomp.FlowScope)v37));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
    Object v2 = true;
    Object v3 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v0),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v5 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
    Object v6 = true;
    Object v7 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v4),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = true;
    Object v9 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v3),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v11 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
    Object v12 = true;
    Object v13 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v10),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = true;
    Object v15 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v9),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v17 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
    Object v18 = true;
    Object v19 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v16),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v21 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
    Object v22 = true;
    Object v23 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v20),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v21),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = false;
    Object v25 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v19),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v23),(((java.lang.Boolean)v24).booleanValue()));
    Object v26 = true;
    Object v27 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v15),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v25),(((java.lang.Boolean)v26).booleanValue()));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE), v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = java.nio.charset.Charset.defaultCharset();
    Object v5 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v4));
    Object v6 = ((com.google.javascript.jscomp.graph.LinkedDirectedGraph)v5).getGraphvizEdges();
    Object v7 = new com.google.javascript.jscomp.DefaultCodingConvention();
    Object v8 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v8));
    Object v10 = new com.google.javascript.jscomp.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v7),((com.google.javascript.rhino.jstype.JSTypeRegistry)v9));
    Object v11 = 54.84792226060818D;
    Object v12 = 0;
    Object v13 = 1;
    Object v14 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v16 = java.nio.charset.Charset.defaultCharset();
    Object v17 = new java.io.PrintStream(((java.lang.String)v15),((java.nio.charset.Charset)v16));
    Object v18 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v17));
    Object v19 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v14),((com.google.javascript.jscomp.AbstractCompiler)v18));
    Object v20 = ((com.google.javascript.jscomp.Scope)v19).getVarCount();
    Object v21 = com.google.javascript.jscomp.PhaseOptimizer.getLoopsRun();
    Object v22 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ControlFlowGraph)v5),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v10),((com.google.javascript.jscomp.Scope)v19),((java.util.Collection)v21));
    org.junit.Assert.assertNotNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = java.nio.charset.Charset.defaultCharset();
    Object v5 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v4));
    Object v6 = new com.google.javascript.jscomp.DefaultCodingConvention();
    Object v7 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7));
    Object v9 = new com.google.javascript.jscomp.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v6),((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = 54.84792226060818D;
    Object v11 = 0;
    Object v12 = 1;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v15 = java.nio.charset.Charset.defaultCharset();
    Object v16 = new java.io.PrintStream(((java.lang.String)v14),((java.nio.charset.Charset)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v16));
    Object v18 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v13),((com.google.javascript.jscomp.AbstractCompiler)v17));
    Object v19 = com.google.javascript.jscomp.PhaseOptimizer.getLoopsRun();
    Object v20 = ((java.util.Collection)v19).isEmpty();
    Object v21 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ControlFlowGraph)v5),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v9),((com.google.javascript.jscomp.Scope)v18),((java.util.Collection)v19));
    Object v22 = 54.84792226060818D;
    Object v23 = 0;
    Object v24 = 1;
    Object v25 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v22).doubleValue()),(((java.lang.Integer)v23).intValue()),(((java.lang.Integer)v24).intValue()));
    Object v26 = 54.84792226060818D;
    Object v27 = 0;
    Object v28 = 1;
    Object v29 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v26).doubleValue()),(((java.lang.Integer)v27).intValue()),(((java.lang.Integer)v28).intValue()));
    Object v30 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v31 = java.nio.charset.Charset.defaultCharset();
    Object v32 = new java.io.PrintStream(((java.lang.String)v30),((java.nio.charset.Charset)v31));
    Object v33 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v32));
    Object v34 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v29),((com.google.javascript.jscomp.AbstractCompiler)v33));
    Object v35 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v34));
    Object v36 = new com.google.javascript.jscomp.LinkedFlowScope(((com.google.javascript.jscomp.LinkedFlowScope)v35));
    Object v37 = ((com.google.javascript.jscomp.TypeInference)v21).branchedFlowThrough(((com.google.javascript.rhino.Node)v25),((com.google.javascript.jscomp.FlowScope)v36));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
    Object v2 = true;
    Object v3 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v0),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v5 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
    Object v6 = true;
    Object v7 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v4),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v9 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
    Object v10 = true;
    Object v11 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v8),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = true;
    Object v13 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v7),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = true;
    Object v15 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v3),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v17 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
    Object v18 = true;
    Object v19 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v16),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = false;
    Object v21 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v15),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v23 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
    Object v24 = true;
    Object v25 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v22),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v23),(((java.lang.Boolean)v24).booleanValue()));
    Object v26 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v27 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
    Object v28 = true;
    Object v29 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v26),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v27),(((java.lang.Boolean)v28).booleanValue()));
    Object v30 = true;
    Object v31 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v25),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v29),(((java.lang.Boolean)v30).booleanValue()));
    Object v32 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v33 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
    Object v34 = true;
    Object v35 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v32),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v33),(((java.lang.Boolean)v34).booleanValue()));
    Object v36 = true;
    Object v37 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v31),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v35),(((java.lang.Boolean)v36).booleanValue()));
    Object v38 = false;
    Object v39 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v21),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v37),(((java.lang.Boolean)v38).booleanValue()));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE), v39);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = java.nio.charset.Charset.defaultCharset();
    Object v5 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v4));
    Object v6 = new com.google.javascript.jscomp.DefaultCodingConvention();
    Object v7 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7));
    Object v9 = new com.google.javascript.jscomp.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v6),((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = 54.84792226060818D;
    Object v11 = 0;
    Object v12 = 1;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v15 = java.nio.charset.Charset.defaultCharset();
    Object v16 = new java.io.PrintStream(((java.lang.String)v14),((java.nio.charset.Charset)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v16));
    Object v18 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v13),((com.google.javascript.jscomp.AbstractCompiler)v17));
    Object v19 = "";
    Object v20 = ((com.google.javascript.jscomp.Scope)v18).getSlot(((java.lang.String)v19));
    Object v21 = com.google.javascript.jscomp.PhaseOptimizer.getLoopsRun();
    Object v22 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ControlFlowGraph)v5),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v9),((com.google.javascript.jscomp.Scope)v18),((java.util.Collection)v21));
    Object v23 = 54.84792226060818D;
    Object v24 = 0;
    Object v25 = 1;
    Object v26 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v23).doubleValue()),(((java.lang.Integer)v24).intValue()),(((java.lang.Integer)v25).intValue()));
    Object v27 = 54.84792226060818D;
    Object v28 = 0;
    Object v29 = 1;
    Object v30 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v27).doubleValue()),(((java.lang.Integer)v28).intValue()),(((java.lang.Integer)v29).intValue()));
    Object v31 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v32 = java.nio.charset.Charset.defaultCharset();
    Object v33 = new java.io.PrintStream(((java.lang.String)v31),((java.nio.charset.Charset)v32));
    Object v34 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v33));
    Object v35 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v30),((com.google.javascript.jscomp.AbstractCompiler)v34));
    Object v36 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v35));
    Object v37 = new com.google.javascript.jscomp.LinkedFlowScope(((com.google.javascript.jscomp.LinkedFlowScope)v36));
    Object v38 = ((com.google.javascript.jscomp.TypeInference)v22).branchedFlowThrough(((com.google.javascript.rhino.Node)v26),((com.google.javascript.jscomp.FlowScope)v37));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
    Object v2 = true;
    Object v3 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v0),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v5 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
    Object v6 = true;
    Object v7 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v4),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v9 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
    Object v10 = true;
    Object v11 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v8),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = true;
    Object v13 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v7),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v15 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
    Object v16 = true;
    Object v17 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v14),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v19 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
    Object v20 = true;
    Object v21 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v18),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
    Object v23 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
    Object v24 = true;
    Object v25 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v22),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v23),(((java.lang.Boolean)v24).booleanValue()));
    Object v26 = true;
    Object v27 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v21),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v25),(((java.lang.Boolean)v26).booleanValue()));
    Object v28 = true;
    Object v29 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v17),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v27),(((java.lang.Boolean)v28).booleanValue()));
    Object v30 = false;
    Object v31 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v13),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v29),(((java.lang.Boolean)v30).booleanValue()));
    Object v32 = true;
    Object v33 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v3),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v31),(((java.lang.Boolean)v32).booleanValue()));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE), v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "";
    Object v5 = -8;
    Object v6 = ((com.google.javascript.jscomp.SourceExcerptProvider)v3).getSourceRegion(((java.lang.String)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = java.nio.charset.Charset.defaultCharset();
    Object v8 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v7));
    ((com.google.javascript.jscomp.graph.Graph)v8).pushNodeAnnotations();
    Object v9 = null;
    Object v10 = new com.google.javascript.jscomp.DefaultCodingConvention();
    Object v11 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v11));
    Object v13 = new com.google.javascript.jscomp.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v10),((com.google.javascript.rhino.jstype.JSTypeRegistry)v12));
    Object v14 = 54.84792226060818D;
    Object v15 = 0;
    Object v16 = 1;
    Object v17 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v14).doubleValue()),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v19 = java.nio.charset.Charset.defaultCharset();
    Object v20 = new java.io.PrintStream(((java.lang.String)v18),((java.nio.charset.Charset)v19));
    Object v21 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v20));
    Object v22 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v17),((com.google.javascript.jscomp.AbstractCompiler)v21));
    Object v23 = com.google.javascript.jscomp.PhaseOptimizer.getLoopsRun();
    Object v24 = com.google.javascript.jscomp.PhaseOptimizer.getLoopsRun();
    Object v25 = ((java.util.Collection)v23).retainAll(((java.util.Collection)v24));
    Object v26 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ControlFlowGraph)v8),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v13),((com.google.javascript.jscomp.Scope)v22),((java.util.Collection)v23));
    Object v27 = ((com.google.javascript.jscomp.TypeInference)v26).createEntryLattice();
    org.junit.Assert.assertNotNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = java.nio.charset.Charset.defaultCharset();
    Object v5 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v4));
    Object v6 = ((com.google.javascript.jscomp.graph.LinkedDirectedGraph)v5).getDirectedGraphNodes();
    Object v7 = new com.google.javascript.jscomp.DefaultCodingConvention();
    Object v8 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v8));
    Object v10 = new com.google.javascript.jscomp.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v7),((com.google.javascript.rhino.jstype.JSTypeRegistry)v9));
    Object v11 = 54.84792226060818D;
    Object v12 = 0;
    Object v13 = 1;
    Object v14 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v16 = java.nio.charset.Charset.defaultCharset();
    Object v17 = new java.io.PrintStream(((java.lang.String)v15),((java.nio.charset.Charset)v16));
    Object v18 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v17));
    Object v19 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v14),((com.google.javascript.jscomp.AbstractCompiler)v18));
    Object v20 = com.google.javascript.jscomp.PhaseOptimizer.getLoopsRun();
    Object v21 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ControlFlowGraph)v5),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v10),((com.google.javascript.jscomp.Scope)v19),((java.util.Collection)v20));
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = java.nio.charset.Charset.defaultCharset();
    Object v5 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v4));
    Object v6 = new com.google.javascript.jscomp.DefaultCodingConvention();
    Object v7 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7));
    Object v9 = new com.google.javascript.jscomp.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v6),((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = 54.84792226060818D;
    Object v11 = 0;
    Object v12 = 1;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v15 = java.nio.charset.Charset.defaultCharset();
    Object v16 = new java.io.PrintStream(((java.lang.String)v14),((java.nio.charset.Charset)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v16));
    Object v18 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v13),((com.google.javascript.jscomp.AbstractCompiler)v17));
    Object v19 = "";
    Object v20 = ((com.google.javascript.jscomp.Scope)v18).getSlot(((java.lang.String)v19));
    Object v21 = com.google.javascript.jscomp.PhaseOptimizer.getLoopsRun();
    Object v22 = ((java.util.Collection)v21).toArray();
    Object v23 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ControlFlowGraph)v5),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v9),((com.google.javascript.jscomp.Scope)v18),((java.util.Collection)v21));
    Object v24 = ((com.google.javascript.jscomp.TypeInference)v23).getAssignedOuterLocalVars();
    org.junit.Assert.assertNotNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = java.nio.charset.Charset.defaultCharset();
    Object v5 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v4));
    ((com.google.javascript.jscomp.graph.Graph)v5).clearNodeAnnotations();
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.DefaultCodingConvention();
    Object v8 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v8));
    Object v10 = new com.google.javascript.jscomp.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v7),((com.google.javascript.rhino.jstype.JSTypeRegistry)v9));
    Object v11 = 54.84792226060818D;
    Object v12 = 0;
    Object v13 = 1;
    Object v14 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v16 = java.nio.charset.Charset.defaultCharset();
    Object v17 = new java.io.PrintStream(((java.lang.String)v15),((java.nio.charset.Charset)v16));
    Object v18 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v17));
    Object v19 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v14),((com.google.javascript.jscomp.AbstractCompiler)v18));
    Object v20 = ((com.google.javascript.jscomp.Scope)v19).getVarCount();
    Object v21 = com.google.javascript.jscomp.PhaseOptimizer.getLoopsRun();
    Object v22 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ControlFlowGraph)v5),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v10),((com.google.javascript.jscomp.Scope)v19),((java.util.Collection)v21));
    Object v23 = 54.84792226060818D;
    Object v24 = 0;
    Object v25 = 1;
    Object v26 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v23).doubleValue()),(((java.lang.Integer)v24).intValue()),(((java.lang.Integer)v25).intValue()));
    Object v27 = 54.84792226060818D;
    Object v28 = 0;
    Object v29 = 1;
    Object v30 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v27).doubleValue()),(((java.lang.Integer)v28).intValue()),(((java.lang.Integer)v29).intValue()));
    Object v31 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v32 = java.nio.charset.Charset.defaultCharset();
    Object v33 = new java.io.PrintStream(((java.lang.String)v31),((java.nio.charset.Charset)v32));
    Object v34 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v33));
    Object v35 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v30),((com.google.javascript.jscomp.AbstractCompiler)v34));
    Object v36 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v35));
    Object v37 = new com.google.javascript.jscomp.LinkedFlowScope(((com.google.javascript.jscomp.LinkedFlowScope)v36));
    Object v38 = ((com.google.javascript.jscomp.TypeInference)v22).flowThrough(((com.google.javascript.rhino.Node)v26),((com.google.javascript.jscomp.FlowScope)v37));
    org.junit.Assert.assertNotNull(v38);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = java.nio.charset.Charset.defaultCharset();
    Object v5 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v4));
    Object v6 = ((com.google.javascript.jscomp.graph.LinkedDirectedGraph)v5).getGraphvizEdges();
    Object v7 = new com.google.javascript.jscomp.DefaultCodingConvention();
    Object v8 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v8));
    Object v10 = new com.google.javascript.jscomp.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v7),((com.google.javascript.rhino.jstype.JSTypeRegistry)v9));
    Object v11 = 54.84792226060818D;
    Object v12 = 0;
    Object v13 = 1;
    Object v14 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = "Unexpected EXPR_VOID. SLould be EXPR_RESULT.";
    Object v16 = java.nio.charset.Charset.defaultCharset();
    Object v17 = new java.io.PrintStream(((java.lang.String)v15),((java.nio.charset.Charset)v16));
    Object v18 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v17));
    Object v19 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v14),((com.google.javascript.jscomp.AbstractCompiler)v18));
    Object v20 = ((com.google.javascript.jscomp.Scope)v19).getVarCount();
    Object v21 = com.google.javascript.jscomp.PhaseOptimizer.getLoopsRun();
    Object v22 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ControlFlowGraph)v5),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v10),((com.google.javascript.jscomp.Scope)v19),((java.util.Collection)v21));
    Object v23 = ((com.google.javascript.jscomp.TypeInference)v22).createInitialEstimateLattice();
    org.junit.Assert.assertNotNull(v23);
  }
}
