package com.google.javascript.jscomp;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "TO_DOUBLE";
    Object v2 = ((com.google.javascript.jscomp.Compiler)v0).newTracer(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.Compiler)v0).endPass();
    Object v1 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getState();
    Object v2 = "";
    Object v3 = ((com.google.javascript.jscomp.Compiler)v0).newExternInput(((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.Compiler)v0).processDefines();
    Object v1 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.Compiler)v0).check();
    Object v1 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "m";
    Object v2 = "ERROR";
    Object v3 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new java.lang.String[]{"Unable to determine type of parameter {0}",""};
    Object v5 = com.google.javascript.jscomp.JSError.make(((com.google.javascript.jscomp.DiagnosticType)v3),((java.lang.String[])v4));
    Object v6 = ((com.google.javascript.jscomp.Compiler)v0).getErrorLevel(((com.google.javascript.jscomp.JSError)v5));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.Compiler)v0).setNormalized();
    Object v1 = null;
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ".8";
    Object v2 = "arguments";
    Object v3 = ((com.google.javascript.jscomp.Compiler)v0).parseSyntheticCode(((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getParserConfig();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getPassConfig();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "m";
    Object v2 = "ERROR";
    Object v3 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new java.lang.String[]{"Unable to determine type of parameter {0}",""};
    Object v5 = com.google.javascript.jscomp.JSError.make(((com.google.javascript.jscomp.DiagnosticType)v3),((java.lang.String[])v4));
    ((com.google.javascript.jscomp.Compiler)v0).report(((com.google.javascript.jscomp.JSError)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = java.nio.charset.Charset.defaultCharset();
    Object v3 = new com.google.javascript.jscomp.CompilerOptions();
    Object v4 = 1;
    Object v5 = "nll";
    Object v6 = 0;
    Object v7 = -6;
    Object v8 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v4).intValue()),((java.lang.String)v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = java.nio.charset.Charset.defaultCharset();
    Object v10 = "m";
    Object v11 = "ERROR";
    Object v12 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = new java.lang.String[]{"Unable to determine type of parameter {0}",""};
    Object v14 = com.google.javascript.jscomp.JSError.make(((com.google.javascript.jscomp.DiagnosticType)v12),((java.lang.String[])v13));
    Object v15 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
    Object v16 = java.util.List.of(((java.lang.Object)v1),((java.lang.Object)v2),((java.lang.Object)v3),((java.lang.Object)v8),((java.lang.Object)v9),((java.lang.Object)v14),((java.lang.Object)v15));
    Object v17 = java.nio.charset.Charset.defaultCharset();
    Object v18 = java.nio.charset.Charset.defaultCharset();
    Object v19 = new com.google.javascript.jscomp.CompilerOptions();
    Object v20 = 1;
    Object v21 = "nll";
    Object v22 = 0;
    Object v23 = -6;
    Object v24 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v20).intValue()),((java.lang.String)v21),(((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()));
    Object v25 = java.nio.charset.Charset.defaultCharset();
    Object v26 = "m";
    Object v27 = "ERROR";
    Object v28 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v26),((java.lang.String)v27));
    Object v29 = new java.lang.String[]{"Unable to determine type of parameter {0}",""};
    Object v30 = com.google.javascript.jscomp.JSError.make(((com.google.javascript.jscomp.DiagnosticType)v28),((java.lang.String[])v29));
    Object v31 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
    Object v32 = java.util.List.of(((java.lang.Object)v17),((java.lang.Object)v18),((java.lang.Object)v19),((java.lang.Object)v24),((java.lang.Object)v25),((java.lang.Object)v30),((java.lang.Object)v31));
    Object v33 = new com.google.javascript.jscomp.CompilerOptions();
    Object v34 = ((com.google.javascript.jscomp.Compiler)v0).compileModules(((java.util.List)v16),((java.util.List)v32),((com.google.javascript.jscomp.CompilerOptions)v33));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.Compiler();
    Object v2 = ((com.google.javascript.jscomp.Compiler)v1).getPassConfig();
    ((com.google.javascript.jscomp.Compiler)v0).setPassConfig(((com.google.javascript.jscomp.PassConfig)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getReverseAbstractInterpreter();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = java.nio.charset.Charset.defaultCharset();
    Object v3 = com.google.javascript.jscomp.JSSourceFile.fromFile(((java.lang.String)v1),((java.nio.charset.Charset)v2));
    Object v4 = new com.google.javascript.jscomp.JSSourceFile[]{};
    Object v5 = new com.google.javascript.jscomp.CompilerOptions();
    Object v6 = ((com.google.javascript.jscomp.Compiler)v0).compile(((com.google.javascript.jscomp.JSSourceFile)v3),((com.google.javascript.jscomp.JSSourceFile[])v4),((com.google.javascript.jscomp.CompilerOptions)v5));
    ((com.google.javascript.jscomp.Compiler)v0).initCompilerOptionsIfTesting();
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "call";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.Compiler)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getErrorManager();
    Object v2 = "z";
    Object v3 = ((com.google.javascript.jscomp.Compiler)v0).parseTestCode(((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = 1;
    Object v2 = "nll";
    Object v3 = 0;
    Object v4 = -6;
    Object v5 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v1).intValue()),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 1;
    Object v7 = "nll";
    Object v8 = 0;
    Object v9 = -6;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = ((com.google.javascript.jscomp.Compiler)v0).areNodesEqualForInlining(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v10));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).parseInputs();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = "convertToDottedProperties";
    Object v3 = new com.google.javascript.jscomp.Tracer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.google.javascript.jscomp.Tracer)v3).toString();
    Object v5 = " :";
    ((com.google.javascript.jscomp.Compiler)v0).stopTracer(((com.google.javascript.jscomp.Tracer)v3),((java.lang.String)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getTypeRegistry();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getAstDotGraph();
    org.junit.Assert.assertEquals((Object)(""), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = java.nio.charset.Charset.defaultCharset();
    Object v3 = com.google.javascript.jscomp.JSSourceFile.fromFile(((java.lang.String)v1),((java.nio.charset.Charset)v2));
    Object v4 = "";
    Object v5 = java.nio.charset.Charset.defaultCharset();
    Object v6 = com.google.javascript.jscomp.JSSourceFile.fromFile(((java.lang.String)v4),((java.nio.charset.Charset)v5));
    Object v7 = new com.google.javascript.jscomp.CompilerOptions();
    Object v8 = true;
    ((com.google.javascript.jscomp.CompilerOptions)v7).setColorizeErrorOutput((((java.lang.Boolean)v8).booleanValue()));
    Object v9 = null;
    Object v10 = ((com.google.javascript.jscomp.Compiler)v0).compile(((com.google.javascript.jscomp.JSSourceFile)v3),((com.google.javascript.jscomp.JSSourceFile)v6),((com.google.javascript.jscomp.CompilerOptions)v7));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).computeCFG();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getVariableMap();
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.Compiler)v0).disableThreads();
    Object v1 = null;
    ((com.google.javascript.jscomp.Compiler)v0).resetUniqueNameId();
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).hasHaltingErrors();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "s";
    ((com.google.javascript.jscomp.Compiler)v0).startPass(((java.lang.String)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "\\";
    Object v2 = ((com.google.javascript.jscomp.Compiler)v0).parseTestCode(((java.lang.String)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.Compiler)v0).disableThreads();
    Object v1 = null;
    Object v2 = "msag.undef.prop.write";
    Object v3 = ((com.google.javascript.jscomp.Compiler)v0).newTracer(((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = java.nio.charset.Charset.defaultCharset();
    Object v3 = com.google.javascript.jscomp.JSSourceFile.fromFile(((java.lang.String)v1),((java.nio.charset.Charset)v2));
    Object v4 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v3));
    Object v5 = "";
    Object v6 = java.nio.charset.Charset.defaultCharset();
    Object v7 = com.google.javascript.jscomp.JSSourceFile.fromFile(((java.lang.String)v5),((java.nio.charset.Charset)v6));
    ((com.google.javascript.jscomp.JsAst)v4).setSourceFile(((com.google.javascript.jscomp.SourceFile)v7));
    Object v8 = null;
    ((com.google.javascript.jscomp.Compiler)v0).addIncrementalSourceAst(((com.google.javascript.jscomp.JsAst)v4));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.Compiler)v0).reportCodeChange();
    Object v1 = null;
    ((com.google.javascript.jscomp.Compiler)v0).optimize();
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = new com.google.javascript.jscomp.JSModule(((java.lang.String)v1));
    Object v3 = ((com.google.javascript.jscomp.Compiler)v0).getNodeForCodeInsertion(((com.google.javascript.jscomp.JSModule)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "slice";
    Object v2 = -25;
    Object v3 = ((com.google.javascript.jscomp.Compiler)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.Compiler)v0).reportCodeChange();
    Object v1 = null;
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getUniqueNameIdSupplier();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = java.nio.charset.Charset.defaultCharset();
    Object v3 = com.google.javascript.jscomp.JSSourceFile.fromFile(((java.lang.String)v1),((java.nio.charset.Charset)v2));
    Object v4 = new com.google.javascript.jscomp.JSSourceFile[]{};
    Object v5 = new com.google.javascript.jscomp.CompilerOptions();
    Object v6 = ((com.google.javascript.jscomp.Compiler)v0).compile(((com.google.javascript.jscomp.JSSourceFile)v3),((com.google.javascript.jscomp.JSSourceFile[])v4),((com.google.javascript.jscomp.CompilerOptions)v5));
    Object v7 = ((com.google.javascript.jscomp.Compiler)v0).getCssRenamingMap();
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getDefaultErrorReporter();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getTopScope();
    Object v2 = "";
    Object v3 = "convertToDottedProperties";
    Object v4 = new com.google.javascript.jscomp.Tracer(((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = "";
    ((com.google.javascript.jscomp.Compiler)v0).stopTracer(((com.google.javascript.jscomp.Tracer)v4),((java.lang.String)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getState();
    Object v2 = java.nio.charset.Charset.defaultCharset();
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = new com.google.javascript.jscomp.CompilerOptions();
    Object v5 = 1;
    Object v6 = "nll";
    Object v7 = 0;
    Object v8 = -6;
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v5).intValue()),((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = java.nio.charset.Charset.defaultCharset();
    Object v11 = "m";
    Object v12 = "ERROR";
    Object v13 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = new java.lang.String[]{"Unable to determine type of parameter {0}",""};
    Object v15 = com.google.javascript.jscomp.JSError.make(((com.google.javascript.jscomp.DiagnosticType)v13),((java.lang.String[])v14));
    Object v16 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
    Object v17 = java.util.List.of(((java.lang.Object)v2),((java.lang.Object)v3),((java.lang.Object)v4),((java.lang.Object)v9),((java.lang.Object)v10),((java.lang.Object)v15),((java.lang.Object)v16));
    Object v18 = java.nio.charset.Charset.defaultCharset();
    Object v19 = java.nio.charset.Charset.defaultCharset();
    Object v20 = new com.google.javascript.jscomp.CompilerOptions();
    Object v21 = 1;
    Object v22 = "nll";
    Object v23 = 0;
    Object v24 = -6;
    Object v25 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v21).intValue()),((java.lang.String)v22),(((java.lang.Integer)v23).intValue()),(((java.lang.Integer)v24).intValue()));
    Object v26 = java.nio.charset.Charset.defaultCharset();
    Object v27 = "m";
    Object v28 = "ERROR";
    Object v29 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v27),((java.lang.String)v28));
    Object v30 = new java.lang.String[]{"Unable to determine type of parameter {0}",""};
    Object v31 = com.google.javascript.jscomp.JSError.make(((com.google.javascript.jscomp.DiagnosticType)v29),((java.lang.String[])v30));
    Object v32 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
    Object v33 = java.util.List.of(((java.lang.Object)v18),((java.lang.Object)v19),((java.lang.Object)v20),((java.lang.Object)v25),((java.lang.Object)v26),((java.lang.Object)v31),((java.lang.Object)v32));
    Object v34 = new com.google.javascript.jscomp.CompilerOptions();
    Object v35 = ((com.google.javascript.jscomp.Compiler)v0).compileModules(((java.util.List)v17),((java.util.List)v33),((com.google.javascript.jscomp.CompilerOptions)v34));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).isInliningForbidden();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getErrorManager();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.Compiler)v0).parse();
    Object v1 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getTypeValidator();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).createPassConfigInternal();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.Compiler();
    Object v2 = ((com.google.javascript.jscomp.Compiler)v1).createPassConfigInternal();
    ((com.google.javascript.jscomp.Compiler)v0).setPassConfig(((com.google.javascript.jscomp.PassConfig)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.JSSourceFile[]{null,null,null};
    Object v2 = new com.google.javascript.jscomp.JSSourceFile[]{};
    Object v3 = new com.google.javascript.jscomp.CompilerOptions();
    ((com.google.javascript.jscomp.Compiler)v0).init(((com.google.javascript.jscomp.JSSourceFile[])v1),((com.google.javascript.jscomp.JSSourceFile[])v2),((com.google.javascript.jscomp.CompilerOptions)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = ((com.google.javascript.jscomp.Compiler)v0).newExternInput(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "Parsingo ";
    Object v2 = -46;
    Object v3 = ((com.google.javascript.jscomp.Compiler)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = java.nio.charset.Charset.defaultCharset();
    Object v3 = new com.google.javascript.jscomp.CompilerOptions();
    Object v4 = 1;
    Object v5 = "nll";
    Object v6 = 0;
    Object v7 = -6;
    Object v8 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v4).intValue()),((java.lang.String)v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = java.nio.charset.Charset.defaultCharset();
    Object v10 = "m";
    Object v11 = "ERROR";
    Object v12 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = new java.lang.String[]{"Unable to determine type of parameter {0}",""};
    Object v14 = com.google.javascript.jscomp.JSError.make(((com.google.javascript.jscomp.DiagnosticType)v12),((java.lang.String[])v13));
    Object v15 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
    Object v16 = java.util.List.of(((java.lang.Object)v1),((java.lang.Object)v2),((java.lang.Object)v3),((java.lang.Object)v8),((java.lang.Object)v9),((java.lang.Object)v14),((java.lang.Object)v15));
    Object v17 = java.nio.charset.Charset.defaultCharset();
    Object v18 = java.nio.charset.Charset.defaultCharset();
    Object v19 = new com.google.javascript.jscomp.CompilerOptions();
    Object v20 = 1;
    Object v21 = "nll";
    Object v22 = 0;
    Object v23 = -6;
    Object v24 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v20).intValue()),((java.lang.String)v21),(((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()));
    Object v25 = java.nio.charset.Charset.defaultCharset();
    Object v26 = "m";
    Object v27 = "ERROR";
    Object v28 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v26),((java.lang.String)v27));
    Object v29 = new java.lang.String[]{"Unable to determine type of parameter {0}",""};
    Object v30 = com.google.javascript.jscomp.JSError.make(((com.google.javascript.jscomp.DiagnosticType)v28),((java.lang.String[])v29));
    Object v31 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
    Object v32 = java.util.List.of(((java.lang.Object)v17),((java.lang.Object)v18),((java.lang.Object)v19),((java.lang.Object)v24),((java.lang.Object)v25),((java.lang.Object)v30),((java.lang.Object)v31));
    Object v33 = new com.google.javascript.jscomp.CompilerOptions();
    Object v34 = ((com.google.javascript.jscomp.Compiler)v0).compile(((java.util.List)v16),((java.util.List)v32),((com.google.javascript.jscomp.CompilerOptions)v33));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getCodingConvention();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v1));
    ((com.google.javascript.jscomp.Compiler)v2).disableThreads();
    Object v3 = null;
    Object v4 = "m";
    Object v5 = "ERROR";
    Object v6 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new java.lang.String[]{"Unable to determine type of parameter {0}",""};
    Object v8 = com.google.javascript.jscomp.JSError.make(((com.google.javascript.jscomp.DiagnosticType)v6),((java.lang.String[])v7));
    ((com.google.javascript.jscomp.Compiler)v2).report(((com.google.javascript.jscomp.JSError)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v1));
    Object v3 = ((com.google.javascript.jscomp.Compiler)v2).getState();
    ((com.google.javascript.jscomp.Compiler)v2).optimize();
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v1));
    Object v3 = "|";
    Object v4 = "E";
    Object v5 = "number";
    Object v6 = 46;
    Object v7 = new com.google.javascript.rhino.EvaluatorException(((java.lang.String)v4),((java.lang.String)v5),(((java.lang.Integer)v6).intValue()));
    ((com.google.javascript.jscomp.Compiler)v2).throwInternalError(((java.lang.String)v3),((java.lang.Exception)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v1));
    ((com.google.javascript.jscomp.Compiler)v2).initInputsByNameMap();
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v1));
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = java.nio.charset.Charset.defaultCharset();
    Object v5 = new com.google.javascript.jscomp.CompilerOptions();
    Object v6 = 1;
    Object v7 = "nll";
    Object v8 = 0;
    Object v9 = -6;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = java.nio.charset.Charset.defaultCharset();
    Object v12 = "m";
    Object v13 = "ERROR";
    Object v14 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = new java.lang.String[]{"Unable to determine type of parameter {0}",""};
    Object v16 = com.google.javascript.jscomp.JSError.make(((com.google.javascript.jscomp.DiagnosticType)v14),((java.lang.String[])v15));
    Object v17 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
    Object v18 = java.util.List.of(((java.lang.Object)v3),((java.lang.Object)v4),((java.lang.Object)v5),((java.lang.Object)v10),((java.lang.Object)v11),((java.lang.Object)v16),((java.lang.Object)v17));
    Object v19 = java.nio.charset.Charset.defaultCharset();
    Object v20 = java.nio.charset.Charset.defaultCharset();
    Object v21 = new com.google.javascript.jscomp.CompilerOptions();
    Object v22 = 1;
    Object v23 = "nll";
    Object v24 = 0;
    Object v25 = -6;
    Object v26 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v22).intValue()),((java.lang.String)v23),(((java.lang.Integer)v24).intValue()),(((java.lang.Integer)v25).intValue()));
    Object v27 = java.nio.charset.Charset.defaultCharset();
    Object v28 = "m";
    Object v29 = "ERROR";
    Object v30 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v28),((java.lang.String)v29));
    Object v31 = new java.lang.String[]{"Unable to determine type of parameter {0}",""};
    Object v32 = com.google.javascript.jscomp.JSError.make(((com.google.javascript.jscomp.DiagnosticType)v30),((java.lang.String[])v31));
    Object v33 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
    Object v34 = java.util.List.of(((java.lang.Object)v19),((java.lang.Object)v20),((java.lang.Object)v21),((java.lang.Object)v26),((java.lang.Object)v27),((java.lang.Object)v32),((java.lang.Object)v33));
    Object v35 = new com.google.javascript.jscomp.CompilerOptions();
    Object v36 = ((com.google.javascript.jscomp.Compiler)v2).compile(((java.util.List)v18),((java.util.List)v34),((com.google.javascript.jscomp.CompilerOptions)v35));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v1));
    Object v3 = ((com.google.javascript.jscomp.Compiler)v2).getTypeRegistry();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v1));
    Object v3 = ((com.google.javascript.jscomp.Compiler)v2).getTypeValidator();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v1));
    Object v3 = ((com.google.javascript.jscomp.Compiler)v2).isIdeMode();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v1));
    Object v3 = ((com.google.javascript.jscomp.Compiler)v2).getWarningCount();
    org.junit.Assert.assertEquals((Object)(0), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = ((com.google.javascript.jscomp.Compiler)v3).createPassConfigInternal();
    ((com.google.javascript.jscomp.Compiler)v2).setPassConfig(((com.google.javascript.jscomp.PassConfig)v4));
    Object v5 = null;
    ((com.google.javascript.jscomp.Compiler)v2).initInputsByNameMap();
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v1));
    Object v3 = ((com.google.javascript.jscomp.Compiler)v2).hasHaltingErrors();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = ((com.google.javascript.jscomp.Compiler)v3).getErrorManager();
    ((com.google.javascript.jscomp.Compiler)v2).setErrorManager(((com.google.javascript.jscomp.ErrorManager)v4));
    Object v5 = null;
    ((com.google.javascript.jscomp.Compiler)v2).check();
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v1));
    ((com.google.javascript.jscomp.Compiler)v2).initCompilerOptionsIfTesting();
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v1));
    Object v3 = new com.google.javascript.jscomp.CompilerOptions();
    ((com.google.javascript.jscomp.Compiler)v2).initOptions(((com.google.javascript.jscomp.CompilerOptions)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v1));
    Object v3 = ((com.google.javascript.jscomp.Compiler)v2).getCssRenamingMap();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v1));
    Object v3 = "";
    Object v4 = java.nio.charset.Charset.defaultCharset();
    Object v5 = com.google.javascript.jscomp.JSSourceFile.fromFile(((java.lang.String)v3),((java.nio.charset.Charset)v4));
    Object v6 = "ASSIGN_MOD";
    ((com.google.javascript.jscomp.SourceFile)v5).setOriginalPath(((java.lang.String)v6));
    Object v7 = null;
    Object v8 = ((com.google.javascript.jscomp.Compiler)v2).parse(((com.google.javascript.jscomp.JSSourceFile)v5));
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v1));
    Object v3 = ((com.google.javascript.jscomp.Compiler)v2).getWarningCount();
    Object v4 = 1;
    Object v5 = "nll";
    Object v6 = 0;
    Object v7 = -6;
    Object v8 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v4).intValue()),((java.lang.String)v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = 1;
    Object v10 = "nll";
    Object v11 = 0;
    Object v12 = -6;
    Object v13 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v9).intValue()),((java.lang.String)v10),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = ((com.google.javascript.jscomp.Compiler)v2).areNodesEqualForInlining(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v13));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v1));
    Object v3 = new com.google.javascript.jscomp.CompilerOptions();
    Object v4 = false;
    ((com.google.javascript.jscomp.CompilerOptions)v3).setChainCalls((((java.lang.Boolean)v4).booleanValue()));
    Object v5 = null;
    ((com.google.javascript.jscomp.Compiler)v2).initOptions(((com.google.javascript.jscomp.CompilerOptions)v3));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v1));
    Object v3 = ((com.google.javascript.jscomp.Compiler)v2).getState();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v1));
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = java.nio.charset.Charset.defaultCharset();
    Object v5 = new com.google.javascript.jscomp.CompilerOptions();
    Object v6 = 1;
    Object v7 = "nll";
    Object v8 = 0;
    Object v9 = -6;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = java.nio.charset.Charset.defaultCharset();
    Object v12 = "m";
    Object v13 = "ERROR";
    Object v14 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = new java.lang.String[]{"Unable to determine type of parameter {0}",""};
    Object v16 = com.google.javascript.jscomp.JSError.make(((com.google.javascript.jscomp.DiagnosticType)v14),((java.lang.String[])v15));
    Object v17 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
    Object v18 = java.util.List.of(((java.lang.Object)v3),((java.lang.Object)v4),((java.lang.Object)v5),((java.lang.Object)v10),((java.lang.Object)v11),((java.lang.Object)v16),((java.lang.Object)v17));
    Object v19 = java.nio.charset.Charset.defaultCharset();
    Object v20 = java.nio.charset.Charset.defaultCharset();
    Object v21 = new com.google.javascript.jscomp.CompilerOptions();
    Object v22 = 1;
    Object v23 = "nll";
    Object v24 = 0;
    Object v25 = -6;
    Object v26 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v22).intValue()),((java.lang.String)v23),(((java.lang.Integer)v24).intValue()),(((java.lang.Integer)v25).intValue()));
    Object v27 = java.nio.charset.Charset.defaultCharset();
    Object v28 = "m";
    Object v29 = "ERROR";
    Object v30 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v28),((java.lang.String)v29));
    Object v31 = new java.lang.String[]{"Unable to determine type of parameter {0}",""};
    Object v32 = com.google.javascript.jscomp.JSError.make(((com.google.javascript.jscomp.DiagnosticType)v30),((java.lang.String[])v31));
    Object v33 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
    Object v34 = java.util.List.of(((java.lang.Object)v19),((java.lang.Object)v20),((java.lang.Object)v21),((java.lang.Object)v26),((java.lang.Object)v27),((java.lang.Object)v32),((java.lang.Object)v33));
    Object v35 = new java.lang.Object[]{null};
    Object v36 = ((java.util.List)v34).toArray(((java.lang.Object[])v35));
    Object v37 = new com.google.javascript.jscomp.CompilerOptions();
    ((com.google.javascript.jscomp.Compiler)v2).init(((java.util.List)v18),((java.util.List)v34),((com.google.javascript.jscomp.CompilerOptions)v37));
    Object v38 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v1));
    Object v3 = ":";
    Object v4 = ((com.google.javascript.jscomp.Compiler)v2).parseTestCode(((java.lang.String)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v1));
    Object v3 = "";
    Object v4 = java.nio.charset.Charset.defaultCharset();
    Object v5 = com.google.javascript.jscomp.JSSourceFile.fromFile(((java.lang.String)v3),((java.nio.charset.Charset)v4));
    Object v6 = "";
    Object v7 = java.nio.charset.Charset.defaultCharset();
    Object v8 = com.google.javascript.jscomp.JSSourceFile.fromFile(((java.lang.String)v6),((java.nio.charset.Charset)v7));
    Object v9 = new com.google.javascript.jscomp.CompilerOptions();
    Object v10 = ((com.google.javascript.jscomp.Compiler)v2).compile(((com.google.javascript.jscomp.JSSourceFile)v5),((com.google.javascript.jscomp.JSSourceFile)v8),((com.google.javascript.jscomp.CompilerOptions)v9));
    Object v11 = ((com.google.javascript.jscomp.Compiler)v2).hasHaltingErrors();
    org.junit.Assert.assertEquals((Object)(true), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v1));
    Object v3 = "N";
    Object v4 = ((com.google.javascript.jscomp.Compiler)v2).newExternInput(((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v1));
    Object v3 = "";
    Object v4 = 0;
    Object v5 = ((com.google.javascript.jscomp.Compiler)v2).getSourceLine(((java.lang.String)v3),(((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v1));
    Object v3 = ((com.google.javascript.jscomp.Compiler)v2).parseInputs();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v1));
    Object v3 = ((com.google.javascript.jscomp.Compiler)v2).getPassConfig();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v1));
    ((com.google.javascript.jscomp.Compiler)v2).reportCodeChange();
    Object v3 = null;
    Object v4 = ((com.google.javascript.jscomp.Compiler)v2).getWarningCount();
    org.junit.Assert.assertEquals((Object)(0), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v1));
    ((com.google.javascript.jscomp.Compiler)v2).reportCodeChange();
    Object v3 = null;
    Object v4 = ((com.google.javascript.jscomp.Compiler)v2).getReverseAbstractInterpreter();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v1));
    Object v3 = "";
    Object v4 = new com.google.javascript.jscomp.JSModule(((java.lang.String)v3));
    Object v5 = ((com.google.javascript.jscomp.Compiler)v2).getNodeForCodeInsertion(((com.google.javascript.jscomp.JSModule)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v1));
    Object v3 = ((com.google.javascript.jscomp.Compiler)v2).getWarnings();
    ((com.google.javascript.jscomp.Compiler)v2).reportCodeChange();
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v1));
    Object v3 = ((com.google.javascript.jscomp.Compiler)v2).getAstDotGraph();
    org.junit.Assert.assertEquals((Object)(""), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v1));
    Object v3 = "";
    Object v4 = ((com.google.javascript.jscomp.Compiler)v2).parseTestCode(((java.lang.String)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v1));
    Object v3 = ((com.google.javascript.jscomp.Compiler)v2).isNormalized();
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v1));
    Object v3 = ((com.google.javascript.jscomp.Compiler)v2).getInputsInOrder();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v1));
    Object v3 = new com.google.javascript.jscomp.CodeChangeHandler.ForbiddenChange();
    ((com.google.javascript.jscomp.Compiler)v2).removeChangeHandler(((com.google.javascript.jscomp.CodeChangeHandler)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v1));
    Object v3 = ((com.google.javascript.jscomp.Compiler)v2).getWarnings();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v1));
    Object v3 = ((com.google.javascript.jscomp.Compiler)v2).getReverseAbstractInterpreter();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v1));
    Object v3 = ((com.google.javascript.jscomp.Compiler)v2).getErrorManager();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v1));
    Object v3 = ((com.google.javascript.jscomp.Compiler)v2).getCodingConvention();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v1));
    Object v3 = "ReportExit";
    Object v4 = ((com.google.javascript.jscomp.Compiler)v2).newExternInput(((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v1));
    Object v3 = ((com.google.javascript.jscomp.Compiler)v2).getParserConfig();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v1));
    Object v3 = "";
    Object v4 = new com.google.javascript.jscomp.JSModule(((java.lang.String)v3));
    Object v5 = ((com.google.javascript.jscomp.Compiler)v2).toSourceArray(((com.google.javascript.jscomp.JSModule)v4));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v1));
    ((com.google.javascript.jscomp.Compiler)v2).endPass();
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v1));
    Object v3 = ((com.google.javascript.jscomp.Compiler)v2).isInliningForbidden();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v1));
    Object v3 = ((com.google.javascript.jscomp.Compiler)v2).getDefaultErrorReporter();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v1));
    Object v3 = ((com.google.javascript.jscomp.Compiler)v2).getTopScope();
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v1));
    Object v3 = ((com.google.javascript.jscomp.Compiler)v2).getErrorManager();
    Object v4 = ((com.google.javascript.jscomp.Compiler)v2).getParserConfig();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v1));
    Object v3 = ((com.google.javascript.jscomp.Compiler)v2).getInputsForTesting();
    org.junit.Assert.assertNull(v3);
  }
}
