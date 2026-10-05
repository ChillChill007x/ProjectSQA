package com.google.javascript.jscomp;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = 1;
    Object v1 = "H";
    Object v2 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1));
    Object v3 = null;
    Object v4 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v2),((com.google.javascript.rhino.jstype.ObjectType)v3));
    Object v5 = "A";
    Object v6 = false;
    Object v7 = ((com.google.javascript.jscomp.Scope)v4).isDeclared(((java.lang.String)v5),(((java.lang.Boolean)v6).booleanValue()));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = 1;
    Object v1 = "H";
    Object v2 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1));
    Object v3 = null;
    Object v4 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v2),((com.google.javascript.rhino.jstype.ObjectType)v3));
    Object v5 = ((com.google.javascript.jscomp.Scope)v4).getAllSymbols();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = 1;
    Object v1 = "H";
    Object v2 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1));
    Object v3 = null;
    Object v4 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v2),((com.google.javascript.rhino.jstype.ObjectType)v3));
    Object v5 = ((com.google.javascript.jscomp.Scope)v4).getRootNode();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = 1;
    Object v1 = "H";
    Object v2 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1));
    Object v3 = null;
    Object v4 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v2),((com.google.javascript.rhino.jstype.ObjectType)v3));
    Object v5 = ((com.google.javascript.jscomp.Scope)v4).getVarCount();
    Object v6 = ((com.google.javascript.jscomp.Scope)v4).getArgumentsVar();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = 1;
    Object v1 = "H";
    Object v2 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1));
    Object v3 = null;
    Object v4 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v2),((com.google.javascript.rhino.jstype.ObjectType)v3));
    Object v5 = ((com.google.javascript.jscomp.Scope)v4).getGlobalScope();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = "H";
    Object v2 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1));
    Object v3 = null;
    Object v4 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v2),((com.google.javascript.rhino.jstype.ObjectType)v3));
    Object v5 = ((com.google.javascript.jscomp.Scope)v4).getGlobalScope();
    Object v6 = 1;
    Object v7 = "H";
    Object v8 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7));
    Object v9 = null;
    Object v10 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.jstype.ObjectType)v9));
    Object v11 = ((com.google.javascript.jscomp.Scope)v10).getVarCount();
    Object v12 = ((com.google.javascript.jscomp.Scope)v10).getArgumentsVar();
    ((com.google.javascript.jscomp.Scope)v5).undeclare(((com.google.javascript.jscomp.Scope.Var)v12));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = 1;
    Object v1 = "H";
    Object v2 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1));
    Object v3 = null;
    Object v4 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v2),((com.google.javascript.rhino.jstype.ObjectType)v3));
    Object v5 = ((com.google.javascript.jscomp.Scope)v4).isLocal();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = "H";
    Object v2 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1));
    Object v3 = null;
    Object v4 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v2),((com.google.javascript.rhino.jstype.ObjectType)v3));
    Object v5 = 1;
    Object v6 = "H";
    Object v7 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v5).intValue()),((java.lang.String)v6));
    Object v8 = null;
    Object v9 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.jstype.ObjectType)v8));
    Object v10 = ((com.google.javascript.jscomp.Scope)v9).getVarCount();
    Object v11 = ((com.google.javascript.jscomp.Scope)v9).getArgumentsVar();
    ((com.google.javascript.jscomp.Scope)v4).undeclare(((com.google.javascript.jscomp.Scope.Var)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = 1;
    Object v1 = "H";
    Object v2 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1));
    Object v3 = null;
    Object v4 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v2),((com.google.javascript.rhino.jstype.ObjectType)v3));
    Object v5 = ((com.google.javascript.jscomp.Scope)v4).getGlobalScope();
    Object v6 = ((com.google.javascript.jscomp.Scope)v5).getAllSymbols();
    Object v7 = ((com.google.javascript.jscomp.Scope)v5).isBottom();
    org.junit.Assert.assertEquals((Object)(true), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = "H";
    Object v2 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1));
    Object v3 = null;
    Object v4 = new com.google.javascript.jscomp.Compiler(((java.io.PrintStream)v3));
    Object v5 = com.google.javascript.jscomp.SourceExcerptProvider.SourceExcerpt.REGION;
    Object v6 = new com.google.javascript.jscomp.LightweightMessageFormatter(((com.google.javascript.jscomp.SourceExcerptProvider)v4),((com.google.javascript.jscomp.SourceExcerptProvider.SourceExcerpt)v5));
    Object v7 = new com.google.javascript.jscomp.ant.CompileTask();
    Object v8 = new com.google.javascript.jscomp.ant.AntErrorManager(((com.google.javascript.jscomp.MessageFormatter)v6),((org.apache.tools.ant.Task)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v8));
    Object v10 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v2),((com.google.javascript.jscomp.AbstractCompiler)v9));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = 1;
    Object v1 = "H";
    Object v2 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1));
    Object v3 = null;
    Object v4 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v2),((com.google.javascript.rhino.jstype.ObjectType)v3));
    Object v5 = ((com.google.javascript.jscomp.Scope)v4).getGlobalScope();
    Object v6 = 1;
    Object v7 = "H";
    Object v8 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7));
    Object v9 = new com.google.javascript.jscomp.Scope(((com.google.javascript.jscomp.Scope)v5),((com.google.javascript.rhino.Node)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = 1;
    Object v1 = "H";
    Object v2 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1));
    Object v3 = null;
    Object v4 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v2),((com.google.javascript.rhino.jstype.ObjectType)v3));
    Object v5 = ((com.google.javascript.jscomp.Scope)v4).getGlobalScope();
    Object v6 = 1;
    Object v7 = "H";
    Object v8 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7));
    Object v9 = null;
    Object v10 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.jstype.ObjectType)v9));
    Object v11 = ((com.google.javascript.jscomp.Scope)v10).getVarCount();
    Object v12 = ((com.google.javascript.jscomp.Scope)v10).getArgumentsVar();
    Object v13 = ((com.google.javascript.jscomp.Scope)v5).getReferences(((com.google.javascript.jscomp.Scope.Var)v12));
    Object v14 = "k";
    Object v15 = ((com.google.javascript.jscomp.Scope)v5).getVar(((java.lang.String)v14));
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = 1;
    Object v1 = "H";
    Object v2 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1));
    Object v3 = null;
    Object v4 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v2),((com.google.javascript.rhino.jstype.ObjectType)v3));
    Object v5 = ((com.google.javascript.jscomp.Scope)v4).getGlobalScope();
    Object v6 = ".";
    Object v7 = 1;
    Object v8 = "H";
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.jstype.ObjectType)v10));
    Object v12 = ((com.google.javascript.jscomp.Scope)v11).getRootNode();
    Object v13 = null;
    Object v14 = "|";
    Object v15 = java.io.Reader.nullReader();
    Object v16 = com.google.javascript.jscomp.SourceFile.fromReader(((java.lang.String)v14),((java.io.Reader)v15));
    Object v17 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v16));
    Object v18 = false;
    Object v19 = new com.google.javascript.jscomp.CompilerInput(((com.google.javascript.jscomp.SourceAst)v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = true;
    Object v21 = ((com.google.javascript.jscomp.Scope)v5).declare(((java.lang.String)v6),((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.jstype.JSType)v13),((com.google.javascript.jscomp.CompilerInput)v19),(((java.lang.Boolean)v20).booleanValue()));
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = 1;
    Object v1 = "H";
    Object v2 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1));
    Object v3 = null;
    Object v4 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v2),((com.google.javascript.rhino.jstype.ObjectType)v3));
    Object v5 = ((com.google.javascript.jscomp.Scope)v4).getGlobalScope();
    Object v6 = 1;
    Object v7 = "H";
    Object v8 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7));
    Object v9 = null;
    Object v10 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.jstype.ObjectType)v9));
    Object v11 = ((com.google.javascript.jscomp.Scope)v10).getVarCount();
    Object v12 = ((com.google.javascript.jscomp.Scope)v10).getArgumentsVar();
    Object v13 = ((com.google.javascript.jscomp.Scope)v5).getReferences(((com.google.javascript.jscomp.Scope.Var)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = 1;
    Object v1 = "H";
    Object v2 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1));
    Object v3 = null;
    Object v4 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v2),((com.google.javascript.rhino.jstype.ObjectType)v3));
    Object v5 = ((com.google.javascript.jscomp.Scope)v4).getGlobalScope();
    Object v6 = ((com.google.javascript.jscomp.Scope)v5).getVarCount();
    Object v7 = ((com.google.javascript.jscomp.Scope)v5).isLocal();
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = 1;
    Object v1 = "H";
    Object v2 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1));
    Object v3 = null;
    Object v4 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v2),((com.google.javascript.rhino.jstype.ObjectType)v3));
    Object v5 = ((com.google.javascript.jscomp.Scope)v4).getGlobalScope();
    Object v6 = "JSCompiler_ObjectPropertyString";
    Object v7 = ((com.google.javascript.jscomp.Scope)v5).getOwnSlot(((java.lang.String)v6));
    Object v8 = ((com.google.javascript.jscomp.Scope)v5).getVarCount();
    org.junit.Assert.assertEquals((Object)(0), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = 1;
    Object v1 = "H";
    Object v2 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1));
    Object v3 = null;
    Object v4 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v2),((com.google.javascript.rhino.jstype.ObjectType)v3));
    Object v5 = ((com.google.javascript.jscomp.Scope)v4).getGlobalScope();
    Object v6 = ((com.google.javascript.jscomp.Scope)v5).getDeclarativelyUnboundVarsWithoutTypes();
    Object v7 = 1;
    Object v8 = "H";
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.jstype.ObjectType)v10));
    Object v12 = ((com.google.javascript.jscomp.Scope)v11).getGlobalScope();
    Object v13 = ".";
    Object v14 = 1;
    Object v15 = "H";
    Object v16 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v14).intValue()),((java.lang.String)v15));
    Object v17 = null;
    Object v18 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v16),((com.google.javascript.rhino.jstype.ObjectType)v17));
    Object v19 = ((com.google.javascript.jscomp.Scope)v18).getRootNode();
    Object v20 = null;
    Object v21 = "|";
    Object v22 = java.io.Reader.nullReader();
    Object v23 = com.google.javascript.jscomp.SourceFile.fromReader(((java.lang.String)v21),((java.io.Reader)v22));
    Object v24 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v23));
    Object v25 = false;
    Object v26 = new com.google.javascript.jscomp.CompilerInput(((com.google.javascript.jscomp.SourceAst)v24),(((java.lang.Boolean)v25).booleanValue()));
    Object v27 = true;
    Object v28 = ((com.google.javascript.jscomp.Scope)v12).declare(((java.lang.String)v13),((com.google.javascript.rhino.Node)v19),((com.google.javascript.rhino.jstype.JSType)v20),((com.google.javascript.jscomp.CompilerInput)v26),(((java.lang.Boolean)v27).booleanValue()));
    Object v29 = ((com.google.javascript.jscomp.Scope)v5).getReferences(((com.google.javascript.jscomp.Scope.Var)v28));
    org.junit.Assert.assertNotNull(v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = 1;
    Object v1 = "H";
    Object v2 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1));
    Object v3 = null;
    Object v4 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v2),((com.google.javascript.rhino.jstype.ObjectType)v3));
    Object v5 = ((com.google.javascript.jscomp.Scope)v4).getGlobalScope();
    Object v6 = ((com.google.javascript.jscomp.Scope)v5).getArgumentsVar();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = 1;
    Object v1 = "H";
    Object v2 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1));
    Object v3 = null;
    Object v4 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v2),((com.google.javascript.rhino.jstype.ObjectType)v3));
    Object v5 = ((com.google.javascript.jscomp.Scope)v4).getVars();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = 1;
    Object v1 = "H";
    Object v2 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1));
    Object v3 = null;
    Object v4 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v2),((com.google.javascript.rhino.jstype.ObjectType)v3));
    Object v5 = ((com.google.javascript.jscomp.Scope)v4).getGlobalScope();
    Object v6 = "}";
    Object v7 = ((com.google.javascript.jscomp.Scope)v5).getVar(((java.lang.String)v6));
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = "H";
    Object v2 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1));
    Object v3 = null;
    Object v4 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v2),((com.google.javascript.rhino.jstype.ObjectType)v3));
    Object v5 = ((com.google.javascript.jscomp.Scope)v4).getGlobalScope();
    Object v6 = 1;
    Object v7 = "H";
    Object v8 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7));
    Object v9 = null;
    Object v10 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.jstype.ObjectType)v9));
    Object v11 = ((com.google.javascript.jscomp.Scope)v10).getGlobalScope();
    Object v12 = ((com.google.javascript.jscomp.Scope)v11).getArgumentsVar();
    ((com.google.javascript.jscomp.Scope)v5).undeclare(((com.google.javascript.jscomp.Scope.Var)v12));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = 1;
    Object v1 = "H";
    Object v2 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1));
    Object v3 = null;
    Object v4 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v2),((com.google.javascript.rhino.jstype.ObjectType)v3));
    Object v5 = ((com.google.javascript.jscomp.Scope)v4).getGlobalScope();
    Object v6 = ((com.google.javascript.jscomp.Scope)v5).isGlobal();
    org.junit.Assert.assertEquals((Object)(true), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = 1;
    Object v1 = "H";
    Object v2 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1));
    Object v3 = null;
    Object v4 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v2),((com.google.javascript.rhino.jstype.ObjectType)v3));
    Object v5 = ((com.google.javascript.jscomp.Scope)v4).getGlobalScope();
    Object v6 = ((com.google.javascript.jscomp.Scope)v5).getGlobalScope();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = 1;
    Object v1 = "H";
    Object v2 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1));
    Object v3 = null;
    Object v4 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v2),((com.google.javascript.rhino.jstype.ObjectType)v3));
    Object v5 = ((com.google.javascript.jscomp.Scope)v4).getGlobalScope();
    Object v6 = 1;
    Object v7 = "H";
    Object v8 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7));
    Object v9 = new com.google.javascript.jscomp.Scope(((com.google.javascript.jscomp.Scope)v5),((com.google.javascript.rhino.Node)v8));
    Object v10 = "V.";
    Object v11 = ((com.google.javascript.jscomp.Scope)v9).getVar(((java.lang.String)v10));
    Object v12 = 1;
    Object v13 = "H";
    Object v14 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v12).intValue()),((java.lang.String)v13));
    Object v15 = new com.google.javascript.jscomp.Scope(((com.google.javascript.jscomp.Scope)v9),((com.google.javascript.rhino.Node)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = 1;
    Object v1 = "H";
    Object v2 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1));
    Object v3 = null;
    Object v4 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v2),((com.google.javascript.rhino.jstype.ObjectType)v3));
    Object v5 = ((com.google.javascript.jscomp.Scope)v4).getGlobalScope();
    Object v6 = ((com.google.javascript.jscomp.Scope)v5).getGlobalScope();
    Object v7 = ((com.google.javascript.jscomp.Scope)v6).getArgumentsVar();
    Object v8 = ((com.google.javascript.jscomp.Scope)v6).getParentScope();
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = 1;
    Object v1 = "H";
    Object v2 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1));
    Object v3 = null;
    Object v4 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v2),((com.google.javascript.rhino.jstype.ObjectType)v3));
    Object v5 = ((com.google.javascript.jscomp.Scope)v4).getGlobalScope();
    Object v6 = ((com.google.javascript.jscomp.Scope)v5).getGlobalScope();
    Object v7 = ((com.google.javascript.jscomp.Scope)v6).getGlobalScope();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = 1;
    Object v1 = "H";
    Object v2 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1));
    Object v3 = null;
    Object v4 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v2),((com.google.javascript.rhino.jstype.ObjectType)v3));
    Object v5 = 1;
    Object v6 = "H";
    Object v7 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v5).intValue()),((java.lang.String)v6));
    Object v8 = null;
    Object v9 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.jstype.ObjectType)v8));
    Object v10 = ((com.google.javascript.jscomp.Scope)v9).getVarCount();
    Object v11 = ((com.google.javascript.jscomp.Scope)v9).getArgumentsVar();
    Object v12 = ((com.google.javascript.jscomp.Scope)v4).getReferences(((com.google.javascript.jscomp.Scope.Var)v11));
    Object v13 = 1;
    Object v14 = "H";
    Object v15 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v13).intValue()),((java.lang.String)v14));
    Object v16 = null;
    Object v17 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v15),((com.google.javascript.rhino.jstype.ObjectType)v16));
    Object v18 = ((com.google.javascript.jscomp.Scope)v17).getGlobalScope();
    Object v19 = ((com.google.javascript.jscomp.Scope)v18).getArgumentsVar();
    Object v20 = ((com.google.javascript.jscomp.Scope)v4).getScope(((com.google.javascript.jscomp.Scope.Var)v19));
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = "H";
    Object v2 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1));
    Object v3 = null;
    Object v4 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v2),((com.google.javascript.rhino.jstype.ObjectType)v3));
    Object v5 = ((com.google.javascript.jscomp.Scope)v4).getGlobalScope();
    Object v6 = ((com.google.javascript.jscomp.Scope)v5).getGlobalScope();
    Object v7 = "";
    Object v8 = ((com.google.javascript.jscomp.Scope)v6).getSlot(((java.lang.String)v7));
    Object v9 = 1;
    Object v10 = "H";
    Object v11 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v9).intValue()),((java.lang.String)v10));
    Object v12 = null;
    Object v13 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v11),((com.google.javascript.rhino.jstype.ObjectType)v12));
    Object v14 = ((com.google.javascript.jscomp.Scope)v13).getGlobalScope();
    Object v15 = ((com.google.javascript.jscomp.Scope)v14).getArgumentsVar();
    Object v16 = ((com.google.javascript.jscomp.Scope.Var)v15).isConst();
    ((com.google.javascript.jscomp.Scope)v6).undeclare(((com.google.javascript.jscomp.Scope.Var)v15));
    Object v17 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = 1;
    Object v1 = "H";
    Object v2 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1));
    Object v3 = null;
    Object v4 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v2),((com.google.javascript.rhino.jstype.ObjectType)v3));
    Object v5 = ((com.google.javascript.jscomp.Scope)v4).getGlobalScope();
    Object v6 = ((com.google.javascript.jscomp.Scope)v5).getGlobalScope();
    Object v7 = ((com.google.javascript.jscomp.Scope)v6).getGlobalScope();
    Object v8 = 1;
    Object v9 = "H";
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v8).intValue()),((java.lang.String)v9));
    Object v11 = new com.google.javascript.jscomp.Scope(((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.rhino.Node)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = 1;
    Object v1 = "H";
    Object v2 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1));
    Object v3 = null;
    Object v4 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v2),((com.google.javascript.rhino.jstype.ObjectType)v3));
    Object v5 = ((com.google.javascript.jscomp.Scope)v4).getGlobalScope();
    Object v6 = ((com.google.javascript.jscomp.Scope)v5).getDeclarativelyUnboundVarsWithoutTypes();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = 1;
    Object v1 = "H";
    Object v2 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1));
    Object v3 = null;
    Object v4 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v2),((com.google.javascript.rhino.jstype.ObjectType)v3));
    Object v5 = 1;
    Object v6 = "H";
    Object v7 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v5).intValue()),((java.lang.String)v6));
    Object v8 = null;
    Object v9 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.jstype.ObjectType)v8));
    Object v10 = ((com.google.javascript.jscomp.Scope)v9).getVarCount();
    Object v11 = ((com.google.javascript.jscomp.Scope)v9).getArgumentsVar();
    Object v12 = ((com.google.javascript.jscomp.Scope)v4).getReferences(((com.google.javascript.jscomp.Scope.Var)v11));
    Object v13 = 1;
    Object v14 = "H";
    Object v15 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v13).intValue()),((java.lang.String)v14));
    Object v16 = null;
    Object v17 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v15),((com.google.javascript.rhino.jstype.ObjectType)v16));
    Object v18 = ((com.google.javascript.jscomp.Scope)v17).getGlobalScope();
    Object v19 = ((com.google.javascript.jscomp.Scope)v18).getArgumentsVar();
    Object v20 = ((com.google.javascript.jscomp.Scope)v4).getScope(((com.google.javascript.jscomp.Scope.Var)v19));
    Object v21 = ((com.google.javascript.jscomp.Scope)v20).getVarCount();
    Object v22 = ((com.google.javascript.jscomp.Scope)v20).isLocal();
    org.junit.Assert.assertEquals((Object)(false), v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = 1;
    Object v1 = "H";
    Object v2 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1));
    Object v3 = null;
    Object v4 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v2),((com.google.javascript.rhino.jstype.ObjectType)v3));
    Object v5 = ((com.google.javascript.jscomp.Scope)v4).getGlobalScope();
    Object v6 = ((com.google.javascript.jscomp.Scope)v5).getGlobalScope();
    Object v7 = ((com.google.javascript.jscomp.Scope)v6).isLocal();
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = 1;
    Object v1 = "H";
    Object v2 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1));
    Object v3 = null;
    Object v4 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v2),((com.google.javascript.rhino.jstype.ObjectType)v3));
    Object v5 = ((com.google.javascript.jscomp.Scope)v4).isGlobal();
    org.junit.Assert.assertEquals((Object)(true), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = 1;
    Object v1 = "H";
    Object v2 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1));
    Object v3 = null;
    Object v4 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v2),((com.google.javascript.rhino.jstype.ObjectType)v3));
    Object v5 = ((com.google.javascript.jscomp.Scope)v4).getGlobalScope();
    Object v6 = ((com.google.javascript.jscomp.Scope)v5).getGlobalScope();
    Object v7 = ((com.google.javascript.jscomp.Scope)v6).getGlobalScope();
    Object v8 = 1;
    Object v9 = "H";
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v8).intValue()),((java.lang.String)v9));
    Object v11 = new com.google.javascript.jscomp.Scope(((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.rhino.Node)v10));
    Object v12 = ((com.google.javascript.jscomp.Scope)v11).getArgumentsVar();
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = 1;
    Object v1 = "H";
    Object v2 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1));
    Object v3 = null;
    Object v4 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v2),((com.google.javascript.rhino.jstype.ObjectType)v3));
    Object v5 = ((com.google.javascript.jscomp.Scope)v4).getGlobalScope();
    Object v6 = ((com.google.javascript.jscomp.Scope)v5).getGlobalScope();
    Object v7 = ((com.google.javascript.jscomp.Scope)v6).getGlobalScope();
    Object v8 = 1;
    Object v9 = "H";
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v8).intValue()),((java.lang.String)v9));
    Object v11 = new com.google.javascript.jscomp.Scope(((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.rhino.Node)v10));
    Object v12 = ((com.google.javascript.jscomp.Scope)v11).getVarCount();
    Object v13 = ((com.google.javascript.jscomp.Scope)v11).isGlobal();
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = 1;
    Object v1 = "H";
    Object v2 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1));
    Object v3 = null;
    Object v4 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v2),((com.google.javascript.rhino.jstype.ObjectType)v3));
    Object v5 = ((com.google.javascript.jscomp.Scope)v4).getGlobalScope();
    Object v6 = ((com.google.javascript.jscomp.Scope)v5).getGlobalScope();
    Object v7 = "!";
    Object v8 = false;
    Object v9 = ((com.google.javascript.jscomp.Scope)v6).isDeclared(((java.lang.String)v7),(((java.lang.Boolean)v8).booleanValue()));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = 1;
    Object v1 = "H";
    Object v2 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1));
    Object v3 = null;
    Object v4 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v2),((com.google.javascript.rhino.jstype.ObjectType)v3));
    Object v5 = ((com.google.javascript.jscomp.Scope)v4).getGlobalScope();
    Object v6 = ((com.google.javascript.jscomp.Scope)v5).getGlobalScope();
    Object v7 = ((com.google.javascript.jscomp.Scope)v6).getGlobalScope();
    Object v8 = 1;
    Object v9 = "H";
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v8).intValue()),((java.lang.String)v9));
    Object v11 = new com.google.javascript.jscomp.Scope(((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.rhino.Node)v10));
    Object v12 = "prototype";
    Object v13 = ((com.google.javascript.jscomp.Scope)v11).getVar(((java.lang.String)v12));
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = 1;
    Object v1 = "H";
    Object v2 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1));
    Object v3 = null;
    Object v4 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v2),((com.google.javascript.rhino.jstype.ObjectType)v3));
    Object v5 = ((com.google.javascript.jscomp.Scope)v4).getGlobalScope();
    Object v6 = 1;
    Object v7 = "H";
    Object v8 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7));
    Object v9 = new com.google.javascript.jscomp.Scope(((com.google.javascript.jscomp.Scope)v5),((com.google.javascript.rhino.Node)v8));
    Object v10 = ((com.google.javascript.jscomp.Scope)v9).getGlobalScope();
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = "H";
    Object v2 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1));
    Object v3 = null;
    Object v4 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v2),((com.google.javascript.rhino.jstype.ObjectType)v3));
    Object v5 = ((com.google.javascript.jscomp.Scope)v4).getGlobalScope();
    Object v6 = ((com.google.javascript.jscomp.Scope)v5).getGlobalScope();
    Object v7 = 1;
    Object v8 = "H";
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.jstype.ObjectType)v10));
    Object v12 = ((com.google.javascript.jscomp.Scope)v11).getGlobalScope();
    Object v13 = ((com.google.javascript.jscomp.Scope)v12).getGlobalScope();
    Object v14 = ((com.google.javascript.jscomp.Scope)v13).getGlobalScope();
    Object v15 = 1;
    Object v16 = "H";
    Object v17 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v15).intValue()),((java.lang.String)v16));
    Object v18 = new com.google.javascript.jscomp.Scope(((com.google.javascript.jscomp.Scope)v14),((com.google.javascript.rhino.Node)v17));
    Object v19 = ((com.google.javascript.jscomp.Scope)v18).getArgumentsVar();
    ((com.google.javascript.jscomp.Scope)v6).undeclare(((com.google.javascript.jscomp.Scope.Var)v19));
    Object v20 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = "H";
    Object v2 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1));
    Object v3 = null;
    Object v4 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v2),((com.google.javascript.rhino.jstype.ObjectType)v3));
    Object v5 = ((com.google.javascript.jscomp.Scope)v4).getGlobalScope();
    Object v6 = ((com.google.javascript.jscomp.Scope)v5).getGlobalScope();
    Object v7 = 1;
    Object v8 = "H";
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.jstype.ObjectType)v10));
    Object v12 = ((com.google.javascript.jscomp.Scope)v11).getGlobalScope();
    Object v13 = ((com.google.javascript.jscomp.Scope)v12).getArgumentsVar();
    ((com.google.javascript.jscomp.Scope)v6).undeclare(((com.google.javascript.jscomp.Scope.Var)v13));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = 1;
    Object v1 = "H";
    Object v2 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1));
    Object v3 = null;
    Object v4 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v2),((com.google.javascript.rhino.jstype.ObjectType)v3));
    Object v5 = ((com.google.javascript.jscomp.Scope)v4).getGlobalScope();
    Object v6 = ((com.google.javascript.jscomp.Scope)v5).getGlobalScope();
    Object v7 = "";
    Object v8 = ((com.google.javascript.jscomp.Scope)v6).getSlot(((java.lang.String)v7));
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = 1;
    Object v1 = "H";
    Object v2 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1));
    Object v3 = null;
    Object v4 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v2),((com.google.javascript.rhino.jstype.ObjectType)v3));
    Object v5 = ((com.google.javascript.jscomp.Scope)v4).getGlobalScope();
    Object v6 = 1;
    Object v7 = "H";
    Object v8 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7));
    Object v9 = new com.google.javascript.jscomp.Scope(((com.google.javascript.jscomp.Scope)v5),((com.google.javascript.rhino.Node)v8));
    Object v10 = ((com.google.javascript.jscomp.Scope)v9).getGlobalScope();
    Object v11 = ((com.google.javascript.jscomp.Scope)v10).getParent();
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = 1;
    Object v1 = "H";
    Object v2 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1));
    Object v3 = null;
    Object v4 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v2),((com.google.javascript.rhino.jstype.ObjectType)v3));
    Object v5 = ((com.google.javascript.jscomp.Scope)v4).getGlobalScope();
    Object v6 = ((com.google.javascript.jscomp.Scope)v5).getGlobalScope();
    Object v7 = ((com.google.javascript.jscomp.Scope)v6).getGlobalScope();
    Object v8 = 1;
    Object v9 = "H";
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v8).intValue()),((java.lang.String)v9));
    Object v11 = new com.google.javascript.jscomp.Scope(((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.rhino.Node)v10));
    Object v12 = ((com.google.javascript.jscomp.Scope)v11).getAllSymbols();
    Object v13 = 1;
    Object v14 = "H";
    Object v15 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v13).intValue()),((java.lang.String)v14));
    Object v16 = new com.google.javascript.jscomp.Scope(((com.google.javascript.jscomp.Scope)v11),((com.google.javascript.rhino.Node)v15));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = 1;
    Object v1 = "H";
    Object v2 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1));
    Object v3 = null;
    Object v4 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v2),((com.google.javascript.rhino.jstype.ObjectType)v3));
    Object v5 = ((com.google.javascript.jscomp.Scope)v4).getGlobalScope();
    Object v6 = ((com.google.javascript.jscomp.Scope)v5).getGlobalScope();
    Object v7 = ((com.google.javascript.jscomp.Scope)v6).getGlobalScope();
    Object v8 = ((com.google.javascript.jscomp.Scope)v7).getGlobalScope();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = 1;
    Object v1 = "H";
    Object v2 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1));
    Object v3 = null;
    Object v4 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v2),((com.google.javascript.rhino.jstype.ObjectType)v3));
    Object v5 = ((com.google.javascript.jscomp.Scope)v4).getGlobalScope();
    Object v6 = ((com.google.javascript.jscomp.Scope)v5).getGlobalScope();
    Object v7 = ((com.google.javascript.jscomp.Scope)v6).getGlobalScope();
    Object v8 = 1;
    Object v9 = "H";
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v8).intValue()),((java.lang.String)v9));
    Object v11 = new com.google.javascript.jscomp.Scope(((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.rhino.Node)v10));
    Object v12 = ((com.google.javascript.jscomp.Scope)v11).getAllSymbols();
    Object v13 = 1;
    Object v14 = "H";
    Object v15 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v13).intValue()),((java.lang.String)v14));
    Object v16 = new com.google.javascript.jscomp.Scope(((com.google.javascript.jscomp.Scope)v11),((com.google.javascript.rhino.Node)v15));
    Object v17 = "+";
    Object v18 = ((com.google.javascript.jscomp.Scope)v16).getOwnSlot(((java.lang.String)v17));
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = 1;
    Object v1 = "H";
    Object v2 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1));
    Object v3 = null;
    Object v4 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v2),((com.google.javascript.rhino.jstype.ObjectType)v3));
    Object v5 = ((com.google.javascript.jscomp.Scope)v4).getGlobalScope();
    Object v6 = "ECMASCRIPT5_STRIgT";
    Object v7 = 1;
    Object v8 = "H";
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8));
    Object v10 = null;
    Object v11 = "|";
    Object v12 = java.io.Reader.nullReader();
    Object v13 = com.google.javascript.jscomp.SourceFile.fromReader(((java.lang.String)v11),((java.io.Reader)v12));
    Object v14 = new com.google.javascript.jscomp.JsAst(((com.google.javascript.jscomp.SourceFile)v13));
    Object v15 = false;
    Object v16 = new com.google.javascript.jscomp.CompilerInput(((com.google.javascript.jscomp.SourceAst)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = false;
    Object v18 = ((com.google.javascript.jscomp.Scope)v5).declare(((java.lang.String)v6),((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.jstype.JSType)v10),((com.google.javascript.jscomp.CompilerInput)v16),(((java.lang.Boolean)v17).booleanValue()));
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = 1;
    Object v1 = "H";
    Object v2 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1));
    Object v3 = null;
    Object v4 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v2),((com.google.javascript.rhino.jstype.ObjectType)v3));
    Object v5 = ((com.google.javascript.jscomp.Scope)v4).getGlobalScope();
    Object v6 = 1;
    Object v7 = "H";
    Object v8 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7));
    Object v9 = new com.google.javascript.jscomp.Scope(((com.google.javascript.jscomp.Scope)v5),((com.google.javascript.rhino.Node)v8));
    Object v10 = "V.";
    Object v11 = ((com.google.javascript.jscomp.Scope)v9).getVar(((java.lang.String)v10));
    Object v12 = 1;
    Object v13 = "H";
    Object v14 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v12).intValue()),((java.lang.String)v13));
    Object v15 = new com.google.javascript.jscomp.Scope(((com.google.javascript.jscomp.Scope)v9),((com.google.javascript.rhino.Node)v14));
    Object v16 = "";
    Object v17 = ((com.google.javascript.jscomp.Scope)v15).getSlot(((java.lang.String)v16));
    Object v18 = "A";
    Object v19 = false;
    Object v20 = ((com.google.javascript.jscomp.Scope)v15).isDeclared(((java.lang.String)v18),(((java.lang.Boolean)v19).booleanValue()));
    org.junit.Assert.assertEquals((Object)(false), v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = 1;
    Object v1 = "H";
    Object v2 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1));
    Object v3 = null;
    Object v4 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v2),((com.google.javascript.rhino.jstype.ObjectType)v3));
    Object v5 = ((com.google.javascript.jscomp.Scope)v4).getGlobalScope();
    Object v6 = ((com.google.javascript.jscomp.Scope)v5).getAllSymbols();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = 1;
    Object v1 = "H";
    Object v2 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1));
    Object v3 = null;
    Object v4 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v2),((com.google.javascript.rhino.jstype.ObjectType)v3));
    Object v5 = ((com.google.javascript.jscomp.Scope)v4).getGlobalScope();
    Object v6 = ((com.google.javascript.jscomp.Scope)v5).getArgumentsVar();
    Object v7 = 1;
    Object v8 = "H";
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8));
    Object v10 = new com.google.javascript.jscomp.Scope(((com.google.javascript.jscomp.Scope)v5),((com.google.javascript.rhino.Node)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = 1;
    Object v1 = "H";
    Object v2 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1));
    Object v3 = null;
    Object v4 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v2),((com.google.javascript.rhino.jstype.ObjectType)v3));
    Object v5 = ((com.google.javascript.jscomp.Scope)v4).getGlobalScope();
    Object v6 = 1;
    Object v7 = "H";
    Object v8 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7));
    Object v9 = new com.google.javascript.jscomp.Scope(((com.google.javascript.jscomp.Scope)v5),((com.google.javascript.rhino.Node)v8));
    Object v10 = ((com.google.javascript.jscomp.Scope)v9).getGlobalScope();
    Object v11 = ((com.google.javascript.jscomp.Scope)v10).isGlobal();
    org.junit.Assert.assertEquals((Object)(true), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = 1;
    Object v1 = "H";
    Object v2 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1));
    Object v3 = null;
    Object v4 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v2),((com.google.javascript.rhino.jstype.ObjectType)v3));
    Object v5 = ((com.google.javascript.jscomp.Scope)v4).getGlobalScope();
    Object v6 = ((com.google.javascript.jscomp.Scope)v5).getArgumentsVar();
    Object v7 = 1;
    Object v8 = "H";
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8));
    Object v10 = new com.google.javascript.jscomp.Scope(((com.google.javascript.jscomp.Scope)v5),((com.google.javascript.rhino.Node)v9));
    Object v11 = ((com.google.javascript.jscomp.Scope)v10).isGlobal();
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = 1;
    Object v1 = "H";
    Object v2 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1));
    Object v3 = null;
    Object v4 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v2),((com.google.javascript.rhino.jstype.ObjectType)v3));
    Object v5 = 1;
    Object v6 = "H";
    Object v7 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v5).intValue()),((java.lang.String)v6));
    Object v8 = null;
    Object v9 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.jstype.ObjectType)v8));
    Object v10 = ((com.google.javascript.jscomp.Scope)v9).getVarCount();
    Object v11 = ((com.google.javascript.jscomp.Scope)v9).getArgumentsVar();
    Object v12 = ((com.google.javascript.jscomp.Scope)v4).getReferences(((com.google.javascript.jscomp.Scope.Var)v11));
    Object v13 = 1;
    Object v14 = "H";
    Object v15 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v13).intValue()),((java.lang.String)v14));
    Object v16 = null;
    Object v17 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v15),((com.google.javascript.rhino.jstype.ObjectType)v16));
    Object v18 = ((com.google.javascript.jscomp.Scope)v17).getGlobalScope();
    Object v19 = ((com.google.javascript.jscomp.Scope)v18).getArgumentsVar();
    Object v20 = ((com.google.javascript.jscomp.Scope)v4).getScope(((com.google.javascript.jscomp.Scope.Var)v19));
    Object v21 = "defaut";
    Object v22 = false;
    Object v23 = ((com.google.javascript.jscomp.Scope)v20).isDeclared(((java.lang.String)v21),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = "k";
    Object v25 = ((com.google.javascript.jscomp.Scope)v20).getVar(((java.lang.String)v24));
    org.junit.Assert.assertNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = 1;
    Object v1 = "H";
    Object v2 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1));
    Object v3 = null;
    Object v4 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v2),((com.google.javascript.rhino.jstype.ObjectType)v3));
    Object v5 = ((com.google.javascript.jscomp.Scope)v4).getGlobalScope();
    Object v6 = ((com.google.javascript.jscomp.Scope)v5).getGlobalScope();
    Object v7 = ((com.google.javascript.jscomp.Scope)v6).getGlobalScope();
    Object v8 = ((com.google.javascript.jscomp.Scope)v7).getGlobalScope();
    Object v9 = ((com.google.javascript.jscomp.Scope)v8).isGlobal();
    org.junit.Assert.assertEquals((Object)(true), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = "H";
    Object v2 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1));
    Object v3 = null;
    Object v4 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v2),((com.google.javascript.rhino.jstype.ObjectType)v3));
    Object v5 = 1;
    Object v6 = "H";
    Object v7 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v5).intValue()),((java.lang.String)v6));
    Object v8 = null;
    Object v9 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.jstype.ObjectType)v8));
    Object v10 = ((com.google.javascript.jscomp.Scope)v9).getVarCount();
    Object v11 = ((com.google.javascript.jscomp.Scope)v9).getArgumentsVar();
    Object v12 = ((com.google.javascript.jscomp.Scope)v4).getReferences(((com.google.javascript.jscomp.Scope.Var)v11));
    Object v13 = 1;
    Object v14 = "H";
    Object v15 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v13).intValue()),((java.lang.String)v14));
    Object v16 = null;
    Object v17 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v15),((com.google.javascript.rhino.jstype.ObjectType)v16));
    Object v18 = ((com.google.javascript.jscomp.Scope)v17).getGlobalScope();
    Object v19 = ((com.google.javascript.jscomp.Scope)v18).getArgumentsVar();
    Object v20 = ((com.google.javascript.jscomp.Scope)v4).getScope(((com.google.javascript.jscomp.Scope.Var)v19));
    Object v21 = 1;
    Object v22 = "H";
    Object v23 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v21).intValue()),((java.lang.String)v22));
    Object v24 = null;
    Object v25 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v23),((com.google.javascript.rhino.jstype.ObjectType)v24));
    Object v26 = ((com.google.javascript.jscomp.Scope)v25).getGlobalScope();
    Object v27 = ((com.google.javascript.jscomp.Scope)v26).getArgumentsVar();
    ((com.google.javascript.jscomp.Scope)v20).undeclare(((com.google.javascript.jscomp.Scope.Var)v27));
    Object v28 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = 1;
    Object v1 = "H";
    Object v2 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1));
    Object v3 = null;
    Object v4 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v2),((com.google.javascript.rhino.jstype.ObjectType)v3));
    Object v5 = ((com.google.javascript.jscomp.Scope)v4).getGlobalScope();
    Object v6 = ((com.google.javascript.jscomp.Scope)v5).getArgumentsVar();
    Object v7 = 1;
    Object v8 = "H";
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8));
    Object v10 = new com.google.javascript.jscomp.Scope(((com.google.javascript.jscomp.Scope)v5),((com.google.javascript.rhino.Node)v9));
    Object v11 = "Q";
    Object v12 = true;
    Object v13 = ((com.google.javascript.jscomp.Scope)v10).isDeclared(((java.lang.String)v11),(((java.lang.Boolean)v12).booleanValue()));
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = 1;
    Object v1 = "H";
    Object v2 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1));
    Object v3 = null;
    Object v4 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v2),((com.google.javascript.rhino.jstype.ObjectType)v3));
    Object v5 = ((com.google.javascript.jscomp.Scope)v4).getGlobalScope();
    Object v6 = 1;
    Object v7 = "H";
    Object v8 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7));
    Object v9 = null;
    Object v10 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.jstype.ObjectType)v9));
    Object v11 = ((com.google.javascript.jscomp.Scope)v10).getRootNode();
    Object v12 = false;
    ((com.google.javascript.rhino.Node)v11).setOptionalArg((((java.lang.Boolean)v12).booleanValue()));
    Object v13 = null;
    Object v14 = new com.google.javascript.jscomp.Scope(((com.google.javascript.jscomp.Scope)v5),((com.google.javascript.rhino.Node)v11));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = 1;
    Object v1 = "H";
    Object v2 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1));
    Object v3 = null;
    Object v4 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v2),((com.google.javascript.rhino.jstype.ObjectType)v3));
    Object v5 = ((com.google.javascript.jscomp.Scope)v4).getGlobalScope();
    Object v6 = ((com.google.javascript.jscomp.Scope)v5).getArgumentsVar();
    Object v7 = 1;
    Object v8 = "H";
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8));
    Object v10 = new com.google.javascript.jscomp.Scope(((com.google.javascript.jscomp.Scope)v5),((com.google.javascript.rhino.Node)v9));
    Object v11 = "Function declaration";
    Object v12 = ((com.google.javascript.jscomp.Scope)v10).getSlot(((java.lang.String)v11));
    Object v13 = 1;
    Object v14 = "H";
    Object v15 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v13).intValue()),((java.lang.String)v14));
    Object v16 = null;
    Object v17 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v15),((com.google.javascript.rhino.jstype.ObjectType)v16));
    Object v18 = ((com.google.javascript.jscomp.Scope)v17).getRootNode();
    Object v19 = ((com.google.javascript.rhino.Node)v18).removeChildren();
    Object v20 = new com.google.javascript.jscomp.Scope(((com.google.javascript.jscomp.Scope)v10),((com.google.javascript.rhino.Node)v18));
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = 1;
    Object v1 = "H";
    Object v2 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1));
    Object v3 = null;
    Object v4 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v2),((com.google.javascript.rhino.jstype.ObjectType)v3));
    Object v5 = ((com.google.javascript.jscomp.Scope)v4).getGlobalScope();
    Object v6 = ((com.google.javascript.jscomp.Scope)v5).getArgumentsVar();
    Object v7 = 1;
    Object v8 = "H";
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8));
    Object v10 = new com.google.javascript.jscomp.Scope(((com.google.javascript.jscomp.Scope)v5),((com.google.javascript.rhino.Node)v9));
    Object v11 = ((com.google.javascript.jscomp.Scope)v10).getGlobalScope();
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = 1;
    Object v1 = "H";
    Object v2 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1));
    Object v3 = null;
    Object v4 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v2),((com.google.javascript.rhino.jstype.ObjectType)v3));
    Object v5 = ((com.google.javascript.jscomp.Scope)v4).getGlobalScope();
    Object v6 = "[";
    Object v7 = ((com.google.javascript.jscomp.Scope)v5).getOwnSlot(((java.lang.String)v6));
    Object v8 = "";
    Object v9 = false;
    Object v10 = ((com.google.javascript.jscomp.Scope)v5).isDeclared(((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = 1;
    Object v1 = "H";
    Object v2 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1));
    Object v3 = null;
    Object v4 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v2),((com.google.javascript.rhino.jstype.ObjectType)v3));
    Object v5 = ((com.google.javascript.jscomp.Scope)v4).getGlobalScope();
    Object v6 = 1;
    Object v7 = "H";
    Object v8 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7));
    Object v9 = new com.google.javascript.jscomp.Scope(((com.google.javascript.jscomp.Scope)v5),((com.google.javascript.rhino.Node)v8));
    Object v10 = ((com.google.javascript.jscomp.Scope)v9).getDeclarativelyUnboundVarsWithoutTypes();
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = 1;
    Object v1 = "H";
    Object v2 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1));
    Object v3 = null;
    Object v4 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v2),((com.google.javascript.rhino.jstype.ObjectType)v3));
    Object v5 = ((com.google.javascript.jscomp.Scope)v4).getGlobalScope();
    Object v6 = ((com.google.javascript.jscomp.Scope)v5).getArgumentsVar();
    Object v7 = 1;
    Object v8 = "H";
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8));
    Object v10 = new com.google.javascript.jscomp.Scope(((com.google.javascript.jscomp.Scope)v5),((com.google.javascript.rhino.Node)v9));
    Object v11 = ((com.google.javascript.jscomp.Scope)v10).getVarCount();
    Object v12 = ((com.google.javascript.jscomp.Scope)v10).isBottom();
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = 1;
    Object v1 = "H";
    Object v2 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1));
    Object v3 = null;
    Object v4 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v2),((com.google.javascript.rhino.jstype.ObjectType)v3));
    Object v5 = ((com.google.javascript.jscomp.Scope)v4).getGlobalScope();
    Object v6 = ((com.google.javascript.jscomp.Scope)v5).getArgumentsVar();
    Object v7 = 1;
    Object v8 = "H";
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8));
    Object v10 = new com.google.javascript.jscomp.Scope(((com.google.javascript.jscomp.Scope)v5),((com.google.javascript.rhino.Node)v9));
    Object v11 = ((com.google.javascript.jscomp.Scope)v10).getGlobalScope();
    Object v12 = ((com.google.javascript.jscomp.Scope)v11).isGlobal();
    org.junit.Assert.assertEquals((Object)(true), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = 1;
    Object v1 = "H";
    Object v2 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1));
    Object v3 = null;
    Object v4 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v2),((com.google.javascript.rhino.jstype.ObjectType)v3));
    Object v5 = ((com.google.javascript.jscomp.Scope)v4).getGlobalScope();
    Object v6 = 1;
    Object v7 = "H";
    Object v8 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7));
    Object v9 = new com.google.javascript.jscomp.Scope(((com.google.javascript.jscomp.Scope)v5),((com.google.javascript.rhino.Node)v8));
    Object v10 = ((com.google.javascript.jscomp.Scope)v9).getTypeOfThis();
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = 1;
    Object v1 = "H";
    Object v2 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1));
    Object v3 = null;
    Object v4 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v2),((com.google.javascript.rhino.jstype.ObjectType)v3));
    Object v5 = ((com.google.javascript.jscomp.Scope)v4).getGlobalScope();
    Object v6 = ((com.google.javascript.jscomp.Scope)v5).getGlobalScope();
    Object v7 = ((com.google.javascript.jscomp.Scope)v6).getArgumentsVar();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = 1;
    Object v1 = "H";
    Object v2 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1));
    Object v3 = null;
    Object v4 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v2),((com.google.javascript.rhino.jstype.ObjectType)v3));
    Object v5 = ((com.google.javascript.jscomp.Scope)v4).getGlobalScope();
    Object v6 = ((com.google.javascript.jscomp.Scope)v5).getGlobalScope();
    Object v7 = ((com.google.javascript.jscomp.Scope)v6).getGlobalScope();
    Object v8 = ((com.google.javascript.jscomp.Scope)v7).getGlobalScope();
    Object v9 = ((com.google.javascript.jscomp.Scope)v8).getGlobalScope();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = 1;
    Object v1 = "H";
    Object v2 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1));
    Object v3 = null;
    Object v4 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v2),((com.google.javascript.rhino.jstype.ObjectType)v3));
    Object v5 = ((com.google.javascript.jscomp.Scope)v4).getGlobalScope();
    Object v6 = ((com.google.javascript.jscomp.Scope)v5).getGlobalScope();
    Object v7 = ((com.google.javascript.jscomp.Scope)v6).getGlobalScope();
    Object v8 = 1;
    Object v9 = "H";
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v8).intValue()),((java.lang.String)v9));
    Object v11 = new com.google.javascript.jscomp.Scope(((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.rhino.Node)v10));
    Object v12 = ((com.google.javascript.jscomp.Scope)v11).getVars();
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = 1;
    Object v1 = "H";
    Object v2 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1));
    Object v3 = null;
    Object v4 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v2),((com.google.javascript.rhino.jstype.ObjectType)v3));
    Object v5 = ((com.google.javascript.jscomp.Scope)v4).getGlobalScope();
    Object v6 = ((com.google.javascript.jscomp.Scope)v5).getArgumentsVar();
    Object v7 = 1;
    Object v8 = "H";
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8));
    Object v10 = new com.google.javascript.jscomp.Scope(((com.google.javascript.jscomp.Scope)v5),((com.google.javascript.rhino.Node)v9));
    Object v11 = ((com.google.javascript.jscomp.Scope)v10).getGlobalScope();
    Object v12 = ((com.google.javascript.jscomp.Scope)v11).getGlobalScope();
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = 1;
    Object v1 = "H";
    Object v2 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1));
    Object v3 = null;
    Object v4 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v2),((com.google.javascript.rhino.jstype.ObjectType)v3));
    Object v5 = ((com.google.javascript.jscomp.Scope)v4).getGlobalScope();
    Object v6 = ((com.google.javascript.jscomp.Scope)v5).getGlobalScope();
    Object v7 = ((com.google.javascript.jscomp.Scope)v6).getGlobalScope();
    Object v8 = ((com.google.javascript.jscomp.Scope)v7).getGlobalScope();
    Object v9 = ((com.google.javascript.jscomp.Scope)v8).getGlobalScope();
    Object v10 = ">";
    Object v11 = ((com.google.javascript.jscomp.Scope)v9).getVar(((java.lang.String)v10));
    Object v12 = ((com.google.javascript.jscomp.Scope)v9).getGlobalScope();
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = 1;
    Object v1 = "H";
    Object v2 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1));
    Object v3 = null;
    Object v4 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v2),((com.google.javascript.rhino.jstype.ObjectType)v3));
    Object v5 = ((com.google.javascript.jscomp.Scope)v4).getGlobalScope();
    Object v6 = 1;
    Object v7 = "H";
    Object v8 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7));
    Object v9 = null;
    Object v10 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.jstype.ObjectType)v9));
    Object v11 = ((com.google.javascript.jscomp.Scope)v10).getRootNode();
    Object v12 = false;
    ((com.google.javascript.rhino.Node)v11).setOptionalArg((((java.lang.Boolean)v12).booleanValue()));
    Object v13 = null;
    Object v14 = new com.google.javascript.jscomp.Scope(((com.google.javascript.jscomp.Scope)v5),((com.google.javascript.rhino.Node)v11));
    Object v15 = ((com.google.javascript.jscomp.Scope)v14).getParent();
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = 1;
    Object v1 = "H";
    Object v2 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1));
    Object v3 = null;
    Object v4 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v2),((com.google.javascript.rhino.jstype.ObjectType)v3));
    Object v5 = ((com.google.javascript.jscomp.Scope)v4).getGlobalScope();
    Object v6 = ((com.google.javascript.jscomp.Scope)v5).getArgumentsVar();
    Object v7 = 1;
    Object v8 = "H";
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8));
    Object v10 = new com.google.javascript.jscomp.Scope(((com.google.javascript.jscomp.Scope)v5),((com.google.javascript.rhino.Node)v9));
    Object v11 = ((com.google.javascript.jscomp.Scope)v10).getGlobalScope();
    Object v12 = "";
    Object v13 = ((com.google.javascript.jscomp.Scope)v11).getSlot(((java.lang.String)v12));
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = 1;
    Object v1 = "H";
    Object v2 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1));
    Object v3 = null;
    Object v4 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v2),((com.google.javascript.rhino.jstype.ObjectType)v3));
    Object v5 = ((com.google.javascript.jscomp.Scope)v4).getGlobalScope();
    Object v6 = ((com.google.javascript.jscomp.Scope)v5).getGlobalScope();
    Object v7 = ((com.google.javascript.jscomp.Scope)v6).getGlobalScope();
    Object v8 = 1;
    Object v9 = "H";
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v8).intValue()),((java.lang.String)v9));
    Object v11 = new com.google.javascript.jscomp.Scope(((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.rhino.Node)v10));
    Object v12 = "prototy&pe";
    Object v13 = ((com.google.javascript.jscomp.Scope)v11).getVar(((java.lang.String)v12));
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = "H";
    Object v2 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1));
    Object v3 = null;
    Object v4 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v2),((com.google.javascript.rhino.jstype.ObjectType)v3));
    Object v5 = ((com.google.javascript.jscomp.Scope)v4).getGlobalScope();
    Object v6 = ((com.google.javascript.jscomp.Scope)v5).getArgumentsVar();
    Object v7 = 1;
    Object v8 = "H";
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8));
    Object v10 = new com.google.javascript.jscomp.Scope(((com.google.javascript.jscomp.Scope)v5),((com.google.javascript.rhino.Node)v9));
    Object v11 = ((com.google.javascript.jscomp.Scope)v10).getGlobalScope();
    Object v12 = ((com.google.javascript.jscomp.Scope)v11).getArgumentsVar();
    Object v13 = 1;
    Object v14 = "H";
    Object v15 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v13).intValue()),((java.lang.String)v14));
    Object v16 = null;
    Object v17 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v15),((com.google.javascript.rhino.jstype.ObjectType)v16));
    Object v18 = ((com.google.javascript.jscomp.Scope)v17).getGlobalScope();
    Object v19 = ((com.google.javascript.jscomp.Scope)v18).getGlobalScope();
    Object v20 = ((com.google.javascript.jscomp.Scope)v19).getArgumentsVar();
    ((com.google.javascript.jscomp.Scope)v11).undeclare(((com.google.javascript.jscomp.Scope.Var)v20));
    Object v21 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = 1;
    Object v1 = "H";
    Object v2 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1));
    Object v3 = null;
    Object v4 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v2),((com.google.javascript.rhino.jstype.ObjectType)v3));
    Object v5 = ((com.google.javascript.jscomp.Scope)v4).getGlobalScope();
    Object v6 = ((com.google.javascript.jscomp.Scope)v5).getGlobalScope();
    Object v7 = ((com.google.javascript.jscomp.Scope)v6).getGlobalScope();
    Object v8 = ((com.google.javascript.jscomp.Scope)v7).isLocal();
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = 1;
    Object v1 = "H";
    Object v2 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1));
    Object v3 = null;
    Object v4 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v2),((com.google.javascript.rhino.jstype.ObjectType)v3));
    Object v5 = ((com.google.javascript.jscomp.Scope)v4).getGlobalScope();
    Object v6 = ((com.google.javascript.jscomp.Scope)v5).getGlobalScope();
    Object v7 = ((com.google.javascript.jscomp.Scope)v6).isBottom();
    org.junit.Assert.assertEquals((Object)(true), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = 1;
    Object v1 = "H";
    Object v2 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1));
    Object v3 = null;
    Object v4 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v2),((com.google.javascript.rhino.jstype.ObjectType)v3));
    Object v5 = ((com.google.javascript.jscomp.Scope)v4).getGlobalScope();
    Object v6 = ((com.google.javascript.jscomp.Scope)v5).getGlobalScope();
    Object v7 = ((com.google.javascript.jscomp.Scope)v6).getGlobalScope();
    Object v8 = ((com.google.javascript.jscomp.Scope)v7).getGlobalScope();
    Object v9 = ((com.google.javascript.jscomp.Scope)v8).getGlobalScope();
    Object v10 = "";
    Object v11 = false;
    Object v12 = ((com.google.javascript.jscomp.Scope)v9).isDeclared(((java.lang.String)v10),(((java.lang.Boolean)v11).booleanValue()));
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = 1;
    Object v1 = "H";
    Object v2 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1));
    Object v3 = null;
    Object v4 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v2),((com.google.javascript.rhino.jstype.ObjectType)v3));
    Object v5 = ((com.google.javascript.jscomp.Scope)v4).getGlobalScope();
    Object v6 = ((com.google.javascript.jscomp.Scope)v5).getArgumentsVar();
    Object v7 = 1;
    Object v8 = "H";
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8));
    Object v10 = new com.google.javascript.jscomp.Scope(((com.google.javascript.jscomp.Scope)v5),((com.google.javascript.rhino.Node)v9));
    Object v11 = ((com.google.javascript.jscomp.Scope)v10).getGlobalScope();
    Object v12 = ((com.google.javascript.jscomp.Scope)v11).getGlobalScope();
    Object v13 = "R";
    Object v14 = ((com.google.javascript.jscomp.Scope)v12).getOwnSlot(((java.lang.String)v13));
    Object v15 = ((com.google.javascript.jscomp.Scope)v12).getArgumentsVar();
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = 1;
    Object v1 = "H";
    Object v2 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1));
    Object v3 = null;
    Object v4 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v2),((com.google.javascript.rhino.jstype.ObjectType)v3));
    Object v5 = ((com.google.javascript.jscomp.Scope)v4).getGlobalScope();
    Object v6 = ((com.google.javascript.jscomp.Scope)v5).getGlobalScope();
    Object v7 = ((com.google.javascript.jscomp.Scope)v6).getGlobalScope();
    Object v8 = ((com.google.javascript.jscomp.Scope)v7).getGlobalScope();
    Object v9 = ((com.google.javascript.jscomp.Scope)v8).getGlobalScope();
    Object v10 = ((com.google.javascript.jscomp.Scope)v9).isLocal();
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = 1;
    Object v1 = "H";
    Object v2 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1));
    Object v3 = null;
    Object v4 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v2),((com.google.javascript.rhino.jstype.ObjectType)v3));
    Object v5 = ((com.google.javascript.jscomp.Scope)v4).getGlobalScope();
    Object v6 = ((com.google.javascript.jscomp.Scope)v5).getArgumentsVar();
    Object v7 = 1;
    Object v8 = "H";
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8));
    Object v10 = new com.google.javascript.jscomp.Scope(((com.google.javascript.jscomp.Scope)v5),((com.google.javascript.rhino.Node)v9));
    Object v11 = ((com.google.javascript.jscomp.Scope)v10).getGlobalScope();
    Object v12 = "";
    Object v13 = false;
    Object v14 = ((com.google.javascript.jscomp.Scope)v11).isDeclared(((java.lang.String)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = ((com.google.javascript.jscomp.Scope)v11).isGlobal();
    org.junit.Assert.assertEquals((Object)(true), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = 1;
    Object v1 = "H";
    Object v2 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1));
    Object v3 = null;
    Object v4 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v2),((com.google.javascript.rhino.jstype.ObjectType)v3));
    Object v5 = ((com.google.javascript.jscomp.Scope)v4).getGlobalScope();
    Object v6 = ((com.google.javascript.jscomp.Scope)v5).getGlobalScope();
    Object v7 = ((com.google.javascript.jscomp.Scope)v6).getGlobalScope();
    Object v8 = ((com.google.javascript.jscomp.Scope)v7).getGlobalScope();
    Object v9 = ((com.google.javascript.jscomp.Scope)v8).getGlobalScope();
    Object v10 = "U";
    Object v11 = false;
    Object v12 = ((com.google.javascript.jscomp.Scope)v9).isDeclared(((java.lang.String)v10),(((java.lang.Boolean)v11).booleanValue()));
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = 1;
    Object v1 = "H";
    Object v2 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1));
    Object v3 = null;
    Object v4 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v2),((com.google.javascript.rhino.jstype.ObjectType)v3));
    Object v5 = ((com.google.javascript.jscomp.Scope)v4).getGlobalScope();
    Object v6 = ((com.google.javascript.jscomp.Scope)v5).getGlobalScope();
    Object v7 = ((com.google.javascript.jscomp.Scope)v6).getGlobalScope();
    Object v8 = ((com.google.javascript.jscomp.Scope)v7).getGlobalScope();
    Object v9 = ((com.google.javascript.jscomp.Scope)v8).getGlobalScope();
    Object v10 = ((com.google.javascript.jscomp.Scope)v9).getArgumentsVar();
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = 1;
    Object v1 = "H";
    Object v2 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1));
    Object v3 = null;
    Object v4 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v2),((com.google.javascript.rhino.jstype.ObjectType)v3));
    Object v5 = ((com.google.javascript.jscomp.Scope)v4).getGlobalScope();
    Object v6 = ((com.google.javascript.jscomp.Scope)v5).getArgumentsVar();
    Object v7 = 1;
    Object v8 = "H";
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8));
    Object v10 = new com.google.javascript.jscomp.Scope(((com.google.javascript.jscomp.Scope)v5),((com.google.javascript.rhino.Node)v9));
    Object v11 = ((com.google.javascript.jscomp.Scope)v10).getGlobalScope();
    Object v12 = ((com.google.javascript.jscomp.Scope)v11).getDepth();
    org.junit.Assert.assertEquals((Object)(0), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = 1;
    Object v1 = "H";
    Object v2 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1));
    Object v3 = null;
    Object v4 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v2),((com.google.javascript.rhino.jstype.ObjectType)v3));
    Object v5 = ((com.google.javascript.jscomp.Scope)v4).getGlobalScope();
    Object v6 = ((com.google.javascript.jscomp.Scope)v5).getGlobalScope();
    Object v7 = ((com.google.javascript.jscomp.Scope)v6).getGlobalScope();
    Object v8 = 1;
    Object v9 = "H";
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v8).intValue()),((java.lang.String)v9));
    Object v11 = new com.google.javascript.jscomp.Scope(((com.google.javascript.jscomp.Scope)v7),((com.google.javascript.rhino.Node)v10));
    Object v12 = "";
    Object v13 = true;
    Object v14 = ((com.google.javascript.jscomp.Scope)v11).isDeclared(((java.lang.String)v12),(((java.lang.Boolean)v13).booleanValue()));
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = 1;
    Object v1 = "H";
    Object v2 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1));
    Object v3 = null;
    Object v4 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v2),((com.google.javascript.rhino.jstype.ObjectType)v3));
    Object v5 = ((com.google.javascript.jscomp.Scope)v4).getGlobalScope();
    Object v6 = ((com.google.javascript.jscomp.Scope)v5).getGlobalScope();
    Object v7 = ((com.google.javascript.jscomp.Scope)v6).getGlobalScope();
    Object v8 = ((com.google.javascript.jscomp.Scope)v7).getGlobalScope();
    Object v9 = ((com.google.javascript.jscomp.Scope)v8).isLocal();
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = 1;
    Object v1 = "H";
    Object v2 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1));
    Object v3 = null;
    Object v4 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v2),((com.google.javascript.rhino.jstype.ObjectType)v3));
    Object v5 = ((com.google.javascript.jscomp.Scope)v4).getGlobalScope();
    Object v6 = ((com.google.javascript.jscomp.Scope)v5).getParentScope();
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = "H";
    Object v2 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1));
    Object v3 = null;
    Object v4 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v2),((com.google.javascript.rhino.jstype.ObjectType)v3));
    Object v5 = ((com.google.javascript.jscomp.Scope)v4).getGlobalScope();
    Object v6 = ((com.google.javascript.jscomp.Scope)v5).getGlobalScope();
    Object v7 = ((com.google.javascript.jscomp.Scope)v6).getGlobalScope();
    Object v8 = ((com.google.javascript.jscomp.Scope)v7).getGlobalScope();
    Object v9 = ((com.google.javascript.jscomp.Scope)v8).getGlobalScope();
    Object v10 = 1;
    Object v11 = "H";
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    Object v13 = null;
    Object v14 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v12),((com.google.javascript.rhino.jstype.ObjectType)v13));
    Object v15 = ((com.google.javascript.jscomp.Scope)v14).getVarCount();
    Object v16 = ((com.google.javascript.jscomp.Scope)v14).getArgumentsVar();
    ((com.google.javascript.jscomp.Scope)v9).undeclare(((com.google.javascript.jscomp.Scope.Var)v16));
    Object v17 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = 1;
    Object v1 = "H";
    Object v2 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1));
    Object v3 = null;
    Object v4 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v2),((com.google.javascript.rhino.jstype.ObjectType)v3));
    Object v5 = ((com.google.javascript.jscomp.Scope)v4).getGlobalScope();
    Object v6 = ((com.google.javascript.jscomp.Scope)v5).getArgumentsVar();
    Object v7 = 1;
    Object v8 = "H";
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8));
    Object v10 = new com.google.javascript.jscomp.Scope(((com.google.javascript.jscomp.Scope)v5),((com.google.javascript.rhino.Node)v9));
    Object v11 = ((com.google.javascript.jscomp.Scope)v10).getGlobalScope();
    Object v12 = ((com.google.javascript.jscomp.Scope)v11).getArgumentsVar();
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = 1;
    Object v1 = "H";
    Object v2 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1));
    Object v3 = null;
    Object v4 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v2),((com.google.javascript.rhino.jstype.ObjectType)v3));
    Object v5 = ((com.google.javascript.jscomp.Scope)v4).getGlobalScope();
    Object v6 = 1;
    Object v7 = "H";
    Object v8 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7));
    Object v9 = null;
    Object v10 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v8),((com.google.javascript.rhino.jstype.ObjectType)v9));
    Object v11 = ((com.google.javascript.jscomp.Scope)v10).getRootNode();
    Object v12 = false;
    ((com.google.javascript.rhino.Node)v11).setOptionalArg((((java.lang.Boolean)v12).booleanValue()));
    Object v13 = null;
    Object v14 = new com.google.javascript.jscomp.Scope(((com.google.javascript.jscomp.Scope)v5),((com.google.javascript.rhino.Node)v11));
    Object v15 = ((com.google.javascript.jscomp.Scope)v14).getAllSymbols();
    Object v16 = ((com.google.javascript.jscomp.Scope)v14).getArgumentsVar();
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = 1;
    Object v1 = "H";
    Object v2 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1));
    Object v3 = null;
    Object v4 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v2),((com.google.javascript.rhino.jstype.ObjectType)v3));
    Object v5 = ((com.google.javascript.jscomp.Scope)v4).getGlobalScope();
    Object v6 = ((com.google.javascript.jscomp.Scope)v5).getGlobalScope();
    Object v7 = ((com.google.javascript.jscomp.Scope)v6).getGlobalScope();
    Object v8 = ((com.google.javascript.jscomp.Scope)v7).getGlobalScope();
    Object v9 = ((com.google.javascript.jscomp.Scope)v8).getDeclarativelyUnboundVarsWithoutTypes();
    Object v10 = ((com.google.javascript.jscomp.Scope)v8).getVarIterable();
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = 1;
    Object v1 = "H";
    Object v2 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1));
    Object v3 = null;
    Object v4 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v2),((com.google.javascript.rhino.jstype.ObjectType)v3));
    Object v5 = ((com.google.javascript.jscomp.Scope)v4).getGlobalScope();
    Object v6 = ((com.google.javascript.jscomp.Scope)v5).getArgumentsVar();
    Object v7 = 1;
    Object v8 = "H";
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8));
    Object v10 = new com.google.javascript.jscomp.Scope(((com.google.javascript.jscomp.Scope)v5),((com.google.javascript.rhino.Node)v9));
    Object v11 = ((com.google.javascript.jscomp.Scope)v10).getGlobalScope();
    Object v12 = "\n";
    Object v13 = ((com.google.javascript.jscomp.Scope)v11).getVar(((java.lang.String)v12));
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = 1;
    Object v1 = "H";
    Object v2 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1));
    Object v3 = null;
    Object v4 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v2),((com.google.javascript.rhino.jstype.ObjectType)v3));
    Object v5 = ((com.google.javascript.jscomp.Scope)v4).getGlobalScope();
    Object v6 = ((com.google.javascript.jscomp.Scope)v5).getArgumentsVar();
    Object v7 = 1;
    Object v8 = "H";
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8));
    Object v10 = new com.google.javascript.jscomp.Scope(((com.google.javascript.jscomp.Scope)v5),((com.google.javascript.rhino.Node)v9));
    Object v11 = "  ";
    Object v12 = ((com.google.javascript.jscomp.Scope)v10).getOwnSlot(((java.lang.String)v11));
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = 1;
    Object v1 = "H";
    Object v2 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1));
    Object v3 = null;
    Object v4 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v2),((com.google.javascript.rhino.jstype.ObjectType)v3));
    Object v5 = ((com.google.javascript.jscomp.Scope)v4).getGlobalScope();
    Object v6 = ((com.google.javascript.jscomp.Scope)v5).getArgumentsVar();
    Object v7 = 1;
    Object v8 = "H";
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8));
    Object v10 = new com.google.javascript.jscomp.Scope(((com.google.javascript.jscomp.Scope)v5),((com.google.javascript.rhino.Node)v9));
    Object v11 = ((com.google.javascript.jscomp.Scope)v10).getGlobalScope();
    Object v12 = ((com.google.javascript.jscomp.Scope)v11).getGlobalScope();
    Object v13 = ((com.google.javascript.jscomp.Scope)v12).getArgumentsVar();
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = 1;
    Object v1 = "H";
    Object v2 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1));
    Object v3 = null;
    Object v4 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v2),((com.google.javascript.rhino.jstype.ObjectType)v3));
    Object v5 = ((com.google.javascript.jscomp.Scope)v4).getGlobalScope();
    Object v6 = ((com.google.javascript.jscomp.Scope)v5).getArgumentsVar();
    Object v7 = 1;
    Object v8 = "H";
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8));
    Object v10 = new com.google.javascript.jscomp.Scope(((com.google.javascript.jscomp.Scope)v5),((com.google.javascript.rhino.Node)v9));
    Object v11 = ((com.google.javascript.jscomp.Scope)v10).getGlobalScope();
    Object v12 = ((com.google.javascript.jscomp.Scope)v11).getAllSymbols();
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = 1;
    Object v1 = "H";
    Object v2 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1));
    Object v3 = null;
    Object v4 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v2),((com.google.javascript.rhino.jstype.ObjectType)v3));
    Object v5 = ((com.google.javascript.jscomp.Scope)v4).getGlobalScope();
    Object v6 = 1;
    Object v7 = "H";
    Object v8 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7));
    Object v9 = new com.google.javascript.jscomp.Scope(((com.google.javascript.jscomp.Scope)v5),((com.google.javascript.rhino.Node)v8));
    Object v10 = ((com.google.javascript.jscomp.Scope)v9).getGlobalScope();
    Object v11 = ((com.google.javascript.jscomp.Scope)v10).getVarIterable();
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = 1;
    Object v1 = "H";
    Object v2 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1));
    Object v3 = null;
    Object v4 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v2),((com.google.javascript.rhino.jstype.ObjectType)v3));
    Object v5 = ((com.google.javascript.jscomp.Scope)v4).getGlobalScope();
    Object v6 = 1;
    Object v7 = "H";
    Object v8 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7));
    Object v9 = new com.google.javascript.jscomp.Scope(((com.google.javascript.jscomp.Scope)v5),((com.google.javascript.rhino.Node)v8));
    Object v10 = "V.";
    Object v11 = ((com.google.javascript.jscomp.Scope)v9).getVar(((java.lang.String)v10));
    Object v12 = 1;
    Object v13 = "H";
    Object v14 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v12).intValue()),((java.lang.String)v13));
    Object v15 = new com.google.javascript.jscomp.Scope(((com.google.javascript.jscomp.Scope)v9),((com.google.javascript.rhino.Node)v14));
    Object v16 = "f";
    Object v17 = ((com.google.javascript.jscomp.Scope)v15).getVar(((java.lang.String)v16));
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = 1;
    Object v1 = "H";
    Object v2 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1));
    Object v3 = null;
    Object v4 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v2),((com.google.javascript.rhino.jstype.ObjectType)v3));
    Object v5 = ((com.google.javascript.jscomp.Scope)v4).getGlobalScope();
    Object v6 = ((com.google.javascript.jscomp.Scope)v5).getGlobalScope();
    Object v7 = ((com.google.javascript.jscomp.Scope)v6).getGlobalScope();
    Object v8 = ((com.google.javascript.jscomp.Scope)v7).getGlobalScope();
    Object v9 = ((com.google.javascript.jscomp.Scope)v8).getGlobalScope();
    Object v10 = ((com.google.javascript.jscomp.Scope)v9).getTypeOfThis();
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = 1;
    Object v1 = "H";
    Object v2 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1));
    Object v3 = null;
    Object v4 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v2),((com.google.javascript.rhino.jstype.ObjectType)v3));
    Object v5 = ((com.google.javascript.jscomp.Scope)v4).getGlobalScope();
    Object v6 = ((com.google.javascript.jscomp.Scope)v5).getArgumentsVar();
    Object v7 = 1;
    Object v8 = "H";
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v7).intValue()),((java.lang.String)v8));
    Object v10 = new com.google.javascript.jscomp.Scope(((com.google.javascript.jscomp.Scope)v5),((com.google.javascript.rhino.Node)v9));
    Object v11 = ((com.google.javascript.jscomp.Scope)v10).isLocal();
    org.junit.Assert.assertEquals((Object)(true), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = 1;
    Object v1 = "H";
    Object v2 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1));
    Object v3 = null;
    Object v4 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v2),((com.google.javascript.rhino.jstype.ObjectType)v3));
    Object v5 = ((com.google.javascript.jscomp.Scope)v4).getGlobalScope();
    Object v6 = ((com.google.javascript.jscomp.Scope)v5).getGlobalScope();
    Object v7 = ((com.google.javascript.jscomp.Scope)v6).getGlobalScope();
    Object v8 = ((com.google.javascript.jscomp.Scope)v7).getGlobalScope();
    Object v9 = ((com.google.javascript.jscomp.Scope)v8).getGlobalScope();
    Object v10 = ((com.google.javascript.jscomp.Scope)v9).getAllSymbols();
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = 1;
    Object v1 = "H";
    Object v2 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1));
    Object v3 = null;
    Object v4 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v2),((com.google.javascript.rhino.jstype.ObjectType)v3));
    Object v5 = ((com.google.javascript.jscomp.Scope)v4).getGlobalScope();
    Object v6 = ((com.google.javascript.jscomp.Scope)v5).getVarCount();
    Object v7 = "";
    Object v8 = false;
    Object v9 = ((com.google.javascript.jscomp.Scope)v5).isDeclared(((java.lang.String)v7),(((java.lang.Boolean)v8).booleanValue()));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = 1;
    Object v1 = "H";
    Object v2 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1));
    Object v3 = null;
    Object v4 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v2),((com.google.javascript.rhino.jstype.ObjectType)v3));
    Object v5 = ((com.google.javascript.jscomp.Scope)v4).getGlobalScope();
    Object v6 = ((com.google.javascript.jscomp.Scope)v5).getGlobalScope();
    Object v7 = ((com.google.javascript.jscomp.Scope)v6).getGlobalScope();
    Object v8 = ((com.google.javascript.jscomp.Scope)v7).getGlobalScope();
    Object v9 = ((com.google.javascript.jscomp.Scope)v8).getGlobalScope();
    Object v10 = "P";
    Object v11 = false;
    Object v12 = ((com.google.javascript.jscomp.Scope)v9).isDeclared(((java.lang.String)v10),(((java.lang.Boolean)v11).booleanValue()));
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = 1;
    Object v1 = "H";
    Object v2 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1));
    Object v3 = null;
    Object v4 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v2),((com.google.javascript.rhino.jstype.ObjectType)v3));
    Object v5 = ((com.google.javascript.jscomp.Scope)v4).getGlobalScope();
    Object v6 = ((com.google.javascript.jscomp.Scope)v5).getGlobalScope();
    Object v7 = ((com.google.javascript.jscomp.Scope)v6).getGlobalScope();
    Object v8 = ((com.google.javascript.jscomp.Scope)v7).getGlobalScope();
    Object v9 = "";
    Object v10 = false;
    Object v11 = ((com.google.javascript.jscomp.Scope)v8).isDeclared(((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()));
    org.junit.Assert.assertEquals((Object)(false), v11);
  }
}
