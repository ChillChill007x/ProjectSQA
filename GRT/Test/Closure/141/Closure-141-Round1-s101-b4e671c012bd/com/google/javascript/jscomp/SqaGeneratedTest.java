package com.google.javascript.jscomp;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = 0;
    Object v1 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v0).intValue()));
    Object v2 = 0;
    Object v3 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v2).intValue()));
    ((com.google.javascript.rhino.Node)v1).addChildToBack(((com.google.javascript.rhino.Node)v3));
    Object v4 = null;
    Object v5 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = 0;
    Object v1 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v0).intValue()));
    Object v2 = com.google.javascript.jscomp.NodeUtil.isSimpleFunctionObjectCall(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v0).intValue()));
    Object v2 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v2));
    Object v4 = "b";
    Object v5 = ",";
    Object v6 = 3;
    Object v7 = 46;
    Object v8 = new com.google.javascript.rhino.jstype.NamedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v3),((java.lang.String)v4),((java.lang.String)v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    ((com.google.javascript.rhino.Node)v1).setJSType(((com.google.javascript.rhino.jstype.JSType)v8));
    Object v9 = null;
    Object v10 = com.google.javascript.jscomp.NodeUtil.constructorCallHasSideEffects(((com.google.javascript.rhino.Node)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = 0;
    Object v1 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v0).intValue()));
    Object v2 = com.google.javascript.jscomp.NodeUtil.isString(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = 0;
    Object v1 = com.google.javascript.jscomp.NodeUtil.isAssociative((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = 0;
    Object v1 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v0).intValue()));
    Object v2 = com.google.javascript.jscomp.NodeUtil.isForIn(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = 0;
    Object v1 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v0).intValue()));
    Object v2 = "0";
    Object v3 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(((com.google.javascript.rhino.Node)v1),((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(0), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = 0;
    Object v2 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v1).intValue()));
    Object v3 = 0;
    Object v4 = com.google.javascript.jscomp.NodeUtil.isAssociative((((java.lang.Integer)v3).intValue()));
    Object v5 = 0;
    Object v6 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v5).intValue()));
    Object v7 = 0;
    Object v8 = com.google.javascript.jscomp.NodeUtil.isAssociative((((java.lang.Integer)v7).intValue()));
    Object v9 = java.util.List.of(((java.lang.Object)v2),((java.lang.Object)v4),((java.lang.Object)v6),((java.lang.Object)v8));
    Object v10 = 0;
    Object v11 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v10).intValue()));
    Object v12 = -16;
    Object v13 = 0;
    Object v14 = com.google.javascript.jscomp.NodeUtil.newFunctionNode(((java.lang.String)v0),((java.util.List)v9),((com.google.javascript.rhino.Node)v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = 0;
    Object v1 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v0).intValue()));
    Object v2 = ((com.google.javascript.rhino.Node)v1).cloneNode();
    Object v3 = com.google.javascript.jscomp.NodeUtil.isLoopStructure(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v0).intValue()));
    Object v2 = 22;
    ((com.google.javascript.rhino.Node)v1).setLineno((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    Object v4 = com.google.javascript.jscomp.NodeUtil.tryMergeBlock(((com.google.javascript.rhino.Node)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v0).intValue()));
    Object v2 = com.google.javascript.jscomp.NodeUtil.isFunctionAnonymous(((com.google.javascript.rhino.Node)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = "(";
    Object v1 = 0;
    Object v2 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v1).intValue()));
    Object v3 = ((com.google.javascript.rhino.Node)v2).getJsDocBuilderForNode();
    Object v4 = com.google.javascript.jscomp.NodeUtil.newVarNode(((java.lang.String)v0),((com.google.javascript.rhino.Node)v2));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = 0;
    Object v1 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v0).intValue()));
    Object v2 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v0).intValue()));
    Object v2 = 0;
    Object v3 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v2).intValue()));
    Object v4 = com.google.javascript.jscomp.NodeUtil.getFunctionName(((com.google.javascript.rhino.Node)v1),((com.google.javascript.rhino.Node)v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = 0;
    Object v1 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v0).intValue()));
    Object v2 = com.google.javascript.jscomp.NodeUtil.isReferenceName(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = 0;
    Object v1 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v0).intValue()));
    Object v2 = com.google.javascript.jscomp.NodeUtil.isNew(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = 0;
    Object v1 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v0).intValue()));
    Object v2 = 0;
    Object v3 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v2).intValue()));
    com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(((com.google.javascript.rhino.Node)v1),((com.google.javascript.rhino.Node)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = 0;
    Object v1 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v0).intValue()));
    Object v2 = com.google.javascript.jscomp.NodeUtil.isVarDeclaration(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = 0;
    Object v1 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v0).intValue()));
    Object v2 = com.google.javascript.jscomp.NodeUtil.getStringValue(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = 0;
    Object v1 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v0).intValue()));
    Object v2 = com.google.javascript.jscomp.NodeUtil.isGet(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = 1;
    Object v1 = com.google.javascript.jscomp.NodeUtil.opToStr((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v0).intValue()));
    Object v2 = com.google.javascript.jscomp.NodeUtil.getBooleanValue(((com.google.javascript.rhino.Node)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = "(";
    Object v1 = 0;
    Object v2 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v1).intValue()));
    Object v3 = ((com.google.javascript.rhino.Node)v2).getJsDocBuilderForNode();
    Object v4 = com.google.javascript.jscomp.NodeUtil.newVarNode(((java.lang.String)v0),((com.google.javascript.rhino.Node)v2));
    Object v5 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(((com.google.javascript.rhino.Node)v4));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = 0;
    Object v1 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v0).intValue()));
    Object v2 = 0;
    Object v3 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v2).intValue()));
    Object v4 = ((com.google.javascript.rhino.Node)v1).checkTreeEqualsSilent(((com.google.javascript.rhino.Node)v3));
    Object v5 = com.google.javascript.jscomp.NodeUtil.isAssign(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = "(";
    Object v1 = 0;
    Object v2 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v1).intValue()));
    Object v3 = ((com.google.javascript.rhino.Node)v2).getJsDocBuilderForNode();
    Object v4 = com.google.javascript.jscomp.NodeUtil.newVarNode(((java.lang.String)v0),((com.google.javascript.rhino.Node)v2));
    Object v5 = com.google.javascript.jscomp.NodeUtil.getConditionExpression(((com.google.javascript.rhino.Node)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = 0;
    Object v1 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v0).intValue()));
    Object v2 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = 0;
    Object v1 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v0).intValue()));
    Object v2 = com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = "(";
    Object v1 = 0;
    Object v2 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v1).intValue()));
    Object v3 = ((com.google.javascript.rhino.Node)v2).getJsDocBuilderForNode();
    Object v4 = com.google.javascript.jscomp.NodeUtil.newVarNode(((java.lang.String)v0),((com.google.javascript.rhino.Node)v2));
    Object v5 = ((com.google.javascript.rhino.Node)v4).cloneNode();
    Object v6 = com.google.javascript.jscomp.NodeUtil.isLoopStructure(((com.google.javascript.rhino.Node)v4));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = "nmber";
    Object v1 = com.google.javascript.jscomp.NodeUtil.isValidPropertyName(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(true), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = "(";
    Object v1 = 0;
    Object v2 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v1).intValue()));
    Object v3 = ((com.google.javascript.rhino.Node)v2).getJsDocBuilderForNode();
    Object v4 = com.google.javascript.jscomp.NodeUtil.newVarNode(((java.lang.String)v0),((com.google.javascript.rhino.Node)v2));
    Object v5 = com.google.javascript.jscomp.NodeUtil.getCatchBlock(((com.google.javascript.rhino.Node)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = 0;
    Object v1 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v0).intValue()));
    Object v2 = com.google.javascript.jscomp.NodeUtil.isVar(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = -5;
    Object v1 = com.google.javascript.jscomp.NodeUtil.isAssociative((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = 0;
    Object v1 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v0).intValue()));
    Object v2 = ((com.google.javascript.rhino.Node)v1).children();
    Object v3 = com.google.javascript.jscomp.NodeUtil.getLoopCodeBlock(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = "(";
    Object v1 = 0;
    Object v2 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v1).intValue()));
    Object v3 = ((com.google.javascript.rhino.Node)v2).getJsDocBuilderForNode();
    Object v4 = com.google.javascript.jscomp.NodeUtil.newVarNode(((java.lang.String)v0),((com.google.javascript.rhino.Node)v2));
    Object v5 = ((com.google.javascript.rhino.Node)v4).cloneNode();
    Object v6 = 0;
    Object v7 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v6).intValue()));
    com.google.javascript.jscomp.NodeUtil.removeChild(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = 0;
    Object v1 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v0).intValue()));
    Object v2 = 0;
    Object v3 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v2).intValue()));
    Object v4 = ((com.google.javascript.rhino.Node)v1).checkTreeTypeAwareEqualsSilent(((com.google.javascript.rhino.Node)v3));
    Object v5 = com.google.javascript.jscomp.NodeUtil.newExpr(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v0).intValue()));
    Object v2 = 0;
    Object v3 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v2).intValue()));
    Object v4 = ((com.google.javascript.rhino.Node)v1).checkTreeTypeAwareEqualsSilent(((com.google.javascript.rhino.Node)v3));
    Object v5 = com.google.javascript.jscomp.NodeUtil.newExpr(((com.google.javascript.rhino.Node)v1));
    Object v6 = ((com.google.javascript.rhino.Node)v5).getQualifiedName();
    Object v7 = "(";
    Object v8 = 0;
    Object v9 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v8).intValue()));
    Object v10 = ((com.google.javascript.rhino.Node)v9).getJsDocBuilderForNode();
    Object v11 = com.google.javascript.jscomp.NodeUtil.newVarNode(((java.lang.String)v7),((com.google.javascript.rhino.Node)v9));
    Object v12 = com.google.javascript.jscomp.NodeUtil.isControlStructureCodeBlock(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v11));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = 0;
    Object v1 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v0).intValue()));
    Object v2 = 0;
    Object v3 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v2).intValue()));
    Object v4 = 0;
    Object v5 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v4).intValue()));
    ((com.google.javascript.rhino.Node)v1).addChildAfter(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.Node)v5));
    Object v6 = null;
    Object v7 = com.google.javascript.jscomp.NodeUtil.isLiteralValue(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = "(";
    Object v1 = 0;
    Object v2 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v1).intValue()));
    Object v3 = ((com.google.javascript.rhino.Node)v2).getJsDocBuilderForNode();
    Object v4 = com.google.javascript.jscomp.NodeUtil.newVarNode(((java.lang.String)v0),((com.google.javascript.rhino.Node)v2));
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = java.util.Set.of(((java.lang.Object)v5));
    Object v7 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(((com.google.javascript.rhino.Node)v4),((java.util.Set)v6));
    org.junit.Assert.assertEquals((Object)(true), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = 0;
    Object v1 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v0).intValue()));
    Object v2 = 0;
    Object v3 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((((java.lang.Integer)v2).intValue()));
    Object v4 = 0;
    Object v5 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((((java.lang.Integer)v4).intValue()));
    Object v6 = com.google.javascript.jscomp.NodeUtil.has(((com.google.javascript.rhino.Node)v1),((com.google.common.base.Predicate)v3),((com.google.common.base.Predicate)v5));
    org.junit.Assert.assertEquals((Object)(true), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = 0;
    Object v1 = com.google.javascript.jscomp.NodeUtil.opToStr((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = 0;
    Object v1 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v0).intValue()));
    Object v2 = com.google.javascript.jscomp.NodeUtil.isLiteralValue(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = 0;
    Object v1 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v0).intValue()));
    Object v2 = "(";
    Object v3 = 0;
    Object v4 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v3).intValue()));
    Object v5 = ((com.google.javascript.rhino.Node)v4).getJsDocBuilderForNode();
    Object v6 = com.google.javascript.jscomp.NodeUtil.newVarNode(((java.lang.String)v2),((com.google.javascript.rhino.Node)v4));
    ((com.google.javascript.rhino.Node)v1).addChildToFront(((com.google.javascript.rhino.Node)v6));
    Object v7 = null;
    Object v8 = com.google.javascript.jscomp.NodeUtil.getLoopCodeBlock(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = 0;
    Object v1 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v0).intValue()));
    Object v2 = 0;
    Object v3 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v2).intValue()));
    Object v4 = 0;
    Object v5 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v4).intValue()));
    ((com.google.javascript.rhino.Node)v3).addChildToBack(((com.google.javascript.rhino.Node)v5));
    Object v6 = null;
    Object v7 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(((com.google.javascript.rhino.Node)v1),((com.google.javascript.rhino.Node)v3));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = "(";
    Object v1 = 0;
    Object v2 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v1).intValue()));
    Object v3 = ((com.google.javascript.rhino.Node)v2).getJsDocBuilderForNode();
    Object v4 = com.google.javascript.jscomp.NodeUtil.newVarNode(((java.lang.String)v0),((com.google.javascript.rhino.Node)v2));
    Object v5 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(((com.google.javascript.rhino.Node)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = 0;
    Object v1 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v0).intValue()));
    Object v2 = com.google.javascript.jscomp.NodeUtil.isControlStructure(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = 0;
    Object v1 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v0).intValue()));
    Object v2 = 0;
    Object v3 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v2).intValue()));
    Object v4 = ((com.google.javascript.rhino.Node)v1).checkTreeTypeAwareEqualsSilent(((com.google.javascript.rhino.Node)v3));
    Object v5 = com.google.javascript.jscomp.NodeUtil.newExpr(((com.google.javascript.rhino.Node)v1));
    Object v6 = com.google.javascript.jscomp.NodeUtil.isLabelName(((com.google.javascript.rhino.Node)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = "(";
    Object v1 = 0;
    Object v2 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v1).intValue()));
    Object v3 = ((com.google.javascript.rhino.Node)v2).getJsDocBuilderForNode();
    Object v4 = com.google.javascript.jscomp.NodeUtil.newVarNode(((java.lang.String)v0),((com.google.javascript.rhino.Node)v2));
    Object v5 = com.google.javascript.jscomp.NodeUtil.getAssignedValue(((com.google.javascript.rhino.Node)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v0).intValue()));
    Object v2 = 0;
    Object v3 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v2).intValue()));
    Object v4 = ((com.google.javascript.rhino.Node)v1).checkTreeTypeAwareEqualsSilent(((com.google.javascript.rhino.Node)v3));
    Object v5 = com.google.javascript.jscomp.NodeUtil.newExpr(((com.google.javascript.rhino.Node)v1));
    Object v6 = com.google.javascript.jscomp.NodeUtil.functionCallHasSideEffects(((com.google.javascript.rhino.Node)v5));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v0).intValue()));
    Object v2 = 0;
    Object v3 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v2).intValue()));
    Object v4 = ((com.google.javascript.rhino.Node)v1).checkTreeTypeAwareEqualsSilent(((com.google.javascript.rhino.Node)v3));
    Object v5 = com.google.javascript.jscomp.NodeUtil.newExpr(((com.google.javascript.rhino.Node)v1));
    Object v6 = com.google.javascript.jscomp.NodeUtil.tryMergeBlock(((com.google.javascript.rhino.Node)v5));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = 0;
    Object v1 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v0).intValue()));
    Object v2 = 0;
    Object v3 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v2).intValue()));
    Object v4 = ((com.google.javascript.rhino.Node)v1).checkTreeTypeAwareEqualsSilent(((com.google.javascript.rhino.Node)v3));
    Object v5 = "}";
    Object v6 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(((com.google.javascript.rhino.Node)v1),((java.lang.String)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v0).intValue()));
    Object v2 = com.google.javascript.jscomp.NodeUtil.getAssignedValue(((com.google.javascript.rhino.Node)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = 0;
    Object v1 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v0).intValue()));
    Object v2 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = 0;
    Object v1 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v0).intValue()));
    Object v2 = com.google.javascript.jscomp.NodeUtil.isAssign(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = 0;
    Object v1 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v0).intValue()));
    Object v2 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v3 = java.util.Set.of(((java.lang.Object)v2));
    Object v4 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(((com.google.javascript.rhino.Node)v1),((java.util.Set)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = "(";
    Object v1 = 0;
    Object v2 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v1).intValue()));
    Object v3 = ((com.google.javascript.rhino.Node)v2).getJsDocBuilderForNode();
    Object v4 = com.google.javascript.jscomp.NodeUtil.newVarNode(((java.lang.String)v0),((com.google.javascript.rhino.Node)v2));
    Object v5 = com.google.javascript.jscomp.NodeUtil.getSourceName(((com.google.javascript.rhino.Node)v4));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = 0;
    Object v1 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v0).intValue()));
    Object v2 = 0;
    Object v3 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v2).intValue()));
    Object v4 = "(";
    Object v5 = 0;
    Object v6 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v5).intValue()));
    Object v7 = ((com.google.javascript.rhino.Node)v6).getJsDocBuilderForNode();
    Object v8 = com.google.javascript.jscomp.NodeUtil.newVarNode(((java.lang.String)v4),((com.google.javascript.rhino.Node)v6));
    Object v9 = ((com.google.javascript.rhino.Node)v3).checkTreeTypeAwareEqualsSilent(((com.google.javascript.rhino.Node)v8));
    com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(((com.google.javascript.rhino.Node)v1),((com.google.javascript.rhino.Node)v3));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = -63;
    Object v1 = com.google.javascript.jscomp.NodeUtil.opToStr((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v0).intValue()));
    Object v2 = com.google.javascript.jscomp.NodeUtil.hasCatchHandler(((com.google.javascript.rhino.Node)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = 0;
    Object v1 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v0).intValue()));
    Object v2 = 0;
    Object v3 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((((java.lang.Integer)v2).intValue()));
    Object v4 = 0;
    Object v5 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((((java.lang.Integer)v4).intValue()));
    Object v6 = 0;
    Object v7 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v6).intValue()));
    Object v8 = 0;
    Object v9 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v8).intValue()));
    Object v10 = ((com.google.javascript.rhino.Node)v7).checkTreeTypeAwareEqualsSilent(((com.google.javascript.rhino.Node)v9));
    Object v11 = "}";
    Object v12 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(((com.google.javascript.rhino.Node)v7),((java.lang.String)v11));
    Object v13 = ((com.google.common.base.Predicate)v5).equals(((java.lang.Object)v12));
    Object v14 = com.google.javascript.jscomp.NodeUtil.has(((com.google.javascript.rhino.Node)v1),((com.google.common.base.Predicate)v3),((com.google.common.base.Predicate)v5));
    org.junit.Assert.assertEquals((Object)(true), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v0).intValue()));
    Object v2 = com.google.javascript.jscomp.NodeUtil.functionCallHasSideEffects(((com.google.javascript.rhino.Node)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = "(";
    Object v1 = 0;
    Object v2 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v1).intValue()));
    Object v3 = ((com.google.javascript.rhino.Node)v2).getJsDocBuilderForNode();
    Object v4 = com.google.javascript.jscomp.NodeUtil.newVarNode(((java.lang.String)v0),((com.google.javascript.rhino.Node)v2));
    Object v5 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(((com.google.javascript.rhino.Node)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = 0;
    Object v1 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v0).intValue()));
    Object v2 = ((com.google.javascript.rhino.Node)v1).removeChildren();
    Object v3 = com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = "(";
    Object v1 = 0;
    Object v2 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v1).intValue()));
    Object v3 = ((com.google.javascript.rhino.Node)v2).getJsDocBuilderForNode();
    Object v4 = com.google.javascript.jscomp.NodeUtil.newVarNode(((java.lang.String)v0),((com.google.javascript.rhino.Node)v2));
    Object v5 = com.google.javascript.jscomp.NodeUtil.isFunction(((com.google.javascript.rhino.Node)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = "arguments";
    Object v1 = com.google.javascript.jscomp.NodeUtil.isLatin(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(true), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = 0;
    Object v1 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v0).intValue()));
    Object v2 = 0;
    Object v3 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v2).intValue()));
    Object v4 = ((com.google.javascript.rhino.Node)v1).checkTreeTypeAwareEqualsSilent(((com.google.javascript.rhino.Node)v3));
    Object v5 = com.google.javascript.jscomp.NodeUtil.newExpr(((com.google.javascript.rhino.Node)v1));
    Object v6 = com.google.javascript.jscomp.NodeUtil.isPrototypeProperty(((com.google.javascript.rhino.Node)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = "(";
    Object v1 = 0;
    Object v2 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v1).intValue()));
    Object v3 = ((com.google.javascript.rhino.Node)v2).getJsDocBuilderForNode();
    Object v4 = com.google.javascript.jscomp.NodeUtil.newVarNode(((java.lang.String)v0),((com.google.javascript.rhino.Node)v2));
    Object v5 = "n";
    Object v6 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(((com.google.javascript.rhino.Node)v4),((java.lang.String)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = 0;
    Object v1 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v0).intValue()));
    Object v2 = com.google.javascript.jscomp.NodeUtil.isPrototypeProperty(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = 0;
    Object v1 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v0).intValue()));
    Object v2 = com.google.javascript.jscomp.NodeUtil.isLabelName(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = 0;
    Object v1 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v0).intValue()));
    Object v2 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = 0;
    Object v1 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v0).intValue()));
    Object v2 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = 0;
    Object v1 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v0).intValue()));
    Object v2 = ((com.google.javascript.rhino.Node)v1).toStringTree();
    Object v3 = com.google.javascript.jscomp.NodeUtil.isLabelName(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = 0;
    Object v1 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v0).intValue()));
    Object v2 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v3 = java.util.Set.of(((java.lang.Object)v2));
    Object v4 = ((java.util.Set)v3).spliterator();
    Object v5 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(((com.google.javascript.rhino.Node)v1),((java.util.Set)v3));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = 0;
    Object v1 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v0).intValue()));
    Object v2 = com.google.javascript.jscomp.NodeUtil.isAnonymousFunction(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = 0;
    Object v1 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v0).intValue()));
    Object v2 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = "";
    Object v1 = 0;
    Object v2 = -7;
    Object v3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = 0;
    Object v1 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v0).intValue()));
    Object v2 = com.google.javascript.jscomp.NodeUtil.isCall(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = "(";
    Object v1 = 0;
    Object v2 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v1).intValue()));
    Object v3 = ((com.google.javascript.rhino.Node)v2).getJsDocBuilderForNode();
    Object v4 = com.google.javascript.jscomp.NodeUtil.newVarNode(((java.lang.String)v0),((com.google.javascript.rhino.Node)v2));
    Object v5 = com.google.javascript.jscomp.NodeUtil.isLoopStructure(((com.google.javascript.rhino.Node)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = 0;
    Object v1 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v0).intValue()));
    Object v2 = ((com.google.javascript.rhino.Node)v1).toStringTree();
    Object v3 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = "(";
    Object v1 = 0;
    Object v2 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v1).intValue()));
    Object v3 = ((com.google.javascript.rhino.Node)v2).getJsDocBuilderForNode();
    Object v4 = com.google.javascript.jscomp.NodeUtil.newVarNode(((java.lang.String)v0),((com.google.javascript.rhino.Node)v2));
    Object v5 = com.google.javascript.jscomp.NodeUtil.isFunctionAnonymous(((com.google.javascript.rhino.Node)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = 0;
    Object v1 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v0).intValue()));
    Object v2 = ((com.google.javascript.rhino.Node)v1).cloneNode();
    Object v3 = com.google.javascript.jscomp.NodeUtil.isReferenceName(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = 0;
    Object v1 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v0).intValue()));
    Object v2 = 0;
    Object v3 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v2).intValue()));
    Object v4 = ((com.google.javascript.rhino.Node)v1).checkTreeTypeAwareEqualsSilent(((com.google.javascript.rhino.Node)v3));
    Object v5 = com.google.javascript.jscomp.NodeUtil.newExpr(((com.google.javascript.rhino.Node)v1));
    Object v6 = com.google.javascript.jscomp.NodeUtil.isName(((com.google.javascript.rhino.Node)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = 0;
    Object v1 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v0).intValue()));
    Object v2 = com.google.javascript.jscomp.NodeUtil.getLoopCodeBlock(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v0).intValue()));
    Object v2 = com.google.javascript.jscomp.NodeUtil.tryMergeBlock(((com.google.javascript.rhino.Node)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = "";
    Object v1 = 0;
    Object v2 = -7;
    Object v3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = com.google.javascript.jscomp.NodeUtil.isFunction(((com.google.javascript.rhino.Node)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = "_";
    Object v1 = 0;
    Object v2 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v1).intValue()));
    Object v3 = 0;
    Object v4 = com.google.javascript.jscomp.NodeUtil.isAssociative((((java.lang.Integer)v3).intValue()));
    Object v5 = 0;
    Object v6 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v5).intValue()));
    Object v7 = 0;
    Object v8 = com.google.javascript.jscomp.NodeUtil.isAssociative((((java.lang.Integer)v7).intValue()));
    Object v9 = java.util.List.of(((java.lang.Object)v2),((java.lang.Object)v4),((java.lang.Object)v6),((java.lang.Object)v8));
    Object v10 = 0;
    Object v11 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v10).intValue()));
    Object v12 = -23;
    Object v13 = 29;
    Object v14 = com.google.javascript.jscomp.NodeUtil.newFunctionNode(((java.lang.String)v0),((java.util.List)v9),((com.google.javascript.rhino.Node)v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = "";
    Object v1 = 0;
    Object v2 = -7;
    Object v3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = com.google.javascript.jscomp.NodeUtil.isThis(((com.google.javascript.rhino.Node)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = "(";
    Object v1 = 0;
    Object v2 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v1).intValue()));
    Object v3 = ((com.google.javascript.rhino.Node)v2).getJsDocBuilderForNode();
    Object v4 = com.google.javascript.jscomp.NodeUtil.newVarNode(((java.lang.String)v0),((com.google.javascript.rhino.Node)v2));
    Object v5 = com.google.javascript.jscomp.NodeUtil.hasFinally(((com.google.javascript.rhino.Node)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = 0;
    Object v2 = -7;
    Object v3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = "(";
    Object v5 = 0;
    Object v6 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v5).intValue()));
    Object v7 = ((com.google.javascript.rhino.Node)v6).getJsDocBuilderForNode();
    Object v8 = com.google.javascript.jscomp.NodeUtil.newVarNode(((java.lang.String)v4),((com.google.javascript.rhino.Node)v6));
    Object v9 = com.google.javascript.jscomp.NodeUtil.getFunctionName(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.Node)v8));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = 0;
    Object v1 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v0).intValue()));
    Object v2 = com.google.javascript.jscomp.NodeUtil.isGetProp(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = 0;
    Object v1 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v0).intValue()));
    Object v2 = 27;
    ((com.google.javascript.rhino.Node)v1).removeProp((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    Object v4 = com.google.javascript.jscomp.NodeUtil.isName(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = 0;
    Object v2 = -7;
    Object v3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = com.google.javascript.jscomp.NodeUtil.getFnParameters(((com.google.javascript.rhino.Node)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = 0;
    Object v1 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v0).intValue()));
    Object v2 = 0;
    Object v3 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v2).intValue()));
    Object v4 = ((com.google.javascript.rhino.Node)v1).checkTreeTypeAwareEqualsSilent(((com.google.javascript.rhino.Node)v3));
    Object v5 = com.google.javascript.jscomp.NodeUtil.newExpr(((com.google.javascript.rhino.Node)v1));
    Object v6 = "";
    Object v7 = 0;
    Object v8 = -7;
    Object v9 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = com.google.javascript.jscomp.NodeUtil.isLhs(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v9));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = "";
    Object v1 = 0;
    Object v2 = -7;
    Object v3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = com.google.javascript.jscomp.NodeUtil.getInfoForNameNode(((com.google.javascript.rhino.Node)v3));
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = "";
    Object v1 = 0;
    Object v2 = -7;
    Object v3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = "";
    Object v5 = 0;
    Object v6 = -7;
    Object v7 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(((java.lang.String)v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.Node)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = "(";
    Object v1 = 0;
    Object v2 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v1).intValue()));
    Object v3 = ((com.google.javascript.rhino.Node)v2).getJsDocBuilderForNode();
    Object v4 = com.google.javascript.jscomp.NodeUtil.newVarNode(((java.lang.String)v0),((com.google.javascript.rhino.Node)v2));
    Object v5 = 0;
    Object v6 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v5).intValue()));
    Object v7 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = 0;
    Object v1 = com.google.javascript.jscomp.NodeUtil.isSimpleOperatorType((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = 0;
    Object v1 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v0).intValue()));
    Object v2 = ((com.google.javascript.rhino.Node)v1).removeFirstChild();
    Object v3 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = "";
    Object v1 = 0;
    Object v2 = -7;
    Object v3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = com.google.javascript.jscomp.NodeUtil.isForIn(((com.google.javascript.rhino.Node)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = 0;
    Object v1 = new com.google.javascript.rhino.ScriptOrFnNode((((java.lang.Integer)v0).intValue()));
    Object v2 = com.google.javascript.jscomp.NodeUtil.isExprCall(((com.google.javascript.rhino.Node)v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = -21;
    Object v1 = com.google.javascript.jscomp.NodeUtil.opToStr((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertNull(v1);
  }
}
