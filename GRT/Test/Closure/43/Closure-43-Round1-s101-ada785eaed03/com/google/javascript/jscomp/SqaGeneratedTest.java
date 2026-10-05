package com.google.javascript.jscomp;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = com.google.javascript.jscomp.CodingConventions.getDefault();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v4));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = com.google.javascript.rhino.IR.nullNode();
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.jstype.ObjectType)v7));
    Object v9 = com.google.javascript.rhino.IR.nullNode();
    ((com.google.javascript.jscomp.TypedScopeCreator)v5).patchGlobalScope(((com.google.javascript.jscomp.Scope)v8),((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = com.google.javascript.rhino.IR.nullNode();
    Object v7 = com.google.javascript.rhino.IR.nullNode();
    Object v8 = null;
    Object v9 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.jstype.ObjectType)v8));
    Object v10 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v6),((com.google.javascript.jscomp.Scope)v9));
    Object v11 = com.google.javascript.rhino.IR.nullNode();
    Object v12 = com.google.javascript.rhino.IR.nullNode();
    Object v13 = null;
    Object v14 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.jstype.ObjectType)v13));
    Object v15 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v11),((com.google.javascript.jscomp.Scope)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = com.google.javascript.rhino.IR.nullNode();
    Object v7 = com.google.javascript.rhino.IR.nullNode();
    Object v8 = null;
    Object v9 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.jstype.ObjectType)v8));
    Object v10 = ((com.google.javascript.jscomp.Scope)v9).getVars();
    Object v11 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v6),((com.google.javascript.jscomp.Scope)v9));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = com.google.javascript.rhino.IR.nullNode();
    Object v7 = com.google.javascript.rhino.IR.nullNode();
    Object v8 = null;
    Object v9 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.jstype.ObjectType)v8));
    Object v10 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v6),((com.google.javascript.jscomp.Scope)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = com.google.javascript.rhino.IR.nullNode();
    Object v7 = com.google.javascript.rhino.IR.nullNode();
    Object v8 = null;
    Object v9 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.jstype.ObjectType)v8));
    Object v10 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v6),((com.google.javascript.jscomp.Scope)v9));
    Object v11 = com.google.javascript.rhino.IR.nullNode();
    Object v12 = null;
    Object v13 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.jstype.ObjectType)v12));
    Object v14 = "(function($t){})(y.prototype);";
    Object v15 = true;
    Object v16 = ((com.google.javascript.jscomp.Scope)v13).isDeclared(((java.lang.String)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = com.google.javascript.rhino.IR.nullNode();
    ((com.google.javascript.jscomp.TypedScopeCreator)v5).patchGlobalScope(((com.google.javascript.jscomp.Scope)v13),((com.google.javascript.rhino.Node)v17));
    Object v18 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = com.google.javascript.rhino.IR.nullNode();
    Object v7 = com.google.javascript.rhino.IR.nullNode();
    Object v8 = null;
    Object v9 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.jstype.ObjectType)v8));
    Object v10 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v6),((com.google.javascript.jscomp.Scope)v9));
    Object v11 = com.google.javascript.rhino.IR.nullNode();
    Object v12 = null;
    Object v13 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.jstype.ObjectType)v12));
    Object v14 = com.google.javascript.rhino.IR.nullNode();
    Object v15 = "prototypL";
    Object v16 = java.nio.charset.Charset.defaultCharset();
    Object v17 = new java.io.PrintStream(((java.lang.String)v15),((java.nio.charset.Charset)v16));
    ((com.google.javascript.rhino.Node)v14).appendStringTree(((java.lang.Appendable)v17));
    Object v18 = null;
    ((com.google.javascript.jscomp.TypedScopeCreator)v5).patchGlobalScope(((com.google.javascript.jscomp.Scope)v13),((com.google.javascript.rhino.Node)v14));
    Object v19 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = com.google.javascript.rhino.IR.nullNode();
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.jstype.ObjectType)v7));
    Object v9 = "A";
    Object v10 = ((com.google.javascript.jscomp.Scope)v8).getOwnSlot(((java.lang.String)v9));
    Object v11 = com.google.javascript.rhino.IR.nullNode();
    Object v12 = ((com.google.javascript.rhino.Node)v11).getLength();
    ((com.google.javascript.jscomp.TypedScopeCreator)v5).patchGlobalScope(((com.google.javascript.jscomp.Scope)v8),((com.google.javascript.rhino.Node)v11));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = com.google.javascript.rhino.IR.nullNode();
    Object v7 = com.google.javascript.rhino.IR.nullNode();
    Object v8 = null;
    Object v9 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.jstype.ObjectType)v8));
    Object v10 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v6),((com.google.javascript.jscomp.Scope)v9));
    Object v11 = com.google.javascript.rhino.IR.nullNode();
    Object v12 = null;
    Object v13 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.jstype.ObjectType)v12));
    Object v14 = com.google.javascript.rhino.IR.nullNode();
    ((com.google.javascript.jscomp.TypedScopeCreator)v5).patchGlobalScope(((com.google.javascript.jscomp.Scope)v13),((com.google.javascript.rhino.Node)v14));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = com.google.javascript.rhino.IR.nullNode();
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.jstype.ObjectType)v7));
    Object v9 = "<";
    Object v10 = true;
    Object v11 = ((com.google.javascript.jscomp.Scope)v8).isDeclared(((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = com.google.javascript.rhino.IR.nullNode();
    ((com.google.javascript.jscomp.TypedScopeCreator)v5).patchGlobalScope(((com.google.javascript.jscomp.Scope)v8),((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = com.google.javascript.rhino.IR.nullNode();
    Object v7 = com.google.javascript.rhino.IR.nullNode();
    Object v8 = null;
    Object v9 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.jstype.ObjectType)v8));
    Object v10 = ((com.google.javascript.jscomp.Scope)v9).getArgumentsVar();
    Object v11 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v6),((com.google.javascript.jscomp.Scope)v9));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = com.google.javascript.rhino.IR.nullNode();
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.jstype.ObjectType)v7));
    Object v9 = "u";
    Object v10 = true;
    Object v11 = ((com.google.javascript.jscomp.Scope)v8).isDeclared(((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = com.google.javascript.rhino.IR.nullNode();
    ((com.google.javascript.jscomp.TypedScopeCreator)v5).patchGlobalScope(((com.google.javascript.jscomp.Scope)v8),((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = com.google.javascript.rhino.IR.nullNode();
    Object v7 = com.google.javascript.rhino.IR.nullNode();
    Object v8 = null;
    Object v9 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.jstype.ObjectType)v8));
    Object v10 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v6),((com.google.javascript.jscomp.Scope)v9));
    Object v11 = com.google.javascript.rhino.IR.nullNode();
    Object v12 = null;
    Object v13 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.jstype.ObjectType)v12));
    Object v14 = com.google.javascript.rhino.IR.nullNode();
    Object v15 = ((com.google.javascript.rhino.Node)v14).isQualifiedName();
    ((com.google.javascript.jscomp.TypedScopeCreator)v5).patchGlobalScope(((com.google.javascript.jscomp.Scope)v13),((com.google.javascript.rhino.Node)v14));
    Object v16 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = com.google.javascript.rhino.IR.nullNode();
    Object v7 = 0;
    ((com.google.javascript.rhino.Node)v6).removeProp((((java.lang.Integer)v7).intValue()));
    Object v8 = null;
    Object v9 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createInitialScope(((com.google.javascript.rhino.Node)v6));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = com.google.javascript.rhino.IR.nullNode();
    Object v7 = 10;
    Object v8 = ((com.google.javascript.rhino.Node)v6).getProp((((java.lang.Integer)v7).intValue()));
    Object v9 = "prototypL";
    Object v10 = java.nio.charset.Charset.defaultCharset();
    Object v11 = new java.io.PrintStream(((java.lang.String)v9),((java.nio.charset.Charset)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v11));
    Object v13 = ((com.google.javascript.jscomp.AbstractCompiler)v12).getErrorManager();
    Object v14 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v15 = com.google.javascript.rhino.IR.nullNode();
    Object v16 = com.google.javascript.rhino.IR.nullNode();
    Object v17 = null;
    Object v18 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v16),((com.google.javascript.rhino.jstype.ObjectType)v17));
    Object v19 = ((com.google.javascript.jscomp.TypedScopeCreator)v14).createScope(((com.google.javascript.rhino.Node)v15),((com.google.javascript.jscomp.Scope)v18));
    Object v20 = com.google.javascript.rhino.IR.nullNode();
    Object v21 = com.google.javascript.rhino.IR.nullNode();
    Object v22 = null;
    Object v23 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v21),((com.google.javascript.rhino.jstype.ObjectType)v22));
    Object v24 = ((com.google.javascript.jscomp.TypedScopeCreator)v14).createScope(((com.google.javascript.rhino.Node)v20),((com.google.javascript.jscomp.Scope)v23));
    Object v25 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v6),((com.google.javascript.jscomp.Scope)v24));
    org.junit.Assert.assertNotNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = com.google.javascript.rhino.IR.nullNode();
    Object v7 = com.google.javascript.rhino.IR.nullNode();
    Object v8 = null;
    Object v9 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.jstype.ObjectType)v8));
    Object v10 = "c";
    Object v11 = true;
    Object v12 = ((com.google.javascript.jscomp.Scope)v9).isDeclared(((java.lang.String)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v6),((com.google.javascript.jscomp.Scope)v9));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = com.google.javascript.rhino.IR.nullNode();
    Object v7 = 20;
    Object v8 = ((com.google.javascript.rhino.Node)v6).getAncestor((((java.lang.Integer)v7).intValue()));
    Object v9 = com.google.javascript.rhino.IR.nullNode();
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.jstype.ObjectType)v10));
    Object v12 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v6),((com.google.javascript.jscomp.Scope)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = com.google.javascript.rhino.IR.nullNode();
    Object v7 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createInitialScope(((com.google.javascript.rhino.Node)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = com.google.javascript.rhino.IR.nullNode();
    Object v7 = com.google.javascript.rhino.IR.nullNode();
    Object v8 = ((com.google.javascript.rhino.Node)v6).isEquivalentToTyped(((com.google.javascript.rhino.Node)v7));
    Object v9 = com.google.javascript.rhino.IR.nullNode();
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.jstype.ObjectType)v10));
    Object v12 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v6),((com.google.javascript.jscomp.Scope)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = com.google.javascript.rhino.IR.nullNode();
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.jstype.ObjectType)v7));
    Object v9 = "{";
    Object v10 = ((com.google.javascript.jscomp.Scope)v8).getVar(((java.lang.String)v9));
    Object v11 = com.google.javascript.rhino.IR.nullNode();
    ((com.google.javascript.jscomp.TypedScopeCreator)v5).patchGlobalScope(((com.google.javascript.jscomp.Scope)v8),((com.google.javascript.rhino.Node)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = com.google.javascript.jscomp.CodingConventions.getDefault();
    Object v5 = com.google.javascript.rhino.IR.nullNode();
    Object v6 = ((com.google.javascript.jscomp.CodingConvention)v4).describeFunctionBind(((com.google.javascript.rhino.Node)v5));
    Object v7 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v4));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = com.google.javascript.rhino.IR.nullNode();
    Object v7 = ((com.google.javascript.rhino.Node)v6).getSourceOffset();
    Object v8 = com.google.javascript.rhino.IR.nullNode();
    Object v9 = null;
    Object v10 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.jstype.ObjectType)v9));
    Object v11 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v6),((com.google.javascript.jscomp.Scope)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = "prototypL";
    Object v7 = java.nio.charset.Charset.defaultCharset();
    Object v8 = new java.io.PrintStream(((java.lang.String)v6),((java.nio.charset.Charset)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v8));
    Object v10 = ((com.google.javascript.jscomp.AbstractCompiler)v9).getErrorManager();
    Object v11 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v9));
    Object v12 = com.google.javascript.rhino.IR.nullNode();
    Object v13 = 0;
    ((com.google.javascript.rhino.Node)v12).removeProp((((java.lang.Integer)v13).intValue()));
    Object v14 = null;
    Object v15 = ((com.google.javascript.jscomp.TypedScopeCreator)v11).createInitialScope(((com.google.javascript.rhino.Node)v12));
    Object v16 = ((com.google.javascript.jscomp.Scope)v15).getDeclarativelyUnboundVarsWithoutTypes();
    Object v17 = com.google.javascript.rhino.IR.nullNode();
    ((com.google.javascript.jscomp.TypedScopeCreator)v5).patchGlobalScope(((com.google.javascript.jscomp.Scope)v15),((com.google.javascript.rhino.Node)v17));
    Object v18 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = com.google.javascript.rhino.IR.nullNode();
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.jstype.ObjectType)v7));
    Object v9 = com.google.javascript.rhino.IR.nullNode();
    Object v10 = com.google.javascript.jscomp.CodingConventions.getDefault();
    Object v11 = java.util.Set.of(((java.lang.Object)v10));
    ((com.google.javascript.rhino.Node)v9).setDirectives(((java.util.Set)v11));
    Object v12 = null;
    ((com.google.javascript.jscomp.TypedScopeCreator)v5).patchGlobalScope(((com.google.javascript.jscomp.Scope)v8),((com.google.javascript.rhino.Node)v9));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = com.google.javascript.rhino.IR.nullNode();
    Object v7 = com.google.javascript.rhino.IR.nullNode();
    Object v8 = null;
    Object v9 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.jstype.ObjectType)v8));
    Object v10 = com.google.javascript.rhino.IR.nullNode();
    Object v11 = null;
    Object v12 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.ObjectType)v11));
    Object v13 = new com.google.javascript.jscomp.Scope.Arguments(((com.google.javascript.jscomp.Scope)v12));
    Object v14 = ((com.google.javascript.jscomp.Scope)v9).getReferences(((com.google.javascript.jscomp.Scope.Var)v13));
    Object v15 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v6),((com.google.javascript.jscomp.Scope)v9));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = com.google.javascript.rhino.IR.nullNode();
    Object v7 = com.google.javascript.rhino.IR.nullNode();
    Object v8 = null;
    Object v9 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.jstype.ObjectType)v8));
    Object v10 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v6),((com.google.javascript.jscomp.Scope)v9));
    Object v11 = com.google.javascript.rhino.IR.nullNode();
    Object v12 = null;
    Object v13 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.jstype.ObjectType)v12));
    Object v14 = "";
    Object v15 = ((com.google.javascript.jscomp.Scope)v13).getVar(((java.lang.String)v14));
    Object v16 = com.google.javascript.rhino.IR.nullNode();
    ((com.google.javascript.jscomp.TypedScopeCreator)v5).patchGlobalScope(((com.google.javascript.jscomp.Scope)v13),((com.google.javascript.rhino.Node)v16));
    Object v17 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = com.google.javascript.rhino.IR.nullNode();
    Object v7 = "prototypL";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = new java.io.PrintStream(((java.lang.String)v7),((java.nio.charset.Charset)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = ((com.google.javascript.jscomp.AbstractCompiler)v10).getErrorManager();
    Object v12 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v13 = com.google.javascript.rhino.IR.nullNode();
    Object v14 = com.google.javascript.rhino.IR.nullNode();
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.jstype.ObjectType)v15));
    Object v17 = "c";
    Object v18 = true;
    Object v19 = ((com.google.javascript.jscomp.Scope)v16).isDeclared(((java.lang.String)v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = ((com.google.javascript.jscomp.TypedScopeCreator)v12).createScope(((com.google.javascript.rhino.Node)v13),((com.google.javascript.jscomp.Scope)v16));
    Object v21 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v6),((com.google.javascript.jscomp.Scope)v20));
    Object v22 = com.google.javascript.rhino.IR.nullNode();
    Object v23 = com.google.javascript.rhino.IR.nullNode();
    Object v24 = null;
    Object v25 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v23),((com.google.javascript.rhino.jstype.ObjectType)v24));
    Object v26 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v22),((com.google.javascript.jscomp.Scope)v25));
    org.junit.Assert.assertNotNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = "prototypL";
    Object v7 = java.nio.charset.Charset.defaultCharset();
    Object v8 = new java.io.PrintStream(((java.lang.String)v6),((java.nio.charset.Charset)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v8));
    Object v10 = ((com.google.javascript.jscomp.AbstractCompiler)v9).getErrorManager();
    Object v11 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v9));
    Object v12 = com.google.javascript.rhino.IR.nullNode();
    Object v13 = ((com.google.javascript.jscomp.TypedScopeCreator)v11).createInitialScope(((com.google.javascript.rhino.Node)v12));
    Object v14 = com.google.javascript.rhino.IR.nullNode();
    ((com.google.javascript.jscomp.TypedScopeCreator)v5).patchGlobalScope(((com.google.javascript.jscomp.Scope)v13),((com.google.javascript.rhino.Node)v14));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = com.google.javascript.rhino.IR.nullNode();
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.jstype.ObjectType)v7));
    Object v9 = com.google.javascript.rhino.IR.nullNode();
    Object v10 = ((com.google.javascript.rhino.Node)v9).getSourceFileName();
    ((com.google.javascript.jscomp.TypedScopeCreator)v5).patchGlobalScope(((com.google.javascript.jscomp.Scope)v8),((com.google.javascript.rhino.Node)v9));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = com.google.javascript.rhino.IR.nullNode();
    Object v7 = com.google.javascript.rhino.IR.nullNode();
    Object v8 = null;
    Object v9 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.jstype.ObjectType)v8));
    Object v10 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v6),((com.google.javascript.jscomp.Scope)v9));
    Object v11 = com.google.javascript.rhino.IR.nullNode();
    Object v12 = ((com.google.javascript.rhino.Node)v11).getStaticSourceFile();
    Object v13 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createInitialScope(((com.google.javascript.rhino.Node)v11));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = com.google.javascript.rhino.IR.nullNode();
    Object v7 = "b";
    ((com.google.javascript.rhino.Node)v6).setSourceFileForTesting(((java.lang.String)v7));
    Object v8 = null;
    Object v9 = com.google.javascript.rhino.IR.nullNode();
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.jstype.ObjectType)v10));
    Object v12 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v6),((com.google.javascript.jscomp.Scope)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = com.google.javascript.rhino.IR.nullNode();
    Object v7 = com.google.javascript.rhino.IR.nullNode();
    Object v8 = null;
    Object v9 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.jstype.ObjectType)v8));
    Object v10 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v6),((com.google.javascript.jscomp.Scope)v9));
    Object v11 = com.google.javascript.rhino.IR.nullNode();
    Object v12 = com.google.javascript.rhino.IR.nullNode();
    Object v13 = null;
    Object v14 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.jstype.ObjectType)v13));
    Object v15 = ((com.google.javascript.jscomp.Scope)v14).getDeclarativelyUnboundVarsWithoutTypes();
    Object v16 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v11),((com.google.javascript.jscomp.Scope)v14));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = com.google.javascript.rhino.IR.nullNode();
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.jstype.ObjectType)v7));
    Object v9 = com.google.javascript.rhino.IR.nullNode();
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.jstype.ObjectType)v10));
    Object v12 = new com.google.javascript.jscomp.Scope.Arguments(((com.google.javascript.jscomp.Scope)v11));
    Object v13 = ((com.google.javascript.jscomp.Scope)v8).getReferences(((com.google.javascript.jscomp.Scope.Var)v12));
    Object v14 = com.google.javascript.rhino.IR.nullNode();
    ((com.google.javascript.jscomp.TypedScopeCreator)v5).patchGlobalScope(((com.google.javascript.jscomp.Scope)v8),((com.google.javascript.rhino.Node)v14));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = com.google.javascript.rhino.IR.nullNode();
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.jstype.ObjectType)v7));
    Object v9 = "indexOf";
    Object v10 = true;
    Object v11 = ((com.google.javascript.jscomp.Scope)v8).isDeclared(((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = com.google.javascript.rhino.IR.nullNode();
    ((com.google.javascript.jscomp.TypedScopeCreator)v5).patchGlobalScope(((com.google.javascript.jscomp.Scope)v8),((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = com.google.javascript.rhino.IR.nullNode();
    Object v7 = 0;
    Object v8 = ((com.google.javascript.rhino.Node)v6).getBooleanProp((((java.lang.Integer)v7).intValue()));
    Object v9 = com.google.javascript.rhino.IR.nullNode();
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.jstype.ObjectType)v10));
    Object v12 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v6),((com.google.javascript.jscomp.Scope)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = com.google.javascript.rhino.IR.nullNode();
    Object v7 = ((com.google.javascript.rhino.Node)v6).isOptionalArg();
    Object v8 = com.google.javascript.rhino.IR.nullNode();
    Object v9 = null;
    Object v10 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.jstype.ObjectType)v9));
    Object v11 = "a";
    Object v12 = ((com.google.javascript.jscomp.Scope)v10).getSlot(((java.lang.String)v11));
    Object v13 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v6),((com.google.javascript.jscomp.Scope)v10));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = com.google.javascript.rhino.IR.nullNode();
    Object v7 = com.google.javascript.rhino.IR.nullNode();
    Object v8 = null;
    Object v9 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.jstype.ObjectType)v8));
    Object v10 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v6),((com.google.javascript.jscomp.Scope)v9));
    Object v11 = com.google.javascript.rhino.IR.nullNode();
    Object v12 = "prototypL";
    Object v13 = java.nio.charset.Charset.defaultCharset();
    Object v14 = new java.io.PrintStream(((java.lang.String)v12),((java.nio.charset.Charset)v13));
    Object v15 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v14));
    Object v16 = ((com.google.javascript.jscomp.AbstractCompiler)v15).getErrorManager();
    Object v17 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v15));
    Object v18 = com.google.javascript.rhino.IR.nullNode();
    Object v19 = com.google.javascript.rhino.IR.nullNode();
    Object v20 = null;
    Object v21 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v19),((com.google.javascript.rhino.jstype.ObjectType)v20));
    Object v22 = ((com.google.javascript.jscomp.TypedScopeCreator)v17).createScope(((com.google.javascript.rhino.Node)v18),((com.google.javascript.jscomp.Scope)v21));
    Object v23 = com.google.javascript.rhino.IR.nullNode();
    Object v24 = ((com.google.javascript.rhino.Node)v23).getStaticSourceFile();
    Object v25 = ((com.google.javascript.jscomp.TypedScopeCreator)v17).createInitialScope(((com.google.javascript.rhino.Node)v23));
    Object v26 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v11),((com.google.javascript.jscomp.Scope)v25));
    org.junit.Assert.assertNotNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = com.google.javascript.rhino.IR.nullNode();
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.jstype.ObjectType)v7));
    Object v9 = ((com.google.javascript.jscomp.Scope)v8).getVars();
    Object v10 = com.google.javascript.rhino.IR.nullNode();
    ((com.google.javascript.jscomp.TypedScopeCreator)v5).patchGlobalScope(((com.google.javascript.jscomp.Scope)v8),((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = com.google.javascript.rhino.IR.nullNode();
    Object v7 = ((com.google.javascript.rhino.Node)v6).toStringTree();
    Object v8 = com.google.javascript.rhino.IR.nullNode();
    Object v9 = null;
    Object v10 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.jstype.ObjectType)v9));
    Object v11 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v6),((com.google.javascript.jscomp.Scope)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getTopScope();
    Object v5 = com.google.javascript.jscomp.CodingConventions.getDefault();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = "prototypL";
    Object v7 = java.nio.charset.Charset.defaultCharset();
    Object v8 = new java.io.PrintStream(((java.lang.String)v6),((java.nio.charset.Charset)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v8));
    Object v10 = ((com.google.javascript.jscomp.AbstractCompiler)v9).getErrorManager();
    Object v11 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v9));
    Object v12 = com.google.javascript.rhino.IR.nullNode();
    Object v13 = com.google.javascript.rhino.IR.nullNode();
    Object v14 = null;
    Object v15 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.jstype.ObjectType)v14));
    Object v16 = ((com.google.javascript.jscomp.TypedScopeCreator)v11).createScope(((com.google.javascript.rhino.Node)v12),((com.google.javascript.jscomp.Scope)v15));
    Object v17 = com.google.javascript.rhino.IR.nullNode();
    Object v18 = com.google.javascript.rhino.IR.nullNode();
    Object v19 = null;
    Object v20 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v18),((com.google.javascript.rhino.jstype.ObjectType)v19));
    Object v21 = ((com.google.javascript.jscomp.TypedScopeCreator)v11).createScope(((com.google.javascript.rhino.Node)v17),((com.google.javascript.jscomp.Scope)v20));
    Object v22 = com.google.javascript.rhino.IR.nullNode();
    ((com.google.javascript.jscomp.TypedScopeCreator)v5).patchGlobalScope(((com.google.javascript.jscomp.Scope)v21),((com.google.javascript.rhino.Node)v22));
    Object v23 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = com.google.javascript.rhino.IR.nullNode();
    Object v7 = 30;
    Object v8 = 0;
    ((com.google.javascript.rhino.Node)v6).putIntProp((((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v9 = null;
    Object v10 = com.google.javascript.rhino.IR.nullNode();
    Object v11 = null;
    Object v12 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.ObjectType)v11));
    Object v13 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v6),((com.google.javascript.jscomp.Scope)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = com.google.javascript.rhino.IR.nullNode();
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.jstype.ObjectType)v7));
    Object v9 = com.google.javascript.rhino.IR.nullNode();
    Object v10 = ((com.google.javascript.rhino.Node)v9).getAncestors();
    ((com.google.javascript.jscomp.TypedScopeCreator)v5).patchGlobalScope(((com.google.javascript.jscomp.Scope)v8),((com.google.javascript.rhino.Node)v9));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = com.google.javascript.rhino.IR.nullNode();
    Object v7 = com.google.javascript.rhino.IR.nullNode();
    Object v8 = null;
    Object v9 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.jstype.ObjectType)v8));
    Object v10 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v6),((com.google.javascript.jscomp.Scope)v9));
    Object v11 = com.google.javascript.rhino.IR.nullNode();
    Object v12 = null;
    Object v13 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.jstype.ObjectType)v12));
    Object v14 = "";
    Object v15 = ((com.google.javascript.jscomp.Scope)v13).getOwnSlot(((java.lang.String)v14));
    Object v16 = com.google.javascript.rhino.IR.nullNode();
    ((com.google.javascript.jscomp.TypedScopeCreator)v5).patchGlobalScope(((com.google.javascript.jscomp.Scope)v13),((com.google.javascript.rhino.Node)v16));
    Object v17 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = com.google.javascript.rhino.IR.nullNode();
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.jstype.ObjectType)v7));
    Object v9 = ((com.google.javascript.jscomp.Scope)v8).getVarCount();
    Object v10 = com.google.javascript.rhino.IR.nullNode();
    ((com.google.javascript.jscomp.TypedScopeCreator)v5).patchGlobalScope(((com.google.javascript.jscomp.Scope)v8),((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = com.google.javascript.rhino.IR.nullNode();
    Object v7 = ((com.google.javascript.rhino.Node)v6).getSourceFileName();
    Object v8 = com.google.javascript.rhino.IR.nullNode();
    Object v9 = null;
    Object v10 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.jstype.ObjectType)v9));
    Object v11 = ((com.google.javascript.jscomp.Scope)v10).getVarCount();
    Object v12 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v6),((com.google.javascript.jscomp.Scope)v10));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = com.google.javascript.rhino.IR.nullNode();
    Object v7 = ((com.google.javascript.rhino.Node)v6).isOnlyModifiesThisCall();
    Object v8 = com.google.javascript.rhino.IR.nullNode();
    Object v9 = null;
    Object v10 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.jstype.ObjectType)v9));
    Object v11 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v6),((com.google.javascript.jscomp.Scope)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = com.google.javascript.rhino.IR.nullNode();
    Object v7 = com.google.javascript.rhino.IR.nullNode();
    Object v8 = null;
    Object v9 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.jstype.ObjectType)v8));
    Object v10 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v6),((com.google.javascript.jscomp.Scope)v9));
    Object v11 = com.google.javascript.rhino.IR.nullNode();
    Object v12 = null;
    Object v13 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.jstype.ObjectType)v12));
    Object v14 = ((com.google.javascript.jscomp.Scope)v13).getAllSymbols();
    Object v15 = com.google.javascript.rhino.IR.nullNode();
    ((com.google.javascript.jscomp.TypedScopeCreator)v5).patchGlobalScope(((com.google.javascript.jscomp.Scope)v13),((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = com.google.javascript.jscomp.CodingConventions.getDefault();
    Object v5 = "]";
    Object v6 = ((com.google.javascript.jscomp.CodingConvention)v4).isConstantKey(((java.lang.String)v5));
    Object v7 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v4));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = com.google.javascript.rhino.IR.nullNode();
    Object v7 = com.google.javascript.rhino.IR.nullNode();
    Object v8 = ((com.google.javascript.rhino.Node)v6).copyInformationFromForTree(((com.google.javascript.rhino.Node)v7));
    Object v9 = com.google.javascript.rhino.IR.nullNode();
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.jstype.ObjectType)v10));
    Object v12 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v6),((com.google.javascript.jscomp.Scope)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = com.google.javascript.rhino.IR.nullNode();
    Object v7 = com.google.javascript.rhino.IR.nullNode();
    Object v8 = null;
    Object v9 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.jstype.ObjectType)v8));
    Object v10 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v6),((com.google.javascript.jscomp.Scope)v9));
    Object v11 = com.google.javascript.rhino.IR.nullNode();
    Object v12 = null;
    Object v13 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.jstype.ObjectType)v12));
    Object v14 = ((com.google.javascript.jscomp.Scope)v13).getArgumentsVar();
    Object v15 = com.google.javascript.rhino.IR.nullNode();
    ((com.google.javascript.jscomp.TypedScopeCreator)v5).patchGlobalScope(((com.google.javascript.jscomp.Scope)v13),((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    ((com.google.javascript.jscomp.AbstractCompiler)v3).reportCodeChange();
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = com.google.javascript.rhino.IR.nullNode();
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.jstype.ObjectType)v7));
    Object v9 = ((com.google.javascript.jscomp.Scope)v8).getDeclarativelyUnboundVarsWithoutTypes();
    Object v10 = com.google.javascript.rhino.IR.nullNode();
    ((com.google.javascript.jscomp.TypedScopeCreator)v5).patchGlobalScope(((com.google.javascript.jscomp.Scope)v8),((com.google.javascript.rhino.Node)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = com.google.javascript.rhino.IR.nullNode();
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.jstype.ObjectType)v7));
    Object v9 = "Name";
    Object v10 = ((com.google.javascript.jscomp.Scope)v8).getVar(((java.lang.String)v9));
    Object v11 = com.google.javascript.rhino.IR.nullNode();
    ((com.google.javascript.jscomp.TypedScopeCreator)v5).patchGlobalScope(((com.google.javascript.jscomp.Scope)v8),((com.google.javascript.rhino.Node)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = com.google.javascript.rhino.IR.nullNode();
    Object v7 = "prototypL";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = new java.io.PrintStream(((java.lang.String)v7),((java.nio.charset.Charset)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = ((com.google.javascript.jscomp.AbstractCompiler)v10).getErrorManager();
    Object v12 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v13 = com.google.javascript.rhino.IR.nullNode();
    Object v14 = "prototypL";
    Object v15 = java.nio.charset.Charset.defaultCharset();
    Object v16 = new java.io.PrintStream(((java.lang.String)v14),((java.nio.charset.Charset)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v16));
    Object v18 = ((com.google.javascript.jscomp.AbstractCompiler)v17).getErrorManager();
    Object v19 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v17));
    Object v20 = com.google.javascript.rhino.IR.nullNode();
    Object v21 = com.google.javascript.rhino.IR.nullNode();
    Object v22 = null;
    Object v23 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v21),((com.google.javascript.rhino.jstype.ObjectType)v22));
    Object v24 = "c";
    Object v25 = true;
    Object v26 = ((com.google.javascript.jscomp.Scope)v23).isDeclared(((java.lang.String)v24),(((java.lang.Boolean)v25).booleanValue()));
    Object v27 = ((com.google.javascript.jscomp.TypedScopeCreator)v19).createScope(((com.google.javascript.rhino.Node)v20),((com.google.javascript.jscomp.Scope)v23));
    Object v28 = ((com.google.javascript.jscomp.TypedScopeCreator)v12).createScope(((com.google.javascript.rhino.Node)v13),((com.google.javascript.jscomp.Scope)v27));
    Object v29 = com.google.javascript.rhino.IR.nullNode();
    Object v30 = com.google.javascript.rhino.IR.nullNode();
    Object v31 = null;
    Object v32 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v30),((com.google.javascript.rhino.jstype.ObjectType)v31));
    Object v33 = ((com.google.javascript.jscomp.TypedScopeCreator)v12).createScope(((com.google.javascript.rhino.Node)v29),((com.google.javascript.jscomp.Scope)v32));
    Object v34 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v6),((com.google.javascript.jscomp.Scope)v33));
    org.junit.Assert.assertNotNull(v34);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = com.google.javascript.rhino.IR.nullNode();
    Object v7 = "prototypL";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = new java.io.PrintStream(((java.lang.String)v7),((java.nio.charset.Charset)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = ((com.google.javascript.jscomp.AbstractCompiler)v10).getErrorManager();
    Object v12 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v13 = com.google.javascript.rhino.IR.nullNode();
    Object v14 = "prototypL";
    Object v15 = java.nio.charset.Charset.defaultCharset();
    Object v16 = new java.io.PrintStream(((java.lang.String)v14),((java.nio.charset.Charset)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v16));
    Object v18 = ((com.google.javascript.jscomp.AbstractCompiler)v17).getErrorManager();
    Object v19 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v17));
    Object v20 = com.google.javascript.rhino.IR.nullNode();
    Object v21 = com.google.javascript.rhino.IR.nullNode();
    Object v22 = null;
    Object v23 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v21),((com.google.javascript.rhino.jstype.ObjectType)v22));
    Object v24 = "c";
    Object v25 = true;
    Object v26 = ((com.google.javascript.jscomp.Scope)v23).isDeclared(((java.lang.String)v24),(((java.lang.Boolean)v25).booleanValue()));
    Object v27 = ((com.google.javascript.jscomp.TypedScopeCreator)v19).createScope(((com.google.javascript.rhino.Node)v20),((com.google.javascript.jscomp.Scope)v23));
    Object v28 = ((com.google.javascript.jscomp.TypedScopeCreator)v12).createScope(((com.google.javascript.rhino.Node)v13),((com.google.javascript.jscomp.Scope)v27));
    Object v29 = com.google.javascript.rhino.IR.nullNode();
    Object v30 = com.google.javascript.rhino.IR.nullNode();
    Object v31 = null;
    Object v32 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v30),((com.google.javascript.rhino.jstype.ObjectType)v31));
    Object v33 = ((com.google.javascript.jscomp.TypedScopeCreator)v12).createScope(((com.google.javascript.rhino.Node)v29),((com.google.javascript.jscomp.Scope)v32));
    Object v34 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v6),((com.google.javascript.jscomp.Scope)v33));
    Object v35 = com.google.javascript.rhino.IR.nullNode();
    Object v36 = com.google.javascript.rhino.IR.nullNode();
    Object v37 = null;
    Object v38 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v36),((com.google.javascript.rhino.jstype.ObjectType)v37));
    Object v39 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v35),((com.google.javascript.jscomp.Scope)v38));
    org.junit.Assert.assertNotNull(v39);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = "prototypL";
    Object v7 = java.nio.charset.Charset.defaultCharset();
    Object v8 = new java.io.PrintStream(((java.lang.String)v6),((java.nio.charset.Charset)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v8));
    Object v10 = ((com.google.javascript.jscomp.AbstractCompiler)v9).getErrorManager();
    Object v11 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v9));
    Object v12 = com.google.javascript.rhino.IR.nullNode();
    Object v13 = com.google.javascript.rhino.IR.nullNode();
    Object v14 = null;
    Object v15 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.jstype.ObjectType)v14));
    Object v16 = com.google.javascript.rhino.IR.nullNode();
    Object v17 = null;
    Object v18 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v16),((com.google.javascript.rhino.jstype.ObjectType)v17));
    Object v19 = new com.google.javascript.jscomp.Scope.Arguments(((com.google.javascript.jscomp.Scope)v18));
    Object v20 = ((com.google.javascript.jscomp.Scope)v15).getReferences(((com.google.javascript.jscomp.Scope.Var)v19));
    Object v21 = ((com.google.javascript.jscomp.TypedScopeCreator)v11).createScope(((com.google.javascript.rhino.Node)v12),((com.google.javascript.jscomp.Scope)v15));
    Object v22 = com.google.javascript.rhino.IR.nullNode();
    ((com.google.javascript.jscomp.TypedScopeCreator)v5).patchGlobalScope(((com.google.javascript.jscomp.Scope)v21),((com.google.javascript.rhino.Node)v22));
    Object v23 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = com.google.javascript.rhino.IR.nullNode();
    Object v7 = "prototypL";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = new java.io.PrintStream(((java.lang.String)v7),((java.nio.charset.Charset)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = ((com.google.javascript.jscomp.AbstractCompiler)v10).getErrorManager();
    Object v12 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v13 = com.google.javascript.rhino.IR.nullNode();
    Object v14 = 20;
    Object v15 = ((com.google.javascript.rhino.Node)v13).getAncestor((((java.lang.Integer)v14).intValue()));
    Object v16 = com.google.javascript.rhino.IR.nullNode();
    Object v17 = null;
    Object v18 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v16),((com.google.javascript.rhino.jstype.ObjectType)v17));
    Object v19 = ((com.google.javascript.jscomp.TypedScopeCreator)v12).createScope(((com.google.javascript.rhino.Node)v13),((com.google.javascript.jscomp.Scope)v18));
    Object v20 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v6),((com.google.javascript.jscomp.Scope)v19));
    Object v21 = com.google.javascript.rhino.IR.nullNode();
    Object v22 = null;
    Object v23 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v21),((com.google.javascript.rhino.jstype.ObjectType)v22));
    Object v24 = com.google.javascript.rhino.IR.nullNode();
    ((com.google.javascript.jscomp.TypedScopeCreator)v5).patchGlobalScope(((com.google.javascript.jscomp.Scope)v23),((com.google.javascript.rhino.Node)v24));
    Object v25 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = com.google.javascript.rhino.IR.nullNode();
    Object v7 = com.google.javascript.rhino.IR.nullNode();
    Object v8 = null;
    Object v9 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.jstype.ObjectType)v8));
    Object v10 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v6),((com.google.javascript.jscomp.Scope)v9));
    Object v11 = com.google.javascript.rhino.IR.nullNode();
    Object v12 = ((com.google.javascript.rhino.Node)v11).isOptionalArg();
    Object v13 = com.google.javascript.rhino.IR.nullNode();
    Object v14 = null;
    Object v15 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.jstype.ObjectType)v14));
    Object v16 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v11),((com.google.javascript.jscomp.Scope)v15));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = "prototypL";
    Object v7 = java.nio.charset.Charset.defaultCharset();
    Object v8 = new java.io.PrintStream(((java.lang.String)v6),((java.nio.charset.Charset)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v8));
    Object v10 = ((com.google.javascript.jscomp.AbstractCompiler)v9).getErrorManager();
    Object v11 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v9));
    Object v12 = com.google.javascript.rhino.IR.nullNode();
    Object v13 = ((com.google.javascript.jscomp.TypedScopeCreator)v11).createInitialScope(((com.google.javascript.rhino.Node)v12));
    Object v14 = "2";
    Object v15 = true;
    Object v16 = ((com.google.javascript.jscomp.Scope)v13).isDeclared(((java.lang.String)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = com.google.javascript.rhino.IR.nullNode();
    ((com.google.javascript.jscomp.TypedScopeCreator)v5).patchGlobalScope(((com.google.javascript.jscomp.Scope)v13),((com.google.javascript.rhino.Node)v17));
    Object v18 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = com.google.javascript.rhino.IR.nullNode();
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.jstype.ObjectType)v7));
    Object v9 = com.google.javascript.rhino.IR.nullNode();
    Object v10 = 7;
    Object v11 = 62;
    ((com.google.javascript.rhino.Node)v9).putIntProp((((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v12 = null;
    ((com.google.javascript.jscomp.TypedScopeCreator)v5).patchGlobalScope(((com.google.javascript.jscomp.Scope)v8),((com.google.javascript.rhino.Node)v9));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = com.google.javascript.rhino.IR.nullNode();
    Object v7 = com.google.javascript.rhino.IR.nullNode();
    Object v8 = null;
    Object v9 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.jstype.ObjectType)v8));
    Object v10 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v6),((com.google.javascript.jscomp.Scope)v9));
    Object v11 = com.google.javascript.rhino.IR.nullNode();
    Object v12 = null;
    Object v13 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.jstype.ObjectType)v12));
    Object v14 = com.google.javascript.rhino.IR.nullNode();
    Object v15 = 1;
    Object v16 = ((com.google.javascript.rhino.Node)v14).getBooleanProp((((java.lang.Integer)v15).intValue()));
    ((com.google.javascript.jscomp.TypedScopeCreator)v5).patchGlobalScope(((com.google.javascript.jscomp.Scope)v13),((com.google.javascript.rhino.Node)v14));
    Object v17 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = com.google.javascript.rhino.IR.nullNode();
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.jstype.ObjectType)v7));
    Object v9 = com.google.javascript.rhino.IR.nullNode();
    Object v10 = ((com.google.javascript.rhino.Node)v9).isOptionalArg();
    ((com.google.javascript.jscomp.TypedScopeCreator)v5).patchGlobalScope(((com.google.javascript.jscomp.Scope)v8),((com.google.javascript.rhino.Node)v9));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = com.google.javascript.rhino.IR.nullNode();
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.jstype.ObjectType)v7));
    Object v9 = "Invalid map format: section must have either 'map' or 'url'";
    Object v10 = ((com.google.javascript.jscomp.Scope)v8).getOwnSlot(((java.lang.String)v9));
    Object v11 = com.google.javascript.rhino.IR.nullNode();
    Object v12 = com.google.javascript.rhino.IR.nullNode();
    ((com.google.javascript.rhino.Node)v11).addChildToBack(((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
    ((com.google.javascript.jscomp.TypedScopeCreator)v5).patchGlobalScope(((com.google.javascript.jscomp.Scope)v8),((com.google.javascript.rhino.Node)v11));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = com.google.javascript.rhino.IR.nullNode();
    Object v7 = "prototypL";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = new java.io.PrintStream(((java.lang.String)v7),((java.nio.charset.Charset)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = ((com.google.javascript.jscomp.AbstractCompiler)v10).getErrorManager();
    Object v12 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v13 = com.google.javascript.rhino.IR.nullNode();
    Object v14 = ((com.google.javascript.rhino.Node)v13).isOptionalArg();
    Object v15 = com.google.javascript.rhino.IR.nullNode();
    Object v16 = null;
    Object v17 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v15),((com.google.javascript.rhino.jstype.ObjectType)v16));
    Object v18 = "a";
    Object v19 = ((com.google.javascript.jscomp.Scope)v17).getSlot(((java.lang.String)v18));
    Object v20 = ((com.google.javascript.jscomp.TypedScopeCreator)v12).createScope(((com.google.javascript.rhino.Node)v13),((com.google.javascript.jscomp.Scope)v17));
    Object v21 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v6),((com.google.javascript.jscomp.Scope)v20));
    Object v22 = com.google.javascript.rhino.IR.nullNode();
    Object v23 = com.google.javascript.rhino.IR.nullNode();
    Object v24 = null;
    Object v25 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v23),((com.google.javascript.rhino.jstype.ObjectType)v24));
    Object v26 = ((com.google.javascript.jscomp.Scope)v25).getVarCount();
    Object v27 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v22),((com.google.javascript.jscomp.Scope)v25));
    org.junit.Assert.assertNotNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = com.google.javascript.rhino.IR.nullNode();
    Object v7 = com.google.javascript.rhino.IR.nullNode();
    Object v8 = null;
    Object v9 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.jstype.ObjectType)v8));
    Object v10 = "";
    Object v11 = ((com.google.javascript.jscomp.Scope)v9).getSlot(((java.lang.String)v10));
    Object v12 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v6),((com.google.javascript.jscomp.Scope)v9));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = com.google.javascript.rhino.IR.nullNode();
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.jstype.ObjectType)v7));
    Object v9 = "DEFAULT";
    Object v10 = ((com.google.javascript.jscomp.Scope)v8).getVar(((java.lang.String)v9));
    Object v11 = com.google.javascript.rhino.IR.nullNode();
    ((com.google.javascript.jscomp.TypedScopeCreator)v5).patchGlobalScope(((com.google.javascript.jscomp.Scope)v8),((com.google.javascript.rhino.Node)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = "prototypL";
    Object v7 = java.nio.charset.Charset.defaultCharset();
    Object v8 = new java.io.PrintStream(((java.lang.String)v6),((java.nio.charset.Charset)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v8));
    Object v10 = ((com.google.javascript.jscomp.AbstractCompiler)v9).getErrorManager();
    Object v11 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v9));
    Object v12 = com.google.javascript.rhino.IR.nullNode();
    Object v13 = com.google.javascript.rhino.IR.nullNode();
    Object v14 = null;
    Object v15 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.jstype.ObjectType)v14));
    Object v16 = ((com.google.javascript.jscomp.TypedScopeCreator)v11).createScope(((com.google.javascript.rhino.Node)v12),((com.google.javascript.jscomp.Scope)v15));
    Object v17 = com.google.javascript.rhino.IR.nullNode();
    Object v18 = 1;
    Object v19 = ((com.google.javascript.rhino.Node)v17).getAncestor((((java.lang.Integer)v18).intValue()));
    ((com.google.javascript.jscomp.TypedScopeCreator)v5).patchGlobalScope(((com.google.javascript.jscomp.Scope)v16),((com.google.javascript.rhino.Node)v17));
    Object v20 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = "prototypL";
    Object v7 = java.nio.charset.Charset.defaultCharset();
    Object v8 = new java.io.PrintStream(((java.lang.String)v6),((java.nio.charset.Charset)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v8));
    Object v10 = ((com.google.javascript.jscomp.AbstractCompiler)v9).getErrorManager();
    Object v11 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v9));
    Object v12 = com.google.javascript.rhino.IR.nullNode();
    Object v13 = com.google.javascript.rhino.IR.nullNode();
    Object v14 = null;
    Object v15 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.jstype.ObjectType)v14));
    Object v16 = "";
    Object v17 = ((com.google.javascript.jscomp.Scope)v15).getSlot(((java.lang.String)v16));
    Object v18 = ((com.google.javascript.jscomp.TypedScopeCreator)v11).createScope(((com.google.javascript.rhino.Node)v12),((com.google.javascript.jscomp.Scope)v15));
    Object v19 = "";
    Object v20 = ((com.google.javascript.jscomp.Scope)v18).getSlot(((java.lang.String)v19));
    Object v21 = com.google.javascript.rhino.IR.nullNode();
    ((com.google.javascript.jscomp.TypedScopeCreator)v5).patchGlobalScope(((com.google.javascript.jscomp.Scope)v18),((com.google.javascript.rhino.Node)v21));
    Object v22 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = com.google.javascript.rhino.IR.nullNode();
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.jstype.ObjectType)v7));
    Object v9 = com.google.javascript.rhino.IR.nullNode();
    Object v10 = ((com.google.javascript.rhino.Node)v9).isFromExterns();
    ((com.google.javascript.jscomp.TypedScopeCreator)v5).patchGlobalScope(((com.google.javascript.jscomp.Scope)v8),((com.google.javascript.rhino.Node)v9));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = com.google.javascript.rhino.IR.nullNode();
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.jstype.ObjectType)v7));
    Object v9 = com.google.javascript.rhino.IR.nullNode();
    Object v10 = ((com.google.javascript.rhino.Node)v9).children();
    ((com.google.javascript.jscomp.TypedScopeCreator)v5).patchGlobalScope(((com.google.javascript.jscomp.Scope)v8),((com.google.javascript.rhino.Node)v9));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = com.google.javascript.rhino.IR.nullNode();
    Object v7 = com.google.javascript.rhino.IR.nullNode();
    Object v8 = null;
    Object v9 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.jstype.ObjectType)v8));
    Object v10 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v6),((com.google.javascript.jscomp.Scope)v9));
    Object v11 = com.google.javascript.rhino.IR.nullNode();
    Object v12 = null;
    Object v13 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.jstype.ObjectType)v12));
    Object v14 = "";
    Object v15 = ((com.google.javascript.jscomp.Scope)v13).getSlot(((java.lang.String)v14));
    Object v16 = com.google.javascript.rhino.IR.nullNode();
    ((com.google.javascript.jscomp.TypedScopeCreator)v5).patchGlobalScope(((com.google.javascript.jscomp.Scope)v13),((com.google.javascript.rhino.Node)v16));
    Object v17 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = "prototypL";
    Object v7 = java.nio.charset.Charset.defaultCharset();
    Object v8 = new java.io.PrintStream(((java.lang.String)v6),((java.nio.charset.Charset)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v8));
    Object v10 = ((com.google.javascript.jscomp.AbstractCompiler)v9).getErrorManager();
    Object v11 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v9));
    Object v12 = com.google.javascript.rhino.IR.nullNode();
    Object v13 = com.google.javascript.rhino.IR.nullNode();
    Object v14 = null;
    Object v15 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.jstype.ObjectType)v14));
    Object v16 = "";
    Object v17 = ((com.google.javascript.jscomp.Scope)v15).getSlot(((java.lang.String)v16));
    Object v18 = ((com.google.javascript.jscomp.TypedScopeCreator)v11).createScope(((com.google.javascript.rhino.Node)v12),((com.google.javascript.jscomp.Scope)v15));
    Object v19 = com.google.javascript.rhino.IR.nullNode();
    ((com.google.javascript.jscomp.TypedScopeCreator)v5).patchGlobalScope(((com.google.javascript.jscomp.Scope)v18),((com.google.javascript.rhino.Node)v19));
    Object v20 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = "prototypL";
    Object v7 = java.nio.charset.Charset.defaultCharset();
    Object v8 = new java.io.PrintStream(((java.lang.String)v6),((java.nio.charset.Charset)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v8));
    Object v10 = ((com.google.javascript.jscomp.AbstractCompiler)v9).getErrorManager();
    Object v11 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v9));
    Object v12 = com.google.javascript.rhino.IR.nullNode();
    Object v13 = com.google.javascript.rhino.IR.nullNode();
    Object v14 = null;
    Object v15 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.jstype.ObjectType)v14));
    Object v16 = ((com.google.javascript.jscomp.TypedScopeCreator)v11).createScope(((com.google.javascript.rhino.Node)v12),((com.google.javascript.jscomp.Scope)v15));
    Object v17 = com.google.javascript.rhino.IR.nullNode();
    Object v18 = "prototypL";
    Object v19 = java.nio.charset.Charset.defaultCharset();
    Object v20 = new java.io.PrintStream(((java.lang.String)v18),((java.nio.charset.Charset)v19));
    Object v21 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v20));
    Object v22 = ((com.google.javascript.jscomp.AbstractCompiler)v21).getErrorManager();
    Object v23 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v21));
    Object v24 = com.google.javascript.rhino.IR.nullNode();
    Object v25 = com.google.javascript.rhino.IR.nullNode();
    Object v26 = null;
    Object v27 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v25),((com.google.javascript.rhino.jstype.ObjectType)v26));
    Object v28 = ((com.google.javascript.jscomp.TypedScopeCreator)v23).createScope(((com.google.javascript.rhino.Node)v24),((com.google.javascript.jscomp.Scope)v27));
    Object v29 = com.google.javascript.rhino.IR.nullNode();
    Object v30 = ((com.google.javascript.rhino.Node)v29).getStaticSourceFile();
    Object v31 = ((com.google.javascript.jscomp.TypedScopeCreator)v23).createInitialScope(((com.google.javascript.rhino.Node)v29));
    Object v32 = ((com.google.javascript.jscomp.TypedScopeCreator)v11).createScope(((com.google.javascript.rhino.Node)v17),((com.google.javascript.jscomp.Scope)v31));
    Object v33 = ((com.google.javascript.jscomp.Scope)v32).getArgumentsVar();
    Object v34 = com.google.javascript.rhino.IR.nullNode();
    ((com.google.javascript.jscomp.TypedScopeCreator)v5).patchGlobalScope(((com.google.javascript.jscomp.Scope)v32),((com.google.javascript.rhino.Node)v34));
    Object v35 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = com.google.javascript.rhino.IR.nullNode();
    Object v7 = -25;
    ((com.google.javascript.rhino.Node)v6).setType((((java.lang.Integer)v7).intValue()));
    Object v8 = null;
    Object v9 = com.google.javascript.rhino.IR.nullNode();
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.jstype.ObjectType)v10));
    Object v12 = "";
    Object v13 = ((com.google.javascript.jscomp.Scope)v11).getOwnSlot(((java.lang.String)v12));
    Object v14 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v6),((com.google.javascript.jscomp.Scope)v11));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = com.google.javascript.rhino.IR.nullNode();
    Object v7 = "prototypL";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = new java.io.PrintStream(((java.lang.String)v7),((java.nio.charset.Charset)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = ((com.google.javascript.jscomp.AbstractCompiler)v10).getErrorManager();
    Object v12 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v13 = com.google.javascript.rhino.IR.nullNode();
    Object v14 = com.google.javascript.rhino.IR.nullNode();
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.jstype.ObjectType)v15));
    Object v17 = ((com.google.javascript.jscomp.Scope)v16).getArgumentsVar();
    Object v18 = ((com.google.javascript.jscomp.TypedScopeCreator)v12).createScope(((com.google.javascript.rhino.Node)v13),((com.google.javascript.jscomp.Scope)v16));
    Object v19 = "";
    Object v20 = ((com.google.javascript.jscomp.Scope)v18).getSlot(((java.lang.String)v19));
    Object v21 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v6),((com.google.javascript.jscomp.Scope)v18));
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = com.google.javascript.rhino.IR.nullNode();
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.jstype.ObjectType)v7));
    Object v9 = "";
    Object v10 = ((com.google.javascript.jscomp.Scope)v8).getVar(((java.lang.String)v9));
    Object v11 = com.google.javascript.rhino.IR.nullNode();
    ((com.google.javascript.jscomp.TypedScopeCreator)v5).patchGlobalScope(((com.google.javascript.jscomp.Scope)v8),((com.google.javascript.rhino.Node)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = com.google.javascript.rhino.IR.nullNode();
    Object v7 = ((com.google.javascript.rhino.Node)v6).getSourceOffset();
    Object v8 = com.google.javascript.rhino.IR.nullNode();
    Object v9 = null;
    Object v10 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.jstype.ObjectType)v9));
    Object v11 = "";
    Object v12 = true;
    Object v13 = ((com.google.javascript.jscomp.Scope)v10).isDeclared(((java.lang.String)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v6),((com.google.javascript.jscomp.Scope)v10));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = com.google.javascript.rhino.IR.nullNode();
    Object v7 = com.google.javascript.rhino.IR.nullNode();
    Object v8 = null;
    Object v9 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.jstype.ObjectType)v8));
    Object v10 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v6),((com.google.javascript.jscomp.Scope)v9));
    Object v11 = com.google.javascript.rhino.IR.nullNode();
    Object v12 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createInitialScope(((com.google.javascript.rhino.Node)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = "prototypL";
    Object v7 = java.nio.charset.Charset.defaultCharset();
    Object v8 = new java.io.PrintStream(((java.lang.String)v6),((java.nio.charset.Charset)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v8));
    Object v10 = ((com.google.javascript.jscomp.AbstractCompiler)v9).getErrorManager();
    Object v11 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v9));
    Object v12 = com.google.javascript.rhino.IR.nullNode();
    Object v13 = 10;
    Object v14 = ((com.google.javascript.rhino.Node)v12).getProp((((java.lang.Integer)v13).intValue()));
    Object v15 = "prototypL";
    Object v16 = java.nio.charset.Charset.defaultCharset();
    Object v17 = new java.io.PrintStream(((java.lang.String)v15),((java.nio.charset.Charset)v16));
    Object v18 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v17));
    Object v19 = ((com.google.javascript.jscomp.AbstractCompiler)v18).getErrorManager();
    Object v20 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v18));
    Object v21 = com.google.javascript.rhino.IR.nullNode();
    Object v22 = com.google.javascript.rhino.IR.nullNode();
    Object v23 = null;
    Object v24 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v22),((com.google.javascript.rhino.jstype.ObjectType)v23));
    Object v25 = ((com.google.javascript.jscomp.TypedScopeCreator)v20).createScope(((com.google.javascript.rhino.Node)v21),((com.google.javascript.jscomp.Scope)v24));
    Object v26 = com.google.javascript.rhino.IR.nullNode();
    Object v27 = com.google.javascript.rhino.IR.nullNode();
    Object v28 = null;
    Object v29 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v27),((com.google.javascript.rhino.jstype.ObjectType)v28));
    Object v30 = ((com.google.javascript.jscomp.TypedScopeCreator)v20).createScope(((com.google.javascript.rhino.Node)v26),((com.google.javascript.jscomp.Scope)v29));
    Object v31 = ((com.google.javascript.jscomp.TypedScopeCreator)v11).createScope(((com.google.javascript.rhino.Node)v12),((com.google.javascript.jscomp.Scope)v30));
    Object v32 = com.google.javascript.rhino.IR.nullNode();
    ((com.google.javascript.jscomp.TypedScopeCreator)v5).patchGlobalScope(((com.google.javascript.jscomp.Scope)v31),((com.google.javascript.rhino.Node)v32));
    Object v33 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = "prototypL";
    Object v7 = java.nio.charset.Charset.defaultCharset();
    Object v8 = new java.io.PrintStream(((java.lang.String)v6),((java.nio.charset.Charset)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v8));
    Object v10 = ((com.google.javascript.jscomp.AbstractCompiler)v9).getErrorManager();
    Object v11 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v9));
    Object v12 = com.google.javascript.rhino.IR.nullNode();
    Object v13 = com.google.javascript.rhino.IR.nullNode();
    Object v14 = null;
    Object v15 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v13),((com.google.javascript.rhino.jstype.ObjectType)v14));
    Object v16 = ((com.google.javascript.jscomp.TypedScopeCreator)v11).createScope(((com.google.javascript.rhino.Node)v12),((com.google.javascript.jscomp.Scope)v15));
    Object v17 = com.google.javascript.rhino.IR.nullNode();
    Object v18 = com.google.javascript.rhino.IR.nullNode();
    Object v19 = null;
    Object v20 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v18),((com.google.javascript.rhino.jstype.ObjectType)v19));
    Object v21 = ((com.google.javascript.jscomp.Scope)v20).getDeclarativelyUnboundVarsWithoutTypes();
    Object v22 = ((com.google.javascript.jscomp.TypedScopeCreator)v11).createScope(((com.google.javascript.rhino.Node)v17),((com.google.javascript.jscomp.Scope)v20));
    Object v23 = com.google.javascript.rhino.IR.nullNode();
    ((com.google.javascript.jscomp.TypedScopeCreator)v5).patchGlobalScope(((com.google.javascript.jscomp.Scope)v22),((com.google.javascript.rhino.Node)v23));
    Object v24 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = "prototypL";
    Object v7 = java.nio.charset.Charset.defaultCharset();
    Object v8 = new java.io.PrintStream(((java.lang.String)v6),((java.nio.charset.Charset)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v8));
    Object v10 = ((com.google.javascript.jscomp.AbstractCompiler)v9).getErrorManager();
    Object v11 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v9));
    Object v12 = com.google.javascript.rhino.IR.nullNode();
    Object v13 = -25;
    ((com.google.javascript.rhino.Node)v12).setType((((java.lang.Integer)v13).intValue()));
    Object v14 = null;
    Object v15 = com.google.javascript.rhino.IR.nullNode();
    Object v16 = null;
    Object v17 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v15),((com.google.javascript.rhino.jstype.ObjectType)v16));
    Object v18 = "";
    Object v19 = ((com.google.javascript.jscomp.Scope)v17).getOwnSlot(((java.lang.String)v18));
    Object v20 = ((com.google.javascript.jscomp.TypedScopeCreator)v11).createScope(((com.google.javascript.rhino.Node)v12),((com.google.javascript.jscomp.Scope)v17));
    Object v21 = com.google.javascript.rhino.IR.nullNode();
    ((com.google.javascript.jscomp.TypedScopeCreator)v5).patchGlobalScope(((com.google.javascript.jscomp.Scope)v20),((com.google.javascript.rhino.Node)v21));
    Object v22 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = com.google.javascript.rhino.IR.nullNode();
    Object v7 = false;
    ((com.google.javascript.rhino.Node)v6).setWasEmptyNode((((java.lang.Boolean)v7).booleanValue()));
    Object v8 = null;
    Object v9 = com.google.javascript.rhino.IR.nullNode();
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.jstype.ObjectType)v10));
    Object v12 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v6),((com.google.javascript.jscomp.Scope)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = com.google.javascript.rhino.IR.nullNode();
    Object v7 = false;
    Object v8 = false;
    Object v9 = false;
    Object v10 = ((com.google.javascript.rhino.Node)v6).toString((((java.lang.Boolean)v7).booleanValue()),(((java.lang.Boolean)v8).booleanValue()),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = com.google.javascript.rhino.IR.nullNode();
    Object v12 = null;
    Object v13 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.jstype.ObjectType)v12));
    Object v14 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v6),((com.google.javascript.jscomp.Scope)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = com.google.javascript.rhino.IR.nullNode();
    Object v7 = com.google.javascript.rhino.IR.nullNode();
    Object v8 = null;
    Object v9 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.jstype.ObjectType)v8));
    Object v10 = "JSCompiler_renameProperty";
    Object v11 = ((com.google.javascript.jscomp.Scope)v9).getSlot(((java.lang.String)v10));
    Object v12 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v6),((com.google.javascript.jscomp.Scope)v9));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = com.google.javascript.rhino.IR.nullNode();
    Object v7 = "prototypL";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = new java.io.PrintStream(((java.lang.String)v7),((java.nio.charset.Charset)v8));
    ((com.google.javascript.rhino.Node)v6).appendStringTree(((java.lang.Appendable)v9));
    Object v10 = null;
    Object v11 = "prototypL";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = ((com.google.javascript.jscomp.AbstractCompiler)v14).getErrorManager();
    Object v16 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v14));
    Object v17 = com.google.javascript.rhino.IR.nullNode();
    Object v18 = com.google.javascript.rhino.IR.nullNode();
    Object v19 = null;
    Object v20 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v18),((com.google.javascript.rhino.jstype.ObjectType)v19));
    Object v21 = ((com.google.javascript.jscomp.TypedScopeCreator)v16).createScope(((com.google.javascript.rhino.Node)v17),((com.google.javascript.jscomp.Scope)v20));
    Object v22 = com.google.javascript.rhino.IR.nullNode();
    Object v23 = ((com.google.javascript.rhino.Node)v22).isOptionalArg();
    Object v24 = com.google.javascript.rhino.IR.nullNode();
    Object v25 = null;
    Object v26 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v24),((com.google.javascript.rhino.jstype.ObjectType)v25));
    Object v27 = ((com.google.javascript.jscomp.TypedScopeCreator)v16).createScope(((com.google.javascript.rhino.Node)v22),((com.google.javascript.jscomp.Scope)v26));
    Object v28 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v6),((com.google.javascript.jscomp.Scope)v27));
    org.junit.Assert.assertNotNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = com.google.javascript.rhino.IR.nullNode();
    Object v7 = -41;
    ((com.google.javascript.rhino.Node)v6).setSourceEncodedPositionForTree((((java.lang.Integer)v7).intValue()));
    Object v8 = null;
    Object v9 = "prototypL";
    Object v10 = java.nio.charset.Charset.defaultCharset();
    Object v11 = new java.io.PrintStream(((java.lang.String)v9),((java.nio.charset.Charset)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v11));
    Object v13 = ((com.google.javascript.jscomp.AbstractCompiler)v12).getErrorManager();
    Object v14 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v15 = com.google.javascript.rhino.IR.nullNode();
    Object v16 = ((com.google.javascript.rhino.Node)v15).getSourceFileName();
    Object v17 = com.google.javascript.rhino.IR.nullNode();
    Object v18 = null;
    Object v19 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v17),((com.google.javascript.rhino.jstype.ObjectType)v18));
    Object v20 = ((com.google.javascript.jscomp.Scope)v19).getVarCount();
    Object v21 = ((com.google.javascript.jscomp.TypedScopeCreator)v14).createScope(((com.google.javascript.rhino.Node)v15),((com.google.javascript.jscomp.Scope)v19));
    Object v22 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v6),((com.google.javascript.jscomp.Scope)v21));
    org.junit.Assert.assertNotNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = com.google.javascript.rhino.IR.nullNode();
    Object v7 = "prototypL";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = new java.io.PrintStream(((java.lang.String)v7),((java.nio.charset.Charset)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = ((com.google.javascript.jscomp.AbstractCompiler)v10).getErrorManager();
    Object v12 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v13 = com.google.javascript.rhino.IR.nullNode();
    Object v14 = 0;
    Object v15 = ((com.google.javascript.rhino.Node)v13).getBooleanProp((((java.lang.Integer)v14).intValue()));
    Object v16 = com.google.javascript.rhino.IR.nullNode();
    Object v17 = null;
    Object v18 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v16),((com.google.javascript.rhino.jstype.ObjectType)v17));
    Object v19 = ((com.google.javascript.jscomp.TypedScopeCreator)v12).createScope(((com.google.javascript.rhino.Node)v13),((com.google.javascript.jscomp.Scope)v18));
    Object v20 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v6),((com.google.javascript.jscomp.Scope)v19));
    Object v21 = com.google.javascript.rhino.IR.nullNode();
    Object v22 = "prototypL";
    Object v23 = java.nio.charset.Charset.defaultCharset();
    Object v24 = new java.io.PrintStream(((java.lang.String)v22),((java.nio.charset.Charset)v23));
    Object v25 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v24));
    Object v26 = ((com.google.javascript.jscomp.AbstractCompiler)v25).getErrorManager();
    Object v27 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v25));
    Object v28 = com.google.javascript.rhino.IR.nullNode();
    Object v29 = false;
    Object v30 = false;
    Object v31 = false;
    Object v32 = ((com.google.javascript.rhino.Node)v28).toString((((java.lang.Boolean)v29).booleanValue()),(((java.lang.Boolean)v30).booleanValue()),(((java.lang.Boolean)v31).booleanValue()));
    Object v33 = com.google.javascript.rhino.IR.nullNode();
    Object v34 = null;
    Object v35 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v33),((com.google.javascript.rhino.jstype.ObjectType)v34));
    Object v36 = ((com.google.javascript.jscomp.TypedScopeCreator)v27).createScope(((com.google.javascript.rhino.Node)v28),((com.google.javascript.jscomp.Scope)v35));
    Object v37 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v21),((com.google.javascript.jscomp.Scope)v36));
    org.junit.Assert.assertNotNull(v37);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = com.google.javascript.rhino.IR.nullNode();
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.jstype.ObjectType)v7));
    Object v9 = "V";
    Object v10 = ((com.google.javascript.jscomp.Scope)v8).getOwnSlot(((java.lang.String)v9));
    Object v11 = com.google.javascript.rhino.IR.nullNode();
    Object v12 = com.google.javascript.rhino.IR.nullNode();
    ((com.google.javascript.rhino.Node)v11).addChildrenToBack(((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
    ((com.google.javascript.jscomp.TypedScopeCreator)v5).patchGlobalScope(((com.google.javascript.jscomp.Scope)v8),((com.google.javascript.rhino.Node)v11));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = "prototypL";
    Object v7 = java.nio.charset.Charset.defaultCharset();
    Object v8 = new java.io.PrintStream(((java.lang.String)v6),((java.nio.charset.Charset)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v8));
    Object v10 = ((com.google.javascript.jscomp.AbstractCompiler)v9).getErrorManager();
    Object v11 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v9));
    Object v12 = com.google.javascript.rhino.IR.nullNode();
    Object v13 = false;
    Object v14 = false;
    Object v15 = false;
    Object v16 = ((com.google.javascript.rhino.Node)v12).toString((((java.lang.Boolean)v13).booleanValue()),(((java.lang.Boolean)v14).booleanValue()),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = com.google.javascript.rhino.IR.nullNode();
    Object v18 = null;
    Object v19 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v17),((com.google.javascript.rhino.jstype.ObjectType)v18));
    Object v20 = ((com.google.javascript.jscomp.TypedScopeCreator)v11).createScope(((com.google.javascript.rhino.Node)v12),((com.google.javascript.jscomp.Scope)v19));
    Object v21 = com.google.javascript.rhino.IR.nullNode();
    ((com.google.javascript.jscomp.TypedScopeCreator)v5).patchGlobalScope(((com.google.javascript.jscomp.Scope)v20),((com.google.javascript.rhino.Node)v21));
    Object v22 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = com.google.javascript.rhino.IR.nullNode();
    Object v7 = "";
    Object v8 = new com.google.javascript.rhino.InputId(((java.lang.String)v7));
    ((com.google.javascript.rhino.Node)v6).setInputId(((com.google.javascript.rhino.InputId)v8));
    Object v9 = null;
    Object v10 = com.google.javascript.rhino.IR.nullNode();
    Object v11 = null;
    Object v12 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.ObjectType)v11));
    Object v13 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v6),((com.google.javascript.jscomp.Scope)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = "prototypL";
    Object v7 = java.nio.charset.Charset.defaultCharset();
    Object v8 = new java.io.PrintStream(((java.lang.String)v6),((java.nio.charset.Charset)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v8));
    Object v10 = ((com.google.javascript.jscomp.AbstractCompiler)v9).getErrorManager();
    Object v11 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v9));
    Object v12 = com.google.javascript.rhino.IR.nullNode();
    Object v13 = false;
    Object v14 = false;
    Object v15 = false;
    Object v16 = ((com.google.javascript.rhino.Node)v12).toString((((java.lang.Boolean)v13).booleanValue()),(((java.lang.Boolean)v14).booleanValue()),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = com.google.javascript.rhino.IR.nullNode();
    Object v18 = null;
    Object v19 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v17),((com.google.javascript.rhino.jstype.ObjectType)v18));
    Object v20 = ((com.google.javascript.jscomp.TypedScopeCreator)v11).createScope(((com.google.javascript.rhino.Node)v12),((com.google.javascript.jscomp.Scope)v19));
    Object v21 = com.google.javascript.rhino.IR.nullNode();
    Object v22 = ((com.google.javascript.rhino.Node)v21).isOptionalArg();
    ((com.google.javascript.jscomp.TypedScopeCreator)v5).patchGlobalScope(((com.google.javascript.jscomp.Scope)v20),((com.google.javascript.rhino.Node)v21));
    Object v23 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = com.google.javascript.rhino.IR.nullNode();
    Object v7 = 1;
    Object v8 = ((com.google.javascript.rhino.Node)v6).getProp((((java.lang.Integer)v7).intValue()));
    Object v9 = com.google.javascript.rhino.IR.nullNode();
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.jstype.ObjectType)v10));
    Object v12 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v6),((com.google.javascript.jscomp.Scope)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = com.google.javascript.rhino.IR.nullNode();
    Object v7 = "prototypL";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = new java.io.PrintStream(((java.lang.String)v7),((java.nio.charset.Charset)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = ((com.google.javascript.jscomp.AbstractCompiler)v10).getErrorManager();
    Object v12 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v13 = com.google.javascript.rhino.IR.nullNode();
    Object v14 = com.google.javascript.rhino.IR.nullNode();
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.jstype.ObjectType)v15));
    Object v17 = ((com.google.javascript.jscomp.Scope)v16).getVars();
    Object v18 = ((com.google.javascript.jscomp.TypedScopeCreator)v12).createScope(((com.google.javascript.rhino.Node)v13),((com.google.javascript.jscomp.Scope)v16));
    Object v19 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v6),((com.google.javascript.jscomp.Scope)v18));
    Object v20 = com.google.javascript.rhino.IR.nullNode();
    Object v21 = com.google.javascript.rhino.IR.nullNode();
    Object v22 = null;
    Object v23 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v21),((com.google.javascript.rhino.jstype.ObjectType)v22));
    Object v24 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v20),((com.google.javascript.jscomp.Scope)v23));
    org.junit.Assert.assertNotNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = com.google.javascript.rhino.IR.nullNode();
    Object v7 = "prototypL";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = new java.io.PrintStream(((java.lang.String)v7),((java.nio.charset.Charset)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = ((com.google.javascript.jscomp.AbstractCompiler)v10).getErrorManager();
    Object v12 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v13 = com.google.javascript.rhino.IR.nullNode();
    Object v14 = 0;
    Object v15 = ((com.google.javascript.rhino.Node)v13).getBooleanProp((((java.lang.Integer)v14).intValue()));
    Object v16 = com.google.javascript.rhino.IR.nullNode();
    Object v17 = null;
    Object v18 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v16),((com.google.javascript.rhino.jstype.ObjectType)v17));
    Object v19 = ((com.google.javascript.jscomp.TypedScopeCreator)v12).createScope(((com.google.javascript.rhino.Node)v13),((com.google.javascript.jscomp.Scope)v18));
    Object v20 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v6),((com.google.javascript.jscomp.Scope)v19));
    Object v21 = com.google.javascript.rhino.IR.nullNode();
    Object v22 = com.google.javascript.rhino.IR.nullNode();
    Object v23 = null;
    Object v24 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v22),((com.google.javascript.rhino.jstype.ObjectType)v23));
    Object v25 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v21),((com.google.javascript.jscomp.Scope)v24));
    org.junit.Assert.assertNotNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = "prototypL";
    Object v7 = java.nio.charset.Charset.defaultCharset();
    Object v8 = new java.io.PrintStream(((java.lang.String)v6),((java.nio.charset.Charset)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v8));
    Object v10 = ((com.google.javascript.jscomp.AbstractCompiler)v9).getErrorManager();
    Object v11 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v9));
    Object v12 = com.google.javascript.rhino.IR.nullNode();
    Object v13 = "prototypL";
    Object v14 = java.nio.charset.Charset.defaultCharset();
    Object v15 = new java.io.PrintStream(((java.lang.String)v13),((java.nio.charset.Charset)v14));
    Object v16 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v15));
    Object v17 = ((com.google.javascript.jscomp.AbstractCompiler)v16).getErrorManager();
    Object v18 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v16));
    Object v19 = com.google.javascript.rhino.IR.nullNode();
    Object v20 = com.google.javascript.rhino.IR.nullNode();
    Object v21 = null;
    Object v22 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.jstype.ObjectType)v21));
    Object v23 = ((com.google.javascript.jscomp.Scope)v22).getVars();
    Object v24 = ((com.google.javascript.jscomp.TypedScopeCreator)v18).createScope(((com.google.javascript.rhino.Node)v19),((com.google.javascript.jscomp.Scope)v22));
    Object v25 = ((com.google.javascript.jscomp.TypedScopeCreator)v11).createScope(((com.google.javascript.rhino.Node)v12),((com.google.javascript.jscomp.Scope)v24));
    Object v26 = com.google.javascript.rhino.IR.nullNode();
    Object v27 = com.google.javascript.rhino.IR.nullNode();
    Object v28 = null;
    Object v29 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v27),((com.google.javascript.rhino.jstype.ObjectType)v28));
    Object v30 = ((com.google.javascript.jscomp.TypedScopeCreator)v11).createScope(((com.google.javascript.rhino.Node)v26),((com.google.javascript.jscomp.Scope)v29));
    Object v31 = com.google.javascript.rhino.IR.nullNode();
    ((com.google.javascript.jscomp.TypedScopeCreator)v5).patchGlobalScope(((com.google.javascript.jscomp.Scope)v30),((com.google.javascript.rhino.Node)v31));
    Object v32 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = com.google.javascript.rhino.IR.nullNode();
    Object v7 = "prototypL";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = new java.io.PrintStream(((java.lang.String)v7),((java.nio.charset.Charset)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = ((com.google.javascript.jscomp.AbstractCompiler)v10).getErrorManager();
    Object v12 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v13 = com.google.javascript.rhino.IR.nullNode();
    Object v14 = "prototypL";
    Object v15 = java.nio.charset.Charset.defaultCharset();
    Object v16 = new java.io.PrintStream(((java.lang.String)v14),((java.nio.charset.Charset)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v16));
    Object v18 = ((com.google.javascript.jscomp.AbstractCompiler)v17).getErrorManager();
    Object v19 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v17));
    Object v20 = com.google.javascript.rhino.IR.nullNode();
    Object v21 = com.google.javascript.rhino.IR.nullNode();
    Object v22 = null;
    Object v23 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v21),((com.google.javascript.rhino.jstype.ObjectType)v22));
    Object v24 = ((com.google.javascript.jscomp.Scope)v23).getVars();
    Object v25 = ((com.google.javascript.jscomp.TypedScopeCreator)v19).createScope(((com.google.javascript.rhino.Node)v20),((com.google.javascript.jscomp.Scope)v23));
    Object v26 = ((com.google.javascript.jscomp.TypedScopeCreator)v12).createScope(((com.google.javascript.rhino.Node)v13),((com.google.javascript.jscomp.Scope)v25));
    Object v27 = com.google.javascript.rhino.IR.nullNode();
    Object v28 = com.google.javascript.rhino.IR.nullNode();
    Object v29 = null;
    Object v30 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v28),((com.google.javascript.rhino.jstype.ObjectType)v29));
    Object v31 = ((com.google.javascript.jscomp.TypedScopeCreator)v12).createScope(((com.google.javascript.rhino.Node)v27),((com.google.javascript.jscomp.Scope)v30));
    Object v32 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v6),((com.google.javascript.jscomp.Scope)v31));
    Object v33 = com.google.javascript.rhino.IR.nullNode();
    Object v34 = null;
    Object v35 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v33),((com.google.javascript.rhino.jstype.ObjectType)v34));
    Object v36 = ((com.google.javascript.jscomp.Scope)v35).getDeclarativelyUnboundVarsWithoutTypes();
    Object v37 = com.google.javascript.rhino.IR.nullNode();
    ((com.google.javascript.jscomp.TypedScopeCreator)v5).patchGlobalScope(((com.google.javascript.jscomp.Scope)v35),((com.google.javascript.rhino.Node)v37));
    Object v38 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = com.google.javascript.rhino.IR.nullNode();
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.jstype.ObjectType)v7));
    Object v9 = "prototype";
    Object v10 = ((com.google.javascript.jscomp.Scope)v8).getVar(((java.lang.String)v9));
    Object v11 = com.google.javascript.rhino.IR.nullNode();
    ((com.google.javascript.jscomp.TypedScopeCreator)v5).patchGlobalScope(((com.google.javascript.jscomp.Scope)v8),((com.google.javascript.rhino.Node)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }
}
