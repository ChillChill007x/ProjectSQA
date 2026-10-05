package com.google.javascript.jscomp;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v4),((com.google.common.base.Predicate)v5));
    Object v7 = "L";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = new java.io.PrintStream(((java.lang.String)v7),((java.nio.charset.Charset)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = "L";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v17 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v15),((com.google.common.base.Predicate)v16));
    Object v18 = "L";
    Object v19 = java.nio.charset.Charset.defaultCharset();
    Object v20 = new java.io.PrintStream(((java.lang.String)v18),((java.nio.charset.Charset)v19));
    Object v21 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v20));
    Object v22 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v21));
    Object v23 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.NodeTraversal.Callback)v17),((com.google.javascript.jscomp.ScopeCreator)v22));
    Object v24 = 1.0D;
    Object v25 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v24).doubleValue()));
    Object v26 = false;
    ((com.google.javascript.rhino.Node)v25).setWasEmptyNode((((java.lang.Boolean)v26).booleanValue()));
    Object v27 = null;
    Object v28 = 1.0D;
    Object v29 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v28).doubleValue()));
    ((com.google.javascript.jscomp.ReferenceCollectingCallback)v6).visit(((com.google.javascript.jscomp.NodeTraversal)v23),((com.google.javascript.rhino.Node)v25),((com.google.javascript.rhino.Node)v29));
    Object v30 = null;
    org.junit.Assert.assertNull(v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v4),((com.google.common.base.Predicate)v5));
    Object v7 = "L";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = new java.io.PrintStream(((java.lang.String)v7),((java.nio.charset.Charset)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = "L";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v17 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v15),((com.google.common.base.Predicate)v16));
    Object v18 = "L";
    Object v19 = java.nio.charset.Charset.defaultCharset();
    Object v20 = new java.io.PrintStream(((java.lang.String)v18),((java.nio.charset.Charset)v19));
    Object v21 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v20));
    Object v22 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v21));
    Object v23 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.NodeTraversal.Callback)v17),((com.google.javascript.jscomp.ScopeCreator)v22));
    Object v24 = 1.0D;
    Object v25 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v24).doubleValue()));
    Object v26 = 1.0D;
    Object v27 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v26).doubleValue()));
    Object v28 = 1.0D;
    Object v29 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v28).doubleValue()));
    Object v30 = ((com.google.javascript.rhino.Node)v27).checkTreeEqualsSilent(((com.google.javascript.rhino.Node)v29));
    Object v31 = ((com.google.javascript.jscomp.ReferenceCollectingCallback)v6).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v23),((com.google.javascript.rhino.Node)v25),((com.google.javascript.rhino.Node)v27));
    org.junit.Assert.assertEquals((Object)(true), v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v4),((com.google.common.base.Predicate)v5));
    Object v7 = "L";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = new java.io.PrintStream(((java.lang.String)v7),((java.nio.charset.Charset)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = "L";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v17 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v15),((com.google.common.base.Predicate)v16));
    Object v18 = "L";
    Object v19 = java.nio.charset.Charset.defaultCharset();
    Object v20 = new java.io.PrintStream(((java.lang.String)v18),((java.nio.charset.Charset)v19));
    Object v21 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v20));
    Object v22 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v21));
    Object v23 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.NodeTraversal.Callback)v17),((com.google.javascript.jscomp.ScopeCreator)v22));
    Object v24 = 1.0D;
    Object v25 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v24).doubleValue()));
    Object v26 = 1.0D;
    Object v27 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v26).doubleValue()));
    Object v28 = ((com.google.javascript.jscomp.ReferenceCollectingCallback)v6).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v23),((com.google.javascript.rhino.Node)v25),((com.google.javascript.rhino.Node)v27));
    org.junit.Assert.assertEquals((Object)(true), v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v4),((com.google.common.base.Predicate)v5));
    Object v7 = "L";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = new java.io.PrintStream(((java.lang.String)v7),((java.nio.charset.Charset)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = "L";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v17 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v15),((com.google.common.base.Predicate)v16));
    Object v18 = "L";
    Object v19 = java.nio.charset.Charset.defaultCharset();
    Object v20 = new java.io.PrintStream(((java.lang.String)v18),((java.nio.charset.Charset)v19));
    Object v21 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v20));
    Object v22 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v21));
    Object v23 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.NodeTraversal.Callback)v17),((com.google.javascript.jscomp.ScopeCreator)v22));
    Object v24 = 1.0D;
    Object v25 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v24).doubleValue()));
    Object v26 = 1.0D;
    Object v27 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v26).doubleValue()));
    ((com.google.javascript.jscomp.ReferenceCollectingCallback)v6).visit(((com.google.javascript.jscomp.NodeTraversal)v23),((com.google.javascript.rhino.Node)v25),((com.google.javascript.rhino.Node)v27));
    Object v28 = null;
    org.junit.Assert.assertNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v4),((com.google.common.base.Predicate)v5));
    Object v7 = "L";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = new java.io.PrintStream(((java.lang.String)v7),((java.nio.charset.Charset)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = "L";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v17 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v15),((com.google.common.base.Predicate)v16));
    Object v18 = "L";
    Object v19 = java.nio.charset.Charset.defaultCharset();
    Object v20 = new java.io.PrintStream(((java.lang.String)v18),((java.nio.charset.Charset)v19));
    Object v21 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v20));
    Object v22 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v21));
    Object v23 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.NodeTraversal.Callback)v17),((com.google.javascript.jscomp.ScopeCreator)v22));
    Object v24 = 1.0D;
    Object v25 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v24).doubleValue()));
    Object v26 = 1.0D;
    Object v27 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v26).doubleValue()));
    Object v28 = 1.0D;
    Object v29 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v28).doubleValue()));
    Object v30 = ((com.google.javascript.rhino.Node)v27).checkTreeEqualsSilent(((com.google.javascript.rhino.Node)v29));
    ((com.google.javascript.jscomp.ReferenceCollectingCallback)v6).visit(((com.google.javascript.jscomp.NodeTraversal)v23),((com.google.javascript.rhino.Node)v25),((com.google.javascript.rhino.Node)v27));
    Object v31 = null;
    org.junit.Assert.assertNull(v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v4),((com.google.common.base.Predicate)v5));
    Object v7 = "L";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = new java.io.PrintStream(((java.lang.String)v7),((java.nio.charset.Charset)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = "L";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v17 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v15),((com.google.common.base.Predicate)v16));
    Object v18 = "L";
    Object v19 = java.nio.charset.Charset.defaultCharset();
    Object v20 = new java.io.PrintStream(((java.lang.String)v18),((java.nio.charset.Charset)v19));
    Object v21 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v20));
    Object v22 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v21));
    Object v23 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.NodeTraversal.Callback)v17),((com.google.javascript.jscomp.ScopeCreator)v22));
    ((com.google.javascript.jscomp.ReferenceCollectingCallback)v6).enterScope(((com.google.javascript.jscomp.NodeTraversal)v23));
    Object v24 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v4),((com.google.common.base.Predicate)v5));
    Object v7 = "L";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = new java.io.PrintStream(((java.lang.String)v7),((java.nio.charset.Charset)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = "L";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v17 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v15),((com.google.common.base.Predicate)v16));
    Object v18 = "L";
    Object v19 = java.nio.charset.Charset.defaultCharset();
    Object v20 = new java.io.PrintStream(((java.lang.String)v18),((java.nio.charset.Charset)v19));
    Object v21 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v20));
    Object v22 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v21));
    Object v23 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.NodeTraversal.Callback)v17),((com.google.javascript.jscomp.ScopeCreator)v22));
    Object v24 = 1.0D;
    Object v25 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v24).doubleValue()));
    Object v26 = 1.0D;
    Object v27 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v26).doubleValue()));
    Object v28 = 1.0D;
    Object v29 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v28).doubleValue()));
    ((com.google.javascript.rhino.Node)v25).addChildAfter(((com.google.javascript.rhino.Node)v27),((com.google.javascript.rhino.Node)v29));
    Object v30 = null;
    Object v31 = 1.0D;
    Object v32 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v31).doubleValue()));
    Object v33 = ((com.google.javascript.jscomp.ReferenceCollectingCallback)v6).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v23),((com.google.javascript.rhino.Node)v25),((com.google.javascript.rhino.Node)v32));
    org.junit.Assert.assertEquals((Object)(true), v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v4),((com.google.common.base.Predicate)v5));
    Object v7 = "L";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = new java.io.PrintStream(((java.lang.String)v7),((java.nio.charset.Charset)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = "L";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v17 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v15),((com.google.common.base.Predicate)v16));
    Object v18 = "L";
    Object v19 = java.nio.charset.Charset.defaultCharset();
    Object v20 = new java.io.PrintStream(((java.lang.String)v18),((java.nio.charset.Charset)v19));
    Object v21 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v20));
    Object v22 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v21));
    Object v23 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.NodeTraversal.Callback)v17),((com.google.javascript.jscomp.ScopeCreator)v22));
    Object v24 = java.util.List.of();
    ((com.google.javascript.jscomp.NodeTraversal)v23).traverseRoots(((java.util.List)v24));
    Object v25 = null;
    Object v26 = 1.0D;
    Object v27 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v26).doubleValue()));
    Object v28 = 1.0D;
    Object v29 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v28).doubleValue()));
    Object v30 = false;
    Object v31 = true;
    Object v32 = true;
    Object v33 = ((com.google.javascript.rhino.Node)v29).toString((((java.lang.Boolean)v30).booleanValue()),(((java.lang.Boolean)v31).booleanValue()),(((java.lang.Boolean)v32).booleanValue()));
    ((com.google.javascript.jscomp.ReferenceCollectingCallback)v6).visit(((com.google.javascript.jscomp.NodeTraversal)v23),((com.google.javascript.rhino.Node)v27),((com.google.javascript.rhino.Node)v29));
    Object v34 = null;
    org.junit.Assert.assertNull(v34);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v4),((com.google.common.base.Predicate)v5));
    Object v7 = 1.0D;
    Object v8 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()));
    Object v9 = 1.0D;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()));
    ((com.google.javascript.jscomp.ReferenceCollectingCallback)v6).process(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v4),((com.google.common.base.Predicate)v5));
    Object v7 = "L";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = new java.io.PrintStream(((java.lang.String)v7),((java.nio.charset.Charset)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = "L";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v17 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v15),((com.google.common.base.Predicate)v16));
    Object v18 = "L";
    Object v19 = java.nio.charset.Charset.defaultCharset();
    Object v20 = new java.io.PrintStream(((java.lang.String)v18),((java.nio.charset.Charset)v19));
    Object v21 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v20));
    Object v22 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v21));
    Object v23 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.NodeTraversal.Callback)v17),((com.google.javascript.jscomp.ScopeCreator)v22));
    Object v24 = 1.0D;
    Object v25 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v24).doubleValue()));
    Object v26 = java.util.List.of();
    Object v27 = new java.util.TreeSet(((java.util.Collection)v26));
    Object v28 = new java.util.TreeSet(((java.util.SortedSet)v27));
    ((com.google.javascript.rhino.Node)v25).setDirectives(((java.util.Set)v28));
    Object v29 = null;
    Object v30 = 1.0D;
    Object v31 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v30).doubleValue()));
    Object v32 = ((com.google.javascript.jscomp.ReferenceCollectingCallback)v6).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v23),((com.google.javascript.rhino.Node)v25),((com.google.javascript.rhino.Node)v31));
    org.junit.Assert.assertEquals((Object)(true), v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v4),((com.google.common.base.Predicate)v5));
    Object v7 = "L";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = new java.io.PrintStream(((java.lang.String)v7),((java.nio.charset.Charset)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = "L";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v17 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v15),((com.google.common.base.Predicate)v16));
    Object v18 = "L";
    Object v19 = java.nio.charset.Charset.defaultCharset();
    Object v20 = new java.io.PrintStream(((java.lang.String)v18),((java.nio.charset.Charset)v19));
    Object v21 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v20));
    Object v22 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v21));
    Object v23 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.NodeTraversal.Callback)v17),((com.google.javascript.jscomp.ScopeCreator)v22));
    Object v24 = 1.0D;
    Object v25 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v24).doubleValue()));
    Object v26 = 1.0D;
    Object v27 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v26).doubleValue()));
    Object v28 = 1.0D;
    Object v29 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v28).doubleValue()));
    Object v30 = ((com.google.javascript.rhino.Node)v27).copyInformationFrom(((com.google.javascript.rhino.Node)v29));
    Object v31 = ((com.google.javascript.jscomp.ReferenceCollectingCallback)v6).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v23),((com.google.javascript.rhino.Node)v25),((com.google.javascript.rhino.Node)v27));
    org.junit.Assert.assertEquals((Object)(true), v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v4),((com.google.common.base.Predicate)v5));
    Object v7 = "L";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = new java.io.PrintStream(((java.lang.String)v7),((java.nio.charset.Charset)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = "L";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v17 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v15),((com.google.common.base.Predicate)v16));
    Object v18 = "L";
    Object v19 = java.nio.charset.Charset.defaultCharset();
    Object v20 = new java.io.PrintStream(((java.lang.String)v18),((java.nio.charset.Charset)v19));
    Object v21 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v20));
    Object v22 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v21));
    Object v23 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.NodeTraversal.Callback)v17),((com.google.javascript.jscomp.ScopeCreator)v22));
    Object v24 = java.util.List.of();
    ((com.google.javascript.jscomp.NodeTraversal)v23).traverseRoots(((java.util.List)v24));
    Object v25 = null;
    Object v26 = 1.0D;
    Object v27 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v26).doubleValue()));
    Object v28 = 1.0D;
    Object v29 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v28).doubleValue()));
    Object v30 = ((com.google.javascript.rhino.Node)v29).isQualifiedName();
    Object v31 = ((com.google.javascript.jscomp.ReferenceCollectingCallback)v6).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v23),((com.google.javascript.rhino.Node)v27),((com.google.javascript.rhino.Node)v29));
    org.junit.Assert.assertEquals((Object)(true), v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v4),((com.google.common.base.Predicate)v5));
    Object v7 = "L";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = new java.io.PrintStream(((java.lang.String)v7),((java.nio.charset.Charset)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = "L";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v17 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v15),((com.google.common.base.Predicate)v16));
    Object v18 = "L";
    Object v19 = java.nio.charset.Charset.defaultCharset();
    Object v20 = new java.io.PrintStream(((java.lang.String)v18),((java.nio.charset.Charset)v19));
    Object v21 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v20));
    Object v22 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v21));
    Object v23 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.NodeTraversal.Callback)v17),((com.google.javascript.jscomp.ScopeCreator)v22));
    Object v24 = java.util.List.of();
    ((com.google.javascript.jscomp.NodeTraversal)v23).traverseRoots(((java.util.List)v24));
    Object v25 = null;
    ((com.google.javascript.jscomp.ReferenceCollectingCallback)v6).enterScope(((com.google.javascript.jscomp.NodeTraversal)v23));
    Object v26 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v4),((com.google.common.base.Predicate)v5));
    Object v7 = "L";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = new java.io.PrintStream(((java.lang.String)v7),((java.nio.charset.Charset)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = "L";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v17 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v15),((com.google.common.base.Predicate)v16));
    Object v18 = "L";
    Object v19 = java.nio.charset.Charset.defaultCharset();
    Object v20 = new java.io.PrintStream(((java.lang.String)v18),((java.nio.charset.Charset)v19));
    Object v21 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v20));
    Object v22 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v21));
    Object v23 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.NodeTraversal.Callback)v17),((com.google.javascript.jscomp.ScopeCreator)v22));
    Object v24 = 1.0D;
    Object v25 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v24).doubleValue()));
    Object v26 = "*";
    Object v27 = "<";
    Object v28 = com.google.javascript.jscomp.DiagnosticType.warning(((java.lang.String)v26),((java.lang.String)v27));
    Object v29 = new java.lang.String[]{"","removeConstantExpressios"};
    Object v30 = ((com.google.javascript.jscomp.NodeTraversal)v23).makeError(((com.google.javascript.rhino.Node)v25),((com.google.javascript.jscomp.DiagnosticType)v28),((java.lang.String[])v29));
    Object v31 = 1.0D;
    Object v32 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v31).doubleValue()));
    Object v33 = 1.0D;
    Object v34 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v33).doubleValue()));
    ((com.google.javascript.jscomp.ReferenceCollectingCallback)v6).visit(((com.google.javascript.jscomp.NodeTraversal)v23),((com.google.javascript.rhino.Node)v32),((com.google.javascript.rhino.Node)v34));
    Object v35 = null;
    org.junit.Assert.assertNull(v35);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v4),((com.google.common.base.Predicate)v5));
    Object v7 = "L";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = new java.io.PrintStream(((java.lang.String)v7),((java.nio.charset.Charset)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = "L";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v17 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v15),((com.google.common.base.Predicate)v16));
    Object v18 = "L";
    Object v19 = java.nio.charset.Charset.defaultCharset();
    Object v20 = new java.io.PrintStream(((java.lang.String)v18),((java.nio.charset.Charset)v19));
    Object v21 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v20));
    Object v22 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v21));
    Object v23 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.NodeTraversal.Callback)v17),((com.google.javascript.jscomp.ScopeCreator)v22));
    Object v24 = ((com.google.javascript.jscomp.NodeTraversal)v23).getEnclosingFunction();
    Object v25 = 1.0D;
    Object v26 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v25).doubleValue()));
    Object v27 = 0;
    ((com.google.javascript.rhino.Node)v26).setLineno((((java.lang.Integer)v27).intValue()));
    Object v28 = null;
    Object v29 = 1.0D;
    Object v30 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v29).doubleValue()));
    Object v31 = ((com.google.javascript.jscomp.ReferenceCollectingCallback)v6).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v23),((com.google.javascript.rhino.Node)v26),((com.google.javascript.rhino.Node)v30));
    org.junit.Assert.assertEquals((Object)(true), v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v4),((com.google.common.base.Predicate)v5));
    Object v7 = "L";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = new java.io.PrintStream(((java.lang.String)v7),((java.nio.charset.Charset)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = "L";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v17 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v15),((com.google.common.base.Predicate)v16));
    Object v18 = "L";
    Object v19 = java.nio.charset.Charset.defaultCharset();
    Object v20 = new java.io.PrintStream(((java.lang.String)v18),((java.nio.charset.Charset)v19));
    Object v21 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v20));
    Object v22 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v21));
    Object v23 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.NodeTraversal.Callback)v17),((com.google.javascript.jscomp.ScopeCreator)v22));
    Object v24 = 1.0D;
    Object v25 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v24).doubleValue()));
    Object v26 = 1.0D;
    Object v27 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v26).doubleValue()));
    Object v28 = -19;
    ((com.google.javascript.rhino.Node)v27).setCharno((((java.lang.Integer)v28).intValue()));
    Object v29 = null;
    Object v30 = ((com.google.javascript.jscomp.ReferenceCollectingCallback)v6).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v23),((com.google.javascript.rhino.Node)v25),((com.google.javascript.rhino.Node)v27));
    org.junit.Assert.assertEquals((Object)(true), v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v4),((com.google.common.base.Predicate)v5));
    Object v7 = "L";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = new java.io.PrintStream(((java.lang.String)v7),((java.nio.charset.Charset)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = "L";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v17 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v15),((com.google.common.base.Predicate)v16));
    Object v18 = "L";
    Object v19 = java.nio.charset.Charset.defaultCharset();
    Object v20 = new java.io.PrintStream(((java.lang.String)v18),((java.nio.charset.Charset)v19));
    Object v21 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v20));
    Object v22 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v21));
    Object v23 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.NodeTraversal.Callback)v17),((com.google.javascript.jscomp.ScopeCreator)v22));
    ((com.google.javascript.jscomp.ReferenceCollectingCallback)v6).exitScope(((com.google.javascript.jscomp.NodeTraversal)v23));
    Object v24 = null;
      org.junit.Assert.fail("Expected java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v4),((com.google.common.base.Predicate)v5));
    Object v7 = "L";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = new java.io.PrintStream(((java.lang.String)v7),((java.nio.charset.Charset)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = "L";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v17 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v15),((com.google.common.base.Predicate)v16));
    Object v18 = "L";
    Object v19 = java.nio.charset.Charset.defaultCharset();
    Object v20 = new java.io.PrintStream(((java.lang.String)v18),((java.nio.charset.Charset)v19));
    Object v21 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v20));
    Object v22 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v21));
    Object v23 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.NodeTraversal.Callback)v17),((com.google.javascript.jscomp.ScopeCreator)v22));
    Object v24 = 1.0D;
    Object v25 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v24).doubleValue()));
    Object v26 = 1.0D;
    Object v27 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v26).doubleValue()));
    Object v28 = 1.0D;
    Object v29 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v28).doubleValue()));
    Object v30 = ((com.google.javascript.rhino.Node)v27).checkTreeEquals(((com.google.javascript.rhino.Node)v29));
    Object v31 = ((com.google.javascript.jscomp.ReferenceCollectingCallback)v6).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v23),((com.google.javascript.rhino.Node)v25),((com.google.javascript.rhino.Node)v27));
    org.junit.Assert.assertEquals((Object)(true), v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v4),((com.google.common.base.Predicate)v5));
    Object v7 = "L";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = new java.io.PrintStream(((java.lang.String)v7),((java.nio.charset.Charset)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = "L";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v17 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v15),((com.google.common.base.Predicate)v16));
    Object v18 = "L";
    Object v19 = java.nio.charset.Charset.defaultCharset();
    Object v20 = new java.io.PrintStream(((java.lang.String)v18),((java.nio.charset.Charset)v19));
    Object v21 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v20));
    Object v22 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v21));
    Object v23 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.NodeTraversal.Callback)v17),((com.google.javascript.jscomp.ScopeCreator)v22));
    Object v24 = 1.0D;
    Object v25 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v24).doubleValue()));
    Object v26 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v27 = "*";
    Object v28 = "<";
    Object v29 = com.google.javascript.jscomp.DiagnosticType.warning(((java.lang.String)v27),((java.lang.String)v28));
    Object v30 = new java.lang.String[]{""};
    Object v31 = ((com.google.javascript.jscomp.NodeTraversal)v23).makeError(((com.google.javascript.rhino.Node)v25),((com.google.javascript.jscomp.CheckLevel)v26),((com.google.javascript.jscomp.DiagnosticType)v29),((java.lang.String[])v30));
    ((com.google.javascript.jscomp.ReferenceCollectingCallback)v6).enterScope(((com.google.javascript.jscomp.NodeTraversal)v23));
    Object v32 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v4),((com.google.common.base.Predicate)v5));
    Object v7 = "L";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = new java.io.PrintStream(((java.lang.String)v7),((java.nio.charset.Charset)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = "L";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v17 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v15),((com.google.common.base.Predicate)v16));
    Object v18 = "L";
    Object v19 = java.nio.charset.Charset.defaultCharset();
    Object v20 = new java.io.PrintStream(((java.lang.String)v18),((java.nio.charset.Charset)v19));
    Object v21 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v20));
    Object v22 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v21));
    Object v23 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.NodeTraversal.Callback)v17),((com.google.javascript.jscomp.ScopeCreator)v22));
    Object v24 = 1.0D;
    Object v25 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v24).doubleValue()));
    Object v26 = 1.0D;
    Object v27 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v26).doubleValue()));
    Object v28 = 1.0D;
    ((com.google.javascript.rhino.Node)v27).setDouble((((java.lang.Double)v28).doubleValue()));
    Object v29 = null;
    Object v30 = ((com.google.javascript.jscomp.ReferenceCollectingCallback)v6).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v23),((com.google.javascript.rhino.Node)v25),((com.google.javascript.rhino.Node)v27));
    org.junit.Assert.assertEquals((Object)(true), v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v4),((com.google.common.base.Predicate)v5));
    Object v7 = "L";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = new java.io.PrintStream(((java.lang.String)v7),((java.nio.charset.Charset)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = "L";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v17 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v15),((com.google.common.base.Predicate)v16));
    Object v18 = "L";
    Object v19 = java.nio.charset.Charset.defaultCharset();
    Object v20 = new java.io.PrintStream(((java.lang.String)v18),((java.nio.charset.Charset)v19));
    Object v21 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v20));
    Object v22 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v21));
    Object v23 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.NodeTraversal.Callback)v17),((com.google.javascript.jscomp.ScopeCreator)v22));
    Object v24 = ((com.google.javascript.jscomp.NodeTraversal)v23).getEnclosingFunction();
    ((com.google.javascript.jscomp.ReferenceCollectingCallback)v6).enterScope(((com.google.javascript.jscomp.NodeTraversal)v23));
    Object v25 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v4),((com.google.common.base.Predicate)v5));
    Object v7 = "L";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = new java.io.PrintStream(((java.lang.String)v7),((java.nio.charset.Charset)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = "L";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v17 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v15),((com.google.common.base.Predicate)v16));
    Object v18 = "L";
    Object v19 = java.nio.charset.Charset.defaultCharset();
    Object v20 = new java.io.PrintStream(((java.lang.String)v18),((java.nio.charset.Charset)v19));
    Object v21 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v20));
    Object v22 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v21));
    Object v23 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.NodeTraversal.Callback)v17),((com.google.javascript.jscomp.ScopeCreator)v22));
    Object v24 = 1.0D;
    Object v25 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v24).doubleValue()));
    Object v26 = 1.0D;
    Object v27 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v26).doubleValue()));
    Object v28 = 1.0D;
    Object v29 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v28).doubleValue()));
    ((com.google.javascript.rhino.Node)v27).addChildToFront(((com.google.javascript.rhino.Node)v29));
    Object v30 = null;
    Object v31 = ((com.google.javascript.jscomp.ReferenceCollectingCallback)v6).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v23),((com.google.javascript.rhino.Node)v25),((com.google.javascript.rhino.Node)v27));
    org.junit.Assert.assertEquals((Object)(true), v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v4),((com.google.common.base.Predicate)v5));
    Object v7 = "L";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = new java.io.PrintStream(((java.lang.String)v7),((java.nio.charset.Charset)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = "L";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v17 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v15),((com.google.common.base.Predicate)v16));
    Object v18 = "L";
    Object v19 = java.nio.charset.Charset.defaultCharset();
    Object v20 = new java.io.PrintStream(((java.lang.String)v18),((java.nio.charset.Charset)v19));
    Object v21 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v20));
    Object v22 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v21));
    Object v23 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.NodeTraversal.Callback)v17),((com.google.javascript.jscomp.ScopeCreator)v22));
    Object v24 = 1.0D;
    Object v25 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v24).doubleValue()));
    Object v26 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v27 = "*";
    Object v28 = "<";
    Object v29 = com.google.javascript.jscomp.DiagnosticType.warning(((java.lang.String)v27),((java.lang.String)v28));
    Object v30 = new java.lang.String[]{"","",""};
    Object v31 = ((com.google.javascript.jscomp.NodeTraversal)v23).makeError(((com.google.javascript.rhino.Node)v25),((com.google.javascript.jscomp.CheckLevel)v26),((com.google.javascript.jscomp.DiagnosticType)v29),((java.lang.String[])v30));
    Object v32 = 1.0D;
    Object v33 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v32).doubleValue()));
    Object v34 = 1;
    ((com.google.javascript.rhino.Node)v33).setLineno((((java.lang.Integer)v34).intValue()));
    Object v35 = null;
    Object v36 = 1.0D;
    Object v37 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v36).doubleValue()));
    Object v38 = ((com.google.javascript.jscomp.ReferenceCollectingCallback)v6).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v23),((com.google.javascript.rhino.Node)v33),((com.google.javascript.rhino.Node)v37));
    org.junit.Assert.assertEquals((Object)(true), v38);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v4),((com.google.common.base.Predicate)v5));
    Object v7 = "L";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = new java.io.PrintStream(((java.lang.String)v7),((java.nio.charset.Charset)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = "L";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v17 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v15),((com.google.common.base.Predicate)v16));
    Object v18 = "L";
    Object v19 = java.nio.charset.Charset.defaultCharset();
    Object v20 = new java.io.PrintStream(((java.lang.String)v18),((java.nio.charset.Charset)v19));
    Object v21 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v20));
    Object v22 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v21));
    Object v23 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.NodeTraversal.Callback)v17),((com.google.javascript.jscomp.ScopeCreator)v22));
    Object v24 = 1.0D;
    Object v25 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v24).doubleValue()));
    Object v26 = 1.0D;
    Object v27 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v26).doubleValue()));
    Object v28 = ((com.google.javascript.rhino.Node)v25).copyInformationFrom(((com.google.javascript.rhino.Node)v27));
    Object v29 = 1.0D;
    Object v30 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v29).doubleValue()));
    ((com.google.javascript.jscomp.ReferenceCollectingCallback)v6).visit(((com.google.javascript.jscomp.NodeTraversal)v23),((com.google.javascript.rhino.Node)v25),((com.google.javascript.rhino.Node)v30));
    Object v31 = null;
    org.junit.Assert.assertNull(v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v4),((com.google.common.base.Predicate)v5));
    Object v7 = "L";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = new java.io.PrintStream(((java.lang.String)v7),((java.nio.charset.Charset)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = "L";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v17 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v15),((com.google.common.base.Predicate)v16));
    Object v18 = "L";
    Object v19 = java.nio.charset.Charset.defaultCharset();
    Object v20 = new java.io.PrintStream(((java.lang.String)v18),((java.nio.charset.Charset)v19));
    Object v21 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v20));
    Object v22 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v21));
    Object v23 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.NodeTraversal.Callback)v17),((com.google.javascript.jscomp.ScopeCreator)v22));
    Object v24 = 1.0D;
    Object v25 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v24).doubleValue()));
    Object v26 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v27 = "*";
    Object v28 = "<";
    Object v29 = com.google.javascript.jscomp.DiagnosticType.warning(((java.lang.String)v27),((java.lang.String)v28));
    Object v30 = new java.lang.String[]{"Cannot call clelr() after build()."};
    Object v31 = ((com.google.javascript.jscomp.NodeTraversal)v23).makeError(((com.google.javascript.rhino.Node)v25),((com.google.javascript.jscomp.CheckLevel)v26),((com.google.javascript.jscomp.DiagnosticType)v29),((java.lang.String[])v30));
    Object v32 = 1.0D;
    Object v33 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v32).doubleValue()));
    Object v34 = 1.0D;
    Object v35 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v34).doubleValue()));
    Object v36 = ((com.google.javascript.jscomp.ReferenceCollectingCallback)v6).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v23),((com.google.javascript.rhino.Node)v33),((com.google.javascript.rhino.Node)v35));
    org.junit.Assert.assertEquals((Object)(true), v36);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v4),((com.google.common.base.Predicate)v5));
    Object v7 = "L";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = new java.io.PrintStream(((java.lang.String)v7),((java.nio.charset.Charset)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = "L";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v17 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v15),((com.google.common.base.Predicate)v16));
    Object v18 = "L";
    Object v19 = java.nio.charset.Charset.defaultCharset();
    Object v20 = new java.io.PrintStream(((java.lang.String)v18),((java.nio.charset.Charset)v19));
    Object v21 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v20));
    Object v22 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v21));
    Object v23 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.NodeTraversal.Callback)v17),((com.google.javascript.jscomp.ScopeCreator)v22));
    Object v24 = 1.0D;
    Object v25 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v24).doubleValue()));
    Object v26 = ((com.google.javascript.rhino.Node)v25).getJsDocBuilderForNode();
    Object v27 = 1.0D;
    Object v28 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v27).doubleValue()));
    Object v29 = ((com.google.javascript.jscomp.ReferenceCollectingCallback)v6).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v23),((com.google.javascript.rhino.Node)v25),((com.google.javascript.rhino.Node)v28));
    org.junit.Assert.assertEquals((Object)(true), v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v4),((com.google.common.base.Predicate)v5));
    Object v7 = "L";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = new java.io.PrintStream(((java.lang.String)v7),((java.nio.charset.Charset)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = "L";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v17 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v15),((com.google.common.base.Predicate)v16));
    Object v18 = "L";
    Object v19 = java.nio.charset.Charset.defaultCharset();
    Object v20 = new java.io.PrintStream(((java.lang.String)v18),((java.nio.charset.Charset)v19));
    Object v21 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v20));
    Object v22 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v21));
    Object v23 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.NodeTraversal.Callback)v17),((com.google.javascript.jscomp.ScopeCreator)v22));
    Object v24 = ((com.google.javascript.jscomp.NodeTraversal)v23).getScope();
    Object v25 = 1.0D;
    Object v26 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v25).doubleValue()));
    Object v27 = 1.0D;
    Object v28 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v27).doubleValue()));
    ((com.google.javascript.jscomp.ReferenceCollectingCallback)v6).visit(((com.google.javascript.jscomp.NodeTraversal)v23),((com.google.javascript.rhino.Node)v26),((com.google.javascript.rhino.Node)v28));
    Object v29 = null;
    org.junit.Assert.assertNull(v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v4),((com.google.common.base.Predicate)v5));
    Object v7 = "L";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = new java.io.PrintStream(((java.lang.String)v7),((java.nio.charset.Charset)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = "L";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v17 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v15),((com.google.common.base.Predicate)v16));
    Object v18 = "L";
    Object v19 = java.nio.charset.Charset.defaultCharset();
    Object v20 = new java.io.PrintStream(((java.lang.String)v18),((java.nio.charset.Charset)v19));
    Object v21 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v20));
    Object v22 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v21));
    Object v23 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.NodeTraversal.Callback)v17),((com.google.javascript.jscomp.ScopeCreator)v22));
    Object v24 = 1.0D;
    Object v25 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v24).doubleValue()));
    Object v26 = 1.0D;
    Object v27 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v26).doubleValue()));
    ((com.google.javascript.jscomp.ReferenceCollectingCallback)v6).visit(((com.google.javascript.jscomp.NodeTraversal)v23),((com.google.javascript.rhino.Node)v25),((com.google.javascript.rhino.Node)v27));
    Object v28 = null;
    Object v29 = 1.0D;
    Object v30 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v29).doubleValue()));
    Object v31 = 1.0D;
    Object v32 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v31).doubleValue()));
    Object v33 = 1.0D;
    Object v34 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v33).doubleValue()));
    ((com.google.javascript.rhino.Node)v30).addChildAfter(((com.google.javascript.rhino.Node)v32),((com.google.javascript.rhino.Node)v34));
    Object v35 = null;
    Object v36 = 1.0D;
    Object v37 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v36).doubleValue()));
    ((com.google.javascript.jscomp.ReferenceCollectingCallback)v6).process(((com.google.javascript.rhino.Node)v30),((com.google.javascript.rhino.Node)v37));
    Object v38 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v4),((com.google.common.base.Predicate)v5));
    Object v7 = "L";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = new java.io.PrintStream(((java.lang.String)v7),((java.nio.charset.Charset)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = "L";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v17 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v15),((com.google.common.base.Predicate)v16));
    Object v18 = "L";
    Object v19 = java.nio.charset.Charset.defaultCharset();
    Object v20 = new java.io.PrintStream(((java.lang.String)v18),((java.nio.charset.Charset)v19));
    Object v21 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v20));
    Object v22 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v21));
    Object v23 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.NodeTraversal.Callback)v17),((com.google.javascript.jscomp.ScopeCreator)v22));
    Object v24 = ((com.google.javascript.jscomp.NodeTraversal)v23).getScope();
    Object v25 = 1.0D;
    Object v26 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v25).doubleValue()));
    Object v27 = 1.0D;
    Object v28 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v27).doubleValue()));
    Object v29 = ((com.google.javascript.jscomp.ReferenceCollectingCallback)v6).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v23),((com.google.javascript.rhino.Node)v26),((com.google.javascript.rhino.Node)v28));
    org.junit.Assert.assertEquals((Object)(true), v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v4),((com.google.common.base.Predicate)v5));
    Object v7 = 1.0D;
    Object v8 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()));
    Object v9 = 1.0D;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()));
    Object v11 = true;
    Object v12 = false;
    Object v13 = false;
    Object v14 = ((com.google.javascript.rhino.Node)v10).toString((((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()),(((java.lang.Boolean)v13).booleanValue()));
    ((com.google.javascript.jscomp.ReferenceCollectingCallback)v6).process(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v10));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v4),((com.google.common.base.Predicate)v5));
    Object v7 = "L";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = new java.io.PrintStream(((java.lang.String)v7),((java.nio.charset.Charset)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = "L";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v17 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v15),((com.google.common.base.Predicate)v16));
    Object v18 = "L";
    Object v19 = java.nio.charset.Charset.defaultCharset();
    Object v20 = new java.io.PrintStream(((java.lang.String)v18),((java.nio.charset.Charset)v19));
    Object v21 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v20));
    Object v22 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v21));
    Object v23 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.NodeTraversal.Callback)v17),((com.google.javascript.jscomp.ScopeCreator)v22));
    Object v24 = 1.0D;
    Object v25 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v24).doubleValue()));
    Object v26 = 1.0D;
    Object v27 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v26).doubleValue()));
    Object v28 = new com.google.javascript.rhino.JSDocInfo();
    ((com.google.javascript.rhino.Node)v27).setJSDocInfo(((com.google.javascript.rhino.JSDocInfo)v28));
    Object v29 = null;
    Object v30 = ((com.google.javascript.jscomp.ReferenceCollectingCallback)v6).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v23),((com.google.javascript.rhino.Node)v25),((com.google.javascript.rhino.Node)v27));
    org.junit.Assert.assertEquals((Object)(true), v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v4),((com.google.common.base.Predicate)v5));
    Object v7 = "L";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = new java.io.PrintStream(((java.lang.String)v7),((java.nio.charset.Charset)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = "L";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v17 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v15),((com.google.common.base.Predicate)v16));
    Object v18 = "L";
    Object v19 = java.nio.charset.Charset.defaultCharset();
    Object v20 = new java.io.PrintStream(((java.lang.String)v18),((java.nio.charset.Charset)v19));
    Object v21 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v20));
    Object v22 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v21));
    Object v23 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.NodeTraversal.Callback)v17),((com.google.javascript.jscomp.ScopeCreator)v22));
    Object v24 = 1.0D;
    Object v25 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v24).doubleValue()));
    Object v26 = 0;
    ((com.google.javascript.rhino.Node)v25).setType((((java.lang.Integer)v26).intValue()));
    Object v27 = null;
    Object v28 = 1.0D;
    Object v29 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v28).doubleValue()));
    Object v30 = ((com.google.javascript.jscomp.ReferenceCollectingCallback)v6).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v23),((com.google.javascript.rhino.Node)v25),((com.google.javascript.rhino.Node)v29));
    org.junit.Assert.assertEquals((Object)(true), v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v4),((com.google.common.base.Predicate)v5));
    Object v7 = "L";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = new java.io.PrintStream(((java.lang.String)v7),((java.nio.charset.Charset)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = "L";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v17 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v15),((com.google.common.base.Predicate)v16));
    Object v18 = "L";
    Object v19 = java.nio.charset.Charset.defaultCharset();
    Object v20 = new java.io.PrintStream(((java.lang.String)v18),((java.nio.charset.Charset)v19));
    Object v21 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v20));
    Object v22 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v21));
    Object v23 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.NodeTraversal.Callback)v17),((com.google.javascript.jscomp.ScopeCreator)v22));
    Object v24 = java.util.List.of();
    ((com.google.javascript.jscomp.NodeTraversal)v23).traverseRoots(((java.util.List)v24));
    Object v25 = null;
    Object v26 = 1.0D;
    Object v27 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v26).doubleValue()));
    Object v28 = 1.0D;
    Object v29 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v28).doubleValue()));
    Object v30 = ((com.google.javascript.jscomp.ReferenceCollectingCallback)v6).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v23),((com.google.javascript.rhino.Node)v27),((com.google.javascript.rhino.Node)v29));
    org.junit.Assert.assertEquals((Object)(true), v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v4),((com.google.common.base.Predicate)v5));
    Object v7 = "L";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = new java.io.PrintStream(((java.lang.String)v7),((java.nio.charset.Charset)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = "L";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v17 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v15),((com.google.common.base.Predicate)v16));
    Object v18 = "L";
    Object v19 = java.nio.charset.Charset.defaultCharset();
    Object v20 = new java.io.PrintStream(((java.lang.String)v18),((java.nio.charset.Charset)v19));
    Object v21 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v20));
    Object v22 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v21));
    Object v23 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.NodeTraversal.Callback)v17),((com.google.javascript.jscomp.ScopeCreator)v22));
    Object v24 = ((com.google.javascript.jscomp.NodeTraversal)v23).getEnclosingFunction();
    Object v25 = 1.0D;
    Object v26 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v25).doubleValue()));
    Object v27 = 1.0D;
    Object v28 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v27).doubleValue()));
    Object v29 = ((com.google.javascript.jscomp.ReferenceCollectingCallback)v6).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v23),((com.google.javascript.rhino.Node)v26),((com.google.javascript.rhino.Node)v28));
    org.junit.Assert.assertEquals((Object)(true), v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v4),((com.google.common.base.Predicate)v5));
    Object v7 = "L";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = new java.io.PrintStream(((java.lang.String)v7),((java.nio.charset.Charset)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = "L";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v17 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v15),((com.google.common.base.Predicate)v16));
    Object v18 = "L";
    Object v19 = java.nio.charset.Charset.defaultCharset();
    Object v20 = new java.io.PrintStream(((java.lang.String)v18),((java.nio.charset.Charset)v19));
    Object v21 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v20));
    Object v22 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v21));
    Object v23 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.NodeTraversal.Callback)v17),((com.google.javascript.jscomp.ScopeCreator)v22));
    Object v24 = ((com.google.javascript.jscomp.NodeTraversal)v23).hasScope();
    Object v25 = 1.0D;
    Object v26 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v25).doubleValue()));
    Object v27 = 1.0D;
    Object v28 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v27).doubleValue()));
    Object v29 = ((com.google.javascript.jscomp.ReferenceCollectingCallback)v6).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v23),((com.google.javascript.rhino.Node)v26),((com.google.javascript.rhino.Node)v28));
    org.junit.Assert.assertEquals((Object)(true), v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v4),((com.google.common.base.Predicate)v5));
    Object v7 = "L";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = new java.io.PrintStream(((java.lang.String)v7),((java.nio.charset.Charset)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = "L";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v17 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v15),((com.google.common.base.Predicate)v16));
    Object v18 = "L";
    Object v19 = java.nio.charset.Charset.defaultCharset();
    Object v20 = new java.io.PrintStream(((java.lang.String)v18),((java.nio.charset.Charset)v19));
    Object v21 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v20));
    Object v22 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v21));
    Object v23 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.NodeTraversal.Callback)v17),((com.google.javascript.jscomp.ScopeCreator)v22));
    Object v24 = 1.0D;
    Object v25 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v24).doubleValue()));
    Object v26 = 1.0D;
    Object v27 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v26).doubleValue()));
    Object v28 = 1;
    ((com.google.javascript.rhino.Node)v27).setCharno((((java.lang.Integer)v28).intValue()));
    Object v29 = null;
    Object v30 = ((com.google.javascript.jscomp.ReferenceCollectingCallback)v6).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v23),((com.google.javascript.rhino.Node)v25),((com.google.javascript.rhino.Node)v27));
    org.junit.Assert.assertEquals((Object)(true), v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v4),((com.google.common.base.Predicate)v5));
    Object v7 = "L";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = new java.io.PrintStream(((java.lang.String)v7),((java.nio.charset.Charset)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = "L";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v17 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v15),((com.google.common.base.Predicate)v16));
    Object v18 = "L";
    Object v19 = java.nio.charset.Charset.defaultCharset();
    Object v20 = new java.io.PrintStream(((java.lang.String)v18),((java.nio.charset.Charset)v19));
    Object v21 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v20));
    Object v22 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v21));
    Object v23 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.NodeTraversal.Callback)v17),((com.google.javascript.jscomp.ScopeCreator)v22));
    Object v24 = 1.0D;
    Object v25 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v24).doubleValue()));
    Object v26 = 1.0D;
    Object v27 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v26).doubleValue()));
    Object v28 = 0;
    ((com.google.javascript.rhino.Node)v27).setType((((java.lang.Integer)v28).intValue()));
    Object v29 = null;
    Object v30 = ((com.google.javascript.jscomp.ReferenceCollectingCallback)v6).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v23),((com.google.javascript.rhino.Node)v25),((com.google.javascript.rhino.Node)v27));
    org.junit.Assert.assertEquals((Object)(true), v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v4),((com.google.common.base.Predicate)v5));
    Object v7 = "L";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = new java.io.PrintStream(((java.lang.String)v7),((java.nio.charset.Charset)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = "L";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v17 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v15),((com.google.common.base.Predicate)v16));
    Object v18 = "L";
    Object v19 = java.nio.charset.Charset.defaultCharset();
    Object v20 = new java.io.PrintStream(((java.lang.String)v18),((java.nio.charset.Charset)v19));
    Object v21 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v20));
    Object v22 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v21));
    Object v23 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.NodeTraversal.Callback)v17),((com.google.javascript.jscomp.ScopeCreator)v22));
    Object v24 = 1.0D;
    Object v25 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v24).doubleValue()));
    Object v26 = 20;
    ((com.google.javascript.rhino.Node)v25).setCharno((((java.lang.Integer)v26).intValue()));
    Object v27 = null;
    Object v28 = 1.0D;
    Object v29 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v28).doubleValue()));
    ((com.google.javascript.jscomp.ReferenceCollectingCallback)v6).visit(((com.google.javascript.jscomp.NodeTraversal)v23),((com.google.javascript.rhino.Node)v25),((com.google.javascript.rhino.Node)v29));
    Object v30 = null;
    org.junit.Assert.assertNull(v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v4),((com.google.common.base.Predicate)v5));
    Object v7 = "L";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = new java.io.PrintStream(((java.lang.String)v7),((java.nio.charset.Charset)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = "L";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v17 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v15),((com.google.common.base.Predicate)v16));
    Object v18 = "L";
    Object v19 = java.nio.charset.Charset.defaultCharset();
    Object v20 = new java.io.PrintStream(((java.lang.String)v18),((java.nio.charset.Charset)v19));
    Object v21 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v20));
    Object v22 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v21));
    Object v23 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.NodeTraversal.Callback)v17),((com.google.javascript.jscomp.ScopeCreator)v22));
    Object v24 = 1.0D;
    Object v25 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v24).doubleValue()));
    Object v26 = 1.0D;
    Object v27 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v26).doubleValue()));
    Object v28 = 1;
    Object v29 = ((com.google.javascript.rhino.Node)v27).getAncestor((((java.lang.Integer)v28).intValue()));
    Object v30 = ((com.google.javascript.jscomp.ReferenceCollectingCallback)v6).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v23),((com.google.javascript.rhino.Node)v25),((com.google.javascript.rhino.Node)v27));
    org.junit.Assert.assertEquals((Object)(true), v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v4),((com.google.common.base.Predicate)v5));
    Object v7 = "L";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = new java.io.PrintStream(((java.lang.String)v7),((java.nio.charset.Charset)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = "L";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v17 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v15),((com.google.common.base.Predicate)v16));
    Object v18 = "L";
    Object v19 = java.nio.charset.Charset.defaultCharset();
    Object v20 = new java.io.PrintStream(((java.lang.String)v18),((java.nio.charset.Charset)v19));
    Object v21 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v20));
    Object v22 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v21));
    Object v23 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.NodeTraversal.Callback)v17),((com.google.javascript.jscomp.ScopeCreator)v22));
    Object v24 = 1.0D;
    Object v25 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v24).doubleValue()));
    Object v26 = "*";
    Object v27 = "<";
    Object v28 = com.google.javascript.jscomp.DiagnosticType.warning(((java.lang.String)v26),((java.lang.String)v27));
    Object v29 = new java.lang.String[]{" 8ytes"};
    Object v30 = ((com.google.javascript.jscomp.NodeTraversal)v23).makeError(((com.google.javascript.rhino.Node)v25),((com.google.javascript.jscomp.DiagnosticType)v28),((java.lang.String[])v29));
    Object v31 = 1.0D;
    Object v32 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v31).doubleValue()));
    Object v33 = 1.0D;
    Object v34 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v33).doubleValue()));
    ((com.google.javascript.rhino.Node)v32).addChildrenToBack(((com.google.javascript.rhino.Node)v34));
    Object v35 = null;
    Object v36 = 1.0D;
    Object v37 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v36).doubleValue()));
    ((com.google.javascript.jscomp.ReferenceCollectingCallback)v6).visit(((com.google.javascript.jscomp.NodeTraversal)v23),((com.google.javascript.rhino.Node)v32),((com.google.javascript.rhino.Node)v37));
    Object v38 = null;
    org.junit.Assert.assertNull(v38);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v4),((com.google.common.base.Predicate)v5));
    Object v7 = "L";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = new java.io.PrintStream(((java.lang.String)v7),((java.nio.charset.Charset)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = "L";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v17 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v15),((com.google.common.base.Predicate)v16));
    Object v18 = "L";
    Object v19 = java.nio.charset.Charset.defaultCharset();
    Object v20 = new java.io.PrintStream(((java.lang.String)v18),((java.nio.charset.Charset)v19));
    Object v21 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v20));
    Object v22 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v21));
    Object v23 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.NodeTraversal.Callback)v17),((com.google.javascript.jscomp.ScopeCreator)v22));
    Object v24 = 1.0D;
    Object v25 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v24).doubleValue()));
    Object v26 = 1.0D;
    Object v27 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v26).doubleValue()));
    Object v28 = ((com.google.javascript.rhino.Node)v27).removeChildren();
    Object v29 = ((com.google.javascript.jscomp.ReferenceCollectingCallback)v6).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v23),((com.google.javascript.rhino.Node)v25),((com.google.javascript.rhino.Node)v27));
    org.junit.Assert.assertEquals((Object)(true), v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v4),((com.google.common.base.Predicate)v5));
    Object v7 = "L";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = new java.io.PrintStream(((java.lang.String)v7),((java.nio.charset.Charset)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = "L";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v17 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v15),((com.google.common.base.Predicate)v16));
    Object v18 = "L";
    Object v19 = java.nio.charset.Charset.defaultCharset();
    Object v20 = new java.io.PrintStream(((java.lang.String)v18),((java.nio.charset.Charset)v19));
    Object v21 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v20));
    Object v22 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v21));
    Object v23 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.NodeTraversal.Callback)v17),((com.google.javascript.jscomp.ScopeCreator)v22));
    Object v24 = 1.0D;
    Object v25 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v24).doubleValue()));
    Object v26 = 1.0D;
    Object v27 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v26).doubleValue()));
    Object v28 = 38;
    Object v29 = ((com.google.javascript.rhino.Node)v27).getAncestor((((java.lang.Integer)v28).intValue()));
    ((com.google.javascript.jscomp.ReferenceCollectingCallback)v6).visit(((com.google.javascript.jscomp.NodeTraversal)v23),((com.google.javascript.rhino.Node)v25),((com.google.javascript.rhino.Node)v27));
    Object v30 = null;
    org.junit.Assert.assertNull(v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v4),((com.google.common.base.Predicate)v5));
    Object v7 = "L";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = new java.io.PrintStream(((java.lang.String)v7),((java.nio.charset.Charset)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = "L";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v17 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v15),((com.google.common.base.Predicate)v16));
    Object v18 = "L";
    Object v19 = java.nio.charset.Charset.defaultCharset();
    Object v20 = new java.io.PrintStream(((java.lang.String)v18),((java.nio.charset.Charset)v19));
    Object v21 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v20));
    Object v22 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v21));
    Object v23 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.NodeTraversal.Callback)v17),((com.google.javascript.jscomp.ScopeCreator)v22));
    Object v24 = 1.0D;
    Object v25 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v24).doubleValue()));
    Object v26 = true;
    Object v27 = false;
    Object v28 = false;
    Object v29 = ((com.google.javascript.rhino.Node)v25).toString((((java.lang.Boolean)v26).booleanValue()),(((java.lang.Boolean)v27).booleanValue()),(((java.lang.Boolean)v28).booleanValue()));
    Object v30 = 1.0D;
    Object v31 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v30).doubleValue()));
    ((com.google.javascript.jscomp.ReferenceCollectingCallback)v6).visit(((com.google.javascript.jscomp.NodeTraversal)v23),((com.google.javascript.rhino.Node)v25),((com.google.javascript.rhino.Node)v31));
    Object v32 = null;
    org.junit.Assert.assertNull(v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v4),((com.google.common.base.Predicate)v5));
    Object v7 = "L";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = new java.io.PrintStream(((java.lang.String)v7),((java.nio.charset.Charset)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = "L";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v17 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v15),((com.google.common.base.Predicate)v16));
    Object v18 = "L";
    Object v19 = java.nio.charset.Charset.defaultCharset();
    Object v20 = new java.io.PrintStream(((java.lang.String)v18),((java.nio.charset.Charset)v19));
    Object v21 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v20));
    Object v22 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v21));
    Object v23 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.NodeTraversal.Callback)v17),((com.google.javascript.jscomp.ScopeCreator)v22));
    Object v24 = 1.0D;
    Object v25 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v24).doubleValue()));
    Object v26 = 1.0D;
    Object v27 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v26).doubleValue()));
    Object v28 = 34;
    Object v29 = 9;
    ((com.google.javascript.rhino.Node)v27).putIntProp((((java.lang.Integer)v28).intValue()),(((java.lang.Integer)v29).intValue()));
    Object v30 = null;
    ((com.google.javascript.jscomp.ReferenceCollectingCallback)v6).visit(((com.google.javascript.jscomp.NodeTraversal)v23),((com.google.javascript.rhino.Node)v25),((com.google.javascript.rhino.Node)v27));
    Object v31 = null;
    org.junit.Assert.assertNull(v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v4),((com.google.common.base.Predicate)v5));
    Object v7 = "L";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = new java.io.PrintStream(((java.lang.String)v7),((java.nio.charset.Charset)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = "L";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v17 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v15),((com.google.common.base.Predicate)v16));
    Object v18 = "L";
    Object v19 = java.nio.charset.Charset.defaultCharset();
    Object v20 = new java.io.PrintStream(((java.lang.String)v18),((java.nio.charset.Charset)v19));
    Object v21 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v20));
    Object v22 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v21));
    Object v23 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.NodeTraversal.Callback)v17),((com.google.javascript.jscomp.ScopeCreator)v22));
    Object v24 = 1.0D;
    Object v25 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v24).doubleValue()));
    Object v26 = 1.0D;
    Object v27 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v26).doubleValue()));
    ((com.google.javascript.jscomp.ReferenceCollectingCallback)v6).visit(((com.google.javascript.jscomp.NodeTraversal)v23),((com.google.javascript.rhino.Node)v25),((com.google.javascript.rhino.Node)v27));
    Object v28 = null;
    Object v29 = 1.0D;
    Object v30 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v29).doubleValue()));
    Object v31 = 1.0D;
    Object v32 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v31).doubleValue()));
    ((com.google.javascript.jscomp.ReferenceCollectingCallback)v6).process(((com.google.javascript.rhino.Node)v30),((com.google.javascript.rhino.Node)v32));
    Object v33 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v4),((com.google.common.base.Predicate)v5));
    Object v7 = "L";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = new java.io.PrintStream(((java.lang.String)v7),((java.nio.charset.Charset)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = "L";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v17 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v15),((com.google.common.base.Predicate)v16));
    Object v18 = "L";
    Object v19 = java.nio.charset.Charset.defaultCharset();
    Object v20 = new java.io.PrintStream(((java.lang.String)v18),((java.nio.charset.Charset)v19));
    Object v21 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v20));
    Object v22 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v21));
    Object v23 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.NodeTraversal.Callback)v17),((com.google.javascript.jscomp.ScopeCreator)v22));
    Object v24 = 1.0D;
    Object v25 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v24).doubleValue()));
    Object v26 = ((com.google.javascript.rhino.Node)v25).isUnscopedQualifiedName();
    Object v27 = 1.0D;
    Object v28 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v27).doubleValue()));
    ((com.google.javascript.jscomp.ReferenceCollectingCallback)v6).visit(((com.google.javascript.jscomp.NodeTraversal)v23),((com.google.javascript.rhino.Node)v25),((com.google.javascript.rhino.Node)v28));
    Object v29 = null;
    org.junit.Assert.assertNull(v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v4),((com.google.common.base.Predicate)v5));
    Object v7 = "L";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = new java.io.PrintStream(((java.lang.String)v7),((java.nio.charset.Charset)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = "L";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v17 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v15),((com.google.common.base.Predicate)v16));
    Object v18 = "L";
    Object v19 = java.nio.charset.Charset.defaultCharset();
    Object v20 = new java.io.PrintStream(((java.lang.String)v18),((java.nio.charset.Charset)v19));
    Object v21 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v20));
    Object v22 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v21));
    Object v23 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.NodeTraversal.Callback)v17),((com.google.javascript.jscomp.ScopeCreator)v22));
    Object v24 = 1.0D;
    Object v25 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v24).doubleValue()));
    Object v26 = "*";
    Object v27 = "<";
    Object v28 = com.google.javascript.jscomp.DiagnosticType.warning(((java.lang.String)v26),((java.lang.String)v27));
    Object v29 = new java.lang.String[]{};
    Object v30 = ((com.google.javascript.jscomp.NodeTraversal)v23).makeError(((com.google.javascript.rhino.Node)v25),((com.google.javascript.jscomp.DiagnosticType)v28),((java.lang.String[])v29));
    Object v31 = 1.0D;
    Object v32 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v31).doubleValue()));
    Object v33 = ((com.google.javascript.rhino.Node)v32).toString();
    Object v34 = 1.0D;
    Object v35 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v34).doubleValue()));
    Object v36 = ((com.google.javascript.jscomp.ReferenceCollectingCallback)v6).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v23),((com.google.javascript.rhino.Node)v32),((com.google.javascript.rhino.Node)v35));
    org.junit.Assert.assertEquals((Object)(true), v36);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v4),((com.google.common.base.Predicate)v5));
    Object v7 = "L";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = new java.io.PrintStream(((java.lang.String)v7),((java.nio.charset.Charset)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = "L";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v17 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v15),((com.google.common.base.Predicate)v16));
    Object v18 = "L";
    Object v19 = java.nio.charset.Charset.defaultCharset();
    Object v20 = new java.io.PrintStream(((java.lang.String)v18),((java.nio.charset.Charset)v19));
    Object v21 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v20));
    Object v22 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v21));
    Object v23 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.NodeTraversal.Callback)v17),((com.google.javascript.jscomp.ScopeCreator)v22));
    Object v24 = java.util.List.of();
    ((com.google.javascript.jscomp.NodeTraversal)v23).traverseRoots(((java.util.List)v24));
    Object v25 = null;
    ((com.google.javascript.jscomp.ReferenceCollectingCallback)v6).exitScope(((com.google.javascript.jscomp.NodeTraversal)v23));
    Object v26 = null;
      org.junit.Assert.fail("Expected java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v4),((com.google.common.base.Predicate)v5));
    Object v7 = "L";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = new java.io.PrintStream(((java.lang.String)v7),((java.nio.charset.Charset)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = "L";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v17 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v15),((com.google.common.base.Predicate)v16));
    Object v18 = "L";
    Object v19 = java.nio.charset.Charset.defaultCharset();
    Object v20 = new java.io.PrintStream(((java.lang.String)v18),((java.nio.charset.Charset)v19));
    Object v21 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v20));
    Object v22 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v21));
    Object v23 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.NodeTraversal.Callback)v17),((com.google.javascript.jscomp.ScopeCreator)v22));
    Object v24 = 1.0D;
    Object v25 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v24).doubleValue()));
    Object v26 = 1.0D;
    Object v27 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v26).doubleValue()));
    Object v28 = 1.0D;
    Object v29 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v28).doubleValue()));
    ((com.google.javascript.rhino.Node)v27).addChildrenToFront(((com.google.javascript.rhino.Node)v29));
    Object v30 = null;
    ((com.google.javascript.jscomp.ReferenceCollectingCallback)v6).visit(((com.google.javascript.jscomp.NodeTraversal)v23),((com.google.javascript.rhino.Node)v25),((com.google.javascript.rhino.Node)v27));
    Object v31 = null;
    org.junit.Assert.assertNull(v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v4),((com.google.common.base.Predicate)v5));
    Object v7 = "L";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = new java.io.PrintStream(((java.lang.String)v7),((java.nio.charset.Charset)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = "L";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v17 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v15),((com.google.common.base.Predicate)v16));
    Object v18 = "L";
    Object v19 = java.nio.charset.Charset.defaultCharset();
    Object v20 = new java.io.PrintStream(((java.lang.String)v18),((java.nio.charset.Charset)v19));
    Object v21 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v20));
    Object v22 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v21));
    Object v23 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.NodeTraversal.Callback)v17),((com.google.javascript.jscomp.ScopeCreator)v22));
    Object v24 = 1.0D;
    Object v25 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v24).doubleValue()));
    Object v26 = 1.0D;
    Object v27 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v26).doubleValue()));
    Object v28 = ((com.google.javascript.rhino.Node)v27).getQualifiedName();
    ((com.google.javascript.jscomp.ReferenceCollectingCallback)v6).visit(((com.google.javascript.jscomp.NodeTraversal)v23),((com.google.javascript.rhino.Node)v25),((com.google.javascript.rhino.Node)v27));
    Object v29 = null;
    org.junit.Assert.assertNull(v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v4),((com.google.common.base.Predicate)v5));
    Object v7 = "L";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = new java.io.PrintStream(((java.lang.String)v7),((java.nio.charset.Charset)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = "L";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v17 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v15),((com.google.common.base.Predicate)v16));
    Object v18 = "L";
    Object v19 = java.nio.charset.Charset.defaultCharset();
    Object v20 = new java.io.PrintStream(((java.lang.String)v18),((java.nio.charset.Charset)v19));
    Object v21 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v20));
    Object v22 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v21));
    Object v23 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.NodeTraversal.Callback)v17),((com.google.javascript.jscomp.ScopeCreator)v22));
    Object v24 = ((com.google.javascript.jscomp.NodeTraversal)v23).getEnclosingFunction();
    Object v25 = 1.0D;
    Object v26 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v25).doubleValue()));
    Object v27 = ((com.google.javascript.rhino.Node)v26).cloneTree();
    Object v28 = 1.0D;
    Object v29 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v28).doubleValue()));
    ((com.google.javascript.jscomp.ReferenceCollectingCallback)v6).visit(((com.google.javascript.jscomp.NodeTraversal)v23),((com.google.javascript.rhino.Node)v26),((com.google.javascript.rhino.Node)v29));
    Object v30 = null;
    org.junit.Assert.assertNull(v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v4),((com.google.common.base.Predicate)v5));
    Object v7 = "L";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = new java.io.PrintStream(((java.lang.String)v7),((java.nio.charset.Charset)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = "L";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v17 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v15),((com.google.common.base.Predicate)v16));
    Object v18 = "L";
    Object v19 = java.nio.charset.Charset.defaultCharset();
    Object v20 = new java.io.PrintStream(((java.lang.String)v18),((java.nio.charset.Charset)v19));
    Object v21 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v20));
    Object v22 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v21));
    Object v23 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.NodeTraversal.Callback)v17),((com.google.javascript.jscomp.ScopeCreator)v22));
    Object v24 = 1.0D;
    Object v25 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v24).doubleValue()));
    Object v26 = "*";
    Object v27 = "<";
    Object v28 = com.google.javascript.jscomp.DiagnosticType.warning(((java.lang.String)v26),((java.lang.String)v27));
    Object v29 = new java.lang.String[]{"LT","O","processDefi"};
    Object v30 = ((com.google.javascript.jscomp.NodeTraversal)v23).makeError(((com.google.javascript.rhino.Node)v25),((com.google.javascript.jscomp.DiagnosticType)v28),((java.lang.String[])v29));
    Object v31 = 1.0D;
    Object v32 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v31).doubleValue()));
    Object v33 = 1.0D;
    Object v34 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v33).doubleValue()));
    Object v35 = ((com.google.javascript.jscomp.ReferenceCollectingCallback)v6).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v23),((com.google.javascript.rhino.Node)v32),((com.google.javascript.rhino.Node)v34));
    org.junit.Assert.assertEquals((Object)(true), v35);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v4),((com.google.common.base.Predicate)v5));
    Object v7 = "L";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = new java.io.PrintStream(((java.lang.String)v7),((java.nio.charset.Charset)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = "L";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v17 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v15),((com.google.common.base.Predicate)v16));
    Object v18 = "L";
    Object v19 = java.nio.charset.Charset.defaultCharset();
    Object v20 = new java.io.PrintStream(((java.lang.String)v18),((java.nio.charset.Charset)v19));
    Object v21 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v20));
    Object v22 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v21));
    Object v23 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.NodeTraversal.Callback)v17),((com.google.javascript.jscomp.ScopeCreator)v22));
    Object v24 = 1.0D;
    Object v25 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v24).doubleValue()));
    Object v26 = 1.0D;
    Object v27 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v26).doubleValue()));
    Object v28 = ((com.google.javascript.rhino.Node)v27).cloneNode();
    ((com.google.javascript.jscomp.ReferenceCollectingCallback)v6).visit(((com.google.javascript.jscomp.NodeTraversal)v23),((com.google.javascript.rhino.Node)v25),((com.google.javascript.rhino.Node)v27));
    Object v29 = null;
    org.junit.Assert.assertNull(v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v4),((com.google.common.base.Predicate)v5));
    Object v7 = "L";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = new java.io.PrintStream(((java.lang.String)v7),((java.nio.charset.Charset)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = "L";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v17 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v15),((com.google.common.base.Predicate)v16));
    Object v18 = "L";
    Object v19 = java.nio.charset.Charset.defaultCharset();
    Object v20 = new java.io.PrintStream(((java.lang.String)v18),((java.nio.charset.Charset)v19));
    Object v21 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v20));
    Object v22 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v21));
    Object v23 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.NodeTraversal.Callback)v17),((com.google.javascript.jscomp.ScopeCreator)v22));
    Object v24 = 1.0D;
    Object v25 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v24).doubleValue()));
    Object v26 = ((com.google.javascript.rhino.Node)v25).getJsDocBuilderForNode();
    Object v27 = 1.0D;
    Object v28 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v27).doubleValue()));
    Object v29 = 1.0D;
    Object v30 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v29).doubleValue()));
    ((com.google.javascript.rhino.Node)v28).addChildrenToBack(((com.google.javascript.rhino.Node)v30));
    Object v31 = null;
    Object v32 = ((com.google.javascript.jscomp.ReferenceCollectingCallback)v6).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v23),((com.google.javascript.rhino.Node)v25),((com.google.javascript.rhino.Node)v28));
    org.junit.Assert.assertEquals((Object)(true), v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v4),((com.google.common.base.Predicate)v5));
    Object v7 = "L";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = new java.io.PrintStream(((java.lang.String)v7),((java.nio.charset.Charset)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = "L";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v17 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v15),((com.google.common.base.Predicate)v16));
    Object v18 = "L";
    Object v19 = java.nio.charset.Charset.defaultCharset();
    Object v20 = new java.io.PrintStream(((java.lang.String)v18),((java.nio.charset.Charset)v19));
    Object v21 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v20));
    Object v22 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v21));
    Object v23 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.NodeTraversal.Callback)v17),((com.google.javascript.jscomp.ScopeCreator)v22));
    Object v24 = 1.0D;
    Object v25 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v24).doubleValue()));
    Object v26 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v27 = "*";
    Object v28 = "<";
    Object v29 = com.google.javascript.jscomp.DiagnosticType.warning(((java.lang.String)v27),((java.lang.String)v28));
    Object v30 = new java.lang.String[]{"#","break"};
    Object v31 = ((com.google.javascript.jscomp.NodeTraversal)v23).makeError(((com.google.javascript.rhino.Node)v25),((com.google.javascript.jscomp.CheckLevel)v26),((com.google.javascript.jscomp.DiagnosticType)v29),((java.lang.String[])v30));
    Object v32 = 1.0D;
    Object v33 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v32).doubleValue()));
    Object v34 = ((com.google.javascript.rhino.Node)v33).getAncestors();
    Object v35 = 1.0D;
    Object v36 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v35).doubleValue()));
    ((com.google.javascript.jscomp.ReferenceCollectingCallback)v6).visit(((com.google.javascript.jscomp.NodeTraversal)v23),((com.google.javascript.rhino.Node)v33),((com.google.javascript.rhino.Node)v36));
    Object v37 = null;
    org.junit.Assert.assertNull(v37);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v4),((com.google.common.base.Predicate)v5));
    Object v7 = "L";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = new java.io.PrintStream(((java.lang.String)v7),((java.nio.charset.Charset)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = "L";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v17 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v15),((com.google.common.base.Predicate)v16));
    Object v18 = "L";
    Object v19 = java.nio.charset.Charset.defaultCharset();
    Object v20 = new java.io.PrintStream(((java.lang.String)v18),((java.nio.charset.Charset)v19));
    Object v21 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v20));
    Object v22 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v21));
    Object v23 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.NodeTraversal.Callback)v17),((com.google.javascript.jscomp.ScopeCreator)v22));
    Object v24 = 1.0D;
    Object v25 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v24).doubleValue()));
    Object v26 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v27 = "*";
    Object v28 = "<";
    Object v29 = com.google.javascript.jscomp.DiagnosticType.warning(((java.lang.String)v27),((java.lang.String)v28));
    Object v30 = new java.lang.String[]{};
    Object v31 = ((com.google.javascript.jscomp.NodeTraversal)v23).makeError(((com.google.javascript.rhino.Node)v25),((com.google.javascript.jscomp.CheckLevel)v26),((com.google.javascript.jscomp.DiagnosticType)v29),((java.lang.String[])v30));
    Object v32 = 1.0D;
    Object v33 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v32).doubleValue()));
    Object v34 = ((com.google.javascript.rhino.Node)v33).removeChildren();
    Object v35 = 1.0D;
    Object v36 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v35).doubleValue()));
    Object v37 = ((com.google.javascript.jscomp.ReferenceCollectingCallback)v6).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v23),((com.google.javascript.rhino.Node)v33),((com.google.javascript.rhino.Node)v36));
    org.junit.Assert.assertEquals((Object)(true), v37);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v4),((com.google.common.base.Predicate)v5));
    Object v7 = "L";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = new java.io.PrintStream(((java.lang.String)v7),((java.nio.charset.Charset)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = "L";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v17 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v15),((com.google.common.base.Predicate)v16));
    Object v18 = "L";
    Object v19 = java.nio.charset.Charset.defaultCharset();
    Object v20 = new java.io.PrintStream(((java.lang.String)v18),((java.nio.charset.Charset)v19));
    Object v21 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v20));
    Object v22 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v21));
    Object v23 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.NodeTraversal.Callback)v17),((com.google.javascript.jscomp.ScopeCreator)v22));
    Object v24 = ((com.google.javascript.jscomp.NodeTraversal)v23).getScope();
    Object v25 = 1.0D;
    Object v26 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v25).doubleValue()));
    Object v27 = 1.0D;
    Object v28 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v27).doubleValue()));
    Object v29 = false;
    Object v30 = true;
    Object v31 = true;
    Object v32 = ((com.google.javascript.rhino.Node)v28).toString((((java.lang.Boolean)v29).booleanValue()),(((java.lang.Boolean)v30).booleanValue()),(((java.lang.Boolean)v31).booleanValue()));
    ((com.google.javascript.jscomp.ReferenceCollectingCallback)v6).visit(((com.google.javascript.jscomp.NodeTraversal)v23),((com.google.javascript.rhino.Node)v26),((com.google.javascript.rhino.Node)v28));
    Object v33 = null;
    org.junit.Assert.assertNull(v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v4),((com.google.common.base.Predicate)v5));
    Object v7 = "L";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = new java.io.PrintStream(((java.lang.String)v7),((java.nio.charset.Charset)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = "L";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v17 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v15),((com.google.common.base.Predicate)v16));
    Object v18 = "L";
    Object v19 = java.nio.charset.Charset.defaultCharset();
    Object v20 = new java.io.PrintStream(((java.lang.String)v18),((java.nio.charset.Charset)v19));
    Object v21 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v20));
    Object v22 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v21));
    Object v23 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.NodeTraversal.Callback)v17),((com.google.javascript.jscomp.ScopeCreator)v22));
    Object v24 = 1.0D;
    Object v25 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v24).doubleValue()));
    Object v26 = ((com.google.javascript.rhino.Node)v25).toString();
    Object v27 = 1.0D;
    Object v28 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v27).doubleValue()));
    ((com.google.javascript.jscomp.ReferenceCollectingCallback)v6).visit(((com.google.javascript.jscomp.NodeTraversal)v23),((com.google.javascript.rhino.Node)v25),((com.google.javascript.rhino.Node)v28));
    Object v29 = null;
    org.junit.Assert.assertNull(v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v4),((com.google.common.base.Predicate)v5));
    Object v7 = 1.0D;
    Object v8 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()));
    Object v9 = 1.0D;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()));
    Object v11 = ((com.google.javascript.rhino.Node)v10).isUnscopedQualifiedName();
    ((com.google.javascript.jscomp.ReferenceCollectingCallback)v6).process(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v10));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v4),((com.google.common.base.Predicate)v5));
    Object v7 = "L";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = new java.io.PrintStream(((java.lang.String)v7),((java.nio.charset.Charset)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = "L";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v17 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v15),((com.google.common.base.Predicate)v16));
    Object v18 = "L";
    Object v19 = java.nio.charset.Charset.defaultCharset();
    Object v20 = new java.io.PrintStream(((java.lang.String)v18),((java.nio.charset.Charset)v19));
    Object v21 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v20));
    Object v22 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v21));
    Object v23 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.NodeTraversal.Callback)v17),((com.google.javascript.jscomp.ScopeCreator)v22));
    Object v24 = 1.0D;
    Object v25 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v24).doubleValue()));
    Object v26 = 1.0D;
    Object v27 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v26).doubleValue()));
    Object v28 = ((com.google.javascript.rhino.Node)v25).checkTreeTypeAwareEqualsSilent(((com.google.javascript.rhino.Node)v27));
    Object v29 = 1.0D;
    Object v30 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v29).doubleValue()));
    ((com.google.javascript.jscomp.ReferenceCollectingCallback)v6).visit(((com.google.javascript.jscomp.NodeTraversal)v23),((com.google.javascript.rhino.Node)v25),((com.google.javascript.rhino.Node)v30));
    Object v31 = null;
    org.junit.Assert.assertNull(v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v4),((com.google.common.base.Predicate)v5));
    Object v7 = "L";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = new java.io.PrintStream(((java.lang.String)v7),((java.nio.charset.Charset)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = "L";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v17 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v15),((com.google.common.base.Predicate)v16));
    Object v18 = "L";
    Object v19 = java.nio.charset.Charset.defaultCharset();
    Object v20 = new java.io.PrintStream(((java.lang.String)v18),((java.nio.charset.Charset)v19));
    Object v21 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v20));
    Object v22 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v21));
    Object v23 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.NodeTraversal.Callback)v17),((com.google.javascript.jscomp.ScopeCreator)v22));
    Object v24 = 1.0D;
    Object v25 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v24).doubleValue()));
    Object v26 = 1.0D;
    Object v27 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v26).doubleValue()));
    Object v28 = 1.0D;
    Object v29 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v28).doubleValue()));
    Object v30 = ((com.google.javascript.rhino.Node)v27).checkTreeEquals(((com.google.javascript.rhino.Node)v29));
    ((com.google.javascript.jscomp.ReferenceCollectingCallback)v6).visit(((com.google.javascript.jscomp.NodeTraversal)v23),((com.google.javascript.rhino.Node)v25),((com.google.javascript.rhino.Node)v27));
    Object v31 = null;
    org.junit.Assert.assertNull(v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v4),((com.google.common.base.Predicate)v5));
    Object v7 = "L";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = new java.io.PrintStream(((java.lang.String)v7),((java.nio.charset.Charset)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = "L";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v17 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v15),((com.google.common.base.Predicate)v16));
    Object v18 = "L";
    Object v19 = java.nio.charset.Charset.defaultCharset();
    Object v20 = new java.io.PrintStream(((java.lang.String)v18),((java.nio.charset.Charset)v19));
    Object v21 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v20));
    Object v22 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v21));
    Object v23 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.NodeTraversal.Callback)v17),((com.google.javascript.jscomp.ScopeCreator)v22));
    Object v24 = 1.0D;
    Object v25 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v24).doubleValue()));
    Object v26 = 1.0D;
    Object v27 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v26).doubleValue()));
    Object v28 = ((com.google.javascript.rhino.Node)v27).getAncestors();
    Object v29 = ((com.google.javascript.jscomp.ReferenceCollectingCallback)v6).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v23),((com.google.javascript.rhino.Node)v25),((com.google.javascript.rhino.Node)v27));
    org.junit.Assert.assertEquals((Object)(true), v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v4),((com.google.common.base.Predicate)v5));
    Object v7 = "L";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = new java.io.PrintStream(((java.lang.String)v7),((java.nio.charset.Charset)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = "L";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v17 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v15),((com.google.common.base.Predicate)v16));
    Object v18 = "L";
    Object v19 = java.nio.charset.Charset.defaultCharset();
    Object v20 = new java.io.PrintStream(((java.lang.String)v18),((java.nio.charset.Charset)v19));
    Object v21 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v20));
    Object v22 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v21));
    Object v23 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.NodeTraversal.Callback)v17),((com.google.javascript.jscomp.ScopeCreator)v22));
    Object v24 = 1.0D;
    Object v25 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v24).doubleValue()));
    Object v26 = "*";
    Object v27 = "<";
    Object v28 = com.google.javascript.jscomp.DiagnosticType.warning(((java.lang.String)v26),((java.lang.String)v27));
    Object v29 = new java.lang.String[]{"9","","y"};
    Object v30 = ((com.google.javascript.jscomp.NodeTraversal)v23).makeError(((com.google.javascript.rhino.Node)v25),((com.google.javascript.jscomp.DiagnosticType)v28),((java.lang.String[])v29));
    Object v31 = 1.0D;
    Object v32 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v31).doubleValue()));
    Object v33 = 1.0D;
    Object v34 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v33).doubleValue()));
    Object v35 = 52;
    Object v36 = 11;
    ((com.google.javascript.rhino.Node)v34).putIntProp((((java.lang.Integer)v35).intValue()),(((java.lang.Integer)v36).intValue()));
    Object v37 = null;
    ((com.google.javascript.jscomp.ReferenceCollectingCallback)v6).visit(((com.google.javascript.jscomp.NodeTraversal)v23),((com.google.javascript.rhino.Node)v32),((com.google.javascript.rhino.Node)v34));
    Object v38 = null;
    org.junit.Assert.assertNull(v38);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v4),((com.google.common.base.Predicate)v5));
    Object v7 = "L";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = new java.io.PrintStream(((java.lang.String)v7),((java.nio.charset.Charset)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = "L";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v17 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v15),((com.google.common.base.Predicate)v16));
    Object v18 = "L";
    Object v19 = java.nio.charset.Charset.defaultCharset();
    Object v20 = new java.io.PrintStream(((java.lang.String)v18),((java.nio.charset.Charset)v19));
    Object v21 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v20));
    Object v22 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v21));
    Object v23 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.NodeTraversal.Callback)v17),((com.google.javascript.jscomp.ScopeCreator)v22));
    Object v24 = 1.0D;
    Object v25 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v24).doubleValue()));
    Object v26 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v27 = "*";
    Object v28 = "<";
    Object v29 = com.google.javascript.jscomp.DiagnosticType.warning(((java.lang.String)v27),((java.lang.String)v28));
    Object v30 = new java.lang.String[]{};
    Object v31 = ((com.google.javascript.jscomp.NodeTraversal)v23).makeError(((com.google.javascript.rhino.Node)v25),((com.google.javascript.jscomp.CheckLevel)v26),((com.google.javascript.jscomp.DiagnosticType)v29),((java.lang.String[])v30));
    Object v32 = 1.0D;
    Object v33 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v32).doubleValue()));
    Object v34 = ((com.google.javascript.rhino.Node)v33).getJsDocBuilderForNode();
    Object v35 = 1.0D;
    Object v36 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v35).doubleValue()));
    Object v37 = ((com.google.javascript.jscomp.ReferenceCollectingCallback)v6).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v23),((com.google.javascript.rhino.Node)v33),((com.google.javascript.rhino.Node)v36));
    org.junit.Assert.assertEquals((Object)(true), v37);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v4),((com.google.common.base.Predicate)v5));
    Object v7 = "L";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = new java.io.PrintStream(((java.lang.String)v7),((java.nio.charset.Charset)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = "L";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v17 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v15),((com.google.common.base.Predicate)v16));
    Object v18 = "L";
    Object v19 = java.nio.charset.Charset.defaultCharset();
    Object v20 = new java.io.PrintStream(((java.lang.String)v18),((java.nio.charset.Charset)v19));
    Object v21 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v20));
    Object v22 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v21));
    Object v23 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.NodeTraversal.Callback)v17),((com.google.javascript.jscomp.ScopeCreator)v22));
    Object v24 = ((com.google.javascript.jscomp.NodeTraversal)v23).getScope();
    ((com.google.javascript.jscomp.ReferenceCollectingCallback)v6).enterScope(((com.google.javascript.jscomp.NodeTraversal)v23));
    Object v25 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v4),((com.google.common.base.Predicate)v5));
    Object v7 = "L";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = new java.io.PrintStream(((java.lang.String)v7),((java.nio.charset.Charset)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = "L";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v17 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v15),((com.google.common.base.Predicate)v16));
    Object v18 = "L";
    Object v19 = java.nio.charset.Charset.defaultCharset();
    Object v20 = new java.io.PrintStream(((java.lang.String)v18),((java.nio.charset.Charset)v19));
    Object v21 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v20));
    Object v22 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v21));
    Object v23 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.NodeTraversal.Callback)v17),((com.google.javascript.jscomp.ScopeCreator)v22));
    Object v24 = new com.google.javascript.rhino.Node[]{};
    ((com.google.javascript.jscomp.NodeTraversal)v23).traverseRoots(((com.google.javascript.rhino.Node[])v24));
    Object v25 = null;
    ((com.google.javascript.jscomp.ReferenceCollectingCallback)v6).enterScope(((com.google.javascript.jscomp.NodeTraversal)v23));
    Object v26 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v4),((com.google.common.base.Predicate)v5));
    Object v7 = "L";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = new java.io.PrintStream(((java.lang.String)v7),((java.nio.charset.Charset)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = "L";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v17 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v15),((com.google.common.base.Predicate)v16));
    Object v18 = "L";
    Object v19 = java.nio.charset.Charset.defaultCharset();
    Object v20 = new java.io.PrintStream(((java.lang.String)v18),((java.nio.charset.Charset)v19));
    Object v21 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v20));
    Object v22 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v21));
    Object v23 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.NodeTraversal.Callback)v17),((com.google.javascript.jscomp.ScopeCreator)v22));
    Object v24 = 1.0D;
    Object v25 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v24).doubleValue()));
    Object v26 = "*";
    Object v27 = "<";
    Object v28 = com.google.javascript.jscomp.DiagnosticType.warning(((java.lang.String)v26),((java.lang.String)v27));
    Object v29 = new java.lang.String[]{"aguments"};
    Object v30 = ((com.google.javascript.jscomp.NodeTraversal)v23).makeError(((com.google.javascript.rhino.Node)v25),((com.google.javascript.jscomp.DiagnosticType)v28),((java.lang.String[])v29));
    Object v31 = 1.0D;
    Object v32 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v31).doubleValue()));
    Object v33 = 1.0D;
    Object v34 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v33).doubleValue()));
    Object v35 = ((com.google.javascript.jscomp.ReferenceCollectingCallback)v6).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v23),((com.google.javascript.rhino.Node)v32),((com.google.javascript.rhino.Node)v34));
    org.junit.Assert.assertEquals((Object)(true), v35);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v4),((com.google.common.base.Predicate)v5));
    Object v7 = "L";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = new java.io.PrintStream(((java.lang.String)v7),((java.nio.charset.Charset)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = "L";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v17 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v15),((com.google.common.base.Predicate)v16));
    Object v18 = "L";
    Object v19 = java.nio.charset.Charset.defaultCharset();
    Object v20 = new java.io.PrintStream(((java.lang.String)v18),((java.nio.charset.Charset)v19));
    Object v21 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v20));
    Object v22 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v21));
    Object v23 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.NodeTraversal.Callback)v17),((com.google.javascript.jscomp.ScopeCreator)v22));
    Object v24 = 1.0D;
    Object v25 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v24).doubleValue()));
    Object v26 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v27 = "*";
    Object v28 = "<";
    Object v29 = com.google.javascript.jscomp.DiagnosticType.warning(((java.lang.String)v27),((java.lang.String)v28));
    Object v30 = new java.lang.String[]{};
    Object v31 = ((com.google.javascript.jscomp.NodeTraversal)v23).makeError(((com.google.javascript.rhino.Node)v25),((com.google.javascript.jscomp.CheckLevel)v26),((com.google.javascript.jscomp.DiagnosticType)v29),((java.lang.String[])v30));
    ((com.google.javascript.jscomp.ReferenceCollectingCallback)v6).enterScope(((com.google.javascript.jscomp.NodeTraversal)v23));
    Object v32 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v4),((com.google.common.base.Predicate)v5));
    Object v7 = "L";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = new java.io.PrintStream(((java.lang.String)v7),((java.nio.charset.Charset)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = "L";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v17 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v15),((com.google.common.base.Predicate)v16));
    Object v18 = "L";
    Object v19 = java.nio.charset.Charset.defaultCharset();
    Object v20 = new java.io.PrintStream(((java.lang.String)v18),((java.nio.charset.Charset)v19));
    Object v21 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v20));
    Object v22 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v21));
    Object v23 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.NodeTraversal.Callback)v17),((com.google.javascript.jscomp.ScopeCreator)v22));
    Object v24 = 1.0D;
    Object v25 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v24).doubleValue()));
    Object v26 = "*";
    Object v27 = "<";
    Object v28 = com.google.javascript.jscomp.DiagnosticType.warning(((java.lang.String)v26),((java.lang.String)v27));
    Object v29 = new java.lang.String[]{"",""};
    Object v30 = ((com.google.javascript.jscomp.NodeTraversal)v23).makeError(((com.google.javascript.rhino.Node)v25),((com.google.javascript.jscomp.DiagnosticType)v28),((java.lang.String[])v29));
    Object v31 = 1.0D;
    Object v32 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v31).doubleValue()));
    Object v33 = 1.0D;
    Object v34 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v33).doubleValue()));
    Object v35 = 1.0D;
    Object v36 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v35).doubleValue()));
    Object v37 = ((com.google.javascript.rhino.Node)v34).copyInformationFrom(((com.google.javascript.rhino.Node)v36));
    Object v38 = ((com.google.javascript.jscomp.ReferenceCollectingCallback)v6).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v23),((com.google.javascript.rhino.Node)v32),((com.google.javascript.rhino.Node)v34));
    org.junit.Assert.assertEquals((Object)(true), v38);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v4),((com.google.common.base.Predicate)v5));
    Object v7 = "L";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = new java.io.PrintStream(((java.lang.String)v7),((java.nio.charset.Charset)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = "L";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v17 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v15),((com.google.common.base.Predicate)v16));
    Object v18 = "L";
    Object v19 = java.nio.charset.Charset.defaultCharset();
    Object v20 = new java.io.PrintStream(((java.lang.String)v18),((java.nio.charset.Charset)v19));
    Object v21 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v20));
    Object v22 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v21));
    Object v23 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.NodeTraversal.Callback)v17),((com.google.javascript.jscomp.ScopeCreator)v22));
    Object v24 = 1.0D;
    Object v25 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v24).doubleValue()));
    Object v26 = true;
    ((com.google.javascript.rhino.Node)v25).setWasEmptyNode((((java.lang.Boolean)v26).booleanValue()));
    Object v27 = null;
    Object v28 = 1.0D;
    Object v29 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v28).doubleValue()));
    Object v30 = ((com.google.javascript.rhino.Node)v29).getAncestors();
    Object v31 = ((com.google.javascript.jscomp.ReferenceCollectingCallback)v6).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v23),((com.google.javascript.rhino.Node)v25),((com.google.javascript.rhino.Node)v29));
    org.junit.Assert.assertEquals((Object)(true), v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v4),((com.google.common.base.Predicate)v5));
    Object v7 = "L";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = new java.io.PrintStream(((java.lang.String)v7),((java.nio.charset.Charset)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = "L";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v17 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v15),((com.google.common.base.Predicate)v16));
    Object v18 = "L";
    Object v19 = java.nio.charset.Charset.defaultCharset();
    Object v20 = new java.io.PrintStream(((java.lang.String)v18),((java.nio.charset.Charset)v19));
    Object v21 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v20));
    Object v22 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v21));
    Object v23 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.NodeTraversal.Callback)v17),((com.google.javascript.jscomp.ScopeCreator)v22));
    Object v24 = 1.0D;
    Object v25 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v24).doubleValue()));
    Object v26 = ((com.google.javascript.rhino.Node)v25).cloneNode();
    Object v27 = 1.0D;
    Object v28 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v27).doubleValue()));
    Object v29 = ((com.google.javascript.jscomp.ReferenceCollectingCallback)v6).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v23),((com.google.javascript.rhino.Node)v25),((com.google.javascript.rhino.Node)v28));
    org.junit.Assert.assertEquals((Object)(true), v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v4),((com.google.common.base.Predicate)v5));
    Object v7 = 1.0D;
    Object v8 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()));
    Object v9 = 1.0D;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()));
    Object v11 = "L";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    ((com.google.javascript.rhino.Node)v10).appendStringTree(((java.lang.Appendable)v13));
    Object v14 = null;
    ((com.google.javascript.jscomp.ReferenceCollectingCallback)v6).process(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v10));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v4),((com.google.common.base.Predicate)v5));
    Object v7 = "L";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = new java.io.PrintStream(((java.lang.String)v7),((java.nio.charset.Charset)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = "L";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v17 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v15),((com.google.common.base.Predicate)v16));
    Object v18 = "L";
    Object v19 = java.nio.charset.Charset.defaultCharset();
    Object v20 = new java.io.PrintStream(((java.lang.String)v18),((java.nio.charset.Charset)v19));
    Object v21 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v20));
    Object v22 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v21));
    Object v23 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.NodeTraversal.Callback)v17),((com.google.javascript.jscomp.ScopeCreator)v22));
    Object v24 = 1.0D;
    Object v25 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v24).doubleValue()));
    Object v26 = 1.0D;
    Object v27 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v26).doubleValue()));
    Object v28 = false;
    ((com.google.javascript.rhino.Node)v27).setVarArgs((((java.lang.Boolean)v28).booleanValue()));
    Object v29 = null;
    ((com.google.javascript.jscomp.ReferenceCollectingCallback)v6).visit(((com.google.javascript.jscomp.NodeTraversal)v23),((com.google.javascript.rhino.Node)v25),((com.google.javascript.rhino.Node)v27));
    Object v30 = null;
    org.junit.Assert.assertNull(v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v4),((com.google.common.base.Predicate)v5));
    Object v7 = "L";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = new java.io.PrintStream(((java.lang.String)v7),((java.nio.charset.Charset)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = "L";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v17 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v15),((com.google.common.base.Predicate)v16));
    Object v18 = "L";
    Object v19 = java.nio.charset.Charset.defaultCharset();
    Object v20 = new java.io.PrintStream(((java.lang.String)v18),((java.nio.charset.Charset)v19));
    Object v21 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v20));
    Object v22 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v21));
    Object v23 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.NodeTraversal.Callback)v17),((com.google.javascript.jscomp.ScopeCreator)v22));
    Object v24 = ((com.google.javascript.jscomp.NodeTraversal)v23).getEnclosingFunction();
    Object v25 = 1.0D;
    Object v26 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v25).doubleValue()));
    Object v27 = ((com.google.javascript.rhino.Node)v26).removeChildren();
    Object v28 = 1.0D;
    Object v29 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v28).doubleValue()));
    ((com.google.javascript.jscomp.ReferenceCollectingCallback)v6).visit(((com.google.javascript.jscomp.NodeTraversal)v23),((com.google.javascript.rhino.Node)v26),((com.google.javascript.rhino.Node)v29));
    Object v30 = null;
    org.junit.Assert.assertNull(v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v4),((com.google.common.base.Predicate)v5));
    Object v7 = "L";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = new java.io.PrintStream(((java.lang.String)v7),((java.nio.charset.Charset)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = "L";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v17 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v15),((com.google.common.base.Predicate)v16));
    Object v18 = "L";
    Object v19 = java.nio.charset.Charset.defaultCharset();
    Object v20 = new java.io.PrintStream(((java.lang.String)v18),((java.nio.charset.Charset)v19));
    Object v21 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v20));
    Object v22 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v21));
    Object v23 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.NodeTraversal.Callback)v17),((com.google.javascript.jscomp.ScopeCreator)v22));
    Object v24 = 1.0D;
    Object v25 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v24).doubleValue()));
    Object v26 = 1.0D;
    Object v27 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v26).doubleValue()));
    Object v28 = ((com.google.javascript.rhino.Node)v27).hasSideEffects();
    Object v29 = ((com.google.javascript.jscomp.ReferenceCollectingCallback)v6).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v23),((com.google.javascript.rhino.Node)v25),((com.google.javascript.rhino.Node)v27));
    org.junit.Assert.assertEquals((Object)(true), v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v4),((com.google.common.base.Predicate)v5));
    Object v7 = "L";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = new java.io.PrintStream(((java.lang.String)v7),((java.nio.charset.Charset)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = "L";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v17 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v15),((com.google.common.base.Predicate)v16));
    Object v18 = "L";
    Object v19 = java.nio.charset.Charset.defaultCharset();
    Object v20 = new java.io.PrintStream(((java.lang.String)v18),((java.nio.charset.Charset)v19));
    Object v21 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v20));
    Object v22 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v21));
    Object v23 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.NodeTraversal.Callback)v17),((com.google.javascript.jscomp.ScopeCreator)v22));
    Object v24 = 1.0D;
    Object v25 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v24).doubleValue()));
    Object v26 = 1.0D;
    Object v27 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v26).doubleValue()));
    Object v28 = ((com.google.javascript.rhino.Node)v25).copyInformationFromForTree(((com.google.javascript.rhino.Node)v27));
    Object v29 = 1.0D;
    Object v30 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v29).doubleValue()));
    ((com.google.javascript.jscomp.ReferenceCollectingCallback)v6).visit(((com.google.javascript.jscomp.NodeTraversal)v23),((com.google.javascript.rhino.Node)v25),((com.google.javascript.rhino.Node)v30));
    Object v31 = null;
    org.junit.Assert.assertNull(v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v4),((com.google.common.base.Predicate)v5));
    Object v7 = "L";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = new java.io.PrintStream(((java.lang.String)v7),((java.nio.charset.Charset)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = "L";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v17 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v15),((com.google.common.base.Predicate)v16));
    Object v18 = "L";
    Object v19 = java.nio.charset.Charset.defaultCharset();
    Object v20 = new java.io.PrintStream(((java.lang.String)v18),((java.nio.charset.Charset)v19));
    Object v21 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v20));
    Object v22 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v21));
    Object v23 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.NodeTraversal.Callback)v17),((com.google.javascript.jscomp.ScopeCreator)v22));
    Object v24 = 1.0D;
    Object v25 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v24).doubleValue()));
    Object v26 = ((com.google.javascript.rhino.Node)v25).getAncestors();
    Object v27 = 1.0D;
    Object v28 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v27).doubleValue()));
    Object v29 = ((com.google.javascript.jscomp.ReferenceCollectingCallback)v6).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v23),((com.google.javascript.rhino.Node)v25),((com.google.javascript.rhino.Node)v28));
    org.junit.Assert.assertEquals((Object)(true), v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v4),((com.google.common.base.Predicate)v5));
    Object v7 = "L";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = new java.io.PrintStream(((java.lang.String)v7),((java.nio.charset.Charset)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = "L";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v17 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v15),((com.google.common.base.Predicate)v16));
    Object v18 = "L";
    Object v19 = java.nio.charset.Charset.defaultCharset();
    Object v20 = new java.io.PrintStream(((java.lang.String)v18),((java.nio.charset.Charset)v19));
    Object v21 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v20));
    Object v22 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v21));
    Object v23 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.NodeTraversal.Callback)v17),((com.google.javascript.jscomp.ScopeCreator)v22));
    Object v24 = 1.0D;
    Object v25 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v24).doubleValue()));
    Object v26 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v27 = "*";
    Object v28 = "<";
    Object v29 = com.google.javascript.jscomp.DiagnosticType.warning(((java.lang.String)v27),((java.lang.String)v28));
    Object v30 = new java.lang.String[]{""};
    Object v31 = ((com.google.javascript.jscomp.NodeTraversal)v23).makeError(((com.google.javascript.rhino.Node)v25),((com.google.javascript.jscomp.CheckLevel)v26),((com.google.javascript.jscomp.DiagnosticType)v29),((java.lang.String[])v30));
    Object v32 = 1.0D;
    Object v33 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v32).doubleValue()));
    Object v34 = 1.0D;
    Object v35 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v34).doubleValue()));
    Object v36 = 1.0D;
    Object v37 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v36).doubleValue()));
    Object v38 = ((com.google.javascript.rhino.Node)v35).copyInformationFrom(((com.google.javascript.rhino.Node)v37));
    Object v39 = ((com.google.javascript.jscomp.ReferenceCollectingCallback)v6).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v23),((com.google.javascript.rhino.Node)v33),((com.google.javascript.rhino.Node)v35));
    org.junit.Assert.assertEquals((Object)(true), v39);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v4),((com.google.common.base.Predicate)v5));
    Object v7 = "L";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = new java.io.PrintStream(((java.lang.String)v7),((java.nio.charset.Charset)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = "L";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v17 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v15),((com.google.common.base.Predicate)v16));
    Object v18 = "L";
    Object v19 = java.nio.charset.Charset.defaultCharset();
    Object v20 = new java.io.PrintStream(((java.lang.String)v18),((java.nio.charset.Charset)v19));
    Object v21 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v20));
    Object v22 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v21));
    Object v23 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.NodeTraversal.Callback)v17),((com.google.javascript.jscomp.ScopeCreator)v22));
    Object v24 = 1.0D;
    Object v25 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v24).doubleValue()));
    Object v26 = 1.0D;
    Object v27 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v26).doubleValue()));
    Object v28 = ((com.google.javascript.rhino.Node)v27).toStringTree();
    ((com.google.javascript.jscomp.ReferenceCollectingCallback)v6).visit(((com.google.javascript.jscomp.NodeTraversal)v23),((com.google.javascript.rhino.Node)v25),((com.google.javascript.rhino.Node)v27));
    Object v29 = null;
    org.junit.Assert.assertNull(v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v4),((com.google.common.base.Predicate)v5));
    Object v7 = "L";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = new java.io.PrintStream(((java.lang.String)v7),((java.nio.charset.Charset)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = "L";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v17 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v15),((com.google.common.base.Predicate)v16));
    Object v18 = "L";
    Object v19 = java.nio.charset.Charset.defaultCharset();
    Object v20 = new java.io.PrintStream(((java.lang.String)v18),((java.nio.charset.Charset)v19));
    Object v21 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v20));
    Object v22 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v21));
    Object v23 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.NodeTraversal.Callback)v17),((com.google.javascript.jscomp.ScopeCreator)v22));
    Object v24 = 1.0D;
    Object v25 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v24).doubleValue()));
    Object v26 = 1;
    ((com.google.javascript.rhino.Node)v25).setCharno((((java.lang.Integer)v26).intValue()));
    Object v27 = null;
    Object v28 = 1.0D;
    Object v29 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v28).doubleValue()));
    Object v30 = 24;
    ((com.google.javascript.rhino.Node)v29).removeProp((((java.lang.Integer)v30).intValue()));
    Object v31 = null;
    ((com.google.javascript.jscomp.ReferenceCollectingCallback)v6).visit(((com.google.javascript.jscomp.NodeTraversal)v23),((com.google.javascript.rhino.Node)v25),((com.google.javascript.rhino.Node)v29));
    Object v32 = null;
    org.junit.Assert.assertNull(v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v4),((com.google.common.base.Predicate)v5));
    Object v7 = "L";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = new java.io.PrintStream(((java.lang.String)v7),((java.nio.charset.Charset)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = "L";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v17 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v15),((com.google.common.base.Predicate)v16));
    Object v18 = "L";
    Object v19 = java.nio.charset.Charset.defaultCharset();
    Object v20 = new java.io.PrintStream(((java.lang.String)v18),((java.nio.charset.Charset)v19));
    Object v21 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v20));
    Object v22 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v21));
    Object v23 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.NodeTraversal.Callback)v17),((com.google.javascript.jscomp.ScopeCreator)v22));
    Object v24 = 1.0D;
    Object v25 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v24).doubleValue()));
    Object v26 = ((com.google.javascript.rhino.Node)v25).getJsDocBuilderForNode();
    Object v27 = 1.0D;
    Object v28 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v27).doubleValue()));
    ((com.google.javascript.jscomp.ReferenceCollectingCallback)v6).visit(((com.google.javascript.jscomp.NodeTraversal)v23),((com.google.javascript.rhino.Node)v25),((com.google.javascript.rhino.Node)v28));
    Object v29 = null;
    org.junit.Assert.assertNull(v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v4),((com.google.common.base.Predicate)v5));
    Object v7 = "L";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = new java.io.PrintStream(((java.lang.String)v7),((java.nio.charset.Charset)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = "L";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v17 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v15),((com.google.common.base.Predicate)v16));
    Object v18 = "L";
    Object v19 = java.nio.charset.Charset.defaultCharset();
    Object v20 = new java.io.PrintStream(((java.lang.String)v18),((java.nio.charset.Charset)v19));
    Object v21 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v20));
    Object v22 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v21));
    Object v23 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.NodeTraversal.Callback)v17),((com.google.javascript.jscomp.ScopeCreator)v22));
    Object v24 = 1.0D;
    Object v25 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v24).doubleValue()));
    Object v26 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v27 = "*";
    Object v28 = "<";
    Object v29 = com.google.javascript.jscomp.DiagnosticType.warning(((java.lang.String)v27),((java.lang.String)v28));
    Object v30 = new java.lang.String[]{"prototypb","Z}",""};
    Object v31 = ((com.google.javascript.jscomp.NodeTraversal)v23).makeError(((com.google.javascript.rhino.Node)v25),((com.google.javascript.jscomp.CheckLevel)v26),((com.google.javascript.jscomp.DiagnosticType)v29),((java.lang.String[])v30));
    ((com.google.javascript.jscomp.ReferenceCollectingCallback)v6).exitScope(((com.google.javascript.jscomp.NodeTraversal)v23));
    Object v32 = null;
      org.junit.Assert.fail("Expected java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v4),((com.google.common.base.Predicate)v5));
    Object v7 = "L";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = new java.io.PrintStream(((java.lang.String)v7),((java.nio.charset.Charset)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = "L";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v17 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v15),((com.google.common.base.Predicate)v16));
    Object v18 = "L";
    Object v19 = java.nio.charset.Charset.defaultCharset();
    Object v20 = new java.io.PrintStream(((java.lang.String)v18),((java.nio.charset.Charset)v19));
    Object v21 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v20));
    Object v22 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v21));
    Object v23 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.NodeTraversal.Callback)v17),((com.google.javascript.jscomp.ScopeCreator)v22));
    Object v24 = 1.0D;
    Object v25 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v24).doubleValue()));
    Object v26 = "*";
    Object v27 = "<";
    Object v28 = com.google.javascript.jscomp.DiagnosticType.warning(((java.lang.String)v26),((java.lang.String)v27));
    Object v29 = new java.lang.String[]{"p","W"};
    Object v30 = ((com.google.javascript.jscomp.NodeTraversal)v23).makeError(((com.google.javascript.rhino.Node)v25),((com.google.javascript.jscomp.DiagnosticType)v28),((java.lang.String[])v29));
    Object v31 = 1.0D;
    Object v32 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v31).doubleValue()));
    Object v33 = 1.0D;
    Object v34 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v33).doubleValue()));
    Object v35 = ((com.google.javascript.jscomp.ReferenceCollectingCallback)v6).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v23),((com.google.javascript.rhino.Node)v32),((com.google.javascript.rhino.Node)v34));
    org.junit.Assert.assertEquals((Object)(true), v35);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v4),((com.google.common.base.Predicate)v5));
    Object v7 = "L";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = new java.io.PrintStream(((java.lang.String)v7),((java.nio.charset.Charset)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = "L";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v17 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v15),((com.google.common.base.Predicate)v16));
    Object v18 = "L";
    Object v19 = java.nio.charset.Charset.defaultCharset();
    Object v20 = new java.io.PrintStream(((java.lang.String)v18),((java.nio.charset.Charset)v19));
    Object v21 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v20));
    Object v22 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v21));
    Object v23 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.NodeTraversal.Callback)v17),((com.google.javascript.jscomp.ScopeCreator)v22));
    Object v24 = 1.0D;
    Object v25 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v24).doubleValue()));
    Object v26 = 1.0D;
    Object v27 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v26).doubleValue()));
    Object v28 = 1.0D;
    Object v29 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v28).doubleValue()));
    Object v30 = ((com.google.javascript.rhino.Node)v27).checkTreeTypeAwareEqualsSilent(((com.google.javascript.rhino.Node)v29));
    ((com.google.javascript.jscomp.ReferenceCollectingCallback)v6).visit(((com.google.javascript.jscomp.NodeTraversal)v23),((com.google.javascript.rhino.Node)v25),((com.google.javascript.rhino.Node)v27));
    Object v31 = null;
    org.junit.Assert.assertNull(v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v4),((com.google.common.base.Predicate)v5));
    Object v7 = 1.0D;
    Object v8 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()));
    Object v9 = java.util.List.of();
    Object v10 = new java.util.TreeSet(((java.util.Collection)v9));
    ((com.google.javascript.rhino.Node)v8).setDirectives(((java.util.Set)v10));
    Object v11 = null;
    Object v12 = 1.0D;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v12).doubleValue()));
    ((com.google.javascript.jscomp.ReferenceCollectingCallback)v6).process(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v4),((com.google.common.base.Predicate)v5));
    Object v7 = "L";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = new java.io.PrintStream(((java.lang.String)v7),((java.nio.charset.Charset)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = "L";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v17 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v15),((com.google.common.base.Predicate)v16));
    Object v18 = "L";
    Object v19 = java.nio.charset.Charset.defaultCharset();
    Object v20 = new java.io.PrintStream(((java.lang.String)v18),((java.nio.charset.Charset)v19));
    Object v21 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v20));
    Object v22 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v21));
    Object v23 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.NodeTraversal.Callback)v17),((com.google.javascript.jscomp.ScopeCreator)v22));
    Object v24 = 1.0D;
    Object v25 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v24).doubleValue()));
    Object v26 = ((com.google.javascript.rhino.Node)v25).removeChildren();
    Object v27 = 1.0D;
    Object v28 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v27).doubleValue()));
    Object v29 = 1.0D;
    Object v30 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v29).doubleValue()));
    Object v31 = ((com.google.javascript.rhino.Node)v28).copyInformationFromForTree(((com.google.javascript.rhino.Node)v30));
    ((com.google.javascript.jscomp.ReferenceCollectingCallback)v6).visit(((com.google.javascript.jscomp.NodeTraversal)v23),((com.google.javascript.rhino.Node)v25),((com.google.javascript.rhino.Node)v28));
    Object v32 = null;
    org.junit.Assert.assertNull(v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v4),((com.google.common.base.Predicate)v5));
    Object v7 = "L";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = new java.io.PrintStream(((java.lang.String)v7),((java.nio.charset.Charset)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = "L";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v17 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v15),((com.google.common.base.Predicate)v16));
    Object v18 = "L";
    Object v19 = java.nio.charset.Charset.defaultCharset();
    Object v20 = new java.io.PrintStream(((java.lang.String)v18),((java.nio.charset.Charset)v19));
    Object v21 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v20));
    Object v22 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v21));
    Object v23 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.NodeTraversal.Callback)v17),((com.google.javascript.jscomp.ScopeCreator)v22));
    Object v24 = 1.0D;
    Object v25 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v24).doubleValue()));
    Object v26 = java.util.List.of();
    Object v27 = new java.util.TreeSet(((java.util.Collection)v26));
    ((com.google.javascript.rhino.Node)v25).setDirectives(((java.util.Set)v27));
    Object v28 = null;
    Object v29 = 1.0D;
    Object v30 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v29).doubleValue()));
    ((com.google.javascript.jscomp.ReferenceCollectingCallback)v6).visit(((com.google.javascript.jscomp.NodeTraversal)v23),((com.google.javascript.rhino.Node)v25),((com.google.javascript.rhino.Node)v30));
    Object v31 = null;
    org.junit.Assert.assertNull(v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v4),((com.google.common.base.Predicate)v5));
    Object v7 = "L";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = new java.io.PrintStream(((java.lang.String)v7),((java.nio.charset.Charset)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = "L";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v17 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v15),((com.google.common.base.Predicate)v16));
    Object v18 = "L";
    Object v19 = java.nio.charset.Charset.defaultCharset();
    Object v20 = new java.io.PrintStream(((java.lang.String)v18),((java.nio.charset.Charset)v19));
    Object v21 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v20));
    Object v22 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v21));
    Object v23 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.NodeTraversal.Callback)v17),((com.google.javascript.jscomp.ScopeCreator)v22));
    Object v24 = ((com.google.javascript.jscomp.NodeTraversal)v23).getScope();
    Object v25 = 1.0D;
    Object v26 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v25).doubleValue()));
    Object v27 = 1.0D;
    Object v28 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v27).doubleValue()));
    Object v29 = new com.google.javascript.rhino.JSDocInfo();
    ((com.google.javascript.rhino.Node)v28).setJSDocInfo(((com.google.javascript.rhino.JSDocInfo)v29));
    Object v30 = null;
    Object v31 = ((com.google.javascript.jscomp.ReferenceCollectingCallback)v6).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v23),((com.google.javascript.rhino.Node)v26),((com.google.javascript.rhino.Node)v28));
    org.junit.Assert.assertEquals((Object)(true), v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v4),((com.google.common.base.Predicate)v5));
    Object v7 = "L";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = new java.io.PrintStream(((java.lang.String)v7),((java.nio.charset.Charset)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = "L";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v17 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v15),((com.google.common.base.Predicate)v16));
    Object v18 = "L";
    Object v19 = java.nio.charset.Charset.defaultCharset();
    Object v20 = new java.io.PrintStream(((java.lang.String)v18),((java.nio.charset.Charset)v19));
    Object v21 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v20));
    Object v22 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v21));
    Object v23 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.NodeTraversal.Callback)v17),((com.google.javascript.jscomp.ScopeCreator)v22));
    Object v24 = java.util.List.of();
    ((com.google.javascript.jscomp.NodeTraversal)v23).traverseRoots(((java.util.List)v24));
    Object v25 = null;
    Object v26 = 1.0D;
    Object v27 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v26).doubleValue()));
    Object v28 = 1.0D;
    Object v29 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v28).doubleValue()));
    Object v30 = ((com.google.javascript.rhino.Node)v27).checkTreeEqualsSilent(((com.google.javascript.rhino.Node)v29));
    Object v31 = 1.0D;
    Object v32 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v31).doubleValue()));
    Object v33 = 1.0D;
    Object v34 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v33).doubleValue()));
    Object v35 = ((com.google.javascript.rhino.Node)v32).checkTreeEquals(((com.google.javascript.rhino.Node)v34));
    Object v36 = ((com.google.javascript.jscomp.ReferenceCollectingCallback)v6).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v23),((com.google.javascript.rhino.Node)v27),((com.google.javascript.rhino.Node)v32));
    org.junit.Assert.assertEquals((Object)(true), v36);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v4),((com.google.common.base.Predicate)v5));
    Object v7 = "L";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = new java.io.PrintStream(((java.lang.String)v7),((java.nio.charset.Charset)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = "L";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v17 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v15),((com.google.common.base.Predicate)v16));
    Object v18 = "L";
    Object v19 = java.nio.charset.Charset.defaultCharset();
    Object v20 = new java.io.PrintStream(((java.lang.String)v18),((java.nio.charset.Charset)v19));
    Object v21 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v20));
    Object v22 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v21));
    Object v23 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.NodeTraversal.Callback)v17),((com.google.javascript.jscomp.ScopeCreator)v22));
    Object v24 = ((com.google.javascript.jscomp.NodeTraversal)v23).getEnclosingFunction();
    Object v25 = 1.0D;
    Object v26 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v25).doubleValue()));
    Object v27 = true;
    ((com.google.javascript.rhino.Node)v26).setWasEmptyNode((((java.lang.Boolean)v27).booleanValue()));
    Object v28 = null;
    Object v29 = 1.0D;
    Object v30 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v29).doubleValue()));
    Object v31 = ((com.google.javascript.jscomp.ReferenceCollectingCallback)v6).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v23),((com.google.javascript.rhino.Node)v26),((com.google.javascript.rhino.Node)v30));
    org.junit.Assert.assertEquals((Object)(true), v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v4),((com.google.common.base.Predicate)v5));
    Object v7 = "L";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = new java.io.PrintStream(((java.lang.String)v7),((java.nio.charset.Charset)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = "L";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v17 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v15),((com.google.common.base.Predicate)v16));
    Object v18 = "L";
    Object v19 = java.nio.charset.Charset.defaultCharset();
    Object v20 = new java.io.PrintStream(((java.lang.String)v18),((java.nio.charset.Charset)v19));
    Object v21 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v20));
    Object v22 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v21));
    Object v23 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.NodeTraversal.Callback)v17),((com.google.javascript.jscomp.ScopeCreator)v22));
    Object v24 = 1.0D;
    Object v25 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v24).doubleValue()));
    Object v26 = "*";
    Object v27 = "<";
    Object v28 = com.google.javascript.jscomp.DiagnosticType.warning(((java.lang.String)v26),((java.lang.String)v27));
    Object v29 = new java.lang.String[]{"Varia8ble {0} has been deprecated."};
    Object v30 = ((com.google.javascript.jscomp.NodeTraversal)v23).makeError(((com.google.javascript.rhino.Node)v25),((com.google.javascript.jscomp.DiagnosticType)v28),((java.lang.String[])v29));
    Object v31 = 1.0D;
    Object v32 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v31).doubleValue()));
    Object v33 = 1.0D;
    Object v34 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v33).doubleValue()));
    ((com.google.javascript.jscomp.ReferenceCollectingCallback)v6).visit(((com.google.javascript.jscomp.NodeTraversal)v23),((com.google.javascript.rhino.Node)v32),((com.google.javascript.rhino.Node)v34));
    Object v35 = null;
    org.junit.Assert.assertNull(v35);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v4),((com.google.common.base.Predicate)v5));
    Object v7 = "L";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = new java.io.PrintStream(((java.lang.String)v7),((java.nio.charset.Charset)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = "L";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v17 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v15),((com.google.common.base.Predicate)v16));
    Object v18 = "L";
    Object v19 = java.nio.charset.Charset.defaultCharset();
    Object v20 = new java.io.PrintStream(((java.lang.String)v18),((java.nio.charset.Charset)v19));
    Object v21 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v20));
    Object v22 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v21));
    Object v23 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.NodeTraversal.Callback)v17),((com.google.javascript.jscomp.ScopeCreator)v22));
    Object v24 = 1.0D;
    Object v25 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v24).doubleValue()));
    Object v26 = ((com.google.javascript.rhino.Node)v25).isUnscopedQualifiedName();
    Object v27 = 1.0D;
    Object v28 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v27).doubleValue()));
    Object v29 = ((com.google.javascript.jscomp.ReferenceCollectingCallback)v6).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v23),((com.google.javascript.rhino.Node)v25),((com.google.javascript.rhino.Node)v28));
    org.junit.Assert.assertEquals((Object)(true), v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v4),((com.google.common.base.Predicate)v5));
    Object v7 = "L";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = new java.io.PrintStream(((java.lang.String)v7),((java.nio.charset.Charset)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = "L";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v17 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v15),((com.google.common.base.Predicate)v16));
    Object v18 = "L";
    Object v19 = java.nio.charset.Charset.defaultCharset();
    Object v20 = new java.io.PrintStream(((java.lang.String)v18),((java.nio.charset.Charset)v19));
    Object v21 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v20));
    Object v22 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v21));
    Object v23 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.NodeTraversal.Callback)v17),((com.google.javascript.jscomp.ScopeCreator)v22));
    Object v24 = 1.0D;
    Object v25 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v24).doubleValue()));
    Object v26 = ((com.google.javascript.rhino.Node)v25).siblings();
    Object v27 = 1.0D;
    Object v28 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v27).doubleValue()));
    Object v29 = ((com.google.javascript.rhino.Node)v28).getDouble();
    Object v30 = ((com.google.javascript.jscomp.ReferenceCollectingCallback)v6).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v23),((com.google.javascript.rhino.Node)v25),((com.google.javascript.rhino.Node)v28));
    org.junit.Assert.assertEquals((Object)(true), v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v4),((com.google.common.base.Predicate)v5));
    Object v7 = "L";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = new java.io.PrintStream(((java.lang.String)v7),((java.nio.charset.Charset)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = "L";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v17 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v15),((com.google.common.base.Predicate)v16));
    Object v18 = "L";
    Object v19 = java.nio.charset.Charset.defaultCharset();
    Object v20 = new java.io.PrintStream(((java.lang.String)v18),((java.nio.charset.Charset)v19));
    Object v21 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v20));
    Object v22 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v21));
    Object v23 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.NodeTraversal.Callback)v17),((com.google.javascript.jscomp.ScopeCreator)v22));
    Object v24 = 1.0D;
    Object v25 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v24).doubleValue()));
    Object v26 = 1.0D;
    Object v27 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v26).doubleValue()));
    ((com.google.javascript.rhino.Node)v25).addChildrenToBack(((com.google.javascript.rhino.Node)v27));
    Object v28 = null;
    Object v29 = 1.0D;
    Object v30 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v29).doubleValue()));
    Object v31 = -4.81494124244534D;
    ((com.google.javascript.rhino.Node)v30).setDouble((((java.lang.Double)v31).doubleValue()));
    Object v32 = null;
    ((com.google.javascript.jscomp.ReferenceCollectingCallback)v6).visit(((com.google.javascript.jscomp.NodeTraversal)v23),((com.google.javascript.rhino.Node)v25),((com.google.javascript.rhino.Node)v30));
    Object v33 = null;
    org.junit.Assert.assertNull(v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v4),((com.google.common.base.Predicate)v5));
    Object v7 = "L";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = new java.io.PrintStream(((java.lang.String)v7),((java.nio.charset.Charset)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = "L";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v17 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v15),((com.google.common.base.Predicate)v16));
    Object v18 = "L";
    Object v19 = java.nio.charset.Charset.defaultCharset();
    Object v20 = new java.io.PrintStream(((java.lang.String)v18),((java.nio.charset.Charset)v19));
    Object v21 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v20));
    Object v22 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v21));
    Object v23 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.NodeTraversal.Callback)v17),((com.google.javascript.jscomp.ScopeCreator)v22));
    Object v24 = ((com.google.javascript.jscomp.NodeTraversal)v23).getEnclosingFunction();
    Object v25 = 1.0D;
    Object v26 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v25).doubleValue()));
    Object v27 = true;
    ((com.google.javascript.rhino.Node)v26).setWasEmptyNode((((java.lang.Boolean)v27).booleanValue()));
    Object v28 = null;
    Object v29 = 1.0D;
    Object v30 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v29).doubleValue()));
    ((com.google.javascript.jscomp.ReferenceCollectingCallback)v6).visit(((com.google.javascript.jscomp.NodeTraversal)v23),((com.google.javascript.rhino.Node)v26),((com.google.javascript.rhino.Node)v30));
    Object v31 = null;
    org.junit.Assert.assertNull(v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v4),((com.google.common.base.Predicate)v5));
    Object v7 = "L";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = new java.io.PrintStream(((java.lang.String)v7),((java.nio.charset.Charset)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = "L";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v17 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v15),((com.google.common.base.Predicate)v16));
    Object v18 = "L";
    Object v19 = java.nio.charset.Charset.defaultCharset();
    Object v20 = new java.io.PrintStream(((java.lang.String)v18),((java.nio.charset.Charset)v19));
    Object v21 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v20));
    Object v22 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v21));
    Object v23 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.NodeTraversal.Callback)v17),((com.google.javascript.jscomp.ScopeCreator)v22));
    Object v24 = 1.0D;
    Object v25 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v24).doubleValue()));
    Object v26 = 1.0D;
    Object v27 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v26).doubleValue()));
    Object v28 = ((com.google.javascript.rhino.Node)v27).getAncestors();
    ((com.google.javascript.jscomp.ReferenceCollectingCallback)v6).visit(((com.google.javascript.jscomp.NodeTraversal)v23),((com.google.javascript.rhino.Node)v25),((com.google.javascript.rhino.Node)v27));
    Object v29 = null;
    org.junit.Assert.assertNull(v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v4),((com.google.common.base.Predicate)v5));
    Object v7 = null;
    Object v8 = ((com.google.javascript.jscomp.ReferenceCollectingCallback)v6).getReferenceCollection(((com.google.javascript.jscomp.Scope.Var)v7));
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v4),((com.google.common.base.Predicate)v5));
    Object v7 = "L";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = new java.io.PrintStream(((java.lang.String)v7),((java.nio.charset.Charset)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = "L";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v17 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v15),((com.google.common.base.Predicate)v16));
    Object v18 = "L";
    Object v19 = java.nio.charset.Charset.defaultCharset();
    Object v20 = new java.io.PrintStream(((java.lang.String)v18),((java.nio.charset.Charset)v19));
    Object v21 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v20));
    Object v22 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v21));
    Object v23 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.NodeTraversal.Callback)v17),((com.google.javascript.jscomp.ScopeCreator)v22));
    Object v24 = 1.0D;
    Object v25 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v24).doubleValue()));
    Object v26 = ((com.google.javascript.rhino.Node)v25).getQualifiedName();
    Object v27 = 1.0D;
    Object v28 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v27).doubleValue()));
    Object v29 = ((com.google.javascript.jscomp.ReferenceCollectingCallback)v6).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v23),((com.google.javascript.rhino.Node)v25),((com.google.javascript.rhino.Node)v28));
    org.junit.Assert.assertEquals((Object)(true), v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v4),((com.google.common.base.Predicate)v5));
    Object v7 = "L";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = new java.io.PrintStream(((java.lang.String)v7),((java.nio.charset.Charset)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = "L";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v17 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v15),((com.google.common.base.Predicate)v16));
    Object v18 = "L";
    Object v19 = java.nio.charset.Charset.defaultCharset();
    Object v20 = new java.io.PrintStream(((java.lang.String)v18),((java.nio.charset.Charset)v19));
    Object v21 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v20));
    Object v22 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v21));
    Object v23 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.NodeTraversal.Callback)v17),((com.google.javascript.jscomp.ScopeCreator)v22));
    Object v24 = 1.0D;
    Object v25 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v24).doubleValue()));
    Object v26 = 1.0D;
    Object v27 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v26).doubleValue()));
    Object v28 = ((com.google.javascript.rhino.Node)v27).isQualifiedName();
    ((com.google.javascript.jscomp.ReferenceCollectingCallback)v6).visit(((com.google.javascript.jscomp.NodeTraversal)v23),((com.google.javascript.rhino.Node)v25),((com.google.javascript.rhino.Node)v27));
    Object v29 = null;
    org.junit.Assert.assertNull(v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v4),((com.google.common.base.Predicate)v5));
    Object v7 = "L";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = new java.io.PrintStream(((java.lang.String)v7),((java.nio.charset.Charset)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = "L";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
    Object v17 = new com.google.javascript.jscomp.ReferenceCollectingCallback(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)v15),((com.google.common.base.Predicate)v16));
    Object v18 = "L";
    Object v19 = java.nio.charset.Charset.defaultCharset();
    Object v20 = new java.io.PrintStream(((java.lang.String)v18),((java.nio.charset.Charset)v19));
    Object v21 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v20));
    Object v22 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v21));
    Object v23 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.NodeTraversal.Callback)v17),((com.google.javascript.jscomp.ScopeCreator)v22));
    Object v24 = 1.0D;
    Object v25 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v24).doubleValue()));
    Object v26 = "*";
    Object v27 = "<";
    Object v28 = com.google.javascript.jscomp.DiagnosticType.warning(((java.lang.String)v26),((java.lang.String)v27));
    Object v29 = new java.lang.String[]{" [s"};
    Object v30 = ((com.google.javascript.jscomp.NodeTraversal)v23).makeError(((com.google.javascript.rhino.Node)v25),((com.google.javascript.jscomp.DiagnosticType)v28),((java.lang.String[])v29));
    ((com.google.javascript.jscomp.ReferenceCollectingCallback)v6).enterScope(((com.google.javascript.jscomp.NodeTraversal)v23));
    Object v31 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }
}
