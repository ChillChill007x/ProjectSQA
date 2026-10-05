package com.google.javascript.jscomp;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "msg.bad.namespace";
    Object v2 = ((com.google.javascript.jscomp.Compiler)v0).parseTestCode(((java.lang.String)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "/L ";
    Object v2 = 19;
    Object v3 = ((com.google.javascript.jscomp.Compiler)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).hasRegExpGlobalReferences();
    org.junit.Assert.assertEquals((Object)(true), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getExternsForTesting();
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).parseInputs();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "READ";
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = "msg.bad.namespace";
    Object v4 = ((com.google.javascript.jscomp.Compiler)v2).parseTestCode(((java.lang.String)v3));
    Object v5 = ".1";
    Object v6 = "7";
    Object v7 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = new java.lang.String[]{"function","apply",""};
    Object v9 = com.google.javascript.jscomp.JSError.make(((java.lang.String)v1),((com.google.javascript.rhino.Node)v4),((com.google.javascript.jscomp.DiagnosticType)v7),((java.lang.String[])v8));
    ((com.google.javascript.jscomp.Compiler)v0).report(((com.google.javascript.jscomp.JSError)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = " - ";
    Object v2 = ((com.google.javascript.jscomp.Compiler)v0).newExternInput(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getErrorManager();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).acceptEcmaScript5();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.CompilerOptions();
    Object v2 = new com.google.javascript.jscomp.DefaultPassConfig(((com.google.javascript.jscomp.CompilerOptions)v1));
    ((com.google.javascript.jscomp.Compiler)v0).setPassConfig(((com.google.javascript.jscomp.PassConfig)v2));
    Object v3 = null;
    Object v4 = ((com.google.javascript.jscomp.Compiler)v0).getTypeRegistry();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = true;
    Object v3 = com.google.javascript.jscomp.Compiler.runCallable(((java.util.concurrent.Callable)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getCodingConvention();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.CompilerOptions();
    ((com.google.javascript.jscomp.Compiler)v0).initOptions(((com.google.javascript.jscomp.CompilerOptions)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).buildKnownSymbolTable();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ")";
    Object v2 = "y";
    Object v3 = com.google.javascript.jscomp.SourceFile.fromCode(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v3));
    ((com.google.javascript.jscomp.JsAst)v4).clearAst();
    Object v5 = null;
    Object v6 = ((com.google.javascript.jscomp.Compiler)v0).replaceIncrementalSourceAst(((com.google.javascript.jscomp.JsAst)v4));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.CompilerOptions();
    Object v2 = com.google.javascript.jscomp.CheckLevel.ERROR;
    ((com.google.javascript.jscomp.CompilerOptions)v1).setReportMissingOverride(((com.google.javascript.jscomp.CheckLevel)v2));
    Object v3 = null;
    ((com.google.javascript.jscomp.Compiler)v0).initOptions(((com.google.javascript.jscomp.CompilerOptions)v1));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getTypeValidator();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ")";
    Object v2 = "y";
    Object v3 = com.google.javascript.jscomp.SourceFile.fromCode(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v3));
    ((com.google.javascript.jscomp.JsAst)v4).clearAst();
    Object v5 = null;
    ((com.google.javascript.jscomp.Compiler)v0).addIncrementalSourceAst(((com.google.javascript.jscomp.JsAst)v4));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getVariableMap();
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.Compiler();
    Object v2 = ((com.google.javascript.jscomp.Compiler)v1).getErrorManager();
    ((com.google.javascript.jscomp.Compiler)v0).setErrorManager(((com.google.javascript.jscomp.ErrorManager)v2));
    Object v3 = null;
    Object v4 = "JSCompiler_renmeProperty";
    ((com.google.javascript.jscomp.Compiler)v0).startPass(((java.lang.String)v4));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.Compiler();
    Object v2 = "msg.bad.namespace";
    Object v3 = ((com.google.javascript.jscomp.Compiler)v1).parseTestCode(((java.lang.String)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = "msg.bad.namespace";
    Object v6 = ((com.google.javascript.jscomp.Compiler)v4).parseTestCode(((java.lang.String)v5));
    Object v7 = ((com.google.javascript.jscomp.Compiler)v0).areNodesEqualForInlining(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.Node)v6));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).createPassConfigInternal();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "t'rue";
    ((com.google.javascript.jscomp.Compiler)v0).removeExternInput(((java.lang.String)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.Compiler)v0).endPass();
    Object v1 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "J";
    Object v2 = com.google.javascript.jscomp.JSSourceFile.fromFile(((java.lang.String)v1));
    Object v3 = ((com.google.javascript.jscomp.Compiler)v0).parse(((com.google.javascript.jscomp.JSSourceFile)v2));
    Object v4 = ((com.google.javascript.jscomp.Compiler)v0).getReverseAbstractInterpreter();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.CompilerOptions();
    Object v2 = new com.google.javascript.jscomp.CompilerOptions();
    Object v3 = java.util.Set.of(((java.lang.Object)v1),((java.lang.Object)v2));
    Object v4 = new com.google.javascript.jscomp.CompilerOptions();
    Object v5 = new com.google.javascript.jscomp.CompilerOptions();
    Object v6 = java.util.Set.of(((java.lang.Object)v4),((java.lang.Object)v5));
    Object v7 = new com.google.javascript.jscomp.CompilerOptions();
    Object v8 = new com.google.javascript.jscomp.CompilerOptions();
    Object v9 = java.util.Set.of(((java.lang.Object)v7),((java.lang.Object)v8));
    Object v10 = new com.google.javascript.jscomp.CompilerOptions();
    Object v11 = new com.google.javascript.jscomp.CompilerOptions();
    Object v12 = java.util.Set.of(((java.lang.Object)v10),((java.lang.Object)v11));
    ((com.google.javascript.jscomp.Compiler)v0).stripCode(((java.util.Set)v3),((java.util.Set)v6),((java.util.Set)v9),((java.util.Set)v12));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
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
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).ensureDefaultPassConfig();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "J";
    Object v2 = com.google.javascript.jscomp.JSSourceFile.fromFile(((java.lang.String)v1));
    Object v3 = new com.google.javascript.jscomp.JSSourceFile[]{};
    Object v4 = new com.google.javascript.jscomp.CompilerOptions();
    Object v5 = ((com.google.javascript.jscomp.Compiler)v0).compile(((com.google.javascript.jscomp.JSSourceFile)v2),((com.google.javascript.jscomp.JSSourceFile[])v3),((com.google.javascript.jscomp.CompilerOptions)v4));
    Object v6 = ((com.google.javascript.jscomp.Compiler)v0).getTypeValidator();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "J";
    Object v2 = com.google.javascript.jscomp.JSSourceFile.fromFile(((java.lang.String)v1));
    Object v3 = ((com.google.javascript.jscomp.Compiler)v0).parse(((com.google.javascript.jscomp.JSSourceFile)v2));
    Object v4 = java.util.function.Function.identity();
    Object v5 = java.util.Comparator.comparing(((java.util.function.Function)v4));
    Object v6 = new java.util.TreeMap(((java.util.Comparator)v5));
    Object v7 = new java.util.TreeMap(((java.util.SortedMap)v6));
    Object v8 = new com.google.javascript.jscomp.Compiler();
    Object v9 = "msg.bad.namespace";
    Object v10 = ((com.google.javascript.jscomp.Compiler)v8).parseTestCode(((java.lang.String)v9));
    ((com.google.javascript.jscomp.Compiler)v0).updateGlobalVarReferences(((java.util.Map)v7),((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).precheck();
    org.junit.Assert.assertEquals((Object)(true), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = "";
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = "msg.bad.namespace";
    Object v5 = ((com.google.javascript.jscomp.Compiler)v3).parseTestCode(((java.lang.String)v4));
    Object v6 = new com.google.javascript.jscomp.JsMessageVisitor.MalformedException(((java.lang.String)v2),((com.google.javascript.rhino.Node)v5));
    ((com.google.javascript.jscomp.Compiler)v0).throwInternalError(((java.lang.String)v1),((java.lang.Exception)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.Compiler)v0).check();
    Object v1 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.JSSourceFile[]{null,null};
    Object v2 = new com.google.javascript.jscomp.JSSourceFile[]{null,null};
    Object v3 = new com.google.javascript.jscomp.CompilerOptions();
    Object v4 = ((com.google.javascript.jscomp.Compiler)v0).compile(((com.google.javascript.jscomp.JSSourceFile[])v1),((com.google.javascript.jscomp.JSSourceFile[])v2),((com.google.javascript.jscomp.CompilerOptions)v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    ((com.google.javascript.jscomp.Compiler)v0).removeExternInput(((java.lang.String)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.Compiler)v0).optimize();
    Object v1 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getCssRenamingMap();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "J";
    Object v2 = com.google.javascript.jscomp.JSSourceFile.fromFile(((java.lang.String)v1));
    Object v3 = "J";
    Object v4 = com.google.javascript.jscomp.JSSourceFile.fromFile(((java.lang.String)v3));
    Object v5 = new com.google.javascript.jscomp.CompilerOptions();
    Object v6 = ((com.google.javascript.jscomp.Compiler)v0).compile(((com.google.javascript.jscomp.JSSourceFile)v2),((com.google.javascript.jscomp.JSSourceFile)v4),((com.google.javascript.jscomp.CompilerOptions)v5));
    Object v7 = new com.google.javascript.jscomp.CompilerOptions();
    Object v8 = new com.google.javascript.jscomp.CompilerOptions();
    Object v9 = java.util.Set.of(((java.lang.Object)v7),((java.lang.Object)v8));
    Object v10 = ((java.util.Collection)v9).parallelStream();
    Object v11 = new com.google.javascript.jscomp.CompilerOptions();
    Object v12 = new com.google.javascript.jscomp.CompilerOptions();
    Object v13 = java.util.Set.of(((java.lang.Object)v11),((java.lang.Object)v12));
    Object v14 = new com.google.javascript.jscomp.CompilerOptions();
    Object v15 = new com.google.javascript.jscomp.CompilerOptions();
    Object v16 = java.util.Set.of(((java.lang.Object)v14),((java.lang.Object)v15));
    Object v17 = ((java.util.Set)v16).hashCode();
    Object v18 = new com.google.javascript.jscomp.CompilerOptions();
    Object v19 = new com.google.javascript.jscomp.CompilerOptions();
    Object v20 = java.util.Set.of(((java.lang.Object)v18),((java.lang.Object)v19));
    ((com.google.javascript.jscomp.Compiler)v0).stripCode(((java.util.Set)v9),((java.util.Set)v13),((java.util.Set)v16),((java.util.Set)v20));
    Object v21 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getTopScope();
    ((com.google.javascript.jscomp.Compiler)v0).initInputsByNameMap();
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ".";
    Object v2 = -46;
    Object v3 = ((com.google.javascript.jscomp.Compiler)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "Parsingo ";
    Object v2 = 1;
    Object v3 = ((com.google.javascript.jscomp.Compiler)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.Compiler)v0).initCompilerOptionsIfTesting();
    Object v1 = null;
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "o";
    Object v2 = 11;
    Object v3 = ((com.google.javascript.jscomp.Compiler)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).hasErrors();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.Compiler();
    Object v2 = "msg.bad.namespace";
    Object v3 = ((com.google.javascript.jscomp.Compiler)v1).parseTestCode(((java.lang.String)v2));
    ((com.google.javascript.jscomp.Compiler)v0).prepareAst(((com.google.javascript.rhino.Node)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "READ";
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = "msg.bad.namespace";
    Object v4 = ((com.google.javascript.jscomp.Compiler)v2).parseTestCode(((java.lang.String)v3));
    Object v5 = ".1";
    Object v6 = "7";
    Object v7 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = new java.lang.String[]{"function","apply",""};
    Object v9 = com.google.javascript.jscomp.JSError.make(((java.lang.String)v1),((com.google.javascript.rhino.Node)v4),((com.google.javascript.jscomp.DiagnosticType)v7),((java.lang.String[])v8));
    ((com.google.javascript.jscomp.Compiler)v0).report(((com.google.javascript.jscomp.JSError)v9));
    Object v10 = null;
    Object v11 = "$";
    Object v12 = ((com.google.javascript.jscomp.Compiler)v0).newTracer(((java.lang.String)v11));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).isTypeCheckingEnabled();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.Compiler)v0).resetUniqueNameId();
    Object v1 = null;
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.Compiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = ((com.google.javascript.jscomp.Compiler)v0).getCodingConvention();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.Compiler)v0).initInputsByNameMap();
    Object v1 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getAstDotGraph();
    org.junit.Assert.assertEquals((Object)(""), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ")";
    Object v2 = "y";
    Object v3 = com.google.javascript.jscomp.SourceFile.fromCode(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v3));
    Object v5 = ")";
    Object v6 = "y";
    Object v7 = com.google.javascript.jscomp.SourceFile.fromCode(((java.lang.String)v5),((java.lang.String)v6));
    ((com.google.javascript.jscomp.JsAst)v4).setSourceFile(((com.google.javascript.jscomp.SourceFile)v7));
    Object v8 = null;
    ((com.google.javascript.jscomp.Compiler)v0).addIncrementalSourceAst(((com.google.javascript.jscomp.JsAst)v4));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.Compiler();
    Object v2 = ((com.google.javascript.jscomp.Compiler)v1).createPassConfigInternal();
    ((com.google.javascript.jscomp.Compiler)v0).setPassConfig(((com.google.javascript.jscomp.PassConfig)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.Compiler)v0).parse();
    Object v1 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.CompilerOptions();
    ((com.google.javascript.jscomp.Compiler)v0).initOptions(((com.google.javascript.jscomp.CompilerOptions)v1));
    Object v2 = null;
    Object v3 = ((com.google.javascript.jscomp.Compiler)v0).isInliningForbidden();
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.CompilerOptions();
    ((com.google.javascript.jscomp.Compiler)v0).initOptions(((com.google.javascript.jscomp.CompilerOptions)v1));
    Object v2 = null;
    ((com.google.javascript.jscomp.Compiler)v0).reportCodeChange();
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getResult();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "#";
    Object v2 = ((com.google.javascript.jscomp.Compiler)v0).newExternInput(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "J";
    Object v2 = com.google.javascript.jscomp.JSSourceFile.fromFile(((java.lang.String)v1));
    Object v3 = new com.google.javascript.jscomp.JSModule[]{};
    Object v4 = new com.google.javascript.jscomp.CompilerOptions();
    Object v5 = ((com.google.javascript.jscomp.Compiler)v0).compile(((com.google.javascript.jscomp.JSSourceFile)v2),((com.google.javascript.jscomp.JSModule[])v3),((com.google.javascript.jscomp.CompilerOptions)v4));
    Object v6 = ((com.google.javascript.jscomp.Compiler)v0).getAstDotGraph();
    org.junit.Assert.assertEquals((Object)(""), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getTypeRegistry();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.Compiler)v0).rebuildInputsFromModules();
    Object v1 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getState();
    Object v2 = "";
    Object v3 = new com.google.javascript.jscomp.Tracer(((java.lang.String)v2));
    Object v4 = ((com.google.javascript.jscomp.Tracer)v3).toString();
    Object v5 = "prot:otype";
    ((com.google.javascript.jscomp.Compiler)v0).stopTracer(((com.google.javascript.jscomp.Tracer)v3),((java.lang.String)v5));
    Object v6 = null;
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
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getErrorManager();
    Object v2 = "jscompiler";
    Object v3 = -3;
    Object v4 = ((com.google.javascript.jscomp.Compiler)v0).getSourceLine(((java.lang.String)v2),(((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "J";
    Object v2 = com.google.javascript.jscomp.JSSourceFile.fromFile(((java.lang.String)v1));
    Object v3 = "J";
    Object v4 = com.google.javascript.jscomp.JSSourceFile.fromFile(((java.lang.String)v3));
    Object v5 = new com.google.javascript.jscomp.CompilerOptions();
    Object v6 = ((com.google.javascript.jscomp.Compiler)v0).compile(((com.google.javascript.jscomp.JSSourceFile)v2),((com.google.javascript.jscomp.JSSourceFile)v4),((com.google.javascript.jscomp.CompilerOptions)v5));
    Object v7 = ((com.google.javascript.jscomp.Compiler)v0).parseInputs();
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "READ";
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = "msg.bad.namespace";
    Object v4 = ((com.google.javascript.jscomp.Compiler)v2).parseTestCode(((java.lang.String)v3));
    Object v5 = ".1";
    Object v6 = "7";
    Object v7 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = new java.lang.String[]{"function","apply",""};
    Object v9 = com.google.javascript.jscomp.JSError.make(((java.lang.String)v1),((com.google.javascript.rhino.Node)v4),((com.google.javascript.jscomp.DiagnosticType)v7),((java.lang.String[])v8));
    ((com.google.javascript.jscomp.Compiler)v0).report(((com.google.javascript.jscomp.JSError)v9));
    Object v10 = null;
    Object v11 = "N";
    Object v12 = new com.google.javascript.jscomp.JSModule(((java.lang.String)v11));
    Object v13 = ((com.google.javascript.jscomp.Compiler)v0).getNodeForCodeInsertion(((com.google.javascript.jscomp.JSModule)v12));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "J";
    Object v2 = com.google.javascript.jscomp.JSSourceFile.fromFile(((java.lang.String)v1));
    Object v3 = "J";
    Object v4 = com.google.javascript.jscomp.JSSourceFile.fromFile(((java.lang.String)v3));
    Object v5 = new com.google.javascript.jscomp.CompilerOptions();
    Object v6 = ((com.google.javascript.jscomp.Compiler)v0).compile(((com.google.javascript.jscomp.JSSourceFile)v2),((com.google.javascript.jscomp.JSSourceFile)v4),((com.google.javascript.jscomp.CompilerOptions)v5));
    Object v7 = ((com.google.javascript.jscomp.Compiler)v0).hasHaltingErrors();
    org.junit.Assert.assertEquals((Object)(true), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).isInliningForbidden();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getState();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "N";
    Object v2 = new com.google.javascript.jscomp.JSModule(((java.lang.String)v1));
    Object v3 = ((com.google.javascript.jscomp.Compiler)v0).getNodeForCodeInsertion(((com.google.javascript.jscomp.JSModule)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.google.javascript.jscomp.Compiler.runCallableWithLargeStack(((java.util.concurrent.Callable)v0));
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.Compiler();
    Object v2 = ((com.google.javascript.jscomp.Compiler)v1).getState();
    ((com.google.javascript.jscomp.Compiler)v0).setState(((com.google.javascript.jscomp.Compiler.IntermediateState)v2));
    Object v3 = null;
    Object v4 = java.util.function.Function.identity();
    Object v5 = java.util.Comparator.comparing(((java.util.function.Function)v4));
    Object v6 = new java.util.TreeMap(((java.util.Comparator)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = "msg.bad.namespace";
    Object v9 = ((com.google.javascript.jscomp.Compiler)v7).parseTestCode(((java.lang.String)v8));
    ((com.google.javascript.jscomp.Compiler)v0).updateGlobalVarReferences(((java.util.Map)v6),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getReverseAbstractInterpreter();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = -61;
    Object v3 = ((com.google.javascript.jscomp.Compiler)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    ((com.google.javascript.jscomp.Compiler)v0).initCompilerOptionsIfTesting();
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getAstDotGraph();
    Object v2 = ((com.google.javascript.jscomp.Compiler)v0).getParserConfig();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).acceptConstKeyword();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.Compiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = ((com.google.javascript.jscomp.Compiler)v0).getParserConfig();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.Compiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.CompilerOptions();
    Object v3 = new com.google.javascript.jscomp.DefaultPassConfig(((com.google.javascript.jscomp.CompilerOptions)v2));
    ((com.google.javascript.jscomp.Compiler)v0).setPassConfig(((com.google.javascript.jscomp.PassConfig)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "J";
    Object v2 = com.google.javascript.jscomp.JSSourceFile.fromFile(((java.lang.String)v1));
    Object v3 = "J";
    Object v4 = com.google.javascript.jscomp.JSSourceFile.fromFile(((java.lang.String)v3));
    Object v5 = new com.google.javascript.jscomp.CompilerOptions();
    Object v6 = ((com.google.javascript.jscomp.Compiler)v0).compile(((com.google.javascript.jscomp.JSSourceFile)v2),((com.google.javascript.jscomp.JSSourceFile)v4),((com.google.javascript.jscomp.CompilerOptions)v5));
    ((com.google.javascript.jscomp.Compiler)v0).check();
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getTopScope();
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getWarningCount();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "4";
    Object v2 = "m";
    Object v3 = ((com.google.javascript.jscomp.Compiler)v0).parseSyntheticCode(((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "3";
    Object v2 = ((com.google.javascript.jscomp.Compiler)v0).newExternInput(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = new com.google.javascript.jscomp.Tracer(((java.lang.String)v1));
    Object v3 = "function ";
    ((com.google.javascript.jscomp.Compiler)v0).stopTracer(((com.google.javascript.jscomp.Tracer)v2),((java.lang.String)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = new com.google.javascript.jscomp.Tracer(((java.lang.String)v1));
    Object v3 = ((com.google.javascript.jscomp.Tracer)v2).toString();
    Object v4 = "nQll";
    ((com.google.javascript.jscomp.Compiler)v0).stopTracer(((com.google.javascript.jscomp.Tracer)v2),((java.lang.String)v4));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
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
    Object v1 = new com.google.javascript.jscomp.Compiler();
    Object v2 = new com.google.javascript.jscomp.ObjectPropertyStringPreprocess(((com.google.javascript.jscomp.AbstractCompiler)v1));
    ((com.google.javascript.jscomp.Compiler)v0).process(((com.google.javascript.jscomp.CompilerPass)v2));
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getExternsInOrder();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.Compiler();
    Object v2 = ((com.google.javascript.jscomp.Compiler)v1).getErrorManager();
    ((com.google.javascript.jscomp.Compiler)v0).setErrorManager(((com.google.javascript.jscomp.ErrorManager)v2));
    Object v3 = null;
    Object v4 = ((com.google.javascript.jscomp.Compiler)v0).getReverseAbstractInterpreter();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "READ";
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = "msg.bad.namespace";
    Object v4 = ((com.google.javascript.jscomp.Compiler)v2).parseTestCode(((java.lang.String)v3));
    Object v5 = ".1";
    Object v6 = "7";
    Object v7 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = new java.lang.String[]{"function","apply",""};
    Object v9 = com.google.javascript.jscomp.JSError.make(((java.lang.String)v1),((com.google.javascript.rhino.Node)v4),((com.google.javascript.jscomp.DiagnosticType)v7),((java.lang.String[])v8));
    ((com.google.javascript.jscomp.Compiler)v0).report(((com.google.javascript.jscomp.JSError)v9));
    Object v10 = null;
    ((com.google.javascript.jscomp.Compiler)v0).recordFunctionInformation();
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "READ";
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = "msg.bad.namespace";
    Object v4 = ((com.google.javascript.jscomp.Compiler)v2).parseTestCode(((java.lang.String)v3));
    Object v5 = ".1";
    Object v6 = "7";
    Object v7 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = new java.lang.String[]{"function","apply",""};
    Object v9 = com.google.javascript.jscomp.JSError.make(((java.lang.String)v1),((com.google.javascript.rhino.Node)v4),((com.google.javascript.jscomp.DiagnosticType)v7),((java.lang.String[])v8));
    ((com.google.javascript.jscomp.Compiler)v0).report(((com.google.javascript.jscomp.JSError)v9));
    Object v10 = null;
    Object v11 = "cal*l";
    Object v12 = ((com.google.javascript.jscomp.Compiler)v0).newExternInput(((java.lang.String)v11));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "J";
    Object v2 = com.google.javascript.jscomp.JSSourceFile.fromFile(((java.lang.String)v1));
    Object v3 = new com.google.javascript.jscomp.JSSourceFile[]{};
    Object v4 = new com.google.javascript.jscomp.CompilerOptions();
    Object v5 = ((com.google.javascript.jscomp.Compiler)v0).compile(((com.google.javascript.jscomp.JSSourceFile)v2),((com.google.javascript.jscomp.JSSourceFile[])v3),((com.google.javascript.jscomp.CompilerOptions)v4));
    Object v6 = ((com.google.javascript.jscomp.Compiler)v0).languageMode();
    org.junit.Assert.assertEquals((Object)(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.Compiler)v0).reportCodeChange();
    Object v1 = null;
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.Compiler)v0).disableThreads();
    Object v1 = null;
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.Compiler();
    Object v2 = ((com.google.javascript.jscomp.Compiler)v1).getState();
    ((com.google.javascript.jscomp.Compiler)v0).setState(((com.google.javascript.jscomp.Compiler.IntermediateState)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ":H";
    ((com.google.javascript.jscomp.Compiler)v0).removeExternInput(((java.lang.String)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getSourceMap();
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getState();
    Object v2 = "";
    ((com.google.javascript.jscomp.Compiler)v0).removeExternInput(((java.lang.String)v2));
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ")";
    Object v2 = "y";
    Object v3 = com.google.javascript.jscomp.SourceFile.fromCode(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v3));
    Object v5 = ((com.google.javascript.jscomp.Compiler)v0).replaceIncrementalSourceAst(((com.google.javascript.jscomp.JsAst)v4));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ")";
    ((com.google.javascript.jscomp.Compiler)v0).startPass(((java.lang.String)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }
}
