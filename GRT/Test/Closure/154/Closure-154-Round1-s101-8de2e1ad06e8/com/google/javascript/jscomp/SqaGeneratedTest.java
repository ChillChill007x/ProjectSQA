package com.google.javascript.jscomp;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v2 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v2));
    Object v4 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v1),((com.google.javascript.rhino.jstype.JSTypeRegistry)v3));
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.Compiler();
    Object v9 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v8));
    Object v10 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v11 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v12 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6),((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.jscomp.ScopeCreator)v9),((com.google.javascript.jscomp.CheckLevel)v10),((com.google.javascript.jscomp.CheckLevel)v11));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v2 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v2));
    Object v4 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v1),((com.google.javascript.rhino.jstype.JSTypeRegistry)v3));
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 1;
    Object v2 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v1).intValue()));
    Object v3 = "";
    Object v4 = true;
    Object v5 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = com.google.javascript.jscomp.RhinoErrorReporter.forNewRhino(((com.google.javascript.jscomp.AbstractCompiler)v6));
    Object v8 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v2),((java.lang.String)v3),((com.google.javascript.jscomp.parsing.Config)v5),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v7));
    Object v9 = true;
    ((com.google.javascript.jscomp.TypeCheck)v0).check(((com.google.javascript.rhino.Node)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 1;
    Object v2 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v1).intValue()));
    Object v3 = "";
    Object v4 = true;
    Object v5 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = com.google.javascript.jscomp.RhinoErrorReporter.forNewRhino(((com.google.javascript.jscomp.AbstractCompiler)v6));
    Object v8 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v2),((java.lang.String)v3),((com.google.javascript.jscomp.parsing.Config)v5),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v7));
    Object v9 = "prototkype";
    ((com.google.javascript.rhino.Node)v8).addSuppression(((java.lang.String)v9));
    Object v10 = null;
    Object v11 = 1;
    Object v12 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v11).intValue()));
    Object v13 = "";
    Object v14 = true;
    Object v15 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v14).booleanValue()));
    Object v16 = new com.google.javascript.jscomp.Compiler();
    Object v17 = com.google.javascript.jscomp.RhinoErrorReporter.forNewRhino(((com.google.javascript.jscomp.AbstractCompiler)v16));
    Object v18 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v12),((java.lang.String)v13),((com.google.javascript.jscomp.parsing.Config)v15),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v17));
    ((com.google.javascript.jscomp.TypeCheck)v0).process(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v18));
    Object v19 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ((com.google.javascript.jscomp.TypeCheck)v0).getTypedPercent();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v2 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v2));
    Object v4 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v1),((com.google.javascript.rhino.jstype.JSTypeRegistry)v3));
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v8 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v9 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6),((com.google.javascript.jscomp.CheckLevel)v7),((com.google.javascript.jscomp.CheckLevel)v8));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v2 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v2));
    Object v4 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v1),((com.google.javascript.rhino.jstype.JSTypeRegistry)v3));
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = 1;
    Object v8 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v7).intValue()));
    Object v9 = "";
    Object v10 = true;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = com.google.javascript.jscomp.RhinoErrorReporter.forNewRhino(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v8),((java.lang.String)v9),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v13));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.jstype.ObjectType)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler();
    Object v18 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v17));
    Object v19 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v20 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v21 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6),((com.google.javascript.jscomp.Scope)v16),((com.google.javascript.jscomp.ScopeCreator)v18),((com.google.javascript.jscomp.CheckLevel)v19),((com.google.javascript.jscomp.CheckLevel)v20));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 1;
    Object v2 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v1).intValue()));
    Object v3 = "";
    Object v4 = true;
    Object v5 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = com.google.javascript.jscomp.RhinoErrorReporter.forNewRhino(((com.google.javascript.jscomp.AbstractCompiler)v6));
    Object v8 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v2),((java.lang.String)v3),((com.google.javascript.jscomp.parsing.Config)v5),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v7));
    Object v9 = false;
    ((com.google.javascript.jscomp.TypeCheck)v0).check(((com.google.javascript.rhino.Node)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "/";
    Object v2 = -8;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v8));
    Object v10 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v11 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v12 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v7),((com.google.javascript.rhino.jstype.JSTypeRegistry)v9),((com.google.javascript.jscomp.CheckLevel)v10),((com.google.javascript.jscomp.CheckLevel)v11));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 1;
    Object v2 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v1).intValue()));
    Object v3 = "";
    Object v4 = true;
    Object v5 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = com.google.javascript.jscomp.RhinoErrorReporter.forNewRhino(((com.google.javascript.jscomp.AbstractCompiler)v6));
    Object v8 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v2),((java.lang.String)v3),((com.google.javascript.jscomp.parsing.Config)v5),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v7));
    Object v9 = 1;
    Object v10 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v9).intValue()));
    Object v11 = "";
    Object v12 = true;
    Object v13 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new com.google.javascript.jscomp.Compiler();
    Object v15 = com.google.javascript.jscomp.RhinoErrorReporter.forNewRhino(((com.google.javascript.jscomp.AbstractCompiler)v14));
    Object v16 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v10),((java.lang.String)v11),((com.google.javascript.jscomp.parsing.Config)v13),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v15));
    ((com.google.javascript.jscomp.TypeCheck)v0).process(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v16));
    Object v17 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v2 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v2));
    Object v4 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v1),((com.google.javascript.rhino.jstype.JSTypeRegistry)v3));
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = 1;
    Object v8 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v7).intValue()));
    Object v9 = "";
    Object v10 = true;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = com.google.javascript.jscomp.RhinoErrorReporter.forNewRhino(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v8),((java.lang.String)v9),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v13));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.jstype.ObjectType)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler();
    Object v18 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v17));
    Object v19 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v20 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v21 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6),((com.google.javascript.jscomp.Scope)v16),((com.google.javascript.jscomp.ScopeCreator)v18),((com.google.javascript.jscomp.CheckLevel)v19),((com.google.javascript.jscomp.CheckLevel)v20));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v2 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v2));
    Object v4 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v1),((com.google.javascript.rhino.jstype.JSTypeRegistry)v3));
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = 1;
    Object v8 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v7).intValue()));
    Object v9 = "";
    Object v10 = true;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = com.google.javascript.jscomp.RhinoErrorReporter.forNewRhino(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v8),((java.lang.String)v9),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v13));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.jstype.ObjectType)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler();
    Object v18 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v17));
    Object v19 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v20 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v21 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6),((com.google.javascript.jscomp.Scope)v16),((com.google.javascript.jscomp.ScopeCreator)v18),((com.google.javascript.jscomp.CheckLevel)v19),((com.google.javascript.jscomp.CheckLevel)v20));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v2 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v2));
    Object v4 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v1),((com.google.javascript.rhino.jstype.JSTypeRegistry)v3));
    Object v5 = 1;
    Object v6 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v5).intValue()));
    Object v7 = "";
    Object v8 = true;
    Object v9 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.google.javascript.jscomp.Compiler();
    Object v11 = com.google.javascript.jscomp.RhinoErrorReporter.forNewRhino(((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v12 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v6),((java.lang.String)v7),((com.google.javascript.jscomp.parsing.Config)v9),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v11));
    Object v13 = 1;
    Object v14 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v13).intValue()));
    Object v15 = "";
    Object v16 = true;
    Object v17 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v16).booleanValue()));
    Object v18 = new com.google.javascript.jscomp.Compiler();
    Object v19 = com.google.javascript.jscomp.RhinoErrorReporter.forNewRhino(((com.google.javascript.jscomp.AbstractCompiler)v18));
    Object v20 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v14),((java.lang.String)v15),((com.google.javascript.jscomp.parsing.Config)v17),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v19));
    Object v21 = null;
    Object v22 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.jstype.ObjectType)v21));
    Object v23 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v22));
    Object v24 = new com.google.javascript.jscomp.LinkedFlowScope(((com.google.javascript.jscomp.LinkedFlowScope)v23));
    Object v25 = true;
    Object v26 = ((com.google.javascript.jscomp.ReverseAbstractInterpreter)v4).getPreciserScopeKnowingConditionOutcome(((com.google.javascript.rhino.Node)v12),((com.google.javascript.jscomp.FlowScope)v24),(((java.lang.Boolean)v25).booleanValue()));
    Object v27 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v27));
    Object v29 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v28));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.google.javascript.jscomp.Compiler();
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.FindExportableNodes(((com.google.javascript.jscomp.AbstractCompiler)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v1),((com.google.javascript.jscomp.NodeTraversal.Callback)v3),((com.google.javascript.jscomp.ScopeCreator)v5));
    Object v7 = 1;
    Object v8 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v7).intValue()));
    Object v9 = "";
    Object v10 = true;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = com.google.javascript.jscomp.RhinoErrorReporter.forNewRhino(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v8),((java.lang.String)v9),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v13));
    Object v15 = 1;
    Object v16 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v15).intValue()));
    Object v17 = "";
    Object v18 = true;
    Object v19 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v18).booleanValue()));
    Object v20 = new com.google.javascript.jscomp.Compiler();
    Object v21 = com.google.javascript.jscomp.RhinoErrorReporter.forNewRhino(((com.google.javascript.jscomp.AbstractCompiler)v20));
    Object v22 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v16),((java.lang.String)v17),((com.google.javascript.jscomp.parsing.Config)v19),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v21));
    ((com.google.javascript.jscomp.TypeCheck)v0).visit(((com.google.javascript.jscomp.NodeTraversal)v6),((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.Node)v22));
    Object v23 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v2 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v2));
    Object v4 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v1),((com.google.javascript.rhino.jstype.JSTypeRegistry)v3));
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v8 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v9 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6),((com.google.javascript.jscomp.CheckLevel)v7),((com.google.javascript.jscomp.CheckLevel)v8));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 1;
    Object v2 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v1).intValue()));
    Object v3 = "";
    Object v4 = true;
    Object v5 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = com.google.javascript.jscomp.RhinoErrorReporter.forNewRhino(((com.google.javascript.jscomp.AbstractCompiler)v6));
    Object v8 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v2),((java.lang.String)v3),((com.google.javascript.jscomp.parsing.Config)v5),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v7));
    Object v9 = 1;
    Object v10 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v9).intValue()));
    Object v11 = "";
    Object v12 = true;
    Object v13 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new com.google.javascript.jscomp.Compiler();
    Object v15 = com.google.javascript.jscomp.RhinoErrorReporter.forNewRhino(((com.google.javascript.jscomp.AbstractCompiler)v14));
    Object v16 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v10),((java.lang.String)v11),((com.google.javascript.jscomp.parsing.Config)v13),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v15));
    Object v17 = ((com.google.javascript.jscomp.TypeCheck)v0).processForTesting(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v16));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v2 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v2));
    Object v4 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v1),((com.google.javascript.rhino.jstype.JSTypeRegistry)v3));
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = com.google.javascript.rhino.jstype.JSTypeNative.STRING_OBJECT_TYPE;
    Object v8 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v6).getNativeObjectType(((com.google.javascript.rhino.jstype.JSTypeNative)v7));
    Object v9 = 1;
    Object v10 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v9).intValue()));
    Object v11 = "";
    Object v12 = true;
    Object v13 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new com.google.javascript.jscomp.Compiler();
    Object v15 = com.google.javascript.jscomp.RhinoErrorReporter.forNewRhino(((com.google.javascript.jscomp.AbstractCompiler)v14));
    Object v16 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v10),((java.lang.String)v11),((com.google.javascript.jscomp.parsing.Config)v13),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v15));
    Object v17 = null;
    Object v18 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v16),((com.google.javascript.rhino.jstype.ObjectType)v17));
    Object v19 = new com.google.javascript.jscomp.Compiler();
    Object v20 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v19));
    Object v21 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v22 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v23 = ((java.lang.Enum)v22).getDeclaringClass();
    Object v24 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6),((com.google.javascript.jscomp.Scope)v18),((com.google.javascript.jscomp.ScopeCreator)v20),((com.google.javascript.jscomp.CheckLevel)v21),((com.google.javascript.jscomp.CheckLevel)v22));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v2 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v2));
    Object v4 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v1),((com.google.javascript.rhino.jstype.JSTypeRegistry)v3));
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v8 = ((java.lang.Enum)v7).getDeclaringClass();
    Object v9 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v10 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6),((com.google.javascript.jscomp.CheckLevel)v7),((com.google.javascript.jscomp.CheckLevel)v9));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v2 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v2));
    Object v4 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v1),((com.google.javascript.rhino.jstype.JSTypeRegistry)v3));
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v8 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v9 = ((java.lang.Enum)v8).hashCode();
    Object v10 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6),((com.google.javascript.jscomp.CheckLevel)v7),((com.google.javascript.jscomp.CheckLevel)v8));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v2 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v2));
    Object v4 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v1),((com.google.javascript.rhino.jstype.JSTypeRegistry)v3));
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v8 = ((java.lang.Enum)v7).getDeclaringClass();
    Object v9 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v10 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6),((com.google.javascript.jscomp.CheckLevel)v7),((com.google.javascript.jscomp.CheckLevel)v9));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.google.javascript.jscomp.Compiler();
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.FindExportableNodes(((com.google.javascript.jscomp.AbstractCompiler)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v1),((com.google.javascript.jscomp.NodeTraversal.Callback)v3),((com.google.javascript.jscomp.ScopeCreator)v5));
    Object v7 = 1;
    Object v8 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v7).intValue()));
    Object v9 = "";
    Object v10 = true;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = com.google.javascript.jscomp.RhinoErrorReporter.forNewRhino(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v8),((java.lang.String)v9),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v13));
    Object v15 = ((com.google.javascript.rhino.Node)v14).siblings();
    Object v16 = 1;
    Object v17 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v16).intValue()));
    Object v18 = "";
    Object v19 = true;
    Object v20 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v19).booleanValue()));
    Object v21 = new com.google.javascript.jscomp.Compiler();
    Object v22 = com.google.javascript.jscomp.RhinoErrorReporter.forNewRhino(((com.google.javascript.jscomp.AbstractCompiler)v21));
    Object v23 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v17),((java.lang.String)v18),((com.google.javascript.jscomp.parsing.Config)v20),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v22));
    ((com.google.javascript.jscomp.TypeCheck)v0).visit(((com.google.javascript.jscomp.NodeTraversal)v6),((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.Node)v23));
    Object v24 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v2 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v2));
    Object v4 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v1),((com.google.javascript.rhino.jstype.JSTypeRegistry)v3));
    Object v5 = 1;
    Object v6 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v5).intValue()));
    Object v7 = "";
    Object v8 = true;
    Object v9 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.google.javascript.jscomp.Compiler();
    Object v11 = com.google.javascript.jscomp.RhinoErrorReporter.forNewRhino(((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v12 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v6),((java.lang.String)v7),((com.google.javascript.jscomp.parsing.Config)v9),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v11));
    Object v13 = 1;
    Object v14 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v13).intValue()));
    Object v15 = "";
    Object v16 = true;
    Object v17 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v16).booleanValue()));
    Object v18 = new com.google.javascript.jscomp.Compiler();
    Object v19 = com.google.javascript.jscomp.RhinoErrorReporter.forNewRhino(((com.google.javascript.jscomp.AbstractCompiler)v18));
    Object v20 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v14),((java.lang.String)v15),((com.google.javascript.jscomp.parsing.Config)v17),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v19));
    Object v21 = null;
    Object v22 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.jstype.ObjectType)v21));
    Object v23 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v22));
    Object v24 = new com.google.javascript.jscomp.LinkedFlowScope(((com.google.javascript.jscomp.LinkedFlowScope)v23));
    Object v25 = true;
    Object v26 = ((com.google.javascript.jscomp.ReverseAbstractInterpreter)v4).getPreciserScopeKnowingConditionOutcome(((com.google.javascript.rhino.Node)v12),((com.google.javascript.jscomp.FlowScope)v24),(((java.lang.Boolean)v25).booleanValue()));
    Object v27 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v27));
    Object v29 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v30 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v31 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v28),((com.google.javascript.jscomp.CheckLevel)v29),((com.google.javascript.jscomp.CheckLevel)v30));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.google.javascript.jscomp.Compiler();
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.FindExportableNodes(((com.google.javascript.jscomp.AbstractCompiler)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v1),((com.google.javascript.jscomp.NodeTraversal.Callback)v3),((com.google.javascript.jscomp.ScopeCreator)v5));
    Object v7 = 1;
    Object v8 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v7).intValue()));
    Object v9 = "";
    Object v10 = true;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = com.google.javascript.jscomp.RhinoErrorReporter.forNewRhino(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v8),((java.lang.String)v9),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v13));
    Object v15 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v16 = "q";
    Object v17 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v18 = "";
    Object v19 = com.google.javascript.jscomp.DiagnosticType.make(((java.lang.String)v16),((com.google.javascript.jscomp.CheckLevel)v17),((java.lang.String)v18));
    Object v20 = new java.lang.String[]{};
    Object v21 = ((com.google.javascript.jscomp.NodeTraversal)v6).makeError(((com.google.javascript.rhino.Node)v14),((com.google.javascript.jscomp.CheckLevel)v15),((com.google.javascript.jscomp.DiagnosticType)v19),((java.lang.String[])v20));
    Object v22 = 1;
    Object v23 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v22).intValue()));
    Object v24 = "";
    Object v25 = true;
    Object v26 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v25).booleanValue()));
    Object v27 = new com.google.javascript.jscomp.Compiler();
    Object v28 = com.google.javascript.jscomp.RhinoErrorReporter.forNewRhino(((com.google.javascript.jscomp.AbstractCompiler)v27));
    Object v29 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v23),((java.lang.String)v24),((com.google.javascript.jscomp.parsing.Config)v26),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v28));
    Object v30 = 1;
    Object v31 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v30).intValue()));
    Object v32 = "";
    Object v33 = true;
    Object v34 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v33).booleanValue()));
    Object v35 = new com.google.javascript.jscomp.Compiler();
    Object v36 = com.google.javascript.jscomp.RhinoErrorReporter.forNewRhino(((com.google.javascript.jscomp.AbstractCompiler)v35));
    Object v37 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v31),((java.lang.String)v32),((com.google.javascript.jscomp.parsing.Config)v34),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v36));
    Object v38 = ((com.google.javascript.jscomp.TypeCheck)v0).visitName(((com.google.javascript.jscomp.NodeTraversal)v6),((com.google.javascript.rhino.Node)v29),((com.google.javascript.rhino.Node)v37));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = false;
    Object v2 = ((com.google.javascript.jscomp.TypeCheck)v0).reportMissingProperties((((java.lang.Boolean)v1).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.google.javascript.jscomp.Compiler();
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.FindExportableNodes(((com.google.javascript.jscomp.AbstractCompiler)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v1),((com.google.javascript.jscomp.NodeTraversal.Callback)v3),((com.google.javascript.jscomp.ScopeCreator)v5));
    Object v7 = 1;
    Object v8 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v7).intValue()));
    Object v9 = "";
    Object v10 = true;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = com.google.javascript.jscomp.RhinoErrorReporter.forNewRhino(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v8),((java.lang.String)v9),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v13));
    Object v15 = ((com.google.javascript.rhino.Node)v14).removeChildren();
    Object v16 = 1;
    Object v17 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v16).intValue()));
    Object v18 = "";
    Object v19 = true;
    Object v20 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v19).booleanValue()));
    Object v21 = new com.google.javascript.jscomp.Compiler();
    Object v22 = com.google.javascript.jscomp.RhinoErrorReporter.forNewRhino(((com.google.javascript.jscomp.AbstractCompiler)v21));
    Object v23 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v17),((java.lang.String)v18),((com.google.javascript.jscomp.parsing.Config)v20),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v22));
    Object v24 = ((com.google.javascript.jscomp.TypeCheck)v0).visitName(((com.google.javascript.jscomp.NodeTraversal)v6),((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.Node)v23));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.google.javascript.jscomp.Compiler();
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.FindExportableNodes(((com.google.javascript.jscomp.AbstractCompiler)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v1),((com.google.javascript.jscomp.NodeTraversal.Callback)v3),((com.google.javascript.jscomp.ScopeCreator)v5));
    Object v7 = ((com.google.javascript.jscomp.NodeTraversal)v6).hasScope();
    Object v8 = 1;
    Object v9 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v8).intValue()));
    Object v10 = "";
    Object v11 = true;
    Object v12 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.google.javascript.jscomp.Compiler();
    Object v14 = com.google.javascript.jscomp.RhinoErrorReporter.forNewRhino(((com.google.javascript.jscomp.AbstractCompiler)v13));
    Object v15 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v9),((java.lang.String)v10),((com.google.javascript.jscomp.parsing.Config)v12),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v14));
    Object v16 = 1;
    Object v17 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v16).intValue()));
    Object v18 = "";
    Object v19 = true;
    Object v20 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v19).booleanValue()));
    Object v21 = new com.google.javascript.jscomp.Compiler();
    Object v22 = com.google.javascript.jscomp.RhinoErrorReporter.forNewRhino(((com.google.javascript.jscomp.AbstractCompiler)v21));
    Object v23 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v17),((java.lang.String)v18),((com.google.javascript.jscomp.parsing.Config)v20),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v22));
    Object v24 = ((com.google.javascript.jscomp.TypeCheck)v0).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v6),((com.google.javascript.rhino.Node)v15),((com.google.javascript.rhino.Node)v23));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTopScope();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = 1;
    Object v7 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v6).intValue()));
    Object v8 = "";
    Object v9 = true;
    Object v10 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = new com.google.javascript.jscomp.Compiler();
    Object v12 = com.google.javascript.jscomp.RhinoErrorReporter.forNewRhino(((com.google.javascript.jscomp.AbstractCompiler)v11));
    Object v13 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v7),((java.lang.String)v8),((com.google.javascript.jscomp.parsing.Config)v10),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v12));
    Object v14 = 1;
    Object v15 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v14).intValue()));
    Object v16 = "";
    Object v17 = true;
    Object v18 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v17).booleanValue()));
    Object v19 = new com.google.javascript.jscomp.Compiler();
    Object v20 = com.google.javascript.jscomp.RhinoErrorReporter.forNewRhino(((com.google.javascript.jscomp.AbstractCompiler)v19));
    Object v21 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v15),((java.lang.String)v16),((com.google.javascript.jscomp.parsing.Config)v18),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v20));
    Object v22 = null;
    Object v23 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v21),((com.google.javascript.rhino.jstype.ObjectType)v22));
    Object v24 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v23));
    Object v25 = false;
    Object v26 = ((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5).getPreciserScopeKnowingConditionOutcome(((com.google.javascript.rhino.Node)v13),((com.google.javascript.jscomp.FlowScope)v24),(((java.lang.Boolean)v25).booleanValue()));
    Object v27 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v27));
    Object v29 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v30 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v31 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v28),((com.google.javascript.jscomp.CheckLevel)v29),((com.google.javascript.jscomp.CheckLevel)v30));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v2 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v2));
    Object v4 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v1),((com.google.javascript.rhino.jstype.JSTypeRegistry)v3));
    Object v5 = 1;
    Object v6 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v5).intValue()));
    Object v7 = "";
    Object v8 = true;
    Object v9 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.google.javascript.jscomp.Compiler();
    Object v11 = com.google.javascript.jscomp.RhinoErrorReporter.forNewRhino(((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v12 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v6),((java.lang.String)v7),((com.google.javascript.jscomp.parsing.Config)v9),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v11));
    Object v13 = 1;
    Object v14 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v13).intValue()));
    Object v15 = "";
    Object v16 = true;
    Object v17 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v16).booleanValue()));
    Object v18 = new com.google.javascript.jscomp.Compiler();
    Object v19 = com.google.javascript.jscomp.RhinoErrorReporter.forNewRhino(((com.google.javascript.jscomp.AbstractCompiler)v18));
    Object v20 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v14),((java.lang.String)v15),((com.google.javascript.jscomp.parsing.Config)v17),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v19));
    Object v21 = null;
    Object v22 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.jstype.ObjectType)v21));
    Object v23 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v22));
    Object v24 = new com.google.javascript.jscomp.LinkedFlowScope(((com.google.javascript.jscomp.LinkedFlowScope)v23));
    Object v25 = false;
    Object v26 = ((com.google.javascript.jscomp.ReverseAbstractInterpreter)v4).getPreciserScopeKnowingConditionOutcome(((com.google.javascript.rhino.Node)v12),((com.google.javascript.jscomp.FlowScope)v24),(((java.lang.Boolean)v25).booleanValue()));
    Object v27 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v27));
    Object v29 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v30 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v31 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v28),((com.google.javascript.jscomp.CheckLevel)v29),((com.google.javascript.jscomp.CheckLevel)v30));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "F";
    Object v2 = -33;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v8));
    Object v10 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v7),((com.google.javascript.rhino.jstype.JSTypeRegistry)v9));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 1;
    Object v2 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v1).intValue()));
    Object v3 = "";
    Object v4 = true;
    Object v5 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = com.google.javascript.jscomp.RhinoErrorReporter.forNewRhino(((com.google.javascript.jscomp.AbstractCompiler)v6));
    Object v8 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v2),((java.lang.String)v3),((com.google.javascript.jscomp.parsing.Config)v5),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v7));
    Object v9 = 1;
    Object v10 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v9).intValue()));
    Object v11 = "";
    Object v12 = true;
    Object v13 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new com.google.javascript.jscomp.Compiler();
    Object v15 = com.google.javascript.jscomp.RhinoErrorReporter.forNewRhino(((com.google.javascript.jscomp.AbstractCompiler)v14));
    Object v16 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v10),((java.lang.String)v11),((com.google.javascript.jscomp.parsing.Config)v13),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v15));
    Object v17 = ((com.google.javascript.rhino.Node)v8).copyInformationFrom(((com.google.javascript.rhino.Node)v16));
    Object v18 = 1;
    Object v19 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v18).intValue()));
    Object v20 = "";
    Object v21 = true;
    Object v22 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v21).booleanValue()));
    Object v23 = new com.google.javascript.jscomp.Compiler();
    Object v24 = com.google.javascript.jscomp.RhinoErrorReporter.forNewRhino(((com.google.javascript.jscomp.AbstractCompiler)v23));
    Object v25 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v19),((java.lang.String)v20),((com.google.javascript.jscomp.parsing.Config)v22),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v24));
    Object v26 = 25;
    Object v27 = ((com.google.javascript.rhino.Node)v25).getAncestor((((java.lang.Integer)v26).intValue()));
    ((com.google.javascript.jscomp.TypeCheck)v0).process(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v25));
    Object v28 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 1;
    Object v2 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v1).intValue()));
    Object v3 = "";
    Object v4 = true;
    Object v5 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = com.google.javascript.jscomp.RhinoErrorReporter.forNewRhino(((com.google.javascript.jscomp.AbstractCompiler)v6));
    Object v8 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v2),((java.lang.String)v3),((com.google.javascript.jscomp.parsing.Config)v5),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v7));
    Object v9 = ((com.google.javascript.rhino.Node)v8).hasSideEffects();
    Object v10 = 1;
    Object v11 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v10).intValue()));
    Object v12 = "";
    Object v13 = true;
    Object v14 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v13).booleanValue()));
    Object v15 = new com.google.javascript.jscomp.Compiler();
    Object v16 = com.google.javascript.jscomp.RhinoErrorReporter.forNewRhino(((com.google.javascript.jscomp.AbstractCompiler)v15));
    Object v17 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v11),((java.lang.String)v12),((com.google.javascript.jscomp.parsing.Config)v14),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v16));
    ((com.google.javascript.jscomp.TypeCheck)v0).process(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v17));
    Object v18 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.google.javascript.jscomp.Compiler();
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.FindExportableNodes(((com.google.javascript.jscomp.AbstractCompiler)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v1),((com.google.javascript.jscomp.NodeTraversal.Callback)v3),((com.google.javascript.jscomp.ScopeCreator)v5));
    Object v7 = 1;
    Object v8 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v7).intValue()));
    Object v9 = "";
    Object v10 = true;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = com.google.javascript.jscomp.RhinoErrorReporter.forNewRhino(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v8),((java.lang.String)v9),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v13));
    Object v15 = 1;
    Object v16 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v15).intValue()));
    Object v17 = "";
    Object v18 = true;
    Object v19 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v18).booleanValue()));
    Object v20 = new com.google.javascript.jscomp.Compiler();
    Object v21 = com.google.javascript.jscomp.RhinoErrorReporter.forNewRhino(((com.google.javascript.jscomp.AbstractCompiler)v20));
    Object v22 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v16),((java.lang.String)v17),((com.google.javascript.jscomp.parsing.Config)v19),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v21));
    Object v23 = ((com.google.javascript.jscomp.TypeCheck)v0).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v6),((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.Node)v22));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 1;
    Object v2 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v1).intValue()));
    Object v3 = "";
    Object v4 = true;
    Object v5 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = com.google.javascript.jscomp.RhinoErrorReporter.forNewRhino(((com.google.javascript.jscomp.AbstractCompiler)v6));
    Object v8 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v2),((java.lang.String)v3),((com.google.javascript.jscomp.parsing.Config)v5),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v7));
    Object v9 = 0;
    Object v10 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    ((com.google.javascript.rhino.Node)v8).putProp((((java.lang.Integer)v9).intValue()),((java.lang.Object)v10));
    Object v11 = null;
    Object v12 = 1;
    Object v13 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v12).intValue()));
    Object v14 = "";
    Object v15 = true;
    Object v16 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v15).booleanValue()));
    Object v17 = new com.google.javascript.jscomp.Compiler();
    Object v18 = com.google.javascript.jscomp.RhinoErrorReporter.forNewRhino(((com.google.javascript.jscomp.AbstractCompiler)v17));
    Object v19 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v13),((java.lang.String)v14),((com.google.javascript.jscomp.parsing.Config)v16),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v18));
    ((com.google.javascript.jscomp.TypeCheck)v0).process(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v19));
    Object v20 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v2 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v2));
    Object v4 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v1),((com.google.javascript.rhino.jstype.JSTypeRegistry)v3));
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v8 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v9 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6),((com.google.javascript.jscomp.CheckLevel)v7),((com.google.javascript.jscomp.CheckLevel)v8));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v2 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v2));
    Object v4 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v1),((com.google.javascript.rhino.jstype.JSTypeRegistry)v3));
    Object v5 = 1;
    Object v6 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v5).intValue()));
    Object v7 = "";
    Object v8 = true;
    Object v9 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.google.javascript.jscomp.Compiler();
    Object v11 = com.google.javascript.jscomp.RhinoErrorReporter.forNewRhino(((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v12 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v6),((java.lang.String)v7),((com.google.javascript.jscomp.parsing.Config)v9),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v11));
    Object v13 = 1;
    Object v14 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v13).intValue()));
    Object v15 = "";
    Object v16 = true;
    Object v17 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v16).booleanValue()));
    Object v18 = new com.google.javascript.jscomp.Compiler();
    Object v19 = com.google.javascript.jscomp.RhinoErrorReporter.forNewRhino(((com.google.javascript.jscomp.AbstractCompiler)v18));
    Object v20 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v14),((java.lang.String)v15),((com.google.javascript.jscomp.parsing.Config)v17),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v19));
    Object v21 = null;
    Object v22 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.jstype.ObjectType)v21));
    Object v23 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v22));
    Object v24 = false;
    Object v25 = ((com.google.javascript.jscomp.ReverseAbstractInterpreter)v4).getPreciserScopeKnowingConditionOutcome(((com.google.javascript.rhino.Node)v12),((com.google.javascript.jscomp.FlowScope)v23),(((java.lang.Boolean)v24).booleanValue()));
    Object v26 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v27 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v26));
    Object v28 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v27));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v2 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v2));
    Object v4 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v1),((com.google.javascript.rhino.jstype.JSTypeRegistry)v3));
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v8 = ((java.lang.Enum)v7).hashCode();
    Object v9 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v10 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6),((com.google.javascript.jscomp.CheckLevel)v7),((com.google.javascript.jscomp.CheckLevel)v9));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v2 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v2));
    Object v4 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v1),((com.google.javascript.rhino.jstype.JSTypeRegistry)v3));
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v8 = ((java.lang.Enum)v7).getDeclaringClass();
    Object v9 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v10 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6),((com.google.javascript.jscomp.CheckLevel)v7),((com.google.javascript.jscomp.CheckLevel)v9));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.google.javascript.jscomp.Compiler();
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.FindExportableNodes(((com.google.javascript.jscomp.AbstractCompiler)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v1),((com.google.javascript.jscomp.NodeTraversal.Callback)v3),((com.google.javascript.jscomp.ScopeCreator)v5));
    Object v7 = 1;
    Object v8 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v7).intValue()));
    Object v9 = "";
    Object v10 = true;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = com.google.javascript.jscomp.RhinoErrorReporter.forNewRhino(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v8),((java.lang.String)v9),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v13));
    Object v15 = "q";
    Object v16 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v17 = "";
    Object v18 = com.google.javascript.jscomp.DiagnosticType.make(((java.lang.String)v15),((com.google.javascript.jscomp.CheckLevel)v16),((java.lang.String)v17));
    Object v19 = new java.lang.String[]{","};
    Object v20 = ((com.google.javascript.jscomp.NodeTraversal)v6).makeError(((com.google.javascript.rhino.Node)v14),((com.google.javascript.jscomp.DiagnosticType)v18),((java.lang.String[])v19));
    Object v21 = 1;
    Object v22 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v21).intValue()));
    Object v23 = "";
    Object v24 = true;
    Object v25 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v24).booleanValue()));
    Object v26 = new com.google.javascript.jscomp.Compiler();
    Object v27 = com.google.javascript.jscomp.RhinoErrorReporter.forNewRhino(((com.google.javascript.jscomp.AbstractCompiler)v26));
    Object v28 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v22),((java.lang.String)v23),((com.google.javascript.jscomp.parsing.Config)v25),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v27));
    Object v29 = 1;
    Object v30 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v29).intValue()));
    Object v31 = "";
    Object v32 = true;
    Object v33 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v32).booleanValue()));
    Object v34 = new com.google.javascript.jscomp.Compiler();
    Object v35 = com.google.javascript.jscomp.RhinoErrorReporter.forNewRhino(((com.google.javascript.jscomp.AbstractCompiler)v34));
    Object v36 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v30),((java.lang.String)v31),((com.google.javascript.jscomp.parsing.Config)v33),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v35));
    Object v37 = ((com.google.javascript.jscomp.TypeCheck)v0).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v6),((com.google.javascript.rhino.Node)v28),((com.google.javascript.rhino.Node)v36));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 1;
    Object v2 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v1).intValue()));
    Object v3 = "";
    Object v4 = true;
    Object v5 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = com.google.javascript.jscomp.RhinoErrorReporter.forNewRhino(((com.google.javascript.jscomp.AbstractCompiler)v6));
    Object v8 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v2),((java.lang.String)v3),((com.google.javascript.jscomp.parsing.Config)v5),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v7));
    Object v9 = 1;
    Object v10 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v9).intValue()));
    Object v11 = "";
    Object v12 = true;
    Object v13 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new com.google.javascript.jscomp.Compiler();
    Object v15 = com.google.javascript.jscomp.RhinoErrorReporter.forNewRhino(((com.google.javascript.jscomp.AbstractCompiler)v14));
    Object v16 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v10),((java.lang.String)v11),((com.google.javascript.jscomp.parsing.Config)v13),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v15));
    Object v17 = ((com.google.javascript.rhino.Node)v16).toString();
    Object v18 = ((com.google.javascript.jscomp.TypeCheck)v0).processForTesting(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v16));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v2 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v2));
    Object v4 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v1),((com.google.javascript.rhino.jstype.JSTypeRegistry)v3));
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = null;
    Object v8 = new com.google.javascript.rhino.jstype.JSType[]{null,null};
    Object v9 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v6).createFunctionType(((com.google.javascript.rhino.jstype.JSType)v7),((com.google.javascript.rhino.jstype.JSType[])v8));
    Object v10 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v11 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v12 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6),((com.google.javascript.jscomp.CheckLevel)v10),((com.google.javascript.jscomp.CheckLevel)v11));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v2 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v2));
    Object v4 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v1),((com.google.javascript.rhino.jstype.JSTypeRegistry)v3));
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = com.google.javascript.rhino.jstype.JSTypeNative.REGEXP_FUNCTION_TYPE;
    Object v8 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v6).getNativeType(((com.google.javascript.rhino.jstype.JSTypeNative)v7));
    Object v9 = 1;
    Object v10 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v9).intValue()));
    Object v11 = "";
    Object v12 = true;
    Object v13 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new com.google.javascript.jscomp.Compiler();
    Object v15 = com.google.javascript.jscomp.RhinoErrorReporter.forNewRhino(((com.google.javascript.jscomp.AbstractCompiler)v14));
    Object v16 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v10),((java.lang.String)v11),((com.google.javascript.jscomp.parsing.Config)v13),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v15));
    Object v17 = null;
    Object v18 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v16),((com.google.javascript.rhino.jstype.ObjectType)v17));
    Object v19 = new com.google.javascript.jscomp.Compiler();
    Object v20 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v19));
    Object v21 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v22 = ((java.lang.Enum)v21).getDeclaringClass();
    Object v23 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v24 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6),((com.google.javascript.jscomp.Scope)v18),((com.google.javascript.jscomp.ScopeCreator)v20),((com.google.javascript.jscomp.CheckLevel)v21),((com.google.javascript.jscomp.CheckLevel)v23));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 1;
    Object v2 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v1).intValue()));
    Object v3 = "";
    Object v4 = true;
    Object v5 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = com.google.javascript.jscomp.RhinoErrorReporter.forNewRhino(((com.google.javascript.jscomp.AbstractCompiler)v6));
    Object v8 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v2),((java.lang.String)v3),((com.google.javascript.jscomp.parsing.Config)v5),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v7));
    Object v9 = true;
    ((com.google.javascript.rhino.Node)v8).setOptionalArg((((java.lang.Boolean)v9).booleanValue()));
    Object v10 = null;
    Object v11 = 1;
    Object v12 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v11).intValue()));
    Object v13 = "";
    Object v14 = true;
    Object v15 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v14).booleanValue()));
    Object v16 = new com.google.javascript.jscomp.Compiler();
    Object v17 = com.google.javascript.jscomp.RhinoErrorReporter.forNewRhino(((com.google.javascript.jscomp.AbstractCompiler)v16));
    Object v18 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v12),((java.lang.String)v13),((com.google.javascript.jscomp.parsing.Config)v15),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v17));
    Object v19 = ((com.google.javascript.jscomp.TypeCheck)v0).processForTesting(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v18));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.google.javascript.jscomp.Compiler();
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.FindExportableNodes(((com.google.javascript.jscomp.AbstractCompiler)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v1),((com.google.javascript.jscomp.NodeTraversal.Callback)v3),((com.google.javascript.jscomp.ScopeCreator)v5));
    Object v7 = new com.google.javascript.rhino.Node[]{};
    ((com.google.javascript.jscomp.NodeTraversal)v6).traverseRoots(((com.google.javascript.rhino.Node[])v7));
    Object v8 = null;
    Object v9 = 1;
    Object v10 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v9).intValue()));
    Object v11 = "";
    Object v12 = true;
    Object v13 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new com.google.javascript.jscomp.Compiler();
    Object v15 = com.google.javascript.jscomp.RhinoErrorReporter.forNewRhino(((com.google.javascript.jscomp.AbstractCompiler)v14));
    Object v16 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v10),((java.lang.String)v11),((com.google.javascript.jscomp.parsing.Config)v13),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v15));
    Object v17 = 1;
    Object v18 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v17).intValue()));
    Object v19 = "";
    Object v20 = true;
    Object v21 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v20).booleanValue()));
    Object v22 = new com.google.javascript.jscomp.Compiler();
    Object v23 = com.google.javascript.jscomp.RhinoErrorReporter.forNewRhino(((com.google.javascript.jscomp.AbstractCompiler)v22));
    Object v24 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v18),((java.lang.String)v19),((com.google.javascript.jscomp.parsing.Config)v21),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v23));
    ((com.google.javascript.jscomp.TypeCheck)v0).visit(((com.google.javascript.jscomp.NodeTraversal)v6),((com.google.javascript.rhino.Node)v16),((com.google.javascript.rhino.Node)v24));
    Object v25 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v2 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v2));
    Object v4 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v1),((com.google.javascript.rhino.jstype.JSTypeRegistry)v3));
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = 1;
    Object v8 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v7).intValue()));
    Object v9 = "";
    Object v10 = true;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = com.google.javascript.jscomp.RhinoErrorReporter.forNewRhino(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v8),((java.lang.String)v9),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v13));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.jstype.ObjectType)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler();
    Object v18 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v17));
    Object v19 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v20 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v21 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6),((com.google.javascript.jscomp.Scope)v16),((com.google.javascript.jscomp.ScopeCreator)v18),((com.google.javascript.jscomp.CheckLevel)v19),((com.google.javascript.jscomp.CheckLevel)v20));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 1;
    Object v2 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v1).intValue()));
    Object v3 = "";
    Object v4 = true;
    Object v5 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = com.google.javascript.jscomp.RhinoErrorReporter.forNewRhino(((com.google.javascript.jscomp.AbstractCompiler)v6));
    Object v8 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v2),((java.lang.String)v3),((com.google.javascript.jscomp.parsing.Config)v5),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v7));
    Object v9 = 1;
    Object v10 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v9).intValue()));
    Object v11 = "";
    Object v12 = true;
    Object v13 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new com.google.javascript.jscomp.Compiler();
    Object v15 = com.google.javascript.jscomp.RhinoErrorReporter.forNewRhino(((com.google.javascript.jscomp.AbstractCompiler)v14));
    Object v16 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v10),((java.lang.String)v11),((com.google.javascript.jscomp.parsing.Config)v13),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v15));
    Object v17 = 1;
    Object v18 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v17).intValue()));
    Object v19 = "";
    Object v20 = true;
    Object v21 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v20).booleanValue()));
    Object v22 = new com.google.javascript.jscomp.Compiler();
    Object v23 = com.google.javascript.jscomp.RhinoErrorReporter.forNewRhino(((com.google.javascript.jscomp.AbstractCompiler)v22));
    Object v24 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v18),((java.lang.String)v19),((com.google.javascript.jscomp.parsing.Config)v21),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v23));
    Object v25 = ((com.google.javascript.rhino.Node)v16).copyInformationFrom(((com.google.javascript.rhino.Node)v24));
    ((com.google.javascript.jscomp.TypeCheck)v0).process(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v16));
    Object v26 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 1;
    Object v2 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v1).intValue()));
    Object v3 = "";
    Object v4 = true;
    Object v5 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = com.google.javascript.jscomp.RhinoErrorReporter.forNewRhino(((com.google.javascript.jscomp.AbstractCompiler)v6));
    Object v8 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v2),((java.lang.String)v3),((com.google.javascript.jscomp.parsing.Config)v5),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v7));
    Object v9 = ((com.google.javascript.rhino.Node)v8).toStringTree();
    Object v10 = false;
    ((com.google.javascript.jscomp.TypeCheck)v0).check(((com.google.javascript.rhino.Node)v8),(((java.lang.Boolean)v10).booleanValue()));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v2 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v2));
    Object v4 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v1),((com.google.javascript.rhino.jstype.JSTypeRegistry)v3));
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = com.google.javascript.rhino.jstype.JSTypeNative.DATE_FUNCTION_TYPE;
    Object v8 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v6).getNativeObjectType(((com.google.javascript.rhino.jstype.JSTypeNative)v7));
    Object v9 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v10 = ((java.lang.Enum)v9).getDeclaringClass();
    Object v11 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v12 = ((java.lang.Enum)v11).hashCode();
    Object v13 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6),((com.google.javascript.jscomp.CheckLevel)v9),((com.google.javascript.jscomp.CheckLevel)v11));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v2 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v2));
    Object v4 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v1),((com.google.javascript.rhino.jstype.JSTypeRegistry)v3));
    Object v5 = 1;
    Object v6 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v5).intValue()));
    Object v7 = "";
    Object v8 = true;
    Object v9 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.google.javascript.jscomp.Compiler();
    Object v11 = com.google.javascript.jscomp.RhinoErrorReporter.forNewRhino(((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v12 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v6),((java.lang.String)v7),((com.google.javascript.jscomp.parsing.Config)v9),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v11));
    Object v13 = 1;
    Object v14 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v13).intValue()));
    Object v15 = "";
    Object v16 = true;
    Object v17 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v16).booleanValue()));
    Object v18 = new com.google.javascript.jscomp.Compiler();
    Object v19 = com.google.javascript.jscomp.RhinoErrorReporter.forNewRhino(((com.google.javascript.jscomp.AbstractCompiler)v18));
    Object v20 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v14),((java.lang.String)v15),((com.google.javascript.jscomp.parsing.Config)v17),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v19));
    Object v21 = null;
    Object v22 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.jstype.ObjectType)v21));
    Object v23 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v22));
    Object v24 = new com.google.javascript.jscomp.LinkedFlowScope(((com.google.javascript.jscomp.LinkedFlowScope)v23));
    Object v25 = true;
    Object v26 = ((com.google.javascript.jscomp.ReverseAbstractInterpreter)v4).getPreciserScopeKnowingConditionOutcome(((com.google.javascript.rhino.Node)v12),((com.google.javascript.jscomp.FlowScope)v24),(((java.lang.Boolean)v25).booleanValue()));
    Object v27 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v27));
    Object v29 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v30 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v31 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v28),((com.google.javascript.jscomp.CheckLevel)v29),((com.google.javascript.jscomp.CheckLevel)v30));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 1;
    Object v2 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v1).intValue()));
    Object v3 = "";
    Object v4 = true;
    Object v5 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = com.google.javascript.jscomp.RhinoErrorReporter.forNewRhino(((com.google.javascript.jscomp.AbstractCompiler)v6));
    Object v8 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v2),((java.lang.String)v3),((com.google.javascript.jscomp.parsing.Config)v5),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v7));
    Object v9 = ((com.google.javascript.rhino.Node)v8).children();
    Object v10 = true;
    ((com.google.javascript.jscomp.TypeCheck)v0).check(((com.google.javascript.rhino.Node)v8),(((java.lang.Boolean)v10).booleanValue()));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.google.javascript.jscomp.Compiler();
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.FindExportableNodes(((com.google.javascript.jscomp.AbstractCompiler)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v1),((com.google.javascript.jscomp.NodeTraversal.Callback)v3),((com.google.javascript.jscomp.ScopeCreator)v5));
    Object v7 = 1;
    Object v8 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v7).intValue()));
    Object v9 = "";
    Object v10 = true;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = com.google.javascript.jscomp.RhinoErrorReporter.forNewRhino(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v8),((java.lang.String)v9),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v13));
    Object v15 = 1;
    Object v16 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v15).intValue()));
    Object v17 = "";
    Object v18 = true;
    Object v19 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v18).booleanValue()));
    Object v20 = new com.google.javascript.jscomp.Compiler();
    Object v21 = com.google.javascript.jscomp.RhinoErrorReporter.forNewRhino(((com.google.javascript.jscomp.AbstractCompiler)v20));
    Object v22 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v16),((java.lang.String)v17),((com.google.javascript.jscomp.parsing.Config)v19),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v21));
    Object v23 = 1;
    Object v24 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v23).intValue()));
    Object v25 = "";
    Object v26 = true;
    Object v27 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v26).booleanValue()));
    Object v28 = new com.google.javascript.jscomp.Compiler();
    Object v29 = com.google.javascript.jscomp.RhinoErrorReporter.forNewRhino(((com.google.javascript.jscomp.AbstractCompiler)v28));
    Object v30 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v24),((java.lang.String)v25),((com.google.javascript.jscomp.parsing.Config)v27),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v29));
    Object v31 = ((com.google.javascript.rhino.Node)v22).checkTreeEquals(((com.google.javascript.rhino.Node)v30));
    Object v32 = ((com.google.javascript.jscomp.TypeCheck)v0).visitName(((com.google.javascript.jscomp.NodeTraversal)v6),((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.Node)v22));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v2 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v2));
    Object v4 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v1),((com.google.javascript.rhino.jstype.JSTypeRegistry)v3));
    Object v5 = 1;
    Object v6 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v5).intValue()));
    Object v7 = "";
    Object v8 = true;
    Object v9 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.google.javascript.jscomp.Compiler();
    Object v11 = com.google.javascript.jscomp.RhinoErrorReporter.forNewRhino(((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v12 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v6),((java.lang.String)v7),((com.google.javascript.jscomp.parsing.Config)v9),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v11));
    Object v13 = 1;
    Object v14 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v13).intValue()));
    Object v15 = "";
    Object v16 = true;
    Object v17 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v16).booleanValue()));
    Object v18 = new com.google.javascript.jscomp.Compiler();
    Object v19 = com.google.javascript.jscomp.RhinoErrorReporter.forNewRhino(((com.google.javascript.jscomp.AbstractCompiler)v18));
    Object v20 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v14),((java.lang.String)v15),((com.google.javascript.jscomp.parsing.Config)v17),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v19));
    Object v21 = null;
    Object v22 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.jstype.ObjectType)v21));
    Object v23 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v22));
    Object v24 = new com.google.javascript.jscomp.LinkedFlowScope(((com.google.javascript.jscomp.LinkedFlowScope)v23));
    Object v25 = true;
    Object v26 = ((com.google.javascript.jscomp.ReverseAbstractInterpreter)v4).getPreciserScopeKnowingConditionOutcome(((com.google.javascript.rhino.Node)v12),((com.google.javascript.jscomp.FlowScope)v24),(((java.lang.Boolean)v25).booleanValue()));
    Object v27 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v27));
    Object v29 = "";
    Object v30 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v28).isForwardDeclaredType(((java.lang.String)v29));
    Object v31 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v28));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = "y";
    Object v9 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v7).getEachReferenceTypeWithProperty(((java.lang.String)v8));
    Object v10 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v11 = ((java.lang.Enum)v10).hashCode();
    Object v12 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v13 = ((java.lang.Enum)v12).hashCode();
    Object v14 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((com.google.javascript.jscomp.CheckLevel)v10),((com.google.javascript.jscomp.CheckLevel)v12));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 1;
    Object v2 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v1).intValue()));
    Object v3 = "";
    Object v4 = true;
    Object v5 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = com.google.javascript.jscomp.RhinoErrorReporter.forNewRhino(((com.google.javascript.jscomp.AbstractCompiler)v6));
    Object v8 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v2),((java.lang.String)v3),((com.google.javascript.jscomp.parsing.Config)v5),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v7));
    Object v9 = 1;
    Object v10 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v9).intValue()));
    Object v11 = "";
    Object v12 = true;
    Object v13 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new com.google.javascript.jscomp.Compiler();
    Object v15 = com.google.javascript.jscomp.RhinoErrorReporter.forNewRhino(((com.google.javascript.jscomp.AbstractCompiler)v14));
    Object v16 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v10),((java.lang.String)v11),((com.google.javascript.jscomp.parsing.Config)v13),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v15));
    Object v17 = false;
    ((com.google.javascript.rhino.Node)v16).setVarArgs((((java.lang.Boolean)v17).booleanValue()));
    Object v18 = null;
    Object v19 = ((com.google.javascript.jscomp.TypeCheck)v0).processForTesting(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v16));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.google.javascript.jscomp.Compiler();
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.FindExportableNodes(((com.google.javascript.jscomp.AbstractCompiler)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v1),((com.google.javascript.jscomp.NodeTraversal.Callback)v3),((com.google.javascript.jscomp.ScopeCreator)v5));
    Object v7 = 1;
    Object v8 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v7).intValue()));
    Object v9 = "";
    Object v10 = true;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = com.google.javascript.jscomp.RhinoErrorReporter.forNewRhino(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v8),((java.lang.String)v9),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v13));
    Object v15 = 1;
    Object v16 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v15).intValue()));
    Object v17 = "";
    Object v18 = true;
    Object v19 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v18).booleanValue()));
    Object v20 = new com.google.javascript.jscomp.Compiler();
    Object v21 = com.google.javascript.jscomp.RhinoErrorReporter.forNewRhino(((com.google.javascript.jscomp.AbstractCompiler)v20));
    Object v22 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v16),((java.lang.String)v17),((com.google.javascript.jscomp.parsing.Config)v19),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v21));
    Object v23 = ((com.google.javascript.jscomp.TypeCheck)v0).visitName(((com.google.javascript.jscomp.NodeTraversal)v6),((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.Node)v22));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v2 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v2));
    Object v4 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v1),((com.google.javascript.rhino.jstype.JSTypeRegistry)v3));
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = "";
    Object v8 = ",";
    Object v9 = -6;
    Object v10 = 1;
    Object v11 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v6).createNamedType(((java.lang.String)v7),((java.lang.String)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v2 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v2));
    Object v4 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v1),((com.google.javascript.rhino.jstype.JSTypeRegistry)v3));
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = 0;
    Object v8 = new java.util.ArrayList((((java.lang.Integer)v7).intValue()));
    Object v9 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v6).createParametersWithVarArgs(((java.util.List)v8));
    Object v10 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = ((com.google.javascript.jscomp.TypeCheck)v0).reportMissingProperties((((java.lang.Boolean)v1).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v2 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v2));
    Object v4 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v1),((com.google.javascript.rhino.jstype.JSTypeRegistry)v3));
    Object v5 = 1;
    Object v6 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v5).intValue()));
    Object v7 = "";
    Object v8 = true;
    Object v9 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.google.javascript.jscomp.Compiler();
    Object v11 = com.google.javascript.jscomp.RhinoErrorReporter.forNewRhino(((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v12 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v6),((java.lang.String)v7),((com.google.javascript.jscomp.parsing.Config)v9),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v11));
    Object v13 = 1;
    Object v14 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v13).intValue()));
    Object v15 = "";
    Object v16 = true;
    Object v17 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v16).booleanValue()));
    Object v18 = new com.google.javascript.jscomp.Compiler();
    Object v19 = com.google.javascript.jscomp.RhinoErrorReporter.forNewRhino(((com.google.javascript.jscomp.AbstractCompiler)v18));
    Object v20 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v14),((java.lang.String)v15),((com.google.javascript.jscomp.parsing.Config)v17),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v19));
    Object v21 = null;
    Object v22 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.jstype.ObjectType)v21));
    Object v23 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v22));
    Object v24 = new com.google.javascript.jscomp.LinkedFlowScope(((com.google.javascript.jscomp.LinkedFlowScope)v23));
    Object v25 = true;
    Object v26 = ((com.google.javascript.jscomp.ReverseAbstractInterpreter)v4).getPreciserScopeKnowingConditionOutcome(((com.google.javascript.rhino.Node)v12),((com.google.javascript.jscomp.FlowScope)v24),(((java.lang.Boolean)v25).booleanValue()));
    Object v27 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v27));
    Object v29 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v30 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v31 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v28),((com.google.javascript.jscomp.CheckLevel)v29),((com.google.javascript.jscomp.CheckLevel)v30));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = 1;
    Object v7 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v6).intValue()));
    Object v8 = "";
    Object v9 = true;
    Object v10 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = new com.google.javascript.jscomp.Compiler();
    Object v12 = com.google.javascript.jscomp.RhinoErrorReporter.forNewRhino(((com.google.javascript.jscomp.AbstractCompiler)v11));
    Object v13 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v7),((java.lang.String)v8),((com.google.javascript.jscomp.parsing.Config)v10),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v12));
    Object v14 = 1;
    Object v15 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v14).intValue()));
    Object v16 = "";
    Object v17 = true;
    Object v18 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v17).booleanValue()));
    Object v19 = new com.google.javascript.jscomp.Compiler();
    Object v20 = com.google.javascript.jscomp.RhinoErrorReporter.forNewRhino(((com.google.javascript.jscomp.AbstractCompiler)v19));
    Object v21 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v15),((java.lang.String)v16),((com.google.javascript.jscomp.parsing.Config)v18),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v20));
    Object v22 = null;
    Object v23 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v21),((com.google.javascript.rhino.jstype.ObjectType)v22));
    Object v24 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v23));
    Object v25 = new com.google.javascript.jscomp.LinkedFlowScope(((com.google.javascript.jscomp.LinkedFlowScope)v24));
    Object v26 = true;
    Object v27 = ((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5).getPreciserScopeKnowingConditionOutcome(((com.google.javascript.rhino.Node)v13),((com.google.javascript.jscomp.FlowScope)v25),(((java.lang.Boolean)v26).booleanValue()));
    Object v28 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v29 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v28));
    Object v30 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v31 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v32 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v29),((com.google.javascript.jscomp.CheckLevel)v30),((com.google.javascript.jscomp.CheckLevel)v31));
    org.junit.Assert.assertNotNull(v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = 1;
    Object v7 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v6).intValue()));
    Object v8 = "";
    Object v9 = true;
    Object v10 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = new com.google.javascript.jscomp.Compiler();
    Object v12 = com.google.javascript.jscomp.RhinoErrorReporter.forNewRhino(((com.google.javascript.jscomp.AbstractCompiler)v11));
    Object v13 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v7),((java.lang.String)v8),((com.google.javascript.jscomp.parsing.Config)v10),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v12));
    Object v14 = 1;
    Object v15 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v14).intValue()));
    Object v16 = "";
    Object v17 = true;
    Object v18 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v17).booleanValue()));
    Object v19 = new com.google.javascript.jscomp.Compiler();
    Object v20 = com.google.javascript.jscomp.RhinoErrorReporter.forNewRhino(((com.google.javascript.jscomp.AbstractCompiler)v19));
    Object v21 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v15),((java.lang.String)v16),((com.google.javascript.jscomp.parsing.Config)v18),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v20));
    Object v22 = null;
    Object v23 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v21),((com.google.javascript.rhino.jstype.ObjectType)v22));
    Object v24 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v23));
    Object v25 = new com.google.javascript.jscomp.LinkedFlowScope(((com.google.javascript.jscomp.LinkedFlowScope)v24));
    Object v26 = true;
    Object v27 = ((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5).getPreciserScopeKnowingConditionOutcome(((com.google.javascript.rhino.Node)v13),((com.google.javascript.jscomp.FlowScope)v25),(((java.lang.Boolean)v26).booleanValue()));
    Object v28 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v29 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v28));
    Object v30 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v31 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v32 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v29),((com.google.javascript.jscomp.CheckLevel)v30),((com.google.javascript.jscomp.CheckLevel)v31));
    Object v33 = ((com.google.javascript.jscomp.TypeCheck)v32).getTypedPercent();
    org.junit.Assert.assertEquals((Object)(0.0D), v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v2 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v2));
    Object v4 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v1),((com.google.javascript.rhino.jstype.JSTypeRegistry)v3));
    Object v5 = 1;
    Object v6 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v5).intValue()));
    Object v7 = "";
    Object v8 = true;
    Object v9 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.google.javascript.jscomp.Compiler();
    Object v11 = com.google.javascript.jscomp.RhinoErrorReporter.forNewRhino(((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v12 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v6),((java.lang.String)v7),((com.google.javascript.jscomp.parsing.Config)v9),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v11));
    Object v13 = 1;
    Object v14 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v13).intValue()));
    Object v15 = "";
    Object v16 = true;
    Object v17 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v16).booleanValue()));
    Object v18 = new com.google.javascript.jscomp.Compiler();
    Object v19 = com.google.javascript.jscomp.RhinoErrorReporter.forNewRhino(((com.google.javascript.jscomp.AbstractCompiler)v18));
    Object v20 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v14),((java.lang.String)v15),((com.google.javascript.jscomp.parsing.Config)v17),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v19));
    Object v21 = null;
    Object v22 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.jstype.ObjectType)v21));
    Object v23 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v22));
    Object v24 = new com.google.javascript.jscomp.LinkedFlowScope(((com.google.javascript.jscomp.LinkedFlowScope)v23));
    Object v25 = false;
    Object v26 = ((com.google.javascript.jscomp.ReverseAbstractInterpreter)v4).getPreciserScopeKnowingConditionOutcome(((com.google.javascript.rhino.Node)v12),((com.google.javascript.jscomp.FlowScope)v24),(((java.lang.Boolean)v25).booleanValue()));
    Object v27 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v27));
    Object v29 = "";
    ((com.google.javascript.rhino.jstype.JSTypeRegistry)v28).identifyNonNullableName(((java.lang.String)v29));
    Object v30 = null;
    Object v31 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v32 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v33 = ((java.lang.Enum)v32).hashCode();
    Object v34 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v28),((com.google.javascript.jscomp.CheckLevel)v31),((com.google.javascript.jscomp.CheckLevel)v32));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v2 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v2));
    Object v4 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v1),((com.google.javascript.rhino.jstype.JSTypeRegistry)v3));
    Object v5 = 1;
    Object v6 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v5).intValue()));
    Object v7 = "";
    Object v8 = true;
    Object v9 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.google.javascript.jscomp.Compiler();
    Object v11 = com.google.javascript.jscomp.RhinoErrorReporter.forNewRhino(((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v12 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v6),((java.lang.String)v7),((com.google.javascript.jscomp.parsing.Config)v9),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v11));
    Object v13 = 1;
    Object v14 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v13).intValue()));
    Object v15 = "";
    Object v16 = true;
    Object v17 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v16).booleanValue()));
    Object v18 = new com.google.javascript.jscomp.Compiler();
    Object v19 = com.google.javascript.jscomp.RhinoErrorReporter.forNewRhino(((com.google.javascript.jscomp.AbstractCompiler)v18));
    Object v20 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v14),((java.lang.String)v15),((com.google.javascript.jscomp.parsing.Config)v17),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v19));
    Object v21 = null;
    Object v22 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.jstype.ObjectType)v21));
    Object v23 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v22));
    Object v24 = new com.google.javascript.jscomp.LinkedFlowScope(((com.google.javascript.jscomp.LinkedFlowScope)v23));
    Object v25 = false;
    Object v26 = ((com.google.javascript.jscomp.ReverseAbstractInterpreter)v4).getPreciserScopeKnowingConditionOutcome(((com.google.javascript.rhino.Node)v12),((com.google.javascript.jscomp.FlowScope)v24),(((java.lang.Boolean)v25).booleanValue()));
    Object v27 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v27));
    Object v29 = true;
    ((com.google.javascript.rhino.jstype.JSTypeRegistry)v28).setLastGeneration((((java.lang.Boolean)v29).booleanValue()));
    Object v30 = null;
    Object v31 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v32 = ((java.lang.Enum)v31).getDeclaringClass();
    Object v33 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v34 = ((java.lang.Enum)v33).getDeclaringClass();
    Object v35 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v28),((com.google.javascript.jscomp.CheckLevel)v31),((com.google.javascript.jscomp.CheckLevel)v33));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = 1;
    Object v7 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v6).intValue()));
    Object v8 = "";
    Object v9 = true;
    Object v10 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = new com.google.javascript.jscomp.Compiler();
    Object v12 = com.google.javascript.jscomp.RhinoErrorReporter.forNewRhino(((com.google.javascript.jscomp.AbstractCompiler)v11));
    Object v13 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v7),((java.lang.String)v8),((com.google.javascript.jscomp.parsing.Config)v10),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v12));
    Object v14 = 1;
    Object v15 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v14).intValue()));
    Object v16 = "";
    Object v17 = true;
    Object v18 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v17).booleanValue()));
    Object v19 = new com.google.javascript.jscomp.Compiler();
    Object v20 = com.google.javascript.jscomp.RhinoErrorReporter.forNewRhino(((com.google.javascript.jscomp.AbstractCompiler)v19));
    Object v21 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v15),((java.lang.String)v16),((com.google.javascript.jscomp.parsing.Config)v18),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v20));
    Object v22 = null;
    Object v23 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v21),((com.google.javascript.rhino.jstype.ObjectType)v22));
    Object v24 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v23));
    Object v25 = new com.google.javascript.jscomp.LinkedFlowScope(((com.google.javascript.jscomp.LinkedFlowScope)v24));
    Object v26 = true;
    Object v27 = ((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5).getPreciserScopeKnowingConditionOutcome(((com.google.javascript.rhino.Node)v13),((com.google.javascript.jscomp.FlowScope)v25),(((java.lang.Boolean)v26).booleanValue()));
    Object v28 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v29 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v28));
    Object v30 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v31 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v32 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v29),((com.google.javascript.jscomp.CheckLevel)v30),((com.google.javascript.jscomp.CheckLevel)v31));
    Object v33 = false;
    Object v34 = ((com.google.javascript.jscomp.TypeCheck)v32).reportMissingProperties((((java.lang.Boolean)v33).booleanValue()));
    org.junit.Assert.assertNotNull(v34);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = 1;
    Object v7 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v6).intValue()));
    Object v8 = "";
    Object v9 = true;
    Object v10 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = new com.google.javascript.jscomp.Compiler();
    Object v12 = com.google.javascript.jscomp.RhinoErrorReporter.forNewRhino(((com.google.javascript.jscomp.AbstractCompiler)v11));
    Object v13 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v7),((java.lang.String)v8),((com.google.javascript.jscomp.parsing.Config)v10),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v12));
    Object v14 = 1;
    Object v15 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v14).intValue()));
    Object v16 = "";
    Object v17 = true;
    Object v18 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v17).booleanValue()));
    Object v19 = new com.google.javascript.jscomp.Compiler();
    Object v20 = com.google.javascript.jscomp.RhinoErrorReporter.forNewRhino(((com.google.javascript.jscomp.AbstractCompiler)v19));
    Object v21 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v15),((java.lang.String)v16),((com.google.javascript.jscomp.parsing.Config)v18),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v20));
    Object v22 = null;
    Object v23 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v21),((com.google.javascript.rhino.jstype.ObjectType)v22));
    Object v24 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v23));
    Object v25 = new com.google.javascript.jscomp.LinkedFlowScope(((com.google.javascript.jscomp.LinkedFlowScope)v24));
    Object v26 = true;
    Object v27 = ((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5).getPreciserScopeKnowingConditionOutcome(((com.google.javascript.rhino.Node)v13),((com.google.javascript.jscomp.FlowScope)v25),(((java.lang.Boolean)v26).booleanValue()));
    Object v28 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v29 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v28));
    Object v30 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v31 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v32 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v29),((com.google.javascript.jscomp.CheckLevel)v30),((com.google.javascript.jscomp.CheckLevel)v31));
    Object v33 = false;
    Object v34 = ((com.google.javascript.jscomp.TypeCheck)v32).reportMissingProperties((((java.lang.Boolean)v33).booleanValue()));
    Object v35 = ((com.google.javascript.jscomp.TypeCheck)v34).getTypedPercent();
    org.junit.Assert.assertEquals((Object)(0.0D), v35);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v2 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v2));
    Object v4 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v1),((com.google.javascript.rhino.jstype.JSTypeRegistry)v3));
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.rhino.jstype.JSType[]{};
    Object v8 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v6).createUnionType(((com.google.javascript.rhino.jstype.JSType[])v7));
    Object v9 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = 1;
    Object v7 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v6).intValue()));
    Object v8 = "";
    Object v9 = true;
    Object v10 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = new com.google.javascript.jscomp.Compiler();
    Object v12 = com.google.javascript.jscomp.RhinoErrorReporter.forNewRhino(((com.google.javascript.jscomp.AbstractCompiler)v11));
    Object v13 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v7),((java.lang.String)v8),((com.google.javascript.jscomp.parsing.Config)v10),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v12));
    Object v14 = 1;
    Object v15 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v14).intValue()));
    Object v16 = "";
    Object v17 = true;
    Object v18 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v17).booleanValue()));
    Object v19 = new com.google.javascript.jscomp.Compiler();
    Object v20 = com.google.javascript.jscomp.RhinoErrorReporter.forNewRhino(((com.google.javascript.jscomp.AbstractCompiler)v19));
    Object v21 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v15),((java.lang.String)v16),((com.google.javascript.jscomp.parsing.Config)v18),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v20));
    Object v22 = null;
    Object v23 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v21),((com.google.javascript.rhino.jstype.ObjectType)v22));
    Object v24 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v23));
    Object v25 = new com.google.javascript.jscomp.LinkedFlowScope(((com.google.javascript.jscomp.LinkedFlowScope)v24));
    Object v26 = true;
    Object v27 = ((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5).getPreciserScopeKnowingConditionOutcome(((com.google.javascript.rhino.Node)v13),((com.google.javascript.jscomp.FlowScope)v25),(((java.lang.Boolean)v26).booleanValue()));
    Object v28 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v29 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v28));
    Object v30 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v31 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v32 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v29),((com.google.javascript.jscomp.CheckLevel)v30),((com.google.javascript.jscomp.CheckLevel)v31));
    Object v33 = true;
    Object v34 = ((com.google.javascript.jscomp.TypeCheck)v32).reportMissingProperties((((java.lang.Boolean)v33).booleanValue()));
    org.junit.Assert.assertNotNull(v34);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v2 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v2));
    Object v4 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v1),((com.google.javascript.rhino.jstype.JSTypeRegistry)v3));
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = 1;
    Object v8 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v7).intValue()));
    Object v9 = "";
    Object v10 = true;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = com.google.javascript.jscomp.RhinoErrorReporter.forNewRhino(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v8),((java.lang.String)v9),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v13));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.jstype.ObjectType)v15));
    Object v17 = "S";
    Object v18 = ((com.google.javascript.jscomp.Scope)v16).getVar(((java.lang.String)v17));
    Object v19 = new com.google.javascript.jscomp.Compiler();
    Object v20 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v19));
    Object v21 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v22 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v23 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6),((com.google.javascript.jscomp.Scope)v16),((com.google.javascript.jscomp.ScopeCreator)v20),((com.google.javascript.jscomp.CheckLevel)v21),((com.google.javascript.jscomp.CheckLevel)v22));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v2 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v2));
    Object v4 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v1),((com.google.javascript.rhino.jstype.JSTypeRegistry)v3));
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v8 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v9 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6),((com.google.javascript.jscomp.CheckLevel)v7),((com.google.javascript.jscomp.CheckLevel)v8));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v2 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v2));
    Object v4 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v1),((com.google.javascript.rhino.jstype.JSTypeRegistry)v3));
    Object v5 = 1;
    Object v6 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v5).intValue()));
    Object v7 = "";
    Object v8 = true;
    Object v9 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.google.javascript.jscomp.Compiler();
    Object v11 = com.google.javascript.jscomp.RhinoErrorReporter.forNewRhino(((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v12 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v6),((java.lang.String)v7),((com.google.javascript.jscomp.parsing.Config)v9),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v11));
    Object v13 = 1;
    Object v14 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v13).intValue()));
    Object v15 = "";
    Object v16 = true;
    Object v17 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v16).booleanValue()));
    Object v18 = new com.google.javascript.jscomp.Compiler();
    Object v19 = com.google.javascript.jscomp.RhinoErrorReporter.forNewRhino(((com.google.javascript.jscomp.AbstractCompiler)v18));
    Object v20 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v14),((java.lang.String)v15),((com.google.javascript.jscomp.parsing.Config)v17),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v19));
    Object v21 = null;
    Object v22 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.jstype.ObjectType)v21));
    Object v23 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v22));
    Object v24 = new com.google.javascript.jscomp.LinkedFlowScope(((com.google.javascript.jscomp.LinkedFlowScope)v23));
    Object v25 = false;
    Object v26 = ((com.google.javascript.jscomp.ReverseAbstractInterpreter)v4).getPreciserScopeKnowingConditionOutcome(((com.google.javascript.rhino.Node)v12),((com.google.javascript.jscomp.FlowScope)v24),(((java.lang.Boolean)v25).booleanValue()));
    Object v27 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v27));
    Object v29 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v30 = ((java.lang.Enum)v29).hashCode();
    Object v31 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v32 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v28),((com.google.javascript.jscomp.CheckLevel)v29),((com.google.javascript.jscomp.CheckLevel)v31));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = 1;
    Object v7 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v6).intValue()));
    Object v8 = "";
    Object v9 = true;
    Object v10 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = new com.google.javascript.jscomp.Compiler();
    Object v12 = com.google.javascript.jscomp.RhinoErrorReporter.forNewRhino(((com.google.javascript.jscomp.AbstractCompiler)v11));
    Object v13 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v7),((java.lang.String)v8),((com.google.javascript.jscomp.parsing.Config)v10),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v12));
    Object v14 = 1;
    Object v15 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v14).intValue()));
    Object v16 = "";
    Object v17 = true;
    Object v18 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v17).booleanValue()));
    Object v19 = new com.google.javascript.jscomp.Compiler();
    Object v20 = com.google.javascript.jscomp.RhinoErrorReporter.forNewRhino(((com.google.javascript.jscomp.AbstractCompiler)v19));
    Object v21 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v15),((java.lang.String)v16),((com.google.javascript.jscomp.parsing.Config)v18),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v20));
    Object v22 = null;
    Object v23 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v21),((com.google.javascript.rhino.jstype.ObjectType)v22));
    Object v24 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v23));
    Object v25 = new com.google.javascript.jscomp.LinkedFlowScope(((com.google.javascript.jscomp.LinkedFlowScope)v24));
    Object v26 = true;
    Object v27 = ((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5).getPreciserScopeKnowingConditionOutcome(((com.google.javascript.rhino.Node)v13),((com.google.javascript.jscomp.FlowScope)v25),(((java.lang.Boolean)v26).booleanValue()));
    Object v28 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v29 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v28));
    Object v30 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v31 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v32 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v29),((com.google.javascript.jscomp.CheckLevel)v30),((com.google.javascript.jscomp.CheckLevel)v31));
    Object v33 = true;
    Object v34 = ((com.google.javascript.jscomp.TypeCheck)v32).reportMissingProperties((((java.lang.Boolean)v33).booleanValue()));
    Object v35 = ((com.google.javascript.jscomp.TypeCheck)v34).getTypedPercent();
    org.junit.Assert.assertEquals((Object)(0.0D), v35);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v2 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v2));
    Object v4 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v1),((com.google.javascript.rhino.jstype.JSTypeRegistry)v3));
    Object v5 = 1;
    Object v6 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v5).intValue()));
    Object v7 = "";
    Object v8 = true;
    Object v9 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.google.javascript.jscomp.Compiler();
    Object v11 = com.google.javascript.jscomp.RhinoErrorReporter.forNewRhino(((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v12 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v6),((java.lang.String)v7),((com.google.javascript.jscomp.parsing.Config)v9),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v11));
    Object v13 = 1;
    Object v14 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v13).intValue()));
    Object v15 = "";
    Object v16 = true;
    Object v17 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v16).booleanValue()));
    Object v18 = new com.google.javascript.jscomp.Compiler();
    Object v19 = com.google.javascript.jscomp.RhinoErrorReporter.forNewRhino(((com.google.javascript.jscomp.AbstractCompiler)v18));
    Object v20 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v14),((java.lang.String)v15),((com.google.javascript.jscomp.parsing.Config)v17),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v19));
    Object v21 = null;
    Object v22 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.jstype.ObjectType)v21));
    Object v23 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v22));
    Object v24 = new com.google.javascript.jscomp.LinkedFlowScope(((com.google.javascript.jscomp.LinkedFlowScope)v23));
    Object v25 = false;
    Object v26 = ((com.google.javascript.jscomp.ReverseAbstractInterpreter)v4).getPreciserScopeKnowingConditionOutcome(((com.google.javascript.rhino.Node)v12),((com.google.javascript.jscomp.FlowScope)v24),(((java.lang.Boolean)v25).booleanValue()));
    Object v27 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v27));
    Object v29 = new com.google.javascript.rhino.jstype.JSType[]{};
    Object v30 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v28).createParametersWithVarArgs(((com.google.javascript.rhino.jstype.JSType[])v29));
    Object v31 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v32 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v33 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v28),((com.google.javascript.jscomp.CheckLevel)v31),((com.google.javascript.jscomp.CheckLevel)v32));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v2 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v2));
    Object v4 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v1),((com.google.javascript.rhino.jstype.JSTypeRegistry)v3));
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    ((com.google.javascript.rhino.jstype.JSTypeRegistry)v6).clearNamedTypes();
    Object v7 = null;
    Object v8 = 1;
    Object v9 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v8).intValue()));
    Object v10 = "";
    Object v11 = true;
    Object v12 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.google.javascript.jscomp.Compiler();
    Object v14 = com.google.javascript.jscomp.RhinoErrorReporter.forNewRhino(((com.google.javascript.jscomp.AbstractCompiler)v13));
    Object v15 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v9),((java.lang.String)v10),((com.google.javascript.jscomp.parsing.Config)v12),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v14));
    Object v16 = null;
    Object v17 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v15),((com.google.javascript.rhino.jstype.ObjectType)v16));
    Object v18 = new com.google.javascript.jscomp.Compiler();
    Object v19 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v18));
    Object v20 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v21 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v22 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6),((com.google.javascript.jscomp.Scope)v17),((com.google.javascript.jscomp.ScopeCreator)v19),((com.google.javascript.jscomp.CheckLevel)v20),((com.google.javascript.jscomp.CheckLevel)v21));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = 1;
    Object v7 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v6).intValue()));
    Object v8 = "";
    Object v9 = true;
    Object v10 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = new com.google.javascript.jscomp.Compiler();
    Object v12 = com.google.javascript.jscomp.RhinoErrorReporter.forNewRhino(((com.google.javascript.jscomp.AbstractCompiler)v11));
    Object v13 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v7),((java.lang.String)v8),((com.google.javascript.jscomp.parsing.Config)v10),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v12));
    Object v14 = 1;
    Object v15 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v14).intValue()));
    Object v16 = "";
    Object v17 = true;
    Object v18 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v17).booleanValue()));
    Object v19 = new com.google.javascript.jscomp.Compiler();
    Object v20 = com.google.javascript.jscomp.RhinoErrorReporter.forNewRhino(((com.google.javascript.jscomp.AbstractCompiler)v19));
    Object v21 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v15),((java.lang.String)v16),((com.google.javascript.jscomp.parsing.Config)v18),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v20));
    Object v22 = null;
    Object v23 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v21),((com.google.javascript.rhino.jstype.ObjectType)v22));
    Object v24 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v23));
    Object v25 = new com.google.javascript.jscomp.LinkedFlowScope(((com.google.javascript.jscomp.LinkedFlowScope)v24));
    Object v26 = true;
    Object v27 = ((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5).getPreciserScopeKnowingConditionOutcome(((com.google.javascript.rhino.Node)v13),((com.google.javascript.jscomp.FlowScope)v25),(((java.lang.Boolean)v26).booleanValue()));
    Object v28 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v29 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v28));
    Object v30 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v31 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v32 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v29),((com.google.javascript.jscomp.CheckLevel)v30),((com.google.javascript.jscomp.CheckLevel)v31));
    Object v33 = true;
    Object v34 = ((com.google.javascript.jscomp.TypeCheck)v32).reportMissingProperties((((java.lang.Boolean)v33).booleanValue()));
    Object v35 = false;
    Object v36 = ((com.google.javascript.jscomp.TypeCheck)v34).reportMissingProperties((((java.lang.Boolean)v35).booleanValue()));
    org.junit.Assert.assertNotNull(v36);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = 1;
    Object v7 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v6).intValue()));
    Object v8 = "";
    Object v9 = true;
    Object v10 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = new com.google.javascript.jscomp.Compiler();
    Object v12 = com.google.javascript.jscomp.RhinoErrorReporter.forNewRhino(((com.google.javascript.jscomp.AbstractCompiler)v11));
    Object v13 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v7),((java.lang.String)v8),((com.google.javascript.jscomp.parsing.Config)v10),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v12));
    Object v14 = 1;
    Object v15 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v14).intValue()));
    Object v16 = "";
    Object v17 = true;
    Object v18 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v17).booleanValue()));
    Object v19 = new com.google.javascript.jscomp.Compiler();
    Object v20 = com.google.javascript.jscomp.RhinoErrorReporter.forNewRhino(((com.google.javascript.jscomp.AbstractCompiler)v19));
    Object v21 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v15),((java.lang.String)v16),((com.google.javascript.jscomp.parsing.Config)v18),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v20));
    Object v22 = null;
    Object v23 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v21),((com.google.javascript.rhino.jstype.ObjectType)v22));
    Object v24 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v23));
    Object v25 = new com.google.javascript.jscomp.LinkedFlowScope(((com.google.javascript.jscomp.LinkedFlowScope)v24));
    Object v26 = true;
    Object v27 = ((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5).getPreciserScopeKnowingConditionOutcome(((com.google.javascript.rhino.Node)v13),((com.google.javascript.jscomp.FlowScope)v25),(((java.lang.Boolean)v26).booleanValue()));
    Object v28 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v29 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v28));
    Object v30 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v31 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v32 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v29),((com.google.javascript.jscomp.CheckLevel)v30),((com.google.javascript.jscomp.CheckLevel)v31));
    Object v33 = true;
    Object v34 = ((com.google.javascript.jscomp.TypeCheck)v32).reportMissingProperties((((java.lang.Boolean)v33).booleanValue()));
    Object v35 = false;
    Object v36 = ((com.google.javascript.jscomp.TypeCheck)v34).reportMissingProperties((((java.lang.Boolean)v35).booleanValue()));
    Object v37 = ((com.google.javascript.jscomp.TypeCheck)v36).getTypedPercent();
    org.junit.Assert.assertEquals((Object)(0.0D), v37);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v2 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v2));
    Object v4 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v1),((com.google.javascript.rhino.jstype.JSTypeRegistry)v3));
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v8 = ((java.lang.Enum)v7).getDeclaringClass();
    Object v9 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v10 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6),((com.google.javascript.jscomp.CheckLevel)v7),((com.google.javascript.jscomp.CheckLevel)v9));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTopScope();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v2 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v2));
    Object v4 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v1),((com.google.javascript.rhino.jstype.JSTypeRegistry)v3));
    Object v5 = 1;
    Object v6 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v5).intValue()));
    Object v7 = "";
    Object v8 = true;
    Object v9 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.google.javascript.jscomp.Compiler();
    Object v11 = com.google.javascript.jscomp.RhinoErrorReporter.forNewRhino(((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v12 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v6),((java.lang.String)v7),((com.google.javascript.jscomp.parsing.Config)v9),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v11));
    Object v13 = 1;
    Object v14 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v13).intValue()));
    Object v15 = "";
    Object v16 = true;
    Object v17 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v16).booleanValue()));
    Object v18 = new com.google.javascript.jscomp.Compiler();
    Object v19 = com.google.javascript.jscomp.RhinoErrorReporter.forNewRhino(((com.google.javascript.jscomp.AbstractCompiler)v18));
    Object v20 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v14),((java.lang.String)v15),((com.google.javascript.jscomp.parsing.Config)v17),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v19));
    Object v21 = null;
    Object v22 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.jstype.ObjectType)v21));
    Object v23 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v22));
    Object v24 = new com.google.javascript.jscomp.LinkedFlowScope(((com.google.javascript.jscomp.LinkedFlowScope)v23));
    Object v25 = true;
    Object v26 = ((com.google.javascript.jscomp.ReverseAbstractInterpreter)v4).getPreciserScopeKnowingConditionOutcome(((com.google.javascript.rhino.Node)v12),((com.google.javascript.jscomp.FlowScope)v24),(((java.lang.Boolean)v25).booleanValue()));
    Object v27 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v27));
    Object v29 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v30 = ((java.lang.Enum)v29).hashCode();
    Object v31 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v32 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v28),((com.google.javascript.jscomp.CheckLevel)v29),((com.google.javascript.jscomp.CheckLevel)v31));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = 1;
    Object v7 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v6).intValue()));
    Object v8 = "";
    Object v9 = true;
    Object v10 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = new com.google.javascript.jscomp.Compiler();
    Object v12 = com.google.javascript.jscomp.RhinoErrorReporter.forNewRhino(((com.google.javascript.jscomp.AbstractCompiler)v11));
    Object v13 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v7),((java.lang.String)v8),((com.google.javascript.jscomp.parsing.Config)v10),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v12));
    Object v14 = 1;
    Object v15 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v14).intValue()));
    Object v16 = "";
    Object v17 = true;
    Object v18 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v17).booleanValue()));
    Object v19 = new com.google.javascript.jscomp.Compiler();
    Object v20 = com.google.javascript.jscomp.RhinoErrorReporter.forNewRhino(((com.google.javascript.jscomp.AbstractCompiler)v19));
    Object v21 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v15),((java.lang.String)v16),((com.google.javascript.jscomp.parsing.Config)v18),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v20));
    Object v22 = null;
    Object v23 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v21),((com.google.javascript.rhino.jstype.ObjectType)v22));
    Object v24 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v23));
    Object v25 = new com.google.javascript.jscomp.LinkedFlowScope(((com.google.javascript.jscomp.LinkedFlowScope)v24));
    Object v26 = true;
    Object v27 = ((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5).getPreciserScopeKnowingConditionOutcome(((com.google.javascript.rhino.Node)v13),((com.google.javascript.jscomp.FlowScope)v25),(((java.lang.Boolean)v26).booleanValue()));
    Object v28 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v29 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v28));
    Object v30 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v31 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v32 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v29),((com.google.javascript.jscomp.CheckLevel)v30),((com.google.javascript.jscomp.CheckLevel)v31));
    Object v33 = true;
    Object v34 = ((com.google.javascript.jscomp.TypeCheck)v32).reportMissingProperties((((java.lang.Boolean)v33).booleanValue()));
    Object v35 = false;
    Object v36 = ((com.google.javascript.jscomp.TypeCheck)v34).reportMissingProperties((((java.lang.Boolean)v35).booleanValue()));
    Object v37 = true;
    Object v38 = ((com.google.javascript.jscomp.TypeCheck)v36).reportMissingProperties((((java.lang.Boolean)v37).booleanValue()));
    org.junit.Assert.assertNotNull(v38);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = -27;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v8));
    Object v10 = 1;
    Object v11 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v10).intValue()));
    Object v12 = "";
    Object v13 = true;
    Object v14 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v13).booleanValue()));
    Object v15 = new com.google.javascript.jscomp.Compiler();
    Object v16 = com.google.javascript.jscomp.RhinoErrorReporter.forNewRhino(((com.google.javascript.jscomp.AbstractCompiler)v15));
    Object v17 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v11),((java.lang.String)v12),((com.google.javascript.jscomp.parsing.Config)v14),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v16));
    Object v18 = null;
    Object v19 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v17),((com.google.javascript.rhino.jstype.ObjectType)v18));
    Object v20 = new com.google.javascript.jscomp.Compiler();
    Object v21 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v20));
    Object v22 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v23 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v24 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v7),((com.google.javascript.rhino.jstype.JSTypeRegistry)v9),((com.google.javascript.jscomp.Scope)v19),((com.google.javascript.jscomp.ScopeCreator)v21),((com.google.javascript.jscomp.CheckLevel)v22),((com.google.javascript.jscomp.CheckLevel)v23));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = 1;
    Object v7 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v6).intValue()));
    Object v8 = "";
    Object v9 = true;
    Object v10 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = new com.google.javascript.jscomp.Compiler();
    Object v12 = com.google.javascript.jscomp.RhinoErrorReporter.forNewRhino(((com.google.javascript.jscomp.AbstractCompiler)v11));
    Object v13 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v7),((java.lang.String)v8),((com.google.javascript.jscomp.parsing.Config)v10),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v12));
    Object v14 = 1;
    Object v15 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v14).intValue()));
    Object v16 = "";
    Object v17 = true;
    Object v18 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v17).booleanValue()));
    Object v19 = new com.google.javascript.jscomp.Compiler();
    Object v20 = com.google.javascript.jscomp.RhinoErrorReporter.forNewRhino(((com.google.javascript.jscomp.AbstractCompiler)v19));
    Object v21 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v15),((java.lang.String)v16),((com.google.javascript.jscomp.parsing.Config)v18),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v20));
    Object v22 = null;
    Object v23 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v21),((com.google.javascript.rhino.jstype.ObjectType)v22));
    Object v24 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v23));
    Object v25 = new com.google.javascript.jscomp.LinkedFlowScope(((com.google.javascript.jscomp.LinkedFlowScope)v24));
    Object v26 = true;
    Object v27 = ((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5).getPreciserScopeKnowingConditionOutcome(((com.google.javascript.rhino.Node)v13),((com.google.javascript.jscomp.FlowScope)v25),(((java.lang.Boolean)v26).booleanValue()));
    Object v28 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v29 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v28));
    Object v30 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v31 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v32 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v29),((com.google.javascript.jscomp.CheckLevel)v30),((com.google.javascript.jscomp.CheckLevel)v31));
    Object v33 = true;
    Object v34 = ((com.google.javascript.jscomp.TypeCheck)v32).reportMissingProperties((((java.lang.Boolean)v33).booleanValue()));
    Object v35 = false;
    Object v36 = ((com.google.javascript.jscomp.TypeCheck)v34).reportMissingProperties((((java.lang.Boolean)v35).booleanValue()));
    Object v37 = true;
    Object v38 = ((com.google.javascript.jscomp.TypeCheck)v36).reportMissingProperties((((java.lang.Boolean)v37).booleanValue()));
    Object v39 = ((com.google.javascript.jscomp.TypeCheck)v38).getTypedPercent();
    org.junit.Assert.assertEquals((Object)(0.0D), v39);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v2 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v2));
    Object v4 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v1),((com.google.javascript.rhino.jstype.JSTypeRegistry)v3));
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = 1;
    Object v8 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v7).intValue()));
    Object v9 = "";
    Object v10 = true;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = com.google.javascript.jscomp.RhinoErrorReporter.forNewRhino(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v8),((java.lang.String)v9),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v13));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.jstype.ObjectType)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler();
    Object v18 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v17));
    Object v19 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v20 = ((java.lang.Enum)v19).getDeclaringClass();
    Object v21 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v22 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6),((com.google.javascript.jscomp.Scope)v16),((com.google.javascript.jscomp.ScopeCreator)v18),((com.google.javascript.jscomp.CheckLevel)v19),((com.google.javascript.jscomp.CheckLevel)v21));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v2 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v2));
    Object v4 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v1),((com.google.javascript.rhino.jstype.JSTypeRegistry)v3));
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = ":";
    Object v8 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v6).getEachReferenceTypeWithProperty(((java.lang.String)v7));
    Object v9 = 1;
    Object v10 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v9).intValue()));
    Object v11 = "";
    Object v12 = true;
    Object v13 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new com.google.javascript.jscomp.Compiler();
    Object v15 = com.google.javascript.jscomp.RhinoErrorReporter.forNewRhino(((com.google.javascript.jscomp.AbstractCompiler)v14));
    Object v16 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v10),((java.lang.String)v11),((com.google.javascript.jscomp.parsing.Config)v13),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v15));
    Object v17 = null;
    Object v18 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v16),((com.google.javascript.rhino.jstype.ObjectType)v17));
    Object v19 = ((com.google.javascript.jscomp.Scope)v18).getVarCount();
    Object v20 = new com.google.javascript.jscomp.Compiler();
    Object v21 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v20));
    Object v22 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v23 = ((java.lang.Enum)v22).getDeclaringClass();
    Object v24 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v25 = ((java.lang.Enum)v24).hashCode();
    Object v26 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6),((com.google.javascript.jscomp.Scope)v18),((com.google.javascript.jscomp.ScopeCreator)v21),((com.google.javascript.jscomp.CheckLevel)v22),((com.google.javascript.jscomp.CheckLevel)v24));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v2 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v2));
    Object v4 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v1),((com.google.javascript.rhino.jstype.JSTypeRegistry)v3));
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = 1;
    Object v8 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v7).intValue()));
    Object v9 = "";
    Object v10 = true;
    Object v11 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = com.google.javascript.jscomp.RhinoErrorReporter.forNewRhino(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v8),((java.lang.String)v9),((com.google.javascript.jscomp.parsing.Config)v11),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v13));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.jstype.ObjectType)v15));
    Object v17 = "";
    Object v18 = ((com.google.javascript.jscomp.Scope)v16).getSlot(((java.lang.String)v17));
    Object v19 = new com.google.javascript.jscomp.Compiler();
    Object v20 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v19));
    Object v21 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v22 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v23 = ((java.lang.Enum)v22).getDeclaringClass();
    Object v24 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6),((com.google.javascript.jscomp.Scope)v16),((com.google.javascript.jscomp.ScopeCreator)v20),((com.google.javascript.jscomp.CheckLevel)v21),((com.google.javascript.jscomp.CheckLevel)v22));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = 1;
    Object v7 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v6).intValue()));
    Object v8 = "";
    Object v9 = true;
    Object v10 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = new com.google.javascript.jscomp.Compiler();
    Object v12 = com.google.javascript.jscomp.RhinoErrorReporter.forNewRhino(((com.google.javascript.jscomp.AbstractCompiler)v11));
    Object v13 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v7),((java.lang.String)v8),((com.google.javascript.jscomp.parsing.Config)v10),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v12));
    Object v14 = 1;
    Object v15 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v14).intValue()));
    Object v16 = "";
    Object v17 = true;
    Object v18 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v17).booleanValue()));
    Object v19 = new com.google.javascript.jscomp.Compiler();
    Object v20 = com.google.javascript.jscomp.RhinoErrorReporter.forNewRhino(((com.google.javascript.jscomp.AbstractCompiler)v19));
    Object v21 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v15),((java.lang.String)v16),((com.google.javascript.jscomp.parsing.Config)v18),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v20));
    Object v22 = null;
    Object v23 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v21),((com.google.javascript.rhino.jstype.ObjectType)v22));
    Object v24 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v23));
    Object v25 = new com.google.javascript.jscomp.LinkedFlowScope(((com.google.javascript.jscomp.LinkedFlowScope)v24));
    Object v26 = true;
    Object v27 = ((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5).getPreciserScopeKnowingConditionOutcome(((com.google.javascript.rhino.Node)v13),((com.google.javascript.jscomp.FlowScope)v25),(((java.lang.Boolean)v26).booleanValue()));
    Object v28 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v29 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v28));
    Object v30 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v31 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v32 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v29),((com.google.javascript.jscomp.CheckLevel)v30),((com.google.javascript.jscomp.CheckLevel)v31));
    Object v33 = true;
    Object v34 = ((com.google.javascript.jscomp.TypeCheck)v32).reportMissingProperties((((java.lang.Boolean)v33).booleanValue()));
    Object v35 = true;
    Object v36 = ((com.google.javascript.jscomp.TypeCheck)v34).reportMissingProperties((((java.lang.Boolean)v35).booleanValue()));
    org.junit.Assert.assertNotNull(v36);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = 1;
    Object v7 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v6).intValue()));
    Object v8 = "";
    Object v9 = true;
    Object v10 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = new com.google.javascript.jscomp.Compiler();
    Object v12 = com.google.javascript.jscomp.RhinoErrorReporter.forNewRhino(((com.google.javascript.jscomp.AbstractCompiler)v11));
    Object v13 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v7),((java.lang.String)v8),((com.google.javascript.jscomp.parsing.Config)v10),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v12));
    Object v14 = 1;
    Object v15 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v14).intValue()));
    Object v16 = "";
    Object v17 = true;
    Object v18 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v17).booleanValue()));
    Object v19 = new com.google.javascript.jscomp.Compiler();
    Object v20 = com.google.javascript.jscomp.RhinoErrorReporter.forNewRhino(((com.google.javascript.jscomp.AbstractCompiler)v19));
    Object v21 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v15),((java.lang.String)v16),((com.google.javascript.jscomp.parsing.Config)v18),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v20));
    Object v22 = null;
    Object v23 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v21),((com.google.javascript.rhino.jstype.ObjectType)v22));
    Object v24 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v23));
    Object v25 = new com.google.javascript.jscomp.LinkedFlowScope(((com.google.javascript.jscomp.LinkedFlowScope)v24));
    Object v26 = true;
    Object v27 = ((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5).getPreciserScopeKnowingConditionOutcome(((com.google.javascript.rhino.Node)v13),((com.google.javascript.jscomp.FlowScope)v25),(((java.lang.Boolean)v26).booleanValue()));
    Object v28 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v29 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v28));
    Object v30 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v31 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v32 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v29),((com.google.javascript.jscomp.CheckLevel)v30),((com.google.javascript.jscomp.CheckLevel)v31));
    Object v33 = true;
    Object v34 = ((com.google.javascript.jscomp.TypeCheck)v32).reportMissingProperties((((java.lang.Boolean)v33).booleanValue()));
    Object v35 = true;
    Object v36 = ((com.google.javascript.jscomp.TypeCheck)v34).reportMissingProperties((((java.lang.Boolean)v35).booleanValue()));
    Object v37 = ((com.google.javascript.jscomp.TypeCheck)v36).getTypedPercent();
    org.junit.Assert.assertEquals((Object)(0.0D), v37);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v2 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v2));
    Object v4 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v1),((com.google.javascript.rhino.jstype.JSTypeRegistry)v3));
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    ((com.google.javascript.rhino.jstype.JSTypeRegistry)v6).clearNamedTypes();
    Object v7 = null;
    Object v8 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v9 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v10 = ((java.lang.Enum)v9).getDeclaringClass();
    Object v11 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6),((com.google.javascript.jscomp.CheckLevel)v8),((com.google.javascript.jscomp.CheckLevel)v9));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = ((com.google.javascript.jscomp.TypeCheck)v8).getTypedPercent();
    org.junit.Assert.assertEquals((Object)(0.0D), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = 1;
    Object v10 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v9).intValue()));
    Object v11 = "";
    Object v12 = true;
    Object v13 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new com.google.javascript.jscomp.Compiler();
    Object v15 = com.google.javascript.jscomp.RhinoErrorReporter.forNewRhino(((com.google.javascript.jscomp.AbstractCompiler)v14));
    Object v16 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v10),((java.lang.String)v11),((com.google.javascript.jscomp.parsing.Config)v13),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v15));
    Object v17 = 1;
    Object v18 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v17).intValue()));
    Object v19 = "";
    Object v20 = true;
    Object v21 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v20).booleanValue()));
    Object v22 = new com.google.javascript.jscomp.Compiler();
    Object v23 = com.google.javascript.jscomp.RhinoErrorReporter.forNewRhino(((com.google.javascript.jscomp.AbstractCompiler)v22));
    Object v24 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v18),((java.lang.String)v19),((com.google.javascript.jscomp.parsing.Config)v21),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v23));
    Object v25 = ((com.google.javascript.jscomp.TypeCheck)v8).processForTesting(((com.google.javascript.rhino.Node)v16),((com.google.javascript.rhino.Node)v24));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = new com.google.javascript.jscomp.Compiler();
    Object v11 = new com.google.javascript.jscomp.FindExportableNodes(((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.NodeTraversal.Callback)v11),((com.google.javascript.jscomp.ScopeCreator)v13));
    Object v15 = 1;
    Object v16 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v15).intValue()));
    Object v17 = "";
    Object v18 = true;
    Object v19 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v18).booleanValue()));
    Object v20 = new com.google.javascript.jscomp.Compiler();
    Object v21 = com.google.javascript.jscomp.RhinoErrorReporter.forNewRhino(((com.google.javascript.jscomp.AbstractCompiler)v20));
    Object v22 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v16),((java.lang.String)v17),((com.google.javascript.jscomp.parsing.Config)v19),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v21));
    Object v23 = 1;
    Object v24 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v23).intValue()));
    Object v25 = "";
    Object v26 = true;
    Object v27 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v26).booleanValue()));
    Object v28 = new com.google.javascript.jscomp.Compiler();
    Object v29 = com.google.javascript.jscomp.RhinoErrorReporter.forNewRhino(((com.google.javascript.jscomp.AbstractCompiler)v28));
    Object v30 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v24),((java.lang.String)v25),((com.google.javascript.jscomp.parsing.Config)v27),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v29));
    ((com.google.javascript.jscomp.TypeCheck)v8).visit(((com.google.javascript.jscomp.NodeTraversal)v14),((com.google.javascript.rhino.Node)v22),((com.google.javascript.rhino.Node)v30));
    Object v31 = null;
    org.junit.Assert.assertNull(v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = 1;
    Object v10 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v9).intValue()));
    Object v11 = "";
    Object v12 = true;
    Object v13 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new com.google.javascript.jscomp.Compiler();
    Object v15 = com.google.javascript.jscomp.RhinoErrorReporter.forNewRhino(((com.google.javascript.jscomp.AbstractCompiler)v14));
    Object v16 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v10),((java.lang.String)v11),((com.google.javascript.jscomp.parsing.Config)v13),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v15));
    Object v17 = false;
    ((com.google.javascript.jscomp.TypeCheck)v8).check(((com.google.javascript.rhino.Node)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v18 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v2 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v2));
    Object v4 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v1),((com.google.javascript.rhino.jstype.JSTypeRegistry)v3));
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v8 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v9 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6),((com.google.javascript.jscomp.CheckLevel)v7),((com.google.javascript.jscomp.CheckLevel)v8));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = 1;
    Object v10 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v9).intValue()));
    Object v11 = "";
    Object v12 = true;
    Object v13 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new com.google.javascript.jscomp.Compiler();
    Object v15 = com.google.javascript.jscomp.RhinoErrorReporter.forNewRhino(((com.google.javascript.jscomp.AbstractCompiler)v14));
    Object v16 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v10),((java.lang.String)v11),((com.google.javascript.jscomp.parsing.Config)v13),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v15));
    Object v17 = true;
    ((com.google.javascript.jscomp.TypeCheck)v8).check(((com.google.javascript.rhino.Node)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v18 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = new com.google.javascript.jscomp.Compiler();
    Object v11 = new com.google.javascript.jscomp.FindExportableNodes(((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.NodeTraversal.Callback)v11),((com.google.javascript.jscomp.ScopeCreator)v13));
    Object v15 = 1;
    Object v16 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v15).intValue()));
    Object v17 = "";
    Object v18 = true;
    Object v19 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v18).booleanValue()));
    Object v20 = new com.google.javascript.jscomp.Compiler();
    Object v21 = com.google.javascript.jscomp.RhinoErrorReporter.forNewRhino(((com.google.javascript.jscomp.AbstractCompiler)v20));
    Object v22 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v16),((java.lang.String)v17),((com.google.javascript.jscomp.parsing.Config)v19),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v21));
    Object v23 = 1;
    Object v24 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v23).intValue()));
    Object v25 = "";
    Object v26 = true;
    Object v27 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v26).booleanValue()));
    Object v28 = new com.google.javascript.jscomp.Compiler();
    Object v29 = com.google.javascript.jscomp.RhinoErrorReporter.forNewRhino(((com.google.javascript.jscomp.AbstractCompiler)v28));
    Object v30 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v24),((java.lang.String)v25),((com.google.javascript.jscomp.parsing.Config)v27),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v29));
    Object v31 = ((com.google.javascript.jscomp.TypeCheck)v8).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v14),((com.google.javascript.rhino.Node)v22),((com.google.javascript.rhino.Node)v30));
    org.junit.Assert.assertEquals((Object)(true), v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v9 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v10 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((com.google.javascript.jscomp.CheckLevel)v8),((com.google.javascript.jscomp.CheckLevel)v9));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = new com.google.javascript.jscomp.Compiler();
    Object v11 = new com.google.javascript.jscomp.FindExportableNodes(((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.NodeTraversal.Callback)v11),((com.google.javascript.jscomp.ScopeCreator)v13));
    Object v15 = 1;
    Object v16 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v15).intValue()));
    Object v17 = "";
    Object v18 = true;
    Object v19 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v18).booleanValue()));
    Object v20 = new com.google.javascript.jscomp.Compiler();
    Object v21 = com.google.javascript.jscomp.RhinoErrorReporter.forNewRhino(((com.google.javascript.jscomp.AbstractCompiler)v20));
    Object v22 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v16),((java.lang.String)v17),((com.google.javascript.jscomp.parsing.Config)v19),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v21));
    Object v23 = ((com.google.javascript.rhino.Node)v22).hasSideEffects();
    Object v24 = 1;
    Object v25 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v24).intValue()));
    Object v26 = "";
    Object v27 = true;
    Object v28 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v27).booleanValue()));
    Object v29 = new com.google.javascript.jscomp.Compiler();
    Object v30 = com.google.javascript.jscomp.RhinoErrorReporter.forNewRhino(((com.google.javascript.jscomp.AbstractCompiler)v29));
    Object v31 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v25),((java.lang.String)v26),((com.google.javascript.jscomp.parsing.Config)v28),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v30));
    Object v32 = ((com.google.javascript.jscomp.TypeCheck)v8).visitName(((com.google.javascript.jscomp.NodeTraversal)v14),((com.google.javascript.rhino.Node)v22),((com.google.javascript.rhino.Node)v31));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = 1;
    Object v7 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v6).intValue()));
    Object v8 = "";
    Object v9 = true;
    Object v10 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = new com.google.javascript.jscomp.Compiler();
    Object v12 = com.google.javascript.jscomp.RhinoErrorReporter.forNewRhino(((com.google.javascript.jscomp.AbstractCompiler)v11));
    Object v13 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v7),((java.lang.String)v8),((com.google.javascript.jscomp.parsing.Config)v10),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v12));
    Object v14 = 1;
    Object v15 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v14).intValue()));
    Object v16 = "";
    Object v17 = true;
    Object v18 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v17).booleanValue()));
    Object v19 = new com.google.javascript.jscomp.Compiler();
    Object v20 = com.google.javascript.jscomp.RhinoErrorReporter.forNewRhino(((com.google.javascript.jscomp.AbstractCompiler)v19));
    Object v21 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v15),((java.lang.String)v16),((com.google.javascript.jscomp.parsing.Config)v18),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v20));
    Object v22 = null;
    Object v23 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v21),((com.google.javascript.rhino.jstype.ObjectType)v22));
    Object v24 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v23));
    Object v25 = new com.google.javascript.jscomp.LinkedFlowScope(((com.google.javascript.jscomp.LinkedFlowScope)v24));
    Object v26 = true;
    Object v27 = ((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5).getPreciserScopeKnowingConditionOutcome(((com.google.javascript.rhino.Node)v13),((com.google.javascript.jscomp.FlowScope)v25),(((java.lang.Boolean)v26).booleanValue()));
    Object v28 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v29 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v28));
    Object v30 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v31 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v32 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v29),((com.google.javascript.jscomp.CheckLevel)v30),((com.google.javascript.jscomp.CheckLevel)v31));
    Object v33 = false;
    Object v34 = ((com.google.javascript.jscomp.TypeCheck)v32).reportMissingProperties((((java.lang.Boolean)v33).booleanValue()));
    Object v35 = true;
    Object v36 = ((com.google.javascript.jscomp.TypeCheck)v34).reportMissingProperties((((java.lang.Boolean)v35).booleanValue()));
    org.junit.Assert.assertNotNull(v36);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = 1;
    Object v10 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v9).intValue()));
    Object v11 = "";
    Object v12 = true;
    Object v13 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new com.google.javascript.jscomp.Compiler();
    Object v15 = com.google.javascript.jscomp.RhinoErrorReporter.forNewRhino(((com.google.javascript.jscomp.AbstractCompiler)v14));
    Object v16 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v10),((java.lang.String)v11),((com.google.javascript.jscomp.parsing.Config)v13),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v15));
    Object v17 = 1;
    Object v18 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v17).intValue()));
    Object v19 = "";
    Object v20 = true;
    Object v21 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v20).booleanValue()));
    Object v22 = new com.google.javascript.jscomp.Compiler();
    Object v23 = com.google.javascript.jscomp.RhinoErrorReporter.forNewRhino(((com.google.javascript.jscomp.AbstractCompiler)v22));
    Object v24 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v18),((java.lang.String)v19),((com.google.javascript.jscomp.parsing.Config)v21),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v23));
    ((com.google.javascript.jscomp.TypeCheck)v8).process(((com.google.javascript.rhino.Node)v16),((com.google.javascript.rhino.Node)v24));
    Object v25 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v2 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v2));
    Object v4 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v1),((com.google.javascript.rhino.jstype.JSTypeRegistry)v3));
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v8 = ((java.lang.Enum)v7).hashCode();
    Object v9 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v10 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6),((com.google.javascript.jscomp.CheckLevel)v7),((com.google.javascript.jscomp.CheckLevel)v9));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.GoogleCodingConvention();
    Object v3 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v3));
    Object v5 = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v2),((com.google.javascript.rhino.jstype.JSTypeRegistry)v4));
    Object v6 = 1;
    Object v7 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v6).intValue()));
    Object v8 = "";
    Object v9 = true;
    Object v10 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = new com.google.javascript.jscomp.Compiler();
    Object v12 = com.google.javascript.jscomp.RhinoErrorReporter.forNewRhino(((com.google.javascript.jscomp.AbstractCompiler)v11));
    Object v13 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v7),((java.lang.String)v8),((com.google.javascript.jscomp.parsing.Config)v10),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v12));
    Object v14 = 1;
    Object v15 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot((((java.lang.Integer)v14).intValue()));
    Object v16 = "";
    Object v17 = true;
    Object v18 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v17).booleanValue()));
    Object v19 = new com.google.javascript.jscomp.Compiler();
    Object v20 = com.google.javascript.jscomp.RhinoErrorReporter.forNewRhino(((com.google.javascript.jscomp.AbstractCompiler)v19));
    Object v21 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v15),((java.lang.String)v16),((com.google.javascript.jscomp.parsing.Config)v18),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v20));
    Object v22 = null;
    Object v23 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v21),((com.google.javascript.rhino.jstype.ObjectType)v22));
    Object v24 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v23));
    Object v25 = new com.google.javascript.jscomp.LinkedFlowScope(((com.google.javascript.jscomp.LinkedFlowScope)v24));
    Object v26 = true;
    Object v27 = ((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5).getPreciserScopeKnowingConditionOutcome(((com.google.javascript.rhino.Node)v13),((com.google.javascript.jscomp.FlowScope)v25),(((java.lang.Boolean)v26).booleanValue()));
    Object v28 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v29 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v28));
    Object v30 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v31 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v32 = new com.google.javascript.jscomp.TypeCheck(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.ReverseAbstractInterpreter)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v29),((com.google.javascript.jscomp.CheckLevel)v30),((com.google.javascript.jscomp.CheckLevel)v31));
    Object v33 = false;
    Object v34 = ((com.google.javascript.jscomp.TypeCheck)v32).reportMissingProperties((((java.lang.Boolean)v33).booleanValue()));
    Object v35 = true;
    Object v36 = ((com.google.javascript.jscomp.TypeCheck)v34).reportMissingProperties((((java.lang.Boolean)v35).booleanValue()));
    Object v37 = ((com.google.javascript.jscomp.TypeCheck)v36).getTypedPercent();
    org.junit.Assert.assertEquals((Object)(0.0D), v37);
  }
}
