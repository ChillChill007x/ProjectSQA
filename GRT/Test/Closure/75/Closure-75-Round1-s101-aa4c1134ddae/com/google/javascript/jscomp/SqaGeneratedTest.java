package com.google.javascript.jscomp;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = "unnqamed function statement";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = "unnqamed function statement";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = ((com.google.javascript.rhino.Node)v1).getAncestors();
    Object v3 = com.google.javascript.jscomp.NodeUtil.isString(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = "unnqamed function statement";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = com.google.javascript.jscomp.NodeUtil.getLoopCodeBlock(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = "unnqamed function statement";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = com.google.javascript.jscomp.NodeUtil.isEmptyFunctionExpression(((com.google.javascript.rhino.Node)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = "unnqamed function statement";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = com.google.javascript.jscomp.NodeUtil.isNullOrUndefined(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = "unnqamed function statement";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = "unnqamed function statement";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = com.google.javascript.jscomp.NodeUtil.isReferenceName(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = "unnqamed function statement";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = new com.google.javascript.rhino.JSDocInfo();
    ((com.google.javascript.rhino.Node)v1).setJSDocInfo(((com.google.javascript.rhino.JSDocInfo)v2));
    Object v3 = null;
    Object v4 = com.google.javascript.jscomp.NodeUtil.isSimpleFunctionObjectCall(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = "unnqamed function statement";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = new com.google.javascript.rhino.Node[]{};
    Object v3 = com.google.javascript.jscomp.NodeUtil.newCallNode(((com.google.javascript.rhino.Node)v1),((com.google.javascript.rhino.Node[])v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = "unnqamed function statement";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = new com.google.javascript.rhino.Node[]{};
    Object v3 = com.google.javascript.jscomp.NodeUtil.newCallNode(((com.google.javascript.rhino.Node)v1),((com.google.javascript.rhino.Node[])v2));
    Object v4 = com.google.javascript.jscomp.NodeUtil.isNullOrUndefined(((com.google.javascript.rhino.Node)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = ": ";
    Object v1 = 0;
    Object v2 = new java.util.ArrayList((((java.lang.Integer)v1).intValue()));
    Object v3 = "unnqamed function statement";
    Object v4 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v3));
    Object v5 = -6;
    Object v6 = -36;
    Object v7 = com.google.javascript.jscomp.NodeUtil.newFunctionNode(((java.lang.String)v0),((java.util.List)v2),((com.google.javascript.rhino.Node)v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = "unnqamed function statement";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = 2;
    ((com.google.javascript.rhino.Node)v1).setCharno((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    Object v4 = -31;
    Object v5 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((((java.lang.Integer)v4).intValue()));
    Object v6 = -31;
    Object v7 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((((java.lang.Integer)v6).intValue()));
    Object v8 = com.google.javascript.jscomp.NodeUtil.getCount(((com.google.javascript.rhino.Node)v1),((com.google.common.base.Predicate)v5),((com.google.common.base.Predicate)v7));
    org.junit.Assert.assertEquals((Object)(0), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = ": ";
    Object v1 = 0;
    Object v2 = new java.util.ArrayList((((java.lang.Integer)v1).intValue()));
    Object v3 = "unnqamed function statement";
    Object v4 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v3));
    Object v5 = -6;
    Object v6 = -36;
    Object v7 = com.google.javascript.jscomp.NodeUtil.newFunctionNode(((java.lang.String)v0),((java.util.List)v2),((com.google.javascript.rhino.Node)v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = com.google.javascript.jscomp.NodeUtil.isNull(((com.google.javascript.rhino.Node)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = ": ";
    Object v1 = 0;
    Object v2 = new java.util.ArrayList((((java.lang.Integer)v1).intValue()));
    Object v3 = "unnqamed function statement";
    Object v4 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v3));
    Object v5 = -6;
    Object v6 = -36;
    Object v7 = com.google.javascript.jscomp.NodeUtil.newFunctionNode(((java.lang.String)v0),((java.util.List)v2),((com.google.javascript.rhino.Node)v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = 0;
    Object v9 = false;
    ((com.google.javascript.rhino.Node)v7).putBooleanProp((((java.lang.Integer)v8).intValue()),(((java.lang.Boolean)v9).booleanValue()));
    Object v10 = null;
    Object v11 = com.google.javascript.jscomp.NodeUtil.isThis(((com.google.javascript.rhino.Node)v7));
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = "unnqamed function statement";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = "%";
    Object v3 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(((com.google.javascript.rhino.Node)v1),((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = 28;
    Object v1 = com.google.javascript.jscomp.NodeUtil.isSimpleOperatorType((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertEquals((Object)(true), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = "unnqamed function statement";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = "unnqamed function statement";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = "unnqamed function statement";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v3 = "prototype";
    Object v4 = new java.io.PrintStream(((java.lang.String)v3));
    Object v5 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v2),((java.io.PrintStream)v4));
    Object v6 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v5));
    Object v7 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(((com.google.javascript.rhino.Node)v1),((com.google.javascript.jscomp.AbstractCompiler)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = "unnqamed function statement";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = com.google.javascript.jscomp.NodeUtil.isNull(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = "unnqamed function statement";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = com.google.javascript.jscomp.NodeUtil.containsFunction(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = 0;
    Object v1 = com.google.javascript.jscomp.NodeUtil.isCommutative((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = ": ";
    Object v1 = 0;
    Object v2 = new java.util.ArrayList((((java.lang.Integer)v1).intValue()));
    Object v3 = "unnqamed function statement";
    Object v4 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v3));
    Object v5 = -6;
    Object v6 = -36;
    Object v7 = com.google.javascript.jscomp.NodeUtil.newFunctionNode(((java.lang.String)v0),((java.util.List)v2),((com.google.javascript.rhino.Node)v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(((com.google.javascript.rhino.Node)v7));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = "unnqamed function statement";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = "unnqamed function statement";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v1));
    Object v3 = ((com.google.javascript.rhino.Node)v2).siblings();
    Object v4 = -31;
    Object v5 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((((java.lang.Integer)v4).intValue()));
    Object v6 = -31;
    Object v7 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((((java.lang.Integer)v6).intValue()));
    Object v8 = com.google.javascript.jscomp.NodeUtil.getCount(((com.google.javascript.rhino.Node)v2),((com.google.common.base.Predicate)v5),((com.google.common.base.Predicate)v7));
    org.junit.Assert.assertEquals((Object)(0), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = "unnqamed function statement";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v1));
    Object v3 = ((com.google.javascript.rhino.Node)v2).isQualifiedName();
    Object v4 = com.google.javascript.jscomp.NodeUtil.isStatementParent(((com.google.javascript.rhino.Node)v2));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = "unnqamed function statement";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = com.google.javascript.jscomp.NodeUtil.isExprAssign(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = "unnqamed function statement";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = -31;
    Object v3 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((((java.lang.Integer)v2).intValue()));
    Object v4 = com.google.javascript.jscomp.NodeUtil.valueCheck(((com.google.javascript.rhino.Node)v1),((com.google.common.base.Predicate)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = ": ";
    Object v1 = 0;
    Object v2 = new java.util.ArrayList((((java.lang.Integer)v1).intValue()));
    Object v3 = "unnqamed function statement";
    Object v4 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v3));
    Object v5 = -6;
    Object v6 = -36;
    Object v7 = com.google.javascript.jscomp.NodeUtil.newFunctionNode(((java.lang.String)v0),((java.util.List)v2),((com.google.javascript.rhino.Node)v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = "U  ";
    ((com.google.javascript.rhino.Node)v7).addSuppression(((java.lang.String)v8));
    Object v9 = null;
    com.google.javascript.jscomp.NodeUtil.redeclareVarsInsideBranch(((com.google.javascript.rhino.Node)v7));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = "unnqamed function statement";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v1));
    Object v3 = 0;
    Object v4 = new java.util.ArrayList((((java.lang.Integer)v3).intValue()));
    Object v5 = "unnqamed function statement";
    Object v6 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v5));
    Object v7 = 0;
    Object v8 = com.google.javascript.jscomp.NodeUtil.isCommutative((((java.lang.Integer)v7).intValue()));
    Object v9 = "unnqamed function statement";
    Object v10 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v9));
    Object v11 = new com.google.javascript.rhino.Node[]{};
    Object v12 = com.google.javascript.jscomp.NodeUtil.newCallNode(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node[])v11));
    Object v13 = 28;
    Object v14 = com.google.javascript.jscomp.NodeUtil.isSimpleOperatorType((((java.lang.Integer)v13).intValue()));
    Object v15 = -31;
    Object v16 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((((java.lang.Integer)v15).intValue()));
    Object v17 = java.util.Set.of(((java.lang.Object)v4),((java.lang.Object)v6),((java.lang.Object)v8),((java.lang.Object)v12),((java.lang.Object)v14),((java.lang.Object)v16));
    Object v18 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(((com.google.javascript.rhino.Node)v2),((java.util.Set)v17));
    org.junit.Assert.assertEquals((Object)(false), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = "unnqamed function statement";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v1));
    Object v3 = -9;
    Object v4 = 11;
    ((com.google.javascript.rhino.Node)v2).putIntProp((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v5 = null;
    Object v6 = com.google.javascript.jscomp.NodeUtil.getOpFromAssignmentOp(((com.google.javascript.rhino.Node)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = "unnqamed function statement";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = new com.google.javascript.rhino.Node[]{};
    Object v3 = com.google.javascript.jscomp.NodeUtil.newCallNode(((com.google.javascript.rhino.Node)v1),((com.google.javascript.rhino.Node[])v2));
    Object v4 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(((com.google.javascript.rhino.Node)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = ": ";
    Object v1 = 0;
    Object v2 = new java.util.ArrayList((((java.lang.Integer)v1).intValue()));
    Object v3 = "unnqamed function statement";
    Object v4 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v3));
    Object v5 = -6;
    Object v6 = -36;
    Object v7 = com.google.javascript.jscomp.NodeUtil.newFunctionNode(((java.lang.String)v0),((java.util.List)v2),((com.google.javascript.rhino.Node)v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(((com.google.javascript.rhino.Node)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = "prototypHe";
    Object v1 = com.google.javascript.jscomp.NodeUtil.trimJsWhiteSpace(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("prototypHe"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = "unnqamed function statement";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v1));
    Object v3 = 0;
    Object v4 = new java.util.ArrayList((((java.lang.Integer)v3).intValue()));
    Object v5 = "unnqamed function statement";
    Object v6 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v5));
    Object v7 = 0;
    Object v8 = com.google.javascript.jscomp.NodeUtil.isCommutative((((java.lang.Integer)v7).intValue()));
    Object v9 = "unnqamed function statement";
    Object v10 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v9));
    Object v11 = new com.google.javascript.rhino.Node[]{};
    Object v12 = com.google.javascript.jscomp.NodeUtil.newCallNode(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node[])v11));
    Object v13 = 28;
    Object v14 = com.google.javascript.jscomp.NodeUtil.isSimpleOperatorType((((java.lang.Integer)v13).intValue()));
    Object v15 = -31;
    Object v16 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((((java.lang.Integer)v15).intValue()));
    Object v17 = java.util.Set.of(((java.lang.Object)v4),((java.lang.Object)v6),((java.lang.Object)v8),((java.lang.Object)v12),((java.lang.Object)v14),((java.lang.Object)v16));
    ((com.google.javascript.rhino.Node)v2).setDirectives(((java.util.Set)v17));
    Object v18 = null;
    Object v19 = -31;
    Object v20 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((((java.lang.Integer)v19).intValue()));
    Object v21 = "unnqamed function statement";
    Object v22 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v21));
    Object v23 = new com.google.javascript.rhino.Node[]{};
    Object v24 = com.google.javascript.jscomp.NodeUtil.newCallNode(((com.google.javascript.rhino.Node)v22),((com.google.javascript.rhino.Node[])v23));
    Object v25 = com.google.javascript.jscomp.NodeUtil.isNullOrUndefined(((com.google.javascript.rhino.Node)v24));
    Object v26 = ((com.google.common.base.Predicate)v20).equals(((java.lang.Object)v25));
    Object v27 = -31;
    Object v28 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((((java.lang.Integer)v27).intValue()));
    Object v29 = com.google.javascript.jscomp.NodeUtil.has(((com.google.javascript.rhino.Node)v2),((com.google.common.base.Predicate)v20),((com.google.common.base.Predicate)v28));
    org.junit.Assert.assertEquals((Object)(false), v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = 1;
    Object v1 = com.google.javascript.jscomp.NodeUtil.opToStr((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = "";
    Object v1 = "unnqamed function statement";
    Object v2 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v1));
    Object v3 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v2));
    Object v4 = com.google.javascript.jscomp.NodeUtil.newVarNode(((java.lang.String)v0),((com.google.javascript.rhino.Node)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = "";
    Object v1 = "unnqamed function statement";
    Object v2 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v1));
    Object v3 = com.google.javascript.jscomp.NodeUtil.newVarNode(((java.lang.String)v0),((com.google.javascript.rhino.Node)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = "unnqamed function statement";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = com.google.javascript.jscomp.NodeUtil.isString(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = "unnqamed function statement";
    Object v2 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v1));
    Object v3 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v2));
    Object v4 = com.google.javascript.jscomp.NodeUtil.newVarNode(((java.lang.String)v0),((com.google.javascript.rhino.Node)v3));
    Object v5 = false;
    Object v6 = true;
    Object v7 = true;
    Object v8 = ((com.google.javascript.rhino.Node)v4).toString((((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = com.google.javascript.jscomp.NodeUtil.getOpFromAssignmentOp(((com.google.javascript.rhino.Node)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = "unnqamed function statement";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v3 = "prototype";
    Object v4 = new java.io.PrintStream(((java.lang.String)v3));
    Object v5 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v2),((java.io.PrintStream)v4));
    Object v6 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v5));
    Object v7 = com.google.javascript.jscomp.NodeUtil.functionCallHasSideEffects(((com.google.javascript.rhino.Node)v1),((com.google.javascript.jscomp.AbstractCompiler)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = "unnqamed function statement";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = new com.google.javascript.rhino.Node[]{};
    Object v3 = com.google.javascript.jscomp.NodeUtil.newCallNode(((com.google.javascript.rhino.Node)v1),((com.google.javascript.rhino.Node[])v2));
    Object v4 = com.google.javascript.jscomp.NodeUtil.tryMergeBlock(((com.google.javascript.rhino.Node)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = "unnqamed function statement";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = new com.google.javascript.rhino.Node[]{};
    Object v3 = com.google.javascript.jscomp.NodeUtil.newCallNode(((com.google.javascript.rhino.Node)v1),((com.google.javascript.rhino.Node[])v2));
    Object v4 = true;
    ((com.google.javascript.rhino.Node)v3).setVarArgs((((java.lang.Boolean)v4).booleanValue()));
    Object v5 = null;
    Object v6 = com.google.javascript.jscomp.NodeUtil.isPrototypeProperty(((com.google.javascript.rhino.Node)v3));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = "unnqamed function statement";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = "unnqamed function statement";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v1));
    Object v3 = com.google.javascript.jscomp.NodeUtil.isFunctionExpression(((com.google.javascript.rhino.Node)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = "";
    Object v1 = "unnqamed function statement";
    Object v2 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v1));
    Object v3 = com.google.javascript.jscomp.NodeUtil.newVarNode(((java.lang.String)v0),((com.google.javascript.rhino.Node)v2));
    Object v4 = com.google.javascript.jscomp.NodeUtil.isForIn(((com.google.javascript.rhino.Node)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = "unnqamed function statement";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = new com.google.javascript.rhino.Node[]{};
    Object v3 = com.google.javascript.jscomp.NodeUtil.newCallNode(((com.google.javascript.rhino.Node)v1),((com.google.javascript.rhino.Node[])v2));
    Object v4 = com.google.javascript.jscomp.NodeUtil.getObjectLitKeyName(((com.google.javascript.rhino.Node)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = "unnqamed function statement";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = new com.google.javascript.rhino.Node[]{};
    Object v3 = com.google.javascript.jscomp.NodeUtil.newCallNode(((com.google.javascript.rhino.Node)v1),((com.google.javascript.rhino.Node[])v2));
    Object v4 = com.google.javascript.jscomp.NodeUtil.isExprAssign(((com.google.javascript.rhino.Node)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = "unnqamed function statement";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = new com.google.javascript.rhino.Node[]{};
    Object v3 = com.google.javascript.jscomp.NodeUtil.newCallNode(((com.google.javascript.rhino.Node)v1),((com.google.javascript.rhino.Node[])v2));
    Object v4 = com.google.javascript.jscomp.NodeUtil.getFnParameters(((com.google.javascript.rhino.Node)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = "unnqamed function statement";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = -31;
    Object v3 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((((java.lang.Integer)v2).intValue()));
    Object v4 = "unnqamed function statement";
    Object v5 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v4));
    Object v6 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v5));
    Object v7 = ((com.google.javascript.rhino.Node)v6).siblings();
    Object v8 = -31;
    Object v9 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((((java.lang.Integer)v8).intValue()));
    Object v10 = -31;
    Object v11 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((((java.lang.Integer)v10).intValue()));
    Object v12 = com.google.javascript.jscomp.NodeUtil.getCount(((com.google.javascript.rhino.Node)v6),((com.google.common.base.Predicate)v9),((com.google.common.base.Predicate)v11));
    Object v13 = ((com.google.common.base.Predicate)v3).equals(((java.lang.Object)v12));
    Object v14 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(((com.google.javascript.rhino.Node)v1),((com.google.common.base.Predicate)v3));
    org.junit.Assert.assertEquals((Object)(true), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = "unnqamed function statement";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = com.google.javascript.jscomp.NodeUtil.getAssignedValue(((com.google.javascript.rhino.Node)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = "unnqamed function statement";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = new com.google.javascript.rhino.Node[]{};
    Object v3 = com.google.javascript.jscomp.NodeUtil.newCallNode(((com.google.javascript.rhino.Node)v1),((com.google.javascript.rhino.Node[])v2));
    Object v4 = com.google.javascript.jscomp.NodeUtil.getPureBooleanValue(((com.google.javascript.rhino.Node)v3));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = "unnqamed function statement";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    com.google.javascript.jscomp.NodeUtil.maybeAddFinally(((com.google.javascript.rhino.Node)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = -106;
    Object v1 = com.google.javascript.jscomp.NodeUtil.isStrWhiteSpaceChar((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.TernaryValue.FALSE), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = "unnqamed function statement";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = new com.google.javascript.rhino.Node[]{};
    Object v3 = com.google.javascript.jscomp.NodeUtil.newCallNode(((com.google.javascript.rhino.Node)v1),((com.google.javascript.rhino.Node[])v2));
    Object v4 = com.google.javascript.jscomp.NodeUtil.isGetProp(((com.google.javascript.rhino.Node)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = "unnqamed function statement";
    Object v2 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v1));
    Object v3 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v2));
    Object v4 = com.google.javascript.jscomp.NodeUtil.newVarNode(((java.lang.String)v0),((com.google.javascript.rhino.Node)v3));
    Object v5 = "unnqamed function statement";
    Object v6 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v5));
    com.google.javascript.jscomp.NodeUtil.removeChild(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = "unnqamed function statement";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = com.google.javascript.jscomp.NodeUtil.hasFinally(((com.google.javascript.rhino.Node)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = "unnqamed function statement";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = com.google.javascript.jscomp.NodeUtil.isControlStructure(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = "unnqamed function statement";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    ((com.google.javascript.rhino.Node)v1).detachChildren();
    Object v2 = null;
    Object v3 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = "unnqamed function statement";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = -31;
    Object v3 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((((java.lang.Integer)v2).intValue()));
    Object v4 = -31;
    Object v5 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((((java.lang.Integer)v4).intValue()));
    Object v6 = com.google.javascript.jscomp.NodeUtil.getCount(((com.google.javascript.rhino.Node)v1),((com.google.common.base.Predicate)v3),((com.google.common.base.Predicate)v5));
    org.junit.Assert.assertEquals((Object)(0), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = "ull";
    Object v1 = com.google.javascript.jscomp.NodeUtil.isValidPropertyName(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(true), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = "unnqamed function statement";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = false;
    ((com.google.javascript.rhino.Node)v1).setVarArgs((((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    Object v4 = com.google.javascript.jscomp.NodeUtil.mayBeString(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = "unnqamed function statement";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v1));
    Object v3 = com.google.javascript.jscomp.NodeUtil.isNew(((com.google.javascript.rhino.Node)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = "unnqamed function statement";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = com.google.javascript.jscomp.NodeUtil.isTryCatchNodeContainer(((com.google.javascript.rhino.Node)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = "unnqamed function statement";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v1));
    Object v3 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(((com.google.javascript.rhino.Node)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = "unnqamed function statement";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = com.google.javascript.jscomp.NodeUtil.isLabelName(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = "unnqamed function statement";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v1));
    Object v3 = com.google.javascript.jscomp.NodeUtil.isAssign(((com.google.javascript.rhino.Node)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = "";
    Object v1 = "unnqamed function statement";
    Object v2 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v1));
    Object v3 = com.google.javascript.jscomp.NodeUtil.newVarNode(((java.lang.String)v0),((com.google.javascript.rhino.Node)v2));
    Object v4 = ((com.google.javascript.rhino.Node)v3).siblings();
    Object v5 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(((com.google.javascript.rhino.Node)v3));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = "unnqamed function statement";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = -14;
    ((com.google.javascript.rhino.Node)v1).setCharno((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    Object v4 = "unnqamed function statement";
    Object v5 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v4));
    com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(((com.google.javascript.rhino.Node)v1),((com.google.javascript.rhino.Node)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = "unnqamed function statement";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = new com.google.javascript.rhino.Node[]{};
    Object v3 = com.google.javascript.jscomp.NodeUtil.newCallNode(((com.google.javascript.rhino.Node)v1),((com.google.javascript.rhino.Node[])v2));
    Object v4 = com.google.javascript.jscomp.NodeUtil.isVar(((com.google.javascript.rhino.Node)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = "";
    Object v1 = "unnqamed function statement";
    Object v2 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v1));
    Object v3 = com.google.javascript.jscomp.NodeUtil.newVarNode(((java.lang.String)v0),((com.google.javascript.rhino.Node)v2));
    Object v4 = com.google.javascript.jscomp.NodeUtil.isLoopStructure(((com.google.javascript.rhino.Node)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = "";
    Object v1 = "unnqamed function statement";
    Object v2 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v1));
    Object v3 = com.google.javascript.jscomp.NodeUtil.newVarNode(((java.lang.String)v0),((com.google.javascript.rhino.Node)v2));
    Object v4 = com.google.javascript.jscomp.NodeUtil.isNull(((com.google.javascript.rhino.Node)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = "unnqamed function statement";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v1));
    Object v3 = com.google.javascript.jscomp.NodeUtil.getConditionExpression(((com.google.javascript.rhino.Node)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = "unnqamed function statement";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = com.google.javascript.jscomp.NodeUtil.getStringValue(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = ": ";
    Object v1 = 0;
    Object v2 = new java.util.ArrayList((((java.lang.Integer)v1).intValue()));
    Object v3 = "unnqamed function statement";
    Object v4 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v3));
    Object v5 = -6;
    Object v6 = -36;
    Object v7 = com.google.javascript.jscomp.NodeUtil.newFunctionNode(((java.lang.String)v0),((java.util.List)v2),((com.google.javascript.rhino.Node)v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = 0;
    Object v9 = new java.util.ArrayList((((java.lang.Integer)v8).intValue()));
    Object v10 = "unnqamed function statement";
    Object v11 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v10));
    Object v12 = 0;
    Object v13 = com.google.javascript.jscomp.NodeUtil.isCommutative((((java.lang.Integer)v12).intValue()));
    Object v14 = "unnqamed function statement";
    Object v15 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v14));
    Object v16 = new com.google.javascript.rhino.Node[]{};
    Object v17 = com.google.javascript.jscomp.NodeUtil.newCallNode(((com.google.javascript.rhino.Node)v15),((com.google.javascript.rhino.Node[])v16));
    Object v18 = 28;
    Object v19 = com.google.javascript.jscomp.NodeUtil.isSimpleOperatorType((((java.lang.Integer)v18).intValue()));
    Object v20 = -31;
    Object v21 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((((java.lang.Integer)v20).intValue()));
    Object v22 = java.util.Set.of(((java.lang.Object)v9),((java.lang.Object)v11),((java.lang.Object)v13),((java.lang.Object)v17),((java.lang.Object)v19),((java.lang.Object)v21));
    Object v23 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(((com.google.javascript.rhino.Node)v7),((java.util.Set)v22));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = "unnqamed function statement";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = com.google.javascript.jscomp.NodeUtil.arrayToString(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertEquals((Object)(""), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = "";
    Object v1 = "unnqamed function statement";
    Object v2 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v1));
    Object v3 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v2));
    Object v4 = com.google.javascript.jscomp.NodeUtil.newVarNode(((java.lang.String)v0),((com.google.javascript.rhino.Node)v3));
    Object v5 = com.google.javascript.jscomp.NodeUtil.isEmptyBlock(((com.google.javascript.rhino.Node)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = "unnqamed function statement";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = "unnqamed function statement";
    Object v3 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v2));
    Object v4 = new com.google.javascript.rhino.Node[]{};
    Object v5 = com.google.javascript.jscomp.NodeUtil.newCallNode(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.Node[])v4));
    Object v6 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(((com.google.javascript.rhino.Node)v1),((com.google.javascript.rhino.Node)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = "unnqamed function statement";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = "unnqamed function statement";
    Object v3 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v2));
    ((com.google.javascript.rhino.Node)v1).addChildrenToFront(((com.google.javascript.rhino.Node)v3));
    Object v4 = null;
    Object v5 = "' in this oop";
    Object v6 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(((com.google.javascript.rhino.Node)v1),((java.lang.String)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = "unnqamed function statement";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = com.google.javascript.jscomp.NodeUtil.getCatchBlock(((com.google.javascript.rhino.Node)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = ": ";
    Object v1 = 0;
    Object v2 = new java.util.ArrayList((((java.lang.Integer)v1).intValue()));
    Object v3 = "unnqamed function statement";
    Object v4 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v3));
    Object v5 = -6;
    Object v6 = -36;
    Object v7 = com.google.javascript.jscomp.NodeUtil.newFunctionNode(((java.lang.String)v0),((java.util.List)v2),((com.google.javascript.rhino.Node)v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(((com.google.javascript.rhino.Node)v7));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = "unnqamed function statement";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v1));
    Object v3 = com.google.javascript.jscomp.NodeUtil.isUndefined(((com.google.javascript.rhino.Node)v2));
    org.junit.Assert.assertEquals((Object)(true), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = "unnqamed function statement";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = "";
    Object v3 = "unnqamed function statement";
    Object v4 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v3));
    Object v5 = com.google.javascript.jscomp.NodeUtil.newVarNode(((java.lang.String)v2),((com.google.javascript.rhino.Node)v4));
    ((com.google.javascript.rhino.Node)v1).addChildToFront(((com.google.javascript.rhino.Node)v5));
    Object v6 = null;
    Object v7 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v8 = "prototype";
    Object v9 = new java.io.PrintStream(((java.lang.String)v8));
    Object v10 = new com.google.javascript.jscomp.PrintStreamErrorManager(((com.google.javascript.jscomp.MessageFormatter)v7),((java.io.PrintStream)v9));
    Object v11 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v10));
    Object v12 = com.google.javascript.jscomp.NodeUtil.constructorCallHasSideEffects(((com.google.javascript.rhino.Node)v1),((com.google.javascript.jscomp.AbstractCompiler)v11));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = "unnqamed function statement";
    Object v2 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v1));
    Object v3 = com.google.javascript.jscomp.NodeUtil.newVarNode(((java.lang.String)v0),((com.google.javascript.rhino.Node)v2));
    Object v4 = com.google.javascript.jscomp.NodeUtil.isTryCatchNodeContainer(((com.google.javascript.rhino.Node)v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = "unnqamed function statement";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = 0;
    Object v3 = new java.util.ArrayList((((java.lang.Integer)v2).intValue()));
    Object v4 = "unnqamed function statement";
    Object v5 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v4));
    Object v6 = 0;
    Object v7 = com.google.javascript.jscomp.NodeUtil.isCommutative((((java.lang.Integer)v6).intValue()));
    Object v8 = "unnqamed function statement";
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8));
    Object v10 = new com.google.javascript.rhino.Node[]{};
    Object v11 = com.google.javascript.jscomp.NodeUtil.newCallNode(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node[])v10));
    Object v12 = 28;
    Object v13 = com.google.javascript.jscomp.NodeUtil.isSimpleOperatorType((((java.lang.Integer)v12).intValue()));
    Object v14 = -31;
    Object v15 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((((java.lang.Integer)v14).intValue()));
    Object v16 = java.util.Set.of(((java.lang.Object)v3),((java.lang.Object)v5),((java.lang.Object)v7),((java.lang.Object)v11),((java.lang.Object)v13),((java.lang.Object)v15));
    ((com.google.javascript.rhino.Node)v1).setDirectives(((java.util.Set)v16));
    Object v17 = null;
    Object v18 = com.google.javascript.jscomp.NodeUtil.isGetOrSetKey(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertEquals((Object)(false), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = "unnqamed function statement";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = com.google.javascript.jscomp.NodeUtil.isCall(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = "";
    Object v1 = "unnqamed function statement";
    Object v2 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v1));
    Object v3 = com.google.javascript.jscomp.NodeUtil.newVarNode(((java.lang.String)v0),((com.google.javascript.rhino.Node)v2));
    Object v4 = false;
    Object v5 = com.google.javascript.jscomp.NodeUtil.isLiteralValue(((com.google.javascript.rhino.Node)v3),(((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = "unnqamed function statement";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = com.google.javascript.jscomp.NodeUtil.getFnParameters(((com.google.javascript.rhino.Node)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = "unnqamed function statement";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = true;
    Object v3 = com.google.javascript.jscomp.NodeUtil.mayBeString(((com.google.javascript.rhino.Node)v1),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertEquals((Object)(true), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = "unnqamed function statement";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = new com.google.javascript.rhino.Node[]{};
    Object v3 = com.google.javascript.jscomp.NodeUtil.newCallNode(((com.google.javascript.rhino.Node)v1),((com.google.javascript.rhino.Node[])v2));
    Object v4 = "";
    Object v5 = "unnqamed function statement";
    Object v6 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v5));
    Object v7 = com.google.javascript.jscomp.NodeUtil.newVarNode(((java.lang.String)v4),((com.google.javascript.rhino.Node)v6));
    com.google.javascript.jscomp.NodeUtil.removeChild(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.Node)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = "unnqamed function statement";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v1));
    Object v3 = com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(((com.google.javascript.rhino.Node)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = "unnqamed function statement";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = new com.google.javascript.rhino.Node[]{};
    Object v3 = com.google.javascript.jscomp.NodeUtil.newCallNode(((com.google.javascript.rhino.Node)v1),((com.google.javascript.rhino.Node[])v2));
    Object v4 = com.google.javascript.jscomp.NodeUtil.isBooleanResult(((com.google.javascript.rhino.Node)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = "";
    Object v1 = "unnqamed function statement";
    Object v2 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v1));
    Object v3 = com.google.javascript.jscomp.NodeUtil.newVarNode(((java.lang.String)v0),((com.google.javascript.rhino.Node)v2));
    Object v4 = com.google.javascript.jscomp.NodeUtil.isEmptyBlock(((com.google.javascript.rhino.Node)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = "unnqamed function statement";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = false;
    Object v3 = com.google.javascript.jscomp.NodeUtil.mayBeString(((com.google.javascript.rhino.Node)v1),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertEquals((Object)(true), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = "unnqamed function statement";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = ((com.google.javascript.rhino.Node)v1).hasSideEffects();
    Object v3 = com.google.javascript.jscomp.NodeUtil.isGet(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = "unnqamed function statement";
    Object v2 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v1));
    Object v3 = com.google.javascript.jscomp.NodeUtil.newVarNode(((java.lang.String)v0),((com.google.javascript.rhino.Node)v2));
    Object v4 = com.google.javascript.jscomp.NodeUtil.getRootOfQualifiedName(((com.google.javascript.rhino.Node)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v1 = ((com.google.javascript.jscomp.CodingConvention)v0).getExportPropertyFunction();
    Object v2 = "unnqamed function statement";
    Object v3 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v2));
    Object v4 = "";
    ((com.google.javascript.rhino.Node)v3).addSuppression(((java.lang.String)v4));
    Object v5 = null;
    Object v6 = "unnqamed function statement";
    Object v7 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v6));
    Object v8 = new com.google.javascript.rhino.Node[]{};
    Object v9 = com.google.javascript.jscomp.NodeUtil.newCallNode(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node[])v8));
    Object v10 = com.google.javascript.jscomp.NodeUtil.isConstantByConvention(((com.google.javascript.jscomp.CodingConvention)v0),((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.Node)v9));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = "unnqamed function statement";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = "N";
    ((com.google.javascript.rhino.Node)v1).addSuppression(((java.lang.String)v2));
    Object v3 = null;
    Object v4 = "";
    Object v5 = "unnqamed function statement";
    Object v6 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v5));
    Object v7 = com.google.javascript.jscomp.NodeUtil.newVarNode(((java.lang.String)v4),((com.google.javascript.rhino.Node)v6));
    Object v8 = com.google.javascript.jscomp.NodeUtil.isLhs(((com.google.javascript.rhino.Node)v1),((com.google.javascript.rhino.Node)v7));
    org.junit.Assert.assertEquals((Object)(true), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = "unnqamed function statement";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = ((com.google.javascript.rhino.Node)v1).isQualifiedName();
    Object v3 = "unnqamed function statement";
    Object v4 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v3));
    Object v5 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(((com.google.javascript.rhino.Node)v4));
    Object v6 = com.google.javascript.jscomp.NodeUtil.isControlStructureCodeBlock(((com.google.javascript.rhino.Node)v1),((com.google.javascript.rhino.Node)v5));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = "unnqamed function statement";
    Object v1 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v0));
    Object v2 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertEquals((Object)(true), v2);
  }
}
