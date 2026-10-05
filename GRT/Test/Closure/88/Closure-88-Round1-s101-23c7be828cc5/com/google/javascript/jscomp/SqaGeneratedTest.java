package com.google.javascript.jscomp;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = 40;
    Object v7 = new java.util.ArrayList((((java.lang.Integer)v6).intValue()));
    ((com.google.javascript.jscomp.NodeTraversal)v5).traverseRoots(((java.util.List)v7));
    Object v8 = null;
    ((com.google.javascript.jscomp.DeadAssignmentsElimination)v1).enterScope(((com.google.javascript.jscomp.NodeTraversal)v5));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    ((com.google.javascript.jscomp.DeadAssignmentsElimination)v1).enterScope(((com.google.javascript.jscomp.NodeTraversal)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = "";
    Object v3 = "_";
    Object v4 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = "";
    Object v6 = "_";
    Object v7 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v5),((java.lang.String)v6));
    ((com.google.javascript.jscomp.DeadAssignmentsElimination)v1).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = "";
    Object v7 = "_";
    Object v8 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = "";
    Object v10 = "_";
    Object v11 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = ((com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback)v1).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v5),((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v11));
    org.junit.Assert.assertEquals((Object)(true), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = ((com.google.javascript.jscomp.NodeTraversal)v5).getEnclosingFunction();
    Object v7 = "";
    Object v8 = "_";
    Object v9 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = "";
    Object v11 = "_";
    Object v12 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v10),((java.lang.String)v11));
    ((com.google.javascript.jscomp.DeadAssignmentsElimination)v1).visit(((com.google.javascript.jscomp.NodeTraversal)v5),((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    ((com.google.javascript.jscomp.DeadAssignmentsElimination)v1).exitScope(((com.google.javascript.jscomp.NodeTraversal)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = "";
    Object v7 = "_";
    Object v8 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v10 = "";
    Object v11 = "Message initialized -sing unrecognized function. Please use goog.getMsg() instead.";
    Object v12 = com.google.javascript.jscomp.DiagnosticType.warning(((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = new java.lang.String[]{""};
    Object v14 = ((com.google.javascript.jscomp.NodeTraversal)v5).makeError(((com.google.javascript.rhino.Node)v8),((com.google.javascript.jscomp.CheckLevel)v9),((com.google.javascript.jscomp.DiagnosticType)v12),((java.lang.String[])v13));
    ((com.google.javascript.jscomp.DeadAssignmentsElimination)v1).enterScope(((com.google.javascript.jscomp.NodeTraversal)v5));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = ((com.google.javascript.jscomp.NodeTraversal)v5).getEnclosingFunction();
    ((com.google.javascript.jscomp.DeadAssignmentsElimination)v1).enterScope(((com.google.javascript.jscomp.NodeTraversal)v5));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = "";
    Object v7 = "_";
    Object v8 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = "";
    Object v10 = "Message initialized -sing unrecognized function. Please use goog.getMsg() instead.";
    Object v11 = com.google.javascript.jscomp.DiagnosticType.warning(((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = new java.lang.String[]{", ","function"};
    Object v13 = ((com.google.javascript.jscomp.NodeTraversal)v5).makeError(((com.google.javascript.rhino.Node)v8),((com.google.javascript.jscomp.DiagnosticType)v11),((java.lang.String[])v12));
    ((com.google.javascript.jscomp.DeadAssignmentsElimination)v1).enterScope(((com.google.javascript.jscomp.NodeTraversal)v5));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = "";
    Object v7 = "_";
    Object v8 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = "";
    Object v10 = "_";
    Object v11 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v9),((java.lang.String)v10));
    ((com.google.javascript.jscomp.DeadAssignmentsElimination)v1).visit(((com.google.javascript.jscomp.NodeTraversal)v5),((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = "";
    Object v7 = "_";
    Object v8 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = "";
    Object v10 = "_";
    Object v11 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v9),((java.lang.String)v10));
    ((com.google.javascript.jscomp.NodeTraversal.Callback)v1).visit(((com.google.javascript.jscomp.NodeTraversal)v5),((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v11));
    Object v12 = null;
    Object v13 = new com.google.javascript.jscomp.Compiler();
    Object v14 = new com.google.javascript.jscomp.Compiler();
    Object v15 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v14));
    Object v16 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v13),((com.google.javascript.jscomp.NodeTraversal.Callback)v15));
    Object v17 = "";
    Object v18 = "_";
    Object v19 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v17),((java.lang.String)v18));
    Object v20 = "";
    Object v21 = "_";
    Object v22 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v20),((java.lang.String)v21));
    Object v23 = ((com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback)v1).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v16),((com.google.javascript.rhino.Node)v19),((com.google.javascript.rhino.Node)v22));
    org.junit.Assert.assertEquals((Object)(true), v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = "";
    Object v7 = "_";
    Object v8 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = "";
    Object v10 = "Message initialized -sing unrecognized function. Please use goog.getMsg() instead.";
    Object v11 = com.google.javascript.jscomp.DiagnosticType.warning(((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = new java.lang.String[]{"","",""};
    Object v13 = ((com.google.javascript.jscomp.NodeTraversal)v5).makeError(((com.google.javascript.rhino.Node)v8),((com.google.javascript.jscomp.DiagnosticType)v11),((java.lang.String[])v12));
    ((com.google.javascript.jscomp.DeadAssignmentsElimination)v1).enterScope(((com.google.javascript.jscomp.NodeTraversal)v5));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = ((com.google.javascript.jscomp.NodeTraversal)v5).hasScope();
    ((com.google.javascript.jscomp.DeadAssignmentsElimination)v1).enterScope(((com.google.javascript.jscomp.NodeTraversal)v5));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = "";
    Object v3 = "_";
    Object v4 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = 1;
    Object v6 = true;
    ((com.google.javascript.rhino.Node)v4).putBooleanProp((((java.lang.Integer)v5).intValue()),(((java.lang.Boolean)v6).booleanValue()));
    Object v7 = null;
    Object v8 = "";
    Object v9 = "_";
    Object v10 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v8),((java.lang.String)v9));
    ((com.google.javascript.jscomp.DeadAssignmentsElimination)v1).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = ((com.google.javascript.jscomp.NodeTraversal)v5).getScope();
    ((com.google.javascript.jscomp.DeadAssignmentsElimination)v1).exitScope(((com.google.javascript.jscomp.NodeTraversal)v5));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = ((com.google.javascript.jscomp.NodeTraversal)v5).hasScope();
    ((com.google.javascript.jscomp.DeadAssignmentsElimination)v1).exitScope(((com.google.javascript.jscomp.NodeTraversal)v5));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = "";
    Object v3 = "_";
    Object v4 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = 36;
    ((com.google.javascript.rhino.Node)v4).setType((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    Object v7 = "";
    Object v8 = "_";
    Object v9 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v7),((java.lang.String)v8));
    ((com.google.javascript.jscomp.DeadAssignmentsElimination)v1).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v0));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = "";
    Object v4 = "_";
    Object v5 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = "";
    Object v7 = "_";
    Object v8 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v6),((java.lang.String)v7));
    ((com.google.javascript.jscomp.DeadAssignmentsElimination)v2).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
    Object v10 = new com.google.javascript.jscomp.Compiler();
    Object v11 = new com.google.javascript.jscomp.Compiler();
    Object v12 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v11));
    Object v13 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.NodeTraversal.Callback)v12));
    ((com.google.javascript.jscomp.DeadAssignmentsElimination)v2).enterScope(((com.google.javascript.jscomp.NodeTraversal)v13));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5));
    Object v7 = ((com.google.javascript.jscomp.NodeTraversal)v6).getEnclosingFunction();
    ((com.google.javascript.jscomp.DeadAssignmentsElimination)v2).enterScope(((com.google.javascript.jscomp.NodeTraversal)v6));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5));
    ((com.google.javascript.jscomp.DeadAssignmentsElimination)v2).enterScope(((com.google.javascript.jscomp.NodeTraversal)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5));
    Object v7 = "";
    Object v8 = "_";
    Object v9 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = "";
    Object v11 = "_";
    Object v12 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v10),((java.lang.String)v11));
    ((com.google.javascript.jscomp.NodeTraversal.Callback)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v6),((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
    Object v14 = new com.google.javascript.jscomp.Compiler();
    Object v15 = new com.google.javascript.jscomp.Compiler();
    Object v16 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v15));
    Object v17 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.NodeTraversal.Callback)v16));
    Object v18 = "";
    Object v19 = "_";
    Object v20 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v18),((java.lang.String)v19));
    Object v21 = "";
    Object v22 = "_";
    Object v23 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v21),((java.lang.String)v22));
    Object v24 = ((com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback)v2).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v17),((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.Node)v23));
    org.junit.Assert.assertEquals((Object)(true), v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = "";
    Object v7 = "_";
    Object v8 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = ((com.google.javascript.rhino.Node)v8).cloneNode();
    Object v10 = "";
    Object v11 = "_";
    Object v12 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = false;
    ((com.google.javascript.rhino.Node)v12).setIsSyntheticBlock((((java.lang.Boolean)v13).booleanValue()));
    Object v14 = null;
    ((com.google.javascript.jscomp.DeadAssignmentsElimination)v1).visit(((com.google.javascript.jscomp.NodeTraversal)v5),((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v12));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5));
    Object v7 = "";
    Object v8 = "_";
    Object v9 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v11 = "";
    Object v12 = "Message initialized -sing unrecognized function. Please use goog.getMsg() instead.";
    Object v13 = com.google.javascript.jscomp.DiagnosticType.warning(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = new java.lang.String[]{"_"};
    Object v15 = ((com.google.javascript.jscomp.NodeTraversal)v6).makeError(((com.google.javascript.rhino.Node)v9),((com.google.javascript.jscomp.CheckLevel)v10),((com.google.javascript.jscomp.DiagnosticType)v13),((java.lang.String[])v14));
    ((com.google.javascript.jscomp.DeadAssignmentsElimination)v2).enterScope(((com.google.javascript.jscomp.NodeTraversal)v6));
    Object v16 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = "";
    Object v4 = "_";
    Object v5 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = "";
    Object v7 = "_";
    Object v8 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v6),((java.lang.String)v7));
    ((com.google.javascript.jscomp.DeadAssignmentsElimination)v2).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
    Object v10 = new com.google.javascript.jscomp.Compiler();
    Object v11 = new com.google.javascript.jscomp.Compiler();
    Object v12 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v11));
    Object v13 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.NodeTraversal.Callback)v12));
    ((com.google.javascript.jscomp.DeadAssignmentsElimination)v2).exitScope(((com.google.javascript.jscomp.NodeTraversal)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5));
    Object v7 = 40;
    Object v8 = new java.util.ArrayList((((java.lang.Integer)v7).intValue()));
    ((com.google.javascript.jscomp.NodeTraversal)v6).traverseRoots(((java.util.List)v8));
    Object v9 = null;
    ((com.google.javascript.jscomp.DeadAssignmentsElimination)v2).enterScope(((com.google.javascript.jscomp.NodeTraversal)v6));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = "";
    Object v4 = "_";
    Object v5 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = "";
    Object v7 = "_";
    Object v8 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v6),((java.lang.String)v7));
    ((com.google.javascript.jscomp.DeadAssignmentsElimination)v2).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
    Object v10 = new com.google.javascript.jscomp.Compiler();
    Object v11 = new com.google.javascript.jscomp.Compiler();
    Object v12 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v11));
    Object v13 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.NodeTraversal.Callback)v12));
    Object v14 = 40;
    Object v15 = new java.util.ArrayList((((java.lang.Integer)v14).intValue()));
    ((com.google.javascript.jscomp.NodeTraversal)v13).traverseRoots(((java.util.List)v15));
    Object v16 = null;
    ((com.google.javascript.jscomp.DeadAssignmentsElimination)v2).enterScope(((com.google.javascript.jscomp.NodeTraversal)v13));
    Object v17 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5));
    Object v7 = "";
    Object v8 = "_";
    Object v9 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v11 = "";
    Object v12 = "Message initialized -sing unrecognized function. Please use goog.getMsg() instead.";
    Object v13 = com.google.javascript.jscomp.DiagnosticType.warning(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = new java.lang.String[]{"arguments"};
    Object v15 = ((com.google.javascript.jscomp.NodeTraversal)v6).makeError(((com.google.javascript.rhino.Node)v9),((com.google.javascript.jscomp.CheckLevel)v10),((com.google.javascript.jscomp.DiagnosticType)v13),((java.lang.String[])v14));
    ((com.google.javascript.jscomp.DeadAssignmentsElimination)v2).enterScope(((com.google.javascript.jscomp.NodeTraversal)v6));
    Object v16 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5));
    Object v7 = ((com.google.javascript.jscomp.NodeTraversal)v6).hasScope();
    ((com.google.javascript.jscomp.DeadAssignmentsElimination)v2).enterScope(((com.google.javascript.jscomp.NodeTraversal)v6));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = "";
    Object v3 = "_";
    Object v4 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = "";
    Object v6 = "_";
    Object v7 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = ((com.google.javascript.rhino.Node)v7).removeChildren();
    ((com.google.javascript.jscomp.DeadAssignmentsElimination)v1).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v7));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5));
    ((com.google.javascript.jscomp.DeadAssignmentsElimination)v2).exitScope(((com.google.javascript.jscomp.NodeTraversal)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v0));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5));
    Object v7 = "";
    Object v8 = "_";
    Object v9 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v11 = "";
    Object v12 = "Message initialized -sing unrecognized function. Please use goog.getMsg() instead.";
    Object v13 = com.google.javascript.jscomp.DiagnosticType.warning(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = new java.lang.String[]{""};
    Object v15 = ((com.google.javascript.jscomp.NodeTraversal)v6).makeError(((com.google.javascript.rhino.Node)v9),((com.google.javascript.jscomp.CheckLevel)v10),((com.google.javascript.jscomp.DiagnosticType)v13),((java.lang.String[])v14));
    ((com.google.javascript.jscomp.DeadAssignmentsElimination)v2).enterScope(((com.google.javascript.jscomp.NodeTraversal)v6));
    Object v16 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = "";
    Object v3 = "_";
    Object v4 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = ((com.google.javascript.rhino.Node)v4).getQualifiedName();
    Object v6 = "";
    Object v7 = "_";
    Object v8 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v6),((java.lang.String)v7));
    ((com.google.javascript.jscomp.DeadAssignmentsElimination)v1).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5));
    ((com.google.javascript.jscomp.DeadAssignmentsElimination)v2).enterScope(((com.google.javascript.jscomp.NodeTraversal)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5));
    ((com.google.javascript.jscomp.DeadAssignmentsElimination)v2).exitScope(((com.google.javascript.jscomp.NodeTraversal)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5));
    Object v7 = "";
    Object v8 = "_";
    Object v9 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = "";
    Object v11 = "_";
    Object v12 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v10),((java.lang.String)v11));
    ((com.google.javascript.jscomp.DeadAssignmentsElimination)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v6),((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5));
    Object v7 = "";
    Object v8 = "_";
    Object v9 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = "";
    Object v11 = "_";
    Object v12 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = ((com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback)v2).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v6),((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v12));
    org.junit.Assert.assertEquals((Object)(true), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5));
    Object v7 = "";
    Object v8 = "_";
    Object v9 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = "";
    Object v11 = "_";
    Object v12 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v10),((java.lang.String)v11));
    ((com.google.javascript.jscomp.DeadAssignmentsElimination)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v6),((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = "";
    Object v7 = "_";
    Object v8 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = true;
    ((com.google.javascript.rhino.Node)v8).setWasEmptyNode((((java.lang.Boolean)v9).booleanValue()));
    Object v10 = null;
    Object v11 = "";
    Object v12 = "_";
    Object v13 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = "";
    Object v15 = "_";
    Object v16 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v14),((java.lang.String)v15));
    Object v17 = ((com.google.javascript.rhino.Node)v13).copyInformationFromForTree(((com.google.javascript.rhino.Node)v16));
    Object v18 = ((com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback)v1).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v5),((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v13));
    org.junit.Assert.assertEquals((Object)(true), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5));
    Object v7 = "";
    Object v8 = "_";
    Object v9 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = "";
    Object v11 = "_";
    Object v12 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = ((com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback)v2).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v6),((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v12));
    org.junit.Assert.assertEquals((Object)(true), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5));
    Object v7 = "";
    Object v8 = "_";
    Object v9 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = "";
    Object v11 = "Message initialized -sing unrecognized function. Please use goog.getMsg() instead.";
    Object v12 = com.google.javascript.jscomp.DiagnosticType.warning(((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = new java.lang.String[]{};
    Object v14 = ((com.google.javascript.jscomp.NodeTraversal)v6).makeError(((com.google.javascript.rhino.Node)v9),((com.google.javascript.jscomp.DiagnosticType)v12),((java.lang.String[])v13));
    ((com.google.javascript.jscomp.DeadAssignmentsElimination)v2).enterScope(((com.google.javascript.jscomp.NodeTraversal)v6));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5));
    Object v7 = new com.google.javascript.rhino.Node[]{};
    ((com.google.javascript.jscomp.NodeTraversal)v6).traverseRoots(((com.google.javascript.rhino.Node[])v7));
    Object v8 = null;
    Object v9 = "";
    Object v10 = "_";
    Object v11 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = "";
    Object v13 = "_";
    Object v14 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v12),((java.lang.String)v13));
    ((com.google.javascript.jscomp.DeadAssignmentsElimination)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v6),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v14));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5));
    Object v7 = "";
    Object v8 = "_";
    Object v9 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v11 = "";
    Object v12 = "Message initialized -sing unrecognized function. Please use goog.getMsg() instead.";
    Object v13 = com.google.javascript.jscomp.DiagnosticType.warning(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = new java.lang.String[]{"\nActual  ","",""};
    Object v15 = ((com.google.javascript.jscomp.NodeTraversal)v6).makeError(((com.google.javascript.rhino.Node)v9),((com.google.javascript.jscomp.CheckLevel)v10),((com.google.javascript.jscomp.DiagnosticType)v13),((java.lang.String[])v14));
    ((com.google.javascript.jscomp.DeadAssignmentsElimination)v2).enterScope(((com.google.javascript.jscomp.NodeTraversal)v6));
    Object v16 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5));
    Object v7 = ((com.google.javascript.jscomp.NodeTraversal)v6).hasScope();
    ((com.google.javascript.jscomp.DeadAssignmentsElimination)v2).enterScope(((com.google.javascript.jscomp.NodeTraversal)v6));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5));
    Object v7 = ((com.google.javascript.jscomp.NodeTraversal)v6).getScope();
    ((com.google.javascript.jscomp.DeadAssignmentsElimination)v2).exitScope(((com.google.javascript.jscomp.NodeTraversal)v6));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5));
    Object v7 = "";
    Object v8 = "_";
    Object v9 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = "";
    Object v11 = "_";
    Object v12 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v10),((java.lang.String)v11));
    ((com.google.javascript.jscomp.NodeTraversal.Callback)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v6),((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
    Object v14 = new com.google.javascript.jscomp.Compiler();
    Object v15 = new com.google.javascript.jscomp.Compiler();
    Object v16 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v15));
    Object v17 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.NodeTraversal.Callback)v16));
    Object v18 = "";
    Object v19 = "_";
    Object v20 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v18),((java.lang.String)v19));
    Object v21 = "";
    Object v22 = "_";
    Object v23 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v21),((java.lang.String)v22));
    ((com.google.javascript.rhino.Node)v20).addChildrenToFront(((com.google.javascript.rhino.Node)v23));
    Object v24 = null;
    Object v25 = "";
    Object v26 = "_";
    Object v27 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v25),((java.lang.String)v26));
    Object v28 = ((com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback)v2).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v17),((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.Node)v27));
    org.junit.Assert.assertEquals((Object)(true), v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = "";
    Object v4 = "_";
    Object v5 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = "";
    Object v7 = "_";
    Object v8 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v6),((java.lang.String)v7));
    ((com.google.javascript.jscomp.DeadAssignmentsElimination)v2).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
    Object v10 = new com.google.javascript.jscomp.Compiler();
    Object v11 = new com.google.javascript.jscomp.Compiler();
    Object v12 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v11));
    Object v13 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.NodeTraversal.Callback)v12));
    Object v14 = ((com.google.javascript.jscomp.NodeTraversal)v13).hasScope();
    ((com.google.javascript.jscomp.DeadAssignmentsElimination)v2).enterScope(((com.google.javascript.jscomp.NodeTraversal)v13));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = "";
    Object v4 = "_";
    Object v5 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = "";
    Object v7 = "_";
    Object v8 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v6),((java.lang.String)v7));
    ((com.google.javascript.jscomp.DeadAssignmentsElimination)v2).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
    Object v10 = "";
    Object v11 = "_";
    Object v12 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = "";
    Object v14 = "_";
    Object v15 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v13),((java.lang.String)v14));
    ((com.google.javascript.jscomp.DeadAssignmentsElimination)v2).process(((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = new com.google.javascript.rhino.Node[]{};
    ((com.google.javascript.jscomp.NodeTraversal)v5).traverseRoots(((com.google.javascript.rhino.Node[])v6));
    Object v7 = null;
    ((com.google.javascript.jscomp.DeadAssignmentsElimination)v1).enterScope(((com.google.javascript.jscomp.NodeTraversal)v5));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5));
    Object v7 = "";
    Object v8 = "_";
    Object v9 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = "";
    Object v11 = "_";
    Object v12 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v10),((java.lang.String)v11));
    ((com.google.javascript.jscomp.NodeTraversal.Callback)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v6),((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
    Object v14 = new com.google.javascript.jscomp.Compiler();
    Object v15 = new com.google.javascript.jscomp.Compiler();
    Object v16 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v15));
    Object v17 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.NodeTraversal.Callback)v16));
    Object v18 = "";
    Object v19 = "_";
    Object v20 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v18),((java.lang.String)v19));
    Object v21 = "";
    Object v22 = "_";
    Object v23 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v21),((java.lang.String)v22));
    Object v24 = 50;
    ((com.google.javascript.rhino.Node)v23).removeProp((((java.lang.Integer)v24).intValue()));
    Object v25 = null;
    Object v26 = ((com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback)v2).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v17),((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.Node)v23));
    org.junit.Assert.assertEquals((Object)(true), v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = "";
    Object v4 = "_";
    Object v5 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = "";
    Object v7 = "_";
    Object v8 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v6),((java.lang.String)v7));
    ((com.google.javascript.jscomp.DeadAssignmentsElimination)v2).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5));
    Object v7 = "";
    Object v8 = "_";
    Object v9 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = ((com.google.javascript.rhino.Node)v9).isQualifiedName();
    Object v11 = "";
    Object v12 = "_";
    Object v13 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v11),((java.lang.String)v12));
    ((com.google.javascript.jscomp.DeadAssignmentsElimination)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v6),((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5));
    Object v7 = "";
    Object v8 = "_";
    Object v9 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v11 = "";
    Object v12 = "Message initialized -sing unrecognized function. Please use goog.getMsg() instead.";
    Object v13 = com.google.javascript.jscomp.DiagnosticType.warning(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = new java.lang.String[]{"while(","."};
    Object v15 = ((com.google.javascript.jscomp.NodeTraversal)v6).makeError(((com.google.javascript.rhino.Node)v9),((com.google.javascript.jscomp.CheckLevel)v10),((com.google.javascript.jscomp.DiagnosticType)v13),((java.lang.String[])v14));
    Object v16 = "";
    Object v17 = "_";
    Object v18 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v16),((java.lang.String)v17));
    Object v19 = "";
    Object v20 = "_";
    Object v21 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v19),((java.lang.String)v20));
    Object v22 = ((com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback)v2).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v6),((com.google.javascript.rhino.Node)v18),((com.google.javascript.rhino.Node)v21));
    org.junit.Assert.assertEquals((Object)(true), v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5));
    Object v7 = "";
    Object v8 = "_";
    Object v9 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = "";
    Object v11 = "_";
    Object v12 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = ((com.google.javascript.rhino.Node)v9).checkTreeEquals(((com.google.javascript.rhino.Node)v12));
    Object v14 = "";
    Object v15 = "_";
    Object v16 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v14),((java.lang.String)v15));
    ((com.google.javascript.rhino.Node)v16).detachChildren();
    Object v17 = null;
    Object v18 = ((com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback)v2).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v6),((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v16));
    org.junit.Assert.assertEquals((Object)(true), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = ((com.google.javascript.jscomp.NodeTraversal)v5).getScope();
    ((com.google.javascript.jscomp.DeadAssignmentsElimination)v1).enterScope(((com.google.javascript.jscomp.NodeTraversal)v5));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5));
    Object v7 = "";
    Object v8 = "_";
    Object v9 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = "";
    Object v11 = "Message initialized -sing unrecognized function. Please use goog.getMsg() instead.";
    Object v12 = com.google.javascript.jscomp.DiagnosticType.warning(((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = new java.lang.String[]{"Inpinity","argumnts"};
    Object v14 = ((com.google.javascript.jscomp.NodeTraversal)v6).makeError(((com.google.javascript.rhino.Node)v9),((com.google.javascript.jscomp.DiagnosticType)v12),((java.lang.String[])v13));
    ((com.google.javascript.jscomp.DeadAssignmentsElimination)v2).enterScope(((com.google.javascript.jscomp.NodeTraversal)v6));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5));
    Object v7 = "";
    Object v8 = "_";
    Object v9 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = ((com.google.javascript.rhino.Node)v9).toStringTree();
    Object v11 = "";
    Object v12 = "_";
    Object v13 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v11),((java.lang.String)v12));
    ((com.google.javascript.jscomp.DeadAssignmentsElimination)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v6),((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = "";
    Object v7 = "_";
    Object v8 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = "";
    Object v10 = "Message initialized -sing unrecognized function. Please use goog.getMsg() instead.";
    Object v11 = com.google.javascript.jscomp.DiagnosticType.warning(((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = new java.lang.String[]{"#","1"};
    Object v13 = ((com.google.javascript.jscomp.NodeTraversal)v5).makeError(((com.google.javascript.rhino.Node)v8),((com.google.javascript.jscomp.DiagnosticType)v11),((java.lang.String[])v12));
    ((com.google.javascript.jscomp.DeadAssignmentsElimination)v1).enterScope(((com.google.javascript.jscomp.NodeTraversal)v5));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5));
    Object v7 = "";
    Object v8 = "_";
    Object v9 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = "";
    Object v11 = "Message initialized -sing unrecognized function. Please use goog.getMsg() instead.";
    Object v12 = com.google.javascript.jscomp.DiagnosticType.warning(((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = new java.lang.String[]{"w","r",""};
    Object v14 = ((com.google.javascript.jscomp.NodeTraversal)v6).makeError(((com.google.javascript.rhino.Node)v9),((com.google.javascript.jscomp.DiagnosticType)v12),((java.lang.String[])v13));
    ((com.google.javascript.jscomp.DeadAssignmentsElimination)v2).enterScope(((com.google.javascript.jscomp.NodeTraversal)v6));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5));
    Object v7 = "";
    Object v8 = "_";
    Object v9 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v11 = "";
    Object v12 = "Message initialized -sing unrecognized function. Please use goog.getMsg() instead.";
    Object v13 = com.google.javascript.jscomp.DiagnosticType.warning(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = new java.lang.String[]{};
    Object v15 = ((com.google.javascript.jscomp.NodeTraversal)v6).makeError(((com.google.javascript.rhino.Node)v9),((com.google.javascript.jscomp.CheckLevel)v10),((com.google.javascript.jscomp.DiagnosticType)v13),((java.lang.String[])v14));
    ((com.google.javascript.jscomp.DeadAssignmentsElimination)v2).enterScope(((com.google.javascript.jscomp.NodeTraversal)v6));
    Object v16 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5));
    Object v7 = "";
    Object v8 = "_";
    Object v9 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v11 = "";
    Object v12 = "Message initialized -sing unrecognized function. Please use goog.getMsg() instead.";
    Object v13 = com.google.javascript.jscomp.DiagnosticType.warning(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = new java.lang.String[]{"prototye"};
    Object v15 = ((com.google.javascript.jscomp.NodeTraversal)v6).makeError(((com.google.javascript.rhino.Node)v9),((com.google.javascript.jscomp.CheckLevel)v10),((com.google.javascript.jscomp.DiagnosticType)v13),((java.lang.String[])v14));
    ((com.google.javascript.jscomp.DeadAssignmentsElimination)v2).enterScope(((com.google.javascript.jscomp.NodeTraversal)v6));
    Object v16 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = "";
    Object v4 = "_";
    Object v5 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = "";
    Object v7 = "_";
    Object v8 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v6),((java.lang.String)v7));
    ((com.google.javascript.jscomp.DeadAssignmentsElimination)v2).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5));
    Object v7 = ((com.google.javascript.jscomp.NodeTraversal)v6).getEnclosingFunction();
    ((com.google.javascript.jscomp.DeadAssignmentsElimination)v2).enterScope(((com.google.javascript.jscomp.NodeTraversal)v6));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5));
    Object v7 = ((com.google.javascript.jscomp.NodeTraversal)v6).getScope();
    ((com.google.javascript.jscomp.DeadAssignmentsElimination)v2).enterScope(((com.google.javascript.jscomp.NodeTraversal)v6));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = "";
    Object v4 = "_";
    Object v5 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = "";
    Object v7 = "_";
    Object v8 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v6),((java.lang.String)v7));
    ((com.google.javascript.jscomp.DeadAssignmentsElimination)v2).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
    Object v10 = new com.google.javascript.jscomp.Compiler();
    Object v11 = new com.google.javascript.jscomp.Compiler();
    Object v12 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v11));
    Object v13 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.NodeTraversal.Callback)v12));
    Object v14 = "";
    Object v15 = "_";
    Object v16 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v14),((java.lang.String)v15));
    Object v17 = "";
    Object v18 = "_";
    Object v19 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v17),((java.lang.String)v18));
    ((com.google.javascript.jscomp.DeadAssignmentsElimination)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v13),((com.google.javascript.rhino.Node)v16),((com.google.javascript.rhino.Node)v19));
    Object v20 = null;
    org.junit.Assert.assertNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5));
    Object v7 = "";
    Object v8 = "_";
    Object v9 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = "";
    Object v11 = "Message initialized -sing unrecognized function. Please use goog.getMsg() instead.";
    Object v12 = com.google.javascript.jscomp.DiagnosticType.warning(((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = new java.lang.String[]{"JSC_TMP_PLAoCE_HOLDER"};
    Object v14 = ((com.google.javascript.jscomp.NodeTraversal)v6).makeError(((com.google.javascript.rhino.Node)v9),((com.google.javascript.jscomp.DiagnosticType)v12),((java.lang.String[])v13));
    ((com.google.javascript.jscomp.DeadAssignmentsElimination)v2).enterScope(((com.google.javascript.jscomp.NodeTraversal)v6));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5));
    Object v7 = 40;
    Object v8 = new java.util.ArrayList((((java.lang.Integer)v7).intValue()));
    ((com.google.javascript.jscomp.NodeTraversal)v6).traverseRoots(((java.util.List)v8));
    Object v9 = null;
    ((com.google.javascript.jscomp.DeadAssignmentsElimination)v2).enterScope(((com.google.javascript.jscomp.NodeTraversal)v6));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5));
    Object v7 = "";
    Object v8 = "_";
    Object v9 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = "";
    Object v11 = "_";
    Object v12 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v10),((java.lang.String)v11));
    ((com.google.javascript.rhino.Node)v9).addChildrenToBack(((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
    Object v14 = "";
    Object v15 = "_";
    Object v16 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v14),((java.lang.String)v15));
    Object v17 = ((com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback)v2).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v6),((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v16));
    org.junit.Assert.assertEquals((Object)(true), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5));
    Object v7 = "";
    Object v8 = "_";
    Object v9 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = "";
    Object v11 = "_";
    Object v12 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v10),((java.lang.String)v11));
    ((com.google.javascript.jscomp.NodeTraversal.Callback)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v6),((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
    Object v14 = new com.google.javascript.jscomp.Compiler();
    Object v15 = new com.google.javascript.jscomp.Compiler();
    Object v16 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v15));
    Object v17 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.NodeTraversal.Callback)v16));
    Object v18 = "";
    Object v19 = "_";
    Object v20 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v18),((java.lang.String)v19));
    Object v21 = "";
    Object v22 = "_";
    Object v23 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v21),((java.lang.String)v22));
    Object v24 = "";
    Object v25 = "_";
    Object v26 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v24),((java.lang.String)v25));
    Object v27 = ((com.google.javascript.rhino.Node)v23).checkTreeEqualsSilent(((com.google.javascript.rhino.Node)v26));
    Object v28 = ((com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback)v2).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v17),((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.Node)v23));
    org.junit.Assert.assertEquals((Object)(true), v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = "";
    Object v4 = "_";
    Object v5 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = "";
    Object v7 = "_";
    Object v8 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = "P";
    ((com.google.javascript.rhino.Node)v8).addSuppression(((java.lang.String)v9));
    Object v10 = null;
    ((com.google.javascript.jscomp.DeadAssignmentsElimination)v2).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v8));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = "";
    Object v7 = "_";
    Object v8 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = "";
    Object v10 = "Message initialized -sing unrecognized function. Please use goog.getMsg() instead.";
    Object v11 = com.google.javascript.jscomp.DiagnosticType.warning(((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = new java.lang.String[]{"SET","","arguments"};
    Object v13 = ((com.google.javascript.jscomp.NodeTraversal)v5).makeError(((com.google.javascript.rhino.Node)v8),((com.google.javascript.jscomp.DiagnosticType)v11),((java.lang.String[])v12));
    Object v14 = "";
    Object v15 = "_";
    Object v16 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v14),((java.lang.String)v15));
    Object v17 = -38;
    ((com.google.javascript.rhino.Node)v16).setType((((java.lang.Integer)v17).intValue()));
    Object v18 = null;
    Object v19 = "";
    Object v20 = "_";
    Object v21 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v19),((java.lang.String)v20));
    Object v22 = ((com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback)v1).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v5),((com.google.javascript.rhino.Node)v16),((com.google.javascript.rhino.Node)v21));
    org.junit.Assert.assertEquals((Object)(true), v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5));
    Object v7 = "";
    Object v8 = "_";
    Object v9 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = "";
    Object v11 = "_";
    Object v12 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v13).reportCodeChange();
    Object v14 = null;
    Object v15 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v13));
    Object v16 = java.util.Set.of(((java.lang.Object)v15));
    ((com.google.javascript.rhino.Node)v12).setDirectives(((java.util.Set)v16));
    Object v17 = null;
    ((com.google.javascript.jscomp.DeadAssignmentsElimination)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v6),((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v12));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5));
    Object v7 = "";
    Object v8 = "_";
    Object v9 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = "";
    Object v11 = "Message initialized -sing unrecognized function. Please use goog.getMsg() instead.";
    Object v12 = com.google.javascript.jscomp.DiagnosticType.warning(((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = new java.lang.String[]{"",""};
    Object v14 = ((com.google.javascript.jscomp.NodeTraversal)v6).makeError(((com.google.javascript.rhino.Node)v9),((com.google.javascript.jscomp.DiagnosticType)v12),((java.lang.String[])v13));
    ((com.google.javascript.jscomp.DeadAssignmentsElimination)v2).enterScope(((com.google.javascript.jscomp.NodeTraversal)v6));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5));
    Object v7 = "";
    Object v8 = "_";
    Object v9 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = "";
    Object v11 = "_";
    Object v12 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = false;
    ((com.google.javascript.rhino.Node)v12).setOptionalArg((((java.lang.Boolean)v13).booleanValue()));
    Object v14 = null;
    Object v15 = ((com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback)v2).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v6),((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v12));
    org.junit.Assert.assertEquals((Object)(true), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5));
    Object v7 = ((com.google.javascript.jscomp.NodeTraversal)v6).getEnclosingFunction();
    Object v8 = "";
    Object v9 = "_";
    Object v10 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = ((com.google.javascript.rhino.Node)v10).toString();
    Object v12 = "";
    Object v13 = "_";
    Object v14 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v12),((java.lang.String)v13));
    ((com.google.javascript.jscomp.DeadAssignmentsElimination)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v6),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v14));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = "";
    Object v7 = "_";
    Object v8 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = "";
    Object v10 = "_";
    Object v11 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v9),((java.lang.String)v10));
    ((com.google.javascript.jscomp.NodeTraversal.Callback)v1).visit(((com.google.javascript.jscomp.NodeTraversal)v5),((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v11));
    Object v12 = null;
    Object v13 = new com.google.javascript.jscomp.Compiler();
    Object v14 = new com.google.javascript.jscomp.Compiler();
    Object v15 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v14));
    Object v16 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v13),((com.google.javascript.jscomp.NodeTraversal.Callback)v15));
    Object v17 = "";
    Object v18 = "_";
    Object v19 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v17),((java.lang.String)v18));
    Object v20 = "";
    Object v21 = "_";
    Object v22 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v20),((java.lang.String)v21));
    Object v23 = true;
    ((com.google.javascript.rhino.Node)v22).setWasEmptyNode((((java.lang.Boolean)v23).booleanValue()));
    Object v24 = null;
    Object v25 = ((com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback)v1).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v16),((com.google.javascript.rhino.Node)v19),((com.google.javascript.rhino.Node)v22));
    org.junit.Assert.assertEquals((Object)(true), v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = "";
    Object v4 = "_";
    Object v5 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = "";
    Object v7 = "_";
    Object v8 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = new com.google.javascript.rhino.JSDocInfo();
    ((com.google.javascript.rhino.Node)v8).setJSDocInfo(((com.google.javascript.rhino.JSDocInfo)v9));
    Object v10 = null;
    ((com.google.javascript.jscomp.DeadAssignmentsElimination)v2).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v8));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5));
    Object v7 = "";
    Object v8 = "_";
    Object v9 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = "";
    Object v11 = "Message initialized -sing unrecognized function. Please use goog.getMsg() instead.";
    Object v12 = com.google.javascript.jscomp.DiagnosticType.warning(((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = new java.lang.String[]{"Error","  "};
    Object v14 = ((com.google.javascript.jscomp.NodeTraversal)v6).makeError(((com.google.javascript.rhino.Node)v9),((com.google.javascript.jscomp.DiagnosticType)v12),((java.lang.String[])v13));
    Object v15 = "";
    Object v16 = "_";
    Object v17 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = ((com.google.javascript.rhino.Node)v17).children();
    Object v19 = "";
    Object v20 = "_";
    Object v21 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v19),((java.lang.String)v20));
    ((com.google.javascript.jscomp.DeadAssignmentsElimination)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v6),((com.google.javascript.rhino.Node)v17),((com.google.javascript.rhino.Node)v21));
    Object v22 = null;
    org.junit.Assert.assertNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5));
    Object v7 = ((com.google.javascript.jscomp.NodeTraversal)v6).getScope();
    ((com.google.javascript.jscomp.DeadAssignmentsElimination)v2).enterScope(((com.google.javascript.jscomp.NodeTraversal)v6));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5));
    Object v7 = "";
    Object v8 = "_";
    Object v9 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = "";
    Object v11 = "_";
    Object v12 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = "";
    Object v14 = "_";
    Object v15 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v13),((java.lang.String)v14));
    ((com.google.javascript.rhino.Node)v12).addChildToBack(((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
    Object v17 = ((com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback)v2).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v6),((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v12));
    org.junit.Assert.assertEquals((Object)(true), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5));
    Object v7 = "";
    Object v8 = "_";
    Object v9 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = 0;
    Object v11 = ((com.google.javascript.rhino.Node)v9).getAncestor((((java.lang.Integer)v10).intValue()));
    Object v12 = "";
    Object v13 = "_";
    Object v14 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = ((com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback)v2).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v6),((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v14));
    org.junit.Assert.assertEquals((Object)(true), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5));
    Object v7 = "";
    Object v8 = "_";
    Object v9 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = "p";
    ((com.google.javascript.rhino.Node)v9).addSuppression(((java.lang.String)v10));
    Object v11 = null;
    Object v12 = "";
    Object v13 = "_";
    Object v14 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = "";
    Object v16 = "_";
    Object v17 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = ((com.google.javascript.rhino.Node)v14).checkTreeEqualsSilent(((com.google.javascript.rhino.Node)v17));
    ((com.google.javascript.jscomp.DeadAssignmentsElimination)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v6),((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v14));
    Object v19 = null;
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getErrorManager();
    Object v2 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = "";
    Object v4 = "_";
    Object v5 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = "";
    Object v7 = "_";
    Object v8 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v6),((java.lang.String)v7));
    ((com.google.javascript.jscomp.DeadAssignmentsElimination)v2).process(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
    Object v10 = new com.google.javascript.jscomp.Compiler();
    Object v11 = new com.google.javascript.jscomp.Compiler();
    Object v12 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v11));
    Object v13 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.NodeTraversal.Callback)v12));
    Object v14 = ((com.google.javascript.jscomp.NodeTraversal)v13).getScope();
    ((com.google.javascript.jscomp.DeadAssignmentsElimination)v2).enterScope(((com.google.javascript.jscomp.NodeTraversal)v13));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = "";
    Object v3 = "_";
    Object v4 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = "";
    Object v6 = "_";
    Object v7 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = "";
    Object v9 = "_";
    Object v10 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = ((com.google.javascript.rhino.Node)v7).checkTreeEqualsSilent(((com.google.javascript.rhino.Node)v10));
    ((com.google.javascript.jscomp.DeadAssignmentsElimination)v1).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v7));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5));
    Object v7 = "";
    Object v8 = "_";
    Object v9 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = "";
    Object v11 = "_";
    Object v12 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = "";
    Object v14 = "_";
    Object v15 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v13),((java.lang.String)v14));
    ((com.google.javascript.rhino.Node)v12).addChildrenToBack(((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
    ((com.google.javascript.jscomp.DeadAssignmentsElimination)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v6),((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v12));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5));
    Object v7 = 40;
    Object v8 = new java.util.ArrayList((((java.lang.Integer)v7).intValue()));
    ((com.google.javascript.jscomp.NodeTraversal)v6).traverseRoots(((java.util.List)v8));
    Object v9 = null;
    ((com.google.javascript.jscomp.DeadAssignmentsElimination)v2).exitScope(((com.google.javascript.jscomp.NodeTraversal)v6));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5));
    Object v7 = "";
    Object v8 = "_";
    Object v9 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = "";
    Object v11 = "_";
    Object v12 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v10),((java.lang.String)v11));
    ((com.google.javascript.jscomp.NodeTraversal.Callback)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v6),((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
    Object v14 = new com.google.javascript.jscomp.Compiler();
    Object v15 = new com.google.javascript.jscomp.Compiler();
    Object v16 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v15));
    Object v17 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.NodeTraversal.Callback)v16));
    Object v18 = "";
    Object v19 = "_";
    Object v20 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v18),((java.lang.String)v19));
    Object v21 = "";
    Object v22 = "_";
    Object v23 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v21),((java.lang.String)v22));
    Object v24 = 0;
    Object v25 = ((com.google.javascript.rhino.Node)v23).getAncestor((((java.lang.Integer)v24).intValue()));
    Object v26 = ((com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback)v2).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v17),((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.Node)v23));
    org.junit.Assert.assertEquals((Object)(true), v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5));
    Object v7 = "";
    Object v8 = "_";
    Object v9 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v10).reportCodeChange();
    Object v11 = null;
    Object v12 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v13 = java.util.Set.of(((java.lang.Object)v12));
    ((com.google.javascript.rhino.Node)v9).setDirectives(((java.util.Set)v13));
    Object v14 = null;
    Object v15 = "";
    Object v16 = "_";
    Object v17 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v15),((java.lang.String)v16));
    ((com.google.javascript.jscomp.DeadAssignmentsElimination)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v6),((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v17));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = "";
    Object v3 = "_";
    Object v4 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = "";
    Object v6 = "_";
    Object v7 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = 12;
    ((com.google.javascript.rhino.Node)v7).setType((((java.lang.Integer)v8).intValue()));
    Object v9 = null;
    ((com.google.javascript.jscomp.DeadAssignmentsElimination)v1).process(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.Node)v7));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTopScope();
    Object v2 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v0));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTopScope();
    Object v2 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5));
    ((com.google.javascript.jscomp.DeadAssignmentsElimination)v2).exitScope(((com.google.javascript.jscomp.NodeTraversal)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTopScope();
    Object v2 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5));
    Object v7 = 40;
    Object v8 = new java.util.ArrayList((((java.lang.Integer)v7).intValue()));
    ((com.google.javascript.jscomp.NodeTraversal)v6).traverseRoots(((java.util.List)v8));
    Object v9 = null;
    ((com.google.javascript.jscomp.DeadAssignmentsElimination)v2).enterScope(((com.google.javascript.jscomp.NodeTraversal)v6));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5));
    Object v7 = "";
    Object v8 = "_";
    Object v9 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = "";
    Object v11 = "Message initialized -sing unrecognized function. Please use goog.getMsg() instead.";
    Object v12 = com.google.javascript.jscomp.DiagnosticType.warning(((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = new java.lang.String[]{"~","originalname","8"};
    Object v14 = ((com.google.javascript.jscomp.NodeTraversal)v6).makeError(((com.google.javascript.rhino.Node)v9),((com.google.javascript.jscomp.DiagnosticType)v12),((java.lang.String[])v13));
    ((com.google.javascript.jscomp.DeadAssignmentsElimination)v2).enterScope(((com.google.javascript.jscomp.NodeTraversal)v6));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTopScope();
    Object v2 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5));
    Object v7 = "";
    Object v8 = "_";
    Object v9 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = "";
    Object v11 = "_";
    Object v12 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v10),((java.lang.String)v11));
    ((com.google.javascript.jscomp.DeadAssignmentsElimination)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v6),((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler();
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v2),((com.google.javascript.jscomp.NodeTraversal.Callback)v4));
    Object v6 = "";
    Object v7 = "_";
    Object v8 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = ((com.google.javascript.rhino.Node)v8).cloneTree();
    Object v10 = "";
    Object v11 = "_";
    Object v12 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = ((com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback)v1).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v5),((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v12));
    org.junit.Assert.assertEquals((Object)(true), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5));
    Object v7 = "";
    Object v8 = "_";
    Object v9 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = ((com.google.javascript.rhino.Node)v9).cloneTree();
    Object v11 = "";
    Object v12 = "_";
    Object v13 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v11),((java.lang.String)v12));
    ((com.google.javascript.jscomp.DeadAssignmentsElimination)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v6),((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = ((com.google.javascript.jscomp.AbstractCompiler)v0).getTopScope();
    Object v2 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5));
    ((com.google.javascript.jscomp.DeadAssignmentsElimination)v2).enterScope(((com.google.javascript.jscomp.NodeTraversal)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    ((com.google.javascript.jscomp.AbstractCompiler)v0).reportCodeChange();
    Object v1 = null;
    Object v2 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v0));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = new com.google.javascript.jscomp.DeadAssignmentsElimination(((com.google.javascript.jscomp.AbstractCompiler)v4));
    Object v6 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v5));
    Object v7 = "";
    Object v8 = "_";
    Object v9 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v11 = "";
    Object v12 = "Message initialized -sing unrecognized function. Please use goog.getMsg() instead.";
    Object v13 = com.google.javascript.jscomp.DiagnosticType.warning(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = new java.lang.String[]{"","Q","arguments"};
    Object v15 = ((com.google.javascript.jscomp.NodeTraversal)v6).makeError(((com.google.javascript.rhino.Node)v9),((com.google.javascript.jscomp.CheckLevel)v10),((com.google.javascript.jscomp.DiagnosticType)v13),((java.lang.String[])v14));
    ((com.google.javascript.jscomp.DeadAssignmentsElimination)v2).enterScope(((com.google.javascript.jscomp.NodeTraversal)v6));
    Object v16 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }
}
