package com.google.javascript.jscomp;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.rhino.IR.continueNode();
    Object v2 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v1));
    Object v3 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v4 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v2),((com.google.javascript.jscomp.CheckLevel)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = com.google.javascript.rhino.IR.continueNode();
    Object v8 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v7));
    Object v9 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v10 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.PreprocessorSymbolTable)v8),((com.google.javascript.jscomp.CheckLevel)v9));
    Object v11 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.NodeTraversal.Callback)v10));
    Object v12 = com.google.javascript.rhino.IR.continueNode();
    Object v13 = ":";
    Object v14 = "";
    Object v15 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = new java.lang.String[]{};
    Object v17 = ((com.google.javascript.jscomp.NodeTraversal)v11).makeError(((com.google.javascript.rhino.Node)v12),((com.google.javascript.jscomp.DiagnosticType)v15),((java.lang.String[])v16));
    Object v18 = com.google.javascript.rhino.IR.continueNode();
    Object v19 = com.google.javascript.rhino.IR.continueNode();
    Object v20 = ((com.google.javascript.rhino.Node)v19).cloneNode();
    ((com.google.javascript.jscomp.ProcessClosurePrimitives)v4).visit(((com.google.javascript.jscomp.NodeTraversal)v11),((com.google.javascript.rhino.Node)v18),((com.google.javascript.rhino.Node)v19));
    Object v21 = null;
    org.junit.Assert.assertNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.rhino.IR.continueNode();
    Object v2 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v1));
    Object v3 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v4 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v2),((com.google.javascript.jscomp.CheckLevel)v3));
    Object v5 = com.google.javascript.rhino.IR.continueNode();
    Object v6 = com.google.javascript.rhino.IR.continueNode();
    ((com.google.javascript.jscomp.ProcessClosurePrimitives)v4).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v6));
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.Compiler();
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = com.google.javascript.rhino.IR.continueNode();
    Object v11 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v10));
    Object v12 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v13 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.PreprocessorSymbolTable)v11),((com.google.javascript.jscomp.CheckLevel)v12));
    Object v14 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v8),((com.google.javascript.jscomp.NodeTraversal.Callback)v13));
    Object v15 = com.google.javascript.rhino.IR.continueNode();
    Object v16 = com.google.javascript.rhino.IR.continueNode();
    ((com.google.javascript.jscomp.ProcessClosurePrimitives)v4).visit(((com.google.javascript.jscomp.NodeTraversal)v14),((com.google.javascript.rhino.Node)v15),((com.google.javascript.rhino.Node)v16));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.rhino.IR.continueNode();
    Object v2 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v1));
    Object v3 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v4 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v2),((com.google.javascript.jscomp.CheckLevel)v3));
    Object v5 = com.google.javascript.rhino.IR.continueNode();
    Object v6 = java.io.Reader.nullReader();
    Object v7 = com.google.javascript.jscomp.WhitelistWarningsGuard.loadWhitelistedJsWarnings(((java.io.Reader)v6));
    Object v8 = java.util.Set.copyOf(((java.util.Collection)v7));
    ((com.google.javascript.rhino.Node)v5).setDirectives(((java.util.Set)v8));
    Object v9 = null;
    Object v10 = com.google.javascript.rhino.IR.continueNode();
    ((com.google.javascript.jscomp.ProcessClosurePrimitives)v4).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.rhino.IR.continueNode();
    Object v2 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v1));
    Object v3 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v4 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v2),((com.google.javascript.jscomp.CheckLevel)v3));
    Object v5 = com.google.javascript.rhino.IR.continueNode();
    Object v6 = com.google.javascript.rhino.IR.continueNode();
    ((com.google.javascript.jscomp.ProcessClosurePrimitives)v4).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.rhino.IR.continueNode();
    Object v2 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v1));
    Object v3 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v4 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v2),((com.google.javascript.jscomp.CheckLevel)v3));
    Object v5 = com.google.javascript.rhino.IR.continueNode();
    Object v6 = com.google.javascript.rhino.IR.continueNode();
    ((com.google.javascript.jscomp.ProcessClosurePrimitives)v4).hotSwapScript(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.rhino.IR.continueNode();
    Object v2 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v1));
    Object v3 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v4 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v2),((com.google.javascript.jscomp.CheckLevel)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.rhino.IR.continueNode();
    Object v2 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v1));
    Object v3 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v4 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v2),((com.google.javascript.jscomp.CheckLevel)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = com.google.javascript.rhino.IR.continueNode();
    Object v8 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v7));
    Object v9 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v10 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.PreprocessorSymbolTable)v8),((com.google.javascript.jscomp.CheckLevel)v9));
    Object v11 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.NodeTraversal.Callback)v10));
    Object v12 = com.google.javascript.rhino.IR.continueNode();
    ((com.google.javascript.jscomp.NodeTraversal)v11).traverse(((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
    Object v14 = com.google.javascript.rhino.IR.continueNode();
    Object v15 = com.google.javascript.rhino.IR.continueNode();
    Object v16 = ((com.google.javascript.rhino.Node)v15).toString();
    ((com.google.javascript.jscomp.ProcessClosurePrimitives)v4).visit(((com.google.javascript.jscomp.NodeTraversal)v11),((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.Node)v15));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getProgress();
    Object v2 = com.google.javascript.rhino.IR.continueNode();
    Object v3 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v2));
    Object v4 = "oject";
    Object v5 = ((com.google.javascript.jscomp.PreprocessorSymbolTable)v3).getSlot(((java.lang.String)v4));
    Object v6 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v7 = ((java.lang.Enum)v6).getDeclaringClass();
    Object v8 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v3),((com.google.javascript.jscomp.CheckLevel)v6));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getProgress();
    Object v2 = com.google.javascript.rhino.IR.continueNode();
    Object v3 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v2));
    Object v4 = "oject";
    Object v5 = ((com.google.javascript.jscomp.PreprocessorSymbolTable)v3).getSlot(((java.lang.String)v4));
    Object v6 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v7 = ((java.lang.Enum)v6).getDeclaringClass();
    Object v8 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v3),((com.google.javascript.jscomp.CheckLevel)v6));
    Object v9 = com.google.javascript.rhino.IR.continueNode();
    Object v10 = com.google.javascript.rhino.IR.continueNode();
    ((com.google.javascript.jscomp.ProcessClosurePrimitives)v8).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.rhino.IR.continueNode();
    Object v2 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v1));
    Object v3 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v4 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v2),((com.google.javascript.jscomp.CheckLevel)v3));
    Object v5 = com.google.javascript.rhino.IR.continueNode();
    Object v6 = com.google.javascript.rhino.IR.continueNode();
    ((com.google.javascript.jscomp.ProcessClosurePrimitives)v4).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.rhino.IR.continueNode();
    Object v2 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v1));
    Object v3 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v4 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v2),((com.google.javascript.jscomp.CheckLevel)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = com.google.javascript.rhino.IR.continueNode();
    Object v8 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v7));
    Object v9 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v10 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.PreprocessorSymbolTable)v8),((com.google.javascript.jscomp.CheckLevel)v9));
    Object v11 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.NodeTraversal.Callback)v10));
    Object v12 = com.google.javascript.rhino.IR.continueNode();
    Object v13 = com.google.javascript.rhino.IR.continueNode();
    ((com.google.javascript.jscomp.ProcessClosurePrimitives)v4).visit(((com.google.javascript.jscomp.NodeTraversal)v11),((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.rhino.IR.continueNode();
    Object v2 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v1));
    Object v3 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v4 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v2),((com.google.javascript.jscomp.CheckLevel)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = com.google.javascript.rhino.IR.continueNode();
    Object v8 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v7));
    Object v9 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v10 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.PreprocessorSymbolTable)v8),((com.google.javascript.jscomp.CheckLevel)v9));
    Object v11 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.NodeTraversal.Callback)v10));
    Object v12 = com.google.javascript.rhino.IR.continueNode();
    Object v13 = ":";
    Object v14 = "";
    Object v15 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = new java.lang.String[]{"argumens","",""};
    Object v17 = ((com.google.javascript.jscomp.NodeTraversal)v11).makeError(((com.google.javascript.rhino.Node)v12),((com.google.javascript.jscomp.DiagnosticType)v15),((java.lang.String[])v16));
    Object v18 = com.google.javascript.rhino.IR.continueNode();
    Object v19 = com.google.javascript.rhino.IR.continueNode();
    ((com.google.javascript.jscomp.ProcessClosurePrimitives)v4).visit(((com.google.javascript.jscomp.NodeTraversal)v11),((com.google.javascript.rhino.Node)v18),((com.google.javascript.rhino.Node)v19));
    Object v20 = null;
    org.junit.Assert.assertNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.rhino.IR.continueNode();
    Object v2 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v1));
    Object v3 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v4 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v2),((com.google.javascript.jscomp.CheckLevel)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = com.google.javascript.rhino.IR.continueNode();
    Object v8 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v7));
    Object v9 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v10 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.PreprocessorSymbolTable)v8),((com.google.javascript.jscomp.CheckLevel)v9));
    Object v11 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.NodeTraversal.Callback)v10));
    Object v12 = ((com.google.javascript.jscomp.NodeTraversal)v11).getEnclosingFunction();
    Object v13 = com.google.javascript.rhino.IR.continueNode();
    Object v14 = com.google.javascript.rhino.IR.continueNode();
    ((com.google.javascript.jscomp.ProcessClosurePrimitives)v4).visit(((com.google.javascript.jscomp.NodeTraversal)v11),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v14));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.rhino.IR.continueNode();
    Object v2 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v1));
    Object v3 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v4 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v2),((com.google.javascript.jscomp.CheckLevel)v3));
    Object v5 = ((com.google.javascript.jscomp.ProcessClosurePrimitives)v4).getExportedVariableNames();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getProgress();
    Object v2 = com.google.javascript.rhino.IR.continueNode();
    Object v3 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v2));
    Object v4 = "oject";
    Object v5 = ((com.google.javascript.jscomp.PreprocessorSymbolTable)v3).getSlot(((java.lang.String)v4));
    Object v6 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v7 = ((java.lang.Enum)v6).getDeclaringClass();
    Object v8 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v3),((com.google.javascript.jscomp.CheckLevel)v6));
    Object v9 = com.google.javascript.rhino.IR.continueNode();
    Object v10 = com.google.javascript.rhino.IR.continueNode();
    Object v11 = true;
    Object v12 = false;
    Object v13 = false;
    Object v14 = ((com.google.javascript.rhino.Node)v10).toString((((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()),(((java.lang.Boolean)v13).booleanValue()));
    ((com.google.javascript.jscomp.ProcessClosurePrimitives)v8).hotSwapScript(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v10));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.rhino.IR.continueNode();
    Object v2 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v1));
    Object v3 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v4 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v2),((com.google.javascript.jscomp.CheckLevel)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = com.google.javascript.rhino.IR.continueNode();
    Object v8 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v7));
    Object v9 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v10 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.PreprocessorSymbolTable)v8),((com.google.javascript.jscomp.CheckLevel)v9));
    Object v11 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.NodeTraversal.Callback)v10));
    Object v12 = com.google.javascript.rhino.IR.continueNode();
    Object v13 = com.google.javascript.rhino.IR.continueNode();
    ((com.google.javascript.jscomp.ProcessClosurePrimitives)v4).visit(((com.google.javascript.jscomp.NodeTraversal)v11),((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
    Object v15 = new com.google.javascript.jscomp.Compiler();
    Object v16 = new com.google.javascript.jscomp.Compiler();
    Object v17 = com.google.javascript.rhino.IR.continueNode();
    Object v18 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v17));
    Object v19 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v20 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v16),((com.google.javascript.jscomp.PreprocessorSymbolTable)v18),((com.google.javascript.jscomp.CheckLevel)v19));
    Object v21 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v15),((com.google.javascript.jscomp.NodeTraversal.Callback)v20));
    Object v22 = com.google.javascript.rhino.IR.continueNode();
    Object v23 = com.google.javascript.rhino.IR.continueNode();
    ((com.google.javascript.jscomp.ProcessClosurePrimitives)v4).visit(((com.google.javascript.jscomp.NodeTraversal)v21),((com.google.javascript.rhino.Node)v22),((com.google.javascript.rhino.Node)v23));
    Object v24 = null;
    org.junit.Assert.assertNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.rhino.IR.continueNode();
    Object v2 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v1));
    Object v3 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v4 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v2),((com.google.javascript.jscomp.CheckLevel)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = com.google.javascript.rhino.IR.continueNode();
    Object v8 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v7));
    Object v9 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v10 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.PreprocessorSymbolTable)v8),((com.google.javascript.jscomp.CheckLevel)v9));
    Object v11 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.NodeTraversal.Callback)v10));
    Object v12 = com.google.javascript.rhino.IR.continueNode();
    Object v13 = com.google.javascript.rhino.IR.continueNode();
    Object v14 = ((com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback)v4).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v11),((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v13));
    org.junit.Assert.assertEquals((Object)(true), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getProgress();
    Object v2 = com.google.javascript.rhino.IR.continueNode();
    Object v3 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v2));
    Object v4 = "oject";
    Object v5 = ((com.google.javascript.jscomp.PreprocessorSymbolTable)v3).getSlot(((java.lang.String)v4));
    Object v6 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v7 = ((java.lang.Enum)v6).getDeclaringClass();
    Object v8 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v3),((com.google.javascript.jscomp.CheckLevel)v6));
    Object v9 = com.google.javascript.rhino.IR.continueNode();
    Object v10 = com.google.javascript.rhino.IR.continueNode();
    ((com.google.javascript.jscomp.ProcessClosurePrimitives)v8).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.Compiler();
    Object v14 = com.google.javascript.rhino.IR.continueNode();
    Object v15 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v14));
    Object v16 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v17 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v13),((com.google.javascript.jscomp.PreprocessorSymbolTable)v15),((com.google.javascript.jscomp.CheckLevel)v16));
    Object v18 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v12),((com.google.javascript.jscomp.NodeTraversal.Callback)v17));
    Object v19 = com.google.javascript.rhino.IR.continueNode();
    Object v20 = com.google.javascript.rhino.IR.continueNode();
    ((com.google.javascript.jscomp.ProcessClosurePrimitives)v8).visit(((com.google.javascript.jscomp.NodeTraversal)v18),((com.google.javascript.rhino.Node)v19),((com.google.javascript.rhino.Node)v20));
    Object v21 = null;
    org.junit.Assert.assertNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.rhino.IR.continueNode();
    Object v2 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v1));
    Object v3 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v4 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v2),((com.google.javascript.jscomp.CheckLevel)v3));
    Object v5 = com.google.javascript.rhino.IR.continueNode();
    Object v6 = ((com.google.javascript.rhino.Node)v5).isFromExterns();
    Object v7 = com.google.javascript.rhino.IR.continueNode();
    ((com.google.javascript.jscomp.ProcessClosurePrimitives)v4).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.rhino.IR.continueNode();
    Object v2 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v1));
    Object v3 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v4 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v2),((com.google.javascript.jscomp.CheckLevel)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = com.google.javascript.rhino.IR.continueNode();
    Object v8 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v7));
    Object v9 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v10 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.PreprocessorSymbolTable)v8),((com.google.javascript.jscomp.CheckLevel)v9));
    Object v11 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.NodeTraversal.Callback)v10));
    Object v12 = com.google.javascript.rhino.IR.continueNode();
    Object v13 = com.google.javascript.rhino.IR.continueNode();
    Object v14 = 0;
    Object v15 = true;
    ((com.google.javascript.rhino.Node)v13).putBooleanProp((((java.lang.Integer)v14).intValue()),(((java.lang.Boolean)v15).booleanValue()));
    Object v16 = null;
    ((com.google.javascript.jscomp.ProcessClosurePrimitives)v4).visit(((com.google.javascript.jscomp.NodeTraversal)v11),((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v13));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.rhino.IR.continueNode();
    Object v2 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v1));
    Object v3 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v4 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v2),((com.google.javascript.jscomp.CheckLevel)v3));
    Object v5 = com.google.javascript.rhino.IR.continueNode();
    Object v6 = com.google.javascript.rhino.IR.continueNode();
    ((com.google.javascript.jscomp.ProcessClosurePrimitives)v4).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v6));
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.Compiler();
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = com.google.javascript.rhino.IR.continueNode();
    Object v11 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v10));
    Object v12 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v13 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.PreprocessorSymbolTable)v11),((com.google.javascript.jscomp.CheckLevel)v12));
    Object v14 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v8),((com.google.javascript.jscomp.NodeTraversal.Callback)v13));
    Object v15 = com.google.javascript.rhino.IR.continueNode();
    Object v16 = ((com.google.javascript.rhino.Node)v15).isUnscopedQualifiedName();
    Object v17 = com.google.javascript.rhino.IR.continueNode();
    ((com.google.javascript.jscomp.ProcessClosurePrimitives)v4).visit(((com.google.javascript.jscomp.NodeTraversal)v14),((com.google.javascript.rhino.Node)v15),((com.google.javascript.rhino.Node)v17));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.rhino.IR.continueNode();
    Object v2 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v1));
    Object v3 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v4 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v2),((com.google.javascript.jscomp.CheckLevel)v3));
    Object v5 = com.google.javascript.rhino.IR.continueNode();
    Object v6 = com.google.javascript.rhino.IR.continueNode();
    Object v7 = com.google.javascript.rhino.IR.continueNode();
    Object v8 = ((com.google.javascript.rhino.Node)v6).isEquivalentToTyped(((com.google.javascript.rhino.Node)v7));
    ((com.google.javascript.jscomp.ProcessClosurePrimitives)v4).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v6));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getProgress();
    Object v2 = com.google.javascript.rhino.IR.continueNode();
    Object v3 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v2));
    Object v4 = "oject";
    Object v5 = ((com.google.javascript.jscomp.PreprocessorSymbolTable)v3).getSlot(((java.lang.String)v4));
    Object v6 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v7 = ((java.lang.Enum)v6).getDeclaringClass();
    Object v8 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v3),((com.google.javascript.jscomp.CheckLevel)v6));
    Object v9 = com.google.javascript.rhino.IR.continueNode();
    Object v10 = com.google.javascript.rhino.IR.continueNode();
    ((com.google.javascript.jscomp.ProcessClosurePrimitives)v8).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
    Object v12 = ((com.google.javascript.jscomp.ProcessClosurePrimitives)v8).getExportedVariableNames();
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.rhino.IR.continueNode();
    Object v2 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v1));
    Object v3 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v4 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v2),((com.google.javascript.jscomp.CheckLevel)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = com.google.javascript.rhino.IR.continueNode();
    Object v8 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v7));
    Object v9 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v10 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.PreprocessorSymbolTable)v8),((com.google.javascript.jscomp.CheckLevel)v9));
    Object v11 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.NodeTraversal.Callback)v10));
    Object v12 = com.google.javascript.rhino.IR.continueNode();
    Object v13 = ((com.google.javascript.rhino.Node)v12).toString();
    Object v14 = com.google.javascript.rhino.IR.continueNode();
    ((com.google.javascript.jscomp.ProcessClosurePrimitives)v4).visit(((com.google.javascript.jscomp.NodeTraversal)v11),((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v14));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.rhino.IR.continueNode();
    Object v2 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v1));
    Object v3 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v4 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v2),((com.google.javascript.jscomp.CheckLevel)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = com.google.javascript.rhino.IR.continueNode();
    Object v8 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v7));
    Object v9 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v10 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.PreprocessorSymbolTable)v8),((com.google.javascript.jscomp.CheckLevel)v9));
    Object v11 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.NodeTraversal.Callback)v10));
    Object v12 = com.google.javascript.rhino.IR.continueNode();
    Object v13 = com.google.javascript.rhino.IR.continueNode();
    ((com.google.javascript.jscomp.ProcessClosurePrimitives)v4).visit(((com.google.javascript.jscomp.NodeTraversal)v11),((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.rhino.IR.continueNode();
    Object v2 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v1));
    Object v3 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v4 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v2),((com.google.javascript.jscomp.CheckLevel)v3));
    Object v5 = com.google.javascript.rhino.IR.continueNode();
    Object v6 = com.google.javascript.rhino.IR.continueNode();
    ((com.google.javascript.jscomp.ProcessClosurePrimitives)v4).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v6));
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.Compiler();
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = com.google.javascript.rhino.IR.continueNode();
    Object v11 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v10));
    Object v12 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v13 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.PreprocessorSymbolTable)v11),((com.google.javascript.jscomp.CheckLevel)v12));
    Object v14 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v8),((com.google.javascript.jscomp.NodeTraversal.Callback)v13));
    Object v15 = com.google.javascript.rhino.IR.continueNode();
    Object v16 = com.google.javascript.rhino.IR.continueNode();
    Object v17 = com.google.javascript.rhino.IR.continueNode();
    Object v18 = ((com.google.javascript.rhino.Node)v16).isEquivalentToShallow(((com.google.javascript.rhino.Node)v17));
    ((com.google.javascript.jscomp.ProcessClosurePrimitives)v4).visit(((com.google.javascript.jscomp.NodeTraversal)v14),((com.google.javascript.rhino.Node)v15),((com.google.javascript.rhino.Node)v16));
    Object v19 = null;
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.rhino.IR.continueNode();
    Object v2 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v1));
    Object v3 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v4 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v2),((com.google.javascript.jscomp.CheckLevel)v3));
    Object v5 = ((com.google.javascript.jscomp.ProcessClosurePrimitives)v4).getExportedVariableNames();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.rhino.IR.continueNode();
    Object v2 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v1));
    Object v3 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v4 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v2),((com.google.javascript.jscomp.CheckLevel)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = com.google.javascript.rhino.IR.continueNode();
    Object v8 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v7));
    Object v9 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v10 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.PreprocessorSymbolTable)v8),((com.google.javascript.jscomp.CheckLevel)v9));
    Object v11 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.NodeTraversal.Callback)v10));
    Object v12 = com.google.javascript.rhino.IR.continueNode();
    Object v13 = com.google.javascript.rhino.IR.continueNode();
    ((com.google.javascript.jscomp.ProcessClosurePrimitives)v4).visit(((com.google.javascript.jscomp.NodeTraversal)v11),((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
    Object v15 = com.google.javascript.rhino.IR.continueNode();
    Object v16 = com.google.javascript.rhino.IR.continueNode();
    ((com.google.javascript.jscomp.ProcessClosurePrimitives)v4).process(((com.google.javascript.rhino.Node)v15),((com.google.javascript.rhino.Node)v16));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.rhino.IR.continueNode();
    Object v2 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v1));
    Object v3 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v4 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v2),((com.google.javascript.jscomp.CheckLevel)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = com.google.javascript.rhino.IR.continueNode();
    Object v8 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v7));
    Object v9 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v10 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.PreprocessorSymbolTable)v8),((com.google.javascript.jscomp.CheckLevel)v9));
    Object v11 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.NodeTraversal.Callback)v10));
    Object v12 = com.google.javascript.rhino.IR.continueNode();
    Object v13 = com.google.javascript.rhino.IR.continueNode();
    ((com.google.javascript.jscomp.ProcessClosurePrimitives)v4).visit(((com.google.javascript.jscomp.NodeTraversal)v11),((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
    Object v15 = new com.google.javascript.jscomp.Compiler();
    Object v16 = new com.google.javascript.jscomp.Compiler();
    Object v17 = com.google.javascript.rhino.IR.continueNode();
    Object v18 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v17));
    Object v19 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v20 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v16),((com.google.javascript.jscomp.PreprocessorSymbolTable)v18),((com.google.javascript.jscomp.CheckLevel)v19));
    Object v21 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v15),((com.google.javascript.jscomp.NodeTraversal.Callback)v20));
    Object v22 = com.google.javascript.rhino.IR.continueNode();
    Object v23 = com.google.javascript.rhino.IR.continueNode();
    ((com.google.javascript.jscomp.ProcessClosurePrimitives)v4).visit(((com.google.javascript.jscomp.NodeTraversal)v21),((com.google.javascript.rhino.Node)v22),((com.google.javascript.rhino.Node)v23));
    Object v24 = null;
    org.junit.Assert.assertNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.rhino.IR.continueNode();
    Object v2 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v1));
    Object v3 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v4 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v2),((com.google.javascript.jscomp.CheckLevel)v3));
    Object v5 = com.google.javascript.rhino.IR.continueNode();
    Object v6 = com.google.javascript.rhino.IR.continueNode();
    Object v7 = ((com.google.javascript.rhino.Node)v6).removeFirstChild();
    ((com.google.javascript.jscomp.ProcessClosurePrimitives)v4).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v6));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.rhino.IR.continueNode();
    Object v2 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v1));
    Object v3 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v4 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v2),((com.google.javascript.jscomp.CheckLevel)v3));
    Object v5 = com.google.javascript.rhino.IR.continueNode();
    Object v6 = com.google.javascript.rhino.IR.continueNode();
    Object v7 = ((com.google.javascript.rhino.Node)v6).isOptionalArg();
    ((com.google.javascript.jscomp.ProcessClosurePrimitives)v4).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v6));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.rhino.IR.continueNode();
    Object v2 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v1));
    Object v3 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v4 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v2),((com.google.javascript.jscomp.CheckLevel)v3));
    Object v5 = com.google.javascript.rhino.IR.continueNode();
    Object v6 = com.google.javascript.rhino.IR.continueNode();
    Object v7 = false;
    ((com.google.javascript.rhino.Node)v6).setWasEmptyNode((((java.lang.Boolean)v7).booleanValue()));
    Object v8 = null;
    ((com.google.javascript.jscomp.ProcessClosurePrimitives)v4).hotSwapScript(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v6));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.rhino.IR.continueNode();
    Object v2 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v1));
    Object v3 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v4 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v2),((com.google.javascript.jscomp.CheckLevel)v3));
    Object v5 = com.google.javascript.rhino.IR.continueNode();
    Object v6 = new com.google.javascript.rhino.JSDocInfo();
    Object v7 = ((com.google.javascript.rhino.Node)v5).setJSDocInfo(((com.google.javascript.rhino.JSDocInfo)v6));
    Object v8 = com.google.javascript.rhino.IR.continueNode();
    Object v9 = com.google.javascript.rhino.IR.continueNode();
    ((com.google.javascript.rhino.Node)v8).addChildToBack(((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
    ((com.google.javascript.jscomp.ProcessClosurePrimitives)v4).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v8));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getProgress();
    Object v2 = com.google.javascript.rhino.IR.continueNode();
    Object v3 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v2));
    Object v4 = "oject";
    Object v5 = ((com.google.javascript.jscomp.PreprocessorSymbolTable)v3).getSlot(((java.lang.String)v4));
    Object v6 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v7 = ((java.lang.Enum)v6).getDeclaringClass();
    Object v8 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v3),((com.google.javascript.jscomp.CheckLevel)v6));
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = new com.google.javascript.jscomp.Compiler();
    Object v11 = com.google.javascript.rhino.IR.continueNode();
    Object v12 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v11));
    Object v13 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v14 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.PreprocessorSymbolTable)v12),((com.google.javascript.jscomp.CheckLevel)v13));
    Object v15 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.NodeTraversal.Callback)v14));
    Object v16 = com.google.javascript.rhino.IR.continueNode();
    Object v17 = com.google.javascript.rhino.IR.continueNode();
    ((com.google.javascript.jscomp.ProcessClosurePrimitives)v8).visit(((com.google.javascript.jscomp.NodeTraversal)v15),((com.google.javascript.rhino.Node)v16),((com.google.javascript.rhino.Node)v17));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getProgress();
    Object v2 = com.google.javascript.rhino.IR.continueNode();
    Object v3 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v2));
    Object v4 = "oject";
    Object v5 = ((com.google.javascript.jscomp.PreprocessorSymbolTable)v3).getSlot(((java.lang.String)v4));
    Object v6 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v7 = ((java.lang.Enum)v6).getDeclaringClass();
    Object v8 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v3),((com.google.javascript.jscomp.CheckLevel)v6));
    Object v9 = com.google.javascript.rhino.IR.continueNode();
    Object v10 = com.google.javascript.rhino.IR.continueNode();
    ((com.google.javascript.jscomp.ProcessClosurePrimitives)v8).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
    Object v12 = com.google.javascript.rhino.IR.continueNode();
    Object v13 = com.google.javascript.rhino.IR.continueNode();
    ((com.google.javascript.jscomp.ProcessClosurePrimitives)v8).process(((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.rhino.IR.continueNode();
    Object v2 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v1));
    Object v3 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v4 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v2),((com.google.javascript.jscomp.CheckLevel)v3));
    Object v5 = com.google.javascript.rhino.IR.continueNode();
    Object v6 = com.google.javascript.rhino.IR.continueNode();
    Object v7 = 71;
    Object v8 = ((com.google.javascript.rhino.Node)v6).getBooleanProp((((java.lang.Integer)v7).intValue()));
    ((com.google.javascript.jscomp.ProcessClosurePrimitives)v4).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v6));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.rhino.IR.continueNode();
    Object v2 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v1));
    Object v3 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v4 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v2),((com.google.javascript.jscomp.CheckLevel)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = com.google.javascript.rhino.IR.continueNode();
    Object v8 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v7));
    Object v9 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v10 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.PreprocessorSymbolTable)v8),((com.google.javascript.jscomp.CheckLevel)v9));
    Object v11 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.NodeTraversal.Callback)v10));
    Object v12 = com.google.javascript.rhino.IR.continueNode();
    Object v13 = com.google.javascript.rhino.IR.continueNode();
    Object v14 = ((com.google.javascript.rhino.Node)v13).removeFirstChild();
    ((com.google.javascript.jscomp.ProcessClosurePrimitives)v4).visit(((com.google.javascript.jscomp.NodeTraversal)v11),((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v13));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getProgress();
    Object v2 = com.google.javascript.rhino.IR.continueNode();
    Object v3 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v2));
    Object v4 = "oject";
    Object v5 = ((com.google.javascript.jscomp.PreprocessorSymbolTable)v3).getSlot(((java.lang.String)v4));
    Object v6 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v7 = ((java.lang.Enum)v6).getDeclaringClass();
    Object v8 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v3),((com.google.javascript.jscomp.CheckLevel)v6));
    Object v9 = com.google.javascript.rhino.IR.continueNode();
    Object v10 = com.google.javascript.rhino.IR.continueNode();
    ((com.google.javascript.jscomp.ProcessClosurePrimitives)v8).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.Compiler();
    Object v14 = com.google.javascript.rhino.IR.continueNode();
    Object v15 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v14));
    Object v16 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v17 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v13),((com.google.javascript.jscomp.PreprocessorSymbolTable)v15),((com.google.javascript.jscomp.CheckLevel)v16));
    Object v18 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v12),((com.google.javascript.jscomp.NodeTraversal.Callback)v17));
    Object v19 = com.google.javascript.rhino.IR.continueNode();
    Object v20 = -39;
    ((com.google.javascript.rhino.Node)v19).setType((((java.lang.Integer)v20).intValue()));
    Object v21 = null;
    Object v22 = com.google.javascript.rhino.IR.continueNode();
    ((com.google.javascript.jscomp.ProcessClosurePrimitives)v8).visit(((com.google.javascript.jscomp.NodeTraversal)v18),((com.google.javascript.rhino.Node)v19),((com.google.javascript.rhino.Node)v22));
    Object v23 = null;
    org.junit.Assert.assertNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.rhino.IR.continueNode();
    Object v2 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v1));
    Object v3 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v4 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v2),((com.google.javascript.jscomp.CheckLevel)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = com.google.javascript.rhino.IR.continueNode();
    Object v8 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v7));
    Object v9 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v10 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.PreprocessorSymbolTable)v8),((com.google.javascript.jscomp.CheckLevel)v9));
    Object v11 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.NodeTraversal.Callback)v10));
    Object v12 = com.google.javascript.rhino.IR.continueNode();
    Object v13 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v14 = ":";
    Object v15 = "";
    Object v16 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v14),((java.lang.String)v15));
    Object v17 = new java.lang.String[]{"'","L","  "};
    Object v18 = ((com.google.javascript.jscomp.NodeTraversal)v11).makeError(((com.google.javascript.rhino.Node)v12),((com.google.javascript.jscomp.CheckLevel)v13),((com.google.javascript.jscomp.DiagnosticType)v16),((java.lang.String[])v17));
    Object v19 = com.google.javascript.rhino.IR.continueNode();
    Object v20 = com.google.javascript.rhino.IR.continueNode();
    Object v21 = 9;
    Object v22 = ((com.google.javascript.rhino.Node)v20).getIntProp((((java.lang.Integer)v21).intValue()));
    ((com.google.javascript.jscomp.ProcessClosurePrimitives)v4).visit(((com.google.javascript.jscomp.NodeTraversal)v11),((com.google.javascript.rhino.Node)v19),((com.google.javascript.rhino.Node)v20));
    Object v23 = null;
    org.junit.Assert.assertNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.rhino.IR.continueNode();
    Object v2 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v1));
    Object v3 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v4 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v2),((com.google.javascript.jscomp.CheckLevel)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = com.google.javascript.rhino.IR.continueNode();
    Object v8 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v7));
    Object v9 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v10 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.PreprocessorSymbolTable)v8),((com.google.javascript.jscomp.CheckLevel)v9));
    Object v11 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.NodeTraversal.Callback)v10));
    Object v12 = com.google.javascript.rhino.IR.continueNode();
    Object v13 = com.google.javascript.rhino.IR.continueNode();
    Object v14 = ((com.google.javascript.rhino.Node)v13).getJsDocBuilderForNode();
    ((com.google.javascript.jscomp.ProcessClosurePrimitives)v4).visit(((com.google.javascript.jscomp.NodeTraversal)v11),((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v13));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.rhino.IR.continueNode();
    Object v2 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v1));
    Object v3 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v4 = ((java.lang.Enum)v3).getDeclaringClass();
    Object v5 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v2),((com.google.javascript.jscomp.CheckLevel)v3));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.rhino.IR.continueNode();
    Object v2 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v1));
    Object v3 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v4 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v2),((com.google.javascript.jscomp.CheckLevel)v3));
    Object v5 = com.google.javascript.rhino.IR.continueNode();
    Object v6 = com.google.javascript.rhino.IR.continueNode();
    Object v7 = 1;
    ((com.google.javascript.rhino.Node)v6).setSourceEncodedPosition((((java.lang.Integer)v7).intValue()));
    Object v8 = null;
    ((com.google.javascript.jscomp.ProcessClosurePrimitives)v4).hotSwapScript(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v6));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.rhino.IR.continueNode();
    Object v2 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v1));
    Object v3 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v4 = ((java.lang.Enum)v3).getDeclaringClass();
    Object v5 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v2),((com.google.javascript.jscomp.CheckLevel)v3));
    Object v6 = com.google.javascript.rhino.IR.continueNode();
    Object v7 = ((com.google.javascript.rhino.Node)v6).isOnlyModifiesThisCall();
    Object v8 = com.google.javascript.rhino.IR.continueNode();
    ((com.google.javascript.jscomp.ProcessClosurePrimitives)v5).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.rhino.IR.continueNode();
    Object v2 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v1));
    Object v3 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v4 = ((java.lang.Enum)v3).getDeclaringClass();
    Object v5 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v2),((com.google.javascript.jscomp.CheckLevel)v3));
    Object v6 = com.google.javascript.rhino.IR.continueNode();
    Object v7 = com.google.javascript.rhino.IR.continueNode();
    Object v8 = ((com.google.javascript.rhino.Node)v7).children();
    ((com.google.javascript.jscomp.ProcessClosurePrimitives)v5).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v7));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.rhino.IR.continueNode();
    Object v2 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v1));
    Object v3 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v4 = ((java.lang.Enum)v3).getDeclaringClass();
    Object v5 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v2),((com.google.javascript.jscomp.CheckLevel)v3));
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = com.google.javascript.rhino.IR.continueNode();
    Object v9 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v8));
    Object v10 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v11 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v7),((com.google.javascript.jscomp.PreprocessorSymbolTable)v9),((com.google.javascript.jscomp.CheckLevel)v10));
    Object v12 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.NodeTraversal.Callback)v11));
    Object v13 = com.google.javascript.rhino.IR.continueNode();
    Object v14 = com.google.javascript.rhino.IR.continueNode();
    Object v15 = ((com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback)v5).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v12),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v14));
    org.junit.Assert.assertEquals((Object)(true), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.rhino.IR.continueNode();
    Object v2 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v1));
    Object v3 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v4 = ((java.lang.Enum)v3).getDeclaringClass();
    Object v5 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v2),((com.google.javascript.jscomp.CheckLevel)v3));
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = com.google.javascript.rhino.IR.continueNode();
    Object v9 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v8));
    Object v10 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v11 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v7),((com.google.javascript.jscomp.PreprocessorSymbolTable)v9),((com.google.javascript.jscomp.CheckLevel)v10));
    Object v12 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.NodeTraversal.Callback)v11));
    Object v13 = com.google.javascript.rhino.IR.continueNode();
    Object v14 = com.google.javascript.rhino.IR.continueNode();
    ((com.google.javascript.jscomp.ProcessClosurePrimitives)v5).visit(((com.google.javascript.jscomp.NodeTraversal)v12),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v14));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.Compiler();
    Object v17 = new com.google.javascript.jscomp.Compiler();
    Object v18 = com.google.javascript.rhino.IR.continueNode();
    Object v19 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v18));
    Object v20 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v21 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v17),((com.google.javascript.jscomp.PreprocessorSymbolTable)v19),((com.google.javascript.jscomp.CheckLevel)v20));
    Object v22 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v16),((com.google.javascript.jscomp.NodeTraversal.Callback)v21));
    Object v23 = com.google.javascript.rhino.IR.continueNode();
    Object v24 = com.google.javascript.rhino.IR.continueNode();
    ((com.google.javascript.jscomp.ProcessClosurePrimitives)v5).visit(((com.google.javascript.jscomp.NodeTraversal)v22),((com.google.javascript.rhino.Node)v23),((com.google.javascript.rhino.Node)v24));
    Object v25 = null;
    org.junit.Assert.assertNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.rhino.IR.continueNode();
    Object v2 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v1));
    Object v3 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v4 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v2),((com.google.javascript.jscomp.CheckLevel)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = com.google.javascript.rhino.IR.continueNode();
    Object v8 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v7));
    Object v9 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v10 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.PreprocessorSymbolTable)v8),((com.google.javascript.jscomp.CheckLevel)v9));
    Object v11 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.NodeTraversal.Callback)v10));
    Object v12 = com.google.javascript.rhino.IR.continueNode();
    Object v13 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v14 = ":";
    Object v15 = "";
    Object v16 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v14),((java.lang.String)v15));
    Object v17 = new java.lang.String[]{""};
    Object v18 = ((com.google.javascript.jscomp.NodeTraversal)v11).makeError(((com.google.javascript.rhino.Node)v12),((com.google.javascript.jscomp.CheckLevel)v13),((com.google.javascript.jscomp.DiagnosticType)v16),((java.lang.String[])v17));
    Object v19 = com.google.javascript.rhino.IR.continueNode();
    Object v20 = com.google.javascript.rhino.IR.continueNode();
    ((com.google.javascript.jscomp.ProcessClosurePrimitives)v4).visit(((com.google.javascript.jscomp.NodeTraversal)v11),((com.google.javascript.rhino.Node)v19),((com.google.javascript.rhino.Node)v20));
    Object v21 = null;
    org.junit.Assert.assertNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.rhino.IR.continueNode();
    Object v2 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v1));
    Object v3 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v4 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v2),((com.google.javascript.jscomp.CheckLevel)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = com.google.javascript.rhino.IR.continueNode();
    Object v8 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v7));
    Object v9 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v10 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.PreprocessorSymbolTable)v8),((com.google.javascript.jscomp.CheckLevel)v9));
    Object v11 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.NodeTraversal.Callback)v10));
    Object v12 = com.google.javascript.rhino.IR.continueNode();
    Object v13 = com.google.javascript.rhino.IR.continueNode();
    Object v14 = ((com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback)v4).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v11),((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v13));
    org.junit.Assert.assertEquals((Object)(true), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.rhino.IR.continueNode();
    Object v2 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v1));
    Object v3 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v4 = ((java.lang.Enum)v3).getDeclaringClass();
    Object v5 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v2),((com.google.javascript.jscomp.CheckLevel)v3));
    Object v6 = com.google.javascript.rhino.IR.continueNode();
    Object v7 = com.google.javascript.rhino.IR.continueNode();
    ((com.google.javascript.jscomp.ProcessClosurePrimitives)v5).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.rhino.IR.continueNode();
    Object v2 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v1));
    Object v3 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v4 = ((java.lang.Enum)v3).hashCode();
    Object v5 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v2),((com.google.javascript.jscomp.CheckLevel)v3));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.rhino.IR.continueNode();
    Object v2 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v1));
    Object v3 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v4 = ((java.lang.Enum)v3).hashCode();
    Object v5 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v2),((com.google.javascript.jscomp.CheckLevel)v3));
    Object v6 = com.google.javascript.rhino.IR.continueNode();
    Object v7 = com.google.javascript.rhino.IR.continueNode();
    ((com.google.javascript.jscomp.ProcessClosurePrimitives)v5).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.rhino.IR.continueNode();
    Object v2 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v1));
    Object v3 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v4 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v2),((com.google.javascript.jscomp.CheckLevel)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = com.google.javascript.rhino.IR.continueNode();
    Object v8 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v7));
    Object v9 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v10 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.PreprocessorSymbolTable)v8),((com.google.javascript.jscomp.CheckLevel)v9));
    Object v11 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.NodeTraversal.Callback)v10));
    Object v12 = com.google.javascript.rhino.IR.continueNode();
    Object v13 = com.google.javascript.rhino.IR.continueNode();
    Object v14 = ((com.google.javascript.rhino.Node)v13).getChangeTime();
    ((com.google.javascript.jscomp.ProcessClosurePrimitives)v4).visit(((com.google.javascript.jscomp.NodeTraversal)v11),((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v13));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.rhino.IR.continueNode();
    Object v2 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v1));
    Object v3 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v4 = ((java.lang.Enum)v3).getDeclaringClass();
    Object v5 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v2),((com.google.javascript.jscomp.CheckLevel)v3));
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = com.google.javascript.rhino.IR.continueNode();
    Object v9 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v8));
    Object v10 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v11 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v7),((com.google.javascript.jscomp.PreprocessorSymbolTable)v9),((com.google.javascript.jscomp.CheckLevel)v10));
    Object v12 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.NodeTraversal.Callback)v11));
    Object v13 = com.google.javascript.rhino.IR.continueNode();
    Object v14 = com.google.javascript.rhino.IR.continueNode();
    ((com.google.javascript.jscomp.NodeTraversal.Callback)v5).visit(((com.google.javascript.jscomp.NodeTraversal)v12),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v14));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.Compiler();
    Object v17 = new com.google.javascript.jscomp.Compiler();
    Object v18 = com.google.javascript.rhino.IR.continueNode();
    Object v19 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v18));
    Object v20 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v21 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v17),((com.google.javascript.jscomp.PreprocessorSymbolTable)v19),((com.google.javascript.jscomp.CheckLevel)v20));
    Object v22 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v16),((com.google.javascript.jscomp.NodeTraversal.Callback)v21));
    Object v23 = com.google.javascript.rhino.IR.continueNode();
    Object v24 = com.google.javascript.rhino.IR.continueNode();
    Object v25 = com.google.javascript.rhino.IR.continueNode();
    Object v26 = ((com.google.javascript.rhino.Node)v24).copyInformationFrom(((com.google.javascript.rhino.Node)v25));
    Object v27 = ((com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback)v5).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v22),((com.google.javascript.rhino.Node)v23),((com.google.javascript.rhino.Node)v24));
    org.junit.Assert.assertEquals((Object)(true), v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.rhino.IR.continueNode();
    Object v2 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v1));
    Object v3 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v4 = ((java.lang.Enum)v3).getDeclaringClass();
    Object v5 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v2),((com.google.javascript.jscomp.CheckLevel)v3));
    Object v6 = com.google.javascript.rhino.IR.continueNode();
    Object v7 = com.google.javascript.rhino.IR.continueNode();
    Object v8 = -25;
    Object v9 = ((com.google.javascript.rhino.Node)v7).getIntProp((((java.lang.Integer)v8).intValue()));
    ((com.google.javascript.jscomp.ProcessClosurePrimitives)v5).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v7));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.rhino.IR.continueNode();
    Object v2 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v1));
    Object v3 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v4 = ((java.lang.Enum)v3).hashCode();
    Object v5 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v2),((com.google.javascript.jscomp.CheckLevel)v3));
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = com.google.javascript.rhino.IR.continueNode();
    Object v9 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v8));
    Object v10 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v11 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v7),((com.google.javascript.jscomp.PreprocessorSymbolTable)v9),((com.google.javascript.jscomp.CheckLevel)v10));
    Object v12 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.NodeTraversal.Callback)v11));
    Object v13 = com.google.javascript.rhino.IR.continueNode();
    Object v14 = com.google.javascript.rhino.IR.continueNode();
    Object v15 = "";
    ((com.google.javascript.rhino.Node)v14).setSourceFileForTesting(((java.lang.String)v15));
    Object v16 = null;
    ((com.google.javascript.jscomp.ProcessClosurePrimitives)v5).visit(((com.google.javascript.jscomp.NodeTraversal)v12),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v14));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.rhino.IR.continueNode();
    Object v2 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v1));
    Object v3 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v4 = ((java.lang.Enum)v3).getDeclaringClass();
    Object v5 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v2),((com.google.javascript.jscomp.CheckLevel)v3));
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = com.google.javascript.rhino.IR.continueNode();
    Object v9 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v8));
    Object v10 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v11 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v7),((com.google.javascript.jscomp.PreprocessorSymbolTable)v9),((com.google.javascript.jscomp.CheckLevel)v10));
    Object v12 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.NodeTraversal.Callback)v11));
    Object v13 = com.google.javascript.rhino.IR.continueNode();
    Object v14 = com.google.javascript.rhino.IR.continueNode();
    Object v15 = -9;
    Object v16 = ((com.google.javascript.rhino.Node)v14).getProp((((java.lang.Integer)v15).intValue()));
    ((com.google.javascript.jscomp.ProcessClosurePrimitives)v5).visit(((com.google.javascript.jscomp.NodeTraversal)v12),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v14));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.rhino.IR.continueNode();
    Object v2 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v1));
    Object v3 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v4 = ((java.lang.Enum)v3).getDeclaringClass();
    Object v5 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v2),((com.google.javascript.jscomp.CheckLevel)v3));
    Object v6 = com.google.javascript.rhino.IR.continueNode();
    Object v7 = com.google.javascript.rhino.IR.continueNode();
    Object v8 = ((com.google.javascript.rhino.Node)v6).copyInformationFrom(((com.google.javascript.rhino.Node)v7));
    Object v9 = com.google.javascript.rhino.IR.continueNode();
    ((com.google.javascript.jscomp.ProcessClosurePrimitives)v5).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.rhino.IR.continueNode();
    Object v2 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v1));
    Object v3 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v4 = ((java.lang.Enum)v3).hashCode();
    Object v5 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v2),((com.google.javascript.jscomp.CheckLevel)v3));
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = com.google.javascript.rhino.IR.continueNode();
    Object v9 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v8));
    Object v10 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v11 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v7),((com.google.javascript.jscomp.PreprocessorSymbolTable)v9),((com.google.javascript.jscomp.CheckLevel)v10));
    Object v12 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.NodeTraversal.Callback)v11));
    Object v13 = com.google.javascript.rhino.IR.continueNode();
    Object v14 = com.google.javascript.rhino.IR.continueNode();
    Object v15 = com.google.javascript.rhino.IR.continueNode();
    Object v16 = ((com.google.javascript.rhino.Node)v14).useSourceInfoFromForTree(((com.google.javascript.rhino.Node)v15));
    ((com.google.javascript.jscomp.ProcessClosurePrimitives)v5).visit(((com.google.javascript.jscomp.NodeTraversal)v12),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v14));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.rhino.IR.continueNode();
    Object v2 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v1));
    Object v3 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v4 = ((java.lang.Enum)v3).hashCode();
    Object v5 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v2),((com.google.javascript.jscomp.CheckLevel)v3));
    Object v6 = com.google.javascript.rhino.IR.continueNode();
    Object v7 = com.google.javascript.rhino.IR.continueNode();
    ((com.google.javascript.jscomp.ProcessClosurePrimitives)v5).hotSwapScript(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.rhino.IR.continueNode();
    Object v2 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v1));
    Object v3 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v4 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v2),((com.google.javascript.jscomp.CheckLevel)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = com.google.javascript.rhino.IR.continueNode();
    Object v8 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v7));
    Object v9 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v10 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.PreprocessorSymbolTable)v8),((com.google.javascript.jscomp.CheckLevel)v9));
    Object v11 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.NodeTraversal.Callback)v10));
    Object v12 = com.google.javascript.rhino.IR.continueNode();
    Object v13 = com.google.javascript.rhino.IR.continueNode();
    ((com.google.javascript.jscomp.ProcessClosurePrimitives)v4).visit(((com.google.javascript.jscomp.NodeTraversal)v11),((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
    Object v15 = com.google.javascript.rhino.IR.continueNode();
    Object v16 = com.google.javascript.rhino.IR.continueNode();
    ((com.google.javascript.jscomp.ProcessClosurePrimitives)v4).process(((com.google.javascript.rhino.Node)v15),((com.google.javascript.rhino.Node)v16));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.rhino.IR.continueNode();
    Object v2 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v1));
    Object v3 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v4 = ((java.lang.Enum)v3).hashCode();
    Object v5 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v2),((com.google.javascript.jscomp.CheckLevel)v3));
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = com.google.javascript.rhino.IR.continueNode();
    Object v9 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v8));
    Object v10 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v11 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v7),((com.google.javascript.jscomp.PreprocessorSymbolTable)v9),((com.google.javascript.jscomp.CheckLevel)v10));
    Object v12 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.NodeTraversal.Callback)v11));
    Object v13 = ((com.google.javascript.jscomp.NodeTraversal)v12).getScope();
    Object v14 = com.google.javascript.rhino.IR.continueNode();
    Object v15 = com.google.javascript.rhino.IR.continueNode();
    ((com.google.javascript.jscomp.ProcessClosurePrimitives)v5).visit(((com.google.javascript.jscomp.NodeTraversal)v12),((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.rhino.IR.continueNode();
    Object v2 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v1));
    Object v3 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v4 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v2),((com.google.javascript.jscomp.CheckLevel)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = com.google.javascript.rhino.IR.continueNode();
    Object v8 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v7));
    Object v9 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v10 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.PreprocessorSymbolTable)v8),((com.google.javascript.jscomp.CheckLevel)v9));
    Object v11 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.NodeTraversal.Callback)v10));
    Object v12 = com.google.javascript.rhino.IR.continueNode();
    Object v13 = com.google.javascript.rhino.IR.continueNode();
    ((com.google.javascript.jscomp.ProcessClosurePrimitives)v4).visit(((com.google.javascript.jscomp.NodeTraversal)v11),((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
    Object v15 = new com.google.javascript.jscomp.Compiler();
    Object v16 = new com.google.javascript.jscomp.Compiler();
    Object v17 = com.google.javascript.rhino.IR.continueNode();
    Object v18 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v17));
    Object v19 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v20 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v16),((com.google.javascript.jscomp.PreprocessorSymbolTable)v18),((com.google.javascript.jscomp.CheckLevel)v19));
    Object v21 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v15),((com.google.javascript.jscomp.NodeTraversal.Callback)v20));
    Object v22 = com.google.javascript.rhino.IR.continueNode();
    Object v23 = com.google.javascript.rhino.IR.continueNode();
    Object v24 = false;
    ((com.google.javascript.rhino.Node)v23).setOptionalArg((((java.lang.Boolean)v24).booleanValue()));
    Object v25 = null;
    ((com.google.javascript.jscomp.ProcessClosurePrimitives)v4).visit(((com.google.javascript.jscomp.NodeTraversal)v21),((com.google.javascript.rhino.Node)v22),((com.google.javascript.rhino.Node)v23));
    Object v26 = null;
    org.junit.Assert.assertNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.rhino.IR.continueNode();
    Object v2 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v1));
    Object v3 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v4 = ((java.lang.Enum)v3).getDeclaringClass();
    Object v5 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v2),((com.google.javascript.jscomp.CheckLevel)v3));
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = com.google.javascript.rhino.IR.continueNode();
    Object v9 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v8));
    Object v10 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v11 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v7),((com.google.javascript.jscomp.PreprocessorSymbolTable)v9),((com.google.javascript.jscomp.CheckLevel)v10));
    Object v12 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.NodeTraversal.Callback)v11));
    Object v13 = com.google.javascript.rhino.IR.continueNode();
    Object v14 = com.google.javascript.rhino.IR.continueNode();
    Object v15 = ((com.google.javascript.rhino.Node)v14).isVarArgs();
    ((com.google.javascript.jscomp.ProcessClosurePrimitives)v5).visit(((com.google.javascript.jscomp.NodeTraversal)v12),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v14));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.rhino.IR.continueNode();
    Object v2 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v1));
    Object v3 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v4 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v2),((com.google.javascript.jscomp.CheckLevel)v3));
    Object v5 = com.google.javascript.rhino.IR.continueNode();
    Object v6 = com.google.javascript.rhino.IR.continueNode();
    ((com.google.javascript.jscomp.ProcessClosurePrimitives)v4).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v6));
    Object v7 = null;
    Object v8 = com.google.javascript.rhino.IR.continueNode();
    Object v9 = com.google.javascript.rhino.IR.continueNode();
    ((com.google.javascript.jscomp.ProcessClosurePrimitives)v4).hotSwapScript(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.rhino.IR.continueNode();
    Object v2 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v1));
    Object v3 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v4 = ((java.lang.Enum)v3).hashCode();
    Object v5 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v2),((com.google.javascript.jscomp.CheckLevel)v3));
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = com.google.javascript.rhino.IR.continueNode();
    Object v9 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v8));
    Object v10 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v11 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v7),((com.google.javascript.jscomp.PreprocessorSymbolTable)v9),((com.google.javascript.jscomp.CheckLevel)v10));
    Object v12 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.NodeTraversal.Callback)v11));
    Object v13 = com.google.javascript.rhino.IR.continueNode();
    Object v14 = com.google.javascript.rhino.IR.continueNode();
    ((com.google.javascript.jscomp.ProcessClosurePrimitives)v5).visit(((com.google.javascript.jscomp.NodeTraversal)v12),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v14));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.rhino.IR.continueNode();
    Object v2 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v1));
    Object v3 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v4 = ((java.lang.Enum)v3).hashCode();
    Object v5 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v2),((com.google.javascript.jscomp.CheckLevel)v3));
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = com.google.javascript.rhino.IR.continueNode();
    Object v9 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v8));
    Object v10 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v11 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v7),((com.google.javascript.jscomp.PreprocessorSymbolTable)v9),((com.google.javascript.jscomp.CheckLevel)v10));
    Object v12 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.NodeTraversal.Callback)v11));
    Object v13 = com.google.javascript.rhino.IR.continueNode();
    Object v14 = com.google.javascript.rhino.IR.continueNode();
    ((com.google.javascript.jscomp.ProcessClosurePrimitives)v5).visit(((com.google.javascript.jscomp.NodeTraversal)v12),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v14));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.Compiler();
    Object v17 = new com.google.javascript.jscomp.Compiler();
    Object v18 = com.google.javascript.rhino.IR.continueNode();
    Object v19 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v18));
    Object v20 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v21 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v17),((com.google.javascript.jscomp.PreprocessorSymbolTable)v19),((com.google.javascript.jscomp.CheckLevel)v20));
    Object v22 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v16),((com.google.javascript.jscomp.NodeTraversal.Callback)v21));
    Object v23 = com.google.javascript.rhino.IR.continueNode();
    Object v24 = com.google.javascript.rhino.IR.continueNode();
    ((com.google.javascript.jscomp.ProcessClosurePrimitives)v5).visit(((com.google.javascript.jscomp.NodeTraversal)v22),((com.google.javascript.rhino.Node)v23),((com.google.javascript.rhino.Node)v24));
    Object v25 = null;
    org.junit.Assert.assertNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.rhino.IR.continueNode();
    Object v2 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v1));
    Object v3 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v4 = ((java.lang.Enum)v3).getDeclaringClass();
    Object v5 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v2),((com.google.javascript.jscomp.CheckLevel)v3));
    Object v6 = com.google.javascript.rhino.IR.continueNode();
    Object v7 = com.google.javascript.rhino.IR.continueNode();
    ((com.google.javascript.jscomp.ProcessClosurePrimitives)v5).hotSwapScript(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.rhino.IR.continueNode();
    Object v2 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v1));
    Object v3 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v4 = ((java.lang.Enum)v3).getDeclaringClass();
    Object v5 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v2),((com.google.javascript.jscomp.CheckLevel)v3));
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = com.google.javascript.rhino.IR.continueNode();
    Object v9 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v8));
    Object v10 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v11 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v7),((com.google.javascript.jscomp.PreprocessorSymbolTable)v9),((com.google.javascript.jscomp.CheckLevel)v10));
    Object v12 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.NodeTraversal.Callback)v11));
    Object v13 = com.google.javascript.rhino.IR.continueNode();
    Object v14 = com.google.javascript.rhino.IR.continueNode();
    ((com.google.javascript.jscomp.ProcessClosurePrimitives)v5).visit(((com.google.javascript.jscomp.NodeTraversal)v12),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v14));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.rhino.IR.continueNode();
    Object v2 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v1));
    Object v3 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v4 = ((java.lang.Enum)v3).hashCode();
    Object v5 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v2),((com.google.javascript.jscomp.CheckLevel)v3));
    Object v6 = com.google.javascript.rhino.IR.continueNode();
    Object v7 = com.google.javascript.rhino.IR.continueNode();
    ((com.google.javascript.jscomp.ProcessClosurePrimitives)v5).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v7));
    Object v8 = null;
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = new com.google.javascript.jscomp.Compiler();
    Object v11 = com.google.javascript.rhino.IR.continueNode();
    Object v12 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v11));
    Object v13 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v14 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.PreprocessorSymbolTable)v12),((com.google.javascript.jscomp.CheckLevel)v13));
    Object v15 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.NodeTraversal.Callback)v14));
    Object v16 = ((com.google.javascript.jscomp.NodeTraversal)v15).getEnclosingFunction();
    Object v17 = com.google.javascript.rhino.IR.continueNode();
    Object v18 = com.google.javascript.rhino.IR.continueNode();
    ((com.google.javascript.jscomp.ProcessClosurePrimitives)v5).visit(((com.google.javascript.jscomp.NodeTraversal)v15),((com.google.javascript.rhino.Node)v17),((com.google.javascript.rhino.Node)v18));
    Object v19 = null;
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.rhino.IR.continueNode();
    Object v2 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v1));
    Object v3 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v4 = ((java.lang.Enum)v3).hashCode();
    Object v5 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v2),((com.google.javascript.jscomp.CheckLevel)v3));
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = com.google.javascript.rhino.IR.continueNode();
    Object v9 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v8));
    Object v10 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v11 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v7),((com.google.javascript.jscomp.PreprocessorSymbolTable)v9),((com.google.javascript.jscomp.CheckLevel)v10));
    Object v12 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.NodeTraversal.Callback)v11));
    Object v13 = com.google.javascript.rhino.IR.continueNode();
    Object v14 = com.google.javascript.rhino.IR.continueNode();
    Object v15 = ((com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback)v5).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v12),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v14));
    org.junit.Assert.assertEquals((Object)(true), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.rhino.IR.continueNode();
    Object v2 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v1));
    Object v3 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v4 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v2),((com.google.javascript.jscomp.CheckLevel)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = com.google.javascript.rhino.IR.continueNode();
    Object v8 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v7));
    Object v9 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v10 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.PreprocessorSymbolTable)v8),((com.google.javascript.jscomp.CheckLevel)v9));
    Object v11 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.NodeTraversal.Callback)v10));
    Object v12 = com.google.javascript.rhino.IR.continueNode();
    Object v13 = com.google.javascript.rhino.IR.continueNode();
    Object v14 = ((com.google.javascript.rhino.Node)v13).isOptionalArg();
    ((com.google.javascript.jscomp.ProcessClosurePrimitives)v4).visit(((com.google.javascript.jscomp.NodeTraversal)v11),((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v13));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getProgress();
    Object v2 = com.google.javascript.rhino.IR.continueNode();
    Object v3 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v2));
    Object v4 = "oject";
    Object v5 = ((com.google.javascript.jscomp.PreprocessorSymbolTable)v3).getSlot(((java.lang.String)v4));
    Object v6 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v7 = ((java.lang.Enum)v6).getDeclaringClass();
    Object v8 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v3),((com.google.javascript.jscomp.CheckLevel)v6));
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = new com.google.javascript.jscomp.Compiler();
    Object v11 = com.google.javascript.rhino.IR.continueNode();
    Object v12 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v11));
    Object v13 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v14 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.PreprocessorSymbolTable)v12),((com.google.javascript.jscomp.CheckLevel)v13));
    Object v15 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.NodeTraversal.Callback)v14));
    Object v16 = com.google.javascript.rhino.IR.continueNode();
    Object v17 = com.google.javascript.rhino.IR.continueNode();
    ((com.google.javascript.jscomp.ProcessClosurePrimitives)v8).visit(((com.google.javascript.jscomp.NodeTraversal)v15),((com.google.javascript.rhino.Node)v16),((com.google.javascript.rhino.Node)v17));
    Object v18 = null;
    Object v19 = new com.google.javascript.jscomp.Compiler();
    Object v20 = new com.google.javascript.jscomp.Compiler();
    Object v21 = com.google.javascript.rhino.IR.continueNode();
    Object v22 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v21));
    Object v23 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v24 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v20),((com.google.javascript.jscomp.PreprocessorSymbolTable)v22),((com.google.javascript.jscomp.CheckLevel)v23));
    Object v25 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v19),((com.google.javascript.jscomp.NodeTraversal.Callback)v24));
    Object v26 = ((com.google.javascript.jscomp.NodeTraversal)v25).hasScope();
    Object v27 = com.google.javascript.rhino.IR.continueNode();
    Object v28 = com.google.javascript.rhino.IR.continueNode();
    Object v29 = -2;
    Object v30 = true;
    ((com.google.javascript.rhino.Node)v28).putBooleanProp((((java.lang.Integer)v29).intValue()),(((java.lang.Boolean)v30).booleanValue()));
    Object v31 = null;
    ((com.google.javascript.jscomp.ProcessClosurePrimitives)v8).visit(((com.google.javascript.jscomp.NodeTraversal)v25),((com.google.javascript.rhino.Node)v27),((com.google.javascript.rhino.Node)v28));
    Object v32 = null;
    org.junit.Assert.assertNull(v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.rhino.IR.continueNode();
    Object v2 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v1));
    Object v3 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v4 = ((java.lang.Enum)v3).hashCode();
    Object v5 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v2),((com.google.javascript.jscomp.CheckLevel)v3));
    Object v6 = com.google.javascript.rhino.IR.continueNode();
    Object v7 = com.google.javascript.rhino.IR.continueNode();
    Object v8 = true;
    ((com.google.javascript.rhino.Node)v7).setOptionalArg((((java.lang.Boolean)v8).booleanValue()));
    Object v9 = null;
    ((com.google.javascript.jscomp.ProcessClosurePrimitives)v5).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v7));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.rhino.IR.continueNode();
    Object v2 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v1));
    Object v3 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v4 = ((java.lang.Enum)v3).hashCode();
    Object v5 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v2),((com.google.javascript.jscomp.CheckLevel)v3));
    Object v6 = ((com.google.javascript.jscomp.ProcessClosurePrimitives)v5).getExportedVariableNames();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.rhino.IR.continueNode();
    Object v2 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v1));
    Object v3 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v4 = ((java.lang.Enum)v3).hashCode();
    Object v5 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v2),((com.google.javascript.jscomp.CheckLevel)v3));
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = com.google.javascript.rhino.IR.continueNode();
    Object v9 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v8));
    Object v10 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v11 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v7),((com.google.javascript.jscomp.PreprocessorSymbolTable)v9),((com.google.javascript.jscomp.CheckLevel)v10));
    Object v12 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.NodeTraversal.Callback)v11));
    Object v13 = com.google.javascript.rhino.IR.continueNode();
    Object v14 = com.google.javascript.rhino.IR.continueNode();
    Object v15 = 1;
    Object v16 = true;
    ((com.google.javascript.rhino.Node)v14).putBooleanProp((((java.lang.Integer)v15).intValue()),(((java.lang.Boolean)v16).booleanValue()));
    Object v17 = null;
    ((com.google.javascript.jscomp.ProcessClosurePrimitives)v5).visit(((com.google.javascript.jscomp.NodeTraversal)v12),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v14));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.rhino.IR.continueNode();
    Object v2 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v1));
    Object v3 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v4 = ((java.lang.Enum)v3).hashCode();
    Object v5 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v2),((com.google.javascript.jscomp.CheckLevel)v3));
    Object v6 = com.google.javascript.rhino.IR.continueNode();
    Object v7 = ((com.google.javascript.rhino.Node)v6).wasEmptyNode();
    Object v8 = com.google.javascript.rhino.IR.continueNode();
    ((com.google.javascript.jscomp.ProcessClosurePrimitives)v5).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.rhino.IR.continueNode();
    Object v2 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v1));
    Object v3 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v4 = ((java.lang.Enum)v3).hashCode();
    Object v5 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v2),((com.google.javascript.jscomp.CheckLevel)v3));
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = com.google.javascript.rhino.IR.continueNode();
    Object v9 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v8));
    Object v10 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v11 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v7),((com.google.javascript.jscomp.PreprocessorSymbolTable)v9),((com.google.javascript.jscomp.CheckLevel)v10));
    Object v12 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.NodeTraversal.Callback)v11));
    Object v13 = com.google.javascript.rhino.IR.continueNode();
    Object v14 = com.google.javascript.rhino.IR.continueNode();
    ((com.google.javascript.jscomp.ProcessClosurePrimitives)v5).visit(((com.google.javascript.jscomp.NodeTraversal)v12),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v14));
    Object v15 = null;
    Object v16 = com.google.javascript.rhino.IR.continueNode();
    Object v17 = com.google.javascript.rhino.IR.continueNode();
    Object v18 = ((com.google.javascript.rhino.Node)v16).copyInformationFromForTree(((com.google.javascript.rhino.Node)v17));
    Object v19 = com.google.javascript.rhino.IR.continueNode();
    ((com.google.javascript.jscomp.ProcessClosurePrimitives)v5).process(((com.google.javascript.rhino.Node)v16),((com.google.javascript.rhino.Node)v19));
    Object v20 = null;
    org.junit.Assert.assertNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.rhino.IR.continueNode();
    Object v2 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v1));
    Object v3 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v4 = ((java.lang.Enum)v3).hashCode();
    Object v5 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v2),((com.google.javascript.jscomp.CheckLevel)v3));
    Object v6 = com.google.javascript.rhino.IR.continueNode();
    Object v7 = com.google.javascript.rhino.IR.continueNode();
    ((com.google.javascript.jscomp.ProcessClosurePrimitives)v5).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v7));
    Object v8 = null;
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = new com.google.javascript.jscomp.Compiler();
    Object v11 = com.google.javascript.rhino.IR.continueNode();
    Object v12 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v11));
    Object v13 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v14 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.PreprocessorSymbolTable)v12),((com.google.javascript.jscomp.CheckLevel)v13));
    Object v15 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.NodeTraversal.Callback)v14));
    Object v16 = com.google.javascript.rhino.IR.continueNode();
    Object v17 = com.google.javascript.rhino.IR.continueNode();
    ((com.google.javascript.rhino.Node)v16).addChildrenToFront(((com.google.javascript.rhino.Node)v17));
    Object v18 = null;
    Object v19 = com.google.javascript.rhino.IR.continueNode();
    ((com.google.javascript.jscomp.ProcessClosurePrimitives)v5).visit(((com.google.javascript.jscomp.NodeTraversal)v15),((com.google.javascript.rhino.Node)v16),((com.google.javascript.rhino.Node)v19));
    Object v20 = null;
    org.junit.Assert.assertNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.rhino.IR.continueNode();
    Object v2 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v1));
    Object v3 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v4 = ((java.lang.Enum)v3).getDeclaringClass();
    Object v5 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v2),((com.google.javascript.jscomp.CheckLevel)v3));
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = com.google.javascript.rhino.IR.continueNode();
    Object v9 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v8));
    Object v10 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v11 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v7),((com.google.javascript.jscomp.PreprocessorSymbolTable)v9),((com.google.javascript.jscomp.CheckLevel)v10));
    Object v12 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.NodeTraversal.Callback)v11));
    Object v13 = com.google.javascript.rhino.IR.continueNode();
    Object v14 = com.google.javascript.rhino.IR.continueNode();
    ((com.google.javascript.jscomp.ProcessClosurePrimitives)v5).visit(((com.google.javascript.jscomp.NodeTraversal)v12),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v14));
    Object v15 = null;
    Object v16 = com.google.javascript.rhino.IR.continueNode();
    Object v17 = java.io.Writer.nullWriter();
    ((com.google.javascript.rhino.Node)v16).appendStringTree(((java.lang.Appendable)v17));
    Object v18 = null;
    Object v19 = com.google.javascript.rhino.IR.continueNode();
    ((com.google.javascript.jscomp.ProcessClosurePrimitives)v5).process(((com.google.javascript.rhino.Node)v16),((com.google.javascript.rhino.Node)v19));
    Object v20 = null;
    org.junit.Assert.assertNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getProgress();
    Object v2 = com.google.javascript.rhino.IR.continueNode();
    Object v3 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v2));
    Object v4 = "oject";
    Object v5 = ((com.google.javascript.jscomp.PreprocessorSymbolTable)v3).getSlot(((java.lang.String)v4));
    Object v6 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v7 = ((java.lang.Enum)v6).getDeclaringClass();
    Object v8 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v3),((com.google.javascript.jscomp.CheckLevel)v6));
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = new com.google.javascript.jscomp.Compiler();
    Object v11 = com.google.javascript.rhino.IR.continueNode();
    Object v12 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v11));
    Object v13 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v14 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.PreprocessorSymbolTable)v12),((com.google.javascript.jscomp.CheckLevel)v13));
    Object v15 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.NodeTraversal.Callback)v14));
    Object v16 = ((com.google.javascript.jscomp.NodeTraversal)v15).getEnclosingFunction();
    Object v17 = com.google.javascript.rhino.IR.continueNode();
    Object v18 = com.google.javascript.rhino.IR.continueNode();
    Object v19 = 1;
    ((com.google.javascript.rhino.Node)v18).setChangeTime((((java.lang.Integer)v19).intValue()));
    Object v20 = null;
    ((com.google.javascript.jscomp.ProcessClosurePrimitives)v8).visit(((com.google.javascript.jscomp.NodeTraversal)v15),((com.google.javascript.rhino.Node)v17),((com.google.javascript.rhino.Node)v18));
    Object v21 = null;
    org.junit.Assert.assertNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.rhino.IR.continueNode();
    Object v2 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v1));
    Object v3 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v4 = ((java.lang.Enum)v3).hashCode();
    Object v5 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v2),((com.google.javascript.jscomp.CheckLevel)v3));
    Object v6 = com.google.javascript.rhino.IR.continueNode();
    Object v7 = com.google.javascript.rhino.IR.continueNode();
    ((com.google.javascript.jscomp.ProcessClosurePrimitives)v5).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v7));
    Object v8 = null;
    Object v9 = com.google.javascript.rhino.IR.continueNode();
    Object v10 = com.google.javascript.rhino.IR.continueNode();
    ((com.google.javascript.jscomp.ProcessClosurePrimitives)v5).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.rhino.IR.continueNode();
    Object v2 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v1));
    Object v3 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v4 = ((java.lang.Enum)v3).getDeclaringClass();
    Object v5 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v2),((com.google.javascript.jscomp.CheckLevel)v3));
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = com.google.javascript.rhino.IR.continueNode();
    Object v9 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v8));
    Object v10 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v11 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v7),((com.google.javascript.jscomp.PreprocessorSymbolTable)v9),((com.google.javascript.jscomp.CheckLevel)v10));
    Object v12 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.NodeTraversal.Callback)v11));
    Object v13 = com.google.javascript.rhino.IR.continueNode();
    Object v14 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v15 = ":";
    Object v16 = "";
    Object v17 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = new java.lang.String[]{"","t"};
    Object v19 = ((com.google.javascript.jscomp.NodeTraversal)v12).makeError(((com.google.javascript.rhino.Node)v13),((com.google.javascript.jscomp.CheckLevel)v14),((com.google.javascript.jscomp.DiagnosticType)v17),((java.lang.String[])v18));
    Object v20 = com.google.javascript.rhino.IR.continueNode();
    Object v21 = com.google.javascript.rhino.IR.continueNode();
    ((com.google.javascript.jscomp.ProcessClosurePrimitives)v5).visit(((com.google.javascript.jscomp.NodeTraversal)v12),((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.Node)v21));
    Object v22 = null;
    org.junit.Assert.assertNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.rhino.IR.continueNode();
    Object v2 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v1));
    Object v3 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v4 = ((java.lang.Enum)v3).getDeclaringClass();
    Object v5 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v2),((com.google.javascript.jscomp.CheckLevel)v3));
    Object v6 = ((com.google.javascript.jscomp.ProcessClosurePrimitives)v5).getExportedVariableNames();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.rhino.IR.continueNode();
    Object v2 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v1));
    Object v3 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v4 = ((java.lang.Enum)v3).getDeclaringClass();
    Object v5 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v2),((com.google.javascript.jscomp.CheckLevel)v3));
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = com.google.javascript.rhino.IR.continueNode();
    Object v9 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v8));
    Object v10 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v11 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v7),((com.google.javascript.jscomp.PreprocessorSymbolTable)v9),((com.google.javascript.jscomp.CheckLevel)v10));
    Object v12 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.NodeTraversal.Callback)v11));
    Object v13 = com.google.javascript.rhino.IR.continueNode();
    Object v14 = ((com.google.javascript.rhino.Node)v13).isSyntheticBlock();
    Object v15 = com.google.javascript.rhino.IR.continueNode();
    ((com.google.javascript.jscomp.ProcessClosurePrimitives)v5).visit(((com.google.javascript.jscomp.NodeTraversal)v12),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.rhino.IR.continueNode();
    Object v2 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v1));
    Object v3 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v4 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v2),((com.google.javascript.jscomp.CheckLevel)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = com.google.javascript.rhino.IR.continueNode();
    Object v8 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v7));
    Object v9 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v10 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.PreprocessorSymbolTable)v8),((com.google.javascript.jscomp.CheckLevel)v9));
    Object v11 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.NodeTraversal.Callback)v10));
    Object v12 = com.google.javascript.rhino.IR.continueNode();
    ((com.google.javascript.jscomp.NodeTraversal)v11).traverse(((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
    Object v14 = com.google.javascript.rhino.IR.continueNode();
    Object v15 = com.google.javascript.rhino.IR.continueNode();
    ((com.google.javascript.jscomp.ProcessClosurePrimitives)v4).visit(((com.google.javascript.jscomp.NodeTraversal)v11),((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.rhino.IR.continueNode();
    Object v2 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v1));
    Object v3 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v4 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v2),((com.google.javascript.jscomp.CheckLevel)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getProgress();
    Object v2 = com.google.javascript.rhino.IR.continueNode();
    Object v3 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v2));
    Object v4 = "oject";
    Object v5 = ((com.google.javascript.jscomp.PreprocessorSymbolTable)v3).getSlot(((java.lang.String)v4));
    Object v6 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v7 = ((java.lang.Enum)v6).getDeclaringClass();
    Object v8 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v3),((com.google.javascript.jscomp.CheckLevel)v6));
    Object v9 = com.google.javascript.rhino.IR.continueNode();
    Object v10 = com.google.javascript.rhino.IR.continueNode();
    Object v11 = com.google.javascript.rhino.IR.continueNode();
    Object v12 = ((com.google.javascript.rhino.Node)v10).srcref(((com.google.javascript.rhino.Node)v11));
    ((com.google.javascript.jscomp.ProcessClosurePrimitives)v8).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v10));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.rhino.IR.continueNode();
    Object v2 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v1));
    Object v3 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v4 = ((java.lang.Enum)v3).getDeclaringClass();
    Object v5 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v2),((com.google.javascript.jscomp.CheckLevel)v3));
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = com.google.javascript.rhino.IR.continueNode();
    Object v9 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v8));
    Object v10 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v11 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v7),((com.google.javascript.jscomp.PreprocessorSymbolTable)v9),((com.google.javascript.jscomp.CheckLevel)v10));
    Object v12 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.NodeTraversal.Callback)v11));
    Object v13 = com.google.javascript.rhino.IR.continueNode();
    Object v14 = ((com.google.javascript.rhino.Node)v13).removeFirstChild();
    Object v15 = com.google.javascript.rhino.IR.continueNode();
    ((com.google.javascript.jscomp.ProcessClosurePrimitives)v5).visit(((com.google.javascript.jscomp.NodeTraversal)v12),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.rhino.IR.continueNode();
    Object v2 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v1));
    Object v3 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v4 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v2),((com.google.javascript.jscomp.CheckLevel)v3));
    Object v5 = com.google.javascript.rhino.IR.continueNode();
    Object v6 = com.google.javascript.rhino.IR.continueNode();
    ((com.google.javascript.jscomp.ProcessClosurePrimitives)v4).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v6));
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.Compiler();
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = com.google.javascript.rhino.IR.continueNode();
    Object v11 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v10));
    Object v12 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v13 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.PreprocessorSymbolTable)v11),((com.google.javascript.jscomp.CheckLevel)v12));
    Object v14 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v8),((com.google.javascript.jscomp.NodeTraversal.Callback)v13));
    Object v15 = com.google.javascript.rhino.IR.continueNode();
    Object v16 = ":";
    Object v17 = "";
    Object v18 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v16),((java.lang.String)v17));
    Object v19 = new java.lang.String[]{"B"};
    ((com.google.javascript.jscomp.NodeTraversal)v14).report(((com.google.javascript.rhino.Node)v15),((com.google.javascript.jscomp.DiagnosticType)v18),((java.lang.String[])v19));
    Object v20 = null;
    Object v21 = com.google.javascript.rhino.IR.continueNode();
    Object v22 = com.google.javascript.rhino.IR.continueNode();
    ((com.google.javascript.jscomp.ProcessClosurePrimitives)v4).visit(((com.google.javascript.jscomp.NodeTraversal)v14),((com.google.javascript.rhino.Node)v21),((com.google.javascript.rhino.Node)v22));
    Object v23 = null;
    org.junit.Assert.assertNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.rhino.IR.continueNode();
    Object v2 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v1));
    Object v3 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v4 = ((java.lang.Enum)v3).getDeclaringClass();
    Object v5 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v2),((com.google.javascript.jscomp.CheckLevel)v3));
    Object v6 = com.google.javascript.rhino.IR.continueNode();
    Object v7 = com.google.javascript.rhino.IR.continueNode();
    ((com.google.javascript.jscomp.ProcessClosurePrimitives)v5).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v7));
    Object v8 = null;
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = new com.google.javascript.jscomp.Compiler();
    Object v11 = com.google.javascript.rhino.IR.continueNode();
    Object v12 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v11));
    Object v13 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v14 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.PreprocessorSymbolTable)v12),((com.google.javascript.jscomp.CheckLevel)v13));
    Object v15 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.NodeTraversal.Callback)v14));
    Object v16 = com.google.javascript.rhino.IR.continueNode();
    Object v17 = com.google.javascript.rhino.IR.continueNode();
    ((com.google.javascript.jscomp.ProcessClosurePrimitives)v5).visit(((com.google.javascript.jscomp.NodeTraversal)v15),((com.google.javascript.rhino.Node)v16),((com.google.javascript.rhino.Node)v17));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getProgress();
    Object v2 = com.google.javascript.rhino.IR.continueNode();
    Object v3 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v2));
    Object v4 = "oject";
    Object v5 = ((com.google.javascript.jscomp.PreprocessorSymbolTable)v3).getSlot(((java.lang.String)v4));
    Object v6 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v7 = ((java.lang.Enum)v6).getDeclaringClass();
    Object v8 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v3),((com.google.javascript.jscomp.CheckLevel)v6));
    Object v9 = com.google.javascript.rhino.IR.continueNode();
    Object v10 = com.google.javascript.rhino.IR.continueNode();
    Object v11 = -1;
    ((com.google.javascript.rhino.Node)v10).setLength((((java.lang.Integer)v11).intValue()));
    Object v12 = null;
    ((com.google.javascript.jscomp.ProcessClosurePrimitives)v8).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v10));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.rhino.IR.continueNode();
    Object v2 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v1));
    Object v3 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v4 = ((java.lang.Enum)v3).hashCode();
    Object v5 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v2),((com.google.javascript.jscomp.CheckLevel)v3));
    Object v6 = com.google.javascript.rhino.IR.continueNode();
    Object v7 = new com.google.javascript.rhino.JSDocInfo();
    Object v8 = ((com.google.javascript.rhino.Node)v6).setJSDocInfo(((com.google.javascript.rhino.JSDocInfo)v7));
    Object v9 = com.google.javascript.rhino.IR.continueNode();
    Object v10 = 0;
    ((com.google.javascript.rhino.Node)v9).setSourceEncodedPosition((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    ((com.google.javascript.jscomp.ProcessClosurePrimitives)v5).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v9));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.rhino.IR.continueNode();
    Object v2 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v1));
    Object v3 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v4 = ((java.lang.Enum)v3).hashCode();
    Object v5 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v2),((com.google.javascript.jscomp.CheckLevel)v3));
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = com.google.javascript.rhino.IR.continueNode();
    Object v9 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v8));
    Object v10 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v11 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v7),((com.google.javascript.jscomp.PreprocessorSymbolTable)v9),((com.google.javascript.jscomp.CheckLevel)v10));
    Object v12 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.NodeTraversal.Callback)v11));
    Object v13 = com.google.javascript.rhino.IR.continueNode();
    Object v14 = com.google.javascript.rhino.IR.continueNode();
    Object v15 = ((com.google.javascript.rhino.Node)v14).isOptionalArg();
    ((com.google.javascript.jscomp.ProcessClosurePrimitives)v5).visit(((com.google.javascript.jscomp.NodeTraversal)v12),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v14));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.rhino.IR.continueNode();
    Object v2 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v1));
    Object v3 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v4 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v2),((com.google.javascript.jscomp.CheckLevel)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = com.google.javascript.rhino.IR.continueNode();
    Object v8 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v7));
    Object v9 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v10 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.PreprocessorSymbolTable)v8),((com.google.javascript.jscomp.CheckLevel)v9));
    Object v11 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.NodeTraversal.Callback)v10));
    Object v12 = com.google.javascript.rhino.IR.continueNode();
    Object v13 = com.google.javascript.rhino.IR.continueNode();
    ((com.google.javascript.jscomp.ProcessClosurePrimitives)v4).visit(((com.google.javascript.jscomp.NodeTraversal)v11),((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
    Object v15 = ((com.google.javascript.jscomp.ProcessClosurePrimitives)v4).getExportedVariableNames();
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.rhino.IR.continueNode();
    Object v2 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v1));
    Object v3 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v4 = ((java.lang.Enum)v3).hashCode();
    Object v5 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v2),((com.google.javascript.jscomp.CheckLevel)v3));
    Object v6 = com.google.javascript.rhino.IR.continueNode();
    Object v7 = com.google.javascript.rhino.IR.continueNode();
    Object v8 = ((com.google.javascript.rhino.Node)v6).checkTreeEquals(((com.google.javascript.rhino.Node)v7));
    Object v9 = com.google.javascript.rhino.IR.continueNode();
    ((com.google.javascript.jscomp.ProcessClosurePrimitives)v5).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.rhino.IR.continueNode();
    Object v2 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v1));
    Object v3 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v4 = ((java.lang.Enum)v3).hashCode();
    Object v5 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v2),((com.google.javascript.jscomp.CheckLevel)v3));
    Object v6 = com.google.javascript.rhino.IR.continueNode();
    Object v7 = com.google.javascript.rhino.IR.continueNode();
    Object v8 = ((com.google.javascript.rhino.Node)v7).isFromExterns();
    ((com.google.javascript.jscomp.ProcessClosurePrimitives)v5).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v7));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.rhino.IR.continueNode();
    Object v2 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v1));
    Object v3 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v4 = ((java.lang.Enum)v3).hashCode();
    Object v5 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v2),((com.google.javascript.jscomp.CheckLevel)v3));
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = com.google.javascript.rhino.IR.continueNode();
    Object v9 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v8));
    Object v10 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v11 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v7),((com.google.javascript.jscomp.PreprocessorSymbolTable)v9),((com.google.javascript.jscomp.CheckLevel)v10));
    Object v12 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.NodeTraversal.Callback)v11));
    Object v13 = com.google.javascript.rhino.IR.continueNode();
    Object v14 = ((com.google.javascript.rhino.Node)v13).isQualifiedName();
    Object v15 = com.google.javascript.rhino.IR.continueNode();
    ((com.google.javascript.jscomp.ProcessClosurePrimitives)v5).visit(((com.google.javascript.jscomp.NodeTraversal)v12),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.rhino.IR.continueNode();
    Object v2 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v1));
    Object v3 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v4 = ((java.lang.Enum)v3).hashCode();
    Object v5 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v2),((com.google.javascript.jscomp.CheckLevel)v3));
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = com.google.javascript.rhino.IR.continueNode();
    Object v9 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v8));
    Object v10 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v11 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v7),((com.google.javascript.jscomp.PreprocessorSymbolTable)v9),((com.google.javascript.jscomp.CheckLevel)v10));
    Object v12 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.NodeTraversal.Callback)v11));
    Object v13 = com.google.javascript.rhino.IR.continueNode();
    Object v14 = com.google.javascript.rhino.IR.continueNode();
    ((com.google.javascript.jscomp.ProcessClosurePrimitives)v5).visit(((com.google.javascript.jscomp.NodeTraversal)v12),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v14));
    Object v15 = null;
    Object v16 = com.google.javascript.rhino.IR.continueNode();
    Object v17 = false;
    ((com.google.javascript.rhino.Node)v16).setVarArgs((((java.lang.Boolean)v17).booleanValue()));
    Object v18 = null;
    Object v19 = com.google.javascript.rhino.IR.continueNode();
    Object v20 = 1;
    ((com.google.javascript.rhino.Node)v19).removeProp((((java.lang.Integer)v20).intValue()));
    Object v21 = null;
    ((com.google.javascript.jscomp.ProcessClosurePrimitives)v5).process(((com.google.javascript.rhino.Node)v16),((com.google.javascript.rhino.Node)v19));
    Object v22 = null;
    org.junit.Assert.assertNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.rhino.IR.continueNode();
    Object v2 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v1));
    Object v3 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v4 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v2),((com.google.javascript.jscomp.CheckLevel)v3));
    Object v5 = com.google.javascript.rhino.IR.continueNode();
    Object v6 = com.google.javascript.rhino.IR.continueNode();
    ((com.google.javascript.jscomp.ProcessClosurePrimitives)v4).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v6));
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.Compiler();
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = com.google.javascript.rhino.IR.continueNode();
    Object v11 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v10));
    Object v12 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v13 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.PreprocessorSymbolTable)v11),((com.google.javascript.jscomp.CheckLevel)v12));
    Object v14 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v8),((com.google.javascript.jscomp.NodeTraversal.Callback)v13));
    Object v15 = com.google.javascript.rhino.IR.continueNode();
    Object v16 = com.google.javascript.rhino.IR.continueNode();
    ((com.google.javascript.jscomp.ProcessClosurePrimitives)v4).visit(((com.google.javascript.jscomp.NodeTraversal)v14),((com.google.javascript.rhino.Node)v15),((com.google.javascript.rhino.Node)v16));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.rhino.IR.continueNode();
    Object v2 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v1));
    Object v3 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v4 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.PreprocessorSymbolTable)v2),((com.google.javascript.jscomp.CheckLevel)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = com.google.javascript.rhino.IR.continueNode();
    Object v8 = new com.google.javascript.jscomp.PreprocessorSymbolTable(((com.google.javascript.rhino.Node)v7));
    Object v9 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v10 = new com.google.javascript.jscomp.ProcessClosurePrimitives(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.PreprocessorSymbolTable)v8),((com.google.javascript.jscomp.CheckLevel)v9));
    Object v11 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.NodeTraversal.Callback)v10));
    Object v12 = ((com.google.javascript.jscomp.NodeTraversal)v11).hasScope();
    Object v13 = com.google.javascript.rhino.IR.continueNode();
    Object v14 = com.google.javascript.rhino.IR.continueNode();
    ((com.google.javascript.jscomp.ProcessClosurePrimitives)v4).visit(((com.google.javascript.jscomp.NodeTraversal)v11),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v14));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }
}
