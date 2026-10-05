package com.google.javascript.jscomp;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = com.google.debugging.sourcemap.proto.Mapping.OriginalMapping.parseFrom(((java.io.InputStream)v0));
    Object v2 = true;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = java.io.InputStream.nullInputStream();
    Object v6 = ((com.google.javascript.jscomp.graph.LinkedDirectedGraph)v4).createNode(((java.lang.Object)v5));
    Object v7 = null;
    Object v8 = "inlineSimpleMethods";
    Object v9 = new java.io.PrintStream(((java.lang.String)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = new com.google.javascript.jscomp.MaybeReachingVariableUse(((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.jscomp.AbstractCompiler)v10));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = com.google.debugging.sourcemap.proto.Mapping.OriginalMapping.parseFrom(((java.io.InputStream)v0));
    Object v2 = true;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = com.google.javascript.rhino.IR.returnNode();
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = "inlineSimpleMethods";
    Object v9 = new java.io.PrintStream(((java.lang.String)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = new com.google.javascript.jscomp.MaybeReachingVariableUse(((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v12 = ((com.google.javascript.jscomp.MaybeReachingVariableUse)v11).createInitialEstimateLattice();
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = com.google.debugging.sourcemap.proto.Mapping.OriginalMapping.parseFrom(((java.io.InputStream)v0));
    Object v2 = true;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = com.google.javascript.rhino.IR.returnNode();
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = ((com.google.javascript.jscomp.graph.Graph)v4).hasNode(((java.lang.Object)v7));
    Object v9 = com.google.javascript.rhino.IR.returnNode();
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.jstype.ObjectType)v10));
    Object v12 = "inlineSimpleMethods";
    Object v13 = new java.io.PrintStream(((java.lang.String)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = new com.google.javascript.jscomp.MaybeReachingVariableUse(((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.Scope)v11),((com.google.javascript.jscomp.AbstractCompiler)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = com.google.debugging.sourcemap.proto.Mapping.OriginalMapping.parseFrom(((java.io.InputStream)v0));
    Object v2 = true;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = com.google.javascript.rhino.IR.returnNode();
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = "inlineSimpleMethods";
    Object v9 = new java.io.PrintStream(((java.lang.String)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = new com.google.javascript.jscomp.MaybeReachingVariableUse(((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v12 = ((com.google.javascript.jscomp.MaybeReachingVariableUse)v11).createEntryLattice();
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = com.google.debugging.sourcemap.proto.Mapping.OriginalMapping.parseFrom(((java.io.InputStream)v0));
    Object v2 = true;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((com.google.javascript.jscomp.graph.LinkedDirectedGraph)v4).getEdges();
    Object v6 = com.google.javascript.rhino.IR.returnNode();
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.jstype.ObjectType)v7));
    Object v9 = "inlineSimpleMethods";
    Object v10 = new java.io.PrintStream(((java.lang.String)v9));
    Object v11 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v10));
    Object v12 = new com.google.javascript.jscomp.MaybeReachingVariableUse(((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.Scope)v8),((com.google.javascript.jscomp.AbstractCompiler)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = com.google.debugging.sourcemap.proto.Mapping.OriginalMapping.parseFrom(((java.io.InputStream)v0));
    Object v2 = true;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((com.google.javascript.jscomp.graph.LinkedDirectedGraph)v4).getEdges();
    Object v6 = com.google.javascript.rhino.IR.returnNode();
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.jstype.ObjectType)v7));
    Object v9 = "inlineSimpleMethods";
    Object v10 = new java.io.PrintStream(((java.lang.String)v9));
    Object v11 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v10));
    Object v12 = new com.google.javascript.jscomp.MaybeReachingVariableUse(((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.Scope)v8),((com.google.javascript.jscomp.AbstractCompiler)v11));
    Object v13 = ((com.google.javascript.jscomp.MaybeReachingVariableUse)v12).createInitialEstimateLattice();
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = com.google.debugging.sourcemap.proto.Mapping.OriginalMapping.parseFrom(((java.io.InputStream)v0));
    Object v2 = true;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = com.google.javascript.rhino.IR.returnNode();
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = "inlineSimpleMethods";
    Object v9 = new java.io.PrintStream(((java.lang.String)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = new com.google.javascript.jscomp.MaybeReachingVariableUse(((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v12 = ((com.google.javascript.jscomp.MaybeReachingVariableUse)v11).isForward();
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = com.google.debugging.sourcemap.proto.Mapping.OriginalMapping.parseFrom(((java.io.InputStream)v0));
    Object v2 = true;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = com.google.javascript.rhino.IR.returnNode();
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = "inlineSimpleMethods";
    Object v9 = new java.io.PrintStream(((java.lang.String)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = new com.google.javascript.jscomp.MaybeReachingVariableUse(((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v12 = "";
    Object v13 = com.google.javascript.rhino.IR.returnNode();
    Object v14 = ((com.google.javascript.jscomp.MaybeReachingVariableUse)v11).getUses(((java.lang.String)v12),((com.google.javascript.rhino.Node)v13));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = com.google.debugging.sourcemap.proto.Mapping.OriginalMapping.parseFrom(((java.io.InputStream)v0));
    Object v2 = true;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = com.google.javascript.rhino.IR.returnNode();
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = ((com.google.javascript.jscomp.graph.Graph)v4).hasNode(((java.lang.Object)v7));
    Object v9 = com.google.javascript.rhino.IR.returnNode();
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.jstype.ObjectType)v10));
    Object v12 = "inlineSimpleMethods";
    Object v13 = new java.io.PrintStream(((java.lang.String)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = new com.google.javascript.jscomp.MaybeReachingVariableUse(((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.Scope)v11),((com.google.javascript.jscomp.AbstractCompiler)v14));
    Object v16 = ((com.google.javascript.jscomp.MaybeReachingVariableUse)v15).isForward();
    org.junit.Assert.assertEquals((Object)(false), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = com.google.debugging.sourcemap.proto.Mapping.OriginalMapping.parseFrom(((java.io.InputStream)v0));
    Object v2 = true;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((com.google.javascript.jscomp.graph.LinkedDirectedGraph)v4).getEdges();
    Object v6 = com.google.javascript.rhino.IR.returnNode();
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.jstype.ObjectType)v7));
    Object v9 = "inlineSimpleMethods";
    Object v10 = new java.io.PrintStream(((java.lang.String)v9));
    Object v11 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v10));
    Object v12 = new com.google.javascript.jscomp.MaybeReachingVariableUse(((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.Scope)v8),((com.google.javascript.jscomp.AbstractCompiler)v11));
    Object v13 = "!";
    Object v14 = com.google.javascript.rhino.IR.returnNode();
    Object v15 = ((com.google.javascript.jscomp.MaybeReachingVariableUse)v12).getUses(((java.lang.String)v13),((com.google.javascript.rhino.Node)v14));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = com.google.debugging.sourcemap.proto.Mapping.OriginalMapping.parseFrom(((java.io.InputStream)v0));
    Object v2 = true;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = com.google.javascript.rhino.IR.returnNode();
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = "inlineSimpleMethods";
    Object v9 = new java.io.PrintStream(((java.lang.String)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = "o";
    Object v12 = -35;
    Object v13 = ((com.google.javascript.jscomp.SourceExcerptProvider)v10).getSourceLine(((java.lang.String)v11),(((java.lang.Integer)v12).intValue()));
    Object v14 = new com.google.javascript.jscomp.MaybeReachingVariableUse(((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.jscomp.AbstractCompiler)v10));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = com.google.debugging.sourcemap.proto.Mapping.OriginalMapping.parseFrom(((java.io.InputStream)v0));
    Object v2 = true;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = com.google.javascript.rhino.IR.returnNode();
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = ((com.google.javascript.jscomp.Scope)v7).getVarCount();
    Object v9 = "inlineSimpleMethods";
    Object v10 = new java.io.PrintStream(((java.lang.String)v9));
    Object v11 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v10));
    Object v12 = new com.google.javascript.jscomp.MaybeReachingVariableUse(((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.jscomp.AbstractCompiler)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = com.google.debugging.sourcemap.proto.Mapping.OriginalMapping.parseFrom(((java.io.InputStream)v0));
    Object v2 = true;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = com.google.javascript.rhino.IR.returnNode();
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = "inlineSimpleMethods";
    Object v9 = new java.io.PrintStream(((java.lang.String)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = "o";
    Object v12 = -35;
    Object v13 = ((com.google.javascript.jscomp.SourceExcerptProvider)v10).getSourceLine(((java.lang.String)v11),(((java.lang.Integer)v12).intValue()));
    Object v14 = new com.google.javascript.jscomp.MaybeReachingVariableUse(((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v15 = ((com.google.javascript.jscomp.MaybeReachingVariableUse)v14).isForward();
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = com.google.debugging.sourcemap.proto.Mapping.OriginalMapping.parseFrom(((java.io.InputStream)v0));
    Object v2 = true;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = com.google.javascript.rhino.IR.returnNode();
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = ((com.google.javascript.jscomp.graph.Graph)v4).hasNode(((java.lang.Object)v7));
    Object v9 = com.google.javascript.rhino.IR.returnNode();
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.jstype.ObjectType)v10));
    Object v12 = "inlineSimpleMethods";
    Object v13 = new java.io.PrintStream(((java.lang.String)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = new com.google.javascript.jscomp.MaybeReachingVariableUse(((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.Scope)v11),((com.google.javascript.jscomp.AbstractCompiler)v14));
    Object v16 = ((com.google.javascript.jscomp.MaybeReachingVariableUse)v15).createInitialEstimateLattice();
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = com.google.debugging.sourcemap.proto.Mapping.OriginalMapping.parseFrom(((java.io.InputStream)v0));
    Object v2 = true;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = com.google.javascript.rhino.IR.returnNode();
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = ((com.google.javascript.jscomp.Scope)v7).getVarCount();
    Object v9 = "inlineSimpleMethods";
    Object v10 = new java.io.PrintStream(((java.lang.String)v9));
    Object v11 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v10));
    Object v12 = new com.google.javascript.jscomp.MaybeReachingVariableUse(((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.jscomp.AbstractCompiler)v11));
    Object v13 = "";
    Object v14 = com.google.javascript.rhino.IR.returnNode();
    Object v15 = ((com.google.javascript.jscomp.MaybeReachingVariableUse)v12).getUses(((java.lang.String)v13),((com.google.javascript.rhino.Node)v14));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = com.google.debugging.sourcemap.proto.Mapping.OriginalMapping.parseFrom(((java.io.InputStream)v0));
    Object v2 = true;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = com.google.javascript.rhino.IR.returnNode();
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = "inlineSimpleMethods";
    Object v9 = new java.io.PrintStream(((java.lang.String)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = new com.google.javascript.jscomp.MaybeReachingVariableUse(((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.jscomp.AbstractCompiler)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = com.google.debugging.sourcemap.proto.Mapping.OriginalMapping.parseFrom(((java.io.InputStream)v0));
    Object v2 = true;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = com.google.javascript.rhino.IR.returnNode();
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = "inlineSimpleMethods";
    Object v9 = new java.io.PrintStream(((java.lang.String)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = new com.google.javascript.jscomp.MaybeReachingVariableUse(((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v12 = com.google.javascript.rhino.IR.returnNode();
    Object v13 = java.io.InputStream.nullInputStream();
    Object v14 = com.google.debugging.sourcemap.proto.Mapping.OriginalMapping.parseFrom(((java.io.InputStream)v13));
    Object v15 = true;
    Object v16 = true;
    Object v17 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v14),(((java.lang.Boolean)v15).booleanValue()),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = com.google.javascript.rhino.IR.returnNode();
    Object v19 = null;
    Object v20 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v18),((com.google.javascript.rhino.jstype.ObjectType)v19));
    Object v21 = ((com.google.javascript.jscomp.graph.Graph)v17).hasNode(((java.lang.Object)v20));
    Object v22 = com.google.javascript.rhino.IR.returnNode();
    Object v23 = null;
    Object v24 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v22),((com.google.javascript.rhino.jstype.ObjectType)v23));
    Object v25 = "inlineSimpleMethods";
    Object v26 = new java.io.PrintStream(((java.lang.String)v25));
    Object v27 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v26));
    Object v28 = new com.google.javascript.jscomp.MaybeReachingVariableUse(((com.google.javascript.jscomp.ControlFlowGraph)v17),((com.google.javascript.jscomp.Scope)v24),((com.google.javascript.jscomp.AbstractCompiler)v27));
    Object v29 = ((com.google.javascript.jscomp.MaybeReachingVariableUse)v28).createInitialEstimateLattice();
    Object v30 = ((com.google.javascript.jscomp.MaybeReachingVariableUse)v11).flowThrough(((com.google.javascript.rhino.Node)v12),((com.google.javascript.jscomp.MaybeReachingVariableUse.ReachingUses)v29));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = com.google.debugging.sourcemap.proto.Mapping.OriginalMapping.parseFrom(((java.io.InputStream)v0));
    Object v2 = true;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = com.google.javascript.rhino.IR.returnNode();
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = "inlineSimpleMethods";
    Object v9 = new java.io.PrintStream(((java.lang.String)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = "o";
    Object v12 = -35;
    Object v13 = ((com.google.javascript.jscomp.SourceExcerptProvider)v10).getSourceLine(((java.lang.String)v11),(((java.lang.Integer)v12).intValue()));
    Object v14 = new com.google.javascript.jscomp.MaybeReachingVariableUse(((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v15 = "";
    Object v16 = com.google.javascript.rhino.IR.returnNode();
    Object v17 = ((com.google.javascript.rhino.Node)v16).getLength();
    Object v18 = ((com.google.javascript.jscomp.MaybeReachingVariableUse)v14).getUses(((java.lang.String)v15),((com.google.javascript.rhino.Node)v16));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = com.google.debugging.sourcemap.proto.Mapping.OriginalMapping.parseFrom(((java.io.InputStream)v0));
    Object v2 = true;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = com.google.javascript.rhino.IR.returnNode();
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = ((com.google.javascript.jscomp.graph.Graph)v4).hasNode(((java.lang.Object)v7));
    Object v9 = com.google.javascript.rhino.IR.returnNode();
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.jstype.ObjectType)v10));
    Object v12 = "inlineSimpleMethods";
    Object v13 = new java.io.PrintStream(((java.lang.String)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = new com.google.javascript.jscomp.MaybeReachingVariableUse(((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.Scope)v11),((com.google.javascript.jscomp.AbstractCompiler)v14));
    Object v16 = ((com.google.javascript.jscomp.MaybeReachingVariableUse)v15).createEntryLattice();
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = com.google.debugging.sourcemap.proto.Mapping.OriginalMapping.parseFrom(((java.io.InputStream)v0));
    Object v2 = true;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = com.google.javascript.rhino.IR.returnNode();
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = ((com.google.javascript.jscomp.Scope)v7).getVarCount();
    Object v9 = "inlineSimpleMethods";
    Object v10 = new java.io.PrintStream(((java.lang.String)v9));
    Object v11 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v10));
    Object v12 = new com.google.javascript.jscomp.MaybeReachingVariableUse(((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.jscomp.AbstractCompiler)v11));
    Object v13 = com.google.javascript.rhino.IR.returnNode();
    Object v14 = java.io.InputStream.nullInputStream();
    Object v15 = com.google.debugging.sourcemap.proto.Mapping.OriginalMapping.parseFrom(((java.io.InputStream)v14));
    Object v16 = true;
    Object v17 = true;
    Object v18 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v15),(((java.lang.Boolean)v16).booleanValue()),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = ((com.google.javascript.jscomp.graph.LinkedDirectedGraph)v18).getEdges();
    Object v20 = com.google.javascript.rhino.IR.returnNode();
    Object v21 = null;
    Object v22 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.jstype.ObjectType)v21));
    Object v23 = "inlineSimpleMethods";
    Object v24 = new java.io.PrintStream(((java.lang.String)v23));
    Object v25 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v24));
    Object v26 = new com.google.javascript.jscomp.MaybeReachingVariableUse(((com.google.javascript.jscomp.ControlFlowGraph)v18),((com.google.javascript.jscomp.Scope)v22),((com.google.javascript.jscomp.AbstractCompiler)v25));
    Object v27 = ((com.google.javascript.jscomp.MaybeReachingVariableUse)v26).createInitialEstimateLattice();
    Object v28 = com.google.javascript.rhino.IR.returnNode();
    Object v29 = null;
    Object v30 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v28),((com.google.javascript.rhino.jstype.ObjectType)v29));
    Object v31 = ((com.google.javascript.jscomp.MaybeReachingVariableUse.ReachingUses)v27).equals(((java.lang.Object)v30));
    Object v32 = ((com.google.javascript.jscomp.MaybeReachingVariableUse)v12).flowThrough(((com.google.javascript.rhino.Node)v13),((com.google.javascript.jscomp.MaybeReachingVariableUse.ReachingUses)v27));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = com.google.debugging.sourcemap.proto.Mapping.OriginalMapping.parseFrom(((java.io.InputStream)v0));
    Object v2 = true;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = com.google.javascript.rhino.IR.returnNode();
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = "inlineSimpleMethods";
    Object v9 = new java.io.PrintStream(((java.lang.String)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = "o";
    Object v12 = -35;
    Object v13 = ((com.google.javascript.jscomp.SourceExcerptProvider)v10).getSourceLine(((java.lang.String)v11),(((java.lang.Integer)v12).intValue()));
    Object v14 = new com.google.javascript.jscomp.MaybeReachingVariableUse(((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v15 = ((com.google.javascript.jscomp.MaybeReachingVariableUse)v14).createEntryLattice();
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = com.google.debugging.sourcemap.proto.Mapping.OriginalMapping.parseFrom(((java.io.InputStream)v0));
    Object v2 = true;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((com.google.javascript.jscomp.graph.LinkedDirectedGraph)v4).getEdges();
    Object v6 = com.google.javascript.rhino.IR.returnNode();
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.jstype.ObjectType)v7));
    Object v9 = "inlineSimpleMethods";
    Object v10 = new java.io.PrintStream(((java.lang.String)v9));
    Object v11 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v10));
    Object v12 = new com.google.javascript.jscomp.MaybeReachingVariableUse(((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.Scope)v8),((com.google.javascript.jscomp.AbstractCompiler)v11));
    Object v13 = ((com.google.javascript.jscomp.MaybeReachingVariableUse)v12).createEntryLattice();
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = com.google.debugging.sourcemap.proto.Mapping.OriginalMapping.parseFrom(((java.io.InputStream)v0));
    Object v2 = true;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = com.google.javascript.rhino.IR.returnNode();
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = "";
    Object v9 = ((com.google.javascript.jscomp.Scope)v7).getOwnSlot(((java.lang.String)v8));
    Object v10 = "inlineSimpleMethods";
    Object v11 = new java.io.PrintStream(((java.lang.String)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v11));
    Object v13 = new com.google.javascript.jscomp.MaybeReachingVariableUse(((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.jscomp.AbstractCompiler)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = com.google.debugging.sourcemap.proto.Mapping.OriginalMapping.parseFrom(((java.io.InputStream)v0));
    Object v2 = true;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((com.google.javascript.jscomp.graph.LinkedDirectedGraph)v4).getEdges();
    Object v6 = com.google.javascript.rhino.IR.returnNode();
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.jstype.ObjectType)v7));
    Object v9 = "inlineSimpleMethods";
    Object v10 = new java.io.PrintStream(((java.lang.String)v9));
    Object v11 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v10));
    Object v12 = new com.google.javascript.jscomp.MaybeReachingVariableUse(((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.Scope)v8),((com.google.javascript.jscomp.AbstractCompiler)v11));
    Object v13 = "prototype";
    Object v14 = com.google.javascript.rhino.IR.returnNode();
    Object v15 = ((com.google.javascript.rhino.Node)v14).isNoSideEffectsCall();
    Object v16 = ((com.google.javascript.jscomp.MaybeReachingVariableUse)v12).getUses(((java.lang.String)v13),((com.google.javascript.rhino.Node)v14));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = com.google.debugging.sourcemap.proto.Mapping.OriginalMapping.parseFrom(((java.io.InputStream)v0));
    Object v2 = true;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = com.google.javascript.rhino.IR.returnNode();
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = "inlineSimpleMethods";
    Object v9 = new java.io.PrintStream(((java.lang.String)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = "o";
    Object v12 = -35;
    Object v13 = ((com.google.javascript.jscomp.SourceExcerptProvider)v10).getSourceLine(((java.lang.String)v11),(((java.lang.Integer)v12).intValue()));
    Object v14 = new com.google.javascript.jscomp.MaybeReachingVariableUse(((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v15 = ((com.google.javascript.jscomp.MaybeReachingVariableUse)v14).createInitialEstimateLattice();
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = com.google.debugging.sourcemap.proto.Mapping.OriginalMapping.parseFrom(((java.io.InputStream)v0));
    Object v2 = true;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((com.google.javascript.jscomp.graph.LinkedDirectedGraph)v4).getEdges();
    Object v6 = com.google.javascript.rhino.IR.returnNode();
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.jstype.ObjectType)v7));
    Object v9 = "inlineSimpleMethods";
    Object v10 = new java.io.PrintStream(((java.lang.String)v9));
    Object v11 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v10));
    Object v12 = new com.google.javascript.jscomp.MaybeReachingVariableUse(((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.Scope)v8),((com.google.javascript.jscomp.AbstractCompiler)v11));
    Object v13 = ((com.google.javascript.jscomp.MaybeReachingVariableUse)v12).isForward();
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = com.google.debugging.sourcemap.proto.Mapping.OriginalMapping.parseFrom(((java.io.InputStream)v0));
    Object v2 = true;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = com.google.javascript.rhino.IR.returnNode();
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = ((com.google.javascript.jscomp.graph.Graph)v4).hasNode(((java.lang.Object)v7));
    Object v9 = com.google.javascript.rhino.IR.returnNode();
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.jstype.ObjectType)v10));
    Object v12 = "inlineSimpleMethods";
    Object v13 = new java.io.PrintStream(((java.lang.String)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = new com.google.javascript.jscomp.MaybeReachingVariableUse(((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.Scope)v11),((com.google.javascript.jscomp.AbstractCompiler)v14));
    Object v16 = com.google.javascript.rhino.IR.returnNode();
    Object v17 = java.io.InputStream.nullInputStream();
    Object v18 = com.google.debugging.sourcemap.proto.Mapping.OriginalMapping.parseFrom(((java.io.InputStream)v17));
    Object v19 = true;
    Object v20 = true;
    Object v21 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v18),(((java.lang.Boolean)v19).booleanValue()),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = com.google.javascript.rhino.IR.returnNode();
    Object v23 = null;
    Object v24 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v22),((com.google.javascript.rhino.jstype.ObjectType)v23));
    Object v25 = ((com.google.javascript.jscomp.graph.Graph)v21).hasNode(((java.lang.Object)v24));
    Object v26 = com.google.javascript.rhino.IR.returnNode();
    Object v27 = null;
    Object v28 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v26),((com.google.javascript.rhino.jstype.ObjectType)v27));
    Object v29 = "inlineSimpleMethods";
    Object v30 = new java.io.PrintStream(((java.lang.String)v29));
    Object v31 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v30));
    Object v32 = new com.google.javascript.jscomp.MaybeReachingVariableUse(((com.google.javascript.jscomp.ControlFlowGraph)v21),((com.google.javascript.jscomp.Scope)v28),((com.google.javascript.jscomp.AbstractCompiler)v31));
    Object v33 = ((com.google.javascript.jscomp.MaybeReachingVariableUse)v32).createEntryLattice();
    Object v34 = ((com.google.javascript.jscomp.MaybeReachingVariableUse)v15).flowThrough(((com.google.javascript.rhino.Node)v16),((com.google.javascript.jscomp.MaybeReachingVariableUse.ReachingUses)v33));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = com.google.debugging.sourcemap.proto.Mapping.OriginalMapping.parseFrom(((java.io.InputStream)v0));
    Object v2 = true;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = com.google.javascript.rhino.IR.returnNode();
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = ((com.google.javascript.jscomp.Scope)v7).getVarCount();
    Object v9 = "inlineSimpleMethods";
    Object v10 = new java.io.PrintStream(((java.lang.String)v9));
    Object v11 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v10));
    Object v12 = new com.google.javascript.jscomp.MaybeReachingVariableUse(((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.jscomp.AbstractCompiler)v11));
    Object v13 = ";";
    Object v14 = com.google.javascript.rhino.IR.returnNode();
    Object v15 = com.google.javascript.rhino.IR.returnNode();
    Object v16 = ((com.google.javascript.rhino.Node)v14).copyInformationFromForTree(((com.google.javascript.rhino.Node)v15));
    Object v17 = ((com.google.javascript.jscomp.MaybeReachingVariableUse)v12).getUses(((java.lang.String)v13),((com.google.javascript.rhino.Node)v14));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = com.google.debugging.sourcemap.proto.Mapping.OriginalMapping.parseFrom(((java.io.InputStream)v0));
    Object v2 = true;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = com.google.javascript.rhino.IR.returnNode();
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = "";
    Object v9 = ((com.google.javascript.jscomp.Scope)v7).getOwnSlot(((java.lang.String)v8));
    Object v10 = "inlineSimpleMethods";
    Object v11 = new java.io.PrintStream(((java.lang.String)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v11));
    Object v13 = new com.google.javascript.jscomp.MaybeReachingVariableUse(((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = ((com.google.javascript.jscomp.MaybeReachingVariableUse)v13).createEntryLattice();
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = com.google.debugging.sourcemap.proto.Mapping.OriginalMapping.parseFrom(((java.io.InputStream)v0));
    Object v2 = true;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = com.google.javascript.rhino.IR.returnNode();
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = "inlineSimpleMethods";
    Object v9 = new java.io.PrintStream(((java.lang.String)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = ((com.google.javascript.jscomp.AbstractCompiler)v10).getProgress();
    Object v12 = new com.google.javascript.jscomp.MaybeReachingVariableUse(((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.jscomp.AbstractCompiler)v10));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = com.google.debugging.sourcemap.proto.Mapping.OriginalMapping.parseFrom(((java.io.InputStream)v0));
    Object v2 = true;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = com.google.javascript.rhino.IR.returnNode();
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = "inlineSimpleMethods";
    Object v9 = new java.io.PrintStream(((java.lang.String)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = ((com.google.javascript.jscomp.AbstractCompiler)v10).getProgress();
    Object v12 = new com.google.javascript.jscomp.MaybeReachingVariableUse(((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v13 = ((com.google.javascript.jscomp.MaybeReachingVariableUse)v12).createEntryLattice();
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = com.google.debugging.sourcemap.proto.Mapping.OriginalMapping.parseFrom(((java.io.InputStream)v0));
    Object v2 = true;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = com.google.javascript.rhino.IR.returnNode();
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = ((com.google.javascript.jscomp.Scope)v7).getVarCount();
    Object v9 = "inlineSimpleMethods";
    Object v10 = new java.io.PrintStream(((java.lang.String)v9));
    Object v11 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v10));
    Object v12 = new com.google.javascript.jscomp.MaybeReachingVariableUse(((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.jscomp.AbstractCompiler)v11));
    Object v13 = ":";
    Object v14 = com.google.javascript.rhino.IR.returnNode();
    Object v15 = ((com.google.javascript.jscomp.MaybeReachingVariableUse)v12).getUses(((java.lang.String)v13),((com.google.javascript.rhino.Node)v14));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = com.google.debugging.sourcemap.proto.Mapping.OriginalMapping.parseFrom(((java.io.InputStream)v0));
    Object v2 = true;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = com.google.javascript.rhino.IR.returnNode();
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = "inlineSimpleMethods";
    Object v9 = new java.io.PrintStream(((java.lang.String)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = ((com.google.javascript.jscomp.AbstractCompiler)v10).getProgress();
    Object v12 = new com.google.javascript.jscomp.MaybeReachingVariableUse(((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v13 = ((com.google.javascript.jscomp.MaybeReachingVariableUse)v12).createInitialEstimateLattice();
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = com.google.debugging.sourcemap.proto.Mapping.OriginalMapping.parseFrom(((java.io.InputStream)v0));
    Object v2 = true;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = com.google.javascript.rhino.IR.returnNode();
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = ((com.google.javascript.jscomp.Scope)v7).getVarCount();
    Object v9 = "inlineSimpleMethods";
    Object v10 = new java.io.PrintStream(((java.lang.String)v9));
    Object v11 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v10));
    Object v12 = new com.google.javascript.jscomp.MaybeReachingVariableUse(((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.jscomp.AbstractCompiler)v11));
    Object v13 = ((com.google.javascript.jscomp.MaybeReachingVariableUse)v12).createEntryLattice();
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = com.google.debugging.sourcemap.proto.Mapping.OriginalMapping.parseFrom(((java.io.InputStream)v0));
    Object v2 = true;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = com.google.javascript.rhino.IR.returnNode();
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = "inlineSimpleMethods";
    Object v9 = new java.io.PrintStream(((java.lang.String)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = ((com.google.javascript.jscomp.AbstractCompiler)v10).getProgress();
    Object v12 = new com.google.javascript.jscomp.MaybeReachingVariableUse(((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v13 = com.google.javascript.rhino.IR.returnNode();
    Object v14 = java.io.InputStream.nullInputStream();
    Object v15 = com.google.debugging.sourcemap.proto.Mapping.OriginalMapping.parseFrom(((java.io.InputStream)v14));
    Object v16 = true;
    Object v17 = true;
    Object v18 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v15),(((java.lang.Boolean)v16).booleanValue()),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = com.google.javascript.rhino.IR.returnNode();
    Object v20 = null;
    Object v21 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v19),((com.google.javascript.rhino.jstype.ObjectType)v20));
    Object v22 = "inlineSimpleMethods";
    Object v23 = new java.io.PrintStream(((java.lang.String)v22));
    Object v24 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v23));
    Object v25 = ((com.google.javascript.jscomp.AbstractCompiler)v24).getProgress();
    Object v26 = new com.google.javascript.jscomp.MaybeReachingVariableUse(((com.google.javascript.jscomp.ControlFlowGraph)v18),((com.google.javascript.jscomp.Scope)v21),((com.google.javascript.jscomp.AbstractCompiler)v24));
    Object v27 = ((com.google.javascript.jscomp.MaybeReachingVariableUse)v26).createInitialEstimateLattice();
    Object v28 = ((com.google.javascript.jscomp.MaybeReachingVariableUse.ReachingUses)v27).hashCode();
    Object v29 = ((com.google.javascript.jscomp.MaybeReachingVariableUse)v12).flowThrough(((com.google.javascript.rhino.Node)v13),((com.google.javascript.jscomp.MaybeReachingVariableUse.ReachingUses)v27));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = com.google.debugging.sourcemap.proto.Mapping.OriginalMapping.parseFrom(((java.io.InputStream)v0));
    Object v2 = true;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((com.google.javascript.jscomp.graph.LinkedDirectedGraph)v4).getEdges();
    Object v6 = com.google.javascript.rhino.IR.returnNode();
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.jstype.ObjectType)v7));
    Object v9 = "inlineSimpleMethods";
    Object v10 = new java.io.PrintStream(((java.lang.String)v9));
    Object v11 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v10));
    Object v12 = new com.google.javascript.jscomp.MaybeReachingVariableUse(((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.Scope)v8),((com.google.javascript.jscomp.AbstractCompiler)v11));
    Object v13 = "O";
    Object v14 = com.google.javascript.rhino.IR.returnNode();
    Object v15 = 58;
    Object v16 = ((com.google.javascript.rhino.Node)v14).getBooleanProp((((java.lang.Integer)v15).intValue()));
    Object v17 = ((com.google.javascript.jscomp.MaybeReachingVariableUse)v12).getUses(((java.lang.String)v13),((com.google.javascript.rhino.Node)v14));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = com.google.debugging.sourcemap.proto.Mapping.OriginalMapping.parseFrom(((java.io.InputStream)v0));
    Object v2 = true;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = com.google.javascript.rhino.IR.returnNode();
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = "inlineSimpleMethods";
    Object v9 = new java.io.PrintStream(((java.lang.String)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = new com.google.javascript.jscomp.MaybeReachingVariableUse(((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v12 = com.google.javascript.rhino.IR.returnNode();
    Object v13 = ((com.google.javascript.rhino.Node)v12).removeFirstChild();
    Object v14 = java.io.InputStream.nullInputStream();
    Object v15 = com.google.debugging.sourcemap.proto.Mapping.OriginalMapping.parseFrom(((java.io.InputStream)v14));
    Object v16 = true;
    Object v17 = true;
    Object v18 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v15),(((java.lang.Boolean)v16).booleanValue()),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = com.google.javascript.rhino.IR.returnNode();
    Object v20 = null;
    Object v21 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v19),((com.google.javascript.rhino.jstype.ObjectType)v20));
    Object v22 = "inlineSimpleMethods";
    Object v23 = new java.io.PrintStream(((java.lang.String)v22));
    Object v24 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v23));
    Object v25 = ((com.google.javascript.jscomp.AbstractCompiler)v24).getProgress();
    Object v26 = new com.google.javascript.jscomp.MaybeReachingVariableUse(((com.google.javascript.jscomp.ControlFlowGraph)v18),((com.google.javascript.jscomp.Scope)v21),((com.google.javascript.jscomp.AbstractCompiler)v24));
    Object v27 = ((com.google.javascript.jscomp.MaybeReachingVariableUse)v26).createInitialEstimateLattice();
    Object v28 = ((com.google.javascript.jscomp.MaybeReachingVariableUse)v11).flowThrough(((com.google.javascript.rhino.Node)v12),((com.google.javascript.jscomp.MaybeReachingVariableUse.ReachingUses)v27));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = com.google.debugging.sourcemap.proto.Mapping.OriginalMapping.parseFrom(((java.io.InputStream)v0));
    Object v2 = true;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = com.google.javascript.rhino.IR.returnNode();
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = "inlineSimpleMethods";
    Object v9 = new java.io.PrintStream(((java.lang.String)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = ((com.google.javascript.jscomp.AbstractCompiler)v10).getProgress();
    Object v12 = new com.google.javascript.jscomp.MaybeReachingVariableUse(((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v13 = com.google.javascript.rhino.IR.returnNode();
    Object v14 = java.io.InputStream.nullInputStream();
    Object v15 = com.google.debugging.sourcemap.proto.Mapping.OriginalMapping.parseFrom(((java.io.InputStream)v14));
    Object v16 = true;
    Object v17 = true;
    Object v18 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v15),(((java.lang.Boolean)v16).booleanValue()),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = com.google.javascript.rhino.IR.returnNode();
    Object v20 = null;
    Object v21 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v19),((com.google.javascript.rhino.jstype.ObjectType)v20));
    Object v22 = ((com.google.javascript.jscomp.Scope)v21).getVarCount();
    Object v23 = "inlineSimpleMethods";
    Object v24 = new java.io.PrintStream(((java.lang.String)v23));
    Object v25 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v24));
    Object v26 = new com.google.javascript.jscomp.MaybeReachingVariableUse(((com.google.javascript.jscomp.ControlFlowGraph)v18),((com.google.javascript.jscomp.Scope)v21),((com.google.javascript.jscomp.AbstractCompiler)v25));
    Object v27 = ((com.google.javascript.jscomp.MaybeReachingVariableUse)v26).createEntryLattice();
    Object v28 = ((com.google.javascript.jscomp.MaybeReachingVariableUse)v12).flowThrough(((com.google.javascript.rhino.Node)v13),((com.google.javascript.jscomp.MaybeReachingVariableUse.ReachingUses)v27));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = com.google.debugging.sourcemap.proto.Mapping.OriginalMapping.parseFrom(((java.io.InputStream)v0));
    Object v2 = true;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = com.google.javascript.rhino.IR.returnNode();
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = "inlineSimpleMethods";
    Object v9 = new java.io.PrintStream(((java.lang.String)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = new com.google.javascript.jscomp.MaybeReachingVariableUse(((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v12 = "originalname";
    Object v13 = com.google.javascript.rhino.IR.returnNode();
    Object v14 = ((com.google.javascript.jscomp.MaybeReachingVariableUse)v11).getUses(((java.lang.String)v12),((com.google.javascript.rhino.Node)v13));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = com.google.debugging.sourcemap.proto.Mapping.OriginalMapping.parseFrom(((java.io.InputStream)v0));
    Object v2 = true;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = com.google.javascript.rhino.IR.returnNode();
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = "";
    Object v9 = ((com.google.javascript.jscomp.Scope)v7).getOwnSlot(((java.lang.String)v8));
    Object v10 = "inlineSimpleMethods";
    Object v11 = new java.io.PrintStream(((java.lang.String)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v11));
    Object v13 = new com.google.javascript.jscomp.MaybeReachingVariableUse(((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = ((com.google.javascript.jscomp.MaybeReachingVariableUse)v13).createInitialEstimateLattice();
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = com.google.debugging.sourcemap.proto.Mapping.OriginalMapping.parseFrom(((java.io.InputStream)v0));
    Object v2 = true;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = com.google.javascript.rhino.IR.returnNode();
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = "inlineSimpleMethods";
    Object v9 = new java.io.PrintStream(((java.lang.String)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = ((com.google.javascript.jscomp.AbstractCompiler)v10).getProgress();
    Object v12 = new com.google.javascript.jscomp.MaybeReachingVariableUse(((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v13 = "";
    Object v14 = com.google.javascript.rhino.IR.returnNode();
    Object v15 = ((com.google.javascript.jscomp.MaybeReachingVariableUse)v12).getUses(((java.lang.String)v13),((com.google.javascript.rhino.Node)v14));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = com.google.debugging.sourcemap.proto.Mapping.OriginalMapping.parseFrom(((java.io.InputStream)v0));
    Object v2 = true;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = com.google.javascript.rhino.IR.returnNode();
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = "inlineSimpleMethods";
    Object v9 = new java.io.PrintStream(((java.lang.String)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = new com.google.javascript.jscomp.MaybeReachingVariableUse(((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v12 = com.google.javascript.rhino.IR.returnNode();
    Object v13 = java.io.InputStream.nullInputStream();
    Object v14 = com.google.debugging.sourcemap.proto.Mapping.OriginalMapping.parseFrom(((java.io.InputStream)v13));
    Object v15 = true;
    Object v16 = true;
    Object v17 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v14),(((java.lang.Boolean)v15).booleanValue()),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = com.google.javascript.rhino.IR.returnNode();
    Object v19 = null;
    Object v20 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v18),((com.google.javascript.rhino.jstype.ObjectType)v19));
    Object v21 = ((com.google.javascript.jscomp.graph.Graph)v17).hasNode(((java.lang.Object)v20));
    Object v22 = com.google.javascript.rhino.IR.returnNode();
    Object v23 = null;
    Object v24 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v22),((com.google.javascript.rhino.jstype.ObjectType)v23));
    Object v25 = "inlineSimpleMethods";
    Object v26 = new java.io.PrintStream(((java.lang.String)v25));
    Object v27 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v26));
    Object v28 = new com.google.javascript.jscomp.MaybeReachingVariableUse(((com.google.javascript.jscomp.ControlFlowGraph)v17),((com.google.javascript.jscomp.Scope)v24),((com.google.javascript.jscomp.AbstractCompiler)v27));
    Object v29 = ((com.google.javascript.jscomp.MaybeReachingVariableUse)v28).createEntryLattice();
    Object v30 = ((com.google.javascript.jscomp.MaybeReachingVariableUse)v11).flowThrough(((com.google.javascript.rhino.Node)v12),((com.google.javascript.jscomp.MaybeReachingVariableUse.ReachingUses)v29));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = com.google.debugging.sourcemap.proto.Mapping.OriginalMapping.parseFrom(((java.io.InputStream)v0));
    Object v2 = true;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = com.google.javascript.rhino.IR.returnNode();
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = "inlineSimpleMethods";
    Object v9 = new java.io.PrintStream(((java.lang.String)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = "o";
    Object v12 = -35;
    Object v13 = ((com.google.javascript.jscomp.SourceExcerptProvider)v10).getSourceLine(((java.lang.String)v11),(((java.lang.Integer)v12).intValue()));
    Object v14 = new com.google.javascript.jscomp.MaybeReachingVariableUse(((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v15 = com.google.javascript.rhino.IR.returnNode();
    Object v16 = java.io.InputStream.nullInputStream();
    Object v17 = com.google.debugging.sourcemap.proto.Mapping.OriginalMapping.parseFrom(((java.io.InputStream)v16));
    Object v18 = true;
    Object v19 = true;
    Object v20 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v17),(((java.lang.Boolean)v18).booleanValue()),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = com.google.javascript.rhino.IR.returnNode();
    Object v22 = null;
    Object v23 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v21),((com.google.javascript.rhino.jstype.ObjectType)v22));
    Object v24 = ((com.google.javascript.jscomp.Scope)v23).getVarCount();
    Object v25 = "inlineSimpleMethods";
    Object v26 = new java.io.PrintStream(((java.lang.String)v25));
    Object v27 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v26));
    Object v28 = new com.google.javascript.jscomp.MaybeReachingVariableUse(((com.google.javascript.jscomp.ControlFlowGraph)v20),((com.google.javascript.jscomp.Scope)v23),((com.google.javascript.jscomp.AbstractCompiler)v27));
    Object v29 = ((com.google.javascript.jscomp.MaybeReachingVariableUse)v28).createEntryLattice();
    Object v30 = ((com.google.javascript.jscomp.MaybeReachingVariableUse)v14).flowThrough(((com.google.javascript.rhino.Node)v15),((com.google.javascript.jscomp.MaybeReachingVariableUse.ReachingUses)v29));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = com.google.debugging.sourcemap.proto.Mapping.OriginalMapping.parseFrom(((java.io.InputStream)v0));
    Object v2 = true;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = com.google.javascript.rhino.IR.returnNode();
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = "inlineSimpleMethods";
    Object v9 = new java.io.PrintStream(((java.lang.String)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = ((com.google.javascript.jscomp.AbstractCompiler)v10).getProgress();
    Object v12 = new com.google.javascript.jscomp.MaybeReachingVariableUse(((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v13 = com.google.javascript.rhino.IR.returnNode();
    Object v14 = java.io.InputStream.nullInputStream();
    Object v15 = com.google.debugging.sourcemap.proto.Mapping.OriginalMapping.parseFrom(((java.io.InputStream)v14));
    Object v16 = true;
    Object v17 = true;
    Object v18 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v15),(((java.lang.Boolean)v16).booleanValue()),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = ((com.google.javascript.jscomp.graph.LinkedDirectedGraph)v18).getEdges();
    Object v20 = com.google.javascript.rhino.IR.returnNode();
    Object v21 = null;
    Object v22 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.jstype.ObjectType)v21));
    Object v23 = "inlineSimpleMethods";
    Object v24 = new java.io.PrintStream(((java.lang.String)v23));
    Object v25 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v24));
    Object v26 = new com.google.javascript.jscomp.MaybeReachingVariableUse(((com.google.javascript.jscomp.ControlFlowGraph)v18),((com.google.javascript.jscomp.Scope)v22),((com.google.javascript.jscomp.AbstractCompiler)v25));
    Object v27 = ((com.google.javascript.jscomp.MaybeReachingVariableUse)v26).createInitialEstimateLattice();
    Object v28 = ((com.google.javascript.jscomp.MaybeReachingVariableUse)v12).flowThrough(((com.google.javascript.rhino.Node)v13),((com.google.javascript.jscomp.MaybeReachingVariableUse.ReachingUses)v27));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = com.google.debugging.sourcemap.proto.Mapping.OriginalMapping.parseFrom(((java.io.InputStream)v0));
    Object v2 = true;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = com.google.javascript.rhino.IR.returnNode();
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = "";
    Object v9 = ((com.google.javascript.jscomp.Scope)v7).getOwnSlot(((java.lang.String)v8));
    Object v10 = "inlineSimpleMethods";
    Object v11 = new java.io.PrintStream(((java.lang.String)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v11));
    Object v13 = new com.google.javascript.jscomp.MaybeReachingVariableUse(((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = com.google.javascript.rhino.IR.returnNode();
    Object v15 = java.io.InputStream.nullInputStream();
    Object v16 = com.google.debugging.sourcemap.proto.Mapping.OriginalMapping.parseFrom(((java.io.InputStream)v15));
    Object v17 = true;
    Object v18 = true;
    Object v19 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v16),(((java.lang.Boolean)v17).booleanValue()),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = com.google.javascript.rhino.IR.returnNode();
    Object v21 = null;
    Object v22 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.jstype.ObjectType)v21));
    Object v23 = ((com.google.javascript.jscomp.Scope)v22).getVarCount();
    Object v24 = "inlineSimpleMethods";
    Object v25 = new java.io.PrintStream(((java.lang.String)v24));
    Object v26 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v25));
    Object v27 = new com.google.javascript.jscomp.MaybeReachingVariableUse(((com.google.javascript.jscomp.ControlFlowGraph)v19),((com.google.javascript.jscomp.Scope)v22),((com.google.javascript.jscomp.AbstractCompiler)v26));
    Object v28 = ((com.google.javascript.jscomp.MaybeReachingVariableUse)v27).createEntryLattice();
    Object v29 = com.google.javascript.rhino.IR.returnNode();
    Object v30 = null;
    Object v31 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v29),((com.google.javascript.rhino.jstype.ObjectType)v30));
    Object v32 = ((com.google.javascript.jscomp.MaybeReachingVariableUse.ReachingUses)v28).equals(((java.lang.Object)v31));
    Object v33 = ((com.google.javascript.jscomp.MaybeReachingVariableUse)v13).flowThrough(((com.google.javascript.rhino.Node)v14),((com.google.javascript.jscomp.MaybeReachingVariableUse.ReachingUses)v28));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = com.google.debugging.sourcemap.proto.Mapping.OriginalMapping.parseFrom(((java.io.InputStream)v0));
    Object v2 = true;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = com.google.javascript.rhino.IR.returnNode();
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = "inlineSimpleMethods";
    Object v9 = new java.io.PrintStream(((java.lang.String)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = ((com.google.javascript.jscomp.AbstractCompiler)v10).getTopScope();
    Object v12 = new com.google.javascript.jscomp.MaybeReachingVariableUse(((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.jscomp.AbstractCompiler)v10));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = com.google.debugging.sourcemap.proto.Mapping.OriginalMapping.parseFrom(((java.io.InputStream)v0));
    Object v2 = true;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = com.google.javascript.rhino.IR.returnNode();
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = ((com.google.javascript.jscomp.graph.Graph)v4).hasNode(((java.lang.Object)v7));
    Object v9 = com.google.javascript.rhino.IR.returnNode();
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.jstype.ObjectType)v10));
    Object v12 = "inlineSimpleMethods";
    Object v13 = new java.io.PrintStream(((java.lang.String)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = new com.google.javascript.jscomp.MaybeReachingVariableUse(((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.Scope)v11),((com.google.javascript.jscomp.AbstractCompiler)v14));
    Object v16 = "";
    Object v17 = com.google.javascript.rhino.IR.returnNode();
    Object v18 = ((com.google.javascript.jscomp.MaybeReachingVariableUse)v15).getUses(((java.lang.String)v16),((com.google.javascript.rhino.Node)v17));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = com.google.debugging.sourcemap.proto.Mapping.OriginalMapping.parseFrom(((java.io.InputStream)v0));
    Object v2 = true;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = com.google.javascript.rhino.IR.returnNode();
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = "inlineSimpleMethods";
    Object v9 = new java.io.PrintStream(((java.lang.String)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = ((com.google.javascript.jscomp.AbstractCompiler)v10).getProgress();
    Object v12 = new com.google.javascript.jscomp.MaybeReachingVariableUse(((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v13 = ((com.google.javascript.jscomp.MaybeReachingVariableUse)v12).isForward();
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = com.google.debugging.sourcemap.proto.Mapping.OriginalMapping.parseFrom(((java.io.InputStream)v0));
    Object v2 = true;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = com.google.javascript.rhino.IR.returnNode();
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = ((com.google.javascript.jscomp.Scope)v7).getVarCount();
    Object v9 = "inlineSimpleMethods";
    Object v10 = new java.io.PrintStream(((java.lang.String)v9));
    Object v11 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v10));
    Object v12 = new com.google.javascript.jscomp.MaybeReachingVariableUse(((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.jscomp.AbstractCompiler)v11));
    Object v13 = com.google.javascript.rhino.IR.returnNode();
    Object v14 = java.io.InputStream.nullInputStream();
    Object v15 = com.google.debugging.sourcemap.proto.Mapping.OriginalMapping.parseFrom(((java.io.InputStream)v14));
    Object v16 = true;
    Object v17 = true;
    Object v18 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v15),(((java.lang.Boolean)v16).booleanValue()),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = com.google.javascript.rhino.IR.returnNode();
    Object v20 = null;
    Object v21 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v19),((com.google.javascript.rhino.jstype.ObjectType)v20));
    Object v22 = "inlineSimpleMethods";
    Object v23 = new java.io.PrintStream(((java.lang.String)v22));
    Object v24 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v23));
    Object v25 = new com.google.javascript.jscomp.MaybeReachingVariableUse(((com.google.javascript.jscomp.ControlFlowGraph)v18),((com.google.javascript.jscomp.Scope)v21),((com.google.javascript.jscomp.AbstractCompiler)v24));
    Object v26 = ((com.google.javascript.jscomp.MaybeReachingVariableUse)v25).createEntryLattice();
    Object v27 = ((com.google.javascript.jscomp.MaybeReachingVariableUse)v12).flowThrough(((com.google.javascript.rhino.Node)v13),((com.google.javascript.jscomp.MaybeReachingVariableUse.ReachingUses)v26));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = com.google.debugging.sourcemap.proto.Mapping.OriginalMapping.parseFrom(((java.io.InputStream)v0));
    Object v2 = true;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = com.google.javascript.rhino.IR.returnNode();
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = "inlineSimpleMethods";
    Object v9 = new java.io.PrintStream(((java.lang.String)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = ((com.google.javascript.jscomp.AbstractCompiler)v10).getTopScope();
    Object v12 = new com.google.javascript.jscomp.MaybeReachingVariableUse(((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v13 = com.google.javascript.rhino.IR.returnNode();
    Object v14 = false;
    ((com.google.javascript.rhino.Node)v13).setVarArgs((((java.lang.Boolean)v14).booleanValue()));
    Object v15 = null;
    Object v16 = java.io.InputStream.nullInputStream();
    Object v17 = com.google.debugging.sourcemap.proto.Mapping.OriginalMapping.parseFrom(((java.io.InputStream)v16));
    Object v18 = true;
    Object v19 = true;
    Object v20 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v17),(((java.lang.Boolean)v18).booleanValue()),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = com.google.javascript.rhino.IR.returnNode();
    Object v22 = null;
    Object v23 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v21),((com.google.javascript.rhino.jstype.ObjectType)v22));
    Object v24 = "inlineSimpleMethods";
    Object v25 = new java.io.PrintStream(((java.lang.String)v24));
    Object v26 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v25));
    Object v27 = new com.google.javascript.jscomp.MaybeReachingVariableUse(((com.google.javascript.jscomp.ControlFlowGraph)v20),((com.google.javascript.jscomp.Scope)v23),((com.google.javascript.jscomp.AbstractCompiler)v26));
    Object v28 = ((com.google.javascript.jscomp.MaybeReachingVariableUse)v27).createEntryLattice();
    Object v29 = "inlineSimpleMethods";
    Object v30 = new java.io.PrintStream(((java.lang.String)v29));
    Object v31 = ((com.google.javascript.jscomp.MaybeReachingVariableUse.ReachingUses)v28).equals(((java.lang.Object)v30));
    Object v32 = ((com.google.javascript.jscomp.MaybeReachingVariableUse)v12).flowThrough(((com.google.javascript.rhino.Node)v13),((com.google.javascript.jscomp.MaybeReachingVariableUse.ReachingUses)v28));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = com.google.debugging.sourcemap.proto.Mapping.OriginalMapping.parseFrom(((java.io.InputStream)v0));
    Object v2 = true;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = com.google.javascript.rhino.IR.returnNode();
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = "inlineSimpleMethods";
    Object v9 = new java.io.PrintStream(((java.lang.String)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = ((com.google.javascript.jscomp.AbstractCompiler)v10).getProgress();
    Object v12 = new com.google.javascript.jscomp.MaybeReachingVariableUse(((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v13 = com.google.javascript.rhino.IR.returnNode();
    Object v14 = java.io.InputStream.nullInputStream();
    Object v15 = com.google.debugging.sourcemap.proto.Mapping.OriginalMapping.parseFrom(((java.io.InputStream)v14));
    Object v16 = true;
    Object v17 = true;
    Object v18 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v15),(((java.lang.Boolean)v16).booleanValue()),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = com.google.javascript.rhino.IR.returnNode();
    Object v20 = null;
    Object v21 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v19),((com.google.javascript.rhino.jstype.ObjectType)v20));
    Object v22 = ((com.google.javascript.jscomp.graph.Graph)v18).hasNode(((java.lang.Object)v21));
    Object v23 = com.google.javascript.rhino.IR.returnNode();
    Object v24 = null;
    Object v25 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v23),((com.google.javascript.rhino.jstype.ObjectType)v24));
    Object v26 = "inlineSimpleMethods";
    Object v27 = new java.io.PrintStream(((java.lang.String)v26));
    Object v28 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v27));
    Object v29 = new com.google.javascript.jscomp.MaybeReachingVariableUse(((com.google.javascript.jscomp.ControlFlowGraph)v18),((com.google.javascript.jscomp.Scope)v25),((com.google.javascript.jscomp.AbstractCompiler)v28));
    Object v30 = ((com.google.javascript.jscomp.MaybeReachingVariableUse)v29).createEntryLattice();
    Object v31 = ((com.google.javascript.jscomp.MaybeReachingVariableUse)v12).flowThrough(((com.google.javascript.rhino.Node)v13),((com.google.javascript.jscomp.MaybeReachingVariableUse.ReachingUses)v30));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = com.google.debugging.sourcemap.proto.Mapping.OriginalMapping.parseFrom(((java.io.InputStream)v0));
    Object v2 = true;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = com.google.javascript.rhino.IR.returnNode();
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = "inlineSimpleMethods";
    Object v9 = new java.io.PrintStream(((java.lang.String)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = ((com.google.javascript.jscomp.AbstractCompiler)v10).getTopScope();
    Object v12 = new com.google.javascript.jscomp.MaybeReachingVariableUse(((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v13 = "k";
    Object v14 = com.google.javascript.rhino.IR.returnNode();
    Object v15 = ((com.google.javascript.jscomp.MaybeReachingVariableUse)v12).getUses(((java.lang.String)v13),((com.google.javascript.rhino.Node)v14));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = com.google.debugging.sourcemap.proto.Mapping.OriginalMapping.parseFrom(((java.io.InputStream)v0));
    Object v2 = true;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = com.google.javascript.rhino.IR.returnNode();
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = "";
    Object v9 = ((com.google.javascript.jscomp.Scope)v7).getOwnSlot(((java.lang.String)v8));
    Object v10 = "inlineSimpleMethods";
    Object v11 = new java.io.PrintStream(((java.lang.String)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v11));
    Object v13 = new com.google.javascript.jscomp.MaybeReachingVariableUse(((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = "";
    Object v15 = com.google.javascript.rhino.IR.returnNode();
    Object v16 = ((com.google.javascript.jscomp.MaybeReachingVariableUse)v13).getUses(((java.lang.String)v14),((com.google.javascript.rhino.Node)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = com.google.debugging.sourcemap.proto.Mapping.OriginalMapping.parseFrom(((java.io.InputStream)v0));
    Object v2 = true;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = com.google.javascript.rhino.IR.returnNode();
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = "inlineSimpleMethods";
    Object v9 = new java.io.PrintStream(((java.lang.String)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = ((com.google.javascript.jscomp.AbstractCompiler)v10).getTopScope();
    Object v12 = new com.google.javascript.jscomp.MaybeReachingVariableUse(((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v13 = ((com.google.javascript.jscomp.MaybeReachingVariableUse)v12).isForward();
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = com.google.debugging.sourcemap.proto.Mapping.OriginalMapping.parseFrom(((java.io.InputStream)v0));
    Object v2 = true;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = com.google.javascript.rhino.IR.returnNode();
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = ((com.google.javascript.jscomp.Scope)v7).getVarCount();
    Object v9 = "inlineSimpleMethods";
    Object v10 = new java.io.PrintStream(((java.lang.String)v9));
    Object v11 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v10));
    Object v12 = new com.google.javascript.jscomp.MaybeReachingVariableUse(((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.jscomp.AbstractCompiler)v11));
    Object v13 = ((com.google.javascript.jscomp.MaybeReachingVariableUse)v12).createInitialEstimateLattice();
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = com.google.debugging.sourcemap.proto.Mapping.OriginalMapping.parseFrom(((java.io.InputStream)v0));
    Object v2 = true;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = com.google.javascript.rhino.IR.returnNode();
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = "inlineSimpleMethods";
    Object v9 = new java.io.PrintStream(((java.lang.String)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = ((com.google.javascript.jscomp.AbstractCompiler)v10).getProgress();
    Object v12 = new com.google.javascript.jscomp.MaybeReachingVariableUse(((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v13 = "arguments";
    Object v14 = com.google.javascript.rhino.IR.returnNode();
    Object v15 = ((com.google.javascript.jscomp.MaybeReachingVariableUse)v12).getUses(((java.lang.String)v13),((com.google.javascript.rhino.Node)v14));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = com.google.debugging.sourcemap.proto.Mapping.OriginalMapping.parseFrom(((java.io.InputStream)v0));
    Object v2 = true;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = com.google.javascript.rhino.IR.returnNode();
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = "inlineSimpleMethods";
    Object v9 = new java.io.PrintStream(((java.lang.String)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = ((com.google.javascript.jscomp.AbstractCompiler)v10).getTopScope();
    Object v12 = new com.google.javascript.jscomp.MaybeReachingVariableUse(((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v13 = ((com.google.javascript.jscomp.MaybeReachingVariableUse)v12).createInitialEstimateLattice();
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = com.google.debugging.sourcemap.proto.Mapping.OriginalMapping.parseFrom(((java.io.InputStream)v0));
    Object v2 = true;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    ((com.google.javascript.jscomp.graph.Graph)v4).pushNodeAnnotations();
    Object v5 = null;
    Object v6 = com.google.javascript.rhino.IR.returnNode();
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.jstype.ObjectType)v7));
    Object v9 = "n";
    Object v10 = true;
    Object v11 = ((com.google.javascript.jscomp.Scope)v8).isDeclared(((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = "inlineSimpleMethods";
    Object v13 = new java.io.PrintStream(((java.lang.String)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = new com.google.javascript.jscomp.MaybeReachingVariableUse(((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.Scope)v8),((com.google.javascript.jscomp.AbstractCompiler)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = com.google.debugging.sourcemap.proto.Mapping.OriginalMapping.parseFrom(((java.io.InputStream)v0));
    Object v2 = true;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    ((com.google.javascript.jscomp.graph.Graph)v4).pushNodeAnnotations();
    Object v5 = null;
    Object v6 = com.google.javascript.rhino.IR.returnNode();
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.jstype.ObjectType)v7));
    Object v9 = "n";
    Object v10 = true;
    Object v11 = ((com.google.javascript.jscomp.Scope)v8).isDeclared(((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = "inlineSimpleMethods";
    Object v13 = new java.io.PrintStream(((java.lang.String)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = new com.google.javascript.jscomp.MaybeReachingVariableUse(((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.Scope)v8),((com.google.javascript.jscomp.AbstractCompiler)v14));
    Object v16 = ((com.google.javascript.jscomp.MaybeReachingVariableUse)v15).isForward();
    org.junit.Assert.assertEquals((Object)(false), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = com.google.debugging.sourcemap.proto.Mapping.OriginalMapping.parseFrom(((java.io.InputStream)v0));
    Object v2 = true;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    ((com.google.javascript.jscomp.graph.Graph)v4).pushNodeAnnotations();
    Object v5 = null;
    Object v6 = com.google.javascript.rhino.IR.returnNode();
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.jstype.ObjectType)v7));
    Object v9 = "n";
    Object v10 = true;
    Object v11 = ((com.google.javascript.jscomp.Scope)v8).isDeclared(((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = "inlineSimpleMethods";
    Object v13 = new java.io.PrintStream(((java.lang.String)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = new com.google.javascript.jscomp.MaybeReachingVariableUse(((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.Scope)v8),((com.google.javascript.jscomp.AbstractCompiler)v14));
    Object v16 = com.google.javascript.rhino.IR.returnNode();
    Object v17 = java.io.InputStream.nullInputStream();
    Object v18 = com.google.debugging.sourcemap.proto.Mapping.OriginalMapping.parseFrom(((java.io.InputStream)v17));
    Object v19 = true;
    Object v20 = true;
    Object v21 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v18),(((java.lang.Boolean)v19).booleanValue()),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = com.google.javascript.rhino.IR.returnNode();
    Object v23 = null;
    Object v24 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v22),((com.google.javascript.rhino.jstype.ObjectType)v23));
    Object v25 = "";
    Object v26 = ((com.google.javascript.jscomp.Scope)v24).getOwnSlot(((java.lang.String)v25));
    Object v27 = "inlineSimpleMethods";
    Object v28 = new java.io.PrintStream(((java.lang.String)v27));
    Object v29 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v28));
    Object v30 = new com.google.javascript.jscomp.MaybeReachingVariableUse(((com.google.javascript.jscomp.ControlFlowGraph)v21),((com.google.javascript.jscomp.Scope)v24),((com.google.javascript.jscomp.AbstractCompiler)v29));
    Object v31 = ((com.google.javascript.jscomp.MaybeReachingVariableUse)v30).createEntryLattice();
    Object v32 = ((com.google.javascript.jscomp.MaybeReachingVariableUse)v15).flowThrough(((com.google.javascript.rhino.Node)v16),((com.google.javascript.jscomp.MaybeReachingVariableUse.ReachingUses)v31));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = com.google.debugging.sourcemap.proto.Mapping.OriginalMapping.parseFrom(((java.io.InputStream)v0));
    Object v2 = true;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = com.google.javascript.rhino.IR.returnNode();
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = "inlineSimpleMethods";
    Object v9 = new java.io.PrintStream(((java.lang.String)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = ((com.google.javascript.jscomp.AbstractCompiler)v10).getTopScope();
    Object v12 = new com.google.javascript.jscomp.MaybeReachingVariableUse(((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v13 = "";
    Object v14 = com.google.javascript.rhino.IR.returnNode();
    Object v15 = ((com.google.javascript.jscomp.MaybeReachingVariableUse)v12).getUses(((java.lang.String)v13),((com.google.javascript.rhino.Node)v14));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = com.google.debugging.sourcemap.proto.Mapping.OriginalMapping.parseFrom(((java.io.InputStream)v0));
    Object v2 = true;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = com.google.javascript.rhino.IR.returnNode();
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = "inlineSimpleMethods";
    Object v9 = new java.io.PrintStream(((java.lang.String)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = new com.google.javascript.jscomp.MaybeReachingVariableUse(((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v12 = "]\n";
    Object v13 = com.google.javascript.rhino.IR.returnNode();
    Object v14 = ((com.google.javascript.jscomp.MaybeReachingVariableUse)v11).getUses(((java.lang.String)v12),((com.google.javascript.rhino.Node)v13));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = com.google.debugging.sourcemap.proto.Mapping.OriginalMapping.parseFrom(((java.io.InputStream)v0));
    Object v2 = true;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = com.google.javascript.rhino.IR.returnNode();
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = "inlineSimpleMethods";
    Object v9 = new java.io.PrintStream(((java.lang.String)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = ((com.google.javascript.jscomp.AbstractCompiler)v10).getProgress();
    Object v12 = new com.google.javascript.jscomp.MaybeReachingVariableUse(((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v13 = "";
    Object v14 = com.google.javascript.rhino.IR.returnNode();
    Object v15 = ((com.google.javascript.rhino.Node)v14).siblings();
    Object v16 = ((com.google.javascript.jscomp.MaybeReachingVariableUse)v12).getUses(((java.lang.String)v13),((com.google.javascript.rhino.Node)v14));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = com.google.debugging.sourcemap.proto.Mapping.OriginalMapping.parseFrom(((java.io.InputStream)v0));
    Object v2 = true;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = com.google.javascript.rhino.IR.returnNode();
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = ((com.google.javascript.jscomp.Scope)v7).getVarCount();
    Object v9 = "inlineSimpleMethods";
    Object v10 = new java.io.PrintStream(((java.lang.String)v9));
    Object v11 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v10));
    Object v12 = new com.google.javascript.jscomp.MaybeReachingVariableUse(((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.jscomp.AbstractCompiler)v11));
    Object v13 = "7";
    Object v14 = com.google.javascript.rhino.IR.returnNode();
    Object v15 = ((com.google.javascript.jscomp.MaybeReachingVariableUse)v12).getUses(((java.lang.String)v13),((com.google.javascript.rhino.Node)v14));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = com.google.debugging.sourcemap.proto.Mapping.OriginalMapping.parseFrom(((java.io.InputStream)v0));
    Object v2 = true;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    ((com.google.javascript.jscomp.graph.Graph)v4).pushNodeAnnotations();
    Object v5 = null;
    Object v6 = com.google.javascript.rhino.IR.returnNode();
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.jstype.ObjectType)v7));
    Object v9 = "n";
    Object v10 = true;
    Object v11 = ((com.google.javascript.jscomp.Scope)v8).isDeclared(((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = "inlineSimpleMethods";
    Object v13 = new java.io.PrintStream(((java.lang.String)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = new com.google.javascript.jscomp.MaybeReachingVariableUse(((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.Scope)v8),((com.google.javascript.jscomp.AbstractCompiler)v14));
    Object v16 = "JSON parse exception: ";
    Object v17 = com.google.javascript.rhino.IR.returnNode();
    Object v18 = ((com.google.javascript.jscomp.MaybeReachingVariableUse)v15).getUses(((java.lang.String)v16),((com.google.javascript.rhino.Node)v17));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = com.google.debugging.sourcemap.proto.Mapping.OriginalMapping.parseFrom(((java.io.InputStream)v0));
    Object v2 = true;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = com.google.javascript.rhino.IR.returnNode();
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = "inlineSimpleMethods";
    Object v9 = new java.io.PrintStream(((java.lang.String)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = ((com.google.javascript.jscomp.AbstractCompiler)v10).getProgress();
    Object v12 = new com.google.javascript.jscomp.MaybeReachingVariableUse(((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v13 = "_";
    Object v14 = com.google.javascript.rhino.IR.returnNode();
    Object v15 = ((com.google.javascript.jscomp.MaybeReachingVariableUse)v12).getUses(((java.lang.String)v13),((com.google.javascript.rhino.Node)v14));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = com.google.debugging.sourcemap.proto.Mapping.OriginalMapping.parseFrom(((java.io.InputStream)v0));
    Object v2 = true;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = com.google.javascript.rhino.IR.returnNode();
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = "inlineSimpleMethods";
    Object v9 = new java.io.PrintStream(((java.lang.String)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = new com.google.javascript.jscomp.MaybeReachingVariableUse(((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v12 = com.google.javascript.rhino.IR.returnNode();
    Object v13 = java.io.InputStream.nullInputStream();
    Object v14 = com.google.debugging.sourcemap.proto.Mapping.OriginalMapping.parseFrom(((java.io.InputStream)v13));
    Object v15 = true;
    Object v16 = true;
    Object v17 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v14),(((java.lang.Boolean)v15).booleanValue()),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = com.google.javascript.rhino.IR.returnNode();
    Object v19 = null;
    Object v20 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v18),((com.google.javascript.rhino.jstype.ObjectType)v19));
    Object v21 = "inlineSimpleMethods";
    Object v22 = new java.io.PrintStream(((java.lang.String)v21));
    Object v23 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v22));
    Object v24 = ((com.google.javascript.jscomp.AbstractCompiler)v23).getProgress();
    Object v25 = new com.google.javascript.jscomp.MaybeReachingVariableUse(((com.google.javascript.jscomp.ControlFlowGraph)v17),((com.google.javascript.jscomp.Scope)v20),((com.google.javascript.jscomp.AbstractCompiler)v23));
    Object v26 = ((com.google.javascript.jscomp.MaybeReachingVariableUse)v25).createInitialEstimateLattice();
    Object v27 = ((com.google.javascript.jscomp.MaybeReachingVariableUse.ReachingUses)v26).hashCode();
    Object v28 = ((com.google.javascript.jscomp.MaybeReachingVariableUse)v11).flowThrough(((com.google.javascript.rhino.Node)v12),((com.google.javascript.jscomp.MaybeReachingVariableUse.ReachingUses)v26));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = com.google.debugging.sourcemap.proto.Mapping.OriginalMapping.parseFrom(((java.io.InputStream)v0));
    Object v2 = true;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = com.google.javascript.rhino.IR.returnNode();
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = "";
    Object v9 = ((com.google.javascript.jscomp.Scope)v7).getOwnSlot(((java.lang.String)v8));
    Object v10 = "inlineSimpleMethods";
    Object v11 = new java.io.PrintStream(((java.lang.String)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v11));
    Object v13 = new com.google.javascript.jscomp.MaybeReachingVariableUse(((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = "";
    Object v15 = com.google.javascript.rhino.IR.returnNode();
    Object v16 = com.google.javascript.rhino.IR.returnNode();
    Object v17 = ((com.google.javascript.rhino.Node)v15).checkTreeEquals(((com.google.javascript.rhino.Node)v16));
    Object v18 = ((com.google.javascript.jscomp.MaybeReachingVariableUse)v13).getUses(((java.lang.String)v14),((com.google.javascript.rhino.Node)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = com.google.debugging.sourcemap.proto.Mapping.OriginalMapping.parseFrom(((java.io.InputStream)v0));
    Object v2 = true;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = com.google.javascript.rhino.IR.returnNode();
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = "inlineSimpleMethods";
    Object v9 = new java.io.PrintStream(((java.lang.String)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = "";
    Object v12 = 0;
    Object v13 = 1;
    Object v14 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v15 = "JSC_IFqACE_INITIALIZER_NOT_IFACE";
    Object v16 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v17 = "v";
    Object v18 = com.google.javascript.jscomp.DiagnosticType.make(((java.lang.String)v15),((com.google.javascript.jscomp.CheckLevel)v16),((java.lang.String)v17));
    Object v19 = new java.lang.String[]{"z","\"",""};
    Object v20 = com.google.javascript.jscomp.JSError.make(((java.lang.String)v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),((com.google.javascript.jscomp.CheckLevel)v14),((com.google.javascript.jscomp.DiagnosticType)v18),((java.lang.String[])v19));
    ((com.google.javascript.jscomp.AbstractCompiler)v10).report(((com.google.javascript.jscomp.JSError)v20));
    Object v21 = null;
    Object v22 = new com.google.javascript.jscomp.MaybeReachingVariableUse(((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.jscomp.AbstractCompiler)v10));
    org.junit.Assert.assertNotNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = com.google.debugging.sourcemap.proto.Mapping.OriginalMapping.parseFrom(((java.io.InputStream)v0));
    Object v2 = true;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = com.google.javascript.rhino.IR.returnNode();
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = "";
    Object v9 = ((com.google.javascript.jscomp.Scope)v7).getOwnSlot(((java.lang.String)v8));
    Object v10 = "inlineSimpleMethods";
    Object v11 = new java.io.PrintStream(((java.lang.String)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v11));
    Object v13 = new com.google.javascript.jscomp.MaybeReachingVariableUse(((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = com.google.javascript.rhino.IR.returnNode();
    Object v15 = java.io.InputStream.nullInputStream();
    Object v16 = com.google.debugging.sourcemap.proto.Mapping.OriginalMapping.parseFrom(((java.io.InputStream)v15));
    Object v17 = true;
    Object v18 = true;
    Object v19 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v16),(((java.lang.Boolean)v17).booleanValue()),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = com.google.javascript.rhino.IR.returnNode();
    Object v21 = null;
    Object v22 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.jstype.ObjectType)v21));
    Object v23 = "inlineSimpleMethods";
    Object v24 = new java.io.PrintStream(((java.lang.String)v23));
    Object v25 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v24));
    Object v26 = ((com.google.javascript.jscomp.AbstractCompiler)v25).getProgress();
    Object v27 = new com.google.javascript.jscomp.MaybeReachingVariableUse(((com.google.javascript.jscomp.ControlFlowGraph)v19),((com.google.javascript.jscomp.Scope)v22),((com.google.javascript.jscomp.AbstractCompiler)v25));
    Object v28 = ((com.google.javascript.jscomp.MaybeReachingVariableUse)v27).createEntryLattice();
    Object v29 = ((com.google.javascript.jscomp.MaybeReachingVariableUse)v13).flowThrough(((com.google.javascript.rhino.Node)v14),((com.google.javascript.jscomp.MaybeReachingVariableUse.ReachingUses)v28));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = com.google.debugging.sourcemap.proto.Mapping.OriginalMapping.parseFrom(((java.io.InputStream)v0));
    Object v2 = true;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = com.google.javascript.rhino.IR.returnNode();
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = "inlineSimpleMethods";
    Object v9 = new java.io.PrintStream(((java.lang.String)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = ((com.google.javascript.jscomp.AbstractCompiler)v10).getErrorManager();
    Object v12 = new com.google.javascript.jscomp.MaybeReachingVariableUse(((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.jscomp.AbstractCompiler)v10));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = com.google.debugging.sourcemap.proto.Mapping.OriginalMapping.parseFrom(((java.io.InputStream)v0));
    Object v2 = true;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = com.google.javascript.rhino.IR.returnNode();
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = "inlineSimpleMethods";
    Object v9 = new java.io.PrintStream(((java.lang.String)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = ((com.google.javascript.jscomp.AbstractCompiler)v10).getProgress();
    Object v12 = new com.google.javascript.jscomp.MaybeReachingVariableUse(((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v13 = "AST should be normalized";
    Object v14 = com.google.javascript.rhino.IR.returnNode();
    Object v15 = ((com.google.javascript.jscomp.MaybeReachingVariableUse)v12).getUses(((java.lang.String)v13),((com.google.javascript.rhino.Node)v14));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = com.google.debugging.sourcemap.proto.Mapping.OriginalMapping.parseFrom(((java.io.InputStream)v0));
    Object v2 = true;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = com.google.javascript.rhino.IR.returnNode();
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = "inlineSimpleMethods";
    Object v9 = new java.io.PrintStream(((java.lang.String)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = ((com.google.javascript.jscomp.AbstractCompiler)v10).getErrorManager();
    Object v12 = new com.google.javascript.jscomp.MaybeReachingVariableUse(((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v13 = ((com.google.javascript.jscomp.MaybeReachingVariableUse)v12).createInitialEstimateLattice();
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = com.google.debugging.sourcemap.proto.Mapping.OriginalMapping.parseFrom(((java.io.InputStream)v0));
    Object v2 = true;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((com.google.javascript.jscomp.graph.LinkedDirectedGraph)v4).getEdges();
    Object v6 = com.google.javascript.rhino.IR.returnNode();
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.jstype.ObjectType)v7));
    Object v9 = "inlineSimpleMethods";
    Object v10 = new java.io.PrintStream(((java.lang.String)v9));
    Object v11 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v10));
    Object v12 = new com.google.javascript.jscomp.MaybeReachingVariableUse(((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.Scope)v8),((com.google.javascript.jscomp.AbstractCompiler)v11));
    Object v13 = "";
    Object v14 = com.google.javascript.rhino.IR.returnNode();
    Object v15 = ((com.google.javascript.jscomp.MaybeReachingVariableUse)v12).getUses(((java.lang.String)v13),((com.google.javascript.rhino.Node)v14));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = com.google.debugging.sourcemap.proto.Mapping.OriginalMapping.parseFrom(((java.io.InputStream)v0));
    Object v2 = true;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = com.google.javascript.rhino.IR.returnNode();
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = com.google.javascript.rhino.IR.returnNode();
    Object v9 = null;
    Object v10 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.jstype.ObjectType)v9));
    Object v11 = new com.google.javascript.jscomp.Scope.Arguments(((com.google.javascript.jscomp.Scope)v10));
    Object v12 = ((com.google.javascript.jscomp.Scope)v7).getReferences(((com.google.javascript.jscomp.Scope.Var)v11));
    Object v13 = "inlineSimpleMethods";
    Object v14 = new java.io.PrintStream(((java.lang.String)v13));
    Object v15 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v14));
    Object v16 = new com.google.javascript.jscomp.MaybeReachingVariableUse(((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.jscomp.AbstractCompiler)v15));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = com.google.debugging.sourcemap.proto.Mapping.OriginalMapping.parseFrom(((java.io.InputStream)v0));
    Object v2 = true;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = com.google.javascript.rhino.IR.returnNode();
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = "inlineSimpleMethods";
    Object v9 = new java.io.PrintStream(((java.lang.String)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = ((com.google.javascript.jscomp.AbstractCompiler)v10).getErrorManager();
    Object v12 = new com.google.javascript.jscomp.MaybeReachingVariableUse(((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v13 = com.google.javascript.rhino.IR.returnNode();
    Object v14 = java.io.InputStream.nullInputStream();
    Object v15 = com.google.debugging.sourcemap.proto.Mapping.OriginalMapping.parseFrom(((java.io.InputStream)v14));
    Object v16 = true;
    Object v17 = true;
    Object v18 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v15),(((java.lang.Boolean)v16).booleanValue()),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = com.google.javascript.rhino.IR.returnNode();
    Object v20 = null;
    Object v21 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v19),((com.google.javascript.rhino.jstype.ObjectType)v20));
    Object v22 = "inlineSimpleMethods";
    Object v23 = new java.io.PrintStream(((java.lang.String)v22));
    Object v24 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v23));
    Object v25 = ((com.google.javascript.jscomp.AbstractCompiler)v24).getProgress();
    Object v26 = new com.google.javascript.jscomp.MaybeReachingVariableUse(((com.google.javascript.jscomp.ControlFlowGraph)v18),((com.google.javascript.jscomp.Scope)v21),((com.google.javascript.jscomp.AbstractCompiler)v24));
    Object v27 = ((com.google.javascript.jscomp.MaybeReachingVariableUse)v26).createEntryLattice();
    Object v28 = ((com.google.javascript.jscomp.MaybeReachingVariableUse)v12).flowThrough(((com.google.javascript.rhino.Node)v13),((com.google.javascript.jscomp.MaybeReachingVariableUse.ReachingUses)v27));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = com.google.debugging.sourcemap.proto.Mapping.OriginalMapping.parseFrom(((java.io.InputStream)v0));
    Object v2 = true;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = com.google.javascript.rhino.IR.returnNode();
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = "inlineSimpleMethods";
    Object v9 = new java.io.PrintStream(((java.lang.String)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = "";
    Object v12 = 0;
    Object v13 = 1;
    Object v14 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v15 = "JSC_IFqACE_INITIALIZER_NOT_IFACE";
    Object v16 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v17 = "v";
    Object v18 = com.google.javascript.jscomp.DiagnosticType.make(((java.lang.String)v15),((com.google.javascript.jscomp.CheckLevel)v16),((java.lang.String)v17));
    Object v19 = new java.lang.String[]{"z","\"",""};
    Object v20 = com.google.javascript.jscomp.JSError.make(((java.lang.String)v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),((com.google.javascript.jscomp.CheckLevel)v14),((com.google.javascript.jscomp.DiagnosticType)v18),((java.lang.String[])v19));
    ((com.google.javascript.jscomp.AbstractCompiler)v10).report(((com.google.javascript.jscomp.JSError)v20));
    Object v21 = null;
    Object v22 = new com.google.javascript.jscomp.MaybeReachingVariableUse(((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v23 = "";
    Object v24 = com.google.javascript.rhino.IR.returnNode();
    Object v25 = ((com.google.javascript.jscomp.MaybeReachingVariableUse)v22).getUses(((java.lang.String)v23),((com.google.javascript.rhino.Node)v24));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = com.google.debugging.sourcemap.proto.Mapping.OriginalMapping.parseFrom(((java.io.InputStream)v0));
    Object v2 = true;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = com.google.javascript.rhino.IR.returnNode();
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = ((com.google.javascript.jscomp.Scope)v7).getVarCount();
    Object v9 = "inlineSimpleMethods";
    Object v10 = new java.io.PrintStream(((java.lang.String)v9));
    Object v11 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v10));
    Object v12 = new com.google.javascript.jscomp.MaybeReachingVariableUse(((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.jscomp.AbstractCompiler)v11));
    Object v13 = com.google.javascript.rhino.IR.returnNode();
    Object v14 = java.io.InputStream.nullInputStream();
    Object v15 = com.google.debugging.sourcemap.proto.Mapping.OriginalMapping.parseFrom(((java.io.InputStream)v14));
    Object v16 = true;
    Object v17 = true;
    Object v18 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v15),(((java.lang.Boolean)v16).booleanValue()),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = com.google.javascript.rhino.IR.returnNode();
    Object v20 = null;
    Object v21 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v19),((com.google.javascript.rhino.jstype.ObjectType)v20));
    Object v22 = "inlineSimpleMethods";
    Object v23 = new java.io.PrintStream(((java.lang.String)v22));
    Object v24 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v23));
    Object v25 = ((com.google.javascript.jscomp.AbstractCompiler)v24).getProgress();
    Object v26 = new com.google.javascript.jscomp.MaybeReachingVariableUse(((com.google.javascript.jscomp.ControlFlowGraph)v18),((com.google.javascript.jscomp.Scope)v21),((com.google.javascript.jscomp.AbstractCompiler)v24));
    Object v27 = ((com.google.javascript.jscomp.MaybeReachingVariableUse)v26).createEntryLattice();
    Object v28 = ((com.google.javascript.jscomp.MaybeReachingVariableUse.ReachingUses)v27).hashCode();
    Object v29 = ((com.google.javascript.jscomp.MaybeReachingVariableUse)v12).flowThrough(((com.google.javascript.rhino.Node)v13),((com.google.javascript.jscomp.MaybeReachingVariableUse.ReachingUses)v27));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = com.google.debugging.sourcemap.proto.Mapping.OriginalMapping.parseFrom(((java.io.InputStream)v0));
    Object v2 = true;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((com.google.javascript.jscomp.graph.LinkedDirectedGraph)v4).getEdges();
    Object v6 = com.google.javascript.rhino.IR.returnNode();
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.jstype.ObjectType)v7));
    Object v9 = "inlineSimpleMethods";
    Object v10 = new java.io.PrintStream(((java.lang.String)v9));
    Object v11 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v10));
    Object v12 = new com.google.javascript.jscomp.MaybeReachingVariableUse(((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.Scope)v8),((com.google.javascript.jscomp.AbstractCompiler)v11));
    Object v13 = com.google.javascript.rhino.IR.returnNode();
    Object v14 = ((com.google.javascript.rhino.Node)v13).getQualifiedName();
    Object v15 = java.io.InputStream.nullInputStream();
    Object v16 = com.google.debugging.sourcemap.proto.Mapping.OriginalMapping.parseFrom(((java.io.InputStream)v15));
    Object v17 = true;
    Object v18 = true;
    Object v19 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v16),(((java.lang.Boolean)v17).booleanValue()),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = com.google.javascript.rhino.IR.returnNode();
    Object v21 = null;
    Object v22 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.jstype.ObjectType)v21));
    Object v23 = ((com.google.javascript.jscomp.Scope)v22).getVarCount();
    Object v24 = "inlineSimpleMethods";
    Object v25 = new java.io.PrintStream(((java.lang.String)v24));
    Object v26 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v25));
    Object v27 = new com.google.javascript.jscomp.MaybeReachingVariableUse(((com.google.javascript.jscomp.ControlFlowGraph)v19),((com.google.javascript.jscomp.Scope)v22),((com.google.javascript.jscomp.AbstractCompiler)v26));
    Object v28 = ((com.google.javascript.jscomp.MaybeReachingVariableUse)v27).createInitialEstimateLattice();
    Object v29 = com.google.javascript.rhino.IR.returnNode();
    Object v30 = null;
    Object v31 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v29),((com.google.javascript.rhino.jstype.ObjectType)v30));
    Object v32 = ((com.google.javascript.jscomp.MaybeReachingVariableUse.ReachingUses)v28).equals(((java.lang.Object)v31));
    Object v33 = ((com.google.javascript.jscomp.MaybeReachingVariableUse)v12).flowThrough(((com.google.javascript.rhino.Node)v13),((com.google.javascript.jscomp.MaybeReachingVariableUse.ReachingUses)v28));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = com.google.debugging.sourcemap.proto.Mapping.OriginalMapping.parseFrom(((java.io.InputStream)v0));
    Object v2 = true;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    ((com.google.javascript.jscomp.graph.Graph)v4).pushNodeAnnotations();
    Object v5 = null;
    Object v6 = com.google.javascript.rhino.IR.returnNode();
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.jstype.ObjectType)v7));
    Object v9 = "n";
    Object v10 = true;
    Object v11 = ((com.google.javascript.jscomp.Scope)v8).isDeclared(((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = "inlineSimpleMethods";
    Object v13 = new java.io.PrintStream(((java.lang.String)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = new com.google.javascript.jscomp.MaybeReachingVariableUse(((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.Scope)v8),((com.google.javascript.jscomp.AbstractCompiler)v14));
    Object v16 = "e";
    Object v17 = com.google.javascript.rhino.IR.returnNode();
    Object v18 = ((com.google.javascript.jscomp.MaybeReachingVariableUse)v15).getUses(((java.lang.String)v16),((com.google.javascript.rhino.Node)v17));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = com.google.debugging.sourcemap.proto.Mapping.OriginalMapping.parseFrom(((java.io.InputStream)v0));
    Object v2 = true;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = com.google.javascript.rhino.IR.returnNode();
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = "inlineSimpleMethods";
    Object v9 = new java.io.PrintStream(((java.lang.String)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = "";
    Object v12 = 0;
    Object v13 = 1;
    Object v14 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v15 = "JSC_IFqACE_INITIALIZER_NOT_IFACE";
    Object v16 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v17 = "v";
    Object v18 = com.google.javascript.jscomp.DiagnosticType.make(((java.lang.String)v15),((com.google.javascript.jscomp.CheckLevel)v16),((java.lang.String)v17));
    Object v19 = new java.lang.String[]{"z","\"",""};
    Object v20 = com.google.javascript.jscomp.JSError.make(((java.lang.String)v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),((com.google.javascript.jscomp.CheckLevel)v14),((com.google.javascript.jscomp.DiagnosticType)v18),((java.lang.String[])v19));
    ((com.google.javascript.jscomp.AbstractCompiler)v10).report(((com.google.javascript.jscomp.JSError)v20));
    Object v21 = null;
    Object v22 = new com.google.javascript.jscomp.MaybeReachingVariableUse(((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v23 = ":";
    Object v24 = com.google.javascript.rhino.IR.returnNode();
    Object v25 = ((com.google.javascript.jscomp.MaybeReachingVariableUse)v22).getUses(((java.lang.String)v23),((com.google.javascript.rhino.Node)v24));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = com.google.debugging.sourcemap.proto.Mapping.OriginalMapping.parseFrom(((java.io.InputStream)v0));
    Object v2 = true;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((com.google.javascript.jscomp.graph.LinkedDirectedGraph)v4).newSubGraph();
    Object v6 = com.google.javascript.rhino.IR.returnNode();
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.jstype.ObjectType)v7));
    Object v9 = "inlineSimpleMethods";
    Object v10 = new java.io.PrintStream(((java.lang.String)v9));
    Object v11 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v10));
    Object v12 = new com.google.javascript.jscomp.MaybeReachingVariableUse(((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.Scope)v8),((com.google.javascript.jscomp.AbstractCompiler)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = com.google.debugging.sourcemap.proto.Mapping.OriginalMapping.parseFrom(((java.io.InputStream)v0));
    Object v2 = true;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = com.google.javascript.rhino.IR.returnNode();
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = "inlineSimpleMethods";
    Object v9 = new java.io.PrintStream(((java.lang.String)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = ((com.google.javascript.jscomp.AbstractCompiler)v10).getErrorManager();
    Object v12 = new com.google.javascript.jscomp.MaybeReachingVariableUse(((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v13 = ((com.google.javascript.jscomp.MaybeReachingVariableUse)v12).isForward();
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = com.google.debugging.sourcemap.proto.Mapping.OriginalMapping.parseFrom(((java.io.InputStream)v0));
    Object v2 = true;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = com.google.javascript.rhino.IR.returnNode();
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = ((com.google.javascript.jscomp.Scope)v7).getVarCount();
    Object v9 = "inlineSimpleMethods";
    Object v10 = new java.io.PrintStream(((java.lang.String)v9));
    Object v11 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v10));
    Object v12 = ((com.google.javascript.jscomp.AbstractCompiler)v11).getProgress();
    Object v13 = new com.google.javascript.jscomp.MaybeReachingVariableUse(((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.jscomp.AbstractCompiler)v11));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = com.google.debugging.sourcemap.proto.Mapping.OriginalMapping.parseFrom(((java.io.InputStream)v0));
    Object v2 = true;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = com.google.javascript.rhino.IR.returnNode();
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = ((com.google.javascript.jscomp.Scope)v7).getVarCount();
    Object v9 = "inlineSimpleMethods";
    Object v10 = new java.io.PrintStream(((java.lang.String)v9));
    Object v11 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v10));
    Object v12 = ((com.google.javascript.jscomp.AbstractCompiler)v11).getProgress();
    Object v13 = new com.google.javascript.jscomp.MaybeReachingVariableUse(((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.jscomp.AbstractCompiler)v11));
    Object v14 = com.google.javascript.rhino.IR.returnNode();
    Object v15 = java.io.InputStream.nullInputStream();
    Object v16 = com.google.debugging.sourcemap.proto.Mapping.OriginalMapping.parseFrom(((java.io.InputStream)v15));
    Object v17 = true;
    Object v18 = true;
    Object v19 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v16),(((java.lang.Boolean)v17).booleanValue()),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = com.google.javascript.rhino.IR.returnNode();
    Object v21 = null;
    Object v22 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.jstype.ObjectType)v21));
    Object v23 = "inlineSimpleMethods";
    Object v24 = new java.io.PrintStream(((java.lang.String)v23));
    Object v25 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v24));
    Object v26 = ((com.google.javascript.jscomp.AbstractCompiler)v25).getTopScope();
    Object v27 = new com.google.javascript.jscomp.MaybeReachingVariableUse(((com.google.javascript.jscomp.ControlFlowGraph)v19),((com.google.javascript.jscomp.Scope)v22),((com.google.javascript.jscomp.AbstractCompiler)v25));
    Object v28 = ((com.google.javascript.jscomp.MaybeReachingVariableUse)v27).createInitialEstimateLattice();
    Object v29 = ((com.google.javascript.jscomp.MaybeReachingVariableUse)v13).flowThrough(((com.google.javascript.rhino.Node)v14),((com.google.javascript.jscomp.MaybeReachingVariableUse.ReachingUses)v28));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = com.google.debugging.sourcemap.proto.Mapping.OriginalMapping.parseFrom(((java.io.InputStream)v0));
    Object v2 = true;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = com.google.javascript.rhino.IR.returnNode();
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = "";
    Object v9 = ((com.google.javascript.jscomp.Scope)v7).getOwnSlot(((java.lang.String)v8));
    Object v10 = "inlineSimpleMethods";
    Object v11 = new java.io.PrintStream(((java.lang.String)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v11));
    Object v13 = new com.google.javascript.jscomp.MaybeReachingVariableUse(((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = ((com.google.javascript.jscomp.MaybeReachingVariableUse)v13).isForward();
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = com.google.debugging.sourcemap.proto.Mapping.OriginalMapping.parseFrom(((java.io.InputStream)v0));
    Object v2 = true;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = com.google.javascript.rhino.IR.returnNode();
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = ((com.google.javascript.jscomp.Scope)v7).getVarCount();
    Object v9 = "inlineSimpleMethods";
    Object v10 = new java.io.PrintStream(((java.lang.String)v9));
    Object v11 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v10));
    Object v12 = ((com.google.javascript.jscomp.AbstractCompiler)v11).getProgress();
    Object v13 = new com.google.javascript.jscomp.MaybeReachingVariableUse(((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.jscomp.AbstractCompiler)v11));
    Object v14 = ((com.google.javascript.jscomp.MaybeReachingVariableUse)v13).createEntryLattice();
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = com.google.debugging.sourcemap.proto.Mapping.OriginalMapping.parseFrom(((java.io.InputStream)v0));
    Object v2 = true;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((com.google.javascript.jscomp.graph.LinkedDirectedGraph)v4).newSubGraph();
    Object v6 = com.google.javascript.rhino.IR.returnNode();
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.jstype.ObjectType)v7));
    Object v9 = "inlineSimpleMethods";
    Object v10 = new java.io.PrintStream(((java.lang.String)v9));
    Object v11 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v10));
    Object v12 = new com.google.javascript.jscomp.MaybeReachingVariableUse(((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.Scope)v8),((com.google.javascript.jscomp.AbstractCompiler)v11));
    Object v13 = ((com.google.javascript.jscomp.MaybeReachingVariableUse)v12).isForward();
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = com.google.debugging.sourcemap.proto.Mapping.OriginalMapping.parseFrom(((java.io.InputStream)v0));
    Object v2 = true;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    ((com.google.javascript.jscomp.graph.Graph)v4).pushNodeAnnotations();
    Object v5 = null;
    Object v6 = com.google.javascript.rhino.IR.returnNode();
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.jstype.ObjectType)v7));
    Object v9 = "n";
    Object v10 = true;
    Object v11 = ((com.google.javascript.jscomp.Scope)v8).isDeclared(((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = "inlineSimpleMethods";
    Object v13 = new java.io.PrintStream(((java.lang.String)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = new com.google.javascript.jscomp.MaybeReachingVariableUse(((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.Scope)v8),((com.google.javascript.jscomp.AbstractCompiler)v14));
    Object v16 = ((com.google.javascript.jscomp.MaybeReachingVariableUse)v15).createEntryLattice();
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = com.google.debugging.sourcemap.proto.Mapping.OriginalMapping.parseFrom(((java.io.InputStream)v0));
    Object v2 = true;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = com.google.javascript.rhino.IR.returnNode();
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = ((com.google.javascript.jscomp.Scope)v7).getVarCount();
    Object v9 = "inlineSimpleMethods";
    Object v10 = new java.io.PrintStream(((java.lang.String)v9));
    Object v11 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v10));
    Object v12 = ((com.google.javascript.jscomp.AbstractCompiler)v11).getProgress();
    Object v13 = new com.google.javascript.jscomp.MaybeReachingVariableUse(((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.jscomp.AbstractCompiler)v11));
    Object v14 = com.google.javascript.rhino.IR.returnNode();
    Object v15 = com.google.javascript.rhino.IR.returnNode();
    Object v16 = ((com.google.javascript.rhino.Node)v14).srcref(((com.google.javascript.rhino.Node)v15));
    Object v17 = java.io.InputStream.nullInputStream();
    Object v18 = com.google.debugging.sourcemap.proto.Mapping.OriginalMapping.parseFrom(((java.io.InputStream)v17));
    Object v19 = true;
    Object v20 = true;
    Object v21 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v18),(((java.lang.Boolean)v19).booleanValue()),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = ((com.google.javascript.jscomp.graph.LinkedDirectedGraph)v21).getEdges();
    Object v23 = com.google.javascript.rhino.IR.returnNode();
    Object v24 = null;
    Object v25 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v23),((com.google.javascript.rhino.jstype.ObjectType)v24));
    Object v26 = "inlineSimpleMethods";
    Object v27 = new java.io.PrintStream(((java.lang.String)v26));
    Object v28 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v27));
    Object v29 = new com.google.javascript.jscomp.MaybeReachingVariableUse(((com.google.javascript.jscomp.ControlFlowGraph)v21),((com.google.javascript.jscomp.Scope)v25),((com.google.javascript.jscomp.AbstractCompiler)v28));
    Object v30 = ((com.google.javascript.jscomp.MaybeReachingVariableUse)v29).createInitialEstimateLattice();
    Object v31 = ((com.google.javascript.jscomp.MaybeReachingVariableUse)v13).flowThrough(((com.google.javascript.rhino.Node)v14),((com.google.javascript.jscomp.MaybeReachingVariableUse.ReachingUses)v30));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = com.google.debugging.sourcemap.proto.Mapping.OriginalMapping.parseFrom(((java.io.InputStream)v0));
    Object v2 = true;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = com.google.javascript.rhino.IR.returnNode();
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = ((com.google.javascript.jscomp.Scope)v7).getVarCount();
    Object v9 = "inlineSimpleMethods";
    Object v10 = new java.io.PrintStream(((java.lang.String)v9));
    Object v11 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v10));
    Object v12 = new com.google.javascript.jscomp.MaybeReachingVariableUse(((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.jscomp.AbstractCompiler)v11));
    Object v13 = ((com.google.javascript.jscomp.MaybeReachingVariableUse)v12).isForward();
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = com.google.debugging.sourcemap.proto.Mapping.OriginalMapping.parseFrom(((java.io.InputStream)v0));
    Object v2 = true;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = com.google.javascript.rhino.IR.returnNode();
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = ((com.google.javascript.jscomp.Scope)v7).getVars();
    Object v9 = "inlineSimpleMethods";
    Object v10 = new java.io.PrintStream(((java.lang.String)v9));
    Object v11 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v10));
    ((com.google.javascript.jscomp.AbstractCompiler)v11).reportCodeChange();
    Object v12 = null;
    Object v13 = new com.google.javascript.jscomp.MaybeReachingVariableUse(((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.jscomp.AbstractCompiler)v11));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = com.google.debugging.sourcemap.proto.Mapping.OriginalMapping.parseFrom(((java.io.InputStream)v0));
    Object v2 = true;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = com.google.javascript.rhino.IR.returnNode();
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = "inlineSimpleMethods";
    Object v9 = new java.io.PrintStream(((java.lang.String)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = "`";
    Object v12 = -3;
    Object v13 = ((com.google.javascript.jscomp.SourceExcerptProvider)v10).getSourceRegion(((java.lang.String)v11),(((java.lang.Integer)v12).intValue()));
    Object v14 = new com.google.javascript.jscomp.MaybeReachingVariableUse(((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.jscomp.AbstractCompiler)v10));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = com.google.debugging.sourcemap.proto.Mapping.OriginalMapping.parseFrom(((java.io.InputStream)v0));
    Object v2 = true;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = com.google.javascript.rhino.IR.returnNode();
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = ((com.google.javascript.jscomp.Scope)v7).getVars();
    Object v9 = "inlineSimpleMethods";
    Object v10 = new java.io.PrintStream(((java.lang.String)v9));
    Object v11 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v10));
    ((com.google.javascript.jscomp.AbstractCompiler)v11).reportCodeChange();
    Object v12 = null;
    Object v13 = new com.google.javascript.jscomp.MaybeReachingVariableUse(((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.jscomp.AbstractCompiler)v11));
    Object v14 = ((com.google.javascript.jscomp.MaybeReachingVariableUse)v13).isForward();
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = com.google.debugging.sourcemap.proto.Mapping.OriginalMapping.parseFrom(((java.io.InputStream)v0));
    Object v2 = true;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    ((com.google.javascript.jscomp.graph.Graph)v4).pushNodeAnnotations();
    Object v5 = null;
    Object v6 = com.google.javascript.rhino.IR.returnNode();
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.jstype.ObjectType)v7));
    Object v9 = "n";
    Object v10 = true;
    Object v11 = ((com.google.javascript.jscomp.Scope)v8).isDeclared(((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = "inlineSimpleMethods";
    Object v13 = new java.io.PrintStream(((java.lang.String)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = new com.google.javascript.jscomp.MaybeReachingVariableUse(((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.Scope)v8),((com.google.javascript.jscomp.AbstractCompiler)v14));
    Object v16 = "";
    Object v17 = com.google.javascript.rhino.IR.returnNode();
    Object v18 = 0;
    ((com.google.javascript.rhino.Node)v17).setSourceEncodedPositionForTree((((java.lang.Integer)v18).intValue()));
    Object v19 = null;
    Object v20 = ((com.google.javascript.jscomp.MaybeReachingVariableUse)v15).getUses(((java.lang.String)v16),((com.google.javascript.rhino.Node)v17));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = com.google.debugging.sourcemap.proto.Mapping.OriginalMapping.parseFrom(((java.io.InputStream)v0));
    Object v2 = true;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = com.google.javascript.rhino.IR.returnNode();
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = ((com.google.javascript.jscomp.Scope)v7).getVarCount();
    Object v9 = "inlineSimpleMethods";
    Object v10 = new java.io.PrintStream(((java.lang.String)v9));
    Object v11 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v10));
    Object v12 = ((com.google.javascript.jscomp.AbstractCompiler)v11).getProgress();
    Object v13 = new com.google.javascript.jscomp.MaybeReachingVariableUse(((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.jscomp.AbstractCompiler)v11));
    Object v14 = com.google.javascript.rhino.IR.returnNode();
    Object v15 = java.io.InputStream.nullInputStream();
    Object v16 = com.google.debugging.sourcemap.proto.Mapping.OriginalMapping.parseFrom(((java.io.InputStream)v15));
    Object v17 = true;
    Object v18 = true;
    Object v19 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v16),(((java.lang.Boolean)v17).booleanValue()),(((java.lang.Boolean)v18).booleanValue()));
    ((com.google.javascript.jscomp.graph.Graph)v19).pushNodeAnnotations();
    Object v20 = null;
    Object v21 = com.google.javascript.rhino.IR.returnNode();
    Object v22 = null;
    Object v23 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v21),((com.google.javascript.rhino.jstype.ObjectType)v22));
    Object v24 = "n";
    Object v25 = true;
    Object v26 = ((com.google.javascript.jscomp.Scope)v23).isDeclared(((java.lang.String)v24),(((java.lang.Boolean)v25).booleanValue()));
    Object v27 = "inlineSimpleMethods";
    Object v28 = new java.io.PrintStream(((java.lang.String)v27));
    Object v29 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v28));
    Object v30 = new com.google.javascript.jscomp.MaybeReachingVariableUse(((com.google.javascript.jscomp.ControlFlowGraph)v19),((com.google.javascript.jscomp.Scope)v23),((com.google.javascript.jscomp.AbstractCompiler)v29));
    Object v31 = ((com.google.javascript.jscomp.MaybeReachingVariableUse)v30).createEntryLattice();
    Object v32 = ((com.google.javascript.jscomp.MaybeReachingVariableUse)v13).flowThrough(((com.google.javascript.rhino.Node)v14),((com.google.javascript.jscomp.MaybeReachingVariableUse.ReachingUses)v31));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = com.google.debugging.sourcemap.proto.Mapping.OriginalMapping.parseFrom(((java.io.InputStream)v0));
    Object v2 = true;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = com.google.javascript.rhino.IR.returnNode();
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = ((com.google.javascript.jscomp.Scope)v7).getVarCount();
    Object v9 = "inlineSimpleMethods";
    Object v10 = new java.io.PrintStream(((java.lang.String)v9));
    Object v11 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v10));
    Object v12 = ((com.google.javascript.jscomp.AbstractCompiler)v11).getProgress();
    Object v13 = new com.google.javascript.jscomp.MaybeReachingVariableUse(((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.jscomp.AbstractCompiler)v11));
    Object v14 = ((com.google.javascript.jscomp.MaybeReachingVariableUse)v13).isForward();
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = com.google.debugging.sourcemap.proto.Mapping.OriginalMapping.parseFrom(((java.io.InputStream)v0));
    Object v2 = true;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = com.google.javascript.rhino.IR.returnNode();
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = "inlineSimpleMethods";
    Object v9 = new java.io.PrintStream(((java.lang.String)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = "`";
    Object v12 = -3;
    Object v13 = ((com.google.javascript.jscomp.SourceExcerptProvider)v10).getSourceRegion(((java.lang.String)v11),(((java.lang.Integer)v12).intValue()));
    Object v14 = new com.google.javascript.jscomp.MaybeReachingVariableUse(((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v15 = ((com.google.javascript.jscomp.MaybeReachingVariableUse)v14).createInitialEstimateLattice();
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = com.google.debugging.sourcemap.proto.Mapping.OriginalMapping.parseFrom(((java.io.InputStream)v0));
    Object v2 = true;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((com.google.javascript.jscomp.graph.LinkedDirectedGraph)v4).newSubGraph();
    Object v6 = com.google.javascript.rhino.IR.returnNode();
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.jstype.ObjectType)v7));
    Object v9 = "inlineSimpleMethods";
    Object v10 = new java.io.PrintStream(((java.lang.String)v9));
    Object v11 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v10));
    Object v12 = new com.google.javascript.jscomp.MaybeReachingVariableUse(((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.Scope)v8),((com.google.javascript.jscomp.AbstractCompiler)v11));
    Object v13 = com.google.javascript.rhino.IR.returnNode();
    Object v14 = ((com.google.javascript.rhino.Node)v13).children();
    Object v15 = java.io.InputStream.nullInputStream();
    Object v16 = com.google.debugging.sourcemap.proto.Mapping.OriginalMapping.parseFrom(((java.io.InputStream)v15));
    Object v17 = true;
    Object v18 = true;
    Object v19 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v16),(((java.lang.Boolean)v17).booleanValue()),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = ((com.google.javascript.jscomp.graph.LinkedDirectedGraph)v19).getEdges();
    Object v21 = com.google.javascript.rhino.IR.returnNode();
    Object v22 = null;
    Object v23 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v21),((com.google.javascript.rhino.jstype.ObjectType)v22));
    Object v24 = "inlineSimpleMethods";
    Object v25 = new java.io.PrintStream(((java.lang.String)v24));
    Object v26 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v25));
    Object v27 = new com.google.javascript.jscomp.MaybeReachingVariableUse(((com.google.javascript.jscomp.ControlFlowGraph)v19),((com.google.javascript.jscomp.Scope)v23),((com.google.javascript.jscomp.AbstractCompiler)v26));
    Object v28 = ((com.google.javascript.jscomp.MaybeReachingVariableUse)v27).createEntryLattice();
    Object v29 = ((com.google.javascript.jscomp.MaybeReachingVariableUse)v12).flowThrough(((com.google.javascript.rhino.Node)v13),((com.google.javascript.jscomp.MaybeReachingVariableUse.ReachingUses)v28));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = com.google.debugging.sourcemap.proto.Mapping.OriginalMapping.parseFrom(((java.io.InputStream)v0));
    Object v2 = true;
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.ControlFlowGraph(((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((com.google.javascript.jscomp.graph.LinkedDirectedGraph)v4).newSubGraph();
    Object v6 = com.google.javascript.rhino.IR.returnNode();
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.jstype.ObjectType)v7));
    Object v9 = "inlineSimpleMethods";
    Object v10 = new java.io.PrintStream(((java.lang.String)v9));
    Object v11 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v10));
    Object v12 = new com.google.javascript.jscomp.MaybeReachingVariableUse(((com.google.javascript.jscomp.ControlFlowGraph)v4),((com.google.javascript.jscomp.Scope)v8),((com.google.javascript.jscomp.AbstractCompiler)v11));
    Object v13 = ".";
    Object v14 = com.google.javascript.rhino.IR.returnNode();
    Object v15 = ((com.google.javascript.jscomp.MaybeReachingVariableUse)v12).getUses(((java.lang.String)v13),((com.google.javascript.rhino.Node)v14));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }
}
