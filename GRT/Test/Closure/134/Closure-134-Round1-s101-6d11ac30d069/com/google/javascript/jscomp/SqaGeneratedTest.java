package com.google.javascript.jscomp;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v4));
    Object v6 = 29;
    Object v7 = "default";
    Object v8 = 1;
    Object v9 = 1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = ((com.google.javascript.rhino.Node)v10).isUnscopedQualifiedName();
    Object v12 = 29;
    Object v13 = "default";
    Object v14 = 1;
    Object v15 = 1;
    Object v16 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v12).intValue()),((java.lang.String)v13),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v17));
    Object v19 = "EVAL_ERROR_TYPE";
    Object v20 = "?";
    Object v21 = 1;
    Object v22 = -35;
    Object v23 = new com.google.javascript.rhino.jstype.NamedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v18),((java.lang.String)v19),((java.lang.String)v20),(((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()));
    Object v24 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v16),((com.google.javascript.rhino.jstype.ObjectType)v23));
    Object v25 = "removeUnusedPrototypeProperties";
    Object v26 = ((com.google.javascript.jscomp.Scope)v24).getSlot(((java.lang.String)v25));
    Object v27 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.Scope)v24));
    org.junit.Assert.assertNotNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getReverseAbstractInterpreter();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v4));
    Object v6 = 29;
    Object v7 = "default";
    Object v8 = 1;
    Object v9 = 1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = 29;
    Object v12 = "default";
    Object v13 = 1;
    Object v14 = 1;
    Object v15 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v11).intValue()),((java.lang.String)v12),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v16));
    Object v18 = "EVAL_ERROR_TYPE";
    Object v19 = "?";
    Object v20 = 1;
    Object v21 = -35;
    Object v22 = new com.google.javascript.rhino.jstype.NamedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v17),((java.lang.String)v18),((java.lang.String)v19),(((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()));
    Object v23 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v15),((com.google.javascript.rhino.jstype.ObjectType)v22));
    Object v24 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.Scope)v23));
    org.junit.Assert.assertNotNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getReverseAbstractInterpreter();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v7 = 29;
    Object v8 = "default";
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = 29;
    Object v13 = "default";
    Object v14 = 1;
    Object v15 = 1;
    Object v16 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v12).intValue()),((java.lang.String)v13),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v17));
    Object v19 = "EVAL_ERROR_TYPE";
    Object v20 = "?";
    Object v21 = 1;
    Object v22 = -35;
    Object v23 = new com.google.javascript.rhino.jstype.NamedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v18),((java.lang.String)v19),((java.lang.String)v20),(((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()));
    Object v24 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v16),((com.google.javascript.rhino.jstype.ObjectType)v23));
    Object v25 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v11),((com.google.javascript.jscomp.Scope)v24));
    org.junit.Assert.assertNotNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    ((com.google.javascript.jscomp.AbstractCompiler)v3).reportCodeChange();
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getReverseAbstractInterpreter();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v7 = 29;
    Object v8 = "default";
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = 29;
    Object v13 = "default";
    Object v14 = 1;
    Object v15 = 1;
    Object v16 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v12).intValue()),((java.lang.String)v13),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v17));
    Object v19 = "EVAL_ERROR_TYPE";
    Object v20 = "?";
    Object v21 = 1;
    Object v22 = -35;
    Object v23 = new com.google.javascript.rhino.jstype.NamedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v18),((java.lang.String)v19),((java.lang.String)v20),(((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()));
    Object v24 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v16),((com.google.javascript.rhino.jstype.ObjectType)v23));
    Object v25 = ((com.google.javascript.jscomp.Scope)v24).getVarCount();
    Object v26 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v11),((com.google.javascript.jscomp.Scope)v24));
    org.junit.Assert.assertNotNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v4));
    Object v6 = 29;
    Object v7 = "default";
    Object v8 = 1;
    Object v9 = 1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createInitialScope(((com.google.javascript.rhino.Node)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v4));
    Object v6 = 29;
    Object v7 = "default";
    Object v8 = 1;
    Object v9 = 1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = 29;
    Object v12 = "default";
    Object v13 = 1;
    Object v14 = 1;
    Object v15 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v11).intValue()),((java.lang.String)v12),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v16));
    Object v18 = "EVAL_ERROR_TYPE";
    Object v19 = "?";
    Object v20 = 1;
    Object v21 = -35;
    Object v22 = new com.google.javascript.rhino.jstype.NamedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v17),((java.lang.String)v18),((java.lang.String)v19),(((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()));
    Object v23 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v15),((com.google.javascript.rhino.jstype.ObjectType)v22));
    Object v24 = ((com.google.javascript.jscomp.Scope)v23).getVars();
    Object v25 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.Scope)v23));
    org.junit.Assert.assertNotNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getReverseAbstractInterpreter();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v7 = 29;
    Object v8 = "default";
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = 29;
    Object v13 = "default";
    Object v14 = 1;
    Object v15 = 1;
    Object v16 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v12).intValue()),((java.lang.String)v13),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v17));
    Object v19 = "EVAL_ERROR_TYPE";
    Object v20 = "?";
    Object v21 = 1;
    Object v22 = -35;
    Object v23 = new com.google.javascript.rhino.jstype.NamedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v18),((java.lang.String)v19),((java.lang.String)v20),(((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()));
    Object v24 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v16),((com.google.javascript.rhino.jstype.ObjectType)v23));
    Object v25 = "";
    Object v26 = ((com.google.javascript.jscomp.Scope)v24).getOwnSlot(((java.lang.String)v25));
    Object v27 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v11),((com.google.javascript.jscomp.Scope)v24));
    org.junit.Assert.assertNotNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    ((com.google.javascript.jscomp.AbstractCompiler)v3).reportCodeChange();
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = 29;
    Object v7 = "default";
    Object v8 = 1;
    Object v9 = 1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = 29;
    Object v12 = "default";
    Object v13 = 1;
    Object v14 = 1;
    Object v15 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v11).intValue()),((java.lang.String)v12),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v16));
    Object v18 = "EVAL_ERROR_TYPE";
    Object v19 = "?";
    Object v20 = 1;
    Object v21 = -35;
    Object v22 = new com.google.javascript.rhino.jstype.NamedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v17),((java.lang.String)v18),((java.lang.String)v19),(((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()));
    Object v23 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v15),((com.google.javascript.rhino.jstype.ObjectType)v22));
    Object v24 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.Scope)v23));
    org.junit.Assert.assertNotNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = 29;
    Object v6 = "default";
    Object v7 = 1;
    Object v8 = 1;
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v5).intValue()),((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = "L";
    Object v11 = java.nio.charset.Charset.defaultCharset();
    Object v12 = new java.io.PrintStream(((java.lang.String)v10),((java.nio.charset.Charset)v11));
    Object v13 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v12));
    Object v14 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v15 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v13),((com.google.javascript.jscomp.CodingConvention)v14));
    Object v16 = 29;
    Object v17 = "default";
    Object v18 = 1;
    Object v19 = 1;
    Object v20 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v16).intValue()),((java.lang.String)v17),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()));
    Object v21 = 29;
    Object v22 = "default";
    Object v23 = 1;
    Object v24 = 1;
    Object v25 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v21).intValue()),((java.lang.String)v22),(((java.lang.Integer)v23).intValue()),(((java.lang.Integer)v24).intValue()));
    Object v26 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v27 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v26));
    Object v28 = "EVAL_ERROR_TYPE";
    Object v29 = "?";
    Object v30 = 1;
    Object v31 = -35;
    Object v32 = new com.google.javascript.rhino.jstype.NamedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v27),((java.lang.String)v28),((java.lang.String)v29),(((java.lang.Integer)v30).intValue()),(((java.lang.Integer)v31).intValue()));
    Object v33 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v25),((com.google.javascript.rhino.jstype.ObjectType)v32));
    Object v34 = ((com.google.javascript.jscomp.TypedScopeCreator)v15).createScope(((com.google.javascript.rhino.Node)v20),((com.google.javascript.jscomp.Scope)v33));
    Object v35 = ((com.google.javascript.jscomp.TypedScopeCreator)v4).createScope(((com.google.javascript.rhino.Node)v9),((com.google.javascript.jscomp.Scope)v34));
    org.junit.Assert.assertNotNull(v35);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v4));
    Object v6 = 29;
    Object v7 = "default";
    Object v8 = 1;
    Object v9 = 1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = "L";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v16 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.CodingConvention)v15));
    Object v17 = 29;
    Object v18 = "default";
    Object v19 = 1;
    Object v20 = 1;
    Object v21 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v17).intValue()),((java.lang.String)v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
    Object v22 = 29;
    Object v23 = "default";
    Object v24 = 1;
    Object v25 = 1;
    Object v26 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v22).intValue()),((java.lang.String)v23),(((java.lang.Integer)v24).intValue()),(((java.lang.Integer)v25).intValue()));
    Object v27 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v27));
    Object v29 = "EVAL_ERROR_TYPE";
    Object v30 = "?";
    Object v31 = 1;
    Object v32 = -35;
    Object v33 = new com.google.javascript.rhino.jstype.NamedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v28),((java.lang.String)v29),((java.lang.String)v30),(((java.lang.Integer)v31).intValue()),(((java.lang.Integer)v32).intValue()));
    Object v34 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v26),((com.google.javascript.rhino.jstype.ObjectType)v33));
    Object v35 = ((com.google.javascript.jscomp.Scope)v34).getVars();
    Object v36 = ((com.google.javascript.jscomp.TypedScopeCreator)v16).createScope(((com.google.javascript.rhino.Node)v21),((com.google.javascript.jscomp.Scope)v34));
    Object v37 = "u";
    Object v38 = ((com.google.javascript.jscomp.Scope)v36).getVar(((java.lang.String)v37));
    Object v39 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.Scope)v36));
    org.junit.Assert.assertNotNull(v39);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v4));
    Object v6 = 29;
    Object v7 = "default";
    Object v8 = 1;
    Object v9 = 1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = 29;
    Object v12 = "default";
    Object v13 = 1;
    Object v14 = 1;
    Object v15 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v11).intValue()),((java.lang.String)v12),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v16));
    Object v18 = "EVAL_ERROR_TYPE";
    Object v19 = "?";
    Object v20 = 1;
    Object v21 = -35;
    Object v22 = new com.google.javascript.rhino.jstype.NamedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v17),((java.lang.String)v18),((java.lang.String)v19),(((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()));
    Object v23 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v15),((com.google.javascript.rhino.jstype.ObjectType)v22));
    Object v24 = "toString";
    Object v25 = ((com.google.javascript.jscomp.Scope)v23).getVar(((java.lang.String)v24));
    Object v26 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.Scope)v23));
    org.junit.Assert.assertNotNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v4));
    Object v6 = 29;
    Object v7 = "default";
    Object v8 = 1;
    Object v9 = 1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = 29;
    Object v12 = "default";
    Object v13 = 1;
    Object v14 = 1;
    Object v15 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v11).intValue()),((java.lang.String)v12),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v16));
    Object v18 = "EVAL_ERROR_TYPE";
    Object v19 = "?";
    Object v20 = 1;
    Object v21 = -35;
    Object v22 = new com.google.javascript.rhino.jstype.NamedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v17),((java.lang.String)v18),((java.lang.String)v19),(((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()));
    Object v23 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v15),((com.google.javascript.rhino.jstype.ObjectType)v22));
    Object v24 = " -= ";
    Object v25 = ((com.google.javascript.jscomp.Scope)v23).getVar(((java.lang.String)v24));
    Object v26 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.Scope)v23));
    org.junit.Assert.assertNotNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v4));
    Object v6 = 29;
    Object v7 = "default";
    Object v8 = 1;
    Object v9 = 1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = -35;
    ((com.google.javascript.rhino.Node)v10).removeProp((((java.lang.Integer)v11).intValue()));
    Object v12 = null;
    Object v13 = 29;
    Object v14 = "default";
    Object v15 = 1;
    Object v16 = 1;
    Object v17 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v13).intValue()),((java.lang.String)v14),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v18));
    Object v20 = "EVAL_ERROR_TYPE";
    Object v21 = "?";
    Object v22 = 1;
    Object v23 = -35;
    Object v24 = new com.google.javascript.rhino.jstype.NamedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v19),((java.lang.String)v20),((java.lang.String)v21),(((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()));
    Object v25 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v17),((com.google.javascript.rhino.jstype.ObjectType)v24));
    Object v26 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.Scope)v25));
    org.junit.Assert.assertNotNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v4));
    Object v6 = 29;
    Object v7 = "default";
    Object v8 = 1;
    Object v9 = 1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = "L";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v16 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.CodingConvention)v15));
    Object v17 = 29;
    Object v18 = "default";
    Object v19 = 1;
    Object v20 = 1;
    Object v21 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v17).intValue()),((java.lang.String)v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
    Object v22 = ((com.google.javascript.jscomp.TypedScopeCreator)v16).createInitialScope(((com.google.javascript.rhino.Node)v21));
    Object v23 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.Scope)v22));
    org.junit.Assert.assertNotNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    ((com.google.javascript.jscomp.AbstractCompiler)v3).reportCodeChange();
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = 29;
    Object v7 = "default";
    Object v8 = 1;
    Object v9 = 1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = 29;
    Object v12 = "default";
    Object v13 = 1;
    Object v14 = 1;
    Object v15 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v11).intValue()),((java.lang.String)v12),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v16));
    Object v18 = "EVAL_ERROR_TYPE";
    Object v19 = "?";
    Object v20 = 1;
    Object v21 = -35;
    Object v22 = new com.google.javascript.rhino.jstype.NamedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v17),((java.lang.String)v18),((java.lang.String)v19),(((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()));
    Object v23 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v15),((com.google.javascript.rhino.jstype.ObjectType)v22));
    Object v24 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.Scope)v23));
    Object v25 = 29;
    Object v26 = "default";
    Object v27 = 1;
    Object v28 = 1;
    Object v29 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v25).intValue()),((java.lang.String)v26),(((java.lang.Integer)v27).intValue()),(((java.lang.Integer)v28).intValue()));
    Object v30 = ((com.google.javascript.rhino.Node)v29).siblings();
    Object v31 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createInitialScope(((com.google.javascript.rhino.Node)v29));
    org.junit.Assert.assertNotNull(v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v4));
    Object v6 = 29;
    Object v7 = "default";
    Object v8 = 1;
    Object v9 = 1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = "L";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v16 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.CodingConvention)v15));
    Object v17 = 29;
    Object v18 = "default";
    Object v19 = 1;
    Object v20 = 1;
    Object v21 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v17).intValue()),((java.lang.String)v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
    Object v22 = 29;
    Object v23 = "default";
    Object v24 = 1;
    Object v25 = 1;
    Object v26 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v22).intValue()),((java.lang.String)v23),(((java.lang.Integer)v24).intValue()),(((java.lang.Integer)v25).intValue()));
    Object v27 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v27));
    Object v29 = "EVAL_ERROR_TYPE";
    Object v30 = "?";
    Object v31 = 1;
    Object v32 = -35;
    Object v33 = new com.google.javascript.rhino.jstype.NamedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v28),((java.lang.String)v29),((java.lang.String)v30),(((java.lang.Integer)v31).intValue()),(((java.lang.Integer)v32).intValue()));
    Object v34 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v26),((com.google.javascript.rhino.jstype.ObjectType)v33));
    Object v35 = ((com.google.javascript.jscomp.Scope)v34).getVars();
    Object v36 = ((com.google.javascript.jscomp.TypedScopeCreator)v16).createScope(((com.google.javascript.rhino.Node)v21),((com.google.javascript.jscomp.Scope)v34));
    Object v37 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.Scope)v36));
    org.junit.Assert.assertNotNull(v37);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v4));
    Object v6 = 29;
    Object v7 = "default";
    Object v8 = 1;
    Object v9 = 1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = "L";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v16 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.CodingConvention)v15));
    Object v17 = 29;
    Object v18 = "default";
    Object v19 = 1;
    Object v20 = 1;
    Object v21 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v17).intValue()),((java.lang.String)v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
    Object v22 = 29;
    Object v23 = "default";
    Object v24 = 1;
    Object v25 = 1;
    Object v26 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v22).intValue()),((java.lang.String)v23),(((java.lang.Integer)v24).intValue()),(((java.lang.Integer)v25).intValue()));
    Object v27 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v27));
    Object v29 = "EVAL_ERROR_TYPE";
    Object v30 = "?";
    Object v31 = 1;
    Object v32 = -35;
    Object v33 = new com.google.javascript.rhino.jstype.NamedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v28),((java.lang.String)v29),((java.lang.String)v30),(((java.lang.Integer)v31).intValue()),(((java.lang.Integer)v32).intValue()));
    Object v34 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v26),((com.google.javascript.rhino.jstype.ObjectType)v33));
    Object v35 = " -= ";
    Object v36 = ((com.google.javascript.jscomp.Scope)v34).getVar(((java.lang.String)v35));
    Object v37 = ((com.google.javascript.jscomp.TypedScopeCreator)v16).createScope(((com.google.javascript.rhino.Node)v21),((com.google.javascript.jscomp.Scope)v34));
    Object v38 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.Scope)v37));
    org.junit.Assert.assertNotNull(v38);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v4));
    Object v6 = 29;
    Object v7 = "default";
    Object v8 = 1;
    Object v9 = 1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = "L";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = ((com.google.javascript.jscomp.AbstractCompiler)v14).getReverseAbstractInterpreter();
    Object v16 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v17 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.CodingConvention)v16));
    Object v18 = 29;
    Object v19 = "default";
    Object v20 = 1;
    Object v21 = 1;
    Object v22 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v18).intValue()),((java.lang.String)v19),(((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()));
    Object v23 = 29;
    Object v24 = "default";
    Object v25 = 1;
    Object v26 = 1;
    Object v27 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v23).intValue()),((java.lang.String)v24),(((java.lang.Integer)v25).intValue()),(((java.lang.Integer)v26).intValue()));
    Object v28 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v29 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v28));
    Object v30 = "EVAL_ERROR_TYPE";
    Object v31 = "?";
    Object v32 = 1;
    Object v33 = -35;
    Object v34 = new com.google.javascript.rhino.jstype.NamedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v29),((java.lang.String)v30),((java.lang.String)v31),(((java.lang.Integer)v32).intValue()),(((java.lang.Integer)v33).intValue()));
    Object v35 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v27),((com.google.javascript.rhino.jstype.ObjectType)v34));
    Object v36 = ((com.google.javascript.jscomp.TypedScopeCreator)v17).createScope(((com.google.javascript.rhino.Node)v22),((com.google.javascript.jscomp.Scope)v35));
    Object v37 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.Scope)v36));
    org.junit.Assert.assertNotNull(v37);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v5 = ((com.google.javascript.jscomp.CodingConvention)v4).getAbstractMethodName();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v4));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v5 = ((com.google.javascript.jscomp.CodingConvention)v4).getAbstractMethodName();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v4));
    Object v7 = 29;
    Object v8 = "default";
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = "L";
    Object v13 = java.nio.charset.Charset.defaultCharset();
    Object v14 = new java.io.PrintStream(((java.lang.String)v12),((java.nio.charset.Charset)v13));
    Object v15 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v14));
    Object v16 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v17 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v15),((com.google.javascript.jscomp.CodingConvention)v16));
    Object v18 = 29;
    Object v19 = "default";
    Object v20 = 1;
    Object v21 = 1;
    Object v22 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v18).intValue()),((java.lang.String)v19),(((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()));
    Object v23 = 29;
    Object v24 = "default";
    Object v25 = 1;
    Object v26 = 1;
    Object v27 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v23).intValue()),((java.lang.String)v24),(((java.lang.Integer)v25).intValue()),(((java.lang.Integer)v26).intValue()));
    Object v28 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v29 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v28));
    Object v30 = "EVAL_ERROR_TYPE";
    Object v31 = "?";
    Object v32 = 1;
    Object v33 = -35;
    Object v34 = new com.google.javascript.rhino.jstype.NamedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v29),((java.lang.String)v30),((java.lang.String)v31),(((java.lang.Integer)v32).intValue()),(((java.lang.Integer)v33).intValue()));
    Object v35 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v27),((com.google.javascript.rhino.jstype.ObjectType)v34));
    Object v36 = ((com.google.javascript.jscomp.Scope)v35).getVars();
    Object v37 = ((com.google.javascript.jscomp.TypedScopeCreator)v17).createScope(((com.google.javascript.rhino.Node)v22),((com.google.javascript.jscomp.Scope)v35));
    Object v38 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v11),((com.google.javascript.jscomp.Scope)v37));
    org.junit.Assert.assertNotNull(v38);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = 29;
    Object v6 = "default";
    Object v7 = 1;
    Object v8 = 1;
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v5).intValue()),((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = "L";
    Object v11 = java.nio.charset.Charset.defaultCharset();
    Object v12 = new java.io.PrintStream(((java.lang.String)v10),((java.nio.charset.Charset)v11));
    Object v13 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v12));
    Object v14 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v15 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v13),((com.google.javascript.jscomp.CodingConvention)v14));
    Object v16 = 29;
    Object v17 = "default";
    Object v18 = 1;
    Object v19 = 1;
    Object v20 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v16).intValue()),((java.lang.String)v17),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()));
    Object v21 = ((com.google.javascript.jscomp.TypedScopeCreator)v15).createInitialScope(((com.google.javascript.rhino.Node)v20));
    Object v22 = ((com.google.javascript.jscomp.TypedScopeCreator)v4).createScope(((com.google.javascript.rhino.Node)v9),((com.google.javascript.jscomp.Scope)v21));
    org.junit.Assert.assertNotNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v4));
    Object v6 = 29;
    Object v7 = "default";
    Object v8 = 1;
    Object v9 = 1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = false;
    ((com.google.javascript.rhino.Node)v10).setOptionalArg((((java.lang.Boolean)v11).booleanValue()));
    Object v12 = null;
    Object v13 = 29;
    Object v14 = "default";
    Object v15 = 1;
    Object v16 = 1;
    Object v17 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v13).intValue()),((java.lang.String)v14),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v18));
    Object v20 = "EVAL_ERROR_TYPE";
    Object v21 = "?";
    Object v22 = 1;
    Object v23 = -35;
    Object v24 = new com.google.javascript.rhino.jstype.NamedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v19),((java.lang.String)v20),((java.lang.String)v21),(((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()));
    Object v25 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v17),((com.google.javascript.rhino.jstype.ObjectType)v24));
    Object v26 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.Scope)v25));
    org.junit.Assert.assertNotNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getReverseAbstractInterpreter();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v7 = 29;
    Object v8 = "default";
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = ((com.google.javascript.rhino.Node)v11).getAncestors();
    Object v13 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createInitialScope(((com.google.javascript.rhino.Node)v11));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    ((com.google.javascript.jscomp.AbstractCompiler)v3).reportCodeChange();
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = 29;
    Object v7 = "default";
    Object v8 = 1;
    Object v9 = 1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = "L";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v16 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.CodingConvention)v15));
    Object v17 = 29;
    Object v18 = "default";
    Object v19 = 1;
    Object v20 = 1;
    Object v21 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v17).intValue()),((java.lang.String)v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
    Object v22 = 29;
    Object v23 = "default";
    Object v24 = 1;
    Object v25 = 1;
    Object v26 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v22).intValue()),((java.lang.String)v23),(((java.lang.Integer)v24).intValue()),(((java.lang.Integer)v25).intValue()));
    Object v27 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v27));
    Object v29 = "EVAL_ERROR_TYPE";
    Object v30 = "?";
    Object v31 = 1;
    Object v32 = -35;
    Object v33 = new com.google.javascript.rhino.jstype.NamedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v28),((java.lang.String)v29),((java.lang.String)v30),(((java.lang.Integer)v31).intValue()),(((java.lang.Integer)v32).intValue()));
    Object v34 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v26),((com.google.javascript.rhino.jstype.ObjectType)v33));
    Object v35 = ((com.google.javascript.jscomp.Scope)v34).getVars();
    Object v36 = ((com.google.javascript.jscomp.TypedScopeCreator)v16).createScope(((com.google.javascript.rhino.Node)v21),((com.google.javascript.jscomp.Scope)v34));
    Object v37 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.Scope)v36));
    org.junit.Assert.assertNotNull(v37);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    ((com.google.javascript.jscomp.AbstractCompiler)v3).reportCodeChange();
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = 29;
    Object v7 = "default";
    Object v8 = 1;
    Object v9 = 1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = 29;
    Object v12 = "default";
    Object v13 = 1;
    Object v14 = 1;
    Object v15 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v11).intValue()),((java.lang.String)v12),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v16));
    Object v18 = "EVAL_ERROR_TYPE";
    Object v19 = "?";
    Object v20 = 1;
    Object v21 = -35;
    Object v22 = new com.google.javascript.rhino.jstype.NamedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v17),((java.lang.String)v18),((java.lang.String)v19),(((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()));
    Object v23 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v15),((com.google.javascript.rhino.jstype.ObjectType)v22));
    Object v24 = "L";
    Object v25 = ((com.google.javascript.jscomp.Scope)v23).getOwnSlot(((java.lang.String)v24));
    Object v26 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.Scope)v23));
    org.junit.Assert.assertNotNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v5 = ((com.google.javascript.jscomp.CodingConvention)v4).getAbstractMethodName();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v4));
    Object v7 = 29;
    Object v8 = "default";
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = 29;
    Object v13 = "default";
    Object v14 = 1;
    Object v15 = 1;
    Object v16 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v12).intValue()),((java.lang.String)v13),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v17));
    Object v19 = "EVAL_ERROR_TYPE";
    Object v20 = "?";
    Object v21 = 1;
    Object v22 = -35;
    Object v23 = new com.google.javascript.rhino.jstype.NamedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v18),((java.lang.String)v19),((java.lang.String)v20),(((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()));
    Object v24 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v16),((com.google.javascript.rhino.jstype.ObjectType)v23));
    Object v25 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v11),((com.google.javascript.jscomp.Scope)v24));
    org.junit.Assert.assertNotNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v5 = ((com.google.javascript.jscomp.CodingConvention)v4).getAbstractMethodName();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v4));
    Object v7 = 29;
    Object v8 = "default";
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createInitialScope(((com.google.javascript.rhino.Node)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    ((com.google.javascript.jscomp.AbstractCompiler)v3).reportCodeChange();
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = 29;
    Object v7 = "default";
    Object v8 = 1;
    Object v9 = 1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = "L";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = ((com.google.javascript.jscomp.AbstractCompiler)v14).getReverseAbstractInterpreter();
    Object v16 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v17 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.CodingConvention)v16));
    Object v18 = 29;
    Object v19 = "default";
    Object v20 = 1;
    Object v21 = 1;
    Object v22 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v18).intValue()),((java.lang.String)v19),(((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()));
    Object v23 = 29;
    Object v24 = "default";
    Object v25 = 1;
    Object v26 = 1;
    Object v27 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v23).intValue()),((java.lang.String)v24),(((java.lang.Integer)v25).intValue()),(((java.lang.Integer)v26).intValue()));
    Object v28 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v29 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v28));
    Object v30 = "EVAL_ERROR_TYPE";
    Object v31 = "?";
    Object v32 = 1;
    Object v33 = -35;
    Object v34 = new com.google.javascript.rhino.jstype.NamedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v29),((java.lang.String)v30),((java.lang.String)v31),(((java.lang.Integer)v32).intValue()),(((java.lang.Integer)v33).intValue()));
    Object v35 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v27),((com.google.javascript.rhino.jstype.ObjectType)v34));
    Object v36 = "";
    Object v37 = ((com.google.javascript.jscomp.Scope)v35).getOwnSlot(((java.lang.String)v36));
    Object v38 = ((com.google.javascript.jscomp.TypedScopeCreator)v17).createScope(((com.google.javascript.rhino.Node)v22),((com.google.javascript.jscomp.Scope)v35));
    Object v39 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.Scope)v38));
    org.junit.Assert.assertNotNull(v39);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v5 = ((com.google.javascript.jscomp.CodingConvention)v4).getAbstractMethodName();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v4));
    Object v7 = 29;
    Object v8 = "default";
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = "L";
    Object v13 = java.nio.charset.Charset.defaultCharset();
    Object v14 = new java.io.PrintStream(((java.lang.String)v12),((java.nio.charset.Charset)v13));
    Object v15 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v14));
    Object v16 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v17 = ((com.google.javascript.jscomp.CodingConvention)v16).getAbstractMethodName();
    Object v18 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v15),((com.google.javascript.jscomp.CodingConvention)v16));
    Object v19 = 29;
    Object v20 = "default";
    Object v21 = 1;
    Object v22 = 1;
    Object v23 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v19).intValue()),((java.lang.String)v20),(((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()));
    Object v24 = 29;
    Object v25 = "default";
    Object v26 = 1;
    Object v27 = 1;
    Object v28 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v24).intValue()),((java.lang.String)v25),(((java.lang.Integer)v26).intValue()),(((java.lang.Integer)v27).intValue()));
    Object v29 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v29));
    Object v31 = "EVAL_ERROR_TYPE";
    Object v32 = "?";
    Object v33 = 1;
    Object v34 = -35;
    Object v35 = new com.google.javascript.rhino.jstype.NamedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v30),((java.lang.String)v31),((java.lang.String)v32),(((java.lang.Integer)v33).intValue()),(((java.lang.Integer)v34).intValue()));
    Object v36 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v28),((com.google.javascript.rhino.jstype.ObjectType)v35));
    Object v37 = ((com.google.javascript.jscomp.TypedScopeCreator)v18).createScope(((com.google.javascript.rhino.Node)v23),((com.google.javascript.jscomp.Scope)v36));
    Object v38 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v11),((com.google.javascript.jscomp.Scope)v37));
    org.junit.Assert.assertNotNull(v38);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v5 = ((com.google.javascript.jscomp.CodingConvention)v4).getAbstractMethodName();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v4));
    Object v7 = 29;
    Object v8 = "default";
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = "L";
    Object v13 = java.nio.charset.Charset.defaultCharset();
    Object v14 = new java.io.PrintStream(((java.lang.String)v12),((java.nio.charset.Charset)v13));
    Object v15 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v14));
    Object v16 = ((com.google.javascript.jscomp.AbstractCompiler)v15).getReverseAbstractInterpreter();
    Object v17 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v18 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v15),((com.google.javascript.jscomp.CodingConvention)v17));
    Object v19 = 29;
    Object v20 = "default";
    Object v21 = 1;
    Object v22 = 1;
    Object v23 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v19).intValue()),((java.lang.String)v20),(((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()));
    Object v24 = 29;
    Object v25 = "default";
    Object v26 = 1;
    Object v27 = 1;
    Object v28 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v24).intValue()),((java.lang.String)v25),(((java.lang.Integer)v26).intValue()),(((java.lang.Integer)v27).intValue()));
    Object v29 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v29));
    Object v31 = "EVAL_ERROR_TYPE";
    Object v32 = "?";
    Object v33 = 1;
    Object v34 = -35;
    Object v35 = new com.google.javascript.rhino.jstype.NamedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v30),((java.lang.String)v31),((java.lang.String)v32),(((java.lang.Integer)v33).intValue()),(((java.lang.Integer)v34).intValue()));
    Object v36 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v28),((com.google.javascript.rhino.jstype.ObjectType)v35));
    Object v37 = ((com.google.javascript.jscomp.TypedScopeCreator)v18).createScope(((com.google.javascript.rhino.Node)v23),((com.google.javascript.jscomp.Scope)v36));
    Object v38 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v11),((com.google.javascript.jscomp.Scope)v37));
    org.junit.Assert.assertNotNull(v38);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v4));
    Object v6 = 29;
    Object v7 = "default";
    Object v8 = 1;
    Object v9 = 1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = "L";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v16 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.CodingConvention)v15));
    Object v17 = 29;
    Object v18 = "default";
    Object v19 = 1;
    Object v20 = 1;
    Object v21 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v17).intValue()),((java.lang.String)v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
    Object v22 = 29;
    Object v23 = "default";
    Object v24 = 1;
    Object v25 = 1;
    Object v26 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v22).intValue()),((java.lang.String)v23),(((java.lang.Integer)v24).intValue()),(((java.lang.Integer)v25).intValue()));
    Object v27 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v27));
    Object v29 = "EVAL_ERROR_TYPE";
    Object v30 = "?";
    Object v31 = 1;
    Object v32 = -35;
    Object v33 = new com.google.javascript.rhino.jstype.NamedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v28),((java.lang.String)v29),((java.lang.String)v30),(((java.lang.Integer)v31).intValue()),(((java.lang.Integer)v32).intValue()));
    Object v34 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v26),((com.google.javascript.rhino.jstype.ObjectType)v33));
    Object v35 = " -= ";
    Object v36 = ((com.google.javascript.jscomp.Scope)v34).getVar(((java.lang.String)v35));
    Object v37 = ((com.google.javascript.jscomp.TypedScopeCreator)v16).createScope(((com.google.javascript.rhino.Node)v21),((com.google.javascript.jscomp.Scope)v34));
    Object v38 = ((com.google.javascript.jscomp.Scope)v37).getVars();
    Object v39 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.Scope)v37));
    org.junit.Assert.assertNotNull(v39);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    ((com.google.javascript.jscomp.AbstractCompiler)v3).reportCodeChange();
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = 29;
    Object v7 = "default";
    Object v8 = 1;
    Object v9 = 1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = "L";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v16 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.CodingConvention)v15));
    Object v17 = 29;
    Object v18 = "default";
    Object v19 = 1;
    Object v20 = 1;
    Object v21 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v17).intValue()),((java.lang.String)v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
    Object v22 = "L";
    Object v23 = java.nio.charset.Charset.defaultCharset();
    Object v24 = new java.io.PrintStream(((java.lang.String)v22),((java.nio.charset.Charset)v23));
    Object v25 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v24));
    Object v26 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v27 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v25),((com.google.javascript.jscomp.CodingConvention)v26));
    Object v28 = 29;
    Object v29 = "default";
    Object v30 = 1;
    Object v31 = 1;
    Object v32 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v28).intValue()),((java.lang.String)v29),(((java.lang.Integer)v30).intValue()),(((java.lang.Integer)v31).intValue()));
    Object v33 = ((com.google.javascript.jscomp.TypedScopeCreator)v27).createInitialScope(((com.google.javascript.rhino.Node)v32));
    Object v34 = ((com.google.javascript.jscomp.TypedScopeCreator)v16).createScope(((com.google.javascript.rhino.Node)v21),((com.google.javascript.jscomp.Scope)v33));
    Object v35 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.Scope)v34));
    org.junit.Assert.assertNotNull(v35);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v4));
    Object v6 = 29;
    Object v7 = "default";
    Object v8 = 1;
    Object v9 = 1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = "L";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v16 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.CodingConvention)v15));
    Object v17 = 29;
    Object v18 = "default";
    Object v19 = 1;
    Object v20 = 1;
    Object v21 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v17).intValue()),((java.lang.String)v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
    Object v22 = 29;
    Object v23 = "default";
    Object v24 = 1;
    Object v25 = 1;
    Object v26 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v22).intValue()),((java.lang.String)v23),(((java.lang.Integer)v24).intValue()),(((java.lang.Integer)v25).intValue()));
    Object v27 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v27));
    Object v29 = "EVAL_ERROR_TYPE";
    Object v30 = "?";
    Object v31 = 1;
    Object v32 = -35;
    Object v33 = new com.google.javascript.rhino.jstype.NamedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v28),((java.lang.String)v29),((java.lang.String)v30),(((java.lang.Integer)v31).intValue()),(((java.lang.Integer)v32).intValue()));
    Object v34 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v26),((com.google.javascript.rhino.jstype.ObjectType)v33));
    Object v35 = "toString";
    Object v36 = ((com.google.javascript.jscomp.Scope)v34).getVar(((java.lang.String)v35));
    Object v37 = ((com.google.javascript.jscomp.TypedScopeCreator)v16).createScope(((com.google.javascript.rhino.Node)v21),((com.google.javascript.jscomp.Scope)v34));
    Object v38 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.Scope)v37));
    org.junit.Assert.assertNotNull(v38);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    ((com.google.javascript.jscomp.AbstractCompiler)v3).reportCodeChange();
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = 29;
    Object v7 = "default";
    Object v8 = 1;
    Object v9 = 1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = "L";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v16 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.CodingConvention)v15));
    Object v17 = 29;
    Object v18 = "default";
    Object v19 = 1;
    Object v20 = 1;
    Object v21 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v17).intValue()),((java.lang.String)v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
    Object v22 = -35;
    ((com.google.javascript.rhino.Node)v21).removeProp((((java.lang.Integer)v22).intValue()));
    Object v23 = null;
    Object v24 = 29;
    Object v25 = "default";
    Object v26 = 1;
    Object v27 = 1;
    Object v28 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v24).intValue()),((java.lang.String)v25),(((java.lang.Integer)v26).intValue()),(((java.lang.Integer)v27).intValue()));
    Object v29 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v29));
    Object v31 = "EVAL_ERROR_TYPE";
    Object v32 = "?";
    Object v33 = 1;
    Object v34 = -35;
    Object v35 = new com.google.javascript.rhino.jstype.NamedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v30),((java.lang.String)v31),((java.lang.String)v32),(((java.lang.Integer)v33).intValue()),(((java.lang.Integer)v34).intValue()));
    Object v36 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v28),((com.google.javascript.rhino.jstype.ObjectType)v35));
    Object v37 = ((com.google.javascript.jscomp.TypedScopeCreator)v16).createScope(((com.google.javascript.rhino.Node)v21),((com.google.javascript.jscomp.Scope)v36));
    Object v38 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.Scope)v37));
    org.junit.Assert.assertNotNull(v38);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    ((com.google.javascript.jscomp.AbstractCompiler)v3).reportCodeChange();
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = 29;
    Object v7 = "default";
    Object v8 = 1;
    Object v9 = 1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = "L";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v16 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.CodingConvention)v15));
    Object v17 = 29;
    Object v18 = "default";
    Object v19 = 1;
    Object v20 = 1;
    Object v21 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v17).intValue()),((java.lang.String)v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
    Object v22 = 29;
    Object v23 = "default";
    Object v24 = 1;
    Object v25 = 1;
    Object v26 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v22).intValue()),((java.lang.String)v23),(((java.lang.Integer)v24).intValue()),(((java.lang.Integer)v25).intValue()));
    Object v27 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v27));
    Object v29 = "EVAL_ERROR_TYPE";
    Object v30 = "?";
    Object v31 = 1;
    Object v32 = -35;
    Object v33 = new com.google.javascript.rhino.jstype.NamedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v28),((java.lang.String)v29),((java.lang.String)v30),(((java.lang.Integer)v31).intValue()),(((java.lang.Integer)v32).intValue()));
    Object v34 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v26),((com.google.javascript.rhino.jstype.ObjectType)v33));
    Object v35 = "toString";
    Object v36 = ((com.google.javascript.jscomp.Scope)v34).getVar(((java.lang.String)v35));
    Object v37 = ((com.google.javascript.jscomp.TypedScopeCreator)v16).createScope(((com.google.javascript.rhino.Node)v21),((com.google.javascript.jscomp.Scope)v34));
    Object v38 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.Scope)v37));
    org.junit.Assert.assertNotNull(v38);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = 29;
    Object v6 = "default";
    Object v7 = 1;
    Object v8 = 1;
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v5).intValue()),((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = "L";
    Object v11 = java.nio.charset.Charset.defaultCharset();
    Object v12 = new java.io.PrintStream(((java.lang.String)v10),((java.nio.charset.Charset)v11));
    Object v13 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v12));
    Object v14 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v13));
    Object v15 = 29;
    Object v16 = "default";
    Object v17 = 1;
    Object v18 = 1;
    Object v19 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v15).intValue()),((java.lang.String)v16),(((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()));
    Object v20 = "L";
    Object v21 = java.nio.charset.Charset.defaultCharset();
    Object v22 = new java.io.PrintStream(((java.lang.String)v20),((java.nio.charset.Charset)v21));
    Object v23 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v22));
    Object v24 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v25 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v23),((com.google.javascript.jscomp.CodingConvention)v24));
    Object v26 = 29;
    Object v27 = "default";
    Object v28 = 1;
    Object v29 = 1;
    Object v30 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v26).intValue()),((java.lang.String)v27),(((java.lang.Integer)v28).intValue()),(((java.lang.Integer)v29).intValue()));
    Object v31 = ((com.google.javascript.jscomp.TypedScopeCreator)v25).createInitialScope(((com.google.javascript.rhino.Node)v30));
    Object v32 = ((com.google.javascript.jscomp.TypedScopeCreator)v14).createScope(((com.google.javascript.rhino.Node)v19),((com.google.javascript.jscomp.Scope)v31));
    Object v33 = ((com.google.javascript.jscomp.TypedScopeCreator)v4).createScope(((com.google.javascript.rhino.Node)v9),((com.google.javascript.jscomp.Scope)v32));
    org.junit.Assert.assertNotNull(v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getReverseAbstractInterpreter();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v7 = 29;
    Object v8 = "default";
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createInitialScope(((com.google.javascript.rhino.Node)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v5 = ((com.google.javascript.jscomp.CodingConvention)v4).getAbstractMethodName();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v4));
    Object v7 = 29;
    Object v8 = "default";
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = ((com.google.javascript.rhino.Node)v11).removeFirstChild();
    Object v13 = "L";
    Object v14 = java.nio.charset.Charset.defaultCharset();
    Object v15 = new java.io.PrintStream(((java.lang.String)v13),((java.nio.charset.Charset)v14));
    Object v16 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v15));
    Object v17 = ((com.google.javascript.jscomp.AbstractCompiler)v16).getReverseAbstractInterpreter();
    Object v18 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v19 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v16),((com.google.javascript.jscomp.CodingConvention)v18));
    Object v20 = 29;
    Object v21 = "default";
    Object v22 = 1;
    Object v23 = 1;
    Object v24 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v20).intValue()),((java.lang.String)v21),(((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()));
    Object v25 = ((com.google.javascript.jscomp.TypedScopeCreator)v19).createInitialScope(((com.google.javascript.rhino.Node)v24));
    Object v26 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v11),((com.google.javascript.jscomp.Scope)v25));
    org.junit.Assert.assertNotNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v4));
    Object v6 = 29;
    Object v7 = "default";
    Object v8 = 1;
    Object v9 = 1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = 29;
    Object v12 = "default";
    Object v13 = 1;
    Object v14 = 1;
    Object v15 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v11).intValue()),((java.lang.String)v12),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v16));
    Object v18 = "EVAL_ERROR_TYPE";
    Object v19 = "?";
    Object v20 = 1;
    Object v21 = -35;
    Object v22 = new com.google.javascript.rhino.jstype.NamedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v17),((java.lang.String)v18),((java.lang.String)v19),(((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()));
    Object v23 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v15),((com.google.javascript.rhino.jstype.ObjectType)v22));
    Object v24 = "";
    Object v25 = ((com.google.javascript.jscomp.Scope)v23).getSlot(((java.lang.String)v24));
    Object v26 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.Scope)v23));
    org.junit.Assert.assertNotNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getReverseAbstractInterpreter();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v7 = 29;
    Object v8 = "default";
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = true;
    ((com.google.javascript.rhino.Node)v11).setIsSyntheticBlock((((java.lang.Boolean)v12).booleanValue()));
    Object v13 = null;
    Object v14 = 29;
    Object v15 = "default";
    Object v16 = 1;
    Object v17 = 1;
    Object v18 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v14).intValue()),((java.lang.String)v15),(((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()));
    Object v19 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v19));
    Object v21 = "EVAL_ERROR_TYPE";
    Object v22 = "?";
    Object v23 = 1;
    Object v24 = -35;
    Object v25 = new com.google.javascript.rhino.jstype.NamedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v20),((java.lang.String)v21),((java.lang.String)v22),(((java.lang.Integer)v23).intValue()),(((java.lang.Integer)v24).intValue()));
    Object v26 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v18),((com.google.javascript.rhino.jstype.ObjectType)v25));
    Object v27 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v11),((com.google.javascript.jscomp.Scope)v26));
    org.junit.Assert.assertNotNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = 29;
    Object v6 = "default";
    Object v7 = 1;
    Object v8 = 1;
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v5).intValue()),((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = "L";
    Object v11 = java.nio.charset.Charset.defaultCharset();
    Object v12 = new java.io.PrintStream(((java.lang.String)v10),((java.nio.charset.Charset)v11));
    Object v13 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v12));
    Object v14 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v15 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v13),((com.google.javascript.jscomp.CodingConvention)v14));
    Object v16 = 29;
    Object v17 = "default";
    Object v18 = 1;
    Object v19 = 1;
    Object v20 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v16).intValue()),((java.lang.String)v17),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()));
    Object v21 = false;
    ((com.google.javascript.rhino.Node)v20).setOptionalArg((((java.lang.Boolean)v21).booleanValue()));
    Object v22 = null;
    Object v23 = 29;
    Object v24 = "default";
    Object v25 = 1;
    Object v26 = 1;
    Object v27 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v23).intValue()),((java.lang.String)v24),(((java.lang.Integer)v25).intValue()),(((java.lang.Integer)v26).intValue()));
    Object v28 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v29 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v28));
    Object v30 = "EVAL_ERROR_TYPE";
    Object v31 = "?";
    Object v32 = 1;
    Object v33 = -35;
    Object v34 = new com.google.javascript.rhino.jstype.NamedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v29),((java.lang.String)v30),((java.lang.String)v31),(((java.lang.Integer)v32).intValue()),(((java.lang.Integer)v33).intValue()));
    Object v35 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v27),((com.google.javascript.rhino.jstype.ObjectType)v34));
    Object v36 = ((com.google.javascript.jscomp.TypedScopeCreator)v15).createScope(((com.google.javascript.rhino.Node)v20),((com.google.javascript.jscomp.Scope)v35));
    Object v37 = ((com.google.javascript.jscomp.TypedScopeCreator)v4).createScope(((com.google.javascript.rhino.Node)v9),((com.google.javascript.jscomp.Scope)v36));
    org.junit.Assert.assertNotNull(v37);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    ((com.google.javascript.jscomp.AbstractCompiler)v3).reportCodeChange();
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = 29;
    Object v7 = "default";
    Object v8 = 1;
    Object v9 = 1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = "L";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v16 = ((com.google.javascript.jscomp.CodingConvention)v15).getAbstractMethodName();
    Object v17 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.CodingConvention)v15));
    Object v18 = 29;
    Object v19 = "default";
    Object v20 = 1;
    Object v21 = 1;
    Object v22 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v18).intValue()),((java.lang.String)v19),(((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()));
    Object v23 = ((com.google.javascript.jscomp.TypedScopeCreator)v17).createInitialScope(((com.google.javascript.rhino.Node)v22));
    Object v24 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.Scope)v23));
    org.junit.Assert.assertNotNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v4));
    Object v6 = 29;
    Object v7 = "default";
    Object v8 = 1;
    Object v9 = 1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = 29;
    Object v12 = "default";
    Object v13 = 1;
    Object v14 = 1;
    Object v15 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v11).intValue()),((java.lang.String)v12),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v16));
    Object v18 = "EVAL_ERROR_TYPE";
    Object v19 = "?";
    Object v20 = 1;
    Object v21 = -35;
    Object v22 = new com.google.javascript.rhino.jstype.NamedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v17),((java.lang.String)v18),((java.lang.String)v19),(((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()));
    Object v23 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v15),((com.google.javascript.rhino.jstype.ObjectType)v22));
    Object v24 = "";
    Object v25 = ((com.google.javascript.jscomp.Scope)v23).getOwnSlot(((java.lang.String)v24));
    Object v26 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.Scope)v23));
    org.junit.Assert.assertNotNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = 29;
    Object v6 = "default";
    Object v7 = 1;
    Object v8 = 1;
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v5).intValue()),((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = ((com.google.javascript.jscomp.TypedScopeCreator)v4).createInitialScope(((com.google.javascript.rhino.Node)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "1";
    Object v5 = -9;
    Object v6 = ((com.google.javascript.jscomp.SourceExcerptProvider)v3).getSourceLine(((java.lang.String)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v8 = 29;
    Object v9 = "default";
    Object v10 = 1;
    Object v11 = 1;
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v8).intValue()),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = 29;
    Object v14 = "default";
    Object v15 = 1;
    Object v16 = 1;
    Object v17 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v13).intValue()),((java.lang.String)v14),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = ((com.google.javascript.jscomp.CodingConvention)v7).extractClassNameIfProvide(((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v17));
    Object v19 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v7));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    ((com.google.javascript.jscomp.AbstractCompiler)v3).reportCodeChange();
    Object v4 = null;
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = 29;
    Object v7 = "default";
    Object v8 = 1;
    Object v9 = 1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createInitialScope(((com.google.javascript.rhino.Node)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v5 = 29;
    Object v6 = "default";
    Object v7 = 1;
    Object v8 = 1;
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v5).intValue()),((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = "L";
    Object v11 = java.nio.charset.Charset.defaultCharset();
    Object v12 = new java.io.PrintStream(((java.lang.String)v10),((java.nio.charset.Charset)v11));
    Object v13 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v12));
    Object v14 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v15 = ((com.google.javascript.jscomp.CodingConvention)v14).getAbstractMethodName();
    Object v16 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v13),((com.google.javascript.jscomp.CodingConvention)v14));
    Object v17 = 29;
    Object v18 = "default";
    Object v19 = 1;
    Object v20 = 1;
    Object v21 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v17).intValue()),((java.lang.String)v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
    Object v22 = 29;
    Object v23 = "default";
    Object v24 = 1;
    Object v25 = 1;
    Object v26 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v22).intValue()),((java.lang.String)v23),(((java.lang.Integer)v24).intValue()),(((java.lang.Integer)v25).intValue()));
    Object v27 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v27));
    Object v29 = "EVAL_ERROR_TYPE";
    Object v30 = "?";
    Object v31 = 1;
    Object v32 = -35;
    Object v33 = new com.google.javascript.rhino.jstype.NamedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v28),((java.lang.String)v29),((java.lang.String)v30),(((java.lang.Integer)v31).intValue()),(((java.lang.Integer)v32).intValue()));
    Object v34 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v26),((com.google.javascript.rhino.jstype.ObjectType)v33));
    Object v35 = ((com.google.javascript.jscomp.TypedScopeCreator)v16).createScope(((com.google.javascript.rhino.Node)v21),((com.google.javascript.jscomp.Scope)v34));
    Object v36 = ((com.google.javascript.jscomp.TypedScopeCreator)v4).createScope(((com.google.javascript.rhino.Node)v9),((com.google.javascript.jscomp.Scope)v35));
    org.junit.Assert.assertNotNull(v36);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v5 = 29;
    Object v6 = "default";
    Object v7 = 1;
    Object v8 = 1;
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v5).intValue()),((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = ((com.google.javascript.jscomp.CodingConvention)v4).identifyTypeDefAssign(((com.google.javascript.rhino.Node)v9));
    Object v11 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v4));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v4));
    Object v6 = 29;
    Object v7 = "default";
    Object v8 = 1;
    Object v9 = 1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = -9;
    ((com.google.javascript.rhino.Node)v10).removeProp((((java.lang.Integer)v11).intValue()));
    Object v12 = null;
    Object v13 = "L";
    Object v14 = java.nio.charset.Charset.defaultCharset();
    Object v15 = new java.io.PrintStream(((java.lang.String)v13),((java.nio.charset.Charset)v14));
    Object v16 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v15));
    Object v17 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v18 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v16),((com.google.javascript.jscomp.CodingConvention)v17));
    Object v19 = 29;
    Object v20 = "default";
    Object v21 = 1;
    Object v22 = 1;
    Object v23 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v19).intValue()),((java.lang.String)v20),(((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()));
    Object v24 = ((com.google.javascript.jscomp.TypedScopeCreator)v18).createInitialScope(((com.google.javascript.rhino.Node)v23));
    Object v25 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.Scope)v24));
    org.junit.Assert.assertNotNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v5 = ((com.google.javascript.jscomp.CodingConvention)v4).getAbstractMethodName();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v4));
    Object v7 = 29;
    Object v8 = "default";
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = "L";
    Object v13 = java.nio.charset.Charset.defaultCharset();
    Object v14 = new java.io.PrintStream(((java.lang.String)v12),((java.nio.charset.Charset)v13));
    Object v15 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v14));
    Object v16 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v15));
    Object v17 = 29;
    Object v18 = "default";
    Object v19 = 1;
    Object v20 = 1;
    Object v21 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v17).intValue()),((java.lang.String)v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
    Object v22 = ((com.google.javascript.jscomp.TypedScopeCreator)v16).createInitialScope(((com.google.javascript.rhino.Node)v21));
    Object v23 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v11),((com.google.javascript.jscomp.Scope)v22));
    org.junit.Assert.assertNotNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = 29;
    Object v7 = "default";
    Object v8 = 1;
    Object v9 = 1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = "L";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v16 = ((com.google.javascript.jscomp.CodingConvention)v15).getAbstractMethodName();
    Object v17 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.CodingConvention)v15));
    Object v18 = 29;
    Object v19 = "default";
    Object v20 = 1;
    Object v21 = 1;
    Object v22 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v18).intValue()),((java.lang.String)v19),(((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()));
    Object v23 = 29;
    Object v24 = "default";
    Object v25 = 1;
    Object v26 = 1;
    Object v27 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v23).intValue()),((java.lang.String)v24),(((java.lang.Integer)v25).intValue()),(((java.lang.Integer)v26).intValue()));
    Object v28 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v29 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v28));
    Object v30 = "EVAL_ERROR_TYPE";
    Object v31 = "?";
    Object v32 = 1;
    Object v33 = -35;
    Object v34 = new com.google.javascript.rhino.jstype.NamedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v29),((java.lang.String)v30),((java.lang.String)v31),(((java.lang.Integer)v32).intValue()),(((java.lang.Integer)v33).intValue()));
    Object v35 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v27),((com.google.javascript.rhino.jstype.ObjectType)v34));
    Object v36 = ((com.google.javascript.jscomp.TypedScopeCreator)v17).createScope(((com.google.javascript.rhino.Node)v22),((com.google.javascript.jscomp.Scope)v35));
    Object v37 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.Scope)v36));
    org.junit.Assert.assertNotNull(v37);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = 29;
    Object v7 = "default";
    Object v8 = 1;
    Object v9 = 1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = "L";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = ((com.google.javascript.jscomp.AbstractCompiler)v14).getReverseAbstractInterpreter();
    Object v16 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v17 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.CodingConvention)v16));
    Object v18 = 29;
    Object v19 = "default";
    Object v20 = 1;
    Object v21 = 1;
    Object v22 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v18).intValue()),((java.lang.String)v19),(((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()));
    Object v23 = true;
    ((com.google.javascript.rhino.Node)v22).setIsSyntheticBlock((((java.lang.Boolean)v23).booleanValue()));
    Object v24 = null;
    Object v25 = 29;
    Object v26 = "default";
    Object v27 = 1;
    Object v28 = 1;
    Object v29 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v25).intValue()),((java.lang.String)v26),(((java.lang.Integer)v27).intValue()),(((java.lang.Integer)v28).intValue()));
    Object v30 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v31 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v30));
    Object v32 = "EVAL_ERROR_TYPE";
    Object v33 = "?";
    Object v34 = 1;
    Object v35 = -35;
    Object v36 = new com.google.javascript.rhino.jstype.NamedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v31),((java.lang.String)v32),((java.lang.String)v33),(((java.lang.Integer)v34).intValue()),(((java.lang.Integer)v35).intValue()));
    Object v37 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v29),((com.google.javascript.rhino.jstype.ObjectType)v36));
    Object v38 = ((com.google.javascript.jscomp.TypedScopeCreator)v17).createScope(((com.google.javascript.rhino.Node)v22),((com.google.javascript.jscomp.Scope)v37));
    Object v39 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.Scope)v38));
    org.junit.Assert.assertNotNull(v39);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = 29;
    Object v7 = "default";
    Object v8 = 1;
    Object v9 = 1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = "L";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v14));
    Object v16 = 29;
    Object v17 = "default";
    Object v18 = 1;
    Object v19 = 1;
    Object v20 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v16).intValue()),((java.lang.String)v17),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()));
    Object v21 = ((com.google.javascript.jscomp.TypedScopeCreator)v15).createInitialScope(((com.google.javascript.rhino.Node)v20));
    Object v22 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.Scope)v21));
    org.junit.Assert.assertNotNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "1";
    Object v5 = -9;
    Object v6 = ((com.google.javascript.jscomp.SourceExcerptProvider)v3).getSourceLine(((java.lang.String)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v8 = 29;
    Object v9 = "default";
    Object v10 = 1;
    Object v11 = 1;
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v8).intValue()),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = 29;
    Object v14 = "default";
    Object v15 = 1;
    Object v16 = 1;
    Object v17 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v13).intValue()),((java.lang.String)v14),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = ((com.google.javascript.jscomp.CodingConvention)v7).extractClassNameIfProvide(((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v17));
    Object v19 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v7));
    Object v20 = 29;
    Object v21 = "default";
    Object v22 = 1;
    Object v23 = 1;
    Object v24 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v20).intValue()),((java.lang.String)v21),(((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()));
    Object v25 = ((com.google.javascript.jscomp.TypedScopeCreator)v19).createInitialScope(((com.google.javascript.rhino.Node)v24));
    org.junit.Assert.assertNotNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "1";
    Object v5 = -9;
    Object v6 = ((com.google.javascript.jscomp.SourceExcerptProvider)v3).getSourceLine(((java.lang.String)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v8 = 29;
    Object v9 = "default";
    Object v10 = 1;
    Object v11 = 1;
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v8).intValue()),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = 29;
    Object v14 = "default";
    Object v15 = 1;
    Object v16 = 1;
    Object v17 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v13).intValue()),((java.lang.String)v14),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = ((com.google.javascript.jscomp.CodingConvention)v7).extractClassNameIfProvide(((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v17));
    Object v19 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v7));
    Object v20 = 29;
    Object v21 = "default";
    Object v22 = 1;
    Object v23 = 1;
    Object v24 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v20).intValue()),((java.lang.String)v21),(((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()));
    Object v25 = "L";
    Object v26 = java.nio.charset.Charset.defaultCharset();
    Object v27 = new java.io.PrintStream(((java.lang.String)v25),((java.nio.charset.Charset)v26));
    Object v28 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v27));
    Object v29 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v28));
    Object v30 = 29;
    Object v31 = "default";
    Object v32 = 1;
    Object v33 = 1;
    Object v34 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v30).intValue()),((java.lang.String)v31),(((java.lang.Integer)v32).intValue()),(((java.lang.Integer)v33).intValue()));
    Object v35 = ((com.google.javascript.jscomp.TypedScopeCreator)v29).createInitialScope(((com.google.javascript.rhino.Node)v34));
    Object v36 = ((com.google.javascript.jscomp.TypedScopeCreator)v19).createScope(((com.google.javascript.rhino.Node)v24),((com.google.javascript.jscomp.Scope)v35));
    org.junit.Assert.assertNotNull(v36);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = 29;
    Object v7 = "default";
    Object v8 = 1;
    Object v9 = 1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = "L";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v16 = ((com.google.javascript.jscomp.CodingConvention)v15).getAbstractMethodName();
    Object v17 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.CodingConvention)v15));
    Object v18 = 29;
    Object v19 = "default";
    Object v20 = 1;
    Object v21 = 1;
    Object v22 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v18).intValue()),((java.lang.String)v19),(((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()));
    Object v23 = ((com.google.javascript.jscomp.TypedScopeCreator)v17).createInitialScope(((com.google.javascript.rhino.Node)v22));
    Object v24 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.Scope)v23));
    org.junit.Assert.assertNotNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = 29;
    Object v7 = "default";
    Object v8 = 1;
    Object v9 = 1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = 29;
    Object v12 = "default";
    Object v13 = 1;
    Object v14 = 1;
    Object v15 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v11).intValue()),((java.lang.String)v12),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v16));
    Object v18 = "EVAL_ERROR_TYPE";
    Object v19 = "?";
    Object v20 = 1;
    Object v21 = -35;
    Object v22 = new com.google.javascript.rhino.jstype.NamedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v17),((java.lang.String)v18),((java.lang.String)v19),(((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()));
    Object v23 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v15),((com.google.javascript.rhino.jstype.ObjectType)v22));
    Object v24 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.Scope)v23));
    org.junit.Assert.assertNotNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v4));
    Object v6 = 29;
    Object v7 = "default";
    Object v8 = 1;
    Object v9 = 1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = "L";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v16 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.CodingConvention)v15));
    Object v17 = 29;
    Object v18 = "default";
    Object v19 = 1;
    Object v20 = 1;
    Object v21 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v17).intValue()),((java.lang.String)v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
    Object v22 = 29;
    Object v23 = "default";
    Object v24 = 1;
    Object v25 = 1;
    Object v26 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v22).intValue()),((java.lang.String)v23),(((java.lang.Integer)v24).intValue()),(((java.lang.Integer)v25).intValue()));
    Object v27 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v27));
    Object v29 = "EVAL_ERROR_TYPE";
    Object v30 = "?";
    Object v31 = 1;
    Object v32 = -35;
    Object v33 = new com.google.javascript.rhino.jstype.NamedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v28),((java.lang.String)v29),((java.lang.String)v30),(((java.lang.Integer)v31).intValue()),(((java.lang.Integer)v32).intValue()));
    Object v34 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v26),((com.google.javascript.rhino.jstype.ObjectType)v33));
    Object v35 = ((com.google.javascript.jscomp.TypedScopeCreator)v16).createScope(((com.google.javascript.rhino.Node)v21),((com.google.javascript.jscomp.Scope)v34));
    Object v36 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.Scope)v35));
    org.junit.Assert.assertNotNull(v36);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "1";
    Object v5 = -9;
    Object v6 = ((com.google.javascript.jscomp.SourceExcerptProvider)v3).getSourceLine(((java.lang.String)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v8 = 29;
    Object v9 = "default";
    Object v10 = 1;
    Object v11 = 1;
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v8).intValue()),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = 29;
    Object v14 = "default";
    Object v15 = 1;
    Object v16 = 1;
    Object v17 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v13).intValue()),((java.lang.String)v14),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = ((com.google.javascript.jscomp.CodingConvention)v7).extractClassNameIfProvide(((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v17));
    Object v19 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v7));
    Object v20 = 29;
    Object v21 = "default";
    Object v22 = 1;
    Object v23 = 1;
    Object v24 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v20).intValue()),((java.lang.String)v21),(((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()));
    Object v25 = 29;
    Object v26 = "default";
    Object v27 = 1;
    Object v28 = 1;
    Object v29 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v25).intValue()),((java.lang.String)v26),(((java.lang.Integer)v27).intValue()),(((java.lang.Integer)v28).intValue()));
    Object v30 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v31 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v30));
    Object v32 = "EVAL_ERROR_TYPE";
    Object v33 = "?";
    Object v34 = 1;
    Object v35 = -35;
    Object v36 = new com.google.javascript.rhino.jstype.NamedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v31),((java.lang.String)v32),((java.lang.String)v33),(((java.lang.Integer)v34).intValue()),(((java.lang.Integer)v35).intValue()));
    Object v37 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v29),((com.google.javascript.rhino.jstype.ObjectType)v36));
    Object v38 = ((com.google.javascript.jscomp.TypedScopeCreator)v19).createScope(((com.google.javascript.rhino.Node)v24),((com.google.javascript.jscomp.Scope)v37));
    org.junit.Assert.assertNotNull(v38);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v5 = 29;
    Object v6 = "default";
    Object v7 = 1;
    Object v8 = 1;
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v5).intValue()),((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = ((com.google.javascript.jscomp.CodingConvention)v4).identifyTypeDefAssign(((com.google.javascript.rhino.Node)v9));
    Object v11 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v4));
    Object v12 = 29;
    Object v13 = "default";
    Object v14 = 1;
    Object v15 = 1;
    Object v16 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v12).intValue()),((java.lang.String)v13),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = ((com.google.javascript.jscomp.TypedScopeCreator)v11).createInitialScope(((com.google.javascript.rhino.Node)v16));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getReverseAbstractInterpreter();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v7 = 29;
    Object v8 = "default";
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = "L";
    Object v13 = java.nio.charset.Charset.defaultCharset();
    Object v14 = new java.io.PrintStream(((java.lang.String)v12),((java.nio.charset.Charset)v13));
    Object v15 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v14));
    ((com.google.javascript.jscomp.AbstractCompiler)v15).reportCodeChange();
    Object v16 = null;
    Object v17 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v15));
    Object v18 = 29;
    Object v19 = "default";
    Object v20 = 1;
    Object v21 = 1;
    Object v22 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v18).intValue()),((java.lang.String)v19),(((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()));
    Object v23 = 29;
    Object v24 = "default";
    Object v25 = 1;
    Object v26 = 1;
    Object v27 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v23).intValue()),((java.lang.String)v24),(((java.lang.Integer)v25).intValue()),(((java.lang.Integer)v26).intValue()));
    Object v28 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v29 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v28));
    Object v30 = "EVAL_ERROR_TYPE";
    Object v31 = "?";
    Object v32 = 1;
    Object v33 = -35;
    Object v34 = new com.google.javascript.rhino.jstype.NamedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v29),((java.lang.String)v30),((java.lang.String)v31),(((java.lang.Integer)v32).intValue()),(((java.lang.Integer)v33).intValue()));
    Object v35 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v27),((com.google.javascript.rhino.jstype.ObjectType)v34));
    Object v36 = "L";
    Object v37 = ((com.google.javascript.jscomp.Scope)v35).getOwnSlot(((java.lang.String)v36));
    Object v38 = ((com.google.javascript.jscomp.TypedScopeCreator)v17).createScope(((com.google.javascript.rhino.Node)v22),((com.google.javascript.jscomp.Scope)v35));
    Object v39 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v11),((com.google.javascript.jscomp.Scope)v38));
    org.junit.Assert.assertNotNull(v39);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = 29;
    Object v7 = "default";
    Object v8 = 1;
    Object v9 = 1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = "L";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = ((com.google.javascript.jscomp.AbstractCompiler)v14).getReverseAbstractInterpreter();
    Object v16 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v17 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.CodingConvention)v16));
    Object v18 = 29;
    Object v19 = "default";
    Object v20 = 1;
    Object v21 = 1;
    Object v22 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v18).intValue()),((java.lang.String)v19),(((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()));
    Object v23 = ((com.google.javascript.jscomp.TypedScopeCreator)v17).createInitialScope(((com.google.javascript.rhino.Node)v22));
    Object v24 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.Scope)v23));
    org.junit.Assert.assertNotNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getReverseAbstractInterpreter();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v7 = 29;
    Object v8 = "default";
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = "L";
    Object v13 = java.nio.charset.Charset.defaultCharset();
    Object v14 = new java.io.PrintStream(((java.lang.String)v12),((java.nio.charset.Charset)v13));
    Object v15 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v14));
    Object v16 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v17 = 29;
    Object v18 = "default";
    Object v19 = 1;
    Object v20 = 1;
    Object v21 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v17).intValue()),((java.lang.String)v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
    Object v22 = ((com.google.javascript.jscomp.CodingConvention)v16).identifyTypeDefAssign(((com.google.javascript.rhino.Node)v21));
    Object v23 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v15),((com.google.javascript.jscomp.CodingConvention)v16));
    Object v24 = 29;
    Object v25 = "default";
    Object v26 = 1;
    Object v27 = 1;
    Object v28 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v24).intValue()),((java.lang.String)v25),(((java.lang.Integer)v26).intValue()),(((java.lang.Integer)v27).intValue()));
    Object v29 = ((com.google.javascript.jscomp.TypedScopeCreator)v23).createInitialScope(((com.google.javascript.rhino.Node)v28));
    Object v30 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v11),((com.google.javascript.jscomp.Scope)v29));
    org.junit.Assert.assertNotNull(v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = 29;
    Object v7 = "default";
    Object v8 = 1;
    Object v9 = 1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createInitialScope(((com.google.javascript.rhino.Node)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v5 = ((com.google.javascript.jscomp.CodingConvention)v4).getAbstractMethodName();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v4));
    Object v7 = 29;
    Object v8 = "default";
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = 29;
    Object v13 = "default";
    Object v14 = 1;
    Object v15 = 1;
    Object v16 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v12).intValue()),((java.lang.String)v13),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v17));
    Object v19 = "EVAL_ERROR_TYPE";
    Object v20 = "?";
    Object v21 = 1;
    Object v22 = -35;
    Object v23 = new com.google.javascript.rhino.jstype.NamedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v18),((java.lang.String)v19),((java.lang.String)v20),(((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()));
    Object v24 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v16),((com.google.javascript.rhino.jstype.ObjectType)v23));
    Object v25 = "nul";
    Object v26 = ((com.google.javascript.jscomp.Scope)v24).getVar(((java.lang.String)v25));
    Object v27 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v11),((com.google.javascript.jscomp.Scope)v24));
    org.junit.Assert.assertNotNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = 29;
    Object v7 = "default";
    Object v8 = 1;
    Object v9 = 1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = "L";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = ((com.google.javascript.jscomp.AbstractCompiler)v14).getErrorManager();
    Object v16 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v14));
    Object v17 = 29;
    Object v18 = "default";
    Object v19 = 1;
    Object v20 = 1;
    Object v21 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v17).intValue()),((java.lang.String)v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
    Object v22 = "L";
    Object v23 = java.nio.charset.Charset.defaultCharset();
    Object v24 = new java.io.PrintStream(((java.lang.String)v22),((java.nio.charset.Charset)v23));
    Object v25 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v24));
    Object v26 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v27 = ((com.google.javascript.jscomp.CodingConvention)v26).getAbstractMethodName();
    Object v28 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v25),((com.google.javascript.jscomp.CodingConvention)v26));
    Object v29 = 29;
    Object v30 = "default";
    Object v31 = 1;
    Object v32 = 1;
    Object v33 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v29).intValue()),((java.lang.String)v30),(((java.lang.Integer)v31).intValue()),(((java.lang.Integer)v32).intValue()));
    Object v34 = ((com.google.javascript.jscomp.TypedScopeCreator)v28).createInitialScope(((com.google.javascript.rhino.Node)v33));
    Object v35 = ((com.google.javascript.jscomp.TypedScopeCreator)v16).createScope(((com.google.javascript.rhino.Node)v21),((com.google.javascript.jscomp.Scope)v34));
    Object v36 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.Scope)v35));
    org.junit.Assert.assertNotNull(v36);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "1";
    Object v5 = -9;
    Object v6 = ((com.google.javascript.jscomp.SourceExcerptProvider)v3).getSourceLine(((java.lang.String)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v8 = 29;
    Object v9 = "default";
    Object v10 = 1;
    Object v11 = 1;
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v8).intValue()),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = 29;
    Object v14 = "default";
    Object v15 = 1;
    Object v16 = 1;
    Object v17 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v13).intValue()),((java.lang.String)v14),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = ((com.google.javascript.jscomp.CodingConvention)v7).extractClassNameIfProvide(((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v17));
    Object v19 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v7));
    Object v20 = 29;
    Object v21 = "default";
    Object v22 = 1;
    Object v23 = 1;
    Object v24 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v20).intValue()),((java.lang.String)v21),(((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()));
    Object v25 = 0;
    Object v26 = 0;
    ((com.google.javascript.rhino.Node)v24).putIntProp((((java.lang.Integer)v25).intValue()),(((java.lang.Integer)v26).intValue()));
    Object v27 = null;
    Object v28 = "L";
    Object v29 = java.nio.charset.Charset.defaultCharset();
    Object v30 = new java.io.PrintStream(((java.lang.String)v28),((java.nio.charset.Charset)v29));
    Object v31 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v30));
    Object v32 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v31));
    Object v33 = 29;
    Object v34 = "default";
    Object v35 = 1;
    Object v36 = 1;
    Object v37 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v33).intValue()),((java.lang.String)v34),(((java.lang.Integer)v35).intValue()),(((java.lang.Integer)v36).intValue()));
    Object v38 = ((com.google.javascript.jscomp.TypedScopeCreator)v32).createInitialScope(((com.google.javascript.rhino.Node)v37));
    Object v39 = ((com.google.javascript.jscomp.TypedScopeCreator)v19).createScope(((com.google.javascript.rhino.Node)v24),((com.google.javascript.jscomp.Scope)v38));
    org.junit.Assert.assertNotNull(v39);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v4));
    Object v6 = 29;
    Object v7 = "default";
    Object v8 = 1;
    Object v9 = 1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = 29;
    Object v12 = "default";
    Object v13 = 1;
    Object v14 = 1;
    Object v15 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v11).intValue()),((java.lang.String)v12),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    ((com.google.javascript.rhino.Node)v10).copyInformationFrom(((com.google.javascript.rhino.Node)v15));
    Object v16 = null;
    Object v17 = "L";
    Object v18 = java.nio.charset.Charset.defaultCharset();
    Object v19 = new java.io.PrintStream(((java.lang.String)v17),((java.nio.charset.Charset)v18));
    Object v20 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v19));
    Object v21 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v20));
    Object v22 = 29;
    Object v23 = "default";
    Object v24 = 1;
    Object v25 = 1;
    Object v26 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v22).intValue()),((java.lang.String)v23),(((java.lang.Integer)v24).intValue()),(((java.lang.Integer)v25).intValue()));
    Object v27 = ((com.google.javascript.jscomp.TypedScopeCreator)v21).createInitialScope(((com.google.javascript.rhino.Node)v26));
    Object v28 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.Scope)v27));
    org.junit.Assert.assertNotNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = 29;
    Object v7 = "default";
    Object v8 = 1;
    Object v9 = 1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = "L";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = ((com.google.javascript.jscomp.AbstractCompiler)v14).getReverseAbstractInterpreter();
    Object v16 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v17 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.CodingConvention)v16));
    Object v18 = 29;
    Object v19 = "default";
    Object v20 = 1;
    Object v21 = 1;
    Object v22 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v18).intValue()),((java.lang.String)v19),(((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()));
    Object v23 = 29;
    Object v24 = "default";
    Object v25 = 1;
    Object v26 = 1;
    Object v27 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v23).intValue()),((java.lang.String)v24),(((java.lang.Integer)v25).intValue()),(((java.lang.Integer)v26).intValue()));
    Object v28 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v29 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v28));
    Object v30 = "EVAL_ERROR_TYPE";
    Object v31 = "?";
    Object v32 = 1;
    Object v33 = -35;
    Object v34 = new com.google.javascript.rhino.jstype.NamedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v29),((java.lang.String)v30),((java.lang.String)v31),(((java.lang.Integer)v32).intValue()),(((java.lang.Integer)v33).intValue()));
    Object v35 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v27),((com.google.javascript.rhino.jstype.ObjectType)v34));
    Object v36 = ((com.google.javascript.jscomp.TypedScopeCreator)v17).createScope(((com.google.javascript.rhino.Node)v22),((com.google.javascript.jscomp.Scope)v35));
    Object v37 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.Scope)v36));
    org.junit.Assert.assertNotNull(v37);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v5 = 29;
    Object v6 = "default";
    Object v7 = 1;
    Object v8 = 1;
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v5).intValue()),((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = ((com.google.javascript.jscomp.CodingConvention)v4).identifyTypeDefAssign(((com.google.javascript.rhino.Node)v9));
    Object v11 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v4));
    Object v12 = 29;
    Object v13 = "default";
    Object v14 = 1;
    Object v15 = 1;
    Object v16 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v12).intValue()),((java.lang.String)v13),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = 29;
    Object v18 = "default";
    Object v19 = 1;
    Object v20 = 1;
    Object v21 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v17).intValue()),((java.lang.String)v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
    Object v22 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v22));
    Object v24 = "EVAL_ERROR_TYPE";
    Object v25 = "?";
    Object v26 = 1;
    Object v27 = -35;
    Object v28 = new com.google.javascript.rhino.jstype.NamedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v23),((java.lang.String)v24),((java.lang.String)v25),(((java.lang.Integer)v26).intValue()),(((java.lang.Integer)v27).intValue()));
    Object v29 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v21),((com.google.javascript.rhino.jstype.ObjectType)v28));
    Object v30 = ((com.google.javascript.jscomp.TypedScopeCreator)v11).createScope(((com.google.javascript.rhino.Node)v16),((com.google.javascript.jscomp.Scope)v29));
    org.junit.Assert.assertNotNull(v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getTypeRegistry();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v5 = "^";
    Object v6 = ((com.google.javascript.jscomp.CodingConvention)v4).isExported(((java.lang.String)v5));
    Object v7 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v4));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getTypeRegistry();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = 29;
    Object v7 = "default";
    Object v8 = 1;
    Object v9 = 1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = "L";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v14));
    Object v16 = 29;
    Object v17 = "default";
    Object v18 = 1;
    Object v19 = 1;
    Object v20 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v16).intValue()),((java.lang.String)v17),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()));
    Object v21 = ((com.google.javascript.jscomp.TypedScopeCreator)v15).createInitialScope(((com.google.javascript.rhino.Node)v20));
    Object v22 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.Scope)v21));
    org.junit.Assert.assertNotNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "prototype";
    Object v5 = 0;
    Object v6 = ((com.google.javascript.jscomp.SourceExcerptProvider)v3).getSourceRegion(((java.lang.String)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v8 = ((com.google.javascript.jscomp.CodingConvention)v7).getGlobalObject();
    Object v9 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v7));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getCodingConvention();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "prototype";
    Object v5 = 0;
    Object v6 = ((com.google.javascript.jscomp.SourceExcerptProvider)v3).getSourceRegion(((java.lang.String)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v8 = ((com.google.javascript.jscomp.CodingConvention)v7).getGlobalObject();
    Object v9 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v7));
    Object v10 = 29;
    Object v11 = "default";
    Object v12 = 1;
    Object v13 = 1;
    Object v14 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = "L";
    Object v16 = java.nio.charset.Charset.defaultCharset();
    Object v17 = new java.io.PrintStream(((java.lang.String)v15),((java.nio.charset.Charset)v16));
    Object v18 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v17));
    Object v19 = ((com.google.javascript.jscomp.AbstractCompiler)v18).getErrorManager();
    Object v20 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v18));
    Object v21 = 29;
    Object v22 = "default";
    Object v23 = 1;
    Object v24 = 1;
    Object v25 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v21).intValue()),((java.lang.String)v22),(((java.lang.Integer)v23).intValue()),(((java.lang.Integer)v24).intValue()));
    Object v26 = ((com.google.javascript.jscomp.TypedScopeCreator)v20).createInitialScope(((com.google.javascript.rhino.Node)v25));
    Object v27 = ((com.google.javascript.jscomp.TypedScopeCreator)v9).createScope(((com.google.javascript.rhino.Node)v14),((com.google.javascript.jscomp.Scope)v26));
    org.junit.Assert.assertNotNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v5 = ((com.google.javascript.jscomp.CodingConvention)v4).getExportSymbolFunction();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v4));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v5 = ((com.google.javascript.jscomp.CodingConvention)v4).getAbstractMethodName();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v4));
    Object v7 = 29;
    Object v8 = "default";
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = "L";
    Object v13 = java.nio.charset.Charset.defaultCharset();
    Object v14 = new java.io.PrintStream(((java.lang.String)v12),((java.nio.charset.Charset)v13));
    Object v15 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v14));
    Object v16 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v17 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v15),((com.google.javascript.jscomp.CodingConvention)v16));
    Object v18 = 29;
    Object v19 = "default";
    Object v20 = 1;
    Object v21 = 1;
    Object v22 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v18).intValue()),((java.lang.String)v19),(((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()));
    Object v23 = -35;
    ((com.google.javascript.rhino.Node)v22).removeProp((((java.lang.Integer)v23).intValue()));
    Object v24 = null;
    Object v25 = 29;
    Object v26 = "default";
    Object v27 = 1;
    Object v28 = 1;
    Object v29 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v25).intValue()),((java.lang.String)v26),(((java.lang.Integer)v27).intValue()),(((java.lang.Integer)v28).intValue()));
    Object v30 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v31 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v30));
    Object v32 = "EVAL_ERROR_TYPE";
    Object v33 = "?";
    Object v34 = 1;
    Object v35 = -35;
    Object v36 = new com.google.javascript.rhino.jstype.NamedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v31),((java.lang.String)v32),((java.lang.String)v33),(((java.lang.Integer)v34).intValue()),(((java.lang.Integer)v35).intValue()));
    Object v37 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v29),((com.google.javascript.rhino.jstype.ObjectType)v36));
    Object v38 = ((com.google.javascript.jscomp.TypedScopeCreator)v17).createScope(((com.google.javascript.rhino.Node)v22),((com.google.javascript.jscomp.Scope)v37));
    Object v39 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v11),((com.google.javascript.jscomp.Scope)v38));
    org.junit.Assert.assertNotNull(v39);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getCodingConvention();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v7 = 29;
    Object v8 = "default";
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createInitialScope(((com.google.javascript.rhino.Node)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getCodingConvention();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v7 = 29;
    Object v8 = "default";
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = "L";
    Object v13 = java.nio.charset.Charset.defaultCharset();
    Object v14 = new java.io.PrintStream(((java.lang.String)v12),((java.nio.charset.Charset)v13));
    Object v15 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v14));
    Object v16 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v17 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v15),((com.google.javascript.jscomp.CodingConvention)v16));
    Object v18 = 29;
    Object v19 = "default";
    Object v20 = 1;
    Object v21 = 1;
    Object v22 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v18).intValue()),((java.lang.String)v19),(((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()));
    Object v23 = false;
    ((com.google.javascript.rhino.Node)v22).setOptionalArg((((java.lang.Boolean)v23).booleanValue()));
    Object v24 = null;
    Object v25 = 29;
    Object v26 = "default";
    Object v27 = 1;
    Object v28 = 1;
    Object v29 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v25).intValue()),((java.lang.String)v26),(((java.lang.Integer)v27).intValue()),(((java.lang.Integer)v28).intValue()));
    Object v30 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v31 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v30));
    Object v32 = "EVAL_ERROR_TYPE";
    Object v33 = "?";
    Object v34 = 1;
    Object v35 = -35;
    Object v36 = new com.google.javascript.rhino.jstype.NamedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v31),((java.lang.String)v32),((java.lang.String)v33),(((java.lang.Integer)v34).intValue()),(((java.lang.Integer)v35).intValue()));
    Object v37 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v29),((com.google.javascript.rhino.jstype.ObjectType)v36));
    Object v38 = ((com.google.javascript.jscomp.TypedScopeCreator)v17).createScope(((com.google.javascript.rhino.Node)v22),((com.google.javascript.jscomp.Scope)v37));
    Object v39 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v11),((com.google.javascript.jscomp.Scope)v38));
    org.junit.Assert.assertNotNull(v39);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getCodingConvention();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v7 = 29;
    Object v8 = "default";
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = 29;
    Object v13 = "default";
    Object v14 = 1;
    Object v15 = 1;
    Object v16 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v12).intValue()),((java.lang.String)v13),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v17));
    Object v19 = "EVAL_ERROR_TYPE";
    Object v20 = "?";
    Object v21 = 1;
    Object v22 = -35;
    Object v23 = new com.google.javascript.rhino.jstype.NamedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v18),((java.lang.String)v19),((java.lang.String)v20),(((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()));
    Object v24 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v16),((com.google.javascript.rhino.jstype.ObjectType)v23));
    Object v25 = "operatorq {0} cannot be applied to {1}";
    Object v26 = ((com.google.javascript.jscomp.Scope)v24).getOwnSlot(((java.lang.String)v25));
    Object v27 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v11),((com.google.javascript.jscomp.Scope)v24));
    org.junit.Assert.assertNotNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getCodingConvention();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v7 = 29;
    Object v8 = "default";
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = "L";
    Object v13 = java.nio.charset.Charset.defaultCharset();
    Object v14 = new java.io.PrintStream(((java.lang.String)v12),((java.nio.charset.Charset)v13));
    Object v15 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v14));
    Object v16 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v17 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v15),((com.google.javascript.jscomp.CodingConvention)v16));
    Object v18 = 29;
    Object v19 = "default";
    Object v20 = 1;
    Object v21 = 1;
    Object v22 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v18).intValue()),((java.lang.String)v19),(((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()));
    Object v23 = ((com.google.javascript.jscomp.TypedScopeCreator)v17).createInitialScope(((com.google.javascript.rhino.Node)v22));
    Object v24 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v11),((com.google.javascript.jscomp.Scope)v23));
    org.junit.Assert.assertNotNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = "1";
    Object v5 = -9;
    Object v6 = ((com.google.javascript.jscomp.SourceExcerptProvider)v3).getSourceLine(((java.lang.String)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v8 = 29;
    Object v9 = "default";
    Object v10 = 1;
    Object v11 = 1;
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v8).intValue()),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = 29;
    Object v14 = "default";
    Object v15 = 1;
    Object v16 = 1;
    Object v17 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v13).intValue()),((java.lang.String)v14),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = ((com.google.javascript.jscomp.CodingConvention)v7).extractClassNameIfProvide(((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.Node)v17));
    Object v19 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v7));
    Object v20 = 29;
    Object v21 = "default";
    Object v22 = 1;
    Object v23 = 1;
    Object v24 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v20).intValue()),((java.lang.String)v21),(((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()));
    Object v25 = "L";
    Object v26 = java.nio.charset.Charset.defaultCharset();
    Object v27 = new java.io.PrintStream(((java.lang.String)v25),((java.nio.charset.Charset)v26));
    Object v28 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v27));
    Object v29 = ((com.google.javascript.jscomp.AbstractCompiler)v28).getReverseAbstractInterpreter();
    Object v30 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v31 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v28),((com.google.javascript.jscomp.CodingConvention)v30));
    Object v32 = 29;
    Object v33 = "default";
    Object v34 = 1;
    Object v35 = 1;
    Object v36 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v32).intValue()),((java.lang.String)v33),(((java.lang.Integer)v34).intValue()),(((java.lang.Integer)v35).intValue()));
    Object v37 = ((com.google.javascript.jscomp.TypedScopeCreator)v31).createInitialScope(((com.google.javascript.rhino.Node)v36));
    Object v38 = ((com.google.javascript.jscomp.TypedScopeCreator)v19).createScope(((com.google.javascript.rhino.Node)v24),((com.google.javascript.jscomp.Scope)v37));
    org.junit.Assert.assertNotNull(v38);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v4));
    Object v6 = 29;
    Object v7 = "default";
    Object v8 = 1;
    Object v9 = 1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = "L";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = ((com.google.javascript.jscomp.AbstractCompiler)v14).getCodingConvention();
    Object v16 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v17 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.CodingConvention)v16));
    Object v18 = 29;
    Object v19 = "default";
    Object v20 = 1;
    Object v21 = 1;
    Object v22 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v18).intValue()),((java.lang.String)v19),(((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()));
    Object v23 = ((com.google.javascript.jscomp.TypedScopeCreator)v17).createInitialScope(((com.google.javascript.rhino.Node)v22));
    Object v24 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.Scope)v23));
    org.junit.Assert.assertNotNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v5 = ((com.google.javascript.jscomp.CodingConvention)v4).getExportSymbolFunction();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v4));
    Object v7 = 29;
    Object v8 = "default";
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = "L";
    Object v13 = java.nio.charset.Charset.defaultCharset();
    Object v14 = new java.io.PrintStream(((java.lang.String)v12),((java.nio.charset.Charset)v13));
    Object v15 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v14));
    Object v16 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v17 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v15),((com.google.javascript.jscomp.CodingConvention)v16));
    Object v18 = 29;
    Object v19 = "default";
    Object v20 = 1;
    Object v21 = 1;
    Object v22 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v18).intValue()),((java.lang.String)v19),(((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()));
    Object v23 = 29;
    Object v24 = "default";
    Object v25 = 1;
    Object v26 = 1;
    Object v27 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v23).intValue()),((java.lang.String)v24),(((java.lang.Integer)v25).intValue()),(((java.lang.Integer)v26).intValue()));
    Object v28 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v29 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v28));
    Object v30 = "EVAL_ERROR_TYPE";
    Object v31 = "?";
    Object v32 = 1;
    Object v33 = -35;
    Object v34 = new com.google.javascript.rhino.jstype.NamedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v29),((java.lang.String)v30),((java.lang.String)v31),(((java.lang.Integer)v32).intValue()),(((java.lang.Integer)v33).intValue()));
    Object v35 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v27),((com.google.javascript.rhino.jstype.ObjectType)v34));
    Object v36 = "toString";
    Object v37 = ((com.google.javascript.jscomp.Scope)v35).getVar(((java.lang.String)v36));
    Object v38 = ((com.google.javascript.jscomp.TypedScopeCreator)v17).createScope(((com.google.javascript.rhino.Node)v22),((com.google.javascript.jscomp.Scope)v35));
    Object v39 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v11),((com.google.javascript.jscomp.Scope)v38));
    org.junit.Assert.assertNotNull(v39);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v4));
    Object v6 = 29;
    Object v7 = "default";
    Object v8 = 1;
    Object v9 = 1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = false;
    ((com.google.javascript.rhino.Node)v10).setWasEmptyNode((((java.lang.Boolean)v11).booleanValue()));
    Object v12 = null;
    Object v13 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createInitialScope(((com.google.javascript.rhino.Node)v10));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getCodingConvention();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v7 = 29;
    Object v8 = "default";
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = 29;
    Object v13 = "default";
    Object v14 = 1;
    Object v15 = 1;
    Object v16 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v12).intValue()),((java.lang.String)v13),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    ((com.google.javascript.rhino.Node)v11).addChildrenToFront(((com.google.javascript.rhino.Node)v16));
    Object v17 = null;
    Object v18 = "L";
    Object v19 = java.nio.charset.Charset.defaultCharset();
    Object v20 = new java.io.PrintStream(((java.lang.String)v18),((java.nio.charset.Charset)v19));
    Object v21 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v20));
    Object v22 = ((com.google.javascript.jscomp.AbstractCompiler)v21).getReverseAbstractInterpreter();
    Object v23 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v24 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v21),((com.google.javascript.jscomp.CodingConvention)v23));
    Object v25 = 29;
    Object v26 = "default";
    Object v27 = 1;
    Object v28 = 1;
    Object v29 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v25).intValue()),((java.lang.String)v26),(((java.lang.Integer)v27).intValue()),(((java.lang.Integer)v28).intValue()));
    Object v30 = ((com.google.javascript.jscomp.TypedScopeCreator)v24).createInitialScope(((com.google.javascript.rhino.Node)v29));
    Object v31 = "(";
    Object v32 = false;
    Object v33 = ((com.google.javascript.jscomp.Scope)v30).isDeclared(((java.lang.String)v31),(((java.lang.Boolean)v32).booleanValue()));
    Object v34 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v11),((com.google.javascript.jscomp.Scope)v30));
    org.junit.Assert.assertNotNull(v34);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v4));
    Object v6 = 29;
    Object v7 = "default";
    Object v8 = 1;
    Object v9 = 1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = "L";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = ((com.google.javascript.jscomp.AbstractCompiler)v14).getErrorManager();
    Object v16 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v14));
    Object v17 = 29;
    Object v18 = "default";
    Object v19 = 1;
    Object v20 = 1;
    Object v21 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v17).intValue()),((java.lang.String)v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
    Object v22 = "L";
    Object v23 = java.nio.charset.Charset.defaultCharset();
    Object v24 = new java.io.PrintStream(((java.lang.String)v22),((java.nio.charset.Charset)v23));
    Object v25 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v24));
    Object v26 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v25));
    Object v27 = 29;
    Object v28 = "default";
    Object v29 = 1;
    Object v30 = 1;
    Object v31 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v27).intValue()),((java.lang.String)v28),(((java.lang.Integer)v29).intValue()),(((java.lang.Integer)v30).intValue()));
    Object v32 = ((com.google.javascript.jscomp.TypedScopeCreator)v26).createInitialScope(((com.google.javascript.rhino.Node)v31));
    Object v33 = ((com.google.javascript.jscomp.TypedScopeCreator)v16).createScope(((com.google.javascript.rhino.Node)v21),((com.google.javascript.jscomp.Scope)v32));
    Object v34 = ",";
    Object v35 = ((com.google.javascript.jscomp.Scope)v33).getOwnSlot(((java.lang.String)v34));
    Object v36 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.Scope)v33));
    org.junit.Assert.assertNotNull(v36);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getCodingConvention();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v7 = 29;
    Object v8 = "default";
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = 9;
    ((com.google.javascript.rhino.Node)v11).setType((((java.lang.Integer)v12).intValue()));
    Object v13 = null;
    Object v14 = "L";
    Object v15 = java.nio.charset.Charset.defaultCharset();
    Object v16 = new java.io.PrintStream(((java.lang.String)v14),((java.nio.charset.Charset)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v16));
    Object v18 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v19 = ((com.google.javascript.jscomp.CodingConvention)v18).getAbstractMethodName();
    Object v20 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v17),((com.google.javascript.jscomp.CodingConvention)v18));
    Object v21 = 29;
    Object v22 = "default";
    Object v23 = 1;
    Object v24 = 1;
    Object v25 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v21).intValue()),((java.lang.String)v22),(((java.lang.Integer)v23).intValue()),(((java.lang.Integer)v24).intValue()));
    Object v26 = ((com.google.javascript.jscomp.TypedScopeCreator)v20).createInitialScope(((com.google.javascript.rhino.Node)v25));
    Object v27 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v11),((com.google.javascript.jscomp.Scope)v26));
    org.junit.Assert.assertNotNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getErrorManager();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = 29;
    Object v7 = "default";
    Object v8 = 1;
    Object v9 = 1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = "L";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v16 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v14),((com.google.javascript.jscomp.CodingConvention)v15));
    Object v17 = 29;
    Object v18 = "default";
    Object v19 = 1;
    Object v20 = 1;
    Object v21 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v17).intValue()),((java.lang.String)v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
    Object v22 = 29;
    Object v23 = "default";
    Object v24 = 1;
    Object v25 = 1;
    Object v26 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v22).intValue()),((java.lang.String)v23),(((java.lang.Integer)v24).intValue()),(((java.lang.Integer)v25).intValue()));
    Object v27 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v27));
    Object v29 = "EVAL_ERROR_TYPE";
    Object v30 = "?";
    Object v31 = 1;
    Object v32 = -35;
    Object v33 = new com.google.javascript.rhino.jstype.NamedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v28),((java.lang.String)v29),((java.lang.String)v30),(((java.lang.Integer)v31).intValue()),(((java.lang.Integer)v32).intValue()));
    Object v34 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v26),((com.google.javascript.rhino.jstype.ObjectType)v33));
    Object v35 = " -= ";
    Object v36 = ((com.google.javascript.jscomp.Scope)v34).getVar(((java.lang.String)v35));
    Object v37 = ((com.google.javascript.jscomp.TypedScopeCreator)v16).createScope(((com.google.javascript.rhino.Node)v21),((com.google.javascript.jscomp.Scope)v34));
    Object v38 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.Scope)v37));
    org.junit.Assert.assertNotNull(v38);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getCodingConvention();
    Object v5 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v5));
    Object v7 = 29;
    Object v8 = "default";
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = "L";
    Object v13 = java.nio.charset.Charset.defaultCharset();
    Object v14 = new java.io.PrintStream(((java.lang.String)v12),((java.nio.charset.Charset)v13));
    Object v15 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v14));
    Object v16 = ((com.google.javascript.jscomp.AbstractCompiler)v15).getCodingConvention();
    Object v17 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v18 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v15),((com.google.javascript.jscomp.CodingConvention)v17));
    Object v19 = 29;
    Object v20 = "default";
    Object v21 = 1;
    Object v22 = 1;
    Object v23 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v19).intValue()),((java.lang.String)v20),(((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()));
    Object v24 = "L";
    Object v25 = java.nio.charset.Charset.defaultCharset();
    Object v26 = new java.io.PrintStream(((java.lang.String)v24),((java.nio.charset.Charset)v25));
    Object v27 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v26));
    Object v28 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v29 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v27),((com.google.javascript.jscomp.CodingConvention)v28));
    Object v30 = 29;
    Object v31 = "default";
    Object v32 = 1;
    Object v33 = 1;
    Object v34 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v30).intValue()),((java.lang.String)v31),(((java.lang.Integer)v32).intValue()),(((java.lang.Integer)v33).intValue()));
    Object v35 = ((com.google.javascript.jscomp.TypedScopeCreator)v29).createInitialScope(((com.google.javascript.rhino.Node)v34));
    Object v36 = ((com.google.javascript.jscomp.TypedScopeCreator)v18).createScope(((com.google.javascript.rhino.Node)v23),((com.google.javascript.jscomp.Scope)v35));
    Object v37 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v11),((com.google.javascript.jscomp.Scope)v36));
    org.junit.Assert.assertNotNull(v37);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getReverseAbstractInterpreter();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getReverseAbstractInterpreter();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = 29;
    Object v7 = "default";
    Object v8 = 1;
    Object v9 = 1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = "L";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = ((com.google.javascript.jscomp.AbstractCompiler)v14).getErrorManager();
    Object v16 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v14));
    Object v17 = 29;
    Object v18 = "default";
    Object v19 = 1;
    Object v20 = 1;
    Object v21 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v17).intValue()),((java.lang.String)v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
    Object v22 = "L";
    Object v23 = java.nio.charset.Charset.defaultCharset();
    Object v24 = new java.io.PrintStream(((java.lang.String)v22),((java.nio.charset.Charset)v23));
    Object v25 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v24));
    Object v26 = ((com.google.javascript.jscomp.AbstractCompiler)v25).getReverseAbstractInterpreter();
    Object v27 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v28 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v25),((com.google.javascript.jscomp.CodingConvention)v27));
    Object v29 = 29;
    Object v30 = "default";
    Object v31 = 1;
    Object v32 = 1;
    Object v33 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v29).intValue()),((java.lang.String)v30),(((java.lang.Integer)v31).intValue()),(((java.lang.Integer)v32).intValue()));
    Object v34 = ((com.google.javascript.jscomp.TypedScopeCreator)v28).createInitialScope(((com.google.javascript.rhino.Node)v33));
    Object v35 = ((com.google.javascript.jscomp.TypedScopeCreator)v16).createScope(((com.google.javascript.rhino.Node)v21),((com.google.javascript.jscomp.Scope)v34));
    Object v36 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.Scope)v35));
    org.junit.Assert.assertNotNull(v36);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v5 = ((com.google.javascript.jscomp.CodingConvention)v4).getExportSymbolFunction();
    Object v6 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.CodingConvention)v4));
    Object v7 = 29;
    Object v8 = "default";
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = "L";
    Object v13 = java.nio.charset.Charset.defaultCharset();
    Object v14 = new java.io.PrintStream(((java.lang.String)v12),((java.nio.charset.Charset)v13));
    Object v15 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v14));
    ((com.google.javascript.jscomp.AbstractCompiler)v15).reportCodeChange();
    Object v16 = null;
    Object v17 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v15));
    Object v18 = 29;
    Object v19 = "default";
    Object v20 = 1;
    Object v21 = 1;
    Object v22 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v18).intValue()),((java.lang.String)v19),(((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()));
    Object v23 = 29;
    Object v24 = "default";
    Object v25 = 1;
    Object v26 = 1;
    Object v27 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v23).intValue()),((java.lang.String)v24),(((java.lang.Integer)v25).intValue()),(((java.lang.Integer)v26).intValue()));
    Object v28 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v29 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v28));
    Object v30 = "EVAL_ERROR_TYPE";
    Object v31 = "?";
    Object v32 = 1;
    Object v33 = -35;
    Object v34 = new com.google.javascript.rhino.jstype.NamedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v29),((java.lang.String)v30),((java.lang.String)v31),(((java.lang.Integer)v32).intValue()),(((java.lang.Integer)v33).intValue()));
    Object v35 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v27),((com.google.javascript.rhino.jstype.ObjectType)v34));
    Object v36 = "L";
    Object v37 = ((com.google.javascript.jscomp.Scope)v35).getOwnSlot(((java.lang.String)v36));
    Object v38 = ((com.google.javascript.jscomp.TypedScopeCreator)v17).createScope(((com.google.javascript.rhino.Node)v22),((com.google.javascript.jscomp.Scope)v35));
    Object v39 = ((com.google.javascript.jscomp.TypedScopeCreator)v6).createScope(((com.google.javascript.rhino.Node)v11),((com.google.javascript.jscomp.Scope)v38));
    org.junit.Assert.assertNotNull(v39);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = "L";
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new java.io.PrintStream(((java.lang.String)v0),((java.nio.charset.Charset)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v2));
    Object v4 = ((com.google.javascript.jscomp.AbstractCompiler)v3).getReverseAbstractInterpreter();
    Object v5 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v3));
    Object v6 = 29;
    Object v7 = "default";
    Object v8 = 1;
    Object v9 = 1;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = "L";
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = new java.io.PrintStream(((java.lang.String)v11),((java.nio.charset.Charset)v12));
    Object v14 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v13));
    Object v15 = new com.google.javascript.jscomp.TypedScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v14));
    Object v16 = 29;
    Object v17 = "default";
    Object v18 = 1;
    Object v19 = 1;
    Object v20 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v16).intValue()),((java.lang.String)v17),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()));
    Object v21 = ((com.google.javascript.jscomp.TypedScopeCreator)v15).createInitialScope(((com.google.javascript.rhino.Node)v20));
    Object v22 = ((com.google.javascript.jscomp.TypedScopeCreator)v5).createScope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.jscomp.Scope)v21));
    org.junit.Assert.assertNotNull(v22);
  }
}
