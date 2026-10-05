package com.google.javascript.jscomp;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot();
    Object v1 = "";
    Object v2 = true;
    Object v3 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v5 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v0),((java.lang.String)v1),((com.google.javascript.jscomp.parsing.Config)v3),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v4));
    Object v6 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(((com.google.javascript.rhino.Node)v5));
    org.junit.Assert.assertEquals((Object)(true), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot();
    Object v1 = "";
    Object v2 = true;
    Object v3 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v5 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v0),((java.lang.String)v1),((com.google.javascript.jscomp.parsing.Config)v3),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v4));
    Object v6 = com.google.javascript.jscomp.NodeUtil.isFunctionExpression(((com.google.javascript.rhino.Node)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot();
    Object v1 = "";
    Object v2 = true;
    Object v3 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v5 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v0),((java.lang.String)v1),((com.google.javascript.jscomp.parsing.Config)v3),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v4));
    Object v6 = com.google.javascript.jscomp.NodeUtil.getSourceName(((com.google.javascript.rhino.Node)v5));
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = 54;
    Object v1 = com.google.javascript.jscomp.NodeUtil.isSimpleOperatorType((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot();
    Object v1 = "";
    Object v2 = true;
    Object v3 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v5 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v0),((java.lang.String)v1),((com.google.javascript.jscomp.parsing.Config)v3),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v4));
    Object v6 = com.google.javascript.jscomp.NodeUtil.getFunctionInfo(((com.google.javascript.rhino.Node)v5));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot();
    Object v1 = "";
    Object v2 = true;
    Object v3 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v5 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v0),((java.lang.String)v1),((com.google.javascript.jscomp.parsing.Config)v3),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v4));
    Object v6 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(((com.google.javascript.rhino.Node)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot();
    Object v1 = "";
    Object v2 = true;
    Object v3 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v5 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v0),((java.lang.String)v1),((com.google.javascript.jscomp.parsing.Config)v3),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v4));
    Object v6 = ((com.google.javascript.rhino.Node)v5).toStringTree();
    Object v7 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot();
    Object v8 = "";
    Object v9 = true;
    Object v10 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v12 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v7),((java.lang.String)v8),((com.google.javascript.jscomp.parsing.Config)v10),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v11));
    com.google.javascript.jscomp.NodeUtil.removeChild(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = "_";
    Object v1 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot();
    Object v2 = "";
    Object v3 = true;
    Object v4 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v6 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v1),((java.lang.String)v2),((com.google.javascript.jscomp.parsing.Config)v4),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v5));
    Object v7 = com.google.javascript.jscomp.NodeUtil.newVarNode(((java.lang.String)v0),((com.google.javascript.rhino.Node)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot();
    Object v1 = "";
    Object v2 = true;
    Object v3 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v5 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v0),((java.lang.String)v1),((com.google.javascript.jscomp.parsing.Config)v3),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v4));
    Object v6 = com.google.javascript.jscomp.NodeUtil.isEmptyFunctionExpression(((com.google.javascript.rhino.Node)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = "_";
    Object v1 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot();
    Object v2 = "";
    Object v3 = true;
    Object v4 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v6 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v1),((java.lang.String)v2),((com.google.javascript.jscomp.parsing.Config)v4),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v5));
    Object v7 = com.google.javascript.jscomp.NodeUtil.newVarNode(((java.lang.String)v0),((com.google.javascript.rhino.Node)v6));
    Object v8 = com.google.javascript.jscomp.NodeUtil.isName(((com.google.javascript.rhino.Node)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot();
    Object v1 = "";
    Object v2 = true;
    Object v3 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v5 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v0),((java.lang.String)v1),((com.google.javascript.jscomp.parsing.Config)v3),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v4));
    Object v6 = com.google.javascript.jscomp.NodeUtil.isCall(((com.google.javascript.rhino.Node)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = "_";
    Object v1 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot();
    Object v2 = "";
    Object v3 = true;
    Object v4 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v6 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v1),((java.lang.String)v2),((com.google.javascript.jscomp.parsing.Config)v4),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v5));
    Object v7 = com.google.javascript.jscomp.NodeUtil.newVarNode(((java.lang.String)v0),((com.google.javascript.rhino.Node)v6));
    Object v8 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(((com.google.javascript.rhino.Node)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = "_";
    Object v1 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot();
    Object v2 = "";
    Object v3 = true;
    Object v4 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v6 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v1),((java.lang.String)v2),((com.google.javascript.jscomp.parsing.Config)v4),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v5));
    Object v7 = com.google.javascript.jscomp.NodeUtil.newVarNode(((java.lang.String)v0),((com.google.javascript.rhino.Node)v6));
    Object v8 = new com.google.javascript.rhino.JSDocInfo();
    ((com.google.javascript.rhino.Node)v7).setJSDocInfo(((com.google.javascript.rhino.JSDocInfo)v8));
    Object v9 = null;
    Object v10 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(((com.google.javascript.rhino.Node)v7));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = "_";
    Object v1 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot();
    Object v2 = "";
    Object v3 = true;
    Object v4 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v6 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v1),((java.lang.String)v2),((com.google.javascript.jscomp.parsing.Config)v4),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v5));
    Object v7 = com.google.javascript.jscomp.NodeUtil.newVarNode(((java.lang.String)v0),((com.google.javascript.rhino.Node)v6));
    Object v8 = "Not declared as a constructor";
    Object v9 = java.util.logging.Logger.getLogger(((java.lang.String)v8));
    Object v10 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v9));
    Object v11 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v10));
    Object v12 = com.google.javascript.jscomp.NodeUtil.constructorCallHasSideEffects(((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.AbstractCompiler)v11));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = "";
    Object v1 = new java.util.ArrayList();
    Object v2 = "_";
    Object v3 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot();
    Object v4 = "";
    Object v5 = true;
    Object v6 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v8 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v3),((java.lang.String)v4),((com.google.javascript.jscomp.parsing.Config)v6),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v7));
    Object v9 = com.google.javascript.jscomp.NodeUtil.newVarNode(((java.lang.String)v2),((com.google.javascript.rhino.Node)v8));
    Object v10 = -2;
    Object v11 = 0;
    Object v12 = com.google.javascript.jscomp.NodeUtil.newFunctionNode(((java.lang.String)v0),((java.util.List)v1),((com.google.javascript.rhino.Node)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = new java.util.ArrayList();
    Object v2 = "_";
    Object v3 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot();
    Object v4 = "";
    Object v5 = true;
    Object v6 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v8 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v3),((java.lang.String)v4),((com.google.javascript.jscomp.parsing.Config)v6),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v7));
    Object v9 = com.google.javascript.jscomp.NodeUtil.newVarNode(((java.lang.String)v2),((com.google.javascript.rhino.Node)v8));
    Object v10 = -2;
    Object v11 = 0;
    Object v12 = com.google.javascript.jscomp.NodeUtil.newFunctionNode(((java.lang.String)v0),((java.util.List)v1),((com.google.javascript.rhino.Node)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = com.google.javascript.jscomp.NodeUtil.getFunctionInfo(((com.google.javascript.rhino.Node)v12));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = "KLEGACY";
    Object v1 = com.google.javascript.jscomp.NodeUtil.isLatin(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(true), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = "";
    Object v1 = new java.util.ArrayList();
    Object v2 = "_";
    Object v3 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot();
    Object v4 = "";
    Object v5 = true;
    Object v6 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v8 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v3),((java.lang.String)v4),((com.google.javascript.jscomp.parsing.Config)v6),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v7));
    Object v9 = com.google.javascript.jscomp.NodeUtil.newVarNode(((java.lang.String)v2),((com.google.javascript.rhino.Node)v8));
    Object v10 = -2;
    Object v11 = 0;
    Object v12 = com.google.javascript.jscomp.NodeUtil.newFunctionNode(((java.lang.String)v0),((java.util.List)v1),((com.google.javascript.rhino.Node)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = "_";
    Object v14 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot();
    Object v15 = "";
    Object v16 = true;
    Object v17 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v16).booleanValue()));
    Object v18 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v19 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v14),((java.lang.String)v15),((com.google.javascript.jscomp.parsing.Config)v17),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v18));
    Object v20 = com.google.javascript.jscomp.NodeUtil.newVarNode(((java.lang.String)v13),((com.google.javascript.rhino.Node)v19));
    Object v21 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v20));
    org.junit.Assert.assertEquals((Object)(false), v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = "_";
    Object v1 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot();
    Object v2 = "";
    Object v3 = true;
    Object v4 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v6 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v1),((java.lang.String)v2),((com.google.javascript.jscomp.parsing.Config)v4),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v5));
    Object v7 = com.google.javascript.jscomp.NodeUtil.newVarNode(((java.lang.String)v0),((com.google.javascript.rhino.Node)v6));
    Object v8 = com.google.javascript.jscomp.NodeUtil.isEmptyBlock(((com.google.javascript.rhino.Node)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = 0;
    Object v1 = com.google.javascript.jscomp.NodeUtil.isAssociative((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.DefaultCodingConvention();
    Object v1 = "_";
    Object v2 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot();
    Object v3 = "";
    Object v4 = true;
    Object v5 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v7 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v2),((java.lang.String)v3),((com.google.javascript.jscomp.parsing.Config)v5),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v6));
    Object v8 = com.google.javascript.jscomp.NodeUtil.newVarNode(((java.lang.String)v1),((com.google.javascript.rhino.Node)v7));
    Object v9 = -8;
    ((com.google.javascript.rhino.Node)v8).removeProp((((java.lang.Integer)v9).intValue()));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot();
    Object v12 = "";
    Object v13 = true;
    Object v14 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v13).booleanValue()));
    Object v15 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v16 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v11),((java.lang.String)v12),((com.google.javascript.jscomp.parsing.Config)v14),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v15));
    Object v17 = com.google.javascript.jscomp.NodeUtil.isConstantByConvention(((com.google.javascript.jscomp.CodingConvention)v0),((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v16));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = "";
    Object v1 = new java.util.ArrayList();
    Object v2 = "_";
    Object v3 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot();
    Object v4 = "";
    Object v5 = true;
    Object v6 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v8 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v3),((java.lang.String)v4),((com.google.javascript.jscomp.parsing.Config)v6),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v7));
    Object v9 = com.google.javascript.jscomp.NodeUtil.newVarNode(((java.lang.String)v2),((com.google.javascript.rhino.Node)v8));
    Object v10 = -2;
    Object v11 = 0;
    Object v12 = com.google.javascript.jscomp.NodeUtil.newFunctionNode(((java.lang.String)v0),((java.util.List)v1),((com.google.javascript.rhino.Node)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = com.google.javascript.jscomp.NodeUtil.isReferenceName(((com.google.javascript.rhino.Node)v12));
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = "";
    Object v1 = new java.util.ArrayList();
    Object v2 = "_";
    Object v3 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot();
    Object v4 = "";
    Object v5 = true;
    Object v6 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v8 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v3),((java.lang.String)v4),((com.google.javascript.jscomp.parsing.Config)v6),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v7));
    Object v9 = com.google.javascript.jscomp.NodeUtil.newVarNode(((java.lang.String)v2),((com.google.javascript.rhino.Node)v8));
    Object v10 = -2;
    Object v11 = 0;
    Object v12 = com.google.javascript.jscomp.NodeUtil.newFunctionNode(((java.lang.String)v0),((java.util.List)v1),((com.google.javascript.rhino.Node)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = "_";
    Object v14 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot();
    Object v15 = "";
    Object v16 = true;
    Object v17 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v16).booleanValue()));
    Object v18 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v19 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v14),((java.lang.String)v15),((com.google.javascript.jscomp.parsing.Config)v17),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v18));
    Object v20 = com.google.javascript.jscomp.NodeUtil.newVarNode(((java.lang.String)v13),((com.google.javascript.rhino.Node)v19));
    com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v20));
    Object v21 = null;
    org.junit.Assert.assertNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = "_";
    Object v1 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot();
    Object v2 = "";
    Object v3 = true;
    Object v4 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v6 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v1),((java.lang.String)v2),((com.google.javascript.jscomp.parsing.Config)v4),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v5));
    Object v7 = com.google.javascript.jscomp.NodeUtil.newVarNode(((java.lang.String)v0),((com.google.javascript.rhino.Node)v6));
    Object v8 = com.google.javascript.jscomp.NodeUtil.getOpFromAssignmentOp(((com.google.javascript.rhino.Node)v7));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = "_";
    Object v1 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot();
    Object v2 = "";
    Object v3 = true;
    Object v4 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v6 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v1),((java.lang.String)v2),((com.google.javascript.jscomp.parsing.Config)v4),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v5));
    Object v7 = com.google.javascript.jscomp.NodeUtil.newVarNode(((java.lang.String)v0),((com.google.javascript.rhino.Node)v6));
    Object v8 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(((com.google.javascript.rhino.Node)v7));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = new java.util.ArrayList();
    Object v2 = "_";
    Object v3 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot();
    Object v4 = "";
    Object v5 = true;
    Object v6 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v8 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v3),((java.lang.String)v4),((com.google.javascript.jscomp.parsing.Config)v6),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v7));
    Object v9 = com.google.javascript.jscomp.NodeUtil.newVarNode(((java.lang.String)v2),((com.google.javascript.rhino.Node)v8));
    Object v10 = -2;
    Object v11 = 0;
    Object v12 = com.google.javascript.jscomp.NodeUtil.newFunctionNode(((java.lang.String)v0),((java.util.List)v1),((com.google.javascript.rhino.Node)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = ((com.google.javascript.rhino.Node)v12).toStringTree();
    Object v14 = com.google.javascript.jscomp.NodeUtil.tryMergeBlock(((com.google.javascript.rhino.Node)v12));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = "";
    Object v1 = new java.util.ArrayList();
    Object v2 = "_";
    Object v3 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot();
    Object v4 = "";
    Object v5 = true;
    Object v6 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v8 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v3),((java.lang.String)v4),((com.google.javascript.jscomp.parsing.Config)v6),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v7));
    Object v9 = com.google.javascript.jscomp.NodeUtil.newVarNode(((java.lang.String)v2),((com.google.javascript.rhino.Node)v8));
    Object v10 = -2;
    Object v11 = 0;
    Object v12 = com.google.javascript.jscomp.NodeUtil.newFunctionNode(((java.lang.String)v0),((java.util.List)v1),((com.google.javascript.rhino.Node)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = com.google.javascript.jscomp.NodeUtil.isThis(((com.google.javascript.rhino.Node)v12));
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = "";
    Object v1 = new java.util.ArrayList();
    Object v2 = "_";
    Object v3 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot();
    Object v4 = "";
    Object v5 = true;
    Object v6 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v8 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v3),((java.lang.String)v4),((com.google.javascript.jscomp.parsing.Config)v6),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v7));
    Object v9 = com.google.javascript.jscomp.NodeUtil.newVarNode(((java.lang.String)v2),((com.google.javascript.rhino.Node)v8));
    Object v10 = -2;
    Object v11 = 0;
    Object v12 = com.google.javascript.jscomp.NodeUtil.newFunctionNode(((java.lang.String)v0),((java.util.List)v1),((com.google.javascript.rhino.Node)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = com.google.javascript.jscomp.NodeUtil.isEmptyBlock(((com.google.javascript.rhino.Node)v12));
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = "_";
    Object v1 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot();
    Object v2 = "";
    Object v3 = true;
    Object v4 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v6 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v1),((java.lang.String)v2),((com.google.javascript.jscomp.parsing.Config)v4),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v5));
    Object v7 = com.google.javascript.jscomp.NodeUtil.newVarNode(((java.lang.String)v0),((com.google.javascript.rhino.Node)v6));
    Object v8 = 9;
    Object v9 = false;
    ((com.google.javascript.rhino.Node)v7).putBooleanProp((((java.lang.Integer)v8).intValue()),(((java.lang.Boolean)v9).booleanValue()));
    Object v10 = null;
    Object v11 = com.google.javascript.jscomp.NodeUtil.isVarDeclaration(((com.google.javascript.rhino.Node)v7));
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = "";
    Object v1 = new java.util.ArrayList();
    Object v2 = "_";
    Object v3 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot();
    Object v4 = "";
    Object v5 = true;
    Object v6 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v8 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v3),((java.lang.String)v4),((com.google.javascript.jscomp.parsing.Config)v6),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v7));
    Object v9 = com.google.javascript.jscomp.NodeUtil.newVarNode(((java.lang.String)v2),((com.google.javascript.rhino.Node)v8));
    Object v10 = -2;
    Object v11 = 0;
    Object v12 = com.google.javascript.jscomp.NodeUtil.newFunctionNode(((java.lang.String)v0),((java.util.List)v1),((com.google.javascript.rhino.Node)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(((com.google.javascript.rhino.Node)v12));
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = "_";
    Object v1 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot();
    Object v2 = "";
    Object v3 = true;
    Object v4 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v6 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v1),((java.lang.String)v2),((com.google.javascript.jscomp.parsing.Config)v4),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v5));
    Object v7 = com.google.javascript.jscomp.NodeUtil.newVarNode(((java.lang.String)v0),((com.google.javascript.rhino.Node)v6));
    Object v8 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(((com.google.javascript.rhino.Node)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = "";
    Object v1 = new java.util.ArrayList();
    Object v2 = "_";
    Object v3 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot();
    Object v4 = "";
    Object v5 = true;
    Object v6 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v8 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v3),((java.lang.String)v4),((com.google.javascript.jscomp.parsing.Config)v6),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v7));
    Object v9 = com.google.javascript.jscomp.NodeUtil.newVarNode(((java.lang.String)v2),((com.google.javascript.rhino.Node)v8));
    Object v10 = -2;
    Object v11 = 0;
    Object v12 = com.google.javascript.jscomp.NodeUtil.newFunctionNode(((java.lang.String)v0),((java.util.List)v1),((com.google.javascript.rhino.Node)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(((com.google.javascript.rhino.Node)v12));
    org.junit.Assert.assertEquals((Object)(true), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = "";
    Object v1 = new java.util.ArrayList();
    Object v2 = "_";
    Object v3 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot();
    Object v4 = "";
    Object v5 = true;
    Object v6 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v8 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v3),((java.lang.String)v4),((com.google.javascript.jscomp.parsing.Config)v6),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v7));
    Object v9 = com.google.javascript.jscomp.NodeUtil.newVarNode(((java.lang.String)v2),((com.google.javascript.rhino.Node)v8));
    Object v10 = -2;
    Object v11 = 0;
    Object v12 = com.google.javascript.jscomp.NodeUtil.newFunctionNode(((java.lang.String)v0),((java.util.List)v1),((com.google.javascript.rhino.Node)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(((com.google.javascript.rhino.Node)v12));
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = "";
    Object v1 = new java.util.ArrayList();
    Object v2 = "_";
    Object v3 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot();
    Object v4 = "";
    Object v5 = true;
    Object v6 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v8 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v3),((java.lang.String)v4),((com.google.javascript.jscomp.parsing.Config)v6),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v7));
    Object v9 = com.google.javascript.jscomp.NodeUtil.newVarNode(((java.lang.String)v2),((com.google.javascript.rhino.Node)v8));
    Object v10 = -2;
    Object v11 = 0;
    Object v12 = com.google.javascript.jscomp.NodeUtil.newFunctionNode(((java.lang.String)v0),((java.util.List)v1),((com.google.javascript.rhino.Node)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = com.google.javascript.jscomp.NodeUtil.isConstantName(((com.google.javascript.rhino.Node)v12));
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = "_";
    Object v1 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot();
    Object v2 = "";
    Object v3 = true;
    Object v4 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v6 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v1),((java.lang.String)v2),((com.google.javascript.jscomp.parsing.Config)v4),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v5));
    Object v7 = com.google.javascript.jscomp.NodeUtil.newVarNode(((java.lang.String)v0),((com.google.javascript.rhino.Node)v6));
    Object v8 = com.google.javascript.jscomp.NodeUtil.getExpressionBooleanValue(((com.google.javascript.rhino.Node)v7));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = "O";
    Object v1 = new java.util.ArrayList();
    Object v2 = "_";
    Object v3 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot();
    Object v4 = "";
    Object v5 = true;
    Object v6 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v8 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v3),((java.lang.String)v4),((com.google.javascript.jscomp.parsing.Config)v6),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v7));
    Object v9 = com.google.javascript.jscomp.NodeUtil.newVarNode(((java.lang.String)v2),((com.google.javascript.rhino.Node)v8));
    Object v10 = new com.google.javascript.rhino.JSDocInfo();
    ((com.google.javascript.rhino.Node)v9).setJSDocInfo(((com.google.javascript.rhino.JSDocInfo)v10));
    Object v11 = null;
    Object v12 = 53;
    Object v13 = 10;
    Object v14 = com.google.javascript.jscomp.NodeUtil.newFunctionNode(((java.lang.String)v0),((java.util.List)v1),((com.google.javascript.rhino.Node)v9),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = new java.util.ArrayList();
    Object v2 = "_";
    Object v3 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot();
    Object v4 = "";
    Object v5 = true;
    Object v6 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v8 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v3),((java.lang.String)v4),((com.google.javascript.jscomp.parsing.Config)v6),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v7));
    Object v9 = com.google.javascript.jscomp.NodeUtil.newVarNode(((java.lang.String)v2),((com.google.javascript.rhino.Node)v8));
    Object v10 = -2;
    Object v11 = 0;
    Object v12 = com.google.javascript.jscomp.NodeUtil.newFunctionNode(((java.lang.String)v0),((java.util.List)v1),((com.google.javascript.rhino.Node)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = com.google.javascript.jscomp.NodeUtil.getAssignedValue(((com.google.javascript.rhino.Node)v12));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot();
    Object v1 = "";
    Object v2 = true;
    Object v3 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v5 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v0),((java.lang.String)v1),((com.google.javascript.jscomp.parsing.Config)v3),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v4));
    Object v6 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(((com.google.javascript.rhino.Node)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = "O";
    Object v1 = new java.util.ArrayList();
    Object v2 = "_";
    Object v3 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot();
    Object v4 = "";
    Object v5 = true;
    Object v6 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v8 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v3),((java.lang.String)v4),((com.google.javascript.jscomp.parsing.Config)v6),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v7));
    Object v9 = com.google.javascript.jscomp.NodeUtil.newVarNode(((java.lang.String)v2),((com.google.javascript.rhino.Node)v8));
    Object v10 = new com.google.javascript.rhino.JSDocInfo();
    ((com.google.javascript.rhino.Node)v9).setJSDocInfo(((com.google.javascript.rhino.JSDocInfo)v10));
    Object v11 = null;
    Object v12 = 53;
    Object v13 = 10;
    Object v14 = com.google.javascript.jscomp.NodeUtil.newFunctionNode(((java.lang.String)v0),((java.util.List)v1),((com.google.javascript.rhino.Node)v9),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = com.google.javascript.jscomp.NodeUtil.isAssign(((com.google.javascript.rhino.Node)v14));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = 1;
    Object v1 = com.google.javascript.jscomp.NodeUtil.isSimpleOperatorType((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = "_";
    Object v1 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot();
    Object v2 = "";
    Object v3 = true;
    Object v4 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v6 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v1),((java.lang.String)v2),((com.google.javascript.jscomp.parsing.Config)v4),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v5));
    Object v7 = com.google.javascript.jscomp.NodeUtil.newVarNode(((java.lang.String)v0),((com.google.javascript.rhino.Node)v6));
    Object v8 = com.google.javascript.jscomp.NodeUtil.getBooleanValue(((com.google.javascript.rhino.Node)v7));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = "";
    Object v1 = new java.util.ArrayList();
    Object v2 = "_";
    Object v3 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot();
    Object v4 = "";
    Object v5 = true;
    Object v6 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v8 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v3),((java.lang.String)v4),((com.google.javascript.jscomp.parsing.Config)v6),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v7));
    Object v9 = com.google.javascript.jscomp.NodeUtil.newVarNode(((java.lang.String)v2),((com.google.javascript.rhino.Node)v8));
    Object v10 = -2;
    Object v11 = 0;
    Object v12 = com.google.javascript.jscomp.NodeUtil.newFunctionNode(((java.lang.String)v0),((java.util.List)v1),((com.google.javascript.rhino.Node)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = com.google.javascript.jscomp.NodeUtil.getInfoForNameNode(((com.google.javascript.rhino.Node)v12));
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = "O";
    Object v1 = new java.util.ArrayList();
    Object v2 = "_";
    Object v3 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot();
    Object v4 = "";
    Object v5 = true;
    Object v6 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v8 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v3),((java.lang.String)v4),((com.google.javascript.jscomp.parsing.Config)v6),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v7));
    Object v9 = com.google.javascript.jscomp.NodeUtil.newVarNode(((java.lang.String)v2),((com.google.javascript.rhino.Node)v8));
    Object v10 = new com.google.javascript.rhino.JSDocInfo();
    ((com.google.javascript.rhino.Node)v9).setJSDocInfo(((com.google.javascript.rhino.JSDocInfo)v10));
    Object v11 = null;
    Object v12 = 53;
    Object v13 = 10;
    Object v14 = com.google.javascript.jscomp.NodeUtil.newFunctionNode(((java.lang.String)v0),((java.util.List)v1),((com.google.javascript.rhino.Node)v9),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = com.google.javascript.jscomp.NodeUtil.isLoopStructure(((com.google.javascript.rhino.Node)v14));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = "O";
    Object v1 = new java.util.ArrayList();
    Object v2 = "_";
    Object v3 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot();
    Object v4 = "";
    Object v5 = true;
    Object v6 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v8 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v3),((java.lang.String)v4),((com.google.javascript.jscomp.parsing.Config)v6),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v7));
    Object v9 = com.google.javascript.jscomp.NodeUtil.newVarNode(((java.lang.String)v2),((com.google.javascript.rhino.Node)v8));
    Object v10 = new com.google.javascript.rhino.JSDocInfo();
    ((com.google.javascript.rhino.Node)v9).setJSDocInfo(((com.google.javascript.rhino.JSDocInfo)v10));
    Object v11 = null;
    Object v12 = 53;
    Object v13 = 10;
    Object v14 = com.google.javascript.jscomp.NodeUtil.newFunctionNode(((java.lang.String)v0),((java.util.List)v1),((com.google.javascript.rhino.Node)v9),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = com.google.javascript.jscomp.NodeUtil.getFnParameters(((com.google.javascript.rhino.Node)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = "O";
    Object v1 = new java.util.ArrayList();
    Object v2 = "_";
    Object v3 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot();
    Object v4 = "";
    Object v5 = true;
    Object v6 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v8 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v3),((java.lang.String)v4),((com.google.javascript.jscomp.parsing.Config)v6),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v7));
    Object v9 = com.google.javascript.jscomp.NodeUtil.newVarNode(((java.lang.String)v2),((com.google.javascript.rhino.Node)v8));
    Object v10 = new com.google.javascript.rhino.JSDocInfo();
    ((com.google.javascript.rhino.Node)v9).setJSDocInfo(((com.google.javascript.rhino.JSDocInfo)v10));
    Object v11 = null;
    Object v12 = 53;
    Object v13 = 10;
    Object v14 = com.google.javascript.jscomp.NodeUtil.newFunctionNode(((java.lang.String)v0),((java.util.List)v1),((com.google.javascript.rhino.Node)v9),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = com.google.javascript.jscomp.NodeUtil.getFnParameters(((com.google.javascript.rhino.Node)v14));
    Object v16 = com.google.javascript.jscomp.NodeUtil.getConditionExpression(((com.google.javascript.rhino.Node)v15));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = "O";
    Object v1 = new java.util.ArrayList();
    Object v2 = "_";
    Object v3 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot();
    Object v4 = "";
    Object v5 = true;
    Object v6 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v8 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v3),((java.lang.String)v4),((com.google.javascript.jscomp.parsing.Config)v6),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v7));
    Object v9 = com.google.javascript.jscomp.NodeUtil.newVarNode(((java.lang.String)v2),((com.google.javascript.rhino.Node)v8));
    Object v10 = new com.google.javascript.rhino.JSDocInfo();
    ((com.google.javascript.rhino.Node)v9).setJSDocInfo(((com.google.javascript.rhino.JSDocInfo)v10));
    Object v11 = null;
    Object v12 = 53;
    Object v13 = 10;
    Object v14 = com.google.javascript.jscomp.NodeUtil.newFunctionNode(((java.lang.String)v0),((java.util.List)v1),((com.google.javascript.rhino.Node)v9),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = com.google.javascript.jscomp.NodeUtil.getFnParameters(((com.google.javascript.rhino.Node)v14));
    Object v16 = ((com.google.javascript.rhino.Node)v15).isQualifiedName();
    Object v17 = com.google.javascript.jscomp.NodeUtil.isName(((com.google.javascript.rhino.Node)v15));
    org.junit.Assert.assertEquals((Object)(false), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = "";
    Object v1 = new java.util.ArrayList();
    Object v2 = "_";
    Object v3 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot();
    Object v4 = "";
    Object v5 = true;
    Object v6 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v8 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v3),((java.lang.String)v4),((com.google.javascript.jscomp.parsing.Config)v6),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v7));
    Object v9 = com.google.javascript.jscomp.NodeUtil.newVarNode(((java.lang.String)v2),((com.google.javascript.rhino.Node)v8));
    Object v10 = -2;
    Object v11 = 0;
    Object v12 = com.google.javascript.jscomp.NodeUtil.newFunctionNode(((java.lang.String)v0),((java.util.List)v1),((com.google.javascript.rhino.Node)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = 31;
    Object v14 = new java.io.StringWriter((((java.lang.Integer)v13).intValue()));
    ((com.google.javascript.rhino.Node)v12).appendStringTree(((java.lang.Appendable)v14));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v17 = 1;
    Object v18 = com.google.javascript.jscomp.NodeUtil.isSimpleOperatorType((((java.lang.Integer)v17).intValue()));
    Object v19 = ((com.google.common.base.Predicate)v16).equals(((java.lang.Object)v18));
    Object v20 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v21 = 0;
    Object v22 = com.google.javascript.jscomp.NodeUtil.isAssociative((((java.lang.Integer)v21).intValue()));
    Object v23 = ((com.google.common.base.Predicate)v20).equals(((java.lang.Object)v22));
    Object v24 = com.google.javascript.jscomp.NodeUtil.getCount(((com.google.javascript.rhino.Node)v12),((com.google.common.base.Predicate)v16),((com.google.common.base.Predicate)v20));
    org.junit.Assert.assertEquals((Object)(0), v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot();
    Object v1 = "";
    Object v2 = true;
    Object v3 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v5 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v0),((java.lang.String)v1),((com.google.javascript.jscomp.parsing.Config)v3),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v4));
    Object v6 = com.google.javascript.jscomp.NodeUtil.isNew(((com.google.javascript.rhino.Node)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = "";
    Object v1 = new java.util.ArrayList();
    Object v2 = "_";
    Object v3 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot();
    Object v4 = "";
    Object v5 = true;
    Object v6 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v8 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v3),((java.lang.String)v4),((com.google.javascript.jscomp.parsing.Config)v6),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v7));
    Object v9 = com.google.javascript.jscomp.NodeUtil.newVarNode(((java.lang.String)v2),((com.google.javascript.rhino.Node)v8));
    Object v10 = -2;
    Object v11 = 0;
    Object v12 = com.google.javascript.jscomp.NodeUtil.newFunctionNode(((java.lang.String)v0),((java.util.List)v1),((com.google.javascript.rhino.Node)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = ((com.google.javascript.rhino.Node)v12).siblings();
    Object v14 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(((com.google.javascript.rhino.Node)v12));
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = new java.util.ArrayList();
    Object v2 = "_";
    Object v3 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot();
    Object v4 = "";
    Object v5 = true;
    Object v6 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v8 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v3),((java.lang.String)v4),((com.google.javascript.jscomp.parsing.Config)v6),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v7));
    Object v9 = com.google.javascript.jscomp.NodeUtil.newVarNode(((java.lang.String)v2),((com.google.javascript.rhino.Node)v8));
    Object v10 = -2;
    Object v11 = 0;
    Object v12 = com.google.javascript.jscomp.NodeUtil.newFunctionNode(((java.lang.String)v0),((java.util.List)v1),((com.google.javascript.rhino.Node)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = new com.google.javascript.rhino.JSDocInfo();
    ((com.google.javascript.rhino.Node)v12).setJSDocInfo(((com.google.javascript.rhino.JSDocInfo)v13));
    Object v14 = null;
    Object v15 = "Not declared as a constructor";
    Object v16 = java.util.logging.Logger.getLogger(((java.lang.String)v15));
    Object v17 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v16));
    Object v18 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v17));
    Object v19 = com.google.javascript.jscomp.NodeUtil.constructorCallHasSideEffects(((com.google.javascript.rhino.Node)v12),((com.google.javascript.jscomp.AbstractCompiler)v18));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = "O";
    Object v1 = new java.util.ArrayList();
    Object v2 = "_";
    Object v3 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot();
    Object v4 = "";
    Object v5 = true;
    Object v6 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v8 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v3),((java.lang.String)v4),((com.google.javascript.jscomp.parsing.Config)v6),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v7));
    Object v9 = com.google.javascript.jscomp.NodeUtil.newVarNode(((java.lang.String)v2),((com.google.javascript.rhino.Node)v8));
    Object v10 = new com.google.javascript.rhino.JSDocInfo();
    ((com.google.javascript.rhino.Node)v9).setJSDocInfo(((com.google.javascript.rhino.JSDocInfo)v10));
    Object v11 = null;
    Object v12 = 53;
    Object v13 = 10;
    Object v14 = com.google.javascript.jscomp.NodeUtil.newFunctionNode(((java.lang.String)v0),((java.util.List)v1),((com.google.javascript.rhino.Node)v9),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = com.google.javascript.jscomp.NodeUtil.getFnParameters(((com.google.javascript.rhino.Node)v14));
    Object v16 = com.google.javascript.jscomp.NodeUtil.referencesThis(((com.google.javascript.rhino.Node)v15));
    org.junit.Assert.assertEquals((Object)(false), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = -19;
    Object v1 = com.google.javascript.jscomp.NodeUtil.isAssociative((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = "O";
    Object v1 = new java.util.ArrayList();
    Object v2 = "_";
    Object v3 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot();
    Object v4 = "";
    Object v5 = true;
    Object v6 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v8 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v3),((java.lang.String)v4),((com.google.javascript.jscomp.parsing.Config)v6),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v7));
    Object v9 = com.google.javascript.jscomp.NodeUtil.newVarNode(((java.lang.String)v2),((com.google.javascript.rhino.Node)v8));
    Object v10 = new com.google.javascript.rhino.JSDocInfo();
    ((com.google.javascript.rhino.Node)v9).setJSDocInfo(((com.google.javascript.rhino.JSDocInfo)v10));
    Object v11 = null;
    Object v12 = 53;
    Object v13 = 10;
    Object v14 = com.google.javascript.jscomp.NodeUtil.newFunctionNode(((java.lang.String)v0),((java.util.List)v1),((com.google.javascript.rhino.Node)v9),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = com.google.javascript.jscomp.NodeUtil.isEmptyBlock(((com.google.javascript.rhino.Node)v14));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = -10;
    Object v1 = com.google.javascript.jscomp.NodeUtil.opToStrNoFail((((java.lang.Integer)v0).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = "";
    Object v1 = new java.util.ArrayList();
    Object v2 = "_";
    Object v3 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot();
    Object v4 = "";
    Object v5 = true;
    Object v6 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v8 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v3),((java.lang.String)v4),((com.google.javascript.jscomp.parsing.Config)v6),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v7));
    Object v9 = com.google.javascript.jscomp.NodeUtil.newVarNode(((java.lang.String)v2),((com.google.javascript.rhino.Node)v8));
    Object v10 = -2;
    Object v11 = 0;
    Object v12 = com.google.javascript.jscomp.NodeUtil.newFunctionNode(((java.lang.String)v0),((java.util.List)v1),((com.google.javascript.rhino.Node)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(((com.google.javascript.rhino.Node)v12));
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = "_";
    Object v1 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot();
    Object v2 = "";
    Object v3 = true;
    Object v4 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v6 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v1),((java.lang.String)v2),((com.google.javascript.jscomp.parsing.Config)v4),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v5));
    Object v7 = com.google.javascript.jscomp.NodeUtil.newVarNode(((java.lang.String)v0),((com.google.javascript.rhino.Node)v6));
    Object v8 = com.google.javascript.jscomp.NodeUtil.getLoopCodeBlock(((com.google.javascript.rhino.Node)v7));
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = "O";
    Object v1 = new java.util.ArrayList();
    Object v2 = "_";
    Object v3 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot();
    Object v4 = "";
    Object v5 = true;
    Object v6 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v8 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v3),((java.lang.String)v4),((com.google.javascript.jscomp.parsing.Config)v6),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v7));
    Object v9 = com.google.javascript.jscomp.NodeUtil.newVarNode(((java.lang.String)v2),((com.google.javascript.rhino.Node)v8));
    Object v10 = new com.google.javascript.rhino.JSDocInfo();
    ((com.google.javascript.rhino.Node)v9).setJSDocInfo(((com.google.javascript.rhino.JSDocInfo)v10));
    Object v11 = null;
    Object v12 = 53;
    Object v13 = 10;
    Object v14 = com.google.javascript.jscomp.NodeUtil.newFunctionNode(((java.lang.String)v0),((java.util.List)v1),((com.google.javascript.rhino.Node)v9),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = false;
    ((com.google.javascript.rhino.Node)v14).setOptionalArg((((java.lang.Boolean)v15).booleanValue()));
    Object v16 = null;
    Object v17 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v18 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v19 = -19;
    Object v20 = com.google.javascript.jscomp.NodeUtil.isAssociative((((java.lang.Integer)v19).intValue()));
    Object v21 = ((com.google.common.base.Predicate)v18).equals(((java.lang.Object)v20));
    Object v22 = com.google.javascript.jscomp.NodeUtil.getCount(((com.google.javascript.rhino.Node)v14),((com.google.common.base.Predicate)v17),((com.google.common.base.Predicate)v18));
    org.junit.Assert.assertEquals((Object)(0), v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = "O";
    Object v1 = new java.util.ArrayList();
    Object v2 = "_";
    Object v3 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot();
    Object v4 = "";
    Object v5 = true;
    Object v6 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v8 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v3),((java.lang.String)v4),((com.google.javascript.jscomp.parsing.Config)v6),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v7));
    Object v9 = com.google.javascript.jscomp.NodeUtil.newVarNode(((java.lang.String)v2),((com.google.javascript.rhino.Node)v8));
    Object v10 = new com.google.javascript.rhino.JSDocInfo();
    ((com.google.javascript.rhino.Node)v9).setJSDocInfo(((com.google.javascript.rhino.JSDocInfo)v10));
    Object v11 = null;
    Object v12 = 53;
    Object v13 = 10;
    Object v14 = com.google.javascript.jscomp.NodeUtil.newFunctionNode(((java.lang.String)v0),((java.util.List)v1),((com.google.javascript.rhino.Node)v9),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = com.google.javascript.jscomp.NodeUtil.getFnParameters(((com.google.javascript.rhino.Node)v14));
    Object v16 = ((com.google.javascript.rhino.Node)v15).toString();
    Object v17 = com.google.javascript.jscomp.NodeUtil.isAssign(((com.google.javascript.rhino.Node)v15));
    org.junit.Assert.assertEquals((Object)(false), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = new java.util.ArrayList();
    Object v2 = "_";
    Object v3 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot();
    Object v4 = "";
    Object v5 = true;
    Object v6 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v8 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v3),((java.lang.String)v4),((com.google.javascript.jscomp.parsing.Config)v6),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v7));
    Object v9 = com.google.javascript.jscomp.NodeUtil.newVarNode(((java.lang.String)v2),((com.google.javascript.rhino.Node)v8));
    Object v10 = -2;
    Object v11 = 0;
    Object v12 = com.google.javascript.jscomp.NodeUtil.newFunctionNode(((java.lang.String)v0),((java.util.List)v1),((com.google.javascript.rhino.Node)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = com.google.javascript.jscomp.NodeUtil.hasCatchHandler(((com.google.javascript.rhino.Node)v12));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = "_";
    Object v1 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot();
    Object v2 = "";
    Object v3 = true;
    Object v4 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v6 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v1),((java.lang.String)v2),((com.google.javascript.jscomp.parsing.Config)v4),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v5));
    Object v7 = com.google.javascript.jscomp.NodeUtil.newVarNode(((java.lang.String)v0),((com.google.javascript.rhino.Node)v6));
    Object v8 = com.google.javascript.jscomp.NodeUtil.getCatchBlock(((com.google.javascript.rhino.Node)v7));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = "9";
    Object v1 = com.google.javascript.jscomp.NodeUtil.isValidPropertyName(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = "O";
    Object v1 = new java.util.ArrayList();
    Object v2 = "_";
    Object v3 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot();
    Object v4 = "";
    Object v5 = true;
    Object v6 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v8 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v3),((java.lang.String)v4),((com.google.javascript.jscomp.parsing.Config)v6),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v7));
    Object v9 = com.google.javascript.jscomp.NodeUtil.newVarNode(((java.lang.String)v2),((com.google.javascript.rhino.Node)v8));
    Object v10 = new com.google.javascript.rhino.JSDocInfo();
    ((com.google.javascript.rhino.Node)v9).setJSDocInfo(((com.google.javascript.rhino.JSDocInfo)v10));
    Object v11 = null;
    Object v12 = 53;
    Object v13 = 10;
    Object v14 = com.google.javascript.jscomp.NodeUtil.newFunctionNode(((java.lang.String)v0),((java.util.List)v1),((com.google.javascript.rhino.Node)v9),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = com.google.javascript.jscomp.NodeUtil.getFnParameters(((com.google.javascript.rhino.Node)v14));
    Object v16 = ((com.google.javascript.rhino.Node)v15).getJsDocBuilderForNode();
    Object v17 = new com.google.javascript.rhino.Node[]{null,null,null};
    Object v18 = com.google.javascript.jscomp.NodeUtil.newCallNode(((com.google.javascript.rhino.Node)v15),((com.google.javascript.rhino.Node[])v17));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = "";
    Object v1 = new java.util.ArrayList();
    Object v2 = "_";
    Object v3 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot();
    Object v4 = "";
    Object v5 = true;
    Object v6 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v8 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v3),((java.lang.String)v4),((com.google.javascript.jscomp.parsing.Config)v6),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v7));
    Object v9 = com.google.javascript.jscomp.NodeUtil.newVarNode(((java.lang.String)v2),((com.google.javascript.rhino.Node)v8));
    Object v10 = -2;
    Object v11 = 0;
    Object v12 = com.google.javascript.jscomp.NodeUtil.newFunctionNode(((java.lang.String)v0),((java.util.List)v1),((com.google.javascript.rhino.Node)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = "o";
    Object v14 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(((com.google.javascript.rhino.Node)v12),((java.lang.String)v13));
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = "_";
    Object v1 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot();
    Object v2 = "";
    Object v3 = true;
    Object v4 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v6 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v1),((java.lang.String)v2),((com.google.javascript.jscomp.parsing.Config)v4),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v5));
    Object v7 = com.google.javascript.jscomp.NodeUtil.newVarNode(((java.lang.String)v0),((com.google.javascript.rhino.Node)v6));
    Object v8 = com.google.javascript.jscomp.NodeUtil.getAssignedValue(((com.google.javascript.rhino.Node)v7));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = "_";
    Object v1 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot();
    Object v2 = "";
    Object v3 = true;
    Object v4 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v6 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v1),((java.lang.String)v2),((com.google.javascript.jscomp.parsing.Config)v4),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v5));
    Object v7 = com.google.javascript.jscomp.NodeUtil.newVarNode(((java.lang.String)v0),((com.google.javascript.rhino.Node)v6));
    Object v8 = com.google.javascript.jscomp.NodeUtil.getRootOfQualifiedName(((com.google.javascript.rhino.Node)v7));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = "";
    Object v1 = 1;
    Object v2 = -28;
    Object v3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = 1;
    Object v2 = -28;
    Object v3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = com.google.javascript.jscomp.NodeUtil.hasFinally(((com.google.javascript.rhino.Node)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = "";
    Object v1 = 1;
    Object v2 = -28;
    Object v3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = com.google.javascript.jscomp.NodeUtil.isVar(((com.google.javascript.rhino.Node)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = "";
    Object v1 = 1;
    Object v2 = -28;
    Object v3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = com.google.javascript.jscomp.NodeUtil.isCall(((com.google.javascript.rhino.Node)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = "";
    Object v1 = 1;
    Object v2 = -28;
    Object v3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    ((com.google.javascript.rhino.Node)v3).detachChildren();
    Object v4 = null;
    Object v5 = com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(((com.google.javascript.rhino.Node)v3));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = "";
    Object v1 = 0;
    Object v2 = 0;
    Object v3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = 0;
    Object v2 = 0;
    Object v3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = com.google.javascript.jscomp.NodeUtil.isStatement(((com.google.javascript.rhino.Node)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = "his";
    Object v1 = com.google.javascript.jscomp.NodeUtil.isValidPropertyName(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(true), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = 1;
    Object v2 = -28;
    Object v3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = com.google.javascript.jscomp.NodeUtil.getOpFromAssignmentOp(((com.google.javascript.rhino.Node)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = "";
    Object v1 = 0;
    Object v2 = 0;
    Object v3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = com.google.javascript.jscomp.NodeUtil.isForIn(((com.google.javascript.rhino.Node)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = "";
    Object v1 = 0;
    Object v2 = 0;
    Object v3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = 0;
    ((com.google.javascript.rhino.Node)v3).setCharno((((java.lang.Integer)v4).intValue()));
    Object v5 = null;
    Object v6 = com.google.javascript.jscomp.NodeUtil.isString(((com.google.javascript.rhino.Node)v3));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = 1;
    Object v2 = -28;
    Object v3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((com.google.javascript.rhino.Node)v3).isUnscopedQualifiedName();
    Object v5 = com.google.javascript.jscomp.NodeUtil.getFunctionName(((com.google.javascript.rhino.Node)v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = "";
    Object v1 = 0;
    Object v2 = 0;
    Object v3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(((com.google.javascript.rhino.Node)v3));
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = "";
    Object v1 = 0;
    Object v2 = 0;
    Object v3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = com.google.javascript.jscomp.NodeUtil.isCall(((com.google.javascript.rhino.Node)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = "";
    Object v1 = 1;
    Object v2 = -28;
    Object v3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(((com.google.javascript.rhino.Node)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = "";
    Object v1 = 1;
    Object v2 = -28;
    Object v3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((com.google.javascript.rhino.Node)v3).isUnscopedQualifiedName();
    Object v5 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(((com.google.javascript.rhino.Node)v3));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = "";
    Object v1 = 0;
    Object v2 = 0;
    Object v3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(((com.google.javascript.rhino.Node)v3));
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = "";
    Object v1 = 0;
    Object v2 = 0;
    Object v3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = com.google.javascript.jscomp.NodeUtil.isEmptyFunctionExpression(((com.google.javascript.rhino.Node)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = "";
    Object v1 = 0;
    Object v2 = 0;
    Object v3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = com.google.javascript.jscomp.NodeUtil.isVar(((com.google.javascript.rhino.Node)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = "";
    Object v1 = 0;
    Object v2 = 0;
    Object v3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = com.google.javascript.jscomp.NodeUtil.isNew(((com.google.javascript.rhino.Node)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = "";
    Object v1 = 1;
    Object v2 = -28;
    Object v3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = com.google.javascript.jscomp.NodeUtil.isNew(((com.google.javascript.rhino.Node)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = "";
    Object v1 = 1;
    Object v2 = -28;
    Object v3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((com.google.javascript.rhino.Node)v3).getJsDocBuilderForNode();
    Object v5 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v3));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = "";
    Object v1 = 1;
    Object v2 = -28;
    Object v3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = new java.util.TreeSet();
    Object v5 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(((com.google.javascript.rhino.Node)v3),((java.util.Set)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = "";
    Object v1 = 0;
    Object v2 = 0;
    Object v3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = com.google.javascript.jscomp.NodeUtil.getSourceName(((com.google.javascript.rhino.Node)v3));
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = "";
    Object v1 = 0;
    Object v2 = 0;
    Object v3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = com.google.javascript.jscomp.NodeUtil.isExprCall(((com.google.javascript.rhino.Node)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = "";
    Object v1 = 0;
    Object v2 = 0;
    Object v3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(((com.google.javascript.rhino.Node)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = "_";
    Object v1 = new com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot();
    Object v2 = "";
    Object v3 = true;
    Object v4 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino();
    Object v6 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot)v1),((java.lang.String)v2),((com.google.javascript.jscomp.parsing.Config)v4),((com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)v5));
    Object v7 = com.google.javascript.jscomp.NodeUtil.newVarNode(((java.lang.String)v0),((com.google.javascript.rhino.Node)v6));
    Object v8 = "";
    Object v9 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(((com.google.javascript.rhino.Node)v7),((java.lang.String)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = "";
    Object v1 = 1;
    Object v2 = -28;
    Object v3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = com.google.javascript.jscomp.NodeUtil.isThis(((com.google.javascript.rhino.Node)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = "";
    Object v1 = 0;
    Object v2 = 0;
    Object v3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = com.google.javascript.jscomp.NodeUtil.getRootOfQualifiedName(((com.google.javascript.rhino.Node)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = "";
    Object v1 = 0;
    Object v2 = 0;
    Object v3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = com.google.javascript.jscomp.NodeUtil.getRootOfQualifiedName(((com.google.javascript.rhino.Node)v3));
    Object v5 = false;
    Object v6 = false;
    Object v7 = false;
    Object v8 = ((com.google.javascript.rhino.Node)v4).toString((((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = com.google.javascript.jscomp.NodeUtil.containsFunction(((com.google.javascript.rhino.Node)v4));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = 1;
    Object v1 = com.google.javascript.jscomp.NodeUtil.opToStr((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = "";
    Object v1 = 0;
    Object v2 = 0;
    Object v3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = com.google.javascript.jscomp.NodeUtil.getRootOfQualifiedName(((com.google.javascript.rhino.Node)v3));
    Object v5 = com.google.javascript.jscomp.NodeUtil.isEmptyBlock(((com.google.javascript.rhino.Node)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = "";
    Object v1 = 0;
    Object v2 = 0;
    Object v3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = com.google.javascript.jscomp.NodeUtil.getRootOfQualifiedName(((com.google.javascript.rhino.Node)v3));
    Object v5 = new java.util.TreeSet();
    ((com.google.javascript.rhino.Node)v4).setDirectives(((java.util.Set)v5));
    Object v6 = null;
    Object v7 = com.google.javascript.jscomp.NodeUtil.isGetProp(((com.google.javascript.rhino.Node)v4));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = "";
    Object v1 = 0;
    Object v2 = 0;
    Object v3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = com.google.javascript.jscomp.NodeUtil.getRootOfQualifiedName(((com.google.javascript.rhino.Node)v3));
    Object v5 = com.google.javascript.jscomp.NodeUtil.isConstantName(((com.google.javascript.rhino.Node)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = "";
    Object v1 = 0;
    Object v2 = 0;
    Object v3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = "";
    Object v5 = 0;
    Object v6 = 0;
    Object v7 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(((java.lang.String)v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = com.google.javascript.jscomp.NodeUtil.isLhs(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.Node)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }
}
