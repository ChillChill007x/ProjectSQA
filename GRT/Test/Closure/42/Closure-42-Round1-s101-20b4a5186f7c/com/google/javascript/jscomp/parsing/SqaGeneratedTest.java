package com.google.javascript.jscomp.parsing;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = 39;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = "}";
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v2),((java.nio.charset.Charset)v3));
    Object v5 = "";
    Object v6 = true;
    Object v7 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v9 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v4),((java.lang.String)v5),((com.google.javascript.jscomp.parsing.Config)v7),((com.google.javascript.rhino.head.ErrorReporter)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = 39;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = "}";
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v2),((java.nio.charset.Charset)v3));
    Object v5 = "names";
    Object v6 = true;
    Object v7 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v9 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v4),((java.lang.String)v5),((com.google.javascript.jscomp.parsing.Config)v7),((com.google.javascript.rhino.head.ErrorReporter)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = 39;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = "}";
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v2),((java.nio.charset.Charset)v3));
    Object v5 = "";
    Object v6 = true;
    Object v7 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v9 = "";
    Object v10 = "=";
    Object v11 = -7;
    Object v12 = "?";
    Object v13 = 1;
    ((com.google.javascript.rhino.head.ErrorReporter)v8).warning(((java.lang.String)v9),((java.lang.String)v10),(((java.lang.Integer)v11).intValue()),((java.lang.String)v12),(((java.lang.Integer)v13).intValue()));
    Object v14 = null;
    Object v15 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v4),((java.lang.String)v5),((com.google.javascript.jscomp.parsing.Config)v7),((com.google.javascript.rhino.head.ErrorReporter)v8));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = 39;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = "}";
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v2),((java.nio.charset.Charset)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.StaticSourceFile)v4).getName();
    Object v6 = "Q";
    Object v7 = true;
    Object v8 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v10 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v4),((java.lang.String)v6),((com.google.javascript.jscomp.parsing.Config)v8),((com.google.javascript.rhino.head.ErrorReporter)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = 39;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = "}";
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v2),((java.nio.charset.Charset)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.StaticSourceFile)v4).isExtern();
    Object v6 = "";
    Object v7 = true;
    Object v8 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v10 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v4),((java.lang.String)v6),((com.google.javascript.jscomp.parsing.Config)v8),((com.google.javascript.rhino.head.ErrorReporter)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = 39;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = "}";
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v2),((java.nio.charset.Charset)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.StaticSourceFile)v4).getName();
    Object v6 = "j";
    Object v7 = true;
    Object v8 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v10 = ")";
    Object v11 = "t";
    Object v12 = 1;
    Object v13 = "";
    Object v14 = 23;
    Object v15 = ((com.google.javascript.rhino.head.ErrorReporter)v9).runtimeError(((java.lang.String)v10),((java.lang.String)v11),(((java.lang.Integer)v12).intValue()),((java.lang.String)v13),(((java.lang.Integer)v14).intValue()));
    Object v16 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v4),((java.lang.String)v6),((com.google.javascript.jscomp.parsing.Config)v8),((com.google.javascript.rhino.head.ErrorReporter)v9));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = 39;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = "}";
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v2),((java.nio.charset.Charset)v3));
    Object v5 = "(";
    Object v6 = true;
    Object v7 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v9 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v4),((java.lang.String)v5),((com.google.javascript.jscomp.parsing.Config)v7),((com.google.javascript.rhino.head.ErrorReporter)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = 39;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = "}";
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v2),((java.nio.charset.Charset)v3));
    Object v5 = "=";
    Object v6 = true;
    Object v7 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v9 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v4),((java.lang.String)v5),((com.google.javascript.jscomp.parsing.Config)v7),((com.google.javascript.rhino.head.ErrorReporter)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = 39;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = "}";
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v2),((java.nio.charset.Charset)v3));
    Object v5 = "a";
    Object v6 = true;
    Object v7 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v9 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v4),((java.lang.String)v5),((com.google.javascript.jscomp.parsing.Config)v7),((com.google.javascript.rhino.head.ErrorReporter)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = 39;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = "}";
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v2),((java.nio.charset.Charset)v3));
    Object v5 = ", ";
    Object v6 = true;
    Object v7 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v9 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v4),((java.lang.String)v5),((com.google.javascript.jscomp.parsing.Config)v7),((com.google.javascript.rhino.head.ErrorReporter)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = 39;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = "}";
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v2),((java.nio.charset.Charset)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.StaticSourceFile)v4).isExtern();
    Object v6 = ".prototype";
    Object v7 = true;
    Object v8 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v10 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v4),((java.lang.String)v6),((com.google.javascript.jscomp.parsing.Config)v8),((com.google.javascript.rhino.head.ErrorReporter)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = 39;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = "}";
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v2),((java.nio.charset.Charset)v3));
    Object v5 = "%";
    Object v6 = true;
    Object v7 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v9 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v4),((java.lang.String)v5),((com.google.javascript.jscomp.parsing.Config)v7),((com.google.javascript.rhino.head.ErrorReporter)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = 39;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = "}";
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v2),((java.nio.charset.Charset)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.StaticSourceFile)v4).getName();
    Object v6 = "\\r";
    Object v7 = true;
    Object v8 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v10 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v4),((java.lang.String)v6),((com.google.javascript.jscomp.parsing.Config)v8),((com.google.javascript.rhino.head.ErrorReporter)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = 39;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = "tQemplate";
    ((com.google.javascript.rhino.head.ast.ScriptNode)v1).setSourceName(((java.lang.String)v2));
    Object v3 = null;
    Object v4 = "}";
    Object v5 = java.nio.charset.Charset.defaultCharset();
    Object v6 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v4),((java.nio.charset.Charset)v5));
    Object v7 = ((com.google.javascript.rhino.jstype.StaticSourceFile)v6).getName();
    Object v8 = "";
    Object v9 = true;
    Object v10 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v12 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v6),((java.lang.String)v8),((com.google.javascript.jscomp.parsing.Config)v10),((com.google.javascript.rhino.head.ErrorReporter)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = 39;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = "}";
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v2),((java.nio.charset.Charset)v3));
    Object v5 = "argumeQnts";
    Object v6 = true;
    Object v7 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v9 = "ProcessCommonJSModules supports only one invocation per CompilerInput / script node";
    Object v10 = ",";
    Object v11 = 0;
    Object v12 = "";
    Object v13 = -49;
    ((com.google.javascript.rhino.head.ErrorReporter)v8).error(((java.lang.String)v9),((java.lang.String)v10),(((java.lang.Integer)v11).intValue()),((java.lang.String)v12),(((java.lang.Integer)v13).intValue()));
    Object v14 = null;
    Object v15 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v4),((java.lang.String)v5),((com.google.javascript.jscomp.parsing.Config)v7),((com.google.javascript.rhino.head.ErrorReporter)v8));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = 39;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = ((java.lang.Iterable)v1).spliterator();
    Object v3 = "}";
    Object v4 = java.nio.charset.Charset.defaultCharset();
    Object v5 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v3),((java.nio.charset.Charset)v4));
    Object v6 = "prtotype";
    Object v7 = true;
    Object v8 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v10 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v5),((java.lang.String)v6),((com.google.javascript.jscomp.parsing.Config)v8),((com.google.javascript.rhino.head.ErrorReporter)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = 39;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = ((com.google.javascript.rhino.head.ast.AstRoot)v1).debugPrint();
    Object v3 = "}";
    Object v4 = java.nio.charset.Charset.defaultCharset();
    Object v5 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v3),((java.nio.charset.Charset)v4));
    Object v6 = "";
    Object v7 = true;
    Object v8 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v10 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v5),((java.lang.String)v6),((com.google.javascript.jscomp.parsing.Config)v8),((com.google.javascript.rhino.head.ErrorReporter)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = 39;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = ((java.lang.Iterable)v1).spliterator();
    Object v3 = "}";
    Object v4 = java.nio.charset.Charset.defaultCharset();
    Object v5 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v3),((java.nio.charset.Charset)v4));
    Object v6 = "B";
    Object v7 = true;
    Object v8 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v10 = "";
    Object v11 = "";
    Object v12 = 0;
    Object v13 = "?";
    Object v14 = 1;
    ((com.google.javascript.rhino.head.ErrorReporter)v9).warning(((java.lang.String)v10),((java.lang.String)v11),(((java.lang.Integer)v12).intValue()),((java.lang.String)v13),(((java.lang.Integer)v14).intValue()));
    Object v15 = null;
    Object v16 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v5),((java.lang.String)v6),((com.google.javascript.jscomp.parsing.Config)v8),((com.google.javascript.rhino.head.ErrorReporter)v9));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = 39;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = "}";
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v2),((java.nio.charset.Charset)v3));
    Object v5 = "1";
    Object v6 = true;
    Object v7 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v9 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v4),((java.lang.String)v5),((com.google.javascript.jscomp.parsing.Config)v7),((com.google.javascript.rhino.head.ErrorReporter)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = 39;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = "}";
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v2),((java.nio.charset.Charset)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.StaticSourceFile)v4).isExtern();
    Object v6 = "{";
    Object v7 = true;
    Object v8 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v10 = "@";
    Object v11 = "true";
    Object v12 = 1;
    Object v13 = "";
    Object v14 = 30;
    Object v15 = ((com.google.javascript.rhino.head.ErrorReporter)v9).runtimeError(((java.lang.String)v10),((java.lang.String)v11),(((java.lang.Integer)v12).intValue()),((java.lang.String)v13),(((java.lang.Integer)v14).intValue()));
    Object v16 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v4),((java.lang.String)v6),((com.google.javascript.jscomp.parsing.Config)v8),((com.google.javascript.rhino.head.ErrorReporter)v9));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = 39;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = "}";
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v2),((java.nio.charset.Charset)v3));
    Object v5 = "";
    Object v6 = true;
    Object v7 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v9 = "";
    Object v10 = "";
    Object v11 = -9;
    Object v12 = "Y";
    Object v13 = 25;
    ((com.google.javascript.rhino.head.ErrorReporter)v8).error(((java.lang.String)v9),((java.lang.String)v10),(((java.lang.Integer)v11).intValue()),((java.lang.String)v12),(((java.lang.Integer)v13).intValue()));
    Object v14 = null;
    Object v15 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v4),((java.lang.String)v5),((com.google.javascript.jscomp.parsing.Config)v7),((com.google.javascript.rhino.head.ErrorReporter)v8));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = 39;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = "}";
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v2),((java.nio.charset.Charset)v3));
    Object v5 = ".";
    Object v6 = true;
    Object v7 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v9 = "R";
    Object v10 = "";
    Object v11 = 21;
    Object v12 = "";
    Object v13 = 0;
    ((com.google.javascript.rhino.head.ErrorReporter)v8).error(((java.lang.String)v9),((java.lang.String)v10),(((java.lang.Integer)v11).intValue()),((java.lang.String)v12),(((java.lang.Integer)v13).intValue()));
    Object v14 = null;
    Object v15 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v4),((java.lang.String)v5),((com.google.javascript.jscomp.parsing.Config)v7),((com.google.javascript.rhino.head.ErrorReporter)v8));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = 39;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = "}";
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v2),((java.nio.charset.Charset)v3));
    Object v5 = 1;
    Object v6 = ((com.google.javascript.rhino.jstype.StaticSourceFile)v4).getLineOffset((((java.lang.Integer)v5).intValue()));
    Object v7 = "s";
    Object v8 = true;
    Object v9 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v11 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v4),((java.lang.String)v7),((com.google.javascript.jscomp.parsing.Config)v9),((com.google.javascript.rhino.head.ErrorReporter)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = 39;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = "}";
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v2),((java.nio.charset.Charset)v3));
    Object v5 = "indow";
    Object v6 = true;
    Object v7 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v9 = "The use of scope variable {0} is not allowed within a catch block with a catch exception of the same name.";
    Object v10 = "";
    Object v11 = 39;
    Object v12 = "E";
    Object v13 = 0;
    ((com.google.javascript.rhino.head.ErrorReporter)v8).error(((java.lang.String)v9),((java.lang.String)v10),(((java.lang.Integer)v11).intValue()),((java.lang.String)v12),(((java.lang.Integer)v13).intValue()));
    Object v14 = null;
    Object v15 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v4),((java.lang.String)v5),((com.google.javascript.jscomp.parsing.Config)v7),((com.google.javascript.rhino.head.ErrorReporter)v8));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = 39;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = "}";
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v2),((java.nio.charset.Charset)v3));
    Object v5 = "}";
    Object v6 = true;
    Object v7 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v9 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v4),((java.lang.String)v5),((com.google.javascript.jscomp.parsing.Config)v7),((com.google.javascript.rhino.head.ErrorReporter)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = 39;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = "}";
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v2),((java.nio.charset.Charset)v3));
    Object v5 = "";
    Object v6 = true;
    Object v7 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v9 = "";
    Object v10 = "u";
    Object v11 = 0;
    Object v12 = "";
    Object v13 = 2;
    ((com.google.javascript.rhino.head.ErrorReporter)v8).error(((java.lang.String)v9),((java.lang.String)v10),(((java.lang.Integer)v11).intValue()),((java.lang.String)v12),(((java.lang.Integer)v13).intValue()));
    Object v14 = null;
    Object v15 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v4),((java.lang.String)v5),((com.google.javascript.jscomp.parsing.Config)v7),((com.google.javascript.rhino.head.ErrorReporter)v8));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = 39;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = 14;
    Object v3 = 0;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.LINE;
    Object v5 = "translation";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    ((com.google.javascript.rhino.head.ast.AstRoot)v1).addComment(((com.google.javascript.rhino.head.ast.Comment)v6));
    Object v7 = null;
    Object v8 = "}";
    Object v9 = java.nio.charset.Charset.defaultCharset();
    Object v10 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v8),((java.nio.charset.Charset)v9));
    Object v11 = "nuQber";
    Object v12 = true;
    Object v13 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v15 = "";
    Object v16 = "";
    Object v17 = -13;
    Object v18 = "";
    Object v19 = 0;
    ((com.google.javascript.rhino.head.ErrorReporter)v14).error(((java.lang.String)v15),((java.lang.String)v16),(((java.lang.Integer)v17).intValue()),((java.lang.String)v18),(((java.lang.Integer)v19).intValue()));
    Object v20 = null;
    Object v21 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v10),((java.lang.String)v11),((com.google.javascript.jscomp.parsing.Config)v13),((com.google.javascript.rhino.head.ErrorReporter)v14));
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = 39;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = "}";
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v2),((java.nio.charset.Charset)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.StaticSourceFile)v4).isExtern();
    Object v6 = "Y";
    Object v7 = true;
    Object v8 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v10 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v4),((java.lang.String)v6),((com.google.javascript.jscomp.parsing.Config)v8),((com.google.javascript.rhino.head.ErrorReporter)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = 39;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = "}";
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v2),((java.nio.charset.Charset)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.StaticSourceFile)v4).isExtern();
    Object v6 = "e";
    Object v7 = true;
    Object v8 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v10 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v4),((java.lang.String)v6),((com.google.javascript.jscomp.parsing.Config)v8),((com.google.javascript.rhino.head.ErrorReporter)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = 39;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = "}";
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v2),((java.nio.charset.Charset)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.StaticSourceFile)v4).getName();
    Object v6 = "";
    Object v7 = true;
    Object v8 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v10 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v4),((java.lang.String)v6),((com.google.javascript.jscomp.parsing.Config)v8),((com.google.javascript.rhino.head.ErrorReporter)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = 39;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = "}";
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v2),((java.nio.charset.Charset)v3));
    Object v5 = "unknown language mode";
    Object v6 = true;
    Object v7 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v9 = "x";
    Object v10 = ">";
    Object v11 = 1;
    Object v12 = "";
    Object v13 = 0;
    ((com.google.javascript.rhino.head.ErrorReporter)v8).warning(((java.lang.String)v9),((java.lang.String)v10),(((java.lang.Integer)v11).intValue()),((java.lang.String)v12),(((java.lang.Integer)v13).intValue()));
    Object v14 = null;
    Object v15 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v4),((java.lang.String)v5),((com.google.javascript.jscomp.parsing.Config)v7),((com.google.javascript.rhino.head.ErrorReporter)v8));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = 39;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = "}";
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v2),((java.nio.charset.Charset)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.StaticSourceFile)v4).getName();
    Object v6 = "prototZype";
    Object v7 = true;
    Object v8 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v10 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v4),((java.lang.String)v6),((com.google.javascript.jscomp.parsing.Config)v8),((com.google.javascript.rhino.head.ErrorReporter)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = 39;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = ((java.lang.Iterable)v1).spliterator();
    Object v3 = "}";
    Object v4 = java.nio.charset.Charset.defaultCharset();
    Object v5 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v3),((java.nio.charset.Charset)v4));
    Object v6 = "[?";
    Object v7 = true;
    Object v8 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v10 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v5),((java.lang.String)v6),((com.google.javascript.jscomp.parsing.Config)v8),((com.google.javascript.rhino.head.ErrorReporter)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = 39;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = "}";
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v2),((java.nio.charset.Charset)v3));
    Object v5 = ".";
    Object v6 = true;
    Object v7 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v9 = "";
    Object v10 = "r";
    Object v11 = 12;
    Object v12 = "^";
    Object v13 = -49;
    ((com.google.javascript.rhino.head.ErrorReporter)v8).error(((java.lang.String)v9),((java.lang.String)v10),(((java.lang.Integer)v11).intValue()),((java.lang.String)v12),(((java.lang.Integer)v13).intValue()));
    Object v14 = null;
    Object v15 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v4),((java.lang.String)v5),((com.google.javascript.jscomp.parsing.Config)v7),((com.google.javascript.rhino.head.ErrorReporter)v8));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = 39;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = "}";
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v2),((java.nio.charset.Charset)v3));
    Object v5 = "z";
    Object v6 = true;
    Object v7 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v9 = "5";
    Object v10 = "";
    Object v11 = 1;
    Object v12 = ".prototype.";
    Object v13 = 0;
    ((com.google.javascript.rhino.head.ErrorReporter)v8).warning(((java.lang.String)v9),((java.lang.String)v10),(((java.lang.Integer)v11).intValue()),((java.lang.String)v12),(((java.lang.Integer)v13).intValue()));
    Object v14 = null;
    Object v15 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v4),((java.lang.String)v5),((com.google.javascript.jscomp.parsing.Config)v7),((com.google.javascript.rhino.head.ErrorReporter)v8));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = 39;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = 39;
    Object v3 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v2).intValue()));
    ((com.google.javascript.rhino.head.ast.Scope)v1).addChildScope(((com.google.javascript.rhino.head.ast.Scope)v3));
    Object v4 = null;
    Object v5 = "}";
    Object v6 = java.nio.charset.Charset.defaultCharset();
    Object v7 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v5),((java.nio.charset.Charset)v6));
    Object v8 = "Object";
    Object v9 = true;
    Object v10 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v12 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v7),((java.lang.String)v8),((com.google.javascript.jscomp.parsing.Config)v10),((com.google.javascript.rhino.head.ErrorReporter)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = 39;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = "}";
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v2),((java.nio.charset.Charset)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.StaticSourceFile)v4).getName();
    Object v6 = "\"";
    Object v7 = true;
    Object v8 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v10 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v4),((java.lang.String)v6),((com.google.javascript.jscomp.parsing.Config)v8),((com.google.javascript.rhino.head.ErrorReporter)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = 39;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = "}";
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v2),((java.nio.charset.Charset)v3));
    Object v5 = "d";
    Object v6 = true;
    Object v7 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v9 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v4),((java.lang.String)v5),((com.google.javascript.jscomp.parsing.Config)v7),((com.google.javascript.rhino.head.ErrorReporter)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = 39;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = "}";
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v2),((java.nio.charset.Charset)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.StaticSourceFile)v4).isExtern();
    Object v6 = "ths";
    Object v7 = true;
    Object v8 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v10 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v4),((java.lang.String)v6),((com.google.javascript.jscomp.parsing.Config)v8),((com.google.javascript.rhino.head.ErrorReporter)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = 39;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = "}";
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v2),((java.nio.charset.Charset)v3));
    Object v5 = "";
    Object v6 = true;
    Object v7 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v9 = "";
    Object v10 = "";
    Object v11 = 0;
    Object v12 = "e";
    Object v13 = 1;
    ((com.google.javascript.rhino.head.ErrorReporter)v8).warning(((java.lang.String)v9),((java.lang.String)v10),(((java.lang.Integer)v11).intValue()),((java.lang.String)v12),(((java.lang.Integer)v13).intValue()));
    Object v14 = null;
    Object v15 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v4),((java.lang.String)v5),((com.google.javascript.jscomp.parsing.Config)v7),((com.google.javascript.rhino.head.ErrorReporter)v8));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = 39;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = "}";
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v2),((java.nio.charset.Charset)v3));
    Object v5 = "t";
    Object v6 = true;
    Object v7 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v9 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v4),((java.lang.String)v5),((com.google.javascript.jscomp.parsing.Config)v7),((com.google.javascript.rhino.head.ErrorReporter)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = 39;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = "}";
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v2),((java.nio.charset.Charset)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.StaticSourceFile)v4).isExtern();
    Object v6 = "JSC_EMPTY_ROOT_MODULE_ERROR";
    Object v7 = true;
    Object v8 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v10 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v4),((java.lang.String)v6),((com.google.javascript.jscomp.parsing.Config)v8),((com.google.javascript.rhino.head.ErrorReporter)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = 39;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = 1;
    Object v3 = -2;
    ((com.google.javascript.rhino.head.ast.ScriptNode)v1).setEncodedSourceBounds((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    Object v5 = "}";
    Object v6 = java.nio.charset.Charset.defaultCharset();
    Object v7 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v5),((java.nio.charset.Charset)v6));
    Object v8 = 1;
    Object v9 = ((com.google.javascript.rhino.jstype.StaticSourceFile)v7).getLineOffset((((java.lang.Integer)v8).intValue()));
    Object v10 = "";
    Object v11 = true;
    Object v12 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v11).booleanValue()));
    Object v13 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v14 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v7),((java.lang.String)v10),((com.google.javascript.jscomp.parsing.Config)v12),((com.google.javascript.rhino.head.ErrorReporter)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = 39;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = "}";
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v2),((java.nio.charset.Charset)v3));
    Object v5 = ":";
    Object v6 = true;
    Object v7 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v9 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v4),((java.lang.String)v5),((com.google.javascript.jscomp.parsing.Config)v7),((com.google.javascript.rhino.head.ErrorReporter)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = 39;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = "}";
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v2),((java.nio.charset.Charset)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.StaticSourceFile)v4).isExtern();
    Object v6 = "N";
    Object v7 = true;
    Object v8 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v10 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v4),((java.lang.String)v6),((com.google.javascript.jscomp.parsing.Config)v8),((com.google.javascript.rhino.head.ErrorReporter)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = 39;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = "}";
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v2),((java.nio.charset.Charset)v3));
    Object v5 = "prototype";
    Object v6 = true;
    Object v7 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v9 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v4),((java.lang.String)v5),((com.google.javascript.jscomp.parsing.Config)v7),((com.google.javascript.rhino.head.ErrorReporter)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = 39;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = "}";
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v2),((java.nio.charset.Charset)v3));
    Object v5 = "_";
    Object v6 = true;
    Object v7 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v9 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v4),((java.lang.String)v5),((com.google.javascript.jscomp.parsing.Config)v7),((com.google.javascript.rhino.head.ErrorReporter)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = 39;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = 39;
    Object v3 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v2).intValue()));
    ((com.google.javascript.rhino.head.ast.Scope)v1).setParentScope(((com.google.javascript.rhino.head.ast.Scope)v3));
    Object v4 = null;
    Object v5 = "}";
    Object v6 = java.nio.charset.Charset.defaultCharset();
    Object v7 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v5),((java.nio.charset.Charset)v6));
    Object v8 = "2";
    Object v9 = true;
    Object v10 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v12 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v7),((java.lang.String)v8),((com.google.javascript.jscomp.parsing.Config)v10),((com.google.javascript.rhino.head.ErrorReporter)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = 39;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = 14;
    Object v3 = 0;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.LINE;
    Object v5 = "translation";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    ((com.google.javascript.rhino.head.Node)v1).addChildrenToFront(((com.google.javascript.rhino.head.Node)v6));
    Object v7 = null;
    Object v8 = "}";
    Object v9 = java.nio.charset.Charset.defaultCharset();
    Object v10 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v8),((java.nio.charset.Charset)v9));
    Object v11 = "&";
    Object v12 = true;
    Object v13 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v15 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v10),((java.lang.String)v11),((com.google.javascript.jscomp.parsing.Config)v13),((com.google.javascript.rhino.head.ErrorReporter)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = 39;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = "}";
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v2),((java.nio.charset.Charset)v3));
    Object v5 = "\nM";
    Object v6 = true;
    Object v7 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v9 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v4),((java.lang.String)v5),((com.google.javascript.jscomp.parsing.Config)v7),((com.google.javascript.rhino.head.ErrorReporter)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = 39;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = "}";
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v2),((java.nio.charset.Charset)v3));
    Object v5 = "N";
    Object v6 = true;
    Object v7 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v9 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v4),((java.lang.String)v5),((com.google.javascript.jscomp.parsing.Config)v7),((com.google.javascript.rhino.head.ErrorReporter)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = 39;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = 0;
    Object v3 = 1;
    Object v4 = new com.google.javascript.rhino.head.ast.Name((((java.lang.Integer)v3).intValue()));
    Object v5 = new com.google.javascript.rhino.head.ast.FunctionNode((((java.lang.Integer)v2).intValue()),((com.google.javascript.rhino.head.ast.Name)v4));
    Object v6 = ((com.google.javascript.rhino.head.ast.ScriptNode)v1).addFunction(((com.google.javascript.rhino.head.ast.FunctionNode)v5));
    Object v7 = "}";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v7),((java.nio.charset.Charset)v8));
    Object v10 = "";
    Object v11 = true;
    Object v12 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v11).booleanValue()));
    Object v13 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v14 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v9),((java.lang.String)v10),((com.google.javascript.jscomp.parsing.Config)v12),((com.google.javascript.rhino.head.ErrorReporter)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = 39;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = true;
    ((com.google.javascript.rhino.head.ast.ScriptNode)v1).flattenSymbolTable((((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    Object v4 = "}";
    Object v5 = java.nio.charset.Charset.defaultCharset();
    Object v6 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v4),((java.nio.charset.Charset)v5));
    Object v7 = "";
    Object v8 = true;
    Object v9 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v11 = "/";
    Object v12 = "}";
    Object v13 = -11;
    Object v14 = "";
    Object v15 = 1;
    Object v16 = ((com.google.javascript.rhino.head.ErrorReporter)v10).runtimeError(((java.lang.String)v11),((java.lang.String)v12),(((java.lang.Integer)v13).intValue()),((java.lang.String)v14),(((java.lang.Integer)v15).intValue()));
    Object v17 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v6),((java.lang.String)v7),((com.google.javascript.jscomp.parsing.Config)v9),((com.google.javascript.rhino.head.ErrorReporter)v10));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = 39;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = "}";
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v2),((java.nio.charset.Charset)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.StaticSourceFile)v4).isExtern();
    Object v6 = "";
    Object v7 = true;
    Object v8 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v10 = "D";
    Object v11 = "3";
    Object v12 = 1;
    Object v13 = "";
    Object v14 = -11;
    ((com.google.javascript.rhino.head.ErrorReporter)v9).error(((java.lang.String)v10),((java.lang.String)v11),(((java.lang.Integer)v12).intValue()),((java.lang.String)v13),(((java.lang.Integer)v14).intValue()));
    Object v15 = null;
    Object v16 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v4),((java.lang.String)v6),((com.google.javascript.jscomp.parsing.Config)v8),((com.google.javascript.rhino.head.ErrorReporter)v9));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = 39;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = "}";
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v2),((java.nio.charset.Charset)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.StaticSourceFile)v4).isExtern();
    Object v6 = "soctions";
    Object v7 = true;
    Object v8 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v10 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v4),((java.lang.String)v6),((com.google.javascript.jscomp.parsing.Config)v8),((com.google.javascript.rhino.head.ErrorReporter)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = 39;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = 1;
    Object v3 = 1;
    ((com.google.javascript.rhino.head.ast.AstNode)v1).setBounds((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    Object v5 = "}";
    Object v6 = java.nio.charset.Charset.defaultCharset();
    Object v7 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v5),((java.nio.charset.Charset)v6));
    Object v8 = ((com.google.javascript.rhino.jstype.StaticSourceFile)v7).getName();
    Object v9 = "d";
    Object v10 = true;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v10).booleanValue()));
    Object v12 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v13 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v7),((java.lang.String)v9),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.rhino.head.ErrorReporter)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = 39;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = 39;
    Object v3 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v2).intValue()));
    Object v4 = 14;
    Object v5 = 0;
    Object v6 = com.google.javascript.rhino.head.Token.CommentType.LINE;
    Object v7 = "translation";
    Object v8 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v6),((java.lang.String)v7));
    ((com.google.javascript.rhino.head.Node)v1).addChildAfter(((com.google.javascript.rhino.head.Node)v3),((com.google.javascript.rhino.head.Node)v8));
    Object v9 = null;
    Object v10 = "}";
    Object v11 = java.nio.charset.Charset.defaultCharset();
    Object v12 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v10),((java.nio.charset.Charset)v11));
    Object v13 = "";
    Object v14 = true;
    Object v15 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v17 = "";
    Object v18 = "Exceeded max number of optimization iterations: {0}";
    Object v19 = 0;
    Object v20 = "";
    Object v21 = 1;
    Object v22 = ((com.google.javascript.rhino.head.ErrorReporter)v16).runtimeError(((java.lang.String)v17),((java.lang.String)v18),(((java.lang.Integer)v19).intValue()),((java.lang.String)v20),(((java.lang.Integer)v21).intValue()));
    Object v23 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v12),((java.lang.String)v13),((com.google.javascript.jscomp.parsing.Config)v15),((com.google.javascript.rhino.head.ErrorReporter)v16));
    org.junit.Assert.assertNotNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = 39;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = "}";
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v2),((java.nio.charset.Charset)v3));
    Object v5 = "file";
    Object v6 = true;
    Object v7 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v9 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v4),((java.lang.String)v5),((com.google.javascript.jscomp.parsing.Config)v7),((com.google.javascript.rhino.head.ErrorReporter)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = 39;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = "}";
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v2),((java.nio.charset.Charset)v3));
    Object v5 = "o";
    Object v6 = true;
    Object v7 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v9 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v4),((java.lang.String)v5),((com.google.javascript.jscomp.parsing.Config)v7),((com.google.javascript.rhino.head.ErrorReporter)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = 39;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = "}";
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v2),((java.nio.charset.Charset)v3));
    Object v5 = "F";
    Object v6 = true;
    Object v7 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v9 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v4),((java.lang.String)v5),((com.google.javascript.jscomp.parsing.Config)v7),((com.google.javascript.rhino.head.ErrorReporter)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = 39;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = "}";
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v2),((java.nio.charset.Charset)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.StaticSourceFile)v4).isExtern();
    Object v6 = "H";
    Object v7 = true;
    Object v8 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v10 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v4),((java.lang.String)v6),((com.google.javascript.jscomp.parsing.Config)v8),((com.google.javascript.rhino.head.ErrorReporter)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = 39;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = ((com.google.javascript.rhino.head.Node)v1).hasConsistentReturnUsage();
    Object v3 = "}";
    Object v4 = java.nio.charset.Charset.defaultCharset();
    Object v5 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v3),((java.nio.charset.Charset)v4));
    Object v6 = ((com.google.javascript.rhino.jstype.StaticSourceFile)v5).getName();
    Object v7 = "1";
    Object v8 = true;
    Object v9 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v11 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v5),((java.lang.String)v7),((com.google.javascript.jscomp.parsing.Config)v9),((com.google.javascript.rhino.head.ErrorReporter)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = 39;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = "}";
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v2),((java.nio.charset.Charset)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.StaticSourceFile)v4).isExtern();
    Object v6 = "}";
    Object v7 = true;
    Object v8 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v10 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v4),((java.lang.String)v6),((com.google.javascript.jscomp.parsing.Config)v8),((com.google.javascript.rhino.head.ErrorReporter)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = 39;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = "}";
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v2),((java.nio.charset.Charset)v3));
    Object v5 = "w";
    Object v6 = true;
    Object v7 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v9 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v4),((java.lang.String)v5),((com.google.javascript.jscomp.parsing.Config)v7),((com.google.javascript.rhino.head.ErrorReporter)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = 39;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = "}";
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v2),((java.nio.charset.Charset)v3));
    Object v5 = "q";
    Object v6 = true;
    Object v7 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v9 = "H";
    Object v10 = "";
    Object v11 = 5;
    Object v12 = "";
    Object v13 = 1;
    ((com.google.javascript.rhino.head.ErrorReporter)v8).warning(((java.lang.String)v9),((java.lang.String)v10),(((java.lang.Integer)v11).intValue()),((java.lang.String)v12),(((java.lang.Integer)v13).intValue()));
    Object v14 = null;
    Object v15 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v4),((java.lang.String)v5),((com.google.javascript.jscomp.parsing.Config)v7),((com.google.javascript.rhino.head.ErrorReporter)v8));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = 39;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = "}";
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v2),((java.nio.charset.Charset)v3));
    Object v5 = "`";
    Object v6 = true;
    Object v7 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v9 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v4),((java.lang.String)v5),((com.google.javascript.jscomp.parsing.Config)v7),((com.google.javascript.rhino.head.ErrorReporter)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = 39;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = "}";
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v2),((java.nio.charset.Charset)v3));
    Object v5 = "@";
    Object v6 = true;
    Object v7 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v9 = "?<";
    Object v10 = "";
    Object v11 = -47;
    Object v12 = "R";
    Object v13 = 1;
    ((com.google.javascript.rhino.head.ErrorReporter)v8).error(((java.lang.String)v9),((java.lang.String)v10),(((java.lang.Integer)v11).intValue()),((java.lang.String)v12),(((java.lang.Integer)v13).intValue()));
    Object v14 = null;
    Object v15 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v4),((java.lang.String)v5),((com.google.javascript.jscomp.parsing.Config)v7),((com.google.javascript.rhino.head.ErrorReporter)v8));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = 39;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = "}";
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v2),((java.nio.charset.Charset)v3));
    Object v5 = "#";
    Object v6 = true;
    Object v7 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v9 = "u";
    Object v10 = "5";
    Object v11 = 14;
    Object v12 = "prototype";
    Object v13 = -37;
    ((com.google.javascript.rhino.head.ErrorReporter)v8).error(((java.lang.String)v9),((java.lang.String)v10),(((java.lang.Integer)v11).intValue()),((java.lang.String)v12),(((java.lang.Integer)v13).intValue()));
    Object v14 = null;
    Object v15 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v4),((java.lang.String)v5),((com.google.javascript.jscomp.parsing.Config)v7),((com.google.javascript.rhino.head.ErrorReporter)v8));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = 39;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = "}";
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v2),((java.nio.charset.Charset)v3));
    Object v5 = "x";
    Object v6 = true;
    Object v7 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v9 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v4),((java.lang.String)v5),((com.google.javascript.jscomp.parsing.Config)v7),((com.google.javascript.rhino.head.ErrorReporter)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = 39;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = -6;
    Object v3 = 1;
    ((com.google.javascript.rhino.head.ast.ScriptNode)v1).setEncodedSourceBounds((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    Object v5 = "}";
    Object v6 = java.nio.charset.Charset.defaultCharset();
    Object v7 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v5),((java.nio.charset.Charset)v6));
    Object v8 = "apply";
    Object v9 = true;
    Object v10 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v12 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v7),((java.lang.String)v8),((com.google.javascript.jscomp.parsing.Config)v10),((com.google.javascript.rhino.head.ErrorReporter)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = 39;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = "}";
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v2),((java.nio.charset.Charset)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.StaticSourceFile)v4).getName();
    Object v6 = "\\";
    Object v7 = true;
    Object v8 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v10 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v4),((java.lang.String)v6),((com.google.javascript.jscomp.parsing.Config)v8),((com.google.javascript.rhino.head.ErrorReporter)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = 39;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = "}";
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v2),((java.nio.charset.Charset)v3));
    Object v5 = "v";
    Object v6 = true;
    Object v7 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v9 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v4),((java.lang.String)v5),((com.google.javascript.jscomp.parsing.Config)v7),((com.google.javascript.rhino.head.ErrorReporter)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = 39;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = "}";
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v2),((java.nio.charset.Charset)v3));
    Object v5 = "";
    Object v6 = true;
    Object v7 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v9 = "";
    Object v10 = "";
    Object v11 = 0;
    Object v12 = "functi";
    Object v13 = 0;
    ((com.google.javascript.rhino.head.ErrorReporter)v8).warning(((java.lang.String)v9),((java.lang.String)v10),(((java.lang.Integer)v11).intValue()),((java.lang.String)v12),(((java.lang.Integer)v13).intValue()));
    Object v14 = null;
    Object v15 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v4),((java.lang.String)v5),((com.google.javascript.jscomp.parsing.Config)v7),((com.google.javascript.rhino.head.ErrorReporter)v8));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = 39;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = "}";
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v2),((java.nio.charset.Charset)v3));
    Object v5 = "A";
    Object v6 = true;
    Object v7 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v9 = "null";
    Object v10 = "";
    Object v11 = 68;
    Object v12 = "-";
    Object v13 = -15;
    Object v14 = ((com.google.javascript.rhino.head.ErrorReporter)v8).runtimeError(((java.lang.String)v9),((java.lang.String)v10),(((java.lang.Integer)v11).intValue()),((java.lang.String)v12),(((java.lang.Integer)v13).intValue()));
    Object v15 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v4),((java.lang.String)v5),((com.google.javascript.jscomp.parsing.Config)v7),((com.google.javascript.rhino.head.ErrorReporter)v8));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = 39;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = ((com.google.javascript.rhino.head.ast.AstNode)v1).depth();
    Object v3 = "}";
    Object v4 = java.nio.charset.Charset.defaultCharset();
    Object v5 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v3),((java.nio.charset.Charset)v4));
    Object v6 = "!(";
    Object v7 = true;
    Object v8 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v10 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v5),((java.lang.String)v6),((com.google.javascript.jscomp.parsing.Config)v8),((com.google.javascript.rhino.head.ErrorReporter)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = 39;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = "}";
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v2),((java.nio.charset.Charset)v3));
    Object v5 = "-";
    Object v6 = true;
    Object v7 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v9 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v4),((java.lang.String)v5),((com.google.javascript.jscomp.parsing.Config)v7),((com.google.javascript.rhino.head.ErrorReporter)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = 39;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = 39;
    Object v3 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v2).intValue()));
    ((com.google.javascript.rhino.head.Node)v1).addChildrenToFront(((com.google.javascript.rhino.head.Node)v3));
    Object v4 = null;
    Object v5 = "}";
    Object v6 = java.nio.charset.Charset.defaultCharset();
    Object v7 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v5),((java.nio.charset.Charset)v6));
    Object v8 = ((com.google.javascript.rhino.jstype.StaticSourceFile)v7).getName();
    Object v9 = "H";
    Object v10 = true;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v10).booleanValue()));
    Object v12 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v13 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v7),((java.lang.String)v9),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.rhino.head.ErrorReporter)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = 39;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = "}";
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v2),((java.nio.charset.Charset)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.StaticSourceFile)v4).getName();
    Object v6 = "USE_ANON_FUNCTION";
    Object v7 = true;
    Object v8 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v10 = ":Bthis";
    Object v11 = "J";
    Object v12 = -31;
    Object v13 = "\n";
    Object v14 = 0;
    ((com.google.javascript.rhino.head.ErrorReporter)v9).warning(((java.lang.String)v10),((java.lang.String)v11),(((java.lang.Integer)v12).intValue()),((java.lang.String)v13),(((java.lang.Integer)v14).intValue()));
    Object v15 = null;
    Object v16 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v4),((java.lang.String)v6),((com.google.javascript.jscomp.parsing.Config)v8),((com.google.javascript.rhino.head.ErrorReporter)v9));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = 39;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = "}";
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v2),((java.nio.charset.Charset)v3));
    Object v5 = "goog.globa";
    Object v6 = true;
    Object v7 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v9 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v4),((java.lang.String)v5),((com.google.javascript.jscomp.parsing.Config)v7),((com.google.javascript.rhino.head.ErrorReporter)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = 39;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = "}";
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v2),((java.nio.charset.Charset)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.StaticSourceFile)v4).isExtern();
    Object v6 = "\\P";
    Object v7 = true;
    Object v8 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v10 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v4),((java.lang.String)v6),((com.google.javascript.jscomp.parsing.Config)v8),((com.google.javascript.rhino.head.ErrorReporter)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = 39;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = "}";
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v2),((java.nio.charset.Charset)v3));
    Object v5 = "LOCAL";
    Object v6 = true;
    Object v7 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v9 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v4),((java.lang.String)v5),((com.google.javascript.jscomp.parsing.Config)v7),((com.google.javascript.rhino.head.ErrorReporter)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = 39;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = new java.util.TreeSet();
    ((com.google.javascript.rhino.head.ast.AstRoot)v1).setComments(((java.util.SortedSet)v2));
    Object v3 = null;
    Object v4 = "}";
    Object v5 = java.nio.charset.Charset.defaultCharset();
    Object v6 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v4),((java.nio.charset.Charset)v5));
    Object v7 = "+";
    Object v8 = true;
    Object v9 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v11 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v6),((java.lang.String)v7),((com.google.javascript.jscomp.parsing.Config)v9),((com.google.javascript.rhino.head.ErrorReporter)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = 39;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = "}";
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v2),((java.nio.charset.Charset)v3));
    Object v5 = "E";
    Object v6 = true;
    Object v7 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v9 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v4),((java.lang.String)v5),((com.google.javascript.jscomp.parsing.Config)v7),((com.google.javascript.rhino.head.ErrorReporter)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = 39;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = "}";
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v2),((java.nio.charset.Charset)v3));
    Object v5 = "Error";
    Object v6 = true;
    Object v7 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v9 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v4),((java.lang.String)v5),((com.google.javascript.jscomp.parsing.Config)v7),((com.google.javascript.rhino.head.ErrorReporter)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = 39;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = ((com.google.javascript.rhino.head.ast.AstNode)v1).hasSideEffects();
    Object v3 = "}";
    Object v4 = java.nio.charset.Charset.defaultCharset();
    Object v5 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v3),((java.nio.charset.Charset)v4));
    Object v6 = "\n";
    Object v7 = true;
    Object v8 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v10 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v5),((java.lang.String)v6),((com.google.javascript.jscomp.parsing.Config)v8),((com.google.javascript.rhino.head.ErrorReporter)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = 39;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = 14;
    Object v3 = 0;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.LINE;
    Object v5 = "translation";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = 14;
    Object v8 = 0;
    Object v9 = com.google.javascript.rhino.head.Token.CommentType.LINE;
    Object v10 = "translation";
    Object v11 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v9),((java.lang.String)v10));
    ((com.google.javascript.rhino.head.Node)v1).addChildAfter(((com.google.javascript.rhino.head.Node)v6),((com.google.javascript.rhino.head.Node)v11));
    Object v12 = null;
    Object v13 = "}";
    Object v14 = java.nio.charset.Charset.defaultCharset();
    Object v15 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v13),((java.nio.charset.Charset)v14));
    Object v16 = "";
    Object v17 = true;
    Object v18 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v17).booleanValue()));
    Object v19 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v20 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v15),((java.lang.String)v16),((com.google.javascript.jscomp.parsing.Config)v18),((com.google.javascript.rhino.head.ErrorReporter)v19));
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = 39;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = "}";
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v2),((java.nio.charset.Charset)v3));
    Object v5 = "b";
    Object v6 = true;
    Object v7 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v9 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v4),((java.lang.String)v5),((com.google.javascript.jscomp.parsing.Config)v7),((com.google.javascript.rhino.head.ErrorReporter)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = 39;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = "}";
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v2),((java.nio.charset.Charset)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.StaticSourceFile)v4).getName();
    Object v6 = ".a";
    Object v7 = true;
    Object v8 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v10 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v4),((java.lang.String)v6),((com.google.javascript.jscomp.parsing.Config)v8),((com.google.javascript.rhino.head.ErrorReporter)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = 39;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = "}";
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v2),((java.nio.charset.Charset)v3));
    Object v5 = "7";
    Object v6 = true;
    Object v7 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v9 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v4),((java.lang.String)v5),((com.google.javascript.jscomp.parsing.Config)v7),((com.google.javascript.rhino.head.ErrorReporter)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = 39;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = "}";
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v2),((java.nio.charset.Charset)v3));
    Object v5 = "JSCompiler_ObjectPropertyString";
    Object v6 = true;
    Object v7 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v9 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v4),((java.lang.String)v5),((com.google.javascript.jscomp.parsing.Config)v7),((com.google.javascript.rhino.head.ErrorReporter)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = 39;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = "}";
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v2),((java.nio.charset.Charset)v3));
    Object v5 = "W";
    Object v6 = true;
    Object v7 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v9 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v4),((java.lang.String)v5),((com.google.javascript.jscomp.parsing.Config)v7),((com.google.javascript.rhino.head.ErrorReporter)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = 39;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = "}";
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v2),((java.nio.charset.Charset)v3));
    Object v5 = "boole";
    Object v6 = true;
    Object v7 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v9 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v4),((java.lang.String)v5),((com.google.javascript.jscomp.parsing.Config)v7),((com.google.javascript.rhino.head.ErrorReporter)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = 39;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = 0;
    Object v3 = 0;
    ((com.google.javascript.rhino.head.ast.ScriptNode)v1).setEncodedSourceBounds((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    Object v5 = "}";
    Object v6 = java.nio.charset.Charset.defaultCharset();
    Object v7 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v5),((java.nio.charset.Charset)v6));
    Object v8 = "7";
    Object v9 = true;
    Object v10 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v12 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v7),((java.lang.String)v8),((com.google.javascript.jscomp.parsing.Config)v10),((com.google.javascript.rhino.head.ErrorReporter)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = 39;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = "}";
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v2),((java.nio.charset.Charset)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.StaticSourceFile)v4).getName();
    Object v6 = "h";
    Object v7 = true;
    Object v8 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v10 = "N";
    Object v11 = "";
    Object v12 = 0;
    Object v13 = "";
    Object v14 = 1;
    Object v15 = ((com.google.javascript.rhino.head.ErrorReporter)v9).runtimeError(((java.lang.String)v10),((java.lang.String)v11),(((java.lang.Integer)v12).intValue()),((java.lang.String)v13),(((java.lang.Integer)v14).intValue()));
    Object v16 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v4),((java.lang.String)v6),((com.google.javascript.jscomp.parsing.Config)v8),((com.google.javascript.rhino.head.ErrorReporter)v9));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = 39;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = "}";
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v2),((java.nio.charset.Charset)v3));
    Object v5 = "}\n";
    Object v6 = true;
    Object v7 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v9 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v4),((java.lang.String)v5),((com.google.javascript.jscomp.parsing.Config)v7),((com.google.javascript.rhino.head.ErrorReporter)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = 39;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = "}";
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v2),((java.nio.charset.Charset)v3));
    Object v5 = "com.google.javascript.jscomp.parsing.Par)serConfig";
    Object v6 = true;
    Object v7 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v9 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v4),((java.lang.String)v5),((com.google.javascript.jscomp.parsing.Config)v7),((com.google.javascript.rhino.head.ErrorReporter)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = 39;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = "}";
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v2),((java.nio.charset.Charset)v3));
    Object v5 = "\\.&";
    Object v6 = true;
    Object v7 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v9 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v4),((java.lang.String)v5),((com.google.javascript.jscomp.parsing.Config)v7),((com.google.javascript.rhino.head.ErrorReporter)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = 39;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = "}";
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v2),((java.nio.charset.Charset)v3));
    Object v5 = "L";
    Object v6 = true;
    Object v7 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v9 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v4),((java.lang.String)v5),((com.google.javascript.jscomp.parsing.Config)v7),((com.google.javascript.rhino.head.ErrorReporter)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = 39;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = "}";
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v2),((java.nio.charset.Charset)v3));
    Object v5 = "Parse error. {0}";
    Object v6 = true;
    Object v7 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v9 = "u";
    Object v10 = "Clobal";
    Object v11 = 1;
    Object v12 = "Array";
    Object v13 = 0;
    ((com.google.javascript.rhino.head.ErrorReporter)v8).warning(((java.lang.String)v9),((java.lang.String)v10),(((java.lang.Integer)v11).intValue()),((java.lang.String)v12),(((java.lang.Integer)v13).intValue()));
    Object v14 = null;
    Object v15 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v4),((java.lang.String)v5),((com.google.javascript.jscomp.parsing.Config)v7),((com.google.javascript.rhino.head.ErrorReporter)v8));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = 39;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = "}";
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v2),((java.nio.charset.Charset)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.StaticSourceFile)v4).isExtern();
    Object v6 = "2";
    Object v7 = true;
    Object v8 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v10 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v4),((java.lang.String)v6),((com.google.javascript.jscomp.parsing.Config)v8),((com.google.javascript.rhino.head.ErrorReporter)v9));
    org.junit.Assert.assertNotNull(v10);
  }
}
