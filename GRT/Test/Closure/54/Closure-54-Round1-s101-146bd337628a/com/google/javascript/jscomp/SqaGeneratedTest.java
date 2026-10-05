package com.google.javascript.jscomp;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = "undefineL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = "undefineL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v5 = "T";
    Object v6 = ((com.google.javascript.jscomp.CodingConvention)v4).isValidEnumKey(((java.lang.String)v5));
    Object v7 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v4));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = -15;
    Object v2 = "C";
    Object v3 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v1).intValue()),((java.lang.String)v2));
    Object v4 = ((com.google.javascript.jscomp.TypedScopeCreator)v0).createInitialScope(((com.google.javascript.rhino.Node)v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = "undefineL";
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
  public void test4() throws Throwable {
    try {
    Object v0 = "undefineL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v4));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = -15;
    Object v2 = "C";
    Object v3 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v1).intValue()),((java.lang.String)v2));
    Object v4 = ((com.google.javascript.rhino.Node)v3).wasEmptyNode();
    Object v5 = -15;
    Object v6 = "C";
    Object v7 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v5).intValue()),((java.lang.String)v6));
    Object v8 = null;
    Object v9 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.jstype.ObjectType)v8));
    Object v10 = ((com.google.javascript.jscomp.TypedScopeCreator)v0).createScope(((com.google.javascript.rhino.Node)v3),((com.google.javascript.jscomp.Scope)v9));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = -15;
    Object v2 = "C";
    Object v3 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v1).intValue()),((java.lang.String)v2));
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.jstype.ObjectType)v4));
    Object v6 = -15;
    Object v7 = "C";
    Object v8 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7));
    ((com.google.javascript.jscomp.TypedScopeCreator)v0).patchGlobalScope(((com.google.javascript.jscomp.Scope)v5),((com.google.javascript.rhino.Node)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = "undefineL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = "i";
    Object v7 = false;
    Object v8 = ((com.google.javascript.jscomp.CodingConvention)v5).isExported(((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = "undefineL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = "i";
    Object v7 = false;
    Object v8 = ((com.google.javascript.jscomp.CodingConvention)v5).isExported(((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v10 = -15;
    Object v11 = "C";
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    Object v13 = -15;
    Object v14 = "C";
    Object v15 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v13).intValue()),((java.lang.String)v14));
    Object v16 = null;
    Object v17 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v15),((com.google.javascript.rhino.jstype.ObjectType)v16));
    Object v18 = ((com.google.javascript.jscomp.TypedScopeCreator)v9).createScope(((com.google.javascript.rhino.Node)v12),((com.google.javascript.jscomp.Scope)v17));
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = "undefineL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = "i";
    Object v7 = false;
    Object v8 = ((com.google.javascript.jscomp.CodingConvention)v5).isExported(((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v10 = -15;
    Object v11 = "C";
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    Object v13 = null;
    Object v14 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.jstype.ObjectType)v13));
    Object v15 = -15;
    Object v16 = "C";
    Object v17 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v15).intValue()),((java.lang.String)v16));
    ((com.google.javascript.jscomp.TypedScopeCreator)v9).patchGlobalScope(((com.google.javascript.jscomp.Scope)v14),((com.google.javascript.rhino.Node)v17));
    Object v18 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = "undefineL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = "i";
    Object v7 = false;
    Object v8 = ((com.google.javascript.jscomp.CodingConvention)v5).isExported(((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v10 = -15;
    Object v11 = "C";
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    Object v13 = -15;
    Object v14 = "C";
    Object v15 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v13).intValue()),((java.lang.String)v14));
    Object v16 = null;
    Object v17 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v15),((com.google.javascript.rhino.jstype.ObjectType)v16));
    Object v18 = ((com.google.javascript.jscomp.TypedScopeCreator)v9).createScope(((com.google.javascript.rhino.Node)v12),((com.google.javascript.jscomp.Scope)v17));
    Object v19 = -15;
    Object v20 = "C";
    Object v21 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v19).intValue()),((java.lang.String)v20));
    Object v22 = null;
    Object v23 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v21),((com.google.javascript.rhino.jstype.ObjectType)v22));
    Object v24 = -15;
    Object v25 = "C";
    Object v26 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v24).intValue()),((java.lang.String)v25));
    ((com.google.javascript.jscomp.TypedScopeCreator)v9).patchGlobalScope(((com.google.javascript.jscomp.Scope)v23),((com.google.javascript.rhino.Node)v26));
    Object v27 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = "undefineL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = "i";
    Object v7 = false;
    Object v8 = ((com.google.javascript.jscomp.CodingConvention)v5).isExported(((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v10 = -15;
    Object v11 = "C";
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    Object v13 = -15;
    Object v14 = "C";
    Object v15 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v13).intValue()),((java.lang.String)v14));
    Object v16 = null;
    Object v17 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v15),((com.google.javascript.rhino.jstype.ObjectType)v16));
    Object v18 = ((com.google.javascript.jscomp.TypedScopeCreator)v9).createScope(((com.google.javascript.rhino.Node)v12),((com.google.javascript.jscomp.Scope)v17));
    Object v19 = -15;
    Object v20 = "C";
    Object v21 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v19).intValue()),((java.lang.String)v20));
    Object v22 = -15;
    Object v23 = "C";
    Object v24 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v22).intValue()),((java.lang.String)v23));
    Object v25 = null;
    Object v26 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v24),((com.google.javascript.rhino.jstype.ObjectType)v25));
    Object v27 = ((com.google.javascript.jscomp.TypedScopeCreator)v9).createScope(((com.google.javascript.rhino.Node)v21),((com.google.javascript.jscomp.Scope)v26));
    org.junit.Assert.assertNotNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = "undefineL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = "i";
    Object v7 = false;
    Object v8 = ((com.google.javascript.jscomp.CodingConvention)v5).isExported(((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v10 = -15;
    Object v11 = "C";
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    Object v13 = ((com.google.javascript.jscomp.TypedScopeCreator)v9).createInitialScope(((com.google.javascript.rhino.Node)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = "undefineL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = "i";
    Object v7 = false;
    Object v8 = ((com.google.javascript.jscomp.CodingConvention)v5).isExported(((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v10 = -15;
    Object v11 = "C";
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    Object v13 = -15;
    Object v14 = "C";
    Object v15 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v13).intValue()),((java.lang.String)v14));
    Object v16 = null;
    Object v17 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v15),((com.google.javascript.rhino.jstype.ObjectType)v16));
    Object v18 = ((com.google.javascript.jscomp.TypedScopeCreator)v9).createScope(((com.google.javascript.rhino.Node)v12),((com.google.javascript.jscomp.Scope)v17));
    Object v19 = -15;
    Object v20 = "C";
    Object v21 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v19).intValue()),((java.lang.String)v20));
    Object v22 = -15;
    Object v23 = "C";
    Object v24 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v22).intValue()),((java.lang.String)v23));
    Object v25 = null;
    Object v26 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v24),((com.google.javascript.rhino.jstype.ObjectType)v25));
    Object v27 = "4";
    Object v28 = ((com.google.javascript.jscomp.Scope)v26).getOwnSlot(((java.lang.String)v27));
    Object v29 = ((com.google.javascript.jscomp.TypedScopeCreator)v9).createScope(((com.google.javascript.rhino.Node)v21),((com.google.javascript.jscomp.Scope)v26));
    org.junit.Assert.assertNotNull(v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = "undefineL";
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
  public void test15() throws Throwable {
    Object v0 = "undefineL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = "i";
    Object v7 = false;
    Object v8 = ((com.google.javascript.jscomp.CodingConvention)v5).isExported(((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v10 = -15;
    Object v11 = "C";
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    Object v13 = 0;
    Object v14 = ((com.google.javascript.rhino.Node)v12).getIntProp((((java.lang.Integer)v13).intValue()));
    Object v15 = -15;
    Object v16 = "C";
    Object v17 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v15).intValue()),((java.lang.String)v16));
    Object v18 = null;
    Object v19 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v17),((com.google.javascript.rhino.jstype.ObjectType)v18));
    Object v20 = ((com.google.javascript.jscomp.TypedScopeCreator)v9).createScope(((com.google.javascript.rhino.Node)v12),((com.google.javascript.jscomp.Scope)v19));
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = "undefineL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = "i";
    Object v7 = false;
    Object v8 = ((com.google.javascript.jscomp.CodingConvention)v5).isExported(((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v10 = -15;
    Object v11 = "C";
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    Object v13 = ((com.google.javascript.rhino.Node)v12).getAncestors();
    Object v14 = -15;
    Object v15 = "C";
    Object v16 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v14).intValue()),((java.lang.String)v15));
    Object v17 = null;
    Object v18 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v16),((com.google.javascript.rhino.jstype.ObjectType)v17));
    Object v19 = ((com.google.javascript.jscomp.TypedScopeCreator)v9).createScope(((com.google.javascript.rhino.Node)v12),((com.google.javascript.jscomp.Scope)v18));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = "undefineL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = "i";
    Object v7 = false;
    Object v8 = ((com.google.javascript.jscomp.CodingConvention)v5).isExported(((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v10 = -15;
    Object v11 = "C";
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    Object v13 = null;
    Object v14 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.jstype.ObjectType)v13));
    Object v15 = -15;
    Object v16 = "C";
    Object v17 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v15).intValue()),((java.lang.String)v16));
    Object v18 = 0;
    Object v19 = ((com.google.javascript.rhino.Node)v17).getAncestor((((java.lang.Integer)v18).intValue()));
    ((com.google.javascript.jscomp.TypedScopeCreator)v9).patchGlobalScope(((com.google.javascript.jscomp.Scope)v14),((com.google.javascript.rhino.Node)v17));
    Object v20 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = "undefineL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = "i";
    Object v7 = false;
    Object v8 = ((com.google.javascript.jscomp.CodingConvention)v5).isExported(((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v10 = -15;
    Object v11 = "C";
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    Object v13 = -15;
    Object v14 = "C";
    Object v15 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v13).intValue()),((java.lang.String)v14));
    Object v16 = null;
    Object v17 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v15),((com.google.javascript.rhino.jstype.ObjectType)v16));
    Object v18 = ((com.google.javascript.jscomp.Scope)v17).getVarCount();
    Object v19 = ((com.google.javascript.jscomp.TypedScopeCreator)v9).createScope(((com.google.javascript.rhino.Node)v12),((com.google.javascript.jscomp.Scope)v17));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = "undefineL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = "i";
    Object v7 = false;
    Object v8 = ((com.google.javascript.jscomp.CodingConvention)v5).isExported(((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v10 = -15;
    Object v11 = "C";
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    Object v13 = ((com.google.javascript.rhino.Node)v12).isSyntheticBlock();
    Object v14 = -15;
    Object v15 = "C";
    Object v16 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v14).intValue()),((java.lang.String)v15));
    Object v17 = null;
    Object v18 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v16),((com.google.javascript.rhino.jstype.ObjectType)v17));
    Object v19 = ((com.google.javascript.jscomp.TypedScopeCreator)v9).createScope(((com.google.javascript.rhino.Node)v12),((com.google.javascript.jscomp.Scope)v18));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = "undefineL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = "i";
    Object v7 = false;
    Object v8 = ((com.google.javascript.jscomp.CodingConvention)v5).isExported(((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v10 = -15;
    Object v11 = "C";
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    Object v13 = ((com.google.javascript.rhino.Node)v12).cloneTree();
    Object v14 = -15;
    Object v15 = "C";
    Object v16 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v14).intValue()),((java.lang.String)v15));
    Object v17 = null;
    Object v18 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v16),((com.google.javascript.rhino.jstype.ObjectType)v17));
    Object v19 = "I";
    Object v20 = ((com.google.javascript.jscomp.Scope)v18).getOwnSlot(((java.lang.String)v19));
    Object v21 = ((com.google.javascript.jscomp.TypedScopeCreator)v9).createScope(((com.google.javascript.rhino.Node)v12),((com.google.javascript.jscomp.Scope)v18));
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = "undefineL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v5 = ((com.google.javascript.jscomp.CodingConvention)v4).getAbstractMethodName();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v4));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = "undefineL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = "i";
    Object v7 = false;
    Object v8 = ((com.google.javascript.jscomp.CodingConvention)v5).isExported(((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v10 = -15;
    Object v11 = "C";
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    Object v13 = null;
    Object v14 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.jstype.ObjectType)v13));
    Object v15 = -15;
    Object v16 = "C";
    Object v17 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v15).intValue()),((java.lang.String)v16));
    Object v18 = 1;
    ((com.google.javascript.rhino.Node)v17).setType((((java.lang.Integer)v18).intValue()));
    Object v19 = null;
    ((com.google.javascript.jscomp.TypedScopeCreator)v9).patchGlobalScope(((com.google.javascript.jscomp.Scope)v14),((com.google.javascript.rhino.Node)v17));
    Object v20 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = "undefineL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = "i";
    Object v7 = false;
    Object v8 = ((com.google.javascript.jscomp.CodingConvention)v5).isExported(((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v10 = -15;
    Object v11 = "C";
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    Object v13 = -15;
    Object v14 = "C";
    Object v15 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v13).intValue()),((java.lang.String)v14));
    Object v16 = null;
    Object v17 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v15),((com.google.javascript.rhino.jstype.ObjectType)v16));
    Object v18 = ((com.google.javascript.jscomp.TypedScopeCreator)v9).createScope(((com.google.javascript.rhino.Node)v12),((com.google.javascript.jscomp.Scope)v17));
    Object v19 = -15;
    Object v20 = "C";
    Object v21 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v19).intValue()),((java.lang.String)v20));
    Object v22 = null;
    Object v23 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v21),((com.google.javascript.rhino.jstype.ObjectType)v22));
    Object v24 = -15;
    Object v25 = "C";
    Object v26 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v24).intValue()),((java.lang.String)v25));
    Object v27 = ((com.google.javascript.rhino.Node)v26).isLocalResultCall();
    ((com.google.javascript.jscomp.TypedScopeCreator)v9).patchGlobalScope(((com.google.javascript.jscomp.Scope)v23),((com.google.javascript.rhino.Node)v26));
    Object v28 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = "undefineL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = "i";
    Object v7 = false;
    Object v8 = ((com.google.javascript.jscomp.CodingConvention)v5).isExported(((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v10 = -15;
    Object v11 = "C";
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    Object v13 = -15;
    Object v14 = "C";
    Object v15 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v13).intValue()),((java.lang.String)v14));
    Object v16 = null;
    Object v17 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v15),((com.google.javascript.rhino.jstype.ObjectType)v16));
    Object v18 = ((com.google.javascript.jscomp.TypedScopeCreator)v9).createScope(((com.google.javascript.rhino.Node)v12),((com.google.javascript.jscomp.Scope)v17));
    Object v19 = -15;
    Object v20 = "C";
    Object v21 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v19).intValue()),((java.lang.String)v20));
    Object v22 = 3;
    ((com.google.javascript.rhino.Node)v21).setCharno((((java.lang.Integer)v22).intValue()));
    Object v23 = null;
    Object v24 = ((com.google.javascript.jscomp.TypedScopeCreator)v9).createInitialScope(((com.google.javascript.rhino.Node)v21));
    org.junit.Assert.assertNotNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = "undefineL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = "i";
    Object v7 = false;
    Object v8 = ((com.google.javascript.jscomp.CodingConvention)v5).isExported(((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v10 = "undefineL";
    Object v11 = java.nio.charset.Charset.defaultCharset();
    Object v12 = new java.io.PrintStream(((java.lang.String)v10),((java.nio.charset.Charset)v11));
    Object v13 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v12));
    Object v14 = ((com.google.javascript.jscomp.AbstractCompiler)v13).getErrorManager();
    Object v15 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v16 = "i";
    Object v17 = false;
    Object v18 = ((com.google.javascript.jscomp.CodingConvention)v15).isExported(((java.lang.String)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v13),((com.google.javascript.jscomp.CodingConvention)v15));
    Object v20 = -15;
    Object v21 = "C";
    Object v22 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v20).intValue()),((java.lang.String)v21));
    Object v23 = -15;
    Object v24 = "C";
    Object v25 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v23).intValue()),((java.lang.String)v24));
    Object v26 = null;
    Object v27 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v25),((com.google.javascript.rhino.jstype.ObjectType)v26));
    Object v28 = ((com.google.javascript.jscomp.TypedScopeCreator)v19).createScope(((com.google.javascript.rhino.Node)v22),((com.google.javascript.jscomp.Scope)v27));
    Object v29 = -15;
    Object v30 = "C";
    Object v31 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v29).intValue()),((java.lang.String)v30));
    ((com.google.javascript.jscomp.TypedScopeCreator)v9).patchGlobalScope(((com.google.javascript.jscomp.Scope)v28),((com.google.javascript.rhino.Node)v31));
    Object v32 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = "undefineL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = "i";
    Object v7 = false;
    Object v8 = ((com.google.javascript.jscomp.CodingConvention)v5).isExported(((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v10 = -15;
    Object v11 = "C";
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    Object v13 = ((com.google.javascript.rhino.Node)v12).getInputId();
    Object v14 = -15;
    Object v15 = "C";
    Object v16 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v14).intValue()),((java.lang.String)v15));
    Object v17 = null;
    Object v18 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v16),((com.google.javascript.rhino.jstype.ObjectType)v17));
    Object v19 = ((com.google.javascript.jscomp.TypedScopeCreator)v9).createScope(((com.google.javascript.rhino.Node)v12),((com.google.javascript.jscomp.Scope)v18));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = "undefineL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = "i";
    Object v7 = false;
    Object v8 = ((com.google.javascript.jscomp.CodingConvention)v5).isExported(((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v10 = -15;
    Object v11 = "C";
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    Object v13 = -15;
    Object v14 = "C";
    Object v15 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v13).intValue()),((java.lang.String)v14));
    Object v16 = null;
    Object v17 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v15),((com.google.javascript.rhino.jstype.ObjectType)v16));
    Object v18 = "Q";
    Object v19 = ((com.google.javascript.jscomp.Scope)v17).getOwnSlot(((java.lang.String)v18));
    Object v20 = ((com.google.javascript.jscomp.TypedScopeCreator)v9).createScope(((com.google.javascript.rhino.Node)v12),((com.google.javascript.jscomp.Scope)v17));
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = "undefineL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = "i";
    Object v7 = false;
    Object v8 = ((com.google.javascript.jscomp.CodingConvention)v5).isExported(((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v10 = -15;
    Object v11 = "C";
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    Object v13 = null;
    Object v14 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.jstype.ObjectType)v13));
    Object v15 = -15;
    Object v16 = "C";
    Object v17 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v15).intValue()),((java.lang.String)v16));
    Object v18 = ((com.google.javascript.rhino.Node)v17).getInputId();
    ((com.google.javascript.jscomp.TypedScopeCreator)v9).patchGlobalScope(((com.google.javascript.jscomp.Scope)v14),((com.google.javascript.rhino.Node)v17));
    Object v19 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = "undefineL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = "i";
    Object v7 = false;
    Object v8 = ((com.google.javascript.jscomp.CodingConvention)v5).isExported(((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v10 = -15;
    Object v11 = "C";
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    Object v13 = null;
    Object v14 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.jstype.ObjectType)v13));
    Object v15 = ((com.google.javascript.jscomp.Scope)v14).getAllSymbols();
    Object v16 = -15;
    Object v17 = "C";
    Object v18 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v16).intValue()),((java.lang.String)v17));
    ((com.google.javascript.jscomp.TypedScopeCreator)v9).patchGlobalScope(((com.google.javascript.jscomp.Scope)v14),((com.google.javascript.rhino.Node)v18));
    Object v19 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = "undefineL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = "i";
    Object v7 = false;
    Object v8 = ((com.google.javascript.jscomp.CodingConvention)v5).isExported(((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v10 = -15;
    Object v11 = "C";
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    Object v13 = -15;
    Object v14 = "C";
    Object v15 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v13).intValue()),((java.lang.String)v14));
    Object v16 = null;
    Object v17 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v15),((com.google.javascript.rhino.jstype.ObjectType)v16));
    Object v18 = ((com.google.javascript.jscomp.TypedScopeCreator)v9).createScope(((com.google.javascript.rhino.Node)v12),((com.google.javascript.jscomp.Scope)v17));
    Object v19 = -15;
    Object v20 = "C";
    Object v21 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v19).intValue()),((java.lang.String)v20));
    Object v22 = null;
    Object v23 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v21),((com.google.javascript.rhino.jstype.ObjectType)v22));
    Object v24 = -15;
    Object v25 = "C";
    Object v26 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v24).intValue()),((java.lang.String)v25));
    Object v27 = 13;
    ((com.google.javascript.rhino.Node)v26).removeProp((((java.lang.Integer)v27).intValue()));
    Object v28 = null;
    ((com.google.javascript.jscomp.TypedScopeCreator)v9).patchGlobalScope(((com.google.javascript.jscomp.Scope)v23),((com.google.javascript.rhino.Node)v26));
    Object v29 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = "undefineL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = "i";
    Object v7 = false;
    Object v8 = ((com.google.javascript.jscomp.CodingConvention)v5).isExported(((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v10 = "undefineL";
    Object v11 = java.nio.charset.Charset.defaultCharset();
    Object v12 = new java.io.PrintStream(((java.lang.String)v10),((java.nio.charset.Charset)v11));
    Object v13 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v12));
    Object v14 = ((com.google.javascript.jscomp.AbstractCompiler)v13).getErrorManager();
    Object v15 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v16 = "i";
    Object v17 = false;
    Object v18 = ((com.google.javascript.jscomp.CodingConvention)v15).isExported(((java.lang.String)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v13),((com.google.javascript.jscomp.CodingConvention)v15));
    Object v20 = -15;
    Object v21 = "C";
    Object v22 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v20).intValue()),((java.lang.String)v21));
    Object v23 = ((com.google.javascript.jscomp.TypedScopeCreator)v19).createInitialScope(((com.google.javascript.rhino.Node)v22));
    Object v24 = -15;
    Object v25 = "C";
    Object v26 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v24).intValue()),((java.lang.String)v25));
    ((com.google.javascript.jscomp.TypedScopeCreator)v9).patchGlobalScope(((com.google.javascript.jscomp.Scope)v23),((com.google.javascript.rhino.Node)v26));
    Object v27 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = "undefineL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = "i";
    Object v7 = false;
    Object v8 = ((com.google.javascript.jscomp.CodingConvention)v5).isExported(((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v10 = -15;
    Object v11 = "C";
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    Object v13 = -15;
    Object v14 = "C";
    Object v15 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v13).intValue()),((java.lang.String)v14));
    Object v16 = null;
    Object v17 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v15),((com.google.javascript.rhino.jstype.ObjectType)v16));
    Object v18 = ((com.google.javascript.jscomp.TypedScopeCreator)v9).createScope(((com.google.javascript.rhino.Node)v12),((com.google.javascript.jscomp.Scope)v17));
    Object v19 = -15;
    Object v20 = "C";
    Object v21 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v19).intValue()),((java.lang.String)v20));
    Object v22 = -15;
    Object v23 = "C";
    Object v24 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v22).intValue()),((java.lang.String)v23));
    Object v25 = null;
    Object v26 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v24),((com.google.javascript.rhino.jstype.ObjectType)v25));
    Object v27 = ((com.google.javascript.jscomp.Scope)v26).getVarCount();
    Object v28 = ((com.google.javascript.jscomp.TypedScopeCreator)v9).createScope(((com.google.javascript.rhino.Node)v21),((com.google.javascript.jscomp.Scope)v26));
    org.junit.Assert.assertNotNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = "undefineL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "9";
    Object v5 = -28;
    Object v6 = ((com.google.javascript.jscomp.SourceExcerptProvider)v3).getSourceRegion(((java.lang.String)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = "undefineL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = "i";
    Object v7 = false;
    Object v8 = ((com.google.javascript.jscomp.CodingConvention)v5).isExported(((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v10 = -15;
    Object v11 = "C";
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    Object v13 = -15;
    Object v14 = "C";
    Object v15 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v13).intValue()),((java.lang.String)v14));
    Object v16 = null;
    Object v17 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v15),((com.google.javascript.rhino.jstype.ObjectType)v16));
    Object v18 = -15;
    Object v19 = "C";
    Object v20 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v18).intValue()),((java.lang.String)v19));
    Object v21 = null;
    Object v22 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v20),((com.google.javascript.rhino.jstype.ObjectType)v21));
    Object v23 = new com.google.javascript.jscomp.Scope.Arguments(((com.google.javascript.jscomp.Scope)v22));
    Object v24 = ((com.google.javascript.jscomp.Scope)v17).getReferences(((com.google.javascript.jscomp.Scope.Var)v23));
    Object v25 = ((com.google.javascript.jscomp.TypedScopeCreator)v9).createScope(((com.google.javascript.rhino.Node)v12),((com.google.javascript.jscomp.Scope)v17));
    org.junit.Assert.assertNotNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = "undefineL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = "i";
    Object v7 = false;
    Object v8 = ((com.google.javascript.jscomp.CodingConvention)v5).isExported(((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v10 = -15;
    Object v11 = "C";
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    Object v13 = "undefineL";
    Object v14 = java.nio.charset.Charset.defaultCharset();
    Object v15 = new java.io.PrintStream(((java.lang.String)v13),((java.nio.charset.Charset)v14));
    Object v16 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v15));
    Object v17 = ((com.google.javascript.jscomp.AbstractCompiler)v16).getErrorManager();
    Object v18 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v19 = "i";
    Object v20 = false;
    Object v21 = ((com.google.javascript.jscomp.CodingConvention)v18).isExported(((java.lang.String)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v16),((com.google.javascript.jscomp.CodingConvention)v18));
    Object v23 = -15;
    Object v24 = "C";
    Object v25 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v23).intValue()),((java.lang.String)v24));
    Object v26 = -15;
    Object v27 = "C";
    Object v28 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v26).intValue()),((java.lang.String)v27));
    Object v29 = null;
    Object v30 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v28),((com.google.javascript.rhino.jstype.ObjectType)v29));
    Object v31 = ((com.google.javascript.jscomp.Scope)v30).getVarCount();
    Object v32 = ((com.google.javascript.jscomp.TypedScopeCreator)v22).createScope(((com.google.javascript.rhino.Node)v25),((com.google.javascript.jscomp.Scope)v30));
    Object v33 = ((com.google.javascript.jscomp.TypedScopeCreator)v9).createScope(((com.google.javascript.rhino.Node)v12),((com.google.javascript.jscomp.Scope)v32));
    Object v34 = -15;
    Object v35 = "C";
    Object v36 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v34).intValue()),((java.lang.String)v35));
    Object v37 = ((com.google.javascript.jscomp.TypedScopeCreator)v9).createInitialScope(((com.google.javascript.rhino.Node)v36));
    org.junit.Assert.assertNotNull(v37);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = "undefineL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = "i";
    Object v7 = false;
    Object v8 = ((com.google.javascript.jscomp.CodingConvention)v5).isExported(((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v10 = "undefineL";
    Object v11 = java.nio.charset.Charset.defaultCharset();
    Object v12 = new java.io.PrintStream(((java.lang.String)v10),((java.nio.charset.Charset)v11));
    Object v13 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v12));
    Object v14 = ((com.google.javascript.jscomp.AbstractCompiler)v13).getErrorManager();
    Object v15 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v16 = "i";
    Object v17 = false;
    Object v18 = ((com.google.javascript.jscomp.CodingConvention)v15).isExported(((java.lang.String)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v13),((com.google.javascript.jscomp.CodingConvention)v15));
    Object v20 = -15;
    Object v21 = "C";
    Object v22 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v20).intValue()),((java.lang.String)v21));
    Object v23 = ((com.google.javascript.rhino.Node)v22).isSyntheticBlock();
    Object v24 = -15;
    Object v25 = "C";
    Object v26 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v24).intValue()),((java.lang.String)v25));
    Object v27 = null;
    Object v28 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v26),((com.google.javascript.rhino.jstype.ObjectType)v27));
    Object v29 = ((com.google.javascript.jscomp.TypedScopeCreator)v19).createScope(((com.google.javascript.rhino.Node)v22),((com.google.javascript.jscomp.Scope)v28));
    Object v30 = -15;
    Object v31 = "C";
    Object v32 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v30).intValue()),((java.lang.String)v31));
    ((com.google.javascript.jscomp.TypedScopeCreator)v9).patchGlobalScope(((com.google.javascript.jscomp.Scope)v29),((com.google.javascript.rhino.Node)v32));
    Object v33 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = "undefineL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = "i";
    Object v7 = false;
    Object v8 = ((com.google.javascript.jscomp.CodingConvention)v5).isExported(((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v10 = -15;
    Object v11 = "C";
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    Object v13 = null;
    Object v14 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.jstype.ObjectType)v13));
    Object v15 = -15;
    Object v16 = "C";
    Object v17 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v15).intValue()),((java.lang.String)v16));
    Object v18 = -15;
    Object v19 = "C";
    Object v20 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v18).intValue()),((java.lang.String)v19));
    Object v21 = ((com.google.javascript.rhino.Node)v17).clonePropsFrom(((com.google.javascript.rhino.Node)v20));
    ((com.google.javascript.jscomp.TypedScopeCreator)v9).patchGlobalScope(((com.google.javascript.jscomp.Scope)v14),((com.google.javascript.rhino.Node)v17));
    Object v22 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = "undefineL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = "i";
    Object v7 = false;
    Object v8 = ((com.google.javascript.jscomp.CodingConvention)v5).isExported(((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v10 = -15;
    Object v11 = "C";
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    Object v13 = "undefineL";
    Object v14 = java.nio.charset.Charset.defaultCharset();
    Object v15 = new java.io.PrintStream(((java.lang.String)v13),((java.nio.charset.Charset)v14));
    Object v16 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v15));
    Object v17 = ((com.google.javascript.jscomp.AbstractCompiler)v16).getErrorManager();
    Object v18 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v19 = "i";
    Object v20 = false;
    Object v21 = ((com.google.javascript.jscomp.CodingConvention)v18).isExported(((java.lang.String)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v16),((com.google.javascript.jscomp.CodingConvention)v18));
    Object v23 = -15;
    Object v24 = "C";
    Object v25 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v23).intValue()),((java.lang.String)v24));
    Object v26 = ((com.google.javascript.rhino.Node)v25).getInputId();
    Object v27 = -15;
    Object v28 = "C";
    Object v29 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v27).intValue()),((java.lang.String)v28));
    Object v30 = null;
    Object v31 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v29),((com.google.javascript.rhino.jstype.ObjectType)v30));
    Object v32 = ((com.google.javascript.jscomp.TypedScopeCreator)v22).createScope(((com.google.javascript.rhino.Node)v25),((com.google.javascript.jscomp.Scope)v31));
    Object v33 = ((com.google.javascript.jscomp.TypedScopeCreator)v9).createScope(((com.google.javascript.rhino.Node)v12),((com.google.javascript.jscomp.Scope)v32));
    org.junit.Assert.assertNotNull(v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = "undefineL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = "i";
    Object v7 = false;
    Object v8 = ((com.google.javascript.jscomp.CodingConvention)v5).isExported(((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v10 = -15;
    Object v11 = "C";
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    Object v13 = ((com.google.javascript.rhino.Node)v12).getString();
    Object v14 = ((com.google.javascript.jscomp.TypedScopeCreator)v9).createInitialScope(((com.google.javascript.rhino.Node)v12));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = "undefineL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = "i";
    Object v7 = false;
    Object v8 = ((com.google.javascript.jscomp.CodingConvention)v5).isExported(((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v10 = -15;
    Object v11 = "C";
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    Object v13 = -15;
    Object v14 = "C";
    Object v15 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v13).intValue()),((java.lang.String)v14));
    Object v16 = null;
    Object v17 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v15),((com.google.javascript.rhino.jstype.ObjectType)v16));
    Object v18 = ((com.google.javascript.jscomp.TypedScopeCreator)v9).createScope(((com.google.javascript.rhino.Node)v12),((com.google.javascript.jscomp.Scope)v17));
    Object v19 = -15;
    Object v20 = "C";
    Object v21 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v19).intValue()),((java.lang.String)v20));
    Object v22 = ((com.google.javascript.jscomp.TypedScopeCreator)v9).createInitialScope(((com.google.javascript.rhino.Node)v21));
    org.junit.Assert.assertNotNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = "undefineL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = "i";
    Object v7 = false;
    Object v8 = ((com.google.javascript.jscomp.CodingConvention)v5).isExported(((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v10 = -15;
    Object v11 = "C";
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    Object v13 = null;
    Object v14 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.jstype.ObjectType)v13));
    Object v15 = -15;
    Object v16 = "C";
    Object v17 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v15).intValue()),((java.lang.String)v16));
    Object v18 = ((com.google.javascript.rhino.Node)v17).cloneNode();
    ((com.google.javascript.jscomp.TypedScopeCreator)v9).patchGlobalScope(((com.google.javascript.jscomp.Scope)v14),((com.google.javascript.rhino.Node)v17));
    Object v19 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = "undefineL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = "i";
    Object v7 = false;
    Object v8 = ((com.google.javascript.jscomp.CodingConvention)v5).isExported(((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v10 = -15;
    Object v11 = "C";
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    Object v13 = ((com.google.javascript.rhino.Node)v12).getSideEffectFlags();
    Object v14 = -15;
    Object v15 = "C";
    Object v16 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v14).intValue()),((java.lang.String)v15));
    Object v17 = null;
    Object v18 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v16),((com.google.javascript.rhino.jstype.ObjectType)v17));
    Object v19 = ((com.google.javascript.jscomp.TypedScopeCreator)v9).createScope(((com.google.javascript.rhino.Node)v12),((com.google.javascript.jscomp.Scope)v18));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = "undefineL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = "i";
    Object v7 = false;
    Object v8 = ((com.google.javascript.jscomp.CodingConvention)v5).isExported(((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v10 = -15;
    Object v11 = "C";
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    Object v13 = -15;
    Object v14 = "C";
    Object v15 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v13).intValue()),((java.lang.String)v14));
    Object v16 = null;
    Object v17 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v15),((com.google.javascript.rhino.jstype.ObjectType)v16));
    Object v18 = "JSCompilr_renameProperty";
    Object v19 = ((com.google.javascript.jscomp.Scope)v17).getVar(((java.lang.String)v18));
    Object v20 = ((com.google.javascript.jscomp.TypedScopeCreator)v9).createScope(((com.google.javascript.rhino.Node)v12),((com.google.javascript.jscomp.Scope)v17));
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = "undefineL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = "i";
    Object v7 = false;
    Object v8 = ((com.google.javascript.jscomp.CodingConvention)v5).isExported(((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v10 = -15;
    Object v11 = "C";
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    Object v13 = ((com.google.javascript.rhino.Node)v12).isFromExterns();
    Object v14 = -15;
    Object v15 = "C";
    Object v16 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v14).intValue()),((java.lang.String)v15));
    Object v17 = null;
    Object v18 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v16),((com.google.javascript.rhino.jstype.ObjectType)v17));
    Object v19 = ((com.google.javascript.jscomp.TypedScopeCreator)v9).createScope(((com.google.javascript.rhino.Node)v12),((com.google.javascript.jscomp.Scope)v18));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = "undefineL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = "i";
    Object v7 = false;
    Object v8 = ((com.google.javascript.jscomp.CodingConvention)v5).isExported(((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v10 = -15;
    Object v11 = "C";
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    Object v13 = null;
    Object v14 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.jstype.ObjectType)v13));
    Object v15 = -15;
    Object v16 = "C";
    Object v17 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v15).intValue()),((java.lang.String)v16));
    Object v18 = null;
    Object v19 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v17),((com.google.javascript.rhino.jstype.ObjectType)v18));
    Object v20 = new com.google.javascript.jscomp.Scope.Arguments(((com.google.javascript.jscomp.Scope)v19));
    Object v21 = ((com.google.javascript.jscomp.Scope)v14).getReferences(((com.google.javascript.jscomp.Scope.Var)v20));
    Object v22 = -15;
    Object v23 = "C";
    Object v24 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v22).intValue()),((java.lang.String)v23));
    ((com.google.javascript.jscomp.TypedScopeCreator)v9).patchGlobalScope(((com.google.javascript.jscomp.Scope)v14),((com.google.javascript.rhino.Node)v24));
    Object v25 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = "undefineL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = "i";
    Object v7 = false;
    Object v8 = ((com.google.javascript.jscomp.CodingConvention)v5).isExported(((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v10 = -15;
    Object v11 = "C";
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    Object v13 = null;
    Object v14 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.jstype.ObjectType)v13));
    Object v15 = "+";
    Object v16 = ((com.google.javascript.jscomp.Scope)v14).getOwnSlot(((java.lang.String)v15));
    Object v17 = -15;
    Object v18 = "C";
    Object v19 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v17).intValue()),((java.lang.String)v18));
    ((com.google.javascript.jscomp.TypedScopeCreator)v9).patchGlobalScope(((com.google.javascript.jscomp.Scope)v14),((com.google.javascript.rhino.Node)v19));
    Object v20 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = "undefineL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = "i";
    Object v7 = false;
    Object v8 = ((com.google.javascript.jscomp.CodingConvention)v5).isExported(((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v10 = -15;
    Object v11 = "C";
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    Object v13 = -15;
    Object v14 = "C";
    Object v15 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v13).intValue()),((java.lang.String)v14));
    Object v16 = null;
    Object v17 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v15),((com.google.javascript.rhino.jstype.ObjectType)v16));
    Object v18 = ((com.google.javascript.jscomp.Scope)v17).getAllSymbols();
    Object v19 = ((com.google.javascript.jscomp.TypedScopeCreator)v9).createScope(((com.google.javascript.rhino.Node)v12),((com.google.javascript.jscomp.Scope)v17));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = "undefineL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = "i";
    Object v7 = false;
    Object v8 = ((com.google.javascript.jscomp.CodingConvention)v5).isExported(((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v10 = -15;
    Object v11 = "C";
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    Object v13 = -15;
    Object v14 = "C";
    Object v15 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v13).intValue()),((java.lang.String)v14));
    Object v16 = null;
    Object v17 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v15),((com.google.javascript.rhino.jstype.ObjectType)v16));
    Object v18 = ((com.google.javascript.jscomp.TypedScopeCreator)v9).createScope(((com.google.javascript.rhino.Node)v12),((com.google.javascript.jscomp.Scope)v17));
    Object v19 = -15;
    Object v20 = "C";
    Object v21 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v19).intValue()),((java.lang.String)v20));
    Object v22 = -15;
    Object v23 = "C";
    Object v24 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v22).intValue()),((java.lang.String)v23));
    Object v25 = null;
    Object v26 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v24),((com.google.javascript.rhino.jstype.ObjectType)v25));
    Object v27 = ((com.google.javascript.jscomp.Scope)v26).getAllSymbols();
    Object v28 = ((com.google.javascript.jscomp.TypedScopeCreator)v9).createScope(((com.google.javascript.rhino.Node)v21),((com.google.javascript.jscomp.Scope)v26));
    org.junit.Assert.assertNotNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = "undefineL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = "i";
    Object v7 = false;
    Object v8 = ((com.google.javascript.jscomp.CodingConvention)v5).isExported(((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v10 = "undefineL";
    Object v11 = java.nio.charset.Charset.defaultCharset();
    Object v12 = new java.io.PrintStream(((java.lang.String)v10),((java.nio.charset.Charset)v11));
    Object v13 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v12));
    Object v14 = ((com.google.javascript.jscomp.AbstractCompiler)v13).getErrorManager();
    Object v15 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v16 = "i";
    Object v17 = false;
    Object v18 = ((com.google.javascript.jscomp.CodingConvention)v15).isExported(((java.lang.String)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v13),((com.google.javascript.jscomp.CodingConvention)v15));
    Object v20 = -15;
    Object v21 = "C";
    Object v22 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v20).intValue()),((java.lang.String)v21));
    Object v23 = ((com.google.javascript.rhino.Node)v22).getSideEffectFlags();
    Object v24 = -15;
    Object v25 = "C";
    Object v26 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v24).intValue()),((java.lang.String)v25));
    Object v27 = null;
    Object v28 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v26),((com.google.javascript.rhino.jstype.ObjectType)v27));
    Object v29 = ((com.google.javascript.jscomp.TypedScopeCreator)v19).createScope(((com.google.javascript.rhino.Node)v22),((com.google.javascript.jscomp.Scope)v28));
    Object v30 = -15;
    Object v31 = "C";
    Object v32 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v30).intValue()),((java.lang.String)v31));
    ((com.google.javascript.jscomp.TypedScopeCreator)v9).patchGlobalScope(((com.google.javascript.jscomp.Scope)v29),((com.google.javascript.rhino.Node)v32));
    Object v33 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = "undefineL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = "i";
    Object v7 = false;
    Object v8 = ((com.google.javascript.jscomp.CodingConvention)v5).isExported(((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v10 = -15;
    Object v11 = "C";
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    Object v13 = -15;
    Object v14 = "C";
    Object v15 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v13).intValue()),((java.lang.String)v14));
    Object v16 = null;
    Object v17 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v15),((com.google.javascript.rhino.jstype.ObjectType)v16));
    Object v18 = ((com.google.javascript.jscomp.TypedScopeCreator)v9).createScope(((com.google.javascript.rhino.Node)v12),((com.google.javascript.jscomp.Scope)v17));
    Object v19 = -15;
    Object v20 = "C";
    Object v21 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v19).intValue()),((java.lang.String)v20));
    Object v22 = -15;
    Object v23 = "C";
    Object v24 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v22).intValue()),((java.lang.String)v23));
    Object v25 = null;
    Object v26 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v24),((com.google.javascript.rhino.jstype.ObjectType)v25));
    Object v27 = -15;
    Object v28 = "C";
    Object v29 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v27).intValue()),((java.lang.String)v28));
    Object v30 = null;
    Object v31 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v29),((com.google.javascript.rhino.jstype.ObjectType)v30));
    Object v32 = new com.google.javascript.jscomp.Scope.Arguments(((com.google.javascript.jscomp.Scope)v31));
    Object v33 = ((com.google.javascript.jscomp.Scope)v26).getReferences(((com.google.javascript.jscomp.Scope.Var)v32));
    Object v34 = ((com.google.javascript.jscomp.TypedScopeCreator)v9).createScope(((com.google.javascript.rhino.Node)v21),((com.google.javascript.jscomp.Scope)v26));
    org.junit.Assert.assertNotNull(v34);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = "undefineL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = "i";
    Object v7 = false;
    Object v8 = ((com.google.javascript.jscomp.CodingConvention)v5).isExported(((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v10 = -15;
    Object v11 = "C";
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    Object v13 = -15;
    Object v14 = "C";
    Object v15 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v13).intValue()),((java.lang.String)v14));
    ((com.google.javascript.rhino.Node)v12).addChildrenToFront(((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
    Object v17 = -15;
    Object v18 = "C";
    Object v19 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v17).intValue()),((java.lang.String)v18));
    Object v20 = null;
    Object v21 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v19),((com.google.javascript.rhino.jstype.ObjectType)v20));
    Object v22 = ((com.google.javascript.jscomp.TypedScopeCreator)v9).createScope(((com.google.javascript.rhino.Node)v12),((com.google.javascript.jscomp.Scope)v21));
    org.junit.Assert.assertNotNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = "undefineL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = "i";
    Object v7 = false;
    Object v8 = ((com.google.javascript.jscomp.CodingConvention)v5).isExported(((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v10 = -15;
    Object v11 = "C";
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    Object v13 = null;
    Object v14 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.jstype.ObjectType)v13));
    Object v15 = "E";
    Object v16 = ((com.google.javascript.jscomp.Scope)v14).getOwnSlot(((java.lang.String)v15));
    Object v17 = -15;
    Object v18 = "C";
    Object v19 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v17).intValue()),((java.lang.String)v18));
    ((com.google.javascript.jscomp.TypedScopeCreator)v9).patchGlobalScope(((com.google.javascript.jscomp.Scope)v14),((com.google.javascript.rhino.Node)v19));
    Object v20 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = "undefineL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = "i";
    Object v7 = false;
    Object v8 = ((com.google.javascript.jscomp.CodingConvention)v5).isExported(((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v10 = -15;
    Object v11 = "C";
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    Object v13 = 1;
    Object v14 = ((com.google.javascript.rhino.Node)v12).getAncestor((((java.lang.Integer)v13).intValue()));
    Object v15 = -15;
    Object v16 = "C";
    Object v17 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v15).intValue()),((java.lang.String)v16));
    Object v18 = null;
    Object v19 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v17),((com.google.javascript.rhino.jstype.ObjectType)v18));
    Object v20 = ((com.google.javascript.jscomp.TypedScopeCreator)v9).createScope(((com.google.javascript.rhino.Node)v12),((com.google.javascript.jscomp.Scope)v19));
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = "undefineL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = "i";
    Object v7 = false;
    Object v8 = ((com.google.javascript.jscomp.CodingConvention)v5).isExported(((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v10 = -15;
    Object v11 = "C";
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    Object v13 = "undefineL";
    Object v14 = java.nio.charset.Charset.defaultCharset();
    Object v15 = new java.io.PrintStream(((java.lang.String)v13),((java.nio.charset.Charset)v14));
    Object v16 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v15));
    Object v17 = ((com.google.javascript.jscomp.AbstractCompiler)v16).getErrorManager();
    Object v18 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v19 = "i";
    Object v20 = false;
    Object v21 = ((com.google.javascript.jscomp.CodingConvention)v18).isExported(((java.lang.String)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v16),((com.google.javascript.jscomp.CodingConvention)v18));
    Object v23 = -15;
    Object v24 = "C";
    Object v25 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v23).intValue()),((java.lang.String)v24));
    Object v26 = -15;
    Object v27 = "C";
    Object v28 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v26).intValue()),((java.lang.String)v27));
    ((com.google.javascript.rhino.Node)v25).addChildrenToFront(((com.google.javascript.rhino.Node)v28));
    Object v29 = null;
    Object v30 = -15;
    Object v31 = "C";
    Object v32 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v30).intValue()),((java.lang.String)v31));
    Object v33 = null;
    Object v34 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v32),((com.google.javascript.rhino.jstype.ObjectType)v33));
    Object v35 = ((com.google.javascript.jscomp.TypedScopeCreator)v22).createScope(((com.google.javascript.rhino.Node)v25),((com.google.javascript.jscomp.Scope)v34));
    Object v36 = ((com.google.javascript.jscomp.TypedScopeCreator)v9).createScope(((com.google.javascript.rhino.Node)v12),((com.google.javascript.jscomp.Scope)v35));
    org.junit.Assert.assertNotNull(v36);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = "undefineL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = "i";
    Object v7 = false;
    Object v8 = ((com.google.javascript.jscomp.CodingConvention)v5).isExported(((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v10 = -15;
    Object v11 = "C";
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    Object v13 = "undefineL";
    Object v14 = java.nio.charset.Charset.defaultCharset();
    Object v15 = new java.io.PrintStream(((java.lang.String)v13),((java.nio.charset.Charset)v14));
    Object v16 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v15));
    Object v17 = ((com.google.javascript.jscomp.AbstractCompiler)v16).getErrorManager();
    Object v18 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v19 = "i";
    Object v20 = false;
    Object v21 = ((com.google.javascript.jscomp.CodingConvention)v18).isExported(((java.lang.String)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v16),((com.google.javascript.jscomp.CodingConvention)v18));
    Object v23 = -15;
    Object v24 = "C";
    Object v25 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v23).intValue()),((java.lang.String)v24));
    Object v26 = -15;
    Object v27 = "C";
    Object v28 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v26).intValue()),((java.lang.String)v27));
    Object v29 = null;
    Object v30 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v28),((com.google.javascript.rhino.jstype.ObjectType)v29));
    Object v31 = ((com.google.javascript.jscomp.TypedScopeCreator)v22).createScope(((com.google.javascript.rhino.Node)v25),((com.google.javascript.jscomp.Scope)v30));
    Object v32 = -15;
    Object v33 = "C";
    Object v34 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v32).intValue()),((java.lang.String)v33));
    Object v35 = ((com.google.javascript.jscomp.TypedScopeCreator)v22).createInitialScope(((com.google.javascript.rhino.Node)v34));
    Object v36 = ((com.google.javascript.jscomp.TypedScopeCreator)v9).createScope(((com.google.javascript.rhino.Node)v12),((com.google.javascript.jscomp.Scope)v35));
    org.junit.Assert.assertNotNull(v36);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = "undefineL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = "i";
    Object v7 = false;
    Object v8 = ((com.google.javascript.jscomp.CodingConvention)v5).isExported(((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v10 = -15;
    Object v11 = "C";
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    Object v13 = "undefineL";
    Object v14 = java.nio.charset.Charset.defaultCharset();
    Object v15 = new java.io.PrintStream(((java.lang.String)v13),((java.nio.charset.Charset)v14));
    Object v16 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v15));
    Object v17 = ((com.google.javascript.jscomp.AbstractCompiler)v16).getErrorManager();
    Object v18 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v19 = "i";
    Object v20 = false;
    Object v21 = ((com.google.javascript.jscomp.CodingConvention)v18).isExported(((java.lang.String)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v16),((com.google.javascript.jscomp.CodingConvention)v18));
    Object v23 = -15;
    Object v24 = "C";
    Object v25 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v23).intValue()),((java.lang.String)v24));
    Object v26 = ((com.google.javascript.rhino.Node)v25).getSideEffectFlags();
    Object v27 = -15;
    Object v28 = "C";
    Object v29 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v27).intValue()),((java.lang.String)v28));
    Object v30 = null;
    Object v31 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v29),((com.google.javascript.rhino.jstype.ObjectType)v30));
    Object v32 = ((com.google.javascript.jscomp.TypedScopeCreator)v22).createScope(((com.google.javascript.rhino.Node)v25),((com.google.javascript.jscomp.Scope)v31));
    Object v33 = ((com.google.javascript.jscomp.TypedScopeCreator)v9).createScope(((com.google.javascript.rhino.Node)v12),((com.google.javascript.jscomp.Scope)v32));
    org.junit.Assert.assertNotNull(v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = "undefineL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = "i";
    Object v7 = false;
    Object v8 = ((com.google.javascript.jscomp.CodingConvention)v5).isExported(((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v10 = -15;
    Object v11 = "C";
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    Object v13 = null;
    Object v14 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.jstype.ObjectType)v13));
    Object v15 = "W";
    Object v16 = ((com.google.javascript.jscomp.Scope)v14).getVar(((java.lang.String)v15));
    Object v17 = -15;
    Object v18 = "C";
    Object v19 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v17).intValue()),((java.lang.String)v18));
    ((com.google.javascript.jscomp.TypedScopeCreator)v9).patchGlobalScope(((com.google.javascript.jscomp.Scope)v14),((com.google.javascript.rhino.Node)v19));
    Object v20 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = "undefineL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = "i";
    Object v7 = false;
    Object v8 = ((com.google.javascript.jscomp.CodingConvention)v5).isExported(((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v10 = -15;
    Object v11 = "C";
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    Object v13 = null;
    Object v14 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.jstype.ObjectType)v13));
    Object v15 = "t";
    Object v16 = true;
    Object v17 = ((com.google.javascript.jscomp.Scope)v14).isDeclared(((java.lang.String)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = -15;
    Object v19 = "C";
    Object v20 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v18).intValue()),((java.lang.String)v19));
    ((com.google.javascript.jscomp.TypedScopeCreator)v9).patchGlobalScope(((com.google.javascript.jscomp.Scope)v14),((com.google.javascript.rhino.Node)v20));
    Object v21 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = "undefineL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = "i";
    Object v7 = false;
    Object v8 = ((com.google.javascript.jscomp.CodingConvention)v5).isExported(((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v10 = -15;
    Object v11 = "C";
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    Object v13 = -15;
    Object v14 = "C";
    Object v15 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v13).intValue()),((java.lang.String)v14));
    Object v16 = null;
    Object v17 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v15),((com.google.javascript.rhino.jstype.ObjectType)v16));
    Object v18 = ((com.google.javascript.jscomp.Scope)v17).getArgumentsVar();
    Object v19 = ((com.google.javascript.jscomp.TypedScopeCreator)v9).createScope(((com.google.javascript.rhino.Node)v12),((com.google.javascript.jscomp.Scope)v17));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = "undefineL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = "i";
    Object v7 = false;
    Object v8 = ((com.google.javascript.jscomp.CodingConvention)v5).isExported(((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v10 = -15;
    Object v11 = "C";
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    Object v13 = -15;
    Object v14 = "C";
    Object v15 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v13).intValue()),((java.lang.String)v14));
    Object v16 = ((com.google.javascript.rhino.Node)v12).checkTreeEquals(((com.google.javascript.rhino.Node)v15));
    Object v17 = -15;
    Object v18 = "C";
    Object v19 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v17).intValue()),((java.lang.String)v18));
    Object v20 = null;
    Object v21 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v19),((com.google.javascript.rhino.jstype.ObjectType)v20));
    Object v22 = ((com.google.javascript.jscomp.TypedScopeCreator)v9).createScope(((com.google.javascript.rhino.Node)v12),((com.google.javascript.jscomp.Scope)v21));
    org.junit.Assert.assertNotNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = "undefineL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = "i";
    Object v7 = false;
    Object v8 = ((com.google.javascript.jscomp.CodingConvention)v5).isExported(((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v10 = -15;
    Object v11 = "C";
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    Object v13 = -15;
    Object v14 = "C";
    Object v15 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v13).intValue()),((java.lang.String)v14));
    Object v16 = null;
    Object v17 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v15),((com.google.javascript.rhino.jstype.ObjectType)v16));
    Object v18 = ((com.google.javascript.jscomp.TypedScopeCreator)v9).createScope(((com.google.javascript.rhino.Node)v12),((com.google.javascript.jscomp.Scope)v17));
    Object v19 = -15;
    Object v20 = "C";
    Object v21 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v19).intValue()),((java.lang.String)v20));
    Object v22 = null;
    Object v23 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v21),((com.google.javascript.rhino.jstype.ObjectType)v22));
    Object v24 = "5";
    Object v25 = false;
    Object v26 = ((com.google.javascript.jscomp.Scope)v23).isDeclared(((java.lang.String)v24),(((java.lang.Boolean)v25).booleanValue()));
    Object v27 = -15;
    Object v28 = "C";
    Object v29 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v27).intValue()),((java.lang.String)v28));
    ((com.google.javascript.jscomp.TypedScopeCreator)v9).patchGlobalScope(((com.google.javascript.jscomp.Scope)v23),((com.google.javascript.rhino.Node)v29));
    Object v30 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = "undefineL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = "i";
    Object v7 = false;
    Object v8 = ((com.google.javascript.jscomp.CodingConvention)v5).isExported(((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v10 = -15;
    Object v11 = "C";
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    Object v13 = null;
    Object v14 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.jstype.ObjectType)v13));
    Object v15 = "nul";
    Object v16 = ((com.google.javascript.jscomp.Scope)v14).getSlot(((java.lang.String)v15));
    Object v17 = -15;
    Object v18 = "C";
    Object v19 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v17).intValue()),((java.lang.String)v18));
    ((com.google.javascript.jscomp.TypedScopeCreator)v9).patchGlobalScope(((com.google.javascript.jscomp.Scope)v14),((com.google.javascript.rhino.Node)v19));
    Object v20 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = "undefineL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = "i";
    Object v7 = false;
    Object v8 = ((com.google.javascript.jscomp.CodingConvention)v5).isExported(((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v10 = -15;
    Object v11 = "C";
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    Object v13 = -15;
    Object v14 = "C";
    Object v15 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v13).intValue()),((java.lang.String)v14));
    Object v16 = null;
    Object v17 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v15),((com.google.javascript.rhino.jstype.ObjectType)v16));
    Object v18 = "";
    Object v19 = ((com.google.javascript.jscomp.Scope)v17).getOwnSlot(((java.lang.String)v18));
    Object v20 = ((com.google.javascript.jscomp.TypedScopeCreator)v9).createScope(((com.google.javascript.rhino.Node)v12),((com.google.javascript.jscomp.Scope)v17));
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = "undefineL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = "i";
    Object v7 = false;
    Object v8 = ((com.google.javascript.jscomp.CodingConvention)v5).isExported(((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v10 = -15;
    Object v11 = "C";
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    Object v13 = null;
    Object v14 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.jstype.ObjectType)v13));
    Object v15 = ((com.google.javascript.jscomp.Scope)v14).getVars();
    Object v16 = -15;
    Object v17 = "C";
    Object v18 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v16).intValue()),((java.lang.String)v17));
    ((com.google.javascript.jscomp.TypedScopeCreator)v9).patchGlobalScope(((com.google.javascript.jscomp.Scope)v14),((com.google.javascript.rhino.Node)v18));
    Object v19 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = "undefineL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = "i";
    Object v7 = false;
    Object v8 = ((com.google.javascript.jscomp.CodingConvention)v5).isExported(((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v10 = "undefineL";
    Object v11 = java.nio.charset.Charset.defaultCharset();
    Object v12 = new java.io.PrintStream(((java.lang.String)v10),((java.nio.charset.Charset)v11));
    Object v13 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v12));
    Object v14 = ((com.google.javascript.jscomp.AbstractCompiler)v13).getErrorManager();
    Object v15 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v16 = "i";
    Object v17 = false;
    Object v18 = ((com.google.javascript.jscomp.CodingConvention)v15).isExported(((java.lang.String)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v13),((com.google.javascript.jscomp.CodingConvention)v15));
    Object v20 = -15;
    Object v21 = "C";
    Object v22 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v20).intValue()),((java.lang.String)v21));
    Object v23 = -15;
    Object v24 = "C";
    Object v25 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v23).intValue()),((java.lang.String)v24));
    Object v26 = null;
    Object v27 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v25),((com.google.javascript.rhino.jstype.ObjectType)v26));
    Object v28 = "JSCompilr_renameProperty";
    Object v29 = ((com.google.javascript.jscomp.Scope)v27).getVar(((java.lang.String)v28));
    Object v30 = ((com.google.javascript.jscomp.TypedScopeCreator)v19).createScope(((com.google.javascript.rhino.Node)v22),((com.google.javascript.jscomp.Scope)v27));
    Object v31 = -15;
    Object v32 = "C";
    Object v33 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v31).intValue()),((java.lang.String)v32));
    Object v34 = ((com.google.javascript.rhino.Node)v33).siblings();
    ((com.google.javascript.jscomp.TypedScopeCreator)v9).patchGlobalScope(((com.google.javascript.jscomp.Scope)v30),((com.google.javascript.rhino.Node)v33));
    Object v35 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = "undefineL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = "i";
    Object v7 = false;
    Object v8 = ((com.google.javascript.jscomp.CodingConvention)v5).isExported(((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v10 = -15;
    Object v11 = "C";
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    Object v13 = null;
    Object v14 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.jstype.ObjectType)v13));
    Object v15 = ((com.google.javascript.jscomp.Scope)v14).getVarCount();
    Object v16 = -15;
    Object v17 = "C";
    Object v18 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v16).intValue()),((java.lang.String)v17));
    ((com.google.javascript.jscomp.TypedScopeCreator)v9).patchGlobalScope(((com.google.javascript.jscomp.Scope)v14),((com.google.javascript.rhino.Node)v18));
    Object v19 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = "undefineL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = "i";
    Object v7 = false;
    Object v8 = ((com.google.javascript.jscomp.CodingConvention)v5).isExported(((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v10 = -15;
    Object v11 = "C";
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    Object v13 = ((com.google.javascript.rhino.Node)v12).getInputId();
    Object v14 = "undefineL";
    Object v15 = java.nio.charset.Charset.defaultCharset();
    Object v16 = new java.io.PrintStream(((java.lang.String)v14),((java.nio.charset.Charset)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v16));
    Object v18 = ((com.google.javascript.jscomp.AbstractCompiler)v17).getErrorManager();
    Object v19 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v20 = "i";
    Object v21 = false;
    Object v22 = ((com.google.javascript.jscomp.CodingConvention)v19).isExported(((java.lang.String)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v17),((com.google.javascript.jscomp.CodingConvention)v19));
    Object v24 = -15;
    Object v25 = "C";
    Object v26 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v24).intValue()),((java.lang.String)v25));
    Object v27 = -15;
    Object v28 = "C";
    Object v29 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v27).intValue()),((java.lang.String)v28));
    Object v30 = null;
    Object v31 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v29),((com.google.javascript.rhino.jstype.ObjectType)v30));
    Object v32 = "Q";
    Object v33 = ((com.google.javascript.jscomp.Scope)v31).getOwnSlot(((java.lang.String)v32));
    Object v34 = ((com.google.javascript.jscomp.TypedScopeCreator)v23).createScope(((com.google.javascript.rhino.Node)v26),((com.google.javascript.jscomp.Scope)v31));
    Object v35 = ((com.google.javascript.jscomp.TypedScopeCreator)v9).createScope(((com.google.javascript.rhino.Node)v12),((com.google.javascript.jscomp.Scope)v34));
    org.junit.Assert.assertNotNull(v35);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = "undefineL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = "i";
    Object v7 = false;
    Object v8 = ((com.google.javascript.jscomp.CodingConvention)v5).isExported(((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v10 = "undefineL";
    Object v11 = java.nio.charset.Charset.defaultCharset();
    Object v12 = new java.io.PrintStream(((java.lang.String)v10),((java.nio.charset.Charset)v11));
    Object v13 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v12));
    Object v14 = ((com.google.javascript.jscomp.AbstractCompiler)v13).getErrorManager();
    Object v15 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v16 = "i";
    Object v17 = false;
    Object v18 = ((com.google.javascript.jscomp.CodingConvention)v15).isExported(((java.lang.String)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v13),((com.google.javascript.jscomp.CodingConvention)v15));
    Object v20 = -15;
    Object v21 = "C";
    Object v22 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v20).intValue()),((java.lang.String)v21));
    Object v23 = -15;
    Object v24 = "C";
    Object v25 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v23).intValue()),((java.lang.String)v24));
    ((com.google.javascript.rhino.Node)v22).addChildrenToFront(((com.google.javascript.rhino.Node)v25));
    Object v26 = null;
    Object v27 = -15;
    Object v28 = "C";
    Object v29 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v27).intValue()),((java.lang.String)v28));
    Object v30 = null;
    Object v31 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v29),((com.google.javascript.rhino.jstype.ObjectType)v30));
    Object v32 = ((com.google.javascript.jscomp.TypedScopeCreator)v19).createScope(((com.google.javascript.rhino.Node)v22),((com.google.javascript.jscomp.Scope)v31));
    Object v33 = -15;
    Object v34 = "C";
    Object v35 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v33).intValue()),((java.lang.String)v34));
    ((com.google.javascript.jscomp.TypedScopeCreator)v9).patchGlobalScope(((com.google.javascript.jscomp.Scope)v32),((com.google.javascript.rhino.Node)v35));
    Object v36 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = "undefineL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = "i";
    Object v7 = false;
    Object v8 = ((com.google.javascript.jscomp.CodingConvention)v5).isExported(((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v10 = -15;
    Object v11 = "C";
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    Object v13 = null;
    Object v14 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.jstype.ObjectType)v13));
    Object v15 = "n";
    Object v16 = ((com.google.javascript.jscomp.Scope)v14).getSlot(((java.lang.String)v15));
    Object v17 = -15;
    Object v18 = "C";
    Object v19 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v17).intValue()),((java.lang.String)v18));
    ((com.google.javascript.jscomp.TypedScopeCreator)v9).patchGlobalScope(((com.google.javascript.jscomp.Scope)v14),((com.google.javascript.rhino.Node)v19));
    Object v20 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = "undefineL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = "i";
    Object v7 = false;
    Object v8 = ((com.google.javascript.jscomp.CodingConvention)v5).isExported(((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v10 = "undefineL";
    Object v11 = java.nio.charset.Charset.defaultCharset();
    Object v12 = new java.io.PrintStream(((java.lang.String)v10),((java.nio.charset.Charset)v11));
    Object v13 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v12));
    Object v14 = ((com.google.javascript.jscomp.AbstractCompiler)v13).getErrorManager();
    Object v15 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v16 = "i";
    Object v17 = false;
    Object v18 = ((com.google.javascript.jscomp.CodingConvention)v15).isExported(((java.lang.String)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v13),((com.google.javascript.jscomp.CodingConvention)v15));
    Object v20 = -15;
    Object v21 = "C";
    Object v22 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v20).intValue()),((java.lang.String)v21));
    Object v23 = -15;
    Object v24 = "C";
    Object v25 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v23).intValue()),((java.lang.String)v24));
    Object v26 = null;
    Object v27 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v25),((com.google.javascript.rhino.jstype.ObjectType)v26));
    Object v28 = ((com.google.javascript.jscomp.Scope)v27).getAllSymbols();
    Object v29 = ((com.google.javascript.jscomp.TypedScopeCreator)v19).createScope(((com.google.javascript.rhino.Node)v22),((com.google.javascript.jscomp.Scope)v27));
    Object v30 = -15;
    Object v31 = "C";
    Object v32 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v30).intValue()),((java.lang.String)v31));
    ((com.google.javascript.jscomp.TypedScopeCreator)v9).patchGlobalScope(((com.google.javascript.jscomp.Scope)v29),((com.google.javascript.rhino.Node)v32));
    Object v33 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = "undefineL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = "i";
    Object v7 = false;
    Object v8 = ((com.google.javascript.jscomp.CodingConvention)v5).isExported(((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v10 = -15;
    Object v11 = "C";
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    Object v13 = -15;
    Object v14 = "C";
    Object v15 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v13).intValue()),((java.lang.String)v14));
    Object v16 = null;
    Object v17 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v15),((com.google.javascript.rhino.jstype.ObjectType)v16));
    Object v18 = "instanceof";
    Object v19 = ((com.google.javascript.jscomp.Scope)v17).getVar(((java.lang.String)v18));
    Object v20 = ((com.google.javascript.jscomp.TypedScopeCreator)v9).createScope(((com.google.javascript.rhino.Node)v12),((com.google.javascript.jscomp.Scope)v17));
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = "undefineL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = "i";
    Object v7 = false;
    Object v8 = ((com.google.javascript.jscomp.CodingConvention)v5).isExported(((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v10 = -15;
    Object v11 = "C";
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    Object v13 = "undefineL";
    Object v14 = java.nio.charset.Charset.defaultCharset();
    Object v15 = new java.io.PrintStream(((java.lang.String)v13),((java.nio.charset.Charset)v14));
    Object v16 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v15));
    Object v17 = ((com.google.javascript.jscomp.AbstractCompiler)v16).getErrorManager();
    Object v18 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v19 = "i";
    Object v20 = false;
    Object v21 = ((com.google.javascript.jscomp.CodingConvention)v18).isExported(((java.lang.String)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v16),((com.google.javascript.jscomp.CodingConvention)v18));
    Object v23 = -15;
    Object v24 = "C";
    Object v25 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v23).intValue()),((java.lang.String)v24));
    Object v26 = ((com.google.javascript.jscomp.TypedScopeCreator)v22).createInitialScope(((com.google.javascript.rhino.Node)v25));
    Object v27 = ((com.google.javascript.jscomp.TypedScopeCreator)v9).createScope(((com.google.javascript.rhino.Node)v12),((com.google.javascript.jscomp.Scope)v26));
    org.junit.Assert.assertNotNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = "undefineL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = "i";
    Object v7 = false;
    Object v8 = ((com.google.javascript.jscomp.CodingConvention)v5).isExported(((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v10 = -15;
    Object v11 = "C";
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    Object v13 = null;
    Object v14 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.jstype.ObjectType)v13));
    Object v15 = -15;
    Object v16 = "C";
    Object v17 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v15).intValue()),((java.lang.String)v16));
    Object v18 = -15;
    Object v19 = "C";
    Object v20 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v18).intValue()),((java.lang.String)v19));
    ((com.google.javascript.rhino.Node)v17).addChildrenToBack(((com.google.javascript.rhino.Node)v20));
    Object v21 = null;
    ((com.google.javascript.jscomp.TypedScopeCreator)v9).patchGlobalScope(((com.google.javascript.jscomp.Scope)v14),((com.google.javascript.rhino.Node)v17));
    Object v22 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = "undefineL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = "i";
    Object v7 = false;
    Object v8 = ((com.google.javascript.jscomp.CodingConvention)v5).isExported(((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v10 = -15;
    Object v11 = "C";
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    Object v13 = "undefineL";
    Object v14 = java.nio.charset.Charset.defaultCharset();
    Object v15 = new java.io.PrintStream(((java.lang.String)v13),((java.nio.charset.Charset)v14));
    Object v16 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v15));
    Object v17 = ((com.google.javascript.jscomp.AbstractCompiler)v16).getErrorManager();
    Object v18 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v19 = "i";
    Object v20 = false;
    Object v21 = ((com.google.javascript.jscomp.CodingConvention)v18).isExported(((java.lang.String)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v16),((com.google.javascript.jscomp.CodingConvention)v18));
    Object v23 = -15;
    Object v24 = "C";
    Object v25 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v23).intValue()),((java.lang.String)v24));
    Object v26 = ((com.google.javascript.jscomp.TypedScopeCreator)v22).createInitialScope(((com.google.javascript.rhino.Node)v25));
    Object v27 = ((com.google.javascript.jscomp.TypedScopeCreator)v9).createScope(((com.google.javascript.rhino.Node)v12),((com.google.javascript.jscomp.Scope)v26));
    Object v28 = -15;
    Object v29 = "C";
    Object v30 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v28).intValue()),((java.lang.String)v29));
    Object v31 = null;
    Object v32 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v30),((com.google.javascript.rhino.jstype.ObjectType)v31));
    Object v33 = -15;
    Object v34 = "C";
    Object v35 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v33).intValue()),((java.lang.String)v34));
    ((com.google.javascript.jscomp.TypedScopeCreator)v9).patchGlobalScope(((com.google.javascript.jscomp.Scope)v32),((com.google.javascript.rhino.Node)v35));
    Object v36 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = "undefineL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = "i";
    Object v7 = false;
    Object v8 = ((com.google.javascript.jscomp.CodingConvention)v5).isExported(((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v10 = -15;
    Object v11 = "C";
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    Object v13 = " ^=< ";
    Object v14 = new byte[]{Byte.valueOf((byte)0)};
    Object v15 = 0;
    Object v16 = 0;
    Object v17 = new java.io.ByteArrayInputStream(((byte[])v14),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = com.google.javascript.jscomp.JSSourceFile.fromInputStream(((java.lang.String)v13),((java.io.InputStream)v17));
    ((com.google.javascript.rhino.Node)v12).setStaticSourceFile(((com.google.javascript.rhino.jstype.StaticSourceFile)v18));
    Object v19 = null;
    Object v20 = -15;
    Object v21 = "C";
    Object v22 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v20).intValue()),((java.lang.String)v21));
    Object v23 = null;
    Object v24 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v22),((com.google.javascript.rhino.jstype.ObjectType)v23));
    Object v25 = ((com.google.javascript.jscomp.TypedScopeCreator)v9).createScope(((com.google.javascript.rhino.Node)v12),((com.google.javascript.jscomp.Scope)v24));
    org.junit.Assert.assertNotNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = "undefineL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = "i";
    Object v7 = false;
    Object v8 = ((com.google.javascript.jscomp.CodingConvention)v5).isExported(((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v10 = -15;
    Object v11 = "C";
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    Object v13 = "undefineL";
    Object v14 = java.nio.charset.Charset.defaultCharset();
    Object v15 = new java.io.PrintStream(((java.lang.String)v13),((java.nio.charset.Charset)v14));
    Object v16 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v15));
    Object v17 = ((com.google.javascript.jscomp.AbstractCompiler)v16).getErrorManager();
    Object v18 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v19 = "i";
    Object v20 = false;
    Object v21 = ((com.google.javascript.jscomp.CodingConvention)v18).isExported(((java.lang.String)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v16),((com.google.javascript.jscomp.CodingConvention)v18));
    Object v23 = -15;
    Object v24 = "C";
    Object v25 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v23).intValue()),((java.lang.String)v24));
    Object v26 = -15;
    Object v27 = "C";
    Object v28 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v26).intValue()),((java.lang.String)v27));
    Object v29 = null;
    Object v30 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v28),((com.google.javascript.rhino.jstype.ObjectType)v29));
    Object v31 = "instanceof";
    Object v32 = ((com.google.javascript.jscomp.Scope)v30).getVar(((java.lang.String)v31));
    Object v33 = ((com.google.javascript.jscomp.TypedScopeCreator)v22).createScope(((com.google.javascript.rhino.Node)v25),((com.google.javascript.jscomp.Scope)v30));
    Object v34 = ((com.google.javascript.jscomp.TypedScopeCreator)v9).createScope(((com.google.javascript.rhino.Node)v12),((com.google.javascript.jscomp.Scope)v33));
    org.junit.Assert.assertNotNull(v34);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = "undefineL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = "i";
    Object v7 = false;
    Object v8 = ((com.google.javascript.jscomp.CodingConvention)v5).isExported(((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v10 = -15;
    Object v11 = "C";
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    Object v13 = true;
    ((com.google.javascript.rhino.Node)v12).setIsSyntheticBlock((((java.lang.Boolean)v13).booleanValue()));
    Object v14 = null;
    Object v15 = "undefineL";
    Object v16 = java.nio.charset.Charset.defaultCharset();
    Object v17 = new java.io.PrintStream(((java.lang.String)v15),((java.nio.charset.Charset)v16));
    Object v18 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v17));
    Object v19 = ((com.google.javascript.jscomp.AbstractCompiler)v18).getErrorManager();
    Object v20 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v21 = "i";
    Object v22 = false;
    Object v23 = ((com.google.javascript.jscomp.CodingConvention)v20).isExported(((java.lang.String)v21),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v18),((com.google.javascript.jscomp.CodingConvention)v20));
    Object v25 = -15;
    Object v26 = "C";
    Object v27 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v25).intValue()),((java.lang.String)v26));
    Object v28 = -15;
    Object v29 = "C";
    Object v30 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v28).intValue()),((java.lang.String)v29));
    Object v31 = null;
    Object v32 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v30),((com.google.javascript.rhino.jstype.ObjectType)v31));
    Object v33 = ((com.google.javascript.jscomp.TypedScopeCreator)v24).createScope(((com.google.javascript.rhino.Node)v27),((com.google.javascript.jscomp.Scope)v32));
    Object v34 = -15;
    Object v35 = "C";
    Object v36 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v34).intValue()),((java.lang.String)v35));
    Object v37 = ((com.google.javascript.jscomp.TypedScopeCreator)v24).createInitialScope(((com.google.javascript.rhino.Node)v36));
    Object v38 = ((com.google.javascript.jscomp.TypedScopeCreator)v9).createScope(((com.google.javascript.rhino.Node)v12),((com.google.javascript.jscomp.Scope)v37));
    org.junit.Assert.assertNotNull(v38);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = "undefineL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = "i";
    Object v7 = false;
    Object v8 = ((com.google.javascript.jscomp.CodingConvention)v5).isExported(((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v10 = -15;
    Object v11 = "C";
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    Object v13 = ((com.google.javascript.rhino.Node)v12).isNoSideEffectsCall();
    Object v14 = -15;
    Object v15 = "C";
    Object v16 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v14).intValue()),((java.lang.String)v15));
    Object v17 = null;
    Object v18 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v16),((com.google.javascript.rhino.jstype.ObjectType)v17));
    Object v19 = ((com.google.javascript.jscomp.Scope)v18).getArgumentsVar();
    Object v20 = ((com.google.javascript.jscomp.TypedScopeCreator)v9).createScope(((com.google.javascript.rhino.Node)v12),((com.google.javascript.jscomp.Scope)v18));
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = "undefineL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = "i";
    Object v7 = false;
    Object v8 = ((com.google.javascript.jscomp.CodingConvention)v5).isExported(((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v10 = -15;
    Object v11 = "C";
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    Object v13 = -15;
    Object v14 = "C";
    Object v15 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v13).intValue()),((java.lang.String)v14));
    Object v16 = null;
    Object v17 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v15),((com.google.javascript.rhino.jstype.ObjectType)v16));
    Object v18 = ((com.google.javascript.jscomp.Scope)v17).getDeclarativelyUnboundVarsWithoutTypes();
    Object v19 = ((com.google.javascript.jscomp.TypedScopeCreator)v9).createScope(((com.google.javascript.rhino.Node)v12),((com.google.javascript.jscomp.Scope)v17));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = "undefineL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = "i";
    Object v7 = false;
    Object v8 = ((com.google.javascript.jscomp.CodingConvention)v5).isExported(((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v10 = "undefineL";
    Object v11 = java.nio.charset.Charset.defaultCharset();
    Object v12 = new java.io.PrintStream(((java.lang.String)v10),((java.nio.charset.Charset)v11));
    Object v13 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v12));
    Object v14 = ((com.google.javascript.jscomp.AbstractCompiler)v13).getErrorManager();
    Object v15 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v16 = "i";
    Object v17 = false;
    Object v18 = ((com.google.javascript.jscomp.CodingConvention)v15).isExported(((java.lang.String)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v13),((com.google.javascript.jscomp.CodingConvention)v15));
    Object v20 = -15;
    Object v21 = "C";
    Object v22 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v20).intValue()),((java.lang.String)v21));
    Object v23 = -15;
    Object v24 = "C";
    Object v25 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v23).intValue()),((java.lang.String)v24));
    Object v26 = null;
    Object v27 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v25),((com.google.javascript.rhino.jstype.ObjectType)v26));
    Object v28 = "";
    Object v29 = ((com.google.javascript.jscomp.Scope)v27).getOwnSlot(((java.lang.String)v28));
    Object v30 = ((com.google.javascript.jscomp.TypedScopeCreator)v19).createScope(((com.google.javascript.rhino.Node)v22),((com.google.javascript.jscomp.Scope)v27));
    Object v31 = -15;
    Object v32 = "C";
    Object v33 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v31).intValue()),((java.lang.String)v32));
    Object v34 = ((com.google.javascript.rhino.Node)v33).siblings();
    ((com.google.javascript.jscomp.TypedScopeCreator)v9).patchGlobalScope(((com.google.javascript.jscomp.Scope)v30),((com.google.javascript.rhino.Node)v33));
    Object v35 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = "undefineL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = "i";
    Object v7 = false;
    Object v8 = ((com.google.javascript.jscomp.CodingConvention)v5).isExported(((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v10 = "undefineL";
    Object v11 = java.nio.charset.Charset.defaultCharset();
    Object v12 = new java.io.PrintStream(((java.lang.String)v10),((java.nio.charset.Charset)v11));
    Object v13 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v12));
    Object v14 = ((com.google.javascript.jscomp.AbstractCompiler)v13).getErrorManager();
    Object v15 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v16 = "i";
    Object v17 = false;
    Object v18 = ((com.google.javascript.jscomp.CodingConvention)v15).isExported(((java.lang.String)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v13),((com.google.javascript.jscomp.CodingConvention)v15));
    Object v20 = -15;
    Object v21 = "C";
    Object v22 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v20).intValue()),((java.lang.String)v21));
    Object v23 = ((com.google.javascript.rhino.Node)v22).isNoSideEffectsCall();
    Object v24 = -15;
    Object v25 = "C";
    Object v26 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v24).intValue()),((java.lang.String)v25));
    Object v27 = null;
    Object v28 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v26),((com.google.javascript.rhino.jstype.ObjectType)v27));
    Object v29 = ((com.google.javascript.jscomp.Scope)v28).getArgumentsVar();
    Object v30 = ((com.google.javascript.jscomp.TypedScopeCreator)v19).createScope(((com.google.javascript.rhino.Node)v22),((com.google.javascript.jscomp.Scope)v28));
    Object v31 = -15;
    Object v32 = "C";
    Object v33 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v31).intValue()),((java.lang.String)v32));
    ((com.google.javascript.jscomp.TypedScopeCreator)v9).patchGlobalScope(((com.google.javascript.jscomp.Scope)v30),((com.google.javascript.rhino.Node)v33));
    Object v34 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = "undefineL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = "i";
    Object v7 = false;
    Object v8 = ((com.google.javascript.jscomp.CodingConvention)v5).isExported(((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v10 = -15;
    Object v11 = "C";
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    Object v13 = "undefineL";
    Object v14 = java.nio.charset.Charset.defaultCharset();
    Object v15 = new java.io.PrintStream(((java.lang.String)v13),((java.nio.charset.Charset)v14));
    Object v16 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v15));
    Object v17 = ((com.google.javascript.jscomp.AbstractCompiler)v16).getErrorManager();
    Object v18 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v19 = "i";
    Object v20 = false;
    Object v21 = ((com.google.javascript.jscomp.CodingConvention)v18).isExported(((java.lang.String)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v16),((com.google.javascript.jscomp.CodingConvention)v18));
    Object v23 = -15;
    Object v24 = "C";
    Object v25 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v23).intValue()),((java.lang.String)v24));
    Object v26 = -15;
    Object v27 = "C";
    Object v28 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v26).intValue()),((java.lang.String)v27));
    Object v29 = null;
    Object v30 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v28),((com.google.javascript.rhino.jstype.ObjectType)v29));
    Object v31 = "";
    Object v32 = ((com.google.javascript.jscomp.Scope)v30).getOwnSlot(((java.lang.String)v31));
    Object v33 = ((com.google.javascript.jscomp.TypedScopeCreator)v22).createScope(((com.google.javascript.rhino.Node)v25),((com.google.javascript.jscomp.Scope)v30));
    Object v34 = ((com.google.javascript.jscomp.Scope)v33).getArgumentsVar();
    Object v35 = ((com.google.javascript.jscomp.TypedScopeCreator)v9).createScope(((com.google.javascript.rhino.Node)v12),((com.google.javascript.jscomp.Scope)v33));
    org.junit.Assert.assertNotNull(v35);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = "undefineL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = "i";
    Object v7 = false;
    Object v8 = ((com.google.javascript.jscomp.CodingConvention)v5).isExported(((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v10 = "undefineL";
    Object v11 = java.nio.charset.Charset.defaultCharset();
    Object v12 = new java.io.PrintStream(((java.lang.String)v10),((java.nio.charset.Charset)v11));
    Object v13 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v12));
    Object v14 = ((com.google.javascript.jscomp.AbstractCompiler)v13).getErrorManager();
    Object v15 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v16 = "i";
    Object v17 = false;
    Object v18 = ((com.google.javascript.jscomp.CodingConvention)v15).isExported(((java.lang.String)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v13),((com.google.javascript.jscomp.CodingConvention)v15));
    Object v20 = -15;
    Object v21 = "C";
    Object v22 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v20).intValue()),((java.lang.String)v21));
    Object v23 = 1;
    Object v24 = ((com.google.javascript.rhino.Node)v22).getAncestor((((java.lang.Integer)v23).intValue()));
    Object v25 = -15;
    Object v26 = "C";
    Object v27 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v25).intValue()),((java.lang.String)v26));
    Object v28 = null;
    Object v29 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v27),((com.google.javascript.rhino.jstype.ObjectType)v28));
    Object v30 = ((com.google.javascript.jscomp.TypedScopeCreator)v19).createScope(((com.google.javascript.rhino.Node)v22),((com.google.javascript.jscomp.Scope)v29));
    Object v31 = ((com.google.javascript.jscomp.Scope)v30).getVars();
    Object v32 = -15;
    Object v33 = "C";
    Object v34 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v32).intValue()),((java.lang.String)v33));
    Object v35 = false;
    ((com.google.javascript.rhino.Node)v34).setVarArgs((((java.lang.Boolean)v35).booleanValue()));
    Object v36 = null;
    ((com.google.javascript.jscomp.TypedScopeCreator)v9).patchGlobalScope(((com.google.javascript.jscomp.Scope)v30),((com.google.javascript.rhino.Node)v34));
    Object v37 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = "undefineL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v5 = "";
    Object v6 = ((com.google.javascript.jscomp.CodingConvention)v4).isSuperClassReference(((java.lang.String)v5));
    Object v7 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v4));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = "undefineL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = "i";
    Object v7 = false;
    Object v8 = ((com.google.javascript.jscomp.CodingConvention)v5).isExported(((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v10 = "undefineL";
    Object v11 = java.nio.charset.Charset.defaultCharset();
    Object v12 = new java.io.PrintStream(((java.lang.String)v10),((java.nio.charset.Charset)v11));
    Object v13 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v12));
    Object v14 = ((com.google.javascript.jscomp.AbstractCompiler)v13).getErrorManager();
    Object v15 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v16 = "i";
    Object v17 = false;
    Object v18 = ((com.google.javascript.jscomp.CodingConvention)v15).isExported(((java.lang.String)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v13),((com.google.javascript.jscomp.CodingConvention)v15));
    Object v20 = -15;
    Object v21 = "C";
    Object v22 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v20).intValue()),((java.lang.String)v21));
    Object v23 = ((com.google.javascript.rhino.Node)v22).getAncestors();
    Object v24 = -15;
    Object v25 = "C";
    Object v26 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v24).intValue()),((java.lang.String)v25));
    Object v27 = null;
    Object v28 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v26),((com.google.javascript.rhino.jstype.ObjectType)v27));
    Object v29 = ((com.google.javascript.jscomp.TypedScopeCreator)v19).createScope(((com.google.javascript.rhino.Node)v22),((com.google.javascript.jscomp.Scope)v28));
    Object v30 = ((com.google.javascript.jscomp.Scope)v29).getDeclarativelyUnboundVarsWithoutTypes();
    Object v31 = -15;
    Object v32 = "C";
    Object v33 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v31).intValue()),((java.lang.String)v32));
    ((com.google.javascript.jscomp.TypedScopeCreator)v9).patchGlobalScope(((com.google.javascript.jscomp.Scope)v29),((com.google.javascript.rhino.Node)v33));
    Object v34 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = "undefineL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = "i";
    Object v7 = false;
    Object v8 = ((com.google.javascript.jscomp.CodingConvention)v5).isExported(((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v10 = -15;
    Object v11 = "C";
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    Object v13 = -15;
    Object v14 = "C";
    Object v15 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v13).intValue()),((java.lang.String)v14));
    Object v16 = null;
    Object v17 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v15),((com.google.javascript.rhino.jstype.ObjectType)v16));
    Object v18 = ((com.google.javascript.jscomp.TypedScopeCreator)v9).createScope(((com.google.javascript.rhino.Node)v12),((com.google.javascript.jscomp.Scope)v17));
    Object v19 = -15;
    Object v20 = "C";
    Object v21 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v19).intValue()),((java.lang.String)v20));
    Object v22 = null;
    Object v23 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v21),((com.google.javascript.rhino.jstype.ObjectType)v22));
    Object v24 = -15;
    Object v25 = "C";
    Object v26 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v24).intValue()),((java.lang.String)v25));
    Object v27 = 1;
    Object v28 = false;
    ((com.google.javascript.rhino.Node)v26).putBooleanProp((((java.lang.Integer)v27).intValue()),(((java.lang.Boolean)v28).booleanValue()));
    Object v29 = null;
    ((com.google.javascript.jscomp.TypedScopeCreator)v9).patchGlobalScope(((com.google.javascript.jscomp.Scope)v23),((com.google.javascript.rhino.Node)v26));
    Object v30 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = "undefineL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = "i";
    Object v7 = false;
    Object v8 = ((com.google.javascript.jscomp.CodingConvention)v5).isExported(((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v10 = -15;
    Object v11 = "C";
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    Object v13 = null;
    Object v14 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.jstype.ObjectType)v13));
    Object v15 = "";
    Object v16 = ((com.google.javascript.jscomp.Scope)v14).getSlot(((java.lang.String)v15));
    Object v17 = -15;
    Object v18 = "C";
    Object v19 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v17).intValue()),((java.lang.String)v18));
    Object v20 = ((com.google.javascript.rhino.Node)v19).isLocalResultCall();
    ((com.google.javascript.jscomp.TypedScopeCreator)v9).patchGlobalScope(((com.google.javascript.jscomp.Scope)v14),((com.google.javascript.rhino.Node)v19));
    Object v21 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = "undefineL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = "i";
    Object v7 = false;
    Object v8 = ((com.google.javascript.jscomp.CodingConvention)v5).isExported(((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v10 = -15;
    Object v11 = "C";
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    Object v13 = -15;
    Object v14 = "C";
    Object v15 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v13).intValue()),((java.lang.String)v14));
    Object v16 = null;
    Object v17 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v15),((com.google.javascript.rhino.jstype.ObjectType)v16));
    Object v18 = ((com.google.javascript.jscomp.TypedScopeCreator)v9).createScope(((com.google.javascript.rhino.Node)v12),((com.google.javascript.jscomp.Scope)v17));
    Object v19 = -15;
    Object v20 = "C";
    Object v21 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v19).intValue()),((java.lang.String)v20));
    Object v22 = -15;
    Object v23 = "C";
    Object v24 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v22).intValue()),((java.lang.String)v23));
    Object v25 = null;
    Object v26 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v24),((com.google.javascript.rhino.jstype.ObjectType)v25));
    Object v27 = "strnng";
    Object v28 = ((com.google.javascript.jscomp.Scope)v26).getVar(((java.lang.String)v27));
    Object v29 = ((com.google.javascript.jscomp.TypedScopeCreator)v9).createScope(((com.google.javascript.rhino.Node)v21),((com.google.javascript.jscomp.Scope)v26));
    org.junit.Assert.assertNotNull(v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = "undefineL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = "i";
    Object v7 = false;
    Object v8 = ((com.google.javascript.jscomp.CodingConvention)v5).isExported(((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v10 = -15;
    Object v11 = "C";
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    Object v13 = null;
    Object v14 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.jstype.ObjectType)v13));
    Object v15 = "";
    Object v16 = ((com.google.javascript.jscomp.Scope)v14).getOwnSlot(((java.lang.String)v15));
    Object v17 = -15;
    Object v18 = "C";
    Object v19 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v17).intValue()),((java.lang.String)v18));
    ((com.google.javascript.jscomp.TypedScopeCreator)v9).patchGlobalScope(((com.google.javascript.jscomp.Scope)v14),((com.google.javascript.rhino.Node)v19));
    Object v20 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = "undefineL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = "i";
    Object v7 = false;
    Object v8 = ((com.google.javascript.jscomp.CodingConvention)v5).isExported(((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v10 = "undefineL";
    Object v11 = java.nio.charset.Charset.defaultCharset();
    Object v12 = new java.io.PrintStream(((java.lang.String)v10),((java.nio.charset.Charset)v11));
    Object v13 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v12));
    Object v14 = ((com.google.javascript.jscomp.AbstractCompiler)v13).getErrorManager();
    Object v15 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v16 = "i";
    Object v17 = false;
    Object v18 = ((com.google.javascript.jscomp.CodingConvention)v15).isExported(((java.lang.String)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v13),((com.google.javascript.jscomp.CodingConvention)v15));
    Object v20 = -15;
    Object v21 = "C";
    Object v22 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v20).intValue()),((java.lang.String)v21));
    Object v23 = 1;
    Object v24 = ((com.google.javascript.rhino.Node)v22).getAncestor((((java.lang.Integer)v23).intValue()));
    Object v25 = -15;
    Object v26 = "C";
    Object v27 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v25).intValue()),((java.lang.String)v26));
    Object v28 = null;
    Object v29 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v27),((com.google.javascript.rhino.jstype.ObjectType)v28));
    Object v30 = ((com.google.javascript.jscomp.TypedScopeCreator)v19).createScope(((com.google.javascript.rhino.Node)v22),((com.google.javascript.jscomp.Scope)v29));
    Object v31 = -15;
    Object v32 = "C";
    Object v33 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v31).intValue()),((java.lang.String)v32));
    ((com.google.javascript.jscomp.TypedScopeCreator)v9).patchGlobalScope(((com.google.javascript.jscomp.Scope)v30),((com.google.javascript.rhino.Node)v33));
    Object v34 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = "undefineL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = "i";
    Object v7 = false;
    Object v8 = ((com.google.javascript.jscomp.CodingConvention)v5).isExported(((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v10 = -15;
    Object v11 = "C";
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    Object v13 = null;
    Object v14 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.jstype.ObjectType)v13));
    Object v15 = -15;
    Object v16 = "C";
    Object v17 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v15).intValue()),((java.lang.String)v16));
    Object v18 = 1;
    Object v19 = ((com.google.javascript.rhino.Node)v17).getIntProp((((java.lang.Integer)v18).intValue()));
    ((com.google.javascript.jscomp.TypedScopeCreator)v9).patchGlobalScope(((com.google.javascript.jscomp.Scope)v14),((com.google.javascript.rhino.Node)v17));
    Object v20 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = "undefineL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = "i";
    Object v7 = false;
    Object v8 = ((com.google.javascript.jscomp.CodingConvention)v5).isExported(((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v10 = -15;
    Object v11 = "C";
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    Object v13 = null;
    Object v14 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.jstype.ObjectType)v13));
    Object v15 = -15;
    Object v16 = "C";
    Object v17 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v15).intValue()),((java.lang.String)v16));
    Object v18 = -15;
    Object v19 = "C";
    Object v20 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v18).intValue()),((java.lang.String)v19));
    Object v21 = ((com.google.javascript.rhino.Node)v17).isEquivalentTo(((com.google.javascript.rhino.Node)v20));
    ((com.google.javascript.jscomp.TypedScopeCreator)v9).patchGlobalScope(((com.google.javascript.jscomp.Scope)v14),((com.google.javascript.rhino.Node)v17));
    Object v22 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = "undefineL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = "i";
    Object v7 = false;
    Object v8 = ((com.google.javascript.jscomp.CodingConvention)v5).isExported(((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v10 = "undefineL";
    Object v11 = java.nio.charset.Charset.defaultCharset();
    Object v12 = new java.io.PrintStream(((java.lang.String)v10),((java.nio.charset.Charset)v11));
    Object v13 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v12));
    Object v14 = ((com.google.javascript.jscomp.AbstractCompiler)v13).getErrorManager();
    Object v15 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v16 = "i";
    Object v17 = false;
    Object v18 = ((com.google.javascript.jscomp.CodingConvention)v15).isExported(((java.lang.String)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v13),((com.google.javascript.jscomp.CodingConvention)v15));
    Object v20 = -15;
    Object v21 = "C";
    Object v22 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v20).intValue()),((java.lang.String)v21));
    Object v23 = -15;
    Object v24 = "C";
    Object v25 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v23).intValue()),((java.lang.String)v24));
    Object v26 = null;
    Object v27 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v25),((com.google.javascript.rhino.jstype.ObjectType)v26));
    Object v28 = ((com.google.javascript.jscomp.TypedScopeCreator)v19).createScope(((com.google.javascript.rhino.Node)v22),((com.google.javascript.jscomp.Scope)v27));
    Object v29 = -15;
    Object v30 = "C";
    Object v31 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v29).intValue()),((java.lang.String)v30));
    Object v32 = 3;
    ((com.google.javascript.rhino.Node)v31).setCharno((((java.lang.Integer)v32).intValue()));
    Object v33 = null;
    Object v34 = ((com.google.javascript.jscomp.TypedScopeCreator)v19).createInitialScope(((com.google.javascript.rhino.Node)v31));
    Object v35 = ((com.google.javascript.jscomp.Scope)v34).getDeclarativelyUnboundVarsWithoutTypes();
    Object v36 = -15;
    Object v37 = "C";
    Object v38 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v36).intValue()),((java.lang.String)v37));
    ((com.google.javascript.jscomp.TypedScopeCreator)v9).patchGlobalScope(((com.google.javascript.jscomp.Scope)v34),((com.google.javascript.rhino.Node)v38));
    Object v39 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = "undefineL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = "i";
    Object v7 = false;
    Object v8 = ((com.google.javascript.jscomp.CodingConvention)v5).isExported(((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v10 = -15;
    Object v11 = "C";
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    Object v13 = null;
    Object v14 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.jstype.ObjectType)v13));
    Object v15 = -15;
    Object v16 = "C";
    Object v17 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v15).intValue()),((java.lang.String)v16));
    Object v18 = -15;
    Object v19 = "C";
    Object v20 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v18).intValue()),((java.lang.String)v19));
    Object v21 = ((com.google.javascript.rhino.Node)v17).copyInformationFromForTree(((com.google.javascript.rhino.Node)v20));
    ((com.google.javascript.jscomp.TypedScopeCreator)v9).patchGlobalScope(((com.google.javascript.jscomp.Scope)v14),((com.google.javascript.rhino.Node)v17));
    Object v22 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = "undefineL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = "i";
    Object v7 = false;
    Object v8 = ((com.google.javascript.jscomp.CodingConvention)v5).isExported(((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v10 = "undefineL";
    Object v11 = java.nio.charset.Charset.defaultCharset();
    Object v12 = new java.io.PrintStream(((java.lang.String)v10),((java.nio.charset.Charset)v11));
    Object v13 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v12));
    Object v14 = ((com.google.javascript.jscomp.AbstractCompiler)v13).getErrorManager();
    Object v15 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v16 = "i";
    Object v17 = false;
    Object v18 = ((com.google.javascript.jscomp.CodingConvention)v15).isExported(((java.lang.String)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v13),((com.google.javascript.jscomp.CodingConvention)v15));
    Object v20 = -15;
    Object v21 = "C";
    Object v22 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v20).intValue()),((java.lang.String)v21));
    Object v23 = -15;
    Object v24 = "C";
    Object v25 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v23).intValue()),((java.lang.String)v24));
    Object v26 = null;
    Object v27 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v25),((com.google.javascript.rhino.jstype.ObjectType)v26));
    Object v28 = ((com.google.javascript.jscomp.Scope)v27).getAllSymbols();
    Object v29 = ((com.google.javascript.jscomp.TypedScopeCreator)v19).createScope(((com.google.javascript.rhino.Node)v22),((com.google.javascript.jscomp.Scope)v27));
    Object v30 = ((com.google.javascript.jscomp.Scope)v29).getVarCount();
    Object v31 = -15;
    Object v32 = "C";
    Object v33 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v31).intValue()),((java.lang.String)v32));
    ((com.google.javascript.jscomp.TypedScopeCreator)v9).patchGlobalScope(((com.google.javascript.jscomp.Scope)v29),((com.google.javascript.rhino.Node)v33));
    Object v34 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = "undefineL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = "i";
    Object v7 = false;
    Object v8 = ((com.google.javascript.jscomp.CodingConvention)v5).isExported(((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v10 = "undefineL";
    Object v11 = java.nio.charset.Charset.defaultCharset();
    Object v12 = new java.io.PrintStream(((java.lang.String)v10),((java.nio.charset.Charset)v11));
    Object v13 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v12));
    Object v14 = ((com.google.javascript.jscomp.AbstractCompiler)v13).getErrorManager();
    Object v15 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v16 = "i";
    Object v17 = false;
    Object v18 = ((com.google.javascript.jscomp.CodingConvention)v15).isExported(((java.lang.String)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v13),((com.google.javascript.jscomp.CodingConvention)v15));
    Object v20 = -15;
    Object v21 = "C";
    Object v22 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v20).intValue()),((java.lang.String)v21));
    Object v23 = 1;
    Object v24 = ((com.google.javascript.rhino.Node)v22).getAncestor((((java.lang.Integer)v23).intValue()));
    Object v25 = -15;
    Object v26 = "C";
    Object v27 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v25).intValue()),((java.lang.String)v26));
    Object v28 = null;
    Object v29 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v27),((com.google.javascript.rhino.jstype.ObjectType)v28));
    Object v30 = ((com.google.javascript.jscomp.TypedScopeCreator)v19).createScope(((com.google.javascript.rhino.Node)v22),((com.google.javascript.jscomp.Scope)v29));
    Object v31 = ((com.google.javascript.jscomp.Scope)v30).getVarCount();
    Object v32 = -15;
    Object v33 = "C";
    Object v34 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v32).intValue()),((java.lang.String)v33));
    ((com.google.javascript.jscomp.TypedScopeCreator)v9).patchGlobalScope(((com.google.javascript.jscomp.Scope)v30),((com.google.javascript.rhino.Node)v34));
    Object v35 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = "undefineL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = "i";
    Object v7 = false;
    Object v8 = ((com.google.javascript.jscomp.CodingConvention)v5).isExported(((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v10 = -15;
    Object v11 = "C";
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    Object v13 = "undefineL";
    Object v14 = java.nio.charset.Charset.defaultCharset();
    Object v15 = new java.io.PrintStream(((java.lang.String)v13),((java.nio.charset.Charset)v14));
    Object v16 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v15));
    Object v17 = ((com.google.javascript.jscomp.AbstractCompiler)v16).getErrorManager();
    Object v18 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v19 = "i";
    Object v20 = false;
    Object v21 = ((com.google.javascript.jscomp.CodingConvention)v18).isExported(((java.lang.String)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v16),((com.google.javascript.jscomp.CodingConvention)v18));
    Object v23 = -15;
    Object v24 = "C";
    Object v25 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v23).intValue()),((java.lang.String)v24));
    Object v26 = -15;
    Object v27 = "C";
    Object v28 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v26).intValue()),((java.lang.String)v27));
    Object v29 = null;
    Object v30 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v28),((com.google.javascript.rhino.jstype.ObjectType)v29));
    Object v31 = "";
    Object v32 = ((com.google.javascript.jscomp.Scope)v30).getOwnSlot(((java.lang.String)v31));
    Object v33 = ((com.google.javascript.jscomp.TypedScopeCreator)v22).createScope(((com.google.javascript.rhino.Node)v25),((com.google.javascript.jscomp.Scope)v30));
    Object v34 = ((com.google.javascript.jscomp.TypedScopeCreator)v9).createScope(((com.google.javascript.rhino.Node)v12),((com.google.javascript.jscomp.Scope)v33));
    org.junit.Assert.assertNotNull(v34);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = "undefineL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = "i";
    Object v7 = false;
    Object v8 = ((com.google.javascript.jscomp.CodingConvention)v5).isExported(((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v10 = "undefineL";
    Object v11 = java.nio.charset.Charset.defaultCharset();
    Object v12 = new java.io.PrintStream(((java.lang.String)v10),((java.nio.charset.Charset)v11));
    Object v13 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v12));
    Object v14 = ((com.google.javascript.jscomp.AbstractCompiler)v13).getErrorManager();
    Object v15 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v16 = "i";
    Object v17 = false;
    Object v18 = ((com.google.javascript.jscomp.CodingConvention)v15).isExported(((java.lang.String)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v13),((com.google.javascript.jscomp.CodingConvention)v15));
    Object v20 = -15;
    Object v21 = "C";
    Object v22 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v20).intValue()),((java.lang.String)v21));
    Object v23 = -15;
    Object v24 = "C";
    Object v25 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v23).intValue()),((java.lang.String)v24));
    ((com.google.javascript.rhino.Node)v22).addChildrenToFront(((com.google.javascript.rhino.Node)v25));
    Object v26 = null;
    Object v27 = -15;
    Object v28 = "C";
    Object v29 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v27).intValue()),((java.lang.String)v28));
    Object v30 = null;
    Object v31 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v29),((com.google.javascript.rhino.jstype.ObjectType)v30));
    Object v32 = ((com.google.javascript.jscomp.TypedScopeCreator)v19).createScope(((com.google.javascript.rhino.Node)v22),((com.google.javascript.jscomp.Scope)v31));
    Object v33 = ((com.google.javascript.jscomp.Scope)v32).getArgumentsVar();
    Object v34 = -15;
    Object v35 = "C";
    Object v36 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v34).intValue()),((java.lang.String)v35));
    ((com.google.javascript.jscomp.TypedScopeCreator)v9).patchGlobalScope(((com.google.javascript.jscomp.Scope)v32),((com.google.javascript.rhino.Node)v36));
    Object v37 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = "undefineL";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = "i";
    Object v7 = false;
    Object v8 = ((com.google.javascript.jscomp.CodingConvention)v5).isExported(((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v10 = -15;
    Object v11 = "C";
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    Object v13 = true;
    ((com.google.javascript.rhino.Node)v12).setIsSyntheticBlock((((java.lang.Boolean)v13).booleanValue()));
    Object v14 = null;
    Object v15 = "undefineL";
    Object v16 = java.nio.charset.Charset.defaultCharset();
    Object v17 = new java.io.PrintStream(((java.lang.String)v15),((java.nio.charset.Charset)v16));
    Object v18 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v17));
    Object v19 = ((com.google.javascript.jscomp.AbstractCompiler)v18).getErrorManager();
    Object v20 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v21 = "i";
    Object v22 = false;
    Object v23 = ((com.google.javascript.jscomp.CodingConvention)v20).isExported(((java.lang.String)v21),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v18),((com.google.javascript.jscomp.CodingConvention)v20));
    Object v25 = -15;
    Object v26 = "C";
    Object v27 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v25).intValue()),((java.lang.String)v26));
    Object v28 = ((com.google.javascript.rhino.Node)v27).isFromExterns();
    Object v29 = -15;
    Object v30 = "C";
    Object v31 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v29).intValue()),((java.lang.String)v30));
    Object v32 = null;
    Object v33 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v31),((com.google.javascript.rhino.jstype.ObjectType)v32));
    Object v34 = ((com.google.javascript.jscomp.TypedScopeCreator)v24).createScope(((com.google.javascript.rhino.Node)v27),((com.google.javascript.jscomp.Scope)v33));
    Object v35 = ((com.google.javascript.jscomp.TypedScopeCreator)v9).createScope(((com.google.javascript.rhino.Node)v12),((com.google.javascript.jscomp.Scope)v34));
    org.junit.Assert.assertNotNull(v35);
  }
}
