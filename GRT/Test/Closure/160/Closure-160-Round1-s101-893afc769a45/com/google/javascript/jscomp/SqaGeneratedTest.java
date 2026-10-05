package com.google.javascript.jscomp;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "get";
    Object v2 = ((com.google.javascript.jscomp.Compiler)v0).parseTestCode(((java.lang.String)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).computeCFG();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.CompilerOptions();
    Object v2 = new com.google.javascript.jscomp.DefaultPassConfig(((com.google.javascript.jscomp.CompilerOptions)v1));
    ((com.google.javascript.jscomp.Compiler)v0).setPassConfig(((com.google.javascript.jscomp.PassConfig)v2));
    Object v3 = null;
    Object v4 = ((com.google.javascript.jscomp.Compiler)v0).parseInputs();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getAstDotGraph();
    Object v2 = "";
    Object v3 = "Date";
    Object v4 = "";
    Object v5 = 33;
    Object v6 = "2BLOCK";
    Object v7 = 1;
    Object v8 = new com.google.javascript.rhino.EvaluatorException(((java.lang.String)v3),((java.lang.String)v4),(((java.lang.Integer)v5).intValue()),((java.lang.String)v6),(((java.lang.Integer)v7).intValue()));
    ((com.google.javascript.jscomp.Compiler)v0).throwInternalError(((java.lang.String)v2),((java.lang.Exception)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getState();
    Object v2 = ((com.google.javascript.jscomp.Compiler)v0).acceptEcmaScript5();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).isInliningForbidden();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).parseInputs();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getReverseAbstractInterpreter();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getPassConfig();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getCodingConvention();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.Compiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = "get";
    Object v4 = ((com.google.javascript.jscomp.Compiler)v2).parseTestCode(((java.lang.String)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = "get";
    Object v7 = ((com.google.javascript.jscomp.Compiler)v5).parseTestCode(((java.lang.String)v6));
    Object v8 = ((com.google.javascript.rhino.Node)v4).copyInformationFromForTree(((com.google.javascript.rhino.Node)v7));
    Object v9 = ((com.google.javascript.jscomp.Compiler)v0).toSource(((com.google.javascript.rhino.Node)v4));
    org.junit.Assert.assertEquals((Object)("get"), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getAstDotGraph();
    org.junit.Assert.assertEquals((Object)(""), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "!";
    Object v2 = -47;
    Object v3 = ((com.google.javascript.jscomp.Compiler)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((com.google.javascript.jscomp.Compiler)v0).getParserConfig();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = ((com.google.javascript.jscomp.Compiler)v0).newTracer(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.CodeChangeHandler.ForbiddenChange();
    ((com.google.javascript.jscomp.Compiler)v0).addChangeHandler(((com.google.javascript.jscomp.CodeChangeHandler)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "i--";
    Object v2 = new java.io.File(((java.lang.String)v1));
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.JSSourceFile.fromFile(((java.io.File)v2),((java.nio.charset.Charset)v3));
    Object v5 = new com.google.javascript.jscomp.JSModule[]{};
    Object v6 = new com.google.javascript.jscomp.CompilerOptions();
    Object v7 = ((com.google.javascript.jscomp.Compiler)v0).compile(((com.google.javascript.jscomp.JSSourceFile)v4),((com.google.javascript.jscomp.JSModule[])v5),((com.google.javascript.jscomp.CompilerOptions)v6));
    Object v8 = ((com.google.javascript.jscomp.Compiler)v0).getTypeValidator();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.Compiler)v0).initInputsByNameMap();
    Object v1 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.CompilerOptions();
    Object v2 = new com.google.javascript.jscomp.DefaultPassConfig(((com.google.javascript.jscomp.CompilerOptions)v1));
    ((com.google.javascript.jscomp.Compiler)v0).setPassConfig(((com.google.javascript.jscomp.PassConfig)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "i--";
    Object v2 = new java.io.File(((java.lang.String)v1));
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.JSSourceFile.fromFile(((java.io.File)v2),((java.nio.charset.Charset)v3));
    Object v5 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v4));
    Object v6 = ((com.google.javascript.jscomp.Compiler)v0).replaceIncrementalSourceAst(((com.google.javascript.jscomp.JsAst)v5));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "i--";
    Object v2 = new java.io.File(((java.lang.String)v1));
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.JSSourceFile.fromFile(((java.io.File)v2),((java.nio.charset.Charset)v3));
    Object v5 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v4));
    Object v6 = "i--";
    Object v7 = new java.io.File(((java.lang.String)v6));
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = com.google.javascript.jscomp.JSSourceFile.fromFile(((java.io.File)v7),((java.nio.charset.Charset)v8));
    ((com.google.javascript.jscomp.JsAst)v5).setSourceFile(((com.google.javascript.jscomp.SourceFile)v9));
    Object v10 = null;
    Object v11 = ((com.google.javascript.jscomp.Compiler)v0).replaceIncrementalSourceAst(((com.google.javascript.jscomp.JsAst)v5));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getErrorManager();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "?prototype";
    Object v2 = new com.google.javascript.jscomp.JSModule(((java.lang.String)v1));
    Object v3 = ((com.google.javascript.jscomp.Compiler)v0).toSourceArray(((com.google.javascript.jscomp.JSModule)v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "i--";
    Object v2 = new java.io.File(((java.lang.String)v1));
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.JSSourceFile.fromFile(((java.io.File)v2),((java.nio.charset.Charset)v3));
    Object v5 = "i--";
    Object v6 = new java.io.File(((java.lang.String)v5));
    Object v7 = java.nio.charset.Charset.defaultCharset();
    Object v8 = com.google.javascript.jscomp.JSSourceFile.fromFile(((java.io.File)v6),((java.nio.charset.Charset)v7));
    Object v9 = new com.google.javascript.jscomp.CompilerOptions();
    Object v10 = ((com.google.javascript.jscomp.Compiler)v0).compile(((com.google.javascript.jscomp.JSSourceFile)v4),((com.google.javascript.jscomp.JSSourceFile)v8),((com.google.javascript.jscomp.CompilerOptions)v9));
    ((com.google.javascript.jscomp.Compiler)v0).reportCodeChange();
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.Compiler();
    Object v2 = "get";
    Object v3 = ((com.google.javascript.jscomp.Compiler)v1).parseTestCode(((java.lang.String)v2));
    Object v4 = -20;
    Object v5 = -41;
    ((com.google.javascript.rhino.Node)v3).putIntProp((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = "get";
    Object v9 = ((com.google.javascript.jscomp.Compiler)v7).parseTestCode(((java.lang.String)v8));
    Object v10 = ((com.google.javascript.jscomp.Compiler)v0).areNodesEqualForInlining(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.Node)v9));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "argument";
    Object v2 = ((com.google.javascript.jscomp.Compiler)v0).newExternInput(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "Cannot call clear() after build().";
    Object v2 = 1;
    Object v3 = ((com.google.javascript.jscomp.Compiler)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "prototype";
    Object v2 = "Date";
    Object v3 = "";
    Object v4 = 33;
    Object v5 = "2BLOCK";
    Object v6 = 1;
    Object v7 = new com.google.javascript.rhino.EvaluatorException(((java.lang.String)v2),((java.lang.String)v3),(((java.lang.Integer)v4).intValue()),((java.lang.String)v5),(((java.lang.Integer)v6).intValue()));
    ((com.google.javascript.jscomp.Compiler)v0).throwInternalError(((java.lang.String)v1),((java.lang.Exception)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.Compiler)v0).optimize();
    Object v1 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.Compiler();
    Object v2 = ((com.google.javascript.jscomp.Compiler)v1).getErrorManager();
    ((com.google.javascript.jscomp.Compiler)v0).setErrorManager(((com.google.javascript.jscomp.ErrorManager)v2));
    Object v3 = null;
    Object v4 = "k ";
    Object v5 = new com.google.javascript.jscomp.Tracer(((java.lang.String)v4));
    Object v6 = ((com.google.javascript.jscomp.Tracer)v5).toString();
    Object v7 = "";
    ((com.google.javascript.jscomp.Compiler)v0).stopTracer(((com.google.javascript.jscomp.Tracer)v5),((java.lang.String)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.Compiler)v0).endPass();
    Object v1 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "T";
    Object v2 = 1;
    Object v3 = ((com.google.javascript.jscomp.Compiler)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "S";
    Object v2 = ((com.google.javascript.jscomp.Compiler)v0).newExternInput(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.Compiler();
    Object v2 = "get";
    Object v3 = ((com.google.javascript.jscomp.Compiler)v1).parseTestCode(((java.lang.String)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = "get";
    Object v6 = ((com.google.javascript.jscomp.Compiler)v4).parseTestCode(((java.lang.String)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = "get";
    Object v9 = ((com.google.javascript.jscomp.Compiler)v7).parseTestCode(((java.lang.String)v8));
    Object v10 = ((com.google.javascript.rhino.Node)v6).copyInformationFrom(((com.google.javascript.rhino.Node)v9));
    Object v11 = ((com.google.javascript.jscomp.Compiler)v0).areNodesEqualForInlining(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.Node)v6));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = 33;
    Object v3 = ((com.google.javascript.jscomp.Compiler)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "\u001b[/35m";
    ((com.google.javascript.jscomp.Compiler)v0).addToDebugLog(((java.lang.String)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "i--";
    Object v2 = new java.io.File(((java.lang.String)v1));
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.JSSourceFile.fromFile(((java.io.File)v2),((java.nio.charset.Charset)v3));
    Object v5 = "i--";
    Object v6 = new java.io.File(((java.lang.String)v5));
    Object v7 = java.nio.charset.Charset.defaultCharset();
    Object v8 = com.google.javascript.jscomp.JSSourceFile.fromFile(((java.io.File)v6),((java.nio.charset.Charset)v7));
    Object v9 = new com.google.javascript.jscomp.CompilerOptions();
    Object v10 = ((com.google.javascript.jscomp.Compiler)v0).compile(((com.google.javascript.jscomp.JSSourceFile)v4),((com.google.javascript.jscomp.JSSourceFile)v8),((com.google.javascript.jscomp.CompilerOptions)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.Compiler)v0).check();
    Object v1 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.Compiler();
    Object v2 = ((com.google.javascript.jscomp.Compiler)v1).getPassConfig();
    ((com.google.javascript.jscomp.Compiler)v0).setPassConfig(((com.google.javascript.jscomp.PassConfig)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getErrorManager();
    Object v2 = ((com.google.javascript.jscomp.Compiler)v0).getSourceMap();
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "&";
    Object v2 = ((com.google.javascript.jscomp.Compiler)v0).parseTestCode(((java.lang.String)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    ((com.google.javascript.jscomp.Compiler)v0).setHasRegExpGlobalReferences((((java.lang.Boolean)v1).booleanValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.Compiler();
    Object v2 = "&";
    Object v3 = ((com.google.javascript.jscomp.Compiler)v1).parseTestCode(((java.lang.String)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = "&";
    Object v6 = ((com.google.javascript.jscomp.Compiler)v4).parseTestCode(((java.lang.String)v5));
    Object v7 = ((com.google.javascript.jscomp.Compiler)v0).areNodesEqualForInlining(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.Node)v6));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "k ";
    Object v2 = new com.google.javascript.jscomp.Tracer(((java.lang.String)v1));
    Object v3 = ")";
    ((com.google.javascript.jscomp.Compiler)v0).stopTracer(((com.google.javascript.jscomp.Tracer)v2),((java.lang.String)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.CompilerOptions();
    ((com.google.javascript.jscomp.Compiler)v0).initOptions(((com.google.javascript.jscomp.CompilerOptions)v1));
    Object v2 = null;
    Object v3 = new com.google.javascript.jscomp.CompilerOptions();
    Object v4 = 0;
    ((com.google.javascript.jscomp.CompilerOptions)v3).lineLengthThreshold((((java.lang.Integer)v4).intValue()));
    Object v5 = null;
    ((com.google.javascript.jscomp.Compiler)v0).initOptions(((com.google.javascript.jscomp.CompilerOptions)v3));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getTypeRegistry();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getUniqueNameIdSupplier();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.Compiler)v0).initCompilerOptionsIfTesting();
    Object v1 = null;
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getState();
    Object v2 = ((com.google.javascript.jscomp.Compiler)v0).getTypeRegistry();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getDefaultErrorReporter();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ":|";
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = "&";
    Object v4 = ((com.google.javascript.jscomp.Compiler)v2).parseTestCode(((java.lang.String)v3));
    Object v5 = ": ";
    Object v6 = "Y";
    Object v7 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = new java.lang.String[]{"","R"};
    Object v9 = com.google.javascript.jscomp.JSError.make(((java.lang.String)v1),((com.google.javascript.rhino.Node)v4),((com.google.javascript.jscomp.DiagnosticType)v7),((java.lang.String[])v8));
    ((com.google.javascript.jscomp.Compiler)v0).report(((com.google.javascript.jscomp.JSError)v9));
    Object v10 = null;
    Object v11 = "{";
    ((com.google.javascript.jscomp.Compiler)v0).startPass(((java.lang.String)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).createPassConfigInternal();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getState();
    Object v2 = ((com.google.javascript.jscomp.Compiler)v0).getTypeValidator();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    ((com.google.javascript.jscomp.Compiler)v0).removeInput(((java.lang.String)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getPropertyMap();
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getParserConfig();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.Compiler)v0).reportCodeChange();
    Object v1 = null;
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).isTypeCheckingEnabled();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.Compiler)v0).disableThreads();
    Object v1 = null;
    Object v2 = " ";
    ((com.google.javascript.jscomp.Compiler)v0).removeInput(((java.lang.String)v2));
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "?prototype";
    Object v2 = new com.google.javascript.jscomp.JSModule(((java.lang.String)v1));
    Object v3 = ((com.google.javascript.jscomp.Compiler)v0).getNodeForCodeInsertion(((com.google.javascript.jscomp.JSModule)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getTypedScopeCreator();
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.JSSourceFile[]{};
    Object v2 = new com.google.javascript.jscomp.JSSourceFile[]{};
    Object v3 = new com.google.javascript.jscomp.CompilerOptions();
    Object v4 = ((com.google.javascript.jscomp.Compiler)v0).compile(((com.google.javascript.jscomp.JSSourceFile[])v1),((com.google.javascript.jscomp.JSSourceFile[])v2),((com.google.javascript.jscomp.CompilerOptions)v3));
    Object v5 = ((com.google.javascript.jscomp.Compiler)v0).getCodingConvention();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ":|";
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = "&";
    Object v4 = ((com.google.javascript.jscomp.Compiler)v2).parseTestCode(((java.lang.String)v3));
    Object v5 = ": ";
    Object v6 = "Y";
    Object v7 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = new java.lang.String[]{"","R"};
    Object v9 = com.google.javascript.jscomp.JSError.make(((java.lang.String)v1),((com.google.javascript.rhino.Node)v4),((com.google.javascript.jscomp.DiagnosticType)v7),((java.lang.String[])v8));
    ((com.google.javascript.jscomp.Compiler)v0).report(((com.google.javascript.jscomp.JSError)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).hasHaltingErrors();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).isIdeMode();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).precheck();
    org.junit.Assert.assertEquals((Object)(true), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.JSSourceFile[]{};
    Object v2 = new com.google.javascript.jscomp.JSSourceFile[]{};
    Object v3 = new com.google.javascript.jscomp.CompilerOptions();
    ((com.google.javascript.jscomp.Compiler)v0).init(((com.google.javascript.jscomp.JSSourceFile[])v1),((com.google.javascript.jscomp.JSSourceFile[])v2),((com.google.javascript.jscomp.CompilerOptions)v3));
    Object v4 = null;
    Object v5 = ((com.google.javascript.jscomp.Compiler)v0).getFunctionalInformationMap();
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "1";
    Object v2 = ((com.google.javascript.jscomp.Compiler)v0).parseTestCode(((java.lang.String)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "i--";
    Object v2 = new java.io.File(((java.lang.String)v1));
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.JSSourceFile.fromFile(((java.io.File)v2),((java.nio.charset.Charset)v3));
    Object v5 = "i--";
    Object v6 = new java.io.File(((java.lang.String)v5));
    Object v7 = java.nio.charset.Charset.defaultCharset();
    Object v8 = com.google.javascript.jscomp.JSSourceFile.fromFile(((java.io.File)v6),((java.nio.charset.Charset)v7));
    Object v9 = new com.google.javascript.jscomp.CompilerOptions();
    Object v10 = ((com.google.javascript.jscomp.Compiler)v0).compile(((com.google.javascript.jscomp.JSSourceFile)v4),((com.google.javascript.jscomp.JSSourceFile)v8),((com.google.javascript.jscomp.CompilerOptions)v9));
    ((com.google.javascript.jscomp.Compiler)v0).initCompilerOptionsIfTesting();
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new java.util.HashMap();
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = "&";
    Object v4 = ((com.google.javascript.jscomp.Compiler)v2).parseTestCode(((java.lang.String)v3));
    ((com.google.javascript.jscomp.Compiler)v0).updateGlobalVarReferences(((java.util.Map)v1),((com.google.javascript.rhino.Node)v4));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "i--";
    Object v2 = new java.io.File(((java.lang.String)v1));
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.JSSourceFile.fromFile(((java.io.File)v2),((java.nio.charset.Charset)v3));
    Object v5 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v4));
    ((com.google.javascript.jscomp.Compiler)v0).addIncrementalSourceAst(((com.google.javascript.jscomp.JsAst)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getMessages();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getState();
    Object v2 = "]";
    Object v3 = "Date";
    Object v4 = "";
    Object v5 = 33;
    Object v6 = "2BLOCK";
    Object v7 = 1;
    Object v8 = new com.google.javascript.rhino.EvaluatorException(((java.lang.String)v3),((java.lang.String)v4),(((java.lang.Integer)v5).intValue()),((java.lang.String)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = java.io.OutputStream.nullOutputStream();
    Object v10 = new java.io.PrintWriter(((java.io.OutputStream)v9));
    ((java.lang.Throwable)v8).printStackTrace(((java.io.PrintWriter)v10));
    Object v11 = null;
    ((com.google.javascript.jscomp.Compiler)v0).throwInternalError(((java.lang.String)v2),((java.lang.Exception)v8));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
    Object v2 = -56;
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = "1";
    Object v5 = ((com.google.javascript.jscomp.Compiler)v3).parseTestCode(((java.lang.String)v4));
    ((com.google.javascript.jscomp.Compiler)v0).toSource(((com.google.javascript.jscomp.Compiler.CodeBuilder)v1),(((java.lang.Integer)v2).intValue()),((com.google.javascript.rhino.Node)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).acceptConstKeyword();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.Compiler();
    Object v2 = "&";
    Object v3 = ((com.google.javascript.jscomp.Compiler)v1).parseTestCode(((java.lang.String)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = "1";
    Object v6 = ((com.google.javascript.jscomp.Compiler)v4).parseTestCode(((java.lang.String)v5));
    Object v7 = ((com.google.javascript.rhino.Node)v3).isEquivalentTo(((com.google.javascript.rhino.Node)v6));
    Object v8 = new com.google.javascript.jscomp.Compiler();
    Object v9 = "1";
    Object v10 = ((com.google.javascript.jscomp.Compiler)v8).parseTestCode(((java.lang.String)v9));
    Object v11 = ((com.google.javascript.jscomp.Compiler)v0).areNodesEqualForInlining(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.Node)v10));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "i--";
    Object v2 = new java.io.File(((java.lang.String)v1));
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.JSSourceFile.fromFile(((java.io.File)v2),((java.nio.charset.Charset)v3));
    Object v5 = ((com.google.javascript.jscomp.Compiler)v0).parse(((com.google.javascript.jscomp.JSSourceFile)v4));
    Object v6 = ((com.google.javascript.jscomp.Compiler)v0).parseInputs();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getErrorManager();
    Object v2 = ((com.google.javascript.jscomp.Compiler)v0).getErrors();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.Compiler)v0).disableThreads();
    Object v1 = null;
    Object v2 = "?prototype";
    Object v3 = new com.google.javascript.jscomp.JSModule(((java.lang.String)v2));
    Object v4 = ((com.google.javascript.jscomp.Compiler)v0).getNodeForCodeInsertion(((com.google.javascript.jscomp.JSModule)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ":|";
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = "&";
    Object v4 = ((com.google.javascript.jscomp.Compiler)v2).parseTestCode(((java.lang.String)v3));
    Object v5 = ": ";
    Object v6 = "Y";
    Object v7 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = new java.lang.String[]{"","R"};
    Object v9 = com.google.javascript.jscomp.JSError.make(((java.lang.String)v1),((com.google.javascript.rhino.Node)v4),((com.google.javascript.jscomp.DiagnosticType)v7),((java.lang.String[])v8));
    ((com.google.javascript.jscomp.Compiler)v0).report(((com.google.javascript.jscomp.JSError)v9));
    Object v10 = null;
    Object v11 = "?prototype";
    Object v12 = new com.google.javascript.jscomp.JSModule(((java.lang.String)v11));
    Object v13 = -20;
    ((com.google.javascript.jscomp.JSModule)v12).setDepth((((java.lang.Integer)v13).intValue()));
    Object v14 = null;
    Object v15 = ((com.google.javascript.jscomp.Compiler)v0).toSourceArray(((com.google.javascript.jscomp.JSModule)v12));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "t1Source";
    ((com.google.javascript.jscomp.Compiler)v0).startPass(((java.lang.String)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "ECMASCRIPT5_STRICT";
    ((com.google.javascript.jscomp.Compiler)v0).startPass(((java.lang.String)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "k ";
    Object v2 = new com.google.javascript.jscomp.Tracer(((java.lang.String)v1));
    Object v3 = "Optimization level outside [-1";
    ((com.google.javascript.jscomp.Compiler)v0).stopTracer(((com.google.javascript.jscomp.Tracer)v2),((java.lang.String)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "i--";
    Object v2 = new java.io.File(((java.lang.String)v1));
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.JSSourceFile.fromFile(((java.io.File)v2),((java.nio.charset.Charset)v3));
    Object v5 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v4));
    ((com.google.javascript.jscomp.JsAst)v5).clearAst();
    Object v6 = null;
    ((com.google.javascript.jscomp.Compiler)v0).addIncrementalSourceAst(((com.google.javascript.jscomp.JsAst)v5));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.Compiler)v0).reportCodeChange();
    Object v1 = null;
    ((com.google.javascript.jscomp.Compiler)v0).processDefines();
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getAstDotGraph();
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = ((com.google.javascript.jscomp.Compiler)v2).getErrorManager();
    Object v4 = 53.67751748629195D;
    ((com.google.javascript.jscomp.ErrorManager)v3).setTypedPercent((((java.lang.Double)v4).doubleValue()));
    Object v5 = null;
    ((com.google.javascript.jscomp.Compiler)v0).setErrorManager(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "JSC_CATCH_BLOCK_VAR_ERROR";
    Object v2 = -11;
    Object v3 = ((com.google.javascript.jscomp.Compiler)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getErrorManager();
    Object v2 = ":|";
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = "&";
    Object v5 = ((com.google.javascript.jscomp.Compiler)v3).parseTestCode(((java.lang.String)v4));
    Object v6 = ": ";
    Object v7 = "Y";
    Object v8 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = new java.lang.String[]{"","R"};
    Object v10 = com.google.javascript.jscomp.JSError.make(((java.lang.String)v2),((com.google.javascript.rhino.Node)v5),((com.google.javascript.jscomp.DiagnosticType)v8),((java.lang.String[])v9));
    ((com.google.javascript.jscomp.Compiler)v0).report(((com.google.javascript.jscomp.JSError)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "amiguousFunctionDecl";
    Object v2 = ((com.google.javascript.jscomp.Compiler)v0).newTracer(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.Compiler)v0).disableThreads();
    Object v1 = null;
    Object v2 = ((com.google.javascript.jscomp.Compiler)v0).acceptEcmaScript5();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "undefine";
    Object v2 = ((com.google.javascript.jscomp.Compiler)v0).parseTestCode(((java.lang.String)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "v";
    ((com.google.javascript.jscomp.Compiler)v0).startPass(((java.lang.String)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.CompilerOptions();
    ((com.google.javascript.jscomp.Compiler)v0).initOptions(((com.google.javascript.jscomp.CompilerOptions)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getModuleGraph();
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getInputsForTesting();
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.Compiler)v0).recordFunctionInformation();
    Object v1 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).acceptEcmaScript5();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v1));
    Object v3 = new java.util.HashMap();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = "1";
    Object v6 = ((com.google.javascript.jscomp.Compiler)v4).parseTestCode(((java.lang.String)v5));
    Object v7 = ((com.google.javascript.rhino.Node)v6).cloneNode();
    ((com.google.javascript.jscomp.Compiler)v2).updateGlobalVarReferences(((java.util.Map)v3),((com.google.javascript.rhino.Node)v6));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v1));
    ((com.google.javascript.jscomp.Compiler)v2).recordFunctionInformation();
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }
}
