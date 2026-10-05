package com.google.javascript.jscomp;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = ">";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = com.google.javascript.jscomp.NodeUtil.isThis(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = ">";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = com.google.javascript.jscomp.NodeUtil.hasCatchHandler(((com.google.javascript.rhino.Node)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = ">";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = com.google.javascript.jscomp.NodeUtil.isGetOrSetKey(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = ">";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = ">";
    Object v3 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v2));
    Object v4 = ((com.google.javascript.rhino.Node)v1).checkTreeEquals(((com.google.javascript.rhino.Node)v3));
    Object v5 = com.google.javascript.jscomp.NodeUtil.isGetProp(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = ">";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(((com.google.javascript.rhino.Node)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = ">";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = com.google.javascript.jscomp.NodeUtil.isExprAssign(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = ">";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = com.google.javascript.jscomp.NodeUtil.isNumericResultHelper(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = ">";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = -28;
    Object v1 = com.google.javascript.jscomp.NodeUtil.isSimpleOperatorType((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = ">";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = java.util.Set.of();
    ((com.google.javascript.rhino.Node)v1).setDirectives(((java.util.Set)v2));
    Object v3 = null;
    Object v4 = com.google.javascript.jscomp.NodeUtil.isCall(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = ">";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = com.google.javascript.jscomp.NodeUtil.isLoopStructure(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = ">";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = com.google.javascript.jscomp.NodeUtil.isUndefined(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = ">";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = ">";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = ((com.google.javascript.rhino.Node)v1).toStringTree();
    Object v3 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = ">";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = ".";
    Object v3 = java.util.logging.Logger.getLogger(((java.lang.String)v2));
    Object v4 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v4));
    Object v6 = com.google.javascript.jscomp.NodeUtil.functionCallHasSideEffects(((com.google.javascript.rhino.Node)v1),((com.google.javascript.jscomp.AbstractCompiler)v5));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = ">";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = ((com.google.javascript.rhino.Node)v1).isNoSideEffectsCall();
    Object v3 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(((com.google.javascript.rhino.Node)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = ">";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = java.util.Set.of();
    Object v3 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(((com.google.javascript.rhino.Node)v1),((java.util.Set)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = ">";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = com.google.javascript.jscomp.NodeUtil.getInfoForNameNode(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = 0;
    Object v1 = com.google.javascript.jscomp.NodeUtil.opToStr((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = ">";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = ((com.google.javascript.rhino.Node)v1).removeFirstChild();
    Object v3 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = ">";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = ((com.google.javascript.rhino.Node)v1).siblings();
    Object v3 = com.google.javascript.jscomp.NodeUtil.getFunctionJSDocInfo(((com.google.javascript.rhino.Node)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = ",";
    Object v1 = ">";
    Object v2 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v1));
    Object v3 = com.google.javascript.jscomp.NodeUtil.newVarNode(((java.lang.String)v0),((com.google.javascript.rhino.Node)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = ">";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = com.google.javascript.jscomp.NodeUtil.isPrototypeProperty(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = ",";
    Object v1 = ">";
    Object v2 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v1));
    Object v3 = com.google.javascript.jscomp.NodeUtil.newVarNode(((java.lang.String)v0),((com.google.javascript.rhino.Node)v2));
    Object v4 = com.google.javascript.jscomp.NodeUtil.isNull(((com.google.javascript.rhino.Node)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = ">";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = false;
    ((com.google.javascript.rhino.Node)v1).setVarArgs((((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    Object v4 = com.google.javascript.jscomp.NodeUtil.isExprCall(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = ">";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = ">";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = com.google.javascript.jscomp.NodeUtil.referencesThis(((com.google.javascript.rhino.Node)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = ">";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = com.google.javascript.jscomp.NodeUtil.isLabelName(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = ">";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = com.google.javascript.jscomp.NodeUtil.isGet(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = ">";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = com.google.javascript.jscomp.NodeUtil.isArrayLiteral(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = ">";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = com.google.javascript.jscomp.NodeUtil.isNullOrUndefined(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = ",";
    Object v1 = ">";
    Object v2 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v1));
    Object v3 = com.google.javascript.jscomp.NodeUtil.newVarNode(((java.lang.String)v0),((com.google.javascript.rhino.Node)v2));
    Object v4 = com.google.javascript.jscomp.NodeUtil.isGet(((com.google.javascript.rhino.Node)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = ">";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = ">";
    Object v3 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v2));
    Object v4 = ">";
    Object v5 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v4));
    ((com.google.javascript.rhino.Node)v1).addChildAfter(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.Node)v5));
    Object v6 = null;
    Object v7 = com.google.javascript.jscomp.NodeUtil.getFunctionParameters(((com.google.javascript.rhino.Node)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = ">";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = com.google.javascript.jscomp.NodeUtil.isBooleanResultHelper(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = ">";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = ((com.google.javascript.rhino.Node)v1).toStringTree();
    Object v3 = com.google.javascript.jscomp.NodeUtil.isForIn(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = "!";
    Object v1 = com.google.javascript.jscomp.NodeUtil.getStringNumberValue(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = ">";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = ">";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v1));
    Object v3 = com.google.javascript.jscomp.NodeUtil.isGetProp(((com.google.javascript.rhino.Node)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = ">";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = com.google.javascript.jscomp.NodeUtil.mayBeStringHelper(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = ">";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCallOrApply(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = ">";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = com.google.javascript.jscomp.NodeUtil.getLoopCodeBlock(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = ">";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = com.google.javascript.jscomp.NodeUtil.isForIn(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v1 = "[";
    Object v2 = ((com.google.javascript.jscomp.CodingConvention)v0).isConstantKey(((java.lang.String)v1));
    Object v3 = "4";
    Object v4 = ">";
    Object v5 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v4));
    Object v6 = ((com.google.javascript.rhino.Node)v5).removeFirstChild();
    Object v7 = "";
    Object v8 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(((com.google.javascript.jscomp.CodingConvention)v0),((java.lang.String)v3),((com.google.javascript.rhino.Node)v5),((java.lang.String)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = ">";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v1));
    Object v3 = com.google.javascript.jscomp.NodeUtil.isExprAssign(((com.google.javascript.rhino.Node)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = ">";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = ">";
    Object v3 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v2));
    com.google.javascript.jscomp.NodeUtil.removeChild(((com.google.javascript.rhino.Node)v1),((com.google.javascript.rhino.Node)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = "=";
    Object v1 = ">";
    Object v2 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v1));
    Object v3 = com.google.javascript.jscomp.NodeUtil.newVarNode(((java.lang.String)v0),((com.google.javascript.rhino.Node)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = -8;
    Object v1 = com.google.javascript.jscomp.NodeUtil.isAssociative((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = "=";
    Object v1 = ">";
    Object v2 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v1));
    Object v3 = com.google.javascript.jscomp.NodeUtil.newVarNode(((java.lang.String)v0),((com.google.javascript.rhino.Node)v2));
    Object v4 = ((com.google.javascript.rhino.Node)v3).getDirectives();
    Object v5 = com.google.javascript.jscomp.NodeUtil.getCatchBlock(((com.google.javascript.rhino.Node)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = ">";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = 43;
    ((com.google.javascript.rhino.Node)v1).setCharno((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    Object v4 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCallOrApply(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = ">";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v1));
    Object v3 = "toStaring";
    Object v4 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(((com.google.javascript.rhino.Node)v2),((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.NodeUtil.isValidPropertyName(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.NodeUtil.getStringNumberValue(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(0.0D), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = ">";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = com.google.javascript.jscomp.NodeUtil.isLValue(((com.google.javascript.rhino.Node)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = ">";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = ">";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = ",";
    Object v1 = ">";
    Object v2 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v1));
    Object v3 = com.google.javascript.jscomp.NodeUtil.newVarNode(((java.lang.String)v0),((com.google.javascript.rhino.Node)v2));
    Object v4 = com.google.javascript.jscomp.NodeUtil.isTryCatchNodeContainer(((com.google.javascript.rhino.Node)v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = ">";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = true;
    ((com.google.javascript.rhino.Node)v1).setWasEmptyNode((((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    Object v4 = com.google.javascript.jscomp.NodeUtil.isLabelName(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = ">";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v1));
    Object v3 = java.util.Set.of();
    ((com.google.javascript.rhino.Node)v2).setDirectives(((java.util.Set)v3));
    Object v4 = null;
    Object v5 = ",";
    Object v6 = ">";
    Object v7 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v6));
    Object v8 = com.google.javascript.jscomp.NodeUtil.newVarNode(((java.lang.String)v5),((com.google.javascript.rhino.Node)v7));
    Object v9 = "-1";
    com.google.javascript.jscomp.NodeUtil.setDebugInformation(((com.google.javascript.rhino.Node)v2),((com.google.javascript.rhino.Node)v8),((java.lang.String)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = ">";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = ">";
    Object v3 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v2));
    Object v4 = ((com.google.javascript.rhino.Node)v1).clonePropsFrom(((com.google.javascript.rhino.Node)v3));
    Object v5 = com.google.javascript.jscomp.NodeUtil.getRootOfQualifiedName(((com.google.javascript.rhino.Node)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = ">";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v1));
    Object v3 = ".";
    Object v4 = java.util.logging.Logger.getLogger(((java.lang.String)v3));
    Object v5 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v4));
    Object v6 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v5));
    Object v7 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(((com.google.javascript.rhino.Node)v2),((com.google.javascript.jscomp.AbstractCompiler)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = ">";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = com.google.javascript.jscomp.NodeUtil.isFunction(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.NodeUtil.trimJsWhiteSpace(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(""), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = 0;
    Object v1 = com.google.javascript.jscomp.NodeUtil.isCommutative((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = ">";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = com.google.javascript.jscomp.NodeUtil.isAssign(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = "=";
    Object v1 = ">";
    Object v2 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v1));
    Object v3 = com.google.javascript.jscomp.NodeUtil.newVarNode(((java.lang.String)v0),((com.google.javascript.rhino.Node)v2));
    Object v4 = com.google.javascript.jscomp.NodeUtil.getFunctionJSDocInfo(((com.google.javascript.rhino.Node)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v1 = "[";
    Object v2 = ((com.google.javascript.jscomp.CodingConvention)v0).isConstantKey(((java.lang.String)v1));
    Object v3 = "4";
    Object v4 = ">";
    Object v5 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v4));
    Object v6 = ((com.google.javascript.rhino.Node)v5).removeFirstChild();
    Object v7 = "";
    Object v8 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(((com.google.javascript.jscomp.CodingConvention)v0),((java.lang.String)v3),((com.google.javascript.rhino.Node)v5),((java.lang.String)v7));
    Object v9 = ((com.google.javascript.rhino.Node)v8).isNoSideEffectsCall();
    Object v10 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(((com.google.javascript.rhino.Node)v8));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = ">";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = new com.google.javascript.rhino.JSDocInfo();
    ((com.google.javascript.rhino.Node)v1).setJSDocInfo(((com.google.javascript.rhino.JSDocInfo)v2));
    Object v3 = null;
    Object v4 = com.google.javascript.jscomp.NodeUtil.getSourceName(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = ">";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = java.util.Set.of();
    Object v3 = "!";
    Object v4 = com.google.javascript.jscomp.NodeUtil.getStringNumberValue(((java.lang.String)v3));
    Object v5 = ((java.util.Set)v2).equals(((java.lang.Object)v4));
    Object v6 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(((com.google.javascript.rhino.Node)v1),((java.util.Set)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = ">";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v1));
    Object v3 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(((com.google.javascript.rhino.Node)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = ">";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = com.google.javascript.jscomp.NodeUtil.getArrayElementStringValue(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = ">";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = "PRI,ATE";
    Object v3 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(((com.google.javascript.rhino.Node)v1),((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = ">";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = "";
    Object v3 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(((com.google.javascript.rhino.Node)v1),((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = "=";
    Object v1 = ">";
    Object v2 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v1));
    Object v3 = com.google.javascript.jscomp.NodeUtil.newVarNode(((java.lang.String)v0),((com.google.javascript.rhino.Node)v2));
    Object v4 = com.google.javascript.jscomp.NodeUtil.getRootOfQualifiedName(((com.google.javascript.rhino.Node)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = ",";
    Object v1 = ">";
    Object v2 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v1));
    Object v3 = com.google.javascript.jscomp.NodeUtil.newVarNode(((java.lang.String)v0),((com.google.javascript.rhino.Node)v2));
    Object v4 = ((com.google.javascript.rhino.Node)v3).removeFirstChild();
    Object v5 = com.google.javascript.jscomp.NodeUtil.isEmptyBlock(((com.google.javascript.rhino.Node)v3));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = ">";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = new com.google.javascript.jscomp.NodeUtil.NumbericResultPredicate();
    Object v3 = -91;
    Object v4 = new com.google.javascript.rhino.Node.SideEffectFlags((((java.lang.Integer)v3).intValue()));
    Object v5 = ((com.google.common.base.Predicate)v2).equals(((java.lang.Object)v4));
    Object v6 = new com.google.javascript.jscomp.NodeUtil.NumbericResultPredicate();
    Object v7 = com.google.javascript.jscomp.NodeUtil.has(((com.google.javascript.rhino.Node)v1),((com.google.common.base.Predicate)v2),((com.google.common.base.Predicate)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = ">";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = 32;
    Object v3 = true;
    ((com.google.javascript.rhino.Node)v1).putBooleanProp((((java.lang.Integer)v2).intValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v4 = null;
    Object v5 = com.google.javascript.jscomp.NodeUtil.isNull(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = ">";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = ((com.google.javascript.rhino.Node)v1).isVarArgs();
    Object v3 = com.google.javascript.jscomp.NodeUtil.isExprCall(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = ">";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = com.google.javascript.jscomp.NodeUtil.getStringValue(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = ">";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = 12;
    Object v3 = new com.google.javascript.jscomp.NodeUtil.NumbericResultPredicate();
    Object v4 = ">";
    Object v5 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v4));
    Object v6 = com.google.javascript.jscomp.NodeUtil.isBooleanResultHelper(((com.google.javascript.rhino.Node)v5));
    Object v7 = ((com.google.common.base.Predicate)v3).equals(((java.lang.Object)v6));
    Object v8 = com.google.javascript.jscomp.NodeUtil.containsType(((com.google.javascript.rhino.Node)v1),(((java.lang.Integer)v2).intValue()),((com.google.common.base.Predicate)v3));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = ">";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v1));
    Object v3 = com.google.javascript.jscomp.NodeUtil.getPureBooleanValue(((com.google.javascript.rhino.Node)v2));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.TernaryValue.FALSE), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = ">";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = com.google.javascript.jscomp.NodeUtil.getFunctionJSDocInfo(((com.google.javascript.rhino.Node)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = ",";
    Object v1 = ">";
    Object v2 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v1));
    Object v3 = com.google.javascript.jscomp.NodeUtil.newVarNode(((java.lang.String)v0),((com.google.javascript.rhino.Node)v2));
    Object v4 = false;
    Object v5 = false;
    Object v6 = true;
    Object v7 = ((com.google.javascript.rhino.Node)v3).toString((((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = com.google.javascript.jscomp.NodeUtil.newHasLocalResult(((com.google.javascript.rhino.Node)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = ",";
    Object v1 = ">";
    Object v2 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v1));
    Object v3 = com.google.javascript.jscomp.NodeUtil.newVarNode(((java.lang.String)v0),((com.google.javascript.rhino.Node)v2));
    Object v4 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(((com.google.javascript.rhino.Node)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = ">";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = new com.google.javascript.rhino.Node[]{};
    Object v3 = com.google.javascript.jscomp.NodeUtil.newCallNode(((com.google.javascript.rhino.Node)v1),((com.google.javascript.rhino.Node[])v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v1 = "=";
    Object v2 = ">";
    Object v3 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v2));
    Object v4 = com.google.javascript.jscomp.NodeUtil.newVarNode(((java.lang.String)v1),((com.google.javascript.rhino.Node)v3));
    Object v5 = ((com.google.javascript.jscomp.CodingConvention)v0).getDelegateRelationship(((com.google.javascript.rhino.Node)v4));
    Object v6 = "JSCompiler_rnameProperty";
    Object v7 = ">";
    Object v8 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v7));
    Object v9 = com.google.javascript.jscomp.NodeUtil.newName(((com.google.javascript.jscomp.CodingConvention)v0),((java.lang.String)v6),((com.google.javascript.rhino.Node)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = ">";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = 43;
    Object v3 = true;
    ((com.google.javascript.rhino.Node)v1).putBooleanProp((((java.lang.Integer)v2).intValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v4 = null;
    Object v5 = com.google.javascript.jscomp.NodeUtil.isGetOrSetKey(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = "=";
    Object v1 = ">";
    Object v2 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v1));
    Object v3 = com.google.javascript.jscomp.NodeUtil.newVarNode(((java.lang.String)v0),((com.google.javascript.rhino.Node)v2));
    Object v4 = com.google.javascript.jscomp.NodeUtil.getCatchBlock(((com.google.javascript.rhino.Node)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = ",";
    Object v1 = ">";
    Object v2 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v1));
    Object v3 = com.google.javascript.jscomp.NodeUtil.newVarNode(((java.lang.String)v0),((com.google.javascript.rhino.Node)v2));
    Object v4 = com.google.javascript.jscomp.NodeUtil.getFunctionName(((com.google.javascript.rhino.Node)v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = ">";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = com.google.javascript.jscomp.NodeUtil.isTryCatchNodeContainer(((com.google.javascript.rhino.Node)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = ">";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v1));
    Object v3 = com.google.javascript.jscomp.NodeUtil.isVar(((com.google.javascript.rhino.Node)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = ">";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = ((com.google.javascript.rhino.Node)v1).removeFirstChild();
    Object v3 = com.google.javascript.jscomp.NodeUtil.newHasLocalResult(((com.google.javascript.rhino.Node)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = 0;
    Object v1 = com.google.javascript.jscomp.NodeUtil.isStrWhiteSpaceChar((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.TernaryValue.FALSE), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = ">";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = ".";
    Object v3 = java.util.logging.Logger.getLogger(((java.lang.String)v2));
    Object v4 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v4));
    Object v6 = com.google.javascript.jscomp.NodeUtil.constructorCallHasSideEffects(((com.google.javascript.rhino.Node)v1),((com.google.javascript.jscomp.AbstractCompiler)v5));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = ">";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = com.google.javascript.jscomp.NodeUtil.isSimpleFunctionObjectCall(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = ">";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = com.google.javascript.jscomp.NodeUtil.isEmptyBlock(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v1 = "stri$ng";
    Object v2 = 5;
    Object v3 = 1;
    Object v4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(((com.google.javascript.jscomp.CodingConvention)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v1 = "=";
    Object v2 = ">";
    Object v3 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v2));
    Object v4 = com.google.javascript.jscomp.NodeUtil.newVarNode(((java.lang.String)v1),((com.google.javascript.rhino.Node)v3));
    Object v5 = ((com.google.javascript.jscomp.CodingConvention)v0).getDelegateRelationship(((com.google.javascript.rhino.Node)v4));
    Object v6 = "JSCompiler_rnameProperty";
    Object v7 = ">";
    Object v8 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v7));
    Object v9 = com.google.javascript.jscomp.NodeUtil.newName(((com.google.javascript.jscomp.CodingConvention)v0),((java.lang.String)v6),((com.google.javascript.rhino.Node)v8));
    Object v10 = "JSCompiler_ObjectPropeVtyString";
    Object v11 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(((com.google.javascript.rhino.Node)v9),((java.lang.String)v10));
    org.junit.Assert.assertEquals((Object)(0), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = ">";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = com.google.javascript.jscomp.NodeUtil.getConditionExpression(((com.google.javascript.rhino.Node)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v1 = "stri$ng";
    Object v2 = 5;
    Object v3 = 1;
    Object v4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(((com.google.javascript.jscomp.CodingConvention)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = new com.google.javascript.rhino.Node[]{};
    Object v6 = com.google.javascript.jscomp.NodeUtil.newCallNode(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node[])v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = ">";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = com.google.javascript.jscomp.NodeUtil.isEmptyFunctionExpression(((com.google.javascript.rhino.Node)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }
}
