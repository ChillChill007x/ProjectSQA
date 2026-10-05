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
    Object v8 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = 12.730385926634657D;
    Object v10 = 0;
    Object v11 = 0;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = com.google.javascript.jscomp.Scope.createLatticeBottom(((com.google.javascript.rhino.Node)v12));
    Object v14 = java.util.Map.of();
    Object v15 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v8),((com.google.javascript.jscomp.Scope)v13),((java.util.Map)v14));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.Compiler();
    Object v2 = true;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = 12.730385926634657D;
    Object v10 = 0;
    Object v11 = 0;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = com.google.javascript.jscomp.Scope.createLatticeBottom(((com.google.javascript.rhino.Node)v12));
    Object v14 = ((com.google.javascript.jscomp.Scope)v13).getArgumentsVar();
    Object v15 = java.util.Map.of();
    Object v16 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v8),((com.google.javascript.jscomp.Scope)v13),((java.util.Map)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
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
    Object v9 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v6),((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = 12.730385926634657D;
    Object v11 = 0;
    Object v12 = 0;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = com.google.javascript.jscomp.Scope.createLatticeBottom(((com.google.javascript.rhino.Node)v13));
    Object v15 = java.util.Map.of();
    Object v16 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ControlFlowGraph)v5),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v9),((com.google.javascript.jscomp.Scope)v14),((java.util.Map)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v2 = true;
    Object v3 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v0),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v1),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.Compiler();
    Object v2 = true;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = 12.730385926634657D;
    Object v10 = 0;
    Object v11 = 0;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = 12.730385926634657D;
    Object v14 = 0;
    Object v15 = 0;
    Object v16 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v13).doubleValue()),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = com.google.javascript.jscomp.Scope.createLatticeBottom(((com.google.javascript.rhino.Node)v16));
    Object v18 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v17));
    Object v19 = new com.google.javascript.jscomp.LinkedFlowScope(((com.google.javascript.jscomp.LinkedFlowScope)v18));
    Object v20 = false;
    Object v21 = ((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v8).getPreciserScopeKnowingConditionOutcome(((com.google.javascript.rhino.Node)v12),((com.google.javascript.jscomp.type.FlowScope)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = 12.730385926634657D;
    Object v23 = 0;
    Object v24 = 0;
    Object v25 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v22).doubleValue()),(((java.lang.Integer)v23).intValue()),(((java.lang.Integer)v24).intValue()));
    Object v26 = com.google.javascript.jscomp.Scope.createLatticeBottom(((com.google.javascript.rhino.Node)v25));
    Object v27 = java.util.Map.of();
    Object v28 = ((java.util.Map)v27).entrySet();
    Object v29 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v8),((com.google.javascript.jscomp.Scope)v26),((java.util.Map)v27));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v2 = true;
    Object v3 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v0),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v5 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v6 = true;
    Object v7 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v4),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = ((java.lang.Enum)v3).compareTo(((java.lang.Enum)v7));
    Object v9 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v10 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v11 = true;
    Object v12 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v9),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = false;
    Object v14 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v3),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v12),(((java.lang.Boolean)v13).booleanValue()));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v2 = true;
    Object v3 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v0),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v5 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v6 = true;
    Object v7 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v4),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = ((java.lang.Enum)v3).compareTo(((java.lang.Enum)v7));
    Object v9 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v10 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v11 = true;
    Object v12 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v9),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = false;
    Object v14 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v3),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v16 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v17 = true;
    Object v18 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v15),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = false;
    Object v20 = ((com.google.javascript.rhino.jstype.BooleanLiteralSet)v18).contains((((java.lang.Boolean)v19).booleanValue()));
    Object v21 = false;
    Object v22 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v14),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v18),(((java.lang.Boolean)v21).booleanValue()));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY), v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v2 = true;
    Object v3 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v0),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v5 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v6 = true;
    Object v7 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v4),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = ((java.lang.Enum)v7).hashCode();
    Object v9 = true;
    Object v10 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v3),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v7),(((java.lang.Boolean)v9).booleanValue()));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v2 = true;
    Object v3 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v0),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v5 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v6 = true;
    Object v7 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v4),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = ((java.lang.Enum)v7).hashCode();
    Object v9 = true;
    Object v10 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v3),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v7),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v12 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v13 = true;
    Object v14 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v11),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = true;
    Object v16 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v10),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v14),(((java.lang.Boolean)v15).booleanValue()));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v2 = true;
    Object v3 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v0),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((java.lang.Enum)v3).getDeclaringClass();
    Object v5 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v6 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v7 = true;
    Object v8 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v5),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = false;
    Object v10 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v3),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v8),(((java.lang.Boolean)v9).booleanValue()));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v2 = true;
    Object v3 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v0),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v5 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v6 = true;
    Object v7 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v4),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = ((java.lang.Enum)v3).compareTo(((java.lang.Enum)v7));
    Object v9 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v10 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v11 = true;
    Object v12 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v9),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = false;
    Object v14 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v3),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v16 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v17 = true;
    Object v18 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v15),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = false;
    Object v20 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v14),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v18),(((java.lang.Boolean)v19).booleanValue()));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY), v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.Compiler();
    Object v2 = true;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    ((com.google.javascript.jscomp.graph.Graph)v4).clearNodeAnnotations();
    Object v5 = null;
    Object v6 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v7 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7));
    Object v9 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v6),((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = 12.730385926634657D;
    Object v11 = 0;
    Object v12 = 0;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = com.google.javascript.jscomp.Scope.createLatticeBottom(((com.google.javascript.rhino.Node)v13));
    Object v15 = java.util.Map.of();
    Object v16 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v17 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v18 = true;
    Object v19 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v16),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = ((java.util.Map)v15).containsKey(((java.lang.Object)v19));
    Object v21 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v9),((com.google.javascript.jscomp.Scope)v14),((java.util.Map)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v2 = true;
    Object v3 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v0),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v5 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v6 = true;
    Object v7 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v4),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = ((java.lang.Enum)v3).compareTo(((java.lang.Enum)v7));
    Object v9 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v10 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v11 = true;
    Object v12 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v9),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = false;
    Object v14 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v3),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v16 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v17 = true;
    Object v18 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v15),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = false;
    Object v20 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v14),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v22 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v23 = true;
    Object v24 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v21),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v22),(((java.lang.Boolean)v23).booleanValue()));
    Object v25 = false;
    Object v26 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v20),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v24),(((java.lang.Boolean)v25).booleanValue()));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY), v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v2 = true;
    Object v3 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v0),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v5 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v6 = true;
    Object v7 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v4),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = ((com.google.javascript.rhino.jstype.BooleanLiteralSet)v3).union(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v7));
    Object v9 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v10 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v11 = true;
    Object v12 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v9),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v14 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v15 = true;
    Object v16 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v13),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = ((java.lang.Enum)v16).hashCode();
    Object v18 = true;
    Object v19 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v12),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v16),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v21 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v22 = true;
    Object v23 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v20),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v21),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = true;
    Object v25 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v19),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v23),(((java.lang.Boolean)v24).booleanValue()));
    Object v26 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v27 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v28 = true;
    Object v29 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v26),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v27),(((java.lang.Boolean)v28).booleanValue()));
    Object v30 = ((com.google.javascript.rhino.jstype.BooleanLiteralSet)v25).intersection(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v29));
    Object v31 = true;
    Object v32 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v3),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v25),(((java.lang.Boolean)v31).booleanValue()));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY), v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.Compiler();
    Object v2 = true;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = 12.730385926634657D;
    Object v10 = 0;
    Object v11 = 0;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = 12.730385926634657D;
    Object v14 = 0;
    Object v15 = 0;
    Object v16 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v13).doubleValue()),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = com.google.javascript.jscomp.Scope.createLatticeBottom(((com.google.javascript.rhino.Node)v16));
    Object v18 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v17));
    Object v19 = new com.google.javascript.jscomp.LinkedFlowScope(((com.google.javascript.jscomp.LinkedFlowScope)v18));
    Object v20 = true;
    Object v21 = ((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v8).getPreciserScopeKnowingConditionOutcome(((com.google.javascript.rhino.Node)v12),((com.google.javascript.jscomp.type.FlowScope)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = 12.730385926634657D;
    Object v23 = 0;
    Object v24 = 0;
    Object v25 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v22).doubleValue()),(((java.lang.Integer)v23).intValue()),(((java.lang.Integer)v24).intValue()));
    Object v26 = com.google.javascript.jscomp.Scope.createLatticeBottom(((com.google.javascript.rhino.Node)v25));
    Object v27 = java.util.Map.of();
    Object v28 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v8),((com.google.javascript.jscomp.Scope)v26),((java.util.Map)v27));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v2 = true;
    Object v3 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v0),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v5 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v6 = true;
    Object v7 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v4),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = ((java.lang.Enum)v3).compareTo(((java.lang.Enum)v7));
    Object v9 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v10 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v11 = true;
    Object v12 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v9),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = false;
    Object v14 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v3),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v16 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v17 = true;
    Object v18 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v15),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = false;
    Object v20 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v14),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v22 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v23 = true;
    Object v24 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v21),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v22),(((java.lang.Boolean)v23).booleanValue()));
    Object v25 = false;
    Object v26 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v20),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v24),(((java.lang.Boolean)v25).booleanValue()));
    Object v27 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v28 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v29 = true;
    Object v30 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v27),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v28),(((java.lang.Boolean)v29).booleanValue()));
    Object v31 = false;
    Object v32 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v26),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v30),(((java.lang.Boolean)v31).booleanValue()));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY), v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
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
    Object v9 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v6),((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = 12.730385926634657D;
    Object v11 = 0;
    Object v12 = 0;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = com.google.javascript.jscomp.Scope.createLatticeBottom(((com.google.javascript.rhino.Node)v13));
    Object v15 = java.util.Map.of();
    Object v16 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v9),((com.google.javascript.jscomp.Scope)v14),((java.util.Map)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.Compiler();
    Object v2 = true;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((com.google.javascript.jscomp.ControlFlowGraph)v4).toString();
    Object v6 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v7 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7));
    Object v9 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v6),((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = 12.730385926634657D;
    Object v11 = 0;
    Object v12 = 0;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = com.google.javascript.jscomp.Scope.createLatticeBottom(((com.google.javascript.rhino.Node)v13));
    Object v15 = ((com.google.javascript.jscomp.Scope)v14).getVars();
    Object v16 = java.util.Map.of();
    Object v17 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v9),((com.google.javascript.jscomp.Scope)v14),((java.util.Map)v16));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v2 = true;
    Object v3 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v0),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v5 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v6 = true;
    Object v7 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v4),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v9 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v10 = true;
    Object v11 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v8),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = ((java.lang.Enum)v7).compareTo(((java.lang.Enum)v11));
    Object v13 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v14 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v15 = true;
    Object v16 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v13),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = false;
    Object v18 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v7),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v20 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v21 = true;
    Object v22 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v19),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = false;
    Object v24 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v18),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v22),(((java.lang.Boolean)v23).booleanValue()));
    Object v25 = false;
    Object v26 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v3),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v24),(((java.lang.Boolean)v25).booleanValue()));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY), v26);
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
    Object v8 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = 12.730385926634657D;
    Object v10 = 0;
    Object v11 = 0;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = com.google.javascript.jscomp.Scope.createLatticeBottom(((com.google.javascript.rhino.Node)v12));
    Object v14 = java.util.Map.of();
    Object v15 = ((java.util.Map)v14).entrySet();
    Object v16 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v8),((com.google.javascript.jscomp.Scope)v13),((java.util.Map)v14));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v2 = true;
    Object v3 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v0),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v5 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v6 = true;
    Object v7 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v4),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v9 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v10 = true;
    Object v11 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v8),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = ((java.lang.Enum)v7).compareTo(((java.lang.Enum)v11));
    Object v13 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v14 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v15 = true;
    Object v16 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v13),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = false;
    Object v18 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v7),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v20 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v21 = true;
    Object v22 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v19),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = false;
    Object v24 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v18),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v22),(((java.lang.Boolean)v23).booleanValue()));
    Object v25 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v26 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v27 = true;
    Object v28 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v25),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v26),(((java.lang.Boolean)v27).booleanValue()));
    Object v29 = false;
    Object v30 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v24),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v28),(((java.lang.Boolean)v29).booleanValue()));
    Object v31 = true;
    Object v32 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v3),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v30),(((java.lang.Boolean)v31).booleanValue()));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY), v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v2 = true;
    Object v3 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v0),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = true;
    Object v5 = ((com.google.javascript.rhino.jstype.BooleanLiteralSet)v3).contains((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v7 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v8 = true;
    Object v9 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v6),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v3),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v9),(((java.lang.Boolean)v10).booleanValue()));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.Compiler();
    Object v2 = true;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = 12.730385926634657D;
    Object v10 = 0;
    Object v11 = 0;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = 12.730385926634657D;
    Object v14 = 0;
    Object v15 = 0;
    Object v16 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v13).doubleValue()),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = com.google.javascript.jscomp.Scope.createLatticeBottom(((com.google.javascript.rhino.Node)v16));
    Object v18 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v17));
    Object v19 = new com.google.javascript.jscomp.LinkedFlowScope(((com.google.javascript.jscomp.LinkedFlowScope)v18));
    Object v20 = false;
    Object v21 = ((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v8).getPreciserScopeKnowingConditionOutcome(((com.google.javascript.rhino.Node)v12),((com.google.javascript.jscomp.type.FlowScope)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = 12.730385926634657D;
    Object v23 = 0;
    Object v24 = 0;
    Object v25 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v22).doubleValue()),(((java.lang.Integer)v23).intValue()),(((java.lang.Integer)v24).intValue()));
    Object v26 = com.google.javascript.jscomp.Scope.createLatticeBottom(((com.google.javascript.rhino.Node)v25));
    Object v27 = java.util.Map.of();
    Object v28 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v8),((com.google.javascript.jscomp.Scope)v26),((java.util.Map)v27));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.Compiler();
    Object v2 = true;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = 12.730385926634657D;
    Object v10 = 0;
    Object v11 = 0;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = com.google.javascript.jscomp.Scope.createLatticeBottom(((com.google.javascript.rhino.Node)v12));
    Object v14 = ((com.google.javascript.jscomp.Scope)v13).getDeclarativelyUnboundVarsWithoutTypes();
    Object v15 = java.util.Map.of();
    Object v16 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v8),((com.google.javascript.jscomp.Scope)v13),((java.util.Map)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v2 = true;
    Object v3 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v0),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = true;
    Object v5 = ((com.google.javascript.rhino.jstype.BooleanLiteralSet)v3).contains((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v7 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v8 = true;
    Object v9 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v6),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v3),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v13 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v14 = true;
    Object v15 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v12),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v17 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v18 = true;
    Object v19 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v16),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = ((java.lang.Enum)v15).compareTo(((java.lang.Enum)v19));
    Object v21 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v22 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v23 = true;
    Object v24 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v21),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v22),(((java.lang.Boolean)v23).booleanValue()));
    Object v25 = false;
    Object v26 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v15),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v24),(((java.lang.Boolean)v25).booleanValue()));
    Object v27 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v28 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v29 = true;
    Object v30 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v27),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v28),(((java.lang.Boolean)v29).booleanValue()));
    Object v31 = false;
    Object v32 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v26),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v30),(((java.lang.Boolean)v31).booleanValue()));
    Object v33 = false;
    Object v34 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v11),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v32),(((java.lang.Boolean)v33).booleanValue()));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY), v34);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v2 = true;
    Object v3 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v0),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v5 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v6 = true;
    Object v7 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v4),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = ((java.lang.Enum)v7).hashCode();
    Object v9 = true;
    Object v10 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v3),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v7),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = ((java.lang.Enum)v10).getDeclaringClass();
    Object v12 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v13 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v14 = true;
    Object v15 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v12),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v17 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v18 = true;
    Object v19 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v16),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = ((java.lang.Enum)v19).hashCode();
    Object v21 = true;
    Object v22 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v15),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v19),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v24 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v25 = true;
    Object v26 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v23),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v24),(((java.lang.Boolean)v25).booleanValue()));
    Object v27 = true;
    Object v28 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v22),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v26),(((java.lang.Boolean)v27).booleanValue()));
    Object v29 = true;
    Object v30 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v10),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v28),(((java.lang.Boolean)v29).booleanValue()));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY), v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v2 = true;
    Object v3 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v0),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = true;
    Object v5 = ((com.google.javascript.rhino.jstype.BooleanLiteralSet)v3).contains((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v7 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v8 = true;
    Object v9 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v6),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v3),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v13 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v14 = true;
    Object v15 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v12),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = true;
    Object v17 = ((com.google.javascript.rhino.jstype.BooleanLiteralSet)v15).contains((((java.lang.Boolean)v16).booleanValue()));
    Object v18 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v19 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v20 = true;
    Object v21 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v18),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = false;
    Object v23 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v15),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v21),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = true;
    Object v25 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v11),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v23),(((java.lang.Boolean)v24).booleanValue()));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY), v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
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
    Object v9 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v6),((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = 12.730385926634657D;
    Object v11 = 0;
    Object v12 = 0;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = 12.730385926634657D;
    Object v15 = 0;
    Object v16 = 0;
    Object v17 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v14).doubleValue()),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = com.google.javascript.jscomp.Scope.createLatticeBottom(((com.google.javascript.rhino.Node)v17));
    Object v19 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v18));
    Object v20 = new com.google.javascript.jscomp.LinkedFlowScope(((com.google.javascript.jscomp.LinkedFlowScope)v19));
    Object v21 = false;
    Object v22 = ((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v9).getPreciserScopeKnowingConditionOutcome(((com.google.javascript.rhino.Node)v13),((com.google.javascript.jscomp.type.FlowScope)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = 12.730385926634657D;
    Object v24 = 0;
    Object v25 = 0;
    Object v26 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v23).doubleValue()),(((java.lang.Integer)v24).intValue()),(((java.lang.Integer)v25).intValue()));
    Object v27 = com.google.javascript.jscomp.Scope.createLatticeBottom(((com.google.javascript.rhino.Node)v26));
    Object v28 = java.util.Map.of();
    Object v29 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ControlFlowGraph)v5),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v9),((com.google.javascript.jscomp.Scope)v27),((java.util.Map)v28));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v2 = true;
    Object v3 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v0),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v5 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v6 = true;
    Object v7 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v4),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = ((java.lang.Enum)v7).hashCode();
    Object v9 = true;
    Object v10 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v3),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v7),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v12 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v13 = true;
    Object v14 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v11),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v16 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v17 = true;
    Object v18 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v15),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = ((java.lang.Enum)v18).hashCode();
    Object v20 = true;
    Object v21 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v14),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v18),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v23 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v24 = true;
    Object v25 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v22),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v23),(((java.lang.Boolean)v24).booleanValue()));
    Object v26 = true;
    Object v27 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v21),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v25),(((java.lang.Boolean)v26).booleanValue()));
    Object v28 = true;
    Object v29 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v10),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v27),(((java.lang.Boolean)v28).booleanValue()));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY), v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v2 = true;
    Object v3 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v0),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v5 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v6 = true;
    Object v7 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v4),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = ((java.lang.Enum)v3).compareTo(((java.lang.Enum)v7));
    Object v9 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v10 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v11 = true;
    Object v12 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v9),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = false;
    Object v14 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v3),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v16 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v17 = true;
    Object v18 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v15),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = true;
    Object v20 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v14),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v18),(((java.lang.Boolean)v19).booleanValue()));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY), v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v2 = true;
    Object v3 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v0),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v5 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v6 = true;
    Object v7 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v4),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = ((java.lang.Enum)v7).hashCode();
    Object v9 = true;
    Object v10 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v3),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v7),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v12 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v13 = true;
    Object v14 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v11),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = false;
    Object v16 = ((com.google.javascript.rhino.jstype.BooleanLiteralSet)v14).contains((((java.lang.Boolean)v15).booleanValue()));
    Object v17 = true;
    Object v18 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v10),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v14),(((java.lang.Boolean)v17).booleanValue()));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
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
    Object v9 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v6),((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = 12.730385926634657D;
    Object v11 = 0;
    Object v12 = 0;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = com.google.javascript.jscomp.Scope.createLatticeBottom(((com.google.javascript.rhino.Node)v13));
    Object v15 = java.util.Map.of();
    Object v16 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ControlFlowGraph)v5),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v9),((com.google.javascript.jscomp.Scope)v14),((java.util.Map)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "prototype";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = false;
    Object v7 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v9 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v9));
    Object v11 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v8),((com.google.javascript.rhino.jstype.JSTypeRegistry)v10));
    Object v12 = 12.730385926634657D;
    Object v13 = 0;
    Object v14 = 0;
    Object v15 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v12).doubleValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = com.google.javascript.jscomp.Scope.createLatticeBottom(((com.google.javascript.rhino.Node)v15));
    Object v17 = java.util.Map.of();
    Object v18 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ControlFlowGraph)v7),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v11),((com.google.javascript.jscomp.Scope)v16),((java.util.Map)v17));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v2 = true;
    Object v3 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v0),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v5 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v6 = true;
    Object v7 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v4),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = ((java.lang.Enum)v7).hashCode();
    Object v9 = true;
    Object v10 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v3),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v7),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v12 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v13 = true;
    Object v14 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v11),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = true;
    Object v16 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v10),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v18 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v19 = true;
    Object v20 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v17),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = ((java.lang.Enum)v20).getDeclaringClass();
    Object v22 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v23 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v24 = true;
    Object v25 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v22),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v23),(((java.lang.Boolean)v24).booleanValue()));
    Object v26 = false;
    Object v27 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v20),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v25),(((java.lang.Boolean)v26).booleanValue()));
    Object v28 = true;
    Object v29 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v16),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v27),(((java.lang.Boolean)v28).booleanValue()));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY), v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v2 = true;
    Object v3 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v0),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v5 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v6 = true;
    Object v7 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v4),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = ((java.lang.Enum)v7).hashCode();
    Object v9 = true;
    Object v10 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v3),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v7),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v12 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v13 = true;
    Object v14 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v11),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = false;
    Object v16 = ((com.google.javascript.rhino.jstype.BooleanLiteralSet)v14).contains((((java.lang.Boolean)v15).booleanValue()));
    Object v17 = true;
    Object v18 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v10),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v14),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v20 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v21 = true;
    Object v22 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v19),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v24 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v25 = true;
    Object v26 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v23),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v24),(((java.lang.Boolean)v25).booleanValue()));
    Object v27 = ((java.lang.Enum)v26).hashCode();
    Object v28 = true;
    Object v29 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v22),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v26),(((java.lang.Boolean)v28).booleanValue()));
    Object v30 = false;
    Object v31 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v18),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v29),(((java.lang.Boolean)v30).booleanValue()));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY), v31);
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
    Object v8 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = 12.730385926634657D;
    Object v10 = 0;
    Object v11 = 0;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = com.google.javascript.jscomp.Scope.createLatticeBottom(((com.google.javascript.rhino.Node)v12));
    Object v14 = ((com.google.javascript.jscomp.Scope)v13).getArgumentsVar();
    Object v15 = java.util.Map.of();
    Object v16 = ((java.util.Map)v15).hashCode();
    Object v17 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v8),((com.google.javascript.jscomp.Scope)v13),((java.util.Map)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v2 = true;
    Object v3 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v0),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v5 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v6 = true;
    Object v7 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v4),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = ((java.lang.Enum)v3).compareTo(((java.lang.Enum)v7));
    Object v9 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v10 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v11 = true;
    Object v12 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v9),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = false;
    Object v14 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v3),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v16 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v17 = true;
    Object v18 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v15),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = true;
    Object v20 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v14),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v22 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v23 = true;
    Object v24 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v21),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v22),(((java.lang.Boolean)v23).booleanValue()));
    Object v25 = true;
    Object v26 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v20),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v24),(((java.lang.Boolean)v25).booleanValue()));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY), v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.Compiler();
    Object v2 = true;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = 12.730385926634657D;
    Object v10 = 0;
    Object v11 = 0;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = 12.730385926634657D;
    Object v14 = 0;
    Object v15 = 0;
    Object v16 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v13).doubleValue()),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = com.google.javascript.jscomp.Scope.createLatticeBottom(((com.google.javascript.rhino.Node)v16));
    Object v18 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v17));
    Object v19 = new com.google.javascript.jscomp.LinkedFlowScope(((com.google.javascript.jscomp.LinkedFlowScope)v18));
    Object v20 = false;
    Object v21 = ((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v8).getPreciserScopeKnowingConditionOutcome(((com.google.javascript.rhino.Node)v12),((com.google.javascript.jscomp.type.FlowScope)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = 12.730385926634657D;
    Object v23 = 0;
    Object v24 = 0;
    Object v25 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v22).doubleValue()),(((java.lang.Integer)v23).intValue()),(((java.lang.Integer)v24).intValue()));
    Object v26 = com.google.javascript.jscomp.Scope.createLatticeBottom(((com.google.javascript.rhino.Node)v25));
    Object v27 = java.util.Map.of();
    Object v28 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v29 = ((java.util.Map)v27).get(((java.lang.Object)v28));
    Object v30 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v8),((com.google.javascript.jscomp.Scope)v26),((java.util.Map)v27));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.Compiler();
    Object v2 = true;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((com.google.javascript.jscomp.graph.LinkedDirectedGraph)v4).getDirectedGraphNodes();
    Object v6 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v7 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7));
    Object v9 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v6),((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = 12.730385926634657D;
    Object v11 = 0;
    Object v12 = 0;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = com.google.javascript.jscomp.Scope.createLatticeBottom(((com.google.javascript.rhino.Node)v13));
    Object v15 = java.util.Map.of();
    Object v16 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v9),((com.google.javascript.jscomp.Scope)v14),((java.util.Map)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.Compiler();
    Object v2 = true;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = ((com.google.javascript.jscomp.graph.LinkedDirectedGraph)v4).getNode(((java.lang.Object)v5));
    Object v7 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v8 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v8));
    Object v10 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v7),((com.google.javascript.rhino.jstype.JSTypeRegistry)v9));
    Object v11 = 12.730385926634657D;
    Object v12 = 0;
    Object v13 = 0;
    Object v14 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = 12.730385926634657D;
    Object v16 = 0;
    Object v17 = 0;
    Object v18 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v15).doubleValue()),(((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()));
    Object v19 = com.google.javascript.jscomp.Scope.createLatticeBottom(((com.google.javascript.rhino.Node)v18));
    Object v20 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v19));
    Object v21 = new com.google.javascript.jscomp.LinkedFlowScope(((com.google.javascript.jscomp.LinkedFlowScope)v20));
    Object v22 = true;
    Object v23 = ((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v10).getPreciserScopeKnowingConditionOutcome(((com.google.javascript.rhino.Node)v14),((com.google.javascript.jscomp.type.FlowScope)v21),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = 12.730385926634657D;
    Object v25 = 0;
    Object v26 = 0;
    Object v27 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v24).doubleValue()),(((java.lang.Integer)v25).intValue()),(((java.lang.Integer)v26).intValue()));
    Object v28 = com.google.javascript.jscomp.Scope.createLatticeBottom(((com.google.javascript.rhino.Node)v27));
    Object v29 = java.util.Map.of();
    Object v30 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v10),((com.google.javascript.jscomp.Scope)v28),((java.util.Map)v29));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
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
    Object v9 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v6),((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = 12.730385926634657D;
    Object v11 = 0;
    Object v12 = 0;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = com.google.javascript.jscomp.Scope.createLatticeBottom(((com.google.javascript.rhino.Node)v13));
    Object v15 = java.util.Map.of();
    Object v16 = ((java.util.Map)v15).size();
    Object v17 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ControlFlowGraph)v5),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v9),((com.google.javascript.jscomp.Scope)v14),((java.util.Map)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v2 = true;
    Object v3 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v0),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v5 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v6 = true;
    Object v7 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v4),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = ((java.lang.Enum)v7).hashCode();
    Object v9 = true;
    Object v10 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v3),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v7),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v12 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v13 = true;
    Object v14 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v11),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = true;
    Object v16 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v10),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v18 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v19 = true;
    Object v20 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v17),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v22 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v23 = true;
    Object v24 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v21),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v22),(((java.lang.Boolean)v23).booleanValue()));
    Object v25 = ((java.lang.Enum)v24).hashCode();
    Object v26 = true;
    Object v27 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v20),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v24),(((java.lang.Boolean)v26).booleanValue()));
    Object v28 = true;
    Object v29 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v16),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v27),(((java.lang.Boolean)v28).booleanValue()));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY), v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v2 = true;
    Object v3 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v0),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v5 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v6 = true;
    Object v7 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v4),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v9 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v10 = true;
    Object v11 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v8),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = ((java.lang.Enum)v7).compareTo(((java.lang.Enum)v11));
    Object v13 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v14 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v15 = true;
    Object v16 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v13),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = false;
    Object v18 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v7),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v20 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v21 = true;
    Object v22 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v19),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = true;
    Object v24 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v18),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v22),(((java.lang.Boolean)v23).booleanValue()));
    Object v25 = false;
    Object v26 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v3),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v24),(((java.lang.Boolean)v25).booleanValue()));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY), v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 12.730385926634657D;
    Object v2 = 0;
    Object v3 = 0;
    Object v4 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v1).doubleValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = 12.730385926634657D;
    Object v6 = 0;
    Object v7 = 0;
    Object v8 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v5).doubleValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = ((com.google.javascript.rhino.Node)v4).useSourceInfoIfMissingFromForTree(((com.google.javascript.rhino.Node)v8));
    Object v10 = 12.730385926634657D;
    Object v11 = 0;
    Object v12 = 0;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = com.google.javascript.jscomp.Scope.createLatticeBottom(((com.google.javascript.rhino.Node)v13));
    Object v15 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v14));
    Object v16 = new com.google.javascript.jscomp.LinkedFlowScope(((com.google.javascript.jscomp.LinkedFlowScope)v15));
    Object v17 = ((com.google.javascript.jscomp.TypeInference)v0).flowThrough(((com.google.javascript.rhino.Node)v4),((com.google.javascript.jscomp.type.FlowScope)v16));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.Compiler();
    Object v2 = true;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    ((com.google.javascript.jscomp.graph.Graph)v4).clearNodeAnnotations();
    Object v5 = null;
    Object v6 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v7 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7));
    Object v9 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v6),((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = 12.730385926634657D;
    Object v11 = 0;
    Object v12 = 0;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = com.google.javascript.jscomp.Scope.createLatticeBottom(((com.google.javascript.rhino.Node)v13));
    Object v15 = java.util.Map.of();
    Object v16 = ((java.util.Map)v15).size();
    Object v17 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v9),((com.google.javascript.jscomp.Scope)v14),((java.util.Map)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v2 = true;
    Object v3 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v0),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v5 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v6 = true;
    Object v7 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v4),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = ((java.lang.Enum)v7).hashCode();
    Object v9 = true;
    Object v10 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v3),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v7),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v12 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v13 = true;
    Object v14 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v11),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = false;
    Object v16 = ((com.google.javascript.rhino.jstype.BooleanLiteralSet)v14).contains((((java.lang.Boolean)v15).booleanValue()));
    Object v17 = true;
    Object v18 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v10),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v14),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v20 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v21 = true;
    Object v22 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v19),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = true;
    Object v24 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v18),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v22),(((java.lang.Boolean)v23).booleanValue()));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY), v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 12.730385926634657D;
    Object v2 = 0;
    Object v3 = 0;
    Object v4 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v1).doubleValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = 12.730385926634657D;
    Object v6 = 0;
    Object v7 = 0;
    Object v8 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v5).doubleValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = com.google.javascript.jscomp.Scope.createLatticeBottom(((com.google.javascript.rhino.Node)v8));
    Object v10 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v9));
    Object v11 = new com.google.javascript.jscomp.LinkedFlowScope(((com.google.javascript.jscomp.LinkedFlowScope)v10));
    Object v12 = ((com.google.javascript.jscomp.TypeInference)v0).flowThrough(((com.google.javascript.rhino.Node)v4),((com.google.javascript.jscomp.type.FlowScope)v11));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v2 = true;
    Object v3 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v0),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = false;
    Object v5 = ((com.google.javascript.rhino.jstype.BooleanLiteralSet)v3).contains((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v7 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v8 = true;
    Object v9 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v6),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = true;
    Object v11 = ((com.google.javascript.rhino.jstype.BooleanLiteralSet)v9).contains((((java.lang.Boolean)v10).booleanValue()));
    Object v12 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v13 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v14 = true;
    Object v15 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v12),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = false;
    Object v17 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v9),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v19 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v20 = true;
    Object v21 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v18),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = true;
    Object v23 = ((com.google.javascript.rhino.jstype.BooleanLiteralSet)v21).contains((((java.lang.Boolean)v22).booleanValue()));
    Object v24 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v25 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v26 = true;
    Object v27 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v24),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v25),(((java.lang.Boolean)v26).booleanValue()));
    Object v28 = false;
    Object v29 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v21),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v27),(((java.lang.Boolean)v28).booleanValue()));
    Object v30 = true;
    Object v31 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v17),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v29),(((java.lang.Boolean)v30).booleanValue()));
    Object v32 = ((java.lang.Enum)v31).hashCode();
    Object v33 = true;
    Object v34 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v3),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v31),(((java.lang.Boolean)v33).booleanValue()));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY), v34);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ((com.google.javascript.jscomp.TypeInference)v0).createInitialEstimateLattice();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
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
    Object v9 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v6),((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = 12.730385926634657D;
    Object v11 = 0;
    Object v12 = 0;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = com.google.javascript.jscomp.Scope.createLatticeBottom(((com.google.javascript.rhino.Node)v13));
    Object v15 = java.util.Map.of();
    Object v16 = java.util.Map.of();
    Object v17 = ((java.util.Map)v15).equals(((java.lang.Object)v16));
    Object v18 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v9),((com.google.javascript.jscomp.Scope)v14),((java.util.Map)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
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
    Object v9 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v6),((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = 12.730385926634657D;
    Object v11 = 0;
    Object v12 = 0;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = com.google.javascript.jscomp.Scope.createLatticeBottom(((com.google.javascript.rhino.Node)v13));
    Object v15 = ((com.google.javascript.jscomp.Scope)v14).getArgumentsVar();
    Object v16 = java.util.Map.of();
    Object v17 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v18 = ((java.util.Map)v16).get(((java.lang.Object)v17));
    Object v19 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ControlFlowGraph)v5),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v9),((com.google.javascript.jscomp.Scope)v14),((java.util.Map)v16));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v2 = true;
    Object v3 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v0),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v5 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v6 = true;
    Object v7 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v4),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = ((java.lang.Enum)v3).compareTo(((java.lang.Enum)v7));
    Object v9 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v10 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v11 = true;
    Object v12 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v9),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = false;
    Object v14 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v3),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v16 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v17 = true;
    Object v18 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v15),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = true;
    Object v20 = ((com.google.javascript.rhino.jstype.BooleanLiteralSet)v18).contains((((java.lang.Boolean)v19).booleanValue()));
    Object v21 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v22 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v23 = true;
    Object v24 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v21),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v22),(((java.lang.Boolean)v23).booleanValue()));
    Object v25 = false;
    Object v26 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v18),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v24),(((java.lang.Boolean)v25).booleanValue()));
    Object v27 = true;
    Object v28 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v14),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v26),(((java.lang.Boolean)v27).booleanValue()));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY), v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.Compiler();
    Object v2 = true;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((com.google.javascript.jscomp.ControlFlowGraph)v4).toString();
    Object v6 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v7 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7));
    Object v9 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v6),((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = 12.730385926634657D;
    Object v11 = 0;
    Object v12 = 0;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = com.google.javascript.jscomp.Scope.createLatticeBottom(((com.google.javascript.rhino.Node)v13));
    Object v15 = ((com.google.javascript.jscomp.Scope)v14).getVarCount();
    Object v16 = java.util.Map.of();
    Object v17 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v18 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v19 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v20 = true;
    Object v21 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v18),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v23 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v24 = true;
    Object v25 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v22),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v23),(((java.lang.Boolean)v24).booleanValue()));
    Object v26 = ((java.lang.Enum)v25).hashCode();
    Object v27 = true;
    Object v28 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v21),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v25),(((java.lang.Boolean)v27).booleanValue()));
    Object v29 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v30 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v31 = true;
    Object v32 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v29),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v30),(((java.lang.Boolean)v31).booleanValue()));
    Object v33 = true;
    Object v34 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v28),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v32),(((java.lang.Boolean)v33).booleanValue()));
    Object v35 = ((java.util.Map)v16).getOrDefault(((java.lang.Object)v17),((java.lang.Object)v34));
    Object v36 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v9),((com.google.javascript.jscomp.Scope)v14),((java.util.Map)v16));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v2 = true;
    Object v3 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v0),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v5 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v6 = true;
    Object v7 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v4),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v9 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v10 = true;
    Object v11 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v8),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = ((java.lang.Enum)v11).hashCode();
    Object v13 = true;
    Object v14 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v7),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v11),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v16 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v17 = true;
    Object v18 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v15),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v20 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v21 = true;
    Object v22 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v19),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = ((java.lang.Enum)v22).hashCode();
    Object v24 = true;
    Object v25 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v18),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v22),(((java.lang.Boolean)v24).booleanValue()));
    Object v26 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v27 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v28 = true;
    Object v29 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v26),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v27),(((java.lang.Boolean)v28).booleanValue()));
    Object v30 = true;
    Object v31 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v25),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v29),(((java.lang.Boolean)v30).booleanValue()));
    Object v32 = true;
    Object v33 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v14),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v31),(((java.lang.Boolean)v32).booleanValue()));
    Object v34 = false;
    Object v35 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v3),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v33),(((java.lang.Boolean)v34).booleanValue()));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY), v35);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v2 = true;
    Object v3 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v0),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v5 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v6 = true;
    Object v7 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v4),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v9 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v10 = true;
    Object v11 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v8),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = ((java.lang.Enum)v7).compareTo(((java.lang.Enum)v11));
    Object v13 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v14 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v15 = true;
    Object v16 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v13),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = false;
    Object v18 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v7),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = true;
    Object v20 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v3),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v18),(((java.lang.Boolean)v19).booleanValue()));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY), v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v2 = true;
    Object v3 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v0),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v5 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v6 = true;
    Object v7 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v4),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = ((java.lang.Enum)v7).hashCode();
    Object v9 = true;
    Object v10 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v3),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v7),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v12 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v13 = true;
    Object v14 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v11),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = true;
    Object v16 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v10),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v18 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v19 = true;
    Object v20 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v17),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = ((java.lang.Enum)v20).getDeclaringClass();
    Object v22 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v23 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v24 = true;
    Object v25 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v22),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v23),(((java.lang.Boolean)v24).booleanValue()));
    Object v26 = false;
    Object v27 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v20),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v25),(((java.lang.Boolean)v26).booleanValue()));
    Object v28 = false;
    Object v29 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v16),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v27),(((java.lang.Boolean)v28).booleanValue()));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY), v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
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
    Object v9 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v6),((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = 12.730385926634657D;
    Object v11 = 0;
    Object v12 = 0;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = com.google.javascript.jscomp.Scope.createLatticeBottom(((com.google.javascript.rhino.Node)v13));
    Object v15 = java.util.Map.of();
    Object v16 = ((java.util.Map)v15).isEmpty();
    Object v17 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v9),((com.google.javascript.jscomp.Scope)v14),((java.util.Map)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 12.730385926634657D;
    Object v2 = 0;
    Object v3 = 0;
    Object v4 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v1).doubleValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = ((com.google.javascript.rhino.Node)v4).getLength();
    Object v6 = 12.730385926634657D;
    Object v7 = 0;
    Object v8 = 0;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = com.google.javascript.jscomp.Scope.createLatticeBottom(((com.google.javascript.rhino.Node)v9));
    Object v11 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v10));
    Object v12 = new com.google.javascript.jscomp.LinkedFlowScope(((com.google.javascript.jscomp.LinkedFlowScope)v11));
    Object v13 = ((com.google.javascript.jscomp.TypeInference)v0).branchedFlowThrough(((com.google.javascript.rhino.Node)v4),((com.google.javascript.jscomp.type.FlowScope)v12));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v2 = true;
    Object v3 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v0),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((java.lang.Enum)v3).getDeclaringClass();
    Object v5 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v6 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v7 = true;
    Object v8 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v5),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = false;
    Object v10 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v3),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = ((java.lang.Enum)v10).getDeclaringClass();
    Object v12 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v13 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v14 = true;
    Object v15 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v12),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = true;
    Object v17 = ((com.google.javascript.rhino.jstype.BooleanLiteralSet)v15).contains((((java.lang.Boolean)v16).booleanValue()));
    Object v18 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v19 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v20 = true;
    Object v21 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v18),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = false;
    Object v23 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v15),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v21),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v25 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v26 = true;
    Object v27 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v24),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v25),(((java.lang.Boolean)v26).booleanValue()));
    Object v28 = true;
    Object v29 = ((com.google.javascript.rhino.jstype.BooleanLiteralSet)v27).contains((((java.lang.Boolean)v28).booleanValue()));
    Object v30 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v31 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v32 = true;
    Object v33 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v30),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v31),(((java.lang.Boolean)v32).booleanValue()));
    Object v34 = false;
    Object v35 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v27),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v33),(((java.lang.Boolean)v34).booleanValue()));
    Object v36 = true;
    Object v37 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v23),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v35),(((java.lang.Boolean)v36).booleanValue()));
    Object v38 = true;
    Object v39 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v10),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v37),(((java.lang.Boolean)v38).booleanValue()));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY), v39);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.Compiler();
    Object v2 = true;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((com.google.javascript.jscomp.graph.LinkedDirectedGraph)v4).getEdges();
    Object v6 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v7 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7));
    Object v9 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v6),((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = 12.730385926634657D;
    Object v11 = 0;
    Object v12 = 0;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = com.google.javascript.jscomp.Scope.createLatticeBottom(((com.google.javascript.rhino.Node)v13));
    Object v15 = java.util.Map.of();
    Object v16 = ((java.util.Map)v15).values();
    Object v17 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v9),((com.google.javascript.jscomp.Scope)v14),((java.util.Map)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.Compiler();
    Object v2 = true;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = 12.730385926634657D;
    Object v10 = 0;
    Object v11 = 0;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = com.google.javascript.jscomp.Scope.createLatticeBottom(((com.google.javascript.rhino.Node)v12));
    Object v14 = ((com.google.javascript.jscomp.Scope)v13).getAllSymbols();
    Object v15 = java.util.Map.of();
    Object v16 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v8),((com.google.javascript.jscomp.Scope)v13),((java.util.Map)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v2 = true;
    Object v3 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v0),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((java.lang.Enum)v3).getDeclaringClass();
    Object v5 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v6 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v7 = true;
    Object v8 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v5),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = false;
    Object v10 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v3),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v12 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v13 = true;
    Object v14 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v11),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v16 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v17 = true;
    Object v18 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v15),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = ((java.lang.Enum)v14).compareTo(((java.lang.Enum)v18));
    Object v20 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v21 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v22 = true;
    Object v23 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v20),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v21),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = false;
    Object v25 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v14),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v23),(((java.lang.Boolean)v24).booleanValue()));
    Object v26 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v27 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v28 = true;
    Object v29 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v26),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v27),(((java.lang.Boolean)v28).booleanValue()));
    Object v30 = false;
    Object v31 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v25),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v29),(((java.lang.Boolean)v30).booleanValue()));
    Object v32 = true;
    Object v33 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v10),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v31),(((java.lang.Boolean)v32).booleanValue()));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY), v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.Compiler();
    Object v2 = true;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((com.google.javascript.jscomp.ControlFlowGraph)v4).toString();
    Object v6 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v7 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7));
    Object v9 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v6),((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = 12.730385926634657D;
    Object v11 = 0;
    Object v12 = 0;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = com.google.javascript.jscomp.Scope.createLatticeBottom(((com.google.javascript.rhino.Node)v13));
    Object v15 = java.util.Map.of();
    Object v16 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v9),((com.google.javascript.jscomp.Scope)v14),((java.util.Map)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.Compiler();
    Object v2 = true;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = "T";
    Object v6 = new com.google.javascript.rhino.InputId(((java.lang.String)v5));
    Object v7 = ((com.google.javascript.jscomp.graph.LinkedDirectedGraph)v4).getNode(((java.lang.Object)v6));
    Object v8 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v9 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v9));
    Object v11 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v8),((com.google.javascript.rhino.jstype.JSTypeRegistry)v10));
    Object v12 = 12.730385926634657D;
    Object v13 = 0;
    Object v14 = 0;
    Object v15 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v12).doubleValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = com.google.javascript.jscomp.Scope.createLatticeBottom(((com.google.javascript.rhino.Node)v15));
    Object v17 = ((com.google.javascript.jscomp.Scope)v16).getDeclarativelyUnboundVarsWithoutTypes();
    Object v18 = java.util.Map.of();
    Object v19 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v11),((com.google.javascript.jscomp.Scope)v16),((java.util.Map)v18));
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
    Object v8 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = 12.730385926634657D;
    Object v10 = 0;
    Object v11 = 0;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = com.google.javascript.jscomp.Scope.createLatticeBottom(((com.google.javascript.rhino.Node)v12));
    Object v14 = ".prototype";
    Object v15 = ((com.google.javascript.jscomp.Scope)v13).getOwnSlot(((java.lang.String)v14));
    Object v16 = java.util.Map.of();
    Object v17 = ((java.util.Map)v16).values();
    Object v18 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v8),((com.google.javascript.jscomp.Scope)v13),((java.util.Map)v16));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.Compiler();
    Object v2 = true;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = 12.730385926634657D;
    Object v10 = 0;
    Object v11 = 0;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = com.google.javascript.jscomp.Scope.createLatticeBottom(((com.google.javascript.rhino.Node)v12));
    Object v14 = java.util.Map.of();
    Object v15 = ((java.util.Map)v14).isEmpty();
    Object v16 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v8),((com.google.javascript.jscomp.Scope)v13),((java.util.Map)v14));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
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
    Object v9 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v6),((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = 12.730385926634657D;
    Object v11 = 0;
    Object v12 = 0;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = 12.730385926634657D;
    Object v15 = 0;
    Object v16 = 0;
    Object v17 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v14).doubleValue()),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = com.google.javascript.jscomp.Scope.createLatticeBottom(((com.google.javascript.rhino.Node)v17));
    Object v19 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v18));
    Object v20 = false;
    Object v21 = ((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v9).getPreciserScopeKnowingConditionOutcome(((com.google.javascript.rhino.Node)v13),((com.google.javascript.jscomp.type.FlowScope)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = 12.730385926634657D;
    Object v23 = 0;
    Object v24 = 0;
    Object v25 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v22).doubleValue()),(((java.lang.Integer)v23).intValue()),(((java.lang.Integer)v24).intValue()));
    Object v26 = com.google.javascript.jscomp.Scope.createLatticeBottom(((com.google.javascript.rhino.Node)v25));
    Object v27 = java.util.Map.of();
    Object v28 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v9),((com.google.javascript.jscomp.Scope)v26),((java.util.Map)v27));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.Compiler();
    Object v2 = true;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = 12.730385926634657D;
    Object v10 = 0;
    Object v11 = 0;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = 12.730385926634657D;
    Object v14 = 0;
    Object v15 = 0;
    Object v16 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v13).doubleValue()),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = com.google.javascript.jscomp.Scope.createLatticeBottom(((com.google.javascript.rhino.Node)v16));
    Object v18 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v17));
    Object v19 = false;
    Object v20 = ((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v8).getPreciserScopeKnowingConditionOutcome(((com.google.javascript.rhino.Node)v12),((com.google.javascript.jscomp.type.FlowScope)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = 12.730385926634657D;
    Object v22 = 0;
    Object v23 = 0;
    Object v24 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v21).doubleValue()),(((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()));
    Object v25 = com.google.javascript.jscomp.Scope.createLatticeBottom(((com.google.javascript.rhino.Node)v24));
    Object v26 = java.util.Map.of();
    Object v27 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v8),((com.google.javascript.jscomp.Scope)v25),((java.util.Map)v26));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.Compiler();
    Object v2 = true;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((com.google.javascript.jscomp.graph.LinkedDirectedGraph)v4).getEdges();
    Object v6 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v7 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7));
    Object v9 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v6),((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = 12.730385926634657D;
    Object v11 = 0;
    Object v12 = 0;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = com.google.javascript.jscomp.Scope.createLatticeBottom(((com.google.javascript.rhino.Node)v13));
    Object v15 = java.util.Map.of();
    Object v16 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v9),((com.google.javascript.jscomp.Scope)v14),((java.util.Map)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v2 = true;
    Object v3 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v0),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((java.lang.Enum)v3).getDeclaringClass();
    Object v5 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v6 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v7 = true;
    Object v8 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v5),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = false;
    Object v10 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v3),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v12 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v13 = true;
    Object v14 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v11),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v16 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v17 = true;
    Object v18 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v15),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v20 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v21 = true;
    Object v22 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v19),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = ((java.lang.Enum)v18).compareTo(((java.lang.Enum)v22));
    Object v24 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v25 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v26 = true;
    Object v27 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v24),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v25),(((java.lang.Boolean)v26).booleanValue()));
    Object v28 = false;
    Object v29 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v18),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v27),(((java.lang.Boolean)v28).booleanValue()));
    Object v30 = true;
    Object v31 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v14),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v29),(((java.lang.Boolean)v30).booleanValue()));
    Object v32 = true;
    Object v33 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v10),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v31),(((java.lang.Boolean)v32).booleanValue()));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY), v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = 12.730385926634657D;
    Object v2 = 0;
    Object v3 = 0;
    Object v4 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v1).doubleValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = "";
    Object v6 = "";
    Object v7 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = new java.lang.String[]{"]","j"};
    Object v9 = com.google.javascript.jscomp.JSError.make(((com.google.javascript.rhino.Node)v4),((com.google.javascript.jscomp.DiagnosticType)v7),((java.lang.String[])v8));
    ((com.google.javascript.jscomp.AbstractCompiler)v0).report(((com.google.javascript.jscomp.JSError)v9));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Compiler();
    Object v12 = true;
    Object v13 = false;
    Object v14 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v11),(((java.lang.Boolean)v12).booleanValue()),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v16 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v16));
    Object v18 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v15),((com.google.javascript.rhino.jstype.JSTypeRegistry)v17));
    Object v19 = 12.730385926634657D;
    Object v20 = 0;
    Object v21 = 0;
    Object v22 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v19).doubleValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()));
    Object v23 = com.google.javascript.jscomp.Scope.createLatticeBottom(((com.google.javascript.rhino.Node)v22));
    Object v24 = java.util.Map.of();
    Object v25 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ControlFlowGraph)v14),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v18),((com.google.javascript.jscomp.Scope)v23),((java.util.Map)v24));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v2 = true;
    Object v3 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v0),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v5 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v6 = true;
    Object v7 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v4),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v9 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v10 = true;
    Object v11 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v8),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = ((java.lang.Enum)v7).compareTo(((java.lang.Enum)v11));
    Object v13 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v14 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v15 = true;
    Object v16 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v13),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = false;
    Object v18 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v7),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = true;
    Object v20 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v3),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v22 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v23 = true;
    Object v24 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v21),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v22),(((java.lang.Boolean)v23).booleanValue()));
    Object v25 = false;
    Object v26 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v20),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v24),(((java.lang.Boolean)v25).booleanValue()));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY), v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v2 = true;
    Object v3 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v0),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v5 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v6 = true;
    Object v7 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v4),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v9 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v10 = true;
    Object v11 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v8),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = ((java.lang.Enum)v7).compareTo(((java.lang.Enum)v11));
    Object v13 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v14 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v15 = true;
    Object v16 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v13),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = false;
    Object v18 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v7),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = true;
    Object v20 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v3),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v22 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v23 = true;
    Object v24 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v21),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v22),(((java.lang.Boolean)v23).booleanValue()));
    Object v25 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v26 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v27 = true;
    Object v28 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v25),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v26),(((java.lang.Boolean)v27).booleanValue()));
    Object v29 = ((java.lang.Enum)v28).hashCode();
    Object v30 = true;
    Object v31 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v24),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v28),(((java.lang.Boolean)v30).booleanValue()));
    Object v32 = false;
    Object v33 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v20),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v31),(((java.lang.Boolean)v32).booleanValue()));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY), v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.Compiler();
    Object v2 = true;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = 12.730385926634657D;
    Object v10 = 0;
    Object v11 = 0;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = 12.730385926634657D;
    Object v14 = 0;
    Object v15 = 0;
    Object v16 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v13).doubleValue()),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = com.google.javascript.jscomp.Scope.createLatticeBottom(((com.google.javascript.rhino.Node)v16));
    Object v18 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v17));
    Object v19 = true;
    Object v20 = ((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v8).getPreciserScopeKnowingConditionOutcome(((com.google.javascript.rhino.Node)v12),((com.google.javascript.jscomp.type.FlowScope)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = 12.730385926634657D;
    Object v22 = 0;
    Object v23 = 0;
    Object v24 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v21).doubleValue()),(((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()));
    Object v25 = com.google.javascript.jscomp.Scope.createLatticeBottom(((com.google.javascript.rhino.Node)v24));
    Object v26 = java.util.Map.of();
    Object v27 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v8),((com.google.javascript.jscomp.Scope)v25),((java.util.Map)v26));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.Compiler();
    Object v2 = true;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = 12.730385926634657D;
    Object v10 = 0;
    Object v11 = 0;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = com.google.javascript.jscomp.Scope.createLatticeBottom(((com.google.javascript.rhino.Node)v12));
    Object v14 = "RETUR";
    Object v15 = true;
    Object v16 = ((com.google.javascript.jscomp.Scope)v13).isDeclared(((java.lang.String)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = java.util.Map.of();
    Object v18 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v8),((com.google.javascript.jscomp.Scope)v13),((java.util.Map)v17));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
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
    Object v9 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v6),((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = 12.730385926634657D;
    Object v11 = 0;
    Object v12 = 0;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = com.google.javascript.jscomp.Scope.createLatticeBottom(((com.google.javascript.rhino.Node)v13));
    Object v15 = ((com.google.javascript.jscomp.Scope)v14).getTypeOfThis();
    Object v16 = java.util.Map.of();
    Object v17 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v9),((com.google.javascript.jscomp.Scope)v14),((java.util.Map)v16));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.Compiler();
    Object v2 = true;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((com.google.javascript.jscomp.graph.LinkedDirectedGraph)v4).getEdges();
    Object v6 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v7 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7));
    Object v9 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v6),((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = 12.730385926634657D;
    Object v11 = 0;
    Object v12 = 0;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = 12.730385926634657D;
    Object v15 = 0;
    Object v16 = 0;
    Object v17 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v14).doubleValue()),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = com.google.javascript.jscomp.Scope.createLatticeBottom(((com.google.javascript.rhino.Node)v17));
    Object v19 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v18));
    Object v20 = new com.google.javascript.jscomp.LinkedFlowScope(((com.google.javascript.jscomp.LinkedFlowScope)v19));
    Object v21 = false;
    Object v22 = ((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v9).getPreciserScopeKnowingConditionOutcome(((com.google.javascript.rhino.Node)v13),((com.google.javascript.jscomp.type.FlowScope)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = 12.730385926634657D;
    Object v24 = 0;
    Object v25 = 0;
    Object v26 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v23).doubleValue()),(((java.lang.Integer)v24).intValue()),(((java.lang.Integer)v25).intValue()));
    Object v27 = com.google.javascript.jscomp.Scope.createLatticeBottom(((com.google.javascript.rhino.Node)v26));
    Object v28 = java.util.Map.of();
    Object v29 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v9),((com.google.javascript.jscomp.Scope)v27),((java.util.Map)v28));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 12.730385926634657D;
    Object v2 = 0;
    Object v3 = 0;
    Object v4 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v1).doubleValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = 12.730385926634657D;
    Object v6 = 0;
    Object v7 = 0;
    Object v8 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v5).doubleValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = com.google.javascript.jscomp.Scope.createLatticeBottom(((com.google.javascript.rhino.Node)v8));
    Object v10 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v9));
    Object v11 = ((com.google.javascript.jscomp.TypeInference)v0).branchedFlowThrough(((com.google.javascript.rhino.Node)v4),((com.google.javascript.jscomp.type.FlowScope)v10));
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
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = ((com.google.javascript.jscomp.graph.LinkedDirectedGraph)v4).getNode(((java.lang.Object)v5));
    Object v7 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v8 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v8));
    Object v10 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v7),((com.google.javascript.rhino.jstype.JSTypeRegistry)v9));
    Object v11 = 12.730385926634657D;
    Object v12 = 0;
    Object v13 = 0;
    Object v14 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = com.google.javascript.jscomp.Scope.createLatticeBottom(((com.google.javascript.rhino.Node)v14));
    Object v16 = java.util.Map.of();
    Object v17 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v10),((com.google.javascript.jscomp.Scope)v15),((java.util.Map)v16));
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
    Object v8 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = 12.730385926634657D;
    Object v10 = 0;
    Object v11 = 0;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = com.google.javascript.jscomp.Scope.createLatticeBottom(((com.google.javascript.rhino.Node)v12));
    Object v14 = java.util.Map.of();
    Object v15 = java.util.Map.of();
    Object v16 = ((java.util.Map)v14).containsValue(((java.lang.Object)v15));
    Object v17 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v8),((com.google.javascript.jscomp.Scope)v13),((java.util.Map)v14));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v2 = true;
    Object v3 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v0),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v5 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v6 = true;
    Object v7 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v4),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = ((java.lang.Enum)v7).hashCode();
    Object v9 = true;
    Object v10 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v3),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v7),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v12 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v13 = true;
    Object v14 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v11),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = true;
    Object v16 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v10),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v18 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v19 = true;
    Object v20 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v17),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = ((java.lang.Enum)v20).hashCode();
    Object v22 = true;
    Object v23 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v16),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v20),(((java.lang.Boolean)v22).booleanValue()));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY), v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.Compiler();
    Object v2 = true;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = 12.730385926634657D;
    Object v10 = 0;
    Object v11 = 0;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = com.google.javascript.jscomp.Scope.createLatticeBottom(((com.google.javascript.rhino.Node)v12));
    Object v14 = "U";
    Object v15 = ((com.google.javascript.jscomp.Scope)v13).getSlot(((java.lang.String)v14));
    Object v16 = java.util.Map.of();
    Object v17 = ((java.util.Map)v16).hashCode();
    Object v18 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v8),((com.google.javascript.jscomp.Scope)v13),((java.util.Map)v16));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v2 = true;
    Object v3 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v0),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v5 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v6 = true;
    Object v7 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v4),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = ((java.lang.Enum)v3).compareTo(((java.lang.Enum)v7));
    Object v9 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v10 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v11 = true;
    Object v12 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v9),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = false;
    Object v14 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v3),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v16 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v17 = true;
    Object v18 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v15),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = true;
    Object v20 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v14),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v22 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v23 = true;
    Object v24 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v21),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v22),(((java.lang.Boolean)v23).booleanValue()));
    Object v25 = true;
    Object v26 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v20),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v24),(((java.lang.Boolean)v25).booleanValue()));
    Object v27 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v28 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v29 = true;
    Object v30 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v27),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v28),(((java.lang.Boolean)v29).booleanValue()));
    Object v31 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v32 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v33 = true;
    Object v34 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v31),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v32),(((java.lang.Boolean)v33).booleanValue()));
    Object v35 = ((java.lang.Enum)v34).hashCode();
    Object v36 = true;
    Object v37 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v30),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v34),(((java.lang.Boolean)v36).booleanValue()));
    Object v38 = true;
    Object v39 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v26),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v37),(((java.lang.Boolean)v38).booleanValue()));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY), v39);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.Compiler();
    Object v2 = true;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = 12.730385926634657D;
    Object v10 = 0;
    Object v11 = 0;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = com.google.javascript.jscomp.Scope.createLatticeBottom(((com.google.javascript.rhino.Node)v12));
    Object v14 = ((com.google.javascript.jscomp.Scope)v13).getVars();
    Object v15 = java.util.Map.of();
    Object v16 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v8),((com.google.javascript.jscomp.Scope)v13),((java.util.Map)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = true;
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v7 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7));
    Object v9 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v6),((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = 12.730385926634657D;
    Object v11 = 0;
    Object v12 = 0;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = com.google.javascript.jscomp.Scope.createLatticeBottom(((com.google.javascript.rhino.Node)v13));
    Object v15 = java.util.Map.of();
    Object v16 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ControlFlowGraph)v5),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v9),((com.google.javascript.jscomp.Scope)v14),((java.util.Map)v15));
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
    Object v5 = ((com.google.javascript.jscomp.graph.LinkedDirectedGraph)v4).getGraphvizEdges();
    Object v6 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v7 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7));
    Object v9 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v6),((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = 12.730385926634657D;
    Object v11 = 0;
    Object v12 = 0;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = 12.730385926634657D;
    Object v15 = 0;
    Object v16 = 0;
    Object v17 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v14).doubleValue()),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = com.google.javascript.jscomp.Scope.createLatticeBottom(((com.google.javascript.rhino.Node)v17));
    Object v19 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v18));
    Object v20 = new com.google.javascript.jscomp.LinkedFlowScope(((com.google.javascript.jscomp.LinkedFlowScope)v19));
    Object v21 = true;
    Object v22 = ((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v9).getPreciserScopeKnowingConditionOutcome(((com.google.javascript.rhino.Node)v13),((com.google.javascript.jscomp.type.FlowScope)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = 12.730385926634657D;
    Object v24 = 0;
    Object v25 = 0;
    Object v26 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v23).doubleValue()),(((java.lang.Integer)v24).intValue()),(((java.lang.Integer)v25).intValue()));
    Object v27 = com.google.javascript.jscomp.Scope.createLatticeBottom(((com.google.javascript.rhino.Node)v26));
    Object v28 = java.util.Map.of();
    Object v29 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v9),((com.google.javascript.jscomp.Scope)v27),((java.util.Map)v28));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v2 = true;
    Object v3 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v0),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v5 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v6 = true;
    Object v7 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v4),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v9 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v10 = true;
    Object v11 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v8),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = ((java.lang.Enum)v11).hashCode();
    Object v13 = true;
    Object v14 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v7),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v11),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v16 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v17 = true;
    Object v18 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v15),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = true;
    Object v20 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v14),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v22 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v23 = true;
    Object v24 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v21),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v22),(((java.lang.Boolean)v23).booleanValue()));
    Object v25 = ((java.lang.Enum)v24).hashCode();
    Object v26 = true;
    Object v27 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v20),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v24),(((java.lang.Boolean)v26).booleanValue()));
    Object v28 = ((java.lang.Enum)v27).hashCode();
    Object v29 = false;
    Object v30 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v3),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v27),(((java.lang.Boolean)v29).booleanValue()));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY), v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.Compiler();
    Object v2 = true;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = 12.730385926634657D;
    Object v10 = 0;
    Object v11 = 0;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = com.google.javascript.jscomp.Scope.createLatticeBottom(((com.google.javascript.rhino.Node)v12));
    Object v14 = "<";
    Object v15 = false;
    Object v16 = ((com.google.javascript.jscomp.Scope)v13).isDeclared(((java.lang.String)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = java.util.Map.of();
    Object v18 = ((java.util.Map)v17).entrySet();
    Object v19 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v8),((com.google.javascript.jscomp.Scope)v13),((java.util.Map)v17));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTopScope();
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = true;
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = java.util.Map.of();
    Object v7 = ((com.google.javascript.jscomp.graph.LinkedDirectedGraph)v5).createDirectedGraphNode(((java.lang.Object)v6));
    Object v8 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v9 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v9));
    Object v11 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v8),((com.google.javascript.rhino.jstype.JSTypeRegistry)v10));
    Object v12 = 12.730385926634657D;
    Object v13 = 0;
    Object v14 = 0;
    Object v15 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v12).doubleValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = com.google.javascript.jscomp.Scope.createLatticeBottom(((com.google.javascript.rhino.Node)v15));
    Object v17 = java.util.Map.of();
    Object v18 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ControlFlowGraph)v5),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v11),((com.google.javascript.jscomp.Scope)v16),((java.util.Map)v17));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v2 = true;
    Object v3 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v0),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((java.lang.Enum)v3).getDeclaringClass();
    Object v5 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v6 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v7 = true;
    Object v8 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v5),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = false;
    Object v10 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v3),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v12 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v13 = true;
    Object v14 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v11),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = true;
    Object v16 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v10),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v14),(((java.lang.Boolean)v15).booleanValue()));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v2 = true;
    Object v3 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v0),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v5 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v6 = true;
    Object v7 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v4),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = ((java.lang.Enum)v3).compareTo(((java.lang.Enum)v7));
    Object v9 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v10 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v11 = true;
    Object v12 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v9),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = false;
    Object v14 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v3),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v16 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v17 = true;
    Object v18 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v15),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = true;
    Object v20 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v14),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v22 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v23 = true;
    Object v24 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v21),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v22),(((java.lang.Boolean)v23).booleanValue()));
    Object v25 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v26 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v27 = true;
    Object v28 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v25),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v26),(((java.lang.Boolean)v27).booleanValue()));
    Object v29 = ((java.lang.Enum)v28).hashCode();
    Object v30 = true;
    Object v31 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v24),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v28),(((java.lang.Boolean)v30).booleanValue()));
    Object v32 = true;
    Object v33 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v20),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v31),(((java.lang.Boolean)v32).booleanValue()));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY), v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
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
    Object v9 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v6),((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = 12.730385926634657D;
    Object v11 = 0;
    Object v12 = 0;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = 12.730385926634657D;
    Object v15 = 0;
    Object v16 = 0;
    Object v17 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v14).doubleValue()),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = com.google.javascript.jscomp.Scope.createLatticeBottom(((com.google.javascript.rhino.Node)v17));
    Object v19 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v18));
    Object v20 = new com.google.javascript.jscomp.LinkedFlowScope(((com.google.javascript.jscomp.LinkedFlowScope)v19));
    Object v21 = true;
    Object v22 = ((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v9).getPreciserScopeKnowingConditionOutcome(((com.google.javascript.rhino.Node)v13),((com.google.javascript.jscomp.type.FlowScope)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = 12.730385926634657D;
    Object v24 = 0;
    Object v25 = 0;
    Object v26 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v23).doubleValue()),(((java.lang.Integer)v24).intValue()),(((java.lang.Integer)v25).intValue()));
    Object v27 = com.google.javascript.jscomp.Scope.createLatticeBottom(((com.google.javascript.rhino.Node)v26));
    Object v28 = java.util.Map.of();
    Object v29 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v9),((com.google.javascript.jscomp.Scope)v27),((java.util.Map)v28));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v2 = true;
    Object v3 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v0),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((java.lang.Enum)v3).getDeclaringClass();
    Object v5 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v6 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v7 = true;
    Object v8 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v5),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = false;
    Object v10 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v3),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v12 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v13 = true;
    Object v14 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v11),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = true;
    Object v16 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v10),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v18 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v19 = true;
    Object v20 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v17),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v22 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v23 = true;
    Object v24 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v21),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v22),(((java.lang.Boolean)v23).booleanValue()));
    Object v25 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v26 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v27 = true;
    Object v28 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v25),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v26),(((java.lang.Boolean)v27).booleanValue()));
    Object v29 = ((java.lang.Enum)v24).compareTo(((java.lang.Enum)v28));
    Object v30 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v31 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v32 = true;
    Object v33 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v30),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v31),(((java.lang.Boolean)v32).booleanValue()));
    Object v34 = false;
    Object v35 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v24),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v33),(((java.lang.Boolean)v34).booleanValue()));
    Object v36 = true;
    Object v37 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v20),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v35),(((java.lang.Boolean)v36).booleanValue()));
    Object v38 = true;
    Object v39 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v16),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v37),(((java.lang.Boolean)v38).booleanValue()));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY), v39);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.Compiler();
    Object v2 = true;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    ((com.google.javascript.jscomp.graph.Graph)v4).clearNodeAnnotations();
    Object v5 = null;
    Object v6 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v7 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7));
    Object v9 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v6),((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = 12.730385926634657D;
    Object v11 = 0;
    Object v12 = 0;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = com.google.javascript.jscomp.Scope.createLatticeBottom(((com.google.javascript.rhino.Node)v13));
    Object v15 = ((com.google.javascript.jscomp.Scope)v14).getDeclarativelyUnboundVarsWithoutTypes();
    Object v16 = java.util.Map.of();
    Object v17 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v9),((com.google.javascript.jscomp.Scope)v14),((java.util.Map)v16));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.Compiler();
    Object v2 = true;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = 12.730385926634657D;
    Object v10 = 0;
    Object v11 = 0;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = 12.730385926634657D;
    Object v14 = 0;
    Object v15 = 0;
    Object v16 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v13).doubleValue()),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = com.google.javascript.jscomp.Scope.createLatticeBottom(((com.google.javascript.rhino.Node)v16));
    Object v18 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v17));
    Object v19 = new com.google.javascript.jscomp.LinkedFlowScope(((com.google.javascript.jscomp.LinkedFlowScope)v18));
    Object v20 = false;
    Object v21 = ((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v8).getPreciserScopeKnowingConditionOutcome(((com.google.javascript.rhino.Node)v12),((com.google.javascript.jscomp.type.FlowScope)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = 12.730385926634657D;
    Object v23 = 0;
    Object v24 = 0;
    Object v25 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v22).doubleValue()),(((java.lang.Integer)v23).intValue()),(((java.lang.Integer)v24).intValue()));
    Object v26 = com.google.javascript.jscomp.Scope.createLatticeBottom(((com.google.javascript.rhino.Node)v25));
    Object v27 = java.util.Map.of();
    Object v28 = ((java.util.Map)v27).keySet();
    Object v29 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v8),((com.google.javascript.jscomp.Scope)v26),((java.util.Map)v27));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v2 = true;
    Object v3 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v0),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v5 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v6 = true;
    Object v7 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v4),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v9 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v10 = true;
    Object v11 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v8),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = ((java.lang.Enum)v7).compareTo(((java.lang.Enum)v11));
    Object v13 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v14 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v15 = true;
    Object v16 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v13),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = false;
    Object v18 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v7),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v20 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v21 = true;
    Object v22 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v19),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = true;
    Object v24 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v18),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v22),(((java.lang.Boolean)v23).booleanValue()));
    Object v25 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v26 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v27 = true;
    Object v28 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v25),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v26),(((java.lang.Boolean)v27).booleanValue()));
    Object v29 = true;
    Object v30 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v24),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v28),(((java.lang.Boolean)v29).booleanValue()));
    Object v31 = false;
    Object v32 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v3),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v30),(((java.lang.Boolean)v31).booleanValue()));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY), v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.Compiler();
    Object v2 = true;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    ((com.google.javascript.jscomp.graph.Graph)v4).pushEdgeAnnotations();
    Object v5 = null;
    Object v6 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v7 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7));
    Object v9 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v6),((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = 12.730385926634657D;
    Object v11 = 0;
    Object v12 = 0;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = com.google.javascript.jscomp.Scope.createLatticeBottom(((com.google.javascript.rhino.Node)v13));
    Object v15 = ((com.google.javascript.jscomp.Scope)v14).getVars();
    Object v16 = java.util.Map.of();
    Object v17 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v9),((com.google.javascript.jscomp.Scope)v14),((java.util.Map)v16));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.Compiler();
    Object v2 = true;
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = "T";
    Object v6 = new com.google.javascript.rhino.InputId(((java.lang.String)v5));
    Object v7 = ((com.google.javascript.jscomp.graph.LinkedDirectedGraph)v4).createNode(((java.lang.Object)v6));
    Object v8 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v9 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v9));
    Object v11 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v8),((com.google.javascript.rhino.jstype.JSTypeRegistry)v10));
    Object v12 = 12.730385926634657D;
    Object v13 = 0;
    Object v14 = 0;
    Object v15 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v12).doubleValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = 12.730385926634657D;
    Object v17 = 0;
    Object v18 = 0;
    Object v19 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v16).doubleValue()),(((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()));
    Object v20 = com.google.javascript.jscomp.Scope.createLatticeBottom(((com.google.javascript.rhino.Node)v19));
    Object v21 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v20));
    Object v22 = true;
    Object v23 = ((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v11).getPreciserScopeKnowingConditionOutcome(((com.google.javascript.rhino.Node)v15),((com.google.javascript.jscomp.type.FlowScope)v21),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = 12.730385926634657D;
    Object v25 = 0;
    Object v26 = 0;
    Object v27 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v24).doubleValue()),(((java.lang.Integer)v25).intValue()),(((java.lang.Integer)v26).intValue()));
    Object v28 = com.google.javascript.jscomp.Scope.createLatticeBottom(((com.google.javascript.rhino.Node)v27));
    Object v29 = java.util.Map.of();
    Object v30 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v11),((com.google.javascript.jscomp.Scope)v28),((java.util.Map)v29));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = 12.730385926634657D;
    Object v2 = 0;
    Object v3 = 0;
    Object v4 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v1).doubleValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = "";
    Object v6 = "";
    Object v7 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = new java.lang.String[]{"]","j"};
    Object v9 = com.google.javascript.jscomp.JSError.make(((com.google.javascript.rhino.Node)v4),((com.google.javascript.jscomp.DiagnosticType)v7),((java.lang.String[])v8));
    ((com.google.javascript.jscomp.AbstractCompiler)v0).report(((com.google.javascript.jscomp.JSError)v9));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Compiler();
    Object v12 = true;
    Object v13 = false;
    Object v14 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v11),(((java.lang.Boolean)v12).booleanValue()),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v16 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v16));
    Object v18 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v15),((com.google.javascript.rhino.jstype.JSTypeRegistry)v17));
    Object v19 = 12.730385926634657D;
    Object v20 = 0;
    Object v21 = 0;
    Object v22 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v19).doubleValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()));
    Object v23 = com.google.javascript.jscomp.Scope.createLatticeBottom(((com.google.javascript.rhino.Node)v22));
    Object v24 = 12.730385926634657D;
    Object v25 = 0;
    Object v26 = 0;
    Object v27 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v24).doubleValue()),(((java.lang.Integer)v25).intValue()),(((java.lang.Integer)v26).intValue()));
    Object v28 = com.google.javascript.jscomp.Scope.createLatticeBottom(((com.google.javascript.rhino.Node)v27));
    Object v29 = new com.google.javascript.jscomp.Scope.Arguments(((com.google.javascript.jscomp.Scope)v28));
    Object v30 = ((com.google.javascript.jscomp.Scope)v23).getReferences(((com.google.javascript.jscomp.Scope.Var)v29));
    Object v31 = java.util.Map.of();
    Object v32 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ControlFlowGraph)v14),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v18),((com.google.javascript.jscomp.Scope)v23),((java.util.Map)v31));
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
    Object v5 = ((com.google.javascript.jscomp.graph.LinkedDirectedGraph)v4).getNodes();
    Object v6 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v7 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7));
    Object v9 = new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v6),((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = 12.730385926634657D;
    Object v11 = 0;
    Object v12 = 0;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = com.google.javascript.jscomp.Scope.createLatticeBottom(((com.google.javascript.rhino.Node)v13));
    Object v15 = java.util.Map.of();
    Object v16 = new com.google.javascript.jscomp.TypeInference(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v9),((com.google.javascript.jscomp.Scope)v14),((java.util.Map)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }
}
