package com.google.javascript.jscomp;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = "qLB";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = "qLB";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = -13;
    ((com.google.javascript.rhino.Node)v1).setLineno((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    Object v4 = com.google.javascript.jscomp.NodeUtil.isString(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = "qLB";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = new com.google.javascript.jscomp.NodeUtil.MatchDeclaration();
    Object v3 = ": ";
    Object v4 = new java.io.PrintStream(((java.lang.String)v3));
    Object v5 = ((com.google.common.base.Predicate)v2).equals(((java.lang.Object)v4));
    Object v6 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(((com.google.javascript.rhino.Node)v1),((com.google.common.base.Predicate)v2));
    org.junit.Assert.assertEquals((Object)(true), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = "qLB";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = com.google.javascript.jscomp.NodeUtil.getFunctionInfo(((com.google.javascript.rhino.Node)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = "qLB";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = com.google.javascript.jscomp.NodeUtil.getStringValue(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = "qLB";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = "qLB";
    Object v3 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v2));
    com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(((com.google.javascript.rhino.Node)v1),((com.google.javascript.rhino.Node)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = "qLB";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = "qLB";
    Object v3 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v2));
    ((com.google.javascript.rhino.Node)v1).addChildToFront(((com.google.javascript.rhino.Node)v3));
    Object v4 = null;
    Object v5 = com.google.javascript.jscomp.NodeUtil.isExprAssign(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = "qLB";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = com.google.javascript.jscomp.NodeUtil.isExprCall(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = "qLB";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = com.google.javascript.jscomp.NodeUtil.isNullOrUndefined(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = "qLB";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = com.google.javascript.jscomp.NodeUtil.getAssignedValue(((com.google.javascript.rhino.Node)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = "qLB";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = true;
    ((com.google.javascript.rhino.Node)v1).setOptionalArg((((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    Object v4 = com.google.javascript.jscomp.NodeUtil.isNullOrUndefined(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = "qLB";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = com.google.javascript.jscomp.NodeUtil.callHasLocalResult(((com.google.javascript.rhino.Node)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = "qLB";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = "qLB";
    Object v3 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v2));
    ((com.google.javascript.rhino.Node)v1).addChildToBack(((com.google.javascript.rhino.Node)v3));
    Object v4 = null;
    Object v5 = com.google.javascript.jscomp.NodeUtil.isBooleanResult(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = "qLB";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = com.google.javascript.jscomp.NodeUtil.getRootOfQualifiedName(((com.google.javascript.rhino.Node)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = "qLB";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = com.google.javascript.jscomp.NodeUtil.getOpFromAssignmentOp(((com.google.javascript.rhino.Node)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = "qLB";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = "qLB";
    Object v3 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v2));
    ((com.google.javascript.rhino.Node)v1).addChildrenToBack(((com.google.javascript.rhino.Node)v3));
    Object v4 = null;
    Object v5 = com.google.javascript.jscomp.NodeUtil.tryMergeBlock(((com.google.javascript.rhino.Node)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = "qLB";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = ((com.google.javascript.rhino.Node)v1).hasSideEffects();
    Object v3 = com.google.javascript.jscomp.NodeUtil.isSparseArray(((com.google.javascript.rhino.Node)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = "qLB";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = "qLB";
    Object v3 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v2));
    Object v4 = "qLB";
    Object v5 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v4));
    Object v6 = ((com.google.javascript.rhino.Node)v3).checkTreeTypeAwareEqualsSilent(((com.google.javascript.rhino.Node)v5));
    Object v7 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(((com.google.javascript.rhino.Node)v1),((com.google.javascript.rhino.Node)v3));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = "qLB";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = com.google.javascript.jscomp.NodeUtil.isFunction(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = "qLB";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = "qLB";
    Object v3 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v2));
    com.google.javascript.jscomp.NodeUtil.removeChild(((com.google.javascript.rhino.Node)v1),((com.google.javascript.rhino.Node)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = 15;
    Object v1 = com.google.javascript.jscomp.NodeUtil.isSimpleOperatorType((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertEquals((Object)(true), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = "qLB";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = new com.google.javascript.jscomp.NodeUtil.MatchDeclaration();
    Object v3 = com.google.javascript.jscomp.NodeUtil.valueCheck(((com.google.javascript.rhino.Node)v1),((com.google.common.base.Predicate)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = "qLB";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = ((com.google.javascript.rhino.Node)v1).cloneTree();
    Object v3 = com.google.javascript.jscomp.NodeUtil.newExpr(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = "qLB";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = "qLB";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = com.google.javascript.jscomp.NodeUtil.getSourceName(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = "qLB";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v1));
    Object v3 = "qLB";
    Object v4 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v3));
    Object v5 = ((com.google.javascript.rhino.Node)v4).cloneTree();
    Object v6 = com.google.javascript.jscomp.NodeUtil.newExpr(((com.google.javascript.rhino.Node)v4));
    Object v7 = ((com.google.javascript.rhino.Node)v2).copyInformationFromForTree(((com.google.javascript.rhino.Node)v6));
    Object v8 = "qLB";
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8));
    com.google.javascript.jscomp.NodeUtil.removeChild(((com.google.javascript.rhino.Node)v2),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = 0;
    Object v1 = com.google.javascript.jscomp.NodeUtil.isSimpleOperatorType((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = "qLB";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v1));
    Object v3 = new com.google.javascript.rhino.JSDocInfo();
    ((com.google.javascript.rhino.Node)v2).setJSDocInfo(((com.google.javascript.rhino.JSDocInfo)v3));
    Object v4 = null;
    Object v5 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(((com.google.javascript.rhino.Node)v2));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = "qLB";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = com.google.javascript.jscomp.NodeUtil.isGet(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = 0;
    Object v1 = com.google.javascript.jscomp.NodeUtil.opToStr((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = "qLB";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = ((com.google.javascript.rhino.Node)v1).isQualifiedName();
    Object v3 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v4 = ": ";
    Object v5 = new java.io.PrintStream(((java.lang.String)v4));
    Object v6 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v3),((java.io.PrintStream)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v6));
    Object v8 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(((com.google.javascript.rhino.Node)v1),((com.google.javascript.jscomp.AbstractCompiler)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = "qLB";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = ((com.google.javascript.rhino.Node)v1).cloneTree();
    Object v3 = com.google.javascript.jscomp.NodeUtil.newExpr(((com.google.javascript.rhino.Node)v1));
    Object v4 = "this";
    Object v5 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(((com.google.javascript.rhino.Node)v3),((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = "qLB";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = ((com.google.javascript.rhino.Node)v1).cloneTree();
    Object v3 = com.google.javascript.jscomp.NodeUtil.newExpr(((com.google.javascript.rhino.Node)v1));
    Object v4 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v5 = ": ";
    Object v6 = new java.io.PrintStream(((java.lang.String)v5));
    Object v7 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v4),((java.io.PrintStream)v6));
    Object v8 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v7));
    Object v9 = com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(((com.google.javascript.rhino.Node)v3),((com.google.javascript.jscomp.AbstractCompiler)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = "qLB";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = com.google.javascript.jscomp.NodeUtil.isUndefined(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = 10;
    Object v1 = com.google.javascript.jscomp.NodeUtil.isStrWhiteSpaceChar((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertEquals((Object)(true), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = 1;
    Object v1 = com.google.javascript.jscomp.NodeUtil.isAssociative((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v1 = "qLB";
    Object v2 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v1));
    Object v3 = ((com.google.javascript.rhino.Node)v2).cloneTree();
    Object v4 = com.google.javascript.jscomp.NodeUtil.newExpr(((com.google.javascript.rhino.Node)v2));
    Object v5 = ((com.google.javascript.jscomp.CodingConvention)v0).getSingletonGetterClassName(((com.google.javascript.rhino.Node)v4));
    Object v6 = "";
    Object v7 = "qLB";
    Object v8 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v7));
    Object v9 = com.google.javascript.jscomp.NodeUtil.newName(((com.google.javascript.jscomp.CodingConvention)v0),((java.lang.String)v6),((com.google.javascript.rhino.Node)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = "qLB";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = new com.google.javascript.jscomp.NodeUtil.MatchDeclaration();
    Object v3 = "qLB";
    Object v4 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v3));
    Object v5 = ((com.google.javascript.rhino.Node)v4).cloneTree();
    Object v6 = com.google.javascript.jscomp.NodeUtil.newExpr(((com.google.javascript.rhino.Node)v4));
    Object v7 = "this";
    Object v8 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(((com.google.javascript.rhino.Node)v6),((java.lang.String)v7));
    Object v9 = ((com.google.common.base.Predicate)v2).equals(((java.lang.Object)v8));
    Object v10 = new com.google.javascript.jscomp.NodeUtil.MatchDeclaration();
    Object v11 = com.google.javascript.jscomp.NodeUtil.getCount(((com.google.javascript.rhino.Node)v1),((com.google.common.base.Predicate)v2),((com.google.common.base.Predicate)v10));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = "qLB";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = com.google.javascript.jscomp.NodeUtil.isVarDeclaration(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = "qLB";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = com.google.javascript.jscomp.NodeUtil.isString(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = "qLB";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v1));
    Object v3 = false;
    Object v4 = true;
    Object v5 = true;
    Object v6 = ((com.google.javascript.rhino.Node)v2).toString((((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = com.google.javascript.jscomp.NodeUtil.getOpFromAssignmentOp(((com.google.javascript.rhino.Node)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = "qLB";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = com.google.javascript.jscomp.NodeUtil.getArrayElementStringValue(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = "qLB";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = com.google.javascript.jscomp.NodeUtil.isTryCatchNodeContainer(((com.google.javascript.rhino.Node)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = "qLB";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = ((com.google.javascript.rhino.Node)v1).cloneTree();
    Object v3 = com.google.javascript.jscomp.NodeUtil.newExpr(((com.google.javascript.rhino.Node)v1));
    Object v4 = com.google.javascript.jscomp.NodeUtil.getStringValue(((com.google.javascript.rhino.Node)v3));
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = "qLB";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v1 = "qLB";
    Object v2 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v1));
    Object v3 = ((com.google.javascript.jscomp.CodingConvention)v0).isVarArgsParameter(((com.google.javascript.rhino.Node)v2));
    Object v4 = "qLB";
    Object v5 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v4));
    Object v6 = "qLB";
    Object v7 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v6));
    Object v8 = com.google.javascript.jscomp.NodeUtil.isConstantByConvention(((com.google.javascript.jscomp.CodingConvention)v0),((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = "qLB";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = com.google.javascript.jscomp.NodeUtil.arrayToString(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertEquals((Object)(""), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = "qLB";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = ((com.google.javascript.rhino.Node)v1).getJsDocBuilderForNode();
    Object v3 = com.google.javascript.jscomp.NodeUtil.mayBeStringHelper(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertEquals((Object)(true), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = "qLB";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = ((com.google.javascript.rhino.Node)v1).removeFirstChild();
    Object v3 = com.google.javascript.jscomp.NodeUtil.isVar(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = "qLB";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = java.util.Set.of();
    Object v3 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(((com.google.javascript.rhino.Node)v1),((java.util.Set)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = "qLB";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = com.google.javascript.jscomp.NodeUtil.isSparseArray(((com.google.javascript.rhino.Node)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = "qLB";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = ((com.google.javascript.rhino.Node)v1).cloneTree();
    Object v3 = com.google.javascript.jscomp.NodeUtil.newExpr(((com.google.javascript.rhino.Node)v1));
    Object v4 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(((com.google.javascript.rhino.Node)v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = "qLB";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = "qLB";
    Object v3 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v2));
    Object v4 = ((com.google.javascript.rhino.Node)v1).checkTreeEqualsSilent(((com.google.javascript.rhino.Node)v3));
    Object v5 = com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(((com.google.javascript.rhino.Node)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = "qLB";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v3 = ": ";
    Object v4 = new java.io.PrintStream(((java.lang.String)v3));
    Object v5 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v2),((java.io.PrintStream)v4));
    Object v6 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v5));
    Object v7 = com.google.javascript.jscomp.NodeUtil.functionCallHasSideEffects(((com.google.javascript.rhino.Node)v1),((com.google.javascript.jscomp.AbstractCompiler)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = "qLB";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = ((com.google.javascript.rhino.Node)v1).cloneTree();
    Object v3 = com.google.javascript.jscomp.NodeUtil.newExpr(((com.google.javascript.rhino.Node)v1));
    Object v4 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(((com.google.javascript.rhino.Node)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = "qLB";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = ((com.google.javascript.rhino.Node)v1).children();
    Object v3 = com.google.javascript.jscomp.NodeUtil.getCatchBlock(((com.google.javascript.rhino.Node)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = "qLB";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = "qLB";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v1));
    Object v3 = com.google.javascript.jscomp.NodeUtil.isNumericResultHelper(((com.google.javascript.rhino.Node)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = "qLB";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = ((com.google.javascript.rhino.Node)v1).cloneTree();
    Object v3 = com.google.javascript.jscomp.NodeUtil.newExpr(((com.google.javascript.rhino.Node)v1));
    Object v4 = com.google.javascript.jscomp.NodeUtil.isNull(((com.google.javascript.rhino.Node)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = 1;
    Object v1 = com.google.javascript.jscomp.NodeUtil.opToStr((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = "qLB";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = "qLB";
    Object v3 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v2));
    Object v4 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(((com.google.javascript.rhino.Node)v1),((com.google.javascript.rhino.Node)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v1 = "qLB";
    Object v2 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v1));
    Object v3 = ((com.google.javascript.rhino.Node)v2).cloneTree();
    Object v4 = com.google.javascript.jscomp.NodeUtil.newExpr(((com.google.javascript.rhino.Node)v2));
    Object v5 = ((com.google.javascript.jscomp.CodingConvention)v0).getSingletonGetterClassName(((com.google.javascript.rhino.Node)v4));
    Object v6 = "";
    Object v7 = "qLB";
    Object v8 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v7));
    Object v9 = com.google.javascript.jscomp.NodeUtil.newName(((com.google.javascript.jscomp.CodingConvention)v0),((java.lang.String)v6),((com.google.javascript.rhino.Node)v8));
    Object v10 = com.google.javascript.jscomp.NodeUtil.isTryCatchNodeContainer(((com.google.javascript.rhino.Node)v9));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = "qLB";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = "String node not created wit Node.newString";
    ((com.google.javascript.rhino.Node)v1).addSuppression(((java.lang.String)v2));
    Object v3 = null;
    Object v4 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = "qLB";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v1));
    Object v3 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(((com.google.javascript.rhino.Node)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = -37;
    Object v1 = com.google.javascript.jscomp.NodeUtil.opToStrNoFail((((java.lang.Integer)v0).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = "qLB";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = "qLB";
    Object v3 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v2));
    Object v4 = ((com.google.javascript.rhino.Node)v1).checkTreeEqualsSilent(((com.google.javascript.rhino.Node)v3));
    Object v5 = "qLB";
    Object v6 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v5));
    Object v7 = com.google.javascript.jscomp.NodeUtil.isLhs(((com.google.javascript.rhino.Node)v1),((com.google.javascript.rhino.Node)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = "qLB";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = 40;
    Object v3 = new com.google.javascript.jscomp.NodeUtil.MatchDeclaration();
    Object v4 = com.google.javascript.jscomp.NodeUtil.containsType(((com.google.javascript.rhino.Node)v1),(((java.lang.Integer)v2).intValue()),((com.google.common.base.Predicate)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = "qLB";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = com.google.javascript.jscomp.NodeUtil.isForIn(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = "qLB";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = ((com.google.javascript.rhino.Node)v1).getAncestors();
    Object v3 = "qLB";
    Object v4 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v3));
    Object v5 = ((com.google.javascript.rhino.Node)v4).cloneTree();
    Object v6 = com.google.javascript.jscomp.NodeUtil.newExpr(((com.google.javascript.rhino.Node)v4));
    com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(((com.google.javascript.rhino.Node)v1),((com.google.javascript.rhino.Node)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = "<ul>";
    Object v1 = "qLB";
    Object v2 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v1));
    Object v3 = ((com.google.javascript.rhino.Node)v2).cloneTree();
    Object v4 = com.google.javascript.jscomp.NodeUtil.newExpr(((com.google.javascript.rhino.Node)v2));
    Object v5 = com.google.javascript.jscomp.NodeUtil.newVarNode(((java.lang.String)v0),((com.google.javascript.rhino.Node)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = "qLB";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v1));
    Object v3 = com.google.javascript.jscomp.NodeUtil.isVar(((com.google.javascript.rhino.Node)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = "qLB";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = ((com.google.javascript.rhino.Node)v1).cloneTree();
    Object v3 = com.google.javascript.jscomp.NodeUtil.newExpr(((com.google.javascript.rhino.Node)v1));
    Object v4 = -18;
    Object v5 = com.google.javascript.jscomp.NodeUtil.getArgumentForFunction(((com.google.javascript.rhino.Node)v3),(((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.jscomp.NodeUtil.getStringNumberValue(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(0.0D), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = "qLB";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v1));
    Object v3 = com.google.javascript.jscomp.NodeUtil.getConditionExpression(((com.google.javascript.rhino.Node)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = "qLB";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v1));
    Object v3 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(((com.google.javascript.rhino.Node)v2));
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = "qLB";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = com.google.javascript.jscomp.NodeUtil.isSimpleFunctionObjectCall(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v1 = "qLB";
    Object v2 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v1));
    Object v3 = ((com.google.javascript.rhino.Node)v2).cloneTree();
    Object v4 = com.google.javascript.jscomp.NodeUtil.newExpr(((com.google.javascript.rhino.Node)v2));
    Object v5 = ((com.google.javascript.jscomp.CodingConvention)v0).getSingletonGetterClassName(((com.google.javascript.rhino.Node)v4));
    Object v6 = "";
    Object v7 = "qLB";
    Object v8 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v7));
    Object v9 = com.google.javascript.jscomp.NodeUtil.newName(((com.google.javascript.jscomp.CodingConvention)v0),((java.lang.String)v6),((com.google.javascript.rhino.Node)v8));
    Object v10 = com.google.javascript.jscomp.NodeUtil.getInfoForNameNode(((com.google.javascript.rhino.Node)v9));
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = 40;
    Object v1 = com.google.javascript.jscomp.NodeUtil.isCommutative((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = "qLB";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = com.google.javascript.jscomp.NodeUtil.isGetOrSetKey(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = "qLB";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = false;
    ((com.google.javascript.rhino.Node)v1).setOptionalArg((((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    Object v4 = true;
    Object v5 = com.google.javascript.jscomp.NodeUtil.isLiteralValue(((com.google.javascript.rhino.Node)v1),(((java.lang.Boolean)v4).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = -53;
    Object v1 = com.google.javascript.jscomp.NodeUtil.isAssociative((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = "qLB";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = new com.google.javascript.jscomp.NodeUtil.MatchDeclaration();
    Object v3 = new com.google.javascript.jscomp.NodeUtil.MatchDeclaration();
    Object v4 = com.google.javascript.jscomp.NodeUtil.has(((com.google.javascript.rhino.Node)v1),((com.google.common.base.Predicate)v2),((com.google.common.base.Predicate)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = "qLB";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = com.google.javascript.jscomp.NodeUtil.isThis(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = "<ul>";
    Object v1 = "qLB";
    Object v2 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v1));
    Object v3 = ((com.google.javascript.rhino.Node)v2).cloneTree();
    Object v4 = com.google.javascript.jscomp.NodeUtil.newExpr(((com.google.javascript.rhino.Node)v2));
    Object v5 = com.google.javascript.jscomp.NodeUtil.newVarNode(((java.lang.String)v0),((com.google.javascript.rhino.Node)v4));
    Object v6 = com.google.javascript.jscomp.NodeUtil.isUndefined(((com.google.javascript.rhino.Node)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = "qLB";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = ((com.google.javascript.rhino.Node)v1).cloneTree();
    Object v3 = com.google.javascript.jscomp.NodeUtil.newExpr(((com.google.javascript.rhino.Node)v1));
    Object v4 = com.google.javascript.jscomp.NodeUtil.isEmptyBlock(((com.google.javascript.rhino.Node)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = "qLB";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = ((com.google.javascript.rhino.Node)v1).hasSideEffects();
    Object v3 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(((com.google.javascript.rhino.Node)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = "qLB";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(((com.google.javascript.rhino.Node)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = "qLB";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = 0;
    ((com.google.javascript.rhino.Node)v1).setType((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    Object v4 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCallOrApply(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = "<ul>";
    Object v1 = "qLB";
    Object v2 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v1));
    Object v3 = ((com.google.javascript.rhino.Node)v2).cloneTree();
    Object v4 = com.google.javascript.jscomp.NodeUtil.newExpr(((com.google.javascript.rhino.Node)v2));
    Object v5 = com.google.javascript.jscomp.NodeUtil.newVarNode(((java.lang.String)v0),((com.google.javascript.rhino.Node)v4));
    Object v6 = "qLB";
    Object v7 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v6));
    Object v8 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = "qLB";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = ((com.google.javascript.rhino.Node)v1).cloneTree();
    Object v3 = com.google.javascript.jscomp.NodeUtil.newExpr(((com.google.javascript.rhino.Node)v1));
    Object v4 = -29;
    Object v5 = 0;
    ((com.google.javascript.rhino.Node)v3).putIntProp((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    Object v7 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(((com.google.javascript.rhino.Node)v3));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = "qLB";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = com.google.javascript.jscomp.NodeUtil.getCatchBlock(((com.google.javascript.rhino.Node)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = "qLB";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = com.google.javascript.jscomp.NodeUtil.isName(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = "qLB";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = ((com.google.javascript.rhino.Node)v1).cloneTree();
    Object v3 = com.google.javascript.jscomp.NodeUtil.newExpr(((com.google.javascript.rhino.Node)v1));
    Object v4 = true;
    Object v5 = com.google.javascript.jscomp.NodeUtil.mayBeString(((com.google.javascript.rhino.Node)v3),(((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertEquals((Object)(true), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = "<ul>";
    Object v1 = "qLB";
    Object v2 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v1));
    Object v3 = ((com.google.javascript.rhino.Node)v2).cloneTree();
    Object v4 = com.google.javascript.jscomp.NodeUtil.newExpr(((com.google.javascript.rhino.Node)v2));
    Object v5 = com.google.javascript.jscomp.NodeUtil.newVarNode(((java.lang.String)v0),((com.google.javascript.rhino.Node)v4));
    Object v6 = com.google.javascript.jscomp.NodeUtil.newHasLocalResult(((com.google.javascript.rhino.Node)v5));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = "qLB";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v1));
    Object v3 = com.google.javascript.jscomp.NodeUtil.isExprAssign(((com.google.javascript.rhino.Node)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = "qLB";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = ((com.google.javascript.rhino.Node)v1).cloneTree();
    Object v3 = com.google.javascript.jscomp.NodeUtil.newExpr(((com.google.javascript.rhino.Node)v1));
    Object v4 = com.google.javascript.jscomp.NodeUtil.getArrayElementStringValue(((com.google.javascript.rhino.Node)v3));
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = "qLB";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = com.google.javascript.jscomp.NodeUtil.hasCatchHandler(((com.google.javascript.rhino.Node)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = "qLB";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = "qLB";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = "<ul>";
    Object v3 = "qLB";
    Object v4 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v3));
    Object v5 = ((com.google.javascript.rhino.Node)v4).cloneTree();
    Object v6 = com.google.javascript.jscomp.NodeUtil.newExpr(((com.google.javascript.rhino.Node)v4));
    Object v7 = com.google.javascript.jscomp.NodeUtil.newVarNode(((java.lang.String)v2),((com.google.javascript.rhino.Node)v6));
    Object v8 = ((com.google.javascript.rhino.Node)v1).copyInformationFromForTree(((com.google.javascript.rhino.Node)v7));
    Object v9 = com.google.javascript.jscomp.NodeUtil.getStringValue(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = "JSC_EXPECTED_STRING_ERSOR";
    Object v1 = "Not implemented";
    Object v2 = com.google.javascript.jscomp.sourcemap.SourceMapGeneratorV2.LineMapDecoder.decodeLine(((java.lang.String)v1));
    Object v3 = "qLB";
    Object v4 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v3));
    Object v5 = -40;
    Object v6 = 17;
    Object v7 = com.google.javascript.jscomp.NodeUtil.newFunctionNode(((java.lang.String)v0),((java.util.List)v2),((com.google.javascript.rhino.Node)v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }
}
