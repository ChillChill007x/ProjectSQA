package com.google.javascript.jscomp;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "COMMA";
    Object v2 = ((com.google.javascript.jscomp.Compiler)v0).parseTestCode(((java.lang.String)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "str/ing";
    Object v2 = ((com.google.javascript.jscomp.Compiler)v0).getSourceFileByName(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "2";
    Object v2 = ((com.google.javascript.jscomp.Compiler)v0).ensureLibraryInjected(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "\\n";
    Object v2 = "";
    Object v3 = new java.lang.Exception(((java.lang.String)v2));
    ((com.google.javascript.jscomp.Compiler)v0).throwInternalError(((java.lang.String)v1),((java.lang.Exception)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "i";
    Object v2 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v1));
    Object v3 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v2));
    Object v4 = ((com.google.javascript.jscomp.Compiler)v0).addNewSourceAst(((com.google.javascript.jscomp.JsAst)v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "i";
    Object v2 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v1));
    Object v3 = "i";
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v3));
    Object v5 = new com.google.javascript.jscomp.CompilerOptions();
    Object v6 = ((com.google.javascript.jscomp.Compiler)v0).compile(((com.google.javascript.jscomp.SourceFile)v2),((com.google.javascript.jscomp.SourceFile)v4),((com.google.javascript.jscomp.CompilerOptions)v5));
    Object v7 = ((com.google.javascript.jscomp.Compiler)v0).getAstDotGraph();
    org.junit.Assert.assertEquals((Object)(""), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getReverseAbstractInterpreter();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getState();
    Object v2 = "D";
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = "COMMA";
    Object v5 = ((com.google.javascript.jscomp.Compiler)v3).parseTestCode(((java.lang.String)v4));
    Object v6 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v7 = "";
    Object v8 = "h";
    Object v9 = com.google.javascript.jscomp.DiagnosticType.error(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = new java.lang.String[]{"7","I"};
    Object v11 = com.google.javascript.jscomp.JSError.make(((java.lang.String)v2),((com.google.javascript.rhino.Node)v5),((com.google.javascript.jscomp.CheckLevel)v6),((com.google.javascript.jscomp.DiagnosticType)v9),((java.lang.String[])v10));
    Object v12 = ((com.google.javascript.jscomp.JSError)v11).toString();
    ((com.google.javascript.jscomp.Compiler)v0).report(((com.google.javascript.jscomp.JSError)v11));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = 0;
    Object v2 = 39.53693F;
    Object v3 = new java.util.HashMap((((java.lang.Integer)v1).intValue()),(((java.lang.Float)v2).floatValue()));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = "COMMA";
    Object v6 = ((com.google.javascript.jscomp.Compiler)v4).parseTestCode(((java.lang.String)v5));
    ((com.google.javascript.jscomp.Compiler)v0).updateGlobalVarReferences(((java.util.Map)v3),((com.google.javascript.rhino.Node)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "#";
    Object v2 = ((com.google.javascript.jscomp.Compiler)v0).newExternInput(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getState();
    Object v2 = "k";
    Object v3 = ((com.google.javascript.jscomp.Compiler)v0).parseTestCode(((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "prototype";
    Object v2 = ((com.google.javascript.jscomp.Compiler)v0).newTracer(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "O";
    Object v2 = new com.google.javascript.jscomp.Tracer(((java.lang.String)v1));
    Object v3 = "<";
    ((com.google.javascript.jscomp.Compiler)v0).stopTracer(((com.google.javascript.jscomp.Tracer)v2),((java.lang.String)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getErrorManager();
    ((com.google.javascript.jscomp.Compiler)v0).endPass();
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getErrorCount();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.CompilerOptions();
    ((com.google.javascript.jscomp.Compiler)v0).initOptions(((com.google.javascript.jscomp.CompilerOptions)v1));
    Object v2 = null;
    ((com.google.javascript.jscomp.Compiler)v0).optimize();
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.Compiler)v0).initCompilerOptionsIfTesting();
    Object v1 = null;
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ",";
    Object v2 = ((com.google.javascript.jscomp.Compiler)v0).parseTestCode(((java.lang.String)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).hasRegExpGlobalReferences();
    org.junit.Assert.assertEquals((Object)(true), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getMessages();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.Compiler)v0).processAMDAndCommonJSModules();
    Object v1 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.Compiler();
    Object v2 = "COMMA";
    Object v3 = ((com.google.javascript.jscomp.Compiler)v1).parseTestCode(((java.lang.String)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = ((com.google.javascript.jscomp.Compiler)v4).getState();
    Object v6 = "k";
    Object v7 = ((com.google.javascript.jscomp.Compiler)v4).parseTestCode(((java.lang.String)v6));
    Object v8 = ((com.google.javascript.rhino.Node)v3).useSourceInfoFrom(((com.google.javascript.rhino.Node)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = ((com.google.javascript.jscomp.Compiler)v9).getState();
    Object v11 = "k";
    Object v12 = ((com.google.javascript.jscomp.Compiler)v9).parseTestCode(((java.lang.String)v11));
    Object v13 = ((com.google.javascript.jscomp.Compiler)v0).areNodesEqualForInlining(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.Node)v12));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.JSSourceFile[]{};
    Object v2 = new com.google.javascript.jscomp.JSSourceFile[]{null};
    Object v3 = new com.google.javascript.jscomp.CompilerOptions();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = "COMMA";
    Object v6 = ((com.google.javascript.jscomp.Compiler)v4).parseTestCode(((java.lang.String)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = new com.google.javascript.jscomp.Compiler();
    Object v9 = "COMMA";
    Object v10 = ((com.google.javascript.jscomp.Compiler)v8).parseTestCode(((java.lang.String)v9));
    Object v11 = new com.google.javascript.jscomp.Compiler();
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = "COMMA";
    Object v14 = ((com.google.javascript.jscomp.Compiler)v12).parseTestCode(((java.lang.String)v13));
    Object v15 = new com.google.javascript.jscomp.Compiler();
    Object v16 = new com.google.javascript.jscomp.Compiler();
    Object v17 = "COMMA";
    Object v18 = ((com.google.javascript.jscomp.Compiler)v16).parseTestCode(((java.lang.String)v17));
    Object v19 = new com.google.javascript.jscomp.Compiler();
    Object v20 = "COMMA";
    Object v21 = ((com.google.javascript.jscomp.Compiler)v19).parseTestCode(((java.lang.String)v20));
    Object v22 = new com.google.javascript.jscomp.Compiler();
    Object v23 = "COMMA";
    Object v24 = ((com.google.javascript.jscomp.Compiler)v22).parseTestCode(((java.lang.String)v23));
    Object v25 = java.util.List.of(((java.lang.Object)v6),((java.lang.Object)v7),((java.lang.Object)v10),((java.lang.Object)v11),((java.lang.Object)v14),((java.lang.Object)v15),((java.lang.Object)v18),((java.lang.Object)v21),((java.lang.Object)v24));
    ((com.google.javascript.jscomp.CompilerOptions)v3).setManageClosureDependencies(((java.util.List)v25));
    Object v26 = null;
    Object v27 = ((com.google.javascript.jscomp.Compiler)v0).compile(((com.google.javascript.jscomp.JSSourceFile[])v1),((com.google.javascript.jscomp.JSSourceFile[])v2),((com.google.javascript.jscomp.CompilerOptions)v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "1";
    Object v2 = ((com.google.javascript.jscomp.Compiler)v0).newExternInput(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.Compiler)v0).normalize();
    Object v1 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).isIdeMode();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).isInliningForbidden();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "D";
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = "COMMA";
    Object v4 = ((com.google.javascript.jscomp.Compiler)v2).parseTestCode(((java.lang.String)v3));
    Object v5 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v6 = "";
    Object v7 = "h";
    Object v8 = com.google.javascript.jscomp.DiagnosticType.error(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = new java.lang.String[]{"7","I"};
    Object v10 = com.google.javascript.jscomp.JSError.make(((java.lang.String)v1),((com.google.javascript.rhino.Node)v4),((com.google.javascript.jscomp.CheckLevel)v5),((com.google.javascript.jscomp.DiagnosticType)v8),((java.lang.String[])v9));
    ((com.google.javascript.jscomp.Compiler)v0).report(((com.google.javascript.jscomp.JSError)v10));
    Object v11 = null;
    Object v12 = new com.google.javascript.jscomp.CompilerOptions();
    ((com.google.javascript.jscomp.Compiler)v0).initOptions(((com.google.javascript.jscomp.CompilerOptions)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = 1.0D;
    ((com.google.javascript.jscomp.Compiler)v0).setProgress((((java.lang.Double)v1).doubleValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = "L ";
    Object v3 = ((com.google.javascript.jscomp.Compiler)v0).parseSyntheticCode(((java.lang.String)v1),((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "D";
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = "COMMA";
    Object v4 = ((com.google.javascript.jscomp.Compiler)v2).parseTestCode(((java.lang.String)v3));
    Object v5 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v6 = "";
    Object v7 = "h";
    Object v8 = com.google.javascript.jscomp.DiagnosticType.error(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = new java.lang.String[]{"7","I"};
    Object v10 = com.google.javascript.jscomp.JSError.make(((java.lang.String)v1),((com.google.javascript.rhino.Node)v4),((com.google.javascript.jscomp.CheckLevel)v5),((com.google.javascript.jscomp.DiagnosticType)v8),((java.lang.String[])v9));
    ((com.google.javascript.jscomp.Compiler)v0).report(((com.google.javascript.jscomp.JSError)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getModuleGraph();
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.Compiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = "";
    Object v3 = 1;
    Object v4 = ((com.google.javascript.jscomp.Compiler)v0).getSourceRegion(((java.lang.String)v2),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "D";
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = "COMMA";
    Object v4 = ((com.google.javascript.jscomp.Compiler)v2).parseTestCode(((java.lang.String)v3));
    Object v5 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v6 = "";
    Object v7 = "h";
    Object v8 = com.google.javascript.jscomp.DiagnosticType.error(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = new java.lang.String[]{"7","I"};
    Object v10 = com.google.javascript.jscomp.JSError.make(((java.lang.String)v1),((com.google.javascript.rhino.Node)v4),((com.google.javascript.jscomp.CheckLevel)v5),((com.google.javascript.jscomp.DiagnosticType)v8),((java.lang.String[])v9));
    ((com.google.javascript.jscomp.Compiler)v0).report(((com.google.javascript.jscomp.JSError)v10));
    Object v11 = null;
    Object v12 = ((com.google.javascript.jscomp.Compiler)v0).getPassConfig();
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "i";
    Object v2 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v1));
    Object v3 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v2));
    Object v4 = "i";
    Object v5 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v4));
    ((com.google.javascript.jscomp.JsAst)v3).setSourceFile(((com.google.javascript.jscomp.SourceFile)v5));
    Object v6 = null;
    Object v7 = ((com.google.javascript.jscomp.Compiler)v0).addNewSourceAst(((com.google.javascript.jscomp.JsAst)v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).toSource();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "i";
    Object v2 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v1));
    Object v3 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v2));
    ((com.google.javascript.jscomp.Compiler)v0).replaceScript(((com.google.javascript.jscomp.JsAst)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getAstDotGraph();
    Object v2 = ((com.google.javascript.jscomp.Compiler)v0).getErrorManager();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "U";
    Object v2 = "";
    Object v3 = new java.io.File(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = java.nio.charset.Charset.defaultCharset();
    Object v5 = com.google.javascript.jscomp.JSSourceFile.fromFile(((java.io.File)v3),((java.nio.charset.Charset)v4));
    Object v6 = "U";
    Object v7 = "";
    Object v8 = new java.io.File(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = java.nio.charset.Charset.defaultCharset();
    Object v10 = com.google.javascript.jscomp.JSSourceFile.fromFile(((java.io.File)v8),((java.nio.charset.Charset)v9));
    Object v11 = new com.google.javascript.jscomp.CompilerOptions();
    Object v12 = ((com.google.javascript.jscomp.Compiler)v0).compile(((com.google.javascript.jscomp.SourceFile)v5),((com.google.javascript.jscomp.SourceFile)v10),((com.google.javascript.jscomp.CompilerOptions)v11));
    Object v13 = ((com.google.javascript.jscomp.Compiler)v0).getTypeValidator();
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.Compiler)v0).check();
    Object v1 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = 0.0D;
    ((com.google.javascript.jscomp.Compiler)v0).setProgress((((java.lang.Double)v1).doubleValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).parseInputs();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "i";
    Object v2 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v1));
    Object v3 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v2));
    ((com.google.javascript.jscomp.Compiler)v0).addIncrementalSourceAst(((com.google.javascript.jscomp.JsAst)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).acceptEcmaScript5();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
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
  public void test45() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.JSSourceFile[]{null};
    Object v2 = new com.google.javascript.jscomp.JSSourceFile[]{null,null};
    Object v3 = new com.google.javascript.jscomp.CompilerOptions();
    ((com.google.javascript.jscomp.Compiler)v0).init(((com.google.javascript.jscomp.JSSourceFile[])v1),((com.google.javascript.jscomp.JSSourceFile[])v2),((com.google.javascript.jscomp.CompilerOptions)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getAstDotGraph();
    ((com.google.javascript.jscomp.Compiler)v0).check();
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getFunctionalInformationMap();
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "arguments";
    Object v2 = ((com.google.javascript.jscomp.Compiler)v0).getSourceFileByName(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "JSC_INVALID_REGULAR_EXPRESSIrON_FLAGS";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.Compiler)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.Compiler)v0).initInputsByIdMap();
    Object v1 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "\n";
    Object v2 = 1;
    Object v3 = ((com.google.javascript.jscomp.Compiler)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "D";
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = "COMMA";
    Object v4 = ((com.google.javascript.jscomp.Compiler)v2).parseTestCode(((java.lang.String)v3));
    Object v5 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v6 = "";
    Object v7 = "h";
    Object v8 = com.google.javascript.jscomp.DiagnosticType.error(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = new java.lang.String[]{"7","I"};
    Object v10 = com.google.javascript.jscomp.JSError.make(((java.lang.String)v1),((com.google.javascript.rhino.Node)v4),((com.google.javascript.jscomp.CheckLevel)v5),((com.google.javascript.jscomp.DiagnosticType)v8),((java.lang.String[])v9));
    Object v11 = ((com.google.javascript.jscomp.JSError)v10).hashCode();
    ((com.google.javascript.jscomp.Compiler)v0).report(((com.google.javascript.jscomp.JSError)v10));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.Compiler)v0).optimize();
    Object v1 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).hasHaltingErrors();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.Compiler)v0).disableThreads();
    Object v1 = null;
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getCodingConvention();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ",";
    ((com.google.javascript.jscomp.Compiler)v0).startPass(((java.lang.String)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = ((com.google.javascript.jscomp.Compiler)v0).newTracer(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.Compiler();
    Object v2 = ((com.google.javascript.jscomp.Compiler)v1).getState();
    Object v3 = "k";
    Object v4 = ((com.google.javascript.jscomp.Compiler)v1).parseTestCode(((java.lang.String)v3));
    Object v5 = ((com.google.javascript.jscomp.Compiler)v0).toSource(((com.google.javascript.rhino.Node)v4));
    org.junit.Assert.assertEquals((Object)("k"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getExternsForTesting();
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "i";
    Object v2 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v1));
    Object v3 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v2));
    Object v4 = "i";
    Object v5 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v4));
    ((com.google.javascript.jscomp.JsAst)v3).setSourceFile(((com.google.javascript.jscomp.SourceFile)v5));
    Object v6 = null;
    ((com.google.javascript.jscomp.Compiler)v0).addNewScript(((com.google.javascript.jscomp.JsAst)v3));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getPassConfig();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "unexpected";
    ((com.google.javascript.jscomp.Compiler)v0).startPass(((java.lang.String)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.CompilerOptions();
    ((com.google.javascript.jscomp.Compiler)v0).initOptions(((com.google.javascript.jscomp.CompilerOptions)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getAstDotGraph();
    org.junit.Assert.assertEquals((Object)(""), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "Circular dependenc";
    Object v2 = new com.google.javascript.jscomp.JSModule(((java.lang.String)v1));
    Object v3 = ((com.google.javascript.jscomp.Compiler)v0).getNodeForCodeInsertion(((com.google.javascript.jscomp.JSModule)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getTypeRegistry();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "i";
    Object v2 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v1));
    Object v3 = ((com.google.javascript.jscomp.Compiler)v0).parse(((com.google.javascript.jscomp.SourceFile)v2));
    Object v4 = ((com.google.javascript.jscomp.Compiler)v0).getWarnings();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getAstDotGraph();
    Object v2 = ((com.google.javascript.jscomp.Compiler)v0).getDegenerateModuleGraph();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.Compiler();
    Object v2 = ((com.google.javascript.jscomp.Compiler)v1).getPassConfig();
    ((com.google.javascript.jscomp.Compiler)v0).setPassConfig(((com.google.javascript.jscomp.PassConfig)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getErrorManager();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "i";
    Object v2 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v1));
    Object v3 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v2));
    ((com.google.javascript.jscomp.Compiler)v0).addNewScript(((com.google.javascript.jscomp.JsAst)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "i";
    Object v2 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v1));
    Object v3 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v2));
    Object v4 = ((com.google.javascript.jscomp.Compiler)v0).replaceIncrementalSourceAst(((com.google.javascript.jscomp.JsAst)v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "Circular dependenc";
    Object v2 = new com.google.javascript.jscomp.JSModule(((java.lang.String)v1));
    Object v3 = "gatherRawExports";
    Object v4 = ((com.google.javascript.jscomp.JSModule)v2).removeByName(((java.lang.String)v3));
    Object v5 = ((com.google.javascript.jscomp.Compiler)v0).getNodeForCodeInsertion(((com.google.javascript.jscomp.JSModule)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.Compiler)v0).reportCodeChange();
    Object v1 = null;
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = 1;
    Object v3 = ((com.google.javascript.jscomp.Compiler)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getSynthesizedExternsInput();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.Compiler)v0).disableThreads();
    Object v1 = null;
    Object v2 = "i";
    Object v3 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v2));
    Object v4 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v3));
    ((com.google.javascript.jscomp.Compiler)v0).replaceScript(((com.google.javascript.jscomp.JsAst)v4));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "$";
    Object v2 = "";
    Object v3 = new java.lang.Exception(((java.lang.String)v2));
    ((com.google.javascript.jscomp.Compiler)v0).throwInternalError(((java.lang.String)v1),((java.lang.Exception)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getInputsInOrder();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getResult();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.CompilerOptions();
    Object v2 = new com.google.javascript.jscomp.DefaultPassConfig(((com.google.javascript.jscomp.CompilerOptions)v1));
    ((com.google.javascript.jscomp.Compiler)v0).setPassConfig(((com.google.javascript.jscomp.PassConfig)v2));
    Object v3 = null;
    Object v4 = ((com.google.javascript.jscomp.Compiler)v0).isInliningForbidden();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getState();
    Object v2 = ((com.google.javascript.jscomp.Compiler)v0).hasHaltingErrors();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getTopScope();
    Object v2 = ((com.google.javascript.jscomp.Compiler)v0).getReverseAbstractInterpreter();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "!";
    Object v2 = -27;
    Object v3 = ((com.google.javascript.jscomp.Compiler)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
    Object v5 = 21;
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = ((com.google.javascript.jscomp.Compiler)v6).getState();
    Object v8 = "k";
    Object v9 = ((com.google.javascript.jscomp.Compiler)v6).parseTestCode(((java.lang.String)v8));
    ((com.google.javascript.jscomp.Compiler)v0).toSource(((com.google.javascript.jscomp.Compiler.CodeBuilder)v4),(((java.lang.Integer)v5).intValue()),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "[^\\w$]";
    Object v2 = -30;
    Object v3 = ((com.google.javascript.jscomp.Compiler)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = "U";
    Object v1 = "";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = new java.io.PrintStream(((java.io.File)v2));
    Object v4 = 0L;
    ((java.io.PrintStream)v3).println((((java.lang.Long)v4).longValue()));
    Object v5 = null;
    Object v6 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v3));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = "U";
    Object v1 = "";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = new java.io.PrintStream(((java.io.File)v2));
    Object v4 = 0L;
    ((java.io.PrintStream)v3).println((((java.lang.Long)v4).longValue()));
    Object v5 = null;
    Object v6 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v3));
    Object v7 = ((com.google.javascript.jscomp.Compiler)v6).getTypeValidator();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = "U";
    Object v1 = "";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = new java.io.PrintStream(((java.io.File)v2));
    Object v4 = 0L;
    ((java.io.PrintStream)v3).println((((java.lang.Long)v4).longValue()));
    Object v5 = null;
    Object v6 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v3));
    Object v7 = "U";
    Object v8 = "";
    Object v9 = new java.io.File(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = new java.io.PrintStream(((java.io.File)v9));
    Object v11 = 0L;
    ((java.io.PrintStream)v10).println((((java.lang.Long)v11).longValue()));
    Object v12 = null;
    Object v13 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v10));
    Object v14 = true;
    Object v15 = new com.google.javascript.jscomp.CoalesceVariableNames(((com.google.javascript.jscomp.AbstractCompiler)v13),(((java.lang.Boolean)v14).booleanValue()));
    ((com.google.javascript.jscomp.Compiler)v6).process(((com.google.javascript.jscomp.CompilerPass)v15));
    Object v16 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = true;
    Object v3 = com.google.javascript.jscomp.Compiler.runCallable(((java.util.concurrent.Callable)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = "U";
    Object v1 = "";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = new java.io.PrintStream(((java.io.File)v2));
    Object v4 = 0L;
    ((java.io.PrintStream)v3).println((((java.lang.Long)v4).longValue()));
    Object v5 = null;
    Object v6 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v3));
    Object v7 = ((com.google.javascript.jscomp.Compiler)v6).getState();
    ((com.google.javascript.jscomp.Compiler)v6).reportCodeChange();
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = "U";
    Object v1 = "";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = new java.io.PrintStream(((java.io.File)v2));
    Object v4 = 0L;
    ((java.io.PrintStream)v3).println((((java.lang.Long)v4).longValue()));
    Object v5 = null;
    Object v6 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v3));
    Object v7 = new com.google.javascript.jscomp.CompilerOptions();
    ((com.google.javascript.jscomp.Compiler)v6).initOptions(((com.google.javascript.jscomp.CompilerOptions)v7));
    Object v8 = null;
    ((com.google.javascript.jscomp.Compiler)v6).initInputsByIdMap();
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = "U";
    Object v1 = "";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = new java.io.PrintStream(((java.io.File)v2));
    Object v4 = 0L;
    ((java.io.PrintStream)v3).println((((java.lang.Long)v4).longValue()));
    Object v5 = null;
    Object v6 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v3));
    Object v7 = "U";
    Object v8 = "";
    Object v9 = new java.io.File(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = java.nio.charset.Charset.defaultCharset();
    Object v11 = com.google.javascript.jscomp.JSSourceFile.fromFile(((java.io.File)v9),((java.nio.charset.Charset)v10));
    Object v12 = ((com.google.javascript.jscomp.Compiler)v6).parse(((com.google.javascript.jscomp.SourceFile)v11));
    Object v13 = new com.google.javascript.jscomp.CodeChangeHandler.ForbiddenChange();
    ((com.google.javascript.jscomp.Compiler)v6).removeChangeHandler(((com.google.javascript.jscomp.CodeChangeHandler)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = "U";
    Object v1 = "";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = new java.io.PrintStream(((java.io.File)v2));
    Object v4 = 0L;
    ((java.io.PrintStream)v3).println((((java.lang.Long)v4).longValue()));
    Object v5 = null;
    Object v6 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v3));
    Object v7 = ((com.google.javascript.jscomp.Compiler)v6).isInliningForbidden();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = "U";
    Object v1 = "";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = new java.io.PrintStream(((java.io.File)v2));
    Object v4 = 0L;
    ((java.io.PrintStream)v3).println((((java.lang.Long)v4).longValue()));
    Object v5 = null;
    Object v6 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v3));
    Object v7 = new com.google.javascript.jscomp.JSSourceFile[]{null};
    Object v8 = new com.google.javascript.jscomp.JSSourceFile[]{};
    Object v9 = new com.google.javascript.jscomp.CompilerOptions();
    Object v10 = ((com.google.javascript.jscomp.Compiler)v6).compile(((com.google.javascript.jscomp.JSSourceFile[])v7),((com.google.javascript.jscomp.JSSourceFile[])v8),((com.google.javascript.jscomp.CompilerOptions)v9));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = "U";
    Object v1 = "";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = new java.io.PrintStream(((java.io.File)v2));
    Object v4 = 0L;
    ((java.io.PrintStream)v3).println((((java.lang.Long)v4).longValue()));
    Object v5 = null;
    Object v6 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v3));
    Object v7 = ((com.google.javascript.jscomp.Compiler)v6).newCompilerOptions();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = "U";
    Object v1 = "";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = new java.io.PrintStream(((java.io.File)v2));
    Object v4 = 0L;
    ((java.io.PrintStream)v3).println((((java.lang.Long)v4).longValue()));
    Object v5 = null;
    Object v6 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v3));
    Object v7 = ((com.google.javascript.jscomp.Compiler)v6).getCssRenamingMap();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = "U";
    Object v1 = "";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = new java.io.PrintStream(((java.io.File)v2));
    Object v4 = 0L;
    ((java.io.PrintStream)v3).println((((java.lang.Long)v4).longValue()));
    Object v5 = null;
    Object v6 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v3));
    Object v7 = ((com.google.javascript.jscomp.Compiler)v6).getErrorManager();
    Object v8 = new com.google.javascript.jscomp.Compiler();
    Object v9 = "COMMA";
    Object v10 = ((com.google.javascript.jscomp.Compiler)v8).parseTestCode(((java.lang.String)v9));
    Object v11 = com.google.javascript.jscomp.NodeUtil.getInputId(((com.google.javascript.rhino.Node)v10));
    Object v12 = ((com.google.javascript.rhino.InputId)v11).toString();
    ((com.google.javascript.jscomp.Compiler)v6).removeExternInput(((com.google.javascript.rhino.InputId)v11));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }
}
