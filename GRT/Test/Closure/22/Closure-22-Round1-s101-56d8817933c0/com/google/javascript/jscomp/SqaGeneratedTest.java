package com.google.javascript.jscomp;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.CheckSideEffects(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v7 = true;
    Object v8 = new com.google.javascript.jscomp.CheckSideEffects(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.CheckLevel)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v9));
    Object v11 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v8),((com.google.javascript.jscomp.ScopeCreator)v10));
    Object v12 = true;
    Object v13 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v12).booleanValue()));
    Object v14 = true;
    Object v15 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v14).booleanValue()));
    ((com.google.javascript.jscomp.CheckSideEffects)v3).visit(((com.google.javascript.jscomp.NodeTraversal)v11),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.CheckSideEffects(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v7 = true;
    Object v8 = new com.google.javascript.jscomp.CheckSideEffects(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.CheckLevel)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v9));
    Object v11 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v8),((com.google.javascript.jscomp.ScopeCreator)v10));
    Object v12 = true;
    Object v13 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v12).booleanValue()));
    Object v14 = true;
    Object v15 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v14).booleanValue()));
    Object v16 = true;
    Object v17 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v16).booleanValue()));
    Object v18 = ((com.google.javascript.rhino.Node)v15).clonePropsFrom(((com.google.javascript.rhino.Node)v17));
    ((com.google.javascript.jscomp.CheckSideEffects)v3).visit(((com.google.javascript.jscomp.NodeTraversal)v11),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v15));
    Object v19 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.CheckSideEffects(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = true;
    Object v5 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = true;
    Object v7 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = false;
    ((com.google.javascript.rhino.Node)v7).setWasEmptyNode((((java.lang.Boolean)v8).booleanValue()));
    Object v9 = null;
    ((com.google.javascript.jscomp.CheckSideEffects)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.CheckSideEffects(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = true;
    Object v5 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = 13;
    Object v7 = false;
    ((com.google.javascript.rhino.Node)v5).putBooleanProp((((java.lang.Integer)v6).intValue()),(((java.lang.Boolean)v7).booleanValue()));
    Object v8 = null;
    Object v9 = true;
    Object v10 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v9).booleanValue()));
    ((com.google.javascript.jscomp.CheckSideEffects)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.CheckSideEffects(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = true;
    Object v5 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = 1;
    Object v7 = ((com.google.javascript.rhino.Node)v5).getAncestor((((java.lang.Integer)v6).intValue()));
    Object v8 = true;
    Object v9 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v8).booleanValue()));
    ((com.google.javascript.jscomp.CheckSideEffects)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.CheckSideEffects(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = true;
    Object v5 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = true;
    Object v7 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = true;
    Object v9 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v8).booleanValue()));
    Object v10 = ((com.google.javascript.rhino.Node)v7).clonePropsFrom(((com.google.javascript.rhino.Node)v9));
    ((com.google.javascript.jscomp.CheckSideEffects)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.CheckSideEffects(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v7 = true;
    Object v8 = new com.google.javascript.jscomp.CheckSideEffects(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.CheckLevel)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v9));
    Object v11 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v8),((com.google.javascript.jscomp.ScopeCreator)v10));
    Object v12 = true;
    Object v13 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v12).booleanValue()));
    Object v14 = true;
    Object v15 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback)v3).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v11),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v15));
    org.junit.Assert.assertEquals((Object)(true), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.CheckSideEffects(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = true;
    Object v5 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = true;
    Object v7 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v6).booleanValue()));
    ((com.google.javascript.jscomp.CheckSideEffects)v3).hotSwapScript(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.CheckSideEffects(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v7 = true;
    Object v8 = new com.google.javascript.jscomp.CheckSideEffects(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.CheckLevel)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v9));
    Object v11 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v8),((com.google.javascript.jscomp.ScopeCreator)v10));
    Object v12 = ((com.google.javascript.jscomp.NodeTraversal)v11).getEnclosingFunction();
    Object v13 = true;
    Object v14 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v13).booleanValue()));
    Object v15 = true;
    Object v16 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v15).booleanValue()));
    ((com.google.javascript.jscomp.CheckSideEffects)v3).visit(((com.google.javascript.jscomp.NodeTraversal)v11),((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.Node)v16));
    Object v17 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.CheckSideEffects(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = true;
    Object v5 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = true;
    Object v7 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = ((com.google.javascript.rhino.Node)v7).getLength();
    ((com.google.javascript.jscomp.CheckSideEffects)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.CheckSideEffects(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = true;
    Object v5 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = true;
    Object v7 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = 31;
    Object v9 = new com.google.javascript.rhino.Node.SideEffectFlags((((java.lang.Integer)v8).intValue()));
    Object v10 = true;
    Object v11 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v10).booleanValue()));
    Object v12 = 31;
    Object v13 = new com.google.javascript.rhino.Node.SideEffectFlags((((java.lang.Integer)v12).intValue()));
    Object v14 = true;
    Object v15 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v14).booleanValue()));
    Object v16 = 31;
    Object v17 = new com.google.javascript.rhino.Node.SideEffectFlags((((java.lang.Integer)v16).intValue()));
    Object v18 = true;
    Object v19 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v18).booleanValue()));
    Object v20 = java.util.Set.of(((java.lang.Object)v9),((java.lang.Object)v11),((java.lang.Object)v13),((java.lang.Object)v15),((java.lang.Object)v17),((java.lang.Object)v19));
    ((com.google.javascript.rhino.Node)v7).setDirectives(((java.util.Set)v20));
    Object v21 = null;
    ((com.google.javascript.jscomp.CheckSideEffects)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
    Object v22 = null;
    org.junit.Assert.assertNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.CheckSideEffects(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = true;
    Object v5 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = true;
    Object v7 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v6).booleanValue()));
    ((com.google.javascript.jscomp.CheckSideEffects)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.CheckSideEffects(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = true;
    Object v5 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = true;
    Object v7 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = 1;
    Object v9 = 1;
    ((com.google.javascript.rhino.Node)v7).putIntProp((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v10 = null;
    ((com.google.javascript.jscomp.CheckSideEffects)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.CheckSideEffects(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = true;
    Object v5 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = true;
    Object v7 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = ((com.google.javascript.rhino.Node)v7).removeFirstChild();
    ((com.google.javascript.jscomp.CheckSideEffects)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.CheckSideEffects(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v7 = true;
    Object v8 = new com.google.javascript.jscomp.CheckSideEffects(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.CheckLevel)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v9));
    Object v11 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v8),((com.google.javascript.jscomp.ScopeCreator)v10));
    Object v12 = true;
    Object v13 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.google.javascript.rhino.Node)v13).isFromExterns();
    Object v15 = true;
    Object v16 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v15).booleanValue()));
    Object v17 = ((com.google.javascript.rhino.Node)v16).children();
    ((com.google.javascript.jscomp.CheckSideEffects)v3).visit(((com.google.javascript.jscomp.NodeTraversal)v11),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v16));
    Object v18 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.CheckSideEffects(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.CheckSideEffects(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = true;
    Object v5 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = true;
    Object v7 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = 36;
    ((com.google.javascript.rhino.Node)v7).setSourceEncodedPosition((((java.lang.Integer)v8).intValue()));
    Object v9 = null;
    ((com.google.javascript.jscomp.CheckSideEffects)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.CheckSideEffects(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v7 = true;
    Object v8 = new com.google.javascript.jscomp.CheckSideEffects(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.CheckLevel)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v9));
    Object v11 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v8),((com.google.javascript.jscomp.ScopeCreator)v10));
    Object v12 = true;
    Object v13 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v12).booleanValue()));
    Object v14 = true;
    Object v15 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v14).booleanValue()));
    Object v16 = "";
    ((com.google.javascript.rhino.Node)v15).addSuppression(((java.lang.String)v16));
    Object v17 = null;
    ((com.google.javascript.jscomp.CheckSideEffects)v3).visit(((com.google.javascript.jscomp.NodeTraversal)v11),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v15));
    Object v18 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.CheckSideEffects(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = true;
    Object v5 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = true;
    Object v7 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v6).booleanValue()));
    ((com.google.javascript.jscomp.CheckSideEffects)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
    Object v8 = null;
    Object v9 = true;
    Object v10 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = true;
    Object v12 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v11).booleanValue()));
    ((com.google.javascript.jscomp.CheckSideEffects)v3).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.CheckSideEffects(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = true;
    Object v5 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = true;
    Object v7 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v6).booleanValue()));
    ((com.google.javascript.jscomp.CheckSideEffects)v3).hotSwapScript(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
    Object v8 = null;
    Object v9 = true;
    Object v10 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = true;
    Object v12 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v11).booleanValue()));
    Object v13 = ((com.google.javascript.rhino.Node)v12).getInputId();
    ((com.google.javascript.jscomp.CheckSideEffects)v3).hotSwapScript(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v12));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.CheckSideEffects(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = true;
    Object v5 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = 43;
    ((com.google.javascript.rhino.Node)v5).setSourceEncodedPositionForTree((((java.lang.Integer)v6).intValue()));
    Object v7 = null;
    Object v8 = true;
    Object v9 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v8).booleanValue()));
    ((com.google.javascript.jscomp.CheckSideEffects)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.CheckSideEffects(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = true;
    Object v5 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = true;
    Object v7 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = ((com.google.javascript.rhino.Node)v5).copyInformationFrom(((com.google.javascript.rhino.Node)v7));
    Object v9 = true;
    Object v10 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v9).booleanValue()));
    ((com.google.javascript.jscomp.CheckSideEffects)v3).hotSwapScript(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.CheckSideEffects(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v7 = true;
    Object v8 = new com.google.javascript.jscomp.CheckSideEffects(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.CheckLevel)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v9));
    Object v11 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v8),((com.google.javascript.jscomp.ScopeCreator)v10));
    Object v12 = true;
    Object v13 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v12).booleanValue()));
    Object v14 = true;
    Object v15 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.google.javascript.rhino.Node)v15).getDirectives();
    Object v17 = ((com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback)v3).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v11),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v15));
    org.junit.Assert.assertEquals((Object)(true), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.CheckSideEffects(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = true;
    Object v5 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = true;
    Object v7 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = ((com.google.javascript.rhino.Node)v7).children();
    ((com.google.javascript.jscomp.CheckSideEffects)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.CheckSideEffects(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = true;
    Object v5 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = ((com.google.javascript.rhino.Node)v5).getSideEffectFlags();
    Object v7 = true;
    Object v8 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v7).booleanValue()));
    ((com.google.javascript.jscomp.CheckSideEffects)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = -15;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v5 = false;
    Object v6 = new com.google.javascript.jscomp.CheckSideEffects(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v4),(((java.lang.Boolean)v5).booleanValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = -15;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v5 = false;
    Object v6 = new com.google.javascript.jscomp.CheckSideEffects(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = 28;
    Object v10 = ((com.google.javascript.rhino.Node)v8).getAncestor((((java.lang.Integer)v9).intValue()));
    Object v11 = true;
    Object v12 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v11).booleanValue()));
    ((com.google.javascript.jscomp.CheckSideEffects)v6).process(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = -15;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v5 = false;
    Object v6 = new com.google.javascript.jscomp.CheckSideEffects(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = new com.google.javascript.jscomp.Compiler();
    Object v9 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v10 = true;
    Object v11 = new com.google.javascript.jscomp.CheckSideEffects(((com.google.javascript.jscomp.AbstractCompiler)v8),((com.google.javascript.jscomp.CheckLevel)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v7),((com.google.javascript.jscomp.NodeTraversal.Callback)v11),((com.google.javascript.jscomp.ScopeCreator)v13));
    Object v15 = true;
    Object v16 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v15).booleanValue()));
    Object v17 = true;
    Object v18 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v17).booleanValue()));
    Object v19 = ((com.google.javascript.rhino.Node)v18).removeFirstChild();
    ((com.google.javascript.jscomp.CheckSideEffects)v6).visit(((com.google.javascript.jscomp.NodeTraversal)v14),((com.google.javascript.rhino.Node)v16),((com.google.javascript.rhino.Node)v18));
    Object v20 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = -15;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v5 = false;
    Object v6 = new com.google.javascript.jscomp.CheckSideEffects(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = true;
    Object v10 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = true;
    Object v12 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v11).booleanValue()));
    Object v13 = ((com.google.javascript.rhino.Node)v10).clonePropsFrom(((com.google.javascript.rhino.Node)v12));
    ((com.google.javascript.jscomp.CheckSideEffects)v6).process(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v10));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = -15;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v5 = false;
    Object v6 = new com.google.javascript.jscomp.CheckSideEffects(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = true;
    Object v10 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v9).booleanValue()));
    ((com.google.javascript.jscomp.CheckSideEffects)v6).hotSwapScript(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
    Object v12 = true;
    Object v13 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v12).booleanValue()));
    Object v14 = true;
    Object v15 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v14).booleanValue()));
    ((com.google.javascript.jscomp.CheckSideEffects)v6).hotSwapScript(((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = -15;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v5 = false;
    Object v6 = new com.google.javascript.jscomp.CheckSideEffects(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = new com.google.javascript.jscomp.Compiler();
    Object v9 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v10 = true;
    Object v11 = new com.google.javascript.jscomp.CheckSideEffects(((com.google.javascript.jscomp.AbstractCompiler)v8),((com.google.javascript.jscomp.CheckLevel)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v7),((com.google.javascript.jscomp.NodeTraversal.Callback)v11),((com.google.javascript.jscomp.ScopeCreator)v13));
    Object v15 = true;
    Object v16 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v15).booleanValue()));
    Object v17 = true;
    Object v18 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v17).booleanValue()));
    ((com.google.javascript.jscomp.CheckSideEffects)v6).visit(((com.google.javascript.jscomp.NodeTraversal)v14),((com.google.javascript.rhino.Node)v16),((com.google.javascript.rhino.Node)v18));
    Object v19 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = -15;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v5 = false;
    Object v6 = new com.google.javascript.jscomp.CheckSideEffects(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = new com.google.javascript.jscomp.Compiler();
    Object v9 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v10 = true;
    Object v11 = new com.google.javascript.jscomp.CheckSideEffects(((com.google.javascript.jscomp.AbstractCompiler)v8),((com.google.javascript.jscomp.CheckLevel)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v7),((com.google.javascript.jscomp.NodeTraversal.Callback)v11),((com.google.javascript.jscomp.ScopeCreator)v13));
    Object v15 = ((com.google.javascript.jscomp.NodeTraversal)v14).hasScope();
    Object v16 = true;
    Object v17 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v16).booleanValue()));
    Object v18 = true;
    Object v19 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v18).booleanValue()));
    Object v20 = true;
    Object v21 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v20).booleanValue()));
    Object v22 = ((com.google.javascript.rhino.Node)v19).copyInformationFromForTree(((com.google.javascript.rhino.Node)v21));
    ((com.google.javascript.jscomp.CheckSideEffects)v6).visit(((com.google.javascript.jscomp.NodeTraversal)v14),((com.google.javascript.rhino.Node)v17),((com.google.javascript.rhino.Node)v19));
    Object v23 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.CheckSideEffects(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = true;
    Object v5 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = true;
    Object v7 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = true;
    Object v9 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v8).booleanValue()));
    Object v10 = ((com.google.javascript.rhino.Node)v7).useSourceInfoFrom(((com.google.javascript.rhino.Node)v9));
    ((com.google.javascript.jscomp.CheckSideEffects)v3).hotSwapScript(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = -15;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v5 = false;
    Object v6 = new com.google.javascript.jscomp.CheckSideEffects(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ((com.google.javascript.rhino.Node)v8).toString();
    Object v10 = true;
    Object v11 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v10).booleanValue()));
    ((com.google.javascript.jscomp.CheckSideEffects)v6).process(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = -15;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v5 = false;
    Object v6 = new com.google.javascript.jscomp.CheckSideEffects(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = true;
    Object v10 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v9).booleanValue()));
    ((com.google.javascript.jscomp.CheckSideEffects)v6).hotSwapScript(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
    Object v12 = true;
    Object v13 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.google.javascript.rhino.Node)v13).toString();
    Object v15 = true;
    Object v16 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v15).booleanValue()));
    ((com.google.javascript.jscomp.CheckSideEffects)v6).process(((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v16));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.CheckSideEffects(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.CheckSideEffects(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = true;
    Object v6 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v7).booleanValue()));
    ((com.google.javascript.jscomp.CheckSideEffects)v4).hotSwapScript(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
    Object v10 = true;
    Object v11 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v10).booleanValue()));
    Object v12 = true;
    Object v13 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v12).booleanValue()));
    ((com.google.javascript.jscomp.CheckSideEffects)v4).process(((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.CheckSideEffects(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = true;
    Object v6 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v7).booleanValue()));
    ((com.google.javascript.jscomp.CheckSideEffects)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
    Object v10 = new com.google.javascript.jscomp.Compiler();
    Object v11 = new com.google.javascript.jscomp.Compiler();
    Object v12 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v13 = true;
    Object v14 = new com.google.javascript.jscomp.CheckSideEffects(((com.google.javascript.jscomp.AbstractCompiler)v11),((com.google.javascript.jscomp.CheckLevel)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = new com.google.javascript.jscomp.Compiler();
    Object v16 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v15));
    Object v17 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.NodeTraversal.Callback)v14),((com.google.javascript.jscomp.ScopeCreator)v16));
    Object v18 = java.util.List.of();
    ((com.google.javascript.jscomp.NodeTraversal)v17).traverseRoots(((java.util.List)v18));
    Object v19 = null;
    Object v20 = true;
    Object v21 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v20).booleanValue()));
    Object v22 = true;
    Object v23 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v22).booleanValue()));
    ((com.google.javascript.jscomp.CheckSideEffects)v4).visit(((com.google.javascript.jscomp.NodeTraversal)v17),((com.google.javascript.rhino.Node)v21),((com.google.javascript.rhino.Node)v23));
    Object v24 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.CheckSideEffects(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = true;
    Object v6 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v7).booleanValue()));
    ((com.google.javascript.jscomp.CheckSideEffects)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = -15;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v5 = false;
    Object v6 = new com.google.javascript.jscomp.CheckSideEffects(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = true;
    Object v10 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v9).booleanValue()));
    ((com.google.javascript.jscomp.CheckSideEffects)v6).hotSwapScript(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.Compiler();
    Object v14 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v15 = true;
    Object v16 = new com.google.javascript.jscomp.CheckSideEffects(((com.google.javascript.jscomp.AbstractCompiler)v13),((com.google.javascript.jscomp.CheckLevel)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = new com.google.javascript.jscomp.Compiler();
    Object v18 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v17));
    Object v19 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v12),((com.google.javascript.jscomp.NodeTraversal.Callback)v16),((com.google.javascript.jscomp.ScopeCreator)v18));
    Object v20 = true;
    Object v21 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v20).booleanValue()));
    Object v22 = true;
    Object v23 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v22).booleanValue()));
    ((com.google.javascript.jscomp.CheckSideEffects)v6).visit(((com.google.javascript.jscomp.NodeTraversal)v19),((com.google.javascript.rhino.Node)v21),((com.google.javascript.rhino.Node)v23));
    Object v24 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = -15;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v5 = false;
    Object v6 = new com.google.javascript.jscomp.CheckSideEffects(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = true;
    Object v10 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v9).booleanValue()));
    ((com.google.javascript.jscomp.CheckSideEffects)v6).hotSwapScript(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.CheckSideEffects(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v7 = true;
    Object v8 = new com.google.javascript.jscomp.CheckSideEffects(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.CheckLevel)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v9));
    Object v11 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v8),((com.google.javascript.jscomp.ScopeCreator)v10));
    Object v12 = true;
    Object v13 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v12).booleanValue()));
    Object v14 = true;
    Object v15 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.google.javascript.rhino.Node)v13).useSourceInfoIfMissingFrom(((com.google.javascript.rhino.Node)v15));
    Object v17 = true;
    Object v18 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v17).booleanValue()));
    ((com.google.javascript.jscomp.CheckSideEffects)v3).visit(((com.google.javascript.jscomp.NodeTraversal)v11),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v18));
    Object v19 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.CheckSideEffects(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.CheckSideEffects(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = true;
    Object v6 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ((com.google.javascript.rhino.Node)v6).checkTreeEquals(((com.google.javascript.rhino.Node)v8));
    Object v10 = true;
    Object v11 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v10).booleanValue()));
    ((com.google.javascript.jscomp.CheckSideEffects)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v2 = ((java.lang.Enum)v1).hashCode();
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.CheckSideEffects(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = -15;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v5 = false;
    Object v6 = new com.google.javascript.jscomp.CheckSideEffects(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = 0;
    ((com.google.javascript.rhino.Node)v8).removeProp((((java.lang.Integer)v9).intValue()));
    Object v10 = null;
    Object v11 = true;
    Object v12 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v11).booleanValue()));
    ((com.google.javascript.jscomp.CheckSideEffects)v6).process(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v2 = ((java.lang.Enum)v1).hashCode();
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.CheckSideEffects(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = true;
    Object v6 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v7).booleanValue()));
    ((com.google.javascript.jscomp.CheckSideEffects)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = -15;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v5 = false;
    Object v6 = new com.google.javascript.jscomp.CheckSideEffects(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = true;
    Object v10 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v9).booleanValue()));
    ((com.google.javascript.jscomp.CheckSideEffects)v6).hotSwapScript(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
    Object v12 = true;
    Object v13 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v12).booleanValue()));
    Object v14 = true;
    Object v15 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v14).booleanValue()));
    ((com.google.javascript.jscomp.CheckSideEffects)v6).process(((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.CheckSideEffects(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v8 = true;
    Object v9 = new com.google.javascript.jscomp.CheckSideEffects(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.CheckLevel)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.google.javascript.jscomp.Compiler();
    Object v11 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v12 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.NodeTraversal.Callback)v9),((com.google.javascript.jscomp.ScopeCreator)v11));
    Object v13 = true;
    Object v14 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v13).booleanValue()));
    ((com.google.javascript.jscomp.NodeTraversal)v12).traverse(((com.google.javascript.rhino.Node)v14));
    Object v15 = null;
    Object v16 = true;
    Object v17 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v16).booleanValue()));
    Object v18 = true;
    Object v19 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v18).booleanValue()));
    Object v20 = true;
    Object v21 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v20).booleanValue()));
    Object v22 = ((com.google.javascript.rhino.Node)v19).srcref(((com.google.javascript.rhino.Node)v21));
    Object v23 = ((com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback)v4).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v12),((com.google.javascript.rhino.Node)v17),((com.google.javascript.rhino.Node)v19));
    org.junit.Assert.assertEquals((Object)(true), v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.CheckSideEffects(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v8 = true;
    Object v9 = new com.google.javascript.jscomp.CheckSideEffects(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.CheckLevel)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.google.javascript.jscomp.Compiler();
    Object v11 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v12 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.NodeTraversal.Callback)v9),((com.google.javascript.jscomp.ScopeCreator)v11));
    Object v13 = true;
    Object v14 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v13).booleanValue()));
    Object v15 = true;
    Object v16 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v15).booleanValue()));
    ((com.google.javascript.jscomp.CheckSideEffects)v4).visit(((com.google.javascript.jscomp.NodeTraversal)v12),((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.Node)v16));
    Object v17 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.CheckSideEffects(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = true;
    Object v6 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v7).booleanValue()));
    ((com.google.javascript.jscomp.CheckSideEffects)v4).hotSwapScript(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
    Object v10 = new com.google.javascript.jscomp.Compiler();
    Object v11 = new com.google.javascript.jscomp.Compiler();
    Object v12 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v13 = true;
    Object v14 = new com.google.javascript.jscomp.CheckSideEffects(((com.google.javascript.jscomp.AbstractCompiler)v11),((com.google.javascript.jscomp.CheckLevel)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = new com.google.javascript.jscomp.Compiler();
    Object v16 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v15));
    Object v17 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.NodeTraversal.Callback)v14),((com.google.javascript.jscomp.ScopeCreator)v16));
    Object v18 = ((com.google.javascript.jscomp.NodeTraversal)v17).getEnclosingFunction();
    Object v19 = true;
    Object v20 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v19).booleanValue()));
    Object v21 = true;
    Object v22 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v21).booleanValue()));
    ((com.google.javascript.jscomp.CheckSideEffects)v4).visit(((com.google.javascript.jscomp.NodeTraversal)v17),((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.Node)v22));
    Object v23 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = -15;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v5 = false;
    Object v6 = new com.google.javascript.jscomp.CheckSideEffects(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = 0;
    Object v10 = ((com.google.javascript.rhino.Node)v8).getIntProp((((java.lang.Integer)v9).intValue()));
    Object v11 = true;
    Object v12 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v11).booleanValue()));
    ((com.google.javascript.jscomp.CheckSideEffects)v6).process(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = -15;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v5 = false;
    Object v6 = new com.google.javascript.jscomp.CheckSideEffects(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = true;
    Object v10 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v9).booleanValue()));
    ((com.google.javascript.jscomp.CheckSideEffects)v6).process(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
    Object v12 = true;
    Object v13 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v12).booleanValue()));
    Object v14 = true;
    Object v15 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v14).booleanValue()));
    ((com.google.javascript.jscomp.CheckSideEffects)v6).process(((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v2 = ((java.lang.Enum)v1).hashCode();
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.CheckSideEffects(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v8 = true;
    Object v9 = new com.google.javascript.jscomp.CheckSideEffects(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.CheckLevel)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.google.javascript.jscomp.Compiler();
    Object v11 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v12 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.NodeTraversal.Callback)v9),((com.google.javascript.jscomp.ScopeCreator)v11));
    Object v13 = true;
    Object v14 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v13).booleanValue()));
    Object v15 = ((com.google.javascript.rhino.Node)v14).children();
    Object v16 = true;
    Object v17 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v16).booleanValue()));
    ((com.google.javascript.jscomp.CheckSideEffects)v4).visit(((com.google.javascript.jscomp.NodeTraversal)v12),((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.Node)v17));
    Object v18 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = -15;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v5 = false;
    Object v6 = new com.google.javascript.jscomp.CheckSideEffects(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = true;
    Object v10 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v9).booleanValue()));
    ((com.google.javascript.jscomp.CheckSideEffects)v6).process(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.CheckSideEffects(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.CheckSideEffects(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = true;
    Object v5 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = true;
    Object v7 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v6).booleanValue()));
    ((com.google.javascript.jscomp.CheckSideEffects)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.CheckSideEffects(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v7 = true;
    Object v8 = new com.google.javascript.jscomp.CheckSideEffects(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.CheckLevel)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v9));
    Object v11 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v8),((com.google.javascript.jscomp.ScopeCreator)v10));
    Object v12 = true;
    Object v13 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v12).booleanValue()));
    Object v14 = true;
    Object v15 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v14).booleanValue()));
    Object v16 = "";
    ((com.google.javascript.rhino.Node)v15).addSuppression(((java.lang.String)v16));
    Object v17 = null;
    ((com.google.javascript.jscomp.CheckSideEffects)v3).visit(((com.google.javascript.jscomp.NodeTraversal)v11),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v15));
    Object v18 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v2 = ((java.lang.Enum)v1).hashCode();
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.CheckSideEffects(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v8 = true;
    Object v9 = new com.google.javascript.jscomp.CheckSideEffects(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.CheckLevel)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.google.javascript.jscomp.Compiler();
    Object v11 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v12 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.NodeTraversal.Callback)v9),((com.google.javascript.jscomp.ScopeCreator)v11));
    Object v13 = true;
    Object v14 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v13).booleanValue()));
    Object v15 = ",D";
    Object v16 = "3";
    Object v17 = com.google.javascript.jscomp.DiagnosticType.warning(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = new java.lang.String[]{"."};
    Object v19 = ((com.google.javascript.jscomp.NodeTraversal)v12).makeError(((com.google.javascript.rhino.Node)v14),((com.google.javascript.jscomp.DiagnosticType)v17),((java.lang.String[])v18));
    Object v20 = true;
    Object v21 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v20).booleanValue()));
    Object v22 = true;
    Object v23 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v22).booleanValue()));
    ((com.google.javascript.jscomp.CheckSideEffects)v4).visit(((com.google.javascript.jscomp.NodeTraversal)v12),((com.google.javascript.rhino.Node)v21),((com.google.javascript.rhino.Node)v23));
    Object v24 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.CheckSideEffects(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = true;
    Object v6 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = -35;
    ((com.google.javascript.rhino.Node)v6).setType((((java.lang.Integer)v7).intValue()));
    Object v8 = null;
    Object v9 = true;
    Object v10 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v9).booleanValue()));
    ((com.google.javascript.jscomp.CheckSideEffects)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.CheckSideEffects(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = true;
    Object v5 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = true;
    Object v7 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v6).booleanValue()));
    ((com.google.javascript.jscomp.CheckSideEffects)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
    Object v8 = null;
    Object v9 = true;
    Object v10 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = true;
    Object v12 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v11).booleanValue()));
    Object v13 = ((com.google.javascript.rhino.Node)v10).srcrefTree(((com.google.javascript.rhino.Node)v12));
    Object v14 = true;
    Object v15 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.google.javascript.rhino.Node)v15).getSideEffectFlags();
    ((com.google.javascript.jscomp.CheckSideEffects)v3).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v15));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.CheckSideEffects(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = true;
    Object v5 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = true;
    Object v7 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v6).booleanValue()));
    ((com.google.javascript.jscomp.CheckSideEffects)v3).hotSwapScript(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
    Object v8 = null;
    Object v9 = true;
    Object v10 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = ((com.google.javascript.rhino.Node)v10).isUnscopedQualifiedName();
    Object v12 = true;
    Object v13 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v12).booleanValue()));
    ((com.google.javascript.jscomp.CheckSideEffects)v3).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.CheckSideEffects(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v7 = true;
    Object v8 = new com.google.javascript.jscomp.CheckSideEffects(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.CheckLevel)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v9));
    Object v11 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v8),((com.google.javascript.jscomp.ScopeCreator)v10));
    Object v12 = true;
    Object v13 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v12).booleanValue()));
    Object v14 = true;
    Object v15 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v14).booleanValue()));
    ((com.google.javascript.jscomp.CheckSideEffects)v3).visit(((com.google.javascript.jscomp.NodeTraversal)v11),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.CheckSideEffects(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = true;
    Object v5 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = ((com.google.javascript.rhino.Node)v5).cloneNode();
    Object v7 = true;
    Object v8 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v7).booleanValue()));
    ((com.google.javascript.jscomp.CheckSideEffects)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.CheckSideEffects(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = true;
    Object v6 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v7).booleanValue()));
    ((com.google.javascript.jscomp.CheckSideEffects)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
    Object v10 = true;
    Object v11 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v10).booleanValue()));
    Object v12 = true;
    Object v13 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v12).booleanValue()));
    ((com.google.javascript.jscomp.CheckSideEffects)v4).process(((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.CheckSideEffects(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = true;
    Object v5 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = 0;
    ((com.google.javascript.rhino.Node)v5).setSourceEncodedPositionForTree((((java.lang.Integer)v6).intValue()));
    Object v7 = null;
    Object v8 = true;
    Object v9 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v8).booleanValue()));
    ((com.google.javascript.jscomp.CheckSideEffects)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.CheckSideEffects(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v7 = true;
    Object v8 = new com.google.javascript.jscomp.CheckSideEffects(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.CheckLevel)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v9));
    Object v11 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v8),((com.google.javascript.jscomp.ScopeCreator)v10));
    Object v12 = true;
    Object v13 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.google.javascript.rhino.Node)v13).getQualifiedName();
    Object v15 = true;
    Object v16 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v15).booleanValue()));
    ((com.google.javascript.jscomp.CheckSideEffects)v3).visit(((com.google.javascript.jscomp.NodeTraversal)v11),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v16));
    Object v17 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.CheckSideEffects(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v7 = true;
    Object v8 = new com.google.javascript.jscomp.CheckSideEffects(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.CheckLevel)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v9));
    Object v11 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v8),((com.google.javascript.jscomp.ScopeCreator)v10));
    Object v12 = true;
    Object v13 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v12).booleanValue()));
    ((com.google.javascript.jscomp.NodeTraversal)v11).traverse(((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
    Object v15 = true;
    Object v16 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v15).booleanValue()));
    Object v17 = ((com.google.javascript.rhino.Node)v16).isNoSideEffectsCall();
    Object v18 = true;
    Object v19 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v18).booleanValue()));
    Object v20 = ((com.google.javascript.rhino.Node)v19).removeFirstChild();
    Object v21 = ((com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback)v3).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v11),((com.google.javascript.rhino.Node)v16),((com.google.javascript.rhino.Node)v19));
    org.junit.Assert.assertEquals((Object)(true), v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.CheckSideEffects(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = true;
    Object v5 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = true;
    Object v7 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v6).booleanValue()));
    ((com.google.javascript.jscomp.CheckSideEffects)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
    Object v8 = null;
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = new com.google.javascript.jscomp.Compiler();
    Object v11 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v12 = true;
    Object v13 = new com.google.javascript.jscomp.CheckSideEffects(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.CheckLevel)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new com.google.javascript.jscomp.Compiler();
    Object v15 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v14));
    Object v16 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.NodeTraversal.Callback)v13),((com.google.javascript.jscomp.ScopeCreator)v15));
    Object v17 = true;
    Object v18 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v17).booleanValue()));
    Object v19 = true;
    Object v20 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v19).booleanValue()));
    ((com.google.javascript.jscomp.CheckSideEffects)v3).visit(((com.google.javascript.jscomp.NodeTraversal)v16),((com.google.javascript.rhino.Node)v18),((com.google.javascript.rhino.Node)v20));
    Object v21 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.CheckSideEffects(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v7 = true;
    Object v8 = new com.google.javascript.jscomp.CheckSideEffects(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.CheckLevel)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v9));
    Object v11 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v8),((com.google.javascript.jscomp.ScopeCreator)v10));
    Object v12 = true;
    Object v13 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v15 = ",D";
    Object v16 = "3";
    Object v17 = com.google.javascript.jscomp.DiagnosticType.warning(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = new java.lang.String[]{"$$","P"};
    Object v19 = ((com.google.javascript.jscomp.NodeTraversal)v11).makeError(((com.google.javascript.rhino.Node)v13),((com.google.javascript.jscomp.CheckLevel)v14),((com.google.javascript.jscomp.DiagnosticType)v17),((java.lang.String[])v18));
    Object v20 = true;
    Object v21 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v20).booleanValue()));
    Object v22 = true;
    Object v23 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v22).booleanValue()));
    ((com.google.javascript.jscomp.CheckSideEffects)v3).visit(((com.google.javascript.jscomp.NodeTraversal)v11),((com.google.javascript.rhino.Node)v21),((com.google.javascript.rhino.Node)v23));
    Object v24 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.CheckSideEffects(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = true;
    Object v5 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = true;
    Object v7 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v6).booleanValue()));
    ((com.google.javascript.jscomp.CheckSideEffects)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
    Object v8 = null;
    Object v9 = true;
    Object v10 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = true;
    Object v12 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v11).booleanValue()));
    ((com.google.javascript.rhino.Node)v10).addChildrenToBack(((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
    Object v14 = true;
    Object v15 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v14).booleanValue()));
    ((com.google.javascript.jscomp.CheckSideEffects)v3).hotSwapScript(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = -15;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v5 = false;
    Object v6 = new com.google.javascript.jscomp.CheckSideEffects(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = true;
    Object v10 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = ((com.google.javascript.rhino.Node)v10).siblings();
    ((com.google.javascript.jscomp.CheckSideEffects)v6).process(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v10));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v2 = ((java.lang.Enum)v1).hashCode();
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.CheckSideEffects(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = true;
    Object v6 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v7).booleanValue()));
    ((com.google.javascript.jscomp.CheckSideEffects)v4).hotSwapScript(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.CheckSideEffects(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = true;
    Object v5 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = true;
    Object v7 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = ((com.google.javascript.rhino.Node)v5).isEquivalentToTyped(((com.google.javascript.rhino.Node)v7));
    Object v9 = true;
    Object v10 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v9).booleanValue()));
    ((com.google.javascript.jscomp.CheckSideEffects)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.CheckSideEffects(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v7 = true;
    Object v8 = new com.google.javascript.jscomp.CheckSideEffects(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.CheckLevel)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v9));
    Object v11 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v8),((com.google.javascript.jscomp.ScopeCreator)v10));
    Object v12 = true;
    Object v13 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.google.javascript.rhino.Node)v13).isUnscopedQualifiedName();
    Object v15 = true;
    Object v16 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v15).booleanValue()));
    ((com.google.javascript.jscomp.CheckSideEffects)v3).visit(((com.google.javascript.jscomp.NodeTraversal)v11),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v16));
    Object v17 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.CheckSideEffects(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v7 = true;
    Object v8 = new com.google.javascript.jscomp.CheckSideEffects(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.CheckLevel)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v9));
    Object v11 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v8),((com.google.javascript.jscomp.ScopeCreator)v10));
    Object v12 = true;
    Object v13 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.google.javascript.rhino.Node)v13).toString();
    Object v15 = true;
    Object v16 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v15).booleanValue()));
    ((com.google.javascript.jscomp.CheckSideEffects)v3).visit(((com.google.javascript.jscomp.NodeTraversal)v11),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v16));
    Object v17 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.CheckSideEffects(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = true;
    Object v5 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = true;
    Object v7 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v6).booleanValue()));
    ((com.google.javascript.jscomp.CheckSideEffects)v3).hotSwapScript(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
    Object v8 = null;
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = new com.google.javascript.jscomp.Compiler();
    Object v11 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v12 = true;
    Object v13 = new com.google.javascript.jscomp.CheckSideEffects(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.CheckLevel)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new com.google.javascript.jscomp.Compiler();
    Object v15 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v14));
    Object v16 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.NodeTraversal.Callback)v13),((com.google.javascript.jscomp.ScopeCreator)v15));
    Object v17 = true;
    Object v18 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v17).booleanValue()));
    Object v19 = true;
    Object v20 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v19).booleanValue()));
    Object v21 = ((com.google.javascript.rhino.Node)v20).cloneNode();
    ((com.google.javascript.jscomp.CheckSideEffects)v3).visit(((com.google.javascript.jscomp.NodeTraversal)v16),((com.google.javascript.rhino.Node)v18),((com.google.javascript.rhino.Node)v20));
    Object v22 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.CheckSideEffects(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v7 = true;
    Object v8 = new com.google.javascript.jscomp.CheckSideEffects(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.CheckLevel)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v9));
    Object v11 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v8),((com.google.javascript.jscomp.ScopeCreator)v10));
    Object v12 = true;
    Object v13 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v12).booleanValue()));
    Object v14 = true;
    Object v15 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback)v3).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v11),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v15));
    org.junit.Assert.assertEquals((Object)(true), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.CheckSideEffects(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v7 = true;
    Object v8 = new com.google.javascript.jscomp.CheckSideEffects(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.CheckLevel)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v9));
    Object v11 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v8),((com.google.javascript.jscomp.ScopeCreator)v10));
    Object v12 = true;
    Object v13 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v12).booleanValue()));
    Object v14 = true;
    Object v15 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v14).booleanValue()));
    Object v16 = true;
    Object v17 = true;
    Object v18 = true;
    Object v19 = ((com.google.javascript.rhino.Node)v15).toString((((java.lang.Boolean)v16).booleanValue()),(((java.lang.Boolean)v17).booleanValue()),(((java.lang.Boolean)v18).booleanValue()));
    ((com.google.javascript.jscomp.CheckSideEffects)v3).visit(((com.google.javascript.jscomp.NodeTraversal)v11),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v15));
    Object v20 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.CheckSideEffects(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v7 = true;
    Object v8 = new com.google.javascript.jscomp.CheckSideEffects(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.CheckLevel)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v9));
    Object v11 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v8),((com.google.javascript.jscomp.ScopeCreator)v10));
    Object v12 = true;
    Object v13 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v12).booleanValue()));
    Object v14 = true;
    Object v15 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback)v3).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v11),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v15));
    org.junit.Assert.assertEquals((Object)(true), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.CheckSideEffects(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v8 = true;
    Object v9 = new com.google.javascript.jscomp.CheckSideEffects(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.CheckLevel)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.google.javascript.jscomp.Compiler();
    Object v11 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v12 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.NodeTraversal.Callback)v9),((com.google.javascript.jscomp.ScopeCreator)v11));
    Object v13 = true;
    Object v14 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v13).booleanValue()));
    Object v15 = ((com.google.javascript.rhino.Node)v14).children();
    Object v16 = true;
    Object v17 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v16).booleanValue()));
    Object v18 = ((com.google.javascript.rhino.Node)v17).getInputId();
    ((com.google.javascript.jscomp.CheckSideEffects)v4).visit(((com.google.javascript.jscomp.NodeTraversal)v12),((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.Node)v17));
    Object v19 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.CheckSideEffects(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = true;
    Object v5 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = true;
    Object v7 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v6).booleanValue()));
    ((com.google.javascript.jscomp.CheckSideEffects)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.CheckSideEffects(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = true;
    Object v5 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = true;
    Object v7 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = true;
    Object v9 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v8).booleanValue()));
    ((com.google.javascript.rhino.Node)v7).addChildrenToBack(((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
    ((com.google.javascript.jscomp.CheckSideEffects)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v2 = ((java.lang.Enum)v1).hashCode();
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.CheckSideEffects(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v8 = true;
    Object v9 = new com.google.javascript.jscomp.CheckSideEffects(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.CheckLevel)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.google.javascript.jscomp.Compiler();
    Object v11 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v12 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.NodeTraversal.Callback)v9),((com.google.javascript.jscomp.ScopeCreator)v11));
    Object v13 = true;
    Object v14 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v13).booleanValue()));
    Object v15 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v16 = ",D";
    Object v17 = "3";
    Object v18 = com.google.javascript.jscomp.DiagnosticType.warning(((java.lang.String)v16),((java.lang.String)v17));
    Object v19 = new java.lang.String[]{",* ",""};
    Object v20 = ((com.google.javascript.jscomp.NodeTraversal)v12).makeError(((com.google.javascript.rhino.Node)v14),((com.google.javascript.jscomp.CheckLevel)v15),((com.google.javascript.jscomp.DiagnosticType)v18),((java.lang.String[])v19));
    Object v21 = true;
    Object v22 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v21).booleanValue()));
    Object v23 = true;
    Object v24 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v23).booleanValue()));
    ((com.google.javascript.jscomp.CheckSideEffects)v4).visit(((com.google.javascript.jscomp.NodeTraversal)v12),((com.google.javascript.rhino.Node)v22),((com.google.javascript.rhino.Node)v24));
    Object v25 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "";
    Object v2 = -15;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceLine(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v5 = false;
    Object v6 = new com.google.javascript.jscomp.CheckSideEffects(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = true;
    Object v10 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = 0;
    Object v12 = 40;
    ((com.google.javascript.rhino.Node)v10).putIntProp((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v13 = null;
    ((com.google.javascript.jscomp.CheckSideEffects)v6).process(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v10));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.CheckSideEffects(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = true;
    Object v5 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = true;
    Object v7 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v6).booleanValue()));
    ((com.google.javascript.jscomp.CheckSideEffects)v3).hotSwapScript(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
    Object v8 = null;
    Object v9 = true;
    Object v10 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = true;
    Object v12 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v11).booleanValue()));
    ((com.google.javascript.jscomp.CheckSideEffects)v3).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v2 = ((java.lang.Enum)v1).hashCode();
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.CheckSideEffects(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v8 = true;
    Object v9 = new com.google.javascript.jscomp.CheckSideEffects(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.CheckLevel)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.google.javascript.jscomp.Compiler();
    Object v11 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v12 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.NodeTraversal.Callback)v9),((com.google.javascript.jscomp.ScopeCreator)v11));
    Object v13 = true;
    Object v14 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v13).booleanValue()));
    Object v15 = true;
    Object v16 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v15).booleanValue()));
    ((com.google.javascript.jscomp.CheckSideEffects)v4).visit(((com.google.javascript.jscomp.NodeTraversal)v12),((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.Node)v16));
    Object v17 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.CheckSideEffects(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v7 = true;
    Object v8 = new com.google.javascript.jscomp.CheckSideEffects(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.CheckLevel)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v9));
    Object v11 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v8),((com.google.javascript.jscomp.ScopeCreator)v10));
    Object v12 = true;
    Object v13 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v15 = ",D";
    Object v16 = "3";
    Object v17 = com.google.javascript.jscomp.DiagnosticType.warning(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = new java.lang.String[]{"","t"};
    Object v19 = ((com.google.javascript.jscomp.NodeTraversal)v11).makeError(((com.google.javascript.rhino.Node)v13),((com.google.javascript.jscomp.CheckLevel)v14),((com.google.javascript.jscomp.DiagnosticType)v17),((java.lang.String[])v18));
    Object v20 = true;
    Object v21 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v20).booleanValue()));
    Object v22 = true;
    Object v23 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v22).booleanValue()));
    ((com.google.javascript.jscomp.CheckSideEffects)v3).visit(((com.google.javascript.jscomp.NodeTraversal)v11),((com.google.javascript.rhino.Node)v21),((com.google.javascript.rhino.Node)v23));
    Object v24 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.CheckSideEffects(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = true;
    Object v5 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = true;
    Object v7 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = ((com.google.javascript.rhino.Node)v7).children();
    ((com.google.javascript.jscomp.CheckSideEffects)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.CheckSideEffects(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = true;
    Object v5 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = true;
    Object v7 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v6).booleanValue()));
    ((com.google.javascript.jscomp.CheckSideEffects)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
    Object v8 = null;
    Object v9 = true;
    Object v10 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = true;
    Object v12 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v11).booleanValue()));
    Object v13 = true;
    Object v14 = false;
    Object v15 = true;
    Object v16 = ((com.google.javascript.rhino.Node)v12).toString((((java.lang.Boolean)v13).booleanValue()),(((java.lang.Boolean)v14).booleanValue()),(((java.lang.Boolean)v15).booleanValue()));
    ((com.google.javascript.jscomp.CheckSideEffects)v3).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v12));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.CheckSideEffects(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v8 = true;
    Object v9 = new com.google.javascript.jscomp.CheckSideEffects(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.CheckLevel)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.google.javascript.jscomp.Compiler();
    Object v11 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v12 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.NodeTraversal.Callback)v9),((com.google.javascript.jscomp.ScopeCreator)v11));
    Object v13 = true;
    Object v14 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v13).booleanValue()));
    Object v15 = true;
    Object v16 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v15).booleanValue()));
    Object v17 = ((com.google.javascript.rhino.Node)v14).copyInformationFrom(((com.google.javascript.rhino.Node)v16));
    Object v18 = true;
    Object v19 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v18).booleanValue()));
    ((com.google.javascript.jscomp.CheckSideEffects)v4).visit(((com.google.javascript.jscomp.NodeTraversal)v12),((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.Node)v19));
    Object v20 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.CheckSideEffects(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = true;
    Object v5 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = true;
    Object v7 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v6).booleanValue()));
    ((com.google.javascript.jscomp.CheckSideEffects)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
    Object v8 = null;
    Object v9 = true;
    Object v10 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = true;
    Object v12 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v11).booleanValue()));
    ((com.google.javascript.jscomp.CheckSideEffects)v3).process(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.CheckSideEffects(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v8 = true;
    Object v9 = new com.google.javascript.jscomp.CheckSideEffects(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.CheckLevel)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.google.javascript.jscomp.Compiler();
    Object v11 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v12 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.NodeTraversal.Callback)v9),((com.google.javascript.jscomp.ScopeCreator)v11));
    Object v13 = new com.google.javascript.rhino.Node[]{};
    ((com.google.javascript.jscomp.NodeTraversal)v12).traverseRoots(((com.google.javascript.rhino.Node[])v13));
    Object v14 = null;
    Object v15 = true;
    Object v16 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v15).booleanValue()));
    Object v17 = true;
    Object v18 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v17).booleanValue()));
    ((com.google.javascript.jscomp.CheckSideEffects)v4).visit(((com.google.javascript.jscomp.NodeTraversal)v12),((com.google.javascript.rhino.Node)v16),((com.google.javascript.rhino.Node)v18));
    Object v19 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.CheckSideEffects(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = true;
    Object v6 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = true;
    Object v10 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = ((com.google.javascript.rhino.Node)v8).copyInformationFrom(((com.google.javascript.rhino.Node)v10));
    ((com.google.javascript.jscomp.CheckSideEffects)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.CheckSideEffects(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v7 = true;
    Object v8 = new com.google.javascript.jscomp.CheckSideEffects(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.CheckLevel)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v9));
    Object v11 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v8),((com.google.javascript.jscomp.ScopeCreator)v10));
    Object v12 = true;
    Object v13 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v12).booleanValue()));
    Object v14 = true;
    Object v15 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v14).booleanValue()));
    ((com.google.javascript.jscomp.CheckSideEffects)v3).visit(((com.google.javascript.jscomp.NodeTraversal)v11),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = false;
    Object v4 = new com.google.javascript.jscomp.CheckSideEffects(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = true;
    Object v6 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v7).booleanValue()));
    ((com.google.javascript.jscomp.CheckSideEffects)v4).hotSwapScript(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
    Object v10 = true;
    Object v11 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v10).booleanValue()));
    Object v12 = true;
    Object v13 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v12).booleanValue()));
    ((com.google.javascript.rhino.Node)v11).addChildToFront(((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
    Object v15 = true;
    Object v16 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v15).booleanValue()));
    ((com.google.javascript.jscomp.CheckSideEffects)v4).process(((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v16));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.CheckSideEffects(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = true;
    Object v5 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = true;
    Object v7 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = ((com.google.javascript.rhino.Node)v5).srcrefTree(((com.google.javascript.rhino.Node)v7));
    Object v9 = true;
    Object v10 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v9).booleanValue()));
    ((com.google.javascript.jscomp.CheckSideEffects)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.CheckSideEffects(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v7 = true;
    Object v8 = new com.google.javascript.jscomp.CheckSideEffects(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.CheckLevel)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.jscomp.Compiler();
    Object v10 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v9));
    Object v11 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v8),((com.google.javascript.jscomp.ScopeCreator)v10));
    Object v12 = true;
    Object v13 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.google.javascript.rhino.Node)v13).getSideEffectFlags();
    Object v15 = true;
    Object v16 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v15).booleanValue()));
    Object v17 = 29;
    Object v18 = 31;
    Object v19 = new com.google.javascript.rhino.Node.SideEffectFlags((((java.lang.Integer)v18).intValue()));
    ((com.google.javascript.rhino.Node)v16).putProp((((java.lang.Integer)v17).intValue()),((java.lang.Object)v19));
    Object v20 = null;
    Object v21 = ((com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback)v3).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v11),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v16));
    org.junit.Assert.assertEquals((Object)(true), v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v2 = ((java.lang.Enum)v1).hashCode();
    Object v3 = true;
    Object v4 = new com.google.javascript.jscomp.CheckSideEffects(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = true;
    Object v6 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((com.google.javascript.rhino.Node)v6).getInputId();
    Object v8 = true;
    Object v9 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v8).booleanValue()));
    Object v10 = ((com.google.javascript.rhino.Node)v9).getStaticSourceFile();
    ((com.google.javascript.jscomp.CheckSideEffects)v4).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v9));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v2 = false;
    Object v3 = new com.google.javascript.jscomp.CheckSideEffects(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = true;
    Object v5 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = true;
    Object v7 = com.google.javascript.jscomp.NodeUtil.booleanNode((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = true;
    ((com.google.javascript.rhino.Node)v7).setWasEmptyNode((((java.lang.Boolean)v8).booleanValue()));
    Object v9 = null;
    ((com.google.javascript.jscomp.CheckSideEffects)v3).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v7));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }
}
