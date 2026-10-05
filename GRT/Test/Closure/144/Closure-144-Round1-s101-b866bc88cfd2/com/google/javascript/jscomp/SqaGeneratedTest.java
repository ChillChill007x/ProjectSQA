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
  public void test3() throws Throwable {
    try {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "prototy";
    Object v5 = 0;
    Object v6 = ((com.google.javascript.jscomp.SourceExcerptProvider)v3).getSourceRegion(((java.lang.String)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
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
  public void test5() throws Throwable {
    try {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "|";
    Object v5 = -28;
    Object v6 = ((com.google.javascript.jscomp.SourceExcerptProvider)v3).getSourceLine(((java.lang.String)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 0.0D;
    Object v2 = -40;
    Object v3 = 0;
    Object v4 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v1).doubleValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = 0.0D;
    Object v6 = -40;
    Object v7 = 0;
    Object v8 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v5).doubleValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.jstype.ObjectType)v9));
    Object v11 = "ObjeVt";
    Object v12 = ((com.google.javascript.jscomp.Scope)v10).getOwnSlot(((java.lang.String)v11));
    Object v13 = ((com.google.javascript.jscomp.TypedScopeCreator)v0).createScope(((com.google.javascript.rhino.Node)v4),((com.google.javascript.jscomp.Scope)v10));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 0.0D;
    Object v2 = -40;
    Object v3 = 0;
    Object v4 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v1).doubleValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = 0.0D;
    Object v6 = -40;
    Object v7 = 0;
    Object v8 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v5).doubleValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.jstype.ObjectType)v9));
    Object v11 = ((com.google.javascript.jscomp.TypedScopeCreator)v0).createScope(((com.google.javascript.rhino.Node)v4),((com.google.javascript.jscomp.Scope)v10));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
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
  public void test9() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v7 = 0.0D;
    Object v8 = -40;
    Object v9 = 0;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = 0.0D;
    Object v12 = -40;
    Object v13 = 0;
    Object v14 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.jstype.ObjectType)v15));
    Object v17 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.Scope)v16));
    Object v18 = 0.0D;
    Object v19 = -40;
    Object v20 = 0;
    Object v21 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v18).doubleValue()),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
    Object v22 = 0.0D;
    Object v23 = -40;
    Object v24 = 0;
    Object v25 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v22).doubleValue()),(((java.lang.Integer)v23).intValue()),(((java.lang.Integer)v24).intValue()));
    Object v26 = null;
    Object v27 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v25),((com.google.javascript.rhino.jstype.ObjectType)v26));
    Object v28 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v21),((com.google.javascript.jscomp.Scope)v27));
    org.junit.Assert.assertNotNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v7 = 0.0D;
    Object v8 = -40;
    Object v9 = 0;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = 0.0D;
    Object v12 = -40;
    Object v13 = 0;
    Object v14 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.jstype.ObjectType)v15));
    Object v17 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.Scope)v16));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v7 = 0.0D;
    Object v8 = -40;
    Object v9 = 0;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = 0.0D;
    Object v12 = -40;
    Object v13 = 0;
    Object v14 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.jstype.ObjectType)v15));
    Object v17 = ((com.google.javascript.jscomp.Scope)v16).getVars();
    Object v18 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.Scope)v16));
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v7 = 0.0D;
    Object v8 = -40;
    Object v9 = 0;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = 0.0D;
    Object v12 = -40;
    Object v13 = 0;
    Object v14 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.jstype.ObjectType)v15));
    Object v17 = "R";
    Object v18 = ((com.google.javascript.jscomp.Scope)v16).getVar(((java.lang.String)v17));
    Object v19 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.Scope)v16));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v7 = 0.0D;
    Object v8 = -40;
    Object v9 = 0;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = "L";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = ((com.google.javascript.jscomp.AbstractCompiler)v14).getErrorManager();
    Object v16 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v17 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.CodingConvention)v16));
    Object v18 = 0.0D;
    Object v19 = -40;
    Object v20 = 0;
    Object v21 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v18).doubleValue()),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
    Object v22 = 0.0D;
    Object v23 = -40;
    Object v24 = 0;
    Object v25 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v22).doubleValue()),(((java.lang.Integer)v23).intValue()),(((java.lang.Integer)v24).intValue()));
    Object v26 = null;
    Object v27 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v25),((com.google.javascript.rhino.jstype.ObjectType)v26));
    Object v28 = ((com.google.javascript.jscomp.TypedScopeCreator)v17).createScope(((com.google.javascript.rhino.Node)v21),((com.google.javascript.jscomp.Scope)v27));
    Object v29 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.Scope)v28));
    org.junit.Assert.assertNotNull(v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v7 = 0.0D;
    Object v8 = -40;
    Object v9 = 0;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = 0;
    Object v12 = -32;
    ((com.google.javascript.rhino.Node)v10).putIntProp((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v13 = null;
    Object v14 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createInitialScope(((com.google.javascript.rhino.Node)v10));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v5 = ((com.google.javascript.jscomp.CodingConvention)v4).getGlobalObject();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v4));
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
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v7 = 0.0D;
    Object v8 = -40;
    Object v9 = 0;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = false;
    Object v12 = false;
    Object v13 = true;
    Object v14 = ((com.google.javascript.rhino.Node)v10).toString((((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = 0.0D;
    Object v16 = -40;
    Object v17 = 0;
    Object v18 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v15).doubleValue()),(((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()));
    Object v19 = null;
    Object v20 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v18),((com.google.javascript.rhino.jstype.ObjectType)v19));
    Object v21 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.Scope)v20));
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v7 = 0.0D;
    Object v8 = -40;
    Object v9 = 0;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = true;
    ((com.google.javascript.rhino.Node)v10).setIsSyntheticBlock((((java.lang.Boolean)v11).booleanValue()));
    Object v12 = null;
    Object v13 = "L";
    Object v14 = java.nio.charset.Charset.defaultCharset();
    Object v15 = new java.io.PrintStream(((java.lang.String)v13),((java.nio.charset.Charset)v14));
    Object v16 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v15));
    Object v17 = ((com.google.javascript.jscomp.AbstractCompiler)v16).getErrorManager();
    Object v18 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v19 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v16),((com.google.javascript.jscomp.CodingConvention)v18));
    Object v20 = 0.0D;
    Object v21 = -40;
    Object v22 = 0;
    Object v23 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v20).doubleValue()),(((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()));
    Object v24 = false;
    Object v25 = false;
    Object v26 = true;
    Object v27 = ((com.google.javascript.rhino.Node)v23).toString((((java.lang.Boolean)v24).booleanValue()),(((java.lang.Boolean)v25).booleanValue()),(((java.lang.Boolean)v26).booleanValue()));
    Object v28 = 0.0D;
    Object v29 = -40;
    Object v30 = 0;
    Object v31 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v28).doubleValue()),(((java.lang.Integer)v29).intValue()),(((java.lang.Integer)v30).intValue()));
    Object v32 = null;
    Object v33 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v31),((com.google.javascript.rhino.jstype.ObjectType)v32));
    Object v34 = ((com.google.javascript.jscomp.TypedScopeCreator)v19).createScope(((com.google.javascript.rhino.Node)v23),((com.google.javascript.jscomp.Scope)v33));
    Object v35 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.Scope)v34));
    org.junit.Assert.assertNotNull(v35);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v7 = 0.0D;
    Object v8 = -40;
    Object v9 = 0;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = false;
    Object v12 = false;
    Object v13 = false;
    Object v14 = ((com.google.javascript.rhino.Node)v10).toString((((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = 0.0D;
    Object v16 = -40;
    Object v17 = 0;
    Object v18 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v15).doubleValue()),(((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()));
    Object v19 = null;
    Object v20 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v18),((com.google.javascript.rhino.jstype.ObjectType)v19));
    Object v21 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.Scope)v20));
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v7 = 0.0D;
    Object v8 = -40;
    Object v9 = 0;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = 0.0D;
    Object v12 = -40;
    Object v13 = 0;
    Object v14 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.jstype.ObjectType)v15));
    Object v17 = " ";
    Object v18 = ((com.google.javascript.jscomp.Scope)v16).getSlot(((java.lang.String)v17));
    Object v19 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.Scope)v16));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v7 = 0.0D;
    Object v8 = -40;
    Object v9 = 0;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = ((com.google.javascript.rhino.Node)v10).isUnscopedQualifiedName();
    Object v12 = "L";
    Object v13 = java.nio.charset.Charset.defaultCharset();
    Object v14 = new java.io.PrintStream(((java.lang.String)v12),((java.nio.charset.Charset)v13));
    Object v15 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v14));
    Object v16 = ((com.google.javascript.jscomp.AbstractCompiler)v15).getErrorManager();
    Object v17 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v18 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v15),((com.google.javascript.jscomp.CodingConvention)v17));
    Object v19 = 0.0D;
    Object v20 = -40;
    Object v21 = 0;
    Object v22 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v19).doubleValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()));
    Object v23 = 0.0D;
    Object v24 = -40;
    Object v25 = 0;
    Object v26 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v23).doubleValue()),(((java.lang.Integer)v24).intValue()),(((java.lang.Integer)v25).intValue()));
    Object v27 = null;
    Object v28 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v26),((com.google.javascript.rhino.jstype.ObjectType)v27));
    Object v29 = " ";
    Object v30 = ((com.google.javascript.jscomp.Scope)v28).getSlot(((java.lang.String)v29));
    Object v31 = ((com.google.javascript.jscomp.TypedScopeCreator)v18).createScope(((com.google.javascript.rhino.Node)v22),((com.google.javascript.jscomp.Scope)v28));
    Object v32 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.Scope)v31));
    org.junit.Assert.assertNotNull(v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v7 = 0.0D;
    Object v8 = -40;
    Object v9 = 0;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = ((com.google.javascript.rhino.Node)v10).toString();
    Object v12 = 0.0D;
    Object v13 = -40;
    Object v14 = 0;
    Object v15 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v12).doubleValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = null;
    Object v17 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v15),((com.google.javascript.rhino.jstype.ObjectType)v16));
    Object v18 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.Scope)v17));
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v7 = 0.0D;
    Object v8 = -40;
    Object v9 = 0;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = 0.0D;
    Object v12 = -40;
    Object v13 = 0;
    Object v14 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.jstype.ObjectType)v15));
    Object v17 = ":";
    Object v18 = ((com.google.javascript.jscomp.Scope)v16).getSlot(((java.lang.String)v17));
    Object v19 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.Scope)v16));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v7 = 0.0D;
    Object v8 = -40;
    Object v9 = 0;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = "L";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = ((com.google.javascript.jscomp.AbstractCompiler)v14).getErrorManager();
    Object v16 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v17 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.CodingConvention)v16));
    Object v18 = 0.0D;
    Object v19 = -40;
    Object v20 = 0;
    Object v21 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v18).doubleValue()),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
    Object v22 = 0;
    Object v23 = -32;
    ((com.google.javascript.rhino.Node)v21).putIntProp((((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()));
    Object v24 = null;
    Object v25 = ((com.google.javascript.jscomp.TypedScopeCreator)v17).createInitialScope(((com.google.javascript.rhino.Node)v21));
    Object v26 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.Scope)v25));
    org.junit.Assert.assertNotNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v7 = 0.0D;
    Object v8 = -40;
    Object v9 = 0;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createInitialScope(((com.google.javascript.rhino.Node)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v7 = 0.0D;
    Object v8 = -40;
    Object v9 = 0;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = 0.0D;
    Object v12 = -40;
    Object v13 = 0;
    Object v14 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.jstype.ObjectType)v15));
    Object v17 = " does qnot have a condition.";
    Object v18 = ((com.google.javascript.jscomp.Scope)v16).getOwnSlot(((java.lang.String)v17));
    Object v19 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.Scope)v16));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v7 = 0.0D;
    Object v8 = -40;
    Object v9 = 0;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = "L";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = ((com.google.javascript.jscomp.AbstractCompiler)v14).getErrorManager();
    Object v16 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v17 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.CodingConvention)v16));
    Object v18 = 0.0D;
    Object v19 = -40;
    Object v20 = 0;
    Object v21 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v18).doubleValue()),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
    Object v22 = 0.0D;
    Object v23 = -40;
    Object v24 = 0;
    Object v25 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v22).doubleValue()),(((java.lang.Integer)v23).intValue()),(((java.lang.Integer)v24).intValue()));
    Object v26 = null;
    Object v27 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v25),((com.google.javascript.rhino.jstype.ObjectType)v26));
    Object v28 = " does qnot have a condition.";
    Object v29 = ((com.google.javascript.jscomp.Scope)v27).getOwnSlot(((java.lang.String)v28));
    Object v30 = ((com.google.javascript.jscomp.TypedScopeCreator)v17).createScope(((com.google.javascript.rhino.Node)v21),((com.google.javascript.jscomp.Scope)v27));
    Object v31 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.Scope)v30));
    org.junit.Assert.assertNotNull(v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v7 = 0.0D;
    Object v8 = -40;
    Object v9 = 0;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = 1;
    Object v12 = ((com.google.javascript.rhino.Node)v10).getAncestor((((java.lang.Integer)v11).intValue()));
    Object v13 = 0.0D;
    Object v14 = -40;
    Object v15 = 0;
    Object v16 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v13).doubleValue()),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = null;
    Object v18 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v16),((com.google.javascript.rhino.jstype.ObjectType)v17));
    Object v19 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.Scope)v18));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v7 = 0.0D;
    Object v8 = -40;
    Object v9 = 0;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = "L";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = ((com.google.javascript.jscomp.AbstractCompiler)v14).getErrorManager();
    Object v16 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v17 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.CodingConvention)v16));
    Object v18 = 0.0D;
    Object v19 = -40;
    Object v20 = 0;
    Object v21 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v18).doubleValue()),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
    Object v22 = 0.0D;
    Object v23 = -40;
    Object v24 = 0;
    Object v25 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v22).doubleValue()),(((java.lang.Integer)v23).intValue()),(((java.lang.Integer)v24).intValue()));
    Object v26 = null;
    Object v27 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v25),((com.google.javascript.rhino.jstype.ObjectType)v26));
    Object v28 = "R";
    Object v29 = ((com.google.javascript.jscomp.Scope)v27).getVar(((java.lang.String)v28));
    Object v30 = ((com.google.javascript.jscomp.TypedScopeCreator)v17).createScope(((com.google.javascript.rhino.Node)v21),((com.google.javascript.jscomp.Scope)v27));
    Object v31 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.Scope)v30));
    org.junit.Assert.assertNotNull(v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v7 = 0.0D;
    Object v8 = -40;
    Object v9 = 0;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = "L";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = ((com.google.javascript.jscomp.AbstractCompiler)v14).getErrorManager();
    Object v16 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v17 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.CodingConvention)v16));
    Object v18 = 0.0D;
    Object v19 = -40;
    Object v20 = 0;
    Object v21 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v18).doubleValue()),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
    Object v22 = ((com.google.javascript.rhino.Node)v21).toString();
    Object v23 = 0.0D;
    Object v24 = -40;
    Object v25 = 0;
    Object v26 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v23).doubleValue()),(((java.lang.Integer)v24).intValue()),(((java.lang.Integer)v25).intValue()));
    Object v27 = null;
    Object v28 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v26),((com.google.javascript.rhino.jstype.ObjectType)v27));
    Object v29 = ((com.google.javascript.jscomp.TypedScopeCreator)v17).createScope(((com.google.javascript.rhino.Node)v21),((com.google.javascript.jscomp.Scope)v28));
    Object v30 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.Scope)v29));
    org.junit.Assert.assertNotNull(v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v7 = 0.0D;
    Object v8 = -40;
    Object v9 = 0;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = "L";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = ((com.google.javascript.jscomp.AbstractCompiler)v14).getErrorManager();
    Object v16 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v17 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.CodingConvention)v16));
    Object v18 = 0.0D;
    Object v19 = -40;
    Object v20 = 0;
    Object v21 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v18).doubleValue()),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
    Object v22 = 0.0D;
    Object v23 = -40;
    Object v24 = 0;
    Object v25 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v22).doubleValue()),(((java.lang.Integer)v23).intValue()),(((java.lang.Integer)v24).intValue()));
    Object v26 = null;
    Object v27 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v25),((com.google.javascript.rhino.jstype.ObjectType)v26));
    Object v28 = " ";
    Object v29 = ((com.google.javascript.jscomp.Scope)v27).getSlot(((java.lang.String)v28));
    Object v30 = ((com.google.javascript.jscomp.TypedScopeCreator)v17).createScope(((com.google.javascript.rhino.Node)v21),((com.google.javascript.jscomp.Scope)v27));
    Object v31 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.Scope)v30));
    org.junit.Assert.assertNotNull(v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v7 = 0.0D;
    Object v8 = -40;
    Object v9 = 0;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = true;
    ((com.google.javascript.rhino.Node)v10).setVarArgs((((java.lang.Boolean)v11).booleanValue()));
    Object v12 = null;
    Object v13 = "L";
    Object v14 = java.nio.charset.Charset.defaultCharset();
    Object v15 = new java.io.PrintStream(((java.lang.String)v13),((java.nio.charset.Charset)v14));
    Object v16 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v15));
    Object v17 = ((com.google.javascript.jscomp.AbstractCompiler)v16).getErrorManager();
    Object v18 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v19 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v16),((com.google.javascript.jscomp.CodingConvention)v18));
    Object v20 = 0.0D;
    Object v21 = -40;
    Object v22 = 0;
    Object v23 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v20).doubleValue()),(((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()));
    Object v24 = 0.0D;
    Object v25 = -40;
    Object v26 = 0;
    Object v27 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v24).doubleValue()),(((java.lang.Integer)v25).intValue()),(((java.lang.Integer)v26).intValue()));
    Object v28 = null;
    Object v29 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v27),((com.google.javascript.rhino.jstype.ObjectType)v28));
    Object v30 = ":";
    Object v31 = ((com.google.javascript.jscomp.Scope)v29).getSlot(((java.lang.String)v30));
    Object v32 = ((com.google.javascript.jscomp.TypedScopeCreator)v19).createScope(((com.google.javascript.rhino.Node)v23),((com.google.javascript.jscomp.Scope)v29));
    Object v33 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.Scope)v32));
    org.junit.Assert.assertNotNull(v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v7 = 0.0D;
    Object v8 = -40;
    Object v9 = 0;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = "L";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = ((com.google.javascript.jscomp.AbstractCompiler)v14).getErrorManager();
    Object v16 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v17 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.CodingConvention)v16));
    Object v18 = 0.0D;
    Object v19 = -40;
    Object v20 = 0;
    Object v21 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v18).doubleValue()),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
    Object v22 = false;
    Object v23 = false;
    Object v24 = true;
    Object v25 = ((com.google.javascript.rhino.Node)v21).toString((((java.lang.Boolean)v22).booleanValue()),(((java.lang.Boolean)v23).booleanValue()),(((java.lang.Boolean)v24).booleanValue()));
    Object v26 = 0.0D;
    Object v27 = -40;
    Object v28 = 0;
    Object v29 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v26).doubleValue()),(((java.lang.Integer)v27).intValue()),(((java.lang.Integer)v28).intValue()));
    Object v30 = null;
    Object v31 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v29),((com.google.javascript.rhino.jstype.ObjectType)v30));
    Object v32 = ((com.google.javascript.jscomp.TypedScopeCreator)v17).createScope(((com.google.javascript.rhino.Node)v21),((com.google.javascript.jscomp.Scope)v31));
    Object v33 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.Scope)v32));
    org.junit.Assert.assertNotNull(v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v7 = 0.0D;
    Object v8 = -40;
    Object v9 = 0;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = 0.0D;
    Object v12 = -40;
    Object v13 = 0;
    Object v14 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = ((com.google.javascript.rhino.Node)v10).checkTreeEqualsSilent(((com.google.javascript.rhino.Node)v14));
    Object v16 = 0.0D;
    Object v17 = -40;
    Object v18 = 0;
    Object v19 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v16).doubleValue()),(((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()));
    Object v20 = null;
    Object v21 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v19),((com.google.javascript.rhino.jstype.ObjectType)v20));
    Object v22 = ((com.google.javascript.jscomp.Scope)v21).getVarCount();
    Object v23 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.Scope)v21));
    org.junit.Assert.assertNotNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v7 = 0.0D;
    Object v8 = -40;
    Object v9 = 0;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = "L";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = ((com.google.javascript.jscomp.AbstractCompiler)v14).getErrorManager();
    Object v16 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v17 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.CodingConvention)v16));
    Object v18 = 0.0D;
    Object v19 = -40;
    Object v20 = 0;
    Object v21 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v18).doubleValue()),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
    Object v22 = 0.0D;
    Object v23 = -40;
    Object v24 = 0;
    Object v25 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v22).doubleValue()),(((java.lang.Integer)v23).intValue()),(((java.lang.Integer)v24).intValue()));
    Object v26 = null;
    Object v27 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v25),((com.google.javascript.rhino.jstype.ObjectType)v26));
    Object v28 = " does qnot have a condition.";
    Object v29 = ((com.google.javascript.jscomp.Scope)v27).getOwnSlot(((java.lang.String)v28));
    Object v30 = ((com.google.javascript.jscomp.TypedScopeCreator)v17).createScope(((com.google.javascript.rhino.Node)v21),((com.google.javascript.jscomp.Scope)v27));
    Object v31 = "\"";
    Object v32 = ((com.google.javascript.jscomp.Scope)v30).getOwnSlot(((java.lang.String)v31));
    Object v33 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.Scope)v30));
    org.junit.Assert.assertNotNull(v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v7 = 0.0D;
    Object v8 = -40;
    Object v9 = 0;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = ((com.google.javascript.rhino.Node)v10).getQualifiedName();
    Object v12 = 0.0D;
    Object v13 = -40;
    Object v14 = 0;
    Object v15 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v12).doubleValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = null;
    Object v17 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v15),((com.google.javascript.rhino.jstype.ObjectType)v16));
    Object v18 = "string";
    Object v19 = ((com.google.javascript.jscomp.Scope)v17).getVar(((java.lang.String)v18));
    Object v20 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.Scope)v17));
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v7 = 0.0D;
    Object v8 = -40;
    Object v9 = 0;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = ((com.google.javascript.rhino.Node)v10).isUnscopedQualifiedName();
    Object v12 = 0.0D;
    Object v13 = -40;
    Object v14 = 0;
    Object v15 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v12).doubleValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = null;
    Object v17 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v15),((com.google.javascript.rhino.jstype.ObjectType)v16));
    Object v18 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.Scope)v17));
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v7 = 0.0D;
    Object v8 = -40;
    Object v9 = 0;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = 0.0D;
    Object v12 = -40;
    Object v13 = 0;
    Object v14 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.jstype.ObjectType)v15));
    Object v17 = "msg.no.paren.for";
    Object v18 = ((com.google.javascript.jscomp.Scope)v16).getOwnSlot(((java.lang.String)v17));
    Object v19 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.Scope)v16));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v7 = 0.0D;
    Object v8 = -40;
    Object v9 = 0;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = "L";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = ((com.google.javascript.jscomp.AbstractCompiler)v14).getErrorManager();
    Object v16 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v17 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.CodingConvention)v16));
    Object v18 = 0.0D;
    Object v19 = -40;
    Object v20 = 0;
    Object v21 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v18).doubleValue()),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
    Object v22 = ((com.google.javascript.rhino.Node)v21).getQualifiedName();
    Object v23 = 0.0D;
    Object v24 = -40;
    Object v25 = 0;
    Object v26 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v23).doubleValue()),(((java.lang.Integer)v24).intValue()),(((java.lang.Integer)v25).intValue()));
    Object v27 = null;
    Object v28 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v26),((com.google.javascript.rhino.jstype.ObjectType)v27));
    Object v29 = "string";
    Object v30 = ((com.google.javascript.jscomp.Scope)v28).getVar(((java.lang.String)v29));
    Object v31 = ((com.google.javascript.jscomp.TypedScopeCreator)v17).createScope(((com.google.javascript.rhino.Node)v21),((com.google.javascript.jscomp.Scope)v28));
    Object v32 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.Scope)v31));
    org.junit.Assert.assertNotNull(v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v7 = 0.0D;
    Object v8 = -40;
    Object v9 = 0;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = "L";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = ((com.google.javascript.jscomp.AbstractCompiler)v14).getErrorManager();
    Object v16 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v17 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.CodingConvention)v16));
    Object v18 = 0.0D;
    Object v19 = -40;
    Object v20 = 0;
    Object v21 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v18).doubleValue()),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
    Object v22 = ((com.google.javascript.jscomp.TypedScopeCreator)v17).createInitialScope(((com.google.javascript.rhino.Node)v21));
    Object v23 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.Scope)v22));
    org.junit.Assert.assertNotNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v7 = 0.0D;
    Object v8 = -40;
    Object v9 = 0;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = 0.0D;
    Object v12 = -40;
    Object v13 = 0;
    Object v14 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.jstype.ObjectType)v15));
    Object v17 = "  ";
    Object v18 = ((com.google.javascript.jscomp.Scope)v16).getOwnSlot(((java.lang.String)v17));
    Object v19 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.Scope)v16));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v7 = 0.0D;
    Object v8 = -40;
    Object v9 = 0;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = 0.0D;
    Object v12 = -40;
    Object v13 = 0;
    Object v14 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.jstype.ObjectType)v15));
    Object v17 = "";
    Object v18 = ((com.google.javascript.jscomp.Scope)v16).getVar(((java.lang.String)v17));
    Object v19 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.Scope)v16));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v7 = 0.0D;
    Object v8 = -40;
    Object v9 = 0;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = "L";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = ((com.google.javascript.jscomp.AbstractCompiler)v14).getErrorManager();
    Object v16 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v17 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.CodingConvention)v16));
    Object v18 = 0.0D;
    Object v19 = -40;
    Object v20 = 0;
    Object v21 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v18).doubleValue()),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
    Object v22 = 0.0D;
    Object v23 = -40;
    Object v24 = 0;
    Object v25 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v22).doubleValue()),(((java.lang.Integer)v23).intValue()),(((java.lang.Integer)v24).intValue()));
    Object v26 = ((com.google.javascript.rhino.Node)v21).checkTreeEqualsSilent(((com.google.javascript.rhino.Node)v25));
    Object v27 = 0.0D;
    Object v28 = -40;
    Object v29 = 0;
    Object v30 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v27).doubleValue()),(((java.lang.Integer)v28).intValue()),(((java.lang.Integer)v29).intValue()));
    Object v31 = null;
    Object v32 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v30),((com.google.javascript.rhino.jstype.ObjectType)v31));
    Object v33 = ((com.google.javascript.jscomp.Scope)v32).getVarCount();
    Object v34 = ((com.google.javascript.jscomp.TypedScopeCreator)v17).createScope(((com.google.javascript.rhino.Node)v21),((com.google.javascript.jscomp.Scope)v32));
    Object v35 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.Scope)v34));
    org.junit.Assert.assertNotNull(v35);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v7 = 0.0D;
    Object v8 = -40;
    Object v9 = 0;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = false;
    ((com.google.javascript.rhino.Node)v10).setIsSyntheticBlock((((java.lang.Boolean)v11).booleanValue()));
    Object v12 = null;
    Object v13 = "L";
    Object v14 = java.nio.charset.Charset.defaultCharset();
    Object v15 = new java.io.PrintStream(((java.lang.String)v13),((java.nio.charset.Charset)v14));
    Object v16 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v15));
    Object v17 = ((com.google.javascript.jscomp.AbstractCompiler)v16).getErrorManager();
    Object v18 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v19 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v16),((com.google.javascript.jscomp.CodingConvention)v18));
    Object v20 = 0.0D;
    Object v21 = -40;
    Object v22 = 0;
    Object v23 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v20).doubleValue()),(((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()));
    Object v24 = 0.0D;
    Object v25 = -40;
    Object v26 = 0;
    Object v27 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v24).doubleValue()),(((java.lang.Integer)v25).intValue()),(((java.lang.Integer)v26).intValue()));
    Object v28 = null;
    Object v29 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v27),((com.google.javascript.rhino.jstype.ObjectType)v28));
    Object v30 = " does qnot have a condition.";
    Object v31 = ((com.google.javascript.jscomp.Scope)v29).getOwnSlot(((java.lang.String)v30));
    Object v32 = ((com.google.javascript.jscomp.TypedScopeCreator)v19).createScope(((com.google.javascript.rhino.Node)v23),((com.google.javascript.jscomp.Scope)v29));
    Object v33 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.Scope)v32));
    org.junit.Assert.assertNotNull(v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
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
  public void test45() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v7 = 0.0D;
    Object v8 = -40;
    Object v9 = 0;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = "L";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = ((com.google.javascript.jscomp.AbstractCompiler)v14).getErrorManager();
    Object v16 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v17 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.CodingConvention)v16));
    Object v18 = 0.0D;
    Object v19 = -40;
    Object v20 = 0;
    Object v21 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v18).doubleValue()),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
    Object v22 = false;
    Object v23 = false;
    Object v24 = false;
    Object v25 = ((com.google.javascript.rhino.Node)v21).toString((((java.lang.Boolean)v22).booleanValue()),(((java.lang.Boolean)v23).booleanValue()),(((java.lang.Boolean)v24).booleanValue()));
    Object v26 = 0.0D;
    Object v27 = -40;
    Object v28 = 0;
    Object v29 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v26).doubleValue()),(((java.lang.Integer)v27).intValue()),(((java.lang.Integer)v28).intValue()));
    Object v30 = null;
    Object v31 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v29),((com.google.javascript.rhino.jstype.ObjectType)v30));
    Object v32 = ((com.google.javascript.jscomp.TypedScopeCreator)v17).createScope(((com.google.javascript.rhino.Node)v21),((com.google.javascript.jscomp.Scope)v31));
    Object v33 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.Scope)v32));
    org.junit.Assert.assertNotNull(v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v5 = 0.0D;
    Object v6 = -40;
    Object v7 = 0;
    Object v8 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v5).doubleValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = ((com.google.javascript.jscomp.CodingConvention)v4).isOptionalParameter(((com.google.javascript.rhino.Node)v8));
    Object v10 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v4));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v7 = 0.0D;
    Object v8 = -40;
    Object v9 = 0;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = ((com.google.javascript.rhino.Node)v10).removeChildren();
    Object v12 = "L";
    Object v13 = java.nio.charset.Charset.defaultCharset();
    Object v14 = new java.io.PrintStream(((java.lang.String)v12),((java.nio.charset.Charset)v13));
    Object v15 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v14));
    Object v16 = ((com.google.javascript.jscomp.AbstractCompiler)v15).getErrorManager();
    Object v17 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v18 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v15),((com.google.javascript.jscomp.CodingConvention)v17));
    Object v19 = 0.0D;
    Object v20 = -40;
    Object v21 = 0;
    Object v22 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v19).doubleValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()));
    Object v23 = 0.0D;
    Object v24 = -40;
    Object v25 = 0;
    Object v26 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v23).doubleValue()),(((java.lang.Integer)v24).intValue()),(((java.lang.Integer)v25).intValue()));
    Object v27 = null;
    Object v28 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v26),((com.google.javascript.rhino.jstype.ObjectType)v27));
    Object v29 = ((com.google.javascript.jscomp.Scope)v28).getVars();
    Object v30 = ((com.google.javascript.jscomp.TypedScopeCreator)v18).createScope(((com.google.javascript.rhino.Node)v22),((com.google.javascript.jscomp.Scope)v28));
    Object v31 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.Scope)v30));
    org.junit.Assert.assertNotNull(v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v7 = 0.0D;
    Object v8 = -40;
    Object v9 = 0;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = 0.0D;
    Object v12 = -40;
    Object v13 = 0;
    Object v14 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.jstype.ObjectType)v15));
    Object v17 = "<";
    Object v18 = ((com.google.javascript.jscomp.Scope)v16).getSlot(((java.lang.String)v17));
    Object v19 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.Scope)v16));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v7 = 0.0D;
    Object v8 = -40;
    Object v9 = 0;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = "L";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = ((com.google.javascript.jscomp.AbstractCompiler)v14).getErrorManager();
    Object v16 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v17 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.CodingConvention)v16));
    Object v18 = 0.0D;
    Object v19 = -40;
    Object v20 = 0;
    Object v21 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v18).doubleValue()),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
    Object v22 = false;
    Object v23 = false;
    Object v24 = true;
    Object v25 = ((com.google.javascript.rhino.Node)v21).toString((((java.lang.Boolean)v22).booleanValue()),(((java.lang.Boolean)v23).booleanValue()),(((java.lang.Boolean)v24).booleanValue()));
    Object v26 = 0.0D;
    Object v27 = -40;
    Object v28 = 0;
    Object v29 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v26).doubleValue()),(((java.lang.Integer)v27).intValue()),(((java.lang.Integer)v28).intValue()));
    Object v30 = null;
    Object v31 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v29),((com.google.javascript.rhino.jstype.ObjectType)v30));
    Object v32 = ((com.google.javascript.jscomp.TypedScopeCreator)v17).createScope(((com.google.javascript.rhino.Node)v21),((com.google.javascript.jscomp.Scope)v31));
    Object v33 = "";
    Object v34 = ((com.google.javascript.jscomp.Scope)v32).getOwnSlot(((java.lang.String)v33));
    Object v35 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.Scope)v32));
    org.junit.Assert.assertNotNull(v35);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v7 = 0.0D;
    Object v8 = -40;
    Object v9 = 0;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = false;
    ((com.google.javascript.rhino.Node)v10).setOptionalArg((((java.lang.Boolean)v11).booleanValue()));
    Object v12 = null;
    Object v13 = 0.0D;
    Object v14 = -40;
    Object v15 = 0;
    Object v16 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v13).doubleValue()),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = null;
    Object v18 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v16),((com.google.javascript.rhino.jstype.ObjectType)v17));
    Object v19 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.Scope)v18));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v7 = 0.0D;
    Object v8 = -40;
    Object v9 = 0;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = 0.0D;
    Object v12 = -40;
    Object v13 = 0;
    Object v14 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.jstype.ObjectType)v15));
    Object v17 = "M";
    Object v18 = ((com.google.javascript.jscomp.Scope)v16).getVar(((java.lang.String)v17));
    Object v19 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.Scope)v16));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v7 = 0.0D;
    Object v8 = -40;
    Object v9 = 0;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = 0.0D;
    Object v12 = -40;
    Object v13 = 0;
    Object v14 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.jstype.ObjectType)v15));
    Object v17 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.Scope)v16));
    Object v18 = 0.0D;
    Object v19 = -40;
    Object v20 = 0;
    Object v21 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v18).doubleValue()),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
    Object v22 = ((com.google.javascript.rhino.Node)v21).children();
    Object v23 = 0.0D;
    Object v24 = -40;
    Object v25 = 0;
    Object v26 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v23).doubleValue()),(((java.lang.Integer)v24).intValue()),(((java.lang.Integer)v25).intValue()));
    Object v27 = null;
    Object v28 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v26),((com.google.javascript.rhino.jstype.ObjectType)v27));
    Object v29 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v21),((com.google.javascript.jscomp.Scope)v28));
    org.junit.Assert.assertNotNull(v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v7 = 0.0D;
    Object v8 = -40;
    Object v9 = 0;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = "L";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = ((com.google.javascript.jscomp.AbstractCompiler)v14).getErrorManager();
    Object v16 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v17 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.CodingConvention)v16));
    Object v18 = 0.0D;
    Object v19 = -40;
    Object v20 = 0;
    Object v21 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v18).doubleValue()),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
    Object v22 = 0.0D;
    Object v23 = -40;
    Object v24 = 0;
    Object v25 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v22).doubleValue()),(((java.lang.Integer)v23).intValue()),(((java.lang.Integer)v24).intValue()));
    Object v26 = null;
    Object v27 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v25),((com.google.javascript.rhino.jstype.ObjectType)v26));
    Object v28 = ":";
    Object v29 = ((com.google.javascript.jscomp.Scope)v27).getSlot(((java.lang.String)v28));
    Object v30 = ((com.google.javascript.jscomp.TypedScopeCreator)v17).createScope(((com.google.javascript.rhino.Node)v21),((com.google.javascript.jscomp.Scope)v27));
    Object v31 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.Scope)v30));
    org.junit.Assert.assertNotNull(v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v7 = 0.0D;
    Object v8 = -40;
    Object v9 = 0;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = "L";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = ((com.google.javascript.jscomp.AbstractCompiler)v14).getErrorManager();
    Object v16 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v17 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.CodingConvention)v16));
    Object v18 = 0.0D;
    Object v19 = -40;
    Object v20 = 0;
    Object v21 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v18).doubleValue()),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
    Object v22 = "L";
    Object v23 = java.nio.charset.Charset.defaultCharset();
    Object v24 = new java.io.PrintStream(((java.lang.String)v22),((java.nio.charset.Charset)v23));
    Object v25 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v24));
    Object v26 = ((com.google.javascript.jscomp.AbstractCompiler)v25).getErrorManager();
    Object v27 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v28 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v25),((com.google.javascript.jscomp.CodingConvention)v27));
    Object v29 = 0.0D;
    Object v30 = -40;
    Object v31 = 0;
    Object v32 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v29).doubleValue()),(((java.lang.Integer)v30).intValue()),(((java.lang.Integer)v31).intValue()));
    Object v33 = 0;
    Object v34 = -32;
    ((com.google.javascript.rhino.Node)v32).putIntProp((((java.lang.Integer)v33).intValue()),(((java.lang.Integer)v34).intValue()));
    Object v35 = null;
    Object v36 = ((com.google.javascript.jscomp.TypedScopeCreator)v28).createInitialScope(((com.google.javascript.rhino.Node)v32));
    Object v37 = ((com.google.javascript.jscomp.TypedScopeCreator)v17).createScope(((com.google.javascript.rhino.Node)v21),((com.google.javascript.jscomp.Scope)v36));
    Object v38 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.Scope)v37));
    org.junit.Assert.assertNotNull(v38);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v7 = 0.0D;
    Object v8 = -40;
    Object v9 = 0;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = 0.0D;
    Object v12 = -40;
    Object v13 = 0;
    Object v14 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.jstype.ObjectType)v15));
    Object v17 = "";
    Object v18 = true;
    Object v19 = ((com.google.javascript.jscomp.Scope)v16).isDeclared(((java.lang.String)v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.Scope)v16));
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v7 = 0.0D;
    Object v8 = -40;
    Object v9 = 0;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = true;
    ((com.google.javascript.rhino.Node)v10).setOptionalArg((((java.lang.Boolean)v11).booleanValue()));
    Object v12 = null;
    Object v13 = 0.0D;
    Object v14 = -40;
    Object v15 = 0;
    Object v16 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v13).doubleValue()),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = null;
    Object v18 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v16),((com.google.javascript.rhino.jstype.ObjectType)v17));
    Object v19 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.Scope)v18));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v7 = 0.0D;
    Object v8 = -40;
    Object v9 = 0;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = -19.866692602488122D;
    ((com.google.javascript.rhino.Node)v10).setDouble((((java.lang.Double)v11).doubleValue()));
    Object v12 = null;
    Object v13 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createInitialScope(((com.google.javascript.rhino.Node)v10));
    org.junit.Assert.assertNotNull(v13);
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
    Object v7 = 0.0D;
    Object v8 = -40;
    Object v9 = 0;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = true;
    ((com.google.javascript.rhino.Node)v10).setOptionalArg((((java.lang.Boolean)v11).booleanValue()));
    Object v12 = null;
    Object v13 = 0.0D;
    Object v14 = -40;
    Object v15 = 0;
    Object v16 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v13).doubleValue()),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = null;
    Object v18 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v16),((com.google.javascript.rhino.jstype.ObjectType)v17));
    Object v19 = "prototype";
    Object v20 = ((com.google.javascript.jscomp.Scope)v18).getSlot(((java.lang.String)v19));
    Object v21 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.Scope)v18));
    org.junit.Assert.assertNotNull(v21);
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
    Object v7 = 0.0D;
    Object v8 = -40;
    Object v9 = 0;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = 46;
    ((com.google.javascript.rhino.Node)v10).setCharno((((java.lang.Integer)v11).intValue()));
    Object v12 = null;
    Object v13 = 0.0D;
    Object v14 = -40;
    Object v15 = 0;
    Object v16 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v13).doubleValue()),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = null;
    Object v18 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v16),((com.google.javascript.rhino.jstype.ObjectType)v17));
    Object v19 = "#";
    Object v20 = true;
    Object v21 = ((com.google.javascript.jscomp.Scope)v18).isDeclared(((java.lang.String)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.Scope)v18));
    org.junit.Assert.assertNotNull(v22);
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
    Object v7 = 0.0D;
    Object v8 = -40;
    Object v9 = 0;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = "L";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = ((com.google.javascript.jscomp.AbstractCompiler)v14).getErrorManager();
    Object v16 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v17 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.CodingConvention)v16));
    Object v18 = 0.0D;
    Object v19 = -40;
    Object v20 = 0;
    Object v21 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v18).doubleValue()),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
    Object v22 = true;
    ((com.google.javascript.rhino.Node)v21).setOptionalArg((((java.lang.Boolean)v22).booleanValue()));
    Object v23 = null;
    Object v24 = 0.0D;
    Object v25 = -40;
    Object v26 = 0;
    Object v27 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v24).doubleValue()),(((java.lang.Integer)v25).intValue()),(((java.lang.Integer)v26).intValue()));
    Object v28 = null;
    Object v29 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v27),((com.google.javascript.rhino.jstype.ObjectType)v28));
    Object v30 = "prototype";
    Object v31 = ((com.google.javascript.jscomp.Scope)v29).getSlot(((java.lang.String)v30));
    Object v32 = ((com.google.javascript.jscomp.TypedScopeCreator)v17).createScope(((com.google.javascript.rhino.Node)v21),((com.google.javascript.jscomp.Scope)v29));
    Object v33 = "";
    Object v34 = ((com.google.javascript.jscomp.Scope)v32).getOwnSlot(((java.lang.String)v33));
    Object v35 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.Scope)v32));
    org.junit.Assert.assertNotNull(v35);
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
    Object v7 = 0.0D;
    Object v8 = -40;
    Object v9 = 0;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = ((com.google.javascript.rhino.Node)v10).getJsDocBuilderForNode();
    Object v12 = 0.0D;
    Object v13 = -40;
    Object v14 = 0;
    Object v15 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v12).doubleValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = null;
    Object v17 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v15),((com.google.javascript.rhino.jstype.ObjectType)v16));
    Object v18 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.Scope)v17));
    org.junit.Assert.assertNotNull(v18);
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
    Object v7 = 0.0D;
    Object v8 = -40;
    Object v9 = 0;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = "L";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = ((com.google.javascript.jscomp.AbstractCompiler)v14).getErrorManager();
    Object v16 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v17 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.CodingConvention)v16));
    Object v18 = 0.0D;
    Object v19 = -40;
    Object v20 = 0;
    Object v21 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v18).doubleValue()),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
    Object v22 = -19.866692602488122D;
    ((com.google.javascript.rhino.Node)v21).setDouble((((java.lang.Double)v22).doubleValue()));
    Object v23 = null;
    Object v24 = ((com.google.javascript.jscomp.TypedScopeCreator)v17).createInitialScope(((com.google.javascript.rhino.Node)v21));
    Object v25 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.Scope)v24));
    org.junit.Assert.assertNotNull(v25);
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
    Object v7 = 0.0D;
    Object v8 = -40;
    Object v9 = 0;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = "L";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = ((com.google.javascript.jscomp.AbstractCompiler)v14).getErrorManager();
    Object v16 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v17 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.CodingConvention)v16));
    Object v18 = 0.0D;
    Object v19 = -40;
    Object v20 = 0;
    Object v21 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v18).doubleValue()),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
    Object v22 = ((com.google.javascript.rhino.Node)v21).getJsDocBuilderForNode();
    Object v23 = 0.0D;
    Object v24 = -40;
    Object v25 = 0;
    Object v26 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v23).doubleValue()),(((java.lang.Integer)v24).intValue()),(((java.lang.Integer)v25).intValue()));
    Object v27 = null;
    Object v28 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v26),((com.google.javascript.rhino.jstype.ObjectType)v27));
    Object v29 = ((com.google.javascript.jscomp.TypedScopeCreator)v17).createScope(((com.google.javascript.rhino.Node)v21),((com.google.javascript.jscomp.Scope)v28));
    Object v30 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.Scope)v29));
    org.junit.Assert.assertNotNull(v30);
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
    Object v7 = 0.0D;
    Object v8 = -40;
    Object v9 = 0;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = "L";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = ((com.google.javascript.jscomp.AbstractCompiler)v14).getErrorManager();
    Object v16 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v17 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.CodingConvention)v16));
    Object v18 = 0.0D;
    Object v19 = -40;
    Object v20 = 0;
    Object v21 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v18).doubleValue()),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
    Object v22 = 0.0D;
    Object v23 = -40;
    Object v24 = 0;
    Object v25 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v22).doubleValue()),(((java.lang.Integer)v23).intValue()),(((java.lang.Integer)v24).intValue()));
    Object v26 = null;
    Object v27 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v25),((com.google.javascript.rhino.jstype.ObjectType)v26));
    Object v28 = "";
    Object v29 = ((com.google.javascript.jscomp.Scope)v27).getVar(((java.lang.String)v28));
    Object v30 = ((com.google.javascript.jscomp.TypedScopeCreator)v17).createScope(((com.google.javascript.rhino.Node)v21),((com.google.javascript.jscomp.Scope)v27));
    Object v31 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.Scope)v30));
    org.junit.Assert.assertNotNull(v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v7 = 0.0D;
    Object v8 = -40;
    Object v9 = 0;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = "L";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = ((com.google.javascript.jscomp.AbstractCompiler)v14).getErrorManager();
    Object v16 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v17 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.CodingConvention)v16));
    Object v18 = 0.0D;
    Object v19 = -40;
    Object v20 = 0;
    Object v21 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v18).doubleValue()),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
    Object v22 = 0.0D;
    Object v23 = -40;
    Object v24 = 0;
    Object v25 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v22).doubleValue()),(((java.lang.Integer)v23).intValue()),(((java.lang.Integer)v24).intValue()));
    Object v26 = null;
    Object v27 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v25),((com.google.javascript.rhino.jstype.ObjectType)v26));
    Object v28 = "  ";
    Object v29 = ((com.google.javascript.jscomp.Scope)v27).getOwnSlot(((java.lang.String)v28));
    Object v30 = ((com.google.javascript.jscomp.TypedScopeCreator)v17).createScope(((com.google.javascript.rhino.Node)v21),((com.google.javascript.jscomp.Scope)v27));
    Object v31 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.Scope)v30));
    org.junit.Assert.assertNotNull(v31);
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
    Object v7 = 0.0D;
    Object v8 = -40;
    Object v9 = 0;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = 0.0D;
    Object v12 = -40;
    Object v13 = 0;
    Object v14 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    ((com.google.javascript.rhino.Node)v10).addChildToBack(((com.google.javascript.rhino.Node)v14));
    Object v15 = null;
    Object v16 = "L";
    Object v17 = java.nio.charset.Charset.defaultCharset();
    Object v18 = new java.io.PrintStream(((java.lang.String)v16),((java.nio.charset.Charset)v17));
    Object v19 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v18));
    Object v20 = ((com.google.javascript.jscomp.AbstractCompiler)v19).getErrorManager();
    Object v21 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v22 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v19),((com.google.javascript.jscomp.CodingConvention)v21));
    Object v23 = 0.0D;
    Object v24 = -40;
    Object v25 = 0;
    Object v26 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v23).doubleValue()),(((java.lang.Integer)v24).intValue()),(((java.lang.Integer)v25).intValue()));
    Object v27 = 0.0D;
    Object v28 = -40;
    Object v29 = 0;
    Object v30 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v27).doubleValue()),(((java.lang.Integer)v28).intValue()),(((java.lang.Integer)v29).intValue()));
    Object v31 = null;
    Object v32 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v30),((com.google.javascript.rhino.jstype.ObjectType)v31));
    Object v33 = "  ";
    Object v34 = ((com.google.javascript.jscomp.Scope)v32).getOwnSlot(((java.lang.String)v33));
    Object v35 = ((com.google.javascript.jscomp.TypedScopeCreator)v22).createScope(((com.google.javascript.rhino.Node)v26),((com.google.javascript.jscomp.Scope)v32));
    Object v36 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.Scope)v35));
    org.junit.Assert.assertNotNull(v36);
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
    Object v7 = 0.0D;
    Object v8 = -40;
    Object v9 = 0;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = new com.google.javascript.rhino.JSDocInfo();
    ((com.google.javascript.rhino.Node)v10).setJSDocInfo(((com.google.javascript.rhino.JSDocInfo)v11));
    Object v12 = null;
    Object v13 = 0.0D;
    Object v14 = -40;
    Object v15 = 0;
    Object v16 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v13).doubleValue()),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = null;
    Object v18 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v16),((com.google.javascript.rhino.jstype.ObjectType)v17));
    Object v19 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.Scope)v18));
    org.junit.Assert.assertNotNull(v19);
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
    Object v7 = 0.0D;
    Object v8 = -40;
    Object v9 = 0;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = "L";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = ((com.google.javascript.jscomp.AbstractCompiler)v14).getErrorManager();
    Object v16 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v17 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.CodingConvention)v16));
    Object v18 = 0.0D;
    Object v19 = -40;
    Object v20 = 0;
    Object v21 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v18).doubleValue()),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
    Object v22 = 46;
    ((com.google.javascript.rhino.Node)v21).setCharno((((java.lang.Integer)v22).intValue()));
    Object v23 = null;
    Object v24 = 0.0D;
    Object v25 = -40;
    Object v26 = 0;
    Object v27 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v24).doubleValue()),(((java.lang.Integer)v25).intValue()),(((java.lang.Integer)v26).intValue()));
    Object v28 = null;
    Object v29 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v27),((com.google.javascript.rhino.jstype.ObjectType)v28));
    Object v30 = "#";
    Object v31 = true;
    Object v32 = ((com.google.javascript.jscomp.Scope)v29).isDeclared(((java.lang.String)v30),(((java.lang.Boolean)v31).booleanValue()));
    Object v33 = ((com.google.javascript.jscomp.TypedScopeCreator)v17).createScope(((com.google.javascript.rhino.Node)v21),((com.google.javascript.jscomp.Scope)v29));
    Object v34 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.Scope)v33));
    org.junit.Assert.assertNotNull(v34);
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
    Object v7 = 0.0D;
    Object v8 = -40;
    Object v9 = 0;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = 0.0D;
    Object v12 = -40;
    Object v13 = 0;
    Object v14 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = ((com.google.javascript.rhino.Node)v10).copyInformationFromForTree(((com.google.javascript.rhino.Node)v14));
    Object v16 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createInitialScope(((com.google.javascript.rhino.Node)v10));
    org.junit.Assert.assertNotNull(v16);
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
    Object v7 = 0.0D;
    Object v8 = -40;
    Object v9 = 0;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = 33;
    Object v12 = false;
    ((com.google.javascript.rhino.Node)v10).putBooleanProp((((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v13 = null;
    Object v14 = 0.0D;
    Object v15 = -40;
    Object v16 = 0;
    Object v17 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v14).doubleValue()),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = null;
    Object v19 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v17),((com.google.javascript.rhino.jstype.ObjectType)v18));
    Object v20 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.Scope)v19));
    org.junit.Assert.assertNotNull(v20);
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
    Object v7 = 0.0D;
    Object v8 = -40;
    Object v9 = 0;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = ((com.google.javascript.rhino.Node)v10).hasSideEffects();
    Object v12 = "L";
    Object v13 = java.nio.charset.Charset.defaultCharset();
    Object v14 = new java.io.PrintStream(((java.lang.String)v12),((java.nio.charset.Charset)v13));
    Object v15 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v14));
    Object v16 = ((com.google.javascript.jscomp.AbstractCompiler)v15).getErrorManager();
    Object v17 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v18 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v15),((com.google.javascript.jscomp.CodingConvention)v17));
    Object v19 = 0.0D;
    Object v20 = -40;
    Object v21 = 0;
    Object v22 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v19).doubleValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()));
    Object v23 = -19.866692602488122D;
    ((com.google.javascript.rhino.Node)v22).setDouble((((java.lang.Double)v23).doubleValue()));
    Object v24 = null;
    Object v25 = ((com.google.javascript.jscomp.TypedScopeCreator)v18).createInitialScope(((com.google.javascript.rhino.Node)v22));
    Object v26 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.Scope)v25));
    org.junit.Assert.assertNotNull(v26);
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
    Object v7 = 0.0D;
    Object v8 = -40;
    Object v9 = 0;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = "L";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = ((com.google.javascript.jscomp.AbstractCompiler)v14).getErrorManager();
    Object v16 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v17 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.CodingConvention)v16));
    Object v18 = 0.0D;
    Object v19 = -40;
    Object v20 = 0;
    Object v21 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v18).doubleValue()),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
    Object v22 = 0.0D;
    Object v23 = -40;
    Object v24 = 0;
    Object v25 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v22).doubleValue()),(((java.lang.Integer)v23).intValue()),(((java.lang.Integer)v24).intValue()));
    Object v26 = ((com.google.javascript.rhino.Node)v21).copyInformationFromForTree(((com.google.javascript.rhino.Node)v25));
    Object v27 = ((com.google.javascript.jscomp.TypedScopeCreator)v17).createInitialScope(((com.google.javascript.rhino.Node)v21));
    Object v28 = "No other definitions can be inlinedu.";
    Object v29 = ((com.google.javascript.jscomp.Scope)v27).getOwnSlot(((java.lang.String)v28));
    Object v30 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.Scope)v27));
    org.junit.Assert.assertNotNull(v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v7 = 0.0D;
    Object v8 = -40;
    Object v9 = 0;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = "L";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = ((com.google.javascript.jscomp.AbstractCompiler)v14).getErrorManager();
    Object v16 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v17 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.CodingConvention)v16));
    Object v18 = 0.0D;
    Object v19 = -40;
    Object v20 = 0;
    Object v21 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v18).doubleValue()),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
    Object v22 = new com.google.javascript.rhino.JSDocInfo();
    ((com.google.javascript.rhino.Node)v21).setJSDocInfo(((com.google.javascript.rhino.JSDocInfo)v22));
    Object v23 = null;
    Object v24 = 0.0D;
    Object v25 = -40;
    Object v26 = 0;
    Object v27 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v24).doubleValue()),(((java.lang.Integer)v25).intValue()),(((java.lang.Integer)v26).intValue()));
    Object v28 = null;
    Object v29 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v27),((com.google.javascript.rhino.jstype.ObjectType)v28));
    Object v30 = ((com.google.javascript.jscomp.TypedScopeCreator)v17).createScope(((com.google.javascript.rhino.Node)v21),((com.google.javascript.jscomp.Scope)v29));
    Object v31 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.Scope)v30));
    org.junit.Assert.assertNotNull(v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getTopScope();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
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
    Object v7 = 0.0D;
    Object v8 = -40;
    Object v9 = 0;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = true;
    ((com.google.javascript.rhino.Node)v10).setWasEmptyNode((((java.lang.Boolean)v11).booleanValue()));
    Object v12 = null;
    Object v13 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createInitialScope(((com.google.javascript.rhino.Node)v10));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v7 = 0.0D;
    Object v8 = -40;
    Object v9 = 0;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = "L";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = ((com.google.javascript.jscomp.AbstractCompiler)v14).getErrorManager();
    Object v16 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v17 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.CodingConvention)v16));
    Object v18 = 0.0D;
    Object v19 = -40;
    Object v20 = 0;
    Object v21 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v18).doubleValue()),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
    Object v22 = 33;
    Object v23 = false;
    ((com.google.javascript.rhino.Node)v21).putBooleanProp((((java.lang.Integer)v22).intValue()),(((java.lang.Boolean)v23).booleanValue()));
    Object v24 = null;
    Object v25 = 0.0D;
    Object v26 = -40;
    Object v27 = 0;
    Object v28 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v25).doubleValue()),(((java.lang.Integer)v26).intValue()),(((java.lang.Integer)v27).intValue()));
    Object v29 = null;
    Object v30 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v28),((com.google.javascript.rhino.jstype.ObjectType)v29));
    Object v31 = ((com.google.javascript.jscomp.TypedScopeCreator)v17).createScope(((com.google.javascript.rhino.Node)v21),((com.google.javascript.jscomp.Scope)v30));
    Object v32 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.Scope)v31));
    org.junit.Assert.assertNotNull(v32);
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
    Object v7 = 0.0D;
    Object v8 = -40;
    Object v9 = 0;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = "L";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    ((com.google.javascript.rhino.Node)v10).appendStringTree(((java.lang.Appendable)v13));
    Object v14 = null;
    Object v15 = 0.0D;
    Object v16 = -40;
    Object v17 = 0;
    Object v18 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v15).doubleValue()),(((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()));
    Object v19 = null;
    Object v20 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v18),((com.google.javascript.rhino.jstype.ObjectType)v19));
    Object v21 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.Scope)v20));
    org.junit.Assert.assertNotNull(v21);
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
    Object v7 = 0.0D;
    Object v8 = -40;
    Object v9 = 0;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = 0.0D;
    Object v12 = -40;
    Object v13 = 0;
    Object v14 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.jstype.ObjectType)v15));
    Object v17 = "_";
    Object v18 = ((com.google.javascript.jscomp.Scope)v16).getVar(((java.lang.String)v17));
    Object v19 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.Scope)v16));
    org.junit.Assert.assertNotNull(v19);
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
    Object v7 = 0.0D;
    Object v8 = -40;
    Object v9 = 0;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = 0.0D;
    Object v12 = -40;
    Object v13 = 0;
    Object v14 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.jstype.ObjectType)v15));
    Object v17 = ".prototype.";
    Object v18 = ((com.google.javascript.jscomp.Scope)v16).getVar(((java.lang.String)v17));
    Object v19 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.Scope)v16));
    org.junit.Assert.assertNotNull(v19);
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
    Object v7 = 0.0D;
    Object v8 = -40;
    Object v9 = 0;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = "L";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = ((com.google.javascript.jscomp.AbstractCompiler)v14).getErrorManager();
    Object v16 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v17 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.CodingConvention)v16));
    Object v18 = 0.0D;
    Object v19 = -40;
    Object v20 = 0;
    Object v21 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v18).doubleValue()),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
    Object v22 = 0.0D;
    Object v23 = -40;
    Object v24 = 0;
    Object v25 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v22).doubleValue()),(((java.lang.Integer)v23).intValue()),(((java.lang.Integer)v24).intValue()));
    Object v26 = ((com.google.javascript.rhino.Node)v21).copyInformationFromForTree(((com.google.javascript.rhino.Node)v25));
    Object v27 = ((com.google.javascript.jscomp.TypedScopeCreator)v17).createInitialScope(((com.google.javascript.rhino.Node)v21));
    Object v28 = ((com.google.javascript.jscomp.Scope)v27).getVars();
    Object v29 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.Scope)v27));
    org.junit.Assert.assertNotNull(v29);
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
    Object v7 = 0.0D;
    Object v8 = -40;
    Object v9 = 0;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = true;
    ((com.google.javascript.rhino.Node)v10).setOptionalArg((((java.lang.Boolean)v11).booleanValue()));
    Object v12 = null;
    Object v13 = "L";
    Object v14 = java.nio.charset.Charset.defaultCharset();
    Object v15 = new java.io.PrintStream(((java.lang.String)v13),((java.nio.charset.Charset)v14));
    Object v16 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v15));
    Object v17 = ((com.google.javascript.jscomp.AbstractCompiler)v16).getErrorManager();
    Object v18 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v19 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v16),((com.google.javascript.jscomp.CodingConvention)v18));
    Object v20 = 0.0D;
    Object v21 = -40;
    Object v22 = 0;
    Object v23 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v20).doubleValue()),(((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()));
    Object v24 = 0.0D;
    Object v25 = -40;
    Object v26 = 0;
    Object v27 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v24).doubleValue()),(((java.lang.Integer)v25).intValue()),(((java.lang.Integer)v26).intValue()));
    Object v28 = null;
    Object v29 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v27),((com.google.javascript.rhino.jstype.ObjectType)v28));
    Object v30 = ":";
    Object v31 = ((com.google.javascript.jscomp.Scope)v29).getSlot(((java.lang.String)v30));
    Object v32 = ((com.google.javascript.jscomp.TypedScopeCreator)v19).createScope(((com.google.javascript.rhino.Node)v23),((com.google.javascript.jscomp.Scope)v29));
    Object v33 = "MIXIN";
    Object v34 = false;
    Object v35 = ((com.google.javascript.jscomp.Scope)v32).isDeclared(((java.lang.String)v33),(((java.lang.Boolean)v34).booleanValue()));
    Object v36 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.Scope)v32));
    org.junit.Assert.assertNotNull(v36);
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
    Object v7 = 0.0D;
    Object v8 = -40;
    Object v9 = 0;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = "L";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = ((com.google.javascript.jscomp.AbstractCompiler)v14).getErrorManager();
    Object v16 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v17 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.CodingConvention)v16));
    Object v18 = 0.0D;
    Object v19 = -40;
    Object v20 = 0;
    Object v21 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v18).doubleValue()),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
    Object v22 = 0.0D;
    Object v23 = -40;
    Object v24 = 0;
    Object v25 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v22).doubleValue()),(((java.lang.Integer)v23).intValue()),(((java.lang.Integer)v24).intValue()));
    Object v26 = null;
    Object v27 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v25),((com.google.javascript.rhino.jstype.ObjectType)v26));
    Object v28 = "";
    Object v29 = true;
    Object v30 = ((com.google.javascript.jscomp.Scope)v27).isDeclared(((java.lang.String)v28),(((java.lang.Boolean)v29).booleanValue()));
    Object v31 = ((com.google.javascript.jscomp.TypedScopeCreator)v17).createScope(((com.google.javascript.rhino.Node)v21),((com.google.javascript.jscomp.Scope)v27));
    Object v32 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.Scope)v31));
    org.junit.Assert.assertNotNull(v32);
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
    Object v7 = 0.0D;
    Object v8 = -40;
    Object v9 = 0;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = "L";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = ((com.google.javascript.jscomp.AbstractCompiler)v14).getErrorManager();
    Object v16 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v17 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.CodingConvention)v16));
    Object v18 = 0.0D;
    Object v19 = -40;
    Object v20 = 0;
    Object v21 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v18).doubleValue()),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
    Object v22 = 1;
    Object v23 = ((com.google.javascript.rhino.Node)v21).getAncestor((((java.lang.Integer)v22).intValue()));
    Object v24 = 0.0D;
    Object v25 = -40;
    Object v26 = 0;
    Object v27 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v24).doubleValue()),(((java.lang.Integer)v25).intValue()),(((java.lang.Integer)v26).intValue()));
    Object v28 = null;
    Object v29 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v27),((com.google.javascript.rhino.jstype.ObjectType)v28));
    Object v30 = ((com.google.javascript.jscomp.TypedScopeCreator)v17).createScope(((com.google.javascript.rhino.Node)v21),((com.google.javascript.jscomp.Scope)v29));
    Object v31 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.Scope)v30));
    org.junit.Assert.assertNotNull(v31);
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
    Object v7 = 0.0D;
    Object v8 = -40;
    Object v9 = 0;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = 0.0D;
    Object v12 = -40;
    Object v13 = 0;
    Object v14 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.jstype.ObjectType)v15));
    Object v17 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.Scope)v16));
    Object v18 = 0.0D;
    Object v19 = -40;
    Object v20 = 0;
    Object v21 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v18).doubleValue()),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
    Object v22 = 0.0D;
    Object v23 = -40;
    Object v24 = 0;
    Object v25 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v22).doubleValue()),(((java.lang.Integer)v23).intValue()),(((java.lang.Integer)v24).intValue()));
    Object v26 = null;
    Object v27 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v25),((com.google.javascript.rhino.jstype.ObjectType)v26));
    Object v28 = ((com.google.javascript.jscomp.Scope)v27).getVarCount();
    Object v29 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v21),((com.google.javascript.jscomp.Scope)v27));
    org.junit.Assert.assertNotNull(v29);
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
    Object v7 = 0.0D;
    Object v8 = -40;
    Object v9 = 0;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = 0.0D;
    Object v12 = -40;
    Object v13 = 0;
    Object v14 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.jstype.ObjectType)v15));
    Object v17 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.Scope)v16));
    Object v18 = 0.0D;
    Object v19 = -40;
    Object v20 = 0;
    Object v21 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v18).doubleValue()),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
    Object v22 = "L";
    Object v23 = java.nio.charset.Charset.defaultCharset();
    Object v24 = new java.io.PrintStream(((java.lang.String)v22),((java.nio.charset.Charset)v23));
    Object v25 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v24));
    Object v26 = ((com.google.javascript.jscomp.AbstractCompiler)v25).getErrorManager();
    Object v27 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v28 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v25),((com.google.javascript.jscomp.CodingConvention)v27));
    Object v29 = 0.0D;
    Object v30 = -40;
    Object v31 = 0;
    Object v32 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v29).doubleValue()),(((java.lang.Integer)v30).intValue()),(((java.lang.Integer)v31).intValue()));
    Object v33 = -19.866692602488122D;
    ((com.google.javascript.rhino.Node)v32).setDouble((((java.lang.Double)v33).doubleValue()));
    Object v34 = null;
    Object v35 = ((com.google.javascript.jscomp.TypedScopeCreator)v28).createInitialScope(((com.google.javascript.rhino.Node)v32));
    Object v36 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v21),((com.google.javascript.jscomp.Scope)v35));
    org.junit.Assert.assertNotNull(v36);
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
    Object v7 = 0.0D;
    Object v8 = -40;
    Object v9 = 0;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = "L";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = ((com.google.javascript.jscomp.AbstractCompiler)v14).getErrorManager();
    Object v16 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v17 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.CodingConvention)v16));
    Object v18 = 0.0D;
    Object v19 = -40;
    Object v20 = 0;
    Object v21 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v18).doubleValue()),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
    Object v22 = true;
    ((com.google.javascript.rhino.Node)v21).setWasEmptyNode((((java.lang.Boolean)v22).booleanValue()));
    Object v23 = null;
    Object v24 = ((com.google.javascript.jscomp.TypedScopeCreator)v17).createInitialScope(((com.google.javascript.rhino.Node)v21));
    Object v25 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.Scope)v24));
    org.junit.Assert.assertNotNull(v25);
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
    Object v7 = 0.0D;
    Object v8 = -40;
    Object v9 = 0;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = "L";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = ((com.google.javascript.jscomp.AbstractCompiler)v14).getErrorManager();
    Object v16 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v17 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.CodingConvention)v16));
    Object v18 = 0.0D;
    Object v19 = -40;
    Object v20 = 0;
    Object v21 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v18).doubleValue()),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
    Object v22 = 0.0D;
    Object v23 = -40;
    Object v24 = 0;
    Object v25 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v22).doubleValue()),(((java.lang.Integer)v23).intValue()),(((java.lang.Integer)v24).intValue()));
    Object v26 = null;
    Object v27 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v25),((com.google.javascript.rhino.jstype.ObjectType)v26));
    Object v28 = "_";
    Object v29 = ((com.google.javascript.jscomp.Scope)v27).getVar(((java.lang.String)v28));
    Object v30 = ((com.google.javascript.jscomp.TypedScopeCreator)v17).createScope(((com.google.javascript.rhino.Node)v21),((com.google.javascript.jscomp.Scope)v27));
    Object v31 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.Scope)v30));
    org.junit.Assert.assertNotNull(v31);
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
    Object v7 = 0.0D;
    Object v8 = -40;
    Object v9 = 0;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = ((com.google.javascript.rhino.Node)v10).getAncestors();
    Object v12 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createInitialScope(((com.google.javascript.rhino.Node)v10));
    org.junit.Assert.assertNotNull(v12);
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
    Object v7 = 0.0D;
    Object v8 = -40;
    Object v9 = 0;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = ((com.google.javascript.rhino.Node)v10).getDouble();
    Object v12 = "L";
    Object v13 = java.nio.charset.Charset.defaultCharset();
    Object v14 = new java.io.PrintStream(((java.lang.String)v12),((java.nio.charset.Charset)v13));
    Object v15 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v14));
    Object v16 = ((com.google.javascript.jscomp.AbstractCompiler)v15).getErrorManager();
    Object v17 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v18 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v15),((com.google.javascript.jscomp.CodingConvention)v17));
    Object v19 = 0.0D;
    Object v20 = -40;
    Object v21 = 0;
    Object v22 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v19).doubleValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()));
    Object v23 = 0.0D;
    Object v24 = -40;
    Object v25 = 0;
    Object v26 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v23).doubleValue()),(((java.lang.Integer)v24).intValue()),(((java.lang.Integer)v25).intValue()));
    Object v27 = null;
    Object v28 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v26),((com.google.javascript.rhino.jstype.ObjectType)v27));
    Object v29 = ".prototype.";
    Object v30 = ((com.google.javascript.jscomp.Scope)v28).getVar(((java.lang.String)v29));
    Object v31 = ((com.google.javascript.jscomp.TypedScopeCreator)v18).createScope(((com.google.javascript.rhino.Node)v22),((com.google.javascript.jscomp.Scope)v28));
    Object v32 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.Scope)v31));
    org.junit.Assert.assertNotNull(v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v5 = 0.0D;
    Object v6 = -40;
    Object v7 = 0;
    Object v8 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v5).doubleValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = 0.0D;
    Object v10 = -40;
    Object v11 = 0;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = ((com.google.javascript.jscomp.CodingConvention)v4).extractClassNameIfProvide(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.Node)v12));
    Object v14 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v4));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
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
    Object v7 = 0.0D;
    Object v8 = -40;
    Object v9 = 0;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = "L";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = ((com.google.javascript.jscomp.AbstractCompiler)v14).getErrorManager();
    Object v16 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v17 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.CodingConvention)v16));
    Object v18 = 0.0D;
    Object v19 = -40;
    Object v20 = 0;
    Object v21 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v18).doubleValue()),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
    Object v22 = "L";
    Object v23 = java.nio.charset.Charset.defaultCharset();
    Object v24 = new java.io.PrintStream(((java.lang.String)v22),((java.nio.charset.Charset)v23));
    Object v25 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v24));
    Object v26 = ((com.google.javascript.jscomp.AbstractCompiler)v25).getErrorManager();
    Object v27 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v28 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v25),((com.google.javascript.jscomp.CodingConvention)v27));
    Object v29 = 0.0D;
    Object v30 = -40;
    Object v31 = 0;
    Object v32 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v29).doubleValue()),(((java.lang.Integer)v30).intValue()),(((java.lang.Integer)v31).intValue()));
    Object v33 = -19.866692602488122D;
    ((com.google.javascript.rhino.Node)v32).setDouble((((java.lang.Double)v33).doubleValue()));
    Object v34 = null;
    Object v35 = ((com.google.javascript.jscomp.TypedScopeCreator)v28).createInitialScope(((com.google.javascript.rhino.Node)v32));
    Object v36 = ((com.google.javascript.jscomp.TypedScopeCreator)v17).createScope(((com.google.javascript.rhino.Node)v21),((com.google.javascript.jscomp.Scope)v35));
    Object v37 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.Scope)v36));
    org.junit.Assert.assertNotNull(v37);
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
    Object v7 = 0.0D;
    Object v8 = -40;
    Object v9 = 0;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = "L";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = ((com.google.javascript.jscomp.AbstractCompiler)v14).getErrorManager();
    Object v16 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v17 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.CodingConvention)v16));
    Object v18 = 0.0D;
    Object v19 = -40;
    Object v20 = 0;
    Object v21 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v18).doubleValue()),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
    Object v22 = ((com.google.javascript.jscomp.TypedScopeCreator)v17).createInitialScope(((com.google.javascript.rhino.Node)v21));
    Object v23 = "argument";
    Object v24 = ((com.google.javascript.jscomp.Scope)v22).getVar(((java.lang.String)v23));
    Object v25 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.Scope)v22));
    org.junit.Assert.assertNotNull(v25);
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
    Object v7 = 0.0D;
    Object v8 = -40;
    Object v9 = 0;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = 0.0D;
    Object v12 = -40;
    Object v13 = 0;
    Object v14 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.jstype.ObjectType)v15));
    Object v17 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.Scope)v16));
    Object v18 = 0.0D;
    Object v19 = -40;
    Object v20 = 0;
    Object v21 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v18).doubleValue()),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
    Object v22 = ((com.google.javascript.rhino.Node)v21).getAncestors();
    Object v23 = 0.0D;
    Object v24 = -40;
    Object v25 = 0;
    Object v26 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v23).doubleValue()),(((java.lang.Integer)v24).intValue()),(((java.lang.Integer)v25).intValue()));
    Object v27 = null;
    Object v28 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v26),((com.google.javascript.rhino.jstype.ObjectType)v27));
    Object v29 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v21),((com.google.javascript.jscomp.Scope)v28));
    org.junit.Assert.assertNotNull(v29);
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
    Object v7 = 0.0D;
    Object v8 = -40;
    Object v9 = 0;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = 0.0D;
    Object v12 = -40;
    Object v13 = 0;
    Object v14 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = ((com.google.javascript.rhino.Node)v10).checkTreeTypeAwareEqualsSilent(((com.google.javascript.rhino.Node)v14));
    Object v16 = "L";
    Object v17 = java.nio.charset.Charset.defaultCharset();
    Object v18 = new java.io.PrintStream(((java.lang.String)v16),((java.nio.charset.Charset)v17));
    Object v19 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v18));
    Object v20 = ((com.google.javascript.jscomp.AbstractCompiler)v19).getErrorManager();
    Object v21 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v22 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v19),((com.google.javascript.jscomp.CodingConvention)v21));
    Object v23 = 0.0D;
    Object v24 = -40;
    Object v25 = 0;
    Object v26 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v23).doubleValue()),(((java.lang.Integer)v24).intValue()),(((java.lang.Integer)v25).intValue()));
    Object v27 = 33;
    Object v28 = false;
    ((com.google.javascript.rhino.Node)v26).putBooleanProp((((java.lang.Integer)v27).intValue()),(((java.lang.Boolean)v28).booleanValue()));
    Object v29 = null;
    Object v30 = 0.0D;
    Object v31 = -40;
    Object v32 = 0;
    Object v33 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v30).doubleValue()),(((java.lang.Integer)v31).intValue()),(((java.lang.Integer)v32).intValue()));
    Object v34 = null;
    Object v35 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v33),((com.google.javascript.rhino.jstype.ObjectType)v34));
    Object v36 = ((com.google.javascript.jscomp.TypedScopeCreator)v22).createScope(((com.google.javascript.rhino.Node)v26),((com.google.javascript.jscomp.Scope)v35));
    Object v37 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.Scope)v36));
    org.junit.Assert.assertNotNull(v37);
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
    Object v7 = 0.0D;
    Object v8 = -40;
    Object v9 = 0;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = 0;
    Object v12 = 1;
    ((com.google.javascript.rhino.Node)v10).putIntProp((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v13 = null;
    Object v14 = "L";
    Object v15 = java.nio.charset.Charset.defaultCharset();
    Object v16 = new java.io.PrintStream(((java.lang.String)v14),((java.nio.charset.Charset)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v16));
    Object v18 = ((com.google.javascript.jscomp.AbstractCompiler)v17).getErrorManager();
    Object v19 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v20 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v17),((com.google.javascript.jscomp.CodingConvention)v19));
    Object v21 = 0.0D;
    Object v22 = -40;
    Object v23 = 0;
    Object v24 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v21).doubleValue()),(((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()));
    Object v25 = 1;
    Object v26 = ((com.google.javascript.rhino.Node)v24).getAncestor((((java.lang.Integer)v25).intValue()));
    Object v27 = 0.0D;
    Object v28 = -40;
    Object v29 = 0;
    Object v30 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v27).doubleValue()),(((java.lang.Integer)v28).intValue()),(((java.lang.Integer)v29).intValue()));
    Object v31 = null;
    Object v32 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v30),((com.google.javascript.rhino.jstype.ObjectType)v31));
    Object v33 = ((com.google.javascript.jscomp.TypedScopeCreator)v20).createScope(((com.google.javascript.rhino.Node)v24),((com.google.javascript.jscomp.Scope)v32));
    Object v34 = "function";
    Object v35 = ((com.google.javascript.jscomp.Scope)v33).getOwnSlot(((java.lang.String)v34));
    Object v36 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.Scope)v33));
    org.junit.Assert.assertNotNull(v36);
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
    Object v7 = 0.0D;
    Object v8 = -40;
    Object v9 = 0;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = 0.0D;
    Object v12 = -40;
    Object v13 = 0;
    Object v14 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = null;
    Object v16 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v14),((com.google.javascript.rhino.jstype.ObjectType)v15));
    Object v17 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.Scope)v16));
    Object v18 = 0.0D;
    Object v19 = -40;
    Object v20 = 0;
    Object v21 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v18).doubleValue()),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
    Object v22 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createInitialScope(((com.google.javascript.rhino.Node)v21));
    org.junit.Assert.assertNotNull(v22);
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
    Object v7 = 0.0D;
    Object v8 = -40;
    Object v9 = 0;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = "L";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = ((com.google.javascript.jscomp.AbstractCompiler)v14).getErrorManager();
    Object v16 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v17 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.CodingConvention)v16));
    Object v18 = 0.0D;
    Object v19 = -40;
    Object v20 = 0;
    Object v21 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v18).doubleValue()),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
    Object v22 = ((com.google.javascript.rhino.Node)v21).getAncestors();
    Object v23 = ((com.google.javascript.jscomp.TypedScopeCreator)v17).createInitialScope(((com.google.javascript.rhino.Node)v21));
    Object v24 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.Scope)v23));
    org.junit.Assert.assertNotNull(v24);
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
    Object v7 = 0.0D;
    Object v8 = -40;
    Object v9 = 0;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = 1;
    ((com.google.javascript.rhino.Node)v10).setCharno((((java.lang.Integer)v11).intValue()));
    Object v12 = null;
    Object v13 = 0.0D;
    Object v14 = -40;
    Object v15 = 0;
    Object v16 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v13).doubleValue()),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = null;
    Object v18 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v16),((com.google.javascript.rhino.jstype.ObjectType)v17));
    Object v19 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.Scope)v18));
    org.junit.Assert.assertNotNull(v19);
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
    Object v7 = 0.0D;
    Object v8 = -40;
    Object v9 = 0;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = ((com.google.javascript.rhino.Node)v10).getAncestors();
    Object v12 = "L";
    Object v13 = java.nio.charset.Charset.defaultCharset();
    Object v14 = new java.io.PrintStream(((java.lang.String)v12),((java.nio.charset.Charset)v13));
    Object v15 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v14));
    Object v16 = ((com.google.javascript.jscomp.AbstractCompiler)v15).getErrorManager();
    Object v17 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v18 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v15),((com.google.javascript.jscomp.CodingConvention)v17));
    Object v19 = 0.0D;
    Object v20 = -40;
    Object v21 = 0;
    Object v22 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v19).doubleValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()));
    Object v23 = 0.0D;
    Object v24 = -40;
    Object v25 = 0;
    Object v26 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v23).doubleValue()),(((java.lang.Integer)v24).intValue()),(((java.lang.Integer)v25).intValue()));
    Object v27 = null;
    Object v28 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v26),((com.google.javascript.rhino.jstype.ObjectType)v27));
    Object v29 = "_";
    Object v30 = ((com.google.javascript.jscomp.Scope)v28).getVar(((java.lang.String)v29));
    Object v31 = ((com.google.javascript.jscomp.TypedScopeCreator)v18).createScope(((com.google.javascript.rhino.Node)v22),((com.google.javascript.jscomp.Scope)v28));
    Object v32 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.Scope)v31));
    org.junit.Assert.assertNotNull(v32);
  }
}
