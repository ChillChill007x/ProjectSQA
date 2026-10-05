package com.google.javascript.jscomp;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.rhino.IR.string(((java.lang.String)v0));
    Object v2 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.rhino.IR.string(((java.lang.String)v0));
    Object v2 = "";
    Object v3 = com.google.javascript.rhino.IR.string(((java.lang.String)v2));
    Object v4 = "";
    Object v5 = com.google.javascript.rhino.IR.string(((java.lang.String)v4));
    Object v6 = "";
    Object v7 = com.google.javascript.rhino.IR.string(((java.lang.String)v6));
    Object v8 = "";
    Object v9 = com.google.javascript.rhino.IR.string(((java.lang.String)v8));
    Object v10 = "";
    Object v11 = com.google.javascript.rhino.IR.string(((java.lang.String)v10));
    Object v12 = "";
    Object v13 = com.google.javascript.rhino.IR.string(((java.lang.String)v12));
    Object v14 = "";
    Object v15 = com.google.javascript.rhino.IR.string(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = com.google.javascript.rhino.IR.string(((java.lang.String)v16));
    Object v18 = java.util.Set.of(((java.lang.Object)v3),((java.lang.Object)v5),((java.lang.Object)v7),((java.lang.Object)v9),((java.lang.Object)v11),((java.lang.Object)v13),((java.lang.Object)v15),((java.lang.Object)v17));
    Object v19 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(((com.google.javascript.rhino.Node)v1),((java.util.Set)v18));
    org.junit.Assert.assertEquals((Object)(true), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.rhino.IR.string(((java.lang.String)v0));
    Object v2 = com.google.javascript.jscomp.NodeUtil.getInputId(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = -7;
    Object v1 = com.google.javascript.jscomp.NodeUtil.getInverseOperator((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertEquals((Object)(-1), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.rhino.IR.string(((java.lang.String)v0));
    Object v2 = com.google.javascript.jscomp.NodeUtil.isBooleanResultHelper(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.rhino.IR.string(((java.lang.String)v0));
    Object v2 = com.google.javascript.jscomp.NodeUtil.isLoopStructure(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.rhino.IR.string(((java.lang.String)v0));
    Object v2 = new com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate();
    Object v3 = new com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate();
    Object v4 = new com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate();
    Object v5 = ((com.google.common.base.Predicate)v3).equals(((java.lang.Object)v4));
    Object v6 = com.google.javascript.jscomp.NodeUtil.has(((com.google.javascript.rhino.Node)v1),((com.google.common.base.Predicate)v2),((com.google.common.base.Predicate)v3));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.rhino.IR.string(((java.lang.String)v0));
    Object v2 = com.google.javascript.jscomp.NodeUtil.getBestLValueName(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = com.google.javascript.rhino.IR.string(((java.lang.String)v0));
    Object v2 = com.google.javascript.jscomp.NodeUtil.getOpFromAssignmentOp(((com.google.javascript.rhino.Node)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = com.google.javascript.rhino.IR.string(((java.lang.String)v0));
    Object v2 = com.google.javascript.jscomp.NodeUtil.callHasLocalResult(((com.google.javascript.rhino.Node)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = "L";
    Object v1 = com.google.javascript.jscomp.NodeUtil.isValidQualifiedName(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(true), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.rhino.IR.string(((java.lang.String)v0));
    Object v2 = com.google.javascript.jscomp.NodeUtil.isEmptyFunctionExpression(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.NodeUtil.isValidQualifiedName(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.rhino.IR.string(((java.lang.String)v0));
    Object v2 = "";
    Object v3 = com.google.javascript.rhino.IR.string(((java.lang.String)v2));
    ((com.google.javascript.rhino.Node)v1).addChildrenToFront(((com.google.javascript.rhino.Node)v3));
    Object v4 = null;
    Object v5 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = "I";
    Object v1 = com.google.javascript.jscomp.NodeUtil.isLatin(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(true), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.rhino.IR.string(((java.lang.String)v0));
    Object v2 = com.google.javascript.jscomp.NodeUtil.getArrayElementStringValue(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertEquals((Object)(""), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.rhino.IR.string(((java.lang.String)v0));
    Object v2 = ((com.google.javascript.rhino.Node)v1).getQualifiedName();
    Object v3 = com.google.javascript.jscomp.NodeUtil.isControlStructure(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.rhino.IR.string(((java.lang.String)v0));
    Object v2 = com.google.javascript.jscomp.NodeUtil.getPureBooleanValue(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.TernaryValue.FALSE), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = com.google.javascript.rhino.IR.string(((java.lang.String)v0));
    Object v2 = com.google.javascript.jscomp.NodeUtil.getAssignedValue(((com.google.javascript.rhino.Node)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = com.google.javascript.rhino.IR.string(((java.lang.String)v0));
    Object v2 = ((com.google.javascript.rhino.Node)v1).getStaticSourceFile();
    Object v3 = com.google.javascript.jscomp.NodeUtil.isExpressionResultUsed(((com.google.javascript.rhino.Node)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.rhino.IR.string(((java.lang.String)v0));
    Object v2 = "";
    Object v3 = com.google.javascript.rhino.IR.string(((java.lang.String)v2));
    Object v4 = ((com.google.javascript.rhino.Node)v3).removeFirstChild();
    Object v5 = com.google.javascript.jscomp.NodeUtil.isVarOrSimpleAssignLhs(((com.google.javascript.rhino.Node)v1),((com.google.javascript.rhino.Node)v3));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = com.google.javascript.rhino.IR.string(((java.lang.String)v0));
    Object v2 = com.google.javascript.jscomp.NodeUtil.getRValueOfLValue(((com.google.javascript.rhino.Node)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.rhino.IR.string(((java.lang.String)v0));
    Object v2 = com.google.javascript.jscomp.NodeUtil.referencesThis(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = com.google.javascript.rhino.IR.string(((java.lang.String)v0));
    Object v2 = com.google.javascript.jscomp.NodeUtil.hasCatchHandler(((com.google.javascript.rhino.Node)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = com.google.javascript.rhino.IR.string(((java.lang.String)v0));
    Object v2 = com.google.javascript.jscomp.NodeUtil.isExpressionResultUsed(((com.google.javascript.rhino.Node)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.rhino.IR.string(((java.lang.String)v0));
    Object v2 = "";
    Object v3 = com.google.javascript.rhino.IR.string(((java.lang.String)v2));
    Object v4 = ((com.google.javascript.rhino.Node)v1).copyInformationFromForTree(((com.google.javascript.rhino.Node)v3));
    Object v5 = "\"";
    Object v6 = java.nio.charset.Charset.defaultCharset();
    Object v7 = new java.io.PrintStream(((java.lang.String)v5),((java.nio.charset.Charset)v6));
    Object v8 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v7));
    Object v9 = ((com.google.javascript.jscomp.AbstractCompiler)v8).getProgress();
    Object v10 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(((com.google.javascript.rhino.Node)v1),((com.google.javascript.jscomp.AbstractCompiler)v8));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = com.google.javascript.rhino.IR.string(((java.lang.String)v0));
    Object v2 = false;
    ((com.google.javascript.rhino.Node)v1).setWasEmptyNode((((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    Object v4 = com.google.javascript.jscomp.NodeUtil.isExecutedExactlyOnce(((com.google.javascript.rhino.Node)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = com.google.javascript.rhino.IR.string(((java.lang.String)v0));
    Object v2 = "\"";
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = new java.io.PrintStream(((java.lang.String)v2),((java.nio.charset.Charset)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v4));
    Object v6 = com.google.javascript.jscomp.NodeUtil.functionCallHasSideEffects(((com.google.javascript.rhino.Node)v1),((com.google.javascript.jscomp.AbstractCompiler)v5));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.rhino.IR.string(((java.lang.String)v0));
    Object v2 = "";
    Object v3 = com.google.javascript.rhino.IR.string(((java.lang.String)v2));
    Object v4 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(((com.google.javascript.rhino.Node)v1),((com.google.javascript.rhino.Node)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.rhino.IR.string(((java.lang.String)v0));
    Object v2 = com.google.javascript.jscomp.NodeUtil.isSymmetricOperation(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.rhino.IR.string(((java.lang.String)v0));
    Object v2 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = "Constructor expected as first argument";
    Object v1 = com.google.javascript.jscomp.NodeUtil.getStringNumberValue(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.rhino.IR.string(((java.lang.String)v0));
    Object v2 = com.google.javascript.jscomp.NodeUtil.isUndefined(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.rhino.IR.string(((java.lang.String)v0));
    Object v2 = false;
    Object v3 = com.google.javascript.jscomp.NodeUtil.mayBeString(((com.google.javascript.rhino.Node)v1),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertEquals((Object)(true), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = com.google.javascript.rhino.IR.string(((java.lang.String)v0));
    Object v2 = com.google.javascript.jscomp.NodeUtil.getFunctionName(((com.google.javascript.rhino.Node)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.rhino.IR.string(((java.lang.String)v0));
    Object v2 = com.google.javascript.jscomp.NodeUtil.isRelationalOperation(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = com.google.javascript.rhino.IR.string(((java.lang.String)v0));
    Object v2 = com.google.javascript.jscomp.NodeUtil.getConditionExpression(((com.google.javascript.rhino.Node)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.rhino.IR.string(((java.lang.String)v0));
    Object v2 = com.google.javascript.jscomp.NodeUtil.getBestLValueOwner(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = com.google.javascript.jscomp.CodingConventions.getDefault();
    Object v1 = "";
    Object v2 = com.google.javascript.rhino.IR.string(((java.lang.String)v1));
    Object v3 = 1;
    Object v4 = 1.0F;
    Object v5 = new java.util.HashMap((((java.lang.Integer)v3).intValue()),(((java.lang.Float)v4).floatValue()));
    ((com.google.javascript.jscomp.CodingConvention)v0).checkForCallingConventionDefiningCalls(((com.google.javascript.rhino.Node)v2),((java.util.Map)v5));
    Object v6 = null;
    Object v7 = "{";
    Object v8 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(((com.google.javascript.jscomp.CodingConvention)v0),((java.lang.String)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.rhino.IR.string(((java.lang.String)v0));
    Object v2 = ((com.google.javascript.rhino.Node)v1).isQualifiedName();
    Object v3 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.rhino.IR.string(((java.lang.String)v0));
    Object v2 = com.google.javascript.jscomp.NodeUtil.isExprAssign(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = com.google.javascript.rhino.IR.string(((java.lang.String)v0));
    Object v2 = "";
    Object v3 = com.google.javascript.rhino.IR.string(((java.lang.String)v2));
    Object v4 = "";
    Object v5 = com.google.javascript.rhino.IR.string(((java.lang.String)v4));
    Object v6 = "";
    Object v7 = com.google.javascript.rhino.IR.string(((java.lang.String)v6));
    Object v8 = "";
    Object v9 = com.google.javascript.rhino.IR.string(((java.lang.String)v8));
    Object v10 = "";
    Object v11 = com.google.javascript.rhino.IR.string(((java.lang.String)v10));
    Object v12 = "";
    Object v13 = com.google.javascript.rhino.IR.string(((java.lang.String)v12));
    Object v14 = "";
    Object v15 = com.google.javascript.rhino.IR.string(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = com.google.javascript.rhino.IR.string(((java.lang.String)v16));
    Object v18 = java.util.Set.of(((java.lang.Object)v3),((java.lang.Object)v5),((java.lang.Object)v7),((java.lang.Object)v9),((java.lang.Object)v11),((java.lang.Object)v13),((java.lang.Object)v15),((java.lang.Object)v17));
    ((com.google.javascript.rhino.Node)v1).setDirectives(((java.util.Set)v18));
    Object v19 = null;
    Object v20 = com.google.javascript.jscomp.NodeUtil.getAssignedValue(((com.google.javascript.rhino.Node)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = com.google.javascript.rhino.IR.string(((java.lang.String)v0));
    Object v2 = com.google.javascript.jscomp.NodeUtil.getObjectLitKeyName(((com.google.javascript.rhino.Node)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = com.google.javascript.rhino.IR.string(((java.lang.String)v0));
    Object v2 = new com.google.javascript.rhino.Node[]{null,null};
    Object v3 = com.google.javascript.jscomp.NodeUtil.newCallNode(((com.google.javascript.rhino.Node)v1),((com.google.javascript.rhino.Node[])v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.rhino.IR.string(((java.lang.String)v0));
    Object v2 = com.google.javascript.jscomp.NodeUtil.isEmptyBlock(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.rhino.IR.string(((java.lang.String)v0));
    Object v2 = com.google.javascript.jscomp.NodeUtil.getSourceName(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.rhino.IR.string(((java.lang.String)v0));
    Object v2 = com.google.javascript.jscomp.NodeUtil.getSourceFile(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = com.google.javascript.jscomp.CodingConventions.getDefault();
    Object v1 = "";
    Object v2 = com.google.javascript.rhino.IR.string(((java.lang.String)v1));
    Object v3 = 1;
    Object v4 = 1.0F;
    Object v5 = new java.util.HashMap((((java.lang.Integer)v3).intValue()),(((java.lang.Float)v4).floatValue()));
    ((com.google.javascript.jscomp.CodingConvention)v0).checkForCallingConventionDefiningCalls(((com.google.javascript.rhino.Node)v2),((java.util.Map)v5));
    Object v6 = null;
    Object v7 = "{";
    Object v8 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(((com.google.javascript.jscomp.CodingConvention)v0),((java.lang.String)v7));
    Object v9 = com.google.javascript.jscomp.NodeUtil.isVarDeclaration(((com.google.javascript.rhino.Node)v8));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = com.google.javascript.rhino.IR.string(((java.lang.String)v0));
    Object v2 = com.google.javascript.jscomp.NodeUtil.constructorCallHasSideEffects(((com.google.javascript.rhino.Node)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.rhino.IR.string(((java.lang.String)v0));
    Object v2 = new com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate();
    Object v3 = new com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate();
    Object v4 = com.google.javascript.jscomp.NodeUtil.getCount(((com.google.javascript.rhino.Node)v1),((com.google.common.base.Predicate)v2),((com.google.common.base.Predicate)v3));
    org.junit.Assert.assertEquals((Object)(0), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = com.google.javascript.rhino.IR.string(((java.lang.String)v0));
    Object v2 = "V";
    Object v3 = new com.google.javascript.rhino.InputId(((java.lang.String)v2));
    ((com.google.javascript.rhino.Node)v1).setInputId(((com.google.javascript.rhino.InputId)v3));
    Object v4 = null;
    Object v5 = "";
    Object v6 = com.google.javascript.rhino.IR.string(((java.lang.String)v5));
    Object v7 = "window";
    Object v8 = "";
    Object v9 = java.io.InputStream.nullInputStream();
    Object v10 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v7),((java.lang.String)v8),((java.io.InputStream)v9));
    ((com.google.javascript.rhino.Node)v6).setStaticSourceFile(((com.google.javascript.rhino.jstype.StaticSourceFile)v10));
    Object v11 = null;
    com.google.javascript.jscomp.NodeUtil.removeChild(((com.google.javascript.rhino.Node)v1),((com.google.javascript.rhino.Node)v6));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = com.google.javascript.rhino.IR.string(((java.lang.String)v0));
    Object v2 = ((com.google.javascript.rhino.Node)v1).toStringTree();
    Object v3 = com.google.javascript.jscomp.NodeUtil.getConditionExpression(((com.google.javascript.rhino.Node)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = 19;
    Object v1 = com.google.javascript.jscomp.NodeUtil.isCommutative((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = 13;
    Object v1 = com.google.javascript.jscomp.NodeUtil.isAssociative((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = com.google.javascript.rhino.IR.string(((java.lang.String)v0));
    Object v2 = com.google.javascript.jscomp.NodeUtil.getRootOfQualifiedName(((com.google.javascript.rhino.Node)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.rhino.IR.string(((java.lang.String)v0));
    Object v2 = true;
    ((com.google.javascript.rhino.Node)v1).setIsSyntheticBlock((((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    Object v4 = com.google.javascript.jscomp.NodeUtil.getStringValue(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertEquals((Object)(""), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = com.google.javascript.jscomp.CodingConventions.getDefault();
    Object v1 = "";
    Object v2 = com.google.javascript.rhino.IR.string(((java.lang.String)v1));
    Object v3 = 1;
    Object v4 = 1.0F;
    Object v5 = new java.util.HashMap((((java.lang.Integer)v3).intValue()),(((java.lang.Float)v4).floatValue()));
    ((com.google.javascript.jscomp.CodingConvention)v0).checkForCallingConventionDefiningCalls(((com.google.javascript.rhino.Node)v2),((java.util.Map)v5));
    Object v6 = null;
    Object v7 = "{";
    Object v8 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(((com.google.javascript.jscomp.CodingConvention)v0),((java.lang.String)v7));
    Object v9 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(((com.google.javascript.rhino.Node)v8));
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = com.google.javascript.jscomp.NodeUtil.precedence((((java.lang.Integer)v0).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = com.google.javascript.rhino.IR.string(((java.lang.String)v0));
    Object v2 = "this";
    ((com.google.javascript.rhino.Node)v1).addSuppression(((java.lang.String)v2));
    Object v3 = null;
    Object v4 = com.google.javascript.jscomp.NodeUtil.isExecutedExactlyOnce(((com.google.javascript.rhino.Node)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.rhino.IR.string(((java.lang.String)v0));
    Object v2 = "";
    Object v3 = com.google.javascript.rhino.IR.string(((java.lang.String)v2));
    com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(((com.google.javascript.rhino.Node)v1),((com.google.javascript.rhino.Node)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = com.google.javascript.jscomp.CodingConventions.getDefault();
    Object v1 = "";
    Object v2 = com.google.javascript.rhino.IR.string(((java.lang.String)v1));
    Object v3 = 1;
    Object v4 = 1.0F;
    Object v5 = new java.util.HashMap((((java.lang.Integer)v3).intValue()),(((java.lang.Float)v4).floatValue()));
    ((com.google.javascript.jscomp.CodingConvention)v0).checkForCallingConventionDefiningCalls(((com.google.javascript.rhino.Node)v2),((java.util.Map)v5));
    Object v6 = null;
    Object v7 = "{";
    Object v8 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(((com.google.javascript.jscomp.CodingConvention)v0),((java.lang.String)v7));
    Object v9 = com.google.javascript.jscomp.NodeUtil.isConstantName(((com.google.javascript.rhino.Node)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = 23;
    Object v1 = com.google.javascript.jscomp.NodeUtil.isSimpleOperatorType((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertEquals((Object)(true), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = -9;
    Object v1 = com.google.javascript.jscomp.NodeUtil.opToStrNoFail((((java.lang.Integer)v0).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.rhino.IR.string(((java.lang.String)v0));
    Object v2 = com.google.javascript.jscomp.NodeUtil.isNullOrUndefined(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = com.google.javascript.jscomp.CodingConventions.getDefault();
    Object v1 = "";
    Object v2 = com.google.javascript.rhino.IR.string(((java.lang.String)v1));
    Object v3 = 1;
    Object v4 = 1.0F;
    Object v5 = new java.util.HashMap((((java.lang.Integer)v3).intValue()),(((java.lang.Float)v4).floatValue()));
    ((com.google.javascript.jscomp.CodingConvention)v0).checkForCallingConventionDefiningCalls(((com.google.javascript.rhino.Node)v2),((java.util.Map)v5));
    Object v6 = null;
    Object v7 = "{";
    Object v8 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(((com.google.javascript.jscomp.CodingConvention)v0),((java.lang.String)v7));
    Object v9 = new com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate();
    Object v10 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(((com.google.javascript.rhino.Node)v8),((com.google.common.base.Predicate)v9));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.rhino.IR.string(((java.lang.String)v0));
    Object v2 = "";
    Object v3 = com.google.javascript.rhino.IR.string(((java.lang.String)v2));
    Object v4 = "";
    Object v5 = com.google.javascript.rhino.IR.string(((java.lang.String)v4));
    Object v6 = "";
    Object v7 = com.google.javascript.rhino.IR.string(((java.lang.String)v6));
    Object v8 = "";
    Object v9 = com.google.javascript.rhino.IR.string(((java.lang.String)v8));
    Object v10 = "";
    Object v11 = com.google.javascript.rhino.IR.string(((java.lang.String)v10));
    Object v12 = "";
    Object v13 = com.google.javascript.rhino.IR.string(((java.lang.String)v12));
    Object v14 = "";
    Object v15 = com.google.javascript.rhino.IR.string(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = com.google.javascript.rhino.IR.string(((java.lang.String)v16));
    Object v18 = java.util.Set.of(((java.lang.Object)v3),((java.lang.Object)v5),((java.lang.Object)v7),((java.lang.Object)v9),((java.lang.Object)v11),((java.lang.Object)v13),((java.lang.Object)v15),((java.lang.Object)v17));
    Object v19 = "";
    Object v20 = com.google.javascript.rhino.IR.string(((java.lang.String)v19));
    Object v21 = com.google.javascript.jscomp.NodeUtil.isLoopStructure(((com.google.javascript.rhino.Node)v20));
    Object v22 = ((java.util.Set)v18).equals(((java.lang.Object)v21));
    Object v23 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(((com.google.javascript.rhino.Node)v1),((java.util.Set)v18));
    org.junit.Assert.assertEquals((Object)(true), v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = com.google.javascript.jscomp.CodingConventions.getDefault();
    Object v1 = "";
    Object v2 = com.google.javascript.rhino.IR.string(((java.lang.String)v1));
    Object v3 = 1;
    Object v4 = 1.0F;
    Object v5 = new java.util.HashMap((((java.lang.Integer)v3).intValue()),(((java.lang.Float)v4).floatValue()));
    ((com.google.javascript.jscomp.CodingConvention)v0).checkForCallingConventionDefiningCalls(((com.google.javascript.rhino.Node)v2),((java.util.Map)v5));
    Object v6 = null;
    Object v7 = "{";
    Object v8 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(((com.google.javascript.jscomp.CodingConvention)v0),((java.lang.String)v7));
    Object v9 = "";
    Object v10 = com.google.javascript.rhino.IR.string(((java.lang.String)v9));
    com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = com.google.javascript.jscomp.CodingConventions.getDefault();
    Object v1 = "";
    Object v2 = com.google.javascript.rhino.IR.string(((java.lang.String)v1));
    Object v3 = 1;
    Object v4 = 1.0F;
    Object v5 = new java.util.HashMap((((java.lang.Integer)v3).intValue()),(((java.lang.Float)v4).floatValue()));
    ((com.google.javascript.jscomp.CodingConvention)v0).checkForCallingConventionDefiningCalls(((com.google.javascript.rhino.Node)v2),((java.util.Map)v5));
    Object v6 = null;
    Object v7 = "{";
    Object v8 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(((com.google.javascript.jscomp.CodingConvention)v0),((java.lang.String)v7));
    Object v9 = com.google.javascript.jscomp.NodeUtil.getRootOfQualifiedName(((com.google.javascript.rhino.Node)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = 16;
    Object v1 = com.google.javascript.jscomp.NodeUtil.isStrWhiteSpaceChar((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.TernaryValue.FALSE), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.rhino.IR.string(((java.lang.String)v0));
    Object v2 = "";
    ((com.google.javascript.rhino.Node)v1).addSuppression(((java.lang.String)v2));
    Object v3 = null;
    Object v4 = new com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate();
    Object v5 = "";
    Object v6 = com.google.javascript.rhino.IR.string(((java.lang.String)v5));
    Object v7 = com.google.javascript.jscomp.NodeUtil.isBooleanResultHelper(((com.google.javascript.rhino.Node)v6));
    Object v8 = ((com.google.common.base.Predicate)v4).equals(((java.lang.Object)v7));
    Object v9 = new com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate();
    Object v10 = com.google.javascript.jscomp.NodeUtil.getCount(((com.google.javascript.rhino.Node)v1),((com.google.common.base.Predicate)v4),((com.google.common.base.Predicate)v9));
    org.junit.Assert.assertEquals((Object)(0), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.rhino.IR.string(((java.lang.String)v0));
    Object v2 = com.google.javascript.jscomp.NodeUtil.getLoopCodeBlock(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.rhino.IR.string(((java.lang.String)v0));
    Object v2 = ((com.google.javascript.rhino.Node)v1).getAncestors();
    Object v3 = com.google.javascript.jscomp.NodeUtil.getSourceName(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = com.google.javascript.rhino.IR.string(((java.lang.String)v0));
    Object v2 = 3;
    ((com.google.javascript.rhino.Node)v1).setLength((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    Object v4 = com.google.javascript.jscomp.NodeUtil.getBestLValue(((com.google.javascript.rhino.Node)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.rhino.IR.string(((java.lang.String)v0));
    Object v2 = -14;
    ((com.google.javascript.rhino.Node)v1).setLineno((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    Object v4 = com.google.javascript.jscomp.NodeUtil.isFunctionExpression(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.rhino.IR.string(((java.lang.String)v0));
    Object v2 = com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = "REGEXP_FUNCT";
    Object v1 = com.google.javascript.jscomp.NodeUtil.trimJsWhiteSpace(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("REGEXP_FUNCT"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = 14;
    Object v1 = com.google.javascript.jscomp.NodeUtil.isStrWhiteSpaceChar((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.TernaryValue.FALSE), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.rhino.IR.string(((java.lang.String)v0));
    Object v2 = ((com.google.javascript.rhino.Node)v1).cloneTree();
    Object v3 = com.google.javascript.jscomp.NodeUtil.isNumericResultHelper(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = false;
    Object v1 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v0).booleanValue()));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = false;
    Object v1 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = "";
    Object v3 = com.google.javascript.rhino.IR.string(((java.lang.String)v2));
    Object v4 = "";
    Object v5 = com.google.javascript.rhino.IR.string(((java.lang.String)v4));
    ((com.google.javascript.rhino.Node)v3).addChildToFront(((com.google.javascript.rhino.Node)v5));
    Object v6 = null;
    Object v7 = com.google.javascript.jscomp.NodeUtil.isVarOrSimpleAssignLhs(((com.google.javascript.rhino.Node)v1),((com.google.javascript.rhino.Node)v3));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.rhino.IR.string(((java.lang.String)v0));
    Object v2 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = false;
    Object v1 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = com.google.javascript.jscomp.NodeUtil.hasFinally(((com.google.javascript.rhino.Node)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = false;
    Object v1 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = com.google.javascript.jscomp.NodeUtil.arrayToString(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertEquals((Object)(""), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = 1;
    Object v1 = com.google.javascript.jscomp.NodeUtil.opToStr((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = -66;
    Object v1 = com.google.javascript.jscomp.NodeUtil.opToStr((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = false;
    Object v1 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = "applD";
    ((com.google.javascript.rhino.Node)v1).setSourceFileForTesting(((java.lang.String)v2));
    Object v3 = null;
    Object v4 = "\"";
    Object v5 = java.nio.charset.Charset.defaultCharset();
    Object v6 = new java.io.PrintStream(((java.lang.String)v4),((java.nio.charset.Charset)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v6));
    Object v8 = com.google.javascript.jscomp.NodeUtil.constructorCallHasSideEffects(((com.google.javascript.rhino.Node)v1),((com.google.javascript.jscomp.AbstractCompiler)v7));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.rhino.IR.string(((java.lang.String)v0));
    Object v2 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = false;
    Object v1 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = "\"";
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = new java.io.PrintStream(((java.lang.String)v2),((java.nio.charset.Charset)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v4));
    Object v6 = ((com.google.javascript.jscomp.AbstractCompiler)v5).getTopScope();
    Object v7 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(((com.google.javascript.rhino.Node)v1),((com.google.javascript.jscomp.AbstractCompiler)v5));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.rhino.IR.string(((java.lang.String)v0));
    Object v2 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.TernaryValue.FALSE), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = false;
    Object v1 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = ((com.google.javascript.rhino.Node)v1).isVarArgs();
    Object v3 = com.google.javascript.jscomp.NodeUtil.isConstantName(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = false;
    Object v1 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = "\"";
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = new java.io.PrintStream(((java.lang.String)v2),((java.nio.charset.Charset)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v4));
    Object v6 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(((com.google.javascript.rhino.Node)v1),((com.google.javascript.jscomp.AbstractCompiler)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = false;
    Object v1 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = com.google.javascript.jscomp.NodeUtil.isNumericResult(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = false;
    Object v1 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = com.google.javascript.jscomp.NodeUtil.tryMergeBlock(((com.google.javascript.rhino.Node)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = 34.455997324754044D;
    Object v1 = com.google.javascript.jscomp.NodeUtil.getStringValue((((java.lang.Double)v0).doubleValue()));
    org.junit.Assert.assertEquals((Object)("34.455997324754044"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.rhino.IR.string(((java.lang.String)v0));
    Object v2 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.rhino.IR.string(((java.lang.String)v0));
    Object v2 = false;
    Object v3 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v2).booleanValue()));
    ((com.google.javascript.rhino.Node)v1).addChildrenToBack(((com.google.javascript.rhino.Node)v3));
    Object v4 = null;
    Object v5 = com.google.javascript.jscomp.NodeUtil.referencesThis(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = false;
    Object v1 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = true;
    Object v3 = com.google.javascript.jscomp.NodeUtil.isLiteralValue(((com.google.javascript.rhino.Node)v1),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertEquals((Object)(true), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = false;
    Object v1 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = com.google.javascript.jscomp.NodeUtil.getFunctionJSDocInfo(((com.google.javascript.rhino.Node)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = false;
    Object v1 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = "\"";
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = new java.io.PrintStream(((java.lang.String)v2),((java.nio.charset.Charset)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v4));
    Object v6 = com.google.javascript.jscomp.NodeUtil.constructorCallHasSideEffects(((com.google.javascript.rhino.Node)v1),((com.google.javascript.jscomp.AbstractCompiler)v5));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = false;
    Object v1 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = 34;
    ((com.google.javascript.rhino.Node)v1).setType((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    Object v4 = com.google.javascript.jscomp.NodeUtil.getNumberValue(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertNull(v4);
  }
}
