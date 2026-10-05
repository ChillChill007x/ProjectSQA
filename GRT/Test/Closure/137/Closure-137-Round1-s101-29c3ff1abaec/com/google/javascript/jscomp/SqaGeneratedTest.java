package com.google.javascript.jscomp;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v1 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v0));
    Object v2 = new java.io.ByteArrayOutputStream();
    Object v3 = false;
    Object v4 = new java.io.PrintStream(((java.io.OutputStream)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v4));
    Object v6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v7 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = 54.84792226060818D;
    Object v10 = 0;
    Object v11 = 1;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = 54.84792226060818D;
    Object v14 = 0;
    Object v15 = 1;
    Object v16 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v13).doubleValue()),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v1).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v16));
    org.junit.Assert.assertEquals((Object)(true), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v1 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v0));
    Object v2 = new java.io.ByteArrayOutputStream();
    Object v3 = false;
    Object v4 = new java.io.PrintStream(((java.io.OutputStream)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v4));
    Object v6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v7 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = ((com.google.javascript.jscomp.NodeTraversal)v8).getEnclosingFunction();
    ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v1).enterScope(((com.google.javascript.jscomp.NodeTraversal)v8));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v1 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v0));
    Object v2 = new java.io.ByteArrayOutputStream();
    Object v3 = false;
    Object v4 = new java.io.PrintStream(((java.io.OutputStream)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v4));
    Object v6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v7 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = 54.84792226060818D;
    Object v10 = 0;
    Object v11 = 1;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = 54.84792226060818D;
    Object v14 = 0;
    Object v15 = 1;
    Object v16 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v13).doubleValue()),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v1).visit(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v16));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v1 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v0));
    Object v2 = new java.io.ByteArrayOutputStream();
    Object v3 = false;
    Object v4 = new java.io.PrintStream(((java.io.OutputStream)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v4));
    Object v6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v7 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = 54.84792226060818D;
    Object v10 = 0;
    Object v11 = 1;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = 54.84792226060818D;
    Object v14 = 0;
    Object v15 = 1;
    Object v16 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v13).doubleValue()),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = false;
    ((com.google.javascript.rhino.Node)v16).setOptionalArg((((java.lang.Boolean)v17).booleanValue()));
    Object v18 = null;
    Object v19 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v1).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v16));
    org.junit.Assert.assertEquals((Object)(true), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v1 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v0));
    Object v2 = new java.io.ByteArrayOutputStream();
    Object v3 = false;
    Object v4 = new java.io.PrintStream(((java.io.OutputStream)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v4));
    Object v6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v7 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = 54.84792226060818D;
    Object v10 = 0;
    Object v11 = 1;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = "parseIYnputs";
    Object v14 = "t";
    Object v15 = com.google.javascript.jscomp.DiagnosticType.warning(((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = new java.lang.String[]{"runCuatomPasses",",8 "};
    ((com.google.javascript.jscomp.NodeTraversal)v8).report(((com.google.javascript.rhino.Node)v12),((com.google.javascript.jscomp.DiagnosticType)v15),((java.lang.String[])v16));
    Object v17 = null;
    ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v1).exitScope(((com.google.javascript.jscomp.NodeTraversal)v8));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v1 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v0));
    Object v2 = new java.io.ByteArrayOutputStream();
    Object v3 = false;
    Object v4 = new java.io.PrintStream(((java.io.OutputStream)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v4));
    Object v6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v7 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = 54.84792226060818D;
    Object v10 = 0;
    Object v11 = 1;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = 54.84792226060818D;
    Object v14 = 0;
    Object v15 = 1;
    Object v16 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v13).doubleValue()),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v1).visit(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v16));
    Object v17 = null;
    Object v18 = new java.io.ByteArrayOutputStream();
    Object v19 = false;
    Object v20 = new java.io.PrintStream(((java.io.OutputStream)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v20));
    Object v22 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v23 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v22));
    Object v24 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v21),((com.google.javascript.jscomp.NodeTraversal.Callback)v23));
    ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v1).enterScope(((com.google.javascript.jscomp.NodeTraversal)v24));
    Object v25 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v1 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v1 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v0));
    Object v2 = new java.io.ByteArrayOutputStream();
    Object v3 = false;
    Object v4 = new java.io.PrintStream(((java.io.OutputStream)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v4));
    Object v6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v7 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = 54.84792226060818D;
    Object v10 = 0;
    Object v11 = 1;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = 54.84792226060818D;
    Object v14 = 0;
    Object v15 = 1;
    Object v16 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v13).doubleValue()),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v1).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v16));
    Object v18 = new java.io.ByteArrayOutputStream();
    Object v19 = false;
    Object v20 = new java.io.PrintStream(((java.io.OutputStream)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v20));
    Object v22 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v23 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v22));
    Object v24 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v21),((com.google.javascript.jscomp.NodeTraversal.Callback)v23));
    Object v25 = 54.84792226060818D;
    Object v26 = 0;
    Object v27 = 1;
    Object v28 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v25).doubleValue()),(((java.lang.Integer)v26).intValue()),(((java.lang.Integer)v27).intValue()));
    Object v29 = 54.84792226060818D;
    Object v30 = 0;
    Object v31 = 1;
    Object v32 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v29).doubleValue()),(((java.lang.Integer)v30).intValue()),(((java.lang.Integer)v31).intValue()));
    Object v33 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v1).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v24),((com.google.javascript.rhino.Node)v28),((com.google.javascript.rhino.Node)v32));
    org.junit.Assert.assertEquals((Object)(true), v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new java.io.ByteArrayOutputStream();
    Object v1 = false;
    Object v2 = new java.io.PrintStream(((java.io.OutputStream)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = com.google.javascript.jscomp.MakeDeclaredNamesUnique.getContextualRenameInverter(((com.google.javascript.jscomp.AbstractCompiler)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique();
    Object v1 = new java.io.ByteArrayOutputStream();
    Object v2 = false;
    Object v3 = new java.io.PrintStream(((java.io.OutputStream)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v3));
    Object v5 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v5));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = 54.84792226060818D;
    Object v9 = 0;
    Object v10 = 1;
    Object v11 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = 54.84792226060818D;
    Object v13 = 0;
    Object v14 = 1;
    Object v15 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v12).doubleValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v0).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new java.io.ByteArrayOutputStream();
    Object v1 = false;
    Object v2 = new java.io.PrintStream(((java.io.OutputStream)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getTypeRegistry();
    Object v5 = com.google.javascript.jscomp.MakeDeclaredNamesUnique.getContextualRenameInverter(((com.google.javascript.jscomp.AbstractCompiler)v3));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v1 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v0));
    Object v2 = new java.io.ByteArrayOutputStream();
    Object v3 = false;
    Object v4 = new java.io.PrintStream(((java.io.OutputStream)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v4));
    Object v6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v7 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = 54.84792226060818D;
    Object v10 = 0;
    Object v11 = 1;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = 0;
    Object v14 = false;
    ((com.google.javascript.rhino.Node)v12).putBooleanProp((((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v15 = null;
    Object v16 = 54.84792226060818D;
    Object v17 = 0;
    Object v18 = 1;
    Object v19 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v16).doubleValue()),(((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()));
    Object v20 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v1).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v19));
    org.junit.Assert.assertEquals((Object)(true), v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique();
    Object v1 = new java.io.ByteArrayOutputStream();
    Object v2 = false;
    Object v3 = new java.io.PrintStream(((java.io.OutputStream)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v3));
    Object v5 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v5));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v0).enterScope(((com.google.javascript.jscomp.NodeTraversal)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v1 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v0));
    Object v2 = new java.io.ByteArrayOutputStream();
    Object v3 = false;
    Object v4 = new java.io.PrintStream(((java.io.OutputStream)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v4));
    Object v6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v7 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = ((com.google.javascript.jscomp.NodeTraversal)v8).getEnclosingFunction();
    Object v10 = 54.84792226060818D;
    Object v11 = 0;
    Object v12 = 1;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = ((com.google.javascript.rhino.Node)v13).removeChildren();
    Object v15 = 54.84792226060818D;
    Object v16 = 0;
    Object v17 = 1;
    Object v18 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v15).doubleValue()),(((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()));
    Object v19 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v1).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v18));
    org.junit.Assert.assertEquals((Object)(true), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v1 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v0));
    Object v2 = new java.io.ByteArrayOutputStream();
    Object v3 = false;
    Object v4 = new java.io.PrintStream(((java.io.OutputStream)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v4));
    Object v6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v7 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = 54.84792226060818D;
    Object v10 = 0;
    Object v11 = 1;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    ((com.google.javascript.jscomp.NodeTraversal)v8).traverse(((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
    ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v1).exitScope(((com.google.javascript.jscomp.NodeTraversal)v8));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique();
    Object v1 = new java.io.ByteArrayOutputStream();
    Object v2 = false;
    Object v3 = new java.io.PrintStream(((java.io.OutputStream)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v3));
    Object v5 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v5));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = 54.84792226060818D;
    Object v9 = 0;
    Object v10 = 1;
    Object v11 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = 54.84792226060818D;
    Object v13 = 0;
    Object v14 = 1;
    Object v15 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v12).doubleValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v0).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
    Object v17 = new java.io.ByteArrayOutputStream();
    Object v18 = false;
    Object v19 = new java.io.PrintStream(((java.io.OutputStream)v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v19));
    Object v21 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v22 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v21));
    Object v23 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v20),((com.google.javascript.jscomp.NodeTraversal.Callback)v22));
    Object v24 = ((com.google.javascript.jscomp.NodeTraversal)v23).getEnclosingFunction();
    Object v25 = 54.84792226060818D;
    Object v26 = 0;
    Object v27 = 1;
    Object v28 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v25).doubleValue()),(((java.lang.Integer)v26).intValue()),(((java.lang.Integer)v27).intValue()));
    Object v29 = 54.84792226060818D;
    Object v30 = 0;
    Object v31 = 1;
    Object v32 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v29).doubleValue()),(((java.lang.Integer)v30).intValue()),(((java.lang.Integer)v31).intValue()));
    Object v33 = ((com.google.javascript.rhino.Node)v32).getJsDocBuilderForNode();
    ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v0).visit(((com.google.javascript.jscomp.NodeTraversal)v23),((com.google.javascript.rhino.Node)v28),((com.google.javascript.rhino.Node)v32));
    Object v34 = null;
    org.junit.Assert.assertNull(v34);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v1 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v0));
    Object v2 = new java.io.ByteArrayOutputStream();
    Object v3 = false;
    Object v4 = new java.io.PrintStream(((java.io.OutputStream)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v4));
    Object v6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v7 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = new com.google.javascript.rhino.Node[]{};
    ((com.google.javascript.jscomp.NodeTraversal)v8).traverseRoots(((com.google.javascript.rhino.Node[])v9));
    Object v10 = null;
    ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v1).exitScope(((com.google.javascript.jscomp.NodeTraversal)v8));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v1 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v0));
    Object v2 = new java.io.ByteArrayOutputStream();
    Object v3 = false;
    Object v4 = new java.io.PrintStream(((java.io.OutputStream)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v4));
    Object v6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v7 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = 54.84792226060818D;
    Object v10 = 0;
    Object v11 = 1;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = 54.84792226060818D;
    Object v14 = 0;
    Object v15 = 1;
    Object v16 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v13).doubleValue()),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v1).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v16));
    Object v18 = new java.io.ByteArrayOutputStream();
    Object v19 = false;
    Object v20 = new java.io.PrintStream(((java.io.OutputStream)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v20));
    Object v22 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v23 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v22));
    Object v24 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v21),((com.google.javascript.jscomp.NodeTraversal.Callback)v23));
    Object v25 = 54.84792226060818D;
    Object v26 = 0;
    Object v27 = 1;
    Object v28 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v25).doubleValue()),(((java.lang.Integer)v26).intValue()),(((java.lang.Integer)v27).intValue()));
    Object v29 = 54.84792226060818D;
    Object v30 = 0;
    Object v31 = 1;
    Object v32 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v29).doubleValue()),(((java.lang.Integer)v30).intValue()),(((java.lang.Integer)v31).intValue()));
    ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v1).visit(((com.google.javascript.jscomp.NodeTraversal)v24),((com.google.javascript.rhino.Node)v28),((com.google.javascript.rhino.Node)v32));
    Object v33 = null;
    org.junit.Assert.assertNull(v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique();
    Object v1 = new java.io.ByteArrayOutputStream();
    Object v2 = false;
    Object v3 = new java.io.PrintStream(((java.io.OutputStream)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v3));
    Object v5 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v5));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = 54.84792226060818D;
    Object v9 = 0;
    Object v10 = 1;
    Object v11 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = 54.84792226060818D;
    Object v13 = 0;
    Object v14 = 1;
    Object v15 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v12).doubleValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    ((com.google.javascript.rhino.Node)v11).copyInformationFromForTree(((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
    Object v17 = 54.84792226060818D;
    Object v18 = 0;
    Object v19 = 1;
    Object v20 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v17).doubleValue()),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()));
    ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v0).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v20));
    Object v21 = null;
    org.junit.Assert.assertNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique();
    Object v1 = new java.io.ByteArrayOutputStream();
    Object v2 = false;
    Object v3 = new java.io.PrintStream(((java.io.OutputStream)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v3));
    Object v5 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v5));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = ((com.google.javascript.jscomp.NodeTraversal)v7).getScope();
    Object v9 = 54.84792226060818D;
    Object v10 = 0;
    Object v11 = 1;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = 54.84792226060818D;
    Object v14 = 0;
    Object v15 = 1;
    Object v16 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v13).doubleValue()),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = ((com.google.javascript.rhino.Node)v16).getQualifiedName();
    ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v0).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v16));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique();
    Object v1 = new java.io.ByteArrayOutputStream();
    Object v2 = false;
    Object v3 = new java.io.PrintStream(((java.io.OutputStream)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v3));
    Object v5 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v5));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v0).exitScope(((com.google.javascript.jscomp.NodeTraversal)v7));
    Object v8 = null;
    Object v9 = new java.io.ByteArrayOutputStream();
    Object v10 = false;
    Object v11 = new java.io.PrintStream(((java.io.OutputStream)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v11));
    Object v13 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v14 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v13));
    Object v15 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v12),((com.google.javascript.jscomp.NodeTraversal.Callback)v14));
    Object v16 = 54.84792226060818D;
    Object v17 = 0;
    Object v18 = 1;
    Object v19 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v16).doubleValue()),(((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()));
    Object v20 = 2;
    ((com.google.javascript.rhino.Node)v19).setCharno((((java.lang.Integer)v20).intValue()));
    Object v21 = null;
    Object v22 = 54.84792226060818D;
    Object v23 = 0;
    Object v24 = 1;
    Object v25 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v22).doubleValue()),(((java.lang.Integer)v23).intValue()),(((java.lang.Integer)v24).intValue()));
    Object v26 = 54.84792226060818D;
    Object v27 = 0;
    Object v28 = 1;
    Object v29 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v26).doubleValue()),(((java.lang.Integer)v27).intValue()),(((java.lang.Integer)v28).intValue()));
    ((com.google.javascript.rhino.Node)v25).addChildToBack(((com.google.javascript.rhino.Node)v29));
    Object v30 = null;
    ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v0).visit(((com.google.javascript.jscomp.NodeTraversal)v15),((com.google.javascript.rhino.Node)v19),((com.google.javascript.rhino.Node)v25));
    Object v31 = null;
    org.junit.Assert.assertNull(v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v1 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v0));
    Object v2 = new java.io.ByteArrayOutputStream();
    Object v3 = false;
    Object v4 = new java.io.PrintStream(((java.io.OutputStream)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v4));
    Object v6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v7 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v1).enterScope(((com.google.javascript.jscomp.NodeTraversal)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v1 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v0));
    Object v2 = new java.io.ByteArrayOutputStream();
    Object v3 = false;
    Object v4 = new java.io.PrintStream(((java.io.OutputStream)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v4));
    Object v6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v7 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = ((com.google.javascript.jscomp.NodeTraversal)v8).getEnclosingFunction();
    Object v10 = 54.84792226060818D;
    Object v11 = 0;
    Object v12 = 1;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = 54.84792226060818D;
    Object v15 = 0;
    Object v16 = 1;
    Object v17 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v14).doubleValue()),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = 0;
    ((com.google.javascript.rhino.Node)v17).setType((((java.lang.Integer)v18).intValue()));
    Object v19 = null;
    Object v20 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v1).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v17));
    org.junit.Assert.assertEquals((Object)(true), v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique();
    Object v1 = new java.io.ByteArrayOutputStream();
    Object v2 = false;
    Object v3 = new java.io.PrintStream(((java.io.OutputStream)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v3));
    Object v5 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v5));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v0).exitScope(((com.google.javascript.jscomp.NodeTraversal)v7));
    Object v8 = null;
    Object v9 = new java.io.ByteArrayOutputStream();
    Object v10 = false;
    Object v11 = new java.io.PrintStream(((java.io.OutputStream)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v11));
    Object v13 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v14 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v13));
    Object v15 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v12),((com.google.javascript.jscomp.NodeTraversal.Callback)v14));
    Object v16 = 54.84792226060818D;
    Object v17 = 0;
    Object v18 = 1;
    Object v19 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v16).doubleValue()),(((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()));
    ((com.google.javascript.jscomp.NodeTraversal)v15).traverse(((com.google.javascript.rhino.Node)v19));
    Object v20 = null;
    ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v0).enterScope(((com.google.javascript.jscomp.NodeTraversal)v15));
    Object v21 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v1 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v0));
    Object v2 = new java.io.ByteArrayOutputStream();
    Object v3 = false;
    Object v4 = new java.io.PrintStream(((java.io.OutputStream)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v4));
    Object v6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v7 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = 54.84792226060818D;
    Object v10 = 0;
    Object v11 = 1;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = "parseIYnputs";
    Object v14 = "t";
    Object v15 = com.google.javascript.jscomp.DiagnosticType.warning(((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = new java.lang.String[]{"","`"};
    ((com.google.javascript.jscomp.NodeTraversal)v8).report(((com.google.javascript.rhino.Node)v12),((com.google.javascript.jscomp.DiagnosticType)v15),((java.lang.String[])v16));
    Object v17 = null;
    Object v18 = 54.84792226060818D;
    Object v19 = 0;
    Object v20 = 1;
    Object v21 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v18).doubleValue()),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
    Object v22 = 54.84792226060818D;
    Object v23 = 0;
    Object v24 = 1;
    Object v25 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v22).doubleValue()),(((java.lang.Integer)v23).intValue()),(((java.lang.Integer)v24).intValue()));
    Object v26 = 54.84792226060818D;
    Object v27 = 0;
    Object v28 = 1;
    Object v29 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v26).doubleValue()),(((java.lang.Integer)v27).intValue()),(((java.lang.Integer)v28).intValue()));
    Object v30 = ((com.google.javascript.rhino.Node)v25).checkTreeEqualsSilent(((com.google.javascript.rhino.Node)v29));
    Object v31 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v1).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v21),((com.google.javascript.rhino.Node)v25));
    org.junit.Assert.assertEquals((Object)(true), v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique();
    Object v1 = new java.io.ByteArrayOutputStream();
    Object v2 = false;
    Object v3 = new java.io.PrintStream(((java.io.OutputStream)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v3));
    Object v5 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v5));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = 54.84792226060818D;
    Object v9 = 0;
    Object v10 = 1;
    Object v11 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = 54.84792226060818D;
    Object v13 = 0;
    Object v14 = 1;
    Object v15 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v12).doubleValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v0).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v15));
    org.junit.Assert.assertEquals((Object)(true), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v1 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v0));
    Object v2 = new java.io.ByteArrayOutputStream();
    Object v3 = false;
    Object v4 = new java.io.PrintStream(((java.io.OutputStream)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v4));
    Object v6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v7 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v1).exitScope(((com.google.javascript.jscomp.NodeTraversal)v8));
    Object v9 = null;
    Object v10 = new java.io.ByteArrayOutputStream();
    Object v11 = false;
    Object v12 = new java.io.PrintStream(((java.io.OutputStream)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v12));
    Object v14 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v15 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v14));
    Object v16 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v13),((com.google.javascript.jscomp.NodeTraversal.Callback)v15));
    ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v1).enterScope(((com.google.javascript.jscomp.NodeTraversal)v16));
    Object v17 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v1 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v0));
    Object v2 = new java.io.ByteArrayOutputStream();
    Object v3 = false;
    Object v4 = new java.io.PrintStream(((java.io.OutputStream)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v4));
    Object v6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v7 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v1).exitScope(((com.google.javascript.jscomp.NodeTraversal)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique();
    Object v1 = new java.io.ByteArrayOutputStream();
    Object v2 = false;
    Object v3 = new java.io.PrintStream(((java.io.OutputStream)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v3));
    Object v5 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v5));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = 54.84792226060818D;
    Object v9 = 0;
    Object v10 = 1;
    Object v11 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = 54.84792226060818D;
    Object v13 = 0;
    Object v14 = 1;
    Object v15 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v12).doubleValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    ((com.google.javascript.rhino.Node)v11).addChildrenToBack(((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
    Object v17 = 54.84792226060818D;
    Object v18 = 0;
    Object v19 = 1;
    Object v20 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v17).doubleValue()),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()));
    Object v21 = 54.84792226060818D;
    Object v22 = 0;
    Object v23 = 1;
    Object v24 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v21).doubleValue()),(((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()));
    Object v25 = ((com.google.javascript.rhino.Node)v20).checkTreeEquals(((com.google.javascript.rhino.Node)v24));
    ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v0).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v20));
    Object v26 = null;
    org.junit.Assert.assertNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique();
    Object v1 = new java.io.ByteArrayOutputStream();
    Object v2 = false;
    Object v3 = new java.io.PrintStream(((java.io.OutputStream)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v3));
    Object v5 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v5));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v0).exitScope(((com.google.javascript.jscomp.NodeTraversal)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique();
    Object v1 = new java.io.ByteArrayOutputStream();
    Object v2 = false;
    Object v3 = new java.io.PrintStream(((java.io.OutputStream)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v3));
    Object v5 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v5));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = 54.84792226060818D;
    Object v9 = 0;
    Object v10 = 1;
    Object v11 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = ((com.google.javascript.rhino.Node)v11).removeChildren();
    Object v13 = 54.84792226060818D;
    Object v14 = 0;
    Object v15 = 1;
    Object v16 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v13).doubleValue()),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v0).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v16));
    org.junit.Assert.assertEquals((Object)(true), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v1 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v0));
    Object v2 = new java.io.ByteArrayOutputStream();
    Object v3 = false;
    Object v4 = new java.io.PrintStream(((java.io.OutputStream)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v4));
    Object v6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v7 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = ((com.google.javascript.jscomp.NodeTraversal)v8).hasScope();
    Object v10 = 54.84792226060818D;
    Object v11 = 0;
    Object v12 = 1;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = 54.84792226060818D;
    Object v15 = 0;
    Object v16 = 1;
    Object v17 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v14).doubleValue()),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v1).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v17));
    org.junit.Assert.assertEquals((Object)(true), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique();
    Object v1 = new java.io.ByteArrayOutputStream();
    Object v2 = false;
    Object v3 = new java.io.PrintStream(((java.io.OutputStream)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v3));
    Object v5 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v5));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = ((com.google.javascript.jscomp.NodeTraversal)v7).getScope();
    Object v9 = 54.84792226060818D;
    Object v10 = 0;
    Object v11 = 1;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = 1;
    Object v14 = true;
    ((com.google.javascript.rhino.Node)v12).putBooleanProp((((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v15 = null;
    Object v16 = 54.84792226060818D;
    Object v17 = 0;
    Object v18 = 1;
    Object v19 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v16).doubleValue()),(((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()));
    Object v20 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v0).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v19));
    org.junit.Assert.assertEquals((Object)(true), v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v1 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v0));
    Object v2 = new java.io.ByteArrayOutputStream();
    Object v3 = false;
    Object v4 = new java.io.PrintStream(((java.io.OutputStream)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v4));
    Object v6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v7 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v1).exitScope(((com.google.javascript.jscomp.NodeTraversal)v8));
    Object v9 = null;
    Object v10 = new java.io.ByteArrayOutputStream();
    Object v11 = false;
    Object v12 = new java.io.PrintStream(((java.io.OutputStream)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v12));
    Object v14 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v15 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v14));
    Object v16 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v13),((com.google.javascript.jscomp.NodeTraversal.Callback)v15));
    Object v17 = 54.84792226060818D;
    Object v18 = 0;
    Object v19 = 1;
    Object v20 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v17).doubleValue()),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()));
    Object v21 = "parseIYnputs";
    Object v22 = "t";
    Object v23 = com.google.javascript.jscomp.DiagnosticType.warning(((java.lang.String)v21),((java.lang.String)v22));
    Object v24 = new java.lang.String[]{"declaration of multiple variables with shared type in","prototype","X&"};
    ((com.google.javascript.jscomp.NodeTraversal)v16).report(((com.google.javascript.rhino.Node)v20),((com.google.javascript.jscomp.DiagnosticType)v23),((java.lang.String[])v24));
    Object v25 = null;
    ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v1).enterScope(((com.google.javascript.jscomp.NodeTraversal)v16));
    Object v26 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique();
    Object v1 = new java.io.ByteArrayOutputStream();
    Object v2 = false;
    Object v3 = new java.io.PrintStream(((java.io.OutputStream)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v3));
    Object v5 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v5));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = ((com.google.javascript.jscomp.NodeTraversal)v7).getEnclosingFunction();
    ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v0).enterScope(((com.google.javascript.jscomp.NodeTraversal)v7));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique();
    Object v1 = new java.io.ByteArrayOutputStream();
    Object v2 = false;
    Object v3 = new java.io.PrintStream(((java.io.OutputStream)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v3));
    Object v5 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v5));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = 54.84792226060818D;
    Object v9 = 0;
    Object v10 = 1;
    Object v11 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = 54.84792226060818D;
    Object v13 = 0;
    Object v14 = 1;
    Object v15 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v12).doubleValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = 0;
    ((com.google.javascript.rhino.Node)v15).removeProp((((java.lang.Integer)v16).intValue()));
    Object v17 = null;
    Object v18 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v0).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v15));
    org.junit.Assert.assertEquals((Object)(true), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v1 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v0));
    Object v2 = new java.io.ByteArrayOutputStream();
    Object v3 = false;
    Object v4 = new java.io.PrintStream(((java.io.OutputStream)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v4));
    Object v6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v7 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = 54.84792226060818D;
    Object v10 = 0;
    Object v11 = 1;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = 54.84792226060818D;
    Object v14 = 0;
    Object v15 = 1;
    Object v16 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v13).doubleValue()),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v1).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v16));
    Object v18 = new java.io.ByteArrayOutputStream();
    Object v19 = false;
    Object v20 = new java.io.PrintStream(((java.io.OutputStream)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v20));
    Object v22 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v23 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v22));
    Object v24 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v21),((com.google.javascript.jscomp.NodeTraversal.Callback)v23));
    Object v25 = java.util.List.of();
    ((com.google.javascript.jscomp.NodeTraversal)v24).traverseRoots(((java.util.List)v25));
    Object v26 = null;
    ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v1).enterScope(((com.google.javascript.jscomp.NodeTraversal)v24));
    Object v27 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v1 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v0).stripConstIfReplaced();
    Object v2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v0));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v1 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v0));
    Object v2 = new java.io.ByteArrayOutputStream();
    Object v3 = false;
    Object v4 = new java.io.PrintStream(((java.io.OutputStream)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v4));
    Object v6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v7 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v1).exitScope(((com.google.javascript.jscomp.NodeTraversal)v8));
    Object v9 = null;
    Object v10 = new java.io.ByteArrayOutputStream();
    Object v11 = false;
    Object v12 = new java.io.PrintStream(((java.io.OutputStream)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v12));
    Object v14 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v15 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v14));
    Object v16 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v13),((com.google.javascript.jscomp.NodeTraversal.Callback)v15));
    Object v17 = 54.84792226060818D;
    Object v18 = 0;
    Object v19 = 1;
    Object v20 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v17).doubleValue()),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()));
    Object v21 = false;
    Object v22 = true;
    Object v23 = true;
    Object v24 = ((com.google.javascript.rhino.Node)v20).toString((((java.lang.Boolean)v21).booleanValue()),(((java.lang.Boolean)v22).booleanValue()),(((java.lang.Boolean)v23).booleanValue()));
    Object v25 = 54.84792226060818D;
    Object v26 = 0;
    Object v27 = 1;
    Object v28 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v25).doubleValue()),(((java.lang.Integer)v26).intValue()),(((java.lang.Integer)v27).intValue()));
    Object v29 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v1).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v16),((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.Node)v28));
    org.junit.Assert.assertEquals((Object)(true), v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique();
    Object v1 = new java.io.ByteArrayOutputStream();
    Object v2 = false;
    Object v3 = new java.io.PrintStream(((java.io.OutputStream)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v3));
    Object v5 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v5));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = 54.84792226060818D;
    Object v9 = 0;
    Object v10 = 1;
    Object v11 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = new java.io.ByteArrayOutputStream();
    Object v13 = false;
    Object v14 = new java.io.PrintStream(((java.io.OutputStream)v12),(((java.lang.Boolean)v13).booleanValue()));
    ((com.google.javascript.rhino.Node)v11).appendStringTree(((java.lang.Appendable)v14));
    Object v15 = null;
    Object v16 = 54.84792226060818D;
    Object v17 = 0;
    Object v18 = 1;
    Object v19 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v16).doubleValue()),(((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()));
    ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v0).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v19));
    Object v20 = null;
    org.junit.Assert.assertNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v1 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v0).stripConstIfReplaced();
    Object v2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v0));
    Object v3 = new java.io.ByteArrayOutputStream();
    Object v4 = false;
    Object v5 = new java.io.PrintStream(((java.io.OutputStream)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v5));
    Object v7 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v8 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.NodeTraversal.Callback)v8));
    ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v2).exitScope(((com.google.javascript.jscomp.NodeTraversal)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v1 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v0).stripConstIfReplaced();
    Object v2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v0));
    Object v3 = new java.io.ByteArrayOutputStream();
    Object v4 = false;
    Object v5 = new java.io.PrintStream(((java.io.OutputStream)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v5));
    Object v7 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v8 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.NodeTraversal.Callback)v8));
    Object v10 = 54.84792226060818D;
    Object v11 = 0;
    Object v12 = 1;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = 54.84792226060818D;
    Object v15 = 0;
    Object v16 = 1;
    Object v17 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v14).doubleValue()),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    ((com.google.javascript.rhino.Node)v13).addChildrenToBack(((com.google.javascript.rhino.Node)v17));
    Object v18 = null;
    Object v19 = 54.84792226060818D;
    Object v20 = 0;
    Object v21 = 1;
    Object v22 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v19).doubleValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()));
    Object v23 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v2).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v9),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v22));
    org.junit.Assert.assertEquals((Object)(true), v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique();
    Object v1 = new java.io.ByteArrayOutputStream();
    Object v2 = false;
    Object v3 = new java.io.PrintStream(((java.io.OutputStream)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v3));
    Object v5 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v5));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = 54.84792226060818D;
    Object v9 = 0;
    Object v10 = 1;
    Object v11 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = 54.84792226060818D;
    Object v13 = 0;
    Object v14 = 1;
    Object v15 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v12).doubleValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v0).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v15));
    Object v17 = new java.io.ByteArrayOutputStream();
    Object v18 = false;
    Object v19 = new java.io.PrintStream(((java.io.OutputStream)v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v19));
    Object v21 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v22 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v21));
    Object v23 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v20),((com.google.javascript.jscomp.NodeTraversal.Callback)v22));
    ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v0).exitScope(((com.google.javascript.jscomp.NodeTraversal)v23));
    Object v24 = null;
    org.junit.Assert.assertNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v1 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v0));
    Object v2 = new java.io.ByteArrayOutputStream();
    Object v3 = false;
    Object v4 = new java.io.PrintStream(((java.io.OutputStream)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v4));
    Object v6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v7 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = ((com.google.javascript.jscomp.NodeTraversal)v8).hasScope();
    ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v1).enterScope(((com.google.javascript.jscomp.NodeTraversal)v8));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique();
    Object v1 = new java.io.ByteArrayOutputStream();
    Object v2 = false;
    Object v3 = new java.io.PrintStream(((java.io.OutputStream)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v3));
    Object v5 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v5));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = 54.84792226060818D;
    Object v9 = 0;
    Object v10 = 1;
    Object v11 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = 54.84792226060818D;
    Object v13 = 0;
    Object v14 = 1;
    Object v15 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v12).doubleValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v0).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
    Object v17 = new java.io.ByteArrayOutputStream();
    Object v18 = false;
    Object v19 = new java.io.PrintStream(((java.io.OutputStream)v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v19));
    Object v21 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v22 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v21));
    Object v23 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v20),((com.google.javascript.jscomp.NodeTraversal.Callback)v22));
    Object v24 = 54.84792226060818D;
    Object v25 = 0;
    Object v26 = 1;
    Object v27 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v24).doubleValue()),(((java.lang.Integer)v25).intValue()),(((java.lang.Integer)v26).intValue()));
    Object v28 = 54.84792226060818D;
    Object v29 = 0;
    Object v30 = 1;
    Object v31 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v28).doubleValue()),(((java.lang.Integer)v29).intValue()),(((java.lang.Integer)v30).intValue()));
    Object v32 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v0).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v23),((com.google.javascript.rhino.Node)v27),((com.google.javascript.rhino.Node)v31));
    org.junit.Assert.assertEquals((Object)(true), v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new java.io.ByteArrayOutputStream();
    Object v1 = false;
    Object v2 = new java.io.PrintStream(((java.io.OutputStream)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    ((com.google.javascript.jscomp.AbstractCompiler)v3).reportCodeChange();
    Object v4 = null;
    Object v5 = com.google.javascript.jscomp.MakeDeclaredNamesUnique.getContextualRenameInverter(((com.google.javascript.jscomp.AbstractCompiler)v3));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique();
    Object v1 = new java.io.ByteArrayOutputStream();
    Object v2 = false;
    Object v3 = new java.io.PrintStream(((java.io.OutputStream)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v3));
    Object v5 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v5));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = 54.84792226060818D;
    Object v9 = 0;
    Object v10 = 1;
    Object v11 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = 54.84792226060818D;
    Object v13 = 0;
    Object v14 = 1;
    Object v15 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v12).doubleValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = java.util.List.of();
    Object v17 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique();
    Object v18 = "parseIYnputs";
    Object v19 = "t";
    Object v20 = com.google.javascript.jscomp.DiagnosticType.warning(((java.lang.String)v18),((java.lang.String)v19));
    Object v21 = "parseIYnputs";
    Object v22 = "t";
    Object v23 = com.google.javascript.jscomp.DiagnosticType.warning(((java.lang.String)v21),((java.lang.String)v22));
    Object v24 = 54.84792226060818D;
    Object v25 = 0;
    Object v26 = 1;
    Object v27 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v24).doubleValue()),(((java.lang.Integer)v25).intValue()),(((java.lang.Integer)v26).intValue()));
    Object v28 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique();
    Object v29 = java.util.Set.of(((java.lang.Object)v16),((java.lang.Object)v17),((java.lang.Object)v20),((java.lang.Object)v23),((java.lang.Object)v27),((java.lang.Object)v28));
    ((com.google.javascript.rhino.Node)v15).setDirectives(((java.util.Set)v29));
    Object v30 = null;
    ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v0).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v15));
    Object v31 = null;
    org.junit.Assert.assertNull(v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique();
    Object v1 = new java.io.ByteArrayOutputStream();
    Object v2 = false;
    Object v3 = new java.io.PrintStream(((java.io.OutputStream)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v3));
    Object v5 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v5));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v0).exitScope(((com.google.javascript.jscomp.NodeTraversal)v7));
    Object v8 = null;
    Object v9 = new java.io.ByteArrayOutputStream();
    Object v10 = false;
    Object v11 = new java.io.PrintStream(((java.io.OutputStream)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v11));
    Object v13 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v14 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v13));
    Object v15 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v12),((com.google.javascript.jscomp.NodeTraversal.Callback)v14));
    Object v16 = 54.84792226060818D;
    Object v17 = 0;
    Object v18 = 1;
    Object v19 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v16).doubleValue()),(((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()));
    Object v20 = 54.84792226060818D;
    Object v21 = 0;
    Object v22 = 1;
    Object v23 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v20).doubleValue()),(((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()));
    Object v24 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v0).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v15),((com.google.javascript.rhino.Node)v19),((com.google.javascript.rhino.Node)v23));
    org.junit.Assert.assertEquals((Object)(true), v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v1 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v0).stripConstIfReplaced();
    Object v2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v0));
    Object v3 = new java.io.ByteArrayOutputStream();
    Object v4 = false;
    Object v5 = new java.io.PrintStream(((java.io.OutputStream)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v5));
    Object v7 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v8 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.NodeTraversal.Callback)v8));
    Object v10 = 54.84792226060818D;
    Object v11 = 0;
    Object v12 = 1;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = 54.84792226060818D;
    Object v15 = 0;
    Object v16 = 1;
    Object v17 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v14).doubleValue()),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v2).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v9),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v17));
    Object v19 = new java.io.ByteArrayOutputStream();
    Object v20 = false;
    Object v21 = new java.io.PrintStream(((java.io.OutputStream)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v21));
    Object v23 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v24 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v23));
    Object v25 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v22),((com.google.javascript.jscomp.NodeTraversal.Callback)v24));
    ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v2).exitScope(((com.google.javascript.jscomp.NodeTraversal)v25));
    Object v26 = null;
    org.junit.Assert.assertNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v1 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v0).stripConstIfReplaced();
    Object v2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v0));
    Object v3 = new java.io.ByteArrayOutputStream();
    Object v4 = false;
    Object v5 = new java.io.PrintStream(((java.io.OutputStream)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v5));
    Object v7 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v8 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.NodeTraversal.Callback)v8));
    Object v10 = 54.84792226060818D;
    Object v11 = 0;
    Object v12 = 1;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = 54.84792226060818D;
    Object v15 = 0;
    Object v16 = 1;
    Object v17 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v14).doubleValue()),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v9),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v17));
    Object v18 = null;
    Object v19 = new java.io.ByteArrayOutputStream();
    Object v20 = false;
    Object v21 = new java.io.PrintStream(((java.io.OutputStream)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v21));
    Object v23 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v24 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v23));
    Object v25 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v22),((com.google.javascript.jscomp.NodeTraversal.Callback)v24));
    Object v26 = new com.google.javascript.rhino.Node[]{};
    ((com.google.javascript.jscomp.NodeTraversal)v25).traverseRoots(((com.google.javascript.rhino.Node[])v26));
    Object v27 = null;
    Object v28 = 54.84792226060818D;
    Object v29 = 0;
    Object v30 = 1;
    Object v31 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v28).doubleValue()),(((java.lang.Integer)v29).intValue()),(((java.lang.Integer)v30).intValue()));
    Object v32 = 54.84792226060818D;
    Object v33 = 0;
    Object v34 = 1;
    Object v35 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v32).doubleValue()),(((java.lang.Integer)v33).intValue()),(((java.lang.Integer)v34).intValue()));
    Object v36 = false;
    ((com.google.javascript.rhino.Node)v35).setVarArgs((((java.lang.Boolean)v36).booleanValue()));
    Object v37 = null;
    ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v25),((com.google.javascript.rhino.Node)v31),((com.google.javascript.rhino.Node)v35));
    Object v38 = null;
    org.junit.Assert.assertNull(v38);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique();
    Object v1 = new java.io.ByteArrayOutputStream();
    Object v2 = false;
    Object v3 = new java.io.PrintStream(((java.io.OutputStream)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v3));
    Object v5 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v5));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = 54.84792226060818D;
    Object v9 = 0;
    Object v10 = 1;
    Object v11 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = 54.84792226060818D;
    Object v13 = 0;
    Object v14 = 1;
    Object v15 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v12).doubleValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = -1;
    ((com.google.javascript.rhino.Node)v15).setType((((java.lang.Integer)v16).intValue()));
    Object v17 = null;
    ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v0).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v15));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v1 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v0).stripConstIfReplaced();
    Object v2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v0));
    Object v3 = new java.io.ByteArrayOutputStream();
    Object v4 = false;
    Object v5 = new java.io.PrintStream(((java.io.OutputStream)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v5));
    Object v7 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v8 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.NodeTraversal.Callback)v8));
    Object v10 = 54.84792226060818D;
    Object v11 = 0;
    Object v12 = 1;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    ((com.google.javascript.jscomp.NodeTraversal)v9).traverse(((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
    Object v15 = 54.84792226060818D;
    Object v16 = 0;
    Object v17 = 1;
    Object v18 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v15).doubleValue()),(((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()));
    Object v19 = 54.84792226060818D;
    Object v20 = 0;
    Object v21 = 1;
    Object v22 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v19).doubleValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()));
    ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v9),((com.google.javascript.rhino.Node)v18),((com.google.javascript.rhino.Node)v22));
    Object v23 = null;
    org.junit.Assert.assertNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v1 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v0));
    Object v2 = new java.io.ByteArrayOutputStream();
    Object v3 = false;
    Object v4 = new java.io.PrintStream(((java.io.OutputStream)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v4));
    Object v6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v7 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = 54.84792226060818D;
    Object v10 = 0;
    Object v11 = 1;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = "parseIYnputs";
    Object v14 = "t";
    Object v15 = com.google.javascript.jscomp.DiagnosticType.warning(((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = new java.lang.String[]{"constructor"};
    ((com.google.javascript.jscomp.NodeTraversal)v8).report(((com.google.javascript.rhino.Node)v12),((com.google.javascript.jscomp.DiagnosticType)v15),((java.lang.String[])v16));
    Object v17 = null;
    Object v18 = 54.84792226060818D;
    Object v19 = 0;
    Object v20 = 1;
    Object v21 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v18).doubleValue()),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
    Object v22 = 54.84792226060818D;
    Object v23 = 0;
    Object v24 = 1;
    Object v25 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v22).doubleValue()),(((java.lang.Integer)v23).intValue()),(((java.lang.Integer)v24).intValue()));
    Object v26 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v1).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v21),((com.google.javascript.rhino.Node)v25));
    org.junit.Assert.assertEquals((Object)(true), v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v1 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v0));
    Object v2 = new java.io.ByteArrayOutputStream();
    Object v3 = false;
    Object v4 = new java.io.PrintStream(((java.io.OutputStream)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v4));
    Object v6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v7 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = 54.84792226060818D;
    Object v10 = 0;
    Object v11 = 1;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = 54.84792226060818D;
    Object v14 = 0;
    Object v15 = 1;
    Object v16 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v13).doubleValue()),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v1).visit(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v16));
    Object v17 = null;
    Object v18 = new java.io.ByteArrayOutputStream();
    Object v19 = false;
    Object v20 = new java.io.PrintStream(((java.io.OutputStream)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v20));
    Object v22 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v23 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v22));
    Object v24 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v21),((com.google.javascript.jscomp.NodeTraversal.Callback)v23));
    ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v1).exitScope(((com.google.javascript.jscomp.NodeTraversal)v24));
    Object v25 = null;
    org.junit.Assert.assertNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v1 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v0).stripConstIfReplaced();
    Object v2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v0));
    Object v3 = new java.io.ByteArrayOutputStream();
    Object v4 = false;
    Object v5 = new java.io.PrintStream(((java.io.OutputStream)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v5));
    Object v7 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v8 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.NodeTraversal.Callback)v8));
    Object v10 = 54.84792226060818D;
    Object v11 = 0;
    Object v12 = 1;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = 54.84792226060818D;
    Object v15 = 0;
    Object v16 = 1;
    Object v17 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v14).doubleValue()),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v9),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v17));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v1 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v0).stripConstIfReplaced();
    Object v2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v0));
    Object v3 = new java.io.ByteArrayOutputStream();
    Object v4 = false;
    Object v5 = new java.io.PrintStream(((java.io.OutputStream)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v5));
    Object v7 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v8 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.NodeTraversal.Callback)v8));
    Object v10 = 54.84792226060818D;
    Object v11 = 0;
    Object v12 = 1;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = "parseIYnputs";
    Object v15 = "t";
    Object v16 = com.google.javascript.jscomp.DiagnosticType.warning(((java.lang.String)v14),((java.lang.String)v15));
    Object v17 = new java.lang.String[]{};
    ((com.google.javascript.jscomp.NodeTraversal)v9).report(((com.google.javascript.rhino.Node)v13),((com.google.javascript.jscomp.DiagnosticType)v16),((java.lang.String[])v17));
    Object v18 = null;
    ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v2).enterScope(((com.google.javascript.jscomp.NodeTraversal)v9));
    Object v19 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique();
    Object v1 = new java.io.ByteArrayOutputStream();
    Object v2 = false;
    Object v3 = new java.io.PrintStream(((java.io.OutputStream)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v3));
    Object v5 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v5));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = 54.84792226060818D;
    Object v9 = 0;
    Object v10 = 1;
    Object v11 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = 54.84792226060818D;
    Object v13 = 0;
    Object v14 = 1;
    Object v15 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v12).doubleValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    ((com.google.javascript.rhino.Node)v11).addChildToBack(((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
    Object v17 = 54.84792226060818D;
    Object v18 = 0;
    Object v19 = 1;
    Object v20 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v17).doubleValue()),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()));
    Object v21 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v0).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v20));
    org.junit.Assert.assertEquals((Object)(true), v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v1 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v0).stripConstIfReplaced();
    Object v2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v0));
    Object v3 = new java.io.ByteArrayOutputStream();
    Object v4 = false;
    Object v5 = new java.io.PrintStream(((java.io.OutputStream)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v5));
    Object v7 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v8 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.NodeTraversal.Callback)v8));
    ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v2).exitScope(((com.google.javascript.jscomp.NodeTraversal)v9));
    Object v10 = null;
    Object v11 = new java.io.ByteArrayOutputStream();
    Object v12 = false;
    Object v13 = new java.io.PrintStream(((java.io.OutputStream)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v16 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v15));
    Object v17 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.NodeTraversal.Callback)v16));
    ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v2).enterScope(((com.google.javascript.jscomp.NodeTraversal)v17));
    Object v18 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v1 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v0).stripConstIfReplaced();
    Object v2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v0));
    Object v3 = new java.io.ByteArrayOutputStream();
    Object v4 = false;
    Object v5 = new java.io.PrintStream(((java.io.OutputStream)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v5));
    Object v7 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v8 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.NodeTraversal.Callback)v8));
    Object v10 = 54.84792226060818D;
    Object v11 = 0;
    Object v12 = 1;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = false;
    ((com.google.javascript.rhino.Node)v13).setIsSyntheticBlock((((java.lang.Boolean)v14).booleanValue()));
    Object v15 = null;
    Object v16 = 54.84792226060818D;
    Object v17 = 0;
    Object v18 = 1;
    Object v19 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v16).doubleValue()),(((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()));
    ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v9),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v19));
    Object v20 = null;
    org.junit.Assert.assertNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v1 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v0).stripConstIfReplaced();
    Object v2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v0));
    Object v3 = new java.io.ByteArrayOutputStream();
    Object v4 = false;
    Object v5 = new java.io.PrintStream(((java.io.OutputStream)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v5));
    Object v7 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v8 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.NodeTraversal.Callback)v8));
    ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v2).enterScope(((com.google.javascript.jscomp.NodeTraversal)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v1 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v0).stripConstIfReplaced();
    Object v2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v0));
    Object v3 = new java.io.ByteArrayOutputStream();
    Object v4 = false;
    Object v5 = new java.io.PrintStream(((java.io.OutputStream)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v5));
    Object v7 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v8 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.NodeTraversal.Callback)v8));
    Object v10 = 54.84792226060818D;
    Object v11 = 0;
    Object v12 = 1;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = 54.84792226060818D;
    Object v15 = 0;
    Object v16 = 1;
    Object v17 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v14).doubleValue()),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v9),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v17));
    Object v18 = null;
    Object v19 = new java.io.ByteArrayOutputStream();
    Object v20 = false;
    Object v21 = new java.io.PrintStream(((java.io.OutputStream)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v21));
    Object v23 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v24 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v23));
    Object v25 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v22),((com.google.javascript.jscomp.NodeTraversal.Callback)v24));
    ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v2).enterScope(((com.google.javascript.jscomp.NodeTraversal)v25));
    Object v26 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v1 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v0).stripConstIfReplaced();
    Object v2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v0));
    Object v3 = new java.io.ByteArrayOutputStream();
    Object v4 = false;
    Object v5 = new java.io.PrintStream(((java.io.OutputStream)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v5));
    Object v7 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v8 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.NodeTraversal.Callback)v8));
    Object v10 = 54.84792226060818D;
    Object v11 = 0;
    Object v12 = 1;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = 1.0D;
    ((com.google.javascript.rhino.Node)v13).setDouble((((java.lang.Double)v14).doubleValue()));
    Object v15 = null;
    Object v16 = 54.84792226060818D;
    Object v17 = 0;
    Object v18 = 1;
    Object v19 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v16).doubleValue()),(((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()));
    ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v9),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v19));
    Object v20 = null;
    org.junit.Assert.assertNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v1 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v0).stripConstIfReplaced();
    Object v2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v0));
    Object v3 = new java.io.ByteArrayOutputStream();
    Object v4 = false;
    Object v5 = new java.io.PrintStream(((java.io.OutputStream)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v5));
    Object v7 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v8 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.NodeTraversal.Callback)v8));
    Object v10 = java.util.List.of();
    ((com.google.javascript.jscomp.NodeTraversal)v9).traverseRoots(((java.util.List)v10));
    Object v11 = null;
    ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v2).enterScope(((com.google.javascript.jscomp.NodeTraversal)v9));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v1 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v0).stripConstIfReplaced();
    Object v2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v0));
    Object v3 = new java.io.ByteArrayOutputStream();
    Object v4 = false;
    Object v5 = new java.io.PrintStream(((java.io.OutputStream)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v5));
    Object v7 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v8 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.NodeTraversal.Callback)v8));
    Object v10 = 54.84792226060818D;
    Object v11 = 0;
    Object v12 = 1;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = 54.84792226060818D;
    Object v15 = 0;
    Object v16 = 1;
    Object v17 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v14).doubleValue()),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = ((com.google.javascript.rhino.Node)v17).getDouble();
    Object v19 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v2).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v9),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v17));
    org.junit.Assert.assertEquals((Object)(true), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v1 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v0).stripConstIfReplaced();
    Object v2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v0));
    Object v3 = new java.io.ByteArrayOutputStream();
    Object v4 = false;
    Object v5 = new java.io.PrintStream(((java.io.OutputStream)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v5));
    Object v7 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v8 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.NodeTraversal.Callback)v8));
    Object v10 = 54.84792226060818D;
    Object v11 = 0;
    Object v12 = 1;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = 54.84792226060818D;
    Object v15 = 0;
    Object v16 = 1;
    Object v17 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v14).doubleValue()),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v2).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v9),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v17));
    org.junit.Assert.assertEquals((Object)(true), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v1 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v0).stripConstIfReplaced();
    Object v2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v0));
    Object v3 = new java.io.ByteArrayOutputStream();
    Object v4 = false;
    Object v5 = new java.io.PrintStream(((java.io.OutputStream)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v5));
    Object v7 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v8 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.NodeTraversal.Callback)v8));
    Object v10 = 54.84792226060818D;
    Object v11 = 0;
    Object v12 = 1;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = 1.0D;
    ((com.google.javascript.rhino.Node)v13).setDouble((((java.lang.Double)v14).doubleValue()));
    Object v15 = null;
    Object v16 = 54.84792226060818D;
    Object v17 = 0;
    Object v18 = 1;
    Object v19 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v16).doubleValue()),(((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()));
    Object v20 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v2).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v9),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v19));
    org.junit.Assert.assertEquals((Object)(true), v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique();
    Object v1 = new java.io.ByteArrayOutputStream();
    Object v2 = false;
    Object v3 = new java.io.PrintStream(((java.io.OutputStream)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v3));
    Object v5 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v5));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = 54.84792226060818D;
    Object v9 = 0;
    Object v10 = 1;
    Object v11 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = 54.84792226060818D;
    Object v13 = 0;
    Object v14 = 1;
    Object v15 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v12).doubleValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    ((com.google.javascript.rhino.Node)v11).addChildToBack(((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
    Object v17 = 54.84792226060818D;
    Object v18 = 0;
    Object v19 = 1;
    Object v20 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v17).doubleValue()),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()));
    ((com.google.javascript.rhino.Node)v20).detachChildren();
    Object v21 = null;
    ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v0).visit(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v20));
    Object v22 = null;
    org.junit.Assert.assertNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v1 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v0));
    Object v2 = new java.io.ByteArrayOutputStream();
    Object v3 = false;
    Object v4 = new java.io.PrintStream(((java.io.OutputStream)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v4));
    Object v6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v7 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = 54.84792226060818D;
    Object v10 = 0;
    Object v11 = 1;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = 54.84792226060818D;
    Object v14 = 0;
    Object v15 = 1;
    Object v16 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v13).doubleValue()),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v1).visit(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v16));
    Object v17 = null;
    Object v18 = new java.io.ByteArrayOutputStream();
    Object v19 = false;
    Object v20 = new java.io.PrintStream(((java.io.OutputStream)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v20));
    Object v22 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v23 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v22));
    Object v24 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v21),((com.google.javascript.jscomp.NodeTraversal.Callback)v23));
    Object v25 = 54.84792226060818D;
    Object v26 = 0;
    Object v27 = 1;
    Object v28 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v25).doubleValue()),(((java.lang.Integer)v26).intValue()),(((java.lang.Integer)v27).intValue()));
    Object v29 = 54.84792226060818D;
    Object v30 = 0;
    Object v31 = 1;
    Object v32 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v29).doubleValue()),(((java.lang.Integer)v30).intValue()),(((java.lang.Integer)v31).intValue()));
    ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v1).visit(((com.google.javascript.jscomp.NodeTraversal)v24),((com.google.javascript.rhino.Node)v28),((com.google.javascript.rhino.Node)v32));
    Object v33 = null;
    org.junit.Assert.assertNull(v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v1 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v0).stripConstIfReplaced();
    Object v2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v0));
    Object v3 = new java.io.ByteArrayOutputStream();
    Object v4 = false;
    Object v5 = new java.io.PrintStream(((java.io.OutputStream)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v5));
    Object v7 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v8 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.NodeTraversal.Callback)v8));
    Object v10 = 54.84792226060818D;
    Object v11 = 0;
    Object v12 = 1;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = ((com.google.javascript.rhino.Node)v13).children();
    Object v15 = 54.84792226060818D;
    Object v16 = 0;
    Object v17 = 1;
    Object v18 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v15).doubleValue()),(((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()));
    Object v19 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v2).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v9),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v18));
    org.junit.Assert.assertEquals((Object)(true), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique();
    Object v1 = new java.io.ByteArrayOutputStream();
    Object v2 = false;
    Object v3 = new java.io.PrintStream(((java.io.OutputStream)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v3));
    Object v5 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v5));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = ((com.google.javascript.jscomp.NodeTraversal)v7).getScope();
    ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v0).enterScope(((com.google.javascript.jscomp.NodeTraversal)v7));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v1 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v0));
    Object v2 = new java.io.ByteArrayOutputStream();
    Object v3 = false;
    Object v4 = new java.io.PrintStream(((java.io.OutputStream)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v4));
    Object v6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v7 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = ((com.google.javascript.jscomp.NodeTraversal)v8).getEnclosingFunction();
    Object v10 = 54.84792226060818D;
    Object v11 = 0;
    Object v12 = 1;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = 54.84792226060818D;
    Object v15 = 0;
    Object v16 = 1;
    Object v17 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v14).doubleValue()),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v1).visit(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v17));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v1 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v0));
    Object v2 = new java.io.ByteArrayOutputStream();
    Object v3 = false;
    Object v4 = new java.io.PrintStream(((java.io.OutputStream)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v4));
    Object v6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v7 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = 54.84792226060818D;
    Object v10 = 0;
    Object v11 = 1;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = 54.84792226060818D;
    Object v14 = 0;
    Object v15 = 1;
    Object v16 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v13).doubleValue()),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = false;
    ((com.google.javascript.rhino.Node)v16).setOptionalArg((((java.lang.Boolean)v17).booleanValue()));
    Object v18 = null;
    ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v1).visit(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v16));
    Object v19 = null;
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new java.io.ByteArrayOutputStream();
    Object v1 = false;
    Object v2 = new java.io.PrintStream(((java.io.OutputStream)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getReverseAbstractInterpreter();
    Object v5 = com.google.javascript.jscomp.MakeDeclaredNamesUnique.getContextualRenameInverter(((com.google.javascript.jscomp.AbstractCompiler)v3));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v1 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v0).stripConstIfReplaced();
    Object v2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v0));
    Object v3 = new java.io.ByteArrayOutputStream();
    Object v4 = false;
    Object v5 = new java.io.PrintStream(((java.io.OutputStream)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v5));
    Object v7 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v8 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.NodeTraversal.Callback)v8));
    Object v10 = 54.84792226060818D;
    Object v11 = 0;
    Object v12 = 1;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    ((com.google.javascript.rhino.Node)v13).detachChildren();
    Object v14 = null;
    Object v15 = 54.84792226060818D;
    Object v16 = 0;
    Object v17 = 1;
    Object v18 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v15).doubleValue()),(((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()));
    Object v19 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v2).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v9),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v18));
    org.junit.Assert.assertEquals((Object)(true), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v1 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v0));
    Object v2 = new java.io.ByteArrayOutputStream();
    Object v3 = false;
    Object v4 = new java.io.PrintStream(((java.io.OutputStream)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v4));
    Object v6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v7 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = ((com.google.javascript.jscomp.NodeTraversal)v8).hasScope();
    ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v1).exitScope(((com.google.javascript.jscomp.NodeTraversal)v8));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v1 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v0));
    Object v2 = new java.io.ByteArrayOutputStream();
    Object v3 = false;
    Object v4 = new java.io.PrintStream(((java.io.OutputStream)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v4));
    Object v6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v7 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = 54.84792226060818D;
    Object v10 = 0;
    Object v11 = 1;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = ((com.google.javascript.rhino.Node)v12).getAncestors();
    Object v14 = 54.84792226060818D;
    Object v15 = 0;
    Object v16 = 1;
    Object v17 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v14).doubleValue()),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = java.util.List.of();
    Object v19 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique();
    Object v20 = "parseIYnputs";
    Object v21 = "t";
    Object v22 = com.google.javascript.jscomp.DiagnosticType.warning(((java.lang.String)v20),((java.lang.String)v21));
    Object v23 = "parseIYnputs";
    Object v24 = "t";
    Object v25 = com.google.javascript.jscomp.DiagnosticType.warning(((java.lang.String)v23),((java.lang.String)v24));
    Object v26 = 54.84792226060818D;
    Object v27 = 0;
    Object v28 = 1;
    Object v29 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v26).doubleValue()),(((java.lang.Integer)v27).intValue()),(((java.lang.Integer)v28).intValue()));
    Object v30 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique();
    Object v31 = java.util.Set.of(((java.lang.Object)v18),((java.lang.Object)v19),((java.lang.Object)v22),((java.lang.Object)v25),((java.lang.Object)v29),((java.lang.Object)v30));
    ((com.google.javascript.rhino.Node)v17).setDirectives(((java.util.Set)v31));
    Object v32 = null;
    ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v1).visit(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v17));
    Object v33 = null;
    org.junit.Assert.assertNull(v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v1 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v0));
    Object v2 = new java.io.ByteArrayOutputStream();
    Object v3 = false;
    Object v4 = new java.io.PrintStream(((java.io.OutputStream)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v4));
    Object v6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v7 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v1).exitScope(((com.google.javascript.jscomp.NodeTraversal)v8));
    Object v9 = null;
    Object v10 = new java.io.ByteArrayOutputStream();
    Object v11 = false;
    Object v12 = new java.io.PrintStream(((java.io.OutputStream)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v12));
    Object v14 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v15 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v14));
    Object v16 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v13),((com.google.javascript.jscomp.NodeTraversal.Callback)v15));
    Object v17 = ((com.google.javascript.jscomp.NodeTraversal)v16).getScope();
    Object v18 = 54.84792226060818D;
    Object v19 = 0;
    Object v20 = 1;
    Object v21 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v18).doubleValue()),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
    Object v22 = ((com.google.javascript.rhino.Node)v21).isUnscopedQualifiedName();
    Object v23 = 54.84792226060818D;
    Object v24 = 0;
    Object v25 = 1;
    Object v26 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v23).doubleValue()),(((java.lang.Integer)v24).intValue()),(((java.lang.Integer)v25).intValue()));
    Object v27 = ((com.google.javascript.rhino.Node)v26).getQualifiedName();
    ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v1).visit(((com.google.javascript.jscomp.NodeTraversal)v16),((com.google.javascript.rhino.Node)v21),((com.google.javascript.rhino.Node)v26));
    Object v28 = null;
    org.junit.Assert.assertNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v1 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v0));
    Object v2 = new java.io.ByteArrayOutputStream();
    Object v3 = false;
    Object v4 = new java.io.PrintStream(((java.io.OutputStream)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v4));
    Object v6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v7 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = 54.84792226060818D;
    Object v10 = 0;
    Object v11 = 1;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = "parseIYnputs";
    Object v14 = "t";
    Object v15 = com.google.javascript.jscomp.DiagnosticType.warning(((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = new java.lang.String[]{};
    ((com.google.javascript.jscomp.NodeTraversal)v8).report(((com.google.javascript.rhino.Node)v12),((com.google.javascript.jscomp.DiagnosticType)v15),((java.lang.String[])v16));
    Object v17 = null;
    Object v18 = 54.84792226060818D;
    Object v19 = 0;
    Object v20 = 1;
    Object v21 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v18).doubleValue()),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
    Object v22 = 54.84792226060818D;
    Object v23 = 0;
    Object v24 = 1;
    Object v25 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v22).doubleValue()),(((java.lang.Integer)v23).intValue()),(((java.lang.Integer)v24).intValue()));
    ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v1).visit(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v21),((com.google.javascript.rhino.Node)v25));
    Object v26 = null;
    org.junit.Assert.assertNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique();
    Object v1 = new java.io.ByteArrayOutputStream();
    Object v2 = false;
    Object v3 = new java.io.PrintStream(((java.io.OutputStream)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v3));
    Object v5 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v5));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v0).exitScope(((com.google.javascript.jscomp.NodeTraversal)v7));
    Object v8 = null;
    Object v9 = new java.io.ByteArrayOutputStream();
    Object v10 = false;
    Object v11 = new java.io.PrintStream(((java.io.OutputStream)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v11));
    Object v13 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v14 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v13));
    Object v15 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v12),((com.google.javascript.jscomp.NodeTraversal.Callback)v14));
    Object v16 = 54.84792226060818D;
    Object v17 = 0;
    Object v18 = 1;
    Object v19 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v16).doubleValue()),(((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()));
    ((com.google.javascript.jscomp.NodeTraversal)v15).traverse(((com.google.javascript.rhino.Node)v19));
    Object v20 = null;
    Object v21 = 54.84792226060818D;
    Object v22 = 0;
    Object v23 = 1;
    Object v24 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v21).doubleValue()),(((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()));
    Object v25 = ((com.google.javascript.rhino.Node)v24).hasSideEffects();
    Object v26 = 54.84792226060818D;
    Object v27 = 0;
    Object v28 = 1;
    Object v29 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v26).doubleValue()),(((java.lang.Integer)v27).intValue()),(((java.lang.Integer)v28).intValue()));
    Object v30 = ((com.google.javascript.rhino.Node)v29).removeChildren();
    Object v31 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v0).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v15),((com.google.javascript.rhino.Node)v24),((com.google.javascript.rhino.Node)v29));
    org.junit.Assert.assertEquals((Object)(true), v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique();
    Object v1 = new java.io.ByteArrayOutputStream();
    Object v2 = false;
    Object v3 = new java.io.PrintStream(((java.io.OutputStream)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v3));
    Object v5 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v5));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = ((com.google.javascript.jscomp.NodeTraversal)v7).getEnclosingFunction();
    Object v9 = 54.84792226060818D;
    Object v10 = 0;
    Object v11 = 1;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = 54.84792226060818D;
    Object v14 = 0;
    Object v15 = 1;
    Object v16 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v13).doubleValue()),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v0).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v16));
    org.junit.Assert.assertEquals((Object)(true), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v1 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v0).stripConstIfReplaced();
    Object v2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v0));
    Object v3 = new java.io.ByteArrayOutputStream();
    Object v4 = false;
    Object v5 = new java.io.PrintStream(((java.io.OutputStream)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v5));
    Object v7 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v8 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.NodeTraversal.Callback)v8));
    Object v10 = 54.84792226060818D;
    Object v11 = 0;
    Object v12 = 1;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = 54.84792226060818D;
    Object v15 = 0;
    Object v16 = 1;
    Object v17 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v14).doubleValue()),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v2).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v9),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v17));
    Object v19 = new java.io.ByteArrayOutputStream();
    Object v20 = false;
    Object v21 = new java.io.PrintStream(((java.io.OutputStream)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v21));
    Object v23 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v24 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v23));
    Object v25 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v22),((com.google.javascript.jscomp.NodeTraversal.Callback)v24));
    Object v26 = ((com.google.javascript.jscomp.NodeTraversal)v25).getScope();
    Object v27 = 54.84792226060818D;
    Object v28 = 0;
    Object v29 = 1;
    Object v30 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v27).doubleValue()),(((java.lang.Integer)v28).intValue()),(((java.lang.Integer)v29).intValue()));
    Object v31 = 54.84792226060818D;
    Object v32 = 0;
    Object v33 = 1;
    Object v34 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v31).doubleValue()),(((java.lang.Integer)v32).intValue()),(((java.lang.Integer)v33).intValue()));
    ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v25),((com.google.javascript.rhino.Node)v30),((com.google.javascript.rhino.Node)v34));
    Object v35 = null;
    org.junit.Assert.assertNull(v35);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique();
    Object v1 = new java.io.ByteArrayOutputStream();
    Object v2 = false;
    Object v3 = new java.io.PrintStream(((java.io.OutputStream)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v3));
    Object v5 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v5));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = 54.84792226060818D;
    Object v9 = 0;
    Object v10 = 1;
    Object v11 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = 54.84792226060818D;
    Object v13 = 0;
    Object v14 = 1;
    Object v15 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v12).doubleValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v0).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v7),((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.Node)v15));
    Object v17 = new java.io.ByteArrayOutputStream();
    Object v18 = false;
    Object v19 = new java.io.PrintStream(((java.io.OutputStream)v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v19));
    Object v21 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v22 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v21));
    Object v23 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v20),((com.google.javascript.jscomp.NodeTraversal.Callback)v22));
    Object v24 = 54.84792226060818D;
    Object v25 = 0;
    Object v26 = 1;
    Object v27 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v24).doubleValue()),(((java.lang.Integer)v25).intValue()),(((java.lang.Integer)v26).intValue()));
    ((com.google.javascript.jscomp.NodeTraversal)v23).traverse(((com.google.javascript.rhino.Node)v27));
    Object v28 = null;
    ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v0).exitScope(((com.google.javascript.jscomp.NodeTraversal)v23));
    Object v29 = null;
    org.junit.Assert.assertNull(v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new java.io.ByteArrayOutputStream();
    Object v1 = false;
    Object v2 = new java.io.PrintStream(((java.io.OutputStream)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getTopScope();
    Object v5 = com.google.javascript.jscomp.MakeDeclaredNamesUnique.getContextualRenameInverter(((com.google.javascript.jscomp.AbstractCompiler)v3));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v1 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v0));
    Object v2 = new java.io.ByteArrayOutputStream();
    Object v3 = false;
    Object v4 = new java.io.PrintStream(((java.io.OutputStream)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v4));
    Object v6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v7 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = java.util.List.of();
    ((com.google.javascript.jscomp.NodeTraversal)v8).traverseRoots(((java.util.List)v9));
    Object v10 = null;
    Object v11 = 54.84792226060818D;
    Object v12 = 0;
    Object v13 = 1;
    Object v14 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = 54.84792226060818D;
    Object v16 = 0;
    Object v17 = 1;
    Object v18 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v15).doubleValue()),(((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()));
    ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v1).visit(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.Node)v18));
    Object v19 = null;
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v1 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v0).stripConstIfReplaced();
    Object v2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v0));
    Object v3 = new java.io.ByteArrayOutputStream();
    Object v4 = false;
    Object v5 = new java.io.PrintStream(((java.io.OutputStream)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v5));
    Object v7 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v8 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.NodeTraversal.Callback)v8));
    Object v10 = ((com.google.javascript.jscomp.NodeTraversal)v9).getScope();
    ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v2).enterScope(((com.google.javascript.jscomp.NodeTraversal)v9));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v1 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v0).stripConstIfReplaced();
    Object v2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v0));
    Object v3 = new java.io.ByteArrayOutputStream();
    Object v4 = false;
    Object v5 = new java.io.PrintStream(((java.io.OutputStream)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v5));
    Object v7 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v8 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.NodeTraversal.Callback)v8));
    Object v10 = 54.84792226060818D;
    Object v11 = 0;
    Object v12 = 1;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = ((com.google.javascript.rhino.Node)v13).getAncestors();
    Object v15 = 54.84792226060818D;
    Object v16 = 0;
    Object v17 = 1;
    Object v18 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v15).doubleValue()),(((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()));
    ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v9),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v18));
    Object v19 = null;
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v1 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v0));
    Object v2 = new java.io.ByteArrayOutputStream();
    Object v3 = false;
    Object v4 = new java.io.PrintStream(((java.io.OutputStream)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v4));
    Object v6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v7 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = 54.84792226060818D;
    Object v10 = 0;
    Object v11 = 1;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = 54.84792226060818D;
    Object v14 = 0;
    Object v15 = 1;
    Object v16 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v13).doubleValue()),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v1).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v8),((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v16));
    Object v18 = new java.io.ByteArrayOutputStream();
    Object v19 = false;
    Object v20 = new java.io.PrintStream(((java.io.OutputStream)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v20));
    Object v22 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v23 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v22));
    Object v24 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v21),((com.google.javascript.jscomp.NodeTraversal.Callback)v23));
    Object v25 = new com.google.javascript.rhino.Node[]{};
    ((com.google.javascript.jscomp.NodeTraversal)v24).traverseRoots(((com.google.javascript.rhino.Node[])v25));
    Object v26 = null;
    ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v1).enterScope(((com.google.javascript.jscomp.NodeTraversal)v24));
    Object v27 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v1 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v0));
    Object v2 = new java.io.ByteArrayOutputStream();
    Object v3 = false;
    Object v4 = new java.io.PrintStream(((java.io.OutputStream)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v4));
    Object v6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v7 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v1).exitScope(((com.google.javascript.jscomp.NodeTraversal)v8));
    Object v9 = null;
    Object v10 = new java.io.ByteArrayOutputStream();
    Object v11 = false;
    Object v12 = new java.io.PrintStream(((java.io.OutputStream)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v12));
    Object v14 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v15 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v14));
    Object v16 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v13),((com.google.javascript.jscomp.NodeTraversal.Callback)v15));
    ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v1).exitScope(((com.google.javascript.jscomp.NodeTraversal)v16));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v1 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v0));
    Object v2 = new java.io.ByteArrayOutputStream();
    Object v3 = false;
    Object v4 = new java.io.PrintStream(((java.io.OutputStream)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v4));
    Object v6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v7 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v1).exitScope(((com.google.javascript.jscomp.NodeTraversal)v8));
    Object v9 = null;
    Object v10 = new java.io.ByteArrayOutputStream();
    Object v11 = false;
    Object v12 = new java.io.PrintStream(((java.io.OutputStream)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v12));
    Object v14 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v15 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v14));
    Object v16 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v13),((com.google.javascript.jscomp.NodeTraversal.Callback)v15));
    Object v17 = 54.84792226060818D;
    Object v18 = 0;
    Object v19 = 1;
    Object v20 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v17).doubleValue()),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()));
    Object v21 = 54.84792226060818D;
    Object v22 = 0;
    Object v23 = 1;
    Object v24 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v21).doubleValue()),(((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()));
    ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v1).visit(((com.google.javascript.jscomp.NodeTraversal)v16),((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.Node)v24));
    Object v25 = null;
    org.junit.Assert.assertNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v1 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v0).stripConstIfReplaced();
    Object v2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v0));
    Object v3 = new java.io.ByteArrayOutputStream();
    Object v4 = false;
    Object v5 = new java.io.PrintStream(((java.io.OutputStream)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v5));
    Object v7 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v8 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.NodeTraversal.Callback)v8));
    Object v10 = 54.84792226060818D;
    Object v11 = 0;
    Object v12 = 1;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = -22;
    ((com.google.javascript.rhino.Node)v13).setLineno((((java.lang.Integer)v14).intValue()));
    Object v15 = null;
    Object v16 = 54.84792226060818D;
    Object v17 = 0;
    Object v18 = 1;
    Object v19 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v16).doubleValue()),(((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()));
    ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v9),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v19));
    Object v20 = null;
    org.junit.Assert.assertNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v1 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v0).stripConstIfReplaced();
    Object v2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v0));
    Object v3 = new java.io.ByteArrayOutputStream();
    Object v4 = false;
    Object v5 = new java.io.PrintStream(((java.io.OutputStream)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v5));
    Object v7 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v8 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.NodeTraversal.Callback)v8));
    Object v10 = 54.84792226060818D;
    Object v11 = 0;
    Object v12 = 1;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = 54.84792226060818D;
    Object v15 = 0;
    Object v16 = 1;
    Object v17 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v14).doubleValue()),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v9),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v17));
    Object v18 = null;
    Object v19 = new java.io.ByteArrayOutputStream();
    Object v20 = false;
    Object v21 = new java.io.PrintStream(((java.io.OutputStream)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v21));
    Object v23 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v24 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v23));
    Object v25 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v22),((com.google.javascript.jscomp.NodeTraversal.Callback)v24));
    Object v26 = java.util.List.of();
    ((com.google.javascript.jscomp.NodeTraversal)v25).traverseRoots(((java.util.List)v26));
    Object v27 = null;
    Object v28 = 54.84792226060818D;
    Object v29 = 0;
    Object v30 = 1;
    Object v31 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v28).doubleValue()),(((java.lang.Integer)v29).intValue()),(((java.lang.Integer)v30).intValue()));
    Object v32 = 54.84792226060818D;
    Object v33 = 0;
    Object v34 = 1;
    Object v35 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v32).doubleValue()),(((java.lang.Integer)v33).intValue()),(((java.lang.Integer)v34).intValue()));
    ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v25),((com.google.javascript.rhino.Node)v31),((com.google.javascript.rhino.Node)v35));
    Object v36 = null;
    org.junit.Assert.assertNull(v36);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v1 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v0).stripConstIfReplaced();
    Object v2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v0));
    Object v3 = new java.io.ByteArrayOutputStream();
    Object v4 = false;
    Object v5 = new java.io.PrintStream(((java.io.OutputStream)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v5));
    Object v7 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v8 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.NodeTraversal.Callback)v8));
    Object v10 = 54.84792226060818D;
    Object v11 = 0;
    Object v12 = 1;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = false;
    ((com.google.javascript.rhino.Node)v13).setOptionalArg((((java.lang.Boolean)v14).booleanValue()));
    Object v15 = null;
    Object v16 = 54.84792226060818D;
    Object v17 = 0;
    Object v18 = 1;
    Object v19 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v16).doubleValue()),(((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()));
    Object v20 = ((com.google.javascript.rhino.Node)v19).toString();
    ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v9),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v19));
    Object v21 = null;
    org.junit.Assert.assertNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v1 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v0));
    Object v2 = new java.io.ByteArrayOutputStream();
    Object v3 = false;
    Object v4 = new java.io.PrintStream(((java.io.OutputStream)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v4));
    Object v6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v7 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v6));
    Object v8 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.NodeTraversal.Callback)v7));
    Object v9 = java.util.List.of();
    ((com.google.javascript.jscomp.NodeTraversal)v8).traverseRoots(((java.util.List)v9));
    Object v10 = null;
    ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v1).exitScope(((com.google.javascript.jscomp.NodeTraversal)v8));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v1 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v0).stripConstIfReplaced();
    Object v2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v0));
    Object v3 = new java.io.ByteArrayOutputStream();
    Object v4 = false;
    Object v5 = new java.io.PrintStream(((java.io.OutputStream)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v5));
    Object v7 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v8 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.NodeTraversal.Callback)v8));
    Object v10 = ((com.google.javascript.jscomp.NodeTraversal)v9).hasScope();
    Object v11 = 54.84792226060818D;
    Object v12 = 0;
    Object v13 = 1;
    Object v14 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = 54.84792226060818D;
    Object v16 = 0;
    Object v17 = 1;
    Object v18 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v15).doubleValue()),(((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()));
    ((com.google.javascript.rhino.Node)v18).detachChildren();
    Object v19 = null;
    Object v20 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v2).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v9),((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.Node)v18));
    org.junit.Assert.assertEquals((Object)(true), v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v1 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v0).stripConstIfReplaced();
    Object v2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v0));
    Object v3 = new java.io.ByteArrayOutputStream();
    Object v4 = false;
    Object v5 = new java.io.PrintStream(((java.io.OutputStream)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v5));
    Object v7 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v8 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.NodeTraversal.Callback)v8));
    Object v10 = ((com.google.javascript.jscomp.NodeTraversal)v9).hasScope();
    Object v11 = 54.84792226060818D;
    Object v12 = 0;
    Object v13 = 1;
    Object v14 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = new java.io.ByteArrayOutputStream();
    Object v16 = false;
    Object v17 = new java.io.PrintStream(((java.io.OutputStream)v15),(((java.lang.Boolean)v16).booleanValue()));
    ((com.google.javascript.rhino.Node)v14).appendStringTree(((java.lang.Appendable)v17));
    Object v18 = null;
    Object v19 = 54.84792226060818D;
    Object v20 = 0;
    Object v21 = 1;
    Object v22 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v19).doubleValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()));
    Object v23 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v2).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v9),((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.Node)v22));
    org.junit.Assert.assertEquals((Object)(true), v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique();
    Object v1 = new java.io.ByteArrayOutputStream();
    Object v2 = false;
    Object v3 = new java.io.PrintStream(((java.io.OutputStream)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v3));
    Object v5 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v5));
    Object v7 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v6));
    Object v8 = 54.84792226060818D;
    Object v9 = 0;
    Object v10 = 1;
    Object v11 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    ((com.google.javascript.jscomp.NodeTraversal)v7).traverse(((com.google.javascript.rhino.Node)v11));
    Object v12 = null;
    ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v0).exitScope(((com.google.javascript.jscomp.NodeTraversal)v7));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v1 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v0).stripConstIfReplaced();
    Object v2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v0));
    Object v3 = new java.io.ByteArrayOutputStream();
    Object v4 = false;
    Object v5 = new java.io.PrintStream(((java.io.OutputStream)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v5));
    Object v7 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v8 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.NodeTraversal.Callback)v8));
    Object v10 = 54.84792226060818D;
    Object v11 = 0;
    Object v12 = 1;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = ((com.google.javascript.rhino.Node)v13).cloneNode();
    Object v15 = 54.84792226060818D;
    Object v16 = 0;
    Object v17 = 1;
    Object v18 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v15).doubleValue()),(((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()));
    ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v9),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v18));
    Object v19 = null;
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v1 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v0).stripConstIfReplaced();
    Object v2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v0));
    Object v3 = new java.io.ByteArrayOutputStream();
    Object v4 = false;
    Object v5 = new java.io.PrintStream(((java.io.OutputStream)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v5));
    Object v7 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v8 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.NodeTraversal.Callback)v8));
    Object v10 = 54.84792226060818D;
    Object v11 = 0;
    Object v12 = 1;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = "parseIYnputs";
    Object v15 = "t";
    Object v16 = com.google.javascript.jscomp.DiagnosticType.warning(((java.lang.String)v14),((java.lang.String)v15));
    Object v17 = new java.lang.String[]{")","eval",""};
    ((com.google.javascript.jscomp.NodeTraversal)v9).report(((com.google.javascript.rhino.Node)v13),((com.google.javascript.jscomp.DiagnosticType)v16),((java.lang.String[])v17));
    Object v18 = null;
    Object v19 = 54.84792226060818D;
    Object v20 = 0;
    Object v21 = 1;
    Object v22 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v19).doubleValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()));
    Object v23 = true;
    ((com.google.javascript.rhino.Node)v22).setIsSyntheticBlock((((java.lang.Boolean)v23).booleanValue()));
    Object v24 = null;
    Object v25 = 54.84792226060818D;
    Object v26 = 0;
    Object v27 = 1;
    Object v28 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v25).doubleValue()),(((java.lang.Integer)v26).intValue()),(((java.lang.Integer)v27).intValue()));
    Object v29 = ((com.google.javascript.rhino.Node)v28).cloneNode();
    ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v2).visit(((com.google.javascript.jscomp.NodeTraversal)v9),((com.google.javascript.rhino.Node)v22),((com.google.javascript.rhino.Node)v28));
    Object v30 = null;
    org.junit.Assert.assertNull(v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v1 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v0).stripConstIfReplaced();
    Object v2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v0));
    Object v3 = new java.io.ByteArrayOutputStream();
    Object v4 = false;
    Object v5 = new java.io.PrintStream(((java.io.OutputStream)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v5));
    Object v7 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
    Object v8 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v7));
    Object v9 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v6),((com.google.javascript.jscomp.NodeTraversal.Callback)v8));
    Object v10 = 54.84792226060818D;
    Object v11 = 0;
    Object v12 = 1;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = 54.84792226060818D;
    Object v15 = 0;
    Object v16 = 1;
    Object v17 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v14).doubleValue()),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = true;
    ((com.google.javascript.rhino.Node)v17).setIsSyntheticBlock((((java.lang.Boolean)v18).booleanValue()));
    Object v19 = null;
    Object v20 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v2).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v9),((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.Node)v17));
    org.junit.Assert.assertEquals((Object)(true), v20);
  }
}
