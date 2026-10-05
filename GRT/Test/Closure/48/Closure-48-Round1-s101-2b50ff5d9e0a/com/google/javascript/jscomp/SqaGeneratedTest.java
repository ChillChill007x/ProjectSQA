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
    Object v4 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v4));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = 3;
    Object v7 = "K";
    Object v8 = 1;
    Object v9 = -1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = ((com.google.javascript.rhino.Node)v10).getStaticSourceFile();
    Object v12 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createInitialScope(((com.google.javascript.rhino.Node)v10));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = 3;
    Object v7 = "K";
    Object v8 = 1;
    Object v9 = -1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = "prototypL";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = ((com.google.javascript.jscomp.AbstractCompiler)v14).getErrorManager();
    Object v16 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v14));
    Object v17 = 3;
    Object v18 = "K";
    Object v19 = 1;
    Object v20 = -1;
    Object v21 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v17).intValue()),((java.lang.String)v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
    Object v22 = ((com.google.javascript.rhino.Node)v21).getStaticSourceFile();
    Object v23 = ((com.google.javascript.jscomp.TypedScopeCreator)v16).createInitialScope(((com.google.javascript.rhino.Node)v21));
    Object v24 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.Scope)v23));
    org.junit.Assert.assertNotNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
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
    Object v12 = 3;
    Object v13 = "K";
    Object v14 = 1;
    Object v15 = -1;
    Object v16 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v12).intValue()),((java.lang.String)v13),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = ((com.google.javascript.rhino.Node)v16).getStaticSourceFile();
    Object v18 = ((com.google.javascript.jscomp.TypedScopeCreator)v11).createInitialScope(((com.google.javascript.rhino.Node)v16));
    Object v19 = 3;
    Object v20 = "K";
    Object v21 = 1;
    Object v22 = -1;
    Object v23 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v19).intValue()),((java.lang.String)v20),(((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()));
    ((com.google.javascript.jscomp.TypedScopeCreator)v5).patchGlobalScope(((com.google.javascript.jscomp.Scope)v18),((com.google.javascript.rhino.Node)v23));
    Object v24 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = 3;
    Object v7 = "K";
    Object v8 = 1;
    Object v9 = -1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createInitialScope(((com.google.javascript.rhino.Node)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
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
    Object v12 = 3;
    Object v13 = "K";
    Object v14 = 1;
    Object v15 = -1;
    Object v16 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v12).intValue()),((java.lang.String)v13),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = ((com.google.javascript.jscomp.TypedScopeCreator)v11).createInitialScope(((com.google.javascript.rhino.Node)v16));
    Object v18 = 3;
    Object v19 = "K";
    Object v20 = 1;
    Object v21 = -1;
    Object v22 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v18).intValue()),((java.lang.String)v19),(((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()));
    ((com.google.javascript.jscomp.TypedScopeCreator)v5).patchGlobalScope(((com.google.javascript.jscomp.Scope)v17),((com.google.javascript.rhino.Node)v22));
    Object v23 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = 3;
    Object v7 = "K";
    Object v8 = 1;
    Object v9 = -1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = "prototypL";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = ((com.google.javascript.jscomp.AbstractCompiler)v14).getErrorManager();
    Object v16 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v14));
    Object v17 = 3;
    Object v18 = "K";
    Object v19 = 1;
    Object v20 = -1;
    Object v21 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v17).intValue()),((java.lang.String)v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
    Object v22 = ((com.google.javascript.jscomp.TypedScopeCreator)v16).createInitialScope(((com.google.javascript.rhino.Node)v21));
    Object v23 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.Scope)v22));
    Object v24 = 3;
    Object v25 = "K";
    Object v26 = 1;
    Object v27 = -1;
    Object v28 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v24).intValue()),((java.lang.String)v25),(((java.lang.Integer)v26).intValue()),(((java.lang.Integer)v27).intValue()));
    Object v29 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createInitialScope(((com.google.javascript.rhino.Node)v28));
    org.junit.Assert.assertNotNull(v29);
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
    Object v6 = "prototypL";
    Object v7 = java.nio.charset.Charset.defaultCharset();
    Object v8 = new java.io.PrintStream(((java.lang.String)v6),((java.nio.charset.Charset)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v8));
    Object v10 = ((com.google.javascript.jscomp.AbstractCompiler)v9).getErrorManager();
    Object v11 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v9));
    Object v12 = 3;
    Object v13 = "K";
    Object v14 = 1;
    Object v15 = -1;
    Object v16 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v12).intValue()),((java.lang.String)v13),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = "prototypL";
    Object v18 = java.nio.charset.Charset.defaultCharset();
    Object v19 = new java.io.PrintStream(((java.lang.String)v17),((java.nio.charset.Charset)v18));
    Object v20 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v19));
    Object v21 = ((com.google.javascript.jscomp.AbstractCompiler)v20).getErrorManager();
    Object v22 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v20));
    Object v23 = 3;
    Object v24 = "K";
    Object v25 = 1;
    Object v26 = -1;
    Object v27 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v23).intValue()),((java.lang.String)v24),(((java.lang.Integer)v25).intValue()),(((java.lang.Integer)v26).intValue()));
    Object v28 = ((com.google.javascript.rhino.Node)v27).getStaticSourceFile();
    Object v29 = ((com.google.javascript.jscomp.TypedScopeCreator)v22).createInitialScope(((com.google.javascript.rhino.Node)v27));
    Object v30 = ((com.google.javascript.jscomp.TypedScopeCreator)v11).createScope(((com.google.javascript.rhino.Node)v16),((com.google.javascript.jscomp.Scope)v29));
    Object v31 = 3;
    Object v32 = "K";
    Object v33 = 1;
    Object v34 = -1;
    Object v35 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v31).intValue()),((java.lang.String)v32),(((java.lang.Integer)v33).intValue()),(((java.lang.Integer)v34).intValue()));
    ((com.google.javascript.jscomp.TypedScopeCreator)v5).patchGlobalScope(((com.google.javascript.jscomp.Scope)v30),((com.google.javascript.rhino.Node)v35));
    Object v36 = null;
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
    Object v6 = "prototypL";
    Object v7 = java.nio.charset.Charset.defaultCharset();
    Object v8 = new java.io.PrintStream(((java.lang.String)v6),((java.nio.charset.Charset)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v8));
    Object v10 = ((com.google.javascript.jscomp.AbstractCompiler)v9).getErrorManager();
    Object v11 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v9));
    Object v12 = 3;
    Object v13 = "K";
    Object v14 = 1;
    Object v15 = -1;
    Object v16 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v12).intValue()),((java.lang.String)v13),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = ((com.google.javascript.jscomp.TypedScopeCreator)v11).createInitialScope(((com.google.javascript.rhino.Node)v16));
    Object v18 = 3;
    Object v19 = "K";
    Object v20 = 1;
    Object v21 = -1;
    Object v22 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v18).intValue()),((java.lang.String)v19),(((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()));
    Object v23 = ((com.google.javascript.rhino.Node)v22).removeChildren();
    ((com.google.javascript.jscomp.TypedScopeCreator)v5).patchGlobalScope(((com.google.javascript.jscomp.Scope)v17),((com.google.javascript.rhino.Node)v22));
    Object v24 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = 3;
    Object v7 = "K";
    Object v8 = 1;
    Object v9 = -1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = "prototypL";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = ((com.google.javascript.jscomp.AbstractCompiler)v14).getErrorManager();
    Object v16 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v14));
    Object v17 = 3;
    Object v18 = "K";
    Object v19 = 1;
    Object v20 = -1;
    Object v21 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v17).intValue()),((java.lang.String)v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
    Object v22 = ((com.google.javascript.jscomp.TypedScopeCreator)v16).createInitialScope(((com.google.javascript.rhino.Node)v21));
    Object v23 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.Scope)v22));
    org.junit.Assert.assertNotNull(v23);
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
    Object v6 = "prototypL";
    Object v7 = java.nio.charset.Charset.defaultCharset();
    Object v8 = new java.io.PrintStream(((java.lang.String)v6),((java.nio.charset.Charset)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v8));
    Object v10 = ((com.google.javascript.jscomp.AbstractCompiler)v9).getErrorManager();
    Object v11 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v9));
    Object v12 = 3;
    Object v13 = "K";
    Object v14 = 1;
    Object v15 = -1;
    Object v16 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v12).intValue()),((java.lang.String)v13),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = ((com.google.javascript.rhino.Node)v16).getStaticSourceFile();
    Object v18 = ((com.google.javascript.jscomp.TypedScopeCreator)v11).createInitialScope(((com.google.javascript.rhino.Node)v16));
    Object v19 = ((com.google.javascript.jscomp.Scope)v18).getVars();
    Object v20 = 3;
    Object v21 = "K";
    Object v22 = 1;
    Object v23 = -1;
    Object v24 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v20).intValue()),((java.lang.String)v21),(((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()));
    ((com.google.javascript.jscomp.TypedScopeCreator)v5).patchGlobalScope(((com.google.javascript.jscomp.Scope)v18),((com.google.javascript.rhino.Node)v24));
    Object v25 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
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
    Object v12 = 3;
    Object v13 = "K";
    Object v14 = 1;
    Object v15 = -1;
    Object v16 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v12).intValue()),((java.lang.String)v13),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = "prototypL";
    Object v18 = java.nio.charset.Charset.defaultCharset();
    Object v19 = new java.io.PrintStream(((java.lang.String)v17),((java.nio.charset.Charset)v18));
    Object v20 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v19));
    Object v21 = ((com.google.javascript.jscomp.AbstractCompiler)v20).getErrorManager();
    Object v22 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v20));
    Object v23 = 3;
    Object v24 = "K";
    Object v25 = 1;
    Object v26 = -1;
    Object v27 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v23).intValue()),((java.lang.String)v24),(((java.lang.Integer)v25).intValue()),(((java.lang.Integer)v26).intValue()));
    Object v28 = ((com.google.javascript.jscomp.TypedScopeCreator)v22).createInitialScope(((com.google.javascript.rhino.Node)v27));
    Object v29 = ((com.google.javascript.jscomp.TypedScopeCreator)v11).createScope(((com.google.javascript.rhino.Node)v16),((com.google.javascript.jscomp.Scope)v28));
    Object v30 = 3;
    Object v31 = "K";
    Object v32 = 1;
    Object v33 = -1;
    Object v34 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v30).intValue()),((java.lang.String)v31),(((java.lang.Integer)v32).intValue()),(((java.lang.Integer)v33).intValue()));
    ((com.google.javascript.jscomp.TypedScopeCreator)v5).patchGlobalScope(((com.google.javascript.jscomp.Scope)v29),((com.google.javascript.rhino.Node)v34));
    Object v35 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = 3;
    Object v7 = "K";
    Object v8 = 1;
    Object v9 = -1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = "prototypL";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = ((com.google.javascript.jscomp.AbstractCompiler)v14).getErrorManager();
    Object v16 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v14));
    Object v17 = 3;
    Object v18 = "K";
    Object v19 = 1;
    Object v20 = -1;
    Object v21 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v17).intValue()),((java.lang.String)v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
    Object v22 = "prototypL";
    Object v23 = java.nio.charset.Charset.defaultCharset();
    Object v24 = new java.io.PrintStream(((java.lang.String)v22),((java.nio.charset.Charset)v23));
    Object v25 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v24));
    Object v26 = ((com.google.javascript.jscomp.AbstractCompiler)v25).getErrorManager();
    Object v27 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v25));
    Object v28 = 3;
    Object v29 = "K";
    Object v30 = 1;
    Object v31 = -1;
    Object v32 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v28).intValue()),((java.lang.String)v29),(((java.lang.Integer)v30).intValue()),(((java.lang.Integer)v31).intValue()));
    Object v33 = ((com.google.javascript.jscomp.TypedScopeCreator)v27).createInitialScope(((com.google.javascript.rhino.Node)v32));
    Object v34 = ((com.google.javascript.jscomp.TypedScopeCreator)v16).createScope(((com.google.javascript.rhino.Node)v21),((com.google.javascript.jscomp.Scope)v33));
    Object v35 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.Scope)v34));
    org.junit.Assert.assertNotNull(v35);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
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
  public void test15() throws Throwable {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = 3;
    Object v7 = "K";
    Object v8 = 1;
    Object v9 = -1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = "prototypL";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = ((com.google.javascript.jscomp.AbstractCompiler)v14).getErrorManager();
    Object v16 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v14));
    Object v17 = 3;
    Object v18 = "K";
    Object v19 = 1;
    Object v20 = -1;
    Object v21 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v17).intValue()),((java.lang.String)v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
    Object v22 = "prototypL";
    Object v23 = java.nio.charset.Charset.defaultCharset();
    Object v24 = new java.io.PrintStream(((java.lang.String)v22),((java.nio.charset.Charset)v23));
    Object v25 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v24));
    Object v26 = ((com.google.javascript.jscomp.AbstractCompiler)v25).getErrorManager();
    Object v27 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v25));
    Object v28 = 3;
    Object v29 = "K";
    Object v30 = 1;
    Object v31 = -1;
    Object v32 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v28).intValue()),((java.lang.String)v29),(((java.lang.Integer)v30).intValue()),(((java.lang.Integer)v31).intValue()));
    Object v33 = ((com.google.javascript.rhino.Node)v32).getStaticSourceFile();
    Object v34 = ((com.google.javascript.jscomp.TypedScopeCreator)v27).createInitialScope(((com.google.javascript.rhino.Node)v32));
    Object v35 = ((com.google.javascript.jscomp.TypedScopeCreator)v16).createScope(((com.google.javascript.rhino.Node)v21),((com.google.javascript.jscomp.Scope)v34));
    Object v36 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.Scope)v35));
    org.junit.Assert.assertNotNull(v36);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
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
    Object v12 = 3;
    Object v13 = "K";
    Object v14 = 1;
    Object v15 = -1;
    Object v16 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v12).intValue()),((java.lang.String)v13),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = ((com.google.javascript.rhino.Node)v16).getStaticSourceFile();
    Object v18 = ((com.google.javascript.jscomp.TypedScopeCreator)v11).createInitialScope(((com.google.javascript.rhino.Node)v16));
    Object v19 = 3;
    Object v20 = "K";
    Object v21 = 1;
    Object v22 = -1;
    Object v23 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v19).intValue()),((java.lang.String)v20),(((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()));
    Object v24 = ((com.google.javascript.rhino.Node)v23).isOnlyModifiesThisCall();
    ((com.google.javascript.jscomp.TypedScopeCreator)v5).patchGlobalScope(((com.google.javascript.jscomp.Scope)v18),((com.google.javascript.rhino.Node)v23));
    Object v25 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "\n";
    Object v5 = -18;
    Object v6 = ((com.google.javascript.jscomp.SourceExcerptProvider)v3).getSourceRegion(((java.lang.String)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = 3;
    Object v7 = "K";
    Object v8 = 1;
    Object v9 = -1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = ((com.google.javascript.rhino.Node)v10).isNoSideEffectsCall();
    Object v12 = "prototypL";
    Object v13 = java.nio.charset.Charset.defaultCharset();
    Object v14 = new java.io.PrintStream(((java.lang.String)v12),((java.nio.charset.Charset)v13));
    Object v15 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v14));
    Object v16 = ((com.google.javascript.jscomp.AbstractCompiler)v15).getErrorManager();
    Object v17 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v15));
    Object v18 = 3;
    Object v19 = "K";
    Object v20 = 1;
    Object v21 = -1;
    Object v22 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v18).intValue()),((java.lang.String)v19),(((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()));
    Object v23 = ((com.google.javascript.jscomp.TypedScopeCreator)v17).createInitialScope(((com.google.javascript.rhino.Node)v22));
    Object v24 = "";
    Object v25 = ((com.google.javascript.jscomp.Scope)v23).getOwnSlot(((java.lang.String)v24));
    Object v26 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.Scope)v23));
    org.junit.Assert.assertNotNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v5 = 3;
    Object v6 = "K";
    Object v7 = 1;
    Object v8 = -1;
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v5).intValue()),((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = ((com.google.javascript.jscomp.CodingConvention)v4).getDelegateRelationship(((com.google.javascript.rhino.Node)v9));
    Object v11 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v4));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
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
    Object v12 = 3;
    Object v13 = "K";
    Object v14 = 1;
    Object v15 = -1;
    Object v16 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v12).intValue()),((java.lang.String)v13),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = ((com.google.javascript.rhino.Node)v16).isNoSideEffectsCall();
    Object v18 = "prototypL";
    Object v19 = java.nio.charset.Charset.defaultCharset();
    Object v20 = new java.io.PrintStream(((java.lang.String)v18),((java.nio.charset.Charset)v19));
    Object v21 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v20));
    Object v22 = ((com.google.javascript.jscomp.AbstractCompiler)v21).getErrorManager();
    Object v23 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v21));
    Object v24 = 3;
    Object v25 = "K";
    Object v26 = 1;
    Object v27 = -1;
    Object v28 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v24).intValue()),((java.lang.String)v25),(((java.lang.Integer)v26).intValue()),(((java.lang.Integer)v27).intValue()));
    Object v29 = ((com.google.javascript.jscomp.TypedScopeCreator)v23).createInitialScope(((com.google.javascript.rhino.Node)v28));
    Object v30 = "";
    Object v31 = ((com.google.javascript.jscomp.Scope)v29).getOwnSlot(((java.lang.String)v30));
    Object v32 = ((com.google.javascript.jscomp.TypedScopeCreator)v11).createScope(((com.google.javascript.rhino.Node)v16),((com.google.javascript.jscomp.Scope)v29));
    Object v33 = ((com.google.javascript.jscomp.Scope)v32).getVarCount();
    Object v34 = 3;
    Object v35 = "K";
    Object v36 = 1;
    Object v37 = -1;
    Object v38 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v34).intValue()),((java.lang.String)v35),(((java.lang.Integer)v36).intValue()),(((java.lang.Integer)v37).intValue()));
    ((com.google.javascript.jscomp.TypedScopeCreator)v5).patchGlobalScope(((com.google.javascript.jscomp.Scope)v32),((com.google.javascript.rhino.Node)v38));
    Object v39 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
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
    Object v6 = "prototypL";
    Object v7 = java.nio.charset.Charset.defaultCharset();
    Object v8 = new java.io.PrintStream(((java.lang.String)v6),((java.nio.charset.Charset)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v8));
    Object v10 = ((com.google.javascript.jscomp.AbstractCompiler)v9).getErrorManager();
    Object v11 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v9));
    Object v12 = 3;
    Object v13 = "K";
    Object v14 = 1;
    Object v15 = -1;
    Object v16 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v12).intValue()),((java.lang.String)v13),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = ((com.google.javascript.jscomp.TypedScopeCreator)v11).createInitialScope(((com.google.javascript.rhino.Node)v16));
    Object v18 = 3;
    Object v19 = "K";
    Object v20 = 1;
    Object v21 = -1;
    Object v22 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v18).intValue()),((java.lang.String)v19),(((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()));
    Object v23 = ((com.google.javascript.rhino.Node)v22).removeFirstChild();
    ((com.google.javascript.jscomp.TypedScopeCreator)v5).patchGlobalScope(((com.google.javascript.jscomp.Scope)v17),((com.google.javascript.rhino.Node)v22));
    Object v24 = null;
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
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = "prototypL";
    Object v7 = java.nio.charset.Charset.defaultCharset();
    Object v8 = new java.io.PrintStream(((java.lang.String)v6),((java.nio.charset.Charset)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v8));
    Object v10 = ((com.google.javascript.jscomp.AbstractCompiler)v9).getErrorManager();
    Object v11 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v9));
    Object v12 = 3;
    Object v13 = "K";
    Object v14 = 1;
    Object v15 = -1;
    Object v16 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v12).intValue()),((java.lang.String)v13),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = ((com.google.javascript.rhino.Node)v16).getStaticSourceFile();
    Object v18 = ((com.google.javascript.jscomp.TypedScopeCreator)v11).createInitialScope(((com.google.javascript.rhino.Node)v16));
    Object v19 = 3;
    Object v20 = "K";
    Object v21 = 1;
    Object v22 = -1;
    Object v23 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v19).intValue()),((java.lang.String)v20),(((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()));
    Object v24 = "q ";
    Object v25 = "z";
    Object v26 = java.io.InputStream.nullInputStream();
    Object v27 = com.google.javascript.jscomp.SourceFile.fromInputStream(((java.lang.String)v24),((java.lang.String)v25),((java.io.InputStream)v26));
    ((com.google.javascript.rhino.Node)v23).setStaticSourceFile(((com.google.javascript.rhino.jstype.StaticSourceFile)v27));
    Object v28 = null;
    ((com.google.javascript.jscomp.TypedScopeCreator)v5).patchGlobalScope(((com.google.javascript.jscomp.Scope)v18),((com.google.javascript.rhino.Node)v23));
    Object v29 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
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
    Object v12 = 3;
    Object v13 = "K";
    Object v14 = 1;
    Object v15 = -1;
    Object v16 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v12).intValue()),((java.lang.String)v13),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = ((com.google.javascript.rhino.Node)v16).isNoSideEffectsCall();
    Object v18 = "prototypL";
    Object v19 = java.nio.charset.Charset.defaultCharset();
    Object v20 = new java.io.PrintStream(((java.lang.String)v18),((java.nio.charset.Charset)v19));
    Object v21 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v20));
    Object v22 = ((com.google.javascript.jscomp.AbstractCompiler)v21).getErrorManager();
    Object v23 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v21));
    Object v24 = 3;
    Object v25 = "K";
    Object v26 = 1;
    Object v27 = -1;
    Object v28 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v24).intValue()),((java.lang.String)v25),(((java.lang.Integer)v26).intValue()),(((java.lang.Integer)v27).intValue()));
    Object v29 = ((com.google.javascript.jscomp.TypedScopeCreator)v23).createInitialScope(((com.google.javascript.rhino.Node)v28));
    Object v30 = "";
    Object v31 = ((com.google.javascript.jscomp.Scope)v29).getOwnSlot(((java.lang.String)v30));
    Object v32 = ((com.google.javascript.jscomp.TypedScopeCreator)v11).createScope(((com.google.javascript.rhino.Node)v16),((com.google.javascript.jscomp.Scope)v29));
    Object v33 = 3;
    Object v34 = "K";
    Object v35 = 1;
    Object v36 = -1;
    Object v37 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v33).intValue()),((java.lang.String)v34),(((java.lang.Integer)v35).intValue()),(((java.lang.Integer)v36).intValue()));
    ((com.google.javascript.jscomp.TypedScopeCreator)v5).patchGlobalScope(((com.google.javascript.jscomp.Scope)v32),((com.google.javascript.rhino.Node)v37));
    Object v38 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = 3;
    Object v7 = "K";
    Object v8 = 1;
    Object v9 = -1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = ((com.google.javascript.rhino.Node)v10).isFromExterns();
    Object v12 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createInitialScope(((com.google.javascript.rhino.Node)v10));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = 3;
    Object v7 = "K";
    Object v8 = 1;
    Object v9 = -1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = "prototypL";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = ((com.google.javascript.jscomp.AbstractCompiler)v14).getErrorManager();
    Object v16 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v14));
    Object v17 = 3;
    Object v18 = "K";
    Object v19 = 1;
    Object v20 = -1;
    Object v21 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v17).intValue()),((java.lang.String)v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
    Object v22 = ((com.google.javascript.rhino.Node)v21).isFromExterns();
    Object v23 = ((com.google.javascript.jscomp.TypedScopeCreator)v16).createInitialScope(((com.google.javascript.rhino.Node)v21));
    Object v24 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.Scope)v23));
    org.junit.Assert.assertNotNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
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
    Object v12 = 3;
    Object v13 = "K";
    Object v14 = 1;
    Object v15 = -1;
    Object v16 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v12).intValue()),((java.lang.String)v13),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = ((com.google.javascript.rhino.Node)v16).isFromExterns();
    Object v18 = ((com.google.javascript.jscomp.TypedScopeCreator)v11).createInitialScope(((com.google.javascript.rhino.Node)v16));
    Object v19 = ((com.google.javascript.jscomp.Scope)v18).getDeclarativelyUnboundVarsWithoutTypes();
    Object v20 = 3;
    Object v21 = "K";
    Object v22 = 1;
    Object v23 = -1;
    Object v24 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v20).intValue()),((java.lang.String)v21),(((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()));
    ((com.google.javascript.jscomp.TypedScopeCreator)v5).patchGlobalScope(((com.google.javascript.jscomp.Scope)v18),((com.google.javascript.rhino.Node)v24));
    Object v25 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = 3;
    Object v7 = "K";
    Object v8 = 1;
    Object v9 = -1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = ((com.google.javascript.rhino.Node)v10).getLength();
    Object v12 = "prototypL";
    Object v13 = java.nio.charset.Charset.defaultCharset();
    Object v14 = new java.io.PrintStream(((java.lang.String)v12),((java.nio.charset.Charset)v13));
    Object v15 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v14));
    Object v16 = ((com.google.javascript.jscomp.AbstractCompiler)v15).getErrorManager();
    Object v17 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v15));
    Object v18 = 3;
    Object v19 = "K";
    Object v20 = 1;
    Object v21 = -1;
    Object v22 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v18).intValue()),((java.lang.String)v19),(((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()));
    Object v23 = ((com.google.javascript.jscomp.TypedScopeCreator)v17).createInitialScope(((com.google.javascript.rhino.Node)v22));
    Object v24 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.Scope)v23));
    org.junit.Assert.assertNotNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = 3;
    Object v7 = "K";
    Object v8 = 1;
    Object v9 = -1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = ((com.google.javascript.rhino.Node)v10).siblings();
    Object v12 = "prototypL";
    Object v13 = java.nio.charset.Charset.defaultCharset();
    Object v14 = new java.io.PrintStream(((java.lang.String)v12),((java.nio.charset.Charset)v13));
    Object v15 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v14));
    Object v16 = ((com.google.javascript.jscomp.AbstractCompiler)v15).getErrorManager();
    Object v17 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v15));
    Object v18 = 3;
    Object v19 = "K";
    Object v20 = 1;
    Object v21 = -1;
    Object v22 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v18).intValue()),((java.lang.String)v19),(((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()));
    Object v23 = ((com.google.javascript.rhino.Node)v22).getStaticSourceFile();
    Object v24 = ((com.google.javascript.jscomp.TypedScopeCreator)v17).createInitialScope(((com.google.javascript.rhino.Node)v22));
    Object v25 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.Scope)v24));
    org.junit.Assert.assertNotNull(v25);
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
    Object v12 = 3;
    Object v13 = "K";
    Object v14 = 1;
    Object v15 = -1;
    Object v16 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v12).intValue()),((java.lang.String)v13),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = ((com.google.javascript.rhino.Node)v16).getLength();
    Object v18 = "prototypL";
    Object v19 = java.nio.charset.Charset.defaultCharset();
    Object v20 = new java.io.PrintStream(((java.lang.String)v18),((java.nio.charset.Charset)v19));
    Object v21 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v20));
    Object v22 = ((com.google.javascript.jscomp.AbstractCompiler)v21).getErrorManager();
    Object v23 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v21));
    Object v24 = 3;
    Object v25 = "K";
    Object v26 = 1;
    Object v27 = -1;
    Object v28 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v24).intValue()),((java.lang.String)v25),(((java.lang.Integer)v26).intValue()),(((java.lang.Integer)v27).intValue()));
    Object v29 = ((com.google.javascript.jscomp.TypedScopeCreator)v23).createInitialScope(((com.google.javascript.rhino.Node)v28));
    Object v30 = ((com.google.javascript.jscomp.TypedScopeCreator)v11).createScope(((com.google.javascript.rhino.Node)v16),((com.google.javascript.jscomp.Scope)v29));
    Object v31 = 3;
    Object v32 = "K";
    Object v33 = 1;
    Object v34 = -1;
    Object v35 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v31).intValue()),((java.lang.String)v32),(((java.lang.Integer)v33).intValue()),(((java.lang.Integer)v34).intValue()));
    ((com.google.javascript.jscomp.TypedScopeCreator)v5).patchGlobalScope(((com.google.javascript.jscomp.Scope)v30),((com.google.javascript.rhino.Node)v35));
    Object v36 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = 3;
    Object v7 = "K";
    Object v8 = 1;
    Object v9 = -1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = "prototypL";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = ((com.google.javascript.jscomp.AbstractCompiler)v14).getErrorManager();
    Object v16 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v14));
    Object v17 = 3;
    Object v18 = "K";
    Object v19 = 1;
    Object v20 = -1;
    Object v21 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v17).intValue()),((java.lang.String)v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
    Object v22 = "prototypL";
    Object v23 = java.nio.charset.Charset.defaultCharset();
    Object v24 = new java.io.PrintStream(((java.lang.String)v22),((java.nio.charset.Charset)v23));
    Object v25 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v24));
    Object v26 = ((com.google.javascript.jscomp.AbstractCompiler)v25).getErrorManager();
    Object v27 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v25));
    Object v28 = 3;
    Object v29 = "K";
    Object v30 = 1;
    Object v31 = -1;
    Object v32 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v28).intValue()),((java.lang.String)v29),(((java.lang.Integer)v30).intValue()),(((java.lang.Integer)v31).intValue()));
    Object v33 = ((com.google.javascript.rhino.Node)v32).isFromExterns();
    Object v34 = ((com.google.javascript.jscomp.TypedScopeCreator)v27).createInitialScope(((com.google.javascript.rhino.Node)v32));
    Object v35 = ((com.google.javascript.jscomp.TypedScopeCreator)v16).createScope(((com.google.javascript.rhino.Node)v21),((com.google.javascript.jscomp.Scope)v34));
    Object v36 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.Scope)v35));
    org.junit.Assert.assertNotNull(v36);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
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
    Object v12 = 3;
    Object v13 = "K";
    Object v14 = 1;
    Object v15 = -1;
    Object v16 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v12).intValue()),((java.lang.String)v13),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = ((com.google.javascript.rhino.Node)v16).siblings();
    Object v18 = "prototypL";
    Object v19 = java.nio.charset.Charset.defaultCharset();
    Object v20 = new java.io.PrintStream(((java.lang.String)v18),((java.nio.charset.Charset)v19));
    Object v21 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v20));
    Object v22 = ((com.google.javascript.jscomp.AbstractCompiler)v21).getErrorManager();
    Object v23 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v21));
    Object v24 = 3;
    Object v25 = "K";
    Object v26 = 1;
    Object v27 = -1;
    Object v28 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v24).intValue()),((java.lang.String)v25),(((java.lang.Integer)v26).intValue()),(((java.lang.Integer)v27).intValue()));
    Object v29 = ((com.google.javascript.rhino.Node)v28).getStaticSourceFile();
    Object v30 = ((com.google.javascript.jscomp.TypedScopeCreator)v23).createInitialScope(((com.google.javascript.rhino.Node)v28));
    Object v31 = ((com.google.javascript.jscomp.TypedScopeCreator)v11).createScope(((com.google.javascript.rhino.Node)v16),((com.google.javascript.jscomp.Scope)v30));
    Object v32 = 3;
    Object v33 = "K";
    Object v34 = 1;
    Object v35 = -1;
    Object v36 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v32).intValue()),((java.lang.String)v33),(((java.lang.Integer)v34).intValue()),(((java.lang.Integer)v35).intValue()));
    ((com.google.javascript.jscomp.TypedScopeCreator)v5).patchGlobalScope(((com.google.javascript.jscomp.Scope)v31),((com.google.javascript.rhino.Node)v36));
    Object v37 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
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
    Object v12 = 3;
    Object v13 = "K";
    Object v14 = 1;
    Object v15 = -1;
    Object v16 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v12).intValue()),((java.lang.String)v13),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = "prototypL";
    Object v18 = java.nio.charset.Charset.defaultCharset();
    Object v19 = new java.io.PrintStream(((java.lang.String)v17),((java.nio.charset.Charset)v18));
    Object v20 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v19));
    Object v21 = ((com.google.javascript.jscomp.AbstractCompiler)v20).getErrorManager();
    Object v22 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v20));
    Object v23 = 3;
    Object v24 = "K";
    Object v25 = 1;
    Object v26 = -1;
    Object v27 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v23).intValue()),((java.lang.String)v24),(((java.lang.Integer)v25).intValue()),(((java.lang.Integer)v26).intValue()));
    Object v28 = ((com.google.javascript.rhino.Node)v27).isFromExterns();
    Object v29 = ((com.google.javascript.jscomp.TypedScopeCreator)v22).createInitialScope(((com.google.javascript.rhino.Node)v27));
    Object v30 = ((com.google.javascript.jscomp.TypedScopeCreator)v11).createScope(((com.google.javascript.rhino.Node)v16),((com.google.javascript.jscomp.Scope)v29));
    Object v31 = 3;
    Object v32 = "K";
    Object v33 = 1;
    Object v34 = -1;
    Object v35 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v31).intValue()),((java.lang.String)v32),(((java.lang.Integer)v33).intValue()),(((java.lang.Integer)v34).intValue()));
    ((com.google.javascript.jscomp.TypedScopeCreator)v5).patchGlobalScope(((com.google.javascript.jscomp.Scope)v30),((com.google.javascript.rhino.Node)v35));
    Object v36 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
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
    Object v12 = 3;
    Object v13 = "K";
    Object v14 = 1;
    Object v15 = -1;
    Object v16 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v12).intValue()),((java.lang.String)v13),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = ((com.google.javascript.rhino.Node)v16).getLength();
    Object v18 = "prototypL";
    Object v19 = java.nio.charset.Charset.defaultCharset();
    Object v20 = new java.io.PrintStream(((java.lang.String)v18),((java.nio.charset.Charset)v19));
    Object v21 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v20));
    Object v22 = ((com.google.javascript.jscomp.AbstractCompiler)v21).getErrorManager();
    Object v23 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v21));
    Object v24 = 3;
    Object v25 = "K";
    Object v26 = 1;
    Object v27 = -1;
    Object v28 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v24).intValue()),((java.lang.String)v25),(((java.lang.Integer)v26).intValue()),(((java.lang.Integer)v27).intValue()));
    Object v29 = ((com.google.javascript.jscomp.TypedScopeCreator)v23).createInitialScope(((com.google.javascript.rhino.Node)v28));
    Object v30 = ((com.google.javascript.jscomp.TypedScopeCreator)v11).createScope(((com.google.javascript.rhino.Node)v16),((com.google.javascript.jscomp.Scope)v29));
    Object v31 = "F";
    Object v32 = ((com.google.javascript.jscomp.Scope)v30).getSlot(((java.lang.String)v31));
    Object v33 = 3;
    Object v34 = "K";
    Object v35 = 1;
    Object v36 = -1;
    Object v37 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v33).intValue()),((java.lang.String)v34),(((java.lang.Integer)v35).intValue()),(((java.lang.Integer)v36).intValue()));
    ((com.google.javascript.jscomp.TypedScopeCreator)v5).patchGlobalScope(((com.google.javascript.jscomp.Scope)v30),((com.google.javascript.rhino.Node)v37));
    Object v38 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
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
    Object v6 = "prototypL";
    Object v7 = java.nio.charset.Charset.defaultCharset();
    Object v8 = new java.io.PrintStream(((java.lang.String)v6),((java.nio.charset.Charset)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v8));
    Object v10 = ((com.google.javascript.jscomp.AbstractCompiler)v9).getErrorManager();
    Object v11 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v9));
    Object v12 = 3;
    Object v13 = "K";
    Object v14 = 1;
    Object v15 = -1;
    Object v16 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v12).intValue()),((java.lang.String)v13),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = ((com.google.javascript.rhino.Node)v16).isFromExterns();
    Object v18 = ((com.google.javascript.jscomp.TypedScopeCreator)v11).createInitialScope(((com.google.javascript.rhino.Node)v16));
    Object v19 = "";
    Object v20 = ((com.google.javascript.jscomp.Scope)v18).getOwnSlot(((java.lang.String)v19));
    Object v21 = 3;
    Object v22 = "K";
    Object v23 = 1;
    Object v24 = -1;
    Object v25 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v21).intValue()),((java.lang.String)v22),(((java.lang.Integer)v23).intValue()),(((java.lang.Integer)v24).intValue()));
    ((com.google.javascript.jscomp.TypedScopeCreator)v5).patchGlobalScope(((com.google.javascript.jscomp.Scope)v18),((com.google.javascript.rhino.Node)v25));
    Object v26 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = 3;
    Object v7 = "K";
    Object v8 = 1;
    Object v9 = -1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = 0;
    Object v12 = 3;
    Object v13 = "K";
    Object v14 = 1;
    Object v15 = -1;
    Object v16 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v12).intValue()),((java.lang.String)v13),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    ((com.google.javascript.rhino.Node)v10).putProp((((java.lang.Integer)v11).intValue()),((java.lang.Object)v16));
    Object v17 = null;
    Object v18 = "prototypL";
    Object v19 = java.nio.charset.Charset.defaultCharset();
    Object v20 = new java.io.PrintStream(((java.lang.String)v18),((java.nio.charset.Charset)v19));
    Object v21 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v20));
    Object v22 = ((com.google.javascript.jscomp.AbstractCompiler)v21).getErrorManager();
    Object v23 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v21));
    Object v24 = 3;
    Object v25 = "K";
    Object v26 = 1;
    Object v27 = -1;
    Object v28 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v24).intValue()),((java.lang.String)v25),(((java.lang.Integer)v26).intValue()),(((java.lang.Integer)v27).intValue()));
    Object v29 = ((com.google.javascript.rhino.Node)v28).isFromExterns();
    Object v30 = ((com.google.javascript.jscomp.TypedScopeCreator)v23).createInitialScope(((com.google.javascript.rhino.Node)v28));
    Object v31 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.Scope)v30));
    org.junit.Assert.assertNotNull(v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
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
    Object v12 = 3;
    Object v13 = "K";
    Object v14 = 1;
    Object v15 = -1;
    Object v16 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v12).intValue()),((java.lang.String)v13),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = ((com.google.javascript.rhino.Node)v16).isFromExterns();
    Object v18 = ((com.google.javascript.jscomp.TypedScopeCreator)v11).createInitialScope(((com.google.javascript.rhino.Node)v16));
    Object v19 = 3;
    Object v20 = "K";
    Object v21 = 1;
    Object v22 = -1;
    Object v23 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v19).intValue()),((java.lang.String)v20),(((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()));
    ((com.google.javascript.jscomp.TypedScopeCreator)v5).patchGlobalScope(((com.google.javascript.jscomp.Scope)v18),((com.google.javascript.rhino.Node)v23));
    Object v24 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = 3;
    Object v7 = "K";
    Object v8 = 1;
    Object v9 = -1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = "prototypL";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = ((com.google.javascript.jscomp.AbstractCompiler)v14).getErrorManager();
    Object v16 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v14));
    Object v17 = 3;
    Object v18 = "K";
    Object v19 = 1;
    Object v20 = -1;
    Object v21 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v17).intValue()),((java.lang.String)v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
    Object v22 = ((com.google.javascript.rhino.Node)v21).isFromExterns();
    Object v23 = ((com.google.javascript.jscomp.TypedScopeCreator)v16).createInitialScope(((com.google.javascript.rhino.Node)v21));
    Object v24 = ((com.google.javascript.jscomp.Scope)v23).getArgumentsVar();
    Object v25 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.Scope)v23));
    org.junit.Assert.assertNotNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = 3;
    Object v7 = "K";
    Object v8 = 1;
    Object v9 = -1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = "prototypL";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = ((com.google.javascript.jscomp.AbstractCompiler)v14).getErrorManager();
    Object v16 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v14));
    Object v17 = 3;
    Object v18 = "K";
    Object v19 = 1;
    Object v20 = -1;
    Object v21 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v17).intValue()),((java.lang.String)v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
    Object v22 = "prototypL";
    Object v23 = java.nio.charset.Charset.defaultCharset();
    Object v24 = new java.io.PrintStream(((java.lang.String)v22),((java.nio.charset.Charset)v23));
    Object v25 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v24));
    Object v26 = ((com.google.javascript.jscomp.AbstractCompiler)v25).getErrorManager();
    Object v27 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v25));
    Object v28 = 3;
    Object v29 = "K";
    Object v30 = 1;
    Object v31 = -1;
    Object v32 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v28).intValue()),((java.lang.String)v29),(((java.lang.Integer)v30).intValue()),(((java.lang.Integer)v31).intValue()));
    Object v33 = ((com.google.javascript.rhino.Node)v32).isFromExterns();
    Object v34 = ((com.google.javascript.jscomp.TypedScopeCreator)v27).createInitialScope(((com.google.javascript.rhino.Node)v32));
    Object v35 = ((com.google.javascript.jscomp.Scope)v34).getArgumentsVar();
    Object v36 = ((com.google.javascript.jscomp.TypedScopeCreator)v16).createScope(((com.google.javascript.rhino.Node)v21),((com.google.javascript.jscomp.Scope)v34));
    Object v37 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.Scope)v36));
    org.junit.Assert.assertNotNull(v37);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = 3;
    Object v7 = "K";
    Object v8 = 1;
    Object v9 = -1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = ((com.google.javascript.rhino.Node)v10).wasEmptyNode();
    Object v12 = "prototypL";
    Object v13 = java.nio.charset.Charset.defaultCharset();
    Object v14 = new java.io.PrintStream(((java.lang.String)v12),((java.nio.charset.Charset)v13));
    Object v15 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v14));
    Object v16 = ((com.google.javascript.jscomp.AbstractCompiler)v15).getErrorManager();
    Object v17 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v15));
    Object v18 = 3;
    Object v19 = "K";
    Object v20 = 1;
    Object v21 = -1;
    Object v22 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v18).intValue()),((java.lang.String)v19),(((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()));
    Object v23 = "prototypL";
    Object v24 = java.nio.charset.Charset.defaultCharset();
    Object v25 = new java.io.PrintStream(((java.lang.String)v23),((java.nio.charset.Charset)v24));
    Object v26 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v25));
    Object v27 = ((com.google.javascript.jscomp.AbstractCompiler)v26).getErrorManager();
    Object v28 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v26));
    Object v29 = 3;
    Object v30 = "K";
    Object v31 = 1;
    Object v32 = -1;
    Object v33 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v29).intValue()),((java.lang.String)v30),(((java.lang.Integer)v31).intValue()),(((java.lang.Integer)v32).intValue()));
    Object v34 = ((com.google.javascript.jscomp.TypedScopeCreator)v28).createInitialScope(((com.google.javascript.rhino.Node)v33));
    Object v35 = ((com.google.javascript.jscomp.TypedScopeCreator)v17).createScope(((com.google.javascript.rhino.Node)v22),((com.google.javascript.jscomp.Scope)v34));
    Object v36 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.Scope)v35));
    org.junit.Assert.assertNotNull(v36);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
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
    Object v12 = 3;
    Object v13 = "K";
    Object v14 = 1;
    Object v15 = -1;
    Object v16 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v12).intValue()),((java.lang.String)v13),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = ((com.google.javascript.rhino.Node)v16).getLength();
    Object v18 = "prototypL";
    Object v19 = java.nio.charset.Charset.defaultCharset();
    Object v20 = new java.io.PrintStream(((java.lang.String)v18),((java.nio.charset.Charset)v19));
    Object v21 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v20));
    Object v22 = ((com.google.javascript.jscomp.AbstractCompiler)v21).getErrorManager();
    Object v23 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v21));
    Object v24 = 3;
    Object v25 = "K";
    Object v26 = 1;
    Object v27 = -1;
    Object v28 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v24).intValue()),((java.lang.String)v25),(((java.lang.Integer)v26).intValue()),(((java.lang.Integer)v27).intValue()));
    Object v29 = ((com.google.javascript.jscomp.TypedScopeCreator)v23).createInitialScope(((com.google.javascript.rhino.Node)v28));
    Object v30 = ((com.google.javascript.jscomp.TypedScopeCreator)v11).createScope(((com.google.javascript.rhino.Node)v16),((com.google.javascript.jscomp.Scope)v29));
    Object v31 = 3;
    Object v32 = "K";
    Object v33 = 1;
    Object v34 = -1;
    Object v35 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v31).intValue()),((java.lang.String)v32),(((java.lang.Integer)v33).intValue()),(((java.lang.Integer)v34).intValue()));
    Object v36 = true;
    ((com.google.javascript.rhino.Node)v35).setWasEmptyNode((((java.lang.Boolean)v36).booleanValue()));
    Object v37 = null;
    ((com.google.javascript.jscomp.TypedScopeCreator)v5).patchGlobalScope(((com.google.javascript.jscomp.Scope)v30),((com.google.javascript.rhino.Node)v35));
    Object v38 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = 3;
    Object v7 = "K";
    Object v8 = 1;
    Object v9 = -1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = "prototypL";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = ((com.google.javascript.jscomp.AbstractCompiler)v14).getErrorManager();
    Object v16 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v14));
    Object v17 = 3;
    Object v18 = "K";
    Object v19 = 1;
    Object v20 = -1;
    Object v21 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v17).intValue()),((java.lang.String)v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
    Object v22 = ((com.google.javascript.rhino.Node)v21).getLength();
    Object v23 = "prototypL";
    Object v24 = java.nio.charset.Charset.defaultCharset();
    Object v25 = new java.io.PrintStream(((java.lang.String)v23),((java.nio.charset.Charset)v24));
    Object v26 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v25));
    Object v27 = ((com.google.javascript.jscomp.AbstractCompiler)v26).getErrorManager();
    Object v28 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v26));
    Object v29 = 3;
    Object v30 = "K";
    Object v31 = 1;
    Object v32 = -1;
    Object v33 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v29).intValue()),((java.lang.String)v30),(((java.lang.Integer)v31).intValue()),(((java.lang.Integer)v32).intValue()));
    Object v34 = ((com.google.javascript.jscomp.TypedScopeCreator)v28).createInitialScope(((com.google.javascript.rhino.Node)v33));
    Object v35 = ((com.google.javascript.jscomp.TypedScopeCreator)v16).createScope(((com.google.javascript.rhino.Node)v21),((com.google.javascript.jscomp.Scope)v34));
    Object v36 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.Scope)v35));
    org.junit.Assert.assertNotNull(v36);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v5 = "";
    Object v6 = ((com.google.javascript.jscomp.CodingConvention)v4).isPrivate(((java.lang.String)v5));
    Object v7 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v4));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
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
    Object v12 = 3;
    Object v13 = "K";
    Object v14 = 1;
    Object v15 = -1;
    Object v16 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v12).intValue()),((java.lang.String)v13),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = ((com.google.javascript.rhino.Node)v16).siblings();
    Object v18 = "prototypL";
    Object v19 = java.nio.charset.Charset.defaultCharset();
    Object v20 = new java.io.PrintStream(((java.lang.String)v18),((java.nio.charset.Charset)v19));
    Object v21 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v20));
    Object v22 = ((com.google.javascript.jscomp.AbstractCompiler)v21).getErrorManager();
    Object v23 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v21));
    Object v24 = 3;
    Object v25 = "K";
    Object v26 = 1;
    Object v27 = -1;
    Object v28 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v24).intValue()),((java.lang.String)v25),(((java.lang.Integer)v26).intValue()),(((java.lang.Integer)v27).intValue()));
    Object v29 = ((com.google.javascript.rhino.Node)v28).getStaticSourceFile();
    Object v30 = ((com.google.javascript.jscomp.TypedScopeCreator)v23).createInitialScope(((com.google.javascript.rhino.Node)v28));
    Object v31 = ((com.google.javascript.jscomp.TypedScopeCreator)v11).createScope(((com.google.javascript.rhino.Node)v16),((com.google.javascript.jscomp.Scope)v30));
    Object v32 = ((com.google.javascript.jscomp.Scope)v31).getArgumentsVar();
    Object v33 = 3;
    Object v34 = "K";
    Object v35 = 1;
    Object v36 = -1;
    Object v37 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v33).intValue()),((java.lang.String)v34),(((java.lang.Integer)v35).intValue()),(((java.lang.Integer)v36).intValue()));
    Object v38 = ((com.google.javascript.rhino.Node)v37).removeFirstChild();
    ((com.google.javascript.jscomp.TypedScopeCreator)v5).patchGlobalScope(((com.google.javascript.jscomp.Scope)v31),((com.google.javascript.rhino.Node)v37));
    Object v39 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
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
    Object v6 = "prototypL";
    Object v7 = java.nio.charset.Charset.defaultCharset();
    Object v8 = new java.io.PrintStream(((java.lang.String)v6),((java.nio.charset.Charset)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v8));
    Object v10 = ((com.google.javascript.jscomp.AbstractCompiler)v9).getErrorManager();
    Object v11 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v9));
    Object v12 = 3;
    Object v13 = "K";
    Object v14 = 1;
    Object v15 = -1;
    Object v16 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v12).intValue()),((java.lang.String)v13),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = ((com.google.javascript.rhino.Node)v16).isFromExterns();
    Object v18 = ((com.google.javascript.jscomp.TypedScopeCreator)v11).createInitialScope(((com.google.javascript.rhino.Node)v16));
    Object v19 = 3;
    Object v20 = "K";
    Object v21 = 1;
    Object v22 = -1;
    Object v23 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v19).intValue()),((java.lang.String)v20),(((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()));
    Object v24 = false;
    ((com.google.javascript.rhino.Node)v23).setWasEmptyNode((((java.lang.Boolean)v24).booleanValue()));
    Object v25 = null;
    ((com.google.javascript.jscomp.TypedScopeCreator)v5).patchGlobalScope(((com.google.javascript.jscomp.Scope)v18),((com.google.javascript.rhino.Node)v23));
    Object v26 = null;
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
    Object v6 = "prototypL";
    Object v7 = java.nio.charset.Charset.defaultCharset();
    Object v8 = new java.io.PrintStream(((java.lang.String)v6),((java.nio.charset.Charset)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v8));
    Object v10 = ((com.google.javascript.jscomp.AbstractCompiler)v9).getErrorManager();
    Object v11 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v9));
    Object v12 = 3;
    Object v13 = "K";
    Object v14 = 1;
    Object v15 = -1;
    Object v16 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v12).intValue()),((java.lang.String)v13),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = "prototypL";
    Object v18 = java.nio.charset.Charset.defaultCharset();
    Object v19 = new java.io.PrintStream(((java.lang.String)v17),((java.nio.charset.Charset)v18));
    Object v20 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v19));
    Object v21 = ((com.google.javascript.jscomp.AbstractCompiler)v20).getErrorManager();
    Object v22 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v20));
    Object v23 = 3;
    Object v24 = "K";
    Object v25 = 1;
    Object v26 = -1;
    Object v27 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v23).intValue()),((java.lang.String)v24),(((java.lang.Integer)v25).intValue()),(((java.lang.Integer)v26).intValue()));
    Object v28 = ((com.google.javascript.rhino.Node)v27).isFromExterns();
    Object v29 = ((com.google.javascript.jscomp.TypedScopeCreator)v22).createInitialScope(((com.google.javascript.rhino.Node)v27));
    Object v30 = ((com.google.javascript.jscomp.Scope)v29).getArgumentsVar();
    Object v31 = ((com.google.javascript.jscomp.TypedScopeCreator)v11).createScope(((com.google.javascript.rhino.Node)v16),((com.google.javascript.jscomp.Scope)v29));
    Object v32 = "";
    Object v33 = ((com.google.javascript.jscomp.Scope)v31).getSlot(((java.lang.String)v32));
    Object v34 = 3;
    Object v35 = "K";
    Object v36 = 1;
    Object v37 = -1;
    Object v38 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v34).intValue()),((java.lang.String)v35),(((java.lang.Integer)v36).intValue()),(((java.lang.Integer)v37).intValue()));
    ((com.google.javascript.jscomp.TypedScopeCreator)v5).patchGlobalScope(((com.google.javascript.jscomp.Scope)v31),((com.google.javascript.rhino.Node)v38));
    Object v39 = null;
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
    Object v6 = "prototypL";
    Object v7 = java.nio.charset.Charset.defaultCharset();
    Object v8 = new java.io.PrintStream(((java.lang.String)v6),((java.nio.charset.Charset)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v8));
    Object v10 = ((com.google.javascript.jscomp.AbstractCompiler)v9).getErrorManager();
    Object v11 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v9));
    Object v12 = 3;
    Object v13 = "K";
    Object v14 = 1;
    Object v15 = -1;
    Object v16 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v12).intValue()),((java.lang.String)v13),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = "prototypL";
    Object v18 = java.nio.charset.Charset.defaultCharset();
    Object v19 = new java.io.PrintStream(((java.lang.String)v17),((java.nio.charset.Charset)v18));
    Object v20 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v19));
    Object v21 = ((com.google.javascript.jscomp.AbstractCompiler)v20).getErrorManager();
    Object v22 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v20));
    Object v23 = 3;
    Object v24 = "K";
    Object v25 = 1;
    Object v26 = -1;
    Object v27 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v23).intValue()),((java.lang.String)v24),(((java.lang.Integer)v25).intValue()),(((java.lang.Integer)v26).intValue()));
    Object v28 = ((com.google.javascript.rhino.Node)v27).isFromExterns();
    Object v29 = ((com.google.javascript.jscomp.TypedScopeCreator)v22).createInitialScope(((com.google.javascript.rhino.Node)v27));
    Object v30 = ((com.google.javascript.jscomp.Scope)v29).getArgumentsVar();
    Object v31 = ((com.google.javascript.jscomp.TypedScopeCreator)v11).createScope(((com.google.javascript.rhino.Node)v16),((com.google.javascript.jscomp.Scope)v29));
    Object v32 = 3;
    Object v33 = "K";
    Object v34 = 1;
    Object v35 = -1;
    Object v36 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v32).intValue()),((java.lang.String)v33),(((java.lang.Integer)v34).intValue()),(((java.lang.Integer)v35).intValue()));
    ((com.google.javascript.jscomp.TypedScopeCreator)v5).patchGlobalScope(((com.google.javascript.jscomp.Scope)v31),((com.google.javascript.rhino.Node)v36));
    Object v37 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
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
    Object v12 = 3;
    Object v13 = "K";
    Object v14 = 1;
    Object v15 = -1;
    Object v16 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v12).intValue()),((java.lang.String)v13),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = ((com.google.javascript.jscomp.TypedScopeCreator)v11).createInitialScope(((com.google.javascript.rhino.Node)v16));
    Object v18 = "x";
    Object v19 = ((com.google.javascript.jscomp.Scope)v17).getVar(((java.lang.String)v18));
    Object v20 = 3;
    Object v21 = "K";
    Object v22 = 1;
    Object v23 = -1;
    Object v24 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v20).intValue()),((java.lang.String)v21),(((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()));
    ((com.google.javascript.jscomp.TypedScopeCreator)v5).patchGlobalScope(((com.google.javascript.jscomp.Scope)v17),((com.google.javascript.rhino.Node)v24));
    Object v25 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
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
    Object v12 = 3;
    Object v13 = "K";
    Object v14 = 1;
    Object v15 = -1;
    Object v16 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v12).intValue()),((java.lang.String)v13),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = "prototypL";
    Object v18 = java.nio.charset.Charset.defaultCharset();
    Object v19 = new java.io.PrintStream(((java.lang.String)v17),((java.nio.charset.Charset)v18));
    Object v20 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v19));
    Object v21 = ((com.google.javascript.jscomp.AbstractCompiler)v20).getErrorManager();
    Object v22 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v20));
    Object v23 = 3;
    Object v24 = "K";
    Object v25 = 1;
    Object v26 = -1;
    Object v27 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v23).intValue()),((java.lang.String)v24),(((java.lang.Integer)v25).intValue()),(((java.lang.Integer)v26).intValue()));
    Object v28 = ((com.google.javascript.rhino.Node)v27).isFromExterns();
    Object v29 = ((com.google.javascript.jscomp.TypedScopeCreator)v22).createInitialScope(((com.google.javascript.rhino.Node)v27));
    Object v30 = ((com.google.javascript.jscomp.Scope)v29).getArgumentsVar();
    Object v31 = ((com.google.javascript.jscomp.TypedScopeCreator)v11).createScope(((com.google.javascript.rhino.Node)v16),((com.google.javascript.jscomp.Scope)v29));
    Object v32 = ((com.google.javascript.jscomp.Scope)v31).getAllSymbols();
    Object v33 = 3;
    Object v34 = "K";
    Object v35 = 1;
    Object v36 = -1;
    Object v37 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v33).intValue()),((java.lang.String)v34),(((java.lang.Integer)v35).intValue()),(((java.lang.Integer)v36).intValue()));
    ((com.google.javascript.jscomp.TypedScopeCreator)v5).patchGlobalScope(((com.google.javascript.jscomp.Scope)v31),((com.google.javascript.rhino.Node)v37));
    Object v38 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = 3;
    Object v7 = "K";
    Object v8 = 1;
    Object v9 = -1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = false;
    ((com.google.javascript.rhino.Node)v10).setVarArgs((((java.lang.Boolean)v11).booleanValue()));
    Object v12 = null;
    Object v13 = "prototypL";
    Object v14 = java.nio.charset.Charset.defaultCharset();
    Object v15 = new java.io.PrintStream(((java.lang.String)v13),((java.nio.charset.Charset)v14));
    Object v16 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v15));
    Object v17 = ((com.google.javascript.jscomp.AbstractCompiler)v16).getErrorManager();
    Object v18 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v16));
    Object v19 = 3;
    Object v20 = "K";
    Object v21 = 1;
    Object v22 = -1;
    Object v23 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v19).intValue()),((java.lang.String)v20),(((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()));
    Object v24 = ((com.google.javascript.rhino.Node)v23).getLength();
    Object v25 = "prototypL";
    Object v26 = java.nio.charset.Charset.defaultCharset();
    Object v27 = new java.io.PrintStream(((java.lang.String)v25),((java.nio.charset.Charset)v26));
    Object v28 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v27));
    Object v29 = ((com.google.javascript.jscomp.AbstractCompiler)v28).getErrorManager();
    Object v30 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v28));
    Object v31 = 3;
    Object v32 = "K";
    Object v33 = 1;
    Object v34 = -1;
    Object v35 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v31).intValue()),((java.lang.String)v32),(((java.lang.Integer)v33).intValue()),(((java.lang.Integer)v34).intValue()));
    Object v36 = ((com.google.javascript.jscomp.TypedScopeCreator)v30).createInitialScope(((com.google.javascript.rhino.Node)v35));
    Object v37 = ((com.google.javascript.jscomp.TypedScopeCreator)v18).createScope(((com.google.javascript.rhino.Node)v23),((com.google.javascript.jscomp.Scope)v36));
    Object v38 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.Scope)v37));
    org.junit.Assert.assertNotNull(v38);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = 3;
    Object v7 = "K";
    Object v8 = 1;
    Object v9 = -1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = ((com.google.javascript.rhino.Node)v10).cloneNode();
    Object v12 = "prototypL";
    Object v13 = java.nio.charset.Charset.defaultCharset();
    Object v14 = new java.io.PrintStream(((java.lang.String)v12),((java.nio.charset.Charset)v13));
    Object v15 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v14));
    Object v16 = ((com.google.javascript.jscomp.AbstractCompiler)v15).getErrorManager();
    Object v17 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v15));
    Object v18 = 3;
    Object v19 = "K";
    Object v20 = 1;
    Object v21 = -1;
    Object v22 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v18).intValue()),((java.lang.String)v19),(((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()));
    Object v23 = ((com.google.javascript.jscomp.TypedScopeCreator)v17).createInitialScope(((com.google.javascript.rhino.Node)v22));
    Object v24 = "1";
    Object v25 = true;
    Object v26 = ((com.google.javascript.jscomp.Scope)v23).isDeclared(((java.lang.String)v24),(((java.lang.Boolean)v25).booleanValue()));
    Object v27 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.Scope)v23));
    org.junit.Assert.assertNotNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = 3;
    Object v7 = "K";
    Object v8 = 1;
    Object v9 = -1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = ((com.google.javascript.rhino.Node)v10).getSourceOffset();
    Object v12 = "prototypL";
    Object v13 = java.nio.charset.Charset.defaultCharset();
    Object v14 = new java.io.PrintStream(((java.lang.String)v12),((java.nio.charset.Charset)v13));
    Object v15 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v14));
    Object v16 = ((com.google.javascript.jscomp.AbstractCompiler)v15).getErrorManager();
    Object v17 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v15));
    Object v18 = 3;
    Object v19 = "K";
    Object v20 = 1;
    Object v21 = -1;
    Object v22 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v18).intValue()),((java.lang.String)v19),(((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()));
    Object v23 = ((com.google.javascript.rhino.Node)v22).isFromExterns();
    Object v24 = ((com.google.javascript.jscomp.TypedScopeCreator)v17).createInitialScope(((com.google.javascript.rhino.Node)v22));
    Object v25 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.Scope)v24));
    org.junit.Assert.assertNotNull(v25);
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
    Object v6 = "prototypL";
    Object v7 = java.nio.charset.Charset.defaultCharset();
    Object v8 = new java.io.PrintStream(((java.lang.String)v6),((java.nio.charset.Charset)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v8));
    Object v10 = ((com.google.javascript.jscomp.AbstractCompiler)v9).getErrorManager();
    Object v11 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v9));
    Object v12 = 3;
    Object v13 = "K";
    Object v14 = 1;
    Object v15 = -1;
    Object v16 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v12).intValue()),((java.lang.String)v13),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = ((com.google.javascript.rhino.Node)v16).getSourceOffset();
    Object v18 = "prototypL";
    Object v19 = java.nio.charset.Charset.defaultCharset();
    Object v20 = new java.io.PrintStream(((java.lang.String)v18),((java.nio.charset.Charset)v19));
    Object v21 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v20));
    Object v22 = ((com.google.javascript.jscomp.AbstractCompiler)v21).getErrorManager();
    Object v23 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v21));
    Object v24 = 3;
    Object v25 = "K";
    Object v26 = 1;
    Object v27 = -1;
    Object v28 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v24).intValue()),((java.lang.String)v25),(((java.lang.Integer)v26).intValue()),(((java.lang.Integer)v27).intValue()));
    Object v29 = ((com.google.javascript.rhino.Node)v28).isFromExterns();
    Object v30 = ((com.google.javascript.jscomp.TypedScopeCreator)v23).createInitialScope(((com.google.javascript.rhino.Node)v28));
    Object v31 = ((com.google.javascript.jscomp.TypedScopeCreator)v11).createScope(((com.google.javascript.rhino.Node)v16),((com.google.javascript.jscomp.Scope)v30));
    Object v32 = 3;
    Object v33 = "K";
    Object v34 = 1;
    Object v35 = -1;
    Object v36 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v32).intValue()),((java.lang.String)v33),(((java.lang.Integer)v34).intValue()),(((java.lang.Integer)v35).intValue()));
    ((com.google.javascript.jscomp.TypedScopeCreator)v5).patchGlobalScope(((com.google.javascript.jscomp.Scope)v31),((com.google.javascript.rhino.Node)v36));
    Object v37 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = 3;
    Object v7 = "K";
    Object v8 = 1;
    Object v9 = -1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = "prototypL";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = ((com.google.javascript.jscomp.AbstractCompiler)v14).getErrorManager();
    Object v16 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v14));
    Object v17 = 3;
    Object v18 = "K";
    Object v19 = 1;
    Object v20 = -1;
    Object v21 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v17).intValue()),((java.lang.String)v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
    Object v22 = ((com.google.javascript.rhino.Node)v21).cloneNode();
    Object v23 = "prototypL";
    Object v24 = java.nio.charset.Charset.defaultCharset();
    Object v25 = new java.io.PrintStream(((java.lang.String)v23),((java.nio.charset.Charset)v24));
    Object v26 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v25));
    Object v27 = ((com.google.javascript.jscomp.AbstractCompiler)v26).getErrorManager();
    Object v28 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v26));
    Object v29 = 3;
    Object v30 = "K";
    Object v31 = 1;
    Object v32 = -1;
    Object v33 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v29).intValue()),((java.lang.String)v30),(((java.lang.Integer)v31).intValue()),(((java.lang.Integer)v32).intValue()));
    Object v34 = ((com.google.javascript.jscomp.TypedScopeCreator)v28).createInitialScope(((com.google.javascript.rhino.Node)v33));
    Object v35 = "1";
    Object v36 = true;
    Object v37 = ((com.google.javascript.jscomp.Scope)v34).isDeclared(((java.lang.String)v35),(((java.lang.Boolean)v36).booleanValue()));
    Object v38 = ((com.google.javascript.jscomp.TypedScopeCreator)v16).createScope(((com.google.javascript.rhino.Node)v21),((com.google.javascript.jscomp.Scope)v34));
    Object v39 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.Scope)v38));
    org.junit.Assert.assertNotNull(v39);
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
    Object v6 = "prototypL";
    Object v7 = java.nio.charset.Charset.defaultCharset();
    Object v8 = new java.io.PrintStream(((java.lang.String)v6),((java.nio.charset.Charset)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v8));
    Object v10 = ((com.google.javascript.jscomp.AbstractCompiler)v9).getErrorManager();
    Object v11 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v9));
    Object v12 = 3;
    Object v13 = "K";
    Object v14 = 1;
    Object v15 = -1;
    Object v16 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v12).intValue()),((java.lang.String)v13),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = ((com.google.javascript.rhino.Node)v16).getSourceOffset();
    Object v18 = "prototypL";
    Object v19 = java.nio.charset.Charset.defaultCharset();
    Object v20 = new java.io.PrintStream(((java.lang.String)v18),((java.nio.charset.Charset)v19));
    Object v21 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v20));
    Object v22 = ((com.google.javascript.jscomp.AbstractCompiler)v21).getErrorManager();
    Object v23 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v21));
    Object v24 = 3;
    Object v25 = "K";
    Object v26 = 1;
    Object v27 = -1;
    Object v28 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v24).intValue()),((java.lang.String)v25),(((java.lang.Integer)v26).intValue()),(((java.lang.Integer)v27).intValue()));
    Object v29 = ((com.google.javascript.rhino.Node)v28).isFromExterns();
    Object v30 = ((com.google.javascript.jscomp.TypedScopeCreator)v23).createInitialScope(((com.google.javascript.rhino.Node)v28));
    Object v31 = ((com.google.javascript.jscomp.TypedScopeCreator)v11).createScope(((com.google.javascript.rhino.Node)v16),((com.google.javascript.jscomp.Scope)v30));
    Object v32 = 3;
    Object v33 = "K";
    Object v34 = 1;
    Object v35 = -1;
    Object v36 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v32).intValue()),((java.lang.String)v33),(((java.lang.Integer)v34).intValue()),(((java.lang.Integer)v35).intValue()));
    Object v37 = true;
    ((com.google.javascript.rhino.Node)v36).setIsSyntheticBlock((((java.lang.Boolean)v37).booleanValue()));
    Object v38 = null;
    ((com.google.javascript.jscomp.TypedScopeCreator)v5).patchGlobalScope(((com.google.javascript.jscomp.Scope)v31),((com.google.javascript.rhino.Node)v36));
    Object v39 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = 3;
    Object v7 = "K";
    Object v8 = 1;
    Object v9 = -1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = ((com.google.javascript.rhino.Node)v10).isOptionalArg();
    Object v12 = "prototypL";
    Object v13 = java.nio.charset.Charset.defaultCharset();
    Object v14 = new java.io.PrintStream(((java.lang.String)v12),((java.nio.charset.Charset)v13));
    Object v15 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v14));
    Object v16 = ((com.google.javascript.jscomp.AbstractCompiler)v15).getErrorManager();
    Object v17 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v15));
    Object v18 = 3;
    Object v19 = "K";
    Object v20 = 1;
    Object v21 = -1;
    Object v22 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v18).intValue()),((java.lang.String)v19),(((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()));
    Object v23 = ((com.google.javascript.rhino.Node)v22).getSourceOffset();
    Object v24 = "prototypL";
    Object v25 = java.nio.charset.Charset.defaultCharset();
    Object v26 = new java.io.PrintStream(((java.lang.String)v24),((java.nio.charset.Charset)v25));
    Object v27 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v26));
    Object v28 = ((com.google.javascript.jscomp.AbstractCompiler)v27).getErrorManager();
    Object v29 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v27));
    Object v30 = 3;
    Object v31 = "K";
    Object v32 = 1;
    Object v33 = -1;
    Object v34 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v30).intValue()),((java.lang.String)v31),(((java.lang.Integer)v32).intValue()),(((java.lang.Integer)v33).intValue()));
    Object v35 = ((com.google.javascript.rhino.Node)v34).isFromExterns();
    Object v36 = ((com.google.javascript.jscomp.TypedScopeCreator)v29).createInitialScope(((com.google.javascript.rhino.Node)v34));
    Object v37 = ((com.google.javascript.jscomp.TypedScopeCreator)v17).createScope(((com.google.javascript.rhino.Node)v22),((com.google.javascript.jscomp.Scope)v36));
    Object v38 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.Scope)v37));
    org.junit.Assert.assertNotNull(v38);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
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
    Object v12 = 3;
    Object v13 = "K";
    Object v14 = 1;
    Object v15 = -1;
    Object v16 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v12).intValue()),((java.lang.String)v13),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = ((com.google.javascript.rhino.Node)v16).cloneNode();
    Object v18 = "prototypL";
    Object v19 = java.nio.charset.Charset.defaultCharset();
    Object v20 = new java.io.PrintStream(((java.lang.String)v18),((java.nio.charset.Charset)v19));
    Object v21 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v20));
    Object v22 = ((com.google.javascript.jscomp.AbstractCompiler)v21).getErrorManager();
    Object v23 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v21));
    Object v24 = 3;
    Object v25 = "K";
    Object v26 = 1;
    Object v27 = -1;
    Object v28 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v24).intValue()),((java.lang.String)v25),(((java.lang.Integer)v26).intValue()),(((java.lang.Integer)v27).intValue()));
    Object v29 = ((com.google.javascript.jscomp.TypedScopeCreator)v23).createInitialScope(((com.google.javascript.rhino.Node)v28));
    Object v30 = "1";
    Object v31 = true;
    Object v32 = ((com.google.javascript.jscomp.Scope)v29).isDeclared(((java.lang.String)v30),(((java.lang.Boolean)v31).booleanValue()));
    Object v33 = ((com.google.javascript.jscomp.TypedScopeCreator)v11).createScope(((com.google.javascript.rhino.Node)v16),((com.google.javascript.jscomp.Scope)v29));
    Object v34 = 3;
    Object v35 = "K";
    Object v36 = 1;
    Object v37 = -1;
    Object v38 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v34).intValue()),((java.lang.String)v35),(((java.lang.Integer)v36).intValue()),(((java.lang.Integer)v37).intValue()));
    ((com.google.javascript.jscomp.TypedScopeCreator)v5).patchGlobalScope(((com.google.javascript.jscomp.Scope)v33),((com.google.javascript.rhino.Node)v38));
    Object v39 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
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
    Object v12 = 3;
    Object v13 = "K";
    Object v14 = 1;
    Object v15 = -1;
    Object v16 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v12).intValue()),((java.lang.String)v13),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = ((com.google.javascript.rhino.Node)v16).getStaticSourceFile();
    Object v18 = ((com.google.javascript.jscomp.TypedScopeCreator)v11).createInitialScope(((com.google.javascript.rhino.Node)v16));
    Object v19 = ((com.google.javascript.jscomp.Scope)v18).getVarCount();
    Object v20 = 3;
    Object v21 = "K";
    Object v22 = 1;
    Object v23 = -1;
    Object v24 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v20).intValue()),((java.lang.String)v21),(((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()));
    ((com.google.javascript.jscomp.TypedScopeCreator)v5).patchGlobalScope(((com.google.javascript.jscomp.Scope)v18),((com.google.javascript.rhino.Node)v24));
    Object v25 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
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
    Object v12 = 3;
    Object v13 = "K";
    Object v14 = 1;
    Object v15 = -1;
    Object v16 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v12).intValue()),((java.lang.String)v13),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = ((com.google.javascript.rhino.Node)v16).isFromExterns();
    Object v18 = ((com.google.javascript.jscomp.TypedScopeCreator)v11).createInitialScope(((com.google.javascript.rhino.Node)v16));
    Object v19 = ((com.google.javascript.jscomp.Scope)v18).getArgumentsVar();
    Object v20 = 3;
    Object v21 = "K";
    Object v22 = 1;
    Object v23 = -1;
    Object v24 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v20).intValue()),((java.lang.String)v21),(((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()));
    Object v25 = 47;
    Object v26 = true;
    ((com.google.javascript.rhino.Node)v24).putBooleanProp((((java.lang.Integer)v25).intValue()),(((java.lang.Boolean)v26).booleanValue()));
    Object v27 = null;
    ((com.google.javascript.jscomp.TypedScopeCreator)v5).patchGlobalScope(((com.google.javascript.jscomp.Scope)v18),((com.google.javascript.rhino.Node)v24));
    Object v28 = null;
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
    Object v6 = "prototypL";
    Object v7 = java.nio.charset.Charset.defaultCharset();
    Object v8 = new java.io.PrintStream(((java.lang.String)v6),((java.nio.charset.Charset)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v8));
    Object v10 = ((com.google.javascript.jscomp.AbstractCompiler)v9).getErrorManager();
    Object v11 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v9));
    Object v12 = 3;
    Object v13 = "K";
    Object v14 = 1;
    Object v15 = -1;
    Object v16 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v12).intValue()),((java.lang.String)v13),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = ((com.google.javascript.rhino.Node)v16).isFromExterns();
    Object v18 = ((com.google.javascript.jscomp.TypedScopeCreator)v11).createInitialScope(((com.google.javascript.rhino.Node)v16));
    Object v19 = ((com.google.javascript.jscomp.Scope)v18).getAllSymbols();
    Object v20 = 3;
    Object v21 = "K";
    Object v22 = 1;
    Object v23 = -1;
    Object v24 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v20).intValue()),((java.lang.String)v21),(((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()));
    Object v25 = -5;
    Object v26 = -8;
    ((com.google.javascript.rhino.Node)v24).putIntProp((((java.lang.Integer)v25).intValue()),(((java.lang.Integer)v26).intValue()));
    Object v27 = null;
    ((com.google.javascript.jscomp.TypedScopeCreator)v5).patchGlobalScope(((com.google.javascript.jscomp.Scope)v18),((com.google.javascript.rhino.Node)v24));
    Object v28 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
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
    Object v12 = 3;
    Object v13 = "K";
    Object v14 = 1;
    Object v15 = -1;
    Object v16 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v12).intValue()),((java.lang.String)v13),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = ((com.google.javascript.rhino.Node)v16).isFromExterns();
    Object v18 = ((com.google.javascript.jscomp.TypedScopeCreator)v11).createInitialScope(((com.google.javascript.rhino.Node)v16));
    Object v19 = 3;
    Object v20 = "K";
    Object v21 = 1;
    Object v22 = -1;
    Object v23 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v19).intValue()),((java.lang.String)v20),(((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()));
    Object v24 = ((com.google.javascript.rhino.Node)v23).isQualifiedName();
    ((com.google.javascript.jscomp.TypedScopeCreator)v5).patchGlobalScope(((com.google.javascript.jscomp.Scope)v18),((com.google.javascript.rhino.Node)v23));
    Object v25 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getTopScope();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
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
    Object v6 = "prototypL";
    Object v7 = java.nio.charset.Charset.defaultCharset();
    Object v8 = new java.io.PrintStream(((java.lang.String)v6),((java.nio.charset.Charset)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v8));
    Object v10 = ((com.google.javascript.jscomp.AbstractCompiler)v9).getErrorManager();
    Object v11 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v9));
    Object v12 = 3;
    Object v13 = "K";
    Object v14 = 1;
    Object v15 = -1;
    Object v16 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v12).intValue()),((java.lang.String)v13),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = ((com.google.javascript.rhino.Node)v16).isNoSideEffectsCall();
    Object v18 = "prototypL";
    Object v19 = java.nio.charset.Charset.defaultCharset();
    Object v20 = new java.io.PrintStream(((java.lang.String)v18),((java.nio.charset.Charset)v19));
    Object v21 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v20));
    Object v22 = ((com.google.javascript.jscomp.AbstractCompiler)v21).getErrorManager();
    Object v23 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v21));
    Object v24 = 3;
    Object v25 = "K";
    Object v26 = 1;
    Object v27 = -1;
    Object v28 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v24).intValue()),((java.lang.String)v25),(((java.lang.Integer)v26).intValue()),(((java.lang.Integer)v27).intValue()));
    Object v29 = ((com.google.javascript.jscomp.TypedScopeCreator)v23).createInitialScope(((com.google.javascript.rhino.Node)v28));
    Object v30 = "";
    Object v31 = ((com.google.javascript.jscomp.Scope)v29).getOwnSlot(((java.lang.String)v30));
    Object v32 = ((com.google.javascript.jscomp.TypedScopeCreator)v11).createScope(((com.google.javascript.rhino.Node)v16),((com.google.javascript.jscomp.Scope)v29));
    Object v33 = ((com.google.javascript.jscomp.Scope)v32).getArgumentsVar();
    Object v34 = 3;
    Object v35 = "K";
    Object v36 = 1;
    Object v37 = -1;
    Object v38 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v34).intValue()),((java.lang.String)v35),(((java.lang.Integer)v36).intValue()),(((java.lang.Integer)v37).intValue()));
    ((com.google.javascript.jscomp.TypedScopeCreator)v5).patchGlobalScope(((com.google.javascript.jscomp.Scope)v32),((com.google.javascript.rhino.Node)v38));
    Object v39 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = 3;
    Object v7 = "K";
    Object v8 = 1;
    Object v9 = -1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = "prototypL";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = ((com.google.javascript.jscomp.AbstractCompiler)v14).getErrorManager();
    Object v16 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v14));
    Object v17 = 3;
    Object v18 = "K";
    Object v19 = 1;
    Object v20 = -1;
    Object v21 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v17).intValue()),((java.lang.String)v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
    Object v22 = ((com.google.javascript.rhino.Node)v21).siblings();
    Object v23 = "prototypL";
    Object v24 = java.nio.charset.Charset.defaultCharset();
    Object v25 = new java.io.PrintStream(((java.lang.String)v23),((java.nio.charset.Charset)v24));
    Object v26 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v25));
    Object v27 = ((com.google.javascript.jscomp.AbstractCompiler)v26).getErrorManager();
    Object v28 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v26));
    Object v29 = 3;
    Object v30 = "K";
    Object v31 = 1;
    Object v32 = -1;
    Object v33 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v29).intValue()),((java.lang.String)v30),(((java.lang.Integer)v31).intValue()),(((java.lang.Integer)v32).intValue()));
    Object v34 = ((com.google.javascript.rhino.Node)v33).getStaticSourceFile();
    Object v35 = ((com.google.javascript.jscomp.TypedScopeCreator)v28).createInitialScope(((com.google.javascript.rhino.Node)v33));
    Object v36 = ((com.google.javascript.jscomp.TypedScopeCreator)v16).createScope(((com.google.javascript.rhino.Node)v21),((com.google.javascript.jscomp.Scope)v35));
    Object v37 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.Scope)v36));
    org.junit.Assert.assertNotNull(v37);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = 3;
    Object v7 = "K";
    Object v8 = 1;
    Object v9 = -1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = "prototypL";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = ((com.google.javascript.jscomp.AbstractCompiler)v14).getErrorManager();
    Object v16 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v14));
    Object v17 = 3;
    Object v18 = "K";
    Object v19 = 1;
    Object v20 = -1;
    Object v21 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v17).intValue()),((java.lang.String)v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
    Object v22 = "prototypL";
    Object v23 = java.nio.charset.Charset.defaultCharset();
    Object v24 = new java.io.PrintStream(((java.lang.String)v22),((java.nio.charset.Charset)v23));
    Object v25 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v24));
    Object v26 = ((com.google.javascript.jscomp.AbstractCompiler)v25).getErrorManager();
    Object v27 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v25));
    Object v28 = 3;
    Object v29 = "K";
    Object v30 = 1;
    Object v31 = -1;
    Object v32 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v28).intValue()),((java.lang.String)v29),(((java.lang.Integer)v30).intValue()),(((java.lang.Integer)v31).intValue()));
    Object v33 = ((com.google.javascript.rhino.Node)v32).isFromExterns();
    Object v34 = ((com.google.javascript.jscomp.TypedScopeCreator)v27).createInitialScope(((com.google.javascript.rhino.Node)v32));
    Object v35 = ((com.google.javascript.jscomp.Scope)v34).getArgumentsVar();
    Object v36 = ((com.google.javascript.jscomp.TypedScopeCreator)v16).createScope(((com.google.javascript.rhino.Node)v21),((com.google.javascript.jscomp.Scope)v34));
    Object v37 = ((com.google.javascript.jscomp.Scope)v36).getVars();
    Object v38 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.Scope)v36));
    org.junit.Assert.assertNotNull(v38);
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
    Object v6 = "prototypL";
    Object v7 = java.nio.charset.Charset.defaultCharset();
    Object v8 = new java.io.PrintStream(((java.lang.String)v6),((java.nio.charset.Charset)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v8));
    Object v10 = ((com.google.javascript.jscomp.AbstractCompiler)v9).getErrorManager();
    Object v11 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v9));
    Object v12 = 3;
    Object v13 = "K";
    Object v14 = 1;
    Object v15 = -1;
    Object v16 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v12).intValue()),((java.lang.String)v13),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = ((com.google.javascript.jscomp.TypedScopeCreator)v11).createInitialScope(((com.google.javascript.rhino.Node)v16));
    Object v18 = "toSrource";
    Object v19 = true;
    Object v20 = ((com.google.javascript.jscomp.Scope)v17).isDeclared(((java.lang.String)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = 3;
    Object v22 = "K";
    Object v23 = 1;
    Object v24 = -1;
    Object v25 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v21).intValue()),((java.lang.String)v22),(((java.lang.Integer)v23).intValue()),(((java.lang.Integer)v24).intValue()));
    ((com.google.javascript.jscomp.TypedScopeCreator)v5).patchGlobalScope(((com.google.javascript.jscomp.Scope)v17),((com.google.javascript.rhino.Node)v25));
    Object v26 = null;
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
    Object v6 = 3;
    Object v7 = "K";
    Object v8 = 1;
    Object v9 = -1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = "prototypL";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = ((com.google.javascript.jscomp.AbstractCompiler)v14).getErrorManager();
    Object v16 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v14));
    Object v17 = 3;
    Object v18 = "K";
    Object v19 = 1;
    Object v20 = -1;
    Object v21 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v17).intValue()),((java.lang.String)v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
    Object v22 = ((com.google.javascript.rhino.Node)v21).getSourceOffset();
    Object v23 = "prototypL";
    Object v24 = java.nio.charset.Charset.defaultCharset();
    Object v25 = new java.io.PrintStream(((java.lang.String)v23),((java.nio.charset.Charset)v24));
    Object v26 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v25));
    Object v27 = ((com.google.javascript.jscomp.AbstractCompiler)v26).getErrorManager();
    Object v28 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v26));
    Object v29 = 3;
    Object v30 = "K";
    Object v31 = 1;
    Object v32 = -1;
    Object v33 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v29).intValue()),((java.lang.String)v30),(((java.lang.Integer)v31).intValue()),(((java.lang.Integer)v32).intValue()));
    Object v34 = ((com.google.javascript.rhino.Node)v33).isFromExterns();
    Object v35 = ((com.google.javascript.jscomp.TypedScopeCreator)v28).createInitialScope(((com.google.javascript.rhino.Node)v33));
    Object v36 = ((com.google.javascript.jscomp.TypedScopeCreator)v16).createScope(((com.google.javascript.rhino.Node)v21),((com.google.javascript.jscomp.Scope)v35));
    Object v37 = ((com.google.javascript.jscomp.Scope)v36).getAllSymbols();
    Object v38 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.Scope)v36));
    org.junit.Assert.assertNotNull(v38);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
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
    Object v12 = 3;
    Object v13 = "K";
    Object v14 = 1;
    Object v15 = -1;
    Object v16 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v12).intValue()),((java.lang.String)v13),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = "prototypL";
    Object v18 = java.nio.charset.Charset.defaultCharset();
    Object v19 = new java.io.PrintStream(((java.lang.String)v17),((java.nio.charset.Charset)v18));
    Object v20 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v19));
    Object v21 = ((com.google.javascript.jscomp.AbstractCompiler)v20).getErrorManager();
    Object v22 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v20));
    Object v23 = 3;
    Object v24 = "K";
    Object v25 = 1;
    Object v26 = -1;
    Object v27 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v23).intValue()),((java.lang.String)v24),(((java.lang.Integer)v25).intValue()),(((java.lang.Integer)v26).intValue()));
    Object v28 = ((com.google.javascript.rhino.Node)v27).isFromExterns();
    Object v29 = ((com.google.javascript.jscomp.TypedScopeCreator)v22).createInitialScope(((com.google.javascript.rhino.Node)v27));
    Object v30 = ((com.google.javascript.jscomp.Scope)v29).getArgumentsVar();
    Object v31 = ((com.google.javascript.jscomp.TypedScopeCreator)v11).createScope(((com.google.javascript.rhino.Node)v16),((com.google.javascript.jscomp.Scope)v29));
    Object v32 = 3;
    Object v33 = "K";
    Object v34 = 1;
    Object v35 = -1;
    Object v36 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v32).intValue()),((java.lang.String)v33),(((java.lang.Integer)v34).intValue()),(((java.lang.Integer)v35).intValue()));
    Object v37 = false;
    ((com.google.javascript.rhino.Node)v36).setOptionalArg((((java.lang.Boolean)v37).booleanValue()));
    Object v38 = null;
    ((com.google.javascript.jscomp.TypedScopeCreator)v5).patchGlobalScope(((com.google.javascript.jscomp.Scope)v31),((com.google.javascript.rhino.Node)v36));
    Object v39 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = 3;
    Object v7 = "K";
    Object v8 = 1;
    Object v9 = -1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = "prototypL";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = ((com.google.javascript.jscomp.AbstractCompiler)v14).getErrorManager();
    Object v16 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v14));
    Object v17 = 3;
    Object v18 = "K";
    Object v19 = 1;
    Object v20 = -1;
    Object v21 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v17).intValue()),((java.lang.String)v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
    Object v22 = ((com.google.javascript.rhino.Node)v21).siblings();
    Object v23 = "prototypL";
    Object v24 = java.nio.charset.Charset.defaultCharset();
    Object v25 = new java.io.PrintStream(((java.lang.String)v23),((java.nio.charset.Charset)v24));
    Object v26 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v25));
    Object v27 = ((com.google.javascript.jscomp.AbstractCompiler)v26).getErrorManager();
    Object v28 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v26));
    Object v29 = 3;
    Object v30 = "K";
    Object v31 = 1;
    Object v32 = -1;
    Object v33 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v29).intValue()),((java.lang.String)v30),(((java.lang.Integer)v31).intValue()),(((java.lang.Integer)v32).intValue()));
    Object v34 = ((com.google.javascript.rhino.Node)v33).getStaticSourceFile();
    Object v35 = ((com.google.javascript.jscomp.TypedScopeCreator)v28).createInitialScope(((com.google.javascript.rhino.Node)v33));
    Object v36 = ((com.google.javascript.jscomp.TypedScopeCreator)v16).createScope(((com.google.javascript.rhino.Node)v21),((com.google.javascript.jscomp.Scope)v35));
    Object v37 = ((com.google.javascript.jscomp.Scope)v36).getAllSymbols();
    Object v38 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.Scope)v36));
    org.junit.Assert.assertNotNull(v38);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = 3;
    Object v7 = "K";
    Object v8 = 1;
    Object v9 = -1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = 3;
    ((com.google.javascript.rhino.Node)v10).setSourceEncodedPosition((((java.lang.Integer)v11).intValue()));
    Object v12 = null;
    Object v13 = "prototypL";
    Object v14 = java.nio.charset.Charset.defaultCharset();
    Object v15 = new java.io.PrintStream(((java.lang.String)v13),((java.nio.charset.Charset)v14));
    Object v16 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v15));
    Object v17 = ((com.google.javascript.jscomp.AbstractCompiler)v16).getErrorManager();
    Object v18 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v16));
    Object v19 = 3;
    Object v20 = "K";
    Object v21 = 1;
    Object v22 = -1;
    Object v23 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v19).intValue()),((java.lang.String)v20),(((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()));
    Object v24 = "prototypL";
    Object v25 = java.nio.charset.Charset.defaultCharset();
    Object v26 = new java.io.PrintStream(((java.lang.String)v24),((java.nio.charset.Charset)v25));
    Object v27 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v26));
    Object v28 = ((com.google.javascript.jscomp.AbstractCompiler)v27).getErrorManager();
    Object v29 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v27));
    Object v30 = 3;
    Object v31 = "K";
    Object v32 = 1;
    Object v33 = -1;
    Object v34 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v30).intValue()),((java.lang.String)v31),(((java.lang.Integer)v32).intValue()),(((java.lang.Integer)v33).intValue()));
    Object v35 = ((com.google.javascript.rhino.Node)v34).isFromExterns();
    Object v36 = ((com.google.javascript.jscomp.TypedScopeCreator)v29).createInitialScope(((com.google.javascript.rhino.Node)v34));
    Object v37 = ((com.google.javascript.jscomp.TypedScopeCreator)v18).createScope(((com.google.javascript.rhino.Node)v23),((com.google.javascript.jscomp.Scope)v36));
    Object v38 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.Scope)v37));
    org.junit.Assert.assertNotNull(v38);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = 3;
    Object v7 = "K";
    Object v8 = 1;
    Object v9 = -1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = "prototypL";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = ((com.google.javascript.jscomp.AbstractCompiler)v14).getErrorManager();
    Object v16 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v14));
    Object v17 = 3;
    Object v18 = "K";
    Object v19 = 1;
    Object v20 = -1;
    Object v21 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v17).intValue()),((java.lang.String)v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
    Object v22 = ((com.google.javascript.rhino.Node)v21).getSourceOffset();
    Object v23 = "prototypL";
    Object v24 = java.nio.charset.Charset.defaultCharset();
    Object v25 = new java.io.PrintStream(((java.lang.String)v23),((java.nio.charset.Charset)v24));
    Object v26 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v25));
    Object v27 = ((com.google.javascript.jscomp.AbstractCompiler)v26).getErrorManager();
    Object v28 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v26));
    Object v29 = 3;
    Object v30 = "K";
    Object v31 = 1;
    Object v32 = -1;
    Object v33 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v29).intValue()),((java.lang.String)v30),(((java.lang.Integer)v31).intValue()),(((java.lang.Integer)v32).intValue()));
    Object v34 = ((com.google.javascript.rhino.Node)v33).isFromExterns();
    Object v35 = ((com.google.javascript.jscomp.TypedScopeCreator)v28).createInitialScope(((com.google.javascript.rhino.Node)v33));
    Object v36 = ((com.google.javascript.jscomp.TypedScopeCreator)v16).createScope(((com.google.javascript.rhino.Node)v21),((com.google.javascript.jscomp.Scope)v35));
    Object v37 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.Scope)v36));
    org.junit.Assert.assertNotNull(v37);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = 3;
    Object v7 = "K";
    Object v8 = 1;
    Object v9 = -1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = 0;
    Object v12 = ((com.google.javascript.rhino.Node)v10).getIntProp((((java.lang.Integer)v11).intValue()));
    Object v13 = "prototypL";
    Object v14 = java.nio.charset.Charset.defaultCharset();
    Object v15 = new java.io.PrintStream(((java.lang.String)v13),((java.nio.charset.Charset)v14));
    Object v16 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v15));
    Object v17 = ((com.google.javascript.jscomp.AbstractCompiler)v16).getErrorManager();
    Object v18 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v16));
    Object v19 = 3;
    Object v20 = "K";
    Object v21 = 1;
    Object v22 = -1;
    Object v23 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v19).intValue()),((java.lang.String)v20),(((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()));
    Object v24 = ((com.google.javascript.rhino.Node)v23).isFromExterns();
    Object v25 = ((com.google.javascript.jscomp.TypedScopeCreator)v18).createInitialScope(((com.google.javascript.rhino.Node)v23));
    Object v26 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.Scope)v25));
    org.junit.Assert.assertNotNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v7 = "prototypL";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = new java.io.PrintStream(((java.lang.String)v7),((java.nio.charset.Charset)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = ((com.google.javascript.jscomp.AbstractCompiler)v10).getErrorManager();
    Object v12 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v13 = 3;
    Object v14 = "K";
    Object v15 = 1;
    Object v16 = -1;
    Object v17 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v13).intValue()),((java.lang.String)v14),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = ((com.google.javascript.rhino.Node)v17).isFromExterns();
    Object v19 = ((com.google.javascript.jscomp.TypedScopeCreator)v12).createInitialScope(((com.google.javascript.rhino.Node)v17));
    Object v20 = 3;
    Object v21 = "K";
    Object v22 = 1;
    Object v23 = -1;
    Object v24 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v20).intValue()),((java.lang.String)v21),(((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()));
    ((com.google.javascript.jscomp.TypedScopeCreator)v6).patchGlobalScope(((com.google.javascript.jscomp.Scope)v19),((com.google.javascript.rhino.Node)v24));
    Object v25 = null;
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
    Object v4 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v5 = ((com.google.javascript.jscomp.CodingConvention)v4).getDelegateSuperclassName();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v4));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v7 = 3;
    Object v8 = "K";
    Object v9 = 1;
    Object v10 = -1;
    Object v11 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = "prototypL";
    Object v13 = java.nio.charset.Charset.defaultCharset();
    Object v14 = new java.io.PrintStream(((java.lang.String)v12),((java.nio.charset.Charset)v13));
    Object v15 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v14));
    Object v16 = ((com.google.javascript.jscomp.AbstractCompiler)v15).getErrorManager();
    Object v17 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v15));
    Object v18 = 3;
    Object v19 = "K";
    Object v20 = 1;
    Object v21 = -1;
    Object v22 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v18).intValue()),((java.lang.String)v19),(((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()));
    Object v23 = ((com.google.javascript.jscomp.TypedScopeCreator)v17).createInitialScope(((com.google.javascript.rhino.Node)v22));
    Object v24 = "<h1>Name Referenc Graph Dump</h1>\n";
    Object v25 = ((com.google.javascript.jscomp.Scope)v23).getSlot(((java.lang.String)v24));
    Object v26 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v11),((com.google.javascript.jscomp.Scope)v23));
    org.junit.Assert.assertNotNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v7 = "prototypL";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = new java.io.PrintStream(((java.lang.String)v7),((java.nio.charset.Charset)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = ((com.google.javascript.jscomp.AbstractCompiler)v10).getErrorManager();
    Object v12 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v13 = 3;
    Object v14 = "K";
    Object v15 = 1;
    Object v16 = -1;
    Object v17 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v13).intValue()),((java.lang.String)v14),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = ((com.google.javascript.rhino.Node)v17).isFromExterns();
    Object v19 = ((com.google.javascript.jscomp.TypedScopeCreator)v12).createInitialScope(((com.google.javascript.rhino.Node)v17));
    Object v20 = ((com.google.javascript.jscomp.Scope)v19).getVars();
    Object v21 = 3;
    Object v22 = "K";
    Object v23 = 1;
    Object v24 = -1;
    Object v25 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v21).intValue()),((java.lang.String)v22),(((java.lang.Integer)v23).intValue()),(((java.lang.Integer)v24).intValue()));
    ((com.google.javascript.jscomp.TypedScopeCreator)v6).patchGlobalScope(((com.google.javascript.jscomp.Scope)v19),((com.google.javascript.rhino.Node)v25));
    Object v26 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v7 = 3;
    Object v8 = "K";
    Object v9 = 1;
    Object v10 = -1;
    Object v11 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = "prototypL";
    Object v13 = java.nio.charset.Charset.defaultCharset();
    Object v14 = new java.io.PrintStream(((java.lang.String)v12),((java.nio.charset.Charset)v13));
    Object v15 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v14));
    Object v16 = ((com.google.javascript.jscomp.AbstractCompiler)v15).getErrorManager();
    Object v17 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v15));
    Object v18 = 3;
    Object v19 = "K";
    Object v20 = 1;
    Object v21 = -1;
    Object v22 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v18).intValue()),((java.lang.String)v19),(((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()));
    Object v23 = ((com.google.javascript.rhino.Node)v22).getSourceOffset();
    Object v24 = "prototypL";
    Object v25 = java.nio.charset.Charset.defaultCharset();
    Object v26 = new java.io.PrintStream(((java.lang.String)v24),((java.nio.charset.Charset)v25));
    Object v27 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v26));
    Object v28 = ((com.google.javascript.jscomp.AbstractCompiler)v27).getErrorManager();
    Object v29 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v27));
    Object v30 = 3;
    Object v31 = "K";
    Object v32 = 1;
    Object v33 = -1;
    Object v34 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v30).intValue()),((java.lang.String)v31),(((java.lang.Integer)v32).intValue()),(((java.lang.Integer)v33).intValue()));
    Object v35 = ((com.google.javascript.rhino.Node)v34).isFromExterns();
    Object v36 = ((com.google.javascript.jscomp.TypedScopeCreator)v29).createInitialScope(((com.google.javascript.rhino.Node)v34));
    Object v37 = ((com.google.javascript.jscomp.TypedScopeCreator)v17).createScope(((com.google.javascript.rhino.Node)v22),((com.google.javascript.jscomp.Scope)v36));
    Object v38 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v11),((com.google.javascript.jscomp.Scope)v37));
    org.junit.Assert.assertNotNull(v38);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v5 = ((com.google.javascript.jscomp.CodingConvention)v4).getAssertionFunctions();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v4));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v7 = 3;
    Object v8 = "K";
    Object v9 = 1;
    Object v10 = -1;
    Object v11 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = "prototypL";
    Object v13 = java.nio.charset.Charset.defaultCharset();
    Object v14 = new java.io.PrintStream(((java.lang.String)v12),((java.nio.charset.Charset)v13));
    Object v15 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v14));
    Object v16 = ((com.google.javascript.jscomp.AbstractCompiler)v15).getErrorManager();
    Object v17 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v18 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v15),((com.google.javascript.jscomp.CodingConvention)v17));
    Object v19 = 3;
    Object v20 = "K";
    Object v21 = 1;
    Object v22 = -1;
    Object v23 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v19).intValue()),((java.lang.String)v20),(((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()));
    Object v24 = "prototypL";
    Object v25 = java.nio.charset.Charset.defaultCharset();
    Object v26 = new java.io.PrintStream(((java.lang.String)v24),((java.nio.charset.Charset)v25));
    Object v27 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v26));
    Object v28 = ((com.google.javascript.jscomp.AbstractCompiler)v27).getErrorManager();
    Object v29 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v27));
    Object v30 = 3;
    Object v31 = "K";
    Object v32 = 1;
    Object v33 = -1;
    Object v34 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v30).intValue()),((java.lang.String)v31),(((java.lang.Integer)v32).intValue()),(((java.lang.Integer)v33).intValue()));
    Object v35 = ((com.google.javascript.jscomp.TypedScopeCreator)v29).createInitialScope(((com.google.javascript.rhino.Node)v34));
    Object v36 = "<h1>Name Referenc Graph Dump</h1>\n";
    Object v37 = ((com.google.javascript.jscomp.Scope)v35).getSlot(((java.lang.String)v36));
    Object v38 = ((com.google.javascript.jscomp.TypedScopeCreator)v18).createScope(((com.google.javascript.rhino.Node)v23),((com.google.javascript.jscomp.Scope)v35));
    Object v39 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v11),((com.google.javascript.jscomp.Scope)v38));
    org.junit.Assert.assertNotNull(v39);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v7 = "prototypL";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = new java.io.PrintStream(((java.lang.String)v7),((java.nio.charset.Charset)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = ((com.google.javascript.jscomp.AbstractCompiler)v10).getErrorManager();
    Object v12 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v13 = 3;
    Object v14 = "K";
    Object v15 = 1;
    Object v16 = -1;
    Object v17 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v13).intValue()),((java.lang.String)v14),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = 0;
    Object v19 = ((com.google.javascript.rhino.Node)v17).getIntProp((((java.lang.Integer)v18).intValue()));
    Object v20 = "prototypL";
    Object v21 = java.nio.charset.Charset.defaultCharset();
    Object v22 = new java.io.PrintStream(((java.lang.String)v20),((java.nio.charset.Charset)v21));
    Object v23 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v22));
    Object v24 = ((com.google.javascript.jscomp.AbstractCompiler)v23).getErrorManager();
    Object v25 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v23));
    Object v26 = 3;
    Object v27 = "K";
    Object v28 = 1;
    Object v29 = -1;
    Object v30 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v26).intValue()),((java.lang.String)v27),(((java.lang.Integer)v28).intValue()),(((java.lang.Integer)v29).intValue()));
    Object v31 = ((com.google.javascript.rhino.Node)v30).isFromExterns();
    Object v32 = ((com.google.javascript.jscomp.TypedScopeCreator)v25).createInitialScope(((com.google.javascript.rhino.Node)v30));
    Object v33 = ((com.google.javascript.jscomp.TypedScopeCreator)v12).createScope(((com.google.javascript.rhino.Node)v17),((com.google.javascript.jscomp.Scope)v32));
    Object v34 = 3;
    Object v35 = "K";
    Object v36 = 1;
    Object v37 = -1;
    Object v38 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v34).intValue()),((java.lang.String)v35),(((java.lang.Integer)v36).intValue()),(((java.lang.Integer)v37).intValue()));
    ((com.google.javascript.jscomp.TypedScopeCreator)v6).patchGlobalScope(((com.google.javascript.jscomp.Scope)v33),((com.google.javascript.rhino.Node)v38));
    Object v39 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v7 = "prototypL";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = new java.io.PrintStream(((java.lang.String)v7),((java.nio.charset.Charset)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = ((com.google.javascript.jscomp.AbstractCompiler)v10).getErrorManager();
    Object v12 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v13 = 3;
    Object v14 = "K";
    Object v15 = 1;
    Object v16 = -1;
    Object v17 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v13).intValue()),((java.lang.String)v14),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = ((com.google.javascript.rhino.Node)v17).getStaticSourceFile();
    Object v19 = ((com.google.javascript.jscomp.TypedScopeCreator)v12).createInitialScope(((com.google.javascript.rhino.Node)v17));
    Object v20 = 3;
    Object v21 = "K";
    Object v22 = 1;
    Object v23 = -1;
    Object v24 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v20).intValue()),((java.lang.String)v21),(((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()));
    ((com.google.javascript.jscomp.TypedScopeCreator)v6).patchGlobalScope(((com.google.javascript.jscomp.Scope)v19),((com.google.javascript.rhino.Node)v24));
    Object v25 = null;
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
    Object v4 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v5 = 3;
    Object v6 = "K";
    Object v7 = 1;
    Object v8 = -1;
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v5).intValue()),((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = ((com.google.javascript.jscomp.CodingConvention)v4).isVarArgsParameter(((com.google.javascript.rhino.Node)v9));
    Object v11 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v4));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v7 = "prototypL";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = new java.io.PrintStream(((java.lang.String)v7),((java.nio.charset.Charset)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = ((com.google.javascript.jscomp.AbstractCompiler)v10).getErrorManager();
    Object v12 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v13 = 3;
    Object v14 = "K";
    Object v15 = 1;
    Object v16 = -1;
    Object v17 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v13).intValue()),((java.lang.String)v14),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = ((com.google.javascript.rhino.Node)v17).getSourceOffset();
    Object v19 = "prototypL";
    Object v20 = java.nio.charset.Charset.defaultCharset();
    Object v21 = new java.io.PrintStream(((java.lang.String)v19),((java.nio.charset.Charset)v20));
    Object v22 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v21));
    Object v23 = ((com.google.javascript.jscomp.AbstractCompiler)v22).getErrorManager();
    Object v24 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v22));
    Object v25 = 3;
    Object v26 = "K";
    Object v27 = 1;
    Object v28 = -1;
    Object v29 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v25).intValue()),((java.lang.String)v26),(((java.lang.Integer)v27).intValue()),(((java.lang.Integer)v28).intValue()));
    Object v30 = ((com.google.javascript.rhino.Node)v29).isFromExterns();
    Object v31 = ((com.google.javascript.jscomp.TypedScopeCreator)v24).createInitialScope(((com.google.javascript.rhino.Node)v29));
    Object v32 = ((com.google.javascript.jscomp.TypedScopeCreator)v12).createScope(((com.google.javascript.rhino.Node)v17),((com.google.javascript.jscomp.Scope)v31));
    Object v33 = ((com.google.javascript.jscomp.Scope)v32).getVarCount();
    Object v34 = 3;
    Object v35 = "K";
    Object v36 = 1;
    Object v37 = -1;
    Object v38 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v34).intValue()),((java.lang.String)v35),(((java.lang.Integer)v36).intValue()),(((java.lang.Integer)v37).intValue()));
    ((com.google.javascript.jscomp.TypedScopeCreator)v6).patchGlobalScope(((com.google.javascript.jscomp.Scope)v32),((com.google.javascript.rhino.Node)v38));
    Object v39 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v7 = "prototypL";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = new java.io.PrintStream(((java.lang.String)v7),((java.nio.charset.Charset)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = ((com.google.javascript.jscomp.AbstractCompiler)v10).getErrorManager();
    Object v12 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v13 = 3;
    Object v14 = "K";
    Object v15 = 1;
    Object v16 = -1;
    Object v17 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v13).intValue()),((java.lang.String)v14),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = "prototypL";
    Object v19 = java.nio.charset.Charset.defaultCharset();
    Object v20 = new java.io.PrintStream(((java.lang.String)v18),((java.nio.charset.Charset)v19));
    Object v21 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v20));
    Object v22 = ((com.google.javascript.jscomp.AbstractCompiler)v21).getErrorManager();
    Object v23 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v21));
    Object v24 = 3;
    Object v25 = "K";
    Object v26 = 1;
    Object v27 = -1;
    Object v28 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v24).intValue()),((java.lang.String)v25),(((java.lang.Integer)v26).intValue()),(((java.lang.Integer)v27).intValue()));
    Object v29 = ((com.google.javascript.rhino.Node)v28).isFromExterns();
    Object v30 = ((com.google.javascript.jscomp.TypedScopeCreator)v23).createInitialScope(((com.google.javascript.rhino.Node)v28));
    Object v31 = ((com.google.javascript.jscomp.TypedScopeCreator)v12).createScope(((com.google.javascript.rhino.Node)v17),((com.google.javascript.jscomp.Scope)v30));
    Object v32 = 3;
    Object v33 = "K";
    Object v34 = 1;
    Object v35 = -1;
    Object v36 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v32).intValue()),((java.lang.String)v33),(((java.lang.Integer)v34).intValue()),(((java.lang.Integer)v35).intValue()));
    ((com.google.javascript.jscomp.TypedScopeCreator)v6).patchGlobalScope(((com.google.javascript.jscomp.Scope)v31),((com.google.javascript.rhino.Node)v36));
    Object v37 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v7 = "prototypL";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = new java.io.PrintStream(((java.lang.String)v7),((java.nio.charset.Charset)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = ((com.google.javascript.jscomp.AbstractCompiler)v10).getErrorManager();
    Object v12 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v13 = 3;
    Object v14 = "K";
    Object v15 = 1;
    Object v16 = -1;
    Object v17 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v13).intValue()),((java.lang.String)v14),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = ((com.google.javascript.rhino.Node)v17).getSourceOffset();
    Object v19 = "prototypL";
    Object v20 = java.nio.charset.Charset.defaultCharset();
    Object v21 = new java.io.PrintStream(((java.lang.String)v19),((java.nio.charset.Charset)v20));
    Object v22 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v21));
    Object v23 = ((com.google.javascript.jscomp.AbstractCompiler)v22).getErrorManager();
    Object v24 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v22));
    Object v25 = 3;
    Object v26 = "K";
    Object v27 = 1;
    Object v28 = -1;
    Object v29 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v25).intValue()),((java.lang.String)v26),(((java.lang.Integer)v27).intValue()),(((java.lang.Integer)v28).intValue()));
    Object v30 = ((com.google.javascript.rhino.Node)v29).isFromExterns();
    Object v31 = ((com.google.javascript.jscomp.TypedScopeCreator)v24).createInitialScope(((com.google.javascript.rhino.Node)v29));
    Object v32 = ((com.google.javascript.jscomp.TypedScopeCreator)v12).createScope(((com.google.javascript.rhino.Node)v17),((com.google.javascript.jscomp.Scope)v31));
    Object v33 = 3;
    Object v34 = "K";
    Object v35 = 1;
    Object v36 = -1;
    Object v37 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v33).intValue()),((java.lang.String)v34),(((java.lang.Integer)v35).intValue()),(((java.lang.Integer)v36).intValue()));
    ((com.google.javascript.jscomp.TypedScopeCreator)v6).patchGlobalScope(((com.google.javascript.jscomp.Scope)v32),((com.google.javascript.rhino.Node)v37));
    Object v38 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v7 = 3;
    Object v8 = "K";
    Object v9 = 1;
    Object v10 = -1;
    Object v11 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = "prototypL";
    Object v13 = java.nio.charset.Charset.defaultCharset();
    Object v14 = new java.io.PrintStream(((java.lang.String)v12),((java.nio.charset.Charset)v13));
    Object v15 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v14));
    Object v16 = ((com.google.javascript.jscomp.AbstractCompiler)v15).getErrorManager();
    Object v17 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v15));
    Object v18 = 3;
    Object v19 = "K";
    Object v20 = 1;
    Object v21 = -1;
    Object v22 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v18).intValue()),((java.lang.String)v19),(((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()));
    Object v23 = 0;
    Object v24 = ((com.google.javascript.rhino.Node)v22).getIntProp((((java.lang.Integer)v23).intValue()));
    Object v25 = "prototypL";
    Object v26 = java.nio.charset.Charset.defaultCharset();
    Object v27 = new java.io.PrintStream(((java.lang.String)v25),((java.nio.charset.Charset)v26));
    Object v28 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v27));
    Object v29 = ((com.google.javascript.jscomp.AbstractCompiler)v28).getErrorManager();
    Object v30 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v28));
    Object v31 = 3;
    Object v32 = "K";
    Object v33 = 1;
    Object v34 = -1;
    Object v35 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v31).intValue()),((java.lang.String)v32),(((java.lang.Integer)v33).intValue()),(((java.lang.Integer)v34).intValue()));
    Object v36 = ((com.google.javascript.rhino.Node)v35).isFromExterns();
    Object v37 = ((com.google.javascript.jscomp.TypedScopeCreator)v30).createInitialScope(((com.google.javascript.rhino.Node)v35));
    Object v38 = ((com.google.javascript.jscomp.TypedScopeCreator)v17).createScope(((com.google.javascript.rhino.Node)v22),((com.google.javascript.jscomp.Scope)v37));
    Object v39 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v11),((com.google.javascript.jscomp.Scope)v38));
    org.junit.Assert.assertNotNull(v39);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v7 = "prototypL";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = new java.io.PrintStream(((java.lang.String)v7),((java.nio.charset.Charset)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = ((com.google.javascript.jscomp.AbstractCompiler)v10).getErrorManager();
    Object v12 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v13 = 3;
    Object v14 = "K";
    Object v15 = 1;
    Object v16 = -1;
    Object v17 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v13).intValue()),((java.lang.String)v14),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = "prototypL";
    Object v19 = java.nio.charset.Charset.defaultCharset();
    Object v20 = new java.io.PrintStream(((java.lang.String)v18),((java.nio.charset.Charset)v19));
    Object v21 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v20));
    Object v22 = ((com.google.javascript.jscomp.AbstractCompiler)v21).getErrorManager();
    Object v23 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v21));
    Object v24 = 3;
    Object v25 = "K";
    Object v26 = 1;
    Object v27 = -1;
    Object v28 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v24).intValue()),((java.lang.String)v25),(((java.lang.Integer)v26).intValue()),(((java.lang.Integer)v27).intValue()));
    Object v29 = ((com.google.javascript.rhino.Node)v28).isFromExterns();
    Object v30 = ((com.google.javascript.jscomp.TypedScopeCreator)v23).createInitialScope(((com.google.javascript.rhino.Node)v28));
    Object v31 = ((com.google.javascript.jscomp.TypedScopeCreator)v12).createScope(((com.google.javascript.rhino.Node)v17),((com.google.javascript.jscomp.Scope)v30));
    Object v32 = ((com.google.javascript.jscomp.Scope)v31).getVars();
    Object v33 = 3;
    Object v34 = "K";
    Object v35 = 1;
    Object v36 = -1;
    Object v37 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v33).intValue()),((java.lang.String)v34),(((java.lang.Integer)v35).intValue()),(((java.lang.Integer)v36).intValue()));
    ((com.google.javascript.jscomp.TypedScopeCreator)v6).patchGlobalScope(((com.google.javascript.jscomp.Scope)v31),((com.google.javascript.rhino.Node)v37));
    Object v38 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v7 = "prototypL";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = new java.io.PrintStream(((java.lang.String)v7),((java.nio.charset.Charset)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = ((com.google.javascript.jscomp.AbstractCompiler)v10).getErrorManager();
    Object v12 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v13 = 3;
    Object v14 = "K";
    Object v15 = 1;
    Object v16 = -1;
    Object v17 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v13).intValue()),((java.lang.String)v14),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = ((com.google.javascript.rhino.Node)v17).getSourceOffset();
    Object v19 = "prototypL";
    Object v20 = java.nio.charset.Charset.defaultCharset();
    Object v21 = new java.io.PrintStream(((java.lang.String)v19),((java.nio.charset.Charset)v20));
    Object v22 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v21));
    Object v23 = ((com.google.javascript.jscomp.AbstractCompiler)v22).getErrorManager();
    Object v24 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v22));
    Object v25 = 3;
    Object v26 = "K";
    Object v27 = 1;
    Object v28 = -1;
    Object v29 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v25).intValue()),((java.lang.String)v26),(((java.lang.Integer)v27).intValue()),(((java.lang.Integer)v28).intValue()));
    Object v30 = ((com.google.javascript.rhino.Node)v29).isFromExterns();
    Object v31 = ((com.google.javascript.jscomp.TypedScopeCreator)v24).createInitialScope(((com.google.javascript.rhino.Node)v29));
    Object v32 = ((com.google.javascript.jscomp.TypedScopeCreator)v12).createScope(((com.google.javascript.rhino.Node)v17),((com.google.javascript.jscomp.Scope)v31));
    Object v33 = ((com.google.javascript.jscomp.Scope)v32).getDeclarativelyUnboundVarsWithoutTypes();
    Object v34 = 3;
    Object v35 = "K";
    Object v36 = 1;
    Object v37 = -1;
    Object v38 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v34).intValue()),((java.lang.String)v35),(((java.lang.Integer)v36).intValue()),(((java.lang.Integer)v37).intValue()));
    ((com.google.javascript.jscomp.TypedScopeCreator)v6).patchGlobalScope(((com.google.javascript.jscomp.Scope)v32),((com.google.javascript.rhino.Node)v38));
    Object v39 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
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
  public void test90() throws Throwable {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v7 = 3;
    Object v8 = "K";
    Object v9 = 1;
    Object v10 = -1;
    Object v11 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = "prototypL";
    Object v13 = java.nio.charset.Charset.defaultCharset();
    Object v14 = new java.io.PrintStream(((java.lang.String)v12),((java.nio.charset.Charset)v13));
    Object v15 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v14));
    Object v16 = ((com.google.javascript.jscomp.AbstractCompiler)v15).getErrorManager();
    Object v17 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v15));
    Object v18 = 3;
    Object v19 = "K";
    Object v20 = 1;
    Object v21 = -1;
    Object v22 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v18).intValue()),((java.lang.String)v19),(((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()));
    Object v23 = ((com.google.javascript.jscomp.TypedScopeCreator)v17).createInitialScope(((com.google.javascript.rhino.Node)v22));
    Object v24 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v11),((com.google.javascript.jscomp.Scope)v23));
    org.junit.Assert.assertNotNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "";
    Object v5 = 0;
    Object v6 = ((com.google.javascript.jscomp.SourceExcerptProvider)v3).getSourceRegion(((java.lang.String)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v8 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v7));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v7 = "prototypL";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = new java.io.PrintStream(((java.lang.String)v7),((java.nio.charset.Charset)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = ((com.google.javascript.jscomp.AbstractCompiler)v10).getErrorManager();
    Object v12 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v13 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.CodingConvention)v12));
    Object v14 = 3;
    Object v15 = "K";
    Object v16 = 1;
    Object v17 = -1;
    Object v18 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v14).intValue()),((java.lang.String)v15),(((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()));
    Object v19 = "prototypL";
    Object v20 = java.nio.charset.Charset.defaultCharset();
    Object v21 = new java.io.PrintStream(((java.lang.String)v19),((java.nio.charset.Charset)v20));
    Object v22 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v21));
    Object v23 = ((com.google.javascript.jscomp.AbstractCompiler)v22).getErrorManager();
    Object v24 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v22));
    Object v25 = 3;
    Object v26 = "K";
    Object v27 = 1;
    Object v28 = -1;
    Object v29 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v25).intValue()),((java.lang.String)v26),(((java.lang.Integer)v27).intValue()),(((java.lang.Integer)v28).intValue()));
    Object v30 = ((com.google.javascript.jscomp.TypedScopeCreator)v24).createInitialScope(((com.google.javascript.rhino.Node)v29));
    Object v31 = ((com.google.javascript.jscomp.TypedScopeCreator)v13).createScope(((com.google.javascript.rhino.Node)v18),((com.google.javascript.jscomp.Scope)v30));
    Object v32 = 3;
    Object v33 = "K";
    Object v34 = 1;
    Object v35 = -1;
    Object v36 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v32).intValue()),((java.lang.String)v33),(((java.lang.Integer)v34).intValue()),(((java.lang.Integer)v35).intValue()));
    ((com.google.javascript.jscomp.TypedScopeCreator)v6).patchGlobalScope(((com.google.javascript.jscomp.Scope)v31),((com.google.javascript.rhino.Node)v36));
    Object v37 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v7 = "prototypL";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = new java.io.PrintStream(((java.lang.String)v7),((java.nio.charset.Charset)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = ((com.google.javascript.jscomp.AbstractCompiler)v10).getErrorManager();
    Object v12 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v13 = 3;
    Object v14 = "K";
    Object v15 = 1;
    Object v16 = -1;
    Object v17 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v13).intValue()),((java.lang.String)v14),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = ((com.google.javascript.jscomp.TypedScopeCreator)v12).createInitialScope(((com.google.javascript.rhino.Node)v17));
    Object v19 = 3;
    Object v20 = "K";
    Object v21 = 1;
    Object v22 = -1;
    Object v23 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v19).intValue()),((java.lang.String)v20),(((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()));
    ((com.google.javascript.jscomp.TypedScopeCreator)v6).patchGlobalScope(((com.google.javascript.jscomp.Scope)v18),((com.google.javascript.rhino.Node)v23));
    Object v24 = null;
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
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v7 = 3;
    Object v8 = "K";
    Object v9 = 1;
    Object v10 = -1;
    Object v11 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = "prototypL";
    Object v13 = java.nio.charset.Charset.defaultCharset();
    Object v14 = new java.io.PrintStream(((java.lang.String)v12),((java.nio.charset.Charset)v13));
    Object v15 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v14));
    Object v16 = ((com.google.javascript.jscomp.AbstractCompiler)v15).getErrorManager();
    Object v17 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v15));
    Object v18 = 3;
    Object v19 = "K";
    Object v20 = 1;
    Object v21 = -1;
    Object v22 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v18).intValue()),((java.lang.String)v19),(((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()));
    Object v23 = "prototypL";
    Object v24 = java.nio.charset.Charset.defaultCharset();
    Object v25 = new java.io.PrintStream(((java.lang.String)v23),((java.nio.charset.Charset)v24));
    Object v26 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v25));
    Object v27 = ((com.google.javascript.jscomp.AbstractCompiler)v26).getErrorManager();
    Object v28 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v26));
    Object v29 = 3;
    Object v30 = "K";
    Object v31 = 1;
    Object v32 = -1;
    Object v33 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v29).intValue()),((java.lang.String)v30),(((java.lang.Integer)v31).intValue()),(((java.lang.Integer)v32).intValue()));
    Object v34 = ((com.google.javascript.rhino.Node)v33).getStaticSourceFile();
    Object v35 = ((com.google.javascript.jscomp.TypedScopeCreator)v28).createInitialScope(((com.google.javascript.rhino.Node)v33));
    Object v36 = ((com.google.javascript.jscomp.TypedScopeCreator)v17).createScope(((com.google.javascript.rhino.Node)v22),((com.google.javascript.jscomp.Scope)v35));
    Object v37 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v11),((com.google.javascript.jscomp.Scope)v36));
    org.junit.Assert.assertNotNull(v37);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v7 = "prototypL";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = new java.io.PrintStream(((java.lang.String)v7),((java.nio.charset.Charset)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = ((com.google.javascript.jscomp.AbstractCompiler)v10).getErrorManager();
    Object v12 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v13 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v10),((com.google.javascript.jscomp.CodingConvention)v12));
    Object v14 = 3;
    Object v15 = "K";
    Object v16 = 1;
    Object v17 = -1;
    Object v18 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v14).intValue()),((java.lang.String)v15),(((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()));
    Object v19 = "prototypL";
    Object v20 = java.nio.charset.Charset.defaultCharset();
    Object v21 = new java.io.PrintStream(((java.lang.String)v19),((java.nio.charset.Charset)v20));
    Object v22 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v21));
    Object v23 = ((com.google.javascript.jscomp.AbstractCompiler)v22).getErrorManager();
    Object v24 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v22));
    Object v25 = 3;
    Object v26 = "K";
    Object v27 = 1;
    Object v28 = -1;
    Object v29 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v25).intValue()),((java.lang.String)v26),(((java.lang.Integer)v27).intValue()),(((java.lang.Integer)v28).intValue()));
    Object v30 = ((com.google.javascript.jscomp.TypedScopeCreator)v24).createInitialScope(((com.google.javascript.rhino.Node)v29));
    Object v31 = ((com.google.javascript.jscomp.TypedScopeCreator)v13).createScope(((com.google.javascript.rhino.Node)v18),((com.google.javascript.jscomp.Scope)v30));
    Object v32 = ((com.google.javascript.jscomp.Scope)v31).getArgumentsVar();
    Object v33 = 3;
    Object v34 = "K";
    Object v35 = 1;
    Object v36 = -1;
    Object v37 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v33).intValue()),((java.lang.String)v34),(((java.lang.Integer)v35).intValue()),(((java.lang.Integer)v36).intValue()));
    ((com.google.javascript.jscomp.TypedScopeCreator)v6).patchGlobalScope(((com.google.javascript.jscomp.Scope)v31),((com.google.javascript.rhino.Node)v37));
    Object v38 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v7 = 3;
    Object v8 = "K";
    Object v9 = 1;
    Object v10 = -1;
    Object v11 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = "prototypL";
    Object v13 = java.nio.charset.Charset.defaultCharset();
    Object v14 = new java.io.PrintStream(((java.lang.String)v12),((java.nio.charset.Charset)v13));
    Object v15 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v14));
    Object v16 = ((com.google.javascript.jscomp.AbstractCompiler)v15).getErrorManager();
    Object v17 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v15));
    Object v18 = 3;
    Object v19 = "K";
    Object v20 = 1;
    Object v21 = -1;
    Object v22 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v18).intValue()),((java.lang.String)v19),(((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()));
    Object v23 = ((com.google.javascript.rhino.Node)v22).isFromExterns();
    Object v24 = ((com.google.javascript.jscomp.TypedScopeCreator)v17).createInitialScope(((com.google.javascript.rhino.Node)v22));
    Object v25 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v11),((com.google.javascript.jscomp.Scope)v24));
    org.junit.Assert.assertNotNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v7 = 3;
    Object v8 = "K";
    Object v9 = 1;
    Object v10 = -1;
    Object v11 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = "prototypL";
    Object v13 = java.nio.charset.Charset.defaultCharset();
    Object v14 = new java.io.PrintStream(((java.lang.String)v12),((java.nio.charset.Charset)v13));
    Object v15 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v14));
    Object v16 = ((com.google.javascript.jscomp.AbstractCompiler)v15).getErrorManager();
    Object v17 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v15));
    Object v18 = 3;
    Object v19 = "K";
    Object v20 = 1;
    Object v21 = -1;
    Object v22 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v18).intValue()),((java.lang.String)v19),(((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()));
    Object v23 = "prototypL";
    Object v24 = java.nio.charset.Charset.defaultCharset();
    Object v25 = new java.io.PrintStream(((java.lang.String)v23),((java.nio.charset.Charset)v24));
    Object v26 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v25));
    Object v27 = ((com.google.javascript.jscomp.AbstractCompiler)v26).getErrorManager();
    Object v28 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v26));
    Object v29 = 3;
    Object v30 = "K";
    Object v31 = 1;
    Object v32 = -1;
    Object v33 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v29).intValue()),((java.lang.String)v30),(((java.lang.Integer)v31).intValue()),(((java.lang.Integer)v32).intValue()));
    Object v34 = ((com.google.javascript.jscomp.TypedScopeCreator)v28).createInitialScope(((com.google.javascript.rhino.Node)v33));
    Object v35 = ((com.google.javascript.jscomp.TypedScopeCreator)v17).createScope(((com.google.javascript.rhino.Node)v22),((com.google.javascript.jscomp.Scope)v34));
    Object v36 = "n";
    Object v37 = ((com.google.javascript.jscomp.Scope)v35).getSlot(((java.lang.String)v36));
    Object v38 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v11),((com.google.javascript.jscomp.Scope)v35));
    org.junit.Assert.assertNotNull(v38);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = "prototypL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v7 = "prototypL";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = new java.io.PrintStream(((java.lang.String)v7),((java.nio.charset.Charset)v8));
    Object v10 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v9));
    Object v11 = ((com.google.javascript.jscomp.AbstractCompiler)v10).getErrorManager();
    Object v12 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v10));
    Object v13 = 3;
    Object v14 = "K";
    Object v15 = 1;
    Object v16 = -1;
    Object v17 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v13).intValue()),((java.lang.String)v14),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = ((com.google.javascript.rhino.Node)v17).siblings();
    Object v19 = "prototypL";
    Object v20 = java.nio.charset.Charset.defaultCharset();
    Object v21 = new java.io.PrintStream(((java.lang.String)v19),((java.nio.charset.Charset)v20));
    Object v22 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v21));
    Object v23 = ((com.google.javascript.jscomp.AbstractCompiler)v22).getErrorManager();
    Object v24 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v22));
    Object v25 = 3;
    Object v26 = "K";
    Object v27 = 1;
    Object v28 = -1;
    Object v29 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v25).intValue()),((java.lang.String)v26),(((java.lang.Integer)v27).intValue()),(((java.lang.Integer)v28).intValue()));
    Object v30 = ((com.google.javascript.rhino.Node)v29).getStaticSourceFile();
    Object v31 = ((com.google.javascript.jscomp.TypedScopeCreator)v24).createInitialScope(((com.google.javascript.rhino.Node)v29));
    Object v32 = ((com.google.javascript.jscomp.TypedScopeCreator)v12).createScope(((com.google.javascript.rhino.Node)v17),((com.google.javascript.jscomp.Scope)v31));
    Object v33 = 3;
    Object v34 = "K";
    Object v35 = 1;
    Object v36 = -1;
    Object v37 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v33).intValue()),((java.lang.String)v34),(((java.lang.Integer)v35).intValue()),(((java.lang.Integer)v36).intValue()));
    ((com.google.javascript.jscomp.TypedScopeCreator)v6).patchGlobalScope(((com.google.javascript.jscomp.Scope)v32),((com.google.javascript.rhino.Node)v37));
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
    Object v6 = "prototypL";
    Object v7 = java.nio.charset.Charset.defaultCharset();
    Object v8 = new java.io.PrintStream(((java.lang.String)v6),((java.nio.charset.Charset)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v8));
    Object v10 = ((com.google.javascript.jscomp.AbstractCompiler)v9).getErrorManager();
    Object v11 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v12 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.CodingConvention)v11));
    Object v13 = 3;
    Object v14 = "K";
    Object v15 = 1;
    Object v16 = -1;
    Object v17 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v13).intValue()),((java.lang.String)v14),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = "prototypL";
    Object v19 = java.nio.charset.Charset.defaultCharset();
    Object v20 = new java.io.PrintStream(((java.lang.String)v18),((java.nio.charset.Charset)v19));
    Object v21 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v20));
    Object v22 = ((com.google.javascript.jscomp.AbstractCompiler)v21).getErrorManager();
    Object v23 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v21));
    Object v24 = 3;
    Object v25 = "K";
    Object v26 = 1;
    Object v27 = -1;
    Object v28 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v24).intValue()),((java.lang.String)v25),(((java.lang.Integer)v26).intValue()),(((java.lang.Integer)v27).intValue()));
    Object v29 = ((com.google.javascript.jscomp.TypedScopeCreator)v23).createInitialScope(((com.google.javascript.rhino.Node)v28));
    Object v30 = ((com.google.javascript.jscomp.TypedScopeCreator)v12).createScope(((com.google.javascript.rhino.Node)v17),((com.google.javascript.jscomp.Scope)v29));
    Object v31 = 3;
    Object v32 = "K";
    Object v33 = 1;
    Object v34 = -1;
    Object v35 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v31).intValue()),((java.lang.String)v32),(((java.lang.Integer)v33).intValue()),(((java.lang.Integer)v34).intValue()));
    Object v36 = ((com.google.javascript.rhino.Node)v35).removeChildren();
    ((com.google.javascript.jscomp.TypedScopeCreator)v5).patchGlobalScope(((com.google.javascript.jscomp.Scope)v30),((com.google.javascript.rhino.Node)v35));
    Object v37 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }
}
