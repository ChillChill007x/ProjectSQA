package com.google.javascript.jscomp;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "prototypL";
    Object v5 = java.nio.charset.Charset.defaultCharset();
    Object v6 = new java.io.PrintStream(((java.lang.String)v4),((java.nio.charset.Charset)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v6));
    Object v8 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = "prototypL";
    Object v10 = java.nio.charset.Charset.defaultCharset();
    Object v11 = new java.io.PrintStream(((java.lang.String)v9),((java.nio.charset.Charset)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v11));
    Object v13 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v8),((com.google.javascript.jscomp.ScopeCreator)v13));
    Object v15 = ((com.google.javascript.jscomp.NodeTraversal)v14).hasScope();
    Object v16 = 1;
    Object v17 = new com.google.javascript.rhino.Node[]{};
    Object v18 = new com.google.javascript.rhino.Node((((java.lang.Integer)v16).intValue()),((com.google.javascript.rhino.Node[])v17));
    Object v19 = "t";
    Object v20 = "0";
    Object v21 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v19),((java.lang.String)v20));
    Object v22 = new java.lang.String[]{"","fi-ally"};
    Object v23 = ((com.google.javascript.jscomp.NodeTraversal)v14).makeError(((com.google.javascript.rhino.Node)v18),((com.google.javascript.jscomp.DiagnosticType)v21),((java.lang.String[])v22));
    org.junit.Assert.assertNotNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "prototypL";
    Object v5 = java.nio.charset.Charset.defaultCharset();
    Object v6 = new java.io.PrintStream(((java.lang.String)v4),((java.nio.charset.Charset)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v6));
    Object v8 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = "prototypL";
    Object v10 = java.nio.charset.Charset.defaultCharset();
    Object v11 = new java.io.PrintStream(((java.lang.String)v9),((java.nio.charset.Charset)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v11));
    Object v13 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v8),((com.google.javascript.jscomp.ScopeCreator)v13));
    Object v15 = 1;
    Object v16 = new com.google.javascript.rhino.Node[]{};
    Object v17 = new com.google.javascript.rhino.Node((((java.lang.Integer)v15).intValue()),((com.google.javascript.rhino.Node[])v16));
    Object v18 = "t";
    Object v19 = "0";
    Object v20 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v18),((java.lang.String)v19));
    Object v21 = new java.lang.String[]{"","pro"};
    ((com.google.javascript.jscomp.NodeTraversal)v14).report(((com.google.javascript.rhino.Node)v17),((com.google.javascript.jscomp.DiagnosticType)v20),((java.lang.String[])v21));
    Object v22 = null;
    Object v23 = ((com.google.javascript.jscomp.NodeTraversal)v14).getControlFlowGraph();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "prototypL";
    Object v5 = java.nio.charset.Charset.defaultCharset();
    Object v6 = new java.io.PrintStream(((java.lang.String)v4),((java.nio.charset.Charset)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v6));
    Object v8 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = "prototypL";
    Object v10 = java.nio.charset.Charset.defaultCharset();
    Object v11 = new java.io.PrintStream(((java.lang.String)v9),((java.nio.charset.Charset)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v11));
    Object v13 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v8),((com.google.javascript.jscomp.ScopeCreator)v13));
    Object v15 = 1;
    Object v16 = new com.google.javascript.rhino.Node[]{};
    Object v17 = new com.google.javascript.rhino.Node((((java.lang.Integer)v15).intValue()),((com.google.javascript.rhino.Node[])v16));
    Object v18 = "t";
    Object v19 = "0";
    Object v20 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v18),((java.lang.String)v19));
    Object v21 = new java.lang.String[]{"i",""};
    ((com.google.javascript.jscomp.NodeTraversal)v14).report(((com.google.javascript.rhino.Node)v17),((com.google.javascript.jscomp.DiagnosticType)v20),((java.lang.String[])v21));
    Object v22 = null;
    Object v23 = ((com.google.javascript.jscomp.NodeTraversal)v14).hasScope();
    org.junit.Assert.assertEquals((Object)(false), v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "prototypL";
    Object v5 = java.nio.charset.Charset.defaultCharset();
    Object v6 = new java.io.PrintStream(((java.lang.String)v4),((java.nio.charset.Charset)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v6));
    Object v8 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = "prototypL";
    Object v10 = java.nio.charset.Charset.defaultCharset();
    Object v11 = new java.io.PrintStream(((java.lang.String)v9),((java.nio.charset.Charset)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v11));
    Object v13 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v8),((com.google.javascript.jscomp.ScopeCreator)v13));
    Object v15 = ((com.google.javascript.jscomp.NodeTraversal)v14).getEnclosingFunction();
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "prototypL";
    Object v5 = java.nio.charset.Charset.defaultCharset();
    Object v6 = new java.io.PrintStream(((java.lang.String)v4),((java.nio.charset.Charset)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v6));
    Object v8 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = "prototypL";
    Object v10 = java.nio.charset.Charset.defaultCharset();
    Object v11 = new java.io.PrintStream(((java.lang.String)v9),((java.nio.charset.Charset)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v11));
    Object v13 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v8),((com.google.javascript.jscomp.ScopeCreator)v13));
    Object v15 = new com.google.javascript.rhino.Node[]{null};
    ((com.google.javascript.jscomp.NodeTraversal)v14).traverseRoots(((com.google.javascript.rhino.Node[])v15));
    Object v16 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "prototypL";
    Object v5 = java.nio.charset.Charset.defaultCharset();
    Object v6 = new java.io.PrintStream(((java.lang.String)v4),((java.nio.charset.Charset)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v6));
    Object v8 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = "prototypL";
    Object v10 = java.nio.charset.Charset.defaultCharset();
    Object v11 = new java.io.PrintStream(((java.lang.String)v9),((java.nio.charset.Charset)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v11));
    Object v13 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v8),((com.google.javascript.jscomp.ScopeCreator)v13));
    Object v15 = ((com.google.javascript.jscomp.NodeTraversal)v14).hasScope();
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "prototypL";
    Object v5 = java.nio.charset.Charset.defaultCharset();
    Object v6 = new java.io.PrintStream(((java.lang.String)v4),((java.nio.charset.Charset)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v6));
    Object v8 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = "prototypL";
    Object v10 = java.nio.charset.Charset.defaultCharset();
    Object v11 = new java.io.PrintStream(((java.lang.String)v9),((java.nio.charset.Charset)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v11));
    Object v13 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v8),((com.google.javascript.jscomp.ScopeCreator)v13));
    Object v15 = ((com.google.javascript.jscomp.NodeTraversal)v14).getScope();
    Object v16 = 1;
    Object v17 = new com.google.javascript.rhino.Node[]{};
    Object v18 = new com.google.javascript.rhino.Node((((java.lang.Integer)v16).intValue()),((com.google.javascript.rhino.Node[])v17));
    Object v19 = 1;
    Object v20 = new com.google.javascript.rhino.Node[]{};
    Object v21 = new com.google.javascript.rhino.Node((((java.lang.Integer)v19).intValue()),((com.google.javascript.rhino.Node[])v20));
    Object v22 = 1;
    Object v23 = new com.google.javascript.rhino.Node[]{};
    Object v24 = new com.google.javascript.rhino.Node((((java.lang.Integer)v22).intValue()),((com.google.javascript.rhino.Node[])v23));
    Object v25 = "t";
    Object v26 = "0";
    Object v27 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v25),((java.lang.String)v26));
    Object v28 = "t";
    Object v29 = "0";
    Object v30 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v28),((java.lang.String)v29));
    Object v31 = 1;
    Object v32 = new com.google.javascript.rhino.Node[]{};
    Object v33 = new com.google.javascript.rhino.Node((((java.lang.Integer)v31).intValue()),((com.google.javascript.rhino.Node[])v32));
    Object v34 = java.util.List.of(((java.lang.Object)v18),((java.lang.Object)v21),((java.lang.Object)v24),((java.lang.Object)v27),((java.lang.Object)v30),((java.lang.Object)v33));
    ((com.google.javascript.jscomp.NodeTraversal)v14).traverseRoots(((java.util.List)v34));
    Object v35 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "prototypL";
    Object v5 = java.nio.charset.Charset.defaultCharset();
    Object v6 = new java.io.PrintStream(((java.lang.String)v4),((java.nio.charset.Charset)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v6));
    Object v8 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = "prototypL";
    Object v10 = java.nio.charset.Charset.defaultCharset();
    Object v11 = new java.io.PrintStream(((java.lang.String)v9),((java.nio.charset.Charset)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v11));
    Object v13 = "prototypL";
    Object v14 = java.nio.charset.Charset.defaultCharset();
    Object v15 = new java.io.PrintStream(((java.lang.String)v13),((java.nio.charset.Charset)v14));
    Object v16 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v15));
    Object v17 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v16));
    Object v18 = "prototypL";
    Object v19 = java.nio.charset.Charset.defaultCharset();
    Object v20 = new java.io.PrintStream(((java.lang.String)v18),((java.nio.charset.Charset)v19));
    Object v21 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v20));
    Object v22 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v21));
    Object v23 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v12),((com.google.javascript.jscomp.NodeTraversal.Callback)v17),((com.google.javascript.jscomp.ScopeCreator)v22));
    Object v24 = 1;
    Object v25 = new com.google.javascript.rhino.Node[]{};
    Object v26 = new com.google.javascript.rhino.Node((((java.lang.Integer)v24).intValue()),((com.google.javascript.rhino.Node[])v25));
    Object v27 = 1;
    Object v28 = new com.google.javascript.rhino.Node[]{};
    Object v29 = new com.google.javascript.rhino.Node((((java.lang.Integer)v27).intValue()),((com.google.javascript.rhino.Node[])v28));
    ((com.google.javascript.jscomp.NodeTraversal.Callback)v8).visit(((com.google.javascript.jscomp.NodeTraversal)v23),((com.google.javascript.rhino.Node)v26),((com.google.javascript.rhino.Node)v29));
    Object v30 = null;
    Object v31 = "prototypL";
    Object v32 = java.nio.charset.Charset.defaultCharset();
    Object v33 = new java.io.PrintStream(((java.lang.String)v31),((java.nio.charset.Charset)v32));
    Object v34 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v33));
    Object v35 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v34));
    Object v36 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v8),((com.google.javascript.jscomp.ScopeCreator)v35));
    org.junit.Assert.assertNotNull(v36);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "prototypL";
    Object v5 = java.nio.charset.Charset.defaultCharset();
    Object v6 = new java.io.PrintStream(((java.lang.String)v4),((java.nio.charset.Charset)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v6));
    Object v8 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = "prototypL";
    Object v10 = java.nio.charset.Charset.defaultCharset();
    Object v11 = new java.io.PrintStream(((java.lang.String)v9),((java.nio.charset.Charset)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v11));
    Object v13 = "prototypL";
    Object v14 = java.nio.charset.Charset.defaultCharset();
    Object v15 = new java.io.PrintStream(((java.lang.String)v13),((java.nio.charset.Charset)v14));
    Object v16 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v15));
    Object v17 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v16));
    Object v18 = "prototypL";
    Object v19 = java.nio.charset.Charset.defaultCharset();
    Object v20 = new java.io.PrintStream(((java.lang.String)v18),((java.nio.charset.Charset)v19));
    Object v21 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v20));
    Object v22 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v21));
    Object v23 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v12),((com.google.javascript.jscomp.NodeTraversal.Callback)v17),((com.google.javascript.jscomp.ScopeCreator)v22));
    Object v24 = 1;
    Object v25 = new com.google.javascript.rhino.Node[]{};
    Object v26 = new com.google.javascript.rhino.Node((((java.lang.Integer)v24).intValue()),((com.google.javascript.rhino.Node[])v25));
    Object v27 = 1;
    Object v28 = new com.google.javascript.rhino.Node[]{};
    Object v29 = new com.google.javascript.rhino.Node((((java.lang.Integer)v27).intValue()),((com.google.javascript.rhino.Node[])v28));
    ((com.google.javascript.jscomp.NodeTraversal.Callback)v8).visit(((com.google.javascript.jscomp.NodeTraversal)v23),((com.google.javascript.rhino.Node)v26),((com.google.javascript.rhino.Node)v29));
    Object v30 = null;
    Object v31 = "prototypL";
    Object v32 = java.nio.charset.Charset.defaultCharset();
    Object v33 = new java.io.PrintStream(((java.lang.String)v31),((java.nio.charset.Charset)v32));
    Object v34 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v33));
    Object v35 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v34));
    Object v36 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v8),((com.google.javascript.jscomp.ScopeCreator)v35));
    Object v37 = ((com.google.javascript.jscomp.NodeTraversal)v36).hasScope();
    org.junit.Assert.assertEquals((Object)(false), v37);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "prototypL";
    Object v5 = java.nio.charset.Charset.defaultCharset();
    Object v6 = new java.io.PrintStream(((java.lang.String)v4),((java.nio.charset.Charset)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v6));
    Object v8 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = "prototypL";
    Object v10 = java.nio.charset.Charset.defaultCharset();
    Object v11 = new java.io.PrintStream(((java.lang.String)v9),((java.nio.charset.Charset)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v11));
    Object v13 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v8),((com.google.javascript.jscomp.ScopeCreator)v13));
    Object v15 = ((com.google.javascript.jscomp.NodeTraversal)v14).getModule();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "prototypL";
    Object v5 = java.nio.charset.Charset.defaultCharset();
    Object v6 = new java.io.PrintStream(((java.lang.String)v4),((java.nio.charset.Charset)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v6));
    Object v8 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = "prototypL";
    Object v10 = java.nio.charset.Charset.defaultCharset();
    Object v11 = new java.io.PrintStream(((java.lang.String)v9),((java.nio.charset.Charset)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v11));
    Object v13 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v8),((com.google.javascript.jscomp.ScopeCreator)v13));
    Object v15 = ((com.google.javascript.jscomp.NodeTraversal)v14).getScopeRoot();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "prototypL";
    Object v5 = java.nio.charset.Charset.defaultCharset();
    Object v6 = new java.io.PrintStream(((java.lang.String)v4),((java.nio.charset.Charset)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v6));
    Object v8 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = "prototypL";
    Object v10 = java.nio.charset.Charset.defaultCharset();
    Object v11 = new java.io.PrintStream(((java.lang.String)v9),((java.nio.charset.Charset)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v11));
    Object v13 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v8),((com.google.javascript.jscomp.ScopeCreator)v13));
    Object v15 = ((com.google.javascript.jscomp.NodeTraversal)v14).getLineNumber();
    org.junit.Assert.assertEquals((Object)(0), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "prototypL";
    Object v5 = java.nio.charset.Charset.defaultCharset();
    Object v6 = new java.io.PrintStream(((java.lang.String)v4),((java.nio.charset.Charset)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v6));
    Object v8 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = "prototypL";
    Object v10 = java.nio.charset.Charset.defaultCharset();
    Object v11 = new java.io.PrintStream(((java.lang.String)v9),((java.nio.charset.Charset)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v11));
    Object v13 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v8),((com.google.javascript.jscomp.ScopeCreator)v13));
    Object v15 = 1;
    Object v16 = new com.google.javascript.rhino.Node[]{};
    Object v17 = new com.google.javascript.rhino.Node((((java.lang.Integer)v15).intValue()),((com.google.javascript.rhino.Node[])v16));
    Object v18 = 1;
    Object v19 = new com.google.javascript.rhino.Node[]{};
    Object v20 = new com.google.javascript.rhino.Node((((java.lang.Integer)v18).intValue()),((com.google.javascript.rhino.Node[])v19));
    Object v21 = 1;
    Object v22 = new com.google.javascript.rhino.Node[]{};
    Object v23 = new com.google.javascript.rhino.Node((((java.lang.Integer)v21).intValue()),((com.google.javascript.rhino.Node[])v22));
    Object v24 = "t";
    Object v25 = "0";
    Object v26 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v24),((java.lang.String)v25));
    Object v27 = "t";
    Object v28 = "0";
    Object v29 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v27),((java.lang.String)v28));
    Object v30 = 1;
    Object v31 = new com.google.javascript.rhino.Node[]{};
    Object v32 = new com.google.javascript.rhino.Node((((java.lang.Integer)v30).intValue()),((com.google.javascript.rhino.Node[])v31));
    Object v33 = java.util.List.of(((java.lang.Object)v17),((java.lang.Object)v20),((java.lang.Object)v23),((java.lang.Object)v26),((java.lang.Object)v29),((java.lang.Object)v32));
    ((com.google.javascript.jscomp.NodeTraversal)v14).traverseRoots(((java.util.List)v33));
    Object v34 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "prototypL";
    Object v5 = java.nio.charset.Charset.defaultCharset();
    Object v6 = new java.io.PrintStream(((java.lang.String)v4),((java.nio.charset.Charset)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v6));
    Object v8 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = "prototypL";
    Object v10 = java.nio.charset.Charset.defaultCharset();
    Object v11 = new java.io.PrintStream(((java.lang.String)v9),((java.nio.charset.Charset)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v11));
    Object v13 = "prototypL";
    Object v14 = java.nio.charset.Charset.defaultCharset();
    Object v15 = new java.io.PrintStream(((java.lang.String)v13),((java.nio.charset.Charset)v14));
    Object v16 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v15));
    Object v17 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v16));
    Object v18 = "prototypL";
    Object v19 = java.nio.charset.Charset.defaultCharset();
    Object v20 = new java.io.PrintStream(((java.lang.String)v18),((java.nio.charset.Charset)v19));
    Object v21 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v20));
    Object v22 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v21));
    Object v23 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v12),((com.google.javascript.jscomp.NodeTraversal.Callback)v17),((com.google.javascript.jscomp.ScopeCreator)v22));
    Object v24 = 1;
    Object v25 = new com.google.javascript.rhino.Node[]{};
    Object v26 = new com.google.javascript.rhino.Node((((java.lang.Integer)v24).intValue()),((com.google.javascript.rhino.Node[])v25));
    Object v27 = 1;
    Object v28 = new com.google.javascript.rhino.Node[]{};
    Object v29 = new com.google.javascript.rhino.Node((((java.lang.Integer)v27).intValue()),((com.google.javascript.rhino.Node[])v28));
    ((com.google.javascript.jscomp.NodeTraversal.Callback)v8).visit(((com.google.javascript.jscomp.NodeTraversal)v23),((com.google.javascript.rhino.Node)v26),((com.google.javascript.rhino.Node)v29));
    Object v30 = null;
    Object v31 = "prototypL";
    Object v32 = java.nio.charset.Charset.defaultCharset();
    Object v33 = new java.io.PrintStream(((java.lang.String)v31),((java.nio.charset.Charset)v32));
    Object v34 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v33));
    Object v35 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v34));
    Object v36 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v8),((com.google.javascript.jscomp.ScopeCreator)v35));
    Object v37 = ((com.google.javascript.jscomp.NodeTraversal)v36).inGlobalScope();
    org.junit.Assert.assertEquals((Object)(true), v37);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "prototypL";
    Object v5 = java.nio.charset.Charset.defaultCharset();
    Object v6 = new java.io.PrintStream(((java.lang.String)v4),((java.nio.charset.Charset)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v6));
    Object v8 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = "prototypL";
    Object v10 = java.nio.charset.Charset.defaultCharset();
    Object v11 = new java.io.PrintStream(((java.lang.String)v9),((java.nio.charset.Charset)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v11));
    Object v13 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v8),((com.google.javascript.jscomp.ScopeCreator)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "prototypL";
    Object v5 = java.nio.charset.Charset.defaultCharset();
    Object v6 = new java.io.PrintStream(((java.lang.String)v4),((java.nio.charset.Charset)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v6));
    Object v8 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = "prototypL";
    Object v10 = java.nio.charset.Charset.defaultCharset();
    Object v11 = new java.io.PrintStream(((java.lang.String)v9),((java.nio.charset.Charset)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v11));
    Object v13 = "prototypL";
    Object v14 = java.nio.charset.Charset.defaultCharset();
    Object v15 = new java.io.PrintStream(((java.lang.String)v13),((java.nio.charset.Charset)v14));
    Object v16 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v15));
    Object v17 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v16));
    Object v18 = "prototypL";
    Object v19 = java.nio.charset.Charset.defaultCharset();
    Object v20 = new java.io.PrintStream(((java.lang.String)v18),((java.nio.charset.Charset)v19));
    Object v21 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v20));
    Object v22 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v21));
    Object v23 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v12),((com.google.javascript.jscomp.NodeTraversal.Callback)v17),((com.google.javascript.jscomp.ScopeCreator)v22));
    Object v24 = 1;
    Object v25 = new com.google.javascript.rhino.Node[]{};
    Object v26 = new com.google.javascript.rhino.Node((((java.lang.Integer)v24).intValue()),((com.google.javascript.rhino.Node[])v25));
    Object v27 = 1;
    Object v28 = new com.google.javascript.rhino.Node[]{};
    Object v29 = new com.google.javascript.rhino.Node((((java.lang.Integer)v27).intValue()),((com.google.javascript.rhino.Node[])v28));
    ((com.google.javascript.jscomp.NodeTraversal.Callback)v8).visit(((com.google.javascript.jscomp.NodeTraversal)v23),((com.google.javascript.rhino.Node)v26),((com.google.javascript.rhino.Node)v29));
    Object v30 = null;
    Object v31 = "prototypL";
    Object v32 = java.nio.charset.Charset.defaultCharset();
    Object v33 = new java.io.PrintStream(((java.lang.String)v31),((java.nio.charset.Charset)v32));
    Object v34 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v33));
    Object v35 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v34));
    Object v36 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v8),((com.google.javascript.jscomp.ScopeCreator)v35));
    Object v37 = ((com.google.javascript.jscomp.NodeTraversal)v36).getScope();
    Object v38 = ((com.google.javascript.jscomp.NodeTraversal)v36).getLineNumber();
    org.junit.Assert.assertEquals((Object)(0), v38);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "prototypL";
    Object v5 = java.nio.charset.Charset.defaultCharset();
    Object v6 = new java.io.PrintStream(((java.lang.String)v4),((java.nio.charset.Charset)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v6));
    Object v8 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = "prototypL";
    Object v10 = java.nio.charset.Charset.defaultCharset();
    Object v11 = new java.io.PrintStream(((java.lang.String)v9),((java.nio.charset.Charset)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v11));
    Object v13 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v8),((com.google.javascript.jscomp.ScopeCreator)v13));
    Object v15 = ((com.google.javascript.jscomp.NodeTraversal)v14).getScope();
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "prototypL";
    Object v5 = java.nio.charset.Charset.defaultCharset();
    Object v6 = new java.io.PrintStream(((java.lang.String)v4),((java.nio.charset.Charset)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v6));
    Object v8 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = "prototypL";
    Object v10 = java.nio.charset.Charset.defaultCharset();
    Object v11 = new java.io.PrintStream(((java.lang.String)v9),((java.nio.charset.Charset)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v11));
    Object v13 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v8),((com.google.javascript.jscomp.ScopeCreator)v13));
    Object v15 = ((com.google.javascript.jscomp.NodeTraversal)v14).inGlobalScope();
    org.junit.Assert.assertEquals((Object)(true), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "prototypL";
    Object v5 = java.nio.charset.Charset.defaultCharset();
    Object v6 = new java.io.PrintStream(((java.lang.String)v4),((java.nio.charset.Charset)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v6));
    Object v8 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = "prototypL";
    Object v10 = java.nio.charset.Charset.defaultCharset();
    Object v11 = new java.io.PrintStream(((java.lang.String)v9),((java.nio.charset.Charset)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v11));
    Object v13 = "prototypL";
    Object v14 = java.nio.charset.Charset.defaultCharset();
    Object v15 = new java.io.PrintStream(((java.lang.String)v13),((java.nio.charset.Charset)v14));
    Object v16 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v15));
    Object v17 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v16));
    Object v18 = "prototypL";
    Object v19 = java.nio.charset.Charset.defaultCharset();
    Object v20 = new java.io.PrintStream(((java.lang.String)v18),((java.nio.charset.Charset)v19));
    Object v21 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v20));
    Object v22 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v21));
    Object v23 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v12),((com.google.javascript.jscomp.NodeTraversal.Callback)v17),((com.google.javascript.jscomp.ScopeCreator)v22));
    Object v24 = 1;
    Object v25 = new com.google.javascript.rhino.Node[]{};
    Object v26 = new com.google.javascript.rhino.Node((((java.lang.Integer)v24).intValue()),((com.google.javascript.rhino.Node[])v25));
    Object v27 = 1;
    Object v28 = new com.google.javascript.rhino.Node[]{};
    Object v29 = new com.google.javascript.rhino.Node((((java.lang.Integer)v27).intValue()),((com.google.javascript.rhino.Node[])v28));
    ((com.google.javascript.jscomp.NodeTraversal.Callback)v8).visit(((com.google.javascript.jscomp.NodeTraversal)v23),((com.google.javascript.rhino.Node)v26),((com.google.javascript.rhino.Node)v29));
    Object v30 = null;
    Object v31 = "prototypL";
    Object v32 = java.nio.charset.Charset.defaultCharset();
    Object v33 = new java.io.PrintStream(((java.lang.String)v31),((java.nio.charset.Charset)v32));
    Object v34 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v33));
    Object v35 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v34));
    Object v36 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v8),((com.google.javascript.jscomp.ScopeCreator)v35));
    Object v37 = ((com.google.javascript.jscomp.NodeTraversal)v36).getControlFlowGraph();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "prototypL";
    Object v5 = java.nio.charset.Charset.defaultCharset();
    Object v6 = new java.io.PrintStream(((java.lang.String)v4),((java.nio.charset.Charset)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v6));
    Object v8 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = "prototypL";
    Object v10 = java.nio.charset.Charset.defaultCharset();
    Object v11 = new java.io.PrintStream(((java.lang.String)v9),((java.nio.charset.Charset)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v11));
    Object v13 = "prototypL";
    Object v14 = java.nio.charset.Charset.defaultCharset();
    Object v15 = new java.io.PrintStream(((java.lang.String)v13),((java.nio.charset.Charset)v14));
    Object v16 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v15));
    Object v17 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v16));
    Object v18 = "prototypL";
    Object v19 = java.nio.charset.Charset.defaultCharset();
    Object v20 = new java.io.PrintStream(((java.lang.String)v18),((java.nio.charset.Charset)v19));
    Object v21 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v20));
    Object v22 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v21));
    Object v23 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v12),((com.google.javascript.jscomp.NodeTraversal.Callback)v17),((com.google.javascript.jscomp.ScopeCreator)v22));
    Object v24 = 1;
    Object v25 = new com.google.javascript.rhino.Node[]{};
    Object v26 = new com.google.javascript.rhino.Node((((java.lang.Integer)v24).intValue()),((com.google.javascript.rhino.Node[])v25));
    Object v27 = 1;
    Object v28 = new com.google.javascript.rhino.Node[]{};
    Object v29 = new com.google.javascript.rhino.Node((((java.lang.Integer)v27).intValue()),((com.google.javascript.rhino.Node[])v28));
    ((com.google.javascript.jscomp.NodeTraversal.Callback)v8).visit(((com.google.javascript.jscomp.NodeTraversal)v23),((com.google.javascript.rhino.Node)v26),((com.google.javascript.rhino.Node)v29));
    Object v30 = null;
    Object v31 = "prototypL";
    Object v32 = java.nio.charset.Charset.defaultCharset();
    Object v33 = new java.io.PrintStream(((java.lang.String)v31),((java.nio.charset.Charset)v32));
    Object v34 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v33));
    Object v35 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v34));
    Object v36 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v8),((com.google.javascript.jscomp.ScopeCreator)v35));
    Object v37 = ((com.google.javascript.jscomp.NodeTraversal)v36).getModule();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "prototypL";
    Object v5 = java.nio.charset.Charset.defaultCharset();
    Object v6 = new java.io.PrintStream(((java.lang.String)v4),((java.nio.charset.Charset)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v6));
    Object v8 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = "prototypL";
    Object v10 = java.nio.charset.Charset.defaultCharset();
    Object v11 = new java.io.PrintStream(((java.lang.String)v9),((java.nio.charset.Charset)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v11));
    Object v13 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v8),((com.google.javascript.jscomp.ScopeCreator)v13));
    Object v15 = 1;
    Object v16 = new com.google.javascript.rhino.Node[]{};
    Object v17 = new com.google.javascript.rhino.Node((((java.lang.Integer)v15).intValue()),((com.google.javascript.rhino.Node[])v16));
    Object v18 = "t";
    Object v19 = "0";
    Object v20 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v18),((java.lang.String)v19));
    Object v21 = new java.lang.String[]{""};
    ((com.google.javascript.jscomp.NodeTraversal)v14).report(((com.google.javascript.rhino.Node)v17),((com.google.javascript.jscomp.DiagnosticType)v20),((java.lang.String[])v21));
    Object v22 = null;
    Object v23 = 1;
    Object v24 = new com.google.javascript.rhino.Node[]{};
    Object v25 = new com.google.javascript.rhino.Node((((java.lang.Integer)v23).intValue()),((com.google.javascript.rhino.Node[])v24));
    Object v26 = ((com.google.javascript.rhino.Node)v25).isQualifiedName();
    ((com.google.javascript.jscomp.NodeTraversal)v14).traverse(((com.google.javascript.rhino.Node)v25));
    Object v27 = null;
    org.junit.Assert.assertNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    ((com.google.javascript.jscomp.AbstractCompiler)v3).reportCodeChange();
    Object v4 = null;
    Object v5 = 1;
    Object v6 = new com.google.javascript.rhino.Node[]{};
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()),((com.google.javascript.rhino.Node[])v6));
    Object v8 = 1;
    Object v9 = new com.google.javascript.rhino.Node[]{};
    Object v10 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()),((com.google.javascript.rhino.Node[])v9));
    Object v11 = 1;
    Object v12 = new com.google.javascript.rhino.Node[]{};
    Object v13 = new com.google.javascript.rhino.Node((((java.lang.Integer)v11).intValue()),((com.google.javascript.rhino.Node[])v12));
    Object v14 = "t";
    Object v15 = "0";
    Object v16 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v14),((java.lang.String)v15));
    Object v17 = "t";
    Object v18 = "0";
    Object v19 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v17),((java.lang.String)v18));
    Object v20 = 1;
    Object v21 = new com.google.javascript.rhino.Node[]{};
    Object v22 = new com.google.javascript.rhino.Node((((java.lang.Integer)v20).intValue()),((com.google.javascript.rhino.Node[])v21));
    Object v23 = java.util.List.of(((java.lang.Object)v7),((java.lang.Object)v10),((java.lang.Object)v13),((java.lang.Object)v16),((java.lang.Object)v19),((java.lang.Object)v22));
    Object v24 = ((java.util.Collection)v23).parallelStream();
    Object v25 = "prototypL";
    Object v26 = java.nio.charset.Charset.defaultCharset();
    Object v27 = new java.io.PrintStream(((java.lang.String)v25),((java.nio.charset.Charset)v26));
    Object v28 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v27));
    Object v29 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v28));
    com.google.javascript.jscomp.NodeTraversal.traverseRoots(((com.google.javascript.jscomp.AbstractCompiler)v3),((java.util.List)v23),((com.google.javascript.jscomp.NodeTraversal.Callback)v29));
    Object v30 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "prototypL";
    Object v5 = java.nio.charset.Charset.defaultCharset();
    Object v6 = new java.io.PrintStream(((java.lang.String)v4),((java.nio.charset.Charset)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v6));
    Object v8 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = "prototypL";
    Object v10 = java.nio.charset.Charset.defaultCharset();
    Object v11 = new java.io.PrintStream(((java.lang.String)v9),((java.nio.charset.Charset)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v11));
    Object v13 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v8),((com.google.javascript.jscomp.ScopeCreator)v13));
    Object v15 = ((com.google.javascript.jscomp.NodeTraversal)v14).getScope();
    Object v16 = ((com.google.javascript.jscomp.NodeTraversal)v14).getScope();
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "prototypL";
    Object v5 = java.nio.charset.Charset.defaultCharset();
    Object v6 = new java.io.PrintStream(((java.lang.String)v4),((java.nio.charset.Charset)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v6));
    Object v8 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = "prototypL";
    Object v10 = java.nio.charset.Charset.defaultCharset();
    Object v11 = new java.io.PrintStream(((java.lang.String)v9),((java.nio.charset.Charset)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v11));
    Object v13 = "prototypL";
    Object v14 = java.nio.charset.Charset.defaultCharset();
    Object v15 = new java.io.PrintStream(((java.lang.String)v13),((java.nio.charset.Charset)v14));
    Object v16 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v15));
    Object v17 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v16));
    Object v18 = "prototypL";
    Object v19 = java.nio.charset.Charset.defaultCharset();
    Object v20 = new java.io.PrintStream(((java.lang.String)v18),((java.nio.charset.Charset)v19));
    Object v21 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v20));
    Object v22 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v21));
    Object v23 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v12),((com.google.javascript.jscomp.NodeTraversal.Callback)v17),((com.google.javascript.jscomp.ScopeCreator)v22));
    Object v24 = 1;
    Object v25 = new com.google.javascript.rhino.Node[]{};
    Object v26 = new com.google.javascript.rhino.Node((((java.lang.Integer)v24).intValue()),((com.google.javascript.rhino.Node[])v25));
    Object v27 = 1;
    Object v28 = new com.google.javascript.rhino.Node[]{};
    Object v29 = new com.google.javascript.rhino.Node((((java.lang.Integer)v27).intValue()),((com.google.javascript.rhino.Node[])v28));
    ((com.google.javascript.jscomp.NodeTraversal.Callback)v8).visit(((com.google.javascript.jscomp.NodeTraversal)v23),((com.google.javascript.rhino.Node)v26),((com.google.javascript.rhino.Node)v29));
    Object v30 = null;
    Object v31 = "prototypL";
    Object v32 = java.nio.charset.Charset.defaultCharset();
    Object v33 = new java.io.PrintStream(((java.lang.String)v31),((java.nio.charset.Charset)v32));
    Object v34 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v33));
    Object v35 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v34));
    Object v36 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v8),((com.google.javascript.jscomp.ScopeCreator)v35));
    Object v37 = ((com.google.javascript.jscomp.NodeTraversal)v36).hasScope();
    Object v38 = ((com.google.javascript.jscomp.NodeTraversal)v36).getModule();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "prototypL";
    Object v5 = java.nio.charset.Charset.defaultCharset();
    Object v6 = new java.io.PrintStream(((java.lang.String)v4),((java.nio.charset.Charset)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v6));
    Object v8 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = "prototypL";
    Object v10 = java.nio.charset.Charset.defaultCharset();
    Object v11 = new java.io.PrintStream(((java.lang.String)v9),((java.nio.charset.Charset)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v11));
    Object v13 = "prototypL";
    Object v14 = java.nio.charset.Charset.defaultCharset();
    Object v15 = new java.io.PrintStream(((java.lang.String)v13),((java.nio.charset.Charset)v14));
    Object v16 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v15));
    Object v17 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v16));
    Object v18 = "prototypL";
    Object v19 = java.nio.charset.Charset.defaultCharset();
    Object v20 = new java.io.PrintStream(((java.lang.String)v18),((java.nio.charset.Charset)v19));
    Object v21 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v20));
    Object v22 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v21));
    Object v23 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v12),((com.google.javascript.jscomp.NodeTraversal.Callback)v17),((com.google.javascript.jscomp.ScopeCreator)v22));
    Object v24 = 1;
    Object v25 = new com.google.javascript.rhino.Node[]{};
    Object v26 = new com.google.javascript.rhino.Node((((java.lang.Integer)v24).intValue()),((com.google.javascript.rhino.Node[])v25));
    Object v27 = 1;
    Object v28 = new com.google.javascript.rhino.Node[]{};
    Object v29 = new com.google.javascript.rhino.Node((((java.lang.Integer)v27).intValue()),((com.google.javascript.rhino.Node[])v28));
    ((com.google.javascript.jscomp.NodeTraversal.Callback)v8).visit(((com.google.javascript.jscomp.NodeTraversal)v23),((com.google.javascript.rhino.Node)v26),((com.google.javascript.rhino.Node)v29));
    Object v30 = null;
    Object v31 = "prototypL";
    Object v32 = java.nio.charset.Charset.defaultCharset();
    Object v33 = new java.io.PrintStream(((java.lang.String)v31),((java.nio.charset.Charset)v32));
    Object v34 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v33));
    Object v35 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v34));
    Object v36 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v8),((com.google.javascript.jscomp.ScopeCreator)v35));
    Object v37 = new com.google.javascript.rhino.Node[]{null,null};
    ((com.google.javascript.jscomp.NodeTraversal)v36).traverseRoots(((com.google.javascript.rhino.Node[])v37));
    Object v38 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "prototypL";
    Object v5 = java.nio.charset.Charset.defaultCharset();
    Object v6 = new java.io.PrintStream(((java.lang.String)v4),((java.nio.charset.Charset)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v6));
    Object v8 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "prototypL";
    Object v5 = java.nio.charset.Charset.defaultCharset();
    Object v6 = new java.io.PrintStream(((java.lang.String)v4),((java.nio.charset.Charset)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v6));
    Object v8 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v8));
    Object v10 = 1;
    Object v11 = new com.google.javascript.rhino.Node[]{};
    Object v12 = new com.google.javascript.rhino.Node((((java.lang.Integer)v10).intValue()),((com.google.javascript.rhino.Node[])v11));
    Object v13 = "t";
    Object v14 = "0";
    Object v15 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = new java.lang.String[]{"",""};
    ((com.google.javascript.jscomp.NodeTraversal)v9).report(((com.google.javascript.rhino.Node)v12),((com.google.javascript.jscomp.DiagnosticType)v15),((java.lang.String[])v16));
    Object v17 = null;
    Object v18 = 1;
    Object v19 = new com.google.javascript.rhino.Node[]{};
    Object v20 = new com.google.javascript.rhino.Node((((java.lang.Integer)v18).intValue()),((com.google.javascript.rhino.Node[])v19));
    ((com.google.javascript.jscomp.NodeTraversal)v9).traverse(((com.google.javascript.rhino.Node)v20));
    Object v21 = null;
    org.junit.Assert.assertNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "prototypL";
    Object v5 = java.nio.charset.Charset.defaultCharset();
    Object v6 = new java.io.PrintStream(((java.lang.String)v4),((java.nio.charset.Charset)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v6));
    Object v8 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v8));
    Object v10 = 1;
    Object v11 = new com.google.javascript.rhino.Node[]{};
    Object v12 = new com.google.javascript.rhino.Node((((java.lang.Integer)v10).intValue()),((com.google.javascript.rhino.Node[])v11));
    Object v13 = 1;
    Object v14 = new com.google.javascript.rhino.Node[]{};
    Object v15 = new com.google.javascript.rhino.Node((((java.lang.Integer)v13).intValue()),((com.google.javascript.rhino.Node[])v14));
    Object v16 = 1;
    Object v17 = new com.google.javascript.rhino.Node[]{};
    Object v18 = new com.google.javascript.rhino.Node((((java.lang.Integer)v16).intValue()),((com.google.javascript.rhino.Node[])v17));
    Object v19 = "t";
    Object v20 = "0";
    Object v21 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v19),((java.lang.String)v20));
    Object v22 = "t";
    Object v23 = "0";
    Object v24 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v22),((java.lang.String)v23));
    Object v25 = 1;
    Object v26 = new com.google.javascript.rhino.Node[]{};
    Object v27 = new com.google.javascript.rhino.Node((((java.lang.Integer)v25).intValue()),((com.google.javascript.rhino.Node[])v26));
    Object v28 = java.util.List.of(((java.lang.Object)v12),((java.lang.Object)v15),((java.lang.Object)v18),((java.lang.Object)v21),((java.lang.Object)v24),((java.lang.Object)v27));
    Object v29 = ((java.util.List)v28).isEmpty();
    ((com.google.javascript.jscomp.NodeTraversal)v9).traverseRoots(((java.util.List)v28));
    Object v30 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = 1;
    Object v5 = new com.google.javascript.rhino.Node[]{};
    Object v6 = new com.google.javascript.rhino.Node((((java.lang.Integer)v4).intValue()),((com.google.javascript.rhino.Node[])v5));
    Object v7 = "prototypL";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = new java.io.PrintStream(((java.lang.String)v7),((java.nio.charset.Charset)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v10));
    com.google.javascript.jscomp.NodeTraversal.traverse(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.rhino.Node)v6),((com.google.javascript.jscomp.NodeTraversal.Callback)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "prototypL";
    Object v5 = java.nio.charset.Charset.defaultCharset();
    Object v6 = new java.io.PrintStream(((java.lang.String)v4),((java.nio.charset.Charset)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v6));
    Object v8 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v8));
    Object v10 = ((com.google.javascript.jscomp.NodeTraversal)v9).getControlFlowGraph();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    ((com.google.javascript.jscomp.AbstractCompiler)v3).reportCodeChange();
    Object v4 = null;
    Object v5 = 1;
    Object v6 = new com.google.javascript.rhino.Node[]{};
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()),((com.google.javascript.rhino.Node[])v6));
    Object v8 = "prototypL";
    Object v9 = java.nio.charset.Charset.defaultCharset();
    Object v10 = new java.io.PrintStream(((java.lang.String)v8),((java.nio.charset.Charset)v9));
    Object v11 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v10));
    Object v12 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v11));
    com.google.javascript.jscomp.NodeTraversal.traverse(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.NodeTraversal.Callback)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "prototypL";
    Object v5 = java.nio.charset.Charset.defaultCharset();
    Object v6 = new java.io.PrintStream(((java.lang.String)v4),((java.nio.charset.Charset)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v6));
    Object v8 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v8));
    Object v10 = ((com.google.javascript.jscomp.NodeTraversal)v9).getEnclosingFunction();
    Object v11 = ((com.google.javascript.jscomp.NodeTraversal)v9).getEnclosingFunction();
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "prototypL";
    Object v5 = java.nio.charset.Charset.defaultCharset();
    Object v6 = new java.io.PrintStream(((java.lang.String)v4),((java.nio.charset.Charset)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v6));
    Object v8 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v8));
    Object v10 = 1;
    Object v11 = new com.google.javascript.rhino.Node[]{};
    Object v12 = new com.google.javascript.rhino.Node((((java.lang.Integer)v10).intValue()),((com.google.javascript.rhino.Node[])v11));
    Object v13 = 1;
    Object v14 = new com.google.javascript.rhino.Node[]{};
    Object v15 = new com.google.javascript.rhino.Node((((java.lang.Integer)v13).intValue()),((com.google.javascript.rhino.Node[])v14));
    Object v16 = 1;
    Object v17 = new com.google.javascript.rhino.Node[]{};
    Object v18 = new com.google.javascript.rhino.Node((((java.lang.Integer)v16).intValue()),((com.google.javascript.rhino.Node[])v17));
    Object v19 = "t";
    Object v20 = "0";
    Object v21 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v19),((java.lang.String)v20));
    Object v22 = "t";
    Object v23 = "0";
    Object v24 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v22),((java.lang.String)v23));
    Object v25 = 1;
    Object v26 = new com.google.javascript.rhino.Node[]{};
    Object v27 = new com.google.javascript.rhino.Node((((java.lang.Integer)v25).intValue()),((com.google.javascript.rhino.Node[])v26));
    Object v28 = java.util.List.of(((java.lang.Object)v12),((java.lang.Object)v15),((java.lang.Object)v18),((java.lang.Object)v21),((java.lang.Object)v24),((java.lang.Object)v27));
    ((com.google.javascript.jscomp.NodeTraversal)v9).traverseRoots(((java.util.List)v28));
    Object v29 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "prototypL";
    Object v5 = java.nio.charset.Charset.defaultCharset();
    Object v6 = new java.io.PrintStream(((java.lang.String)v4),((java.nio.charset.Charset)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v6));
    Object v8 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = "prototypL";
    Object v10 = java.nio.charset.Charset.defaultCharset();
    Object v11 = new java.io.PrintStream(((java.lang.String)v9),((java.nio.charset.Charset)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v11));
    Object v13 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v8),((com.google.javascript.jscomp.ScopeCreator)v13));
    Object v15 = 1;
    Object v16 = new com.google.javascript.rhino.Node[]{};
    Object v17 = new com.google.javascript.rhino.Node((((java.lang.Integer)v15).intValue()),((com.google.javascript.rhino.Node[])v16));
    Object v18 = null;
    Object v19 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v17),((com.google.javascript.rhino.jstype.ObjectType)v18));
    ((com.google.javascript.jscomp.NodeTraversal)v14).traverseAtScope(((com.google.javascript.jscomp.Scope)v19));
    Object v20 = null;
    org.junit.Assert.assertNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "prototypL";
    Object v5 = java.nio.charset.Charset.defaultCharset();
    Object v6 = new java.io.PrintStream(((java.lang.String)v4),((java.nio.charset.Charset)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v6));
    Object v8 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = "prototypL";
    Object v10 = java.nio.charset.Charset.defaultCharset();
    Object v11 = new java.io.PrintStream(((java.lang.String)v9),((java.nio.charset.Charset)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v11));
    Object v13 = "prototypL";
    Object v14 = java.nio.charset.Charset.defaultCharset();
    Object v15 = new java.io.PrintStream(((java.lang.String)v13),((java.nio.charset.Charset)v14));
    Object v16 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v15));
    Object v17 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v16));
    Object v18 = "prototypL";
    Object v19 = java.nio.charset.Charset.defaultCharset();
    Object v20 = new java.io.PrintStream(((java.lang.String)v18),((java.nio.charset.Charset)v19));
    Object v21 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v20));
    Object v22 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v21));
    Object v23 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v12),((com.google.javascript.jscomp.NodeTraversal.Callback)v17),((com.google.javascript.jscomp.ScopeCreator)v22));
    Object v24 = 1;
    Object v25 = new com.google.javascript.rhino.Node[]{};
    Object v26 = new com.google.javascript.rhino.Node((((java.lang.Integer)v24).intValue()),((com.google.javascript.rhino.Node[])v25));
    Object v27 = 1;
    Object v28 = new com.google.javascript.rhino.Node[]{};
    Object v29 = new com.google.javascript.rhino.Node((((java.lang.Integer)v27).intValue()),((com.google.javascript.rhino.Node[])v28));
    ((com.google.javascript.jscomp.NodeTraversal.Callback)v8).visit(((com.google.javascript.jscomp.NodeTraversal)v23),((com.google.javascript.rhino.Node)v26),((com.google.javascript.rhino.Node)v29));
    Object v30 = null;
    Object v31 = "prototypL";
    Object v32 = java.nio.charset.Charset.defaultCharset();
    Object v33 = new java.io.PrintStream(((java.lang.String)v31),((java.nio.charset.Charset)v32));
    Object v34 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v33));
    Object v35 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v34));
    Object v36 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v8),((com.google.javascript.jscomp.ScopeCreator)v35));
    Object v37 = ((com.google.javascript.jscomp.NodeTraversal)v36).getCurrentNode();
    org.junit.Assert.assertNull(v37);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "prototypL";
    Object v5 = java.nio.charset.Charset.defaultCharset();
    Object v6 = new java.io.PrintStream(((java.lang.String)v4),((java.nio.charset.Charset)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v6));
    Object v8 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v8));
    Object v10 = ((com.google.javascript.jscomp.NodeTraversal)v9).getScopeRoot();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "prototypL";
    Object v5 = java.nio.charset.Charset.defaultCharset();
    Object v6 = new java.io.PrintStream(((java.lang.String)v4),((java.nio.charset.Charset)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v6));
    Object v8 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = "prototypL";
    Object v10 = java.nio.charset.Charset.defaultCharset();
    Object v11 = new java.io.PrintStream(((java.lang.String)v9),((java.nio.charset.Charset)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v11));
    Object v13 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v8),((com.google.javascript.jscomp.ScopeCreator)v13));
    Object v15 = 1;
    Object v16 = new com.google.javascript.rhino.Node[]{};
    Object v17 = new com.google.javascript.rhino.Node((((java.lang.Integer)v15).intValue()),((com.google.javascript.rhino.Node[])v16));
    ((com.google.javascript.jscomp.NodeTraversal)v14).traverse(((com.google.javascript.rhino.Node)v17));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "prototypL";
    Object v5 = java.nio.charset.Charset.defaultCharset();
    Object v6 = new java.io.PrintStream(((java.lang.String)v4),((java.nio.charset.Charset)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v6));
    Object v8 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v8));
    Object v10 = 1;
    Object v11 = new com.google.javascript.rhino.Node[]{};
    Object v12 = new com.google.javascript.rhino.Node((((java.lang.Integer)v10).intValue()),((com.google.javascript.rhino.Node[])v11));
    ((com.google.javascript.jscomp.NodeTraversal)v9).traverse(((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "prototypL";
    Object v5 = java.nio.charset.Charset.defaultCharset();
    Object v6 = new java.io.PrintStream(((java.lang.String)v4),((java.nio.charset.Charset)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v6));
    Object v8 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v8));
    Object v10 = 1;
    Object v11 = new com.google.javascript.rhino.Node[]{};
    Object v12 = new com.google.javascript.rhino.Node((((java.lang.Integer)v10).intValue()),((com.google.javascript.rhino.Node[])v11));
    Object v13 = null;
    Object v14 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.jstype.ObjectType)v13));
    ((com.google.javascript.jscomp.NodeTraversal)v9).traverseAtScope(((com.google.javascript.jscomp.Scope)v14));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "prototypL";
    Object v5 = java.nio.charset.Charset.defaultCharset();
    Object v6 = new java.io.PrintStream(((java.lang.String)v4),((java.nio.charset.Charset)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v6));
    Object v8 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = "prototypL";
    Object v10 = java.nio.charset.Charset.defaultCharset();
    Object v11 = new java.io.PrintStream(((java.lang.String)v9),((java.nio.charset.Charset)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v11));
    Object v13 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v8),((com.google.javascript.jscomp.ScopeCreator)v13));
    Object v15 = ((com.google.javascript.jscomp.NodeTraversal)v14).getInputId();
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "prototypL";
    Object v5 = java.nio.charset.Charset.defaultCharset();
    Object v6 = new java.io.PrintStream(((java.lang.String)v4),((java.nio.charset.Charset)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v6));
    Object v8 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v8));
    Object v10 = ((com.google.javascript.jscomp.NodeTraversal)v9).getLineNumber();
    org.junit.Assert.assertEquals((Object)(0), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "prototypL";
    Object v5 = java.nio.charset.Charset.defaultCharset();
    Object v6 = new java.io.PrintStream(((java.lang.String)v4),((java.nio.charset.Charset)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v6));
    Object v8 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = "prototypL";
    Object v10 = java.nio.charset.Charset.defaultCharset();
    Object v11 = new java.io.PrintStream(((java.lang.String)v9),((java.nio.charset.Charset)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v11));
    Object v13 = "prototypL";
    Object v14 = java.nio.charset.Charset.defaultCharset();
    Object v15 = new java.io.PrintStream(((java.lang.String)v13),((java.nio.charset.Charset)v14));
    Object v16 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v15));
    Object v17 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v16));
    Object v18 = "prototypL";
    Object v19 = java.nio.charset.Charset.defaultCharset();
    Object v20 = new java.io.PrintStream(((java.lang.String)v18),((java.nio.charset.Charset)v19));
    Object v21 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v20));
    Object v22 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v21));
    Object v23 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v12),((com.google.javascript.jscomp.NodeTraversal.Callback)v17),((com.google.javascript.jscomp.ScopeCreator)v22));
    Object v24 = 1;
    Object v25 = new com.google.javascript.rhino.Node[]{};
    Object v26 = new com.google.javascript.rhino.Node((((java.lang.Integer)v24).intValue()),((com.google.javascript.rhino.Node[])v25));
    Object v27 = 1;
    Object v28 = new com.google.javascript.rhino.Node[]{};
    Object v29 = new com.google.javascript.rhino.Node((((java.lang.Integer)v27).intValue()),((com.google.javascript.rhino.Node[])v28));
    ((com.google.javascript.jscomp.NodeTraversal.Callback)v8).visit(((com.google.javascript.jscomp.NodeTraversal)v23),((com.google.javascript.rhino.Node)v26),((com.google.javascript.rhino.Node)v29));
    Object v30 = null;
    Object v31 = "prototypL";
    Object v32 = java.nio.charset.Charset.defaultCharset();
    Object v33 = new java.io.PrintStream(((java.lang.String)v31),((java.nio.charset.Charset)v32));
    Object v34 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v33));
    Object v35 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v34));
    Object v36 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v8),((com.google.javascript.jscomp.ScopeCreator)v35));
    Object v37 = ((com.google.javascript.jscomp.NodeTraversal)v36).getEnclosingFunction();
    org.junit.Assert.assertNull(v37);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "prototypL";
    Object v5 = java.nio.charset.Charset.defaultCharset();
    Object v6 = new java.io.PrintStream(((java.lang.String)v4),((java.nio.charset.Charset)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v6));
    Object v8 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v8));
    Object v10 = ((com.google.javascript.jscomp.NodeTraversal)v9).getScope();
    Object v11 = ((com.google.javascript.jscomp.NodeTraversal)v9).getScopeDepth();
    org.junit.Assert.assertEquals((Object)(0), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "prototypL";
    Object v5 = java.nio.charset.Charset.defaultCharset();
    Object v6 = new java.io.PrintStream(((java.lang.String)v4),((java.nio.charset.Charset)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v6));
    Object v8 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v8));
    Object v10 = ((com.google.javascript.jscomp.NodeTraversal)v9).inGlobalScope();
    org.junit.Assert.assertEquals((Object)(true), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "prototypL";
    Object v5 = java.nio.charset.Charset.defaultCharset();
    Object v6 = new java.io.PrintStream(((java.lang.String)v4),((java.nio.charset.Charset)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v6));
    Object v8 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v8));
    Object v10 = ((com.google.javascript.jscomp.NodeTraversal)v9).hasScope();
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "prototypL";
    Object v5 = java.nio.charset.Charset.defaultCharset();
    Object v6 = new java.io.PrintStream(((java.lang.String)v4),((java.nio.charset.Charset)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v6));
    Object v8 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = "prototypL";
    Object v10 = java.nio.charset.Charset.defaultCharset();
    Object v11 = new java.io.PrintStream(((java.lang.String)v9),((java.nio.charset.Charset)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v11));
    Object v13 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v8),((com.google.javascript.jscomp.ScopeCreator)v13));
    Object v15 = 1;
    Object v16 = new com.google.javascript.rhino.Node[]{};
    Object v17 = new com.google.javascript.rhino.Node((((java.lang.Integer)v15).intValue()),((com.google.javascript.rhino.Node[])v16));
    Object v18 = "t";
    Object v19 = "0";
    Object v20 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v18),((java.lang.String)v19));
    Object v21 = new java.lang.String[]{"'"};
    Object v22 = ((com.google.javascript.jscomp.NodeTraversal)v14).makeError(((com.google.javascript.rhino.Node)v17),((com.google.javascript.jscomp.DiagnosticType)v20),((java.lang.String[])v21));
    Object v23 = ((com.google.javascript.jscomp.NodeTraversal)v14).getScopeRoot();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "prototypL";
    Object v5 = java.nio.charset.Charset.defaultCharset();
    Object v6 = new java.io.PrintStream(((java.lang.String)v4),((java.nio.charset.Charset)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v6));
    Object v8 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = "prototypL";
    Object v10 = java.nio.charset.Charset.defaultCharset();
    Object v11 = new java.io.PrintStream(((java.lang.String)v9),((java.nio.charset.Charset)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v11));
    Object v13 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v8),((com.google.javascript.jscomp.ScopeCreator)v13));
    Object v15 = ((com.google.javascript.jscomp.NodeTraversal)v14).hasScope();
    Object v16 = 1;
    Object v17 = new com.google.javascript.rhino.Node[]{};
    Object v18 = new com.google.javascript.rhino.Node((((java.lang.Integer)v16).intValue()),((com.google.javascript.rhino.Node[])v17));
    Object v19 = 1;
    Object v20 = new com.google.javascript.rhino.Node[]{};
    Object v21 = new com.google.javascript.rhino.Node((((java.lang.Integer)v19).intValue()),((com.google.javascript.rhino.Node[])v20));
    Object v22 = 1;
    Object v23 = new com.google.javascript.rhino.Node[]{};
    Object v24 = new com.google.javascript.rhino.Node((((java.lang.Integer)v22).intValue()),((com.google.javascript.rhino.Node[])v23));
    Object v25 = null;
    Object v26 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v24),((com.google.javascript.rhino.jstype.ObjectType)v25));
    ((com.google.javascript.jscomp.NodeTraversal)v14).traverseInnerNode(((com.google.javascript.rhino.Node)v18),((com.google.javascript.rhino.Node)v21),((com.google.javascript.jscomp.Scope)v26));
    Object v27 = null;
    org.junit.Assert.assertNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "prototypL";
    Object v5 = java.nio.charset.Charset.defaultCharset();
    Object v6 = new java.io.PrintStream(((java.lang.String)v4),((java.nio.charset.Charset)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v6));
    Object v8 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v8));
    Object v10 = 1;
    Object v11 = new com.google.javascript.rhino.Node[]{};
    Object v12 = new com.google.javascript.rhino.Node((((java.lang.Integer)v10).intValue()),((com.google.javascript.rhino.Node[])v11));
    Object v13 = "t";
    Object v14 = "0";
    Object v15 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = new java.lang.String[]{};
    ((com.google.javascript.jscomp.NodeTraversal)v9).report(((com.google.javascript.rhino.Node)v12),((com.google.javascript.jscomp.DiagnosticType)v15),((java.lang.String[])v16));
    Object v17 = null;
    Object v18 = ((com.google.javascript.jscomp.NodeTraversal)v9).getCompiler();
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "prototypL";
    Object v5 = java.nio.charset.Charset.defaultCharset();
    Object v6 = new java.io.PrintStream(((java.lang.String)v4),((java.nio.charset.Charset)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v6));
    Object v8 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v8));
    Object v10 = 1;
    Object v11 = new com.google.javascript.rhino.Node[]{};
    Object v12 = new com.google.javascript.rhino.Node((((java.lang.Integer)v10).intValue()),((com.google.javascript.rhino.Node[])v11));
    Object v13 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v14 = "t";
    Object v15 = "0";
    Object v16 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v14),((java.lang.String)v15));
    Object v17 = new java.lang.String[]{"~"};
    Object v18 = ((com.google.javascript.jscomp.NodeTraversal)v9).makeError(((com.google.javascript.rhino.Node)v12),((com.google.javascript.jscomp.CheckLevel)v13),((com.google.javascript.jscomp.DiagnosticType)v16),((java.lang.String[])v17));
    Object v19 = 1;
    Object v20 = new com.google.javascript.rhino.Node[]{};
    Object v21 = new com.google.javascript.rhino.Node((((java.lang.Integer)v19).intValue()),((com.google.javascript.rhino.Node[])v20));
    Object v22 = 1;
    Object v23 = new com.google.javascript.rhino.Node[]{};
    Object v24 = new com.google.javascript.rhino.Node((((java.lang.Integer)v22).intValue()),((com.google.javascript.rhino.Node[])v23));
    Object v25 = ((com.google.javascript.rhino.Node)v21).useSourceInfoFromForTree(((com.google.javascript.rhino.Node)v24));
    Object v26 = "t";
    Object v27 = "0";
    Object v28 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v26),((java.lang.String)v27));
    Object v29 = new java.lang.String[]{"","q","runCustomPasses"};
    ((com.google.javascript.jscomp.NodeTraversal)v9).report(((com.google.javascript.rhino.Node)v21),((com.google.javascript.jscomp.DiagnosticType)v28),((java.lang.String[])v29));
    Object v30 = null;
    org.junit.Assert.assertNull(v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "prototypL";
    Object v5 = java.nio.charset.Charset.defaultCharset();
    Object v6 = new java.io.PrintStream(((java.lang.String)v4),((java.nio.charset.Charset)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v6));
    Object v8 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = "prototypL";
    Object v10 = java.nio.charset.Charset.defaultCharset();
    Object v11 = new java.io.PrintStream(((java.lang.String)v9),((java.nio.charset.Charset)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v11));
    Object v13 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v8),((com.google.javascript.jscomp.ScopeCreator)v13));
    Object v15 = ((com.google.javascript.jscomp.NodeTraversal)v14).getCompiler();
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "prototypL";
    Object v5 = java.nio.charset.Charset.defaultCharset();
    Object v6 = new java.io.PrintStream(((java.lang.String)v4),((java.nio.charset.Charset)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v6));
    Object v8 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v8));
    Object v10 = 1;
    Object v11 = new com.google.javascript.rhino.Node[]{};
    Object v12 = new com.google.javascript.rhino.Node((((java.lang.Integer)v10).intValue()),((com.google.javascript.rhino.Node[])v11));
    Object v13 = "t";
    Object v14 = "0";
    Object v15 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = new java.lang.String[]{};
    ((com.google.javascript.jscomp.NodeTraversal)v9).report(((com.google.javascript.rhino.Node)v12),((com.google.javascript.jscomp.DiagnosticType)v15),((java.lang.String[])v16));
    Object v17 = null;
    Object v18 = ((com.google.javascript.jscomp.NodeTraversal)v9).getCompiler();
    Object v19 = "prototypL";
    Object v20 = java.nio.charset.Charset.defaultCharset();
    Object v21 = new java.io.PrintStream(((java.lang.String)v19),((java.nio.charset.Charset)v20));
    Object v22 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v21));
    Object v23 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v22));
    Object v24 = "prototypL";
    Object v25 = java.nio.charset.Charset.defaultCharset();
    Object v26 = new java.io.PrintStream(((java.lang.String)v24),((java.nio.charset.Charset)v25));
    Object v27 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v26));
    Object v28 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v27));
    Object v29 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v18),((com.google.javascript.jscomp.NodeTraversal.Callback)v23),((com.google.javascript.jscomp.ScopeCreator)v28));
    org.junit.Assert.assertNotNull(v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "prototypL";
    Object v5 = java.nio.charset.Charset.defaultCharset();
    Object v6 = new java.io.PrintStream(((java.lang.String)v4),((java.nio.charset.Charset)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v6));
    Object v8 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v8));
    Object v10 = 1;
    Object v11 = new com.google.javascript.rhino.Node[]{};
    Object v12 = new com.google.javascript.rhino.Node((((java.lang.Integer)v10).intValue()),((com.google.javascript.rhino.Node[])v11));
    Object v13 = "t";
    Object v14 = "0";
    Object v15 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = new java.lang.String[]{};
    ((com.google.javascript.jscomp.NodeTraversal)v9).report(((com.google.javascript.rhino.Node)v12),((com.google.javascript.jscomp.DiagnosticType)v15),((java.lang.String[])v16));
    Object v17 = null;
    Object v18 = ((com.google.javascript.jscomp.NodeTraversal)v9).getCompiler();
    Object v19 = ((com.google.javascript.jscomp.AbstractCompiler)v18).getTopScope();
    Object v20 = "prototypL";
    Object v21 = java.nio.charset.Charset.defaultCharset();
    Object v22 = new java.io.PrintStream(((java.lang.String)v20),((java.nio.charset.Charset)v21));
    Object v23 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v22));
    Object v24 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v23));
    Object v25 = "prototypL";
    Object v26 = java.nio.charset.Charset.defaultCharset();
    Object v27 = new java.io.PrintStream(((java.lang.String)v25),((java.nio.charset.Charset)v26));
    Object v28 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v27));
    Object v29 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v28));
    Object v30 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v18),((com.google.javascript.jscomp.NodeTraversal.Callback)v24),((com.google.javascript.jscomp.ScopeCreator)v29));
    org.junit.Assert.assertNotNull(v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "prototypL";
    Object v5 = java.nio.charset.Charset.defaultCharset();
    Object v6 = new java.io.PrintStream(((java.lang.String)v4),((java.nio.charset.Charset)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v6));
    Object v8 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = "prototypL";
    Object v10 = java.nio.charset.Charset.defaultCharset();
    Object v11 = new java.io.PrintStream(((java.lang.String)v9),((java.nio.charset.Charset)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v11));
    Object v13 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v8),((com.google.javascript.jscomp.ScopeCreator)v13));
    Object v15 = ((com.google.javascript.jscomp.NodeTraversal)v14).getCurrentNode();
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "prototypL";
    Object v5 = java.nio.charset.Charset.defaultCharset();
    Object v6 = new java.io.PrintStream(((java.lang.String)v4),((java.nio.charset.Charset)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v6));
    Object v8 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v8));
    Object v10 = 1;
    Object v11 = new com.google.javascript.rhino.Node[]{};
    Object v12 = new com.google.javascript.rhino.Node((((java.lang.Integer)v10).intValue()),((com.google.javascript.rhino.Node[])v11));
    Object v13 = "t";
    Object v14 = "0";
    Object v15 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = new java.lang.String[]{};
    ((com.google.javascript.jscomp.NodeTraversal)v9).report(((com.google.javascript.rhino.Node)v12),((com.google.javascript.jscomp.DiagnosticType)v15),((java.lang.String[])v16));
    Object v17 = null;
    Object v18 = ((com.google.javascript.jscomp.NodeTraversal)v9).getCompiler();
    Object v19 = "prototypL";
    Object v20 = java.nio.charset.Charset.defaultCharset();
    Object v21 = new java.io.PrintStream(((java.lang.String)v19),((java.nio.charset.Charset)v20));
    Object v22 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v21));
    Object v23 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v22));
    Object v24 = "prototypL";
    Object v25 = java.nio.charset.Charset.defaultCharset();
    Object v26 = new java.io.PrintStream(((java.lang.String)v24),((java.nio.charset.Charset)v25));
    Object v27 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v26));
    Object v28 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v27));
    Object v29 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v18),((com.google.javascript.jscomp.NodeTraversal.Callback)v23),((com.google.javascript.jscomp.ScopeCreator)v28));
    Object v30 = ((com.google.javascript.jscomp.NodeTraversal)v29).getScopeRoot();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "prototypL";
    Object v5 = java.nio.charset.Charset.defaultCharset();
    Object v6 = new java.io.PrintStream(((java.lang.String)v4),((java.nio.charset.Charset)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v6));
    Object v8 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v8));
    Object v10 = 1;
    Object v11 = new com.google.javascript.rhino.Node[]{};
    Object v12 = new com.google.javascript.rhino.Node((((java.lang.Integer)v10).intValue()),((com.google.javascript.rhino.Node[])v11));
    Object v13 = "t";
    Object v14 = "0";
    Object v15 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = new java.lang.String[]{};
    ((com.google.javascript.jscomp.NodeTraversal)v9).report(((com.google.javascript.rhino.Node)v12),((com.google.javascript.jscomp.DiagnosticType)v15),((java.lang.String[])v16));
    Object v17 = null;
    Object v18 = ((com.google.javascript.jscomp.NodeTraversal)v9).getCompiler();
    Object v19 = ((com.google.javascript.jscomp.AbstractCompiler)v18).getErrorManager();
    Object v20 = "prototypL";
    Object v21 = java.nio.charset.Charset.defaultCharset();
    Object v22 = new java.io.PrintStream(((java.lang.String)v20),((java.nio.charset.Charset)v21));
    Object v23 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v22));
    Object v24 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v23));
    Object v25 = new com.google.javascript.rhino.Node[]{null};
    com.google.javascript.jscomp.NodeTraversal.traverseRoots(((com.google.javascript.jscomp.AbstractCompiler)v18),((com.google.javascript.jscomp.NodeTraversal.Callback)v24),((com.google.javascript.rhino.Node[])v25));
    Object v26 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "prototypL";
    Object v5 = java.nio.charset.Charset.defaultCharset();
    Object v6 = new java.io.PrintStream(((java.lang.String)v4),((java.nio.charset.Charset)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v6));
    Object v8 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v8));
    Object v10 = 1;
    Object v11 = new com.google.javascript.rhino.Node[]{};
    Object v12 = new com.google.javascript.rhino.Node((((java.lang.Integer)v10).intValue()),((com.google.javascript.rhino.Node[])v11));
    Object v13 = "t";
    Object v14 = "0";
    Object v15 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = new java.lang.String[]{};
    ((com.google.javascript.jscomp.NodeTraversal)v9).report(((com.google.javascript.rhino.Node)v12),((com.google.javascript.jscomp.DiagnosticType)v15),((java.lang.String[])v16));
    Object v17 = null;
    Object v18 = ((com.google.javascript.jscomp.NodeTraversal)v9).getCompiler();
    Object v19 = "prototypL";
    Object v20 = java.nio.charset.Charset.defaultCharset();
    Object v21 = new java.io.PrintStream(((java.lang.String)v19),((java.nio.charset.Charset)v20));
    Object v22 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v21));
    Object v23 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v22));
    Object v24 = "prototypL";
    Object v25 = java.nio.charset.Charset.defaultCharset();
    Object v26 = new java.io.PrintStream(((java.lang.String)v24),((java.nio.charset.Charset)v25));
    Object v27 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v26));
    Object v28 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v27));
    Object v29 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v18),((com.google.javascript.jscomp.NodeTraversal.Callback)v23),((com.google.javascript.jscomp.ScopeCreator)v28));
    Object v30 = ((com.google.javascript.jscomp.NodeTraversal)v29).getModule();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "prototypL";
    Object v5 = java.nio.charset.Charset.defaultCharset();
    Object v6 = new java.io.PrintStream(((java.lang.String)v4),((java.nio.charset.Charset)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v6));
    Object v8 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v8));
    Object v10 = new com.google.javascript.rhino.Node[]{null,null};
    ((com.google.javascript.jscomp.NodeTraversal)v9).traverseRoots(((com.google.javascript.rhino.Node[])v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "prototypL";
    Object v5 = java.nio.charset.Charset.defaultCharset();
    Object v6 = new java.io.PrintStream(((java.lang.String)v4),((java.nio.charset.Charset)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v6));
    Object v8 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v8));
    Object v10 = 1;
    Object v11 = new com.google.javascript.rhino.Node[]{};
    Object v12 = new com.google.javascript.rhino.Node((((java.lang.Integer)v10).intValue()),((com.google.javascript.rhino.Node[])v11));
    Object v13 = 1;
    Object v14 = new com.google.javascript.rhino.Node[]{};
    Object v15 = new com.google.javascript.rhino.Node((((java.lang.Integer)v13).intValue()),((com.google.javascript.rhino.Node[])v14));
    Object v16 = null;
    Object v17 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v15),((com.google.javascript.rhino.jstype.ObjectType)v16));
    Object v18 = ((com.google.javascript.jscomp.Scope)v17).getArgumentsVar();
    ((com.google.javascript.jscomp.NodeTraversal)v9).traverseWithScope(((com.google.javascript.rhino.Node)v12),((com.google.javascript.jscomp.Scope)v17));
    Object v19 = null;
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "prototypL";
    Object v5 = java.nio.charset.Charset.defaultCharset();
    Object v6 = new java.io.PrintStream(((java.lang.String)v4),((java.nio.charset.Charset)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v6));
    Object v8 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v8));
    Object v10 = 1;
    Object v11 = new com.google.javascript.rhino.Node[]{};
    Object v12 = new com.google.javascript.rhino.Node((((java.lang.Integer)v10).intValue()),((com.google.javascript.rhino.Node[])v11));
    Object v13 = "t";
    Object v14 = "0";
    Object v15 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = new java.lang.String[]{};
    ((com.google.javascript.jscomp.NodeTraversal)v9).report(((com.google.javascript.rhino.Node)v12),((com.google.javascript.jscomp.DiagnosticType)v15),((java.lang.String[])v16));
    Object v17 = null;
    Object v18 = ((com.google.javascript.jscomp.NodeTraversal)v9).getCompiler();
    Object v19 = "prototypL";
    Object v20 = java.nio.charset.Charset.defaultCharset();
    Object v21 = new java.io.PrintStream(((java.lang.String)v19),((java.nio.charset.Charset)v20));
    Object v22 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v21));
    Object v23 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v22));
    Object v24 = "prototypL";
    Object v25 = java.nio.charset.Charset.defaultCharset();
    Object v26 = new java.io.PrintStream(((java.lang.String)v24),((java.nio.charset.Charset)v25));
    Object v27 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v26));
    Object v28 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v27));
    Object v29 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v18),((com.google.javascript.jscomp.NodeTraversal.Callback)v23),((com.google.javascript.jscomp.ScopeCreator)v28));
    Object v30 = 1;
    Object v31 = new com.google.javascript.rhino.Node[]{};
    Object v32 = new com.google.javascript.rhino.Node((((java.lang.Integer)v30).intValue()),((com.google.javascript.rhino.Node[])v31));
    Object v33 = "t";
    Object v34 = "0";
    Object v35 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v33),((java.lang.String)v34));
    Object v36 = new java.lang.String[]{};
    Object v37 = ((com.google.javascript.jscomp.NodeTraversal)v29).makeError(((com.google.javascript.rhino.Node)v32),((com.google.javascript.jscomp.DiagnosticType)v35),((java.lang.String[])v36));
    org.junit.Assert.assertNotNull(v37);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "prototypL";
    Object v5 = java.nio.charset.Charset.defaultCharset();
    Object v6 = new java.io.PrintStream(((java.lang.String)v4),((java.nio.charset.Charset)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v6));
    Object v8 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v8));
    Object v10 = 1;
    Object v11 = new com.google.javascript.rhino.Node[]{};
    Object v12 = new com.google.javascript.rhino.Node((((java.lang.Integer)v10).intValue()),((com.google.javascript.rhino.Node[])v11));
    Object v13 = "t";
    Object v14 = "0";
    Object v15 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = new java.lang.String[]{};
    ((com.google.javascript.jscomp.NodeTraversal)v9).report(((com.google.javascript.rhino.Node)v12),((com.google.javascript.jscomp.DiagnosticType)v15),((java.lang.String[])v16));
    Object v17 = null;
    Object v18 = ((com.google.javascript.jscomp.NodeTraversal)v9).getCompiler();
    Object v19 = ((com.google.javascript.jscomp.AbstractCompiler)v18).getTopScope();
    Object v20 = "prototypL";
    Object v21 = java.nio.charset.Charset.defaultCharset();
    Object v22 = new java.io.PrintStream(((java.lang.String)v20),((java.nio.charset.Charset)v21));
    Object v23 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v22));
    Object v24 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v23));
    Object v25 = "prototypL";
    Object v26 = java.nio.charset.Charset.defaultCharset();
    Object v27 = new java.io.PrintStream(((java.lang.String)v25),((java.nio.charset.Charset)v26));
    Object v28 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v27));
    Object v29 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v28));
    Object v30 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v18),((com.google.javascript.jscomp.NodeTraversal.Callback)v24),((com.google.javascript.jscomp.ScopeCreator)v29));
    Object v31 = ((com.google.javascript.jscomp.NodeTraversal)v30).getControlFlowGraph();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "prototypL";
    Object v5 = java.nio.charset.Charset.defaultCharset();
    Object v6 = new java.io.PrintStream(((java.lang.String)v4),((java.nio.charset.Charset)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v6));
    Object v8 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = "prototypL";
    Object v10 = java.nio.charset.Charset.defaultCharset();
    Object v11 = new java.io.PrintStream(((java.lang.String)v9),((java.nio.charset.Charset)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v11));
    Object v13 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v8),((com.google.javascript.jscomp.ScopeCreator)v13));
    Object v15 = ((com.google.javascript.jscomp.NodeTraversal)v14).getCompiler();
    Object v16 = "prototypL";
    Object v17 = java.nio.charset.Charset.defaultCharset();
    Object v18 = new java.io.PrintStream(((java.lang.String)v16),((java.nio.charset.Charset)v17));
    Object v19 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v18));
    Object v20 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v19));
    Object v21 = "prototypL";
    Object v22 = java.nio.charset.Charset.defaultCharset();
    Object v23 = new java.io.PrintStream(((java.lang.String)v21),((java.nio.charset.Charset)v22));
    Object v24 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v23));
    Object v25 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v24));
    Object v26 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v15),((com.google.javascript.jscomp.NodeTraversal.Callback)v20),((com.google.javascript.jscomp.ScopeCreator)v25));
    org.junit.Assert.assertNotNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "prototypL";
    Object v5 = java.nio.charset.Charset.defaultCharset();
    Object v6 = new java.io.PrintStream(((java.lang.String)v4),((java.nio.charset.Charset)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v6));
    Object v8 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v8));
    Object v10 = 1;
    Object v11 = new com.google.javascript.rhino.Node[]{};
    Object v12 = new com.google.javascript.rhino.Node((((java.lang.Integer)v10).intValue()),((com.google.javascript.rhino.Node[])v11));
    Object v13 = "t";
    Object v14 = "0";
    Object v15 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = new java.lang.String[]{};
    ((com.google.javascript.jscomp.NodeTraversal)v9).report(((com.google.javascript.rhino.Node)v12),((com.google.javascript.jscomp.DiagnosticType)v15),((java.lang.String[])v16));
    Object v17 = null;
    Object v18 = ((com.google.javascript.jscomp.NodeTraversal)v9).getCompiler();
    Object v19 = "prototypL";
    Object v20 = java.nio.charset.Charset.defaultCharset();
    Object v21 = new java.io.PrintStream(((java.lang.String)v19),((java.nio.charset.Charset)v20));
    Object v22 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v21));
    Object v23 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v22));
    Object v24 = "prototypL";
    Object v25 = java.nio.charset.Charset.defaultCharset();
    Object v26 = new java.io.PrintStream(((java.lang.String)v24),((java.nio.charset.Charset)v25));
    Object v27 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v26));
    Object v28 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v27));
    Object v29 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v18),((com.google.javascript.jscomp.NodeTraversal.Callback)v23),((com.google.javascript.jscomp.ScopeCreator)v28));
    Object v30 = ((com.google.javascript.jscomp.NodeTraversal)v29).getControlFlowGraph();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getProgress();
    Object v5 = "prototypL";
    Object v6 = java.nio.charset.Charset.defaultCharset();
    Object v7 = new java.io.PrintStream(((java.lang.String)v5),((java.nio.charset.Charset)v6));
    Object v8 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v7));
    Object v9 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v8));
    Object v10 = "prototypL";
    Object v11 = java.nio.charset.Charset.defaultCharset();
    Object v12 = new java.io.PrintStream(((java.lang.String)v10),((java.nio.charset.Charset)v11));
    Object v13 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v12));
    Object v14 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v13));
    Object v15 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v9),((com.google.javascript.jscomp.ScopeCreator)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getProgress();
    Object v5 = "prototypL";
    Object v6 = java.nio.charset.Charset.defaultCharset();
    Object v7 = new java.io.PrintStream(((java.lang.String)v5),((java.nio.charset.Charset)v6));
    Object v8 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v7));
    Object v9 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v8));
    Object v10 = "prototypL";
    Object v11 = java.nio.charset.Charset.defaultCharset();
    Object v12 = new java.io.PrintStream(((java.lang.String)v10),((java.nio.charset.Charset)v11));
    Object v13 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v12));
    Object v14 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v13));
    Object v15 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v9),((com.google.javascript.jscomp.ScopeCreator)v14));
    Object v16 = ((com.google.javascript.jscomp.NodeTraversal)v15).getScope();
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "prototypL";
    Object v5 = java.nio.charset.Charset.defaultCharset();
    Object v6 = new java.io.PrintStream(((java.lang.String)v4),((java.nio.charset.Charset)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v6));
    Object v8 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v8));
    Object v10 = 1;
    Object v11 = new com.google.javascript.rhino.Node[]{};
    Object v12 = new com.google.javascript.rhino.Node((((java.lang.Integer)v10).intValue()),((com.google.javascript.rhino.Node[])v11));
    Object v13 = "t";
    Object v14 = "0";
    Object v15 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = new java.lang.String[]{};
    ((com.google.javascript.jscomp.NodeTraversal)v9).report(((com.google.javascript.rhino.Node)v12),((com.google.javascript.jscomp.DiagnosticType)v15),((java.lang.String[])v16));
    Object v17 = null;
    Object v18 = ((com.google.javascript.jscomp.NodeTraversal)v9).getCompiler();
    Object v19 = "prototypL";
    Object v20 = java.nio.charset.Charset.defaultCharset();
    Object v21 = new java.io.PrintStream(((java.lang.String)v19),((java.nio.charset.Charset)v20));
    Object v22 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v21));
    Object v23 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v22));
    Object v24 = "prototypL";
    Object v25 = java.nio.charset.Charset.defaultCharset();
    Object v26 = new java.io.PrintStream(((java.lang.String)v24),((java.nio.charset.Charset)v25));
    Object v27 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v26));
    Object v28 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v27));
    Object v29 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v18),((com.google.javascript.jscomp.NodeTraversal.Callback)v23),((com.google.javascript.jscomp.ScopeCreator)v28));
    Object v30 = ((com.google.javascript.jscomp.NodeTraversal)v29).getScope();
    Object v31 = ((com.google.javascript.jscomp.NodeTraversal)v29).getModule();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "prototypL";
    Object v5 = java.nio.charset.Charset.defaultCharset();
    Object v6 = new java.io.PrintStream(((java.lang.String)v4),((java.nio.charset.Charset)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v6));
    Object v8 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v8));
    Object v10 = 1;
    Object v11 = new com.google.javascript.rhino.Node[]{};
    Object v12 = new com.google.javascript.rhino.Node((((java.lang.Integer)v10).intValue()),((com.google.javascript.rhino.Node[])v11));
    Object v13 = "t";
    Object v14 = "0";
    Object v15 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = new java.lang.String[]{};
    ((com.google.javascript.jscomp.NodeTraversal)v9).report(((com.google.javascript.rhino.Node)v12),((com.google.javascript.jscomp.DiagnosticType)v15),((java.lang.String[])v16));
    Object v17 = null;
    Object v18 = ((com.google.javascript.jscomp.NodeTraversal)v9).getCompiler();
    Object v19 = ((com.google.javascript.jscomp.AbstractCompiler)v18).getErrorManager();
    Object v20 = "prototypL";
    Object v21 = java.nio.charset.Charset.defaultCharset();
    Object v22 = new java.io.PrintStream(((java.lang.String)v20),((java.nio.charset.Charset)v21));
    Object v23 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v22));
    Object v24 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v23));
    Object v25 = "prototypL";
    Object v26 = java.nio.charset.Charset.defaultCharset();
    Object v27 = new java.io.PrintStream(((java.lang.String)v25),((java.nio.charset.Charset)v26));
    Object v28 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v27));
    Object v29 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v28));
    Object v30 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v18),((com.google.javascript.jscomp.NodeTraversal.Callback)v24),((com.google.javascript.jscomp.ScopeCreator)v29));
    org.junit.Assert.assertNotNull(v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "prototypL";
    Object v5 = java.nio.charset.Charset.defaultCharset();
    Object v6 = new java.io.PrintStream(((java.lang.String)v4),((java.nio.charset.Charset)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v6));
    Object v8 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v8));
    Object v10 = 1;
    Object v11 = new com.google.javascript.rhino.Node[]{};
    Object v12 = new com.google.javascript.rhino.Node((((java.lang.Integer)v10).intValue()),((com.google.javascript.rhino.Node[])v11));
    Object v13 = "t";
    Object v14 = "0";
    Object v15 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = new java.lang.String[]{};
    ((com.google.javascript.jscomp.NodeTraversal)v9).report(((com.google.javascript.rhino.Node)v12),((com.google.javascript.jscomp.DiagnosticType)v15),((java.lang.String[])v16));
    Object v17 = null;
    Object v18 = ((com.google.javascript.jscomp.NodeTraversal)v9).getCompiler();
    Object v19 = ((com.google.javascript.jscomp.AbstractCompiler)v18).getTopScope();
    Object v20 = "prototypL";
    Object v21 = java.nio.charset.Charset.defaultCharset();
    Object v22 = new java.io.PrintStream(((java.lang.String)v20),((java.nio.charset.Charset)v21));
    Object v23 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v22));
    Object v24 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v23));
    Object v25 = "prototypL";
    Object v26 = java.nio.charset.Charset.defaultCharset();
    Object v27 = new java.io.PrintStream(((java.lang.String)v25),((java.nio.charset.Charset)v26));
    Object v28 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v27));
    Object v29 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v28));
    Object v30 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v18),((com.google.javascript.jscomp.NodeTraversal.Callback)v24),((com.google.javascript.jscomp.ScopeCreator)v29));
    Object v31 = 1;
    Object v32 = new com.google.javascript.rhino.Node[]{};
    Object v33 = new com.google.javascript.rhino.Node((((java.lang.Integer)v31).intValue()),((com.google.javascript.rhino.Node[])v32));
    Object v34 = null;
    Object v35 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v33),((com.google.javascript.rhino.jstype.ObjectType)v34));
    ((com.google.javascript.jscomp.NodeTraversal)v30).traverseAtScope(((com.google.javascript.jscomp.Scope)v35));
    Object v36 = null;
    org.junit.Assert.assertNull(v36);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "prototypL";
    Object v5 = java.nio.charset.Charset.defaultCharset();
    Object v6 = new java.io.PrintStream(((java.lang.String)v4),((java.nio.charset.Charset)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v6));
    Object v8 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v8));
    Object v10 = 1;
    Object v11 = new com.google.javascript.rhino.Node[]{};
    Object v12 = new com.google.javascript.rhino.Node((((java.lang.Integer)v10).intValue()),((com.google.javascript.rhino.Node[])v11));
    Object v13 = 1;
    Object v14 = new com.google.javascript.rhino.Node[]{};
    Object v15 = new com.google.javascript.rhino.Node((((java.lang.Integer)v13).intValue()),((com.google.javascript.rhino.Node[])v14));
    Object v16 = 1;
    Object v17 = new com.google.javascript.rhino.Node[]{};
    Object v18 = new com.google.javascript.rhino.Node((((java.lang.Integer)v16).intValue()),((com.google.javascript.rhino.Node[])v17));
    Object v19 = null;
    Object v20 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v18),((com.google.javascript.rhino.jstype.ObjectType)v19));
    ((com.google.javascript.jscomp.NodeTraversal)v9).traverseInnerNode(((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v15),((com.google.javascript.jscomp.Scope)v20));
    Object v21 = null;
    org.junit.Assert.assertNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getProgress();
    Object v5 = "prototypL";
    Object v6 = java.nio.charset.Charset.defaultCharset();
    Object v7 = new java.io.PrintStream(((java.lang.String)v5),((java.nio.charset.Charset)v6));
    Object v8 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v7));
    Object v9 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v8));
    Object v10 = "prototypL";
    Object v11 = java.nio.charset.Charset.defaultCharset();
    Object v12 = new java.io.PrintStream(((java.lang.String)v10),((java.nio.charset.Charset)v11));
    Object v13 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v12));
    Object v14 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v13));
    Object v15 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v9),((com.google.javascript.jscomp.ScopeCreator)v14));
    Object v16 = ((com.google.javascript.jscomp.NodeTraversal)v15).hasScope();
    org.junit.Assert.assertEquals((Object)(false), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getProgress();
    Object v5 = "prototypL";
    Object v6 = java.nio.charset.Charset.defaultCharset();
    Object v7 = new java.io.PrintStream(((java.lang.String)v5),((java.nio.charset.Charset)v6));
    Object v8 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v7));
    Object v9 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v8));
    Object v10 = "prototypL";
    Object v11 = java.nio.charset.Charset.defaultCharset();
    Object v12 = new java.io.PrintStream(((java.lang.String)v10),((java.nio.charset.Charset)v11));
    Object v13 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v12));
    Object v14 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v13));
    Object v15 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v9),((com.google.javascript.jscomp.ScopeCreator)v14));
    Object v16 = 1;
    Object v17 = new com.google.javascript.rhino.Node[]{};
    Object v18 = new com.google.javascript.rhino.Node((((java.lang.Integer)v16).intValue()),((com.google.javascript.rhino.Node[])v17));
    Object v19 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v20 = "t";
    Object v21 = "0";
    Object v22 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v20),((java.lang.String)v21));
    Object v23 = new java.lang.String[]{};
    Object v24 = ((com.google.javascript.jscomp.NodeTraversal)v15).makeError(((com.google.javascript.rhino.Node)v18),((com.google.javascript.jscomp.CheckLevel)v19),((com.google.javascript.jscomp.DiagnosticType)v22),((java.lang.String[])v23));
    Object v25 = ((com.google.javascript.jscomp.NodeTraversal)v15).hasScope();
    org.junit.Assert.assertEquals((Object)(false), v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "prototypL";
    Object v5 = java.nio.charset.Charset.defaultCharset();
    Object v6 = new java.io.PrintStream(((java.lang.String)v4),((java.nio.charset.Charset)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v6));
    Object v8 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = "prototypL";
    Object v10 = java.nio.charset.Charset.defaultCharset();
    Object v11 = new java.io.PrintStream(((java.lang.String)v9),((java.nio.charset.Charset)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v11));
    Object v13 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v8),((com.google.javascript.jscomp.ScopeCreator)v13));
    Object v15 = ((com.google.javascript.jscomp.NodeTraversal)v14).getCompiler();
    Object v16 = "prototypL";
    Object v17 = java.nio.charset.Charset.defaultCharset();
    Object v18 = new java.io.PrintStream(((java.lang.String)v16),((java.nio.charset.Charset)v17));
    Object v19 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v18));
    Object v20 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v19));
    Object v21 = "prototypL";
    Object v22 = java.nio.charset.Charset.defaultCharset();
    Object v23 = new java.io.PrintStream(((java.lang.String)v21),((java.nio.charset.Charset)v22));
    Object v24 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v23));
    Object v25 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v24));
    Object v26 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v15),((com.google.javascript.jscomp.NodeTraversal.Callback)v20),((com.google.javascript.jscomp.ScopeCreator)v25));
    Object v27 = ((com.google.javascript.jscomp.NodeTraversal)v26).getModule();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "prototypL";
    Object v5 = java.nio.charset.Charset.defaultCharset();
    Object v6 = new java.io.PrintStream(((java.lang.String)v4),((java.nio.charset.Charset)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v6));
    Object v8 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v8));
    Object v10 = 1;
    Object v11 = new com.google.javascript.rhino.Node[]{};
    Object v12 = new com.google.javascript.rhino.Node((((java.lang.Integer)v10).intValue()),((com.google.javascript.rhino.Node[])v11));
    Object v13 = "t";
    Object v14 = "0";
    Object v15 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = new java.lang.String[]{};
    ((com.google.javascript.jscomp.NodeTraversal)v9).report(((com.google.javascript.rhino.Node)v12),((com.google.javascript.jscomp.DiagnosticType)v15),((java.lang.String[])v16));
    Object v17 = null;
    Object v18 = ((com.google.javascript.jscomp.NodeTraversal)v9).getCompiler();
    Object v19 = "prototypL";
    Object v20 = java.nio.charset.Charset.defaultCharset();
    Object v21 = new java.io.PrintStream(((java.lang.String)v19),((java.nio.charset.Charset)v20));
    Object v22 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v21));
    Object v23 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v22));
    Object v24 = "prototypL";
    Object v25 = java.nio.charset.Charset.defaultCharset();
    Object v26 = new java.io.PrintStream(((java.lang.String)v24),((java.nio.charset.Charset)v25));
    Object v27 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v26));
    Object v28 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v27));
    Object v29 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v18),((com.google.javascript.jscomp.NodeTraversal.Callback)v23),((com.google.javascript.jscomp.ScopeCreator)v28));
    Object v30 = ((com.google.javascript.jscomp.NodeTraversal)v29).inGlobalScope();
    org.junit.Assert.assertEquals((Object)(true), v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "prototypL";
    Object v5 = java.nio.charset.Charset.defaultCharset();
    Object v6 = new java.io.PrintStream(((java.lang.String)v4),((java.nio.charset.Charset)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v6));
    Object v8 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v8));
    Object v10 = 1;
    Object v11 = new com.google.javascript.rhino.Node[]{};
    Object v12 = new com.google.javascript.rhino.Node((((java.lang.Integer)v10).intValue()),((com.google.javascript.rhino.Node[])v11));
    Object v13 = "t";
    Object v14 = "0";
    Object v15 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = new java.lang.String[]{};
    ((com.google.javascript.jscomp.NodeTraversal)v9).report(((com.google.javascript.rhino.Node)v12),((com.google.javascript.jscomp.DiagnosticType)v15),((java.lang.String[])v16));
    Object v17 = null;
    Object v18 = ((com.google.javascript.jscomp.NodeTraversal)v9).getCompiler();
    Object v19 = ((com.google.javascript.jscomp.AbstractCompiler)v18).getErrorManager();
    Object v20 = "prototypL";
    Object v21 = java.nio.charset.Charset.defaultCharset();
    Object v22 = new java.io.PrintStream(((java.lang.String)v20),((java.nio.charset.Charset)v21));
    Object v23 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v22));
    Object v24 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v23));
    Object v25 = "prototypL";
    Object v26 = java.nio.charset.Charset.defaultCharset();
    Object v27 = new java.io.PrintStream(((java.lang.String)v25),((java.nio.charset.Charset)v26));
    Object v28 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v27));
    Object v29 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v28));
    Object v30 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v18),((com.google.javascript.jscomp.NodeTraversal.Callback)v24),((com.google.javascript.jscomp.ScopeCreator)v29));
    Object v31 = ((com.google.javascript.jscomp.NodeTraversal)v30).getScope();
    org.junit.Assert.assertNull(v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "prototypL";
    Object v5 = java.nio.charset.Charset.defaultCharset();
    Object v6 = new java.io.PrintStream(((java.lang.String)v4),((java.nio.charset.Charset)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v6));
    Object v8 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v8));
    Object v10 = 1;
    Object v11 = new com.google.javascript.rhino.Node[]{};
    Object v12 = new com.google.javascript.rhino.Node((((java.lang.Integer)v10).intValue()),((com.google.javascript.rhino.Node[])v11));
    Object v13 = "t";
    Object v14 = "0";
    Object v15 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = new java.lang.String[]{};
    ((com.google.javascript.jscomp.NodeTraversal)v9).report(((com.google.javascript.rhino.Node)v12),((com.google.javascript.jscomp.DiagnosticType)v15),((java.lang.String[])v16));
    Object v17 = null;
    Object v18 = ((com.google.javascript.jscomp.NodeTraversal)v9).getCompiler();
    Object v19 = ((com.google.javascript.jscomp.AbstractCompiler)v18).getErrorManager();
    Object v20 = "prototypL";
    Object v21 = java.nio.charset.Charset.defaultCharset();
    Object v22 = new java.io.PrintStream(((java.lang.String)v20),((java.nio.charset.Charset)v21));
    Object v23 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v22));
    Object v24 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v23));
    Object v25 = "prototypL";
    Object v26 = java.nio.charset.Charset.defaultCharset();
    Object v27 = new java.io.PrintStream(((java.lang.String)v25),((java.nio.charset.Charset)v26));
    Object v28 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v27));
    Object v29 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v28));
    Object v30 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v18),((com.google.javascript.jscomp.NodeTraversal.Callback)v24),((com.google.javascript.jscomp.ScopeCreator)v29));
    Object v31 = 1;
    Object v32 = new com.google.javascript.rhino.Node[]{};
    Object v33 = new com.google.javascript.rhino.Node((((java.lang.Integer)v31).intValue()),((com.google.javascript.rhino.Node[])v32));
    Object v34 = null;
    Object v35 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v33),((com.google.javascript.rhino.jstype.ObjectType)v34));
    ((com.google.javascript.jscomp.NodeTraversal)v30).traverseAtScope(((com.google.javascript.jscomp.Scope)v35));
    Object v36 = null;
    org.junit.Assert.assertNull(v36);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "prototypL";
    Object v5 = java.nio.charset.Charset.defaultCharset();
    Object v6 = new java.io.PrintStream(((java.lang.String)v4),((java.nio.charset.Charset)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v6));
    Object v8 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v8));
    Object v10 = 1;
    Object v11 = new com.google.javascript.rhino.Node[]{};
    Object v12 = new com.google.javascript.rhino.Node((((java.lang.Integer)v10).intValue()),((com.google.javascript.rhino.Node[])v11));
    Object v13 = ((com.google.javascript.rhino.Node)v12).removeFirstChild();
    Object v14 = 1;
    Object v15 = new com.google.javascript.rhino.Node[]{};
    Object v16 = new com.google.javascript.rhino.Node((((java.lang.Integer)v14).intValue()),((com.google.javascript.rhino.Node[])v15));
    Object v17 = 1;
    Object v18 = new com.google.javascript.rhino.Node[]{};
    Object v19 = new com.google.javascript.rhino.Node((((java.lang.Integer)v17).intValue()),((com.google.javascript.rhino.Node[])v18));
    Object v20 = null;
    Object v21 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v19),((com.google.javascript.rhino.jstype.ObjectType)v20));
    ((com.google.javascript.jscomp.NodeTraversal)v9).traverseInnerNode(((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v16),((com.google.javascript.jscomp.Scope)v21));
    Object v22 = null;
    org.junit.Assert.assertNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getProgress();
    Object v5 = "prototypL";
    Object v6 = java.nio.charset.Charset.defaultCharset();
    Object v7 = new java.io.PrintStream(((java.lang.String)v5),((java.nio.charset.Charset)v6));
    Object v8 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v7));
    Object v9 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v8));
    Object v10 = "prototypL";
    Object v11 = java.nio.charset.Charset.defaultCharset();
    Object v12 = new java.io.PrintStream(((java.lang.String)v10),((java.nio.charset.Charset)v11));
    Object v13 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v12));
    Object v14 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v13));
    Object v15 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v9),((com.google.javascript.jscomp.ScopeCreator)v14));
    Object v16 = 1;
    Object v17 = new com.google.javascript.rhino.Node[]{};
    Object v18 = new com.google.javascript.rhino.Node((((java.lang.Integer)v16).intValue()),((com.google.javascript.rhino.Node[])v17));
    Object v19 = 1;
    Object v20 = new com.google.javascript.rhino.Node[]{};
    Object v21 = new com.google.javascript.rhino.Node((((java.lang.Integer)v19).intValue()),((com.google.javascript.rhino.Node[])v20));
    Object v22 = 1;
    Object v23 = new com.google.javascript.rhino.Node[]{};
    Object v24 = new com.google.javascript.rhino.Node((((java.lang.Integer)v22).intValue()),((com.google.javascript.rhino.Node[])v23));
    ((com.google.javascript.rhino.Node)v18).addChildAfter(((com.google.javascript.rhino.Node)v21),((com.google.javascript.rhino.Node)v24));
    Object v25 = null;
    Object v26 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v27 = "t";
    Object v28 = "0";
    Object v29 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v27),((java.lang.String)v28));
    Object v30 = new java.lang.String[]{"","o","/"};
    Object v31 = ((com.google.javascript.jscomp.NodeTraversal)v15).makeError(((com.google.javascript.rhino.Node)v18),((com.google.javascript.jscomp.CheckLevel)v26),((com.google.javascript.jscomp.DiagnosticType)v29),((java.lang.String[])v30));
    org.junit.Assert.assertNotNull(v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getProgress();
    Object v5 = "prototypL";
    Object v6 = java.nio.charset.Charset.defaultCharset();
    Object v7 = new java.io.PrintStream(((java.lang.String)v5),((java.nio.charset.Charset)v6));
    Object v8 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v7));
    Object v9 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v8));
    Object v10 = "prototypL";
    Object v11 = java.nio.charset.Charset.defaultCharset();
    Object v12 = new java.io.PrintStream(((java.lang.String)v10),((java.nio.charset.Charset)v11));
    Object v13 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v12));
    Object v14 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v13));
    Object v15 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v9),((com.google.javascript.jscomp.ScopeCreator)v14));
    Object v16 = ((com.google.javascript.jscomp.NodeTraversal)v15).getCurrentNode();
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "prototypL";
    Object v5 = java.nio.charset.Charset.defaultCharset();
    Object v6 = new java.io.PrintStream(((java.lang.String)v4),((java.nio.charset.Charset)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v6));
    Object v8 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = "prototypL";
    Object v10 = java.nio.charset.Charset.defaultCharset();
    Object v11 = new java.io.PrintStream(((java.lang.String)v9),((java.nio.charset.Charset)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v11));
    Object v13 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v8),((com.google.javascript.jscomp.ScopeCreator)v13));
    Object v15 = ((com.google.javascript.jscomp.NodeTraversal)v14).getCompiler();
    Object v16 = "prototypL";
    Object v17 = java.nio.charset.Charset.defaultCharset();
    Object v18 = new java.io.PrintStream(((java.lang.String)v16),((java.nio.charset.Charset)v17));
    Object v19 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v18));
    Object v20 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v19));
    Object v21 = "prototypL";
    Object v22 = java.nio.charset.Charset.defaultCharset();
    Object v23 = new java.io.PrintStream(((java.lang.String)v21),((java.nio.charset.Charset)v22));
    Object v24 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v23));
    Object v25 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v24));
    Object v26 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v15),((com.google.javascript.jscomp.NodeTraversal.Callback)v20),((com.google.javascript.jscomp.ScopeCreator)v25));
    Object v27 = ((com.google.javascript.jscomp.NodeTraversal)v26).getScope();
    org.junit.Assert.assertNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "prototypL";
    Object v5 = java.nio.charset.Charset.defaultCharset();
    Object v6 = new java.io.PrintStream(((java.lang.String)v4),((java.nio.charset.Charset)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v6));
    Object v8 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v8));
    Object v10 = ((com.google.javascript.jscomp.NodeTraversal)v9).getEnclosingFunction();
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "prototypL";
    Object v5 = java.nio.charset.Charset.defaultCharset();
    Object v6 = new java.io.PrintStream(((java.lang.String)v4),((java.nio.charset.Charset)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v6));
    Object v8 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v8));
    Object v10 = 1;
    Object v11 = new com.google.javascript.rhino.Node[]{};
    Object v12 = new com.google.javascript.rhino.Node((((java.lang.Integer)v10).intValue()),((com.google.javascript.rhino.Node[])v11));
    Object v13 = "t";
    Object v14 = "0";
    Object v15 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = new java.lang.String[]{};
    ((com.google.javascript.jscomp.NodeTraversal)v9).report(((com.google.javascript.rhino.Node)v12),((com.google.javascript.jscomp.DiagnosticType)v15),((java.lang.String[])v16));
    Object v17 = null;
    Object v18 = ((com.google.javascript.jscomp.NodeTraversal)v9).getCompiler();
    Object v19 = ((com.google.javascript.jscomp.AbstractCompiler)v18).getTopScope();
    Object v20 = "prototypL";
    Object v21 = java.nio.charset.Charset.defaultCharset();
    Object v22 = new java.io.PrintStream(((java.lang.String)v20),((java.nio.charset.Charset)v21));
    Object v23 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v22));
    Object v24 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v23));
    Object v25 = "prototypL";
    Object v26 = java.nio.charset.Charset.defaultCharset();
    Object v27 = new java.io.PrintStream(((java.lang.String)v25),((java.nio.charset.Charset)v26));
    Object v28 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v27));
    Object v29 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v28));
    Object v30 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v18),((com.google.javascript.jscomp.NodeTraversal.Callback)v24),((com.google.javascript.jscomp.ScopeCreator)v29));
    Object v31 = ((com.google.javascript.jscomp.NodeTraversal)v30).getScope();
    org.junit.Assert.assertNull(v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getProgress();
    Object v5 = "prototypL";
    Object v6 = java.nio.charset.Charset.defaultCharset();
    Object v7 = new java.io.PrintStream(((java.lang.String)v5),((java.nio.charset.Charset)v6));
    Object v8 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v7));
    Object v9 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v8));
    Object v10 = "prototypL";
    Object v11 = java.nio.charset.Charset.defaultCharset();
    Object v12 = new java.io.PrintStream(((java.lang.String)v10),((java.nio.charset.Charset)v11));
    Object v13 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v12));
    Object v14 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v13));
    Object v15 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v9),((com.google.javascript.jscomp.ScopeCreator)v14));
    Object v16 = ((com.google.javascript.jscomp.NodeTraversal)v15).inGlobalScope();
    org.junit.Assert.assertEquals((Object)(true), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getProgress();
    Object v5 = "prototypL";
    Object v6 = java.nio.charset.Charset.defaultCharset();
    Object v7 = new java.io.PrintStream(((java.lang.String)v5),((java.nio.charset.Charset)v6));
    Object v8 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v7));
    Object v9 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v8));
    Object v10 = "prototypL";
    Object v11 = java.nio.charset.Charset.defaultCharset();
    Object v12 = new java.io.PrintStream(((java.lang.String)v10),((java.nio.charset.Charset)v11));
    Object v13 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v12));
    Object v14 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v13));
    Object v15 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v9),((com.google.javascript.jscomp.ScopeCreator)v14));
    Object v16 = 1;
    Object v17 = new com.google.javascript.rhino.Node[]{};
    Object v18 = new com.google.javascript.rhino.Node((((java.lang.Integer)v16).intValue()),((com.google.javascript.rhino.Node[])v17));
    Object v19 = 1;
    Object v20 = new com.google.javascript.rhino.Node[]{};
    Object v21 = new com.google.javascript.rhino.Node((((java.lang.Integer)v19).intValue()),((com.google.javascript.rhino.Node[])v20));
    Object v22 = 1;
    Object v23 = new com.google.javascript.rhino.Node[]{};
    Object v24 = new com.google.javascript.rhino.Node((((java.lang.Integer)v22).intValue()),((com.google.javascript.rhino.Node[])v23));
    Object v25 = null;
    Object v26 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v24),((com.google.javascript.rhino.jstype.ObjectType)v25));
    ((com.google.javascript.jscomp.NodeTraversal)v15).traverseInnerNode(((com.google.javascript.rhino.Node)v18),((com.google.javascript.rhino.Node)v21),((com.google.javascript.jscomp.Scope)v26));
    Object v27 = null;
    org.junit.Assert.assertNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getProgress();
    Object v5 = "prototypL";
    Object v6 = java.nio.charset.Charset.defaultCharset();
    Object v7 = new java.io.PrintStream(((java.lang.String)v5),((java.nio.charset.Charset)v6));
    Object v8 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v7));
    Object v9 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v8));
    Object v10 = "prototypL";
    Object v11 = java.nio.charset.Charset.defaultCharset();
    Object v12 = new java.io.PrintStream(((java.lang.String)v10),((java.nio.charset.Charset)v11));
    Object v13 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v12));
    Object v14 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v13));
    Object v15 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v9),((com.google.javascript.jscomp.ScopeCreator)v14));
    Object v16 = ((com.google.javascript.jscomp.NodeTraversal)v15).getScopeRoot();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "prototypL";
    Object v5 = java.nio.charset.Charset.defaultCharset();
    Object v6 = new java.io.PrintStream(((java.lang.String)v4),((java.nio.charset.Charset)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v6));
    Object v8 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = "prototypL";
    Object v10 = java.nio.charset.Charset.defaultCharset();
    Object v11 = new java.io.PrintStream(((java.lang.String)v9),((java.nio.charset.Charset)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v11));
    Object v13 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v8),((com.google.javascript.jscomp.ScopeCreator)v13));
    Object v15 = ((com.google.javascript.jscomp.NodeTraversal)v14).getCompiler();
    Object v16 = "prototypL";
    Object v17 = java.nio.charset.Charset.defaultCharset();
    Object v18 = new java.io.PrintStream(((java.lang.String)v16),((java.nio.charset.Charset)v17));
    Object v19 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v18));
    Object v20 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v19));
    Object v21 = "prototypL";
    Object v22 = java.nio.charset.Charset.defaultCharset();
    Object v23 = new java.io.PrintStream(((java.lang.String)v21),((java.nio.charset.Charset)v22));
    Object v24 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v23));
    Object v25 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v24));
    Object v26 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v15),((com.google.javascript.jscomp.NodeTraversal.Callback)v20),((com.google.javascript.jscomp.ScopeCreator)v25));
    Object v27 = ((com.google.javascript.jscomp.NodeTraversal)v26).getControlFlowGraph();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "prototypL";
    Object v5 = java.nio.charset.Charset.defaultCharset();
    Object v6 = new java.io.PrintStream(((java.lang.String)v4),((java.nio.charset.Charset)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v6));
    Object v8 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = "prototypL";
    Object v10 = java.nio.charset.Charset.defaultCharset();
    Object v11 = new java.io.PrintStream(((java.lang.String)v9),((java.nio.charset.Charset)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v11));
    Object v13 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v8),((com.google.javascript.jscomp.ScopeCreator)v13));
    Object v15 = ((com.google.javascript.jscomp.NodeTraversal)v14).getCompiler();
    Object v16 = "prototypL";
    Object v17 = java.nio.charset.Charset.defaultCharset();
    Object v18 = new java.io.PrintStream(((java.lang.String)v16),((java.nio.charset.Charset)v17));
    Object v19 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v18));
    Object v20 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v19));
    Object v21 = "prototypL";
    Object v22 = java.nio.charset.Charset.defaultCharset();
    Object v23 = new java.io.PrintStream(((java.lang.String)v21),((java.nio.charset.Charset)v22));
    Object v24 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v23));
    Object v25 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v24));
    Object v26 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v15),((com.google.javascript.jscomp.NodeTraversal.Callback)v20),((com.google.javascript.jscomp.ScopeCreator)v25));
    Object v27 = 1;
    Object v28 = new com.google.javascript.rhino.Node[]{};
    Object v29 = new com.google.javascript.rhino.Node((((java.lang.Integer)v27).intValue()),((com.google.javascript.rhino.Node[])v28));
    ((com.google.javascript.jscomp.NodeTraversal)v26).traverse(((com.google.javascript.rhino.Node)v29));
    Object v30 = null;
    Object v31 = ((com.google.javascript.jscomp.NodeTraversal)v26).getLineNumber();
    org.junit.Assert.assertEquals((Object)(0), v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getProgress();
    Object v5 = "prototypL";
    Object v6 = java.nio.charset.Charset.defaultCharset();
    Object v7 = new java.io.PrintStream(((java.lang.String)v5),((java.nio.charset.Charset)v6));
    Object v8 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v7));
    Object v9 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v8));
    Object v10 = "prototypL";
    Object v11 = java.nio.charset.Charset.defaultCharset();
    Object v12 = new java.io.PrintStream(((java.lang.String)v10),((java.nio.charset.Charset)v11));
    Object v13 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v12));
    Object v14 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v13));
    Object v15 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v9),((com.google.javascript.jscomp.ScopeCreator)v14));
    Object v16 = ((com.google.javascript.jscomp.NodeTraversal)v15).getInput();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "prototypL";
    Object v5 = java.nio.charset.Charset.defaultCharset();
    Object v6 = new java.io.PrintStream(((java.lang.String)v4),((java.nio.charset.Charset)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v6));
    Object v8 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v8));
    Object v10 = 1;
    Object v11 = new com.google.javascript.rhino.Node[]{};
    Object v12 = new com.google.javascript.rhino.Node((((java.lang.Integer)v10).intValue()),((com.google.javascript.rhino.Node[])v11));
    Object v13 = "t";
    Object v14 = "0";
    Object v15 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = new java.lang.String[]{};
    ((com.google.javascript.jscomp.NodeTraversal)v9).report(((com.google.javascript.rhino.Node)v12),((com.google.javascript.jscomp.DiagnosticType)v15),((java.lang.String[])v16));
    Object v17 = null;
    Object v18 = ((com.google.javascript.jscomp.NodeTraversal)v9).getCompiler();
    Object v19 = "prototypL";
    Object v20 = java.nio.charset.Charset.defaultCharset();
    Object v21 = new java.io.PrintStream(((java.lang.String)v19),((java.nio.charset.Charset)v20));
    Object v22 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v21));
    Object v23 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v22));
    Object v24 = "prototypL";
    Object v25 = java.nio.charset.Charset.defaultCharset();
    Object v26 = new java.io.PrintStream(((java.lang.String)v24),((java.nio.charset.Charset)v25));
    Object v27 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v26));
    Object v28 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v27));
    Object v29 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v18),((com.google.javascript.jscomp.NodeTraversal.Callback)v23),((com.google.javascript.jscomp.ScopeCreator)v28));
    Object v30 = ((com.google.javascript.jscomp.NodeTraversal)v29).getEnclosingFunction();
    org.junit.Assert.assertNull(v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "prototypL";
    Object v5 = java.nio.charset.Charset.defaultCharset();
    Object v6 = new java.io.PrintStream(((java.lang.String)v4),((java.nio.charset.Charset)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v6));
    Object v8 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v8));
    Object v10 = 1;
    Object v11 = new com.google.javascript.rhino.Node[]{};
    Object v12 = new com.google.javascript.rhino.Node((((java.lang.Integer)v10).intValue()),((com.google.javascript.rhino.Node[])v11));
    ((com.google.javascript.jscomp.NodeTraversal)v9).traverse(((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
    Object v14 = ((com.google.javascript.jscomp.NodeTraversal)v9).getLineNumber();
    org.junit.Assert.assertEquals((Object)(0), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "prototypL";
    Object v5 = java.nio.charset.Charset.defaultCharset();
    Object v6 = new java.io.PrintStream(((java.lang.String)v4),((java.nio.charset.Charset)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v6));
    Object v8 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v8));
    Object v10 = 1;
    Object v11 = new com.google.javascript.rhino.Node[]{};
    Object v12 = new com.google.javascript.rhino.Node((((java.lang.Integer)v10).intValue()),((com.google.javascript.rhino.Node[])v11));
    Object v13 = "t";
    Object v14 = "0";
    Object v15 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = new java.lang.String[]{};
    ((com.google.javascript.jscomp.NodeTraversal)v9).report(((com.google.javascript.rhino.Node)v12),((com.google.javascript.jscomp.DiagnosticType)v15),((java.lang.String[])v16));
    Object v17 = null;
    Object v18 = ((com.google.javascript.jscomp.NodeTraversal)v9).getCompiler();
    Object v19 = ((com.google.javascript.jscomp.AbstractCompiler)v18).getProgress();
    Object v20 = "prototypL";
    Object v21 = java.nio.charset.Charset.defaultCharset();
    Object v22 = new java.io.PrintStream(((java.lang.String)v20),((java.nio.charset.Charset)v21));
    Object v23 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v22));
    Object v24 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v23));
    Object v25 = "prototypL";
    Object v26 = java.nio.charset.Charset.defaultCharset();
    Object v27 = new java.io.PrintStream(((java.lang.String)v25),((java.nio.charset.Charset)v26));
    Object v28 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v27));
    Object v29 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v28));
    Object v30 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v18),((com.google.javascript.jscomp.NodeTraversal.Callback)v24),((com.google.javascript.jscomp.ScopeCreator)v29));
    org.junit.Assert.assertNotNull(v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "prototypL";
    Object v5 = java.nio.charset.Charset.defaultCharset();
    Object v6 = new java.io.PrintStream(((java.lang.String)v4),((java.nio.charset.Charset)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v6));
    Object v8 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = "prototypL";
    Object v10 = java.nio.charset.Charset.defaultCharset();
    Object v11 = new java.io.PrintStream(((java.lang.String)v9),((java.nio.charset.Charset)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v11));
    Object v13 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v8),((com.google.javascript.jscomp.ScopeCreator)v13));
    Object v15 = ((com.google.javascript.jscomp.NodeTraversal)v14).getScope();
    Object v16 = ((com.google.javascript.jscomp.NodeTraversal)v14).getScopeRoot();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "prototypL";
    Object v5 = java.nio.charset.Charset.defaultCharset();
    Object v6 = new java.io.PrintStream(((java.lang.String)v4),((java.nio.charset.Charset)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v6));
    Object v8 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v8));
    Object v10 = 1;
    Object v11 = new com.google.javascript.rhino.Node[]{};
    Object v12 = new com.google.javascript.rhino.Node((((java.lang.Integer)v10).intValue()),((com.google.javascript.rhino.Node[])v11));
    Object v13 = "t";
    Object v14 = "0";
    Object v15 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = new java.lang.String[]{};
    ((com.google.javascript.jscomp.NodeTraversal)v9).report(((com.google.javascript.rhino.Node)v12),((com.google.javascript.jscomp.DiagnosticType)v15),((java.lang.String[])v16));
    Object v17 = null;
    Object v18 = ((com.google.javascript.jscomp.NodeTraversal)v9).getCompiler();
    Object v19 = "";
    Object v20 = -25;
    Object v21 = ((com.google.javascript.jscomp.SourceExcerptProvider)v18).getSourceRegion(((java.lang.String)v19),(((java.lang.Integer)v20).intValue()));
    Object v22 = "prototypL";
    Object v23 = java.nio.charset.Charset.defaultCharset();
    Object v24 = new java.io.PrintStream(((java.lang.String)v22),((java.nio.charset.Charset)v23));
    Object v25 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v24));
    Object v26 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v25));
    Object v27 = "prototypL";
    Object v28 = java.nio.charset.Charset.defaultCharset();
    Object v29 = new java.io.PrintStream(((java.lang.String)v27),((java.nio.charset.Charset)v28));
    Object v30 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v29));
    Object v31 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v30));
    Object v32 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v18),((com.google.javascript.jscomp.NodeTraversal.Callback)v26),((com.google.javascript.jscomp.ScopeCreator)v31));
    org.junit.Assert.assertNotNull(v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "prototypL";
    Object v5 = java.nio.charset.Charset.defaultCharset();
    Object v6 = new java.io.PrintStream(((java.lang.String)v4),((java.nio.charset.Charset)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v6));
    Object v8 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v8));
    Object v10 = 1;
    Object v11 = new com.google.javascript.rhino.Node[]{};
    Object v12 = new com.google.javascript.rhino.Node((((java.lang.Integer)v10).intValue()),((com.google.javascript.rhino.Node[])v11));
    Object v13 = "t";
    Object v14 = "0";
    Object v15 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = new java.lang.String[]{};
    ((com.google.javascript.jscomp.NodeTraversal)v9).report(((com.google.javascript.rhino.Node)v12),((com.google.javascript.jscomp.DiagnosticType)v15),((java.lang.String[])v16));
    Object v17 = null;
    Object v18 = ((com.google.javascript.jscomp.NodeTraversal)v9).getCompiler();
    Object v19 = ((com.google.javascript.jscomp.AbstractCompiler)v18).getProgress();
    Object v20 = 1;
    Object v21 = new com.google.javascript.rhino.Node[]{};
    Object v22 = new com.google.javascript.rhino.Node((((java.lang.Integer)v20).intValue()),((com.google.javascript.rhino.Node[])v21));
    Object v23 = "prototypL";
    Object v24 = java.nio.charset.Charset.defaultCharset();
    Object v25 = new java.io.PrintStream(((java.lang.String)v23),((java.nio.charset.Charset)v24));
    Object v26 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v25));
    Object v27 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v26));
    com.google.javascript.jscomp.NodeTraversal.traverse(((com.google.javascript.jscomp.AbstractCompiler)v18),((com.google.javascript.rhino.Node)v22),((com.google.javascript.jscomp.NodeTraversal.Callback)v27));
    Object v28 = null;
    org.junit.Assert.assertNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "prototypL";
    Object v5 = java.nio.charset.Charset.defaultCharset();
    Object v6 = new java.io.PrintStream(((java.lang.String)v4),((java.nio.charset.Charset)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v6));
    Object v8 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v8));
    Object v10 = 1;
    Object v11 = new com.google.javascript.rhino.Node[]{};
    Object v12 = new com.google.javascript.rhino.Node((((java.lang.Integer)v10).intValue()),((com.google.javascript.rhino.Node[])v11));
    Object v13 = "t";
    Object v14 = "0";
    Object v15 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = new java.lang.String[]{};
    ((com.google.javascript.jscomp.NodeTraversal)v9).report(((com.google.javascript.rhino.Node)v12),((com.google.javascript.jscomp.DiagnosticType)v15),((java.lang.String[])v16));
    Object v17 = null;
    Object v18 = ((com.google.javascript.jscomp.NodeTraversal)v9).getCompiler();
    Object v19 = ((com.google.javascript.jscomp.AbstractCompiler)v18).getTopScope();
    Object v20 = "prototypL";
    Object v21 = java.nio.charset.Charset.defaultCharset();
    Object v22 = new java.io.PrintStream(((java.lang.String)v20),((java.nio.charset.Charset)v21));
    Object v23 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v22));
    Object v24 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v23));
    Object v25 = "prototypL";
    Object v26 = java.nio.charset.Charset.defaultCharset();
    Object v27 = new java.io.PrintStream(((java.lang.String)v25),((java.nio.charset.Charset)v26));
    Object v28 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v27));
    Object v29 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v28));
    Object v30 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v18),((com.google.javascript.jscomp.NodeTraversal.Callback)v24),((com.google.javascript.jscomp.ScopeCreator)v29));
    Object v31 = ((com.google.javascript.jscomp.NodeTraversal)v30).getEnclosingFunction();
    Object v32 = 1;
    Object v33 = new com.google.javascript.rhino.Node[]{};
    Object v34 = new com.google.javascript.rhino.Node((((java.lang.Integer)v32).intValue()),((com.google.javascript.rhino.Node[])v33));
    Object v35 = null;
    Object v36 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v34),((com.google.javascript.rhino.jstype.ObjectType)v35));
    ((com.google.javascript.jscomp.NodeTraversal)v30).traverseAtScope(((com.google.javascript.jscomp.Scope)v36));
    Object v37 = null;
    org.junit.Assert.assertNull(v37);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "prototypL";
    Object v5 = java.nio.charset.Charset.defaultCharset();
    Object v6 = new java.io.PrintStream(((java.lang.String)v4),((java.nio.charset.Charset)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v6));
    Object v8 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v8));
    Object v10 = 1;
    Object v11 = new com.google.javascript.rhino.Node[]{};
    Object v12 = new com.google.javascript.rhino.Node((((java.lang.Integer)v10).intValue()),((com.google.javascript.rhino.Node[])v11));
    Object v13 = "t";
    Object v14 = "0";
    Object v15 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = new java.lang.String[]{};
    ((com.google.javascript.jscomp.NodeTraversal)v9).report(((com.google.javascript.rhino.Node)v12),((com.google.javascript.jscomp.DiagnosticType)v15),((java.lang.String[])v16));
    Object v17 = null;
    Object v18 = ((com.google.javascript.jscomp.NodeTraversal)v9).getCompiler();
    Object v19 = "";
    Object v20 = -25;
    Object v21 = ((com.google.javascript.jscomp.SourceExcerptProvider)v18).getSourceRegion(((java.lang.String)v19),(((java.lang.Integer)v20).intValue()));
    Object v22 = "prototypL";
    Object v23 = java.nio.charset.Charset.defaultCharset();
    Object v24 = new java.io.PrintStream(((java.lang.String)v22),((java.nio.charset.Charset)v23));
    Object v25 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v24));
    Object v26 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v25));
    Object v27 = "prototypL";
    Object v28 = java.nio.charset.Charset.defaultCharset();
    Object v29 = new java.io.PrintStream(((java.lang.String)v27),((java.nio.charset.Charset)v28));
    Object v30 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v29));
    Object v31 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v30));
    Object v32 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v18),((com.google.javascript.jscomp.NodeTraversal.Callback)v26),((com.google.javascript.jscomp.ScopeCreator)v31));
    Object v33 = 1;
    Object v34 = new com.google.javascript.rhino.Node[]{};
    Object v35 = new com.google.javascript.rhino.Node((((java.lang.Integer)v33).intValue()),((com.google.javascript.rhino.Node[])v34));
    Object v36 = null;
    Object v37 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v35),((com.google.javascript.rhino.jstype.ObjectType)v36));
    ((com.google.javascript.jscomp.NodeTraversal)v32).traverseAtScope(((com.google.javascript.jscomp.Scope)v37));
    Object v38 = null;
    org.junit.Assert.assertNull(v38);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "prototypL";
    Object v5 = java.nio.charset.Charset.defaultCharset();
    Object v6 = new java.io.PrintStream(((java.lang.String)v4),((java.nio.charset.Charset)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v6));
    Object v8 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = "prototypL";
    Object v10 = java.nio.charset.Charset.defaultCharset();
    Object v11 = new java.io.PrintStream(((java.lang.String)v9),((java.nio.charset.Charset)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v11));
    Object v13 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v8),((com.google.javascript.jscomp.ScopeCreator)v13));
    Object v15 = ((com.google.javascript.jscomp.NodeTraversal)v14).getCompiler();
    Object v16 = "prototypL";
    Object v17 = java.nio.charset.Charset.defaultCharset();
    Object v18 = new java.io.PrintStream(((java.lang.String)v16),((java.nio.charset.Charset)v17));
    Object v19 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v18));
    Object v20 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v19));
    Object v21 = "prototypL";
    Object v22 = java.nio.charset.Charset.defaultCharset();
    Object v23 = new java.io.PrintStream(((java.lang.String)v21),((java.nio.charset.Charset)v22));
    Object v24 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v23));
    Object v25 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v24));
    Object v26 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v15),((com.google.javascript.jscomp.NodeTraversal.Callback)v20),((com.google.javascript.jscomp.ScopeCreator)v25));
    Object v27 = ((com.google.javascript.jscomp.NodeTraversal)v26).hasScope();
    org.junit.Assert.assertEquals((Object)(false), v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "prototypL";
    Object v5 = java.nio.charset.Charset.defaultCharset();
    Object v6 = new java.io.PrintStream(((java.lang.String)v4),((java.nio.charset.Charset)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v6));
    Object v8 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = "prototypL";
    Object v10 = java.nio.charset.Charset.defaultCharset();
    Object v11 = new java.io.PrintStream(((java.lang.String)v9),((java.nio.charset.Charset)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v11));
    Object v13 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v8),((com.google.javascript.jscomp.ScopeCreator)v13));
    Object v15 = ((com.google.javascript.jscomp.NodeTraversal)v14).getCompiler();
    Object v16 = "prototypL";
    Object v17 = java.nio.charset.Charset.defaultCharset();
    Object v18 = new java.io.PrintStream(((java.lang.String)v16),((java.nio.charset.Charset)v17));
    Object v19 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v18));
    Object v20 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v19));
    Object v21 = "prototypL";
    Object v22 = java.nio.charset.Charset.defaultCharset();
    Object v23 = new java.io.PrintStream(((java.lang.String)v21),((java.nio.charset.Charset)v22));
    Object v24 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v23));
    Object v25 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v24));
    Object v26 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v15),((com.google.javascript.jscomp.NodeTraversal.Callback)v20),((com.google.javascript.jscomp.ScopeCreator)v25));
    Object v27 = ((com.google.javascript.jscomp.NodeTraversal)v26).getEnclosingFunction();
    Object v28 = ((com.google.javascript.jscomp.NodeTraversal)v26).hasScope();
    org.junit.Assert.assertEquals((Object)(false), v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "prototypL";
    Object v5 = java.nio.charset.Charset.defaultCharset();
    Object v6 = new java.io.PrintStream(((java.lang.String)v4),((java.nio.charset.Charset)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v6));
    Object v8 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v8));
    Object v10 = 1;
    Object v11 = new com.google.javascript.rhino.Node[]{};
    Object v12 = new com.google.javascript.rhino.Node((((java.lang.Integer)v10).intValue()),((com.google.javascript.rhino.Node[])v11));
    Object v13 = "t";
    Object v14 = "0";
    Object v15 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = new java.lang.String[]{};
    ((com.google.javascript.jscomp.NodeTraversal)v9).report(((com.google.javascript.rhino.Node)v12),((com.google.javascript.jscomp.DiagnosticType)v15),((java.lang.String[])v16));
    Object v17 = null;
    Object v18 = ((com.google.javascript.jscomp.NodeTraversal)v9).getCompiler();
    Object v19 = ((com.google.javascript.jscomp.AbstractCompiler)v18).getErrorManager();
    Object v20 = "prototypL";
    Object v21 = java.nio.charset.Charset.defaultCharset();
    Object v22 = new java.io.PrintStream(((java.lang.String)v20),((java.nio.charset.Charset)v21));
    Object v23 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v22));
    Object v24 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v23));
    Object v25 = "prototypL";
    Object v26 = java.nio.charset.Charset.defaultCharset();
    Object v27 = new java.io.PrintStream(((java.lang.String)v25),((java.nio.charset.Charset)v26));
    Object v28 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v27));
    Object v29 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v28));
    Object v30 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v18),((com.google.javascript.jscomp.NodeTraversal.Callback)v24),((com.google.javascript.jscomp.ScopeCreator)v29));
    Object v31 = ((com.google.javascript.jscomp.NodeTraversal)v30).hasScope();
    org.junit.Assert.assertEquals((Object)(false), v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "prototypL";
    Object v5 = java.nio.charset.Charset.defaultCharset();
    Object v6 = new java.io.PrintStream(((java.lang.String)v4),((java.nio.charset.Charset)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v6));
    Object v8 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v8));
    Object v10 = 1;
    Object v11 = new com.google.javascript.rhino.Node[]{};
    Object v12 = new com.google.javascript.rhino.Node((((java.lang.Integer)v10).intValue()),((com.google.javascript.rhino.Node[])v11));
    Object v13 = "t";
    Object v14 = "0";
    Object v15 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = new java.lang.String[]{};
    ((com.google.javascript.jscomp.NodeTraversal)v9).report(((com.google.javascript.rhino.Node)v12),((com.google.javascript.jscomp.DiagnosticType)v15),((java.lang.String[])v16));
    Object v17 = null;
    Object v18 = ((com.google.javascript.jscomp.NodeTraversal)v9).getCompiler();
    Object v19 = "prototypL";
    Object v20 = java.nio.charset.Charset.defaultCharset();
    Object v21 = new java.io.PrintStream(((java.lang.String)v19),((java.nio.charset.Charset)v20));
    Object v22 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v21));
    Object v23 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v22));
    Object v24 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v18),((com.google.javascript.jscomp.NodeTraversal.Callback)v23));
    org.junit.Assert.assertNotNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "prototypL";
    Object v5 = java.nio.charset.Charset.defaultCharset();
    Object v6 = new java.io.PrintStream(((java.lang.String)v4),((java.nio.charset.Charset)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v6));
    Object v8 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v8));
    Object v10 = 1;
    Object v11 = new com.google.javascript.rhino.Node[]{};
    Object v12 = new com.google.javascript.rhino.Node((((java.lang.Integer)v10).intValue()),((com.google.javascript.rhino.Node[])v11));
    Object v13 = "t";
    Object v14 = "0";
    Object v15 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = new java.lang.String[]{};
    ((com.google.javascript.jscomp.NodeTraversal)v9).report(((com.google.javascript.rhino.Node)v12),((com.google.javascript.jscomp.DiagnosticType)v15),((java.lang.String[])v16));
    Object v17 = null;
    Object v18 = ((com.google.javascript.jscomp.NodeTraversal)v9).getCompiler();
    Object v19 = ((com.google.javascript.jscomp.AbstractCompiler)v18).getErrorManager();
    Object v20 = "prototypL";
    Object v21 = java.nio.charset.Charset.defaultCharset();
    Object v22 = new java.io.PrintStream(((java.lang.String)v20),((java.nio.charset.Charset)v21));
    Object v23 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v22));
    Object v24 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v23));
    Object v25 = "prototypL";
    Object v26 = java.nio.charset.Charset.defaultCharset();
    Object v27 = new java.io.PrintStream(((java.lang.String)v25),((java.nio.charset.Charset)v26));
    Object v28 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v27));
    Object v29 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v28));
    Object v30 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v18),((com.google.javascript.jscomp.NodeTraversal.Callback)v24),((com.google.javascript.jscomp.ScopeCreator)v29));
    Object v31 = ((com.google.javascript.jscomp.NodeTraversal)v30).getModule();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "prototypL";
    Object v5 = java.nio.charset.Charset.defaultCharset();
    Object v6 = new java.io.PrintStream(((java.lang.String)v4),((java.nio.charset.Charset)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v6));
    Object v8 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v8));
    Object v10 = 1;
    Object v11 = new com.google.javascript.rhino.Node[]{};
    Object v12 = new com.google.javascript.rhino.Node((((java.lang.Integer)v10).intValue()),((com.google.javascript.rhino.Node[])v11));
    Object v13 = "t";
    Object v14 = "0";
    Object v15 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = new java.lang.String[]{};
    ((com.google.javascript.jscomp.NodeTraversal)v9).report(((com.google.javascript.rhino.Node)v12),((com.google.javascript.jscomp.DiagnosticType)v15),((java.lang.String[])v16));
    Object v17 = null;
    Object v18 = ((com.google.javascript.jscomp.NodeTraversal)v9).getCompiler();
    Object v19 = ((com.google.javascript.jscomp.AbstractCompiler)v18).getTopScope();
    Object v20 = "prototypL";
    Object v21 = java.nio.charset.Charset.defaultCharset();
    Object v22 = new java.io.PrintStream(((java.lang.String)v20),((java.nio.charset.Charset)v21));
    Object v23 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v22));
    Object v24 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(((com.google.javascript.jscomp.AbstractCompiler)v23));
    Object v25 = "prototypL";
    Object v26 = java.nio.charset.Charset.defaultCharset();
    Object v27 = new java.io.PrintStream(((java.lang.String)v25),((java.nio.charset.Charset)v26));
    Object v28 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v27));
    Object v29 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v28));
    Object v30 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v18),((com.google.javascript.jscomp.NodeTraversal.Callback)v24),((com.google.javascript.jscomp.ScopeCreator)v29));
    Object v31 = 1;
    Object v32 = new com.google.javascript.rhino.Node[]{};
    Object v33 = new com.google.javascript.rhino.Node((((java.lang.Integer)v31).intValue()),((com.google.javascript.rhino.Node[])v32));
    Object v34 = "t";
    Object v35 = "0";
    Object v36 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v34),((java.lang.String)v35));
    Object v37 = new java.lang.String[]{};
    ((com.google.javascript.jscomp.NodeTraversal)v30).report(((com.google.javascript.rhino.Node)v33),((com.google.javascript.jscomp.DiagnosticType)v36),((java.lang.String[])v37));
    Object v38 = null;
    Object v39 = ((com.google.javascript.jscomp.NodeTraversal)v30).getCurrentNode();
    org.junit.Assert.assertNull(v39);
  }
}
