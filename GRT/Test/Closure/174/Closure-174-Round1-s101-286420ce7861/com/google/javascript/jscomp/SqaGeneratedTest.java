package com.google.javascript.jscomp;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = com.google.javascript.rhino.IR.empty();
    Object v1 = com.google.javascript.jscomp.NodeUtil.isSymmetricOperation(((com.google.javascript.rhino.Node)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = com.google.javascript.rhino.IR.empty();
    Object v1 = com.google.javascript.jscomp.NodeUtil.getStringValue(((com.google.javascript.rhino.Node)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = com.google.javascript.jscomp.NodeUtil.precedence((((java.lang.Integer)v0).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = com.google.javascript.rhino.IR.empty();
    Object v1 = ((com.google.javascript.rhino.Node)v0).getSideEffectFlags();
    Object v2 = com.google.javascript.jscomp.NodeUtil.isNullOrUndefined(((com.google.javascript.rhino.Node)v0));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = com.google.javascript.rhino.IR.empty();
    Object v1 = com.google.javascript.rhino.IR.empty();
    Object v2 = com.google.javascript.jscomp.NodeUtil.isVarOrSimpleAssignLhs(((com.google.javascript.rhino.Node)v0),((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = ",";
    Object v1 = com.google.javascript.jscomp.NodeUtil.isValidSimpleName(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = com.google.javascript.rhino.IR.empty();
    Object v1 = com.google.javascript.rhino.IR.empty();
    com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(((com.google.javascript.rhino.Node)v0),((com.google.javascript.rhino.Node)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = com.google.javascript.rhino.IR.empty();
    Object v1 = com.google.javascript.jscomp.NodeUtil.isBooleanResultHelper(((com.google.javascript.rhino.Node)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = com.google.javascript.rhino.IR.empty();
    Object v1 = com.google.javascript.rhino.IR.empty();
    Object v2 = ((com.google.javascript.rhino.Node)v0).clonePropsFrom(((com.google.javascript.rhino.Node)v1));
    Object v3 = com.google.javascript.jscomp.NodeUtil.isExprAssign(((com.google.javascript.rhino.Node)v0));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = com.google.javascript.rhino.IR.empty();
    Object v1 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(((com.google.javascript.rhino.Node)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = com.google.javascript.rhino.IR.empty();
    Object v1 = com.google.javascript.rhino.IR.empty();
    Object v2 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(((com.google.javascript.rhino.Node)v0),((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = com.google.javascript.rhino.IR.empty();
    Object v1 = com.google.javascript.rhino.IR.empty();
    Object v2 = ((com.google.javascript.rhino.Node)v0).srcref(((com.google.javascript.rhino.Node)v1));
    Object v3 = com.google.javascript.rhino.IR.empty();
    Object v4 = com.google.javascript.jscomp.NodeUtil.isVarOrSimpleAssignLhs(((com.google.javascript.rhino.Node)v0),((com.google.javascript.rhino.Node)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = com.google.javascript.rhino.IR.empty();
    Object v1 = com.google.javascript.jscomp.NodeUtil.getBestJSDocInfo(((com.google.javascript.rhino.Node)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = com.google.javascript.rhino.IR.empty();
    Object v1 = com.google.javascript.jscomp.NodeUtil.isRelationalOperation(((com.google.javascript.rhino.Node)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = com.google.javascript.rhino.IR.empty();
    Object v1 = com.google.javascript.jscomp.NodeUtil.isLValue(((com.google.javascript.rhino.Node)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = com.google.javascript.rhino.IR.empty();
    Object v1 = ((com.google.javascript.rhino.Node)v0).toString();
    Object v2 = com.google.javascript.jscomp.NodeUtil.isLValue(((com.google.javascript.rhino.Node)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = com.google.javascript.rhino.IR.empty();
    Object v1 = ((com.google.javascript.rhino.Node)v0).getJsDocBuilderForNode();
    Object v2 = com.google.javascript.jscomp.NodeUtil.getBestJSDocInfo(((com.google.javascript.rhino.Node)v0));
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = com.google.javascript.rhino.IR.empty();
    Object v1 = com.google.javascript.jscomp.NodeUtil.isCallOrNewTarget(((com.google.javascript.rhino.Node)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = java.util.Comparator.naturalOrder();
    Object v1 = new java.util.TreeMap(((java.util.Comparator)v0));
    Object v2 = new java.util.TreeMap(((java.util.SortedMap)v1));
    Object v3 = com.google.javascript.rhino.IR.empty();
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = ((com.google.javascript.jscomp.AbstractCompiler)v5).getProgress();
    com.google.javascript.jscomp.NodeUtil.verifyScopeChanges(((java.util.Map)v2),((com.google.javascript.rhino.Node)v3),(((java.lang.Boolean)v4).booleanValue()),((com.google.javascript.jscomp.AbstractCompiler)v5));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = java.util.Comparator.naturalOrder();
    Object v1 = new java.util.TreeMap(((java.util.Comparator)v0));
    Object v2 = ((java.util.Map)v1).isEmpty();
    Object v3 = com.google.javascript.rhino.IR.empty();
    Object v4 = ((com.google.javascript.rhino.Node)v3).toString();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.Compiler();
    com.google.javascript.jscomp.NodeUtil.verifyScopeChanges(((java.util.Map)v1),((com.google.javascript.rhino.Node)v3),(((java.lang.Boolean)v5).booleanValue()),((com.google.javascript.jscomp.AbstractCompiler)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.NodeUtil.isLatin(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(true), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = com.google.javascript.rhino.IR.empty();
    Object v1 = java.util.Comparator.naturalOrder();
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = com.google.javascript.rhino.IR.empty();
    Object v5 = com.google.javascript.rhino.IR.empty();
    Object v6 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v5));
    Object v7 = java.util.Set.of(((java.lang.Object)v1),((java.lang.Object)v3),((java.lang.Object)v6));
    Object v8 = java.util.Set.copyOf(((java.util.Collection)v7));
    Object v9 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(((com.google.javascript.rhino.Node)v0),((java.util.Set)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = com.google.javascript.jscomp.NodeUtil.getStringValue((((java.lang.Double)v0).doubleValue()));
    org.junit.Assert.assertEquals((Object)("1"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = com.google.javascript.rhino.IR.empty();
    Object v1 = ((com.google.javascript.rhino.Node)v0).isQualifiedName();
    Object v2 = com.google.javascript.jscomp.NodeUtil.isGetOrSetKey(((com.google.javascript.rhino.Node)v0));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = com.google.javascript.rhino.IR.empty();
    Object v1 = ((com.google.javascript.rhino.Node)v0).removeFirstChild();
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = com.google.javascript.jscomp.NodeUtil.constructorCallHasSideEffects(((com.google.javascript.rhino.Node)v0),((com.google.javascript.jscomp.AbstractCompiler)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = com.google.javascript.rhino.IR.empty();
    Object v1 = new com.google.javascript.jscomp.Compiler();
    Object v2 = com.google.javascript.jscomp.NodeUtil.functionCallHasSideEffects(((com.google.javascript.rhino.Node)v0),((com.google.javascript.jscomp.AbstractCompiler)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = com.google.javascript.rhino.IR.empty();
    Object v1 = 0;
    Object v2 = ((com.google.javascript.rhino.Node)v0).getProp((((java.lang.Integer)v1).intValue()));
    Object v3 = com.google.javascript.jscomp.NodeUtil.getSourceName(((com.google.javascript.rhino.Node)v0));
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = com.google.javascript.rhino.IR.empty();
    Object v1 = "\"";
    Object v2 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(((com.google.javascript.rhino.Node)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = com.google.javascript.rhino.IR.empty();
    Object v1 = com.google.javascript.jscomp.NodeUtil.isPrototypeProperty(((com.google.javascript.rhino.Node)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = com.google.javascript.rhino.IR.empty();
    Object v1 = false;
    Object v2 = com.google.javascript.jscomp.NodeUtil.isLiteralValue(((com.google.javascript.rhino.Node)v0),(((java.lang.Boolean)v1).booleanValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = com.google.javascript.rhino.IR.empty();
    Object v1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = com.google.javascript.rhino.IR.empty();
    Object v1 = com.google.javascript.jscomp.NodeUtil.getArrayElementStringValue(((com.google.javascript.rhino.Node)v0));
    org.junit.Assert.assertEquals((Object)(""), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = 1;
    Object v1 = com.google.javascript.jscomp.NodeUtil.isAssociative((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = com.google.javascript.rhino.IR.empty();
    Object v1 = com.google.javascript.jscomp.NodeUtil.getInputId(((com.google.javascript.rhino.Node)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = -10;
    Object v1 = com.google.javascript.jscomp.NodeUtil.precedence((((java.lang.Integer)v0).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = com.google.javascript.rhino.IR.empty();
    Object v1 = com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(((com.google.javascript.rhino.Node)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = com.google.javascript.rhino.IR.empty();
    Object v1 = new com.google.javascript.rhino.Node[]{null,null,null};
    Object v2 = com.google.javascript.jscomp.NodeUtil.newCallNode(((com.google.javascript.rhino.Node)v0),((com.google.javascript.rhino.Node[])v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = com.google.javascript.rhino.IR.empty();
    Object v1 = new com.google.javascript.jscomp.Compiler();
    Object v2 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(((com.google.javascript.rhino.Node)v0),((com.google.javascript.jscomp.AbstractCompiler)v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = com.google.javascript.rhino.IR.empty();
    Object v1 = com.google.javascript.jscomp.NodeUtil.isBooleanResult(((com.google.javascript.rhino.Node)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = 4.9602690110762255D;
    Object v1 = com.google.javascript.jscomp.NodeUtil.getStringValue((((java.lang.Double)v0).doubleValue()));
    org.junit.Assert.assertEquals((Object)("4.9602690110762255"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = com.google.javascript.rhino.IR.empty();
    Object v1 = "";
    ((com.google.javascript.rhino.Node)v0).addSuppression(((java.lang.String)v1));
    Object v2 = null;
    Object v3 = com.google.javascript.jscomp.NodeUtil.getArrayElementStringValue(((com.google.javascript.rhino.Node)v0));
    org.junit.Assert.assertEquals((Object)(""), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = com.google.javascript.rhino.IR.empty();
    Object v1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v0));
    Object v2 = com.google.javascript.jscomp.NodeUtil.containsFunction(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = com.google.javascript.rhino.IR.empty();
    Object v1 = 25;
    Object v2 = 4;
    ((com.google.javascript.rhino.Node)v0).putIntProp((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    Object v4 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(((com.google.javascript.rhino.Node)v0));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = com.google.javascript.rhino.IR.empty();
    Object v1 = "T";
    Object v2 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(((com.google.javascript.rhino.Node)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = com.google.javascript.rhino.IR.empty();
    Object v1 = java.util.Comparator.naturalOrder();
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = com.google.javascript.rhino.IR.empty();
    Object v5 = com.google.javascript.rhino.IR.empty();
    Object v6 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v5));
    Object v7 = java.util.Set.of(((java.lang.Object)v1),((java.lang.Object)v3),((java.lang.Object)v6));
    Object v8 = java.util.Set.copyOf(((java.util.Collection)v7));
    Object v9 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(((com.google.javascript.rhino.Node)v0),((java.util.Set)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = com.google.javascript.rhino.IR.empty();
    Object v1 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(((com.google.javascript.rhino.Node)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = com.google.javascript.rhino.IR.empty();
    Object v1 = "function";
    ((com.google.javascript.rhino.Node)v0).addSuppression(((java.lang.String)v1));
    Object v2 = null;
    Object v3 = com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(((com.google.javascript.rhino.Node)v0));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = com.google.javascript.rhino.IR.empty();
    Object v1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v0));
    Object v2 = com.google.javascript.jscomp.NodeUtil.getFunctionParameters(((com.google.javascript.rhino.Node)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = com.google.javascript.rhino.IR.empty();
    Object v1 = ((com.google.javascript.rhino.Node)v0).getLength();
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = com.google.javascript.jscomp.NodeUtil.constructorCallHasSideEffects(((com.google.javascript.rhino.Node)v0),((com.google.javascript.jscomp.AbstractCompiler)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = com.google.javascript.rhino.IR.empty();
    Object v1 = 1;
    Object v2 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((((java.lang.Integer)v1).intValue()));
    Object v3 = com.google.javascript.jscomp.NodeUtil.anyResultsMatch(((com.google.javascript.rhino.Node)v0),((com.google.common.base.Predicate)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = "\n";
    Object v1 = com.google.javascript.rhino.IR.empty();
    Object v2 = com.google.javascript.jscomp.NodeUtil.newVarNode(((java.lang.String)v0),((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = com.google.javascript.rhino.IR.empty();
    Object v1 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(((com.google.javascript.rhino.Node)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = -22;
    Object v1 = com.google.javascript.jscomp.NodeUtil.opToStr((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = com.google.javascript.rhino.IR.empty();
    Object v1 = com.google.javascript.jscomp.NodeUtil.getFunctionJSDocInfo(((com.google.javascript.rhino.Node)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = java.util.Comparator.naturalOrder();
    Object v1 = new java.util.TreeMap(((java.util.Comparator)v0));
    Object v2 = com.google.javascript.rhino.IR.empty();
    Object v3 = com.google.javascript.jscomp.NodeUtil.isBooleanResultHelper(((com.google.javascript.rhino.Node)v2));
    Object v4 = ((java.util.Map)v1).remove(((java.lang.Object)v3));
    Object v5 = "\n";
    Object v6 = com.google.javascript.rhino.IR.empty();
    Object v7 = com.google.javascript.jscomp.NodeUtil.newVarNode(((java.lang.String)v5),((com.google.javascript.rhino.Node)v6));
    Object v8 = ((com.google.javascript.rhino.Node)v7).mayMutateGlobalStateOrThrow();
    Object v9 = true;
    Object v10 = new com.google.javascript.jscomp.Compiler();
    com.google.javascript.jscomp.NodeUtil.verifyScopeChanges(((java.util.Map)v1),((com.google.javascript.rhino.Node)v7),(((java.lang.Boolean)v9).booleanValue()),((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = com.google.javascript.rhino.IR.empty();
    Object v1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v0));
    ((com.google.javascript.rhino.Node)v1).detachChildren();
    Object v2 = null;
    Object v3 = com.google.javascript.jscomp.NodeUtil.isUndefined(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertEquals((Object)(true), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = com.google.javascript.rhino.IR.empty();
    Object v1 = -27;
    Object v2 = ((com.google.javascript.rhino.Node)v0).getBooleanProp((((java.lang.Integer)v1).intValue()));
    Object v3 = com.google.javascript.jscomp.NodeUtil.isExprCall(((com.google.javascript.rhino.Node)v0));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = "\n";
    Object v1 = com.google.javascript.rhino.IR.empty();
    Object v2 = com.google.javascript.jscomp.NodeUtil.newVarNode(((java.lang.String)v0),((com.google.javascript.rhino.Node)v1));
    Object v3 = com.google.javascript.jscomp.NodeUtil.isGetOrSetKey(((com.google.javascript.rhino.Node)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = com.google.javascript.rhino.IR.empty();
    Object v1 = com.google.javascript.jscomp.NodeUtil.isLoopStructure(((com.google.javascript.rhino.Node)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = com.google.javascript.rhino.IR.empty();
    Object v1 = com.google.javascript.jscomp.NodeUtil.getSourceName(((com.google.javascript.rhino.Node)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = 1;
    Object v1 = com.google.javascript.jscomp.NodeUtil.isStrWhiteSpaceChar((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.TernaryValue.FALSE), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = com.google.javascript.rhino.IR.empty();
    Object v1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v0));
    Object v2 = com.google.javascript.jscomp.NodeUtil.getObjectLitKeyName(((com.google.javascript.rhino.Node)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = com.google.javascript.rhino.IR.empty();
    Object v1 = com.google.javascript.jscomp.NodeUtil.isForIn(((com.google.javascript.rhino.Node)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = com.google.javascript.rhino.IR.empty();
    Object v1 = ((com.google.javascript.rhino.Node)v0).getQualifiedName();
    Object v2 = com.google.javascript.jscomp.NodeUtil.isExecutedExactlyOnce(((com.google.javascript.rhino.Node)v0));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = com.google.javascript.rhino.IR.empty();
    Object v1 = com.google.javascript.jscomp.NodeUtil.isNumericResultHelper(((com.google.javascript.rhino.Node)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = com.google.javascript.rhino.IR.empty();
    Object v1 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(((com.google.javascript.rhino.Node)v0));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = com.google.javascript.rhino.IR.empty();
    Object v1 = com.google.javascript.jscomp.NodeUtil.getFunctionName(((com.google.javascript.rhino.Node)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = com.google.javascript.rhino.IR.empty();
    Object v1 = ((com.google.javascript.rhino.Node)v0).getQualifiedName();
    Object v2 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(((com.google.javascript.rhino.Node)v0));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = com.google.javascript.rhino.IR.empty();
    Object v1 = new com.google.javascript.jscomp.Compiler();
    Object v2 = com.google.javascript.jscomp.NodeUtil.constructorCallHasSideEffects(((com.google.javascript.rhino.Node)v0),((com.google.javascript.jscomp.AbstractCompiler)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = com.google.javascript.rhino.IR.empty();
    Object v1 = "j";
    Object v2 = "ANNOTATON";
    Object v3 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)65)};
    Object v4 = new java.io.ByteArrayInputStream(((byte[])v3));
    Object v5 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v1),((java.lang.String)v2),((java.io.InputStream)v4));
    ((com.google.javascript.rhino.Node)v0).setStaticSourceFile(((com.google.javascript.rhino.jstype.StaticSourceFile)v5));
    Object v6 = null;
    Object v7 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(((com.google.javascript.rhino.Node)v0));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = com.google.javascript.rhino.IR.empty();
    Object v1 = com.google.javascript.jscomp.NodeUtil.isControlStructure(((com.google.javascript.rhino.Node)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = 0;
    Object v1 = com.google.javascript.jscomp.NodeUtil.precedenceWithDefault((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertEquals((Object)(-1), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = com.google.javascript.rhino.IR.empty();
    Object v1 = com.google.javascript.jscomp.NodeUtil.getRootOfQualifiedName(((com.google.javascript.rhino.Node)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = com.google.javascript.rhino.IR.empty();
    Object v1 = com.google.javascript.jscomp.NodeUtil.getBestLValueName(((com.google.javascript.rhino.Node)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = com.google.javascript.rhino.IR.empty();
    Object v1 = ((com.google.javascript.rhino.Node)v0).removeFirstChild();
    Object v2 = com.google.javascript.jscomp.NodeUtil.isEmptyFunctionExpression(((com.google.javascript.rhino.Node)v0));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = "\n";
    Object v1 = com.google.javascript.jscomp.NodeUtil.isValidQualifiedName(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = com.google.javascript.rhino.IR.empty();
    Object v1 = -50;
    Object v2 = ((com.google.javascript.rhino.Node)v0).getProp((((java.lang.Integer)v1).intValue()));
    Object v3 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(((com.google.javascript.rhino.Node)v0));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = "UR";
    Object v1 = com.google.javascript.jscomp.NodeUtil.trimJsWhiteSpace(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("UR"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = com.google.javascript.rhino.IR.empty();
    Object v1 = com.google.javascript.jscomp.NodeUtil.isVarDeclaration(((com.google.javascript.rhino.Node)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = com.google.javascript.rhino.IR.empty();
    Object v1 = com.google.javascript.jscomp.NodeUtil.isReferenceName(((com.google.javascript.rhino.Node)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = com.google.javascript.rhino.IR.empty();
    Object v1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v0));
    Object v2 = ((com.google.javascript.rhino.Node)v1).getSourceOffset();
    Object v3 = 1;
    Object v4 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((((java.lang.Integer)v3).intValue()));
    Object v5 = 1;
    Object v6 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((((java.lang.Integer)v5).intValue()));
    Object v7 = com.google.javascript.jscomp.NodeUtil.has(((com.google.javascript.rhino.Node)v1),((com.google.common.base.Predicate)v4),((com.google.common.base.Predicate)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = com.google.javascript.rhino.IR.empty();
    Object v1 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(((com.google.javascript.rhino.Node)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = com.google.javascript.rhino.IR.empty();
    Object v1 = com.google.javascript.jscomp.NodeUtil.isUndefined(((com.google.javascript.rhino.Node)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = com.google.javascript.jscomp.CodingConventions.getDefault();
    Object v1 = "";
    Object v2 = com.google.javascript.rhino.IR.empty();
    Object v3 = "prototype";
    Object v4 = com.google.javascript.jscomp.NodeUtil.newName(((com.google.javascript.jscomp.CodingConvention)v0),((java.lang.String)v1),((com.google.javascript.rhino.Node)v2),((java.lang.String)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = com.google.javascript.rhino.IR.empty();
    Object v1 = 1;
    Object v2 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((((java.lang.Integer)v1).intValue()));
    Object v3 = 1;
    Object v4 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((((java.lang.Integer)v3).intValue()));
    Object v5 = com.google.javascript.jscomp.CodingConventions.getDefault();
    Object v6 = ((com.google.common.base.Predicate)v4).equals(((java.lang.Object)v5));
    Object v7 = com.google.javascript.jscomp.NodeUtil.has(((com.google.javascript.rhino.Node)v0),((com.google.common.base.Predicate)v2),((com.google.common.base.Predicate)v4));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = com.google.javascript.rhino.IR.empty();
    Object v1 = 1;
    Object v2 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((((java.lang.Integer)v1).intValue()));
    Object v3 = 1;
    Object v4 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((((java.lang.Integer)v3).intValue()));
    Object v5 = com.google.javascript.jscomp.NodeUtil.getCount(((com.google.javascript.rhino.Node)v0),((com.google.common.base.Predicate)v2),((com.google.common.base.Predicate)v4));
    org.junit.Assert.assertEquals((Object)(0), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = com.google.javascript.rhino.IR.empty();
    Object v1 = com.google.javascript.jscomp.NodeUtil.isExprCall(((com.google.javascript.rhino.Node)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = -35;
    Object v1 = com.google.javascript.jscomp.NodeUtil.opToStrNoFail((((java.lang.Integer)v0).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = 1;
    Object v1 = com.google.javascript.jscomp.NodeUtil.isCommutative((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = com.google.javascript.jscomp.CodingConventions.getDefault();
    Object v1 = "";
    Object v2 = com.google.javascript.rhino.IR.empty();
    Object v3 = "prototype";
    Object v4 = com.google.javascript.jscomp.NodeUtil.newName(((com.google.javascript.jscomp.CodingConvention)v0),((java.lang.String)v1),((com.google.javascript.rhino.Node)v2),((java.lang.String)v3));
    Object v5 = com.google.javascript.jscomp.NodeUtil.isExpressionResultUsed(((com.google.javascript.rhino.Node)v4));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = com.google.javascript.rhino.IR.empty();
    Object v1 = com.google.javascript.jscomp.NodeUtil.getBestLValue(((com.google.javascript.rhino.Node)v0));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = com.google.javascript.rhino.IR.empty();
    Object v1 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(((com.google.javascript.rhino.Node)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = "V";
    Object v1 = com.google.javascript.jscomp.NodeUtil.trimJsWhiteSpace(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("V"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = com.google.javascript.rhino.IR.empty();
    Object v1 = com.google.javascript.jscomp.NodeUtil.isExecutedExactlyOnce(((com.google.javascript.rhino.Node)v0));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = com.google.javascript.rhino.IR.empty();
    Object v1 = com.google.javascript.jscomp.NodeUtil.getLoopCodeBlock(((com.google.javascript.rhino.Node)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = false;
    Object v1 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v0).booleanValue()));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = com.google.javascript.rhino.IR.empty();
    Object v1 = com.google.javascript.rhino.IR.empty();
    Object v2 = ((com.google.javascript.rhino.Node)v0).copyInformationFromForTree(((com.google.javascript.rhino.Node)v1));
    Object v3 = com.google.javascript.jscomp.NodeUtil.isStatementParent(((com.google.javascript.rhino.Node)v0));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = "\n";
    Object v1 = com.google.javascript.rhino.IR.empty();
    Object v2 = com.google.javascript.jscomp.NodeUtil.newVarNode(((java.lang.String)v0),((com.google.javascript.rhino.Node)v1));
    Object v3 = -50;
    ((com.google.javascript.rhino.Node)v2).setSourceEncodedPositionForTree((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    Object v5 = com.google.javascript.jscomp.NodeUtil.isExprAssign(((com.google.javascript.rhino.Node)v2));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = com.google.javascript.rhino.IR.empty();
    Object v1 = com.google.javascript.jscomp.NodeUtil.tryMergeBlock(((com.google.javascript.rhino.Node)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.NodeUtil.getStringNumberValue(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(0.0D), v1);
  }
}
