package com.google.javascript.jscomp;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    ((com.google.javascript.jscomp.AbstractCompiler)v3).reportCodeChange();
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = 1.0D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    Object v8 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createInitialScope(((com.google.javascript.rhino.Node)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = 1.0D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    Object v8 = "L";
    Object v9 = java.nio.charset.Charset.defaultCharset();
    Object v10 = new java.io.PrintStream(((java.lang.String)v8),((java.nio.charset.Charset)v9));
    Object v11 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v10));
    Object v12 = ((com.google.javascript.jscomp.AbstractCompiler)v11).getErrorManager();
    Object v13 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v11));
    Object v14 = 1.0D;
    Object v15 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v14).doubleValue()));
    Object v16 = ((com.google.javascript.jscomp.TypedScopeCreator)v13).createInitialScope(((com.google.javascript.rhino.Node)v15));
    Object v17 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.Scope)v16));
    Object v18 = 1.0D;
    Object v19 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v18).doubleValue()));
    Object v20 = "L";
    Object v21 = java.nio.charset.Charset.defaultCharset();
    Object v22 = new java.io.PrintStream(((java.lang.String)v20),((java.nio.charset.Charset)v21));
    Object v23 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v22));
    Object v24 = ((com.google.javascript.jscomp.AbstractCompiler)v23).getErrorManager();
    Object v25 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v23));
    Object v26 = 1.0D;
    Object v27 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v26).doubleValue()));
    Object v28 = ((com.google.javascript.jscomp.TypedScopeCreator)v25).createInitialScope(((com.google.javascript.rhino.Node)v27));
    Object v29 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v19),((com.google.javascript.jscomp.Scope)v28));
    org.junit.Assert.assertNotNull(v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = 1.0D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    Object v8 = "L";
    Object v9 = java.nio.charset.Charset.defaultCharset();
    Object v10 = new java.io.PrintStream(((java.lang.String)v8),((java.nio.charset.Charset)v9));
    Object v11 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v10));
    Object v12 = ((com.google.javascript.jscomp.AbstractCompiler)v11).getErrorManager();
    Object v13 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v11));
    Object v14 = 1.0D;
    Object v15 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v14).doubleValue()));
    Object v16 = "L";
    Object v17 = java.nio.charset.Charset.defaultCharset();
    Object v18 = new java.io.PrintStream(((java.lang.String)v16),((java.nio.charset.Charset)v17));
    Object v19 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v18));
    Object v20 = ((com.google.javascript.jscomp.AbstractCompiler)v19).getErrorManager();
    Object v21 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v19));
    Object v22 = 1.0D;
    Object v23 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v22).doubleValue()));
    Object v24 = ((com.google.javascript.jscomp.TypedScopeCreator)v21).createInitialScope(((com.google.javascript.rhino.Node)v23));
    Object v25 = ((com.google.javascript.jscomp.TypedScopeCreator)v13).createScope(((com.google.javascript.rhino.Node)v15),((com.google.javascript.jscomp.Scope)v24));
    Object v26 = 1.0D;
    Object v27 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v26).doubleValue()));
    Object v28 = "L";
    Object v29 = java.nio.charset.Charset.defaultCharset();
    Object v30 = new java.io.PrintStream(((java.lang.String)v28),((java.nio.charset.Charset)v29));
    Object v31 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v30));
    Object v32 = ((com.google.javascript.jscomp.AbstractCompiler)v31).getErrorManager();
    Object v33 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v31));
    Object v34 = 1.0D;
    Object v35 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v34).doubleValue()));
    Object v36 = ((com.google.javascript.jscomp.TypedScopeCreator)v33).createInitialScope(((com.google.javascript.rhino.Node)v35));
    Object v37 = ((com.google.javascript.jscomp.TypedScopeCreator)v13).createScope(((com.google.javascript.rhino.Node)v27),((com.google.javascript.jscomp.Scope)v36));
    Object v38 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.Scope)v37));
    org.junit.Assert.assertNotNull(v38);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = 1.0D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    Object v8 = "L";
    Object v9 = java.nio.charset.Charset.defaultCharset();
    Object v10 = new java.io.PrintStream(((java.lang.String)v8),((java.nio.charset.Charset)v9));
    Object v11 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v10));
    Object v12 = ((com.google.javascript.jscomp.AbstractCompiler)v11).getErrorManager();
    Object v13 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v11));
    Object v14 = 1.0D;
    Object v15 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v14).doubleValue()));
    Object v16 = ((com.google.javascript.jscomp.TypedScopeCreator)v13).createInitialScope(((com.google.javascript.rhino.Node)v15));
    Object v17 = "protot6pe";
    Object v18 = ((com.google.javascript.jscomp.Scope)v16).getOwnSlot(((java.lang.String)v17));
    Object v19 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.Scope)v16));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = 1.0D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    Object v8 = "L";
    Object v9 = java.nio.charset.Charset.defaultCharset();
    Object v10 = new java.io.PrintStream(((java.lang.String)v8),((java.nio.charset.Charset)v9));
    Object v11 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v10));
    Object v12 = ((com.google.javascript.jscomp.AbstractCompiler)v11).getErrorManager();
    Object v13 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v11));
    Object v14 = 1.0D;
    Object v15 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v14).doubleValue()));
    Object v16 = "L";
    Object v17 = java.nio.charset.Charset.defaultCharset();
    Object v18 = new java.io.PrintStream(((java.lang.String)v16),((java.nio.charset.Charset)v17));
    Object v19 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v18));
    Object v20 = ((com.google.javascript.jscomp.AbstractCompiler)v19).getErrorManager();
    Object v21 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v19));
    Object v22 = 1.0D;
    Object v23 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v22).doubleValue()));
    Object v24 = ((com.google.javascript.jscomp.TypedScopeCreator)v21).createInitialScope(((com.google.javascript.rhino.Node)v23));
    Object v25 = "protot6pe";
    Object v26 = ((com.google.javascript.jscomp.Scope)v24).getOwnSlot(((java.lang.String)v25));
    Object v27 = ((com.google.javascript.jscomp.TypedScopeCreator)v13).createScope(((com.google.javascript.rhino.Node)v15),((com.google.javascript.jscomp.Scope)v24));
    Object v28 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.Scope)v27));
    org.junit.Assert.assertNotNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v5 = ".prototype";
    Object v6 = ((com.google.javascript.jscomp.CodingConvention)v4).isPrivate(((java.lang.String)v5));
    Object v7 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v4));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v5 = ((com.google.javascript.jscomp.CodingConvention)v4).getExportPropertyFunction();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v4));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = 1.0D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    Object v8 = "L";
    Object v9 = java.nio.charset.Charset.defaultCharset();
    Object v10 = new java.io.PrintStream(((java.lang.String)v8),((java.nio.charset.Charset)v9));
    Object v11 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v10));
    Object v12 = ((com.google.javascript.jscomp.AbstractCompiler)v11).getErrorManager();
    Object v13 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v11));
    Object v14 = 1.0D;
    Object v15 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v14).doubleValue()));
    Object v16 = "L";
    Object v17 = java.nio.charset.Charset.defaultCharset();
    Object v18 = new java.io.PrintStream(((java.lang.String)v16),((java.nio.charset.Charset)v17));
    Object v19 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v18));
    Object v20 = ((com.google.javascript.jscomp.AbstractCompiler)v19).getErrorManager();
    Object v21 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v19));
    Object v22 = 1.0D;
    Object v23 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v22).doubleValue()));
    Object v24 = ((com.google.javascript.jscomp.TypedScopeCreator)v21).createInitialScope(((com.google.javascript.rhino.Node)v23));
    Object v25 = "protot6pe";
    Object v26 = ((com.google.javascript.jscomp.Scope)v24).getOwnSlot(((java.lang.String)v25));
    Object v27 = ((com.google.javascript.jscomp.TypedScopeCreator)v13).createScope(((com.google.javascript.rhino.Node)v15),((com.google.javascript.jscomp.Scope)v24));
    Object v28 = "l";
    Object v29 = ((com.google.javascript.jscomp.Scope)v27).getSlot(((java.lang.String)v28));
    Object v30 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.Scope)v27));
    org.junit.Assert.assertNotNull(v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = 1.0D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    Object v8 = 1.0D;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()));
    Object v10 = ((com.google.javascript.rhino.Node)v7).clonePropsFrom(((com.google.javascript.rhino.Node)v9));
    Object v11 = "L";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = ((com.google.javascript.jscomp.AbstractCompiler)v14).getErrorManager();
    Object v16 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v14));
    Object v17 = 1.0D;
    Object v18 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v17).doubleValue()));
    Object v19 = "L";
    Object v20 = java.nio.charset.Charset.defaultCharset();
    Object v21 = new java.io.PrintStream(((java.lang.String)v19),((java.nio.charset.Charset)v20));
    Object v22 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v21));
    Object v23 = ((com.google.javascript.jscomp.AbstractCompiler)v22).getErrorManager();
    Object v24 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v22));
    Object v25 = 1.0D;
    Object v26 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v25).doubleValue()));
    Object v27 = ((com.google.javascript.jscomp.TypedScopeCreator)v24).createInitialScope(((com.google.javascript.rhino.Node)v26));
    Object v28 = "protot6pe";
    Object v29 = ((com.google.javascript.jscomp.Scope)v27).getOwnSlot(((java.lang.String)v28));
    Object v30 = ((com.google.javascript.jscomp.TypedScopeCreator)v16).createScope(((com.google.javascript.rhino.Node)v18),((com.google.javascript.jscomp.Scope)v27));
    Object v31 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.Scope)v30));
    org.junit.Assert.assertNotNull(v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = 1.0D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    Object v8 = "L";
    Object v9 = java.nio.charset.Charset.defaultCharset();
    Object v10 = new java.io.PrintStream(((java.lang.String)v8),((java.nio.charset.Charset)v9));
    Object v11 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v10));
    Object v12 = ((com.google.javascript.jscomp.AbstractCompiler)v11).getErrorManager();
    Object v13 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v11));
    Object v14 = 1.0D;
    Object v15 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v14).doubleValue()));
    Object v16 = "L";
    Object v17 = java.nio.charset.Charset.defaultCharset();
    Object v18 = new java.io.PrintStream(((java.lang.String)v16),((java.nio.charset.Charset)v17));
    Object v19 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v18));
    Object v20 = ((com.google.javascript.jscomp.AbstractCompiler)v19).getErrorManager();
    Object v21 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v19));
    Object v22 = 1.0D;
    Object v23 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v22).doubleValue()));
    Object v24 = ((com.google.javascript.jscomp.TypedScopeCreator)v21).createInitialScope(((com.google.javascript.rhino.Node)v23));
    Object v25 = "protot6pe";
    Object v26 = ((com.google.javascript.jscomp.Scope)v24).getOwnSlot(((java.lang.String)v25));
    Object v27 = ((com.google.javascript.jscomp.TypedScopeCreator)v13).createScope(((com.google.javascript.rhino.Node)v15),((com.google.javascript.jscomp.Scope)v24));
    Object v28 = ((com.google.javascript.jscomp.Scope)v27).getVarCount();
    Object v29 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.Scope)v27));
    org.junit.Assert.assertNotNull(v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = 1.0D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    Object v8 = "L";
    Object v9 = java.nio.charset.Charset.defaultCharset();
    Object v10 = new java.io.PrintStream(((java.lang.String)v8),((java.nio.charset.Charset)v9));
    Object v11 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v10));
    Object v12 = ((com.google.javascript.jscomp.AbstractCompiler)v11).getErrorManager();
    Object v13 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v11));
    Object v14 = 1.0D;
    Object v15 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v14).doubleValue()));
    Object v16 = ((com.google.javascript.jscomp.TypedScopeCreator)v13).createInitialScope(((com.google.javascript.rhino.Node)v15));
    Object v17 = ((com.google.javascript.jscomp.Scope)v16).getVars();
    Object v18 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.Scope)v16));
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = 1.0D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    Object v8 = "L";
    Object v9 = java.nio.charset.Charset.defaultCharset();
    Object v10 = new java.io.PrintStream(((java.lang.String)v8),((java.nio.charset.Charset)v9));
    Object v11 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v10));
    Object v12 = ((com.google.javascript.jscomp.AbstractCompiler)v11).getErrorManager();
    Object v13 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v11));
    Object v14 = 1.0D;
    Object v15 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v14).doubleValue()));
    Object v16 = "L";
    Object v17 = java.nio.charset.Charset.defaultCharset();
    Object v18 = new java.io.PrintStream(((java.lang.String)v16),((java.nio.charset.Charset)v17));
    Object v19 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v18));
    Object v20 = ((com.google.javascript.jscomp.AbstractCompiler)v19).getErrorManager();
    Object v21 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v19));
    Object v22 = 1.0D;
    Object v23 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v22).doubleValue()));
    Object v24 = ((com.google.javascript.jscomp.TypedScopeCreator)v21).createInitialScope(((com.google.javascript.rhino.Node)v23));
    Object v25 = ((com.google.javascript.jscomp.Scope)v24).getVars();
    Object v26 = ((com.google.javascript.jscomp.TypedScopeCreator)v13).createScope(((com.google.javascript.rhino.Node)v15),((com.google.javascript.jscomp.Scope)v24));
    Object v27 = ((com.google.javascript.jscomp.Scope)v26).getVars();
    Object v28 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.Scope)v26));
    org.junit.Assert.assertNotNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v4));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = 1.0D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    Object v8 = "L";
    Object v9 = java.nio.charset.Charset.defaultCharset();
    Object v10 = new java.io.PrintStream(((java.lang.String)v8),((java.nio.charset.Charset)v9));
    Object v11 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v10));
    Object v12 = ((com.google.javascript.jscomp.AbstractCompiler)v11).getErrorManager();
    Object v13 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v11));
    Object v14 = 1.0D;
    Object v15 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v14).doubleValue()));
    Object v16 = "L";
    Object v17 = java.nio.charset.Charset.defaultCharset();
    Object v18 = new java.io.PrintStream(((java.lang.String)v16),((java.nio.charset.Charset)v17));
    Object v19 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v18));
    Object v20 = ((com.google.javascript.jscomp.AbstractCompiler)v19).getErrorManager();
    Object v21 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v19));
    Object v22 = 1.0D;
    Object v23 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v22).doubleValue()));
    Object v24 = "L";
    Object v25 = java.nio.charset.Charset.defaultCharset();
    Object v26 = new java.io.PrintStream(((java.lang.String)v24),((java.nio.charset.Charset)v25));
    Object v27 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v26));
    Object v28 = ((com.google.javascript.jscomp.AbstractCompiler)v27).getErrorManager();
    Object v29 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v27));
    Object v30 = 1.0D;
    Object v31 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v30).doubleValue()));
    Object v32 = ((com.google.javascript.jscomp.TypedScopeCreator)v29).createInitialScope(((com.google.javascript.rhino.Node)v31));
    Object v33 = "protot6pe";
    Object v34 = ((com.google.javascript.jscomp.Scope)v32).getOwnSlot(((java.lang.String)v33));
    Object v35 = ((com.google.javascript.jscomp.TypedScopeCreator)v21).createScope(((com.google.javascript.rhino.Node)v23),((com.google.javascript.jscomp.Scope)v32));
    Object v36 = "l";
    Object v37 = ((com.google.javascript.jscomp.Scope)v35).getSlot(((java.lang.String)v36));
    Object v38 = ((com.google.javascript.jscomp.TypedScopeCreator)v13).createScope(((com.google.javascript.rhino.Node)v15),((com.google.javascript.jscomp.Scope)v35));
    Object v39 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.Scope)v38));
    org.junit.Assert.assertNotNull(v39);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = 1.0D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    Object v8 = false;
    ((com.google.javascript.rhino.Node)v7).setIsSyntheticBlock((((java.lang.Boolean)v8).booleanValue()));
    Object v9 = null;
    Object v10 = "L";
    Object v11 = java.nio.charset.Charset.defaultCharset();
    Object v12 = new java.io.PrintStream(((java.lang.String)v10),((java.nio.charset.Charset)v11));
    Object v13 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v12));
    Object v14 = ((com.google.javascript.jscomp.AbstractCompiler)v13).getErrorManager();
    Object v15 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v13));
    Object v16 = 1.0D;
    Object v17 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v16).doubleValue()));
    Object v18 = ((com.google.javascript.jscomp.TypedScopeCreator)v15).createInitialScope(((com.google.javascript.rhino.Node)v17));
    Object v19 = ((com.google.javascript.jscomp.Scope)v18).getVarCount();
    Object v20 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.Scope)v18));
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = 1.0D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    Object v8 = "L";
    Object v9 = java.nio.charset.Charset.defaultCharset();
    Object v10 = new java.io.PrintStream(((java.lang.String)v8),((java.nio.charset.Charset)v9));
    Object v11 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v10));
    Object v12 = ((com.google.javascript.jscomp.AbstractCompiler)v11).getErrorManager();
    Object v13 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v11));
    Object v14 = 1.0D;
    Object v15 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v14).doubleValue()));
    Object v16 = "L";
    Object v17 = java.nio.charset.Charset.defaultCharset();
    Object v18 = new java.io.PrintStream(((java.lang.String)v16),((java.nio.charset.Charset)v17));
    Object v19 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v18));
    Object v20 = ((com.google.javascript.jscomp.AbstractCompiler)v19).getErrorManager();
    Object v21 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v19));
    Object v22 = 1.0D;
    Object v23 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v22).doubleValue()));
    Object v24 = ((com.google.javascript.jscomp.TypedScopeCreator)v21).createInitialScope(((com.google.javascript.rhino.Node)v23));
    Object v25 = ((com.google.javascript.jscomp.Scope)v24).getVars();
    Object v26 = ((com.google.javascript.jscomp.TypedScopeCreator)v13).createScope(((com.google.javascript.rhino.Node)v15),((com.google.javascript.jscomp.Scope)v24));
    Object v27 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.Scope)v26));
    org.junit.Assert.assertNotNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = 1.0D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    Object v8 = 1.0D;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()));
    ((com.google.javascript.rhino.Node)v7).addChildToFront(((com.google.javascript.rhino.Node)v9));
    Object v10 = null;
    Object v11 = "L";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = ((com.google.javascript.jscomp.AbstractCompiler)v14).getErrorManager();
    Object v16 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v14));
    Object v17 = 1.0D;
    Object v18 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v17).doubleValue()));
    Object v19 = false;
    ((com.google.javascript.rhino.Node)v18).setIsSyntheticBlock((((java.lang.Boolean)v19).booleanValue()));
    Object v20 = null;
    Object v21 = "L";
    Object v22 = java.nio.charset.Charset.defaultCharset();
    Object v23 = new java.io.PrintStream(((java.lang.String)v21),((java.nio.charset.Charset)v22));
    Object v24 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v23));
    Object v25 = ((com.google.javascript.jscomp.AbstractCompiler)v24).getErrorManager();
    Object v26 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v24));
    Object v27 = 1.0D;
    Object v28 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v27).doubleValue()));
    Object v29 = ((com.google.javascript.jscomp.TypedScopeCreator)v26).createInitialScope(((com.google.javascript.rhino.Node)v28));
    Object v30 = ((com.google.javascript.jscomp.Scope)v29).getVarCount();
    Object v31 = ((com.google.javascript.jscomp.TypedScopeCreator)v16).createScope(((com.google.javascript.rhino.Node)v18),((com.google.javascript.jscomp.Scope)v29));
    Object v32 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.Scope)v31));
    org.junit.Assert.assertNotNull(v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = 1.0D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    Object v8 = ((com.google.javascript.rhino.Node)v7).isQualifiedName();
    Object v9 = "L";
    Object v10 = java.nio.charset.Charset.defaultCharset();
    Object v11 = new java.io.PrintStream(((java.lang.String)v9),((java.nio.charset.Charset)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v11));
    Object v13 = ((com.google.javascript.jscomp.AbstractCompiler)v12).getErrorManager();
    Object v14 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v15 = 1.0D;
    Object v16 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v15).doubleValue()));
    Object v17 = "L";
    Object v18 = java.nio.charset.Charset.defaultCharset();
    Object v19 = new java.io.PrintStream(((java.lang.String)v17),((java.nio.charset.Charset)v18));
    Object v20 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v19));
    Object v21 = ((com.google.javascript.jscomp.AbstractCompiler)v20).getErrorManager();
    Object v22 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v20));
    Object v23 = 1.0D;
    Object v24 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v23).doubleValue()));
    Object v25 = "L";
    Object v26 = java.nio.charset.Charset.defaultCharset();
    Object v27 = new java.io.PrintStream(((java.lang.String)v25),((java.nio.charset.Charset)v26));
    Object v28 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v27));
    Object v29 = ((com.google.javascript.jscomp.AbstractCompiler)v28).getErrorManager();
    Object v30 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v28));
    Object v31 = 1.0D;
    Object v32 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v31).doubleValue()));
    Object v33 = ((com.google.javascript.jscomp.TypedScopeCreator)v30).createInitialScope(((com.google.javascript.rhino.Node)v32));
    Object v34 = "protot6pe";
    Object v35 = ((com.google.javascript.jscomp.Scope)v33).getOwnSlot(((java.lang.String)v34));
    Object v36 = ((com.google.javascript.jscomp.TypedScopeCreator)v22).createScope(((com.google.javascript.rhino.Node)v24),((com.google.javascript.jscomp.Scope)v33));
    Object v37 = ((com.google.javascript.jscomp.Scope)v36).getVarCount();
    Object v38 = ((com.google.javascript.jscomp.TypedScopeCreator)v14).createScope(((com.google.javascript.rhino.Node)v16),((com.google.javascript.jscomp.Scope)v36));
    Object v39 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.Scope)v38));
    org.junit.Assert.assertNotNull(v39);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = 1.0D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    Object v8 = "L";
    Object v9 = java.nio.charset.Charset.defaultCharset();
    Object v10 = new java.io.PrintStream(((java.lang.String)v8),((java.nio.charset.Charset)v9));
    Object v11 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v10));
    Object v12 = ((com.google.javascript.jscomp.AbstractCompiler)v11).getErrorManager();
    Object v13 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v11));
    Object v14 = 1.0D;
    Object v15 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v14).doubleValue()));
    Object v16 = ((com.google.javascript.jscomp.TypedScopeCreator)v13).createInitialScope(((com.google.javascript.rhino.Node)v15));
    Object v17 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.Scope)v16));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = 1.0D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    Object v8 = "L";
    Object v9 = java.nio.charset.Charset.defaultCharset();
    Object v10 = new java.io.PrintStream(((java.lang.String)v8),((java.nio.charset.Charset)v9));
    Object v11 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v10));
    Object v12 = ((com.google.javascript.jscomp.AbstractCompiler)v11).getErrorManager();
    Object v13 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v11));
    Object v14 = 1.0D;
    Object v15 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v14).doubleValue()));
    Object v16 = "L";
    Object v17 = java.nio.charset.Charset.defaultCharset();
    Object v18 = new java.io.PrintStream(((java.lang.String)v16),((java.nio.charset.Charset)v17));
    Object v19 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v18));
    Object v20 = ((com.google.javascript.jscomp.AbstractCompiler)v19).getErrorManager();
    Object v21 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v19));
    Object v22 = 1.0D;
    Object v23 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v22).doubleValue()));
    Object v24 = ((com.google.javascript.jscomp.TypedScopeCreator)v21).createInitialScope(((com.google.javascript.rhino.Node)v23));
    Object v25 = ((com.google.javascript.jscomp.TypedScopeCreator)v13).createScope(((com.google.javascript.rhino.Node)v15),((com.google.javascript.jscomp.Scope)v24));
    Object v26 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.Scope)v25));
    org.junit.Assert.assertNotNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = "L";
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
  public void test24() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = 1.0D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    Object v8 = "L";
    Object v9 = java.nio.charset.Charset.defaultCharset();
    Object v10 = new java.io.PrintStream(((java.lang.String)v8),((java.nio.charset.Charset)v9));
    Object v11 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v10));
    Object v12 = ((com.google.javascript.jscomp.AbstractCompiler)v11).getErrorManager();
    Object v13 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v11));
    Object v14 = 1.0D;
    Object v15 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v14).doubleValue()));
    Object v16 = "L";
    Object v17 = java.nio.charset.Charset.defaultCharset();
    Object v18 = new java.io.PrintStream(((java.lang.String)v16),((java.nio.charset.Charset)v17));
    Object v19 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v18));
    Object v20 = ((com.google.javascript.jscomp.AbstractCompiler)v19).getErrorManager();
    Object v21 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v19));
    Object v22 = 1.0D;
    Object v23 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v22).doubleValue()));
    Object v24 = "L";
    Object v25 = java.nio.charset.Charset.defaultCharset();
    Object v26 = new java.io.PrintStream(((java.lang.String)v24),((java.nio.charset.Charset)v25));
    Object v27 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v26));
    Object v28 = ((com.google.javascript.jscomp.AbstractCompiler)v27).getErrorManager();
    Object v29 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v27));
    Object v30 = 1.0D;
    Object v31 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v30).doubleValue()));
    Object v32 = ((com.google.javascript.jscomp.TypedScopeCreator)v29).createInitialScope(((com.google.javascript.rhino.Node)v31));
    Object v33 = ((com.google.javascript.jscomp.Scope)v32).getVars();
    Object v34 = ((com.google.javascript.jscomp.TypedScopeCreator)v21).createScope(((com.google.javascript.rhino.Node)v23),((com.google.javascript.jscomp.Scope)v32));
    Object v35 = ((com.google.javascript.jscomp.Scope)v34).getVars();
    Object v36 = ((com.google.javascript.jscomp.TypedScopeCreator)v13).createScope(((com.google.javascript.rhino.Node)v15),((com.google.javascript.jscomp.Scope)v34));
    Object v37 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.Scope)v36));
    org.junit.Assert.assertNotNull(v37);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = 1.0D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    Object v8 = 0;
    ((com.google.javascript.rhino.Node)v7).removeProp((((java.lang.Integer)v8).intValue()));
    Object v9 = null;
    Object v10 = "L";
    Object v11 = java.nio.charset.Charset.defaultCharset();
    Object v12 = new java.io.PrintStream(((java.lang.String)v10),((java.nio.charset.Charset)v11));
    Object v13 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v12));
    Object v14 = ((com.google.javascript.jscomp.AbstractCompiler)v13).getErrorManager();
    Object v15 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v13));
    Object v16 = 1.0D;
    Object v17 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v16).doubleValue()));
    Object v18 = false;
    ((com.google.javascript.rhino.Node)v17).setIsSyntheticBlock((((java.lang.Boolean)v18).booleanValue()));
    Object v19 = null;
    Object v20 = "L";
    Object v21 = java.nio.charset.Charset.defaultCharset();
    Object v22 = new java.io.PrintStream(((java.lang.String)v20),((java.nio.charset.Charset)v21));
    Object v23 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v22));
    Object v24 = ((com.google.javascript.jscomp.AbstractCompiler)v23).getErrorManager();
    Object v25 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v23));
    Object v26 = 1.0D;
    Object v27 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v26).doubleValue()));
    Object v28 = ((com.google.javascript.jscomp.TypedScopeCreator)v25).createInitialScope(((com.google.javascript.rhino.Node)v27));
    Object v29 = ((com.google.javascript.jscomp.Scope)v28).getVarCount();
    Object v30 = ((com.google.javascript.jscomp.TypedScopeCreator)v15).createScope(((com.google.javascript.rhino.Node)v17),((com.google.javascript.jscomp.Scope)v28));
    Object v31 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.Scope)v30));
    org.junit.Assert.assertNotNull(v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = 1.0D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    Object v8 = "L";
    Object v9 = java.nio.charset.Charset.defaultCharset();
    Object v10 = new java.io.PrintStream(((java.lang.String)v8),((java.nio.charset.Charset)v9));
    Object v11 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v10));
    Object v12 = ((com.google.javascript.jscomp.AbstractCompiler)v11).getErrorManager();
    Object v13 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v11));
    Object v14 = 1.0D;
    Object v15 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v14).doubleValue()));
    Object v16 = "L";
    Object v17 = java.nio.charset.Charset.defaultCharset();
    Object v18 = new java.io.PrintStream(((java.lang.String)v16),((java.nio.charset.Charset)v17));
    Object v19 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v18));
    Object v20 = ((com.google.javascript.jscomp.AbstractCompiler)v19).getErrorManager();
    Object v21 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v19));
    Object v22 = 1.0D;
    Object v23 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v22).doubleValue()));
    Object v24 = "L";
    Object v25 = java.nio.charset.Charset.defaultCharset();
    Object v26 = new java.io.PrintStream(((java.lang.String)v24),((java.nio.charset.Charset)v25));
    Object v27 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v26));
    Object v28 = ((com.google.javascript.jscomp.AbstractCompiler)v27).getErrorManager();
    Object v29 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v27));
    Object v30 = 1.0D;
    Object v31 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v30).doubleValue()));
    Object v32 = ((com.google.javascript.jscomp.TypedScopeCreator)v29).createInitialScope(((com.google.javascript.rhino.Node)v31));
    Object v33 = ((com.google.javascript.jscomp.TypedScopeCreator)v21).createScope(((com.google.javascript.rhino.Node)v23),((com.google.javascript.jscomp.Scope)v32));
    Object v34 = ((com.google.javascript.jscomp.TypedScopeCreator)v13).createScope(((com.google.javascript.rhino.Node)v15),((com.google.javascript.jscomp.Scope)v33));
    Object v35 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.Scope)v34));
    org.junit.Assert.assertNotNull(v35);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = 1.0D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    Object v8 = "L";
    Object v9 = java.nio.charset.Charset.defaultCharset();
    Object v10 = new java.io.PrintStream(((java.lang.String)v8),((java.nio.charset.Charset)v9));
    Object v11 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v10));
    Object v12 = ((com.google.javascript.jscomp.AbstractCompiler)v11).getErrorManager();
    Object v13 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v11));
    Object v14 = 1.0D;
    Object v15 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v14).doubleValue()));
    Object v16 = false;
    ((com.google.javascript.rhino.Node)v15).setIsSyntheticBlock((((java.lang.Boolean)v16).booleanValue()));
    Object v17 = null;
    Object v18 = "L";
    Object v19 = java.nio.charset.Charset.defaultCharset();
    Object v20 = new java.io.PrintStream(((java.lang.String)v18),((java.nio.charset.Charset)v19));
    Object v21 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v20));
    Object v22 = ((com.google.javascript.jscomp.AbstractCompiler)v21).getErrorManager();
    Object v23 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v21));
    Object v24 = 1.0D;
    Object v25 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v24).doubleValue()));
    Object v26 = ((com.google.javascript.jscomp.TypedScopeCreator)v23).createInitialScope(((com.google.javascript.rhino.Node)v25));
    Object v27 = ((com.google.javascript.jscomp.Scope)v26).getVarCount();
    Object v28 = ((com.google.javascript.jscomp.TypedScopeCreator)v13).createScope(((com.google.javascript.rhino.Node)v15),((com.google.javascript.jscomp.Scope)v26));
    Object v29 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.Scope)v28));
    org.junit.Assert.assertNotNull(v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = 1.0D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    Object v8 = 1.0D;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()));
    Object v10 = ((com.google.javascript.rhino.Node)v7).checkTreeTypeAwareEqualsSilent(((com.google.javascript.rhino.Node)v9));
    Object v11 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createInitialScope(((com.google.javascript.rhino.Node)v7));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = 1.0D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    Object v8 = "L";
    Object v9 = java.nio.charset.Charset.defaultCharset();
    Object v10 = new java.io.PrintStream(((java.lang.String)v8),((java.nio.charset.Charset)v9));
    Object v11 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v10));
    Object v12 = ((com.google.javascript.jscomp.AbstractCompiler)v11).getErrorManager();
    Object v13 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v11));
    Object v14 = 1.0D;
    Object v15 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v14).doubleValue()));
    Object v16 = 1.0D;
    Object v17 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v16).doubleValue()));
    Object v18 = ((com.google.javascript.rhino.Node)v15).checkTreeTypeAwareEqualsSilent(((com.google.javascript.rhino.Node)v17));
    Object v19 = ((com.google.javascript.jscomp.TypedScopeCreator)v13).createInitialScope(((com.google.javascript.rhino.Node)v15));
    Object v20 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.Scope)v19));
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = 1.0D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    Object v8 = ((com.google.javascript.rhino.Node)v7).toString();
    Object v9 = "L";
    Object v10 = java.nio.charset.Charset.defaultCharset();
    Object v11 = new java.io.PrintStream(((java.lang.String)v9),((java.nio.charset.Charset)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v11));
    Object v13 = ((com.google.javascript.jscomp.AbstractCompiler)v12).getErrorManager();
    Object v14 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v15 = 1.0D;
    Object v16 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v15).doubleValue()));
    Object v17 = "L";
    Object v18 = java.nio.charset.Charset.defaultCharset();
    Object v19 = new java.io.PrintStream(((java.lang.String)v17),((java.nio.charset.Charset)v18));
    Object v20 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v19));
    Object v21 = ((com.google.javascript.jscomp.AbstractCompiler)v20).getErrorManager();
    Object v22 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v20));
    Object v23 = 1.0D;
    Object v24 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v23).doubleValue()));
    Object v25 = ((com.google.javascript.jscomp.TypedScopeCreator)v22).createInitialScope(((com.google.javascript.rhino.Node)v24));
    Object v26 = ((com.google.javascript.jscomp.Scope)v25).getVars();
    Object v27 = ((com.google.javascript.jscomp.TypedScopeCreator)v14).createScope(((com.google.javascript.rhino.Node)v16),((com.google.javascript.jscomp.Scope)v25));
    Object v28 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.Scope)v27));
    org.junit.Assert.assertNotNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = 1.0D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    Object v8 = 1.0D;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()));
    Object v10 = ((com.google.javascript.rhino.Node)v7).copyInformationFromForTree(((com.google.javascript.rhino.Node)v9));
    Object v11 = "L";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = ((com.google.javascript.jscomp.AbstractCompiler)v14).getErrorManager();
    Object v16 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v14));
    Object v17 = 1.0D;
    Object v18 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v17).doubleValue()));
    Object v19 = 1.0D;
    Object v20 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v19).doubleValue()));
    Object v21 = ((com.google.javascript.rhino.Node)v18).checkTreeTypeAwareEqualsSilent(((com.google.javascript.rhino.Node)v20));
    Object v22 = ((com.google.javascript.jscomp.TypedScopeCreator)v16).createInitialScope(((com.google.javascript.rhino.Node)v18));
    Object v23 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.Scope)v22));
    org.junit.Assert.assertNotNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = 1.0D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    Object v8 = "L";
    Object v9 = java.nio.charset.Charset.defaultCharset();
    Object v10 = new java.io.PrintStream(((java.lang.String)v8),((java.nio.charset.Charset)v9));
    Object v11 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v10));
    Object v12 = ((com.google.javascript.jscomp.AbstractCompiler)v11).getErrorManager();
    Object v13 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v11));
    Object v14 = 1.0D;
    Object v15 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v14).doubleValue()));
    Object v16 = 1.0D;
    Object v17 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v16).doubleValue()));
    Object v18 = ((com.google.javascript.rhino.Node)v15).checkTreeTypeAwareEqualsSilent(((com.google.javascript.rhino.Node)v17));
    Object v19 = ((com.google.javascript.jscomp.TypedScopeCreator)v13).createInitialScope(((com.google.javascript.rhino.Node)v15));
    Object v20 = ((com.google.javascript.jscomp.Scope)v19).getVars();
    Object v21 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.Scope)v19));
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = 1.0D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    Object v8 = ((com.google.javascript.rhino.Node)v7).toString();
    Object v9 = "L";
    Object v10 = java.nio.charset.Charset.defaultCharset();
    Object v11 = new java.io.PrintStream(((java.lang.String)v9),((java.nio.charset.Charset)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v11));
    Object v13 = ((com.google.javascript.jscomp.AbstractCompiler)v12).getErrorManager();
    Object v14 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v15 = 1.0D;
    Object v16 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v15).doubleValue()));
    Object v17 = 1.0D;
    Object v18 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v17).doubleValue()));
    Object v19 = ((com.google.javascript.rhino.Node)v16).checkTreeTypeAwareEqualsSilent(((com.google.javascript.rhino.Node)v18));
    Object v20 = ((com.google.javascript.jscomp.TypedScopeCreator)v14).createInitialScope(((com.google.javascript.rhino.Node)v16));
    Object v21 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.Scope)v20));
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = 1.0D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    Object v8 = "L";
    Object v9 = java.nio.charset.Charset.defaultCharset();
    Object v10 = new java.io.PrintStream(((java.lang.String)v8),((java.nio.charset.Charset)v9));
    Object v11 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v10));
    Object v12 = ((com.google.javascript.jscomp.AbstractCompiler)v11).getErrorManager();
    Object v13 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v11));
    Object v14 = 1.0D;
    Object v15 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v14).doubleValue()));
    Object v16 = "L";
    Object v17 = java.nio.charset.Charset.defaultCharset();
    Object v18 = new java.io.PrintStream(((java.lang.String)v16),((java.nio.charset.Charset)v17));
    Object v19 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v18));
    Object v20 = ((com.google.javascript.jscomp.AbstractCompiler)v19).getErrorManager();
    Object v21 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v19));
    Object v22 = 1.0D;
    Object v23 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v22).doubleValue()));
    Object v24 = "L";
    Object v25 = java.nio.charset.Charset.defaultCharset();
    Object v26 = new java.io.PrintStream(((java.lang.String)v24),((java.nio.charset.Charset)v25));
    Object v27 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v26));
    Object v28 = ((com.google.javascript.jscomp.AbstractCompiler)v27).getErrorManager();
    Object v29 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v27));
    Object v30 = 1.0D;
    Object v31 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v30).doubleValue()));
    Object v32 = ((com.google.javascript.jscomp.TypedScopeCreator)v29).createInitialScope(((com.google.javascript.rhino.Node)v31));
    Object v33 = "protot6pe";
    Object v34 = ((com.google.javascript.jscomp.Scope)v32).getOwnSlot(((java.lang.String)v33));
    Object v35 = ((com.google.javascript.jscomp.TypedScopeCreator)v21).createScope(((com.google.javascript.rhino.Node)v23),((com.google.javascript.jscomp.Scope)v32));
    Object v36 = ((com.google.javascript.jscomp.Scope)v35).getVarCount();
    Object v37 = ((com.google.javascript.jscomp.TypedScopeCreator)v13).createScope(((com.google.javascript.rhino.Node)v15),((com.google.javascript.jscomp.Scope)v35));
    Object v38 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.Scope)v37));
    org.junit.Assert.assertNotNull(v38);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = 1.0D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    Object v8 = "L";
    Object v9 = java.nio.charset.Charset.defaultCharset();
    Object v10 = new java.io.PrintStream(((java.lang.String)v8),((java.nio.charset.Charset)v9));
    Object v11 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v10));
    Object v12 = ((com.google.javascript.jscomp.AbstractCompiler)v11).getErrorManager();
    Object v13 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v11));
    Object v14 = 1.0D;
    Object v15 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v14).doubleValue()));
    Object v16 = "L";
    Object v17 = java.nio.charset.Charset.defaultCharset();
    Object v18 = new java.io.PrintStream(((java.lang.String)v16),((java.nio.charset.Charset)v17));
    Object v19 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v18));
    Object v20 = ((com.google.javascript.jscomp.AbstractCompiler)v19).getErrorManager();
    Object v21 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v19));
    Object v22 = 1.0D;
    Object v23 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v22).doubleValue()));
    Object v24 = "L";
    Object v25 = java.nio.charset.Charset.defaultCharset();
    Object v26 = new java.io.PrintStream(((java.lang.String)v24),((java.nio.charset.Charset)v25));
    Object v27 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v26));
    Object v28 = ((com.google.javascript.jscomp.AbstractCompiler)v27).getErrorManager();
    Object v29 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v27));
    Object v30 = 1.0D;
    Object v31 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v30).doubleValue()));
    Object v32 = ((com.google.javascript.jscomp.TypedScopeCreator)v29).createInitialScope(((com.google.javascript.rhino.Node)v31));
    Object v33 = ((com.google.javascript.jscomp.Scope)v32).getVars();
    Object v34 = ((com.google.javascript.jscomp.TypedScopeCreator)v21).createScope(((com.google.javascript.rhino.Node)v23),((com.google.javascript.jscomp.Scope)v32));
    Object v35 = ((com.google.javascript.jscomp.TypedScopeCreator)v13).createScope(((com.google.javascript.rhino.Node)v15),((com.google.javascript.jscomp.Scope)v34));
    Object v36 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.Scope)v35));
    org.junit.Assert.assertNotNull(v36);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = 1.0D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    Object v8 = "L";
    Object v9 = java.nio.charset.Charset.defaultCharset();
    Object v10 = new java.io.PrintStream(((java.lang.String)v8),((java.nio.charset.Charset)v9));
    Object v11 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v10));
    Object v12 = ((com.google.javascript.jscomp.AbstractCompiler)v11).getErrorManager();
    Object v13 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v11));
    Object v14 = 1.0D;
    Object v15 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v14).doubleValue()));
    Object v16 = 1.0D;
    Object v17 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v16).doubleValue()));
    Object v18 = ((com.google.javascript.rhino.Node)v15).checkTreeTypeAwareEqualsSilent(((com.google.javascript.rhino.Node)v17));
    Object v19 = ((com.google.javascript.jscomp.TypedScopeCreator)v13).createInitialScope(((com.google.javascript.rhino.Node)v15));
    Object v20 = ((com.google.javascript.jscomp.Scope)v19).getVarCount();
    Object v21 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.Scope)v19));
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = 1.0D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    Object v8 = "L";
    Object v9 = java.nio.charset.Charset.defaultCharset();
    Object v10 = new java.io.PrintStream(((java.lang.String)v8),((java.nio.charset.Charset)v9));
    Object v11 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v10));
    Object v12 = ((com.google.javascript.jscomp.AbstractCompiler)v11).getErrorManager();
    Object v13 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v11));
    Object v14 = 1.0D;
    Object v15 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v14).doubleValue()));
    Object v16 = "L";
    Object v17 = java.nio.charset.Charset.defaultCharset();
    Object v18 = new java.io.PrintStream(((java.lang.String)v16),((java.nio.charset.Charset)v17));
    Object v19 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v18));
    Object v20 = ((com.google.javascript.jscomp.AbstractCompiler)v19).getErrorManager();
    Object v21 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v19));
    Object v22 = 1.0D;
    Object v23 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v22).doubleValue()));
    Object v24 = 1.0D;
    Object v25 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v24).doubleValue()));
    Object v26 = ((com.google.javascript.rhino.Node)v23).checkTreeTypeAwareEqualsSilent(((com.google.javascript.rhino.Node)v25));
    Object v27 = ((com.google.javascript.jscomp.TypedScopeCreator)v21).createInitialScope(((com.google.javascript.rhino.Node)v23));
    Object v28 = ((com.google.javascript.jscomp.Scope)v27).getVarCount();
    Object v29 = ((com.google.javascript.jscomp.TypedScopeCreator)v13).createScope(((com.google.javascript.rhino.Node)v15),((com.google.javascript.jscomp.Scope)v27));
    Object v30 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.Scope)v29));
    org.junit.Assert.assertNotNull(v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = 1.0D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    Object v8 = 0;
    Object v9 = new java.util.ArrayList((((java.lang.Integer)v8).intValue()));
    Object v10 = new java.util.HashSet(((java.util.Collection)v9));
    ((com.google.javascript.rhino.Node)v7).setDirectives(((java.util.Set)v10));
    Object v11 = null;
    Object v12 = "L";
    Object v13 = java.nio.charset.Charset.defaultCharset();
    Object v14 = new java.io.PrintStream(((java.lang.String)v12),((java.nio.charset.Charset)v13));
    Object v15 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v14));
    Object v16 = ((com.google.javascript.jscomp.AbstractCompiler)v15).getErrorManager();
    Object v17 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v15));
    Object v18 = 1.0D;
    Object v19 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v18).doubleValue()));
    Object v20 = 1.0D;
    Object v21 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v20).doubleValue()));
    Object v22 = ((com.google.javascript.rhino.Node)v19).checkTreeTypeAwareEqualsSilent(((com.google.javascript.rhino.Node)v21));
    Object v23 = ((com.google.javascript.jscomp.TypedScopeCreator)v17).createInitialScope(((com.google.javascript.rhino.Node)v19));
    Object v24 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.Scope)v23));
    org.junit.Assert.assertNotNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = 1.0D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    Object v8 = 0;
    ((com.google.javascript.rhino.Node)v7).setLineno((((java.lang.Integer)v8).intValue()));
    Object v9 = null;
    Object v10 = "L";
    Object v11 = java.nio.charset.Charset.defaultCharset();
    Object v12 = new java.io.PrintStream(((java.lang.String)v10),((java.nio.charset.Charset)v11));
    Object v13 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v12));
    Object v14 = ((com.google.javascript.jscomp.AbstractCompiler)v13).getErrorManager();
    Object v15 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v13));
    Object v16 = 1.0D;
    Object v17 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v16).doubleValue()));
    Object v18 = 0;
    Object v19 = new java.util.ArrayList((((java.lang.Integer)v18).intValue()));
    Object v20 = new java.util.HashSet(((java.util.Collection)v19));
    ((com.google.javascript.rhino.Node)v17).setDirectives(((java.util.Set)v20));
    Object v21 = null;
    Object v22 = "L";
    Object v23 = java.nio.charset.Charset.defaultCharset();
    Object v24 = new java.io.PrintStream(((java.lang.String)v22),((java.nio.charset.Charset)v23));
    Object v25 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v24));
    Object v26 = ((com.google.javascript.jscomp.AbstractCompiler)v25).getErrorManager();
    Object v27 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v25));
    Object v28 = 1.0D;
    Object v29 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v28).doubleValue()));
    Object v30 = 1.0D;
    Object v31 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v30).doubleValue()));
    Object v32 = ((com.google.javascript.rhino.Node)v29).checkTreeTypeAwareEqualsSilent(((com.google.javascript.rhino.Node)v31));
    Object v33 = ((com.google.javascript.jscomp.TypedScopeCreator)v27).createInitialScope(((com.google.javascript.rhino.Node)v29));
    Object v34 = ((com.google.javascript.jscomp.TypedScopeCreator)v15).createScope(((com.google.javascript.rhino.Node)v17),((com.google.javascript.jscomp.Scope)v33));
    Object v35 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.Scope)v34));
    org.junit.Assert.assertNotNull(v35);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = 1.0D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    Object v8 = "L";
    Object v9 = java.nio.charset.Charset.defaultCharset();
    Object v10 = new java.io.PrintStream(((java.lang.String)v8),((java.nio.charset.Charset)v9));
    Object v11 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v10));
    Object v12 = ((com.google.javascript.jscomp.AbstractCompiler)v11).getErrorManager();
    Object v13 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v11));
    Object v14 = 1.0D;
    Object v15 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v14).doubleValue()));
    Object v16 = 0;
    Object v17 = new java.util.ArrayList((((java.lang.Integer)v16).intValue()));
    Object v18 = new java.util.HashSet(((java.util.Collection)v17));
    ((com.google.javascript.rhino.Node)v15).setDirectives(((java.util.Set)v18));
    Object v19 = null;
    Object v20 = "L";
    Object v21 = java.nio.charset.Charset.defaultCharset();
    Object v22 = new java.io.PrintStream(((java.lang.String)v20),((java.nio.charset.Charset)v21));
    Object v23 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v22));
    Object v24 = ((com.google.javascript.jscomp.AbstractCompiler)v23).getErrorManager();
    Object v25 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v23));
    Object v26 = 1.0D;
    Object v27 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v26).doubleValue()));
    Object v28 = 1.0D;
    Object v29 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v28).doubleValue()));
    Object v30 = ((com.google.javascript.rhino.Node)v27).checkTreeTypeAwareEqualsSilent(((com.google.javascript.rhino.Node)v29));
    Object v31 = ((com.google.javascript.jscomp.TypedScopeCreator)v25).createInitialScope(((com.google.javascript.rhino.Node)v27));
    Object v32 = ((com.google.javascript.jscomp.TypedScopeCreator)v13).createScope(((com.google.javascript.rhino.Node)v15),((com.google.javascript.jscomp.Scope)v31));
    Object v33 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.Scope)v32));
    org.junit.Assert.assertNotNull(v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = 1.0D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    Object v8 = "L";
    Object v9 = java.nio.charset.Charset.defaultCharset();
    Object v10 = new java.io.PrintStream(((java.lang.String)v8),((java.nio.charset.Charset)v9));
    Object v11 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v10));
    Object v12 = ((com.google.javascript.jscomp.AbstractCompiler)v11).getErrorManager();
    Object v13 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v11));
    Object v14 = 1.0D;
    Object v15 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v14).doubleValue()));
    Object v16 = "L";
    Object v17 = java.nio.charset.Charset.defaultCharset();
    Object v18 = new java.io.PrintStream(((java.lang.String)v16),((java.nio.charset.Charset)v17));
    Object v19 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v18));
    Object v20 = ((com.google.javascript.jscomp.AbstractCompiler)v19).getErrorManager();
    Object v21 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v19));
    Object v22 = 1.0D;
    Object v23 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v22).doubleValue()));
    Object v24 = 1.0D;
    Object v25 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v24).doubleValue()));
    Object v26 = ((com.google.javascript.rhino.Node)v23).checkTreeTypeAwareEqualsSilent(((com.google.javascript.rhino.Node)v25));
    Object v27 = ((com.google.javascript.jscomp.TypedScopeCreator)v21).createInitialScope(((com.google.javascript.rhino.Node)v23));
    Object v28 = ((com.google.javascript.jscomp.TypedScopeCreator)v13).createScope(((com.google.javascript.rhino.Node)v15),((com.google.javascript.jscomp.Scope)v27));
    Object v29 = ", ";
    Object v30 = ((com.google.javascript.jscomp.Scope)v28).getOwnSlot(((java.lang.String)v29));
    Object v31 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.Scope)v28));
    org.junit.Assert.assertNotNull(v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = 1.0D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    Object v8 = ((com.google.javascript.rhino.Node)v7).cloneTree();
    Object v9 = "L";
    Object v10 = java.nio.charset.Charset.defaultCharset();
    Object v11 = new java.io.PrintStream(((java.lang.String)v9),((java.nio.charset.Charset)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v11));
    Object v13 = ((com.google.javascript.jscomp.AbstractCompiler)v12).getErrorManager();
    Object v14 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v15 = 1.0D;
    Object v16 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v15).doubleValue()));
    Object v17 = "L";
    Object v18 = java.nio.charset.Charset.defaultCharset();
    Object v19 = new java.io.PrintStream(((java.lang.String)v17),((java.nio.charset.Charset)v18));
    Object v20 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v19));
    Object v21 = ((com.google.javascript.jscomp.AbstractCompiler)v20).getErrorManager();
    Object v22 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v20));
    Object v23 = 1.0D;
    Object v24 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v23).doubleValue()));
    Object v25 = false;
    ((com.google.javascript.rhino.Node)v24).setIsSyntheticBlock((((java.lang.Boolean)v25).booleanValue()));
    Object v26 = null;
    Object v27 = "L";
    Object v28 = java.nio.charset.Charset.defaultCharset();
    Object v29 = new java.io.PrintStream(((java.lang.String)v27),((java.nio.charset.Charset)v28));
    Object v30 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v29));
    Object v31 = ((com.google.javascript.jscomp.AbstractCompiler)v30).getErrorManager();
    Object v32 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v30));
    Object v33 = 1.0D;
    Object v34 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v33).doubleValue()));
    Object v35 = ((com.google.javascript.jscomp.TypedScopeCreator)v32).createInitialScope(((com.google.javascript.rhino.Node)v34));
    Object v36 = ((com.google.javascript.jscomp.Scope)v35).getVarCount();
    Object v37 = ((com.google.javascript.jscomp.TypedScopeCreator)v22).createScope(((com.google.javascript.rhino.Node)v24),((com.google.javascript.jscomp.Scope)v35));
    Object v38 = ((com.google.javascript.jscomp.TypedScopeCreator)v14).createScope(((com.google.javascript.rhino.Node)v16),((com.google.javascript.jscomp.Scope)v37));
    Object v39 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.Scope)v38));
    org.junit.Assert.assertNotNull(v39);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = 1.0D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    Object v8 = "L";
    Object v9 = java.nio.charset.Charset.defaultCharset();
    Object v10 = new java.io.PrintStream(((java.lang.String)v8),((java.nio.charset.Charset)v9));
    Object v11 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v10));
    Object v12 = ((com.google.javascript.jscomp.AbstractCompiler)v11).getErrorManager();
    Object v13 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v11));
    Object v14 = 1.0D;
    Object v15 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v14).doubleValue()));
    Object v16 = "L";
    Object v17 = java.nio.charset.Charset.defaultCharset();
    Object v18 = new java.io.PrintStream(((java.lang.String)v16),((java.nio.charset.Charset)v17));
    Object v19 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v18));
    Object v20 = ((com.google.javascript.jscomp.AbstractCompiler)v19).getErrorManager();
    Object v21 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v19));
    Object v22 = 1.0D;
    Object v23 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v22).doubleValue()));
    Object v24 = "L";
    Object v25 = java.nio.charset.Charset.defaultCharset();
    Object v26 = new java.io.PrintStream(((java.lang.String)v24),((java.nio.charset.Charset)v25));
    Object v27 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v26));
    Object v28 = ((com.google.javascript.jscomp.AbstractCompiler)v27).getErrorManager();
    Object v29 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v27));
    Object v30 = 1.0D;
    Object v31 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v30).doubleValue()));
    Object v32 = 1.0D;
    Object v33 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v32).doubleValue()));
    Object v34 = ((com.google.javascript.rhino.Node)v31).checkTreeTypeAwareEqualsSilent(((com.google.javascript.rhino.Node)v33));
    Object v35 = ((com.google.javascript.jscomp.TypedScopeCreator)v29).createInitialScope(((com.google.javascript.rhino.Node)v31));
    Object v36 = ((com.google.javascript.jscomp.Scope)v35).getVarCount();
    Object v37 = ((com.google.javascript.jscomp.TypedScopeCreator)v21).createScope(((com.google.javascript.rhino.Node)v23),((com.google.javascript.jscomp.Scope)v35));
    Object v38 = ((com.google.javascript.jscomp.TypedScopeCreator)v13).createScope(((com.google.javascript.rhino.Node)v15),((com.google.javascript.jscomp.Scope)v37));
    Object v39 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.Scope)v38));
    org.junit.Assert.assertNotNull(v39);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = 1.0D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    Object v8 = 1;
    ((com.google.javascript.rhino.Node)v7).removeProp((((java.lang.Integer)v8).intValue()));
    Object v9 = null;
    Object v10 = "L";
    Object v11 = java.nio.charset.Charset.defaultCharset();
    Object v12 = new java.io.PrintStream(((java.lang.String)v10),((java.nio.charset.Charset)v11));
    Object v13 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v12));
    Object v14 = ((com.google.javascript.jscomp.AbstractCompiler)v13).getErrorManager();
    Object v15 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v13));
    Object v16 = 1.0D;
    Object v17 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v16).doubleValue()));
    Object v18 = 1.0D;
    Object v19 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v18).doubleValue()));
    Object v20 = ((com.google.javascript.rhino.Node)v17).checkTreeTypeAwareEqualsSilent(((com.google.javascript.rhino.Node)v19));
    Object v21 = ((com.google.javascript.jscomp.TypedScopeCreator)v15).createInitialScope(((com.google.javascript.rhino.Node)v17));
    Object v22 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.Scope)v21));
    org.junit.Assert.assertNotNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = 1.0D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    Object v8 = "L";
    Object v9 = java.nio.charset.Charset.defaultCharset();
    Object v10 = new java.io.PrintStream(((java.lang.String)v8),((java.nio.charset.Charset)v9));
    Object v11 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v10));
    Object v12 = ((com.google.javascript.jscomp.AbstractCompiler)v11).getErrorManager();
    Object v13 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v11));
    Object v14 = 1.0D;
    Object v15 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v14).doubleValue()));
    Object v16 = 1;
    ((com.google.javascript.rhino.Node)v15).removeProp((((java.lang.Integer)v16).intValue()));
    Object v17 = null;
    Object v18 = "L";
    Object v19 = java.nio.charset.Charset.defaultCharset();
    Object v20 = new java.io.PrintStream(((java.lang.String)v18),((java.nio.charset.Charset)v19));
    Object v21 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v20));
    Object v22 = ((com.google.javascript.jscomp.AbstractCompiler)v21).getErrorManager();
    Object v23 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v21));
    Object v24 = 1.0D;
    Object v25 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v24).doubleValue()));
    Object v26 = 1.0D;
    Object v27 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v26).doubleValue()));
    Object v28 = ((com.google.javascript.rhino.Node)v25).checkTreeTypeAwareEqualsSilent(((com.google.javascript.rhino.Node)v27));
    Object v29 = ((com.google.javascript.jscomp.TypedScopeCreator)v23).createInitialScope(((com.google.javascript.rhino.Node)v25));
    Object v30 = ((com.google.javascript.jscomp.TypedScopeCreator)v13).createScope(((com.google.javascript.rhino.Node)v15),((com.google.javascript.jscomp.Scope)v29));
    Object v31 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.Scope)v30));
    org.junit.Assert.assertNotNull(v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = 1.0D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    Object v8 = "L";
    Object v9 = java.nio.charset.Charset.defaultCharset();
    Object v10 = new java.io.PrintStream(((java.lang.String)v8),((java.nio.charset.Charset)v9));
    Object v11 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v10));
    Object v12 = ((com.google.javascript.jscomp.AbstractCompiler)v11).getErrorManager();
    Object v13 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v11));
    Object v14 = 1.0D;
    Object v15 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v14).doubleValue()));
    Object v16 = "L";
    Object v17 = java.nio.charset.Charset.defaultCharset();
    Object v18 = new java.io.PrintStream(((java.lang.String)v16),((java.nio.charset.Charset)v17));
    Object v19 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v18));
    Object v20 = ((com.google.javascript.jscomp.AbstractCompiler)v19).getErrorManager();
    Object v21 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v19));
    Object v22 = 1.0D;
    Object v23 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v22).doubleValue()));
    Object v24 = "L";
    Object v25 = java.nio.charset.Charset.defaultCharset();
    Object v26 = new java.io.PrintStream(((java.lang.String)v24),((java.nio.charset.Charset)v25));
    Object v27 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v26));
    Object v28 = ((com.google.javascript.jscomp.AbstractCompiler)v27).getErrorManager();
    Object v29 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v27));
    Object v30 = 1.0D;
    Object v31 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v30).doubleValue()));
    Object v32 = ((com.google.javascript.jscomp.TypedScopeCreator)v29).createInitialScope(((com.google.javascript.rhino.Node)v31));
    Object v33 = ((com.google.javascript.jscomp.Scope)v32).getVars();
    Object v34 = ((com.google.javascript.jscomp.TypedScopeCreator)v21).createScope(((com.google.javascript.rhino.Node)v23),((com.google.javascript.jscomp.Scope)v32));
    Object v35 = ((com.google.javascript.jscomp.Scope)v34).getVars();
    Object v36 = ((com.google.javascript.jscomp.TypedScopeCreator)v13).createScope(((com.google.javascript.rhino.Node)v15),((com.google.javascript.jscomp.Scope)v34));
    Object v37 = "call";
    Object v38 = ((com.google.javascript.jscomp.Scope)v36).getSlot(((java.lang.String)v37));
    Object v39 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.Scope)v36));
    org.junit.Assert.assertNotNull(v39);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = 1.0D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    Object v8 = "L";
    Object v9 = java.nio.charset.Charset.defaultCharset();
    Object v10 = new java.io.PrintStream(((java.lang.String)v8),((java.nio.charset.Charset)v9));
    Object v11 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v10));
    Object v12 = ((com.google.javascript.jscomp.AbstractCompiler)v11).getErrorManager();
    Object v13 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v11));
    Object v14 = 1.0D;
    Object v15 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v14).doubleValue()));
    Object v16 = ((com.google.javascript.rhino.Node)v15).toString();
    Object v17 = "L";
    Object v18 = java.nio.charset.Charset.defaultCharset();
    Object v19 = new java.io.PrintStream(((java.lang.String)v17),((java.nio.charset.Charset)v18));
    Object v20 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v19));
    Object v21 = ((com.google.javascript.jscomp.AbstractCompiler)v20).getErrorManager();
    Object v22 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v20));
    Object v23 = 1.0D;
    Object v24 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v23).doubleValue()));
    Object v25 = "L";
    Object v26 = java.nio.charset.Charset.defaultCharset();
    Object v27 = new java.io.PrintStream(((java.lang.String)v25),((java.nio.charset.Charset)v26));
    Object v28 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v27));
    Object v29 = ((com.google.javascript.jscomp.AbstractCompiler)v28).getErrorManager();
    Object v30 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v28));
    Object v31 = 1.0D;
    Object v32 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v31).doubleValue()));
    Object v33 = ((com.google.javascript.jscomp.TypedScopeCreator)v30).createInitialScope(((com.google.javascript.rhino.Node)v32));
    Object v34 = ((com.google.javascript.jscomp.Scope)v33).getVars();
    Object v35 = ((com.google.javascript.jscomp.TypedScopeCreator)v22).createScope(((com.google.javascript.rhino.Node)v24),((com.google.javascript.jscomp.Scope)v33));
    Object v36 = ((com.google.javascript.jscomp.TypedScopeCreator)v13).createScope(((com.google.javascript.rhino.Node)v15),((com.google.javascript.jscomp.Scope)v35));
    Object v37 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.Scope)v36));
    org.junit.Assert.assertNotNull(v37);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = 1.0D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    Object v8 = "L";
    Object v9 = java.nio.charset.Charset.defaultCharset();
    Object v10 = new java.io.PrintStream(((java.lang.String)v8),((java.nio.charset.Charset)v9));
    Object v11 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v10));
    Object v12 = ((com.google.javascript.jscomp.AbstractCompiler)v11).getErrorManager();
    Object v13 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v11));
    Object v14 = 1.0D;
    Object v15 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v14).doubleValue()));
    Object v16 = ((com.google.javascript.rhino.Node)v15).toString();
    Object v17 = "L";
    Object v18 = java.nio.charset.Charset.defaultCharset();
    Object v19 = new java.io.PrintStream(((java.lang.String)v17),((java.nio.charset.Charset)v18));
    Object v20 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v19));
    Object v21 = ((com.google.javascript.jscomp.AbstractCompiler)v20).getErrorManager();
    Object v22 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v20));
    Object v23 = 1.0D;
    Object v24 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v23).doubleValue()));
    Object v25 = 1.0D;
    Object v26 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v25).doubleValue()));
    Object v27 = ((com.google.javascript.rhino.Node)v24).checkTreeTypeAwareEqualsSilent(((com.google.javascript.rhino.Node)v26));
    Object v28 = ((com.google.javascript.jscomp.TypedScopeCreator)v22).createInitialScope(((com.google.javascript.rhino.Node)v24));
    Object v29 = ((com.google.javascript.jscomp.TypedScopeCreator)v13).createScope(((com.google.javascript.rhino.Node)v15),((com.google.javascript.jscomp.Scope)v28));
    Object v30 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.Scope)v29));
    org.junit.Assert.assertNotNull(v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v5 = 1.0D;
    Object v6 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v5).doubleValue()));
    Object v7 = 1.0D;
    Object v8 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()));
    Object v9 = ((com.google.javascript.jscomp.CodingConvention)v4).extractClassNameIfProvide(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.Node)v8));
    Object v10 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v4));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = 1.0D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    Object v8 = "L";
    Object v9 = java.nio.charset.Charset.defaultCharset();
    Object v10 = new java.io.PrintStream(((java.lang.String)v8),((java.nio.charset.Charset)v9));
    Object v11 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v10));
    Object v12 = ((com.google.javascript.jscomp.AbstractCompiler)v11).getErrorManager();
    Object v13 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v11));
    Object v14 = 1.0D;
    Object v15 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v14).doubleValue()));
    Object v16 = 1.0D;
    Object v17 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v16).doubleValue()));
    Object v18 = ((com.google.javascript.rhino.Node)v15).checkTreeTypeAwareEqualsSilent(((com.google.javascript.rhino.Node)v17));
    Object v19 = ((com.google.javascript.jscomp.TypedScopeCreator)v13).createInitialScope(((com.google.javascript.rhino.Node)v15));
    Object v20 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.Scope)v19));
    Object v21 = 1.0D;
    Object v22 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v21).doubleValue()));
    Object v23 = 1.0D;
    ((com.google.javascript.rhino.Node)v22).setDouble((((java.lang.Double)v23).doubleValue()));
    Object v24 = null;
    Object v25 = "L";
    Object v26 = java.nio.charset.Charset.defaultCharset();
    Object v27 = new java.io.PrintStream(((java.lang.String)v25),((java.nio.charset.Charset)v26));
    Object v28 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v27));
    Object v29 = ((com.google.javascript.jscomp.AbstractCompiler)v28).getErrorManager();
    Object v30 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v28));
    Object v31 = 1.0D;
    Object v32 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v31).doubleValue()));
    Object v33 = 1.0D;
    Object v34 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v33).doubleValue()));
    Object v35 = ((com.google.javascript.rhino.Node)v32).checkTreeTypeAwareEqualsSilent(((com.google.javascript.rhino.Node)v34));
    Object v36 = ((com.google.javascript.jscomp.TypedScopeCreator)v30).createInitialScope(((com.google.javascript.rhino.Node)v32));
    Object v37 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v22),((com.google.javascript.jscomp.Scope)v36));
    org.junit.Assert.assertNotNull(v37);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = 1.0D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    Object v8 = "L";
    Object v9 = java.nio.charset.Charset.defaultCharset();
    Object v10 = new java.io.PrintStream(((java.lang.String)v8),((java.nio.charset.Charset)v9));
    Object v11 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v10));
    Object v12 = ((com.google.javascript.jscomp.AbstractCompiler)v11).getErrorManager();
    Object v13 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v11));
    Object v14 = 1.0D;
    Object v15 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v14).doubleValue()));
    Object v16 = ((com.google.javascript.rhino.Node)v15).toString();
    Object v17 = "L";
    Object v18 = java.nio.charset.Charset.defaultCharset();
    Object v19 = new java.io.PrintStream(((java.lang.String)v17),((java.nio.charset.Charset)v18));
    Object v20 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v19));
    Object v21 = ((com.google.javascript.jscomp.AbstractCompiler)v20).getErrorManager();
    Object v22 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v20));
    Object v23 = 1.0D;
    Object v24 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v23).doubleValue()));
    Object v25 = 1.0D;
    Object v26 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v25).doubleValue()));
    Object v27 = ((com.google.javascript.rhino.Node)v24).checkTreeTypeAwareEqualsSilent(((com.google.javascript.rhino.Node)v26));
    Object v28 = ((com.google.javascript.jscomp.TypedScopeCreator)v22).createInitialScope(((com.google.javascript.rhino.Node)v24));
    Object v29 = ((com.google.javascript.jscomp.TypedScopeCreator)v13).createScope(((com.google.javascript.rhino.Node)v15),((com.google.javascript.jscomp.Scope)v28));
    Object v30 = ((com.google.javascript.jscomp.Scope)v29).getVars();
    Object v31 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.Scope)v29));
    org.junit.Assert.assertNotNull(v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = 1.0D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    Object v8 = "L";
    Object v9 = java.nio.charset.Charset.defaultCharset();
    Object v10 = new java.io.PrintStream(((java.lang.String)v8),((java.nio.charset.Charset)v9));
    Object v11 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v10));
    Object v12 = ((com.google.javascript.jscomp.AbstractCompiler)v11).getErrorManager();
    Object v13 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v11));
    Object v14 = 1.0D;
    Object v15 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v14).doubleValue()));
    Object v16 = 1.0D;
    Object v17 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v16).doubleValue()));
    Object v18 = ((com.google.javascript.rhino.Node)v15).checkTreeTypeAwareEqualsSilent(((com.google.javascript.rhino.Node)v17));
    Object v19 = ((com.google.javascript.jscomp.TypedScopeCreator)v13).createInitialScope(((com.google.javascript.rhino.Node)v15));
    Object v20 = "";
    Object v21 = ((com.google.javascript.jscomp.Scope)v19).getOwnSlot(((java.lang.String)v20));
    Object v22 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.Scope)v19));
    org.junit.Assert.assertNotNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = 1.0D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    Object v8 = 1.0D;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()));
    Object v10 = ((com.google.javascript.rhino.Node)v7).copyInformationFromForTree(((com.google.javascript.rhino.Node)v9));
    Object v11 = "L";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = ((com.google.javascript.jscomp.AbstractCompiler)v14).getErrorManager();
    Object v16 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v14));
    Object v17 = 1.0D;
    Object v18 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v17).doubleValue()));
    Object v19 = "L";
    Object v20 = java.nio.charset.Charset.defaultCharset();
    Object v21 = new java.io.PrintStream(((java.lang.String)v19),((java.nio.charset.Charset)v20));
    Object v22 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v21));
    Object v23 = ((com.google.javascript.jscomp.AbstractCompiler)v22).getErrorManager();
    Object v24 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v22));
    Object v25 = 1.0D;
    Object v26 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v25).doubleValue()));
    Object v27 = 1.0D;
    Object v28 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v27).doubleValue()));
    Object v29 = ((com.google.javascript.rhino.Node)v26).checkTreeTypeAwareEqualsSilent(((com.google.javascript.rhino.Node)v28));
    Object v30 = ((com.google.javascript.jscomp.TypedScopeCreator)v24).createInitialScope(((com.google.javascript.rhino.Node)v26));
    Object v31 = ((com.google.javascript.jscomp.TypedScopeCreator)v16).createScope(((com.google.javascript.rhino.Node)v18),((com.google.javascript.jscomp.Scope)v30));
    Object v32 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.Scope)v31));
    org.junit.Assert.assertNotNull(v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = 1.0D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    Object v8 = "L";
    Object v9 = java.nio.charset.Charset.defaultCharset();
    Object v10 = new java.io.PrintStream(((java.lang.String)v8),((java.nio.charset.Charset)v9));
    Object v11 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v10));
    Object v12 = ((com.google.javascript.jscomp.AbstractCompiler)v11).getErrorManager();
    Object v13 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v11));
    Object v14 = 1.0D;
    Object v15 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v14).doubleValue()));
    Object v16 = 1.0D;
    Object v17 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v16).doubleValue()));
    Object v18 = ((com.google.javascript.rhino.Node)v15).copyInformationFromForTree(((com.google.javascript.rhino.Node)v17));
    Object v19 = "L";
    Object v20 = java.nio.charset.Charset.defaultCharset();
    Object v21 = new java.io.PrintStream(((java.lang.String)v19),((java.nio.charset.Charset)v20));
    Object v22 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v21));
    Object v23 = ((com.google.javascript.jscomp.AbstractCompiler)v22).getErrorManager();
    Object v24 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v22));
    Object v25 = 1.0D;
    Object v26 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v25).doubleValue()));
    Object v27 = 1.0D;
    Object v28 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v27).doubleValue()));
    Object v29 = ((com.google.javascript.rhino.Node)v26).checkTreeTypeAwareEqualsSilent(((com.google.javascript.rhino.Node)v28));
    Object v30 = ((com.google.javascript.jscomp.TypedScopeCreator)v24).createInitialScope(((com.google.javascript.rhino.Node)v26));
    Object v31 = ((com.google.javascript.jscomp.TypedScopeCreator)v13).createScope(((com.google.javascript.rhino.Node)v15),((com.google.javascript.jscomp.Scope)v30));
    Object v32 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.Scope)v31));
    org.junit.Assert.assertNotNull(v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = 1.0D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    Object v8 = ((com.google.javascript.rhino.Node)v7).getDouble();
    Object v9 = "L";
    Object v10 = java.nio.charset.Charset.defaultCharset();
    Object v11 = new java.io.PrintStream(((java.lang.String)v9),((java.nio.charset.Charset)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v11));
    Object v13 = ((com.google.javascript.jscomp.AbstractCompiler)v12).getErrorManager();
    Object v14 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v15 = 1.0D;
    Object v16 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v15).doubleValue()));
    Object v17 = "L";
    Object v18 = java.nio.charset.Charset.defaultCharset();
    Object v19 = new java.io.PrintStream(((java.lang.String)v17),((java.nio.charset.Charset)v18));
    Object v20 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v19));
    Object v21 = ((com.google.javascript.jscomp.AbstractCompiler)v20).getErrorManager();
    Object v22 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v20));
    Object v23 = 1.0D;
    Object v24 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v23).doubleValue()));
    Object v25 = ((com.google.javascript.jscomp.TypedScopeCreator)v22).createInitialScope(((com.google.javascript.rhino.Node)v24));
    Object v26 = ((com.google.javascript.jscomp.TypedScopeCreator)v14).createScope(((com.google.javascript.rhino.Node)v16),((com.google.javascript.jscomp.Scope)v25));
    Object v27 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.Scope)v26));
    org.junit.Assert.assertNotNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = 1.0D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    Object v8 = 0;
    Object v9 = new java.util.ArrayList((((java.lang.Integer)v8).intValue()));
    Object v10 = new java.util.HashSet(((java.util.Collection)v9));
    ((com.google.javascript.rhino.Node)v7).setDirectives(((java.util.Set)v10));
    Object v11 = null;
    Object v12 = "L";
    Object v13 = java.nio.charset.Charset.defaultCharset();
    Object v14 = new java.io.PrintStream(((java.lang.String)v12),((java.nio.charset.Charset)v13));
    Object v15 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v14));
    Object v16 = ((com.google.javascript.jscomp.AbstractCompiler)v15).getErrorManager();
    Object v17 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v15));
    Object v18 = 1.0D;
    Object v19 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v18).doubleValue()));
    Object v20 = 1.0D;
    Object v21 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v20).doubleValue()));
    Object v22 = ((com.google.javascript.rhino.Node)v19).checkTreeTypeAwareEqualsSilent(((com.google.javascript.rhino.Node)v21));
    Object v23 = ((com.google.javascript.jscomp.TypedScopeCreator)v17).createInitialScope(((com.google.javascript.rhino.Node)v19));
    Object v24 = "";
    Object v25 = ((com.google.javascript.jscomp.Scope)v23).getSlot(((java.lang.String)v24));
    Object v26 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.Scope)v23));
    org.junit.Assert.assertNotNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = 1.0D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    Object v8 = "L";
    Object v9 = java.nio.charset.Charset.defaultCharset();
    Object v10 = new java.io.PrintStream(((java.lang.String)v8),((java.nio.charset.Charset)v9));
    Object v11 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v10));
    Object v12 = ((com.google.javascript.jscomp.AbstractCompiler)v11).getErrorManager();
    Object v13 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v11));
    Object v14 = 1.0D;
    Object v15 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v14).doubleValue()));
    Object v16 = "L";
    Object v17 = java.nio.charset.Charset.defaultCharset();
    Object v18 = new java.io.PrintStream(((java.lang.String)v16),((java.nio.charset.Charset)v17));
    Object v19 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v18));
    Object v20 = ((com.google.javascript.jscomp.AbstractCompiler)v19).getErrorManager();
    Object v21 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v19));
    Object v22 = 1.0D;
    Object v23 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v22).doubleValue()));
    Object v24 = 1.0D;
    Object v25 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v24).doubleValue()));
    Object v26 = ((com.google.javascript.rhino.Node)v23).checkTreeTypeAwareEqualsSilent(((com.google.javascript.rhino.Node)v25));
    Object v27 = ((com.google.javascript.jscomp.TypedScopeCreator)v21).createInitialScope(((com.google.javascript.rhino.Node)v23));
    Object v28 = "";
    Object v29 = ((com.google.javascript.jscomp.Scope)v27).getOwnSlot(((java.lang.String)v28));
    Object v30 = ((com.google.javascript.jscomp.TypedScopeCreator)v13).createScope(((com.google.javascript.rhino.Node)v15),((com.google.javascript.jscomp.Scope)v27));
    Object v31 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.Scope)v30));
    org.junit.Assert.assertNotNull(v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v7 = 1.0D;
    Object v8 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()));
    Object v9 = "L";
    Object v10 = java.nio.charset.Charset.defaultCharset();
    Object v11 = new java.io.PrintStream(((java.lang.String)v9),((java.nio.charset.Charset)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v11));
    Object v13 = ((com.google.javascript.jscomp.AbstractCompiler)v12).getErrorManager();
    Object v14 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v15 = 1.0D;
    Object v16 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v15).doubleValue()));
    Object v17 = ((com.google.javascript.rhino.Node)v16).getDouble();
    Object v18 = "L";
    Object v19 = java.nio.charset.Charset.defaultCharset();
    Object v20 = new java.io.PrintStream(((java.lang.String)v18),((java.nio.charset.Charset)v19));
    Object v21 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v20));
    Object v22 = ((com.google.javascript.jscomp.AbstractCompiler)v21).getErrorManager();
    Object v23 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v21));
    Object v24 = 1.0D;
    Object v25 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v24).doubleValue()));
    Object v26 = "L";
    Object v27 = java.nio.charset.Charset.defaultCharset();
    Object v28 = new java.io.PrintStream(((java.lang.String)v26),((java.nio.charset.Charset)v27));
    Object v29 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v28));
    Object v30 = ((com.google.javascript.jscomp.AbstractCompiler)v29).getErrorManager();
    Object v31 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v29));
    Object v32 = 1.0D;
    Object v33 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v32).doubleValue()));
    Object v34 = ((com.google.javascript.jscomp.TypedScopeCreator)v31).createInitialScope(((com.google.javascript.rhino.Node)v33));
    Object v35 = ((com.google.javascript.jscomp.TypedScopeCreator)v23).createScope(((com.google.javascript.rhino.Node)v25),((com.google.javascript.jscomp.Scope)v34));
    Object v36 = ((com.google.javascript.jscomp.TypedScopeCreator)v14).createScope(((com.google.javascript.rhino.Node)v16),((com.google.javascript.jscomp.Scope)v35));
    Object v37 = ((com.google.javascript.jscomp.Scope)v36).getVarCount();
    Object v38 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v8),((com.google.javascript.jscomp.Scope)v36));
    org.junit.Assert.assertNotNull(v38);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v7 = 1.0D;
    Object v8 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()));
    Object v9 = "L";
    Object v10 = java.nio.charset.Charset.defaultCharset();
    Object v11 = new java.io.PrintStream(((java.lang.String)v9),((java.nio.charset.Charset)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v11));
    Object v13 = ((com.google.javascript.jscomp.AbstractCompiler)v12).getErrorManager();
    Object v14 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v15 = 1.0D;
    Object v16 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v15).doubleValue()));
    Object v17 = "L";
    Object v18 = java.nio.charset.Charset.defaultCharset();
    Object v19 = new java.io.PrintStream(((java.lang.String)v17),((java.nio.charset.Charset)v18));
    Object v20 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v19));
    Object v21 = ((com.google.javascript.jscomp.AbstractCompiler)v20).getErrorManager();
    Object v22 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v20));
    Object v23 = 1.0D;
    Object v24 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v23).doubleValue()));
    Object v25 = 1.0D;
    Object v26 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v25).doubleValue()));
    Object v27 = ((com.google.javascript.rhino.Node)v24).checkTreeTypeAwareEqualsSilent(((com.google.javascript.rhino.Node)v26));
    Object v28 = ((com.google.javascript.jscomp.TypedScopeCreator)v22).createInitialScope(((com.google.javascript.rhino.Node)v24));
    Object v29 = "";
    Object v30 = ((com.google.javascript.jscomp.Scope)v28).getOwnSlot(((java.lang.String)v29));
    Object v31 = ((com.google.javascript.jscomp.TypedScopeCreator)v14).createScope(((com.google.javascript.rhino.Node)v16),((com.google.javascript.jscomp.Scope)v28));
    Object v32 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v8),((com.google.javascript.jscomp.Scope)v31));
    org.junit.Assert.assertNotNull(v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v7 = 1.0D;
    Object v8 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()));
    Object v9 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createInitialScope(((com.google.javascript.rhino.Node)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v7 = 1.0D;
    Object v8 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()));
    Object v9 = 1;
    Object v10 = 9;
    ((com.google.javascript.rhino.Node)v8).putIntProp((((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    Object v12 = "L";
    Object v13 = java.nio.charset.Charset.defaultCharset();
    Object v14 = new java.io.PrintStream(((java.lang.String)v12),((java.nio.charset.Charset)v13));
    Object v15 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v14));
    Object v16 = ((com.google.javascript.jscomp.AbstractCompiler)v15).getErrorManager();
    Object v17 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v15));
    Object v18 = 1.0D;
    Object v19 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v18).doubleValue()));
    Object v20 = false;
    ((com.google.javascript.rhino.Node)v19).setIsSyntheticBlock((((java.lang.Boolean)v20).booleanValue()));
    Object v21 = null;
    Object v22 = "L";
    Object v23 = java.nio.charset.Charset.defaultCharset();
    Object v24 = new java.io.PrintStream(((java.lang.String)v22),((java.nio.charset.Charset)v23));
    Object v25 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v24));
    Object v26 = ((com.google.javascript.jscomp.AbstractCompiler)v25).getErrorManager();
    Object v27 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v25));
    Object v28 = 1.0D;
    Object v29 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v28).doubleValue()));
    Object v30 = ((com.google.javascript.jscomp.TypedScopeCreator)v27).createInitialScope(((com.google.javascript.rhino.Node)v29));
    Object v31 = ((com.google.javascript.jscomp.Scope)v30).getVarCount();
    Object v32 = ((com.google.javascript.jscomp.TypedScopeCreator)v17).createScope(((com.google.javascript.rhino.Node)v19),((com.google.javascript.jscomp.Scope)v30));
    Object v33 = "";
    Object v34 = ((com.google.javascript.jscomp.Scope)v32).getSlot(((java.lang.String)v33));
    Object v35 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v8),((com.google.javascript.jscomp.Scope)v32));
    org.junit.Assert.assertNotNull(v35);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v7 = 1.0D;
    Object v8 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()));
    Object v9 = "L";
    Object v10 = java.nio.charset.Charset.defaultCharset();
    Object v11 = new java.io.PrintStream(((java.lang.String)v9),((java.nio.charset.Charset)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v11));
    Object v13 = ((com.google.javascript.jscomp.AbstractCompiler)v12).getErrorManager();
    Object v14 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v15 = 1.0D;
    Object v16 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v15).doubleValue()));
    Object v17 = 1.0D;
    Object v18 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v17).doubleValue()));
    Object v19 = ((com.google.javascript.rhino.Node)v16).checkTreeTypeAwareEqualsSilent(((com.google.javascript.rhino.Node)v18));
    Object v20 = ((com.google.javascript.jscomp.TypedScopeCreator)v14).createInitialScope(((com.google.javascript.rhino.Node)v16));
    Object v21 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v8),((com.google.javascript.jscomp.Scope)v20));
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v7 = 1.0D;
    Object v8 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()));
    Object v9 = "L";
    Object v10 = java.nio.charset.Charset.defaultCharset();
    Object v11 = new java.io.PrintStream(((java.lang.String)v9),((java.nio.charset.Charset)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v11));
    Object v13 = ((com.google.javascript.jscomp.AbstractCompiler)v12).getErrorManager();
    Object v14 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v15 = 1.0D;
    Object v16 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v15).doubleValue()));
    Object v17 = "L";
    Object v18 = java.nio.charset.Charset.defaultCharset();
    Object v19 = new java.io.PrintStream(((java.lang.String)v17),((java.nio.charset.Charset)v18));
    Object v20 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v19));
    Object v21 = ((com.google.javascript.jscomp.AbstractCompiler)v20).getErrorManager();
    Object v22 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v20));
    Object v23 = 1.0D;
    Object v24 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v23).doubleValue()));
    Object v25 = ((com.google.javascript.jscomp.TypedScopeCreator)v22).createInitialScope(((com.google.javascript.rhino.Node)v24));
    Object v26 = ((com.google.javascript.jscomp.TypedScopeCreator)v14).createScope(((com.google.javascript.rhino.Node)v16),((com.google.javascript.jscomp.Scope)v25));
    Object v27 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v8),((com.google.javascript.jscomp.Scope)v26));
    org.junit.Assert.assertNotNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = 1.0D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    Object v8 = 44;
    ((com.google.javascript.rhino.Node)v7).setType((((java.lang.Integer)v8).intValue()));
    Object v9 = null;
    Object v10 = "L";
    Object v11 = java.nio.charset.Charset.defaultCharset();
    Object v12 = new java.io.PrintStream(((java.lang.String)v10),((java.nio.charset.Charset)v11));
    Object v13 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v12));
    Object v14 = ((com.google.javascript.jscomp.AbstractCompiler)v13).getErrorManager();
    Object v15 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v13));
    Object v16 = 1.0D;
    Object v17 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v16).doubleValue()));
    Object v18 = 1.0D;
    Object v19 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v18).doubleValue()));
    Object v20 = ((com.google.javascript.rhino.Node)v17).copyInformationFromForTree(((com.google.javascript.rhino.Node)v19));
    Object v21 = "L";
    Object v22 = java.nio.charset.Charset.defaultCharset();
    Object v23 = new java.io.PrintStream(((java.lang.String)v21),((java.nio.charset.Charset)v22));
    Object v24 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v23));
    Object v25 = ((com.google.javascript.jscomp.AbstractCompiler)v24).getErrorManager();
    Object v26 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v24));
    Object v27 = 1.0D;
    Object v28 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v27).doubleValue()));
    Object v29 = 1.0D;
    Object v30 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v29).doubleValue()));
    Object v31 = ((com.google.javascript.rhino.Node)v28).checkTreeTypeAwareEqualsSilent(((com.google.javascript.rhino.Node)v30));
    Object v32 = ((com.google.javascript.jscomp.TypedScopeCreator)v26).createInitialScope(((com.google.javascript.rhino.Node)v28));
    Object v33 = ((com.google.javascript.jscomp.TypedScopeCreator)v15).createScope(((com.google.javascript.rhino.Node)v17),((com.google.javascript.jscomp.Scope)v32));
    Object v34 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.Scope)v33));
    org.junit.Assert.assertNotNull(v34);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v7 = 1.0D;
    Object v8 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()));
    Object v9 = 1.0D;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()));
    Object v11 = 1.0D;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()));
    ((com.google.javascript.rhino.Node)v8).addChildAfter(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
    Object v14 = "L";
    Object v15 = java.nio.charset.Charset.defaultCharset();
    Object v16 = new java.io.PrintStream(((java.lang.String)v14),((java.nio.charset.Charset)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v16));
    Object v18 = ((com.google.javascript.jscomp.AbstractCompiler)v17).getErrorManager();
    Object v19 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v20 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v17),((com.google.javascript.jscomp.CodingConvention)v19));
    Object v21 = 1.0D;
    Object v22 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v21).doubleValue()));
    Object v23 = ((com.google.javascript.jscomp.TypedScopeCreator)v20).createInitialScope(((com.google.javascript.rhino.Node)v22));
    Object v24 = ";";
    Object v25 = ((com.google.javascript.jscomp.Scope)v23).getOwnSlot(((java.lang.String)v24));
    Object v26 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v8),((com.google.javascript.jscomp.Scope)v23));
    org.junit.Assert.assertNotNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v7 = 1.0D;
    Object v8 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()));
    Object v9 = "L";
    Object v10 = java.nio.charset.Charset.defaultCharset();
    Object v11 = new java.io.PrintStream(((java.lang.String)v9),((java.nio.charset.Charset)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v11));
    Object v13 = ((com.google.javascript.jscomp.AbstractCompiler)v12).getErrorManager();
    Object v14 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v15 = 1.0D;
    Object v16 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v15).doubleValue()));
    Object v17 = 1;
    ((com.google.javascript.rhino.Node)v16).removeProp((((java.lang.Integer)v17).intValue()));
    Object v18 = null;
    Object v19 = "L";
    Object v20 = java.nio.charset.Charset.defaultCharset();
    Object v21 = new java.io.PrintStream(((java.lang.String)v19),((java.nio.charset.Charset)v20));
    Object v22 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v21));
    Object v23 = ((com.google.javascript.jscomp.AbstractCompiler)v22).getErrorManager();
    Object v24 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v22));
    Object v25 = 1.0D;
    Object v26 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v25).doubleValue()));
    Object v27 = 1.0D;
    Object v28 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v27).doubleValue()));
    Object v29 = ((com.google.javascript.rhino.Node)v26).checkTreeTypeAwareEqualsSilent(((com.google.javascript.rhino.Node)v28));
    Object v30 = ((com.google.javascript.jscomp.TypedScopeCreator)v24).createInitialScope(((com.google.javascript.rhino.Node)v26));
    Object v31 = ((com.google.javascript.jscomp.TypedScopeCreator)v14).createScope(((com.google.javascript.rhino.Node)v16),((com.google.javascript.jscomp.Scope)v30));
    Object v32 = "number";
    Object v33 = ((com.google.javascript.jscomp.Scope)v31).getOwnSlot(((java.lang.String)v32));
    Object v34 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v8),((com.google.javascript.jscomp.Scope)v31));
    org.junit.Assert.assertNotNull(v34);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v7 = 1.0D;
    Object v8 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()));
    Object v9 = "L";
    Object v10 = java.nio.charset.Charset.defaultCharset();
    Object v11 = new java.io.PrintStream(((java.lang.String)v9),((java.nio.charset.Charset)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v11));
    Object v13 = ((com.google.javascript.jscomp.AbstractCompiler)v12).getErrorManager();
    Object v14 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v15 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v12),((com.google.javascript.jscomp.CodingConvention)v14));
    Object v16 = 1.0D;
    Object v17 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v16).doubleValue()));
    Object v18 = ((com.google.javascript.jscomp.TypedScopeCreator)v15).createInitialScope(((com.google.javascript.rhino.Node)v17));
    Object v19 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v8),((com.google.javascript.jscomp.Scope)v18));
    Object v20 = 1.0D;
    Object v21 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v20).doubleValue()));
    ((com.google.javascript.rhino.Node)v21).detachChildren();
    Object v22 = null;
    Object v23 = "L";
    Object v24 = java.nio.charset.Charset.defaultCharset();
    Object v25 = new java.io.PrintStream(((java.lang.String)v23),((java.nio.charset.Charset)v24));
    Object v26 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v25));
    Object v27 = ((com.google.javascript.jscomp.AbstractCompiler)v26).getErrorManager();
    Object v28 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v29 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v26),((com.google.javascript.jscomp.CodingConvention)v28));
    Object v30 = 1.0D;
    Object v31 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v30).doubleValue()));
    Object v32 = ((com.google.javascript.jscomp.TypedScopeCreator)v29).createInitialScope(((com.google.javascript.rhino.Node)v31));
    Object v33 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v21),((com.google.javascript.jscomp.Scope)v32));
    org.junit.Assert.assertNotNull(v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v7 = 1.0D;
    Object v8 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()));
    Object v9 = "L";
    Object v10 = java.nio.charset.Charset.defaultCharset();
    Object v11 = new java.io.PrintStream(((java.lang.String)v9),((java.nio.charset.Charset)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v11));
    Object v13 = ((com.google.javascript.jscomp.AbstractCompiler)v12).getErrorManager();
    Object v14 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v15 = 1.0D;
    Object v16 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v15).doubleValue()));
    Object v17 = 0;
    Object v18 = new java.util.ArrayList((((java.lang.Integer)v17).intValue()));
    Object v19 = new java.util.HashSet(((java.util.Collection)v18));
    ((com.google.javascript.rhino.Node)v16).setDirectives(((java.util.Set)v19));
    Object v20 = null;
    Object v21 = "L";
    Object v22 = java.nio.charset.Charset.defaultCharset();
    Object v23 = new java.io.PrintStream(((java.lang.String)v21),((java.nio.charset.Charset)v22));
    Object v24 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v23));
    Object v25 = ((com.google.javascript.jscomp.AbstractCompiler)v24).getErrorManager();
    Object v26 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v24));
    Object v27 = 1.0D;
    Object v28 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v27).doubleValue()));
    Object v29 = 1.0D;
    Object v30 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v29).doubleValue()));
    Object v31 = ((com.google.javascript.rhino.Node)v28).checkTreeTypeAwareEqualsSilent(((com.google.javascript.rhino.Node)v30));
    Object v32 = ((com.google.javascript.jscomp.TypedScopeCreator)v26).createInitialScope(((com.google.javascript.rhino.Node)v28));
    Object v33 = ((com.google.javascript.jscomp.TypedScopeCreator)v14).createScope(((com.google.javascript.rhino.Node)v16),((com.google.javascript.jscomp.Scope)v32));
    Object v34 = ((com.google.javascript.jscomp.Scope)v33).getVarCount();
    Object v35 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v8),((com.google.javascript.jscomp.Scope)v33));
    org.junit.Assert.assertNotNull(v35);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v7 = 1.0D;
    Object v8 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()));
    Object v9 = 34;
    Object v10 = ((com.google.javascript.rhino.Node)v8).getAncestor((((java.lang.Integer)v9).intValue()));
    Object v11 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createInitialScope(((com.google.javascript.rhino.Node)v8));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v7 = 1.0D;
    Object v8 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()));
    Object v9 = "L";
    Object v10 = java.nio.charset.Charset.defaultCharset();
    Object v11 = new java.io.PrintStream(((java.lang.String)v9),((java.nio.charset.Charset)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v11));
    Object v13 = ((com.google.javascript.jscomp.AbstractCompiler)v12).getErrorManager();
    Object v14 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v15 = 1.0D;
    Object v16 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v15).doubleValue()));
    Object v17 = 1.0D;
    Object v18 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v17).doubleValue()));
    Object v19 = ((com.google.javascript.rhino.Node)v16).copyInformationFromForTree(((com.google.javascript.rhino.Node)v18));
    Object v20 = "L";
    Object v21 = java.nio.charset.Charset.defaultCharset();
    Object v22 = new java.io.PrintStream(((java.lang.String)v20),((java.nio.charset.Charset)v21));
    Object v23 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v22));
    Object v24 = ((com.google.javascript.jscomp.AbstractCompiler)v23).getErrorManager();
    Object v25 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v23));
    Object v26 = 1.0D;
    Object v27 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v26).doubleValue()));
    Object v28 = 1.0D;
    Object v29 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v28).doubleValue()));
    Object v30 = ((com.google.javascript.rhino.Node)v27).checkTreeTypeAwareEqualsSilent(((com.google.javascript.rhino.Node)v29));
    Object v31 = ((com.google.javascript.jscomp.TypedScopeCreator)v25).createInitialScope(((com.google.javascript.rhino.Node)v27));
    Object v32 = ((com.google.javascript.jscomp.TypedScopeCreator)v14).createScope(((com.google.javascript.rhino.Node)v16),((com.google.javascript.jscomp.Scope)v31));
    Object v33 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v8),((com.google.javascript.jscomp.Scope)v32));
    org.junit.Assert.assertNotNull(v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v7 = 1.0D;
    Object v8 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()));
    Object v9 = "L";
    Object v10 = java.nio.charset.Charset.defaultCharset();
    Object v11 = new java.io.PrintStream(((java.lang.String)v9),((java.nio.charset.Charset)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v11));
    Object v13 = ((com.google.javascript.jscomp.AbstractCompiler)v12).getErrorManager();
    Object v14 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v15 = 1.0D;
    Object v16 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v15).doubleValue()));
    Object v17 = "L";
    Object v18 = java.nio.charset.Charset.defaultCharset();
    Object v19 = new java.io.PrintStream(((java.lang.String)v17),((java.nio.charset.Charset)v18));
    Object v20 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v19));
    Object v21 = ((com.google.javascript.jscomp.AbstractCompiler)v20).getErrorManager();
    Object v22 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v20));
    Object v23 = 1.0D;
    Object v24 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v23).doubleValue()));
    Object v25 = ((com.google.javascript.jscomp.TypedScopeCreator)v22).createInitialScope(((com.google.javascript.rhino.Node)v24));
    Object v26 = ((com.google.javascript.jscomp.Scope)v25).getVars();
    Object v27 = ((com.google.javascript.jscomp.TypedScopeCreator)v14).createScope(((com.google.javascript.rhino.Node)v16),((com.google.javascript.jscomp.Scope)v25));
    Object v28 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v8),((com.google.javascript.jscomp.Scope)v27));
    org.junit.Assert.assertNotNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getTopScope();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v7 = 1.0D;
    Object v8 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()));
    Object v9 = "L";
    Object v10 = java.nio.charset.Charset.defaultCharset();
    Object v11 = new java.io.PrintStream(((java.lang.String)v9),((java.nio.charset.Charset)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v11));
    Object v13 = ((com.google.javascript.jscomp.AbstractCompiler)v12).getErrorManager();
    Object v14 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v15 = 1.0D;
    Object v16 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v15).doubleValue()));
    Object v17 = 0;
    Object v18 = new java.util.ArrayList((((java.lang.Integer)v17).intValue()));
    Object v19 = new java.util.HashSet(((java.util.Collection)v18));
    ((com.google.javascript.rhino.Node)v16).setDirectives(((java.util.Set)v19));
    Object v20 = null;
    Object v21 = "L";
    Object v22 = java.nio.charset.Charset.defaultCharset();
    Object v23 = new java.io.PrintStream(((java.lang.String)v21),((java.nio.charset.Charset)v22));
    Object v24 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v23));
    Object v25 = ((com.google.javascript.jscomp.AbstractCompiler)v24).getErrorManager();
    Object v26 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v24));
    Object v27 = 1.0D;
    Object v28 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v27).doubleValue()));
    Object v29 = 1.0D;
    Object v30 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v29).doubleValue()));
    Object v31 = ((com.google.javascript.rhino.Node)v28).checkTreeTypeAwareEqualsSilent(((com.google.javascript.rhino.Node)v30));
    Object v32 = ((com.google.javascript.jscomp.TypedScopeCreator)v26).createInitialScope(((com.google.javascript.rhino.Node)v28));
    Object v33 = ((com.google.javascript.jscomp.TypedScopeCreator)v14).createScope(((com.google.javascript.rhino.Node)v16),((com.google.javascript.jscomp.Scope)v32));
    Object v34 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v8),((com.google.javascript.jscomp.Scope)v33));
    org.junit.Assert.assertNotNull(v34);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v7 = 1.0D;
    Object v8 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()));
    Object v9 = "L";
    Object v10 = java.nio.charset.Charset.defaultCharset();
    Object v11 = new java.io.PrintStream(((java.lang.String)v9),((java.nio.charset.Charset)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v11));
    Object v13 = ((com.google.javascript.jscomp.AbstractCompiler)v12).getErrorManager();
    Object v14 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v15 = 1.0D;
    Object v16 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v15).doubleValue()));
    Object v17 = false;
    ((com.google.javascript.rhino.Node)v16).setIsSyntheticBlock((((java.lang.Boolean)v17).booleanValue()));
    Object v18 = null;
    Object v19 = "L";
    Object v20 = java.nio.charset.Charset.defaultCharset();
    Object v21 = new java.io.PrintStream(((java.lang.String)v19),((java.nio.charset.Charset)v20));
    Object v22 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v21));
    Object v23 = ((com.google.javascript.jscomp.AbstractCompiler)v22).getErrorManager();
    Object v24 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v22));
    Object v25 = 1.0D;
    Object v26 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v25).doubleValue()));
    Object v27 = ((com.google.javascript.jscomp.TypedScopeCreator)v24).createInitialScope(((com.google.javascript.rhino.Node)v26));
    Object v28 = ((com.google.javascript.jscomp.Scope)v27).getVarCount();
    Object v29 = ((com.google.javascript.jscomp.TypedScopeCreator)v14).createScope(((com.google.javascript.rhino.Node)v16),((com.google.javascript.jscomp.Scope)v27));
    Object v30 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v8),((com.google.javascript.jscomp.Scope)v29));
    org.junit.Assert.assertNotNull(v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = 1.0D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    Object v8 = "L";
    Object v9 = java.nio.charset.Charset.defaultCharset();
    Object v10 = new java.io.PrintStream(((java.lang.String)v8),((java.nio.charset.Charset)v9));
    Object v11 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v10));
    Object v12 = ((com.google.javascript.jscomp.AbstractCompiler)v11).getErrorManager();
    Object v13 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v14 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v11),((com.google.javascript.jscomp.CodingConvention)v13));
    Object v15 = 1.0D;
    Object v16 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v15).doubleValue()));
    Object v17 = "L";
    Object v18 = java.nio.charset.Charset.defaultCharset();
    Object v19 = new java.io.PrintStream(((java.lang.String)v17),((java.nio.charset.Charset)v18));
    Object v20 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v19));
    Object v21 = ((com.google.javascript.jscomp.AbstractCompiler)v20).getErrorManager();
    Object v22 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v20));
    Object v23 = 1.0D;
    Object v24 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v23).doubleValue()));
    Object v25 = 1.0D;
    Object v26 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v25).doubleValue()));
    Object v27 = ((com.google.javascript.rhino.Node)v24).checkTreeTypeAwareEqualsSilent(((com.google.javascript.rhino.Node)v26));
    Object v28 = ((com.google.javascript.jscomp.TypedScopeCreator)v22).createInitialScope(((com.google.javascript.rhino.Node)v24));
    Object v29 = ((com.google.javascript.jscomp.TypedScopeCreator)v14).createScope(((com.google.javascript.rhino.Node)v16),((com.google.javascript.jscomp.Scope)v28));
    Object v30 = ((com.google.javascript.jscomp.Scope)v29).getVars();
    Object v31 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.jscomp.Scope)v29));
    org.junit.Assert.assertNotNull(v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v7 = 1.0D;
    Object v8 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()));
    Object v9 = "L";
    Object v10 = java.nio.charset.Charset.defaultCharset();
    Object v11 = new java.io.PrintStream(((java.lang.String)v9),((java.nio.charset.Charset)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v11));
    Object v13 = ((com.google.javascript.jscomp.AbstractCompiler)v12).getErrorManager();
    Object v14 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v15 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v12),((com.google.javascript.jscomp.CodingConvention)v14));
    Object v16 = 1.0D;
    Object v17 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v16).doubleValue()));
    Object v18 = "L";
    Object v19 = java.nio.charset.Charset.defaultCharset();
    Object v20 = new java.io.PrintStream(((java.lang.String)v18),((java.nio.charset.Charset)v19));
    Object v21 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v20));
    Object v22 = ((com.google.javascript.jscomp.AbstractCompiler)v21).getErrorManager();
    Object v23 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v21));
    Object v24 = 1.0D;
    Object v25 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v24).doubleValue()));
    Object v26 = "L";
    Object v27 = java.nio.charset.Charset.defaultCharset();
    Object v28 = new java.io.PrintStream(((java.lang.String)v26),((java.nio.charset.Charset)v27));
    Object v29 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v28));
    Object v30 = ((com.google.javascript.jscomp.AbstractCompiler)v29).getErrorManager();
    Object v31 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v29));
    Object v32 = 1.0D;
    Object v33 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v32).doubleValue()));
    Object v34 = ((com.google.javascript.jscomp.TypedScopeCreator)v31).createInitialScope(((com.google.javascript.rhino.Node)v33));
    Object v35 = ((com.google.javascript.jscomp.Scope)v34).getVars();
    Object v36 = ((com.google.javascript.jscomp.TypedScopeCreator)v23).createScope(((com.google.javascript.rhino.Node)v25),((com.google.javascript.jscomp.Scope)v34));
    Object v37 = ((com.google.javascript.jscomp.TypedScopeCreator)v15).createScope(((com.google.javascript.rhino.Node)v17),((com.google.javascript.jscomp.Scope)v36));
    Object v38 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v8),((com.google.javascript.jscomp.Scope)v37));
    org.junit.Assert.assertNotNull(v38);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v7 = 1.0D;
    Object v8 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()));
    Object v9 = "L";
    Object v10 = java.nio.charset.Charset.defaultCharset();
    Object v11 = new java.io.PrintStream(((java.lang.String)v9),((java.nio.charset.Charset)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v11));
    Object v13 = ((com.google.javascript.jscomp.AbstractCompiler)v12).getErrorManager();
    Object v14 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v15 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v12),((com.google.javascript.jscomp.CodingConvention)v14));
    Object v16 = 1.0D;
    Object v17 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v16).doubleValue()));
    Object v18 = ((com.google.javascript.jscomp.TypedScopeCreator)v15).createInitialScope(((com.google.javascript.rhino.Node)v17));
    Object v19 = ((com.google.javascript.jscomp.Scope)v18).getVars();
    Object v20 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v8),((com.google.javascript.jscomp.Scope)v18));
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v7 = 1.0D;
    Object v8 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()));
    Object v9 = ((com.google.javascript.rhino.Node)v8).toStringTree();
    Object v10 = "L";
    Object v11 = java.nio.charset.Charset.defaultCharset();
    Object v12 = new java.io.PrintStream(((java.lang.String)v10),((java.nio.charset.Charset)v11));
    Object v13 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v12));
    Object v14 = ((com.google.javascript.jscomp.AbstractCompiler)v13).getErrorManager();
    Object v15 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v13));
    Object v16 = 1.0D;
    Object v17 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v16).doubleValue()));
    Object v18 = ((com.google.javascript.rhino.Node)v17).toString();
    Object v19 = "L";
    Object v20 = java.nio.charset.Charset.defaultCharset();
    Object v21 = new java.io.PrintStream(((java.lang.String)v19),((java.nio.charset.Charset)v20));
    Object v22 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v21));
    Object v23 = ((com.google.javascript.jscomp.AbstractCompiler)v22).getErrorManager();
    Object v24 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v22));
    Object v25 = 1.0D;
    Object v26 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v25).doubleValue()));
    Object v27 = "L";
    Object v28 = java.nio.charset.Charset.defaultCharset();
    Object v29 = new java.io.PrintStream(((java.lang.String)v27),((java.nio.charset.Charset)v28));
    Object v30 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v29));
    Object v31 = ((com.google.javascript.jscomp.AbstractCompiler)v30).getErrorManager();
    Object v32 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v30));
    Object v33 = 1.0D;
    Object v34 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v33).doubleValue()));
    Object v35 = ((com.google.javascript.jscomp.TypedScopeCreator)v32).createInitialScope(((com.google.javascript.rhino.Node)v34));
    Object v36 = ((com.google.javascript.jscomp.Scope)v35).getVars();
    Object v37 = ((com.google.javascript.jscomp.TypedScopeCreator)v24).createScope(((com.google.javascript.rhino.Node)v26),((com.google.javascript.jscomp.Scope)v35));
    Object v38 = ((com.google.javascript.jscomp.TypedScopeCreator)v15).createScope(((com.google.javascript.rhino.Node)v17),((com.google.javascript.jscomp.Scope)v37));
    Object v39 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v8),((com.google.javascript.jscomp.Scope)v38));
    org.junit.Assert.assertNotNull(v39);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v7 = 1.0D;
    Object v8 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()));
    Object v9 = "L";
    Object v10 = java.nio.charset.Charset.defaultCharset();
    Object v11 = new java.io.PrintStream(((java.lang.String)v9),((java.nio.charset.Charset)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v11));
    Object v13 = ((com.google.javascript.jscomp.AbstractCompiler)v12).getErrorManager();
    Object v14 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v15 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v12),((com.google.javascript.jscomp.CodingConvention)v14));
    Object v16 = 1.0D;
    Object v17 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v16).doubleValue()));
    Object v18 = 1.0D;
    Object v19 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v18).doubleValue()));
    Object v20 = 1.0D;
    Object v21 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v20).doubleValue()));
    ((com.google.javascript.rhino.Node)v17).addChildAfter(((com.google.javascript.rhino.Node)v19),((com.google.javascript.rhino.Node)v21));
    Object v22 = null;
    Object v23 = "L";
    Object v24 = java.nio.charset.Charset.defaultCharset();
    Object v25 = new java.io.PrintStream(((java.lang.String)v23),((java.nio.charset.Charset)v24));
    Object v26 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v25));
    Object v27 = ((com.google.javascript.jscomp.AbstractCompiler)v26).getErrorManager();
    Object v28 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v29 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v26),((com.google.javascript.jscomp.CodingConvention)v28));
    Object v30 = 1.0D;
    Object v31 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v30).doubleValue()));
    Object v32 = ((com.google.javascript.jscomp.TypedScopeCreator)v29).createInitialScope(((com.google.javascript.rhino.Node)v31));
    Object v33 = ";";
    Object v34 = ((com.google.javascript.jscomp.Scope)v32).getOwnSlot(((java.lang.String)v33));
    Object v35 = ((com.google.javascript.jscomp.TypedScopeCreator)v15).createScope(((com.google.javascript.rhino.Node)v17),((com.google.javascript.jscomp.Scope)v32));
    Object v36 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v8),((com.google.javascript.jscomp.Scope)v35));
    org.junit.Assert.assertNotNull(v36);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v7 = 1.0D;
    Object v8 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()));
    Object v9 = "L";
    Object v10 = java.nio.charset.Charset.defaultCharset();
    Object v11 = new java.io.PrintStream(((java.lang.String)v9),((java.nio.charset.Charset)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v11));
    Object v13 = ((com.google.javascript.jscomp.AbstractCompiler)v12).getErrorManager();
    Object v14 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v15 = 1.0D;
    Object v16 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v15).doubleValue()));
    Object v17 = 1;
    ((com.google.javascript.rhino.Node)v16).removeProp((((java.lang.Integer)v17).intValue()));
    Object v18 = null;
    Object v19 = "L";
    Object v20 = java.nio.charset.Charset.defaultCharset();
    Object v21 = new java.io.PrintStream(((java.lang.String)v19),((java.nio.charset.Charset)v20));
    Object v22 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v21));
    Object v23 = ((com.google.javascript.jscomp.AbstractCompiler)v22).getErrorManager();
    Object v24 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v22));
    Object v25 = 1.0D;
    Object v26 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v25).doubleValue()));
    Object v27 = 1.0D;
    Object v28 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v27).doubleValue()));
    Object v29 = ((com.google.javascript.rhino.Node)v26).checkTreeTypeAwareEqualsSilent(((com.google.javascript.rhino.Node)v28));
    Object v30 = ((com.google.javascript.jscomp.TypedScopeCreator)v24).createInitialScope(((com.google.javascript.rhino.Node)v26));
    Object v31 = ((com.google.javascript.jscomp.TypedScopeCreator)v14).createScope(((com.google.javascript.rhino.Node)v16),((com.google.javascript.jscomp.Scope)v30));
    Object v32 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v8),((com.google.javascript.jscomp.Scope)v31));
    org.junit.Assert.assertNotNull(v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v7 = 1.0D;
    Object v8 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()));
    Object v9 = "L";
    Object v10 = java.nio.charset.Charset.defaultCharset();
    Object v11 = new java.io.PrintStream(((java.lang.String)v9),((java.nio.charset.Charset)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v11));
    Object v13 = ((com.google.javascript.jscomp.AbstractCompiler)v12).getErrorManager();
    Object v14 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v15 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v12),((com.google.javascript.jscomp.CodingConvention)v14));
    Object v16 = 1.0D;
    Object v17 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v16).doubleValue()));
    Object v18 = ((com.google.javascript.jscomp.TypedScopeCreator)v15).createInitialScope(((com.google.javascript.rhino.Node)v17));
    Object v19 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v8),((com.google.javascript.jscomp.Scope)v18));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v7 = 1.0D;
    Object v8 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()));
    Object v9 = "L";
    Object v10 = java.nio.charset.Charset.defaultCharset();
    Object v11 = new java.io.PrintStream(((java.lang.String)v9),((java.nio.charset.Charset)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v11));
    Object v13 = ((com.google.javascript.jscomp.AbstractCompiler)v12).getErrorManager();
    Object v14 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v15 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v12),((com.google.javascript.jscomp.CodingConvention)v14));
    Object v16 = 1.0D;
    Object v17 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v16).doubleValue()));
    Object v18 = "L";
    Object v19 = java.nio.charset.Charset.defaultCharset();
    Object v20 = new java.io.PrintStream(((java.lang.String)v18),((java.nio.charset.Charset)v19));
    Object v21 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v20));
    Object v22 = ((com.google.javascript.jscomp.AbstractCompiler)v21).getErrorManager();
    Object v23 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v21));
    Object v24 = 1.0D;
    Object v25 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v24).doubleValue()));
    Object v26 = "L";
    Object v27 = java.nio.charset.Charset.defaultCharset();
    Object v28 = new java.io.PrintStream(((java.lang.String)v26),((java.nio.charset.Charset)v27));
    Object v29 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v28));
    Object v30 = ((com.google.javascript.jscomp.AbstractCompiler)v29).getErrorManager();
    Object v31 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v29));
    Object v32 = 1.0D;
    Object v33 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v32).doubleValue()));
    Object v34 = ((com.google.javascript.jscomp.TypedScopeCreator)v31).createInitialScope(((com.google.javascript.rhino.Node)v33));
    Object v35 = ((com.google.javascript.jscomp.TypedScopeCreator)v23).createScope(((com.google.javascript.rhino.Node)v25),((com.google.javascript.jscomp.Scope)v34));
    Object v36 = ((com.google.javascript.jscomp.TypedScopeCreator)v15).createScope(((com.google.javascript.rhino.Node)v17),((com.google.javascript.jscomp.Scope)v35));
    Object v37 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v8),((com.google.javascript.jscomp.Scope)v36));
    org.junit.Assert.assertNotNull(v37);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v7 = 1.0D;
    Object v8 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()));
    Object v9 = "L";
    Object v10 = java.nio.charset.Charset.defaultCharset();
    Object v11 = new java.io.PrintStream(((java.lang.String)v9),((java.nio.charset.Charset)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v11));
    Object v13 = ((com.google.javascript.jscomp.AbstractCompiler)v12).getErrorManager();
    Object v14 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v15 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v12),((com.google.javascript.jscomp.CodingConvention)v14));
    Object v16 = 1.0D;
    Object v17 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v16).doubleValue()));
    Object v18 = "L";
    Object v19 = java.nio.charset.Charset.defaultCharset();
    Object v20 = new java.io.PrintStream(((java.lang.String)v18),((java.nio.charset.Charset)v19));
    Object v21 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v20));
    Object v22 = ((com.google.javascript.jscomp.AbstractCompiler)v21).getErrorManager();
    Object v23 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v21));
    Object v24 = 1.0D;
    Object v25 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v24).doubleValue()));
    Object v26 = "L";
    Object v27 = java.nio.charset.Charset.defaultCharset();
    Object v28 = new java.io.PrintStream(((java.lang.String)v26),((java.nio.charset.Charset)v27));
    Object v29 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v28));
    Object v30 = ((com.google.javascript.jscomp.AbstractCompiler)v29).getErrorManager();
    Object v31 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v29));
    Object v32 = 1.0D;
    Object v33 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v32).doubleValue()));
    Object v34 = ((com.google.javascript.jscomp.TypedScopeCreator)v31).createInitialScope(((com.google.javascript.rhino.Node)v33));
    Object v35 = ((com.google.javascript.jscomp.TypedScopeCreator)v23).createScope(((com.google.javascript.rhino.Node)v25),((com.google.javascript.jscomp.Scope)v34));
    Object v36 = ((com.google.javascript.jscomp.TypedScopeCreator)v15).createScope(((com.google.javascript.rhino.Node)v17),((com.google.javascript.jscomp.Scope)v35));
    Object v37 = "";
    Object v38 = ((com.google.javascript.jscomp.Scope)v36).getSlot(((java.lang.String)v37));
    Object v39 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v8),((com.google.javascript.jscomp.Scope)v36));
    org.junit.Assert.assertNotNull(v39);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v7 = 1.0D;
    Object v8 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()));
    Object v9 = "L";
    Object v10 = java.nio.charset.Charset.defaultCharset();
    Object v11 = new java.io.PrintStream(((java.lang.String)v9),((java.nio.charset.Charset)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v11));
    Object v13 = ((com.google.javascript.jscomp.AbstractCompiler)v12).getErrorManager();
    Object v14 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v15 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v12),((com.google.javascript.jscomp.CodingConvention)v14));
    Object v16 = 1.0D;
    Object v17 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v16).doubleValue()));
    Object v18 = "L";
    Object v19 = java.nio.charset.Charset.defaultCharset();
    Object v20 = new java.io.PrintStream(((java.lang.String)v18),((java.nio.charset.Charset)v19));
    Object v21 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v20));
    Object v22 = ((com.google.javascript.jscomp.AbstractCompiler)v21).getErrorManager();
    Object v23 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v24 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v21),((com.google.javascript.jscomp.CodingConvention)v23));
    Object v25 = 1.0D;
    Object v26 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v25).doubleValue()));
    Object v27 = ((com.google.javascript.jscomp.TypedScopeCreator)v24).createInitialScope(((com.google.javascript.rhino.Node)v26));
    Object v28 = ((com.google.javascript.jscomp.TypedScopeCreator)v15).createScope(((com.google.javascript.rhino.Node)v17),((com.google.javascript.jscomp.Scope)v27));
    Object v29 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v8),((com.google.javascript.jscomp.Scope)v28));
    org.junit.Assert.assertNotNull(v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v7 = 1.0D;
    Object v8 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()));
    Object v9 = "L";
    Object v10 = java.nio.charset.Charset.defaultCharset();
    Object v11 = new java.io.PrintStream(((java.lang.String)v9),((java.nio.charset.Charset)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v11));
    Object v13 = ((com.google.javascript.jscomp.AbstractCompiler)v12).getErrorManager();
    Object v14 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v15 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v12),((com.google.javascript.jscomp.CodingConvention)v14));
    Object v16 = 1.0D;
    Object v17 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v16).doubleValue()));
    Object v18 = 34;
    Object v19 = ((com.google.javascript.rhino.Node)v17).getAncestor((((java.lang.Integer)v18).intValue()));
    Object v20 = ((com.google.javascript.jscomp.TypedScopeCreator)v15).createInitialScope(((com.google.javascript.rhino.Node)v17));
    Object v21 = "";
    Object v22 = ((com.google.javascript.jscomp.Scope)v20).getSlot(((java.lang.String)v21));
    Object v23 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v8),((com.google.javascript.jscomp.Scope)v20));
    org.junit.Assert.assertNotNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v7 = 1.0D;
    Object v8 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()));
    Object v9 = "L";
    Object v10 = java.nio.charset.Charset.defaultCharset();
    Object v11 = new java.io.PrintStream(((java.lang.String)v9),((java.nio.charset.Charset)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v11));
    Object v13 = ((com.google.javascript.jscomp.AbstractCompiler)v12).getErrorManager();
    Object v14 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v15 = 1.0D;
    Object v16 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v15).doubleValue()));
    Object v17 = "L";
    Object v18 = java.nio.charset.Charset.defaultCharset();
    Object v19 = new java.io.PrintStream(((java.lang.String)v17),((java.nio.charset.Charset)v18));
    Object v20 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v19));
    Object v21 = ((com.google.javascript.jscomp.AbstractCompiler)v20).getErrorManager();
    Object v22 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v20));
    Object v23 = 1.0D;
    Object v24 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v23).doubleValue()));
    Object v25 = "L";
    Object v26 = java.nio.charset.Charset.defaultCharset();
    Object v27 = new java.io.PrintStream(((java.lang.String)v25),((java.nio.charset.Charset)v26));
    Object v28 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v27));
    Object v29 = ((com.google.javascript.jscomp.AbstractCompiler)v28).getErrorManager();
    Object v30 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v28));
    Object v31 = 1.0D;
    Object v32 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v31).doubleValue()));
    Object v33 = ((com.google.javascript.jscomp.TypedScopeCreator)v30).createInitialScope(((com.google.javascript.rhino.Node)v32));
    Object v34 = ((com.google.javascript.jscomp.Scope)v33).getVars();
    Object v35 = ((com.google.javascript.jscomp.TypedScopeCreator)v22).createScope(((com.google.javascript.rhino.Node)v24),((com.google.javascript.jscomp.Scope)v33));
    Object v36 = ((com.google.javascript.jscomp.Scope)v35).getVars();
    Object v37 = ((com.google.javascript.jscomp.TypedScopeCreator)v14).createScope(((com.google.javascript.rhino.Node)v16),((com.google.javascript.jscomp.Scope)v35));
    Object v38 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v8),((com.google.javascript.jscomp.Scope)v37));
    org.junit.Assert.assertNotNull(v38);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v7 = 1.0D;
    Object v8 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()));
    Object v9 = "L";
    Object v10 = java.nio.charset.Charset.defaultCharset();
    Object v11 = new java.io.PrintStream(((java.lang.String)v9),((java.nio.charset.Charset)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v11));
    Object v13 = ((com.google.javascript.jscomp.AbstractCompiler)v12).getErrorManager();
    Object v14 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v15 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v12),((com.google.javascript.jscomp.CodingConvention)v14));
    Object v16 = 1.0D;
    Object v17 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v16).doubleValue()));
    Object v18 = "L";
    Object v19 = java.nio.charset.Charset.defaultCharset();
    Object v20 = new java.io.PrintStream(((java.lang.String)v18),((java.nio.charset.Charset)v19));
    Object v21 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v20));
    Object v22 = ((com.google.javascript.jscomp.AbstractCompiler)v21).getErrorManager();
    Object v23 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v21));
    Object v24 = 1.0D;
    Object v25 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v24).doubleValue()));
    Object v26 = 1.0D;
    Object v27 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v26).doubleValue()));
    Object v28 = ((com.google.javascript.rhino.Node)v25).checkTreeTypeAwareEqualsSilent(((com.google.javascript.rhino.Node)v27));
    Object v29 = ((com.google.javascript.jscomp.TypedScopeCreator)v23).createInitialScope(((com.google.javascript.rhino.Node)v25));
    Object v30 = ((com.google.javascript.jscomp.TypedScopeCreator)v15).createScope(((com.google.javascript.rhino.Node)v17),((com.google.javascript.jscomp.Scope)v29));
    Object v31 = "";
    Object v32 = true;
    Object v33 = ((com.google.javascript.jscomp.Scope)v30).isDeclared(((java.lang.String)v31),(((java.lang.Boolean)v32).booleanValue()));
    Object v34 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v8),((com.google.javascript.jscomp.Scope)v30));
    org.junit.Assert.assertNotNull(v34);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v7 = 1.0D;
    Object v8 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()));
    Object v9 = "L";
    Object v10 = java.nio.charset.Charset.defaultCharset();
    Object v11 = new java.io.PrintStream(((java.lang.String)v9),((java.nio.charset.Charset)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v11));
    Object v13 = ((com.google.javascript.jscomp.AbstractCompiler)v12).getErrorManager();
    Object v14 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v15 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v12),((com.google.javascript.jscomp.CodingConvention)v14));
    Object v16 = 1.0D;
    Object v17 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v16).doubleValue()));
    Object v18 = "L";
    Object v19 = java.nio.charset.Charset.defaultCharset();
    Object v20 = new java.io.PrintStream(((java.lang.String)v18),((java.nio.charset.Charset)v19));
    Object v21 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v20));
    Object v22 = ((com.google.javascript.jscomp.AbstractCompiler)v21).getErrorManager();
    Object v23 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v24 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v21),((com.google.javascript.jscomp.CodingConvention)v23));
    Object v25 = 1.0D;
    Object v26 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v25).doubleValue()));
    Object v27 = ((com.google.javascript.jscomp.TypedScopeCreator)v24).createInitialScope(((com.google.javascript.rhino.Node)v26));
    Object v28 = ((com.google.javascript.jscomp.Scope)v27).getVars();
    Object v29 = ((com.google.javascript.jscomp.TypedScopeCreator)v15).createScope(((com.google.javascript.rhino.Node)v17),((com.google.javascript.jscomp.Scope)v27));
    Object v30 = "string";
    Object v31 = ((com.google.javascript.jscomp.Scope)v29).getSlot(((java.lang.String)v30));
    Object v32 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v8),((com.google.javascript.jscomp.Scope)v29));
    org.junit.Assert.assertNotNull(v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v7 = 1.0D;
    Object v8 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()));
    Object v9 = "L";
    Object v10 = java.nio.charset.Charset.defaultCharset();
    Object v11 = new java.io.PrintStream(((java.lang.String)v9),((java.nio.charset.Charset)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v11));
    Object v13 = ((com.google.javascript.jscomp.AbstractCompiler)v12).getErrorManager();
    Object v14 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v15 = 1.0D;
    Object v16 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v15).doubleValue()));
    Object v17 = "L";
    Object v18 = java.nio.charset.Charset.defaultCharset();
    Object v19 = new java.io.PrintStream(((java.lang.String)v17),((java.nio.charset.Charset)v18));
    Object v20 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v19));
    Object v21 = ((com.google.javascript.jscomp.AbstractCompiler)v20).getErrorManager();
    Object v22 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v20));
    Object v23 = 1.0D;
    Object v24 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v23).doubleValue()));
    Object v25 = 1.0D;
    Object v26 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v25).doubleValue()));
    Object v27 = ((com.google.javascript.rhino.Node)v24).checkTreeTypeAwareEqualsSilent(((com.google.javascript.rhino.Node)v26));
    Object v28 = ((com.google.javascript.jscomp.TypedScopeCreator)v22).createInitialScope(((com.google.javascript.rhino.Node)v24));
    Object v29 = ((com.google.javascript.jscomp.TypedScopeCreator)v14).createScope(((com.google.javascript.rhino.Node)v16),((com.google.javascript.jscomp.Scope)v28));
    Object v30 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v8),((com.google.javascript.jscomp.Scope)v29));
    org.junit.Assert.assertNotNull(v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v7 = 1.0D;
    Object v8 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()));
    Object v9 = true;
    Object v10 = true;
    Object v11 = true;
    Object v12 = ((com.google.javascript.rhino.Node)v8).toString((((java.lang.Boolean)v9).booleanValue()),(((java.lang.Boolean)v10).booleanValue()),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = "L";
    Object v14 = java.nio.charset.Charset.defaultCharset();
    Object v15 = new java.io.PrintStream(((java.lang.String)v13),((java.nio.charset.Charset)v14));
    Object v16 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v15));
    Object v17 = ((com.google.javascript.jscomp.AbstractCompiler)v16).getErrorManager();
    Object v18 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v16));
    Object v19 = 1.0D;
    Object v20 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v19).doubleValue()));
    Object v21 = "L";
    Object v22 = java.nio.charset.Charset.defaultCharset();
    Object v23 = new java.io.PrintStream(((java.lang.String)v21),((java.nio.charset.Charset)v22));
    Object v24 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v23));
    Object v25 = ((com.google.javascript.jscomp.AbstractCompiler)v24).getErrorManager();
    Object v26 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v24));
    Object v27 = 1.0D;
    Object v28 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v27).doubleValue()));
    Object v29 = ((com.google.javascript.jscomp.TypedScopeCreator)v26).createInitialScope(((com.google.javascript.rhino.Node)v28));
    Object v30 = ((com.google.javascript.jscomp.Scope)v29).getVars();
    Object v31 = ((com.google.javascript.jscomp.TypedScopeCreator)v18).createScope(((com.google.javascript.rhino.Node)v20),((com.google.javascript.jscomp.Scope)v29));
    Object v32 = "";
    Object v33 = ((com.google.javascript.jscomp.Scope)v31).getSlot(((java.lang.String)v32));
    Object v34 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v8),((com.google.javascript.jscomp.Scope)v31));
    org.junit.Assert.assertNotNull(v34);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v7 = 1.0D;
    Object v8 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()));
    Object v9 = ((com.google.javascript.rhino.Node)v8).getQualifiedName();
    Object v10 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createInitialScope(((com.google.javascript.rhino.Node)v8));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v7 = 1.0D;
    Object v8 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()));
    Object v9 = "L";
    Object v10 = java.nio.charset.Charset.defaultCharset();
    Object v11 = new java.io.PrintStream(((java.lang.String)v9),((java.nio.charset.Charset)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v11));
    Object v13 = ((com.google.javascript.jscomp.AbstractCompiler)v12).getErrorManager();
    Object v14 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v15 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v12),((com.google.javascript.jscomp.CodingConvention)v14));
    Object v16 = 1.0D;
    Object v17 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v16).doubleValue()));
    Object v18 = ((com.google.javascript.rhino.Node)v17).getQualifiedName();
    Object v19 = ((com.google.javascript.jscomp.TypedScopeCreator)v15).createInitialScope(((com.google.javascript.rhino.Node)v17));
    Object v20 = "Q";
    Object v21 = ((com.google.javascript.jscomp.Scope)v19).getSlot(((java.lang.String)v20));
    Object v22 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v8),((com.google.javascript.jscomp.Scope)v19));
    org.junit.Assert.assertNotNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v7 = 1.0D;
    Object v8 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()));
    Object v9 = "L";
    Object v10 = java.nio.charset.Charset.defaultCharset();
    Object v11 = new java.io.PrintStream(((java.lang.String)v9),((java.nio.charset.Charset)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v11));
    Object v13 = ((com.google.javascript.jscomp.AbstractCompiler)v12).getErrorManager();
    Object v14 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v15 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v12),((com.google.javascript.jscomp.CodingConvention)v14));
    Object v16 = 1.0D;
    Object v17 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v16).doubleValue()));
    Object v18 = "L";
    Object v19 = java.nio.charset.Charset.defaultCharset();
    Object v20 = new java.io.PrintStream(((java.lang.String)v18),((java.nio.charset.Charset)v19));
    Object v21 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v20));
    Object v22 = ((com.google.javascript.jscomp.AbstractCompiler)v21).getErrorManager();
    Object v23 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v24 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v21),((com.google.javascript.jscomp.CodingConvention)v23));
    Object v25 = 1.0D;
    Object v26 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v25).doubleValue()));
    Object v27 = ((com.google.javascript.jscomp.TypedScopeCreator)v24).createInitialScope(((com.google.javascript.rhino.Node)v26));
    Object v28 = ((com.google.javascript.jscomp.Scope)v27).getVars();
    Object v29 = ((com.google.javascript.jscomp.TypedScopeCreator)v15).createScope(((com.google.javascript.rhino.Node)v17),((com.google.javascript.jscomp.Scope)v27));
    Object v30 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v8),((com.google.javascript.jscomp.Scope)v29));
    org.junit.Assert.assertNotNull(v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v7 = 1.0D;
    Object v8 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()));
    Object v9 = "L";
    Object v10 = java.nio.charset.Charset.defaultCharset();
    Object v11 = new java.io.PrintStream(((java.lang.String)v9),((java.nio.charset.Charset)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v11));
    Object v13 = ((com.google.javascript.jscomp.AbstractCompiler)v12).getErrorManager();
    Object v14 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v12));
    Object v15 = 1.0D;
    Object v16 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v15).doubleValue()));
    Object v17 = "L";
    Object v18 = java.nio.charset.Charset.defaultCharset();
    Object v19 = new java.io.PrintStream(((java.lang.String)v17),((java.nio.charset.Charset)v18));
    Object v20 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v19));
    Object v21 = ((com.google.javascript.jscomp.AbstractCompiler)v20).getErrorManager();
    Object v22 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v20));
    Object v23 = 1.0D;
    Object v24 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v23).doubleValue()));
    Object v25 = ((com.google.javascript.jscomp.TypedScopeCreator)v22).createInitialScope(((com.google.javascript.rhino.Node)v24));
    Object v26 = "protot6pe";
    Object v27 = ((com.google.javascript.jscomp.Scope)v25).getOwnSlot(((java.lang.String)v26));
    Object v28 = ((com.google.javascript.jscomp.TypedScopeCreator)v14).createScope(((com.google.javascript.rhino.Node)v16),((com.google.javascript.jscomp.Scope)v25));
    Object v29 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v8),((com.google.javascript.jscomp.Scope)v28));
    org.junit.Assert.assertNotNull(v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v7 = 1.0D;
    Object v8 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()));
    Object v9 = ((com.google.javascript.rhino.Node)v8).toString();
    Object v10 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createInitialScope(((com.google.javascript.rhino.Node)v8));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v7 = 1.0D;
    Object v8 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()));
    Object v9 = "L";
    Object v10 = java.nio.charset.Charset.defaultCharset();
    Object v11 = new java.io.PrintStream(((java.lang.String)v9),((java.nio.charset.Charset)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v11));
    Object v13 = ((com.google.javascript.jscomp.AbstractCompiler)v12).getErrorManager();
    Object v14 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v15 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v12),((com.google.javascript.jscomp.CodingConvention)v14));
    Object v16 = 1.0D;
    Object v17 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v16).doubleValue()));
    Object v18 = ((com.google.javascript.rhino.Node)v17).getQualifiedName();
    Object v19 = ((com.google.javascript.jscomp.TypedScopeCreator)v15).createInitialScope(((com.google.javascript.rhino.Node)v17));
    Object v20 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v8),((com.google.javascript.jscomp.Scope)v19));
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v7 = 1.0D;
    Object v8 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()));
    Object v9 = "L";
    Object v10 = java.nio.charset.Charset.defaultCharset();
    Object v11 = new java.io.PrintStream(((java.lang.String)v9),((java.nio.charset.Charset)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v11));
    Object v13 = ((com.google.javascript.jscomp.AbstractCompiler)v12).getErrorManager();
    Object v14 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v15 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v12),((com.google.javascript.jscomp.CodingConvention)v14));
    Object v16 = 1.0D;
    Object v17 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v16).doubleValue()));
    Object v18 = ((com.google.javascript.rhino.Node)v17).getQualifiedName();
    Object v19 = ((com.google.javascript.jscomp.TypedScopeCreator)v15).createInitialScope(((com.google.javascript.rhino.Node)v17));
    Object v20 = "^";
    Object v21 = true;
    Object v22 = ((com.google.javascript.jscomp.Scope)v19).isDeclared(((java.lang.String)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v8),((com.google.javascript.jscomp.Scope)v19));
    org.junit.Assert.assertNotNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v7 = 1.0D;
    Object v8 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()));
    Object v9 = "L";
    Object v10 = java.nio.charset.Charset.defaultCharset();
    Object v11 = new java.io.PrintStream(((java.lang.String)v9),((java.nio.charset.Charset)v10));
    Object v12 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v11));
    Object v13 = ((com.google.javascript.jscomp.AbstractCompiler)v12).getErrorManager();
    Object v14 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v15 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v12),((com.google.javascript.jscomp.CodingConvention)v14));
    Object v16 = 1.0D;
    Object v17 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v16).doubleValue()));
    Object v18 = "L";
    Object v19 = java.nio.charset.Charset.defaultCharset();
    Object v20 = new java.io.PrintStream(((java.lang.String)v18),((java.nio.charset.Charset)v19));
    Object v21 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v20));
    Object v22 = ((com.google.javascript.jscomp.AbstractCompiler)v21).getErrorManager();
    Object v23 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v21));
    Object v24 = 1.0D;
    Object v25 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v24).doubleValue()));
    Object v26 = "L";
    Object v27 = java.nio.charset.Charset.defaultCharset();
    Object v28 = new java.io.PrintStream(((java.lang.String)v26),((java.nio.charset.Charset)v27));
    Object v29 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v28));
    Object v30 = ((com.google.javascript.jscomp.AbstractCompiler)v29).getErrorManager();
    Object v31 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v29));
    Object v32 = 1.0D;
    Object v33 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v32).doubleValue()));
    Object v34 = ((com.google.javascript.jscomp.TypedScopeCreator)v31).createInitialScope(((com.google.javascript.rhino.Node)v33));
    Object v35 = "protot6pe";
    Object v36 = ((com.google.javascript.jscomp.Scope)v34).getOwnSlot(((java.lang.String)v35));
    Object v37 = ((com.google.javascript.jscomp.TypedScopeCreator)v23).createScope(((com.google.javascript.rhino.Node)v25),((com.google.javascript.jscomp.Scope)v34));
    Object v38 = ((com.google.javascript.jscomp.TypedScopeCreator)v15).createScope(((com.google.javascript.rhino.Node)v17),((com.google.javascript.jscomp.Scope)v37));
    Object v39 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v8),((com.google.javascript.jscomp.Scope)v38));
    org.junit.Assert.assertNotNull(v39);
  }
}
