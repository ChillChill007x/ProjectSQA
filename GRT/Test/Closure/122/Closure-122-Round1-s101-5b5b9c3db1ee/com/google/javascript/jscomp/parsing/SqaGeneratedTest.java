package com.google.javascript.jscomp.parsing;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = 40;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = ":";
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v2),((java.nio.charset.Charset)v3));
    Object v5 = "";
    Object v6 = false;
    Object v7 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5_STRICT;
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v6).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v11 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v4),((java.lang.String)v5),((com.google.javascript.jscomp.parsing.Config)v9),((com.google.javascript.rhino.head.ErrorReporter)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = 40;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = ":";
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v2),((java.nio.charset.Charset)v3));
    Object v5 = 0;
    Object v6 = ((com.google.javascript.rhino.jstype.StaticSourceFile)v4).getColumnOfOffset((((java.lang.Integer)v5).intValue()));
    Object v7 = "7";
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5_STRICT;
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v8).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v13 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v4),((java.lang.String)v7),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.rhino.head.ErrorReporter)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = 40;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = ((com.google.javascript.rhino.head.ast.ScriptNode)v1).getNextTempName();
    Object v3 = ":";
    Object v4 = java.nio.charset.Charset.defaultCharset();
    Object v5 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v3),((java.nio.charset.Charset)v4));
    Object v6 = "";
    Object v7 = false;
    Object v8 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5_STRICT;
    Object v9 = false;
    Object v10 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v7).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v12 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v5),((java.lang.String)v6),((com.google.javascript.jscomp.parsing.Config)v10),((com.google.javascript.rhino.head.ErrorReporter)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = 40;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = ":";
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v2),((java.nio.charset.Charset)v3));
    Object v5 = "INHERIT_DOC";
    Object v6 = false;
    Object v7 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5_STRICT;
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v6).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v11 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v4),((java.lang.String)v5),((com.google.javascript.jscomp.parsing.Config)v9),((com.google.javascript.rhino.head.ErrorReporter)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = 40;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = ":";
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v2),((java.nio.charset.Charset)v3));
    Object v5 = "";
    Object v6 = false;
    Object v7 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5_STRICT;
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v6).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v11 = "=";
    Object v12 = "";
    Object v13 = 1;
    Object v14 = "n";
    Object v15 = 30;
    ((com.google.javascript.rhino.head.ErrorReporter)v10).warning(((java.lang.String)v11),((java.lang.String)v12),(((java.lang.Integer)v13).intValue()),((java.lang.String)v14),(((java.lang.Integer)v15).intValue()));
    Object v16 = null;
    Object v17 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v4),((java.lang.String)v5),((com.google.javascript.jscomp.parsing.Config)v9),((com.google.javascript.rhino.head.ErrorReporter)v10));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = 40;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = 40;
    Object v3 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v2).intValue()));
    ((com.google.javascript.rhino.head.Node)v1).addChildrenToBack(((com.google.javascript.rhino.head.Node)v3));
    Object v4 = null;
    Object v5 = ":";
    Object v6 = java.nio.charset.Charset.defaultCharset();
    Object v7 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v5),((java.nio.charset.Charset)v6));
    Object v8 = 12;
    Object v9 = ((com.google.javascript.rhino.jstype.StaticSourceFile)v7).getLineOfOffset((((java.lang.Integer)v8).intValue()));
    Object v10 = "}";
    Object v11 = false;
    Object v12 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5_STRICT;
    Object v13 = false;
    Object v14 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v11).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v16 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v7),((java.lang.String)v10),((com.google.javascript.jscomp.parsing.Config)v14),((com.google.javascript.rhino.head.ErrorReporter)v15));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = 40;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = 0;
    Object v3 = 10;
    ((com.google.javascript.rhino.head.ast.AstNode)v1).setBounds((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    Object v5 = ":";
    Object v6 = java.nio.charset.Charset.defaultCharset();
    Object v7 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v5),((java.nio.charset.Charset)v6));
    Object v8 = 0;
    Object v9 = ((com.google.javascript.rhino.jstype.StaticSourceFile)v7).getColumnOfOffset((((java.lang.Integer)v8).intValue()));
    Object v10 = "";
    Object v11 = false;
    Object v12 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5_STRICT;
    Object v13 = false;
    Object v14 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v11).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v16 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v7),((java.lang.String)v10),((com.google.javascript.jscomp.parsing.Config)v14),((com.google.javascript.rhino.head.ErrorReporter)v15));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = 40;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = ":";
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v2),((java.nio.charset.Charset)v3));
    Object v5 = "string";
    Object v6 = false;
    Object v7 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5_STRICT;
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v6).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v11 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v4),((java.lang.String)v5),((com.google.javascript.jscomp.parsing.Config)v9),((com.google.javascript.rhino.head.ErrorReporter)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = 40;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = ":";
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v2),((java.nio.charset.Charset)v3));
    Object v5 = "s";
    Object v6 = false;
    Object v7 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5_STRICT;
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v6).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v11 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v4),((java.lang.String)v5),((com.google.javascript.jscomp.parsing.Config)v9),((com.google.javascript.rhino.head.ErrorReporter)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = 40;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = 1;
    ((com.google.javascript.rhino.head.Node)v1).removeProp((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    Object v4 = ":";
    Object v5 = java.nio.charset.Charset.defaultCharset();
    Object v6 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v4),((java.nio.charset.Charset)v5));
    Object v7 = ((com.google.javascript.rhino.jstype.StaticSourceFile)v6).getName();
    Object v8 = "func";
    Object v9 = false;
    Object v10 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5_STRICT;
    Object v11 = false;
    Object v12 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v9).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v14 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v6),((java.lang.String)v8),((com.google.javascript.jscomp.parsing.Config)v12),((com.google.javascript.rhino.head.ErrorReporter)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = 40;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = ":";
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v2),((java.nio.charset.Charset)v3));
    Object v5 = "enum";
    Object v6 = false;
    Object v7 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5_STRICT;
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v6).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v11 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v4),((java.lang.String)v5),((com.google.javascript.jscomp.parsing.Config)v9),((com.google.javascript.rhino.head.ErrorReporter)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = 40;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = ":";
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v2),((java.nio.charset.Charset)v3));
    Object v5 = "0";
    Object v6 = false;
    Object v7 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5_STRICT;
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v6).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v11 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v4),((java.lang.String)v5),((com.google.javascript.jscomp.parsing.Config)v9),((com.google.javascript.rhino.head.ErrorReporter)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = 40;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = ":";
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v2),((java.nio.charset.Charset)v3));
    Object v5 = "";
    Object v6 = false;
    Object v7 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5_STRICT;
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v6).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v11 = "0 ";
    Object v12 = ",";
    Object v13 = -42;
    Object v14 = "addDependency";
    Object v15 = 11;
    ((com.google.javascript.rhino.head.ErrorReporter)v10).error(((java.lang.String)v11),((java.lang.String)v12),(((java.lang.Integer)v13).intValue()),((java.lang.String)v14),(((java.lang.Integer)v15).intValue()));
    Object v16 = null;
    Object v17 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v4),((java.lang.String)v5),((com.google.javascript.jscomp.parsing.Config)v9),((com.google.javascript.rhino.head.ErrorReporter)v10));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = 40;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = 40;
    Object v3 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v2).intValue()));
    Object v4 = 40;
    Object v5 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v4).intValue()));
    ((com.google.javascript.rhino.head.Node)v1).addChildAfter(((com.google.javascript.rhino.head.Node)v3),((com.google.javascript.rhino.head.Node)v5));
    Object v6 = null;
    Object v7 = ":";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v7),((java.nio.charset.Charset)v8));
    Object v10 = "[";
    Object v11 = false;
    Object v12 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5_STRICT;
    Object v13 = false;
    Object v14 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v11).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v16 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v9),((java.lang.String)v10),((com.google.javascript.jscomp.parsing.Config)v14),((com.google.javascript.rhino.head.ErrorReporter)v15));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = 40;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = ":";
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v2),((java.nio.charset.Charset)v3));
    Object v5 = "c";
    Object v6 = false;
    Object v7 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5_STRICT;
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v6).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v11 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v4),((java.lang.String)v5),((com.google.javascript.jscomp.parsing.Config)v9),((com.google.javascript.rhino.head.ErrorReporter)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = 40;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = 40;
    Object v3 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v2).intValue()));
    ((com.google.javascript.rhino.head.ast.Scope)v1).setParentScope(((com.google.javascript.rhino.head.ast.Scope)v3));
    Object v4 = null;
    Object v5 = ":";
    Object v6 = java.nio.charset.Charset.defaultCharset();
    Object v7 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v5),((java.nio.charset.Charset)v6));
    Object v8 = "  \\";
    Object v9 = false;
    Object v10 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5_STRICT;
    Object v11 = false;
    Object v12 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v9).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v14 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v7),((java.lang.String)v8),((com.google.javascript.jscomp.parsing.Config)v12),((com.google.javascript.rhino.head.ErrorReporter)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = 40;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = ":";
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v2),((java.nio.charset.Charset)v3));
    Object v5 = "";
    Object v6 = false;
    Object v7 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5_STRICT;
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v6).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v11 = "";
    Object v12 = "JSC_GOOG_SCOPE_USE";
    Object v13 = -1;
    Object v14 = "~";
    Object v15 = 47;
    Object v16 = ((com.google.javascript.rhino.head.ErrorReporter)v10).runtimeError(((java.lang.String)v11),((java.lang.String)v12),(((java.lang.Integer)v13).intValue()),((java.lang.String)v14),(((java.lang.Integer)v15).intValue()));
    Object v17 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v4),((java.lang.String)v5),((com.google.javascript.jscomp.parsing.Config)v9),((com.google.javascript.rhino.head.ErrorReporter)v10));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = 40;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = ":";
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v2),((java.nio.charset.Charset)v3));
    Object v5 = "L ";
    Object v6 = false;
    Object v7 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5_STRICT;
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v6).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v11 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v4),((java.lang.String)v5),((com.google.javascript.jscomp.parsing.Config)v9),((com.google.javascript.rhino.head.ErrorReporter)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = 40;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = ":";
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v2),((java.nio.charset.Charset)v3));
    Object v5 = "@";
    Object v6 = false;
    Object v7 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5_STRICT;
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v6).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v11 = "/i* @type {";
    Object v12 = "";
    Object v13 = 0;
    Object v14 = "\n";
    Object v15 = 0;
    Object v16 = ((com.google.javascript.rhino.head.ErrorReporter)v10).runtimeError(((java.lang.String)v11),((java.lang.String)v12),(((java.lang.Integer)v13).intValue()),((java.lang.String)v14),(((java.lang.Integer)v15).intValue()));
    Object v17 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v4),((java.lang.String)v5),((com.google.javascript.jscomp.parsing.Config)v9),((com.google.javascript.rhino.head.ErrorReporter)v10));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = 40;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = ":";
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v2),((java.nio.charset.Charset)v3));
    Object v5 = "this";
    Object v6 = false;
    Object v7 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5_STRICT;
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v6).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v11 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v4),((java.lang.String)v5),((com.google.javascript.jscomp.parsing.Config)v9),((com.google.javascript.rhino.head.ErrorReporter)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = 40;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = ":";
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v2),((java.nio.charset.Charset)v3));
    Object v5 = " ";
    Object v6 = false;
    Object v7 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5_STRICT;
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v6).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v11 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v4),((java.lang.String)v5),((com.google.javascript.jscomp.parsing.Config)v9),((com.google.javascript.rhino.head.ErrorReporter)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = 40;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = ":";
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v2),((java.nio.charset.Charset)v3));
    Object v5 = -9;
    Object v6 = ((com.google.javascript.rhino.jstype.StaticSourceFile)v4).getLineOfOffset((((java.lang.Integer)v5).intValue()));
    Object v7 = "_";
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5_STRICT;
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v8).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v13 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v4),((java.lang.String)v7),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.rhino.head.ErrorReporter)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = 40;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = ":";
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v2),((java.nio.charset.Charset)v3));
    Object v5 = "m";
    Object v6 = false;
    Object v7 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5_STRICT;
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v6).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v11 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v4),((java.lang.String)v5),((com.google.javascript.jscomp.parsing.Config)v9),((com.google.javascript.rhino.head.ErrorReporter)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = 40;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = ":";
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v2),((java.nio.charset.Charset)v3));
    Object v5 = "Expected statement but was ";
    Object v6 = false;
    Object v7 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5_STRICT;
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v6).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v11 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v4),((java.lang.String)v5),((com.google.javascript.jscomp.parsing.Config)v9),((com.google.javascript.rhino.head.ErrorReporter)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = 40;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = ":";
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v2),((java.nio.charset.Charset)v3));
    Object v5 = "\"";
    Object v6 = false;
    Object v7 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5_STRICT;
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v6).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v11 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v4),((java.lang.String)v5),((com.google.javascript.jscomp.parsing.Config)v9),((com.google.javascript.rhino.head.ErrorReporter)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = 40;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = ":";
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v2),((java.nio.charset.Charset)v3));
    Object v5 = "D";
    Object v6 = false;
    Object v7 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5_STRICT;
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v6).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v11 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v4),((java.lang.String)v5),((com.google.javascript.jscomp.parsing.Config)v9),((com.google.javascript.rhino.head.ErrorReporter)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = 40;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = ":";
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v2),((java.nio.charset.Charset)v3));
    Object v5 = "";
    Object v6 = false;
    Object v7 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5_STRICT;
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v6).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v11 = "";
    Object v12 = "C";
    Object v13 = 0;
    Object v14 = "pototype";
    Object v15 = 1;
    Object v16 = ((com.google.javascript.rhino.head.ErrorReporter)v10).runtimeError(((java.lang.String)v11),((java.lang.String)v12),(((java.lang.Integer)v13).intValue()),((java.lang.String)v14),(((java.lang.Integer)v15).intValue()));
    Object v17 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v4),((java.lang.String)v5),((com.google.javascript.jscomp.parsing.Config)v9),((com.google.javascript.rhino.head.ErrorReporter)v10));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = 40;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = ":";
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v2),((java.nio.charset.Charset)v3));
    Object v5 = "v";
    Object v6 = false;
    Object v7 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5_STRICT;
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v6).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v11 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v4),((java.lang.String)v5),((com.google.javascript.jscomp.parsing.Config)v9),((com.google.javascript.rhino.head.ErrorReporter)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = 40;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = "msg.jsdoc.missing.rc";
    ((com.google.javascript.rhino.head.ast.ScriptNode)v1).setEncodedSource(((java.lang.String)v2));
    Object v3 = null;
    Object v4 = ":";
    Object v5 = java.nio.charset.Charset.defaultCharset();
    Object v6 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v4),((java.nio.charset.Charset)v5));
    Object v7 = 1;
    Object v8 = ((com.google.javascript.rhino.jstype.StaticSourceFile)v6).getLineOffset((((java.lang.Integer)v7).intValue()));
    Object v9 = "";
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5_STRICT;
    Object v12 = false;
    Object v13 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v10).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v15 = "t.y=";
    Object v16 = "[";
    Object v17 = -91;
    Object v18 = "(";
    Object v19 = 0;
    ((com.google.javascript.rhino.head.ErrorReporter)v14).warning(((java.lang.String)v15),((java.lang.String)v16),(((java.lang.Integer)v17).intValue()),((java.lang.String)v18),(((java.lang.Integer)v19).intValue()));
    Object v20 = null;
    Object v21 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v6),((java.lang.String)v9),((com.google.javascript.jscomp.parsing.Config)v13),((com.google.javascript.rhino.head.ErrorReporter)v14));
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = 40;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = ":";
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v2),((java.nio.charset.Charset)v3));
    Object v5 = "A";
    Object v6 = false;
    Object v7 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5_STRICT;
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v6).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v11 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v4),((java.lang.String)v5),((com.google.javascript.jscomp.parsing.Config)v9),((com.google.javascript.rhino.head.ErrorReporter)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = 40;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = ":";
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v2),((java.nio.charset.Charset)v3));
    Object v5 = "";
    Object v6 = false;
    Object v7 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5_STRICT;
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v6).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v11 = "";
    Object v12 = "";
    Object v13 = -59;
    Object v14 = "";
    Object v15 = 34;
    Object v16 = ((com.google.javascript.rhino.head.ErrorReporter)v10).runtimeError(((java.lang.String)v11),((java.lang.String)v12),(((java.lang.Integer)v13).intValue()),((java.lang.String)v14),(((java.lang.Integer)v15).intValue()));
    Object v17 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v4),((java.lang.String)v5),((com.google.javascript.jscomp.parsing.Config)v9),((com.google.javascript.rhino.head.ErrorReporter)v10));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = 40;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = ":";
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v2),((java.nio.charset.Charset)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.StaticSourceFile)v4).isExtern();
    Object v6 = "H";
    Object v7 = false;
    Object v8 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5_STRICT;
    Object v9 = false;
    Object v10 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v7).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v12 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v4),((java.lang.String)v6),((com.google.javascript.jscomp.parsing.Config)v10),((com.google.javascript.rhino.head.ErrorReporter)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = 40;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = ":";
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v2),((java.nio.charset.Charset)v3));
    Object v5 = "_";
    Object v6 = false;
    Object v7 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5_STRICT;
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v6).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v11 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v4),((java.lang.String)v5),((com.google.javascript.jscomp.parsing.Config)v9),((com.google.javascript.rhino.head.ErrorReporter)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = 40;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = ":";
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v2),((java.nio.charset.Charset)v3));
    Object v5 = "prototype";
    Object v6 = false;
    Object v7 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5_STRICT;
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v6).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v11 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v4),((java.lang.String)v5),((com.google.javascript.jscomp.parsing.Config)v9),((com.google.javascript.rhino.head.ErrorReporter)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = 40;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = ":";
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v2),((java.nio.charset.Charset)v3));
    Object v5 = "N";
    Object v6 = false;
    Object v7 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5_STRICT;
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v6).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v11 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v4),((java.lang.String)v5),((com.google.javascript.jscomp.parsing.Config)v9),((com.google.javascript.rhino.head.ErrorReporter)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = 40;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = ":";
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v2),((java.nio.charset.Charset)v3));
    Object v5 = "Identifier";
    Object v6 = false;
    Object v7 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5_STRICT;
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v6).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v11 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v4),((java.lang.String)v5),((com.google.javascript.jscomp.parsing.Config)v9),((com.google.javascript.rhino.head.ErrorReporter)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = 40;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = ":";
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v2),((java.nio.charset.Charset)v3));
    Object v5 = "TRUE";
    Object v6 = false;
    Object v7 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5_STRICT;
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v6).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v11 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v4),((java.lang.String)v5),((com.google.javascript.jscomp.parsing.Config)v9),((com.google.javascript.rhino.head.ErrorReporter)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = 40;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = ":";
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v2),((java.nio.charset.Charset)v3));
    Object v5 = "";
    Object v6 = false;
    Object v7 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5_STRICT;
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v6).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v11 = " ";
    Object v12 = "=";
    Object v13 = 11;
    Object v14 = "prot>type";
    Object v15 = 40;
    ((com.google.javascript.rhino.head.ErrorReporter)v10).warning(((java.lang.String)v11),((java.lang.String)v12),(((java.lang.Integer)v13).intValue()),((java.lang.String)v14),(((java.lang.Integer)v15).intValue()));
    Object v16 = null;
    Object v17 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v4),((java.lang.String)v5),((com.google.javascript.jscomp.parsing.Config)v9),((com.google.javascript.rhino.head.ErrorReporter)v10));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = 40;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = ":";
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v2),((java.nio.charset.Charset)v3));
    Object v5 = "o";
    Object v6 = false;
    Object v7 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5_STRICT;
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v6).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v11 = "";
    Object v12 = "D";
    Object v13 = 1;
    Object v14 = "!";
    Object v15 = 0;
    Object v16 = ((com.google.javascript.rhino.head.ErrorReporter)v10).runtimeError(((java.lang.String)v11),((java.lang.String)v12),(((java.lang.Integer)v13).intValue()),((java.lang.String)v14),(((java.lang.Integer)v15).intValue()));
    Object v17 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v4),((java.lang.String)v5),((com.google.javascript.jscomp.parsing.Config)v9),((com.google.javascript.rhino.head.ErrorReporter)v10));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = 40;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = ":";
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v2),((java.nio.charset.Charset)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.StaticSourceFile)v4).getName();
    Object v6 = "?";
    Object v7 = false;
    Object v8 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5_STRICT;
    Object v9 = false;
    Object v10 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v7).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v12 = "|";
    Object v13 = "window";
    Object v14 = 21;
    Object v15 = "{";
    Object v16 = 1;
    ((com.google.javascript.rhino.head.ErrorReporter)v11).error(((java.lang.String)v12),((java.lang.String)v13),(((java.lang.Integer)v14).intValue()),((java.lang.String)v15),(((java.lang.Integer)v16).intValue()));
    Object v17 = null;
    Object v18 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v4),((java.lang.String)v6),((com.google.javascript.jscomp.parsing.Config)v10),((com.google.javascript.rhino.head.ErrorReporter)v11));
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = 40;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = ":";
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v2),((java.nio.charset.Charset)v3));
    Object v5 = "lhis";
    Object v6 = false;
    Object v7 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5_STRICT;
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v6).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v11 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v4),((java.lang.String)v5),((com.google.javascript.jscomp.parsing.Config)v9),((com.google.javascript.rhino.head.ErrorReporter)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = 40;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = 40;
    Object v3 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v2).intValue()));
    ((com.google.javascript.rhino.head.Node)v1).addChildrenToFront(((com.google.javascript.rhino.head.Node)v3));
    Object v4 = null;
    Object v5 = ":";
    Object v6 = java.nio.charset.Charset.defaultCharset();
    Object v7 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v5),((java.nio.charset.Charset)v6));
    Object v8 = ((com.google.javascript.rhino.jstype.StaticSourceFile)v7).getName();
    Object v9 = "";
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5_STRICT;
    Object v12 = false;
    Object v13 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v10).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v15 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v7),((java.lang.String)v9),((com.google.javascript.jscomp.parsing.Config)v13),((com.google.javascript.rhino.head.ErrorReporter)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = 40;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = 40;
    Object v3 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v2).intValue()));
    ((com.google.javascript.rhino.head.Node)v1).addChildToBack(((com.google.javascript.rhino.head.Node)v3));
    Object v4 = null;
    Object v5 = ":";
    Object v6 = java.nio.charset.Charset.defaultCharset();
    Object v7 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v5),((java.nio.charset.Charset)v6));
    Object v8 = "e";
    Object v9 = false;
    Object v10 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5_STRICT;
    Object v11 = false;
    Object v12 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v9).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v14 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v7),((java.lang.String)v8),((com.google.javascript.jscomp.parsing.Config)v12),((com.google.javascript.rhino.head.ErrorReporter)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = 40;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = 40;
    Object v3 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v2).intValue()));
    ((com.google.javascript.rhino.head.Node)v1).addChildToBack(((com.google.javascript.rhino.head.Node)v3));
    Object v4 = null;
    Object v5 = ":";
    Object v6 = java.nio.charset.Charset.defaultCharset();
    Object v7 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v5),((java.nio.charset.Charset)v6));
    Object v8 = "";
    Object v9 = false;
    Object v10 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5_STRICT;
    Object v11 = false;
    Object v12 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v9).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v14 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v7),((java.lang.String)v8),((com.google.javascript.jscomp.parsing.Config)v12),((com.google.javascript.rhino.head.ErrorReporter)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = 40;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = ":";
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v2),((java.nio.charset.Charset)v3));
    Object v5 = -50;
    Object v6 = ((com.google.javascript.rhino.jstype.StaticSourceFile)v4).getLineOfOffset((((java.lang.Integer)v5).intValue()));
    Object v7 = "e";
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5_STRICT;
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v8).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v13 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v4),((java.lang.String)v7),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.rhino.head.ErrorReporter)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = 40;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = ":";
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v2),((java.nio.charset.Charset)v3));
    Object v5 = "7";
    Object v6 = false;
    Object v7 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5_STRICT;
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v6).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v11 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v4),((java.lang.String)v5),((com.google.javascript.jscomp.parsing.Config)v9),((com.google.javascript.rhino.head.ErrorReporter)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = 40;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = ":";
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v2),((java.nio.charset.Charset)v3));
    Object v5 = 33;
    Object v6 = ((com.google.javascript.rhino.jstype.StaticSourceFile)v4).getColumnOfOffset((((java.lang.Integer)v5).intValue()));
    Object v7 = "(a";
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5_STRICT;
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v8).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v13 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v4),((java.lang.String)v7),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.rhino.head.ErrorReporter)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = 40;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = ":";
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v2),((java.nio.charset.Charset)v3));
    Object v5 = ")";
    Object v6 = false;
    Object v7 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5_STRICT;
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v6).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v11 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v4),((java.lang.String)v5),((com.google.javascript.jscomp.parsing.Config)v9),((com.google.javascript.rhino.head.ErrorReporter)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = 40;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = ":";
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v2),((java.nio.charset.Charset)v3));
    Object v5 = 1;
    Object v6 = ((com.google.javascript.rhino.jstype.StaticSourceFile)v4).getLineOfOffset((((java.lang.Integer)v5).intValue()));
    Object v7 = "";
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5_STRICT;
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v8).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v13 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v4),((java.lang.String)v7),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.rhino.head.ErrorReporter)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = 40;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = -22;
    ((com.google.javascript.rhino.head.Node)v1).removeProp((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    Object v4 = ":";
    Object v5 = java.nio.charset.Charset.defaultCharset();
    Object v6 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v4),((java.nio.charset.Charset)v5));
    Object v7 = "";
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5_STRICT;
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v8).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v13 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v6),((java.lang.String)v7),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.rhino.head.ErrorReporter)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = 40;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = ":";
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v2),((java.nio.charset.Charset)v3));
    Object v5 = "Unkn";
    Object v6 = false;
    Object v7 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5_STRICT;
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v6).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v11 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v4),((java.lang.String)v5),((com.google.javascript.jscomp.parsing.Config)v9),((com.google.javascript.rhino.head.ErrorReporter)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = 40;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = ":";
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v2),((java.nio.charset.Charset)v3));
    Object v5 = "(";
    Object v6 = false;
    Object v7 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5_STRICT;
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v6).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v11 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v4),((java.lang.String)v5),((com.google.javascript.jscomp.parsing.Config)v9),((com.google.javascript.rhino.head.ErrorReporter)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = 40;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = ":";
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v2),((java.nio.charset.Charset)v3));
    Object v5 = " -";
    Object v6 = false;
    Object v7 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5_STRICT;
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v6).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v11 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v4),((java.lang.String)v5),((com.google.javascript.jscomp.parsing.Config)v9),((com.google.javascript.rhino.head.ErrorReporter)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = 40;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = ":";
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v2),((java.nio.charset.Charset)v3));
    Object v5 = "";
    Object v6 = false;
    Object v7 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5_STRICT;
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v6).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v11 = "";
    Object v12 = "";
    Object v13 = 0;
    Object v14 = "";
    Object v15 = 1;
    ((com.google.javascript.rhino.head.ErrorReporter)v10).error(((java.lang.String)v11),((java.lang.String)v12),(((java.lang.Integer)v13).intValue()),((java.lang.String)v14),(((java.lang.Integer)v15).intValue()));
    Object v16 = null;
    Object v17 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v4),((java.lang.String)v5),((com.google.javascript.jscomp.parsing.Config)v9),((com.google.javascript.rhino.head.ErrorReporter)v10));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = 40;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = 0;
    ((com.google.javascript.rhino.head.ast.AstNode)v1).setRelative((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    Object v4 = ":";
    Object v5 = java.nio.charset.Charset.defaultCharset();
    Object v6 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v4),((java.nio.charset.Charset)v5));
    Object v7 = "";
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5_STRICT;
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v8).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v13 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v6),((java.lang.String)v7),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.rhino.head.ErrorReporter)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = 40;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = ":";
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v2),((java.nio.charset.Charset)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.StaticSourceFile)v4).isExtern();
    Object v6 = "6";
    Object v7 = false;
    Object v8 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5_STRICT;
    Object v9 = false;
    Object v10 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v7).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v12 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v4),((java.lang.String)v6),((com.google.javascript.jscomp.parsing.Config)v10),((com.google.javascript.rhino.head.ErrorReporter)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = 40;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = 1;
    ((com.google.javascript.rhino.head.ast.ScriptNode)v1).setEncodedSourceEnd((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    Object v4 = ":";
    Object v5 = java.nio.charset.Charset.defaultCharset();
    Object v6 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v4),((java.nio.charset.Charset)v5));
    Object v7 = "";
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5_STRICT;
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v8).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v13 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v6),((java.lang.String)v7),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.rhino.head.ErrorReporter)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = 40;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = ((com.google.javascript.rhino.head.ast.AstRoot)v1).debugPrint();
    Object v3 = ":";
    Object v4 = java.nio.charset.Charset.defaultCharset();
    Object v5 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v3),((java.nio.charset.Charset)v4));
    Object v6 = 1;
    Object v7 = ((com.google.javascript.rhino.jstype.StaticSourceFile)v5).getColumnOfOffset((((java.lang.Integer)v6).intValue()));
    Object v8 = "";
    Object v9 = false;
    Object v10 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5_STRICT;
    Object v11 = false;
    Object v12 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v9).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v14 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v5),((java.lang.String)v8),((com.google.javascript.jscomp.parsing.Config)v12),((com.google.javascript.rhino.head.ErrorReporter)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = 40;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = ((com.google.javascript.rhino.head.ast.ScriptNode)v1).getRegexpCount();
    Object v3 = ":";
    Object v4 = java.nio.charset.Charset.defaultCharset();
    Object v5 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v3),((java.nio.charset.Charset)v4));
    Object v6 = " * ";
    Object v7 = false;
    Object v8 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5_STRICT;
    Object v9 = false;
    Object v10 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v7).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v12 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v5),((java.lang.String)v6),((com.google.javascript.jscomp.parsing.Config)v10),((com.google.javascript.rhino.head.ErrorReporter)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = 40;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = ":";
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v2),((java.nio.charset.Charset)v3));
    Object v5 = "pro";
    Object v6 = false;
    Object v7 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5_STRICT;
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v6).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v11 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v4),((java.lang.String)v5),((com.google.javascript.jscomp.parsing.Config)v9),((com.google.javascript.rhino.head.ErrorReporter)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = 40;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = ":";
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v2),((java.nio.charset.Charset)v3));
    Object v5 = ".prototype";
    Object v6 = false;
    Object v7 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5_STRICT;
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v6).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v11 = "K";
    Object v12 = "";
    Object v13 = 15;
    Object v14 = "";
    Object v15 = 1;
    ((com.google.javascript.rhino.head.ErrorReporter)v10).error(((java.lang.String)v11),((java.lang.String)v12),(((java.lang.Integer)v13).intValue()),((java.lang.String)v14),(((java.lang.Integer)v15).intValue()));
    Object v16 = null;
    Object v17 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v4),((java.lang.String)v5),((com.google.javascript.jscomp.parsing.Config)v9),((com.google.javascript.rhino.head.ErrorReporter)v10));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = 40;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = ":";
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v2),((java.nio.charset.Charset)v3));
    Object v5 = "&";
    Object v6 = false;
    Object v7 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5_STRICT;
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v6).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v11 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v4),((java.lang.String)v5),((com.google.javascript.jscomp.parsing.Config)v9),((com.google.javascript.rhino.head.ErrorReporter)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = 40;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = ":";
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v2),((java.nio.charset.Charset)v3));
    Object v5 = ":@";
    Object v6 = false;
    Object v7 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5_STRICT;
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v6).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v11 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v4),((java.lang.String)v5),((com.google.javascript.jscomp.parsing.Config)v9),((com.google.javascript.rhino.head.ErrorReporter)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = 40;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = ":";
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v2),((java.nio.charset.Charset)v3));
    Object v5 = "d";
    Object v6 = false;
    Object v7 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5_STRICT;
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v6).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v11 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v4),((java.lang.String)v5),((com.google.javascript.jscomp.parsing.Config)v9),((com.google.javascript.rhino.head.ErrorReporter)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = 40;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = 40;
    Object v3 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v2).intValue()));
    Object v4 = 40;
    Object v5 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v4).intValue()));
    ((com.google.javascript.rhino.head.Node)v1).addChildAfter(((com.google.javascript.rhino.head.Node)v3),((com.google.javascript.rhino.head.Node)v5));
    Object v6 = null;
    Object v7 = ":";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v7),((java.nio.charset.Charset)v8));
    Object v10 = "";
    Object v11 = false;
    Object v12 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5_STRICT;
    Object v13 = false;
    Object v14 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v11).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v16 = "";
    Object v17 = "goog.LOCALE";
    Object v18 = 1;
    Object v19 = "";
    Object v20 = 0;
    Object v21 = ((com.google.javascript.rhino.head.ErrorReporter)v15).runtimeError(((java.lang.String)v16),((java.lang.String)v17),(((java.lang.Integer)v18).intValue()),((java.lang.String)v19),(((java.lang.Integer)v20).intValue()));
    Object v22 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v9),((java.lang.String)v10),((com.google.javascript.jscomp.parsing.Config)v14),((com.google.javascript.rhino.head.ErrorReporter)v15));
    org.junit.Assert.assertNotNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = 40;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = ":";
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v2),((java.nio.charset.Charset)v3));
    Object v5 = ":";
    Object v6 = false;
    Object v7 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5_STRICT;
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v6).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v11 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v4),((java.lang.String)v5),((com.google.javascript.jscomp.parsing.Config)v9),((com.google.javascript.rhino.head.ErrorReporter)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = 40;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = ":";
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v2),((java.nio.charset.Charset)v3));
    Object v5 = "o";
    Object v6 = false;
    Object v7 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5_STRICT;
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v6).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v11 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v4),((java.lang.String)v5),((com.google.javascript.jscomp.parsing.Config)v9),((com.google.javascript.rhino.head.ErrorReporter)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = 40;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = ":";
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v2),((java.nio.charset.Charset)v3));
    Object v5 = "F";
    Object v6 = false;
    Object v7 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5_STRICT;
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v6).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v11 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v4),((java.lang.String)v5),((com.google.javascript.jscomp.parsing.Config)v9),((com.google.javascript.rhino.head.ErrorReporter)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = 40;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = ":";
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v2),((java.nio.charset.Charset)v3));
    Object v5 = 1;
    Object v6 = ((com.google.javascript.rhino.jstype.StaticSourceFile)v4).getLineOfOffset((((java.lang.Integer)v5).intValue()));
    Object v7 = "gener;ateReport";
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5_STRICT;
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v8).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v13 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v4),((java.lang.String)v7),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.rhino.head.ErrorReporter)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = 40;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = ":";
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v2),((java.nio.charset.Charset)v3));
    Object v5 = "FUNCT|ON_FUNCTION_TYPE";
    Object v6 = false;
    Object v7 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5_STRICT;
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v6).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v11 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v4),((java.lang.String)v5),((com.google.javascript.jscomp.parsing.Config)v9),((com.google.javascript.rhino.head.ErrorReporter)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = 40;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = new java.util.TreeMap();
    ((com.google.javascript.rhino.head.ast.Scope)v1).setSymbolTable(((java.util.Map)v2));
    Object v3 = null;
    Object v4 = ":";
    Object v5 = java.nio.charset.Charset.defaultCharset();
    Object v6 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v4),((java.nio.charset.Charset)v5));
    Object v7 = "\n";
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5_STRICT;
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v8).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v13 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v6),((java.lang.String)v7),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.rhino.head.ErrorReporter)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = 40;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = ((com.google.javascript.rhino.head.ast.ScriptNode)v1).getFunctionCount();
    Object v3 = ":";
    Object v4 = java.nio.charset.Charset.defaultCharset();
    Object v5 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v3),((java.nio.charset.Charset)v4));
    Object v6 = "Q";
    Object v7 = false;
    Object v8 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5_STRICT;
    Object v9 = false;
    Object v10 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v7).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v12 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v5),((java.lang.String)v6),((com.google.javascript.jscomp.parsing.Config)v10),((com.google.javascript.rhino.head.ErrorReporter)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = 40;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = 0;
    Object v3 = -53;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "Unexpected const ch7ange.\n  name: ";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    ((com.google.javascript.rhino.head.Node)v1).setJsDocNode(((com.google.javascript.rhino.head.ast.Comment)v6));
    Object v7 = null;
    Object v8 = ":";
    Object v9 = java.nio.charset.Charset.defaultCharset();
    Object v10 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v8),((java.nio.charset.Charset)v9));
    Object v11 = "`";
    Object v12 = false;
    Object v13 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5_STRICT;
    Object v14 = false;
    Object v15 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v12).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v17 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v10),((java.lang.String)v11),((com.google.javascript.jscomp.parsing.Config)v15),((com.google.javascript.rhino.head.ErrorReporter)v16));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = 40;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = ":";
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v2),((java.nio.charset.Charset)v3));
    Object v5 = "de";
    Object v6 = false;
    Object v7 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5_STRICT;
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v6).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v11 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v4),((java.lang.String)v5),((com.google.javascript.jscomp.parsing.Config)v9),((com.google.javascript.rhino.head.ErrorReporter)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = 40;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = ":";
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v2),((java.nio.charset.Charset)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.StaticSourceFile)v4).getName();
    Object v6 = "";
    Object v7 = false;
    Object v8 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5_STRICT;
    Object v9 = false;
    Object v10 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v7).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v12 = "~";
    Object v13 = "this";
    Object v14 = 1;
    Object v15 = " -> ";
    Object v16 = 1;
    ((com.google.javascript.rhino.head.ErrorReporter)v11).warning(((java.lang.String)v12),((java.lang.String)v13),(((java.lang.Integer)v14).intValue()),((java.lang.String)v15),(((java.lang.Integer)v16).intValue()));
    Object v17 = null;
    Object v18 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v4),((java.lang.String)v6),((com.google.javascript.jscomp.parsing.Config)v10),((com.google.javascript.rhino.head.ErrorReporter)v11));
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = 40;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = 46;
    ((com.google.javascript.rhino.head.Node)v1).removeProp((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    Object v4 = ":";
    Object v5 = java.nio.charset.Charset.defaultCharset();
    Object v6 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v4),((java.nio.charset.Charset)v5));
    Object v7 = "#";
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5_STRICT;
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v8).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v13 = ".";
    Object v14 = "t";
    Object v15 = 0;
    Object v16 = "D";
    Object v17 = 1;
    Object v18 = ((com.google.javascript.rhino.head.ErrorReporter)v12).runtimeError(((java.lang.String)v13),((java.lang.String)v14),(((java.lang.Integer)v15).intValue()),((java.lang.String)v16),(((java.lang.Integer)v17).intValue()));
    Object v19 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v6),((java.lang.String)v7),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.rhino.head.ErrorReporter)v12));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = 40;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = ":";
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v2),((java.nio.charset.Charset)v3));
    Object v5 = "ASSIxN_SUB";
    Object v6 = false;
    Object v7 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5_STRICT;
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v6).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v11 = "/";
    Object v12 = "r";
    Object v13 = 1;
    Object v14 = "goog.assert.assertInstanceof";
    Object v15 = -7;
    ((com.google.javascript.rhino.head.ErrorReporter)v10).error(((java.lang.String)v11),((java.lang.String)v12),(((java.lang.Integer)v13).intValue()),((java.lang.String)v14),(((java.lang.Integer)v15).intValue()));
    Object v16 = null;
    Object v17 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v4),((java.lang.String)v5),((com.google.javascript.jscomp.parsing.Config)v9),((com.google.javascript.rhino.head.ErrorReporter)v10));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = 40;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = ((com.google.javascript.rhino.head.ast.ScriptNode)v1).getRegexpCount();
    Object v3 = ":";
    Object v4 = java.nio.charset.Charset.defaultCharset();
    Object v5 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v3),((java.nio.charset.Charset)v4));
    Object v6 = "@";
    Object v7 = false;
    Object v8 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5_STRICT;
    Object v9 = false;
    Object v10 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v7).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v12 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v5),((java.lang.String)v6),((com.google.javascript.jscomp.parsing.Config)v10),((com.google.javascript.rhino.head.ErrorReporter)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = 40;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = ((com.google.javascript.rhino.head.ast.AstNode)v1).shortName();
    Object v3 = ":";
    Object v4 = java.nio.charset.Charset.defaultCharset();
    Object v5 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v3),((java.nio.charset.Charset)v4));
    Object v6 = ((com.google.javascript.rhino.jstype.StaticSourceFile)v5).isExtern();
    Object v7 = "";
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5_STRICT;
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v8).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v13 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v5),((java.lang.String)v7),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.rhino.head.ErrorReporter)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = 40;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = ":";
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v2),((java.nio.charset.Charset)v3));
    Object v5 = "/";
    Object v6 = false;
    Object v7 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5_STRICT;
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v6).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v11 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v4),((java.lang.String)v5),((com.google.javascript.jscomp.parsing.Config)v9),((com.google.javascript.rhino.head.ErrorReporter)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = 40;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = ":";
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v2),((java.nio.charset.Charset)v3));
    Object v5 = "unexpect";
    Object v6 = false;
    Object v7 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5_STRICT;
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v6).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v11 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v4),((java.lang.String)v5),((com.google.javascript.jscomp.parsing.Config)v9),((com.google.javascript.rhino.head.ErrorReporter)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = 40;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = ":";
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v2),((java.nio.charset.Charset)v3));
    Object v5 = "2";
    Object v6 = false;
    Object v7 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5_STRICT;
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v6).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v11 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v4),((java.lang.String)v5),((com.google.javascript.jscomp.parsing.Config)v9),((com.google.javascript.rhino.head.ErrorReporter)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = 40;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = -13;
    Object v3 = new com.google.javascript.rhino.head.ast.RegExpLiteral((((java.lang.Integer)v2).intValue()));
    ((com.google.javascript.rhino.head.ast.ScriptNode)v1).addRegExp(((com.google.javascript.rhino.head.ast.RegExpLiteral)v3));
    Object v4 = null;
    Object v5 = ":";
    Object v6 = java.nio.charset.Charset.defaultCharset();
    Object v7 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v5),((java.nio.charset.Charset)v6));
    Object v8 = 2;
    Object v9 = ((com.google.javascript.rhino.jstype.StaticSourceFile)v7).getColumnOfOffset((((java.lang.Integer)v8).intValue()));
    Object v10 = "";
    Object v11 = false;
    Object v12 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5_STRICT;
    Object v13 = false;
    Object v14 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v11).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v16 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v7),((java.lang.String)v10),((com.google.javascript.jscomp.parsing.Config)v14),((com.google.javascript.rhino.head.ErrorReporter)v15));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = 40;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = 0;
    Object v3 = -53;
    Object v4 = com.google.javascript.rhino.head.Token.CommentType.HTML;
    Object v5 = "Unexpected const ch7ange.\n  name: ";
    Object v6 = new com.google.javascript.rhino.head.ast.Comment((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((com.google.javascript.rhino.head.Token.CommentType)v4),((java.lang.String)v5));
    Object v7 = ((com.google.javascript.rhino.head.ast.AstNode)v1).compareTo(((com.google.javascript.rhino.head.ast.AstNode)v6));
    Object v8 = ":";
    Object v9 = java.nio.charset.Charset.defaultCharset();
    Object v10 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v8),((java.nio.charset.Charset)v9));
    Object v11 = "";
    Object v12 = false;
    Object v13 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5_STRICT;
    Object v14 = false;
    Object v15 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v12).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v17 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v10),((java.lang.String)v11),((com.google.javascript.jscomp.parsing.Config)v15),((com.google.javascript.rhino.head.ErrorReporter)v16));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = 40;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = ":";
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v2),((java.nio.charset.Charset)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.StaticSourceFile)v4).getName();
    Object v6 = ",";
    Object v7 = false;
    Object v8 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5_STRICT;
    Object v9 = false;
    Object v10 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v7).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v12 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v4),((java.lang.String)v6),((com.google.javascript.jscomp.parsing.Config)v10),((com.google.javascript.rhino.head.ErrorReporter)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = 40;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = ":";
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v2),((java.nio.charset.Charset)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.StaticSourceFile)v4).getName();
    Object v6 = "";
    Object v7 = false;
    Object v8 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5_STRICT;
    Object v9 = false;
    Object v10 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v7).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v12 = "private";
    Object v13 = "";
    Object v14 = -89;
    Object v15 = "nulg";
    Object v16 = -39;
    ((com.google.javascript.rhino.head.ErrorReporter)v11).error(((java.lang.String)v12),((java.lang.String)v13),(((java.lang.Integer)v14).intValue()),((java.lang.String)v15),(((java.lang.Integer)v16).intValue()));
    Object v17 = null;
    Object v18 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v4),((java.lang.String)v6),((com.google.javascript.jscomp.parsing.Config)v10),((com.google.javascript.rhino.head.ErrorReporter)v11));
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = 40;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = ":";
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v2),((java.nio.charset.Charset)v3));
    Object v5 = "JSC_MISSING_GETCSSNAME";
    Object v6 = false;
    Object v7 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5_STRICT;
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v6).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v11 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v4),((java.lang.String)v5),((com.google.javascript.jscomp.parsing.Config)v9),((com.google.javascript.rhino.head.ErrorReporter)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = 40;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = ":";
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v2),((java.nio.charset.Charset)v3));
    Object v5 = -1;
    Object v6 = ((com.google.javascript.rhino.jstype.StaticSourceFile)v4).getLineOfOffset((((java.lang.Integer)v5).intValue()));
    Object v7 = "Unexpected nmber of values for entry:";
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5_STRICT;
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v8).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v13 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v4),((java.lang.String)v7),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.rhino.head.ErrorReporter)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = 40;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = ":";
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v2),((java.nio.charset.Charset)v3));
    Object v5 = "";
    Object v6 = false;
    Object v7 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5_STRICT;
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v6).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v11 = "";
    Object v12 = "";
    Object v13 = -4;
    Object v14 = " |-- ";
    Object v15 = 35;
    Object v16 = ((com.google.javascript.rhino.head.ErrorReporter)v10).runtimeError(((java.lang.String)v11),((java.lang.String)v12),(((java.lang.Integer)v13).intValue()),((java.lang.String)v14),(((java.lang.Integer)v15).intValue()));
    Object v17 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v4),((java.lang.String)v5),((com.google.javascript.jscomp.parsing.Config)v9),((com.google.javascript.rhino.head.ErrorReporter)v10));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = 40;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = ":";
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v2),((java.nio.charset.Charset)v3));
    Object v5 = 1;
    Object v6 = ((com.google.javascript.rhino.jstype.StaticSourceFile)v4).getLineOfOffset((((java.lang.Integer)v5).intValue()));
    Object v7 = ": ";
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5_STRICT;
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v8).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v13 = "m";
    Object v14 = ",";
    Object v15 = -26;
    Object v16 = "1";
    Object v17 = 1;
    Object v18 = ((com.google.javascript.rhino.head.ErrorReporter)v12).runtimeError(((java.lang.String)v13),((java.lang.String)v14),(((java.lang.Integer)v15).intValue()),((java.lang.String)v16),(((java.lang.Integer)v17).intValue()));
    Object v19 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v4),((java.lang.String)v7),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.rhino.head.ErrorReporter)v12));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = 40;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = ((com.google.javascript.rhino.head.Node)v1).iterator();
    Object v3 = ":";
    Object v4 = java.nio.charset.Charset.defaultCharset();
    Object v5 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v3),((java.nio.charset.Charset)v4));
    Object v6 = "o";
    Object v7 = false;
    Object v8 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5_STRICT;
    Object v9 = false;
    Object v10 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v7).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v12 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v5),((java.lang.String)v6),((com.google.javascript.jscomp.parsing.Config)v10),((com.google.javascript.rhino.head.ErrorReporter)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = 40;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = ":";
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v2),((java.nio.charset.Charset)v3));
    Object v5 = "}";
    Object v6 = false;
    Object v7 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5_STRICT;
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v6).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v11 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v4),((java.lang.String)v5),((com.google.javascript.jscomp.parsing.Config)v9),((com.google.javascript.rhino.head.ErrorReporter)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = 40;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = ":";
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v2),((java.nio.charset.Charset)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.StaticSourceFile)v4).getName();
    Object v6 = "5his";
    Object v7 = false;
    Object v8 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5_STRICT;
    Object v9 = false;
    Object v10 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v7).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v12 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v4),((java.lang.String)v6),((com.google.javascript.jscomp.parsing.Config)v10),((com.google.javascript.rhino.head.ErrorReporter)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = 40;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = ":";
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v2),((java.nio.charset.Charset)v3));
    Object v5 = "prototyp";
    Object v6 = false;
    Object v7 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5_STRICT;
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v6).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v11 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v4),((java.lang.String)v5),((com.google.javascript.jscomp.parsing.Config)v9),((com.google.javascript.rhino.head.ErrorReporter)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = 40;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = -13;
    Object v3 = new com.google.javascript.rhino.head.ast.RegExpLiteral((((java.lang.Integer)v2).intValue()));
    Object v4 = ((com.google.javascript.rhino.head.ast.AstNode)v1).compareTo(((com.google.javascript.rhino.head.ast.AstNode)v3));
    Object v5 = ":";
    Object v6 = java.nio.charset.Charset.defaultCharset();
    Object v7 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v5),((java.nio.charset.Charset)v6));
    Object v8 = ((com.google.javascript.rhino.jstype.StaticSourceFile)v7).isExtern();
    Object v9 = "";
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5_STRICT;
    Object v12 = false;
    Object v13 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v10).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v15 = "+";
    Object v16 = "N";
    Object v17 = 1;
    Object v18 = "@";
    Object v19 = 0;
    Object v20 = ((com.google.javascript.rhino.head.ErrorReporter)v14).runtimeError(((java.lang.String)v15),((java.lang.String)v16),(((java.lang.Integer)v17).intValue()),((java.lang.String)v18),(((java.lang.Integer)v19).intValue()));
    Object v21 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v7),((java.lang.String)v9),((com.google.javascript.jscomp.parsing.Config)v13),((com.google.javascript.rhino.head.ErrorReporter)v14));
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = 40;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = new java.util.TreeMap();
    ((com.google.javascript.rhino.head.ast.ScriptNode)v1).setCompilerData(((java.lang.Object)v2));
    Object v3 = null;
    Object v4 = ":";
    Object v5 = java.nio.charset.Charset.defaultCharset();
    Object v6 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v4),((java.nio.charset.Charset)v5));
    Object v7 = "";
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5_STRICT;
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v8).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v13 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v6),((java.lang.String)v7),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.rhino.head.ErrorReporter)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = 40;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = true;
    ((com.google.javascript.rhino.head.ast.ScriptNode)v1).flattenSymbolTable((((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    Object v4 = ":";
    Object v5 = java.nio.charset.Charset.defaultCharset();
    Object v6 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v4),((java.nio.charset.Charset)v5));
    Object v7 = "\\/u";
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5_STRICT;
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v8).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v13 = "";
    Object v14 = "";
    Object v15 = -50;
    Object v16 = "H";
    Object v17 = -26;
    Object v18 = ((com.google.javascript.rhino.head.ErrorReporter)v12).runtimeError(((java.lang.String)v13),((java.lang.String)v14),(((java.lang.Integer)v15).intValue()),((java.lang.String)v16),(((java.lang.Integer)v17).intValue()));
    Object v19 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v6),((java.lang.String)v7),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.rhino.head.ErrorReporter)v12));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = 40;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = ":";
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v2),((java.nio.charset.Charset)v3));
    Object v5 = -27;
    Object v6 = ((com.google.javascript.rhino.jstype.StaticSourceFile)v4).getLineOfOffset((((java.lang.Integer)v5).intValue()));
    Object v7 = "7";
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5_STRICT;
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v8).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v13 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v4),((java.lang.String)v7),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.rhino.head.ErrorReporter)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = 40;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = ":";
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v2),((java.nio.charset.Charset)v3));
    Object v5 = "undefine%";
    Object v6 = false;
    Object v7 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5_STRICT;
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v6).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v11 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v4),((java.lang.String)v5),((com.google.javascript.jscomp.parsing.Config)v9),((com.google.javascript.rhino.head.ErrorReporter)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = 40;
    Object v1 = new com.google.javascript.rhino.head.ast.AstRoot((((java.lang.Integer)v0).intValue()));
    Object v2 = ":";
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = com.google.javascript.jscomp.SourceFile.fromFile(((java.lang.String)v2),((java.nio.charset.Charset)v3));
    Object v5 = "";
    Object v6 = false;
    Object v7 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5_STRICT;
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v6).booleanValue()),((com.google.javascript.jscomp.parsing.Config.LanguageMode)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v11 = "";
    Object v12 = "";
    Object v13 = -6;
    Object v14 = "b";
    Object v15 = 0;
    ((com.google.javascript.rhino.head.ErrorReporter)v10).warning(((java.lang.String)v11),((java.lang.String)v12),(((java.lang.Integer)v13).intValue()),((java.lang.String)v14),(((java.lang.Integer)v15).intValue()));
    Object v16 = null;
    Object v17 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.rhino.head.ast.AstRoot)v1),((com.google.javascript.rhino.jstype.StaticSourceFile)v4),((java.lang.String)v5),((com.google.javascript.jscomp.parsing.Config)v9),((com.google.javascript.rhino.head.ErrorReporter)v10));
    org.junit.Assert.assertNotNull(v17);
  }
}
