package com.google.javascript.jscomp;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = "else";
    Object v7 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v6));
    Object v8 = "ERR_OR";
    Object v9 = "qif";
    Object v10 = com.google.javascript.jscomp.DiagnosticType.warning(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = new java.lang.String[]{"K","winCow"};
    ((com.google.javascript.jscomp.NodeTraversal)v5).report(((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.DiagnosticType)v10),((java.lang.String[])v11));
    Object v12 = null;
    Object v13 = "else";
    Object v14 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v13));
    Object v15 = "else";
    Object v16 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v15));
    Object v17 = "else";
    Object v18 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v17));
    Object v19 = "else";
    Object v20 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v19));
    ((com.google.javascript.jscomp.FoldConstants)v1).tryFoldShift(((com.google.javascript.jscomp.NodeTraversal)v5),((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.Node)v16),((com.google.javascript.rhino.Node)v18),((com.google.javascript.rhino.Node)v20));
    Object v21 = null;
    org.junit.Assert.assertNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = "else";
    Object v7 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v6));
    Object v8 = "else";
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8));
    Object v10 = "else";
    Object v11 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v10));
    Object v12 = false;
    ((com.google.javascript.rhino.Node)v11).setOptionalArg((((java.lang.Boolean)v12).booleanValue()));
    Object v13 = null;
    Object v14 = "else";
    Object v15 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v14));
    ((com.google.javascript.jscomp.FoldConstants)v1).tryFoldArithmetic(((com.google.javascript.jscomp.NodeTraversal)v5),((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = "else";
    Object v7 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v6));
    Object v8 = "else";
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8));
    ((com.google.javascript.jscomp.FoldConstants)v1).visit(((com.google.javascript.jscomp.NodeTraversal)v5),((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Compiler();
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v11),((com.google.javascript.jscomp.NodeTraversal.Callback)v13));
    Object v15 = "else";
    Object v16 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v15));
    Object v17 = "else";
    Object v18 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v17));
    ((com.google.javascript.jscomp.FoldConstants)v1).tryFoldFor(((com.google.javascript.jscomp.NodeTraversal)v14),((com.google.javascript.rhino.Node)v16),((com.google.javascript.rhino.Node)v18));
    Object v19 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = "else";
    Object v7 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v6));
    Object v8 = "ERR_OR";
    Object v9 = "qif";
    Object v10 = com.google.javascript.jscomp.DiagnosticType.warning(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = new java.lang.String[]{};
    ((com.google.javascript.jscomp.NodeTraversal)v5).report(((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.DiagnosticType)v10),((java.lang.String[])v11));
    Object v12 = null;
    Object v13 = "else";
    Object v14 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v13));
    Object v15 = "else";
    Object v16 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v15));
    Object v17 = "else";
    Object v18 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v17));
    Object v19 = "else";
    Object v20 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v19));
    Object v21 = ((com.google.javascript.rhino.Node)v20).children();
    ((com.google.javascript.jscomp.FoldConstants)v1).tryFoldGetElem(((com.google.javascript.jscomp.NodeTraversal)v5),((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.Node)v16),((com.google.javascript.rhino.Node)v18),((com.google.javascript.rhino.Node)v20));
    Object v22 = null;
    org.junit.Assert.assertNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = "else";
    Object v7 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v6));
    Object v8 = "else";
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8));
    Object v10 = ((com.google.javascript.jscomp.FoldConstants)v1).tryFoldHookIf(((com.google.javascript.jscomp.NodeTraversal)v5),((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = "else";
    Object v7 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v6));
    Object v8 = 0;
    ((com.google.javascript.rhino.Node)v7).removeProp((((java.lang.Integer)v8).intValue()));
    Object v9 = null;
    Object v10 = "else";
    Object v11 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v10));
    Object v12 = new com.google.javascript.rhino.JSDocInfo();
    ((com.google.javascript.rhino.Node)v11).setJSDocInfo(((com.google.javascript.rhino.JSDocInfo)v12));
    Object v13 = null;
    ((com.google.javascript.jscomp.FoldConstants)v1).tryFoldFor(((com.google.javascript.jscomp.NodeTraversal)v5),((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v11));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = ((com.google.javascript.jscomp.NodeTraversal)v5).getEnclosingFunction();
    Object v7 = "else";
    Object v8 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v7));
    Object v9 = ((com.google.javascript.rhino.Node)v8).removeChildren();
    Object v10 = "else";
    Object v11 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v10));
    ((com.google.javascript.jscomp.FoldConstants)v1).tryFoldRegularExpressionConstructor(((com.google.javascript.jscomp.NodeTraversal)v5),((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = "else";
    Object v7 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v6));
    Object v8 = "ERR_OR";
    Object v9 = "qif";
    Object v10 = com.google.javascript.jscomp.DiagnosticType.warning(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = new java.lang.String[]{};
    ((com.google.javascript.jscomp.NodeTraversal)v5).report(((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.DiagnosticType)v10),((java.lang.String[])v11));
    Object v12 = null;
    Object v13 = "else";
    Object v14 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v13));
    Object v15 = "else";
    Object v16 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v15));
    Object v17 = "else";
    Object v18 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v17));
    Object v19 = "else";
    Object v20 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v19));
    ((com.google.javascript.jscomp.FoldConstants)v1).tryFoldGetElem(((com.google.javascript.jscomp.NodeTraversal)v5),((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.Node)v16),((com.google.javascript.rhino.Node)v18),((com.google.javascript.rhino.Node)v20));
    Object v21 = null;
    org.junit.Assert.assertNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = "else";
    Object v7 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v6));
    Object v8 = "else";
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8));
    ((com.google.javascript.jscomp.FoldConstants)v1).visit(((com.google.javascript.jscomp.NodeTraversal)v5),((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Compiler();
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v11),((com.google.javascript.jscomp.NodeTraversal.Callback)v13));
    Object v15 = "else";
    Object v16 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v15));
    Object v17 = "else";
    Object v18 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v17));
    Object v19 = "else";
    Object v20 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v19));
    Object v21 = "else";
    Object v22 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v21));
    Object v23 = ((com.google.javascript.rhino.Node)v22).isQualifiedName();
    ((com.google.javascript.jscomp.FoldConstants)v1).tryFoldAndOr(((com.google.javascript.jscomp.NodeTraversal)v14),((com.google.javascript.rhino.Node)v16),((com.google.javascript.rhino.Node)v18),((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.Node)v22));
    Object v24 = null;
    org.junit.Assert.assertNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = "else";
    Object v7 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v6));
    Object v8 = "else";
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8));
    Object v10 = ": ";
    Object v11 = 1;
    ((com.google.javascript.jscomp.FoldConstants)v1).tryFoldLiteralConstructor(((com.google.javascript.jscomp.NodeTraversal)v5),((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9),((java.lang.String)v10),(((java.lang.Integer)v11).intValue()));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = "else";
    Object v7 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v6));
    Object v8 = "else";
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8));
    ((com.google.javascript.jscomp.FoldConstants)v1).tryFoldWhile(((com.google.javascript.jscomp.NodeTraversal)v5),((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = "else";
    Object v7 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v6));
    Object v8 = "else";
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8));
    ((com.google.javascript.jscomp.FoldConstants)v1).visit(((com.google.javascript.jscomp.NodeTraversal)v5),((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = "else";
    Object v7 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v6));
    Object v8 = "else";
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8));
    Object v10 = "else";
    Object v11 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v10));
    ((com.google.javascript.rhino.Node)v9).copyInformationFromForTree(((com.google.javascript.rhino.Node)v11));
    Object v12 = null;
    Object v13 = "else";
    Object v14 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v13));
    Object v15 = "else";
    Object v16 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v15));
    ((com.google.javascript.jscomp.FoldConstants)v1).tryFoldAndOr(((com.google.javascript.jscomp.NodeTraversal)v5),((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.Node)v16));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = "else";
    Object v7 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v6));
    Object v8 = "else";
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8));
    Object v10 = "else";
    Object v11 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v10));
    Object v12 = "else";
    Object v13 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v12));
    ((com.google.javascript.jscomp.FoldConstants)v1).tryFoldStringIndexOf(((com.google.javascript.jscomp.NodeTraversal)v5),((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = "else";
    Object v7 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v6));
    Object v8 = "else";
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8));
    ((com.google.javascript.jscomp.FoldConstants)v1).tryFoldBlock(((com.google.javascript.jscomp.NodeTraversal)v5),((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = "else";
    Object v7 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v6));
    Object v8 = "else";
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8));
    ((com.google.javascript.jscomp.FoldConstants)v1).tryMinimizeIf(((com.google.javascript.jscomp.NodeTraversal)v5),((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = ((com.google.javascript.jscomp.NodeTraversal)v5).getScope();
    Object v7 = "else";
    Object v8 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v7));
    Object v9 = "else";
    Object v10 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v9));
    Object v11 = "else";
    Object v12 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v11));
    Object v13 = ((com.google.javascript.rhino.Node)v10).checkTreeTypeAwareEqualsSilent(((com.google.javascript.rhino.Node)v12));
    Object v14 = "else";
    Object v15 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v14));
    Object v16 = "else";
    Object v17 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v16));
    ((com.google.javascript.jscomp.FoldConstants)v1).tryFoldBitAndOr(((com.google.javascript.jscomp.NodeTraversal)v5),((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v15),((com.google.javascript.rhino.Node)v17));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = "else";
    Object v7 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v6));
    Object v8 = -10;
    ((com.google.javascript.rhino.Node)v7).setLineno((((java.lang.Integer)v8).intValue()));
    Object v9 = null;
    Object v10 = "else";
    Object v11 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v10));
    Object v12 = 0;
    ((com.google.javascript.rhino.Node)v11).setLineno((((java.lang.Integer)v12).intValue()));
    Object v13 = null;
    Object v14 = "else";
    Object v15 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v14));
    Object v16 = "else";
    Object v17 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v16));
    Object v18 = "else";
    Object v19 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v18));
    ((com.google.javascript.rhino.Node)v17).addChildrenToFront(((com.google.javascript.rhino.Node)v19));
    Object v20 = null;
    ((com.google.javascript.jscomp.FoldConstants)v1).tryFoldComparison(((com.google.javascript.jscomp.NodeTraversal)v5),((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v15),((com.google.javascript.rhino.Node)v17));
    Object v21 = null;
    org.junit.Assert.assertNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = "else";
    Object v7 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v6));
    Object v8 = "else";
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8));
    ((com.google.javascript.rhino.Node)v7).addChildToBack(((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
    Object v11 = "else";
    Object v12 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v11));
    ((com.google.javascript.jscomp.FoldConstants)v1).tryFoldFor(((com.google.javascript.jscomp.NodeTraversal)v5),((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = "else";
    Object v7 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v6));
    Object v8 = "else";
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8));
    Object v10 = "else";
    Object v11 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v10));
    Object v12 = ((com.google.javascript.rhino.Node)v11).siblings();
    Object v13 = "else";
    Object v14 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v13));
    ((com.google.javascript.jscomp.FoldConstants)v1).tryFoldBitAndOr(((com.google.javascript.jscomp.NodeTraversal)v5),((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v14));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = ((com.google.javascript.jscomp.NodeTraversal)v5).getScope();
    Object v7 = "else";
    Object v8 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v7));
    Object v9 = "else";
    Object v10 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v9));
    Object v11 = "else";
    Object v12 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v11));
    Object v13 = "else";
    Object v14 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v13));
    ((com.google.javascript.jscomp.FoldConstants)v1).tryFoldLeftChildAdd(((com.google.javascript.jscomp.NodeTraversal)v5),((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v14));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = " * ";
    Object v1 = com.google.javascript.jscomp.FoldConstants.containsUnicodeEscape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = "else";
    Object v7 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v6));
    Object v8 = "else";
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8));
    Object v10 = "else";
    Object v11 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v10));
    Object v12 = "else";
    Object v13 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v12));
    ((com.google.javascript.jscomp.FoldConstants)v1).tryFoldLeftChildAdd(((com.google.javascript.jscomp.NodeTraversal)v5),((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = "else";
    Object v7 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v6));
    Object v8 = "else";
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8));
    ((com.google.javascript.jscomp.FoldConstants)v1).visit(((com.google.javascript.jscomp.NodeTraversal)v5),((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Compiler();
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v11),((com.google.javascript.jscomp.NodeTraversal.Callback)v13));
    Object v15 = "else";
    Object v16 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v15));
    Object v17 = "else";
    Object v18 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v17));
    ((com.google.javascript.rhino.Node)v16).copyInformationFromForTree(((com.google.javascript.rhino.Node)v18));
    Object v19 = null;
    Object v20 = "else";
    Object v21 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v20));
    Object v22 = "else";
    Object v23 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v22));
    Object v24 = "else";
    Object v25 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v24));
    ((com.google.javascript.jscomp.FoldConstants)v1).tryFoldGetProp(((com.google.javascript.jscomp.NodeTraversal)v14),((com.google.javascript.rhino.Node)v16),((com.google.javascript.rhino.Node)v21),((com.google.javascript.rhino.Node)v23),((com.google.javascript.rhino.Node)v25));
    Object v26 = null;
    org.junit.Assert.assertNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = "else";
    Object v7 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v6));
    Object v8 = "else";
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8));
    Object v10 = "else";
    Object v11 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v10));
    Object v12 = ((com.google.javascript.rhino.Node)v9).checkTreeTypeAwareEqualsSilent(((com.google.javascript.rhino.Node)v11));
    ((com.google.javascript.jscomp.FoldConstants)v1).tryFoldBlock(((com.google.javascript.jscomp.NodeTraversal)v5),((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = "else";
    Object v7 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v6));
    Object v8 = "else";
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8));
    ((com.google.javascript.jscomp.FoldConstants)v1).visit(((com.google.javascript.jscomp.NodeTraversal)v5),((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Compiler();
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v11),((com.google.javascript.jscomp.NodeTraversal.Callback)v13));
    Object v15 = "else";
    Object v16 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v15));
    Object v17 = "else";
    Object v18 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v17));
    ((com.google.javascript.jscomp.FoldConstants)v1).tryFoldDo(((com.google.javascript.jscomp.NodeTraversal)v14),((com.google.javascript.rhino.Node)v16),((com.google.javascript.rhino.Node)v18));
    Object v19 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = ((com.google.javascript.jscomp.NodeTraversal)v5).getEnclosingFunction();
    Object v7 = "else";
    Object v8 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v7));
    Object v9 = "else";
    Object v10 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v9));
    Object v11 = "else";
    Object v12 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v11));
    Object v13 = ((com.google.javascript.rhino.Node)v12).children();
    Object v14 = "else";
    Object v15 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v14));
    ((com.google.javascript.jscomp.FoldConstants)v1).tryFoldStringIndexOf(((com.google.javascript.jscomp.NodeTraversal)v5),((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = "else";
    Object v7 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v6));
    Object v8 = "else";
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8));
    ((com.google.javascript.jscomp.FoldConstants)v1).visit(((com.google.javascript.jscomp.NodeTraversal)v5),((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Compiler();
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v11),((com.google.javascript.jscomp.NodeTraversal.Callback)v13));
    Object v15 = "else";
    Object v16 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v15));
    Object v17 = "else";
    Object v18 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v17));
    Object v19 = "else";
    Object v20 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v19));
    Object v21 = ((com.google.javascript.rhino.Node)v20).isUnscopedQualifiedName();
    Object v22 = "else";
    Object v23 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v22));
    Object v24 = ((com.google.javascript.rhino.Node)v23).hasSideEffects();
    ((com.google.javascript.jscomp.FoldConstants)v1).tryFoldComparison(((com.google.javascript.jscomp.NodeTraversal)v14),((com.google.javascript.rhino.Node)v16),((com.google.javascript.rhino.Node)v18),((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.Node)v23));
    Object v25 = null;
    org.junit.Assert.assertNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = ((com.google.javascript.jscomp.NodeTraversal)v5).getEnclosingFunction();
    Object v7 = "else";
    Object v8 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v7));
    Object v9 = "else";
    Object v10 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v9));
    Object v11 = ((com.google.javascript.rhino.Node)v8).checkTreeEquals(((com.google.javascript.rhino.Node)v10));
    Object v12 = "else";
    Object v13 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v12));
    Object v14 = "else";
    Object v15 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v14));
    Object v16 = "else";
    Object v17 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v16));
    ((com.google.javascript.jscomp.FoldConstants)v1).tryFoldGetElem(((com.google.javascript.jscomp.NodeTraversal)v5),((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v15),((com.google.javascript.rhino.Node)v17));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = "else";
    Object v7 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v6));
    Object v8 = "else";
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8));
    ((com.google.javascript.jscomp.FoldConstants)v1).tryFoldRegularExpressionConstructor(((com.google.javascript.jscomp.NodeTraversal)v5),((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = "else";
    Object v7 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v6));
    Object v8 = "else";
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8));
    Object v10 = "else";
    Object v11 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v10));
    Object v12 = "else";
    Object v13 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v12));
    Object v14 = "else";
    Object v15 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v14));
    ((com.google.javascript.rhino.Node)v11).addChildAfter(((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
    Object v17 = "else";
    Object v18 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v17));
    Object v19 = ((com.google.javascript.rhino.Node)v18).removeFirstChild();
    ((com.google.javascript.jscomp.FoldConstants)v1).tryFoldGetProp(((com.google.javascript.jscomp.NodeTraversal)v5),((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v18));
    Object v20 = null;
    org.junit.Assert.assertNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = ((com.google.javascript.jscomp.NodeTraversal)v5).getEnclosingFunction();
    Object v7 = "else";
    Object v8 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v7));
    Object v9 = "else";
    Object v10 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v9));
    ((com.google.javascript.jscomp.FoldConstants)v1).tryFoldBlock(((com.google.javascript.jscomp.NodeTraversal)v5),((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = "else";
    Object v7 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v6));
    Object v8 = "ERR_OR";
    Object v9 = "qif";
    Object v10 = com.google.javascript.jscomp.DiagnosticType.warning(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = new java.lang.String[]{};
    ((com.google.javascript.jscomp.NodeTraversal)v5).report(((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.DiagnosticType)v10),((java.lang.String[])v11));
    Object v12 = null;
    Object v13 = "else";
    Object v14 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v13));
    Object v15 = "else";
    Object v16 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v15));
    Object v17 = "else";
    Object v18 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v17));
    Object v19 = "else";
    Object v20 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v19));
    ((com.google.javascript.rhino.Node)v18).addChildrenToBack(((com.google.javascript.rhino.Node)v20));
    Object v21 = null;
    Object v22 = "else";
    Object v23 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v22));
    ((com.google.javascript.jscomp.FoldConstants)v1).tryFoldAdd(((com.google.javascript.jscomp.NodeTraversal)v5),((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.Node)v16),((com.google.javascript.rhino.Node)v18),((com.google.javascript.rhino.Node)v23));
    Object v24 = null;
    org.junit.Assert.assertNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = "else";
    Object v7 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v6));
    Object v8 = "else";
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8));
    Object v10 = "else";
    Object v11 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v10));
    Object v12 = "else";
    Object v13 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v12));
    Object v14 = ((com.google.javascript.rhino.Node)v11).checkTreeEquals(((com.google.javascript.rhino.Node)v13));
    Object v15 = "else";
    Object v16 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v15));
    ((com.google.javascript.jscomp.FoldConstants)v1).tryFoldLeftChildAdd(((com.google.javascript.jscomp.NodeTraversal)v5),((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v16));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = "else";
    Object v7 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v6));
    Object v8 = "else";
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8));
    ((com.google.javascript.jscomp.FoldConstants)v1).visit(((com.google.javascript.jscomp.NodeTraversal)v5),((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Compiler();
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v11),((com.google.javascript.jscomp.NodeTraversal.Callback)v13));
    Object v15 = "else";
    Object v16 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v15));
    Object v17 = "else";
    Object v18 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v17));
    Object v19 = "else";
    Object v20 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v19));
    Object v21 = "else";
    Object v22 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v21));
    ((com.google.javascript.jscomp.FoldConstants)v1).tryFoldStringJoin(((com.google.javascript.jscomp.NodeTraversal)v14),((com.google.javascript.rhino.Node)v16),((com.google.javascript.rhino.Node)v18),((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.Node)v22));
    Object v23 = null;
    org.junit.Assert.assertNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = ((com.google.javascript.jscomp.NodeTraversal)v5).hasScope();
    Object v7 = "else";
    Object v8 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v7));
    Object v9 = "else";
    Object v10 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v9));
    Object v11 = "else";
    Object v12 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v11));
    Object v13 = "else";
    Object v14 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v13));
    ((com.google.javascript.jscomp.FoldConstants)v1).tryFoldAdd(((com.google.javascript.jscomp.NodeTraversal)v5),((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v14));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = "throw";
    Object v1 = com.google.javascript.jscomp.FoldConstants.containsUnicodeEscape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = ((com.google.javascript.jscomp.NodeTraversal)v5).getScope();
    Object v7 = "else";
    Object v8 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v7));
    Object v9 = "else";
    Object v10 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v9));
    Object v11 = "else";
    Object v12 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v11));
    Object v13 = "else";
    Object v14 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v13));
    Object v15 = "throw";
    Object v16 = com.google.javascript.jscomp.FoldConstants.containsUnicodeEscape(((java.lang.String)v15));
    Object v17 = 1;
    Object v18 = new java.io.StringWriter((((java.lang.Integer)v17).intValue()));
    Object v19 = new com.google.javascript.rhino.JSDocInfo();
    Object v20 = new com.google.javascript.rhino.JSDocInfo();
    Object v21 = "ERR_OR";
    Object v22 = "qif";
    Object v23 = com.google.javascript.jscomp.DiagnosticType.warning(((java.lang.String)v21),((java.lang.String)v22));
    Object v24 = 1;
    Object v25 = new java.io.StringWriter((((java.lang.Integer)v24).intValue()));
    Object v26 = java.util.Set.of(((java.lang.Object)v16),((java.lang.Object)v18),((java.lang.Object)v19),((java.lang.Object)v20),((java.lang.Object)v23),((java.lang.Object)v25));
    ((com.google.javascript.rhino.Node)v14).setDirectives(((java.util.Set)v26));
    Object v27 = null;
    ((com.google.javascript.jscomp.FoldConstants)v1).tryFoldAdd(((com.google.javascript.jscomp.NodeTraversal)v5),((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v14));
    Object v28 = null;
    org.junit.Assert.assertNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = "else";
    Object v7 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v6));
    Object v8 = "else";
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8));
    ((com.google.javascript.jscomp.FoldConstants)v1).visit(((com.google.javascript.jscomp.NodeTraversal)v5),((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Compiler();
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v11),((com.google.javascript.jscomp.NodeTraversal.Callback)v13));
    Object v15 = "else";
    Object v16 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v15));
    Object v17 = ((com.google.javascript.rhino.Node)v16).removeFirstChild();
    Object v18 = "else";
    Object v19 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v18));
    ((com.google.javascript.jscomp.FoldConstants)v1).tryFoldRegularExpressionConstructor(((com.google.javascript.jscomp.NodeTraversal)v14),((com.google.javascript.rhino.Node)v16),((com.google.javascript.rhino.Node)v19));
    Object v20 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = "else";
    Object v7 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v6));
    Object v8 = "else";
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8));
    Object v10 = "else";
    Object v11 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v10));
    Object v12 = true;
    ((com.google.javascript.rhino.Node)v11).setWasEmptyNode((((java.lang.Boolean)v12).booleanValue()));
    Object v13 = null;
    Object v14 = "else";
    Object v15 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v14));
    Object v16 = ((com.google.javascript.rhino.Node)v15).isQualifiedName();
    ((com.google.javascript.jscomp.FoldConstants)v1).tryFoldAndOr(((com.google.javascript.jscomp.NodeTraversal)v5),((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v15));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = ((com.google.javascript.jscomp.NodeTraversal)v5).getEnclosingFunction();
    Object v7 = "else";
    Object v8 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v7));
    Object v9 = "else";
    Object v10 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v9));
    Object v11 = ((com.google.javascript.rhino.Node)v10).getAncestors();
    ((com.google.javascript.jscomp.FoldConstants)v1).tryFoldDo(((com.google.javascript.jscomp.NodeTraversal)v5),((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v10));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = "else";
    Object v7 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v6));
    Object v8 = "else";
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8));
    Object v10 = "else";
    Object v11 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v10));
    Object v12 = ((com.google.javascript.rhino.Node)v11).cloneNode();
    Object v13 = "else";
    Object v14 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v13));
    ((com.google.javascript.jscomp.FoldConstants)v1).tryFoldArithmetic(((com.google.javascript.jscomp.NodeTraversal)v5),((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v14));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = "else";
    Object v7 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v6));
    Object v8 = "else";
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8));
    ((com.google.javascript.jscomp.FoldConstants)v1).visit(((com.google.javascript.jscomp.NodeTraversal)v5),((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Compiler();
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v11),((com.google.javascript.jscomp.NodeTraversal.Callback)v13));
    Object v15 = "else";
    Object v16 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v15));
    Object v17 = "else";
    Object v18 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v17));
    Object v19 = "else";
    Object v20 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v19));
    Object v21 = "else";
    Object v22 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v21));
    ((com.google.javascript.jscomp.FoldConstants)v1).tryFoldGetElem(((com.google.javascript.jscomp.NodeTraversal)v14),((com.google.javascript.rhino.Node)v16),((com.google.javascript.rhino.Node)v18),((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.Node)v22));
    Object v23 = null;
    org.junit.Assert.assertNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = ((com.google.javascript.jscomp.NodeTraversal)v5).hasScope();
    Object v7 = "else";
    Object v8 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v7));
    Object v9 = "else";
    Object v10 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v9));
    Object v11 = "else";
    Object v12 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v11));
    Object v13 = "else";
    Object v14 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v13));
    ((com.google.javascript.jscomp.FoldConstants)v1).tryFoldStringJoin(((com.google.javascript.jscomp.NodeTraversal)v5),((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v14));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = "else";
    Object v7 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v6));
    Object v8 = "else";
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8));
    Object v10 = "else";
    Object v11 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v10));
    Object v12 = "else";
    Object v13 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v12));
    ((com.google.javascript.jscomp.FoldConstants)v1).tryFoldComparison(((com.google.javascript.jscomp.NodeTraversal)v5),((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = "else";
    Object v7 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v6));
    Object v8 = "else";
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8));
    Object v10 = "else";
    Object v11 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v10));
    Object v12 = "else";
    Object v13 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v12));
    Object v14 = "else";
    Object v15 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v14));
    Object v16 = ((com.google.javascript.rhino.Node)v13).checkTreeEqualsSilent(((com.google.javascript.rhino.Node)v15));
    ((com.google.javascript.jscomp.FoldConstants)v1).tryFoldBitAndOr(((com.google.javascript.jscomp.NodeTraversal)v5),((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v13));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = "else";
    Object v3 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v2));
    Object v4 = ((com.google.javascript.rhino.Node)v3).hasSideEffects();
    Object v5 = ((com.google.javascript.jscomp.FoldConstants)v1).hasBreakOrContinue(((com.google.javascript.rhino.Node)v3));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = "else";
    Object v7 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v6));
    Object v8 = "else";
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8));
    ((com.google.javascript.jscomp.FoldConstants)v1).visit(((com.google.javascript.jscomp.NodeTraversal)v5),((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Compiler();
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v11),((com.google.javascript.jscomp.NodeTraversal.Callback)v13));
    Object v15 = "else";
    Object v16 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v15));
    Object v17 = "else";
    Object v18 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v17));
    Object v19 = ((com.google.javascript.rhino.Node)v18).removeFirstChild();
    ((com.google.javascript.jscomp.FoldConstants)v1).visit(((com.google.javascript.jscomp.NodeTraversal)v14),((com.google.javascript.rhino.Node)v16),((com.google.javascript.rhino.Node)v18));
    Object v20 = null;
    org.junit.Assert.assertNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = "else";
    Object v7 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v6));
    Object v8 = "else";
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8));
    Object v10 = false;
    ((com.google.javascript.rhino.Node)v9).setIsSyntheticBlock((((java.lang.Boolean)v10).booleanValue()));
    Object v11 = null;
    ((com.google.javascript.jscomp.FoldConstants)v1).tryFoldWhile(((com.google.javascript.jscomp.NodeTraversal)v5),((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = "else";
    Object v7 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v6));
    Object v8 = "else";
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8));
    Object v10 = "else";
    Object v11 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v10));
    Object v12 = "else";
    Object v13 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v12));
    Object v14 = "else";
    Object v15 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v14));
    Object v16 = ((com.google.javascript.rhino.Node)v13).checkTreeEqualsSilent(((com.google.javascript.rhino.Node)v15));
    ((com.google.javascript.jscomp.FoldConstants)v1).tryFoldLeftChildAdd(((com.google.javascript.jscomp.NodeTraversal)v5),((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v13));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = "else";
    Object v7 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v6));
    Object v8 = "else";
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8));
    Object v10 = ((com.google.javascript.rhino.Node)v9).removeChildren();
    Object v11 = "else";
    Object v12 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v11));
    Object v13 = 1;
    ((com.google.javascript.rhino.Node)v12).setCharno((((java.lang.Integer)v13).intValue()));
    Object v14 = null;
    Object v15 = "else";
    Object v16 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v15));
    Object v17 = "else";
    Object v18 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v17));
    Object v19 = "else";
    Object v20 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v19));
    ((com.google.javascript.rhino.Node)v16).addChildAfter(((com.google.javascript.rhino.Node)v18),((com.google.javascript.rhino.Node)v20));
    Object v21 = null;
    ((com.google.javascript.jscomp.FoldConstants)v1).tryFoldGetProp(((com.google.javascript.jscomp.NodeTraversal)v5),((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v16));
    Object v22 = null;
    org.junit.Assert.assertNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = "else";
    Object v7 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v6));
    Object v8 = "else";
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8));
    ((com.google.javascript.jscomp.FoldConstants)v1).tryMinimizeCondition(((com.google.javascript.jscomp.NodeTraversal)v5),((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = "else";
    Object v7 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v6));
    Object v8 = "else";
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8));
    ((com.google.javascript.jscomp.FoldConstants)v1).visit(((com.google.javascript.jscomp.NodeTraversal)v5),((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Compiler();
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v11),((com.google.javascript.jscomp.NodeTraversal.Callback)v13));
    Object v15 = "else";
    Object v16 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v15));
    Object v17 = "else";
    Object v18 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v17));
    Object v19 = 0;
    Object v20 = ((com.google.javascript.rhino.Node)v18).getAncestor((((java.lang.Integer)v19).intValue()));
    ((com.google.javascript.jscomp.FoldConstants)v1).tryFoldFor(((com.google.javascript.jscomp.NodeTraversal)v14),((com.google.javascript.rhino.Node)v16),((com.google.javascript.rhino.Node)v18));
    Object v21 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = "else";
    Object v7 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v6));
    Object v8 = "else";
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8));
    ((com.google.javascript.jscomp.FoldConstants)v1).visit(((com.google.javascript.jscomp.NodeTraversal)v5),((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Compiler();
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v11),((com.google.javascript.jscomp.NodeTraversal.Callback)v13));
    Object v15 = "else";
    Object v16 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v15));
    Object v17 = "else";
    Object v18 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v17));
    Object v19 = ((com.google.javascript.jscomp.FoldConstants)v1).tryFoldHookIf(((com.google.javascript.jscomp.NodeTraversal)v14),((com.google.javascript.rhino.Node)v16),((com.google.javascript.rhino.Node)v18));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = ((com.google.javascript.jscomp.NodeTraversal)v5).getEnclosingFunction();
    Object v7 = "else";
    Object v8 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v7));
    Object v9 = "else";
    Object v10 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v9));
    ((com.google.javascript.jscomp.FoldConstants)v1).tryFoldDo(((com.google.javascript.jscomp.NodeTraversal)v5),((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = ((com.google.javascript.jscomp.NodeTraversal)v5).getEnclosingFunction();
    Object v7 = "else";
    Object v8 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v7));
    Object v9 = 62;
    Object v10 = true;
    ((com.google.javascript.rhino.Node)v8).putBooleanProp((((java.lang.Integer)v9).intValue()),(((java.lang.Boolean)v10).booleanValue()));
    Object v11 = null;
    Object v12 = "else";
    Object v13 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v12));
    Object v14 = ((com.google.javascript.jscomp.FoldConstants)v1).tryFoldHookIf(((com.google.javascript.jscomp.NodeTraversal)v5),((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v13));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = ((com.google.javascript.jscomp.NodeTraversal)v5).getScope();
    Object v7 = "else";
    Object v8 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v7));
    Object v9 = "else";
    Object v10 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v9));
    Object v11 = "else";
    Object v12 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v11));
    ((com.google.javascript.rhino.Node)v10).addChildrenToBack(((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
    Object v14 = "else";
    Object v15 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v14));
    Object v16 = "else";
    Object v17 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v16));
    ((com.google.javascript.jscomp.FoldConstants)v1).tryFoldLeftChildAdd(((com.google.javascript.jscomp.NodeTraversal)v5),((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v15),((com.google.javascript.rhino.Node)v17));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = "else";
    Object v7 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v6));
    Object v8 = "else";
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8));
    Object v10 = ((com.google.javascript.rhino.Node)v7).checkTreeTypeAwareEqualsSilent(((com.google.javascript.rhino.Node)v9));
    Object v11 = "else";
    Object v12 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v11));
    ((com.google.javascript.jscomp.FoldConstants)v1).tryFoldDo(((com.google.javascript.jscomp.NodeTraversal)v5),((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = "else";
    Object v7 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v6));
    Object v8 = "else";
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8));
    Object v10 = "else";
    Object v11 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v10));
    ((com.google.javascript.rhino.Node)v9).addChildrenToBack(((com.google.javascript.rhino.Node)v11));
    Object v12 = null;
    ((com.google.javascript.jscomp.FoldConstants)v1).tryFoldDo(((com.google.javascript.jscomp.NodeTraversal)v5),((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = ((com.google.javascript.jscomp.NodeTraversal)v5).getEnclosingFunction();
    Object v7 = "else";
    Object v8 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v7));
    Object v9 = "else";
    Object v10 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v9));
    Object v11 = "else";
    Object v12 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v11));
    Object v13 = "else";
    Object v14 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v13));
    ((com.google.javascript.jscomp.FoldConstants)v1).tryFoldLeftChildAdd(((com.google.javascript.jscomp.NodeTraversal)v5),((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v14));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = "else";
    Object v7 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v6));
    Object v8 = "ERR_OR";
    Object v9 = "qif";
    Object v10 = com.google.javascript.jscomp.DiagnosticType.warning(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = new java.lang.String[]{"V"};
    ((com.google.javascript.jscomp.NodeTraversal)v5).report(((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.DiagnosticType)v10),((java.lang.String[])v11));
    Object v12 = null;
    Object v13 = "else";
    Object v14 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v13));
    Object v15 = new com.google.javascript.jscomp.Compiler();
    Object v16 = com.google.javascript.jscomp.RhinoErrorReporter.forOldRhino(((com.google.javascript.jscomp.AbstractCompiler)v15));
    Object v17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v16));
    Object v18 = "byte";
    Object v19 = "!";
    Object v20 = 0;
    Object v21 = 1;
    Object v22 = new com.google.javascript.rhino.jstype.NamedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v17),((java.lang.String)v18),((java.lang.String)v19),(((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()));
    ((com.google.javascript.rhino.Node)v14).setJSType(((com.google.javascript.rhino.jstype.JSType)v22));
    Object v23 = null;
    Object v24 = "else";
    Object v25 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v24));
    Object v26 = ((com.google.javascript.rhino.Node)v25).removeChildren();
    Object v27 = "@";
    Object v28 = 1;
    ((com.google.javascript.jscomp.FoldConstants)v1).tryFoldLiteralConstructor(((com.google.javascript.jscomp.NodeTraversal)v5),((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.Node)v25),((java.lang.String)v27),(((java.lang.Integer)v28).intValue()));
    Object v29 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = "else";
    Object v7 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v6));
    Object v8 = "else";
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8));
    Object v10 = "else";
    Object v11 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v10));
    ((com.google.javascript.rhino.Node)v9).copyInformationFromForTree(((com.google.javascript.rhino.Node)v11));
    Object v12 = null;
    Object v13 = "else";
    Object v14 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v13));
    Object v15 = "else";
    Object v16 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v15));
    ((com.google.javascript.jscomp.FoldConstants)v1).tryFoldLeftChildAdd(((com.google.javascript.jscomp.NodeTraversal)v5),((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.Node)v16));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = "else";
    Object v7 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v6));
    Object v8 = "else";
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8));
    Object v10 = ((com.google.javascript.rhino.Node)v9).isUnscopedQualifiedName();
    ((com.google.javascript.jscomp.FoldConstants)v1).tryFoldRegularExpressionConstructor(((com.google.javascript.jscomp.NodeTraversal)v5),((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = "else";
    Object v7 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v6));
    Object v8 = "else";
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8));
    Object v10 = ((com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback)v1).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v5),((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9));
    org.junit.Assert.assertEquals((Object)(true), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = "else";
    Object v7 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v6));
    Object v8 = "else";
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8));
    Object v10 = "else";
    Object v11 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v10));
    Object v12 = "else";
    Object v13 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v12));
    ((com.google.javascript.jscomp.FoldConstants)v1).tryFoldShift(((com.google.javascript.jscomp.NodeTraversal)v5),((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = "else";
    Object v7 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v6));
    Object v8 = "else";
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8));
    Object v10 = "else";
    Object v11 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v10));
    ((com.google.javascript.rhino.Node)v7).addChildAfter(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v11));
    Object v12 = null;
    Object v13 = "else";
    Object v14 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v13));
    Object v15 = "else";
    Object v16 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v15));
    Object v17 = "else";
    Object v18 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v17));
    Object v19 = ((com.google.javascript.rhino.Node)v18).children();
    ((com.google.javascript.jscomp.FoldConstants)v1).tryFoldGetProp(((com.google.javascript.jscomp.NodeTraversal)v5),((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.Node)v16),((com.google.javascript.rhino.Node)v18));
    Object v20 = null;
    org.junit.Assert.assertNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = "else";
    Object v7 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v6));
    Object v8 = "else";
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8));
    Object v10 = -17;
    ((com.google.javascript.rhino.Node)v9).setCharno((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    Object v12 = "else";
    Object v13 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v12));
    Object v14 = "else";
    Object v15 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v14));
    ((com.google.javascript.jscomp.FoldConstants)v1).tryFoldComparison(((com.google.javascript.jscomp.NodeTraversal)v5),((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = "else";
    Object v7 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v6));
    Object v8 = "else";
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8));
    ((com.google.javascript.jscomp.FoldConstants)v1).tryFoldDo(((com.google.javascript.jscomp.NodeTraversal)v5),((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = "else";
    Object v7 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v6));
    Object v8 = "else";
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8));
    Object v10 = "else";
    Object v11 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v10));
    ((com.google.javascript.rhino.Node)v9).copyInformationFromForTree(((com.google.javascript.rhino.Node)v11));
    Object v12 = null;
    ((com.google.javascript.jscomp.FoldConstants)v1).tryFoldDo(((com.google.javascript.jscomp.NodeTraversal)v5),((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = "else";
    Object v7 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v6));
    Object v8 = "else";
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8));
    Object v10 = "else";
    Object v11 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v10));
    Object v12 = "else";
    Object v13 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v12));
    Object v14 = ((com.google.javascript.rhino.Node)v13).cloneNode();
    ((com.google.javascript.jscomp.FoldConstants)v1).tryFoldStringIndexOf(((com.google.javascript.jscomp.NodeTraversal)v5),((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v13));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = "else";
    Object v7 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v6));
    Object v8 = "else";
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8));
    Object v10 = "else";
    Object v11 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v10));
    Object v12 = "else";
    Object v13 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v12));
    Object v14 = ((com.google.javascript.rhino.Node)v13).siblings();
    ((com.google.javascript.jscomp.FoldConstants)v1).tryFoldGetElem(((com.google.javascript.jscomp.NodeTraversal)v5),((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v13));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getCodingConvention();
    Object v2 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v0));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getCodingConvention();
    Object v2 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5));
    Object v7 = "else";
    Object v8 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v7));
    Object v9 = "else";
    Object v10 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v9));
    ((com.google.javascript.jscomp.FoldConstants)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v6),((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.Compiler();
    Object v14 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v13));
    Object v15 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v12),((com.google.javascript.jscomp.NodeTraversal.Callback)v14));
    Object v16 = "else";
    Object v17 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v16));
    Object v18 = "else";
    Object v19 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v18));
    Object v20 = ((com.google.javascript.jscomp.FoldConstants)v2).tryFoldHookIf(((com.google.javascript.jscomp.NodeTraversal)v15),((com.google.javascript.rhino.Node)v17),((com.google.javascript.rhino.Node)v19));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = "else";
    Object v7 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v6));
    Object v8 = "else";
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8));
    ((com.google.javascript.jscomp.FoldConstants)v1).visit(((com.google.javascript.jscomp.NodeTraversal)v5),((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Compiler();
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v11),((com.google.javascript.jscomp.NodeTraversal.Callback)v13));
    Object v15 = "else";
    Object v16 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v15));
    Object v17 = "else";
    Object v18 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v17));
    Object v19 = "NULL_V";
    Object v20 = 5;
    ((com.google.javascript.jscomp.FoldConstants)v1).tryFoldLiteralConstructor(((com.google.javascript.jscomp.NodeTraversal)v14),((com.google.javascript.rhino.Node)v16),((com.google.javascript.rhino.Node)v18),((java.lang.String)v19),(((java.lang.Integer)v20).intValue()));
    Object v21 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getCodingConvention();
    Object v2 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5));
    Object v7 = "else";
    Object v8 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v7));
    Object v9 = "else";
    Object v10 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v9));
    Object v11 = "else";
    Object v12 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v11));
    Object v13 = "else";
    Object v14 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v13));
    ((com.google.javascript.jscomp.FoldConstants)v2).tryFoldGetProp(((com.google.javascript.jscomp.NodeTraversal)v6),((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v14));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getCodingConvention();
    Object v2 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5));
    Object v7 = "else";
    Object v8 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v7));
    Object v9 = "else";
    Object v10 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v9));
    ((com.google.javascript.jscomp.FoldConstants)v2).tryMinimizeIf(((com.google.javascript.jscomp.NodeTraversal)v6),((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getCodingConvention();
    Object v2 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5));
    Object v7 = "else";
    Object v8 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v7));
    Object v9 = "else";
    Object v10 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v9));
    ((com.google.javascript.rhino.Node)v8).addChildrenToFront(((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
    Object v12 = "else";
    Object v13 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v12));
    Object v14 = "else";
    Object v15 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v14));
    Object v16 = ((com.google.javascript.rhino.Node)v13).checkTreeEquals(((com.google.javascript.rhino.Node)v15));
    Object v17 = "else";
    Object v18 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v17));
    Object v19 = "else";
    Object v20 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v19));
    Object v21 = "else";
    Object v22 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v21));
    Object v23 = "else";
    Object v24 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v23));
    ((com.google.javascript.rhino.Node)v20).addChildAfter(((com.google.javascript.rhino.Node)v22),((com.google.javascript.rhino.Node)v24));
    Object v25 = null;
    ((com.google.javascript.jscomp.FoldConstants)v2).tryFoldStringJoin(((com.google.javascript.jscomp.NodeTraversal)v6),((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v18),((com.google.javascript.rhino.Node)v20));
    Object v26 = null;
    org.junit.Assert.assertNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = ((com.google.javascript.jscomp.NodeTraversal)v5).getScope();
    Object v7 = "else";
    Object v8 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v7));
    Object v9 = "else";
    Object v10 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v9));
    ((com.google.javascript.jscomp.FoldConstants)v1).tryMinimizeIf(((com.google.javascript.jscomp.NodeTraversal)v5),((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getCodingConvention();
    Object v2 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5));
    Object v7 = "else";
    Object v8 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v7));
    Object v9 = "else";
    Object v10 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v9));
    Object v11 = "else";
    Object v12 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v11));
    Object v13 = "else";
    Object v14 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v13));
    ((com.google.javascript.jscomp.FoldConstants)v2).tryFoldShift(((com.google.javascript.jscomp.NodeTraversal)v6),((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v14));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getCodingConvention();
    Object v2 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5));
    Object v7 = "else";
    Object v8 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v7));
    Object v9 = "else";
    Object v10 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v9));
    Object v11 = ((com.google.javascript.jscomp.FoldConstants)v2).tryFoldHookIf(((com.google.javascript.jscomp.NodeTraversal)v6),((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v10));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getCodingConvention();
    Object v2 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5));
    Object v7 = "else";
    Object v8 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v7));
    Object v9 = "else";
    Object v10 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v9));
    ((com.google.javascript.jscomp.FoldConstants)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v6),((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.Compiler();
    Object v14 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v13));
    Object v15 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v12),((com.google.javascript.jscomp.NodeTraversal.Callback)v14));
    Object v16 = "else";
    Object v17 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v16));
    Object v18 = "ERR_OR";
    Object v19 = "qif";
    Object v20 = com.google.javascript.jscomp.DiagnosticType.warning(((java.lang.String)v18),((java.lang.String)v19));
    Object v21 = new java.lang.String[]{"]","4"};
    ((com.google.javascript.jscomp.NodeTraversal)v15).report(((com.google.javascript.rhino.Node)v17),((com.google.javascript.jscomp.DiagnosticType)v20),((java.lang.String[])v21));
    Object v22 = null;
    Object v23 = "else";
    Object v24 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v23));
    Object v25 = "else";
    Object v26 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v25));
    ((com.google.javascript.jscomp.FoldConstants)v2).tryFoldFor(((com.google.javascript.jscomp.NodeTraversal)v15),((com.google.javascript.rhino.Node)v24),((com.google.javascript.rhino.Node)v26));
    Object v27 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getCodingConvention();
    Object v2 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5));
    Object v7 = "else";
    Object v8 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v7));
    Object v9 = 24;
    Object v10 = false;
    ((com.google.javascript.rhino.Node)v8).putBooleanProp((((java.lang.Integer)v9).intValue()),(((java.lang.Boolean)v10).booleanValue()));
    Object v11 = null;
    Object v12 = "else";
    Object v13 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v12));
    Object v14 = "else";
    Object v15 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v14));
    Object v16 = "else";
    Object v17 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v16));
    Object v18 = "else";
    Object v19 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v18));
    ((com.google.javascript.rhino.Node)v17).addChildrenToBack(((com.google.javascript.rhino.Node)v19));
    Object v20 = null;
    ((com.google.javascript.jscomp.FoldConstants)v2).tryFoldLeftChildAdd(((com.google.javascript.jscomp.NodeTraversal)v6),((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v15),((com.google.javascript.rhino.Node)v17));
    Object v21 = null;
    org.junit.Assert.assertNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = "else";
    Object v7 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v6));
    Object v8 = "else";
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8));
    ((com.google.javascript.jscomp.FoldConstants)v1).visit(((com.google.javascript.jscomp.NodeTraversal)v5),((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Compiler();
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v14 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v11),((com.google.javascript.jscomp.NodeTraversal.Callback)v13));
    Object v15 = "else";
    Object v16 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v15));
    Object v17 = "else";
    Object v18 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v17));
    Object v19 = "else";
    Object v20 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v19));
    Object v21 = "else";
    Object v22 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v21));
    ((com.google.javascript.jscomp.FoldConstants)v1).tryFoldComparison(((com.google.javascript.jscomp.NodeTraversal)v14),((com.google.javascript.rhino.Node)v16),((com.google.javascript.rhino.Node)v18),((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.Node)v22));
    Object v23 = null;
    org.junit.Assert.assertNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getCodingConvention();
    Object v2 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5));
    Object v7 = "else";
    Object v8 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v7));
    Object v9 = "else";
    Object v10 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v9));
    Object v11 = "else";
    Object v12 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v11));
    Object v13 = "else";
    Object v14 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v13));
    ((com.google.javascript.rhino.Node)v12).addChildToBack(((com.google.javascript.rhino.Node)v14));
    Object v15 = null;
    Object v16 = "else";
    Object v17 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v16));
    ((com.google.javascript.jscomp.FoldConstants)v2).tryFoldAndOr(((com.google.javascript.jscomp.NodeTraversal)v6),((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v17));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getCodingConvention();
    Object v2 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5));
    Object v7 = "else";
    Object v8 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v7));
    Object v9 = "else";
    Object v10 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v9));
    Object v11 = new com.google.javascript.rhino.JSDocInfo();
    ((com.google.javascript.rhino.Node)v10).setJSDocInfo(((com.google.javascript.rhino.JSDocInfo)v11));
    Object v12 = null;
    Object v13 = "else";
    Object v14 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v13));
    Object v15 = 1;
    Object v16 = "throw";
    Object v17 = com.google.javascript.jscomp.FoldConstants.containsUnicodeEscape(((java.lang.String)v16));
    ((com.google.javascript.rhino.Node)v14).putProp((((java.lang.Integer)v15).intValue()),((java.lang.Object)v17));
    Object v18 = null;
    Object v19 = "else";
    Object v20 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v19));
    ((com.google.javascript.jscomp.FoldConstants)v2).tryFoldComparison(((com.google.javascript.jscomp.NodeTraversal)v6),((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.Node)v20));
    Object v21 = null;
    org.junit.Assert.assertNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getCodingConvention();
    Object v2 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5));
    Object v7 = "else";
    Object v8 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v7));
    Object v9 = "else";
    Object v10 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v9));
    ((com.google.javascript.jscomp.FoldConstants)v2).tryMinimizeCondition(((com.google.javascript.jscomp.NodeTraversal)v6),((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getCodingConvention();
    Object v2 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5));
    Object v7 = "else";
    Object v8 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v7));
    Object v9 = "else";
    Object v10 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v9));
    ((com.google.javascript.jscomp.FoldConstants)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v6),((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.Compiler();
    Object v14 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v13));
    Object v15 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v12),((com.google.javascript.jscomp.NodeTraversal.Callback)v14));
    Object v16 = "else";
    Object v17 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v16));
    Object v18 = "else";
    Object v19 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v18));
    Object v20 = "else";
    Object v21 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v20));
    Object v22 = "else";
    Object v23 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v22));
    ((com.google.javascript.jscomp.FoldConstants)v2).tryFoldStringIndexOf(((com.google.javascript.jscomp.NodeTraversal)v15),((com.google.javascript.rhino.Node)v17),((com.google.javascript.rhino.Node)v19),((com.google.javascript.rhino.Node)v21),((com.google.javascript.rhino.Node)v23));
    Object v24 = null;
    org.junit.Assert.assertNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getCodingConvention();
    Object v2 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5));
    Object v7 = ((com.google.javascript.jscomp.NodeTraversal)v6).hasScope();
    Object v8 = "else";
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8));
    Object v10 = "else";
    Object v11 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v10));
    Object v12 = "else";
    Object v13 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v12));
    Object v14 = "else";
    Object v15 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v14));
    Object v16 = ((com.google.javascript.rhino.Node)v13).checkTreeEqualsSilent(((com.google.javascript.rhino.Node)v15));
    Object v17 = "else";
    Object v18 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v17));
    ((com.google.javascript.jscomp.FoldConstants)v2).tryFoldArithmetic(((com.google.javascript.jscomp.NodeTraversal)v6),((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v18));
    Object v19 = null;
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getCodingConvention();
    Object v2 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5));
    Object v7 = new com.google.javascript.rhino.Node[]{};
    ((com.google.javascript.jscomp.NodeTraversal)v6).traverseRoots(((com.google.javascript.rhino.Node[])v7));
    Object v8 = null;
    Object v9 = "else";
    Object v10 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v9));
    Object v11 = "else";
    Object v12 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v11));
    Object v13 = 52;
    Object v14 = ((com.google.javascript.rhino.Node)v12).getAncestor((((java.lang.Integer)v13).intValue()));
    Object v15 = ((com.google.javascript.jscomp.FoldConstants)v2).tryFoldHookIf(((com.google.javascript.jscomp.NodeTraversal)v6),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v12));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getCodingConvention();
    Object v2 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5));
    Object v7 = "else";
    Object v8 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v7));
    Object v9 = "else";
    Object v10 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v9));
    ((com.google.javascript.rhino.Node)v8).copyInformationFromForTree(((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
    Object v12 = "else";
    Object v13 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v12));
    Object v14 = "else";
    Object v15 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v14));
    Object v16 = "else";
    Object v17 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v16));
    ((com.google.javascript.jscomp.FoldConstants)v2).tryFoldGetProp(((com.google.javascript.jscomp.NodeTraversal)v6),((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v15),((com.google.javascript.rhino.Node)v17));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getCodingConvention();
    Object v2 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5));
    Object v7 = "else";
    Object v8 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v7));
    Object v9 = "else";
    Object v10 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v9));
    ((com.google.javascript.rhino.Node)v8).addChildrenToFront(((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
    Object v12 = "else";
    Object v13 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v12));
    Object v14 = "else";
    Object v15 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v14));
    Object v16 = "else";
    Object v17 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v16));
    ((com.google.javascript.jscomp.FoldConstants)v2).tryFoldAndOr(((com.google.javascript.jscomp.NodeTraversal)v6),((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v15),((com.google.javascript.rhino.Node)v17));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getCodingConvention();
    Object v2 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5));
    Object v7 = "else";
    Object v8 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v7));
    Object v9 = "else";
    Object v10 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v9));
    ((com.google.javascript.jscomp.FoldConstants)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v6),((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.Compiler();
    Object v14 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v13));
    Object v15 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v12),((com.google.javascript.jscomp.NodeTraversal.Callback)v14));
    Object v16 = "else";
    Object v17 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v16));
    Object v18 = "else";
    Object v19 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v18));
    Object v20 = ((com.google.javascript.rhino.Node)v17).checkTreeTypeAwareEqualsSilent(((com.google.javascript.rhino.Node)v19));
    Object v21 = "else";
    Object v22 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v21));
    Object v23 = "else";
    Object v24 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v23));
    ((com.google.javascript.rhino.Node)v22).copyInformationFromForTree(((com.google.javascript.rhino.Node)v24));
    Object v25 = null;
    Object v26 = "else";
    Object v27 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v26));
    Object v28 = "else";
    Object v29 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v28));
    ((com.google.javascript.jscomp.FoldConstants)v2).tryFoldLeftChildAdd(((com.google.javascript.jscomp.NodeTraversal)v15),((com.google.javascript.rhino.Node)v17),((com.google.javascript.rhino.Node)v22),((com.google.javascript.rhino.Node)v27),((com.google.javascript.rhino.Node)v29));
    Object v30 = null;
    org.junit.Assert.assertNull(v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getCodingConvention();
    Object v2 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5));
    Object v7 = "else";
    Object v8 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v7));
    Object v9 = "else";
    Object v10 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v9));
    ((com.google.javascript.jscomp.FoldConstants)v2).tryFoldDo(((com.google.javascript.jscomp.NodeTraversal)v6),((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getCodingConvention();
    Object v2 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5));
    Object v7 = "else";
    Object v8 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v7));
    Object v9 = "else";
    Object v10 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v9));
    ((com.google.javascript.jscomp.FoldConstants)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v6),((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
    Object v12 = new com.google.javascript.jscomp.Compiler();
    Object v13 = new com.google.javascript.jscomp.Compiler();
    Object v14 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v13));
    Object v15 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v12),((com.google.javascript.jscomp.NodeTraversal.Callback)v14));
    Object v16 = "else";
    Object v17 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v16));
    Object v18 = "else";
    Object v19 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v18));
    ((com.google.javascript.jscomp.FoldConstants)v2).tryFoldFor(((com.google.javascript.jscomp.NodeTraversal)v15),((com.google.javascript.rhino.Node)v17),((com.google.javascript.rhino.Node)v19));
    Object v20 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getCodingConvention();
    Object v2 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5));
    Object v7 = "else";
    Object v8 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v7));
    Object v9 = ((com.google.javascript.rhino.Node)v8).getJsDocBuilderForNode();
    Object v10 = "else";
    Object v11 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v10));
    Object v12 = "else";
    Object v13 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v12));
    Object v14 = ((com.google.javascript.rhino.Node)v11).checkTreeTypeAwareEqualsSilent(((com.google.javascript.rhino.Node)v13));
    Object v15 = "else";
    Object v16 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v15));
    Object v17 = "else";
    Object v18 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v17));
    ((com.google.javascript.jscomp.FoldConstants)v2).tryFoldBitAndOr(((com.google.javascript.jscomp.NodeTraversal)v6),((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v16),((com.google.javascript.rhino.Node)v18));
    Object v19 = null;
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = "p7rototype";
    Object v1 = com.google.javascript.jscomp.FoldConstants.containsUnicodeEscape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = "else";
    Object v7 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v6));
    Object v8 = "else";
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8));
    Object v10 = "else";
    Object v11 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v10));
    Object v12 = new com.google.javascript.rhino.JSDocInfo();
    ((com.google.javascript.rhino.Node)v11).setJSDocInfo(((com.google.javascript.rhino.JSDocInfo)v12));
    Object v13 = null;
    Object v14 = "else";
    Object v15 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v14));
    ((com.google.javascript.jscomp.FoldConstants)v1).tryFoldComparison(((com.google.javascript.jscomp.NodeTraversal)v5),((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getCodingConvention();
    Object v2 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5));
    Object v7 = "else";
    Object v8 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v7));
    Object v9 = "else";
    Object v10 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v9));
    ((com.google.javascript.jscomp.FoldConstants)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v6),((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.FoldConstants(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = "else";
    Object v7 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v6));
    Object v8 = ((com.google.javascript.rhino.Node)v7).hasSideEffects();
    Object v9 = "else";
    Object v10 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v9));
    Object v11 = ((com.google.javascript.rhino.Node)v10).getJsDocBuilderForNode();
    ((com.google.javascript.jscomp.FoldConstants)v1).visit(((com.google.javascript.jscomp.NodeTraversal)v5),((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v10));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }
}
