package com.google.javascript.jscomp;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.SyntacticScopeCreator.RedeclarationHandler)v4));
    Object v6 = 1;
    Object v7 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v6).intValue()));
    Object v8 = ":";
    Object v9 = true;
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v9).booleanValue()),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new java.lang.String[]{"K","C "};
    Object v13 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v14 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v12),((java.lang.String[])v13));
    Object v15 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v7),((java.lang.String)v8),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v14));
    Object v16 = null;
    Object v17 = ((com.google.javascript.jscomp.SyntacticScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v15),((com.google.javascript.jscomp.Scope)v16));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = 1;
    Object v6 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v5).intValue()));
    Object v7 = ":";
    Object v8 = true;
    Object v9 = false;
    Object v10 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v8).booleanValue()),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = new java.lang.String[]{"K","C "};
    Object v12 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v13 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v11),((java.lang.String[])v12));
    Object v14 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v6),((java.lang.String)v7),((com.google.javascript.jscomp.parsing.Config)v10),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v13));
    Object v15 = 1;
    Object v16 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v15).intValue()));
    Object v17 = ":";
    Object v18 = true;
    Object v19 = false;
    Object v20 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v18).booleanValue()),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = new java.lang.String[]{"K","C "};
    Object v22 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v23 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v21),((java.lang.String[])v22));
    Object v24 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v16),((java.lang.String)v17),((com.google.javascript.jscomp.parsing.Config)v20),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v23));
    Object v25 = null;
    Object v26 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v24),((com.google.javascript.rhino.jstype.ObjectType)v25));
    Object v27 = "";
    Object v28 = true;
    Object v29 = ((com.google.javascript.jscomp.Scope)v26).isDeclared(((java.lang.String)v27),(((java.lang.Boolean)v28).booleanValue()));
    Object v30 = ((com.google.javascript.jscomp.SyntacticScopeCreator)v4).createScope(((com.google.javascript.rhino.Node)v14),((com.google.javascript.jscomp.Scope)v26));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = 1;
    Object v6 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v5).intValue()));
    Object v7 = ":";
    Object v8 = true;
    Object v9 = false;
    Object v10 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v8).booleanValue()),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = new java.lang.String[]{"K","C "};
    Object v12 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v13 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v11),((java.lang.String[])v12));
    Object v14 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v6),((java.lang.String)v7),((com.google.javascript.jscomp.parsing.Config)v10),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v13));
    Object v15 = ((com.google.javascript.rhino.Node)v14).getAncestors();
    Object v16 = 1;
    Object v17 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v16).intValue()));
    Object v18 = ":";
    Object v19 = true;
    Object v20 = false;
    Object v21 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v19).booleanValue()),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = new java.lang.String[]{"K","C "};
    Object v23 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v24 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v22),((java.lang.String[])v23));
    Object v25 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v17),((java.lang.String)v18),((com.google.javascript.jscomp.parsing.Config)v21),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v24));
    Object v26 = null;
    Object v27 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v25),((com.google.javascript.rhino.jstype.ObjectType)v26));
    Object v28 = ((com.google.javascript.jscomp.SyntacticScopeCreator)v4).createScope(((com.google.javascript.rhino.Node)v14),((com.google.javascript.jscomp.Scope)v27));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.SyntacticScopeCreator.RedeclarationHandler)v4));
    Object v6 = 1;
    Object v7 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v6).intValue()));
    Object v8 = ":";
    Object v9 = true;
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v9).booleanValue()),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new java.lang.String[]{"K","C "};
    Object v13 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v14 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v12),((java.lang.String[])v13));
    Object v15 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v7),((java.lang.String)v8),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v14));
    Object v16 = 1;
    Object v17 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v16).intValue()));
    Object v18 = ":";
    Object v19 = true;
    Object v20 = false;
    Object v21 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v19).booleanValue()),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = new java.lang.String[]{"K","C "};
    Object v23 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v24 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v22),((java.lang.String[])v23));
    Object v25 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v17),((java.lang.String)v18),((com.google.javascript.jscomp.parsing.Config)v21),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v24));
    Object v26 = null;
    Object v27 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v25),((com.google.javascript.rhino.jstype.ObjectType)v26));
    Object v28 = ((com.google.javascript.jscomp.SyntacticScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v15),((com.google.javascript.jscomp.Scope)v27));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.SyntacticScopeCreator.RedeclarationHandler)v4));
    Object v6 = 1;
    Object v7 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v6).intValue()));
    Object v8 = ":";
    Object v9 = true;
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v9).booleanValue()),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new java.lang.String[]{"K","C "};
    Object v13 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v14 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v12),((java.lang.String[])v13));
    Object v15 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v7),((java.lang.String)v8),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v14));
    Object v16 = ((com.google.javascript.rhino.Node)v15).isQualifiedName();
    Object v17 = 1;
    Object v18 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v17).intValue()));
    Object v19 = ":";
    Object v20 = true;
    Object v21 = false;
    Object v22 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v20).booleanValue()),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = new java.lang.String[]{"K","C "};
    Object v24 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v25 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v23),((java.lang.String[])v24));
    Object v26 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v18),((java.lang.String)v19),((com.google.javascript.jscomp.parsing.Config)v22),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v25));
    Object v27 = null;
    Object v28 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v26),((com.google.javascript.rhino.jstype.ObjectType)v27));
    Object v29 = "j";
    Object v30 = true;
    Object v31 = ((com.google.javascript.jscomp.Scope)v28).isDeclared(((java.lang.String)v29),(((java.lang.Boolean)v30).booleanValue()));
    Object v32 = ((com.google.javascript.jscomp.SyntacticScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v15),((com.google.javascript.jscomp.Scope)v28));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.SyntacticScopeCreator.RedeclarationHandler)v4));
    Object v6 = 1;
    Object v7 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v6).intValue()));
    Object v8 = ":";
    Object v9 = true;
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v9).booleanValue()),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new java.lang.String[]{"K","C "};
    Object v13 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v14 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v12),((java.lang.String[])v13));
    Object v15 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v7),((java.lang.String)v8),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v14));
    Object v16 = false;
    ((com.google.javascript.rhino.Node)v15).setVarArgs((((java.lang.Boolean)v16).booleanValue()));
    Object v17 = null;
    Object v18 = 1;
    Object v19 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v18).intValue()));
    Object v20 = ":";
    Object v21 = true;
    Object v22 = false;
    Object v23 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v21).booleanValue()),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = new java.lang.String[]{"K","C "};
    Object v25 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v26 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v24),((java.lang.String[])v25));
    Object v27 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v19),((java.lang.String)v20),((com.google.javascript.jscomp.parsing.Config)v23),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v26));
    Object v28 = null;
    Object v29 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v27),((com.google.javascript.rhino.jstype.ObjectType)v28));
    Object v30 = ((com.google.javascript.jscomp.SyntacticScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v15),((com.google.javascript.jscomp.Scope)v29));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = 1;
    Object v6 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v5).intValue()));
    Object v7 = ":";
    Object v8 = true;
    Object v9 = false;
    Object v10 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v8).booleanValue()),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = new java.lang.String[]{"K","C "};
    Object v12 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v13 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v11),((java.lang.String[])v12));
    Object v14 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v6),((java.lang.String)v7),((com.google.javascript.jscomp.parsing.Config)v10),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v13));
    Object v15 = 1;
    Object v16 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v15).intValue()));
    Object v17 = ":";
    Object v18 = true;
    Object v19 = false;
    Object v20 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v18).booleanValue()),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = new java.lang.String[]{"K","C "};
    Object v22 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v23 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v21),((java.lang.String[])v22));
    Object v24 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v16),((java.lang.String)v17),((com.google.javascript.jscomp.parsing.Config)v20),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v23));
    Object v25 = ((com.google.javascript.rhino.Node)v14).copyInformationFrom(((com.google.javascript.rhino.Node)v24));
    Object v26 = 1;
    Object v27 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v26).intValue()));
    Object v28 = ":";
    Object v29 = true;
    Object v30 = false;
    Object v31 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v29).booleanValue()),(((java.lang.Boolean)v30).booleanValue()));
    Object v32 = new java.lang.String[]{"K","C "};
    Object v33 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v34 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v32),((java.lang.String[])v33));
    Object v35 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v27),((java.lang.String)v28),((com.google.javascript.jscomp.parsing.Config)v31),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v34));
    Object v36 = null;
    Object v37 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v35),((com.google.javascript.rhino.jstype.ObjectType)v36));
    Object v38 = ((com.google.javascript.jscomp.SyntacticScopeCreator)v4).createScope(((com.google.javascript.rhino.Node)v14),((com.google.javascript.jscomp.Scope)v37));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.SyntacticScopeCreator.RedeclarationHandler)v4));
    Object v6 = 1;
    Object v7 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v6).intValue()));
    Object v8 = ":";
    Object v9 = true;
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v9).booleanValue()),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new java.lang.String[]{"K","C "};
    Object v13 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v14 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v12),((java.lang.String[])v13));
    Object v15 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v7),((java.lang.String)v8),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v14));
    Object v16 = ((com.google.javascript.rhino.Node)v15).siblings();
    Object v17 = 1;
    Object v18 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v17).intValue()));
    Object v19 = ":";
    Object v20 = true;
    Object v21 = false;
    Object v22 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v20).booleanValue()),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = new java.lang.String[]{"K","C "};
    Object v24 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v25 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v23),((java.lang.String[])v24));
    Object v26 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v18),((java.lang.String)v19),((com.google.javascript.jscomp.parsing.Config)v22),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v25));
    Object v27 = null;
    Object v28 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v26),((com.google.javascript.rhino.jstype.ObjectType)v27));
    Object v29 = ((com.google.javascript.jscomp.SyntacticScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v15),((com.google.javascript.jscomp.Scope)v28));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = 1;
    Object v6 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v5).intValue()));
    Object v7 = ":";
    Object v8 = true;
    Object v9 = false;
    Object v10 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v8).booleanValue()),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = new java.lang.String[]{"K","C "};
    Object v12 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v13 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v11),((java.lang.String[])v12));
    Object v14 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v6),((java.lang.String)v7),((com.google.javascript.jscomp.parsing.Config)v10),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v13));
    Object v15 = 1;
    Object v16 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v15).intValue()));
    Object v17 = ":";
    Object v18 = true;
    Object v19 = false;
    Object v20 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v18).booleanValue()),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = new java.lang.String[]{"K","C "};
    Object v22 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v23 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v21),((java.lang.String[])v22));
    Object v24 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v16),((java.lang.String)v17),((com.google.javascript.jscomp.parsing.Config)v20),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v23));
    Object v25 = null;
    Object v26 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v24),((com.google.javascript.rhino.jstype.ObjectType)v25));
    Object v27 = ((com.google.javascript.jscomp.SyntacticScopeCreator)v4).createScope(((com.google.javascript.rhino.Node)v14),((com.google.javascript.jscomp.Scope)v26));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.SyntacticScopeCreator.RedeclarationHandler)v4));
    Object v6 = 1;
    Object v7 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v6).intValue()));
    Object v8 = ":";
    Object v9 = true;
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v9).booleanValue()),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new java.lang.String[]{"K","C "};
    Object v13 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v14 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v12),((java.lang.String[])v13));
    Object v15 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v7),((java.lang.String)v8),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v14));
    Object v16 = ((com.google.javascript.rhino.Node)v15).toString();
    Object v17 = 1;
    Object v18 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v17).intValue()));
    Object v19 = ":";
    Object v20 = true;
    Object v21 = false;
    Object v22 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v20).booleanValue()),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = new java.lang.String[]{"K","C "};
    Object v24 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v25 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v23),((java.lang.String[])v24));
    Object v26 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v18),((java.lang.String)v19),((com.google.javascript.jscomp.parsing.Config)v22),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v25));
    Object v27 = null;
    Object v28 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v26),((com.google.javascript.rhino.jstype.ObjectType)v27));
    Object v29 = ((com.google.javascript.jscomp.SyntacticScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v15),((com.google.javascript.jscomp.Scope)v28));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.SyntacticScopeCreator.RedeclarationHandler)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.SyntacticScopeCreator.RedeclarationHandler)v4));
    Object v6 = 1;
    Object v7 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v6).intValue()));
    Object v8 = ":";
    Object v9 = true;
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v9).booleanValue()),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new java.lang.String[]{"K","C "};
    Object v13 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v14 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v12),((java.lang.String[])v13));
    Object v15 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v7),((java.lang.String)v8),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v14));
    Object v16 = 0;
    Object v17 = ((com.google.javascript.rhino.Node)v15).getAncestor((((java.lang.Integer)v16).intValue()));
    Object v18 = 1;
    Object v19 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v18).intValue()));
    Object v20 = ":";
    Object v21 = true;
    Object v22 = false;
    Object v23 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v21).booleanValue()),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = new java.lang.String[]{"K","C "};
    Object v25 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v26 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v24),((java.lang.String[])v25));
    Object v27 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v19),((java.lang.String)v20),((com.google.javascript.jscomp.parsing.Config)v23),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v26));
    Object v28 = null;
    Object v29 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v27),((com.google.javascript.rhino.jstype.ObjectType)v28));
    Object v30 = ((com.google.javascript.jscomp.SyntacticScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v15),((com.google.javascript.jscomp.Scope)v29));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = 1;
    Object v6 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v5).intValue()));
    Object v7 = ":";
    Object v8 = true;
    Object v9 = false;
    Object v10 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v8).booleanValue()),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = new java.lang.String[]{"K","C "};
    Object v12 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v13 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v11),((java.lang.String[])v12));
    Object v14 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v6),((java.lang.String)v7),((com.google.javascript.jscomp.parsing.Config)v10),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v13));
    Object v15 = 0;
    ((com.google.javascript.rhino.Node)v14).setCharno((((java.lang.Integer)v15).intValue()));
    Object v16 = null;
    Object v17 = 1;
    Object v18 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v17).intValue()));
    Object v19 = ":";
    Object v20 = true;
    Object v21 = false;
    Object v22 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v20).booleanValue()),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = new java.lang.String[]{"K","C "};
    Object v24 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v25 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v23),((java.lang.String[])v24));
    Object v26 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v18),((java.lang.String)v19),((com.google.javascript.jscomp.parsing.Config)v22),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v25));
    Object v27 = null;
    Object v28 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v26),((com.google.javascript.rhino.jstype.ObjectType)v27));
    Object v29 = ((com.google.javascript.jscomp.Scope)v28).getVars();
    Object v30 = ((com.google.javascript.jscomp.SyntacticScopeCreator)v4).createScope(((com.google.javascript.rhino.Node)v14),((com.google.javascript.jscomp.Scope)v28));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.SyntacticScopeCreator.RedeclarationHandler)v4));
    Object v6 = 1;
    Object v7 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v6).intValue()));
    Object v8 = ":";
    Object v9 = true;
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v9).booleanValue()),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new java.lang.String[]{"K","C "};
    Object v13 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v14 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v12),((java.lang.String[])v13));
    Object v15 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v7),((java.lang.String)v8),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v14));
    Object v16 = false;
    ((com.google.javascript.rhino.Node)v15).setIsSyntheticBlock((((java.lang.Boolean)v16).booleanValue()));
    Object v17 = null;
    Object v18 = 1;
    Object v19 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v18).intValue()));
    Object v20 = ":";
    Object v21 = true;
    Object v22 = false;
    Object v23 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v21).booleanValue()),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = new java.lang.String[]{"K","C "};
    Object v25 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v26 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v24),((java.lang.String[])v25));
    Object v27 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v19),((java.lang.String)v20),((com.google.javascript.jscomp.parsing.Config)v23),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v26));
    Object v28 = null;
    Object v29 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v27),((com.google.javascript.rhino.jstype.ObjectType)v28));
    Object v30 = ((com.google.javascript.jscomp.SyntacticScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v15),((com.google.javascript.jscomp.Scope)v29));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.SyntacticScopeCreator.RedeclarationHandler)v4));
    Object v6 = 1;
    Object v7 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v6).intValue()));
    Object v8 = ":";
    Object v9 = true;
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v9).booleanValue()),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new java.lang.String[]{"K","C "};
    Object v13 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v14 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v12),((java.lang.String[])v13));
    Object v15 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v7),((java.lang.String)v8),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v14));
    Object v16 = 43;
    ((com.google.javascript.rhino.Node)v15).setCharno((((java.lang.Integer)v16).intValue()));
    Object v17 = null;
    Object v18 = 1;
    Object v19 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v18).intValue()));
    Object v20 = ":";
    Object v21 = true;
    Object v22 = false;
    Object v23 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v21).booleanValue()),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = new java.lang.String[]{"K","C "};
    Object v25 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v26 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v24),((java.lang.String[])v25));
    Object v27 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v19),((java.lang.String)v20),((com.google.javascript.jscomp.parsing.Config)v23),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v26));
    Object v28 = null;
    Object v29 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v27),((com.google.javascript.rhino.jstype.ObjectType)v28));
    Object v30 = ((com.google.javascript.jscomp.Scope)v29).getVarCount();
    Object v31 = ((com.google.javascript.jscomp.SyntacticScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v15),((com.google.javascript.jscomp.Scope)v29));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.SyntacticScopeCreator.RedeclarationHandler)v4));
    Object v6 = 1;
    Object v7 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v6).intValue()));
    Object v8 = ":";
    Object v9 = true;
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v9).booleanValue()),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new java.lang.String[]{"K","C "};
    Object v13 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v14 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v12),((java.lang.String[])v13));
    Object v15 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v7),((java.lang.String)v8),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v14));
    Object v16 = 1;
    Object v17 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v16).intValue()));
    Object v18 = ":";
    Object v19 = true;
    Object v20 = false;
    Object v21 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v19).booleanValue()),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = new java.lang.String[]{"K","C "};
    Object v23 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v24 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v22),((java.lang.String[])v23));
    Object v25 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v17),((java.lang.String)v18),((com.google.javascript.jscomp.parsing.Config)v21),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v24));
    Object v26 = null;
    Object v27 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v25),((com.google.javascript.rhino.jstype.ObjectType)v26));
    Object v28 = ((com.google.javascript.jscomp.Scope)v27).getVarCount();
    Object v29 = ((com.google.javascript.jscomp.SyntacticScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v15),((com.google.javascript.jscomp.Scope)v27));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.SyntacticScopeCreator.RedeclarationHandler)v4));
    Object v6 = 1;
    Object v7 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v6).intValue()));
    Object v8 = ":";
    Object v9 = true;
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v9).booleanValue()),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new java.lang.String[]{"K","C "};
    Object v13 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v14 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v12),((java.lang.String[])v13));
    Object v15 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v7),((java.lang.String)v8),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v14));
    Object v16 = 0;
    ((com.google.javascript.rhino.Node)v15).setType((((java.lang.Integer)v16).intValue()));
    Object v17 = null;
    Object v18 = 1;
    Object v19 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v18).intValue()));
    Object v20 = ":";
    Object v21 = true;
    Object v22 = false;
    Object v23 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v21).booleanValue()),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = new java.lang.String[]{"K","C "};
    Object v25 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v26 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v24),((java.lang.String[])v25));
    Object v27 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v19),((java.lang.String)v20),((com.google.javascript.jscomp.parsing.Config)v23),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v26));
    Object v28 = null;
    Object v29 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v27),((com.google.javascript.rhino.jstype.ObjectType)v28));
    Object v30 = ((com.google.javascript.jscomp.SyntacticScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v15),((com.google.javascript.jscomp.Scope)v29));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "`*";
    Object v5 = 0;
    Object v6 = ((com.google.javascript.jscomp.SourceExcerptProvider)v3).getSourceLine(((java.lang.String)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "`*";
    Object v5 = 0;
    Object v6 = ((com.google.javascript.jscomp.SourceExcerptProvider)v3).getSourceLine(((java.lang.String)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v8 = 1;
    Object v9 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v8).intValue()));
    Object v10 = ":";
    Object v11 = true;
    Object v12 = false;
    Object v13 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new java.lang.String[]{"K","C "};
    Object v15 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v16 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v14),((java.lang.String[])v15));
    Object v17 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v9),((java.lang.String)v10),((com.google.javascript.jscomp.parsing.Config)v13),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v16));
    Object v18 = 1;
    Object v19 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v18).intValue()));
    Object v20 = ":";
    Object v21 = true;
    Object v22 = false;
    Object v23 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v21).booleanValue()),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = new java.lang.String[]{"K","C "};
    Object v25 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v26 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v24),((java.lang.String[])v25));
    Object v27 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v19),((java.lang.String)v20),((com.google.javascript.jscomp.parsing.Config)v23),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v26));
    Object v28 = null;
    Object v29 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v27),((com.google.javascript.rhino.jstype.ObjectType)v28));
    Object v30 = ((com.google.javascript.jscomp.SyntacticScopeCreator)v7).createScope(((com.google.javascript.rhino.Node)v17),((com.google.javascript.jscomp.Scope)v29));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "`*";
    Object v5 = 0;
    Object v6 = ((com.google.javascript.jscomp.SourceExcerptProvider)v3).getSourceLine(((java.lang.String)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v8 = 1;
    Object v9 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v8).intValue()));
    Object v10 = ":";
    Object v11 = true;
    Object v12 = false;
    Object v13 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new java.lang.String[]{"K","C "};
    Object v15 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v16 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v14),((java.lang.String[])v15));
    Object v17 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v9),((java.lang.String)v10),((com.google.javascript.jscomp.parsing.Config)v13),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v16));
    Object v18 = true;
    ((com.google.javascript.rhino.Node)v17).setWasEmptyNode((((java.lang.Boolean)v18).booleanValue()));
    Object v19 = null;
    Object v20 = 1;
    Object v21 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v20).intValue()));
    Object v22 = ":";
    Object v23 = true;
    Object v24 = false;
    Object v25 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v23).booleanValue()),(((java.lang.Boolean)v24).booleanValue()));
    Object v26 = new java.lang.String[]{"K","C "};
    Object v27 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v28 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v26),((java.lang.String[])v27));
    Object v29 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v21),((java.lang.String)v22),((com.google.javascript.jscomp.parsing.Config)v25),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v28));
    Object v30 = null;
    Object v31 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v29),((com.google.javascript.rhino.jstype.ObjectType)v30));
    Object v32 = ((com.google.javascript.jscomp.SyntacticScopeCreator)v7).createScope(((com.google.javascript.rhino.Node)v17),((com.google.javascript.jscomp.Scope)v31));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.SyntacticScopeCreator.RedeclarationHandler)v4));
    Object v6 = 1;
    Object v7 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v6).intValue()));
    Object v8 = ":";
    Object v9 = true;
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v9).booleanValue()),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new java.lang.String[]{"K","C "};
    Object v13 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v14 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v12),((java.lang.String[])v13));
    Object v15 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v7),((java.lang.String)v8),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v14));
    Object v16 = ((com.google.javascript.rhino.Node)v15).isUnscopedQualifiedName();
    Object v17 = 1;
    Object v18 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v17).intValue()));
    Object v19 = ":";
    Object v20 = true;
    Object v21 = false;
    Object v22 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v20).booleanValue()),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = new java.lang.String[]{"K","C "};
    Object v24 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v25 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v23),((java.lang.String[])v24));
    Object v26 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v18),((java.lang.String)v19),((com.google.javascript.jscomp.parsing.Config)v22),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v25));
    Object v27 = null;
    Object v28 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v26),((com.google.javascript.rhino.jstype.ObjectType)v27));
    Object v29 = ((com.google.javascript.jscomp.Scope)v28).getVarCount();
    Object v30 = ((com.google.javascript.jscomp.SyntacticScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v15),((com.google.javascript.jscomp.Scope)v28));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "`*";
    Object v5 = 0;
    Object v6 = ((com.google.javascript.jscomp.SourceExcerptProvider)v3).getSourceLine(((java.lang.String)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v8 = 1;
    Object v9 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v8).intValue()));
    Object v10 = ":";
    Object v11 = true;
    Object v12 = false;
    Object v13 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new java.lang.String[]{"K","C "};
    Object v15 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v16 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v14),((java.lang.String[])v15));
    Object v17 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v9),((java.lang.String)v10),((com.google.javascript.jscomp.parsing.Config)v13),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v16));
    Object v18 = 1;
    Object v19 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v18).intValue()));
    Object v20 = ":";
    Object v21 = true;
    Object v22 = false;
    Object v23 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v21).booleanValue()),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = new java.lang.String[]{"K","C "};
    Object v25 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v26 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v24),((java.lang.String[])v25));
    Object v27 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v19),((java.lang.String)v20),((com.google.javascript.jscomp.parsing.Config)v23),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v26));
    Object v28 = null;
    Object v29 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v27),((com.google.javascript.rhino.jstype.ObjectType)v28));
    Object v30 = "IdExpr";
    Object v31 = ((com.google.javascript.jscomp.Scope)v29).getSlot(((java.lang.String)v30));
    Object v32 = ((com.google.javascript.jscomp.SyntacticScopeCreator)v7).createScope(((com.google.javascript.rhino.Node)v17),((com.google.javascript.jscomp.Scope)v29));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "`*";
    Object v5 = 0;
    Object v6 = ((com.google.javascript.jscomp.SourceExcerptProvider)v3).getSourceLine(((java.lang.String)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v8 = 1;
    Object v9 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v8).intValue()));
    Object v10 = ":";
    Object v11 = true;
    Object v12 = false;
    Object v13 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new java.lang.String[]{"K","C "};
    Object v15 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v16 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v14),((java.lang.String[])v15));
    Object v17 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v9),((java.lang.String)v10),((com.google.javascript.jscomp.parsing.Config)v13),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v16));
    Object v18 = 1;
    Object v19 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v18).intValue()));
    Object v20 = ":";
    Object v21 = true;
    Object v22 = false;
    Object v23 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v21).booleanValue()),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = new java.lang.String[]{"K","C "};
    Object v25 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v26 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v24),((java.lang.String[])v25));
    Object v27 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v19),((java.lang.String)v20),((com.google.javascript.jscomp.parsing.Config)v23),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v26));
    Object v28 = null;
    Object v29 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v27),((com.google.javascript.rhino.jstype.ObjectType)v28));
    Object v30 = ((com.google.javascript.jscomp.Scope)v29).getVars();
    Object v31 = ((com.google.javascript.jscomp.SyntacticScopeCreator)v7).createScope(((com.google.javascript.rhino.Node)v17),((com.google.javascript.jscomp.Scope)v29));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.SyntacticScopeCreator.RedeclarationHandler)v4));
    Object v6 = 1;
    Object v7 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v6).intValue()));
    Object v8 = ":";
    Object v9 = true;
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v9).booleanValue()),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new java.lang.String[]{"K","C "};
    Object v13 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v14 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v12),((java.lang.String[])v13));
    Object v15 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v7),((java.lang.String)v8),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v14));
    Object v16 = 1;
    Object v17 = 0;
    ((com.google.javascript.rhino.Node)v15).putIntProp((((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()));
    Object v18 = null;
    Object v19 = 1;
    Object v20 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v19).intValue()));
    Object v21 = ":";
    Object v22 = true;
    Object v23 = false;
    Object v24 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v22).booleanValue()),(((java.lang.Boolean)v23).booleanValue()));
    Object v25 = new java.lang.String[]{"K","C "};
    Object v26 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v27 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v25),((java.lang.String[])v26));
    Object v28 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v20),((java.lang.String)v21),((com.google.javascript.jscomp.parsing.Config)v24),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v27));
    Object v29 = null;
    Object v30 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v28),((com.google.javascript.rhino.jstype.ObjectType)v29));
    Object v31 = "argument|";
    Object v32 = ((com.google.javascript.jscomp.Scope)v30).getVar(((java.lang.String)v31));
    Object v33 = ((com.google.javascript.jscomp.SyntacticScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v15),((com.google.javascript.jscomp.Scope)v30));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "`*";
    Object v5 = 0;
    Object v6 = ((com.google.javascript.jscomp.SourceExcerptProvider)v3).getSourceLine(((java.lang.String)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v8 = 1;
    Object v9 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v8).intValue()));
    Object v10 = ":";
    Object v11 = true;
    Object v12 = false;
    Object v13 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new java.lang.String[]{"K","C "};
    Object v15 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v16 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v14),((java.lang.String[])v15));
    Object v17 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v9),((java.lang.String)v10),((com.google.javascript.jscomp.parsing.Config)v13),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v16));
    Object v18 = 1;
    Object v19 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v18).intValue()));
    Object v20 = ":";
    Object v21 = true;
    Object v22 = false;
    Object v23 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v21).booleanValue()),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = new java.lang.String[]{"K","C "};
    Object v25 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v26 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v24),((java.lang.String[])v25));
    Object v27 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v19),((java.lang.String)v20),((com.google.javascript.jscomp.parsing.Config)v23),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v26));
    Object v28 = null;
    Object v29 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v27),((com.google.javascript.rhino.jstype.ObjectType)v28));
    Object v30 = ((com.google.javascript.jscomp.Scope)v29).getVarCount();
    Object v31 = ((com.google.javascript.jscomp.SyntacticScopeCreator)v7).createScope(((com.google.javascript.rhino.Node)v17),((com.google.javascript.jscomp.Scope)v29));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.SyntacticScopeCreator.RedeclarationHandler)v4));
    Object v6 = 1;
    Object v7 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v6).intValue()));
    Object v8 = ":";
    Object v9 = true;
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v9).booleanValue()),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new java.lang.String[]{"K","C "};
    Object v13 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v14 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v12),((java.lang.String[])v13));
    Object v15 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v7),((java.lang.String)v8),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v14));
    Object v16 = true;
    ((com.google.javascript.rhino.Node)v15).setVarArgs((((java.lang.Boolean)v16).booleanValue()));
    Object v17 = null;
    Object v18 = 1;
    Object v19 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v18).intValue()));
    Object v20 = ":";
    Object v21 = true;
    Object v22 = false;
    Object v23 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v21).booleanValue()),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = new java.lang.String[]{"K","C "};
    Object v25 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v26 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v24),((java.lang.String[])v25));
    Object v27 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v19),((java.lang.String)v20),((com.google.javascript.jscomp.parsing.Config)v23),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v26));
    Object v28 = null;
    Object v29 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v27),((com.google.javascript.rhino.jstype.ObjectType)v28));
    Object v30 = ".prototyp>e";
    Object v31 = ((com.google.javascript.jscomp.Scope)v29).getVar(((java.lang.String)v30));
    Object v32 = ((com.google.javascript.jscomp.SyntacticScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v15),((com.google.javascript.jscomp.Scope)v29));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "`*";
    Object v5 = 0;
    Object v6 = ((com.google.javascript.jscomp.SourceExcerptProvider)v3).getSourceLine(((java.lang.String)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v8 = 1;
    Object v9 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v8).intValue()));
    Object v10 = ":";
    Object v11 = true;
    Object v12 = false;
    Object v13 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new java.lang.String[]{"K","C "};
    Object v15 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v16 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v14),((java.lang.String[])v15));
    Object v17 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v9),((java.lang.String)v10),((com.google.javascript.jscomp.parsing.Config)v13),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v16));
    Object v18 = 1;
    Object v19 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v18).intValue()));
    Object v20 = ":";
    Object v21 = true;
    Object v22 = false;
    Object v23 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v21).booleanValue()),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = new java.lang.String[]{"K","C "};
    Object v25 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v26 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v24),((java.lang.String[])v25));
    Object v27 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v19),((java.lang.String)v20),((com.google.javascript.jscomp.parsing.Config)v23),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v26));
    Object v28 = null;
    Object v29 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v27),((com.google.javascript.rhino.jstype.ObjectType)v28));
    Object v30 = "indexOf";
    Object v31 = ((com.google.javascript.jscomp.Scope)v29).getOwnSlot(((java.lang.String)v30));
    Object v32 = ((com.google.javascript.jscomp.SyntacticScopeCreator)v7).createScope(((com.google.javascript.rhino.Node)v17),((com.google.javascript.jscomp.Scope)v29));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "";
    Object v5 = -21;
    Object v6 = ((com.google.javascript.jscomp.SourceExcerptProvider)v3).getSourceLine(((java.lang.String)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "";
    Object v5 = -21;
    Object v6 = ((com.google.javascript.jscomp.SourceExcerptProvider)v3).getSourceLine(((java.lang.String)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v8 = 1;
    Object v9 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v8).intValue()));
    Object v10 = ":";
    Object v11 = true;
    Object v12 = false;
    Object v13 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new java.lang.String[]{"K","C "};
    Object v15 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v16 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v14),((java.lang.String[])v15));
    Object v17 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v9),((java.lang.String)v10),((com.google.javascript.jscomp.parsing.Config)v13),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v16));
    Object v18 = 1;
    Object v19 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v18).intValue()));
    Object v20 = ":";
    Object v21 = true;
    Object v22 = false;
    Object v23 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v21).booleanValue()),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = new java.lang.String[]{"K","C "};
    Object v25 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v26 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v24),((java.lang.String[])v25));
    Object v27 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v19),((java.lang.String)v20),((com.google.javascript.jscomp.parsing.Config)v23),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v26));
    Object v28 = null;
    Object v29 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v27),((com.google.javascript.rhino.jstype.ObjectType)v28));
    Object v30 = ((com.google.javascript.jscomp.SyntacticScopeCreator)v7).createScope(((com.google.javascript.rhino.Node)v17),((com.google.javascript.jscomp.Scope)v29));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "";
    Object v5 = -21;
    Object v6 = ((com.google.javascript.jscomp.SourceExcerptProvider)v3).getSourceLine(((java.lang.String)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v8 = 1;
    Object v9 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v8).intValue()));
    Object v10 = ":";
    Object v11 = true;
    Object v12 = false;
    Object v13 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new java.lang.String[]{"K","C "};
    Object v15 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v16 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v14),((java.lang.String[])v15));
    Object v17 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v9),((java.lang.String)v10),((com.google.javascript.jscomp.parsing.Config)v13),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v16));
    ((com.google.javascript.rhino.Node)v17).detachChildren();
    Object v18 = null;
    Object v19 = 1;
    Object v20 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v19).intValue()));
    Object v21 = ":";
    Object v22 = true;
    Object v23 = false;
    Object v24 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v22).booleanValue()),(((java.lang.Boolean)v23).booleanValue()));
    Object v25 = new java.lang.String[]{"K","C "};
    Object v26 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v27 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v25),((java.lang.String[])v26));
    Object v28 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v20),((java.lang.String)v21),((com.google.javascript.jscomp.parsing.Config)v24),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v27));
    Object v29 = null;
    Object v30 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v28),((com.google.javascript.rhino.jstype.ObjectType)v29));
    Object v31 = ((com.google.javascript.jscomp.SyntacticScopeCreator)v7).createScope(((com.google.javascript.rhino.Node)v17),((com.google.javascript.jscomp.Scope)v30));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.SyntacticScopeCreator.RedeclarationHandler)v4));
    Object v6 = 1;
    Object v7 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v6).intValue()));
    Object v8 = ":";
    Object v9 = true;
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v9).booleanValue()),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new java.lang.String[]{"K","C "};
    Object v13 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v14 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v12),((java.lang.String[])v13));
    Object v15 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v7),((java.lang.String)v8),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v14));
    Object v16 = ((com.google.javascript.rhino.Node)v15).toStringTree();
    Object v17 = 1;
    Object v18 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v17).intValue()));
    Object v19 = ":";
    Object v20 = true;
    Object v21 = false;
    Object v22 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v20).booleanValue()),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = new java.lang.String[]{"K","C "};
    Object v24 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v25 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v23),((java.lang.String[])v24));
    Object v26 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v18),((java.lang.String)v19),((com.google.javascript.jscomp.parsing.Config)v22),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v25));
    Object v27 = null;
    Object v28 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v26),((com.google.javascript.rhino.jstype.ObjectType)v27));
    Object v29 = ((com.google.javascript.jscomp.SyntacticScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v15),((com.google.javascript.jscomp.Scope)v28));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "`*";
    Object v5 = 0;
    Object v6 = ((com.google.javascript.jscomp.SourceExcerptProvider)v3).getSourceLine(((java.lang.String)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v8 = 1;
    Object v9 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v8).intValue()));
    Object v10 = ":";
    Object v11 = true;
    Object v12 = false;
    Object v13 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new java.lang.String[]{"K","C "};
    Object v15 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v16 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v14),((java.lang.String[])v15));
    Object v17 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v9),((java.lang.String)v10),((com.google.javascript.jscomp.parsing.Config)v13),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v16));
    Object v18 = ((com.google.javascript.rhino.Node)v17).cloneTree();
    Object v19 = 1;
    Object v20 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v19).intValue()));
    Object v21 = ":";
    Object v22 = true;
    Object v23 = false;
    Object v24 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v22).booleanValue()),(((java.lang.Boolean)v23).booleanValue()));
    Object v25 = new java.lang.String[]{"K","C "};
    Object v26 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v27 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v25),((java.lang.String[])v26));
    Object v28 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v20),((java.lang.String)v21),((com.google.javascript.jscomp.parsing.Config)v24),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v27));
    Object v29 = null;
    Object v30 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v28),((com.google.javascript.rhino.jstype.ObjectType)v29));
    Object v31 = ((com.google.javascript.jscomp.SyntacticScopeCreator)v7).createScope(((com.google.javascript.rhino.Node)v17),((com.google.javascript.jscomp.Scope)v30));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.SyntacticScopeCreator.RedeclarationHandler)v4));
    Object v6 = 1;
    Object v7 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v6).intValue()));
    Object v8 = ":";
    Object v9 = true;
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v9).booleanValue()),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new java.lang.String[]{"K","C "};
    Object v13 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v14 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v12),((java.lang.String[])v13));
    Object v15 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v7),((java.lang.String)v8),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v14));
    Object v16 = false;
    ((com.google.javascript.rhino.Node)v15).setOptionalArg((((java.lang.Boolean)v16).booleanValue()));
    Object v17 = null;
    Object v18 = 1;
    Object v19 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v18).intValue()));
    Object v20 = ":";
    Object v21 = true;
    Object v22 = false;
    Object v23 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v21).booleanValue()),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = new java.lang.String[]{"K","C "};
    Object v25 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v26 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v24),((java.lang.String[])v25));
    Object v27 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v19),((java.lang.String)v20),((com.google.javascript.jscomp.parsing.Config)v23),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v26));
    Object v28 = null;
    Object v29 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v27),((com.google.javascript.rhino.jstype.ObjectType)v28));
    Object v30 = "Number node not created with Node.lnewNumber";
    Object v31 = ((com.google.javascript.jscomp.Scope)v29).getVar(((java.lang.String)v30));
    Object v32 = ((com.google.javascript.jscomp.SyntacticScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v15),((com.google.javascript.jscomp.Scope)v29));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "`*";
    Object v5 = 0;
    Object v6 = ((com.google.javascript.jscomp.SourceExcerptProvider)v3).getSourceLine(((java.lang.String)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v8 = 1;
    Object v9 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v8).intValue()));
    Object v10 = ":";
    Object v11 = true;
    Object v12 = false;
    Object v13 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new java.lang.String[]{"K","C "};
    Object v15 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v16 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v14),((java.lang.String[])v15));
    Object v17 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v9),((java.lang.String)v10),((com.google.javascript.jscomp.parsing.Config)v13),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v16));
    Object v18 = 1;
    Object v19 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v18).intValue()));
    Object v20 = ":";
    Object v21 = true;
    Object v22 = false;
    Object v23 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v21).booleanValue()),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = new java.lang.String[]{"K","C "};
    Object v25 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v26 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v24),((java.lang.String[])v25));
    Object v27 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v19),((java.lang.String)v20),((com.google.javascript.jscomp.parsing.Config)v23),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v26));
    Object v28 = null;
    Object v29 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v27),((com.google.javascript.rhino.jstype.ObjectType)v28));
    Object v30 = "undefied";
    Object v31 = ((com.google.javascript.jscomp.Scope)v29).getSlot(((java.lang.String)v30));
    Object v32 = ((com.google.javascript.jscomp.SyntacticScopeCreator)v7).createScope(((com.google.javascript.rhino.Node)v17),((com.google.javascript.jscomp.Scope)v29));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "";
    Object v5 = -21;
    Object v6 = ((com.google.javascript.jscomp.SourceExcerptProvider)v3).getSourceLine(((java.lang.String)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v8 = 1;
    Object v9 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v8).intValue()));
    Object v10 = ":";
    Object v11 = true;
    Object v12 = false;
    Object v13 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new java.lang.String[]{"K","C "};
    Object v15 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v16 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v14),((java.lang.String[])v15));
    Object v17 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v9),((java.lang.String)v10),((com.google.javascript.jscomp.parsing.Config)v13),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v16));
    Object v18 = 1;
    Object v19 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v18).intValue()));
    Object v20 = ":";
    Object v21 = true;
    Object v22 = false;
    Object v23 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v21).booleanValue()),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = new java.lang.String[]{"K","C "};
    Object v25 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v26 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v24),((java.lang.String[])v25));
    Object v27 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v19),((java.lang.String)v20),((com.google.javascript.jscomp.parsing.Config)v23),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v26));
    Object v28 = null;
    Object v29 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v27),((com.google.javascript.rhino.jstype.ObjectType)v28));
    Object v30 = "w";
    Object v31 = false;
    Object v32 = ((com.google.javascript.jscomp.Scope)v29).isDeclared(((java.lang.String)v30),(((java.lang.Boolean)v31).booleanValue()));
    Object v33 = ((com.google.javascript.jscomp.SyntacticScopeCreator)v7).createScope(((com.google.javascript.rhino.Node)v17),((com.google.javascript.jscomp.Scope)v29));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "";
    Object v5 = -21;
    Object v6 = ((com.google.javascript.jscomp.SourceExcerptProvider)v3).getSourceLine(((java.lang.String)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v8 = 1;
    Object v9 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v8).intValue()));
    Object v10 = ":";
    Object v11 = true;
    Object v12 = false;
    Object v13 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new java.lang.String[]{"K","C "};
    Object v15 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v16 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v14),((java.lang.String[])v15));
    Object v17 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v9),((java.lang.String)v10),((com.google.javascript.jscomp.parsing.Config)v13),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v16));
    Object v18 = 1;
    Object v19 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v18).intValue()));
    Object v20 = ":";
    Object v21 = true;
    Object v22 = false;
    Object v23 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v21).booleanValue()),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = new java.lang.String[]{"K","C "};
    Object v25 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v26 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v24),((java.lang.String[])v25));
    Object v27 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v19),((java.lang.String)v20),((com.google.javascript.jscomp.parsing.Config)v23),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v26));
    Object v28 = null;
    Object v29 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v27),((com.google.javascript.rhino.jstype.ObjectType)v28));
    Object v30 = ((com.google.javascript.jscomp.Scope)v29).getVarCount();
    Object v31 = ((com.google.javascript.jscomp.SyntacticScopeCreator)v7).createScope(((com.google.javascript.rhino.Node)v17),((com.google.javascript.jscomp.Scope)v29));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "`*";
    Object v5 = 0;
    Object v6 = ((com.google.javascript.jscomp.SourceExcerptProvider)v3).getSourceLine(((java.lang.String)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v8 = 1;
    Object v9 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v8).intValue()));
    Object v10 = ":";
    Object v11 = true;
    Object v12 = false;
    Object v13 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new java.lang.String[]{"K","C "};
    Object v15 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v16 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v14),((java.lang.String[])v15));
    Object v17 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v9),((java.lang.String)v10),((com.google.javascript.jscomp.parsing.Config)v13),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v16));
    Object v18 = 1;
    Object v19 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v18).intValue()));
    Object v20 = ":";
    Object v21 = true;
    Object v22 = false;
    Object v23 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v21).booleanValue()),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = new java.lang.String[]{"K","C "};
    Object v25 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v26 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v24),((java.lang.String[])v25));
    Object v27 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v19),((java.lang.String)v20),((com.google.javascript.jscomp.parsing.Config)v23),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v26));
    Object v28 = null;
    Object v29 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v27),((com.google.javascript.rhino.jstype.ObjectType)v28));
    Object v30 = "FUNCTION_FUNCTION_TYPE";
    Object v31 = ((com.google.javascript.jscomp.Scope)v29).getSlot(((java.lang.String)v30));
    Object v32 = ((com.google.javascript.jscomp.SyntacticScopeCreator)v7).createScope(((com.google.javascript.rhino.Node)v17),((com.google.javascript.jscomp.Scope)v29));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = 1;
    Object v6 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v5).intValue()));
    Object v7 = ":";
    Object v8 = true;
    Object v9 = false;
    Object v10 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v8).booleanValue()),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = new java.lang.String[]{"K","C "};
    Object v12 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v13 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v11),((java.lang.String[])v12));
    Object v14 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v6),((java.lang.String)v7),((com.google.javascript.jscomp.parsing.Config)v10),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v13));
    Object v15 = ((com.google.javascript.rhino.Node)v14).removeChildren();
    Object v16 = 1;
    Object v17 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v16).intValue()));
    Object v18 = ":";
    Object v19 = true;
    Object v20 = false;
    Object v21 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v19).booleanValue()),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = new java.lang.String[]{"K","C "};
    Object v23 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v24 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v22),((java.lang.String[])v23));
    Object v25 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v17),((java.lang.String)v18),((com.google.javascript.jscomp.parsing.Config)v21),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v24));
    Object v26 = null;
    Object v27 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v25),((com.google.javascript.rhino.jstype.ObjectType)v26));
    Object v28 = ((com.google.javascript.jscomp.SyntacticScopeCreator)v4).createScope(((com.google.javascript.rhino.Node)v14),((com.google.javascript.jscomp.Scope)v27));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = 1;
    Object v6 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v5).intValue()));
    Object v7 = ":";
    Object v8 = true;
    Object v9 = false;
    Object v10 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v8).booleanValue()),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = new java.lang.String[]{"K","C "};
    Object v12 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v13 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v11),((java.lang.String[])v12));
    Object v14 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v6),((java.lang.String)v7),((com.google.javascript.jscomp.parsing.Config)v10),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v13));
    Object v15 = true;
    ((com.google.javascript.rhino.Node)v14).setVarArgs((((java.lang.Boolean)v15).booleanValue()));
    Object v16 = null;
    Object v17 = 1;
    Object v18 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v17).intValue()));
    Object v19 = ":";
    Object v20 = true;
    Object v21 = false;
    Object v22 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v20).booleanValue()),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = new java.lang.String[]{"K","C "};
    Object v24 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v25 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v23),((java.lang.String[])v24));
    Object v26 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v18),((java.lang.String)v19),((com.google.javascript.jscomp.parsing.Config)v22),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v25));
    Object v27 = null;
    Object v28 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v26),((com.google.javascript.rhino.jstype.ObjectType)v27));
    Object v29 = ((com.google.javascript.jscomp.Scope)v28).getVarCount();
    Object v30 = ((com.google.javascript.jscomp.SyntacticScopeCreator)v4).createScope(((com.google.javascript.rhino.Node)v14),((com.google.javascript.jscomp.Scope)v28));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "";
    Object v5 = -21;
    Object v6 = ((com.google.javascript.jscomp.SourceExcerptProvider)v3).getSourceLine(((java.lang.String)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v8 = 1;
    Object v9 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v8).intValue()));
    Object v10 = ":";
    Object v11 = true;
    Object v12 = false;
    Object v13 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new java.lang.String[]{"K","C "};
    Object v15 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v16 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v14),((java.lang.String[])v15));
    Object v17 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v9),((java.lang.String)v10),((com.google.javascript.jscomp.parsing.Config)v13),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v16));
    Object v18 = null;
    ((com.google.javascript.rhino.Node)v17).setJSType(((com.google.javascript.rhino.jstype.JSType)v18));
    Object v19 = null;
    Object v20 = 1;
    Object v21 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v20).intValue()));
    Object v22 = ":";
    Object v23 = true;
    Object v24 = false;
    Object v25 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v23).booleanValue()),(((java.lang.Boolean)v24).booleanValue()));
    Object v26 = new java.lang.String[]{"K","C "};
    Object v27 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v28 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v26),((java.lang.String[])v27));
    Object v29 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v21),((java.lang.String)v22),((com.google.javascript.jscomp.parsing.Config)v25),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v28));
    Object v30 = null;
    Object v31 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v29),((com.google.javascript.rhino.jstype.ObjectType)v30));
    Object v32 = ((com.google.javascript.jscomp.SyntacticScopeCreator)v7).createScope(((com.google.javascript.rhino.Node)v17),((com.google.javascript.jscomp.Scope)v31));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.SyntacticScopeCreator.RedeclarationHandler)v4));
    Object v6 = 1;
    Object v7 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v6).intValue()));
    Object v8 = ":";
    Object v9 = true;
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v9).booleanValue()),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new java.lang.String[]{"K","C "};
    Object v13 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v14 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v12),((java.lang.String[])v13));
    Object v15 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v7),((java.lang.String)v8),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v14));
    Object v16 = 1;
    Object v17 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v16).intValue()));
    Object v18 = ":";
    Object v19 = true;
    Object v20 = false;
    Object v21 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v19).booleanValue()),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = new java.lang.String[]{"K","C "};
    Object v23 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v24 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v22),((java.lang.String[])v23));
    Object v25 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v17),((java.lang.String)v18),((com.google.javascript.jscomp.parsing.Config)v21),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v24));
    Object v26 = null;
    Object v27 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v25),((com.google.javascript.rhino.jstype.ObjectType)v26));
    Object v28 = "stri0ng";
    Object v29 = ((com.google.javascript.jscomp.Scope)v27).getOwnSlot(((java.lang.String)v28));
    Object v30 = ((com.google.javascript.jscomp.SyntacticScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v15),((com.google.javascript.jscomp.Scope)v27));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "";
    Object v5 = -21;
    Object v6 = ((com.google.javascript.jscomp.SourceExcerptProvider)v3).getSourceLine(((java.lang.String)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v8 = 1;
    Object v9 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v8).intValue()));
    Object v10 = ":";
    Object v11 = true;
    Object v12 = false;
    Object v13 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new java.lang.String[]{"K","C "};
    Object v15 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v16 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v14),((java.lang.String[])v15));
    Object v17 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v9),((java.lang.String)v10),((com.google.javascript.jscomp.parsing.Config)v13),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v16));
    Object v18 = "L";
    Object v19 = java.nio.charset.Charset.defaultCharset();
    Object v20 = new java.io.PrintStream(((java.lang.String)v18),((java.nio.charset.Charset)v19));
    ((com.google.javascript.rhino.Node)v17).appendStringTree(((java.lang.Appendable)v20));
    Object v21 = null;
    Object v22 = 1;
    Object v23 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v22).intValue()));
    Object v24 = ":";
    Object v25 = true;
    Object v26 = false;
    Object v27 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v25).booleanValue()),(((java.lang.Boolean)v26).booleanValue()));
    Object v28 = new java.lang.String[]{"K","C "};
    Object v29 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v30 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v28),((java.lang.String[])v29));
    Object v31 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v23),((java.lang.String)v24),((com.google.javascript.jscomp.parsing.Config)v27),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v30));
    Object v32 = null;
    Object v33 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v31),((com.google.javascript.rhino.jstype.ObjectType)v32));
    Object v34 = ((com.google.javascript.jscomp.SyntacticScopeCreator)v7).createScope(((com.google.javascript.rhino.Node)v17),((com.google.javascript.jscomp.Scope)v33));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "";
    Object v5 = -21;
    Object v6 = ((com.google.javascript.jscomp.SourceExcerptProvider)v3).getSourceLine(((java.lang.String)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v8 = 1;
    Object v9 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v8).intValue()));
    Object v10 = ":";
    Object v11 = true;
    Object v12 = false;
    Object v13 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new java.lang.String[]{"K","C "};
    Object v15 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v16 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v14),((java.lang.String[])v15));
    Object v17 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v9),((java.lang.String)v10),((com.google.javascript.jscomp.parsing.Config)v13),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v16));
    Object v18 = 1;
    Object v19 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v18).intValue()));
    Object v20 = ":";
    Object v21 = true;
    Object v22 = false;
    Object v23 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v21).booleanValue()),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = new java.lang.String[]{"K","C "};
    Object v25 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v26 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v24),((java.lang.String[])v25));
    Object v27 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v19),((java.lang.String)v20),((com.google.javascript.jscomp.parsing.Config)v23),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v26));
    Object v28 = null;
    Object v29 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v27),((com.google.javascript.rhino.jstype.ObjectType)v28));
    Object v30 = ((com.google.javascript.jscomp.Scope)v29).getVars();
    Object v31 = ((com.google.javascript.jscomp.SyntacticScopeCreator)v7).createScope(((com.google.javascript.rhino.Node)v17),((com.google.javascript.jscomp.Scope)v29));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = 1;
    Object v6 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v5).intValue()));
    Object v7 = ":";
    Object v8 = true;
    Object v9 = false;
    Object v10 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v8).booleanValue()),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = new java.lang.String[]{"K","C "};
    Object v12 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v13 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v11),((java.lang.String[])v12));
    Object v14 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v6),((java.lang.String)v7),((com.google.javascript.jscomp.parsing.Config)v10),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v13));
    Object v15 = 1;
    Object v16 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v15).intValue()));
    Object v17 = ":";
    Object v18 = true;
    Object v19 = false;
    Object v20 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v18).booleanValue()),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = new java.lang.String[]{"K","C "};
    Object v22 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v23 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v21),((java.lang.String[])v22));
    Object v24 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v16),((java.lang.String)v17),((com.google.javascript.jscomp.parsing.Config)v20),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v23));
    Object v25 = null;
    Object v26 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v24),((com.google.javascript.rhino.jstype.ObjectType)v25));
    Object v27 = "fnction";
    Object v28 = true;
    Object v29 = ((com.google.javascript.jscomp.Scope)v26).isDeclared(((java.lang.String)v27),(((java.lang.Boolean)v28).booleanValue()));
    Object v30 = ((com.google.javascript.jscomp.SyntacticScopeCreator)v4).createScope(((com.google.javascript.rhino.Node)v14),((com.google.javascript.jscomp.Scope)v26));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = 1;
    Object v7 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v6).intValue()));
    Object v8 = ":";
    Object v9 = true;
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v9).booleanValue()),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new java.lang.String[]{"K","C "};
    Object v13 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v14 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v12),((java.lang.String[])v13));
    Object v15 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v7),((java.lang.String)v8),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v14));
    Object v16 = 1;
    Object v17 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v16).intValue()));
    Object v18 = ":";
    Object v19 = true;
    Object v20 = false;
    Object v21 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v19).booleanValue()),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = new java.lang.String[]{"K","C "};
    Object v23 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v24 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v22),((java.lang.String[])v23));
    Object v25 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v17),((java.lang.String)v18),((com.google.javascript.jscomp.parsing.Config)v21),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v24));
    Object v26 = null;
    Object v27 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v25),((com.google.javascript.rhino.jstype.ObjectType)v26));
    Object v28 = ((com.google.javascript.jscomp.SyntacticScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v15),((com.google.javascript.jscomp.Scope)v27));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "`*";
    Object v5 = 0;
    Object v6 = ((com.google.javascript.jscomp.SourceExcerptProvider)v3).getSourceLine(((java.lang.String)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v8 = 1;
    Object v9 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v8).intValue()));
    Object v10 = ":";
    Object v11 = true;
    Object v12 = false;
    Object v13 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new java.lang.String[]{"K","C "};
    Object v15 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v16 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v14),((java.lang.String[])v15));
    Object v17 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v9),((java.lang.String)v10),((com.google.javascript.jscomp.parsing.Config)v13),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v16));
    Object v18 = 1;
    Object v19 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v18).intValue()));
    Object v20 = ":";
    Object v21 = true;
    Object v22 = false;
    Object v23 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v21).booleanValue()),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = new java.lang.String[]{"K","C "};
    Object v25 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v26 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v24),((java.lang.String[])v25));
    Object v27 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v19),((java.lang.String)v20),((com.google.javascript.jscomp.parsing.Config)v23),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v26));
    Object v28 = null;
    Object v29 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v27),((com.google.javascript.rhino.jstype.ObjectType)v28));
    Object v30 = "@";
    Object v31 = ((com.google.javascript.jscomp.Scope)v29).getVar(((java.lang.String)v30));
    Object v32 = ((com.google.javascript.jscomp.SyntacticScopeCreator)v7).createScope(((com.google.javascript.rhino.Node)v17),((com.google.javascript.jscomp.Scope)v29));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = 1;
    Object v7 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v6).intValue()));
    Object v8 = ":";
    Object v9 = true;
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v9).booleanValue()),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new java.lang.String[]{"K","C "};
    Object v13 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v14 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v12),((java.lang.String[])v13));
    Object v15 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v7),((java.lang.String)v8),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v14));
    Object v16 = ((com.google.javascript.rhino.Node)v15).toStringTree();
    Object v17 = 1;
    Object v18 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v17).intValue()));
    Object v19 = ":";
    Object v20 = true;
    Object v21 = false;
    Object v22 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v20).booleanValue()),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = new java.lang.String[]{"K","C "};
    Object v24 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v25 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v23),((java.lang.String[])v24));
    Object v26 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v18),((java.lang.String)v19),((com.google.javascript.jscomp.parsing.Config)v22),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v25));
    Object v27 = null;
    Object v28 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v26),((com.google.javascript.rhino.jstype.ObjectType)v27));
    Object v29 = ((com.google.javascript.jscomp.Scope)v28).getVarCount();
    Object v30 = ((com.google.javascript.jscomp.SyntacticScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v15),((com.google.javascript.jscomp.Scope)v28));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = 1;
    Object v7 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v6).intValue()));
    Object v8 = ":";
    Object v9 = true;
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v9).booleanValue()),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new java.lang.String[]{"K","C "};
    Object v13 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v14 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v12),((java.lang.String[])v13));
    Object v15 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v7),((java.lang.String)v8),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v14));
    Object v16 = ((com.google.javascript.rhino.Node)v15).children();
    Object v17 = 1;
    Object v18 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v17).intValue()));
    Object v19 = ":";
    Object v20 = true;
    Object v21 = false;
    Object v22 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v20).booleanValue()),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = new java.lang.String[]{"K","C "};
    Object v24 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v25 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v23),((java.lang.String[])v24));
    Object v26 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v18),((java.lang.String)v19),((com.google.javascript.jscomp.parsing.Config)v22),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v25));
    Object v27 = null;
    Object v28 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v26),((com.google.javascript.rhino.jstype.ObjectType)v27));
    Object v29 = ((com.google.javascript.jscomp.SyntacticScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v15),((com.google.javascript.jscomp.Scope)v28));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.SyntacticScopeCreator.RedeclarationHandler)v4));
    Object v6 = 1;
    Object v7 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v6).intValue()));
    Object v8 = ":";
    Object v9 = true;
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v9).booleanValue()),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new java.lang.String[]{"K","C "};
    Object v13 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v14 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v12),((java.lang.String[])v13));
    Object v15 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v7),((java.lang.String)v8),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v14));
    Object v16 = true;
    ((com.google.javascript.rhino.Node)v15).setWasEmptyNode((((java.lang.Boolean)v16).booleanValue()));
    Object v17 = null;
    Object v18 = 1;
    Object v19 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v18).intValue()));
    Object v20 = ":";
    Object v21 = true;
    Object v22 = false;
    Object v23 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v21).booleanValue()),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = new java.lang.String[]{"K","C "};
    Object v25 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v26 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v24),((java.lang.String[])v25));
    Object v27 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v19),((java.lang.String)v20),((com.google.javascript.jscomp.parsing.Config)v23),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v26));
    Object v28 = null;
    Object v29 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v27),((com.google.javascript.rhino.jstype.ObjectType)v28));
    Object v30 = "+";
    Object v31 = ((com.google.javascript.jscomp.Scope)v29).getVar(((java.lang.String)v30));
    Object v32 = ((com.google.javascript.jscomp.SyntacticScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v15),((com.google.javascript.jscomp.Scope)v29));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.SyntacticScopeCreator.RedeclarationHandler)v4));
    Object v6 = 1;
    Object v7 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v6).intValue()));
    Object v8 = ":";
    Object v9 = true;
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v9).booleanValue()),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new java.lang.String[]{"K","C "};
    Object v13 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v14 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v12),((java.lang.String[])v13));
    Object v15 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v7),((java.lang.String)v8),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v14));
    Object v16 = 1;
    Object v17 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v16).intValue()));
    Object v18 = ":";
    Object v19 = true;
    Object v20 = false;
    Object v21 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v19).booleanValue()),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = new java.lang.String[]{"K","C "};
    Object v23 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v24 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v22),((java.lang.String[])v23));
    Object v25 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v17),((java.lang.String)v18),((com.google.javascript.jscomp.parsing.Config)v21),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v24));
    Object v26 = null;
    Object v27 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v25),((com.google.javascript.rhino.jstype.ObjectType)v26));
    Object v28 = "";
    Object v29 = false;
    Object v30 = ((com.google.javascript.jscomp.Scope)v27).isDeclared(((java.lang.String)v28),(((java.lang.Boolean)v29).booleanValue()));
    Object v31 = ((com.google.javascript.jscomp.SyntacticScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v15),((com.google.javascript.jscomp.Scope)v27));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = 1;
    Object v7 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v6).intValue()));
    Object v8 = ":";
    Object v9 = true;
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v9).booleanValue()),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new java.lang.String[]{"K","C "};
    Object v13 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v14 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v12),((java.lang.String[])v13));
    Object v15 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v7),((java.lang.String)v8),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v14));
    Object v16 = ((com.google.javascript.rhino.Node)v15).hasSideEffects();
    Object v17 = 1;
    Object v18 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v17).intValue()));
    Object v19 = ":";
    Object v20 = true;
    Object v21 = false;
    Object v22 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v20).booleanValue()),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = new java.lang.String[]{"K","C "};
    Object v24 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v25 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v23),((java.lang.String[])v24));
    Object v26 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v18),((java.lang.String)v19),((com.google.javascript.jscomp.parsing.Config)v22),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v25));
    Object v27 = null;
    Object v28 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v26),((com.google.javascript.rhino.jstype.ObjectType)v27));
    Object v29 = ((com.google.javascript.jscomp.Scope)v28).getVars();
    Object v30 = ((com.google.javascript.jscomp.SyntacticScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v15),((com.google.javascript.jscomp.Scope)v28));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = 1;
    Object v7 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v6).intValue()));
    Object v8 = ":";
    Object v9 = true;
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v9).booleanValue()),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new java.lang.String[]{"K","C "};
    Object v13 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v14 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v12),((java.lang.String[])v13));
    Object v15 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v7),((java.lang.String)v8),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v14));
    Object v16 = true;
    ((com.google.javascript.rhino.Node)v15).setOptionalArg((((java.lang.Boolean)v16).booleanValue()));
    Object v17 = null;
    Object v18 = 1;
    Object v19 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v18).intValue()));
    Object v20 = ":";
    Object v21 = true;
    Object v22 = false;
    Object v23 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v21).booleanValue()),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = new java.lang.String[]{"K","C "};
    Object v25 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v26 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v24),((java.lang.String[])v25));
    Object v27 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v19),((java.lang.String)v20),((com.google.javascript.jscomp.parsing.Config)v23),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v26));
    Object v28 = null;
    Object v29 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v27),((com.google.javascript.rhino.jstype.ObjectType)v28));
    Object v30 = ((com.google.javascript.jscomp.SyntacticScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v15),((com.google.javascript.jscomp.Scope)v29));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.SyntacticScopeCreator.RedeclarationHandler)v4));
    Object v6 = 1;
    Object v7 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v6).intValue()));
    Object v8 = ":";
    Object v9 = true;
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v9).booleanValue()),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new java.lang.String[]{"K","C "};
    Object v13 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v14 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v12),((java.lang.String[])v13));
    Object v15 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v7),((java.lang.String)v8),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v14));
    Object v16 = 1;
    Object v17 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v16).intValue()));
    Object v18 = ":";
    Object v19 = true;
    Object v20 = false;
    Object v21 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v19).booleanValue()),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = new java.lang.String[]{"K","C "};
    Object v23 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v24 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v22),((java.lang.String[])v23));
    Object v25 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v17),((java.lang.String)v18),((com.google.javascript.jscomp.parsing.Config)v21),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v24));
    Object v26 = ((com.google.javascript.rhino.Node)v15).clonePropsFrom(((com.google.javascript.rhino.Node)v25));
    Object v27 = 1;
    Object v28 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v27).intValue()));
    Object v29 = ":";
    Object v30 = true;
    Object v31 = false;
    Object v32 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v30).booleanValue()),(((java.lang.Boolean)v31).booleanValue()));
    Object v33 = new java.lang.String[]{"K","C "};
    Object v34 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v35 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v33),((java.lang.String[])v34));
    Object v36 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v28),((java.lang.String)v29),((com.google.javascript.jscomp.parsing.Config)v32),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v35));
    Object v37 = null;
    Object v38 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v36),((com.google.javascript.rhino.jstype.ObjectType)v37));
    Object v39 = ((com.google.javascript.jscomp.SyntacticScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v15),((com.google.javascript.jscomp.Scope)v38));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = 1;
    Object v7 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v6).intValue()));
    Object v8 = ":";
    Object v9 = true;
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v9).booleanValue()),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new java.lang.String[]{"K","C "};
    Object v13 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v14 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v12),((java.lang.String[])v13));
    Object v15 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v7),((java.lang.String)v8),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v14));
    Object v16 = 1;
    Object v17 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v16).intValue()));
    Object v18 = ":";
    Object v19 = true;
    Object v20 = false;
    Object v21 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v19).booleanValue()),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = new java.lang.String[]{"K","C "};
    Object v23 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v24 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v22),((java.lang.String[])v23));
    Object v25 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v17),((java.lang.String)v18),((com.google.javascript.jscomp.parsing.Config)v21),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v24));
    Object v26 = null;
    Object v27 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v25),((com.google.javascript.rhino.jstype.ObjectType)v26));
    Object v28 = "@this type of a function must be an object\nActual type: {0}";
    Object v29 = ((com.google.javascript.jscomp.Scope)v27).getSlot(((java.lang.String)v28));
    Object v30 = ((com.google.javascript.jscomp.SyntacticScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v15),((com.google.javascript.jscomp.Scope)v27));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "";
    Object v5 = -21;
    Object v6 = ((com.google.javascript.jscomp.SourceExcerptProvider)v3).getSourceLine(((java.lang.String)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v8 = 1;
    Object v9 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v8).intValue()));
    Object v10 = ":";
    Object v11 = true;
    Object v12 = false;
    Object v13 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new java.lang.String[]{"K","C "};
    Object v15 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v16 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v14),((java.lang.String[])v15));
    Object v17 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v9),((java.lang.String)v10),((com.google.javascript.jscomp.parsing.Config)v13),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v16));
    Object v18 = 1;
    Object v19 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v18).intValue()));
    Object v20 = ":";
    Object v21 = true;
    Object v22 = false;
    Object v23 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v21).booleanValue()),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = new java.lang.String[]{"K","C "};
    Object v25 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v26 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v24),((java.lang.String[])v25));
    Object v27 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v19),((java.lang.String)v20),((com.google.javascript.jscomp.parsing.Config)v23),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v26));
    Object v28 = null;
    Object v29 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v27),((com.google.javascript.rhino.jstype.ObjectType)v28));
    Object v30 = "instancef";
    Object v31 = ((com.google.javascript.jscomp.Scope)v29).getVar(((java.lang.String)v30));
    Object v32 = ((com.google.javascript.jscomp.SyntacticScopeCreator)v7).createScope(((com.google.javascript.rhino.Node)v17),((com.google.javascript.jscomp.Scope)v29));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = 1;
    Object v7 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v6).intValue()));
    Object v8 = ":";
    Object v9 = true;
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v9).booleanValue()),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new java.lang.String[]{"K","C "};
    Object v13 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v14 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v12),((java.lang.String[])v13));
    Object v15 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v7),((java.lang.String)v8),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v14));
    Object v16 = 1;
    Object v17 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v16).intValue()));
    Object v18 = ":";
    Object v19 = true;
    Object v20 = false;
    Object v21 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v19).booleanValue()),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = new java.lang.String[]{"K","C "};
    Object v23 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v24 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v22),((java.lang.String[])v23));
    Object v25 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v17),((java.lang.String)v18),((com.google.javascript.jscomp.parsing.Config)v21),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v24));
    Object v26 = null;
    Object v27 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v25),((com.google.javascript.rhino.jstype.ObjectType)v26));
    Object v28 = "";
    Object v29 = false;
    Object v30 = ((com.google.javascript.jscomp.Scope)v27).isDeclared(((java.lang.String)v28),(((java.lang.Boolean)v29).booleanValue()));
    Object v31 = ((com.google.javascript.jscomp.SyntacticScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v15),((com.google.javascript.jscomp.Scope)v27));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = 1;
    Object v6 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v5).intValue()));
    Object v7 = ":";
    Object v8 = true;
    Object v9 = false;
    Object v10 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v8).booleanValue()),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = new java.lang.String[]{"K","C "};
    Object v12 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v13 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v11),((java.lang.String[])v12));
    Object v14 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v6),((java.lang.String)v7),((com.google.javascript.jscomp.parsing.Config)v10),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v13));
    Object v15 = 0;
    ((com.google.javascript.rhino.Node)v14).setCharno((((java.lang.Integer)v15).intValue()));
    Object v16 = null;
    Object v17 = 1;
    Object v18 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v17).intValue()));
    Object v19 = ":";
    Object v20 = true;
    Object v21 = false;
    Object v22 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v20).booleanValue()),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = new java.lang.String[]{"K","C "};
    Object v24 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v25 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v23),((java.lang.String[])v24));
    Object v26 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v18),((java.lang.String)v19),((com.google.javascript.jscomp.parsing.Config)v22),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v25));
    Object v27 = null;
    Object v28 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v26),((com.google.javascript.rhino.jstype.ObjectType)v27));
    Object v29 = ((com.google.javascript.jscomp.Scope)v28).getVarCount();
    Object v30 = ((com.google.javascript.jscomp.SyntacticScopeCreator)v4).createScope(((com.google.javascript.rhino.Node)v14),((com.google.javascript.jscomp.Scope)v28));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.SyntacticScopeCreator.RedeclarationHandler)v4));
    Object v6 = 1;
    Object v7 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v6).intValue()));
    Object v8 = ":";
    Object v9 = true;
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v9).booleanValue()),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new java.lang.String[]{"K","C "};
    Object v13 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v14 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v12),((java.lang.String[])v13));
    Object v15 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v7),((java.lang.String)v8),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v14));
    Object v16 = 1;
    Object v17 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v16).intValue()));
    Object v18 = ":";
    Object v19 = true;
    Object v20 = false;
    Object v21 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v19).booleanValue()),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = new java.lang.String[]{"K","C "};
    Object v23 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v24 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v22),((java.lang.String[])v23));
    Object v25 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v17),((java.lang.String)v18),((com.google.javascript.jscomp.parsing.Config)v21),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v24));
    ((com.google.javascript.rhino.Node)v15).addChildToFront(((com.google.javascript.rhino.Node)v25));
    Object v26 = null;
    Object v27 = 1;
    Object v28 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v27).intValue()));
    Object v29 = ":";
    Object v30 = true;
    Object v31 = false;
    Object v32 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v30).booleanValue()),(((java.lang.Boolean)v31).booleanValue()));
    Object v33 = new java.lang.String[]{"K","C "};
    Object v34 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v35 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v33),((java.lang.String[])v34));
    Object v36 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v28),((java.lang.String)v29),((com.google.javascript.jscomp.parsing.Config)v32),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v35));
    Object v37 = null;
    Object v38 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v36),((com.google.javascript.rhino.jstype.ObjectType)v37));
    Object v39 = ((com.google.javascript.jscomp.SyntacticScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v15),((com.google.javascript.jscomp.Scope)v38));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "`*";
    Object v5 = 0;
    Object v6 = ((com.google.javascript.jscomp.SourceExcerptProvider)v3).getSourceLine(((java.lang.String)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v8 = 1;
    Object v9 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v8).intValue()));
    Object v10 = ":";
    Object v11 = true;
    Object v12 = false;
    Object v13 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new java.lang.String[]{"K","C "};
    Object v15 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v16 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v14),((java.lang.String[])v15));
    Object v17 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v9),((java.lang.String)v10),((com.google.javascript.jscomp.parsing.Config)v13),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v16));
    Object v18 = 37;
    ((com.google.javascript.rhino.Node)v17).setLineno((((java.lang.Integer)v18).intValue()));
    Object v19 = null;
    Object v20 = 1;
    Object v21 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v20).intValue()));
    Object v22 = ":";
    Object v23 = true;
    Object v24 = false;
    Object v25 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v23).booleanValue()),(((java.lang.Boolean)v24).booleanValue()));
    Object v26 = new java.lang.String[]{"K","C "};
    Object v27 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v28 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v26),((java.lang.String[])v27));
    Object v29 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v21),((java.lang.String)v22),((com.google.javascript.jscomp.parsing.Config)v25),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v28));
    Object v30 = null;
    Object v31 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v29),((com.google.javascript.rhino.jstype.ObjectType)v30));
    Object v32 = ((com.google.javascript.jscomp.SyntacticScopeCreator)v7).createScope(((com.google.javascript.rhino.Node)v17),((com.google.javascript.jscomp.Scope)v31));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = 1;
    Object v7 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v6).intValue()));
    Object v8 = ":";
    Object v9 = true;
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v9).booleanValue()),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new java.lang.String[]{"K","C "};
    Object v13 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v14 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v12),((java.lang.String[])v13));
    Object v15 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v7),((java.lang.String)v8),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v14));
    Object v16 = ((com.google.javascript.rhino.Node)v15).getAncestors();
    Object v17 = 1;
    Object v18 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v17).intValue()));
    Object v19 = ":";
    Object v20 = true;
    Object v21 = false;
    Object v22 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v20).booleanValue()),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = new java.lang.String[]{"K","C "};
    Object v24 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v25 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v23),((java.lang.String[])v24));
    Object v26 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v18),((java.lang.String)v19),((com.google.javascript.jscomp.parsing.Config)v22),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v25));
    Object v27 = null;
    Object v28 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v26),((com.google.javascript.rhino.jstype.ObjectType)v27));
    Object v29 = ((com.google.javascript.jscomp.SyntacticScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v15),((com.google.javascript.jscomp.Scope)v28));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = 1;
    Object v6 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v5).intValue()));
    Object v7 = ":";
    Object v8 = true;
    Object v9 = false;
    Object v10 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v8).booleanValue()),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = new java.lang.String[]{"K","C "};
    Object v12 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v13 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v11),((java.lang.String[])v12));
    Object v14 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v6),((java.lang.String)v7),((com.google.javascript.jscomp.parsing.Config)v10),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v13));
    Object v15 = ((com.google.javascript.rhino.Node)v14).siblings();
    Object v16 = 1;
    Object v17 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v16).intValue()));
    Object v18 = ":";
    Object v19 = true;
    Object v20 = false;
    Object v21 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v19).booleanValue()),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = new java.lang.String[]{"K","C "};
    Object v23 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v24 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v22),((java.lang.String[])v23));
    Object v25 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v17),((java.lang.String)v18),((com.google.javascript.jscomp.parsing.Config)v21),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v24));
    Object v26 = null;
    Object v27 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v25),((com.google.javascript.rhino.jstype.ObjectType)v26));
    Object v28 = ((com.google.javascript.jscomp.SyntacticScopeCreator)v4).createScope(((com.google.javascript.rhino.Node)v14),((com.google.javascript.jscomp.Scope)v27));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.SyntacticScopeCreator.RedeclarationHandler)v4));
    Object v6 = 1;
    Object v7 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v6).intValue()));
    Object v8 = ":";
    Object v9 = true;
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v9).booleanValue()),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new java.lang.String[]{"K","C "};
    Object v13 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v14 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v12),((java.lang.String[])v13));
    Object v15 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v7),((java.lang.String)v8),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v14));
    Object v16 = 1;
    Object v17 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v16).intValue()));
    Object v18 = ":";
    Object v19 = true;
    Object v20 = false;
    Object v21 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v19).booleanValue()),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = new java.lang.String[]{"K","C "};
    Object v23 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v24 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v22),((java.lang.String[])v23));
    Object v25 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v17),((java.lang.String)v18),((com.google.javascript.jscomp.parsing.Config)v21),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v24));
    Object v26 = null;
    Object v27 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v25),((com.google.javascript.rhino.jstype.ObjectType)v26));
    Object v28 = "";
    Object v29 = ((com.google.javascript.jscomp.Scope)v27).getOwnSlot(((java.lang.String)v28));
    Object v30 = ((com.google.javascript.jscomp.SyntacticScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v15),((com.google.javascript.jscomp.Scope)v27));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "";
    Object v5 = -21;
    Object v6 = ((com.google.javascript.jscomp.SourceExcerptProvider)v3).getSourceLine(((java.lang.String)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v8 = 1;
    Object v9 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v8).intValue()));
    Object v10 = ":";
    Object v11 = true;
    Object v12 = false;
    Object v13 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new java.lang.String[]{"K","C "};
    Object v15 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v16 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v14),((java.lang.String[])v15));
    Object v17 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v9),((java.lang.String)v10),((com.google.javascript.jscomp.parsing.Config)v13),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v16));
    Object v18 = ((com.google.javascript.rhino.Node)v17).isUnscopedQualifiedName();
    Object v19 = 1;
    Object v20 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v19).intValue()));
    Object v21 = ":";
    Object v22 = true;
    Object v23 = false;
    Object v24 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v22).booleanValue()),(((java.lang.Boolean)v23).booleanValue()));
    Object v25 = new java.lang.String[]{"K","C "};
    Object v26 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v27 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v25),((java.lang.String[])v26));
    Object v28 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v20),((java.lang.String)v21),((com.google.javascript.jscomp.parsing.Config)v24),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v27));
    Object v29 = null;
    Object v30 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v28),((com.google.javascript.rhino.jstype.ObjectType)v29));
    Object v31 = ((com.google.javascript.jscomp.SyntacticScopeCreator)v7).createScope(((com.google.javascript.rhino.Node)v17),((com.google.javascript.jscomp.Scope)v30));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "";
    Object v5 = -21;
    Object v6 = ((com.google.javascript.jscomp.SourceExcerptProvider)v3).getSourceLine(((java.lang.String)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v8 = 1;
    Object v9 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v8).intValue()));
    Object v10 = ":";
    Object v11 = true;
    Object v12 = false;
    Object v13 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new java.lang.String[]{"K","C "};
    Object v15 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v16 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v14),((java.lang.String[])v15));
    Object v17 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v9),((java.lang.String)v10),((com.google.javascript.jscomp.parsing.Config)v13),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v16));
    Object v18 = 1;
    Object v19 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v18).intValue()));
    Object v20 = ":";
    Object v21 = true;
    Object v22 = false;
    Object v23 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v21).booleanValue()),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = new java.lang.String[]{"K","C "};
    Object v25 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v26 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v24),((java.lang.String[])v25));
    Object v27 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v19),((java.lang.String)v20),((com.google.javascript.jscomp.parsing.Config)v23),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v26));
    Object v28 = null;
    Object v29 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v27),((com.google.javascript.rhino.jstype.ObjectType)v28));
    Object v30 = "}";
    Object v31 = ((com.google.javascript.jscomp.Scope)v29).getVar(((java.lang.String)v30));
    Object v32 = ((com.google.javascript.jscomp.SyntacticScopeCreator)v7).createScope(((com.google.javascript.rhino.Node)v17),((com.google.javascript.jscomp.Scope)v29));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "`*";
    Object v5 = 0;
    Object v6 = ((com.google.javascript.jscomp.SourceExcerptProvider)v3).getSourceLine(((java.lang.String)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v8 = 1;
    Object v9 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v8).intValue()));
    Object v10 = ":";
    Object v11 = true;
    Object v12 = false;
    Object v13 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new java.lang.String[]{"K","C "};
    Object v15 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v16 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v14),((java.lang.String[])v15));
    Object v17 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v9),((java.lang.String)v10),((com.google.javascript.jscomp.parsing.Config)v13),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v16));
    Object v18 = 1;
    Object v19 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v18).intValue()));
    Object v20 = ":";
    Object v21 = true;
    Object v22 = false;
    Object v23 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v21).booleanValue()),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = new java.lang.String[]{"K","C "};
    Object v25 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v26 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v24),((java.lang.String[])v25));
    Object v27 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v19),((java.lang.String)v20),((com.google.javascript.jscomp.parsing.Config)v23),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v26));
    Object v28 = null;
    Object v29 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v27),((com.google.javascript.rhino.jstype.ObjectType)v28));
    Object v30 = "W";
    Object v31 = true;
    Object v32 = ((com.google.javascript.jscomp.Scope)v29).isDeclared(((java.lang.String)v30),(((java.lang.Boolean)v31).booleanValue()));
    Object v33 = ((com.google.javascript.jscomp.SyntacticScopeCreator)v7).createScope(((com.google.javascript.rhino.Node)v17),((com.google.javascript.jscomp.Scope)v29));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = 1;
    Object v7 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v6).intValue()));
    Object v8 = ":";
    Object v9 = true;
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v9).booleanValue()),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new java.lang.String[]{"K","C "};
    Object v13 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v14 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v12),((java.lang.String[])v13));
    Object v15 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v7),((java.lang.String)v8),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v14));
    Object v16 = 1;
    Object v17 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v16).intValue()));
    Object v18 = ":";
    Object v19 = true;
    Object v20 = false;
    Object v21 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v19).booleanValue()),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = new java.lang.String[]{"K","C "};
    Object v23 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v24 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v22),((java.lang.String[])v23));
    Object v25 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v17),((java.lang.String)v18),((com.google.javascript.jscomp.parsing.Config)v21),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v24));
    Object v26 = ((com.google.javascript.rhino.Node)v15).clonePropsFrom(((com.google.javascript.rhino.Node)v25));
    Object v27 = 1;
    Object v28 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v27).intValue()));
    Object v29 = ":";
    Object v30 = true;
    Object v31 = false;
    Object v32 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v30).booleanValue()),(((java.lang.Boolean)v31).booleanValue()));
    Object v33 = new java.lang.String[]{"K","C "};
    Object v34 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v35 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v33),((java.lang.String[])v34));
    Object v36 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v28),((java.lang.String)v29),((com.google.javascript.jscomp.parsing.Config)v32),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v35));
    Object v37 = null;
    Object v38 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v36),((com.google.javascript.rhino.jstype.ObjectType)v37));
    Object v39 = ((com.google.javascript.jscomp.SyntacticScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v15),((com.google.javascript.jscomp.Scope)v38));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.SyntacticScopeCreator.RedeclarationHandler)v4));
    Object v6 = 1;
    Object v7 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v6).intValue()));
    Object v8 = ":";
    Object v9 = true;
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v9).booleanValue()),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new java.lang.String[]{"K","C "};
    Object v13 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v14 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v12),((java.lang.String[])v13));
    Object v15 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v7),((java.lang.String)v8),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v14));
    Object v16 = 1;
    Object v17 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v16).intValue()));
    Object v18 = ":";
    Object v19 = true;
    Object v20 = false;
    Object v21 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v19).booleanValue()),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = new java.lang.String[]{"K","C "};
    Object v23 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v24 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v22),((java.lang.String[])v23));
    Object v25 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v17),((java.lang.String)v18),((com.google.javascript.jscomp.parsing.Config)v21),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v24));
    Object v26 = ((com.google.javascript.rhino.Node)v15).copyInformationFrom(((com.google.javascript.rhino.Node)v25));
    Object v27 = 1;
    Object v28 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v27).intValue()));
    Object v29 = ":";
    Object v30 = true;
    Object v31 = false;
    Object v32 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v30).booleanValue()),(((java.lang.Boolean)v31).booleanValue()));
    Object v33 = new java.lang.String[]{"K","C "};
    Object v34 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v35 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v33),((java.lang.String[])v34));
    Object v36 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v28),((java.lang.String)v29),((com.google.javascript.jscomp.parsing.Config)v32),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v35));
    Object v37 = null;
    Object v38 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v36),((com.google.javascript.rhino.jstype.ObjectType)v37));
    Object v39 = ((com.google.javascript.jscomp.SyntacticScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v15),((com.google.javascript.jscomp.Scope)v38));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = 1;
    Object v7 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v6).intValue()));
    Object v8 = ":";
    Object v9 = true;
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v9).booleanValue()),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new java.lang.String[]{"K","C "};
    Object v13 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v14 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v12),((java.lang.String[])v13));
    Object v15 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v7),((java.lang.String)v8),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v14));
    Object v16 = false;
    ((com.google.javascript.rhino.Node)v15).setVarArgs((((java.lang.Boolean)v16).booleanValue()));
    Object v17 = null;
    Object v18 = 1;
    Object v19 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v18).intValue()));
    Object v20 = ":";
    Object v21 = true;
    Object v22 = false;
    Object v23 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v21).booleanValue()),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = new java.lang.String[]{"K","C "};
    Object v25 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v26 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v24),((java.lang.String[])v25));
    Object v27 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v19),((java.lang.String)v20),((com.google.javascript.jscomp.parsing.Config)v23),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v26));
    Object v28 = null;
    Object v29 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v27),((com.google.javascript.rhino.jstype.ObjectType)v28));
    Object v30 = ((com.google.javascript.jscomp.SyntacticScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v15),((com.google.javascript.jscomp.Scope)v29));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "`*";
    Object v5 = 0;
    Object v6 = ((com.google.javascript.jscomp.SourceExcerptProvider)v3).getSourceLine(((java.lang.String)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v8 = 1;
    Object v9 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v8).intValue()));
    Object v10 = ":";
    Object v11 = true;
    Object v12 = false;
    Object v13 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new java.lang.String[]{"K","C "};
    Object v15 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v16 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v14),((java.lang.String[])v15));
    Object v17 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v9),((java.lang.String)v10),((com.google.javascript.jscomp.parsing.Config)v13),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v16));
    Object v18 = ((com.google.javascript.rhino.Node)v17).isQualifiedName();
    Object v19 = 1;
    Object v20 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v19).intValue()));
    Object v21 = ":";
    Object v22 = true;
    Object v23 = false;
    Object v24 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v22).booleanValue()),(((java.lang.Boolean)v23).booleanValue()));
    Object v25 = new java.lang.String[]{"K","C "};
    Object v26 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v27 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v25),((java.lang.String[])v26));
    Object v28 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v20),((java.lang.String)v21),((com.google.javascript.jscomp.parsing.Config)v24),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v27));
    Object v29 = null;
    Object v30 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v28),((com.google.javascript.rhino.jstype.ObjectType)v29));
    Object v31 = "";
    Object v32 = ((com.google.javascript.jscomp.Scope)v30).getVar(((java.lang.String)v31));
    Object v33 = ((com.google.javascript.jscomp.SyntacticScopeCreator)v7).createScope(((com.google.javascript.rhino.Node)v17),((com.google.javascript.jscomp.Scope)v30));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "";
    Object v5 = -21;
    Object v6 = ((com.google.javascript.jscomp.SourceExcerptProvider)v3).getSourceLine(((java.lang.String)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v8 = 1;
    Object v9 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v8).intValue()));
    Object v10 = ":";
    Object v11 = true;
    Object v12 = false;
    Object v13 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new java.lang.String[]{"K","C "};
    Object v15 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v16 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v14),((java.lang.String[])v15));
    Object v17 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v9),((java.lang.String)v10),((com.google.javascript.jscomp.parsing.Config)v13),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v16));
    Object v18 = 1;
    Object v19 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v18).intValue()));
    Object v20 = ":";
    Object v21 = true;
    Object v22 = false;
    Object v23 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v21).booleanValue()),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = new java.lang.String[]{"K","C "};
    Object v25 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v26 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v24),((java.lang.String[])v25));
    Object v27 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v19),((java.lang.String)v20),((com.google.javascript.jscomp.parsing.Config)v23),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v26));
    Object v28 = null;
    Object v29 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v27),((com.google.javascript.rhino.jstype.ObjectType)v28));
    Object v30 = "getUTCMinutes";
    Object v31 = ((com.google.javascript.jscomp.Scope)v29).getSlot(((java.lang.String)v30));
    Object v32 = ((com.google.javascript.jscomp.SyntacticScopeCreator)v7).createScope(((com.google.javascript.rhino.Node)v17),((com.google.javascript.jscomp.Scope)v29));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = 1;
    Object v7 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v6).intValue()));
    Object v8 = ":";
    Object v9 = true;
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v9).booleanValue()),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new java.lang.String[]{"K","C "};
    Object v13 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v14 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v12),((java.lang.String[])v13));
    Object v15 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v7),((java.lang.String)v8),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v14));
    Object v16 = ((com.google.javascript.rhino.Node)v15).isQualifiedName();
    Object v17 = 1;
    Object v18 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v17).intValue()));
    Object v19 = ":";
    Object v20 = true;
    Object v21 = false;
    Object v22 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v20).booleanValue()),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = new java.lang.String[]{"K","C "};
    Object v24 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v25 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v23),((java.lang.String[])v24));
    Object v26 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v18),((java.lang.String)v19),((com.google.javascript.jscomp.parsing.Config)v22),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v25));
    Object v27 = null;
    Object v28 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v26),((com.google.javascript.rhino.jstype.ObjectType)v27));
    Object v29 = ((com.google.javascript.jscomp.SyntacticScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v15),((com.google.javascript.jscomp.Scope)v28));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = 1;
    Object v7 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v6).intValue()));
    Object v8 = ":";
    Object v9 = true;
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v9).booleanValue()),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new java.lang.String[]{"K","C "};
    Object v13 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v14 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v12),((java.lang.String[])v13));
    Object v15 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v7),((java.lang.String)v8),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v14));
    Object v16 = 1;
    Object v17 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v16).intValue()));
    Object v18 = ":";
    Object v19 = true;
    Object v20 = false;
    Object v21 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v19).booleanValue()),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = new java.lang.String[]{"K","C "};
    Object v23 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v24 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v22),((java.lang.String[])v23));
    Object v25 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v17),((java.lang.String)v18),((com.google.javascript.jscomp.parsing.Config)v21),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v24));
    Object v26 = null;
    Object v27 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v25),((com.google.javascript.rhino.jstype.ObjectType)v26));
    Object v28 = "applyX";
    Object v29 = ((com.google.javascript.jscomp.Scope)v27).getOwnSlot(((java.lang.String)v28));
    Object v30 = ((com.google.javascript.jscomp.SyntacticScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v15),((com.google.javascript.jscomp.Scope)v27));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.SyntacticScopeCreator.RedeclarationHandler)v4));
    Object v6 = 1;
    Object v7 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v6).intValue()));
    Object v8 = ":";
    Object v9 = true;
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v9).booleanValue()),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new java.lang.String[]{"K","C "};
    Object v13 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v14 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v12),((java.lang.String[])v13));
    Object v15 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v7),((java.lang.String)v8),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v14));
    Object v16 = 1;
    ((com.google.javascript.rhino.Node)v15).setCharno((((java.lang.Integer)v16).intValue()));
    Object v17 = null;
    Object v18 = 1;
    Object v19 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v18).intValue()));
    Object v20 = ":";
    Object v21 = true;
    Object v22 = false;
    Object v23 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v21).booleanValue()),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = new java.lang.String[]{"K","C "};
    Object v25 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v26 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v24),((java.lang.String[])v25));
    Object v27 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v19),((java.lang.String)v20),((com.google.javascript.jscomp.parsing.Config)v23),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v26));
    Object v28 = null;
    Object v29 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v27),((com.google.javascript.rhino.jstype.ObjectType)v28));
    Object v30 = ((com.google.javascript.jscomp.SyntacticScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v15),((com.google.javascript.jscomp.Scope)v29));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "";
    Object v5 = -21;
    Object v6 = ((com.google.javascript.jscomp.SourceExcerptProvider)v3).getSourceLine(((java.lang.String)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v8 = 1;
    Object v9 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v8).intValue()));
    Object v10 = ":";
    Object v11 = true;
    Object v12 = false;
    Object v13 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new java.lang.String[]{"K","C "};
    Object v15 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v16 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v14),((java.lang.String[])v15));
    Object v17 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v9),((java.lang.String)v10),((com.google.javascript.jscomp.parsing.Config)v13),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v16));
    Object v18 = ((com.google.javascript.rhino.Node)v17).toStringTree();
    Object v19 = 1;
    Object v20 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v19).intValue()));
    Object v21 = ":";
    Object v22 = true;
    Object v23 = false;
    Object v24 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v22).booleanValue()),(((java.lang.Boolean)v23).booleanValue()));
    Object v25 = new java.lang.String[]{"K","C "};
    Object v26 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v27 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v25),((java.lang.String[])v26));
    Object v28 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v20),((java.lang.String)v21),((com.google.javascript.jscomp.parsing.Config)v24),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v27));
    Object v29 = null;
    Object v30 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v28),((com.google.javascript.rhino.jstype.ObjectType)v29));
    Object v31 = "";
    Object v32 = ((com.google.javascript.jscomp.Scope)v30).getSlot(((java.lang.String)v31));
    Object v33 = ((com.google.javascript.jscomp.SyntacticScopeCreator)v7).createScope(((com.google.javascript.rhino.Node)v17),((com.google.javascript.jscomp.Scope)v30));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "";
    Object v5 = -21;
    Object v6 = ((com.google.javascript.jscomp.SourceExcerptProvider)v3).getSourceLine(((java.lang.String)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v8 = 1;
    Object v9 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v8).intValue()));
    Object v10 = ":";
    Object v11 = true;
    Object v12 = false;
    Object v13 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new java.lang.String[]{"K","C "};
    Object v15 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v16 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v14),((java.lang.String[])v15));
    Object v17 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v9),((java.lang.String)v10),((com.google.javascript.jscomp.parsing.Config)v13),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v16));
    Object v18 = 1;
    Object v19 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v18).intValue()));
    Object v20 = ":";
    Object v21 = true;
    Object v22 = false;
    Object v23 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v21).booleanValue()),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = new java.lang.String[]{"K","C "};
    Object v25 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v26 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v24),((java.lang.String[])v25));
    Object v27 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v19),((java.lang.String)v20),((com.google.javascript.jscomp.parsing.Config)v23),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v26));
    Object v28 = null;
    Object v29 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v27),((com.google.javascript.rhino.jstype.ObjectType)v28));
    Object v30 = "!";
    Object v31 = ((com.google.javascript.jscomp.Scope)v29).getVar(((java.lang.String)v30));
    Object v32 = ((com.google.javascript.jscomp.SyntacticScopeCreator)v7).createScope(((com.google.javascript.rhino.Node)v17),((com.google.javascript.jscomp.Scope)v29));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.SyntacticScopeCreator.RedeclarationHandler)v4));
    Object v6 = 1;
    Object v7 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v6).intValue()));
    Object v8 = ":";
    Object v9 = true;
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v9).booleanValue()),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new java.lang.String[]{"K","C "};
    Object v13 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v14 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v12),((java.lang.String[])v13));
    Object v15 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v7),((java.lang.String)v8),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v14));
    Object v16 = false;
    ((com.google.javascript.rhino.Node)v15).setWasEmptyNode((((java.lang.Boolean)v16).booleanValue()));
    Object v17 = null;
    Object v18 = 1;
    Object v19 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v18).intValue()));
    Object v20 = ":";
    Object v21 = true;
    Object v22 = false;
    Object v23 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v21).booleanValue()),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = new java.lang.String[]{"K","C "};
    Object v25 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v26 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v24),((java.lang.String[])v25));
    Object v27 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v19),((java.lang.String)v20),((com.google.javascript.jscomp.parsing.Config)v23),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v26));
    Object v28 = null;
    Object v29 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v27),((com.google.javascript.rhino.jstype.ObjectType)v28));
    Object v30 = "prototyp\"e";
    Object v31 = true;
    Object v32 = ((com.google.javascript.jscomp.Scope)v29).isDeclared(((java.lang.String)v30),(((java.lang.Boolean)v31).booleanValue()));
    Object v33 = ((com.google.javascript.jscomp.SyntacticScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v15),((com.google.javascript.jscomp.Scope)v29));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = 1;
    Object v7 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v6).intValue()));
    Object v8 = ":";
    Object v9 = true;
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v9).booleanValue()),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new java.lang.String[]{"K","C "};
    Object v13 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v14 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v12),((java.lang.String[])v13));
    Object v15 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v7),((java.lang.String)v8),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v14));
    Object v16 = 1;
    Object v17 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v16).intValue()));
    Object v18 = ":";
    Object v19 = true;
    Object v20 = false;
    Object v21 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v19).booleanValue()),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = new java.lang.String[]{"K","C "};
    Object v23 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v24 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v22),((java.lang.String[])v23));
    Object v25 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v17),((java.lang.String)v18),((com.google.javascript.jscomp.parsing.Config)v21),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v24));
    Object v26 = null;
    Object v27 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v25),((com.google.javascript.rhino.jstype.ObjectType)v26));
    Object v28 = "";
    Object v29 = true;
    Object v30 = ((com.google.javascript.jscomp.Scope)v27).isDeclared(((java.lang.String)v28),(((java.lang.Boolean)v29).booleanValue()));
    Object v31 = ((com.google.javascript.jscomp.SyntacticScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v15),((com.google.javascript.jscomp.Scope)v27));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "";
    Object v5 = -21;
    Object v6 = ((com.google.javascript.jscomp.SourceExcerptProvider)v3).getSourceLine(((java.lang.String)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v8 = 1;
    Object v9 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v8).intValue()));
    Object v10 = ":";
    Object v11 = true;
    Object v12 = false;
    Object v13 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new java.lang.String[]{"K","C "};
    Object v15 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v16 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v14),((java.lang.String[])v15));
    Object v17 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v9),((java.lang.String)v10),((com.google.javascript.jscomp.parsing.Config)v13),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v16));
    Object v18 = 1;
    Object v19 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v18).intValue()));
    Object v20 = ":";
    Object v21 = true;
    Object v22 = false;
    Object v23 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v21).booleanValue()),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = new java.lang.String[]{"K","C "};
    Object v25 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v26 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v24),((java.lang.String[])v25));
    Object v27 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v19),((java.lang.String)v20),((com.google.javascript.jscomp.parsing.Config)v23),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v26));
    Object v28 = null;
    Object v29 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v27),((com.google.javascript.rhino.jstype.ObjectType)v28));
    Object v30 = "goog.OCALE";
    Object v31 = true;
    Object v32 = ((com.google.javascript.jscomp.Scope)v29).isDeclared(((java.lang.String)v30),(((java.lang.Boolean)v31).booleanValue()));
    Object v33 = ((com.google.javascript.jscomp.SyntacticScopeCreator)v7).createScope(((com.google.javascript.rhino.Node)v17),((com.google.javascript.jscomp.Scope)v29));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "`*";
    Object v5 = 0;
    Object v6 = ((com.google.javascript.jscomp.SourceExcerptProvider)v3).getSourceLine(((java.lang.String)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v8 = 1;
    Object v9 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v8).intValue()));
    Object v10 = ":";
    Object v11 = true;
    Object v12 = false;
    Object v13 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new java.lang.String[]{"K","C "};
    Object v15 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v16 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v14),((java.lang.String[])v15));
    Object v17 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v9),((java.lang.String)v10),((com.google.javascript.jscomp.parsing.Config)v13),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v16));
    Object v18 = 1;
    Object v19 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v18).intValue()));
    Object v20 = ":";
    Object v21 = true;
    Object v22 = false;
    Object v23 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v21).booleanValue()),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = new java.lang.String[]{"K","C "};
    Object v25 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v26 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v24),((java.lang.String[])v25));
    Object v27 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v19),((java.lang.String)v20),((com.google.javascript.jscomp.parsing.Config)v23),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v26));
    Object v28 = null;
    Object v29 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v27),((com.google.javascript.rhino.jstype.ObjectType)v28));
    Object v30 = "";
    Object v31 = false;
    Object v32 = ((com.google.javascript.jscomp.Scope)v29).isDeclared(((java.lang.String)v30),(((java.lang.Boolean)v31).booleanValue()));
    Object v33 = ((com.google.javascript.jscomp.SyntacticScopeCreator)v7).createScope(((com.google.javascript.rhino.Node)v17),((com.google.javascript.jscomp.Scope)v29));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.SyntacticScopeCreator.RedeclarationHandler)v4));
    Object v6 = 1;
    Object v7 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v6).intValue()));
    Object v8 = ":";
    Object v9 = true;
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v9).booleanValue()),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new java.lang.String[]{"K","C "};
    Object v13 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v14 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v12),((java.lang.String[])v13));
    Object v15 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v7),((java.lang.String)v8),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v14));
    Object v16 = ((com.google.javascript.rhino.Node)v15).isQualifiedName();
    Object v17 = 1;
    Object v18 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v17).intValue()));
    Object v19 = ":";
    Object v20 = true;
    Object v21 = false;
    Object v22 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v20).booleanValue()),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = new java.lang.String[]{"K","C "};
    Object v24 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v25 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v23),((java.lang.String[])v24));
    Object v26 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v18),((java.lang.String)v19),((com.google.javascript.jscomp.parsing.Config)v22),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v25));
    Object v27 = null;
    Object v28 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v26),((com.google.javascript.rhino.jstype.ObjectType)v27));
    Object v29 = ((com.google.javascript.jscomp.SyntacticScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v15),((com.google.javascript.jscomp.Scope)v28));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.SyntacticScopeCreator.RedeclarationHandler)v4));
    Object v6 = 1;
    Object v7 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v6).intValue()));
    Object v8 = ":";
    Object v9 = true;
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v9).booleanValue()),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new java.lang.String[]{"K","C "};
    Object v13 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v14 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v12),((java.lang.String[])v13));
    Object v15 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v7),((java.lang.String)v8),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v14));
    Object v16 = 1;
    Object v17 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v16).intValue()));
    Object v18 = ":";
    Object v19 = true;
    Object v20 = false;
    Object v21 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v19).booleanValue()),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = new java.lang.String[]{"K","C "};
    Object v23 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v24 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v22),((java.lang.String[])v23));
    Object v25 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v17),((java.lang.String)v18),((com.google.javascript.jscomp.parsing.Config)v21),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v24));
    Object v26 = ((com.google.javascript.rhino.Node)v15).checkTreeTypeAwareEqualsSilent(((com.google.javascript.rhino.Node)v25));
    Object v27 = 1;
    Object v28 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v27).intValue()));
    Object v29 = ":";
    Object v30 = true;
    Object v31 = false;
    Object v32 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v30).booleanValue()),(((java.lang.Boolean)v31).booleanValue()));
    Object v33 = new java.lang.String[]{"K","C "};
    Object v34 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v35 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v33),((java.lang.String[])v34));
    Object v36 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v28),((java.lang.String)v29),((com.google.javascript.jscomp.parsing.Config)v32),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v35));
    Object v37 = null;
    Object v38 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v36),((com.google.javascript.rhino.jstype.ObjectType)v37));
    Object v39 = ((com.google.javascript.jscomp.SyntacticScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v15),((com.google.javascript.jscomp.Scope)v38));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "";
    Object v5 = -21;
    Object v6 = ((com.google.javascript.jscomp.SourceExcerptProvider)v3).getSourceLine(((java.lang.String)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v8 = 1;
    Object v9 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v8).intValue()));
    Object v10 = ":";
    Object v11 = true;
    Object v12 = false;
    Object v13 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new java.lang.String[]{"K","C "};
    Object v15 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v16 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v14),((java.lang.String[])v15));
    Object v17 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v9),((java.lang.String)v10),((com.google.javascript.jscomp.parsing.Config)v13),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v16));
    Object v18 = false;
    Object v19 = true;
    Object v20 = true;
    Object v21 = ((com.google.javascript.rhino.Node)v17).toString((((java.lang.Boolean)v18).booleanValue()),(((java.lang.Boolean)v19).booleanValue()),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = 1;
    Object v23 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v22).intValue()));
    Object v24 = ":";
    Object v25 = true;
    Object v26 = false;
    Object v27 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v25).booleanValue()),(((java.lang.Boolean)v26).booleanValue()));
    Object v28 = new java.lang.String[]{"K","C "};
    Object v29 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v30 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v28),((java.lang.String[])v29));
    Object v31 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v23),((java.lang.String)v24),((com.google.javascript.jscomp.parsing.Config)v27),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v30));
    Object v32 = null;
    Object v33 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v31),((com.google.javascript.rhino.jstype.ObjectType)v32));
    Object v34 = ((com.google.javascript.jscomp.SyntacticScopeCreator)v7).createScope(((com.google.javascript.rhino.Node)v17),((com.google.javascript.jscomp.Scope)v33));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "`*";
    Object v5 = 0;
    Object v6 = ((com.google.javascript.jscomp.SourceExcerptProvider)v3).getSourceLine(((java.lang.String)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v8 = 1;
    Object v9 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v8).intValue()));
    Object v10 = ":";
    Object v11 = true;
    Object v12 = false;
    Object v13 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new java.lang.String[]{"K","C "};
    Object v15 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v16 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v14),((java.lang.String[])v15));
    Object v17 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v9),((java.lang.String)v10),((com.google.javascript.jscomp.parsing.Config)v13),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v16));
    Object v18 = 1;
    Object v19 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v18).intValue()));
    Object v20 = ":";
    Object v21 = true;
    Object v22 = false;
    Object v23 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v21).booleanValue()),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = new java.lang.String[]{"K","C "};
    Object v25 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v26 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v24),((java.lang.String[])v25));
    Object v27 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v19),((java.lang.String)v20),((com.google.javascript.jscomp.parsing.Config)v23),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v26));
    Object v28 = null;
    Object v29 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v27),((com.google.javascript.rhino.jstype.ObjectType)v28));
    Object v30 = "";
    Object v31 = ((com.google.javascript.jscomp.Scope)v29).getOwnSlot(((java.lang.String)v30));
    Object v32 = ((com.google.javascript.jscomp.SyntacticScopeCreator)v7).createScope(((com.google.javascript.rhino.Node)v17),((com.google.javascript.jscomp.Scope)v29));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = 1;
    Object v7 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v6).intValue()));
    Object v8 = ":";
    Object v9 = true;
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v9).booleanValue()),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new java.lang.String[]{"K","C "};
    Object v13 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v14 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v12),((java.lang.String[])v13));
    Object v15 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v7),((java.lang.String)v8),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v14));
    Object v16 = 1;
    Object v17 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v16).intValue()));
    Object v18 = ":";
    Object v19 = true;
    Object v20 = false;
    Object v21 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v19).booleanValue()),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = new java.lang.String[]{"K","C "};
    Object v23 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v24 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v22),((java.lang.String[])v23));
    Object v25 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v17),((java.lang.String)v18),((com.google.javascript.jscomp.parsing.Config)v21),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v24));
    ((com.google.javascript.rhino.Node)v15).addChildToBack(((com.google.javascript.rhino.Node)v25));
    Object v26 = null;
    Object v27 = 1;
    Object v28 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v27).intValue()));
    Object v29 = ":";
    Object v30 = true;
    Object v31 = false;
    Object v32 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v30).booleanValue()),(((java.lang.Boolean)v31).booleanValue()));
    Object v33 = new java.lang.String[]{"K","C "};
    Object v34 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v35 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v33),((java.lang.String[])v34));
    Object v36 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v28),((java.lang.String)v29),((com.google.javascript.jscomp.parsing.Config)v32),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v35));
    Object v37 = null;
    Object v38 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v36),((com.google.javascript.rhino.jstype.ObjectType)v37));
    Object v39 = ((com.google.javascript.jscomp.SyntacticScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v15),((com.google.javascript.jscomp.Scope)v38));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "`*";
    Object v5 = 0;
    Object v6 = ((com.google.javascript.jscomp.SourceExcerptProvider)v3).getSourceLine(((java.lang.String)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v8 = 1;
    Object v9 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v8).intValue()));
    Object v10 = ":";
    Object v11 = true;
    Object v12 = false;
    Object v13 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new java.lang.String[]{"K","C "};
    Object v15 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v16 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v14),((java.lang.String[])v15));
    Object v17 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v9),((java.lang.String)v10),((com.google.javascript.jscomp.parsing.Config)v13),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v16));
    Object v18 = -34;
    Object v19 = true;
    ((com.google.javascript.rhino.Node)v17).putBooleanProp((((java.lang.Integer)v18).intValue()),(((java.lang.Boolean)v19).booleanValue()));
    Object v20 = null;
    Object v21 = 1;
    Object v22 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v21).intValue()));
    Object v23 = ":";
    Object v24 = true;
    Object v25 = false;
    Object v26 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v24).booleanValue()),(((java.lang.Boolean)v25).booleanValue()));
    Object v27 = new java.lang.String[]{"K","C "};
    Object v28 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v29 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v27),((java.lang.String[])v28));
    Object v30 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v22),((java.lang.String)v23),((com.google.javascript.jscomp.parsing.Config)v26),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v29));
    Object v31 = null;
    Object v32 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v30),((com.google.javascript.rhino.jstype.ObjectType)v31));
    Object v33 = ((com.google.javascript.jscomp.SyntacticScopeCreator)v7).createScope(((com.google.javascript.rhino.Node)v17),((com.google.javascript.jscomp.Scope)v32));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "";
    Object v5 = -21;
    Object v6 = ((com.google.javascript.jscomp.SourceExcerptProvider)v3).getSourceLine(((java.lang.String)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v8 = 1;
    Object v9 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v8).intValue()));
    Object v10 = ":";
    Object v11 = true;
    Object v12 = false;
    Object v13 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new java.lang.String[]{"K","C "};
    Object v15 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v16 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v14),((java.lang.String[])v15));
    Object v17 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v9),((java.lang.String)v10),((com.google.javascript.jscomp.parsing.Config)v13),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v16));
    Object v18 = 1;
    Object v19 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v18).intValue()));
    Object v20 = ":";
    Object v21 = true;
    Object v22 = false;
    Object v23 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v21).booleanValue()),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = new java.lang.String[]{"K","C "};
    Object v25 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v26 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v24),((java.lang.String[])v25));
    Object v27 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v19),((java.lang.String)v20),((com.google.javascript.jscomp.parsing.Config)v23),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v26));
    Object v28 = null;
    Object v29 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v27),((com.google.javascript.rhino.jstype.ObjectType)v28));
    Object v30 = "p";
    Object v31 = ((com.google.javascript.jscomp.Scope)v29).getOwnSlot(((java.lang.String)v30));
    Object v32 = ((com.google.javascript.jscomp.SyntacticScopeCreator)v7).createScope(((com.google.javascript.rhino.Node)v17),((com.google.javascript.jscomp.Scope)v29));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "`*";
    Object v5 = 0;
    Object v6 = ((com.google.javascript.jscomp.SourceExcerptProvider)v3).getSourceLine(((java.lang.String)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v8 = 1;
    Object v9 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v8).intValue()));
    Object v10 = ":";
    Object v11 = true;
    Object v12 = false;
    Object v13 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new java.lang.String[]{"K","C "};
    Object v15 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v16 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v14),((java.lang.String[])v15));
    Object v17 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v9),((java.lang.String)v10),((com.google.javascript.jscomp.parsing.Config)v13),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v16));
    Object v18 = ((com.google.javascript.rhino.Node)v17).hasSideEffects();
    Object v19 = 1;
    Object v20 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v19).intValue()));
    Object v21 = ":";
    Object v22 = true;
    Object v23 = false;
    Object v24 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v22).booleanValue()),(((java.lang.Boolean)v23).booleanValue()));
    Object v25 = new java.lang.String[]{"K","C "};
    Object v26 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v27 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v25),((java.lang.String[])v26));
    Object v28 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v20),((java.lang.String)v21),((com.google.javascript.jscomp.parsing.Config)v24),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v27));
    Object v29 = null;
    Object v30 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v28),((com.google.javascript.rhino.jstype.ObjectType)v29));
    Object v31 = ((com.google.javascript.jscomp.SyntacticScopeCreator)v7).createScope(((com.google.javascript.rhino.Node)v17),((com.google.javascript.jscomp.Scope)v30));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = 1;
    Object v7 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v6).intValue()));
    Object v8 = ":";
    Object v9 = true;
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v9).booleanValue()),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new java.lang.String[]{"K","C "};
    Object v13 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v14 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v12),((java.lang.String[])v13));
    Object v15 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v7),((java.lang.String)v8),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v14));
    Object v16 = 1;
    Object v17 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v16).intValue()));
    Object v18 = ":";
    Object v19 = true;
    Object v20 = false;
    Object v21 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v19).booleanValue()),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = new java.lang.String[]{"K","C "};
    Object v23 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v24 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v22),((java.lang.String[])v23));
    Object v25 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v17),((java.lang.String)v18),((com.google.javascript.jscomp.parsing.Config)v21),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v24));
    Object v26 = null;
    Object v27 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v25),((com.google.javascript.rhino.jstype.ObjectType)v26));
    Object v28 = "";
    Object v29 = ((com.google.javascript.jscomp.Scope)v27).getOwnSlot(((java.lang.String)v28));
    Object v30 = ((com.google.javascript.jscomp.SyntacticScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v15),((com.google.javascript.jscomp.Scope)v27));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.SyntacticScopeCreator.RedeclarationHandler)v4));
    Object v6 = 1;
    Object v7 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v6).intValue()));
    Object v8 = ":";
    Object v9 = true;
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v9).booleanValue()),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new java.lang.String[]{"K","C "};
    Object v13 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v14 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v12),((java.lang.String[])v13));
    Object v15 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v7),((java.lang.String)v8),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v14));
    Object v16 = ((com.google.javascript.rhino.Node)v15).children();
    Object v17 = 1;
    Object v18 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v17).intValue()));
    Object v19 = ":";
    Object v20 = true;
    Object v21 = false;
    Object v22 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v20).booleanValue()),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = new java.lang.String[]{"K","C "};
    Object v24 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v25 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v23),((java.lang.String[])v24));
    Object v26 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v18),((java.lang.String)v19),((com.google.javascript.jscomp.parsing.Config)v22),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v25));
    Object v27 = null;
    Object v28 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v26),((com.google.javascript.rhino.jstype.ObjectType)v27));
    Object v29 = ((com.google.javascript.jscomp.SyntacticScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v15),((com.google.javascript.jscomp.Scope)v28));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.SyntacticScopeCreator.RedeclarationHandler)v4));
    Object v6 = 1;
    Object v7 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v6).intValue()));
    Object v8 = ":";
    Object v9 = true;
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v9).booleanValue()),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new java.lang.String[]{"K","C "};
    Object v13 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v14 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v12),((java.lang.String[])v13));
    Object v15 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v7),((java.lang.String)v8),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v14));
    Object v16 = 1;
    Object v17 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v16).intValue()));
    Object v18 = ":";
    Object v19 = true;
    Object v20 = false;
    Object v21 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v19).booleanValue()),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = new java.lang.String[]{"K","C "};
    Object v23 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v24 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v22),((java.lang.String[])v23));
    Object v25 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v17),((java.lang.String)v18),((com.google.javascript.jscomp.parsing.Config)v21),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v24));
    Object v26 = null;
    Object v27 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v25),((com.google.javascript.rhino.jstype.ObjectType)v26));
    Object v28 = "";
    Object v29 = ((com.google.javascript.jscomp.Scope)v27).getSlot(((java.lang.String)v28));
    Object v30 = ((com.google.javascript.jscomp.SyntacticScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v15),((com.google.javascript.jscomp.Scope)v27));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = 1;
    Object v7 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v6).intValue()));
    Object v8 = ":";
    Object v9 = true;
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v9).booleanValue()),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new java.lang.String[]{"K","C "};
    Object v13 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v14 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v12),((java.lang.String[])v13));
    Object v15 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v7),((java.lang.String)v8),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v14));
    Object v16 = 1;
    Object v17 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v16).intValue()));
    Object v18 = ":";
    Object v19 = true;
    Object v20 = false;
    Object v21 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v19).booleanValue()),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = new java.lang.String[]{"K","C "};
    Object v23 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v24 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v22),((java.lang.String[])v23));
    Object v25 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v17),((java.lang.String)v18),((com.google.javascript.jscomp.parsing.Config)v21),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v24));
    Object v26 = null;
    Object v27 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v25),((com.google.javascript.rhino.jstype.ObjectType)v26));
    Object v28 = ((com.google.javascript.jscomp.Scope)v27).getVarCount();
    Object v29 = ((com.google.javascript.jscomp.SyntacticScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v15),((com.google.javascript.jscomp.Scope)v27));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = 1;
    Object v7 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v6).intValue()));
    Object v8 = ":";
    Object v9 = true;
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v9).booleanValue()),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new java.lang.String[]{"K","C "};
    Object v13 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v14 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v12),((java.lang.String[])v13));
    Object v15 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v7),((java.lang.String)v8),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v14));
    Object v16 = 1;
    Object v17 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v16).intValue()));
    Object v18 = ":";
    Object v19 = true;
    Object v20 = false;
    Object v21 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v19).booleanValue()),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = new java.lang.String[]{"K","C "};
    Object v23 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v24 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v22),((java.lang.String[])v23));
    Object v25 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v17),((java.lang.String)v18),((com.google.javascript.jscomp.parsing.Config)v21),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v24));
    Object v26 = null;
    Object v27 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v25),((com.google.javascript.rhino.jstype.ObjectType)v26));
    Object v28 = "";
    Object v29 = ((com.google.javascript.jscomp.Scope)v27).getSlot(((java.lang.String)v28));
    Object v30 = ((com.google.javascript.jscomp.SyntacticScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v15),((com.google.javascript.jscomp.Scope)v27));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "";
    Object v5 = -21;
    Object v6 = ((com.google.javascript.jscomp.SourceExcerptProvider)v3).getSourceLine(((java.lang.String)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v8 = 1;
    Object v9 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v8).intValue()));
    Object v10 = ":";
    Object v11 = true;
    Object v12 = false;
    Object v13 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new java.lang.String[]{"K","C "};
    Object v15 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v16 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v14),((java.lang.String[])v15));
    Object v17 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v9),((java.lang.String)v10),((com.google.javascript.jscomp.parsing.Config)v13),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v16));
    Object v18 = ((com.google.javascript.rhino.Node)v17).siblings();
    Object v19 = 1;
    Object v20 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v19).intValue()));
    Object v21 = ":";
    Object v22 = true;
    Object v23 = false;
    Object v24 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v22).booleanValue()),(((java.lang.Boolean)v23).booleanValue()));
    Object v25 = new java.lang.String[]{"K","C "};
    Object v26 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v27 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v25),((java.lang.String[])v26));
    Object v28 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v20),((java.lang.String)v21),((com.google.javascript.jscomp.parsing.Config)v24),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v27));
    Object v29 = null;
    Object v30 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v28),((com.google.javascript.rhino.jstype.ObjectType)v29));
    Object v31 = "1";
    Object v32 = ((com.google.javascript.jscomp.Scope)v30).getSlot(((java.lang.String)v31));
    Object v33 = ((com.google.javascript.jscomp.SyntacticScopeCreator)v7).createScope(((com.google.javascript.rhino.Node)v17),((com.google.javascript.jscomp.Scope)v30));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = 1;
    Object v7 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v6).intValue()));
    Object v8 = ":";
    Object v9 = true;
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v9).booleanValue()),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new java.lang.String[]{"K","C "};
    Object v13 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v14 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v12),((java.lang.String[])v13));
    Object v15 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v7),((java.lang.String)v8),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v14));
    Object v16 = 1;
    Object v17 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v16).intValue()));
    Object v18 = ":";
    Object v19 = true;
    Object v20 = false;
    Object v21 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v19).booleanValue()),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = new java.lang.String[]{"K","C "};
    Object v23 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v24 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v22),((java.lang.String[])v23));
    Object v25 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v17),((java.lang.String)v18),((com.google.javascript.jscomp.parsing.Config)v21),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v24));
    Object v26 = ((com.google.javascript.rhino.Node)v15).copyInformationFrom(((com.google.javascript.rhino.Node)v25));
    Object v27 = 1;
    Object v28 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v27).intValue()));
    Object v29 = ":";
    Object v30 = true;
    Object v31 = false;
    Object v32 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v30).booleanValue()),(((java.lang.Boolean)v31).booleanValue()));
    Object v33 = new java.lang.String[]{"K","C "};
    Object v34 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v35 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v33),((java.lang.String[])v34));
    Object v36 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v28),((java.lang.String)v29),((com.google.javascript.jscomp.parsing.Config)v32),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v35));
    Object v37 = null;
    Object v38 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v36),((com.google.javascript.rhino.jstype.ObjectType)v37));
    Object v39 = ((com.google.javascript.jscomp.SyntacticScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v15),((com.google.javascript.jscomp.Scope)v38));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = 1;
    Object v7 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v6).intValue()));
    Object v8 = ":";
    Object v9 = true;
    Object v10 = false;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v9).booleanValue()),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new java.lang.String[]{"K","C "};
    Object v13 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v14 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v12),((java.lang.String[])v13));
    Object v15 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v7),((java.lang.String)v8),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v14));
    Object v16 = 72;
    Object v17 = 1;
    Object v18 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v17).intValue()));
    ((com.google.javascript.rhino.Node)v15).putProp((((java.lang.Integer)v16).intValue()),((java.lang.Object)v18));
    Object v19 = null;
    Object v20 = 1;
    Object v21 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v20).intValue()));
    Object v22 = ":";
    Object v23 = true;
    Object v24 = false;
    Object v25 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v23).booleanValue()),(((java.lang.Boolean)v24).booleanValue()));
    Object v26 = new java.lang.String[]{"K","C "};
    Object v27 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v28 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v26),((java.lang.String[])v27));
    Object v29 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v21),((java.lang.String)v22),((com.google.javascript.jscomp.parsing.Config)v25),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v28));
    Object v30 = null;
    Object v31 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v29),((com.google.javascript.rhino.jstype.ObjectType)v30));
    Object v32 = ((com.google.javascript.jscomp.SyntacticScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v15),((com.google.javascript.jscomp.Scope)v31));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "";
    Object v5 = -21;
    Object v6 = ((com.google.javascript.jscomp.SourceExcerptProvider)v3).getSourceLine(((java.lang.String)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v8 = 1;
    Object v9 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v8).intValue()));
    Object v10 = ":";
    Object v11 = true;
    Object v12 = false;
    Object v13 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new java.lang.String[]{"K","C "};
    Object v15 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v16 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v14),((java.lang.String[])v15));
    Object v17 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v9),((java.lang.String)v10),((com.google.javascript.jscomp.parsing.Config)v13),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v16));
    Object v18 = 1;
    Object v19 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v18).intValue()));
    Object v20 = ":";
    Object v21 = true;
    Object v22 = false;
    Object v23 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v21).booleanValue()),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = new java.lang.String[]{"K","C "};
    Object v25 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v26 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v24),((java.lang.String[])v25));
    Object v27 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v19),((java.lang.String)v20),((com.google.javascript.jscomp.parsing.Config)v23),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v26));
    Object v28 = null;
    Object v29 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v27),((com.google.javascript.rhino.jstype.ObjectType)v28));
    Object v30 = ">";
    Object v31 = ((com.google.javascript.jscomp.Scope)v29).getVar(((java.lang.String)v30));
    Object v32 = ((com.google.javascript.jscomp.SyntacticScopeCreator)v7).createScope(((com.google.javascript.rhino.Node)v17),((com.google.javascript.jscomp.Scope)v29));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "";
    Object v5 = -21;
    Object v6 = ((com.google.javascript.jscomp.SourceExcerptProvider)v3).getSourceLine(((java.lang.String)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v8 = 1;
    Object v9 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v8).intValue()));
    Object v10 = ":";
    Object v11 = true;
    Object v12 = false;
    Object v13 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new java.lang.String[]{"K","C "};
    Object v15 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v16 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v14),((java.lang.String[])v15));
    Object v17 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v9),((java.lang.String)v10),((com.google.javascript.jscomp.parsing.Config)v13),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v16));
    Object v18 = 1;
    Object v19 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v18).intValue()));
    Object v20 = ":";
    Object v21 = true;
    Object v22 = false;
    Object v23 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v21).booleanValue()),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = new java.lang.String[]{"K","C "};
    Object v25 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v26 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v24),((java.lang.String[])v25));
    Object v27 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v19),((java.lang.String)v20),((com.google.javascript.jscomp.parsing.Config)v23),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v26));
    Object v28 = null;
    Object v29 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v27),((com.google.javascript.rhino.jstype.ObjectType)v28));
    Object v30 = "";
    Object v31 = ((com.google.javascript.jscomp.Scope)v29).getOwnSlot(((java.lang.String)v30));
    Object v32 = ((com.google.javascript.jscomp.SyntacticScopeCreator)v7).createScope(((com.google.javascript.rhino.Node)v17),((com.google.javascript.jscomp.Scope)v29));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "`*";
    Object v5 = 0;
    Object v6 = ((com.google.javascript.jscomp.SourceExcerptProvider)v3).getSourceLine(((java.lang.String)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v8 = 1;
    Object v9 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v8).intValue()));
    Object v10 = ":";
    Object v11 = true;
    Object v12 = false;
    Object v13 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new java.lang.String[]{"K","C "};
    Object v15 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v16 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v14),((java.lang.String[])v15));
    Object v17 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v9),((java.lang.String)v10),((com.google.javascript.jscomp.parsing.Config)v13),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v16));
    Object v18 = 1;
    Object v19 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v18).intValue()));
    Object v20 = ":";
    Object v21 = true;
    Object v22 = false;
    Object v23 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v21).booleanValue()),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = new java.lang.String[]{"K","C "};
    Object v25 = new java.lang.String[]{"ASSIGN_MU'",""};
    Object v26 = new com.google.javascript.jscomp.testing.TestErrorReporter(((java.lang.String[])v24),((java.lang.String[])v25));
    Object v27 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v19),((java.lang.String)v20),((com.google.javascript.jscomp.parsing.Config)v23),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v26));
    Object v28 = null;
    Object v29 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v27),((com.google.javascript.rhino.jstype.ObjectType)v28));
    Object v30 = "msg.jsdocs.externs";
    Object v31 = ((com.google.javascript.jscomp.Scope)v29).getSlot(((java.lang.String)v30));
    Object v32 = ((com.google.javascript.jscomp.SyntacticScopeCreator)v7).createScope(((com.google.javascript.rhino.Node)v17),((com.google.javascript.jscomp.Scope)v29));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }
}
