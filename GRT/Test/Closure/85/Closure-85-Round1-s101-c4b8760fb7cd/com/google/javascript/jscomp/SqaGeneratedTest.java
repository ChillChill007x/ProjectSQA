package com.google.javascript.jscomp;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = "H";
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = "H";
    Object v13 = 1;
    Object v14 = 1;
    Object v15 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v12),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = ((com.google.javascript.rhino.Node)v15).hasSideEffects();
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v15));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "H";
    Object v4 = 1;
    Object v5 = 1;
    Object v6 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = "H";
    Object v8 = 1;
    Object v9 = 1;
    Object v10 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v2).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = ((com.google.javascript.jscomp.NodeTraversal)v7).getScope();
    Object v9 = "H";
    Object v10 = 1;
    Object v11 = 1;
    Object v12 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = "H";
    Object v14 = 1;
    Object v15 = 1;
    Object v16 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v13),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v16));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = "H";
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = 1;
    Object v13 = "H";
    Object v14 = 1;
    Object v15 = 1;
    Object v16 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v13),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    ((com.google.javascript.rhino.Node)v11).putProp((((java.lang.Integer)v12).intValue()),((java.lang.Object)v16));
    Object v17 = null;
    Object v18 = "H";
    Object v19 = 1;
    Object v20 = 1;
    Object v21 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v21));
    Object v22 = null;
    org.junit.Assert.assertNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = ((com.google.javascript.jscomp.NodeTraversal)v7).getScope();
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v2).enterScope(((com.google.javascript.jscomp.NodeTraversal)v7));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = "H";
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = "H";
    Object v13 = 1;
    Object v14 = 1;
    Object v15 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v12),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "7";
    Object v2 = -39;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "7";
    Object v2 = -39;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = "H";
    Object v7 = 1;
    Object v8 = 1;
    Object v9 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = ((com.google.javascript.rhino.Node)v9).removeChildren();
    Object v11 = "H";
    Object v12 = 1;
    Object v13 = 1;
    Object v14 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = 1;
    Object v16 = false;
    ((com.google.javascript.rhino.Node)v14).putBooleanProp((((java.lang.Integer)v15).intValue()),(((java.lang.Boolean)v16).booleanValue()));
    Object v17 = null;
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v5).process(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v14));
    Object v18 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = "H";
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = "";
    Object v13 = "";
    Object v14 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = new java.lang.String[]{" =>\\","o",""};
    Object v16 = ((com.google.javascript.jscomp.NodeTraversal)v7).makeError(((com.google.javascript.rhino.Node)v11),((com.google.javascript.jscomp.DiagnosticType)v14),((java.lang.String[])v15));
    Object v17 = "H";
    Object v18 = 1;
    Object v19 = 1;
    Object v20 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v17),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()));
    Object v21 = ((com.google.javascript.rhino.Node)v20).getAncestors();
    Object v22 = "H";
    Object v23 = 1;
    Object v24 = 1;
    Object v25 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v22),(((java.lang.Integer)v23).intValue()),(((java.lang.Integer)v24).intValue()));
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.Node)v25));
    Object v26 = null;
    org.junit.Assert.assertNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = "H";
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = "H";
    Object v13 = 1;
    Object v14 = 1;
    Object v15 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v12),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = ((com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback)v2).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v15));
    org.junit.Assert.assertEquals((Object)(true), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "7";
    Object v2 = -39;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = true;
    Object v9 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.NodeTraversal.Callback)v9));
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v5).exitScope(((com.google.javascript.jscomp.NodeTraversal)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "7";
    Object v2 = -39;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = true;
    Object v9 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.NodeTraversal.Callback)v9));
    Object v11 = "H";
    Object v12 = 1;
    Object v13 = 1;
    Object v14 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = "H";
    Object v16 = 1;
    Object v17 = 1;
    Object v18 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v15),(((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()));
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v5).visit(((com.google.javascript.jscomp.NodeTraversal)v10),((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.Node)v18));
    Object v19 = null;
    Object v20 = new com.google.javascript.jscomp.Compiler();
    Object v21 = new com.google.javascript.jscomp.Compiler();
    Object v22 = true;
    Object v23 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v21),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v20),((com.google.javascript.jscomp.NodeTraversal.Callback)v23));
    Object v25 = "H";
    Object v26 = 1;
    Object v27 = 1;
    Object v28 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v25),(((java.lang.Integer)v26).intValue()),(((java.lang.Integer)v27).intValue()));
    Object v29 = "H";
    Object v30 = 1;
    Object v31 = 1;
    Object v32 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v29),(((java.lang.Integer)v30).intValue()),(((java.lang.Integer)v31).intValue()));
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v5).visit(((com.google.javascript.jscomp.NodeTraversal)v24),((com.google.javascript.rhino.Node)v28),((com.google.javascript.rhino.Node)v32));
    Object v33 = null;
    org.junit.Assert.assertNull(v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "7";
    Object v2 = -39;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = true;
    Object v9 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.NodeTraversal.Callback)v9));
    Object v11 = "H";
    Object v12 = 1;
    Object v13 = 1;
    Object v14 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = "H";
    Object v16 = 1;
    Object v17 = 1;
    Object v18 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v15),(((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()));
    Object v19 = 2;
    ((com.google.javascript.rhino.Node)v18).removeProp((((java.lang.Integer)v19).intValue()));
    Object v20 = null;
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v5).visit(((com.google.javascript.jscomp.NodeTraversal)v10),((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.Node)v18));
    Object v21 = null;
    org.junit.Assert.assertNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v2).exitScope(((com.google.javascript.jscomp.NodeTraversal)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = "H";
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = "H";
    Object v13 = 1;
    Object v14 = 1;
    Object v15 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v12),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
    Object v17 = new com.google.javascript.jscomp.Compiler();
    Object v18 = new com.google.javascript.jscomp.Compiler();
    Object v19 = true;
    Object v20 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v17),((com.google.javascript.jscomp.NodeTraversal.Callback)v20));
    Object v22 = "H";
    Object v23 = 1;
    Object v24 = 1;
    Object v25 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v22),(((java.lang.Integer)v23).intValue()),(((java.lang.Integer)v24).intValue()));
    Object v26 = "H";
    Object v27 = 1;
    Object v28 = 1;
    Object v29 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v26),(((java.lang.Integer)v27).intValue()),(((java.lang.Integer)v28).intValue()));
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v21),((com.google.javascript.rhino.Node)v25),((com.google.javascript.rhino.Node)v29));
    Object v30 = null;
    org.junit.Assert.assertNull(v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = "H";
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v13 = "";
    Object v14 = "";
    Object v15 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = new java.lang.String[]{"r","g"};
    Object v17 = ((com.google.javascript.jscomp.NodeTraversal)v7).makeError(((com.google.javascript.rhino.Node)v11),((com.google.javascript.jscomp.CheckLevel)v12),((com.google.javascript.jscomp.DiagnosticType)v15),((java.lang.String[])v16));
    Object v18 = "H";
    Object v19 = 1;
    Object v20 = 1;
    Object v21 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
    Object v22 = "H";
    Object v23 = 1;
    Object v24 = 1;
    Object v25 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v22),(((java.lang.Integer)v23).intValue()),(((java.lang.Integer)v24).intValue()));
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v21),((com.google.javascript.rhino.Node)v25));
    Object v26 = null;
    org.junit.Assert.assertNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = "H";
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = "H";
    Object v13 = 1;
    Object v14 = 1;
    Object v15 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v12),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = -42;
    ((com.google.javascript.rhino.Node)v15).setType((((java.lang.Integer)v16).intValue()));
    Object v17 = null;
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v15));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = "H";
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = ((com.google.javascript.rhino.Node)v11).getJsDocBuilderForNode();
    Object v13 = "H";
    Object v14 = 1;
    Object v15 = 1;
    Object v16 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v13),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v16));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "7";
    Object v2 = -39;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = true;
    Object v9 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.NodeTraversal.Callback)v9));
    Object v11 = "H";
    Object v12 = 1;
    Object v13 = 1;
    Object v14 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = "H";
    Object v16 = 1;
    Object v17 = 1;
    Object v18 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v15),(((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()));
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v5).visit(((com.google.javascript.jscomp.NodeTraversal)v10),((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.Node)v18));
    Object v19 = null;
    Object v20 = new com.google.javascript.jscomp.Compiler();
    Object v21 = new com.google.javascript.jscomp.Compiler();
    Object v22 = true;
    Object v23 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v21),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v20),((com.google.javascript.jscomp.NodeTraversal.Callback)v23));
    Object v25 = "H";
    Object v26 = 1;
    Object v27 = 1;
    Object v28 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v25),(((java.lang.Integer)v26).intValue()),(((java.lang.Integer)v27).intValue()));
    Object v29 = ((com.google.javascript.rhino.Node)v28).removeChildren();
    Object v30 = "H";
    Object v31 = 1;
    Object v32 = 1;
    Object v33 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v30),(((java.lang.Integer)v31).intValue()),(((java.lang.Integer)v32).intValue()));
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v5).visit(((com.google.javascript.jscomp.NodeTraversal)v24),((com.google.javascript.rhino.Node)v28),((com.google.javascript.rhino.Node)v33));
    Object v34 = null;
    org.junit.Assert.assertNull(v34);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = "H";
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = "H";
    Object v13 = 1;
    Object v14 = 1;
    Object v15 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v12),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
    Object v17 = new com.google.javascript.jscomp.Compiler();
    Object v18 = new com.google.javascript.jscomp.Compiler();
    Object v19 = true;
    Object v20 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v17),((com.google.javascript.jscomp.NodeTraversal.Callback)v20));
    Object v22 = ((com.google.javascript.jscomp.NodeTraversal)v21).getEnclosingFunction();
    Object v23 = "H";
    Object v24 = 1;
    Object v25 = 1;
    Object v26 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v23),(((java.lang.Integer)v24).intValue()),(((java.lang.Integer)v25).intValue()));
    Object v27 = "H";
    Object v28 = 1;
    Object v29 = 1;
    Object v30 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v27),(((java.lang.Integer)v28).intValue()),(((java.lang.Integer)v29).intValue()));
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v21),((com.google.javascript.rhino.Node)v26),((com.google.javascript.rhino.Node)v30));
    Object v31 = null;
    org.junit.Assert.assertNull(v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = "H";
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = "H";
    Object v13 = 1;
    Object v14 = 1;
    Object v15 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v12),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = ((com.google.javascript.jscomp.NodeTraversal)v7).hasScope();
    Object v9 = "H";
    Object v10 = 1;
    Object v11 = 1;
    Object v12 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = "H";
    Object v14 = 1;
    Object v15 = 1;
    Object v16 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v13),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = ((com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback)v2).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v16));
    org.junit.Assert.assertEquals((Object)(true), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v2).enterScope(((com.google.javascript.jscomp.NodeTraversal)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = "H";
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = "H";
    Object v13 = 1;
    Object v14 = 1;
    Object v15 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v12),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
    Object v17 = new com.google.javascript.jscomp.Compiler();
    Object v18 = new com.google.javascript.jscomp.Compiler();
    Object v19 = true;
    Object v20 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v17),((com.google.javascript.jscomp.NodeTraversal.Callback)v20));
    Object v22 = "H";
    Object v23 = 1;
    Object v24 = 1;
    Object v25 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v22),(((java.lang.Integer)v23).intValue()),(((java.lang.Integer)v24).intValue()));
    Object v26 = "H";
    Object v27 = 1;
    Object v28 = 1;
    Object v29 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v26),(((java.lang.Integer)v27).intValue()),(((java.lang.Integer)v28).intValue()));
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v21),((com.google.javascript.rhino.Node)v25),((com.google.javascript.rhino.Node)v29));
    Object v30 = null;
    org.junit.Assert.assertNull(v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = "H";
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = ((com.google.javascript.rhino.Node)v11).hasSideEffects();
    Object v13 = "H";
    Object v14 = 1;
    Object v15 = 1;
    Object v16 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v13),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = ((com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback)v2).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v16));
    org.junit.Assert.assertEquals((Object)(true), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = "H";
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = "H";
    Object v13 = 1;
    Object v14 = 1;
    Object v15 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v12),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = ((com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback)v2).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v15));
    org.junit.Assert.assertEquals((Object)(true), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = "H";
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = "H";
    Object v13 = 1;
    Object v14 = 1;
    Object v15 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v12),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    ((com.google.javascript.jscomp.NodeTraversal.Callback)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
    Object v17 = new com.google.javascript.jscomp.Compiler();
    Object v18 = new com.google.javascript.jscomp.Compiler();
    Object v19 = true;
    Object v20 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v17),((com.google.javascript.jscomp.NodeTraversal.Callback)v20));
    Object v22 = "H";
    Object v23 = 1;
    Object v24 = 1;
    Object v25 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v22),(((java.lang.Integer)v23).intValue()),(((java.lang.Integer)v24).intValue()));
    Object v26 = "H";
    Object v27 = 1;
    Object v28 = 1;
    Object v29 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v26),(((java.lang.Integer)v27).intValue()),(((java.lang.Integer)v28).intValue()));
    Object v30 = ((com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback)v2).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v21),((com.google.javascript.rhino.Node)v25),((com.google.javascript.rhino.Node)v29));
    org.junit.Assert.assertEquals((Object)(true), v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "H";
    Object v4 = 1;
    Object v5 = 1;
    Object v6 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = "H";
    Object v8 = 1;
    Object v9 = 1;
    Object v10 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v2).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "7";
    Object v2 = -39;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = true;
    Object v9 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.NodeTraversal.Callback)v9));
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v5).enterScope(((com.google.javascript.jscomp.NodeTraversal)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = ((com.google.javascript.jscomp.NodeTraversal)v7).getEnclosingFunction();
    Object v9 = "H";
    Object v10 = 1;
    Object v11 = 1;
    Object v12 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = "H";
    Object v14 = 1;
    Object v15 = 1;
    Object v16 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v13),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = ((com.google.javascript.rhino.Node)v16).isUnscopedQualifiedName();
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v16));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = ((com.google.javascript.jscomp.NodeTraversal)v7).getEnclosingFunction();
    Object v9 = "H";
    Object v10 = 1;
    Object v11 = 1;
    Object v12 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = "H";
    Object v14 = 1;
    Object v15 = 1;
    Object v16 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v13),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = ((com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback)v2).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v16));
    org.junit.Assert.assertEquals((Object)(true), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v2).exitScope(((com.google.javascript.jscomp.NodeTraversal)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = "H";
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = "H";
    Object v13 = 1;
    Object v14 = 1;
    Object v15 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v12),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = 1;
    ((com.google.javascript.rhino.Node)v15).removeProp((((java.lang.Integer)v16).intValue()));
    Object v17 = null;
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v15));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = "H";
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = "";
    Object v13 = "";
    Object v14 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = new java.lang.String[]{"Q"};
    ((com.google.javascript.jscomp.NodeTraversal)v7).report(((com.google.javascript.rhino.Node)v11),((com.google.javascript.jscomp.DiagnosticType)v14),((java.lang.String[])v15));
    Object v16 = null;
    Object v17 = "H";
    Object v18 = 1;
    Object v19 = 1;
    Object v20 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v17),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()));
    Object v21 = "H";
    Object v22 = 1;
    Object v23 = 1;
    Object v24 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v21),(((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()));
    Object v25 = 0;
    ((com.google.javascript.rhino.Node)v24).setCharno((((java.lang.Integer)v25).intValue()));
    Object v26 = null;
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.Node)v24));
    Object v27 = null;
    org.junit.Assert.assertNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = "H";
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = "H";
    Object v13 = 1;
    Object v14 = 1;
    Object v15 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v12),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = ((com.google.javascript.rhino.Node)v11).checkTreeEquals(((com.google.javascript.rhino.Node)v15));
    Object v17 = "H";
    Object v18 = 1;
    Object v19 = 1;
    Object v20 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v17),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()));
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v20));
    Object v21 = null;
    org.junit.Assert.assertNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = "H";
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = "H";
    Object v13 = 1;
    Object v14 = 1;
    Object v15 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v12),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
    Object v17 = "H";
    Object v18 = 1;
    Object v19 = 1;
    Object v20 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v17),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()));
    Object v21 = "H";
    Object v22 = 1;
    Object v23 = 1;
    Object v24 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v21),(((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()));
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v2).process(((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.Node)v24));
    Object v25 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "7";
    Object v2 = -39;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = true;
    Object v9 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.NodeTraversal.Callback)v9));
    Object v11 = "H";
    Object v12 = 1;
    Object v13 = 1;
    Object v14 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = "H";
    Object v16 = 1;
    Object v17 = 1;
    Object v18 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v15),(((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()));
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v5).visit(((com.google.javascript.jscomp.NodeTraversal)v10),((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.Node)v18));
    Object v19 = null;
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = "H";
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v13 = "";
    Object v14 = "";
    Object v15 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = new java.lang.String[]{"G","toLo+aleDateString"};
    Object v17 = ((com.google.javascript.jscomp.NodeTraversal)v7).makeError(((com.google.javascript.rhino.Node)v11),((com.google.javascript.jscomp.CheckLevel)v12),((com.google.javascript.jscomp.DiagnosticType)v15),((java.lang.String[])v16));
    Object v18 = "H";
    Object v19 = 1;
    Object v20 = 1;
    Object v21 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
    Object v22 = "H";
    Object v23 = 1;
    Object v24 = 1;
    Object v25 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v22),(((java.lang.Integer)v23).intValue()),(((java.lang.Integer)v24).intValue()));
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v21),((com.google.javascript.rhino.Node)v25));
    Object v26 = null;
    org.junit.Assert.assertNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = "H";
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = "";
    Object v13 = "";
    Object v14 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = new java.lang.String[]{};
    Object v16 = ((com.google.javascript.jscomp.NodeTraversal)v7).makeError(((com.google.javascript.rhino.Node)v11),((com.google.javascript.jscomp.DiagnosticType)v14),((java.lang.String[])v15));
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v2).exitScope(((com.google.javascript.jscomp.NodeTraversal)v7));
    Object v17 = null;
      org.junit.Assert.fail("Expected java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = new com.google.javascript.rhino.Node[]{};
    ((com.google.javascript.jscomp.NodeTraversal)v7).traverseRoots(((com.google.javascript.rhino.Node[])v8));
    Object v9 = null;
    Object v10 = "H";
    Object v11 = 1;
    Object v12 = 1;
    Object v13 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v10),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = "H";
    Object v15 = 1;
    Object v16 = 1;
    Object v17 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v14),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v17));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = "H";
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = "H";
    Object v13 = 1;
    Object v14 = 1;
    Object v15 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v12),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = "H";
    Object v17 = 1;
    Object v18 = 1;
    Object v19 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v16),(((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()));
    ((com.google.javascript.rhino.Node)v15).addChildrenToFront(((com.google.javascript.rhino.Node)v19));
    Object v20 = null;
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v15));
    Object v21 = null;
    org.junit.Assert.assertNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = "H";
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = "H";
    Object v13 = 1;
    Object v14 = 1;
    Object v15 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v12),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = ((com.google.javascript.rhino.Node)v15).isQualifiedName();
    Object v17 = ((com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback)v2).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v15));
    org.junit.Assert.assertEquals((Object)(true), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v2).enterScope(((com.google.javascript.jscomp.NodeTraversal)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = ((com.google.javascript.jscomp.NodeTraversal)v7).hasScope();
    Object v9 = "H";
    Object v10 = 1;
    Object v11 = 1;
    Object v12 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = "H";
    Object v14 = 1;
    Object v15 = 1;
    Object v16 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v13),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = "H";
    Object v18 = 1;
    Object v19 = 1;
    Object v20 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v17),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()));
    ((com.google.javascript.rhino.Node)v16).addChildrenToFront(((com.google.javascript.rhino.Node)v20));
    Object v21 = null;
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v16));
    Object v22 = null;
    org.junit.Assert.assertNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = ((com.google.javascript.jscomp.NodeTraversal)v7).getScope();
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v2).exitScope(((com.google.javascript.jscomp.NodeTraversal)v7));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = "H";
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = "H";
    Object v13 = 1;
    Object v14 = 1;
    Object v15 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v12),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
    Object v17 = new com.google.javascript.jscomp.Compiler();
    Object v18 = new com.google.javascript.jscomp.Compiler();
    Object v19 = true;
    Object v20 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v17),((com.google.javascript.jscomp.NodeTraversal.Callback)v20));
    Object v22 = "H";
    Object v23 = 1;
    Object v24 = 1;
    Object v25 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v22),(((java.lang.Integer)v23).intValue()),(((java.lang.Integer)v24).intValue()));
    Object v26 = ((com.google.javascript.rhino.Node)v25).siblings();
    Object v27 = "H";
    Object v28 = 1;
    Object v29 = 1;
    Object v30 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v27),(((java.lang.Integer)v28).intValue()),(((java.lang.Integer)v29).intValue()));
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v21),((com.google.javascript.rhino.Node)v25),((com.google.javascript.rhino.Node)v30));
    Object v31 = null;
    org.junit.Assert.assertNull(v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = "H";
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = "H";
    Object v13 = 1;
    Object v14 = 1;
    Object v15 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v12),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
    Object v17 = new com.google.javascript.jscomp.Compiler();
    Object v18 = new com.google.javascript.jscomp.Compiler();
    Object v19 = true;
    Object v20 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v17),((com.google.javascript.jscomp.NodeTraversal.Callback)v20));
    Object v22 = "H";
    Object v23 = 1;
    Object v24 = 1;
    Object v25 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v22),(((java.lang.Integer)v23).intValue()),(((java.lang.Integer)v24).intValue()));
    Object v26 = ((com.google.javascript.rhino.Node)v25).cloneTree();
    Object v27 = "H";
    Object v28 = 1;
    Object v29 = 1;
    Object v30 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v27),(((java.lang.Integer)v28).intValue()),(((java.lang.Integer)v29).intValue()));
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v21),((com.google.javascript.rhino.Node)v25),((com.google.javascript.rhino.Node)v30));
    Object v31 = null;
    org.junit.Assert.assertNull(v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "7";
    Object v2 = -39;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = true;
    Object v9 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.NodeTraversal.Callback)v9));
    Object v11 = "H";
    Object v12 = 1;
    Object v13 = 1;
    Object v14 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = "";
    ((com.google.javascript.rhino.Node)v14).addSuppression(((java.lang.String)v15));
    Object v16 = null;
    Object v17 = "H";
    Object v18 = 1;
    Object v19 = 1;
    Object v20 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v17),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()));
    Object v21 = 1;
    ((com.google.javascript.rhino.Node)v20).setLineno((((java.lang.Integer)v21).intValue()));
    Object v22 = null;
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v5).visit(((com.google.javascript.jscomp.NodeTraversal)v10),((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.Node)v20));
    Object v23 = null;
    org.junit.Assert.assertNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "7";
    Object v2 = -39;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = true;
    Object v9 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.NodeTraversal.Callback)v9));
    Object v11 = ((com.google.javascript.jscomp.NodeTraversal)v10).hasScope();
    Object v12 = "H";
    Object v13 = 1;
    Object v14 = 1;
    Object v15 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v12),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = "H";
    Object v17 = 1;
    Object v18 = 1;
    Object v19 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v16),(((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()));
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v5).visit(((com.google.javascript.jscomp.NodeTraversal)v10),((com.google.javascript.rhino.Node)v15),((com.google.javascript.rhino.Node)v19));
    Object v20 = null;
    org.junit.Assert.assertNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = "H";
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = "";
    Object v13 = "";
    Object v14 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = new java.lang.String[]{"Q","","I5itPatt"};
    ((com.google.javascript.jscomp.NodeTraversal)v7).report(((com.google.javascript.rhino.Node)v11),((com.google.javascript.jscomp.DiagnosticType)v14),((java.lang.String[])v15));
    Object v16 = null;
    Object v17 = "H";
    Object v18 = 1;
    Object v19 = 1;
    Object v20 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v17),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()));
    Object v21 = "H";
    Object v22 = 1;
    Object v23 = 1;
    Object v24 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v21),(((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()));
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.Node)v24));
    Object v25 = null;
    org.junit.Assert.assertNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = ((com.google.javascript.jscomp.NodeTraversal)v7).getScope();
    Object v9 = "H";
    Object v10 = 1;
    Object v11 = 1;
    Object v12 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = "H";
    Object v14 = 1;
    Object v15 = 1;
    Object v16 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v13),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v16));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = ((com.google.javascript.jscomp.NodeTraversal)v7).hasScope();
    Object v9 = "H";
    Object v10 = 1;
    Object v11 = 1;
    Object v12 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = "H";
    Object v14 = 1;
    Object v15 = 1;
    Object v16 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v13),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v16));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = "H";
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = ((com.google.javascript.rhino.Node)v11).getQualifiedName();
    Object v13 = "H";
    Object v14 = 1;
    Object v15 = 1;
    Object v16 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v13),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v16));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = "H";
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = "";
    Object v13 = "";
    Object v14 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = new java.lang.String[]{"string"};
    ((com.google.javascript.jscomp.NodeTraversal)v7).report(((com.google.javascript.rhino.Node)v11),((com.google.javascript.jscomp.DiagnosticType)v14),((java.lang.String[])v15));
    Object v16 = null;
    Object v17 = "H";
    Object v18 = 1;
    Object v19 = 1;
    Object v20 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v17),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()));
    Object v21 = "H";
    Object v22 = 1;
    Object v23 = 1;
    Object v24 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v21),(((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()));
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.Node)v24));
    Object v25 = null;
    org.junit.Assert.assertNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = "H";
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v13 = "";
    Object v14 = "";
    Object v15 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = new java.lang.String[]{""};
    Object v17 = ((com.google.javascript.jscomp.NodeTraversal)v7).makeError(((com.google.javascript.rhino.Node)v11),((com.google.javascript.jscomp.CheckLevel)v12),((com.google.javascript.jscomp.DiagnosticType)v15),((java.lang.String[])v16));
    Object v18 = "H";
    Object v19 = 1;
    Object v20 = 1;
    Object v21 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
    Object v22 = "H";
    Object v23 = 1;
    Object v24 = 1;
    Object v25 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v22),(((java.lang.Integer)v23).intValue()),(((java.lang.Integer)v24).intValue()));
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v21),((com.google.javascript.rhino.Node)v25));
    Object v26 = null;
    org.junit.Assert.assertNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "7";
    Object v2 = -39;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = true;
    Object v9 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.NodeTraversal.Callback)v9));
    Object v11 = "H";
    Object v12 = 1;
    Object v13 = 1;
    Object v14 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = ((com.google.javascript.rhino.Node)v14).siblings();
    Object v16 = "H";
    Object v17 = 1;
    Object v18 = 1;
    Object v19 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v16),(((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()));
    Object v20 = 0;
    Object v21 = "H";
    Object v22 = 1;
    Object v23 = 1;
    Object v24 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v21),(((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()));
    ((com.google.javascript.rhino.Node)v19).putProp((((java.lang.Integer)v20).intValue()),((java.lang.Object)v24));
    Object v25 = null;
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v5).visit(((com.google.javascript.jscomp.NodeTraversal)v10),((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.Node)v19));
    Object v26 = null;
    org.junit.Assert.assertNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = "H";
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = "toFixed";
    ((com.google.javascript.rhino.Node)v11).addSuppression(((java.lang.String)v12));
    Object v13 = null;
    Object v14 = "H";
    Object v15 = 1;
    Object v16 = 1;
    Object v17 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v14),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v17));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "7";
    Object v2 = -39;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = true;
    Object v9 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.NodeTraversal.Callback)v9));
    Object v11 = "H";
    Object v12 = 1;
    Object v13 = 1;
    Object v14 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = ((com.google.javascript.rhino.Node)v14).removeFirstChild();
    Object v16 = "H";
    Object v17 = 1;
    Object v18 = 1;
    Object v19 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v16),(((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()));
    Object v20 = ((com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback)v5).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v10),((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.Node)v19));
    org.junit.Assert.assertEquals((Object)(true), v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = "H";
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = "H";
    Object v13 = 1;
    Object v14 = 1;
    Object v15 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v12),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = ((com.google.javascript.rhino.Node)v11).copyInformationFrom(((com.google.javascript.rhino.Node)v15));
    Object v17 = "H";
    Object v18 = 1;
    Object v19 = 1;
    Object v20 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v17),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()));
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v20));
    Object v21 = null;
    org.junit.Assert.assertNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = "H";
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = "H";
    Object v13 = 1;
    Object v14 = 1;
    Object v15 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v12),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
    Object v17 = new com.google.javascript.jscomp.Compiler();
    Object v18 = new com.google.javascript.jscomp.Compiler();
    Object v19 = true;
    Object v20 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v17),((com.google.javascript.jscomp.NodeTraversal.Callback)v20));
    Object v22 = "H";
    Object v23 = 1;
    Object v24 = 1;
    Object v25 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v22),(((java.lang.Integer)v23).intValue()),(((java.lang.Integer)v24).intValue()));
    Object v26 = "H";
    Object v27 = 1;
    Object v28 = 1;
    Object v29 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v26),(((java.lang.Integer)v27).intValue()),(((java.lang.Integer)v28).intValue()));
    Object v30 = ((com.google.javascript.rhino.Node)v25).checkTreeTypeAwareEqualsSilent(((com.google.javascript.rhino.Node)v29));
    Object v31 = "H";
    Object v32 = 1;
    Object v33 = 1;
    Object v34 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v31),(((java.lang.Integer)v32).intValue()),(((java.lang.Integer)v33).intValue()));
    Object v35 = 1;
    Object v36 = true;
    ((com.google.javascript.rhino.Node)v34).putBooleanProp((((java.lang.Integer)v35).intValue()),(((java.lang.Boolean)v36).booleanValue()));
    Object v37 = null;
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v21),((com.google.javascript.rhino.Node)v25),((com.google.javascript.rhino.Node)v34));
    Object v38 = null;
    org.junit.Assert.assertNull(v38);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = "H";
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = ((com.google.javascript.rhino.Node)v11).getAncestors();
    Object v13 = "H";
    Object v14 = 1;
    Object v15 = 1;
    Object v16 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v13),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v16));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = "H";
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = "H";
    Object v13 = 1;
    Object v14 = 1;
    Object v15 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v12),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    ((com.google.javascript.rhino.Node)v11).addChildrenToBack(((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
    Object v17 = "H";
    Object v18 = 1;
    Object v19 = 1;
    Object v20 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v17),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()));
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v20));
    Object v21 = null;
    org.junit.Assert.assertNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "7";
    Object v2 = -39;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = true;
    Object v9 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.NodeTraversal.Callback)v9));
    Object v11 = "H";
    Object v12 = 1;
    Object v13 = 1;
    Object v14 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = "H";
    Object v16 = 1;
    Object v17 = 1;
    Object v18 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v15),(((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()));
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v5).visit(((com.google.javascript.jscomp.NodeTraversal)v10),((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.Node)v18));
    Object v19 = null;
    Object v20 = new com.google.javascript.jscomp.Compiler();
    Object v21 = new com.google.javascript.jscomp.Compiler();
    Object v22 = true;
    Object v23 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v21),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v20),((com.google.javascript.jscomp.NodeTraversal.Callback)v23));
    Object v25 = "H";
    Object v26 = 1;
    Object v27 = 1;
    Object v28 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v25),(((java.lang.Integer)v26).intValue()),(((java.lang.Integer)v27).intValue()));
    Object v29 = ((com.google.javascript.rhino.Node)v28).getJsDocBuilderForNode();
    Object v30 = "H";
    Object v31 = 1;
    Object v32 = 1;
    Object v33 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v30),(((java.lang.Integer)v31).intValue()),(((java.lang.Integer)v32).intValue()));
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v5).visit(((com.google.javascript.jscomp.NodeTraversal)v24),((com.google.javascript.rhino.Node)v28),((com.google.javascript.rhino.Node)v33));
    Object v34 = null;
    org.junit.Assert.assertNull(v34);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = "H";
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = 1;
    Object v13 = false;
    ((com.google.javascript.rhino.Node)v11).putBooleanProp((((java.lang.Integer)v12).intValue()),(((java.lang.Boolean)v13).booleanValue()));
    Object v14 = null;
    Object v15 = "H";
    Object v16 = 1;
    Object v17 = 1;
    Object v18 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v15),(((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()));
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v18));
    Object v19 = null;
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = "H";
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = "";
    Object v13 = "";
    Object v14 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = new java.lang.String[]{"Object",""};
    Object v16 = ((com.google.javascript.jscomp.NodeTraversal)v7).makeError(((com.google.javascript.rhino.Node)v11),((com.google.javascript.jscomp.DiagnosticType)v14),((java.lang.String[])v15));
    Object v17 = "H";
    Object v18 = 1;
    Object v19 = 1;
    Object v20 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v17),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()));
    Object v21 = "H";
    Object v22 = 1;
    Object v23 = 1;
    Object v24 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v21),(((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()));
    Object v25 = ((com.google.javascript.rhino.Node)v24).getQualifiedName();
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.Node)v24));
    Object v26 = null;
    org.junit.Assert.assertNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = ((com.google.javascript.jscomp.NodeTraversal)v7).getEnclosingFunction();
    Object v9 = "H";
    Object v10 = 1;
    Object v11 = 1;
    Object v12 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = "H";
    Object v14 = 1;
    Object v15 = 1;
    Object v16 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v13),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v16));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "H";
    Object v4 = 1;
    Object v5 = 1;
    Object v6 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = ((com.google.javascript.rhino.Node)v6).children();
    Object v8 = "H";
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v2).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = "H";
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = java.util.Set.of();
    ((com.google.javascript.rhino.Node)v11).setDirectives(((java.util.Set)v12));
    Object v13 = null;
    Object v14 = "H";
    Object v15 = 1;
    Object v16 = 1;
    Object v17 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v14),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v17));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = "H";
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = "H";
    Object v13 = 1;
    Object v14 = 1;
    Object v15 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v12),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = "H";
    Object v17 = 1;
    Object v18 = 1;
    Object v19 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v16),(((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()));
    Object v20 = "H";
    Object v21 = 1;
    Object v22 = 1;
    Object v23 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v20),(((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()));
    ((com.google.javascript.rhino.Node)v15).addChildAfter(((com.google.javascript.rhino.Node)v19),((com.google.javascript.rhino.Node)v23));
    Object v24 = null;
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v15));
    Object v25 = null;
    org.junit.Assert.assertNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = "H";
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = "H";
    Object v13 = 1;
    Object v14 = 1;
    Object v15 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v12),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
    Object v17 = new com.google.javascript.jscomp.Compiler();
    Object v18 = new com.google.javascript.jscomp.Compiler();
    Object v19 = true;
    Object v20 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v17),((com.google.javascript.jscomp.NodeTraversal.Callback)v20));
    Object v22 = "H";
    Object v23 = 1;
    Object v24 = 1;
    Object v25 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v22),(((java.lang.Integer)v23).intValue()),(((java.lang.Integer)v24).intValue()));
    Object v26 = "H";
    Object v27 = 1;
    Object v28 = 1;
    Object v29 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v26),(((java.lang.Integer)v27).intValue()),(((java.lang.Integer)v28).intValue()));
    ((com.google.javascript.rhino.Node)v25).addChildToBack(((com.google.javascript.rhino.Node)v29));
    Object v30 = null;
    Object v31 = "H";
    Object v32 = 1;
    Object v33 = 1;
    Object v34 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v31),(((java.lang.Integer)v32).intValue()),(((java.lang.Integer)v33).intValue()));
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v21),((com.google.javascript.rhino.Node)v25),((com.google.javascript.rhino.Node)v34));
    Object v35 = null;
    org.junit.Assert.assertNull(v35);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "7";
    Object v2 = -39;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = true;
    Object v9 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.NodeTraversal.Callback)v9));
    Object v11 = "H";
    Object v12 = 1;
    Object v13 = 1;
    Object v14 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = "H";
    Object v16 = 1;
    Object v17 = 1;
    Object v18 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v15),(((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()));
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v5).visit(((com.google.javascript.jscomp.NodeTraversal)v10),((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.Node)v18));
    Object v19 = null;
    Object v20 = new com.google.javascript.jscomp.Compiler();
    Object v21 = new com.google.javascript.jscomp.Compiler();
    Object v22 = true;
    Object v23 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v21),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v20),((com.google.javascript.jscomp.NodeTraversal.Callback)v23));
    Object v25 = "H";
    Object v26 = 1;
    Object v27 = 1;
    Object v28 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v25),(((java.lang.Integer)v26).intValue()),(((java.lang.Integer)v27).intValue()));
    Object v29 = "H";
    Object v30 = 1;
    Object v31 = 1;
    Object v32 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v29),(((java.lang.Integer)v30).intValue()),(((java.lang.Integer)v31).intValue()));
    Object v33 = ((com.google.javascript.rhino.Node)v28).checkTreeEqualsSilent(((com.google.javascript.rhino.Node)v32));
    Object v34 = "H";
    Object v35 = 1;
    Object v36 = 1;
    Object v37 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v34),(((java.lang.Integer)v35).intValue()),(((java.lang.Integer)v36).intValue()));
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v5).visit(((com.google.javascript.jscomp.NodeTraversal)v24),((com.google.javascript.rhino.Node)v28),((com.google.javascript.rhino.Node)v37));
    Object v38 = null;
    org.junit.Assert.assertNull(v38);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = "H";
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v13 = "";
    Object v14 = "";
    Object v15 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = new java.lang.String[]{};
    Object v17 = ((com.google.javascript.jscomp.NodeTraversal)v7).makeError(((com.google.javascript.rhino.Node)v11),((com.google.javascript.jscomp.CheckLevel)v12),((com.google.javascript.jscomp.DiagnosticType)v15),((java.lang.String[])v16));
    Object v18 = "H";
    Object v19 = 1;
    Object v20 = 1;
    Object v21 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
    Object v22 = "H";
    Object v23 = 1;
    Object v24 = 1;
    Object v25 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v22),(((java.lang.Integer)v23).intValue()),(((java.lang.Integer)v24).intValue()));
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v21),((com.google.javascript.rhino.Node)v25));
    Object v26 = null;
    org.junit.Assert.assertNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = "H";
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = "H";
    Object v13 = 1;
    Object v14 = 1;
    Object v15 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v12),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
    Object v17 = new com.google.javascript.jscomp.Compiler();
    Object v18 = new com.google.javascript.jscomp.Compiler();
    Object v19 = true;
    Object v20 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v17),((com.google.javascript.jscomp.NodeTraversal.Callback)v20));
    Object v22 = ((com.google.javascript.jscomp.NodeTraversal)v21).hasScope();
    Object v23 = "H";
    Object v24 = 1;
    Object v25 = 1;
    Object v26 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v23),(((java.lang.Integer)v24).intValue()),(((java.lang.Integer)v25).intValue()));
    Object v27 = "H";
    Object v28 = 1;
    Object v29 = 1;
    Object v30 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v27),(((java.lang.Integer)v28).intValue()),(((java.lang.Integer)v29).intValue()));
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v21),((com.google.javascript.rhino.Node)v26),((com.google.javascript.rhino.Node)v30));
    Object v31 = null;
    org.junit.Assert.assertNull(v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = "H";
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = "H";
    Object v13 = 1;
    Object v14 = 1;
    Object v15 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v12),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = ((com.google.javascript.rhino.Node)v15).isQualifiedName();
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v15));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = "H";
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = "H";
    Object v13 = 1;
    Object v14 = 1;
    Object v15 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v12),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = "J";
    ((com.google.javascript.rhino.Node)v15).addSuppression(((java.lang.String)v16));
    Object v17 = null;
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v15));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = "H";
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v13 = "";
    Object v14 = "";
    Object v15 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = new java.lang.String[]{};
    Object v17 = ((com.google.javascript.jscomp.NodeTraversal)v7).makeError(((com.google.javascript.rhino.Node)v11),((com.google.javascript.jscomp.CheckLevel)v12),((com.google.javascript.jscomp.DiagnosticType)v15),((java.lang.String[])v16));
    Object v18 = "H";
    Object v19 = 1;
    Object v20 = 1;
    Object v21 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
    Object v22 = -47;
    ((com.google.javascript.rhino.Node)v21).setCharno((((java.lang.Integer)v22).intValue()));
    Object v23 = null;
    Object v24 = "H";
    Object v25 = 1;
    Object v26 = 1;
    Object v27 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v24),(((java.lang.Integer)v25).intValue()),(((java.lang.Integer)v26).intValue()));
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v21),((com.google.javascript.rhino.Node)v27));
    Object v28 = null;
    org.junit.Assert.assertNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = "H";
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = "H";
    Object v13 = 1;
    Object v14 = 1;
    Object v15 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v12),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = -41;
    ((com.google.javascript.rhino.Node)v15).setType((((java.lang.Integer)v16).intValue()));
    Object v17 = null;
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v15));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = "H";
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = "H";
    Object v13 = 1;
    Object v14 = 1;
    Object v15 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v12),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = "H";
    Object v17 = 1;
    Object v18 = 1;
    Object v19 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v16),(((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()));
    Object v20 = ((com.google.javascript.rhino.Node)v15).checkTreeTypeAwareEqualsSilent(((com.google.javascript.rhino.Node)v19));
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v15));
    Object v21 = null;
    org.junit.Assert.assertNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "H";
    Object v4 = 1;
    Object v5 = 1;
    Object v6 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = "H";
    Object v8 = 1;
    Object v9 = 1;
    Object v10 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = ((com.google.javascript.rhino.Node)v10).cloneNode();
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v2).process(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v10));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = ((com.google.javascript.jscomp.NodeTraversal)v7).hasScope();
    Object v9 = "H";
    Object v10 = 1;
    Object v11 = 1;
    Object v12 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = "H";
    Object v14 = 1;
    Object v15 = 1;
    Object v16 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v13),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v16));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = "H";
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = 0;
    Object v13 = ((com.google.javascript.rhino.Node)v11).getAncestor((((java.lang.Integer)v12).intValue()));
    Object v14 = "H";
    Object v15 = 1;
    Object v16 = 1;
    Object v17 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v14),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v17));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = "H";
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = 21;
    Object v13 = ((com.google.javascript.rhino.Node)v11).getAncestor((((java.lang.Integer)v12).intValue()));
    Object v14 = "H";
    Object v15 = 1;
    Object v16 = 1;
    Object v17 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v14),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = "H";
    Object v19 = 1;
    Object v20 = 1;
    Object v21 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
    Object v22 = ((com.google.javascript.rhino.Node)v17).checkTreeEqualsSilent(((com.google.javascript.rhino.Node)v21));
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v17));
    Object v23 = null;
    org.junit.Assert.assertNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "7";
    Object v2 = -39;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = true;
    Object v9 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.NodeTraversal.Callback)v9));
    Object v11 = "H";
    Object v12 = 1;
    Object v13 = 1;
    Object v14 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = "H";
    Object v16 = 1;
    Object v17 = 1;
    Object v18 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v15),(((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()));
    Object v19 = ((com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback)v5).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v10),((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.Node)v18));
    org.junit.Assert.assertEquals((Object)(true), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "7";
    Object v2 = -39;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = true;
    Object v9 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.NodeTraversal.Callback)v9));
    Object v11 = "H";
    Object v12 = 1;
    Object v13 = 1;
    Object v14 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = "H";
    Object v16 = 1;
    Object v17 = 1;
    Object v18 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v15),(((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()));
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v5).visit(((com.google.javascript.jscomp.NodeTraversal)v10),((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.Node)v18));
    Object v19 = null;
    Object v20 = "H";
    Object v21 = 1;
    Object v22 = 1;
    Object v23 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v20),(((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()));
    Object v24 = ((com.google.javascript.rhino.Node)v23).getAncestors();
    Object v25 = "H";
    Object v26 = 1;
    Object v27 = 1;
    Object v28 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v25),(((java.lang.Integer)v26).intValue()),(((java.lang.Integer)v27).intValue()));
    Object v29 = ((com.google.javascript.rhino.Node)v28).removeChildren();
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v5).process(((com.google.javascript.rhino.Node)v23),((com.google.javascript.rhino.Node)v28));
    Object v30 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = "H";
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = "H";
    Object v13 = 1;
    Object v14 = 1;
    Object v15 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v12),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = ((com.google.javascript.rhino.Node)v11).copyInformationFrom(((com.google.javascript.rhino.Node)v15));
    Object v17 = "H";
    Object v18 = 1;
    Object v19 = 1;
    Object v20 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v17),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()));
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v20));
    Object v21 = null;
    org.junit.Assert.assertNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = "7";
    Object v2 = -39;
    Object v3 = ((com.google.javascript.jscomp.SourceExcerptProvider)v0).getSourceRegion(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = false;
    Object v5 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.google.javascript.jscomp.Compiler();
    Object v7 = new com.google.javascript.jscomp.Compiler();
    Object v8 = true;
    Object v9 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.NodeTraversal.Callback)v9));
    Object v11 = "H";
    Object v12 = 1;
    Object v13 = 1;
    Object v14 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = ((com.google.javascript.rhino.Node)v14).removeFirstChild();
    Object v16 = "H";
    Object v17 = 1;
    Object v18 = 1;
    Object v19 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v16),(((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()));
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v5).visit(((com.google.javascript.jscomp.NodeTraversal)v10),((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.Node)v19));
    Object v20 = null;
    org.junit.Assert.assertNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = "H";
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = "H";
    Object v13 = 1;
    Object v14 = 1;
    Object v15 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v12),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
    Object v17 = new com.google.javascript.jscomp.Compiler();
    Object v18 = new com.google.javascript.jscomp.Compiler();
    Object v19 = true;
    Object v20 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v17),((com.google.javascript.jscomp.NodeTraversal.Callback)v20));
    Object v22 = ((com.google.javascript.jscomp.NodeTraversal)v21).hasScope();
    Object v23 = "H";
    Object v24 = 1;
    Object v25 = 1;
    Object v26 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v23),(((java.lang.Integer)v24).intValue()),(((java.lang.Integer)v25).intValue()));
    Object v27 = "H";
    Object v28 = 1;
    Object v29 = 1;
    Object v30 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v27),(((java.lang.Integer)v28).intValue()),(((java.lang.Integer)v29).intValue()));
    Object v31 = false;
    ((com.google.javascript.rhino.Node)v30).setWasEmptyNode((((java.lang.Boolean)v31).booleanValue()));
    Object v32 = null;
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v21),((com.google.javascript.rhino.Node)v26),((com.google.javascript.rhino.Node)v30));
    Object v33 = null;
    org.junit.Assert.assertNull(v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = "H";
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = "H";
    Object v13 = 1;
    Object v14 = 1;
    Object v15 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v12),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
    Object v17 = new com.google.javascript.jscomp.Compiler();
    Object v18 = new com.google.javascript.jscomp.Compiler();
    Object v19 = true;
    Object v20 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v17),((com.google.javascript.jscomp.NodeTraversal.Callback)v20));
    Object v22 = "H";
    Object v23 = 1;
    Object v24 = 1;
    Object v25 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v22),(((java.lang.Integer)v23).intValue()),(((java.lang.Integer)v24).intValue()));
    Object v26 = "H";
    Object v27 = 1;
    Object v28 = 1;
    Object v29 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v26),(((java.lang.Integer)v27).intValue()),(((java.lang.Integer)v28).intValue()));
    Object v30 = ((com.google.javascript.rhino.Node)v29).cloneTree();
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v21),((com.google.javascript.rhino.Node)v25),((com.google.javascript.rhino.Node)v29));
    Object v31 = null;
    org.junit.Assert.assertNull(v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = "H";
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = "H";
    Object v13 = 1;
    Object v14 = 1;
    Object v15 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v12),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
    Object v17 = new com.google.javascript.jscomp.Compiler();
    Object v18 = new com.google.javascript.jscomp.Compiler();
    Object v19 = true;
    Object v20 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v17),((com.google.javascript.jscomp.NodeTraversal.Callback)v20));
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v2).enterScope(((com.google.javascript.jscomp.NodeTraversal)v21));
    Object v22 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = ((com.google.javascript.jscomp.NodeTraversal)v7).getScope();
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v2).enterScope(((com.google.javascript.jscomp.NodeTraversal)v7));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = "H";
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = -22;
    ((com.google.javascript.rhino.Node)v11).setCharno((((java.lang.Integer)v12).intValue()));
    Object v13 = null;
    Object v14 = "H";
    Object v15 = 1;
    Object v16 = 1;
    Object v17 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v14),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v17));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = "H";
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = "H";
    Object v13 = 1;
    Object v14 = 1;
    Object v15 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v12),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
    Object v17 = "H";
    Object v18 = 1;
    Object v19 = 1;
    Object v20 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v17),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()));
    Object v21 = "H";
    Object v22 = 1;
    Object v23 = 1;
    Object v24 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v21),(((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()));
    Object v25 = ((com.google.javascript.rhino.Node)v20).checkTreeTypeAwareEqualsSilent(((com.google.javascript.rhino.Node)v24));
    Object v26 = "H";
    Object v27 = 1;
    Object v28 = 1;
    Object v29 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v26),(((java.lang.Integer)v27).intValue()),(((java.lang.Integer)v28).intValue()));
    Object v30 = "H";
    Object v31 = 1;
    Object v32 = 1;
    Object v33 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v30),(((java.lang.Integer)v31).intValue()),(((java.lang.Integer)v32).intValue()));
    ((com.google.javascript.rhino.Node)v29).addChildToFront(((com.google.javascript.rhino.Node)v33));
    Object v34 = null;
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v2).process(((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.Node)v29));
    Object v35 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = "H";
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = "H";
    Object v13 = 1;
    Object v14 = 1;
    Object v15 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v12),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = ((com.google.javascript.rhino.Node)v11).checkTreeEquals(((com.google.javascript.rhino.Node)v15));
    Object v17 = "H";
    Object v18 = 1;
    Object v19 = 1;
    Object v20 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v17),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()));
    Object v21 = ((com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback)v2).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v20));
    org.junit.Assert.assertEquals((Object)(true), v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = "H";
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v13 = "";
    Object v14 = "";
    Object v15 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = new java.lang.String[]{"","",""};
    Object v17 = ((com.google.javascript.jscomp.NodeTraversal)v7).makeError(((com.google.javascript.rhino.Node)v11),((com.google.javascript.jscomp.CheckLevel)v12),((com.google.javascript.jscomp.DiagnosticType)v15),((java.lang.String[])v16));
    Object v18 = "H";
    Object v19 = 1;
    Object v20 = 1;
    Object v21 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
    Object v22 = "H";
    Object v23 = 1;
    Object v24 = 1;
    Object v25 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v22),(((java.lang.Integer)v23).intValue()),(((java.lang.Integer)v24).intValue()));
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v21),((com.google.javascript.rhino.Node)v25));
    Object v26 = null;
    org.junit.Assert.assertNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = "H";
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = "H";
    Object v13 = 1;
    Object v14 = 1;
    Object v15 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v12),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
    Object v17 = new com.google.javascript.jscomp.Compiler();
    Object v18 = new com.google.javascript.jscomp.Compiler();
    Object v19 = true;
    Object v20 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v17),((com.google.javascript.jscomp.NodeTraversal.Callback)v20));
    Object v22 = "H";
    Object v23 = 1;
    Object v24 = 1;
    Object v25 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v22),(((java.lang.Integer)v23).intValue()),(((java.lang.Integer)v24).intValue()));
    Object v26 = ((com.google.javascript.rhino.Node)v25).getJsDocBuilderForNode();
    Object v27 = "H";
    Object v28 = 1;
    Object v29 = 1;
    Object v30 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v27),(((java.lang.Integer)v28).intValue()),(((java.lang.Integer)v29).intValue()));
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v21),((com.google.javascript.rhino.Node)v25),((com.google.javascript.rhino.Node)v30));
    Object v31 = null;
    org.junit.Assert.assertNull(v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = true;
    Object v2 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = "H";
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v13 = "";
    Object v14 = "";
    Object v15 = com.google.javascript.jscomp.DiagnosticType.disabled(((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = new java.lang.String[]{};
    Object v17 = ((com.google.javascript.jscomp.NodeTraversal)v7).makeError(((com.google.javascript.rhino.Node)v11),((com.google.javascript.jscomp.CheckLevel)v12),((com.google.javascript.jscomp.DiagnosticType)v15),((java.lang.String[])v16));
    Object v18 = "H";
    Object v19 = 1;
    Object v20 = 1;
    Object v21 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
    Object v22 = "H";
    Object v23 = 1;
    Object v24 = 1;
    Object v25 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v22),(((java.lang.Integer)v23).intValue()),(((java.lang.Integer)v24).intValue()));
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v21),((com.google.javascript.rhino.Node)v25));
    Object v26 = null;
    org.junit.Assert.assertNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = ((com.google.javascript.jscomp.NodeTraversal)v7).hasScope();
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v2).exitScope(((com.google.javascript.jscomp.NodeTraversal)v7));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.Compiler();
    Object v1 = false;
    Object v2 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler();
    Object v4 = new com.google.javascript.jscomp.Compiler();
    Object v5 = true;
    Object v6 = new com.google.javascript.jscomp.UnreachableCodeElimination(((com.google.javascript.jscomp.AbstractCompiler)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = ((com.google.javascript.jscomp.NodeTraversal)v7).hasScope();
    Object v9 = "H";
    Object v10 = 1;
    Object v11 = 1;
    Object v12 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = 11;
    ((com.google.javascript.rhino.Node)v12).setType((((java.lang.Integer)v13).intValue()));
    Object v14 = null;
    Object v15 = "H";
    Object v16 = 1;
    Object v17 = 1;
    Object v18 = new com.google.javascript.rhino.FunctionNode(((java.lang.String)v15),(((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()));
    ((com.google.javascript.jscomp.UnreachableCodeElimination)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v18));
    Object v19 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }
}
