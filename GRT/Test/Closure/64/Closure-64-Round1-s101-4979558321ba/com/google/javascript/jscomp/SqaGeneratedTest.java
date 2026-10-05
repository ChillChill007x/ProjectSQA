package com.google.javascript.jscomp;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "msg.no.name.after.coloncolon";
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
    Object v3 = "Ar";
    Object v4 = "";
    Object v5 = 33;
    Object v6 = "this2";
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
    Object v3 = "msg.no.name.after.coloncolon";
    Object v4 = ((com.google.javascript.jscomp.Compiler)v2).parseTestCode(((java.lang.String)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = "msg.no.name.after.coloncolon";
    Object v7 = ((com.google.javascript.jscomp.Compiler)v5).parseTestCode(((java.lang.String)v6));
    Object v8 = ((com.google.javascript.rhino.Node)v4).copyInformationFromForTree(((com.google.javascript.rhino.Node)v7));
    Object v9 = ((com.google.javascript.jscomp.Compiler)v0).toSource(((com.google.javascript.rhino.Node)v4));
    org.junit.Assert.assertEquals((Object)("msg.no.name.after.coloncolon"), v9);
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
    Object v1 = "ibreak";
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
    Object v1 = "ibreak";
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
    Object v1 = "ibreak";
    Object v2 = new java.io.File(((java.lang.String)v1));
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.JSSourceFile.fromFile(((java.io.File)v2),((java.nio.charset.Charset)v3));
    Object v5 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v4));
    Object v6 = "ibreak";
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
    Object v1 = "ibreak";
    Object v2 = new java.io.File(((java.lang.String)v1));
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.JSSourceFile.fromFile(((java.io.File)v2),((java.nio.charset.Charset)v3));
    Object v5 = "ibreak";
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
    Object v2 = "msg.no.name.after.coloncolon";
    Object v3 = ((com.google.javascript.jscomp.Compiler)v1).parseTestCode(((java.lang.String)v2));
    Object v4 = -20;
    Object v5 = -41;
    ((com.google.javascript.rhino.Node)v3).putIntProp((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = "msg.no.name.after.coloncolon";
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
    Object v1 = "!--";
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
    Object v2 = "Ar";
    Object v3 = "";
    Object v4 = 33;
    Object v5 = "this2";
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
    Object v2 = "msg.no.name.after.coloncolon";
    Object v3 = ((com.google.javascript.jscomp.Compiler)v1).parseTestCode(((java.lang.String)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = "msg.no.name.after.coloncolon";
    Object v6 = ((com.google.javascript.jscomp.Compiler)v4).parseTestCode(((java.lang.String)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = "msg.no.name.after.coloncolon";
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
    Object v1 = "ER/ROR";
    ((com.google.javascript.jscomp.Compiler)v0).addToDebugLog(((java.lang.String)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "ibreak";
    Object v2 = new java.io.File(((java.lang.String)v1));
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.JSSourceFile.fromFile(((java.io.File)v2),((java.nio.charset.Charset)v3));
    Object v5 = "ibreak";
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
    Object v4 = com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3;
    ((com.google.javascript.jscomp.CompilerOptions)v3).setLanguageIn(((com.google.javascript.jscomp.CompilerOptions.LanguageMode)v4));
    Object v5 = null;
    ((com.google.javascript.jscomp.Compiler)v0).initOptions(((com.google.javascript.jscomp.CompilerOptions)v3));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "ibreak";
    Object v2 = new java.io.File(((java.lang.String)v1));
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.JSSourceFile.fromFile(((java.io.File)v2),((java.nio.charset.Charset)v3));
    Object v5 = ((com.google.javascript.jscomp.Compiler)v0).parse(((com.google.javascript.jscomp.JSSourceFile)v4));
    ((com.google.javascript.jscomp.Compiler)v0).reportCodeChange();
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = -13;
    Object v3 = 0;
    Object v4 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v5 = "";
    Object v6 = "I";
    Object v7 = com.google.javascript.jscomp.DiagnosticType.warning(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = new java.lang.String[]{""};
    Object v9 = com.google.javascript.jscomp.JSError.make(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.jscomp.CheckLevel)v4),((com.google.javascript.jscomp.DiagnosticType)v7),((java.lang.String[])v8));
    ((com.google.javascript.jscomp.Compiler)v0).report(((com.google.javascript.jscomp.JSError)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getAstDotGraph();
    Object v2 = "?prototype";
    Object v3 = new com.google.javascript.jscomp.JSModule(((java.lang.String)v2));
    Object v4 = ((com.google.javascript.jscomp.JSModule)v3).getRequires();
    Object v5 = ((com.google.javascript.jscomp.Compiler)v0).getNodeForCodeInsertion(((com.google.javascript.jscomp.JSModule)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new com.google.javascript.jscomp.CompilerOptions();
    Object v3 = java.util.Set.of(((java.lang.Object)v1),((java.lang.Object)v2));
    Object v4 = java.nio.charset.Charset.defaultCharset();
    Object v5 = new com.google.javascript.jscomp.CompilerOptions();
    Object v6 = java.util.Set.of(((java.lang.Object)v4),((java.lang.Object)v5));
    Object v7 = java.nio.charset.Charset.defaultCharset();
    Object v8 = new com.google.javascript.jscomp.CompilerOptions();
    Object v9 = java.util.Set.of(((java.lang.Object)v7),((java.lang.Object)v8));
    Object v10 = java.nio.charset.Charset.defaultCharset();
    Object v11 = new com.google.javascript.jscomp.CompilerOptions();
    Object v12 = java.util.Set.of(((java.lang.Object)v10),((java.lang.Object)v11));
    ((com.google.javascript.jscomp.Compiler)v0).stripCode(((java.util.Set)v3),((java.util.Set)v6),((java.util.Set)v9),((java.util.Set)v12));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getParserConfig();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.Compiler();
    Object v2 = ((com.google.javascript.jscomp.Compiler)v1).getErrorManager();
    ((com.google.javascript.jscomp.Compiler)v0).setErrorManager(((com.google.javascript.jscomp.ErrorManager)v2));
    Object v3 = null;
    Object v4 = ((com.google.javascript.jscomp.Compiler)v0).getDiagnosticGroups();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.Compiler)v0).normalize();
    Object v1 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getTypeValidator();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.CompilerOptions();
    ((com.google.javascript.jscomp.Compiler)v0).initOptions(((com.google.javascript.jscomp.CompilerOptions)v1));
    Object v2 = null;
    Object v3 = ((com.google.javascript.jscomp.Compiler)v0).isInliningForbidden();
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getTopScope();
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).hasHaltingErrors();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getWarningCount();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getOptions();
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "?prototype";
    Object v2 = new com.google.javascript.jscomp.JSModule(((java.lang.String)v1));
    Object v3 = ((com.google.javascript.jscomp.Compiler)v0).getNodeForCodeInsertion(((com.google.javascript.jscomp.JSModule)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.Compiler();
    Object v2 = ((com.google.javascript.jscomp.Compiler)v1).getErrorManager();
    ((com.google.javascript.jscomp.Compiler)v0).setErrorManager(((com.google.javascript.jscomp.ErrorManager)v2));
    Object v3 = null;
    Object v4 = ((com.google.javascript.jscomp.Compiler)v0).getPassConfig();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.Compiler)v0).initCompilerOptionsIfTesting();
    Object v1 = null;
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "?prototype";
    Object v2 = new com.google.javascript.jscomp.JSModule(((java.lang.String)v1));
    Object v3 = new com.google.javascript.jscomp.CodeChangeHandler.ForbiddenChange();
    Object v4 = java.nio.charset.Charset.defaultCharset();
    Object v5 = "";
    Object v6 = -13;
    Object v7 = 0;
    Object v8 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v9 = "";
    Object v10 = "I";
    Object v11 = com.google.javascript.jscomp.DiagnosticType.warning(((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = new java.lang.String[]{""};
    Object v13 = com.google.javascript.jscomp.JSError.make(((java.lang.String)v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),((com.google.javascript.jscomp.CheckLevel)v8),((com.google.javascript.jscomp.DiagnosticType)v11),((java.lang.String[])v12));
    Object v14 = "";
    Object v15 = "I";
    Object v16 = com.google.javascript.jscomp.DiagnosticType.warning(((java.lang.String)v14),((java.lang.String)v15));
    Object v17 = "k ";
    Object v18 = new com.google.javascript.jscomp.Tracer(((java.lang.String)v17));
    Object v19 = "?prototype";
    Object v20 = new com.google.javascript.jscomp.JSModule(((java.lang.String)v19));
    Object v21 = "?prototype";
    Object v22 = new com.google.javascript.jscomp.JSModule(((java.lang.String)v21));
    Object v23 = "ibreak";
    Object v24 = new java.io.File(((java.lang.String)v23));
    Object v25 = "k ";
    Object v26 = new com.google.javascript.jscomp.Tracer(((java.lang.String)v25));
    Object v27 = new com.google.javascript.jscomp.CodeChangeHandler.ForbiddenChange();
    Object v28 = "?prototype";
    Object v29 = new com.google.javascript.jscomp.JSModule(((java.lang.String)v28));
    Object v30 = "?prototype";
    Object v31 = new com.google.javascript.jscomp.JSModule(((java.lang.String)v30));
    Object v32 = new com.google.javascript.jscomp.CompilerOptions();
    Object v33 = java.util.Map.of(((java.lang.Object)v2),((java.lang.Object)v3),((java.lang.Object)v4),((java.lang.Object)v13),((java.lang.Object)v16),((java.lang.Object)v18),((java.lang.Object)v20),((java.lang.Object)v22),((java.lang.Object)v24),((java.lang.Object)v26),((java.lang.Object)v27),((java.lang.Object)v29),((java.lang.Object)v31),((java.lang.Object)v32));
    Object v34 = new com.google.javascript.jscomp.Compiler();
    Object v35 = "&";
    Object v36 = ((com.google.javascript.jscomp.Compiler)v34).parseTestCode(((java.lang.String)v35));
    Object v37 = false;
    ((com.google.javascript.rhino.Node)v36).setOptionalArg((((java.lang.Boolean)v37).booleanValue()));
    Object v38 = null;
    ((com.google.javascript.jscomp.Compiler)v0).updateGlobalVarReferences(((java.util.Map)v33),((com.google.javascript.rhino.Node)v36));
    Object v39 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "ibreak";
    Object v2 = new java.io.File(((java.lang.String)v1));
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.JSSourceFile.fromFile(((java.io.File)v2),((java.nio.charset.Charset)v3));
    Object v5 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v4));
    Object v6 = "ibreak";
    Object v7 = new java.io.File(((java.lang.String)v6));
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = com.google.javascript.jscomp.JSSourceFile.fromFile(((java.io.File)v7),((java.nio.charset.Charset)v8));
    ((com.google.javascript.jscomp.JsAst)v5).setSourceFile(((com.google.javascript.jscomp.SourceFile)v9));
    Object v10 = null;
    ((com.google.javascript.jscomp.Compiler)v0).addIncrementalSourceAst(((com.google.javascript.jscomp.JsAst)v5));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "toSourceArray";
    Object v2 = 0;
    Object v3 = ((com.google.javascript.jscomp.Compiler)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "?prototype";
    Object v2 = new com.google.javascript.jscomp.JSModule(((java.lang.String)v1));
    Object v3 = new com.google.javascript.jscomp.CodeChangeHandler.ForbiddenChange();
    Object v4 = java.nio.charset.Charset.defaultCharset();
    Object v5 = "";
    Object v6 = -13;
    Object v7 = 0;
    Object v8 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v9 = "";
    Object v10 = "I";
    Object v11 = com.google.javascript.jscomp.DiagnosticType.warning(((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = new java.lang.String[]{""};
    Object v13 = com.google.javascript.jscomp.JSError.make(((java.lang.String)v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),((com.google.javascript.jscomp.CheckLevel)v8),((com.google.javascript.jscomp.DiagnosticType)v11),((java.lang.String[])v12));
    Object v14 = "";
    Object v15 = "I";
    Object v16 = com.google.javascript.jscomp.DiagnosticType.warning(((java.lang.String)v14),((java.lang.String)v15));
    Object v17 = "k ";
    Object v18 = new com.google.javascript.jscomp.Tracer(((java.lang.String)v17));
    Object v19 = "?prototype";
    Object v20 = new com.google.javascript.jscomp.JSModule(((java.lang.String)v19));
    Object v21 = "?prototype";
    Object v22 = new com.google.javascript.jscomp.JSModule(((java.lang.String)v21));
    Object v23 = "ibreak";
    Object v24 = new java.io.File(((java.lang.String)v23));
    Object v25 = "k ";
    Object v26 = new com.google.javascript.jscomp.Tracer(((java.lang.String)v25));
    Object v27 = new com.google.javascript.jscomp.CodeChangeHandler.ForbiddenChange();
    Object v28 = "?prototype";
    Object v29 = new com.google.javascript.jscomp.JSModule(((java.lang.String)v28));
    Object v30 = "?prototype";
    Object v31 = new com.google.javascript.jscomp.JSModule(((java.lang.String)v30));
    Object v32 = new com.google.javascript.jscomp.CompilerOptions();
    Object v33 = java.util.Map.of(((java.lang.Object)v2),((java.lang.Object)v3),((java.lang.Object)v4),((java.lang.Object)v13),((java.lang.Object)v16),((java.lang.Object)v18),((java.lang.Object)v20),((java.lang.Object)v22),((java.lang.Object)v24),((java.lang.Object)v26),((java.lang.Object)v27),((java.lang.Object)v29),((java.lang.Object)v31),((java.lang.Object)v32));
    Object v34 = new com.google.javascript.jscomp.Compiler();
    Object v35 = "&";
    Object v36 = ((com.google.javascript.jscomp.Compiler)v34).parseTestCode(((java.lang.String)v35));
    ((com.google.javascript.jscomp.Compiler)v0).updateGlobalVarReferences(((java.util.Map)v33),((com.google.javascript.rhino.Node)v36));
    Object v37 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.CompilerOptions();
    ((com.google.javascript.jscomp.Compiler)v0).initOptions(((com.google.javascript.jscomp.CompilerOptions)v1));
    Object v2 = null;
    Object v3 = "?";
    Object v4 = "";
    Object v5 = ((com.google.javascript.jscomp.Compiler)v0).parseSyntheticCode(((java.lang.String)v3),((java.lang.String)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getErrorManager();
    Object v2 = "cntinue";
    Object v3 = ((com.google.javascript.jscomp.Compiler)v0).newExternInput(((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "GGTO";
    ((com.google.javascript.jscomp.Compiler)v0).startPass(((java.lang.String)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.JSSourceFile[]{};
    Object v2 = new com.google.javascript.jscomp.JSSourceFile[]{null,null,null};
    Object v3 = new com.google.javascript.jscomp.CompilerOptions();
    ((com.google.javascript.jscomp.Compiler)v0).init(((com.google.javascript.jscomp.JSSourceFile[])v1),((com.google.javascript.jscomp.JSSourceFile[])v2),((com.google.javascript.jscomp.CompilerOptions)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.CompilerOptions();
    ((com.google.javascript.jscomp.Compiler)v0).initOptions(((com.google.javascript.jscomp.CompilerOptions)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.JSSourceFile[]{};
    Object v2 = new com.google.javascript.jscomp.JSSourceFile[]{null};
    Object v3 = new com.google.javascript.jscomp.CompilerOptions();
    Object v4 = true;
    ((com.google.javascript.jscomp.CompilerOptions)v3).setGenerateExports((((java.lang.Boolean)v4).booleanValue()));
    Object v5 = null;
    Object v6 = ((com.google.javascript.jscomp.Compiler)v0).compile(((com.google.javascript.jscomp.JSSourceFile[])v1),((com.google.javascript.jscomp.JSSourceFile[])v2),((com.google.javascript.jscomp.CompilerOptions)v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.CompilerOptions();
    Object v2 = new com.google.javascript.jscomp.DefaultPassConfig(((com.google.javascript.jscomp.CompilerOptions)v1));
    ((com.google.javascript.jscomp.Compiler)v0).setPassConfig(((com.google.javascript.jscomp.PassConfig)v2));
    Object v3 = null;
    Object v4 = "?prototype";
    Object v5 = new com.google.javascript.jscomp.JSModule(((java.lang.String)v4));
    Object v6 = ((com.google.javascript.jscomp.Compiler)v0).getNodeForCodeInsertion(((com.google.javascript.jscomp.JSModule)v5));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "ibreak";
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
  public void test73() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = 1;
    Object v3 = ((com.google.javascript.jscomp.Compiler)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getMessages();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    ((com.google.javascript.jscomp.Compiler)v0).removeInput(((java.lang.String)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "k ";
    Object v2 = new com.google.javascript.jscomp.Tracer(((java.lang.String)v1));
    Object v3 = "!";
    ((com.google.javascript.jscomp.Compiler)v0).stopTracer(((com.google.javascript.jscomp.Tracer)v2),((java.lang.String)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "k ";
    Object v2 = new com.google.javascript.jscomp.Tracer(((java.lang.String)v1));
    Object v3 = "=>=";
    ((com.google.javascript.jscomp.Compiler)v0).stopTracer(((com.google.javascript.jscomp.Tracer)v2),((java.lang.String)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.Compiler)v0).reportCodeChange();
    Object v1 = null;
    ((com.google.javascript.jscomp.Compiler)v0).check();
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "ibreak";
    Object v2 = new java.io.File(((java.lang.String)v1));
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.JSSourceFile.fromFile(((java.io.File)v2),((java.nio.charset.Charset)v3));
    Object v5 = new com.google.javascript.jscomp.JSSourceFile[]{null,null};
    Object v6 = new com.google.javascript.jscomp.CompilerOptions();
    Object v7 = ((com.google.javascript.jscomp.Compiler)v0).compile(((com.google.javascript.jscomp.JSSourceFile)v4),((com.google.javascript.jscomp.JSSourceFile[])v5),((com.google.javascript.jscomp.CompilerOptions)v6));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "ibreak";
    Object v2 = new java.io.File(((java.lang.String)v1));
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.JSSourceFile.fromFile(((java.io.File)v2),((java.nio.charset.Charset)v3));
    Object v5 = "ibreak";
    Object v6 = new java.io.File(((java.lang.String)v5));
    Object v7 = java.nio.charset.Charset.defaultCharset();
    Object v8 = com.google.javascript.jscomp.JSSourceFile.fromFile(((java.io.File)v6),((java.nio.charset.Charset)v7));
    Object v9 = new com.google.javascript.jscomp.CompilerOptions();
    Object v10 = ((com.google.javascript.jscomp.Compiler)v0).compile(((com.google.javascript.jscomp.JSSourceFile)v4),((com.google.javascript.jscomp.JSSourceFile)v8),((com.google.javascript.jscomp.CompilerOptions)v9));
    ((com.google.javascript.jscomp.Compiler)v0).removeTryCatchFinally();
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "ibreak";
    Object v2 = new java.io.File(((java.lang.String)v1));
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.JSSourceFile.fromFile(((java.io.File)v2),((java.nio.charset.Charset)v3));
    Object v5 = "ibreak";
    Object v6 = new java.io.File(((java.lang.String)v5));
    Object v7 = java.nio.charset.Charset.defaultCharset();
    Object v8 = com.google.javascript.jscomp.JSSourceFile.fromFile(((java.io.File)v6),((java.nio.charset.Charset)v7));
    Object v9 = new com.google.javascript.jscomp.CompilerOptions();
    Object v10 = ((com.google.javascript.jscomp.Compiler)v0).compile(((com.google.javascript.jscomp.JSSourceFile)v4),((com.google.javascript.jscomp.JSSourceFile)v8),((com.google.javascript.jscomp.CompilerOptions)v9));
    Object v11 = ((com.google.javascript.jscomp.Compiler)v0).getTypeRegistry();
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "ibreak";
    Object v2 = new java.io.File(((java.lang.String)v1));
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.JSSourceFile.fromFile(((java.io.File)v2),((java.nio.charset.Charset)v3));
    Object v5 = "NnN";
    ((com.google.javascript.jscomp.SourceFile)v4).setOriginalPath(((java.lang.String)v5));
    Object v6 = null;
    Object v7 = "ibreak";
    Object v8 = new java.io.File(((java.lang.String)v7));
    Object v9 = java.nio.charset.Charset.defaultCharset();
    Object v10 = com.google.javascript.jscomp.JSSourceFile.fromFile(((java.io.File)v8),((java.nio.charset.Charset)v9));
    Object v11 = new com.google.javascript.jscomp.CompilerOptions();
    Object v12 = ((com.google.javascript.jscomp.Compiler)v0).compile(((com.google.javascript.jscomp.JSSourceFile)v4),((com.google.javascript.jscomp.JSSourceFile)v10),((com.google.javascript.jscomp.CompilerOptions)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getUniqueNameIdSupplier();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.Compiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = "";
    Object v3 = -13;
    Object v4 = 0;
    Object v5 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v6 = "";
    Object v7 = "I";
    Object v8 = com.google.javascript.jscomp.DiagnosticType.warning(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = new java.lang.String[]{""};
    Object v10 = com.google.javascript.jscomp.JSError.make(((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),((com.google.javascript.jscomp.CheckLevel)v5),((com.google.javascript.jscomp.DiagnosticType)v8),((java.lang.String[])v9));
    ((com.google.javascript.jscomp.Compiler)v0).report(((com.google.javascript.jscomp.JSError)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "ibreak";
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
  public void test86() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.Compiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = java.nio.charset.Charset.defaultCharset();
    Object v3 = new com.google.javascript.jscomp.CompilerOptions();
    Object v4 = java.util.Set.of(((java.lang.Object)v2),((java.lang.Object)v3));
    Object v5 = java.nio.charset.Charset.defaultCharset();
    Object v6 = new com.google.javascript.jscomp.CompilerOptions();
    Object v7 = java.util.Set.of(((java.lang.Object)v5),((java.lang.Object)v6));
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = new com.google.javascript.jscomp.CompilerOptions();
    Object v10 = java.util.Set.of(((java.lang.Object)v8),((java.lang.Object)v9));
    Object v11 = ((java.util.Set)v10).iterator();
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new com.google.javascript.jscomp.CompilerOptions();
    Object v14 = java.util.Set.of(((java.lang.Object)v12),((java.lang.Object)v13));
    Object v15 = ((java.util.Set)v14).iterator();
    ((com.google.javascript.jscomp.Compiler)v0).stripCode(((java.util.Set)v4),((java.util.Set)v7),((java.util.Set)v10),((java.util.Set)v14));
    Object v16 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).hasRegExpGlobalReferences();
    org.junit.Assert.assertEquals((Object)(true), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "number";
    Object v2 = ((com.google.javascript.jscomp.Compiler)v0).newExternInput(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.CompilerOptions();
    Object v2 = new com.google.javascript.jscomp.DefaultPassConfig(((com.google.javascript.jscomp.CompilerOptions)v1));
    ((com.google.javascript.jscomp.Compiler)v0).setPassConfig(((com.google.javascript.jscomp.PassConfig)v2));
    Object v3 = null;
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.ChainCalls(((com.google.javascript.jscomp.AbstractCompiler)v4));
    ((com.google.javascript.jscomp.Compiler)v0).process(((com.google.javascript.jscomp.CompilerPass)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = "Ar";
    Object v3 = "";
    Object v4 = 33;
    Object v5 = "this2";
    Object v6 = 1;
    Object v7 = new com.google.javascript.rhino.EvaluatorException(((java.lang.String)v2),((java.lang.String)v3),(((java.lang.Integer)v4).intValue()),((java.lang.String)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = "Ar";
    Object v9 = "";
    Object v10 = 33;
    Object v11 = "this2";
    Object v12 = 1;
    Object v13 = new com.google.javascript.rhino.EvaluatorException(((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()),((java.lang.String)v11),(((java.lang.Integer)v12).intValue()));
    Object v14 = ((java.lang.Throwable)v7).initCause(((java.lang.Throwable)v13));
    ((com.google.javascript.jscomp.Compiler)v0).throwInternalError(((java.lang.String)v1),((java.lang.Exception)v7));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.Compiler)v0).getTopScope();
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.CompilerOptions();
    ((com.google.javascript.jscomp.Compiler)v2).initOptions(((com.google.javascript.jscomp.CompilerOptions)v3));
    Object v4 = null;
    Object v5 = "?";
    Object v6 = "";
    Object v7 = ((com.google.javascript.jscomp.Compiler)v2).parseSyntheticCode(((java.lang.String)v5),((java.lang.String)v6));
    ((com.google.javascript.jscomp.Compiler)v0).prepareAst(((com.google.javascript.rhino.Node)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = "ibreak";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = java.nio.charset.Charset.defaultCharset();
    Object v3 = new java.io.PrintStream(((java.io.File)v1),((java.nio.charset.Charset)v2));
    Object v4 = 1;
    ((java.io.PrintStream)v3).println((((java.lang.Integer)v4).intValue()));
    Object v5 = null;
    Object v6 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v3));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = "ibreak";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = java.nio.charset.Charset.defaultCharset();
    Object v3 = new java.io.PrintStream(((java.io.File)v1),((java.nio.charset.Charset)v2));
    Object v4 = 1;
    ((java.io.PrintStream)v3).println((((java.lang.Integer)v4).intValue()));
    Object v5 = null;
    Object v6 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v3));
    Object v7 = "FunPtion";
    ((com.google.javascript.jscomp.Compiler)v6).removeInput(((java.lang.String)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = "ibreak";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = java.nio.charset.Charset.defaultCharset();
    Object v3 = new java.io.PrintStream(((java.io.File)v1),((java.nio.charset.Charset)v2));
    Object v4 = 1;
    ((java.io.PrintStream)v3).println((((java.lang.Integer)v4).intValue()));
    Object v5 = null;
    Object v6 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v3));
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = new com.google.javascript.jscomp.CompilerOptions();
    ((com.google.javascript.jscomp.Compiler)v7).initOptions(((com.google.javascript.jscomp.CompilerOptions)v8));
    Object v9 = null;
    Object v10 = "?";
    Object v11 = "";
    Object v12 = ((com.google.javascript.jscomp.Compiler)v7).parseSyntheticCode(((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = ((com.google.javascript.jscomp.Compiler)v6).toSource(((com.google.javascript.rhino.Node)v12));
    org.junit.Assert.assertEquals((Object)(""), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = "ibreak";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = java.nio.charset.Charset.defaultCharset();
    Object v3 = new java.io.PrintStream(((java.io.File)v1),((java.nio.charset.Charset)v2));
    Object v4 = 1;
    ((java.io.PrintStream)v3).println((((java.lang.Integer)v4).intValue()));
    Object v5 = null;
    Object v6 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v3));
    Object v7 = new com.google.javascript.jscomp.CompilerOptions();
    Object v8 = new com.google.javascript.jscomp.DefaultPassConfig(((com.google.javascript.jscomp.CompilerOptions)v7));
    ((com.google.javascript.jscomp.Compiler)v6).setPassConfig(((com.google.javascript.jscomp.PassConfig)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = "ibreak";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = java.nio.charset.Charset.defaultCharset();
    Object v3 = new java.io.PrintStream(((java.io.File)v1),((java.nio.charset.Charset)v2));
    Object v4 = 1;
    ((java.io.PrintStream)v3).println((((java.lang.Integer)v4).intValue()));
    Object v5 = null;
    Object v6 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v3));
    ((com.google.javascript.jscomp.Compiler)v6).initInputsByNameMap();
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = "ibreak";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = java.nio.charset.Charset.defaultCharset();
    Object v3 = new java.io.PrintStream(((java.io.File)v1),((java.nio.charset.Charset)v2));
    Object v4 = 1;
    ((java.io.PrintStream)v3).println((((java.lang.Integer)v4).intValue()));
    Object v5 = null;
    Object v6 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v3));
    Object v7 = ((com.google.javascript.jscomp.Compiler)v6).hasHaltingErrors();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = "ibreak";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = java.nio.charset.Charset.defaultCharset();
    Object v3 = new java.io.PrintStream(((java.io.File)v1),((java.nio.charset.Charset)v2));
    Object v4 = 1;
    ((java.io.PrintStream)v3).println((((java.lang.Integer)v4).intValue()));
    Object v5 = null;
    Object v6 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v3));
    Object v7 = ((com.google.javascript.jscomp.Compiler)v6).getModuleGraph();
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = "ibreak";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = java.nio.charset.Charset.defaultCharset();
    Object v3 = new java.io.PrintStream(((java.io.File)v1),((java.nio.charset.Charset)v2));
    Object v4 = 1;
    ((java.io.PrintStream)v3).println((((java.lang.Integer)v4).intValue()));
    Object v5 = null;
    Object v6 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v3));
    Object v7 = "[";
    Object v8 = "Ar";
    Object v9 = "";
    Object v10 = 33;
    Object v11 = "this2";
    Object v12 = 1;
    Object v13 = new com.google.javascript.rhino.EvaluatorException(((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()),((java.lang.String)v11),(((java.lang.Integer)v12).intValue()));
    ((com.google.javascript.jscomp.Compiler)v6).throwInternalError(((java.lang.String)v7),((java.lang.Exception)v13));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }
}
