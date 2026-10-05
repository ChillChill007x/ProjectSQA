package com.google.javascript.jscomp;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "PIPE";
    Object v2 = ((com.google.javascript.jscomp.Compiler)v0).parseTestCode(((java.lang.String)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getRoot();
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "$";
    Object v2 = "";
    Object v3 = new java.io.File(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.io.File)v3));
    Object v5 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v4));
    ((com.google.javascript.jscomp.Compiler)v0).addIncrementalSourceAst(((com.google.javascript.jscomp.JsAst)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "%";
    Object v2 = ((com.google.javascript.jscomp.Compiler)v0).newTracer(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getParserConfig();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.Compiler)v0).reportCodeChange();
    Object v1 = null;
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.JSSourceFile[]{null};
    Object v3 = new com.google.javascript.jscomp.JSModule[]{};
    Object v4 = new com.google.javascript.jscomp.CompilerOptions();
    Object v5 = ((com.google.javascript.jscomp.Compiler)v0).compile(((com.google.javascript.jscomp.JSSourceFile[])v2),((com.google.javascript.jscomp.JSModule[])v3),((com.google.javascript.jscomp.CompilerOptions)v4));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "w";
    Object v2 = ((com.google.javascript.jscomp.Compiler)v0).ensureLibraryInjected(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.Compiler)v0).endPass();
    Object v1 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getGlobalVarReferences();
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "$";
    Object v2 = "";
    Object v3 = new java.io.File(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.io.File)v3));
    Object v5 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v4));
    ((com.google.javascript.jscomp.JsAst)v5).clearAst();
    Object v6 = null;
    ((com.google.javascript.jscomp.Compiler)v0).replaceScript(((com.google.javascript.jscomp.JsAst)v5));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getTypeValidator();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "$";
    Object v2 = "";
    Object v3 = new java.io.File(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.io.File)v3));
    Object v5 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v4));
    Object v6 = ((com.google.javascript.jscomp.Compiler)v0).addNewSourceAst(((com.google.javascript.jscomp.JsAst)v5));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.CompilerOptions();
    Object v2 = new com.google.javascript.jscomp.DefaultPassConfig(((com.google.javascript.jscomp.CompilerOptions)v1));
    ((com.google.javascript.jscomp.Compiler)v0).setPassConfig(((com.google.javascript.jscomp.PassConfig)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.Compiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = "";
    Object v3 = ((com.google.javascript.jscomp.Compiler)v0).newExternInput(((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getErrorManager();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.Compiler)v0).optimize();
    Object v1 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = ((com.google.javascript.jscomp.Compiler)v0).parseTestCode(((java.lang.String)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "Joolean";
    Object v2 = "";
    Object v3 = com.google.javascript.jscomp.DiagnosticType.warning(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new java.lang.String[]{"j","%basename%"};
    Object v5 = com.google.javascript.jscomp.JSError.make(((com.google.javascript.jscomp.DiagnosticType)v3),((java.lang.String[])v4));
    ((com.google.javascript.jscomp.Compiler)v0).report(((com.google.javascript.jscomp.JSError)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = 1;
    Object v3 = ((com.google.javascript.jscomp.Compiler)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getTypedScopeCreator();
    Object v2 = ((com.google.javascript.jscomp.Compiler)v0).getParserConfig();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).parseInputs();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "$";
    Object v2 = "";
    Object v3 = new java.io.File(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = java.nio.charset.Charset.defaultCharset();
    Object v5 = com.google.javascript.jscomp.JSSourceFile.fromFile(((java.io.File)v3),((java.nio.charset.Charset)v4));
    Object v6 = new com.google.javascript.jscomp.JSModule[]{null,null};
    Object v7 = new com.google.javascript.jscomp.CompilerOptions();
    Object v8 = ((com.google.javascript.jscomp.Compiler)v0).compile(((com.google.javascript.jscomp.JSSourceFile)v5),((com.google.javascript.jscomp.JSModule[])v6),((com.google.javascript.jscomp.CompilerOptions)v7));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = -71.49832433584291D;
    ((com.google.javascript.jscomp.Compiler)v0).setProgress((((java.lang.Double)v1).doubleValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getErrorManager();
    Object v2 = ((com.google.javascript.jscomp.Compiler)v0).getReverseAbstractInterpreter();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.CompilerOptions();
    ((com.google.javascript.jscomp.Compiler)v0).initOptions(((com.google.javascript.jscomp.CompilerOptions)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ">";
    Object v2 = ((com.google.javascript.jscomp.Compiler)v0).ensureLibraryInjected(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).acceptEcmaScript5();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.CompilerOptions();
    Object v2 = new com.google.javascript.jscomp.DefaultPassConfig(((com.google.javascript.jscomp.CompilerOptions)v1));
    ((com.google.javascript.jscomp.Compiler)v0).setPassConfig(((com.google.javascript.jscomp.PassConfig)v2));
    Object v3 = null;
    Object v4 = ((com.google.javascript.jscomp.Compiler)v0).hasHaltingErrors();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "$";
    Object v2 = "";
    Object v3 = new java.io.File(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.io.File)v3));
    Object v5 = "$";
    Object v6 = "";
    Object v7 = new java.io.File(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = com.google.javascript.jscomp.SourceFile.fromFile(((java.io.File)v7));
    Object v9 = new com.google.javascript.jscomp.CompilerOptions();
    Object v10 = ((com.google.javascript.jscomp.Compiler)v0).compile(((com.google.javascript.jscomp.SourceFile)v4),((com.google.javascript.jscomp.SourceFile)v8),((com.google.javascript.jscomp.CompilerOptions)v9));
    Object v11 = "Joolean";
    Object v12 = "";
    Object v13 = com.google.javascript.jscomp.DiagnosticType.warning(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = new java.lang.String[]{"j","%basename%"};
    Object v15 = com.google.javascript.jscomp.JSError.make(((com.google.javascript.jscomp.DiagnosticType)v13),((java.lang.String[])v14));
    ((com.google.javascript.jscomp.Compiler)v0).report(((com.google.javascript.jscomp.JSError)v15));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.Compiler)v0).initInputsByIdMap();
    Object v1 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "&";
    Object v2 = new com.google.javascript.jscomp.JSModule(((java.lang.String)v1));
    Object v3 = ((com.google.javascript.jscomp.JSModule)v2).getProvides();
    Object v4 = ((com.google.javascript.jscomp.Compiler)v0).getNodeForCodeInsertion(((com.google.javascript.jscomp.JSModule)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "removeUnusedVars";
    Object v2 = ((com.google.javascript.jscomp.Compiler)v0).newExternInput(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    ((com.google.javascript.jscomp.Compiler)v0).setHasRegExpGlobalReferences((((java.lang.Boolean)v1).booleanValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = ((com.google.javascript.jscomp.Compiler)v0).loadLibraryCode(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "&";
    Object v2 = new com.google.javascript.jscomp.JSModule(((java.lang.String)v1));
    Object v3 = ((com.google.javascript.jscomp.Compiler)v0).getNodeForCodeInsertion(((com.google.javascript.jscomp.JSModule)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "Z";
    Object v2 = "-";
    Object v3 = new com.google.javascript.jscomp.DataFlowAnalysis.MaxIterationsExceededException(((java.lang.String)v2));
    ((com.google.javascript.jscomp.Compiler)v0).throwInternalError(((java.lang.String)v1),((java.lang.Exception)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getDegenerateModuleGraph();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getAstDotGraph();
    Object v2 = ((com.google.javascript.jscomp.Compiler)v0).getPassConfig();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.CompilerOptions();
    ((com.google.javascript.jscomp.Compiler)v0).initOptions(((com.google.javascript.jscomp.CompilerOptions)v1));
    Object v2 = null;
    Object v3 = ((com.google.javascript.jscomp.Compiler)v0).buildKnownSymbolTable();
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.CodeChangeHandler.RecentChange();
    ((com.google.javascript.jscomp.Compiler)v0).removeChangeHandler(((com.google.javascript.jscomp.CodeChangeHandler)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "$";
    Object v2 = "";
    Object v3 = new java.io.File(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.io.File)v3));
    Object v5 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v4));
    ((com.google.javascript.jscomp.Compiler)v0).addNewScript(((com.google.javascript.jscomp.JsAst)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getCodingConvention();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.Compiler)v0).initCompilerOptionsIfTesting();
    Object v1 = null;
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.CompilerOptions();
    ((com.google.javascript.jscomp.Compiler)v0).initOptions(((com.google.javascript.jscomp.CompilerOptions)v1));
    Object v2 = null;
    Object v3 = "$";
    Object v4 = "";
    Object v5 = new java.io.File(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = com.google.javascript.jscomp.SourceFile.fromFile(((java.io.File)v5));
    Object v7 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v6));
    ((com.google.javascript.jscomp.Compiler)v0).replaceScript(((com.google.javascript.jscomp.JsAst)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = "-";
    Object v3 = new com.google.javascript.jscomp.DataFlowAnalysis.MaxIterationsExceededException(((java.lang.String)v2));
    ((com.google.javascript.jscomp.Compiler)v0).throwInternalError(((java.lang.String)v1),((java.lang.Exception)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "~";
    Object v2 = "";
    Object v3 = new com.google.javascript.jscomp.Tracer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ":";
    ((com.google.javascript.jscomp.Compiler)v0).stopTracer(((com.google.javascript.jscomp.Tracer)v3),((java.lang.String)v4));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = ((com.google.javascript.jscomp.Compiler)v0).newTracer(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = new com.google.javascript.rhino.InputId(((java.lang.String)v1));
    ((com.google.javascript.jscomp.Compiler)v0).removeExternInput(((com.google.javascript.rhino.InputId)v2));
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getState();
    Object v2 = new com.google.javascript.jscomp.CompilerOptions();
    ((com.google.javascript.jscomp.Compiler)v0).initOptions(((com.google.javascript.jscomp.CompilerOptions)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = java.util.Map.of();
    Object v2 = "O";
    Object v3 = java.net.URI.create(((java.lang.String)v2));
    Object v4 = java.nio.charset.Charset.defaultCharset();
    Object v5 = ((java.util.Map)v1).getOrDefault(((java.lang.Object)v3),((java.lang.Object)v4));
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = "";
    Object v8 = ((com.google.javascript.jscomp.Compiler)v6).parseTestCode(((java.lang.String)v7));
    ((com.google.javascript.jscomp.Compiler)v0).updateGlobalVarReferences(((java.util.Map)v1),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "\">";
    Object v2 = 8;
    Object v3 = ((com.google.javascript.jscomp.Compiler)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.Compiler)v0).removeTryCatchFinally();
    Object v1 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.Compiler)v0).disableThreads();
    Object v1 = null;
    Object v2 = ((com.google.javascript.jscomp.Compiler)v0).isInliningForbidden();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "N";
    ((com.google.javascript.jscomp.Compiler)v0).startPass(((java.lang.String)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getErrorManager();
    Object v2 = ((com.google.javascript.jscomp.Compiler)v0).getParserConfig();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = java.util.Map.of();
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = "";
    Object v4 = ((com.google.javascript.jscomp.Compiler)v2).parseTestCode(((java.lang.String)v3));
    ((com.google.javascript.jscomp.Compiler)v0).updateGlobalVarReferences(((java.util.Map)v1),((com.google.javascript.rhino.Node)v4));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    ((com.google.javascript.jscomp.Compiler)v0).startPass(((java.lang.String)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.JSSourceFile[]{null};
    Object v2 = new com.google.javascript.jscomp.JSSourceFile[]{null};
    Object v3 = new com.google.javascript.jscomp.CompilerOptions();
    Object v4 = false;
    ((com.google.javascript.jscomp.CompilerOptions)v3).setSpecializeInitialModule((((java.lang.Boolean)v4).booleanValue()));
    Object v5 = null;
    Object v6 = ((com.google.javascript.jscomp.Compiler)v0).compile(((com.google.javascript.jscomp.JSSourceFile[])v1),((com.google.javascript.jscomp.JSSourceFile[])v2),((com.google.javascript.jscomp.CompilerOptions)v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.Compiler)v0).check();
    Object v1 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.Compiler)v0).processAMDAndCommonJSModules();
    Object v1 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "$";
    Object v2 = "";
    Object v3 = new java.io.File(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.io.File)v3));
    Object v5 = ((com.google.javascript.jscomp.Compiler)v0).parse(((com.google.javascript.jscomp.SourceFile)v4));
    Object v6 = ((com.google.javascript.jscomp.Compiler)v0).getAstDotGraph();
    org.junit.Assert.assertEquals((Object)(""), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getTypeRegistry();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "$";
    Object v2 = "";
    Object v3 = new java.io.File(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.io.File)v3));
    Object v5 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v4));
    ((com.google.javascript.jscomp.JsAst)v5).clearAst();
    Object v6 = null;
    ((com.google.javascript.jscomp.Compiler)v0).addIncrementalSourceAst(((com.google.javascript.jscomp.JsAst)v5));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "&";
    Object v2 = new com.google.javascript.jscomp.JSModule(((java.lang.String)v1));
    Object v3 = ((com.google.javascript.jscomp.Compiler)v0).toSource(((com.google.javascript.jscomp.JSModule)v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getPassConfig();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.Compiler();
    Object v2 = ((com.google.javascript.jscomp.Compiler)v1).getPassConfig();
    ((com.google.javascript.jscomp.Compiler)v0).setPassConfig(((com.google.javascript.jscomp.PassConfig)v2));
    Object v3 = null;
    Object v4 = "";
    Object v5 = 0;
    Object v6 = ((com.google.javascript.jscomp.Compiler)v0).getSourceLine(((java.lang.String)v4),(((java.lang.Integer)v5).intValue()));
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).ensureDefaultPassConfig();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = new com.google.javascript.rhino.InputId(((java.lang.String)v1));
    Object v3 = ((com.google.javascript.jscomp.Compiler)v0).getInput(((com.google.javascript.rhino.InputId)v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).isInliningForbidden();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getExternsForTesting();
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getSynthesizedExternsInput();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getAstDotGraph();
    ((com.google.javascript.jscomp.Compiler)v0).initCompilerOptionsIfTesting();
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getTypedScopeCreator();
    Object v2 = ((com.google.javascript.jscomp.Compiler)v0).getDegenerateModuleGraph();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "$";
    Object v2 = "";
    Object v3 = new java.io.File(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.io.File)v3));
    Object v5 = new com.google.javascript.jscomp.JSSourceFile[]{};
    Object v6 = new com.google.javascript.jscomp.CompilerOptions();
    Object v7 = ((com.google.javascript.jscomp.Compiler)v0).compile(((com.google.javascript.jscomp.SourceFile)v4),((com.google.javascript.jscomp.JSSourceFile[])v5),((com.google.javascript.jscomp.CompilerOptions)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getWarningCount();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "\"";
    Object v2 = ((com.google.javascript.jscomp.Compiler)v0).parseTestCode(((java.lang.String)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "$";
    Object v2 = "";
    Object v3 = new java.io.File(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.io.File)v3));
    Object v5 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v4));
    Object v6 = ((com.google.javascript.jscomp.Compiler)v0).replaceIncrementalSourceAst(((com.google.javascript.jscomp.JsAst)v5));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getAstDotGraph();
    Object v2 = ((com.google.javascript.jscomp.Compiler)v0).getCodingConvention();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "$";
    Object v2 = "";
    Object v3 = new java.io.File(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = java.nio.charset.Charset.defaultCharset();
    Object v5 = com.google.javascript.jscomp.JSSourceFile.fromFile(((java.io.File)v3),((java.nio.charset.Charset)v4));
    Object v6 = new com.google.javascript.jscomp.JSModule[]{};
    Object v7 = new com.google.javascript.jscomp.CompilerOptions();
    Object v8 = ((com.google.javascript.jscomp.Compiler)v0).compile(((com.google.javascript.jscomp.JSSourceFile)v5),((com.google.javascript.jscomp.JSModule[])v6),((com.google.javascript.jscomp.CompilerOptions)v7));
    Object v9 = "B";
    Object v10 = ((com.google.javascript.jscomp.Compiler)v0).newExternInput(((java.lang.String)v9));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).toSourceArray();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ",H";
    ((com.google.javascript.jscomp.Compiler)v0).startPass(((java.lang.String)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = -3.2684954551469616D;
    ((com.google.javascript.jscomp.Compiler)v0).setProgress((((java.lang.Double)v1).doubleValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "b";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.Compiler)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = "$";
    Object v5 = "";
    Object v6 = new java.io.File(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = com.google.javascript.jscomp.SourceFile.fromFile(((java.io.File)v6));
    Object v8 = ((com.google.javascript.jscomp.Compiler)v0).parse(((com.google.javascript.jscomp.SourceFile)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getInputsInOrder();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).buildKnownSymbolTable();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.Compiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = ((com.google.javascript.jscomp.Compiler)v0).getErrorManager();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
    Object v2 = -16;
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = "\"";
    Object v5 = ((com.google.javascript.jscomp.Compiler)v3).parseTestCode(((java.lang.String)v4));
    ((com.google.javascript.jscomp.Compiler)v0).toSource(((com.google.javascript.jscomp.Compiler.CodeBuilder)v1),(((java.lang.Integer)v2).intValue()),((com.google.javascript.rhino.Node)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).hasHaltingErrors();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = 19;
    Object v3 = ((com.google.javascript.jscomp.Compiler)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.Compiler();
    Object v2 = ((com.google.javascript.jscomp.Compiler)v1).getPassConfig();
    ((com.google.javascript.jscomp.Compiler)v0).setPassConfig(((com.google.javascript.jscomp.PassConfig)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "$";
    Object v2 = "";
    Object v3 = new java.io.File(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.io.File)v3));
    Object v5 = ((com.google.javascript.jscomp.Compiler)v0).parse(((com.google.javascript.jscomp.SourceFile)v4));
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = "";
    Object v8 = ((com.google.javascript.jscomp.Compiler)v6).parseTestCode(((java.lang.String)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = "";
    Object v11 = ((com.google.javascript.jscomp.Compiler)v9).parseTestCode(((java.lang.String)v10));
    Object v12 = ((com.google.javascript.jscomp.Compiler)v0).areNodesEqualForInlining(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v11));
    org.junit.Assert.assertEquals((Object)(true), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.Compiler)v0).disableThreads();
    Object v1 = null;
    Object v2 = "N";
    Object v3 = "-";
    Object v4 = new com.google.javascript.jscomp.DataFlowAnalysis.MaxIterationsExceededException(((java.lang.String)v3));
    ((com.google.javascript.jscomp.Compiler)v0).throwInternalError(((java.lang.String)v2),((java.lang.Exception)v4));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getErrorManager();
    Object v2 = ((com.google.javascript.jscomp.Compiler)v0).getCodingConvention();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.Compiler();
    Object v2 = "\"";
    Object v3 = ((com.google.javascript.jscomp.Compiler)v1).parseTestCode(((java.lang.String)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = "";
    Object v6 = ((com.google.javascript.jscomp.Compiler)v4).parseTestCode(((java.lang.String)v5));
    Object v7 = ((com.google.javascript.jscomp.Compiler)v0).areNodesEqualForInlining(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.Node)v6));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ":";
    ((com.google.javascript.jscomp.Compiler)v0).startPass(((java.lang.String)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ":";
    Object v2 = ((com.google.javascript.jscomp.Compiler)v0).parseTestCode(((java.lang.String)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "$";
    Object v2 = "";
    Object v3 = new java.io.File(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.io.File)v3));
    Object v5 = new com.google.javascript.jscomp.JSSourceFile[]{null,null,null};
    Object v6 = new com.google.javascript.jscomp.CompilerOptions();
    Object v7 = true;
    ((com.google.javascript.jscomp.CompilerOptions)v6).setRemoveUnusedPrototypeProperties((((java.lang.Boolean)v7).booleanValue()));
    Object v8 = null;
    Object v9 = ((com.google.javascript.jscomp.Compiler)v0).compile(((com.google.javascript.jscomp.SourceFile)v4),((com.google.javascript.jscomp.JSSourceFile[])v5),((com.google.javascript.jscomp.CompilerOptions)v6));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).createPassConfigInternal();
    org.junit.Assert.assertNotNull(v1);
  }
}
