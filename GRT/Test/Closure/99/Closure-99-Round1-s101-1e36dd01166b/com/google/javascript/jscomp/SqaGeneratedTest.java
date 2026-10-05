package com.google.javascript.jscomp;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v2 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v6 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.CheckLevel)v5));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = 1;
    Object v9 = "}";
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v8).intValue()),((java.lang.String)v9));
    Object v11 = 1;
    Object v12 = "}";
    Object v13 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v11).intValue()),((java.lang.String)v12));
    ((com.google.javascript.jscomp.CheckGlobalThis)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v2 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v6 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.CheckLevel)v5));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = 1;
    Object v9 = "}";
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v8).intValue()),((java.lang.String)v9));
    Object v11 = ((com.google.javascript.rhino.Node)v10).removeFirstChild();
    Object v12 = 1;
    Object v13 = "}";
    Object v14 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v12).intValue()),((java.lang.String)v13));
    Object v15 = ((com.google.javascript.jscomp.CheckGlobalThis)v2).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v14));
    org.junit.Assert.assertEquals((Object)(true), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v2 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v6 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.CheckLevel)v5));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = 1;
    Object v9 = "}";
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v8).intValue()),((java.lang.String)v9));
    Object v11 = 1;
    Object v12 = "}";
    Object v13 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v11).intValue()),((java.lang.String)v12));
    Object v14 = ((com.google.javascript.jscomp.CheckGlobalThis)v2).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v13));
    Object v15 = new com.google.javascript.jscomp.Compiler();
    Object v16 = new com.google.javascript.jscomp.Compiler();
    Object v17 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v18 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v16),((com.google.javascript.jscomp.CheckLevel)v17));
    Object v19 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v15),((com.google.javascript.jscomp.NodeTraversal.Callback)v18));
    Object v20 = 1;
    Object v21 = "}";
    Object v22 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v20).intValue()),((java.lang.String)v21));
    Object v23 = 1;
    Object v24 = "}";
    Object v25 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v23).intValue()),((java.lang.String)v24));
    Object v26 = ((com.google.javascript.jscomp.CheckGlobalThis)v2).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v19),((com.google.javascript.rhino.Node)v22),((com.google.javascript.rhino.Node)v25));
    org.junit.Assert.assertEquals((Object)(true), v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v2 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v6 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.CheckLevel)v5));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = 1;
    Object v9 = "}";
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v8).intValue()),((java.lang.String)v9));
    Object v11 = 1;
    Object v12 = "}";
    Object v13 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v11).intValue()),((java.lang.String)v12));
    ((com.google.javascript.rhino.Node)v10).addChildToBack(((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
    Object v15 = 1;
    Object v16 = "}";
    Object v17 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v15).intValue()),((java.lang.String)v16));
    ((com.google.javascript.jscomp.CheckGlobalThis)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v17));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v2 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v6 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.CheckLevel)v5));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = 1;
    Object v9 = "}";
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v8).intValue()),((java.lang.String)v9));
    Object v11 = 1;
    Object v12 = "}";
    Object v13 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v11).intValue()),((java.lang.String)v12));
    Object v14 = ((com.google.javascript.jscomp.CheckGlobalThis)v2).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v13));
    org.junit.Assert.assertEquals((Object)(true), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v2 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v6 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.CheckLevel)v5));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = 1;
    Object v9 = "}";
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v8).intValue()),((java.lang.String)v9));
    Object v11 = ((com.google.javascript.rhino.Node)v10).toStringTree();
    Object v12 = 1;
    Object v13 = "}";
    Object v14 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v12).intValue()),((java.lang.String)v13));
    Object v15 = ((com.google.javascript.jscomp.CheckGlobalThis)v2).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v14));
    org.junit.Assert.assertEquals((Object)(true), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v2 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v6 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.CheckLevel)v5));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = 1;
    Object v9 = "}";
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v8).intValue()),((java.lang.String)v9));
    Object v11 = 1;
    Object v12 = "}";
    Object v13 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v11).intValue()),((java.lang.String)v12));
    ((com.google.javascript.jscomp.CheckGlobalThis)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
    Object v15 = new com.google.javascript.jscomp.Compiler();
    Object v16 = new com.google.javascript.jscomp.Compiler();
    Object v17 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v18 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v16),((com.google.javascript.jscomp.CheckLevel)v17));
    Object v19 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v15),((com.google.javascript.jscomp.NodeTraversal.Callback)v18));
    Object v20 = 1;
    Object v21 = "}";
    Object v22 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v20).intValue()),((java.lang.String)v21));
    Object v23 = 1;
    Object v24 = "}";
    Object v25 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v23).intValue()),((java.lang.String)v24));
    ((com.google.javascript.jscomp.CheckGlobalThis)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v19),((com.google.javascript.rhino.Node)v22),((com.google.javascript.rhino.Node)v25));
    Object v26 = null;
    org.junit.Assert.assertNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v2 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v6 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.CheckLevel)v5));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = 1;
    Object v9 = "}";
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v8).intValue()),((java.lang.String)v9));
    Object v11 = 1;
    Object v12 = "}";
    Object v13 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v11).intValue()),((java.lang.String)v12));
    Object v14 = ((com.google.javascript.jscomp.CheckGlobalThis)v2).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v13));
    Object v15 = new com.google.javascript.jscomp.Compiler();
    Object v16 = new com.google.javascript.jscomp.Compiler();
    Object v17 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v18 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v16),((com.google.javascript.jscomp.CheckLevel)v17));
    Object v19 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v15),((com.google.javascript.jscomp.NodeTraversal.Callback)v18));
    Object v20 = 1;
    Object v21 = "}";
    Object v22 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v20).intValue()),((java.lang.String)v21));
    Object v23 = 1;
    Object v24 = "}";
    Object v25 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v23).intValue()),((java.lang.String)v24));
    Object v26 = ((com.google.javascript.rhino.Node)v22).checkTreeEquals(((com.google.javascript.rhino.Node)v25));
    Object v27 = 1;
    Object v28 = "}";
    Object v29 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v27).intValue()),((java.lang.String)v28));
    ((com.google.javascript.jscomp.CheckGlobalThis)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v19),((com.google.javascript.rhino.Node)v22),((com.google.javascript.rhino.Node)v29));
    Object v30 = null;
    org.junit.Assert.assertNull(v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v2 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v6 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.CheckLevel)v5));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = 1;
    Object v9 = "}";
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v8).intValue()),((java.lang.String)v9));
    Object v11 = 1;
    Object v12 = "}";
    Object v13 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v11).intValue()),((java.lang.String)v12));
    Object v14 = ((com.google.javascript.rhino.Node)v13).isUnscopedQualifiedName();
    ((com.google.javascript.jscomp.CheckGlobalThis)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v13));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v2 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v6 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.CheckLevel)v5));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = 1;
    Object v9 = "}";
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v8).intValue()),((java.lang.String)v9));
    Object v11 = 1;
    Object v12 = "}";
    Object v13 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v11).intValue()),((java.lang.String)v12));
    Object v14 = ((com.google.javascript.rhino.Node)v13).getJsDocBuilderForNode();
    Object v15 = ((com.google.javascript.jscomp.CheckGlobalThis)v2).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v13));
    org.junit.Assert.assertEquals((Object)(true), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v2 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v6 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.CheckLevel)v5));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = ((com.google.javascript.jscomp.NodeTraversal)v7).getEnclosingFunction();
    Object v9 = 1;
    Object v10 = "}";
    Object v11 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v9).intValue()),((java.lang.String)v10));
    Object v12 = 1;
    Object v13 = "}";
    Object v14 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v12).intValue()),((java.lang.String)v13));
    ((com.google.javascript.jscomp.CheckGlobalThis)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v14));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v2 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v6 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.CheckLevel)v5));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = 1;
    Object v9 = "}";
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v8).intValue()),((java.lang.String)v9));
    Object v11 = 1;
    Object v12 = "}";
    Object v13 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v11).intValue()),((java.lang.String)v12));
    ((com.google.javascript.jscomp.CheckGlobalThis)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
    Object v15 = new com.google.javascript.jscomp.Compiler();
    Object v16 = new com.google.javascript.jscomp.Compiler();
    Object v17 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v18 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v16),((com.google.javascript.jscomp.CheckLevel)v17));
    Object v19 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v15),((com.google.javascript.jscomp.NodeTraversal.Callback)v18));
    Object v20 = 1;
    Object v21 = "}";
    Object v22 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v20).intValue()),((java.lang.String)v21));
    Object v23 = ((com.google.javascript.rhino.Node)v22).getAncestors();
    Object v24 = 1;
    Object v25 = "}";
    Object v26 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v24).intValue()),((java.lang.String)v25));
    Object v27 = ((com.google.javascript.jscomp.CheckGlobalThis)v2).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v19),((com.google.javascript.rhino.Node)v22),((com.google.javascript.rhino.Node)v26));
    org.junit.Assert.assertEquals((Object)(true), v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v2 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v6 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.CheckLevel)v5));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = 1;
    Object v9 = "}";
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v8).intValue()),((java.lang.String)v9));
    Object v11 = 1;
    Object v12 = "}";
    Object v13 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v11).intValue()),((java.lang.String)v12));
    ((com.google.javascript.jscomp.CheckGlobalThis)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
    Object v15 = new com.google.javascript.jscomp.Compiler();
    Object v16 = new com.google.javascript.jscomp.Compiler();
    Object v17 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v18 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v16),((com.google.javascript.jscomp.CheckLevel)v17));
    Object v19 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v15),((com.google.javascript.jscomp.NodeTraversal.Callback)v18));
    Object v20 = 1;
    Object v21 = "}";
    Object v22 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v20).intValue()),((java.lang.String)v21));
    Object v23 = 1;
    Object v24 = "}";
    Object v25 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v23).intValue()),((java.lang.String)v24));
    Object v26 = ((com.google.javascript.jscomp.CheckGlobalThis)v2).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v19),((com.google.javascript.rhino.Node)v22),((com.google.javascript.rhino.Node)v25));
    org.junit.Assert.assertEquals((Object)(true), v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v2 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v6 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.CheckLevel)v5));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = 1;
    Object v9 = "}";
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v8).intValue()),((java.lang.String)v9));
    Object v11 = 1;
    Object v12 = "}";
    Object v13 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v11).intValue()),((java.lang.String)v12));
    Object v14 = ((com.google.javascript.jscomp.CheckGlobalThis)v2).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v13));
    Object v15 = new com.google.javascript.jscomp.Compiler();
    Object v16 = new com.google.javascript.jscomp.Compiler();
    Object v17 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v18 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v16),((com.google.javascript.jscomp.CheckLevel)v17));
    Object v19 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v15),((com.google.javascript.jscomp.NodeTraversal.Callback)v18));
    Object v20 = 1;
    Object v21 = "}";
    Object v22 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v20).intValue()),((java.lang.String)v21));
    Object v23 = 1;
    Object v24 = "}";
    Object v25 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v23).intValue()),((java.lang.String)v24));
    ((com.google.javascript.jscomp.CheckGlobalThis)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v19),((com.google.javascript.rhino.Node)v22),((com.google.javascript.rhino.Node)v25));
    Object v26 = null;
    org.junit.Assert.assertNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v3 = ((java.lang.Enum)v2).hashCode();
    Object v4 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v2));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v3 = ((java.lang.Enum)v2).hashCode();
    Object v4 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v2));
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v8 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.CheckLevel)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.NodeTraversal.Callback)v8));
    Object v10 = 1;
    Object v11 = "}";
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    Object v13 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v14 = "shor";
    Object v15 = "s";
    Object v16 = com.google.javascript.jscomp.DiagnosticType.error(((java.lang.String)v14),((java.lang.String)v15));
    Object v17 = new java.lang.String[]{};
    Object v18 = ((com.google.javascript.jscomp.NodeTraversal)v9).makeError(((com.google.javascript.rhino.Node)v12),((com.google.javascript.jscomp.CheckLevel)v13),((com.google.javascript.jscomp.DiagnosticType)v16),((java.lang.String[])v17));
    Object v19 = 1;
    Object v20 = "}";
    Object v21 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v19).intValue()),((java.lang.String)v20));
    Object v22 = 1;
    Object v23 = "}";
    Object v24 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v22).intValue()),((java.lang.String)v23));
    ((com.google.javascript.jscomp.CheckGlobalThis)v4).visit(((com.google.javascript.jscomp.NodeTraversal)v9),((com.google.javascript.rhino.Node)v21),((com.google.javascript.rhino.Node)v24));
    Object v25 = null;
    org.junit.Assert.assertNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v3 = ((java.lang.Enum)v2).hashCode();
    Object v4 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v2));
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v8 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.CheckLevel)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.NodeTraversal.Callback)v8));
    Object v10 = 1;
    Object v11 = "}";
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    Object v13 = 1;
    Object v14 = "}";
    Object v15 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v13).intValue()),((java.lang.String)v14));
    ((com.google.javascript.jscomp.CheckGlobalThis)v4).visit(((com.google.javascript.jscomp.NodeTraversal)v9),((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v3 = ((java.lang.Enum)v2).hashCode();
    Object v4 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v2));
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v8 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.CheckLevel)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.NodeTraversal.Callback)v8));
    Object v10 = 1;
    Object v11 = "}";
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    Object v13 = 1;
    Object v14 = "}";
    Object v15 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v13).intValue()),((java.lang.String)v14));
    Object v16 = ((com.google.javascript.jscomp.CheckGlobalThis)v4).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v9),((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v15));
    org.junit.Assert.assertEquals((Object)(true), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v3 = ((java.lang.Enum)v2).hashCode();
    Object v4 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v2));
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v8 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.CheckLevel)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.NodeTraversal.Callback)v8));
    Object v10 = 1;
    Object v11 = "}";
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    Object v13 = ((com.google.javascript.rhino.Node)v12).toStringTree();
    Object v14 = 1;
    Object v15 = "}";
    Object v16 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v14).intValue()),((java.lang.String)v15));
    ((com.google.javascript.rhino.Node)v16).setQuotedString();
    Object v17 = null;
    ((com.google.javascript.jscomp.CheckGlobalThis)v4).visit(((com.google.javascript.jscomp.NodeTraversal)v9),((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v16));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v3 = ((java.lang.Enum)v2).hashCode();
    Object v4 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v2));
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v8 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.CheckLevel)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.NodeTraversal.Callback)v8));
    Object v10 = 1;
    Object v11 = "}";
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    Object v13 = "shor";
    Object v14 = "s";
    Object v15 = com.google.javascript.jscomp.DiagnosticType.error(((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = new java.lang.String[]{"arguments","sTetUTCMilliseconds","Y"};
    Object v17 = ((com.google.javascript.jscomp.NodeTraversal)v9).makeError(((com.google.javascript.rhino.Node)v12),((com.google.javascript.jscomp.DiagnosticType)v15),((java.lang.String[])v16));
    Object v18 = 1;
    Object v19 = "}";
    Object v20 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v18).intValue()),((java.lang.String)v19));
    Object v21 = 1;
    Object v22 = "}";
    Object v23 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v21).intValue()),((java.lang.String)v22));
    Object v24 = ((com.google.javascript.jscomp.CheckGlobalThis)v4).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v9),((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.Node)v23));
    org.junit.Assert.assertEquals((Object)(true), v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v3 = ((java.lang.Enum)v2).hashCode();
    Object v4 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v2));
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v8 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.CheckLevel)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.NodeTraversal.Callback)v8));
    Object v10 = 1;
    Object v11 = "}";
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    Object v13 = 20;
    ((com.google.javascript.rhino.Node)v12).setCharno((((java.lang.Integer)v13).intValue()));
    Object v14 = null;
    Object v15 = 1;
    Object v16 = "}";
    Object v17 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v15).intValue()),((java.lang.String)v16));
    Object v18 = ((com.google.javascript.jscomp.CheckGlobalThis)v4).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v9),((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v17));
    org.junit.Assert.assertEquals((Object)(true), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v2 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v6 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.CheckLevel)v5));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = 1;
    Object v9 = "}";
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v8).intValue()),((java.lang.String)v9));
    Object v11 = "shor";
    Object v12 = "s";
    Object v13 = com.google.javascript.jscomp.DiagnosticType.error(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = new java.lang.String[]{"a"};
    Object v15 = ((com.google.javascript.jscomp.NodeTraversal)v7).makeError(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.DiagnosticType)v13),((java.lang.String[])v14));
    Object v16 = 1;
    Object v17 = "}";
    Object v18 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v16).intValue()),((java.lang.String)v17));
    Object v19 = 1;
    Object v20 = "}";
    Object v21 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v19).intValue()),((java.lang.String)v20));
    Object v22 = ((com.google.javascript.jscomp.CheckGlobalThis)v2).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v18),((com.google.javascript.rhino.Node)v21));
    org.junit.Assert.assertEquals((Object)(true), v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v3 = ((java.lang.Enum)v2).hashCode();
    Object v4 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v2));
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v8 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.CheckLevel)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.NodeTraversal.Callback)v8));
    Object v10 = 1;
    Object v11 = "}";
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    Object v13 = 1;
    Object v14 = "}";
    Object v15 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v13).intValue()),((java.lang.String)v14));
    Object v16 = 3;
    ((com.google.javascript.rhino.Node)v15).setCharno((((java.lang.Integer)v16).intValue()));
    Object v17 = null;
    Object v18 = ((com.google.javascript.jscomp.CheckGlobalThis)v4).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v9),((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v15));
    org.junit.Assert.assertEquals((Object)(true), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v3 = ((java.lang.Enum)v2).hashCode();
    Object v4 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v2));
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v8 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.CheckLevel)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.NodeTraversal.Callback)v8));
    Object v10 = 1;
    Object v11 = "}";
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    Object v13 = 1;
    Object v14 = "}";
    Object v15 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v13).intValue()),((java.lang.String)v14));
    Object v16 = ((com.google.javascript.jscomp.CheckGlobalThis)v4).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v9),((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler();
    Object v18 = new com.google.javascript.jscomp.Compiler();
    Object v19 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v20 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v18),((com.google.javascript.jscomp.CheckLevel)v19));
    Object v21 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v17),((com.google.javascript.jscomp.NodeTraversal.Callback)v20));
    Object v22 = 1;
    Object v23 = "}";
    Object v24 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v22).intValue()),((java.lang.String)v23));
    Object v25 = 1;
    Object v26 = "}";
    Object v27 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v25).intValue()),((java.lang.String)v26));
    ((com.google.javascript.jscomp.CheckGlobalThis)v4).visit(((com.google.javascript.jscomp.NodeTraversal)v21),((com.google.javascript.rhino.Node)v24),((com.google.javascript.rhino.Node)v27));
    Object v28 = null;
    org.junit.Assert.assertNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v3 = ((java.lang.Enum)v2).hashCode();
    Object v4 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v2));
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v8 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.CheckLevel)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.NodeTraversal.Callback)v8));
    Object v10 = 1;
    Object v11 = "}";
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    Object v13 = 1;
    Object v14 = "}";
    Object v15 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v13).intValue()),((java.lang.String)v14));
    ((com.google.javascript.rhino.Node)v12).addChildrenToFront(((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
    Object v17 = 1;
    Object v18 = "}";
    Object v19 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v17).intValue()),((java.lang.String)v18));
    Object v20 = ((com.google.javascript.jscomp.CheckGlobalThis)v4).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v9),((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v19));
    org.junit.Assert.assertEquals((Object)(true), v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v2 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v6 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.CheckLevel)v5));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = ((com.google.javascript.jscomp.NodeTraversal)v7).hasScope();
    Object v9 = 1;
    Object v10 = "}";
    Object v11 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v9).intValue()),((java.lang.String)v10));
    Object v12 = 1;
    Object v13 = "}";
    Object v14 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v12).intValue()),((java.lang.String)v13));
    ((com.google.javascript.jscomp.CheckGlobalThis)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v14));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v3 = ((java.lang.Enum)v2).hashCode();
    Object v4 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v2));
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v8 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.CheckLevel)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.NodeTraversal.Callback)v8));
    Object v10 = 1;
    Object v11 = "}";
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    Object v13 = 1;
    Object v14 = "}";
    Object v15 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v13).intValue()),((java.lang.String)v14));
    Object v16 = ((com.google.javascript.rhino.Node)v15).siblings();
    Object v17 = ((com.google.javascript.jscomp.CheckGlobalThis)v4).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v9),((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v15));
    org.junit.Assert.assertEquals((Object)(true), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v2 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v6 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.CheckLevel)v5));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = 1;
    Object v9 = "}";
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v8).intValue()),((java.lang.String)v9));
    ((com.google.javascript.jscomp.NodeTraversal)v7).traverse(((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
    Object v12 = 1;
    Object v13 = "}";
    Object v14 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v12).intValue()),((java.lang.String)v13));
    Object v15 = 1;
    Object v16 = "}";
    Object v17 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v15).intValue()),((java.lang.String)v16));
    Object v18 = ((com.google.javascript.jscomp.CheckGlobalThis)v2).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.Node)v17));
    org.junit.Assert.assertEquals((Object)(true), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v2 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v3 = ((java.lang.Enum)v2).hashCode();
    Object v4 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v2));
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v8 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.CheckLevel)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.NodeTraversal.Callback)v8));
    Object v10 = 1;
    Object v11 = "}";
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    Object v13 = 1;
    Object v14 = "}";
    Object v15 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v13).intValue()),((java.lang.String)v14));
    ((com.google.javascript.jscomp.CheckGlobalThis)v4).visit(((com.google.javascript.jscomp.NodeTraversal)v9),((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
    Object v17 = new com.google.javascript.jscomp.Compiler();
    Object v18 = new com.google.javascript.jscomp.Compiler();
    Object v19 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v20 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v18),((com.google.javascript.jscomp.CheckLevel)v19));
    Object v21 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v17),((com.google.javascript.jscomp.NodeTraversal.Callback)v20));
    Object v22 = 1;
    Object v23 = "}";
    Object v24 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v22).intValue()),((java.lang.String)v23));
    Object v25 = new java.io.StringWriter();
    ((com.google.javascript.rhino.Node)v24).appendStringTree(((java.lang.Appendable)v25));
    Object v26 = null;
    Object v27 = 1;
    Object v28 = "}";
    Object v29 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v27).intValue()),((java.lang.String)v28));
    ((com.google.javascript.jscomp.CheckGlobalThis)v4).visit(((com.google.javascript.jscomp.NodeTraversal)v21),((com.google.javascript.rhino.Node)v24),((com.google.javascript.rhino.Node)v29));
    Object v30 = null;
    org.junit.Assert.assertNull(v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v3 = ((java.lang.Enum)v2).hashCode();
    Object v4 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v2));
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v8 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.CheckLevel)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.NodeTraversal.Callback)v8));
    Object v10 = 1;
    Object v11 = "}";
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    Object v13 = 1;
    Object v14 = "}";
    Object v15 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v13).intValue()),((java.lang.String)v14));
    ((com.google.javascript.rhino.Node)v12).addChildToFront(((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
    Object v17 = 1;
    Object v18 = "}";
    Object v19 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v17).intValue()),((java.lang.String)v18));
    ((com.google.javascript.jscomp.CheckGlobalThis)v4).visit(((com.google.javascript.jscomp.NodeTraversal)v9),((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v19));
    Object v20 = null;
    org.junit.Assert.assertNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v3 = ((java.lang.Enum)v2).hashCode();
    Object v4 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v2));
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v8 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.CheckLevel)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.NodeTraversal.Callback)v8));
    Object v10 = 1;
    Object v11 = "}";
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    Object v13 = 1;
    Object v14 = "}";
    Object v15 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v13).intValue()),((java.lang.String)v14));
    ((com.google.javascript.jscomp.CheckGlobalThis)v4).visit(((com.google.javascript.jscomp.NodeTraversal)v9),((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
    Object v17 = new com.google.javascript.jscomp.Compiler();
    Object v18 = new com.google.javascript.jscomp.Compiler();
    Object v19 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v20 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v18),((com.google.javascript.jscomp.CheckLevel)v19));
    Object v21 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v17),((com.google.javascript.jscomp.NodeTraversal.Callback)v20));
    Object v22 = 1;
    Object v23 = "}";
    Object v24 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v22).intValue()),((java.lang.String)v23));
    Object v25 = 1;
    Object v26 = "}";
    Object v27 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v25).intValue()),((java.lang.String)v26));
    Object v28 = ((com.google.javascript.jscomp.CheckGlobalThis)v4).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v21),((com.google.javascript.rhino.Node)v24),((com.google.javascript.rhino.Node)v27));
    org.junit.Assert.assertEquals((Object)(true), v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v3 = ((java.lang.Enum)v2).hashCode();
    Object v4 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v2));
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v8 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.CheckLevel)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.NodeTraversal.Callback)v8));
    Object v10 = 1;
    Object v11 = "}";
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    Object v13 = 1;
    Object v14 = "}";
    Object v15 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v13).intValue()),((java.lang.String)v14));
    Object v16 = ((com.google.javascript.jscomp.CheckGlobalThis)v4).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v9),((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler();
    Object v18 = new com.google.javascript.jscomp.Compiler();
    Object v19 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v20 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v18),((com.google.javascript.jscomp.CheckLevel)v19));
    Object v21 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v17),((com.google.javascript.jscomp.NodeTraversal.Callback)v20));
    Object v22 = 1;
    Object v23 = "}";
    Object v24 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v22).intValue()),((java.lang.String)v23));
    Object v25 = 1;
    Object v26 = "}";
    Object v27 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v25).intValue()),((java.lang.String)v26));
    Object v28 = ((com.google.javascript.jscomp.CheckGlobalThis)v4).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v21),((com.google.javascript.rhino.Node)v24),((com.google.javascript.rhino.Node)v27));
    org.junit.Assert.assertEquals((Object)(true), v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v2 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v6 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.CheckLevel)v5));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = 1;
    Object v9 = "}";
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v8).intValue()),((java.lang.String)v9));
    Object v11 = 1;
    Object v12 = "}";
    Object v13 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v11).intValue()),((java.lang.String)v12));
    Object v14 = -37;
    Object v15 = 0;
    ((com.google.javascript.rhino.Node)v13).putIntProp((((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v16 = null;
    Object v17 = ((com.google.javascript.jscomp.CheckGlobalThis)v2).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v13));
    org.junit.Assert.assertEquals((Object)(true), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v2 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v6 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.CheckLevel)v5));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = 1;
    Object v9 = "}";
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v8).intValue()),((java.lang.String)v9));
    Object v11 = ((com.google.javascript.rhino.Node)v10).children();
    Object v12 = 1;
    Object v13 = "}";
    Object v14 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v12).intValue()),((java.lang.String)v13));
    Object v15 = ((com.google.javascript.jscomp.CheckGlobalThis)v2).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v14));
    org.junit.Assert.assertEquals((Object)(true), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v3 = ((java.lang.Enum)v2).hashCode();
    Object v4 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v2));
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v8 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.CheckLevel)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.NodeTraversal.Callback)v8));
    Object v10 = 1;
    Object v11 = "}";
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    Object v13 = 1;
    Object v14 = "}";
    Object v15 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v13).intValue()),((java.lang.String)v14));
    Object v16 = ((com.google.javascript.rhino.Node)v15).removeFirstChild();
    Object v17 = ((com.google.javascript.jscomp.CheckGlobalThis)v4).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v9),((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v15));
    org.junit.Assert.assertEquals((Object)(true), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v3 = ((java.lang.Enum)v2).hashCode();
    Object v4 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v2));
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v8 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.CheckLevel)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.NodeTraversal.Callback)v8));
    Object v10 = 1;
    Object v11 = "}";
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    Object v13 = 1;
    Object v14 = "}";
    Object v15 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v13).intValue()),((java.lang.String)v14));
    ((com.google.javascript.rhino.Node)v12).addChildrenToBack(((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
    Object v17 = 1;
    Object v18 = "}";
    Object v19 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v17).intValue()),((java.lang.String)v18));
    Object v20 = ((com.google.javascript.jscomp.CheckGlobalThis)v4).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v9),((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v19));
    org.junit.Assert.assertEquals((Object)(true), v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v3 = ((java.lang.Enum)v2).hashCode();
    Object v4 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v2));
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v8 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.CheckLevel)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.NodeTraversal.Callback)v8));
    Object v10 = 1;
    Object v11 = "}";
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    Object v13 = 1;
    Object v14 = "}";
    Object v15 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v13).intValue()),((java.lang.String)v14));
    ((com.google.javascript.jscomp.CheckGlobalThis)v4).visit(((com.google.javascript.jscomp.NodeTraversal)v9),((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
    Object v17 = new com.google.javascript.jscomp.Compiler();
    Object v18 = new com.google.javascript.jscomp.Compiler();
    Object v19 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v20 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v18),((com.google.javascript.jscomp.CheckLevel)v19));
    Object v21 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v17),((com.google.javascript.jscomp.NodeTraversal.Callback)v20));
    Object v22 = 1;
    Object v23 = "}";
    Object v24 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v22).intValue()),((java.lang.String)v23));
    Object v25 = true;
    ((com.google.javascript.rhino.Node)v24).setOptionalArg((((java.lang.Boolean)v25).booleanValue()));
    Object v26 = null;
    Object v27 = 1;
    Object v28 = "}";
    Object v29 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v27).intValue()),((java.lang.String)v28));
    Object v30 = ((com.google.javascript.jscomp.CheckGlobalThis)v4).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v21),((com.google.javascript.rhino.Node)v24),((com.google.javascript.rhino.Node)v29));
    org.junit.Assert.assertEquals((Object)(true), v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v3 = ((java.lang.Enum)v2).hashCode();
    Object v4 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v2));
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v8 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.CheckLevel)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.NodeTraversal.Callback)v8));
    Object v10 = ((com.google.javascript.jscomp.NodeTraversal)v9).getScope();
    Object v11 = 1;
    Object v12 = "}";
    Object v13 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v11).intValue()),((java.lang.String)v12));
    Object v14 = 1;
    Object v15 = "}";
    Object v16 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v14).intValue()),((java.lang.String)v15));
    ((com.google.javascript.jscomp.CheckGlobalThis)v4).visit(((com.google.javascript.jscomp.NodeTraversal)v9),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v16));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v3 = ((java.lang.Enum)v2).hashCode();
    Object v4 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v2));
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v8 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.CheckLevel)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.NodeTraversal.Callback)v8));
    Object v10 = 1;
    Object v11 = "}";
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    Object v13 = 1;
    Object v14 = "}";
    Object v15 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v13).intValue()),((java.lang.String)v14));
    Object v16 = 1;
    Object v17 = "}";
    Object v18 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v16).intValue()),((java.lang.String)v17));
    Object v19 = 1;
    Object v20 = "}";
    Object v21 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v19).intValue()),((java.lang.String)v20));
    ((com.google.javascript.rhino.Node)v15).addChildAfter(((com.google.javascript.rhino.Node)v18),((com.google.javascript.rhino.Node)v21));
    Object v22 = null;
    Object v23 = ((com.google.javascript.jscomp.CheckGlobalThis)v4).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v9),((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v15));
    org.junit.Assert.assertEquals((Object)(true), v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v3 = ((java.lang.Enum)v2).hashCode();
    Object v4 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v2));
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v8 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.CheckLevel)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.NodeTraversal.Callback)v8));
    Object v10 = 1;
    Object v11 = "}";
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    Object v13 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v14 = "shor";
    Object v15 = "s";
    Object v16 = com.google.javascript.jscomp.DiagnosticType.error(((java.lang.String)v14),((java.lang.String)v15));
    Object v17 = new java.lang.String[]{"{(","","y"};
    Object v18 = ((com.google.javascript.jscomp.NodeTraversal)v9).makeError(((com.google.javascript.rhino.Node)v12),((com.google.javascript.jscomp.CheckLevel)v13),((com.google.javascript.jscomp.DiagnosticType)v16),((java.lang.String[])v17));
    Object v19 = 1;
    Object v20 = "}";
    Object v21 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v19).intValue()),((java.lang.String)v20));
    Object v22 = 1;
    Object v23 = "}";
    Object v24 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v22).intValue()),((java.lang.String)v23));
    ((com.google.javascript.jscomp.CheckGlobalThis)v4).visit(((com.google.javascript.jscomp.NodeTraversal)v9),((com.google.javascript.rhino.Node)v21),((com.google.javascript.rhino.Node)v24));
    Object v25 = null;
    org.junit.Assert.assertNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v2 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v6 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.CheckLevel)v5));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = 1;
    Object v9 = "}";
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v8).intValue()),((java.lang.String)v9));
    Object v11 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v12 = "shor";
    Object v13 = "s";
    Object v14 = com.google.javascript.jscomp.DiagnosticType.error(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = new java.lang.String[]{"\n","eo",")"};
    Object v16 = ((com.google.javascript.jscomp.NodeTraversal)v7).makeError(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.CheckLevel)v11),((com.google.javascript.jscomp.DiagnosticType)v14),((java.lang.String[])v15));
    Object v17 = 1;
    Object v18 = "}";
    Object v19 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v17).intValue()),((java.lang.String)v18));
    Object v20 = 1;
    Object v21 = "}";
    Object v22 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v20).intValue()),((java.lang.String)v21));
    Object v23 = ((com.google.javascript.jscomp.CheckGlobalThis)v2).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v19),((com.google.javascript.rhino.Node)v22));
    org.junit.Assert.assertEquals((Object)(true), v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v3 = ((java.lang.Enum)v2).hashCode();
    Object v4 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v2));
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v8 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.CheckLevel)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.NodeTraversal.Callback)v8));
    Object v10 = 1;
    Object v11 = "}";
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    Object v13 = false;
    ((com.google.javascript.rhino.Node)v12).setIsSyntheticBlock((((java.lang.Boolean)v13).booleanValue()));
    Object v14 = null;
    Object v15 = 1;
    Object v16 = "}";
    Object v17 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v15).intValue()),((java.lang.String)v16));
    Object v18 = ((com.google.javascript.jscomp.CheckGlobalThis)v4).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v9),((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v17));
    org.junit.Assert.assertEquals((Object)(true), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v2 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v6 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.CheckLevel)v5));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = 1;
    Object v9 = "}";
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v8).intValue()),((java.lang.String)v9));
    ((com.google.javascript.jscomp.NodeTraversal)v7).traverse(((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
    Object v12 = 1;
    Object v13 = "}";
    Object v14 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v12).intValue()),((java.lang.String)v13));
    Object v15 = 1;
    Object v16 = "}";
    Object v17 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v15).intValue()),((java.lang.String)v16));
    Object v18 = 1;
    Object v19 = "}";
    Object v20 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v18).intValue()),((java.lang.String)v19));
    Object v21 = ((com.google.javascript.rhino.Node)v17).checkTreeEqualsSilent(((com.google.javascript.rhino.Node)v20));
    ((com.google.javascript.jscomp.CheckGlobalThis)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.Node)v17));
    Object v22 = null;
    org.junit.Assert.assertNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v2 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v6 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.CheckLevel)v5));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = new com.google.javascript.rhino.Node[]{};
    ((com.google.javascript.jscomp.NodeTraversal)v7).traverseRoots(((com.google.javascript.rhino.Node[])v8));
    Object v9 = null;
    Object v10 = 1;
    Object v11 = "}";
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    Object v13 = 1;
    Object v14 = "}";
    Object v15 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v13).intValue()),((java.lang.String)v14));
    Object v16 = ((com.google.javascript.jscomp.CheckGlobalThis)v2).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v15));
    org.junit.Assert.assertEquals((Object)(true), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v2 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v2 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v6 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.CheckLevel)v5));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = 1;
    Object v9 = "}";
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v8).intValue()),((java.lang.String)v9));
    Object v11 = 1;
    Object v12 = "}";
    Object v13 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v11).intValue()),((java.lang.String)v12));
    ((com.google.javascript.jscomp.CheckGlobalThis)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v2 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v6 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.CheckLevel)v5));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = 1;
    Object v9 = "}";
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v8).intValue()),((java.lang.String)v9));
    Object v11 = 1;
    Object v12 = "}";
    Object v13 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v11).intValue()),((java.lang.String)v12));
    Object v14 = ((com.google.javascript.jscomp.CheckGlobalThis)v2).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v13));
    Object v15 = new com.google.javascript.jscomp.Compiler();
    Object v16 = new com.google.javascript.jscomp.Compiler();
    Object v17 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v18 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v16),((com.google.javascript.jscomp.CheckLevel)v17));
    Object v19 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v15),((com.google.javascript.jscomp.NodeTraversal.Callback)v18));
    Object v20 = 1;
    Object v21 = "}";
    Object v22 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v20).intValue()),((java.lang.String)v21));
    Object v23 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v24 = "shor";
    Object v25 = "s";
    Object v26 = com.google.javascript.jscomp.DiagnosticType.error(((java.lang.String)v24),((java.lang.String)v25));
    Object v27 = new java.lang.String[]{};
    Object v28 = ((com.google.javascript.jscomp.NodeTraversal)v19).makeError(((com.google.javascript.rhino.Node)v22),((com.google.javascript.jscomp.CheckLevel)v23),((com.google.javascript.jscomp.DiagnosticType)v26),((java.lang.String[])v27));
    Object v29 = 1;
    Object v30 = "}";
    Object v31 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v29).intValue()),((java.lang.String)v30));
    Object v32 = 1;
    Object v33 = "}";
    Object v34 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v32).intValue()),((java.lang.String)v33));
    ((com.google.javascript.jscomp.CheckGlobalThis)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v19),((com.google.javascript.rhino.Node)v31),((com.google.javascript.rhino.Node)v34));
    Object v35 = null;
    org.junit.Assert.assertNull(v35);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v2 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v6 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.CheckLevel)v5));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = 1;
    Object v9 = "}";
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v8).intValue()),((java.lang.String)v9));
    Object v11 = 1;
    Object v12 = "}";
    Object v13 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v11).intValue()),((java.lang.String)v12));
    Object v14 = ((com.google.javascript.jscomp.CheckGlobalThis)v2).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v13));
    Object v15 = new com.google.javascript.jscomp.Compiler();
    Object v16 = new com.google.javascript.jscomp.Compiler();
    Object v17 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v18 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v16),((com.google.javascript.jscomp.CheckLevel)v17));
    Object v19 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v15),((com.google.javascript.jscomp.NodeTraversal.Callback)v18));
    Object v20 = 1;
    Object v21 = "}";
    Object v22 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v20).intValue()),((java.lang.String)v21));
    Object v23 = 1;
    Object v24 = "}";
    Object v25 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v23).intValue()),((java.lang.String)v24));
    ((com.google.javascript.jscomp.CheckGlobalThis)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v19),((com.google.javascript.rhino.Node)v22),((com.google.javascript.rhino.Node)v25));
    Object v26 = null;
    org.junit.Assert.assertNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v2 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v6 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.CheckLevel)v5));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = 1;
    Object v9 = "}";
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v8).intValue()),((java.lang.String)v9));
    Object v11 = 1;
    Object v12 = "}";
    Object v13 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v11).intValue()),((java.lang.String)v12));
    Object v14 = ((com.google.javascript.jscomp.CheckGlobalThis)v2).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v13));
    org.junit.Assert.assertEquals((Object)(true), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v2 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v6 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.CheckLevel)v5));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = 1;
    Object v9 = "}";
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v8).intValue()),((java.lang.String)v9));
    Object v11 = 1;
    Object v12 = "}";
    Object v13 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v11).intValue()),((java.lang.String)v12));
    Object v14 = 0;
    ((com.google.javascript.rhino.Node)v13).setType((((java.lang.Integer)v14).intValue()));
    Object v15 = null;
    ((com.google.javascript.jscomp.CheckGlobalThis)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v13));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v2 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v6 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.CheckLevel)v5));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = 1;
    Object v9 = "}";
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v8).intValue()),((java.lang.String)v9));
    Object v11 = "shor";
    Object v12 = "s";
    Object v13 = com.google.javascript.jscomp.DiagnosticType.error(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = new java.lang.String[]{"",": "};
    Object v15 = ((com.google.javascript.jscomp.NodeTraversal)v7).makeError(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.DiagnosticType)v13),((java.lang.String[])v14));
    Object v16 = 1;
    Object v17 = "}";
    Object v18 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v16).intValue()),((java.lang.String)v17));
    Object v19 = 1;
    Object v20 = "}";
    Object v21 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v19).intValue()),((java.lang.String)v20));
    ((com.google.javascript.jscomp.CheckGlobalThis)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v18),((com.google.javascript.rhino.Node)v21));
    Object v22 = null;
    org.junit.Assert.assertNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v3 = ((java.lang.Enum)v2).hashCode();
    Object v4 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v2));
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v8 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.CheckLevel)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.NodeTraversal.Callback)v8));
    Object v10 = 1;
    Object v11 = "}";
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    ((com.google.javascript.rhino.Node)v12).setQuotedString();
    Object v13 = null;
    Object v14 = 1;
    Object v15 = "}";
    Object v16 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v14).intValue()),((java.lang.String)v15));
    Object v17 = ((com.google.javascript.jscomp.CheckGlobalThis)v4).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v9),((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v16));
    org.junit.Assert.assertEquals((Object)(true), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v2 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v6 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.CheckLevel)v5));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = 1;
    Object v9 = "}";
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v8).intValue()),((java.lang.String)v9));
    ((com.google.javascript.jscomp.NodeTraversal)v7).traverse(((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
    Object v12 = 1;
    Object v13 = "}";
    Object v14 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v12).intValue()),((java.lang.String)v13));
    Object v15 = 1;
    Object v16 = "}";
    Object v17 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v15).intValue()),((java.lang.String)v16));
    Object v18 = ((com.google.javascript.rhino.Node)v17).isUnscopedQualifiedName();
    Object v19 = ((com.google.javascript.jscomp.CheckGlobalThis)v2).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.Node)v17));
    org.junit.Assert.assertEquals((Object)(true), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v2 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v6 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.CheckLevel)v5));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = 1;
    Object v9 = "}";
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v8).intValue()),((java.lang.String)v9));
    Object v11 = "shor";
    Object v12 = "s";
    Object v13 = com.google.javascript.jscomp.DiagnosticType.error(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = new java.lang.String[]{"<"};
    Object v15 = ((com.google.javascript.jscomp.NodeTraversal)v7).makeError(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.DiagnosticType)v13),((java.lang.String[])v14));
    Object v16 = 1;
    Object v17 = "}";
    Object v18 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v16).intValue()),((java.lang.String)v17));
    Object v19 = 1;
    Object v20 = "}";
    Object v21 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v19).intValue()),((java.lang.String)v20));
    ((com.google.javascript.jscomp.CheckGlobalThis)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v18),((com.google.javascript.rhino.Node)v21));
    Object v22 = null;
    org.junit.Assert.assertNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v2 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v6 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.CheckLevel)v5));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = 1;
    Object v9 = "}";
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v8).intValue()),((java.lang.String)v9));
    Object v11 = 1;
    Object v12 = "}";
    Object v13 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v11).intValue()),((java.lang.String)v12));
    Object v14 = true;
    ((com.google.javascript.rhino.Node)v13).setOptionalArg((((java.lang.Boolean)v14).booleanValue()));
    Object v15 = null;
    ((com.google.javascript.jscomp.CheckGlobalThis)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v13));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v2 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v6 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.CheckLevel)v5));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = 1;
    Object v9 = "}";
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v8).intValue()),((java.lang.String)v9));
    Object v11 = 1;
    Object v12 = "}";
    Object v13 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v11).intValue()),((java.lang.String)v12));
    ((com.google.javascript.jscomp.CheckGlobalThis)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
    Object v15 = new com.google.javascript.jscomp.Compiler();
    Object v16 = new com.google.javascript.jscomp.Compiler();
    Object v17 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v18 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v16),((com.google.javascript.jscomp.CheckLevel)v17));
    Object v19 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v15),((com.google.javascript.jscomp.NodeTraversal.Callback)v18));
    Object v20 = 1;
    Object v21 = "}";
    Object v22 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v20).intValue()),((java.lang.String)v21));
    Object v23 = false;
    ((com.google.javascript.rhino.Node)v22).setIsSyntheticBlock((((java.lang.Boolean)v23).booleanValue()));
    Object v24 = null;
    Object v25 = 1;
    Object v26 = "}";
    Object v27 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v25).intValue()),((java.lang.String)v26));
    Object v28 = 1;
    Object v29 = "}";
    Object v30 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v28).intValue()),((java.lang.String)v29));
    ((com.google.javascript.rhino.Node)v27).addChildrenToBack(((com.google.javascript.rhino.Node)v30));
    Object v31 = null;
    ((com.google.javascript.jscomp.CheckGlobalThis)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v19),((com.google.javascript.rhino.Node)v22),((com.google.javascript.rhino.Node)v27));
    Object v32 = null;
    org.junit.Assert.assertNull(v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v2 = ((java.lang.Enum)v1).hashCode();
    Object v3 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v2 = ((java.lang.Enum)v1).hashCode();
    Object v3 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v7 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.CheckLevel)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = 1;
    Object v10 = "}";
    Object v11 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v9).intValue()),((java.lang.String)v10));
    Object v12 = 1;
    Object v13 = "}";
    Object v14 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v12).intValue()),((java.lang.String)v13));
    Object v15 = ((com.google.javascript.rhino.Node)v11).checkTreeEquals(((com.google.javascript.rhino.Node)v14));
    Object v16 = 1;
    Object v17 = "}";
    Object v18 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v16).intValue()),((java.lang.String)v17));
    ((com.google.javascript.jscomp.CheckGlobalThis)v3).visit(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v18));
    Object v19 = null;
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v2 = ((java.lang.Enum)v1).hashCode();
    Object v3 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v7 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.CheckLevel)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = 1;
    Object v10 = "}";
    Object v11 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v9).intValue()),((java.lang.String)v10));
    Object v12 = ((com.google.javascript.rhino.Node)v11).getString();
    Object v13 = 1;
    Object v14 = "}";
    Object v15 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v13).intValue()),((java.lang.String)v14));
    ((com.google.javascript.jscomp.CheckGlobalThis)v3).visit(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v2 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v6 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.CheckLevel)v5));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = 1;
    Object v9 = "}";
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v8).intValue()),((java.lang.String)v9));
    Object v11 = 1;
    Object v12 = "}";
    Object v13 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v11).intValue()),((java.lang.String)v12));
    Object v14 = ((com.google.javascript.rhino.Node)v10).copyInformationFrom(((com.google.javascript.rhino.Node)v13));
    Object v15 = 1;
    Object v16 = "}";
    Object v17 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v15).intValue()),((java.lang.String)v16));
    ((com.google.javascript.jscomp.CheckGlobalThis)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v17));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v2 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v6 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.CheckLevel)v5));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = ((com.google.javascript.jscomp.NodeTraversal)v7).getEnclosingFunction();
    Object v9 = 1;
    Object v10 = "}";
    Object v11 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v9).intValue()),((java.lang.String)v10));
    Object v12 = 1;
    Object v13 = "}";
    Object v14 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v12).intValue()),((java.lang.String)v13));
    Object v15 = false;
    ((com.google.javascript.rhino.Node)v14).setWasEmptyNode((((java.lang.Boolean)v15).booleanValue()));
    Object v16 = null;
    ((com.google.javascript.jscomp.CheckGlobalThis)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v14));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v3 = ((java.lang.Enum)v2).hashCode();
    Object v4 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v2));
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v8 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.CheckLevel)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.NodeTraversal.Callback)v8));
    Object v10 = 1;
    Object v11 = "}";
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    Object v13 = 83;
    ((com.google.javascript.rhino.Node)v12).setLineno((((java.lang.Integer)v13).intValue()));
    Object v14 = null;
    Object v15 = 1;
    Object v16 = "}";
    Object v17 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v15).intValue()),((java.lang.String)v16));
    Object v18 = ((com.google.javascript.jscomp.CheckGlobalThis)v4).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v9),((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v17));
    org.junit.Assert.assertEquals((Object)(true), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v2 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v6 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.CheckLevel)v5));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = 1;
    Object v9 = "}";
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v8).intValue()),((java.lang.String)v9));
    Object v11 = 1;
    ((com.google.javascript.rhino.Node)v10).removeProp((((java.lang.Integer)v11).intValue()));
    Object v12 = null;
    Object v13 = 1;
    Object v14 = "}";
    Object v15 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v13).intValue()),((java.lang.String)v14));
    Object v16 = ((com.google.javascript.rhino.Node)v15).getAncestors();
    ((com.google.javascript.jscomp.CheckGlobalThis)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v15));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v2 = ((java.lang.Enum)v1).hashCode();
    Object v3 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v7 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.CheckLevel)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = 1;
    Object v10 = "}";
    Object v11 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v9).intValue()),((java.lang.String)v10));
    Object v12 = 1;
    Object v13 = "}";
    Object v14 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v12).intValue()),((java.lang.String)v13));
    Object v15 = ((com.google.javascript.rhino.Node)v14).toStringTree();
    Object v16 = ((com.google.javascript.jscomp.CheckGlobalThis)v3).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v14));
    org.junit.Assert.assertEquals((Object)(true), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v2 = ((java.lang.Enum)v1).hashCode();
    Object v3 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v7 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.CheckLevel)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = ((com.google.javascript.jscomp.NodeTraversal)v8).getScope();
    Object v10 = 1;
    Object v11 = "}";
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    Object v13 = 1;
    Object v14 = "}";
    Object v15 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v13).intValue()),((java.lang.String)v14));
    Object v16 = ((com.google.javascript.jscomp.CheckGlobalThis)v3).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v15));
    org.junit.Assert.assertEquals((Object)(true), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v2 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v6 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.CheckLevel)v5));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = 1;
    Object v9 = "}";
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v8).intValue()),((java.lang.String)v9));
    Object v11 = 1;
    Object v12 = "}";
    Object v13 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v11).intValue()),((java.lang.String)v12));
    ((com.google.javascript.rhino.Node)v10).addChildToFront(((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
    Object v15 = 1;
    Object v16 = "}";
    Object v17 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v15).intValue()),((java.lang.String)v16));
    Object v18 = 1;
    Object v19 = "}";
    Object v20 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v18).intValue()),((java.lang.String)v19));
    Object v21 = ((com.google.javascript.rhino.Node)v17).checkTreeEqualsSilent(((com.google.javascript.rhino.Node)v20));
    ((com.google.javascript.jscomp.CheckGlobalThis)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v17));
    Object v22 = null;
    org.junit.Assert.assertNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v2 = ((java.lang.Enum)v1).hashCode();
    Object v3 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v7 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.CheckLevel)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = 1;
    Object v10 = "}";
    Object v11 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v9).intValue()),((java.lang.String)v10));
    Object v12 = 1;
    Object v13 = "}";
    Object v14 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v12).intValue()),((java.lang.String)v13));
    ((com.google.javascript.jscomp.CheckGlobalThis)v3).visit(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v14));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.Compiler();
    Object v17 = new com.google.javascript.jscomp.Compiler();
    Object v18 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v19 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v17),((com.google.javascript.jscomp.CheckLevel)v18));
    Object v20 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v16),((com.google.javascript.jscomp.NodeTraversal.Callback)v19));
    Object v21 = 1;
    Object v22 = "}";
    Object v23 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v21).intValue()),((java.lang.String)v22));
    Object v24 = 1;
    Object v25 = "}";
    Object v26 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v24).intValue()),((java.lang.String)v25));
    ((com.google.javascript.jscomp.CheckGlobalThis)v3).visit(((com.google.javascript.jscomp.NodeTraversal)v20),((com.google.javascript.rhino.Node)v23),((com.google.javascript.rhino.Node)v26));
    Object v27 = null;
    org.junit.Assert.assertNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v2 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v6 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.CheckLevel)v5));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = 1;
    Object v9 = "}";
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v8).intValue()),((java.lang.String)v9));
    Object v11 = 1;
    Object v12 = "}";
    Object v13 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v11).intValue()),((java.lang.String)v12));
    Object v14 = ((com.google.javascript.rhino.Node)v13).getQualifiedName();
    Object v15 = ((com.google.javascript.jscomp.CheckGlobalThis)v2).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v13));
    org.junit.Assert.assertEquals((Object)(true), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v2 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v6 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.CheckLevel)v5));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = 1;
    Object v9 = "}";
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v8).intValue()),((java.lang.String)v9));
    Object v11 = 1;
    Object v12 = "}";
    Object v13 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v11).intValue()),((java.lang.String)v12));
    Object v14 = ((com.google.javascript.rhino.Node)v13).cloneTree();
    ((com.google.javascript.jscomp.CheckGlobalThis)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v13));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v2 = ((java.lang.Enum)v1).hashCode();
    Object v3 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v7 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.CheckLevel)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = new com.google.javascript.rhino.Node[]{};
    ((com.google.javascript.jscomp.NodeTraversal)v8).traverseRoots(((com.google.javascript.rhino.Node[])v9));
    Object v10 = null;
    Object v11 = 1;
    Object v12 = "}";
    Object v13 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v11).intValue()),((java.lang.String)v12));
    Object v14 = true;
    ((com.google.javascript.rhino.Node)v13).setOptionalArg((((java.lang.Boolean)v14).booleanValue()));
    Object v15 = null;
    Object v16 = 1;
    Object v17 = "}";
    Object v18 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v16).intValue()),((java.lang.String)v17));
    Object v19 = ((com.google.javascript.jscomp.CheckGlobalThis)v3).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v18));
    org.junit.Assert.assertEquals((Object)(true), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v3 = ((java.lang.Enum)v2).hashCode();
    Object v4 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v2));
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v8 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.CheckLevel)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.NodeTraversal.Callback)v8));
    Object v10 = 1;
    Object v11 = "}";
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    Object v13 = 1;
    Object v14 = "}";
    Object v15 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v13).intValue()),((java.lang.String)v14));
    Object v16 = true;
    Object v17 = false;
    Object v18 = true;
    Object v19 = ((com.google.javascript.rhino.Node)v15).toString((((java.lang.Boolean)v16).booleanValue()),(((java.lang.Boolean)v17).booleanValue()),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = ((com.google.javascript.jscomp.CheckGlobalThis)v4).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v9),((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v15));
    org.junit.Assert.assertEquals((Object)(true), v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v2 = ((java.lang.Enum)v1).hashCode();
    Object v3 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v7 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.CheckLevel)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = 1;
    Object v10 = "}";
    Object v11 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v9).intValue()),((java.lang.String)v10));
    Object v12 = 1;
    Object v13 = "}";
    Object v14 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v12).intValue()),((java.lang.String)v13));
    Object v15 = ((com.google.javascript.jscomp.CheckGlobalThis)v3).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v14));
    Object v16 = new com.google.javascript.jscomp.Compiler();
    Object v17 = new com.google.javascript.jscomp.Compiler();
    Object v18 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v19 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v17),((com.google.javascript.jscomp.CheckLevel)v18));
    Object v20 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v16),((com.google.javascript.jscomp.NodeTraversal.Callback)v19));
    Object v21 = ((com.google.javascript.jscomp.NodeTraversal)v20).getEnclosingFunction();
    Object v22 = 1;
    Object v23 = "}";
    Object v24 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v22).intValue()),((java.lang.String)v23));
    Object v25 = 1;
    Object v26 = "}";
    Object v27 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v25).intValue()),((java.lang.String)v26));
    ((com.google.javascript.jscomp.CheckGlobalThis)v3).visit(((com.google.javascript.jscomp.NodeTraversal)v20),((com.google.javascript.rhino.Node)v24),((com.google.javascript.rhino.Node)v27));
    Object v28 = null;
    org.junit.Assert.assertNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v2 = ((java.lang.Enum)v1).hashCode();
    Object v3 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v7 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.CheckLevel)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = 1;
    Object v10 = "}";
    Object v11 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v9).intValue()),((java.lang.String)v10));
    Object v12 = 1;
    Object v13 = "}";
    Object v14 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v12).intValue()),((java.lang.String)v13));
    ((com.google.javascript.jscomp.CheckGlobalThis)v3).visit(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v14));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v3 = ((java.lang.Enum)v2).hashCode();
    Object v4 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v2));
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v8 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.CheckLevel)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.NodeTraversal.Callback)v8));
    Object v10 = 1;
    Object v11 = "}";
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    Object v13 = -30;
    Object v14 = false;
    ((com.google.javascript.rhino.Node)v12).putBooleanProp((((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v15 = null;
    Object v16 = 1;
    Object v17 = "}";
    Object v18 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v16).intValue()),((java.lang.String)v17));
    ((com.google.javascript.jscomp.CheckGlobalThis)v4).visit(((com.google.javascript.jscomp.NodeTraversal)v9),((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v18));
    Object v19 = null;
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v2 = ((java.lang.Enum)v1).hashCode();
    Object v3 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v7 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.CheckLevel)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = 1;
    Object v10 = "}";
    Object v11 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v9).intValue()),((java.lang.String)v10));
    Object v12 = 1;
    Object v13 = "}";
    Object v14 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v12).intValue()),((java.lang.String)v13));
    Object v15 = ((com.google.javascript.jscomp.CheckGlobalThis)v3).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v14));
    Object v16 = new com.google.javascript.jscomp.Compiler();
    Object v17 = new com.google.javascript.jscomp.Compiler();
    Object v18 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v19 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v17),((com.google.javascript.jscomp.CheckLevel)v18));
    Object v20 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v16),((com.google.javascript.jscomp.NodeTraversal.Callback)v19));
    Object v21 = 1;
    Object v22 = "}";
    Object v23 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v21).intValue()),((java.lang.String)v22));
    Object v24 = 1;
    Object v25 = "}";
    Object v26 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v24).intValue()),((java.lang.String)v25));
    Object v27 = ((com.google.javascript.jscomp.CheckGlobalThis)v3).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v20),((com.google.javascript.rhino.Node)v23),((com.google.javascript.rhino.Node)v26));
    org.junit.Assert.assertEquals((Object)(true), v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v2 = ((java.lang.Enum)v1).hashCode();
    Object v3 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v7 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.CheckLevel)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = 1;
    Object v10 = "}";
    Object v11 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v9).intValue()),((java.lang.String)v10));
    Object v12 = 1;
    Object v13 = "}";
    Object v14 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v12).intValue()),((java.lang.String)v13));
    Object v15 = ((com.google.javascript.jscomp.CheckGlobalThis)v3).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v14));
    org.junit.Assert.assertEquals((Object)(true), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v2 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v6 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.CheckLevel)v5));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = 1;
    Object v9 = "}";
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v8).intValue()),((java.lang.String)v9));
    Object v11 = 1;
    Object v12 = "}";
    Object v13 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v11).intValue()),((java.lang.String)v12));
    ((com.google.javascript.rhino.Node)v10).addChildToBack(((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
    Object v15 = 1;
    Object v16 = "}";
    Object v17 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v15).intValue()),((java.lang.String)v16));
    Object v18 = ((com.google.javascript.jscomp.CheckGlobalThis)v2).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v17));
    org.junit.Assert.assertEquals((Object)(true), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v2 = ((java.lang.Enum)v1).hashCode();
    Object v3 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v7 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.CheckLevel)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = 1;
    Object v10 = "}";
    Object v11 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v9).intValue()),((java.lang.String)v10));
    Object v12 = 1;
    Object v13 = "}";
    Object v14 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v12).intValue()),((java.lang.String)v13));
    Object v15 = ((com.google.javascript.rhino.Node)v11).copyInformationFromForTree(((com.google.javascript.rhino.Node)v14));
    Object v16 = 1;
    Object v17 = "}";
    Object v18 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v16).intValue()),((java.lang.String)v17));
    ((com.google.javascript.jscomp.CheckGlobalThis)v3).visit(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v18));
    Object v19 = null;
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v2 = ((java.lang.Enum)v1).hashCode();
    Object v3 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v7 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.CheckLevel)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = 1;
    Object v10 = "}";
    Object v11 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v9).intValue()),((java.lang.String)v10));
    Object v12 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v13 = "shor";
    Object v14 = "s";
    Object v15 = com.google.javascript.jscomp.DiagnosticType.error(((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = new java.lang.String[]{"msg.jsd"};
    Object v17 = ((com.google.javascript.jscomp.NodeTraversal)v8).makeError(((com.google.javascript.rhino.Node)v11),((com.google.javascript.jscomp.CheckLevel)v12),((com.google.javascript.jscomp.DiagnosticType)v15),((java.lang.String[])v16));
    Object v18 = 1;
    Object v19 = "}";
    Object v20 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v18).intValue()),((java.lang.String)v19));
    Object v21 = 1;
    Object v22 = "}";
    Object v23 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v21).intValue()),((java.lang.String)v22));
    Object v24 = ((com.google.javascript.rhino.Node)v20).copyInformationFromForTree(((com.google.javascript.rhino.Node)v23));
    Object v25 = 1;
    Object v26 = "}";
    Object v27 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v25).intValue()),((java.lang.String)v26));
    ((com.google.javascript.jscomp.CheckGlobalThis)v3).visit(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.Node)v27));
    Object v28 = null;
    org.junit.Assert.assertNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v2 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v6 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.CheckLevel)v5));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = 1;
    Object v9 = "}";
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v8).intValue()),((java.lang.String)v9));
    Object v11 = 1;
    Object v12 = "}";
    Object v13 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v11).intValue()),((java.lang.String)v12));
    Object v14 = ((com.google.javascript.rhino.Node)v13).getJsDocBuilderForNode();
    Object v15 = ((com.google.javascript.jscomp.CheckGlobalThis)v2).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v13));
    org.junit.Assert.assertEquals((Object)(true), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v2 = ((java.lang.Enum)v1).hashCode();
    Object v3 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v7 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.CheckLevel)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = 1;
    Object v10 = "}";
    Object v11 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v9).intValue()),((java.lang.String)v10));
    Object v12 = 1;
    Object v13 = "}";
    Object v14 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v12).intValue()),((java.lang.String)v13));
    ((com.google.javascript.jscomp.CheckGlobalThis)v3).visit(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v14));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.Compiler();
    Object v17 = new com.google.javascript.jscomp.Compiler();
    Object v18 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v19 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v17),((com.google.javascript.jscomp.CheckLevel)v18));
    Object v20 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v16),((com.google.javascript.jscomp.NodeTraversal.Callback)v19));
    Object v21 = 1;
    Object v22 = "}";
    Object v23 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v21).intValue()),((java.lang.String)v22));
    Object v24 = 1;
    Object v25 = "}";
    Object v26 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v24).intValue()),((java.lang.String)v25));
    Object v27 = ((com.google.javascript.jscomp.CheckGlobalThis)v3).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v20),((com.google.javascript.rhino.Node)v23),((com.google.javascript.rhino.Node)v26));
    org.junit.Assert.assertEquals((Object)(true), v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v3 = ((java.lang.Enum)v2).hashCode();
    Object v4 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v2));
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v8 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.CheckLevel)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.NodeTraversal.Callback)v8));
    Object v10 = 1;
    Object v11 = "}";
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    Object v13 = 1;
    Object v14 = "}";
    Object v15 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v13).intValue()),((java.lang.String)v14));
    ((com.google.javascript.jscomp.CheckGlobalThis)v4).visit(((com.google.javascript.jscomp.NodeTraversal)v9),((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
    Object v17 = new com.google.javascript.jscomp.Compiler();
    Object v18 = new com.google.javascript.jscomp.Compiler();
    Object v19 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v20 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v18),((com.google.javascript.jscomp.CheckLevel)v19));
    Object v21 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v17),((com.google.javascript.jscomp.NodeTraversal.Callback)v20));
    Object v22 = 1;
    Object v23 = "}";
    Object v24 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v22).intValue()),((java.lang.String)v23));
    Object v25 = 1;
    Object v26 = "}";
    Object v27 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v25).intValue()),((java.lang.String)v26));
    Object v28 = ((com.google.javascript.rhino.Node)v27).removeFirstChild();
    ((com.google.javascript.jscomp.CheckGlobalThis)v4).visit(((com.google.javascript.jscomp.NodeTraversal)v21),((com.google.javascript.rhino.Node)v24),((com.google.javascript.rhino.Node)v27));
    Object v29 = null;
    org.junit.Assert.assertNull(v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v2 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v6 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.CheckLevel)v5));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = ((com.google.javascript.jscomp.NodeTraversal)v7).getScope();
    Object v9 = 1;
    Object v10 = "}";
    Object v11 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v9).intValue()),((java.lang.String)v10));
    Object v12 = 1;
    Object v13 = "}";
    Object v14 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v12).intValue()),((java.lang.String)v13));
    Object v15 = 1;
    Object v16 = "}";
    Object v17 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v15).intValue()),((java.lang.String)v16));
    ((com.google.javascript.rhino.Node)v14).addChildrenToBack(((com.google.javascript.rhino.Node)v17));
    Object v18 = null;
    ((com.google.javascript.jscomp.CheckGlobalThis)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v14));
    Object v19 = null;
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v3 = ((java.lang.Enum)v2).hashCode();
    Object v4 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v2));
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v8 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.CheckLevel)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.NodeTraversal.Callback)v8));
    Object v10 = 1;
    Object v11 = "}";
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    Object v13 = 1;
    Object v14 = "}";
    Object v15 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v13).intValue()),((java.lang.String)v14));
    Object v16 = ((com.google.javascript.rhino.Node)v15).cloneNode();
    ((com.google.javascript.jscomp.CheckGlobalThis)v4).visit(((com.google.javascript.jscomp.NodeTraversal)v9),((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v15));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v2 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v6 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.CheckLevel)v5));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = 1;
    Object v9 = "}";
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v8).intValue()),((java.lang.String)v9));
    Object v11 = 1;
    Object v12 = "}";
    Object v13 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v11).intValue()),((java.lang.String)v12));
    ((com.google.javascript.jscomp.CheckGlobalThis)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
    Object v15 = new com.google.javascript.jscomp.Compiler();
    Object v16 = new com.google.javascript.jscomp.Compiler();
    Object v17 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v18 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v16),((com.google.javascript.jscomp.CheckLevel)v17));
    Object v19 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v15),((com.google.javascript.jscomp.NodeTraversal.Callback)v18));
    Object v20 = ((com.google.javascript.jscomp.NodeTraversal)v19).getScope();
    Object v21 = 1;
    Object v22 = "}";
    Object v23 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v21).intValue()),((java.lang.String)v22));
    Object v24 = 1;
    Object v25 = "}";
    Object v26 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v24).intValue()),((java.lang.String)v25));
    Object v27 = ((com.google.javascript.jscomp.CheckGlobalThis)v2).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v19),((com.google.javascript.rhino.Node)v23),((com.google.javascript.rhino.Node)v26));
    org.junit.Assert.assertEquals((Object)(true), v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v2 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v6 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.CheckLevel)v5));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = 1;
    Object v9 = "}";
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v8).intValue()),((java.lang.String)v9));
    Object v11 = 1;
    Object v12 = "}";
    Object v13 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v11).intValue()),((java.lang.String)v12));
    Object v14 = ((com.google.javascript.jscomp.CheckGlobalThis)v2).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v13));
    Object v15 = new com.google.javascript.jscomp.Compiler();
    Object v16 = new com.google.javascript.jscomp.Compiler();
    Object v17 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v18 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v16),((com.google.javascript.jscomp.CheckLevel)v17));
    Object v19 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v15),((com.google.javascript.jscomp.NodeTraversal.Callback)v18));
    Object v20 = 1;
    Object v21 = "}";
    Object v22 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v20).intValue()),((java.lang.String)v21));
    Object v23 = 1;
    Object v24 = "}";
    Object v25 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v23).intValue()),((java.lang.String)v24));
    Object v26 = ((com.google.javascript.jscomp.CheckGlobalThis)v2).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v19),((com.google.javascript.rhino.Node)v22),((com.google.javascript.rhino.Node)v25));
    org.junit.Assert.assertEquals((Object)(true), v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v2 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v6 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.CheckLevel)v5));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = 1;
    Object v9 = "}";
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v8).intValue()),((java.lang.String)v9));
    Object v11 = 1;
    Object v12 = "shor";
    Object v13 = "s";
    Object v14 = com.google.javascript.jscomp.DiagnosticType.error(((java.lang.String)v12),((java.lang.String)v13));
    ((com.google.javascript.rhino.Node)v10).putProp((((java.lang.Integer)v11).intValue()),((java.lang.Object)v14));
    Object v15 = null;
    Object v16 = 1;
    Object v17 = "}";
    Object v18 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v16).intValue()),((java.lang.String)v17));
    ((com.google.javascript.jscomp.CheckGlobalThis)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v18));
    Object v19 = null;
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v2 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v6 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.CheckLevel)v5));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = 1;
    Object v9 = "}";
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v8).intValue()),((java.lang.String)v9));
    ((com.google.javascript.jscomp.NodeTraversal)v7).traverse(((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
    Object v12 = 1;
    Object v13 = "}";
    Object v14 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v12).intValue()),((java.lang.String)v13));
    Object v15 = 1;
    Object v16 = "}";
    Object v17 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v15).intValue()),((java.lang.String)v16));
    Object v18 = new java.io.StringWriter();
    ((com.google.javascript.rhino.Node)v17).appendStringTree(((java.lang.Appendable)v18));
    Object v19 = null;
    ((com.google.javascript.jscomp.CheckGlobalThis)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.Node)v17));
    Object v20 = null;
    org.junit.Assert.assertNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v2 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v6 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.CheckLevel)v5));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = ((com.google.javascript.jscomp.NodeTraversal)v7).getScope();
    Object v9 = 1;
    Object v10 = "}";
    Object v11 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v9).intValue()),((java.lang.String)v10));
    Object v12 = 1;
    Object v13 = "}";
    Object v14 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v12).intValue()),((java.lang.String)v13));
    Object v15 = ((com.google.javascript.rhino.Node)v14).removeFirstChild();
    ((com.google.javascript.jscomp.CheckGlobalThis)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v14));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v2 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v6 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.CheckLevel)v5));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = 1;
    Object v9 = "}";
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v8).intValue()),((java.lang.String)v9));
    Object v11 = 1;
    Object v12 = "}";
    Object v13 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v11).intValue()),((java.lang.String)v12));
    Object v14 = ((com.google.javascript.jscomp.CheckGlobalThis)v2).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v13));
    Object v15 = new com.google.javascript.jscomp.Compiler();
    Object v16 = new com.google.javascript.jscomp.Compiler();
    Object v17 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v18 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v16),((com.google.javascript.jscomp.CheckLevel)v17));
    Object v19 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v15),((com.google.javascript.jscomp.NodeTraversal.Callback)v18));
    Object v20 = 1;
    Object v21 = "}";
    Object v22 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v20).intValue()),((java.lang.String)v21));
    Object v23 = 1;
    Object v24 = "}";
    Object v25 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v23).intValue()),((java.lang.String)v24));
    Object v26 = 1;
    Object v27 = "}";
    Object v28 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v26).intValue()),((java.lang.String)v27));
    Object v29 = ((com.google.javascript.rhino.Node)v25).copyInformationFrom(((com.google.javascript.rhino.Node)v28));
    Object v30 = ((com.google.javascript.jscomp.CheckGlobalThis)v2).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v19),((com.google.javascript.rhino.Node)v22),((com.google.javascript.rhino.Node)v25));
    org.junit.Assert.assertEquals((Object)(true), v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v2 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v6 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.CheckLevel)v5));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = 1;
    Object v9 = "}";
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v8).intValue()),((java.lang.String)v9));
    Object v11 = 1;
    Object v12 = "}";
    Object v13 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v11).intValue()),((java.lang.String)v12));
    Object v14 = ((com.google.javascript.rhino.Node)v10).copyInformationFrom(((com.google.javascript.rhino.Node)v13));
    Object v15 = 1;
    Object v16 = "}";
    Object v17 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v15).intValue()),((java.lang.String)v16));
    Object v18 = ((com.google.javascript.jscomp.CheckGlobalThis)v2).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v17));
    org.junit.Assert.assertEquals((Object)(true), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v2 = ((java.lang.Enum)v1).hashCode();
    Object v3 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v7 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.CheckLevel)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = 1;
    Object v10 = "}";
    Object v11 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v9).intValue()),((java.lang.String)v10));
    Object v12 = 1;
    Object v13 = "}";
    Object v14 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v12).intValue()),((java.lang.String)v13));
    Object v15 = ((com.google.javascript.jscomp.CheckGlobalThis)v3).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v14));
    Object v16 = new com.google.javascript.jscomp.Compiler();
    Object v17 = new com.google.javascript.jscomp.Compiler();
    Object v18 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v19 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v17),((com.google.javascript.jscomp.CheckLevel)v18));
    Object v20 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v16),((com.google.javascript.jscomp.NodeTraversal.Callback)v19));
    Object v21 = 1;
    Object v22 = "}";
    Object v23 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v21).intValue()),((java.lang.String)v22));
    Object v24 = 9;
    Object v25 = ((com.google.javascript.rhino.Node)v23).getAncestor((((java.lang.Integer)v24).intValue()));
    Object v26 = 1;
    Object v27 = "}";
    Object v28 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v26).intValue()),((java.lang.String)v27));
    Object v29 = 43;
    Object v30 = java.lang.ClassLoader.getSystemClassLoader();
    ((com.google.javascript.rhino.Node)v28).putProp((((java.lang.Integer)v29).intValue()),((java.lang.Object)v30));
    Object v31 = null;
    Object v32 = ((com.google.javascript.jscomp.CheckGlobalThis)v3).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v20),((com.google.javascript.rhino.Node)v23),((com.google.javascript.rhino.Node)v28));
    org.junit.Assert.assertEquals((Object)(true), v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v2 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v6 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.CheckLevel)v5));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = ((com.google.javascript.jscomp.NodeTraversal)v7).getScope();
    Object v9 = 1;
    Object v10 = "}";
    Object v11 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v9).intValue()),((java.lang.String)v10));
    Object v12 = 1;
    Object v13 = "}";
    Object v14 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v12).intValue()),((java.lang.String)v13));
    ((com.google.javascript.jscomp.CheckGlobalThis)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v14));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v2 = ((java.lang.Enum)v1).hashCode();
    Object v3 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v7 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.CheckLevel)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = ((com.google.javascript.jscomp.NodeTraversal)v8).getScope();
    Object v10 = 1;
    Object v11 = "}";
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    Object v13 = 1;
    Object v14 = "}";
    Object v15 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v13).intValue()),((java.lang.String)v14));
    ((com.google.javascript.jscomp.CheckGlobalThis)v3).visit(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v2 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v6 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.CheckLevel)v5));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = 1;
    Object v9 = "}";
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v8).intValue()),((java.lang.String)v9));
    Object v11 = ((com.google.javascript.rhino.Node)v10).siblings();
    Object v12 = 1;
    Object v13 = "}";
    Object v14 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v12).intValue()),((java.lang.String)v13));
    ((com.google.javascript.jscomp.CheckGlobalThis)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v14));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v2 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v6 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.CheckLevel)v5));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = 1;
    Object v9 = "}";
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v8).intValue()),((java.lang.String)v9));
    Object v11 = ((com.google.javascript.rhino.Node)v10).children();
    Object v12 = 1;
    Object v13 = "}";
    Object v14 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v12).intValue()),((java.lang.String)v13));
    Object v15 = 1;
    Object v16 = "}";
    Object v17 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v15).intValue()),((java.lang.String)v16));
    ((com.google.javascript.rhino.Node)v14).addChildrenToFront(((com.google.javascript.rhino.Node)v17));
    Object v18 = null;
    Object v19 = ((com.google.javascript.jscomp.CheckGlobalThis)v2).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v14));
    org.junit.Assert.assertEquals((Object)(true), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v2 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v6 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.CheckLevel)v5));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = 1;
    Object v9 = "}";
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v8).intValue()),((java.lang.String)v9));
    Object v11 = ((com.google.javascript.rhino.Node)v10).removeChildren();
    Object v12 = 1;
    Object v13 = "}";
    Object v14 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v12).intValue()),((java.lang.String)v13));
    Object v15 = ((com.google.javascript.jscomp.CheckGlobalThis)v2).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v14));
    org.junit.Assert.assertEquals((Object)(true), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v2 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v6 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.CheckLevel)v5));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = ((com.google.javascript.jscomp.NodeTraversal)v7).getScope();
    Object v9 = 1;
    Object v10 = "}";
    Object v11 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v9).intValue()),((java.lang.String)v10));
    Object v12 = 1;
    Object v13 = "}";
    Object v14 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v12).intValue()),((java.lang.String)v13));
    Object v15 = ((com.google.javascript.jscomp.CheckGlobalThis)v2).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v14));
    org.junit.Assert.assertEquals((Object)(true), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v2 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v6 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.CheckLevel)v5));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = 1;
    Object v9 = "}";
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v8).intValue()),((java.lang.String)v9));
    Object v11 = 1;
    Object v12 = "}";
    Object v13 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v11).intValue()),((java.lang.String)v12));
    Object v14 = ((com.google.javascript.jscomp.CheckGlobalThis)v2).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v13));
    Object v15 = new com.google.javascript.jscomp.Compiler();
    Object v16 = new com.google.javascript.jscomp.Compiler();
    Object v17 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v18 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v16),((com.google.javascript.jscomp.CheckLevel)v17));
    Object v19 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v15),((com.google.javascript.jscomp.NodeTraversal.Callback)v18));
    Object v20 = 1;
    Object v21 = "}";
    Object v22 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v20).intValue()),((java.lang.String)v21));
    Object v23 = 1;
    Object v24 = "}";
    Object v25 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v23).intValue()),((java.lang.String)v24));
    Object v26 = 1;
    Object v27 = "}";
    Object v28 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v26).intValue()),((java.lang.String)v27));
    Object v29 = ((com.google.javascript.rhino.Node)v25).copyInformationFrom(((com.google.javascript.rhino.Node)v28));
    ((com.google.javascript.jscomp.CheckGlobalThis)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v19),((com.google.javascript.rhino.Node)v22),((com.google.javascript.rhino.Node)v25));
    Object v30 = null;
    org.junit.Assert.assertNull(v30);
  }
}
