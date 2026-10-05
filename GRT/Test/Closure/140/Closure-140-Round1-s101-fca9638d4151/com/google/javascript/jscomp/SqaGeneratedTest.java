package com.google.javascript.jscomp;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.Compiler)v0).optimize();
    Object v1 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.Compiler)v0).initCompilerOptionsIfTesting();
    Object v1 = null;
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "NaN";
    Object v2 = -9;
    Object v3 = -22;
    Object v4 = "";
    Object v5 = "";
    Object v6 = com.google.javascript.jscomp.DiagnosticType.warning(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new java.lang.String[]{"4","?","="};
    Object v8 = com.google.javascript.jscomp.JSError.make(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.jscomp.DiagnosticType)v6),((java.lang.String[])v7));
    ((com.google.javascript.jscomp.Compiler)v0).report(((com.google.javascript.jscomp.JSError)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getAstDotGraph();
    org.junit.Assert.assertEquals((Object)(""), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "Arr";
    Object v2 = "JSC_WITH_DISALLOWED";
    Object v3 = java.io.InputStream.nullInputStream();
    Object v4 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v1),((java.lang.String)v2),((java.io.InputStream)v3));
    Object v5 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v4));
    ((com.google.javascript.jscomp.Compiler)v0).addIncrementalSourceAst(((com.google.javascript.jscomp.JsAst)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getParserConfig();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "D";
    Object v2 = ((com.google.javascript.jscomp.Compiler)v0).newTracer(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.CodeChangeHandler.RecentChange();
    ((com.google.javascript.jscomp.Compiler)v0).addChangeHandler(((com.google.javascript.jscomp.CodeChangeHandler)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getCodingConvention();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).hasHaltingErrors();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "call";
    Object v2 = new java.io.File(((java.lang.String)v1));
    Object v3 = com.google.javascript.jscomp.JSSourceFile.fromFile(((java.io.File)v2));
    Object v4 = ((com.google.javascript.jscomp.Compiler)v0).parse(((com.google.javascript.jscomp.JSSourceFile)v3));
    Object v5 = ((com.google.javascript.jscomp.Compiler)v0).getPassConfig();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getReverseAbstractInterpreter();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.Compiler)v0).setUnnormalized();
    Object v1 = null;
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getTypeRegistry();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "Unknown module: '";
    Object v2 = ((com.google.javascript.jscomp.Compiler)v0).parseTestCode(((java.lang.String)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "call";
    Object v2 = new java.io.File(((java.lang.String)v1));
    Object v3 = com.google.javascript.jscomp.JSSourceFile.fromFile(((java.io.File)v2));
    Object v4 = ((com.google.javascript.jscomp.Compiler)v0).parse(((com.google.javascript.jscomp.JSSourceFile)v3));
    Object v5 = "call";
    Object v6 = new java.io.File(((java.lang.String)v5));
    Object v7 = com.google.javascript.jscomp.JSSourceFile.fromFile(((java.io.File)v6));
    Object v8 = ((com.google.javascript.jscomp.Compiler)v0).parse(((com.google.javascript.jscomp.JSSourceFile)v7));
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "call";
    Object v2 = new java.io.File(((java.lang.String)v1));
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = new java.io.PrintStream(((java.io.File)v2),((java.nio.charset.Charset)v3));
    Object v5 = new com.google.javascript.jscomp.PrintStreamErrorManager(((java.io.PrintStream)v4));
    ((com.google.javascript.jscomp.Compiler)v0).setErrorManager(((com.google.javascript.jscomp.ErrorManager)v5));
    Object v6 = null;
    ((com.google.javascript.jscomp.Compiler)v0).check();
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "^";
    Object v2 = ((com.google.javascript.jscomp.Compiler)v0).newExternInput(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.Compiler();
    Object v2 = "Unknown module: '";
    Object v3 = ((com.google.javascript.jscomp.Compiler)v1).parseTestCode(((java.lang.String)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = "Unknown module: '";
    Object v6 = ((com.google.javascript.jscomp.Compiler)v4).parseTestCode(((java.lang.String)v5));
    Object v7 = ((com.google.javascript.jscomp.Compiler)v0).areNodesEqualForInlining(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.Node)v6));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getPassConfig();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "call";
    Object v2 = new java.io.File(((java.lang.String)v1));
    Object v3 = com.google.javascript.jscomp.JSSourceFile.fromFile(((java.io.File)v2));
    Object v4 = ((com.google.javascript.jscomp.Compiler)v0).parse(((com.google.javascript.jscomp.JSSourceFile)v3));
    Object v5 = ".I";
    ((com.google.javascript.jscomp.Compiler)v0).addToDebugLog(((java.lang.String)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getUniqueNameIdSupplier();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getTypeRegistry();
    Object v2 = ".prototypH.";
    Object v3 = ((com.google.javascript.jscomp.Compiler)v0).getInput(((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getTopScope();
    ((com.google.javascript.jscomp.Compiler)v0).initCompilerOptionsIfTesting();
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getState();
    Object v2 = ((com.google.javascript.jscomp.Compiler)v0).toSource();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "nulS";
    Object v2 = new com.google.javascript.jscomp.JSModule(((java.lang.String)v1));
    Object v3 = ((com.google.javascript.jscomp.Compiler)v0).getNodeForCodeInsertion(((com.google.javascript.jscomp.JSModule)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).parseInputs();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.Compiler)v0).initInputsByNameMap();
    Object v1 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "call";
    Object v2 = new java.io.File(((java.lang.String)v1));
    Object v3 = com.google.javascript.jscomp.JSSourceFile.fromFile(((java.io.File)v2));
    Object v4 = "call";
    Object v5 = new java.io.File(((java.lang.String)v4));
    Object v6 = com.google.javascript.jscomp.JSSourceFile.fromFile(((java.io.File)v5));
    Object v7 = new com.google.javascript.jscomp.CompilerOptions();
    Object v8 = ((com.google.javascript.jscomp.Compiler)v0).compile(((com.google.javascript.jscomp.JSSourceFile)v3),((com.google.javascript.jscomp.JSSourceFile)v6),((com.google.javascript.jscomp.CompilerOptions)v7));
    Object v9 = "prototy`pe";
    Object v10 = "X";
    Object v11 = new com.google.javascript.jscomp.DataFlowAnalysis.MaxIterationsExceededException(((java.lang.String)v10));
    ((com.google.javascript.jscomp.Compiler)v0).throwInternalError(((java.lang.String)v9),((java.lang.Exception)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "call";
    Object v2 = new java.io.File(((java.lang.String)v1));
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = new java.io.PrintStream(((java.io.File)v2),((java.nio.charset.Charset)v3));
    Object v5 = new com.google.javascript.jscomp.PrintStreamErrorManager(((java.io.PrintStream)v4));
    ((com.google.javascript.jscomp.Compiler)v0).setErrorManager(((com.google.javascript.jscomp.ErrorManager)v5));
    Object v6 = null;
    Object v7 = "0";
    Object v8 = ((com.google.javascript.jscomp.Compiler)v0).newExternInput(((java.lang.String)v7));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.JSSourceFile[]{};
    Object v2 = new com.google.javascript.jscomp.JSModule[]{};
    Object v3 = new com.google.javascript.jscomp.CompilerOptions();
    ((com.google.javascript.jscomp.Compiler)v0).init(((com.google.javascript.jscomp.JSSourceFile[])v1),((com.google.javascript.jscomp.JSModule[])v2),((com.google.javascript.jscomp.CompilerOptions)v3));
    Object v4 = null;
    ((com.google.javascript.jscomp.Compiler)v0).optimize();
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = "call";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = java.nio.charset.Charset.defaultCharset();
    Object v3 = new java.io.PrintStream(((java.io.File)v1),((java.nio.charset.Charset)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = "call";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = java.nio.charset.Charset.defaultCharset();
    Object v3 = new java.io.PrintStream(((java.io.File)v1),((java.nio.charset.Charset)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = "Unknown module: '";
    Object v7 = ((com.google.javascript.jscomp.Compiler)v5).parseTestCode(((java.lang.String)v6));
    Object v8 = ((com.google.javascript.rhino.Node)v7).getQualifiedName();
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = "Unknown module: '";
    Object v11 = ((com.google.javascript.jscomp.Compiler)v9).parseTestCode(((java.lang.String)v10));
    Object v12 = ((com.google.javascript.jscomp.Compiler)v4).areNodesEqualForInlining(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v11));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = "call";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = java.nio.charset.Charset.defaultCharset();
    Object v3 = new java.io.PrintStream(((java.io.File)v1),((java.nio.charset.Charset)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v3));
    Object v5 = "call";
    Object v6 = new java.io.File(((java.lang.String)v5));
    Object v7 = java.nio.charset.Charset.defaultCharset();
    Object v8 = new java.io.PrintStream(((java.io.File)v6),((java.nio.charset.Charset)v7));
    Object v9 = new com.google.javascript.jscomp.PrintStreamErrorManager(((java.io.PrintStream)v8));
    ((com.google.javascript.jscomp.Compiler)v4).setErrorManager(((com.google.javascript.jscomp.ErrorManager)v9));
    Object v10 = null;
    ((com.google.javascript.jscomp.Compiler)v4).initInputsByNameMap();
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = "call";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = java.nio.charset.Charset.defaultCharset();
    Object v3 = new java.io.PrintStream(((java.io.File)v1),((java.nio.charset.Charset)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v3));
    Object v5 = ((com.google.javascript.jscomp.Compiler)v4).isInliningForbidden();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = "call";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = java.nio.charset.Charset.defaultCharset();
    Object v3 = new java.io.PrintStream(((java.io.File)v1),((java.nio.charset.Charset)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v3));
    Object v5 = ((com.google.javascript.jscomp.Compiler)v4).getAstDotGraph();
    org.junit.Assert.assertEquals((Object)(""), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = "call";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = java.nio.charset.Charset.defaultCharset();
    Object v3 = new java.io.PrintStream(((java.io.File)v1),((java.nio.charset.Charset)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v3));
    Object v5 = "c";
    ((com.google.javascript.jscomp.Compiler)v4).startPass(((java.lang.String)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = "call";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = java.nio.charset.Charset.defaultCharset();
    Object v3 = new java.io.PrintStream(((java.io.File)v1),((java.nio.charset.Charset)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v3));
    ((com.google.javascript.jscomp.Compiler)v4).endPass();
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = "call";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = java.nio.charset.Charset.defaultCharset();
    Object v3 = new java.io.PrintStream(((java.io.File)v1),((java.nio.charset.Charset)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v3));
    Object v5 = ")";
    Object v6 = ((com.google.javascript.jscomp.Compiler)v4).parseTestCode(((java.lang.String)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = "call";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = java.nio.charset.Charset.defaultCharset();
    Object v3 = new java.io.PrintStream(((java.io.File)v1),((java.nio.charset.Charset)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v3));
    Object v5 = "call";
    Object v6 = new java.io.File(((java.lang.String)v5));
    Object v7 = com.google.javascript.jscomp.JSSourceFile.fromFile(((java.io.File)v6));
    Object v8 = new com.google.javascript.jscomp.JSSourceFile[]{};
    Object v9 = new com.google.javascript.jscomp.CompilerOptions();
    Object v10 = ((com.google.javascript.jscomp.Compiler)v4).compile(((com.google.javascript.jscomp.JSSourceFile)v7),((com.google.javascript.jscomp.JSSourceFile[])v8),((com.google.javascript.jscomp.CompilerOptions)v9));
    Object v11 = "Arr";
    Object v12 = "JSC_WITH_DISALLOWED";
    Object v13 = java.io.InputStream.nullInputStream();
    Object v14 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v11),((java.lang.String)v12),((java.io.InputStream)v13));
    Object v15 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v14));
    ((com.google.javascript.jscomp.JsAst)v15).clearAst();
    Object v16 = null;
    ((com.google.javascript.jscomp.Compiler)v4).addIncrementalSourceAst(((com.google.javascript.jscomp.JsAst)v15));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = "call";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = java.nio.charset.Charset.defaultCharset();
    Object v3 = new java.io.PrintStream(((java.io.File)v1),((java.nio.charset.Charset)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v3));
    Object v5 = "call";
    Object v6 = new java.io.File(((java.lang.String)v5));
    Object v7 = com.google.javascript.jscomp.JSSourceFile.fromFile(((java.io.File)v6));
    Object v8 = ((com.google.javascript.jscomp.Compiler)v4).parse(((com.google.javascript.jscomp.JSSourceFile)v7));
    Object v9 = new com.google.javascript.jscomp.CompilerOptions();
    ((com.google.javascript.jscomp.Compiler)v4).initOptions(((com.google.javascript.jscomp.CompilerOptions)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = "call";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = java.nio.charset.Charset.defaultCharset();
    Object v3 = new java.io.PrintStream(((java.io.File)v1),((java.nio.charset.Charset)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v3));
    ((com.google.javascript.jscomp.Compiler)v4).optimize();
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = "call";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = java.nio.charset.Charset.defaultCharset();
    Object v3 = new java.io.PrintStream(((java.io.File)v1),((java.nio.charset.Charset)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v3));
    Object v5 = ((com.google.javascript.jscomp.Compiler)v4).isTypeCheckingEnabled();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = "call";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = java.nio.charset.Charset.defaultCharset();
    Object v3 = new java.io.PrintStream(((java.io.File)v1),((java.nio.charset.Charset)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v3));
    Object v5 = "";
    Object v6 = ((com.google.javascript.jscomp.Compiler)v4).newExternInput(((java.lang.String)v5));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = "call";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = java.nio.charset.Charset.defaultCharset();
    Object v3 = new java.io.PrintStream(((java.io.File)v1),((java.nio.charset.Charset)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v3));
    Object v5 = " ";
    Object v6 = 1;
    Object v7 = ((com.google.javascript.jscomp.Compiler)v4).getSourceRegion(((java.lang.String)v5),(((java.lang.Integer)v6).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = "call";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = java.nio.charset.Charset.defaultCharset();
    Object v3 = new java.io.PrintStream(((java.io.File)v1),((java.nio.charset.Charset)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v3));
    Object v5 = ((com.google.javascript.jscomp.Compiler)v4).getTypeRegistry();
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = ((com.google.javascript.jscomp.Compiler)v6).getPassConfig();
    ((com.google.javascript.jscomp.Compiler)v4).setPassConfig(((com.google.javascript.jscomp.PassConfig)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = "call";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = java.nio.charset.Charset.defaultCharset();
    Object v3 = new java.io.PrintStream(((java.io.File)v1),((java.nio.charset.Charset)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v3));
    Object v5 = " roperties.";
    Object v6 = ((com.google.javascript.jscomp.Compiler)v4).parseTestCode(((java.lang.String)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = "call";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = java.nio.charset.Charset.defaultCharset();
    Object v3 = new java.io.PrintStream(((java.io.File)v1),((java.nio.charset.Charset)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v3));
    ((com.google.javascript.jscomp.Compiler)v4).initInputsByNameMap();
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = "call";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = java.nio.charset.Charset.defaultCharset();
    Object v3 = new java.io.PrintStream(((java.io.File)v1),((java.nio.charset.Charset)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v3));
    Object v5 = "";
    Object v6 = 0;
    Object v7 = ((com.google.javascript.jscomp.Compiler)v4).getSourceLine(((java.lang.String)v5),(((java.lang.Integer)v6).intValue()));
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = "call";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = java.nio.charset.Charset.defaultCharset();
    Object v3 = new java.io.PrintStream(((java.io.File)v1),((java.nio.charset.Charset)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v3));
    ((com.google.javascript.jscomp.Compiler)v4).disableThreads();
    Object v5 = null;
    Object v6 = "nulS";
    Object v7 = new com.google.javascript.jscomp.JSModule(((java.lang.String)v6));
    Object v8 = ((com.google.javascript.jscomp.Compiler)v4).getNodeForCodeInsertion(((com.google.javascript.jscomp.JSModule)v7));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = "call";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = java.nio.charset.Charset.defaultCharset();
    Object v3 = new java.io.PrintStream(((java.io.File)v1),((java.nio.charset.Charset)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v3));
    Object v5 = "} ";
    ((com.google.javascript.jscomp.Compiler)v4).startPass(((java.lang.String)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = "call";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = java.nio.charset.Charset.defaultCharset();
    Object v3 = new java.io.PrintStream(((java.io.File)v1),((java.nio.charset.Charset)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v3));
    Object v5 = new com.google.javascript.jscomp.JSSourceFile[]{};
    Object v6 = new com.google.javascript.jscomp.JSSourceFile[]{null,null,null};
    Object v7 = new com.google.javascript.jscomp.CompilerOptions();
    Object v8 = ((com.google.javascript.jscomp.Compiler)v4).compile(((com.google.javascript.jscomp.JSSourceFile[])v5),((com.google.javascript.jscomp.JSSourceFile[])v6),((com.google.javascript.jscomp.CompilerOptions)v7));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = "call";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = java.nio.charset.Charset.defaultCharset();
    Object v3 = new java.io.PrintStream(((java.io.File)v1),((java.nio.charset.Charset)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v3));
    ((com.google.javascript.jscomp.Compiler)v4).reportCodeChange();
    Object v5 = null;
    ((com.google.javascript.jscomp.Compiler)v4).check();
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = "call";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = java.nio.charset.Charset.defaultCharset();
    Object v3 = new java.io.PrintStream(((java.io.File)v1),((java.nio.charset.Charset)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v3));
    Object v5 = ((com.google.javascript.jscomp.Compiler)v4).getErrorManager();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = "call";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = java.nio.charset.Charset.defaultCharset();
    Object v3 = new java.io.PrintStream(((java.io.File)v1),((java.nio.charset.Charset)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v3));
    Object v5 = new com.google.javascript.jscomp.JSSourceFile[]{null,null,null};
    Object v6 = new com.google.javascript.jscomp.JSModule[]{null};
    Object v7 = new com.google.javascript.jscomp.CompilerOptions();
    Object v8 = ((com.google.javascript.jscomp.Compiler)v4).compile(((com.google.javascript.jscomp.JSSourceFile[])v5),((com.google.javascript.jscomp.JSModule[])v6),((com.google.javascript.jscomp.CompilerOptions)v7));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = "call";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = java.nio.charset.Charset.defaultCharset();
    Object v3 = new java.io.PrintStream(((java.io.File)v1),((java.nio.charset.Charset)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v3));
    Object v5 = ((com.google.javascript.jscomp.Compiler)v4).getPassConfig();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = "call";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = java.nio.charset.Charset.defaultCharset();
    Object v3 = new java.io.PrintStream(((java.io.File)v1),((java.nio.charset.Charset)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = ((com.google.javascript.jscomp.Compiler)v5).getPassConfig();
    ((com.google.javascript.jscomp.Compiler)v4).setPassConfig(((com.google.javascript.jscomp.PassConfig)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = "call";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = java.nio.charset.Charset.defaultCharset();
    Object v3 = new java.io.PrintStream(((java.io.File)v1),((java.nio.charset.Charset)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v3));
    Object v5 = ((com.google.javascript.jscomp.Compiler)v4).parseInputs();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = "call";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = java.nio.charset.Charset.defaultCharset();
    Object v3 = new java.io.PrintStream(((java.io.File)v1),((java.nio.charset.Charset)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v3));
    ((com.google.javascript.jscomp.Compiler)v4).reportCodeChange();
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = "call";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = java.nio.charset.Charset.defaultCharset();
    Object v3 = new java.io.PrintStream(((java.io.File)v1),((java.nio.charset.Charset)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v3));
    Object v5 = ((com.google.javascript.jscomp.Compiler)v4).acquireSymbolTable();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = "call";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = java.nio.charset.Charset.defaultCharset();
    Object v3 = new java.io.PrintStream(((java.io.File)v1),((java.nio.charset.Charset)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v3));
    Object v5 = " is not annotated as constantB";
    Object v6 = 1;
    Object v7 = ((com.google.javascript.jscomp.Compiler)v4).getSourceLine(((java.lang.String)v5),(((java.lang.Integer)v6).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = "call";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = java.nio.charset.Charset.defaultCharset();
    Object v3 = new java.io.PrintStream(((java.io.File)v1),((java.nio.charset.Charset)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v3));
    Object v5 = "]";
    Object v6 = "X";
    Object v7 = new com.google.javascript.jscomp.DataFlowAnalysis.MaxIterationsExceededException(((java.lang.String)v6));
    ((com.google.javascript.jscomp.Compiler)v4).throwInternalError(((java.lang.String)v5),((java.lang.Exception)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = "call";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = java.nio.charset.Charset.defaultCharset();
    Object v3 = new java.io.PrintStream(((java.io.File)v1),((java.nio.charset.Charset)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v3));
    Object v5 = ((com.google.javascript.jscomp.Compiler)v4).getTypeRegistry();
    Object v6 = new com.google.javascript.jscomp.CodeChangeHandler.RecentChange();
    ((com.google.javascript.jscomp.CodeChangeHandler)v6).reportChange();
    Object v7 = null;
    ((com.google.javascript.jscomp.Compiler)v4).addChangeHandler(((com.google.javascript.jscomp.CodeChangeHandler)v6));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = "call";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = java.nio.charset.Charset.defaultCharset();
    Object v3 = new java.io.PrintStream(((java.io.File)v1),((java.nio.charset.Charset)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v3));
    Object v5 = new com.google.javascript.jscomp.CodeChangeHandler.RecentChange();
    Object v6 = "whil(";
    Object v7 = com.google.javascript.jscomp.Tracer.shortName(((java.lang.Object)v5),((java.lang.String)v6));
    Object v8 = "6";
    ((com.google.javascript.jscomp.Compiler)v4).stopTracer(((com.google.javascript.jscomp.Tracer)v7),((java.lang.String)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = "call";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = java.nio.charset.Charset.defaultCharset();
    Object v3 = new java.io.PrintStream(((java.io.File)v1),((java.nio.charset.Charset)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v3));
    Object v5 = "call";
    Object v6 = new java.io.File(((java.lang.String)v5));
    Object v7 = java.nio.charset.Charset.defaultCharset();
    Object v8 = new java.io.PrintStream(((java.io.File)v6),((java.nio.charset.Charset)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v8));
    Object v10 = " roperties.";
    Object v11 = ((com.google.javascript.jscomp.Compiler)v9).parseTestCode(((java.lang.String)v10));
    ((com.google.javascript.jscomp.Compiler)v4).prepareAst(((com.google.javascript.rhino.Node)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = "call";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = java.nio.charset.Charset.defaultCharset();
    Object v3 = new java.io.PrintStream(((java.io.File)v1),((java.nio.charset.Charset)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v3));
    Object v5 = ((com.google.javascript.jscomp.Compiler)v4).hasHaltingErrors();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = "call";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = java.nio.charset.Charset.defaultCharset();
    Object v3 = new java.io.PrintStream(((java.io.File)v1),((java.nio.charset.Charset)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v3));
    Object v5 = "call";
    Object v6 = new java.io.File(((java.lang.String)v5));
    Object v7 = com.google.javascript.jscomp.JSSourceFile.fromFile(((java.io.File)v6));
    Object v8 = "call";
    Object v9 = new java.io.File(((java.lang.String)v8));
    Object v10 = com.google.javascript.jscomp.JSSourceFile.fromFile(((java.io.File)v9));
    Object v11 = new com.google.javascript.jscomp.CompilerOptions();
    Object v12 = ((com.google.javascript.jscomp.Compiler)v4).compile(((com.google.javascript.jscomp.JSSourceFile)v7),((com.google.javascript.jscomp.JSSourceFile)v10),((com.google.javascript.jscomp.CompilerOptions)v11));
    Object v13 = "";
    Object v14 = 0;
    Object v15 = ((com.google.javascript.jscomp.Compiler)v4).getSourceLine(((java.lang.String)v13),(((java.lang.Integer)v14).intValue()));
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = "call";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = java.nio.charset.Charset.defaultCharset();
    Object v3 = new java.io.PrintStream(((java.io.File)v1),((java.nio.charset.Charset)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v3));
    Object v5 = ((com.google.javascript.jscomp.Compiler)v4).getParserConfig();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = "call";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = java.nio.charset.Charset.defaultCharset();
    Object v3 = new java.io.PrintStream(((java.io.File)v1),((java.nio.charset.Charset)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v3));
    Object v5 = ((com.google.javascript.jscomp.Compiler)v4).toSourceArray();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = "call";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = java.nio.charset.Charset.defaultCharset();
    Object v3 = new java.io.PrintStream(((java.io.File)v1),((java.nio.charset.Charset)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v3));
    Object v5 = new com.google.javascript.jscomp.JSSourceFile[]{null,null,null};
    Object v6 = new com.google.javascript.jscomp.JSModule[]{};
    Object v7 = new com.google.javascript.jscomp.CompilerOptions();
    Object v8 = ((com.google.javascript.jscomp.Compiler)v4).compile(((com.google.javascript.jscomp.JSSourceFile[])v5),((com.google.javascript.jscomp.JSModule[])v6),((com.google.javascript.jscomp.CompilerOptions)v7));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = "call";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = java.nio.charset.Charset.defaultCharset();
    Object v3 = new java.io.PrintStream(((java.io.File)v1),((java.nio.charset.Charset)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v3));
    Object v5 = "shift";
    Object v6 = 0;
    Object v7 = ((com.google.javascript.jscomp.Compiler)v4).getSourceRegion(((java.lang.String)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = "ASSIGN_DI";
    ((com.google.javascript.jscomp.Compiler)v4).startPass(((java.lang.String)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = "call";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = java.nio.charset.Charset.defaultCharset();
    Object v3 = new java.io.PrintStream(((java.io.File)v1),((java.nio.charset.Charset)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v3));
    Object v5 = "call";
    Object v6 = new java.io.File(((java.lang.String)v5));
    Object v7 = com.google.javascript.jscomp.JSSourceFile.fromFile(((java.io.File)v6));
    Object v8 = ((com.google.javascript.jscomp.Compiler)v4).parse(((com.google.javascript.jscomp.JSSourceFile)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = "call";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = java.nio.charset.Charset.defaultCharset();
    Object v3 = new java.io.PrintStream(((java.io.File)v1),((java.nio.charset.Charset)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v3));
    Object v5 = "call";
    Object v6 = new java.io.File(((java.lang.String)v5));
    Object v7 = java.nio.charset.Charset.defaultCharset();
    Object v8 = new java.io.PrintStream(((java.io.File)v6),((java.nio.charset.Charset)v7));
    Object v9 = new com.google.javascript.jscomp.PrintStreamErrorManager(((java.io.PrintStream)v8));
    ((com.google.javascript.jscomp.Compiler)v4).setErrorManager(((com.google.javascript.jscomp.ErrorManager)v9));
    Object v10 = null;
    Object v11 = ((com.google.javascript.jscomp.Compiler)v4).getDefaultErrorReporter();
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = "call";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = java.nio.charset.Charset.defaultCharset();
    Object v3 = new java.io.PrintStream(((java.io.File)v1),((java.nio.charset.Charset)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v3));
    Object v5 = "";
    Object v6 = ((com.google.javascript.jscomp.Compiler)v4).parseTestCode(((java.lang.String)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = "call";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = java.nio.charset.Charset.defaultCharset();
    Object v3 = new java.io.PrintStream(((java.io.File)v1),((java.nio.charset.Charset)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v3));
    Object v5 = new com.google.javascript.jscomp.CompilerOptions();
    ((com.google.javascript.jscomp.Compiler)v4).initOptions(((com.google.javascript.jscomp.CompilerOptions)v5));
    Object v6 = null;
    Object v7 = ((com.google.javascript.jscomp.Compiler)v4).getWarnings();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = "call";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = java.nio.charset.Charset.defaultCharset();
    Object v3 = new java.io.PrintStream(((java.io.File)v1),((java.nio.charset.Charset)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v3));
    Object v5 = new com.google.javascript.jscomp.CompilerOptions();
    Object v6 = false;
    ((com.google.javascript.jscomp.CompilerOptions)v5).setRemoveAbstractMethods((((java.lang.Boolean)v6).booleanValue()));
    Object v7 = null;
    ((com.google.javascript.jscomp.Compiler)v4).initOptions(((com.google.javascript.jscomp.CompilerOptions)v5));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "8";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.Compiler)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = "call";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = java.nio.charset.Charset.defaultCharset();
    Object v3 = new java.io.PrintStream(((java.io.File)v1),((java.nio.charset.Charset)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v3));
    ((com.google.javascript.jscomp.Compiler)v4).resetUniqueNameId();
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = "call";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = java.nio.charset.Charset.defaultCharset();
    Object v3 = new java.io.PrintStream(((java.io.File)v1),((java.nio.charset.Charset)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v3));
    Object v5 = ((com.google.javascript.jscomp.Compiler)v4).getUniqueNameIdSupplier();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = "call";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = java.nio.charset.Charset.defaultCharset();
    Object v3 = new java.io.PrintStream(((java.io.File)v1),((java.nio.charset.Charset)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v3));
    Object v5 = "call";
    Object v6 = new java.io.File(((java.lang.String)v5));
    Object v7 = com.google.javascript.jscomp.JSSourceFile.fromFile(((java.io.File)v6));
    Object v8 = "call";
    Object v9 = new java.io.File(((java.lang.String)v8));
    Object v10 = com.google.javascript.jscomp.JSSourceFile.fromFile(((java.io.File)v9));
    Object v11 = new com.google.javascript.jscomp.CompilerOptions();
    Object v12 = ((com.google.javascript.jscomp.Compiler)v4).compile(((com.google.javascript.jscomp.JSSourceFile)v7),((com.google.javascript.jscomp.JSSourceFile)v10),((com.google.javascript.jscomp.CompilerOptions)v11));
    Object v13 = "goog.exportPropkrty";
    Object v14 = ((com.google.javascript.jscomp.Compiler)v4).newExternInput(((java.lang.String)v13));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = "call";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = java.nio.charset.Charset.defaultCharset();
    Object v3 = new java.io.PrintStream(((java.io.File)v1),((java.nio.charset.Charset)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v3));
    Object v5 = new com.google.javascript.jscomp.JSSourceFile[]{null};
    Object v6 = new com.google.javascript.jscomp.JSSourceFile[]{null};
    Object v7 = new com.google.javascript.jscomp.CompilerOptions();
    Object v8 = ((com.google.javascript.jscomp.Compiler)v4).compile(((com.google.javascript.jscomp.JSSourceFile[])v5),((com.google.javascript.jscomp.JSSourceFile[])v6),((com.google.javascript.jscomp.CompilerOptions)v7));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = "call";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = java.nio.charset.Charset.defaultCharset();
    Object v3 = new java.io.PrintStream(((java.io.File)v1),((java.nio.charset.Charset)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v3));
    Object v5 = ((com.google.javascript.jscomp.Compiler)v4).getSourceMap();
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = "call";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = java.nio.charset.Charset.defaultCharset();
    Object v3 = new java.io.PrintStream(((java.io.File)v1),((java.nio.charset.Charset)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v3));
    Object v5 = new com.google.javascript.jscomp.JSSourceFile[]{null,null};
    Object v6 = new com.google.javascript.jscomp.JSModule[]{null,null};
    Object v7 = new com.google.javascript.jscomp.CompilerOptions();
    ((com.google.javascript.jscomp.Compiler)v4).init(((com.google.javascript.jscomp.JSSourceFile[])v5),((com.google.javascript.jscomp.JSModule[])v6),((com.google.javascript.jscomp.CompilerOptions)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = "call";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = java.nio.charset.Charset.defaultCharset();
    Object v3 = new java.io.PrintStream(((java.io.File)v1),((java.nio.charset.Charset)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v3));
    Object v5 = 5;
    Object v6 = 1.0F;
    Object v7 = new java.util.HashSet((((java.lang.Integer)v5).intValue()),(((java.lang.Float)v6).floatValue()));
    Object v8 = 5;
    Object v9 = 1.0F;
    Object v10 = new java.util.HashSet((((java.lang.Integer)v8).intValue()),(((java.lang.Float)v9).floatValue()));
    Object v11 = ((java.util.Set)v7).containsAll(((java.util.Collection)v10));
    Object v12 = 5;
    Object v13 = 1.0F;
    Object v14 = new java.util.HashSet((((java.lang.Integer)v12).intValue()),(((java.lang.Float)v13).floatValue()));
    Object v15 = 5;
    Object v16 = 1.0F;
    Object v17 = new java.util.HashSet((((java.lang.Integer)v15).intValue()),(((java.lang.Float)v16).floatValue()));
    Object v18 = 5;
    Object v19 = 1.0F;
    Object v20 = new java.util.HashSet((((java.lang.Integer)v18).intValue()),(((java.lang.Float)v19).floatValue()));
    ((com.google.javascript.jscomp.Compiler)v4).stripCode(((java.util.Set)v7),((java.util.Set)v14),((java.util.Set)v17),((java.util.Set)v20));
    Object v21 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = "call";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = java.nio.charset.Charset.defaultCharset();
    Object v3 = new java.io.PrintStream(((java.io.File)v1),((java.nio.charset.Charset)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v3));
    Object v5 = "call";
    Object v6 = new java.io.File(((java.lang.String)v5));
    Object v7 = com.google.javascript.jscomp.JSSourceFile.fromFile(((java.io.File)v6));
    Object v8 = "call";
    Object v9 = new java.io.File(((java.lang.String)v8));
    Object v10 = com.google.javascript.jscomp.JSSourceFile.fromFile(((java.io.File)v9));
    Object v11 = new com.google.javascript.jscomp.CompilerOptions();
    Object v12 = ((com.google.javascript.jscomp.Compiler)v4).compile(((com.google.javascript.jscomp.JSSourceFile)v7),((com.google.javascript.jscomp.JSSourceFile)v10),((com.google.javascript.jscomp.CompilerOptions)v11));
    Object v13 = new com.google.javascript.jscomp.Compiler();
    Object v14 = ((com.google.javascript.jscomp.Compiler)v13).getPassConfig();
    ((com.google.javascript.jscomp.Compiler)v4).setPassConfig(((com.google.javascript.jscomp.PassConfig)v14));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = "call";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = java.nio.charset.Charset.defaultCharset();
    Object v3 = new java.io.PrintStream(((java.io.File)v1),((java.nio.charset.Charset)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v3));
    Object v5 = "this";
    Object v6 = ((com.google.javascript.jscomp.Compiler)v4).newTracer(((java.lang.String)v5));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = "call";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = java.nio.charset.Charset.defaultCharset();
    Object v3 = new java.io.PrintStream(((java.io.File)v1),((java.nio.charset.Charset)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v3));
    Object v5 = ((com.google.javascript.jscomp.Compiler)v4).getModuleGraph();
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = "call";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = java.nio.charset.Charset.defaultCharset();
    Object v3 = new java.io.PrintStream(((java.io.File)v1),((java.nio.charset.Charset)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v3));
    Object v5 = "nulS";
    Object v6 = new com.google.javascript.jscomp.JSModule(((java.lang.String)v5));
    Object v7 = ((com.google.javascript.jscomp.Compiler)v4).toSourceArray(((com.google.javascript.jscomp.JSModule)v6));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = "call";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = java.nio.charset.Charset.defaultCharset();
    Object v3 = new java.io.PrintStream(((java.io.File)v1),((java.nio.charset.Charset)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v3));
    Object v5 = new com.google.javascript.jscomp.JSSourceFile[]{null,null};
    Object v6 = new com.google.javascript.jscomp.JSModule[]{null};
    Object v7 = new com.google.javascript.jscomp.CompilerOptions();
    Object v8 = ((com.google.javascript.jscomp.Compiler)v4).compile(((com.google.javascript.jscomp.JSSourceFile[])v5),((com.google.javascript.jscomp.JSModule[])v6),((com.google.javascript.jscomp.CompilerOptions)v7));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = "call";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = java.nio.charset.Charset.defaultCharset();
    Object v3 = new java.io.PrintStream(((java.io.File)v1),((java.nio.charset.Charset)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v3));
    ((com.google.javascript.jscomp.Compiler)v4).disableThreads();
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = "call";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = java.nio.charset.Charset.defaultCharset();
    Object v3 = new java.io.PrintStream(((java.io.File)v1),((java.nio.charset.Charset)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v3));
    Object v5 = ((com.google.javascript.jscomp.Compiler)v4).getFunctionalInformationMap();
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = "call";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = java.nio.charset.Charset.defaultCharset();
    Object v3 = new java.io.PrintStream(((java.io.File)v1),((java.nio.charset.Charset)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v3));
    ((com.google.javascript.jscomp.Compiler)v4).normalize();
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = "call";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = java.nio.charset.Charset.defaultCharset();
    Object v3 = new java.io.PrintStream(((java.io.File)v1),((java.nio.charset.Charset)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v3));
    Object v5 = ((com.google.javascript.jscomp.Compiler)v4).getTypeRegistry();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = "call";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = java.nio.charset.Charset.defaultCharset();
    Object v3 = new java.io.PrintStream(((java.io.File)v1),((java.nio.charset.Charset)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v3));
    Object v5 = "";
    Object v6 = 0;
    Object v7 = ((com.google.javascript.jscomp.Compiler)v4).getSourceRegion(((java.lang.String)v5),(((java.lang.Integer)v6).intValue()));
    ((com.google.javascript.jscomp.Compiler)v4).initCompilerOptionsIfTesting();
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = "call";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = java.nio.charset.Charset.defaultCharset();
    Object v3 = new java.io.PrintStream(((java.io.File)v1),((java.nio.charset.Charset)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v3));
    Object v5 = ((com.google.javascript.jscomp.Compiler)v4).hasErrors();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = "call";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = java.nio.charset.Charset.defaultCharset();
    Object v3 = new java.io.PrintStream(((java.io.File)v1),((java.nio.charset.Charset)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v3));
    Object v5 = "call";
    Object v6 = new java.io.File(((java.lang.String)v5));
    Object v7 = com.google.javascript.jscomp.JSSourceFile.fromFile(((java.io.File)v6));
    Object v8 = new com.google.javascript.jscomp.JSSourceFile[]{};
    Object v9 = new com.google.javascript.jscomp.CompilerOptions();
    Object v10 = ((com.google.javascript.jscomp.Compiler)v4).compile(((com.google.javascript.jscomp.JSSourceFile)v7),((com.google.javascript.jscomp.JSSourceFile[])v8),((com.google.javascript.jscomp.CompilerOptions)v9));
    Object v11 = "NaN";
    Object v12 = -9;
    Object v13 = -22;
    Object v14 = "";
    Object v15 = "";
    Object v16 = com.google.javascript.jscomp.DiagnosticType.warning(((java.lang.String)v14),((java.lang.String)v15));
    Object v17 = new java.lang.String[]{"4","?","="};
    Object v18 = com.google.javascript.jscomp.JSError.make(((java.lang.String)v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),((com.google.javascript.jscomp.DiagnosticType)v16),((java.lang.String[])v17));
    ((com.google.javascript.jscomp.Compiler)v4).report(((com.google.javascript.jscomp.JSError)v18));
    Object v19 = null;
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = "call";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = java.nio.charset.Charset.defaultCharset();
    Object v3 = new java.io.PrintStream(((java.io.File)v1),((java.nio.charset.Charset)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v3));
    Object v5 = ((com.google.javascript.jscomp.Compiler)v4).getAstDotGraph();
    Object v6 = "call";
    Object v7 = new java.io.File(((java.lang.String)v6));
    Object v8 = com.google.javascript.jscomp.JSSourceFile.fromFile(((java.io.File)v7));
    Object v9 = new com.google.javascript.jscomp.JSModule[]{null,null};
    Object v10 = new com.google.javascript.jscomp.CompilerOptions();
    Object v11 = ((com.google.javascript.jscomp.Compiler)v4).compile(((com.google.javascript.jscomp.JSSourceFile)v8),((com.google.javascript.jscomp.JSModule[])v9),((com.google.javascript.jscomp.CompilerOptions)v10));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = "call";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = java.nio.charset.Charset.defaultCharset();
    Object v3 = new java.io.PrintStream(((java.io.File)v1),((java.nio.charset.Charset)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v3));
    Object v5 = "call";
    Object v6 = new java.io.File(((java.lang.String)v5));
    Object v7 = java.nio.charset.Charset.defaultCharset();
    Object v8 = new java.io.PrintStream(((java.io.File)v6),((java.nio.charset.Charset)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v8));
    Object v10 = "call";
    Object v11 = new java.io.File(((java.lang.String)v10));
    Object v12 = com.google.javascript.jscomp.JSSourceFile.fromFile(((java.io.File)v11));
    Object v13 = ((com.google.javascript.jscomp.Compiler)v9).parse(((com.google.javascript.jscomp.JSSourceFile)v12));
    ((com.google.javascript.jscomp.Compiler)v4).prepareAst(((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = "call";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = java.nio.charset.Charset.defaultCharset();
    Object v3 = new java.io.PrintStream(((java.io.File)v1),((java.nio.charset.Charset)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v3));
    ((com.google.javascript.jscomp.Compiler)v4).disableThreads();
    Object v5 = null;
    Object v6 = 5;
    Object v7 = 1.0F;
    Object v8 = new java.util.HashSet((((java.lang.Integer)v6).intValue()),(((java.lang.Float)v7).floatValue()));
    Object v9 = java.nio.charset.Charset.defaultCharset();
    Object v10 = ((java.util.Set)v8).contains(((java.lang.Object)v9));
    Object v11 = 5;
    Object v12 = 1.0F;
    Object v13 = new java.util.HashSet((((java.lang.Integer)v11).intValue()),(((java.lang.Float)v12).floatValue()));
    Object v14 = 5;
    Object v15 = 1.0F;
    Object v16 = new java.util.HashSet((((java.lang.Integer)v14).intValue()),(((java.lang.Float)v15).floatValue()));
    Object v17 = ((java.util.Set)v16).hashCode();
    Object v18 = 5;
    Object v19 = 1.0F;
    Object v20 = new java.util.HashSet((((java.lang.Integer)v18).intValue()),(((java.lang.Float)v19).floatValue()));
    ((com.google.javascript.jscomp.Compiler)v4).stripCode(((java.util.Set)v8),((java.util.Set)v13),((java.util.Set)v16),((java.util.Set)v20));
    Object v21 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = "call";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = java.nio.charset.Charset.defaultCharset();
    Object v3 = new java.io.PrintStream(((java.io.File)v1),((java.nio.charset.Charset)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v3));
    Object v5 = "Arr";
    Object v6 = "JSC_WITH_DISALLOWED";
    Object v7 = java.io.InputStream.nullInputStream();
    Object v8 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v5),((java.lang.String)v6),((java.io.InputStream)v7));
    Object v9 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v8));
    ((com.google.javascript.jscomp.Compiler)v4).addIncrementalSourceAst(((com.google.javascript.jscomp.JsAst)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }
}
