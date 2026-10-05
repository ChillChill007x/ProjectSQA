package com.google.javascript.jscomp;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = -16;
    Object v1 = "c-";
    Object v2 = 0;
    Object v3 = 55;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = ((com.google.javascript.rhino.Node)v4).getSideEffectFlags();
    Object v6 = com.google.javascript.jscomp.NodeUtil.isThis(((com.google.javascript.rhino.Node)v4));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = -16;
    Object v1 = "c-";
    Object v2 = 0;
    Object v3 = 55;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = com.google.javascript.jscomp.NodeUtil.isNumericResultHelper(((com.google.javascript.rhino.Node)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = -16;
    Object v1 = "c-";
    Object v2 = 0;
    Object v3 = 55;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = -16;
    Object v1 = "c-";
    Object v2 = 0;
    Object v3 = 55;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = ((com.google.javascript.rhino.Node)v4).isNoSideEffectsCall();
    Object v6 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v4));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = -16;
    Object v1 = "c-";
    Object v2 = 0;
    Object v3 = 55;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = com.google.javascript.jscomp.NodeUtil.isEmptyFunctionExpression(((com.google.javascript.rhino.Node)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v1 = "valueOYf";
    Object v2 = 0;
    Object v3 = 1;
    Object v4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(((com.google.javascript.jscomp.CodingConvention)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = -16;
    Object v1 = "c-";
    Object v2 = 0;
    Object v3 = 55;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = ((com.google.javascript.rhino.Node)v4).isNoSideEffectsCall();
    Object v6 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v4));
    Object v7 = com.google.javascript.jscomp.NodeUtil.isEmptyBlock(((com.google.javascript.rhino.Node)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v1 = ((com.google.javascript.jscomp.CodingConvention)v0).getExportSymbolFunction();
    Object v2 = ". ";
    Object v3 = -16;
    Object v4 = "c-";
    Object v5 = 0;
    Object v6 = 55;
    Object v7 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v3).intValue()),((java.lang.String)v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = com.google.javascript.jscomp.NodeUtil.newName(((com.google.javascript.jscomp.CodingConvention)v0),((java.lang.String)v2),((com.google.javascript.rhino.Node)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = -16;
    Object v1 = "c-";
    Object v2 = 0;
    Object v3 = 55;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(((com.google.javascript.rhino.Node)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = -16;
    Object v1 = "c-";
    Object v2 = 0;
    Object v3 = 55;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = ((com.google.javascript.rhino.Node)v4).children();
    Object v6 = com.google.javascript.jscomp.NodeUtil.getFunctionJSDocInfo(((com.google.javascript.rhino.Node)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = -16;
    Object v1 = "c-";
    Object v2 = 0;
    Object v3 = 55;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = ".";
    Object v6 = java.util.logging.Logger.getLogger(((java.lang.String)v5));
    Object v7 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v6));
    Object v8 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v7));
    Object v9 = com.google.javascript.jscomp.NodeUtil.functionCallHasSideEffects(((com.google.javascript.rhino.Node)v4),((com.google.javascript.jscomp.AbstractCompiler)v8));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = -16;
    Object v1 = "c-";
    Object v2 = 0;
    Object v3 = 55;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = ((com.google.javascript.rhino.Node)v4).cloneTree();
    Object v6 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(((com.google.javascript.rhino.Node)v4));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = -16;
    Object v1 = "c-";
    Object v2 = 0;
    Object v3 = 55;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = com.google.javascript.jscomp.NodeUtil.referencesThis(((com.google.javascript.rhino.Node)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v1 = "valueOYf";
    Object v2 = 0;
    Object v3 = 1;
    Object v4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(((com.google.javascript.jscomp.CodingConvention)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = com.google.javascript.jscomp.NodeUtil.isThis(((com.google.javascript.rhino.Node)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = -16;
    Object v1 = "c-";
    Object v2 = 0;
    Object v3 = 55;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = -16;
    Object v6 = "c-";
    Object v7 = 0;
    Object v8 = 55;
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v5).intValue()),((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = ((com.google.javascript.rhino.Node)v4).copyInformationFromForTree(((com.google.javascript.rhino.Node)v9));
    Object v11 = com.google.javascript.jscomp.NodeUtil.isForIn(((com.google.javascript.rhino.Node)v4));
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = -16;
    Object v1 = "c-";
    Object v2 = 0;
    Object v3 = 55;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = ((com.google.javascript.rhino.Node)v4).isNoSideEffectsCall();
    Object v6 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v4));
    Object v7 = 1;
    ((com.google.javascript.rhino.Node)v6).setSourcePositionForTree((((java.lang.Integer)v7).intValue()));
    Object v8 = null;
    Object v9 = com.google.javascript.jscomp.NodeUtil.getCatchBlock(((com.google.javascript.rhino.Node)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = 0;
    Object v1 = com.google.javascript.jscomp.NodeUtil.isStrWhiteSpaceChar((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.TernaryValue.FALSE), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = 1;
    Object v1 = com.google.javascript.jscomp.NodeUtil.opToStr((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = -16;
    Object v1 = "c-";
    Object v2 = 0;
    Object v3 = 55;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v4));
    Object v6 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(((com.google.javascript.rhino.Node)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = -16;
    Object v1 = "c-";
    Object v2 = 0;
    Object v3 = 55;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = com.google.javascript.jscomp.NodeUtil.isExprAssign(((com.google.javascript.rhino.Node)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = -16;
    Object v1 = "c-";
    Object v2 = 0;
    Object v3 = 55;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = new com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate();
    Object v6 = com.google.javascript.jscomp.NodeUtil.valueCheck(((com.google.javascript.rhino.Node)v4),((com.google.common.base.Predicate)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = -16;
    Object v1 = "c-";
    Object v2 = 0;
    Object v3 = 55;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(((com.google.javascript.rhino.Node)v4));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v1 = "valueOYf";
    Object v2 = 0;
    Object v3 = 1;
    Object v4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(((com.google.javascript.jscomp.CodingConvention)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = com.google.javascript.jscomp.NodeUtil.getAssignedValue(((com.google.javascript.rhino.Node)v4));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = -16;
    Object v1 = "c-";
    Object v2 = 0;
    Object v3 = 55;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = ((com.google.javascript.rhino.Node)v4).removeChildren();
    Object v6 = new com.google.javascript.rhino.Node[]{null};
    Object v7 = com.google.javascript.jscomp.NodeUtil.newCallNode(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node[])v6));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = -16;
    Object v1 = "c-";
    Object v2 = 0;
    Object v3 = 55;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = com.google.javascript.jscomp.NodeUtil.isLabelName(((com.google.javascript.rhino.Node)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v1 = "valueOYf";
    Object v2 = 0;
    Object v3 = 1;
    Object v4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(((com.google.javascript.jscomp.CodingConvention)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = com.google.javascript.jscomp.NodeUtil.isGet(((com.google.javascript.rhino.Node)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = -16;
    Object v1 = "c-";
    Object v2 = 0;
    Object v3 = 55;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = com.google.javascript.jscomp.NodeUtil.isArrayLiteral(((com.google.javascript.rhino.Node)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = -16;
    Object v1 = "c-";
    Object v2 = 0;
    Object v3 = 55;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = ((com.google.javascript.rhino.Node)v4).isNoSideEffectsCall();
    Object v6 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v4));
    Object v7 = com.google.javascript.jscomp.NodeUtil.isNullOrUndefined(((com.google.javascript.rhino.Node)v6));
    org.junit.Assert.assertEquals((Object)(true), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = -16;
    Object v1 = "c-";
    Object v2 = 0;
    Object v3 = 55;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = ((com.google.javascript.rhino.Node)v4).isNoSideEffectsCall();
    Object v6 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v4));
    Object v7 = com.google.javascript.jscomp.NodeUtil.isGetOrSetKey(((com.google.javascript.rhino.Node)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v1 = "valueOYf";
    Object v2 = 0;
    Object v3 = 1;
    Object v4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(((com.google.javascript.jscomp.CodingConvention)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = 5;
    Object v6 = false;
    ((com.google.javascript.rhino.Node)v4).putBooleanProp((((java.lang.Integer)v5).intValue()),(((java.lang.Boolean)v6).booleanValue()));
    Object v7 = null;
    Object v8 = com.google.javascript.jscomp.NodeUtil.getFunctionParameters(((com.google.javascript.rhino.Node)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = -16;
    Object v1 = "c-";
    Object v2 = 0;
    Object v3 = 55;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = false;
    Object v6 = com.google.javascript.jscomp.NodeUtil.mayBeString(((com.google.javascript.rhino.Node)v4),(((java.lang.Boolean)v5).booleanValue()));
    org.junit.Assert.assertEquals((Object)(true), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = -16;
    Object v1 = "c-";
    Object v2 = 0;
    Object v3 = 55;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = ((com.google.javascript.rhino.Node)v4).hasSideEffects();
    Object v6 = com.google.javascript.jscomp.NodeUtil.isForIn(((com.google.javascript.rhino.Node)v4));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = -16;
    Object v1 = "c-";
    Object v2 = 0;
    Object v3 = 55;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(((com.google.javascript.rhino.Node)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = -16;
    Object v1 = "c-";
    Object v2 = 0;
    Object v3 = 55;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = com.google.javascript.jscomp.NodeUtil.isString(((com.google.javascript.rhino.Node)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = -16;
    Object v1 = "c-";
    Object v2 = 0;
    Object v3 = 55;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = ((com.google.javascript.rhino.Node)v4).isNoSideEffectsCall();
    Object v6 = com.google.javascript.jscomp.NodeUtil.isAssign(((com.google.javascript.rhino.Node)v4));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = ".prototyp";
    Object v1 = com.google.javascript.jscomp.NodeUtil.isValidPropertyName(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = -16;
    Object v1 = "c-";
    Object v2 = 0;
    Object v3 = 55;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = com.google.javascript.jscomp.NodeUtil.isVar(((com.google.javascript.rhino.Node)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v1 = "valueOYf";
    Object v2 = 0;
    Object v3 = 1;
    Object v4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(((com.google.javascript.jscomp.CodingConvention)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = "";
    Object v6 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(((com.google.javascript.rhino.Node)v4),((java.lang.String)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = -16;
    Object v1 = "c-";
    Object v2 = 0;
    Object v3 = 55;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = ((com.google.javascript.rhino.Node)v4).isNoSideEffectsCall();
    Object v6 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v4));
    Object v7 = com.google.javascript.jscomp.NodeUtil.getConditionExpression(((com.google.javascript.rhino.Node)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = -16;
    Object v1 = "c-";
    Object v2 = 0;
    Object v3 = 55;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = com.google.javascript.jscomp.NodeUtil.isVarDeclaration(((com.google.javascript.rhino.Node)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = -16;
    Object v1 = "c-";
    Object v2 = 0;
    Object v3 = 55;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(((com.google.javascript.rhino.Node)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = -16;
    Object v1 = "c-";
    Object v2 = 0;
    Object v3 = 55;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v4));
    Object v6 = ".";
    Object v7 = java.util.logging.Logger.getLogger(((java.lang.String)v6));
    Object v8 = -16;
    Object v9 = "c-";
    Object v10 = 0;
    Object v11 = 55;
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v8).intValue()),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = false;
    Object v14 = com.google.javascript.jscomp.NodeUtil.mayBeString(((com.google.javascript.rhino.Node)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = -16;
    Object v16 = "c-";
    Object v17 = 0;
    Object v18 = 55;
    Object v19 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v15).intValue()),((java.lang.String)v16),(((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()));
    Object v20 = com.google.javascript.jscomp.NodeUtil.isEmptyFunctionExpression(((com.google.javascript.rhino.Node)v19));
    Object v21 = java.util.Set.of(((java.lang.Object)v7),((java.lang.Object)v14),((java.lang.Object)v20));
    Object v22 = ((java.util.Set)v21).isEmpty();
    Object v23 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(((com.google.javascript.rhino.Node)v5),((java.util.Set)v21));
    org.junit.Assert.assertEquals((Object)(false), v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = -16;
    Object v1 = "c-";
    Object v2 = 0;
    Object v3 = 55;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = ((com.google.javascript.rhino.Node)v4).isNoSideEffectsCall();
    Object v6 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v4));
    Object v7 = com.google.javascript.jscomp.NodeUtil.getObjectLitKeyName(((com.google.javascript.rhino.Node)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = -16;
    Object v1 = "c-";
    Object v2 = 0;
    Object v3 = 55;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = new com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate();
    Object v6 = new com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate();
    Object v7 = com.google.javascript.jscomp.NodeUtil.has(((com.google.javascript.rhino.Node)v4),((com.google.common.base.Predicate)v5),((com.google.common.base.Predicate)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = -6.03103002249379D;
    Object v1 = com.google.javascript.jscomp.NodeUtil.getStringValue((((java.lang.Double)v0).doubleValue()));
    org.junit.Assert.assertEquals((Object)("-6.03103002249379"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = -16;
    Object v1 = "c-";
    Object v2 = 0;
    Object v3 = 55;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = 87;
    ((com.google.javascript.rhino.Node)v4).removeProp((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    Object v7 = com.google.javascript.jscomp.NodeUtil.isBooleanResultHelper(((com.google.javascript.rhino.Node)v4));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = -16;
    Object v1 = "c-";
    Object v2 = 0;
    Object v3 = 55;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = -16;
    Object v6 = "c-";
    Object v7 = 0;
    Object v8 = 55;
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v5).intValue()),((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v9));
    Object v11 = ((com.google.javascript.rhino.Node)v4).isEquivalentTo(((com.google.javascript.rhino.Node)v10));
    Object v12 = com.google.javascript.jscomp.NodeUtil.isEmptyFunctionExpression(((com.google.javascript.rhino.Node)v4));
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = -16;
    Object v1 = "c-";
    Object v2 = 0;
    Object v3 = 55;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = true;
    Object v6 = com.google.javascript.jscomp.NodeUtil.isLiteralValue(((com.google.javascript.rhino.Node)v4),(((java.lang.Boolean)v5).booleanValue()));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = -16;
    Object v1 = "c-";
    Object v2 = 0;
    Object v3 = 55;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v4));
    Object v6 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(((com.google.javascript.rhino.Node)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = -16;
    Object v1 = "c-";
    Object v2 = 0;
    Object v3 = 55;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = ((com.google.javascript.rhino.Node)v4).isVarArgs();
    Object v6 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(((com.google.javascript.rhino.Node)v4));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = -16;
    Object v1 = "c-";
    Object v2 = 0;
    Object v3 = 55;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = ((com.google.javascript.rhino.Node)v4).isNoSideEffectsCall();
    Object v6 = ".";
    Object v7 = java.util.logging.Logger.getLogger(((java.lang.String)v6));
    Object v8 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v8));
    Object v10 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(((com.google.javascript.rhino.Node)v4),((com.google.javascript.jscomp.AbstractCompiler)v9));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = -16;
    Object v1 = "c-";
    Object v2 = 0;
    Object v3 = 55;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = -16;
    Object v6 = "c-";
    Object v7 = 0;
    Object v8 = 55;
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v5).intValue()),((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = ((com.google.javascript.rhino.Node)v4).copyInformationFromForTree(((com.google.javascript.rhino.Node)v9));
    Object v11 = com.google.javascript.jscomp.NodeUtil.isName(((com.google.javascript.rhino.Node)v4));
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = -16;
    Object v1 = "c-";
    Object v2 = 0;
    Object v3 = 55;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = ((com.google.javascript.rhino.Node)v4).isNoSideEffectsCall();
    Object v6 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v4));
    Object v7 = 1;
    Object v8 = ((com.google.javascript.rhino.Node)v6).getProp((((java.lang.Integer)v7).intValue()));
    Object v9 = com.google.javascript.jscomp.NodeUtil.isPrototypeProperty(((com.google.javascript.rhino.Node)v6));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = -16;
    Object v1 = "c-";
    Object v2 = 0;
    Object v3 = 55;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = -16;
    Object v6 = "c-";
    Object v7 = 0;
    Object v8 = 55;
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v5).intValue()),((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = -16;
    Object v1 = "c-";
    Object v2 = 0;
    Object v3 = 55;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = new com.google.javascript.rhino.Node[]{null,null};
    Object v6 = com.google.javascript.jscomp.NodeUtil.newCallNode(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node[])v5));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v1 = "valueOYf";
    Object v2 = 0;
    Object v3 = 1;
    Object v4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(((com.google.javascript.jscomp.CodingConvention)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = com.google.javascript.jscomp.NodeUtil.isFunction(((com.google.javascript.rhino.Node)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = -16;
    Object v1 = "c-";
    Object v2 = 0;
    Object v3 = 55;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = com.google.javascript.jscomp.NodeUtil.hasFinally(((com.google.javascript.rhino.Node)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = -16;
    Object v1 = "c-";
    Object v2 = 0;
    Object v3 = 55;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = ((com.google.javascript.rhino.Node)v4).isNoSideEffectsCall();
    Object v6 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v4));
    Object v7 = com.google.javascript.jscomp.NodeUtil.hasFinally(((com.google.javascript.rhino.Node)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = -16;
    Object v1 = "c-";
    Object v2 = 0;
    Object v3 = 55;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = ((com.google.javascript.rhino.Node)v4).isNoSideEffectsCall();
    Object v6 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v4));
    Object v7 = com.google.javascript.jscomp.NodeUtil.isVarDeclaration(((com.google.javascript.rhino.Node)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = -16;
    Object v1 = "c-";
    Object v2 = 0;
    Object v3 = 55;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v4));
    Object v6 = new com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate();
    Object v7 = -16;
    Object v8 = "c-";
    Object v9 = 0;
    Object v10 = 55;
    Object v11 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = com.google.javascript.jscomp.NodeUtil.isNumericResultHelper(((com.google.javascript.rhino.Node)v11));
    Object v13 = ((com.google.common.base.Predicate)v6).equals(((java.lang.Object)v12));
    Object v14 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(((com.google.javascript.rhino.Node)v5),((com.google.common.base.Predicate)v6));
    org.junit.Assert.assertEquals((Object)(true), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = -24;
    Object v1 = com.google.javascript.jscomp.NodeUtil.isCommutative((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = -16;
    Object v1 = "c-";
    Object v2 = 0;
    Object v3 = 55;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = com.google.javascript.jscomp.NodeUtil.isGet(((com.google.javascript.rhino.Node)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = -16;
    Object v1 = "c-";
    Object v2 = 0;
    Object v3 = 55;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = null;
    Object v6 = com.google.javascript.jscomp.NodeUtil.getObjectLitKeyTypeFromValueType(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.jstype.JSType)v5));
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = -16;
    Object v1 = "c-";
    Object v2 = 0;
    Object v3 = 55;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = ((com.google.javascript.rhino.Node)v4).isNoSideEffectsCall();
    Object v6 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v4));
    Object v7 = com.google.javascript.jscomp.NodeUtil.getPureBooleanValue(((com.google.javascript.rhino.Node)v6));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.TernaryValue.FALSE), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v1 = "valueOYf";
    Object v2 = 0;
    Object v3 = 1;
    Object v4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(((com.google.javascript.jscomp.CodingConvention)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(((com.google.javascript.rhino.Node)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = -16;
    Object v1 = "c-";
    Object v2 = 0;
    Object v3 = 55;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = ((com.google.javascript.rhino.Node)v4).isNoSideEffectsCall();
    Object v6 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v4));
    Object v7 = com.google.javascript.jscomp.NodeUtil.isFunctionExpression(((com.google.javascript.rhino.Node)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = -16;
    Object v1 = "c-";
    Object v2 = 0;
    Object v3 = 55;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = ((com.google.javascript.rhino.Node)v4).isNoSideEffectsCall();
    Object v6 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v4));
    Object v7 = ":";
    Object v8 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(((com.google.javascript.rhino.Node)v6),((java.lang.String)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = -16;
    Object v1 = "c-";
    Object v2 = 0;
    Object v3 = 55;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = com.google.javascript.jscomp.NodeUtil.getObjectLitKeyName(((com.google.javascript.rhino.Node)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v1 = "valueOYf";
    Object v2 = 0;
    Object v3 = 1;
    Object v4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(((com.google.javascript.jscomp.CodingConvention)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = com.google.javascript.jscomp.NodeUtil.hasCatchHandler(((com.google.javascript.rhino.Node)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = -16;
    Object v1 = "c-";
    Object v2 = 0;
    Object v3 = 55;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = ((com.google.javascript.rhino.Node)v4).isNoSideEffectsCall();
    Object v6 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v4));
    Object v7 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(((com.google.javascript.rhino.Node)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = -16;
    Object v1 = "c-";
    Object v2 = 0;
    Object v3 = 55;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = ((com.google.javascript.rhino.Node)v4).isNoSideEffectsCall();
    Object v6 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v4));
    Object v7 = -16;
    Object v8 = "c-";
    Object v9 = 0;
    Object v10 = 55;
    Object v11 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = ((com.google.javascript.rhino.Node)v6).copyInformationFromForTree(((com.google.javascript.rhino.Node)v11));
    Object v13 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(((com.google.javascript.rhino.Node)v6));
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = -16;
    Object v1 = "c-";
    Object v2 = 0;
    Object v3 = 55;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = com.google.javascript.jscomp.NodeUtil.getInfoForNameNode(((com.google.javascript.rhino.Node)v4));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = -16;
    Object v1 = "c-";
    Object v2 = 0;
    Object v3 = 55;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = ((com.google.javascript.rhino.Node)v4).isNoSideEffectsCall();
    Object v6 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v4));
    Object v7 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(((com.google.javascript.rhino.Node)v6));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.TernaryValue.FALSE), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = 29;
    Object v1 = com.google.javascript.jscomp.NodeUtil.isAssociative((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = -16;
    Object v1 = "c-";
    Object v2 = 0;
    Object v3 = 55;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = ((com.google.javascript.rhino.Node)v4).isNoSideEffectsCall();
    Object v6 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v4));
    Object v7 = new com.google.javascript.rhino.JSDocInfo();
    ((com.google.javascript.rhino.Node)v6).setJSDocInfo(((com.google.javascript.rhino.JSDocInfo)v7));
    Object v8 = null;
    Object v9 = com.google.javascript.jscomp.NodeUtil.mayBeStringHelper(((com.google.javascript.rhino.Node)v6));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = -16;
    Object v1 = "c-";
    Object v2 = 0;
    Object v3 = 55;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = com.google.javascript.jscomp.NodeUtil.isCall(((com.google.javascript.rhino.Node)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = -16;
    Object v1 = "c-";
    Object v2 = 0;
    Object v3 = 55;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(((com.google.javascript.rhino.Node)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = 11;
    Object v1 = com.google.javascript.jscomp.NodeUtil.isStrWhiteSpaceChar((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = -16;
    Object v1 = "c-";
    Object v2 = 0;
    Object v3 = 55;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = ((com.google.javascript.rhino.Node)v4).isNoSideEffectsCall();
    Object v6 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v4));
    Object v7 = com.google.javascript.jscomp.NodeUtil.getSourceName(((com.google.javascript.rhino.Node)v6));
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = -16;
    Object v1 = "c-";
    Object v2 = 0;
    Object v3 = 55;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = ((com.google.javascript.rhino.Node)v4).removeFirstChild();
    Object v6 = -16;
    Object v7 = "c-";
    Object v8 = 0;
    Object v9 = 55;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = 93;
    Object v12 = 0;
    ((com.google.javascript.rhino.Node)v10).putIntProp((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v13 = null;
    com.google.javascript.jscomp.NodeUtil.removeChild(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v10));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = -16;
    Object v1 = "c-";
    Object v2 = 0;
    Object v3 = 55;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = "valueOYf";
    Object v7 = 0;
    Object v8 = 1;
    Object v9 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(((com.google.javascript.jscomp.CodingConvention)v5),((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    ((com.google.javascript.rhino.Node)v4).addChildrenToBack(((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
    Object v11 = com.google.javascript.jscomp.NodeUtil.isReferenceName(((com.google.javascript.rhino.Node)v4));
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = -16;
    Object v1 = "c-";
    Object v2 = 0;
    Object v3 = 55;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = ((com.google.javascript.rhino.Node)v4).isNoSideEffectsCall();
    Object v6 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v4));
    Object v7 = com.google.javascript.jscomp.NodeUtil.getRootOfQualifiedName(((com.google.javascript.rhino.Node)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = -16;
    Object v1 = "c-";
    Object v2 = 0;
    Object v3 = 55;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = -16;
    Object v6 = "c-";
    Object v7 = 0;
    Object v8 = 55;
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v5).intValue()),((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = com.google.javascript.jscomp.NodeUtil.isControlStructureCodeBlock(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v9));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = -16;
    Object v1 = "c-";
    Object v2 = 0;
    Object v3 = 55;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = ((com.google.javascript.rhino.Node)v4).isNoSideEffectsCall();
    Object v6 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v4));
    Object v7 = -16;
    Object v8 = "c-";
    Object v9 = 0;
    Object v10 = 55;
    Object v11 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = 33;
    ((com.google.javascript.rhino.Node)v11).setSourcePositionForTree((((java.lang.Integer)v12).intValue()));
    Object v13 = null;
    Object v14 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v11));
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v1 = "valueOYf";
    Object v2 = 0;
    Object v3 = 1;
    Object v4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(((com.google.javascript.jscomp.CodingConvention)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = com.google.javascript.jscomp.NodeUtil.getNumberValue(((com.google.javascript.rhino.Node)v4));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = com.google.javascript.jscomp.NodeUtil.getStringValue((((java.lang.Double)v0).doubleValue()));
    org.junit.Assert.assertEquals((Object)("0"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v1 = ((com.google.javascript.jscomp.CodingConvention)v0).getDelegateSuperclassName();
    Object v2 = "/** Begin line";
    Object v3 = -16;
    Object v4 = "c-";
    Object v5 = 0;
    Object v6 = 55;
    Object v7 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v3).intValue()),((java.lang.String)v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = ((com.google.javascript.rhino.Node)v7).isNoSideEffectsCall();
    Object v9 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v7));
    Object v10 = ((com.google.javascript.rhino.Node)v9).isOnlyModifiesThisCall();
    Object v11 = com.google.javascript.jscomp.NodeUtil.newName(((com.google.javascript.jscomp.CodingConvention)v0),((java.lang.String)v2),((com.google.javascript.rhino.Node)v9));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = -16;
    Object v1 = "c-";
    Object v2 = 0;
    Object v3 = 55;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = ((com.google.javascript.rhino.Node)v4).isNoSideEffectsCall();
    Object v6 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v4));
    Object v7 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(((com.google.javascript.rhino.Node)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v1 = "valueOYf";
    Object v2 = 0;
    Object v3 = 1;
    Object v4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(((com.google.javascript.jscomp.CodingConvention)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = ((com.google.javascript.rhino.Node)v4).isQualifiedName();
    Object v6 = com.google.javascript.jscomp.NodeUtil.isTryCatchNodeContainer(((com.google.javascript.rhino.Node)v4));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = -16;
    Object v1 = "c-";
    Object v2 = 0;
    Object v3 = 55;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(((com.google.javascript.rhino.Node)v4));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = -16;
    Object v1 = "c-";
    Object v2 = 0;
    Object v3 = 55;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = com.google.javascript.jscomp.NodeUtil.isGetOrSetKey(((com.google.javascript.rhino.Node)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = -16;
    Object v1 = "c-";
    Object v2 = 0;
    Object v3 = 55;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = com.google.javascript.jscomp.NodeUtil.tryMergeBlock(((com.google.javascript.rhino.Node)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = -16;
    Object v1 = "c-";
    Object v2 = 0;
    Object v3 = 55;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = ((com.google.javascript.rhino.Node)v4).getJSDocInfo();
    Object v6 = new com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate();
    Object v7 = com.google.javascript.jscomp.NodeUtil.valueCheck(((com.google.javascript.rhino.Node)v4),((com.google.common.base.Predicate)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = -16;
    Object v1 = "c-";
    Object v2 = 0;
    Object v3 = 55;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = new com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate();
    Object v6 = new com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate();
    Object v7 = com.google.javascript.jscomp.NodeUtil.getCount(((com.google.javascript.rhino.Node)v4),((com.google.common.base.Predicate)v5),((com.google.common.base.Predicate)v6));
    org.junit.Assert.assertEquals((Object)(0), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = -16;
    Object v1 = "c-";
    Object v2 = 0;
    Object v3 = 55;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = ((com.google.javascript.rhino.Node)v4).isNoSideEffectsCall();
    Object v6 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v4));
    Object v7 = -16;
    Object v8 = "c-";
    Object v9 = 0;
    Object v10 = 55;
    Object v11 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = com.google.javascript.jscomp.NodeUtil.isVarOrSimpleAssignLhs(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v11));
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = -16;
    Object v1 = "c-";
    Object v2 = 0;
    Object v3 = 55;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = ((com.google.javascript.rhino.Node)v4).isNoSideEffectsCall();
    Object v6 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v4));
    Object v7 = -16;
    Object v8 = "c-";
    Object v9 = 0;
    Object v10 = 55;
    Object v11 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v11));
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = -16;
    Object v1 = "c-";
    Object v2 = 0;
    Object v3 = 55;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCallOrApply(((com.google.javascript.rhino.Node)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v1 = ((com.google.javascript.jscomp.CodingConvention)v0).getDelegateSuperclassName();
    Object v2 = "/** Begin line";
    Object v3 = -16;
    Object v4 = "c-";
    Object v5 = 0;
    Object v6 = 55;
    Object v7 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v3).intValue()),((java.lang.String)v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = ((com.google.javascript.rhino.Node)v7).isNoSideEffectsCall();
    Object v9 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v7));
    Object v10 = ((com.google.javascript.rhino.Node)v9).isOnlyModifiesThisCall();
    Object v11 = com.google.javascript.jscomp.NodeUtil.newName(((com.google.javascript.jscomp.CodingConvention)v0),((java.lang.String)v2),((com.google.javascript.rhino.Node)v9));
    Object v12 = com.google.javascript.jscomp.NodeUtil.newHasLocalResult(((com.google.javascript.rhino.Node)v11));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = -16;
    Object v1 = "c-";
    Object v2 = 0;
    Object v3 = 55;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = com.google.javascript.jscomp.NodeUtil.getAssignedValue(((com.google.javascript.rhino.Node)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = -16;
    Object v1 = "c-";
    Object v2 = 0;
    Object v3 = 55;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = com.google.javascript.jscomp.NodeUtil.isName(((com.google.javascript.rhino.Node)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }
}
