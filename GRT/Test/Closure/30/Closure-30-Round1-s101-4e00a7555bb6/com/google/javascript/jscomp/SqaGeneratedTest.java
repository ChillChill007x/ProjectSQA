package com.google.javascript.jscomp;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapGeneratorV2.LineMapEncoder();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v4));
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = "\"eval";
    Object v9 = new java.io.PrintStream(((java.lang.String)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = new com.google.javascript.jscomp.MustBeReachingVariableDef(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v12 = ",";
    Object v13 = new com.google.javascript.rhino.Node[]{};
    Object v14 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v13));
    Object v15 = ((com.google.javascript.jscomp.MustBeReachingVariableDef)v11).dependsOnOuterScopeVars(((java.lang.String)v12),((com.google.javascript.rhino.Node)v14));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new com.google.debugging.sourcemap.SourceMapGeneratorV2.LineMapEncoder();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v4));
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = "\"eval";
    Object v9 = new java.io.PrintStream(((java.lang.String)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = new com.google.javascript.jscomp.MustBeReachingVariableDef(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v12 = new com.google.javascript.rhino.Node[]{};
    Object v13 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v12));
    Object v14 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef();
    Object v15 = ((com.google.javascript.jscomp.MustBeReachingVariableDef)v11).flowThrough(((com.google.javascript.rhino.Node)v13),((com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapGeneratorV2.LineMapEncoder();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v4));
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = "\"eval";
    Object v9 = new java.io.PrintStream(((java.lang.String)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = new com.google.javascript.jscomp.MustBeReachingVariableDef(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v12 = "";
    Object v13 = new com.google.javascript.rhino.Node[]{};
    Object v14 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v13));
    Object v15 = 1;
    ((com.google.javascript.rhino.Node)v14).setType((((java.lang.Integer)v15).intValue()));
    Object v16 = null;
    Object v17 = ((com.google.javascript.jscomp.MustBeReachingVariableDef)v11).getDef(((java.lang.String)v12),((com.google.javascript.rhino.Node)v14));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapGeneratorV2.LineMapEncoder();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v4));
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = "\"eval";
    Object v9 = new java.io.PrintStream(((java.lang.String)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = new com.google.javascript.jscomp.MustBeReachingVariableDef(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v12 = "O";
    Object v13 = new com.google.javascript.rhino.Node[]{};
    Object v14 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v13));
    Object v15 = ((com.google.javascript.jscomp.MustBeReachingVariableDef)v11).getDef(((java.lang.String)v12),((com.google.javascript.rhino.Node)v14));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapGeneratorV2.LineMapEncoder();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v4));
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = "\"eval";
    Object v9 = new java.io.PrintStream(((java.lang.String)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = new com.google.javascript.jscomp.MustBeReachingVariableDef(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v12 = "";
    Object v13 = new com.google.javascript.rhino.Node[]{};
    Object v14 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v13));
    Object v15 = ((com.google.javascript.jscomp.MustBeReachingVariableDef)v11).getDef(((java.lang.String)v12),((com.google.javascript.rhino.Node)v14));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new com.google.debugging.sourcemap.SourceMapGeneratorV2.LineMapEncoder();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v4));
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = ((com.google.javascript.jscomp.Scope)v7).getDeclarativelyUnboundVarsWithoutTypes();
    Object v9 = "\"eval";
    Object v10 = new java.io.PrintStream(((java.lang.String)v9));
    Object v11 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v10));
    Object v12 = new com.google.javascript.jscomp.MustBeReachingVariableDef(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.jscomp.AbstractCompiler)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new com.google.debugging.sourcemap.SourceMapGeneratorV2.LineMapEncoder();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v4));
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = ((com.google.javascript.jscomp.Scope)v7).getDeclarativelyUnboundVarsWithoutTypes();
    Object v9 = "\"eval";
    Object v10 = new java.io.PrintStream(((java.lang.String)v9));
    Object v11 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v10));
    Object v12 = new com.google.javascript.jscomp.MustBeReachingVariableDef(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.jscomp.AbstractCompiler)v11));
    Object v13 = ((com.google.javascript.jscomp.MustBeReachingVariableDef)v12).isForward();
    org.junit.Assert.assertEquals((Object)(true), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapGeneratorV2.LineMapEncoder();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v4));
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = "\"eval";
    Object v9 = new java.io.PrintStream(((java.lang.String)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = new com.google.javascript.jscomp.MustBeReachingVariableDef(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v12 = "";
    Object v13 = new com.google.javascript.rhino.Node[]{};
    Object v14 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v13));
    Object v15 = ((com.google.javascript.jscomp.MustBeReachingVariableDef)v11).dependsOnOuterScopeVars(((java.lang.String)v12),((com.google.javascript.rhino.Node)v14));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapGeneratorV2.LineMapEncoder();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v4));
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = "\"eval";
    Object v9 = new java.io.PrintStream(((java.lang.String)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = new com.google.javascript.jscomp.MustBeReachingVariableDef(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v12 = "JSCompiler_alias_VOID";
    Object v13 = new com.google.javascript.rhino.Node[]{};
    Object v14 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v13));
    Object v15 = ((com.google.javascript.jscomp.MustBeReachingVariableDef)v11).dependsOnOuterScopeVars(((java.lang.String)v12),((com.google.javascript.rhino.Node)v14));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapGeneratorV2.LineMapEncoder();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v4));
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = "\"eval";
    Object v9 = new java.io.PrintStream(((java.lang.String)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = new com.google.javascript.jscomp.MustBeReachingVariableDef(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v12 = "wind]ow";
    Object v13 = new com.google.javascript.rhino.Node[]{};
    Object v14 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v13));
    Object v15 = ((com.google.javascript.jscomp.MustBeReachingVariableDef)v11).dependsOnOuterScopeVars(((java.lang.String)v12),((com.google.javascript.rhino.Node)v14));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapGeneratorV2.LineMapEncoder();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v4));
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = ((com.google.javascript.jscomp.Scope)v7).getDeclarativelyUnboundVarsWithoutTypes();
    Object v9 = "\"eval";
    Object v10 = new java.io.PrintStream(((java.lang.String)v9));
    Object v11 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v10));
    Object v12 = new com.google.javascript.jscomp.MustBeReachingVariableDef(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.jscomp.AbstractCompiler)v11));
    Object v13 = "";
    Object v14 = new com.google.javascript.rhino.Node[]{};
    Object v15 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v14));
    Object v16 = ((com.google.javascript.jscomp.MustBeReachingVariableDef)v12).getDef(((java.lang.String)v13),((com.google.javascript.rhino.Node)v15));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapGeneratorV2.LineMapEncoder();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v4));
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = "\"eval";
    Object v9 = new java.io.PrintStream(((java.lang.String)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = new com.google.javascript.jscomp.MustBeReachingVariableDef(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v12 = "=";
    Object v13 = new com.google.javascript.rhino.Node[]{};
    Object v14 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v13));
    Object v15 = ((com.google.javascript.jscomp.MustBeReachingVariableDef)v11).dependsOnOuterScopeVars(((java.lang.String)v12),((com.google.javascript.rhino.Node)v14));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapGeneratorV2.LineMapEncoder();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v4));
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = "\"eval";
    Object v9 = new java.io.PrintStream(((java.lang.String)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = new com.google.javascript.jscomp.MustBeReachingVariableDef(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v12 = "&";
    Object v13 = new com.google.javascript.rhino.Node[]{};
    Object v14 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v13));
    Object v15 = ((com.google.javascript.jscomp.MustBeReachingVariableDef)v11).dependsOnOuterScopeVars(((java.lang.String)v12),((com.google.javascript.rhino.Node)v14));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapGeneratorV2.LineMapEncoder();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v4));
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = "\"eval";
    Object v9 = new java.io.PrintStream(((java.lang.String)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = new com.google.javascript.jscomp.MustBeReachingVariableDef(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v12 = "q";
    Object v13 = new com.google.javascript.rhino.Node[]{};
    Object v14 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v13));
    Object v15 = ((com.google.javascript.rhino.Node)v14).toStringTree();
    Object v16 = ((com.google.javascript.jscomp.MustBeReachingVariableDef)v11).getDef(((java.lang.String)v12),((com.google.javascript.rhino.Node)v14));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapGeneratorV2.LineMapEncoder();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v4));
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = ((com.google.javascript.jscomp.Scope)v7).getDeclarativelyUnboundVarsWithoutTypes();
    Object v9 = "\"eval";
    Object v10 = new java.io.PrintStream(((java.lang.String)v9));
    Object v11 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v10));
    Object v12 = new com.google.javascript.jscomp.MustBeReachingVariableDef(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.jscomp.AbstractCompiler)v11));
    Object v13 = "s";
    Object v14 = new com.google.javascript.rhino.Node[]{};
    Object v15 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v14));
    Object v16 = 0;
    Object v17 = ((com.google.javascript.rhino.Node)v15).getAncestor((((java.lang.Integer)v16).intValue()));
    Object v18 = ((com.google.javascript.jscomp.MustBeReachingVariableDef)v12).getDef(((java.lang.String)v13),((com.google.javascript.rhino.Node)v15));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapGeneratorV2.LineMapEncoder();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v4));
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = "\"eval";
    Object v9 = new java.io.PrintStream(((java.lang.String)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = new com.google.javascript.jscomp.MustBeReachingVariableDef(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v12 = ":";
    Object v13 = new com.google.javascript.rhino.Node[]{};
    Object v14 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v13));
    Object v15 = ((com.google.javascript.jscomp.MustBeReachingVariableDef)v11).dependsOnOuterScopeVars(((java.lang.String)v12),((com.google.javascript.rhino.Node)v14));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapGeneratorV2.LineMapEncoder();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v4));
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = "\"eval";
    Object v9 = new java.io.PrintStream(((java.lang.String)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = new com.google.javascript.jscomp.MustBeReachingVariableDef(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v12 = "[";
    Object v13 = new com.google.javascript.rhino.Node[]{};
    Object v14 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v13));
    Object v15 = ((com.google.javascript.jscomp.MustBeReachingVariableDef)v11).getDef(((java.lang.String)v12),((com.google.javascript.rhino.Node)v14));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new com.google.debugging.sourcemap.SourceMapGeneratorV2.LineMapEncoder();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v4));
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = ((com.google.javascript.jscomp.Scope)v7).getDeclarativelyUnboundVarsWithoutTypes();
    Object v9 = "\"eval";
    Object v10 = new java.io.PrintStream(((java.lang.String)v9));
    Object v11 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v10));
    Object v12 = new com.google.javascript.jscomp.MustBeReachingVariableDef(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.jscomp.AbstractCompiler)v11));
    Object v13 = ((com.google.javascript.jscomp.MustBeReachingVariableDef)v12).createEntryLattice();
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapGeneratorV2.LineMapEncoder();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v4));
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = "\"eval";
    Object v9 = new java.io.PrintStream(((java.lang.String)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = new com.google.javascript.jscomp.MustBeReachingVariableDef(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v12 = "null";
    Object v13 = new com.google.javascript.rhino.Node[]{};
    Object v14 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v13));
    Object v15 = ((com.google.javascript.jscomp.MustBeReachingVariableDef)v11).getDef(((java.lang.String)v12),((com.google.javascript.rhino.Node)v14));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new com.google.debugging.sourcemap.SourceMapGeneratorV2.LineMapEncoder();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v4));
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = ((com.google.javascript.jscomp.Scope)v7).getDeclarativelyUnboundVarsWithoutTypes();
    Object v9 = "\"eval";
    Object v10 = new java.io.PrintStream(((java.lang.String)v9));
    Object v11 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v10));
    Object v12 = new com.google.javascript.jscomp.MustBeReachingVariableDef(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.jscomp.AbstractCompiler)v11));
    Object v13 = ((com.google.javascript.jscomp.MustBeReachingVariableDef)v12).createInitialEstimateLattice();
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapGeneratorV2.LineMapEncoder();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v4));
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = "\"eval";
    Object v9 = new java.io.PrintStream(((java.lang.String)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = new com.google.javascript.jscomp.MustBeReachingVariableDef(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v12 = "Unrecognized message placeholder referenced: ";
    Object v13 = new com.google.javascript.rhino.Node[]{};
    Object v14 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v13));
    Object v15 = ((com.google.javascript.jscomp.MustBeReachingVariableDef)v11).dependsOnOuterScopeVars(((java.lang.String)v12),((com.google.javascript.rhino.Node)v14));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapGeneratorV2.LineMapEncoder();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v4));
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = "\"eval";
    Object v9 = new java.io.PrintStream(((java.lang.String)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = new com.google.javascript.jscomp.MustBeReachingVariableDef(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v12 = "`";
    Object v13 = new com.google.javascript.rhino.Node[]{};
    Object v14 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v13));
    Object v15 = ((com.google.javascript.rhino.Node)v14).wasEmptyNode();
    Object v16 = ((com.google.javascript.jscomp.MustBeReachingVariableDef)v11).dependsOnOuterScopeVars(((java.lang.String)v12),((com.google.javascript.rhino.Node)v14));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapGeneratorV2.LineMapEncoder();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v4));
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = ((com.google.javascript.jscomp.Scope)v7).getDeclarativelyUnboundVarsWithoutTypes();
    Object v9 = "\"eval";
    Object v10 = new java.io.PrintStream(((java.lang.String)v9));
    Object v11 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v10));
    Object v12 = new com.google.javascript.jscomp.MustBeReachingVariableDef(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.jscomp.AbstractCompiler)v11));
    Object v13 = "A";
    Object v14 = new com.google.javascript.rhino.Node[]{};
    Object v15 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v14));
    Object v16 = ((com.google.javascript.jscomp.MustBeReachingVariableDef)v12).getDef(((java.lang.String)v13),((com.google.javascript.rhino.Node)v15));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new com.google.debugging.sourcemap.SourceMapGeneratorV2.LineMapEncoder();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v4));
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = "\"eval";
    Object v9 = new java.io.PrintStream(((java.lang.String)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = new com.google.javascript.jscomp.MustBeReachingVariableDef(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v12 = ((com.google.javascript.jscomp.MustBeReachingVariableDef)v11).isForward();
    org.junit.Assert.assertEquals((Object)(true), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapGeneratorV2.LineMapEncoder();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v4));
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = "\"eval";
    Object v9 = new java.io.PrintStream(((java.lang.String)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = new com.google.javascript.jscomp.MustBeReachingVariableDef(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v12 = "TY PE";
    Object v13 = new com.google.javascript.rhino.Node[]{};
    Object v14 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v13));
    Object v15 = ((com.google.javascript.jscomp.MustBeReachingVariableDef)v11).dependsOnOuterScopeVars(((java.lang.String)v12),((com.google.javascript.rhino.Node)v14));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new com.google.debugging.sourcemap.SourceMapGeneratorV2.LineMapEncoder();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v4));
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = "\"eval";
    Object v9 = new java.io.PrintStream(((java.lang.String)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = new com.google.javascript.jscomp.MustBeReachingVariableDef(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v12 = ((com.google.javascript.jscomp.MustBeReachingVariableDef)v11).createEntryLattice();
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapGeneratorV2.LineMapEncoder();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v4));
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = "\"eval";
    Object v9 = new java.io.PrintStream(((java.lang.String)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = new com.google.javascript.jscomp.MustBeReachingVariableDef(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v12 = "initializingD variable";
    Object v13 = new com.google.javascript.rhino.Node[]{};
    Object v14 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v13));
    Object v15 = ((com.google.javascript.jscomp.MustBeReachingVariableDef)v11).dependsOnOuterScopeVars(((java.lang.String)v12),((com.google.javascript.rhino.Node)v14));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapGeneratorV2.LineMapEncoder();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v4));
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = "\"eval";
    Object v9 = new java.io.PrintStream(((java.lang.String)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = new com.google.javascript.jscomp.MustBeReachingVariableDef(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v12 = "0";
    Object v13 = new com.google.javascript.rhino.Node[]{};
    Object v14 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v13));
    Object v15 = ((com.google.javascript.rhino.Node)v14).getSideEffectFlags();
    Object v16 = ((com.google.javascript.jscomp.MustBeReachingVariableDef)v11).dependsOnOuterScopeVars(((java.lang.String)v12),((com.google.javascript.rhino.Node)v14));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapGeneratorV2.LineMapEncoder();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v4));
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = "\"eval";
    Object v9 = new java.io.PrintStream(((java.lang.String)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = new com.google.javascript.jscomp.MustBeReachingVariableDef(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v12 = "arguments";
    Object v13 = new com.google.javascript.rhino.Node[]{};
    Object v14 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v13));
    Object v15 = false;
    ((com.google.javascript.rhino.Node)v14).setWasEmptyNode((((java.lang.Boolean)v15).booleanValue()));
    Object v16 = null;
    Object v17 = ((com.google.javascript.jscomp.MustBeReachingVariableDef)v11).getDef(((java.lang.String)v12),((com.google.javascript.rhino.Node)v14));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapGeneratorV2.LineMapEncoder();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v4));
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = ((com.google.javascript.jscomp.Scope)v7).getDeclarativelyUnboundVarsWithoutTypes();
    Object v9 = "\"eval";
    Object v10 = new java.io.PrintStream(((java.lang.String)v9));
    Object v11 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v10));
    Object v12 = new com.google.javascript.jscomp.MustBeReachingVariableDef(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.jscomp.AbstractCompiler)v11));
    Object v13 = "";
    Object v14 = new com.google.javascript.rhino.Node[]{};
    Object v15 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v14));
    Object v16 = ((com.google.javascript.jscomp.MustBeReachingVariableDef)v12).dependsOnOuterScopeVars(((java.lang.String)v13),((com.google.javascript.rhino.Node)v15));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapGeneratorV2.LineMapEncoder();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v4));
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = "\"eval";
    Object v9 = new java.io.PrintStream(((java.lang.String)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = new com.google.javascript.jscomp.MustBeReachingVariableDef(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v12 = "JSC_EXPECTED_THIS_TYPE";
    Object v13 = new com.google.javascript.rhino.Node[]{};
    Object v14 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v13));
    Object v15 = ((com.google.javascript.rhino.Node)v14).isVarArgs();
    Object v16 = ((com.google.javascript.jscomp.MustBeReachingVariableDef)v11).getDef(((java.lang.String)v12),((com.google.javascript.rhino.Node)v14));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapGeneratorV2.LineMapEncoder();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v4));
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = "\"eval";
    Object v9 = new java.io.PrintStream(((java.lang.String)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = new com.google.javascript.jscomp.MustBeReachingVariableDef(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v12 = "M";
    Object v13 = new com.google.javascript.rhino.Node[]{};
    Object v14 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v13));
    Object v15 = ((com.google.javascript.jscomp.MustBeReachingVariableDef)v11).getDef(((java.lang.String)v12),((com.google.javascript.rhino.Node)v14));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapGeneratorV2.LineMapEncoder();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v4));
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = "\"eval";
    Object v9 = new java.io.PrintStream(((java.lang.String)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = new com.google.javascript.jscomp.MustBeReachingVariableDef(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v12 = "";
    Object v13 = new com.google.javascript.rhino.Node[]{};
    Object v14 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v13));
    Object v15 = 19;
    Object v16 = ((com.google.javascript.rhino.Node)v14).getAncestor((((java.lang.Integer)v15).intValue()));
    Object v17 = ((com.google.javascript.jscomp.MustBeReachingVariableDef)v11).getDef(((java.lang.String)v12),((com.google.javascript.rhino.Node)v14));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapGeneratorV2.LineMapEncoder();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v4));
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = ((com.google.javascript.jscomp.Scope)v7).getDeclarativelyUnboundVarsWithoutTypes();
    Object v9 = "\"eval";
    Object v10 = new java.io.PrintStream(((java.lang.String)v9));
    Object v11 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v10));
    Object v12 = new com.google.javascript.jscomp.MustBeReachingVariableDef(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.jscomp.AbstractCompiler)v11));
    Object v13 = "(";
    Object v14 = new com.google.javascript.rhino.Node[]{};
    Object v15 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v14));
    Object v16 = ((com.google.javascript.jscomp.MustBeReachingVariableDef)v12).dependsOnOuterScopeVars(((java.lang.String)v13),((com.google.javascript.rhino.Node)v15));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new com.google.debugging.sourcemap.SourceMapGeneratorV2.LineMapEncoder();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v4));
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = "\"eval";
    Object v9 = new java.io.PrintStream(((java.lang.String)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = new com.google.javascript.jscomp.MustBeReachingVariableDef(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v12 = new com.google.javascript.rhino.Node[]{};
    Object v13 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v12));
    Object v14 = new com.google.debugging.sourcemap.SourceMapGeneratorV2.LineMapEncoder();
    Object v15 = true;
    Object v16 = true;
    Object v17 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v14),(((java.lang.Boolean)v15).booleanValue()),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = new com.google.javascript.rhino.Node[]{};
    Object v19 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v18));
    Object v20 = null;
    Object v21 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v19),((com.google.javascript.rhino.jstype.ObjectType)v20));
    Object v22 = ((com.google.javascript.jscomp.Scope)v21).getDeclarativelyUnboundVarsWithoutTypes();
    Object v23 = "\"eval";
    Object v24 = new java.io.PrintStream(((java.lang.String)v23));
    Object v25 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v24));
    Object v26 = new com.google.javascript.jscomp.MustBeReachingVariableDef(((com.google.javascript.jscomp.ControlFlowGraph)v17),((com.google.javascript.jscomp.Scope)v21),((com.google.javascript.jscomp.AbstractCompiler)v25));
    Object v27 = ((com.google.javascript.jscomp.MustBeReachingVariableDef)v26).createInitialEstimateLattice();
    Object v28 = new com.google.debugging.sourcemap.SourceMapGeneratorV2.LineMapEncoder();
    Object v29 = ((com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef)v27).equals(((java.lang.Object)v28));
    Object v30 = ((com.google.javascript.jscomp.MustBeReachingVariableDef)v11).flowThrough(((com.google.javascript.rhino.Node)v13),((com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef)v27));
    org.junit.Assert.assertNotNull(v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapGeneratorV2.LineMapEncoder();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v4));
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = "\"eval";
    Object v9 = new java.io.PrintStream(((java.lang.String)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = new com.google.javascript.jscomp.MustBeReachingVariableDef(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v12 = "]";
    Object v13 = new com.google.javascript.rhino.Node[]{};
    Object v14 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v13));
    Object v15 = ((com.google.javascript.jscomp.MustBeReachingVariableDef)v11).dependsOnOuterScopeVars(((java.lang.String)v12),((com.google.javascript.rhino.Node)v14));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapGeneratorV2.LineMapEncoder();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v4));
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = "\"eval";
    Object v9 = new java.io.PrintStream(((java.lang.String)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = new com.google.javascript.jscomp.MustBeReachingVariableDef(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v12 = "";
    Object v13 = new com.google.javascript.rhino.Node[]{};
    Object v14 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v13));
    Object v15 = new com.google.javascript.rhino.Node[]{};
    Object v16 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v15));
    Object v17 = ((com.google.javascript.rhino.Node)v14).srcref(((com.google.javascript.rhino.Node)v16));
    Object v18 = ((com.google.javascript.jscomp.MustBeReachingVariableDef)v11).getDef(((java.lang.String)v12),((com.google.javascript.rhino.Node)v14));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapGeneratorV2.LineMapEncoder();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v4));
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = "\"eval";
    Object v9 = new java.io.PrintStream(((java.lang.String)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = new com.google.javascript.jscomp.MustBeReachingVariableDef(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v12 = ";";
    Object v13 = new com.google.javascript.rhino.Node[]{};
    Object v14 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v13));
    Object v15 = ((com.google.javascript.jscomp.MustBeReachingVariableDef)v11).dependsOnOuterScopeVars(((java.lang.String)v12),((com.google.javascript.rhino.Node)v14));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapGeneratorV2.LineMapEncoder();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v4));
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = "\"eval";
    Object v9 = new java.io.PrintStream(((java.lang.String)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = new com.google.javascript.jscomp.MustBeReachingVariableDef(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v12 = " ";
    Object v13 = new com.google.javascript.rhino.Node[]{};
    Object v14 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v13));
    Object v15 = ((com.google.javascript.jscomp.MustBeReachingVariableDef)v11).getDef(((java.lang.String)v12),((com.google.javascript.rhino.Node)v14));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapGeneratorV2.LineMapEncoder();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v4));
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = "\"eval";
    Object v9 = new java.io.PrintStream(((java.lang.String)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = new com.google.javascript.jscomp.MustBeReachingVariableDef(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v12 = "";
    Object v13 = new com.google.javascript.rhino.Node[]{};
    Object v14 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v13));
    Object v15 = new com.google.javascript.rhino.Node[]{};
    Object v16 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v15));
    Object v17 = ((com.google.javascript.rhino.Node)v14).srcref(((com.google.javascript.rhino.Node)v16));
    Object v18 = ((com.google.javascript.jscomp.MustBeReachingVariableDef)v11).dependsOnOuterScopeVars(((java.lang.String)v12),((com.google.javascript.rhino.Node)v14));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapGeneratorV2.LineMapEncoder();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v4));
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = ((com.google.javascript.jscomp.Scope)v7).getDeclarativelyUnboundVarsWithoutTypes();
    Object v9 = "\"eval";
    Object v10 = new java.io.PrintStream(((java.lang.String)v9));
    Object v11 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v10));
    Object v12 = new com.google.javascript.jscomp.MustBeReachingVariableDef(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.jscomp.AbstractCompiler)v11));
    Object v13 = "\\r";
    Object v14 = new com.google.javascript.rhino.Node[]{};
    Object v15 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v14));
    Object v16 = ((com.google.javascript.jscomp.MustBeReachingVariableDef)v12).dependsOnOuterScopeVars(((java.lang.String)v13),((com.google.javascript.rhino.Node)v15));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapGeneratorV2.LineMapEncoder();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v4));
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = "\"eval";
    Object v9 = new java.io.PrintStream(((java.lang.String)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = new com.google.javascript.jscomp.MustBeReachingVariableDef(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v12 = "\" color=";
    Object v13 = new com.google.javascript.rhino.Node[]{};
    Object v14 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v13));
    Object v15 = ((com.google.javascript.jscomp.MustBeReachingVariableDef)v11).dependsOnOuterScopeVars(((java.lang.String)v12),((com.google.javascript.rhino.Node)v14));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapGeneratorV2.LineMapEncoder();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v4));
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = "\"eval";
    Object v9 = new java.io.PrintStream(((java.lang.String)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = new com.google.javascript.jscomp.MustBeReachingVariableDef(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v12 = "<";
    Object v13 = new com.google.javascript.rhino.Node[]{};
    Object v14 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v13));
    Object v15 = ((com.google.javascript.jscomp.MustBeReachingVariableDef)v11).dependsOnOuterScopeVars(((java.lang.String)v12),((com.google.javascript.rhino.Node)v14));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapGeneratorV2.LineMapEncoder();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v4));
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = "\"eval";
    Object v9 = new java.io.PrintStream(((java.lang.String)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = new com.google.javascript.jscomp.MustBeReachingVariableDef(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v12 = "";
    Object v13 = new com.google.javascript.rhino.Node[]{};
    Object v14 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v13));
    Object v15 = new com.google.javascript.rhino.Node[]{};
    Object v16 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v15));
    Object v17 = ((com.google.javascript.rhino.Node)v14).checkTreeEquals(((com.google.javascript.rhino.Node)v16));
    Object v18 = ((com.google.javascript.jscomp.MustBeReachingVariableDef)v11).dependsOnOuterScopeVars(((java.lang.String)v12),((com.google.javascript.rhino.Node)v14));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapGeneratorV2.LineMapEncoder();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v4));
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = "\"eval";
    Object v9 = new java.io.PrintStream(((java.lang.String)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = new com.google.javascript.jscomp.MustBeReachingVariableDef(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v12 = "_";
    Object v13 = new com.google.javascript.rhino.Node[]{};
    Object v14 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v13));
    Object v15 = ((com.google.javascript.jscomp.MustBeReachingVariableDef)v11).dependsOnOuterScopeVars(((java.lang.String)v12),((com.google.javascript.rhino.Node)v14));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapGeneratorV2.LineMapEncoder();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v4));
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = "\"eval";
    Object v9 = new java.io.PrintStream(((java.lang.String)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = new com.google.javascript.jscomp.MustBeReachingVariableDef(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v12 = "8";
    Object v13 = new com.google.javascript.rhino.Node[]{};
    Object v14 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v13));
    Object v15 = -34;
    ((com.google.javascript.rhino.Node)v14).removeProp((((java.lang.Integer)v15).intValue()));
    Object v16 = null;
    Object v17 = ((com.google.javascript.jscomp.MustBeReachingVariableDef)v11).getDef(((java.lang.String)v12),((com.google.javascript.rhino.Node)v14));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapGeneratorV2.LineMapEncoder();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v4));
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = "\"eval";
    Object v9 = new java.io.PrintStream(((java.lang.String)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = new com.google.javascript.jscomp.MustBeReachingVariableDef(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v12 = "<";
    Object v13 = new com.google.javascript.rhino.Node[]{};
    Object v14 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v13));
    Object v15 = ((com.google.javascript.jscomp.MustBeReachingVariableDef)v11).getDef(((java.lang.String)v12),((com.google.javascript.rhino.Node)v14));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapGeneratorV2.LineMapEncoder();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v4));
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = "\"eval";
    Object v9 = new java.io.PrintStream(((java.lang.String)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = new com.google.javascript.jscomp.MustBeReachingVariableDef(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v12 = ", or >";
    Object v13 = new com.google.javascript.rhino.Node[]{};
    Object v14 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v13));
    Object v15 = ((com.google.javascript.jscomp.MustBeReachingVariableDef)v11).dependsOnOuterScopeVars(((java.lang.String)v12),((com.google.javascript.rhino.Node)v14));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapGeneratorV2.LineMapEncoder();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v4));
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = "\"eval";
    Object v9 = new java.io.PrintStream(((java.lang.String)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = new com.google.javascript.jscomp.MustBeReachingVariableDef(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v12 = "argumenes";
    Object v13 = new com.google.javascript.rhino.Node[]{};
    Object v14 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v13));
    Object v15 = 1;
    ((com.google.javascript.rhino.Node)v14).removeProp((((java.lang.Integer)v15).intValue()));
    Object v16 = null;
    Object v17 = ((com.google.javascript.jscomp.MustBeReachingVariableDef)v11).getDef(((java.lang.String)v12),((com.google.javascript.rhino.Node)v14));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapGeneratorV2.LineMapEncoder();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v4));
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = ((com.google.javascript.jscomp.Scope)v7).getDeclarativelyUnboundVarsWithoutTypes();
    Object v9 = "\"eval";
    Object v10 = new java.io.PrintStream(((java.lang.String)v9));
    Object v11 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v10));
    Object v12 = new com.google.javascript.jscomp.MustBeReachingVariableDef(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.jscomp.AbstractCompiler)v11));
    Object v13 = ")";
    Object v14 = new com.google.javascript.rhino.Node[]{};
    Object v15 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v14));
    Object v16 = ((com.google.javascript.jscomp.MustBeReachingVariableDef)v12).dependsOnOuterScopeVars(((java.lang.String)v13),((com.google.javascript.rhino.Node)v15));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapGeneratorV2.LineMapEncoder();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v4));
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = "\"eval";
    Object v9 = new java.io.PrintStream(((java.lang.String)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = new com.google.javascript.jscomp.MustBeReachingVariableDef(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v12 = ".prototype";
    Object v13 = new com.google.javascript.rhino.Node[]{};
    Object v14 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v13));
    Object v15 = ((com.google.javascript.jscomp.MustBeReachingVariableDef)v11).getDef(((java.lang.String)v12),((com.google.javascript.rhino.Node)v14));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapGeneratorV2.LineMapEncoder();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v4));
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = "\"eval";
    Object v9 = new java.io.PrintStream(((java.lang.String)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = new com.google.javascript.jscomp.MustBeReachingVariableDef(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v12 = "\\\\";
    Object v13 = new com.google.javascript.rhino.Node[]{};
    Object v14 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v13));
    Object v15 = -1;
    ((com.google.javascript.rhino.Node)v14).setCharno((((java.lang.Integer)v15).intValue()));
    Object v16 = null;
    Object v17 = ((com.google.javascript.jscomp.MustBeReachingVariableDef)v11).getDef(((java.lang.String)v12),((com.google.javascript.rhino.Node)v14));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapGeneratorV2.LineMapEncoder();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v4));
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = "\"eval";
    Object v9 = new java.io.PrintStream(((java.lang.String)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = new com.google.javascript.jscomp.MustBeReachingVariableDef(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v12 = "prototype";
    Object v13 = new com.google.javascript.rhino.Node[]{};
    Object v14 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v13));
    Object v15 = ((com.google.javascript.rhino.Node)v14).cloneNode();
    Object v16 = ((com.google.javascript.jscomp.MustBeReachingVariableDef)v11).getDef(((java.lang.String)v12),((com.google.javascript.rhino.Node)v14));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapGeneratorV2.LineMapEncoder();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v4));
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = "\"eval";
    Object v9 = new java.io.PrintStream(((java.lang.String)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = new com.google.javascript.jscomp.MustBeReachingVariableDef(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v12 = "|";
    Object v13 = new com.google.javascript.rhino.Node[]{};
    Object v14 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v13));
    Object v15 = 0;
    Object v16 = 1;
    ((com.google.javascript.rhino.Node)v14).putIntProp((((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v17 = null;
    Object v18 = ((com.google.javascript.jscomp.MustBeReachingVariableDef)v11).dependsOnOuterScopeVars(((java.lang.String)v12),((com.google.javascript.rhino.Node)v14));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapGeneratorV2.LineMapEncoder();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v4));
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = "\"eval";
    Object v9 = new java.io.PrintStream(((java.lang.String)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = new com.google.javascript.jscomp.MustBeReachingVariableDef(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v12 = "EVAL_ERROR_FUNCTION_TYPE";
    Object v13 = new com.google.javascript.rhino.Node[]{};
    Object v14 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v13));
    Object v15 = 1;
    ((com.google.javascript.rhino.Node)v14).setLineno((((java.lang.Integer)v15).intValue()));
    Object v16 = null;
    Object v17 = ((com.google.javascript.jscomp.MustBeReachingVariableDef)v11).dependsOnOuterScopeVars(((java.lang.String)v12),((com.google.javascript.rhino.Node)v14));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new com.google.debugging.sourcemap.SourceMapGeneratorV2.LineMapEncoder();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v4));
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = "\"eval";
    Object v9 = new java.io.PrintStream(((java.lang.String)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = new com.google.javascript.jscomp.MustBeReachingVariableDef(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v12 = ((com.google.javascript.jscomp.MustBeReachingVariableDef)v11).createInitialEstimateLattice();
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapGeneratorV2.LineMapEncoder();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v4));
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = "\"eval";
    Object v9 = new java.io.PrintStream(((java.lang.String)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = new com.google.javascript.jscomp.MustBeReachingVariableDef(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v12 = "\\";
    Object v13 = new com.google.javascript.rhino.Node[]{};
    Object v14 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v13));
    Object v15 = ((com.google.javascript.jscomp.MustBeReachingVariableDef)v11).getDef(((java.lang.String)v12),((com.google.javascript.rhino.Node)v14));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapGeneratorV2.LineMapEncoder();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v4));
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = "\"eval";
    Object v9 = new java.io.PrintStream(((java.lang.String)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = new com.google.javascript.jscomp.MustBeReachingVariableDef(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v12 = "S=> ";
    Object v13 = new com.google.javascript.rhino.Node[]{};
    Object v14 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v13));
    Object v15 = ((com.google.javascript.jscomp.MustBeReachingVariableDef)v11).getDef(((java.lang.String)v12),((com.google.javascript.rhino.Node)v14));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapGeneratorV2.LineMapEncoder();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v4));
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = "\"eval";
    Object v9 = new java.io.PrintStream(((java.lang.String)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = new com.google.javascript.jscomp.MustBeReachingVariableDef(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v12 = "o";
    Object v13 = new com.google.javascript.rhino.Node[]{};
    Object v14 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v13));
    Object v15 = ((com.google.javascript.jscomp.MustBeReachingVariableDef)v11).dependsOnOuterScopeVars(((java.lang.String)v12),((com.google.javascript.rhino.Node)v14));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapGeneratorV2.LineMapEncoder();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v4));
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = ((com.google.javascript.jscomp.Scope)v7).getDeclarativelyUnboundVarsWithoutTypes();
    Object v9 = "\"eval";
    Object v10 = new java.io.PrintStream(((java.lang.String)v9));
    Object v11 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v10));
    Object v12 = new com.google.javascript.jscomp.MustBeReachingVariableDef(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.jscomp.AbstractCompiler)v11));
    Object v13 = "deterministic instanceof yields f4alse";
    Object v14 = new com.google.javascript.rhino.Node[]{};
    Object v15 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v14));
    Object v16 = ((com.google.javascript.jscomp.MustBeReachingVariableDef)v12).getDef(((java.lang.String)v13),((com.google.javascript.rhino.Node)v15));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapGeneratorV2.LineMapEncoder();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v4));
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = "\"eval";
    Object v9 = new java.io.PrintStream(((java.lang.String)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = new com.google.javascript.jscomp.MustBeReachingVariableDef(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v12 = "L";
    Object v13 = new com.google.javascript.rhino.Node[]{};
    Object v14 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v13));
    Object v15 = ((com.google.javascript.jscomp.MustBeReachingVariableDef)v11).dependsOnOuterScopeVars(((java.lang.String)v12),((com.google.javascript.rhino.Node)v14));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapGeneratorV2.LineMapEncoder();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v4));
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = "\"eval";
    Object v9 = new java.io.PrintStream(((java.lang.String)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = new com.google.javascript.jscomp.MustBeReachingVariableDef(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v12 = "\n";
    Object v13 = new com.google.javascript.rhino.Node[]{};
    Object v14 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v13));
    Object v15 = ((com.google.javascript.jscomp.MustBeReachingVariableDef)v11).dependsOnOuterScopeVars(((java.lang.String)v12),((com.google.javascript.rhino.Node)v14));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapGeneratorV2.LineMapEncoder();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v4));
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = ((com.google.javascript.jscomp.Scope)v7).getDeclarativelyUnboundVarsWithoutTypes();
    Object v9 = "\"eval";
    Object v10 = new java.io.PrintStream(((java.lang.String)v9));
    Object v11 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v10));
    Object v12 = new com.google.javascript.jscomp.MustBeReachingVariableDef(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.jscomp.AbstractCompiler)v11));
    Object v13 = "{";
    Object v14 = new com.google.javascript.rhino.Node[]{};
    Object v15 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v14));
    Object v16 = ((com.google.javascript.jscomp.MustBeReachingVariableDef)v12).getDef(((java.lang.String)v13),((com.google.javascript.rhino.Node)v15));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapGeneratorV2.LineMapEncoder();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v4));
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = "\"eval";
    Object v9 = new java.io.PrintStream(((java.lang.String)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = new com.google.javascript.jscomp.MustBeReachingVariableDef(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v12 = "/";
    Object v13 = new com.google.javascript.rhino.Node[]{};
    Object v14 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v13));
    Object v15 = ((com.google.javascript.jscomp.MustBeReachingVariableDef)v11).getDef(((java.lang.String)v12),((com.google.javascript.rhino.Node)v14));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapGeneratorV2.LineMapEncoder();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v4));
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = "\"eval";
    Object v9 = new java.io.PrintStream(((java.lang.String)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = new com.google.javascript.jscomp.MustBeReachingVariableDef(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v12 = "JSG_INCOMPATIBLE_EXTENDED_PROPERTY_TYPE";
    Object v13 = new com.google.javascript.rhino.Node[]{};
    Object v14 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v13));
    Object v15 = ((com.google.javascript.jscomp.MustBeReachingVariableDef)v11).getDef(((java.lang.String)v12),((com.google.javascript.rhino.Node)v14));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new com.google.debugging.sourcemap.SourceMapGeneratorV2.LineMapEncoder();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v4));
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = "\"eval";
    Object v9 = new java.io.PrintStream(((java.lang.String)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = new com.google.javascript.jscomp.MustBeReachingVariableDef(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.jscomp.AbstractCompiler)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapGeneratorV2.LineMapEncoder();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v4));
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = ((com.google.javascript.jscomp.Scope)v7).getDeclarativelyUnboundVarsWithoutTypes();
    Object v9 = "\"eval";
    Object v10 = new java.io.PrintStream(((java.lang.String)v9));
    Object v11 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v10));
    Object v12 = new com.google.javascript.jscomp.MustBeReachingVariableDef(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.jscomp.AbstractCompiler)v11));
    Object v13 = "!";
    Object v14 = new com.google.javascript.rhino.Node[]{};
    Object v15 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v14));
    Object v16 = ((com.google.javascript.jscomp.MustBeReachingVariableDef)v12).dependsOnOuterScopeVars(((java.lang.String)v13),((com.google.javascript.rhino.Node)v15));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapGeneratorV2.LineMapEncoder();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v4));
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = "\"eval";
    Object v9 = new java.io.PrintStream(((java.lang.String)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = new com.google.javascript.jscomp.MustBeReachingVariableDef(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v12 = "fTile";
    Object v13 = new com.google.javascript.rhino.Node[]{};
    Object v14 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v13));
    Object v15 = -59;
    Object v16 = -16;
    ((com.google.javascript.rhino.Node)v14).putIntProp((((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v17 = null;
    Object v18 = ((com.google.javascript.jscomp.MustBeReachingVariableDef)v11).getDef(((java.lang.String)v12),((com.google.javascript.rhino.Node)v14));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapGeneratorV2.LineMapEncoder();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v4));
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = "\"eval";
    Object v9 = new java.io.PrintStream(((java.lang.String)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = new com.google.javascript.jscomp.MustBeReachingVariableDef(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v12 = "a";
    Object v13 = new com.google.javascript.rhino.Node[]{};
    Object v14 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v13));
    Object v15 = ((com.google.javascript.jscomp.MustBeReachingVariableDef)v11).getDef(((java.lang.String)v12),((com.google.javascript.rhino.Node)v14));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapGeneratorV2.LineMapEncoder();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v4));
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = ((com.google.javascript.jscomp.Scope)v7).getDeclarativelyUnboundVarsWithoutTypes();
    Object v9 = "\"eval";
    Object v10 = new java.io.PrintStream(((java.lang.String)v9));
    Object v11 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v10));
    Object v12 = new com.google.javascript.jscomp.MustBeReachingVariableDef(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.jscomp.AbstractCompiler)v11));
    Object v13 = "v";
    Object v14 = new com.google.javascript.rhino.Node[]{};
    Object v15 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v14));
    Object v16 = ((com.google.javascript.jscomp.MustBeReachingVariableDef)v12).getDef(((java.lang.String)v13),((com.google.javascript.rhino.Node)v15));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapGeneratorV2.LineMapEncoder();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v4));
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = "\"eval";
    Object v9 = new java.io.PrintStream(((java.lang.String)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = new com.google.javascript.jscomp.MustBeReachingVariableDef(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v12 = "JSCompiler_ObjectPropertyString";
    Object v13 = new com.google.javascript.rhino.Node[]{};
    Object v14 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v13));
    Object v15 = ((com.google.javascript.jscomp.MustBeReachingVariableDef)v11).dependsOnOuterScopeVars(((java.lang.String)v12),((com.google.javascript.rhino.Node)v14));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapGeneratorV2.LineMapEncoder();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v4));
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = "\"eval";
    Object v9 = new java.io.PrintStream(((java.lang.String)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = new com.google.javascript.jscomp.MustBeReachingVariableDef(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v12 = "1ile";
    Object v13 = new com.google.javascript.rhino.Node[]{};
    Object v14 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v13));
    Object v15 = ((com.google.javascript.rhino.Node)v14).removeChildren();
    Object v16 = ((com.google.javascript.jscomp.MustBeReachingVariableDef)v11).getDef(((java.lang.String)v12),((com.google.javascript.rhino.Node)v14));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new com.google.debugging.sourcemap.SourceMapGeneratorV2.LineMapEncoder();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v4));
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = "\"eval";
    Object v9 = new java.io.PrintStream(((java.lang.String)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = new com.google.javascript.jscomp.MustBeReachingVariableDef(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v12 = new com.google.javascript.rhino.Node[]{};
    Object v13 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v12));
    Object v14 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef();
    Object v15 = "\"eval";
    Object v16 = new java.io.PrintStream(((java.lang.String)v15));
    Object v17 = ((com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef)v14).equals(((java.lang.Object)v16));
    Object v18 = ((com.google.javascript.jscomp.MustBeReachingVariableDef)v11).flowThrough(((com.google.javascript.rhino.Node)v13),((com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef)v14));
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapGeneratorV2.LineMapEncoder();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v4));
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = "\"eval";
    Object v9 = new java.io.PrintStream(((java.lang.String)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = new com.google.javascript.jscomp.MustBeReachingVariableDef(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v12 = "9\n";
    Object v13 = new com.google.javascript.rhino.Node[]{};
    Object v14 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v13));
    Object v15 = ((com.google.javascript.jscomp.MustBeReachingVariableDef)v11).dependsOnOuterScopeVars(((java.lang.String)v12),((com.google.javascript.rhino.Node)v14));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapGeneratorV2.LineMapEncoder();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v4));
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = "\"eval";
    Object v9 = new java.io.PrintStream(((java.lang.String)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = new com.google.javascript.jscomp.MustBeReachingVariableDef(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v12 = "synthetic";
    Object v13 = new com.google.javascript.rhino.Node[]{};
    Object v14 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v13));
    Object v15 = ((com.google.javascript.rhino.Node)v14).toStringTree();
    Object v16 = ((com.google.javascript.jscomp.MustBeReachingVariableDef)v11).dependsOnOuterScopeVars(((java.lang.String)v12),((com.google.javascript.rhino.Node)v14));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapGeneratorV2.LineMapEncoder();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v4));
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = "\"eval";
    Object v9 = new java.io.PrintStream(((java.lang.String)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = new com.google.javascript.jscomp.MustBeReachingVariableDef(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v12 = "3";
    Object v13 = new com.google.javascript.rhino.Node[]{};
    Object v14 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v13));
    Object v15 = 38;
    Object v16 = 1;
    ((com.google.javascript.rhino.Node)v14).putIntProp((((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v17 = null;
    Object v18 = ((com.google.javascript.jscomp.MustBeReachingVariableDef)v11).dependsOnOuterScopeVars(((java.lang.String)v12),((com.google.javascript.rhino.Node)v14));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapGeneratorV2.LineMapEncoder();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v4));
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = "\"eval";
    Object v9 = new java.io.PrintStream(((java.lang.String)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = new com.google.javascript.jscomp.MustBeReachingVariableDef(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v12 = ": ";
    Object v13 = new com.google.javascript.rhino.Node[]{};
    Object v14 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v13));
    Object v15 = ((com.google.javascript.jscomp.MustBeReachingVariableDef)v11).getDef(((java.lang.String)v12),((com.google.javascript.rhino.Node)v14));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapGeneratorV2.LineMapEncoder();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v4));
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = "\"eval";
    Object v9 = new java.io.PrintStream(((java.lang.String)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = new com.google.javascript.jscomp.MustBeReachingVariableDef(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v12 = "\"";
    Object v13 = new com.google.javascript.rhino.Node[]{};
    Object v14 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v13));
    Object v15 = ((com.google.javascript.jscomp.MustBeReachingVariableDef)v11).getDef(((java.lang.String)v12),((com.google.javascript.rhino.Node)v14));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new com.google.debugging.sourcemap.SourceMapGeneratorV2.LineMapEncoder();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v4));
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = "\"eval";
    Object v9 = new java.io.PrintStream(((java.lang.String)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = new com.google.javascript.jscomp.MustBeReachingVariableDef(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v12 = new com.google.javascript.rhino.Node[]{};
    Object v13 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v12));
    Object v14 = ((com.google.javascript.rhino.Node)v13).cloneNode();
    Object v15 = new com.google.debugging.sourcemap.SourceMapGeneratorV2.LineMapEncoder();
    Object v16 = true;
    Object v17 = true;
    Object v18 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v15),(((java.lang.Boolean)v16).booleanValue()),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = new com.google.javascript.rhino.Node[]{};
    Object v20 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v19));
    Object v21 = null;
    Object v22 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.jstype.ObjectType)v21));
    Object v23 = "\"eval";
    Object v24 = new java.io.PrintStream(((java.lang.String)v23));
    Object v25 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v24));
    Object v26 = new com.google.javascript.jscomp.MustBeReachingVariableDef(((com.google.javascript.jscomp.ControlFlowGraph)v18),((com.google.javascript.jscomp.Scope)v22),((com.google.javascript.jscomp.AbstractCompiler)v25));
    Object v27 = ((com.google.javascript.jscomp.MustBeReachingVariableDef)v26).createInitialEstimateLattice();
    Object v28 = ((com.google.javascript.jscomp.MustBeReachingVariableDef)v11).flowThrough(((com.google.javascript.rhino.Node)v13),((com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef)v27));
    org.junit.Assert.assertNotNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapGeneratorV2.LineMapEncoder();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v4));
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = ((com.google.javascript.jscomp.Scope)v7).getDeclarativelyUnboundVarsWithoutTypes();
    Object v9 = "\"eval";
    Object v10 = new java.io.PrintStream(((java.lang.String)v9));
    Object v11 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v10));
    Object v12 = new com.google.javascript.jscomp.MustBeReachingVariableDef(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.jscomp.AbstractCompiler)v11));
    Object v13 = ":";
    Object v14 = new com.google.javascript.rhino.Node[]{};
    Object v15 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v14));
    Object v16 = ((com.google.javascript.jscomp.MustBeReachingVariableDef)v12).dependsOnOuterScopeVars(((java.lang.String)v13),((com.google.javascript.rhino.Node)v15));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapGeneratorV2.LineMapEncoder();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v4));
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = "\"eval";
    Object v9 = new java.io.PrintStream(((java.lang.String)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = new com.google.javascript.jscomp.MustBeReachingVariableDef(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v12 = ",";
    Object v13 = new com.google.javascript.rhino.Node[]{};
    Object v14 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v13));
    Object v15 = ((com.google.javascript.jscomp.MustBeReachingVariableDef)v11).getDef(((java.lang.String)v12),((com.google.javascript.rhino.Node)v14));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new com.google.debugging.sourcemap.SourceMapGeneratorV2.LineMapEncoder();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.debugging.sourcemap.SourceMapGeneratorV2.LineMapEncoder();
    Object v5 = ((com.google.javascript.jscomp.graph.LinkedDirectedGraph)v3).getNode(((java.lang.Object)v4));
    Object v6 = new com.google.javascript.rhino.Node[]{};
    Object v7 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v6));
    Object v8 = null;
    Object v9 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.jstype.ObjectType)v8));
    Object v10 = "\"eval";
    Object v11 = new java.io.PrintStream(((java.lang.String)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v11));
    Object v13 = new com.google.javascript.jscomp.MustBeReachingVariableDef(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v9),((com.google.javascript.jscomp.AbstractCompiler)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapGeneratorV2.LineMapEncoder();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.debugging.sourcemap.SourceMapGeneratorV2.LineMapEncoder();
    Object v5 = ((com.google.javascript.jscomp.graph.LinkedDirectedGraph)v3).getNode(((java.lang.Object)v4));
    Object v6 = new com.google.javascript.rhino.Node[]{};
    Object v7 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v6));
    Object v8 = null;
    Object v9 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.jstype.ObjectType)v8));
    Object v10 = "\"eval";
    Object v11 = new java.io.PrintStream(((java.lang.String)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v11));
    Object v13 = new com.google.javascript.jscomp.MustBeReachingVariableDef(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v9),((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = "";
    Object v15 = new com.google.javascript.rhino.Node[]{};
    Object v16 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v15));
    Object v17 = ((com.google.javascript.jscomp.MustBeReachingVariableDef)v13).dependsOnOuterScopeVars(((java.lang.String)v14),((com.google.javascript.rhino.Node)v16));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new com.google.debugging.sourcemap.SourceMapGeneratorV2.LineMapEncoder();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.debugging.sourcemap.SourceMapGeneratorV2.LineMapEncoder();
    Object v5 = ((com.google.javascript.jscomp.graph.LinkedDirectedGraph)v3).getNode(((java.lang.Object)v4));
    Object v6 = new com.google.javascript.rhino.Node[]{};
    Object v7 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v6));
    Object v8 = null;
    Object v9 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.jstype.ObjectType)v8));
    Object v10 = "\"eval";
    Object v11 = new java.io.PrintStream(((java.lang.String)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v11));
    Object v13 = new com.google.javascript.jscomp.MustBeReachingVariableDef(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v9),((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = ((com.google.javascript.jscomp.MustBeReachingVariableDef)v13).createInitialEstimateLattice();
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapGeneratorV2.LineMapEncoder();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.debugging.sourcemap.SourceMapGeneratorV2.LineMapEncoder();
    Object v5 = ((com.google.javascript.jscomp.graph.LinkedDirectedGraph)v3).getNode(((java.lang.Object)v4));
    Object v6 = new com.google.javascript.rhino.Node[]{};
    Object v7 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v6));
    Object v8 = null;
    Object v9 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.jstype.ObjectType)v8));
    Object v10 = "\"eval";
    Object v11 = new java.io.PrintStream(((java.lang.String)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v11));
    Object v13 = new com.google.javascript.jscomp.MustBeReachingVariableDef(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v9),((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = "";
    Object v15 = new com.google.javascript.rhino.Node[]{};
    Object v16 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v15));
    Object v17 = ((com.google.javascript.jscomp.MustBeReachingVariableDef)v13).getDef(((java.lang.String)v14),((com.google.javascript.rhino.Node)v16));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new com.google.debugging.sourcemap.SourceMapGeneratorV2.LineMapEncoder();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.debugging.sourcemap.SourceMapGeneratorV2.LineMapEncoder();
    Object v5 = ((com.google.javascript.jscomp.graph.LinkedDirectedGraph)v3).getNode(((java.lang.Object)v4));
    Object v6 = new com.google.javascript.rhino.Node[]{};
    Object v7 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v6));
    Object v8 = null;
    Object v9 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.jstype.ObjectType)v8));
    Object v10 = "\"eval";
    Object v11 = new java.io.PrintStream(((java.lang.String)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v11));
    Object v13 = new com.google.javascript.jscomp.MustBeReachingVariableDef(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v9),((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = ((com.google.javascript.jscomp.MustBeReachingVariableDef)v13).createEntryLattice();
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapGeneratorV2.LineMapEncoder();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.debugging.sourcemap.SourceMapGeneratorV2.LineMapEncoder();
    Object v5 = ((com.google.javascript.jscomp.graph.LinkedDirectedGraph)v3).getNode(((java.lang.Object)v4));
    Object v6 = new com.google.javascript.rhino.Node[]{};
    Object v7 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v6));
    Object v8 = null;
    Object v9 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.jstype.ObjectType)v8));
    Object v10 = "\"eval";
    Object v11 = new java.io.PrintStream(((java.lang.String)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v11));
    Object v13 = new com.google.javascript.jscomp.MustBeReachingVariableDef(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v9),((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = "Z";
    Object v15 = new com.google.javascript.rhino.Node[]{};
    Object v16 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v15));
    Object v17 = ((com.google.javascript.rhino.Node)v16).getSourceOffset();
    Object v18 = ((com.google.javascript.jscomp.MustBeReachingVariableDef)v13).dependsOnOuterScopeVars(((java.lang.String)v14),((com.google.javascript.rhino.Node)v16));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapGeneratorV2.LineMapEncoder();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v4));
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = "\"eval";
    Object v9 = new java.io.PrintStream(((java.lang.String)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = new com.google.javascript.jscomp.MustBeReachingVariableDef(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v12 = "bad left operand to bitwise operator";
    Object v13 = new com.google.javascript.rhino.Node[]{};
    Object v14 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v13));
    Object v15 = ((com.google.javascript.jscomp.MustBeReachingVariableDef)v11).getDef(((java.lang.String)v12),((com.google.javascript.rhino.Node)v14));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapGeneratorV2.LineMapEncoder();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v4));
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = ((com.google.javascript.jscomp.Scope)v7).getDeclarativelyUnboundVarsWithoutTypes();
    Object v9 = "\"eval";
    Object v10 = new java.io.PrintStream(((java.lang.String)v9));
    Object v11 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v10));
    Object v12 = new com.google.javascript.jscomp.MustBeReachingVariableDef(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.jscomp.AbstractCompiler)v11));
    Object v13 = "5";
    Object v14 = new com.google.javascript.rhino.Node[]{};
    Object v15 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v14));
    Object v16 = ((com.google.javascript.jscomp.MustBeReachingVariableDef)v12).dependsOnOuterScopeVars(((java.lang.String)v13),((com.google.javascript.rhino.Node)v15));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapGeneratorV2.LineMapEncoder();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v4));
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = ((com.google.javascript.jscomp.Scope)v7).getDeclarativelyUnboundVarsWithoutTypes();
    Object v9 = "\"eval";
    Object v10 = new java.io.PrintStream(((java.lang.String)v9));
    Object v11 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v10));
    Object v12 = new com.google.javascript.jscomp.MustBeReachingVariableDef(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.jscomp.AbstractCompiler)v11));
    Object v13 = "b";
    Object v14 = new com.google.javascript.rhino.Node[]{};
    Object v15 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v14));
    Object v16 = ((com.google.javascript.rhino.Node)v15).isFromExterns();
    Object v17 = ((com.google.javascript.jscomp.MustBeReachingVariableDef)v12).dependsOnOuterScopeVars(((java.lang.String)v13),((com.google.javascript.rhino.Node)v15));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapGeneratorV2.LineMapEncoder();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.debugging.sourcemap.SourceMapGeneratorV2.LineMapEncoder();
    Object v5 = ((com.google.javascript.jscomp.graph.LinkedDirectedGraph)v3).getNode(((java.lang.Object)v4));
    Object v6 = new com.google.javascript.rhino.Node[]{};
    Object v7 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v6));
    Object v8 = null;
    Object v9 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.jstype.ObjectType)v8));
    Object v10 = "\"eval";
    Object v11 = new java.io.PrintStream(((java.lang.String)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v11));
    Object v13 = new com.google.javascript.jscomp.MustBeReachingVariableDef(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v9),((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = "j";
    Object v15 = new com.google.javascript.rhino.Node[]{};
    Object v16 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v15));
    Object v17 = ((com.google.javascript.jscomp.MustBeReachingVariableDef)v13).dependsOnOuterScopeVars(((java.lang.String)v14),((com.google.javascript.rhino.Node)v16));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapGeneratorV2.LineMapEncoder();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.debugging.sourcemap.SourceMapGeneratorV2.LineMapEncoder();
    Object v5 = ((com.google.javascript.jscomp.graph.LinkedDirectedGraph)v3).getNode(((java.lang.Object)v4));
    Object v6 = new com.google.javascript.rhino.Node[]{};
    Object v7 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v6));
    Object v8 = null;
    Object v9 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.jstype.ObjectType)v8));
    Object v10 = "\"eval";
    Object v11 = new java.io.PrintStream(((java.lang.String)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v11));
    Object v13 = new com.google.javascript.jscomp.MustBeReachingVariableDef(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v9),((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = "";
    Object v15 = new com.google.javascript.rhino.Node[]{};
    Object v16 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v15));
    Object v17 = 0;
    ((com.google.javascript.rhino.Node)v16).setCharno((((java.lang.Integer)v17).intValue()));
    Object v18 = null;
    Object v19 = ((com.google.javascript.jscomp.MustBeReachingVariableDef)v13).getDef(((java.lang.String)v14),((com.google.javascript.rhino.Node)v16));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new com.google.debugging.sourcemap.SourceMapGeneratorV2.LineMapEncoder();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.debugging.sourcemap.SourceMapGeneratorV2.LineMapEncoder();
    Object v5 = ((com.google.javascript.jscomp.graph.LinkedDirectedGraph)v3).getNode(((java.lang.Object)v4));
    Object v6 = new com.google.javascript.rhino.Node[]{};
    Object v7 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v6));
    Object v8 = null;
    Object v9 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.jstype.ObjectType)v8));
    Object v10 = "\"eval";
    Object v11 = new java.io.PrintStream(((java.lang.String)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v11));
    Object v13 = new com.google.javascript.jscomp.MustBeReachingVariableDef(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v9),((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = new com.google.javascript.rhino.Node[]{};
    Object v15 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v14));
    Object v16 = new com.google.debugging.sourcemap.SourceMapGeneratorV2.LineMapEncoder();
    Object v17 = true;
    Object v18 = true;
    Object v19 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v16),(((java.lang.Boolean)v17).booleanValue()),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = new com.google.javascript.rhino.Node[]{};
    Object v21 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v20));
    Object v22 = null;
    Object v23 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v21),((com.google.javascript.rhino.jstype.ObjectType)v22));
    Object v24 = ((com.google.javascript.jscomp.Scope)v23).getDeclarativelyUnboundVarsWithoutTypes();
    Object v25 = "\"eval";
    Object v26 = new java.io.PrintStream(((java.lang.String)v25));
    Object v27 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v26));
    Object v28 = new com.google.javascript.jscomp.MustBeReachingVariableDef(((com.google.javascript.jscomp.ControlFlowGraph)v19),((com.google.javascript.jscomp.Scope)v23),((com.google.javascript.jscomp.AbstractCompiler)v27));
    Object v29 = ((com.google.javascript.jscomp.MustBeReachingVariableDef)v28).createEntryLattice();
    Object v30 = ((com.google.javascript.jscomp.MustBeReachingVariableDef)v13).flowThrough(((com.google.javascript.rhino.Node)v15),((com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef)v29));
    org.junit.Assert.assertNotNull(v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapGeneratorV2.LineMapEncoder();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.debugging.sourcemap.SourceMapGeneratorV2.LineMapEncoder();
    Object v5 = ((com.google.javascript.jscomp.graph.LinkedDirectedGraph)v3).getNode(((java.lang.Object)v4));
    Object v6 = new com.google.javascript.rhino.Node[]{};
    Object v7 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v6));
    Object v8 = null;
    Object v9 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.jstype.ObjectType)v8));
    Object v10 = "\"eval";
    Object v11 = new java.io.PrintStream(((java.lang.String)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v11));
    Object v13 = new com.google.javascript.jscomp.MustBeReachingVariableDef(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v9),((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = "eval";
    Object v15 = new com.google.javascript.rhino.Node[]{};
    Object v16 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v15));
    Object v17 = ((com.google.javascript.jscomp.MustBeReachingVariableDef)v13).getDef(((java.lang.String)v14),((com.google.javascript.rhino.Node)v16));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapGeneratorV2.LineMapEncoder();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v4));
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = "\"eval";
    Object v9 = new java.io.PrintStream(((java.lang.String)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = new com.google.javascript.jscomp.MustBeReachingVariableDef(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v12 = "n";
    Object v13 = new com.google.javascript.rhino.Node[]{};
    Object v14 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v13));
    Object v15 = ((com.google.javascript.jscomp.MustBeReachingVariableDef)v11).dependsOnOuterScopeVars(((java.lang.String)v12),((com.google.javascript.rhino.Node)v14));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapGeneratorV2.LineMapEncoder();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.debugging.sourcemap.SourceMapGeneratorV2.LineMapEncoder();
    Object v5 = ((com.google.javascript.jscomp.graph.LinkedDirectedGraph)v3).getNode(((java.lang.Object)v4));
    Object v6 = new com.google.javascript.rhino.Node[]{};
    Object v7 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v6));
    Object v8 = null;
    Object v9 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.jstype.ObjectType)v8));
    Object v10 = "\"eval";
    Object v11 = new java.io.PrintStream(((java.lang.String)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v11));
    Object v13 = new com.google.javascript.jscomp.MustBeReachingVariableDef(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v9),((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = "version";
    Object v15 = new com.google.javascript.rhino.Node[]{};
    Object v16 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v15));
    Object v17 = ((com.google.javascript.jscomp.MustBeReachingVariableDef)v13).getDef(((java.lang.String)v14),((com.google.javascript.rhino.Node)v16));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapGeneratorV2.LineMapEncoder();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v4));
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = "\"eval";
    Object v9 = new java.io.PrintStream(((java.lang.String)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = new com.google.javascript.jscomp.MustBeReachingVariableDef(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v12 = "";
    Object v13 = new com.google.javascript.rhino.Node[]{};
    Object v14 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v13));
    Object v15 = ((com.google.javascript.rhino.Node)v14).siblings();
    Object v16 = ((com.google.javascript.jscomp.MustBeReachingVariableDef)v11).dependsOnOuterScopeVars(((java.lang.String)v12),((com.google.javascript.rhino.Node)v14));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapGeneratorV2.LineMapEncoder();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.debugging.sourcemap.SourceMapGeneratorV2.LineMapEncoder();
    Object v5 = ((com.google.javascript.jscomp.graph.LinkedDirectedGraph)v3).getNode(((java.lang.Object)v4));
    Object v6 = new com.google.javascript.rhino.Node[]{};
    Object v7 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v6));
    Object v8 = null;
    Object v9 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.jstype.ObjectType)v8));
    Object v10 = "\"eval";
    Object v11 = new java.io.PrintStream(((java.lang.String)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v11));
    Object v13 = new com.google.javascript.jscomp.MustBeReachingVariableDef(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v9),((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = "rguments";
    Object v15 = new com.google.javascript.rhino.Node[]{};
    Object v16 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v15));
    Object v17 = ((com.google.javascript.jscomp.MustBeReachingVariableDef)v13).dependsOnOuterScopeVars(((java.lang.String)v14),((com.google.javascript.rhino.Node)v16));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapGeneratorV2.LineMapEncoder();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v4));
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = "\"eval";
    Object v9 = new java.io.PrintStream(((java.lang.String)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = new com.google.javascript.jscomp.MustBeReachingVariableDef(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v12 = ".";
    Object v13 = new com.google.javascript.rhino.Node[]{};
    Object v14 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v13));
    Object v15 = true;
    ((com.google.javascript.rhino.Node)v14).setOptionalArg((((java.lang.Boolean)v15).booleanValue()));
    Object v16 = null;
    Object v17 = ((com.google.javascript.jscomp.MustBeReachingVariableDef)v11).dependsOnOuterScopeVars(((java.lang.String)v12),((com.google.javascript.rhino.Node)v14));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapGeneratorV2.LineMapEncoder();
    Object v1 = true;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v4));
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = "\"eval";
    Object v9 = new java.io.PrintStream(((java.lang.String)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = new com.google.javascript.jscomp.MustBeReachingVariableDef(((com.google.javascript.jscomp.ControlFlowGraph)v3),((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v12 = "msg.jsdoc.lends.missing";
    Object v13 = new com.google.javascript.rhino.Node[]{};
    Object v14 = com.google.javascript.rhino.IR.objectlit(((com.google.javascript.rhino.Node[])v13));
    Object v15 = ((com.google.javascript.jscomp.MustBeReachingVariableDef)v11).getDef(((java.lang.String)v12),((com.google.javascript.rhino.Node)v14));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }
}
