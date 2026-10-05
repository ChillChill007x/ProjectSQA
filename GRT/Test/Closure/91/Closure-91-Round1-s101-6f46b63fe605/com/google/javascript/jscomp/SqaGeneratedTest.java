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
    Object v8 = 22;
    Object v9 = new com.google.javascript.rhino.Node[]{};
    Object v10 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()),((com.google.javascript.rhino.Node[])v9));
    Object v11 = 22;
    Object v12 = new com.google.javascript.rhino.Node[]{};
    Object v13 = new com.google.javascript.rhino.Node((((java.lang.Integer)v11).intValue()),((com.google.javascript.rhino.Node[])v12));
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
    Object v8 = 22;
    Object v9 = new com.google.javascript.rhino.Node[]{};
    Object v10 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()),((com.google.javascript.rhino.Node[])v9));
    Object v11 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v12 = "OTHER";
    Object v13 = "";
    Object v14 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = new java.lang.String[]{"9",""};
    Object v16 = ((com.google.javascript.jscomp.NodeTraversal)v7).makeError(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.CheckLevel)v11),((com.google.javascript.jscomp.DiagnosticType)v14),((java.lang.String[])v15));
    Object v17 = 22;
    Object v18 = new com.google.javascript.rhino.Node[]{};
    Object v19 = new com.google.javascript.rhino.Node((((java.lang.Integer)v17).intValue()),((com.google.javascript.rhino.Node[])v18));
    Object v20 = 22;
    Object v21 = new com.google.javascript.rhino.Node[]{};
    Object v22 = new com.google.javascript.rhino.Node((((java.lang.Integer)v20).intValue()),((com.google.javascript.rhino.Node[])v21));
    Object v23 = ((com.google.javascript.jscomp.CheckGlobalThis)v2).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v19),((com.google.javascript.rhino.Node)v22));
    org.junit.Assert.assertEquals((Object)(true), v23);
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
    Object v8 = 22;
    Object v9 = new com.google.javascript.rhino.Node[]{};
    Object v10 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()),((com.google.javascript.rhino.Node[])v9));
    Object v11 = 22;
    Object v12 = new com.google.javascript.rhino.Node[]{};
    Object v13 = new com.google.javascript.rhino.Node((((java.lang.Integer)v11).intValue()),((com.google.javascript.rhino.Node[])v12));
    Object v14 = false;
    ((com.google.javascript.rhino.Node)v13).setWasEmptyNode((((java.lang.Boolean)v14).booleanValue()));
    Object v15 = null;
    ((com.google.javascript.jscomp.CheckGlobalThis)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v13));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
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
    Object v8 = 22;
    Object v9 = new com.google.javascript.rhino.Node[]{};
    Object v10 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()),((com.google.javascript.rhino.Node[])v9));
    Object v11 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v12 = "OTHER";
    Object v13 = "";
    Object v14 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = new java.lang.String[]{"y",""};
    Object v16 = ((com.google.javascript.jscomp.NodeTraversal)v7).makeError(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.CheckLevel)v11),((com.google.javascript.jscomp.DiagnosticType)v14),((java.lang.String[])v15));
    Object v17 = 22;
    Object v18 = new com.google.javascript.rhino.Node[]{};
    Object v19 = new com.google.javascript.rhino.Node((((java.lang.Integer)v17).intValue()),((com.google.javascript.rhino.Node[])v18));
    Object v20 = 22;
    Object v21 = new com.google.javascript.rhino.Node[]{};
    Object v22 = new com.google.javascript.rhino.Node((((java.lang.Integer)v20).intValue()),((com.google.javascript.rhino.Node[])v21));
    ((com.google.javascript.jscomp.CheckGlobalThis)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v19),((com.google.javascript.rhino.Node)v22));
    Object v23 = null;
    org.junit.Assert.assertNull(v23);
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
    Object v8 = 22;
    Object v9 = new com.google.javascript.rhino.Node[]{};
    Object v10 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()),((com.google.javascript.rhino.Node[])v9));
    Object v11 = 22;
    Object v12 = new com.google.javascript.rhino.Node[]{};
    Object v13 = new com.google.javascript.rhino.Node((((java.lang.Integer)v11).intValue()),((com.google.javascript.rhino.Node[])v12));
    Object v14 = -42;
    ((com.google.javascript.rhino.Node)v13).removeProp((((java.lang.Integer)v14).intValue()));
    Object v15 = null;
    ((com.google.javascript.jscomp.CheckGlobalThis)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v13));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
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
    Object v8 = 22;
    Object v9 = new com.google.javascript.rhino.Node[]{};
    Object v10 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()),((com.google.javascript.rhino.Node[])v9));
    Object v11 = 22;
    Object v12 = new com.google.javascript.rhino.Node[]{};
    Object v13 = new com.google.javascript.rhino.Node((((java.lang.Integer)v11).intValue()),((com.google.javascript.rhino.Node[])v12));
    Object v14 = ((com.google.javascript.jscomp.CheckGlobalThis)v2).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v13));
    Object v15 = new com.google.javascript.jscomp.Compiler();
    Object v16 = new com.google.javascript.jscomp.Compiler();
    Object v17 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v18 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v16),((com.google.javascript.jscomp.CheckLevel)v17));
    Object v19 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v15),((com.google.javascript.jscomp.NodeTraversal.Callback)v18));
    Object v20 = 22;
    Object v21 = new com.google.javascript.rhino.Node[]{};
    Object v22 = new com.google.javascript.rhino.Node((((java.lang.Integer)v20).intValue()),((com.google.javascript.rhino.Node[])v21));
    Object v23 = "OTHER";
    Object v24 = "";
    Object v25 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v23),((java.lang.String)v24));
    Object v26 = new java.lang.String[]{"prototype"};
    Object v27 = ((com.google.javascript.jscomp.NodeTraversal)v19).makeError(((com.google.javascript.rhino.Node)v22),((com.google.javascript.jscomp.DiagnosticType)v25),((java.lang.String[])v26));
    Object v28 = 22;
    Object v29 = new com.google.javascript.rhino.Node[]{};
    Object v30 = new com.google.javascript.rhino.Node((((java.lang.Integer)v28).intValue()),((com.google.javascript.rhino.Node[])v29));
    Object v31 = 22;
    Object v32 = new com.google.javascript.rhino.Node[]{};
    Object v33 = new com.google.javascript.rhino.Node((((java.lang.Integer)v31).intValue()),((com.google.javascript.rhino.Node[])v32));
    Object v34 = ((com.google.javascript.rhino.Node)v33).children();
    Object v35 = ((com.google.javascript.jscomp.CheckGlobalThis)v2).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v19),((com.google.javascript.rhino.Node)v30),((com.google.javascript.rhino.Node)v33));
    org.junit.Assert.assertEquals((Object)(true), v35);
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
    Object v8 = 22;
    Object v9 = new com.google.javascript.rhino.Node[]{};
    Object v10 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()),((com.google.javascript.rhino.Node[])v9));
    Object v11 = 22;
    Object v12 = new com.google.javascript.rhino.Node[]{};
    Object v13 = new com.google.javascript.rhino.Node((((java.lang.Integer)v11).intValue()),((com.google.javascript.rhino.Node[])v12));
    Object v14 = ((com.google.javascript.jscomp.CheckGlobalThis)v2).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v13));
    org.junit.Assert.assertEquals((Object)(true), v14);
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
    Object v8 = 22;
    Object v9 = new com.google.javascript.rhino.Node[]{};
    Object v10 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()),((com.google.javascript.rhino.Node[])v9));
    Object v11 = 22;
    Object v12 = new com.google.javascript.rhino.Node[]{};
    Object v13 = new com.google.javascript.rhino.Node((((java.lang.Integer)v11).intValue()),((com.google.javascript.rhino.Node[])v12));
    ((com.google.javascript.jscomp.CheckGlobalThis)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
    Object v15 = new com.google.javascript.jscomp.Compiler();
    Object v16 = new com.google.javascript.jscomp.Compiler();
    Object v17 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v18 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v16),((com.google.javascript.jscomp.CheckLevel)v17));
    Object v19 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v15),((com.google.javascript.jscomp.NodeTraversal.Callback)v18));
    Object v20 = 22;
    Object v21 = new com.google.javascript.rhino.Node[]{};
    Object v22 = new com.google.javascript.rhino.Node((((java.lang.Integer)v20).intValue()),((com.google.javascript.rhino.Node[])v21));
    Object v23 = 22;
    Object v24 = new com.google.javascript.rhino.Node[]{};
    Object v25 = new com.google.javascript.rhino.Node((((java.lang.Integer)v23).intValue()),((com.google.javascript.rhino.Node[])v24));
    Object v26 = ((com.google.javascript.jscomp.CheckGlobalThis)v2).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v19),((com.google.javascript.rhino.Node)v22),((com.google.javascript.rhino.Node)v25));
    org.junit.Assert.assertEquals((Object)(true), v26);
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
    Object v8 = 22;
    Object v9 = new com.google.javascript.rhino.Node[]{};
    Object v10 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()),((com.google.javascript.rhino.Node[])v9));
    Object v11 = 22;
    Object v12 = new com.google.javascript.rhino.Node[]{};
    Object v13 = new com.google.javascript.rhino.Node((((java.lang.Integer)v11).intValue()),((com.google.javascript.rhino.Node[])v12));
    ((com.google.javascript.jscomp.CheckGlobalThis)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
    Object v15 = new com.google.javascript.jscomp.Compiler();
    Object v16 = new com.google.javascript.jscomp.Compiler();
    Object v17 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v18 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v16),((com.google.javascript.jscomp.CheckLevel)v17));
    Object v19 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v15),((com.google.javascript.jscomp.NodeTraversal.Callback)v18));
    Object v20 = 22;
    Object v21 = new com.google.javascript.rhino.Node[]{};
    Object v22 = new com.google.javascript.rhino.Node((((java.lang.Integer)v20).intValue()),((com.google.javascript.rhino.Node[])v21));
    Object v23 = 22;
    Object v24 = new com.google.javascript.rhino.Node[]{};
    Object v25 = new com.google.javascript.rhino.Node((((java.lang.Integer)v23).intValue()),((com.google.javascript.rhino.Node[])v24));
    ((com.google.javascript.jscomp.CheckGlobalThis)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v19),((com.google.javascript.rhino.Node)v22),((com.google.javascript.rhino.Node)v25));
    Object v26 = null;
    org.junit.Assert.assertNull(v26);
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
    Object v8 = 22;
    Object v9 = new com.google.javascript.rhino.Node[]{};
    Object v10 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()),((com.google.javascript.rhino.Node[])v9));
    Object v11 = 22;
    Object v12 = new com.google.javascript.rhino.Node[]{};
    Object v13 = new com.google.javascript.rhino.Node((((java.lang.Integer)v11).intValue()),((com.google.javascript.rhino.Node[])v12));
    Object v14 = ((com.google.javascript.jscomp.CheckGlobalThis)v2).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v13));
    Object v15 = new com.google.javascript.jscomp.Compiler();
    Object v16 = new com.google.javascript.jscomp.Compiler();
    Object v17 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v18 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v16),((com.google.javascript.jscomp.CheckLevel)v17));
    Object v19 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v15),((com.google.javascript.jscomp.NodeTraversal.Callback)v18));
    Object v20 = 22;
    Object v21 = new com.google.javascript.rhino.Node[]{};
    Object v22 = new com.google.javascript.rhino.Node((((java.lang.Integer)v20).intValue()),((com.google.javascript.rhino.Node[])v21));
    Object v23 = 22;
    Object v24 = new com.google.javascript.rhino.Node[]{};
    Object v25 = new com.google.javascript.rhino.Node((((java.lang.Integer)v23).intValue()),((com.google.javascript.rhino.Node[])v24));
    ((com.google.javascript.jscomp.CheckGlobalThis)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v19),((com.google.javascript.rhino.Node)v22),((com.google.javascript.rhino.Node)v25));
    Object v26 = null;
    org.junit.Assert.assertNull(v26);
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
    Object v8 = 22;
    Object v9 = new com.google.javascript.rhino.Node[]{};
    Object v10 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()),((com.google.javascript.rhino.Node[])v9));
    Object v11 = 22;
    Object v12 = new com.google.javascript.rhino.Node[]{};
    Object v13 = new com.google.javascript.rhino.Node((((java.lang.Integer)v11).intValue()),((com.google.javascript.rhino.Node[])v12));
    ((com.google.javascript.rhino.Node)v10).addChildToBack(((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
    Object v15 = 22;
    Object v16 = new com.google.javascript.rhino.Node[]{};
    Object v17 = new com.google.javascript.rhino.Node((((java.lang.Integer)v15).intValue()),((com.google.javascript.rhino.Node[])v16));
    ((com.google.javascript.jscomp.CheckGlobalThis)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v17));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
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
    Object v8 = 22;
    Object v9 = new com.google.javascript.rhino.Node[]{};
    Object v10 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()),((com.google.javascript.rhino.Node[])v9));
    Object v11 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v12 = "OTHER";
    Object v13 = "";
    Object v14 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = new java.lang.String[]{"1","msg.ano.side.effects",""};
    Object v16 = ((com.google.javascript.jscomp.NodeTraversal)v7).makeError(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.CheckLevel)v11),((com.google.javascript.jscomp.DiagnosticType)v14),((java.lang.String[])v15));
    Object v17 = 22;
    Object v18 = new com.google.javascript.rhino.Node[]{};
    Object v19 = new com.google.javascript.rhino.Node((((java.lang.Integer)v17).intValue()),((com.google.javascript.rhino.Node[])v18));
    Object v20 = 22;
    Object v21 = new com.google.javascript.rhino.Node[]{};
    Object v22 = new com.google.javascript.rhino.Node((((java.lang.Integer)v20).intValue()),((com.google.javascript.rhino.Node[])v21));
    Object v23 = false;
    ((com.google.javascript.rhino.Node)v22).setIsSyntheticBlock((((java.lang.Boolean)v23).booleanValue()));
    Object v24 = null;
    ((com.google.javascript.jscomp.CheckGlobalThis)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v19),((com.google.javascript.rhino.Node)v22));
    Object v25 = null;
    org.junit.Assert.assertNull(v25);
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
    Object v8 = 22;
    Object v9 = new com.google.javascript.rhino.Node[]{};
    Object v10 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()),((com.google.javascript.rhino.Node[])v9));
    Object v11 = 22;
    Object v12 = new com.google.javascript.rhino.Node[]{};
    Object v13 = new com.google.javascript.rhino.Node((((java.lang.Integer)v11).intValue()),((com.google.javascript.rhino.Node[])v12));
    ((com.google.javascript.jscomp.CheckGlobalThis)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
    Object v15 = new com.google.javascript.jscomp.Compiler();
    Object v16 = new com.google.javascript.jscomp.Compiler();
    Object v17 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v18 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v16),((com.google.javascript.jscomp.CheckLevel)v17));
    Object v19 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v15),((com.google.javascript.jscomp.NodeTraversal.Callback)v18));
    Object v20 = 22;
    Object v21 = new com.google.javascript.rhino.Node[]{};
    Object v22 = new com.google.javascript.rhino.Node((((java.lang.Integer)v20).intValue()),((com.google.javascript.rhino.Node[])v21));
    Object v23 = 22;
    Object v24 = new com.google.javascript.rhino.Node[]{};
    Object v25 = new com.google.javascript.rhino.Node((((java.lang.Integer)v23).intValue()),((com.google.javascript.rhino.Node[])v24));
    Object v26 = ((com.google.javascript.rhino.Node)v22).copyInformationFrom(((com.google.javascript.rhino.Node)v25));
    Object v27 = 22;
    Object v28 = new com.google.javascript.rhino.Node[]{};
    Object v29 = new com.google.javascript.rhino.Node((((java.lang.Integer)v27).intValue()),((com.google.javascript.rhino.Node[])v28));
    ((com.google.javascript.jscomp.CheckGlobalThis)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v19),((com.google.javascript.rhino.Node)v22),((com.google.javascript.rhino.Node)v29));
    Object v30 = null;
    org.junit.Assert.assertNull(v30);
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
    Object v8 = 22;
    Object v9 = new com.google.javascript.rhino.Node[]{};
    Object v10 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()),((com.google.javascript.rhino.Node[])v9));
    Object v11 = 22;
    Object v12 = new com.google.javascript.rhino.Node[]{};
    Object v13 = new com.google.javascript.rhino.Node((((java.lang.Integer)v11).intValue()),((com.google.javascript.rhino.Node[])v12));
    ((com.google.javascript.jscomp.CheckGlobalThis)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
    Object v15 = new com.google.javascript.jscomp.Compiler();
    Object v16 = new com.google.javascript.jscomp.Compiler();
    Object v17 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v18 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v16),((com.google.javascript.jscomp.CheckLevel)v17));
    Object v19 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v15),((com.google.javascript.jscomp.NodeTraversal.Callback)v18));
    Object v20 = 22;
    Object v21 = new com.google.javascript.rhino.Node[]{};
    Object v22 = new com.google.javascript.rhino.Node((((java.lang.Integer)v20).intValue()),((com.google.javascript.rhino.Node[])v21));
    Object v23 = "OTHER";
    Object v24 = "";
    Object v25 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v23),((java.lang.String)v24));
    Object v26 = new java.lang.String[]{"ESCXMATTR"};
    ((com.google.javascript.jscomp.NodeTraversal)v19).report(((com.google.javascript.rhino.Node)v22),((com.google.javascript.jscomp.DiagnosticType)v25),((java.lang.String[])v26));
    Object v27 = null;
    Object v28 = 22;
    Object v29 = new com.google.javascript.rhino.Node[]{};
    Object v30 = new com.google.javascript.rhino.Node((((java.lang.Integer)v28).intValue()),((com.google.javascript.rhino.Node[])v29));
    Object v31 = 22;
    Object v32 = new com.google.javascript.rhino.Node[]{};
    Object v33 = new com.google.javascript.rhino.Node((((java.lang.Integer)v31).intValue()),((com.google.javascript.rhino.Node[])v32));
    ((com.google.javascript.jscomp.CheckGlobalThis)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v19),((com.google.javascript.rhino.Node)v30),((com.google.javascript.rhino.Node)v33));
    Object v34 = null;
    org.junit.Assert.assertNull(v34);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v2 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v6 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.CheckLevel)v5));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = 22;
    Object v9 = new com.google.javascript.rhino.Node[]{};
    Object v10 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()),((com.google.javascript.rhino.Node[])v9));
    ((com.google.javascript.jscomp.NodeTraversal)v7).traverse(((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
    Object v12 = 22;
    Object v13 = new com.google.javascript.rhino.Node[]{};
    Object v14 = new com.google.javascript.rhino.Node((((java.lang.Integer)v12).intValue()),((com.google.javascript.rhino.Node[])v13));
    Object v15 = 22;
    Object v16 = new com.google.javascript.rhino.Node[]{};
    Object v17 = new com.google.javascript.rhino.Node((((java.lang.Integer)v15).intValue()),((com.google.javascript.rhino.Node[])v16));
    Object v18 = ((com.google.javascript.jscomp.CheckGlobalThis)v2).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.Node)v17));
    org.junit.Assert.assertEquals((Object)(true), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v2 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v6 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.CheckLevel)v5));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = 22;
    Object v9 = new com.google.javascript.rhino.Node[]{};
    Object v10 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()),((com.google.javascript.rhino.Node[])v9));
    Object v11 = false;
    Object v12 = true;
    Object v13 = true;
    Object v14 = ((com.google.javascript.rhino.Node)v10).toString((((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = 22;
    Object v16 = new com.google.javascript.rhino.Node[]{};
    Object v17 = new com.google.javascript.rhino.Node((((java.lang.Integer)v15).intValue()),((com.google.javascript.rhino.Node[])v16));
    Object v18 = 1;
    ((com.google.javascript.rhino.Node)v17).setType((((java.lang.Integer)v18).intValue()));
    Object v19 = null;
    Object v20 = ((com.google.javascript.jscomp.CheckGlobalThis)v2).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v17));
    org.junit.Assert.assertEquals((Object)(true), v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v2 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v6 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.CheckLevel)v5));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = ((com.google.javascript.jscomp.NodeTraversal)v7).hasScope();
    Object v9 = 22;
    Object v10 = new com.google.javascript.rhino.Node[]{};
    Object v11 = new com.google.javascript.rhino.Node((((java.lang.Integer)v9).intValue()),((com.google.javascript.rhino.Node[])v10));
    Object v12 = 22;
    Object v13 = new com.google.javascript.rhino.Node[]{};
    Object v14 = new com.google.javascript.rhino.Node((((java.lang.Integer)v12).intValue()),((com.google.javascript.rhino.Node[])v13));
    Object v15 = ((com.google.javascript.jscomp.CheckGlobalThis)v2).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v14));
    org.junit.Assert.assertEquals((Object)(true), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v2 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v6 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.CheckLevel)v5));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = 22;
    Object v9 = new com.google.javascript.rhino.Node[]{};
    Object v10 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()),((com.google.javascript.rhino.Node[])v9));
    Object v11 = 22;
    Object v12 = new com.google.javascript.rhino.Node[]{};
    Object v13 = new com.google.javascript.rhino.Node((((java.lang.Integer)v11).intValue()),((com.google.javascript.rhino.Node[])v12));
    Object v14 = ((com.google.javascript.rhino.Node)v13).siblings();
    Object v15 = ((com.google.javascript.jscomp.CheckGlobalThis)v2).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v13));
    org.junit.Assert.assertEquals((Object)(true), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v2 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v6 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.CheckLevel)v5));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = 22;
    Object v9 = new com.google.javascript.rhino.Node[]{};
    Object v10 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()),((com.google.javascript.rhino.Node[])v9));
    Object v11 = 22;
    Object v12 = new com.google.javascript.rhino.Node[]{};
    Object v13 = new com.google.javascript.rhino.Node((((java.lang.Integer)v11).intValue()),((com.google.javascript.rhino.Node[])v12));
    Object v14 = ((com.google.javascript.rhino.Node)v13).getAncestors();
    Object v15 = ((com.google.javascript.jscomp.CheckGlobalThis)v2).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v13));
    org.junit.Assert.assertEquals((Object)(true), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v3 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v2 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v6 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.CheckLevel)v5));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = 22;
    Object v9 = new com.google.javascript.rhino.Node[]{};
    Object v10 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()),((com.google.javascript.rhino.Node[])v9));
    Object v11 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v12 = "OTHER";
    Object v13 = "";
    Object v14 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = new java.lang.String[]{"l","\n","arguments"};
    Object v16 = ((com.google.javascript.jscomp.NodeTraversal)v7).makeError(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.CheckLevel)v11),((com.google.javascript.jscomp.DiagnosticType)v14),((java.lang.String[])v15));
    Object v17 = 22;
    Object v18 = new com.google.javascript.rhino.Node[]{};
    Object v19 = new com.google.javascript.rhino.Node((((java.lang.Integer)v17).intValue()),((com.google.javascript.rhino.Node[])v18));
    Object v20 = 22;
    Object v21 = new com.google.javascript.rhino.Node[]{};
    Object v22 = new com.google.javascript.rhino.Node((((java.lang.Integer)v20).intValue()),((com.google.javascript.rhino.Node[])v21));
    ((com.google.javascript.jscomp.CheckGlobalThis)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v19),((com.google.javascript.rhino.Node)v22));
    Object v23 = null;
    org.junit.Assert.assertNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v3 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v7 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.CheckLevel)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = 22;
    Object v10 = new com.google.javascript.rhino.Node[]{};
    Object v11 = new com.google.javascript.rhino.Node((((java.lang.Integer)v9).intValue()),((com.google.javascript.rhino.Node[])v10));
    Object v12 = 22;
    Object v13 = new com.google.javascript.rhino.Node[]{};
    Object v14 = new com.google.javascript.rhino.Node((((java.lang.Integer)v12).intValue()),((com.google.javascript.rhino.Node[])v13));
    ((com.google.javascript.jscomp.CheckGlobalThis)v3).visit(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v14));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v2 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v6 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.CheckLevel)v5));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = 22;
    Object v9 = new com.google.javascript.rhino.Node[]{};
    Object v10 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()),((com.google.javascript.rhino.Node[])v9));
    Object v11 = 22;
    Object v12 = new com.google.javascript.rhino.Node[]{};
    Object v13 = new com.google.javascript.rhino.Node((((java.lang.Integer)v11).intValue()),((com.google.javascript.rhino.Node[])v12));
    Object v14 = ((com.google.javascript.rhino.Node)v13).siblings();
    ((com.google.javascript.jscomp.CheckGlobalThis)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v13));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v2 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v6 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.CheckLevel)v5));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = 22;
    Object v9 = new com.google.javascript.rhino.Node[]{};
    Object v10 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()),((com.google.javascript.rhino.Node[])v9));
    Object v11 = 22;
    Object v12 = new com.google.javascript.rhino.Node[]{};
    Object v13 = new com.google.javascript.rhino.Node((((java.lang.Integer)v11).intValue()),((com.google.javascript.rhino.Node[])v12));
    Object v14 = ((com.google.javascript.jscomp.CheckGlobalThis)v2).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v13));
    Object v15 = new com.google.javascript.jscomp.Compiler();
    Object v16 = new com.google.javascript.jscomp.Compiler();
    Object v17 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v18 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v16),((com.google.javascript.jscomp.CheckLevel)v17));
    Object v19 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v15),((com.google.javascript.jscomp.NodeTraversal.Callback)v18));
    Object v20 = 22;
    Object v21 = new com.google.javascript.rhino.Node[]{};
    Object v22 = new com.google.javascript.rhino.Node((((java.lang.Integer)v20).intValue()),((com.google.javascript.rhino.Node[])v21));
    Object v23 = 22;
    Object v24 = new com.google.javascript.rhino.Node[]{};
    Object v25 = new com.google.javascript.rhino.Node((((java.lang.Integer)v23).intValue()),((com.google.javascript.rhino.Node[])v24));
    Object v26 = ((com.google.javascript.jscomp.CheckGlobalThis)v2).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v19),((com.google.javascript.rhino.Node)v22),((com.google.javascript.rhino.Node)v25));
    org.junit.Assert.assertEquals((Object)(true), v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v2 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v6 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.CheckLevel)v5));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = ((com.google.javascript.jscomp.NodeTraversal)v7).getScope();
    Object v9 = 22;
    Object v10 = new com.google.javascript.rhino.Node[]{};
    Object v11 = new com.google.javascript.rhino.Node((((java.lang.Integer)v9).intValue()),((com.google.javascript.rhino.Node[])v10));
    Object v12 = 22;
    Object v13 = new com.google.javascript.rhino.Node[]{};
    Object v14 = new com.google.javascript.rhino.Node((((java.lang.Integer)v12).intValue()),((com.google.javascript.rhino.Node[])v13));
    Object v15 = ((com.google.javascript.jscomp.CheckGlobalThis)v2).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v14));
    org.junit.Assert.assertEquals((Object)(true), v15);
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
    Object v8 = 22;
    Object v9 = new com.google.javascript.rhino.Node[]{};
    Object v10 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()),((com.google.javascript.rhino.Node[])v9));
    Object v11 = true;
    ((com.google.javascript.rhino.Node)v10).setWasEmptyNode((((java.lang.Boolean)v11).booleanValue()));
    Object v12 = null;
    Object v13 = 22;
    Object v14 = new com.google.javascript.rhino.Node[]{};
    Object v15 = new com.google.javascript.rhino.Node((((java.lang.Integer)v13).intValue()),((com.google.javascript.rhino.Node[])v14));
    ((com.google.javascript.jscomp.CheckGlobalThis)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v3 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v7 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.CheckLevel)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = 22;
    Object v10 = new com.google.javascript.rhino.Node[]{};
    Object v11 = new com.google.javascript.rhino.Node((((java.lang.Integer)v9).intValue()),((com.google.javascript.rhino.Node[])v10));
    Object v12 = 22;
    Object v13 = new com.google.javascript.rhino.Node[]{};
    Object v14 = new com.google.javascript.rhino.Node((((java.lang.Integer)v12).intValue()),((com.google.javascript.rhino.Node[])v13));
    Object v15 = ((com.google.javascript.jscomp.CheckGlobalThis)v3).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v14));
    Object v16 = new com.google.javascript.jscomp.Compiler();
    Object v17 = new com.google.javascript.jscomp.Compiler();
    Object v18 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v19 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v17),((com.google.javascript.jscomp.CheckLevel)v18));
    Object v20 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v16),((com.google.javascript.jscomp.NodeTraversal.Callback)v19));
    Object v21 = 22;
    Object v22 = new com.google.javascript.rhino.Node[]{};
    Object v23 = new com.google.javascript.rhino.Node((((java.lang.Integer)v21).intValue()),((com.google.javascript.rhino.Node[])v22));
    Object v24 = 22;
    Object v25 = new com.google.javascript.rhino.Node[]{};
    Object v26 = new com.google.javascript.rhino.Node((((java.lang.Integer)v24).intValue()),((com.google.javascript.rhino.Node[])v25));
    ((com.google.javascript.jscomp.CheckGlobalThis)v3).visit(((com.google.javascript.jscomp.NodeTraversal)v20),((com.google.javascript.rhino.Node)v23),((com.google.javascript.rhino.Node)v26));
    Object v27 = null;
    org.junit.Assert.assertNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v3 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v7 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.CheckLevel)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = 22;
    Object v10 = new com.google.javascript.rhino.Node[]{};
    Object v11 = new com.google.javascript.rhino.Node((((java.lang.Integer)v9).intValue()),((com.google.javascript.rhino.Node[])v10));
    Object v12 = "OTHER";
    Object v13 = "";
    Object v14 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = new java.lang.String[]{";",""};
    ((com.google.javascript.jscomp.NodeTraversal)v8).report(((com.google.javascript.rhino.Node)v11),((com.google.javascript.jscomp.DiagnosticType)v14),((java.lang.String[])v15));
    Object v16 = null;
    Object v17 = 22;
    Object v18 = new com.google.javascript.rhino.Node[]{};
    Object v19 = new com.google.javascript.rhino.Node((((java.lang.Integer)v17).intValue()),((com.google.javascript.rhino.Node[])v18));
    Object v20 = 22;
    Object v21 = new com.google.javascript.rhino.Node[]{};
    Object v22 = new com.google.javascript.rhino.Node((((java.lang.Integer)v20).intValue()),((com.google.javascript.rhino.Node[])v21));
    ((com.google.javascript.jscomp.CheckGlobalThis)v3).visit(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v19),((com.google.javascript.rhino.Node)v22));
    Object v23 = null;
    org.junit.Assert.assertNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v2 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v6 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.CheckLevel)v5));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = 22;
    Object v9 = new com.google.javascript.rhino.Node[]{};
    Object v10 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()),((com.google.javascript.rhino.Node[])v9));
    Object v11 = "OTHER";
    Object v12 = "";
    Object v13 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = new java.lang.String[]{"7'",""};
    Object v15 = ((com.google.javascript.jscomp.NodeTraversal)v7).makeError(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.DiagnosticType)v13),((java.lang.String[])v14));
    Object v16 = 22;
    Object v17 = new com.google.javascript.rhino.Node[]{};
    Object v18 = new com.google.javascript.rhino.Node((((java.lang.Integer)v16).intValue()),((com.google.javascript.rhino.Node[])v17));
    Object v19 = 22;
    Object v20 = new com.google.javascript.rhino.Node[]{};
    Object v21 = new com.google.javascript.rhino.Node((((java.lang.Integer)v19).intValue()),((com.google.javascript.rhino.Node[])v20));
    ((com.google.javascript.jscomp.CheckGlobalThis)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v18),((com.google.javascript.rhino.Node)v21));
    Object v22 = null;
    org.junit.Assert.assertNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v3 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v7 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.CheckLevel)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = 22;
    Object v10 = new com.google.javascript.rhino.Node[]{};
    Object v11 = new com.google.javascript.rhino.Node((((java.lang.Integer)v9).intValue()),((com.google.javascript.rhino.Node[])v10));
    Object v12 = 22;
    Object v13 = new com.google.javascript.rhino.Node[]{};
    Object v14 = new com.google.javascript.rhino.Node((((java.lang.Integer)v12).intValue()),((com.google.javascript.rhino.Node[])v13));
    ((com.google.javascript.jscomp.CheckGlobalThis)v3).visit(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v14));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.Compiler();
    Object v17 = new com.google.javascript.jscomp.Compiler();
    Object v18 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v19 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v17),((com.google.javascript.jscomp.CheckLevel)v18));
    Object v20 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v16),((com.google.javascript.jscomp.NodeTraversal.Callback)v19));
    Object v21 = 22;
    Object v22 = new com.google.javascript.rhino.Node[]{};
    Object v23 = new com.google.javascript.rhino.Node((((java.lang.Integer)v21).intValue()),((com.google.javascript.rhino.Node[])v22));
    Object v24 = 22;
    Object v25 = new com.google.javascript.rhino.Node[]{};
    Object v26 = new com.google.javascript.rhino.Node((((java.lang.Integer)v24).intValue()),((com.google.javascript.rhino.Node[])v25));
    Object v27 = ((com.google.javascript.jscomp.CheckGlobalThis)v3).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v20),((com.google.javascript.rhino.Node)v23),((com.google.javascript.rhino.Node)v26));
    org.junit.Assert.assertEquals((Object)(true), v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v3 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v7 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.CheckLevel)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = 22;
    Object v10 = new com.google.javascript.rhino.Node[]{};
    Object v11 = new com.google.javascript.rhino.Node((((java.lang.Integer)v9).intValue()),((com.google.javascript.rhino.Node[])v10));
    Object v12 = 22;
    Object v13 = new com.google.javascript.rhino.Node[]{};
    Object v14 = new com.google.javascript.rhino.Node((((java.lang.Integer)v12).intValue()),((com.google.javascript.rhino.Node[])v13));
    ((com.google.javascript.rhino.Node)v11).addChildrenToBack(((com.google.javascript.rhino.Node)v14));
    Object v15 = null;
    Object v16 = 22;
    Object v17 = new com.google.javascript.rhino.Node[]{};
    Object v18 = new com.google.javascript.rhino.Node((((java.lang.Integer)v16).intValue()),((com.google.javascript.rhino.Node[])v17));
    Object v19 = ((com.google.javascript.jscomp.CheckGlobalThis)v3).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v18));
    org.junit.Assert.assertEquals((Object)(true), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v2 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v6 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.CheckLevel)v5));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = 22;
    Object v9 = new com.google.javascript.rhino.Node[]{};
    Object v10 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()),((com.google.javascript.rhino.Node[])v9));
    Object v11 = false;
    ((com.google.javascript.rhino.Node)v10).setVarArgs((((java.lang.Boolean)v11).booleanValue()));
    Object v12 = null;
    Object v13 = 22;
    Object v14 = new com.google.javascript.rhino.Node[]{};
    Object v15 = new com.google.javascript.rhino.Node((((java.lang.Integer)v13).intValue()),((com.google.javascript.rhino.Node[])v14));
    Object v16 = ((com.google.javascript.jscomp.CheckGlobalThis)v2).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v15));
    org.junit.Assert.assertEquals((Object)(true), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v3 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v7 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.CheckLevel)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = 22;
    Object v10 = new com.google.javascript.rhino.Node[]{};
    Object v11 = new com.google.javascript.rhino.Node((((java.lang.Integer)v9).intValue()),((com.google.javascript.rhino.Node[])v10));
    Object v12 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v13 = "OTHER";
    Object v14 = "";
    Object v15 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = new java.lang.String[]{""};
    Object v17 = ((com.google.javascript.jscomp.NodeTraversal)v8).makeError(((com.google.javascript.rhino.Node)v11),((com.google.javascript.jscomp.CheckLevel)v12),((com.google.javascript.jscomp.DiagnosticType)v15),((java.lang.String[])v16));
    Object v18 = 22;
    Object v19 = new com.google.javascript.rhino.Node[]{};
    Object v20 = new com.google.javascript.rhino.Node((((java.lang.Integer)v18).intValue()),((com.google.javascript.rhino.Node[])v19));
    Object v21 = -13;
    ((com.google.javascript.rhino.Node)v20).removeProp((((java.lang.Integer)v21).intValue()));
    Object v22 = null;
    Object v23 = 22;
    Object v24 = new com.google.javascript.rhino.Node[]{};
    Object v25 = new com.google.javascript.rhino.Node((((java.lang.Integer)v23).intValue()),((com.google.javascript.rhino.Node[])v24));
    Object v26 = 0;
    ((com.google.javascript.rhino.Node)v25).setType((((java.lang.Integer)v26).intValue()));
    Object v27 = null;
    Object v28 = ((com.google.javascript.jscomp.CheckGlobalThis)v3).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.Node)v25));
    org.junit.Assert.assertEquals((Object)(true), v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v3 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v7 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.CheckLevel)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = ((com.google.javascript.jscomp.NodeTraversal)v8).getScope();
    Object v10 = 22;
    Object v11 = new com.google.javascript.rhino.Node[]{};
    Object v12 = new com.google.javascript.rhino.Node((((java.lang.Integer)v10).intValue()),((com.google.javascript.rhino.Node[])v11));
    Object v13 = 22;
    Object v14 = new com.google.javascript.rhino.Node[]{};
    Object v15 = new com.google.javascript.rhino.Node((((java.lang.Integer)v13).intValue()),((com.google.javascript.rhino.Node[])v14));
    ((com.google.javascript.jscomp.CheckGlobalThis)v3).visit(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
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
    Object v8 = 22;
    Object v9 = new com.google.javascript.rhino.Node[]{};
    Object v10 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()),((com.google.javascript.rhino.Node[])v9));
    Object v11 = 22;
    Object v12 = new com.google.javascript.rhino.Node[]{};
    Object v13 = new com.google.javascript.rhino.Node((((java.lang.Integer)v11).intValue()),((com.google.javascript.rhino.Node[])v12));
    Object v14 = 22;
    Object v15 = new com.google.javascript.rhino.Node[]{};
    Object v16 = new com.google.javascript.rhino.Node((((java.lang.Integer)v14).intValue()),((com.google.javascript.rhino.Node[])v15));
    Object v17 = ((com.google.javascript.rhino.Node)v13).copyInformationFromForTree(((com.google.javascript.rhino.Node)v16));
    ((com.google.javascript.jscomp.CheckGlobalThis)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v13));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v2 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v6 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.CheckLevel)v5));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = 22;
    Object v9 = new com.google.javascript.rhino.Node[]{};
    Object v10 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()),((com.google.javascript.rhino.Node[])v9));
    Object v11 = ((com.google.javascript.rhino.Node)v10).hasSideEffects();
    Object v12 = 22;
    Object v13 = new com.google.javascript.rhino.Node[]{};
    Object v14 = new com.google.javascript.rhino.Node((((java.lang.Integer)v12).intValue()),((com.google.javascript.rhino.Node[])v13));
    Object v15 = 22;
    Object v16 = new com.google.javascript.rhino.Node[]{};
    Object v17 = new com.google.javascript.rhino.Node((((java.lang.Integer)v15).intValue()),((com.google.javascript.rhino.Node[])v16));
    Object v18 = ((com.google.javascript.rhino.Node)v14).checkTreeTypeAwareEqualsSilent(((com.google.javascript.rhino.Node)v17));
    ((com.google.javascript.jscomp.CheckGlobalThis)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v14));
    Object v19 = null;
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v3 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v7 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.CheckLevel)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = 22;
    Object v10 = new com.google.javascript.rhino.Node[]{};
    Object v11 = new com.google.javascript.rhino.Node((((java.lang.Integer)v9).intValue()),((com.google.javascript.rhino.Node[])v10));
    Object v12 = -14;
    ((com.google.javascript.rhino.Node)v11).setLineno((((java.lang.Integer)v12).intValue()));
    Object v13 = null;
    Object v14 = 22;
    Object v15 = new com.google.javascript.rhino.Node[]{};
    Object v16 = new com.google.javascript.rhino.Node((((java.lang.Integer)v14).intValue()),((com.google.javascript.rhino.Node[])v15));
    Object v17 = ((com.google.javascript.jscomp.CheckGlobalThis)v3).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v16));
    org.junit.Assert.assertEquals((Object)(true), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v3 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v7 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.CheckLevel)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = ((com.google.javascript.jscomp.NodeTraversal)v8).getEnclosingFunction();
    Object v10 = 22;
    Object v11 = new com.google.javascript.rhino.Node[]{};
    Object v12 = new com.google.javascript.rhino.Node((((java.lang.Integer)v10).intValue()),((com.google.javascript.rhino.Node[])v11));
    Object v13 = ((com.google.javascript.rhino.Node)v12).children();
    Object v14 = 22;
    Object v15 = new com.google.javascript.rhino.Node[]{};
    Object v16 = new com.google.javascript.rhino.Node((((java.lang.Integer)v14).intValue()),((com.google.javascript.rhino.Node[])v15));
    Object v17 = ((com.google.javascript.jscomp.CheckGlobalThis)v3).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v16));
    org.junit.Assert.assertEquals((Object)(true), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v2 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v6 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.CheckLevel)v5));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = 22;
    Object v9 = new com.google.javascript.rhino.Node[]{};
    Object v10 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()),((com.google.javascript.rhino.Node[])v9));
    Object v11 = 22;
    Object v12 = new com.google.javascript.rhino.Node[]{};
    Object v13 = new com.google.javascript.rhino.Node((((java.lang.Integer)v11).intValue()),((com.google.javascript.rhino.Node[])v12));
    Object v14 = 1;
    Object v15 = "OTHER";
    Object v16 = "";
    Object v17 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v15),((java.lang.String)v16));
    ((com.google.javascript.rhino.Node)v13).putProp((((java.lang.Integer)v14).intValue()),((java.lang.Object)v17));
    Object v18 = null;
    Object v19 = ((com.google.javascript.jscomp.CheckGlobalThis)v2).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v13));
    org.junit.Assert.assertEquals((Object)(true), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v3 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v7 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.CheckLevel)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = 22;
    Object v10 = new com.google.javascript.rhino.Node[]{};
    Object v11 = new com.google.javascript.rhino.Node((((java.lang.Integer)v9).intValue()),((com.google.javascript.rhino.Node[])v10));
    Object v12 = 22;
    Object v13 = new com.google.javascript.rhino.Node[]{};
    Object v14 = new com.google.javascript.rhino.Node((((java.lang.Integer)v12).intValue()),((com.google.javascript.rhino.Node[])v13));
    Object v15 = 1;
    ((com.google.javascript.rhino.Node)v14).removeProp((((java.lang.Integer)v15).intValue()));
    Object v16 = null;
    Object v17 = ((com.google.javascript.jscomp.CheckGlobalThis)v3).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v14));
    org.junit.Assert.assertEquals((Object)(true), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v3 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v7 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.CheckLevel)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = 22;
    Object v10 = new com.google.javascript.rhino.Node[]{};
    Object v11 = new com.google.javascript.rhino.Node((((java.lang.Integer)v9).intValue()),((com.google.javascript.rhino.Node[])v10));
    Object v12 = 22;
    Object v13 = new com.google.javascript.rhino.Node[]{};
    Object v14 = new com.google.javascript.rhino.Node((((java.lang.Integer)v12).intValue()),((com.google.javascript.rhino.Node[])v13));
    ((com.google.javascript.jscomp.CheckGlobalThis)v3).visit(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v14));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.Compiler();
    Object v17 = new com.google.javascript.jscomp.Compiler();
    Object v18 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v19 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v17),((com.google.javascript.jscomp.CheckLevel)v18));
    Object v20 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v16),((com.google.javascript.jscomp.NodeTraversal.Callback)v19));
    Object v21 = 22;
    Object v22 = new com.google.javascript.rhino.Node[]{};
    Object v23 = new com.google.javascript.rhino.Node((((java.lang.Integer)v21).intValue()),((com.google.javascript.rhino.Node[])v22));
    Object v24 = 22;
    Object v25 = new com.google.javascript.rhino.Node[]{};
    Object v26 = new com.google.javascript.rhino.Node((((java.lang.Integer)v24).intValue()),((com.google.javascript.rhino.Node[])v25));
    ((com.google.javascript.jscomp.CheckGlobalThis)v3).visit(((com.google.javascript.jscomp.NodeTraversal)v20),((com.google.javascript.rhino.Node)v23),((com.google.javascript.rhino.Node)v26));
    Object v27 = null;
    org.junit.Assert.assertNull(v27);
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
    Object v8 = 22;
    Object v9 = new com.google.javascript.rhino.Node[]{};
    Object v10 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()),((com.google.javascript.rhino.Node[])v9));
    Object v11 = 22;
    Object v12 = new com.google.javascript.rhino.Node[]{};
    Object v13 = new com.google.javascript.rhino.Node((((java.lang.Integer)v11).intValue()),((com.google.javascript.rhino.Node[])v12));
    Object v14 = 22;
    Object v15 = new com.google.javascript.rhino.Node[]{};
    Object v16 = new com.google.javascript.rhino.Node((((java.lang.Integer)v14).intValue()),((com.google.javascript.rhino.Node[])v15));
    ((com.google.javascript.rhino.Node)v13).addChildToBack(((com.google.javascript.rhino.Node)v16));
    Object v17 = null;
    Object v18 = ((com.google.javascript.jscomp.CheckGlobalThis)v2).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v13));
    org.junit.Assert.assertEquals((Object)(true), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v3 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v7 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.CheckLevel)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = 22;
    Object v10 = new com.google.javascript.rhino.Node[]{};
    Object v11 = new com.google.javascript.rhino.Node((((java.lang.Integer)v9).intValue()),((com.google.javascript.rhino.Node[])v10));
    Object v12 = 22;
    Object v13 = new com.google.javascript.rhino.Node[]{};
    Object v14 = new com.google.javascript.rhino.Node((((java.lang.Integer)v12).intValue()),((com.google.javascript.rhino.Node[])v13));
    Object v15 = ((com.google.javascript.jscomp.CheckGlobalThis)v3).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v14));
    org.junit.Assert.assertEquals((Object)(true), v15);
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
    Object v8 = ((com.google.javascript.jscomp.NodeTraversal)v7).hasScope();
    Object v9 = 22;
    Object v10 = new com.google.javascript.rhino.Node[]{};
    Object v11 = new com.google.javascript.rhino.Node((((java.lang.Integer)v9).intValue()),((com.google.javascript.rhino.Node[])v10));
    Object v12 = 22;
    Object v13 = new com.google.javascript.rhino.Node[]{};
    Object v14 = new com.google.javascript.rhino.Node((((java.lang.Integer)v12).intValue()),((com.google.javascript.rhino.Node[])v13));
    Object v15 = true;
    ((com.google.javascript.rhino.Node)v14).setOptionalArg((((java.lang.Boolean)v15).booleanValue()));
    Object v16 = null;
    Object v17 = ((com.google.javascript.jscomp.CheckGlobalThis)v2).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v14));
    org.junit.Assert.assertEquals((Object)(true), v17);
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
    Object v8 = 22;
    Object v9 = new com.google.javascript.rhino.Node[]{};
    Object v10 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()),((com.google.javascript.rhino.Node[])v9));
    Object v11 = 22;
    Object v12 = new com.google.javascript.rhino.Node[]{};
    Object v13 = new com.google.javascript.rhino.Node((((java.lang.Integer)v11).intValue()),((com.google.javascript.rhino.Node[])v12));
    Object v14 = ((com.google.javascript.jscomp.CheckGlobalThis)v2).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v13));
    Object v15 = new com.google.javascript.jscomp.Compiler();
    Object v16 = new com.google.javascript.jscomp.Compiler();
    Object v17 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v18 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v16),((com.google.javascript.jscomp.CheckLevel)v17));
    Object v19 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v15),((com.google.javascript.jscomp.NodeTraversal.Callback)v18));
    Object v20 = ((com.google.javascript.jscomp.NodeTraversal)v19).getScope();
    Object v21 = 22;
    Object v22 = new com.google.javascript.rhino.Node[]{};
    Object v23 = new com.google.javascript.rhino.Node((((java.lang.Integer)v21).intValue()),((com.google.javascript.rhino.Node[])v22));
    Object v24 = 22;
    Object v25 = new com.google.javascript.rhino.Node[]{};
    Object v26 = new com.google.javascript.rhino.Node((((java.lang.Integer)v24).intValue()),((com.google.javascript.rhino.Node[])v25));
    ((com.google.javascript.jscomp.CheckGlobalThis)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v19),((com.google.javascript.rhino.Node)v23),((com.google.javascript.rhino.Node)v26));
    Object v27 = null;
    org.junit.Assert.assertNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v3 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v7 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.CheckLevel)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = 22;
    Object v10 = new com.google.javascript.rhino.Node[]{};
    Object v11 = new com.google.javascript.rhino.Node((((java.lang.Integer)v9).intValue()),((com.google.javascript.rhino.Node[])v10));
    Object v12 = 22;
    Object v13 = new com.google.javascript.rhino.Node[]{};
    Object v14 = new com.google.javascript.rhino.Node((((java.lang.Integer)v12).intValue()),((com.google.javascript.rhino.Node[])v13));
    Object v15 = 1;
    ((com.google.javascript.rhino.Node)v14).setLineno((((java.lang.Integer)v15).intValue()));
    Object v16 = null;
    ((com.google.javascript.jscomp.CheckGlobalThis)v3).visit(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v14));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v2 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v6 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.CheckLevel)v5));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = ((com.google.javascript.jscomp.NodeTraversal)v7).hasScope();
    Object v9 = 22;
    Object v10 = new com.google.javascript.rhino.Node[]{};
    Object v11 = new com.google.javascript.rhino.Node((((java.lang.Integer)v9).intValue()),((com.google.javascript.rhino.Node[])v10));
    Object v12 = 22;
    Object v13 = new com.google.javascript.rhino.Node[]{};
    Object v14 = new com.google.javascript.rhino.Node((((java.lang.Integer)v12).intValue()),((com.google.javascript.rhino.Node[])v13));
    ((com.google.javascript.jscomp.CheckGlobalThis)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v14));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v3 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v7 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.CheckLevel)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = 22;
    Object v10 = new com.google.javascript.rhino.Node[]{};
    Object v11 = new com.google.javascript.rhino.Node((((java.lang.Integer)v9).intValue()),((com.google.javascript.rhino.Node[])v10));
    Object v12 = "OTHER";
    Object v13 = "";
    Object v14 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = new java.lang.String[]{"Q","","FILE_OVER5IEW"};
    ((com.google.javascript.jscomp.NodeTraversal)v8).report(((com.google.javascript.rhino.Node)v11),((com.google.javascript.jscomp.DiagnosticType)v14),((java.lang.String[])v15));
    Object v16 = null;
    Object v17 = 22;
    Object v18 = new com.google.javascript.rhino.Node[]{};
    Object v19 = new com.google.javascript.rhino.Node((((java.lang.Integer)v17).intValue()),((com.google.javascript.rhino.Node[])v18));
    Object v20 = 22;
    Object v21 = new com.google.javascript.rhino.Node[]{};
    Object v22 = new com.google.javascript.rhino.Node((((java.lang.Integer)v20).intValue()),((com.google.javascript.rhino.Node[])v21));
    ((com.google.javascript.jscomp.CheckGlobalThis)v3).visit(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v19),((com.google.javascript.rhino.Node)v22));
    Object v23 = null;
    org.junit.Assert.assertNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v3 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v7 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.CheckLevel)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = 22;
    Object v10 = new com.google.javascript.rhino.Node[]{};
    Object v11 = new com.google.javascript.rhino.Node((((java.lang.Integer)v9).intValue()),((com.google.javascript.rhino.Node[])v10));
    Object v12 = -12;
    ((com.google.javascript.rhino.Node)v11).setCharno((((java.lang.Integer)v12).intValue()));
    Object v13 = null;
    Object v14 = 22;
    Object v15 = new com.google.javascript.rhino.Node[]{};
    Object v16 = new com.google.javascript.rhino.Node((((java.lang.Integer)v14).intValue()),((com.google.javascript.rhino.Node[])v15));
    ((com.google.javascript.jscomp.CheckGlobalThis)v3).visit(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v16));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v2 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v6 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.CheckLevel)v5));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = 22;
    Object v9 = new com.google.javascript.rhino.Node[]{};
    Object v10 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()),((com.google.javascript.rhino.Node[])v9));
    Object v11 = 22;
    Object v12 = new com.google.javascript.rhino.Node[]{};
    Object v13 = new com.google.javascript.rhino.Node((((java.lang.Integer)v11).intValue()),((com.google.javascript.rhino.Node[])v12));
    ((com.google.javascript.jscomp.CheckGlobalThis)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
    Object v15 = new com.google.javascript.jscomp.Compiler();
    Object v16 = new com.google.javascript.jscomp.Compiler();
    Object v17 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v18 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v16),((com.google.javascript.jscomp.CheckLevel)v17));
    Object v19 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v15),((com.google.javascript.jscomp.NodeTraversal.Callback)v18));
    Object v20 = 22;
    Object v21 = new com.google.javascript.rhino.Node[]{};
    Object v22 = new com.google.javascript.rhino.Node((((java.lang.Integer)v20).intValue()),((com.google.javascript.rhino.Node[])v21));
    Object v23 = "OTHER";
    Object v24 = "";
    Object v25 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v23),((java.lang.String)v24));
    Object v26 = new java.lang.String[]{"","PRIVATE"};
    Object v27 = ((com.google.javascript.jscomp.NodeTraversal)v19).makeError(((com.google.javascript.rhino.Node)v22),((com.google.javascript.jscomp.DiagnosticType)v25),((java.lang.String[])v26));
    Object v28 = 22;
    Object v29 = new com.google.javascript.rhino.Node[]{};
    Object v30 = new com.google.javascript.rhino.Node((((java.lang.Integer)v28).intValue()),((com.google.javascript.rhino.Node[])v29));
    Object v31 = 22;
    Object v32 = new com.google.javascript.rhino.Node[]{};
    Object v33 = new com.google.javascript.rhino.Node((((java.lang.Integer)v31).intValue()),((com.google.javascript.rhino.Node[])v32));
    Object v34 = true;
    ((com.google.javascript.rhino.Node)v33).setOptionalArg((((java.lang.Boolean)v34).booleanValue()));
    Object v35 = null;
    ((com.google.javascript.jscomp.CheckGlobalThis)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v19),((com.google.javascript.rhino.Node)v30),((com.google.javascript.rhino.Node)v33));
    Object v36 = null;
    org.junit.Assert.assertNull(v36);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v2 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v3 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v7 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.CheckLevel)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = 22;
    Object v10 = new com.google.javascript.rhino.Node[]{};
    Object v11 = new com.google.javascript.rhino.Node((((java.lang.Integer)v9).intValue()),((com.google.javascript.rhino.Node[])v10));
    Object v12 = 22;
    Object v13 = new com.google.javascript.rhino.Node[]{};
    Object v14 = new com.google.javascript.rhino.Node((((java.lang.Integer)v12).intValue()),((com.google.javascript.rhino.Node[])v13));
    Object v15 = true;
    ((com.google.javascript.rhino.Node)v14).setVarArgs((((java.lang.Boolean)v15).booleanValue()));
    Object v16 = null;
    Object v17 = ((com.google.javascript.jscomp.CheckGlobalThis)v3).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v14));
    org.junit.Assert.assertEquals((Object)(true), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v3 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v7 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.CheckLevel)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = 22;
    Object v10 = new com.google.javascript.rhino.Node[]{};
    Object v11 = new com.google.javascript.rhino.Node((((java.lang.Integer)v9).intValue()),((com.google.javascript.rhino.Node[])v10));
    Object v12 = -2;
    Object v13 = -25;
    ((com.google.javascript.rhino.Node)v11).putIntProp((((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v14 = null;
    Object v15 = 22;
    Object v16 = new com.google.javascript.rhino.Node[]{};
    Object v17 = new com.google.javascript.rhino.Node((((java.lang.Integer)v15).intValue()),((com.google.javascript.rhino.Node[])v16));
    Object v18 = ((com.google.javascript.jscomp.CheckGlobalThis)v3).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v17));
    org.junit.Assert.assertEquals((Object)(true), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v3 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v7 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.CheckLevel)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = 22;
    Object v10 = new com.google.javascript.rhino.Node[]{};
    Object v11 = new com.google.javascript.rhino.Node((((java.lang.Integer)v9).intValue()),((com.google.javascript.rhino.Node[])v10));
    Object v12 = 22;
    Object v13 = new com.google.javascript.rhino.Node[]{};
    Object v14 = new com.google.javascript.rhino.Node((((java.lang.Integer)v12).intValue()),((com.google.javascript.rhino.Node[])v13));
    ((com.google.javascript.jscomp.CheckGlobalThis)v3).visit(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v14));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.Compiler();
    Object v17 = new com.google.javascript.jscomp.Compiler();
    Object v18 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v19 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v17),((com.google.javascript.jscomp.CheckLevel)v18));
    Object v20 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v16),((com.google.javascript.jscomp.NodeTraversal.Callback)v19));
    Object v21 = ((com.google.javascript.jscomp.NodeTraversal)v20).getEnclosingFunction();
    Object v22 = 22;
    Object v23 = new com.google.javascript.rhino.Node[]{};
    Object v24 = new com.google.javascript.rhino.Node((((java.lang.Integer)v22).intValue()),((com.google.javascript.rhino.Node[])v23));
    Object v25 = 22;
    Object v26 = new com.google.javascript.rhino.Node[]{};
    Object v27 = new com.google.javascript.rhino.Node((((java.lang.Integer)v25).intValue()),((com.google.javascript.rhino.Node[])v26));
    ((com.google.javascript.jscomp.CheckGlobalThis)v3).visit(((com.google.javascript.jscomp.NodeTraversal)v20),((com.google.javascript.rhino.Node)v24),((com.google.javascript.rhino.Node)v27));
    Object v28 = null;
    org.junit.Assert.assertNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v3 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v7 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.CheckLevel)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = ((com.google.javascript.jscomp.NodeTraversal)v8).hasScope();
    Object v10 = 22;
    Object v11 = new com.google.javascript.rhino.Node[]{};
    Object v12 = new com.google.javascript.rhino.Node((((java.lang.Integer)v10).intValue()),((com.google.javascript.rhino.Node[])v11));
    Object v13 = "OTHER";
    Object v14 = "";
    Object v15 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = new com.google.javascript.rhino.Node.SideEffectFlags();
    Object v17 = "OTHER";
    Object v18 = "";
    Object v19 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v17),((java.lang.String)v18));
    Object v20 = new com.google.javascript.rhino.Node.SideEffectFlags();
    Object v21 = new com.google.javascript.rhino.Node.SideEffectFlags();
    Object v22 = "OTHER";
    Object v23 = "";
    Object v24 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v22),((java.lang.String)v23));
    Object v25 = java.util.Set.of(((java.lang.Object)v15),((java.lang.Object)v16),((java.lang.Object)v19),((java.lang.Object)v20),((java.lang.Object)v21),((java.lang.Object)v24));
    ((com.google.javascript.rhino.Node)v12).setDirectives(((java.util.Set)v25));
    Object v26 = null;
    Object v27 = 22;
    Object v28 = new com.google.javascript.rhino.Node[]{};
    Object v29 = new com.google.javascript.rhino.Node((((java.lang.Integer)v27).intValue()),((com.google.javascript.rhino.Node[])v28));
    Object v30 = ((com.google.javascript.jscomp.CheckGlobalThis)v3).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v29));
    org.junit.Assert.assertEquals((Object)(true), v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v3 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v7 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.CheckLevel)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = 22;
    Object v10 = new com.google.javascript.rhino.Node[]{};
    Object v11 = new com.google.javascript.rhino.Node((((java.lang.Integer)v9).intValue()),((com.google.javascript.rhino.Node[])v10));
    Object v12 = 22;
    Object v13 = new com.google.javascript.rhino.Node[]{};
    Object v14 = new com.google.javascript.rhino.Node((((java.lang.Integer)v12).intValue()),((com.google.javascript.rhino.Node[])v13));
    ((com.google.javascript.jscomp.CheckGlobalThis)v3).visit(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v14));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.Compiler();
    Object v17 = new com.google.javascript.jscomp.Compiler();
    Object v18 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v19 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v17),((com.google.javascript.jscomp.CheckLevel)v18));
    Object v20 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v16),((com.google.javascript.jscomp.NodeTraversal.Callback)v19));
    Object v21 = ((com.google.javascript.jscomp.NodeTraversal)v20).getEnclosingFunction();
    Object v22 = 22;
    Object v23 = new com.google.javascript.rhino.Node[]{};
    Object v24 = new com.google.javascript.rhino.Node((((java.lang.Integer)v22).intValue()),((com.google.javascript.rhino.Node[])v23));
    Object v25 = 22;
    Object v26 = new com.google.javascript.rhino.Node[]{};
    Object v27 = new com.google.javascript.rhino.Node((((java.lang.Integer)v25).intValue()),((com.google.javascript.rhino.Node[])v26));
    Object v28 = ((com.google.javascript.jscomp.CheckGlobalThis)v3).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v20),((com.google.javascript.rhino.Node)v24),((com.google.javascript.rhino.Node)v27));
    org.junit.Assert.assertEquals((Object)(true), v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v3 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v7 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.CheckLevel)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = 22;
    Object v10 = new com.google.javascript.rhino.Node[]{};
    Object v11 = new com.google.javascript.rhino.Node((((java.lang.Integer)v9).intValue()),((com.google.javascript.rhino.Node[])v10));
    Object v12 = 22;
    Object v13 = new com.google.javascript.rhino.Node[]{};
    Object v14 = new com.google.javascript.rhino.Node((((java.lang.Integer)v12).intValue()),((com.google.javascript.rhino.Node[])v13));
    ((com.google.javascript.rhino.Node)v11).addChildrenToFront(((com.google.javascript.rhino.Node)v14));
    Object v15 = null;
    Object v16 = 22;
    Object v17 = new com.google.javascript.rhino.Node[]{};
    Object v18 = new com.google.javascript.rhino.Node((((java.lang.Integer)v16).intValue()),((com.google.javascript.rhino.Node[])v17));
    Object v19 = ((com.google.javascript.jscomp.CheckGlobalThis)v3).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v18));
    org.junit.Assert.assertEquals((Object)(true), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v2 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v6 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.CheckLevel)v5));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = ((com.google.javascript.jscomp.NodeTraversal)v7).hasScope();
    Object v9 = 22;
    Object v10 = new com.google.javascript.rhino.Node[]{};
    Object v11 = new com.google.javascript.rhino.Node((((java.lang.Integer)v9).intValue()),((com.google.javascript.rhino.Node[])v10));
    Object v12 = 22;
    Object v13 = new com.google.javascript.rhino.Node[]{};
    Object v14 = new com.google.javascript.rhino.Node((((java.lang.Integer)v12).intValue()),((com.google.javascript.rhino.Node[])v13));
    Object v15 = ((com.google.javascript.rhino.Node)v11).copyInformationFrom(((com.google.javascript.rhino.Node)v14));
    Object v16 = 22;
    Object v17 = new com.google.javascript.rhino.Node[]{};
    Object v18 = new com.google.javascript.rhino.Node((((java.lang.Integer)v16).intValue()),((com.google.javascript.rhino.Node[])v17));
    ((com.google.javascript.jscomp.CheckGlobalThis)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v18));
    Object v19 = null;
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v3 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v7 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.CheckLevel)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = 22;
    Object v10 = new com.google.javascript.rhino.Node[]{};
    Object v11 = new com.google.javascript.rhino.Node((((java.lang.Integer)v9).intValue()),((com.google.javascript.rhino.Node[])v10));
    Object v12 = -11;
    Object v13 = false;
    ((com.google.javascript.rhino.Node)v11).putBooleanProp((((java.lang.Integer)v12).intValue()),(((java.lang.Boolean)v13).booleanValue()));
    Object v14 = null;
    Object v15 = 22;
    Object v16 = new com.google.javascript.rhino.Node[]{};
    Object v17 = new com.google.javascript.rhino.Node((((java.lang.Integer)v15).intValue()),((com.google.javascript.rhino.Node[])v16));
    Object v18 = ((com.google.javascript.jscomp.CheckGlobalThis)v3).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v17));
    org.junit.Assert.assertEquals((Object)(true), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v2 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v6 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.CheckLevel)v5));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = 22;
    Object v9 = new com.google.javascript.rhino.Node[]{};
    Object v10 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()),((com.google.javascript.rhino.Node[])v9));
    Object v11 = 22;
    Object v12 = new com.google.javascript.rhino.Node[]{};
    Object v13 = new com.google.javascript.rhino.Node((((java.lang.Integer)v11).intValue()),((com.google.javascript.rhino.Node[])v12));
    Object v14 = ((com.google.javascript.rhino.Node)v13).removeChildren();
    ((com.google.javascript.jscomp.CheckGlobalThis)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v13));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v3 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v7 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.CheckLevel)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = 22;
    Object v10 = new com.google.javascript.rhino.Node[]{};
    Object v11 = new com.google.javascript.rhino.Node((((java.lang.Integer)v9).intValue()),((com.google.javascript.rhino.Node[])v10));
    Object v12 = 22;
    Object v13 = new com.google.javascript.rhino.Node[]{};
    Object v14 = new com.google.javascript.rhino.Node((((java.lang.Integer)v12).intValue()),((com.google.javascript.rhino.Node[])v13));
    ((com.google.javascript.jscomp.CheckGlobalThis)v3).visit(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v14));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.Compiler();
    Object v17 = new com.google.javascript.jscomp.Compiler();
    Object v18 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v19 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v17),((com.google.javascript.jscomp.CheckLevel)v18));
    Object v20 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v16),((com.google.javascript.jscomp.NodeTraversal.Callback)v19));
    Object v21 = ((com.google.javascript.jscomp.NodeTraversal)v20).hasScope();
    Object v22 = 22;
    Object v23 = new com.google.javascript.rhino.Node[]{};
    Object v24 = new com.google.javascript.rhino.Node((((java.lang.Integer)v22).intValue()),((com.google.javascript.rhino.Node[])v23));
    Object v25 = ((com.google.javascript.rhino.Node)v24).isQualifiedName();
    Object v26 = 22;
    Object v27 = new com.google.javascript.rhino.Node[]{};
    Object v28 = new com.google.javascript.rhino.Node((((java.lang.Integer)v26).intValue()),((com.google.javascript.rhino.Node[])v27));
    Object v29 = 22;
    Object v30 = new com.google.javascript.rhino.Node[]{};
    Object v31 = new com.google.javascript.rhino.Node((((java.lang.Integer)v29).intValue()),((com.google.javascript.rhino.Node[])v30));
    Object v32 = ((com.google.javascript.rhino.Node)v28).clonePropsFrom(((com.google.javascript.rhino.Node)v31));
    Object v33 = ((com.google.javascript.jscomp.CheckGlobalThis)v3).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v20),((com.google.javascript.rhino.Node)v24),((com.google.javascript.rhino.Node)v28));
    org.junit.Assert.assertEquals((Object)(true), v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v2 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v6 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.CheckLevel)v5));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = 22;
    Object v9 = new com.google.javascript.rhino.Node[]{};
    Object v10 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()),((com.google.javascript.rhino.Node[])v9));
    Object v11 = 22;
    Object v12 = new com.google.javascript.rhino.Node[]{};
    Object v13 = new com.google.javascript.rhino.Node((((java.lang.Integer)v11).intValue()),((com.google.javascript.rhino.Node[])v12));
    Object v14 = 22;
    Object v15 = new com.google.javascript.rhino.Node[]{};
    Object v16 = new com.google.javascript.rhino.Node((((java.lang.Integer)v14).intValue()),((com.google.javascript.rhino.Node[])v15));
    Object v17 = ((com.google.javascript.rhino.Node)v13).checkTreeEquals(((com.google.javascript.rhino.Node)v16));
    Object v18 = ((com.google.javascript.jscomp.CheckGlobalThis)v2).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v13));
    org.junit.Assert.assertEquals((Object)(true), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v2 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v6 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.CheckLevel)v5));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = ((com.google.javascript.jscomp.NodeTraversal)v7).getScope();
    Object v9 = 22;
    Object v10 = new com.google.javascript.rhino.Node[]{};
    Object v11 = new com.google.javascript.rhino.Node((((java.lang.Integer)v9).intValue()),((com.google.javascript.rhino.Node[])v10));
    Object v12 = 22;
    Object v13 = new com.google.javascript.rhino.Node[]{};
    Object v14 = new com.google.javascript.rhino.Node((((java.lang.Integer)v12).intValue()),((com.google.javascript.rhino.Node[])v13));
    Object v15 = ((com.google.javascript.rhino.Node)v14).isUnscopedQualifiedName();
    ((com.google.javascript.jscomp.CheckGlobalThis)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v14));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v2 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v6 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.CheckLevel)v5));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = 22;
    Object v9 = new com.google.javascript.rhino.Node[]{};
    Object v10 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()),((com.google.javascript.rhino.Node[])v9));
    Object v11 = true;
    ((com.google.javascript.rhino.Node)v10).setVarArgs((((java.lang.Boolean)v11).booleanValue()));
    Object v12 = null;
    Object v13 = 22;
    Object v14 = new com.google.javascript.rhino.Node[]{};
    Object v15 = new com.google.javascript.rhino.Node((((java.lang.Integer)v13).intValue()),((com.google.javascript.rhino.Node[])v14));
    Object v16 = ((com.google.javascript.jscomp.CheckGlobalThis)v2).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v15));
    org.junit.Assert.assertEquals((Object)(true), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "prototype";
    Object v2 = -3;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v5 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "prototype";
    Object v2 = -3;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v5 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v4));
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v9 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v7),((com.google.javascript.jscomp.CheckLevel)v8));
    Object v10 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.NodeTraversal.Callback)v9));
    Object v11 = 22;
    Object v12 = new com.google.javascript.rhino.Node[]{};
    Object v13 = new com.google.javascript.rhino.Node((((java.lang.Integer)v11).intValue()),((com.google.javascript.rhino.Node[])v12));
    Object v14 = 22;
    Object v15 = new com.google.javascript.rhino.Node[]{};
    Object v16 = new com.google.javascript.rhino.Node((((java.lang.Integer)v14).intValue()),((com.google.javascript.rhino.Node[])v15));
    Object v17 = ((com.google.javascript.jscomp.CheckGlobalThis)v5).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v10),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v16));
    Object v18 = new com.google.javascript.jscomp.Compiler();
    Object v19 = new com.google.javascript.jscomp.Compiler();
    Object v20 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v21 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v19),((com.google.javascript.jscomp.CheckLevel)v20));
    Object v22 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v18),((com.google.javascript.jscomp.NodeTraversal.Callback)v21));
    Object v23 = 22;
    Object v24 = new com.google.javascript.rhino.Node[]{};
    Object v25 = new com.google.javascript.rhino.Node((((java.lang.Integer)v23).intValue()),((com.google.javascript.rhino.Node[])v24));
    Object v26 = 22;
    Object v27 = new com.google.javascript.rhino.Node[]{};
    Object v28 = new com.google.javascript.rhino.Node((((java.lang.Integer)v26).intValue()),((com.google.javascript.rhino.Node[])v27));
    Object v29 = ((com.google.javascript.jscomp.CheckGlobalThis)v5).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v22),((com.google.javascript.rhino.Node)v25),((com.google.javascript.rhino.Node)v28));
    org.junit.Assert.assertEquals((Object)(true), v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "prototype";
    Object v2 = -3;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v5 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v4));
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v9 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v7),((com.google.javascript.jscomp.CheckLevel)v8));
    Object v10 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.NodeTraversal.Callback)v9));
    Object v11 = 22;
    Object v12 = new com.google.javascript.rhino.Node[]{};
    Object v13 = new com.google.javascript.rhino.Node((((java.lang.Integer)v11).intValue()),((com.google.javascript.rhino.Node[])v12));
    Object v14 = 22;
    Object v15 = new com.google.javascript.rhino.Node[]{};
    Object v16 = new com.google.javascript.rhino.Node((((java.lang.Integer)v14).intValue()),((com.google.javascript.rhino.Node[])v15));
    ((com.google.javascript.jscomp.CheckGlobalThis)v5).visit(((com.google.javascript.jscomp.NodeTraversal)v10),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v16));
    Object v17 = null;
    Object v18 = new com.google.javascript.jscomp.Compiler();
    Object v19 = new com.google.javascript.jscomp.Compiler();
    Object v20 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v21 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v19),((com.google.javascript.jscomp.CheckLevel)v20));
    Object v22 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v18),((com.google.javascript.jscomp.NodeTraversal.Callback)v21));
    Object v23 = 22;
    Object v24 = new com.google.javascript.rhino.Node[]{};
    Object v25 = new com.google.javascript.rhino.Node((((java.lang.Integer)v23).intValue()),((com.google.javascript.rhino.Node[])v24));
    Object v26 = 22;
    Object v27 = new com.google.javascript.rhino.Node[]{};
    Object v28 = new com.google.javascript.rhino.Node((((java.lang.Integer)v26).intValue()),((com.google.javascript.rhino.Node[])v27));
    ((com.google.javascript.jscomp.CheckGlobalThis)v5).visit(((com.google.javascript.jscomp.NodeTraversal)v22),((com.google.javascript.rhino.Node)v25),((com.google.javascript.rhino.Node)v28));
    Object v29 = null;
    org.junit.Assert.assertNull(v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "prototype";
    Object v2 = -3;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v5 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v4));
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v9 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v7),((com.google.javascript.jscomp.CheckLevel)v8));
    Object v10 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.NodeTraversal.Callback)v9));
    Object v11 = 22;
    Object v12 = new com.google.javascript.rhino.Node[]{};
    Object v13 = new com.google.javascript.rhino.Node((((java.lang.Integer)v11).intValue()),((com.google.javascript.rhino.Node[])v12));
    Object v14 = ((com.google.javascript.rhino.Node)v13).removeFirstChild();
    Object v15 = 22;
    Object v16 = new com.google.javascript.rhino.Node[]{};
    Object v17 = new com.google.javascript.rhino.Node((((java.lang.Integer)v15).intValue()),((com.google.javascript.rhino.Node[])v16));
    Object v18 = ((com.google.javascript.jscomp.CheckGlobalThis)v5).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v10),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v17));
    org.junit.Assert.assertEquals((Object)(true), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v2 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v6 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.CheckLevel)v5));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = 22;
    Object v9 = new com.google.javascript.rhino.Node[]{};
    Object v10 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()),((com.google.javascript.rhino.Node[])v9));
    Object v11 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v12 = "OTHER";
    Object v13 = "";
    Object v14 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = new java.lang.String[]{"p7rototype"};
    Object v16 = ((com.google.javascript.jscomp.NodeTraversal)v7).makeError(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.CheckLevel)v11),((com.google.javascript.jscomp.DiagnosticType)v14),((java.lang.String[])v15));
    Object v17 = 22;
    Object v18 = new com.google.javascript.rhino.Node[]{};
    Object v19 = new com.google.javascript.rhino.Node((((java.lang.Integer)v17).intValue()),((com.google.javascript.rhino.Node[])v18));
    Object v20 = 22;
    Object v21 = new com.google.javascript.rhino.Node[]{};
    Object v22 = new com.google.javascript.rhino.Node((((java.lang.Integer)v20).intValue()),((com.google.javascript.rhino.Node[])v21));
    Object v23 = ((com.google.javascript.jscomp.CheckGlobalThis)v2).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v19),((com.google.javascript.rhino.Node)v22));
    org.junit.Assert.assertEquals((Object)(true), v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "prototype";
    Object v2 = -3;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v5 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v4));
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v9 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v7),((com.google.javascript.jscomp.CheckLevel)v8));
    Object v10 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.NodeTraversal.Callback)v9));
    Object v11 = ((com.google.javascript.jscomp.NodeTraversal)v10).getScope();
    Object v12 = 22;
    Object v13 = new com.google.javascript.rhino.Node[]{};
    Object v14 = new com.google.javascript.rhino.Node((((java.lang.Integer)v12).intValue()),((com.google.javascript.rhino.Node[])v13));
    Object v15 = 22;
    Object v16 = new com.google.javascript.rhino.Node[]{};
    Object v17 = new com.google.javascript.rhino.Node((((java.lang.Integer)v15).intValue()),((com.google.javascript.rhino.Node[])v16));
    Object v18 = ((com.google.javascript.jscomp.CheckGlobalThis)v5).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v10),((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.Node)v17));
    org.junit.Assert.assertEquals((Object)(true), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "prototype";
    Object v2 = -3;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v5 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v4));
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v9 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v7),((com.google.javascript.jscomp.CheckLevel)v8));
    Object v10 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.NodeTraversal.Callback)v9));
    Object v11 = 22;
    Object v12 = new com.google.javascript.rhino.Node[]{};
    Object v13 = new com.google.javascript.rhino.Node((((java.lang.Integer)v11).intValue()),((com.google.javascript.rhino.Node[])v12));
    Object v14 = 22;
    Object v15 = new com.google.javascript.rhino.Node[]{};
    Object v16 = new com.google.javascript.rhino.Node((((java.lang.Integer)v14).intValue()),((com.google.javascript.rhino.Node[])v15));
    ((com.google.javascript.jscomp.CheckGlobalThis)v5).visit(((com.google.javascript.jscomp.NodeTraversal)v10),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v16));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "prototype";
    Object v2 = -3;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v5 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v4));
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v9 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v7),((com.google.javascript.jscomp.CheckLevel)v8));
    Object v10 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.NodeTraversal.Callback)v9));
    Object v11 = 22;
    Object v12 = new com.google.javascript.rhino.Node[]{};
    Object v13 = new com.google.javascript.rhino.Node((((java.lang.Integer)v11).intValue()),((com.google.javascript.rhino.Node[])v12));
    Object v14 = "OTHER";
    Object v15 = "";
    Object v16 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v14),((java.lang.String)v15));
    Object v17 = new java.lang.String[]{"nul"};
    ((com.google.javascript.jscomp.NodeTraversal)v10).report(((com.google.javascript.rhino.Node)v13),((com.google.javascript.jscomp.DiagnosticType)v16),((java.lang.String[])v17));
    Object v18 = null;
    Object v19 = 22;
    Object v20 = new com.google.javascript.rhino.Node[]{};
    Object v21 = new com.google.javascript.rhino.Node((((java.lang.Integer)v19).intValue()),((com.google.javascript.rhino.Node[])v20));
    Object v22 = 22;
    Object v23 = new com.google.javascript.rhino.Node[]{};
    Object v24 = new com.google.javascript.rhino.Node((((java.lang.Integer)v22).intValue()),((com.google.javascript.rhino.Node[])v23));
    Object v25 = ((com.google.javascript.jscomp.CheckGlobalThis)v5).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v10),((com.google.javascript.rhino.Node)v21),((com.google.javascript.rhino.Node)v24));
    org.junit.Assert.assertEquals((Object)(true), v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "prototype";
    Object v2 = -3;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v5 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v4));
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v9 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v7),((com.google.javascript.jscomp.CheckLevel)v8));
    Object v10 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.NodeTraversal.Callback)v9));
    Object v11 = 22;
    Object v12 = new com.google.javascript.rhino.Node[]{};
    Object v13 = new com.google.javascript.rhino.Node((((java.lang.Integer)v11).intValue()),((com.google.javascript.rhino.Node[])v12));
    Object v14 = 22;
    Object v15 = new com.google.javascript.rhino.Node[]{};
    Object v16 = new com.google.javascript.rhino.Node((((java.lang.Integer)v14).intValue()),((com.google.javascript.rhino.Node[])v15));
    ((com.google.javascript.jscomp.CheckGlobalThis)v5).visit(((com.google.javascript.jscomp.NodeTraversal)v10),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v16));
    Object v17 = null;
    Object v18 = new com.google.javascript.jscomp.Compiler();
    Object v19 = new com.google.javascript.jscomp.Compiler();
    Object v20 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v21 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v19),((com.google.javascript.jscomp.CheckLevel)v20));
    Object v22 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v18),((com.google.javascript.jscomp.NodeTraversal.Callback)v21));
    Object v23 = 22;
    Object v24 = new com.google.javascript.rhino.Node[]{};
    Object v25 = new com.google.javascript.rhino.Node((((java.lang.Integer)v23).intValue()),((com.google.javascript.rhino.Node[])v24));
    Object v26 = 35;
    ((com.google.javascript.rhino.Node)v25).setType((((java.lang.Integer)v26).intValue()));
    Object v27 = null;
    Object v28 = 22;
    Object v29 = new com.google.javascript.rhino.Node[]{};
    Object v30 = new com.google.javascript.rhino.Node((((java.lang.Integer)v28).intValue()),((com.google.javascript.rhino.Node[])v29));
    ((com.google.javascript.jscomp.CheckGlobalThis)v5).visit(((com.google.javascript.jscomp.NodeTraversal)v22),((com.google.javascript.rhino.Node)v25),((com.google.javascript.rhino.Node)v30));
    Object v31 = null;
    org.junit.Assert.assertNull(v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "prototype";
    Object v2 = -3;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v5 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v4));
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v9 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v7),((com.google.javascript.jscomp.CheckLevel)v8));
    Object v10 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.NodeTraversal.Callback)v9));
    Object v11 = 22;
    Object v12 = new com.google.javascript.rhino.Node[]{};
    Object v13 = new com.google.javascript.rhino.Node((((java.lang.Integer)v11).intValue()),((com.google.javascript.rhino.Node[])v12));
    Object v14 = 22;
    Object v15 = new com.google.javascript.rhino.Node[]{};
    Object v16 = new com.google.javascript.rhino.Node((((java.lang.Integer)v14).intValue()),((com.google.javascript.rhino.Node[])v15));
    Object v17 = ((com.google.javascript.rhino.Node)v16).isQualifiedName();
    Object v18 = ((com.google.javascript.jscomp.CheckGlobalThis)v5).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v10),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v16));
    org.junit.Assert.assertEquals((Object)(true), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "prototype";
    Object v2 = -3;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v5 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v4));
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v9 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v7),((com.google.javascript.jscomp.CheckLevel)v8));
    Object v10 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.NodeTraversal.Callback)v9));
    Object v11 = 22;
    Object v12 = new com.google.javascript.rhino.Node[]{};
    Object v13 = new com.google.javascript.rhino.Node((((java.lang.Integer)v11).intValue()),((com.google.javascript.rhino.Node[])v12));
    Object v14 = 22;
    Object v15 = new com.google.javascript.rhino.Node[]{};
    Object v16 = new com.google.javascript.rhino.Node((((java.lang.Integer)v14).intValue()),((com.google.javascript.rhino.Node[])v15));
    Object v17 = ((com.google.javascript.jscomp.CheckGlobalThis)v5).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v10),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v16));
    org.junit.Assert.assertEquals((Object)(true), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v3 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v7 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.CheckLevel)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = ((com.google.javascript.jscomp.NodeTraversal)v8).getEnclosingFunction();
    Object v10 = 22;
    Object v11 = new com.google.javascript.rhino.Node[]{};
    Object v12 = new com.google.javascript.rhino.Node((((java.lang.Integer)v10).intValue()),((com.google.javascript.rhino.Node[])v11));
    Object v13 = 22;
    Object v14 = new com.google.javascript.rhino.Node[]{};
    Object v15 = new com.google.javascript.rhino.Node((((java.lang.Integer)v13).intValue()),((com.google.javascript.rhino.Node[])v14));
    Object v16 = 22;
    Object v17 = new com.google.javascript.rhino.Node[]{};
    Object v18 = new com.google.javascript.rhino.Node((((java.lang.Integer)v16).intValue()),((com.google.javascript.rhino.Node[])v17));
    Object v19 = ((com.google.javascript.rhino.Node)v15).copyInformationFrom(((com.google.javascript.rhino.Node)v18));
    ((com.google.javascript.jscomp.CheckGlobalThis)v3).visit(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v15));
    Object v20 = null;
    org.junit.Assert.assertNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "prototype";
    Object v2 = -3;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v5 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v4));
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v9 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v7),((com.google.javascript.jscomp.CheckLevel)v8));
    Object v10 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.NodeTraversal.Callback)v9));
    Object v11 = 22;
    Object v12 = new com.google.javascript.rhino.Node[]{};
    Object v13 = new com.google.javascript.rhino.Node((((java.lang.Integer)v11).intValue()),((com.google.javascript.rhino.Node[])v12));
    Object v14 = 22;
    Object v15 = new com.google.javascript.rhino.Node[]{};
    Object v16 = new com.google.javascript.rhino.Node((((java.lang.Integer)v14).intValue()),((com.google.javascript.rhino.Node[])v15));
    ((com.google.javascript.rhino.Node)v13).addChildToBack(((com.google.javascript.rhino.Node)v16));
    Object v17 = null;
    Object v18 = 22;
    Object v19 = new com.google.javascript.rhino.Node[]{};
    Object v20 = new com.google.javascript.rhino.Node((((java.lang.Integer)v18).intValue()),((com.google.javascript.rhino.Node[])v19));
    ((com.google.javascript.jscomp.CheckGlobalThis)v5).visit(((com.google.javascript.jscomp.NodeTraversal)v10),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v20));
    Object v21 = null;
    org.junit.Assert.assertNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v3 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v7 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.CheckLevel)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = 22;
    Object v10 = new com.google.javascript.rhino.Node[]{};
    Object v11 = new com.google.javascript.rhino.Node((((java.lang.Integer)v9).intValue()),((com.google.javascript.rhino.Node[])v10));
    Object v12 = 22;
    Object v13 = new com.google.javascript.rhino.Node[]{};
    Object v14 = new com.google.javascript.rhino.Node((((java.lang.Integer)v12).intValue()),((com.google.javascript.rhino.Node[])v13));
    ((com.google.javascript.jscomp.CheckGlobalThis)v3).visit(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v14));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.Compiler();
    Object v17 = new com.google.javascript.jscomp.Compiler();
    Object v18 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v19 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v17),((com.google.javascript.jscomp.CheckLevel)v18));
    Object v20 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v16),((com.google.javascript.jscomp.NodeTraversal.Callback)v19));
    Object v21 = 22;
    Object v22 = new com.google.javascript.rhino.Node[]{};
    Object v23 = new com.google.javascript.rhino.Node((((java.lang.Integer)v21).intValue()),((com.google.javascript.rhino.Node[])v22));
    ((com.google.javascript.jscomp.NodeTraversal)v20).traverse(((com.google.javascript.rhino.Node)v23));
    Object v24 = null;
    Object v25 = 22;
    Object v26 = new com.google.javascript.rhino.Node[]{};
    Object v27 = new com.google.javascript.rhino.Node((((java.lang.Integer)v25).intValue()),((com.google.javascript.rhino.Node[])v26));
    Object v28 = 22;
    Object v29 = new com.google.javascript.rhino.Node[]{};
    Object v30 = new com.google.javascript.rhino.Node((((java.lang.Integer)v28).intValue()),((com.google.javascript.rhino.Node[])v29));
    Object v31 = 22;
    Object v32 = new com.google.javascript.rhino.Node[]{};
    Object v33 = new com.google.javascript.rhino.Node((((java.lang.Integer)v31).intValue()),((com.google.javascript.rhino.Node[])v32));
    Object v34 = ((com.google.javascript.rhino.Node)v30).copyInformationFromForTree(((com.google.javascript.rhino.Node)v33));
    ((com.google.javascript.jscomp.CheckGlobalThis)v3).visit(((com.google.javascript.jscomp.NodeTraversal)v20),((com.google.javascript.rhino.Node)v27),((com.google.javascript.rhino.Node)v30));
    Object v35 = null;
    org.junit.Assert.assertNull(v35);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "prototype";
    Object v2 = -3;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v5 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v4));
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v9 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v7),((com.google.javascript.jscomp.CheckLevel)v8));
    Object v10 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.NodeTraversal.Callback)v9));
    Object v11 = 22;
    Object v12 = new com.google.javascript.rhino.Node[]{};
    Object v13 = new com.google.javascript.rhino.Node((((java.lang.Integer)v11).intValue()),((com.google.javascript.rhino.Node[])v12));
    Object v14 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v15 = "OTHER";
    Object v16 = "";
    Object v17 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = new java.lang.String[]{};
    Object v19 = ((com.google.javascript.jscomp.NodeTraversal)v10).makeError(((com.google.javascript.rhino.Node)v13),((com.google.javascript.jscomp.CheckLevel)v14),((com.google.javascript.jscomp.DiagnosticType)v17),((java.lang.String[])v18));
    Object v20 = 22;
    Object v21 = new com.google.javascript.rhino.Node[]{};
    Object v22 = new com.google.javascript.rhino.Node((((java.lang.Integer)v20).intValue()),((com.google.javascript.rhino.Node[])v21));
    Object v23 = 22;
    Object v24 = new com.google.javascript.rhino.Node[]{};
    Object v25 = new com.google.javascript.rhino.Node((((java.lang.Integer)v23).intValue()),((com.google.javascript.rhino.Node[])v24));
    ((com.google.javascript.jscomp.CheckGlobalThis)v5).visit(((com.google.javascript.jscomp.NodeTraversal)v10),((com.google.javascript.rhino.Node)v22),((com.google.javascript.rhino.Node)v25));
    Object v26 = null;
    org.junit.Assert.assertNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "prototype";
    Object v2 = -3;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v5 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v4));
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v9 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v7),((com.google.javascript.jscomp.CheckLevel)v8));
    Object v10 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.NodeTraversal.Callback)v9));
    Object v11 = 22;
    Object v12 = new com.google.javascript.rhino.Node[]{};
    Object v13 = new com.google.javascript.rhino.Node((((java.lang.Integer)v11).intValue()),((com.google.javascript.rhino.Node[])v12));
    Object v14 = 22;
    Object v15 = new com.google.javascript.rhino.Node[]{};
    Object v16 = new com.google.javascript.rhino.Node((((java.lang.Integer)v14).intValue()),((com.google.javascript.rhino.Node[])v15));
    ((com.google.javascript.jscomp.CheckGlobalThis)v5).visit(((com.google.javascript.jscomp.NodeTraversal)v10),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v16));
    Object v17 = null;
    Object v18 = new com.google.javascript.jscomp.Compiler();
    Object v19 = new com.google.javascript.jscomp.Compiler();
    Object v20 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v21 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v19),((com.google.javascript.jscomp.CheckLevel)v20));
    Object v22 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v18),((com.google.javascript.jscomp.NodeTraversal.Callback)v21));
    Object v23 = 22;
    Object v24 = new com.google.javascript.rhino.Node[]{};
    Object v25 = new com.google.javascript.rhino.Node((((java.lang.Integer)v23).intValue()),((com.google.javascript.rhino.Node[])v24));
    Object v26 = "OTHER";
    Object v27 = "";
    Object v28 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v26),((java.lang.String)v27));
    Object v29 = new java.lang.String[]{" : ","'","[a-z&[a-zA-Z\\d]*[_\\d]*"};
    ((com.google.javascript.jscomp.NodeTraversal)v22).report(((com.google.javascript.rhino.Node)v25),((com.google.javascript.jscomp.DiagnosticType)v28),((java.lang.String[])v29));
    Object v30 = null;
    Object v31 = 22;
    Object v32 = new com.google.javascript.rhino.Node[]{};
    Object v33 = new com.google.javascript.rhino.Node((((java.lang.Integer)v31).intValue()),((com.google.javascript.rhino.Node[])v32));
    Object v34 = 22;
    Object v35 = new com.google.javascript.rhino.Node[]{};
    Object v36 = new com.google.javascript.rhino.Node((((java.lang.Integer)v34).intValue()),((com.google.javascript.rhino.Node[])v35));
    Object v37 = java.io.Writer.nullWriter();
    ((com.google.javascript.rhino.Node)v36).appendStringTree(((java.lang.Appendable)v37));
    Object v38 = null;
    ((com.google.javascript.jscomp.CheckGlobalThis)v5).visit(((com.google.javascript.jscomp.NodeTraversal)v22),((com.google.javascript.rhino.Node)v33),((com.google.javascript.rhino.Node)v36));
    Object v39 = null;
    org.junit.Assert.assertNull(v39);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v3 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v7 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.CheckLevel)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = 22;
    Object v10 = new com.google.javascript.rhino.Node[]{};
    Object v11 = new com.google.javascript.rhino.Node((((java.lang.Integer)v9).intValue()),((com.google.javascript.rhino.Node[])v10));
    Object v12 = 22;
    Object v13 = new com.google.javascript.rhino.Node[]{};
    Object v14 = new com.google.javascript.rhino.Node((((java.lang.Integer)v12).intValue()),((com.google.javascript.rhino.Node[])v13));
    Object v15 = false;
    ((com.google.javascript.rhino.Node)v14).setVarArgs((((java.lang.Boolean)v15).booleanValue()));
    Object v16 = null;
    Object v17 = ((com.google.javascript.jscomp.CheckGlobalThis)v3).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v14));
    org.junit.Assert.assertEquals((Object)(true), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v3 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v7 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.CheckLevel)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = 22;
    Object v10 = new com.google.javascript.rhino.Node[]{};
    Object v11 = new com.google.javascript.rhino.Node((((java.lang.Integer)v9).intValue()),((com.google.javascript.rhino.Node[])v10));
    ((com.google.javascript.jscomp.NodeTraversal)v8).traverse(((com.google.javascript.rhino.Node)v11));
    Object v12 = null;
    Object v13 = 22;
    Object v14 = new com.google.javascript.rhino.Node[]{};
    Object v15 = new com.google.javascript.rhino.Node((((java.lang.Integer)v13).intValue()),((com.google.javascript.rhino.Node[])v14));
    Object v16 = 22;
    Object v17 = new com.google.javascript.rhino.Node[]{};
    Object v18 = new com.google.javascript.rhino.Node((((java.lang.Integer)v16).intValue()),((com.google.javascript.rhino.Node[])v17));
    Object v19 = ((com.google.javascript.jscomp.CheckGlobalThis)v3).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v15),((com.google.javascript.rhino.Node)v18));
    org.junit.Assert.assertEquals((Object)(true), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v3 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v7 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.CheckLevel)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = 22;
    Object v10 = new com.google.javascript.rhino.Node[]{};
    Object v11 = new com.google.javascript.rhino.Node((((java.lang.Integer)v9).intValue()),((com.google.javascript.rhino.Node[])v10));
    Object v12 = 22;
    Object v13 = new com.google.javascript.rhino.Node[]{};
    Object v14 = new com.google.javascript.rhino.Node((((java.lang.Integer)v12).intValue()),((com.google.javascript.rhino.Node[])v13));
    ((com.google.javascript.jscomp.CheckGlobalThis)v3).visit(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v14));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.Compiler();
    Object v17 = new com.google.javascript.jscomp.Compiler();
    Object v18 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v19 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v17),((com.google.javascript.jscomp.CheckLevel)v18));
    Object v20 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v16),((com.google.javascript.jscomp.NodeTraversal.Callback)v19));
    Object v21 = 22;
    Object v22 = new com.google.javascript.rhino.Node[]{};
    Object v23 = new com.google.javascript.rhino.Node((((java.lang.Integer)v21).intValue()),((com.google.javascript.rhino.Node[])v22));
    Object v24 = 22;
    Object v25 = new com.google.javascript.rhino.Node[]{};
    Object v26 = new com.google.javascript.rhino.Node((((java.lang.Integer)v24).intValue()),((com.google.javascript.rhino.Node[])v25));
    Object v27 = ((com.google.javascript.rhino.Node)v26).isQualifiedName();
    ((com.google.javascript.jscomp.CheckGlobalThis)v3).visit(((com.google.javascript.jscomp.NodeTraversal)v20),((com.google.javascript.rhino.Node)v23),((com.google.javascript.rhino.Node)v26));
    Object v28 = null;
    org.junit.Assert.assertNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "prototype";
    Object v2 = -3;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v5 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v4));
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v9 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v7),((com.google.javascript.jscomp.CheckLevel)v8));
    Object v10 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.NodeTraversal.Callback)v9));
    Object v11 = ((com.google.javascript.jscomp.NodeTraversal)v10).hasScope();
    Object v12 = 22;
    Object v13 = new com.google.javascript.rhino.Node[]{};
    Object v14 = new com.google.javascript.rhino.Node((((java.lang.Integer)v12).intValue()),((com.google.javascript.rhino.Node[])v13));
    Object v15 = 22;
    Object v16 = new com.google.javascript.rhino.Node[]{};
    Object v17 = new com.google.javascript.rhino.Node((((java.lang.Integer)v15).intValue()),((com.google.javascript.rhino.Node[])v16));
    Object v18 = ((com.google.javascript.jscomp.CheckGlobalThis)v5).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v10),((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.Node)v17));
    org.junit.Assert.assertEquals((Object)(true), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "prototype";
    Object v2 = -3;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v5 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v4));
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v9 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v7),((com.google.javascript.jscomp.CheckLevel)v8));
    Object v10 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.NodeTraversal.Callback)v9));
    Object v11 = 22;
    Object v12 = new com.google.javascript.rhino.Node[]{};
    Object v13 = new com.google.javascript.rhino.Node((((java.lang.Integer)v11).intValue()),((com.google.javascript.rhino.Node[])v12));
    Object v14 = 22;
    Object v15 = new com.google.javascript.rhino.Node[]{};
    Object v16 = new com.google.javascript.rhino.Node((((java.lang.Integer)v14).intValue()),((com.google.javascript.rhino.Node[])v15));
    ((com.google.javascript.jscomp.CheckGlobalThis)v5).visit(((com.google.javascript.jscomp.NodeTraversal)v10),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v16));
    Object v17 = null;
    Object v18 = new com.google.javascript.jscomp.Compiler();
    Object v19 = new com.google.javascript.jscomp.Compiler();
    Object v20 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v21 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v19),((com.google.javascript.jscomp.CheckLevel)v20));
    Object v22 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v18),((com.google.javascript.jscomp.NodeTraversal.Callback)v21));
    Object v23 = 22;
    Object v24 = new com.google.javascript.rhino.Node[]{};
    Object v25 = new com.google.javascript.rhino.Node((((java.lang.Integer)v23).intValue()),((com.google.javascript.rhino.Node[])v24));
    Object v26 = 22;
    Object v27 = new com.google.javascript.rhino.Node[]{};
    Object v28 = new com.google.javascript.rhino.Node((((java.lang.Integer)v26).intValue()),((com.google.javascript.rhino.Node[])v27));
    Object v29 = ((com.google.javascript.jscomp.CheckGlobalThis)v5).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v22),((com.google.javascript.rhino.Node)v25),((com.google.javascript.rhino.Node)v28));
    org.junit.Assert.assertEquals((Object)(true), v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "prototype";
    Object v2 = -3;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v5 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v4));
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v9 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v7),((com.google.javascript.jscomp.CheckLevel)v8));
    Object v10 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.NodeTraversal.Callback)v9));
    Object v11 = 22;
    Object v12 = new com.google.javascript.rhino.Node[]{};
    Object v13 = new com.google.javascript.rhino.Node((((java.lang.Integer)v11).intValue()),((com.google.javascript.rhino.Node[])v12));
    Object v14 = ((com.google.javascript.rhino.Node)v13).cloneNode();
    Object v15 = 22;
    Object v16 = new com.google.javascript.rhino.Node[]{};
    Object v17 = new com.google.javascript.rhino.Node((((java.lang.Integer)v15).intValue()),((com.google.javascript.rhino.Node[])v16));
    ((com.google.javascript.jscomp.CheckGlobalThis)v5).visit(((com.google.javascript.jscomp.NodeTraversal)v10),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v17));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "prototype";
    Object v2 = -3;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v5 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v4));
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v9 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v7),((com.google.javascript.jscomp.CheckLevel)v8));
    Object v10 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.NodeTraversal.Callback)v9));
    Object v11 = 22;
    Object v12 = new com.google.javascript.rhino.Node[]{};
    Object v13 = new com.google.javascript.rhino.Node((((java.lang.Integer)v11).intValue()),((com.google.javascript.rhino.Node[])v12));
    Object v14 = 22;
    Object v15 = new com.google.javascript.rhino.Node[]{};
    Object v16 = new com.google.javascript.rhino.Node((((java.lang.Integer)v14).intValue()),((com.google.javascript.rhino.Node[])v15));
    ((com.google.javascript.jscomp.CheckGlobalThis)v5).visit(((com.google.javascript.jscomp.NodeTraversal)v10),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v16));
    Object v17 = null;
    Object v18 = new com.google.javascript.jscomp.Compiler();
    Object v19 = new com.google.javascript.jscomp.Compiler();
    Object v20 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v21 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v19),((com.google.javascript.jscomp.CheckLevel)v20));
    Object v22 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v18),((com.google.javascript.jscomp.NodeTraversal.Callback)v21));
    Object v23 = 22;
    Object v24 = new com.google.javascript.rhino.Node[]{};
    Object v25 = new com.google.javascript.rhino.Node((((java.lang.Integer)v23).intValue()),((com.google.javascript.rhino.Node[])v24));
    Object v26 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v27 = "OTHER";
    Object v28 = "";
    Object v29 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v27),((java.lang.String)v28));
    Object v30 = new java.lang.String[]{};
    Object v31 = ((com.google.javascript.jscomp.NodeTraversal)v22).makeError(((com.google.javascript.rhino.Node)v25),((com.google.javascript.jscomp.CheckLevel)v26),((com.google.javascript.jscomp.DiagnosticType)v29),((java.lang.String[])v30));
    Object v32 = 22;
    Object v33 = new com.google.javascript.rhino.Node[]{};
    Object v34 = new com.google.javascript.rhino.Node((((java.lang.Integer)v32).intValue()),((com.google.javascript.rhino.Node[])v33));
    Object v35 = 22;
    Object v36 = new com.google.javascript.rhino.Node[]{};
    Object v37 = new com.google.javascript.rhino.Node((((java.lang.Integer)v35).intValue()),((com.google.javascript.rhino.Node[])v36));
    ((com.google.javascript.jscomp.CheckGlobalThis)v5).visit(((com.google.javascript.jscomp.NodeTraversal)v22),((com.google.javascript.rhino.Node)v34),((com.google.javascript.rhino.Node)v37));
    Object v38 = null;
    org.junit.Assert.assertNull(v38);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "prototype";
    Object v2 = -3;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v5 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v4));
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v9 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v7),((com.google.javascript.jscomp.CheckLevel)v8));
    Object v10 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.NodeTraversal.Callback)v9));
    Object v11 = 22;
    Object v12 = new com.google.javascript.rhino.Node[]{};
    Object v13 = new com.google.javascript.rhino.Node((((java.lang.Integer)v11).intValue()),((com.google.javascript.rhino.Node[])v12));
    Object v14 = 22;
    Object v15 = new com.google.javascript.rhino.Node[]{};
    Object v16 = new com.google.javascript.rhino.Node((((java.lang.Integer)v14).intValue()),((com.google.javascript.rhino.Node[])v15));
    Object v17 = java.io.Writer.nullWriter();
    ((com.google.javascript.rhino.Node)v16).appendStringTree(((java.lang.Appendable)v17));
    Object v18 = null;
    Object v19 = ((com.google.javascript.jscomp.CheckGlobalThis)v5).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v10),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v16));
    org.junit.Assert.assertEquals((Object)(true), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "prototype";
    Object v2 = -3;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v5 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v4));
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v9 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v7),((com.google.javascript.jscomp.CheckLevel)v8));
    Object v10 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.NodeTraversal.Callback)v9));
    Object v11 = 22;
    Object v12 = new com.google.javascript.rhino.Node[]{};
    Object v13 = new com.google.javascript.rhino.Node((((java.lang.Integer)v11).intValue()),((com.google.javascript.rhino.Node[])v12));
    Object v14 = 22;
    Object v15 = new com.google.javascript.rhino.Node[]{};
    Object v16 = new com.google.javascript.rhino.Node((((java.lang.Integer)v14).intValue()),((com.google.javascript.rhino.Node[])v15));
    Object v17 = ((com.google.javascript.rhino.Node)v16).getAncestors();
    ((com.google.javascript.jscomp.CheckGlobalThis)v5).visit(((com.google.javascript.jscomp.NodeTraversal)v10),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v16));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v2 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v6 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.CheckLevel)v5));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = 22;
    Object v9 = new com.google.javascript.rhino.Node[]{};
    Object v10 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()),((com.google.javascript.rhino.Node[])v9));
    Object v11 = 22;
    Object v12 = new com.google.javascript.rhino.Node[]{};
    Object v13 = new com.google.javascript.rhino.Node((((java.lang.Integer)v11).intValue()),((com.google.javascript.rhino.Node[])v12));
    ((com.google.javascript.jscomp.CheckGlobalThis)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
    Object v15 = new com.google.javascript.jscomp.Compiler();
    Object v16 = new com.google.javascript.jscomp.Compiler();
    Object v17 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v18 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v16),((com.google.javascript.jscomp.CheckLevel)v17));
    Object v19 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v15),((com.google.javascript.jscomp.NodeTraversal.Callback)v18));
    Object v20 = 22;
    Object v21 = new com.google.javascript.rhino.Node[]{};
    Object v22 = new com.google.javascript.rhino.Node((((java.lang.Integer)v20).intValue()),((com.google.javascript.rhino.Node[])v21));
    Object v23 = 22;
    Object v24 = new com.google.javascript.rhino.Node[]{};
    Object v25 = new com.google.javascript.rhino.Node((((java.lang.Integer)v23).intValue()),((com.google.javascript.rhino.Node[])v24));
    Object v26 = ((com.google.javascript.rhino.Node)v22).checkTreeTypeAwareEqualsSilent(((com.google.javascript.rhino.Node)v25));
    Object v27 = 22;
    Object v28 = new com.google.javascript.rhino.Node[]{};
    Object v29 = new com.google.javascript.rhino.Node((((java.lang.Integer)v27).intValue()),((com.google.javascript.rhino.Node[])v28));
    ((com.google.javascript.jscomp.CheckGlobalThis)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v19),((com.google.javascript.rhino.Node)v22),((com.google.javascript.rhino.Node)v29));
    Object v30 = null;
    org.junit.Assert.assertNull(v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v3 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.Compiler();
    Object v6 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v7 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.CheckLevel)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = 22;
    Object v10 = new com.google.javascript.rhino.Node[]{};
    Object v11 = new com.google.javascript.rhino.Node((((java.lang.Integer)v9).intValue()),((com.google.javascript.rhino.Node[])v10));
    Object v12 = ((com.google.javascript.rhino.Node)v11).removeFirstChild();
    Object v13 = 22;
    Object v14 = new com.google.javascript.rhino.Node[]{};
    Object v15 = new com.google.javascript.rhino.Node((((java.lang.Integer)v13).intValue()),((com.google.javascript.rhino.Node[])v14));
    Object v16 = 22;
    Object v17 = new com.google.javascript.rhino.Node[]{};
    Object v18 = new com.google.javascript.rhino.Node((((java.lang.Integer)v16).intValue()),((com.google.javascript.rhino.Node[])v17));
    ((com.google.javascript.rhino.Node)v15).addChildToFront(((com.google.javascript.rhino.Node)v18));
    Object v19 = null;
    Object v20 = ((com.google.javascript.jscomp.CheckGlobalThis)v3).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v15));
    org.junit.Assert.assertEquals((Object)(true), v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "prototype";
    Object v2 = -3;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v5 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v4));
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v9 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v7),((com.google.javascript.jscomp.CheckLevel)v8));
    Object v10 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.NodeTraversal.Callback)v9));
    Object v11 = 22;
    Object v12 = new com.google.javascript.rhino.Node[]{};
    Object v13 = new com.google.javascript.rhino.Node((((java.lang.Integer)v11).intValue()),((com.google.javascript.rhino.Node[])v12));
    Object v14 = 22;
    Object v15 = new com.google.javascript.rhino.Node[]{};
    Object v16 = new com.google.javascript.rhino.Node((((java.lang.Integer)v14).intValue()),((com.google.javascript.rhino.Node[])v15));
    Object v17 = ((com.google.javascript.jscomp.CheckGlobalThis)v5).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v10),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v16));
    Object v18 = new com.google.javascript.jscomp.Compiler();
    Object v19 = new com.google.javascript.jscomp.Compiler();
    Object v20 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v21 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v19),((com.google.javascript.jscomp.CheckLevel)v20));
    Object v22 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v18),((com.google.javascript.jscomp.NodeTraversal.Callback)v21));
    Object v23 = 22;
    Object v24 = new com.google.javascript.rhino.Node[]{};
    Object v25 = new com.google.javascript.rhino.Node((((java.lang.Integer)v23).intValue()),((com.google.javascript.rhino.Node[])v24));
    Object v26 = 5;
    Object v27 = 57;
    ((com.google.javascript.rhino.Node)v25).putIntProp((((java.lang.Integer)v26).intValue()),(((java.lang.Integer)v27).intValue()));
    Object v28 = null;
    Object v29 = 22;
    Object v30 = new com.google.javascript.rhino.Node[]{};
    Object v31 = new com.google.javascript.rhino.Node((((java.lang.Integer)v29).intValue()),((com.google.javascript.rhino.Node[])v30));
    ((com.google.javascript.jscomp.CheckGlobalThis)v5).visit(((com.google.javascript.jscomp.NodeTraversal)v22),((com.google.javascript.rhino.Node)v25),((com.google.javascript.rhino.Node)v31));
    Object v32 = null;
    org.junit.Assert.assertNull(v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "prototype";
    Object v2 = -3;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v5 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v4));
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v9 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v7),((com.google.javascript.jscomp.CheckLevel)v8));
    Object v10 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.NodeTraversal.Callback)v9));
    Object v11 = 22;
    Object v12 = new com.google.javascript.rhino.Node[]{};
    Object v13 = new com.google.javascript.rhino.Node((((java.lang.Integer)v11).intValue()),((com.google.javascript.rhino.Node[])v12));
    Object v14 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v15 = "OTHER";
    Object v16 = "";
    Object v17 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = new java.lang.String[]{"&*=",""};
    Object v19 = ((com.google.javascript.jscomp.NodeTraversal)v10).makeError(((com.google.javascript.rhino.Node)v13),((com.google.javascript.jscomp.CheckLevel)v14),((com.google.javascript.jscomp.DiagnosticType)v17),((java.lang.String[])v18));
    Object v20 = 22;
    Object v21 = new com.google.javascript.rhino.Node[]{};
    Object v22 = new com.google.javascript.rhino.Node((((java.lang.Integer)v20).intValue()),((com.google.javascript.rhino.Node[])v21));
    Object v23 = 22;
    Object v24 = new com.google.javascript.rhino.Node[]{};
    Object v25 = new com.google.javascript.rhino.Node((((java.lang.Integer)v23).intValue()),((com.google.javascript.rhino.Node[])v24));
    ((com.google.javascript.jscomp.CheckGlobalThis)v5).visit(((com.google.javascript.jscomp.NodeTraversal)v10),((com.google.javascript.rhino.Node)v22),((com.google.javascript.rhino.Node)v25));
    Object v26 = null;
    org.junit.Assert.assertNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v2 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v6 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.CheckLevel)v5));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = 22;
    Object v9 = new com.google.javascript.rhino.Node[]{};
    Object v10 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()),((com.google.javascript.rhino.Node[])v9));
    Object v11 = ((com.google.javascript.rhino.Node)v10).toStringTree();
    Object v12 = 22;
    Object v13 = new com.google.javascript.rhino.Node[]{};
    Object v14 = new com.google.javascript.rhino.Node((((java.lang.Integer)v12).intValue()),((com.google.javascript.rhino.Node[])v13));
    Object v15 = ((com.google.javascript.jscomp.CheckGlobalThis)v2).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v14));
    org.junit.Assert.assertEquals((Object)(true), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "prototype";
    Object v2 = -3;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v5 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v4));
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v9 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v7),((com.google.javascript.jscomp.CheckLevel)v8));
    Object v10 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.NodeTraversal.Callback)v9));
    Object v11 = 22;
    Object v12 = new com.google.javascript.rhino.Node[]{};
    Object v13 = new com.google.javascript.rhino.Node((((java.lang.Integer)v11).intValue()),((com.google.javascript.rhino.Node[])v12));
    Object v14 = "OTHER";
    Object v15 = "";
    Object v16 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v14),((java.lang.String)v15));
    Object v17 = new java.lang.String[]{" ","return"};
    Object v18 = ((com.google.javascript.jscomp.NodeTraversal)v10).makeError(((com.google.javascript.rhino.Node)v13),((com.google.javascript.jscomp.DiagnosticType)v16),((java.lang.String[])v17));
    Object v19 = 22;
    Object v20 = new com.google.javascript.rhino.Node[]{};
    Object v21 = new com.google.javascript.rhino.Node((((java.lang.Integer)v19).intValue()),((com.google.javascript.rhino.Node[])v20));
    Object v22 = 22;
    Object v23 = new com.google.javascript.rhino.Node[]{};
    Object v24 = new com.google.javascript.rhino.Node((((java.lang.Integer)v22).intValue()),((com.google.javascript.rhino.Node[])v23));
    ((com.google.javascript.jscomp.CheckGlobalThis)v5).visit(((com.google.javascript.jscomp.NodeTraversal)v10),((com.google.javascript.rhino.Node)v21),((com.google.javascript.rhino.Node)v24));
    Object v25 = null;
    org.junit.Assert.assertNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "prototype";
    Object v2 = -3;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v5 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v4));
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v9 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v7),((com.google.javascript.jscomp.CheckLevel)v8));
    Object v10 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.NodeTraversal.Callback)v9));
    Object v11 = 22;
    Object v12 = new com.google.javascript.rhino.Node[]{};
    Object v13 = new com.google.javascript.rhino.Node((((java.lang.Integer)v11).intValue()),((com.google.javascript.rhino.Node[])v12));
    Object v14 = 22;
    Object v15 = new com.google.javascript.rhino.Node[]{};
    Object v16 = new com.google.javascript.rhino.Node((((java.lang.Integer)v14).intValue()),((com.google.javascript.rhino.Node[])v15));
    Object v17 = 22;
    Object v18 = new com.google.javascript.rhino.Node[]{};
    Object v19 = new com.google.javascript.rhino.Node((((java.lang.Integer)v17).intValue()),((com.google.javascript.rhino.Node[])v18));
    ((com.google.javascript.rhino.Node)v16).addChildToBack(((com.google.javascript.rhino.Node)v19));
    Object v20 = null;
    Object v21 = ((com.google.javascript.jscomp.CheckGlobalThis)v5).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v10),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v16));
    org.junit.Assert.assertEquals((Object)(true), v21);
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
    Object v8 = 22;
    Object v9 = new com.google.javascript.rhino.Node[]{};
    Object v10 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()),((com.google.javascript.rhino.Node[])v9));
    Object v11 = 22;
    Object v12 = new com.google.javascript.rhino.Node[]{};
    Object v13 = new com.google.javascript.rhino.Node((((java.lang.Integer)v11).intValue()),((com.google.javascript.rhino.Node[])v12));
    Object v14 = ((com.google.javascript.jscomp.CheckGlobalThis)v2).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v13));
    Object v15 = new com.google.javascript.jscomp.Compiler();
    Object v16 = new com.google.javascript.jscomp.Compiler();
    Object v17 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v18 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v16),((com.google.javascript.jscomp.CheckLevel)v17));
    Object v19 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v15),((com.google.javascript.jscomp.NodeTraversal.Callback)v18));
    Object v20 = 22;
    Object v21 = new com.google.javascript.rhino.Node[]{};
    Object v22 = new com.google.javascript.rhino.Node((((java.lang.Integer)v20).intValue()),((com.google.javascript.rhino.Node[])v21));
    Object v23 = false;
    ((com.google.javascript.rhino.Node)v22).setIsSyntheticBlock((((java.lang.Boolean)v23).booleanValue()));
    Object v24 = null;
    Object v25 = 22;
    Object v26 = new com.google.javascript.rhino.Node[]{};
    Object v27 = new com.google.javascript.rhino.Node((((java.lang.Integer)v25).intValue()),((com.google.javascript.rhino.Node[])v26));
    ((com.google.javascript.jscomp.CheckGlobalThis)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v19),((com.google.javascript.rhino.Node)v22),((com.google.javascript.rhino.Node)v27));
    Object v28 = null;
    org.junit.Assert.assertNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v2 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v6 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.CheckLevel)v5));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = ((com.google.javascript.jscomp.NodeTraversal)v7).getScope();
    Object v9 = 22;
    Object v10 = new com.google.javascript.rhino.Node[]{};
    Object v11 = new com.google.javascript.rhino.Node((((java.lang.Integer)v9).intValue()),((com.google.javascript.rhino.Node[])v10));
    Object v12 = 22;
    Object v13 = new com.google.javascript.rhino.Node[]{};
    Object v14 = new com.google.javascript.rhino.Node((((java.lang.Integer)v12).intValue()),((com.google.javascript.rhino.Node[])v13));
    ((com.google.javascript.jscomp.CheckGlobalThis)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v14));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "prototype";
    Object v2 = -3;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v5 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v4));
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v9 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v7),((com.google.javascript.jscomp.CheckLevel)v8));
    Object v10 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.NodeTraversal.Callback)v9));
    Object v11 = 22;
    Object v12 = new com.google.javascript.rhino.Node[]{};
    Object v13 = new com.google.javascript.rhino.Node((((java.lang.Integer)v11).intValue()),((com.google.javascript.rhino.Node[])v12));
    ((com.google.javascript.jscomp.NodeTraversal)v10).traverse(((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
    Object v15 = 22;
    Object v16 = new com.google.javascript.rhino.Node[]{};
    Object v17 = new com.google.javascript.rhino.Node((((java.lang.Integer)v15).intValue()),((com.google.javascript.rhino.Node[])v16));
    Object v18 = 22;
    Object v19 = new com.google.javascript.rhino.Node[]{};
    Object v20 = new com.google.javascript.rhino.Node((((java.lang.Integer)v18).intValue()),((com.google.javascript.rhino.Node[])v19));
    Object v21 = ((com.google.javascript.jscomp.CheckGlobalThis)v5).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v10),((com.google.javascript.rhino.Node)v17),((com.google.javascript.rhino.Node)v20));
    org.junit.Assert.assertEquals((Object)(true), v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "prototype";
    Object v2 = -3;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v5 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v0),((com.google.javascript.jscomp.CheckLevel)v4));
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v9 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v7),((com.google.javascript.jscomp.CheckLevel)v8));
    Object v10 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.NodeTraversal.Callback)v9));
    Object v11 = 22;
    Object v12 = new com.google.javascript.rhino.Node[]{};
    Object v13 = new com.google.javascript.rhino.Node((((java.lang.Integer)v11).intValue()),((com.google.javascript.rhino.Node[])v12));
    Object v14 = 22;
    Object v15 = new com.google.javascript.rhino.Node[]{};
    Object v16 = new com.google.javascript.rhino.Node((((java.lang.Integer)v14).intValue()),((com.google.javascript.rhino.Node[])v15));
    Object v17 = ((com.google.javascript.jscomp.CheckGlobalThis)v5).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v10),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v16));
    Object v18 = new com.google.javascript.jscomp.Compiler();
    Object v19 = new com.google.javascript.jscomp.Compiler();
    Object v20 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v21 = new com.google.javascript.jscomp.CheckGlobalThis(((com.google.javascript.jscomp.AbstractCompiler)v19),((com.google.javascript.jscomp.CheckLevel)v20));
    Object v22 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v18),((com.google.javascript.jscomp.NodeTraversal.Callback)v21));
    Object v23 = ((com.google.javascript.jscomp.NodeTraversal)v22).getScope();
    Object v24 = 22;
    Object v25 = new com.google.javascript.rhino.Node[]{};
    Object v26 = new com.google.javascript.rhino.Node((((java.lang.Integer)v24).intValue()),((com.google.javascript.rhino.Node[])v25));
    Object v27 = 22;
    Object v28 = new com.google.javascript.rhino.Node[]{};
    Object v29 = new com.google.javascript.rhino.Node((((java.lang.Integer)v27).intValue()),((com.google.javascript.rhino.Node[])v28));
    Object v30 = 22;
    Object v31 = new com.google.javascript.rhino.Node[]{};
    Object v32 = new com.google.javascript.rhino.Node((((java.lang.Integer)v30).intValue()),((com.google.javascript.rhino.Node[])v31));
    ((com.google.javascript.rhino.Node)v29).addChildToFront(((com.google.javascript.rhino.Node)v32));
    Object v33 = null;
    Object v34 = ((com.google.javascript.jscomp.CheckGlobalThis)v5).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v22),((com.google.javascript.rhino.Node)v26),((com.google.javascript.rhino.Node)v29));
    org.junit.Assert.assertEquals((Object)(true), v34);
  }
}
